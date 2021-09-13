package p067c.p068a.p069a.p070a.p088h2;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p067c.p068a.p069a.p070a.BaseRenderer;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.FormatHolder;
import p067c.p068a.p069a.p070a.RendererCapabilities;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.h2.g */
public final class MetadataRenderer extends BaseRenderer implements Callback {

    /* renamed from: m */
    private final MetadataDecoderFactory f7224m;

    /* renamed from: n */
    private final MetadataOutput f7225n;

    /* renamed from: o */
    private final Handler f7226o;

    /* renamed from: p */
    private final MetadataInputBuffer f7227p;

    /* renamed from: q */
    private final Metadata[] f7228q;

    /* renamed from: r */
    private final long[] f7229r;

    /* renamed from: s */
    private int f7230s;

    /* renamed from: t */
    private int f7231t;

    /* renamed from: u */
    private MetadataDecoder f7232u;

    /* renamed from: v */
    private boolean f7233v;

    /* renamed from: w */
    private boolean f7234w;

    /* renamed from: x */
    private long f7235x;

    public MetadataRenderer(MetadataOutput fVar, Looper looper) {
        this(fVar, looper, MetadataDecoderFactory.f7222a);
    }

    /* renamed from: O */
    private void m8705O(Metadata aVar, List<C1034b> list) {
        for (int i = 0; i < aVar.mo6552o(); i++) {
            Format f = aVar.mo6551n(i).mo6559f();
            if (f == null || !this.f7224m.mo6562a(f)) {
                list.add(aVar.mo6551n(i));
            } else {
                MetadataDecoder b = this.f7224m.mo6563b(f);
                byte[] bArr = (byte[]) Assertions.m10153e(aVar.mo6551n(i).mo6560i());
                this.f7227p.mo5947f();
                this.f7227p.mo5965o(bArr.length);
                ((ByteBuffer) Util.m10293i(this.f7227p.f5744c)).put(bArr);
                this.f7227p.mo5966p();
                Metadata a = b.mo6561a(this.f7227p);
                if (a != null) {
                    m8705O(a, list);
                }
            }
        }
    }

    /* renamed from: P */
    private void m8706P() {
        Arrays.fill(this.f7228q, null);
        this.f7230s = 0;
        this.f7231t = 0;
    }

    /* renamed from: Q */
    private void m8707Q(Metadata aVar) {
        Handler handler = this.f7226o;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            m8708R(aVar);
        }
    }

    /* renamed from: R */
    private void m8708R(Metadata aVar) {
        this.f7225n.mo6564y(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo5768F() {
        m8706P();
        this.f7232u = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo5770H(long j, boolean z) {
        m8706P();
        this.f7233v = false;
        this.f7234w = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo6476L(Format[] u0VarArr, long j, long j2) {
        this.f7232u = this.f7224m.mo6563b(u0VarArr[0]);
    }

    /* renamed from: a */
    public int mo6481a(Format u0Var) {
        if (!this.f7224m.mo6562a(u0Var)) {
            return RendererCapabilities.m10784a(0);
        }
        return RendererCapabilities.m10784a(u0Var.f8801G == null ? 4 : 2);
    }

    /* renamed from: b */
    public boolean mo5784b() {
        return this.f7234w;
    }

    /* renamed from: e */
    public boolean mo5786e() {
        return true;
    }

    public String getName() {
        return "MetadataRenderer";
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m8708R((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* renamed from: l */
    public void mo6490l(long j, long j2) {
        if (!this.f7233v && this.f7231t < 5) {
            this.f7227p.mo5947f();
            FormatHolder B = mo6511B();
            int M = mo6515M(B, this.f7227p, false);
            if (M == -4) {
                if (this.f7227p.mo5952k()) {
                    this.f7233v = true;
                } else {
                    MetadataInputBuffer eVar = this.f7227p;
                    eVar.f7223i = this.f7235x;
                    eVar.mo5966p();
                    Metadata a = ((MetadataDecoder) Util.m10293i(this.f7232u)).mo6561a(this.f7227p);
                    if (a != null) {
                        ArrayList arrayList = new ArrayList(a.mo6552o());
                        m8705O(a, arrayList);
                        if (!arrayList.isEmpty()) {
                            Metadata aVar = new Metadata((List<? extends C1034b>) arrayList);
                            int i = this.f7230s;
                            int i2 = this.f7231t;
                            int i3 = (i + i2) % 5;
                            this.f7228q[i3] = aVar;
                            this.f7229r[i3] = this.f7227p.f5746e;
                            this.f7231t = i2 + 1;
                        }
                    }
                }
            } else if (M == -5) {
                this.f7235x = ((Format) Assertions.m10153e(B.f8869b)).f8818p;
            }
        }
        if (this.f7231t > 0) {
            long[] jArr = this.f7229r;
            int i4 = this.f7230s;
            if (jArr[i4] <= j) {
                m8707Q((Metadata) Util.m10293i(this.f7228q[i4]));
                Metadata[] aVarArr = this.f7228q;
                int i5 = this.f7230s;
                aVarArr[i5] = null;
                this.f7230s = (i5 + 1) % 5;
                this.f7231t--;
            }
        }
        if (this.f7233v && this.f7231t == 0) {
            this.f7234w = true;
        }
    }

    public MetadataRenderer(MetadataOutput fVar, Looper looper, MetadataDecoderFactory dVar) {
        Handler handler;
        super(5);
        this.f7225n = (MetadataOutput) Assertions.m10153e(fVar);
        if (looper == null) {
            handler = null;
        } else {
            handler = Util.m10317u(looper, this);
        }
        this.f7226o = handler;
        this.f7224m = (MetadataDecoderFactory) Assertions.m10153e(dVar);
        this.f7227p = new MetadataInputBuffer();
        this.f7228q = new Metadata[5];
        this.f7229r = new long[5];
    }
}
