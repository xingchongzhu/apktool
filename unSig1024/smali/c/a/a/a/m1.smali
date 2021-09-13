.class public final Lc/a/a/a/m1;
.super Ljava/lang/Object;
.source "PlayerMessage.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/m1$a;,
        Lc/a/a/a/m1$b;
    }
.end annotation


# instance fields
.field private final a:Lc/a/a/a/m1$b;

.field private final b:Lc/a/a/a/m1$a;

.field private final c:Lc/a/a/a/m2/g;

.field private final d:Lc/a/a/a/x1;

.field private e:I

.field private f:Ljava/lang/Object;

.field private g:Landroid/os/Looper;

.field private h:I

.field private i:J

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z


# direct methods
.method public constructor <init>(Lc/a/a/a/m1$a;Lc/a/a/a/m1$b;Lc/a/a/a/x1;ILc/a/a/a/m2/g;Landroid/os/Looper;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/m1;->b:Lc/a/a/a/m1$a;

    .line 3
    iput-object p2, p0, Lc/a/a/a/m1;->a:Lc/a/a/a/m1$b;

    .line 4
    iput-object p3, p0, Lc/a/a/a/m1;->d:Lc/a/a/a/x1;

    .line 5
    iput-object p6, p0, Lc/a/a/a/m1;->g:Landroid/os/Looper;

    .line 6
    iput-object p5, p0, Lc/a/a/a/m1;->c:Lc/a/a/a/m2/g;

    .line 7
    iput p4, p0, Lc/a/a/a/m1;->h:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    iput-wide p1, p0, Lc/a/a/a/m1;->i:J

    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lc/a/a/a/m1;->j:Z

    return-void
.end method


# virtual methods
.method public declared-synchronized a(J)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/TimeoutException;
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lc/a/a/a/m1;->k:Z

    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/m1;->g:Landroid/os/Looper;

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 3
    iget-object v0, p0, Lc/a/a/a/m1;->c:Lc/a/a/a/m2/g;

    invoke-interface {v0}, Lc/a/a/a/m2/g;->c()J

    move-result-wide v0

    add-long/2addr v0, p1

    .line 4
    :goto_1
    iget-boolean v2, p0, Lc/a/a/a/m1;->m:Z

    if-nez v2, :cond_1

    const-wide/16 v3, 0x0

    cmp-long v5, p1, v3

    if-lez v5, :cond_1

    .line 5
    invoke-virtual {p0, p1, p2}, Ljava/lang/Object;->wait(J)V

    .line 6
    iget-object p1, p0, Lc/a/a/a/m1;->c:Lc/a/a/a/m2/g;

    invoke-interface {p1}, Lc/a/a/a/m2/g;->c()J

    move-result-wide p1

    sub-long p1, v0, p1

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_2

    .line 7
    iget-boolean p1, p0, Lc/a/a/a/m1;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    .line 8
    :cond_2
    :try_start_1
    new-instance p1, Ljava/util/concurrent/TimeoutException;

    const-string p2, "Message delivery timed out."

    invoke-direct {p1, p2}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/m1;->j:Z

    return v0
.end method

.method public c()Landroid/os/Looper;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/m1;->g:Landroid/os/Looper;

    return-object v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/m1;->f:Ljava/lang/Object;

    return-object v0
.end method

.method public e()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/m1;->i:J

    return-wide v0
.end method

.method public f()Lc/a/a/a/m1$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/m1;->a:Lc/a/a/a/m1$b;

    return-object v0
.end method

.method public g()Lc/a/a/a/x1;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/m1;->d:Lc/a/a/a/x1;

    return-object v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/m1;->e:I

    return v0
.end method

.method public i()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/m1;->h:I

    return v0
.end method

.method public declared-synchronized j()Z
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lc/a/a/a/m1;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized k(Z)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lc/a/a/a/m1;->l:Z

    or-int/2addr p1, v0

    iput-boolean p1, p0, Lc/a/a/a/m1;->l:Z

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lc/a/a/a/m1;->m:Z

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public l()Lc/a/a/a/m1;
    .locals 6

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/m1;->k:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    iget-wide v2, p0, Lc/a/a/a/m1;->i:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    .line 3
    iget-boolean v0, p0, Lc/a/a/a/m1;->j:Z

    invoke-static {v0}, Lc/a/a/a/m2/f;->a(Z)V

    .line 4
    :cond_0
    iput-boolean v1, p0, Lc/a/a/a/m1;->k:Z

    .line 5
    iget-object v0, p0, Lc/a/a/a/m1;->b:Lc/a/a/a/m1$a;

    invoke-interface {v0, p0}, Lc/a/a/a/m1$a;->a(Lc/a/a/a/m1;)V

    return-object p0
.end method

.method public m(Ljava/lang/Object;)Lc/a/a/a/m1;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/m1;->k:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    iput-object p1, p0, Lc/a/a/a/m1;->f:Ljava/lang/Object;

    return-object p0
.end method

.method public n(I)Lc/a/a/a/m1;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/m1;->k:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    iput p1, p0, Lc/a/a/a/m1;->e:I

    return-object p0
.end method
