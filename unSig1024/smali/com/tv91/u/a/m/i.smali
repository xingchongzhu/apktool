.class public final Lcom/tv91/u/a/m/i;
.super Lcom/tv91/u/a/m/m;
.source "ActorFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/a/m/i$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/u/a/d<",
        "Lcom/tv91/u/a/c$a;",
        ">;"
    }
.end annotation


# instance fields
.field k0:Lcom/tv91/u/a/r/i;

.field private final l0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/a/c$a;",
            ">;"
        }
    .end annotation
.end field

.field private m0:Lcom/tv91/x/h;

.field private final n0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tv91/model/Actor;",
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

    const v0, 0x7f0d00a2

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/u/a/m/m;-><init>(I)V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/tv91/u/a/m/i;->n0:Ljava/util/List;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/tv91/u/a/m/i;->o0:I

    .line 4
    iput-boolean v0, p0, Lcom/tv91/u/a/m/i;->p0:Z

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/tv91/u/a/m/i;->q0:Z

    .line 6
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    sget-object v1, Lcom/tv91/u/a/m/g;->a:Lcom/tv91/u/a/m/g;

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/u/a/m/i;->l0:Lcom/tv91/features/shared/ViewSupplier;

    return-void
.end method

.method private synthetic A2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/tv91/s/c;->c()Ljava/lang/Exception;

    move-result-object v0

    invoke-static {v0}, Lh/a/a;->c(Ljava/lang/Throwable;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/m/i;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/c$a;

    invoke-virtual {p1}, Lcom/tv91/s/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/q/a/f;->g0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic C2(Landroid/view/View;)Lcom/tv91/u/a/c$a;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/a/m/l;

    invoke-static {p0}, Lcom/tv91/r/z;->b(Landroid/view/View;)Lcom/tv91/r/z;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/tv91/u/a/m/l;-><init>(Lcom/tv91/r/z;)V

    return-object v0
.end method

.method private synthetic D2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/m/i;->m0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/u/c/j/n$a;

    invoke-direct {v1}, Lcom/tv91/u/c/j/n$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic F2(Lcom/tv91/model/Actor;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/m/i;->m0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/u/c/i/z$a;

    invoke-direct {v1, p1}, Lcom/tv91/u/c/i/z$a;-><init>(Lcom/tv91/model/Actor;)V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic u2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/m/i;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/c$a;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/tv91/u/a/m/i;->p0:Z

    invoke-interface {v0, v1}, Lcom/tv91/u/a/c$a;->a(Z)V

    return-void
.end method

.method private synthetic w2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/m/i;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/c$a;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/tv91/u/a/m/i;->p0:Z

    invoke-interface {v0, v1}, Lcom/tv91/u/a/c$a;->a(Z)V

    return-void
.end method

.method private synthetic y2(Lcom/tv91/model/Paging;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/tv91/u/a/m/i;->o0:I

    iget v1, p1, Lcom/tv91/model/Paging;->pageCount:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/tv91/u/a/m/i;->q0:Z

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/m/i;->n0:Ljava/util/List;

    invoke-virtual {p1}, Lcom/tv91/model/Paging;->getData()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 3
    iget-object v0, p0, Lcom/tv91/u/a/m/i;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/c$a;

    invoke-virtual {p1}, Lcom/tv91/model/Paging;->getData()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/u/a/c$a;->d0(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public synthetic B2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/a/m/i;->A2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic E2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/a/m/i;->D2()V

    return-void
.end method

.method public synthetic G2(Lcom/tv91/model/Actor;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/a/m/i;->F2(Lcom/tv91/model/Actor;)V

    return-void
.end method

.method public H2()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/tv91/u/a/m/i;->p0:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/tv91/u/a/m/i;->q0:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/a/m/i;->k0:Lcom/tv91/u/a/r/i;

    new-instance v1, Lcom/tv91/u/a/m/f;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/m/f;-><init>(Lcom/tv91/u/a/m/i;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/a/r/i;->w(Ljava/lang/Runnable;)Lcom/tv91/u/a/r/i;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/a/m/c;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/m/c;-><init>(Lcom/tv91/u/a/m/i;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/a/r/i;->v(Ljava/lang/Runnable;)Lcom/tv91/u/a/r/i;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/a/m/e;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/m/e;-><init>(Lcom/tv91/u/a/m/i;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/a/r/i;->x(Lb/g/j/a;)Lcom/tv91/u/a/r/i;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/a/m/d;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/m/d;-><init>(Lcom/tv91/u/a/m/i;)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/tv91/u/a/r/i;->u(Lb/g/j/a;)Lcom/tv91/u/a/r/i;

    move-result-object v0

    iget v1, p0, Lcom/tv91/u/a/m/i;->o0:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/tv91/u/a/m/i;->o0:I

    sget v2, Lcom/tv91/u/a/c;->a:I

    .line 6
    invoke-virtual {v0, v1, v2}, Lcom/tv91/u/a/r/i;->o(II)V

    :cond_1
    :goto_0
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

    iput-object p1, p0, Lcom/tv91/u/a/m/i;->m0:Lcom/tv91/x/h;

    return-void
.end method

.method public g1()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/tv91/u/a/d;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/m/i;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/c$a;

    new-instance v1, Lcom/tv91/u/a/m/h;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/m/h;-><init>(Lcom/tv91/u/a/m/i;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/a/c$a;->h(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/a/m/i;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/c$a;

    new-instance v1, Lcom/tv91/u/a/m/b;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/m/b;-><init>(Lcom/tv91/u/a/m/i;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/a/c$a;->p(Lb/g/j/a;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/a/m/i;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/c$a;

    new-instance v1, Lcom/tv91/u/a/m/a;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/m/a;-><init>(Lcom/tv91/u/a/m/i;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/a/c$a;->c(Ljava/lang/Runnable;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/a/m/i;->n0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {p0}, Lcom/tv91/u/a/m/i;->H2()V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/a/m/i;->l0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/c$a;

    iget-object v1, p0, Lcom/tv91/u/a/m/i;->n0:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/tv91/u/a/c$a;->d0(Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/m/i;->k0:Lcom/tv91/u/a/r/i;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method protected n2()Lcom/tv91/u/a/h;
    .locals 1

    .line 1
    sget-object v0, Lcom/tv91/u/a/h;->c:Lcom/tv91/u/a/h;

    return-object v0
.end method

.method protected o2()Lcom/tv91/features/shared/ViewSupplier;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/a/c$a;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/m/i;->l0:Lcom/tv91/features/shared/ViewSupplier;

    return-object v0
.end method

.method public synthetic v2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/a/m/i;->u2()V

    return-void
.end method

.method public synthetic x2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/a/m/i;->w2()V

    return-void
.end method

.method public synthetic z2(Lcom/tv91/model/Paging;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/a/m/i;->y2(Lcom/tv91/model/Paging;)V

    return-void
.end method
