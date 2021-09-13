package com.umeng.commonsdk.stateless;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.UMCommonContent;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.UMInternalConfig;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.vchannel.Constant;
import java.io.File;
import java.util.LinkedList;

/* renamed from: com.umeng.commonsdk.stateless.b */
public class UMSLNetWorkSender {

    /* renamed from: a */
    public static final int f17621a = 273;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static Context f17622b = null;

    /* renamed from: c */
    private static HandlerThread f17623c = null;

    /* renamed from: d */
    private static Handler f17624d = null;

    /* renamed from: e */
    private static Object f17625e = new Object();

    /* renamed from: f */
    private static final int f17626f = 274;

    /* renamed from: g */
    private static final int f17627g = 275;

    /* renamed from: h */
    private static final int f17628h = 512;

    /* renamed from: i */
    private static C3215a f17629i = null;

    /* renamed from: j */
    private static IntentFilter f17630j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static boolean f17631k = false;

    /* renamed from: l */
    private static LinkedList<String> f17632l = new LinkedList<>();

    /* renamed from: m */
    private static BroadcastReceiver f17633m = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if (context != null && intent != null) {
                try {
                    if (intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                        UMSLNetWorkSender.f17622b = context.getApplicationContext();
                        if (UMSLNetWorkSender.f17622b != null) {
                            ConnectivityManager connectivityManager = (ConnectivityManager) UMSLNetWorkSender.f17622b.getSystemService("connectivity");
                            if (connectivityManager != null) {
                                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                String str = UMRTLog.RTLOG_TAG;
                                if (activeNetworkInfo != null) {
                                    if (activeNetworkInfo.isAvailable()) {
                                        UMSLNetWorkSender.f17631k = true;
                                        UMRTLog.m22228e(str, "--->>>网络可用： 触发2号数据仓信封消费动作。");
                                        UMSLNetWorkSender.m22378b(UMSLNetWorkSender.f17626f);
                                        return;
                                    }
                                }
                                UMRTLog.m22228e(str, "--->>>网络断连： 2号数据仓");
                                UMSLNetWorkSender.f17631k = false;
                            }
                        }
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(context, th);
                }
            }
        }
    };

    /* renamed from: com.umeng.commonsdk.stateless.b$a */
    /* compiled from: UMSLNetWorkSender */
    static class C3215a extends FileObserver {
        public C3215a(String str) {
            super(str);
        }

        public void onEvent(int i, String str) {
            if ((i & 8) == 8) {
                StringBuilder sb = new StringBuilder();
                sb.append("--->>> envelope file created >>> ");
                sb.append(str);
                UMRTLog.m22229i(UMRTLog.RTLOG_TAG, sb.toString());
                UMSLNetWorkSender.m22374a((int) UMSLNetWorkSender.f17626f);
            }
        }
    }

    public UMSLNetWorkSender(Context context) {
        synchronized (f17625e) {
            if (context != null) {
                try {
                    Context applicationContext = context.getApplicationContext();
                    f17622b = applicationContext;
                    if (applicationContext != null && f17623c == null) {
                        HandlerThread handlerThread = new HandlerThread("SL-NetWorkSender");
                        f17623c = handlerThread;
                        handlerThread.start();
                        if (f17629i == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(f17622b.getFilesDir());
                            sb.append(File.separator);
                            sb.append(UMSLConfig.f17615f);
                            String sb2 = sb.toString();
                            File file = new File(sb2);
                            if (!file.exists()) {
                                UMRTLog.m22228e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓目录不存在，创建之。");
                                file.mkdir();
                            }
                            C3215a aVar = new C3215a(sb2);
                            f17629i = aVar;
                            aVar.startWatching();
                            UMRTLog.m22228e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓File Monitor启动.");
                        }
                        if (f17624d == null) {
                            f17624d = new Handler(f17623c.getLooper()) {
                                public void handleMessage(Message message) {
                                    int i = message.what;
                                    if (i != UMSLNetWorkSender.f17628h) {
                                        switch (i) {
                                            case UMSLNetWorkSender.f17621a /*273*/:
                                                UMSLNetWorkSender.m22389m();
                                                return;
                                            case UMSLNetWorkSender.f17626f /*274*/:
                                                UMSLNetWorkSender.m22391o();
                                                return;
                                            case UMSLNetWorkSender.f17627g /*275*/:
                                                UMSLNetWorkSender.m22393q();
                                                break;
                                            default:
                                                return;
                                        }
                                    }
                                    UMSLNetWorkSender.m22394r();
                                }
                            };
                        }
                        if (DeviceConfig.checkPermission(f17622b, "android.permission.ACCESS_NETWORK_STATE")) {
                            ULog.m22482i("walle", "[stateless] begin register receiver");
                            if (f17630j == null) {
                                IntentFilter intentFilter = new IntentFilter();
                                f17630j = intentFilter;
                                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                                if (f17633m != null) {
                                    UMRTLog.m22228e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓：注册网络状态监听器。");
                                    f17622b.registerReceiver(f17633m, f17630j);
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(context, th);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m22378b(int i) {
        try {
            if (f17631k) {
                Handler handler = f17624d;
                if (handler != null && !handler.hasMessages(i)) {
                    Message obtainMessage = f17624d.obtainMessage();
                    obtainMessage.what = i;
                    f17624d.sendMessage(obtainMessage);
                }
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f17622b, th);
        }
    }

    /* renamed from: c */
    public static void m22379c() {
        m22378b(f17627g);
    }

    /* renamed from: d */
    public static void m22380d() {
        m22378b(f17628h);
    }

    /* renamed from: j */
    private static void m22386j() {
        File[] c = UMSLUtils.m22415c(f17622b);
        if (c != null) {
            if (f17632l.size() > 0) {
                f17632l.clear();
            }
            for (File absolutePath : c) {
                f17632l.add(absolutePath.getAbsolutePath());
            }
        }
    }

    /* renamed from: k */
    private static String m22387k() {
        String str = null;
        try {
            String str2 = (String) f17632l.peek();
            if (str2 == null) {
                return str2;
            }
            try {
                f17632l.removeFirst();
                return str2;
            } catch (Throwable unused) {
                str = str2;
            }
        } catch (Throwable unused2) {
            return str;
        }
    }

    /* renamed from: l */
    private static void m22388l() {
        String str;
        int size = f17632l.size();
        String str2 = UMRTLog.RTLOG_TAG;
        if (size <= 0) {
            UMRTLog.m22228e(str2, "--->>> todoList无内容，无需处理。");
            return;
        }
        do {
            if (VERSION.SDK_INT >= 9) {
                str = (String) f17632l.pollFirst();
            } else {
                str = m22387k();
            }
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (!file.exists()) {
                    UMRTLog.m22228e(str2, "--->>> 信封文件不存在，处理下一个文件。");
                    continue;
                } else {
                    UMSLNetWorkSenderHelper cVar = new UMSLNetWorkSenderHelper(f17622b);
                    byte[] bArr = null;
                    try {
                        bArr = UMSLUtils.m22406a(str);
                    } catch (Exception unused) {
                    }
                    String name = file.getName();
                    String substring = !TextUtils.isEmpty(name) ? name.substring(0, 1) : UMCommonContent.f16581aE;
                    String d = UMSLUtils.m22416d(name);
                    String str3 = UMSLConfig.f17619j;
                    String c = UMSLUtils.m22413c(d);
                    if (Constant.f17950c.equalsIgnoreCase(c)) {
                        str3 = Constant.f17948a;
                    }
                    if (cVar.mo19282a(bArr, c, str3, substring) && !file.delete()) {
                        file.delete();
                        continue;
                    }
                }
            }
        } while (str != null);
        f17632l.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static void m22389m() {
        File a;
        String str = "walle";
        if (f17631k && f17622b != null) {
            do {
                try {
                    a = UMSLUtils.m22400a(f17622b);
                    if (!(a == null || a.getParentFile() == null || TextUtils.isEmpty(a.getParentFile().getName()))) {
                        UMSLNetWorkSenderHelper cVar = new UMSLNetWorkSenderHelper(f17622b);
                        String str2 = new String(Base64.decode(a.getParentFile().getName(), 0));
                        if (!UMInternalConfig.f17493a.equalsIgnoreCase(str2) && !UMInternalConfig.f17494b.equalsIgnoreCase(str2)) {
                            if (!UMInternalConfig.f17490A.equalsIgnoreCase(str2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("[stateless] handleProcessNext, pathUrl is ");
                                sb.append(str2);
                                ULog.m22482i(str, sb.toString());
                                byte[] bArr = null;
                                try {
                                    bArr = UMSLUtils.m22406a(a.getAbsolutePath());
                                } catch (Exception unused) {
                                }
                                String str3 = "";
                                if (Constant.f17950c.equalsIgnoreCase(str2)) {
                                    str3 = Constant.f17948a;
                                }
                                String str4 = UMCommonContent.f16581aE;
                                if (UMServerURL.PATH_SHARE.equalsIgnoreCase(str2)) {
                                    str4 = UMCommonContent.f16628az;
                                }
                                if (UMServerURL.PATH_PUSH_LAUNCH.equalsIgnoreCase(str2) || UMServerURL.PATH_PUSH_REGIST.equalsIgnoreCase(str2) || UMServerURL.PATH_PUSH_LOG.equalsIgnoreCase(str2)) {
                                    str4 = UMCommonContent.f16624av;
                                }
                                if (cVar.mo19282a(bArr, str2, str3, str4)) {
                                    ULog.m22482i(str, "[stateless] Send envelope file success, delete it.");
                                    File file = new File(a.getAbsolutePath());
                                    if (!file.delete()) {
                                        ULog.m22482i(str, "[stateless] Failed to delete already processed file. We try again after delete failed.");
                                        file.delete();
                                        continue;
                                    } else {
                                        continue;
                                    }
                                } else {
                                    ULog.m22482i(str, "[stateless] Send envelope file failed, abandon and wait next trigger!");
                                    return;
                                }
                            }
                        }
                        new File(a.getAbsolutePath()).delete();
                        continue;
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(f17622b, th);
                }
            } while (a != null);
            m22390n();
        }
    }

    /* renamed from: n */
    private static void m22390n() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(f17622b.getFilesDir());
            sb.append(File.separator);
            sb.append(UMSLConfig.f17614e);
            File file = new File(sb.toString());
            if (file.exists() && file.isDirectory()) {
                UMRTLog.m22228e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓：删除stateless目录。");
                UMSLUtils.m22405a(file);
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static void m22391o() {
        if (f17631k && f17622b != null) {
            m22386j();
            m22388l();
            m22379c();
        }
    }

    /* renamed from: p */
    private static void m22392p() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(f17622b.getFilesDir());
            sb.append(File.separator);
            sb.append(UMSLConfig.f17614e);
            File file = new File(sb.toString());
            if (file.exists() && file.isDirectory()) {
                UMRTLog.m22228e(UMRTLog.RTLOG_TAG, "--->>>2号数据仓：检测到stateless目录。");
                m22378b(f17621a);
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static void m22393q() {
        m22392p();
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static void m22394r() {
    }

    /* renamed from: a */
    public static boolean m22375a() {
        synchronized (f17625e) {
            if (f17629i != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: b */
    public static void m22377b() {
        UMRTLog.m22228e(UMRTLog.RTLOG_TAG, "--->>>信封构建成功： 触发2号数据仓信封消费动作。");
        m22378b(f17626f);
    }

    /* renamed from: a */
    public static void m22374a(int i) {
        if (f17631k) {
            Handler handler = f17624d;
            if (handler != null) {
                Message obtainMessage = handler.obtainMessage();
                obtainMessage.what = i;
                f17624d.sendMessage(obtainMessage);
            }
        }
    }
}
