.class public final Lcom/tv91/u/g/a0;
.super Lcom/tv91/u/g/z;
.source "SplashFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/g/a0$a;
    }
.end annotation


# instance fields
.field h0:Lcom/tv91/z/b;

.field i0:Lcom/tv91/y/h;

.field j0:Lcom/tv91/y/e;

.field k0:Ljava/lang/String;

.field l0:Ljava/lang/String;

.field m0:Ljava/lang/String;

.field n0:Lcom/tv91/u/g/f0/k;

.field o0:Lcom/tv91/u/g/f0/i;

.field p0:Lcom/tv91/u/g/f0/j;

.field q0:Lcom/tv91/u/g/f0/l;

.field private final r0:Ljava/lang/String;

.field private final s0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/g/d0;",
            ">;"
        }
    .end annotation
.end field

.field private t0:Lcom/tv91/x/h;

.field private u0:Lcom/tv91/model/Url;

.field private v0:Lcom/tv91/model/Version;

.field private w0:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f0d00ba

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/u/g/z;-><init>(I)V

    const-string v0, "https://direct.lc.chat/11932596/"

    .line 2
    iput-object v0, p0, Lcom/tv91/u/g/a0;->r0:Ljava/lang/String;

    .line 3
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    sget-object v1, Lcom/tv91/u/g/f;->a:Lcom/tv91/u/g/f;

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/u/g/a0;->s0:Lcom/tv91/features/shared/ViewSupplier;

    return-void
.end method

.method private synthetic A2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/g/a0;->s0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/g/d0;

    invoke-interface {v0}, Lcom/tv91/u/g/d0;->w()V

    return-void
.end method

.method private synthetic C2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/g/a0;->t0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->a()V

    return-void
.end method

