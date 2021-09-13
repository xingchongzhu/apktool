.class public final Lcom/tv91/u/f/c/p;
.super Lcom/tv91/x/f;
.source "FeedbackDetailFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/f/c/p$a;
    }
.end annotation


# instance fields
.field private d0:Lcom/tv91/u/f/d/a;

.field private e0:Lcom/tv91/r/g0;


# direct methods
.method public constructor <init>()V
    .locals 1

    const v0, 0x7f0d00a9

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/x/f;-><init>(I)V

    return-void
.end method

.method private synthetic m2()V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/tv91/x/h;->b(Landroidx/fragment/app/Fragment;)Lcom/tv91/x/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    return-void
.end method


# virtual methods
.method public J0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->J0(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Lcom/tv91/x/f;->l2()Lcom/tv91/x/c;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/f/c/p$a;

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroidx/lifecycle/f;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/shared/UmengObserver;

    invoke-virtual {p1}, Lcom/tv91/x/c;->m()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/tv91/features/shared/UmengObserver;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/h;)V

    .line 4
    invoke-static {p1}, Lcom/tv91/u/f/c/p$a;->r(Lcom/tv91/u/f/c/p$a;)Lcom/tv91/u/f/d/a;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/f/c/p;->d0:Lcom/tv91/u/f/d/a;

    return-void
.end method

.method public g1()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/f/c/p;->e0:Lcom/tv91/r/g0;

    iget-object v0, v0, Lcom/tv91/r/g0;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/tv91/u/f/c/p;->d0:Lcom/tv91/u/f/d/a;

    iget-object v1, v1, Lcom/tv91/u/f/d/a;->c:Ljava/util/Date;

    const-string v2, "yyyy/MM/dd"

    invoke-static {v1, v2}, Lcom/tv91/utils/a;->b(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/f/c/p;->d0:Lcom/tv91/u/f/d/a;

    iget-object v0, v0, Lcom/tv91/u/f/d/a;->b:Ljava/lang/String;

    const-string v1, ":\n"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 4
    iget-object v0, p0, Lcom/tv91/u/f/c/p;->e0:Lcom/tv91/r/g0;

    iget-object v0, v0, Lcom/tv91/r/g0;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/tv91/u/f/c/p;->d0:Lcom/tv91/u/f/d/a;

    iget-object v1, v1, Lcom/tv91/u/f/d/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/tv91/u/f/c/p;->e0:Lcom/tv91/r/g0;

    iget-object v1, v1, Lcom/tv91/r/g0;->d:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/tv91/u/f/c/p;->d0:Lcom/tv91/u/f/d/a;

    iget-object v3, v3, Lcom/tv91/u/f/d/a;->b:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {v3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    :goto_0
    iget-object v0, p0, Lcom/tv91/u/f/c/p;->e0:Lcom/tv91/r/g0;

    iget-object v0, v0, Lcom/tv91/r/g0;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/tv91/u/f/c/p;->d0:Lcom/tv91/u/f/d/a;

    iget-object v1, v1, Lcom/tv91/u/f/d/a;->e:Ljava/util/Date;

    .line 7
    invoke-static {v1, v2}, Lcom/tv91/utils/a;->b(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v0, p0, Lcom/tv91/u/f/c/p;->e0:Lcom/tv91/r/g0;

    iget-object v0, v0, Lcom/tv91/r/g0;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/tv91/u/f/c/p;->d0:Lcom/tv91/u/f/d/a;

    iget-object v1, v1, Lcom/tv91/u/f/d/a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public i1(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->i1(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    invoke-static {p1}, Lcom/tv91/r/g0;->b(Landroid/view/View;)Lcom/tv91/r/g0;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/f/c/p;->e0:Lcom/tv91/r/g0;

    .line 3
    new-instance p2, Lcom/tv91/features/shared/g;

    iget-object p1, p1, Lcom/tv91/r/g0;->j:Lcom/tv91/r/y;

    invoke-direct {p2, p1}, Lcom/tv91/features/shared/g;-><init>(Lcom/tv91/r/y;)V

    const p1, 0x7f1200c7

    .line 4
    invoke-virtual {p2, p1}, Lcom/tv91/features/shared/g;->p(I)V

    .line 5
    new-instance p1, Lcom/tv91/u/f/c/a;

    invoke-direct {p1, p0}, Lcom/tv91/u/f/c/a;-><init>(Lcom/tv91/u/f/c/p;)V

    invoke-virtual {p2, p1}, Lcom/tv91/features/shared/g;->i(Ljava/lang/Runnable;)V

    .line 6
    iget-object p1, p0, Lcom/tv91/u/f/c/p;->e0:Lcom/tv91/r/g0;

    iget-object p1, p1, Lcom/tv91/r/g0;->d:Landroid/widget/TextView;

    new-instance p2, Landroid/text/method/ScrollingMovementMethod;

    invoke-direct {p2}, Landroid/text/method/ScrollingMovementMethod;-><init>()V

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 7
    iget-object p1, p0, Lcom/tv91/u/f/c/p;->e0:Lcom/tv91/r/g0;

    iget-object p1, p1, Lcom/tv91/r/g0;->f:Landroid/widget/TextView;

    new-instance p2, Landroid/text/method/ScrollingMovementMethod;

    invoke-direct {p2}, Landroid/text/method/ScrollingMovementMethod;-><init>()V

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    return-void
.end method

.method public synthetic n2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/f/c/p;->m2()V

    return-void
.end method
