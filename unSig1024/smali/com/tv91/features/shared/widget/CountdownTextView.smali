.class public final Lcom/tv91/features/shared/widget/CountdownTextView;
.super Landroidx/appcompat/widget/a0;
.source "CountdownTextView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/features/shared/widget/CountdownTextView$b;
    }
.end annotation


# instance fields
.field private f:Landroid/os/CountDownTimer;

.field private g:Z

.field private h:I

.field private i:I

.field private j:I

.field private k:J

.field private l:I

.field private m:I

.field private n:I

.field private o:Lcom/tv91/features/shared/widget/CountdownTextView$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x1010084

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/tv91/features/shared/widget/CountdownTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/a0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-wide/16 v0, -0x1

    .line 3
    iput-wide v0, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->k:J

    const/4 p3, -0x1

    .line 4
    iput p3, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->l:I

    .line 5
    iput p3, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->m:I

    .line 6
    iput p3, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->n:I

    if-nez p2, :cond_0

    return-void

    .line 7
    :cond_0
    sget-object v0, Lcom/tv91/p;->P:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x2

    const/16 v0, 0x3c

    .line 8
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->h:I

    const/4 p2, 0x0

    const/16 v0, 0x3e8

    .line 9
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->j:I

    const/4 p2, 0x4

    .line 10
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->l:I

    const/4 p2, 0x1

    .line 11
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->m:I

    const/4 p2, 0x3

    .line 12
    iget p3, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->l:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->n:I

    .line 13
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method static synthetic f(Lcom/tv91/features/shared/widget/CountdownTextView;)Lcom/tv91/features/shared/widget/CountdownTextView$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->o:Lcom/tv91/features/shared/widget/CountdownTextView$b;

    return-object p0
.end method

.method static synthetic g(Lcom/tv91/features/shared/widget/CountdownTextView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->m:I

    return p0
.end method

.method static synthetic h(Lcom/tv91/features/shared/widget/CountdownTextView;J)I
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tv91/features/shared/widget/CountdownTextView;->k(J)I

    move-result p0

    return p0
.end method

.method static synthetic i(Lcom/tv91/features/shared/widget/CountdownTextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/features/shared/widget/CountdownTextView;->o()V

    return-void
.end method

.method private j()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->m:I

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    iget v2, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->m:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->h:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    :cond_0
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    return-void
.end method

.method private k(J)I
    .locals 1

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide p1

    long-to-int p2, p1

    return p2
.end method

.method private o()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->n:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setClickable(Z)V

    return-void
.end method


# virtual methods
.method public l()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->h:I

    iget v1, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->j:I

    invoke-virtual {p0, v0, v1}, Lcom/tv91/features/shared/widget/CountdownTextView;->m(II)V

    return-void
.end method

.method public m(II)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->g:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/tv91/features/shared/widget/CountdownTextView;->j()V

    .line 3
    new-instance v0, Lcom/tv91/features/shared/widget/CountdownTextView$a;

    int-to-long v1, p1

    const-wide/16 v3, 0x3e8

    mul-long v3, v3, v1

    int-to-long v5, p2

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/tv91/features/shared/widget/CountdownTextView$a;-><init>(Lcom/tv91/features/shared/widget/CountdownTextView;JJ)V

    iput-object v0, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->f:Landroid/os/CountDownTimer;

    .line 4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->k:J

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->g:Z

    .line 6
    iget-object p1, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->f:Landroid/os/CountDownTimer;

    invoke-virtual {p1}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    return-void
.end method

.method public n()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->f:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->g:Z

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->f:Landroid/os/CountDownTimer;

    :cond_0
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/TextView;->onAttachedToWindow()V

    .line 2
    iget v0, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->l:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(I)V

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->g:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->i:I

    if-lez v0, :cond_1

    .line 5
    iget v1, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->j:I

    invoke-virtual {p0, v0, v1}, Lcom/tv91/features/shared/widget/CountdownTextView;->m(II)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->g:Z

    .line 7
    invoke-direct {p0}, Lcom/tv91/features/shared/widget/CountdownTextView;->o()V

    :goto_0
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/TextView;->onDetachedFromWindow()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->o:Lcom/tv91/features/shared/widget/CountdownTextView$b;

    .line 3
    invoke-virtual {p0}, Lcom/tv91/features/shared/widget/CountdownTextView;->n()V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    check-cast p1, Landroid/os/Bundle;

    const-string v0, "CountdownTextView_countDownStarted"

    .line 2
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->g:Z

    const-string v0, "CountdownTextView_countDownTime"

    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->i:I

    const-string v0, "CountdownTextView_superState"

    .line 4
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 6

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 2
    invoke-super {p0}, Landroid/widget/TextView;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    const-string v2, "CountdownTextView_superState"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 3
    iget-boolean v1, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->g:Z

    const-string v2, "CountdownTextView_countDownStarted"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 4
    iget v1, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->h:I

    .line 5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->k:J

    sub-long/2addr v2, v4

    invoke-direct {p0, v2, v3}, Lcom/tv91/features/shared/widget/CountdownTextView;->k(J)I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->i:I

    const-string v2, "CountdownTextView_countDownTime"

    .line 6
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method

.method public setCountDownListener(Lcom/tv91/features/shared/widget/CountdownTextView$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->o:Lcom/tv91/features/shared/widget/CountdownTextView$b;

    return-void
.end method

.method public setCountDownTime(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->h:I

    .line 2
    iget-boolean p1, p0, Lcom/tv91/features/shared/widget/CountdownTextView;->g:Z

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/tv91/features/shared/widget/CountdownTextView;->n()V

    .line 4
    invoke-virtual {p0}, Lcom/tv91/features/shared/widget/CountdownTextView;->l()V

    :cond_0
    return-void
.end method
