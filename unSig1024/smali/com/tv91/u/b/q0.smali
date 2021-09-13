.class public final Lcom/tv91/u/b/q0;
.super Lcom/tv91/u/b/w0;
.source "DownloadFragment.java"

# interfaces
.implements Lcom/tv91/u/b/v0$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/b/q0$c;,
        Lcom/tv91/u/b/q0$b;
    }
.end annotation


# instance fields
.field h0:Lcom/tv91/u/b/v0;

.field i0:Lcom/tv91/u/b/x0/m1;

.field j0:Lcom/tv91/u/b/x0/o1;

.field k0:Lcom/tv91/u/c/k/s;

.field private final l0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/b/t0;",
            ">;"
        }
    .end annotation
.end field

.field private m0:Lcom/tv91/x/h;

.field private n0:Landroid/content/ContentResolver;

.field private o0:Z

.field private p0:Lcom/tv91/model/a;

.field private q0:Lcom/tv91/model/a;

.field private r0:Lcom/tv91/model/a;

.field private final s0:Landroidx/activity/result/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/c<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f0d00a6

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/u/b/w0;-><init>(I)V

    .line 2
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    sget-object v1, Lcom/tv91/u/b/p;->a:Lcom/tv91/u/b/p;

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    .line 3
    new-instance v0, Lcom/tv91/u/b/q0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/tv91/u/b/q0$b;-><init>(Lcom/tv91/u/b/q0$a;)V

    new-instance v1, Lcom/tv91/u/b/x;

    invoke-direct {v1, p0}, Lcom/tv91/u/b/x;-><init>(Lcom/tv91/u/b/q0;)V

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->J1(Landroidx/activity/result/f/a;Landroidx/activity/result/b;)Landroidx/activity/result/c;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/u/b/q0;->s0:Landroidx/activity/result/c;

    return-void
.end method

