package com.efs.sdk.p192pa.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.efs.sdk.base.newsharedpreferences.SharedPreferencesUtils;
import com.efs.sdk.base.observer.IConfigCallback;
import java.util.Map;
import java.util.Random;

/* renamed from: com.efs.sdk.pa.config.ConfigManager */
public class ConfigManager {
    private static final int A_DAY = 86400000;
    public static final String FLAG_PA_CHECK_IN_STATE = "8f2f54c08600aa25915617fa1371441b";
    public static final String FLAG_PA_FORE_CHECK_TIME = "03f870871950c148387b251894ed3e88";
    private static final int MAX_ANR_STATS_COUNT = 50;
    private static final int MAX_ANR_TRACE_RATE = 100;
    private static final String MODEL_SP = "paconfig";
    public static final String PA_LEVEL = "pa_level";
    private static final String STATS_ANR_LOG_COUNT = "apm_anr_count";
    private final String APM_PATRACE_SWITCH_RATE_CURRENT = "apm_patrace_switch_rate";
    private final String APM_PATRACE_SWITCH_RATE_LAST = "apm_patrace_switch_rate_last";
    private final int DEF_CLOSE_RATE;
    private final String TAG = "WpkPaConfig";
    private boolean mCheckIn;
    private int mCurrentRate;
    private IEfsReporter mEfsReporter;
    private int mLastRate;
    private PackageLevel mPackageLevel;
    private SharedPreferences mSharedPreferences;

    public ConfigManager(Context context, PackageLevel packageLevel, IEfsReporter iEfsReporter, boolean z) {
        boolean z2 = false;
        this.DEF_CLOSE_RATE = 0;
        this.mCheckIn = false;
        this.mPackageLevel = packageLevel;
        this.mEfsReporter = iEfsReporter;
        this.mSharedPreferences = SharedPreferencesUtils.getSharedPreferences(context, MODEL_SP);
        initRate();
        if (z) {
            resetUploadSmoothLogCnt();
            z2 = enableAnrTracer();
        } else if (isCountEnable() && enableAnrTracer()) {
            z2 = true;
        }
        this.mCheckIn = z2;
        resetRate();
    }

    private boolean checkIn(boolean z, Long l, boolean z2, int i) {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        Long valueOf2 = Long.valueOf(valueOf.longValue() - l.longValue());
        boolean z3 = true;
        String str = "WpkPaConfig";
        if (!z2 || valueOf2.longValue() >= 86400000 || z) {
            boolean z4 = false;
            if (valueOf2.longValue() >= 86400000 || z) {
                if (random(i)) {
                    Log.d(str, "random check in");
                } else {
                    Log.d(str, "random not check in!");
                    z3 = false;
                }
                putBooleanValue(FLAG_PA_CHECK_IN_STATE, z3);
                putLongValue(FLAG_PA_FORE_CHECK_TIME, valueOf.longValue());
                z4 = z3;
            } else {
                Log.d(str, "un repeat check in 24 hour!");
            }
            return z4;
        }
        Log.d(str, " check in allready");
        return true;
    }

    private boolean enableAnrTracer() {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        String str = FLAG_PA_FORE_CHECK_TIME;
        long j = sharedPreferences.getLong(str, 0);
        SharedPreferences sharedPreferences2 = this.mSharedPreferences;
        String str2 = FLAG_PA_CHECK_IN_STATE;
        boolean z = false;
        boolean z2 = sharedPreferences2.getBoolean(str2, false);
        int i = this.mCurrentRate;
        if (i == 0) {
            if (z2) {
                putBooleanValue(str2, false);
            }
            if (j != 0) {
                putLongValue(str, 0);
            }
            return false;
        }
        if (i != this.mLastRate) {
            z = true;
        }
        return checkIn(z, Long.valueOf(j), z2, this.mCurrentRate);
    }

    private int getCurrentConfigRate() {
        String str = "apm_patrace_switch_rate";
        int i = this.mSharedPreferences.getInt(str, -1);
        this.mEfsReporter.getReporter().getAllSdkConfig(new String[]{str}, new IConfigCallback() {
            public final void onChange(Map<String, Object> map) {
                String str = "apm_patrace_switch_rate";
                Object obj = map.get(str);
                if (obj != null) {
                    try {
                        ConfigManager.this.putIntValue(str, Integer.parseInt(obj.toString()));
                    } catch (Throwable unused) {
                    }
                }
            }
        });
        return i;
    }

    private void initRate() {
        this.mLastRate = this.mSharedPreferences.getInt("apm_patrace_switch_rate_last", 0);
        int currentConfigRate = getCurrentConfigRate();
        if (currentConfigRate != -1) {
            this.mCurrentRate = currentConfigRate;
        } else if (this.mPackageLevel == PackageLevel.TRIAL) {
            this.mCurrentRate = 100;
        } else {
            this.mCurrentRate = 0;
        }
    }

    private boolean isCountEnable() {
        return this.mSharedPreferences.getLong(STATS_ANR_LOG_COUNT, 0) <= 50;
    }

    private void putBooleanValue(String str, boolean z) {
        Editor edit = this.mSharedPreferences.edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    /* access modifiers changed from: private */
    public void putIntValue(String str, int i) {
        Editor edit = this.mSharedPreferences.edit();
        edit.putInt(str, i);
        edit.apply();
    }

    private void putLongValue(String str, long j) {
        Editor edit = this.mSharedPreferences.edit();
        edit.putLong(str, j);
        edit.apply();
    }

    private boolean random(int i) {
        if (i == 0) {
            return false;
        }
        return i == 100 || new Random().nextInt(100) <= i;
    }

    private void resetRate() {
        putIntValue("apm_patrace_switch_rate_last", this.mCurrentRate);
    }

    private void resetUploadSmoothLogCnt() {
        putLongValue(STATS_ANR_LOG_COUNT, 0);
    }

    public boolean enableTracer() {
        return this.mCheckIn;
    }

    public void increaseUploadSmoothLogCnt() {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        String str = STATS_ANR_LOG_COUNT;
        putLongValue(str, sharedPreferences.getLong(str, 0) + 1);
    }
}
