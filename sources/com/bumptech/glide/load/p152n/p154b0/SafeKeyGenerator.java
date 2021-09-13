package com.bumptech.glide.load.p152n.p154b0;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.p174t.C1636g;
import com.bumptech.glide.p174t.C1638j;
import com.bumptech.glide.p174t.C1639k;
import com.bumptech.glide.p174t.p175l.FactoryPools;
import com.bumptech.glide.p174t.p175l.FactoryPools.C1644d;
import com.bumptech.glide.p174t.p175l.FactoryPools.C1646f;
import com.bumptech.glide.p174t.p175l.StateVerifier;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p010b.p034g.p042j.C0610e;

/* renamed from: com.bumptech.glide.load.n.b0.j */
public class SafeKeyGenerator {

    /* renamed from: a */
    private final C1636g<Key, String> f10440a = new C1636g<>(1000);

    /* renamed from: b */
    private final C0610e<C1466b> f10441b = FactoryPools.m14109d(10, new C1465a());

    /* renamed from: com.bumptech.glide.load.n.b0.j$a */
    /* compiled from: SafeKeyGenerator */
    class C1465a implements C1644d<C1466b> {
        C1465a() {
        }

        /* renamed from: b */
        public C1466b mo8938a() {
            try {
                return new C1466b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.n.b0.j$b */
    /* compiled from: SafeKeyGenerator */
    private static final class C1466b implements C1646f {

        /* renamed from: a */
        final MessageDigest f10443a;

        /* renamed from: b */
        private final StateVerifier f10444b = StateVerifier.m14126a();

        C1466b(MessageDigest messageDigest) {
            this.f10443a = messageDigest;
        }

        /* renamed from: d */
        public StateVerifier mo8940d() {
            return this.f10444b;
        }
    }

    /* renamed from: a */
    private String m12790a(Key gVar) {
        C1466b bVar = (C1466b) C1638j.m14081d(this.f10441b.mo4946b());
        try {
            gVar.mo8826b(bVar.f10443a);
            return C1639k.m14105w(bVar.f10443a.digest());
        } finally {
            this.f10441b.mo4945a(bVar);
        }
    }

    /* renamed from: b */
    public String mo8937b(Key gVar) {
        String str;
        synchronized (this.f10440a) {
            str = (String) this.f10440a.mo9569g(gVar);
        }
        if (str == null) {
            str = m12790a(gVar);
        }
        synchronized (this.f10440a) {
            this.f10440a.mo9571k(gVar, str);
        }
        return str;
    }
}
