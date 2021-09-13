.class final Lcom/tv91/features/authentication/n/l0;
.super Lcom/tv91/features/shared/f;
.source "LoginView.java"

# interfaces
.implements Lcom/tv91/features/authentication/h;


# instance fields
.field private final e:Lcom/tv91/r/j0;


# direct methods
.method constructor <init>(Lcom/tv91/r/j0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/f;-><init>(Lb/r/a;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    return-void
.end method

.method private synthetic A2(Lb/g/j/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->m:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {p1, v0}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic C2(Ljava/lang/Runnable;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method static synthetic D2(Ljava/lang/Runnable;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method static synthetic q2(Ljava/lang/Runnable;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method static synthetic r2(Ljava/lang/Runnable;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method static synthetic s2(Ljava/lang/Runnable;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method private synthetic t2(Lb/g/j/a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->m:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v1, v1, Lcom/tv91/r/j0;->o:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    .line 3
    new-instance v2, Lcom/tv91/features/authentication/g;

    invoke-direct {v2, v0, v1}, Lcom/tv91/features/authentication/g;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    invoke-interface {p1, v2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic v2(Ljava/lang/Runnable;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method static synthetic w2(Ljava/lang/Runnable;Landroid/view/View;)V
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

.method static synthetic y2(Ljava/lang/Runnable;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method static synthetic z2(Ljava/lang/Runnable;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method


# virtual methods
.method public A0(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->d:Landroid/widget/Button;

    new-instance v1, Lcom/tv91/features/authentication/n/b0;

    invoke-direct {v1, p1}, Lcom/tv91/features/authentication/n/b0;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public B1()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->c:Landroid/widget/Button;

    const v1, 0x7f0800c1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->c:Landroid/widget/Button;

    const v1, 0x7f0600f4

    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/f;->l2(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->d:Landroid/widget/Button;

    const v1, 0x7f06007a

    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/f;->l2(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundColor(I)V

    .line 4
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->d:Landroid/widget/Button;

    const v1, 0x7f0600f0

    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/f;->l2(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 5
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->m:Landroid/widget/EditText;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V

    .line 6
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->m:Landroid/widget/EditText;

    const v1, 0x7f1200d9

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(I)V

    .line 7
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->m:Landroid/widget/EditText;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setImeOptions(I)V

    .line 8
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->m:Landroid/widget/EditText;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->o:Landroid/widget/EditText;

    const v3, 0x80001

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setInputType(I)V

    .line 10
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->o:Landroid/widget/EditText;

    const v3, 0x7f1200d7

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setHint(I)V

    .line 11
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->o:Landroid/widget/EditText;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 12
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->o:Landroid/widget/EditText;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 13
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->b:Landroid/widget/Button;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 15
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->g:Lcom/tv91/features/shared/widget/CountdownTextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 16
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public synthetic B2(Lb/g/j/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/n/l0;->A2(Lb/g/j/a;)V

    return-void
.end method

.method public D0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->g:Lcom/tv91/features/shared/widget/CountdownTextView;

    invoke-virtual {v0}, Lcom/tv91/features/shared/widget/CountdownTextView;->l()V

    return-void
.end method

.method public G(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->n:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->b:Landroid/widget/Button;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public I(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->f:Landroid/widget/Button;

    new-instance v1, Lcom/tv91/features/authentication/n/t;

    invoke-direct {v1, p1}, Lcom/tv91/features/authentication/n/t;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public X(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->c:Landroid/widget/Button;

    new-instance v1, Lcom/tv91/features/authentication/n/u;

    invoke-direct {v1, p1}, Lcom/tv91/features/authentication/n/u;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public Z1(Lb/g/j/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/features/authentication/g;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/tv91/features/authentication/n/e0;

    invoke-direct {v0, p0, p1}, Lcom/tv91/features/authentication/n/e0;-><init>(Lcom/tv91/features/authentication/n/l0;Lb/g/j/a;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->o:Landroid/widget/EditText;

    new-instance v1, Lcom/tv91/features/authentication/n/x;

    invoke-direct {v1, v0}, Lcom/tv91/features/authentication/n/x;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/f;->a(Lb/g/j/a;)Landroid/widget/TextView$OnEditorActionListener;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->b:Landroid/widget/Button;

    new-instance v1, Lcom/tv91/features/authentication/n/a0;

    invoke-direct {v1, v0}, Lcom/tv91/features/authentication/n/a0;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public c1(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->c:Landroid/widget/Button;

    const v1, 0x7f060033

    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/f;->l2(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundColor(I)V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->c:Landroid/widget/Button;

    const v1, 0x7f0600f0

    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/f;->l2(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->d:Landroid/widget/Button;

    const v1, 0x7f0800c2

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 4
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->d:Landroid/widget/Button;

    const v1, 0x7f0600f4

    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/f;->l2(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 5
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->m:Landroid/widget/EditText;

    const/16 v1, 0x21

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V

    .line 6
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->m:Landroid/widget/EditText;

    const v1, 0x7f1200d6

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(I)V

    .line 7
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->m:Landroid/widget/EditText;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setImeOptions(I)V

    .line 8
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->m:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->o:Landroid/widget/EditText;

    const/16 v0, 0x81

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setInputType(I)V

    .line 10
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->o:Landroid/widget/EditText;

    const v0, 0x7f1200d8

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setHint(I)V

    .line 11
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->o:Landroid/widget/EditText;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 12
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->o:Landroid/widget/EditText;

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 13
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->n:Landroid/widget/TextView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->b:Landroid/widget/Button;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setVisibility(I)V

    .line 15
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->g:Lcom/tv91/features/shared/widget/CountdownTextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 16
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->l:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public d(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->i:Landroid/widget/ImageView;

    new-instance v1, Lcom/tv91/features/authentication/n/c0;

    invoke-direct {v1, p1}, Lcom/tv91/features/authentication/n/c0;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

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
    new-instance v0, Lcom/tv91/features/authentication/n/w;

    invoke-direct {v0, p0, p1}, Lcom/tv91/features/authentication/n/w;-><init>(Lcom/tv91/features/authentication/n/l0;Lb/g/j/a;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->m:Landroid/widget/EditText;

    new-instance v1, Lcom/tv91/features/authentication/n/z;

    invoke-direct {v1, v0}, Lcom/tv91/features/authentication/n/z;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/f;->c(Lb/g/j/a;)Landroid/widget/TextView$OnEditorActionListener;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->g:Lcom/tv91/features/shared/widget/CountdownTextView;

    new-instance v1, Lcom/tv91/features/authentication/n/y;

    invoke-direct {v1, v0}, Lcom/tv91/features/authentication/n/y;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->n:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->g:Lcom/tv91/features/shared/widget/CountdownTextView;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setClickable(Z)V

    .line 3
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->b:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public h2(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->i:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->c:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->d:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->m:Landroid/widget/EditText;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 5
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->o:Landroid/widget/EditText;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 6
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->b:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->g:Lcom/tv91/features/shared/widget/CountdownTextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->l:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->f:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->e:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public j()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->n:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->g:Lcom/tv91/features/shared/widget/CountdownTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->b:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->n:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object p1, p1, Lcom/tv91/r/j0;->c:Landroid/widget/Button;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public l()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->n:Landroid/widget/TextView;

    const v1, 0x7f1200db

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->o:Landroid/widget/EditText;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->b:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 4
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->b:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->c:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public u0(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->l:Landroid/widget/TextView;

    new-instance v1, Lcom/tv91/features/authentication/n/d0;

    invoke-direct {v1, p1}, Lcom/tv91/features/authentication/n/d0;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public synthetic u2(Lb/g/j/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/n/l0;->t2(Lb/g/j/a;)V

    return-void
.end method

.method public v1(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/n/l0;->e:Lcom/tv91/r/j0;

    iget-object v0, v0, Lcom/tv91/r/j0;->e:Landroid/widget/Button;

    new-instance v1, Lcom/tv91/features/authentication/n/v;

    invoke-direct {v1, p1}, Lcom/tv91/features/authentication/n/v;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
