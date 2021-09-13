.class public abstract Lcom/tv91/u/a/e;
.super Lcom/tv91/features/shared/f;
.source "BottomBarView.java"

# interfaces
.implements Lcom/tv91/u/a/i;


# instance fields
.field private final e:Lcom/tv91/r/w;

.field private final f:Lcom/tv91/u/a/h;


# direct methods
.method public constructor <init>(Lcom/tv91/u/a/h;Lcom/tv91/r/w;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/tv91/r/w;->a()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/tv91/features/shared/f;-><init>(Landroid/view/View;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/u/a/e;->f:Lcom/tv91/u/a/h;

    .line 3
    iput-object p2, p0, Lcom/tv91/u/a/e;->e:Lcom/tv91/r/w;

    .line 4
    invoke-direct {p0}, Lcom/tv91/u/a/e;->q2()V

    return-void
.end method

.method private q2()V
    .locals 7

    const v0, 0x7f060033

    .line 1
    invoke-virtual {p0, v0}, Lcom/tv91/features/shared/f;->l2(I)I

    move-result v0

    const/4 v1, 0x5

    new-array v2, v1, [Lcom/tv91/features/shared/widget/DrawableTextView;

    .line 2
    iget-object v3, p0, Lcom/tv91/u/a/e;->e:Lcom/tv91/r/w;

    iget-object v4, v3, Lcom/tv91/r/w;->d:Lcom/tv91/features/shared/widget/DrawableTextView;

    const/4 v5, 0x0

    aput-object v4, v2, v5

    iget-object v4, v3, Lcom/tv91/r/w;->c:Lcom/tv91/features/shared/widget/DrawableTextView;

    const/4 v6, 0x1

    aput-object v4, v2, v6

    iget-object v4, v3, Lcom/tv91/r/w;->b:Lcom/tv91/features/shared/widget/DrawableTextView;

    const/4 v6, 0x2

    aput-object v4, v2, v6

    iget-object v4, v3, Lcom/tv91/r/w;->f:Lcom/tv91/features/shared/widget/DrawableTextView;

    const/4 v6, 0x3

    aput-object v4, v2, v6

    iget-object v3, v3, Lcom/tv91/r/w;->e:Lcom/tv91/features/shared/widget/DrawableTextView;

    const/4 v4, 0x4

    aput-object v3, v2, v4

    :goto_0
    if-ge v5, v1, :cond_1

    .line 3
    aget-object v3, v2, v5

    .line 4
    invoke-virtual {v3}, Landroid/widget/TextView;->getId()I

    move-result v4

    iget-object v6, p0, Lcom/tv91/u/a/e;->f:Lcom/tv91/u/a/h;

    iget v6, v6, Lcom/tv91/u/a/h;->g:I

    if-ne v4, v6, :cond_0

    const/4 v4, 0x0

    .line 5
    invoke-static {v3, v4}, Landroidx/core/widget/i;->j(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V

    .line 6
    iget-object v4, p0, Lcom/tv91/u/a/e;->f:Lcom/tv91/u/a/h;

    iget v4, v4, Lcom/tv91/u/a/h;->h:I

    const/4 v6, -0x1

    invoke-virtual {v3, v6, v4, v6, v6}, Lcom/tv91/features/shared/widget/DrawableTextView;->h(IIII)V

    .line 7
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private synthetic r2(Lb/g/j/a;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result p2

    invoke-static {p2}, Lcom/tv91/u/a/h;->a(I)Lcom/tv91/u/a/h;

    move-result-object p2

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/e;->f:Lcom/tv91/u/a/h;

    if-eq v0, p2, :cond_0

    .line 3
    invoke-interface {p1, p2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public h2(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tv91/u/a/e;->e:Lcom/tv91/r/w;

    iget-object p1, p1, Lcom/tv91/r/w;->d:Lcom/tv91/features/shared/widget/DrawableTextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/u/a/e;->e:Lcom/tv91/r/w;

    iget-object p1, p1, Lcom/tv91/r/w;->c:Lcom/tv91/features/shared/widget/DrawableTextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/u/a/e;->e:Lcom/tv91/r/w;

    iget-object p1, p1, Lcom/tv91/r/w;->b:Lcom/tv91/features/shared/widget/DrawableTextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    iget-object p1, p0, Lcom/tv91/u/a/e;->e:Lcom/tv91/r/w;

    iget-object p1, p1, Lcom/tv91/r/w;->f:Lcom/tv91/features/shared/widget/DrawableTextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    iget-object p1, p0, Lcom/tv91/u/a/e;->e:Lcom/tv91/r/w;

    iget-object p1, p1, Lcom/tv91/r/w;->e:Lcom/tv91/features/shared/widget/DrawableTextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public synthetic s2(Lb/g/j/a;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/a/e;->r2(Lb/g/j/a;Landroid/view/View;)V

    return-void
.end method

.method public t(Lb/g/j/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/u/a/h;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/tv91/u/a/b;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/a/b;-><init>(Lcom/tv91/u/a/e;Lb/g/j/a;)V

    invoke-static {v0}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/e;->e:Lcom/tv91/r/w;

    iget-object v0, v0, Lcom/tv91/r/w;->d:Lcom/tv91/features/shared/widget/DrawableTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/a/e;->e:Lcom/tv91/r/w;

    iget-object v0, v0, Lcom/tv91/r/w;->c:Lcom/tv91/features/shared/widget/DrawableTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/a/e;->e:Lcom/tv91/r/w;

    iget-object v0, v0, Lcom/tv91/r/w;->b:Lcom/tv91/features/shared/widget/DrawableTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/a/e;->e:Lcom/tv91/r/w;

    iget-object v0, v0, Lcom/tv91/r/w;->f:Lcom/tv91/features/shared/widget/DrawableTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    iget-object v0, p0, Lcom/tv91/u/a/e;->e:Lcom/tv91/r/w;

    iget-object v0, v0, Lcom/tv91/r/w;->e:Lcom/tv91/features/shared/widget/DrawableTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
