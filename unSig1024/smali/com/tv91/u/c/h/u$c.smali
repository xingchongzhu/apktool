.class Lcom/tv91/u/c/h/u$c;
.super Lcom/tv91/features/shared/h/d;
.source "HighlightView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/c/h/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/d<",
        "Lcom/tv91/model/Movie;",
        ">;"
    }
.end annotation


# instance fields
.field private final w:Lcom/tv91/r/i;

.field private final x:I


# direct methods
.method private constructor <init>(Lcom/tv91/r/i;ILcom/tv91/u/c/h/u$d;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/h/d;-><init>(Lb/r/a;)V

    .line 3
    iput-object p1, p0, Lcom/tv91/u/c/h/u$c;->w:Lcom/tv91/r/i;

    .line 4
    iput p2, p0, Lcom/tv91/u/c/h/u$c;->x:I

    .line 5
    iget-object p1, p1, Lcom/tv91/r/i;->d:Landroid/widget/TextView;

    invoke-direct {p0, p3}, Lcom/tv91/u/c/h/u$c;->U(Lcom/tv91/u/c/h/u$d;)Landroid/graphics/drawable/PaintDrawable;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/r/i;ILcom/tv91/u/c/h/u$d;Lcom/tv91/u/c/h/u$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/tv91/u/c/h/u$c;-><init>(Lcom/tv91/r/i;ILcom/tv91/u/c/h/u$d;)V

    return-void
.end method

.method private U(Lcom/tv91/u/c/h/u$d;)Landroid/graphics/drawable/PaintDrawable;
    .locals 7

    .line 1
    sget-object v0, Lcom/tv91/u/c/h/u$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    if-eq p1, v0, :cond_0

    const p1, 0x7f060033

    .line 2
    invoke-virtual {p0, p1}, Lcom/tv91/features/shared/h/d;->O(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const-string p1, "#AE2323"

    .line 3
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    :cond_1
    const-string p1, "#2E3152"

    .line 4
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    .line 5
    :goto_0
    new-instance v2, Landroid/graphics/drawable/PaintDrawable;

    invoke-direct {v2, p1}, Landroid/graphics/drawable/PaintDrawable;-><init>(I)V

    const/4 p1, 0x5

    .line 6
    invoke-virtual {p0, p1}, Lcom/tv91/features/shared/h/d;->N(I)I

    move-result v3

    const/16 v4, 0x2a

    .line 7
    invoke-virtual {p0, v4}, Lcom/tv91/features/shared/h/d;->N(I)I

    move-result v4

    const/16 v5, 0x8

    new-array v5, v5, [F

    const/4 v6, 0x0

    int-to-float v3, v3

    aput v3, v5, v6

    const/4 v6, 0x1

    aput v3, v5, v6

    const/4 v3, 0x0

    aput v3, v5, v1

    aput v3, v5, v0

    const/4 v0, 0x4

    int-to-float v1, v4

    aput v1, v5, v0

    aput v1, v5, p1

    const/4 p1, 0x6

    aput v3, v5, p1

    const/4 p1, 0x7

    aput v3, v5, p1

    .line 8
    invoke-virtual {v2, v5}, Landroid/graphics/drawable/PaintDrawable;->setCornerRadii([F)V

    return-object v2
.end method


# virtual methods
.method protected bridge synthetic M(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/tv91/model/Movie;

    invoke-virtual {p0, p1}, Lcom/tv91/u/c/h/u$c;->T(Lcom/tv91/model/Movie;)V

    return-void
.end method

.method protected T(Lcom/tv91/model/Movie;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/h/d;->v:Lcom/tv91/z/f;

    iget-object v1, p1, Lcom/tv91/model/Movie;->image:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/tv91/z/f;->b(Ljava/lang/String;)Lcom/tv91/z/f;

    move-result-object v0

    iget-object v1, p0, Lcom/tv91/u/c/h/u$c;->w:Lcom/tv91/r/i;

    iget-object v1, v1, Lcom/tv91/r/i;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    invoke-interface {v0, v1}, Lcom/tv91/z/f;->g(Landroid/widget/ImageView;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/h/u$c;->w:Lcom/tv91/r/i;

    iget-object v0, v0, Lcom/tv91/r/i;->c:Landroid/widget/TextView;

    iget-object p1, p1, Lcom/tv91/model/Movie;->name:Ljava/lang/String;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->j()I

    move-result p1

    iget v0, p0, Lcom/tv91/u/c/h/u$c;->x:I

    rem-int/2addr p1, v0

    const/4 v0, 0x1

    add-int/2addr p1, v0

    const v1, 0x7f0701bb

    const/4 v2, 0x0

    const/16 v3, 0xa

    if-ge p1, v3, :cond_0

    .line 4
    iget-object v3, p0, Lcom/tv91/u/c/h/u$c;->w:Lcom/tv91/r/i;

    iget-object v3, v3, Lcom/tv91/r/i;->d:Landroid/widget/TextView;

    const v4, 0x7f0701b8

    .line 5
    invoke-virtual {p0, v4}, Lcom/tv91/features/shared/h/d;->P(I)I

    move-result v4

    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/h/d;->P(I)I

    move-result v1

    .line 6
    invoke-virtual {v3, v4, v1, v2, v2}, Landroid/widget/TextView;->setPaddingRelative(IIII)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v3, p0, Lcom/tv91/u/c/h/u$c;->w:Lcom/tv91/r/i;

    iget-object v3, v3, Lcom/tv91/r/i;->d:Landroid/widget/TextView;

    const v4, 0x7f0701b9

    .line 8
    invoke-virtual {p0, v4}, Lcom/tv91/features/shared/h/d;->P(I)I

    move-result v4

    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/h/d;->P(I)I

    move-result v1

    .line 9
    invoke-virtual {v3, v4, v1, v2, v2}, Landroid/widget/TextView;->setPaddingRelative(IIII)V

    .line 10
    :goto_0
    iget-object v1, p0, Lcom/tv91/u/c/h/u$c;->w:Lcom/tv91/r/i;

    iget-object v1, v1, Lcom/tv91/r/i;->d:Landroid/widget/TextView;

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, v2

    const-string p1, "%d"

    invoke-static {p1, v0}, Lcom/tv91/utils/g;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
