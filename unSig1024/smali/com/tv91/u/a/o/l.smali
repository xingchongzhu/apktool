.class public final Lcom/tv91/u/a/o/l;
.super Lcom/tv91/u/a/o/p;
.source "ChannelFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/a/o/l$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/u/a/d<",
        "Lcom/tv91/u/a/g;",
        ">;"
    }
.end annotation


# instance fields
.field k0:Lcom/tv91/y/e;

.field l0:Lcom/tv91/y/h;

.field m0:Lcom/tv91/u/a/r/j;

.field n0:Lcom/tv91/u/a/r/l;

.field private final o0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/a/g;",
            ">;"
        }
    .end annotation
.end field

.field private p0:Lcom/tv91/x/h;

.field private q0:Lcom/tv91/u/a/o/q;


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f0d00a5

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/u/a/o/p;-><init>(I)V

    .line 2
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    sget-object v1, Lcom/tv91/u/a/o/d;->a:Lcom/tv91/u/a/o/d;

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/u/a/o/l;->o0:Lcom/tv91/features/shared/ViewSupplier;

    return-void
.end method

.method static synthetic B2(Landroid/view/View;)Lcom/tv91/u/a/g;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/a/o/o;

    invoke-static {p0}, Lcom/tv91/r/c0;->b(Landroid/view/View;)Lcom/tv91/r/c0;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/tv91/u/a/o/o;-><init>(Lcom/tv91/r/c0;)V

    return-object v0
.end method

