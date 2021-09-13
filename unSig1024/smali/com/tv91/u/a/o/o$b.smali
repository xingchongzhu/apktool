.class Lcom/tv91/u/a/o/o$b;
.super Ljava/lang/Object;
.source "ChannelView.java"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/a/o/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field final synthetic c:Lcom/tv91/u/a/o/o;


# direct methods
.method private constructor <init>(Lcom/tv91/u/a/o/o;)V
    .locals 1

    .line 2
    iput-object p1, p0, Lcom/tv91/u/a/o/o$b;->c:Lcom/tv91/u/a/o/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7f06007a

    .line 3
    invoke-static {p1, v0}, Lcom/tv91/u/a/o/o;->t2(Lcom/tv91/u/a/o/o;I)I

    move-result v0

    iput v0, p0, Lcom/tv91/u/a/o/o$b;->a:I

    const v0, 0x7f06007c

    .line 4
    invoke-static {p1, v0}, Lcom/tv91/u/a/o/o;->u2(Lcom/tv91/u/a/o/o;I)I

    move-result p1

    iput p1, p0, Lcom/tv91/u/a/o/o$b;->b:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/u/a/o/o;Lcom/tv91/u/a/o/o$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/a/o/o$b;-><init>(Lcom/tv91/u/a/o/o;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/material/tabs/TabLayout$g;)V
    .locals 0

    return-void
.end method

.method public b(Lcom/google/android/material/tabs/TabLayout$g;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$g;->e()Landroid/view/View;

    move-result-object p1

    .line 2
    instance-of v0, p1, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Landroid/widget/TextView;

    iget v0, p0, Lcom/tv91/u/a/o/o$b;->b:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-void
.end method

.method public c(Lcom/google/android/material/tabs/TabLayout$g;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/o/o$b;->c:Lcom/tv91/u/a/o/o;

    invoke-static {v0}, Lcom/tv91/u/a/o/o;->v2(Lcom/tv91/u/a/o/o;)Lcom/tv91/r/c0;

    move-result-object v0

    iget-object v0, v0, Lcom/tv91/r/c0;->e:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$g;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 2
    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$g;->e()Landroid/view/View;

    move-result-object p1

    .line 3
    instance-of v0, p1, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 4
    check-cast p1, Landroid/widget/TextView;

    iget v0, p0, Lcom/tv91/u/a/o/o$b;->a:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-void
.end method
