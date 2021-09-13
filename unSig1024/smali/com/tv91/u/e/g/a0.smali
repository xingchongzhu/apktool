.class final Lcom/tv91/u/e/g/a0;
.super Lcom/tv91/features/shared/f;
.source "MemberView.java"

# interfaces
.implements Lcom/tv91/u/e/b;


# instance fields
.field private final e:Lcom/tv91/r/q0;

.field private final f:Lcom/tv91/features/shared/g;


# direct methods
.method constructor <init>(Lcom/tv91/r/q0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/f;-><init>(Lb/r/a;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/u/e/g/a0;->e:Lcom/tv91/r/q0;

    .line 3
    new-instance v0, Lcom/tv91/features/shared/g;

    iget-object p1, p1, Lcom/tv91/r/q0;->l:Lcom/tv91/r/y;

    invoke-direct {v0, p1}, Lcom/tv91/features/shared/g;-><init>(Lcom/tv91/r/y;)V

    iput-object v0, p0, Lcom/tv91/u/e/g/a0;->f:Lcom/tv91/features/shared/g;

    const p1, 0x7f12018f

    .line 4
    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->p(I)V

    return-void
.end method

.method private synthetic q2(Lb/g/j/a;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/tv91/u/e/g/a0;->e:Lcom/tv91/r/q0;

    iget-object p2, p2, Lcom/tv91/r/q0;->b:Landroid/widget/Button;

    invoke-virtual {p2}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    .line 2
    invoke-interface {p1, p2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic s2(Lb/g/j/a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/g/a0;->e:Lcom/tv91/r/q0;

    iget-object v0, v0, Lcom/tv91/r/q0;->f:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/tv91/u/e/g/a0;->e:Lcom/tv91/r/q0;

    iget-object v1, v1, Lcom/tv91/r/q0;->f:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getHeight()I

    move-result v1

    .line 3
    new-instance v2, Lcom/tv91/u/e/a;

    invoke-direct {v2, v0, v1}, Lcom/tv91/u/e/a;-><init>(II)V

    invoke-interface {p1, v2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic u2(Ljava/lang/Runnable;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method static synthetic v2(Ljava/lang/Runnable;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method


# virtual methods
.method public F(Lb/g/j/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/g/a0;->e:Lcom/tv91/r/q0;

    iget-object v0, v0, Lcom/tv91/r/q0;->b:Landroid/widget/Button;

    new-instance v1, Lcom/tv91/u/e/g/t;

    invoke-direct {v1, p0, p1}, Lcom/tv91/u/e/g/t;-><init>(Lcom/tv91/u/e/g/a0;Lb/g/j/a;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public G0(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/g/a0;->e:Lcom/tv91/r/q0;

    iget-object v0, v0, Lcom/tv91/r/q0;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public R1(Ljava/lang/String;Ljava/lang/Runnable;)V
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

    const v0, 0x7f120188

    .line 4
    invoke-virtual {p1, v0, p2}, Lcom/tv91/features/shared/widget/e$a;->w(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const p2, 0x7f12004d

    .line 5
    invoke-virtual {p1, p2}, Lcom/tv91/features/shared/widget/e$a;->o(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public V0(Lb/g/j/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/u/e/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/g/a0;->e:Lcom/tv91/r/q0;

    iget-object v0, v0, Lcom/tv91/r/q0;->f:Landroid/widget/ImageView;

    new-instance v1, Lcom/tv91/u/e/g/s;

    invoke-direct {v1, p0, p1}, Lcom/tv91/u/e/g/s;-><init>(Lcom/tv91/u/e/g/a0;Lb/g/j/a;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public V1(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/g/a0;->e:Lcom/tv91/r/q0;

    iget-object v0, v0, Lcom/tv91/r/q0;->d:Landroid/widget/Button;

    new-instance v1, Lcom/tv91/u/e/g/u;

    invoke-direct {v1, p1}, Lcom/tv91/u/e/g/u;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public X1(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/g/a0;->e:Lcom/tv91/r/q0;

    iget-object v0, v0, Lcom/tv91/r/q0;->c:Landroid/widget/Button;

    new-instance v1, Lcom/tv91/u/e/g/v;

    invoke-direct {v1, p1}, Lcom/tv91/u/e/g/v;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/g/a0;->e:Lcom/tv91/r/q0;

    iget-object v0, v0, Lcom/tv91/r/q0;->h:Landroid/widget/ProgressBar;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method

.method public b(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/g/a0;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->i(Ljava/lang/Runnable;)V

    return-void
.end method

.method public e1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    const v1, 0x7f12018b

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public g0(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/widget/e;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public h2(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tv91/u/e/g/a0;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {p1}, Lcom/tv91/features/shared/g;->b()V

    .line 2
    iget-object p1, p0, Lcom/tv91/u/e/g/a0;->e:Lcom/tv91/r/q0;

    iget-object p1, p1, Lcom/tv91/r/q0;->d:Landroid/widget/Button;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/u/e/g/a0;->e:Lcom/tv91/r/q0;

    iget-object p1, p1, Lcom/tv91/r/q0;->c:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    iget-object p1, p0, Lcom/tv91/u/e/g/a0;->e:Lcom/tv91/r/q0;

    iget-object p1, p1, Lcom/tv91/r/q0;->b:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public i2(Lcom/tv91/model/Promotion;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/g/a0;->e:Lcom/tv91/r/q0;

    iget-object v0, v0, Lcom/tv91/r/q0;->j:Landroid/widget/TextView;

    iget-object p1, p1, Lcom/tv91/model/Promotion;->exchangeRule:Ljava/lang/String;

    invoke-static {p1}, Lcom/tv91/utils/g;->i(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/u/e/g/a0;->e:Lcom/tv91/r/q0;

    iget-object p1, p1, Lcom/tv91/r/q0;->j:Landroid/widget/TextView;

    new-instance v0, Landroid/text/method/ScrollingMovementMethod;

    invoke-direct {v0}, Landroid/text/method/ScrollingMovementMethod;-><init>()V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    return-void
.end method

.method public synthetic r2(Lb/g/j/a;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/e/g/a0;->q2(Lb/g/j/a;Landroid/view/View;)V

    return-void
.end method

.method public synthetic t2(Lb/g/j/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/e/g/a0;->s2(Lb/g/j/a;)V

    return-void
.end method
