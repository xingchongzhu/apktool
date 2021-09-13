.class final Lcom/tv91/u/b/u0;
.super Lcom/tv91/features/shared/f;
.source "DownloadView.java"

# interfaces
.implements Lcom/tv91/u/b/t0;


# instance fields
.field private final e:Lcom/tv91/features/shared/g;

.field private final f:Lcom/tv91/u/b/p0;

.field private final g:Landroid/app/ProgressDialog;

.field private h:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Lcom/tv91/model/a;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Lcom/tv91/model/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/tv91/r/d0;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/f;-><init>(Lb/r/a;)V

    .line 2
    sget-object v0, Lcom/tv91/u/b/n0;->a:Lcom/tv91/u/b/n0;

    iput-object v0, p0, Lcom/tv91/u/b/u0;->h:Lb/g/j/a;

    .line 3
    sget-object v0, Lcom/tv91/u/b/i0;->a:Lcom/tv91/u/b/i0;

    iput-object v0, p0, Lcom/tv91/u/b/u0;->i:Lb/g/j/a;

    .line 4
    new-instance v0, Lcom/tv91/features/shared/g;

    iget-object v1, p1, Lcom/tv91/r/d0;->d:Lcom/tv91/r/y;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/g;-><init>(Lcom/tv91/r/y;)V

    iput-object v0, p0, Lcom/tv91/u/b/u0;->e:Lcom/tv91/features/shared/g;

    .line 5
    new-instance v1, Lcom/tv91/u/b/p0;

    invoke-direct {v1}, Lcom/tv91/u/b/p0;-><init>()V

    iput-object v1, p0, Lcom/tv91/u/b/u0;->f:Lcom/tv91/u/b/p0;

    .line 6
    new-instance v2, Landroid/app/ProgressDialog;

    iget-object v3, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/tv91/u/b/u0;->g:Landroid/app/ProgressDialog;

    const v3, 0x7f120069

    .line 7
    invoke-virtual {v0, v3}, Lcom/tv91/features/shared/g;->p(I)V

    const v3, 0x7f0e0002

    .line 8
    invoke-virtual {v0, v3}, Lcom/tv91/features/shared/g;->c(I)V

    .line 9
    iget-object v0, p1, Lcom/tv91/r/d0;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    .line 10
    iget-object v0, p1, Lcom/tv91/r/d0;->c:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v3, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v1, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 11
    iget-object p1, p1, Lcom/tv91/r/d0;->c:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$l;)V

    const/4 p1, 0x1

    .line 12
    invoke-virtual {v2, p1}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    const/4 p1, 0x0

    .line 13
    invoke-virtual {v2, p1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    return-void
.end method

.method static synthetic q2(Lcom/tv91/model/a;)V
    .locals 0

    return-void
.end method

.method static synthetic r2(Lcom/tv91/model/a;)V
    .locals 0

    return-void
.end method

.method private synthetic s2(Lcom/tv91/model/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/u0;->h:Lb/g/j/a;

    invoke-interface {v0, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic u2(Lcom/tv91/model/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/u0;->i:Lb/g/j/a;

    invoke-interface {v0, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic w2(Lcom/tv91/model/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/u0;->i:Lb/g/j/a;

    invoke-interface {v0, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic y2(Lcom/tv91/model/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/u0;->i:Lb/g/j/a;

    invoke-interface {v0, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public A(Lb/g/j/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/u/b/u0;->i:Lb/g/j/a;

    return-void
.end method

.method public J(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tv91/u/b/u0;->e:Lcom/tv91/features/shared/g;

    invoke-virtual {p1}, Lcom/tv91/features/shared/g;->a()V

    return-void
.end method

.method public K(Lcom/tv91/model/a;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    sget-object v1, Lcom/tv91/model/a$a;->e:Lcom/tv91/model/a$a;

    if-ne v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tv91/u/b/u0;->f:Lcom/tv91/u/b/p0;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->I(Ljava/lang/Object;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/b/u0;->f:Lcom/tv91/u/b/p0;

    invoke-virtual {v0, p1}, Lcom/tv91/u/b/p0;->M(Lcom/tv91/model/a;)I

    move-result v1

    invoke-virtual {v0, v1, p1}, Lcom/tv91/features/shared/h/b;->K(ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public N0()V
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f12005c

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f120010

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->m(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f12004e

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->q(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public O0(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public Y(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/widget/e;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public Y0(Lcom/tv91/model/a;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f12005c

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f12000e

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->m(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/b/k0;

    invoke-direct {v1, p0, p1}, Lcom/tv91/u/b/k0;-><init>(Lcom/tv91/u/b/u0;Lcom/tv91/model/a;)V

    const v2, 0x7f120058

    .line 4
    invoke-virtual {v0, v2, v1}, Lcom/tv91/features/shared/widget/e$a;->w(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/b/j0;

    invoke-direct {v1, p0, p1}, Lcom/tv91/u/b/j0;-><init>(Lcom/tv91/u/b/u0;Lcom/tv91/model/a;)V

    const p1, 0x7f120057

    .line 5
    invoke-virtual {v0, p1, v1}, Lcom/tv91/features/shared/widget/e$a;->r(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const v0, 0x7f12004d

    .line 6
    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/widget/e$a;->o(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public a(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/u0;->g:Landroid/app/ProgressDialog;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/tv91/u/b/u0;->g:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->show()V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/tv91/u/b/u0;->g:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    :goto_0
    return-void
.end method

.method public a2(Lb/g/j/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/u0;->f:Lcom/tv91/u/b/p0;

    invoke-virtual {v0, p1}, Lcom/tv91/u/b/p0;->V(Lb/g/j/a;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/b/u0;->f:Lcom/tv91/u/b/p0;

    invoke-virtual {v0, p1}, Lcom/tv91/u/b/p0;->Z(Lb/g/j/a;)V

    return-void
.end method

.method public b(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/u0;->e:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->i(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b0(Lcom/tv91/model/a;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f12005c

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f12000f

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->m(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f12004e

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->q(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    if-eqz p1, :cond_0

    .line 5
    iget-object v1, p1, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    sget-object v2, Lcom/tv91/model/a$a;->e:Lcom/tv91/model/a$a;

    if-eq v1, v2, :cond_0

    const v1, 0x7f120110

    .line 6
    new-instance v2, Lcom/tv91/u/b/l0;

    invoke-direct {v2, p0, p1}, Lcom/tv91/u/b/l0;-><init>(Lcom/tv91/u/b/u0;Lcom/tv91/model/a;)V

    invoke-virtual {v0, v1, v2}, Lcom/tv91/features/shared/widget/e$a;->p(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public e0(Lb/g/j/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/u/b/u0;->h:Lb/g/j/a;

    return-void
.end method

.method public f1(Lb/g/j/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/u0;->f:Lcom/tv91/u/b/p0;

    invoke-virtual {v0, p1}, Lcom/tv91/u/b/p0;->X(Lb/g/j/a;)V

    return-void
.end method

.method public g0(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public h2(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tv91/u/b/u0;->e:Lcom/tv91/features/shared/g;

    invoke-virtual {p1}, Lcom/tv91/features/shared/g;->b()V

    return-void
.end method

.method public k2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/u0;->f:Lcom/tv91/u/b/p0;

    invoke-virtual {v0}, Lcom/tv91/u/b/p0;->a0()V

    return-void
.end method

.method public l0(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/u0;->g:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const v2, 0x7f120061

    invoke-virtual {p0, v2, v1}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/tv91/u/b/u0;->g:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->show()V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/tv91/u/b/u0;->g:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    :goto_0
    return-void
.end method

.method public l1(Lcom/tv91/model/a;)V
    .locals 4

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f12005f

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-object v2, v2, Lcom/tv91/model/Movie;->name:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0x7f12005e

    .line 3
    invoke-virtual {p0, v2, v1}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->n(Ljava/lang/String;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    new-instance v1, Lcom/tv91/u/b/m0;

    invoke-direct {v1, p0, p1}, Lcom/tv91/u/b/m0;-><init>(Lcom/tv91/u/b/u0;Lcom/tv91/model/a;)V

    const p1, 0x7f12004f

    .line 4
    invoke-virtual {v0, p1, v1}, Lcom/tv91/features/shared/widget/e$a;->w(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const v0, 0x7f12004d

    .line 5
    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/widget/e$a;->o(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public n(Lb/g/j/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/u0;->f:Lcom/tv91/u/b/p0;

    invoke-virtual {v0, p1}, Lcom/tv91/u/b/p0;->Y(Lb/g/j/a;)V

    return-void
.end method

.method public o(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/u0;->e:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->l(Ljava/lang/Runnable;)V

    return-void
.end method

.method public synthetic t2(Lcom/tv91/model/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/u0;->s2(Lcom/tv91/model/a;)V

    return-void
.end method

.method public synthetic v2(Lcom/tv91/model/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/u0;->u2(Lcom/tv91/model/a;)V

    return-void
.end method

.method public x1(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/model/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/u0;->f:Lcom/tv91/u/b/p0;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->J(Ljava/util/List;)V

    return-void
.end method

.method public synthetic x2(Lcom/tv91/model/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/u0;->w2(Lcom/tv91/model/a;)V

    return-void
.end method

.method public synthetic z2(Lcom/tv91/model/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/u0;->y2(Lcom/tv91/model/a;)V

    return-void
.end method
