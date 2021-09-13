package com.tv91.p255z;

import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import com.tv91.p211s.ErrorBundle;
import com.tv91.utils.C3052g;
import com.tv91.utils.p249i.BiConsumer;

/* renamed from: com.tv91.z.f */
/* compiled from: ImageLoader */
public interface C3066f {

    /* renamed from: com.tv91.z.f$a */
    /* compiled from: ImageLoader */
    public interface C3067a {
        /* renamed from: a */
        void mo18698a(String str, Bitmap bitmap);

        /* renamed from: b */
        void mo18699b(String str, ErrorBundle cVar);
    }

    /* renamed from: com.tv91.z.f$b */
    /* compiled from: ImageLoader */
    public interface C3068b {
        /* renamed from: d */
        C3066f mo16916d();
    }

    /* renamed from: com.tv91.z.f$c */
    /* compiled from: ImageLoader */
    public static class C3069c {

        /* renamed from: a */
        private String f16178a;

        /* renamed from: b */
        public String f16179b;

        /* renamed from: c */
        public int f16180c;

        /* renamed from: d */
        public int f16181d;

        /* renamed from: e */
        public boolean f16182e;

        /* renamed from: f */
        public int f16183f;

        /* renamed from: g */
        public int f16184g;

        /* renamed from: h */
        public int f16185h;

        /* renamed from: b */
        private String m20845b(String str) {
            if (C3052g.m20586g(str)) {
                return "";
            }
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            if (lastPathSegment != null) {
                str = lastPathSegment;
            }
            return str;
        }

        /* renamed from: a */
        public String mo18700a() {
            return this.f16178a;
        }

        /* renamed from: c */
        public void mo18701c(String str) {
            this.f16178a = str;
            this.f16179b = m20845b(str);
        }
    }

    /* renamed from: a */
    C3069c mo18691a();

    /* renamed from: b */
    C3066f mo18692b(String str);

    /* renamed from: c */
    C3066f mo18693c(int i);

    /* renamed from: d */
    C3066f mo18694d(int i, int i2);

    /* renamed from: e */
    C3066f mo18695e(int i);

    /* renamed from: f */
    void mo18696f(BiConsumer<String, Bitmap> aVar);

    /* renamed from: g */
    void mo18697g(ImageView imageView);
}
