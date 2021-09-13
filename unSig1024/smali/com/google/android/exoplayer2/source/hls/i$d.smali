.class final Lcom/google/android/exoplayer2/source/hls/i$d;
.super Lc/a/a/a/l2/e;
.source "HlsChunkSource.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/source/hls/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field private g:I


# direct methods
.method public constructor <init>(Lc/a/a/a/j2/p0;[I)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/l2/e;-><init>(Lc/a/a/a/j2/p0;[I)V

    const/4 v0, 0x0

    .line 2
    aget p2, p2, v0

    invoke-virtual {p1, p2}, Lc/a/a/a/j2/p0;->l(I)Lc/a/a/a/u0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lc/a/a/a/l2/e;->t(Lc/a/a/a/u0;)I

    move-result p1

    iput p1, p0, Lcom/google/android/exoplayer2/source/hls/i$d;->g:I

    return-void
.end method


# virtual methods
.method public i(JJJLjava/util/List;[Lc/a/a/a/j2/t0/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJJ",
            "Ljava/util/List<",
            "+",
            "Lc/a/a/a/j2/t0/d;",
            ">;[",
            "Lc/a/a/a/j2/t0/e;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    .line 2
    iget p3, p0, Lcom/google/android/exoplayer2/source/hls/i$d;->g:I

    invoke-virtual {p0, p3, p1, p2}, Lc/a/a/a/l2/e;->u(IJ)Z

    move-result p3

    if-nez p3, :cond_0

    return-void

    .line 3
    :cond_0
    iget p3, p0, Lc/a/a/a/l2/e;->b:I

    add-int/lit8 p3, p3, -0x1

    :goto_0
    if-ltz p3, :cond_2

    .line 4
    invoke-virtual {p0, p3, p1, p2}, Lc/a/a/a/l2/e;->u(IJ)Z

    move-result p4

    if-nez p4, :cond_1

    .line 5
    iput p3, p0, Lcom/google/android/exoplayer2/source/hls/i$d;->g:I

    return-void

    :cond_1
    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    .line 6
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public m()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public n()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/exoplayer2/source/hls/i$d;->g:I

    return v0
.end method

.method public p()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
