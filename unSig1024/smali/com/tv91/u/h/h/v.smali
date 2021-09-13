.class final Lcom/tv91/u/h/h/v;
.super Lcom/tv91/features/shared/f;
.source "PurchaseHistoryView.java"

# interfaces
.implements Lcom/tv91/u/h/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/h/h/v$c;,
        Lcom/tv91/u/h/h/v$d;,
        Lcom/tv91/u/h/h/v$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/f;",
        "Lcom/tv91/u/h/e<",
        "Lcom/tv91/model/PurchaseHistory;",
        ">;"
    }
.end annotation


# instance fields
.field private final e:Z

.field private final f:Lcom/tv91/r/u0;

.field private final g:Lcom/tv91/features/shared/g;

.field private final h:Lcom/tv91/u/h/h/v$b;


# direct methods
.method constructor <init>(Lcom/tv91/r/u0;Lcom/tv91/u/h/c;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/f;-><init>(Lb/r/a;)V

    .line 2
    sget-object v0, Lcom/tv91/u/h/c;->b:Lcom/tv91/u/h/c;

    if-ne p2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/tv91/u/h/h/v;->e:Z

    .line 3
    iput-object p1, p0, Lcom/tv91/u/h/h/v;->f:Lcom/tv91/r/u0;

    .line 4
    new-instance v1, Lcom/tv91/features/shared/g;

    iget-object v2, p1, Lcom/tv91/r/u0;->p:Lcom/tv91/r/y;

    invoke-direct {v1, v2}, Lcom/tv91/features/shared/g;-><init>(Lcom/tv91/r/y;)V

    iput-object v1, p0, Lcom/tv91/u/h/h/v;->g:Lcom/tv91/features/shared/g;

    .line 5
    new-instance v2, Lcom/tv91/u/h/h/v$b;

    invoke-direct {v2, v0}, Lcom/tv91/u/h/h/v$b;-><init>(Z)V

    iput-object v2, p0, Lcom/tv91/u/h/h/v;->h:Lcom/tv91/u/h/h/v$b;

    .line 6
    sget-object v3, Lcom/tv91/u/h/c;->a:Lcom/tv91/u/h/c;

    if-ne p2, v3, :cond_1

    const p2, 0x7f1201b2

    goto :goto_1

    :cond_1
    const p2, 0x7f1201ad

    :goto_1
    invoke-virtual {v1, p2}, Lcom/tv91/features/shared/g;->p(I)V

    .line 7
    iget-object p2, p1, Lcom/tv91/r/u0;->l:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    if-eqz v0, :cond_2

    .line 8
    iget-object p2, p1, Lcom/tv91/r/u0;->h:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9
    iget-object p2, p1, Lcom/tv91/r/u0;->g:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 10
    iget-object p2, p1, Lcom/tv91/r/u0;->i:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 11
    iget-object p2, p1, Lcom/tv91/r/u0;->k:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    iget-object p2, p1, Lcom/tv91/r/u0;->j:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 13
    iget-object p1, p1, Lcom/tv91/r/u0;->l:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, Landroidx/recyclerview/widget/GridLayoutManager;

    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    const/4 v1, 0x2

    invoke-direct {p2, v0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    goto :goto_2

    .line 14
    :cond_2
    iget-object p2, p1, Lcom/tv91/r/u0;->l:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 15
    iget-object p2, p1, Lcom/tv91/r/u0;->l:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result p2

    if-nez p2, :cond_3

    .line 16
    iget-object p1, p1, Lcom/tv91/r/u0;->l:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Lcom/tv91/u/h/h/v;->q2()Landroidx/recyclerview/widget/RecyclerView$n;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->h(Landroidx/recyclerview/widget/RecyclerView$n;)V

    :cond_3
    :goto_2
    return-void
.end method

.method private q2()Landroidx/recyclerview/widget/RecyclerView$n;
    .locals 3

    .line 1
    new-instance v0, Landroidx/recyclerview/widget/d;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/d;-><init>(Landroid/content/Context;I)V

    const v1, 0x7f080122

    .line 2
    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/f;->n2(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/d;->l(Landroid/graphics/drawable/Drawable;)V

    return-object v0
.end method


# virtual methods
.method public H(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/model/PurchaseHistory;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/tv91/u/h/h/v;->f:Lcom/tv91/r/u0;

    iget-object p1, p1, Lcom/tv91/r/u0;->h:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3
    iget-object p1, p0, Lcom/tv91/u/h/h/v;->f:Lcom/tv91/r/u0;

    iget-object p1, p1, Lcom/tv91/r/u0;->g:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget-object p1, p0, Lcom/tv91/u/h/h/v;->f:Lcom/tv91/r/u0;

    iget-object p1, p1, Lcom/tv91/r/u0;->i:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 5
    iget-object p1, p0, Lcom/tv91/u/h/h/v;->f:Lcom/tv91/r/u0;

    iget-object p1, p1, Lcom/tv91/r/u0;->k:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 6
    iget-object p1, p0, Lcom/tv91/u/h/h/v;->f:Lcom/tv91/r/u0;

    iget-object p1, p1, Lcom/tv91/r/u0;->j:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 7
    iget-object p1, p0, Lcom/tv91/u/h/h/v;->f:Lcom/tv91/r/u0;

    iget-object p1, p1, Lcom/tv91/r/u0;->n:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 8
    :cond_0
    iget-boolean v0, p0, Lcom/tv91/u/h/h/v;->e:Z

    if-nez v0, :cond_1

    .line 9
    iget-object v0, p0, Lcom/tv91/u/h/h/v;->f:Lcom/tv91/r/u0;

    iget-object v0, v0, Lcom/tv91/r/u0;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 10
    iget-object v0, p0, Lcom/tv91/u/h/h/v;->f:Lcom/tv91/r/u0;

    iget-object v0, v0, Lcom/tv91/r/u0;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 11
    iget-object v0, p0, Lcom/tv91/u/h/h/v;->f:Lcom/tv91/r/u0;

    iget-object v0, v0, Lcom/tv91/r/u0;->i:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    iget-object v0, p0, Lcom/tv91/u/h/h/v;->f:Lcom/tv91/r/u0;

    iget-object v0, v0, Lcom/tv91/r/u0;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 13
    iget-object v0, p0, Lcom/tv91/u/h/h/v;->f:Lcom/tv91/r/u0;

    iget-object v0, v0, Lcom/tv91/r/u0;->j:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 14
    :cond_1
    iget-object v0, p0, Lcom/tv91/u/h/h/v;->h:Lcom/tv91/u/h/h/v$b;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->x(Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public J(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/h/v;->f:Lcom/tv91/r/u0;

    iget-object v0, v0, Lcom/tv91/r/u0;->l:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/h/c;->d(Landroidx/recyclerview/widget/RecyclerView;Landroid/os/Bundle;)V

    return-void
.end method

.method public S0(Lb/g/j/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/h/v;->h:Lcom/tv91/u/h/h/v$b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/tv91/u/h/h/a;

    invoke-direct {v1, p1}, Lcom/tv91/u/h/h/a;-><init>(Lb/g/j/a;)V

    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/h/v;->f:Lcom/tv91/r/u0;

    iget-object v0, v0, Lcom/tv91/r/u0;->f:Landroid/widget/ProgressBar;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method

.method public b(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/h/v;->g:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->i(Ljava/lang/Runnable;)V

    return-void
.end method

.method public g0(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/widget/e;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public h2(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/h/v;->g:Lcom/tv91/features/shared/g;

    invoke-virtual {v0}, Lcom/tv91/features/shared/g;->b()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/h/h/v;->f:Lcom/tv91/r/u0;

    iget-object v0, v0, Lcom/tv91/r/u0;->l:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/h/c;->f(Landroidx/recyclerview/widget/RecyclerView;Landroid/os/Bundle;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/u/h/h/v;->h:Lcom/tv91/u/h/h/v$b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/h/b;->z(Z)V

    .line 4
    iget-object p1, p0, Lcom/tv91/u/h/h/v;->h:Lcom/tv91/u/h/h/v$b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    return-void
.end method

.method public s0(ILjava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/h/v;->f:Lcom/tv91/r/u0;

    iget-object v0, v0, Lcom/tv91/r/u0;->l:Landroidx/recyclerview/widget/RecyclerView;

    sget-object v1, Lcom/tv91/features/shared/i/i;->d:Lcom/tv91/features/shared/i/i;

    .line 2
    invoke-virtual {v1, p1, p2}, Lcom/tv91/features/shared/i/i;->c(ILjava/lang/Runnable;)Landroidx/recyclerview/widget/RecyclerView$t;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->k(Landroidx/recyclerview/widget/RecyclerView$t;)V

    return-void
.end method
