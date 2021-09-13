.class final Lcom/tv91/features/movie/play/MoviePlayActivity$d;
.super Ljava/lang/Object;
.source "MoviePlayActivity.java"

# interfaces
.implements Lc/a/a/a/l1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/features/movie/play/MoviePlayActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lcom/tv91/features/movie/play/MoviePlayActivity;


# direct methods
.method private constructor <init>(Lcom/tv91/features/movie/play/MoviePlayActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity$d;->a:Lcom/tv91/features/movie/play/MoviePlayActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/features/movie/play/MoviePlayActivity;Lcom/tv91/features/movie/play/MoviePlayActivity$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tv91/features/movie/play/MoviePlayActivity$d;-><init>(Lcom/tv91/features/movie/play/MoviePlayActivity;)V

    return-void
.end method


# virtual methods
.method public synthetic D(Lc/a/a/a/x1;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc/a/a/a/k1;->s(Lc/a/a/a/l1$a;Lc/a/a/a/x1;I)V

    return-void
.end method

.method public G(I)V
    .locals 2

    const/16 v0, 0x80

    const/4 v1, 0x3

    if-ne p1, v1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity$d;->a:Lcom/tv91/features/movie/play/MoviePlayActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity$d;->a:Lcom/tv91/features/movie/play/MoviePlayActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/Window;->clearFlags(I)V

    :goto_0
    return-void
.end method

.method public synthetic H(ZI)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc/a/a/a/k1;->h(Lc/a/a/a/l1$a;ZI)V

    return-void
.end method

.method public synthetic L(Lc/a/a/a/j2/q0;Lc/a/a/a/l2/l;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc/a/a/a/k1;->u(Lc/a/a/a/l1$a;Lc/a/a/a/j2/q0;Lc/a/a/a/l2/l;)V

    return-void
.end method

.method public synthetic P(Z)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->q(Lc/a/a/a/l1$a;Z)V

    return-void
.end method

.method public synthetic R(Lc/a/a/a/l1;Lc/a/a/a/l1$b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc/a/a/a/k1;->a(Lc/a/a/a/l1$a;Lc/a/a/a/l1;Lc/a/a/a/l1$b;)V

    return-void
.end method

.method public synthetic S(Z)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->b(Lc/a/a/a/l1$a;Z)V

    return-void
.end method

.method public synthetic W(Z)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->c(Lc/a/a/a/l1$a;Z)V

    return-void
.end method

.method public synthetic Z(Z)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->e(Lc/a/a/a/l1$a;Z)V

    return-void
.end method

.method public synthetic c(I)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->o(Lc/a/a/a/l1$a;I)V

    return-void
.end method

.method public synthetic e(Lc/a/a/a/i1;)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->i(Lc/a/a/a/l1$a;Lc/a/a/a/i1;)V

    return-void
.end method

.method public synthetic f(I)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->k(Lc/a/a/a/l1$a;I)V

    return-void
.end method

.method public synthetic g(ZI)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc/a/a/a/k1;->m(Lc/a/a/a/l1$a;ZI)V

    return-void
.end method

.method public synthetic i(Z)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->f(Lc/a/a/a/l1$a;Z)V

    return-void
.end method

.method public j(I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity$d;->a:Lcom/tv91/features/movie/play/MoviePlayActivity;

    invoke-static {p1}, Lcom/tv91/features/movie/play/MoviePlayActivity;->N(Lcom/tv91/features/movie/play/MoviePlayActivity;)Lc/a/a/a/v1;

    move-result-object p1

    invoke-virtual {p1}, Lc/a/a/a/v1;->e()Lc/a/a/a/p0;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity$d;->a:Lcom/tv91/features/movie/play/MoviePlayActivity;

    invoke-static {p1}, Lcom/tv91/features/movie/play/MoviePlayActivity;->O(Lcom/tv91/features/movie/play/MoviePlayActivity;)V

    :cond_0
    return-void
.end method

.method public synthetic o(Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->r(Lc/a/a/a/l1$a;Ljava/util/List;)V

    return-void
.end method

.method public synthetic q(Lc/a/a/a/x1;Ljava/lang/Object;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lc/a/a/a/k1;->t(Lc/a/a/a/l1$a;Lc/a/a/a/x1;Ljava/lang/Object;I)V

    return-void
.end method

.method public r(Lc/a/a/a/p0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity$d;->a:Lcom/tv91/features/movie/play/MoviePlayActivity;

    invoke-static {v0, p1}, Lcom/tv91/features/movie/play/MoviePlayActivity;->P(Lcom/tv91/features/movie/play/MoviePlayActivity;Lc/a/a/a/p0;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity$d;->a:Lcom/tv91/features/movie/play/MoviePlayActivity;

    invoke-static {p1}, Lcom/tv91/features/movie/play/MoviePlayActivity;->Q(Lcom/tv91/features/movie/play/MoviePlayActivity;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity$d;->a:Lcom/tv91/features/movie/play/MoviePlayActivity;

    invoke-static {p1}, Lcom/tv91/features/movie/play/MoviePlayActivity;->R(Lcom/tv91/features/movie/play/MoviePlayActivity;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity$d;->a:Lcom/tv91/features/movie/play/MoviePlayActivity;

    invoke-static {v0}, Lcom/tv91/features/movie/play/MoviePlayActivity;->O(Lcom/tv91/features/movie/play/MoviePlayActivity;)V

    .line 5
    invoke-static {p1}, Lh/a/a;->c(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public synthetic u(Z)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->d(Lc/a/a/a/l1$a;Z)V

    return-void
.end method

.method public synthetic w()V
    .locals 0

    invoke-static {p0}, Lc/a/a/a/k1;->p(Lc/a/a/a/l1$a;)V

    return-void
.end method

.method public synthetic x(Lc/a/a/a/z0;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc/a/a/a/k1;->g(Lc/a/a/a/l1$a;Lc/a/a/a/z0;I)V

    return-void
.end method
