.class final Lc/a/a/a/f2/h0/c;
.super Lc/a/a/a/f2/t;
.source "StartOffsetExtractorInput.java"


# instance fields
.field private final c:J


# direct methods
.method public constructor <init>(Lc/a/a/a/f2/k;J)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lc/a/a/a/f2/t;-><init>(Lc/a/a/a/f2/k;)V

    .line 2
    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v0

    cmp-long p1, v0, p2

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lc/a/a/a/m2/f;->a(Z)V

    .line 3
    iput-wide p2, p0, Lc/a/a/a/f2/h0/c;->c:J

    return-void
.end method


# virtual methods
.method public a()J
    .locals 4

    .line 1
    invoke-super {p0}, Lc/a/a/a/f2/t;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lc/a/a/a/f2/h0/c;->c:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public n()J
    .locals 4

    .line 1
    invoke-super {p0}, Lc/a/a/a/f2/t;->n()J

    move-result-wide v0

    iget-wide v2, p0, Lc/a/a/a/f2/h0/c;->c:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public q()J
    .locals 4

    .line 1
    invoke-super {p0}, Lc/a/a/a/f2/t;->q()J

    move-result-wide v0

    iget-wide v2, p0, Lc/a/a/a/f2/h0/c;->c:J

    sub-long/2addr v0, v2

    return-wide v0
.end method
