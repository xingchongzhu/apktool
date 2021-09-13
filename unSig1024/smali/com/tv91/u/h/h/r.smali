.class public final Lcom/tv91/u/h/h/r;
.super Lcom/tv91/u/h/h/q;
.source "HistoryFragment.java"

# interfaces
.implements Lcom/tv91/u/h/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/h/h/r$b;
    }
.end annotation


# instance fields
.field h0:Lcom/tv91/u/h/k/p;

.field i0:Lcom/tv91/u/h/k/n;

.field private final j0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/h/e;",
            ">;"
        }
    .end annotation
.end field

.field private k0:Lcom/tv91/x/h;

.field private l0:Lcom/tv91/u/h/c;

.field private final m0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tv91/model/PaymentHistory;",
            ">;"
        }
    .end annotation
.end field

.field private final n0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tv91/model/PurchaseHistory;",
            ">;"
        }
    .end annotation
.end field

.field private o0:I

.field private p0:Z

.field private q0:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/tv91/u/h/h/q;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/tv91/u/h/h/r;->m0:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/tv91/u/h/h/r;->n0:Ljava/util/List;

    const/4 v0, 0x1

    .line 4
    iput v0, p0, Lcom/tv91/u/h/h/r;->o0:I

    .line 5
    iput-boolean v0, p0, Lcom/tv91/u/h/h/r;->q0:Z

    .line 6
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    new-instance v1, Lcom/tv91/u/h/h/e;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/h/e;-><init>(Lcom/tv91/u/h/h/r;)V

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/u/h/h/r;->j0:Lcom/tv91/features/shared/ViewSupplier;

    return-void
.end method

.method private synthetic B2()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/tv91/u/h/h/r;->p0:Z

    invoke-direct {p0, v0}, Lcom/tv91/u/h/h/r;->T2(Z)V

    return-void
.end method

.method private synthetic D2()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/tv91/u/h/h/r;->p0:Z

    invoke-direct {p0, v0}, Lcom/tv91/u/h/h/r;->T2(Z)V

    return-void
.end method

.method private synthetic F2(ILcom/tv91/model/Paging;)V
    .locals 1

    .line 1
    iget v0, p2, Lcom/tv91/model/Paging;->pageCount:I

    if-ge v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/tv91/u/h/h/r;->q0:Z

    .line 2
    iget-object p1, p0, Lcom/tv91/u/h/h/r;->n0:Ljava/util/List;

    invoke-virtual {p2}, Lcom/tv91/model/Paging;->getData()Ljava/util/List;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 3
    iget-object p1, p0, Lcom/tv91/u/h/h/r;->n0:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/tv91/u/h/h/r;->S2(Ljava/util/List;)V

    return-void
.end method

.method private synthetic H2(Landroid/view/View;)Lcom/tv91/u/h/e;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/h/r;->l0:Lcom/tv91/u/h/c;

    invoke-virtual {v0}, Lcom/tv91/u/h/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/tv91/u/h/h/v;

    invoke-static {p1}, Lcom/tv91/r/u0;->b(Landroid/view/View;)Lcom/tv91/r/u0;

    move-result-object p1

    iget-object v1, p0, Lcom/tv91/u/h/h/r;->l0:Lcom/tv91/u/h/c;

    invoke-direct {v0, p1, v1}, Lcom/tv91/u/h/h/v;-><init>(Lcom/tv91/r/u0;Lcom/tv91/u/h/c;)V

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Lcom/tv91/u/h/h/u;

    invoke-static {p1}, Lcom/tv91/r/n0;->b(Landroid/view/View;)Lcom/tv91/r/n0;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/tv91/u/h/h/u;-><init>(Lcom/tv91/r/n0;)V

    return-object v0
.end method

.method private synthetic J2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/h/r;->k0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic L2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/h/r;->k0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    return-void
.end method

.method private synthetic N2()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/tv91/u/h/h/r;->o0:I

    add-int/lit8 v0, v0, 0x1

    invoke-interface {p0, v0}, Lcom/tv91/u/h/b;->e(I)V

    return-void
.end method

.method private synthetic P2(Ljava/lang/Object;)V
    .locals 3

    .line 1
    instance-of v0, p1, Lcom/tv91/model/PurchaseHistory;

    if-eqz v0, :cond_1

    .line 2
    check-cast p1, Lcom/tv91/model/PurchaseHistory;

    iget v0, p1, Lcom/tv91/model/PurchaseHistory;->movieId:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 3
    iget p1, p1, Lcom/tv91/model/PurchaseHistory;->sourceId:I

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/tv91/u/h/h/r;->k0:Lcom/tv91/x/h;

    new-instance v2, Lcom/tv91/u/c/f/y1$a;

    invoke-direct {v2, v0, p1}, Lcom/tv91/u/c/f/y1$a;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    :cond_1
    return-void
