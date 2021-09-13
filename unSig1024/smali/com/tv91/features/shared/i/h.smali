.class Lcom/tv91/features/shared/i/h;
.super Landroidx/recyclerview/widget/RecyclerView$t;
.source "Scrolls.java"


# instance fields
.field private final a:I

.field private final b:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Lcom/tv91/features/shared/i/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(ILb/g/j/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lb/g/j/a<",
            "Lcom/tv91/features/shared/i/i;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$t;-><init>()V

    .line 3
    iput p1, p0, Lcom/tv91/features/shared/i/h;->a:I

    if-nez p2, :cond_0

    .line 4
    sget-object p2, Lcom/tv91/features/shared/i/c;->a:Lcom/tv91/features/shared/i/c;

    :cond_0
    iput-object p2, p0, Lcom/tv91/features/shared/i/h;->b:Lb/g/j/a;

    return-void
.end method

.method synthetic constructor <init>(ILb/g/j/a;Lcom/tv91/features/shared/i/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tv91/features/shared/i/h;-><init>(ILb/g/j/a;)V

    return-void
.end method

.method static synthetic c(Lcom/tv91/features/shared/i/i;)V
    .locals 0

    return-void
.end method

.method private d(Landroidx/recyclerview/widget/LinearLayoutManager;II)V
    .locals 3

    if-nez p3, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$o;->Y()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez p3, :cond_5

    .line 2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->b2()I

    move-result p1

    if-ne p1, v0, :cond_1

    if-nez p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 3
    :goto_0
    iget p3, p0, Lcom/tv91/features/shared/i/h;->a:I

    add-int/2addr p1, p3

    if-lt p1, v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    if-eqz p2, :cond_3

    .line 4
    iget-object p1, p0, Lcom/tv91/features/shared/i/h;->b:Lb/g/j/a;

    sget-object p2, Lcom/tv91/features/shared/i/i;->f:Lcom/tv91/features/shared/i/i;

    invoke-interface {p1, p2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    goto :goto_4

    :cond_3
    if-eqz v1, :cond_4

    .line 5
    iget-object p1, p0, Lcom/tv91/features/shared/i/h;->b:Lb/g/j/a;

    sget-object p2, Lcom/tv91/features/shared/i/i;->d:Lcom/tv91/features/shared/i/i;

    invoke-interface {p1, p2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    goto :goto_4

    .line 6
    :cond_4
    iget-object p1, p0, Lcom/tv91/features/shared/i/h;->b:Lb/g/j/a;

    sget-object p2, Lcom/tv91/features/shared/i/i;->b:Lcom/tv91/features/shared/i/i;

    invoke-interface {p1, p2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    goto :goto_4

    .line 7
    :cond_5
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->V1()I

    move-result p1

    if-nez p1, :cond_6

    const/4 p2, 0x1

    goto :goto_2

    :cond_6
    const/4 p2, 0x0

    .line 8
    :goto_2
    iget p3, p0, Lcom/tv91/features/shared/i/h;->a:I

    sub-int/2addr p1, p3

    if-gtz p1, :cond_7

    goto :goto_3

    :cond_7
    const/4 v1, 0x0

    :goto_3
    if-eqz p2, :cond_8

    .line 9
    iget-object p1, p0, Lcom/tv91/features/shared/i/h;->b:Lb/g/j/a;

    sget-object p2, Lcom/tv91/features/shared/i/i;->e:Lcom/tv91/features/shared/i/i;

    invoke-interface {p1, p2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    goto :goto_4

    :cond_8
    if-eqz v1, :cond_9

    .line 10
    iget-object p1, p0, Lcom/tv91/features/shared/i/h;->b:Lb/g/j/a;

    sget-object p2, Lcom/tv91/features/shared/i/i;->c:Lcom/tv91/features/shared/i/i;

    invoke-interface {p1, p2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    goto :goto_4

    .line 11
    :cond_9
    iget-object p1, p0, Lcom/tv91/features/shared/i/h;->b:Lb/g/j/a;

    sget-object p2, Lcom/tv91/features/shared/i/i;->a:Lcom/tv91/features/shared/i/i;

    invoke-interface {p1, p2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    :goto_4
    return-void
.end method

.method private e(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;II)V
    .locals 5

    if-nez p3, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$o;->Y()I

    move-result v0

    .line 2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->t2()I

    move-result v1

    .line 3
    new-array v2, v1, [I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-lez p3, :cond_5

    .line 4
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h2([I)[I

    sub-int/2addr v1, v3

    .line 5
    aget p1, v2, v1

    if-ne p1, v0, :cond_1

    if-nez p2, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 6
    :goto_0
    aget p2, v2, v1

    iget p3, p0, Lcom/tv91/features/shared/i/h;->a:I

    add-int/2addr p2, p3

    if-lt p2, v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    if-eqz p1, :cond_3

    .line 7
    iget-object p1, p0, Lcom/tv91/features/shared/i/h;->b:Lb/g/j/a;

    sget-object p2, Lcom/tv91/features/shared/i/i;->f:Lcom/tv91/features/shared/i/i;

    invoke-interface {p1, p2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    goto :goto_4

    :cond_3
    if-eqz v3, :cond_4

    .line 8
    iget-object p1, p0, Lcom/tv91/features/shared/i/h;->b:Lb/g/j/a;

    sget-object p2, Lcom/tv91/features/shared/i/i;->d:Lcom/tv91/features/shared/i/i;

    invoke-interface {p1, p2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    goto :goto_4

    .line 9
    :cond_4
    iget-object p1, p0, Lcom/tv91/features/shared/i/h;->b:Lb/g/j/a;

    sget-object p2, Lcom/tv91/features/shared/i/i;->b:Lcom/tv91/features/shared/i/i;

    invoke-interface {p1, p2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    goto :goto_4

    .line 10
    :cond_5
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c2([I)[I

    .line 11
    aget p1, v2, v4

    if-nez p1, :cond_6

    if-nez p2, :cond_6

    const/4 p1, 0x1

    goto :goto_2

    :cond_6
    const/4 p1, 0x0

    .line 12
    :goto_2
    aget p2, v2, v4

    iget p3, p0, Lcom/tv91/features/shared/i/h;->a:I

    sub-int/2addr p2, p3

    if-gtz p2, :cond_7

    goto :goto_3

    :cond_7
    const/4 v3, 0x0

    :goto_3
    if-eqz p1, :cond_8

    .line 13
    iget-object p1, p0, Lcom/tv91/features/shared/i/h;->b:Lb/g/j/a;

    sget-object p2, Lcom/tv91/features/shared/i/i;->e:Lcom/tv91/features/shared/i/i;

    invoke-interface {p1, p2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    goto :goto_4

    :cond_8
    if-eqz v3, :cond_9

    .line 14
    iget-object p1, p0, Lcom/tv91/features/shared/i/h;->b:Lb/g/j/a;

    sget-object p2, Lcom/tv91/features/shared/i/i;->c:Lcom/tv91/features/shared/i/i;

    invoke-interface {p1, p2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    goto :goto_4

    .line 15
    :cond_9
    iget-object p1, p0, Lcom/tv91/features/shared/i/h;->b:Lb/g/j/a;

    sget-object p2, Lcom/tv91/features/shared/i/i;->a:Lcom/tv91/features/shared/i/i;

    invoke-interface {p1, p2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    :goto_4
    return-void
.end method


# virtual methods
.method public b(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object v0

    .line 2
    instance-of v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 3
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 4
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->r2()I

    move-result v1

    if-ne v1, v2, :cond_0

    .line 5
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getScrollState()I

    move-result p1

    invoke-direct {p0, v0, p1, p3}, Lcom/tv91/features/shared/i/h;->d(Landroidx/recyclerview/widget/LinearLayoutManager;II)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getScrollState()I

    move-result p1

    invoke-direct {p0, v0, p1, p2}, Lcom/tv91/features/shared/i/h;->d(Landroidx/recyclerview/widget/LinearLayoutManager;II)V

    goto :goto_0

    .line 7
    :cond_1
    instance-of v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    if-eqz v1, :cond_3

    .line 8
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 9
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s2()I

    move-result v1

    if-ne v1, v2, :cond_2

    .line 10
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getScrollState()I

    move-result p1

    invoke-direct {p0, v0, p1, p3}, Lcom/tv91/features/shared/i/h;->e(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;II)V

    goto :goto_0

    .line 11
    :cond_2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getScrollState()I

    move-result p1

    invoke-direct {p0, v0, p1, p2}, Lcom/tv91/features/shared/i/h;->e(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;II)V

    :cond_3
    :goto_0
    return-void
.end method
