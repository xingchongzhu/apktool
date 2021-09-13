.class public final Lcom/tv91/features/authentication/m/n;
.super Lcom/tv91/features/authentication/m/r;
.source "ChangePasswordFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/features/authentication/m/n$a;
    }
.end annotation


# instance fields
.field h0:Lcom/tv91/features/authentication/q/a0;

.field i0:Lcom/tv91/features/authentication/q/y;

.field private final j0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/features/authentication/c;",
            ">;"
        }
    .end annotation
.end field

.field private k0:Lcom/tv91/x/h;


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f0d00a4

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/features/authentication/m/r;-><init>(I)V

    .line 2
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    sget-object v1, Lcom/tv91/features/authentication/m/f;->a:Lcom/tv91/features/authentication/m/f;

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/features/authentication/m/n;->j0:Lcom/tv91/features/shared/ViewSupplier;

    return-void
.end method

.method static synthetic B2(Landroid/view/View;)Lcom/tv91/features/authentication/c;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/features/authentication/m/q;

    invoke-static {p0}, Lcom/tv91/r/b0;->b(Landroid/view/View;)Lcom/tv91/r/b0;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/tv91/features/authentication/m/q;-><init>(Lcom/tv91/r/b0;)V

    return-object v0
.end method

.method private synthetic C2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/m/n;->k0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic E2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/m/n;->k0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    return-void
.end method

.method private synthetic r2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/m/n;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/c;

    invoke-virtual {p1}, Lcom/tv91/s/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/q/a/f;->g0(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic t2(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/m/n;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/c;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->i0(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/features/authentication/c;->g(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic v2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->M1()Landroidx/fragment/app/e;

    move-result-object p1

    new-instance v0, Lcom/tv91/features/authentication/m/g;

    invoke-direct {v0, p0}, Lcom/tv91/features/authentication/m/g;-><init>(Lcom/tv91/features/authentication/m/n;)V

    invoke-static {p1, v0}, Lcom/tv91/features/shared/widget/e;->b(Landroid/content/Context;Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic x2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/m/n;->k0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/m/n;->k0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    return-void
.end method

.method private synthetic z2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/m/n;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/c;

    new-instance v1, Lcom/tv91/features/authentication/m/k;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/m/k;-><init>(Lcom/tv91/features/authentication/m/n;)V

    invoke-interface {v0, v1}, Lcom/tv91/features/authentication/c;->R0(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public synthetic A2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/m/n;->z2()V

    return-void
.end method

.method public synthetic D2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/m/n;->C2()V

    return-void
.end method

.method public synthetic F2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/m/n;->E2()V

    return-void
.end method

.method public G2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/m/n;->i0:Lcom/tv91/features/authentication/q/y;

    new-instance v1, Lcom/tv91/features/authentication/m/c;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/m/c;-><init>(Lcom/tv91/features/authentication/m/n;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/y;->u(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/y;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/tv91/features/authentication/q/y;->o()V

    return-void
.end method

.method public H2(Lcom/tv91/features/authentication/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/m/n;->h0:Lcom/tv91/features/authentication/q/a0;

    new-instance v1, Lcom/tv91/features/authentication/m/d;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/m/d;-><init>(Lcom/tv91/features/authentication/m/n;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/a0;->v(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/a0;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/m/m;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/m/m;-><init>(Lcom/tv91/features/authentication/m/n;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/a0;->u(Lb/g/j/a;)Lcom/tv91/features/authentication/q/a0;

    move-result-object v0

    iget-object v1, p1, Lcom/tv91/features/authentication/b;->a:Ljava/lang/String;

    iget-object p1, p1, Lcom/tv91/features/authentication/b;->b:Ljava/lang/String;

    .line 4
    invoke-virtual {v0, v1, p1}, Lcom/tv91/features/authentication/q/a0;->o(Ljava/lang/String;Ljava/lang/String;)V

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

    iput-object p1, p0, Lcom/tv91/features/authentication/m/n;->k0:Lcom/tv91/x/h;

    return-void
.end method

.method public g1()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/m/n;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/c;

    new-instance v1, Lcom/tv91/features/authentication/m/b;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/m/b;-><init>(Lcom/tv91/features/authentication/m/n;)V

    invoke-interface {v0, v1}, Lcom/tv91/features/authentication/c;->b(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/m/n;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/c;

    new-instance v1, Lcom/tv91/features/authentication/m/l;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/m/l;-><init>(Lcom/tv91/features/authentication/m/n;)V

    invoke-interface {v0, v1}, Lcom/tv91/features/authentication/c;->C1(Lb/g/j/a;)V

    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/m/n;->h0:Lcom/tv91/features/authentication/q/a0;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/m/n;->i0:Lcom/tv91/features/authentication/q/y;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method public q2(Lcom/tv91/s/c;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/features/authentication/m/a;

    invoke-direct {v0, p0}, Lcom/tv91/features/authentication/m/a;-><init>(Lcom/tv91/features/authentication/m/n;)V

    invoke-static {v0}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/m/e;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/m/e;-><init>(Lcom/tv91/features/authentication/m/n;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/q/a/g;->e(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/m/h;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/m/h;-><init>(Lcom/tv91/features/authentication/m/n;)V

    const-string v2, "0000001"

    .line 3
    invoke-virtual {v0, v2, v1}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic s2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/m/n;->r2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic u2(Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/m/n;->t2(Ljava/lang/Integer;)V

    return-void
.end method

.method public synthetic w2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/m/n;->v2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic y2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/m/n;->x2()V

    return-void
.end method
