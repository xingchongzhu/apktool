.class public final Lc/a/a/a/n2/m;
.super Landroid/view/Surface;
.source "DummySurface.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/n2/m$b;
    }
.end annotation


# static fields
.field private static a:I

.field private static b:Z


# instance fields
.field public final c:Z

.field private final d:Lc/a/a/a/n2/m$b;

.field private e:Z


# direct methods
.method private constructor <init>(Lc/a/a/a/n2/m$b;Landroid/graphics/SurfaceTexture;Z)V
    .locals 0

    .line 2
    invoke-direct {p0, p2}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 3
    iput-object p1, p0, Lc/a/a/a/n2/m;->d:Lc/a/a/a/n2/m$b;

    .line 4
    iput-boolean p3, p0, Lc/a/a/a/n2/m;->c:Z

    return-void
.end method

.method synthetic constructor <init>(Lc/a/a/a/n2/m$b;Landroid/graphics/SurfaceTexture;ZLc/a/a/a/n2/m$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lc/a/a/a/n2/m;-><init>(Lc/a/a/a/n2/m$b;Landroid/graphics/SurfaceTexture;Z)V

    return-void
.end method

.method private static l(Landroid/content/Context;)I
    .locals 0

    .line 1
    invoke-static {p0}, Lc/a/a/a/m2/p;->h(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 2
    invoke-static {}, Lc/a/a/a/m2/p;->i()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x2

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static declared-synchronized m(Landroid/content/Context;)Z
    .locals 3

    const-class v0, Lc/a/a/a/n2/m;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-boolean v1, Lc/a/a/a/n2/m;->b:Z

    const/4 v2, 0x1

    if-nez v1, :cond_0

    .line 2
    invoke-static {p0}, Lc/a/a/a/n2/m;->l(Landroid/content/Context;)I

    move-result p0

    sput p0, Lc/a/a/a/n2/m;->a:I

    .line 3
    sput-boolean v2, Lc/a/a/a/n2/m;->b:Z

    .line 4
    :cond_0
    sget p0, Lc/a/a/a/n2/m;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static n(Landroid/content/Context;Z)Lc/a/a/a/n2/m;
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 1
    invoke-static {p0}, Lc/a/a/a/n2/m;->m(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    invoke-static {p0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    new-instance p0, Lc/a/a/a/n2/m$b;

    invoke-direct {p0}, Lc/a/a/a/n2/m$b;-><init>()V

    if-eqz p1, :cond_2

    .line 3
    sget v0, Lc/a/a/a/n2/m;->a:I

    :cond_2
    invoke-virtual {p0, v0}, Lc/a/a/a/n2/m$b;->a(I)Lc/a/a/a/n2/m;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public release()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/Surface;->release()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/n2/m;->d:Lc/a/a/a/n2/m$b;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-boolean v1, p0, Lc/a/a/a/n2/m;->e:Z

    if-nez v1, :cond_0

    .line 4
    iget-object v1, p0, Lc/a/a/a/n2/m;->d:Lc/a/a/a/n2/m$b;

    invoke-virtual {v1}, Lc/a/a/a/n2/m$b;->c()V

    const/4 v1, 0x1

    .line 5
    iput-boolean v1, p0, Lc/a/a/a/n2/m;->e:Z

    .line 6
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
