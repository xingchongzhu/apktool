.class public final Lcom/tv91/u/c/f/y1;
.super Lcom/tv91/u/c/f/x1;
.source "MovieFragment.java"

# interfaces
.implements Lcom/tv91/u/b/v0$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/c/f/y1$a;
    }
.end annotation


# instance fields
.field private A0:Lcom/tv91/model/a;

.field private B0:I

.field private C0:Z

.field private D0:I

.field private E0:Lcom/tv91/model/a;

.field h0:Lcom/tv91/u/b/v0;

.field i0:Lcom/tv91/y/h;

.field j0:Lcom/tv91/u/c/k/s;

.field k0:Lcom/tv91/u/c/k/t;

.field l0:Lcom/tv91/u/b/x0/k1;

.field m0:Lcom/tv91/u/b/x0/m1;

.field n0:Lcom/tv91/u/c/k/r;

.field o0:Lcom/tv91/u/c/k/o;

.field p0:Lcom/tv91/u/c/k/u;

.field q0:Lcom/tv91/u/b/x0/g1;

.field r0:Lcom/tv91/u/b/x0/i1;

.field s0:Lcom/tv91/u/h/k/r;

.field private final t0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/c/c;",
            ">;"
        }
    .end annotation
.end field

.field private u0:Lcom/tv91/x/h;

.field private v0:I

.field private w0:I

.field private x0:Z

.field private y0:Z

.field private z0:Lcom/tv91/model/Movie;


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f0d00ad

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/u/c/f/x1;-><init>(I)V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/tv91/u/c/f/y1;->B0:I

    .line 3
    iput-boolean v0, p0, Lcom/tv91/u/c/f/y1;->C0:Z

    .line 4
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    sget-object v1, Lcom/tv91/u/c/f/g;->a:Lcom/tv91/u/c/f/g;

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    return-void
.end method

.method private synthetic A3(Lcom/tv91/s/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->v2()V

    return-void
.end method

.method private synthetic A4()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->d2(Z)V

    return-void
.end method

.method private synthetic B2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->d2(Z)V

    return-void
.end method

.method private synthetic C3(Lcom/tv91/s/c;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p1}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/c/c;

    invoke-interface {p1}, Lcom/tv91/u/c/c;->m0()V

    return-void
.end method

.method private synthetic C4(Lcom/tv91/model/Movie;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p1}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/c/c;

    invoke-interface {p1}, Lcom/tv91/u/c/c;->L1()V

    .line 2
    iget-object p1, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p1}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/c/c;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/tv91/u/c/c;->y1(Z)V

    return-void
.end method

.method private synthetic D2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    invoke-interface {v0}, Lcom/tv91/u/c/c;->O1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->y1(Z)V

    return-void
.end method

.method private synthetic E3(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p1}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/c/c;

    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->z0:Lcom/tv91/model/Movie;

    iget v0, v0, Lcom/tv91/model/Movie;->download:I

    invoke-interface {p1, v0}, Lcom/tv91/u/c/c;->z(I)V

    return-void
.end method

