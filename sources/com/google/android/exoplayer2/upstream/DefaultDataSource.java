package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: com.google.android.exoplayer2.upstream.s */
public final class DefaultDataSource implements C1916m {

    /* renamed from: b */
    private final Context f12404b;

    /* renamed from: c */
    private final List<TransferListener> f12405c = new ArrayList();

    /* renamed from: d */
    private final C1916m f12406d;

    /* renamed from: e */
    private C1916m f12407e;

    /* renamed from: f */
    private C1916m f12408f;

    /* renamed from: g */
    private C1916m f12409g;

    /* renamed from: h */
    private C1916m f12410h;

    /* renamed from: i */
    private C1916m f12411i;

    /* renamed from: j */
    private C1916m f12412j;

    /* renamed from: k */
    private C1916m f12413k;

    /* renamed from: l */
    private C1916m f12414l;

    public DefaultDataSource(Context context, C1916m mVar) {
        this.f12404b = context.getApplicationContext();
        this.f12406d = (C1916m) Assertions.m10153e(mVar);
    }

    /* renamed from: r */
    private void m15133r(C1916m mVar) {
        for (int i = 0; i < this.f12405c.size(); i++) {
            mVar.mo7017k((TransferListener) this.f12405c.get(i));
        }
    }

    /* renamed from: s */
    private C1916m m15134s() {
        if (this.f12408f == null) {
            AssetDataSource fVar = new AssetDataSource(this.f12404b);
            this.f12408f = fVar;
            m15133r(fVar);
        }
        return this.f12408f;
    }

    /* renamed from: t */
    private C1916m m15135t() {
        if (this.f12409g == null) {
            ContentDataSource iVar = new ContentDataSource(this.f12404b);
            this.f12409g = iVar;
            m15133r(iVar);
        }
        return this.f12409g;
    }

    /* renamed from: u */
    private C1916m m15136u() {
        if (this.f12412j == null) {
            DataSchemeDataSource kVar = new DataSchemeDataSource();
            this.f12412j = kVar;
            m15133r(kVar);
        }
        return this.f12412j;
    }

    /* renamed from: v */
    private C1916m m15137v() {
        if (this.f12407e == null) {
            FileDataSource wVar = new FileDataSource();
            this.f12407e = wVar;
            m15133r(wVar);
        }
        return this.f12407e;
    }

    /* renamed from: w */
    private C1916m m15138w() {
        if (this.f12413k == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f12404b);
            this.f12413k = rawResourceDataSource;
            m15133r(rawResourceDataSource);
        }
        return this.f12413k;
    }

    /* renamed from: x */
    private C1916m m15139x() {
        if (this.f12410h == null) {
            try {
                C1916m mVar = (C1916m) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f12410h = mVar;
                m15133r(mVar);
            } catch (ClassNotFoundException unused) {
                Log.m10386h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.f12410h == null) {
                this.f12410h = this.f12406d;
            }
        }
        return this.f12410h;
    }

    /* renamed from: y */
    private C1916m m15140y() {
        if (this.f12411i == null) {
            UdpDataSource f0Var = new UdpDataSource();
            this.f12411i = f0Var;
            m15133r(f0Var);
        }
        return this.f12411i;
    }

    /* renamed from: z */
    private void m15141z(C1916m mVar, TransferListener e0Var) {
        if (mVar != null) {
            mVar.mo7017k(e0Var);
        }
    }

    /* renamed from: b */
    public int mo6195b(byte[] bArr, int i, int i2) throws IOException {
        return ((C1916m) Assertions.m10153e(this.f12414l)).mo6195b(bArr, i, i2);
    }

    public void close() throws IOException {
        C1916m mVar = this.f12414l;
        if (mVar != null) {
            try {
                mVar.close();
            } finally {
                this.f12414l = null;
            }
        }
    }

    /* renamed from: e */
    public long mo7015e(DataSpec pVar) throws IOException {
        Assertions.m10154f(this.f12414l == null);
        String scheme = pVar.f12345a.getScheme();
        if (Util.m10300l0(pVar.f12345a)) {
            String path = pVar.f12345a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f12414l = m15137v();
            } else {
                this.f12414l = m15134s();
            }
        } else if ("asset".equals(scheme)) {
            this.f12414l = m15134s();
        } else if ("content".equals(scheme)) {
            this.f12414l = m15135t();
        } else if ("rtmp".equals(scheme)) {
            this.f12414l = m15139x();
        } else if ("udp".equals(scheme)) {
            this.f12414l = m15140y();
        } else if ("data".equals(scheme)) {
            this.f12414l = m15136u();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f12414l = m15138w();
        } else {
            this.f12414l = this.f12406d;
        }
        return this.f12414l.mo7015e(pVar);
    }

    /* renamed from: g */
    public Map<String, List<String>> mo7016g() {
        C1916m mVar = this.f12414l;
        return mVar == null ? Collections.emptyMap() : mVar.mo7016g();
    }

    /* renamed from: k */
    public void mo7017k(TransferListener e0Var) {
        Assertions.m10153e(e0Var);
        this.f12406d.mo7017k(e0Var);
        this.f12405c.add(e0Var);
        m15141z(this.f12407e, e0Var);
        m15141z(this.f12408f, e0Var);
        m15141z(this.f12409g, e0Var);
        m15141z(this.f12410h, e0Var);
        m15141z(this.f12411i, e0Var);
        m15141z(this.f12412j, e0Var);
        m15141z(this.f12413k, e0Var);
    }

    /* renamed from: l */
    public Uri mo7018l() {
        C1916m mVar = this.f12414l;
        if (mVar == null) {
            return null;
        }
        return mVar.mo7018l();
    }
}
