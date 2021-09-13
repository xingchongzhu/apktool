.class final Lcom/google/android/exoplayer2/ui/j$b;
.super Ljava/lang/Object;
.source "PlayerControlView.java"

# interfaces
.implements Lc/a/a/a/l1$a;
.implements Lcom/google/android/exoplayer2/ui/u$a;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/ui/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/exoplayer2/ui/j;


# direct methods
.method private constructor <init>(Lcom/google/android/exoplayer2/ui/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/exoplayer2/ui/j;Lcom/google/android/exoplayer2/ui/j$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/ui/j$b;-><init>(Lcom/google/android/exoplayer2/ui/j;)V

    return-void
.end method


# virtual methods
.method public synthetic D(Lc/a/a/a/x1;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc/a/a/a/k1;->s(Lc/a/a/a/l1$a;Lc/a/a/a/x1;I)V

    return-void
.end method

.method public synthetic G(I)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->j(Lc/a/a/a/l1$a;I)V

    return-void
.end method

.method public synthetic H(ZI)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc/a/a/a/k1;->h(Lc/a/a/a/l1$a;ZI)V

    return-void
.end method

.method public synthetic L(Lc/a/a/a/j2/q0;Lc/a/a/a/l2/l;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc/a/a/a/k1;->u(Lc/a/a/a/l1$a;Lc/a/a/a/j2/q0;Lc/a/a/a/l2/l;)V

    return-void
.end method

.method public synthetic P(Z)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->q(Lc/a/a/a/l1$a;Z)V

    return-void
.end method

.method public R(Lc/a/a/a/l1;Lc/a/a/a/l1$b;)V
    .locals 1

    const/4 p1, 0x2

    new-array v0, p1, [I

    .line 1
    fill-array-data v0, :array_0

    invoke-virtual {p2, v0}, Lc/a/a/a/l1$b;->c([I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {v0}, Lcom/google/android/exoplayer2/ui/j;->v(Lcom/google/android/exoplayer2/ui/j;)V

    :cond_0
    const/4 v0, 0x3

    new-array v0, v0, [I

    .line 3
    fill-array-data v0, :array_1

    invoke-virtual {p2, v0}, Lc/a/a/a/l1$b;->c([I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {v0}, Lcom/google/android/exoplayer2/ui/j;->w(Lcom/google/android/exoplayer2/ui/j;)V

    :cond_1
    const/16 v0, 0x9

    .line 5
    invoke-virtual {p2, v0}, Lc/a/a/a/l1$b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {v0}, Lcom/google/android/exoplayer2/ui/j;->x(Lcom/google/android/exoplayer2/ui/j;)V

    :cond_2
    const/16 v0, 0xa

    .line 7
    invoke-virtual {p2, v0}, Lc/a/a/a/l1$b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 8
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {v0}, Lcom/google/android/exoplayer2/ui/j;->a(Lcom/google/android/exoplayer2/ui/j;)V

    :cond_3
    const/4 v0, 0x4

    new-array v0, v0, [I

    .line 9
    fill-array-data v0, :array_2

    invoke-virtual {p2, v0}, Lc/a/a/a/l1$b;->c([I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 10
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {v0}, Lcom/google/android/exoplayer2/ui/j;->c(Lcom/google/android/exoplayer2/ui/j;)V

    :cond_4
    new-array p1, p1, [I

    .line 11
    fill-array-data p1, :array_3

    invoke-virtual {p2, p1}, Lc/a/a/a/l1$b;->c([I)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 12
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/j;->d(Lcom/google/android/exoplayer2/ui/j;)V

    :cond_5
    return-void

    :array_0
    .array-data 4
        0x5
        0x6
    .end array-data

    :array_1
    .array-data 4
        0x5
        0x6
        0x8
    .end array-data

    :array_2
    .array-data 4
        0x9
        0xa
        0xc
        0x0
    .end array-data

    :array_3
    .array-data 4
        0xc
        0x0
    .end array-data
.end method

.method public synthetic S(Z)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->b(Lc/a/a/a/l1$a;Z)V

    return-void
.end method

.method public synthetic W(Z)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->c(Lc/a/a/a/l1$a;Z)V

    return-void
.end method

.method public synthetic Z(Z)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->e(Lc/a/a/a/l1$a;Z)V

    return-void
.end method

.method public a(Lcom/google/android/exoplayer2/ui/u;J)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/j;->l(Lcom/google/android/exoplayer2/ui/j;)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/j;->l(Lcom/google/android/exoplayer2/ui/j;)Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {v0}, Lcom/google/android/exoplayer2/ui/j;->r(Lcom/google/android/exoplayer2/ui/j;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/j;->s(Lcom/google/android/exoplayer2/ui/j;)Ljava/util/Formatter;

    move-result-object v1

    invoke-static {v0, v1, p2, p3}, Lc/a/a/a/m2/m0;->a0(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public b(Lcom/google/android/exoplayer2/ui/u;J)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/google/android/exoplayer2/ui/j;->b(Lcom/google/android/exoplayer2/ui/j;Z)Z

    .line 2
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/j;->l(Lcom/google/android/exoplayer2/ui/j;)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/j;->l(Lcom/google/android/exoplayer2/ui/j;)Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {v0}, Lcom/google/android/exoplayer2/ui/j;->r(Lcom/google/android/exoplayer2/ui/j;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/j;->s(Lcom/google/android/exoplayer2/ui/j;)Ljava/util/Formatter;

    move-result-object v1

    invoke-static {v0, v1, p2, p3}, Lc/a/a/a/m2/m0;->a0(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public synthetic c(I)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->o(Lc/a/a/a/l1$a;I)V

    return-void
.end method

.method public d(Lcom/google/android/exoplayer2/ui/u;JZ)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/exoplayer2/ui/j;->b(Lcom/google/android/exoplayer2/ui/j;Z)Z

    if-nez p4, :cond_0

    .line 2
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/j;->t(Lcom/google/android/exoplayer2/ui/j;)Lc/a/a/a/l1;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/j;->t(Lcom/google/android/exoplayer2/ui/j;)Lc/a/a/a/l1;

    move-result-object p4

    invoke-static {p1, p4, p2, p3}, Lcom/google/android/exoplayer2/ui/j;->u(Lcom/google/android/exoplayer2/ui/j;Lc/a/a/a/l1;J)V

    :cond_0
    return-void
.end method

.method public synthetic e(Lc/a/a/a/i1;)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->i(Lc/a/a/a/l1$a;Lc/a/a/a/i1;)V

    return-void
.end method

.method public synthetic f(I)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->k(Lc/a/a/a/l1$a;I)V

    return-void
.end method

.method public synthetic g(ZI)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc/a/a/a/k1;->m(Lc/a/a/a/l1$a;ZI)V

    return-void
.end method

.method public synthetic i(Z)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->f(Lc/a/a/a/l1$a;Z)V

    return-void
.end method

.method public synthetic j(I)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->n(Lc/a/a/a/l1$a;I)V

    return-void
.end method

.method public synthetic o(Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->r(Lc/a/a/a/l1$a;Ljava/util/List;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {v0}, Lcom/google/android/exoplayer2/ui/j;->t(Lcom/google/android/exoplayer2/ui/j;)Lc/a/a/a/l1;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/j;->e(Lcom/google/android/exoplayer2/ui/j;)Landroid/view/View;

    move-result-object v1

    if-ne v1, p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/j;->f(Lcom/google/android/exoplayer2/ui/j;)Lc/a/a/a/j0;

    move-result-object p1

    invoke-interface {p1, v0}, Lc/a/a/a/j0;->g(Lc/a/a/a/l1;)Z

    goto/16 :goto_0

    .line 4
    :cond_1
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/j;->g(Lcom/google/android/exoplayer2/ui/j;)Landroid/view/View;

    move-result-object v1

    if-ne v1, p1, :cond_2

    .line 5
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/j;->f(Lcom/google/android/exoplayer2/ui/j;)Lc/a/a/a/j0;

    move-result-object p1

    invoke-interface {p1, v0}, Lc/a/a/a/j0;->e(Lc/a/a/a/l1;)Z

    goto/16 :goto_0

    .line 6
    :cond_2
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/j;->h(Lcom/google/android/exoplayer2/ui/j;)Landroid/view/View;

    move-result-object v1

    if-ne v1, p1, :cond_3

    .line 7
    invoke-interface {v0}, Lc/a/a/a/l1;->q()I

    move-result p1

    const/4 v1, 0x4

    if-eq p1, v1, :cond_8

    .line 8
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/j;->f(Lcom/google/android/exoplayer2/ui/j;)Lc/a/a/a/j0;

    move-result-object p1

    invoke-interface {p1, v0}, Lc/a/a/a/j0;->c(Lc/a/a/a/l1;)Z

    goto :goto_0

    .line 9
    :cond_3
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/j;->i(Lcom/google/android/exoplayer2/ui/j;)Landroid/view/View;

    move-result-object v1

    if-ne v1, p1, :cond_4

    .line 10
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/j;->f(Lcom/google/android/exoplayer2/ui/j;)Lc/a/a/a/j0;

    move-result-object p1

    invoke-interface {p1, v0}, Lc/a/a/a/j0;->h(Lc/a/a/a/l1;)Z

    goto :goto_0

    .line 11
    :cond_4
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/j;->j(Lcom/google/android/exoplayer2/ui/j;)Landroid/view/View;

    move-result-object v1

    if-ne v1, p1, :cond_5

    .line 12
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {p1, v0}, Lcom/google/android/exoplayer2/ui/j;->k(Lcom/google/android/exoplayer2/ui/j;Lc/a/a/a/l1;)V

    goto :goto_0

    .line 13
    :cond_5
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/j;->m(Lcom/google/android/exoplayer2/ui/j;)Landroid/view/View;

    move-result-object v1

    if-ne v1, p1, :cond_6

    .line 14
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {p1, v0}, Lcom/google/android/exoplayer2/ui/j;->n(Lcom/google/android/exoplayer2/ui/j;Lc/a/a/a/l1;)V

    goto :goto_0

    .line 15
    :cond_6
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/j;->o(Lcom/google/android/exoplayer2/ui/j;)Landroid/widget/ImageView;

    move-result-object v1

    if-ne v1, p1, :cond_7

    .line 16
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/j;->f(Lcom/google/android/exoplayer2/ui/j;)Lc/a/a/a/j0;

    move-result-object p1

    .line 17
    invoke-interface {v0}, Lc/a/a/a/l1;->K()I

    move-result v1

    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {v2}, Lcom/google/android/exoplayer2/ui/j;->p(Lcom/google/android/exoplayer2/ui/j;)I

    move-result v2

    invoke-static {v1, v2}, Lc/a/a/a/m2/d0;->a(II)I

    move-result v1

    .line 18
    invoke-interface {p1, v0, v1}, Lc/a/a/a/j0;->a(Lc/a/a/a/l1;I)Z

    goto :goto_0

    .line 19
    :cond_7
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/j;->q(Lcom/google/android/exoplayer2/ui/j;)Landroid/widget/ImageView;

    move-result-object v1

    if-ne v1, p1, :cond_8

    .line 20
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j$b;->a:Lcom/google/android/exoplayer2/ui/j;

    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/j;->f(Lcom/google/android/exoplayer2/ui/j;)Lc/a/a/a/j0;

    move-result-object p1

    invoke-interface {v0}, Lc/a/a/a/l1;->O()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-interface {p1, v0, v1}, Lc/a/a/a/j0;->b(Lc/a/a/a/l1;Z)Z

    :cond_8
    :goto_0
    return-void
.end method

.method public synthetic q(Lc/a/a/a/x1;Ljava/lang/Object;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lc/a/a/a/k1;->t(Lc/a/a/a/l1$a;Lc/a/a/a/x1;Ljava/lang/Object;I)V

    return-void
.end method

.method public synthetic r(Lc/a/a/a/p0;)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->l(Lc/a/a/a/l1$a;Lc/a/a/a/p0;)V

    return-void
.end method

.method public synthetic u(Z)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->d(Lc/a/a/a/l1$a;Z)V

    return-void
.end method

.method public synthetic w()V
    .locals 0

    invoke-static {p0}, Lc/a/a/a/k1;->p(Lc/a/a/a/l1$a;)V

    return-void
.end method

.method public synthetic x(Lc/a/a/a/z0;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc/a/a/a/k1;->g(Lc/a/a/a/l1$a;Lc/a/a/a/z0;I)V

    return-void
.end method
