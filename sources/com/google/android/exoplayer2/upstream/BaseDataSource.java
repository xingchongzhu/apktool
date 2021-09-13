package com.google.android.exoplayer2.upstream;

import java.util.ArrayList;
import java.util.Map;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: com.google.android.exoplayer2.upstream.h */
public abstract class BaseDataSource implements C1916m {

    /* renamed from: b */
    private final boolean f12324b;

    /* renamed from: c */
    private final ArrayList<TransferListener> f12325c = new ArrayList<>(1);

    /* renamed from: d */
    private int f12326d;

    /* renamed from: e */
    private DataSpec f12327e;

    protected BaseDataSource(boolean z) {
        this.f12324b = z;
    }

    /* renamed from: g */
    public /* synthetic */ Map mo7016g() {
        return C1915l.m15077a(this);
    }

    /* renamed from: k */
    public final void mo7017k(TransferListener e0Var) {
        Assertions.m10153e(e0Var);
        if (!this.f12325c.contains(e0Var)) {
            this.f12325c.add(e0Var);
            this.f12326d++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo14935r(int i) {
        DataSpec pVar = (DataSpec) Util.m10293i(this.f12327e);
        for (int i2 = 0; i2 < this.f12326d; i2++) {
            ((TransferListener) this.f12325c.get(i2)).mo14924e(this, pVar, this.f12324b, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo14936s() {
        DataSpec pVar = (DataSpec) Util.m10293i(this.f12327e);
        for (int i = 0; i < this.f12326d; i++) {
            ((TransferListener) this.f12325c.get(i)).mo14923d(this, pVar, this.f12324b);
        }
        this.f12327e = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo14937t(DataSpec pVar) {
        for (int i = 0; i < this.f12326d; i++) {
            ((TransferListener) this.f12325c.get(i)).mo14926h(this, pVar, this.f12324b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo14938u(DataSpec pVar) {
        this.f12327e = pVar;
        for (int i = 0; i < this.f12326d; i++) {
            ((TransferListener) this.f12325c.get(i)).mo14925f(this, pVar, this.f12324b);
        }
    }
}
