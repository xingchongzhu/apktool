.class Lcom/tv91/u/c/i/e0;
.super Lcom/tv91/features/shared/f;
.source "MoviesView.java"

# interfaces
.implements Lcom/tv91/u/c/d$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/c/i/e0$d;,
        Lcom/tv91/u/c/i/e0$c;,
        Lcom/tv91/u/c/i/e0$e;,
        Lcom/tv91/u/c/i/e0$b;,
        Lcom/tv91/u/c/i/e0$a;
    }
.end annotation


# instance fields
.field private final e:Lcom/tv91/r/u;

.field private final f:Lcom/tv91/features/shared/g;

.field private final g:Lcom/tv91/u/c/i/e0$a;

.field private final h:I


# direct methods
.method constructor <init>(Lcom/tv91/r/u;Ljava/lang/String;Lcom/tv91/u/c/i/e0$e;I)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/f;-><init>(Lb/r/a;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/u/c/i/e0;->e:Lcom/tv91/r/u;

    .line 3
    new-instance v0, Lcom/tv91/features/shared/g;

    iget-object v1, p1, Lcom/tv91/r/u;->e:Lcom/tv91/r/y;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/g;-><init>(Lcom/tv91/r/y;)V

    iput-object v0, p0, Lcom/tv91/u/c/i/e0;->f:Lcom/tv91/features/shared/g;

    .line 4
    iput p4, p0, Lcom/tv91/u/c/i/e0;->h:I

    .line 5
    invoke-static {p2}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result p4

    xor-int/lit8 p4, p4, 0x1

    invoke-virtual {v0, p4}, Lcom/tv91/features/shared/g;->r(Z)V

    .line 6
    invoke-virtual {v0, p2}, Lcom/tv91/features/shared/g;->q(Ljava/lang/String;)V

    .line 7
    iget-object p2, p1, Lcom/tv91/r/u;->d:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p4, Lcom/tv91/u/c/i/e0$a;

    invoke-direct {p4, p3}, Lcom/tv91/u/c/i/e0$a;-><init>(Lcom/tv91/u/c/i/e0$e;)V

    iput-object p4, p0, Lcom/tv91/u/c/i/e0;->g:Lcom/tv91/u/c/i/e0$a;

    invoke-virtual {p2, p4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    .line 8
    iget-object p1, p1, Lcom/tv91/r/u;->d:Landroidx/recyclerview/widget/RecyclerView;

    sget-object p2, Lcom/tv91/u/c/i/e0$e;->a:Lcom/tv91/u/c/i/e0$e;

    if-ne p3, p2, :cond_0

    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object p3, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    new-instance p2, Landroidx/recyclerview/widget/GridLayoutManager;

    iget-object p3, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    const/4 p4, 0x2

    invoke-direct {p2, p3, p4}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    :goto_0
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    return-void
.end method


# virtual methods
.method public J(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/i/e0;->e:Lcom/tv91/r/u;

    iget-object v0, v0, Lcom/tv91/r/u;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/h/c;->d(Landroidx/recyclerview/widget/RecyclerView;Landroid/os/Bundle;)V

    return-void
.end method

.method public T(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/model/Movie;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/i/e0;->g:Lcom/tv91/u/c/i/e0$a;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->x(Ljava/util/List;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/i/e0;->e:Lcom/tv91/r/u;

    iget-object v0, v0, Lcom/tv91/r/u;->c:Landroid/widget/ProgressBar;

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
    iget-object v0, p0, Lcom/tv91/u/c/i/e0;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->i(Ljava/lang/Runnable;)V

    return-void
.end method

.method public c(Ljava/lang/Runnable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/i/e0;->e:Lcom/tv91/r/u;

    iget-object v0, v0, Lcom/tv91/r/u;->d:Landroidx/recyclerview/widget/RecyclerView;

    sget-object v1, Lcom/tv91/features/shared/i/i;->d:Lcom/tv91/features/shared/i/i;

    iget v2, p0, Lcom/tv91/u/c/i/e0;->h:I

    invoke-virtual {v1, v2, p1}, Lcom/tv91/features/shared/i/i;->c(ILjava/lang/Runnable;)Landroidx/recyclerview/widget/RecyclerView$t;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->k(Landroidx/recyclerview/widget/RecyclerView$t;)V

    return-void
.end method

.method public e(Lb/g/j/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/Movie;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/i/e0;->g:Lcom/tv91/u/c/i/e0$a;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

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
    iget-object v0, p0, Lcom/tv91/u/c/i/e0;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {v0}, Lcom/tv91/features/shared/g;->b()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/i/e0;->e:Lcom/tv91/r/u;

    iget-object v0, v0, Lcom/tv91/r/u;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/h/c;->f(Landroidx/recyclerview/widget/RecyclerView;Landroid/os/Bundle;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/u/c/i/e0;->g:Lcom/tv91/u/c/i/e0$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/h/b;->z(Z)V

    .line 4
    iget-object p1, p0, Lcom/tv91/u/c/i/e0;->g:Lcom/tv91/u/c/i/e0$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    .line 5
    iget-object p1, p0, Lcom/tv91/u/c/i/e0;->e:Lcom/tv91/r/u;

    iget-object p1, p1, Lcom/tv91/r/u;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->t()V

    return-void
.end method
