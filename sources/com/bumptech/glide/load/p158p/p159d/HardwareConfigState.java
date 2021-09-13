package com.bumptech.glide.load.p158p.p159d;

import android.annotation.TargetApi;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bumptech.glide.load.p.d.s */
public final class HardwareConfigState {

    /* renamed from: a */
    public static final boolean f10885a;

    /* renamed from: b */
    public static final boolean f10886b;

    /* renamed from: c */
    private static final File f10887c = new File("/proc/self/fd");

    /* renamed from: d */
    private static volatile HardwareConfigState f10888d;

    /* renamed from: e */
    private static volatile int f10889e = -1;

    /* renamed from: f */
    private final boolean f10890f = m13434f();

    /* renamed from: g */
    private final int f10891g;

    /* renamed from: h */
    private final int f10892h;

    /* renamed from: i */
    private int f10893i;

    /* renamed from: j */
    private boolean f10894j = true;

    /* renamed from: k */
    private final AtomicBoolean f10895k = new AtomicBoolean(false);

    static {
        int i = VERSION.SDK_INT;
        boolean z = true;
        f10885a = i < 29;
        if (i < 26) {
            z = false;
        }
        f10886b = z;
    }

    HardwareConfigState() {
        if (VERSION.SDK_INT >= 28) {
            this.f10891g = 20000;
            this.f10892h = 0;
            return;
        }
        this.f10891g = 700;
        this.f10892h = 128;
    }

    /* renamed from: a */
    private boolean m13430a() {
        return f10885a && !this.f10895k.get();
    }

    /* renamed from: b */
    public static HardwareConfigState m13431b() {
        if (f10888d == null) {
            synchronized (HardwareConfigState.class) {
                if (f10888d == null) {
                    f10888d = new HardwareConfigState();
                }
            }
        }
        return f10888d;
    }

    /* renamed from: c */
    private int m13432c() {
        if (f10889e != -1) {
            return f10889e;
        }
        return this.f10891g;
    }

    /* renamed from: d */
    private synchronized boolean m13433d() {
        boolean z = true;
        int i = this.f10893i + 1;
        this.f10893i = i;
        if (i >= 50) {
            this.f10893i = 0;
            int length = f10887c.list().length;
            long c = (long) m13432c();
            if (((long) length) >= c) {
                z = false;
            }
            this.f10894j = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                sb.append(length);
                sb.append(", limit ");
                sb.append(c);
                Log.w("Downsampler", sb.toString());
            }
        }
        return this.f10894j;
    }

    /* renamed from: f */
    private static boolean m13434f() {
        return !m13435g() && !m13436h();
    }

    /* renamed from: g */
    private static boolean m13435g() {
        if (VERSION.SDK_INT != 26) {
            return false;
        }
        for (String startsWith : Arrays.asList(new String[]{"SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play"})) {
            if (Build.MODEL.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m13436h() {
        if (VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList(new String[]{"LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM"}).contains(Build.MODEL);
    }

    /* renamed from: e */
    public boolean mo9232e(int i, int i2, boolean z, boolean z2) {
        String str = "HardwareConfig";
        if (!z) {
            if (Log.isLoggable(str, 2)) {
                Log.v(str, "Hardware config disallowed by caller");
            }
            return false;
        } else if (!this.f10890f) {
            if (Log.isLoggable(str, 2)) {
                Log.v(str, "Hardware config disallowed by device model");
            }
            return false;
        } else if (!f10886b) {
            if (Log.isLoggable(str, 2)) {
                Log.v(str, "Hardware config disallowed by sdk");
            }
            return false;
        } else if (m13430a()) {
            if (Log.isLoggable(str, 2)) {
                Log.v(str, "Hardware config disallowed by app state");
            }
            return false;
        } else if (z2) {
            if (Log.isLoggable(str, 2)) {
                Log.v(str, "Hardware config disallowed because exif orientation is required");
            }
            return false;
        } else {
            int i3 = this.f10892h;
            if (i < i3) {
                if (Log.isLoggable(str, 2)) {
                    Log.v(str, "Hardware config disallowed because width is too small");
                }
                return false;
            } else if (i2 < i3) {
                if (Log.isLoggable(str, 2)) {
                    Log.v(str, "Hardware config disallowed because height is too small");
                }
                return false;
            } else if (m13433d()) {
                return true;
            } else {
                if (Log.isLoggable(str, 2)) {
                    Log.v(str, "Hardware config disallowed because there are insufficient FDs");
                }
                return false;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    @TargetApi(26)
    /* renamed from: i */
    public boolean mo9233i(int i, int i2, Options options, boolean z, boolean z2) {
        boolean e = mo9232e(i, i2, z, z2);
        if (e) {
            options.inPreferredConfig = Config.HARDWARE;
            options.inMutable = false;
        }
        return e;
    }
}
