.class Lcom/tv91/u/c/h/u$b;
.super Lcom/tv91/features/shared/h/b;
.source "HighlightView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/c/h/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/b<",
        "Lcom/tv91/model/Movie;",
        "Lcom/tv91/u/c/h/u$c;",
        ">;"
    }
.end annotation


# instance fields
.field private final e:I

.field private final f:Lcom/tv91/u/c/h/u$d;


# direct methods
.method private constructor <init>(Ljava/util/List;Lcom/tv91/u/c/h/u$d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/model/Movie;",
            ">;",
            "Lcom/tv91/u/c/h/u$d;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/h/b;-><init>(Ljava/util/List;)V

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iput p1, p0, Lcom/tv91/u/c/h/u$b;->e:I

    .line 4
    iput-object p2, p0, Lcom/tv91/u/c/h/u$b;->f:Lcom/tv91/u/c/h/u$d;

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/List;Lcom/tv91/u/c/h/u$d;Lcom/tv91/u/c/h/u$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tv91/u/c/h/u$b;-><init>(Ljava/util/List;Lcom/tv91/u/c/h/u$d;)V

    return-void
.end method

.method private synthetic M(Lcom/tv91/u/c/h/u$c;Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p2, p0, Lcom/tv91/features/shared/h/b;->d:Lb/g/j/a;

    if-eqz p2, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tv91/features/shared/h/b;->c:Ljava/util/List;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->j()I

    move-result p1

    iget v1, p0, Lcom/tv91/u/c/h/u$b;->e:I

    rem-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method protected bridge synthetic A(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/tv91/u/c/h/u$b;->L(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lcom/tv91/u/c/h/u$c;

    move-result-object p1

    return-object p1
.end method

.method protected L(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lcom/tv91/u/c/h/u$c;
    .locals 2

    .line 1
    new-instance p3, Lcom/tv91/u/c/h/u$c;

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lcom/tv91/r/i;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/tv91/r/i;

    move-result-object p1

    iget p2, p0, Lcom/tv91/u/c/h/u$b;->e:I

    iget-object v0, p0, Lcom/tv91/u/c/h/u$b;->f:Lcom/tv91/u/c/h/u$d;

    const/4 v1, 0x0

    invoke-direct {p3, p1, p2, v0, v1}, Lcom/tv91/u/c/h/u$c;-><init>(Lcom/tv91/r/i;ILcom/tv91/u/c/h/u$d;Lcom/tv91/u/c/h/u$a;)V

    return-object p3
.end method

.method public synthetic N(Lcom/tv91/u/c/h/u$c;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/c/h/u$b;->M(Lcom/tv91/u/c/h/u$c;Landroid/view/View;)V

    return-void
.end method

.method public O(Lcom/tv91/u/c/h/u$c;I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/tv91/u/c/h/u$b;->e:I

    rem-int/2addr p2, v0

    invoke-super {p0, p1, p2}, Lcom/tv91/features/shared/h/b;->m(Landroidx/recyclerview/widget/RecyclerView$d0;I)V

    return-void
.end method

.method public P(Landroid/view/ViewGroup;I)Lcom/tv91/u/c/h/u$c;
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 2
    invoke-virtual {p0, v0, p1, p2}, Lcom/tv91/u/c/h/u$b;->L(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lcom/tv91/u/c/h/u$c;

    move-result-object p1

    .line 3
    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    new-instance v0, Lcom/tv91/u/c/h/i;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/c/h/i;-><init>(Lcom/tv91/u/c/h/u$b;Lcom/tv91/u/c/h/u$c;)V

    invoke-static {v0}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p1
.end method

.method public c()I
    .locals 1

    const v0, 0x7fffffff

    return v0
.end method

.method public bridge synthetic m(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/tv91/u/c/h/u$c;

    invoke-virtual {p0, p1, p2}, Lcom/tv91/u/c/h/u$b;->O(Lcom/tv91/u/c/h/u$c;I)V

    return-void
.end method

.method public bridge synthetic o(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/tv91/u/c/h/u$b;->P(Landroid/view/ViewGroup;I)Lcom/tv91/u/c/h/u$c;

    move-result-object p1

    return-object p1
.end method
