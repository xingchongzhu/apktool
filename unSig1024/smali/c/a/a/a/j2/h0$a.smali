.class final Lc/a/a/a/j2/h0$a;
.super Ljava/lang/Object;
.source "ProgressiveMediaPeriod.java"

# interfaces
.implements Lcom/google/android/exoplayer2/upstream/b0$e;
.implements Lc/a/a/a/j2/v$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/j2/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field private final a:J

.field private final b:Landroid/net/Uri;

.field private final c:Lcom/google/android/exoplayer2/upstream/d0;

.field private final d:Lc/a/a/a/j2/g0;

.field private final e:Lc/a/a/a/f2/l;

.field private final f:Lc/a/a/a/m2/j;

.field private final g:Lc/a/a/a/f2/x;

.field private volatile h:Z

.field private i:Z

.field private j:J

.field private k:Lcom/google/android/exoplayer2/upstream/p;

.field private l:J

.field private m:Lc/a/a/a/f2/b0;

.field private n:Z

.field final synthetic o:Lc/a/a/a/j2/h0;


# direct methods
.method public constructor <init>(Lc/a/a/a/j2/h0;Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/m;Lc/a/a/a/j2/g0;Lc/a/a/a/f2/l;Lc/a/a/a/m2/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/j2/h0$a;->o:Lc/a/a/a/j2/h0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lc/a/a/a/j2/h0$a;->b:Landroid/net/Uri;

    .line 3
    new-instance p1, Lcom/google/android/exoplayer2/upstream/d0;

    invoke-direct {p1, p3}, Lcom/google/android/exoplayer2/upstream/d0;-><init>(Lcom/google/android/exoplayer2/upstream/m;)V

    iput-object p1, p0, Lc/a/a/a/j2/h0$a;->c:Lcom/google/android/exoplayer2/upstream/d0;

    .line 4
    iput-object p4, p0, Lc/a/a/a/j2/h0$a;->d:Lc/a/a/a/j2/g0;

    .line 5
    iput-object p5, p0, Lc/a/a/a/j2/h0$a;->e:Lc/a/a/a/f2/l;

    .line 6
    iput-object p6, p0, Lc/a/a/a/j2/h0$a;->f:Lc/a/a/a/m2/j;

    .line 7
    new-instance p1, Lc/a/a/a/f2/x;

    invoke-direct {p1}, Lc/a/a/a/f2/x;-><init>()V

    iput-object p1, p0, Lc/a/a/a/j2/h0$a;->g:Lc/a/a/a/f2/x;

    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lc/a/a/a/j2/h0$a;->i:Z

    const-wide/16 p1, -0x1

    .line 9
    iput-wide p1, p0, Lc/a/a/a/j2/h0$a;->l:J

    .line 10
    invoke-static {}, Lc/a/a/a/j2/w;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lc/a/a/a/j2/h0$a;->a:J

    const-wide/16 p1, 0x0

    .line 11
    invoke-direct {p0, p1, p2}, Lc/a/a/a/j2/h0$a;->j(J)Lcom/google/android/exoplayer2/upstream/p;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/j2/h0$a;->k:Lcom/google/android/exoplayer2/upstream/p;

    return-void
.end method

.method static synthetic d(Lc/a/a/a/j2/h0$a;)Lcom/google/android/exoplayer2/upstream/d0;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/j2/h0$a;->c:Lcom/google/android/exoplayer2/upstream/d0;

    return-object p0
.end method

.method static synthetic e(Lc/a/a/a/j2/h0$a;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/j2/h0$a;->a:J

    return-wide v0
.end method

.method static synthetic f(Lc/a/a/a/j2/h0$a;)Lcom/google/android/exoplayer2/upstream/p;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/j2/h0$a;->k:Lcom/google/android/exoplayer2/upstream/p;

    return-object p0
.end method

.method static synthetic g(Lc/a/a/a/j2/h0$a;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/j2/h0$a;->j:J

    return-wide v0
.end method

.method static synthetic h(Lc/a/a/a/j2/h0$a;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/j2/h0$a;->l:J

    return-wide v0
.end method

.method static synthetic i(Lc/a/a/a/j2/h0$a;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lc/a/a/a/j2/h0$a;->k(JJ)V

    return-void
.end method

.method private j(J)Lcom/google/android/exoplayer2/upstream/p;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/exoplayer2/upstream/p$b;

    invoke-direct {v0}, Lcom/google/android/exoplayer2/upstream/p$b;-><init>()V

    iget-object v1, p0, Lc/a/a/a/j2/h0$a;->b:Landroid/net/Uri;

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/upstream/p$b;->i(Landroid/net/Uri;)Lcom/google/android/exoplayer2/upstream/p$b;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/google/android/exoplayer2/upstream/p$b;->h(J)Lcom/google/android/exoplayer2/upstream/p$b;

    move-result-object p1

    iget-object p2, p0, Lc/a/a/a/j2/h0$a;->o:Lc/a/a/a/j2/h0;

    .line 4
    invoke-static {p2}, Lc/a/a/a/j2/h0;->z(Lc/a/a/a/j2/h0;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/exoplayer2/upstream/p$b;->f(Ljava/lang/String;)Lcom/google/android/exoplayer2/upstream/p$b;

    move-result-object p1

    const/4 p2, 0x6

    .line 5
    invoke-virtual {p1, p2}, Lcom/google/android/exoplayer2/upstream/p$b;->b(I)Lcom/google/android/exoplayer2/upstream/p$b;

    move-result-object p1

    .line 6
    invoke-static {}, Lc/a/a/a/j2/h0;->y()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/exoplayer2/upstream/p$b;->e(Ljava/util/Map;)Lcom/google/android/exoplayer2/upstream/p$b;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/upstream/p$b;->a()Lcom/google/android/exoplayer2/upstream/p;

    move-result-object p1

    return-object p1
.end method

.method private k(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/h0$a;->g:Lc/a/a/a/f2/x;

    iput-wide p1, v0, Lc/a/a/a/f2/x;->a:J

    .line 2
    iput-wide p3, p0, Lc/a/a/a/j2/h0$a;->j:J

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lc/a/a/a/j2/h0$a;->i:Z

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lc/a/a/a/j2/h0$a;->n:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v1, p0

    const/4 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_9

    .line 1
    iget-boolean v3, v1, Lc/a/a/a/j2/h0$a;->h:Z

    if-nez v3, :cond_9

    const/4 v3, 0x1

    const-wide/16 v4, -0x1

    .line 2
    :try_start_0
    iget-object v6, v1, Lc/a/a/a/j2/h0$a;->g:Lc/a/a/a/f2/x;

    iget-wide v13, v6, Lc/a/a/a/f2/x;->a:J

    .line 3
    invoke-direct {v1, v13, v14}, Lc/a/a/a/j2/h0$a;->j(J)Lcom/google/android/exoplayer2/upstream/p;

    move-result-object v6

    iput-object v6, v1, Lc/a/a/a/j2/h0$a;->k:Lcom/google/android/exoplayer2/upstream/p;

    .line 4
    iget-object v7, v1, Lc/a/a/a/j2/h0$a;->c:Lcom/google/android/exoplayer2/upstream/d0;

    invoke-virtual {v7, v6}, Lcom/google/android/exoplayer2/upstream/d0;->e(Lcom/google/android/exoplayer2/upstream/p;)J

    move-result-wide v6

    iput-wide v6, v1, Lc/a/a/a/j2/h0$a;->l:J

    cmp-long v8, v6, v4

    if-eqz v8, :cond_0

    add-long/2addr v6, v13

    .line 5
    iput-wide v6, v1, Lc/a/a/a/j2/h0$a;->l:J

    .line 6
    :cond_0
    iget-object v6, v1, Lc/a/a/a/j2/h0$a;->o:Lc/a/a/a/j2/h0;

    iget-object v7, v1, Lc/a/a/a/j2/h0$a;->c:Lcom/google/android/exoplayer2/upstream/d0;

    invoke-virtual {v7}, Lcom/google/android/exoplayer2/upstream/d0;->g()Ljava/util/Map;

    move-result-object v7

    invoke-static {v7}, Lc/a/a/a/h2/l/b;->l(Ljava/util/Map;)Lc/a/a/a/h2/l/b;

    move-result-object v7

    invoke-static {v6, v7}, Lc/a/a/a/j2/h0;->B(Lc/a/a/a/j2/h0;Lc/a/a/a/h2/l/b;)Lc/a/a/a/h2/l/b;

    .line 7
    iget-object v6, v1, Lc/a/a/a/j2/h0$a;->c:Lcom/google/android/exoplayer2/upstream/d0;

    .line 8
    iget-object v7, v1, Lc/a/a/a/j2/h0$a;->o:Lc/a/a/a/j2/h0;

    invoke-static {v7}, Lc/a/a/a/j2/h0;->A(Lc/a/a/a/j2/h0;)Lc/a/a/a/h2/l/b;

    move-result-object v7

    if-eqz v7, :cond_1

    iget-object v7, v1, Lc/a/a/a/j2/h0$a;->o:Lc/a/a/a/j2/h0;

    invoke-static {v7}, Lc/a/a/a/j2/h0;->A(Lc/a/a/a/j2/h0;)Lc/a/a/a/h2/l/b;

    move-result-object v7

    iget v7, v7, Lc/a/a/a/h2/l/b;->f:I

    const/4 v8, -0x1

    if-eq v7, v8, :cond_1

    .line 9
    new-instance v6, Lc/a/a/a/j2/v;

    iget-object v7, v1, Lc/a/a/a/j2/h0$a;->c:Lcom/google/android/exoplayer2/upstream/d0;

    iget-object v8, v1, Lc/a/a/a/j2/h0$a;->o:Lc/a/a/a/j2/h0;

    invoke-static {v8}, Lc/a/a/a/j2/h0;->A(Lc/a/a/a/j2/h0;)Lc/a/a/a/h2/l/b;

    move-result-object v8

    iget v8, v8, Lc/a/a/a/h2/l/b;->f:I

    invoke-direct {v6, v7, v8, v1}, Lc/a/a/a/j2/v;-><init>(Lcom/google/android/exoplayer2/upstream/m;ILc/a/a/a/j2/v$a;)V

    .line 10
    iget-object v7, v1, Lc/a/a/a/j2/h0$a;->o:Lc/a/a/a/j2/h0;

    invoke-virtual {v7}, Lc/a/a/a/j2/h0;->K()Lc/a/a/a/f2/b0;

    move-result-object v7

    iput-object v7, v1, Lc/a/a/a/j2/h0$a;->m:Lc/a/a/a/f2/b0;

    .line 11
    invoke-static {}, Lc/a/a/a/j2/h0;->C()Lc/a/a/a/u0;

    move-result-object v8

    invoke-interface {v7, v8}, Lc/a/a/a/f2/b0;->d(Lc/a/a/a/u0;)V

    :cond_1
    move-object v8, v6

    .line 12
    iget-object v7, v1, Lc/a/a/a/j2/h0$a;->d:Lc/a/a/a/j2/g0;

    iget-object v9, v1, Lc/a/a/a/j2/h0$a;->b:Landroid/net/Uri;

    iget-object v6, v1, Lc/a/a/a/j2/h0$a;->c:Lcom/google/android/exoplayer2/upstream/d0;

    .line 13
    invoke-virtual {v6}, Lcom/google/android/exoplayer2/upstream/d0;->g()Ljava/util/Map;

    move-result-object v10

    iget-wide v11, v1, Lc/a/a/a/j2/h0$a;->l:J

    iget-object v15, v1, Lc/a/a/a/j2/h0$a;->e:Lc/a/a/a/f2/l;

    move-wide/from16 v16, v11

    move-wide v11, v13

    move-wide v4, v13

    move-wide/from16 v13, v16

    .line 14
    invoke-interface/range {v7 .. v15}, Lc/a/a/a/j2/g0;->b(Lcom/google/android/exoplayer2/upstream/j;Landroid/net/Uri;Ljava/util/Map;JJLc/a/a/a/f2/l;)V

    .line 15
    iget-object v6, v1, Lc/a/a/a/j2/h0$a;->o:Lc/a/a/a/j2/h0;

    invoke-static {v6}, Lc/a/a/a/j2/h0;->A(Lc/a/a/a/j2/h0;)Lc/a/a/a/h2/l/b;

    move-result-object v6

    if-eqz v6, :cond_2

    .line 16
    iget-object v6, v1, Lc/a/a/a/j2/h0$a;->d:Lc/a/a/a/j2/g0;

    invoke-interface {v6}, Lc/a/a/a/j2/g0;->f()V

    .line 17
    :cond_2
    iget-boolean v6, v1, Lc/a/a/a/j2/h0$a;->i:Z

    if-eqz v6, :cond_3

    .line 18
    iget-object v6, v1, Lc/a/a/a/j2/h0$a;->d:Lc/a/a/a/j2/g0;

    iget-wide v7, v1, Lc/a/a/a/j2/h0$a;->j:J

    invoke-interface {v6, v4, v5, v7, v8}, Lc/a/a/a/j2/g0;->c(JJ)V

    .line 19
    iput-boolean v0, v1, Lc/a/a/a/j2/h0$a;->i:Z

    :cond_3
    :goto_1
    move-wide v13, v4

    :cond_4
    if-nez v2, :cond_5

    .line 20
    iget-boolean v4, v1, Lc/a/a/a/j2/h0$a;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_5

    .line 21
    :try_start_1
    iget-object v4, v1, Lc/a/a/a/j2/h0$a;->f:Lc/a/a/a/m2/j;

    invoke-virtual {v4}, Lc/a/a/a/m2/j;->a()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    :try_start_2
    iget-object v4, v1, Lc/a/a/a/j2/h0$a;->d:Lc/a/a/a/j2/g0;

    iget-object v5, v1, Lc/a/a/a/j2/h0$a;->g:Lc/a/a/a/f2/x;

    invoke-interface {v4, v5}, Lc/a/a/a/j2/g0;->d(Lc/a/a/a/f2/x;)I

    move-result v2

    .line 23
    iget-object v4, v1, Lc/a/a/a/j2/h0$a;->d:Lc/a/a/a/j2/g0;

    invoke-interface {v4}, Lc/a/a/a/j2/g0;->e()J

    move-result-wide v4

    .line 24
    iget-object v6, v1, Lc/a/a/a/j2/h0$a;->o:Lc/a/a/a/j2/h0;

    invoke-static {v6}, Lc/a/a/a/j2/h0;->D(Lc/a/a/a/j2/h0;)J

    move-result-wide v6

    add-long/2addr v6, v13

    cmp-long v8, v4, v6

    if-lez v8, :cond_4

    .line 25
    iget-object v6, v1, Lc/a/a/a/j2/h0$a;->f:Lc/a/a/a/m2/j;

    invoke-virtual {v6}, Lc/a/a/a/m2/j;->b()Z

    .line 26
    iget-object v6, v1, Lc/a/a/a/j2/h0$a;->o:Lc/a/a/a/j2/h0;

    invoke-static {v6}, Lc/a/a/a/j2/h0;->w(Lc/a/a/a/j2/h0;)Landroid/os/Handler;

    move-result-object v6

    iget-object v7, v1, Lc/a/a/a/j2/h0$a;->o:Lc/a/a/a/j2/h0;

    invoke-static {v7}, Lc/a/a/a/j2/h0;->v(Lc/a/a/a/j2/h0;)Ljava/lang/Runnable;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    .line 27
    :catch_0
    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_5
    if-ne v2, v3, :cond_6

    const/4 v2, 0x0

    goto :goto_2

    .line 28
    :cond_6
    iget-object v3, v1, Lc/a/a/a/j2/h0$a;->d:Lc/a/a/a/j2/g0;

    invoke-interface {v3}, Lc/a/a/a/j2/g0;->e()J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long v7, v3, v5

    if-eqz v7, :cond_7

    .line 29
    iget-object v3, v1, Lc/a/a/a/j2/h0$a;->g:Lc/a/a/a/f2/x;

    iget-object v4, v1, Lc/a/a/a/j2/h0$a;->d:Lc/a/a/a/j2/g0;

    invoke-interface {v4}, Lc/a/a/a/j2/g0;->e()J

    move-result-wide v4

    iput-wide v4, v3, Lc/a/a/a/f2/x;->a:J

    .line 30
    :cond_7
    :goto_2
    iget-object v3, v1, Lc/a/a/a/j2/h0$a;->c:Lcom/google/android/exoplayer2/upstream/d0;

    invoke-static {v3}, Lc/a/a/a/m2/m0;->l(Lcom/google/android/exoplayer2/upstream/m;)V

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    if-eq v2, v3, :cond_8

    .line 31
    iget-object v2, v1, Lc/a/a/a/j2/h0$a;->d:Lc/a/a/a/j2/g0;

    invoke-interface {v2}, Lc/a/a/a/j2/g0;->e()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v6, v2, v4

    if-eqz v6, :cond_8

    .line 32
    iget-object v2, v1, Lc/a/a/a/j2/h0$a;->g:Lc/a/a/a/f2/x;

    iget-object v3, v1, Lc/a/a/a/j2/h0$a;->d:Lc/a/a/a/j2/g0;

    invoke-interface {v3}, Lc/a/a/a/j2/g0;->e()J

    move-result-wide v3

    iput-wide v3, v2, Lc/a/a/a/f2/x;->a:J

    .line 33
    :cond_8
    iget-object v2, v1, Lc/a/a/a/j2/h0$a;->c:Lcom/google/android/exoplayer2/upstream/d0;

    invoke-static {v2}, Lc/a/a/a/m2/m0;->l(Lcom/google/android/exoplayer2/upstream/m;)V

    .line 34
    throw v0

    :cond_9
    return-void
.end method

.method public b(Lc/a/a/a/m2/a0;)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/j2/h0$a;->n:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, Lc/a/a/a/j2/h0$a;->j:J

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lc/a/a/a/j2/h0$a;->o:Lc/a/a/a/j2/h0;

    invoke-static {v0}, Lc/a/a/a/j2/h0;->x(Lc/a/a/a/j2/h0;)J

    move-result-wide v0

    iget-wide v2, p0, Lc/a/a/a/j2/h0$a;->j:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :goto_0
    move-wide v3, v0

    .line 2
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->a()I

    move-result v6

    .line 3
    iget-object v0, p0, Lc/a/a/a/j2/h0$a;->m:Lc/a/a/a/f2/b0;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lc/a/a/a/f2/b0;

    .line 4
    invoke-interface {v2, p1, v6}, Lc/a/a/a/f2/b0;->a(Lc/a/a/a/m2/a0;I)V

    const/4 v5, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 5
    invoke-interface/range {v2 .. v8}, Lc/a/a/a/f2/b0;->c(JIIILc/a/a/a/f2/b0$a;)V

    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lc/a/a/a/j2/h0$a;->n:Z

    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/j2/h0$a;->h:Z

    return-void
.end method
