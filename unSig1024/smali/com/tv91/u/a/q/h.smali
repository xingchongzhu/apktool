.class public final Lcom/tv91/u/a/q/h;
.super Lcom/tv91/u/a/q/g;
.source "PromotionFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/a/q/h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/u/a/d<",
        "Lcom/tv91/u/a/l;",
        ">;"
    }
.end annotation


# instance fields
.field k0:Lcom/tv91/y/h;

.field l0:Lcom/tv91/u/e/j/n;

.field private final m0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/a/l;",
            ">;"
        }
    .end annotation
.end field

.field private n0:Lcom/tv91/x/h;

.field private o0:Z

.field private p0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tv91/model/Promotion;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f0d00b3

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/u/a/q/g;-><init>(I)V

    .line 2
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    sget-object v1, Lcom/tv91/u/a/q/f;->a:Lcom/tv91/u/a/q/f;

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/u/a/q/h;->m0:Lcom/tv91/features/shared/ViewSupplier;

    return-void
.end method

.method private synthetic B2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/q/h;->n0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/u/c/j/n$a;

    invoke-direct {v1}, Lcom/tv91/u/c/j/n$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic D2(Lcom/tv91/model/Promotion;)V
    .locals 2

    .line 1
    iget v0, p1, Lcom/tv91/model/Promotion;->type:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 2
    iget-object p1, p0, Lcom/tv91/u/a/q/h;->n0:Lcom/tv91/x/h;

    iget-boolean v0, p0, Lcom/tv91/u/a/q/h;->o0:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/tv91/u/e/g/x$c;

    invoke-direct {v0}, Lcom/tv91/u/e/g/x$c;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v0}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    :goto_0
    invoke-virtual {p1, v0}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    goto :goto_1

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/tv91/u/a/q/h;->n0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/x/b;

    iget-object p1, p1, Lcom/tv91/model/Promotion;->url:Ljava/lang/String;

    invoke-direct {v1, p1}, Lcom/tv91/x/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    :goto_1
    return-void
.end method

.method private synthetic u2(Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/q/h;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/l;

    iput-object p1, p0, Lcom/tv91/u/a/q/h;->p0:Ljava/util/List;

    invoke-interface {v0, p1}, Lcom/tv91/u/a/l;->P1(Ljava/util/List;)V

    return-void
.end method

.method private synthetic w2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/tv91/s/c;->c()Ljava/lang/Exception;

    move-result-object v0

    invoke-static {v0}, Lh/a/a;->c(Ljava/lang/Throwable;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/q/h;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/l;

    invoke-virtual {p1}, Lcom/tv91/s/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/q/a/f;->g0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic y2(Landroid/view/View;)Lcom/tv91/u/a/l;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/a/q/k;

    invoke-static {p0}, Lcom/tv91/r/p0;->b(Landroid/view/View;)Lcom/tv91/r/p0;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/tv91/u/a/q/k;-><init>(Lcom/tv91/r/p0;)V

    return-object v0
.end method

.method private synthetic z2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/q/h;->n0:Lcom/tv91/x/h;

    iget-boolean v1, p0, Lcom/tv91/u/a/q/h;->o0:Z

    if-eqz v1, :cond_0

    new-instance v1, Lcom/tv91/u/h/i/y$a;

    invoke-direct {v1}, Lcom/tv91/u/h/i/y$a;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    :goto_0
    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method


# virtual methods
.method public synthetic A2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/a/q/h;->z2()V

    return-void
.end method

.method public synthetic C2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/a/q/h;->B2()V

    return-void
.end method

.method public synthetic E2(Lcom/tv91/model/Promotion;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/a/q/h;->D2(Lcom/tv91/model/Promotion;)V

    return-void
.end method

.method public F2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/q/h;->l0:Lcom/tv91/u/e/j/n;

    new-instance v1, Lcom/tv91/u/a/q/e;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/q/e;-><init>(Lcom/tv91/u/a/q/h;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/e/j/n;->v(Lb/g/j/a;)Lcom/tv91/u/e/j/n;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/a/q/b;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/q/b;-><init>(Lcom/tv91/u/a/q/h;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/e/j/n;->u(Lb/g/j/a;)Lcom/tv91/u/e/j/n;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/tv91/u/e/j/n;->o()V

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

    iput-object p1, p0, Lcom/tv91/u/a/q/h;->n0:Lcom/tv91/x/h;

    .line 4
    iget-object p1, p0, Lcom/tv91/u/a/q/h;->k0:Lcom/tv91/y/h;

    invoke-interface {p1}, Lcom/tv91/y/h;->e()Lcom/tv91/model/User;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/tv91/u/a/q/h;->o0:Z

    return-void
.end method

.method public g1()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/tv91/u/a/d;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/q/h;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/l;

    new-instance v1, Lcom/tv91/u/a/q/c;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/q/c;-><init>(Lcom/tv91/u/a/q/h;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/a/l;->i(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/a/q/h;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/l;

    new-instance v1, Lcom/tv91/u/a/q/d;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/q/d;-><init>(Lcom/tv91/u/a/q/h;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/a/l;->h(Ljava/lang/Runnable;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/a/q/h;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/l;

    new-instance v1, Lcom/tv91/u/a/q/a;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/q/a;-><init>(Lcom/tv91/u/a/q/h;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/a/l;->D1(Lb/g/j/a;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/a/q/h;->p0:Ljava/util/List;

    if-nez v0, :cond_0

    .line 6
    invoke-virtual {p0}, Lcom/tv91/u/a/q/h;->F2()V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/a/q/h;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/l;

    iget-object v1, p0, Lcom/tv91/u/a/q/h;->p0:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/tv91/u/a/l;->P1(Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/q/h;->l0:Lcom/tv91/u/e/j/n;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method protected n2()Lcom/tv91/u/a/h;
    .locals 1

    .line 1
    sget-object v0, Lcom/tv91/u/a/h;->d:Lcom/tv91/u/a/h;

    return-object v0
.end method

.method protected o2()Lcom/tv91/features/shared/ViewSupplier;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/a/l;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/q/h;->m0:Lcom/tv91/features/shared/ViewSupplier;

    return-object v0
.end method

.method public synthetic v2(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/a/q/h;->u2(Ljava/util/List;)V

    return-void
.end method

.method public synthetic x2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/a/q/h;->w2(Lcom/tv91/s/c;)V

    return-void
.end method
