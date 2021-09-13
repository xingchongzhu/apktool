package com.bumptech.glide.load.p156o;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.p174t.C1638j;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.o.g */
public class GlideUrl implements Key {

    /* renamed from: b */
    private final Headers f10707b;

    /* renamed from: c */
    private final URL f10708c;

    /* renamed from: d */
    private final String f10709d;

    /* renamed from: e */
    private String f10710e;

    /* renamed from: f */
    private URL f10711f;

    /* renamed from: g */
    private volatile byte[] f10712g;

    /* renamed from: h */
    private int f10713h;

    public GlideUrl(URL url) {
        this(url, Headers.f10715b);
    }

    /* renamed from: d */
    private byte[] m13103d() {
        if (this.f10712g == null) {
            this.f10712g = mo9122c().getBytes(Key.f10343a);
        }
        return this.f10712g;
    }

    /* renamed from: f */
    private String m13104f() {
        if (TextUtils.isEmpty(this.f10710e)) {
            String str = this.f10709d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) C1638j.m14081d(this.f10708c)).toString();
            }
            this.f10710e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f10710e;
    }

    /* renamed from: g */
    private URL m13105g() throws MalformedURLException {
        if (this.f10711f == null) {
            this.f10711f = new URL(m13104f());
        }
        return this.f10711f;
    }

    /* renamed from: b */
    public void mo8826b(MessageDigest messageDigest) {
        messageDigest.update(m13103d());
    }

    /* renamed from: c */
    public String mo9122c() {
        String str = this.f10709d;
        return str != null ? str : ((URL) C1638j.m14081d(this.f10708c)).toString();
    }

    /* renamed from: e */
    public Map<String, String> mo9123e() {
        return this.f10707b.mo9126a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GlideUrl)) {
            return false;
        }
        GlideUrl gVar = (GlideUrl) obj;
        if (!mo9122c().equals(gVar.mo9122c()) || !this.f10707b.equals(gVar.f10707b)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public URL mo9124h() throws MalformedURLException {
        return m13105g();
    }

    public int hashCode() {
        if (this.f10713h == 0) {
            int hashCode = mo9122c().hashCode();
            this.f10713h = hashCode;
            this.f10713h = (hashCode * 31) + this.f10707b.hashCode();
        }
        return this.f10713h;
    }

    public String toString() {
        return mo9122c();
    }

    public GlideUrl(String str) {
        this(str, Headers.f10715b);
    }

    public GlideUrl(URL url, Headers hVar) {
        this.f10708c = (URL) C1638j.m14081d(url);
        this.f10709d = null;
        this.f10707b = (Headers) C1638j.m14081d(hVar);
    }

    public GlideUrl(String str, Headers hVar) {
        this.f10708c = null;
        this.f10709d = C1638j.m14079b(str);
        this.f10707b = (Headers) C1638j.m14081d(hVar);
    }
}
