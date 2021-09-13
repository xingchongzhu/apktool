.class Lcom/tv91/u/h/i/c0$a;
.super Landroidx/recyclerview/widget/RecyclerView$n;
.source "PaymentMethodDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/h/i/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Landroid/graphics/Rect;

.field private final d:Landroid/graphics/Paint;


# direct methods
.method constructor <init>(II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$n;-><init>()V

    .line 2
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/tv91/u/h/i/c0$a;->c:Landroid/graphics/Rect;

    .line 3
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/tv91/u/h/i/c0$a;->d:Landroid/graphics/Paint;

    .line 4
    iput p1, p0, Lcom/tv91/u/h/i/c0$a;->a:I

    .line 5
    iput p2, p0, Lcom/tv91/u/h/i/c0$a;->b:I

    const-string p1, "#3B3B3B"

    .line 6
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method


# virtual methods
.method public e(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;)V
    .locals 3

    .line 1
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object p4

    invoke-static {p4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p4, Landroidx/recyclerview/widget/RecyclerView$o;

    invoke-virtual {p4}, Landroidx/recyclerview/widget/RecyclerView$o;->Y()I

    move-result p4

    .line 2
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->e0(Landroid/view/View;)I

    move-result p2

    const/4 p3, 0x0

    .line 3
    iput p3, p1, Landroid/graphics/Rect;->left:I

    .line 4
    iget v0, p0, Lcom/tv91/u/h/i/c0$a;->b:I

    rem-int v1, p2, v0

    add-int/lit8 v2, v0, -0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget v1, p0, Lcom/tv91/u/h/i/c0$a;->a:I

    :goto_0
    iput v1, p1, Landroid/graphics/Rect;->right:I

    .line 5
    iput p3, p1, Landroid/graphics/Rect;->top:I

    sub-int/2addr p4, p2

    if-ge p4, v0, :cond_1

    goto :goto_1

    .line 6
    :cond_1
    iget p3, p0, Lcom/tv91/u/h/i/c0$a;->a:I

    :goto_1
    iput p3, p1, Landroid/graphics/Rect;->bottom:I

    return-void
.end method

.method public g(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 2
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getClipToPadding()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 3
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result p3

    .line 4
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v0

    .line 5
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getWidth()I

    move-result v1

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    .line 6
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getHeight()I

    move-result v2

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    .line 7
    invoke-virtual {p1, p3, v0, v1, v2}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 8
    :cond_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object p3

    invoke-static {p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p3, Landroidx/recyclerview/widget/RecyclerView$o;

    .line 9
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    .line 10
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView$o;->Y()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 11
    invoke-virtual {p2, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 12
    iget-object v4, p0, Lcom/tv91/u/h/i/c0$a;->c:Landroid/graphics/Rect;

    invoke-virtual {p3, v3, v4}, Landroidx/recyclerview/widget/RecyclerView$o;->P(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 13
    iget v3, p0, Lcom/tv91/u/h/i/c0$a;->b:I

    rem-int v4, v2, v3

    add-int/lit8 v3, v3, -0x1

    if-eq v4, v3, :cond_1

    .line 14
    iget-object v3, p0, Lcom/tv91/u/h/i/c0$a;->c:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->right:I

    int-to-float v6, v4

    iget v5, v3, Landroid/graphics/Rect;->top:I

    int-to-float v7, v5

    iget v5, p0, Lcom/tv91/u/h/i/c0$a;->a:I

    add-int/2addr v4, v5

    int-to-float v8, v4

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, v5

    int-to-float v9, v3

    iget-object v10, p0, Lcom/tv91/u/h/i/c0$a;->d:Landroid/graphics/Paint;

    move-object v5, p1

    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_1
    sub-int v3, v1, v2

    .line 15
    iget v4, p0, Lcom/tv91/u/h/i/c0$a;->b:I

    if-lt v3, v4, :cond_2

    .line 16
    iget-object v3, p0, Lcom/tv91/u/h/i/c0$a;->c:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    int-to-float v6, v4

    iget v4, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v7, v4

    iget v3, v3, Landroid/graphics/Rect;->right:I

    int-to-float v8, v3

    iget v3, p0, Lcom/tv91/u/h/i/c0$a;->a:I

    add-int/2addr v4, v3

    int-to-float v9, v4

    iget-object v10, p0, Lcom/tv91/u/h/i/c0$a;->d:Landroid/graphics/Paint;

    move-object v5, p1

    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 17
    :cond_3
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method
