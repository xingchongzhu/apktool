.class final Lcom/tv91/u/g/e0;
.super Lcom/tv91/features/shared/f;
.source "SplashView.java"

# interfaces
.implements Lcom/tv91/u/g/d0;


# instance fields
.field private final e:Lcom/tv91/r/w0;

.field private f:Ljava/lang/Runnable;

.field private g:Ljava/lang/Runnable;

.field private h:Ljava/lang/Runnable;

.field private i:Ljava/lang/Runnable;

.field private j:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lcom/tv91/r/w0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/f;-><init>(Lb/r/a;)V

    .line 2
    sget-object v0, Lcom/tv91/u/g/v;->a:Lcom/tv91/u/g/v;

    iput-object v0, p0, Lcom/tv91/u/g/e0;->f:Ljava/lang/Runnable;

    .line 3
    sget-object v0, Lcom/tv91/u/g/x;->a:Lcom/tv91/u/g/x;

    iput-object v0, p0, Lcom/tv91/u/g/e0;->g:Ljava/lang/Runnable;

    .line 4
    sget-object v0, Lcom/tv91/u/g/u;->a:Lcom/tv91/u/g/u;

    iput-object v0, p0, Lcom/tv91/u/g/e0;->h:Ljava/lang/Runnable;

    .line 5
    sget-object v0, Lcom/tv91/u/g/w;->a:Lcom/tv91/u/g/w;

    iput-object v0, p0, Lcom/tv91/u/g/e0;->i:Ljava/lang/Runnable;

    .line 6
    sget-object v0, Lcom/tv91/u/g/y;->a:Lcom/tv91/u/g/y;

    iput-object v0, p0, Lcom/tv91/u/g/e0;->j:Ljava/lang/Runnable;

    .line 7
    iput-object p1, p0, Lcom/tv91/u/g/e0;->e:Lcom/tv91/r/w0;

    .line 8
    iget-object p1, p1, Lcom/tv91/r/w0;->e:Landroid/widget/ProgressBar;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method

.method static synthetic q2()V
    .locals 0

    return-void
.end method

.method static synthetic r2()V
    .locals 0

    return-void
.end method

.method static synthetic s2()V
    .locals 0

    return-void
.end method

.method static synthetic t2()V
    .locals 0

    return-void
.end method

.method static synthetic u2()V
    .locals 0

    return-void
.end method


# virtual methods
.method public G1(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f12005c

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/widget/e$a;->n(Ljava/lang/String;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    iget-object v0, p0, Lcom/tv91/u/g/e0;->i:Ljava/lang/Runnable;

    const v1, 0x7f120059

    .line 4
    invoke-virtual {p1, v1, v0}, Lcom/tv91/features/shared/widget/e$a;->w(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    iget-object v0, p0, Lcom/tv91/u/g/e0;->j:Ljava/lang/Runnable;

    const v1, 0x7f120050

    .line 5
    invoke-virtual {p1, v1, v0}, Lcom/tv91/features/shared/widget/e$a;->r(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public I1(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/g/e0;->j:Ljava/lang/Runnable;

    return-void
.end method

.method public P0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/g/e0;->e:Lcom/tv91/r/w0;

    iget-object v0, v0, Lcom/tv91/r/w0;->f:Landroid/widget/TextView;

    const v1, 0x7f1200e3

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public U1(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object p1

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    .line 4
    :goto_0
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f1200dd

    .line 5
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/widget/e$a;->n(Ljava/lang/String;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const v0, 0x7f1200e0

    iget-object v1, p0, Lcom/tv91/u/g/e0;->f:Ljava/lang/Runnable;

    .line 7
    invoke-virtual {p1, v0, v1}, Lcom/tv91/features/shared/widget/e$a;->w(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const v0, 0x7f1200df

    iget-object v1, p0, Lcom/tv91/u/g/e0;->g:Ljava/lang/Runnable;

    .line 8
    invoke-virtual {p1, v0, v1}, Lcom/tv91/features/shared/widget/e$a;->r(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const v0, 0x7f12004d

    iget-object v1, p0, Lcom/tv91/u/g/e0;->h:Ljava/lang/Runnable;

    .line 9
    invoke-virtual {p1, v0, v1}, Lcom/tv91/features/shared/widget/e$a;->p(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    iget-object v0, p0, Lcom/tv91/u/g/e0;->h:Ljava/lang/Runnable;

    .line 10
    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/widget/e$a;->s(Ljava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public g0(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/widget/e;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public j0(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/g/e0;->i:Ljava/lang/Runnable;

    return-void
.end method

.method public j2(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/g/e0;->f:Ljava/lang/Runnable;

    return-void
.end method

.method public m(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/g/e0;->g:Ljava/lang/Runnable;

    return-void
.end method

.method public n0(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/g/e0;->h:Ljava/lang/Runnable;

    return-void
.end method

.method public q()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/g/e0;->e:Lcom/tv91/r/w0;

    iget-object v0, v0, Lcom/tv91/r/w0;->f:Landroid/widget/TextView;

    const v1, 0x7f1200de

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public w()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/g/e0;->e:Lcom/tv91/r/w0;

    iget-object v0, v0, Lcom/tv91/r/w0;->f:Landroid/widget/TextView;

    const v1, 0x7f1200e1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method
