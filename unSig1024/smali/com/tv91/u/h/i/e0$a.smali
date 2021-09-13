.class Lcom/tv91/u/h/i/e0$a;
.super Ljava/lang/Object;
.source "PaymentView.java"

# interfaces
.implements Lcom/tv91/features/shared/widget/CountdownTextView$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tv91/u/h/i/e0;-><init>(Lcom/tv91/r/m0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tv91/r/m0;

.field final synthetic b:Lcom/tv91/u/h/i/e0;


# direct methods
.method constructor <init>(Lcom/tv91/u/h/i/e0;Lcom/tv91/r/m0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/h/i/e0$a;->b:Lcom/tv91/u/h/i/e0;

    iput-object p2, p0, Lcom/tv91/u/h/i/e0$a;->a:Lcom/tv91/r/m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/i/e0$a;->a:Lcom/tv91/r/m0;

    iget-object v0, v0, Lcom/tv91/r/m0;->i:Lcom/tv91/features/shared/widget/CountdownTextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public b(I)V
    .locals 6

    .line 1
    rem-int/lit16 v0, p1, 0x3e8

    .line 2
    div-int/lit16 p1, p1, 0x3e8

    rem-int/lit8 v1, p1, 0x3c

    .line 3
    div-int/lit8 p1, p1, 0x3c

    .line 4
    iget-object v2, p0, Lcom/tv91/u/h/i/e0$a;->a:Lcom/tv91/r/m0;

    iget-object v2, v2, Lcom/tv91/r/m0;->i:Lcom/tv91/features/shared/widget/CountdownTextView;

    iget-object v3, p0, Lcom/tv91/u/h/i/e0$a;->b:Lcom/tv91/u/h/i/e0;

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v5, 0x0

    aput-object p1, v4, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    aput-object p1, v4, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x2

    aput-object p1, v4, v0

    const p1, 0x7f12014b

    invoke-static {v3, p1, v4}, Lcom/tv91/u/h/i/e0;->q2(Lcom/tv91/u/h/i/e0;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