.method private synthetic E2(Ljava/io/File;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-le v1, v2, :cond_0

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->O1()Landroid/content/Context;

    move-result-object v1

    const-string v2, "com.chip.ninetyonetv.file.provider"

    invoke-static {v1, v2, p1}, Landroidx/core/content/FileProvider;->e(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    :goto_0
    const-string v1, "application/vnd.android.package-archive"

    .line 6
    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 p1, 0x10000000

    .line 7
    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 8
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->i2(Landroid/content/Intent;)V

    return-void
.end method

.method private synthetic G2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/g/n;

    invoke-direct {v0, p0}, Lcom/tv91/u/g/n;-><init>(Lcom/tv91/u/g/a0;)V

    invoke-static {v0}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    return-void
.end method

.method private synthetic I2()V
    .locals 2

    const-string v0, "com.tv91"

    const-string v1, "3.3"

    .line 1
    invoke-virtual {p0, v0, v1}, Lcom/tv91/u/g/a0;->q2(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic K2(Lcom/tv91/model/Url;)V
    .locals 6

    .line 1
    iput-object p1, p0, Lcom/tv91/u/g/a0;->u0:Lcom/tv91/model/Url;

    .line 2
    iget-object v0, p0, Lcom/tv91/u/g/a0;->h0:Lcom/tv91/z/b;

    const/4 v1, 0x2

    new-array v2, v1, [Ljava/lang/String;

    iget-object v3, p1, Lcom/tv91/model/Url;->apiUrl:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p1, Lcom/tv91/model/Url;->apiUrl2:Ljava/lang/String;

    const/4 v5, 0x1

    aput-object v3, v2, v5

    invoke-interface {v0, v2}, Lcom/tv91/z/b;->z([Ljava/lang/String;)V

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    iget-object p1, p1, Lcom/tv91/model/Url;->webUrl:Ljava/lang/String;

    aput-object p1, v0, v4

    iget-object p1, p0, Lcom/tv91/u/g/a0;->j0:Lcom/tv91/y/e;

    invoke-interface {p1}, Lcom/tv91/y/e;->c()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "%s/update.html?sid=%d&pid=%d"

    invoke-static {p1, v0}, Lcom/tv91/utils/g;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/g/a0;->w0:Ljava/lang/String;

    return-void
.end method

.method private synthetic M2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/g/h;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/g/h;-><init>(Lcom/tv91/u/g/a0;Lcom/tv91/s/c;)V

    invoke-static {v0}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    .line 2
    invoke-virtual {v0, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    return-void
.end method

.method static synthetic O2(Landroid/view/View;)Lcom/tv91/u/g/d0;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/g/e0;

    invoke-static {p0}, Lcom/tv91/r/w0;->b(Landroid/view/View;)Lcom/tv91/r/w0;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/tv91/u/g/e0;-><init>(Lcom/tv91/r/w0;)V

    return-object v0
.end method

.method private synthetic P2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/g/a0;->s0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/g/d0;

    invoke-virtual {p1}, Lcom/tv91/s/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/q/a/f;->g0(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic R2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/g/a0;->s0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/g/d0;

    invoke-virtual {p1}, Lcom/tv91/s/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/u/g/d0;->G1(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic T2(Lcom/tv91/s/c;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/tv91/u/g/a0;->t0:Lcom/tv91/x/h;

    new-instance v0, Lcom/tv91/x/b;

    iget-object v1, p0, Lcom/tv91/u/g/a0;->w0:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/tv91/x/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic V2(Lcom/tv91/s/c;Lcom/tv91/s/c;)V
    .locals 4

    .line 1
    iget-object p2, p0, Lcom/tv91/u/g/a0;->h0:Lcom/tv91/z/b;

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/String;

    iget-object v2, p0, Lcom/tv91/u/g/a0;->l0:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p2, v1}, Lcom/tv91/z/b;->z([Ljava/lang/String;)V

    .line 2
    iget-object p2, p0, Lcom/tv91/u/g/a0;->j0:Lcom/tv91/y/e;

    iget-object v1, p0, Lcom/tv91/u/g/a0;->m0:Ljava/lang/String;

    invoke-interface {p2, v1}, Lcom/tv91/y/e;->b(Ljava/lang/String;)V

    const/4 p2, 0x3

    new-array p2, p2, [Ljava/lang/Object;

    .line 3
    iget-object v1, p0, Lcom/tv91/u/g/a0;->m0:Ljava/lang/String;

    aput-object v1, p2, v3

    iget-object v1, p0, Lcom/tv91/u/g/a0;->j0:Lcom/tv91/y/e;

    invoke-interface {v1}, Lcom/tv91/y/e;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, p2, v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, p2, v1

    const-string v0, "%s/update.html?sid=%d&pid=%d"

    invoke-static {v0, p2}, Lcom/tv91/utils/g;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/tv91/u/g/a0;->w0:Ljava/lang/String;

    .line 4
    iget-object p2, p0, Lcom/tv91/u/g/a0;->s0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p2}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p2

    check-cast p2, Lcom/tv91/u/g/d0;

    invoke-virtual {p1}, Lcom/tv91/s/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/tv91/q/a/f;->g0(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic X2()V
    .locals 4

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    iget-object v1, p0, Lcom/tv91/u/g/a0;->v0:Lcom/tv91/model/Version;

    iget-object v1, v1, Lcom/tv91/model/Version;->updateUrl:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/tv91/u/g/a0;->j0:Lcom/tv91/y/e;

    invoke-interface {v1}, Lcom/tv91/y/e;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "%s?sid=%d&pid=%d"

    invoke-static {v1, v0}, Lcom/tv91/utils/g;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->O1()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/tv91/utils/c;->b(Landroid/content/Context;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/tv91/u/g/a0;->r2(Ljava/lang/String;Ljava/io/File;)V

    return-void
.end method

.method private synthetic Z2()V
    .locals 4

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    iget-object v1, p0, Lcom/tv91/u/g/a0;->v0:Lcom/tv91/model/Version;

    iget-object v1, v1, Lcom/tv91/model/Version;->downloadUrl:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/tv91/u/g/a0;->j0:Lcom/tv91/y/e;

    invoke-interface {v1}, Lcom/tv91/y/e;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "%s?sid=%d&pid=%d"

    invoke-static {v1, v0}, Lcom/tv91/utils/g;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/tv91/u/g/a0;->t0:Lcom/tv91/x/h;

    new-instance v2, Lcom/tv91/x/b;

    invoke-direct {v2, v0}, Lcom/tv91/x/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic b3()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/g/a0;->u0:Lcom/tv91/model/Url;

    iget-object v0, v0, Lcom/tv91/model/Url;->reportUrl:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/tv91/u/g/a0;->g3(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic d3()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/g/a0;->t0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/x/b;

    const-string v2, "https://direct.lc.chat/11932596/"

    invoke-direct {v1, v2}, Lcom/tv91/x/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private f3()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/g/a0;->s0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/g/d0;

    invoke-interface {v0}, Lcom/tv91/u/g/d0;->P0()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/g/a0;->t0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/u/a/o/l$a;

    invoke-direct {v1}, Lcom/tv91/u/a/o/l$a;-><init>()V

    invoke-virtual {v1}, Lcom/tv91/u/a/o/l$a;->t()Lcom/tv91/u/a/o/l$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->h(Lcom/tv91/x/g;)V

    return-void
.end method

.method public static synthetic t2(Lcom/tv91/u/g/a0;)V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/g/a0;->f3()V

    return-void
.end method

.method private synthetic u2(Lcom/tv91/model/Version;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/g/a0;->s0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/g/d0;

    iput-object p1, p0, Lcom/tv91/u/g/a0;->v0:Lcom/tv91/model/Version;

    iget-object p1, p1, Lcom/tv91/model/Version;->message:Ljava/lang/String;

    invoke-interface {v0, p1}, Lcom/tv91/u/g/d0;->U1(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic w2(Lcom/tv91/s/c;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/u/g/q;

    invoke-direct {v0, p0}, Lcom/tv91/u/g/q;-><init>(Lcom/tv91/u/g/a0;)V

    invoke-static {v0}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/g/r;

    invoke-direct {v1, p0}, Lcom/tv91/u/g/r;-><init>(Lcom/tv91/u/g/a0;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/q/a/g;->j(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    return-void
.end method

.method private synthetic y2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/g/a0;->s0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/g/d0;

    invoke-interface {v0}, Lcom/tv91/u/g/d0;->q()V

    return-void
.end method


# virtual methods
.method public synthetic B2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/g/a0;->A2()V

    return-void
.end method

.method public synthetic D2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/g/a0;->C2()V

    return-void
.end method

.method public synthetic F2(Ljava/io/File;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/g/a0;->E2(Ljava/io/File;)V

    return-void
.end method

.method public synthetic H2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/g/a0;->G2(Lcom/tv91/s/c;)V

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

    iput-object p1, p0, Lcom/tv91/u/g/a0;->t0:Lcom/tv91/x/h;

    return-void
.end method

.method public synthetic J2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/g/a0;->I2()V

    return-void
.end method

.method public synthetic L2(Lcom/tv91/model/Url;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/g/a0;->K2(Lcom/tv91/model/Url;)V

    return-void
.end method

.method public synthetic N2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/g/a0;->M2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic Q2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/g/a0;->P2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic S2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/g/a0;->R2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic U2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/g/a0;->T2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic W2(Lcom/tv91/s/c;Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/g/a0;->V2(Lcom/tv91/s/c;Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic Y2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/g/a0;->X2()V

    return-void
.end method

.method public synthetic a3()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/g/a0;->Z2()V

    return-void
.end method

.method public synthetic c3()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/g/a0;->b3()V

    return-void
.end method

.method public synthetic e3()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/g/a0;->d3()V

    return-void
.end method

.method public g1()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/g/a0;->s0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/g/d0;

    new-instance v1, Lcom/tv91/u/g/j;

    invoke-direct {v1, p0}, Lcom/tv91/u/g/j;-><init>(Lcom/tv91/u/g/a0;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/g/d0;->j2(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/g/a0;->s0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/g/d0;

    new-instance v1, Lcom/tv91/u/g/k;

    invoke-direct {v1, p0}, Lcom/tv91/u/g/k;-><init>(Lcom/tv91/u/g/a0;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/g/d0;->m(Ljava/lang/Runnable;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/g/a0;->s0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/g/d0;

    new-instance v1, Lcom/tv91/u/g/d;

    invoke-direct {v1, p0}, Lcom/tv91/u/g/d;-><init>(Lcom/tv91/u/g/a0;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/g/d0;->n0(Ljava/lang/Runnable;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/g/a0;->s0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/g/d0;

    new-instance v1, Lcom/tv91/u/g/c;

    invoke-direct {v1, p0}, Lcom/tv91/u/g/c;-><init>(Lcom/tv91/u/g/a0;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/g/d0;->j0(Ljava/lang/Runnable;)V

    .line 6
    iget-object v0, p0, Lcom/tv91/u/g/a0;->s0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/g/d0;

    new-instance v1, Lcom/tv91/u/g/t;

    invoke-direct {v1, p0}, Lcom/tv91/u/g/t;-><init>(Lcom/tv91/u/g/a0;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/g/d0;->I1(Ljava/lang/Runnable;)V

    .line 7
    iget-object v0, p0, Lcom/tv91/u/g/a0;->k0:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/tv91/u/g/a0;->s2(Ljava/lang/String;)V

    return-void
.end method

.method public g3(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/g/a0;->i0:Lcom/tv91/y/h;

    invoke-interface {v0}, Lcom/tv91/y/h;->e()Lcom/tv91/model/User;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tv91/u/g/a0;->i0:Lcom/tv91/y/h;

    invoke-interface {v0}, Lcom/tv91/y/h;->e()Lcom/tv91/model/User;

    move-result-object v0

    iget-object v0, v0, Lcom/tv91/model/User;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/tv91/u/g/a0;->q0:Lcom/tv91/u/g/f0/l;

    invoke-virtual {v1, p1, v0}, Lcom/tv91/u/g/f0/l;->o(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/g/a0;->n0:Lcom/tv91/u/g/f0/k;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/g/a0;->o0:Lcom/tv91/u/g/f0/i;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/g/a0;->p0:Lcom/tv91/u/g/f0/j;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/g/a0;->q0:Lcom/tv91/u/g/f0/l;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method public q2(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/g/a0;->o0:Lcom/tv91/u/g/f0/i;

    new-instance v1, Lcom/tv91/u/g/m;

    invoke-direct {v1, p0}, Lcom/tv91/u/g/m;-><init>(Lcom/tv91/u/g/a0;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/g/f0/i;->v(Ljava/lang/Runnable;)Lcom/tv91/u/g/f0/i;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/g/a;

    invoke-direct {v1, p0}, Lcom/tv91/u/g/a;-><init>(Lcom/tv91/u/g/a0;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/g/f0/i;->x(Lb/g/j/a;)Lcom/tv91/u/g/f0/i;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/g/d;

    invoke-direct {v1, p0}, Lcom/tv91/u/g/d;-><init>(Lcom/tv91/u/g/a0;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/g/f0/i;->w(Ljava/lang/Runnable;)Lcom/tv91/u/g/f0/i;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/g/p;

    invoke-direct {v1, p0}, Lcom/tv91/u/g/p;-><init>(Lcom/tv91/u/g/a0;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/g/f0/i;->u(Lb/g/j/a;)Lcom/tv91/u/g/f0/i;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/tv91/u/g/f0/i;->o(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public r2(Ljava/lang/String;Ljava/io/File;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/g/a0;->p0:Lcom/tv91/u/g/f0/j;

    new-instance v1, Lcom/tv91/u/g/e;

    invoke-direct {v1, p0}, Lcom/tv91/u/g/e;-><init>(Lcom/tv91/u/g/a0;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/g/f0/j;->w(Ljava/lang/Runnable;)Lcom/tv91/u/g/f0/j;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/g/o;

    invoke-direct {v1, p0}, Lcom/tv91/u/g/o;-><init>(Lcom/tv91/u/g/a0;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/g/f0/j;->v(Ljava/lang/Runnable;)Lcom/tv91/u/g/f0/j;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/g/i;

    invoke-direct {v1, p0}, Lcom/tv91/u/g/i;-><init>(Lcom/tv91/u/g/a0;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/g/f0/j;->x(Lb/g/j/a;)Lcom/tv91/u/g/f0/j;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/g/b;

    invoke-direct {v1, p0}, Lcom/tv91/u/g/b;-><init>(Lcom/tv91/u/g/a0;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/g/f0/j;->u(Lb/g/j/a;)Lcom/tv91/u/g/f0/j;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/tv91/u/g/f0/j;->o(Ljava/lang/String;Ljava/io/File;)V

    return-void
.end method

.method public s2(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/g/a0;->n0:Lcom/tv91/u/g/f0/k;

    new-instance v1, Lcom/tv91/u/g/g;

    invoke-direct {v1, p0}, Lcom/tv91/u/g/g;-><init>(Lcom/tv91/u/g/a0;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/g/f0/k;->w(Ljava/lang/Runnable;)Lcom/tv91/u/g/f0/k;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/g/s;

    invoke-direct {v1, p0}, Lcom/tv91/u/g/s;-><init>(Lcom/tv91/u/g/a0;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/g/f0/k;->x(Lb/g/j/a;)Lcom/tv91/u/g/f0/k;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/g/l;

    invoke-direct {v1, p0}, Lcom/tv91/u/g/l;-><init>(Lcom/tv91/u/g/a0;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/g/f0/k;->v(Lb/g/j/a;)Lcom/tv91/u/g/f0/k;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p1}, Lcom/tv91/u/g/f0/k;->p(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic v2(Lcom/tv91/model/Version;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/g/a0;->u2(Lcom/tv91/model/Version;)V

    return-void
.end method

.method public synthetic x2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/g/a0;->w2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic z2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/g/a0;->y2()V

    return-void
.end method
