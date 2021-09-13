.class public final Lcom/tv91/u/c/k/s;
.super Lcom/tv91/q/b/d;
.source "LoadMovieUseCase.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/q/b/d<",
        "Lcom/tv91/q/b/e;",
        ">;"
    }
.end annotation


# instance fields
.field private final i:Lcom/tv91/z/b;

.field private final j:Lcom/tv91/y/h;

.field private final k:Lcom/tv91/y/c;

.field private l:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Lcom/tv91/model/Movie;",
            ">;"
        }
    .end annotation
.end field

.field private final m:Lcom/tv91/q/b/e;


# direct methods
.method public constructor <init>(Lcom/tv91/t/b;Lcom/tv91/z/b;Lcom/tv91/y/h;Lcom/tv91/y/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/q/b/d;-><init>(Lcom/tv91/t/b;)V

    .line 2
    invoke-static {}, Lcom/tv91/q/b/d;->b()Lb/g/j/a;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/c/k/s;->l:Lb/g/j/a;

    .line 3
    new-instance p1, Lcom/tv91/u/c/k/j;

    invoke-direct {p1, p0}, Lcom/tv91/u/c/k/j;-><init>(Lcom/tv91/u/c/k/s;)V

    iput-object p1, p0, Lcom/tv91/u/c/k/s;->m:Lcom/tv91/q/b/e;

    .line 4
    iput-object p2, p0, Lcom/tv91/u/c/k/s;->i:Lcom/tv91/z/b;

    .line 5
    iput-object p3, p0, Lcom/tv91/u/c/k/s;->j:Lcom/tv91/y/h;

    .line 6
    iput-object p4, p0, Lcom/tv91/u/c/k/s;->k:Lcom/tv91/y/c;

    return-void
.end method

.method private synthetic r(II)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/tv91/q/b/f$c;

    invoke-direct {v0}, Lcom/tv91/q/b/f$c;-><init>()V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/tv91/u/c/k/s;->q(II)Lcom/tv91/model/Movie;

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

    new-instance v0, Lcom/tv91/s/c;

    invoke-direct {v0, p1}, Lcom/tv91/s/c;-><init>(Ljava/lang/Exception;)V

    invoke-direct {p2, v0}, Lcom/tv91/q/b/f$a;-><init>(Lcom/tv91/s/c;)V

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

.method private synthetic t(Lcom/tv91/q/b/f;)V
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
    iget-object v0, p0, Lcom/tv91/u/c/k/s;->l:Lb/g/j/a;

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

.method private z(Lcom/tv91/model/User;Lcom/tv91/model/Movie;)Lcom/tv91/model/Movie;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/k/s;->k:Lcom/tv91/y/c;

    iget-object v1, p1, Lcom/tv91/model/User;->id:Ljava/lang/String;

    iget v2, p2, Lcom/tv91/model/Movie;->id:I

    invoke-interface {v0, v1, v2}, Lcom/tv91/y/c;->g(Ljava/lang/String;I)Lcom/tv91/model/Movie;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 2
    iget-boolean v0, v0, Lcom/tv91/model/Movie;->favorite:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 3
    iget-boolean v0, p2, Lcom/tv91/model/Movie;->favorite:Z

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/tv91/u/c/k/s;->i:Lcom/tv91/z/b;

    iget-object v2, p1, Lcom/tv91/model/User;->id:Ljava/lang/String;

    iget-object p1, p1, Lcom/tv91/model/User;->token:Ljava/lang/String;

    iget v3, p2, Lcom/tv91/model/Movie;->id:I

    invoke-interface {v0, v2, p1, v3}, Lcom/tv91/z/b;->i(Ljava/lang/String;Ljava/lang/String;I)V

    .line 5
    invoke-virtual {p2}, Lcom/tv91/model/Movie;->newBuilder()Lcom/tv91/model/Movie$Builder;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/tv91/model/Movie$Builder;->favorite(Z)Lcom/tv91/model/Movie$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tv91/model/Movie$Builder;->build()Lcom/tv91/model/Movie;

    move-result-object p1

    return-object p1

    :cond_1
    return-object p2
.end method


# virtual methods
.method public o(I)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/tv91/u/c/k/s;->p(II)V

    return-void
.end method

.method public p(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/k/s;->m:Lcom/tv91/q/b/e;

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    .line 2
    new-instance v0, Lcom/tv91/u/c/k/i;

    invoke-direct {v0, p0, p1, p2}, Lcom/tv91/u/c/k/i;-><init>(Lcom/tv91/u/c/k/s;II)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->j(Ljava/lang/Runnable;)V

    return-void
.end method

.method public q(II)Lcom/tv91/model/Movie;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/k/s;->j:Lcom/tv91/y/h;

    invoke-interface {v0}, Lcom/tv91/y/h;->e()Lcom/tv91/model/User;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/tv91/u/c/k/s;->i:Lcom/tv91/z/b;

    invoke-interface {v1, v0, p1, p2}, Lcom/tv91/z/b;->n(Lcom/tv91/model/User;II)Lcom/tv91/model/Movie;

    move-result-object p1

    if-nez v0, :cond_0

    return-object p1

    .line 3
    :cond_0
    invoke-direct {p0, v0, p1}, Lcom/tv91/u/c/k/s;->z(Lcom/tv91/model/User;Lcom/tv91/model/Movie;)Lcom/tv91/model/Movie;

    move-result-object p1

    return-object p1
.end method

.method public synthetic s(II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/c/k/s;->r(II)V

    return-void
.end method

.method public synthetic u(Lcom/tv91/q/b/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/c/k/s;->t(Lcom/tv91/q/b/f;)V

    return-void
.end method

.method public v(Lb/g/j/a;)Lcom/tv91/u/c/k/s;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/s/c;",
            ">;)",
            "Lcom/tv91/u/c/k/s;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/q/b/d;->e:Lb/g/j/a;

    return-object p0
.end method

.method public w(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/s;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/q/b/d;->d:Ljava/lang/Runnable;

    return-object p0
.end method

.method public x(Ljava/lang/Runnable;)Lcom/tv91/u/c/k/s;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/q/b/d;->c:Ljava/lang/Runnable;

    return-object p0
.end method

.method public y(Lb/g/j/a;)Lcom/tv91/u/c/k/s;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/Movie;",
            ">;)",
            "Lcom/tv91/u/c/k/s;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/u/c/k/s;->l:Lb/g/j/a;

    return-object p0
.end method
