.class public final Lcom/tv91/features/authentication/p/v;
.super Lcom/tv91/features/authentication/p/z;
.source "ForgetPasswordFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/features/authentication/p/v$a;
    }
.end annotation


# instance fields
.field h0:Lcom/tv91/features/authentication/q/e0;

.field i0:Lcom/tv91/features/authentication/q/d0;

.field private final j0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/features/authentication/e;",
            ">;"
        }
    .end annotation
.end field

.field private k0:Lcom/tv91/x/h;

.field private l0:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f0d00ab

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/features/authentication/p/z;-><init>(I)V

    .line 2
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    sget-object v1, Lcom/tv91/features/authentication/p/l;->a:Lcom/tv91/features/authentication/p/l;

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/features/authentication/p/v;->j0:Lcom/tv91/features/shared/ViewSupplier;

    return-void
.end method

.method private synthetic A2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/p/v;->k0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    return-void
.end method

.method private synthetic C2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/p/v;->k0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    return-void
.end method

.method private synthetic E2(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tv91/features/authentication/p/v;->V2(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic G2(Lcom/tv91/features/authentication/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/p/v;->l0:Ljava/lang/String;

    invoke-virtual {p0, v0, p1}, Lcom/tv91/features/authentication/p/v;->U2(Ljava/lang/String;Lcom/tv91/features/authentication/d;)V

    return-void
.end method

.method private synthetic I2(Lcom/tv91/s/c;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/tv91/features/authentication/p/v;->q2(Lcom/tv91/s/c;Z)V

    return-void
.end method

.method private synthetic K2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/p/v;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/e;

    invoke-interface {v0}, Lcom/tv91/features/authentication/e;->x()V

    return-void
.end method

.method private synthetic M2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/p/v;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/e;

    new-instance v1, Lcom/tv91/features/authentication/p/n;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/p/n;-><init>(Lcom/tv91/features/authentication/p/v;)V

    invoke-interface {v0, v1}, Lcom/tv91/features/authentication/e;->s(Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic O2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/p/v;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/e;

    invoke-interface {v0}, Lcom/tv91/features/authentication/e;->z0()V

    return-void
.end method

.method private synthetic Q2(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/features/authentication/p/v;->l0:Ljava/lang/String;

    .line 2
    iget-object p1, p0, Lcom/tv91/features/authentication/p/v;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p1}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p1

    check-cast p1, Lcom/tv91/features/authentication/e;

    invoke-interface {p1}, Lcom/tv91/features/authentication/e;->p0()V

    return-void
.end method

.method private synthetic S2(Lcom/tv91/s/c;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/tv91/features/authentication/p/v;->q2(Lcom/tv91/s/c;Z)V

    return-void
.end method

.method private synthetic r2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/p/v;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/e;

    invoke-virtual {p1}, Lcom/tv91/s/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/features/authentication/e;->Q(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic t2(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/p/v;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/e;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->i0(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/features/authentication/e;->e2(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic v2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/p/v;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/e;

    invoke-virtual {p1}, Lcom/tv91/s/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/features/authentication/e;->k1(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic x2(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/p/v;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/e;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->i0(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/features/authentication/e;->j1(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic z2(Landroid/view/View;)Lcom/tv91/features/authentication/e;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/features/authentication/p/y;

    invoke-static {p0}, Lcom/tv91/r/i0;->b(Landroid/view/View;)Lcom/tv91/r/i0;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/tv91/features/authentication/p/y;-><init>(Lcom/tv91/r/i0;)V

    return-object v0
.end method


# virtual methods
.method public synthetic B2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/p/v;->A2()V

    return-void
.end method

.method public synthetic D2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/p/v;->C2()V

    return-void
.end method

.method public synthetic F2(Ljava/lang/CharSequence;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/p/v;->E2(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public synthetic H2(Lcom/tv91/features/authentication/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/p/v;->G2(Lcom/tv91/features/authentication/d;)V

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

    iput-object p1, p0, Lcom/tv91/features/authentication/p/v;->k0:Lcom/tv91/x/h;

    return-void
.end method

.method public synthetic J2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/p/v;->I2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic L2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/p/v;->K2()V

    return-void
.end method

.method public synthetic N2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/p/v;->M2()V

    return-void
.end method

.method public synthetic P2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/p/v;->O2()V

    return-void
.end method

.method public synthetic R2(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/p/v;->Q2(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic T2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/p/v;->S2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public U2(Ljava/lang/String;Lcom/tv91/features/authentication/d;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/p/v;->i0:Lcom/tv91/features/authentication/q/d0;

    new-instance v1, Lcom/tv91/features/authentication/p/a;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/p/a;-><init>(Lcom/tv91/features/authentication/p/v;)V

    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/d0;->v(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/d0;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/p/h;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/p/h;-><init>(Lcom/tv91/features/authentication/p/v;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/d0;->w(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/d0;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/p/d;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/p/d;-><init>(Lcom/tv91/features/authentication/p/v;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/d0;->u(Lb/g/j/a;)Lcom/tv91/features/authentication/q/d0;

    move-result-object v0

    iget-object v1, p2, Lcom/tv91/features/authentication/d;->a:Ljava/lang/String;

    iget-object v2, p2, Lcom/tv91/features/authentication/d;->b:Ljava/lang/String;

    iget-object p2, p2, Lcom/tv91/features/authentication/d;->c:Ljava/lang/String;

    .line 4
    invoke-virtual {v0, p1, v1, v2, p2}, Lcom/tv91/features/authentication/q/d0;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public V2(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/p/v;->h0:Lcom/tv91/features/authentication/q/e0;

    new-instance v1, Lcom/tv91/features/authentication/p/k;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/p/k;-><init>(Lcom/tv91/features/authentication/p/v;)V

    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/e0;->v(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/e0;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/p/o;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/p/o;-><init>(Lcom/tv91/features/authentication/p/v;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/e0;->w(Lb/g/j/a;)Lcom/tv91/features/authentication/q/e0;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/p/j;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/p/j;-><init>(Lcom/tv91/features/authentication/p/v;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/e0;->u(Lb/g/j/a;)Lcom/tv91/features/authentication/q/e0;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p1}, Lcom/tv91/features/authentication/q/e0;->o(Ljava/lang/String;)V

    return-void
.end method

.method public g1()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/p/v;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/e;

    new-instance v1, Lcom/tv91/features/authentication/p/b;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/p/b;-><init>(Lcom/tv91/features/authentication/p/v;)V

    invoke-interface {v0, v1}, Lcom/tv91/features/authentication/e;->d(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/p/v;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/e;

    new-instance v1, Lcom/tv91/features/authentication/p/i;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/p/i;-><init>(Lcom/tv91/features/authentication/p/v;)V

    invoke-interface {v0, v1}, Lcom/tv91/features/authentication/e;->f(Lb/g/j/a;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/features/authentication/p/v;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/e;

    new-instance v1, Lcom/tv91/features/authentication/p/e;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/p/e;-><init>(Lcom/tv91/features/authentication/p/v;)V

    invoke-interface {v0, v1}, Lcom/tv91/features/authentication/e;->U0(Lb/g/j/a;)V

    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/p/v;->h0:Lcom/tv91/features/authentication/q/e0;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/p/v;->i0:Lcom/tv91/features/authentication/q/d0;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method public q2(Lcom/tv91/s/c;Z)V
    .locals 1

    if-eqz p2, :cond_0

    .line 1
    new-instance p2, Lcom/tv91/features/authentication/p/f;

    invoke-direct {p2, p0}, Lcom/tv91/features/authentication/p/f;-><init>(Lcom/tv91/features/authentication/p/v;)V

    invoke-static {p2}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object p2

    new-instance v0, Lcom/tv91/features/authentication/p/c;

    invoke-direct {v0, p0}, Lcom/tv91/features/authentication/p/c;-><init>(Lcom/tv91/features/authentication/p/v;)V

    .line 2
    invoke-virtual {p2, v0}, Lcom/tv91/q/a/g;->e(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object p2

    .line 3
    invoke-virtual {p2, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    goto :goto_0

    .line 4
    :cond_0
    new-instance p2, Lcom/tv91/features/authentication/p/m;

    invoke-direct {p2, p0}, Lcom/tv91/features/authentication/p/m;-><init>(Lcom/tv91/features/authentication/p/v;)V

    invoke-static {p2}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object p2

    new-instance v0, Lcom/tv91/features/authentication/p/g;

    invoke-direct {v0, p0}, Lcom/tv91/features/authentication/p/g;-><init>(Lcom/tv91/features/authentication/p/v;)V

    .line 5
    invoke-virtual {p2, v0}, Lcom/tv91/q/a/g;->e(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object p2

    .line 6
    invoke-virtual {p2, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    :goto_0
    return-void
.end method

.method public synthetic s2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/p/v;->r2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic u2(Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/p/v;->t2(Ljava/lang/Integer;)V

    return-void
.end method

.method public synthetic w2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/p/v;->v2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic y2(Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/p/v;->x2(Ljava/lang/Integer;)V

    return-void
.end method
