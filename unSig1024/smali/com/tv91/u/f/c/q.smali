.class public final Lcom/tv91/u/f/c/q;
.super Lcom/tv91/u/f/c/u;
.source "FeedbackListFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/f/c/q$a;
    }
.end annotation


# instance fields
.field h0:Lcom/tv91/y/h;

.field i0:Lcom/tv91/u/f/f/h;

.field private final j0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/f/a;",
            ">;"
        }
    .end annotation
.end field

.field private k0:Lcom/tv91/x/h;

.field private l0:Lcom/tv91/model/User;

.field private final m0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tv91/model/Feedback;",
            ">;"
        }
    .end annotation
.end field

.field private n0:I

.field private o0:Z

.field private p0:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f0d00a8

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/u/f/c/u;-><init>(I)V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/tv91/u/f/c/q;->m0:Ljava/util/List;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/tv91/u/f/c/q;->n0:I

    .line 4
    iput-boolean v0, p0, Lcom/tv91/u/f/c/q;->o0:Z

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/tv91/u/f/c/q;->p0:Z

    .line 6
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    sget-object v1, Lcom/tv91/u/f/c/b;->a:Lcom/tv91/u/f/c/b;

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/u/f/c/q;->j0:Lcom/tv91/features/shared/ViewSupplier;

    return-void
.end method

.method static synthetic B2(Landroid/view/View;)Lcom/tv91/u/f/a;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/f/c/t;

    invoke-static {p0}, Lcom/tv91/r/f0;->b(Landroid/view/View;)Lcom/tv91/r/f0;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/tv91/u/f/c/t;-><init>(Lcom/tv91/r/f0;)V

    return-object v0
.end method

.method private synthetic C2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/c/q;->k0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic E2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/c/q;->k0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    return-void
.end method

