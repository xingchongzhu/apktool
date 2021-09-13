.class Lcom/tv91/u/h/j/u$d;
.super Lcom/tv91/features/shared/h/d;
.source "PurchaseView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/h/j/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/d<",
        "Lcom/tv91/model/PurchasePackage;",
        ">;"
    }
.end annotation


# instance fields
.field private final w:Lcom/tv91/r/v;


# direct methods
.method constructor <init>(Lcom/tv91/r/v;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/h/d;-><init>(Lb/r/a;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/u/h/j/u$d;->w:Lcom/tv91/r/v;

    .line 3
    invoke-virtual {p1}, Lcom/tv91/r/v;->c()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/tv91/features/shared/h/d;->N(I)I

    move-result v0

    const v1, 0x7f0600f1

    invoke-virtual {p0, v1, v0}, Lcom/tv91/features/shared/h/d;->S(II)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private U(Lcom/tv91/model/PurchaseType;)I
    .locals 3

    .line 1
    sget-object v0, Lcom/tv91/u/h/j/u$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown PurchaseType "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const p1, 0x7f1201c5

    return p1

    :pswitch_1
    const p1, 0x7f1201b8

    return p1

    :pswitch_2
    const p1, 0x7f1201a9

    return p1

    :pswitch_3
    const p1, 0x7f1201b3

    return p1

    :pswitch_4
    const p1, 0x7f1201c3

    return p1

    :pswitch_5
    const p1, 0x7f1201ba

    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method protected bridge synthetic M(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/tv91/model/PurchasePackage;

    invoke-virtual {p0, p1}, Lcom/tv91/u/h/j/u$d;->T(Lcom/tv91/model/PurchasePackage;)V

    return-void
.end method

.method protected T(Lcom/tv91/model/PurchasePackage;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/j/u$d;->w:Lcom/tv91/r/v;

    iget-object v0, v0, Lcom/tv91/r/v;->c:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/tv91/model/PurchasePackage;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/h/j/u$d;->w:Lcom/tv91/r/v;

    iget-object v0, v0, Lcom/tv91/r/v;->b:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/tv91/model/PurchasePackage;->type:Lcom/tv91/model/PurchaseType;

    invoke-direct {p0, v1}, Lcom/tv91/u/h/j/u$d;->U(Lcom/tv91/model/PurchaseType;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/h/j/u$d;->w:Lcom/tv91/r/v;

    iget-object v0, v0, Lcom/tv91/r/v;->d:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    iget v3, p1, Lcom/tv91/model/PurchasePackage;->point:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const v3, 0x7f1201b6

    invoke-virtual {p0, v3, v2}, Lcom/tv91/features/shared/h/d;->R(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/h/j/u$d;->w:Lcom/tv91/r/v;

    iget-object v0, v0, Lcom/tv91/r/v;->f:Landroid/widget/TextView;

    new-array v1, v1, [Ljava/lang/Object;

    iget-wide v2, p1, Lcom/tv91/model/PurchasePackage;->price:D

    .line 5
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    aput-object p1, v1, v4

    const p1, 0x7f1201a5

    invoke-virtual {p0, p1, v1}, Lcom/tv91/features/shared/h/d;->R(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
