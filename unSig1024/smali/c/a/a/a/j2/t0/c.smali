.class public abstract Lc/a/a/a/j2/t0/c;
.super Lc/a/a/a/j2/t0/b;
.source "DataChunk.java"


# instance fields
.field private j:[B

.field private volatile k:Z


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/upstream/m;Lcom/google/android/exoplayer2/upstream/p;ILc/a/a/a/u0;ILjava/lang/Object;[B)V
    .locals 11

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    .line 1
    invoke-direct/range {v0 .. v10}, Lc/a/a/a/j2/t0/b;-><init>(Lcom/google/android/exoplayer2/upstream/m;Lcom/google/android/exoplayer2/upstream/p;ILc/a/a/a/u0;ILjava/lang/Object;JJ)V

    if-nez p7, :cond_0

    .line 2
    sget-object v0, Lc/a/a/a/m2/m0;->f:[B

    move-object v1, p0

    goto :goto_0

    :cond_0
    move-object v1, p0

    move-object/from16 v0, p7

    :goto_0
    iput-object v0, v1, Lc/a/a/a/j2/t0/c;->j:[B

    return-void
.end method

.method private i(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/t0/c;->j:[B

    array-length v1, v0

    add-int/lit16 p1, p1, 0x4000

    if-ge v1, p1, :cond_0

    .line 2
    array-length p1, v0

    add-int/lit16 p1, p1, 0x4000

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/j2/t0/c;->j:[B

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lc/a/a/a/j2/t0/b;->i:Lcom/google/android/exoplayer2/upstream/d0;

    iget-object v1, p0, Lc/a/a/a/j2/t0/b;->b:Lcom/google/android/exoplayer2/upstream/p;

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/upstream/d0;->e(Lcom/google/android/exoplayer2/upstream/p;)J

    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    .line 2
    iget-boolean v0, p0, Lc/a/a/a/j2/t0/c;->k:Z

    if-nez v0, :cond_1

    .line 3
    invoke-direct {p0, v1}, Lc/a/a/a/j2/t0/c;->i(I)V

    .line 4
    iget-object v0, p0, Lc/a/a/a/j2/t0/b;->i:Lcom/google/android/exoplayer2/upstream/d0;

    iget-object v3, p0, Lc/a/a/a/j2/t0/c;->j:[B

    const/16 v4, 0x4000

    invoke-virtual {v0, v3, v1, v4}, Lcom/google/android/exoplayer2/upstream/d0;->b([BII)I

    move-result v0

    if-eq v0, v2, :cond_0

    add-int/2addr v1, v0

    goto :goto_0

    .line 5
    :cond_1
    iget-boolean v0, p0, Lc/a/a/a/j2/t0/c;->k:Z

    if-nez v0, :cond_2

    .line 6
    iget-object v0, p0, Lc/a/a/a/j2/t0/c;->j:[B

    invoke-virtual {p0, v0, v1}, Lc/a/a/a/j2/t0/c;->g([BI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    :cond_2
    iget-object v0, p0, Lc/a/a/a/j2/t0/b;->i:Lcom/google/android/exoplayer2/upstream/d0;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->l(Lcom/google/android/exoplayer2/upstream/m;)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lc/a/a/a/j2/t0/b;->i:Lcom/google/android/exoplayer2/upstream/d0;

    invoke-static {v1}, Lc/a/a/a/m2/m0;->l(Lcom/google/android/exoplayer2/upstream/m;)V

    .line 8
    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/j2/t0/c;->k:Z

    return-void
.end method

.method protected abstract g([BI)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public h()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/t0/c;->j:[B

    return-object v0
.end method
