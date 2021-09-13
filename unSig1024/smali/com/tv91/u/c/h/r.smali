.class public final Lcom/tv91/u/c/h/r;
.super Lcom/tv91/u/c/h/v;
.source "HighlightFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/c/h/r$a;
    }
.end annotation


# instance fields
.field h0:Lcom/tv91/u/c/k/q;

.field private final i0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/c/b;",
            ">;"
        }
    .end annotation
.end field

.field private j0:Lcom/tv91/x/h;

.field private k0:Lcom/tv91/model/Highlight;


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f0d004f

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/u/c/h/v;-><init>(I)V

    .line 2
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    sget-object v1, Lcom/tv91/u/c/h/d;->a:Lcom/tv91/u/c/h/d;

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/u/c/h/r;->i0:Lcom/tv91/features/shared/ViewSupplier;

    return-void
.end method

.method private C2(Lcom/tv91/model/Highlight;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lcom/tv91/u/c/h/r;->k0:Lcom/tv91/model/Highlight;

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/h/r;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/b;

    iget-object v1, p1, Lcom/tv91/model/Highlight;->advertise:Lcom/tv91/model/Highlight$Advertise;

    invoke-interface {v0, v1}, Lcom/tv91/u/c/b;->S(Lcom/tv91/model/Highlight$Advertise;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/c/h/r;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/b;

    iget-object v1, p1, Lcom/tv91/model/Highlight;->rankingTop:Lcom/tv91/model/Highlight$Ranking;

    iget-object v2, p1, Lcom/tv91/model/Highlight;->rankingMonth:Lcom/tv91/model/Highlight$Ranking;

    iget-object v3, p1, Lcom/tv91/model/Highlight;->rankingYear:Lcom/tv91/model/Highlight$Ranking;

    invoke-interface {v0, v1, v2, v3}, Lcom/tv91/u/c/b;->i1(Lcom/tv91/model/Highlight$Ranking;Lcom/tv91/model/Highlight$Ranking;Lcom/tv91/model/Highlight$Ranking;)V

    .line 4
    iget-object v0, p1, Lcom/tv91/model/Highlight;->groups:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/model/Highlight$MovieGroup;

    .line 5
    iget-object v2, v1, Lcom/tv91/model/Highlight$MovieGroup;->movies:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 6
    iget-object v2, p0, Lcom/tv91/u/c/h/r;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v2}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v2

    check-cast v2, Lcom/tv91/u/c/b;

    invoke-interface {v2, v1}, Lcom/tv91/u/c/b;->N(Lcom/tv91/model/Highlight$MovieGroup;)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/tv91/u/c/h/r;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/b;

    iget-object v1, p1, Lcom/tv91/model/Highlight;->web:Lcom/tv91/model/Highlight$Web;

    invoke-interface {v0, v1}, Lcom/tv91/u/c/b;->r(Lcom/tv91/model/Highlight$Web;)V

    .line 8
    iget-object v0, p0, Lcom/tv91/u/c/h/r;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/b;

    iget-object p1, p1, Lcom/tv91/model/Highlight;->recommend:Lcom/tv91/model/Highlight$Recommend;

    invoke-interface {v0, p1}, Lcom/tv91/u/c/b;->y(Lcom/tv91/model/Highlight$Recommend;)V

    return-void
.end method

.method public static synthetic r2(Lcom/tv91/u/c/h/r;Lcom/tv91/model/Highlight;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/h/r;->C2(Lcom/tv91/model/Highlight;)V

    return-void
.end method

.method private synthetic s2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/h/r;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/b;

    invoke-virtual {p1}, Lcom/tv91/s/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/q/a/f;->g0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic u2(Landroid/view/View;)Lcom/tv91/u/c/b;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/c/h/u;

    invoke-static {p0}, Lcom/tv91/r/t;->b(Landroid/view/View;)Lcom/tv91/r/t;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/tv91/u/c/h/u;-><init>(Lcom/tv91/r/t;)V

    return-object v0
.end method

.method private synthetic v2(Lcom/tv91/model/ExternalSource;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lcom/tv91/model/ExternalSource;->url:Ljava/lang/String;

    invoke-static {v0}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/h/r;->j0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/x/b;

    iget-object p1, p1, Lcom/tv91/model/ExternalSource;->url:Ljava/lang/String;

    invoke-direct {v1, p1}, Lcom/tv91/x/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    :cond_0
    return-void
.end method

.method private synthetic x2(Lcom/tv91/model/Highlight$MovieGroup;)V
    .locals 4

    .line 1
    iget-boolean v0, p1, Lcom/tv91/model/Highlight$MovieGroup;->hasMore:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/h/r;->j0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/u/c/i/d0$a;

    new-instance v2, Lcom/tv91/model/Category;

    iget v3, p1, Lcom/tv91/model/Highlight$MovieGroup;->id:I

    iget-object p1, p1, Lcom/tv91/model/Highlight$MovieGroup;->title:Ljava/lang/String;

    invoke-direct {v2, v3, p1}, Lcom/tv91/model/Category;-><init>(ILjava/lang/String;)V

    invoke-direct {v1, v2}, Lcom/tv91/u/c/i/d0$a;-><init>(Lcom/tv91/model/Category;)V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    :cond_0
    return-void
.end method

.method private synthetic z2(Lcom/tv91/model/Movie;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/h/r;->j0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/u/c/f/y1$a;

    iget v2, p1, Lcom/tv91/model/Movie;->id:I

    iget p1, p1, Lcom/tv91/model/Movie;->sourceId:I

    invoke-direct {v1, v2, p1}, Lcom/tv91/u/c/f/y1$a;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method


# virtual methods
.method public synthetic A2(Lcom/tv91/model/Movie;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/h/r;->z2(Lcom/tv91/model/Movie;)V

    return-void
.end method

.method public B2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/h/r;->k0:Lcom/tv91/model/Highlight;

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0, v0}, Lcom/tv91/u/c/h/r;->C2(Lcom/tv91/model/Highlight;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/c/h/r;->h0:Lcom/tv91/u/c/k/q;

    new-instance v1, Lcom/tv91/u/c/h/f;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/h/f;-><init>(Lcom/tv91/u/c/h/r;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/q;->v(Lb/g/j/a;)Lcom/tv91/u/c/k/q;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/h/a;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/h/a;-><init>(Lcom/tv91/u/c/h/r;)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/q;->u(Lb/g/j/a;)Lcom/tv91/u/c/k/q;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Lcom/tv91/u/c/k/q;->o()V

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

    iput-object p1, p0, Lcom/tv91/u/c/h/r;->j0:Lcom/tv91/x/h;

    return-void
.end method

.method public g1()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/h/r;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/b;

    new-instance v1, Lcom/tv91/u/c/h/g;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/h/g;-><init>(Lcom/tv91/u/c/h/r;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/b;->b2(Lb/g/j/a;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/c/h/r;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/b;

    new-instance v1, Lcom/tv91/u/c/h/c;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/h/c;-><init>(Lcom/tv91/u/c/h/r;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/b;->o0(Lb/g/j/a;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/c/h/r;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/c/b;

    new-instance v1, Lcom/tv91/u/c/h/b;

    invoke-direct {v1, p0}, Lcom/tv91/u/c/h/b;-><init>(Lcom/tv91/u/c/h/r;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/c/b;->e(Lb/g/j/a;)V

    .line 5
    invoke-virtual {p0}, Lcom/tv91/u/c/h/r;->B2()V

    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/h/r;->h0:Lcom/tv91/u/c/k/q;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method public q2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/c/h/e;

    invoke-direct {v0, p0}, Lcom/tv91/u/c/h/e;-><init>(Lcom/tv91/u/c/h/r;)V

    invoke-static {v0}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic t2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/h/r;->s2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic w2(Lcom/tv91/model/ExternalSource;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/h/r;->v2(Lcom/tv91/model/ExternalSource;)V

    return-void
.end method

.method public synthetic y2(Lcom/tv91/model/Highlight$MovieGroup;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/h/r;->x2(Lcom/tv91/model/Highlight$MovieGroup;)V

    return-void
.end method
