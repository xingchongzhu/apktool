package p067c.p068a.p069a.p070a.p111m2;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* renamed from: c.a.a.a.m2.m */
public final class EGLSurfaceTexture implements OnFrameAvailableListener, Runnable {

    /* renamed from: a */
    private static final int[] f8390a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b */
    private final Handler f8391b;

    /* renamed from: c */
    private final int[] f8392c;

    /* renamed from: d */
    private final C1194c f8393d;

    /* renamed from: e */
    private EGLDisplay f8394e;

    /* renamed from: f */
    private EGLContext f8395f;

    /* renamed from: g */
    private EGLSurface f8396g;

    /* renamed from: h */
    private SurfaceTexture f8397h;

    /* renamed from: c.a.a.a.m2.m$b */
    /* compiled from: EGLSurfaceTexture */
    public static final class C1193b extends RuntimeException {
        private C1193b(String str) {
            super(str);
        }
    }

    /* renamed from: c.a.a.a.m2.m$c */
    /* compiled from: EGLSurfaceTexture */
    public interface C1194c {
        /* renamed from: a */
        void mo7462a();
    }

    public EGLSurfaceTexture(Handler handler) {
        this(handler, null);
    }

    /* renamed from: a */
    private static EGLConfig m10227a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f8390a, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null) {
            return eGLConfigArr[0];
        }
        throw new C1193b(Util.m10237A("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    /* renamed from: b */
    private static EGLContext m10228b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new C1193b("eglCreateContext failed");
    }

    /* renamed from: c */
    private static EGLSurface m10229c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        EGLSurface eGLSurface;
        int[] iArr;
        if (i == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            if (eGLSurface == null) {
                throw new C1193b("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            return eGLSurface;
        }
        throw new C1193b("eglMakeCurrent failed");
    }

    /* renamed from: d */
    private void m10230d() {
        C1194c cVar = this.f8393d;
        if (cVar != null) {
            cVar.mo7462a();
        }
    }

    /* renamed from: e */
    private static void m10231e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        GlUtil.m10339b();
    }

    /* renamed from: f */
    private static EGLDisplay m10232f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new C1193b("eglInitialize failed");
        }
        throw new C1193b("eglGetDisplay failed");
    }

    /* renamed from: g */
    public SurfaceTexture mo7457g() {
        return (SurfaceTexture) Assertions.m10153e(this.f8397h);
    }

    /* renamed from: h */
    public void mo7458h(int i) {
        EGLDisplay f = m10232f();
        this.f8394e = f;
        EGLConfig a = m10227a(f);
        EGLContext b = m10228b(this.f8394e, a, i);
        this.f8395f = b;
        this.f8396g = m10229c(this.f8394e, a, b, i);
        m10231e(this.f8392c);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f8392c[0]);
        this.f8397h = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* renamed from: i */
    public void mo7459i() {
        this.f8391b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f8397h;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f8392c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f8394e;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f8394e;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f8396g;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f8394e, this.f8396g);
            }
            EGLContext eGLContext = this.f8395f;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f8394e, eGLContext);
            }
            if (Util.f8398a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f8394e;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f8394e);
            }
            this.f8394e = null;
            this.f8395f = null;
            this.f8396g = null;
            this.f8397h = null;
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f8391b.post(this);
    }

    public void run() {
        m10230d();
        SurfaceTexture surfaceTexture = this.f8397h;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public EGLSurfaceTexture(Handler handler, C1194c cVar) {
        this.f8391b = handler;
        this.f8393d = cVar;
        this.f8392c = new int[1];
    }
}
