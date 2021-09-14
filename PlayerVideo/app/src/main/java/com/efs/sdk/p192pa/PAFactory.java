package com.efs.sdk.p192pa;

import android.content.Context;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.p192pa.config.ConfigManager;
import com.efs.sdk.p192pa.config.IEfsReporter;
import com.efs.sdk.p192pa.config.PackageLevel;
import com.efs.sdk.p192pa.p193a.C1758c;
import java.util.HashMap;

/* renamed from: com.efs.sdk.pa.PAFactory */
public class PAFactory {
    private static final long DEFAULT_TIME_OUT_TIME = 2000;
    private static final long INVALID_TIME_OUT_TIME = 0;
    private static final long MAX_TIME_OUT_TIME = 4000;
    private static final String TAG = "pafactory";
    static final ThreadLocal<C1749PA> sThreadLocal = new ThreadLocal<>();
    private ConfigManager mConfigManager;
    private Context mContext;
    private HashMap<String, String> mExtend;
    private EfsReporter mReporter;
    private IEfsReporter mReporterFactory;
    private String mSerial;
    private String mSver;
    private long mTimeOutTime;
    private PATraceListener mTraceListener;

    /* renamed from: com.efs.sdk.pa.PAFactory$Builder */
    public static class Builder {

        /* renamed from: a */
        private PackageLevel f11440a;

        /* renamed from: b */
        private IEfsReporter f11441b;

        /* renamed from: c */
        private boolean f11442c;

        /* renamed from: d */
        private Context f11443d;

        /* renamed from: e */
        private String f11444e;

        /* renamed from: f */
        private HashMap<String, String> f11445f;

        /* renamed from: g */
        private String f11446g;

        /* renamed from: h */
        private long f11447h = PAFactory.DEFAULT_TIME_OUT_TIME;

        /* renamed from: i */
        private PATraceListener f11448i;

        public Builder(Context context, IEfsReporter iEfsReporter) {
            if (context == null) {
                throw new RuntimeException("context Should Not null");
            } else if (iEfsReporter != null) {
                this.f11441b = iEfsReporter;
                this.f11443d = context;
            } else {
                throw new RuntimeException("reporter Should Not Empty");
            }
        }

        public PAFactory build() {
            if (this.f11440a != null) {
                PAFactory pAFactory = new PAFactory(this.f11443d, this.f11440a, this.f11441b, this.f11442c, this.f11444e, this.f11445f, this.f11446g, this.f11447h, this.f11448i);
                return pAFactory;
            }
            throw new RuntimeException(String.format("%s Should Not Null", new Object[]{""}));
        }

        public Builder extendLogInfo(HashMap<String, String> hashMap) {
            this.f11445f = hashMap;
            return this;
        }

        public Builder isNewInstall(boolean z) {
            this.f11442c = z;
            return this;
        }

        public Builder packageLevel(PackageLevel packageLevel) {
            this.f11440a = packageLevel;
            return this;
        }

        public Builder serial(String str) {
            this.f11444e = str;
            return this;
        }

        public Builder sver(String str) {
            this.f11446g = str;
            return this;
        }

        public Builder timeoutTime(long j) {
            String str = PAFactory.TAG;
            if (j <= PAFactory.INVALID_TIME_OUT_TIME) {
                Log.w(str, "Timeout time is invalid, and the default value 2s will be used");
                this.f11447h = PAFactory.DEFAULT_TIME_OUT_TIME;
            } else if (j > PAFactory.MAX_TIME_OUT_TIME) {
                Log.w(str, "Timeout time over 4s is not recommended, and the default value 2s will be used");
                this.f11447h = PAFactory.DEFAULT_TIME_OUT_TIME;
                return this;
            } else {
                this.f11447h = j;
            }
            return this;
        }

        public Builder traceListener(PATraceListener pATraceListener) {
            this.f11448i = pATraceListener;
            return this;
        }
    }

    public ConfigManager getConfigManager() {
        return this.mConfigManager;
    }

    public HashMap<String, String> getExtend() {
        return this.mExtend;
    }

    public synchronized C1749PA getPaInstance() {
        C1749PA pa;
        ThreadLocal<C1749PA> threadLocal = sThreadLocal;
        pa = (C1749PA) threadLocal.get();
        if (pa == null) {
            pa = new C1758c(this.mConfigManager.enableTracer());
            pa.registerPAANRListener(this.mContext, new C1751a(this), this.mTimeOutTime);
            threadLocal.set(pa);
        }
        return pa;
    }

    public EfsReporter getReporter() {
        if (this.mReporter == null) {
            IEfsReporter iEfsReporter = this.mReporterFactory;
            this.mReporter = iEfsReporter != null ? iEfsReporter.getReporter() : null;
        }
        return this.mReporter;
    }

    public String getSerial() {
        return this.mSerial;
    }

    public String getSver() {
        return this.mSver;
    }

    public PATraceListener getTraceListener() {
        return this.mTraceListener;
    }

    private PAFactory(Context context, PackageLevel packageLevel, IEfsReporter iEfsReporter, boolean z, String str, HashMap<String, String> hashMap, String str2, long j, PATraceListener pATraceListener) {
        this.mReporterFactory = iEfsReporter;
        this.mSerial = str;
        this.mExtend = hashMap;
        this.mSver = str2;
        this.mContext = context;
        this.mTraceListener = pATraceListener;
        this.mTimeOutTime = j;
        this.mConfigManager = new ConfigManager(context, packageLevel, iEfsReporter, z);
    }
}