.method private synthetic C2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/o/l;->p0:Lcom/tv91/x/h;

    iget-object v1, p0, Lcom/tv91/u/a/o/l;->l0:Lcom/tv91/y/h;

    .line 2
    invoke-interface {v1}, Lcom/tv91/y/h;->e()Lcom/tv91/model/User;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/tv91/u/h/i/y$a;

    invoke-direct {v1}, Lcom/tv91/u/h/i/y$a;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    .line 3
    :goto_0
    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic E2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/o/l;->p0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/u/c/j/n$a;

    invoke-direct {v1}, Lcom/tv91/u/c/j/n$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic G2(Lcom/tv91/model/ExternalSource;)V
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    iget-object p1, p1, Lcom/tv91/model/ExternalSource;->url:Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    iget-object p1, p0, Lcom/tv91/u/a/o/l;->k0:Lcom/tv91/y/e;

    invoke-interface {p1}, Lcom/tv91/y/e;->c()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const-string p1, "%s?sid=%s"

    invoke-static {p1, v0}, Lcom/tv91/utils/g;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/o/l;->p0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/x/b;

    invoke-direct {v1, p1}, Lcom/tv91/x/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic v2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/o/l;->o0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/g;

    invoke-virtual {p1}, Lcom/tv91/s/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/q/a/f;->g0(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic x2(Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/o/l;->o0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/g;

    invoke-interface {v0, p1}, Lcom/tv91/u/a/g;->W0(Ljava/util/List;)V

    return-void
.end method

.method private synthetic z2(Ljava/util/List;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/model/Channel;

    const v1, 0x7f120041

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->i0(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xc8

    invoke-direct {v0, v2, v1}, Lcom/tv91/model/Channel;-><init>(ILjava/lang/String;)V

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 2
    new-instance v0, Lcom/tv91/u/a/o/q;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->H()Landroidx/fragment/app/n;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/tv91/u/a/o/q;-><init>(Landroidx/fragment/app/n;Ljava/util/List;)V

    iput-object v0, p0, Lcom/tv91/u/a/o/l;->q0:Lcom/tv91/u/a/o/q;

    .line 3
    iget-object v0, p0, Lcom/tv91/u/a/o/l;->o0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/g;

    iget-object v1, p0, Lcom/tv91/u/a/o/l;->q0:Lcom/tv91/u/a/o/q;

    invoke-interface {v0, v1, p1}, Lcom/tv91/u/a/g;->K0(Landroidx/viewpager/widget/a;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public synthetic A2(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/a/o/l;->z2(Ljava/util/List;)V

    return-void
.end method

.method public synthetic D2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/a/o/l;->C2()V

    return-void
.end method

.method public synthetic F2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/a/o/l;->E2()V

    return-void
.end method

.method public synthetic H2(Lcom/tv91/model/ExternalSource;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/a/o/l;->G2(Lcom/tv91/model/ExternalSource;)V

    return-void
.end method

.method public I2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/o/l;->m0:Lcom/tv91/u/a/r/j;

    new-instance v1, Lcom/tv91/u/a/o/f;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/o/f;-><init>(Lcom/tv91/u/a/o/l;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/a/r/j;->v(Lb/g/j/a;)Lcom/tv91/u/a/r/j;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/a/o/k;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/o/k;-><init>(Lcom/tv91/u/a/o/l;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/a/r/j;->u(Lb/g/j/a;)Lcom/tv91/u/a/r/j;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/tv91/u/a/r/j;->o()V

    return-void
.end method

.method public J0(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/tv91/u/a/d;->J0(Landroid/os/Bundle;)V

    .line 2
    invoke-static {p0}, Lcom/tv91/x/h;->b(Landroidx/fragment/app/Fragment;)Lcom/tv91/x/h;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/a/o/l;->p0:Lcom/tv91/x/h;

    return-void
.end method

.method public J2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/o/l;->n0:Lcom/tv91/u/a/r/l;

    new-instance v1, Lcom/tv91/u/a/o/a;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/o/a;-><init>(Lcom/tv91/u/a/o/l;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/a/r/l;->v(Lb/g/j/a;)Lcom/tv91/u/a/r/l;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/a/o/k;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/o/k;-><init>(Lcom/tv91/u/a/o/l;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/a/r/l;->u(Lb/g/j/a;)Lcom/tv91/u/a/r/l;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/tv91/u/a/r/l;->o()V

    return-void
.end method

.method public g1()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/tv91/u/a/d;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/o/l;->o0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/g;

    new-instance v1, Lcom/tv91/u/a/o/c;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/o/c;-><init>(Lcom/tv91/u/a/o/l;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/a/g;->i(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/a/o/l;->o0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/g;

    new-instance v1, Lcom/tv91/u/a/o/b;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/o/b;-><init>(Lcom/tv91/u/a/o/l;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/a/g;->h(Ljava/lang/Runnable;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/a/o/l;->o0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/g;

    new-instance v1, Lcom/tv91/u/a/o/e;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/o/e;-><init>(Lcom/tv91/u/a/o/l;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/a/g;->P(Lb/g/j/a;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/a/o/l;->q0:Lcom/tv91/u/a/o/q;

    if-nez v0, :cond_0

    .line 6
    invoke-virtual {p0}, Lcom/tv91/u/a/o/l;->J2()V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/a/o/l;->o0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/g;

    iget-object v1, p0, Lcom/tv91/u/a/o/l;->q0:Lcom/tv91/u/a/o/q;

    invoke-virtual {v1}, Lcom/tv91/u/a/o/q;->q()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/tv91/u/a/g;->K0(Landroidx/viewpager/widget/a;Ljava/util/List;)V

    .line 8
    :goto_0
    invoke-virtual {p0}, Lcom/tv91/x/f;->l2()Lcom/tv91/x/c;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/o/l$a;

    .line 9
    invoke-static {v0}, Lcom/tv91/u/a/o/l$a;->r(Lcom/tv91/u/a/o/l$a;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    .line 10
    invoke-static {v0, v1}, Lcom/tv91/u/a/o/l$a;->s(Lcom/tv91/u/a/o/l$a;Z)Z

    .line 11
    new-instance v0, Lcom/tv91/u/d/d$a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/tv91/u/d/d$a;-><init>(Z)V

    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->W()Landroidx/fragment/app/n;

    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroidx/fragment/app/n;->m()Landroidx/fragment/app/x;

    move-result-object v1

    .line 14
    invoke-virtual {v0}, Lcom/tv91/x/c;->l()Landroidx/fragment/app/Fragment;

    move-result-object v2

    invoke-virtual {v0}, Lcom/tv91/x/c;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroidx/fragment/app/x;->e(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/x;

    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroidx/fragment/app/x;->h()I

    .line 16
    invoke-virtual {p0}, Lcom/tv91/u/a/o/l;->I2()V

    :cond_1
    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/o/l;->m0:Lcom/tv91/u/a/r/j;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/a/o/l;->n0:Lcom/tv91/u/a/r/l;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method protected n2()Lcom/tv91/u/a/h;
    .locals 1

    .line 1
    sget-object v0, Lcom/tv91/u/a/h;->a:Lcom/tv91/u/a/h;

    return-object v0
.end method

.method protected o2()Lcom/tv91/features/shared/ViewSupplier;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/a/g;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/o/l;->o0:Lcom/tv91/features/shared/ViewSupplier;

    return-object v0
.end method

.method public u2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/a/o/g;

    invoke-direct {v0, p0}, Lcom/tv91/u/a/o/g;-><init>(Lcom/tv91/u/a/o/l;)V

    invoke-static {v0}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic w2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/a/o/l;->v2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic y2(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/a/o/l;->x2(Ljava/util/List;)V

    return-void
.end method
