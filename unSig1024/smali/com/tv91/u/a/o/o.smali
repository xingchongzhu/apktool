.class final Lcom/tv91/u/a/o/o;
.super Lcom/tv91/u/a/e;
.source "ChannelView.java"

# interfaces
.implements Lcom/tv91/u/a/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/a/o/o$b;
    }
.end annotation


# instance fields
.field private final g:Lcom/tv91/r/c0;

.field private final h:Lcom/tv91/features/shared/g;

.field private i:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Lcom/tv91/model/ExternalSource;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/tv91/r/c0;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/tv91/u/a/h;->a:Lcom/tv91/u/a/h;

    iget-object v1, p1, Lcom/tv91/r/c0;->c:Landroid/widget/LinearLayout;

    invoke-static {v1}, Lcom/tv91/r/w;->b(Landroid/view/View;)Lcom/tv91/r/w;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/tv91/u/a/e;-><init>(Lcom/tv91/u/a/h;Lcom/tv91/r/w;)V

    .line 2
    sget-object v0, Lcom/tv91/u/a/o/j;->a:Lcom/tv91/u/a/o/j;

    iput-object v0, p0, Lcom/tv91/u/a/o/o;->i:Lb/g/j/a;

    .line 3
    iput-object p1, p0, Lcom/tv91/u/a/o/o;->g:Lcom/tv91/r/c0;

    .line 4
    new-instance v0, Lcom/tv91/features/shared/g;

    iget-object v1, p1, Lcom/tv91/r/c0;->g:Lcom/tv91/r/x;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/g;-><init>(Lcom/tv91/r/x;)V

    iput-object v0, p0, Lcom/tv91/u/a/o/o;->h:Lcom/tv91/features/shared/g;

    const v1, 0x7f0800dc

    .line 5
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/g;->o(I)V

    const v1, 0x7f0e0004

    .line 6
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/g;->c(I)V

    .line 7
    iget-object v0, p1, Lcom/tv91/r/c0;->f:Lcom/google/android/material/tabs/TabLayout;

    iget-object v1, p1, Lcom/tv91/r/c0;->e:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 8
    iget-object v0, p1, Lcom/tv91/r/c0;->f:Lcom/google/android/material/tabs/TabLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->setTabMode(I)V

    .line 9
    iget-object p1, p1, Lcom/tv91/r/c0;->e:Landroidx/viewpager/widget/ViewPager;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    return-void
.end method

