.class final Lcom/tv91/u/c/f/b2;
.super Lcom/tv91/features/shared/f;
.source "MovieView.java"

# interfaces
.implements Lcom/tv91/u/c/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/c/f/b2$e;,
        Lcom/tv91/u/c/f/b2$d;,
        Lcom/tv91/u/c/f/b2$c;,
        Lcom/tv91/u/c/f/b2$b;,
        Lcom/tv91/u/c/f/b2$f;
    }
.end annotation


# instance fields
.field private final e:Lcom/tv91/r/k0;

.field private final f:Lcom/tv91/features/shared/g;

.field private final g:Lcom/tv91/u/c/f/b2$b;

.field private final h:Lcom/tv91/u/c/f/b2$d;

.field private final i:Lcom/tv91/model/Actor;

.field private j:Lcom/tv91/u/c/f/b2$f;

.field private k:Ljava/lang/Runnable;

.field private l:Ljava/lang/Runnable;

.field private m:Ljava/lang/Runnable;

.field private n:Ljava/lang/Runnable;

.field private o:Ljava/lang/Runnable;

.field private p:Ljava/lang/Runnable;

.field private q:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lcom/tv91/r/k0;)V
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/f;-><init>(Lb/r/a;)V

    .line 2
    new-instance v0, Lcom/tv91/model/Actor;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const v3, 0x7f120030

    invoke-virtual {p0, v3, v2}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    invoke-direct {v0, v3, v1, v2, v4}, Lcom/tv91/model/Actor;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/tv91/u/c/f/b2;->i:Lcom/tv91/model/Actor;

    .line 3
    sget-object v0, Lcom/tv91/u/c/f/k1;->a:Lcom/tv91/u/c/f/k1;

    iput-object v0, p0, Lcom/tv91/u/c/f/b2;->k:Ljava/lang/Runnable;

    .line 4
    sget-object v0, Lcom/tv91/u/c/f/n1;->a:Lcom/tv91/u/c/f/n1;

    iput-object v0, p0, Lcom/tv91/u/c/f/b2;->l:Ljava/lang/Runnable;

    .line 5
    sget-object v0, Lcom/tv91/u/c/f/m1;->a:Lcom/tv91/u/c/f/m1;

    iput-object v0, p0, Lcom/tv91/u/c/f/b2;->m:Ljava/lang/Runnable;

    .line 6
    sget-object v0, Lcom/tv91/u/c/f/t1;->a:Lcom/tv91/u/c/f/t1;

    iput-object v0, p0, Lcom/tv91/u/c/f/b2;->n:Ljava/lang/Runnable;

    .line 7
    sget-object v0, Lcom/tv91/u/c/f/l1;->a:Lcom/tv91/u/c/f/l1;

    iput-object v0, p0, Lcom/tv91/u/c/f/b2;->o:Ljava/lang/Runnable;

    .line 8
    sget-object v0, Lcom/tv91/u/c/f/v1;->a:Lcom/tv91/u/c/f/v1;

    iput-object v0, p0, Lcom/tv91/u/c/f/b2;->p:Ljava/lang/Runnable;

    .line 9
    sget-object v0, Lcom/tv91/u/c/f/r1;->a:Lcom/tv91/u/c/f/r1;

    iput-object v0, p0, Lcom/tv91/u/c/f/b2;->q:Ljava/lang/Runnable;

    .line 10
    iput-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    .line 11
    new-instance v0, Lcom/tv91/features/shared/g;

    iget-object v1, p1, Lcom/tv91/r/k0;->D:Lcom/tv91/r/y;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/g;-><init>(Lcom/tv91/r/y;)V

    iput-object v0, p0, Lcom/tv91/u/c/f/b2;->f:Lcom/tv91/features/shared/g;

    .line 12
    new-instance v0, Lcom/tv91/u/c/f/b2$b;

    invoke-direct {v0, v4}, Lcom/tv91/u/c/f/b2$b;-><init>(Lcom/tv91/u/c/f/b2$a;)V

    iput-object v0, p0, Lcom/tv91/u/c/f/b2;->g:Lcom/tv91/u/c/f/b2$b;

    .line 13
    new-instance v1, Lcom/tv91/u/c/f/b2$d;

    invoke-direct {v1, v4}, Lcom/tv91/u/c/f/b2$d;-><init>(Lcom/tv91/u/c/f/b2$a;)V

    iput-object v1, p0, Lcom/tv91/u/c/f/b2;->h:Lcom/tv91/u/c/f/b2$d;

    .line 14
    iget-object v2, p1, Lcom/tv91/r/k0;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    .line 15
    iget-object v0, p1, Lcom/tv91/r/k0;->f:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Lcom/tv91/features/shared/widget/NoScrollGridLayoutManager;

    iget-object v3, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    const/4 v4, 0x3

    invoke-direct {v2, v3, v4}, Lcom/tv91/features/shared/widget/NoScrollGridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 16
    iget-object v0, p1, Lcom/tv91/r/k0;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    .line 17
    iget-object p1, p1, Lcom/tv91/r/k0;->g:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Lcom/tv91/features/shared/widget/NoScrollGridLayoutManager;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/tv91/features/shared/widget/NoScrollGridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    return-void
