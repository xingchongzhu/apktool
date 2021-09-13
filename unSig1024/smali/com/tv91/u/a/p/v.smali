.class public final Lcom/tv91/u/a/p/v;
.super Lcom/tv91/u/a/p/t;
.source "ProfileFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/a/p/v$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/u/a/d<",
        "Lcom/tv91/u/a/k;",
        ">;"
    }
.end annotation


# instance fields
.field k0:Lcom/tv91/features/authentication/q/w;

.field l0:Lcom/tv91/features/authentication/q/y;

.field private final m0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/a/k;",
            ">;"
        }
    .end annotation
.end field

.field private n0:Lcom/tv91/x/h;

.field private o0:Lcom/tv91/model/User;

.field private p0:Z

.field private q0:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f0d00b2

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/u/a/p/t;-><init>(I)V

    .line 2
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    sget-object v1, Lcom/tv91/u/a/p/c;->a:Lcom/tv91/u/a/p/c;

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/u/a/p/v;->m0:Lcom/tv91/features/shared/ViewSupplier;

    return-void
.end method

.method private synthetic A2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/p/v;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/k;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/tv91/u/a/k;->a(Z)V

    return-void
.end method

.method private synthetic C2(Lcom/tv91/model/User;)V
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/tv91/u/a/p/v;->p0:Z

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/p/v;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/k;

    iput-object p1, p0, Lcom/tv91/u/a/p/v;->o0:Lcom/tv91/model/User;

    invoke-direct {p0}, Lcom/tv91/u/a/p/v;->a3()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/tv91/u/a/k;->y0(Lcom/tv91/model/User;Ljava/util/List;)V

    return-void
.end method

.method private synthetic E2()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/tv91/u/a/p/v;->p0:Z

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/p/v;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/k;

    invoke-direct {p0}, Lcom/tv91/u/a/p/v;->u2()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/tv91/u/a/k;->y0(Lcom/tv91/model/User;Ljava/util/List;)V

    return-void
.end method

.method static synthetic G2(Landroid/view/View;)Lcom/tv91/u/a/k;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/a/p/y;

    invoke-static {p0}, Lcom/tv91/r/o0;->b(Landroid/view/View;)Lcom/tv91/r/o0;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/tv91/u/a/p/y;-><init>(Lcom/tv91/r/o0;)V

    return-object v0
.end method

