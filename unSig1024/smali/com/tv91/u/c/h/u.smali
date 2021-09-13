.class final Lcom/tv91/u/c/h/u;
.super Lcom/tv91/features/shared/f;
.source "HighlightView.java"

# interfaces
.implements Lcom/tv91/u/c/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/c/h/u$d;,
        Lcom/tv91/u/c/h/u$c;,
        Lcom/tv91/u/c/h/u$b;
    }
.end annotation


# instance fields
.field private final e:Lcom/tv91/r/t;

.field private f:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Lcom/tv91/model/ExternalSource;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Lcom/tv91/model/Highlight$MovieGroup;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Lcom/tv91/model/Movie;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/tv91/r/t;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/f;-><init>(Lb/r/a;)V

    .line 2
    sget-object v0, Lcom/tv91/u/c/h/j;->a:Lcom/tv91/u/c/h/j;

    iput-object v0, p0, Lcom/tv91/u/c/h/u;->f:Lb/g/j/a;

    .line 3
    sget-object v0, Lcom/tv91/u/c/h/h;->a:Lcom/tv91/u/c/h/h;

    iput-object v0, p0, Lcom/tv91/u/c/h/u;->g:Lb/g/j/a;

    .line 4
    sget-object v0, Lcom/tv91/u/c/h/p;->a:Lcom/tv91/u/c/h/p;

    iput-object v0, p0, Lcom/tv91/u/c/h/u;->h:Lb/g/j/a;

    .line 5
    iput-object p1, p0, Lcom/tv91/u/c/h/u;->e:Lcom/tv91/r/t;

    return-void
.end method

