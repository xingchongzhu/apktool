package p067c.p068a.p069a.p070a.p100k2.p101n;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p067c.p068a.p069a.p070a.p073c2.OutputBuffer.C0855a;
import p067c.p068a.p069a.p070a.p100k2.Subtitle;
import p067c.p068a.p069a.p070a.p100k2.SubtitleDecoder;
import p067c.p068a.p069a.p070a.p100k2.SubtitleDecoderException;
import p067c.p068a.p069a.p070a.p100k2.SubtitleInputBuffer;
import p067c.p068a.p069a.p070a.p100k2.SubtitleOutputBuffer;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.k2.n.e */
abstract class CeaDecoder implements SubtitleDecoder {

    /* renamed from: a */
    private final ArrayDeque<C1129b> f7851a = new ArrayDeque<>();

    /* renamed from: b */
    private final ArrayDeque<SubtitleOutputBuffer> f7852b;

    /* renamed from: c */
    private final PriorityQueue<C1129b> f7853c;

    /* renamed from: d */
    private C1129b f7854d;

    /* renamed from: e */
    private long f7855e;

    /* renamed from: f */
    private long f7856f;

    /* renamed from: c.a.a.a.k2.n.e$b */
    /* compiled from: CeaDecoder */
    private static final class C1129b extends SubtitleInputBuffer implements Comparable<C1129b> {
        /* access modifiers changed from: private */

        /* renamed from: j */
        public long f7857j;

        private C1129b() {
        }

        /* renamed from: v */
        public int compareTo(C1129b bVar) {
            int i = 1;
            if (mo5952k() != bVar.mo5952k()) {
                if (!mo5952k()) {
                    i = -1;
                }
                return i;
            }
            long j = this.f5746e - bVar.f5746e;
            if (j == 0) {
                j = this.f7857j - bVar.f7857j;
                if (j == 0) {
                    return 0;
                }
            }
            if (j <= 0) {
                i = -1;
            }
            return i;
        }
    }

    /* renamed from: c.a.a.a.k2.n.e$c */
    /* compiled from: CeaDecoder */
    private static final class C1130c extends SubtitleOutputBuffer {

        /* renamed from: f */
        private C0855a<C1130c> f7858f;

        public C1130c(C0855a<C1130c> aVar) {
            this.f7858f = aVar;
        }

        /* renamed from: n */
        public final void mo5972n() {
            this.f7858f.mo5973a(this);
        }
    }

    public CeaDecoder() {
        for (int i = 0; i < 10; i++) {
            this.f7851a.add(new C1129b());
        }
        this.f7852b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f7852b.add(new C1130c(new C1122b(this)));
        }
        this.f7853c = new PriorityQueue<>();
    }

    /* renamed from: n */
    private void m9540n(C1129b bVar) {
        bVar.mo5947f();
        this.f7851a.add(bVar);
    }

    /* renamed from: a */
    public void mo5958a() {
    }

    /* renamed from: b */
    public void mo7055b(long j) {
        this.f7855e = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract Subtitle mo7071f();

    public void flush() {
        this.f7856f = 0;
        this.f7855e = 0;
        while (!this.f7853c.isEmpty()) {
            m9540n((C1129b) Util.m10293i((C1129b) this.f7853c.poll()));
        }
        C1129b bVar = this.f7854d;
        if (bVar != null) {
            m9540n(bVar);
            this.f7854d = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo7072g(SubtitleInputBuffer jVar);

    /* renamed from: h */
    public SubtitleInputBuffer mo5961e() throws SubtitleDecoderException {
        Assertions.m10154f(this.f7854d == null);
        if (this.f7851a.isEmpty()) {
            return null;
        }
        C1129b bVar = (C1129b) this.f7851a.pollFirst();
        this.f7854d = bVar;
        return bVar;
    }

    /* renamed from: i */
    public SubtitleOutputBuffer mo5960d() throws SubtitleDecoderException {
        if (this.f7852b.isEmpty()) {
            return null;
        }
        while (!this.f7853c.isEmpty() && ((C1129b) Util.m10293i((C1129b) this.f7853c.peek())).f5746e <= this.f7855e) {
            C1129b bVar = (C1129b) Util.m10293i((C1129b) this.f7853c.poll());
            if (bVar.mo5952k()) {
                SubtitleOutputBuffer kVar = (SubtitleOutputBuffer) Util.m10293i((SubtitleOutputBuffer) this.f7852b.pollFirst());
                kVar.mo5946e(4);
                m9540n(bVar);
                return kVar;
            }
            mo7072g(bVar);
            if (mo7075l()) {
                SubtitleOutputBuffer kVar2 = (SubtitleOutputBuffer) Util.m10293i((SubtitleOutputBuffer) this.f7852b.pollFirst());
                SubtitleOutputBuffer kVar3 = kVar2;
                kVar3.mo7066o(bVar.f5746e, mo7071f(), Long.MAX_VALUE);
                m9540n(bVar);
                return kVar2;
            }
            m9540n(bVar);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final SubtitleOutputBuffer mo7101j() {
        return (SubtitleOutputBuffer) this.f7852b.pollFirst();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final long mo7102k() {
        return this.f7855e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract boolean mo7075l();

    /* renamed from: m */
    public void mo5959c(SubtitleInputBuffer jVar) throws SubtitleDecoderException {
        Assertions.m10149a(jVar == this.f7854d);
        C1129b bVar = (C1129b) jVar;
        if (bVar.mo5951j()) {
            m9540n(bVar);
        } else {
            long j = this.f7856f;
            this.f7856f = 1 + j;
            bVar.f7857j = j;
            this.f7853c.add(bVar);
        }
        this.f7854d = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo7103o(SubtitleOutputBuffer kVar) {
        kVar.mo5947f();
        this.f7852b.add(kVar);
    }
}
