.class Lcom/tv91/u/a/m/l$c;
.super Lcom/tv91/features/shared/h/d;
.source "ActorView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/a/m/l;
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
    iput-object p1, p0, Lcom/tv91/u/a/m/l$c;->w:Lcom/tv91/r/a;

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/r/a;Lcom/tv91/u/a/m/l$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/a/m/l$c;-><init>(Lcom/tv91/r/a;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic M(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/tv91/model/Actor;

    invoke-virtual {p0, p1}, Lcom/tv91/u/a/m/l$c;->T(Lcom/tv91/model/Actor;)V

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

    iget-object v1, p0, Lcom/tv91/u/a/m/l$c;->w:Lcom/tv91/r/a;

    iget-object v1, v1, Lcom/tv91/r/a;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 4
    invoke-interface {v0, v1}, Lcom/tv91/z/f;->g(Landroid/widget/ImageView;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/a/m/l$c;->w:Lcom/tv91/r/a;

    iget-object v0, v0, Lcom/tv91/r/a;->d:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/tv91/model/Actor;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v0, p0, Lcom/tv91/u/a/m/l$c;->w:Lcom/tv91/r/a;

    iget-object v0, v0, Lcom/tv91/r/a;->c:Landroid/widget/TextView;

    iget p1, p1, Lcom/tv91/model/Actor;->count:I

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
