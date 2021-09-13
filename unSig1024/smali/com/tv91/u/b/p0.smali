.class final Lcom/tv91/u/b/p0;
.super Lcom/tv91/features/shared/h/b;
.source "DownloadAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/b/p0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/b<",
        "Lcom/tv91/model/a;",
        "Lcom/tv91/u/b/p0$b;",
        ">;"
    }
.end annotation


# instance fields
.field private e:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Lcom/tv91/model/a;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Lcom/tv91/model/a;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Lcom/tv91/model/a;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Lcom/tv91/model/a;",
            ">;"
        }
    .end annotation
.end field

.field private i:Z


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tv91/features/shared/h/b;-><init>()V

    .line 2
    sget-object v0, Lcom/tv91/u/b/g;->a:Lcom/tv91/u/b/g;

    iput-object v0, p0, Lcom/tv91/u/b/p0;->e:Lb/g/j/a;

    .line 3
    sget-object v0, Lcom/tv91/u/b/b;->a:Lcom/tv91/u/b/b;

    iput-object v0, p0, Lcom/tv91/u/b/p0;->f:Lb/g/j/a;

    .line 4
    sget-object v0, Lcom/tv91/u/b/f;->a:Lcom/tv91/u/b/f;

    iput-object v0, p0, Lcom/tv91/u/b/p0;->g:Lb/g/j/a;

    .line 5
    sget-object v0, Lcom/tv91/u/b/e;->a:Lcom/tv91/u/b/e;

    iput-object v0, p0, Lcom/tv91/u/b/p0;->h:Lb/g/j/a;

    return-void
.end method

