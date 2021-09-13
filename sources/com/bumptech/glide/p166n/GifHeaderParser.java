package com.bumptech.glide.p166n;

import android.util.Log;
import com.p259uc.crashsdk.export.LogType;
import com.umeng.analytics.pro.TType;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.bumptech.glide.n.d */
public class GifHeaderParser {

    /* renamed from: a */
    private final byte[] f11049a = new byte[LogType.UNEXP];

    /* renamed from: b */
    private ByteBuffer f11050b;

    /* renamed from: c */
    private GifHeader f11051c;

    /* renamed from: d */
    private int f11052d = 0;

    /* renamed from: b */
    private boolean m13673b() {
        return this.f11051c.f11037b != 0;
    }

    /* renamed from: d */
    private int m13674d() {
        try {
            return this.f11050b.get() & 255;
        } catch (Exception unused) {
            this.f11051c.f11037b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    private void m13675e() {
        this.f11051c.f11039d.f11025a = m13684n();
        this.f11051c.f11039d.f11026b = m13684n();
        this.f11051c.f11039d.f11027c = m13684n();
        this.f11051c.f11039d.f11028d = m13684n();
        int d = m13674d();
        boolean z = false;
        boolean z2 = (d & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        GifFrame bVar = this.f11051c.f11039d;
        if ((d & 64) != 0) {
            z = true;
        }
        bVar.f11029e = z;
        if (z2) {
            bVar.f11035k = m13677g(pow);
        } else {
            bVar.f11035k = null;
        }
        this.f11051c.f11039d.f11034j = this.f11050b.position();
        m13687r();
        if (!m13673b()) {
            GifHeader cVar = this.f11051c;
            cVar.f11038c++;
            cVar.f11040e.add(cVar.f11039d);
        }
    }

    /* renamed from: f */
    private void m13676f() {
        int d = m13674d();
        this.f11052d = d;
        if (d > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    int i3 = this.f11052d;
                    if (i < i3) {
                        i2 = i3 - i;
                        this.f11050b.get(this.f11049a, i, i2);
                        i += i2;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    String str = "GifHeaderParser";
                    if (Log.isLoggable(str, 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error Reading Block n: ");
                        sb.append(i);
                        sb.append(" count: ");
                        sb.append(i2);
                        sb.append(" blockSize: ");
                        sb.append(this.f11052d);
                        Log.d(str, sb.toString(), e);
                    }
                    this.f11051c.f11037b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private int[] m13677g(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f11050b.get(bArr);
            iArr = new int[LogType.UNEXP];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << TType.f16865n) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            String str = "GifHeaderParser";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Format Error Reading Color Table", e);
            }
            this.f11051c.f11037b = 1;
        }
        return iArr;
    }

    /* renamed from: h */
    private void m13678h() {
        m13679i(Integer.MAX_VALUE);
    }

    /* renamed from: i */
    private void m13679i(int i) {
        boolean z = false;
        while (!z && !m13673b() && this.f11051c.f11038c <= i) {
            int d = m13674d();
            if (d == 33) {
                int d2 = m13674d();
                if (d2 == 1) {
                    m13686q();
                } else if (d2 == 249) {
                    this.f11051c.f11039d = new GifFrame();
                    m13680j();
                } else if (d2 == 254) {
                    m13686q();
                } else if (d2 != 255) {
                    m13686q();
                } else {
                    m13676f();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.f11049a[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m13683m();
                    } else {
                        m13686q();
                    }
                }
            } else if (d == 44) {
                GifHeader cVar = this.f11051c;
                if (cVar.f11039d == null) {
                    cVar.f11039d = new GifFrame();
                }
                m13675e();
            } else if (d != 59) {
                this.f11051c.f11037b = 1;
            } else {
                z = true;
            }
        }
    }

    /* renamed from: j */
    private void m13680j() {
        m13674d();
        int d = m13674d();
        GifFrame bVar = this.f11051c.f11039d;
        int i = (d & 28) >> 2;
        bVar.f11031g = i;
        boolean z = true;
        if (i == 0) {
            bVar.f11031g = 1;
        }
        if ((d & 1) == 0) {
            z = false;
        }
        bVar.f11030f = z;
        int n = m13684n();
        if (n < 2) {
            n = 10;
        }
        GifFrame bVar2 = this.f11051c.f11039d;
        bVar2.f11033i = n * 10;
        bVar2.f11032h = m13674d();
        m13674d();
    }

    /* renamed from: k */
    private void m13681k() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m13674d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f11051c.f11037b = 1;
            return;
        }
        m13682l();
        if (this.f11051c.f11043h && !m13673b()) {
            GifHeader cVar = this.f11051c;
            cVar.f11036a = m13677g(cVar.f11044i);
            GifHeader cVar2 = this.f11051c;
            cVar2.f11047l = cVar2.f11036a[cVar2.f11045j];
        }
    }

    /* renamed from: l */
    private void m13682l() {
        this.f11051c.f11041f = m13684n();
        this.f11051c.f11042g = m13684n();
        int d = m13674d();
        GifHeader cVar = this.f11051c;
        cVar.f11043h = (d & 128) != 0;
        cVar.f11044i = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        this.f11051c.f11045j = m13674d();
        this.f11051c.f11046k = m13674d();
    }

    /* renamed from: m */
    private void m13683m() {
        do {
            m13676f();
            byte[] bArr = this.f11049a;
            if (bArr[0] == 1) {
                this.f11051c.f11048m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f11052d <= 0) {
                return;
            }
        } while (!m13673b());
    }

    /* renamed from: n */
    private int m13684n() {
        return this.f11050b.getShort();
    }

    /* renamed from: o */
    private void m13685o() {
        this.f11050b = null;
        Arrays.fill(this.f11049a, 0);
        this.f11051c = new GifHeader();
        this.f11052d = 0;
    }

    /* renamed from: q */
    private void m13686q() {
        int d;
        do {
            d = m13674d();
            this.f11050b.position(Math.min(this.f11050b.position() + d, this.f11050b.limit()));
        } while (d > 0);
    }

    /* renamed from: r */
    private void m13687r() {
        m13674d();
        m13686q();
    }

    /* renamed from: a */
    public void mo9362a() {
        this.f11050b = null;
        this.f11051c = null;
    }

    /* renamed from: c */
    public GifHeader mo9363c() {
        if (this.f11050b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m13673b()) {
            return this.f11051c;
        } else {
            m13681k();
            if (!m13673b()) {
                m13678h();
                GifHeader cVar = this.f11051c;
                if (cVar.f11038c < 0) {
                    cVar.f11037b = 1;
                }
            }
            return this.f11051c;
        }
    }

    /* renamed from: p */
    public GifHeaderParser mo9364p(ByteBuffer byteBuffer) {
        m13685o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f11050b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f11050b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
