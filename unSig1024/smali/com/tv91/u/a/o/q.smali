.class final Lcom/tv91/u/a/o/q;
.super Landroidx/fragment/app/v;
.source "MoviesPageAdapter.java"


# instance fields
.field private final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tv91/model/Channel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/fragment/app/n;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/n;",
            "Ljava/util/List<",
            "Lcom/tv91/model/Channel;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, v0}, Landroidx/fragment/app/v;-><init>(Landroidx/fragment/app/n;I)V

    .line 2
    iput-object p2, p0, Lcom/tv91/u/a/o/q;->j:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/o/q;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public e(I)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/o/q;->j:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/model/Channel;

    iget-object p1, p1, Lcom/tv91/model/b;->value:Ljava/lang/String;

    return-object p1
.end method

.method public p(I)Landroidx/fragment/app/Fragment;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/o/q;->j:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/model/Channel;

    .line 2
    iget v0, p1, Lcom/tv91/model/b;->key:I

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_0

    .line 3
    new-instance p1, Lcom/tv91/u/c/h/r$a;

    invoke-direct {p1}, Lcom/tv91/u/c/h/r$a;-><init>()V

    invoke-virtual {p1}, Lcom/tv91/x/c;->l()Landroidx/fragment/app/Fragment;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    new-instance v0, Lcom/tv91/u/c/i/b0$a;

    invoke-direct {v0, p1}, Lcom/tv91/u/c/i/b0$a;-><init>(Lcom/tv91/model/Channel;)V

    invoke-virtual {v0}, Lcom/tv91/x/c;->l()Landroidx/fragment/app/Fragment;

    move-result-object p1

    return-object p1
.end method

.method public q()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tv91/model/Channel;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/o/q;->j:Ljava/util/List;

    return-object v0
.end method
