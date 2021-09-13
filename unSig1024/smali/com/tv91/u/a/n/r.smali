.class final Lcom/tv91/u/a/n/r;
.super Lcom/tv91/u/a/e;
.source "CategoryView.java"

# interfaces
.implements Lcom/tv91/u/a/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/a/n/r$c;,
        Lcom/tv91/u/a/n/r$b;
    }
.end annotation


# instance fields
.field private final g:Lcom/tv91/r/a0;

.field private final h:Lcom/tv91/u/a/n/r$b;


# direct methods
.method constructor <init>(Lcom/tv91/r/a0;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/tv91/u/a/h;->b:Lcom/tv91/u/a/h;

    iget-object v1, p1, Lcom/tv91/r/a0;->c:Landroid/widget/LinearLayout;

    invoke-static {v1}, Lcom/tv91/r/w;->b(Landroid/view/View;)Lcom/tv91/r/w;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/tv91/u/a/e;-><init>(Lcom/tv91/u/a/h;Lcom/tv91/r/w;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/u/a/n/r;->g:Lcom/tv91/r/a0;

    .line 3
    new-instance v0, Lcom/tv91/u/a/n/r$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/tv91/u/a/n/r$b;-><init>(Lcom/tv91/u/a/n/r$a;)V

    iput-object v0, p0, Lcom/tv91/u/a/n/r;->h:Lcom/tv91/u/a/n/r$b;

    .line 4
    iget-object v1, p1, Lcom/tv91/r/a0;->k:Lcom/tv91/r/y;

    iget-object v1, v1, Lcom/tv91/r/y;->b:Landroid/widget/TextView;

    const v2, 0x7f120034

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 5
    iget-object v1, p1, Lcom/tv91/r/a0;->i:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    .line 6
    iget-object v0, p1, Lcom/tv91/r/a0;->i:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    iget-object v2, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 7
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 8
    iget-object v0, p1, Lcom/tv91/r/a0;->i:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 9
    iget-object p1, p1, Lcom/tv91/r/a0;->j:Landroid/widget/SearchView;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lcom/tv91/u/a/n/n;

    invoke-direct {v0, p1}, Lcom/tv91/u/a/n/n;-><init>(Landroid/widget/SearchView;)V

    invoke-virtual {p1, v0}, Landroid/widget/SearchView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method static synthetic t2(Ljava/lang/Runnable;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

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
.method public A1(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/n/r;->g:Lcom/tv91/r/a0;

    iget-object v0, v0, Lcom/tv91/r/a0;->f:Landroid/widget/FrameLayout;

    new-instance v1, Lcom/tv91/u/a/n/m;

    invoke-direct {v1, p1}, Lcom/tv91/u/a/n/m;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public B0(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/model/Category;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/n/r;->h:Lcom/tv91/u/a/n/r$b;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->J(Ljava/util/List;)V

    return-void
.end method

.method public I0(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/n/r;->g:Lcom/tv91/r/a0;

    iget-object v0, v0, Lcom/tv91/r/a0;->g:Landroid/widget/FrameLayout;

    new-instance v1, Lcom/tv91/u/a/n/l;

    invoke-direct {v1, p1}, Lcom/tv91/u/a/n/l;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public L0(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/n/r;->g:Lcom/tv91/r/a0;

    iget-object v0, v0, Lcom/tv91/r/a0;->e:Landroid/widget/FrameLayout;

    new-instance v1, Lcom/tv91/u/a/n/k;

    invoke-direct {v1, p1}, Lcom/tv91/u/a/n/k;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public X0(Lb/g/j/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/Category;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/n/r;->h:Lcom/tv91/u/a/n/r$b;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/n/r;->g:Lcom/tv91/r/a0;

    iget-object v0, v0, Lcom/tv91/r/a0;->h:Landroid/widget/ProgressBar;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method

.method public g0(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/widget/e;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public h0(Lb/g/j/a;)V
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
    iget-object v0, p0, Lcom/tv91/u/a/n/r;->g:Lcom/tv91/r/a0;

    iget-object v0, v0, Lcom/tv91/r/a0;->j:Landroid/widget/SearchView;

    new-instance v1, Lcom/tv91/u/a/n/r$a;

    invoke-direct {v1, p0, p1}, Lcom/tv91/u/a/n/r$a;-><init>(Lcom/tv91/u/a/n/r;Lb/g/j/a;)V

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setOnQueryTextListener(Landroid/widget/SearchView$OnQueryTextListener;)V

    return-void
.end method

.method public h2(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/tv91/u/a/e;->h2(Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/u/a/n/r;->g:Lcom/tv91/r/a0;

    iget-object p1, p1, Lcom/tv91/r/a0;->j:Landroid/widget/SearchView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/SearchView;->setOnQueryTextListener(Landroid/widget/SearchView$OnQueryTextListener;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/u/a/n/r;->h:Lcom/tv91/u/a/n/r$b;

    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    return-void
.end method
