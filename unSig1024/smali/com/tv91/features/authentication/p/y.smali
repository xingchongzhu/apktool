.class final Lcom/tv91/features/authentication/p/y;
.super Lcom/tv91/features/shared/f;
.source "ForgetPasswordView.java"

# interfaces
.implements Lcom/tv91/features/authentication/e;


# instance fields
.field private final e:Lcom/tv91/r/i0;

.field private final f:Lcom/tv91/features/shared/g;


# direct methods
.method constructor <init>(Lcom/tv91/r/i0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/f;-><init>(Lb/r/a;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    .line 3
    new-instance v0, Lcom/tv91/features/shared/g;

    iget-object p1, p1, Lcom/tv91/r/i0;->m:Lcom/tv91/r/y;

    invoke-direct {v0, p1}, Lcom/tv91/features/shared/g;-><init>(Lcom/tv91/r/y;)V

    iput-object v0, p0, Lcom/tv91/features/authentication/p/y;->f:Lcom/tv91/features/shared/g;

    const p1, 0x7f1201db

    .line 4
    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->p(I)V

    const p1, 0x7f0e0001

    .line 5
    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->c(I)V

    return-void
.end method

.method private synthetic q2(Lb/g/j/a;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object v0, v0, Lcom/tv91/r/i0;->l:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object v1, v1, Lcom/tv91/r/i0;->k:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object v2, v2, Lcom/tv91/r/i0;->j:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    .line 4
    new-instance v3, Lcom/tv91/features/authentication/d;

    invoke-direct {v3, v0, v1, v2}, Lcom/tv91/features/authentication/d;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    invoke-interface {p1, v3}, Lb/g/j/a;->a(Ljava/lang/Object;)V

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
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object v0, v0, Lcom/tv91/r/i0;->i:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {p1, v0}, Lb/g/j/a;->a(Ljava/lang/Object;)V

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

.method private y2(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object v0, v0, Lcom/tv91/r/i0;->l:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object v0, v0, Lcom/tv91/r/i0;->k:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object v0, v0, Lcom/tv91/r/i0;->j:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 4
    iget-object v0, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object v0, v0, Lcom/tv91/r/i0;->b:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method private z2(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object v0, v0, Lcom/tv91/r/i0;->i:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object v0, v0, Lcom/tv91/r/i0;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setEnabled(Z)V

    return-void
.end method


# virtual methods
.method public J(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tv91/features/authentication/p/y;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {p1}, Lcom/tv91/features/shared/g;->a()V

    return-void
.end method

.method public Q(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/features/authentication/p/y;->z2(Z)V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object v0, v0, Lcom/tv91/r/i0;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public U0(Lb/g/j/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/features/authentication/d;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/tv91/features/authentication/p/q;

    invoke-direct {v0, p0, p1}, Lcom/tv91/features/authentication/p/q;-><init>(Lcom/tv91/features/authentication/p/y;Lb/g/j/a;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object p1, p1, Lcom/tv91/r/i0;->j:Landroid/widget/EditText;

    new-instance v1, Lcom/tv91/features/authentication/p/s;

    invoke-direct {v1, v0}, Lcom/tv91/features/authentication/p/s;-><init>(Ljava/lang/Runnable;)V

    .line 3
    invoke-static {v1}, Lcom/tv91/features/shared/i/f;->a(Lb/g/j/a;)Landroid/widget/TextView$OnEditorActionListener;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 4
    iget-object p1, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object p1, p1, Lcom/tv91/r/i0;->b:Landroid/widget/Button;

    new-instance v1, Lcom/tv91/features/authentication/p/p;

    invoke-direct {v1, v0}, Lcom/tv91/features/authentication/p/p;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public d(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/p/y;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->j(Ljava/lang/Runnable;)V

    return-void
.end method

.method public e2(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object v0, v0, Lcom/tv91/r/i0;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/p/y;->z2(Z)V

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
    new-instance v0, Lcom/tv91/features/authentication/p/u;

    invoke-direct {v0, p0, p1}, Lcom/tv91/features/authentication/p/u;-><init>(Lcom/tv91/features/authentication/p/y;Lb/g/j/a;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object p1, p1, Lcom/tv91/r/i0;->i:Landroid/widget/EditText;

    new-instance v1, Lcom/tv91/features/authentication/p/t;

    invoke-direct {v1, v0}, Lcom/tv91/features/authentication/p/t;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/f;->c(Lb/g/j/a;)Landroid/widget/TextView$OnEditorActionListener;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object p1, p1, Lcom/tv91/r/i0;->c:Landroid/widget/ImageView;

    new-instance v1, Lcom/tv91/features/authentication/p/r;

    invoke-direct {v1, v0}, Lcom/tv91/features/authentication/p/r;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public h2(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tv91/features/authentication/p/y;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {p1}, Lcom/tv91/features/shared/g;->b()V

    .line 2
    iget-object p1, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object p1, p1, Lcom/tv91/r/i0;->i:Landroid/widget/EditText;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object p1, p1, Lcom/tv91/r/i0;->c:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    iget-object p1, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object p1, p1, Lcom/tv91/r/i0;->j:Landroid/widget/EditText;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 5
    iget-object p1, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object p1, p1, Lcom/tv91/r/i0;->b:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public j1(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object v0, v0, Lcom/tv91/r/i0;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/p/y;->y2(Z)V

    return-void
.end method

.method public k1(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/features/authentication/p/y;->z2(Z)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/tv91/features/authentication/p/y;->y2(Z)V

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object v0, v0, Lcom/tv91/r/i0;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public p0()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/features/authentication/p/y;->y2(Z)V

    .line 2
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f1201db

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f1201d5

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->m(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f12004f

    .line 5
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->v(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public synthetic r2(Lb/g/j/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/p/y;->q2(Lb/g/j/a;)V

    return-void
.end method

.method public s(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f1201db

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f1201d4

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->m(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f12004f

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->v(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/widget/e$a;->t(Ljava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public synthetic v2(Lb/g/j/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/p/y;->u2(Lb/g/j/a;)V

    return-void
.end method

.method public x()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/features/authentication/p/y;->y2(Z)V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object v0, v0, Lcom/tv91/r/i0;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public z0()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/features/authentication/p/y;->z2(Z)V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/p/y;->e:Lcom/tv91/r/i0;

    iget-object v0, v0, Lcom/tv91/r/i0;->f:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
