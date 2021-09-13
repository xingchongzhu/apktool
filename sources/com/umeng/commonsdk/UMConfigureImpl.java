package com.umeng.commonsdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.utils.onMessageSendListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class UMConfigureImpl {

    /* renamed from: a */
    private static String f17327a = "delayed_transmission_flag_new";

    /* renamed from: b */
    private static CopyOnWriteArrayList<onMessageSendListener> f17328b = new CopyOnWriteArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static int f17329c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static boolean f17330d = false;

    /* renamed from: e */
    private static final int f17331e = 1000;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static ScheduledExecutorService f17332f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static Context f17333g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static int f17334h = 0;

    /* renamed from: i */
    private static Runnable f17335i = new Runnable() {
        public void run() {
            try {
                if (UMConfigureImpl.f17329c == 0 || UMConfigureImpl.f17334h >= 10) {
                    if (!UMConfigureImpl.f17330d) {
                        UMConfigureImpl.f17330d = true;
                        UMConfigureImpl.m22190b(UMConfigureImpl.f17333g);
                    }
                    if (UMConfigureImpl.f17332f != null) {
                        UMConfigureImpl.f17332f.shutdown();
                        UMConfigureImpl.f17332f = null;
                    }
                }
                UMConfigureImpl.m22196f();
            } catch (Exception unused) {
            }
        }
    };

    /* renamed from: f */
    static /* synthetic */ int m22196f() {
        int i = f17334h;
        f17334h = i + 1;
        return i;
    }

    public static void init(Context context) {
        if (context != null) {
            f17333g = context;
            try {
                if (f17329c < 1) {
                    UMEnvelopeBuild.setTransmissionSendFlag(true);
                } else if (!m22194d(context)) {
                    UMEnvelopeBuild.setTransmissionSendFlag(false);
                    m22191c(context);
                    if (f17332f == null) {
                        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
                        f17332f = newScheduledThreadPool;
                        newScheduledThreadPool.scheduleAtFixedRate(f17335i, 0, 100, TimeUnit.MILLISECONDS);
                    }
                } else {
                    UMEnvelopeBuild.setTransmissionSendFlag(true);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static synchronized void registerInterruptFlag() {
        synchronized (UMConfigureImpl.class) {
            try {
                f17329c++;
            } catch (Exception unused) {
            }
        }
    }

    public static synchronized void registerMessageSendListener(onMessageSendListener onmessagesendlistener) {
        synchronized (UMConfigureImpl.class) {
            try {
                CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList = f17328b;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.add(onmessagesendlistener);
                }
                if (UMEnvelopeBuild.getTransmissionSendFlag()) {
                    CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList2 = f17328b;
                    if (copyOnWriteArrayList2 != null && copyOnWriteArrayList2.size() > 0) {
                        Iterator it = f17328b.iterator();
                        while (it.hasNext()) {
                            ((onMessageSendListener) it.next()).onMessageSend();
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static synchronized void removeInterruptFlag() {
        synchronized (UMConfigureImpl.class) {
            try {
                f17329c--;
            } catch (Exception unused) {
            }
        }
    }

    public static synchronized void removeMessageSendListener(onMessageSendListener onmessagesendlistener) {
        synchronized (UMConfigureImpl.class) {
            try {
                CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList = f17328b;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.remove(onmessagesendlistener);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static synchronized void m22190b(Context context) {
        synchronized (UMConfigureImpl.class) {
            try {
                UMEnvelopeBuild.setTransmissionSendFlag(true);
                CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList = f17328b;
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                    Iterator it = f17328b.iterator();
                    while (it.hasNext()) {
                        ((onMessageSendListener) it.next()).onMessageSend();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private static void m22191c(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f17327a, 0);
            if (sharedPreferences != null) {
                Editor edit = sharedPreferences.edit();
                edit.putBoolean(f17327a, true);
                edit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    private static boolean m22194d(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f17327a, 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getBoolean(f17327a, false);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