.method private synthetic A2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    invoke-virtual {p1}, Lcom/tv91/s/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/u/b/t0;->Y(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic C2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/b/t0;->l0(Z)V

    return-void
.end method

.method private synthetic E2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/b/t0;->l0(Z)V

    return-void
.end method

.method private synthetic G2(Lcom/tv91/model/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    invoke-interface {v0, p1}, Lcom/tv91/u/b/t0;->K(Lcom/tv91/model/a;)V

    return-void
.end method

.method private synthetic I2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/tv91/s/c;->c()Ljava/lang/Exception;

    move-result-object v0

    invoke-static {v0}, Lh/a/a;->c(Ljava/lang/Throwable;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    invoke-virtual {p1}, Lcom/tv91/s/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/u/b/t0;->O0(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic K2(Lcom/tv91/u/b/q0;Lcom/tv91/model/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/q0;->p3(Lcom/tv91/model/a;)V

    return-void
.end method

.method static synthetic L2(Landroid/view/View;)Lcom/tv91/u/b/t0;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/b/u0;

    invoke-static {p0}, Lcom/tv91/r/d0;->b(Landroid/view/View;)Lcom/tv91/r/d0;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/tv91/u/b/u0;-><init>(Lcom/tv91/r/d0;)V

    return-object v0
.end method

.method private synthetic M2(Landroid/net/Uri;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/q0;->h0:Lcom/tv91/u/b/v0;

    invoke-virtual {v0, p0}, Lcom/tv91/u/b/v0;->n(Lcom/tv91/u/b/v0$c;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/b/q0;->n0:Landroid/content/ContentResolver;

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/b/q0;->r0:Lcom/tv91/model/a;

    invoke-virtual {p0, v0, p1}, Lcom/tv91/u/b/q0;->q3(Lcom/tv91/model/a;Landroid/net/Uri;)V

    return-void
.end method

.method private synthetic O2(Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/b/q0;->u3(Ljava/util/List;)V

    return-void
.end method

.method private synthetic Q2(Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/b/q0;->u3(Ljava/util/List;)V

    return-void
.end method

.method private synthetic S2(Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/b/q0;->r3(Ljava/util/List;)V

    return-void
.end method

.method static synthetic U2(Lcom/tv91/u/b/t0;Lcom/tv91/s/c;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/tv91/s/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/tv91/q/a/f;->g0(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic V2(Lcom/tv91/u/b/t0;Lcom/tv91/s/c;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/tv91/u/b/q0;->p0:Lcom/tv91/model/a;

    invoke-interface {p1, p2}, Lcom/tv91/u/b/t0;->Y0(Lcom/tv91/model/a;)V

    return-void
.end method

.method private synthetic X2(Lcom/tv91/u/b/t0;Lcom/tv91/s/c;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/tv91/u/b/q0;->p0:Lcom/tv91/model/a;

    invoke-interface {p1, p2}, Lcom/tv91/u/b/t0;->b0(Lcom/tv91/model/a;)V

    return-void
.end method

.method private synthetic Z2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/q0;->m0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    return-void
.end method

.method private synthetic b3()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    invoke-interface {v0}, Lcom/tv91/u/b/t0;->k2()V

    return-void
.end method

.method private synthetic d3(Lcom/tv91/model/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    invoke-interface {v0, p1}, Lcom/tv91/u/b/t0;->l1(Lcom/tv91/model/a;)V

    return-void
.end method

.method private synthetic f3(Lcom/tv91/model/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/q0;->h0:Lcom/tv91/u/b/v0;

    invoke-virtual {v0, p1}, Lcom/tv91/u/b/v0;->l(Lcom/tv91/model/a;)V

    return-void
.end method

.method private synthetic h3(Lcom/tv91/model/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/q0;->h0:Lcom/tv91/u/b/v0;

    invoke-virtual {v0, p1}, Lcom/tv91/u/b/v0;->k(Lcom/tv91/model/a;)V

    return-void
.end method

.method private synthetic j3(Lcom/tv91/model/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/q0;->h0:Lcom/tv91/u/b/v0;

    invoke-virtual {v0, p1}, Lcom/tv91/u/b/v0;->m(Lcom/tv91/model/a;)V

    return-void
.end method

.method private synthetic l3(Ljava/lang/Runnable;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/tv91/u/b/q0;->o0:Z

    .line 2
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method private p3(Lcom/tv91/model/a;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/tv91/model/a;->e:Ljava/lang/String;

    invoke-static {v0}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lcom/tv91/model/a;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    .line 2
    iput-object p1, p0, Lcom/tv91/u/b/q0;->r0:Lcom/tv91/model/a;

    .line 3
    iget-object p1, p0, Lcom/tv91/u/b/q0;->s0:Landroidx/activity/result/c;

    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/activity/result/c;->a(Ljava/lang/Object;)V

    goto :goto_1

    .line 4
    :cond_1
    iget-object p1, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p1}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/b/t0;

    const-string v0, "File Missing"

    invoke-interface {p1, v0}, Lcom/tv91/u/b/t0;->O0(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method private q2(Lcom/tv91/model/a;)Z
    .locals 4

    .line 1
    iget-object v0, p1, Lcom/tv91/model/a;->e:Ljava/lang/String;

    invoke-static {v0}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object p1, p1, Lcom/tv91/model/a;->e:Ljava/lang/String;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/Object;

    aput-object p1, v2, v1

    const-string v3, "path = %s"

    .line 3
    invoke-static {v3, v2}, Lh/a/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    const-string v3, "content"

    invoke-static {v3, v2}, Lcom/tv91/utils/g;->b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 5
    :try_start_0
    iget-object v2, p0, Lcom/tv91/u/b/q0;->n0:Landroid/content/ContentResolver;

    const-string v3, "r"

    invoke-virtual {v2, p1, v3}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz p1, :cond_2

    .line 6
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return v0

    :catch_0
    return v1

    .line 7
    :cond_3
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    return p1
.end method

.method public static synthetic r2(Lcom/tv91/u/b/q0;Lcom/tv91/model/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/q0;->s3(Lcom/tv91/model/a;)V

    return-void
.end method

.method private r3(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/model/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tv91/model/a;

    .line 2
    iget-object v1, v0, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    sget-object v2, Lcom/tv91/model/a$a;->a:Lcom/tv91/model/a$a;

    if-ne v1, v2, :cond_0

    .line 3
    iget-object v1, p0, Lcom/tv91/u/b/q0;->h0:Lcom/tv91/u/b/v0;

    invoke-virtual {v1, v0}, Lcom/tv91/u/b/v0;->j(Lcom/tv91/model/a;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private synthetic s2(Ljava/util/List;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    invoke-interface {v0, p1}, Lcom/tv91/u/b/t0;->x1(Ljava/util/List;)V

    .line 2
    iget-boolean v0, p0, Lcom/tv91/u/b/q0;->o0:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->O1()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/tv91/utils/h;->h(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Lcom/tv91/u/b/l;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/b/l;-><init>(Lcom/tv91/u/b/q0;Ljava/util/List;)V

    new-instance v1, Lcom/tv91/u/b/y;

    invoke-direct {v1, p0, p1}, Lcom/tv91/u/b/y;-><init>(Lcom/tv91/u/b/q0;Ljava/util/List;)V

    invoke-direct {p0, v0, v1}, Lcom/tv91/u/b/q0;->t3(Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    goto :goto_1

    .line 4
    :cond_1
    :goto_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/tv91/u/b/a0;

    invoke-direct {v1, p0, p1}, Lcom/tv91/u/b/a0;-><init>(Lcom/tv91/u/b/q0;Ljava/util/List;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_1
    return-void
.end method

.method private s3(Lcom/tv91/model/a;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lcom/tv91/u/b/q0;->p0:Lcom/tv91/model/a;

    .line 2
    sget-object v0, Lcom/tv91/u/b/q0$a;->a:[I

    iget-object v1, p1, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 3
    :pswitch_0
    iget-object v0, p0, Lcom/tv91/u/b/q0;->m0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/u/c/f/y1$a;

    iget-object p1, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget p1, p1, Lcom/tv91/model/Movie;->id:I

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lcom/tv91/u/c/f/y1$a;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    goto/16 :goto_1

    .line 4
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/tv91/u/b/q0;->q2(Lcom/tv91/model/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-object v1, v0, Lcom/tv91/model/Movie;->channel:Lcom/tv91/model/Channel;

    iget v1, v1, Lcom/tv91/model/b;->key:I

    const/4 v2, -0x2

    if-ne v1, v2, :cond_0

    .line 6
    iput-object p1, p0, Lcom/tv91/u/b/q0;->q0:Lcom/tv91/model/a;

    .line 7
    iget p1, v0, Lcom/tv91/model/Movie;->id:I

    invoke-virtual {p0, p1}, Lcom/tv91/u/b/q0;->o3(I)V

    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/b/q0;->m0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/features/movie/play/MoviePlayActivity$c;

    iget-object p1, p1, Lcom/tv91/model/a;->e:Ljava/lang/String;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/tv91/features/movie/play/MoviePlayActivity$c;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    goto :goto_1

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    invoke-interface {v0}, Lcom/tv91/u/b/t0;->N0()V

    .line 10
    sget-object v0, Lcom/tv91/model/a$a;->f:Lcom/tv91/model/a$a;

    invoke-virtual {p1, v1, v0}, Lcom/tv91/model/a;->e(Ljava/lang/String;Lcom/tv91/model/a$a;)Lcom/tv91/model/a;

    move-result-object p1

    .line 11
    iget-object v0, p0, Lcom/tv91/u/b/q0;->h0:Lcom/tv91/u/b/v0;

    invoke-virtual {v0, p1}, Lcom/tv91/u/b/v0;->p(Lcom/tv91/model/a;)V

    .line 12
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    invoke-interface {v0, p1}, Lcom/tv91/u/b/t0;->K(Lcom/tv91/model/a;)V

    goto :goto_1

    .line 13
    :pswitch_2
    iget-boolean v0, p0, Lcom/tv91/u/b/q0;->o0:Z

    if-nez v0, :cond_3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->O1()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/tv91/utils/h;->h(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 14
    :cond_2
    new-instance v0, Lcom/tv91/u/b/u;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/b/u;-><init>(Lcom/tv91/u/b/q0;Lcom/tv91/model/a;)V

    invoke-direct {p0, v0, v1}, Lcom/tv91/u/b/q0;->t3(Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    goto :goto_1

    .line 15
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/tv91/u/b/q0;->h0:Lcom/tv91/u/b/v0;

    invoke-virtual {v0, p1}, Lcom/tv91/u/b/v0;->m(Lcom/tv91/model/a;)V

    goto :goto_1

    .line 16
    :pswitch_3
    iget-object v0, p0, Lcom/tv91/u/b/q0;->h0:Lcom/tv91/u/b/v0;

    invoke-virtual {v0, p1}, Lcom/tv91/u/b/v0;->j(Lcom/tv91/model/a;)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private t3(Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->M1()Landroidx/fragment/app/e;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f12005d

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f120013

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->m(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/b/c0;

    invoke-direct {v1, p0, p1}, Lcom/tv91/u/b/c0;-><init>(Lcom/tv91/u/b/q0;Ljava/lang/Runnable;)V

    const p1, 0x7f12005b

    .line 4
    invoke-virtual {v0, p1, v1}, Lcom/tv91/features/shared/widget/e$a;->w(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const v0, 0x7f120055

    .line 5
    invoke-virtual {p1, v0, p2}, Lcom/tv91/features/shared/widget/e$a;->p(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 6
    invoke-virtual {p1, p2}, Lcom/tv91/features/shared/widget/e$a;->s(Ljava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method private synthetic u2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/b/t0;->a(Z)V

    return-void
.end method

.method private u3(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/model/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tv91/model/a;

    .line 2
    iget-object v1, v0, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    sget-object v2, Lcom/tv91/model/a$a;->c:Lcom/tv91/model/a$a;

    if-eq v1, v2, :cond_1

    sget-object v2, Lcom/tv91/model/a$a;->b:Lcom/tv91/model/a$a;

    if-ne v1, v2, :cond_0

    .line 3
    :cond_1
    iget-object v1, p0, Lcom/tv91/u/b/q0;->h0:Lcom/tv91/u/b/v0;

    invoke-virtual {v1, v0}, Lcom/tv91/u/b/v0;->m(Lcom/tv91/model/a;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private synthetic w2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/b/t0;->a(Z)V

    return-void
.end method

.method private synthetic y2(Lcom/tv91/model/Movie;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/q0;->q0:Lcom/tv91/model/a;

    iget-object v0, v0, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    invoke-virtual {v0}, Lcom/tv91/model/Movie;->newBuilder()Lcom/tv91/model/Movie$Builder;

    move-result-object v0

    iget-object p1, p1, Lcom/tv91/model/Movie;->channel:Lcom/tv91/model/Channel;

    invoke-virtual {v0, p1}, Lcom/tv91/model/Movie$Builder;->channel(Lcom/tv91/model/Channel;)Lcom/tv91/model/Movie$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tv91/model/Movie$Builder;->build()Lcom/tv91/model/Movie;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/tv91/u/b/q0;->h0:Lcom/tv91/u/b/v0;

    iget-object v1, p0, Lcom/tv91/u/b/q0;->q0:Lcom/tv91/model/a;

    invoke-virtual {v1, p1}, Lcom/tv91/model/a;->c(Lcom/tv91/model/Movie;)Lcom/tv91/model/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tv91/u/b/v0;->p(Lcom/tv91/model/a;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/u/b/q0;->m0:Lcom/tv91/x/h;

    new-instance v0, Lcom/tv91/features/movie/play/MoviePlayActivity$c;

    iget-object v1, p0, Lcom/tv91/u/b/q0;->q0:Lcom/tv91/model/a;

    iget-object v1, v1, Lcom/tv91/model/a;->e:Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/tv91/features/movie/play/MoviePlayActivity$c;-><init>(Landroid/net/Uri;)V

    invoke-virtual {p1, v0}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method


# virtual methods
.method public synthetic B2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/q0;->A2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic D2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/b/q0;->C2()V

    return-void
.end method

.method public synthetic F2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/b/q0;->E2()V

    return-void
.end method

.method public synthetic H2(Lcom/tv91/model/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/q0;->G2(Lcom/tv91/model/a;)V

    return-void
.end method

.method public J0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->J0(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroidx/lifecycle/f;

    move-result-object p1

    new-instance v0, Lcom/tv91/features/shared/UmengObserver;

    invoke-virtual {p0}, Lcom/tv91/x/f;->l2()Lcom/tv91/x/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tv91/x/c;->m()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/UmengObserver;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/h;)V

    .line 3
    invoke-static {p0}, Lcom/tv91/x/h;->b(Landroidx/fragment/app/Fragment;)Lcom/tv91/x/h;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/b/q0;->m0:Lcom/tv91/x/h;

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->O1()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/b/q0;->n0:Landroid/content/ContentResolver;

    return-void
.end method

.method public synthetic J2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/q0;->I2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic N2(Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/q0;->M2(Landroid/net/Uri;)V

    return-void
.end method

.method public synthetic P2(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/q0;->O2(Ljava/util/List;)V

    return-void
.end method

.method public synthetic R2(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/q0;->Q2(Ljava/util/List;)V

    return-void
.end method

.method public synthetic T2(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/q0;->S2(Ljava/util/List;)V

    return-void
.end method

.method public synthetic W2(Lcom/tv91/u/b/t0;Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/b/q0;->V2(Lcom/tv91/u/b/t0;Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic Y2(Lcom/tv91/u/b/t0;Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/b/q0;->X2(Lcom/tv91/u/b/t0;Lcom/tv91/s/c;)V

    return-void
.end method

.method public Z0()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->Z0()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/b/t0;->a(Z)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    invoke-interface {v0, v1}, Lcom/tv91/u/b/t0;->l0(Z)V

    return-void
.end method

.method public a(Lcom/tv91/s/c;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    .line 2
    new-instance v1, Lcom/tv91/u/b/j;

    invoke-direct {v1, v0}, Lcom/tv91/u/b/j;-><init>(Lcom/tv91/u/b/t0;)V

    invoke-static {v1}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v1

    new-instance v2, Lcom/tv91/u/b/w;

    invoke-direct {v2, p0, v0}, Lcom/tv91/u/b/w;-><init>(Lcom/tv91/u/b/q0;Lcom/tv91/u/b/t0;)V

    const-string v3, "Download-Corrupt"

    .line 3
    invoke-virtual {v1, v3, v2}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v1

    new-instance v2, Lcom/tv91/u/b/i;

    invoke-direct {v2, p0, v0}, Lcom/tv91/u/b/i;-><init>(Lcom/tv91/u/b/q0;Lcom/tv91/u/b/t0;)V

    const-string v0, "Download-000003"

    .line 4
    invoke-virtual {v1, v0, v2}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic a3()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/b/q0;->Z2()V

    return-void
.end method

.method public synthetic c3()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/b/q0;->b3()V

    return-void
.end method

.method public synthetic e3(Lcom/tv91/model/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/q0;->d3(Lcom/tv91/model/a;)V

    return-void
.end method

.method public synthetic f()V
    .locals 0

    invoke-static {p0}, Lcom/tv91/u/b/x0/s1;->b(Lcom/tv91/u/b/x0/t1$a;)V

    return-void
.end method

.method public g1()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    new-instance v1, Lcom/tv91/u/b/k;

    invoke-direct {v1, p0}, Lcom/tv91/u/b/k;-><init>(Lcom/tv91/u/b/q0;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/b/t0;->b(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    new-instance v1, Lcom/tv91/u/b/o;

    invoke-direct {v1, p0}, Lcom/tv91/u/b/o;-><init>(Lcom/tv91/u/b/q0;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/b/t0;->o(Ljava/lang/Runnable;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    new-instance v1, Lcom/tv91/u/b/t;

    invoke-direct {v1, p0}, Lcom/tv91/u/b/t;-><init>(Lcom/tv91/u/b/q0;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/b/t0;->a2(Lb/g/j/a;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    new-instance v1, Lcom/tv91/u/b/q;

    invoke-direct {v1, p0}, Lcom/tv91/u/b/q;-><init>(Lcom/tv91/u/b/q0;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/b/t0;->n(Lb/g/j/a;)V

    .line 6
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    new-instance v1, Lcom/tv91/u/b/d0;

    invoke-direct {v1, p0}, Lcom/tv91/u/b/d0;-><init>(Lcom/tv91/u/b/q0;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/b/t0;->f1(Lb/g/j/a;)V

    .line 7
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    new-instance v1, Lcom/tv91/u/b/z;

    invoke-direct {v1, p0}, Lcom/tv91/u/b/z;-><init>(Lcom/tv91/u/b/q0;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/b/t0;->e0(Lb/g/j/a;)V

    .line 8
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    new-instance v1, Lcom/tv91/u/b/v;

    invoke-direct {v1, p0}, Lcom/tv91/u/b/v;-><init>(Lcom/tv91/u/b/q0;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/b/t0;->A(Lb/g/j/a;)V

    .line 9
    iget-object v0, p0, Lcom/tv91/u/b/q0;->h0:Lcom/tv91/u/b/v0;

    invoke-virtual {v0, p0}, Lcom/tv91/u/b/v0;->n(Lcom/tv91/u/b/v0$c;)V

    .line 10
    invoke-virtual {p0}, Lcom/tv91/u/b/q0;->n3()V

    return-void
.end method

.method public synthetic g3(Lcom/tv91/model/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/q0;->f3(Lcom/tv91/model/a;)V

    return-void
.end method

.method public synthetic h()V
    .locals 0

    invoke-static {p0}, Lcom/tv91/u/b/x0/e1;->b(Lcom/tv91/u/b/x0/f1$a;)V

    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/b/q0;->h0:Lcom/tv91/u/b/v0;

    invoke-virtual {v0, p0}, Lcom/tv91/u/b/v0;->o(Lcom/tv91/u/b/v0$c;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/b/q0;->i0:Lcom/tv91/u/b/x0/m1;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/b/q0;->j0:Lcom/tv91/u/b/x0/o1;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/b/q0;->k0:Lcom/tv91/u/c/k/s;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method public i(Lcom/tv91/model/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    invoke-interface {v0, p1}, Lcom/tv91/u/b/t0;->K(Lcom/tv91/model/a;)V

    return-void
.end method

.method public synthetic i3(Lcom/tv91/model/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/q0;->h3(Lcom/tv91/model/a;)V

    return-void
.end method

.method public k(Lcom/tv91/model/a;Ljava/lang/Number;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p2}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p2

    check-cast p2, Lcom/tv91/u/b/t0;

    invoke-interface {p2, p1}, Lcom/tv91/u/b/t0;->K(Lcom/tv91/model/a;)V

    return-void
.end method

.method public synthetic k3(Lcom/tv91/model/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/q0;->j3(Lcom/tv91/model/a;)V

    return-void
.end method

.method public synthetic l()V
    .locals 0

    invoke-static {p0}, Lcom/tv91/u/b/x0/u1;->b(Lcom/tv91/u/b/x0/v1$a;)V

    return-void
.end method

.method public synthetic m()V
    .locals 0

    invoke-static {p0}, Lcom/tv91/u/b/x0/q1;->b(Lcom/tv91/u/b/x0/r1$a;)V

    return-void
.end method

.method public synthetic m3(Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/q0;->l3(Ljava/lang/Runnable;)V

    return-void
.end method

.method public n(Lcom/tv91/model/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/b/t0;

    invoke-interface {v0, p1}, Lcom/tv91/u/b/t0;->K(Lcom/tv91/model/a;)V

    return-void
.end method

.method public n3()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/q0;->i0:Lcom/tv91/u/b/x0/m1;

    new-instance v1, Lcom/tv91/u/b/n;

    invoke-direct {v1, p0}, Lcom/tv91/u/b/n;-><init>(Lcom/tv91/u/b/q0;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/b/x0/m1;->E(Ljava/lang/Runnable;)Lcom/tv91/u/b/x0/m1;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/b/s;

    invoke-direct {v1, p0}, Lcom/tv91/u/b/s;-><init>(Lcom/tv91/u/b/q0;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/b/x0/m1;->D(Ljava/lang/Runnable;)Lcom/tv91/u/b/x0/m1;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/b/g0;

    invoke-direct {v1, p0}, Lcom/tv91/u/b/g0;-><init>(Lcom/tv91/u/b/q0;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/b/x0/m1;->F(Lb/g/j/a;)Lcom/tv91/u/b/x0/m1;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/b/o0;

    invoke-direct {v1, p0}, Lcom/tv91/u/b/o0;-><init>(Lcom/tv91/u/b/q0;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/b/x0/m1;->C(Lb/g/j/a;)Lcom/tv91/u/b/x0/m1;

    move-result-object v0

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1}, Lcom/tv91/u/b/x0/m1;->o(Lcom/tv91/model/a$a;)V

    return-void
.end method

.method public o(Lcom/tv91/model/a;)V
    .locals 0

    return-void
.end method

.method public o3(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/q0;->k0:Lcom/tv91/u/c/k/s;

    new-instance v1, Lcom/tv91/u/b/b0;

    invoke-direct {v1, p0}, Lcom/tv91/u/b/b0;-><init>(Lcom/tv91/u/b/q0;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/s;->y(Lb/g/j/a;)Lcom/tv91/u/c/k/s;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/b/e0;

    invoke-direct {v1, p0}, Lcom/tv91/u/b/e0;-><init>(Lcom/tv91/u/b/q0;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/s;->v(Lb/g/j/a;)Lcom/tv91/u/c/k/s;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p1}, Lcom/tv91/u/c/k/s;->o(I)V

    return-void
.end method

.method public synthetic q()V
    .locals 0

    invoke-static {p0}, Lcom/tv91/u/b/x0/e1;->a(Lcom/tv91/u/b/x0/f1$a;)V

    return-void
.end method

.method public q3(Lcom/tv91/model/a;Landroid/net/Uri;)V
    .locals 3

    if-nez p2, :cond_0

    return-void

    .line 1
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/tv91/u/b/q0;->n0:Landroid/content/ContentResolver;

    const-string v1, "rw"

    invoke-virtual {v0, p2, v1}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 2
    :cond_1
    iget-object v1, p0, Lcom/tv91/u/b/q0;->j0:Lcom/tv91/u/b/x0/o1;

    new-instance v2, Lcom/tv91/u/b/f0;

    invoke-direct {v2, p0}, Lcom/tv91/u/b/f0;-><init>(Lcom/tv91/u/b/q0;)V

    invoke-virtual {v1, v2}, Lcom/tv91/u/b/x0/o1;->E(Ljava/lang/Runnable;)Lcom/tv91/u/b/x0/o1;

    move-result-object v1

    new-instance v2, Lcom/tv91/u/b/m;

    invoke-direct {v2, p0}, Lcom/tv91/u/b/m;-><init>(Lcom/tv91/u/b/q0;)V

    .line 3
    invoke-virtual {v1, v2}, Lcom/tv91/u/b/x0/o1;->D(Ljava/lang/Runnable;)Lcom/tv91/u/b/x0/o1;

    move-result-object v1

    new-instance v2, Lcom/tv91/u/b/r;

    invoke-direct {v2, p0}, Lcom/tv91/u/b/r;-><init>(Lcom/tv91/u/b/q0;)V

    .line 4
    invoke-virtual {v1, v2}, Lcom/tv91/u/b/x0/o1;->F(Lb/g/j/a;)Lcom/tv91/u/b/x0/o1;

    move-result-object v1

    new-instance v2, Lcom/tv91/u/b/h0;

    invoke-direct {v2, p0}, Lcom/tv91/u/b/h0;-><init>(Lcom/tv91/u/b/q0;)V

    .line 5
    invoke-virtual {v1, v2}, Lcom/tv91/u/b/x0/o1;->C(Lb/g/j/a;)Lcom/tv91/u/b/x0/o1;

    move-result-object v1

    .line 6
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p1, v0, p2}, Lcom/tv91/u/b/x0/o1;->o(Lcom/tv91/model/a;Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 7
    invoke-static {p1}, Lh/a/a;->c(Ljava/lang/Throwable;)V

    .line 8
    iget-object p2, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p2}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p2

    check-cast p2, Lcom/tv91/u/b/t0;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/tv91/u/b/t0;->O0(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public synthetic r()V
    .locals 0

    invoke-static {p0}, Lcom/tv91/u/b/x0/s1;->a(Lcom/tv91/u/b/x0/t1$a;)V

    return-void
.end method

.method public synthetic s()V
    .locals 0

    invoke-static {p0}, Lcom/tv91/u/b/x0/u1;->a(Lcom/tv91/u/b/x0/v1$a;)V

    return-void
.end method

.method public synthetic t()V
    .locals 0

    invoke-static {p0}, Lcom/tv91/u/b/x0/q1;->a(Lcom/tv91/u/b/x0/r1$a;)V

    return-void
.end method

.method public synthetic t2(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/q0;->s2(Ljava/util/List;)V

    return-void
.end method

.method public u(Lcom/tv91/model/a;Ljava/io/File;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/tv91/u/b/q0;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p2}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p2

    check-cast p2, Lcom/tv91/u/b/t0;

    invoke-interface {p2, p1}, Lcom/tv91/u/b/t0;->K(Lcom/tv91/model/a;)V

    return-void
.end method

.method public synthetic v2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/b/q0;->u2()V

    return-void
.end method

.method public synthetic x2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/b/q0;->w2()V

    return-void
.end method

.method public synthetic z2(Lcom/tv91/model/Movie;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/q0;->y2(Lcom/tv91/model/Movie;)V

    return-void
.end method
