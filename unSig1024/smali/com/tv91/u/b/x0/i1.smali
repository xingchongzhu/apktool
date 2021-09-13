.class public final Lcom/tv91/u/b/x0/i1;
.super Lcom/tv91/q/b/d;
.source "GetDownloadStatementUseCase.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/b/x0/i1$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/q/b/d<",
        "Lcom/tv91/u/b/x0/i1$c;",
        ">;"
    }
.end annotation


# instance fields
.field private final i:Lcom/tv91/z/b;


# direct methods
.method public constructor <init>(Lcom/tv91/t/b;Lcom/tv91/z/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/q/b/d;-><init>(Lcom/tv91/t/b;)V

    .line 2
    iput-object p2, p0, Lcom/tv91/u/b/x0/i1;->i:Lcom/tv91/z/b;

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

    check-cast v1, Lcom/tv91/u/b/x0/i1$c;

    .line 2
    invoke-interface {v1}, Lcom/tv91/u/b/x0/i1$c;->c()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private B(Ljava/lang/String;)V
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

    check-cast v1, Lcom/tv91/u/b/x0/i1$c;

    .line 2
    invoke-interface {v1, p1}, Lcom/tv91/u/b/x0/i1$c;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic q(Lcom/tv91/u/b/x0/i1;)V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/b/x0/i1;->A()V

    return-void
.end method

.method private synthetic r()V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lcom/tv91/u/b/x0/l;

    invoke-direct {v0, p0}, Lcom/tv91/u/b/x0/l;-><init>(Lcom/tv91/u/b/x0/i1;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V

    .line 2
    invoke-virtual {p0}, Lcom/tv91/u/b/x0/i1;->p()Ljava/lang/String;

    move-result-object v0

    .line 3
    new-instance v1, Lcom/tv91/u/b/x0/m;

    invoke-direct {v1, p0, v0}, Lcom/tv91/u/b/x0/m;-><init>(Lcom/tv91/u/b/x0/i1;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    new-instance v0, Lcom/tv91/u/b/x0/n;

    invoke-direct {v0, p0}, Lcom/tv91/u/b/x0/n;-><init>(Lcom/tv91/u/b/x0/i1;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 5
    :try_start_1
    new-instance v1, Lcom/tv91/u/b/x0/k;

    invoke-direct {v1, p0, v0}, Lcom/tv91/u/b/x0/k;-><init>(Lcom/tv91/u/b/x0/i1;Ljava/lang/Exception;)V

    invoke-virtual {p0, v1}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    new-instance v0, Lcom/tv91/u/b/x0/n;

    invoke-direct {v0, p0}, Lcom/tv91/u/b/x0/n;-><init>(Lcom/tv91/u/b/x0/i1;)V

    :goto_0
    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V

    return-void

    :goto_1
    new-instance v1, Lcom/tv91/u/b/x0/n;

    invoke-direct {v1, p0}, Lcom/tv91/u/b/x0/n;-><init>(Lcom/tv91/u/b/x0/i1;)V

    invoke-virtual {p0, v1}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V

    .line 7
    throw v0
.end method

.method public static synthetic t(Lcom/tv91/u/b/x0/i1;)V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/b/x0/i1;->z()V

    return-void
.end method

.method private synthetic u(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/i1;->B(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic w(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/s/c;

    invoke-direct {v0, p1}, Lcom/tv91/s/c;-><init>(Ljava/lang/Exception;)V

    invoke-direct {p0, v0}, Lcom/tv91/u/b/x0/i1;->y(Lcom/tv91/s/c;)V

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

    check-cast v1, Lcom/tv91/u/b/x0/i1$c;

    .line 2
    invoke-interface {v1, p1}, Lcom/tv91/u/b/x0/i1$c;->a(Lcom/tv91/s/c;)V

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

    check-cast v1, Lcom/tv91/u/b/x0/i1$c;

    .line 2
    invoke-interface {v1}, Lcom/tv91/u/b/x0/i1$c;->b()V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method


# virtual methods
.method public C(Lb/g/j/a;)Lcom/tv91/u/b/x0/i1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/s/c;",
            ">;)",
            "Lcom/tv91/u/b/x0/i1;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/i1$b;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/b/x0/i1$b;-><init>(Lcom/tv91/u/b/x0/i1;Lb/g/j/a;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    return-object p0
.end method

.method public D(Lb/g/j/a;)Lcom/tv91/u/b/x0/i1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/tv91/u/b/x0/i1;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/i1$a;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/b/x0/i1$a;-><init>(Lcom/tv91/u/b/x0/i1;Lb/g/j/a;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    return-object p0
.end method

.method public o()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/o;

    invoke-direct {v0, p0}, Lcom/tv91/u/b/x0/o;-><init>(Lcom/tv91/u/b/x0/i1;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->j(Ljava/lang/Runnable;)V

    return-void
.end method

.method public p()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/x0/i1;->i:Lcom/tv91/z/b;

    invoke-interface {v0}, Lcom/tv91/z/b;->q()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public synthetic s()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/b/x0/i1;->r()V

    return-void
.end method

.method public synthetic v(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/i1;->u(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic x(Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/i1;->w(Ljava/lang/Exception;)V

    return-void
.end method
