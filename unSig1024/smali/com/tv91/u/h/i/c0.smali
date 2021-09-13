.class final Lcom/tv91/u/h/i/c0;
.super Lcom/google/android/material/bottomsheet/a;
.source "PaymentMethodDialog.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/h/i/c0$a;
    }
.end annotation


# instance fields
.field private final j:Lcom/tv91/r/p;

.field private final k:Lcom/tv91/u/h/i/b0;

.field private final l:F

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tv91/model/PaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private n:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/tv91/u/h/i/c0;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/google/android/material/bottomsheet/a;-><init>(Landroid/content/Context;I)V

    const p1, 0x7f0d003e

    .line 3
    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/a;->setContentView(I)V

    const p1, 0x7f0a00b5

    .line 4
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/g;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 5
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Lcom/tv91/r/p;->b(Landroid/view/View;)Lcom/tv91/r/p;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/h/i/c0;->j:Lcom/tv91/r/p;

    .line 6
    new-instance p1, Lcom/tv91/u/h/i/b0;

    invoke-direct {p1}, Lcom/tv91/u/h/i/b0;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/h/i/c0;->k:Lcom/tv91/u/h/i/b0;

    .line 7
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    iput p1, p0, Lcom/tv91/u/h/i/c0;->l:F

    return-void
.end method

.method private k(Lcom/tv91/model/Product;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/tv91/model/Product;->getTitle()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f12014f

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method static synthetic m(Lb/g/j/a;Lcom/tv91/model/PaymentMethod;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic n(Lb/g/j/a;Lcom/tv91/model/PaymentMethod;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lcom/tv91/model/PaymentMethod;->getNameExtra()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/appcompat/app/g;->dismiss()V

    .line 3
    invoke-interface {p1, p2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    .line 5
    invoke-virtual {p2}, Lcom/tv91/model/PaymentMethod;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->y(Ljava/lang/String;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    .line 6
    invoke-virtual {p2}, Lcom/tv91/model/PaymentMethod;->getNameExtra()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->n(Ljava/lang/String;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f12004f

    new-instance v2, Lcom/tv91/u/h/i/r;

    invoke-direct {v2, p1, p2}, Lcom/tv91/u/h/i/r;-><init>(Lb/g/j/a;Lcom/tv91/model/PaymentMethod;)V

    .line 7
    invoke-virtual {v0, v1, v2}, Lcom/tv91/features/shared/widget/e$a;->w(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const p2, 0x7f12004d

    .line 8
    invoke-virtual {p1, p2}, Lcom/tv91/features/shared/widget/e$a;->o(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 9
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    :goto_0
    return-void
.end method

.method private synthetic p(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/g;->dismiss()V

    return-void
.end method


# virtual methods
.method public synthetic o(Lb/g/j/a;Lcom/tv91/model/PaymentMethod;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/h/i/c0;->n(Lb/g/j/a;Lcom/tv91/model/PaymentMethod;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lcom/google/android/material/bottomsheet/a;->onCreate(Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/u/h/i/c0;->j:Lcom/tv91/r/p;

    iget-object p1, p1, Lcom/tv91/r/p;->d:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lcom/tv91/u/h/i/c0;->k:Lcom/tv91/u/h/i/b0;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/u/h/i/c0;->j:Lcom/tv91/r/p;

    iget-object p1, p1, Lcom/tv91/r/p;->d:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 4
    iget-object p1, p0, Lcom/tv91/u/h/i/c0;->j:Lcom/tv91/r/p;

    iget-object p1, p1, Lcom/tv91/r/p;->d:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Lcom/tv91/u/h/i/c0$a;

    iget v1, p0, Lcom/tv91/u/h/i/c0;->l:F

    float-to-int v1, v1

    invoke-direct {v0, v1, v2}, Lcom/tv91/u/h/i/c0$a;-><init>(II)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->h(Landroidx/recyclerview/widget/RecyclerView$n;)V

    .line 5
    iget-object p1, p0, Lcom/tv91/u/h/i/c0;->j:Lcom/tv91/r/p;

    iget-object p1, p1, Lcom/tv91/r/p;->e:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/tv91/u/h/i/c0;->n:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object p1, p0, Lcom/tv91/u/h/i/c0;->k:Lcom/tv91/u/h/i/b0;

    iget-object v0, p0, Lcom/tv91/u/h/i/c0;->m:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/h/b;->x(Ljava/util/List;)V

    return-void
.end method

.method protected onStart()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/google/android/material/bottomsheet/a;->onStart()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/h/i/c0;->j:Lcom/tv91/r/p;

    iget-object v0, v0, Lcom/tv91/r/p;->c:Landroid/widget/ImageView;

    new-instance v1, Lcom/tv91/u/h/i/q;

    invoke-direct {v1, p0}, Lcom/tv91/u/h/i/q;-><init>(Lcom/tv91/u/h/i/c0;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public synthetic q(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/h/i/c0;->p(Landroid/view/View;)V

    return-void
.end method

.method r(Lcom/tv91/model/Product;)Lcom/tv91/u/h/i/c0;
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/tv91/model/Product;->paymentMethods:Ljava/util/List;

    iput-object v0, p0, Lcom/tv91/u/h/i/c0;->m:Ljava/util/List;

    .line 2
    invoke-direct {p0, p1}, Lcom/tv91/u/h/i/c0;->k(Lcom/tv91/model/Product;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/h/i/c0;->n:Ljava/lang/String;

    return-object p0
.end method

.method s(Lb/g/j/a;)Lcom/tv91/u/h/i/c0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/PaymentMethod;",
            ">;)",
            "Lcom/tv91/u/h/i/c0;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/i/c0;->k:Lcom/tv91/u/h/i/b0;

    new-instance v1, Lcom/tv91/u/h/i/s;

    invoke-direct {v1, p0, p1}, Lcom/tv91/u/h/i/s;-><init>(Lcom/tv91/u/h/i/c0;Lb/g/j/a;)V

    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    return-object p0
.end method

.method public show()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/i/c0;->m:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0}, Landroid/app/Dialog;->show()V

    return-void

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
