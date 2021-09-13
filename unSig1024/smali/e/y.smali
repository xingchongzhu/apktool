.class final Le/y;
.super Ljava/lang/Object;
.source "RealCall.java"

# interfaces
.implements Le/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/y$b;
    }
.end annotation


# instance fields
.field final a:Le/w;

.field final b:Le/f0/g/j;

.field final c:Lf/a;

.field private d:Le/p;

.field final e:Le/z;

.field final f:Z

.field private g:Z


# direct methods
.method private constructor <init>(Le/w;Le/z;Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/y;->a:Le/w;

    .line 3
    iput-object p2, p0, Le/y;->e:Le/z;

    .line 4
    iput-boolean p3, p0, Le/y;->f:Z

    .line 5
    new-instance p2, Le/f0/g/j;

    invoke-direct {p2, p1, p3}, Le/f0/g/j;-><init>(Le/w;Z)V

    iput-object p2, p0, Le/y;->b:Le/f0/g/j;

    .line 6
    new-instance p2, Le/y$a;

    invoke-direct {p2, p0}, Le/y$a;-><init>(Le/y;)V

    iput-object p2, p0, Le/y;->c:Lf/a;

    .line 7
    invoke-virtual {p1}, Le/w;->b()I

    move-result p1

    int-to-long v0, p1

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, v0, v1, p1}, Lf/t;->g(JLjava/util/concurrent/TimeUnit;)Lf/t;

    return-void
.end method

.method static synthetic a(Le/y;)Le/p;
    .locals 0

    .line 1
    iget-object p0, p0, Le/y;->d:Le/p;

    return-object p0
.end method

