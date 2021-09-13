.class final Lcom/tv91/u/h/h/u;
.super Lcom/tv91/features/shared/f;
.source "PaymentHistoryView.java"

# interfaces
.implements Lcom/tv91/u/h/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/h/h/u$c;,
        Lcom/tv91/u/h/h/u$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/f;",
        "Lcom/tv91/u/h/e<",
        "Lcom/tv91/model/PaymentHistory;",
        ">;"
    }
.end annotation


# instance fields
.field private final e:Lcom/tv91/r/n0;

.field private final f:Lcom/tv91/features/shared/g;

.field private final g:Lcom/tv91/u/h/h/u$b;


# direct methods
.method constructor <init>(Lcom/tv91/r/n0;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/f;-><init>(Lb/r/a;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/u/h/h/u;->e:Lcom/tv91/r/n0;

    .line 3
    new-instance v0, Lcom/tv91/features/shared/g;

    iget-object v1, p1, Lcom/tv91/r/n0;->g:Lcom/tv91/r/y;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/g;-><init>(Lcom/tv91/r/y;)V

    iput-object v0, p0, Lcom/tv91/u/h/h/u;->f:Lcom/tv91/features/shared/g;

    .line 4
    new-instance v1, Lcom/tv91/u/h/h/u$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/tv91/u/h/h/u$b;-><init>(Lcom/tv91/u/h/h/u$a;)V

    iput-object v1, p0, Lcom/tv91/u/h/h/u;->g:Lcom/tv91/u/h/h/u$b;

    const v2, 0x7f120158

    .line 5
    invoke-virtual {v0, v2}, Lcom/tv91/features/shared/g;->p(I)V

    .line 6
    iget-object v0, p1, Lcom/tv91/r/n0;->e:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    .line 7
    iget-object v0, p1, Lcom/tv91/r/n0;->e:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v2, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 8
    iget-object p1, p1, Lcom/tv91/r/n0;->e:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Lcom/tv91/u/h/h/u;->q2()Landroidx/recyclerview/widget/RecyclerView$n;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->h(Landroidx/recyclerview/widget/RecyclerView$n;)V

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
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/model/PaymentHistory;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/tv91/u/h/h/u;->e:Lcom/tv91/r/n0;

    iget-object p1, p1, Lcom/tv91/r/n0;->f:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/h/h/u;->g:Lcom/tv91/u/h/h/u$b;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->x(Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public S0(Lb/g/j/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/h/u;->e:Lcom/tv91/r/n0;

    iget-object v0, v0, Lcom/tv91/r/n0;->d:Landroid/widget/ProgressBar;

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
    iget-object v0, p0, Lcom/tv91/u/h/h/u;->f:Lcom/tv91/features/shared/g;

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
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tv91/u/h/h/u;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {p1}, Lcom/tv91/features/shared/g;->b()V

    return-void
.end method

.method public synthetic s0(ILjava/lang/Runnable;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/tv91/u/h/d;->a(Lcom/tv91/u/h/e;ILjava/lang/Runnable;)V

    return-void
.end method
