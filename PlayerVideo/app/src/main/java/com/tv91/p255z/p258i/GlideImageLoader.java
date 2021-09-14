package com.tv91.p255z.p258i;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.C1630b;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p255z.C3065e;
import com.tv91.p255z.C3066f;
import com.tv91.p255z.ImageLoader;
import com.tv91.utils.FragmentUtils;
import com.tv91.utils.p249i.BiConsumer;

/* renamed from: com.tv91.z.i.a */
public final class GlideImageLoader implements C3066f {

    /* renamed from: a */
    private final Context f16210a;

    /* renamed from: b */
    private C3069c f16211b;

    /* renamed from: com.tv91.z.i.a$a */
    /* compiled from: GlideImageLoader */
    class C3072a implements C3067a {

        /* renamed from: a */
        final /* synthetic */ BiConsumer f16212a;

        C3072a(BiConsumer aVar) {
            this.f16212a = aVar;
        }

        /* renamed from: a */
        public void mo18698a(String str, Bitmap bitmap) {
            this.f16212a.mo18404a(str, bitmap);
        }

        /* renamed from: b */
        public /* synthetic */ void mo18699b(String str, ErrorBundle cVar) {
            C3065e.m20834a(this, str, cVar);
        }
    }

    /* renamed from: com.tv91.z.i.a$b */
    /* compiled from: GlideImageLoader */
    private static class C3073b extends CustomTarget<Bitmap> {

        /* renamed from: d */
        private final String f16214d;

        /* renamed from: e */
        private final C3067a f16215e;

        /* synthetic */ C3073b(String str, C3067a aVar, C3072a aVar2) {
            this(str, aVar);
        }

        /* renamed from: e */
        public void mo9522e(Drawable drawable) {
            this.f16215e.mo18699b(this.f16214d, new ErrorBundle());
        }

        /* renamed from: h */
        public void mo9314h(Drawable drawable) {
        }

        /* renamed from: l */
        public void mo9313d(Bitmap bitmap, C1630b<? super Bitmap> bVar) {
            this.f16215e.mo18698a(this.f16214d, bitmap);
        }

        private C3073b(String str, C3067a aVar) {
            this.f16214d = str;
            this.f16215e = aVar;
        }
    }

    /* renamed from: com.tv91.z.i.a$c */
    /* compiled from: GlideImageLoader */
    private static class C3074c extends GlideUrl {

        /* renamed from: i */
        private final String f16216i;

        public C3074c(String str, String str2) {
            super(str);
            this.f16216i = str2;
        }

        /* renamed from: c */
        public String mo9122c() {
            return this.f16216i;
        }
    }

    public GlideImageLoader(Context context) {
        this.f16210a = context;
    }

    /* renamed from: a */
    public C3069c mo18691a() {
        if (this.f16211b == null) {
            this.f16211b = new C3069c();
        }
        return this.f16211b;
    }

    /* renamed from: b */
    public /* synthetic */ C3066f mo18692b(String str) {
        return ImageLoader.m20830b(this, str);
    }

    /* renamed from: c */
    public /* synthetic */ C3066f mo18693c(int i) {
        return ImageLoader.m20829a(this, i);
    }

    /* renamed from: d */
    public /* synthetic */ C3066f mo18694d(int i, int i2) {
        return ImageLoader.m20832d(this, i, i2);
    }

    /* renamed from: e */
    public /* synthetic */ C3066f mo18695e(int i) {
        return ImageLoader.m20831c(this, i);
    }

    /* renamed from: f */
    public void mo18696f(BiConsumer<String, Bitmap> aVar) {
        C3069c cVar = this.f16211b;
        if (cVar == null || FragmentUtils.m20586g(cVar.mo18700a())) {
            this.f16211b = null;
            return;
        }
        C3069c cVar2 = this.f16211b;
        int i = cVar2.f16180c;
        int i2 = -1;
        if (i <= 0) {
            i = -1;
        }
        int i3 = cVar2.f16181d;
        if (i3 > 0) {
            i2 = i3;
        }
        RequestBuilder jVar = (RequestBuilder) ((RequestBuilder) ((RequestBuilder) ((RequestBuilder) Glide.m12390t(this.f16210a).mo8745m().mo8740y0(this.f16211b.mo18700a()).mo9467c0(new C3074c(this.f16211b.mo18700a(), this.f16211b.f16179b))).mo9460R(i, i2)).mo9461W(this.f16211b.f16184g)).mo9476h(this.f16211b.f16185h);
        if (this.f16211b.f16182e) {
            jVar = (RequestBuilder) jVar.mo9466c();
        }
        if (this.f16211b.f16183f > 0) {
            jVar = (RequestBuilder) jVar.mo9473f0(new RoundedCorners(this.f16211b.f16183f));
        }
        jVar.mo8736s0(new C3073b(this.f16211b.mo18700a(), new C3072a(aVar), null));
        this.f16211b = null;
    }

    /* renamed from: g */
    public void mo18697g(ImageView imageView) {
        C3069c cVar = this.f16211b;
        if (cVar == null || FragmentUtils.m20586g(cVar.mo18700a())) {
            this.f16211b = null;
            return;
        }
        C3069c cVar2 = this.f16211b;
        int i = cVar2.f16180c;
        int i2 = -1;
        if (i <= 0) {
            i = -1;
        }
        int i3 = cVar2.f16181d;
        if (i3 > 0) {
            i2 = i3;
        }
        RequestBuilder jVar = (RequestBuilder) ((RequestBuilder) ((RequestBuilder) ((RequestBuilder) Glide.m12391u(imageView).mo8754s(this.f16211b.mo18700a()).mo9467c0(new C3074c(this.f16211b.mo18700a(), this.f16211b.f16179b))).mo9460R(i, i2)).mo9461W(this.f16211b.f16184g)).mo9476h(this.f16211b.f16185h);
        if (this.f16211b.f16182e) {
            jVar = (RequestBuilder) jVar.mo9466c();
        }
        if (this.f16211b.f16183f > 0) {
            jVar = (RequestBuilder) jVar.mo9473f0(new RoundedCorners(this.f16211b.f16183f));
        }
        jVar.mo8738v0(imageView);
        this.f16211b = null;
    }
}
