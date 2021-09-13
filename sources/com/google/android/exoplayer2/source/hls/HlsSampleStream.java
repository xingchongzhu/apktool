package com.google.android.exoplayer2.source.hls;

import java.io.IOException;
import p067c.p068a.p069a.p070a.FormatHolder;
import p067c.p068a.p069a.p070a.p073c2.DecoderInputBuffer;
import p067c.p068a.p069a.p070a.p097j2.SampleStream;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: com.google.android.exoplayer2.source.hls.p */
final class HlsSampleStream implements SampleStream {

    /* renamed from: a */
    private final int f11660a;

    /* renamed from: b */
    private final HlsSampleStreamWrapper f11661b;

    /* renamed from: c */
    private int f11662c = -1;

    public HlsSampleStream(HlsSampleStreamWrapper qVar, int i) {
        this.f11661b = qVar;
        this.f11660a = i;
    }

    /* renamed from: f */
    private boolean m14474f() {
        int i = this.f11662c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    /* renamed from: a */
    public int mo6897a(FormatHolder v0Var, DecoderInputBuffer fVar, boolean z) {
        int i = -3;
        if (this.f11662c == -3) {
            fVar.mo5946e(4);
            return -4;
        }
        if (m14474f()) {
            i = this.f11661b.mo14619d0(this.f11662c, v0Var, fVar, z);
        }
        return i;
    }

    /* renamed from: b */
    public void mo6898b() throws IOException {
        int i = this.f11662c;
        if (i == -2) {
            throw new SampleQueueMappingException(this.f11661b.mo14627o().mo6988l(this.f11660a).mo6977l(0).f8814l);
        } else if (i == -1) {
            this.f11661b.mo14610T();
        } else if (i != -3) {
            this.f11661b.mo14611U(i);
        }
    }

    /* renamed from: c */
    public int mo6899c(long j) {
        if (m14474f()) {
            return this.f11661b.mo14626n0(this.f11662c, j);
        }
        return 0;
    }

    /* renamed from: d */
    public void mo14607d() {
        Assertions.m10149a(this.f11662c == -1);
        this.f11662c = this.f11661b.mo14631w(this.f11660a);
    }

    /* renamed from: e */
    public boolean mo6900e() {
        return this.f11662c == -3 || (m14474f() && this.f11661b.mo14609O(this.f11662c));
    }

    /* renamed from: g */
    public void mo14608g() {
        if (this.f11662c != -1) {
            this.f11661b.mo14628o0(this.f11660a);
            this.f11662c = -1;
        }
    }
}
