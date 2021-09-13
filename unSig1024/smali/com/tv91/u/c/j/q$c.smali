.class Lcom/tv91/u/c/j/q$c;
.super Lcom/tv91/features/shared/h/d;
.source "SearchView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/c/j/q;
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
.field private final w:Lcom/tv91/r/g;


# direct methods
.method private constructor <init>(Lcom/tv91/r/g;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/h/d;-><init>(Lb/r/a;)V

    .line 3
    iput-object p1, p0, Lcom/tv91/u/c/j/q$c;->w:Lcom/tv91/r/g;

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/r/g;Lcom/tv91/u/c/j/q$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/c/j/q$c;-><init>(Lcom/tv91/r/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic M(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/tv91/model/Movie;

    invoke-virtual {p0, p1}, Lcom/tv91/u/c/j/q$c;->T(Lcom/tv91/model/Movie;)V

    return-void
.end method

.method protected T(Lcom/tv91/model/Movie;)V
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

    iget-object v1, p0, Lcom/tv91/u/c/j/q$c;->w:Lcom/tv91/r/g;

    iget-object v1, v1, Lcom/tv91/r/g;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 4
    invoke-interface {v0, v1}, Lcom/tv91/z/f;->g(Landroid/widget/ImageView;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/c/j/q$c;->w:Lcom/tv91/r/g;

    iget-object v0, v0, Lcom/tv91/r/g;->d:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/tv91/model/Movie;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v0, p0, Lcom/tv91/u/c/j/q$c;->w:Lcom/tv91/r/g;

    iget-object v0, v0, Lcom/tv91/r/g;->c:Landroid/widget/TextView;

    const v1, 0x7f12010d

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object p1, p1, Lcom/tv91/model/Movie;->createTime:Ljava/lang/String;

    aput-object p1, v2, v3

    invoke-virtual {p0, v1, v2}, Lcom/tv91/features/shared/h/d;->R(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
