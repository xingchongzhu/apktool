.class public Lb/c/a/a;
.super Landroid/widget/FrameLayout;
.source "CardView.java"


# static fields
.field private static final a:[I

.field private static final b:Lb/c/a/f;


# instance fields
.field private c:Z

.field private d:Z

.field e:I

.field f:I

.field final g:Landroid/graphics/Rect;

.field private final h:Lb/c/a/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x1010031

    aput v2, v0, v1

    .line 1
    sput-object v0, Lb/c/a/a;->a:[I

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, Lb/c/a/c;

    invoke-direct {v0}, Lb/c/a/c;-><init>()V

    sput-object v0, Lb/c/a/a;->b:Lb/c/a/f;

    goto :goto_0

    :cond_0
    const/16 v1, 0x11

    if-lt v0, v1, :cond_1

    .line 4
    new-instance v0, Lb/c/a/b;

    invoke-direct {v0}, Lb/c/a/b;-><init>()V

    sput-object v0, Lb/c/a/a;->b:Lb/c/a/f;

    goto :goto_0

    .line 5
    :cond_1
    new-instance v0, Lb/c/a/d;

    invoke-direct {v0}, Lb/c/a/d;-><init>()V

    sput-object v0, Lb/c/a/a;->b:Lb/c/a/f;

    .line 6
    :goto_0
    sget-object v0, Lb/c/a/a;->b:Lb/c/a/f;

    invoke-interface {v0}, Lb/c/a/f;->e()V

    return-void
.end method


# virtual methods
.method public getCardBackgroundColor()Landroid/content/res/ColorStateList;
    .locals 2

    .line 1
    sget-object v0, Lb/c/a/a;->b:Lb/c/a/f;

    iget-object v1, p0, Lb/c/a/a;->h:Lb/c/a/e;

    invoke-interface {v0, v1}, Lb/c/a/f;->b(Lb/c/a/e;)Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getCardElevation()F
    .locals 2

    .line 1
    sget-object v0, Lb/c/a/a;->b:Lb/c/a/f;

    iget-object v1, p0, Lb/c/a/a;->h:Lb/c/a/e;

    invoke-interface {v0, v1}, Lb/c/a/f;->d(Lb/c/a/e;)F

    move-result v0

    return v0
.end method

.method public getContentPaddingBottom()I
    .locals 1

    .line 1
    iget-object v0, p0, Lb/c/a/a;->g:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    return v0
.end method

.method public getContentPaddingLeft()I
    .locals 1

    .line 1
    iget-object v0, p0, Lb/c/a/a;->g:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    return v0
.end method

.method public getContentPaddingRight()I
    .locals 1

    .line 1
    iget-object v0, p0, Lb/c/a/a;->g:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    return v0
.end method

.method public getContentPaddingTop()I
    .locals 1

    .line 1
    iget-object v0, p0, Lb/c/a/a;->g:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    return v0
.end method

.method public getMaxCardElevation()F
    .locals 2

    .line 1
    sget-object v0, Lb/c/a/a;->b:Lb/c/a/f;

    iget-object v1, p0, Lb/c/a/a;->h:Lb/c/a/e;

    invoke-interface {v0, v1}, Lb/c/a/f;->a(Lb/c/a/e;)F

    move-result v0

    return v0
.end method

.method public getPreventCornerOverlap()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lb/c/a/a;->d:Z

    return v0
.end method

.method public getRadius()F
    .locals 2

    .line 1
    sget-object v0, Lb/c/a/a;->b:Lb/c/a/f;

    iget-object v1, p0, Lb/c/a/a;->h:Lb/c/a/e;

    invoke-interface {v0, v1}, Lb/c/a/f;->f(Lb/c/a/e;)F

    move-result v0

    return v0
.end method

.method public getUseCompatPadding()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lb/c/a/a;->c:Z

    return v0
.end method

.method protected onMeasure(II)V
    .locals 6

    .line 1
    sget-object v0, Lb/c/a/a;->b:Lb/c/a/f;

    instance-of v1, v0, Lb/c/a/c;

    if-nez v1, :cond_2

    .line 2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    const/high16 v3, -0x80000000

    if-eq v1, v3, :cond_0

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v4, p0, Lb/c/a/a;->h:Lb/c/a/e;

    invoke-interface {v0, v4}, Lb/c/a/f;->h(Lb/c/a/e;)F

    move-result v4

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v4, v4

    .line 4
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 5
    invoke-static {v4, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 6
    :goto_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    if-eq v1, v3, :cond_1

    if-eq v1, v2, :cond_1

    goto :goto_1

    .line 7
    :cond_1
    iget-object v2, p0, Lb/c/a/a;->h:Lb/c/a/e;

    invoke-interface {v0, v2}, Lb/c/a/f;->g(Lb/c/a/e;)F

    move-result v0

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v0, v2

    .line 8
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    .line 9
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 10
    :goto_1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    goto :goto_2

    .line 11
    :cond_2
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    :goto_2
    return-void
.end method

.method public setCardBackgroundColor(I)V
    .locals 2

    .line 1
    sget-object v0, Lb/c/a/a;->b:Lb/c/a/f;

    iget-object v1, p0, Lb/c/a/a;->h:Lb/c/a/e;

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lb/c/a/f;->l(Lb/c/a/e;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setCardBackgroundColor(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 2
    sget-object v0, Lb/c/a/a;->b:Lb/c/a/f;

    iget-object v1, p0, Lb/c/a/a;->h:Lb/c/a/e;

    invoke-interface {v0, v1, p1}, Lb/c/a/f;->l(Lb/c/a/e;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setCardElevation(F)V
    .locals 2

    .line 1
    sget-object v0, Lb/c/a/a;->b:Lb/c/a/f;

    iget-object v1, p0, Lb/c/a/a;->h:Lb/c/a/e;

    invoke-interface {v0, v1, p1}, Lb/c/a/f;->j(Lb/c/a/e;F)V

    return-void
.end method

.method public setMaxCardElevation(F)V
    .locals 2

    .line 1
    sget-object v0, Lb/c/a/a;->b:Lb/c/a/f;

    iget-object v1, p0, Lb/c/a/a;->h:Lb/c/a/e;

    invoke-interface {v0, v1, p1}, Lb/c/a/f;->m(Lb/c/a/e;F)V

    return-void
.end method

.method public setMinimumHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lb/c/a/a;->f:I

    .line 2
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setMinimumHeight(I)V

    return-void
.end method

.method public setMinimumWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lb/c/a/a;->e:I

    .line 2
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setMinimumWidth(I)V

    return-void
.end method

.method public setPadding(IIII)V
    .locals 0

    return-void
.end method

.method public setPaddingRelative(IIII)V
    .locals 0

    return-void
.end method

.method public setPreventCornerOverlap(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lb/c/a/a;->d:Z

    if-eq p1, v0, :cond_0

    .line 2
    iput-boolean p1, p0, Lb/c/a/a;->d:Z

    .line 3
    sget-object p1, Lb/c/a/a;->b:Lb/c/a/f;

    iget-object v0, p0, Lb/c/a/a;->h:Lb/c/a/e;

    invoke-interface {p1, v0}, Lb/c/a/f;->k(Lb/c/a/e;)V

    :cond_0
    return-void
.end method

.method public setRadius(F)V
    .locals 2

    .line 1
    sget-object v0, Lb/c/a/a;->b:Lb/c/a/f;

    iget-object v1, p0, Lb/c/a/a;->h:Lb/c/a/e;

    invoke-interface {v0, v1, p1}, Lb/c/a/f;->c(Lb/c/a/e;F)V

    return-void
.end method

.method public setUseCompatPadding(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lb/c/a/a;->c:Z

    if-eq v0, p1, :cond_0

    .line 2
    iput-boolean p1, p0, Lb/c/a/a;->c:Z

    .line 3
    sget-object p1, Lb/c/a/a;->b:Lb/c/a/f;

    iget-object v0, p0, Lb/c/a/a;->h:Lb/c/a/e;

    invoke-interface {p1, v0}, Lb/c/a/f;->i(Lb/c/a/e;)V

    :cond_0
    return-void
.end method
