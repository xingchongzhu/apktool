.class Lcom/tv91/u/c/i/e0$b;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source "MoviesView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/c/i/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final t:Landroid/content/Context;

.field private final u:Lcom/tv91/z/f;

.field private final v:Landroid/widget/ImageView;

.field private final w:Landroid/widget/TextView;

.field private final x:Landroid/widget/TextView;


# direct methods
.method constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/u/c/i/e0$b;->t:Landroid/content/Context;

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/tv91/z/d;->e(Landroid/content/Context;)Lcom/tv91/z/f;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/u/c/i/e0$b;->u:Lcom/tv91/z/f;

    const v0, 0x7f0a0143

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/tv91/u/c/i/e0$b;->v:Landroid/widget/ImageView;

    const v0, 0x7f0a02a2

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/tv91/u/c/i/e0$b;->w:Landroid/widget/TextView;

    const v0, 0x7f0a029e

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/tv91/u/c/i/e0$b;->x:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method M(Lcom/tv91/model/Movie;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/i/e0$b;->u:Lcom/tv91/z/f;

    iget-object v1, p1, Lcom/tv91/model/Movie;->poster:Ljava/lang/String;

    invoke-static {v1}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p1, Lcom/tv91/model/Movie;->image:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object v1, p1, Lcom/tv91/model/Movie;->poster:Ljava/lang/String;

    :goto_0
    invoke-interface {v0, v1}, Lcom/tv91/z/f;->b(Ljava/lang/String;)Lcom/tv91/z/f;

    move-result-object v0

    const v1, 0x7f080119

    .line 2
    invoke-interface {v0, v1}, Lcom/tv91/z/f;->e(I)Lcom/tv91/z/f;

    move-result-object v0

    .line 3
    invoke-interface {v0, v1}, Lcom/tv91/z/f;->c(I)Lcom/tv91/z/f;

    move-result-object v0

    iget-object v1, p0, Lcom/tv91/u/c/i/e0$b;->v:Landroid/widget/ImageView;

    .line 4
    invoke-interface {v0, v1}, Lcom/tv91/z/f;->g(Landroid/widget/ImageView;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/c/i/e0$b;->w:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/tv91/model/Movie;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v0, p0, Lcom/tv91/u/c/i/e0$b;->x:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/tv91/model/Movie;->createTime:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    const/16 v1, 0x8

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lcom/tv91/u/c/i/e0$b;->x:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/tv91/u/c/i/e0$b;->t:Landroid/content/Context;

    const v3, 0x7f12010d

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    iget-object p1, p1, Lcom/tv91/model/Movie;->createTime:Ljava/lang/String;

    aput-object p1, v4, v2

    invoke-virtual {v1, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method N(Lcom/tv91/model/Movie;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/i/e0$b;->u:Lcom/tv91/z/f;

    iget-object v1, p1, Lcom/tv91/model/Movie;->poster:Ljava/lang/String;

    invoke-static {v1}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p1, Lcom/tv91/model/Movie;->image:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object v1, p1, Lcom/tv91/model/Movie;->poster:Ljava/lang/String;

    :goto_0
    invoke-interface {v0, v1}, Lcom/tv91/z/f;->b(Ljava/lang/String;)Lcom/tv91/z/f;

    move-result-object v0

    const v1, 0x7f08011a

    .line 2
    invoke-interface {v0, v1}, Lcom/tv91/z/f;->e(I)Lcom/tv91/z/f;

    move-result-object v0

    .line 3
    invoke-interface {v0, v1}, Lcom/tv91/z/f;->c(I)Lcom/tv91/z/f;

    move-result-object v0

    iget-object v1, p0, Lcom/tv91/u/c/i/e0$b;->v:Landroid/widget/ImageView;

    .line 4
    invoke-interface {v0, v1}, Lcom/tv91/z/f;->g(Landroid/widget/ImageView;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/c/i/e0$b;->w:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/tv91/model/Movie;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v0, p0, Lcom/tv91/u/c/i/e0$b;->x:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/tv91/model/Movie;->createTime:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    const/16 v1, 0x8

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lcom/tv91/u/c/i/e0$b;->x:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/tv91/u/c/i/e0$b;->t:Landroid/content/Context;

    const v3, 0x7f12010d

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    iget-object p1, p1, Lcom/tv91/model/Movie;->createTime:Ljava/lang/String;

    aput-object p1, v4, v2

    invoke-virtual {v1, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