.end method

.method static synthetic A2(Ljava/lang/Runnable;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method static synthetic B2(Ljava/lang/Runnable;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method static synthetic C2(Ljava/lang/Runnable;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method static synthetic q2(Lcom/tv91/u/c/f/b2;)Lcom/tv91/r/k0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    return-object p0
.end method

.method static synthetic r2()V
    .locals 0

    return-void
.end method

.method static synthetic s2()V
    .locals 0

    return-void
.end method

.method static synthetic t2()V
    .locals 0

    return-void
.end method

.method static synthetic u2()V
    .locals 0

    return-void
.end method

.method static synthetic v2()V
    .locals 0

    return-void
.end method

.method static synthetic w2()V
    .locals 0

    return-void
.end method

.method static synthetic x2()V
    .locals 0

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
.method public C(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->e:Landroid/widget/Button;

    new-instance v1, Lcom/tv91/u/c/f/p1;

    invoke-direct {v1, p1}, Lcom/tv91/u/c/f/p1;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public C0(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/widget/e$a;->n(Ljava/lang/String;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->l:Ljava/lang/Runnable;

    const v1, 0x7f12005c

    .line 3
    invoke-virtual {p1, v1, v0}, Lcom/tv91/features/shared/widget/e$a;->w(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const v0, 0x7f12004d

    .line 4
    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/widget/e$a;->o(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public E(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/c/f/b2;->o:Ljava/lang/Runnable;

    return-void
.end method

.method public E0(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->d:Landroid/widget/Button;

    new-instance v1, Lcom/tv91/u/c/f/s1;

    invoke-direct {v1, p1}, Lcom/tv91/u/c/f/s1;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public F1(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/c/f/b2;->k:Ljava/lang/Runnable;

    return-void
.end method

.method public J0(Lcom/tv91/model/a;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->c:Landroid/widget/Button;

    if-eqz p1, :cond_5

    .line 2
    iget-object v1, p1, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    sget-object v2, Lcom/tv91/model/a$a;->e:Lcom/tv91/model/a$a;

    if-eq v1, v2, :cond_5

    sget-object v2, Lcom/tv91/model/a$a;->h:Lcom/tv91/model/a$a;

    if-ne v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const v1, 0x7f0600f0

    .line 3
    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/f;->l2(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    const v1, 0x7f080062

    .line 4
    invoke-virtual {p0, v1}, Lcom/tv91/features/shared/f;->n2(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 5
    sget-object v1, Lcom/tv91/u/c/f/b2$a;->a:[I

    iget-object p1, p1, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_4

    const/4 p2, 0x2

    if-eq p1, p2, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    if-eq p1, p2, :cond_2

    const/4 p2, 0x5

    if-eq p1, p2, :cond_1

    goto :goto_0

    :cond_1
    const p1, 0x7f120106

    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(I)V

    goto :goto_0

    :cond_2
    const p1, 0x7f120105

    .line 7
    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(I)V

    goto :goto_0

    :cond_3
    const p1, 0x7f120107

    .line 8
    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(I)V

    goto :goto_0

    :cond_4
    const p1, 0x7f120108

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 9
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v1, v2

    invoke-virtual {p0, p1, v1}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void

    :cond_5
    :goto_1
    const p1, 0x7f120104

    .line 10
    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(I)V

    const p1, 0x7f06007a

    .line 11
    invoke-virtual {p0, p1}, Lcom/tv91/features/shared/f;->l2(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setTextColor(I)V

    const p1, 0x7f08005a

    .line 12
    invoke-virtual {p0, p1}, Lcom/tv91/features/shared/f;->n2(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public J1(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/c/f/b2;->l:Ljava/lang/Runnable;

    return-void
.end method

.method public L1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    const v1, 0x7f1200c3

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public M(Lcom/tv91/model/Movie;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->c:Lcom/tv91/z/f;

    iget-object v1, p1, Lcom/tv91/model/Movie;->poster:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/tv91/z/f;->b(Ljava/lang/String;)Lcom/tv91/z/f;

    move-result-object v0

    iget-object v1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v1, v1, Lcom/tv91/r/k0;->k:Landroid/widget/ImageView;

    invoke-interface {v0, v1}, Lcom/tv91/z/f;->g(Landroid/widget/ImageView;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->y:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    iget v3, p1, Lcom/tv91/model/Movie;->id:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const v3, 0x7f120115

    invoke-virtual {p0, v3, v2}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->A:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget v0, p1, Lcom/tv91/model/Movie;->point:I

    if-nez v0, :cond_0

    const v0, 0x7f120118

    new-array v2, v4, [Ljava/lang/Object;

    .line 5
    invoke-virtual {p0, v0, v2}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const v2, 0x7f120117

    new-array v3, v1, [Ljava/lang/Object;

    .line 6
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {p0, v2, v3}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 7
    :goto_0
    iget-object v2, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v2, v2, Lcom/tv91/r/k0;->A:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->C:Landroid/widget/TextView;

    const v2, 0x7f120116

    new-array v1, v1, [Ljava/lang/Object;

    iget v3, p1, Lcom/tv91/model/Movie;->playCount:I

    .line 9
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, Lcom/tv91/utils/g;->d(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v4

    invoke-virtual {p0, v2, v1}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->s:Lcom/tv91/features/shared/widget/DrawableTextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->z:Landroid/widget/TextView;

    iget-object p1, p1, Lcom/tv91/model/Movie;->name:Ljava/lang/String;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->v:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 14
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->w:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 15
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->u:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 16
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->B:Landroid/widget/TextView;

    const v0, 0x7f12011a

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 17
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->e:Landroid/widget/Button;

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 18
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->d:Landroid/widget/Button;

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 19
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->c:Landroid/widget/Button;

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 20
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->g:Lcom/tv91/u/c/f/b2$b;

    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->i:Lcom/tv91/model/Actor;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tv91/u/c/f/b2$b;->x(Ljava/util/List;)V

    return-void
.end method

.method public M1(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/c/f/b2;->p:Ljava/lang/Runnable;

    return-void
.end method

.method public N1(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/model/Movie;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->h:Lcom/tv91/u/c/f/b2$d;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->J(Ljava/util/List;)V

    return-void
.end method

.method public O1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    const v1, 0x7f120103

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public Z(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/c/f/b2;->n:Ljava/lang/Runnable;

    return-void
.end method

.method public Z0(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/c/f/b2;->m:Ljava/lang/Runnable;

    return-void
.end method

.method public a1(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->j:Landroid/widget/ImageView;

    new-instance v1, Lcom/tv91/u/c/f/o1;

    invoke-direct {v1, p1}, Lcom/tv91/u/c/f/o1;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public b(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->i(Ljava/lang/Runnable;)V

    return-void
.end method

.method public c(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/u/c/f/b2$f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/tv91/u/c/f/b2$f;-><init>(Lcom/tv91/u/c/f/b2;Ljava/lang/Runnable;Lcom/tv91/u/c/f/b2$a;)V

    iput-object v0, p0, Lcom/tv91/u/c/f/b2;->j:Lcom/tv91/u/c/f/b2$f;

    .line 2
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->q:Landroid/widget/ScrollView;

    invoke-virtual {p1}, Landroid/widget/ScrollView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->j:Lcom/tv91/u/c/f/b2$f;

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    return-void
.end method

.method public c0(J)V
    .locals 5

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f12005c

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    .line 3
    invoke-static {v2, p1, p2}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    const-wide/32 v3, 0xc800000

    add-long/2addr p1, v3

    .line 4
    invoke-static {v2, p1, p2}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    const p1, 0x7f12000d

    .line 5
    invoke-virtual {p0, p1, v1}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/widget/e$a;->n(Ljava/lang/String;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const p2, 0x7f12004e

    .line 6
    invoke-virtual {p1, p2}, Lcom/tv91/features/shared/widget/e$a;->q(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public d2(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->o:Landroid/widget/ProgressBar;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setVisibility(I)V

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
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->h:Lcom/tv91/u/c/f/b2$d;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    return-void
.end method

.method public f0()V
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f12005d

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f120012

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->m(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    iget-object v1, p0, Lcom/tv91/u/c/f/b2;->k:Ljava/lang/Runnable;

    const v2, 0x7f12005b

    .line 4
    invoke-virtual {v0, v2, v1}, Lcom/tv91/features/shared/widget/e$a;->w(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f120055

    .line 5
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->o(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public g0(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/widget/e;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public g1(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    new-instance v1, Lcom/tv91/u/c/f/q1;

    invoke-direct {v1, p1}, Lcom/tv91/u/c/f/q1;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public h1(IJ)V
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    iget-object p1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    .line 3
    invoke-static {p1, p2, p3}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    const p1, 0x7f120111

    .line 4
    invoke-virtual {p0, p1, v1}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/widget/e$a;->n(Ljava/lang/String;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    iget-object p2, p0, Lcom/tv91/u/c/f/b2;->p:Ljava/lang/Runnable;

    const p3, 0x7f120056

    .line 5
    invoke-virtual {p1, p3, p2}, Lcom/tv91/features/shared/widget/e$a;->w(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    iget-object p2, p0, Lcom/tv91/u/c/f/b2;->o:Ljava/lang/Runnable;

    const p3, 0x7f120052

    .line 6
    invoke-virtual {p1, p3, p2}, Lcom/tv91/features/shared/widget/e$a;->r(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const p2, 0x7f12004d

    .line 7
    invoke-virtual {p1, p2}, Lcom/tv91/features/shared/widget/e$a;->o(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public h2(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->f:Lcom/tv91/features/shared/g;

    invoke-virtual {p1}, Lcom/tv91/features/shared/g;->b()V

    .line 2
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->q:Landroid/widget/ScrollView;

    invoke-virtual {p1}, Landroid/widget/ScrollView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->j:Lcom/tv91/u/c/f/b2$f;

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->j:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->d:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->c:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->g:Lcom/tv91/u/c/f/b2$b;

    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    .line 8
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->h:Lcom/tv91/u/c/f/b2$d;

    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    return-void
.end method

.method public i0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->p:Landroidx/core/widget/ContentLoadingProgressBar;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method

.method public m(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->c:Landroid/widget/Button;

    new-instance v1, Lcom/tv91/u/c/f/u1;

    invoke-direct {v1, p1}, Lcom/tv91/u/c/f/u1;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public m0()V
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

    iget-object v1, p0, Lcom/tv91/u/c/f/b2;->m:Ljava/lang/Runnable;

    const v2, 0x7f120058

    .line 4
    invoke-virtual {v0, v2, v1}, Lcom/tv91/features/shared/widget/e$a;->w(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    iget-object v1, p0, Lcom/tv91/u/c/f/b2;->n:Ljava/lang/Runnable;

    const v2, 0x7f120057

    .line 5
    invoke-virtual {v0, v2, v1}, Lcom/tv91/features/shared/widget/e$a;->r(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f12004d

    .line 6
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->o(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public o1(Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f1200c2

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f1200c1

    .line 3
    invoke-virtual {p0, p1, v1}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/widget/e$a;->n(Ljava/lang/String;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const v0, 0x7f120057

    .line 4
    invoke-virtual {p1, v0, p2}, Lcom/tv91/features/shared/widget/e$a;->w(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const p2, 0x7f12004d

    .line 5
    invoke-virtual {p1, p2}, Lcom/tv91/features/shared/widget/e$a;->o(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public p(Lb/g/j/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/Actor;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->g:Lcom/tv91/u/c/f/b2$b;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/h/b;->H(Lb/g/j/a;)V

    return-void
.end method

.method public q0(Lcom/tv91/model/a;I)V
    .locals 2

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->n:Landroid/widget/ProgressBar;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 2
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->n:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->n:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 5
    iget-object p2, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p2, p2, Lcom/tv91/r/k0;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 6
    iget-object p2, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p2, p2, Lcom/tv91/r/k0;->x:Landroid/widget/TextView;

    iget-object v0, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-object v0, v0, Lcom/tv91/model/Movie;->name:Ljava/lang/String;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    sget-object p2, Lcom/tv91/u/c/f/b2$a;->a:[I

    iget-object p1, p1, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    if-eq p1, p2, :cond_3

    const/4 p2, 0x2

    if-eq p1, p2, :cond_2

    const/4 p2, 0x3

    if-eq p1, p2, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->r:Landroid/widget/TextView;

    const p2, 0x7f120112

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 9
    :cond_2
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->r:Landroid/widget/TextView;

    const p2, 0x7f120114

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 10
    :cond_3
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->r:Landroid/widget/TextView;

    const p2, 0x7f120113

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    :goto_0
    return-void
.end method

.method public q1()V
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

    iget-object v1, p0, Lcom/tv91/u/c/f/b2;->p:Ljava/lang/Runnable;

    const v2, 0x7f120056

    .line 4
    invoke-virtual {v0, v2, v1}, Lcom/tv91/features/shared/widget/e$a;->w(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    const v1, 0x7f12004e

    .line 5
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->q(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    iget-object v1, p0, Lcom/tv91/u/c/f/b2;->n:Ljava/lang/Runnable;

    const v2, 0x7f120110

    .line 6
    invoke-virtual {v0, v2, v1}, Lcom/tv91/features/shared/widget/e$a;->p(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public r1(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f1201a6

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/widget/e$a;->n(Ljava/lang/String;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->q:Ljava/lang/Runnable;

    const v1, 0x7f120051

    .line 4
    invoke-virtual {p1, v1, v0}, Lcom/tv91/features/shared/widget/e$a;->w(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public s1(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/widget/e$a;->n(Ljava/lang/String;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const v0, 0x7f12004e

    .line 3
    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/widget/e$a;->q(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public u(Lcom/tv91/model/Movie;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->c:Lcom/tv91/z/f;

    iget-object v1, p1, Lcom/tv91/model/Movie;->poster:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/tv91/z/f;->b(Ljava/lang/String;)Lcom/tv91/z/f;

    move-result-object v0

    iget-object v1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v1, v1, Lcom/tv91/r/k0;->k:Landroid/widget/ImageView;

    invoke-interface {v0, v1}, Lcom/tv91/z/f;->g(Landroid/widget/ImageView;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->y:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    iget v3, p1, Lcom/tv91/model/Movie;->id:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const v3, 0x7f120115

    invoke-virtual {p0, v3, v2}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->A:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->C:Landroid/widget/TextView;

    new-array v3, v1, [Ljava/lang/Object;

    iget v5, p1, Lcom/tv91/model/Movie;->playCount:I

    .line 5
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v5}, Lcom/tv91/utils/g;->d(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    const v5, 0x7f120116

    invoke-virtual {p0, v5, v3}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->s:Lcom/tv91/features/shared/widget/DrawableTextView;

    iget v3, p1, Lcom/tv91/model/Movie;->favoriteCount:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, Lcom/tv91/utils/g;->d(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->z:Landroid/widget/TextView;

    iget-object v3, p1, Lcom/tv91/model/Movie;->name:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->v:Landroid/widget/TextView;

    new-array v3, v1, [Ljava/lang/Object;

    iget-object v5, p1, Lcom/tv91/model/Movie;->channel:Lcom/tv91/model/Channel;

    iget-object v5, v5, Lcom/tv91/model/b;->value:Ljava/lang/String;

    aput-object v5, v3, v4

    const v5, 0x7f12010c

    invoke-virtual {p0, v5, v3}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->w:Landroid/widget/TextView;

    new-array v3, v1, [Ljava/lang/Object;

    iget-object v5, p1, Lcom/tv91/model/Movie;->createTime:Ljava/lang/String;

    aput-object v5, v3, v4

    const v5, 0x7f12010d

    invoke-virtual {p0, v5, v3}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object v0, p1, Lcom/tv91/model/Movie;->categories:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const v3, 0x7f12010b

    if-nez v0, :cond_1

    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v5, p1, Lcom/tv91/model/Movie;->categories:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tv91/model/Category;

    iget-object v5, v5, Lcom/tv91/model/b;->value:Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    iget-object v5, p1, Lcom/tv91/model/Movie;->categories:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x1

    :goto_0
    if-ge v6, v5, :cond_0

    const-string v7, ", "

    .line 14
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p1, Lcom/tv91/model/Movie;->categories:Ljava/util/List;

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/tv91/model/Category;

    iget-object v7, v7, Lcom/tv91/model/b;->value:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 15
    :cond_0
    iget-object v5, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v5, v5, Lcom/tv91/r/k0;->u:Landroid/widget/TextView;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v4

    invoke-virtual {p0, v3, v1}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->B:Landroid/widget/TextView;

    const v1, 0x7f120119

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 17
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->e:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_1

    .line 18
    :cond_1
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->u:Landroid/widget/TextView;

    new-array v1, v1, [Ljava/lang/Object;

    const-string v5, ""

    aput-object v5, v1, v4

    invoke-virtual {p0, v3, v1}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->B:Landroid/widget/TextView;

    const v1, 0x7f12011a

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 20
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->e:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 21
    :goto_1
    iget-boolean v0, p1, Lcom/tv91/model/Movie;->favorite:Z

    invoke-virtual {p0, v0}, Lcom/tv91/u/c/f/b2;->y1(Z)V

    .line 22
    iget-wide v0, p1, Lcom/tv91/model/Movie;->fileSize:J

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-lez v5, :cond_2

    iget v0, p1, Lcom/tv91/model/Movie;->download:I

    if-gez v0, :cond_3

    .line 23
    :cond_2
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object v0, v0, Lcom/tv91/r/k0;->c:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 24
    :cond_3
    iget-object v0, p1, Lcom/tv91/model/Movie;->actors:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 25
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->g:Lcom/tv91/u/c/f/b2$b;

    iget-object v1, p0, Lcom/tv91/u/c/f/b2;->i:Lcom/tv91/model/Actor;

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tv91/u/c/f/b2$b;->x(Ljava/util/List;)V

    .line 26
    :cond_4
    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->g:Lcom/tv91/u/c/f/b2$b;

    iget-object p1, p1, Lcom/tv91/model/Movie;->actors:Ljava/util/List;

    invoke-virtual {v0, p1}, Lcom/tv91/u/c/f/b2$b;->x(Ljava/util/List;)V

    return-void
.end method

.method public y1(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->d:Landroid/widget/Button;

    const v0, 0x7f12010a

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setText(I)V

    .line 2
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->d:Landroid/widget/Button;

    const v0, 0x7f0600f0

    invoke-virtual {p0, v0}, Lcom/tv91/features/shared/f;->l2(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setTextColor(I)V

    .line 3
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->d:Landroid/widget/Button;

    const v0, 0x7f080060

    invoke-virtual {p0, v0}, Lcom/tv91/features/shared/f;->n2(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->d:Landroid/widget/Button;

    const v0, 0x7f120109

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setText(I)V

    .line 5
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->d:Landroid/widget/Button;

    const v0, 0x7f060033

    invoke-virtual {p0, v0}, Lcom/tv91/features/shared/f;->l2(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setTextColor(I)V

    .line 6
    iget-object p1, p0, Lcom/tv91/u/c/f/b2;->e:Lcom/tv91/r/k0;

    iget-object p1, p1, Lcom/tv91/r/k0;->d:Landroid/widget/Button;

    const v0, 0x7f080059

    invoke-virtual {p0, v0}, Lcom/tv91/features/shared/f;->n2(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void
.end method

.method public z(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f12010f

    invoke-virtual {p0, p1, v1}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/widget/e$a;->n(Ljava/lang/String;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    iget-object v0, p0, Lcom/tv91/u/c/f/b2;->p:Ljava/lang/Runnable;

    const v1, 0x7f120056

    .line 3
    invoke-virtual {p1, v1, v0}, Lcom/tv91/features/shared/widget/e$a;->w(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const v0, 0x7f12004d

    .line 4
    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/widget/e$a;->o(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public z1(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/c/f/b2;->q:Ljava/lang/Runnable;

    return-void
.end method
