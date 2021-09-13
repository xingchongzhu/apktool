.class public final Lcom/tv91/u/c/j/n;
.super Lcom/tv91/u/c/j/m;
.source "MovieSearchFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/c/j/n$a;
    }
.end annotation


# instance fields
.field h0:Lcom/tv91/u/c/k/t;

.field private final i0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/c/e$a;",
            ">;"
        }
    .end annotation
.end field

.field private j0:Lcom/tv91/x/h;

.field private final k0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tv91/model/Movie;",
            ">;"
        }
    .end annotation
.end field

.field private l0:I

.field private m0:Z

.field private n0:Z

.field private o0:Ljava/lang/String;

.field private p0:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f0d00ae

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/u/c/j/m;-><init>(I)V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/tv91/u/c/j/n;->k0:Ljava/util/List;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/tv91/u/c/j/n;->l0:I

    .line 4
    iput-boolean v0, p0, Lcom/tv91/u/c/j/n;->m0:Z

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/tv91/u/c/j/n;->n0:Z

    const-string v0, ""

    .line 6
    iput-object v0, p0, Lcom/tv91/u/c/j/n;->o0:Ljava/lang/String;

    .line 7
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    sget-object v1, Lcom/tv91/u/c/j/b;->a:Lcom/tv91/u/c/j/b;

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/u/c/j/n;->i0:Lcom/tv91/features/shared/ViewSupplier;

    return-void
.end method

