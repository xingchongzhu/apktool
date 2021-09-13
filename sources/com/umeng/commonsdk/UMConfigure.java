package com.umeng.commonsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.umeng.analytics.pro.AutoViewPageTracker;
import com.umeng.analytics.pro.Constants;
import com.umeng.analytics.pro.OpenDeviceId;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.listener.OnGetOaidListener;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.stateless.UMSLConfig;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.BusinessWrapperConfig;
import com.umeng.commonsdk.statistics.EnvelopeManager;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UMConfigure {
    public static final int DEVICE_TYPE_BOX = 2;
    public static final int DEVICE_TYPE_PHONE = 1;
    private static final String KEY_FILE_NAME_APPKEY = "APPKEY";
    private static final String KEY_FILE_NAME_LOG = "LOG";
    private static final String KEY_METHOD_NAME_PUSH_SETCHANNEL = "setMessageChannel";
    private static final String KEY_METHOD_NAME_PUSH_SET_SECRET = "setSecret";
    private static final String KEY_METHOD_NAME_SETAPPKEY = "setAppkey";
    private static final String KEY_METHOD_NAME_SETCHANNEL = "setChannel";
    private static final String KEY_METHOD_NAME_SETDEBUGMODE = "setDebugMode";
    private static Object PreInitLock = new Object();
    private static final String TAG = "UMConfigure";
    private static final String WRAPER_TYPE_COCOS2DX_X = "Cocos2d-x";
    private static final String WRAPER_TYPE_COCOS2DX_XLUA = "Cocos2d-x_lua";
    private static final String WRAPER_TYPE_FLUTTER = "flutter";
    private static final String WRAPER_TYPE_HYBRID = "hybrid";
    private static final String WRAPER_TYPE_NATIVE = "native";
    private static final String WRAPER_TYPE_PHONEGAP = "phonegap";
    private static final String WRAPER_TYPE_REACTNATIVE = "react-native";
    private static final String WRAPER_TYPE_UNITY = "Unity";
    private static final String WRAPER_TYPE_WEEX = "weex";
    private static boolean debugLog = false;
    private static boolean isFinish = false;
    public static boolean isInit = false;
    private static Object lockObject = new Object();
    /* access modifiers changed from: private */
    public static OnGetOaidListener mOnGetOaidListener;
    private static boolean preInitComplete = false;
    public static String sAppkey;
    public static String sChannel;
    public static UMLog umDebugLog = new UMLog();

    static {
        String str = "";
        sAppkey = str;
        sChannel = str;
    }

    private static boolean checkShareSdk(Class<?> cls) {
        try {
            return cls.getDeclaredField("isZyb") != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Class<?> getClass(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static Object getDecInstanceObject(Class<?> cls) {
        Constructor constructor;
        if (cls == null) {
            return null;
        }
        try {
            constructor = cls.getDeclaredConstructor(new Class[0]);
        } catch (NoSuchMethodException unused) {
            constructor = null;
        }
        if (constructor == null) {
            return null;
        }
        constructor.setAccessible(true);
        try {
            return constructor.newInstance(new Object[0]);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused2) {
            return null;
        }
    }

    private static Method getDecMethod(Class<?> cls, String str, Class<?>[] clsArr) {
        Method method = null;
        if (cls != null) {
            try {
                method = cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
            }
            if (method != null) {
                method.setAccessible(true);
            }
        }
        return method;
    }

    public static boolean getInitStatus() {
        boolean z;
        synchronized (lockObject) {
            z = isFinish;
        }
        return z;
    }

    public static void getOaid(Context context, OnGetOaidListener onGetOaidListener) {
        if (context == null) {
            if (debugLog) {
                Log.e(TAG, "context is null !!!");
            }
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        mOnGetOaidListener = onGetOaidListener;
        new Thread(new Runnable() {
            public void run() {
                String a = OpenDeviceId.m22153a(applicationContext);
                if (UMConfigure.mOnGetOaidListener != null) {
                    UMConfigure.mOnGetOaidListener.onGetOaid(a);
                }
            }
        }).start();
    }

    public static String[] getTestDeviceInfo(Context context) {
        String[] strArr = new String[2];
        if (context != null) {
            try {
                strArr[0] = DeviceConfig.getDeviceIdForGeneral(context);
                strArr[1] = DeviceConfig.getMac(context);
            } catch (Exception unused) {
            }
        }
        return strArr;
    }

    public static String getUMIDString(Context context) {
        if (context != null) {
            return UMUtils.getUMId(context.getApplicationContext());
        }
        return null;
    }

    public static String getUmengZID(Context context) {
        if (context != null) {
            return UMUtils.getZid(context.getApplicationContext());
        }
        return null;
    }

    public static void init(Context context, int i, String str) {
        init(context, null, null, i, str);
    }

    private static void invoke(Method method, Object obj, Object[] objArr) {
        if (method != null && obj != null) {
            try {
                method.invoke(obj, objArr);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public static boolean isDebugLog() {
        return debugLog;
    }

    private static boolean isPreInit() {
        boolean z;
        synchronized (PreInitLock) {
            z = preInitComplete;
        }
        return z;
    }

    public static boolean needSendZcfgEnv(Context context) {
        File filesDir = context.getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append(filesDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append(Constants.f16732l);
        return !new File(sb.toString()).exists();
    }

    public static void preInit(Context context, String str, String str2) {
        if (context == null) {
            if (debugLog) {
                Log.e(TAG, "preInit: context is null, pls check!");
            }
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (TextUtils.isEmpty(str)) {
            str = UMUtils.getAppkeyByXML(applicationContext);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = UMUtils.getChannelByXML(applicationContext);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "Unknown";
        }
        if (!TextUtils.isEmpty(str)) {
            sAppkey = str;
            sChannel = str2;
            UMGlobalContext.getInstance(applicationContext);
            AutoViewPageTracker.m21976a(applicationContext);
            if (!needSendZcfgEnv(applicationContext)) {
                FieldManager.m22199a().mo19240a(applicationContext);
            }
            synchronized (PreInitLock) {
                preInitComplete = true;
            }
        }
    }

    private static void setCheckDevice(boolean z) {
        AnalyticsConstants.CHECK_DEVICE = z;
    }

    public static void setEncryptEnabled(boolean z) {
        EnvelopeManager.m22428a(z);
    }

    private static void setFile(Class<?> cls, String str, String str2) {
        if (cls != null) {
            try {
                cls.getField(str).set(str, str2);
            } catch (Exception unused) {
            }
        }
    }

    private static void setLatencyWindow(long j) {
        BusinessWrapperConfig.f17645c = ((int) j) * 1000;
    }

    public static void setLogEnabled(boolean z) {
        String str = "set log enabled e is ";
        String str2 = TAG;
        try {
            debugLog = z;
            MLog.DEBUG = z;
            Class cls = getClass("com.umeng.message.PushAgent");
            Object decInstanceObject = getDecInstanceObject(cls);
            String str3 = KEY_METHOD_NAME_SETDEBUGMODE;
            Class cls2 = Boolean.TYPE;
            invoke(getDecMethod(cls, str3, new Class[]{cls2}), decInstanceObject, new Object[]{Boolean.valueOf(z)});
            setFile(getClass("com.umeng.socialize.Config"), "DEBUG", z);
            invoke(getDecMethod(getClass("com.umeng.umcrash.UMCrash"), "setDebug", new Class[]{cls2}), new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            if (debugLog) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(e);
                Log.e(str2, sb.toString());
            }
        } catch (Throwable th) {
            if (debugLog) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(th);
                Log.e(str2, sb2.toString());
            }
        }
    }

    public static void setProcessEvent(boolean z) {
        AnalyticsConstants.SUB_PROCESS_EVENT = z;
    }

    private static void setWraperType(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            String str3 = WRAPER_TYPE_NATIVE;
            if (str.equals(str3)) {
                UMSLConfig.f17610a = str3;
                BusinessWrapperConfig.f17643a = str3;
            } else {
                String str4 = WRAPER_TYPE_COCOS2DX_X;
                if (str.equals(str4)) {
                    UMSLConfig.f17610a = str4;
                    BusinessWrapperConfig.f17643a = str4;
                } else {
                    String str5 = WRAPER_TYPE_COCOS2DX_XLUA;
                    if (str.equals(str5)) {
                        UMSLConfig.f17610a = str5;
                        BusinessWrapperConfig.f17643a = str5;
                    } else {
                        String str6 = WRAPER_TYPE_UNITY;
                        if (str.equals(str6)) {
                            UMSLConfig.f17610a = str6;
                            BusinessWrapperConfig.f17643a = str6;
                        } else {
                            String str7 = WRAPER_TYPE_REACTNATIVE;
                            if (str.equals(str7)) {
                                UMSLConfig.f17610a = str7;
                                BusinessWrapperConfig.f17643a = str7;
                            } else {
                                String str8 = WRAPER_TYPE_PHONEGAP;
                                if (str.equals(str8)) {
                                    UMSLConfig.f17610a = str8;
                                    BusinessWrapperConfig.f17643a = str8;
                                } else {
                                    String str9 = WRAPER_TYPE_WEEX;
                                    if (str.equals(str9)) {
                                        UMSLConfig.f17610a = str9;
                                        BusinessWrapperConfig.f17643a = str9;
                                    } else {
                                        String str10 = WRAPER_TYPE_HYBRID;
                                        if (str.equals(str10)) {
                                            UMSLConfig.f17610a = str10;
                                            BusinessWrapperConfig.f17643a = str10;
                                        } else {
                                            String str11 = WRAPER_TYPE_FLUTTER;
                                            if (str.equals(str11)) {
                                                UMSLConfig.f17610a = str11;
                                                BusinessWrapperConfig.f17643a = str11;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            UMSLConfig.f17611b = str2;
            BusinessWrapperConfig.f17644b = str2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(56:16|17|(3:18|19|(2:21|22))|23|(3:25|26|(1:30))|31|33|34|(1:38)|39|40|(2:42|(1:44))|45|(3:49|(1:53)|54)|55|(1:57)|58|(2:60|(1:66))|67|(1:69)|70|(7:71|72|(4:74|(1:76)(1:77)|78|(1:80))|81|(1:83)|84|(2:86|(1:88)))|89|91|92|(2:94|(6:96|(2:98|(1:100))|101|(2:103|(1:105))|106|(1:108)(4:109|(1:111)|112|(2:114|(1:116)))))|117|119|120|(2:122|(2:124|(1:126)))|127|128|129|(3:130|131|(2:133|(1:135)))|136|(5:138|139|(2:141|(1:143))|144|(2:146|(1:148)))|149|151|152|(1:154)|155|157|158|(1:160)|161|162|3a4|167|168|(1:170)(2:171|(1:173))|174|(1:176)|(3:190|191|(2:193|(2:195|(1:197))))|199|(1:201)|202) */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03ec, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03ef, code lost:
        if (debugLog != false) goto L_0x03f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03f1, code lost:
        r12 = TAG;
        r13 = new java.lang.StringBuilder();
        r13.append("init e is ");
        r13.append(r11);
        android.util.Log.e(r12, r13.toString());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:127:0x02bc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:161:0x03a2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x009b */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0293 A[Catch:{ all -> 0x02bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02d3 A[Catch:{ all -> 0x02e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02f2 A[Catch:{ all -> 0x033b }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x031e A[Catch:{ all -> 0x033b }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x035c A[Catch:{ ClassNotFoundException -> 0x037a }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0390 A[Catch:{ ClassNotFoundException -> 0x03a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03a5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03ae A[Catch:{ Exception -> 0x0408, all -> 0x03ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03c4 A[Catch:{ Exception -> 0x0408, all -> 0x03ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03e5 A[Catch:{ Exception -> 0x0408, all -> 0x03ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03ec A[ExcHandler: all (r11v6 'th' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:39:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a1 A[Catch:{ Exception -> 0x0408, all -> 0x03ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00df A[Catch:{ Exception -> 0x0408, all -> 0x03ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0104 A[Catch:{ Exception -> 0x0408, all -> 0x03ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x013e A[Catch:{ Exception -> 0x0408, all -> 0x03ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x016a A[Catch:{ all -> 0x01dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b0 A[Catch:{ all -> 0x01dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c4 A[Catch:{ all -> 0x01dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01f0 A[Catch:{ Exception -> 0x0284, all -> 0x03ec }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void init(android.content.Context r10, java.lang.String r11, java.lang.String r12, int r13, java.lang.String r14) {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = 0
            r2 = 1
            boolean r3 = debugLog     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            if (r3 == 0) goto L_0x0027
            java.lang.String r3 = "UMConfigure"
            java.lang.String r4 = "common version is 9.3.8"
            android.util.Log.i(r3, r4)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            java.lang.String r3 = "UMConfigure"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            r4.<init>()     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            java.lang.String r5 = "common type is "
            r4.append(r5)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            int r5 = com.umeng.commonsdk.statistics.SdkVersion.SDK_TYPE     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            r4.append(r5)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            android.util.Log.i(r3, r4)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
        L_0x0027:
            if (r10 != 0) goto L_0x0035
            boolean r11 = debugLog     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            if (r11 == 0) goto L_0x0034
            java.lang.String r11 = "UMConfigure"
            java.lang.String r12 = "context is null !!!"
            android.util.Log.e(r11, r12)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
        L_0x0034:
            return
        L_0x0035:
            boolean r3 = isInit     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            if (r3 == 0) goto L_0x0045
            boolean r11 = debugLog     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            if (r11 == 0) goto L_0x0044
            java.lang.String r11 = "UMConfigure"
            java.lang.String r12 = "has inited !!!"
            android.util.Log.e(r11, r12)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
        L_0x0044:
            return
        L_0x0045:
            android.content.Context r3 = r10.getApplicationContext()     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            java.lang.String r4 = "com.umeng.umzid.ZIDManager"
            java.lang.Class r4 = getClass(r4)     // Catch:{ all -> 0x0061 }
            if (r4 != 0) goto L_0x0061
            java.lang.String r4 = "UMConfigure"
            java.lang.String r5 = "--->>> SDK 初始化失败，请检查是否集成umeng-asms-1.2.x.aar库。<<<--- "
            android.util.Log.e(r4, r5)     // Catch:{ all -> 0x0061 }
            com.umeng.commonsdk.UMConfigure$1 r4 = new com.umeng.commonsdk.UMConfigure$1     // Catch:{ all -> 0x0061 }
            r4.<init>(r3)     // Catch:{ all -> 0x0061 }
            r4.start()     // Catch:{ all -> 0x0061 }
            return
        L_0x0061:
            java.lang.String r4 = "com.umeng.message.PushAgent"
            java.lang.Class r4 = getClass(r4)     // Catch:{ all -> 0x007e }
            if (r4 == 0) goto L_0x007e
            boolean r4 = checkShareSdk(r4)     // Catch:{ all -> 0x007e }
            if (r4 != 0) goto L_0x007e
            java.lang.String r4 = "UMLog"
            java.lang.String r5 = "基础组件库9.3.6版本仅支持6.2.0及更高版本推送SDK、7.1.0及更高版本分享SDK。"
            android.util.Log.e(r4, r5)     // Catch:{ all -> 0x007e }
            com.umeng.commonsdk.UMConfigure$2 r4 = new com.umeng.commonsdk.UMConfigure$2     // Catch:{ all -> 0x007e }
            r4.<init>(r3)     // Catch:{ all -> 0x007e }
            r4.start()     // Catch:{ all -> 0x007e }
        L_0x007e:
            java.lang.String r4 = "com.umeng.socialize.UMShareAPI"
            java.lang.Class r4 = getClass(r4)     // Catch:{ all -> 0x009b }
            if (r4 == 0) goto L_0x009b
            boolean r4 = checkShareSdk(r4)     // Catch:{ all -> 0x009b }
            if (r4 != 0) goto L_0x009b
            java.lang.String r4 = "UMLog"
            java.lang.String r5 = "基础组件库9.3.6版本仅支持6.2.0及更高版本推送SDK、7.1.0及更高版本分享SDK。"
            android.util.Log.e(r4, r5)     // Catch:{ all -> 0x009b }
            com.umeng.commonsdk.UMConfigure$3 r4 = new com.umeng.commonsdk.UMConfigure$3     // Catch:{ all -> 0x009b }
            r4.<init>(r3)     // Catch:{ all -> 0x009b }
            r4.start()     // Catch:{ all -> 0x009b }
        L_0x009b:
            boolean r4 = isPreInit()     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            if (r4 != 0) goto L_0x00ab
            preInit(r3, r11, r12)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            boolean r11 = isPreInit()     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            if (r11 != 0) goto L_0x00ab
            return
        L_0x00ab:
            java.lang.String r11 = sAppkey     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            com.umeng.commonsdk.utils.UMUtils.setAppkey(r3, r11)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            java.lang.String r11 = com.umeng.commonsdk.utils.UMUtils.getLastAppkey(r3)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            java.lang.String r12 = sAppkey     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            r4 = 2
            if (r12 != 0) goto L_0x00db
            java.lang.String r12 = sAppkey     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            boolean r12 = r12.equals(r11)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            if (r12 != 0) goto L_0x00db
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            if (r12 != 0) goto L_0x00d6
            boolean r12 = debugLog     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            if (r12 == 0) goto L_0x00d6
            java.lang.String r12 = "AppKey改变!!!"
            java.lang.String r5 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r12, r4, r5)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
        L_0x00d6:
            java.lang.String r12 = sAppkey     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            com.umeng.commonsdk.utils.UMUtils.setLastAppkey(r3, r12)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
        L_0x00db:
            boolean r12 = debugLog     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            if (r12 == 0) goto L_0x00ff
            java.lang.String r12 = "UMConfigure"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            r5.<init>()     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            java.lang.String r6 = "current appkey is "
            r5.append(r6)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            java.lang.String r6 = sAppkey     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            r5.append(r6)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            java.lang.String r6 = ", last appkey is "
            r5.append(r6)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            r5.append(r11)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            java.lang.String r11 = r5.toString()     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            android.util.Log.i(r12, r11)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
        L_0x00ff:
            boolean r11 = debugLog     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            r12 = 3
            if (r11 == 0) goto L_0x0135
            java.lang.String r11 = com.umeng.commonsdk.utils.UMUtils.getAppkeyByXML(r3)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            java.lang.String r5 = sAppkey     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            if (r5 != 0) goto L_0x0135
            boolean r5 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            if (r5 != 0) goto L_0x0135
            java.lang.String r5 = sAppkey     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            boolean r5 = r5.equals(r11)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            if (r5 != 0) goto L_0x0135
            java.lang.String r5 = "@"
            java.lang.String r6 = "#"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            java.lang.String[] r6 = new java.lang.String[r4]     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            java.lang.String r7 = sAppkey     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            r6[r1] = r7     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            r6[r2] = r11     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            java.lang.String r11 = "请注意：您init接口中设置的AppKey是@，manifest中设置的AppKey是#，init接口设置的AppKey会覆盖manifest中设置的AppKey"
            java.lang.String r7 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r11, r12, r7, r5, r6)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
        L_0x0135:
            java.lang.String r11 = sChannel     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            com.umeng.commonsdk.utils.UMUtils.setChannel(r3, r11)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            boolean r11 = debugLog     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            if (r11 == 0) goto L_0x0156
            java.lang.String r11 = "UMConfigure"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            r5.<init>()     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            java.lang.String r6 = "channel is "
            r5.append(r6)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            java.lang.String r6 = sChannel     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            r5.append(r6)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            android.util.Log.i(r11, r5)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
        L_0x0156:
            java.lang.String r11 = "com.umeng.analytics.MobclickAgent"
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x01dc }
            java.lang.String r5 = "init"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ all -> 0x01dc }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r1] = r7     // Catch:{ all -> 0x01dc }
            java.lang.reflect.Method r5 = r11.getDeclaredMethod(r5, r6)     // Catch:{ all -> 0x01dc }
            if (r5 == 0) goto L_0x019d
            r5.setAccessible(r2)     // Catch:{ all -> 0x01dc }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x01dc }
            r6[r1] = r3     // Catch:{ all -> 0x01dc }
            r5.invoke(r11, r6)     // Catch:{ all -> 0x01dc }
            java.lang.String r5 = "header_first_resume"
            boolean r5 = com.umeng.commonsdk.config.FieldManager.allow(r5)     // Catch:{ all -> 0x01dc }
            if (r5 == 0) goto L_0x018b
            java.lang.String r5 = "MobclickRT"
            java.lang.String r6 = "--->>> FirstResumeTrigger enabled."
            com.umeng.commonsdk.debug.UMRTLog.m22229i(r5, r6)     // Catch:{ all -> 0x01dc }
            com.umeng.analytics.pro.k r5 = com.umeng.analytics.pro.AutoViewPageTracker.m21976a(r3)     // Catch:{ all -> 0x01dc }
            r5.mo19114b(r3)     // Catch:{ all -> 0x01dc }
            goto L_0x0192
        L_0x018b:
            java.lang.String r5 = "MobclickRT"
            java.lang.String r6 = "--->>> FirstResumeTrigger disabled."
            com.umeng.commonsdk.debug.UMRTLog.m22229i(r5, r6)     // Catch:{ all -> 0x01dc }
        L_0x0192:
            boolean r5 = debugLog     // Catch:{ all -> 0x01dc }
            if (r5 == 0) goto L_0x019d
            java.lang.String r5 = "统计SDK初始化成功"
            java.lang.String r6 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r5, r4, r6)     // Catch:{ all -> 0x01dc }
        L_0x019d:
            java.lang.String r5 = "com.umeng.analytics.game.UMGameAgent"
            java.lang.Class.forName(r5)     // Catch:{ all -> 0x01dc }
            java.lang.String r5 = "setGameScenarioType"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ all -> 0x01dc }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r1] = r7     // Catch:{ all -> 0x01dc }
            java.lang.reflect.Method r5 = r11.getDeclaredMethod(r5, r6)     // Catch:{ all -> 0x01dc }
            if (r5 == 0) goto L_0x01ba
            r5.setAccessible(r2)     // Catch:{ all -> 0x01dc }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x01dc }
            r6[r1] = r3     // Catch:{ all -> 0x01dc }
            r5.invoke(r11, r6)     // Catch:{ all -> 0x01dc }
        L_0x01ba:
            java.lang.String r11 = com.umeng.commonsdk.statistics.EnvelopeManager.f17646a     // Catch:{ all -> 0x01dc }
            java.lang.String r5 = "e"
            int r11 = r11.indexOf(r5)     // Catch:{ all -> 0x01dc }
            if (r11 < 0) goto L_0x01dc
            java.lang.String r11 = "com.umeng.analytics.MobclickAgent"
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x01dc }
            java.lang.String r5 = "disableExceptionCatch"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ all -> 0x01dc }
            java.lang.reflect.Method r5 = r11.getDeclaredMethod(r5, r6)     // Catch:{ all -> 0x01dc }
            if (r5 == 0) goto L_0x01dc
            r5.setAccessible(r2)     // Catch:{ all -> 0x01dc }
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x01dc }
            r5.invoke(r11, r6)     // Catch:{ all -> 0x01dc }
        L_0x01dc:
            java.lang.String r11 = "com.umeng.message.MessageSharedPrefs"
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            java.lang.String r5 = "getInstance"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r1] = r7     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            java.lang.reflect.Method r5 = r11.getDeclaredMethod(r5, r6)     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            if (r5 == 0) goto L_0x0284
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            r6[r1] = r3     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            java.lang.Object r5 = r5.invoke(r11, r6)     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            if (r5 == 0) goto L_0x0284
            java.lang.String r6 = "setMessageAppKey"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            r7[r1] = r0     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            java.lang.reflect.Method r6 = r11.getDeclaredMethod(r6, r7)     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            if (r6 == 0) goto L_0x021d
            r6.setAccessible(r2)     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            java.lang.String r8 = sAppkey     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            r7[r1] = r8     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            r6.invoke(r5, r7)     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            boolean r6 = debugLog     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            if (r6 == 0) goto L_0x021d
            java.lang.String r6 = "PUSH AppKey设置成功"
            java.lang.String r7 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r6, r4, r7)     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
        L_0x021d:
            java.lang.String r6 = "setMessageChannel"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            r7[r1] = r0     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            java.lang.reflect.Method r6 = r11.getDeclaredMethod(r6, r7)     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            if (r6 == 0) goto L_0x0240
            r6.setAccessible(r2)     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            java.lang.String r8 = sChannel     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            r7[r1] = r8     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            r6.invoke(r5, r7)     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            boolean r6 = debugLog     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            if (r6 == 0) goto L_0x0240
            java.lang.String r6 = "PUSH Channel设置成功"
            java.lang.String r7 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r6, r4, r7)     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
        L_0x0240:
            boolean r6 = android.text.TextUtils.isEmpty(r14)     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            if (r6 == 0) goto L_0x0249
            boolean r11 = debugLog     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            goto L_0x0284
        L_0x0249:
            boolean r6 = debugLog     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            if (r6 == 0) goto L_0x0263
            java.lang.String r6 = "UMConfigure"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            r7.<init>()     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            java.lang.String r8 = "push secret is "
            r7.append(r8)     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            r7.append(r14)     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            android.util.Log.i(r6, r7)     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
        L_0x0263:
            java.lang.String r6 = "setMessageAppSecret"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            r7[r1] = r0     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            java.lang.reflect.Method r11 = r11.getDeclaredMethod(r6, r7)     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            if (r11 == 0) goto L_0x0284
            r11.setAccessible(r2)     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            r6[r1] = r14     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            r11.invoke(r5, r6)     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            boolean r11 = debugLog     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
            if (r11 == 0) goto L_0x0284
            java.lang.String r11 = "PUSH Secret设置成功"
            java.lang.String r5 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r11, r4, r5)     // Catch:{ Exception -> 0x0284, all -> 0x03ec }
        L_0x0284:
            java.lang.String r11 = "com.umeng.socialize.UMShareAPI"
            java.lang.Class r11 = getClass(r11)     // Catch:{ all -> 0x02bc }
            java.lang.String r5 = "APPKEY"
            java.lang.String r6 = sAppkey     // Catch:{ all -> 0x02bc }
            setFile(r11, r5, r6)     // Catch:{ all -> 0x02bc }
            if (r11 == 0) goto L_0x02bc
            java.lang.String r5 = "init"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ all -> 0x02bc }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r1] = r7     // Catch:{ all -> 0x02bc }
            r6[r2] = r0     // Catch:{ all -> 0x02bc }
            java.lang.reflect.Method r5 = r11.getDeclaredMethod(r5, r6)     // Catch:{ all -> 0x02bc }
            if (r5 == 0) goto L_0x02bc
            r5.setAccessible(r2)     // Catch:{ all -> 0x02bc }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x02bc }
            r6[r1] = r3     // Catch:{ all -> 0x02bc }
            java.lang.String r7 = sAppkey     // Catch:{ all -> 0x02bc }
            r6[r2] = r7     // Catch:{ all -> 0x02bc }
            r5.invoke(r11, r6)     // Catch:{ all -> 0x02bc }
            boolean r11 = debugLog     // Catch:{ all -> 0x02bc }
            if (r11 == 0) goto L_0x02bc
            java.lang.String r11 = "Share AppKey设置成功"
            java.lang.String r5 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r11, r4, r5)     // Catch:{ all -> 0x02bc }
        L_0x02bc:
            com.umeng.commonsdk.statistics.AnalyticsConstants.setDeviceType(r13)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            java.lang.String r11 = "com.umeng.error.UMError"
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x02e8 }
            java.lang.String r5 = "init"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ all -> 0x02e8 }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r1] = r7     // Catch:{ all -> 0x02e8 }
            java.lang.reflect.Method r5 = r11.getDeclaredMethod(r5, r6)     // Catch:{ all -> 0x02e8 }
            if (r5 == 0) goto L_0x02e8
            r5.setAccessible(r2)     // Catch:{ all -> 0x02e8 }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x02e8 }
            r6[r1] = r3     // Catch:{ all -> 0x02e8 }
            r5.invoke(r11, r6)     // Catch:{ all -> 0x02e8 }
            boolean r11 = debugLog     // Catch:{ all -> 0x02e8 }
            if (r11 == 0) goto L_0x02e8
            java.lang.String r11 = "错误分析SDK初始化成功"
            java.lang.String r5 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r11, r4, r5)     // Catch:{ all -> 0x02e8 }
        L_0x02e8:
            java.lang.String r11 = "com.umeng.umcrash.UMCrash"
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x033b }
            int r5 = com.umeng.commonsdk.statistics.SdkVersion.SDK_TYPE     // Catch:{ all -> 0x033b }
            if (r5 != r2) goto L_0x030c
            java.lang.String r5 = "useIntlServices"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ all -> 0x033b }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x033b }
            r6[r1] = r7     // Catch:{ all -> 0x033b }
            java.lang.reflect.Method r5 = r11.getDeclaredMethod(r5, r6)     // Catch:{ all -> 0x033b }
            if (r5 == 0) goto L_0x030c
            r5.setAccessible(r2)     // Catch:{ all -> 0x033b }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x033b }
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x033b }
            r6[r1] = r7     // Catch:{ all -> 0x033b }
            r5.invoke(r11, r6)     // Catch:{ all -> 0x033b }
        L_0x030c:
            java.lang.String r5 = "init"
            java.lang.Class[] r6 = new java.lang.Class[r12]     // Catch:{ all -> 0x033b }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r1] = r7     // Catch:{ all -> 0x033b }
            r6[r2] = r0     // Catch:{ all -> 0x033b }
            r6[r4] = r0     // Catch:{ all -> 0x033b }
            java.lang.reflect.Method r5 = r11.getDeclaredMethod(r5, r6)     // Catch:{ all -> 0x033b }
            if (r5 == 0) goto L_0x033b
            r5.setAccessible(r2)     // Catch:{ all -> 0x033b }
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ all -> 0x033b }
            r6[r1] = r3     // Catch:{ all -> 0x033b }
            java.lang.String r7 = sAppkey     // Catch:{ all -> 0x033b }
            r6[r2] = r7     // Catch:{ all -> 0x033b }
            java.lang.String r7 = sChannel     // Catch:{ all -> 0x033b }
            r6[r4] = r7     // Catch:{ all -> 0x033b }
            r5.invoke(r11, r6)     // Catch:{ all -> 0x033b }
            boolean r11 = debugLog     // Catch:{ all -> 0x033b }
            if (r11 == 0) goto L_0x033b
            java.lang.String r11 = "APM SDK初始化成功"
            java.lang.String r5 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r11, r4, r5)     // Catch:{ all -> 0x033b }
        L_0x033b:
            r11 = 0
            java.lang.String r5 = "com.umeng.vt.facade.EventFacade"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x037a }
            java.lang.String r6 = "init"
            r7 = 5
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException -> 0x037a }
            java.lang.Class<android.app.Application> r9 = android.app.Application.class
            r8[r1] = r9     // Catch:{ ClassNotFoundException -> 0x037a }
            r8[r2] = r0     // Catch:{ ClassNotFoundException -> 0x037a }
            r8[r4] = r0     // Catch:{ ClassNotFoundException -> 0x037a }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x037a }
            r8[r12] = r9     // Catch:{ ClassNotFoundException -> 0x037a }
            r9 = 4
            r8[r9] = r0     // Catch:{ ClassNotFoundException -> 0x037a }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r8)     // Catch:{ ClassNotFoundException -> 0x037a }
            if (r5 == 0) goto L_0x037a
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ ClassNotFoundException -> 0x037a }
            r6[r1] = r3     // Catch:{ ClassNotFoundException -> 0x037a }
            java.lang.String r7 = sAppkey     // Catch:{ ClassNotFoundException -> 0x037a }
            r6[r2] = r7     // Catch:{ ClassNotFoundException -> 0x037a }
            java.lang.String r7 = sChannel     // Catch:{ ClassNotFoundException -> 0x037a }
            r6[r4] = r7     // Catch:{ ClassNotFoundException -> 0x037a }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ ClassNotFoundException -> 0x037a }
            r6[r12] = r13     // Catch:{ ClassNotFoundException -> 0x037a }
            r6[r9] = r14     // Catch:{ ClassNotFoundException -> 0x037a }
            r5.invoke(r11, r6)     // Catch:{ ClassNotFoundException -> 0x037a }
            java.lang.String r12 = "MobclickRT"
            java.lang.String r13 = "--->>>初始化 EventFacade 成功."
            com.umeng.commonsdk.debug.UMRTLog.m22229i(r12, r13)     // Catch:{ ClassNotFoundException -> 0x037a }
        L_0x037a:
            java.lang.String r12 = "com.umeng.vt.common.VTTracker"
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ ClassNotFoundException -> 0x03a2 }
            java.lang.String r13 = "init"
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x03a2 }
            java.lang.Class<android.app.Application> r5 = android.app.Application.class
            r14[r1] = r5     // Catch:{ ClassNotFoundException -> 0x03a2 }
            r14[r2] = r0     // Catch:{ ClassNotFoundException -> 0x03a2 }
            java.lang.reflect.Method r12 = r12.getDeclaredMethod(r13, r14)     // Catch:{ ClassNotFoundException -> 0x03a2 }
            if (r12 == 0) goto L_0x03a2
            java.lang.Object[] r13 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x03a2 }
            r13[r1] = r3     // Catch:{ ClassNotFoundException -> 0x03a2 }
            java.lang.String r14 = sAppkey     // Catch:{ ClassNotFoundException -> 0x03a2 }
            r13[r2] = r14     // Catch:{ ClassNotFoundException -> 0x03a2 }
            r12.invoke(r11, r13)     // Catch:{ ClassNotFoundException -> 0x03a2 }
            java.lang.String r12 = "MobclickRT"
            java.lang.String r13 = "--->>>初始化 VTTracker 成功."
            com.umeng.commonsdk.debug.UMRTLog.m22229i(r12, r13)     // Catch:{ ClassNotFoundException -> 0x03a2 }
        L_0x03a2:
            java.lang.Object r12 = lockObject     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            monitor-enter(r12)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            isFinish = r2     // Catch:{ all -> 0x03e9 }
            monitor-exit(r12)     // Catch:{ all -> 0x03e9 }
            boolean r12 = needSendZcfgEnv(r3)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            if (r12 == 0) goto L_0x03c4
            java.lang.String r12 = "MobclickRT"
            java.lang.String r13 = "--->>> 走零号报文发送逻辑"
            com.umeng.commonsdk.debug.UMRTLog.m22228e(r12, r13)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            r12 = 32781(0x800d, float:4.5936E-41)
            com.umeng.commonsdk.internal.b r13 = com.umeng.commonsdk.internal.UMInternalData.m22265a(r3)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            com.umeng.commonsdk.internal.c r13 = r13.mo19254a()     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r3, r12, r13, r11)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            goto L_0x03df
        L_0x03c4:
            java.lang.String r12 = "MobclickRT"
            java.lang.String r13 = "--->>> 走正常逻辑."
            com.umeng.commonsdk.debug.UMRTLog.m22228e(r12, r13)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            boolean r12 = com.umeng.commonsdk.config.FieldManager.m22200b()     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            if (r12 == 0) goto L_0x03df
            r12 = 32791(0x8017, float:4.595E-41)
            com.umeng.commonsdk.internal.b r13 = com.umeng.commonsdk.internal.UMInternalData.m22265a(r3)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            com.umeng.commonsdk.internal.c r13 = r13.mo19254a()     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r3, r12, r13, r11)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
        L_0x03df:
            boolean r11 = isDebugLog()     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            if (r11 == 0) goto L_0x0423
            com.umeng.commonsdk.UMConfigureInternation.doSelfCheck(r3)     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
            goto L_0x0423
        L_0x03e9:
            r11 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x03e9 }
            throw r11     // Catch:{ Exception -> 0x0408, all -> 0x03ec }
        L_0x03ec:
            r11 = move-exception
            boolean r12 = debugLog
            if (r12 == 0) goto L_0x0423
            java.lang.String r12 = "UMConfigure"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "init e is "
            r13.append(r14)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            android.util.Log.e(r12, r11)
            goto L_0x0423
        L_0x0408:
            r11 = move-exception
            boolean r12 = debugLog
            if (r12 == 0) goto L_0x0423
            java.lang.String r12 = "UMConfigure"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "init e is "
            r13.append(r14)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            android.util.Log.e(r12, r11)
        L_0x0423:
            android.content.Context r10 = r10.getApplicationContext()     // Catch:{ Exception -> 0x0458 }
            java.lang.String r11 = "com.umeng.cconfig.UMRemoteConfig"
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ Exception -> 0x0458 }
            java.lang.String r12 = "getInstance"
            java.lang.Class[] r13 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0458 }
            java.lang.reflect.Method r12 = r11.getDeclaredMethod(r12, r13)     // Catch:{ Exception -> 0x0458 }
            if (r12 == 0) goto L_0x0459
            java.lang.Object[] r13 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0458 }
            java.lang.Object r12 = r12.invoke(r11, r13)     // Catch:{ Exception -> 0x0458 }
            if (r12 == 0) goto L_0x0459
            java.lang.String r13 = "init"
            java.lang.Class[] r14 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0458 }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r14[r1] = r0     // Catch:{ Exception -> 0x0458 }
            java.lang.reflect.Method r11 = r11.getDeclaredMethod(r13, r14)     // Catch:{ Exception -> 0x0458 }
            if (r11 == 0) goto L_0x0459
            r11.setAccessible(r2)     // Catch:{ Exception -> 0x0458 }
            java.lang.Object[] r13 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0458 }
            r13[r1] = r10     // Catch:{ Exception -> 0x0458 }
            r11.invoke(r12, r13)     // Catch:{ Exception -> 0x0458 }
            goto L_0x0459
        L_0x0458:
        L_0x0459:
            boolean r10 = isInit
            if (r10 != 0) goto L_0x045f
            isInit = r2
        L_0x045f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.UMConfigure.init(android.content.Context, java.lang.String, java.lang.String, int, java.lang.String):void");
    }

    private static void invoke(Method method, Object[] objArr) {
        if (method != null) {
            try {
                method.invoke(null, objArr);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    private static void setFile(Class<?> cls, String str, boolean z) {
        if (cls != null) {
            try {
                cls.getField(str).set(str, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }
}
