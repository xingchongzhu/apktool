.class public final Lcom/tv91/u/b/x0/m1;
.super Lcom/tv91/q/b/d;
.source "LoadDownloadRecordsUseCase.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/b/x0/m1$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/q/b/d<",
        "Lcom/tv91/u/b/x0/m1$e;",
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
    iput-object p2, p0, Lcom/tv91/u/b/x0/m1;->i:Lcom/tv91/y/h;

    .line 3
    iput-object p3, p0, Lcom/tv91/u/b/x0/m1;->j:Lcom/tv91/y/c;

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

    check-cast v1, Lcom/tv91/u/b/x0/m1$e;

    .line 2
    invoke-interface {v1}, Lcom/tv91/u/b/x0/m1$e;->d()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private B(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/model/a;",
            ">;)V"
        }
    .end annotation

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

    check-cast v1, Lcom/tv91/u/b/x0/m1$e;

    .line 2
    invoke-interface {v1, p1}, Lcom/tv91/u/b/x0/m1$e;->b(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic q(Lcom/tv91/u/b/x0/m1;)V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/b/x0/m1;->A()V

    return-void
.end method

.method private synthetic r(Lcom/tv91/model/a$a;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/tv91/u/b/x0/u;

    invoke-direct {v0, p0}, Lcom/tv91/u/b/x0/u;-><init>(Lcom/tv91/u/b/x0/m1;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/tv91/u/b/x0/m1;->p(Lcom/tv91/model/a$a;)Ljava/util/List;

    move-result-object p1

    .line 3
    new-instance v0, Lcom/tv91/u/b/x0/w;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/b/x0/w;-><init>(Lcom/tv91/u/b/x0/m1;Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    new-instance p1, Lcom/tv91/u/b/x0/y;

    invoke-direct {p1, p0}, Lcom/tv91/u/b/x0/y;-><init>(Lcom/tv91/u/b/x0/m1;)V

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
    iget-object p1, p0, Lcom/tv91/u/b/x0/m1;->i:Lcom/tv91/y/h;

    invoke-interface {p1}, Lcom/tv91/y/h;->i()V

    .line 8
    :cond_0
    new-instance p1, Lcom/tv91/u/b/x0/v;

    invoke-direct {p1, p0, v0}, Lcom/tv91/u/b/x0/v;-><init>(Lcom/tv91/u/b/x0/m1;Lcom/tv91/s/c;)V

    invoke-virtual {p0, p1}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    new-instance p1, Lcom/tv91/u/b/x0/y;

    invoke-direct {p1, p0}, Lcom/tv91/u/b/x0/y;-><init>(Lcom/tv91/u/b/x0/m1;)V

    goto :goto_0

    :goto_1
    return-void

    :goto_2
    new-instance v0, Lcom/tv91/u/b/x0/y;

    invoke-direct {v0, p0}, Lcom/tv91/u/b/x0/y;-><init>(Lcom/tv91/u/b/x0/m1;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V

    .line 10
    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method

.method private synthetic t(Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/m1;->B(Ljava/util/List;)V

    return-void
.end method

.method private synthetic v(Lcom/tv91/s/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/m1;->y(Lcom/tv91/s/c;)V

    return-void
.end method

.method public static synthetic x(Lcom/tv91/u/b/x0/m1;)V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/b/x0/m1;->z()V

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

    check-cast v1, Lcom/tv91/u/b/x0/m1$e;

    .line 2
    invoke-interface {v1, p1}, Lcom/tv91/u/b/x0/m1$e;->a(Lcom/tv91/s/c;)V

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

    check-cast v1, Lcom/tv91/u/b/x0/m1$e;

    .line 2
    invoke-interface {v1}, Lcom/tv91/u/b/x0/m1$e;->c()V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method


# virtual methods
.method public C(Lb/g/j/a;)Lcom/tv91/u/b/x0/m1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/s/c;",
            ">;)",
            "Lcom/tv91/u/b/x0/m1;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/m1$d;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/b/x0/m1$d;-><init>(Lcom/tv91/u/b/x0/m1;Lb/g/j/a;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    return-object p0
.end method

.method public D(Ljava/lang/Runnable;)Lcom/tv91/u/b/x0/m1;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/m1$b;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/b/x0/m1$b;-><init>(Lcom/tv91/u/b/x0/m1;Ljava/lang/Runnable;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    return-object p0
.end method

.method public E(Ljava/lang/Runnable;)Lcom/tv91/u/b/x0/m1;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/m1$a;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/b/x0/m1$a;-><init>(Lcom/tv91/u/b/x0/m1;Ljava/lang/Runnable;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    return-object p0
.end method

.method public F(Lb/g/j/a;)Lcom/tv91/u/b/x0/m1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Ljava/util/List<",
            "Lcom/tv91/model/a;",
            ">;>;)",
            "Lcom/tv91/u/b/x0/m1;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/m1$c;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/b/x0/m1$c;-><init>(Lcom/tv91/u/b/x0/m1;Lb/g/j/a;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    return-object p0
.end method

.method public o(Lcom/tv91/model/a$a;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/x;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/b/x0/x;-><init>(Lcom/tv91/u/b/x0/m1;Lcom/tv91/model/a$a;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->j(Ljava/lang/Runnable;)V

    return-void
.end method

.method public p(Lcom/tv91/model/a$a;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tv91/model/a$a;",
            ")",
            "Ljava/util/List<",
            "Lcom/tv91/model/a;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/x0/m1;->i:Lcom/tv91/y/h;

    invoke-interface {v0}, Lcom/tv91/y/h;->e()Lcom/tv91/model/User;

    move-result-object v0

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance p1, Lcom/tv91/s/a;

    const-string v0, "NotLogin"

    invoke-direct {p1, v0}, Lcom/tv91/s/a;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/tv91/u/b/x0/m1;->j:Lcom/tv91/y/c;

    if-nez v0, :cond_2

    const-string v2, ""

    goto :goto_1

    :cond_2
    iget-object v2, v0, Lcom/tv91/model/User;->id:Ljava/lang/String;

    :goto_1
    invoke-interface {v1, v2}, Lcom/tv91/y/c;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    .line 4
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    :goto_2
    if-ge v2, v3, :cond_3

    .line 5
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/tv91/model/a;

    invoke-virtual {v4, v0}, Lcom/tv91/model/a;->d(Lcom/tv91/model/User;)Lcom/tv91/model/a;

    move-result-object v4

    invoke-interface {v1, v2, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    if-eqz p1, :cond_5

    .line 6
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 7
    :cond_4
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 8
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tv91/model/a;

    iget-object v2, v2, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    if-eq p1, v2, :cond_4

    .line 9
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_3

    :cond_5
    return-object v1
.end method

.method public synthetic s(Lcom/tv91/model/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/m1;->r(Lcom/tv91/model/a$a;)V

    return-void
.end method

.method public synthetic u(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/m1;->t(Ljava/util/List;)V

    return-void
.end method

.method public synthetic w(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/m1;->v(Lcom/tv91/s/c;)V

    return-void
.end method
