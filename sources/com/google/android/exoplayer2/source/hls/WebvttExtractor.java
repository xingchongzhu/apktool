package com.google.android.exoplayer2.source.hls;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.Extractor;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.PositionHolder;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1003b;
import p067c.p068a.p069a.p070a.p100k2.p109v.WebvttParserUtil;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.TimestampAdjuster;

/* renamed from: com.google.android.exoplayer2.source.hls.u */
public final class WebvttExtractor implements Extractor {

    /* renamed from: a */
    private static final Pattern f11733a = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: b */
    private static final Pattern f11734b = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: c */
    private final String f11735c;

    /* renamed from: d */
    private final TimestampAdjuster f11736d;

    /* renamed from: e */
    private final ParsableByteArray f11737e = new ParsableByteArray();

    /* renamed from: f */
    private ExtractorOutput f11738f;

    /* renamed from: g */
    private byte[] f11739g = new byte[1024];

    /* renamed from: h */
    private int f11740h;

    public WebvttExtractor(String str, TimestampAdjuster j0Var) {
        this.f11735c = str;
        this.f11736d = j0Var;
    }

    @RequiresNonNull({"output"})
    /* renamed from: d */
    private C0916b0 m14568d(long j) {
        C0916b0 q = this.f11738f.mo6218q(0, 3);
        q.mo6177d(new C1245b().mo7705e0("text/vtt").mo7696V(this.f11735c).mo7709i0(j).mo7679E());
        this.f11738f.mo6217h();
        return q;
    }

    @RequiresNonNull({"output"})
    /* renamed from: f */
    private void m14569f() throws ParserException {
        ParsableByteArray a0Var = new ParsableByteArray(this.f11739g);
        WebvttParserUtil.m9820e(a0Var);
        long j = 0;
        long j2 = 0;
        for (String p = a0Var.mo7391p(); !TextUtils.isEmpty(p); p = a0Var.mo7391p()) {
            if (p.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f11733a.matcher(p);
                if (matcher.find()) {
                    Matcher matcher2 = f11734b.matcher(p);
                    if (matcher2.find()) {
                        j2 = WebvttParserUtil.m9819d((String) Assertions.m10153e(matcher.group(1)));
                        j = TimestampAdjuster.m10205f(Long.parseLong((String) Assertions.m10153e(matcher2.group(1))));
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("X-TIMESTAMP-MAP doesn't contain media timestamp: ");
                        sb.append(p);
                        throw new ParserException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("X-TIMESTAMP-MAP doesn't contain local timestamp: ");
                    sb2.append(p);
                    throw new ParserException(sb2.toString());
                }
            }
        }
        Matcher a = WebvttParserUtil.m9816a(a0Var);
        if (a == null) {
            m14568d(0);
            return;
        }
        long d = WebvttParserUtil.m9819d((String) Assertions.m10153e(a.group(1)));
        long b = this.f11736d.mo7447b(TimestampAdjuster.m10207j((j + d) - j2));
        C0916b0 d2 = m14568d(b - d);
        this.f11737e.mo7372N(this.f11739g, this.f11740h);
        d2.mo6174a(this.f11737e, this.f11740h);
        d2.mo6176c(b, 1, this.f11740h, 0, null);
    }

    /* renamed from: a */
    public void mo6188a() {
    }

    /* renamed from: b */
    public void mo6189b(ExtractorOutput lVar) {
        this.f11738f = lVar;
        lVar.mo6216f(new C1003b(-9223372036854775807L));
    }

    /* renamed from: c */
    public void mo6190c(long j, long j2) {
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public boolean mo6191e(ExtractorInput kVar) throws IOException {
        kVar.mo6202m(this.f11739g, 0, 6, false);
        this.f11737e.mo7372N(this.f11739g, 6);
        if (WebvttParserUtil.m9817b(this.f11737e)) {
            return true;
        }
        kVar.mo6202m(this.f11739g, 6, 3, false);
        this.f11737e.mo7372N(this.f11739g, 9);
        return WebvttParserUtil.m9817b(this.f11737e);
    }

    /* renamed from: i */
    public int mo6192i(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        int i;
        Assertions.m10153e(this.f11738f);
        int a = (int) kVar.mo6194a();
        int i2 = this.f11740h;
        byte[] bArr = this.f11739g;
        if (i2 == bArr.length) {
            if (a != -1) {
                i = a;
            } else {
                i = bArr.length;
            }
            this.f11739g = Arrays.copyOf(bArr, (i * 3) / 2);
        }
        byte[] bArr2 = this.f11739g;
        int i3 = this.f11740h;
        int b = kVar.mo6195b(bArr2, i3, bArr2.length - i3);
        if (b != -1) {
            int i4 = this.f11740h + b;
            this.f11740h = i4;
            if (a == -1 || i4 != a) {
                return 0;
            }
        }
        m14569f();
        return -1;
    }
}