.method private synthetic A2(Lcom/tv91/model/Movie;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/tv91/u/c/h/u;->h:Lb/g/j/a;

    invoke-interface {p2, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic C2(Lcom/tv91/model/Movie;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/tv91/u/c/h/u;->h:Lb/g/j/a;

    invoke-interface {p2, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic E2(Lcom/tv91/model/ExternalSource;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/tv91/u/c/h/u;->f:Lb/g/j/a;

    invoke-interface {p2, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private q2(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    int-to-float p1, p1

    const/4 v1, 0x1

    .line 2
    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    float-to-int p1, p1

    return p1
.end method

.method private synthetic r2(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/h/u;->e:Lcom/tv91/r/t;

    iget-object v0, v0, Lcom/tv91/r/t;->f:Landroid/widget/ScrollView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/widget/ScrollView;->scrollTo(II)V

    return-void
.end method

.method static synthetic t2(Lcom/tv91/model/ExternalSource;)V
    .locals 0

    return-void
.end method

.method static synthetic u2(Lcom/tv91/model/Highlight$MovieGroup;)V
    .locals 0

    return-void
.end method

.method static synthetic v2(Lcom/tv91/model/Movie;)V
    .locals 0

    return-void
.end method

.method private synthetic w2(Lcom/tv91/model/ExternalSource;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/tv91/u/c/h/u;->f:Lb/g/j/a;

    invoke-interface {p2, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic y2(Lcom/tv91/model/Highlight$MovieGroup;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/tv91/u/c/h/u;->g:Lb/g/j/a;

    invoke-interface {p2, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public synthetic B2(Lcom/tv91/model/Movie;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/c/h/u;->A2(Lcom/tv91/model/Movie;Landroid/view/View;)V

    return-void
.end method

.method public synthetic D2(Lcom/tv91/model/Movie;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/c/h/u;->C2(Lcom/tv91/model/Movie;Landroid/view/View;)V

    return-void
.end method

.method public synthetic F2(Lcom/tv91/model/ExternalSource;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/c/h/u;->E2(Lcom/tv91/model/ExternalSource;Landroid/view/View;)V

    return-void
.end method

.method public J(Landroid/os/Bundle;)V
    .locals 4

    const-string v0, "key-scroll-position"

    .line 1
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/h/u;->e:Lcom/tv91/r/t;

    invoke-virtual {v0}, Lcom/tv91/r/t;->c()Landroid/widget/ScrollView;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/c/h/m;

    invoke-direct {v1, p0, p1}, Lcom/tv91/u/c/h/m;-><init>(Lcom/tv91/u/c/h/u;I)V

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/ScrollView;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public N(Lcom/tv91/model/Highlight$MovieGroup;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/tv91/u/c/h/u;->e:Lcom/tv91/r/t;

    iget-object v1, v1, Lcom/tv91/r/t;->b:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    .line 3
    invoke-static {v0, v1, v2}, Lcom/tv91/r/f;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/tv91/r/f;

    move-result-object v0

    .line 4
    iget-object v1, v0, Lcom/tv91/r/f;->e:Landroid/widget/TextView;

    iget-object v3, p1, Lcom/tv91/model/Highlight$MovieGroup;->title:Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    iget-object v1, v0, Lcom/tv91/r/f;->b:Landroid/widget/Button;

    iget-boolean v3, p1, Lcom/tv91/model/Highlight$MovieGroup;->hasMore:Z

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    const/16 v3, 0x8

    :goto_0
    invoke-virtual {v1, v3}, Landroid/widget/Button;->setVisibility(I)V

    .line 6
    iget-object v1, v0, Lcom/tv91/r/f;->b:Landroid/widget/Button;

    new-instance v3, Lcom/tv91/u/c/h/o;

    invoke-direct {v3, p0, p1}, Lcom/tv91/u/c/h/o;-><init>(Lcom/tv91/u/c/h/u;Lcom/tv91/model/Highlight$MovieGroup;)V

    invoke-static {v3}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/16 v1, 0x57

    .line 7
    invoke-direct {p0, v1}, Lcom/tv91/u/c/h/u;->q2(I)I

    move-result v1

    const/16 v3, 0x7d

    .line 8
    invoke-direct {p0, v3}, Lcom/tv91/u/c/h/u;->q2(I)I

    move-result v3

    .line 9
    iget-object v4, p1, Lcom/tv91/model/Highlight$MovieGroup;->movies:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_2

    .line 10
    new-instance v6, Lcom/google/android/material/imageview/ShapeableImageView;

    iget-object v7, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v6, v7}, Lcom/google/android/material/imageview/ShapeableImageView;-><init>(Landroid/content/Context;)V

    .line 11
    new-instance v7, Lc/a/a/b/c0/k;

    invoke-direct {v7}, Lc/a/a/b/c0/k;-><init>()V

    const/4 v8, 0x5

    invoke-direct {p0, v8}, Lcom/tv91/u/c/h/u;->q2(I)I

    move-result v8

    int-to-float v8, v8

    invoke-virtual {v7, v8}, Lc/a/a/b/c0/k;->w(F)Lc/a/a/b/c0/k;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lc/a/a/b/c0/k;)V

    .line 12
    sget-object v7, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    const v7, 0x7f08011b

    .line 13
    invoke-virtual {p0, v7}, Lcom/tv91/features/shared/f;->n2(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroidx/appcompat/widget/o;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 14
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v7, v1, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    add-int/lit8 v8, v4, -0x1

    if-ne v5, v8, :cond_1

    const/4 v8, 0x0

    goto :goto_2

    :cond_1
    const v8, 0x7f0701b8

    .line 15
    invoke-virtual {p0, v8}, Lcom/tv91/features/shared/f;->m2(I)I

    move-result v8

    :goto_2
    invoke-virtual {v7, v8}, Landroid/widget/LinearLayout$LayoutParams;->setMarginEnd(I)V

    .line 16
    iget-object v8, v0, Lcom/tv91/r/f;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v8, v6, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 17
    iget-object v7, p1, Lcom/tv91/model/Highlight$MovieGroup;->movies:Ljava/util/List;

    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/tv91/model/Movie;

    .line 18
    new-instance v8, Lcom/tv91/u/c/h/k;

    invoke-direct {v8, p0, v7}, Lcom/tv91/u/c/h/k;-><init>(Lcom/tv91/u/c/h/u;Lcom/tv91/model/Movie;)V

    invoke-static {v8}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object v8

    invoke-virtual {v6, v8}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    iget-object v8, p0, Lcom/tv91/features/shared/f;->c:Lcom/tv91/z/f;

    iget-object v7, v7, Lcom/tv91/model/Movie;->image:Ljava/lang/String;

    invoke-interface {v8, v7}, Lcom/tv91/z/f;->b(Ljava/lang/String;)Lcom/tv91/z/f;

    move-result-object v7

    invoke-interface {v7, v6}, Lcom/tv91/z/f;->g(Landroid/widget/ImageView;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 20
    :cond_2
    iget-object p1, p0, Lcom/tv91/u/c/h/u;->e:Lcom/tv91/r/t;

    iget-object p1, p1, Lcom/tv91/r/t;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Lcom/tv91/r/f;->c()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method public S(Lcom/tv91/model/Highlight$Advertise;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 2
    iget-object p1, p1, Lcom/tv91/model/Highlight$Advertise;->advertises:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/model/ExternalSource;

    .line 3
    new-instance v2, Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x1

    .line 4
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setAdjustViewBounds(Z)V

    .line 5
    new-instance v3, Lcom/tv91/u/c/h/q;

    invoke-direct {v3, p0, v1}, Lcom/tv91/u/c/h/q;-><init>(Lcom/tv91/u/c/h/u;Lcom/tv91/model/ExternalSource;)V

    invoke-static {v3}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    iget-object v3, p0, Lcom/tv91/u/c/h/u;->e:Lcom/tv91/r/t;

    iget-object v3, v3, Lcom/tv91/r/t;->e:Landroid/widget/ViewFlipper;

    invoke-virtual {v3, v2, v0}, Landroid/widget/ViewFlipper;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 7
    iget-object v3, p0, Lcom/tv91/features/shared/f;->c:Lcom/tv91/z/f;

    iget-object v1, v1, Lcom/tv91/model/ExternalSource;->image:Ljava/lang/String;

    invoke-interface {v3, v1}, Lcom/tv91/z/f;->b(Ljava/lang/String;)Lcom/tv91/z/f;

    move-result-object v1

    const/4 v3, 0x0

    invoke-interface {v1, v3, v3}, Lcom/tv91/z/f;->d(II)Lcom/tv91/z/f;

    move-result-object v1

    invoke-interface {v1, v2}, Lcom/tv91/z/f;->g(Landroid/widget/ImageView;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b2(Lb/g/j/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/ExternalSource;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/u/c/h/u;->f:Lb/g/j/a;

    return-void
.end method

.method public e(Lb/g/j/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/Movie;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/u/c/h/u;->h:Lb/g/j/a;

    return-void
.end method

.method public h2(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/h/u;->e:Lcom/tv91/r/t;

    iget-object v0, v0, Lcom/tv91/r/t;->f:Landroid/widget/ScrollView;

    invoke-virtual {v0}, Landroid/widget/ScrollView;->getScrollY()I

    move-result v0

    const-string v1, "key-scroll-position"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method public i1(Lcom/tv91/model/Highlight$Ranking;Lcom/tv91/model/Highlight$Ranking;Lcom/tv91/model/Highlight$Ranking;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/u/c/h/u$b;

    iget-object p1, p1, Lcom/tv91/model/Highlight$Ranking;->movies:Ljava/util/List;

    sget-object v1, Lcom/tv91/u/c/h/u$d;->a:Lcom/tv91/u/c/h/u$d;

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Lcom/tv91/u/c/h/u$b;-><init>(Ljava/util/List;Lcom/tv91/u/c/h/u$d;Lcom/tv91/u/c/h/u$a;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/u/c/h/u;->h:Lb/g/j/a;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/u/c/h/u;->e:Lcom/tv91/r/t;

    iget-object p1, p1, Lcom/tv91/r/t;->h:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    .line 4
    new-instance p1, Lcom/tv91/u/c/h/u$b;

    iget-object p2, p2, Lcom/tv91/model/Highlight$Ranking;->movies:Ljava/util/List;

    sget-object v0, Lcom/tv91/u/c/h/u$d;->b:Lcom/tv91/u/c/h/u$d;

    invoke-direct {p1, p2, v0, v2}, Lcom/tv91/u/c/h/u$b;-><init>(Ljava/util/List;Lcom/tv91/u/c/h/u$d;Lcom/tv91/u/c/h/u$a;)V

    .line 5
    iget-object p2, p0, Lcom/tv91/u/c/h/u;->h:Lb/g/j/a;

    invoke-virtual {p1, p2}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    .line 6
    iget-object p2, p0, Lcom/tv91/u/c/h/u;->e:Lcom/tv91/r/t;

    iget-object p2, p2, Lcom/tv91/r/t;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    .line 7
    new-instance p1, Lcom/tv91/u/c/h/u$b;

    iget-object p2, p3, Lcom/tv91/model/Highlight$Ranking;->movies:Ljava/util/List;

    sget-object p3, Lcom/tv91/u/c/h/u$d;->c:Lcom/tv91/u/c/h/u$d;

    invoke-direct {p1, p2, p3, v2}, Lcom/tv91/u/c/h/u$b;-><init>(Ljava/util/List;Lcom/tv91/u/c/h/u$d;Lcom/tv91/u/c/h/u$a;)V

    .line 8
    iget-object p2, p0, Lcom/tv91/u/c/h/u;->h:Lb/g/j/a;

    invoke-virtual {p1, p2}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    .line 9
    iget-object p2, p0, Lcom/tv91/u/c/h/u;->e:Lcom/tv91/r/t;

    iget-object p2, p2, Lcom/tv91/r/t;->i:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    return-void
.end method

.method public o0(Lb/g/j/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/Highlight$MovieGroup;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/u/c/h/u;->g:Lb/g/j/a;

    return-void
.end method

.method public r(Lcom/tv91/model/Highlight$Web;)V
    .locals 9

    .line 1
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 2
    iget-object v1, p1, Lcom/tv91/model/Highlight$Web;->sources:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 3
    new-instance v4, Lcom/google/android/material/imageview/ShapeableImageView;

    iget-object v5, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v4, v5}, Lcom/google/android/material/imageview/ShapeableImageView;-><init>(Landroid/content/Context;)V

    .line 4
    new-instance v5, Lc/a/a/b/c0/k;

    invoke-direct {v5}, Lc/a/a/b/c0/k;-><init>()V

    const/4 v6, 0x5

    invoke-direct {p0, v6}, Lcom/tv91/u/c/h/u;->q2(I)I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {v5, v6}, Lc/a/a/b/c0/k;->w(F)Lc/a/a/b/c0/k;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lc/a/a/b/c0/k;)V

    .line 5
    sget-object v5, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    const v5, 0x7f08011a

    .line 6
    invoke-virtual {p0, v5}, Lcom/tv91/features/shared/f;->n2(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroidx/appcompat/widget/o;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 7
    new-instance v5, Landroid/widget/TextView;

    iget-object v6, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v5, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const v6, 0x7f0600f0

    .line 8
    invoke-virtual {p0, v6}, Lcom/tv91/features/shared/f;->l2(I)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v6, 0x2

    const/high16 v7, 0x41800000    # 16.0f

    .line 9
    invoke-virtual {v5, v6, v7}, Landroid/widget/TextView;->setTextSize(IF)V

    const/16 v6, 0x11

    .line 10
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 11
    new-instance v6, Landroid/widget/FrameLayout;

    iget-object v7, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v6, v7}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 12
    invoke-virtual {v6, v4, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 13
    invoke-virtual {v6, v5, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 14
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v8, 0x50

    invoke-direct {p0, v8}, Lcom/tv91/u/c/h/u;->q2(I)I

    move-result v8

    invoke-direct {v7, v2, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v8, 0x3f800000    # 1.0f

    .line 15
    iput v8, v7, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    add-int/lit8 v8, v1, -0x1

    if-ne v3, v8, :cond_0

    const/4 v8, 0x0

    goto :goto_1

    :cond_0
    const v8, 0x7f0701b8

    .line 16
    invoke-virtual {p0, v8}, Lcom/tv91/features/shared/f;->m2(I)I

    move-result v8

    :goto_1
    invoke-virtual {v7, v8}, Landroid/widget/LinearLayout$LayoutParams;->setMarginEnd(I)V

    .line 17
    iget-object v8, p0, Lcom/tv91/u/c/h/u;->e:Lcom/tv91/r/t;

    iget-object v8, v8, Lcom/tv91/r/t;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v8, v6, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 18
    iget-object v7, p1, Lcom/tv91/model/Highlight$Web;->sources:Ljava/util/List;

    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/tv91/model/ExternalSource;

    .line 19
    new-instance v8, Lcom/tv91/u/c/h/l;

    invoke-direct {v8, p0, v7}, Lcom/tv91/u/c/h/l;-><init>(Lcom/tv91/u/c/h/u;Lcom/tv91/model/ExternalSource;)V

    invoke-static {v8}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object v8

    invoke-virtual {v6, v8}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    iget-object v6, p0, Lcom/tv91/features/shared/f;->c:Lcom/tv91/z/f;

    iget-object v8, v7, Lcom/tv91/model/ExternalSource;->image:Ljava/lang/String;

    invoke-interface {v6, v8}, Lcom/tv91/z/f;->b(Ljava/lang/String;)Lcom/tv91/z/f;

    move-result-object v6

    invoke-interface {v6, v2, v2}, Lcom/tv91/z/f;->d(II)Lcom/tv91/z/f;

    move-result-object v6

    invoke-interface {v6, v4}, Lcom/tv91/z/f;->g(Landroid/widget/ImageView;)V

    .line 21
    iget-object v4, v7, Lcom/tv91/model/ExternalSource;->title:Ljava/lang/String;

    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_1
    return-void
.end method

.method public synthetic s2(I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/h/u;->r2(I)V

    return-void
.end method

.method public synthetic x2(Lcom/tv91/model/ExternalSource;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/c/h/u;->w2(Lcom/tv91/model/ExternalSource;Landroid/view/View;)V

    return-void
.end method

.method public y(Lcom/tv91/model/Highlight$Recommend;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/h/u;->e:Lcom/tv91/r/t;

    iget-object v0, v0, Lcom/tv91/r/t;->m:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/tv91/model/Highlight$Recommend;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/tv91/utils/h;->f(Landroid/content/Context;)I

    move-result v0

    const v1, 0x7f0701b8

    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/f;->m2(I)I

    move-result v2

    mul-int/lit8 v2, v2, 0x3

    sub-int/2addr v0, v2

    const/4 v2, 0x2

    div-int/2addr v0, v2

    int-to-double v3, v0

    const-wide/high16 v5, 0x4022000000000000L    # 9.0

    .line 3
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v3, v3, v5

    const-wide/high16 v5, 0x4030000000000000L    # 16.0

    div-double/2addr v3, v5

    double-to-int v3, v3

    .line 4
    iget-object v4, p1, Lcom/tv91/model/Highlight$Recommend;->movies:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_2

    .line 5
    new-instance v7, Lcom/google/android/material/imageview/ShapeableImageView;

    iget-object v8, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v7, v8}, Lcom/google/android/material/imageview/ShapeableImageView;-><init>(Landroid/content/Context;)V

    .line 6
    new-instance v8, Lc/a/a/b/c0/k;

    invoke-direct {v8}, Lc/a/a/b/c0/k;-><init>()V

    const/4 v9, 0x5

    invoke-direct {p0, v9}, Lcom/tv91/u/c/h/u;->q2(I)I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v8, v9}, Lc/a/a/b/c0/k;->w(F)Lc/a/a/b/c0/k;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lc/a/a/b/c0/k;)V

    .line 7
    sget-object v8, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    const v8, 0x7f08011a

    .line 8
    invoke-virtual {p0, v8}, Lcom/tv91/features/shared/f;->n2(I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroidx/appcompat/widget/o;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 9
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v8, v0, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    new-instance v8, Landroid/widget/TextView;

    iget-object v9, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v8, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const v9, 0x7f0600f0

    .line 11
    invoke-virtual {p0, v9}, Lcom/tv91/features/shared/f;->l2(I)I

    move-result v9

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v9, 0x41600000    # 14.0f

    .line 12
    invoke-virtual {v8, v2, v9}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 13
    sget-object v9, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 14
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 15
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v10, -0x2

    invoke-direct {v9, v0, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 16
    new-instance v9, Landroid/widget/LinearLayout;

    iget-object v11, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v9, v11}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v11, 0x1

    .line 17
    invoke-virtual {v9, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 18
    invoke-virtual {v9, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 19
    invoke-virtual {v9, v8}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 20
    iget-object v11, p0, Lcom/tv91/u/c/h/u;->e:Lcom/tv91/r/t;

    iget-object v11, v11, Lcom/tv91/r/t;->c:Landroid/widget/GridLayout;

    invoke-virtual {v11}, Landroid/widget/GridLayout;->getColumnCount()I

    move-result v11

    .line 21
    new-instance v12, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v12, v10, v10}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 22
    div-int v10, v6, v11

    if-nez v10, :cond_0

    const/4 v10, 0x0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/f;->m2(I)I

    move-result v10

    :goto_1
    iput v10, v12, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 23
    rem-int v10, v6, v4

    if-nez v10, :cond_1

    const/4 v10, 0x0

    goto :goto_2

    :cond_1
    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/f;->m2(I)I

    move-result v10

    :goto_2
    invoke-virtual {v12, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 24
    iget-object v10, p0, Lcom/tv91/u/c/h/u;->e:Lcom/tv91/r/t;

    iget-object v10, v10, Lcom/tv91/r/t;->c:Landroid/widget/GridLayout;

    new-instance v11, Landroid/widget/GridLayout$LayoutParams;

    invoke-direct {v11, v12}, Landroid/widget/GridLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    invoke-virtual {v10, v9, v11}, Landroid/widget/GridLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    iget-object v10, p1, Lcom/tv91/model/Highlight$Recommend;->movies:Ljava/util/List;

    invoke-interface {v10, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/tv91/model/Movie;

    .line 26
    new-instance v11, Lcom/tv91/u/c/h/n;

    invoke-direct {v11, p0, v10}, Lcom/tv91/u/c/h/n;-><init>(Lcom/tv91/u/c/h/u;Lcom/tv91/model/Movie;)V

    invoke-static {v11}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object v11

    invoke-virtual {v9, v11}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 27
    iget-object v9, p0, Lcom/tv91/features/shared/f;->c:Lcom/tv91/z/f;

    iget-object v11, v10, Lcom/tv91/model/Movie;->image:Ljava/lang/String;

    invoke-interface {v9, v11}, Lcom/tv91/z/f;->b(Ljava/lang/String;)Lcom/tv91/z/f;

    move-result-object v9

    invoke-interface {v9, v7}, Lcom/tv91/z/f;->g(Landroid/widget/ImageView;)V

    .line 28
    iget-object v7, v10, Lcom/tv91/model/Movie;->name:Ljava/lang/String;

    invoke-virtual {v8, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_2
    return-void
.end method

.method public synthetic z2(Lcom/tv91/model/Highlight$MovieGroup;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/c/h/u;->y2(Lcom/tv91/model/Highlight$MovieGroup;Landroid/view/View;)V

    return-void
.end method