.method private synthetic A2()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/tv91/u/c/j/n;->p0:Z

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/j/n;->o0:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/tv91/u/c/j/n;->I2(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic C2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/j/n;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/e$a;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/tv91/u/c/j/n;->m0:Z

    invoke-interface {v0, v1}, Lcom/tv91/u/c/e$a;->a(Z)V

    return-void
.end method

.method private synthetic E2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/j/n;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/e$a;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/tv91/u/c/j/n;->m0:Z

    invoke-interface {v0, v1}, Lcom/tv91/u/c/e$a;->a(Z)V

    return-void
.end method

.method private synthetic G2(Lcom/tv91/model/Paging;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/tv91/u/c/j/n;->l0:I

    iget v1, p1, Lcom/tv91/model/Paging;->pageCount:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/tv91/u/c/j/n;->n0:Z

    .line 2
    iget-boolean v0, p0, Lcom/tv91/u/c/j/n;->p0:Z

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/tv91/u/c/j/n;->k0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/tv91/u/c/j/n;->k0:Ljava/util/List;

    invoke-virtual {p1}, Lcom/tv91/model/Paging;->getMovies()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 5
    iget-object v0, p0, Lcom/tv91/u/c/j/n;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/e$a;

    invoke-virtual {p1}, Lcom/tv91/model/Paging;->getMovies()Ljava/util/List;

    move-result-object p1

    iget-boolean v1, p0, Lcom/tv91/u/c/j/n;->p0:Z

    invoke-interface {v0, p1, v1}, Lcom/tv91/u/c/e$a;->O(Ljava/util/List;Z)V

    return-void
.end method

.method private synthetic r2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/j/n;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/e$a;

    invoke-virtual {p1}, Lcom/tv91/s/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/q/a/f;->g0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic t2(Landroid/view/View;)Lcom/tv91/u/c/e$a;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/c/j/q;

    invoke-static {p0}, Lcom/tv91/r/l0;->b(Landroid/view/View;)Lcom/tv91/r/l0;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/tv91/u/c/j/q;-><init>(Lcom/tv91/r/l0;)V

    return-object v0
.end method

.method private synthetic u2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/j/n;->j0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    return-void
.end method

.method private synthetic w2(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/j/n;->o0:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/tv91/utils/g;->b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lcom/tv91/u/c/j/n;->p0:Z

    .line 2
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/c/j/n;->o0:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/tv91/u/c/j/n;->I2(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic y2(Lcom/tv91/model/Movie;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/j/n;->j0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/u/c/f/y1$a;

    iget v2, p1, Lcom/tv91/model/Movie;->id:I

    iget p1, p1, Lcom/tv91/model/Movie;->sourceId:I

    invoke-direct {v1, v2, p1}, Lcom/tv91/u/c/f/y1$a;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method


# virtual methods
.method public synthetic B2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/j/n;->A2()V

    return-void
.end method

.method public synthetic D2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/j/n;->C2()V

    return-void
.end method

.method public synthetic F2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/j/n;->E2()V

    return-void
.end method

.method public synthetic H2(Lcom/tv91/model/Paging;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/j/n;->G2(Lcom/tv91/model/Paging;)V

    return-void
.end method

.method public I2(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/tv91/u/c/j/n;->m0:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/tv91/u/c/j/n;->n0:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/c/j/n;->o0:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/tv91/utils/g;->b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/tv91/u/c/j/n;->l0:I

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/tv91/u/c/j/n;->h0:Lcom/tv91/u/c/k/t;

    new-instance v1, Lcom/tv91/u/c/j/c;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/j/c;-><init>(Lcom/tv91/u/c/j/n;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->A(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/j/i;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/j/i;-><init>(Lcom/tv91/u/c/j/n;)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->z(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/j/d;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/j/d;-><init>(Lcom/tv91/u/c/j/n;)V

    .line 6
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->B(Lb/g/j/a;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/j/l;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/j/l;-><init>(Lcom/tv91/u/c/j/n;)V

    .line 7
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->y(Lb/g/j/a;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    iget v1, p0, Lcom/tv91/u/c/j/n;->l0:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/tv91/u/c/j/n;->l0:I

    sget v2, Lcom/tv91/u/c/e;->a:I

    iput-object p1, p0, Lcom/tv91/u/c/j/n;->o0:Ljava/lang/String;

    .line 8
    invoke-virtual {v0, v1, v2, p1}, Lcom/tv91/u/c/k/t;->p(IILjava/lang/String;)V

    :cond_2
    :goto_0
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

    iput-object p1, p0, Lcom/tv91/u/c/j/n;->j0:Lcom/tv91/x/h;

    return-void
.end method

.method public g1()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/j/n;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/e$a;

    new-instance v1, Lcom/tv91/u/c/j/e;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/j/e;-><init>(Lcom/tv91/u/c/j/n;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/e$a;->d(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/c/j/n;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/e$a;

    new-instance v1, Lcom/tv91/u/c/j/h;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/j/h;-><init>(Lcom/tv91/u/c/j/n;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/e$a;->Y1(Lb/g/j/a;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/c/j/n;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/e$a;

    new-instance v1, Lcom/tv91/u/c/j/g;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/j/g;-><init>(Lcom/tv91/u/c/j/n;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/e$a;->e(Lb/g/j/a;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/c/j/n;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/e$a;

    new-instance v1, Lcom/tv91/u/c/j/f;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/j/f;-><init>(Lcom/tv91/u/c/j/n;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/e$a;->c(Ljava/lang/Runnable;)V

    .line 6
    iget-object v0, p0, Lcom/tv91/u/c/j/n;->k0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tv91/u/c/j/n;->o0:Ljava/lang/String;

    invoke-static {v0}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 7
    iget-object v0, p0, Lcom/tv91/u/c/j/n;->o0:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/tv91/u/c/j/n;->I2(Ljava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/c/j/n;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/e$a;

    iget-object v1, p0, Lcom/tv91/u/c/j/n;->k0:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/tv91/u/c/e$a;->O(Ljava/util/List;Z)V

    :goto_0
    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/j/n;->h0:Lcom/tv91/u/c/k/t;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method public q2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/c/j/a;

    invoke-direct {v0, p0}, Lcom/tv91/u/c/j/a;-><init>(Lcom/tv91/u/c/j/n;)V

    invoke-static {v0}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic s2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/j/n;->r2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic v2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/j/n;->u2()V

    return-void
.end method

.method public synthetic x2(Ljava/lang/CharSequence;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/j/n;->w2(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public synthetic z2(Lcom/tv91/model/Movie;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/j/n;->y2(Lcom/tv91/model/Movie;)V

    return-void
.end method
