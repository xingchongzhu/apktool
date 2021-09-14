package com.efs.sdk.base.p176a.p187h.p189b;

import com.efs.sdk.base.http.HttpEnv;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p176a.p187h.C1728d;
import com.efs.sdk.base.p176a.p187h.p188a.C1716c;
import java.io.File;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.h.b.b */
public final class C1722b implements C1716c<HttpResponse> {

    /* renamed from: a */
    String f11400a;

    /* renamed from: b */
    Map<String, String> f11401b;

    /* renamed from: c */
    public byte[] f11402c;

    /* renamed from: d */
    public File f11403d;

    /* renamed from: e */
    public String f11404e;

    /* renamed from: f */
    public Map<String, String> f11405f;

    /* renamed from: g */
    public boolean f11406g = false;

    /* renamed from: a */
    public final /* synthetic */ Object mo9684a() {
        String str = this.f11404e;
        str.hashCode();
        if (str.equals("get")) {
            return HttpEnv.getInstance().getHttpUtil().get(this.f11400a, this.f11401b);
        }
        if (!str.equals("post")) {
            StringBuilder sb = new StringBuilder("request not support method '");
            sb.append(this.f11404e);
            sb.append("'");
            C1728d.m14309b("efs.util.http", sb.toString(), null);
            return null;
        }
        byte[] bArr = this.f11402c;
        if (bArr == null || bArr.length <= 0) {
            return HttpEnv.getInstance().getHttpUtil().post(this.f11400a, this.f11401b, this.f11403d);
        }
        if (this.f11406g) {
            return HttpEnv.getInstance().getHttpUtil().postAsFile(this.f11400a, this.f11401b, this.f11402c);
        }
        return HttpEnv.getInstance().getHttpUtil().post(this.f11400a, this.f11401b, this.f11402c);
    }
}
