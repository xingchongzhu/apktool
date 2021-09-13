package p067c.p068a.p069a.p070a.p110l2;

import android.util.Pair;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.C1240r1;
import p067c.p068a.p069a.p070a.ExoPlaybackException;
import p067c.p068a.p069a.p070a.RendererCapabilities;
import p067c.p068a.p069a.p070a.RendererConfiguration;
import p067c.p068a.p069a.p070a.Timeline;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a;
import p067c.p068a.p069a.p070a.p097j2.TrackGroup;
import p067c.p068a.p069a.p070a.p097j2.TrackGroupArray;
import p067c.p068a.p069a.p070a.p111m2.MimeTypes;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.l2.j */
public abstract class MappingTrackSelector extends TrackSelector {

    /* renamed from: c */
    private C1177a f8276c;

    /* renamed from: c.a.a.a.l2.j$a */
    /* compiled from: MappingTrackSelector */
    public static final class C1177a {

        /* renamed from: a */
        private final int f8277a;

        /* renamed from: b */
        private final String[] f8278b;

        /* renamed from: c */
        private final int[] f8279c;

        /* renamed from: d */
        private final TrackGroupArray[] f8280d;

        /* renamed from: e */
        private final int[] f8281e;

        /* renamed from: f */
        private final int[][][] f8282f;

        /* renamed from: g */
        private final TrackGroupArray f8283g;

        C1177a(String[] strArr, int[] iArr, TrackGroupArray[] q0VarArr, int[] iArr2, int[][][] iArr3, TrackGroupArray q0Var) {
            this.f8278b = strArr;
            this.f8279c = iArr;
            this.f8280d = q0VarArr;
            this.f8282f = iArr3;
            this.f8281e = iArr2;
            this.f8283g = q0Var;
            this.f8277a = iArr.length;
        }

        /* renamed from: a */
        public int mo7315a(int i, int i2, boolean z) {
            int i3 = this.f8280d[i].mo6988l(i2).f7606a;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int f = mo7320f(i, i2, i5);
                if (f == 4 || (z && f == 3)) {
                    int i6 = i4 + 1;
                    iArr[i4] = i5;
                    i4 = i6;
                }
            }
            return mo7316b(i, i2, Arrays.copyOf(iArr, i4));
        }

        /* renamed from: b */
        public int mo7316b(int i, int i2, int[] iArr) {
            int i3 = 0;
            Object obj = null;
            boolean z = false;
            int i4 = 0;
            int i5 = 16;
            while (i3 < iArr.length) {
                String str = this.f8280d[i].mo6988l(i2).mo6977l(iArr[i3]).f8814l;
                int i6 = i4 + 1;
                if (i4 == 0) {
                    obj = str;
                } else {
                    z |= !Util.m10279b(obj, str);
                }
                i5 = Math.min(i5, RendererCapabilities.m10786c(this.f8282f[i][i2][i3]));
                i3++;
                i4 = i6;
            }
            return z ? Math.min(i5, this.f8281e[i]) : i5;
        }

        /* renamed from: c */
        public int mo7317c() {
            return this.f8277a;
        }

        /* renamed from: d */
        public int mo7318d(int i) {
            return this.f8279c[i];
        }

        /* renamed from: e */
        public TrackGroupArray mo7319e(int i) {
            return this.f8280d[i];
        }

