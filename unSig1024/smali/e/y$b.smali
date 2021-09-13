.class final Le/y$b;
.super Le/f0/b;
.source "RealCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation


# instance fields
.field private final b:Le/f;

.field final synthetic c:Le/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Le/y;

    return-void
.end method

.method constructor <init>(Le/y;Le/f;)V
    .locals 2

    .line 1
    iput-object p1, p0, Le/y$b;->c:Le/y;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    .line 2
    invoke-virtual {p1}, Le/y;->f()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "OkHttp %s"

    invoke-direct {p0, p1, v0}, Le/f0/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3
    iput-object p2, p0, Le/y$b;->b:Le/f;

    return-void
.end method


# virtual methods
.method protected k()V
    .locals 5

    .line 1
    iget-object v0, p0, Le/y$b;->c:Le/y;

    iget-object v0, v0, Le/y;->c:Lf/a;

    invoke-virtual {v0}, Lf/a;->k()V

    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/y$b;->c:Le/y;

    invoke-virtual {v1}, Le/y;->d()Le/b0;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x1

    .line 3
    :try_start_1
    iget-object v2, p0, Le/y$b;->b:Le/f;

    iget-object v3, p0, Le/y$b;->c:Le/y;

    invoke-interface {v2, v3, v0}, Le/f;->a(Le/e;Le/b0;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 4
    :goto_0
    iget-object v0, p0, Le/y$b;->c:Le/y;

    iget-object v0, v0, Le/y;->a:Le/w;

    invoke-virtual {v0}, Le/w;->h()Le/n;

    move-result-object v0

    invoke-virtual {v0, p0}, Le/n;->e(Le/y$b;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :catchall_1
    move-exception v1

    move-object v0, v1

    const/4 v1, 0x0

    .line 5
    :goto_1
    :try_start_2
    iget-object v2, p0, Le/y$b;->c:Le/y;

    invoke-virtual {v2}, Le/y;->cancel()V

    if-nez v1, :cond_0

    .line 6
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "canceled due to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 7
    iget-object v2, p0, Le/y$b;->b:Le/f;

    iget-object v3, p0, Le/y$b;->c:Le/y;

    invoke-interface {v2, v3, v1}, Le/f;->b(Le/e;Ljava/io/IOException;)V

    .line 8
    :cond_0
    throw v0

    :catch_1
    move-exception v1

    move-object v0, v1

    const/4 v1, 0x0

    .line 9
    :goto_2
    iget-object v2, p0, Le/y$b;->c:Le/y;

    invoke-virtual {v2, v0}, Le/y;->g(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    if-eqz v1, :cond_1

    .line 10
    invoke-static {}, Le/f0/j/g;->l()Le/f0/j/g;

    move-result-object v1

    const/4 v2, 0x4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Callback failure for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Le/y$b;->c:Le/y;

    invoke-virtual {v4}, Le/y;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Le/f0/j/g;->s(ILjava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 11
    :cond_1
    iget-object v1, p0, Le/y$b;->c:Le/y;

    invoke-static {v1}, Le/y;->a(Le/y;)Le/p;

    move-result-object v1

    iget-object v2, p0, Le/y$b;->c:Le/y;

    invoke-virtual {v1, v2, v0}, Le/p;->b(Le/e;Ljava/io/IOException;)V

    .line 12
    iget-object v1, p0, Le/y$b;->b:Le/f;

    iget-object v2, p0, Le/y$b;->c:Le/y;

    invoke-interface {v1, v2, v0}, Le/f;->b(Le/e;Ljava/io/IOException;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    :goto_3
    return-void

    :catchall_2
    move-exception v0

    .line 13
    iget-object v1, p0, Le/y$b;->c:Le/y;

    iget-object v1, v1, Le/y;->a:Le/w;

    invoke-virtual {v1}, Le/w;->h()Le/n;

    move-result-object v1

    invoke-virtual {v1, p0}, Le/n;->e(Le/y$b;)V

    goto :goto_5

    :goto_4
    throw v0

    :goto_5
    goto :goto_4
.end method

.method l(Ljava/util/concurrent/ExecutorService;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-interface {p1, p0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 2
    :try_start_1
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "executor rejected"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0, p1}, Ljava/io/InterruptedIOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 4
    iget-object p1, p0, Le/y$b;->c:Le/y;

    invoke-static {p1}, Le/y;->a(Le/y;)Le/p;

    move-result-object p1

    iget-object v1, p0, Le/y$b;->c:Le/y;

    invoke-virtual {p1, v1, v0}, Le/p;->b(Le/e;Ljava/io/IOException;)V

    .line 5
    iget-object p1, p0, Le/y$b;->b:Le/f;

    iget-object v1, p0, Le/y$b;->c:Le/y;

    invoke-interface {p1, v1, v0}, Le/f;->b(Le/e;Ljava/io/IOException;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    iget-object p1, p0, Le/y$b;->c:Le/y;

    iget-object p1, p1, Le/y;->a:Le/w;

    invoke-virtual {p1}, Le/w;->h()Le/n;

    move-result-object p1

    invoke-virtual {p1, p0}, Le/n;->e(Le/y$b;)V

    :goto_0
    return-void

    :goto_1
    iget-object v0, p0, Le/y$b;->c:Le/y;

    iget-object v0, v0, Le/y;->a:Le/w;

    invoke-virtual {v0}, Le/w;->h()Le/n;

    move-result-object v0

    invoke-virtual {v0, p0}, Le/n;->e(Le/y$b;)V

    throw p1
.end method

.method m()Le/y;
    .locals 1

    .line 1
    iget-object v0, p0, Le/y$b;->c:Le/y;

    return-object v0
.end method

.method n()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/y$b;->c:Le/y;

    iget-object v0, v0, Le/y;->e:Le/z;

    invoke-virtual {v0}, Le/z;->i()Le/t;

    move-result-object v0

    invoke-virtual {v0}, Le/t;->m()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
