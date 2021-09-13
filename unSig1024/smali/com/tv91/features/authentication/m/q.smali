.class final Lcom/tv91/features/authentication/m/q;
.super Lcom/tv91/features/shared/f;
.source "ChangePasswordView.java"

# interfaces
.implements Lcom/tv91/features/authentication/c;


# instance fields
.field private final e:Lcom/tv91/r/b0;

.field private final f:Lcom/tv91/features/shared/g;


# direct methods
.method constructor <init>(Lcom/tv91/r/b0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/f;-><init>(Lb/r/a;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/features/authentication/m/q;->e:Lcom/tv91/r/b0;

    .line 3
    new-instance v0, Lcom/tv91/features/shared/g;

    iget-object p1, p1, Lcom/tv91/r/b0;->g:Lcom/tv91/r/y;

    invoke-direct {v0, p1}, Lcom/tv91/features/shared/g;-><init>(Lcom/tv91/r/y;)V

    iput-object v0, p0, Lcom/tv91/features/authentication/m/q;->f:Lcom/tv91/features/shared/g;

    const p1, 0x7f120040

    .line 4
    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->p(I)V

    return-void
.end method

.method private synthetic q2(Lb/g/j/a;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/m/q;->u2(Lb/g/j/a;)V

    return-void
.end method

.method private synthetic s2(Lb/g/j/a;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/m/q;->u2(Lb/g/j/a;)V

    return-void
.end method

.method private u2(Lb/g/j/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/features/authentication/b;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/m/q;->e:Lcom/tv91/r/b0;

    iget-object v0, v0, Lcom/tv91/r/b0;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/m/q;->e:Lcom/tv91/r/b0;

    iget-object v0, v0, Lcom/tv91/r/b0;->b:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/m/q;->e:Lcom/tv91/r/b0;

    iget-object v0, v0, Lcom/tv91/r/b0;->f:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/tv91/features/authentication/m/q;->e:Lcom/tv91/r/b0;

    iget-object v1, v1, Lcom/tv91/r/b0;->e:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    .line 5
    new-instance v2, Lcom/tv91/features/authentication/b;

    invoke-direct {v2, v0, v1}, Lcom/tv91/features/authentication/b;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    invoke-interface {p1, v2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public C1(Lb/g/j/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/features/authentication/b;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/m/q;->e:Lcom/tv91/r/b0;

    iget-object v0, v0, Lcom/tv91/r/b0;->e:Landroid/widget/EditText;

    new-instance v1, Lcom/tv91/features/authentication/m/j;

    invoke-direct {v1, p0, p1}, Lcom/tv91/features/authentication/m/j;-><init>(Lcom/tv91/features/authentication/m/q;Lb/g/j/a;)V

    .line 2
    invoke-static {v1}, Lcom/tv91/features/shared/i/f;->a(Lb/g/j/a;)Landroid/widget/TextView$OnEditorActionListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/m/q;->e:Lcom/tv91/r/b0;

    iget-object v0, v0, Lcom/tv91/r/b0;->b:Landroid/widget/Button;

    new-instance v1, Lcom/tv91/features/authentication/m/i;

    invoke-direct {v1, p0, p1}, Lcom/tv91/features/authentication/m/i;-><init>(Lcom/tv91/features/authentication/m/q;Lb/g/j/a;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public R0(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f12003c

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f12003b

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->m(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f120054

    .line 4
    invoke-virtual {v0, v1, p1}, Lcom/tv91/features/shared/widget/e$a;->w(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/widget/e$a;->j(Z)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 6
    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/widget/e$a;->k(Z)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public b(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/m/q;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->i(Ljava/lang/Runnable;)V

    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tv91/features/authentication/m/q;->g0(Ljava/lang/String;)V

    return-void
.end method

.method public g0(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/m/q;->e:Lcom/tv91/r/b0;

    iget-object v0, v0, Lcom/tv91/r/b0;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/features/authentication/m/q;->e:Lcom/tv91/r/b0;

    iget-object p1, p1, Lcom/tv91/r/b0;->b:Landroid/widget/Button;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public h2(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tv91/features/authentication/m/q;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {p1}, Lcom/tv91/features/shared/g;->b()V

    .line 2
    iget-object p1, p0, Lcom/tv91/features/authentication/m/q;->e:Lcom/tv91/r/b0;

    iget-object p1, p1, Lcom/tv91/r/b0;->e:Landroid/widget/EditText;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/features/authentication/m/q;->e:Lcom/tv91/r/b0;

    iget-object p1, p1, Lcom/tv91/r/b0;->b:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public synthetic r2(Lb/g/j/a;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/features/authentication/m/q;->q2(Lb/g/j/a;Landroid/widget/TextView;)V

    return-void
.end method

.method public synthetic t2(Lb/g/j/a;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/features/authentication/m/q;->s2(Lb/g/j/a;Landroid/view/View;)V

    return-void
.end method
