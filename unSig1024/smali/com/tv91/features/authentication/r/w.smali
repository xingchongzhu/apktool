.class public final Lcom/tv91/features/authentication/r/w;
.super Lcom/tv91/features/authentication/r/v;
.source "VerifyFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/features/authentication/r/w$a;
    }
.end annotation


# instance fields
.field h0:Lcom/tv91/features/authentication/q/f0;

.field i0:Lcom/tv91/features/authentication/q/g0;

.field private final j0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/features/authentication/l;",
            ">;"
        }
    .end annotation
.end field

.field private k0:Lcom/tv91/x/h;


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f0d00bb

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/features/authentication/r/v;-><init>(I)V

    .line 2
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    sget-object v1, Lcom/tv91/features/authentication/r/l;->a:Lcom/tv91/features/authentication/r/l;

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/features/authentication/r/w;->j0:Lcom/tv91/features/shared/ViewSupplier;

    return-void
.end method

.method private synthetic A2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/r/w;->k0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic C2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/r/w;->k0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    return-void
.end method

.method private synthetic E2(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tv91/features/authentication/r/w;->Q2(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic G2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/r/w;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/l;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/features/authentication/l;->t1(Z)V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/r/w;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/l;

    invoke-interface {v0}, Lcom/tv91/features/authentication/l;->j()V

    return-void
.end method

.method private synthetic I2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/r/w;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/l;

    invoke-interface {v0}, Lcom/tv91/features/authentication/l;->l()V

    return-void
.end method

.method private synthetic K2(Lcom/tv91/s/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/r/w;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/l;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/features/authentication/l;->t1(Z)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/tv91/features/authentication/r/w;->q2(Lcom/tv91/s/c;)V

    return-void
.end method

.method private synthetic M2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/r/w;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/l;

    invoke-interface {v0}, Lcom/tv91/features/authentication/l;->j()V

    return-void
.end method

.method private synthetic O2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/r/w;->k0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    return-void
.end method

.method private synthetic r2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->M1()Landroidx/fragment/app/e;

    move-result-object p1

    new-instance v0, Lcom/tv91/features/authentication/r/h;

    invoke-direct {v0, p0}, Lcom/tv91/features/authentication/r/h;-><init>(Lcom/tv91/features/authentication/r/w;)V

    invoke-static {p1, v0}, Lcom/tv91/features/shared/widget/e;->b(Landroid/content/Context;Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic t2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/r/w;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/l;

    invoke-virtual {p1}, Lcom/tv91/s/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/features/authentication/l;->k(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic v2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/r/w;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/l;

    invoke-virtual {p1}, Lcom/tv91/s/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/q/a/f;->g0(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic x2(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/r/w;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/l;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->i0(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/features/authentication/l;->g(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic z2(Landroid/view/View;)Lcom/tv91/features/authentication/l;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/features/authentication/r/z;

    invoke-static {p0}, Lcom/tv91/r/x0;->b(Landroid/view/View;)Lcom/tv91/r/x0;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/tv91/features/authentication/r/z;-><init>(Lcom/tv91/r/x0;)V

    return-object v0
.end method


# virtual methods
.method public synthetic B2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/r/w;->A2()V

    return-void
.end method

.method public synthetic D2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/r/w;->C2()V

    return-void
.end method

.method public synthetic F2(Ljava/lang/CharSequence;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/r/w;->E2(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public synthetic H2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/r/w;->G2()V

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

    iput-object p1, p0, Lcom/tv91/features/authentication/r/w;->k0:Lcom/tv91/x/h;

    return-void
.end method

.method public synthetic J2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/r/w;->I2()V

    return-void
.end method

.method public synthetic L2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/r/w;->K2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic N2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/r/w;->M2()V

    return-void
.end method

.method public synthetic P2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/r/w;->O2()V

    return-void
.end method

.method public Q2(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/r/w;->h0:Lcom/tv91/features/authentication/q/f0;

    new-instance v1, Lcom/tv91/features/authentication/r/f;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/r/f;-><init>(Lcom/tv91/features/authentication/r/w;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/f0;->v(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/f0;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/r/k;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/r/k;-><init>(Lcom/tv91/features/authentication/r/w;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/f0;->w(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/f0;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/r/e;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/r/e;-><init>(Lcom/tv91/features/authentication/r/w;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/f0;->u(Lb/g/j/a;)Lcom/tv91/features/authentication/q/f0;

    move-result-object v0

    sget-object v1, Lcom/tv91/features/authentication/q/f0$a;->b:Lcom/tv91/features/authentication/q/f0$a;

    .line 5
    invoke-virtual {v0, v1, p1}, Lcom/tv91/features/authentication/q/f0;->o(Lcom/tv91/features/authentication/q/f0$a;Ljava/lang/String;)V

    return-void
.end method

.method public R2(Lcom/tv91/features/authentication/k;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/r/w;->i0:Lcom/tv91/features/authentication/q/g0;

    new-instance v1, Lcom/tv91/features/authentication/r/b;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/r/b;-><init>(Lcom/tv91/features/authentication/r/w;)V

    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/g0;->v(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/g0;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/r/i;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/r/i;-><init>(Lcom/tv91/features/authentication/r/w;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/g0;->w(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/g0;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/r/u;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/r/u;-><init>(Lcom/tv91/features/authentication/r/w;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/g0;->u(Lb/g/j/a;)Lcom/tv91/features/authentication/q/g0;

    move-result-object v0

    iget-object v1, p1, Lcom/tv91/features/authentication/k;->a:Ljava/lang/String;

    iget-object p1, p1, Lcom/tv91/features/authentication/k;->b:Ljava/lang/String;

    .line 4
    invoke-virtual {v0, v1, p1}, Lcom/tv91/features/authentication/q/g0;->o(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public g1()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/r/w;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/l;

    new-instance v1, Lcom/tv91/features/authentication/r/c;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/r/c;-><init>(Lcom/tv91/features/authentication/r/w;)V

    invoke-interface {v0, v1}, Lcom/tv91/features/authentication/l;->b(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/r/w;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/l;

    new-instance v1, Lcom/tv91/features/authentication/r/d;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/r/d;-><init>(Lcom/tv91/features/authentication/r/w;)V

    invoke-interface {v0, v1}, Lcom/tv91/features/authentication/l;->f(Lb/g/j/a;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/features/authentication/r/w;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/l;

    new-instance v1, Lcom/tv91/features/authentication/r/a;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/r/a;-><init>(Lcom/tv91/features/authentication/r/w;)V

    invoke-interface {v0, v1}, Lcom/tv91/features/authentication/l;->b1(Lb/g/j/a;)V

    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/r/w;->h0:Lcom/tv91/features/authentication/q/f0;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/r/w;->i0:Lcom/tv91/features/authentication/q/g0;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method public q2(Lcom/tv91/s/c;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/features/authentication/r/n;

    invoke-direct {v0, p0}, Lcom/tv91/features/authentication/r/n;-><init>(Lcom/tv91/features/authentication/r/w;)V

    invoke-static {v0}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/r/j;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/r/j;-><init>(Lcom/tv91/features/authentication/r/w;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/q/a/g;->e(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/r/m;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/r/m;-><init>(Lcom/tv91/features/authentication/r/w;)V

    const-string v2, "0000001"

    .line 3
    invoke-virtual {v0, v2, v1}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/r/g;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/r/g;-><init>(Lcom/tv91/features/authentication/r/w;)V

    const-string v2, "A000073"

    .line 4
    invoke-virtual {v0, v2, v1}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic s2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/r/w;->r2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic u2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/r/w;->t2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic w2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/r/w;->v2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic y2(Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/r/w;->x2(Ljava/lang/Integer;)V

    return-void
.end method
