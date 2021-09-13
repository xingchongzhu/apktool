package com.google.android.exoplayer2.p196ui.p197x;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.GlUtil;
import p067c.p068a.p069a.p070a.p111m2.TimedValueQueue;
import p067c.p068a.p069a.p070a.p112n2.VideoFrameMetadataListener;
import p067c.p068a.p069a.p070a.p112n2.p113a0.CameraMotionListener;
import p067c.p068a.p069a.p070a.p112n2.p113a0.FrameRotationQueue;
import p067c.p068a.p069a.p070a.p112n2.p113a0.Projection;
import p067c.p068a.p069a.p070a.p112n2.p113a0.ProjectionDecoder;

/* renamed from: com.google.android.exoplayer2.ui.x.f */
final class SceneRenderer implements VideoFrameMetadataListener, CameraMotionListener {

    /* renamed from: a */
    private final AtomicBoolean f12212a = new AtomicBoolean();

    /* renamed from: b */
    private final AtomicBoolean f12213b = new AtomicBoolean(true);

    /* renamed from: c */
    private final ProjectionRenderer f12214c = new ProjectionRenderer();

    /* renamed from: d */
    private final FrameRotationQueue f12215d = new FrameRotationQueue();

    /* renamed from: e */
    private final TimedValueQueue<Long> f12216e = new TimedValueQueue<>();

    /* renamed from: f */
    private final TimedValueQueue<Projection> f12217f = new TimedValueQueue<>();

    /* renamed from: g */
    private final float[] f12218g = new float[16];

    /* renamed from: h */
    private final float[] f12219h = new float[16];

    /* renamed from: i */
    private int f12220i;

    /* renamed from: j */
    private SurfaceTexture f12221j;

    /* renamed from: k */
    private volatile int f12222k = 0;

    /* renamed from: l */
    private int f12223l = -1;

    /* renamed from: m */
    private byte[] f12224m;

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void mo14868g(SurfaceTexture surfaceTexture) {
        this.f12212a.set(true);
    }

    /* renamed from: i */
    private void m14961i(byte[] bArr, int i, long j) {
        byte[] bArr2 = this.f12224m;
        int i2 = this.f12223l;
        this.f12224m = bArr;
        if (i == -1) {
            i = this.f12222k;
        }
        this.f12223l = i;
        if (i2 != i || !Arrays.equals(bArr2, this.f12224m)) {
            Projection dVar = null;
            byte[] bArr3 = this.f12224m;
            if (bArr3 != null) {
                dVar = ProjectionDecoder.m10493a(bArr3, this.f12223l);
            }
            if (dVar == null || !ProjectionRenderer.m14952c(dVar)) {
                dVar = Projection.m10489b(this.f12223l);
            }
            this.f12217f.mo7436a(j, dVar);
        }
    }

    /* renamed from: a */
    public void mo7516a(long j, float[] fArr) {
        this.f12215d.mo7520e(j, fArr);
    }

    /* renamed from: b */
    public void mo7517b() {
        this.f12216e.mo7437c();
        this.f12215d.mo7519d();
        this.f12213b.set(true);
    }

    /* renamed from: c */
    public void mo7579c(long j, long j2, Format u0Var, MediaFormat mediaFormat) {
        this.f12216e.mo7436a(j2, Long.valueOf(j));
        m14961i(u0Var.f8824v, u0Var.f8825w, j2);
    }

    /* renamed from: d */
    public void mo14866d(float[] fArr, boolean z) {
        GLES20.glClear(16384);
        GlUtil.m10339b();
        if (this.f12212a.compareAndSet(true, false)) {
            ((SurfaceTexture) Assertions.m10153e(this.f12221j)).updateTexImage();
            GlUtil.m10339b();
            if (this.f12213b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f12218g, 0);
            }
            long timestamp = this.f12221j.getTimestamp();
            Long l = (Long) this.f12216e.mo7438g(timestamp);
            if (l != null) {
                this.f12215d.mo7518c(this.f12218g, l.longValue());
            }
            Projection dVar = (Projection) this.f12217f.mo7440j(timestamp);
            if (dVar != null) {
                this.f12214c.mo14865d(dVar);
            }
        }
        Matrix.multiplyMM(this.f12219h, 0, fArr, 0, this.f12218g, 0);
        this.f12214c.mo14863a(this.f12220i, this.f12219h, z);
    }

    /* renamed from: e */
    public SurfaceTexture mo14867e() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        GlUtil.m10339b();
        this.f12214c.mo14864b();
        GlUtil.m10339b();
        this.f12220i = GlUtil.m10344g();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f12220i);
        this.f12221j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new C1887a(this));
        return this.f12221j;
    }

    /* renamed from: h */
    public void mo14869h(int i) {
        this.f12222k = i;
    }
}
