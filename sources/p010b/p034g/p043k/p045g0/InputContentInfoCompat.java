package p010b.p034g.p043k.p045g0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.inputmethod.InputContentInfo;

/* renamed from: b.g.k.g0.c */
public final class InputContentInfoCompat {

    /* renamed from: a */
    private final C0654c f4720a;

    /* renamed from: b.g.k.g0.c$a */
    /* compiled from: InputContentInfoCompat */
    private static final class C0652a implements C0654c {

        /* renamed from: a */
        final InputContentInfo f4721a;

        C0652a(Object obj) {
            this.f4721a = (InputContentInfo) obj;
        }

        /* renamed from: a */
        public ClipDescription mo5123a() {
            return this.f4721a.getDescription();
        }

        /* renamed from: b */
        public Object mo5124b() {
            return this.f4721a;
        }

        /* renamed from: c */
        public Uri mo5125c() {
            return this.f4721a.getContentUri();
        }

        /* renamed from: d */
        public void mo5126d() {
            this.f4721a.requestPermission();
        }

        /* renamed from: e */
        public Uri mo5127e() {
            return this.f4721a.getLinkUri();
        }

        C0652a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f4721a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    /* renamed from: b.g.k.g0.c$b */
    /* compiled from: InputContentInfoCompat */
    private static final class C0653b implements C0654c {

        /* renamed from: a */
        private final Uri f4722a;

        /* renamed from: b */
        private final ClipDescription f4723b;

        /* renamed from: c */
        private final Uri f4724c;

        C0653b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f4722a = uri;
            this.f4723b = clipDescription;
            this.f4724c = uri2;
        }

        /* renamed from: a */
        public ClipDescription mo5123a() {
            return this.f4723b;
        }

        /* renamed from: b */
        public Object mo5124b() {
            return null;
        }

        /* renamed from: c */
        public Uri mo5125c() {
            return this.f4722a;
        }

        /* renamed from: d */
        public void mo5126d() {
        }

        /* renamed from: e */
        public Uri mo5127e() {
            return this.f4724c;
        }
    }

    /* renamed from: b.g.k.g0.c$c */
    /* compiled from: InputContentInfoCompat */
    private interface C0654c {
        /* renamed from: a */
        ClipDescription mo5123a();

        /* renamed from: b */
        Object mo5124b();

        /* renamed from: c */
        Uri mo5125c();

        /* renamed from: d */
        void mo5126d();

        /* renamed from: e */
        Uri mo5127e();
    }

    public InputContentInfoCompat(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (VERSION.SDK_INT >= 25) {
            this.f4720a = new C0652a(uri, clipDescription, uri2);
        } else {
            this.f4720a = new C0653b(uri, clipDescription, uri2);
        }
    }

    /* renamed from: f */
    public static InputContentInfoCompat m5442f(Object obj) {
        if (obj != null && VERSION.SDK_INT >= 25) {
            return new InputContentInfoCompat(new C0652a(obj));
        }
        return null;
    }

    /* renamed from: a */
    public Uri mo5118a() {
        return this.f4720a.mo5125c();
    }

    /* renamed from: b */
    public ClipDescription mo5119b() {
        return this.f4720a.mo5123a();
    }

    /* renamed from: c */
    public Uri mo5120c() {
        return this.f4720a.mo5127e();
    }

    /* renamed from: d */
    public void mo5121d() {
        this.f4720a.mo5126d();
    }

    /* renamed from: e */
    public Object mo5122e() {
        return this.f4720a.mo5124b();
    }

    private InputContentInfoCompat(C0654c cVar) {
        this.f4720a = cVar;
    }
}
