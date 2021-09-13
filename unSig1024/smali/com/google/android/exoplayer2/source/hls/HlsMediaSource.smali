.class public final Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;
.super Lc/a/a/a/j2/k;
.source "HlsMediaSource.java"

# interfaces
.implements Lcom/google/android/exoplayer2/source/hls/v/k$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;
    }
.end annotation


# instance fields
.field private final g:Lcom/google/android/exoplayer2/source/hls/k;

.field private final h:Lc/a/a/a/z0$g;

.field private final i:Lcom/google/android/exoplayer2/source/hls/j;

.field private final j:Lc/a/a/a/j2/q;

.field private final k:Lc/a/a/a/e2/y;

.field private final l:Lcom/google/android/exoplayer2/upstream/a0;

.field private final m:Z

.field private final n:I

.field private final o:Z

.field private final p:Lcom/google/android/exoplayer2/source/hls/v/k;

.field private final q:J

.field private final r:Lc/a/a/a/z0;

.field private s:Lc/a/a/a/z0$f;

.field private t:Lcom/google/android/exoplayer2/upstream/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "goog.exo.hls"

    .line 1
    invoke-static {v0}, Lc/a/a/a/s0;->a(Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Lc/a/a/a/z0;Lcom/google/android/exoplayer2/source/hls/j;Lcom/google/android/exoplayer2/source/hls/k;Lc/a/a/a/j2/q;Lc/a/a/a/e2/y;Lcom/google/android/exoplayer2/upstream/a0;Lcom/google/android/exoplayer2/source/hls/v/k;JZIZ)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lc/a/a/a/j2/k;-><init>()V

    .line 3
    iget-object v0, p1, Lc/a/a/a/z0;->b:Lc/a/a/a/z0$g;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/z0$g;

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->h:Lc/a/a/a/z0$g;

    .line 4
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->r:Lc/a/a/a/z0;

    .line 5
    iget-object p1, p1, Lc/a/a/a/z0;->c:Lc/a/a/a/z0$f;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->s:Lc/a/a/a/z0$f;

    .line 6
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->i:Lcom/google/android/exoplayer2/source/hls/j;

    .line 7
    iput-object p3, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->g:Lcom/google/android/exoplayer2/source/hls/k;

    .line 8
    iput-object p4, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->j:Lc/a/a/a/j2/q;

    .line 9
    iput-object p5, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->k:Lc/a/a/a/e2/y;

    .line 10
    iput-object p6, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->l:Lcom/google/android/exoplayer2/upstream/a0;

    .line 11
    iput-object p7, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->p:Lcom/google/android/exoplayer2/source/hls/v/k;

    .line 12
    iput-wide p8, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->q:J

    .line 13
    iput-boolean p10, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->m:Z

    .line 14
    iput p11, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->n:I

    .line 15
    iput-boolean p12, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->o:Z

    return-void
.end method

.method synthetic constructor <init>(Lc/a/a/a/z0;Lcom/google/android/exoplayer2/source/hls/j;Lcom/google/android/exoplayer2/source/hls/k;Lc/a/a/a/j2/q;Lc/a/a/a/e2/y;Lcom/google/android/exoplayer2/upstream/a0;Lcom/google/android/exoplayer2/source/hls/v/k;JZIZLcom/google/android/exoplayer2/source/hls/HlsMediaSource$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p12}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;-><init>(Lc/a/a/a/z0;Lcom/google/android/exoplayer2/source/hls/j;Lcom/google/android/exoplayer2/source/hls/k;Lc/a/a/a/j2/q;Lc/a/a/a/e2/y;Lcom/google/android/exoplayer2/upstream/a0;Lcom/google/android/exoplayer2/source/hls/v/k;JZIZ)V

    return-void
.end method

.method private static A(Lcom/google/android/exoplayer2/source/hls/v/g;J)J
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->t:Lcom/google/android/exoplayer2/source/hls/v/g$f;

    .line 2
    iget-wide v1, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->e:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    .line 3
    iget-wide v3, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->s:J

    sub-long/2addr v3, v1

    goto :goto_0

    .line 4
    :cond_0
    iget-wide v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g$f;->d:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    iget-wide v5, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->l:J

    cmp-long v7, v5, v3

    if-eqz v7, :cond_1

    move-wide v3, v1

    goto :goto_0

    .line 5
    :cond_1
    iget-wide v0, v0, Lcom/google/android/exoplayer2/source/hls/v/g$f;->c:J

    cmp-long v2, v0, v3

    if-eqz v2, :cond_2

    move-wide v3, v0

    goto :goto_0

    :cond_2
    const-wide/16 v0, 0x3

    .line 6
    iget-wide v2, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->k:J

    mul-long v3, v2, v0

    :goto_0
    add-long/2addr v3, p1

    return-wide v3