.method private synthetic N(Lcom/tv91/u/b/p0$b;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->j()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/tv91/features/shared/h/b;->B(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tv91/model/a;

    .line 2
    invoke-static {p1}, Lcom/tv91/u/b/p0$b;->V(Lcom/tv91/u/b/p0$b;)Lcom/tv91/r/b;

    move-result-object v1

    iget-object v1, v1, Lcom/tv91/r/b;->b:Landroid/widget/ImageView;

    if-ne p2, v1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/tv91/u/b/p0;->e:Lb/g/j/a;

    invoke-interface {p1, v0}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p1}, Lcom/tv91/u/b/p0$b;->V(Lcom/tv91/u/b/p0$b;)Lcom/tv91/r/b;

    move-result-object v1

    iget-object v1, v1, Lcom/tv91/r/b;->j:Landroid/widget/TextView;

    if-ne p2, v1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/tv91/u/b/p0;->f:Lb/g/j/a;

    invoke-interface {p1, v0}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 6
    :cond_1
    invoke-static {p1}, Lcom/tv91/u/b/p0$b;->V(Lcom/tv91/u/b/p0$b;)Lcom/tv91/r/b;

    move-result-object v1

    iget-object v1, v1, Lcom/tv91/r/b;->i:Lcom/tv91/features/shared/widget/DrawableTextView;

    if-ne p2, v1, :cond_2

    .line 7
    iget-object p1, p0, Lcom/tv91/u/b/p0;->g:Lb/g/j/a;

    invoke-interface {p1, v0}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 8
    :cond_2
    invoke-static {p1}, Lcom/tv91/u/b/p0$b;->V(Lcom/tv91/u/b/p0$b;)Lcom/tv91/r/b;

    move-result-object p1

    iget-object p1, p1, Lcom/tv91/r/b;->g:Lcom/tv91/features/shared/widget/DrawableTextView;

    if-ne p2, p1, :cond_3

    .line 9
    iget-object p1, p0, Lcom/tv91/u/b/p0;->h:Lb/g/j/a;

    invoke-interface {p1, v0}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    :cond_3
    :goto_0
    return-void
.end method

.method private synthetic P(Lcom/tv91/u/b/p0$b;)Lcom/tv91/model/a;
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->j()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/tv91/features/shared/h/b;->B(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/model/a;

    return-object p1
.end method

.method static synthetic R(Lcom/tv91/model/a;)V
    .locals 0

    return-void
.end method

.method static synthetic S(Lcom/tv91/model/a;)V
    .locals 0

    return-void
.end method

.method static synthetic T(Lcom/tv91/model/a;)V
    .locals 0

    return-void
.end method

.method static synthetic U(Lcom/tv91/model/a;)V
    .locals 0

    return-void
.end method


# virtual methods
.method protected bridge synthetic A(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/tv91/u/b/p0;->L(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lcom/tv91/u/b/p0$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic C(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/tv91/model/a;

    invoke-virtual {p0, p1}, Lcom/tv91/u/b/p0;->M(Lcom/tv91/model/a;)I

    move-result p1

    return p1
.end method

.method protected L(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lcom/tv91/u/b/p0$b;
    .locals 1

    .line 1
    new-instance p3, Lcom/tv91/u/b/p0$b;

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lcom/tv91/r/b;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/tv91/r/b;

    move-result-object p1

    const/4 p2, 0x0

    invoke-direct {p3, p1, p2}, Lcom/tv91/u/b/p0$b;-><init>(Lcom/tv91/r/b;Lcom/tv91/u/b/p0$a;)V

    .line 2
    new-instance p1, Lcom/tv91/u/b/a;

    invoke-direct {p1, p0, p3}, Lcom/tv91/u/b/a;-><init>(Lcom/tv91/u/b/p0;Lcom/tv91/u/b/p0$b;)V

    .line 3
    new-instance p2, Lcom/tv91/u/b/h;

    invoke-direct {p2, p0, p3}, Lcom/tv91/u/b/h;-><init>(Lcom/tv91/u/b/p0;Lcom/tv91/u/b/p0$b;)V

    invoke-static {p3, p2, p1}, Lcom/tv91/u/b/p0$b;->T(Lcom/tv91/u/b/p0$b;Lb/g/j/i;Landroid/view/View$OnClickListener;)V

    return-object p3
.end method

.method public M(Lcom/tv91/model/a;)I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/h/b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/model/a;

    .line 2
    invoke-virtual {v1, p1}, Lcom/tv91/model/a;->f(Lcom/tv91/model/a;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    iget-object p1, p0, Lcom/tv91/features/shared/h/b;->c:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1

    .line 4
    :cond_1
    invoke-super {p0, p1}, Lcom/tv91/features/shared/h/b;->C(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public synthetic O(Lcom/tv91/u/b/p0$b;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/b/p0;->N(Lcom/tv91/u/b/p0$b;Landroid/view/View;)V

    return-void
.end method

.method public synthetic Q(Lcom/tv91/u/b/p0$b;)Lcom/tv91/model/a;
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/p0;->P(Lcom/tv91/u/b/p0$b;)Lcom/tv91/model/a;

    move-result-object p1

    return-object p1
.end method

.method V(Lb/g/j/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/a;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/b/p0;->e:Lb/g/j/a;

    :cond_0
    return-void
.end method

.method public W(Lcom/tv91/u/b/p0$b;I)V
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, Lcom/tv91/features/shared/h/b;->B(I)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p2, Lcom/tv91/model/a;

    iget-boolean v0, p0, Lcom/tv91/u/b/p0;->i:Z

    invoke-static {p1, p2, v0}, Lcom/tv91/u/b/p0$b;->U(Lcom/tv91/u/b/p0$b;Lcom/tv91/model/a;Z)V

    return-void
.end method

.method X(Lb/g/j/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/a;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/b/p0;->h:Lb/g/j/a;

    :cond_0
    return-void
.end method

.method Y(Lb/g/j/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/a;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/b/p0;->g:Lb/g/j/a;

    :cond_0
    return-void
.end method

.method Z(Lb/g/j/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/a;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/b/p0;->f:Lb/g/j/a;

    :cond_0
    return-void
.end method

.method a0()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/tv91/u/b/p0;->i:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lcom/tv91/u/b/p0;->i:Z

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$g;->h()V

    return-void
.end method

.method public bridge synthetic m(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/tv91/u/b/p0$b;

    invoke-virtual {p0, p1, p2}, Lcom/tv91/u/b/p0;->W(Lcom/tv91/u/b/p0$b;I)V

    return-void
.end method