.method private synthetic A2(Lcom/tv91/model/ExternalSource;Landroid/widget/ImageView;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->c:Lcom/tv91/z/f;

    iget-object p1, p1, Lcom/tv91/model/ExternalSource;->image:Ljava/lang/String;

    invoke-interface {v0, p1}, Lcom/tv91/z/f;->b(Ljava/lang/String;)Lcom/tv91/z/f;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/tv91/z/f;->g(Landroid/widget/ImageView;)V

    return-void
.end method

.method static synthetic t2(Lcom/tv91/u/a/o/o;I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tv91/features/shared/f;->l2(I)I

    move-result p0

    return p0
.end method

.method static synthetic u2(Lcom/tv91/u/a/o/o;I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tv91/features/shared/f;->l2(I)I

    move-result p0

    return p0
.end method

.method static synthetic v2(Lcom/tv91/u/a/o/o;)Lcom/tv91/r/c0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/u/a/o/o;->g:Lcom/tv91/r/c0;

    return-object p0
.end method

.method private w2(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/model/Channel;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/o/o;->g:Lcom/tv91/r/c0;

    iget-object v0, v0, Lcom/tv91/r/c0;->f:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 2
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tv91/model/Channel;

    .line 3
    iget v3, v2, Lcom/tv91/model/b;->key:I

    if-nez v3, :cond_0

    .line 4
    iget-object p1, p0, Lcom/tv91/u/a/o/o;->g:Lcom/tv91/r/c0;

    iget-object p1, p1, Lcom/tv91/r/c0;->f:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {p1, v1}, Lcom/google/android/material/tabs/TabLayout;->y(I)Lcom/google/android/material/tabs/TabLayout$g;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 5
    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const v1, 0x7f06007c

    .line 6
    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/f;->l2(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 7
    iget-object v1, v2, Lcom/tv91/model/b;->value:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 v1, 0x11

    .line 8
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 9
    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout$g;->o(Landroid/view/View;)Lcom/google/android/material/tabs/TabLayout$g;

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method static synthetic x2(Lcom/tv91/model/ExternalSource;)V
    .locals 0

    return-void
.end method

.method private synthetic y2(Lcom/tv91/model/ExternalSource;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/tv91/u/a/o/o;->i:Lb/g/j/a;

    invoke-interface {p2, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public synthetic B2(Lcom/tv91/model/ExternalSource;Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/a/o/o;->A2(Lcom/tv91/model/ExternalSource;Landroid/widget/ImageView;)V

    return-void
.end method

.method public J(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "key-selected-page"

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    if-lez p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/o/o;->g:Lcom/tv91/r/c0;

    iget-object v0, v0, Lcom/tv91/r/c0;->e:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/tv91/u/a/o/o;->h:Lcom/tv91/features/shared/g;

    invoke-virtual {p1}, Lcom/tv91/features/shared/g;->a()V

    .line 4
    iget-object p1, p0, Lcom/tv91/u/a/o/o;->g:Lcom/tv91/r/c0;

    iget-object p1, p1, Lcom/tv91/r/c0;->f:Lcom/google/android/material/tabs/TabLayout;

    new-instance v0, Lcom/tv91/u/a/o/o$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/tv91/u/a/o/o$b;-><init>(Lcom/tv91/u/a/o/o;Lcom/tv91/u/a/o/o$a;)V

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->d(Lcom/google/android/material/tabs/TabLayout$d;)V

    return-void
.end method

.method public K0(Landroidx/viewpager/widget/a;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/viewpager/widget/a;",
            "Ljava/util/List<",
            "Lcom/tv91/model/Channel;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/o/o;->g:Lcom/tv91/r/c0;

    iget-object v0, v0, Lcom/tv91/r/c0;->e:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/a;)V

    .line 2
    invoke-direct {p0, p2}, Lcom/tv91/u/a/o/o;->w2(Ljava/util/List;)V

    return-void
.end method

.method public P(Lb/g/j/a;)V
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
    iput-object p1, p0, Lcom/tv91/u/a/o/o;->i:Lb/g/j/a;

    return-void
.end method

.method public W0(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/model/ExternalSource;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/model/ExternalSource;

    .line 3
    new-instance v0, Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 4
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 5
    new-instance v1, Lcom/tv91/u/a/o/h;

    invoke-direct {v1, p0, p1}, Lcom/tv91/u/a/o/h;-><init>(Lcom/tv91/u/a/o/o;Lcom/tv91/model/ExternalSource;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    new-instance v1, Lcom/tv91/features/shared/widget/e$a;

    iget-object v2, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    .line 7
    invoke-virtual {v1, v0}, Lcom/tv91/features/shared/widget/e$a;->l(Landroid/view/View;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v1

    const v2, 0x7f12004e

    .line 8
    invoke-virtual {v1, v2}, Lcom/tv91/features/shared/widget/e$a;->v(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v1

    new-instance v2, Lcom/tv91/u/a/o/i;

    invoke-direct {v2, p0, p1, v0}, Lcom/tv91/u/a/o/i;-><init>(Lcom/tv91/u/a/o/o;Lcom/tv91/model/ExternalSource;Landroid/widget/ImageView;)V

    .line 9
    invoke-virtual {v1, v2}, Lcom/tv91/features/shared/widget/e$a;->u(Ljava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public g0(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/widget/e;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public h(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/o/o;->h:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->n(Ljava/lang/Runnable;)V

    return-void
.end method

.method public h2(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/tv91/u/a/e;->h2(Landroid/os/Bundle;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/o/o;->g:Lcom/tv91/r/c0;

    iget-object v0, v0, Lcom/tv91/r/c0;->e:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    const-string v1, "key-selected-page"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 3
    iget-object p1, p0, Lcom/tv91/u/a/o/o;->h:Lcom/tv91/features/shared/g;

    invoke-virtual {p1}, Lcom/tv91/features/shared/g;->b()V

    .line 4
    iget-object p1, p0, Lcom/tv91/u/a/o/o;->g:Lcom/tv91/r/c0;

    iget-object p1, p1, Lcom/tv91/r/c0;->f:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout;->o()V

    return-void
.end method

.method public i(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/o/o;->h:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->k(Ljava/lang/Runnable;)V

    return-void
.end method

.method public synthetic z2(Lcom/tv91/model/ExternalSource;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/a/o/o;->y2(Lcom/tv91/model/ExternalSource;Landroid/view/View;)V

    return-void
.end method
