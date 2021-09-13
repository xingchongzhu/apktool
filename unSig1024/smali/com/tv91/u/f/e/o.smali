.class public final Lcom/tv91/u/f/e/o;
.super Lcom/tv91/u/f/e/n;
.source "SendFeedbackFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/f/e/o$a;
    }
.end annotation


# instance fields
.field h0:Lcom/tv91/u/f/f/g;

.field i0:Lcom/tv91/u/f/f/i;

.field private final j0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/f/b;",
            ">;"
        }
    .end annotation
.end field

.field private k0:Lcom/tv91/x/h;

.field private l0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tv91/model/FeedbackType;",
            ">;"
        }
    .end annotation
.end field

.field private m0:Lcom/tv91/model/FeedbackType;


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f0d00aa

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/u/f/e/n;-><init>(I)V

    .line 2
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    sget-object v1, Lcom/tv91/u/f/e/d;->a:Lcom/tv91/u/f/e/d;

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/u/f/e/o;->j0:Lcom/tv91/features/shared/ViewSupplier;

    return-void
.end method

.method private synthetic B2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/e/o;->k0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    return-void
.end method

.method private synthetic D2(Lcom/tv91/model/FeedbackType;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/f/e/o;->m0:Lcom/tv91/model/FeedbackType;

    return-void
.end method

.method private synthetic F2(Ljava/lang/CharSequence;)V
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    invoke-static {}, Lcom/tv91/utils/h;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 2
    invoke-static {}, Lcom/tv91/utils/h;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->O1()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/tv91/utils/h;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v1, 0x3

    const-string v2, "3.3"

    aput-object v2, v0, v1

    const v1, 0x7f1201ce

    .line 4
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/Fragment;->j0(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/tv91/u/f/e/o;->m0:Lcom/tv91/model/FeedbackType;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v1, p1}, Lcom/tv91/u/f/e/o;->N2(Lcom/tv91/model/FeedbackType;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic H2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/e/o;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/f/b;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/f/b;->a(Z)V

    return-void
.end method

.method private synthetic J2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/e/o;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/f/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/f/b;->a(Z)V

    return-void
.end method

.method private synthetic L2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/e/o;->k0:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    return-void
.end method

.method private synthetic s2(Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tv91/model/FeedbackType;

    iput-object v0, p0, Lcom/tv91/u/f/e/o;->m0:Lcom/tv91/model/FeedbackType;

    .line 2
    iget-object v0, p0, Lcom/tv91/u/f/e/o;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/f/b;

    iput-object p1, p0, Lcom/tv91/u/f/e/o;->l0:Ljava/util/List;

    invoke-interface {v0, p1}, Lcom/tv91/u/f/b;->a0(Ljava/util/List;)V

    return-void
.end method

.method private synthetic u2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->M1()Landroidx/fragment/app/e;

    move-result-object p1

    new-instance v0, Lcom/tv91/u/f/e/e;

    invoke-direct {v0, p0}, Lcom/tv91/u/f/e/e;-><init>(Lcom/tv91/u/f/e/o;)V

    invoke-static {p1, v0}, Lcom/tv91/features/shared/widget/e;->b(Landroid/content/Context;Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic w2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/e/o;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/f/b;

    invoke-virtual {p1}, Lcom/tv91/s/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/q/a/f;->g0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic y2(Landroid/view/View;)Lcom/tv91/u/f/b;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/f/e/r;

    invoke-static {p0}, Lcom/tv91/r/h0;->b(Landroid/view/View;)Lcom/tv91/r/h0;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/tv91/u/f/e/r;-><init>(Lcom/tv91/r/h0;)V

    return-object v0
.end method

.method private synthetic z2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/e/o;->k0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method


# virtual methods
.method public synthetic A2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/f/e/o;->z2()V

    return-void
.end method

.method public synthetic C2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/f/e/o;->B2()V

    return-void
.end method

.method public synthetic E2(Lcom/tv91/model/FeedbackType;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/f/e/o;->D2(Lcom/tv91/model/FeedbackType;)V

    return-void
.end method

.method public synthetic G2(Ljava/lang/CharSequence;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/f/e/o;->F2(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public synthetic I2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/f/e/o;->H2()V

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

    iput-object p1, p0, Lcom/tv91/u/f/e/o;->k0:Lcom/tv91/x/h;

    return-void
.end method

.method public synthetic K2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/f/e/o;->J2()V

    return-void
.end method

.method public synthetic M2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/f/e/o;->L2()V

    return-void
.end method

.method public N2(Lcom/tv91/model/FeedbackType;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/e/o;->i0:Lcom/tv91/u/f/f/i;

    new-instance v1, Lcom/tv91/u/f/e/k;

    invoke-direct {v1, p0}, Lcom/tv91/u/f/e/k;-><init>(Lcom/tv91/u/f/e/o;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/f/f/i;->w(Ljava/lang/Runnable;)Lcom/tv91/u/f/f/i;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/f/e/j;

    invoke-direct {v1, p0}, Lcom/tv91/u/f/e/j;-><init>(Lcom/tv91/u/f/e/o;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/u/f/f/i;->v(Ljava/lang/Runnable;)Lcom/tv91/u/f/f/i;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/f/e/i;

    invoke-direct {v1, p0}, Lcom/tv91/u/f/e/i;-><init>(Lcom/tv91/u/f/e/o;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/u/f/f/i;->x(Ljava/lang/Runnable;)Lcom/tv91/u/f/f/i;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/f/e/a;

    invoke-direct {v1, p0}, Lcom/tv91/u/f/e/a;-><init>(Lcom/tv91/u/f/e/o;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/u/f/f/i;->u(Lb/g/j/a;)Lcom/tv91/u/f/f/i;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/tv91/u/f/f/i;->o(Lcom/tv91/model/FeedbackType;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public g1()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/f/e/o;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/f/b;

    new-instance v1, Lcom/tv91/u/f/e/h;

    invoke-direct {v1, p0}, Lcom/tv91/u/f/e/h;-><init>(Lcom/tv91/u/f/e/o;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/f/b;->d(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/f/e/o;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/f/b;

    new-instance v1, Lcom/tv91/u/f/e/c;

    invoke-direct {v1, p0}, Lcom/tv91/u/f/e/c;-><init>(Lcom/tv91/u/f/e/o;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/f/b;->n1(Lb/g/j/a;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/f/e/o;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/f/b;

    new-instance v1, Lcom/tv91/u/f/e/f;

    invoke-direct {v1, p0}, Lcom/tv91/u/f/e/f;-><init>(Lcom/tv91/u/f/e/o;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/f/b;->f(Lb/g/j/a;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/f/e/o;->l0:Ljava/util/List;

    if-nez v0, :cond_0

    .line 6
    invoke-virtual {p0}, Lcom/tv91/u/f/e/o;->q2()V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/f/e/o;->j0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/f/b;

    iget-object v1, p0, Lcom/tv91/u/f/e/o;->l0:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/tv91/u/f/b;->a0(Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/f/e/o;->h0:Lcom/tv91/u/f/f/g;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/f/e/o;->i0:Lcom/tv91/u/f/f/i;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method public q2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/e/o;->h0:Lcom/tv91/u/f/f/g;

    new-instance v1, Lcom/tv91/u/f/e/g;

    invoke-direct {v1, p0}, Lcom/tv91/u/f/e/g;-><init>(Lcom/tv91/u/f/e/o;)V

    invoke-virtual {v0, v1}, Lcom/tv91/u/f/f/g;->u(Lb/g/j/a;)Lcom/tv91/u/f/f/g;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/tv91/u/f/f/g;->o()V

    return-void
.end method

.method public r2(Lcom/tv91/s/c;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/u/f/e/b;

    invoke-direct {v0, p0}, Lcom/tv91/u/f/e/b;-><init>(Lcom/tv91/u/f/e/o;)V

    invoke-static {v0}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/f/e/l;

    invoke-direct {v1, p0}, Lcom/tv91/u/f/e/l;-><init>(Lcom/tv91/u/f/e/o;)V

    const-string v2, "0000001"

    .line 2
    invoke-virtual {v0, v2, v1}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic t2(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/f/e/o;->s2(Ljava/util/List;)V

    return-void
.end method

.method public synthetic v2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/f/e/o;->u2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic x2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/f/e/o;->w2(Lcom/tv91/s/c;)V

    return-void
.end method
