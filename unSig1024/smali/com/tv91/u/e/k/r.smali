.class final Lcom/tv91/u/e/k/r;
.super Lcom/tv91/features/shared/f;
.source "WithdrawView.java"

# interfaces
.implements Lcom/tv91/u/e/f;


# instance fields
.field private final e:Lcom/tv91/r/s0;

.field private final f:Lcom/tv91/features/shared/g;


# direct methods
.method constructor <init>(Lcom/tv91/r/s0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/f;-><init>(Lb/r/a;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/u/e/k/r;->e:Lcom/tv91/r/s0;

    .line 3
    new-instance v0, Lcom/tv91/features/shared/g;

    iget-object p1, p1, Lcom/tv91/r/s0;->n:Lcom/tv91/r/y;

    invoke-direct {v0, p1}, Lcom/tv91/features/shared/g;-><init>(Lcom/tv91/r/y;)V

    iput-object v0, p0, Lcom/tv91/u/e/k/r;->f:Lcom/tv91/features/shared/g;

    const p1, 0x7f12019f

    .line 4
    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->p(I)V

    return-void
.end method

.method private synthetic q2(Lb/g/j/a;Landroid/view/View;)V
    .locals 8

    .line 1
    iget-object p2, p0, Lcom/tv91/u/e/k/r;->e:Lcom/tv91/r/s0;

    iget-object p2, p2, Lcom/tv91/r/s0;->l:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    .line 2
    iget-object p2, p0, Lcom/tv91/u/e/k/r;->e:Lcom/tv91/r/s0;

    iget-object p2, p2, Lcom/tv91/r/s0;->g:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    .line 3
    iget-object p2, p0, Lcom/tv91/u/e/k/r;->e:Lcom/tv91/r/s0;

    iget-object p2, p2, Lcom/tv91/r/s0;->f:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    .line 4
    iget-object p2, p0, Lcom/tv91/u/e/k/r;->e:Lcom/tv91/r/s0;

    iget-object p2, p2, Lcom/tv91/r/s0;->h:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    .line 5
    iget-object p2, p0, Lcom/tv91/u/e/k/r;->e:Lcom/tv91/r/s0;

    iget-object p2, p2, Lcom/tv91/r/s0;->e:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    .line 6
    iget-object p2, p0, Lcom/tv91/u/e/k/r;->e:Lcom/tv91/r/s0;

    iget-object p2, p2, Lcom/tv91/r/s0;->k:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v6

    .line 7
    iget-object p2, p0, Lcom/tv91/u/e/k/r;->e:Lcom/tv91/r/s0;

    iget-object p2, p2, Lcom/tv91/r/s0;->i:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v7

    .line 8
    new-instance p2, Lcom/tv91/u/e/e;

    move-object v0, p2

    invoke-direct/range {v0 .. v7}, Lcom/tv91/u/e/e;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    invoke-interface {p1, p2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public H0(Lb/g/j/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/u/e/e;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/k/r;->e:Lcom/tv91/r/s0;

    iget-object v0, v0, Lcom/tv91/r/s0;->b:Landroid/widget/Button;

    new-instance v1, Lcom/tv91/u/e/k/l;

    invoke-direct {v1, p0, p1}, Lcom/tv91/u/e/k/l;-><init>(Lcom/tv91/u/e/k/r;Lb/g/j/a;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public R()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const v2, 0x7f120194

    invoke-virtual {p0, v2, v1}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tv91/features/shared/widget/e;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public T1(Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f12005d

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/widget/e$a;->n(Ljava/lang/String;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const v0, 0x7f12004f

    .line 4
    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/widget/e$a;->v(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 5
    invoke-virtual {p1, p2}, Lcom/tv91/features/shared/widget/e$a;->t(Ljava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public a(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/k/r;->e:Lcom/tv91/r/s0;

    iget-object v0, v0, Lcom/tv91/r/s0;->d:Landroid/widget/ProgressBar;

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/e/k/r;->e:Lcom/tv91/r/s0;

    iget-object v0, v0, Lcom/tv91/r/s0;->b:Landroid/widget/Button;

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public b(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/k/r;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->i(Ljava/lang/Runnable;)V

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
    iget-object p1, p0, Lcom/tv91/u/e/k/r;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {p1}, Lcom/tv91/features/shared/g;->b()V

    .line 2
    iget-object p1, p0, Lcom/tv91/u/e/k/r;->e:Lcom/tv91/r/s0;

    iget-object p1, p1, Lcom/tv91/r/s0;->b:Landroid/widget/Button;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public synthetic r2(Lb/g/j/a;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/e/k/r;->q2(Lb/g/j/a;Landroid/view/View;)V

    return-void
.end method
