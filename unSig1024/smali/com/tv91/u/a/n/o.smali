.class public final Lcom/tv91/u/a/n/o;
.super Lcom/tv91/u/a/n/s;
.source "CategoryFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/a/n/o$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/u/a/d<",
        "Lcom/tv91/u/a/f;",
        ">;"
    }
.end annotation


# instance fields
.field k0:Lcom/tv91/u/a/r/k;

.field private final l0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/a/f;",
            ">;"
        }
    .end annotation
.end field

.field private m0:Lcom/tv91/x/h;

.field private n0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tv91/model/Category;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f0d00a3

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/u/a/n/s;-><init>(I)V

    .line 2
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    sget-object v1, Lcom/tv91/u/a/n/d;->a:Lcom/tv91/u/a/n/d;

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/u/a/n/o;->l0:Lcom/tv91/features/shared/ViewSupplier;

    return-void
.end method

.method private synthetic B2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/tv91/s/c;->c()Ljava/lang/Exception;

    move-result-object v0

    invoke-static {v0}, Lh/a/a;->c(Ljava/lang/Throwable;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/n/o;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/f;

    invoke-virtual {p1}, Lcom/tv91/s/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/q/a/f;->g0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic D2(Landroid/view/View;)Lcom/tv91/u/a/f;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/a/n/r;

    invoke-static {p0}, Lcom/tv91/r/a0;->b(Landroid/view/View;)Lcom/tv91/r/a0;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/tv91/u/a/n/r;-><init>(Lcom/tv91/r/a0;)V

    return-object v0
.end method

.method private synthetic E2()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/n/o;->m0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/u/c/i/c0$b;

    sget-object v2, Lcom/tv91/model/c;->a:Lcom/tv91/model/c;

    invoke-direct {v1, v2}, Lcom/tv91/u/c/i/c0$b;-><init>(Lcom/tv91/model/c;)V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic G2()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/n/o;->m0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/u/c/i/c0$b;

    sget-object v2, Lcom/tv91/model/c;->b:Lcom/tv91/model/c;

    invoke-direct {v1, v2}, Lcom/tv91/u/c/i/c0$b;-><init>(Lcom/tv91/model/c;)V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic I2()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/n/o;->m0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/u/c/i/c0$b;

    sget-object v2, Lcom/tv91/model/c;->c:Lcom/tv91/model/c;

    invoke-direct {v1, v2}, Lcom/tv91/u/c/i/c0$b;-><init>(Lcom/tv91/model/c;)V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic K2(Lcom/tv91/model/Category;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/n/o;->m0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/u/c/i/a0$a;

    invoke-direct {v1, p1}, Lcom/tv91/u/c/i/a0$a;-><init>(Lcom/tv91/model/Category;)V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic M2(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/n/o;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/f;

    invoke-virtual {p0, p1}, Lcom/tv91/u/a/n/o;->u2(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/u/a/f;->B0(Ljava/util/List;)V

    return-void
.end method

.method private synthetic v2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/n/o;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/f;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/a/f;->a(Z)V

    return-void
.end method

.method private synthetic x2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/n/o;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/f;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/a/f;->a(Z)V

    return-void
.end method

.method private synthetic z2(Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/n/o;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/f;

    iput-object p1, p0, Lcom/tv91/u/a/n/o;->n0:Ljava/util/List;

    invoke-interface {v0, p1}, Lcom/tv91/u/a/f;->B0(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public synthetic A2(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/a/n/o;->z2(Ljava/util/List;)V

    return-void
.end method

.method public synthetic C2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/a/n/o;->B2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic F2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/a/n/o;->E2()V

    return-void
.end method

.method public synthetic H2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/a/n/o;->G2()V

    return-void
.end method

.method public J0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/tv91/u/a/d;->J0(Landroid/os/Bundle;)V

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

    iput-object p1, p0, Lcom/tv91/u/a/n/o;->m0:Lcom/tv91/x/h;

    return-void
.end method

.method public synthetic J2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/a/n/o;->I2()V

    return-void
.end method

.method public synthetic L2(Lcom/tv91/model/Category;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/a/n/o;->K2(Lcom/tv91/model/Category;)V

    return-void
.end method

.method public synthetic N2(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/a/n/o;->M2(Ljava/lang/String;)V

    return-void
.end method

.method public O2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/n/o;->k0:Lcom/tv91/u/a/r/k;

    new-instance v1, Lcom/tv91/u/a/n/c;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/n/c;-><init>(Lcom/tv91/u/a/n/o;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/a/r/k;->w(Ljava/lang/Runnable;)Lcom/tv91/u/a/r/k;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/a/n/b;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/n/b;-><init>(Lcom/tv91/u/a/n/o;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/a/r/k;->v(Ljava/lang/Runnable;)Lcom/tv91/u/a/r/k;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/a/n/j;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/n/j;-><init>(Lcom/tv91/u/a/n/o;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/a/r/k;->x(Lb/g/j/a;)Lcom/tv91/u/a/r/k;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/a/n/a;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/n/a;-><init>(Lcom/tv91/u/a/n/o;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/a/r/k;->u(Lb/g/j/a;)Lcom/tv91/u/a/r/k;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/tv91/u/a/r/k;->o()V

    return-void
.end method

.method public g1()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/tv91/u/a/d;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/n/o;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/f;

    new-instance v1, Lcom/tv91/u/a/n/i;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/n/i;-><init>(Lcom/tv91/u/a/n/o;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/a/f;->L0(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/a/n/o;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/f;

    new-instance v1, Lcom/tv91/u/a/n/g;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/n/g;-><init>(Lcom/tv91/u/a/n/o;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/a/f;->A1(Ljava/lang/Runnable;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/a/n/o;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/f;

    new-instance v1, Lcom/tv91/u/a/n/h;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/n/h;-><init>(Lcom/tv91/u/a/n/o;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/a/f;->I0(Ljava/lang/Runnable;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/a/n/o;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/f;

    new-instance v1, Lcom/tv91/u/a/n/e;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/n/e;-><init>(Lcom/tv91/u/a/n/o;)V

    .line 6
    invoke-interface {v0, v1}, Lcom/tv91/u/a/f;->X0(Lb/g/j/a;)V

    .line 7
    iget-object v0, p0, Lcom/tv91/u/a/n/o;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/f;

    new-instance v1, Lcom/tv91/u/a/n/f;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/n/f;-><init>(Lcom/tv91/u/a/n/o;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/a/f;->h0(Lb/g/j/a;)V

    .line 8
    iget-object v0, p0, Lcom/tv91/u/a/n/o;->n0:Ljava/util/List;

    if-nez v0, :cond_0

    .line 9
    invoke-virtual {p0}, Lcom/tv91/u/a/n/o;->O2()V

    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/a/n/o;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/f;

    iget-object v1, p0, Lcom/tv91/u/a/n/o;->n0:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/tv91/u/a/f;->B0(Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/n/o;->k0:Lcom/tv91/u/a/r/k;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method protected n2()Lcom/tv91/u/a/h;
    .locals 1

    .line 1
    sget-object v0, Lcom/tv91/u/a/h;->b:Lcom/tv91/u/a/h;

    return-object v0
.end method

.method protected o2()Lcom/tv91/features/shared/ViewSupplier;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/a/f;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/n/o;->l0:Lcom/tv91/features/shared/ViewSupplier;

    return-object v0
.end method

.method public u2(Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/tv91/model/Category;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/n/o;->n0:Ljava/util/List;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 2
    :cond_0
    invoke-static {p1}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object p1, p0, Lcom/tv91/u/a/n/o;->n0:Ljava/util/List;

    goto :goto_1

    .line 4
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    iget-object v1, p0, Lcom/tv91/u/a/n/o;->n0:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tv91/model/Category;

    .line 6
    iget-object v3, v2, Lcom/tv91/model/b;->value:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 7
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    move-object p1, v0

    :goto_1
    return-object p1

    .line 8
    :cond_4
    :goto_2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public synthetic w2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/a/n/o;->v2()V

    return-void
.end method

.method public synthetic y2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/a/n/o;->x2()V

    return-void
.end method
