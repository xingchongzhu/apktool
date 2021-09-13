.class public final Lcom/tv91/u/c/i/c0;
.super Lcom/tv91/u/c/i/v;
.source "MoviesByRankFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/c/i/c0$b;
    }
.end annotation


# instance fields
.field private o0:Lcom/tv91/model/c;

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

    iget-object v1, p0, Lcom/tv91/u/c/i/c0;->p0:Ljava/lang/String;

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

    check-cast p1, Lcom/tv91/u/c/i/c0$b;

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroidx/lifecycle/f;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/shared/UmengObserver;

    invoke-virtual {p1}, Lcom/tv91/x/c;->m()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/tv91/features/shared/UmengObserver;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/h;)V

    .line 4
    invoke-static {p1}, Lcom/tv91/u/c/i/c0$b;->r(Lcom/tv91/u/c/i/c0$b;)Lcom/tv91/model/c;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/c/i/c0;->o0:Lcom/tv91/model/c;

    .line 5
    sget-object v0, Lcom/tv91/u/c/i/c0$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const p1, 0x7f120121

    .line 6
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->i0(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/c/i/c0;->p0:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const p1, 0x7f12011d

    .line 7
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->i0(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/c/i/c0;->p0:Ljava/lang/String;

    goto :goto_0

    :cond_1
    const p1, 0x7f12011f

    .line 8
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->i0(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/c/i/c0;->p0:Ljava/lang/String;

    :goto_0
    return-void
.end method

.method protected T2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/i/c0;->o0:Lcom/tv91/model/c;

    invoke-virtual {p0, v0}, Lcom/tv91/u/c/i/v;->X2(Lcom/tv91/model/c;)V

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
    new-instance v0, Lcom/tv91/u/c/i/s;

    invoke-direct {v0, p0}, Lcom/tv91/u/c/i/s;-><init>(Lcom/tv91/u/c/i/c0;)V

    return-object v0
.end method

.method public synthetic b3(Landroid/view/View;)Lcom/tv91/u/c/d$a;
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/i/c0;->a3(Landroid/view/View;)Lcom/tv91/u/c/d$a;

    move-result-object p1

    return-object p1
.end method
