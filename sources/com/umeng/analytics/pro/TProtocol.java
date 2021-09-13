package com.umeng.analytics.pro;

import java.nio.ByteBuffer;

/* renamed from: com.umeng.analytics.pro.bp */
public abstract class TProtocol {

    /* renamed from: g */
    protected TTransport f16839g;

    private TProtocol() {
    }

    /* renamed from: A */
    public abstract ByteBuffer mo19009A() throws TException;

    /* renamed from: B */
    public void mo19054B() {
    }

    /* renamed from: C */
    public TTransport mo19061C() {
        return this.f16839g;
    }

    /* renamed from: D */
    public Class<? extends IScheme> mo19062D() {
        return StandardScheme.class;
    }

    /* renamed from: a */
    public abstract void mo19010a() throws TException;

    /* renamed from: a */
    public abstract void mo19011a(byte b) throws TException;

    /* renamed from: a */
    public abstract void mo19012a(double d) throws TException;

    /* renamed from: a */
    public abstract void mo19013a(int i) throws TException;

    /* renamed from: a */
    public abstract void mo19014a(long j) throws TException;

    /* renamed from: a */
    public abstract void mo19015a(TField bkVar) throws TException;

    /* renamed from: a */
    public abstract void mo19016a(TList blVar) throws TException;

    /* renamed from: a */
    public abstract void mo19017a(TMap bmVar) throws TException;

    /* renamed from: a */
    public abstract void mo19018a(TMessage bnVar) throws TException;

    /* renamed from: a */
    public abstract void mo19019a(TSet btVar) throws TException;

    /* renamed from: a */
    public abstract void mo19020a(TStruct buVar) throws TException;

    /* renamed from: a */
    public abstract void mo19021a(String str) throws TException;

    /* renamed from: a */
    public abstract void mo19022a(ByteBuffer byteBuffer) throws TException;

    /* renamed from: a */
    public abstract void mo19023a(short s) throws TException;

    /* renamed from: a */
    public abstract void mo19024a(boolean z) throws TException;

    /* renamed from: b */
    public abstract void mo19026b() throws TException;

    /* renamed from: c */
    public abstract void mo19027c() throws TException;

    /* renamed from: d */
    public abstract void mo19029d() throws TException;

    /* renamed from: e */
    public abstract void mo19031e() throws TException;

    /* renamed from: f */
    public abstract void mo19032f() throws TException;

    /* renamed from: g */
    public abstract void mo19033g() throws TException;

    /* renamed from: h */
    public abstract TMessage mo19034h() throws TException;

    /* renamed from: i */
    public abstract void mo19035i() throws TException;

    /* renamed from: j */
    public abstract TStruct mo19036j() throws TException;

    /* renamed from: k */
    public abstract void mo19037k() throws TException;

    /* renamed from: l */
    public abstract TField mo19038l() throws TException;

    /* renamed from: m */
    public abstract void mo19039m() throws TException;

    /* renamed from: n */
    public abstract TMap mo19040n() throws TException;

    /* renamed from: o */
    public abstract void mo19041o() throws TException;

    /* renamed from: p */
    public abstract TList mo19042p() throws TException;

    /* renamed from: q */
    public abstract void mo19043q() throws TException;

    /* renamed from: r */
    public abstract TSet mo19044r() throws TException;

    /* renamed from: s */
    public abstract void mo19045s() throws TException;

    /* renamed from: t */
    public abstract boolean mo19046t() throws TException;

    /* renamed from: u */
    public abstract byte mo19047u() throws TException;

    /* renamed from: v */
    public abstract short mo19048v() throws TException;

    /* renamed from: w */
    public abstract int mo19049w() throws TException;

    /* renamed from: x */
    public abstract long mo19050x() throws TException;

    /* renamed from: y */
    public abstract double mo19051y() throws TException;

    /* renamed from: z */
    public abstract String mo19052z() throws TException;

    protected TProtocol(TTransport cdVar) {
        this.f16839g = cdVar;
    }
}