.method public static synthetic E4(Lcom/tv91/u/c/f/y1;Lcom/tv91/model/Movie;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/f/y1;->I4(Lcom/tv91/model/Movie;)V

    return-void
.end method

.method private synthetic F2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->d2(Z)V

    return-void
.end method

.method private synthetic G3(Lcom/tv91/s/c;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p1}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/c/c;

    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->z0:Lcom/tv91/model/Movie;

    iget v1, v0, Lcom/tv91/model/Movie;->download:I

    iget-wide v2, v0, Lcom/tv91/model/Movie;->fileSize:J

    invoke-interface {p1, v1, v2, v3}, Lcom/tv91/u/c/c;->h1(IJ)V

    return-void
.end method

.method private synthetic H2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->d2(Z)V

    return-void
.end method

.method private synthetic I3(Lcom/tv91/s/c;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p1}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/c/c;

    invoke-interface {p1}, Lcom/tv91/u/c/c;->q1()V

    return-void
.end method

.method private I4(Lcom/tv91/model/Movie;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/tv91/u/c/f/y1;->w0:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    iput-object p1, p0, Lcom/tv91/u/c/f/y1;->z0:Lcom/tv91/model/Movie;

    invoke-interface {v0, p1}, Lcom/tv91/u/c/c;->u(Lcom/tv91/model/Movie;)V

    .line 3
    iget-boolean v0, p0, Lcom/tv91/u/c/f/y1;->y0:Z

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p0, p1}, Lcom/tv91/u/c/f/y1;->F4(Lcom/tv91/model/Movie;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p1}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/c/c;

    const/4 v0, 0x0

    iget v1, p0, Lcom/tv91/u/c/f/y1;->D0:I

    invoke-interface {p1, v0, v1}, Lcom/tv91/u/c/c;->J0(Lcom/tv91/model/a;I)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    iput-object p1, p0, Lcom/tv91/u/c/f/y1;->z0:Lcom/tv91/model/Movie;

    invoke-interface {v0, p1}, Lcom/tv91/u/c/c;->M(Lcom/tv91/model/Movie;)V

    .line 7
    :goto_0
    invoke-virtual {p0}, Lcom/tv91/u/c/f/y1;->G4()V

    return-void
.end method

.method private synthetic J2(Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->h0:Lcom/tv91/u/b/v0;

    iget-wide v1, p1, Lcom/tv91/model/Movie;->fileSize:J

    invoke-virtual {v0, v1, v2}, Lcom/tv91/u/b/v0;->i(J)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object p2, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p2}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p2

    check-cast p2, Lcom/tv91/u/c/c;

    iget-wide v0, p1, Lcom/tv91/model/Movie;->fileSize:J

    invoke-interface {p2, v0, v1}, Lcom/tv91/u/c/c;->c0(J)V

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/tv91/u/c/f/y1;->v0:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lcom/tv91/model/Movie;->extension:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 4
    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->O1()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/tv91/utils/c;->d(Landroid/content/Context;)Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->h0:Lcom/tv91/u/b/v0;

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1}, Lcom/tv91/u/b/v0;->e(Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private synthetic K3(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p1}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/c/c;

    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->z0:Lcom/tv91/model/Movie;

    iget v0, v0, Lcom/tv91/model/Movie;->download:I

    invoke-interface {p1, v0}, Lcom/tv91/u/c/c;->z(I)V

    return-void
.end method

.method private synthetic L2(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    invoke-interface {v0, p1}, Lcom/tv91/u/c/c;->s1(Ljava/lang/String;)V

    return-void
.end method

.method private L4()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/tv91/u/c/f/y1;->y0:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->u0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->A0:Lcom/tv91/model/a;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/tv91/model/a;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->A0:Lcom/tv91/model/a;

    invoke-direct {p0, v0}, Lcom/tv91/u/c/f/y1;->w2(Lcom/tv91/model/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->u0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/features/movie/play/MoviePlayActivity$c;

    iget-object v2, p0, Lcom/tv91/u/c/f/y1;->A0:Lcom/tv91/model/a;

    iget-object v2, v2, Lcom/tv91/model/a;->e:Ljava/lang/String;

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/tv91/features/movie/play/MoviePlayActivity$c;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->A0:Lcom/tv91/model/a;

    const/4 v1, 0x0

    sget-object v2, Lcom/tv91/model/a$a;->f:Lcom/tv91/model/a$a;

    invoke-virtual {v0, v1, v2}, Lcom/tv91/model/a;->e(Ljava/lang/String;Lcom/tv91/model/a$a;)Lcom/tv91/model/a;

    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/tv91/u/c/f/y1;->h0:Lcom/tv91/u/b/v0;

    invoke-virtual {v1, v0}, Lcom/tv91/u/b/v0;->p(Lcom/tv91/model/a;)V

    .line 8
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->z0:Lcom/tv91/model/Movie;

    invoke-virtual {p0, v0}, Lcom/tv91/u/c/f/y1;->J4(Lcom/tv91/model/Movie;)V

    goto :goto_0

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->z0:Lcom/tv91/model/Movie;

    invoke-virtual {p0, v0}, Lcom/tv91/u/c/f/y1;->J4(Lcom/tv91/model/Movie;)V

    :goto_0
    return-void
.end method

.method private synthetic M3()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->u0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    return-void
.end method

.method static synthetic N2(Lcom/tv91/u/c/c;Lcom/tv91/s/c;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/tv91/s/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/tv91/q/a/f;->g0(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic O2(Lcom/tv91/s/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->v2()V

    return-void
.end method

.method private synthetic O3()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->z0:Lcom/tv91/model/Movie;

    iget v1, v0, Lcom/tv91/model/Movie;->sourceId:I

    const/4 v2, 0x1

    if-gt v1, v2, :cond_1

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->u0:Lcom/tv91/x/h;

    iget-boolean v1, p0, Lcom/tv91/u/c/f/y1;->y0:Z

    if-eqz v1, :cond_0

    new-instance v1, Lcom/tv91/u/h/i/y$a;

    invoke-direct {v1}, Lcom/tv91/u/h/i/y$a;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    :goto_0
    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    goto :goto_1

    .line 3
    :cond_1
    invoke-virtual {p0, v0}, Lcom/tv91/u/c/f/y1;->N4(Lcom/tv91/model/Movie;)V

    :goto_1
    return-void
.end method

.method static synthetic Q2(Lcom/tv91/u/c/c;Lcom/tv91/s/c;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/tv91/s/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/tv91/u/c/c;->C0(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic Q3()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->h0:Lcom/tv91/u/b/v0;

    iget-object v1, p0, Lcom/tv91/u/c/f/y1;->A0:Lcom/tv91/model/a;

    invoke-virtual {v0, v1}, Lcom/tv91/u/b/v0;->l(Lcom/tv91/model/a;)V

    return-void
.end method

.method static synthetic R2(Lcom/tv91/u/c/c;Lcom/tv91/s/c;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/tv91/s/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/tv91/u/c/c;->C0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic S2(Lcom/tv91/u/c/c;Lcom/tv91/s/c;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/tv91/s/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/tv91/u/c/c;->r1(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic S3()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->h0:Lcom/tv91/u/b/v0;

    iget-object v1, p0, Lcom/tv91/u/c/f/y1;->A0:Lcom/tv91/model/a;

    invoke-virtual {v0, v1}, Lcom/tv91/u/b/v0;->k(Lcom/tv91/model/a;)V

    return-void
.end method

.method private synthetic T2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->u0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic U3()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->z0:Lcom/tv91/model/Movie;

    invoke-virtual {p0, v0}, Lcom/tv91/u/c/f/y1;->M4(Lcom/tv91/model/Movie;)V

    return-void
.end method

.method private synthetic V2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->d2(Z)V

    return-void
.end method

.method private synthetic W3()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->u0:Lcom/tv91/x/h;

    iget-boolean v1, p0, Lcom/tv91/u/c/f/y1;->y0:Z

    if-eqz v1, :cond_0

    new-instance v1, Lcom/tv91/u/h/i/y$a;

    invoke-direct {v1}, Lcom/tv91/u/h/i/y$a;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    :goto_0
    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic X2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->d2(Z)V

    return-void
.end method

.method private synthetic Y3()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->z0:Lcom/tv91/model/Movie;

    iget-object v0, v0, Lcom/tv91/model/Movie;->categories:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/tv91/u/c/f/y1;->K4(Ljava/util/List;)V

    return-void
.end method

.method private synthetic Z2(Lcom/tv91/model/a;)V
    .locals 4

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Lcom/tv91/model/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/io/File;

    iget-object v1, p1, Lcom/tv91/model/a;->e:Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    long-to-double v0, v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    iget-object v2, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-wide v2, v2, Lcom/tv91/model/Movie;->fileSize:J

    long-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, p0, Lcom/tv91/u/c/f/y1;->D0:I

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    iput-object p1, p0, Lcom/tv91/u/c/f/y1;->A0:Lcom/tv91/model/a;

    iget v1, p0, Lcom/tv91/u/c/f/y1;->D0:I

    invoke-interface {v0, p1, v1}, Lcom/tv91/u/c/c;->J0(Lcom/tv91/model/a;I)V

    return-void
.end method

.method private synthetic a4()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->z0:Lcom/tv91/model/Movie;

    iget-boolean v1, v0, Lcom/tv91/model/Movie;->favorite:Z

    if-eqz v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    iget-object v1, p0, Lcom/tv91/u/c/f/y1;->z0:Lcom/tv91/model/Movie;

    iget-object v1, v1, Lcom/tv91/model/Movie;->name:Ljava/lang/String;

    new-instance v2, Lcom/tv91/u/c/f/d0;

    invoke-direct {v2, p0}, Lcom/tv91/u/c/f/d0;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-interface {v0, v1, v2}, Lcom/tv91/u/c/c;->o1(Ljava/lang/String;Ljava/lang/Runnable;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0, v0}, Lcom/tv91/u/c/f/y1;->q2(Lcom/tv91/model/Movie;)V

    :goto_0
    return-void
.end method

.method private synthetic b3(Ljava/util/List;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 2
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/model/a;

    iput-object p1, p0, Lcom/tv91/u/c/f/y1;->E0:Lcom/tv91/model/a;

    .line 3
    invoke-virtual {p1}, Lcom/tv91/model/a;->a()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tv91/u/c/f/y1;->E0:Lcom/tv91/model/a;

    invoke-direct {p0, p1}, Lcom/tv91/u/c/f/y1;->w2(Lcom/tv91/model/a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    new-instance p1, Ljava/io/File;

    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->E0:Lcom/tv91/model/a;

    iget-object v0, v0, Lcom/tv91/model/a;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v0

    long-to-double v0, v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    iget-object p1, p0, Lcom/tv91/u/c/f/y1;->E0:Lcom/tv91/model/a;

    iget-object p1, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-wide v2, p1, Lcom/tv91/model/Movie;->fileSize:J

    long-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, v2

    double-to-int v1, v0

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p1}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/c/c;

    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->E0:Lcom/tv91/model/a;

    invoke-interface {p1, v0, v1}, Lcom/tv91/u/c/c;->q0(Lcom/tv91/model/a;I)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p1}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/c/c;

    const/4 v0, 0x0

    invoke-interface {p1, v0, v1}, Lcom/tv91/u/c/c;->q0(Lcom/tv91/model/a;I)V

    :goto_0
    return-void
.end method

.method private synthetic c4(Lcom/tv91/model/Actor;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->u0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/u/c/i/z$a;

    invoke-direct {v1, p1}, Lcom/tv91/u/c/i/z$a;-><init>(Lcom/tv91/model/Actor;)V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic d3()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->d2(Z)V

    return-void
.end method

.method private synthetic e4()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->z0:Lcom/tv91/model/Movie;

    iget-object v0, v0, Lcom/tv91/model/Movie;->categories:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/tv91/u/c/f/y1;->K4(Ljava/util/List;)V

    return-void
.end method

.method private synthetic f3()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->d2(Z)V

    return-void
.end method

.method private synthetic g4(Lcom/tv91/model/Movie;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->u0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/u/c/f/y1$a;

    iget v2, p1, Lcom/tv91/model/Movie;->id:I

    iget p1, p1, Lcom/tv91/model/Movie;->sourceId:I

    invoke-direct {v1, v2, p1}, Lcom/tv91/u/c/f/y1$a;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic h3()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->d2(Z)V

    return-void
.end method

.method private synthetic i4()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->u0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/u/b/q0$c;

    invoke-direct {v1}, Lcom/tv91/u/b/q0$c;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic j3()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->d2(Z)V

    return-void
.end method

.method private synthetic k4()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/tv91/u/c/f/y1;->x0:Z

    .line 2
    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->r2()V

    return-void
.end method

.method private synthetic l3(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->u0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/features/movie/play/MoviePlayActivity$c;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/tv91/features/movie/play/MoviePlayActivity$c;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic m4()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->d2(Z)V

    return-void
.end method

.method private synthetic n3()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/tv91/u/c/f/y1;->C0:Z

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->i0(Z)V

    return-void
.end method

.method private synthetic o4()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->d2(Z)V

    return-void
.end method

.method private synthetic p3()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/tv91/u/c/f/y1;->C0:Z

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->i0(Z)V

    return-void
.end method

.method private synthetic q4(Lcom/tv91/model/Movie;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tv91/u/c/f/y1;->s2(Lcom/tv91/model/Movie;)V

    return-void
.end method

.method private r2()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/tv91/u/c/f/y1;->y0:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->u0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/tv91/u/c/f/y1;->x0:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->O1()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/tv91/utils/h;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    invoke-interface {v0}, Lcom/tv91/u/c/c;->f0()V

    return-void

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->A0:Lcom/tv91/model/a;

    if-nez v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->z0:Lcom/tv91/model/Movie;

    invoke-virtual {p0, v0}, Lcom/tv91/u/c/f/y1;->s2(Lcom/tv91/model/Movie;)V

    return-void

    .line 7
    :cond_2
    iget-object v1, v0, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    sget-object v2, Lcom/tv91/model/a$a;->a:Lcom/tv91/model/a$a;

    if-ne v1, v2, :cond_3

    .line 8
    iget-object v1, p0, Lcom/tv91/u/c/f/y1;->h0:Lcom/tv91/u/b/v0;

    invoke-virtual {v1, v0}, Lcom/tv91/u/b/v0;->j(Lcom/tv91/model/a;)V

    goto :goto_1

    .line 9
    :cond_3
    invoke-virtual {v0}, Lcom/tv91/model/a;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 10
    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->L4()V

    goto :goto_1

    .line 11
    :cond_4
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->A0:Lcom/tv91/model/a;

    iget-object v1, v0, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    sget-object v2, Lcom/tv91/model/a$a;->b:Lcom/tv91/model/a$a;

    if-eq v1, v2, :cond_6

    sget-object v2, Lcom/tv91/model/a$a;->c:Lcom/tv91/model/a$a;

    if-ne v1, v2, :cond_5

    goto :goto_0

    .line 12
    :cond_5
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->z0:Lcom/tv91/model/Movie;

    invoke-virtual {p0, v0}, Lcom/tv91/u/c/f/y1;->s2(Lcom/tv91/model/Movie;)V

    goto :goto_1

    .line 13
    :cond_6
    :goto_0
    iget-object v1, p0, Lcom/tv91/u/c/f/y1;->h0:Lcom/tv91/u/b/v0;

    invoke-virtual {v1, v0}, Lcom/tv91/u/b/v0;->m(Lcom/tv91/model/a;)V

    :goto_1
    return-void
.end method

.method private synthetic r3(Lcom/tv91/model/Paging;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/tv91/u/c/f/y1;->B0:I

    iget v1, p1, Lcom/tv91/model/Paging;->pageCount:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    iput v0, p0, Lcom/tv91/u/c/f/y1;->B0:I

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    invoke-virtual {p1}, Lcom/tv91/model/Paging;->getMovies()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/u/c/c;->N1(Ljava/util/List;)V

    return-void
.end method

.method private synthetic s4()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->d2(Z)V

    return-void
.end method

.method private synthetic t3(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/tv91/s/c;->c()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Lh/a/a;->c(Ljava/lang/Throwable;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p1}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/c/c;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/tv91/u/c/c;->N1(Ljava/util/List;)V

    return-void
.end method

.method private synthetic u4()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->d2(Z)V

    return-void
.end method

.method private v2()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->M1()Landroidx/fragment/app/e;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/b0;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/b0;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-static {v0, v1}, Lcom/tv91/features/shared/widget/e;->b(Landroid/content/Context;Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic v3(Landroid/view/View;)Lcom/tv91/u/c/c;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/c/f/b2;

    invoke-static {p0}, Lcom/tv91/r/k0;->b(Landroid/view/View;)Lcom/tv91/r/k0;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/tv91/u/c/f/b2;-><init>(Lcom/tv91/r/k0;)V

    return-object v0
.end method

.method private w2(Lcom/tv91/model/a;)Z
    .locals 3

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

    .line 3
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v2, "content"

    invoke-static {v2, v0}, Lcom/tv91/utils/g;->b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->O1()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    :try_start_0
    const-string v2, "r"

    .line 5
    invoke-virtual {v0, p1, v2}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

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

.method private synthetic w3()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->z0:Lcom/tv91/model/Movie;

    invoke-virtual {p0, v0}, Lcom/tv91/u/c/f/y1;->O4(Lcom/tv91/model/Movie;)V

    return-void
.end method

.method private synthetic w4(Lcom/tv91/model/Movie;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tv91/u/c/f/y1;->J4(Lcom/tv91/model/Movie;)V

    return-void
.end method

.method public static synthetic x2(Lcom/tv91/u/c/f/y1;)V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->r2()V

    return-void
.end method

.method public static synthetic y2(Lcom/tv91/u/c/f/y1;)V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->L4()V

    return-void
.end method

.method private synthetic y3(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    invoke-virtual {p1}, Lcom/tv91/s/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/q/a/f;->g0(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic y4()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->d2(Z)V

    return-void
.end method

.method private synthetic z2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->d2(Z)V

    return-void
.end method


# virtual methods
.method public synthetic A2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->z2()V

    return-void
.end method

.method public synthetic B3(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/f/y1;->A3(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic B4()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->A4()V

    return-void
.end method

.method public synthetic C2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->B2()V

    return-void
.end method

.method public synthetic D3(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/f/y1;->C3(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic D4(Lcom/tv91/model/Movie;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/f/y1;->C4(Lcom/tv91/model/Movie;)V

    return-void
.end method

.method public synthetic E2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->D2()V

    return-void
.end method

.method public synthetic F3(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/f/y1;->E3(Lcom/tv91/s/c;)V

    return-void
.end method

.method public F4(Lcom/tv91/model/Movie;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->l0:Lcom/tv91/u/b/x0/k1;

    new-instance v1, Lcom/tv91/u/c/f/h0;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/h0;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/b/x0/k1;->E(Ljava/lang/Runnable;)Lcom/tv91/u/b/x0/k1;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/c1;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/c1;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/b/x0/k1;->D(Ljava/lang/Runnable;)Lcom/tv91/u/b/x0/k1;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/m;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/m;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/b/x0/k1;->F(Lb/g/j/a;)Lcom/tv91/u/b/x0/k1;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/w1;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/w1;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/b/x0/k1;->C(Lb/g/j/a;)Lcom/tv91/u/b/x0/k1;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/tv91/u/b/x0/k1;->o(Lcom/tv91/model/Movie;)V

    return-void
.end method

.method public synthetic G2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->F2()V

    return-void
.end method

.method public G4()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->m0:Lcom/tv91/u/b/x0/m1;

    new-instance v1, Lcom/tv91/u/c/f/k0;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/k0;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/b/x0/m1;->F(Lb/g/j/a;)Lcom/tv91/u/b/x0/m1;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/w1;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/w1;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/b/x0/m1;->C(Lb/g/j/a;)Lcom/tv91/u/b/x0/m1;

    move-result-object v0

    sget-object v1, Lcom/tv91/model/a$a;->a:Lcom/tv91/model/a$a;

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/b/x0/m1;->o(Lcom/tv91/model/a$a;)V

    return-void
.end method

.method public synthetic H3(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/f/y1;->G3(Lcom/tv91/s/c;)V

    return-void
.end method

.method public H4(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->j0:Lcom/tv91/u/c/k/s;

    new-instance v1, Lcom/tv91/u/c/f/u0;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/u0;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/s;->x(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/s;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/o0;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/o0;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/s;->w(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/s;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/i1;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/i1;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/s;->y(Lb/g/j/a;)Lcom/tv91/u/c/k/s;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/b;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/b;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/s;->v(Lb/g/j/a;)Lcom/tv91/u/c/k/s;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/tv91/u/c/k/s;->p(II)V

    return-void
.end method

.method public synthetic I2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->H2()V

    return-void
.end method

.method public J0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->J0(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Lcom/tv91/x/f;->l2()Lcom/tv91/x/c;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/c/f/y1$a;

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroidx/lifecycle/f;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/shared/UmengObserver;

    invoke-virtual {p0}, Lcom/tv91/x/f;->l2()Lcom/tv91/x/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tv91/x/c;->m()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/tv91/features/shared/UmengObserver;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/h;)V

    .line 4
    invoke-static {p0}, Lcom/tv91/x/h;->b(Landroidx/fragment/app/Fragment;)Lcom/tv91/x/h;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/u/c/f/y1;->u0:Lcom/tv91/x/h;

    .line 5
    iget v0, p1, Lcom/tv91/u/c/f/y1$a;->b:I

    iput v0, p0, Lcom/tv91/u/c/f/y1;->v0:I

    .line 6
    iget p1, p1, Lcom/tv91/u/c/f/y1$a;->c:I

    iput p1, p0, Lcom/tv91/u/c/f/y1;->w0:I

    .line 7
    iget-object p1, p0, Lcom/tv91/u/c/f/y1;->i0:Lcom/tv91/y/h;

    invoke-interface {p1}, Lcom/tv91/y/h;->e()Lcom/tv91/model/User;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/tv91/u/c/f/y1;->y0:Z

    return-void
.end method

.method public synthetic J3(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/f/y1;->I3(Lcom/tv91/s/c;)V

    return-void
.end method

.method public J4(Lcom/tv91/model/Movie;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->n0:Lcom/tv91/u/c/k/r;

    new-instance v1, Lcom/tv91/u/c/f/w;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/w;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/r;->w(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/r;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/j1;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/j1;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/r;->v(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/r;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/t0;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/t0;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/r;->x(Lb/g/j/a;)Lcom/tv91/u/c/k/r;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/b;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/b;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/r;->u(Lb/g/j/a;)Lcom/tv91/u/c/k/r;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/tv91/u/c/k/r;->o(Lcom/tv91/model/Movie;)V

    return-void
.end method

.method public synthetic K2(Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/c/f/y1;->J2(Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;)V

    return-void
.end method

.method public K4(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/model/Category;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/tv91/u/c/f/y1;->C0:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->k0:Lcom/tv91/u/c/k/t;

    new-instance v1, Lcom/tv91/u/c/f/u;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/u;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->A(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/a0;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/a0;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->z(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/e;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/e;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->B(Lb/g/j/a;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/v0;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/v0;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->y(Lb/g/j/a;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    iget v1, p0, Lcom/tv91/u/c/f/y1;->B0:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/tv91/u/c/f/y1;->B0:I

    const/16 v2, 0x8

    .line 6
    invoke-virtual {v0, v1, v2, p1}, Lcom/tv91/u/c/k/t;->q(IILjava/util/List;)V

    return-void
.end method

.method public synthetic L3(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/f/y1;->K3(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic M2(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/f/y1;->L2(Ljava/lang/String;)V

    return-void
.end method

.method public M4(Lcom/tv91/model/Movie;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->s0:Lcom/tv91/u/h/k/r;

    new-instance v1, Lcom/tv91/u/c/f/r0;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/r0;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/r;->w(Ljava/lang/Runnable;)Lcom/tv91/u/h/k/r;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/g1;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/g1;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/r;->v(Ljava/lang/Runnable;)Lcom/tv91/u/h/k/r;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/l0;

    invoke-direct {v1, p0, p1}, Lcom/tv91/u/c/f/l0;-><init>(Lcom/tv91/u/c/f/y1;Lcom/tv91/model/Movie;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/r;->x(Ljava/lang/Runnable;)Lcom/tv91/u/h/k/r;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/b;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/b;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/r;->u(Lb/g/j/a;)Lcom/tv91/u/h/k/r;

    move-result-object v0

    iget v1, p1, Lcom/tv91/model/Movie;->download:I

    .line 5
    invoke-static {v1}, Lcom/tv91/model/PurchasePackage;->download(I)Lcom/tv91/model/PurchasePackage;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/tv91/u/h/k/r;->o(Lcom/tv91/model/Movie;Lcom/tv91/model/PurchasePackage;)V

    return-void
.end method

.method public synthetic N3()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->M3()V

    return-void
.end method

.method public N4(Lcom/tv91/model/Movie;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->s0:Lcom/tv91/u/h/k/r;

    new-instance v1, Lcom/tv91/u/c/f/f0;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/f0;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/r;->w(Ljava/lang/Runnable;)Lcom/tv91/u/h/k/r;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/n;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/n;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/r;->v(Ljava/lang/Runnable;)Lcom/tv91/u/h/k/r;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/c0;

    invoke-direct {v1, p0, p1}, Lcom/tv91/u/c/f/c0;-><init>(Lcom/tv91/u/c/f/y1;Lcom/tv91/model/Movie;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/r;->x(Ljava/lang/Runnable;)Lcom/tv91/u/h/k/r;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/b;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/b;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/r;->u(Lb/g/j/a;)Lcom/tv91/u/h/k/r;

    move-result-object v0

    iget v1, p1, Lcom/tv91/model/Movie;->point:I

    .line 5
    invoke-static {v1}, Lcom/tv91/model/PurchasePackage;->single(I)Lcom/tv91/model/PurchasePackage;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/tv91/u/h/k/r;->o(Lcom/tv91/model/Movie;Lcom/tv91/model/PurchasePackage;)V

    return-void
.end method

.method public O4(Lcom/tv91/model/Movie;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->p0:Lcom/tv91/u/c/k/u;

    new-instance v1, Lcom/tv91/u/c/f/t;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/t;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/u;->w(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/u;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/n0;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/n0;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/u;->v(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/u;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/s;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/s;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/u;->x(Lb/g/j/a;)Lcom/tv91/u/c/k/u;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/b;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/b;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/u;->u(Lb/g/j/a;)Lcom/tv91/u/c/k/u;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/tv91/u/c/k/u;->o(Lcom/tv91/model/Movie;)V

    return-void
.end method

.method public synthetic P2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/f/y1;->O2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic P3()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->O3()V

    return-void
.end method

.method public synthetic R3()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->Q3()V

    return-void
.end method

.method public synthetic T3()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->S3()V

    return-void
.end method

.method public synthetic U2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->T2()V

    return-void
.end method

.method public synthetic V3()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->U3()V

    return-void
.end method

.method public synthetic W2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->V2()V

    return-void
.end method

.method public synthetic X3()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->W3()V

    return-void
.end method

.method public synthetic Y2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->X2()V

    return-void
.end method

.method public synthetic Z3()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->Y3()V

    return-void
.end method

.method public a(Lcom/tv91/s/c;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/u/c/f/v;

    invoke-direct {v0, p0}, Lcom/tv91/u/c/f/v;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-static {v0}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/d1;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/d1;-><init>(Lcom/tv91/u/c/f/y1;)V

    const-string v2, "0000001"

    .line 2
    invoke-virtual {v0, v2, v1}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/e0;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/e0;-><init>(Lcom/tv91/u/c/f/y1;)V

    const-string v2, "Download-Corrupt"

    .line 3
    invoke-virtual {v0, v2, v1}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/i0;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/i0;-><init>(Lcom/tv91/u/c/f/y1;)V

    const-string v2, "Download-000002"

    .line 4
    invoke-virtual {v0, v2, v1}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/p;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/p;-><init>(Lcom/tv91/u/c/f/y1;)V

    const-string v2, "Download-000003"

    .line 5
    invoke-virtual {v0, v2, v1}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/e1;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/e1;-><init>(Lcom/tv91/u/c/f/y1;)V

    const-string v2, "Download-Expired"

    .line 6
    invoke-virtual {v0, v2, v1}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/z;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/z;-><init>(Lcom/tv91/u/c/f/y1;)V

    const-string v2, "666"

    .line 7
    invoke-virtual {v0, v2, v1}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    .line 8
    invoke-virtual {v0, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic a3(Lcom/tv91/model/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/f/y1;->Z2(Lcom/tv91/model/a;)V

    return-void
.end method

.method public synthetic b4()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->a4()V

    return-void
.end method

.method public synthetic c3(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/f/y1;->b3(Ljava/util/List;)V

    return-void
.end method

.method public synthetic d4(Lcom/tv91/model/Actor;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/f/y1;->c4(Lcom/tv91/model/Actor;)V

    return-void
.end method

.method public synthetic e3()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->d3()V

    return-void
.end method

.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->d2(Z)V

    return-void
.end method

.method public synthetic f4()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->e4()V

    return-void
.end method

.method public g1()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    new-instance v1, Lcom/tv91/u/c/f/o;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/o;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->b(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    new-instance v1, Lcom/tv91/u/c/f/c;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/c;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->c(Ljava/lang/Runnable;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    new-instance v1, Lcom/tv91/u/c/f/q;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/q;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->a1(Ljava/lang/Runnable;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    new-instance v1, Lcom/tv91/u/c/f/b1;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/b1;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->E0(Ljava/lang/Runnable;)V

    .line 6
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    new-instance v1, Lcom/tv91/u/c/f/j;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/j;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->m(Ljava/lang/Runnable;)V

    .line 7
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    new-instance v1, Lcom/tv91/u/c/f/m0;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/m0;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->p(Lb/g/j/a;)V

    .line 8
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    new-instance v1, Lcom/tv91/u/c/f/l;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/l;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->C(Ljava/lang/Runnable;)V

    .line 9
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    new-instance v1, Lcom/tv91/u/c/f/y;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/y;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->e(Lb/g/j/a;)V

    .line 10
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    new-instance v1, Lcom/tv91/u/c/f/j0;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/j0;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->g1(Ljava/lang/Runnable;)V

    .line 11
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    new-instance v1, Lcom/tv91/u/c/f/x0;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/x0;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->F1(Ljava/lang/Runnable;)V

    .line 12
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    new-instance v1, Lcom/tv91/u/c/f/i;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/i;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->J1(Ljava/lang/Runnable;)V

    .line 13
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    new-instance v1, Lcom/tv91/u/c/f/k;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/k;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->Z0(Ljava/lang/Runnable;)V

    .line 14
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    new-instance v1, Lcom/tv91/u/c/f/f;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/f;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->Z(Ljava/lang/Runnable;)V

    .line 15
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    new-instance v1, Lcom/tv91/u/c/f/a;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/a;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->E(Ljava/lang/Runnable;)V

    .line 16
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    new-instance v1, Lcom/tv91/u/c/f/h1;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/h1;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->M1(Ljava/lang/Runnable;)V

    .line 17
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    new-instance v1, Lcom/tv91/u/c/f/w0;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/w0;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->z1(Ljava/lang/Runnable;)V

    .line 18
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->h0:Lcom/tv91/u/b/v0;

    invoke-virtual {v0, p0}, Lcom/tv91/u/b/v0;->n(Lcom/tv91/u/b/v0$c;)V

    .line 19
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->z0:Lcom/tv91/model/Movie;

    if-nez v0, :cond_0

    .line 20
    iget v0, p0, Lcom/tv91/u/c/f/y1;->v0:I

    iget v1, p0, Lcom/tv91/u/c/f/y1;->w0:I

    invoke-virtual {p0, v0, v1}, Lcom/tv91/u/c/f/y1;->H4(II)V

    goto :goto_0

    .line 21
    :cond_0
    invoke-direct {p0, v0}, Lcom/tv91/u/c/f/y1;->I4(Lcom/tv91/model/Movie;)V

    :goto_0
    return-void
.end method

.method public synthetic g3()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->f3()V

    return-void
.end method

.method public h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->d2(Z)V

    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->h0:Lcom/tv91/u/b/v0;

    invoke-virtual {v0, p0}, Lcom/tv91/u/b/v0;->o(Lcom/tv91/u/b/v0$c;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->j0:Lcom/tv91/u/c/k/s;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->k0:Lcom/tv91/u/c/k/t;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->l0:Lcom/tv91/u/b/x0/k1;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 6
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->m0:Lcom/tv91/u/b/x0/m1;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 7
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->n0:Lcom/tv91/u/c/k/r;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 8
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->o0:Lcom/tv91/u/c/k/o;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 9
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->p0:Lcom/tv91/u/c/k/u;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 10
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->q0:Lcom/tv91/u/b/x0/g1;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 11
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->r0:Lcom/tv91/u/b/x0/i1;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 12
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->s0:Lcom/tv91/u/h/k/r;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method public synthetic h4(Lcom/tv91/model/Movie;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/f/y1;->g4(Lcom/tv91/model/Movie;)V

    return-void
.end method

.method public i(Lcom/tv91/model/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    iput-object p1, p0, Lcom/tv91/u/c/f/y1;->A0:Lcom/tv91/model/a;

    iget v1, p0, Lcom/tv91/u/c/f/y1;->D0:I

    invoke-interface {v0, p1, v1}, Lcom/tv91/u/c/c;->J0(Lcom/tv91/model/a;I)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->E0:Lcom/tv91/model/a;

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    iget v1, p0, Lcom/tv91/u/c/f/y1;->D0:I

    invoke-interface {v0, p1, v1}, Lcom/tv91/u/c/c;->q0(Lcom/tv91/model/a;I)V

    :cond_0
    return-void
.end method

.method public synthetic i3()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->h3()V

    return-void
.end method

.method public synthetic j4()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->i4()V

    return-void
.end method

.method public k(Lcom/tv91/model/a;Ljava/lang/Number;)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    long-to-float p2, v0

    const/high16 v0, 0x42c80000    # 100.0f

    mul-float p2, p2, v0

    iget-object v0, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-wide v0, v0, Lcom/tv91/model/Movie;->fileSize:J

    long-to-float v0, v0

    div-float/2addr p2, v0

    float-to-int p2, p2

    iput p2, p0, Lcom/tv91/u/c/f/y1;->D0:I

    .line 2
    iget-object p2, p0, Lcom/tv91/u/c/f/y1;->A0:Lcom/tv91/model/a;

    invoke-virtual {p1, p2}, Lcom/tv91/model/a;->f(Lcom/tv91/model/a;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 3
    iget-object p2, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p2}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p2

    check-cast p2, Lcom/tv91/u/c/c;

    iput-object p1, p0, Lcom/tv91/u/c/f/y1;->A0:Lcom/tv91/model/a;

    iget v0, p0, Lcom/tv91/u/c/f/y1;->D0:I

    invoke-interface {p2, p1, v0}, Lcom/tv91/u/c/c;->J0(Lcom/tv91/model/a;I)V

    .line 4
    iget-object p2, p0, Lcom/tv91/u/c/f/y1;->E0:Lcom/tv91/model/a;

    if-nez p2, :cond_1

    .line 5
    iget-object p2, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p2}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p2

    check-cast p2, Lcom/tv91/u/c/c;

    iget v0, p0, Lcom/tv91/u/c/f/y1;->D0:I

    invoke-interface {p2, p1, v0}, Lcom/tv91/u/c/c;->q0(Lcom/tv91/model/a;I)V

    .line 6
    :cond_1
    iget-object p2, p0, Lcom/tv91/u/c/f/y1;->E0:Lcom/tv91/model/a;

    invoke-virtual {p1, p2}, Lcom/tv91/model/a;->f(Lcom/tv91/model/a;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 7
    iget-object p2, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p2}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p2

    check-cast p2, Lcom/tv91/u/c/c;

    iput-object p1, p0, Lcom/tv91/u/c/f/y1;->E0:Lcom/tv91/model/a;

    iget v0, p0, Lcom/tv91/u/c/f/y1;->D0:I

    invoke-interface {p2, p1, v0}, Lcom/tv91/u/c/c;->q0(Lcom/tv91/model/a;I)V

    :cond_2
    return-void
.end method

.method public synthetic k3()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->j3()V

    return-void
.end method

.method public l()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->d2(Z)V

    return-void
.end method

.method public synthetic l4()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->k4()V

    return-void
.end method

.method public m()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->d2(Z)V

    return-void
.end method

.method public synthetic m3(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/f/y1;->l3(Ljava/lang/String;)V

    return-void
.end method

.method public n(Lcom/tv91/model/a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->h0:Lcom/tv91/u/b/v0;

    iget-object v1, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-wide v1, v1, Lcom/tv91/model/Movie;->fileSize:J

    invoke-virtual {v0, v1, v2}, Lcom/tv91/u/b/v0;->g(J)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->A0:Lcom/tv91/model/a;

    invoke-virtual {p1, v0}, Lcom/tv91/model/a;->f(Lcom/tv91/model/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    iput-object p1, p0, Lcom/tv91/u/c/f/y1;->A0:Lcom/tv91/model/a;

    iget v1, p0, Lcom/tv91/u/c/f/y1;->D0:I

    invoke-interface {v0, p1, v1}, Lcom/tv91/u/c/c;->J0(Lcom/tv91/model/a;I)V

    :cond_0
    return-void
.end method

.method public synthetic n4()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->m4()V

    return-void
.end method

.method public o(Lcom/tv91/model/a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->h0:Lcom/tv91/u/b/v0;

    iget-object v1, p0, Lcom/tv91/u/c/f/y1;->z0:Lcom/tv91/model/Movie;

    iget-wide v1, v1, Lcom/tv91/model/Movie;->fileSize:J

    invoke-virtual {v0, v1, v2}, Lcom/tv91/u/b/v0;->f(J)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->h0:Lcom/tv91/u/b/v0;

    invoke-virtual {v0, p1}, Lcom/tv91/u/b/v0;->m(Lcom/tv91/model/a;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    iput-object p1, p0, Lcom/tv91/u/c/f/y1;->A0:Lcom/tv91/model/a;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/tv91/u/c/c;->J0(Lcom/tv91/model/a;I)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    iput-object p1, p0, Lcom/tv91/u/c/f/y1;->E0:Lcom/tv91/model/a;

    invoke-interface {v0, p1, v1}, Lcom/tv91/u/c/c;->q0(Lcom/tv91/model/a;I)V

    return-void
.end method

.method public synthetic o3()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->n3()V

    return-void
.end method

.method public synthetic p4()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->o4()V

    return-void
.end method

.method public synthetic q()V
    .locals 0

    invoke-static {p0}, Lcom/tv91/u/b/x0/e1;->a(Lcom/tv91/u/b/x0/f1$a;)V

    return-void
.end method

.method public q2(Lcom/tv91/model/Movie;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->o0:Lcom/tv91/u/c/k/o;

    new-instance v1, Lcom/tv91/u/c/f/q0;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/q0;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/o;->w(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/o;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/p0;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/p0;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/o;->v(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/o;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/z0;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/z0;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/o;->x(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/o;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/b;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/b;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/o;->u(Lb/g/j/a;)Lcom/tv91/u/c/k/o;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/tv91/u/c/k/o;->o(Lcom/tv91/model/Movie;)V

    return-void
.end method

.method public synthetic q3()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->p3()V

    return-void
.end method

.method public r()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->d2(Z)V

    return-void
.end method

.method public synthetic r4(Lcom/tv91/model/Movie;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/f/y1;->q4(Lcom/tv91/model/Movie;)V

    return-void
.end method

.method public synthetic s()V
    .locals 0

    invoke-static {p0}, Lcom/tv91/u/b/x0/u1;->a(Lcom/tv91/u/b/x0/v1$a;)V

    return-void
.end method

.method public s2(Lcom/tv91/model/Movie;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->q0:Lcom/tv91/u/b/x0/g1;

    new-instance v1, Lcom/tv91/u/c/f/r;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/r;-><init>(Lcom/tv91/u/c/f/y1;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/b/x0/g1;->E(Ljava/lang/Runnable;)Lcom/tv91/u/b/x0/g1;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/d;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/d;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/b/x0/g1;->D(Ljava/lang/Runnable;)Lcom/tv91/u/b/x0/g1;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/h;

    invoke-direct {v1, p0, p1}, Lcom/tv91/u/c/f/h;-><init>(Lcom/tv91/u/c/f/y1;Lcom/tv91/model/Movie;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/b/x0/g1;->F(Lb/g/j/a;)Lcom/tv91/u/b/x0/g1;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/w1;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/w1;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/b/x0/g1;->C(Lb/g/j/a;)Lcom/tv91/u/b/x0/g1;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/tv91/u/b/x0/g1;->o(Lcom/tv91/model/Movie;)V

    return-void
.end method

.method public synthetic s3(Lcom/tv91/model/Paging;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/f/y1;->r3(Lcom/tv91/model/Paging;)V

    return-void
.end method

.method public t()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/c/c;->d2(Z)V

    return-void
.end method

.method public t2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->r0:Lcom/tv91/u/b/x0/i1;

    new-instance v1, Lcom/tv91/u/c/f/x;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/x;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/b/x0/i1;->D(Lb/g/j/a;)Lcom/tv91/u/b/x0/i1;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/f/w1;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/f/w1;-><init>(Lcom/tv91/u/c/f/y1;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/b/x0/i1;->C(Lb/g/j/a;)Lcom/tv91/u/b/x0/i1;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/tv91/u/b/x0/i1;->o()V

    return-void
.end method

.method public synthetic t4()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->s4()V

    return-void
.end method

.method public u(Lcom/tv91/model/a;Ljava/io/File;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/tv91/u/c/f/y1;->A0:Lcom/tv91/model/a;

    invoke-virtual {p1, p2}, Lcom/tv91/model/a;->f(Lcom/tv91/model/a;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 2
    iget-object p2, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p2}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p2

    check-cast p2, Lcom/tv91/u/c/c;

    iput-object p1, p0, Lcom/tv91/u/c/f/y1;->A0:Lcom/tv91/model/a;

    const/16 v0, 0x64

    invoke-interface {p2, p1, v0}, Lcom/tv91/u/c/c;->J0(Lcom/tv91/model/a;I)V

    .line 3
    :cond_0
    iget-object p2, p0, Lcom/tv91/u/c/f/y1;->E0:Lcom/tv91/model/a;

    invoke-virtual {p1, p2}, Lcom/tv91/model/a;->f(Lcom/tv91/model/a;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/tv91/u/c/f/y1;->G4()V

    :cond_1
    return-void
.end method

.method public u2(Lcom/tv91/s/c;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/y1;->t0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/c;

    .line 2
    new-instance v1, Lcom/tv91/u/c/f/y0;

    invoke-direct {v1, v0}, Lcom/tv91/u/c/f/y0;-><init>(Lcom/tv91/u/c/c;)V

    invoke-static {v1}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v1

    new-instance v2, Lcom/tv91/u/c/f/g0;

    invoke-direct {v2, p0}, Lcom/tv91/u/c/f/g0;-><init>(Lcom/tv91/u/c/f/y1;)V

    const-string v3, "0000001"

    .line 3
    invoke-virtual {v1, v3, v2}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v1

    new-instance v2, Lcom/tv91/u/c/f/f1;

    invoke-direct {v2, v0}, Lcom/tv91/u/c/f/f1;-><init>(Lcom/tv91/u/c/c;)V

    const-string v3, "C000002"

    .line 4
    invoke-virtual {v1, v3, v2}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v1

    new-instance v2, Lcom/tv91/u/c/f/a1;

    invoke-direct {v2, v0}, Lcom/tv91/u/c/f/a1;-><init>(Lcom/tv91/u/c/c;)V

    const-string v3, "C002002"

    .line 5
    invoke-virtual {v1, v3, v2}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v1

    new-instance v2, Lcom/tv91/u/c/f/s0;

    invoke-direct {v2, v0}, Lcom/tv91/u/c/f/s0;-><init>(Lcom/tv91/u/c/c;)V

    const-string v0, "C000013"

    .line 6
    invoke-virtual {v1, v0, v2}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic u3(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/f/y1;->t3(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic v4()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->u4()V

    return-void
.end method

.method public synthetic x3()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->w3()V

    return-void
.end method

.method public synthetic x4(Lcom/tv91/model/Movie;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/f/y1;->w4(Lcom/tv91/model/Movie;)V

    return-void
.end method

.method public synthetic z3(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/f/y1;->y3(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic z4()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/f/y1;->y4()V

    return-void
.end method
