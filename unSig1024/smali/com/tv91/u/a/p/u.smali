.class final Lcom/tv91/u/a/p/u;
.super Landroid/widget/BaseAdapter;
.source "MenuAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/a/p/u$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tv91/u/a/j;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Landroid/content/Context;

.field private c:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Lcom/tv91/u/a/j;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/tv91/u/a/p/u;->a:Ljava/util/List;

    .line 3
    iput-object p1, p0, Lcom/tv91/u/a/p/u;->b:Landroid/content/Context;

    return-void
.end method

.method private synthetic b(Lcom/tv91/u/a/j;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/tv91/u/a/p/u;->c:Lb/g/j/a;

    if-eqz p2, :cond_0

    .line 2
    invoke-interface {p2, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(I)Lcom/tv91/u/a/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/p/u;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/a/j;

    return-object p1
.end method

.method public synthetic c(Lcom/tv91/u/a/j;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/a/p/u;->b(Lcom/tv91/u/a/j;Landroid/view/View;)V

    return-void
.end method

.method d(Lb/g/j/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/u/a/j;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/u/a/p/u;->c:Lb/g/j/a;

    return-void
.end method

.method e(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/u/a/j;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/p/u;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/p/u;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 3
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/p/u;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tv91/u/a/p/u;->a(I)Lcom/tv91/u/a/j;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/tv91/u/a/p/u;->a(I)Lcom/tv91/u/a/j;

    move-result-object p1

    .line 2
    sget-object p2, Lcom/tv91/u/a/j;->a:Lcom/tv91/u/a/j;

    const/4 v0, 0x0

    if-ne p1, p2, :cond_0

    .line 3
    new-instance p1, Landroid/view/View;

    iget-object p2, p0, Lcom/tv91/u/a/p/u;->b:Landroid/content/Context;

    invoke-direct {p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 4
    iget-object p2, p0, Lcom/tv91/u/a/p/u;->b:Landroid/content/Context;

    const p3, 0x7f060034

    invoke-static {p2, p3}, Landroidx/core/content/a;->b(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 5
    new-instance p2, Landroid/widget/AbsListView$LayoutParams;

    const/4 p3, -0x1

    iget-object v1, p0, Lcom/tv91/u/a/p/u;->b:Landroid/content/Context;

    .line 6
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0701ba

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    invoke-direct {p2, p3, v1}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    .line 7
    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    return-object p1

    .line 9
    :cond_0
    iget-object p2, p0, Lcom/tv91/u/a/p/u;->b:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    .line 10
    new-instance v1, Lcom/tv91/u/a/p/u$b;

    invoke-static {p2, p3, v0}, Lcom/tv91/r/c;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/tv91/r/c;

    move-result-object p2

    const/4 p3, 0x0

    invoke-direct {v1, p2, p3}, Lcom/tv91/u/a/p/u$b;-><init>(Lcom/tv91/r/c;Lcom/tv91/u/a/p/u$a;)V

    .line 11
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    new-instance p3, Lcom/tv91/u/a/p/b;

    invoke-direct {p3, p0, p1}, Lcom/tv91/u/a/p/b;-><init>(Lcom/tv91/u/a/p/u;Lcom/tv91/u/a/j;)V

    invoke-static {p3}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    invoke-virtual {v1, p1}, Lcom/tv91/u/a/p/u$b;->T(Lcom/tv91/u/a/j;)V

    .line 13
    iget-object p1, v1, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    return-object p1
.end method
