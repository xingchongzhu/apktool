.class public abstract Lc/a/a/a/j2/t0/b;
.super Ljava/lang/Object;
.source "Chunk.java"

# interfaces
.implements Lcom/google/android/exoplayer2/upstream/b0$e;


# instance fields
.field public final a:J

.field public final b:Lcom/google/android/exoplayer2/upstream/p;

.field public final c:I

.field public final d:Lc/a/a/a/u0;

.field public final e:I

.field public final f:Ljava/lang/Object;

.field public final g:J

.field public final h:J

.field protected final i:Lcom/google/android/exoplayer2/upstream/d0;


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/upstream/m;Lcom/google/android/exoplayer2/upstream/p;ILc/a/a/a/u0;ILjava/lang/Object;JJ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/google/android/exoplayer2/upstream/d0;

    invoke-direct {v0, p1}, Lcom/google/android/exoplayer2/upstream/d0;-><init>(Lcom/google/android/exoplayer2/upstream/m;)V

    iput-object v0, p0, Lc/a/a/a/j2/t0/b;->i:Lcom/google/android/exoplayer2/upstream/d0;

    .line 3
    invoke-static {p2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/exoplayer2/upstream/p;

    iput-object p1, p0, Lc/a/a/a/j2/t0/b;->b:Lcom/google/android/exoplayer2/upstream/p;

    .line 4
    iput p3, p0, Lc/a/a/a/j2/t0/b;->c:I

    .line 5
    iput-object p4, p0, Lc/a/a/a/j2/t0/b;->d:Lc/a/a/a/u0;

    .line 6
    iput p5, p0, Lc/a/a/a/j2/t0/b;->e:I

    .line 7
    iput-object p6, p0, Lc/a/a/a/j2/t0/b;->f:Ljava/lang/Object;

    .line 8
    iput-wide p7, p0, Lc/a/a/a/j2/t0/b;->g:J

    .line 9
    iput-wide p9, p0, Lc/a/a/a/j2/t0/b;->h:J

    .line 10
    invoke-static {}, Lc/a/a/a/j2/w;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lc/a/a/a/j2/t0/b;->a:J

    return-void
.end method


# virtual methods
.method public final b()J
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/t0/b;->i:Lcom/google/android/exoplayer2/upstream/d0;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/upstream/d0;->r()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lc/a/a/a/j2/t0/b;->h:J

    iget-wide v2, p0, Lc/a/a/a/j2/t0/b;->g:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public final e()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/t0/b;->i:Lcom/google/android/exoplayer2/upstream/d0;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/upstream/d0;->t()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final f()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/t0/b;->i:Lcom/google/android/exoplayer2/upstream/d0;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/upstream/d0;->s()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