.method private b()V
    .locals 2

    .line 1
    invoke-static {}, Le/f0/j/g;->l()Le/f0/j/g;

    move-result-object v0

    const-string v1, "response.body().close()"

    invoke-virtual {v0, v1}, Le/f0/j/g;->o(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 2
    iget-object v1, p0, Le/y;->b:Le/f0/g/j;

    invoke-virtual {v1, v0}, Le/f0/g/j;->k(Ljava/lang/Object;)V

    return-void
.end method

.method static e(Le/w;Le/z;Z)Le/y;
    .locals 1

    .line 1
    new-instance v0, Le/y;

    invoke-direct {v0, p0, p1, p2}, Le/y;-><init>(Le/w;Le/z;Z)V

    .line 2
    invoke-virtual {p0}, Le/w;->j()Le/p$c;

    move-result-object p0

    invoke-interface {p0, v0}, Le/p$c;->a(Le/e;)Le/p;

    move-result-object p0

    iput-object p0, v0, Le/y;->d:Le/p;

    return-object v0
.end method


# virtual methods
.method public S()Le/z;
    .locals 1

    .line 1
    iget-object v0, p0, Le/y;->e:Le/z;

    return-object v0
.end method

.method public T(Le/f;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Le/y;->g:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Le/y;->g:Z

    .line 4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    invoke-direct {p0}, Le/y;->b()V

    .line 6
    iget-object v0, p0, Le/y;->d:Le/p;

    invoke-virtual {v0, p0}, Le/p;->c(Le/e;)V

    .line 7
    iget-object v0, p0, Le/y;->a:Le/w;

    invoke-virtual {v0}, Le/w;->h()Le/n;

    move-result-object v0

    new-instance v1, Le/y$b;

    invoke-direct {v1, p0, p1}, Le/y$b;-><init>(Le/y;Le/f;)V

    invoke-virtual {v0, v1}, Le/n;->a(Le/y$b;)V

    return-void

    .line 8
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already Executed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 9
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public U()Le/b0;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Le/y;->g:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Le/y;->g:Z

    .line 4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    invoke-direct {p0}, Le/y;->b()V

    .line 6
    iget-object v0, p0, Le/y;->c:Lf/a;

    invoke-virtual {v0}, Lf/a;->k()V

    .line 7
    iget-object v0, p0, Le/y;->d:Le/p;

    invoke-virtual {v0, p0}, Le/p;->c(Le/e;)V

    .line 8
    :try_start_1
    iget-object v0, p0, Le/y;->a:Le/w;

    invoke-virtual {v0}, Le/w;->h()Le/n;

    move-result-object v0

    invoke-virtual {v0, p0}, Le/n;->b(Le/y;)V

    .line 9
    invoke-virtual {p0}, Le/y;->d()Le/b0;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_0

    .line 10
    iget-object v1, p0, Le/y;->a:Le/w;

    invoke-virtual {v1}, Le/w;->h()Le/n;

    move-result-object v1

    invoke-virtual {v1, p0}, Le/n;->f(Le/y;)V

    return-object v0

    .line 11
    :cond_0
    :try_start_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Canceled"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 12
    :try_start_3
    invoke-virtual {p0, v0}, Le/y;->g(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    .line 13
    iget-object v1, p0, Le/y;->d:Le/p;

    invoke-virtual {v1, p0, v0}, Le/p;->b(Le/e;Ljava/io/IOException;)V

    .line 14
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 15
    :goto_0
    iget-object v1, p0, Le/y;->a:Le/w;

    invoke-virtual {v1}, Le/w;->h()Le/n;

    move-result-object v1

    invoke-virtual {v1, p0}, Le/n;->f(Le/y;)V

    throw v0

    .line 16
    :cond_1
    :try_start_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already Executed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    .line 17
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0
.end method

.method public V()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/y;->b:Le/f0/g/j;

    invoke-virtual {v0}, Le/f0/g/j;->e()Z

    move-result v0

    return v0
.end method

.method public c()Le/y;
    .locals 3

    .line 1
    iget-object v0, p0, Le/y;->a:Le/w;

    iget-object v1, p0, Le/y;->e:Le/z;

    iget-boolean v2, p0, Le/y;->f:Z

    invoke-static {v0, v1, v2}, Le/y;->e(Le/w;Le/z;Z)Le/y;

    move-result-object v0

    return-object v0
.end method

.method public cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/y;->b:Le/f0/g/j;

    invoke-virtual {v0}, Le/f0/g/j;->b()V

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/y;->c()Le/y;

    move-result-object v0

    return-object v0
.end method

.method d()Le/b0;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2
    iget-object v0, p0, Le/y;->a:Le/w;

    invoke-virtual {v0}, Le/w;->n()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 3
    iget-object v0, p0, Le/y;->b:Le/f0/g/j;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    new-instance v0, Le/f0/g/a;

    iget-object v2, p0, Le/y;->a:Le/w;

    invoke-virtual {v2}, Le/w;->g()Le/m;

    move-result-object v2

    invoke-direct {v0, v2}, Le/f0/g/a;-><init>(Le/m;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    new-instance v0, Le/f0/e/a;

    iget-object v2, p0, Le/y;->a:Le/w;

    invoke-virtual {v2}, Le/w;->o()Le/f0/e/d;

    move-result-object v2

    invoke-direct {v0, v2}, Le/f0/e/a;-><init>(Le/f0/e/d;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    new-instance v0, Le/f0/f/a;

    iget-object v2, p0, Le/y;->a:Le/w;

    invoke-direct {v0, v2}, Le/f0/f/a;-><init>(Le/w;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    iget-boolean v0, p0, Le/y;->f:Z

    if-nez v0, :cond_0

    .line 8
    iget-object v0, p0, Le/y;->a:Le/w;

    invoke-virtual {v0}, Le/w;->p()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 9
    :cond_0
    new-instance v0, Le/f0/g/b;

    iget-boolean v2, p0, Le/y;->f:Z

    invoke-direct {v0, v2}, Le/f0/g/b;-><init>(Z)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    new-instance v12, Le/f0/g/g;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v6, p0, Le/y;->e:Le/z;

    iget-object v8, p0, Le/y;->d:Le/p;

    iget-object v0, p0, Le/y;->a:Le/w;

    .line 11
    invoke-virtual {v0}, Le/w;->d()I

    move-result v9

    iget-object v0, p0, Le/y;->a:Le/w;

    .line 12
    invoke-virtual {v0}, Le/w;->x()I

    move-result v10

    iget-object v0, p0, Le/y;->a:Le/w;

    invoke-virtual {v0}, Le/w;->B()I

    move-result v11

    move-object v0, v12

    move-object v7, p0

    invoke-direct/range {v0 .. v11}, Le/f0/g/g;-><init>(Ljava/util/List;Le/f0/f/g;Le/f0/g/c;Le/f0/f/c;ILe/z;Le/e;Le/p;III)V

    .line 13
    iget-object v0, p0, Le/y;->e:Le/z;

    invoke-interface {v12, v0}, Le/u$a;->d(Le/z;)Le/b0;

    move-result-object v0

    .line 14
    iget-object v1, p0, Le/y;->b:Le/f0/g/j;

    invoke-virtual {v1}, Le/f0/g/j;->e()Z

    move-result v1

    if-nez v1, :cond_1

    return-object v0

    .line 15
    :cond_1
    invoke-static {v0}, Le/f0/c;->f(Ljava/io/Closeable;)V

    .line 16
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Canceled"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/y;->e:Le/z;

    invoke-virtual {v0}, Le/z;->i()Le/t;

    move-result-object v0

    invoke-virtual {v0}, Le/t;->B()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method g(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    iget-object v0, p0, Le/y;->c:Lf/a;

    invoke-virtual {v0}, Lf/a;->n()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    .line 2
    :cond_0
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {v0, p1}, Ljava/io/InterruptedIOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_1
    return-object v0
.end method

.method h()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Le/y;->V()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "canceled "

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-boolean v1, p0, Le/y;->f:Z

    if-eqz v1, :cond_1

    const-string v1, "web socket"

    goto :goto_1

    :cond_1
    const-string v1, "call"

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {p0}, Le/y;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