.method private synthetic G2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/c/q;->m0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/f/c/q;->k0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/u/f/e/o$a;

    invoke-direct {v1}, Lcom/tv91/u/f/e/o$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic I2(Lcom/tv91/model/Feedback;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/c/q;->k0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/u/f/c/p$a;

    invoke-direct {v1, p1}, Lcom/tv91/u/f/c/p$a;-><init>(Lcom/tv91/model/Feedback;)V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic K2()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/c/q;->k0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/x/b;

    iget-object v2, p0, Lcom/tv91/u/f/c/q;->l0:Lcom/tv91/model/User;

    iget-object v2, v2, Lcom/tv91/model/User;->onlineServiceUrl:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/tv91/x/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic r2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->M1()Landroidx/fragment/app/e;

    move-result-object p1

    new-instance v0, Lcom/tv91/u/f/c/i;

    invoke-direct {v0, p0}, Lcom/tv91/u/f/c/i;-><init>(Lcom/tv91/u/f/c/q;)V

    invoke-static {p1, v0}, Lcom/tv91/features/shared/widget/e;->b(Landroid/content/Context;Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic t2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/c/q;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/f/a;

    invoke-virtual {p1}, Lcom/tv91/s/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/q/a/f;->g0(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic v2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/c/q;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/f/a;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/tv91/u/f/c/q;->o0:Z

    invoke-interface {v0, v1}, Lcom/tv91/u/f/a;->a(Z)V

    return-void
.end method

.method private synthetic x2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/c/q;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/f/a;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/tv91/u/f/c/q;->o0:Z

    invoke-interface {v0, v1}, Lcom/tv91/u/f/a;->a(Z)V

    return-void
.end method

.method private synthetic z2(Lcom/tv91/model/Paging;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/tv91/u/f/c/q;->n0:I

    iget v1, p1, Lcom/tv91/model/Paging;->pageCount:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/tv91/u/f/c/q;->p0:Z

    .line 2
    iget-object v0, p0, Lcom/tv91/u/f/c/q;->m0:Ljava/util/List;

    invoke-virtual {p1}, Lcom/tv91/model/Paging;->getData()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 3
    iget-object v0, p0, Lcom/tv91/u/f/c/q;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/f/a;

    invoke-virtual {p1}, Lcom/tv91/model/Paging;->getData()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/u/f/a;->k0(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public synthetic A2(Lcom/tv91/model/Paging;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/f/c/q;->z2(Lcom/tv91/model/Paging;)V

    return-void
.end method

.method public synthetic D2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/f/c/q;->C2()V

    return-void
.end method

.method public synthetic F2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/f/c/q;->E2()V

    return-void
.end method

.method public synthetic H2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/f/c/q;->G2()V

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

    iput-object p1, p0, Lcom/tv91/u/f/c/q;->k0:Lcom/tv91/x/h;

    .line 4
    iget-object p1, p0, Lcom/tv91/u/f/c/q;->h0:Lcom/tv91/y/h;

    invoke-interface {p1}, Lcom/tv91/y/h;->e()Lcom/tv91/model/User;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/f/c/q;->l0:Lcom/tv91/model/User;

    return-void
.end method

.method public synthetic J2(Lcom/tv91/model/Feedback;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/f/c/q;->I2(Lcom/tv91/model/Feedback;)V

    return-void
.end method

.method public synthetic L2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/f/c/q;->K2()V

    return-void
.end method

.method public M2()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/tv91/u/f/c/q;->o0:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/tv91/u/f/c/q;->p0:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/f/c/q;->i0:Lcom/tv91/u/f/f/h;

    new-instance v1, Lcom/tv91/u/f/c/h;

    invoke-direct {v1, p0}, Lcom/tv91/u/f/c/h;-><init>(Lcom/tv91/u/f/c/q;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/f/f/h;->w(Ljava/lang/Runnable;)Lcom/tv91/u/f/f/h;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/f/c/j;

    invoke-direct {v1, p0}, Lcom/tv91/u/f/c/j;-><init>(Lcom/tv91/u/f/c/q;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/f/f/h;->v(Ljava/lang/Runnable;)Lcom/tv91/u/f/f/h;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/f/c/l;

    invoke-direct {v1, p0}, Lcom/tv91/u/f/c/l;-><init>(Lcom/tv91/u/f/c/q;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/f/f/h;->x(Lb/g/j/a;)Lcom/tv91/u/f/f/h;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/f/c/o;

    invoke-direct {v1, p0}, Lcom/tv91/u/f/c/o;-><init>(Lcom/tv91/u/f/c/q;)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/tv91/u/f/f/h;->u(Lb/g/j/a;)Lcom/tv91/u/f/f/h;

    move-result-object v0

    iget v1, p0, Lcom/tv91/u/f/c/q;->n0:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/tv91/u/f/c/q;->n0:I

    const/16 v2, 0x19

    .line 6
    invoke-virtual {v0, v1, v2}, Lcom/tv91/u/f/f/h;->o(II)V

    :cond_1
    :goto_0
    return-void
.end method

.method public g1()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/f/c/q;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/f/a;

    new-instance v1, Lcom/tv91/u/f/c/f;

    invoke-direct {v1, p0}, Lcom/tv91/u/f/c/f;-><init>(Lcom/tv91/u/f/c/q;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/f/a;->b(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/f/c/q;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/f/a;

    new-instance v1, Lcom/tv91/u/f/c/d;

    invoke-direct {v1, p0}, Lcom/tv91/u/f/c/d;-><init>(Lcom/tv91/u/f/c/q;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/f/a;->w0(Ljava/lang/Runnable;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/f/c/q;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/f/a;

    new-instance v1, Lcom/tv91/u/f/c/n;

    invoke-direct {v1, p0}, Lcom/tv91/u/f/c/n;-><init>(Lcom/tv91/u/f/c/q;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/f/a;->c(Ljava/lang/Runnable;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/f/c/q;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/f/a;

    new-instance v1, Lcom/tv91/u/f/c/k;

    invoke-direct {v1, p0}, Lcom/tv91/u/f/c/k;-><init>(Lcom/tv91/u/f/c/q;)V

    .line 6
    invoke-interface {v0, v1}, Lcom/tv91/u/f/a;->t0(Lb/g/j/a;)V

    .line 7
    iget-object v0, p0, Lcom/tv91/u/f/c/q;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/f/a;

    new-instance v1, Lcom/tv91/u/f/c/e;

    invoke-direct {v1, p0}, Lcom/tv91/u/f/c/e;-><init>(Lcom/tv91/u/f/c/q;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/f/a;->V(Ljava/lang/Runnable;)V

    .line 8
    iget-object v0, p0, Lcom/tv91/u/f/c/q;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/f/a;

    iget-object v1, p0, Lcom/tv91/u/f/c/q;->l0:Lcom/tv91/model/User;

    iget-boolean v1, v1, Lcom/tv91/model/User;->onlineServiceAvailable:Z

    invoke-interface {v0, v1}, Lcom/tv91/u/f/a;->d1(Z)V

    .line 9
    iget-object v0, p0, Lcom/tv91/u/f/c/q;->m0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10
    invoke-virtual {p0}, Lcom/tv91/u/f/c/q;->M2()V

    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/f/c/q;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/f/a;

    iget-object v1, p0, Lcom/tv91/u/f/c/q;->m0:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/tv91/u/f/a;->k0(Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/f/c/q;->i0:Lcom/tv91/u/f/f/h;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method public q2(Lcom/tv91/s/c;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/u/f/c/c;

    invoke-direct {v0, p0}, Lcom/tv91/u/f/c/c;-><init>(Lcom/tv91/u/f/c/q;)V

    invoke-static {v0}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/f/c/g;

    invoke-direct {v1, p0}, Lcom/tv91/u/f/c/g;-><init>(Lcom/tv91/u/f/c/q;)V

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

    invoke-direct {p0, p1}, Lcom/tv91/u/f/c/q;->r2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic u2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/f/c/q;->t2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic w2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/f/c/q;->v2()V

    return-void
.end method

.method public synthetic y2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/f/c/q;->x2()V

    return-void
.end method
