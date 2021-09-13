.class public Lcom/tv91/features/shared/widget/e$a;
.super Ljava/lang/Object;
.source "CustomDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/features/shared/widget/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:I

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:I

.field private f:Landroid/view/View;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/Runnable;

.field private k:Ljava/lang/Runnable;

.field private l:Ljava/lang/Runnable;

.field private m:Ljava/lang/Runnable;

.field private n:Ljava/lang/Runnable;

.field private o:Ljava/lang/Runnable;

.field private p:Z

.field private q:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const v0, 0x7f13000d

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/tv91/features/shared/widget/e$a;->p:Z

    .line 4
    iput-boolean v0, p0, Lcom/tv91/features/shared/widget/e$a;->q:Z

    .line 5
    iput-object p1, p0, Lcom/tv91/features/shared/widget/e$a;->a:Landroid/content/Context;

    .line 6
    iput p2, p0, Lcom/tv91/features/shared/widget/e$a;->b:I

    return-void
.end method

.method private synthetic b(Lcom/tv91/features/shared/widget/e;Lcom/tv91/r/q;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 2
    iget-object p1, p2, Lcom/tv91/r/q;->f:Landroid/widget/Button;

    if-ne p3, p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/tv91/features/shared/widget/e$a;->j:Ljava/lang/Runnable;

    if-eqz p1, :cond_2

    .line 4
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p2, Lcom/tv91/r/q;->e:Landroid/widget/Button;

    if-ne p3, p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/tv91/features/shared/widget/e$a;->k:Ljava/lang/Runnable;

    if-eqz p1, :cond_2

    .line 7
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 8
    :cond_1
    iget-object p1, p2, Lcom/tv91/r/q;->d:Landroid/widget/Button;

    if-ne p3, p1, :cond_2

    .line 9
    iget-object p1, p0, Lcom/tv91/features/shared/widget/e$a;->l:Ljava/lang/Runnable;

    if-eqz p1, :cond_2

    .line 10
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_2
    :goto_0
    return-void
.end method

.method private synthetic d(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tv91/features/shared/widget/e$a;->m:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method private synthetic f(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tv91/features/shared/widget/e$a;->o:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method private synthetic h(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tv91/features/shared/widget/e$a;->n:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method


# virtual methods
.method public a()Lcom/tv91/features/shared/widget/e;
    .locals 7

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e;

    iget-object v1, p0, Lcom/tv91/features/shared/widget/e$a;->a:Landroid/content/Context;

    iget v2, p0, Lcom/tv91/features/shared/widget/e$a;->b:I

    invoke-direct {v0, v1, v2}, Lcom/tv91/features/shared/widget/e;-><init>(Landroid/content/Context;I)V

    .line 2
    iget-object v1, p0, Lcom/tv91/features/shared/widget/e$a;->a:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 3
    invoke-static {v1}, Lcom/tv91/r/q;->d(Landroid/view/LayoutInflater;)Lcom/tv91/r/q;

    move-result-object v2

    .line 4
    invoke-virtual {v2}, Lcom/tv91/r/q;->c()Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 5
    iget-object v3, p0, Lcom/tv91/features/shared/widget/e$a;->c:Ljava/lang/String;

    invoke-static {v3}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v3

    const/16 v4, 0x8

    if-nez v3, :cond_0

    .line 6
    iget-object v3, v2, Lcom/tv91/r/q;->g:Landroid/widget/TextView;

    iget-object v5, p0, Lcom/tv91/features/shared/widget/e$a;->c:Ljava/lang/String;

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v3, v2, Lcom/tv91/r/q;->g:Landroid/widget/TextView;

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 8
    :goto_0
    iget-object v3, p0, Lcom/tv91/features/shared/widget/e$a;->d:Ljava/lang/String;

    invoke-static {v3}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 9
    iget-object v3, v2, Lcom/tv91/r/q;->c:Landroid/widget/TextView;

    iget-object v5, p0, Lcom/tv91/features/shared/widget/e$a;->d:Ljava/lang/String;

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object v3, v2, Lcom/tv91/r/q;->c:Landroid/widget/TextView;

    new-instance v5, Landroid/text/method/ScrollingMovementMethod;

    invoke-direct {v5}, Landroid/text/method/ScrollingMovementMethod;-><init>()V

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    goto :goto_1

    .line 11
    :cond_1
    iget-object v3, v2, Lcom/tv91/r/q;->c:Landroid/widget/TextView;

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    :goto_1
    iget-object v3, v2, Lcom/tv91/r/q;->b:Landroid/widget/FrameLayout;

    .line 13
    iget-object v5, p0, Lcom/tv91/features/shared/widget/e$a;->f:Landroid/view/View;

    if-eqz v5, :cond_2

    .line 14
    invoke-virtual {v3, v5}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 15
    :cond_2
    iget v5, p0, Lcom/tv91/features/shared/widget/e$a;->e:I

    if-eqz v5, :cond_3

    const/4 v6, 0x0

    .line 16
    invoke-virtual {v1, v5, v3, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 17
    :cond_3
    new-instance v1, Lcom/tv91/features/shared/widget/a;

    invoke-direct {v1, p0, v0, v2}, Lcom/tv91/features/shared/widget/a;-><init>(Lcom/tv91/features/shared/widget/e$a;Lcom/tv91/features/shared/widget/e;Lcom/tv91/r/q;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object v1

    .line 18
    iget-object v3, p0, Lcom/tv91/features/shared/widget/e$a;->g:Ljava/lang/String;

    invoke-static {v3}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 19
    iget-object v3, v2, Lcom/tv91/r/q;->f:Landroid/widget/Button;

    iget-object v5, p0, Lcom/tv91/features/shared/widget/e$a;->g:Ljava/lang/String;

    invoke-virtual {v3, v5}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 20
    iget-object v3, v2, Lcom/tv91/r/q;->f:Landroid/widget/Button;

    invoke-virtual {v3, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    .line 21
    :cond_4
    iget-object v3, v2, Lcom/tv91/r/q;->f:Landroid/widget/Button;

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setVisibility(I)V

    .line 22
    :goto_2
    iget-object v3, p0, Lcom/tv91/features/shared/widget/e$a;->h:Ljava/lang/String;

    invoke-static {v3}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    .line 23
    iget-object v3, v2, Lcom/tv91/r/q;->e:Landroid/widget/Button;

    iget-object v5, p0, Lcom/tv91/features/shared/widget/e$a;->h:Ljava/lang/String;

    invoke-virtual {v3, v5}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 24
    iget-object v3, v2, Lcom/tv91/r/q;->e:Landroid/widget/Button;

    invoke-virtual {v3, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    .line 25
    :cond_5
    iget-object v3, v2, Lcom/tv91/r/q;->e:Landroid/widget/Button;

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setVisibility(I)V

    .line 26
    :goto_3
    iget-object v3, p0, Lcom/tv91/features/shared/widget/e$a;->i:Ljava/lang/String;

    invoke-static {v3}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_6

    .line 27
    iget-object v3, v2, Lcom/tv91/r/q;->d:Landroid/widget/Button;

    iget-object v4, p0, Lcom/tv91/features/shared/widget/e$a;->i:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 28
    iget-object v2, v2, Lcom/tv91/r/q;->d:Landroid/widget/Button;

    invoke-virtual {v2, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_4

    .line 29
    :cond_6
    iget-object v1, v2, Lcom/tv91/r/q;->d:Landroid/widget/Button;

    invoke-virtual {v1, v4}, Landroid/widget/Button;->setVisibility(I)V

    .line 30
    :goto_4
    iget-object v1, p0, Lcom/tv91/features/shared/widget/e$a;->m:Ljava/lang/Runnable;

    if-eqz v1, :cond_7

    .line 31
    new-instance v1, Lcom/tv91/features/shared/widget/d;

    invoke-direct {v1, p0}, Lcom/tv91/features/shared/widget/d;-><init>(Lcom/tv91/features/shared/widget/e$a;)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 32
    :cond_7
    iget-object v1, p0, Lcom/tv91/features/shared/widget/e$a;->o:Ljava/lang/Runnable;

    if-eqz v1, :cond_8

    .line 33
    new-instance v1, Lcom/tv91/features/shared/widget/c;

    invoke-direct {v1, p0}, Lcom/tv91/features/shared/widget/c;-><init>(Lcom/tv91/features/shared/widget/e$a;)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 34
    :cond_8
    iget-object v1, p0, Lcom/tv91/features/shared/widget/e$a;->n:Ljava/lang/Runnable;

    if-eqz v1, :cond_9

    .line 35
    new-instance v1, Lcom/tv91/features/shared/widget/b;

    invoke-direct {v1, p0}, Lcom/tv91/features/shared/widget/b;-><init>(Lcom/tv91/features/shared/widget/e$a;)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 36
    :cond_9
    iget-boolean v1, p0, Lcom/tv91/features/shared/widget/e$a;->p:Z

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 37
    iget-boolean v1, p0, Lcom/tv91/features/shared/widget/e$a;->q:Z

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    return-object v0
.end method

.method public synthetic c(Lcom/tv91/features/shared/widget/e;Lcom/tv91/r/q;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/tv91/features/shared/widget/e$a;->b(Lcom/tv91/features/shared/widget/e;Lcom/tv91/r/q;Landroid/view/View;)V

    return-void
.end method

.method public synthetic e(Landroid/content/DialogInterface;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/shared/widget/e$a;->d(Landroid/content/DialogInterface;)V

    return-void
.end method

.method public synthetic g(Landroid/content/DialogInterface;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/shared/widget/e$a;->f(Landroid/content/DialogInterface;)V

    return-void
.end method

.method public synthetic i(Landroid/content/DialogInterface;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/shared/widget/e$a;->h(Landroid/content/DialogInterface;)V

    return-void
.end method

.method public j(Z)Lcom/tv91/features/shared/widget/e$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tv91/features/shared/widget/e$a;->p:Z

    return-object p0
.end method

.method public k(Z)Lcom/tv91/features/shared/widget/e$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tv91/features/shared/widget/e$a;->q:Z

    return-object p0
.end method

.method public l(Landroid/view/View;)Lcom/tv91/features/shared/widget/e$a;
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lcom/tv91/features/shared/widget/e$a;->e:I

    .line 2
    iput-object p1, p0, Lcom/tv91/features/shared/widget/e$a;->f:Landroid/view/View;

    return-object p0
.end method

.method public m(I)Lcom/tv91/features/shared/widget/e$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/widget/e$a;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/features/shared/widget/e$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public n(Ljava/lang/String;)Lcom/tv91/features/shared/widget/e$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/features/shared/widget/e$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public o(I)Lcom/tv91/features/shared/widget/e$a;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/tv91/features/shared/widget/e$a;->p(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    return-object p1
.end method

.method public p(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/widget/e$a;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/features/shared/widget/e$a;->i:Ljava/lang/String;

    .line 2
    iput-object p2, p0, Lcom/tv91/features/shared/widget/e$a;->l:Ljava/lang/Runnable;

    return-object p0
.end method

.method public q(I)Lcom/tv91/features/shared/widget/e$a;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/tv91/features/shared/widget/e$a;->r(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    return-object p1
.end method

.method public r(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/widget/e$a;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/features/shared/widget/e$a;->h:Ljava/lang/String;

    .line 2
    iput-object p2, p0, Lcom/tv91/features/shared/widget/e$a;->k:Ljava/lang/Runnable;

    return-object p0
.end method

.method public s(Ljava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/features/shared/widget/e$a;->o:Ljava/lang/Runnable;

    return-object p0
.end method

.method public t(Ljava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/features/shared/widget/e$a;->n:Ljava/lang/Runnable;

    return-object p0
.end method

.method public u(Ljava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/features/shared/widget/e$a;->m:Ljava/lang/Runnable;

    return-object p0
.end method

.method public v(I)Lcom/tv91/features/shared/widget/e$a;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/tv91/features/shared/widget/e$a;->w(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    return-object p1
.end method

.method public w(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/widget/e$a;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/features/shared/widget/e$a;->g:Ljava/lang/String;

    .line 2
    iput-object p2, p0, Lcom/tv91/features/shared/widget/e$a;->j:Ljava/lang/Runnable;

    return-object p0
.end method

.method public x(I)Lcom/tv91/features/shared/widget/e$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/widget/e$a;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/features/shared/widget/e$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public y(Ljava/lang/String;)Lcom/tv91/features/shared/widget/e$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/features/shared/widget/e$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public z()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/tv91/features/shared/widget/e$a;->a()Lcom/tv91/features/shared/widget/e;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    const/4 v3, -0x1

    .line 4
    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->width:I

    const/4 v3, -0x2

    .line 5
    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 6
    invoke-virtual {v1, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 7
    :cond_0
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method
