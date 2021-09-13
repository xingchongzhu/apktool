.class public abstract Lcom/tv91/u/c/i/v;
.super Lcom/tv91/u/c/i/y;
.source "BaseMoviesFragment.java"


# instance fields
.field h0:Lcom/tv91/u/c/k/t;

.field private i0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/c/d$a;",
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


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tv91/u/c/i/y;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/tv91/u/c/i/v;->k0:Ljava/util/List;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/tv91/u/c/i/v;->l0:I

    .line 4
    iput-boolean v0, p0, Lcom/tv91/u/c/i/v;->m0:Z

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/tv91/u/c/i/v;->n0:Z

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lcom/tv91/u/c/i/y;-><init>(I)V

    .line 7
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/c/i/v;->k0:Ljava/util/List;

    const/4 p1, 0x0

    .line 8
    iput p1, p0, Lcom/tv91/u/c/i/v;->l0:I

    .line 9
    iput-boolean p1, p0, Lcom/tv91/u/c/i/v;->m0:Z

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/tv91/u/c/i/v;->n0:Z

    return-void
.end method

.method private synthetic B2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/d$a;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/tv91/u/c/i/v;->m0:Z

    invoke-interface {v0, v1}, Lcom/tv91/u/c/d$a;->a(Z)V

    return-void
.end method

.method private synthetic D2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/d$a;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/tv91/u/c/i/v;->m0:Z

    invoke-interface {v0, v1}, Lcom/tv91/u/c/d$a;->a(Z)V

    return-void
.end method

.method private synthetic F2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/d$a;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/tv91/u/c/i/v;->m0:Z

    invoke-interface {v0, v1}, Lcom/tv91/u/c/d$a;->a(Z)V

    return-void
.end method

.method private synthetic H2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/d$a;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/tv91/u/c/i/v;->m0:Z

    invoke-interface {v0, v1}, Lcom/tv91/u/c/d$a;->a(Z)V

    return-void
.end method

.method private synthetic J2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/d$a;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/tv91/u/c/i/v;->m0:Z

    invoke-interface {v0, v1}, Lcom/tv91/u/c/d$a;->a(Z)V

    return-void
.end method

.method private synthetic L2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/d$a;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/tv91/u/c/i/v;->m0:Z

    invoke-interface {v0, v1}, Lcom/tv91/u/c/d$a;->a(Z)V

    return-void
.end method

.method private synthetic N2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/d$a;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/tv91/u/c/i/v;->m0:Z

    invoke-interface {v0, v1}, Lcom/tv91/u/c/d$a;->a(Z)V

    return-void
.end method

.method private synthetic P2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->j0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    return-void
.end method

