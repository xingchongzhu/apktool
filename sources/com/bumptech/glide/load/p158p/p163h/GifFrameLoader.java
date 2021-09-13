package com.bumptech.glide.load.p158p.p163h;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.p152n.DiskCacheStrategy;
import com.bumptech.glide.load.p152n.p153a0.BitmapPool;
import com.bumptech.glide.p166n.GifDecoder;
import com.bumptech.glide.p170r.RequestOptions;
import com.bumptech.glide.p170r.p171j.CustomTarget;
import com.bumptech.glide.p170r.p172k.C1630b;
import com.bumptech.glide.p173s.ObjectKey;
import com.bumptech.glide.p174t.C1638j;
import com.bumptech.glide.p174t.C1639k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.p.h.g */
class GifFrameLoader {

    /* renamed from: a */
    private final GifDecoder f10944a;

    /* renamed from: b */
    private final Handler f10945b;

    /* renamed from: c */
    private final List<C1603b> f10946c;

    /* renamed from: d */
    final RequestManager f10947d;

    /* renamed from: e */
    private final BitmapPool f10948e;

    /* renamed from: f */
    private boolean f10949f;

    /* renamed from: g */
    private boolean f10950g;

    /* renamed from: h */
    private boolean f10951h;

    /* renamed from: i */
    private RequestBuilder<Bitmap> f10952i;

    /* renamed from: j */
    private C1602a f10953j;

    /* renamed from: k */
    private boolean f10954k;

    /* renamed from: l */
    private C1602a f10955l;

    /* renamed from: m */
    private Bitmap f10956m;

    /* renamed from: n */
    private Transformation<Bitmap> f10957n;

    /* renamed from: o */
    private C1602a f10958o;

    /* renamed from: p */
    private C1605d f10959p;

    /* renamed from: q */
    private int f10960q;

    /* renamed from: r */
    private int f10961r;

    /* renamed from: s */
    private int f10962s;

    /* renamed from: com.bumptech.glide.load.p.h.g$a */
    /* compiled from: GifFrameLoader */
    static class C1602a extends CustomTarget<Bitmap> {

        /* renamed from: d */
        private final Handler f10963d;

        /* renamed from: e */
        final int f10964e;

        /* renamed from: f */
        private final long f10965f;

        /* renamed from: g */
        private Bitmap f10966g;

        C1602a(Handler handler, int i, long j) {
            this.f10963d = handler;
            this.f10964e = i;
            this.f10965f = j;
        }

