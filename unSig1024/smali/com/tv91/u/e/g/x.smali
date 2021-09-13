.class public final Lcom/tv91/u/e/g/x;
.super Lcom/tv91/u/e/g/w;
.source "MemberPromotionFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/e/g/x$c;,
        Lcom/tv91/u/e/g/x$b;
    }
.end annotation


# instance fields
.field h0:Lcom/tv91/u/e/j/m;

.field i0:Lcom/tv91/u/e/j/k;

.field private final j0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/e/b;",
            ">;"
        }
    .end annotation
.end field

.field private k0:Lcom/tv91/x/h;

.field private l0:Lcom/tv91/model/Promotion;

.field private m0:I

.field private n0:I

.field private o0:Landroid/graphics/Bitmap;

.field private final p0:Landroidx/activity/result/c;
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

    const v0, 0x7f0d00b4

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/u/e/g/w;-><init>(I)V

    .line 2
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    sget-object v1, Lcom/tv91/u/e/g/e;->a:Lcom/tv91/u/e/g/e;

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/u/e/g/x;->j0:Lcom/tv91/features/shared/ViewSupplier;

    .line 3
    new-instance v0, Lcom/tv91/u/e/g/x$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/tv91/u/e/g/x$b;-><init>(Lcom/tv91/u/e/g/x$a;)V

    new-instance v1, Lcom/tv91/u/e/g/h;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/g/h;-><init>(Lcom/tv91/u/e/g/x;)V

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->J1(Landroidx/activity/result/f/a;Landroidx/activity/result/b;)Landroidx/activity/result/c;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/u/e/g/x;->p0:Landroidx/activity/result/c;

    return-void
.end method

