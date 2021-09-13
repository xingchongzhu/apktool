package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

/* renamed from: com.google.android.exoplayer2.upstream.f0 */
public final class UdpDataSource extends BaseDataSource {

    /* renamed from: f */
    private final int f12310f;

    /* renamed from: g */
    private final byte[] f12311g;

    /* renamed from: h */
    private final DatagramPacket f12312h;

    /* renamed from: i */
    private Uri f12313i;

    /* renamed from: j */
    private DatagramSocket f12314j;

    /* renamed from: k */
    private MulticastSocket f12315k;

    /* renamed from: l */
    private InetAddress f12316l;

    /* renamed from: m */
    private InetSocketAddress f12317m;

    /* renamed from: n */
    private boolean f12318n;

    /* renamed from: o */
    private int f12319o;

    /* renamed from: com.google.android.exoplayer2.upstream.f0$a */
    /* compiled from: UdpDataSource */
    public static final class C1910a extends IOException {
        public C1910a(IOException iOException) {
            super(iOException);
        }
    }

    public UdpDataSource() {
        this(2000);
    }

    /* renamed from: b */
    public int mo6195b(byte[] bArr, int i, int i2) throws C1910a {
        if (i2 == 0) {
            return 0;
        }
        if (this.f12319o == 0) {
            try {
                this.f12314j.receive(this.f12312h);
                int length = this.f12312h.getLength();
                this.f12319o = length;
                mo14935r(length);
            } catch (IOException e) {
                throw new C1910a(e);
            }
        }
        int length2 = this.f12312h.getLength();
        int i3 = this.f12319o;
        int i4 = length2 - i3;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f12311g, i4, bArr, i, min);
        this.f12319o -= min;
        return min;
    }

    public void close() {
        this.f12313i = null;
        MulticastSocket multicastSocket = this.f12315k;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f12316l);
            } catch (IOException unused) {
            }
            this.f12315k = null;
        }
        DatagramSocket datagramSocket = this.f12314j;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f12314j = null;
        }
        this.f12316l = null;
        this.f12317m = null;
        this.f12319o = 0;
        if (this.f12318n) {
            this.f12318n = false;
            mo14936s();
        }
    }

    /* renamed from: e */
    public long mo7015e(DataSpec pVar) throws C1910a {
        Uri uri = pVar.f12345a;
        this.f12313i = uri;
        String host = uri.getHost();
        int port = this.f12313i.getPort();
        mo14937t(pVar);
        try {
            this.f12316l = InetAddress.getByName(host);
            this.f12317m = new InetSocketAddress(this.f12316l, port);
            if (this.f12316l.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f12317m);
                this.f12315k = multicastSocket;
                multicastSocket.joinGroup(this.f12316l);
                this.f12314j = this.f12315k;
            } else {
                this.f12314j = new DatagramSocket(this.f12317m);
            }
            try {
                this.f12314j.setSoTimeout(this.f12310f);
                this.f12318n = true;
                mo14938u(pVar);
                return -1;
            } catch (SocketException e) {
                throw new C1910a(e);
            }
        } catch (IOException e2) {
            throw new C1910a(e2);
        }
    }

    /* renamed from: l */
    public Uri mo7018l() {
        return this.f12313i;
    }

    public UdpDataSource(int i) {
        this(i, 8000);
    }

    public UdpDataSource(int i, int i2) {
        super(true);
        this.f12310f = i2;
        byte[] bArr = new byte[i];
        this.f12311g = bArr;
        this.f12312h = new DatagramPacket(bArr, 0, i);
    }
}