.end method

.method private B(Lcom/google/android/exoplayer2/source/hls/v/g;J)J
    .locals 4

    .line 1
    iget-object v0, p1, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 3
    iget-wide v2, p1, Lcom/google/android/exoplayer2/source/hls/v/g;->s:J

    add-long/2addr v2, p2

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->s:Lc/a/a/a/z0$f;

    iget-wide p1, p1, Lc/a/a/a/z0$f;->b:J

    .line 4
    invoke-static {p1, p2}, Lc/a/a/a/i0;->c(J)J

    move-result-wide p1

    sub-long/2addr v2, p1

    :goto_0
    if-lez v1, :cond_0

    .line 5
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/exoplayer2/source/hls/v/g$d;

    iget-wide p1, p1, Lcom/google/android/exoplayer2/source/hls/v/g$e;->e:J

    cmp-long p3, p1, v2

    if-lez p3, :cond_0

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 6
    :cond_0
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/exoplayer2/source/hls/v/g$d;

    iget-wide p1, p1, Lcom/google/android/exoplayer2/source/hls/v/g$e;->e:J

    return-wide p1
.end method

.method private C(J)V
    .locals 3

    .line 1
    invoke-static {p1, p2}, Lc/a/a/a/i0;->d(J)J

    move-result-wide p1

    .line 2
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->s:Lc/a/a/a/z0$f;

    iget-wide v0, v0, Lc/a/a/a/z0$f;->b:J

    cmp-long v2, p1, v0

    if-eqz v2, :cond_0

    .line 3
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->r:Lc/a/a/a/z0;

    .line 4
    invoke-virtual {v0}, Lc/a/a/a/z0;->a()Lc/a/a/a/z0$c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lc/a/a/a/z0$c;->c(J)Lc/a/a/a/z0$c;

    move-result-object p1

    invoke-virtual {p1}, Lc/a/a/a/z0$c;->a()Lc/a/a/a/z0;

    move-result-object p1

    iget-object p1, p1, Lc/a/a/a/z0;->c:Lc/a/a/a/z0$f;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->s:Lc/a/a/a/z0$f;

    :cond_0
    return-void
.end method

