package p282g.p283a.p287b.p293c.p294a;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.umeng.commonsdk.statistics.SdkVersion;

/* renamed from: g.a.b.c.a.b */
public class IdentifierIdClient {

    /* renamed from: a */
    private static Context f18814a = null;

    /* renamed from: b */
    private static boolean f18815b = false;

    /* renamed from: c */
    private static IdentifierIdObserver f18816c;

    /* renamed from: d */
    private static IdentifierIdObserver f18817d;

    /* renamed from: e */
    private static IdentifierIdObserver f18818e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static Object f18819f = new Object();

    /* renamed from: g */
    private static HandlerThread f18820g;

    /* renamed from: h */
    private static Handler f18821h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static String f18822i;

    /* renamed from: j */
    private static String f18823j;

    /* renamed from: k */
    private static String f18824k;

    /* renamed from: l */
    private static String f18825l;

    /* renamed from: m */
    private static String f18826m;

    /* renamed from: n */
    private static volatile IdentifierIdClient f18827n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static volatile DataBaseOperation f18828o;

    /* renamed from: g.a.b.c.a.b$a */
    /* compiled from: IdentifierIdClient */
    static class C3395a extends Handler {
        C3395a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 11) {
                IdentifierIdClient.f18822i = IdentifierIdClient.f18828o.mo20295a(message.getData().getInt("type"), message.getData().getString("appid"));
                synchronized (IdentifierIdClient.f18819f) {
                    IdentifierIdClient.f18819f.notify();
                }
                return;
            }
            Log.e("VMS_IDLG_SDK_Client", "message type valid");
        }
    }

    private IdentifierIdClient() {
    }

    /* renamed from: a */
    public static String m24025a(String str, String str2) {
        Class<String> cls = String.class;
        try {
            Class cls2 = Class.forName("android.os.SystemProperties");
            return (String) cls2.getMethod("get", new Class[]{cls, cls}).invoke(cls2, new Object[]{str, "unknown"});
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable unused) {
        }
        return str2;
    }

    /* renamed from: b */
    public static IdentifierIdClient m24026b(Context context) {
        Class<IdentifierIdClient> cls = IdentifierIdClient.class;
        if (f18827n == null) {
            synchronized (cls) {
                f18814a = context.getApplicationContext();
                f18827n = new IdentifierIdClient();
            }
        }
        if (f18828o == null) {
            synchronized (cls) {
                f18814a = context.getApplicationContext();
                m24033l();
                f18828o = new DataBaseOperation(f18814a);
                m24030i();
            }
        }
        return f18827n;
    }

    /* renamed from: d */
    private static void m24027d(Context context, int i, String str) {
        if (i == 0) {
            f18816c = new IdentifierIdObserver(f18827n, 0, null);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, f18816c);
        } else if (i == 1) {
            f18817d = new IdentifierIdObserver(f18827n, 1, str);
            ContentResolver contentResolver = context.getContentResolver();
            StringBuilder sb = new StringBuilder();
            sb.append("content://com.vivo.vms.IdProvider/IdentifierId/VAID_");
            sb.append(str);
            contentResolver.registerContentObserver(Uri.parse(sb.toString()), false, f18817d);
        } else if (i == 2) {
            f18818e = new IdentifierIdObserver(f18827n, 2, str);
            ContentResolver contentResolver2 = context.getContentResolver();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("content://com.vivo.vms.IdProvider/IdentifierId/AAID_");
            sb2.append(str);
            contentResolver2.registerContentObserver(Uri.parse(sb2.toString()), false, f18818e);
        }
    }

    /* renamed from: g */
    private void m24028g(int i, String str) {
        Message obtainMessage = f18821h.obtainMessage();
        obtainMessage.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt("type", i);
        if (i == 1 || i == 2) {
            bundle.putString("appid", str);
        }
        obtainMessage.setData(bundle);
        f18821h.sendMessage(obtainMessage);
    }

    /* renamed from: i */
    public static void m24030i() {
        f18815b = SdkVersion.MINI_VERSION.equals(m24025a("persist.sys.identifierid.supported", "0"));
    }

    /* renamed from: l */
    private static void m24033l() {
        HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
        f18820g = handlerThread;
        handlerThread.start();
        f18821h = new C3395a(f18820g.getLooper());
    }

    /* renamed from: c */
    public void mo20296c(int i, String str) {
        synchronized (f18819f) {
            m24028g(i, str);
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                f18819f.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (SystemClock.uptimeMillis() - uptimeMillis >= 2000) {
                Log.d("VMS_IDLG_SDK_Client", "query timeout");
            } else if (i == 0) {
                f18823j = f18822i;
                f18822i = null;
            } else if (i != 1) {
                if (i == 2) {
                    String str2 = f18822i;
                    if (str2 != null) {
                        f18825l = str2;
                        f18822i = null;
                    } else {
                        Log.e("VMS_IDLG_SDK_Client", "get aaid failed");
                    }
                } else if (i != 4) {
                }
                f18826m = f18822i;
                f18822i = null;
            } else {
                String str3 = f18822i;
                if (str3 != null) {
                    f18824k = str3;
                    f18822i = null;
                } else {
                    Log.e("VMS_IDLG_SDK_Client", "get vaid failed");
                }
            }
        }
    }

    /* renamed from: e */
    public boolean mo20297e() {
        return f18815b;
    }

    /* renamed from: f */
    public String mo20298f() {
        if (!mo20297e()) {
            return null;
        }
        String str = f18823j;
        if (str != null) {
            return str;
        }
        mo20296c(0, null);
        if (f18816c == null) {
            m24027d(f18814a, 0, null);
        }
        return f18823j;
    }
}
