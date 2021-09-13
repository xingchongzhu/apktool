package p067c.p068a.p069a.p070a.p100k2;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.BaseRenderer;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.FormatHolder;
import p067c.p068a.p069a.p070a.RendererCapabilities;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.MimeTypes;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.k2.m */
public final class TextRenderer extends BaseRenderer implements Callback {

    /* renamed from: A */
    private long f7746A;

    /* renamed from: m */
    private final Handler f7747m;

    /* renamed from: n */
    private final TextOutput f7748n;

    /* renamed from: o */
    private final SubtitleDecoderFactory f7749o;

    /* renamed from: p */
    private final FormatHolder f7750p;

    /* renamed from: q */
    private boolean f7751q;

    /* renamed from: r */
    private boolean f7752r;

    /* renamed from: s */
    private boolean f7753s;

    /* renamed from: t */
    private int f7754t;

    /* renamed from: u */
    private Format f7755u;

    /* renamed from: v */
    private SubtitleDecoder f7756v;

    /* renamed from: w */
    private SubtitleInputBuffer f7757w;

    /* renamed from: x */
    private SubtitleOutputBuffer f7758x;

    /* renamed from: y */
    private SubtitleOutputBuffer f7759y;

    /* renamed from: z */
    private int f7760z;

    public TextRenderer(TextOutput lVar, Looper looper) {
        this(lVar, looper, SubtitleDecoderFactory.f7742a);
    }

    /* renamed from: O */
    private void m9424O() {
        m9432X(Collections.emptyList());
    }

    /* renamed from: P */
    private long m9425P() {
        long j = Long.MAX_VALUE;
        if (this.f7760z == -1) {
            return Long.MAX_VALUE;
        }
        Assertions.m10153e(this.f7758x);
        if (this.f7760z < this.f7758x.mo7063d()) {
            j = this.f7758x.mo7061b(this.f7760z);
        }
        return j;
    }

    /* renamed from: Q */
    private void m9426Q(SubtitleDecoderException hVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(this.f7755u);
        Log.m10382d("TextRenderer", sb.toString(), hVar);
        m9424O();
        m9431V();
    }

    /* renamed from: R */
    private void m9427R() {
        this.f7753s = true;
        this.f7756v = this.f7749o.mo7065b((Format) Assertions.m10153e(this.f7755u));
    }

    /* renamed from: S */
    private void m9428S(List<Cue> list) {
        this.f7748n.mo7067t(list);
    }

    /* renamed from: T */
    private void m9429T() {
        this.f7757w = null;
        this.f7760z = -1;
        SubtitleOutputBuffer kVar = this.f7758x;
        if (kVar != null) {
            kVar.mo5972n();
            this.f7758x = null;
        }
        SubtitleOutputBuffer kVar2 = this.f7759y;
        if (kVar2 != null) {
            kVar2.mo5972n();
            this.f7759y = null;
        }
    }

    /* renamed from: U */
    private void m9430U() {
        m9429T();
        ((SubtitleDecoder) Assertions.m10153e(this.f7756v)).mo5958a();
        this.f7756v = null;
        this.f7754t = 0;
    }

    /* renamed from: V */
    private void m9431V() {
        m9430U();
        m9427R();
    }