.method private synthetic R2(Lcom/tv91/model/Movie;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->j0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/u/c/f/y1$a;

    iget v2, p1, Lcom/tv91/model/Movie;->id:I

    iget p1, p1, Lcom/tv91/model/Movie;->sourceId:I

    invoke-direct {v1, v2, p1}, Lcom/tv91/u/c/f/y1$a;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private r2(Lcom/tv91/model/Paging;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tv91/model/Paging<",
            "Lcom/tv91/model/Movie;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/tv91/u/c/i/v;->l0:I

    iget v1, p1, Lcom/tv91/model/Paging;->pageCount:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/tv91/u/c/i/v;->n0:Z

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->k0:Ljava/util/List;

    invoke-virtual {p1}, Lcom/tv91/model/Paging;->getMovies()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 3
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/d$a;

    invoke-virtual {p1}, Lcom/tv91/model/Paging;->getMovies()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/u/c/d$a;->T(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic s2(Lcom/tv91/u/c/i/v;Lcom/tv91/model/Paging;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/i/v;->r2(Lcom/tv91/model/Paging;)V

    return-void
.end method

.method private synthetic t2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/d$a;

    invoke-virtual {p1}, Lcom/tv91/s/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/q/a/f;->g0(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic v2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/d$a;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/tv91/u/c/i/v;->m0:Z

    invoke-interface {v0, v1}, Lcom/tv91/u/c/d$a;->a(Z)V

    return-void
.end method

.method private synthetic x2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/d$a;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/tv91/u/c/i/v;->m0:Z

    invoke-interface {v0, v1}, Lcom/tv91/u/c/d$a;->a(Z)V

    return-void
.end method

.method private synthetic z2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/d$a;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/tv91/u/c/i/v;->m0:Z

    invoke-interface {v0, v1}, Lcom/tv91/u/c/d$a;->a(Z)V

    return-void
.end method


# virtual methods
.method public synthetic A2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/i/v;->z2()V

    return-void
.end method

.method public synthetic C2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/i/v;->B2()V

    return-void
.end method

.method public synthetic E2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/i/v;->D2()V

    return-void
.end method

.method public synthetic G2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/i/v;->F2()V

    return-void
.end method

.method public synthetic I2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/i/v;->H2()V

    return-void
.end method

.method public J0(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->J0(Landroid/os/Bundle;)V

    .line 2
    new-instance p1, Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p0}, Lcom/tv91/u/c/i/v;->Z2()Lb/b/a/c/a;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object p1, p0, Lcom/tv91/u/c/i/v;->i0:Lcom/tv91/features/shared/ViewSupplier;

    .line 3
    invoke-static {p0}, Lcom/tv91/x/h;->b(Landroidx/fragment/app/Fragment;)Lcom/tv91/x/h;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/c/i/v;->j0:Lcom/tv91/x/h;

    return-void
.end method

.method public synthetic K2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/i/v;->J2()V

    return-void
.end method

.method public synthetic M2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/i/v;->L2()V

    return-void
.end method

.method public synthetic O2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/i/v;->N2()V

    return-void
.end method

.method public synthetic Q2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/i/v;->P2()V

    return-void
.end method

.method public synthetic S2(Lcom/tv91/model/Movie;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/i/v;->R2(Lcom/tv91/model/Movie;)V

    return-void
.end method

.method protected abstract T2()V
.end method

.method public U2(II)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/tv91/u/c/i/v;->m0:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/tv91/u/c/i/v;->n0:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->h0:Lcom/tv91/u/c/k/t;

    new-instance v1, Lcom/tv91/u/c/i/e;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/i/e;-><init>(Lcom/tv91/u/c/i/v;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->A(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/i/k;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/i/k;-><init>(Lcom/tv91/u/c/i/v;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->z(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/i/i;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/i/i;-><init>(Lcom/tv91/u/c/i/v;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->B(Lb/g/j/a;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/i/a;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/i/a;-><init>(Lcom/tv91/u/c/i/v;)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->y(Lb/g/j/a;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    sget-object v1, Lcom/tv91/u/c/k/t$a;->e:Lcom/tv91/u/c/k/t$a;

    iget v2, p0, Lcom/tv91/u/c/i/v;->l0:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/tv91/u/c/i/v;->l0:I

    .line 6
    invoke-virtual {v0, v1, p1, v2, p2}, Lcom/tv91/u/c/k/t;->r(Lcom/tv91/u/c/k/t$a;III)V

    :cond_1
    :goto_0
    return-void
.end method

.method public V2(II)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/tv91/u/c/i/v;->m0:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/tv91/u/c/i/v;->n0:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->h0:Lcom/tv91/u/c/k/t;

    new-instance v1, Lcom/tv91/u/c/i/j;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/i/j;-><init>(Lcom/tv91/u/c/i/v;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->A(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/i/g;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/i/g;-><init>(Lcom/tv91/u/c/i/v;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->z(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/i/i;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/i/i;-><init>(Lcom/tv91/u/c/i/v;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->B(Lb/g/j/a;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/i/a;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/i/a;-><init>(Lcom/tv91/u/c/i/v;)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->y(Lb/g/j/a;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    sget-object v1, Lcom/tv91/u/c/k/t$a;->b:Lcom/tv91/u/c/k/t$a;

    iget v2, p0, Lcom/tv91/u/c/i/v;->l0:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/tv91/u/c/i/v;->l0:I

    .line 6
    invoke-virtual {v0, v1, p1, v2, p2}, Lcom/tv91/u/c/k/t;->r(Lcom/tv91/u/c/k/t$a;III)V

    :cond_1
    :goto_0
    return-void
.end method

.method public W2(II)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/tv91/u/c/i/v;->m0:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/tv91/u/c/i/v;->n0:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->h0:Lcom/tv91/u/c/k/t;

    new-instance v1, Lcom/tv91/u/c/i/c;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/i/c;-><init>(Lcom/tv91/u/c/i/v;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->A(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/i/b;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/i/b;-><init>(Lcom/tv91/u/c/i/v;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->z(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/i/i;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/i/i;-><init>(Lcom/tv91/u/c/i/v;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->B(Lb/g/j/a;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/i/a;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/i/a;-><init>(Lcom/tv91/u/c/i/v;)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->y(Lb/g/j/a;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    sget-object v1, Lcom/tv91/u/c/k/t$a;->a:Lcom/tv91/u/c/k/t$a;

    iget v2, p0, Lcom/tv91/u/c/i/v;->l0:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/tv91/u/c/i/v;->l0:I

    .line 6
    invoke-virtual {v0, v1, p1, v2, p2}, Lcom/tv91/u/c/k/t;->r(Lcom/tv91/u/c/k/t$a;III)V

    :cond_1
    :goto_0
    return-void
.end method

.method public X2(Lcom/tv91/model/c;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/tv91/u/c/i/v;->m0:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/tv91/u/c/i/v;->k0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->h0:Lcom/tv91/u/c/k/t;

    new-instance v1, Lcom/tv91/u/c/i/h;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/i/h;-><init>(Lcom/tv91/u/c/i/v;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->A(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/i/d;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/i/d;-><init>(Lcom/tv91/u/c/i/v;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->z(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/i/i;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/i/i;-><init>(Lcom/tv91/u/c/i/v;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->B(Lb/g/j/a;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/i/a;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/i/a;-><init>(Lcom/tv91/u/c/i/v;)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->y(Lb/g/j/a;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    .line 6
    invoke-virtual {v0, p1}, Lcom/tv91/u/c/k/t;->s(Lcom/tv91/model/c;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public Y2(II)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/tv91/u/c/i/v;->m0:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/tv91/u/c/i/v;->n0:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->h0:Lcom/tv91/u/c/k/t;

    new-instance v1, Lcom/tv91/u/c/i/f;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/i/f;-><init>(Lcom/tv91/u/c/i/v;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->A(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/i/n;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/i/n;-><init>(Lcom/tv91/u/c/i/v;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->z(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/i/i;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/i/i;-><init>(Lcom/tv91/u/c/i/v;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->B(Lb/g/j/a;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/i/a;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/i/a;-><init>(Lcom/tv91/u/c/i/v;)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/t;->y(Lb/g/j/a;)Lcom/tv91/u/c/k/t;

    move-result-object v0

    sget-object v1, Lcom/tv91/u/c/k/t$a;->g:Lcom/tv91/u/c/k/t$a;

    iget v2, p0, Lcom/tv91/u/c/i/v;->l0:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/tv91/u/c/i/v;->l0:I

    .line 6
    invoke-virtual {v0, v1, p1, v2, p2}, Lcom/tv91/u/c/k/t;->r(Lcom/tv91/u/c/k/t$a;III)V

    :cond_1
    :goto_0
    return-void
.end method

.method protected abstract Z2()Lb/b/a/c/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb/b/a/c/a<",
            "Landroid/view/View;",
            "Lcom/tv91/u/c/d$a;",
            ">;"
        }
    .end annotation
.end method

.method public g1()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/d$a;

    new-instance v1, Lcom/tv91/u/c/i/l;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/i/l;-><init>(Lcom/tv91/u/c/i/v;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/d$a;->b(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/d$a;

    new-instance v1, Lcom/tv91/u/c/i/o;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/i/o;-><init>(Lcom/tv91/u/c/i/v;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/d$a;->e(Lb/g/j/a;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/d$a;

    new-instance v1, Lcom/tv91/u/c/i/u;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/i/u;-><init>(Lcom/tv91/u/c/i/v;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/d$a;->c(Ljava/lang/Runnable;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->k0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {p0}, Lcom/tv91/u/c/i/v;->T2()V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/d$a;

    iget-object v1, p0, Lcom/tv91/u/c/i/v;->k0:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/tv91/u/c/d$a;->T(Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/i/v;->h0:Lcom/tv91/u/c/k/t;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method public q2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/c/i/m;

    invoke-direct {v0, p0}, Lcom/tv91/u/c/i/m;-><init>(Lcom/tv91/u/c/i/v;)V

    invoke-static {v0}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic u2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/i/v;->t2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic w2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/i/v;->v2()V

    return-void
.end method

.method public synthetic y2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/c/i/v;->x2()V

    return-void
.end method
