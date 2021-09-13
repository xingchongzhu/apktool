.class public final Lcom/tv91/u/b/x0/k1;
.super Lcom/tv91/q/b/d;
.source "LoadDownloadRecordUseCase.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/b/x0/k1$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/q/b/d<",
        "Lcom/tv91/u/b/x0/k1$e;",
        ">;"
    }
.end annotation


# instance fields
.field private final i:Lcom/tv91/y/h;

.field private final j:Lcom/tv91/y/c;


# direct methods
.method public constructor <init>(Lcom/tv91/t/b;Lcom/tv91/y/h;Lcom/tv91/y/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/q/b/d;-><init>(Lcom/tv91/t/b;)V

    .line 2
    iput-object p2, p0, Lcom/tv91/u/b/x0/k1;->i:Lcom/tv91/y/h;

    .line 3
    iput-object p3, p0, Lcom/tv91/u/b/x0/k1;->j:Lcom/tv91/y/c;

    return-void
.end method

.method private A()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/tv91/q/b/d;->d()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/u/b/x0/k1$e;

    .line 2
    invoke-interface {v1}, Lcom/tv91/u/b/x0/k1$e;->d()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private B(Lcom/tv91/model/a;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/tv91/q/b/d;->d()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/u/b/x0/k1$e;

    .line 2
    invoke-interface {v1, p1}, Lcom/tv91/u/b/x0/k1$e;->b(Lcom/tv91/model/a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic q(Lcom/tv91/u/b/x0/k1;)V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/b/x0/k1;->A()V

    return-void
.end method

.method public static synthetic r(Lcom/tv91/u/b/x0/k1;)V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/b/x0/k1;->z()V

    return-void
.end method

.method private synthetic s(Lcom/tv91/model/Movie;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/tv91/u/b/x0/p;

    invoke-direct {v0, p0}, Lcom/tv91/u/b/x0/p;-><init>(Lcom/tv91/u/b/x0/k1;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/tv91/u/b/x0/k1;->p(Lcom/tv91/model/Movie;)Lcom/tv91/model/a;

    move-result-object p1

    .line 3
    new-instance v0, Lcom/tv91/u/b/x0/t;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/b/x0/t;-><init>(Lcom/tv91/u/b/x0/k1;Lcom/tv91/model/a;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    new-instance p1, Lcom/tv91/u/b/x0/s;

    invoke-direct {p1, p0}, Lcom/tv91/u/b/x0/s;-><init>(Lcom/tv91/u/b/x0/k1;)V

    :goto_0
    invoke-virtual {p0, p1}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 5
    :try_start_1
    new-instance v0, Lcom/tv91/s/c;

    invoke-direct {v0, p1}, Lcom/tv91/s/c;-><init>(Ljava/lang/Exception;)V

    .line 6
    invoke-virtual {v0}, Lcom/tv91/s/c;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 7
    iget-object p1, p0, Lcom/tv91/u/b/x0/k1;->i:Lcom/tv91/y/h;

    invoke-interface {p1}, Lcom/tv91/y/h;->i()V

    .line 8
    :cond_0
    new-instance p1, Lcom/tv91/u/b/x0/r;

    invoke-direct {p1, p0, v0}, Lcom/tv91/u/b/x0/r;-><init>(Lcom/tv91/u/b/x0/k1;Lcom/tv91/s/c;)V

    invoke-virtual {p0, p1}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    new-instance p1, Lcom/tv91/u/b/x0/s;

    invoke-direct {p1, p0}, Lcom/tv91/u/b/x0/s;-><init>(Lcom/tv91/u/b/x0/k1;)V

    goto :goto_0

    :goto_1
    return-void

    :goto_2
    new-instance v0, Lcom/tv91/u/b/x0/s;

    invoke-direct {v0, p0}, Lcom/tv91/u/b/x0/s;-><init>(Lcom/tv91/u/b/x0/k1;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V

    .line 10
    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method

.method private synthetic u(Lcom/tv91/model/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/k1;->B(Lcom/tv91/model/a;)V

    return-void
.end method

.method private synthetic w(Lcom/tv91/s/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/k1;->y(Lcom/tv91/s/c;)V

    return-void
.end method

.method private y(Lcom/tv91/s/c;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/tv91/q/b/d;->d()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/u/b/x0/k1$e;

    .line 2
    invoke-interface {v1, p1}, Lcom/tv91/u/b/x0/k1$e;->a(Lcom/tv91/s/c;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/tv91/q/b/d;->d()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/u/b/x0/k1$e;

    .line 2
    invoke-interface {v1}, Lcom/tv91/u/b/x0/k1$e;->c()V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method


# virtual methods
.method public C(Lb/g/j/a;)Lcom/tv91/u/b/x0/k1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/s/c;",
            ">;)",
            "Lcom/tv91/u/b/x0/k1;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/k1$d;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/b/x0/k1$d;-><init>(Lcom/tv91/u/b/x0/k1;Lb/g/j/a;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    return-object p0
.end method

.method public D(Ljava/lang/Runnable;)Lcom/tv91/u/b/x0/k1;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/k1$b;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/b/x0/k1$b;-><init>(Lcom/tv91/u/b/x0/k1;Ljava/lang/Runnable;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    return-object p0
.end method

.method public E(Ljava/lang/Runnable;)Lcom/tv91/u/b/x0/k1;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/k1$a;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/b/x0/k1$a;-><init>(Lcom/tv91/u/b/x0/k1;Ljava/lang/Runnable;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    return-object p0
.end method

.method public F(Lb/g/j/a;)Lcom/tv91/u/b/x0/k1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/a;",
            ">;)",
            "Lcom/tv91/u/b/x0/k1;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/k1$c;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/b/x0/k1$c;-><init>(Lcom/tv91/u/b/x0/k1;Lb/g/j/a;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    return-object p0
.end method

.method public o(Lcom/tv91/model/Movie;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/q;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/b/x0/q;-><init>(Lcom/tv91/u/b/x0/k1;Lcom/tv91/model/Movie;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->k(Ljava/lang/Runnable;)V

    return-void
.end method

.method public p(Lcom/tv91/model/Movie;)Lcom/tv91/model/a;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/x0/k1;->j:Lcom/tv91/y/c;

    iget-object v1, p0, Lcom/tv91/u/b/x0/k1;->i:Lcom/tv91/y/h;

    invoke-interface {v1}, Lcom/tv91/y/h;->d()Ljava/lang/String;

    move-result-object v1

    iget p1, p1, Lcom/tv91/model/Movie;->id:I

    invoke-interface {v0, v1, p1}, Lcom/tv91/y/c;->d(Ljava/lang/String;I)Lcom/tv91/model/a;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tv91/u/b/x0/k1;->i:Lcom/tv91/y/h;

    invoke-interface {v0}, Lcom/tv91/y/h;->e()Lcom/tv91/model/User;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tv91/model/a;->d(Lcom/tv91/model/User;)Lcom/tv91/model/a;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public synthetic t(Lcom/tv91/model/Movie;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/k1;->s(Lcom/tv91/model/Movie;)V

    return-void
.end method

.method public synthetic v(Lcom/tv91/model/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/k1;->u(Lcom/tv91/model/a;)V

    return-void
.end method

.method public synthetic x(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/k1;->w(Lcom/tv91/s/c;)V

    return-void
.end method
