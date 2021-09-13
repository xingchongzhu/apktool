.class public final Lcom/tv91/u/e/i/p;
.super Lcom/tv91/u/e/i/m;
.source "PromotionStatementFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/e/i/p$a;
    }
.end annotation


# instance fields
.field h0:Lcom/tv91/u/e/j/l;

.field private final i0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/e/d;",
            ">;"
        }
    .end annotation
.end field

.field private j0:Lcom/tv91/x/h;


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f0d00b5

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/u/e/i/m;-><init>(I)V

    .line 2
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    new-instance v1, Lcom/tv91/u/e/i/j;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/i/j;-><init>(Lcom/tv91/u/e/i/p;)V

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/u/e/i/p;->i0:Lcom/tv91/features/shared/ViewSupplier;

    return-void
.end method

.method private synthetic B2(Landroid/view/View;)Lcom/tv91/u/e/d;
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/u/e/i/t;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->H()Landroidx/fragment/app/n;

    move-result-object v1

    invoke-static {p1}, Lcom/tv91/r/r0;->b(Landroid/view/View;)Lcom/tv91/r/r0;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/tv91/u/e/i/t;-><init>(Landroidx/fragment/app/n;Lcom/tv91/r/r0;)V

    return-object v0
.end method

.method private synthetic D2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/i/p;->j0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic F2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/i/p;->j0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    return-void
.end method

.method private synthetic r2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/i/p;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/d;

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

    new-instance v0, Lcom/tv91/u/e/i/d;

    invoke-direct {v0, p0}, Lcom/tv91/u/e/i/d;-><init>(Lcom/tv91/u/e/i/p;)V

    invoke-static {p1, v0}, Lcom/tv91/features/shared/widget/e;->b(Landroid/content/Context;Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic v2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/i/p;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/d;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/e/d;->a(Z)V

    return-void
.end method

.method private synthetic x2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/i/p;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/d;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/e/d;->a(Z)V

    return-void
.end method

.method private synthetic z2(Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/i/p;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/d;

    invoke-interface {v0, p1}, Lcom/tv91/u/e/d;->T0(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public synthetic A2(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/e/i/p;->z2(Ljava/util/List;)V

    return-void
.end method

.method public synthetic C2(Landroid/view/View;)Lcom/tv91/u/e/d;
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/e/i/p;->B2(Landroid/view/View;)Lcom/tv91/u/e/d;

    move-result-object p1

    return-object p1
.end method

.method public synthetic E2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/e/i/p;->D2()V

    return-void
.end method

.method public synthetic G2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/e/i/p;->F2()V

    return-void
.end method

.method public H2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/i/p;->h0:Lcom/tv91/u/e/j/l;

    new-instance v1, Lcom/tv91/u/e/i/h;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/i/h;-><init>(Lcom/tv91/u/e/i/p;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/e/j/l;->w(Ljava/lang/Runnable;)Lcom/tv91/u/e/j/l;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/e/i/e;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/i/e;-><init>(Lcom/tv91/u/e/i/p;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/e/j/l;->v(Ljava/lang/Runnable;)Lcom/tv91/u/e/j/l;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/e/i/i;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/i/i;-><init>(Lcom/tv91/u/e/i/p;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/e/j/l;->x(Lb/g/j/a;)Lcom/tv91/u/e/j/l;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/e/i/a;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/i/a;-><init>(Lcom/tv91/u/e/i/p;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/e/j/l;->u(Lb/g/j/a;)Lcom/tv91/u/e/j/l;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/tv91/u/e/j/l;->o()V

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

    iput-object p1, p0, Lcom/tv91/u/e/i/p;->j0:Lcom/tv91/x/h;

    return-void
.end method

.method public g1()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/e/i/p;->i0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/d;

    new-instance v1, Lcom/tv91/u/e/i/g;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/i/g;-><init>(Lcom/tv91/u/e/i/p;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/e/d;->b(Ljava/lang/Runnable;)V

    .line 3
    invoke-virtual {p0}, Lcom/tv91/u/e/i/p;->H2()V

    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/e/i/p;->h0:Lcom/tv91/u/e/j/l;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method public q2(Lcom/tv91/s/c;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/u/e/i/f;

    invoke-direct {v0, p0}, Lcom/tv91/u/e/i/f;-><init>(Lcom/tv91/u/e/i/p;)V

    invoke-static {v0}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/e/i/k;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/i/k;-><init>(Lcom/tv91/u/e/i/p;)V

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

    invoke-direct {p0, p1}, Lcom/tv91/u/e/i/p;->r2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic u2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/e/i/p;->t2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic w2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/e/i/p;->v2()V

    return-void
.end method

.method public synthetic y2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/e/i/p;->x2()V

    return-void
.end method
