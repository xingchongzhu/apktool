.class public final Lcom/tv91/u/c/k/t;
.super Lcom/tv91/q/b/d;
.source "LoadMoviesUseCase.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/c/k/t$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/q/b/d<",
        "Lcom/tv91/q/b/e;",
        ">;"
    }
.end annotation


# instance fields
.field private final i:Lcom/tv91/z/b;

.field private j:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Lcom/tv91/model/Paging<",
            "Lcom/tv91/model/Movie;",
            ">;>;"
        }
    .end annotation
.end field

.field private final k:Lcom/tv91/q/b/e;


# direct methods
.method public constructor <init>(Lcom/tv91/t/b;Lcom/tv91/z/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/q/b/d;-><init>(Lcom/tv91/t/b;)V

    .line 2
    invoke-static {}, Lcom/tv91/q/b/d;->b()Lb/g/j/a;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/c/k/t;->j:Lb/g/j/a;

    .line 3
    new-instance p1, Lcom/tv91/u/c/k/k;

    invoke-direct {p1, p0}, Lcom/tv91/u/c/k/k;-><init>(Lcom/tv91/u/c/k/t;)V

    iput-object p1, p0, Lcom/tv91/u/c/k/t;->k:Lcom/tv91/q/b/e;

    .line 4
    iput-object p2, p0, Lcom/tv91/u/c/k/t;->i:Lcom/tv91/z/b;

    return-void
.end method

.method private o(IILcom/tv91/u/c/k/t$a;[ILjava/lang/String;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/k/t;->k:Lcom/tv91/q/b/e;

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    .line 2
    new-instance v0, Lcom/tv91/u/c/k/l;

    move-object v1, v0

    move-object v2, p0

    move v3, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lcom/tv91/u/c/k/l;-><init>(Lcom/tv91/u/c/k/t;IILcom/tv91/u/c/k/t$a;[ILjava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->j(Ljava/lang/Runnable;)V

    return-void
.end method

.method private t(IILcom/tv91/u/c/k/t$a;[ILjava/lang/String;)Lcom/tv91/model/Paging;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lcom/tv91/u/c/k/t$a;",
            "[I",
            "Ljava/lang/String;",
            ")",
            "Lcom/tv91/model/Paging<",
            "Lcom/tv91/model/Movie;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/u/c/k/t$a;->h:Lcom/tv91/u/c/k/t$a;

    const/4 v1, 0x0

    if-ne p3, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/tv91/u/c/k/t;->i:Lcom/tv91/z/b;

    aget p2, p4, v1

    invoke-interface {p1, p2}, Lcom/tv91/z/b;->m(I)Ljava/util/List;

    move-result-object p1

    .line 3
    new-instance p2, Lcom/tv91/model/Paging;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p3

    const/4 p4, 0x1

    invoke-direct {p2, p3, p4, p1}, Lcom/tv91/model/Paging;-><init>(IILjava/util/List;)V

    return-object p2

    .line 4
    :cond_0
    sget-object v0, Lcom/tv91/u/c/k/t$a;->g:Lcom/tv91/u/c/k/t$a;

    if-ne p3, v0, :cond_1

    .line 5
    iget-object p5, p0, Lcom/tv91/u/c/k/t;->i:Lcom/tv91/z/b;

    aget p4, p4, v1

    iget p3, p3, Lcom/tv91/u/c/k/t$a;->j:I

    invoke-interface {p5, p1, p2, p4, p3}, Lcom/tv91/z/b;->b(IIII)Lcom/tv91/model/Paging;

    move-result-object p1

    return-object p1

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/tv91/u/c/k/t;->i:Lcom/tv91/z/b;

    iget v3, p3, Lcom/tv91/u/c/k/t$a;->j:I

    move v1, p1

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/tv91/z/b;->Y(III[ILjava/lang/String;)Lcom/tv91/model/Paging;

    move-result-object p1

    return-object p1
.end method

.method private synthetic u(IILcom/tv91/u/c/k/t$a;[ILjava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/tv91/q/b/f$c;

    invoke-direct {v0}, Lcom/tv91/q/b/f$c;-><init>()V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    .line 2
    invoke-direct/range {p0 .. p5}, Lcom/tv91/u/c/k/t;->t(IILcom/tv91/u/c/k/t$a;[ILjava/lang/String;)Lcom/tv91/model/Paging;

    move-result-object p1

    .line 3
    new-instance p2, Lcom/tv91/q/b/f$d;

    invoke-direct {p2, p1}, Lcom/tv91/q/b/f$d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    new-instance p1, Lcom/tv91/q/b/f$b;

    invoke-direct {p1}, Lcom/tv91/q/b/f$b;-><init>()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 5
    :try_start_1
    new-instance p2, Lcom/tv91/q/b/f$a;

    new-instance p3, Lcom/tv91/s/c;

    invoke-direct {p3, p1}, Lcom/tv91/s/c;-><init>(Ljava/lang/Exception;)V

    invoke-direct {p2, p3}, Lcom/tv91/q/b/f$a;-><init>(Lcom/tv91/s/c;)V

    invoke-virtual {p0, p2}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    new-instance p1, Lcom/tv91/q/b/f$b;

    invoke-direct {p1}, Lcom/tv91/q/b/f$b;-><init>()V

    :goto_0
    invoke-virtual {p0, p1}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    return-void

    :goto_1
    new-instance p2, Lcom/tv91/q/b/f$b;

    invoke-direct {p2}, Lcom/tv91/q/b/f$b;-><init>()V

    invoke-virtual {p0, p2}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    .line 7
    throw p1
.end method

.method private synthetic w(Lcom/tv91/q/b/f;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/tv91/q/b/f$c;

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/tv91/q/b/d;->c:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 3
    :cond_0
    instance-of v0, p1, Lcom/tv91/q/b/f$b;

    if-eqz v0, :cond_1

    .line 4
    iget-object p1, p0, Lcom/tv91/q/b/d;->d:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 5
    :cond_1
    instance-of v0, p1, Lcom/tv91/q/b/f$d;

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/tv91/u/c/k/t;->j:Lb/g/j/a;

    check-cast p1, Lcom/tv91/q/b/f$d;

    iget-object p1, p1, Lcom/tv91/q/b/f$d;->a:Ljava/lang/Object;

    invoke-interface {v0, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 7
    :cond_2
    instance-of v0, p1, Lcom/tv91/q/b/f$a;

    if-eqz v0, :cond_3

    .line 8
    iget-object v0, p0, Lcom/tv91/q/b/d;->e:Lb/g/j/a;

    check-cast p1, Lcom/tv91/q/b/f$a;

    iget-object p1, p1, Lcom/tv91/q/b/f$a;->a:Lcom/tv91/s/c;

    invoke-interface {v0, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/t;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/q/b/d;->c:Ljava/lang/Runnable;

    return-object p0
.end method

.method public B(Lb/g/j/a;)Lcom/tv91/u/c/k/t;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/Paging<",
            "Lcom/tv91/model/Movie;",
            ">;>;)",
            "Lcom/tv91/u/c/k/t;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/u/c/k/t;->j:Lb/g/j/a;

    return-object p0
.end method

.method public p(IILjava/lang/String;)V
    .locals 6

    .line 1
    sget-object v3, Lcom/tv91/u/c/k/t$a;->a:Lcom/tv91/u/c/k/t$a;

    const/4 v0, 0x1

    new-array v4, v0, [I

    const/4 v0, 0x0

    const/4 v1, -0x1

    aput v1, v4, v0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/tv91/u/c/k/t;->o(IILcom/tv91/u/c/k/t$a;[ILjava/lang/String;)V

    return-void
.end method

.method public q(IILjava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lcom/tv91/model/Category;",
            ">;)V"
        }
    .end annotation

    if-eqz p3, :cond_2

    .line 1
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    new-array v5, v0, [I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 3
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tv91/model/Category;

    iget v2, v2, Lcom/tv91/model/b;->key:I

    aput v2, v5, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 4
    :cond_1
    sget-object v4, Lcom/tv91/u/c/k/t$a;->b:Lcom/tv91/u/c/k/t$a;

    const-string v6, ""

    move-object v1, p0

    move v2, p1

    move v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/tv91/u/c/k/t;->o(IILcom/tv91/u/c/k/t$a;[ILjava/lang/String;)V

    return-void

    .line 5
    :cond_2
    :goto_1
    new-instance p1, Lcom/tv91/q/b/f$c;

    invoke-direct {p1}, Lcom/tv91/q/b/f$c;-><init>()V

    invoke-virtual {p0, p1}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    .line 6
    new-instance p1, Lcom/tv91/q/b/f$d;

    invoke-static {}, Lcom/tv91/model/Paging;->empty()Lcom/tv91/model/Paging;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/tv91/q/b/f$d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    .line 7
    new-instance p1, Lcom/tv91/q/b/f$b;

    invoke-direct {p1}, Lcom/tv91/q/b/f$b;-><init>()V

    invoke-virtual {p0, p1}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    return-void
.end method

.method public r(Lcom/tv91/u/c/k/t$a;III)V
    .locals 7

    const/4 v0, 0x1

    new-array v5, v0, [I

    const/4 v0, 0x0

    aput p2, v5, v0

    const-string v6, ""

    move-object v1, p0

    move v2, p3

    move v3, p4

    move-object v4, p1

    .line 1
    invoke-direct/range {v1 .. v6}, Lcom/tv91/u/c/k/t;->o(IILcom/tv91/u/c/k/t$a;[ILjava/lang/String;)V

    return-void
.end method

.method public s(Lcom/tv91/model/c;)V
    .locals 6

    .line 1
    sget-object v3, Lcom/tv91/u/c/k/t$a;->h:Lcom/tv91/u/c/k/t$a;

    const/4 v0, 0x1

    new-array v4, v0, [I

    iget p1, p1, Lcom/tv91/model/c;->e:I

    const/4 v0, 0x0

    aput p1, v4, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v5, ""

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/tv91/u/c/k/t;->o(IILcom/tv91/u/c/k/t$a;[ILjava/lang/String;)V

    return-void
.end method

.method public synthetic v(IILcom/tv91/u/c/k/t$a;[ILjava/lang/String;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/tv91/u/c/k/t;->u(IILcom/tv91/u/c/k/t$a;[ILjava/lang/String;)V

    return-void
.end method

.method public synthetic x(Lcom/tv91/q/b/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/k/t;->w(Lcom/tv91/q/b/f;)V

    return-void
.end method

.method public y(Lb/g/j/a;)Lcom/tv91/u/c/k/t;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/s/c;",
            ">;)",
            "Lcom/tv91/u/c/k/t;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/q/b/d;->e:Lb/g/j/a;

    return-object p0
.end method

.method public z(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/t;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/q/b/d;->d:Ljava/lang/Runnable;

    return-object p0
.end method
