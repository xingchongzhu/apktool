package p067c.p068a.p069a.p070a;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import p067c.p068a.p069a.p070a.p097j2.MediaPeriodId;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.p0 */
public final class ExoPlaybackException extends Exception {

    /* renamed from: a */
    public final int f8675a;

    /* renamed from: b */
    public final String f8676b;

    /* renamed from: c */
    public final int f8677c;

    /* renamed from: d */
    public final Format f8678d;

    /* renamed from: e */
    public final int f8679e;

    /* renamed from: f */
    public final long f8680f;

    /* renamed from: g */
    public final MediaPeriodId f8681g;

    /* renamed from: h */
    final boolean f8682h;

    /* renamed from: i */
    private final Throwable f8683i;

    private ExoPlaybackException(int i, Throwable th) {
        this(i, th, null, null, -1, null, 4, false);
    }

    /* renamed from: b */
    public static ExoPlaybackException m10678b(Exception exc) {
        ExoPlaybackException p0Var = new ExoPlaybackException(1, exc, null, null, -1, null, 4, false);
        return p0Var;
    }

    /* renamed from: c */
    public static ExoPlaybackException m10679c(Throwable th, String str, int i, Format u0Var, int i2, boolean z) {
        ExoPlaybackException p0Var = new ExoPlaybackException(1, th, null, str, i, u0Var, u0Var == null ? 4 : i2, z);
        return p0Var;
    }

    /* renamed from: d */
    public static ExoPlaybackException m10680d(IOException iOException) {
        return new ExoPlaybackException(0, iOException);
    }

    /* renamed from: e */
    public static ExoPlaybackException m10681e(RuntimeException runtimeException) {
        return new ExoPlaybackException(2, runtimeException);
    }

    /* renamed from: f */
    private static String m10682f(int i, String str, String str2, int i2, Format u0Var, int i3) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" error, index=");
            sb.append(i2);
            sb.append(", format=");
            sb.append(u0Var);
            sb.append(", format_supported=");
            sb.append(C.m8859b(i3));
            str3 = sb.toString();
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(": ");
        sb2.append(str);
        return sb2.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public ExoPlaybackException mo7629a(MediaPeriodId b0Var) {
        ExoPlaybackException p0Var = new ExoPlaybackException(getMessage(), this.f8683i, this.f8675a, this.f8676b, this.f8677c, this.f8678d, this.f8679e, b0Var, this.f8680f, this.f8682h);
        return p0Var;
    }

    /* renamed from: g */
    public IOException mo7630g() {
        Assertions.m10154f(this.f8675a == 0);
        return (IOException) Assertions.m10153e(this.f8683i);
    }

    private ExoPlaybackException(int i, Throwable th, String str, String str2, int i2, Format u0Var, int i3, boolean z) {
        this(m10682f(i, str, str2, i2, u0Var, i3), th, i, str2, i2, u0Var, i3, null, SystemClock.elapsedRealtime(), z);
    }

    private ExoPlaybackException(String str, Throwable th, int i, String str2, int i2, Format u0Var, int i3, MediaPeriodId b0Var, long j, boolean z) {
        super(str, th);
        this.f8675a = i;
        this.f8683i = th;
        this.f8676b = str2;
        this.f8677c = i2;
        this.f8678d = u0Var;
        this.f8679e = i3;
        this.f8681g = b0Var;
        this.f8680f = j;
        this.f8682h = z;
    }
}
