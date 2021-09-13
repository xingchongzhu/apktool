.class public final Lcom/tv91/u/e/k/o;
.super Lcom/tv91/u/e/k/n;
.source "PromotionWithdrawFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/e/k/o$a;
    }
.end annotation


# instance fields
.field h0:Lcom/tv91/u/e/j/o;

.field private final i0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/e/f;",
            ">;"
        }
    .end annotation
.end field

.field private j0:Lcom/tv91/x/h;

.field private k0:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f0d00b6

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/u/e/k/n;-><init>(I)V

    .line 2
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    sget-object v1, Lcom/tv91/u/e/k/i;->a:Lcom/tv91/u/e/k/i;

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/u/e/k/o;->i0:Lcom/tv91/features/shared/ViewSupplier;

    return-void
.end method

.method private synthetic A2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/k/o;->j0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic C2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/k/o;->j0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    return-void
.end method

.method private synthetic E2(Lcom/tv91/u/e/e;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/tv91/u/e/k/o;->k0:I

    invoke-virtual {p0, v0, p1}, Lcom/tv91/u/e/k/o;->M2(ILcom/tv91/u/e/e;)V

    return-void
.end method

.method private synthetic G2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/k/o;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/f;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/e/f;->a(Z)V

    return-void
.end method

.method private synthetic I2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/k/o;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/f;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/e/f;->a(Z)V

    return-void
.end method

.method private synthetic K2(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/k/o;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/f;

    new-instance v1, Lcom/tv91/u/e/k/a;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/k/a;-><init>(Lcom/tv91/u/e/k/o;)V

    invoke-interface {v0, p1, v1}, Lcom/tv91/u/e/f;->T1(Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic r2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->M1()Landroidx/fragment/app/e;

    move-result-object p1

    new-instance v0, Lcom/tv91/u/e/k/j;

    invoke-direct {v0, p0}, Lcom/tv91/u/e/k/j;-><init>(Lcom/tv91/u/e/k/o;)V

    invoke-static {p1, v0}, Lcom/tv91/features/shared/widget/e;->b(Landroid/content/Context;Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic t2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/k/o;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/f;

    invoke-virtual {p1}, Lcom/tv91/s/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/q/a/f;->g0(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic v2(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tv91/u/e/k/o;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p1}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/e/f;

    invoke-interface {p1}, Lcom/tv91/u/e/f;->R()V

    return-void
.end method

.method static synthetic x2(Landroid/view/View;)Lcom/tv91/u/e/f;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/e/k/r;

    invoke-static {p0}, Lcom/tv91/r/s0;->b(Landroid/view/View;)Lcom/tv91/r/s0;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/tv91/u/e/k/r;-><init>(Lcom/tv91/r/s0;)V

    return-object v0
.end method

.method private synthetic y2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/k/o;->j0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    return-void
.end method


# virtual methods
.method public synthetic B2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/e/k/o;->A2()V

    return-void
.end method

.method public synthetic D2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/e/k/o;->C2()V

    return-void
.end method

.method public synthetic F2(Lcom/tv91/u/e/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/e/k/o;->E2(Lcom/tv91/u/e/e;)V

    return-void
.end method

.method public synthetic H2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/e/k/o;->G2()V

    return-void
.end method

.method public J0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->J0(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Lcom/tv91/x/f;->l2()Lcom/tv91/x/c;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/e/k/o$a;

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroidx/lifecycle/f;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/shared/UmengObserver;

    invoke-virtual {p1}, Lcom/tv91/x/c;->m()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/tv91/features/shared/UmengObserver;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/h;)V

    .line 4
    invoke-static {p0}, Lcom/tv91/x/h;->b(Landroidx/fragment/app/Fragment;)Lcom/tv91/x/h;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/u/e/k/o;->j0:Lcom/tv91/x/h;

    .line 5
    iget p1, p1, Lcom/tv91/u/e/k/o$a;->b:I

    iput p1, p0, Lcom/tv91/u/e/k/o;->k0:I

    return-void
.end method

.method public synthetic J2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/e/k/o;->I2()V

    return-void
.end method

.method public synthetic L2(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/e/k/o;->K2(Ljava/lang/String;)V

    return-void
.end method

.method public M2(ILcom/tv91/u/e/e;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/k/o;->h0:Lcom/tv91/u/e/j/o;

    new-instance v1, Lcom/tv91/u/e/k/g;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/k/g;-><init>(Lcom/tv91/u/e/k/o;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/e/j/o;->w(Ljava/lang/Runnable;)Lcom/tv91/u/e/j/o;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/e/k/h;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/k/h;-><init>(Lcom/tv91/u/e/k/o;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/e/j/o;->v(Ljava/lang/Runnable;)Lcom/tv91/u/e/j/o;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/e/k/d;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/k/d;-><init>(Lcom/tv91/u/e/k/o;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/e/j/o;->x(Lb/g/j/a;)Lcom/tv91/u/e/j/o;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/e/k/m;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/k/m;-><init>(Lcom/tv91/u/e/k/o;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/e/j/o;->u(Lb/g/j/a;)Lcom/tv91/u/e/j/o;

    move-result-object v2

    iget-object v4, p2, Lcom/tv91/u/e/e;->a:Ljava/lang/String;

    iget-object v5, p2, Lcom/tv91/u/e/e;->b:Ljava/lang/String;

    iget-object v6, p2, Lcom/tv91/u/e/e;->c:Ljava/lang/String;

    iget-object v7, p2, Lcom/tv91/u/e/e;->d:Ljava/lang/String;

    iget-object v8, p2, Lcom/tv91/u/e/e;->e:Ljava/lang/String;

    iget-object v9, p2, Lcom/tv91/u/e/e;->f:Ljava/lang/String;

    iget-object v10, p2, Lcom/tv91/u/e/e;->g:Ljava/lang/String;

    move v3, p1

    .line 5
    invoke-virtual/range {v2 .. v10}, Lcom/tv91/u/e/j/o;->o(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public g1()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/e/k/o;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/f;

    new-instance v1, Lcom/tv91/u/e/k/k;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/k/k;-><init>(Lcom/tv91/u/e/k/o;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/e/f;->b(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/e/k/o;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/f;

    new-instance v1, Lcom/tv91/u/e/k/c;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/k/c;-><init>(Lcom/tv91/u/e/k/o;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/e/f;->H0(Lb/g/j/a;)V

    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/e/k/o;->h0:Lcom/tv91/u/e/j/o;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method public q2(Lcom/tv91/s/c;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/u/e/k/e;

    invoke-direct {v0, p0}, Lcom/tv91/u/e/k/e;-><init>(Lcom/tv91/u/e/k/o;)V

    invoke-static {v0}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/e/k/f;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/k/f;-><init>(Lcom/tv91/u/e/k/o;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/q/a/g;->e(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/e/k/b;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/k/b;-><init>(Lcom/tv91/u/e/k/o;)V

    const-string v2, "0000001"

    .line 3
    invoke-virtual {v0, v2, v1}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic s2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/e/k/o;->r2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic u2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/e/k/o;->t2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic w2(Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/e/k/o;->v2(Ljava/lang/Integer;)V

    return-void
.end method

.method public synthetic z2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/e/k/o;->y2()V

    return-void
.end method
