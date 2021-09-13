.class final Lcom/tv91/u/f/e/r;
.super Lcom/tv91/features/shared/f;
.source "SendFeedbackView.java"

# interfaces
.implements Lcom/tv91/u/f/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/f/e/r$b;
    }
.end annotation


# instance fields
.field private final e:Lcom/tv91/r/h0;

.field private final f:Lcom/tv91/features/shared/g;

.field private final g:Lcom/tv91/u/f/e/r$b;

.field private final h:Landroid/app/ProgressDialog;


# direct methods
.method constructor <init>(Lcom/tv91/r/h0;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/f;-><init>(Lb/r/a;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/u/f/e/r;->e:Lcom/tv91/r/h0;

    .line 3
    new-instance v0, Lcom/tv91/features/shared/g;

    iget-object v1, p1, Lcom/tv91/r/h0;->h:Lcom/tv91/r/y;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/g;-><init>(Lcom/tv91/r/y;)V

    iput-object v0, p0, Lcom/tv91/u/f/e/r;->f:Lcom/tv91/features/shared/g;

    .line 4
    new-instance v1, Lcom/tv91/u/f/e/r$b;

    iget-object v2, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/tv91/u/f/e/r$b;-><init>(Landroid/content/Context;Lcom/tv91/u/f/e/r$a;)V

    iput-object v1, p0, Lcom/tv91/u/f/e/r;->g:Lcom/tv91/u/f/e/r$b;

    .line 5
    new-instance v2, Landroid/app/ProgressDialog;

    iget-object v3, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/tv91/u/f/e/r;->h:Landroid/app/ProgressDialog;

    const v2, 0x7f1201d1

    .line 6
    invoke-virtual {v0, v2}, Lcom/tv91/features/shared/g;->p(I)V

    const v2, 0x7f0e0001

    .line 7
    invoke-virtual {v0, v2}, Lcom/tv91/features/shared/g;->c(I)V

    .line 8
    iget-object p1, p1, Lcom/tv91/r/h0;->e:Landroid/widget/Spinner;

    invoke-virtual {p1, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    return-void
.end method

.method static synthetic q2(Lcom/tv91/u/f/e/r;)Lcom/tv91/u/f/e/r$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/u/f/e/r;->g:Lcom/tv91/u/f/e/r$b;

    return-object p0
.end method

.method private synthetic r2(Lb/g/j/a;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/tv91/u/f/e/r;->e:Lcom/tv91/r/h0;

    iget-object p2, p2, Lcom/tv91/r/h0;->f:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p2

    .line 2
    invoke-interface {p1, p2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public J(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tv91/u/f/e/r;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {p1}, Lcom/tv91/features/shared/g;->a()V

    return-void
.end method

.method public a(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/e/r;->e:Lcom/tv91/r/h0;

    iget-object v0, v0, Lcom/tv91/r/h0;->b:Landroid/widget/Button;

    xor-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/tv91/u/f/e/r;->h:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->show()V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/tv91/u/f/e/r;->h:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    :goto_0
    return-void
.end method

.method public a0(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/model/FeedbackType;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/e/r;->g:Lcom/tv91/u/f/e/r$b;

    invoke-static {v0, p1}, Lcom/tv91/u/f/e/r$b;->a(Lcom/tv91/u/f/e/r$b;Ljava/util/List;)V

    return-void
.end method

.method public d(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/e/r;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->j(Ljava/lang/Runnable;)V

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
    iget-object v0, p0, Lcom/tv91/u/f/e/r;->e:Lcom/tv91/r/h0;

    iget-object v0, v0, Lcom/tv91/r/h0;->b:Landroid/widget/Button;

    new-instance v1, Lcom/tv91/u/f/e/m;

    invoke-direct {v1, p0, p1}, Lcom/tv91/u/f/e/m;-><init>(Lcom/tv91/u/f/e/r;Lb/g/j/a;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

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
    iget-object p1, p0, Lcom/tv91/u/f/e/r;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {p1}, Lcom/tv91/features/shared/g;->b()V

    .line 2
    iget-object p1, p0, Lcom/tv91/u/f/e/r;->e:Lcom/tv91/r/h0;

    iget-object p1, p1, Lcom/tv91/r/h0;->e:Landroid/widget/Spinner;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/u/f/e/r;->e:Lcom/tv91/r/h0;

    iget-object p1, p1, Lcom/tv91/r/h0;->b:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public n1(Lb/g/j/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/FeedbackType;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/e/r;->e:Lcom/tv91/r/h0;

    iget-object v0, v0, Lcom/tv91/r/h0;->e:Landroid/widget/Spinner;

    new-instance v1, Lcom/tv91/u/f/e/r$a;

    invoke-direct {v1, p0, p1}, Lcom/tv91/u/f/e/r$a;-><init>(Lcom/tv91/u/f/e/r;Lb/g/j/a;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void
.end method

.method public synthetic s2(Lb/g/j/a;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/f/e/r;->r2(Lb/g/j/a;Landroid/view/View;)V

    return-void
.end method
