.class Lcom/tv91/u/h/i/d0$a;
.super Lcom/tv91/features/shared/h/d;
.source "PaymentProductAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/h/i/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/d<",
        "Lcom/tv91/model/Product;",
        ">;"
    }
.end annotation


# instance fields
.field private final w:Lcom/tv91/r/j;


# direct methods
.method constructor <init>(Lcom/tv91/r/j;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/h/d;-><init>(Lb/r/a;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/u/h/i/d0$a;->w:Lcom/tv91/r/j;

    .line 3
    invoke-virtual {p1}, Lcom/tv91/r/j;->c()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Lcom/tv91/features/shared/h/d;->N(I)I

    move-result v0

    const v1, 0x7f0600f1

    invoke-virtual {p0, v1, v0}, Lcom/tv91/features/shared/h/d;->S(II)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic M(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/tv91/model/Product;

    invoke-virtual {p0, p1}, Lcom/tv91/u/h/i/d0$a;->T(Lcom/tv91/model/Product;)V

    return-void
.end method

.method protected T(Lcom/tv91/model/Product;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/i/d0$a;->w:Lcom/tv91/r/j;

    iget-object v0, v0, Lcom/tv91/r/j;->e:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/tv91/model/Product;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/h/i/d0$a;->w:Lcom/tv91/r/j;

    iget-object v0, v0, Lcom/tv91/r/j;->f:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/tv91/model/Product;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/h/i/d0$a;->w:Lcom/tv91/r/j;

    iget-object v0, v0, Lcom/tv91/r/j;->h:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-wide v2, p1, Lcom/tv91/model/Product;->price:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0x7f120161

    invoke-virtual {p0, v2, v1}, Lcom/tv91/features/shared/h/d;->R(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    invoke-virtual {p1}, Lcom/tv91/model/Product;->getTitleExtra()Ljava/lang/String;

    move-result-object p1

    .line 5
    invoke-static {p1}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/tv91/u/h/i/d0$a;->w:Lcom/tv91/r/j;

    iget-object v0, v0, Lcom/tv91/r/j;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object p1, p0, Lcom/tv91/u/h/i/d0$a;->w:Lcom/tv91/r/j;

    iget-object p1, p1, Lcom/tv91/r/j;->d:Landroid/widget/TextView;

    const v0, 0x7f06009f

    const/4 v1, 0x2

    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/h/d;->N(I)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/tv91/features/shared/h/d;->S(II)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method
