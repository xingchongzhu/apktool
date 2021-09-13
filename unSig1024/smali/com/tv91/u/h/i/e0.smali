.class final Lcom/tv91/u/h/i/e0;
.super Lcom/tv91/features/shared/f;
.source "PaymentView.java"

# interfaces
.implements Lcom/tv91/u/h/f;


# instance fields
.field private final e:Lcom/tv91/r/m0;

.field private final f:Lcom/tv91/features/shared/g;

.field private final g:Lcom/tv91/u/h/i/d0;

.field private final h:Lcom/tv91/u/h/i/d0;

.field private final i:Landroid/app/ProgressDialog;

.field private j:Landroidx/recyclerview/widget/RecyclerView$n;


# direct methods
.method constructor <init>(Lcom/tv91/r/m0;)V
    .locals 7

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/f;-><init>(Lb/r/a;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/u/h/i/e0;->e:Lcom/tv91/r/m0;

    .line 3
    new-instance v0, Lcom/tv91/features/shared/g;

    iget-object v1, p1, Lcom/tv91/r/m0;->o:Lcom/tv91/r/y;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/g;-><init>(Lcom/tv91/r/y;)V

    iput-object v0, p0, Lcom/tv91/u/h/i/e0;->f:Lcom/tv91/features/shared/g;

    .line 4
    new-instance v1, Lcom/tv91/u/h/i/d0;

    invoke-direct {v1}, Lcom/tv91/u/h/i/d0;-><init>()V

    iput-object v1, p0, Lcom/tv91/u/h/i/e0;->g:Lcom/tv91/u/h/i/d0;

    .line 5
    new-instance v2, Lcom/tv91/u/h/i/d0;

    invoke-direct {v2}, Lcom/tv91/u/h/i/d0;-><init>()V

    iput-object v2, p0, Lcom/tv91/u/h/i/e0;->h:Lcom/tv91/u/h/i/d0;

    .line 6
    new-instance v3, Landroid/app/ProgressDialog;

    iget-object v4, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v3, v4}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, Lcom/tv91/u/h/i/e0;->i:Landroid/app/ProgressDialog;

    const v4, 0x7f120163

    .line 7
    invoke-virtual {v0, v4}, Lcom/tv91/features/shared/g;->p(I)V

    const v4, 0x7f0e0001

    .line 8
    invoke-virtual {v0, v4}, Lcom/tv91/features/shared/g;->c(I)V

    .line 9
    iget-object v0, p1, Lcom/tv91/r/m0;->d:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v4, Lcom/tv91/features/shared/widget/NoScrollGridLayoutManager;

    iget-object v5, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    const/4 v6, 0x2

    invoke-direct {v4, v5, v6}, Lcom/tv91/features/shared/widget/NoScrollGridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 10
    iget-object v0, p1, Lcom/tv91/r/m0;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    .line 11
    iget-object v0, p1, Lcom/tv91/r/m0;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Lcom/tv91/u/h/i/e0;->r2()Landroidx/recyclerview/widget/RecyclerView$n;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->h(Landroidx/recyclerview/widget/RecyclerView$n;)V

    .line 12
    iget-object v0, p1, Lcom/tv91/r/m0;->c:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lcom/tv91/features/shared/widget/NoScrollGridLayoutManager;

    iget-object v4, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v1, v4, v6}, Lcom/tv91/features/shared/widget/NoScrollGridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 13
    iget-object v0, p1, Lcom/tv91/r/m0;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    .line 14
    iget-object v0, p1, Lcom/tv91/r/m0;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Lcom/tv91/u/h/i/e0;->r2()Landroidx/recyclerview/widget/RecyclerView$n;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->h(Landroidx/recyclerview/widget/RecyclerView$n;)V

    .line 15
    iget-object v0, p1, Lcom/tv91/r/m0;->i:Lcom/tv91/features/shared/widget/CountdownTextView;

    const v1, 0x7f0800ce

    .line 16
    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/f;->n2(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/4 v2, 0x0

    .line 17
    invoke-virtual {v0, v1, v2, v2, v2}, Landroidx/appcompat/widget/a0;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 18
    iget-object v0, p1, Lcom/tv91/r/m0;->i:Lcom/tv91/features/shared/widget/CountdownTextView;

    new-instance v1, Lcom/tv91/u/h/i/e0$a;

    invoke-direct {v1, p0, p1}, Lcom/tv91/u/h/i/e0$a;-><init>(Lcom/tv91/u/h/i/e0;Lcom/tv91/r/m0;)V

    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/CountdownTextView;->setCountDownListener(Lcom/tv91/features/shared/widget/CountdownTextView$b;)V

    const/4 p1, 0x1

    .line 19
    invoke-virtual {v3, p1}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    return-void
.end method

.method static synthetic q2(Lcom/tv91/u/h/i/e0;I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private r2()Landroidx/recyclerview/widget/RecyclerView$n;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/i/e0;->j:Landroidx/recyclerview/widget/RecyclerView$n;

    if-nez v0, :cond_0

    const v0, 0x7f0701b8

    .line 2
    invoke-virtual {p0, v0}, Lcom/tv91/features/shared/f;->m2(I)I

    move-result v0

    .line 3
    new-instance v1, Lcom/tv91/u/h/i/e0$b;

    invoke-direct {v1, p0, v0}, Lcom/tv91/u/h/i/e0$b;-><init>(Lcom/tv91/u/h/i/e0;I)V

    iput-object v1, p0, Lcom/tv91/u/h/i/e0;->j:Landroidx/recyclerview/widget/RecyclerView$n;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/h/i/e0;->j:Landroidx/recyclerview/widget/RecyclerView$n;

    return-object v0
.end method

.method static synthetic s2(Ljava/lang/Runnable;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method private synthetic t2(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/tv91/u/h/i/e0;->e:Lcom/tv91/r/m0;

    iget-object p1, p1, Lcom/tv91/r/m0;->e:Landroid/widget/ImageView;

    .line 2
    invoke-virtual {p1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->B:Ljava/lang/String;

    .line 4
    iget-object v0, p0, Lcom/tv91/u/h/i/e0;->e:Lcom/tv91/r/m0;

    iget-object v0, v0, Lcom/tv91/r/m0;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 5
    iget-object p1, p0, Lcom/tv91/u/h/i/e0;->e:Lcom/tv91/r/m0;

    iget-object p1, p1, Lcom/tv91/r/m0;->e:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method


# virtual methods
.method public D(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/tv91/u/h/i/e0;->i:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->show()V

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/tv91/u/h/i/e0;->i:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    :goto_0
    return-void
.end method

.method public E1(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/i/e0;->e:Lcom/tv91/r/m0;

    iget-object v0, v0, Lcom/tv91/r/m0;->i:Lcom/tv91/features/shared/widget/CountdownTextView;

    invoke-virtual {v0, p1, p2}, Lcom/tv91/features/shared/widget/CountdownTextView;->m(II)V

    return-void
.end method

.method public J(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tv91/u/h/i/e0;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {p1}, Lcom/tv91/features/shared/g;->a()V

    return-void
.end method

.method public W1(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/i/e0;->e:Lcom/tv91/r/m0;

    iget-object v0, v0, Lcom/tv91/r/m0;->e:Landroid/widget/ImageView;

    new-instance v1, Lcom/tv91/u/h/i/t;

    invoke-direct {v1, p1}, Lcom/tv91/u/h/i/t;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/i/e0;->e:Lcom/tv91/r/m0;

    iget-object v0, v0, Lcom/tv91/r/m0;->g:Landroid/widget/ProgressBar;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method

.method public d(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/i/e0;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->j(Ljava/lang/Runnable;)V

    return-void
.end method

.method public g0(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/widget/e;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public g2(Lcom/tv91/model/ProductGroup;Lcom/tv91/model/ProductGroup;Lcom/tv91/model/ProductGroup;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/i/e0;->e:Lcom/tv91/r/m0;

    iget-object v0, v0, Lcom/tv91/r/m0;->m:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/tv91/model/ProductGroup;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/h/i/e0;->e:Lcom/tv91/r/m0;

    iget-object v0, v0, Lcom/tv91/r/m0;->n:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/tv91/model/ProductGroup;->subTitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/h/i/e0;->g:Lcom/tv91/u/h/i/d0;

    iget-object p1, p1, Lcom/tv91/model/ProductGroup;->products:Ljava/util/List;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->x(Ljava/util/List;)V

    .line 4
    iget-object p1, p0, Lcom/tv91/u/h/i/e0;->e:Lcom/tv91/r/m0;

    iget-object p1, p1, Lcom/tv91/r/m0;->j:Landroid/widget/TextView;

    iget-object v0, p2, Lcom/tv91/model/ProductGroup;->title:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    iget-object p1, p0, Lcom/tv91/u/h/i/e0;->e:Lcom/tv91/r/m0;

    iget-object p1, p1, Lcom/tv91/r/m0;->k:Landroid/widget/TextView;

    iget-object v0, p2, Lcom/tv91/model/ProductGroup;->subTitle:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object p1, p0, Lcom/tv91/u/h/i/e0;->h:Lcom/tv91/u/h/i/d0;

    iget-object p2, p2, Lcom/tv91/model/ProductGroup;->products:Ljava/util/List;

    invoke-virtual {p1, p2}, Lcom/tv91/features/shared/h/b;->x(Ljava/util/List;)V

    .line 7
    iget-object p1, p0, Lcom/tv91/features/shared/f;->c:Lcom/tv91/z/f;

    iget-object p2, p3, Lcom/tv91/model/ProductGroup;->image:Ljava/lang/String;

    invoke-interface {p1, p2}, Lcom/tv91/z/f;->b(Ljava/lang/String;)Lcom/tv91/z/f;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p1, p2, p2}, Lcom/tv91/z/f;->d(II)Lcom/tv91/z/f;

    move-result-object p1

    new-instance p2, Lcom/tv91/u/h/i/u;

    invoke-direct {p2, p0}, Lcom/tv91/u/h/i/u;-><init>(Lcom/tv91/u/h/i/e0;)V

    invoke-interface {p1, p2}, Lcom/tv91/z/f;->f(Lcom/tv91/utils/i/a;)V

    return-void
.end method

.method public h2(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tv91/u/h/i/e0;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {p1}, Lcom/tv91/features/shared/g;->b()V

    .line 2
    iget-object p1, p0, Lcom/tv91/u/h/i/e0;->g:Lcom/tv91/u/h/i/d0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/u/h/i/e0;->h:Lcom/tv91/u/h/i/d0;

    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    return-void
.end method

.method public u1(Lcom/tv91/model/Product;Lb/g/j/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tv91/model/Product;",
            "Lb/g/j/a<",
            "Lcom/tv91/model/PaymentMethod;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/tv91/u/h/i/c0;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/u/h/i/c0;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {v0, p1}, Lcom/tv91/u/h/i/c0;->r(Lcom/tv91/model/Product;)Lcom/tv91/u/h/i/c0;

    move-result-object p1

    .line 3
    invoke-virtual {p1, p2}, Lcom/tv91/u/h/i/c0;->s(Lb/g/j/a;)Lcom/tv91/u/h/i/c0;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Lcom/tv91/u/h/i/c0;->show()V

    return-void
.end method

.method public synthetic u2(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/h/i/e0;->t2(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public v(Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f12005d

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f120164

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->m(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f12004d

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->o(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f12014d

    .line 5
    invoke-virtual {v0, v1, p2}, Lcom/tv91/features/shared/widget/e$a;->r(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p2

    const v0, 0x7f12014e

    .line 6
    invoke-virtual {p2, v0, p1}, Lcom/tv91/features/shared/widget/e$a;->w(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public x0(Lb/g/j/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/Product;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/i/e0;->g:Lcom/tv91/u/h/i/d0;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/h/i/e0;->h:Lcom/tv91/u/h/i/d0;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    return-void
.end method
