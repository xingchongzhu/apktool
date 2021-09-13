.class Lcom/tv91/u/a/p/u$b;
.super Lcom/tv91/features/shared/h/d;
.source "MenuAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/a/p/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/d<",
        "Lcom/tv91/u/a/j;",
        ">;"
    }
.end annotation


# instance fields
.field private final w:Lcom/tv91/r/c;


# direct methods
.method private constructor <init>(Lcom/tv91/r/c;)V
    .locals 3

    .line 2
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/h/d;-><init>(Lb/r/a;)V

    .line 3
    iput-object p1, p0, Lcom/tv91/u/a/p/u$b;->w:Lcom/tv91/r/c;

    .line 4
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    const v1, 0x7f06006f

    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/h/d;->O(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 5
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    const v1, 0x7f0701ba

    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/h/d;->P(I)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 6
    iget-object p1, p1, Lcom/tv91/r/c;->e:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/r/c;Lcom/tv91/u/a/p/u$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/a/p/u$b;-><init>(Lcom/tv91/r/c;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic M(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/tv91/u/a/j;

    invoke-virtual {p0, p1}, Lcom/tv91/u/a/p/u$b;->T(Lcom/tv91/u/a/j;)V

    return-void
.end method

.method protected T(Lcom/tv91/u/a/j;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/tv91/u/a/j;->b:Lcom/tv91/u/a/j;

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-ne p1, v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/p/u$b;->w:Lcom/tv91/r/c;

    iget-object v0, v0, Lcom/tv91/r/c;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/a/p/u$b;->w:Lcom/tv91/r/c;

    iget-object v0, v0, Lcom/tv91/r/c;->c:Landroid/widget/ImageView;

    const v2, 0x7f0800de

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/a/p/u$b;->w:Lcom/tv91/r/c;

    iget-object v0, v0, Lcom/tv91/r/c;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_0

    .line 5
    :cond_0
    sget-object v0, Lcom/tv91/u/a/j;->d:Lcom/tv91/u/a/j;

    if-ne p1, v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/tv91/u/a/p/u$b;->w:Lcom/tv91/r/c;

    iget-object v0, v0, Lcom/tv91/r/c;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lcom/tv91/u/a/p/u$b;->w:Lcom/tv91/r/c;

    iget-object v0, v0, Lcom/tv91/r/c;->c:Landroid/widget/ImageView;

    const v2, 0x7f0800d4

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 8
    iget-object v0, p0, Lcom/tv91/u/a/p/u$b;->w:Lcom/tv91/r/c;

    iget-object v0, v0, Lcom/tv91/r/c;->d:Landroid/widget/TextView;

    const v2, 0x7f06007a

    invoke-virtual {p0, v2}, Lcom/tv91/features/shared/h/d;->O(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 9
    iget-object v0, p0, Lcom/tv91/u/a/p/u$b;->w:Lcom/tv91/r/c;

    iget-object v0, v0, Lcom/tv91/r/c;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 10
    :cond_1
    sget-object v0, Lcom/tv91/u/a/j;->c:Lcom/tv91/u/a/j;

    if-ne p1, v0, :cond_2

    .line 11
    iget-object v0, p0, Lcom/tv91/u/a/p/u$b;->w:Lcom/tv91/r/c;

    iget-object v0, v0, Lcom/tv91/r/c;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 12
    iget-object v0, p0, Lcom/tv91/u/a/p/u$b;->w:Lcom/tv91/r/c;

    iget-object v0, v0, Lcom/tv91/r/c;->c:Landroid/widget/ImageView;

    const v1, 0x7f0800d3

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 13
    :cond_2
    sget-object v0, Lcom/tv91/u/a/j;->f:Lcom/tv91/u/a/j;

    const v3, 0x7f0800e6

    if-ne p1, v0, :cond_3

    .line 14
    iget-object v0, p0, Lcom/tv91/u/a/p/u$b;->w:Lcom/tv91/r/c;

    iget-object v0, v0, Lcom/tv91/r/c;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 15
    iget-object v0, p0, Lcom/tv91/u/a/p/u$b;->w:Lcom/tv91/r/c;

    iget-object v0, v0, Lcom/tv91/r/c;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 16
    iget-object v0, p0, Lcom/tv91/u/a/p/u$b;->w:Lcom/tv91/r/c;

    iget-object v0, v0, Lcom/tv91/r/c;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 17
    :cond_3
    sget-object v0, Lcom/tv91/u/a/j;->e:Lcom/tv91/u/a/j;

    if-ne p1, v0, :cond_4

    .line 18
    iget-object v0, p0, Lcom/tv91/u/a/p/u$b;->w:Lcom/tv91/r/c;

    iget-object v0, v0, Lcom/tv91/r/c;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 19
    iget-object v0, p0, Lcom/tv91/u/a/p/u$b;->w:Lcom/tv91/r/c;

    iget-object v0, v0, Lcom/tv91/r/c;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 20
    iget-object v0, p0, Lcom/tv91/u/a/p/u$b;->w:Lcom/tv91/r/c;

    iget-object v0, v0, Lcom/tv91/r/c;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 21
    :cond_4
    sget-object v0, Lcom/tv91/u/a/j;->g:Lcom/tv91/u/a/j;

    if-ne p1, v0, :cond_5

    .line 22
    iget-object v0, p0, Lcom/tv91/u/a/p/u$b;->w:Lcom/tv91/r/c;

    iget-object v0, v0, Lcom/tv91/r/c;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 23
    iget-object v0, p0, Lcom/tv91/u/a/p/u$b;->w:Lcom/tv91/r/c;

    iget-object v0, v0, Lcom/tv91/r/c;->c:Landroid/widget/ImageView;

    const v1, 0x7f0800e4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 24
    :cond_5
    sget-object v0, Lcom/tv91/u/a/j;->p:Lcom/tv91/u/a/j;

    if-ne p1, v0, :cond_6

    .line 25
    iget-object v0, p0, Lcom/tv91/u/a/p/u$b;->w:Lcom/tv91/r/c;

    iget-object v0, v0, Lcom/tv91/r/c;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 26
    :cond_6
    :goto_0
    iget-object v0, p0, Lcom/tv91/u/a/p/u$b;->w:Lcom/tv91/r/c;

    iget-object v0, v0, Lcom/tv91/r/c;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/tv91/u/a/j;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
