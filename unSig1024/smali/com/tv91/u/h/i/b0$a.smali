.class Lcom/tv91/u/h/i/b0$a;
.super Lcom/tv91/features/shared/h/d;
.source "PaymentMethodAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/h/i/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/d<",
        "Lcom/tv91/model/PaymentMethod;",
        ">;"
    }
.end annotation


# instance fields
.field private final w:Lcom/tv91/r/l;


# direct methods
.method constructor <init>(Lcom/tv91/r/l;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/h/d;-><init>(Lb/r/a;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/u/h/i/b0$a;->w:Lcom/tv91/r/l;

    return-void
.end method


# virtual methods
.method protected bridge synthetic M(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/tv91/model/PaymentMethod;

    invoke-virtual {p0, p1}, Lcom/tv91/u/h/i/b0$a;->T(Lcom/tv91/model/PaymentMethod;)V

    return-void
.end method

.method protected T(Lcom/tv91/model/PaymentMethod;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/h/d;->v:Lcom/tv91/z/f;

    iget-object v1, p1, Lcom/tv91/model/PaymentMethod;->image:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/tv91/z/f;->b(Ljava/lang/String;)Lcom/tv91/z/f;

    move-result-object v0

    iget-object v1, p0, Lcom/tv91/u/h/i/b0$a;->w:Lcom/tv91/r/l;

    iget-object v1, v1, Lcom/tv91/r/l;->c:Landroid/widget/ImageView;

    invoke-interface {v0, v1}, Lcom/tv91/z/f;->g(Landroid/widget/ImageView;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/h/i/b0$a;->w:Lcom/tv91/r/l;

    iget-object v0, v0, Lcom/tv91/r/l;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/tv91/model/PaymentMethod;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
