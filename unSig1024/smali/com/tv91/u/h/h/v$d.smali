.class Lcom/tv91/u/h/h/v$d;
.super Lcom/tv91/features/shared/h/d;
.source "PurchaseHistoryView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/h/h/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/d<",
        "Lcom/tv91/model/PurchaseHistory;",
        ">;"
    }
.end annotation


# instance fields
.field private final w:Lcom/tv91/r/o;


# direct methods
.method private constructor <init>(Lcom/tv91/r/o;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/h/d;-><init>(Lb/r/a;)V

    .line 3
    iput-object p1, p0, Lcom/tv91/u/h/h/v$d;->w:Lcom/tv91/r/o;

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/r/o;Lcom/tv91/u/h/h/v$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/h/h/v$d;-><init>(Lcom/tv91/r/o;)V

    return-void
.end method

.method private synthetic U(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    new-instance p1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v0, p0, Lcom/tv91/features/shared/h/d;->u:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-direct {p1, v0, p2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 2
    iget-object p2, p0, Lcom/tv91/u/h/h/v$d;->w:Lcom/tv91/r/o;

    iget-object p2, p2, Lcom/tv91/r/o;->d:Lcom/tv91/features/shared/widget/DrawableTextView;

    invoke-virtual {p2, p1}, Lcom/tv91/features/shared/widget/DrawableTextView;->setTopDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic M(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/tv91/model/PurchaseHistory;

    invoke-virtual {p0, p1}, Lcom/tv91/u/h/h/v$d;->T(Lcom/tv91/model/PurchaseHistory;)V

    return-void
.end method

.method protected T(Lcom/tv91/model/PurchaseHistory;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/h/v$d;->w:Lcom/tv91/r/o;

    iget-object v0, v0, Lcom/tv91/r/o;->b:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/tv91/model/PurchaseHistory;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/h/h/v$d;->w:Lcom/tv91/r/o;

    iget-object v0, v0, Lcom/tv91/r/o;->e:Landroid/widget/TextView;

    iget v1, p1, Lcom/tv91/model/PurchaseHistory;->point:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget v0, p1, Lcom/tv91/model/PurchaseHistory;->movieId:I

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    .line 4
    iget-object v0, p0, Lcom/tv91/u/h/h/v$d;->w:Lcom/tv91/r/o;

    iget-object v0, v0, Lcom/tv91/r/o;->d:Lcom/tv91/features/shared/widget/DrawableTextView;

    iget-object v2, p1, Lcom/tv91/model/PurchaseHistory;->movieName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/h/h/v$d;->w:Lcom/tv91/r/o;

    iget-object v0, v0, Lcom/tv91/r/o;->d:Lcom/tv91/features/shared/widget/DrawableTextView;

    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/DrawableTextView;->setTopDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/h/h/v$d;->w:Lcom/tv91/r/o;

    iget-object v0, v0, Lcom/tv91/r/o;->d:Lcom/tv91/features/shared/widget/DrawableTextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object v0, p0, Lcom/tv91/u/h/h/v$d;->w:Lcom/tv91/r/o;

    iget-object v0, v0, Lcom/tv91/r/o;->d:Lcom/tv91/features/shared/widget/DrawableTextView;

    const v1, 0x7f08011b

    .line 8
    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/h/d;->Q(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/DrawableTextView;->setTopDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 10
    iget-object v0, p0, Lcom/tv91/features/shared/h/d;->v:Lcom/tv91/z/f;

    iget-object v1, p1, Lcom/tv91/model/PurchaseHistory;->movieImg:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/tv91/z/f;->b(Ljava/lang/String;)Lcom/tv91/z/f;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/h/h/o;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/h/o;-><init>(Lcom/tv91/u/h/h/v$d;)V

    invoke-interface {v0, v1}, Lcom/tv91/z/f;->f(Lcom/tv91/utils/i/a;)V

    .line 11
    :goto_0
    iget-object v0, p0, Lcom/tv91/u/h/h/v$d;->w:Lcom/tv91/r/o;

    iget-object v0, v0, Lcom/tv91/r/o;->f:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/tv91/model/PurchaseHistory;->start:Ljava/util/Date;

    invoke-static {v1}, Lcom/tv91/utils/a;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object v0, p0, Lcom/tv91/u/h/h/v$d;->w:Lcom/tv91/r/o;

    iget-object v0, v0, Lcom/tv91/r/o;->c:Landroid/widget/TextView;

    iget-object p1, p1, Lcom/tv91/model/PurchaseHistory;->end:Ljava/util/Date;

    invoke-static {p1}, Lcom/tv91/utils/a;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public synthetic V(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/h/h/v$d;->U(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void
.end method
