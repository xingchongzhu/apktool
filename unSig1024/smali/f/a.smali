.class public Lf/a;
.super Lf/t;
.source "AsyncTimeout.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf/a$c;
    }
.end annotation


# static fields
.field private static final e:J

.field private static final f:J

.field static g:Lf/a;


# instance fields
.field private h:Z

.field private i:Lf/a;

.field private j:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3c

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lf/a;->e:J

    .line 2
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Lf/a;->f:J

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lf/t;-><init>()V

    return-void
.end method

.method static i()Lf/a;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    const-class v0, Lf/a;

    sget-object v1, Lf/a;->g:Lf/a;

    iget-object v1, v1, Lf/a;->i:Lf/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    .line 2
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    .line 3
    sget-wide v5, Lf/a;->e:J

    invoke-virtual {v0, v5, v6}, Ljava/lang/Object;->wait(J)V

    .line 4
    sget-object v0, Lf/a;->g:Lf/a;

    iget-object v0, v0, Lf/a;->i:Lf/a;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    sub-long/2addr v0, v3

    sget-wide v3, Lf/a;->f:J

    cmp-long v5, v0, v3

    if-ltz v5, :cond_0

    .line 5
    sget-object v2, Lf/a;->g:Lf/a;

    :cond_0
    return-object v2

    .line 6
    :cond_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    invoke-direct {v1, v3, v4}, Lf/a;->p(J)J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-lez v7, :cond_2

    const-wide/32 v5, 0xf4240

    .line 7
    div-long v7, v3, v5

    mul-long v5, v5, v7

    sub-long/2addr v3, v5

    long-to-int v1, v3

    .line 8
    invoke-virtual {v0, v7, v8, v1}, Ljava/lang/Object;->wait(JI)V

    return-object v2

    .line 9
    :cond_2
    sget-object v0, Lf/a;->g:Lf/a;

    iget-object v3, v1, Lf/a;->i:Lf/a;

    iput-object v3, v0, Lf/a;->i:Lf/a;

    .line 10
    iput-object v2, v1, Lf/a;->i:Lf/a;

    return-object v1
.end method

.method private static declared-synchronized j(Lf/a;)Z
    .locals 3

    const-class v0, Lf/a;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lf/a;->g:Lf/a;

    :goto_0
    if-eqz v1, :cond_1

    .line 2
    iget-object v2, v1, Lf/a;->i:Lf/a;

    if-ne v2, p0, :cond_0

    .line 3
    iget-object v2, p0, Lf/a;->i:Lf/a;

    iput-object v2, v1, Lf/a;->i:Lf/a;

    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Lf/a;->i:Lf/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p0, 0x0

    .line 5
    monitor-exit v0

    return p0

    :cond_0
    move-object v1, v2

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    .line 6
    monitor-exit v0

    return p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    goto :goto_2

    :goto_1
    throw p0

    :goto_2
    goto :goto_1
.end method

.method private p(J)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lf/a;->j:J

    sub-long/2addr v0, p1

    return-wide v0
.end method

.method private static declared-synchronized q(Lf/a;JZ)V
    .locals 6

    const-class v0, Lf/a;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lf/a;->g:Lf/a;

    if-nez v1, :cond_0

    .line 2
    new-instance v1, Lf/a;

    invoke-direct {v1}, Lf/a;-><init>()V

    sput-object v1, Lf/a;->g:Lf/a;

    .line 3
    new-instance v1, Lf/a$c;

    invoke-direct {v1}, Lf/a$c;-><init>()V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 4
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, p1, v3

    if-eqz v5, :cond_1

    if-eqz p3, :cond_1

    .line 5
    invoke-virtual {p0}, Lf/t;->c()J

    move-result-wide v3

    sub-long/2addr v3, v1

    invoke-static {p1, p2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    add-long/2addr p1, v1

    iput-wide p1, p0, Lf/a;->j:J

    goto :goto_0

    :cond_1
    cmp-long v5, p1, v3

    if-eqz v5, :cond_2

    add-long/2addr p1, v1

    .line 6
    iput-wide p1, p0, Lf/a;->j:J

    goto :goto_0

    :cond_2
    if-eqz p3, :cond_6

    .line 7
    invoke-virtual {p0}, Lf/t;->c()J

    move-result-wide p1

    iput-wide p1, p0, Lf/a;->j:J

    .line 8
    :goto_0
    invoke-direct {p0, v1, v2}, Lf/a;->p(J)J

    move-result-wide p1

    .line 9
    sget-object p3, Lf/a;->g:Lf/a;

    .line 10
    :goto_1
    iget-object v3, p3, Lf/a;->i:Lf/a;

    if-eqz v3, :cond_4

    invoke-direct {v3, v1, v2}, Lf/a;->p(J)J

    move-result-wide v3

    cmp-long v5, p1, v3

    if-gez v5, :cond_3

    goto :goto_2

    .line 11
    :cond_3
    iget-object p3, p3, Lf/a;->i:Lf/a;

    goto :goto_1

    .line 12
    :cond_4
    :goto_2
    iget-object p1, p3, Lf/a;->i:Lf/a;

    iput-object p1, p0, Lf/a;->i:Lf/a;

    .line 13
    iput-object p0, p3, Lf/a;->i:Lf/a;

    .line 14
    sget-object p0, Lf/a;->g:Lf/a;

    if-ne p3, p0, :cond_5

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    :cond_5
    monitor-exit v0

    return-void

    .line 17
    :cond_6
    :try_start_1
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p0

    monitor-exit v0

    goto :goto_4

    :goto_3
    throw p0

    :goto_4
    goto :goto_3
.end method


# virtual methods
.method public final k()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lf/a;->h:Z

    if-nez v0, :cond_1

    .line 2
    invoke-virtual {p0}, Lf/t;->h()J

    move-result-wide v0

    .line 3
    invoke-virtual {p0}, Lf/t;->e()Z

    move-result v2

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    if-nez v2, :cond_0

    return-void

    :cond_0
    const/4 v3, 0x1

    .line 4
    iput-boolean v3, p0, Lf/a;->h:Z

    .line 5
    invoke-static {p0, v0, v1, v2}, Lf/a;->q(Lf/a;JZ)V

    return-void

    .line 6
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unbalanced enter/exit"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method final l(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lf/a;->n()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    .line 2
    :cond_0
    invoke-virtual {p0, p1}, Lf/a;->o(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method final m(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lf/a;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Lf/a;->o(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public final n()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lf/a;->h:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    iput-boolean v1, p0, Lf/a;->h:Z

    .line 3
    invoke-static {p0}, Lf/a;->j(Lf/a;)Z

    move-result v0

    return v0
.end method

.method protected o(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Ljava/io/InterruptedIOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_0
    return-object v0
.end method

.method public final r(Lf/r;)Lf/r;
    .locals 1

    .line 1
    new-instance v0, Lf/a$a;

    invoke-direct {v0, p0, p1}, Lf/a$a;-><init>(Lf/a;Lf/r;)V

    return-object v0
.end method

.method public final s(Lf/s;)Lf/s;
    .locals 1

    .line 1
    new-instance v0, Lf/a$b;

    invoke-direct {v0, p0, p1}, Lf/a$b;-><init>(Lf/a;Lf/s;)V

    return-object v0
.end method

.method protected t()V
    .locals 0

    return-void
.end method