.method private z(Lcom/google/android/exoplayer2/source/hls/v/g;)J
    .locals 4

    .line 1
    iget-boolean v0, p1, Lcom/google/android/exoplayer2/source/hls/v/g;->n:Z

    if-eqz v0, :cond_0

    .line 2
    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->q:J

    invoke-static {v0, v1}, Lc/a/a/a/m2/m0;->U(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lc/a/a/a/i0;->c(J)J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/source/hls/v/g;->e()J

    move-result-wide v2

    sub-long/2addr v0, v2

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method


# virtual methods
.method public a()Lc/a/a/a/z0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->r:Lc/a/a/a/z0;

    return-object v0
.end method

.method public c()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->p:Lcom/google/android/exoplayer2/source/hls/v/k;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/source/hls/v/k;->e()V

    return-void
.end method

.method public d(Lc/a/a/a/j2/d0$a;Lcom/google/android/exoplayer2/upstream/e;J)Lc/a/a/a/j2/a0;
    .locals 16

    move-object/from16 v0, p0

    .line 1
    invoke-virtual/range {p0 .. p1}, Lc/a/a/a/j2/k;->s(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/j2/e0$a;

    move-result-object v9

    .line 2
    invoke-virtual/range {p0 .. p1}, Lc/a/a/a/j2/k;->q(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/e2/w$a;

    move-result-object v7

    .line 3
    new-instance v15, Lcom/google/android/exoplayer2/source/hls/o;

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->g:Lcom/google/android/exoplayer2/source/hls/k;

    iget-object v3, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->p:Lcom/google/android/exoplayer2/source/hls/v/k;

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->i:Lcom/google/android/exoplayer2/source/hls/j;

    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->t:Lcom/google/android/exoplayer2/upstream/e0;

    iget-object v6, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->k:Lc/a/a/a/e2/y;

    iget-object v8, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->l:Lcom/google/android/exoplayer2/upstream/a0;

    iget-object v11, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->j:Lc/a/a/a/j2/q;

    iget-boolean v12, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->m:Z

    iget v13, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->n:I

    iget-boolean v14, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->o:Z

    move-object v1, v15

    move-object/from16 v10, p2

    invoke-direct/range {v1 .. v14}, Lcom/google/android/exoplayer2/source/hls/o;-><init>(Lcom/google/android/exoplayer2/source/hls/k;Lcom/google/android/exoplayer2/source/hls/v/k;Lcom/google/android/exoplayer2/source/hls/j;Lcom/google/android/exoplayer2/upstream/e0;Lc/a/a/a/e2/y;Lc/a/a/a/e2/w$a;Lcom/google/android/exoplayer2/upstream/a0;Lc/a/a/a/j2/e0$a;Lcom/google/android/exoplayer2/upstream/e;Lc/a/a/a/j2/q;ZIZ)V

    return-object v15
.end method

.method public f(Lc/a/a/a/j2/a0;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/exoplayer2/source/hls/o;

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/source/hls/o;->B()V

    return-void
.end method

.method public k(Lcom/google/android/exoplayer2/source/hls/v/g;)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    iget-boolean v2, v1, Lcom/google/android/exoplayer2/source/hls/v/g;->n:Z

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_0

    iget-wide v5, v1, Lcom/google/android/exoplayer2/source/hls/v/g;->f:J

    invoke-static {v5, v6}, Lc/a/a/a/i0;->d(J)J

    move-result-wide v5

    move-wide v10, v5

    goto :goto_0

    :cond_0
    move-wide v10, v3

    .line 2
    :goto_0
    iget v2, v1, Lcom/google/android/exoplayer2/source/hls/v/g;->d:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eq v2, v5, :cond_2

    if-ne v2, v6, :cond_1

    goto :goto_1

    :cond_1
    move-wide v8, v3

    goto :goto_2

    :cond_2
    :goto_1
    move-wide v8, v10

    .line 3
    :goto_2
    iget-wide v12, v1, Lcom/google/android/exoplayer2/source/hls/v/g;->e:J

    .line 4
    new-instance v2, Lcom/google/android/exoplayer2/source/hls/l;

    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->p:Lcom/google/android/exoplayer2/source/hls/v/k;

    .line 5
    invoke-interface {v5}, Lcom/google/android/exoplayer2/source/hls/v/k;->b()Lcom/google/android/exoplayer2/source/hls/v/f;

    move-result-object v5

    invoke-static {v5}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/exoplayer2/source/hls/v/f;

    invoke-direct {v2, v5, v1}, Lcom/google/android/exoplayer2/source/hls/l;-><init>(Lcom/google/android/exoplayer2/source/hls/v/f;Lcom/google/android/exoplayer2/source/hls/v/g;)V

    .line 6
    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->p:Lcom/google/android/exoplayer2/source/hls/v/k;

    invoke-interface {v5}, Lcom/google/android/exoplayer2/source/hls/v/k;->a()Z

    move-result v5

    if-eqz v5, :cond_7

    .line 7
    invoke-direct/range {p0 .. p1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z(Lcom/google/android/exoplayer2/source/hls/v/g;)J

    move-result-wide v14

    .line 8
    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->s:Lc/a/a/a/z0$f;

    iget-wide v6, v5, Lc/a/a/a/z0$f;->b:J

    cmp-long v5, v6, v3

    if-eqz v5, :cond_3

    .line 9
    invoke-static {v6, v7}, Lc/a/a/a/i0;->c(J)J

    move-result-wide v5

    goto :goto_3

    .line 10
    :cond_3
    invoke-static {v1, v14, v15}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->A(Lcom/google/android/exoplayer2/source/hls/v/g;J)J

    move-result-wide v5

    :goto_3
    move-wide/from16 v16, v5

    .line 11
    iget-wide v5, v1, Lcom/google/android/exoplayer2/source/hls/v/g;->s:J

    add-long v20, v5, v14

    move-wide/from16 v18, v14

    .line 12
    invoke-static/range {v16 .. v21}, Lc/a/a/a/m2/m0;->q(JJJ)J

    move-result-wide v5

    .line 13
    invoke-direct {v0, v5, v6}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->C(J)V

    .line 14
    iget-wide v5, v1, Lcom/google/android/exoplayer2/source/hls/v/g;->f:J

    iget-object v7, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->p:Lcom/google/android/exoplayer2/source/hls/v/k;

    .line 15
    invoke-interface {v7}, Lcom/google/android/exoplayer2/source/hls/v/k;->l()J

    move-result-wide v16

    sub-long v18, v5, v16

    .line 16
    iget-boolean v5, v1, Lcom/google/android/exoplayer2/source/hls/v/g;->m:Z

    if-eqz v5, :cond_4

    iget-wide v5, v1, Lcom/google/android/exoplayer2/source/hls/v/g;->s:J

    add-long v5, v18, v5

    goto :goto_4

    :cond_4
    move-wide v5, v3

    .line 17
    :goto_4
    iget-object v7, v1, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    .line 18
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_5

    .line 19
    invoke-direct {v0, v1, v14, v15}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B(Lcom/google/android/exoplayer2/source/hls/v/g;J)J

    move-result-wide v3

    move-wide/from16 v20, v3

    goto :goto_5

    :cond_5
    cmp-long v7, v12, v3

    if-nez v7, :cond_6

    const-wide/16 v20, 0x0

    goto :goto_5

    :cond_6
    move-wide/from16 v20, v12

    .line 20
    :goto_5
    new-instance v3, Lc/a/a/a/j2/o0;

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    iget-wide v14, v1, Lcom/google/android/exoplayer2/source/hls/v/g;->s:J

    const/16 v22, 0x1

    iget-boolean v1, v1, Lcom/google/android/exoplayer2/source/hls/v/g;->m:Z

    const/4 v4, 0x1

    xor-int/lit8 v23, v1, 0x1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->r:Lc/a/a/a/z0;

    move-object/from16 v25, v1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->s:Lc/a/a/a/z0$f;

    move-object/from16 v26, v1

    move-object v7, v3

    move-wide/from16 v16, v14

    move-wide v14, v5

    move-object/from16 v24, v2

    invoke-direct/range {v7 .. v26}, Lc/a/a/a/j2/o0;-><init>(JJJJJJJZZLjava/lang/Object;Lc/a/a/a/z0;Lc/a/a/a/z0$f;)V

    goto :goto_7

    :cond_7
    cmp-long v5, v12, v3

    if-nez v5, :cond_8

    const-wide/16 v20, 0x0

    goto :goto_6

    :cond_8
    move-wide/from16 v20, v12

    .line 21
    :goto_6
    new-instance v3, Lc/a/a/a/j2/o0;

    move-object v7, v3

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    iget-wide v14, v1, Lcom/google/android/exoplayer2/source/hls/v/g;->s:J

    move-wide/from16 v16, v14

    const-wide/16 v18, 0x0

    const/16 v22, 0x1

    const/16 v23, 0x0

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->r:Lc/a/a/a/z0;

    move-object/from16 v25, v1

    const/16 v26, 0x0

    move-object/from16 v24, v2

    invoke-direct/range {v7 .. v26}, Lc/a/a/a/j2/o0;-><init>(JJJJJJJZZLjava/lang/Object;Lc/a/a/a/z0;Lc/a/a/a/z0$f;)V

    .line 22
    :goto_7
    invoke-virtual {v0, v3}, Lc/a/a/a/j2/k;->x(Lc/a/a/a/x1;)V

    return-void
.end method

.method protected w(Lcom/google/android/exoplayer2/upstream/e0;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->t:Lcom/google/android/exoplayer2/upstream/e0;

    .line 2
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->k:Lc/a/a/a/e2/y;

    invoke-interface {p1}, Lc/a/a/a/e2/y;->d()V

    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Lc/a/a/a/j2/k;->s(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/j2/e0$a;

    move-result-object p1

    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->p:Lcom/google/android/exoplayer2/source/hls/v/k;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->h:Lc/a/a/a/z0$g;

    iget-object v1, v1, Lc/a/a/a/z0$g;->a:Landroid/net/Uri;

    invoke-interface {v0, v1, p1, p0}, Lcom/google/android/exoplayer2/source/hls/v/k;->d(Landroid/net/Uri;Lc/a/a/a/j2/e0$a;Lcom/google/android/exoplayer2/source/hls/v/k$e;)V

    return-void
.end method

.method protected y()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->p:Lcom/google/android/exoplayer2/source/hls/v/k;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/source/hls/v/k;->stop()V

    .line 2
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->k:Lc/a/a/a/e2/y;

    invoke-interface {v0}, Lc/a/a/a/e2/y;->a()V

    return-void
.end method
