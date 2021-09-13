package p010b.p034g.p043k;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import p010b.p034g.p042j.Preconditions;

/* renamed from: b.g.k.c */
public final class ContentInfoCompat {

    /* renamed from: a */
    final ClipData f4611a;

    /* renamed from: b */
    final int f4612b;

    /* renamed from: c */
    final int f4613c;

    /* renamed from: d */
    final Uri f4614d;

    /* renamed from: e */
    final Bundle f4615e;

    /* renamed from: b.g.k.c$a */
    /* compiled from: ContentInfoCompat */
    public static final class C0619a {

        /* renamed from: a */
        ClipData f4616a;

        /* renamed from: b */
        int f4617b;

        /* renamed from: c */
        int f4618c;

        /* renamed from: d */
        Uri f4619d;

        /* renamed from: e */
        Bundle f4620e;

        public C0619a(ClipData clipData, int i) {
            this.f4616a = clipData;
            this.f4617b = i;
        }

        /* renamed from: a */
        public ContentInfoCompat mo4978a() {
            return new ContentInfoCompat(this);
        }

        /* renamed from: b */
        public C0619a mo4979b(Bundle bundle) {
            this.f4620e = bundle;
            return this;
        }

        /* renamed from: c */
        public C0619a mo4980c(int i) {
            this.f4618c = i;
            return this;
        }

        /* renamed from: d */
        public C0619a mo4981d(Uri uri) {
            this.f4619d = uri;
            return this;
        }
    }

    ContentInfoCompat(C0619a aVar) {
        this.f4611a = (ClipData) Preconditions.m5188e(aVar.f4616a);
        this.f4612b = Preconditions.m5185b(aVar.f4617b, 0, 3, "source");
        this.f4613c = Preconditions.m5187d(aVar.f4618c, 1);
        this.f4614d = aVar.f4619d;
        this.f4615e = aVar.f4620e;
    }

    /* renamed from: a */
    static String m5231a(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    /* renamed from: e */
    static String m5232e(int i) {
        if (i == 0) {
            return "SOURCE_APP";
        }
        if (i == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i != 2) {
            return i != 3 ? String.valueOf(i) : "SOURCE_DRAG_AND_DROP";
        }
        return "SOURCE_INPUT_METHOD";
    }

    /* renamed from: b */
    public ClipData mo4974b() {
        return this.f4611a;
    }

    /* renamed from: c */
    public int mo4975c() {
        return this.f4613c;
    }

    /* renamed from: d */
    public int mo4976d() {
        return this.f4612b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContentInfoCompat{clip=");
        sb.append(this.f4611a);
        sb.append(", source=");
        sb.append(m5232e(this.f4612b));
        sb.append(", flags=");
        sb.append(m5231a(this.f4613c));
        sb.append(", linkUri=");
        sb.append(this.f4614d);
        sb.append(", extras=");
        sb.append(this.f4615e);
        sb.append("}");
        return sb.toString();
    }
}