        /* renamed from: h */
        public void mo9314h(Drawable drawable) {
            this.f10966g = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public Bitmap mo9315l() {
            return this.f10966g;
        }

        /* renamed from: m */
        public void mo9313d(Bitmap bitmap, C1630b<? super Bitmap> bVar) {
            this.f10966g = bitmap;
            this.f10963d.sendMessageAtTime(this.f10963d.obtainMessage(1, this), this.f10965f);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.h.g$b */
    /* compiled from: GifFrameLoader */
    public interface C1603b {
        /* renamed from: a */
        void mo9276a();
    }

    /* renamed from: com.bumptech.glide.load.p.h.g$c */
    /* compiled from: GifFrameLoader */
    private class C1604c implements Callback {
        C1604c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                GifFrameLoader.this.mo9309m((C1602a) message.obj);
                return true;
            }
            if (i == 2) {
                GifFrameLoader.this.f10947d.mo8747o((C1602a) message.obj);
            }
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.p.h.g$d */
    /* compiled from: GifFrameLoader */
    interface C1605d {
        /* renamed from: a */
        void mo9318a();
    }

    GifFrameLoader(Glide bVar, GifDecoder aVar, int i, int i2, Transformation<Bitmap> mVar, Bitmap bitmap) {
        this(bVar.mo8686f(), Glide.m12390t(bVar.mo8688h()), aVar, null, m13555i(Glide.m12390t(bVar.mo8688h()), i, i2), mVar, bitmap);
    }

    /* renamed from: g */
    private static Key m13554g() {
        return new ObjectKey(Double.valueOf(Math.random()));
    }

    /* renamed from: i */
    private static RequestBuilder<Bitmap> m13555i(RequestManager kVar, int i, int i2) {
        return kVar.mo8745m().mo8730a(((RequestOptions) ((RequestOptions) RequestOptions.m13930l0(DiskCacheStrategy.f10556b).mo9482j0(true)).mo9470e0(true)).mo9460R(i, i2));
    }

    /* renamed from: l */
    private void m13556l() {
        if (this.f10949f && !this.f10950g) {
            if (this.f10951h) {
                C1638j.m14078a(this.f10958o == null, "Pending target must be null when starting from the first frame");
                this.f10944a.mo9357i();
                this.f10951h = false;
            }
            C1602a aVar = this.f10958o;
            if (aVar != null) {
                this.f10958o = null;
                mo9309m(aVar);
                return;
            }
            this.f10950g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f10944a.mo9353e());
            this.f10944a.mo9350c();
            this.f10955l = new C1602a(this.f10945b, this.f10944a.mo9348a(), uptimeMillis);
            this.f10952i.mo8730a(RequestOptions.m13931m0(m13554g())).mo8739x0(this.f10944a).mo8736s0(this.f10955l);
        }
    }

    /* renamed from: n */
    private void m13557n() {
        Bitmap bitmap = this.f10956m;
        if (bitmap != null) {
            this.f10948e.mo8883d(bitmap);
            this.f10956m = null;
        }
    }

    /* renamed from: p */
    private void m13558p() {
        if (!this.f10949f) {
            this.f10949f = true;
            this.f10954k = false;
            m13556l();
        }
    }

    /* renamed from: q */
    private void m13559q() {
        this.f10949f = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9300a() {
        this.f10946c.clear();
        m13557n();
        m13559q();
        C1602a aVar = this.f10953j;
        if (aVar != null) {
            this.f10947d.mo8747o(aVar);
            this.f10953j = null;
        }
        C1602a aVar2 = this.f10955l;
        if (aVar2 != null) {
            this.f10947d.mo8747o(aVar2);
            this.f10955l = null;
        }
        C1602a aVar3 = this.f10958o;
        if (aVar3 != null) {
            this.f10947d.mo8747o(aVar3);
            this.f10958o = null;
        }
        this.f10944a.clear();
        this.f10954k = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ByteBuffer mo9301b() {
        return this.f10944a.mo9356h().asReadOnlyBuffer();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Bitmap mo9302c() {
        C1602a aVar = this.f10953j;
        return aVar != null ? aVar.mo9315l() : this.f10956m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo9303d() {
        C1602a aVar = this.f10953j;
        if (aVar != null) {
            return aVar.f10964e;
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public Bitmap mo9304e() {
        return this.f10956m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo9305f() {
        return this.f10944a.mo9352d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public int mo9306h() {
        return this.f10962s;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo9307j() {
        return this.f10944a.mo9354f() + this.f10960q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public int mo9308k() {
        return this.f10961r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo9309m(C1602a aVar) {
        C1605d dVar = this.f10959p;
        if (dVar != null) {
            dVar.mo9318a();
        }
        this.f10950g = false;
        if (this.f10954k) {
            this.f10945b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f10949f) {
            if (this.f10951h) {
                this.f10945b.obtainMessage(2, aVar).sendToTarget();
            } else {
                this.f10958o = aVar;
            }
        } else {
            if (aVar.mo9315l() != null) {
                m13557n();
                C1602a aVar2 = this.f10953j;
                this.f10953j = aVar;
                for (int size = this.f10946c.size() - 1; size >= 0; size--) {
                    ((C1603b) this.f10946c.get(size)).mo9276a();
                }
                if (aVar2 != null) {
                    this.f10945b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            m13556l();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo9310o(Transformation<Bitmap> mVar, Bitmap bitmap) {
        this.f10957n = (Transformation) C1638j.m14081d(mVar);
        this.f10956m = (Bitmap) C1638j.m14081d(bitmap);
        this.f10952i = this.f10952i.mo8730a(new RequestOptions().mo9473f0(mVar));
        this.f10960q = C1639k.m14089g(bitmap);
        this.f10961r = bitmap.getWidth();
        this.f10962s = bitmap.getHeight();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo9311r(C1603b bVar) {
        if (this.f10954k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f10946c.contains(bVar)) {
            boolean isEmpty = this.f10946c.isEmpty();
            this.f10946c.add(bVar);
            if (isEmpty) {
                m13558p();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo9312s(C1603b bVar) {
        this.f10946c.remove(bVar);
        if (this.f10946c.isEmpty()) {
            m13559q();
        }
    }

    GifFrameLoader(BitmapPool eVar, RequestManager kVar, GifDecoder aVar, Handler handler, RequestBuilder<Bitmap> jVar, Transformation<Bitmap> mVar, Bitmap bitmap) {
        this.f10946c = new ArrayList();
        this.f10947d = kVar;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper(), new C1604c());
        }
        this.f10948e = eVar;
        this.f10945b = handler;
        this.f10952i = jVar;
        this.f10944a = aVar;
        mo9310o(mVar, bitmap);
    }
}
