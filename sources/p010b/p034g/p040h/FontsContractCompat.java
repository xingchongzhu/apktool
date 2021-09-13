package p010b.p034g.p040h;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import p010b.p034g.p042j.Preconditions;

/* renamed from: b.g.h.f */
public class FontsContractCompat {

    /* renamed from: b.g.h.f$a */
    /* compiled from: FontsContractCompat */
    public static class C0593a {

        /* renamed from: a */
        private final int f4526a;

        /* renamed from: b */
        private final C0594b[] f4527b;

        @Deprecated
        public C0593a(int i, C0594b[] bVarArr) {
            this.f4526a = i;
            this.f4527b = bVarArr;
        }

        /* renamed from: a */
        static C0593a m5109a(int i, C0594b[] bVarArr) {
            return new C0593a(i, bVarArr);
        }

        /* renamed from: b */
        public C0594b[] mo4893b() {
            return this.f4527b;
        }

        /* renamed from: c */
        public int mo4894c() {
            return this.f4526a;
        }
    }

    /* renamed from: b.g.h.f$b */
    /* compiled from: FontsContractCompat */
    public static class C0594b {

        /* renamed from: a */
        private final Uri f4528a;

        /* renamed from: b */
        private final int f4529b;

        /* renamed from: c */
        private final int f4530c;

        /* renamed from: d */
        private final boolean f4531d;

        /* renamed from: e */
        private final int f4532e;

        @Deprecated
        public C0594b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f4528a = (Uri) Preconditions.m5188e(uri);
            this.f4529b = i;
            this.f4530c = i2;
            this.f4531d = z;
            this.f4532e = i3;
        }

        /* renamed from: a */
        static C0594b m5112a(Uri uri, int i, int i2, boolean z, int i3) {
            C0594b bVar = new C0594b(uri, i, i2, z, i3);
            return bVar;
        }

        /* renamed from: b */
        public int mo4895b() {
            return this.f4532e;
        }

        /* renamed from: c */
        public int mo4896c() {
            return this.f4529b;
        }

        /* renamed from: d */
        public Uri mo4897d() {
            return this.f4528a;
        }

        /* renamed from: e */
        public int mo4898e() {
            return this.f4530c;
        }

        /* renamed from: f */
        public boolean mo4899f() {
            return this.f4531d;
        }
    }

    /* renamed from: b.g.h.f$c */
    /* compiled from: FontsContractCompat */
    public static class C0595c {
        /* renamed from: a */
        public void mo4848a(int i) {
            throw null;
        }

        /* renamed from: b */
        public void mo4849b(Typeface typeface) {
            throw null;
        }
    }

    /* renamed from: a */
    public static Typeface m5108a(Context context, FontRequest dVar, int i, boolean z, int i2, Handler handler, C0595c cVar) {
        CallbackWithHandler aVar = new CallbackWithHandler(cVar, handler);
        if (z) {
            return FontRequestWorker.m5100e(context, dVar, aVar, i, i2);
        }
        return FontRequestWorker.m5099d(context, dVar, i, null, aVar);
    }
}
