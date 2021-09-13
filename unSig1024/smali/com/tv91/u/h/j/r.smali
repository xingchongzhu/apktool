.class public final Lcom/tv91/u/h/j/r;
.super Lcom/tv91/u/h/j/q;
.source "PurchaseFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/h/j/r$a;
    }
.end annotation


# instance fields
.field h0:Lcom/tv91/y/h;

.field i0:Lcom/tv91/u/h/k/q;

.field j0:Lcom/tv91/u/h/k/r;

.field private final k0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/h/g;",
            ">;"
        }
    .end annotation
.end field

.field private l0:Lcom/tv91/x/h;

.field private m0:Lcom/tv91/model/User;


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f0d00b7

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/u/h/j/q;-><init>(I)V

    .line 2
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    sget-object v1, Lcom/tv91/u/h/j/k;->a:Lcom/tv91/u/h/j/k;

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/u/h/j/r;->k0:Lcom/tv91/features/shared/ViewSupplier;

    return-void
.end method

.method private synthetic B2(Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/model/PurchasePackage;

    .line 3
    iget-object v1, v1, Lcom/tv91/model/PurchasePackage;->type:Lcom/tv91/model/PurchaseType;

    sget-object v2, Lcom/tv91/model/PurchaseType;->a:Lcom/tv91/model/PurchaseType;

    if-ne v1, v2, :cond_0

    .line 4
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/tv91/u/h/j/r;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/g;

    invoke-interface {v0, p1}, Lcom/tv91/u/h/g;->c2(Ljava/util/List;)V

    return-void
.end method

.method static synthetic D2(Landroid/view/View;)Lcom/tv91/u/h/g;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/h/j/u;

    invoke-static {p0}, Lcom/tv91/r/t0;->b(Landroid/view/View;)Lcom/tv91/r/t0;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/tv91/u/h/j/u;-><init>(Lcom/tv91/r/t0;)V

    return-object v0
.end method

.method private synthetic E2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/j/r;->l0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic G2(Lcom/tv91/model/PurchasePackage;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tv91/u/h/j/r;->V2(Lcom/tv91/model/PurchasePackage;)V

    return-void
.end method

.method private synthetic I2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/j/r;->l0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    return-void
.end method

.method private synthetic K2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/j/r;->l0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    return-void
.end method

.method private synthetic M2(Lcom/tv91/model/PurchasePackage;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/j/r;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/g;

    iget v1, p1, Lcom/tv91/model/PurchasePackage;->point:I

    new-instance v2, Lcom/tv91/u/h/j/a;

    invoke-direct {v2, p0, p1}, Lcom/tv91/u/h/j/a;-><init>(Lcom/tv91/u/h/j/r;Lcom/tv91/model/PurchasePackage;)V

    invoke-interface {v0, v1, v2}, Lcom/tv91/u/h/g;->m1(ILjava/lang/Runnable;)V

    return-void
.end method

.method private synthetic O2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/j/r;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/g;

    iget-object v1, p0, Lcom/tv91/u/h/j/r;->m0:Lcom/tv91/model/User;

    iget v1, v1, Lcom/tv91/model/User;->point:I

    invoke-interface {v0, v1}, Lcom/tv91/u/h/g;->F0(I)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/h/j/r;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/g;

    new-instance v1, Lcom/tv91/u/h/j/m;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/j/m;-><init>(Lcom/tv91/u/h/j/r;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/h/g;->K1(Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic Q2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/j/r;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/g;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/h/g;->a(Z)V

    return-void
.end method

.method private synthetic S2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/j/r;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/g;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/h/g;->a(Z)V

    return-void
.end method

.method private synthetic r2(Lcom/tv91/s/c;Lcom/tv91/s/c;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/tv91/u/h/j/r;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p2}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p2

    check-cast p2, Lcom/tv91/u/h/g;

    invoke-virtual {p1}, Lcom/tv91/s/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/tv91/q/a/f;->g0(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic t2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->M1()Landroidx/fragment/app/e;

    move-result-object p1

    new-instance v0, Lcom/tv91/u/h/j/e;

    invoke-direct {v0, p0}, Lcom/tv91/u/h/j/e;-><init>(Lcom/tv91/u/h/j/r;)V

    invoke-static {p1, v0}, Lcom/tv91/features/shared/widget/e;->b(Landroid/content/Context;Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic v2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/j/r;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/g;

    invoke-virtual {p1}, Lcom/tv91/s/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/u/h/g;->S1(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic x2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/j/r;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/g;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/h/g;->a(Z)V

    return-void
.end method

.method private synthetic z2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/j/r;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/g;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/h/g;->a(Z)V

    return-void
.end method


# virtual methods
.method public synthetic A2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/h/j/r;->z2()V

    return-void
.end method

.method public synthetic C2(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/h/j/r;->B2(Ljava/util/List;)V

    return-void
.end method

.method public synthetic F2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/h/j/r;->E2()V

    return-void
.end method

.method public synthetic H2(Lcom/tv91/model/PurchasePackage;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/h/j/r;->G2(Lcom/tv91/model/PurchasePackage;)V

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

    iput-object p1, p0, Lcom/tv91/u/h/j/r;->l0:Lcom/tv91/x/h;

    .line 4
    iget-object p1, p0, Lcom/tv91/u/h/j/r;->h0:Lcom/tv91/y/h;

    invoke-interface {p1}, Lcom/tv91/y/h;->e()Lcom/tv91/model/User;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/h/j/r;->m0:Lcom/tv91/model/User;

    return-void
.end method

.method public synthetic J2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/h/j/r;->I2()V

    return-void
.end method

.method public synthetic L2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/h/j/r;->K2()V

    return-void
.end method

.method public synthetic N2(Lcom/tv91/model/PurchasePackage;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/h/j/r;->M2(Lcom/tv91/model/PurchasePackage;)V

    return-void
.end method

.method public synthetic P2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/h/j/r;->O2()V

    return-void
.end method

.method public synthetic R2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/h/j/r;->Q2()V

    return-void
.end method

.method public synthetic T2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/h/j/r;->S2()V

    return-void
.end method

.method public U2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/j/r;->i0:Lcom/tv91/u/h/k/q;

    new-instance v1, Lcom/tv91/u/h/j/j;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/j/j;-><init>(Lcom/tv91/u/h/j/r;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/q;->w(Ljava/lang/Runnable;)Lcom/tv91/u/h/k/q;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/j/b;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/j/b;-><init>(Lcom/tv91/u/h/j/r;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/q;->v(Ljava/lang/Runnable;)Lcom/tv91/u/h/k/q;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/j/c;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/j/c;-><init>(Lcom/tv91/u/h/j/r;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/q;->x(Lb/g/j/a;)Lcom/tv91/u/h/k/q;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/j/p;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/j/p;-><init>(Lcom/tv91/u/h/j/r;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/q;->u(Lb/g/j/a;)Lcom/tv91/u/h/k/q;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/tv91/u/h/k/q;->o()V

    return-void
.end method

.method public V2(Lcom/tv91/model/PurchasePackage;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/j/r;->j0:Lcom/tv91/u/h/k/r;

    new-instance v1, Lcom/tv91/u/h/j/l;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/j/l;-><init>(Lcom/tv91/u/h/j/r;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/r;->w(Ljava/lang/Runnable;)Lcom/tv91/u/h/k/r;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/j/d;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/j/d;-><init>(Lcom/tv91/u/h/j/r;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/r;->v(Ljava/lang/Runnable;)Lcom/tv91/u/h/k/r;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/j/h;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/j/h;-><init>(Lcom/tv91/u/h/j/r;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/r;->x(Ljava/lang/Runnable;)Lcom/tv91/u/h/k/r;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/j/p;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/j/p;-><init>(Lcom/tv91/u/h/j/r;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/r;->u(Lb/g/j/a;)Lcom/tv91/u/h/k/r;

    move-result-object v0

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1, p1}, Lcom/tv91/u/h/k/r;->o(Lcom/tv91/model/Movie;Lcom/tv91/model/PurchasePackage;)V

    return-void
.end method

.method public g1()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/h/j/r;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/g;

    new-instance v1, Lcom/tv91/u/h/j/i;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/j/i;-><init>(Lcom/tv91/u/h/j/r;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/h/g;->b(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/h/j/r;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/g;

    new-instance v1, Lcom/tv91/u/h/j/o;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/j/o;-><init>(Lcom/tv91/u/h/j/r;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/h/g;->M0(Lb/g/j/a;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/h/j/r;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/g;

    iget-object v1, p0, Lcom/tv91/u/h/j/r;->m0:Lcom/tv91/model/User;

    iget v1, v1, Lcom/tv91/model/User;->point:I

    invoke-interface {v0, v1}, Lcom/tv91/u/h/g;->F0(I)V

    .line 5
    invoke-virtual {p0}, Lcom/tv91/u/h/j/r;->U2()V

    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/h/j/r;->i0:Lcom/tv91/u/h/k/q;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/h/j/r;->j0:Lcom/tv91/u/h/k/r;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method public q2(Lcom/tv91/s/c;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/u/h/j/g;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/h/j/g;-><init>(Lcom/tv91/u/h/j/r;Lcom/tv91/s/c;)V

    invoke-static {v0}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/j/n;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/j/n;-><init>(Lcom/tv91/u/h/j/r;)V

    const-string v2, "0000001"

    .line 2
    invoke-virtual {v0, v2, v1}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/j/f;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/j/f;-><init>(Lcom/tv91/u/h/j/r;)V

    const-string v2, "C000013"

    .line 3
    invoke-virtual {v0, v2, v1}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic s2(Lcom/tv91/s/c;Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/h/j/r;->r2(Lcom/tv91/s/c;Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic u2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/h/j/r;->t2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic w2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/h/j/r;->v2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic y2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/h/j/r;->x2()V

    return-void
.end method
