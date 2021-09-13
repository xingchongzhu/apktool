.class Lcom/tv91/u/a/q/k$c;
.super Lcom/tv91/features/shared/h/d;
.source "PromotionView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/a/q/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/d<",
        "Lcom/tv91/model/Promotion;",
        ">;"
    }
.end annotation


# instance fields
.field private final w:Lcom/tv91/r/m;

.field private final x:I

.field private final y:I


# direct methods
.method private constructor <init>(Lcom/tv91/r/m;)V
    .locals 4

    .line 2
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/h/d;-><init>(Lb/r/a;)V

    .line 3
    iput-object p1, p0, Lcom/tv91/u/a/q/k$c;->w:Lcom/tv91/r/m;

    .line 4
    iget-object v0, p0, Lcom/tv91/features/shared/h/d;->u:Landroid/content/Context;

    invoke-static {v0}, Lcom/tv91/utils/h;->f(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/tv91/u/a/q/k$c;->x:I

    int-to-double v0, v0

    const-wide/high16 v2, 0x3fe2000000000000L    # 0.5625

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    double-to-int v0, v0

    iput v0, p0, Lcom/tv91/u/a/q/k$c;->y:I

    .line 6
    iget-object v1, p1, Lcom/tv91/r/m;->b:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 7
    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 8
    iget-object p1, p1, Lcom/tv91/r/m;->b:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/r/m;Lcom/tv91/u/a/q/k$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/a/q/k$c;-><init>(Lcom/tv91/r/m;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic M(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/tv91/model/Promotion;

    invoke-virtual {p0, p1}, Lcom/tv91/u/a/q/k$c;->T(Lcom/tv91/model/Promotion;)V

    return-void
.end method

.method protected T(Lcom/tv91/model/Promotion;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/q/k$c;->w:Lcom/tv91/r/m;

    iget-object v0, v0, Lcom/tv91/r/m;->c:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/tv91/model/Promotion;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/shared/h/d;->v:Lcom/tv91/z/f;

    iget-object p1, p1, Lcom/tv91/model/Promotion;->image:Ljava/lang/String;

    invoke-interface {v0, p1}, Lcom/tv91/z/f;->b(Ljava/lang/String;)Lcom/tv91/z/f;

    move-result-object p1

    iget v0, p0, Lcom/tv91/u/a/q/k$c;->x:I

    iget v1, p0, Lcom/tv91/u/a/q/k$c;->y:I

    invoke-interface {p1, v0, v1}, Lcom/tv91/z/f;->d(II)Lcom/tv91/z/f;

    move-result-object p1

    iget-object v0, p0, Lcom/tv91/u/a/q/k$c;->w:Lcom/tv91/r/m;

    iget-object v0, v0, Lcom/tv91/r/m;->b:Landroid/widget/ImageView;

    invoke-interface {p1, v0}, Lcom/tv91/z/f;->g(Landroid/widget/ImageView;)V

    return-void
.end method