    /* renamed from: X */
    private void m9432X(List<Cue> list) {
        Handler handler = this.f7747m;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            m9428S(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo5768F() {
        this.f7755u = null;
        this.f7746A = -9223372036854775807L;
        m9424O();
        m9430U();
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo5770H(long j, boolean z) {
        m9424O();
        this.f7751q = false;
        this.f7752r = false;
        this.f7746A = -9223372036854775807L;
        if (this.f7754t != 0) {
            m9431V();
            return;
        }
        m9429T();
        ((SubtitleDecoder) Assertions.m10153e(this.f7756v)).flush();
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo6476L(Format[] u0VarArr, long j, long j2) {
        this.f7755u = u0VarArr[0];
        if (this.f7756v != null) {
            this.f7754t = 1;
        } else {
            m9427R();
        }
    }

    /* renamed from: W */
    public void mo7068W(long j) {
        Assertions.m10154f(mo6532t());
        this.f7746A = j;
    }

    /* renamed from: a */
    public int mo6481a(Format u0Var) {
        if (this.f7749o.mo7064a(u0Var)) {
            return RendererCapabilities.m10784a(u0Var.f8801G == null ? 4 : 2);
        } else if (MimeTypes.m10410p(u0Var.f8814l)) {
            return RendererCapabilities.m10784a(1);
        } else {
            return RendererCapabilities.m10784a(0);
        }
    }

    /* renamed from: b */
    public boolean mo5784b() {
        return this.f7752r;
    }

    /* renamed from: e */
    public boolean mo5786e() {
        return true;
    }

    public String getName() {
        return "TextRenderer";
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m9428S((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* renamed from: l */
    public void mo6490l(long j, long j2) {
        boolean z;
        if (mo6532t()) {
            long j3 = this.f7746A;
            if (j3 != -9223372036854775807L && j >= j3) {
                m9429T();
                this.f7752r = true;
            }
        }
        if (!this.f7752r) {
            if (this.f7759y == null) {
                ((SubtitleDecoder) Assertions.m10153e(this.f7756v)).mo7055b(j);
                try {
                    this.f7759y = (SubtitleOutputBuffer) ((SubtitleDecoder) Assertions.m10153e(this.f7756v)).mo5960d();
                } catch (SubtitleDecoderException e) {
                    m9426Q(e);
                    return;
                }
            }
            if (getState() == 2) {
                if (this.f7758x != null) {
                    long P = m9425P();
                    z = false;
                    while (P <= j) {
                        this.f7760z++;
                        P = m9425P();
                        z = true;
                    }
                } else {
                    z = false;
                }
                SubtitleOutputBuffer kVar = this.f7759y;
                if (kVar != null) {
                    if (kVar.mo5952k()) {
                        if (!z && m9425P() == Long.MAX_VALUE) {
                            if (this.f7754t == 2) {
                                m9431V();
                            } else {
                                m9429T();
                                this.f7752r = true;
                            }
                        }
                    } else if (kVar.f5757b <= j) {
                        SubtitleOutputBuffer kVar2 = this.f7758x;
                        if (kVar2 != null) {
                            kVar2.mo5972n();
                        }
                        this.f7760z = kVar.mo7060a(j);
                        this.f7758x = kVar;
                        this.f7759y = null;
                        z = true;
                    }
                }
                if (z) {
                    Assertions.m10153e(this.f7758x);
                    m9432X(this.f7758x.mo7062c(j));
                }
                if (this.f7754t != 2) {
                    while (!this.f7751q) {
                        try {
                            SubtitleInputBuffer jVar = this.f7757w;
                            if (jVar == null) {
                                jVar = (SubtitleInputBuffer) ((SubtitleDecoder) Assertions.m10153e(this.f7756v)).mo5961e();
                                if (jVar != null) {
                                    this.f7757w = jVar;
                                } else {
                                    return;
                                }
                            }
                            if (this.f7754t == 1) {
                                jVar.mo5954m(4);
                                ((SubtitleDecoder) Assertions.m10153e(this.f7756v)).mo5959c(jVar);
                                this.f7757w = null;
                                this.f7754t = 2;
                                return;
                            }
                            int M = mo6515M(this.f7750p, jVar, false);
                            if (M == -4) {
                                if (jVar.mo5952k()) {
                                    this.f7751q = true;
                                    this.f7753s = false;
                                } else {
                                    Format u0Var = this.f7750p.f8869b;
                                    if (u0Var != null) {
                                        jVar.f7743i = u0Var.f8818p;
                                        jVar.mo5966p();
                                        this.f7753s &= !jVar.mo5953l();
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.f7753s) {
                                    ((SubtitleDecoder) Assertions.m10153e(this.f7756v)).mo5959c(jVar);
                                    this.f7757w = null;
                                }
                            } else if (M == -3) {
                                return;
                            }
                        } catch (SubtitleDecoderException e2) {
                            m9426Q(e2);
                        }
                    }
                }
            }
        }
    }

    public TextRenderer(TextOutput lVar, Looper looper, SubtitleDecoderFactory iVar) {
        Handler handler;
        super(3);
        this.f7748n = (TextOutput) Assertions.m10153e(lVar);
        if (looper == null) {
            handler = null;
        } else {
            handler = Util.m10317u(looper, this);
        }
        this.f7747m = handler;
        this.f7749o = iVar;
        this.f7750p = new FormatHolder();
        this.f7746A = -9223372036854775807L;
    }
}