.method private synthetic A2(Lcom/tv91/s/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/g/x;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/b;

    invoke-virtual {p1}, Lcom/tv91/s/c;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/tv91/u/e/g/b;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/g/b;-><init>(Lcom/tv91/u/e/g/x;)V

    invoke-interface {v0, p1, v1}, Lcom/tv91/u/e/b;->R1(Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic C2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/g/x;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/b;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/e/b;->a(Z)V

    return-void
.end method

.method private synthetic E2(Lcom/tv91/model/Promotion;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/g/x;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/b;

    iput-object p1, p0, Lcom/tv91/u/e/g/x;->l0:Lcom/tv91/model/Promotion;

    invoke-interface {v0, p1}, Lcom/tv91/u/e/b;->i2(Lcom/tv91/model/Promotion;)V

    .line 2
    iget-object p1, p1, Lcom/tv91/model/Promotion;->url:Ljava/lang/String;

    iget v0, p0, Lcom/tv91/u/e/g/x;->m0:I

    iget v1, p0, Lcom/tv91/u/e/g/x;->n0:I

    invoke-virtual {p0, p1, v0, v1}, Lcom/tv91/u/e/g/x;->q2(Ljava/lang/String;II)V

    return-void
.end method

.method private synthetic G2(Lcom/tv91/s/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/g/x;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/e/b;->a(Z)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/tv91/u/e/g/x;->r2(Lcom/tv91/s/c;)V

    return-void
.end method

.method static synthetic I2(Landroid/view/View;)Lcom/tv91/u/e/b;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/e/g/a0;

    invoke-static {p0}, Lcom/tv91/r/q0;->b(Landroid/view/View;)Lcom/tv91/r/q0;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/tv91/u/e/g/a0;-><init>(Lcom/tv91/r/q0;)V

    return-object v0
.end method

.method private synthetic J2(Landroid/net/Uri;)V
    .locals 3

    if-eqz p1, :cond_1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->M1()Landroidx/fragment/app/e;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    :try_start_1
    iget-object v0, p0, Lcom/tv91/u/e/g/x;->o0:Landroid/graphics/Bitmap;

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x64

    invoke-virtual {v0, v1, v2, p1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_1

    .line 3
    :try_start_2
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catchall_0
    move-exception v0

    .line 4
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v1

    if-eqz p1, :cond_0

    .line 5
    :try_start_4
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception p1

    :try_start_5
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    throw v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    move-exception p1

    .line 6
    invoke-static {p1}, Lh/a/a;->c(Ljava/lang/Throwable;)V

    .line 7
    iget-object v0, p0, Lcom/tv91/u/e/g/x;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/b;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/q/a/f;->g0(Ljava/lang/String;)V

    :cond_1
    :goto_1
    return-void
.end method

.method private synthetic L2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/g/x;->k0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic N2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/g/x;->k0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/features/authentication/r/w$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/r/w$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->h(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic P2(Lcom/tv91/u/e/a;)V
    .locals 1

    .line 1
    iget v0, p1, Lcom/tv91/u/e/a;->a:I

    iput v0, p0, Lcom/tv91/u/e/g/x;->m0:I

    .line 2
    iget p1, p1, Lcom/tv91/u/e/a;->b:I

    iput p1, p0, Lcom/tv91/u/e/g/x;->n0:I

    .line 3
    iget-object p1, p0, Lcom/tv91/u/e/g/x;->l0:Lcom/tv91/model/Promotion;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/tv91/u/e/g/x;->o0:Landroid/graphics/Bitmap;

    if-nez p1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/tv91/u/e/g/x;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p1}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/e/b;

    iget-object v0, p0, Lcom/tv91/u/e/g/x;->l0:Lcom/tv91/model/Promotion;

    invoke-interface {p1, v0}, Lcom/tv91/u/e/b;->i2(Lcom/tv91/model/Promotion;)V

    .line 5
    iget-object p1, p0, Lcom/tv91/u/e/g/x;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p1}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/e/b;

    iget-object v0, p0, Lcom/tv91/u/e/g/x;->o0:Landroid/graphics/Bitmap;

    invoke-interface {p1, v0}, Lcom/tv91/u/e/b;->G0(Landroid/graphics/Bitmap;)V

    goto :goto_1

    .line 6
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/tv91/u/e/g/x;->Z2()V

    :goto_1
    return-void
.end method

.method private synthetic R2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/g/x;->k0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    return-void
.end method

.method private synthetic T2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/g/x;->k0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/u/e/i/p$a;

    invoke-direct {v1}, Lcom/tv91/u/e/i/p$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic V2()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/g/x;->p0:Landroidx/activity/result/c;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const v2, 0x7f120031

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->i0(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "%s_qrcode.jpg"

    invoke-static {v2, v1}, Lcom/tv91/utils/g;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/activity/result/c;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic X2(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->O1()Landroid/content/Context;

    move-result-object v0

    const-class v1, Landroid/content/ClipboardManager;

    invoke-static {v0, v1}, Landroidx/core/content/a;->g(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    .line 2
    iget-object v1, p0, Lcom/tv91/u/e/g/x;->l0:Lcom/tv91/model/Promotion;

    iget-object v1, v1, Lcom/tv91/model/Promotion;->url:Ljava/lang/String;

    invoke-static {p1, v1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/u/e/g/x;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p1}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/e/b;

    invoke-interface {p1}, Lcom/tv91/u/e/b;->e1()V

    return-void
.end method

.method private synthetic s2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/g/x;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/e/b;->a(Z)V

    return-void
.end method

.method private synthetic u2(IILc/a/c/j/b;)V
    .locals 5

    .line 1
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, p2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/u/e/g/x;->o0:Landroid/graphics/Bitmap;

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_2

    const/4 v2, 0x0

    :goto_1
    if-ge v2, p2, :cond_1

    .line 2
    iget-object v3, p0, Lcom/tv91/u/e/g/x;->o0:Landroid/graphics/Bitmap;

    invoke-virtual {p3, v1, v2}, Lc/a/c/j/b;->d(II)Z

    move-result v4

    if-eqz v4, :cond_0

    const/high16 v4, -0x1000000

    goto :goto_2

    :cond_0
    const/4 v4, -0x1

    :goto_2
    invoke-virtual {v3, v1, v2, v4}, Landroid/graphics/Bitmap;->setPixel(III)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 3
    :cond_2
    iget-object p1, p0, Lcom/tv91/u/e/g/x;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p1}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/e/b;

    iget-object p2, p0, Lcom/tv91/u/e/g/x;->o0:Landroid/graphics/Bitmap;

    invoke-interface {p1, p2}, Lcom/tv91/u/e/b;->G0(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method private synthetic w2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/g/x;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/b;

    invoke-virtual {p1}, Lcom/tv91/s/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/q/a/f;->g0(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic y2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->M1()Landroidx/fragment/app/e;

    move-result-object p1

    new-instance v0, Lcom/tv91/u/e/g/k;

    invoke-direct {v0, p0}, Lcom/tv91/u/e/g/k;-><init>(Lcom/tv91/u/e/g/x;)V

    invoke-static {p1, v0}, Lcom/tv91/features/shared/widget/e;->b(Landroid/content/Context;Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public synthetic B2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/e/g/x;->A2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic D2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/e/g/x;->C2()V

    return-void
.end method

.method public synthetic F2(Lcom/tv91/model/Promotion;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/e/g/x;->E2(Lcom/tv91/model/Promotion;)V

    return-void
.end method

.method public synthetic H2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/e/g/x;->G2(Lcom/tv91/s/c;)V

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

    iput-object p1, p0, Lcom/tv91/u/e/g/x;->k0:Lcom/tv91/x/h;

    return-void
.end method

.method public synthetic K2(Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/e/g/x;->J2(Landroid/net/Uri;)V

    return-void
.end method

.method public synthetic M2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/e/g/x;->L2()V

    return-void
.end method

.method public synthetic O2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/e/g/x;->N2()V

    return-void
.end method

.method public synthetic Q2(Lcom/tv91/u/e/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/e/g/x;->P2(Lcom/tv91/u/e/a;)V

    return-void
.end method

.method public synthetic S2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/e/g/x;->R2()V

    return-void
.end method

.method public synthetic U2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/e/g/x;->T2()V

    return-void
.end method

.method public synthetic W2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/e/g/x;->V2()V

    return-void
.end method

.method public synthetic Y2(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/e/g/x;->X2(Ljava/lang/String;)V

    return-void
.end method

.method public Z2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/g/x;->h0:Lcom/tv91/u/e/j/m;

    new-instance v1, Lcom/tv91/u/e/g/g;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/g/g;-><init>(Lcom/tv91/u/e/g/x;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/e/j/m;->v(Ljava/lang/Runnable;)Lcom/tv91/u/e/j/m;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/e/g/j;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/g/j;-><init>(Lcom/tv91/u/e/g/x;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/e/j/m;->w(Lb/g/j/a;)Lcom/tv91/u/e/j/m;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/e/g/q;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/g/q;-><init>(Lcom/tv91/u/e/g/x;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/e/j/m;->u(Lb/g/j/a;)Lcom/tv91/u/e/j/m;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/tv91/u/e/j/m;->o()V

    return-void
.end method

.method public g1()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/e/g/x;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/b;

    new-instance v1, Lcom/tv91/u/e/g/m;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/g/m;-><init>(Lcom/tv91/u/e/g/x;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/e/b;->V0(Lb/g/j/a;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/e/g/x;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/b;

    new-instance v1, Lcom/tv91/u/e/g/i;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/g/i;-><init>(Lcom/tv91/u/e/g/x;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/e/b;->b(Ljava/lang/Runnable;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/e/g/x;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/b;

    new-instance v1, Lcom/tv91/u/e/g/d;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/g/d;-><init>(Lcom/tv91/u/e/g/x;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/e/b;->V1(Ljava/lang/Runnable;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/e/g/x;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/b;

    new-instance v1, Lcom/tv91/u/e/g/l;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/g/l;-><init>(Lcom/tv91/u/e/g/x;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/e/b;->X1(Ljava/lang/Runnable;)V

    .line 6
    iget-object v0, p0, Lcom/tv91/u/e/g/x;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/b;

    new-instance v1, Lcom/tv91/u/e/g/o;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/g/o;-><init>(Lcom/tv91/u/e/g/x;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/e/b;->F(Lb/g/j/a;)V

    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/e/g/x;->h0:Lcom/tv91/u/e/j/m;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/e/g/x;->i0:Lcom/tv91/u/e/j/k;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method public q2(Ljava/lang/String;II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/g/x;->i0:Lcom/tv91/u/e/j/k;

    new-instance v1, Lcom/tv91/u/e/g/c;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/g/c;-><init>(Lcom/tv91/u/e/g/x;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/e/j/k;->v(Ljava/lang/Runnable;)Lcom/tv91/u/e/j/k;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/e/g/r;

    invoke-direct {v1, p0, p2, p3}, Lcom/tv91/u/e/g/r;-><init>(Lcom/tv91/u/e/g/x;II)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/e/j/k;->w(Lb/g/j/a;)Lcom/tv91/u/e/j/k;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/e/g/a;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/g/a;-><init>(Lcom/tv91/u/e/g/x;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/e/j/k;->u(Lb/g/j/a;)Lcom/tv91/u/e/j/k;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p1, p2, p3}, Lcom/tv91/u/e/j/k;->o(Ljava/lang/String;II)V

    return-void
.end method

.method public r2(Lcom/tv91/s/c;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/u/e/g/n;

    invoke-direct {v0, p0}, Lcom/tv91/u/e/g/n;-><init>(Lcom/tv91/u/e/g/x;)V

    invoke-static {v0}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/e/g/p;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/g/p;-><init>(Lcom/tv91/u/e/g/x;)V

    const-string v2, "0000001"

    .line 2
    invoke-virtual {v0, v2, v1}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/e/g/f;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/g/f;-><init>(Lcom/tv91/u/e/g/x;)V

    const-string v2, "A000084"

    .line 3
    invoke-virtual {v0, v2, v1}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic t2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/e/g/x;->s2()V

    return-void
.end method

.method public synthetic v2(IILc/a/c/j/b;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/tv91/u/e/g/x;->u2(IILc/a/c/j/b;)V

    return-void
.end method

.method public synthetic x2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/e/g/x;->w2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic z2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/e/g/x;->y2(Lcom/tv91/s/c;)V

    return-void
.end method
