.class final Lcom/tv91/u/c/j/q;
.super Lcom/tv91/features/shared/f;
.source "SearchView.java"

# interfaces
.implements Lcom/tv91/u/c/e$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/c/j/q$c;,
        Lcom/tv91/u/c/j/q$b;
    }
.end annotation


# instance fields
.field private final e:Lcom/tv91/r/l0;

.field private final f:Lcom/tv91/features/shared/g;

.field private final g:Lcom/tv91/u/c/j/q$b;


# direct methods
.method constructor <init>(Lcom/tv91/r/l0;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/f;-><init>(Lb/r/a;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/u/c/j/q;->e:Lcom/tv91/r/l0;

    .line 3
    new-instance v0, Lcom/tv91/features/shared/g;

    iget-object v1, p1, Lcom/tv91/r/l0;->h:Lcom/tv91/r/y;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/g;-><init>(Lcom/tv91/r/y;)V

    iput-object v0, p0, Lcom/tv91/u/c/j/q;->f:Lcom/tv91/features/shared/g;

    .line 4
    new-instance v1, Lcom/tv91/u/c/j/q$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/tv91/u/c/j/q$b;-><init>(Lcom/tv91/u/c/j/q$a;)V

    iput-object v1, p0, Lcom/tv91/u/c/j/q;->g:Lcom/tv91/u/c/j/q$b;

    const v2, 0x7f1201df

    .line 5
    invoke-virtual {v0, v2}, Lcom/tv91/features/shared/g;->p(I)V

    const v2, 0x7f0e0001

    .line 6
    invoke-virtual {v0, v2}, Lcom/tv91/features/shared/g;->c(I)V

    .line 7
    iget-object v0, p1, Lcom/tv91/r/l0;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    .line 8
    iget-object p1, p1, Lcom/tv91/r/l0;->d:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    return-void
.end method

.method private synthetic q2(Lb/g/j/a;Landroid/view/View;Z)V
    .locals 0

    if-nez p3, :cond_0

    .line 1
    invoke-virtual {p0, p2}, Lcom/tv91/features/shared/f;->p2(Landroid/view/View;)V

    .line 2
    iget-object p2, p0, Lcom/tv91/u/c/j/q;->e:Lcom/tv91/r/l0;

    iget-object p2, p2, Lcom/tv91/r/l0;->e:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-interface {p1, p2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method static synthetic s2(Lb/g/j/a;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p0, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public J(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/j/q;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {v0}, Lcom/tv91/features/shared/g;->a()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/j/q;->e:Lcom/tv91/r/l0;

    iget-object v0, v0, Lcom/tv91/r/l0;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/h/c;->d(Landroidx/recyclerview/widget/RecyclerView;Landroid/os/Bundle;)V

    return-void
.end method

.method public O(Ljava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/model/Movie;",
            ">;Z)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    .line 1
    iget-object p2, p0, Lcom/tv91/u/c/j/q;->g:Lcom/tv91/u/c/j/q$b;

    invoke-virtual {p2, p1}, Lcom/tv91/features/shared/h/b;->J(Ljava/util/List;)V

    goto :goto_0

    .line 2
    :cond_0
    iget-object p2, p0, Lcom/tv91/u/c/j/q;->g:Lcom/tv91/u/c/j/q$b;

    invoke-virtual {p2, p1}, Lcom/tv91/features/shared/h/b;->x(Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public Y1(Lb/g/j/a;)V
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
    iget-object v0, p0, Lcom/tv91/u/c/j/q;->e:Lcom/tv91/r/l0;

    iget-object v0, v0, Lcom/tv91/r/l0;->e:Landroid/widget/EditText;

    new-instance v1, Lcom/tv91/u/c/j/j;

    invoke-direct {v1, p0, p1}, Lcom/tv91/u/c/j/j;-><init>(Lcom/tv91/u/c/j/q;Lb/g/j/a;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/j/q;->e:Lcom/tv91/r/l0;

    iget-object v0, v0, Lcom/tv91/r/l0;->e:Landroid/widget/EditText;

    new-instance v1, Lcom/tv91/u/c/j/k;

    invoke-direct {v1, p1}, Lcom/tv91/u/c/j/k;-><init>(Lb/g/j/a;)V

    .line 3
    invoke-static {v1}, Lcom/tv91/features/shared/i/f;->b(Lb/g/j/a;)Landroid/widget/TextView$OnEditorActionListener;

    move-result-object p1

    .line 4
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/j/q;->e:Lcom/tv91/r/l0;

    iget-object v0, v0, Lcom/tv91/r/l0;->c:Landroid/widget/ProgressBar;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method

.method public c(Ljava/lang/Runnable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/j/q;->e:Lcom/tv91/r/l0;

    iget-object v0, v0, Lcom/tv91/r/l0;->d:Landroidx/recyclerview/widget/RecyclerView;

    sget-object v1, Lcom/tv91/features/shared/i/i;->d:Lcom/tv91/features/shared/i/i;

    const/4 v2, 0x6

    .line 2
    invoke-virtual {v1, v2, p1}, Lcom/tv91/features/shared/i/i;->c(ILjava/lang/Runnable;)Landroidx/recyclerview/widget/RecyclerView$t;

    move-result-object p1

    .line 3
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->k(Landroidx/recyclerview/widget/RecyclerView$t;)V

    return-void
.end method

.method public d(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/j/q;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->j(Ljava/lang/Runnable;)V

    return-void
.end method

.method public e(Lb/g/j/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/Movie;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/j/q;->g:Lcom/tv91/u/c/j/q$b;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

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
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/j/q;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {v0}, Lcom/tv91/features/shared/g;->b()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/j/q;->e:Lcom/tv91/r/l0;

    iget-object v0, v0, Lcom/tv91/r/l0;->e:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/c/j/q;->e:Lcom/tv91/r/l0;

    iget-object v0, v0, Lcom/tv91/r/l0;->e:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/c/j/q;->e:Lcom/tv91/r/l0;

    iget-object v0, v0, Lcom/tv91/r/l0;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/h/c;->f(Landroidx/recyclerview/widget/RecyclerView;Landroid/os/Bundle;)V

    .line 5
    iget-object p1, p0, Lcom/tv91/u/c/j/q;->g:Lcom/tv91/u/c/j/q$b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/h/b;->z(Z)V

    .line 6
    iget-object p1, p0, Lcom/tv91/u/c/j/q;->g:Lcom/tv91/u/c/j/q$b;

    invoke-virtual {p1, v1}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    .line 7
    iget-object p1, p0, Lcom/tv91/u/c/j/q;->e:Lcom/tv91/r/l0;

    iget-object p1, p1, Lcom/tv91/r/l0;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->t()V

    return-void
.end method

.method public synthetic r2(Lb/g/j/a;Landroid/view/View;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/tv91/u/c/j/q;->q2(Lb/g/j/a;Landroid/view/View;Z)V

    return-void
.end method
