.class public final Lcom/tv91/features/authentication/o/n;
.super Lcom/tv91/features/authentication/o/m;
.source "RegisterFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/features/authentication/o/n$a;
    }
.end annotation


# instance fields
.field h0:Lcom/tv91/features/authentication/q/c0;

.field i0:Lcom/tv91/features/authentication/q/x;

.field private final j0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/features/authentication/j;",
            ">;"
        }
    .end annotation
.end field

.field private k0:Lcom/tv91/x/h;


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f0d00b9

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/features/authentication/o/m;-><init>(I)V

    .line 2
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    sget-object v1, Lcom/tv91/features/authentication/o/e;->a:Lcom/tv91/features/authentication/o/e;

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/features/authentication/o/n;->j0:Lcom/tv91/features/shared/ViewSupplier;

    return-void
.end method

.method private synthetic A2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/o/n;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/j;

    invoke-interface {v0}, Lcom/tv91/features/authentication/j;->j()V

    return-void
.end method

.method private synthetic C2(Lcom/tv91/features/authentication/i;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/tv91/features/authentication/i;->a:Ljava/lang/String;

    iget-object p1, p1, Lcom/tv91/features/authentication/i;->c:Ljava/lang/String;

    invoke-virtual {p0, v0, p1}, Lcom/tv91/features/authentication/o/n;->E2(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic r2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/o/n;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/j;

    invoke-virtual {p1}, Lcom/tv91/s/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/features/authentication/j;->r0(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic t2(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/o/n;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/j;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->i0(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/features/authentication/j;->g(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic v2(Lcom/tv91/model/User;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tv91/features/authentication/o/n;->k0:Lcom/tv91/x/h;

    invoke-virtual {p1}, Lcom/tv91/x/h;->a()V

    return-void
.end method

.method static synthetic x2(Landroid/view/View;)Lcom/tv91/features/authentication/j;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/features/authentication/o/q;

    invoke-static {p0}, Lcom/tv91/r/v0;->b(Landroid/view/View;)Lcom/tv91/r/v0;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/tv91/features/authentication/o/q;-><init>(Lcom/tv91/r/v0;)V

    return-object v0
.end method

.method private synthetic y2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/o/n;->k0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    return-void
.end method


# virtual methods
.method public synthetic B2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/o/n;->A2()V

    return-void
.end method

.method public synthetic D2(Lcom/tv91/features/authentication/i;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/o/n;->C2(Lcom/tv91/features/authentication/i;)V

    return-void
.end method

.method public E2(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/o/n;->i0:Lcom/tv91/features/authentication/q/x;

    new-instance v1, Lcom/tv91/features/authentication/o/c;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/o/c;-><init>(Lcom/tv91/features/authentication/o/n;)V

    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/x;->w(Lb/g/j/a;)Lcom/tv91/features/authentication/q/x;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/o/l;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/o/l;-><init>(Lcom/tv91/features/authentication/o/n;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/x;->u(Lb/g/j/a;)Lcom/tv91/features/authentication/q/x;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/tv91/features/authentication/q/x;->o(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public F2(Lcom/tv91/features/authentication/i;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/o/n;->h0:Lcom/tv91/features/authentication/q/c0;

    new-instance v1, Lcom/tv91/features/authentication/o/f;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/o/f;-><init>(Lcom/tv91/features/authentication/o/n;)V

    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/c0;->y(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/c0;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/o/b;

    invoke-direct {v1, p0, p1}, Lcom/tv91/features/authentication/o/b;-><init>(Lcom/tv91/features/authentication/o/n;Lcom/tv91/features/authentication/i;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/c0;->z(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/c0;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/o/l;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/o/l;-><init>(Lcom/tv91/features/authentication/o/n;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/c0;->x(Lb/g/j/a;)Lcom/tv91/features/authentication/q/c0;

    move-result-object v0

    iget-object v1, p1, Lcom/tv91/features/authentication/i;->a:Ljava/lang/String;

    iget-object v2, p1, Lcom/tv91/features/authentication/i;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/tv91/features/authentication/i;->c:Ljava/lang/String;

    iget-object p1, p1, Lcom/tv91/features/authentication/i;->d:Ljava/lang/String;

    .line 4
    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/tv91/features/authentication/q/c0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

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

    iput-object p1, p0, Lcom/tv91/features/authentication/o/n;->k0:Lcom/tv91/x/h;

    return-void
.end method

.method public g1()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/o/n;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/j;

    new-instance v1, Lcom/tv91/features/authentication/o/g;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/o/g;-><init>(Lcom/tv91/features/authentication/o/n;)V

    invoke-interface {v0, v1}, Lcom/tv91/features/authentication/j;->d(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/o/n;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/authentication/j;

    new-instance v1, Lcom/tv91/features/authentication/o/a;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/o/a;-><init>(Lcom/tv91/features/authentication/o/n;)V

    invoke-interface {v0, v1}, Lcom/tv91/features/authentication/j;->p1(Lb/g/j/a;)V

    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/o/n;->h0:Lcom/tv91/features/authentication/q/c0;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/o/n;->i0:Lcom/tv91/features/authentication/q/x;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method public q2(Lcom/tv91/s/c;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/features/authentication/o/d;

    invoke-direct {v0, p0}, Lcom/tv91/features/authentication/o/d;-><init>(Lcom/tv91/features/authentication/o/n;)V

    invoke-static {v0}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/authentication/o/h;

    invoke-direct {v1, p0}, Lcom/tv91/features/authentication/o/h;-><init>(Lcom/tv91/features/authentication/o/n;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/q/a/g;->e(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic s2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/o/n;->r2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic u2(Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/o/n;->t2(Ljava/lang/Integer;)V

    return-void
.end method

.method public synthetic w2(Lcom/tv91/model/User;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/o/n;->v2(Lcom/tv91/model/User;)V

    return-void
.end method

.method public synthetic z2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/o/n;->y2()V

    return-void
.end method
