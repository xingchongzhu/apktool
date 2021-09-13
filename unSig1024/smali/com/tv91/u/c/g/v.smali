.class final Lcom/tv91/u/c/g/v;
.super Lcom/tv91/features/shared/f;
.source "FavoriteView.java"

# interfaces
.implements Lcom/tv91/u/c/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/c/g/v$c;,
        Lcom/tv91/u/c/g/v$b;
    }
.end annotation


# instance fields
.field private final e:Lcom/tv91/r/e0;

.field private final f:Lcom/tv91/features/shared/g;

.field private final g:Lcom/tv91/u/c/g/v$b;


# direct methods
.method constructor <init>(Lcom/tv91/r/e0;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/f;-><init>(Lb/r/a;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/u/c/g/v;->e:Lcom/tv91/r/e0;

    .line 3
    new-instance v0, Lcom/tv91/features/shared/g;

    iget-object v1, p1, Lcom/tv91/r/e0;->e:Lcom/tv91/r/y;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/g;-><init>(Lcom/tv91/r/y;)V

    iput-object v0, p0, Lcom/tv91/u/c/g/v;->f:Lcom/tv91/features/shared/g;

    .line 4
    new-instance v1, Lcom/tv91/u/c/g/v$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/tv91/u/c/g/v$b;-><init>(Lcom/tv91/u/c/g/v$a;)V

    iput-object v1, p0, Lcom/tv91/u/c/g/v;->g:Lcom/tv91/u/c/g/v$b;

    const v2, 0x7f1200c4

    .line 5
    invoke-virtual {v0, v2}, Lcom/tv91/features/shared/g;->p(I)V

    const v2, 0x7f0e0003

    .line 6
    invoke-virtual {v0, v2}, Lcom/tv91/features/shared/g;->c(I)V

    .line 7
    iget-object v0, p1, Lcom/tv91/r/e0;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    .line 8
    iget-object p1, p1, Lcom/tv91/r/e0;->d:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    return-void
.end method


# virtual methods
.method public H1(Ljava/util/List;)V
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
    iget-object v0, p0, Lcom/tv91/u/c/g/v;->g:Lcom/tv91/u/c/g/v$b;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->x(Ljava/util/List;)V

    return-void
.end method

.method public J(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/g/v;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {v0}, Lcom/tv91/features/shared/g;->a()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/g/v;->e:Lcom/tv91/r/e0;

    iget-object v0, v0, Lcom/tv91/r/e0;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/h/c;->d(Landroidx/recyclerview/widget/RecyclerView;Landroid/os/Bundle;)V

    return-void
.end method

.method public L()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/g/v;->g:Lcom/tv91/u/c/g/v$b;

    invoke-static {v0}, Lcom/tv91/u/c/g/v$b;->M(Lcom/tv91/u/c/g/v$b;)V

    return-void
.end method

.method public Q0(Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f1200c2

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f1200c1

    .line 3
    invoke-virtual {p0, p1, v1}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/widget/e$a;->n(Ljava/lang/String;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const v0, 0x7f120057

    .line 4
    invoke-virtual {p1, v0, p2}, Lcom/tv91/features/shared/widget/e$a;->w(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const p2, 0x7f12004d

    .line 5
    invoke-virtual {p1, p2}, Lcom/tv91/features/shared/widget/e$a;->o(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public W(Lcom/tv91/model/Movie;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/g/v;->g:Lcom/tv91/u/c/g/v$b;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->I(Ljava/lang/Object;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    const v0, 0x7f1200c3

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/g/v;->e:Lcom/tv91/r/e0;

    iget-object v0, v0, Lcom/tv91/r/e0;->c:Landroid/widget/ProgressBar;

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
    iget-object v0, p0, Lcom/tv91/u/c/g/v;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->i(Ljava/lang/Runnable;)V

    return-void
.end method

.method public c(Ljava/lang/Runnable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/g/v;->e:Lcom/tv91/r/e0;

    iget-object v0, v0, Lcom/tv91/r/e0;->d:Landroidx/recyclerview/widget/RecyclerView;

    sget-object v1, Lcom/tv91/features/shared/i/i;->d:Lcom/tv91/features/shared/i/i;

    const/16 v2, 0xa

    .line 2
    invoke-virtual {v1, v2, p1}, Lcom/tv91/features/shared/i/i;->c(ILjava/lang/Runnable;)Landroidx/recyclerview/widget/RecyclerView$t;

    move-result-object p1

    .line 3
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
    iget-object v0, p0, Lcom/tv91/u/c/g/v;->g:Lcom/tv91/u/c/g/v$b;

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
    iget-object v0, p0, Lcom/tv91/u/c/g/v;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {v0}, Lcom/tv91/features/shared/g;->b()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/g/v;->e:Lcom/tv91/r/e0;

    iget-object v0, v0, Lcom/tv91/r/e0;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/h/c;->f(Landroidx/recyclerview/widget/RecyclerView;Landroid/os/Bundle;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/u/c/g/v;->e:Lcom/tv91/r/e0;

    iget-object p1, p1, Lcom/tv91/r/e0;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->t()V

    .line 4
    iget-object p1, p0, Lcom/tv91/u/c/g/v;->g:Lcom/tv91/u/c/g/v$b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/h/b;->z(Z)V

    .line 5
    iget-object p1, p0, Lcom/tv91/u/c/g/v;->g:Lcom/tv91/u/c/g/v$b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    .line 6
    iget-object p1, p0, Lcom/tv91/u/c/g/v;->g:Lcom/tv91/u/c/g/v$b;

    invoke-static {p1, v0}, Lcom/tv91/u/c/g/v$b;->L(Lcom/tv91/u/c/g/v$b;Lb/g/j/a;)V

    return-void
.end method

.method public n(Lb/g/j/a;)V
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
    iget-object v0, p0, Lcom/tv91/u/c/g/v;->g:Lcom/tv91/u/c/g/v$b;

    invoke-static {v0, p1}, Lcom/tv91/u/c/g/v$b;->L(Lcom/tv91/u/c/g/v$b;Lb/g/j/a;)V

    return-void
.end method

.method public o(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/g/v;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->m(Ljava/lang/Runnable;)V

    return-void
.end method
