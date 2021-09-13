package p067c.p068a.p069a.p070a.p075e2;

import java.util.UUID;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.e2.e0 */
public final class FrameworkMediaCrypto implements ExoMediaCrypto {

    /* renamed from: a */
    public static final boolean f5813a;

    /* renamed from: b */
    public final UUID f5814b;

    /* renamed from: c */
    public final byte[] f5815c;

    /* renamed from: d */
    public final boolean f5816d;

    static {
        boolean z;
        if ("Amazon".equals(Util.f8400c)) {
            String str = Util.f8401d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                f5813a = z;
            }
        }
        z = false;
        f5813a = z;
    }

    public FrameworkMediaCrypto(UUID uuid, byte[] bArr, boolean z) {
        this.f5814b = uuid;
        this.f5815c = bArr;
        this.f5816d = z;
    }
}
