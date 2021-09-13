package p067c.p068a.p069a.p070a.p112n2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.EGLSurfaceTexture;
import p067c.p068a.p069a.p070a.p111m2.GlUtil;
import p067c.p068a.p069a.p070a.p111m2.Log;

/* renamed from: c.a.a.a.n2.m */
public final class DummySurface extends Surface {

    /* renamed from: a */
    private static int f8538a;

    /* renamed from: b */
    private static boolean f8539b;

    /* renamed from: c */
    public final boolean f8540c;

    /* renamed from: d */
    private final C1217b f8541d;

    /* renamed from: e */
    private boolean f8542e;

    /* renamed from: c.a.a.a.n2.m$b */
    /* compiled from: DummySurface */
    private static class C1217b extends HandlerThread implements Callback {

        /* renamed from: a */
        private EGLSurfaceTexture f8543a;

        /* renamed from: b */
        private Handler f8544b;

        /* renamed from: c */
        private Error f8545c;

        /* renamed from: d */
        private RuntimeException f8546d;

        /* renamed from: e */
        private DummySurface f8547e;

        public C1217b() {
            super("ExoPlayer:DummySurface");
        }

        /* renamed from: b */
        private void m10508b(int i) {
            Assertions.m10153e(this.f8543a);
            this.f8543a.mo7458h(i);
            this.f8547e = new DummySurface(this, this.f8543a.mo7457g(), i != 0);
        }

        /* renamed from: d */
        private void m10509d() {
            Assertions.m10153e(this.f8543a);
            this.f8543a.mo7459i();
        }

        /* renamed from: a */
        public DummySurface mo7542a(int i) {
            boolean z;
            start();
            this.f8544b = new Handler(getLooper(), this);
            this.f8543a = new EGLSurfaceTexture(this.f8544b);
            synchronized (this) {
                z = false;
                this.f8544b.obtainMessage(1, i, 0).sendToTarget();
                while (this.f8547e == null && this.f8546d == null && this.f8545c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f8546d;
            if (runtimeException == null) {
                Error error = this.f8545c;
                if (error == null) {
                    return (DummySurface) Assertions.m10153e(this.f8547e);
                }
                throw error;
            }
            throw runtimeException;
        }

        /* renamed from: c */
        public void mo7543c() {
            Assertions.m10153e(this.f8544b);
            this.f8544b.sendEmptyMessage(2);
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                try {
                    m10508b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    Log.m10382d("DummySurface", "Failed to initialize dummy surface", e);
                    this.f8546d = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    try {
                        Log.m10382d("DummySurface", "Failed to initialize dummy surface", e2);
                        this.f8545c = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            } else if (i != 2) {
                return true;
            } else {
                try {
                    m10509d();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                quit();
                return true;
            }
        }
    }

    /* renamed from: l */
    private static int m10505l(Context context) {
        if (GlUtil.m10345h(context)) {
            return GlUtil.m10346i() ? 1 : 2;
        }
        return 0;
    }

    /* renamed from: m */
    public static synchronized boolean m10506m(Context context) {
        boolean z;
        synchronized (DummySurface.class) {
            z = true;
            if (!f8539b) {
                f8538a = m10505l(context);
                f8539b = true;
            }
            if (f8538a == 0) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: n */
    public static DummySurface m10507n(Context context, boolean z) {
        int i = 0;
        Assertions.m10154f(!z || m10506m(context));
        C1217b bVar = new C1217b();
        if (z) {
            i = f8538a;
        }
        return bVar.mo7542a(i);
    }

    public void release() {
        super.release();
        synchronized (this.f8541d) {
            if (!this.f8542e) {
                this.f8541d.mo7543c();
                this.f8542e = true;
            }
        }
    }

    private DummySurface(C1217b bVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f8541d = bVar;
        this.f8540c = z;
    }
}