.method private synthetic H2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/p/v;->n0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic J2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->M1()Landroidx/fragment/app/e;

    move-result-object p1

    new-instance v0, Lcom/tv91/u/a/p/e;

    invoke-direct {v0, p0}, Lcom/tv91/u/a/p/e;-><init>(Lcom/tv91/u/a/p/v;)V

    invoke-static {p1, v0}, Lcom/tv91/features/shared/widget/e;->b(Landroid/content/Context;Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic L2(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/p/v;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/k;

    invoke-virtual {p1}, Lcom/tv91/s/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tv91/q/a/f;->g0(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic N2(Lcom/tv91/s/c;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/tv91/u/a/p/v;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p1}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/a/k;

    invoke-direct {p0}, Lcom/tv91/u/a/p/v;->u2()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lcom/tv91/u/a/k;->y0(Lcom/tv91/model/User;Ljava/util/List;)V

    return-void
.end method

.method private synthetic P2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/p/v;->n0:Lcom/tv91/x/h;

    iget-boolean v1, p0, Lcom/tv91/u/a/p/v;->p0:Z

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

.method private synthetic R2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/p/v;->n0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/u/c/j/n$a;

    invoke-direct {v1}, Lcom/tv91/u/c/j/n$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method

.method private synthetic T2()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/tv91/u/a/p/v;->p0:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/tv91/u/a/p/v;->q0:Z

    .line 3
    iget-object v0, p0, Lcom/tv91/u/a/p/v;->n0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v1}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    :cond_0
    return-void
.end method

.method private synthetic V2()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/tv91/u/a/p/v;->p0:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/tv91/u/a/p/v;->q0:Z

    .line 3
    iget-object v0, p0, Lcom/tv91/u/a/p/v;->n0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/u/h/j/r$a;

    invoke-direct {v1}, Lcom/tv91/u/h/j/r$a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    :cond_0
    return-void
.end method

.method private Z2(Lcom/tv91/u/a/j;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/tv91/u/a/p/v$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_3

    .line 2
    :pswitch_0
    iget-boolean p1, p0, Lcom/tv91/u/a/p/v;->p0:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/tv91/u/a/p/v;->o0:Lcom/tv91/model/User;

    iget-boolean v0, p1, Lcom/tv91/model/User;->isQuick:Z

    if-eqz v0, :cond_0

    iget-boolean p1, p1, Lcom/tv91/model/User;->isCertified:Z

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/tv91/u/a/p/v;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p1}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/a/k;

    new-instance v0, Lcom/tv91/u/a/p/a;

    invoke-direct {v0, p0}, Lcom/tv91/u/a/p/a;-><init>(Lcom/tv91/u/a/p/v;)V

    invoke-interface {p1, v0}, Lcom/tv91/u/a/k;->U(Ljava/lang/Runnable;)V

    goto/16 :goto_3

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/tv91/u/a/p/v;->Y2()V

    goto/16 :goto_3

    .line 5
    :pswitch_1
    iget-object p1, p0, Lcom/tv91/u/a/p/v;->n0:Lcom/tv91/x/h;

    new-instance v0, Lcom/tv91/features/authentication/m/n$a;

    invoke-direct {v0}, Lcom/tv91/features/authentication/m/n$a;-><init>()V

    invoke-virtual {p1, v0}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    goto/16 :goto_3

    .line 6
    :pswitch_2
    iget-object p1, p0, Lcom/tv91/u/a/p/v;->n0:Lcom/tv91/x/h;

    iget-boolean v0, p0, Lcom/tv91/u/a/p/v;->p0:Z

    if-eqz v0, :cond_1

    new-instance v0, Lcom/tv91/u/f/c/q$a;

    invoke-direct {v0}, Lcom/tv91/u/f/c/q$a;-><init>()V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v0}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    :goto_0
    invoke-virtual {p1, v0}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    goto/16 :goto_3

    .line 7
    :pswitch_3
    iget-object p1, p0, Lcom/tv91/u/a/p/v;->n0:Lcom/tv91/x/h;

    new-instance v0, Lcom/tv91/u/d/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/tv91/u/d/d$a;-><init>(Z)V

    invoke-virtual {p1, v0}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    goto :goto_3

    .line 8
    :pswitch_4
    iget-object p1, p0, Lcom/tv91/u/a/p/v;->n0:Lcom/tv91/x/h;

    new-instance v0, Lcom/tv91/u/b/q0$c;

    invoke-direct {v0}, Lcom/tv91/u/b/q0$c;-><init>()V

    invoke-virtual {p1, v0}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    goto :goto_3

    .line 9
    :pswitch_5
    iget-object p1, p0, Lcom/tv91/u/a/p/v;->n0:Lcom/tv91/x/h;

    new-instance v0, Lcom/tv91/u/h/h/r$b;

    sget-object v1, Lcom/tv91/u/h/c;->b:Lcom/tv91/u/h/c;

    invoke-direct {v0, v1}, Lcom/tv91/u/h/h/r$b;-><init>(Lcom/tv91/u/h/c;)V

    invoke-virtual {p1, v0}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    goto :goto_3

    .line 10
    :pswitch_6
    iget-object p1, p0, Lcom/tv91/u/a/p/v;->n0:Lcom/tv91/x/h;

    new-instance v0, Lcom/tv91/u/h/h/r$b;

    sget-object v1, Lcom/tv91/u/h/c;->a:Lcom/tv91/u/h/c;

    invoke-direct {v0, v1}, Lcom/tv91/u/h/h/r$b;-><init>(Lcom/tv91/u/h/c;)V

    invoke-virtual {p1, v0}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    goto :goto_3

    .line 11
    :pswitch_7
    iget-object p1, p0, Lcom/tv91/u/a/p/v;->n0:Lcom/tv91/x/h;

    new-instance v0, Lcom/tv91/u/c/g/s$a;

    invoke-direct {v0}, Lcom/tv91/u/c/g/s$a;-><init>()V

    invoke-virtual {p1, v0}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    goto :goto_3

    .line 12
    :pswitch_8
    iget-object p1, p0, Lcom/tv91/u/a/p/v;->n0:Lcom/tv91/x/h;

    new-instance v0, Lcom/tv91/u/h/h/r$b;

    sget-object v1, Lcom/tv91/u/h/c;->c:Lcom/tv91/u/h/c;

    invoke-direct {v0, v1}, Lcom/tv91/u/h/h/r$b;-><init>(Lcom/tv91/u/h/c;)V

    invoke-virtual {p1, v0}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    goto :goto_3

    :pswitch_9
    const/4 p1, 0x1

    .line 13
    iput-boolean p1, p0, Lcom/tv91/u/a/p/v;->q0:Z

    .line 14
    iget-object p1, p0, Lcom/tv91/u/a/p/v;->n0:Lcom/tv91/x/h;

    iget-boolean v0, p0, Lcom/tv91/u/a/p/v;->p0:Z

    if-eqz v0, :cond_2

    new-instance v0, Lcom/tv91/features/authentication/r/w$a;

    invoke-direct {v0}, Lcom/tv91/features/authentication/r/w$a;-><init>()V

    goto :goto_1

    :cond_2
    new-instance v0, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v0}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    :goto_1
    invoke-virtual {p1, v0}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    goto :goto_3

    .line 15
    :pswitch_a
    iget-object p1, p0, Lcom/tv91/u/a/p/v;->n0:Lcom/tv91/x/h;

    iget-boolean v0, p0, Lcom/tv91/u/a/p/v;->p0:Z

    if-eqz v0, :cond_3

    new-instance v0, Lcom/tv91/u/h/i/y$a;

    invoke-direct {v0}, Lcom/tv91/u/h/i/y$a;-><init>()V

    goto :goto_2

    :cond_3
    new-instance v0, Lcom/tv91/features/authentication/AuthActivity$a;

    invoke-direct {v0}, Lcom/tv91/features/authentication/AuthActivity$a;-><init>()V

    :goto_2
    invoke-virtual {p1, v0}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private a3()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tv91/u/a/j;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->O1()Landroid/content/Context;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 3
    sget-object v2, Lcom/tv91/u/a/j;->a:Lcom/tv91/u/a/j;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object v3, p0, Lcom/tv91/u/a/p/v;->o0:Lcom/tv91/model/User;

    iget-boolean v4, v3, Lcom/tv91/model/User;->isVip:Z

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_0

    sget-object v4, Lcom/tv91/u/a/j;->d:Lcom/tv91/u/a/j;

    new-array v7, v5, [Ljava/lang/Object;

    iget-object v3, v3, Lcom/tv91/model/User;->vipDate:Ljava/util/Date;

    const-string v8, "yyyy/MM/dd"

    .line 5
    invoke-static {v3, v8}, Lcom/tv91/utils/a;->b(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v7, v6

    invoke-virtual {v4, v0, v7}, Lcom/tv91/u/a/j;->b(Landroid/content/Context;[Ljava/lang/Object;)Lcom/tv91/u/a/j;

    move-result-object v3

    goto :goto_0

    :cond_0
    sget-object v3, Lcom/tv91/u/a/j;->c:Lcom/tv91/u/a/j;

    new-array v4, v6, [Ljava/lang/Object;

    .line 6
    invoke-virtual {v3, v0, v4}, Lcom/tv91/u/a/j;->b(Landroid/content/Context;[Ljava/lang/Object;)Lcom/tv91/u/a/j;

    move-result-object v3

    .line 7
    :goto_0
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    iget-object v3, p0, Lcom/tv91/u/a/p/v;->o0:Lcom/tv91/model/User;

    iget-boolean v4, v3, Lcom/tv91/model/User;->isCertified:Z

    if-eqz v4, :cond_1

    sget-object v4, Lcom/tv91/u/a/j;->f:Lcom/tv91/u/a/j;

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v3, v3, Lcom/tv91/model/User;->phone:Ljava/lang/String;

    aput-object v3, v5, v6

    .line 9
    invoke-virtual {v4, v0, v5}, Lcom/tv91/u/a/j;->b(Landroid/content/Context;[Ljava/lang/Object;)Lcom/tv91/u/a/j;

    move-result-object v3

    goto :goto_1

    :cond_1
    sget-object v3, Lcom/tv91/u/a/j;->e:Lcom/tv91/u/a/j;

    new-array v4, v6, [Ljava/lang/Object;

    .line 10
    invoke-virtual {v3, v0, v4}, Lcom/tv91/u/a/j;->b(Landroid/content/Context;[Ljava/lang/Object;)Lcom/tv91/u/a/j;

    move-result-object v3

    .line 11
    :goto_1
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    sget-object v3, Lcom/tv91/u/a/j;->g:Lcom/tv91/u/a/j;

    new-array v4, v6, [Ljava/lang/Object;

    invoke-virtual {v3, v0, v4}, Lcom/tv91/u/a/j;->b(Landroid/content/Context;[Ljava/lang/Object;)Lcom/tv91/u/a/j;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    sget-object v3, Lcom/tv91/u/a/j;->h:Lcom/tv91/u/a/j;

    new-array v4, v6, [Ljava/lang/Object;

    invoke-virtual {v3, v0, v4}, Lcom/tv91/u/a/j;->b(Landroid/content/Context;[Ljava/lang/Object;)Lcom/tv91/u/a/j;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    sget-object v3, Lcom/tv91/u/a/j;->i:Lcom/tv91/u/a/j;

    new-array v4, v6, [Ljava/lang/Object;

    invoke-virtual {v3, v0, v4}, Lcom/tv91/u/a/j;->b(Landroid/content/Context;[Ljava/lang/Object;)Lcom/tv91/u/a/j;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    sget-object v3, Lcom/tv91/u/a/j;->j:Lcom/tv91/u/a/j;

    new-array v4, v6, [Ljava/lang/Object;

    invoke-virtual {v3, v0, v4}, Lcom/tv91/u/a/j;->b(Landroid/content/Context;[Ljava/lang/Object;)Lcom/tv91/u/a/j;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    sget-object v3, Lcom/tv91/u/a/j;->k:Lcom/tv91/u/a/j;

    new-array v4, v6, [Ljava/lang/Object;

    invoke-virtual {v3, v0, v4}, Lcom/tv91/u/a/j;->b(Landroid/content/Context;[Ljava/lang/Object;)Lcom/tv91/u/a/j;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    sget-object v2, Lcom/tv91/u/a/j;->l:Lcom/tv91/u/a/j;

    new-array v3, v6, [Ljava/lang/Object;

    invoke-virtual {v2, v0, v3}, Lcom/tv91/u/a/j;->b(Landroid/content/Context;[Ljava/lang/Object;)Lcom/tv91/u/a/j;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    sget-object v2, Lcom/tv91/u/a/j;->m:Lcom/tv91/u/a/j;

    new-array v3, v6, [Ljava/lang/Object;

    invoke-virtual {v2, v0, v3}, Lcom/tv91/u/a/j;->b(Landroid/content/Context;[Ljava/lang/Object;)Lcom/tv91/u/a/j;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    sget-object v2, Lcom/tv91/u/a/j;->n:Lcom/tv91/u/a/j;

    new-array v3, v6, [Ljava/lang/Object;

    invoke-virtual {v2, v0, v3}, Lcom/tv91/u/a/j;->b(Landroid/content/Context;[Ljava/lang/Object;)Lcom/tv91/u/a/j;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    sget-object v2, Lcom/tv91/u/a/j;->o:Lcom/tv91/u/a/j;

    new-array v3, v6, [Ljava/lang/Object;

    invoke-virtual {v2, v0, v3}, Lcom/tv91/u/a/j;->b(Landroid/content/Context;[Ljava/lang/Object;)Lcom/tv91/u/a/j;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v1
.end method

.method private u2()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tv91/u/a/j;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->O1()Landroid/content/Context;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 3
    sget-object v2, Lcom/tv91/u/a/j;->c:Lcom/tv91/u/a/j;

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual {v2, v0, v4}, Lcom/tv91/u/a/j;->b(Landroid/content/Context;[Ljava/lang/Object;)Lcom/tv91/u/a/j;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    sget-object v2, Lcom/tv91/u/a/j;->a:Lcom/tv91/u/a/j;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    sget-object v2, Lcom/tv91/u/a/j;->l:Lcom/tv91/u/a/j;

    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual {v2, v0, v4}, Lcom/tv91/u/a/j;->b(Landroid/content/Context;[Ljava/lang/Object;)Lcom/tv91/u/a/j;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    sget-object v2, Lcom/tv91/u/a/j;->m:Lcom/tv91/u/a/j;

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v2, v0, v3}, Lcom/tv91/u/a/j;->b(Landroid/content/Context;[Ljava/lang/Object;)Lcom/tv91/u/a/j;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v1
.end method

.method public static synthetic v2(Lcom/tv91/u/a/p/v;Lcom/tv91/u/a/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/a/p/v;->Z2(Lcom/tv91/u/a/j;)V

    return-void
.end method

.method private synthetic w2(Lcom/tv91/s/c;)V
    .locals 3

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/tv91/u/a/p/v;->p0:Z

    .line 2
    new-instance v0, Lcom/tv91/u/a/p/j;

    invoke-direct {v0, p0}, Lcom/tv91/u/a/p/j;-><init>(Lcom/tv91/u/a/p/v;)V

    invoke-static {v0}, Lcom/tv91/q/a/g;->d(Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/a/p/p;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/p/p;-><init>(Lcom/tv91/u/a/p/v;)V

    const-string v2, "NotLogin"

    .line 3
    invoke-virtual {v0, v2, v1}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/a/p/f;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/p/f;-><init>(Lcom/tv91/u/a/p/v;)V

    const-string v2, "0000001"

    .line 4
    invoke-virtual {v0, v2, v1}, Lcom/tv91/q/a/g;->c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    return-void
.end method

.method private synthetic y2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/p/v;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/k;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/tv91/u/a/k;->a(Z)V

    return-void
.end method


# virtual methods
.method public synthetic B2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/a/p/v;->A2()V

    return-void
.end method

.method public synthetic D2(Lcom/tv91/model/User;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/a/p/v;->C2(Lcom/tv91/model/User;)V

    return-void
.end method

.method public synthetic F2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/a/p/v;->E2()V

    return-void
.end method

.method public synthetic I2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/a/p/v;->H2()V

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

    iput-object p1, p0, Lcom/tv91/u/a/p/v;->n0:Lcom/tv91/x/h;

    return-void
.end method

.method public synthetic K2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/a/p/v;->J2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic M2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/a/p/v;->L2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic O2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/a/p/v;->N2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic Q2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/a/p/v;->P2()V

    return-void
.end method

.method public synthetic S2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/a/p/v;->R2()V

    return-void
.end method

.method public synthetic U2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/a/p/v;->T2()V

    return-void
.end method

.method public synthetic W2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/a/p/v;->V2()V

    return-void
.end method

.method public X2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/p/v;->k0:Lcom/tv91/features/authentication/q/w;

    new-instance v1, Lcom/tv91/u/a/p/k;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/p/k;-><init>(Lcom/tv91/u/a/p/v;)V

    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/w;->w(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/w;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/a/p/m;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/p/m;-><init>(Lcom/tv91/u/a/p/v;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/w;->v(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/w;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/a/p/o;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/p/o;-><init>(Lcom/tv91/u/a/p/v;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/w;->x(Lb/g/j/a;)Lcom/tv91/features/authentication/q/w;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/a/p/d;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/p/d;-><init>(Lcom/tv91/u/a/p/v;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/w;->u(Lb/g/j/a;)Lcom/tv91/features/authentication/q/w;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/tv91/features/authentication/q/w;->o()V

    return-void
.end method

.method public Y2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/p/v;->l0:Lcom/tv91/features/authentication/q/y;

    new-instance v1, Lcom/tv91/u/a/p/q;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/p/q;-><init>(Lcom/tv91/u/a/p/v;)V

    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/q/y;->u(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/y;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/tv91/features/authentication/q/y;->o()V

    return-void
.end method

.method public g1()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/tv91/u/a/d;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/p/v;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/k;

    new-instance v1, Lcom/tv91/u/a/p/n;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/p/n;-><init>(Lcom/tv91/u/a/p/v;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/a/k;->i(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/a/p/v;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/k;

    new-instance v1, Lcom/tv91/u/a/p/h;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/p/h;-><init>(Lcom/tv91/u/a/p/v;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/a/k;->h(Ljava/lang/Runnable;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/a/p/v;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/k;

    new-instance v1, Lcom/tv91/u/a/p/l;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/p/l;-><init>(Lcom/tv91/u/a/p/v;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/a/k;->v0(Ljava/lang/Runnable;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/a/p/v;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/k;

    new-instance v1, Lcom/tv91/u/a/p/g;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/p/g;-><init>(Lcom/tv91/u/a/p/v;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/a/k;->f2(Ljava/lang/Runnable;)V

    .line 6
    iget-object v0, p0, Lcom/tv91/u/a/p/v;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/k;

    new-instance v1, Lcom/tv91/u/a/p/i;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/p/i;-><init>(Lcom/tv91/u/a/p/v;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/a/k;->B(Lb/g/j/a;)V

    .line 7
    iget-boolean v0, p0, Lcom/tv91/u/a/p/v;->q0:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/tv91/u/a/p/v;->o0:Lcom/tv91/model/User;

    if-nez v0, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/a/p/v;->m0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/k;

    iget-object v1, p0, Lcom/tv91/u/a/p/v;->o0:Lcom/tv91/model/User;

    invoke-direct {p0}, Lcom/tv91/u/a/p/v;->a3()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/tv91/u/a/k;->y0(Lcom/tv91/model/User;Ljava/util/List;)V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/tv91/u/a/p/v;->q0:Z

    .line 10
    invoke-virtual {p0}, Lcom/tv91/u/a/p/v;->X2()V

    :goto_1
    return-void
.end method

.method public h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/p/v;->k0:Lcom/tv91/features/authentication/q/w;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/a/p/v;->l0:Lcom/tv91/features/authentication/q/y;

    invoke-virtual {v0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method

.method protected n2()Lcom/tv91/u/a/h;
    .locals 1

    .line 1
    sget-object v0, Lcom/tv91/u/a/h;->e:Lcom/tv91/u/a/h;

    return-object v0
.end method

.method protected o2()Lcom/tv91/features/shared/ViewSupplier;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/a/k;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/p/v;->m0:Lcom/tv91/features/shared/ViewSupplier;

    return-object v0
.end method

.method public synthetic x2(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/a/p/v;->w2(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic z2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/a/p/v;->y2()V

    return-void
.end method
