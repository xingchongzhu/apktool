package p067c.p068a.p069a.p070a.p075e2;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrm.KeyRequest;
import android.media.MediaDrm.OnEventListener;
import android.media.MediaDrm.ProvisionRequest;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p067c.p068a.p069a.p070a.C;
import p067c.p068a.p069a.p070a.p075e2.DrmInitData.C0894b;
import p067c.p068a.p069a.p070a.p075e2.ExoMediaDrm.C0865a;
import p067c.p068a.p069a.p070a.p075e2.ExoMediaDrm.C0866b;
import p067c.p068a.p069a.p070a.p075e2.ExoMediaDrm.C0867c;
import p067c.p068a.p069a.p070a.p075e2.ExoMediaDrm.C0868d;
import p067c.p068a.p069a.p070a.p076f2.p083k0.PsshAtomUtil;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p135a.Charsets;

/* renamed from: c.a.a.a.e2.f0 */
public final class FrameworkMediaDrm implements ExoMediaDrm {

    /* renamed from: a */
    public static final C0867c f5819a = C0876l.f5842a;

    /* renamed from: b */
    private final UUID f5820b;

    /* renamed from: c */
    private final MediaDrm f5821c;

    /* renamed from: d */
    private int f5822d = 1;

    private FrameworkMediaDrm(UUID uuid) throws UnsupportedSchemeException {
        Assertions.m10153e(uuid);
        Assertions.m10150b(!C.f7371b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f5820b = uuid;
        MediaDrm mediaDrm = new MediaDrm(m7044q(uuid));
        this.f5821c = mediaDrm;
        if (C.f7373d.equals(uuid) && m7049y()) {
            m7045s(mediaDrm);
        }
    }

    /* renamed from: m */
    private static byte[] m7040m(byte[] bArr) {
        ParsableByteArray a0Var = new ParsableByteArray(bArr);
        int q = a0Var.mo7392q();
        short s = a0Var.mo7394s();
        short s2 = a0Var.mo7394s();
        String str = "FrameworkMediaDrm";
        if (s == 1 && s2 == 1) {
            short s3 = a0Var.mo7394s();
            Charset charset = Charsets.f9745e;
            String B = a0Var.mo7360B(s3, charset);
            if (B.contains("<LA_URL>")) {
                return bArr;
            }
            int indexOf = B.indexOf("</DATA>");
            if (indexOf == -1) {
                Log.m10386h(str, "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(B.substring(0, indexOf));
            sb.append("<LA_URL>https://x</LA_URL>");
            sb.append(B.substring(indexOf));
            String sb2 = sb.toString();
            int i = q + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i);
            allocate.putShort((short) s);
            allocate.putShort((short) s2);
            allocate.putShort((short) (sb2.length() * 2));
            allocate.put(sb2.getBytes(charset));
            return allocate.array();
        }
        Log.m10384f(str, "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    /* renamed from: n */
    private static byte[] m7041n(UUID uuid, byte[] bArr) {
        return C.f7372c.equals(uuid) ? ClearKeyUtil.m7079a(bArr) : bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if ("AFTT".equals(r0) == false) goto L_0x005f;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m7042o(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = p067c.p068a.p069a.p070a.C.f7374e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L_0x0018
            byte[] r1 = p067c.p068a.p069a.p070a.p076f2.p083k0.PsshAtomUtil.m7826e(r4, r3)
            if (r1 != 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r4 = r1
        L_0x0010:
            byte[] r4 = m7040m(r4)
            byte[] r4 = p067c.p068a.p069a.p070a.p076f2.p083k0.PsshAtomUtil.m7822a(r0, r4)
        L_0x0018:
            int r1 = p067c.p068a.p069a.p070a.p111m2.Util.f8398a
            r2 = 23
            if (r1 >= r2) goto L_0x0026
            java.util.UUID r1 = p067c.p068a.p069a.p070a.C.f7373d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0058
        L_0x0026:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = p067c.p068a.p069a.p070a.p111m2.Util.f8400c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = p067c.p068a.p069a.p070a.p111m2.Util.f8401d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
        L_0x0058:
            byte[] r3 = p067c.p068a.p069a.p070a.p076f2.p083k0.PsshAtomUtil.m7826e(r4, r3)
            if (r3 == 0) goto L_0x005f
            return r3
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p075e2.FrameworkMediaDrm.m7042o(java.util.UUID, byte[]):byte[]");
    }

    /* renamed from: p */
    private static String m7043p(UUID uuid, String str) {
        return (Util.f8398a >= 26 || !C.f7372c.equals(uuid) || (!"video/mp4".equals(str) && !"audio/mp4".equals(str))) ? str : "cenc";
    }

    /* renamed from: q */
    private static UUID m7044q(UUID uuid) {
        return (Util.f8398a >= 27 || !C.f7372c.equals(uuid)) ? uuid : C.f7371b;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: s */
    private static void m7045s(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    /* renamed from: u */
    private static C0894b m7046u(UUID uuid, List<C0894b> list) {
        boolean z;
        if (!C.f7373d.equals(uuid)) {
            return (C0894b) list.get(0);
        }
        if (Util.f8398a >= 28 && list.size() > 1) {
            C0894b bVar = (C0894b) list.get(0);
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= list.size()) {
                    z = true;
                    break;
                }
                C0894b bVar2 = (C0894b) list.get(i);
                byte[] bArr = (byte[]) Assertions.m10153e(bVar2.f5926e);
                if (!Util.m10279b(bVar2.f5925d, bVar.f5925d) || !Util.m10279b(bVar2.f5924c, bVar.f5924c) || !PsshAtomUtil.m7824c(bArr)) {
                    z = false;
                } else {
                    i2 += bArr.length;
                    i++;
                }
            }
            z = false;
            if (z) {
                byte[] bArr2 = new byte[i2];
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    byte[] bArr3 = (byte[]) Assertions.m10153e(((C0894b) list.get(i4)).f5926e);
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i3, length);
                    i3 += length;
                }
                return bVar.mo6111l(bArr2);
            }
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            C0894b bVar3 = (C0894b) list.get(i5);
            int g = PsshAtomUtil.m7828g((byte[]) Assertions.m10153e(bVar3.f5926e));
            int i6 = Util.f8398a;
            if (i6 < 23 && g == 0) {
                return bVar3;
            }
            if (i6 >= 23 && g == 1) {
                return bVar3;
            }
        }
        return (C0894b) list.get(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void mo6060w(C0866b bVar, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        bVar.mo6052a(this, bArr, i, i2, bArr2);
    }

    /* renamed from: x */
    static /* synthetic */ ExoMediaDrm m7048x(UUID uuid) {
        try {
            return m7050z(uuid);
        } catch (UnsupportedDrmException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to instantiate a FrameworkMediaDrm for uuid: ");
            sb.append(uuid);
            sb.append(".");
            Log.m10381c("FrameworkMediaDrm", sb.toString());
            return new DummyExoMediaDrm();
        }
    }

    /* renamed from: y */
    private static boolean m7049y() {
        return "ASUS_Z00AD".equals(Util.f8401d);
    }

    /* renamed from: z */
    public static FrameworkMediaDrm m7050z(UUID uuid) throws UnsupportedDrmException {
        try {
            return new FrameworkMediaDrm(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new UnsupportedDrmException(1, e);
        } catch (Exception e2) {
            throw new UnsupportedDrmException(2, e2);
        }
    }

    /* renamed from: a */
    public synchronized void mo6029a() {
        int i = this.f5822d - 1;
        this.f5822d = i;
        if (i == 0) {
            this.f5821c.release();
        }
    }

    /* renamed from: b */
    public Class<FrameworkMediaCrypto> mo6030b() {
        return FrameworkMediaCrypto.class;
    }

    /* renamed from: c */
    public void mo6031c(byte[] bArr, byte[] bArr2) {
        this.f5821c.restoreKeys(bArr, bArr2);
    }

    /* renamed from: d */
    public Map<String, String> mo6032d(byte[] bArr) {
        return this.f5821c.queryKeyStatus(bArr);
    }

    /* renamed from: e */
    public void mo6033e(byte[] bArr) {
        this.f5821c.closeSession(bArr);
    }

    /* renamed from: f */
    public void mo6034f(C0866b bVar) {
        OnEventListener onEventListener;
        MediaDrm mediaDrm = this.f5821c;
        if (bVar == null) {
            onEventListener = null;
        } else {
            onEventListener = new C0877m(this, bVar);
        }
        mediaDrm.setOnEventListener(onEventListener);
    }

    /* renamed from: g */
    public byte[] mo6035g(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        if (C.f7372c.equals(this.f5820b)) {
            bArr2 = ClearKeyUtil.m7080b(bArr2);
        }
        return this.f5821c.provideKeyResponse(bArr, bArr2);
    }

    /* renamed from: i */
    public C0868d mo6037i() {
        ProvisionRequest provisionRequest = this.f5821c.getProvisionRequest();
        return new C0868d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    /* renamed from: j */
    public void mo6038j(byte[] bArr) throws DeniedByServerException {
        this.f5821c.provideProvisionResponse(bArr);
    }

    /* renamed from: k */
    public C0865a mo6039k(byte[] bArr, List<C0894b> list, int i, HashMap<String, String> hashMap) throws NotProvisionedException {
        String str;
        byte[] bArr2;
        C0894b bVar = null;
        if (list != null) {
            bVar = m7046u(this.f5820b, list);
            bArr2 = m7042o(this.f5820b, (byte[]) Assertions.m10153e(bVar.f5926e));
            str = m7043p(this.f5820b, bVar.f5925d);
        } else {
            bArr2 = null;
            str = null;
        }
        KeyRequest keyRequest = this.f5821c.getKeyRequest(bArr, bArr2, str, i, hashMap);
        byte[] n = m7041n(this.f5820b, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && bVar != null && !TextUtils.isEmpty(bVar.f5924c)) {
            defaultUrl = bVar.f5924c;
        }
        return new C0865a(n, defaultUrl, Util.f8398a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    /* renamed from: l */
    public byte[] mo6040l() throws MediaDrmException {
        return this.f5821c.openSession();
    }

    /* renamed from: r */
    public FrameworkMediaCrypto mo6036h(byte[] bArr) throws MediaCryptoException {
        boolean z;
        if (Util.f8398a < 21 && C.f7373d.equals(this.f5820b)) {
            if ("L3".equals(mo6059t("securityLevel"))) {
                z = true;
                return new FrameworkMediaCrypto(m7044q(this.f5820b), bArr, z);
            }
        }
        z = false;
        return new FrameworkMediaCrypto(m7044q(this.f5820b), bArr, z);
    }

    /* renamed from: t */
    public String mo6059t(String str) {
        return this.f5821c.getPropertyString(str);
    }
}
