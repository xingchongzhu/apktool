.class final Lcom/tv91/features/authentication/r/z;
.super Lcom/tv91/features/shared/f;
.source "VerifyView.java"

# interfaces
.implements Lcom/tv91/features/authentication/l;


# instance fields
.field private final e:Lcom/tv91/r/x0;

.field private final f:Lcom/tv91/features/shared/g;


# direct methods
.method constructor <init>(Lcom/tv91/r/x0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/f;-><init>(Lb/r/a;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    .line 3
    new-instance v0, Lcom/tv91/features/shared/g;

    iget-object p1, p1, Lcom/tv91/r/x0;->j:Lcom/tv91/r/y;

    invoke-direct {v0, p1}, Lcom/tv91/features/shared/g;-><init>(Lcom/tv91/r/y;)V

    iput-object v0, p0, Lcom/tv91/features/authentication/r/z;->f:Lcom/tv91/features/shared/g;

    const p1, 0x7f120101

    .line 4
    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->p(I)V

    return-void
.end method

.method private synthetic q2(Lb/g/j/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    iget-object v0, v0, Lcom/tv91/r/x0;->h:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {p1, v0}, Lb/g/j/a;->a(Ljava/lang/Object;)V

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

.method private synthetic u2(Lb/g/j/a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    iget-object v0, v0, Lcom/tv91/r/x0;->h:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    iget-object v1, v1, Lcom/tv91/r/x0;->e:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    .line 3
    new-instance v2, Lcom/tv91/features/authentication/k;

    invoke-direct {v2, v0, v1}, Lcom/tv91/features/authentication/k;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    invoke-interface {p1, v2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic w2(Ljava/lang/Runnable;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method static synthetic x2(Ljava/lang/Runnable;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/r/z;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->i(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b1(Lb/g/j/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/features/authentication/k;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/tv91/features/authentication/r/r;

    invoke-direct {v0, p0, p1}, Lcom/tv91/features/authentication/r/r;-><init>(Lcom/tv91/features/authentication/r/z;Lb/g/j/a;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    iget-object p1, p1, Lcom/tv91/r/x0;->e:Landroid/widget/EditText;

    new-instance v1, Lcom/tv91/features/authentication/r/s;

    invoke-direct {v1, v0}, Lcom/tv91/features/authentication/r/s;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/f;->a(Lb/g/j/a;)Landroid/widget/TextView$OnEditorActionListener;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    iget-object p1, p1, Lcom/tv91/r/x0;->b:Landroid/widget/Button;

    new-instance v1, Lcom/tv91/features/authentication/r/o;

    invoke-direct {v1, v0}, Lcom/tv91/features/authentication/r/o;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public f(Lb/g/j/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Ljava/lang/CharSequence;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/tv91/features/authentication/r/p;

    invoke-direct {v0, p0, p1}, Lcom/tv91/features/authentication/r/p;-><init>(Lcom/tv91/features/authentication/r/z;Lb/g/j/a;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    iget-object p1, p1, Lcom/tv91/r/x0;->h:Landroid/widget/EditText;

    new-instance v1, Lcom/tv91/features/authentication/r/t;

    invoke-direct {v1, v0}, Lcom/tv91/features/authentication/r/t;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/f;->c(Lb/g/j/a;)Landroid/widget/TextView$OnEditorActionListener;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    iget-object p1, p1, Lcom/tv91/r/x0;->i:Lcom/tv91/features/shared/widget/CountdownTextView;

    new-instance v1, Lcom/tv91/features/authentication/r/q;

    invoke-direct {v1, v0}, Lcom/tv91/features/authentication/r/q;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tv91/features/authentication/r/z;->g0(Ljava/lang/String;)V

    return-void
.end method

.method public g0(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    iget-object v0, v0, Lcom/tv91/r/x0;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    iget-object p1, p1, Lcom/tv91/r/x0;->i:Lcom/tv91/features/shared/widget/CountdownTextView;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setClickable(Z)V

    .line 3
    iget-object p1, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    iget-object p1, p1, Lcom/tv91/r/x0;->b:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public h2(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tv91/features/authentication/r/z;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {p1}, Lcom/tv91/features/shared/g;->b()V

    .line 2
    iget-object p1, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    iget-object p1, p1, Lcom/tv91/r/x0;->h:Landroid/widget/EditText;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    iget-object p1, p1, Lcom/tv91/r/x0;->i:Lcom/tv91/features/shared/widget/CountdownTextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    iget-object p1, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    iget-object p1, p1, Lcom/tv91/r/x0;->e:Landroid/widget/EditText;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 5
    iget-object p1, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    iget-object p1, p1, Lcom/tv91/r/x0;->b:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public j()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    iget-object v0, v0, Lcom/tv91/r/x0;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    iget-object v0, v0, Lcom/tv91/r/x0;->i:Lcom/tv91/features/shared/widget/CountdownTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    iget-object v0, v0, Lcom/tv91/r/x0;->b:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    iget-object v0, v0, Lcom/tv91/r/x0;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public l()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    iget-object v0, v0, Lcom/tv91/r/x0;->g:Landroid/widget/TextView;

    const v1, 0x7f120100

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    iget-object v0, v0, Lcom/tv91/r/x0;->e:Landroid/widget/EditText;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    iget-object v0, v0, Lcom/tv91/r/x0;->b:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public synthetic r2(Lb/g/j/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/r/z;->q2(Lb/g/j/a;)V

    return-void
.end method

.method public t1(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    iget-object p1, p1, Lcom/tv91/r/x0;->i:Lcom/tv91/features/shared/widget/CountdownTextView;

    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/CountdownTextView;->l()V

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/tv91/features/authentication/r/z;->e:Lcom/tv91/r/x0;

    iget-object p1, p1, Lcom/tv91/r/x0;->i:Lcom/tv91/features/shared/widget/CountdownTextView;

    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/CountdownTextView;->n()V

    :goto_0
    return-void
.end method

.method public synthetic v2(Lb/g/j/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/r/z;->u2(Lb/g/j/a;)V

    return-void
.end method
