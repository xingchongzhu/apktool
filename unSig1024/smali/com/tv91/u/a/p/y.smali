.class final Lcom/tv91/u/a/p/y;
.super Lcom/tv91/u/a/e;
.source "ProfileView.java"

# interfaces
.implements Lcom/tv91/u/a/k;


# instance fields
.field private final g:Lcom/tv91/r/o0;

.field private final h:Lcom/tv91/features/shared/g;

.field private final i:Lcom/tv91/u/a/p/u;


# direct methods
.method constructor <init>(Lcom/tv91/r/o0;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/tv91/u/a/h;->e:Lcom/tv91/u/a/h;

    iget-object v1, p1, Lcom/tv91/r/o0;->c:Landroid/widget/LinearLayout;

    invoke-static {v1}, Lcom/tv91/r/w;->b(Landroid/view/View;)Lcom/tv91/r/w;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/tv91/u/a/e;-><init>(Lcom/tv91/u/a/h;Lcom/tv91/r/w;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    .line 3
    new-instance v0, Lcom/tv91/features/shared/g;

    iget-object v1, p1, Lcom/tv91/r/o0;->q:Lcom/tv91/r/y;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/g;-><init>(Lcom/tv91/r/y;)V

    iput-object v0, p0, Lcom/tv91/u/a/p/y;->h:Lcom/tv91/features/shared/g;

    .line 4
    new-instance v1, Lcom/tv91/u/a/p/u;

    iget-object v2, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/tv91/u/a/p/u;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/tv91/u/a/p/y;->i:Lcom/tv91/u/a/p/u;

    const v2, 0x7f120186

    .line 5
    invoke-virtual {v0, v2}, Lcom/tv91/features/shared/g;->p(I)V

    const v2, 0x7f0e0004

    .line 6
    invoke-virtual {v0, v2}, Lcom/tv91/features/shared/g;->c(I)V

    .line 7
    iget-object p1, p1, Lcom/tv91/r/o0;->h:Landroid/widget/ListView;

    invoke-virtual {p1, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

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


# virtual methods
.method public B(Lb/g/j/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/u/a/j;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/p/y;->i:Lcom/tv91/u/a/p/u;

    invoke-virtual {v0, p1}, Lcom/tv91/u/a/p/u;->d(Lb/g/j/a;)V

    return-void
.end method

.method public J(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tv91/u/a/p/y;->h:Lcom/tv91/features/shared/g;

    invoke-virtual {p1}, Lcom/tv91/features/shared/g;->a()V

    return-void
.end method

.method public U(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f12005d

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f120174

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->m(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f120055

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->o(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f12005b

    .line 5
    invoke-virtual {v0, v1, p1}, Lcom/tv91/features/shared/widget/e$a;->w(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public a(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    iget-object v0, v0, Lcom/tv91/r/o0;->i:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-eqz p1, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    const/16 v3, 0x8

    :goto_0
    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    iget-object v0, v0, Lcom/tv91/r/o0;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz p1, :cond_1

    const/16 v3, 0x8

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    iget-object v0, v0, Lcom/tv91/r/o0;->h:Landroid/widget/ListView;

    if-eqz p1, :cond_2

    const/16 v1, 0x8

    :cond_2
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    return-void
.end method

.method public f2(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    iget-object v0, v0, Lcom/tv91/r/o0;->j:Lcom/tv91/features/shared/widget/DrawableTextView;

    new-instance v1, Lcom/tv91/u/a/p/r;

    invoke-direct {v1, p1}, Lcom/tv91/u/a/p/r;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public g0(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/widget/e;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public h(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/p/y;->h:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->n(Ljava/lang/Runnable;)V

    return-void
.end method

.method public h2(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/tv91/u/a/e;->h2(Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/u/a/p/y;->h:Lcom/tv91/features/shared/g;

    invoke-virtual {p1}, Lcom/tv91/features/shared/g;->b()V

    .line 3
    iget-object p1, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    iget-object p1, p1, Lcom/tv91/r/o0;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    iget-object p1, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    iget-object p1, p1, Lcom/tv91/r/o0;->j:Lcom/tv91/features/shared/widget/DrawableTextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    iget-object p1, p0, Lcom/tv91/u/a/p/y;->i:Lcom/tv91/u/a/p/u;

    invoke-virtual {p1, v0}, Lcom/tv91/u/a/p/u;->d(Lb/g/j/a;)V

    return-void
.end method

.method public i(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/p/y;->h:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->k(Ljava/lang/Runnable;)V

    return-void
.end method

.method public v0(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    iget-object v0, v0, Lcom/tv91/r/o0;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    new-instance v1, Lcom/tv91/u/a/p/s;

    invoke-direct {v1, p1}, Lcom/tv91/u/a/p/s;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public y0(Lcom/tv91/model/User;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tv91/model/User;",
            "Ljava/util/List<",
            "Lcom/tv91/u/a/j;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    iget-object p1, p1, Lcom/tv91/r/o0;->e:Landroid/widget/ImageView;

    const v3, 0x7f0800f0

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2
    iget-object p1, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    iget-object p1, p1, Lcom/tv91/r/o0;->l:Landroid/widget/TextView;

    const/4 v3, 0x0

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    iget-object p1, p1, Lcom/tv91/r/o0;->m:Landroid/widget/TextView;

    const v3, 0x7f120171

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(I)V

    .line 4
    iget-object p1, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    iget-object p1, p1, Lcom/tv91/r/o0;->n:Landroid/widget/TextView;

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(I)V

    .line 5
    iget-object p1, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    iget-object p1, p1, Lcom/tv91/r/o0;->j:Lcom/tv91/features/shared/widget/DrawableTextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 6
    iget-object p1, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    iget-object p1, p1, Lcom/tv91/r/o0;->d:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 7
    iget-object p1, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    iget-object p1, p1, Lcom/tv91/r/o0;->k:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 8
    :cond_0
    iget-object v3, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    iget-object v3, v3, Lcom/tv91/r/o0;->e:Landroid/widget/ImageView;

    const v4, 0x7f080118

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 9
    iget-object v3, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    iget-object v3, v3, Lcom/tv91/r/o0;->l:Landroid/widget/TextView;

    new-array v4, v0, [Ljava/lang/Object;

    iget-object v5, p1, Lcom/tv91/model/User;->id:Ljava/lang/String;

    aput-object v5, v4, v2

    const-string v5, "(%s)"

    invoke-static {v5, v4}, Lcom/tv91/utils/g;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object v3, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    iget-object v3, v3, Lcom/tv91/r/o0;->m:Landroid/widget/TextView;

    iget-object v4, p1, Lcom/tv91/model/User;->nickname:Ljava/lang/String;

    invoke-static {v4}, Lcom/tv91/utils/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object v3, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    iget-object v3, v3, Lcom/tv91/r/o0;->n:Landroid/widget/TextView;

    const v4, 0x7f120183

    new-array v5, v0, [Ljava/lang/Object;

    iget v6, p1, Lcom/tv91/model/User;->point:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v2

    invoke-virtual {p0, v4, v5}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object v3, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    iget-object v3, v3, Lcom/tv91/r/o0;->j:Lcom/tv91/features/shared/widget/DrawableTextView;

    iget v4, p1, Lcom/tv91/model/User;->point:I

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 13
    iget-object v1, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    iget-object v1, v1, Lcom/tv91/r/o0;->d:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 14
    iget-object v1, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    iget-object v1, v1, Lcom/tv91/r/o0;->k:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 15
    iget-object v1, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    iget-object v1, v1, Lcom/tv91/r/o0;->k:Landroid/widget/TextView;

    iget-object p1, p1, Lcom/tv91/model/User;->account:Ljava/lang/String;

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    :goto_1
    iget-object p1, p0, Lcom/tv91/u/a/p/y;->g:Lcom/tv91/r/o0;

    iget-object p1, p1, Lcom/tv91/r/o0;->o:Landroid/widget/TextView;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "3.3"

    aput-object v3, v1, v2

    const/16 v2, 0x27

    .line 17
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v0

    const-string v0, "%s-%d"

    invoke-static {v0, v1}, Lcom/tv91/utils/g;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 18
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    iget-object p1, p0, Lcom/tv91/u/a/p/y;->i:Lcom/tv91/u/a/p/u;

    invoke-virtual {p1, p2}, Lcom/tv91/u/a/p/u;->e(Ljava/util/List;)V

    return-void
.end method
