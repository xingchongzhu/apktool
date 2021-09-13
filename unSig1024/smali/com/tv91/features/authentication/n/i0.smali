.class public final Lcom/tv91/features/authentication/n/i0;
.super Lcom/tv91/features/authentication/n/h0;
.source "LoginFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/features/authentication/n/i0$a;
    }
.end annotation


# instance fields
.field h0:Lcom/tv91/y/h;

.field i0:Lcom/tv91/features/authentication/q/x;

.field j0:Lcom/tv91/features/authentication/q/f0;

.field k0:Lcom/tv91/features/authentication/q/z;

.field l0:Lcom/tv91/features/authentication/q/b0;

.field private final m0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/features/authentication/h;",
            ">;"
        }
    .end annotation
.end field

.field private n0:Lcom/tv91/x/h;

.field private o0:Ljava/lang/String;

.field private p0:Ljava/lang/String;

.field private q0:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f0d00ac

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/features/authentication/n/h0;-><init>(I)V

    .line 2
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    sget-object v1, Lcom/tv91/features/authentication/n/b;->a:Lcom/tv91/features/authentication/n/b;

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/features/authentication/n/i0;->m0:Lcom/tv91/features/shared/ViewSupplier;

    return-void
.end method

.method private synthetic A2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/h;

    invoke-virtual {p1}, Lcom/tv91/s/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/features/authentication/h;->k(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic C2(Landroid/view/View;)Lcom/tv91/features/authentication/h;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/features/authentication/n/l0;

    invoke-static {p0}, Lcom/tv91/r/j0;->b(Landroid/view/View;)Lcom/tv91/r/j0;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/tv91/features/authentication/n/l0;-><init>(Lcom/tv91/r/j0;)V

    return-object v0
.end method

.method private synthetic D2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->n0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->a()V

    return-void
.end method

.method private synthetic F2()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/tv91/features/authentication/n/i0;->q0:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/tv91/features/authentication/n/i0;->q0:Z

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/h;

    iget-object v1, p0, Lcom/tv91/features/authentication/n/i0;->o0:Ljava/lang/String;

    iget-object v2, p0, Lcom/tv91/features/authentication/n/i0;->p0:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/tv91/features/authentication/h;->c1(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private synthetic H2()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/tv91/features/authentication/n/i0;->q0:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/tv91/features/authentication/n/i0;->q0:Z

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/h;

    invoke-interface {v0}, Lcom/tv91/features/authentication/h;->B1()V

    :cond_0
    return-void
.end method

.method private synthetic J2(Lcom/tv91/features/authentication/g;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/tv91/features/authentication/n/i0;->q0:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Lcom/tv91/features/authentication/n/i0;->d3(Lcom/tv91/features/authentication/g;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0, p1}, Lcom/tv91/features/authentication/n/i0;->q2(Lcom/tv91/features/authentication/g;)V

    :goto_0
    return-void
.end method

.method private synthetic L2(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tv91/features/authentication/n/i0;->f3(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic N2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->n0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/features/authentication/p/v$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/p/v$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic P2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->n0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/features/authentication/o/n$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/o/n$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic R2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/h;

    invoke-interface {v0}, Lcom/tv91/features/authentication/h;->j()V

    return-void
.end method

.method private synthetic T2(Lcom/tv91/model/User;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tv91/features/authentication/n/i0;->n0:Lcom/tv91/x/h;

    invoke-virtual {p1}, Lcom/tv91/x/h;->a()V

    return-void
.end method

.method private synthetic V2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/h;

    invoke-interface {v0}, Lcom/tv91/features/authentication/h;->j()V

    return-void
.end method

.method private synthetic X2(Lcom/tv91/model/User;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tv91/features/authentication/n/i0;->n0:Lcom/tv91/x/h;

    invoke-virtual {p1}, Lcom/tv91/x/h;->a()V

    return-void
.end method

.method private synthetic Z2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/h;

    invoke-interface {v0}, Lcom/tv91/features/authentication/h;->j()V

    return-void
.end method

.method private synthetic b3()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/h;

    invoke-interface {v0}, Lcom/tv91/features/authentication/h;->D0()V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/h;

    invoke-interface {v0}, Lcom/tv91/features/authentication/h;->l()V

    return-void
.end method

.method private synthetic s2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/h;

    invoke-interface {v0}, Lcom/tv91/features/authentication/h;->j()V

    return-void
.end method

.method private synthetic u2(Lcom/tv91/model/User;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tv91/features/authentication/n/i0;->n0:Lcom/tv91/x/h;

    invoke-virtual {p1}, Lcom/tv91/x/h;->a()V

    return-void
.end method

.method private synthetic w2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/h;

    invoke-virtual {p1}, Lcom/tv91/s/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/features/authentication/h;->G(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic y2(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/h;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->i0(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/features/authentication/h;->g(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public synthetic B2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/n/i0;->A2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic E2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/n/i0;->D2()V

    return-void
.end method

.method public synthetic G2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/n/i0;->F2()V

    return-void
.end method

.method public synthetic I2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/n/i0;->H2()V

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

    iput-object p1, p0, Lcom/tv91/features/authentication/n/i0;->n0:Lcom/tv91/x/h;

    .line 4
    iget-object p1, p0, Lcom/tv91/features/authentication/n/i0;->h0:Lcom/tv91/y/h;

    invoke-interface {p1}, Lcom/tv91/y/h;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/features/authentication/n/i0;->o0:Ljava/lang/String;

    .line 5
    iget-object p1, p0, Lcom/tv91/features/authentication/n/i0;->h0:Lcom/tv91/y/h;

    invoke-interface {p1}, Lcom/tv91/y/h;->c()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/features/authentication/n/i0;->p0:Ljava/lang/String;

    return-void
.end method

.method public synthetic K2(Lcom/tv91/features/authentication/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/n/i0;->J2(Lcom/tv91/features/authentication/g;)V

    return-void
.end method

.method public synthetic M2(Ljava/lang/CharSequence;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/n/i0;->L2(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public synthetic O2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/n/i0;->N2()V

    return-void
.end method

.method public synthetic Q2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/n/i0;->P2()V

    return-void
.end method

.method public synthetic S2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/n/i0;->R2()V

    return-void
.end method

.method public synthetic U2(Lcom/tv91/model/User;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/n/i0;->T2(Lcom/tv91/model/User;)V

    return-void
.end method

.method public synthetic W2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/n/i0;->V2()V

    return-void
.end method

.method public synthetic Y2(Lcom/tv91/model/User;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/n/i0;->X2(Lcom/tv91/model/User;)V

    return-void
.end method

.method public synthetic a3()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/n/i0;->Z2()V

    return-void
.end method

.method public synthetic c3()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/n/i0;->b3()V

    return-void
.end method

.method public d3(Lcom/tv91/features/authentication/g;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->k0:Lcom/tv91/features/authentication/q/z;

    new-instance v1, Lcom/tv91/features/authentication/n/g;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/n/g;-><init>(Lcom/tv91/features/authentication/n/i0;)V

    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/z;->v(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/z;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/n/f;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/n/f;-><init>(Lcom/tv91/features/authentication/n/i0;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/z;->w(Lb/g/j/a;)Lcom/tv91/features/authentication/q/z;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/n/f0;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/n/f0;-><init>(Lcom/tv91/features/authentication/n/i0;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/z;->u(Lb/g/j/a;)Lcom/tv91/features/authentication/q/z;

    move-result-object v0

    iget-object v1, p1, Lcom/tv91/features/authentication/g;->a:Ljava/lang/String;

    iget-object p1, p1, Lcom/tv91/features/authentication/g;->b:Ljava/lang/String;

    .line 4
    invoke-virtual {v0, v1, p1}, Lcom/tv91/features/authentication/q/z;->o(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public e3()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->l0:Lcom/tv91/features/authentication/q/b0;

    new-instance v1, Lcom/tv91/features/authentication/n/q;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/n/q;-><init>(Lcom/tv91/features/authentication/n/i0;)V

    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/b0;->v(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/b0;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/n/j;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/n/j;-><init>(Lcom/tv91/features/authentication/n/i0;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/b0;->w(Lb/g/j/a;)Lcom/tv91/features/authentication/q/b0;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/n/f0;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/n/f0;-><init>(Lcom/tv91/features/authentication/n/i0;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/b0;->u(Lb/g/j/a;)Lcom/tv91/features/authentication/q/b0;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/tv91/features/authentication/q/b0;->o()V

    return-void
.end method

.method public f3(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->j0:Lcom/tv91/features/authentication/q/f0;

    new-instance v1, Lcom/tv91/features/authentication/n/a;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/n/a;-><init>(Lcom/tv91/features/authentication/n/i0;)V

    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/f0;->v(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/f0;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/n/o;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/n/o;-><init>(Lcom/tv91/features/authentication/n/i0;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/f0;->w(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/f0;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/n/f0;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/n/f0;-><init>(Lcom/tv91/features/authentication/n/i0;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/f0;->u(Lb/g/j/a;)Lcom/tv91/features/authentication/q/f0;

    move-result-object v0

    sget-object v1, Lcom/tv91/features/authentication/q/f0$a;->a:Lcom/tv91/features/authentication/q/f0$a;

    .line 4
    invoke-virtual {v0, v1, p1}, Lcom/tv91/features/authentication/q/f0;->o(Lcom/tv91/features/authentication/q/f0$a;Ljava/lang/String;)V

    return-void
.end method

.method public g1()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/h;

    new-instance v1, Lcom/tv91/features/authentication/n/k;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/n/k;-><init>(Lcom/tv91/features/authentication/n/i0;)V

    invoke-interface {v0, v1}, Lcom/tv91/features/authentication/h;->d(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/h;

    new-instance v1, Lcom/tv91/features/authentication/n/h;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/n/h;-><init>(Lcom/tv91/features/authentication/n/i0;)V

    invoke-interface {v0, v1}, Lcom/tv91/features/authentication/h;->X(Ljava/lang/Runnable;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/h;

    new-instance v1, Lcom/tv91/features/authentication/n/l;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/n/l;-><init>(Lcom/tv91/features/authentication/n/i0;)V

    invoke-interface {v0, v1}, Lcom/tv91/features/authentication/h;->A0(Ljava/lang/Runnable;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/h;

    new-instance v1, Lcom/tv91/features/authentication/n/i;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/n/i;-><init>(Lcom/tv91/features/authentication/n/i0;)V

    invoke-interface {v0, v1}, Lcom/tv91/features/authentication/h;->Z1(Lb/g/j/a;)V

    .line 6
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/h;

    new-instance v1, Lcom/tv91/features/authentication/n/c;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/n/c;-><init>(Lcom/tv91/features/authentication/n/i0;)V

    invoke-interface {v0, v1}, Lcom/tv91/features/authentication/h;->f(Lb/g/j/a;)V

    .line 7
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/h;

    new-instance v1, Lcom/tv91/features/authentication/n/d;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/n/d;-><init>(Lcom/tv91/features/authentication/n/i0;)V

    invoke-interface {v0, v1}, Lcom/tv91/features/authentication/h;->u0(Ljava/lang/Runnable;)V

    .line 8
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/h;

    new-instance v1, Lcom/tv91/features/authentication/n/e;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/n/e;-><init>(Lcom/tv91/features/authentication/n/i0;)V

    invoke-interface {v0, v1}, Lcom/tv91/features/authentication/h;->I(Ljava/lang/Runnable;)V

    .line 9
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/h;

    new-instance v1, Lcom/tv91/features/authentication/n/g0;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/n/g0;-><init>(Lcom/tv91/features/authentication/n/i0;)V

    invoke-interface {v0, v1}, Lcom/tv91/features/authentication/h;->v1(Ljava/lang/Runnable;)V

    .line 10
    iget-boolean v0, p0, Lcom/tv91/features/authentication/n/i0;->q0:Z

    if-eqz v0, :cond_0

    .line 11
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/h;

    invoke-interface {v0}, Lcom/tv91/features/authentication/h;->B1()V

    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/h;

    iget-object v1, p0, Lcom/tv91/features/authentication/n/i0;->o0:Ljava/lang/String;

    iget-object v2, p0, Lcom/tv91/features/authentication/n/i0;->p0:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/tv91/features/authentication/h;->c1(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->i0:Lcom/tv91/features/authentication/q/x;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->j0:Lcom/tv91/features/authentication/q/f0;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 4
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->k0:Lcom/tv91/features/authentication/q/z;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 5
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->l0:Lcom/tv91/features/authentication/q/b0;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method public q2(Lcom/tv91/features/authentication/g;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/i0;->i0:Lcom/tv91/features/authentication/q/x;

    new-instance v1, Lcom/tv91/features/authentication/n/m;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/n/m;-><init>(Lcom/tv91/features/authentication/n/i0;)V

    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/x;->v(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/x;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/n/p;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/n/p;-><init>(Lcom/tv91/features/authentication/n/i0;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/x;->w(Lb/g/j/a;)Lcom/tv91/features/authentication/q/x;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/n/f0;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/n/f0;-><init>(Lcom/tv91/features/authentication/n/i0;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/x;->u(Lb/g/j/a;)Lcom/tv91/features/authentication/q/x;

    move-result-object v0

    iget-object v1, p1, Lcom/tv91/features/authentication/g;->a:Ljava/lang/String;

    iput-object v1, p0, Lcom/tv91/features/authentication/n/i0;->o0:Ljava/lang/String;

    iget-object p1, p1, Lcom/tv91/features/authentication/g;->b:Ljava/lang/String;

    iput-object p1, p0, Lcom/tv91/features/authentication/n/i0;->p0:Ljava/lang/String;

    .line 4
    invoke-virtual {v0, v1, p1}, Lcom/tv91/features/authentication/q/x;->o(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public r2(Lcom/tv91/s/c;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/features/authentication/n/s;

    invoke-direct {v0, p0}, Lcom/tv91/features/authentication/n/s;-><init>(Lcom/tv91/features/authentication/n/i0;)V

    invoke-static {v0}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/n/n;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/n/n;-><init>(Lcom/tv91/features/authentication/n/i0;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/q/a/g;->e(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/n/r;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/n/r;-><init>(Lcom/tv91/features/authentication/n/i0;)V

    const-string v2, "A000073"

    .line 3
    invoke-virtual {v0, v2, v1}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic t2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/n/i0;->s2()V

    return-void
.end method

.method public synthetic v2(Lcom/tv91/model/User;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/n/i0;->u2(Lcom/tv91/model/User;)V

    return-void
.end method

.method public synthetic x2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/n/i0;->w2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic z2(Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/n/i0;->y2(Ljava/lang/Integer;)V

    return-void
.end method
