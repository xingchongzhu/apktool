package p067c.p068a.p069a.p070a.p076f2.p083k0;

import java.nio.ByteBuffer;
import java.util.UUID;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.k0.l */
public final class PsshAtomUtil {

    /* renamed from: c.a.a.a.f2.k0.l$a */
    /* compiled from: PsshAtomUtil */
    private static class C0959a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final UUID f6454a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final int f6455b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final byte[] f6456c;

        public C0959a(UUID uuid, int i, byte[] bArr) {
            this.f6454a = uuid;
            this.f6455b = i;
            this.f6456c = bArr;
        }
    }

    /* renamed from: a */
    public static byte[] m7822a(UUID uuid, byte[] bArr) {
        return m7823b(uuid, null, bArr);
    }

    /* renamed from: b */
    public static byte[] m7823b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (!(bArr == null || bArr.length == 0)) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* renamed from: c */
    public static boolean m7824c(byte[] bArr) {
        return m7825d(bArr) != null;
    }

    /* renamed from: d */
    private static C0959a m7825d(byte[] bArr) {
        ParsableByteArray a0Var = new ParsableByteArray(bArr);
        if (a0Var.mo7381f() < 32) {
            return null;
        }
        a0Var.mo7374P(0);
        if (a0Var.mo7389n() != a0Var.mo7376a() + 4 || a0Var.mo7389n() != 1886614376) {
            return null;
        }
        int c = Atom.m7677c(a0Var.mo7389n());
        if (c > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported pssh version: ");
            sb.append(c);
            Log.m10386h("PsshAtomUtil", sb.toString());
            return null;
        }
        UUID uuid = new UUID(a0Var.mo7398w(), a0Var.mo7398w());
        if (c == 1) {
            a0Var.mo7375Q(a0Var.mo7366H() * 16);
        }
        int H = a0Var.mo7366H();
        if (H != a0Var.mo7376a()) {
            return null;
        }
        byte[] bArr2 = new byte[H];
        a0Var.mo7385j(bArr2, 0, H);
        return new C0959a(uuid, c, bArr2);
    }

    /* renamed from: e */
    public static byte[] m7826e(byte[] bArr, UUID uuid) {
        C0959a d = m7825d(bArr);
        if (d == null) {
            return null;
        }
        if (uuid.equals(d.f6454a)) {
            return d.f6456c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("UUID mismatch. Expected: ");
        sb.append(uuid);
        sb.append(", got: ");
        sb.append(d.f6454a);
        sb.append(".");
        Log.m10386h("PsshAtomUtil", sb.toString());
        return null;
    }

    /* renamed from: f */
    public static UUID m7827f(byte[] bArr) {
        C0959a d = m7825d(bArr);
        if (d == null) {
            return null;
        }
        return d.f6454a;
    }

    /* renamed from: g */
    public static int m7828g(byte[] bArr) {
        C0959a d = m7825d(bArr);
        if (d == null) {
            return -1;
        }
        return d.f6455b;
    }
}
