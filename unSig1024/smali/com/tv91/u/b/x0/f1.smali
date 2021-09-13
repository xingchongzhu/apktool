.class public final Lcom/tv91/u/b/x0/f1;
.super Lcom/tv91/q/b/d;
.source "AddDownloadUseCase.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/b/x0/f1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/q/b/d<",
        "Lcom/tv91/u/b/x0/f1$a;",
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
    iput-object p2, p0, Lcom/tv91/u/b/x0/f1;->i:Lcom/tv91/y/h;

    .line 3
    iput-object p3, p0, Lcom/tv91/u/b/x0/f1;->j:Lcom/tv91/y/c;

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

    check-cast v1, Lcom/tv91/u/b/x0/f1$a;

    .line 2
    invoke-interface {v1}, Lcom/tv91/u/b/x0/f1$a;->h()V

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

    check-cast v1, Lcom/tv91/u/b/x0/f1$a;

    .line 2
    invoke-interface {v1, p1}, Lcom/tv91/u/b/x0/f1$a;->o(Lcom/tv91/model/a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic q(Lcom/tv91/u/b/x0/f1;)V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/b/x0/f1;->A()V

    return-void
.end method

.method private synthetic r(Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/tv91/u/b/x0/a;

    invoke-direct {v0, p0}, Lcom/tv91/u/b/x0/a;-><init>(Lcom/tv91/u/b/x0/f1;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/tv91/u/b/x0/f1;->p(Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;Ljava/lang/String;)Lcom/tv91/model/a;

    move-result-object p1

    .line 3
    new-instance p2, Lcom/tv91/u/b/x0/d;

    invoke-direct {p2, p0, p1}, Lcom/tv91/u/b/x0/d;-><init>(Lcom/tv91/u/b/x0/f1;Lcom/tv91/model/a;)V

    invoke-virtual {p0, p2}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    new-instance p1, Lcom/tv91/u/b/x0/e;

    invoke-direct {p1, p0}, Lcom/tv91/u/b/x0/e;-><init>(Lcom/tv91/u/b/x0/f1;)V

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
    new-instance p2, Lcom/tv91/s/c;

    invoke-direct {p2, p1}, Lcom/tv91/s/c;-><init>(Ljava/lang/Exception;)V

    .line 6
    invoke-virtual {p2}, Lcom/tv91/s/c;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 7
    iget-object p1, p0, Lcom/tv91/u/b/x0/f1;->i:Lcom/tv91/y/h;

    invoke-interface {p1}, Lcom/tv91/y/h;->i()V

    .line 8
    :cond_0
    new-instance p1, Lcom/tv91/u/b/x0/c;

    invoke-direct {p1, p0, p2}, Lcom/tv91/u/b/x0/c;-><init>(Lcom/tv91/u/b/x0/f1;Lcom/tv91/s/c;)V

    invoke-virtual {p0, p1}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    new-instance p1, Lcom/tv91/u/b/x0/e;

    invoke-direct {p1, p0}, Lcom/tv91/u/b/x0/e;-><init>(Lcom/tv91/u/b/x0/f1;)V

    goto :goto_0

    :goto_1
    return-void

    :goto_2
    new-instance p2, Lcom/tv91/u/b/x0/e;

    invoke-direct {p2, p0}, Lcom/tv91/u/b/x0/e;-><init>(Lcom/tv91/u/b/x0/f1;)V

    invoke-virtual {p0, p2}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V

    .line 10
    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method

.method private synthetic t(Lcom/tv91/model/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/f1;->B(Lcom/tv91/model/a;)V

    return-void
.end method

.method private synthetic v(Lcom/tv91/s/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/f1;->y(Lcom/tv91/s/c;)V

    return-void
.end method

.method public static synthetic x(Lcom/tv91/u/b/x0/f1;)V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/b/x0/f1;->z()V

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

    check-cast v1, Lcom/tv91/u/b/x0/f1$a;

    .line 2
    invoke-interface {v1, p1}, Lcom/tv91/u/b/x0/f1$a;->a(Lcom/tv91/s/c;)V

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

    check-cast v1, Lcom/tv91/u/b/x0/f1$a;

    .line 2
    invoke-interface {v1}, Lcom/tv91/u/b/x0/f1$a;->q()V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public o(Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/b;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/tv91/u/b/x0/b;-><init>(Lcom/tv91/u/b/x0/f1;Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->j(Ljava/lang/Runnable;)V

    return-void
.end method

.method public p(Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;Ljava/lang/String;)Lcom/tv91/model/a;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/x0/f1;->i:Lcom/tv91/y/h;

    invoke-interface {v0}, Lcom/tv91/y/h;->e()Lcom/tv91/model/User;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/tv91/u/b/x0/f1;->j:Lcom/tv91/y/c;

    invoke-interface {v1, v0, p1, p2, p3}, Lcom/tv91/y/c;->i(Lcom/tv91/model/User;Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;Ljava/lang/String;)Lcom/tv91/model/a;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    new-instance p1, Lcom/tv91/s/a;

    const-string p2, "NotLogin"

    invoke-direct {p1, p2}, Lcom/tv91/s/a;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic s(Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/tv91/u/b/x0/f1;->r(Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic u(Lcom/tv91/model/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/f1;->t(Lcom/tv91/model/a;)V

    return-void
.end method

.method public synthetic w(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/f1;->v(Lcom/tv91/s/c;)V

    return-void
.end method
