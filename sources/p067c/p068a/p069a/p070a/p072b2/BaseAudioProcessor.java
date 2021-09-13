package p067c.p068a.p069a.p070a.p072b2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p067c.p068a.p069a.p070a.p072b2.AudioProcessor.C0831a;
import p067c.p068a.p069a.p070a.p072b2.AudioProcessor.C0832b;

/* renamed from: c.a.a.a.b2.w */
public abstract class BaseAudioProcessor implements AudioProcessor {

    /* renamed from: b */
    protected C0831a f5616b;

    /* renamed from: c */
    protected C0831a f5617c;

    /* renamed from: d */
    private C0831a f5618d;

    /* renamed from: e */
    private C0831a f5619e;

    /* renamed from: f */
    private ByteBuffer f5620f;

    /* renamed from: g */
    private ByteBuffer f5621g;

    /* renamed from: h */
    private boolean f5622h;

    public BaseAudioProcessor() {
        ByteBuffer byteBuffer = AudioProcessor.f5556a;
        this.f5620f = byteBuffer;
        this.f5621g = byteBuffer;
        C0831a aVar = C0831a.f5557a;
        this.f5618d = aVar;
        this.f5619e = aVar;
        this.f5616b = aVar;
        this.f5617c = aVar;
    }

    /* renamed from: a */
    public ByteBuffer mo5824a() {
        ByteBuffer byteBuffer = this.f5621g;
        this.f5621g = AudioProcessor.f5556a;
        return byteBuffer;
    }

    /* renamed from: b */
    public boolean mo5825b() {
        return this.f5622h && this.f5621g == AudioProcessor.f5556a;
    }

    /* renamed from: c */
    public final void mo5826c() {
        this.f5622h = true;
        mo5812j();
    }

    /* renamed from: d */
    public boolean mo5810d() {
        return this.f5619e != C0831a.f5557a;
    }

    /* renamed from: f */
    public final C0831a mo5827f(C0831a aVar) throws C0832b {
        this.f5618d = aVar;
        this.f5619e = mo5766h(aVar);
        return mo5810d() ? this.f5619e : C0831a.f5557a;
    }

    public final void flush() {
        this.f5621g = AudioProcessor.f5556a;
        this.f5622h = false;
        this.f5616b = this.f5618d;
        this.f5617c = this.f5619e;
        mo5811i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo5921g() {
        return this.f5621g.hasRemaining();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract C0831a mo5766h(C0831a aVar) throws C0832b;

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo5811i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo5812j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo5813k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final ByteBuffer mo5922l(int i) {
        if (this.f5620f.capacity() < i) {
            this.f5620f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f5620f.clear();
        }
        ByteBuffer byteBuffer = this.f5620f;
        this.f5621g = byteBuffer;
        return byteBuffer;
    }

    public final void reset() {
        flush();
        this.f5620f = AudioProcessor.f5556a;
        C0831a aVar = C0831a.f5557a;
        this.f5618d = aVar;
        this.f5619e = aVar;
        this.f5616b = aVar;
        this.f5617c = aVar;
        mo5813k();
    }
}
