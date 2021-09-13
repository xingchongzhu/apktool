.class final Lcom/tv91/u/h/j/u;
.super Lcom/tv91/features/shared/f;
.source "PurchaseView.java"

# interfaces
.implements Lcom/tv91/u/h/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/h/j/u$d;,
        Lcom/tv91/u/h/j/u$c;
    }
.end annotation


# instance fields
.field private final e:Lcom/tv91/r/t0;

.field private final f:Lcom/tv91/features/shared/g;

.field private final g:Lcom/tv91/u/h/j/u$c;


# direct methods
.method constructor <init>(Lcom/tv91/r/t0;)V
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/f;-><init>(Lb/r/a;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/u/h/j/u;->e:Lcom/tv91/r/t0;

    .line 3
    new-instance v0, Lcom/tv91/features/shared/g;

    iget-object v1, p1, Lcom/tv91/r/t0;->i:Lcom/tv91/r/y;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/g;-><init>(Lcom/tv91/r/y;)V

    iput-object v0, p0, Lcom/tv91/u/h/j/u;->f:Lcom/tv91/features/shared/g;

    .line 4
    new-instance v1, Lcom/tv91/u/h/j/u$c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/tv91/u/h/j/u$c;-><init>(Lcom/tv91/u/h/j/u$a;)V

    iput-object v1, p0, Lcom/tv91/u/h/j/u;->g:Lcom/tv91/u/h/j/u$c;

    const v2, 0x7f1201bc

    .line 5
    invoke-virtual {v0, v2}, Lcom/tv91/features/shared/g;->p(I)V

    .line 6
    iget-object v0, p1, Lcom/tv91/r/t0;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Lcom/tv91/features/shared/widget/NoScrollGridLayoutManager;

    iget-object v3, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/tv91/features/shared/widget/NoScrollGridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 7
    iget-object v0, p1, Lcom/tv91/r/t0;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    .line 8
    iget-object p1, p1, Lcom/tv91/r/t0;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Lcom/tv91/u/h/j/u;->q2()Landroidx/recyclerview/widget/RecyclerView$n;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->h(Landroidx/recyclerview/widget/RecyclerView$n;)V

    return-void
.end method

.method private q2()Landroidx/recyclerview/widget/RecyclerView$n;
    .locals 2

    const v0, 0x7f0701b8

    .line 1
    invoke-virtual {p0, v0}, Lcom/tv91/features/shared/f;->m2(I)I

    move-result v0

    .line 2
    new-instance v1, Lcom/tv91/u/h/j/u$a;

    invoke-direct {v1, p0, v0}, Lcom/tv91/u/h/j/u$a;-><init>(Lcom/tv91/u/h/j/u;I)V

    return-object v1
.end method


# virtual methods
.method public F0(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/j/u;->e:Lcom/tv91/r/t0;

    iget-object v0, v0, Lcom/tv91/r/t0;->f:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f120183

    invoke-virtual {p0, p1, v1}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public K1(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f1201a8

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f1201a7

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->m(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f12004f

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->v(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/widget/e$a;->t(Ljava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public M0(Lb/g/j/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/PurchasePackage;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/j/u;->g:Lcom/tv91/u/h/j/u$c;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    return-void
.end method

.method public S1(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f1201a6

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/widget/e$a;->n(Ljava/lang/String;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const v0, 0x7f12004f

    .line 4
    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/widget/e$a;->v(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/j/u;->e:Lcom/tv91/r/t0;

    iget-object v0, v0, Lcom/tv91/r/t0;->d:Landroid/widget/ProgressBar;

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
    iget-object v0, p0, Lcom/tv91/u/h/j/u;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->i(Ljava/lang/Runnable;)V

    return-void
.end method

.method public c2(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/model/PurchasePackage;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/j/u;->g:Lcom/tv91/u/h/j/u$c;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->x(Ljava/util/List;)V

    return-void
.end method

.method public g0(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f1201a6

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/widget/e$a;->n(Ljava/lang/String;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const v0, 0x7f12004f

    .line 4
    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/widget/e$a;->v(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public h2(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tv91/u/h/j/u;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {p1}, Lcom/tv91/features/shared/g;->b()V

    .line 2
    iget-object p1, p0, Lcom/tv91/u/h/j/u;->g:Lcom/tv91/u/h/j/u$c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    return-void
.end method

.method public m1(ILjava/lang/Runnable;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f1201a3

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f1201a1

    invoke-virtual {p0, p1, v1}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/widget/e$a;->n(Ljava/lang/String;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const v0, 0x7f12004f

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
