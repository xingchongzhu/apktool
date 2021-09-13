.class final Lcom/tv91/u/a/q/k;
.super Lcom/tv91/u/a/e;
.source "PromotionView.java"

# interfaces
.implements Lcom/tv91/u/a/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/a/q/k$c;,
        Lcom/tv91/u/a/q/k$b;
    }
.end annotation


# instance fields
.field private final g:Lcom/tv91/r/p0;

.field private final h:Lcom/tv91/features/shared/g;

.field private final i:Lcom/tv91/u/a/q/k$b;


# direct methods
.method constructor <init>(Lcom/tv91/r/p0;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/tv91/u/a/h;->d:Lcom/tv91/u/a/h;

    iget-object v1, p1, Lcom/tv91/r/p0;->c:Landroid/widget/LinearLayout;

    invoke-static {v1}, Lcom/tv91/r/w;->b(Landroid/view/View;)Lcom/tv91/r/w;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/tv91/u/a/e;-><init>(Lcom/tv91/u/a/h;Lcom/tv91/r/w;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/u/a/q/k;->g:Lcom/tv91/r/p0;

    .line 3
    new-instance v0, Lcom/tv91/features/shared/g;

    iget-object v1, p1, Lcom/tv91/r/p0;->h:Lcom/tv91/r/y;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/g;-><init>(Lcom/tv91/r/y;)V

    iput-object v0, p0, Lcom/tv91/u/a/q/k;->h:Lcom/tv91/features/shared/g;

    .line 4
    new-instance v1, Lcom/tv91/u/a/q/k$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/tv91/u/a/q/k$b;-><init>(Lcom/tv91/u/a/q/k$a;)V

    iput-object v1, p0, Lcom/tv91/u/a/q/k;->i:Lcom/tv91/u/a/q/k$b;

    const v2, 0x7f120193

    .line 5
    invoke-virtual {v0, v2}, Lcom/tv91/features/shared/g;->p(I)V

    const v2, 0x7f0e0004

    .line 6
    invoke-virtual {v0, v2}, Lcom/tv91/features/shared/g;->c(I)V

    .line 7
    iget-object p1, p1, Lcom/tv91/r/p0;->e:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    return-void
.end method


# virtual methods
.method public D1(Lb/g/j/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/Promotion;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/q/k;->i:Lcom/tv91/u/a/q/k$b;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    return-void
.end method

.method public J(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/q/k;->h:Lcom/tv91/features/shared/g;

    invoke-virtual {v0}, Lcom/tv91/features/shared/g;->a()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/q/k;->g:Lcom/tv91/r/p0;

    iget-object v0, v0, Lcom/tv91/r/p0;->e:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/h/c;->d(Landroidx/recyclerview/widget/RecyclerView;Landroid/os/Bundle;)V

    return-void
.end method

.method public P1(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/model/Promotion;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/q/k;->g:Lcom/tv91/r/p0;

    iget-object v0, v0, Lcom/tv91/r/p0;->f:Landroid/widget/TextView;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/tv91/u/a/q/k;->i:Lcom/tv91/u/a/q/k$b;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->x(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public g0(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/widget/e;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public h(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/q/k;->h:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->n(Ljava/lang/Runnable;)V

    return-void
.end method

.method public h2(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/tv91/u/a/e;->h2(Landroid/os/Bundle;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/q/k;->h:Lcom/tv91/features/shared/g;

    invoke-virtual {v0}, Lcom/tv91/features/shared/g;->b()V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/a/q/k;->g:Lcom/tv91/r/p0;

    iget-object v0, v0, Lcom/tv91/r/p0;->e:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/h/c;->f(Landroidx/recyclerview/widget/RecyclerView;Landroid/os/Bundle;)V

    .line 4
    iget-object p1, p0, Lcom/tv91/u/a/q/k;->i:Lcom/tv91/u/a/q/k$b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/h/b;->z(Z)V

    .line 5
    iget-object p1, p0, Lcom/tv91/u/a/q/k;->i:Lcom/tv91/u/a/q/k$b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    return-void
.end method

.method public i(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/q/k;->h:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->k(Ljava/lang/Runnable;)V

    return-void
.end method
