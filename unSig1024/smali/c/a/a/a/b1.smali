.class final Lc/a/a/a/b1;
.super Ljava/lang/Object;
.source "MediaPeriodHolder.java"


# instance fields
.field public final a:Lc/a/a/a/j2/a0;

.field public final b:Ljava/lang/Object;

.field public final c:[Lc/a/a/a/j2/l0;

.field public d:Z

.field public e:Z

.field public f:Lc/a/a/a/c1;

.field public g:Z

.field private final h:[Z

.field private final i:[Lc/a/a/a/r1;

.field private final j:Lc/a/a/a/l2/n;

.field private final k:Lc/a/a/a/f1;

.field private l:Lc/a/a/a/b1;

.field private m:Lc/a/a/a/j2/q0;

.field private n:Lc/a/a/a/l2/o;

.field private o:J


# direct methods
.method public constructor <init>([Lc/a/a/a/r1;JLc/a/a/a/l2/n;Lcom/google/android/exoplayer2/upstream/e;Lc/a/a/a/f1;Lc/a/a/a/c1;Lc/a/a/a/l2/o;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/b1;->i:[Lc/a/a/a/r1;

    .line 3
    iput-wide p2, p0, Lc/a/a/a/b1;->o:J

    .line 4
    iput-object p4, p0, Lc/a/a/a/b1;->j:Lc/a/a/a/l2/n;

    .line 5
    iput-object p6, p0, Lc/a/a/a/b1;->k:Lc/a/a/a/f1;

    .line 6
    iget-object v0, p7, Lc/a/a/a/c1;->a:Lc/a/a/a/j2/d0$a;

    iget-object p2, v0, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    iput-object p2, p0, Lc/a/a/a/b1;->b:Ljava/lang/Object;

    .line 7
    iput-object p7, p0, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    .line 8
    sget-object p2, Lc/a/a/a/j2/q0;->a:Lc/a/a/a/j2/q0;

    iput-object p2, p0, Lc/a/a/a/b1;->m:Lc/a/a/a/j2/q0;

    .line 9
    iput-object p8, p0, Lc/a/a/a/b1;->n:Lc/a/a/a/l2/o;

    .line 10
    array-length p2, p1

    new-array p2, p2, [Lc/a/a/a/j2/l0;

    iput-object p2, p0, Lc/a/a/a/b1;->c:[Lc/a/a/a/j2/l0;

    .line 11
    array-length p1, p1

    new-array p1, p1, [Z

    iput-object p1, p0, Lc/a/a/a/b1;->h:[Z

    .line 12
    iget-wide v3, p7, Lc/a/a/a/c1;->b:J

    iget-wide v5, p7, Lc/a/a/a/c1;->d:J

    move-object v1, p6

    move-object v2, p5

    .line 13
    invoke-static/range {v0 .. v6}, Lc/a/a/a/b1;->e(Lc/a/a/a/j2/d0$a;Lc/a/a/a/f1;Lcom/google/android/exoplayer2/upstream/e;JJ)Lc/a/a/a/j2/a0;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/b1;->a:Lc/a/a/a/j2/a0;

    return-void
.end method

.method private c([Lc/a/a/a/j2/l0;)V
    .locals 3

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget-object v1, p0, Lc/a/a/a/b1;->i:[Lc/a/a/a/r1;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    .line 2
    aget-object v1, v1, v0

    invoke-interface {v1}, Lc/a/a/a/r1;->g()I

    move-result v1

    const/4 v2, 0x7

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lc/a/a/a/b1;->n:Lc/a/a/a/l2/o;

    .line 3
    invoke-virtual {v1, v0}, Lc/a/a/a/l2/o;->c(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    new-instance v1, Lc/a/a/a/j2/t;

    invoke-direct {v1}, Lc/a/a/a/j2/t;-><init>()V

    aput-object v1, p1, v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private static e(Lc/a/a/a/j2/d0$a;Lc/a/a/a/f1;Lcom/google/android/exoplayer2/upstream/e;JJ)Lc/a/a/a/j2/a0;
    .locals 7

    .line 1
    invoke-virtual {p1, p0, p2, p3, p4}, Lc/a/a/a/f1;->g(Lc/a/a/a/j2/d0$a;Lcom/google/android/exoplayer2/upstream/e;J)Lc/a/a/a/j2/a0;

    move-result-object v1

    const-wide p0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, p5, p0

    if-eqz p2, :cond_0

    const-wide/high16 p0, -0x8000000000000000L

    cmp-long p2, p5, p0

    if-eqz p2, :cond_0

    .line 2
    new-instance p0, Lc/a/a/a/j2/n;

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    move-object v0, p0

    move-wide v5, p5

    invoke-direct/range {v0 .. v6}, Lc/a/a/a/j2/n;-><init>(Lc/a/a/a/j2/a0;ZJJ)V

    move-object v1, p0

    :cond_0
    return-object v1
.end method

.method private f()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lc/a/a/a/b1;->r()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lc/a/a/a/b1;->n:Lc/a/a/a/l2/o;

    iget v2, v1, Lc/a/a/a/l2/o;->a:I

    if-ge v0, v2, :cond_2

    .line 3
    invoke-virtual {v1, v0}, Lc/a/a/a/l2/o;->c(I)Z

    move-result v1

    .line 4
    iget-object v2, p0, Lc/a/a/a/b1;->n:Lc/a/a/a/l2/o;

    iget-object v2, v2, Lc/a/a/a/l2/o;->c:[Lc/a/a/a/l2/h;

    aget-object v2, v2, v0

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    .line 5
    invoke-interface {v2}, Lc/a/a/a/l2/h;->d()V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private g([Lc/a/a/a/j2/l0;)V
    .locals 3

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget-object v1, p0, Lc/a/a/a/b1;->i:[Lc/a/a/a/r1;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    .line 2
    aget-object v1, v1, v0

    invoke-interface {v1}, Lc/a/a/a/r1;->g()I

    move-result v1

    const/4 v2, 0x7

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    .line 3
    aput-object v1, p1, v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private h()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lc/a/a/a/b1;->r()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lc/a/a/a/b1;->n:Lc/a/a/a/l2/o;

    iget v2, v1, Lc/a/a/a/l2/o;->a:I

    if-ge v0, v2, :cond_2

    .line 3
    invoke-virtual {v1, v0}, Lc/a/a/a/l2/o;->c(I)Z

    move-result v1

    .line 4
    iget-object v2, p0, Lc/a/a/a/b1;->n:Lc/a/a/a/l2/o;

    iget-object v2, v2, Lc/a/a/a/l2/o;->c:[Lc/a/a/a/l2/h;

    aget-object v2, v2, v0

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    .line 5
    invoke-interface {v2}, Lc/a/a/a/l2/h;->f()V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private r()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b1;->l:Lc/a/a/a/b1;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static u(JLc/a/a/a/f1;Lc/a/a/a/j2/a0;)V
    .locals 3

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p0, v0

    if-eqz v2, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v2, p0, v0

    if-eqz v2, :cond_0

    .line 1
    :try_start_0
    check-cast p3, Lc/a/a/a/j2/n;

    iget-object p0, p3, Lc/a/a/a/j2/n;->a:Lc/a/a/a/j2/a0;

    invoke-virtual {p2, p0}, Lc/a/a/a/f1;->z(Lc/a/a/a/j2/a0;)V

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p2, p3}, Lc/a/a/a/f1;->z(Lc/a/a/a/j2/a0;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string p1, "MediaPeriodHolder"

    const-string p2, "Period release failed."

    .line 3
    invoke-static {p1, p2, p0}, Lc/a/a/a/m2/t;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lc/a/a/a/l2/o;JZ)J
    .locals 7

    .line 1
    iget-object v0, p0, Lc/a/a/a/b1;->i:[Lc/a/a/a/r1;

    array-length v0, v0

    new-array v6, v0, [Z

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Lc/a/a/a/b1;->b(Lc/a/a/a/l2/o;JZ[Z)J

    move-result-wide p1

    return-wide p1
.end method

.method public b(Lc/a/a/a/l2/o;JZ[Z)J
    .locals 13

    move-object v0, p0

    move-object v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 1
    :goto_0
    iget v4, v1, Lc/a/a/a/l2/o;->a:I

    const/4 v5, 0x1

    if-ge v3, v4, :cond_1

    .line 2
    iget-object v4, v0, Lc/a/a/a/b1;->h:[Z

    if-nez p4, :cond_0

    iget-object v6, v0, Lc/a/a/a/b1;->n:Lc/a/a/a/l2/o;

    .line 3
    invoke-virtual {p1, v6, v3}, Lc/a/a/a/l2/o;->b(Lc/a/a/a/l2/o;I)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    aput-boolean v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 4
    :cond_1
    iget-object v3, v0, Lc/a/a/a/b1;->c:[Lc/a/a/a/j2/l0;

    invoke-direct {p0, v3}, Lc/a/a/a/b1;->g([Lc/a/a/a/j2/l0;)V

    .line 5
    invoke-direct {p0}, Lc/a/a/a/b1;->f()V

    .line 6
    iput-object v1, v0, Lc/a/a/a/b1;->n:Lc/a/a/a/l2/o;

    .line 7
    invoke-direct {p0}, Lc/a/a/a/b1;->h()V

    .line 8
    iget-object v6, v0, Lc/a/a/a/b1;->a:Lc/a/a/a/j2/a0;

    iget-object v7, v1, Lc/a/a/a/l2/o;->c:[Lc/a/a/a/l2/h;

    iget-object v8, v0, Lc/a/a/a/b1;->h:[Z

    iget-object v9, v0, Lc/a/a/a/b1;->c:[Lc/a/a/a/j2/l0;

    move-object/from16 v10, p5

    move-wide v11, p2

    .line 9
    invoke-interface/range {v6 .. v12}, Lc/a/a/a/j2/a0;->n([Lc/a/a/a/l2/h;[Z[Lc/a/a/a/j2/l0;[ZJ)J

    move-result-wide v3

    .line 10
    iget-object v6, v0, Lc/a/a/a/b1;->c:[Lc/a/a/a/j2/l0;

    invoke-direct {p0, v6}, Lc/a/a/a/b1;->c([Lc/a/a/a/j2/l0;)V

    .line 11
    iput-boolean v2, v0, Lc/a/a/a/b1;->e:Z

    const/4 v6, 0x0

    .line 12
    :goto_2
    iget-object v7, v0, Lc/a/a/a/b1;->c:[Lc/a/a/a/j2/l0;

    array-length v8, v7

    if-ge v6, v8, :cond_5

    .line 13
    aget-object v7, v7, v6

    if-eqz v7, :cond_2

    .line 14
    invoke-virtual {p1, v6}, Lc/a/a/a/l2/o;->c(I)Z

    move-result v7

    invoke-static {v7}, Lc/a/a/a/m2/f;->f(Z)V

    .line 15
    iget-object v7, v0, Lc/a/a/a/b1;->i:[Lc/a/a/a/r1;

    aget-object v7, v7, v6

    invoke-interface {v7}, Lc/a/a/a/r1;->g()I

    move-result v7

    const/4 v8, 0x7

    if-eq v7, v8, :cond_4

    .line 16
    iput-boolean v5, v0, Lc/a/a/a/b1;->e:Z

    goto :goto_4

    .line 17
    :cond_2
    iget-object v7, v1, Lc/a/a/a/l2/o;->c:[Lc/a/a/a/l2/h;

    aget-object v7, v7, v6

    if-nez v7, :cond_3

    const/4 v7, 0x1

    goto :goto_3

    :cond_3
    const/4 v7, 0x0

    :goto_3
    invoke-static {v7}, Lc/a/a/a/m2/f;->f(Z)V

    :cond_4
    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_5
    return-wide v3
.end method

.method public d(J)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/b1;->r()Z

    move-result v0

    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    invoke-virtual {p0, p1, p2}, Lc/a/a/a/b1;->y(J)J

    move-result-wide p1

    .line 3
    iget-object v0, p0, Lc/a/a/a/b1;->a:Lc/a/a/a/j2/a0;

    invoke-interface {v0, p1, p2}, Lc/a/a/a/j2/a0;->d(J)Z

    return-void
.end method

.method public i()J
    .locals 5

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/b1;->d:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-wide v0, v0, Lc/a/a/a/c1;->b:J

    return-wide v0

    .line 3
    :cond_0
    iget-boolean v0, p0, Lc/a/a/a/b1;->e:Z

    const-wide/high16 v1, -0x8000000000000000L

    if-eqz v0, :cond_1

    iget-object v0, p0, Lc/a/a/a/b1;->a:Lc/a/a/a/j2/a0;

    invoke-interface {v0}, Lc/a/a/a/j2/a0;->c()J

    move-result-wide v3

    goto :goto_0

    :cond_1
    move-wide v3, v1

    :goto_0
    cmp-long v0, v3, v1

    if-nez v0, :cond_2

    .line 4
    iget-object v0, p0, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-wide v3, v0, Lc/a/a/a/c1;->e:J

    :cond_2
    return-wide v3
.end method

.method public j()Lc/a/a/a/b1;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b1;->l:Lc/a/a/a/b1;

    return-object v0
.end method

.method public k()J
    .locals 2

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/b1;->d:Z

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lc/a/a/a/b1;->a:Lc/a/a/a/j2/a0;

    invoke-interface {v0}, Lc/a/a/a/j2/a0;->b()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public l()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/b1;->o:J

    return-wide v0
.end method

.method public m()J
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-wide v0, v0, Lc/a/a/a/c1;->b:J

    iget-wide v2, p0, Lc/a/a/a/b1;->o:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public n()Lc/a/a/a/j2/q0;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b1;->m:Lc/a/a/a/j2/q0;

    return-object v0
.end method

.method public o()Lc/a/a/a/l2/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b1;->n:Lc/a/a/a/l2/o;

    return-object v0
.end method

.method public p(FLc/a/a/a/x1;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/b1;->d:Z

    .line 2
    iget-object v0, p0, Lc/a/a/a/b1;->a:Lc/a/a/a/j2/a0;

    invoke-interface {v0}, Lc/a/a/a/j2/a0;->o()Lc/a/a/a/j2/q0;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/b1;->m:Lc/a/a/a/j2/q0;

    .line 3
    invoke-virtual {p0, p1, p2}, Lc/a/a/a/b1;->v(FLc/a/a/a/x1;)Lc/a/a/a/l2/o;

    move-result-object p1

    .line 4
    iget-object p2, p0, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-wide v0, p2, Lc/a/a/a/c1;->b:J

    .line 5
    iget-wide v2, p2, Lc/a/a/a/c1;->e:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v2, v4

    if-eqz p2, :cond_0

    cmp-long p2, v0, v2

    if-ltz p2, :cond_0

    const-wide/16 v0, 0x0

    const-wide/16 v4, 0x1

    sub-long/2addr v2, v4

    .line 6
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :cond_0
    const/4 p2, 0x0

    .line 7
    invoke-virtual {p0, p1, v0, v1, p2}, Lc/a/a/a/b1;->a(Lc/a/a/a/l2/o;JZ)J

    move-result-wide p1

    .line 8
    iget-wide v0, p0, Lc/a/a/a/b1;->o:J

    iget-object v2, p0, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-wide v3, v2, Lc/a/a/a/c1;->b:J

    sub-long/2addr v3, p1

    add-long/2addr v0, v3

    iput-wide v0, p0, Lc/a/a/a/b1;->o:J

    .line 9
    invoke-virtual {v2, p1, p2}, Lc/a/a/a/c1;->b(J)Lc/a/a/a/c1;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    return-void
.end method

.method public q()Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/b1;->d:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lc/a/a/a/b1;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/a/a/a/b1;->a:Lc/a/a/a/j2/a0;

    .line 2
    invoke-interface {v0}, Lc/a/a/a/j2/a0;->c()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public s(J)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/b1;->r()Z

    move-result v0

    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    iget-boolean v0, p0, Lc/a/a/a/b1;->d:Z

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lc/a/a/a/b1;->a:Lc/a/a/a/j2/a0;

    invoke-virtual {p0, p1, p2}, Lc/a/a/a/b1;->y(J)J

    move-result-wide p1

    invoke-interface {v0, p1, p2}, Lc/a/a/a/j2/a0;->e(J)V

    :cond_0
    return-void
.end method

.method public t()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lc/a/a/a/b1;->f()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-wide v0, v0, Lc/a/a/a/c1;->d:J

    iget-object v2, p0, Lc/a/a/a/b1;->k:Lc/a/a/a/f1;

    iget-object v3, p0, Lc/a/a/a/b1;->a:Lc/a/a/a/j2/a0;

    invoke-static {v0, v1, v2, v3}, Lc/a/a/a/b1;->u(JLc/a/a/a/f1;Lc/a/a/a/j2/a0;)V

    return-void
.end method

.method public v(FLc/a/a/a/x1;)Lc/a/a/a/l2/o;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/b1;->j:Lc/a/a/a/l2/n;

    iget-object v1, p0, Lc/a/a/a/b1;->i:[Lc/a/a/a/r1;

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/b1;->n()Lc/a/a/a/j2/q0;

    move-result-object v2

    iget-object v3, p0, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-object v3, v3, Lc/a/a/a/c1;->a:Lc/a/a/a/j2/d0$a;

    invoke-virtual {v0, v1, v2, v3, p2}, Lc/a/a/a/l2/n;->d([Lc/a/a/a/r1;Lc/a/a/a/j2/q0;Lc/a/a/a/j2/d0$a;Lc/a/a/a/x1;)Lc/a/a/a/l2/o;

    move-result-object p2

    .line 3
    iget-object v0, p2, Lc/a/a/a/l2/o;->c:[Lc/a/a/a/l2/h;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    if-eqz v3, :cond_0

    .line 4
    invoke-interface {v3, p1}, Lc/a/a/a/l2/h;->o(F)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object p2
.end method

.method public w(Lc/a/a/a/b1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b1;->l:Lc/a/a/a/b1;

    if-ne p1, v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-direct {p0}, Lc/a/a/a/b1;->f()V

    .line 3
    iput-object p1, p0, Lc/a/a/a/b1;->l:Lc/a/a/a/b1;

    .line 4
    invoke-direct {p0}, Lc/a/a/a/b1;->h()V

    return-void
.end method

.method public x(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lc/a/a/a/b1;->o:J

    return-void
.end method

.method public y(J)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/b1;->l()J

    move-result-wide v0

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public z(J)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/b1;->l()J

    move-result-wide v0

    add-long/2addr p1, v0

    return-wide p1
.end method
