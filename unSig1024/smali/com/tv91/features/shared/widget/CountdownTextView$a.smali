.class Lcom/tv91/features/shared/widget/CountdownTextView$a;
.super Landroid/os/CountDownTimer;
.source "CountdownTextView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tv91/features/shared/widget/CountdownTextView;->m(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tv91/features/shared/widget/CountdownTextView;


# direct methods
.method constructor <init>(Lcom/tv91/features/shared/widget/CountdownTextView;JJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/features/shared/widget/CountdownTextView$a;->a:Lcom/tv91/features/shared/widget/CountdownTextView;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/widget/CountdownTextView$a;->a:Lcom/tv91/features/shared/widget/CountdownTextView;

    invoke-static {v0}, Lcom/tv91/features/shared/widget/CountdownTextView;->f(Lcom/tv91/features/shared/widget/CountdownTextView;)Lcom/tv91/features/shared/widget/CountdownTextView$b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tv91/features/shared/widget/CountdownTextView$a;->a:Lcom/tv91/features/shared/widget/CountdownTextView;

    invoke-static {v0}, Lcom/tv91/features/shared/widget/CountdownTextView;->f(Lcom/tv91/features/shared/widget/CountdownTextView;)Lcom/tv91/features/shared/widget/CountdownTextView$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/tv91/features/shared/widget/CountdownTextView$b;->a()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tv91/features/shared/widget/CountdownTextView$a;->a:Lcom/tv91/features/shared/widget/CountdownTextView;

    invoke-static {v0}, Lcom/tv91/features/shared/widget/CountdownTextView;->i(Lcom/tv91/features/shared/widget/CountdownTextView;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/features/shared/widget/CountdownTextView$a;->a:Lcom/tv91/features/shared/widget/CountdownTextView;

    invoke-virtual {v0}, Lcom/tv91/features/shared/widget/CountdownTextView;->n()V

    return-void
.end method

.method public onTick(J)V
    .locals 7

    long-to-int p2, p1

    if-lez p2, :cond_1

    .line 1
    iget-object p1, p0, Lcom/tv91/features/shared/widget/CountdownTextView$a;->a:Lcom/tv91/features/shared/widget/CountdownTextView;

    invoke-static {p1}, Lcom/tv91/features/shared/widget/CountdownTextView;->f(Lcom/tv91/features/shared/widget/CountdownTextView;)Lcom/tv91/features/shared/widget/CountdownTextView$b;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/tv91/features/shared/widget/CountdownTextView$a;->a:Lcom/tv91/features/shared/widget/CountdownTextView;

    invoke-static {p1}, Lcom/tv91/features/shared/widget/CountdownTextView;->f(Lcom/tv91/features/shared/widget/CountdownTextView;)Lcom/tv91/features/shared/widget/CountdownTextView$b;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/tv91/features/shared/widget/CountdownTextView$b;->b(I)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/tv91/features/shared/widget/CountdownTextView$a;->a:Lcom/tv91/features/shared/widget/CountdownTextView;

    invoke-static {p1}, Lcom/tv91/features/shared/widget/CountdownTextView;->g(Lcom/tv91/features/shared/widget/CountdownTextView;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    .line 4
    iget-object p1, p0, Lcom/tv91/features/shared/widget/CountdownTextView$a;->a:Lcom/tv91/features/shared/widget/CountdownTextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/tv91/features/shared/widget/CountdownTextView$a;->a:Lcom/tv91/features/shared/widget/CountdownTextView;

    invoke-static {v1}, Lcom/tv91/features/shared/widget/CountdownTextView;->g(Lcom/tv91/features/shared/widget/CountdownTextView;)I

    move-result v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/tv91/features/shared/widget/CountdownTextView$a;->a:Lcom/tv91/features/shared/widget/CountdownTextView;

    int-to-long v5, p2

    invoke-static {v4, v5, v6}, Lcom/tv91/features/shared/widget/CountdownTextView;->h(Lcom/tv91/features/shared/widget/CountdownTextView;J)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method
