package com.google.android.exoplayer2.p196ui.p197x;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.Renderer;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.exoplayer2.p196ui.p197x.OrientationListener.C1890a;
import com.umeng.analytics.pro.UMCommonContent;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p067c.p068a.p069a.p070a.C1155l1.C1159d;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: com.google.android.exoplayer2.ui.x.h */
public final class SphericalGLSurfaceView extends GLSurfaceView {

    /* renamed from: a */
    private final SensorManager f12225a;

    /* renamed from: b */
    private final Sensor f12226b;

    /* renamed from: c */
    private final OrientationListener f12227c;

    /* renamed from: d */
    private final Handler f12228d;

    /* renamed from: e */
    private final TouchTracker f12229e;

    /* renamed from: f */
    private final SceneRenderer f12230f;

    /* renamed from: g */
    private SurfaceTexture f12231g;

    /* renamed from: h */
    private Surface f12232h;

    /* renamed from: i */
    private C1159d f12233i;

    /* renamed from: j */
    private boolean f12234j;

    /* renamed from: k */
    private boolean f12235k;

    /* renamed from: l */
    private boolean f12236l;

    /* renamed from: com.google.android.exoplayer2.ui.x.h$a */
    /* compiled from: SphericalGLSurfaceView */
    class C1892a implements Renderer, C1893a, C1890a {

        /* renamed from: a */
        private final SceneRenderer f12237a;

        /* renamed from: b */
        private final float[] f12238b = new float[16];

        /* renamed from: c */
        private final float[] f12239c = new float[16];

        /* renamed from: d */
        private final float[] f12240d;

        /* renamed from: e */
        private final float[] f12241e;

        /* renamed from: f */
        private final float[] f12242f;

        /* renamed from: g */
        private float f12243g;

        /* renamed from: h */
        private float f12244h;

        /* renamed from: i */
        private final float[] f12245i;

        /* renamed from: j */
        private final float[] f12246j;

        public C1892a(SceneRenderer fVar) {
            float[] fArr = new float[16];
            this.f12240d = fArr;
            float[] fArr2 = new float[16];
            this.f12241e = fArr2;
            float[] fArr3 = new float[16];
            this.f12242f = fArr3;
            this.f12245i = new float[16];
            this.f12246j = new float[16];
            this.f12237a = fVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f12244h = 3.1415927f;
        }

        /* renamed from: c */
        private float m14977c(float f) {
            if (!(f > 1.0f)) {
                return 90.0f;
            }
            double tan = Math.tan(Math.toRadians(45.0d));
            double d = (double) f;
            Double.isNaN(d);
            return (float) (Math.toDegrees(Math.atan(tan / d)) * 2.0d);
        }

        /* renamed from: d */
        private void m14978d() {
            Matrix.setRotateM(this.f12241e, 0, -this.f12243g, (float) Math.cos((double) this.f12244h), (float) Math.sin((double) this.f12244h), 0.0f);
        }

        /* renamed from: a */
        public synchronized void mo14862a(float[] fArr, float f) {
            float[] fArr2 = this.f12240d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f12244h = -f;
            m14978d();
        }

        /* renamed from: b */
        public synchronized void mo14879b(PointF pointF) {
            this.f12243g = pointF.y;
            m14978d();
            Matrix.setRotateM(this.f12242f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f12246j, 0, this.f12240d, 0, this.f12242f, 0);
                Matrix.multiplyMM(this.f12245i, 0, this.f12241e, 0, this.f12246j, 0);
            }
            Matrix.multiplyMM(this.f12239c, 0, this.f12238b, 0, this.f12245i, 0);
            this.f12237a.mo14866d(this.f12239c, false);
        }

        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = ((float) i) / ((float) i2);
            Matrix.perspectiveM(this.f12238b, 0, m14977c(f), f, 0.1f, 100.0f);
        }

        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView.this.m14972f(this.f12237a.mo14867e());
        }
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void mo14870c() {
        Surface surface = this.f12232h;
        if (surface != null) {
            C1159d dVar = this.f12233i;
            if (dVar != null) {
                dVar.mo7235o(surface);
            }
            m14973g(this.f12231g, this.f12232h);
            this.f12231g = null;
            this.f12232h = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void mo14871e(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f12231g;
        Surface surface = this.f12232h;
        this.f12231g = surfaceTexture;
        Surface surface2 = new Surface(surfaceTexture);
        this.f12232h = surface2;
        C1159d dVar = this.f12233i;
        if (dVar != null) {
            dVar.mo7232a(surface2);
        }
        m14973g(surfaceTexture2, surface);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m14972f(SurfaceTexture surfaceTexture) {
        this.f12228d.post(new C1889c(this, surfaceTexture));
    }

    /* renamed from: g */
    private static void m14973g(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    /* renamed from: h */
    private void m14974h() {
        boolean z = this.f12234j && this.f12235k;
        Sensor sensor = this.f12226b;
        if (sensor != null && z != this.f12236l) {
            if (z) {
                this.f12225a.registerListener(this.f12227c, sensor, 0);
            } else {
                this.f12225a.unregisterListener(this.f12227c);
            }
            this.f12236l = z;
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12228d.post(new C1888b(this));
    }

    public void onPause() {
        this.f12235k = false;
        m14974h();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f12235k = true;
        m14974h();
    }

    public void setDefaultStereoMode(int i) {
        this.f12230f.mo14869h(i);
    }

    public void setSingleTapListener(SingleTapListener gVar) {
        this.f12229e.mo14883b(gVar);
    }

    public void setUseSensorRotation(boolean z) {
        this.f12234j = z;
        m14974h();
    }

    public void setVideoComponent(C1159d dVar) {
        C1159d dVar2 = this.f12233i;
        if (dVar != dVar2) {
            if (dVar2 != null) {
                Surface surface = this.f12232h;
                if (surface != null) {
                    dVar2.mo7235o(surface);
                }
                this.f12233i.mo7238y(this.f12230f);
                this.f12233i.mo7236s(this.f12230f);
            }
            this.f12233i = dVar;
            if (dVar != null) {
                dVar.mo7234m(this.f12230f);
                this.f12233i.mo7233b(this.f12230f);
                this.f12233i.mo7232a(this.f12232h);
            }
        }
    }

    public SphericalGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12228d = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) Assertions.m10153e(context.getSystemService(UMCommonContent.f16605ac));
        this.f12225a = sensorManager;
        Sensor defaultSensor = Util.f8398a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        if (defaultSensor == null) {
            defaultSensor = sensorManager.getDefaultSensor(11);
        }
        this.f12226b = defaultSensor;
        SceneRenderer fVar = new SceneRenderer();
        this.f12230f = fVar;
        C1892a aVar = new C1892a(fVar);
        TouchTracker iVar = new TouchTracker(context, aVar, 25.0f);
        this.f12229e = iVar;
        this.f12227c = new OrientationListener(((WindowManager) Assertions.m10153e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), iVar, aVar);
        this.f12234j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(iVar);
    }
}
