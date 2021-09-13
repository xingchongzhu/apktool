.class Lcom/tv91/u/h/h/v$c;
.super Lcom/tv91/features/shared/h/d;
.source "PurchaseHistoryView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/h/h/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/d<",
        "Lcom/tv91/model/PurchaseHistory;",
        ">;"
    }
.end annotation


# instance fields
.field private final w:Lcom/tv91/r/g;


# direct methods
.method private constructor <init>(Lcom/tv91/r/g;)V
    .locals 5

    .line 2
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/h/d;-><init>(Lb/r/a;)V

    .line 3
    iput-object p1, p0, Lcom/tv91/u/h/h/v$c;->w:Lcom/tv91/r/g;

    .line 4
    iget-object v0, p1, Lcom/tv91/r/g;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 5
    iget-object v1, p0, Lcom/tv91/features/shared/h/d;->u:Landroid/content/Context;

    invoke-static {v1}, Lcom/tv91/utils/h;->f(Landroid/content/Context;)I

    move-result v1

    const v2, 0x7f0701b8

    invoke-virtual {p0, v2}, Lcom/tv91/features/shared/h/d;->P(I)I

    move-result v2

    mul-int/lit8 v2, v2, 0x3

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I

    int-to-double v1, v1

    const-wide/high16 v3, 0x4022000000000000L    # 9.0

    .line 6
    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v1, v1, v3

    const-wide/high16 v3, 0x4030000000000000L    # 16.0

    div-double/2addr v1, v3

    double-to-int v1, v1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 7
    iget-object p1, p1, Lcom/tv91/r/g;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/r/g;Lcom/tv91/u/h/h/v$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/h/h/v$c;-><init>(Lcom/tv91/r/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic M(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/tv91/model/PurchaseHistory;

    invoke-virtual {p0, p1}, Lcom/tv91/u/h/h/v$c;->T(Lcom/tv91/model/PurchaseHistory;)V

    return-void
.end method

.method protected T(Lcom/tv91/model/PurchaseHistory;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/h/d;->v:Lcom/tv91/z/f;

    iget-object v1, p1, Lcom/tv91/model/PurchaseHistory;->movieImg:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/tv91/z/f;->b(Ljava/lang/String;)Lcom/tv91/z/f;

    move-result-object v0

    iget-object v1, p0, Lcom/tv91/u/h/h/v$c;->w:Lcom/tv91/r/g;

    iget-object v1, v1, Lcom/tv91/r/g;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    invoke-interface {v0, v1}, Lcom/tv91/z/f;->g(Landroid/widget/ImageView;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/h/h/v$c;->w:Lcom/tv91/r/g;

    iget-object v0, v0, Lcom/tv91/r/g;->d:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/tv91/model/PurchaseHistory;->movieName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/h/h/v$c;->w:Lcom/tv91/r/g;

    iget-object v0, v0, Lcom/tv91/r/g;->c:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget p1, p1, Lcom/tv91/model/PurchaseHistory;->point:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f120117

    invoke-virtual {p0, p1, v1}, Lcom/tv91/features/shared/h/d;->R(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
