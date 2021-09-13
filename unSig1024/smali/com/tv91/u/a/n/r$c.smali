.class Lcom/tv91/u/a/n/r$c;
.super Lcom/tv91/features/shared/h/d;
.source "CategoryView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/a/n/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/d<",
        "Lcom/tv91/model/Category;",
        ">;"
    }
.end annotation


# instance fields
.field private final w:Landroid/widget/TextView;


# direct methods
.method constructor <init>(Landroid/widget/TextView;)V
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/h/d;-><init>(Landroid/view/View;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/u/a/n/r$c;->w:Landroid/widget/TextView;

    .line 3
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/16 v1, 0x28

    .line 4
    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/h/d;->N(I)I

    move-result v1

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    const/4 v1, 0x5

    .line 5
    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/h/d;->N(I)I

    move-result v2

    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/h/d;->N(I)I

    move-result v3

    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/h/d;->N(I)I

    move-result v4

    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/h/d;->N(I)I

    move-result v1

    invoke-virtual {v0, v2, v3, v4, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 6
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v0, 0x6

    .line 7
    invoke-virtual {p0, v0}, Lcom/tv91/features/shared/h/d;->N(I)I

    move-result v0

    const v1, 0x7f0600f1

    invoke-virtual {p0, v1, v0}, Lcom/tv91/features/shared/h/d;->S(II)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 v0, 0x11

    .line 8
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setGravity(I)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic M(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/tv91/model/Category;

    invoke-virtual {p0, p1}, Lcom/tv91/u/a/n/r$c;->T(Lcom/tv91/model/Category;)V

    return-void
.end method

.method protected T(Lcom/tv91/model/Category;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lcom/tv91/model/b;->value:Ljava/lang/String;

    invoke-static {v0}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2
    iget-object v0, p1, Lcom/tv91/model/b;->value:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xa

    const/4 v2, 0x2

    if-le v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/tv91/u/a/n/r$c;->w:Landroid/widget/TextView;

    const/high16 v1, 0x41400000    # 12.0f

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p1, Lcom/tv91/model/b;->value:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    if-le v0, v1, :cond_1

    .line 5
    iget-object v0, p0, Lcom/tv91/u/a/n/r$c;->w:Landroid/widget/TextView;

    const/high16 v1, 0x41600000    # 14.0f

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/tv91/u/a/n/r$c;->w:Landroid/widget/TextView;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 7
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/tv91/u/a/n/r$c;->w:Landroid/widget/TextView;

    iget-object p1, p1, Lcom/tv91/model/b;->value:Ljava/lang/String;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