        /* renamed from: f */
        public int mo7320f(int i, int i2, int i3) {
            return RendererCapabilities.m10787d(this.f8282f[i][i2][i3]);
        }
    }

    /* renamed from: e */
    private static int m10024e(C1240r1[] r1VarArr, TrackGroup p0Var, int[] iArr, boolean z) throws ExoPlaybackException {
        int length = r1VarArr.length;
        int i = 0;
        boolean z2 = true;
        for (int i2 = 0; i2 < r1VarArr.length; i2++) {
            C1240r1 r1Var = r1VarArr[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < p0Var.f7606a; i4++) {
                i3 = Math.max(i3, RendererCapabilities.m10787d(r1Var.mo6481a(p0Var.mo6977l(i4))));
            }
            boolean z3 = iArr[i2] == 0;
            if (i3 > i || (i3 == i && z && !z2 && z3)) {
                length = i2;
                z2 = z3;
                i = i3;
            }
        }
        return length;
    }

    /* renamed from: f */
    private static int[] m10025f(C1240r1 r1Var, TrackGroup p0Var) throws ExoPlaybackException {
        int[] iArr = new int[p0Var.f7606a];
        for (int i = 0; i < p0Var.f7606a; i++) {
            iArr[i] = r1Var.mo6481a(p0Var.mo6977l(i));
        }
        return iArr;
    }

    /* renamed from: g */
    private static int[] m10026g(C1240r1[] r1VarArr) throws ExoPlaybackException {
        int length = r1VarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = r1VarArr[i].mo6488k();
        }
        return iArr;
    }

    /* renamed from: c */
    public final void mo7313c(Object obj) {
        this.f8276c = (C1177a) obj;
    }

    /* renamed from: d */
    public final TrackSelectorResult mo7314d(C1240r1[] r1VarArr, TrackGroupArray q0Var, C1081a aVar, Timeline x1Var) throws ExoPlaybackException {
        int[] iArr;
        C1240r1[] r1VarArr2 = r1VarArr;
        TrackGroupArray q0Var2 = q0Var;
        int[] iArr2 = new int[(r1VarArr2.length + 1)];
        int length = r1VarArr2.length + 1;
        TrackGroup[][] p0VarArr = new TrackGroup[length][];
        int[][][] iArr3 = new int[(r1VarArr2.length + 1)][][];
        for (int i = 0; i < length; i++) {
            int i2 = q0Var2.f7610b;
            p0VarArr[i] = new TrackGroup[i2];
            iArr3[i] = new int[i2][];
        }
        int[] g = m10026g(r1VarArr);
        for (int i3 = 0; i3 < q0Var2.f7610b; i3++) {
            TrackGroup l = q0Var2.mo6988l(i3);
            int e = m10024e(r1VarArr, l, iArr2, MimeTypes.m10405k(l.mo6977l(0).f8814l) == 5);
            if (e == r1VarArr2.length) {
                iArr = new int[l.f7606a];
            } else {
                iArr = m10025f(r1VarArr2[e], l);
            }
            int i4 = iArr2[e];
            p0VarArr[e][i4] = l;
            iArr3[e][i4] = iArr;
            iArr2[e] = iArr2[e] + 1;
        }
        TrackGroupArray[] q0VarArr = new TrackGroupArray[r1VarArr2.length];
        String[] strArr = new String[r1VarArr2.length];
        int[] iArr4 = new int[r1VarArr2.length];
        for (int i5 = 0; i5 < r1VarArr2.length; i5++) {
            int i6 = iArr2[i5];
            q0VarArr[i5] = new TrackGroupArray((TrackGroup[]) Util.m10320v0(p0VarArr[i5], i6));
            iArr3[i5] = (int[][]) Util.m10320v0(iArr3[i5], i6);
            strArr[i5] = r1VarArr2[i5].getName();
            iArr4[i5] = r1VarArr2[i5].mo6518g();
        }
        C1177a aVar2 = new C1177a(strArr, iArr4, q0VarArr, g, iArr3, new TrackGroupArray((TrackGroup[]) Util.m10320v0(p0VarArr[r1VarArr2.length], iArr2[r1VarArr2.length])));
        Pair h = mo7278h(aVar2, iArr3, g, aVar, x1Var);
        return new TrackSelectorResult((RendererConfiguration[]) h.first, (C1174h[]) h.second, aVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract Pair<RendererConfiguration[], C1174h[]> mo7278h(C1177a aVar, int[][][] iArr, int[] iArr2, C1081a aVar2, Timeline x1Var) throws ExoPlaybackException;
}
