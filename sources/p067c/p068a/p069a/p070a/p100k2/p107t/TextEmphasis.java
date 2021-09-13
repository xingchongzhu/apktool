package p067c.p068a.p069a.p070a.p100k2.p107t;

import android.text.TextUtils;
import com.efs.sdk.base.Constants;
import java.util.regex.Pattern;
import p067c.p068a.p134b.p136b.ImmutableSet;

/* renamed from: c.a.a.a.k2.t.b */
final class TextEmphasis {

    /* renamed from: a */
    private static final Pattern f7975a = Pattern.compile("\\s+");

    /* renamed from: b */
    private static final ImmutableSet<String> f7976b = ImmutableSet.m12000q("auto", Constants.CP_NONE);

    /* renamed from: c */
    private static final ImmutableSet<String> f7977c = ImmutableSet.m12001r("dot", "sesame", "circle");

    /* renamed from: d */
    private static final ImmutableSet<String> f7978d = ImmutableSet.m12000q("filled", "open");

    /* renamed from: e */
    private static final ImmutableSet<String> f7979e = ImmutableSet.m12001r("after", "before", "outside");

    /* renamed from: f */
    public final int f7980f;

    /* renamed from: g */
    public final int f7981g;

    /* renamed from: h */
    public final int f7982h;

    private TextEmphasis(int i, int i2, int i3) {
        this.f7980f = i;
        this.f7981g = i2;
        this.f7982h = i3;
    }

    /* renamed from: a */
    public static TextEmphasis m9642a(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        return m9643b(ImmutableSet.m11997l(TextUtils.split(trim, f7975a)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0081, code lost:
        if (r9.equals("auto") != false) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0115  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p067c.p068a.p069a.p070a.p100k2.p107t.TextEmphasis m9643b(p067c.p068a.p134b.p136b.ImmutableSet<java.lang.String> r9) {
        /*
            c.a.b.b.v<java.lang.String> r0 = f7979e
            c.a.b.b.r0$c r0 = p067c.p068a.p134b.p136b.C1381r0.m11939c(r0, r9)
            java.lang.String r1 = "outside"
            java.lang.Object r0 = p067c.p068a.p134b.p136b.Iterables.m12007b(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r2 = r0.hashCode()
            r3 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            r4 = 2
            r5 = -1
            r6 = 0
            r7 = 1
            if (r2 == r3) goto L_0x0038
            r3 = -1106037339(0xffffffffbe1335a5, float:-0.14375933)
            if (r2 == r3) goto L_0x0030
            r1 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r2 == r1) goto L_0x0026
            goto L_0x0042
        L_0x0026:
            java.lang.String r1 = "after"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0042
            r0 = 0
            goto L_0x0043
        L_0x0030:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0042
            r0 = 1
            goto L_0x0043
        L_0x0038:
            java.lang.String r1 = "before"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0042
            r0 = 2
            goto L_0x0043
        L_0x0042:
            r0 = -1
        L_0x0043:
            if (r0 == 0) goto L_0x004b
            if (r0 == r7) goto L_0x0049
            r0 = 1
            goto L_0x004c
        L_0x0049:
            r0 = -2
            goto L_0x004c
        L_0x004b:
            r0 = 2
        L_0x004c:
            c.a.b.b.v<java.lang.String> r1 = f7976b
            c.a.b.b.r0$c r1 = p067c.p068a.p134b.p136b.C1381r0.m11939c(r1, r9)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x008f
            java.util.Iterator r9 = r1.iterator()
            java.lang.Object r9 = r9.next()
            java.lang.String r9 = (java.lang.String) r9
            int r1 = r9.hashCode()
            r2 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r1 == r2) goto L_0x007b
            r2 = 3387192(0x33af38, float:4.746467E-39)
            if (r1 == r2) goto L_0x0071
            goto L_0x0084
        L_0x0071:
            java.lang.String r1 = "none"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x0084
            r7 = 0
            goto L_0x0085
        L_0x007b:
            java.lang.String r1 = "auto"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r7 = -1
        L_0x0085:
            if (r7 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r5 = 0
        L_0x0089:
            c.a.a.a.k2.t.b r9 = new c.a.a.a.k2.t.b
            r9.<init>(r5, r6, r0)
            return r9
        L_0x008f:
            c.a.b.b.v<java.lang.String> r1 = f7978d
            c.a.b.b.r0$c r1 = p067c.p068a.p134b.p136b.C1381r0.m11939c(r1, r9)
            c.a.b.b.v<java.lang.String> r2 = f7977c
            c.a.b.b.r0$c r9 = p067c.p068a.p134b.p136b.C1381r0.m11939c(r2, r9)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x00ad
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L_0x00ad
            c.a.a.a.k2.t.b r9 = new c.a.a.a.k2.t.b
            r9.<init>(r5, r6, r0)
            return r9
        L_0x00ad:
            java.lang.String r2 = "filled"
            java.lang.Object r1 = p067c.p068a.p134b.p136b.Iterables.m12007b(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r1.hashCode()
            r8 = -1274499742(0xffffffffb408ad62, float:-1.2729063E-7)
            if (r3 == r8) goto L_0x00ce
            r2 = 3417674(0x34264a, float:4.789181E-39)
            if (r3 == r2) goto L_0x00c4
            goto L_0x00d6
        L_0x00c4:
            java.lang.String r2 = "open"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00d6
            r1 = 0
            goto L_0x00d7
        L_0x00ce:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00d6
            r1 = 1
            goto L_0x00d7
        L_0x00d6:
            r1 = -1
        L_0x00d7:
            if (r1 == 0) goto L_0x00db
            r1 = 1
            goto L_0x00dc
        L_0x00db:
            r1 = 2
        L_0x00dc:
            java.lang.String r2 = "circle"
            java.lang.Object r9 = p067c.p068a.p134b.p136b.Iterables.m12007b(r9, r2)
            java.lang.String r9 = (java.lang.String) r9
            int r3 = r9.hashCode()
            r8 = -1360216880(0xffffffffaeecbcd0, float:-1.0765577E-10)
            if (r3 == r8) goto L_0x010c
            r2 = -905816648(0xffffffffca0255b8, float:-2135406.0)
            if (r3 == r2) goto L_0x0102
            r2 = 99657(0x18549, float:1.39649E-40)
            if (r3 == r2) goto L_0x00f8
            goto L_0x0113
        L_0x00f8:
            java.lang.String r2 = "dot"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0113
            r5 = 0
            goto L_0x0113
        L_0x0102:
            java.lang.String r2 = "sesame"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0113
            r5 = 1
            goto L_0x0113
        L_0x010c:
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0113
            r5 = 2
        L_0x0113:
            if (r5 == 0) goto L_0x011a
            if (r5 == r7) goto L_0x0119
            r4 = 1
            goto L_0x011a
        L_0x0119:
            r4 = 3
        L_0x011a:
            c.a.a.a.k2.t.b r9 = new c.a.a.a.k2.t.b
            r9.<init>(r4, r1, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p100k2.p107t.TextEmphasis.m9643b(c.a.b.b.v):c.a.a.a.k2.t.b");
    }
}
