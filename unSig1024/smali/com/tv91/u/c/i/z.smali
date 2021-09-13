.class public final Lcom/tv91/u/c/i/z;
.super Lcom/tv91/u/c/i/v;
.source "MoviesByActorFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/c/i/z$a;
    }
.end annotation


# instance fields
.field private o0:I

.field private p0:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    const v0, 0x7f0d0051

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/u/c/i/v;-><init>(I)V

    return-void
.end method

.method private synthetic a3(Landroid/view/View;)Lcom/tv91/u/c/d$a;
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/u/c/i/e0$d;

    invoke-static {p1}, Lcom/tv91/r/u;->b(Landroid/view/View;)Lcom/tv91/r/u;

    move-result-object p1

    iget-object v1, p0, Lcom/tv91/u/c/i/z;->p0:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Lcom/tv91/u/c/i/e0$d;-><init>(Lcom/tv91/r/u;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public J0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lcom/tv91/u/c/i/v;->J0(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Lcom/tv91/x/f;->l2()Lcom/tv91/x/c;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/c/i/z$a;

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroidx/lifecycle/f;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/shared/UmengObserver;

    invoke-virtual {p1}, Lcom/tv91/x/c;->m()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/tv91/features/shared/UmengObserver;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/h;)V

    .line 4
    invoke-static {p1}, Lcom/tv91/u/c/i/z$a;->r(Lcom/tv91/u/c/i/z$a;)I

    move-result v0

    iput v0, p0, Lcom/tv91/u/c/i/z;->o0:I

    .line 5
    invoke-static {p1}, Lcom/tv91/u/c/i/z$a;->s(Lcom/tv91/u/c/i/z$a;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/c/i/z;->p0:Ljava/lang/String;

    return-void
.end method

.method protected T2()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/tv91/u/c/i/z;->o0:I

    sget v1, Lcom/tv91/u/c/d;->a:I

    invoke-virtual {p0, v0, v1}, Lcom/tv91/u/c/i/v;->U2(II)V

    return-void
.end method

.method protected Z2()Lb/b/a/c/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb/b/a/c/a<",
            "Landroid/view/View;",
            "Lcom/tv91/u/c/d$a;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/tv91/u/c/i/p;

    invoke-direct {v0, p0}, Lcom/tv91/u/c/i/p;-><init>(Lcom/tv91/u/c/i/z;)V

    return-object v0
.end method

.method public synthetic b3(Landroid/view/View;)Lcom/tv91/u/c/d$a;
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/i/z;->a3(Landroid/view/View;)Lcom/tv91/u/c/d$a;

    move-result-object p1

    return-object p1
.end method
