.class public final Lcom/tv91/z/i/a;
.super Ljava/lang/Object;
.source "GlideImageLoader.java"

# interfaces
.implements Lcom/tv91/z/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/z/i/a$b;,
        Lcom/tv91/z/i/a$c;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Lcom/tv91/z/f$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/tv91/z/i/a;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a()Lcom/tv91/z/f$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/tv91/z/f$c;

    invoke-direct {v0}, Lcom/tv91/z/f$c;-><init>()V

    iput-object v0, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    return-object v0
.end method

.method public synthetic b(Ljava/lang/String;)Lcom/tv91/z/f;
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/z/d;->b(Lcom/tv91/z/f;Ljava/lang/String;)Lcom/tv91/z/f;

    move-result-object p1

    return-object p1
.end method

.method public synthetic c(I)Lcom/tv91/z/f;
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/z/d;->a(Lcom/tv91/z/f;I)Lcom/tv91/z/f;

    move-result-object p1

    return-object p1
.end method

.method public synthetic d(II)Lcom/tv91/z/f;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/tv91/z/d;->d(Lcom/tv91/z/f;II)Lcom/tv91/z/f;

    move-result-object p1

    return-object p1
.end method

.method public synthetic e(I)Lcom/tv91/z/f;
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/z/d;->c(Lcom/tv91/z/f;I)Lcom/tv91/z/f;

    move-result-object p1

    return-object p1
.end method

