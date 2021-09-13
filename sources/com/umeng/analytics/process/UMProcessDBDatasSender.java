package com.umeng.analytics.process;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.InternalConfig;
import com.umeng.analytics.pro.CoreProtocolImpl.C3151c;
import com.umeng.analytics.pro.DefconProcesser;
import com.umeng.analytics.pro.UContent;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class UMProcessDBDatasSender implements UMLogDataProtocol {
    public static final int UM_PROCESS_CONSTRUCTMESSAGE = 36946;
    public static final int UM_PROCESS_EVENT_KEY = 36945;
    private static ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);
    private static UMProcessDBDatasSender mInstance;
    /* access modifiers changed from: private */
    public Context mContext;
    private List<Integer> mGeneralBodyIds;
    private FileLockUtil mLockUtil = new FileLockUtil();
    private C3151c mPolicySelector;

    private class ConstructMessageCallback implements FileLockCallback {
        private ConstructMessageCallback() {
        }

        public boolean onFileLock(File file, int i) {
            return false;
        }

        public boolean onFileLock(String str) {
            UMProcessDBDatasSender uMProcessDBDatasSender = UMProcessDBDatasSender.this;
            JSONObject jSONObject = uMProcessDBDatasSender.setupReportData(UMEnvelopeBuild.maxDataSpace(uMProcessDBDatasSender.mContext));
            if (jSONObject != null && jSONObject.length() >= 1) {
                JSONObject jSONObject2 = (JSONObject) jSONObject.opt("header");
                JSONObject jSONObject3 = (JSONObject) jSONObject.opt("content");
                if (!(UMProcessDBDatasSender.this.mContext == null || jSONObject2 == null || jSONObject3 == null)) {
                    JSONObject buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(UMProcessDBDatasSender.this.mContext, jSONObject2, jSONObject3);
                    if (buildEnvelopeWithExtHeader != null) {
                        UMProcessDBDatasSender.this.removeCacheData(buildEnvelopeWithExtHeader);
                    }
                }
            }
            return true;
        }

        public boolean onFileLock(String str, Object obj) {
            return false;
        }
    }

    private class ReplaceCallback implements FileLockCallback {
        private ReplaceCallback() {
        }

        public boolean onFileLock(File file, int i) {
            return false;
        }

        public boolean onFileLock(String str) {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            String str2 = DBConstant.f17289c;
            String str3 = "";
            if (str.startsWith(str2)) {
                str = str.replaceFirst(str2, str3);
            }
            UMProcessDBHelper.getInstance(UMProcessDBDatasSender.this.mContext).deleteEventDatas(str.replace(DBConstant.f17290d, str3), null, null);
            return true;
        }

        public boolean onFileLock(String str, Object obj) {
            return false;
        }
    }

    private UMProcessDBDatasSender() {
    }

    private void constructMessage() {
        if (defconProcesserHandler() == 0) {
            this.mLockUtil.doFileOperateion(UMProcessDBCreater.m22161b(this.mContext, ""), (FileLockCallback) new ConstructMessageCallback());
        }
    }

    private int defconProcesserHandler() {
        int a = DefconProcesser.m22072a().mo19161a(this.mContext);
        if (a != 0) {
            try {
                DBFileTraversalUtil.traverseDBFiles(UMProcessDBCreater.m22159a(this.mContext), new ReplaceCallback(), null);
            } catch (Exception unused) {
            }
            UMProcessDBHelper.getInstance(this.mContext).deleteEventDatas(DBConstant.f17294h, null, null);
        }
        return a;
    }

    private JSONObject generalBody() {
        String str = "userlevel";
        JSONObject jSONObject = null;
        try {
            if (this.mGeneralBodyIds == null) {
                this.mGeneralBodyIds = new ArrayList();
            }
            jSONObject = UMProcessDBHelper.getInstance(this.mContext).readMainEvents(UMEnvelopeBuild.maxDataSpace(this.mContext) - 2000, this.mGeneralBodyIds);
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(this.mContext);
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString(str, "");
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put(str, string);
                }
            }
            String[] a = InternalConfig.m21471a(this.mContext);
            if (a != null && !TextUtils.isEmpty(a[0]) && !TextUtils.isEmpty(a[1])) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(UContent.f16878M, a[0]);
                jSONObject2.put(UContent.f16879N, a[1]);
                if (jSONObject2.length() > 0) {
                    jSONObject.put(UContent.f16877L, jSONObject2);
                }
            }
            if (ABTest.getService(this.mContext).isInTest()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(ABTest.getService(this.mContext).getTestName(), ABTest.getService(this.mContext).getGroupInfo());
                jSONObject.put(UContent.f16876K, jSONObject3);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0081 A[SYNTHETIC, Splitter:B:28:0x0081] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0096 A[SYNTHETIC, Splitter:B:34:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a0 A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b3 A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e6 A[Catch:{ all -> 0x0113 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject generalHeader() {
        /*
            r8 = this;
            java.lang.String r0 = "$ud_da"
            java.lang.String r1 = "$pr_ve"
            java.lang.String r2 = "pr_ve"
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = com.umeng.analytics.AnalyticsConfig.mWrapperType     // Catch:{ all -> 0x0113 }
            if (r4 == 0) goto L_0x001f
            java.lang.String r4 = com.umeng.analytics.AnalyticsConfig.mWrapperVersion     // Catch:{ all -> 0x0113 }
            if (r4 == 0) goto L_0x001f
            java.lang.String r5 = "wrapper_version"
            r3.put(r5, r4)     // Catch:{ all -> 0x0113 }
            java.lang.String r4 = "wrapper_type"
            java.lang.String r5 = com.umeng.analytics.AnalyticsConfig.mWrapperType     // Catch:{ all -> 0x0113 }
            r3.put(r4, r5)     // Catch:{ all -> 0x0113 }
        L_0x001f:
            android.content.Context r4 = r8.mContext     // Catch:{ all -> 0x0113 }
            int r4 = com.umeng.analytics.AnalyticsConfig.getVerticalType(r4)     // Catch:{ all -> 0x0113 }
            java.lang.String r5 = "vertical_type"
            r3.put(r5, r4)     // Catch:{ all -> 0x0113 }
            android.content.Context r4 = r8.mContext     // Catch:{ all -> 0x0113 }
            int r4 = com.umeng.analytics.AnalyticsConfig.getVerticalType(r4)     // Catch:{ all -> 0x0113 }
            r5 = 1
            java.lang.String r6 = "9.3.8"
            java.lang.String r7 = "sdk_version"
            if (r4 != r5) goto L_0x0049
            android.content.Context r4 = r8.mContext     // Catch:{ all -> 0x0113 }
            java.lang.String r4 = com.umeng.analytics.AnalyticsConfig.getGameSdkVersion(r4)     // Catch:{ all -> 0x0113 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0113 }
            if (r5 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r6 = r4
        L_0x0045:
            r3.put(r7, r6)     // Catch:{ all -> 0x0113 }
            goto L_0x004c
        L_0x0049:
            r3.put(r7, r6)     // Catch:{ all -> 0x0113 }
        L_0x004c:
            java.util.List<java.lang.Integer> r4 = r8.mGeneralBodyIds     // Catch:{ all -> 0x0113 }
            int r4 = r4.size()     // Catch:{ all -> 0x0113 }
            java.lang.String r5 = ""
            if (r4 <= 0) goto L_0x0078
            android.content.Context r4 = r8.mContext     // Catch:{ all -> 0x0113 }
            com.umeng.analytics.process.UMProcessDBHelper r4 = com.umeng.analytics.process.UMProcessDBHelper.getInstance(r4)     // Catch:{ all -> 0x0113 }
            java.util.List<java.lang.Integer> r6 = r8.mGeneralBodyIds     // Catch:{ all -> 0x0113 }
            r7 = 0
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x0113 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0113 }
            org.json.JSONObject r4 = r4.readVersionInfoFromColumId(r6)     // Catch:{ all -> 0x0113 }
            if (r4 == 0) goto L_0x0078
            java.lang.String r5 = "__av"
            java.lang.String r5 = r4.optString(r5)     // Catch:{ all -> 0x0113 }
            java.lang.String r6 = "__vc"
            java.lang.String r4 = r4.optString(r6)     // Catch:{ all -> 0x0113 }
            goto L_0x0079
        L_0x0078:
            r4 = r5
        L_0x0079:
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0113 }
            java.lang.String r7 = "app_version"
            if (r6 == 0) goto L_0x008b
            android.content.Context r5 = r8.mContext     // Catch:{ all -> 0x0113 }
            java.lang.String r5 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r5)     // Catch:{ all -> 0x0113 }
            r3.put(r7, r5)     // Catch:{ all -> 0x0113 }
            goto L_0x008e
        L_0x008b:
            r3.put(r7, r5)     // Catch:{ all -> 0x0113 }
        L_0x008e:
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0113 }
            java.lang.String r6 = "version_code"
            if (r5 == 0) goto L_0x00a0
            android.content.Context r4 = r8.mContext     // Catch:{ all -> 0x0113 }
            java.lang.String r4 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r4)     // Catch:{ all -> 0x0113 }
            r3.put(r6, r4)     // Catch:{ all -> 0x0113 }
            goto L_0x00a3
        L_0x00a0:
            r3.put(r6, r4)     // Catch:{ all -> 0x0113 }
        L_0x00a3:
            android.content.Context r4 = r8.mContext     // Catch:{ all -> 0x0113 }
            java.lang.String r4 = com.umeng.analytics.AnalyticsConfig.getSecretKey(r4)     // Catch:{ all -> 0x0113 }
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.HelperUtils.MD5(r4)     // Catch:{ all -> 0x0113 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0113 }
            if (r5 != 0) goto L_0x00b8
            java.lang.String r5 = "secret"
            r3.put(r5, r4)     // Catch:{ all -> 0x0113 }
        L_0x00b8:
            android.content.Context r4 = r8.mContext     // Catch:{ all -> 0x0113 }
            r5 = 0
            java.lang.String r4 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r4, r2, r5)     // Catch:{ all -> 0x0113 }
            android.content.Context r6 = r8.mContext     // Catch:{ all -> 0x0113 }
            android.content.SharedPreferences r6 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r6)     // Catch:{ all -> 0x0113 }
            android.content.Context r7 = r8.mContext     // Catch:{ all -> 0x0113 }
            java.lang.String r2 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r7, r2, r5)     // Catch:{ all -> 0x0113 }
            r3.put(r1, r2)     // Catch:{ all -> 0x0113 }
            android.content.Context r2 = r8.mContext     // Catch:{ all -> 0x0113 }
            java.lang.String r7 = "ud_da"
            java.lang.String r2 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r2, r7, r5)     // Catch:{ all -> 0x0113 }
            r3.put(r0, r2)     // Catch:{ all -> 0x0113 }
            java.lang.String r2 = "pro_ver"
            java.lang.String r5 = "1.0.0"
            r3.put(r2, r5)     // Catch:{ all -> 0x0113 }
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0113 }
            if (r2 == 0) goto L_0x0117
            java.lang.String r2 = "vers_pre_version"
            java.lang.String r4 = "0"
            java.lang.String r2 = r6.getString(r2, r4)     // Catch:{ all -> 0x0113 }
            r3.put(r1, r2)     // Catch:{ all -> 0x0113 }
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0113 }
            java.lang.String r2 = "yyyy-MM-dd"
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch:{ all -> 0x0113 }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x0113 }
            java.util.Date r2 = new java.util.Date     // Catch:{ all -> 0x0113 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0113 }
            r2.<init>(r4)     // Catch:{ all -> 0x0113 }
            java.lang.String r1 = r1.format(r2)     // Catch:{ all -> 0x0113 }
            java.lang.String r2 = "vers_date"
            java.lang.String r1 = r6.getString(r2, r1)     // Catch:{ all -> 0x0113 }
            r3.put(r0, r1)     // Catch:{ all -> 0x0113 }
            goto L_0x0117
        L_0x0113:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0117:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.process.UMProcessDBDatasSender.generalHeader():org.json.JSONObject");
    }

    public static UMProcessDBDatasSender getInstance(Context context) {
        if (mInstance == null) {
            synchronized (UMProcessDBDatasSender.class) {
                if (mInstance == null) {
                    mInstance = new UMProcessDBDatasSender();
                }
            }
        }
        UMProcessDBDatasSender uMProcessDBDatasSender = mInstance;
        uMProcessDBDatasSender.mContext = context;
        return uMProcessDBDatasSender;
    }

    public void removeCacheData(Object obj) {
        if (obj != null) {
            List<Integer> list = this.mGeneralBodyIds;
            if (list != null && list.size() != 0) {
                JSONObject jSONObject = (JSONObject) obj;
                String str = "analytics";
                if (jSONObject.has(str)) {
                    JSONObject optJSONObject = jSONObject.optJSONObject(str);
                    if (optJSONObject != null && optJSONObject.length() > 0 && optJSONObject.has("ekv")) {
                        UMProcessDBHelper.getInstance(this.mContext).deleteMainProcessEventDatasByIds(this.mGeneralBodyIds);
                        this.mGeneralBodyIds.clear();
                    }
                }
            }
        }
    }

    public JSONObject setupReportData(long j) {
        int a = DefconProcesser.m22072a().mo19161a(this.mContext);
        JSONObject generalBody = generalBody();
        if (generalBody.length() <= 0) {
            return null;
        }
        JSONObject generalHeader = generalHeader();
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            String str = "analytics";
            if (a == 3) {
                jSONObject2.put(str, new JSONObject());
            } else if (generalBody.length() > 0) {
                jSONObject2.put(str, generalBody);
            }
            if (generalHeader != null && generalHeader.length() > 0) {
                jSONObject.put("header", generalHeader);
            }
            if (jSONObject2.length() > 0) {
                if (jSONObject2.has(str)) {
                    JSONObject optJSONObject = jSONObject2.optJSONObject(str);
                    int length = optJSONObject.length();
                    String str2 = "userlevel";
                    String str3 = UContent.f16877L;
                    if (length == 1) {
                        if (optJSONObject.optJSONObject(str3) != null || !TextUtils.isEmpty(optJSONObject.optString(str2))) {
                            return null;
                        }
                    }
                    if (optJSONObject.length() == 2 && optJSONObject.optJSONObject(str3) != null && !TextUtils.isEmpty(optJSONObject.optString(str2))) {
                        return null;
                    }
                }
                jSONObject.put("content", jSONObject2);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public void workEvent(Object obj, int i) {
        if (UMUtils.isMainProgress(this.mContext)) {
            switch (i) {
                case UM_PROCESS_EVENT_KEY /*36945*/:
                    executor.schedule(new Runnable() {
                        public void run() {
                            UMRTLog.m22229i(UMRTLog.RTLOG_TAG, "--->>> call processDBToMain start.");
                            UMProcessDBHelper.getInstance(UMProcessDBDatasSender.this.mContext).processDBToMain();
                        }
                    }, 5, TimeUnit.SECONDS);
                    break;
                case UM_PROCESS_CONSTRUCTMESSAGE /*36946*/:
                    UMRTLog.m22229i(UMRTLog.RTLOG_TAG, "--->>> recv UM_PROCESS_CONSTRUCTMESSAGE msg.");
                    constructMessage();
                    break;
            }
        }
    }
}