.end method

.method private S2(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/h/r;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/e;

    invoke-interface {v0, p1}, Lcom/tv91/u/h/e;->H(Ljava/util/List;)V

    return-void
.end method

.method private T2(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/h/r;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/e;

    invoke-interface {v0, p1}, Lcom/tv91/u/h/e;->a(Z)V

    return-void
.end method

.method private synthetic r2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/h/r;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/e;

    invoke-virtual {p1}, Lcom/tv91/s/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/q/a/f;->g0(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic t2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->M1()Landroidx/fragment/app/e;

    move-result-object p1

    new-instance v0, Lcom/tv91/u/h/h/c;

    invoke-direct {v0, p0}, Lcom/tv91/u/h/h/c;-><init>(Lcom/tv91/u/h/h/r;)V

    invoke-static {p1, v0}, Lcom/tv91/features/shared/widget/e;->b(Landroid/content/Context;Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic v2()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/u/h/h/r;->T2(Z)V

    return-void
.end method

.method private synthetic x2()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/u/h/h/r;->T2(Z)V

    return-void
.end method

.method private synthetic z2(Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/h/r;->m0:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 2
    iget-object p1, p0, Lcom/tv91/u/h/h/r;->m0:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/tv91/u/h/h/r;->S2(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public synthetic A2(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/h/h/r;->z2(Ljava/util/List;)V

    return-void
.end method

.method public synthetic C2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/h/h/r;->B2()V

    return-void
.end method

.method public synthetic E2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/h/h/r;->D2()V

    return-void
.end method

.method public synthetic G2(ILcom/tv91/model/Paging;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/h/h/r;->F2(ILcom/tv91/model/Paging;)V

    return-void
.end method

.method public synthetic I2(Landroid/view/View;)Lcom/tv91/u/h/e;
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/h/h/r;->H2(Landroid/view/View;)Lcom/tv91/u/h/e;

    move-result-object p1

    return-object p1
.end method

.method public J0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->J0(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Lcom/tv91/x/f;->l2()Lcom/tv91/x/c;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/h/h/r$b;

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

    iput-object v0, p0, Lcom/tv91/u/h/h/r;->k0:Lcom/tv91/x/h;

    .line 5
    iget-object p1, p1, Lcom/tv91/u/h/h/r$b;->b:Lcom/tv91/u/h/c;

    iput-object p1, p0, Lcom/tv91/u/h/h/r;->l0:Lcom/tv91/u/h/c;

    return-void
.end method

.method public synthetic K2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/h/h/r;->J2()V

    return-void
.end method

.method public synthetic M2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/h/h/r;->L2()V

    return-void
.end method

.method public N0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object p3, p0, Lcom/tv91/u/h/h/r;->l0:Lcom/tv91/u/h/c;

    invoke-virtual {p3}, Lcom/tv91/u/h/c;->a()Z

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    const p3, 0x7f0d00b8

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const p3, 0x7f0d00b1

    .line 3
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public synthetic O2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/h/h/r;->N2()V

    return-void
.end method

.method public synthetic Q2(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/h/h/r;->P2(Ljava/lang/Object;)V

    return-void
.end method

.method public R2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/h/r;->i0:Lcom/tv91/u/h/k/n;

    new-instance v1, Lcom/tv91/u/h/h/b;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/h/b;-><init>(Lcom/tv91/u/h/h/r;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/n;->w(Ljava/lang/Runnable;)Lcom/tv91/u/h/k/n;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/h/m;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/h/m;-><init>(Lcom/tv91/u/h/h/r;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/n;->v(Ljava/lang/Runnable;)Lcom/tv91/u/h/k/n;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/h/j;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/h/j;-><init>(Lcom/tv91/u/h/h/r;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/n;->x(Lb/g/j/a;)Lcom/tv91/u/h/k/n;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/h/p;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/h/p;-><init>(Lcom/tv91/u/h/h/r;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/n;->u(Lb/g/j/a;)Lcom/tv91/u/h/k/n;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/tv91/u/h/k/n;->o()V

    return-void
.end method

.method public synthetic e(I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/u/h/a;->a(Lcom/tv91/u/h/b;I)V

    return-void
.end method

.method public g1()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/h/h/r;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/e;

    new-instance v1, Lcom/tv91/u/h/h/k;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/h/k;-><init>(Lcom/tv91/u/h/h/r;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/h/e;->b(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/h/h/r;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/e;

    new-instance v1, Lcom/tv91/u/h/h/n;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/h/n;-><init>(Lcom/tv91/u/h/h/r;)V

    const/16 v2, 0xa

    invoke-interface {v0, v2, v1}, Lcom/tv91/u/h/e;->s0(ILjava/lang/Runnable;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/h/h/r;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/e;

    new-instance v1, Lcom/tv91/u/h/h/g;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/h/g;-><init>(Lcom/tv91/u/h/h/r;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/h/e;->S0(Lb/g/j/a;)V

    .line 5
    sget-object v0, Lcom/tv91/u/h/h/r$a;->a:[I

    iget-object v1, p0, Lcom/tv91/u/h/h/r;->l0:Lcom/tv91/u/h/c;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/h/h/r;->m0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    invoke-virtual {p0}, Lcom/tv91/u/h/h/r;->R2()V

    goto :goto_0

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/tv91/u/h/h/r;->m0:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/tv91/u/h/h/r;->S2(Ljava/util/List;)V

    goto :goto_0

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/tv91/u/h/h/r;->n0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 10
    iget v0, p0, Lcom/tv91/u/h/h/r;->o0:I

    invoke-interface {p0, v0}, Lcom/tv91/u/h/b;->e(I)V

    goto :goto_0

    .line 11
    :cond_3
    iget-object v0, p0, Lcom/tv91/u/h/h/r;->n0:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/tv91/u/h/h/r;->S2(Ljava/util/List;)V

    goto :goto_0

    .line 12
    :cond_4
    iget-object v0, p0, Lcom/tv91/u/h/h/r;->n0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 13
    iget v0, p0, Lcom/tv91/u/h/h/r;->o0:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/tv91/u/h/h/r;->j(II)V

    goto :goto_0

    .line 14
    :cond_5
    iget-object v0, p0, Lcom/tv91/u/h/h/r;->n0:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/tv91/u/h/h/r;->S2(Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/h/h/r;->h0:Lcom/tv91/u/h/k/p;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/h/h/r;->i0:Lcom/tv91/u/h/k/n;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method public j(II)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/tv91/u/h/h/r;->p0:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/tv91/u/h/h/r;->q0:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iput p1, p0, Lcom/tv91/u/h/h/r;->o0:I

    .line 3
    iget-object v0, p0, Lcom/tv91/u/h/h/r;->h0:Lcom/tv91/u/h/k/p;

    new-instance v1, Lcom/tv91/u/h/h/f;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/h/f;-><init>(Lcom/tv91/u/h/h/r;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/p;->w(Ljava/lang/Runnable;)Lcom/tv91/u/h/k/p;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/h/i;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/h/i;-><init>(Lcom/tv91/u/h/h/r;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/p;->v(Ljava/lang/Runnable;)Lcom/tv91/u/h/k/p;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/h/l;

    invoke-direct {v1, p0, p1}, Lcom/tv91/u/h/h/l;-><init>(Lcom/tv91/u/h/h/r;I)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/p;->x(Lb/g/j/a;)Lcom/tv91/u/h/k/p;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/h/p;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/h/p;-><init>(Lcom/tv91/u/h/h/r;)V

    .line 6
    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/p;->u(Lb/g/j/a;)Lcom/tv91/u/h/k/p;

    move-result-object v0

    .line 7
    invoke-virtual {v0, p1, p2}, Lcom/tv91/u/h/k/p;->o(II)V

    :cond_1
    :goto_0
    return-void
.end method

.method public q2(Lcom/tv91/s/c;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/u/h/h/d;

    invoke-direct {v0, p0}, Lcom/tv91/u/h/h/d;-><init>(Lcom/tv91/u/h/h/r;)V

    invoke-static {v0}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/h/h;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/h/h;-><init>(Lcom/tv91/u/h/h/r;)V

    const-string v2, "0000001"

    .line 2
    invoke-virtual {v0, v2, v1}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic s2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/h/h/r;->r2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic u2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/h/h/r;->t2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic w2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/h/h/r;->v2()V

    return-void
.end method

.method public synthetic y2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/h/h/r;->x2()V

    return-void
.end method