.method public f(Lcom/tv91/utils/i/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tv91/utils/i/a<",
            "Ljava/lang/String;",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/tv91/z/f$c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    iget v2, v0, Lcom/tv91/z/f$c;->c:I

    const/4 v3, -0x1

    if-lez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    .line 3
    :goto_0
    iget v0, v0, Lcom/tv91/z/f$c;->d:I

    if-lez v0, :cond_2

    move v3, v0

    .line 4
    :cond_2
    iget-object v0, p0, Lcom/tv91/z/i/a;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/bumptech/glide/b;->t(Landroid/content/Context;)Lcom/bumptech/glide/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/k;->m()Lcom/bumptech/glide/j;

    move-result-object v0

    iget-object v4, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    .line 5
    invoke-virtual {v4}, Lcom/tv91/z/f$c;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/bumptech/glide/j;->y0(Ljava/lang/String;)Lcom/bumptech/glide/j;

    move-result-object v0

    new-instance v4, Lcom/tv91/z/i/a$c;

    iget-object v5, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    .line 6
    invoke-virtual {v5}, Lcom/tv91/z/f$c;->a()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    iget-object v6, v6, Lcom/tv91/z/f$c;->b:Ljava/lang/String;

    invoke-direct {v4, v5, v6}, Lcom/tv91/z/i/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Lcom/bumptech/glide/r/a;->c0(Lcom/bumptech/glide/load/g;)Lcom/bumptech/glide/r/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/j;

    .line 7
    invoke-virtual {v0, v2, v3}, Lcom/bumptech/glide/r/a;->R(II)Lcom/bumptech/glide/r/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/j;

    iget-object v2, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    iget v2, v2, Lcom/tv91/z/f$c;->g:I

    .line 8
    invoke-virtual {v0, v2}, Lcom/bumptech/glide/r/a;->W(I)Lcom/bumptech/glide/r/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/j;

    iget-object v2, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    iget v2, v2, Lcom/tv91/z/f$c;->h:I

    .line 9
    invoke-virtual {v0, v2}, Lcom/bumptech/glide/r/a;->h(I)Lcom/bumptech/glide/r/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/j;

    .line 10
    iget-object v2, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    iget-boolean v2, v2, Lcom/tv91/z/f$c;->e:Z

    if-eqz v2, :cond_3

    .line 11
    invoke-virtual {v0}, Lcom/bumptech/glide/r/a;->c()Lcom/bumptech/glide/r/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/j;

    .line 12
    :cond_3
    iget-object v2, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    iget v2, v2, Lcom/tv91/z/f$c;->f:I

    if-lez v2, :cond_4

    .line 13
    new-instance v2, Lcom/bumptech/glide/load/p/d/z;

    iget-object v3, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    iget v3, v3, Lcom/tv91/z/f$c;->f:I

    invoke-direct {v2, v3}, Lcom/bumptech/glide/load/p/d/z;-><init>(I)V

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/r/a;->f0(Lcom/bumptech/glide/load/m;)Lcom/bumptech/glide/r/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/j;

    .line 14
    :cond_4
    new-instance v2, Lcom/tv91/z/i/a$b;

    iget-object v3, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    invoke-virtual {v3}, Lcom/tv91/z/f$c;->a()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/tv91/z/i/a$a;

    invoke-direct {v4, p0, p1}, Lcom/tv91/z/i/a$a;-><init>(Lcom/tv91/z/i/a;Lcom/tv91/utils/i/a;)V

    invoke-direct {v2, v3, v4, v1}, Lcom/tv91/z/i/a$b;-><init>(Ljava/lang/String;Lcom/tv91/z/f$a;Lcom/tv91/z/i/a$a;)V

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/j;->s0(Lcom/bumptech/glide/r/j/h;)Lcom/bumptech/glide/r/j/h;

    .line 15
    iput-object v1, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    return-void

    .line 16
    :cond_5
    :goto_1
    iput-object v1, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    return-void
.end method

.method public g(Landroid/widget/ImageView;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/tv91/z/f$c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    iget v2, v0, Lcom/tv91/z/f$c;->c:I

    const/4 v3, -0x1

    if-lez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    .line 3
    :goto_0
    iget v0, v0, Lcom/tv91/z/f$c;->d:I

    if-lez v0, :cond_2

    move v3, v0

    .line 4
    :cond_2
    invoke-static {p1}, Lcom/bumptech/glide/b;->u(Landroid/view/View;)Lcom/bumptech/glide/k;

    move-result-object v0

    iget-object v4, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    .line 5
    invoke-virtual {v4}, Lcom/tv91/z/f$c;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/bumptech/glide/k;->s(Ljava/lang/String;)Lcom/bumptech/glide/j;

    move-result-object v0

    new-instance v4, Lcom/tv91/z/i/a$c;

    iget-object v5, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    .line 6
    invoke-virtual {v5}, Lcom/tv91/z/f$c;->a()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    iget-object v6, v6, Lcom/tv91/z/f$c;->b:Ljava/lang/String;

    invoke-direct {v4, v5, v6}, Lcom/tv91/z/i/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Lcom/bumptech/glide/r/a;->c0(Lcom/bumptech/glide/load/g;)Lcom/bumptech/glide/r/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/j;

    .line 7
    invoke-virtual {v0, v2, v3}, Lcom/bumptech/glide/r/a;->R(II)Lcom/bumptech/glide/r/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/j;

    iget-object v2, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    iget v2, v2, Lcom/tv91/z/f$c;->g:I

    .line 8
    invoke-virtual {v0, v2}, Lcom/bumptech/glide/r/a;->W(I)Lcom/bumptech/glide/r/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/j;

    iget-object v2, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    iget v2, v2, Lcom/tv91/z/f$c;->h:I

    .line 9
    invoke-virtual {v0, v2}, Lcom/bumptech/glide/r/a;->h(I)Lcom/bumptech/glide/r/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/j;

    .line 10
    iget-object v2, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    iget-boolean v2, v2, Lcom/tv91/z/f$c;->e:Z

    if-eqz v2, :cond_3

    .line 11
    invoke-virtual {v0}, Lcom/bumptech/glide/r/a;->c()Lcom/bumptech/glide/r/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/j;

    .line 12
    :cond_3
    iget-object v2, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    iget v2, v2, Lcom/tv91/z/f$c;->f:I

    if-lez v2, :cond_4

    .line 13
    new-instance v2, Lcom/bumptech/glide/load/p/d/z;

    iget-object v3, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    iget v3, v3, Lcom/tv91/z/f$c;->f:I

    invoke-direct {v2, v3}, Lcom/bumptech/glide/load/p/d/z;-><init>(I)V

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/r/a;->f0(Lcom/bumptech/glide/load/m;)Lcom/bumptech/glide/r/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/j;

    .line 14
    :cond_4
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/j;->v0(Landroid/widget/ImageView;)Lcom/bumptech/glide/r/j/i;

    .line 15
    iput-object v1, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    return-void

    .line 16
    :cond_5
    :goto_1
    iput-object v1, p0, Lcom/tv91/z/i/a;->b:Lcom/tv91/z/f$c;

    return-void
.end method
