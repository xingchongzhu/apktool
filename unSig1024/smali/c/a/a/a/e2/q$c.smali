.class Lc/a/a/a/e2/q$c;
.super Landroid/os/Handler;
.source "DefaultDrmSession.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "HandlerLeak"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/e2/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field private a:Z

.field final synthetic b:Lc/a/a/a/e2/q;


# direct methods
.method public constructor <init>(Lc/a/a/a/e2/q;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/e2/q$c;->b:Lc/a/a/a/e2/q;

    .line 2
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method

.method private a(Landroid/os/Message;Lc/a/a/a/e2/j0;)Z
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    .line 1
    iget-object v3, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v3, Lc/a/a/a/e2/q$d;

    .line 2
    iget-boolean v4, v3, Lc/a/a/a/e2/q$d;->b:Z

    const/4 v5, 0x0

    if-nez v4, :cond_0

    return v5

    .line 3
    :cond_0
    iget v4, v3, Lc/a/a/a/e2/q$d;->e:I

    const/4 v6, 0x1

    add-int/2addr v4, v6

    iput v4, v3, Lc/a/a/a/e2/q$d;->e:I

    .line 4
    iget-object v7, v1, Lc/a/a/a/e2/q$c;->b:Lc/a/a/a/e2/q;

    .line 5
    invoke-static {v7}, Lc/a/a/a/e2/q;->j(Lc/a/a/a/e2/q;)Lcom/google/android/exoplayer2/upstream/a0;

    move-result-object v7

    const/4 v8, 0x3

    invoke-interface {v7, v8}, Lcom/google/android/exoplayer2/upstream/a0;->d(I)I

    move-result v7

    if-le v4, v7, :cond_1

    return v5

    .line 6
    :cond_1
    new-instance v4, Lc/a/a/a/j2/w;

    iget-wide v10, v3, Lc/a/a/a/e2/q$d;->a:J

    iget-object v12, v2, Lc/a/a/a/e2/j0;->a:Lcom/google/android/exoplayer2/upstream/p;

    iget-object v13, v2, Lc/a/a/a/e2/j0;->b:Landroid/net/Uri;

    iget-object v14, v2, Lc/a/a/a/e2/j0;->c:Ljava/util/Map;

    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v15

    .line 8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v17

    iget-wide v6, v3, Lc/a/a/a/e2/q$d;->c:J

    sub-long v17, v17, v6

    iget-wide v6, v2, Lc/a/a/a/e2/j0;->d:J

    move-object v9, v4

    move-wide/from16 v19, v6

    invoke-direct/range {v9 .. v20}, Lc/a/a/a/j2/w;-><init>(JLcom/google/android/exoplayer2/upstream/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 9
    new-instance v6, Lc/a/a/a/j2/z;

    invoke-direct {v6, v8}, Lc/a/a/a/j2/z;-><init>(I)V

    .line 10
    invoke-virtual/range {p2 .. p2}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object v7

    instance-of v7, v7, Ljava/io/IOException;

    if-eqz v7, :cond_2

    .line 11
    invoke-virtual/range {p2 .. p2}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    check-cast v2, Ljava/io/IOException;

    goto :goto_0

    .line 12
    :cond_2
    new-instance v7, Lc/a/a/a/e2/q$f;

    invoke-virtual/range {p2 .. p2}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    invoke-direct {v7, v2}, Lc/a/a/a/e2/q$f;-><init>(Ljava/lang/Throwable;)V

    move-object v2, v7

    .line 13
    :goto_0
    iget-object v7, v1, Lc/a/a/a/e2/q$c;->b:Lc/a/a/a/e2/q;

    .line 14
    invoke-static {v7}, Lc/a/a/a/e2/q;->j(Lc/a/a/a/e2/q;)Lcom/google/android/exoplayer2/upstream/a0;

    move-result-object v7

    new-instance v8, Lcom/google/android/exoplayer2/upstream/a0$a;

    iget v3, v3, Lc/a/a/a/e2/q$d;->e:I

    invoke-direct {v8, v4, v6, v2, v3}, Lcom/google/android/exoplayer2/upstream/a0$a;-><init>(Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Ljava/io/IOException;I)V

    invoke-interface {v7, v8}, Lcom/google/android/exoplayer2/upstream/a0;->b(Lcom/google/android/exoplayer2/upstream/a0$a;)J

    move-result-wide v2

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v2, v6

    if-nez v4, :cond_3

    return v5

    .line 15
    :cond_3
    monitor-enter p0

    .line 16
    :try_start_0
    iget-boolean v4, v1, Lc/a/a/a/e2/q$c;->a:Z

    if-nez v4, :cond_4

    .line 17
    invoke-static/range {p1 .. p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 18
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    .line 19
    :cond_4
    monitor-exit p0

    return v5

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method b(ILjava/lang/Object;Z)V
    .locals 8

    .line 1
    new-instance v7, Lc/a/a/a/e2/q$d;

    .line 2
    invoke-static {}, Lc/a/a/a/j2/w;->a()J

    move-result-wide v1

    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    move-object v0, v7

    move v3, p3

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lc/a/a/a/e2/q$d;-><init>(JZJLjava/lang/Object;)V

    .line 4
    invoke-virtual {p0, p1, v7}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public declared-synchronized c()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lc/a/a/a/e2/q$c;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lc/a/a/a/e2/q$d;

    .line 2
    :try_start_0
    iget v1, p1, Landroid/os/Message;->what:I

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 3
    iget-object v1, p0, Lc/a/a/a/e2/q$c;->b:Lc/a/a/a/e2/q;

    iget-object v2, v1, Lc/a/a/a/e2/q;->k:Lc/a/a/a/e2/i0;

    iget-object v1, v1, Lc/a/a/a/e2/q;->l:Ljava/util/UUID;

    iget-object v3, v0, Lc/a/a/a/e2/q$d;->d:Ljava/lang/Object;

    check-cast v3, Lc/a/a/a/e2/d0$a;

    invoke-interface {v2, v1, v3}, Lc/a/a/a/e2/i0;->a(Ljava/util/UUID;Lc/a/a/a/e2/d0$a;)[B

    move-result-object v1

    goto :goto_0

    .line 4
    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    .line 5
    :cond_1
    iget-object v1, p0, Lc/a/a/a/e2/q$c;->b:Lc/a/a/a/e2/q;

    iget-object v2, v1, Lc/a/a/a/e2/q;->k:Lc/a/a/a/e2/i0;

    iget-object v1, v1, Lc/a/a/a/e2/q;->l:Ljava/util/UUID;

    iget-object v3, v0, Lc/a/a/a/e2/q$d;->d:Ljava/lang/Object;

    check-cast v3, Lc/a/a/a/e2/d0$d;

    .line 6
    invoke-interface {v2, v1, v3}, Lc/a/a/a/e2/i0;->b(Ljava/util/UUID;Lc/a/a/a/e2/d0$d;)[B

    move-result-object v1
    :try_end_0
    .catch Lc/a/a/a/e2/j0; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "DefaultDrmSession"

    const-string v3, "Key/provisioning request produced an unexpected exception. Not retrying."

    .line 7
    invoke-static {v2, v3, v1}, Lc/a/a/a/m2/t;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v1

    .line 8
    invoke-direct {p0, p1, v1}, Lc/a/a/a/e2/q$c;->a(Landroid/os/Message;Lc/a/a/a/e2/j0;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-void

    .line 9
    :cond_2
    :goto_0
    iget-object v2, p0, Lc/a/a/a/e2/q$c;->b:Lc/a/a/a/e2/q;

    invoke-static {v2}, Lc/a/a/a/e2/q;->j(Lc/a/a/a/e2/q;)Lcom/google/android/exoplayer2/upstream/a0;

    move-result-object v2

    iget-wide v3, v0, Lc/a/a/a/e2/q$d;->a:J

    invoke-interface {v2, v3, v4}, Lcom/google/android/exoplayer2/upstream/a0;->a(J)V

    .line 10
    monitor-enter p0

    .line 11
    :try_start_1
    iget-boolean v2, p0, Lc/a/a/a/e2/q$c;->a:Z

    if-nez v2, :cond_3

    .line 12
    iget-object v2, p0, Lc/a/a/a/e2/q$c;->b:Lc/a/a/a/e2/q;

    iget-object v2, v2, Lc/a/a/a/e2/q;->m:Lc/a/a/a/e2/q$e;

    iget p1, p1, Landroid/os/Message;->what:I

    iget-object v0, v0, Lc/a/a/a/e2/q$d;->d:Ljava/lang/Object;

    .line 13
    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    invoke-virtual {v2, p1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 14
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 15
    :cond_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
