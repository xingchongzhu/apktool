.class Lcom/tv91/u/c/g/v$c;
.super Lcom/tv91/features/shared/h/d;
.source "FavoriteView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/c/g/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/d<",
        "Lcom/tv91/model/Movie;",
        ">;"
    }
.end annotation


# instance fields
.field private final w:Lcom/tv91/r/h;


# direct methods
.method private constructor <init>(Lcom/tv91/r/h;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/h/d;-><init>(Lb/r/a;)V

    .line 3
    iput-object p1, p0, Lcom/tv91/u/c/g/v$c;->w:Lcom/tv91/r/h;

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/r/h;Lcom/tv91/u/c/g/v$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/c/g/v$c;-><init>(Lcom/tv91/r/h;)V

    return-void
.end method

.method static synthetic T(Lcom/tv91/u/c/g/v$c;)Lcom/tv91/r/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/u/c/g/v$c;->w:Lcom/tv91/r/h;

    return-object p0
.end method

.method static synthetic U(Lcom/tv91/u/c/g/v$c;Lcom/tv91/model/Movie;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tv91/u/c/g/v$c;->V(Lcom/tv91/model/Movie;Z)V

    return-void
.end method

.method private V(Lcom/tv91/model/Movie;Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/h/d;->v:Lcom/tv91/z/f;

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

    iget-object v1, p0, Lcom/tv91/u/c/g/v$c;->w:Lcom/tv91/r/h;

    iget-object v1, v1, Lcom/tv91/r/h;->c:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 4
    invoke-interface {v0, v1}, Lcom/tv91/z/f;->g(Landroid/widget/ImageView;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/c/g/v$c;->w:Lcom/tv91/r/h;

    iget-object v0, v0, Lcom/tv91/r/h;->f:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/tv91/model/Movie;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v0, p0, Lcom/tv91/u/c/g/v$c;->w:Lcom/tv91/r/h;

    iget-object v0, v0, Lcom/tv91/r/h;->e:Landroid/widget/TextView;

    const v1, 0x7f12010d

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object p1, p1, Lcom/tv91/model/Movie;->createTime:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {p0, v1, v2}, Lcom/tv91/features/shared/h/d;->R(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz p2, :cond_1

    .line 7
    iget-object p1, p0, Lcom/tv91/u/c/g/v$c;->w:Lcom/tv91/r/h;

    iget-object p1, p1, Lcom/tv91/r/h;->d:Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/tv91/features/shared/h/d;->u:Landroid/content/Context;

    invoke-static {v0}, Lcom/tv91/v/d;->a(Landroid/content/Context;)Lcom/tv91/v/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/tv91/v/e;->a()Landroid/view/animation/Animation;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_1

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/tv91/u/c/g/v$c;->w:Lcom/tv91/r/h;

    iget-object p1, p1, Lcom/tv91/r/h;->d:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->clearAnimation()V

    .line 9
    :goto_1
    iget-object p1, p0, Lcom/tv91/u/c/g/v$c;->w:Lcom/tv91/r/h;

    iget-object p1, p1, Lcom/tv91/r/h;->b:Landroid/widget/FrameLayout;

    if-eqz p2, :cond_2

    goto :goto_2

    :cond_2
    const/16 v3, 0x8

    :goto_2
    invoke-virtual {p1, v3}, Landroid/widget/FrameLayout;->setVisibility(I)V

    return-void
.end method
