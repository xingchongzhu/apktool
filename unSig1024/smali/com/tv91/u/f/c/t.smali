.class final Lcom/tv91/u/f/c/t;
.super Lcom/tv91/features/shared/f;
.source "FeedbackView.java"

# interfaces
.implements Lcom/tv91/u/f/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/f/c/t$c;,
        Lcom/tv91/u/f/c/t$b;
    }
.end annotation


# instance fields
.field private final e:Lcom/tv91/r/f0;

.field private final f:Lcom/tv91/features/shared/g;

.field private final g:Lcom/tv91/u/f/c/t$b;


# direct methods
.method constructor <init>(Lcom/tv91/r/f0;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/f;-><init>(Lb/r/a;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/u/f/c/t;->e:Lcom/tv91/r/f0;

    .line 3
    new-instance v0, Lcom/tv91/features/shared/g;

    iget-object v1, p1, Lcom/tv91/r/f0;->h:Lcom/tv91/r/y;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/g;-><init>(Lcom/tv91/r/y;)V

    iput-object v0, p0, Lcom/tv91/u/f/c/t;->f:Lcom/tv91/features/shared/g;

    .line 4
    new-instance v1, Lcom/tv91/u/f/c/t$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/tv91/u/f/c/t$b;-><init>(Lcom/tv91/u/f/c/t$a;)V

    iput-object v1, p0, Lcom/tv91/u/f/c/t;->g:Lcom/tv91/u/f/c/t$b;

    const v2, 0x7f12004c

    .line 5
    invoke-virtual {v0, v2}, Lcom/tv91/features/shared/g;->p(I)V

    const/high16 v2, 0x7f0e0000

    .line 6
    invoke-virtual {v0, v2}, Lcom/tv91/features/shared/g;->c(I)V

    .line 7
    iget-object v0, p1, Lcom/tv91/r/f0;->e:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    .line 8
    iget-object v0, p1, Lcom/tv91/r/f0;->e:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v2, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 9
    iget-object p1, p1, Lcom/tv91/r/f0;->e:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Lcom/tv91/u/f/c/t;->q2()Landroidx/recyclerview/widget/RecyclerView$n;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->h(Landroidx/recyclerview/widget/RecyclerView$n;)V

    return-void
.end method

.method private q2()Landroidx/recyclerview/widget/RecyclerView$n;
    .locals 3

    .line 1
    new-instance v0, Landroidx/recyclerview/widget/d;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/d;-><init>(Landroid/content/Context;I)V

    const v1, 0x7f080122

    .line 2
    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/f;->n2(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/d;->l(Landroid/graphics/drawable/Drawable;)V

    return-object v0
.end method

.method static synthetic r2(Ljava/lang/Runnable;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method


# virtual methods
.method public J(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/c/t;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {v0}, Lcom/tv91/features/shared/g;->a()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/f/c/t;->e:Lcom/tv91/r/f0;

    iget-object v0, v0, Lcom/tv91/r/f0;->e:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/h/c;->d(Landroidx/recyclerview/widget/RecyclerView;Landroid/os/Bundle;)V

    return-void
.end method

.method public V(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/c/t;->e:Lcom/tv91/r/f0;

    iget-object v0, v0, Lcom/tv91/r/f0;->g:Lcom/tv91/features/shared/widget/DrawableTextView;

    new-instance v1, Lcom/tv91/u/f/c/m;

    invoke-direct {v1, p1}, Lcom/tv91/u/f/c/m;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public a(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/c/t;->e:Lcom/tv91/r/f0;

    iget-object v0, v0, Lcom/tv91/r/f0;->d:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    if-eqz p1, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/16 v2, 0x8

    :goto_0
    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    if-eqz p1, :cond_1

    .line 2
    iget-object p1, p0, Lcom/tv91/u/f/c/t;->g:Lcom/tv91/u/f/c/t$b;

    invoke-virtual {p1}, Lcom/tv91/features/shared/h/b;->D()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/tv91/u/f/c/t;->e:Lcom/tv91/r/f0;

    iget-object p1, p1, Lcom/tv91/r/f0;->c:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object p1, p0, Lcom/tv91/u/f/c/t;->e:Lcom/tv91/r/f0;

    iget-object p1, p1, Lcom/tv91/r/f0;->f:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public b(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/c/t;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->i(Ljava/lang/Runnable;)V

    return-void
.end method

.method public c(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/c/t;->e:Lcom/tv91/r/f0;

    iget-object v0, v0, Lcom/tv91/r/f0;->e:Landroidx/recyclerview/widget/RecyclerView;

    sget-object v1, Lcom/tv91/features/shared/i/i;->d:Lcom/tv91/features/shared/i/i;

    invoke-virtual {v1, p1}, Lcom/tv91/features/shared/i/i;->d(Ljava/lang/Runnable;)Landroidx/recyclerview/widget/RecyclerView$t;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->k(Landroidx/recyclerview/widget/RecyclerView$t;)V

    return-void
.end method

.method public d1(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/c/t;->e:Lcom/tv91/r/f0;

    iget-object v0, v0, Lcom/tv91/r/f0;->g:Lcom/tv91/features/shared/widget/DrawableTextView;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

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
    iget-object v0, p0, Lcom/tv91/u/f/c/t;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {v0}, Lcom/tv91/features/shared/g;->b()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/f/c/t;->e:Lcom/tv91/r/f0;

    iget-object v0, v0, Lcom/tv91/r/f0;->e:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/h/c;->f(Landroidx/recyclerview/widget/RecyclerView;Landroid/os/Bundle;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/u/f/c/t;->g:Lcom/tv91/u/f/c/t$b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/h/b;->z(Z)V

    .line 4
    iget-object p1, p0, Lcom/tv91/u/f/c/t;->g:Lcom/tv91/u/f/c/t$b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    .line 5
    iget-object p1, p0, Lcom/tv91/u/f/c/t;->e:Lcom/tv91/r/f0;

    iget-object p1, p1, Lcom/tv91/r/f0;->e:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->t()V

    .line 6
    iget-object p1, p0, Lcom/tv91/u/f/c/t;->e:Lcom/tv91/r/f0;

    iget-object p1, p1, Lcom/tv91/r/f0;->g:Lcom/tv91/features/shared/widget/DrawableTextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public k0(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/model/Feedback;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/tv91/u/f/c/t;->e:Lcom/tv91/r/f0;

    iget-object p1, p1, Lcom/tv91/r/f0;->f:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/f/c/t;->e:Lcom/tv91/r/f0;

    iget-object v0, v0, Lcom/tv91/r/f0;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/f/c/t;->g:Lcom/tv91/u/f/c/t$b;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->x(Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public t0(Lb/g/j/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/Feedback;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/c/t;->g:Lcom/tv91/u/f/c/t$b;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    return-void
.end method

.method public w0(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/f/c/t;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->h(Ljava/lang/Runnable;)V

    return-void
.end method
