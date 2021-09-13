.class public final Lcom/google/android/exoplayer2/ui/x/h;
.super Landroid/opengl/GLSurfaceView;
.source "SphericalGLSurfaceView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/ui/x/h$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/hardware/SensorManager;

.field private final b:Landroid/hardware/Sensor;

.field private final c:Lcom/google/android/exoplayer2/ui/x/d;

.field private final d:Landroid/os/Handler;

.field private final e:Lcom/google/android/exoplayer2/ui/x/i;

.field private final f:Lcom/google/android/exoplayer2/ui/x/f;

.field private g:Landroid/graphics/SurfaceTexture;

.field private h:Landroid/view/Surface;

.field private i:Lc/a/a/a/l1$d;

.field private j:Z

.field private k:Z

.field private l:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/google/android/exoplayer2/ui/x/h;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/x/h;->d:Landroid/os/Handler;

    const-string p2, "sensor"

    .line 4
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/hardware/SensorManager;

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/x/h;->a:Landroid/hardware/SensorManager;

    .line 5
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_0

    const/16 v0, 0xf

    .line 6
    invoke-virtual {p2, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const/16 v0, 0xb

    .line 7
    invoke-virtual {p2, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    .line 8
    :cond_1
    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/x/h;->b:Landroid/hardware/Sensor;

    .line 9
    new-instance p2, Lcom/google/android/exoplayer2/ui/x/f;

    invoke-direct {p2}, Lcom/google/android/exoplayer2/ui/x/f;-><init>()V

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/x/h;->f:Lcom/google/android/exoplayer2/ui/x/f;

    .line 10
    new-instance v0, Lcom/google/android/exoplayer2/ui/x/h$a;

    invoke-direct {v0, p0, p2}, Lcom/google/android/exoplayer2/ui/x/h$a;-><init>(Lcom/google/android/exoplayer2/ui/x/h;Lcom/google/android/exoplayer2/ui/x/f;)V

    .line 11
    new-instance p2, Lcom/google/android/exoplayer2/ui/x/i;

    const/high16 v1, 0x41c80000    # 25.0f

    invoke-direct {p2, p1, v0, v1}, Lcom/google/android/exoplayer2/ui/x/i;-><init>(Landroid/content/Context;Lcom/google/android/exoplayer2/ui/x/i$a;F)V

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/x/h;->e:Lcom/google/android/exoplayer2/ui/x/i;

    const-string v1, "window"

    .line 12
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowManager;

    .line 13
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowManager;

    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    .line 14
    new-instance v1, Lcom/google/android/exoplayer2/ui/x/d;

    const/4 v2, 0x2

    new-array v3, v2, [Lcom/google/android/exoplayer2/ui/x/d$a;

    const/4 v4, 0x0

    aput-object p2, v3, v4

    const/4 v4, 0x1

    aput-object v0, v3, v4

    invoke-direct {v1, p1, v3}, Lcom/google/android/exoplayer2/ui/x/d;-><init>(Landroid/view/Display;[Lcom/google/android/exoplayer2/ui/x/d$a;)V

    iput-object v1, p0, Lcom/google/android/exoplayer2/ui/x/h;->c:Lcom/google/android/exoplayer2/ui/x/d;

    .line 15
    iput-boolean v4, p0, Lcom/google/android/exoplayer2/ui/x/h;->j:Z

    .line 16
    invoke-virtual {p0, v2}, Landroid/opengl/GLSurfaceView;->setEGLContextClientVersion(I)V

    .line 17
    invoke-virtual {p0, v0}, Landroid/opengl/GLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    .line 18
    invoke-virtual {p0, p2}, Landroid/opengl/GLSurfaceView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/exoplayer2/ui/x/h;Landroid/graphics/SurfaceTexture;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/ui/x/h;->f(Landroid/graphics/SurfaceTexture;)V

    return-void
.end method

.method private synthetic b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/x/h;->h:Landroid/view/Surface;

    if-eqz v0, :cond_1

    .line 2
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/x/h;->i:Lc/a/a/a/l1$d;

    if-eqz v1, :cond_0

    .line 3
    invoke-interface {v1, v0}, Lc/a/a/a/l1$d;->o(Landroid/view/Surface;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/x/h;->g:Landroid/graphics/SurfaceTexture;

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/x/h;->h:Landroid/view/Surface;

    invoke-static {v0, v1}, Lcom/google/android/exoplayer2/ui/x/h;->g(Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/x/h;->g:Landroid/graphics/SurfaceTexture;

    .line 6
    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/x/h;->h:Landroid/view/Surface;

    :cond_1
    return-void
.end method

.method private synthetic d(Landroid/graphics/SurfaceTexture;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/x/h;->g:Landroid/graphics/SurfaceTexture;

    .line 2
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/x/h;->h:Landroid/view/Surface;

    .line 3
    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/x/h;->g:Landroid/graphics/SurfaceTexture;

    .line 4
    new-instance v2, Landroid/view/Surface;

    invoke-direct {v2, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object v2, p0, Lcom/google/android/exoplayer2/ui/x/h;->h:Landroid/view/Surface;

    .line 5
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/x/h;->i:Lc/a/a/a/l1$d;

    if-eqz p1, :cond_0

    .line 6
    invoke-interface {p1, v2}, Lc/a/a/a/l1$d;->a(Landroid/view/Surface;)V

    .line 7
    :cond_0
    invoke-static {v0, v1}, Lcom/google/android/exoplayer2/ui/x/h;->g(Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V

    return-void
.end method

.method private f(Landroid/graphics/SurfaceTexture;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/x/h;->d:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/exoplayer2/ui/x/c;

    invoke-direct {v1, p0, p1}, Lcom/google/android/exoplayer2/ui/x/c;-><init>(Lcom/google/android/exoplayer2/ui/x/h;Landroid/graphics/SurfaceTexture;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static g(Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/graphics/SurfaceTexture;->release()V

    :cond_0
    if-eqz p1, :cond_1

    .line 2
    invoke-virtual {p1}, Landroid/view/Surface;->release()V

    :cond_1
    return-void
.end method

.method private h()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/x/h;->j:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/x/h;->k:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/x/h;->b:Landroid/hardware/Sensor;

    if-eqz v2, :cond_3

    iget-boolean v3, p0, Lcom/google/android/exoplayer2/ui/x/h;->l:Z

    if-ne v0, v3, :cond_1

    goto :goto_2

    :cond_1
    if-eqz v0, :cond_2

    .line 3
    iget-object v3, p0, Lcom/google/android/exoplayer2/ui/x/h;->a:Landroid/hardware/SensorManager;

    iget-object v4, p0, Lcom/google/android/exoplayer2/ui/x/h;->c:Lcom/google/android/exoplayer2/ui/x/d;

    invoke-virtual {v3, v4, v2, v1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    goto :goto_1

    .line 4
    :cond_2
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/x/h;->a:Landroid/hardware/SensorManager;

    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/x/h;->c:Lcom/google/android/exoplayer2/ui/x/d;

    invoke-virtual {v1, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 5
    :goto_1
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/ui/x/h;->l:Z

    :cond_3
    :goto_2
    return-void
.end method


# virtual methods
.method public synthetic c()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/x/h;->b()V

    return-void
.end method

.method public synthetic e(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/ui/x/h;->d(Landroid/graphics/SurfaceTexture;)V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onDetachedFromWindow()V

    .line 2
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/x/h;->d:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/exoplayer2/ui/x/b;

    invoke-direct {v1, p0}, Lcom/google/android/exoplayer2/ui/x/b;-><init>(Lcom/google/android/exoplayer2/ui/x/h;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onPause()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/ui/x/h;->k:Z

    .line 2
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/x/h;->h()V

    .line 3
    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onResume()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/ui/x/h;->k:Z

    .line 3
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/x/h;->h()V

    return-void
.end method

.method public setDefaultStereoMode(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/x/h;->f:Lcom/google/android/exoplayer2/ui/x/f;

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/ui/x/f;->h(I)V

    return-void
.end method

.method public setSingleTapListener(Lcom/google/android/exoplayer2/ui/x/g;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/x/h;->e:Lcom/google/android/exoplayer2/ui/x/i;

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/ui/x/i;->b(Lcom/google/android/exoplayer2/ui/x/g;)V

    return-void
.end method

.method public setUseSensorRotation(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/ui/x/h;->j:Z

    .line 2
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/x/h;->h()V

    return-void
.end method

.method public setVideoComponent(Lc/a/a/a/l1$d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/x/h;->i:Lc/a/a/a/l1$d;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    if-eqz v0, :cond_2

    .line 2
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/x/h;->h:Landroid/view/Surface;

    if-eqz v1, :cond_1

    .line 3
    invoke-interface {v0, v1}, Lc/a/a/a/l1$d;->o(Landroid/view/Surface;)V

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/x/h;->i:Lc/a/a/a/l1$d;

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/x/h;->f:Lcom/google/android/exoplayer2/ui/x/f;

    invoke-interface {v0, v1}, Lc/a/a/a/l1$d;->y(Lc/a/a/a/n2/v;)V

    .line 5
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/x/h;->i:Lc/a/a/a/l1$d;

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/x/h;->f:Lcom/google/android/exoplayer2/ui/x/f;

    invoke-interface {v0, v1}, Lc/a/a/a/l1$d;->s(Lc/a/a/a/n2/a0/a;)V

    .line 6
    :cond_2
    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/x/h;->i:Lc/a/a/a/l1$d;

    if-eqz p1, :cond_3

    .line 7
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/x/h;->f:Lcom/google/android/exoplayer2/ui/x/f;

    invoke-interface {p1, v0}, Lc/a/a/a/l1$d;->m(Lc/a/a/a/n2/v;)V

    .line 8
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/x/h;->i:Lc/a/a/a/l1$d;

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/x/h;->f:Lcom/google/android/exoplayer2/ui/x/f;

    invoke-interface {p1, v0}, Lc/a/a/a/l1$d;->b(Lc/a/a/a/n2/a0/a;)V

    .line 9
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/x/h;->i:Lc/a/a/a/l1$d;

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/x/h;->h:Landroid/view/Surface;

    invoke-interface {p1, v0}, Lc/a/a/a/l1$d;->a(Landroid/view/Surface;)V

    :cond_3
    return-void
.end method
