.class Lcom/tv91/u/c/f/b2$c;
.super Lcom/tv91/features/shared/h/d;
.source "MovieView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/c/f/b2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/d<",
        "Lcom/tv91/model/Actor;",
        ">;"
    }
.end annotation


# instance fields
.field private final w:Lcom/tv91/r/a;


# direct methods
.method private constructor <init>(Lcom/tv91/r/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/h/d;-><init>(Lb/r/a;)V

    .line 3
    iput-object p1, p0, Lcom/tv91/u/c/f/b2$c;->w:Lcom/tv91/r/a;

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/r/a;Lcom/tv91/u/c/f/b2$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/c/f/b2$c;-><init>(Lcom/tv91/r/a;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic M(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/tv91/model/Actor;

    invoke-virtual {p0, p1}, Lcom/tv91/u/c/f/b2$c;->T(Lcom/tv91/model/Actor;)V

    return-void
.end method

.method protected T(Lcom/tv91/model/Actor;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/h/d;->v:Lcom/tv91/z/f;

    iget-object v1, p1, Lcom/tv91/model/Actor;->avatar:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/tv91/z/f;->b(Ljava/lang/String;)Lcom/tv91/z/f;

    move-result-object v0

    const v1, 0x7f08011c

    .line 2
    invoke-interface {v0, v1}, Lcom/tv91/z/f;->e(I)Lcom/tv91/z/f;

    move-result-object v0

    .line 3
    invoke-interface {v0, v1}, Lcom/tv91/z/f;->c(I)Lcom/tv91/z/f;

    move-result-object v0

    iget-object v1, p0, Lcom/tv91/u/c/f/b2$c;->w:Lcom/tv91/r/a;

    iget-object v1, v1, Lcom/tv91/r/a;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 4
    invoke-interface {v0, v1}, Lcom/tv91/z/f;->g(Landroid/widget/ImageView;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/c/f/b2$c;->w:Lcom/tv91/r/a;

    iget-object v0, v0, Lcom/tv91/r/a;->d:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/tv91/u/c/f/b2$c;->w:Lcom/tv91/r/a;

    iget-object v1, v1, Lcom/tv91/r/a;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 7
    iget-object v1, p0, Lcom/tv91/u/c/f/b2$c;->w:Lcom/tv91/r/a;

    iget-object v1, v1, Lcom/tv91/r/a;->d:Landroid/widget/TextView;

    iget-object p1, p1, Lcom/tv91/model/Actor;->name:Ljava/lang/String;

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object p1, p0, Lcom/tv91/u/c/f/b2$c;->w:Lcom/tv91/r/a;

    iget-object p1, p1, Lcom/tv91/r/a;->d:Landroid/widget/TextView;

    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 9
    iget-object p1, p0, Lcom/tv91/u/c/f/b2$c;->w:Lcom/tv91/r/a;

    iget-object p1, p1, Lcom/tv91/r/a;->d:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 10
    iget-object p1, p0, Lcom/tv91/u/c/f/b2$c;->w:Lcom/tv91/r/a;

    iget-object p1, p1, Lcom/tv91/r/a;->d:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 11
    iget-object p1, p0, Lcom/tv91/u/c/f/b2$c;->w:Lcom/tv91/r/a;

    iget-object p1, p1, Lcom/tv91/r/a;->d:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 12
    iget-object p1, p0, Lcom/tv91/u/c/f/b2$c;->w:Lcom/tv91/r/a;

    iget-object p1, p1, Lcom/tv91/r/a;->c:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method
