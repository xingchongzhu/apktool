.class public final Lcom/tv91/u/h/i/y;
.super Lcom/tv91/u/h/i/x;
.source "PaymentFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/h/i/y$a;
    }
.end annotation


# instance fields
.field h0:Lcom/tv91/y/h;

.field i0:Lcom/tv91/u/h/k/o;

.field j0:Lcom/tv91/u/h/k/m;

.field private final k0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/h/f;",
            ">;"
        }
    .end annotation
.end field

.field private l0:Lcom/tv91/x/h;

.field private m0:Lcom/tv91/model/User;

.field private n0:Lcom/tv91/model/ProductGroup;


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f0d00b0

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/u/h/i/x;-><init>(I)V

    .line 2
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    sget-object v1, Lcom/tv91/u/h/i/a;->a:Lcom/tv91/u/h/i/a;

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/u/h/i/y;->k0:Lcom/tv91/features/shared/ViewSupplier;

    return-void
.end method

.method private synthetic B2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/i/y;->l0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic D2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/i/y;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/f;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/h/f;->a(Z)V

    return-void
.end method

.method private synthetic F2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/i/y;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/f;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/h/f;->a(Z)V

    return-void
.end method

.method private synthetic H2(Ljava/util/List;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/tv91/u/h/i/m;->a:Lcom/tv91/u/h/i/m;

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/h/i/y;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/f;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/model/ProductGroup;

    const/4 v2, 0x1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tv91/model/ProductGroup;

    const/4 v3, 0x2

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/model/ProductGroup;

    iput-object p1, p0, Lcom/tv91/u/h/i/y;->n0:Lcom/tv91/model/ProductGroup;

    invoke-interface {v0, v1, v2, p1}, Lcom/tv91/u/h/f;->g2(Lcom/tv91/model/ProductGroup;Lcom/tv91/model/ProductGroup;Lcom/tv91/model/ProductGroup;)V

    return-void
.end method

.method static synthetic J2(Landroid/view/View;)Lcom/tv91/u/h/f;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/h/i/e0;

    invoke-static {p0}, Lcom/tv91/r/m0;->b(Landroid/view/View;)Lcom/tv91/r/m0;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/tv91/u/h/i/e0;-><init>(Lcom/tv91/r/m0;)V

    return-object v0
.end method

.method private synthetic K2(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Payment Info Not Available"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lh/a/a;->c(Ljava/lang/Throwable;)V

    return-void

    .line 3
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->i2(Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic M2(Lcom/tv91/model/ProductGroup;Lcom/tv91/model/ProductGroup;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tv91/model/ProductGroup;->groupId:I

    iget p1, p1, Lcom/tv91/model/ProductGroup;->groupId:I

    invoke-static {p0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p0

    return p0
.end method

.method private synthetic N2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/i/y;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/f;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/h/f;->D(Z)V

    return-void
.end method

.method private synthetic P2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/i/y;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/f;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/h/f;->D(Z)V

    return-void
.end method

.method private synthetic R2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/i/y;->l0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    return-void
.end method

.method private synthetic T2()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/i/y;->n0:Lcom/tv91/model/ProductGroup;

    iget-object v0, v0, Lcom/tv91/model/ProductGroup;->products:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tv91/u/h/i/y;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/f;

    iget-object v1, p0, Lcom/tv91/u/h/i/y;->n0:Lcom/tv91/model/ProductGroup;

    iget-object v1, v1, Lcom/tv91/model/ProductGroup;->products:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/model/Product;

    new-instance v2, Lcom/tv91/u/h/i/w;

    invoke-direct {v2, p0}, Lcom/tv91/u/h/i/w;-><init>(Lcom/tv91/u/h/i/y;)V

    invoke-interface {v0, v1, v2}, Lcom/tv91/u/h/f;->u1(Lcom/tv91/model/Product;Lb/g/j/a;)V

    :cond_0
    return-void
.end method

.method private synthetic V2(Lcom/tv91/model/Product;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/i/y;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/f;

    new-instance v1, Lcom/tv91/u/h/i/w;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/i/w;-><init>(Lcom/tv91/u/h/i/y;)V

    invoke-interface {v0, p1, v1}, Lcom/tv91/u/h/f;->u1(Lcom/tv91/model/Product;Lb/g/j/a;)V

    return-void
.end method

.method private s2()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->M1()Landroidx/fragment/app/e;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/i/k;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/i/k;-><init>(Lcom/tv91/u/h/i/y;)V

    invoke-static {v0, v1}, Lcom/tv91/features/shared/widget/e;->b(Landroid/content/Context;Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic t2(Lcom/tv91/model/PaymentMethod;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/i/y;->j0:Lcom/tv91/u/h/k/m;

    new-instance v1, Lcom/tv91/u/h/i/n;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/i/n;-><init>(Lcom/tv91/u/h/i/y;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/m;->w(Ljava/lang/Runnable;)Lcom/tv91/u/h/k/m;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/i/o;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/i/o;-><init>(Lcom/tv91/u/h/i/y;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/m;->v(Ljava/lang/Runnable;)Lcom/tv91/u/h/k/m;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/i/f;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/i/f;-><init>(Lcom/tv91/u/h/i/y;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/m;->x(Lb/g/j/a;)Lcom/tv91/u/h/k/m;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/i/v;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/i/v;-><init>(Lcom/tv91/u/h/i/y;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/m;->u(Lb/g/j/a;)Lcom/tv91/u/h/k/m;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/tv91/u/h/k/m;->o(Lcom/tv91/model/PaymentMethod;)V

    return-void
.end method

.method private synthetic v2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/i/y;->l0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/features/authentication/r/w$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/r/w$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic x2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/i/y;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/f;

    invoke-virtual {p1}, Lcom/tv91/s/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/q/a/f;->g0(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic z2(Lcom/tv91/s/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/u/h/i/y;->s2()V

    return-void
.end method


# virtual methods
.method public synthetic A2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/h/i/y;->z2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic C2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/h/i/y;->B2()V

    return-void
.end method

.method public synthetic E2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/h/i/y;->D2()V

    return-void
.end method

.method public synthetic G2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/h/i/y;->F2()V

    return-void
.end method

.method public synthetic I2(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/h/i/y;->H2(Ljava/util/List;)V

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

    iput-object p1, p0, Lcom/tv91/u/h/i/y;->l0:Lcom/tv91/x/h;

    .line 4
    iget-object p1, p0, Lcom/tv91/u/h/i/y;->h0:Lcom/tv91/y/h;

    invoke-interface {p1}, Lcom/tv91/y/h;->e()Lcom/tv91/model/User;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/h/i/y;->m0:Lcom/tv91/model/User;

    if-nez p1, :cond_0

    .line 5
    invoke-direct {p0}, Lcom/tv91/u/h/i/y;->s2()V

    :cond_0
    return-void
.end method

.method public synthetic L2(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/h/i/y;->K2(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic O2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/h/i/y;->N2()V

    return-void
.end method

.method public synthetic Q2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/h/i/y;->P2()V

    return-void
.end method

.method public synthetic S2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/h/i/y;->R2()V

    return-void
.end method

.method public synthetic U2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/h/i/y;->T2()V

    return-void
.end method

.method public synthetic W2(Lcom/tv91/model/Product;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/h/i/y;->V2(Lcom/tv91/model/Product;)V

    return-void
.end method

.method public X2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/i/y;->i0:Lcom/tv91/u/h/k/o;

    new-instance v1, Lcom/tv91/u/h/i/g;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/i/g;-><init>(Lcom/tv91/u/h/i/y;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/o;->w(Ljava/lang/Runnable;)Lcom/tv91/u/h/k/o;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/i/b;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/i/b;-><init>(Lcom/tv91/u/h/i/y;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/o;->v(Ljava/lang/Runnable;)Lcom/tv91/u/h/k/o;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/i/d;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/i/d;-><init>(Lcom/tv91/u/h/i/y;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/o;->x(Lb/g/j/a;)Lcom/tv91/u/h/k/o;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/i/v;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/i/v;-><init>(Lcom/tv91/u/h/i/y;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/o;->u(Lb/g/j/a;)Lcom/tv91/u/h/k/o;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/tv91/u/h/k/o;->o()V

    return-void
.end method

.method public g1()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/h/i/y;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/f;

    new-instance v1, Lcom/tv91/u/h/i/c;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/i/c;-><init>(Lcom/tv91/u/h/i/y;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/h/f;->d(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/h/i/y;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/f;

    new-instance v1, Lcom/tv91/u/h/i/i;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/i/i;-><init>(Lcom/tv91/u/h/i/y;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/h/f;->W1(Ljava/lang/Runnable;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/h/i/y;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/f;

    new-instance v1, Lcom/tv91/u/h/i/l;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/i/l;-><init>(Lcom/tv91/u/h/i/y;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/h/f;->x0(Lb/g/j/a;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/h/i/y;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/f;

    invoke-virtual {p0}, Lcom/tv91/x/f;->l2()Lcom/tv91/x/c;

    move-result-object v1

    check-cast v1, Lcom/tv91/u/h/i/y$a;

    invoke-static {v1}, Lcom/tv91/u/h/i/y$a;->r(Lcom/tv91/u/h/i/y$a;)I

    move-result v1

    const/16 v2, 0xa

    invoke-interface {v0, v1, v2}, Lcom/tv91/u/h/f;->E1(II)V

    .line 6
    invoke-virtual {p0}, Lcom/tv91/u/h/i/y;->X2()V

    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/h/i/y;->i0:Lcom/tv91/u/h/k/o;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/h/i/y;->j0:Lcom/tv91/u/h/k/m;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method public q2(Lcom/tv91/model/PaymentMethod;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/u/h/i/p;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/h/i/p;-><init>(Lcom/tv91/u/h/i/y;Lcom/tv91/model/PaymentMethod;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/u/h/i/y;->m0:Lcom/tv91/model/User;

    iget-boolean v1, p1, Lcom/tv91/model/User;->isQuick:Z

    if-eqz v1, :cond_1

    iget-boolean p1, p1, Lcom/tv91/model/User;->isCertified:Z

    if-eqz p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/tv91/u/h/i/y;->k0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p1}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/h/f;

    new-instance v1, Lcom/tv91/u/h/i/e;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/i/e;-><init>(Lcom/tv91/u/h/i/y;)V

    invoke-interface {p1, v1, v0}, Lcom/tv91/u/h/f;->v(Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public r2(Lcom/tv91/s/c;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/u/h/i/j;

    invoke-direct {v0, p0}, Lcom/tv91/u/h/i/j;-><init>(Lcom/tv91/u/h/i/y;)V

    invoke-static {v0}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/i/h;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/i/h;-><init>(Lcom/tv91/u/h/i/y;)V

    const-string v2, "0000001"

    .line 2
    invoke-virtual {v0, v2, v1}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic u2(Lcom/tv91/model/PaymentMethod;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/h/i/y;->t2(Lcom/tv91/model/PaymentMethod;)V

    return-void
.end method

.method public synthetic w2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/h/i/y;->v2()V

    return-void
.end method

.method public synthetic y2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/h/i/y;->x2(Lcom/tv91/s/c;)V

    return-void
.end method
