.class final Lcom/tv91/features/authentication/o/q;
.super Lcom/tv91/features/shared/f;
.source "RegisterView.java"

# interfaces
.implements Lcom/tv91/features/authentication/j;


# instance fields
.field private final e:Lcom/tv91/r/v0;

.field private final f:Lcom/tv91/features/shared/g;


# direct methods
.method constructor <init>(Lcom/tv91/r/v0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/f;-><init>(Lb/r/a;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/features/authentication/o/q;->e:Lcom/tv91/r/v0;

    .line 3
    new-instance v0, Lcom/tv91/features/shared/g;

    iget-object p1, p1, Lcom/tv91/r/v0;->j:Lcom/tv91/r/y;

    invoke-direct {v0, p1}, Lcom/tv91/features/shared/g;-><init>(Lcom/tv91/r/y;)V

    iput-object v0, p0, Lcom/tv91/features/authentication/o/q;->f:Lcom/tv91/features/shared/g;

    const p1, 0x7f1201cc

    .line 4
    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->p(I)V

    const p1, 0x7f0e0001

    .line 5
    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->c(I)V

    return-void
.end method

.method private synthetic q2(Lb/g/j/a;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/o/q;->e:Lcom/tv91/r/v0;

    iget-object v0, v0, Lcom/tv91/r/v0;->d:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/tv91/features/authentication/o/q;->e:Lcom/tv91/r/v0;

    iget-object v1, v1, Lcom/tv91/r/v0;->g:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lcom/tv91/features/authentication/o/q;->e:Lcom/tv91/r/v0;

    iget-object v2, v2, Lcom/tv91/r/v0;->h:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    .line 4
    iget-object v3, p0, Lcom/tv91/features/authentication/o/q;->e:Lcom/tv91/r/v0;

    iget-object v3, v3, Lcom/tv91/r/v0;->e:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    .line 5
    new-instance v4, Lcom/tv91/features/authentication/i;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/tv91/features/authentication/i;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    invoke-interface {p1, v4}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic s2(Ljava/lang/Runnable;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method static synthetic t2(Ljava/lang/Runnable;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method


# virtual methods
.method public J(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tv91/features/authentication/o/q;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {p1}, Lcom/tv91/features/shared/g;->a()V

    return-void
.end method

.method public d(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/o/q;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->j(Ljava/lang/Runnable;)V

    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/o/q;->e:Lcom/tv91/r/v0;

    iget-object v0, v0, Lcom/tv91/r/v0;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/features/authentication/o/q;->e:Lcom/tv91/r/v0;

    iget-object p1, p1, Lcom/tv91/r/v0;->b:Landroid/widget/Button;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public h2(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tv91/features/authentication/o/q;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {p1}, Lcom/tv91/features/shared/g;->b()V

    .line 2
    iget-object p1, p0, Lcom/tv91/features/authentication/o/q;->e:Lcom/tv91/r/v0;

    iget-object p1, p1, Lcom/tv91/r/v0;->e:Landroid/widget/EditText;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/features/authentication/o/q;->e:Lcom/tv91/r/v0;

    iget-object p1, p1, Lcom/tv91/r/v0;->b:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public j()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/o/q;->e:Lcom/tv91/r/v0;

    iget-object v0, v0, Lcom/tv91/r/v0;->f:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/o/q;->e:Lcom/tv91/r/v0;

    iget-object v0, v0, Lcom/tv91/r/v0;->b:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public p1(Lb/g/j/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/features/authentication/i;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/tv91/features/authentication/o/k;

    invoke-direct {v0, p0, p1}, Lcom/tv91/features/authentication/o/k;-><init>(Lcom/tv91/features/authentication/o/q;Lb/g/j/a;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/features/authentication/o/q;->e:Lcom/tv91/r/v0;

    iget-object p1, p1, Lcom/tv91/r/v0;->e:Landroid/widget/EditText;

    new-instance v1, Lcom/tv91/features/authentication/o/i;

    invoke-direct {v1, v0}, Lcom/tv91/features/authentication/o/i;-><init>(Ljava/lang/Runnable;)V

    .line 3
    invoke-static {v1}, Lcom/tv91/features/shared/i/f;->c(Lb/g/j/a;)Landroid/widget/TextView$OnEditorActionListener;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 4
    iget-object p1, p0, Lcom/tv91/features/authentication/o/q;->e:Lcom/tv91/r/v0;

    iget-object p1, p1, Lcom/tv91/r/v0;->b:Landroid/widget/Button;

    new-instance v1, Lcom/tv91/features/authentication/o/j;

    invoke-direct {v1, v0}, Lcom/tv91/features/authentication/o/j;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public r0(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/o/q;->e:Lcom/tv91/r/v0;

    iget-object v0, v0, Lcom/tv91/r/v0;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/features/authentication/o/q;->e:Lcom/tv91/r/v0;

    iget-object p1, p1, Lcom/tv91/r/v0;->b:Landroid/widget/Button;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public synthetic r2(Lb/g/j/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/o/q;->q2(Lb/g/j/a;)V

    return-void
.end method
