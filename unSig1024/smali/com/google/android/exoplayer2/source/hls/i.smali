.class Lcom/google/android/exoplayer2/source/hls/i;
.super Ljava/lang/Object;
.source "HlsChunkSource.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/hls/i$c;,
        Lcom/google/android/exoplayer2/source/hls/i$a;,
        Lcom/google/android/exoplayer2/source/hls/i$d;,
        Lcom/google/android/exoplayer2/source/hls/i$e;,
        Lcom/google/android/exoplayer2/source/hls/i$b;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/exoplayer2/source/hls/k;

.field private final b:Lcom/google/android/exoplayer2/upstream/m;

.field private final c:Lcom/google/android/exoplayer2/upstream/m;

.field private final d:Lcom/google/android/exoplayer2/source/hls/t;

.field private final e:[Landroid/net/Uri;

.field private final f:[Lc/a/a/a/u0;

.field private final g:Lcom/google/android/exoplayer2/source/hls/v/k;

.field private final h:Lc/a/a/a/j2/p0;

.field private final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/a/u0;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Lcom/google/android/exoplayer2/source/hls/h;

.field private k:Z

.field private l:[B

.field private m:Ljava/io/IOException;

.field private n:Landroid/net/Uri;

.field private o:Z

.field private p:Lc/a/a/a/l2/h;

.field private q:J

.field private r:Z


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/source/hls/k;Lcom/google/android/exoplayer2/source/hls/v/k;[Landroid/net/Uri;[Lc/a/a/a/u0;Lcom/google/android/exoplayer2/source/hls/j;Lcom/google/android/exoplayer2/upstream/e0;Lcom/google/android/exoplayer2/source/hls/t;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/source/hls/k;",
            "Lcom/google/android/exoplayer2/source/hls/v/k;",
            "[",
            "Landroid/net/Uri;",
            "[",
            "Lc/a/a/a/u0;",
            "Lcom/google/android/exoplayer2/source/hls/j;",
            "Lcom/google/android/exoplayer2/upstream/e0;",
            "Lcom/google/android/exoplayer2/source/hls/t;",
            "Ljava/util/List<",
            "Lc/a/a/a/u0;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/i;->a:Lcom/google/android/exoplayer2/source/hls/k;

    .line 3
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/i;->g:Lcom/google/android/exoplayer2/source/hls/v/k;

    .line 4
    iput-object p3, p0, Lcom/google/android/exoplayer2/source/hls/i;->e:[Landroid/net/Uri;

    .line 5
    iput-object p4, p0, Lcom/google/android/exoplayer2/source/hls/i;->f:[Lc/a/a/a/u0;

    .line 6
    iput-object p7, p0, Lcom/google/android/exoplayer2/source/hls/i;->d:Lcom/google/android/exoplayer2/source/hls/t;

    .line 7
    iput-object p8, p0, Lcom/google/android/exoplayer2/source/hls/i;->i:Ljava/util/List;

    .line 8
    new-instance p1, Lcom/google/android/exoplayer2/source/hls/h;

    const/4 p2, 0x4

    invoke-direct {p1, p2}, Lcom/google/android/exoplayer2/source/hls/h;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/i;->j:Lcom/google/android/exoplayer2/source/hls/h;

    .line 9
    sget-object p1, Lc/a/a/a/m2/m0;->f:[B

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/i;->l:[B

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/hls/i;->q:J

    const/4 p1, 0x1

    .line 11
    invoke-interface {p5, p1}, Lcom/google/android/exoplayer2/source/hls/j;->a(I)Lcom/google/android/exoplayer2/upstream/m;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/i;->b:Lcom/google/android/exoplayer2/upstream/m;

    if-eqz p6, :cond_0

    .line 12
    invoke-interface {p1, p6}, Lcom/google/android/exoplayer2/upstream/m;->k(Lcom/google/android/exoplayer2/upstream/e0;)V

    :cond_0
    const/4 p1, 0x3

    .line 13
    invoke-interface {p5, p1}, Lcom/google/android/exoplayer2/source/hls/j;->a(I)Lcom/google/android/exoplayer2/upstream/m;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/i;->c:Lcom/google/android/exoplayer2/upstream/m;

    .line 14
    new-instance p1, Lc/a/a/a/j2/p0;

    invoke-direct {p1, p4}, Lc/a/a/a/j2/p0;-><init>([Lc/a/a/a/u0;)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/i;->h:Lc/a/a/a/j2/p0;

    .line 15
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 p2, 0x0

    .line 16
    :goto_0
    array-length p5, p3

    if-ge p2, p5, :cond_2

    .line 17
    aget-object p5, p4, p2

    iget p5, p5, Lc/a/a/a/u0;->e:I

    and-int/lit16 p5, p5, 0x4000

    if-nez p5, :cond_1

    .line 18
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    invoke-virtual {p1, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 19
    :cond_2
    new-instance p2, Lcom/google/android/exoplayer2/source/hls/i$d;

    iget-object p3, p0, Lcom/google/android/exoplayer2/source/hls/i;->h:Lc/a/a/a/j2/p0;

    .line 20
    invoke-static {p1}, Lc/a/b/c/c;->i(Ljava/util/Collection;)[I

    move-result-object p1

    invoke-direct {p2, p3, p1}, Lcom/google/android/exoplayer2/source/hls/i$d;-><init>(Lc/a/a/a/j2/p0;[I)V

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/i;->p:Lc/a/a/a/l2/h;

    return-void
.end method

.method private static c(Lcom/google/android/exoplayer2/source/hls/v/g;Lcom/google/android/exoplayer2/source/hls/v/g$e;)Landroid/net/Uri;
    .locals 0

    if-eqz p1, :cond_1

    .line 1
    iget-object p1, p1, Lcom/google/android/exoplayer2/source/hls/v/g$e;->g:Ljava/lang/String;

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p0, p0, Lcom/google/android/exoplayer2/source/hls/v/h;->a:Ljava/lang/String;

    invoke-static {p0, p1}, Lc/a/a/a/m2/l0;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private e(Lcom/google/android/exoplayer2/source/hls/m;ZLcom/google/android/exoplayer2/source/hls/v/g;JJ)Landroid/util/Pair;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/source/hls/m;",
            "Z",
            "Lcom/google/android/exoplayer2/source/hls/v/g;",
            "JJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, -0x1

    if-eqz p1, :cond_4

    if-eqz p2, :cond_0

    goto :goto_3

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/source/hls/m;->p()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 2
    new-instance p2, Landroid/util/Pair;

    .line 3
    iget p3, p1, Lcom/google/android/exoplayer2/source/hls/m;->p:I

    if-ne p3, v1, :cond_1

    .line 4
    invoke-virtual {p1}, Lc/a/a/a/j2/t0/d;->g()J

    move-result-wide p3

    goto :goto_0

    .line 5
    :cond_1
    iget-wide p3, p1, Lc/a/a/a/j2/t0/d;->j:J

    .line 6
    :goto_0
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    .line 7
    iget p1, p1, Lcom/google/android/exoplayer2/source/hls/m;->p:I

    if-ne p1, v1, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v1, p1, 0x1

    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p2, p3, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    .line 8
    :cond_3
    new-instance p2, Landroid/util/Pair;

    iget-wide p3, p1, Lc/a/a/a/j2/t0/d;->j:J

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    iget p1, p1, Lcom/google/android/exoplayer2/source/hls/m;->p:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p2, p3, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_2
    return-object p2

    .line 9
    :cond_4
    :goto_3
    iget-wide v2, p3, Lcom/google/android/exoplayer2/source/hls/v/g;->s:J

    add-long/2addr v2, p4

    if-eqz p1, :cond_6

    .line 10
    iget-boolean p2, p0, Lcom/google/android/exoplayer2/source/hls/i;->o:Z

    if-eqz p2, :cond_5

    goto :goto_4

    :cond_5
    iget-wide p6, p1, Lc/a/a/a/j2/t0/b;->g:J

    .line 11
    :cond_6
    :goto_4
    iget-boolean p2, p3, Lcom/google/android/exoplayer2/source/hls/v/g;->m:Z

    if-nez p2, :cond_7

    cmp-long p2, p6, v2

    if-ltz p2, :cond_7

    .line 12
    new-instance p1, Landroid/util/Pair;

    iget-wide p4, p3, Lcom/google/android/exoplayer2/source/hls/v/g;->i:J

    iget-object p2, p3, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    .line 13
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    int-to-long p2, p2

    add-long/2addr p4, p2

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    .line 14
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_7
    sub-long/2addr p6, p4

    .line 15
    iget-object p2, p3, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    .line 16
    invoke-static {p6, p7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p4

    iget-object p5, p0, Lcom/google/android/exoplayer2/source/hls/i;->g:Lcom/google/android/exoplayer2/source/hls/v/k;

    .line 17
    invoke-interface {p5}, Lcom/google/android/exoplayer2/source/hls/v/k;->a()Z

    move-result p5

    const/4 v2, 0x0

    if-eqz p5, :cond_9

    if-nez p1, :cond_8

    goto :goto_5

    :cond_8
    const/4 p1, 0x0

    goto :goto_6

    :cond_9
    :goto_5
    const/4 p1, 0x1

    .line 18
    :goto_6
    invoke-static {p2, p4, v0, p1}, Lc/a/a/a/m2/m0;->f(Ljava/util/List;Ljava/lang/Comparable;ZZ)I

    move-result p1

    int-to-long p4, p1

    .line 19
    iget-wide v3, p3, Lcom/google/android/exoplayer2/source/hls/v/g;->i:J

    add-long/2addr p4, v3

    if-ltz p1, :cond_d

    .line 20
    iget-object p2, p3, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/exoplayer2/source/hls/v/g$d;

    .line 21
    iget-wide v3, p1, Lcom/google/android/exoplayer2/source/hls/v/g$e;->e:J

    iget-wide v5, p1, Lcom/google/android/exoplayer2/source/hls/v/g$e;->c:J

    add-long/2addr v3, v5

    cmp-long p2, p6, v3

    if-gez p2, :cond_a

    .line 22
    iget-object p1, p1, Lcom/google/android/exoplayer2/source/hls/v/g$d;->m:Ljava/util/List;

    goto :goto_7

    .line 23
    :cond_a
    iget-object p1, p3, Lcom/google/android/exoplayer2/source/hls/v/g;->q:Ljava/util/List;

    .line 24
    :goto_7
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    if-ge v2, p2, :cond_d

    .line 25
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/exoplayer2/source/hls/v/g$b;

    .line 26
    iget-wide v3, p2, Lcom/google/android/exoplayer2/source/hls/v/g$e;->e:J

    iget-wide v5, p2, Lcom/google/android/exoplayer2/source/hls/v/g$e;->c:J

    add-long/2addr v3, v5

    cmp-long v0, p6, v3

    if-gez v0, :cond_c

    .line 27
    iget-boolean p2, p2, Lcom/google/android/exoplayer2/source/hls/v/g$b;->l:Z

    if-eqz p2, :cond_d

    .line 28
    iget-object p2, p3, Lcom/google/android/exoplayer2/source/hls/v/g;->q:Ljava/util/List;

    if-ne p1, p2, :cond_b

    const-wide/16 p1, 0x1

    goto :goto_8

    :cond_b
    const-wide/16 p1, 0x0

    :goto_8
    add-long/2addr p4, p1

    move v1, v2

    goto :goto_9

    :cond_c
    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    .line 29
    :cond_d
    :goto_9
    new-instance p1, Landroid/util/Pair;

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method private static f(Lcom/google/android/exoplayer2/source/hls/v/g;JI)Lcom/google/android/exoplayer2/source/hls/i$e;
    .locals 7

    .line 1
    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->i:J

    sub-long v0, p1, v0

    long-to-int v1, v0

    .line 2
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    if-ne v1, v0, :cond_2

    if-eq p3, v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 3
    :goto_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p3, v0, :cond_1

    .line 4
    new-instance v2, Lcom/google/android/exoplayer2/source/hls/i$e;

    iget-object p0, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->q:Ljava/util/List;

    invoke-interface {p0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/exoplayer2/source/hls/v/g$e;

    invoke-direct {v2, p0, p1, p2, p3}, Lcom/google/android/exoplayer2/source/hls/i$e;-><init>(Lcom/google/android/exoplayer2/source/hls/v/g$e;JI)V

    :cond_1
    return-object v2

    .line 5
    :cond_2
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/source/hls/v/g$d;

    if-ne p3, v4, :cond_3

    .line 6
    new-instance p0, Lcom/google/android/exoplayer2/source/hls/i$e;

    invoke-direct {p0, v0, p1, p2, v4}, Lcom/google/android/exoplayer2/source/hls/i$e;-><init>(Lcom/google/android/exoplayer2/source/hls/v/g$e;JI)V

    return-object p0

    .line 7
    :cond_3
    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/v/g$d;->m:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge p3, v5, :cond_4

    .line 8
    new-instance p0, Lcom/google/android/exoplayer2/source/hls/i$e;

    iget-object v0, v0, Lcom/google/android/exoplayer2/source/hls/v/g$d;->m:Ljava/util/List;

    .line 9
    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/source/hls/v/g$e;

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/google/android/exoplayer2/source/hls/i$e;-><init>(Lcom/google/android/exoplayer2/source/hls/v/g$e;JI)V

    return-object p0

    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 10
    iget-object p3, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    const-wide/16 v5, 0x1

    if-ge v1, p3, :cond_5

    .line 11
    new-instance p3, Lcom/google/android/exoplayer2/source/hls/i$e;

    iget-object p0, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    .line 12
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/exoplayer2/source/hls/v/g$e;

    add-long/2addr p1, v5

    invoke-direct {p3, p0, p1, p2, v4}, Lcom/google/android/exoplayer2/source/hls/i$e;-><init>(Lcom/google/android/exoplayer2/source/hls/v/g$e;JI)V

    return-object p3

    .line 13
    :cond_5
    iget-object p3, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->q:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_6

    .line 14
    new-instance p3, Lcom/google/android/exoplayer2/source/hls/i$e;

    iget-object p0, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->q:Ljava/util/List;

    .line 15
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/exoplayer2/source/hls/v/g$e;

    add-long/2addr p1, v5

    invoke-direct {p3, p0, p1, p2, v3}, Lcom/google/android/exoplayer2/source/hls/i$e;-><init>(Lcom/google/android/exoplayer2/source/hls/v/g$e;JI)V

    return-object p3

    :cond_6
    return-object v2
.end method

.method static h(Lcom/google/android/exoplayer2/source/hls/v/g;JI)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/source/hls/v/g;",
            "JI)",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/source/hls/v/g$e;",
            ">;"
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->i:J

    sub-long/2addr p1, v0

    long-to-int p2, p1

    if-ltz p2, :cond_7

    .line 2
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-ge p1, p2, :cond_0

    goto :goto_2

    .line 3
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ge p2, v0, :cond_4

    if-eq p3, v2, :cond_3

    .line 5
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/source/hls/v/g$d;

    if-nez p3, :cond_1

    .line 6
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 7
    :cond_1
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/hls/v/g$d;->m:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge p3, v3, :cond_2

    .line 8
    iget-object v0, v0, Lcom/google/android/exoplayer2/source/hls/v/g$d;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v0, p3, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p3

    invoke-interface {p1, p3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    :goto_0
    add-int/lit8 p2, p2, 0x1

    .line 9
    :cond_3
    iget-object p3, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    .line 10
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p3, p2, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p2

    .line 11
    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    const/4 p3, 0x0

    .line 12
    :cond_4
    iget-wide v3, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->l:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v3, v5

    if-eqz p2, :cond_6

    if-ne p3, v2, :cond_5

    goto :goto_1

    :cond_5
    move v1, p3

    .line 13
    :goto_1
    iget-object p2, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->q:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-ge v1, p2, :cond_6

    .line 14
    iget-object p0, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->q:Ljava/util/List;

    .line 15
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    invoke-interface {p0, v1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    .line 16
    invoke-interface {p1, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 17
    :cond_6
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0

    .line 18
    :cond_7
    :goto_2
    invoke-static {}, Lc/a/b/b/r;->p()Lc/a/b/b/r;

    move-result-object p0

    return-object p0
.end method

.method private k(Landroid/net/Uri;I)Lc/a/a/a/j2/t0/b;
    .locals 7

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 1
    :cond_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/i;->j:Lcom/google/android/exoplayer2/source/hls/h;

    invoke-virtual {v1, p1}, Lcom/google/android/exoplayer2/source/hls/h;->c(Landroid/net/Uri;)[B

    move-result-object v1

    if-eqz v1, :cond_1

    .line 2
    iget-object p2, p0, Lcom/google/android/exoplayer2/source/hls/i;->j:Lcom/google/android/exoplayer2/source/hls/h;

    invoke-virtual {p2, p1, v1}, Lcom/google/android/exoplayer2/source/hls/h;->b(Landroid/net/Uri;[B)[B

    return-object v0

    .line 3
    :cond_1
    new-instance v0, Lcom/google/android/exoplayer2/upstream/p$b;

    invoke-direct {v0}, Lcom/google/android/exoplayer2/upstream/p$b;-><init>()V

    .line 4
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/upstream/p$b;->i(Landroid/net/Uri;)Lcom/google/android/exoplayer2/upstream/p$b;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/upstream/p$b;->b(I)Lcom/google/android/exoplayer2/upstream/p$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/upstream/p$b;->a()Lcom/google/android/exoplayer2/upstream/p;

    move-result-object v2

    .line 5
    new-instance p1, Lcom/google/android/exoplayer2/source/hls/i$a;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/i;->c:Lcom/google/android/exoplayer2/upstream/m;

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/i;->f:[Lc/a/a/a/u0;

    aget-object v3, v0, p2

    iget-object p2, p0, Lcom/google/android/exoplayer2/source/hls/i;->p:Lc/a/a/a/l2/h;

    .line 6
    invoke-interface {p2}, Lc/a/a/a/l2/h;->m()I

    move-result v4

    iget-object p2, p0, Lcom/google/android/exoplayer2/source/hls/i;->p:Lc/a/a/a/l2/h;

    .line 7
    invoke-interface {p2}, Lc/a/a/a/l2/h;->p()Ljava/lang/Object;

    move-result-object v5

    iget-object v6, p0, Lcom/google/android/exoplayer2/source/hls/i;->l:[B

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, Lcom/google/android/exoplayer2/source/hls/i$a;-><init>(Lcom/google/android/exoplayer2/upstream/m;Lcom/google/android/exoplayer2/upstream/p;Lc/a/a/a/u0;ILjava/lang/Object;[B)V

    return-object p1
.end method

.method private q(J)J
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/i;->q:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_1

    sub-long v2, v0, p1

    :cond_1
    return-wide v2
.end method

.method private u(Lcom/google/android/exoplayer2/source/hls/v/g;)V
    .locals 4

    .line 1
    iget-boolean v0, p1, Lcom/google/android/exoplayer2/source/hls/v/g;->m:Z

    if-eqz v0, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/source/hls/v/g;->e()J

    move-result-wide v0

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/i;->g:Lcom/google/android/exoplayer2/source/hls/v/k;

    invoke-interface {p1}, Lcom/google/android/exoplayer2/source/hls/v/k;->l()J

    move-result-wide v2

    sub-long/2addr v0, v2

    :goto_0
    iput-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/i;->q:J

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/exoplayer2/source/hls/m;J)[Lc/a/a/a/j2/t0/e;
    .locals 17

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    if-nez v9, :cond_0

    const/4 v0, -0x1

    const/4 v10, -0x1

    goto :goto_0

    .line 1
    :cond_0
    iget-object v0, v8, Lcom/google/android/exoplayer2/source/hls/i;->h:Lc/a/a/a/j2/p0;

    iget-object v1, v9, Lc/a/a/a/j2/t0/b;->d:Lc/a/a/a/u0;

    invoke-virtual {v0, v1}, Lc/a/a/a/j2/p0;->m(Lc/a/a/a/u0;)I

    move-result v0

    move v10, v0

    .line 2
    :goto_0
    iget-object v0, v8, Lcom/google/android/exoplayer2/source/hls/i;->p:Lc/a/a/a/l2/h;

    invoke-interface {v0}, Lc/a/a/a/l2/k;->length()I

    move-result v11

    new-array v12, v11, [Lc/a/a/a/j2/t0/e;

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_1
    if-ge v14, v11, :cond_3

    .line 3
    iget-object v0, v8, Lcom/google/android/exoplayer2/source/hls/i;->p:Lc/a/a/a/l2/h;

    invoke-interface {v0, v14}, Lc/a/a/a/l2/k;->g(I)I

    move-result v0

    .line 4
    iget-object v1, v8, Lcom/google/android/exoplayer2/source/hls/i;->e:[Landroid/net/Uri;

    aget-object v1, v1, v0

    .line 5
    iget-object v2, v8, Lcom/google/android/exoplayer2/source/hls/i;->g:Lcom/google/android/exoplayer2/source/hls/v/k;

    invoke-interface {v2, v1}, Lcom/google/android/exoplayer2/source/hls/v/k;->c(Landroid/net/Uri;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 6
    sget-object v0, Lc/a/a/a/j2/t0/e;->a:Lc/a/a/a/j2/t0/e;

    aput-object v0, v12, v14

    move/from16 v16, v14

    goto :goto_3

    .line 7
    :cond_1
    iget-object v2, v8, Lcom/google/android/exoplayer2/source/hls/i;->g:Lcom/google/android/exoplayer2/source/hls/v/k;

    .line 8
    invoke-interface {v2, v1, v13}, Lcom/google/android/exoplayer2/source/hls/v/k;->k(Landroid/net/Uri;Z)Lcom/google/android/exoplayer2/source/hls/v/g;

    move-result-object v15

    .line 9
    invoke-static {v15}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    iget-wide v1, v15, Lcom/google/android/exoplayer2/source/hls/v/g;->f:J

    iget-object v3, v8, Lcom/google/android/exoplayer2/source/hls/i;->g:Lcom/google/android/exoplayer2/source/hls/v/k;

    .line 11
    invoke-interface {v3}, Lcom/google/android/exoplayer2/source/hls/v/k;->l()J

    move-result-wide v3

    sub-long v6, v1, v3

    if-eq v0, v10, :cond_2

    const/4 v0, 0x1

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v3, v15

    move-wide v4, v6

    move/from16 v16, v14

    move-wide v13, v6

    move-wide/from16 v6, p2

    .line 12
    invoke-direct/range {v0 .. v7}, Lcom/google/android/exoplayer2/source/hls/i;->e(Lcom/google/android/exoplayer2/source/hls/m;ZLcom/google/android/exoplayer2/source/hls/v/g;JJ)Landroid/util/Pair;

    move-result-object v0

    .line 13
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    .line 14
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 15
    new-instance v3, Lcom/google/android/exoplayer2/source/hls/i$c;

    iget-object v4, v15, Lcom/google/android/exoplayer2/source/hls/v/h;->a:Ljava/lang/String;

    .line 16
    invoke-static {v15, v1, v2, v0}, Lcom/google/android/exoplayer2/source/hls/i;->h(Lcom/google/android/exoplayer2/source/hls/v/g;JI)Ljava/util/List;

    move-result-object v0

    invoke-direct {v3, v4, v13, v14, v0}, Lcom/google/android/exoplayer2/source/hls/i$c;-><init>(Ljava/lang/String;JLjava/util/List;)V

    aput-object v3, v12, v16

    :goto_3
    add-int/lit8 v14, v16, 0x1

    const/4 v13, 0x0

    goto :goto_1

    :cond_3
    return-object v12
.end method

.method public b(Lcom/google/android/exoplayer2/source/hls/m;)I
    .locals 8

    .line 1
    iget v0, p1, Lcom/google/android/exoplayer2/source/hls/m;->p:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/i;->e:[Landroid/net/Uri;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/i;->h:Lc/a/a/a/j2/p0;

    iget-object v3, p1, Lc/a/a/a/j2/t0/b;->d:Lc/a/a/a/u0;

    invoke-virtual {v2, v3}, Lc/a/a/a/j2/p0;->m(Lc/a/a/a/u0;)I

    move-result v2

    aget-object v0, v0, v2

    .line 3
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/i;->g:Lcom/google/android/exoplayer2/source/hls/v/k;

    const/4 v3, 0x0

    .line 4
    invoke-interface {v2, v0, v3}, Lcom/google/android/exoplayer2/source/hls/v/k;->k(Landroid/net/Uri;Z)Lcom/google/android/exoplayer2/source/hls/v/g;

    move-result-object v0

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/source/hls/v/g;

    .line 5
    iget-wide v4, p1, Lc/a/a/a/j2/t0/d;->j:J

    iget-wide v6, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->i:J

    sub-long/2addr v4, v6

    long-to-int v2, v4

    if-gez v2, :cond_1

    return v1

    .line 6
    :cond_1
    iget-object v4, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_2

    .line 7
    iget-object v4, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/exoplayer2/source/hls/v/g$d;

    iget-object v2, v2, Lcom/google/android/exoplayer2/source/hls/v/g$d;->m:Ljava/util/List;

    goto :goto_0

    .line 8
    :cond_2
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->q:Ljava/util/List;

    .line 9
    :goto_0
    iget v4, p1, Lcom/google/android/exoplayer2/source/hls/m;->p:I

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x2

    if-lt v4, v5, :cond_3

    return v6

    .line 10
    :cond_3
    iget v4, p1, Lcom/google/android/exoplayer2/source/hls/m;->p:I

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/exoplayer2/source/hls/v/g$b;

    .line 11
    iget-boolean v4, v2, Lcom/google/android/exoplayer2/source/hls/v/g$b;->m:Z

    if-eqz v4, :cond_4

    return v3

    .line 12
    :cond_4
    iget-object v0, v0, Lcom/google/android/exoplayer2/source/hls/v/h;->a:Ljava/lang/String;

    iget-object v2, v2, Lcom/google/android/exoplayer2/source/hls/v/g$e;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Lc/a/a/a/m2/l0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 13
    iget-object p1, p1, Lc/a/a/a/j2/t0/b;->b:Lcom/google/android/exoplayer2/upstream/p;

    iget-object p1, p1, Lcom/google/android/exoplayer2/upstream/p;->a:Landroid/net/Uri;

    invoke-static {v0, p1}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_1

    :cond_5
    const/4 v1, 0x2

    :goto_1
    return v1
.end method

.method public d(JJLjava/util/List;ZLcom/google/android/exoplayer2/source/hls/i$b;)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/source/hls/m;",
            ">;Z",
            "Lcom/google/android/exoplayer2/source/hls/i$b;",
            ")V"
        }
    .end annotation

    move-object/from16 v8, p0

    move-wide/from16 v9, p3

    move-object/from16 v11, p7

    .line 1
    invoke-interface/range {p5 .. p5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v15, 0x0

    goto :goto_0

    :cond_0
    invoke-static/range {p5 .. p5}, Lc/a/b/b/w;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/source/hls/m;

    move-object v15, v0

    :goto_0
    const/4 v13, -0x1

    if-nez v15, :cond_1

    const/4 v14, -0x1

    goto :goto_1

    .line 2
    :cond_1
    iget-object v0, v8, Lcom/google/android/exoplayer2/source/hls/i;->h:Lc/a/a/a/j2/p0;

    iget-object v1, v15, Lc/a/a/a/j2/t0/b;->d:Lc/a/a/a/u0;

    invoke-virtual {v0, v1}, Lc/a/a/a/j2/p0;->m(Lc/a/a/a/u0;)I

    move-result v0

    move v14, v0

    :goto_1
    sub-long v0, v9, p1

    .line 3
    invoke-direct/range {p0 .. p2}, Lcom/google/android/exoplayer2/source/hls/i;->q(J)J

    move-result-wide v2

    if-eqz v15, :cond_2

    .line 4
    iget-boolean v4, v8, Lcom/google/android/exoplayer2/source/hls/i;->o:Z

    if-nez v4, :cond_2

    .line 5
    invoke-virtual {v15}, Lc/a/a/a/j2/t0/b;->d()J

    move-result-wide v4

    sub-long/2addr v0, v4

    const-wide/16 v6, 0x0

    .line 6
    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v18, v2, v16

    if-eqz v18, :cond_2

    sub-long/2addr v2, v4

    .line 7
    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    :cond_2
    move-wide/from16 v19, v0

    move-wide/from16 v21, v2

    .line 8
    invoke-virtual {v8, v15, v9, v10}, Lcom/google/android/exoplayer2/source/hls/i;->a(Lcom/google/android/exoplayer2/source/hls/m;J)[Lc/a/a/a/j2/t0/e;

    move-result-object v24

    .line 9
    iget-object v0, v8, Lcom/google/android/exoplayer2/source/hls/i;->p:Lc/a/a/a/l2/h;

    move-object/from16 v16, v0

    move-wide/from16 v17, p1

    move-object/from16 v23, p5

    invoke-interface/range {v16 .. v24}, Lc/a/a/a/l2/h;->i(JJJLjava/util/List;[Lc/a/a/a/j2/t0/e;)V

    .line 10
    iget-object v0, v8, Lcom/google/android/exoplayer2/source/hls/i;->p:Lc/a/a/a/l2/h;

    invoke-interface {v0}, Lc/a/a/a/l2/h;->j()I

    move-result v6

    const/4 v7, 0x0

    const/4 v4, 0x1

    if-eq v14, v6, :cond_3

    const/16 v16, 0x1

    goto :goto_2

    :cond_3
    const/16 v16, 0x0

    .line 11
    :goto_2
    iget-object v0, v8, Lcom/google/android/exoplayer2/source/hls/i;->e:[Landroid/net/Uri;

    aget-object v5, v0, v6

    .line 12
    iget-object v0, v8, Lcom/google/android/exoplayer2/source/hls/i;->g:Lcom/google/android/exoplayer2/source/hls/v/k;

    invoke-interface {v0, v5}, Lcom/google/android/exoplayer2/source/hls/v/k;->c(Landroid/net/Uri;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 13
    iput-object v5, v11, Lcom/google/android/exoplayer2/source/hls/i$b;->c:Landroid/net/Uri;

    .line 14
    iget-boolean v0, v8, Lcom/google/android/exoplayer2/source/hls/i;->r:Z

    iget-object v1, v8, Lcom/google/android/exoplayer2/source/hls/i;->n:Landroid/net/Uri;

    invoke-virtual {v5, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v1

    and-int/2addr v0, v1

    iput-boolean v0, v8, Lcom/google/android/exoplayer2/source/hls/i;->r:Z

    .line 15
    iput-object v5, v8, Lcom/google/android/exoplayer2/source/hls/i;->n:Landroid/net/Uri;

    return-void

    .line 16
    :cond_4
    iget-object v0, v8, Lcom/google/android/exoplayer2/source/hls/i;->g:Lcom/google/android/exoplayer2/source/hls/v/k;

    .line 17
    invoke-interface {v0, v5, v4}, Lcom/google/android/exoplayer2/source/hls/v/k;->k(Landroid/net/Uri;Z)Lcom/google/android/exoplayer2/source/hls/v/g;

    move-result-object v3

    .line 18
    invoke-static {v3}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    iget-boolean v0, v3, Lcom/google/android/exoplayer2/source/hls/v/h;->c:Z

    iput-boolean v0, v8, Lcom/google/android/exoplayer2/source/hls/i;->o:Z

    .line 20
    invoke-direct {v8, v3}, Lcom/google/android/exoplayer2/source/hls/i;->u(Lcom/google/android/exoplayer2/source/hls/v/g;)V

    .line 21
    iget-wide v0, v3, Lcom/google/android/exoplayer2/source/hls/v/g;->f:J

    iget-object v2, v8, Lcom/google/android/exoplayer2/source/hls/i;->g:Lcom/google/android/exoplayer2/source/hls/v/k;

    .line 22
    invoke-interface {v2}, Lcom/google/android/exoplayer2/source/hls/v/k;->l()J

    move-result-wide v17

    sub-long v17, v0, v17

    move-object/from16 v0, p0

    move-object v1, v15

    move/from16 v2, v16

    move-object/from16 p1, v3

    move-object/from16 v19, v5

    const/4 v12, 0x1

    move-wide/from16 v4, v17

    move/from16 v21, v6

    move-wide/from16 v6, p3

    .line 23
    invoke-direct/range {v0 .. v7}, Lcom/google/android/exoplayer2/source/hls/i;->e(Lcom/google/android/exoplayer2/source/hls/m;ZLcom/google/android/exoplayer2/source/hls/v/g;JJ)Landroid/util/Pair;

    move-result-object v0

    .line 24
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    .line 25
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 26
    iget-wide v4, v3, Lcom/google/android/exoplayer2/source/hls/v/g;->i:J

    cmp-long v6, v1, v4

    if-gez v6, :cond_5

    if-eqz v15, :cond_5

    if-eqz v16, :cond_5

    .line 27
    iget-object v0, v8, Lcom/google/android/exoplayer2/source/hls/i;->e:[Landroid/net/Uri;

    aget-object v6, v0, v14

    .line 28
    iget-object v0, v8, Lcom/google/android/exoplayer2/source/hls/i;->g:Lcom/google/android/exoplayer2/source/hls/v/k;

    .line 29
    invoke-interface {v0, v6, v12}, Lcom/google/android/exoplayer2/source/hls/v/k;->k(Landroid/net/Uri;Z)Lcom/google/android/exoplayer2/source/hls/v/g;

    move-result-object v7

    .line 30
    invoke-static {v7}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    iget-wide v0, v7, Lcom/google/android/exoplayer2/source/hls/v/g;->f:J

    iget-object v2, v8, Lcom/google/android/exoplayer2/source/hls/i;->g:Lcom/google/android/exoplayer2/source/hls/v/k;

    .line 32
    invoke-interface {v2}, Lcom/google/android/exoplayer2/source/hls/v/k;->l()J

    move-result-wide v2

    sub-long v16, v0, v2

    const/4 v2, 0x0

    move-object/from16 v0, p0

    move-object v1, v15

    move-object v3, v7

    move-wide/from16 v4, v16

    move-object/from16 v18, v6

    move-object/from16 v19, v7

    move-wide/from16 v6, p3

    .line 33
    invoke-direct/range {v0 .. v7}, Lcom/google/android/exoplayer2/source/hls/i;->e(Lcom/google/android/exoplayer2/source/hls/m;ZLcom/google/android/exoplayer2/source/hls/v/g;JJ)Landroid/util/Pair;

    move-result-object v0

    .line 34
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    .line 35
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move-object/from16 v4, v18

    move-object/from16 v3, v19

    goto :goto_3

    :cond_5
    move-wide/from16 v16, v17

    move-object/from16 v4, v19

    move/from16 v14, v21

    .line 36
    :goto_3
    iget-wide v5, v3, Lcom/google/android/exoplayer2/source/hls/v/g;->i:J

    cmp-long v7, v1, v5

    if-gez v7, :cond_6

    .line 37
    new-instance v0, Lc/a/a/a/j2/l;

    invoke-direct {v0}, Lc/a/a/a/j2/l;-><init>()V

    iput-object v0, v8, Lcom/google/android/exoplayer2/source/hls/i;->m:Ljava/io/IOException;

    return-void

    .line 38
    :cond_6
    invoke-static {v3, v1, v2, v0}, Lcom/google/android/exoplayer2/source/hls/i;->f(Lcom/google/android/exoplayer2/source/hls/v/g;JI)Lcom/google/android/exoplayer2/source/hls/i$e;

    move-result-object v0

    if-nez v0, :cond_a

    .line 39
    iget-boolean v0, v3, Lcom/google/android/exoplayer2/source/hls/v/g;->m:Z

    if-nez v0, :cond_7

    .line 40
    iput-object v4, v11, Lcom/google/android/exoplayer2/source/hls/i$b;->c:Landroid/net/Uri;

    .line 41
    iget-boolean v0, v8, Lcom/google/android/exoplayer2/source/hls/i;->r:Z

    iget-object v1, v8, Lcom/google/android/exoplayer2/source/hls/i;->n:Landroid/net/Uri;

    invoke-virtual {v4, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v1

    and-int/2addr v0, v1

    iput-boolean v0, v8, Lcom/google/android/exoplayer2/source/hls/i;->r:Z

    .line 42
    iput-object v4, v8, Lcom/google/android/exoplayer2/source/hls/i;->n:Landroid/net/Uri;

    return-void

    :cond_7
    if-nez p6, :cond_9

    .line 43
    iget-object v0, v3, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_4

    .line 44
    :cond_8
    new-instance v0, Lcom/google/android/exoplayer2/source/hls/i$e;

    iget-object v1, v3, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    .line 45
    invoke-static {v1}, Lc/a/b/b/w;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/exoplayer2/source/hls/v/g$e;

    iget-wide v5, v3, Lcom/google/android/exoplayer2/source/hls/v/g;->i:J

    iget-object v2, v3, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    .line 46
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    int-to-long v9, v2

    add-long/2addr v5, v9

    const-wide/16 v9, 0x1

    sub-long/2addr v5, v9

    invoke-direct {v0, v1, v5, v6, v13}, Lcom/google/android/exoplayer2/source/hls/i$e;-><init>(Lcom/google/android/exoplayer2/source/hls/v/g$e;JI)V

    goto :goto_5

    .line 47
    :cond_9
    :goto_4
    iput-boolean v12, v11, Lcom/google/android/exoplayer2/source/hls/i$b;->b:Z

    return-void

    :cond_a
    :goto_5
    const/4 v1, 0x0

    .line 48
    iput-boolean v1, v8, Lcom/google/android/exoplayer2/source/hls/i;->r:Z

    const/4 v1, 0x0

    .line 49
    iput-object v1, v8, Lcom/google/android/exoplayer2/source/hls/i;->n:Landroid/net/Uri;

    .line 50
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/i$e;->a:Lcom/google/android/exoplayer2/source/hls/v/g$e;

    iget-object v1, v1, Lcom/google/android/exoplayer2/source/hls/v/g$e;->b:Lcom/google/android/exoplayer2/source/hls/v/g$d;

    .line 51
    invoke-static {v3, v1}, Lcom/google/android/exoplayer2/source/hls/i;->c(Lcom/google/android/exoplayer2/source/hls/v/g;Lcom/google/android/exoplayer2/source/hls/v/g$e;)Landroid/net/Uri;

    move-result-object v1

    .line 52
    invoke-direct {v8, v1, v14}, Lcom/google/android/exoplayer2/source/hls/i;->k(Landroid/net/Uri;I)Lc/a/a/a/j2/t0/b;

    move-result-object v2

    iput-object v2, v11, Lcom/google/android/exoplayer2/source/hls/i$b;->a:Lc/a/a/a/j2/t0/b;

    if-eqz v2, :cond_b

    return-void

    .line 53
    :cond_b
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/i$e;->a:Lcom/google/android/exoplayer2/source/hls/v/g$e;

    invoke-static {v3, v2}, Lcom/google/android/exoplayer2/source/hls/i;->c(Lcom/google/android/exoplayer2/source/hls/v/g;Lcom/google/android/exoplayer2/source/hls/v/g$e;)Landroid/net/Uri;

    move-result-object v2

    .line 54
    invoke-direct {v8, v2, v14}, Lcom/google/android/exoplayer2/source/hls/i;->k(Landroid/net/Uri;I)Lc/a/a/a/j2/t0/b;

    move-result-object v5

    iput-object v5, v11, Lcom/google/android/exoplayer2/source/hls/i$b;->a:Lc/a/a/a/j2/t0/b;

    if-eqz v5, :cond_c

    return-void

    .line 55
    :cond_c
    iget-object v13, v8, Lcom/google/android/exoplayer2/source/hls/i;->a:Lcom/google/android/exoplayer2/source/hls/k;

    iget-object v5, v8, Lcom/google/android/exoplayer2/source/hls/i;->b:Lcom/google/android/exoplayer2/upstream/m;

    iget-object v6, v8, Lcom/google/android/exoplayer2/source/hls/i;->f:[Lc/a/a/a/u0;

    aget-object v6, v6, v14

    iget-object v7, v8, Lcom/google/android/exoplayer2/source/hls/i;->i:Ljava/util/List;

    iget-object v9, v8, Lcom/google/android/exoplayer2/source/hls/i;->p:Lc/a/a/a/l2/h;

    .line 56
    invoke-interface {v9}, Lc/a/a/a/l2/h;->m()I

    move-result v22

    iget-object v9, v8, Lcom/google/android/exoplayer2/source/hls/i;->p:Lc/a/a/a/l2/h;

    .line 57
    invoke-interface {v9}, Lc/a/a/a/l2/h;->p()Ljava/lang/Object;

    move-result-object v23

    iget-boolean v9, v8, Lcom/google/android/exoplayer2/source/hls/i;->k:Z

    iget-object v10, v8, Lcom/google/android/exoplayer2/source/hls/i;->d:Lcom/google/android/exoplayer2/source/hls/t;

    iget-object v12, v8, Lcom/google/android/exoplayer2/source/hls/i;->j:Lcom/google/android/exoplayer2/source/hls/h;

    .line 58
    invoke-virtual {v12, v2}, Lcom/google/android/exoplayer2/source/hls/h;->a(Landroid/net/Uri;)[B

    move-result-object v27

    iget-object v2, v8, Lcom/google/android/exoplayer2/source/hls/i;->j:Lcom/google/android/exoplayer2/source/hls/h;

    .line 59
    invoke-virtual {v2, v1}, Lcom/google/android/exoplayer2/source/hls/h;->a(Landroid/net/Uri;)[B

    move-result-object v28

    move-object v14, v5

    move-object v12, v15

    move-object v15, v6

    move-object/from16 v18, v3

    move-object/from16 v19, v0

    move-object/from16 v20, v4

    move-object/from16 v21, v7

    move/from16 v24, v9

    move-object/from16 v25, v10

    move-object/from16 v26, v12

    .line 60
    invoke-static/range {v13 .. v28}, Lcom/google/android/exoplayer2/source/hls/m;->i(Lcom/google/android/exoplayer2/source/hls/k;Lcom/google/android/exoplayer2/upstream/m;Lc/a/a/a/u0;JLcom/google/android/exoplayer2/source/hls/v/g;Lcom/google/android/exoplayer2/source/hls/i$e;Landroid/net/Uri;Ljava/util/List;ILjava/lang/Object;ZLcom/google/android/exoplayer2/source/hls/t;Lcom/google/android/exoplayer2/source/hls/m;[B[B)Lcom/google/android/exoplayer2/source/hls/m;

    move-result-object v0

    iput-object v0, v11, Lcom/google/android/exoplayer2/source/hls/i$b;->a:Lc/a/a/a/j2/t0/b;

    return-void
.end method

.method public g(JLjava/util/List;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "+",
            "Lc/a/a/a/j2/t0/d;",
            ">;)I"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/i;->m:Ljava/io/IOException;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/i;->p:Lc/a/a/a/l2/h;

    invoke-interface {v0}, Lc/a/a/a/l2/k;->length()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/i;->p:Lc/a/a/a/l2/h;

    invoke-interface {v0, p1, p2, p3}, Lc/a/a/a/l2/h;->h(JLjava/util/List;)I

    move-result p1

    return p1

    .line 3
    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    return p1
.end method

.method public i()Lc/a/a/a/j2/p0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/i;->h:Lc/a/a/a/j2/p0;

    return-object v0
.end method

.method public j()Lc/a/a/a/l2/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/i;->p:Lc/a/a/a/l2/h;

    return-object v0
.end method

.method public l(Lc/a/a/a/j2/t0/b;J)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/i;->p:Lc/a/a/a/l2/h;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/i;->h:Lc/a/a/a/j2/p0;

    iget-object p1, p1, Lc/a/a/a/j2/t0/b;->d:Lc/a/a/a/u0;

    .line 2
    invoke-virtual {v1, p1}, Lc/a/a/a/j2/p0;->m(Lc/a/a/a/u0;)I

    move-result p1

    invoke-interface {v0, p1}, Lc/a/a/a/l2/k;->s(I)I

    move-result p1

    .line 3
    invoke-interface {v0, p1, p2, p3}, Lc/a/a/a/l2/h;->a(IJ)Z

    move-result p1

    return p1
.end method

.method public m()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/i;->m:Ljava/io/IOException;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/i;->n:Landroid/net/Uri;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/google/android/exoplayer2/source/hls/i;->r:Z

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/i;->g:Lcom/google/android/exoplayer2/source/hls/v/k;

    invoke-interface {v1, v0}, Lcom/google/android/exoplayer2/source/hls/v/k;->g(Landroid/net/Uri;)V

    :cond_0
    return-void

    .line 4
    :cond_1
    throw v0
.end method

.method public n(Lc/a/a/a/j2/t0/b;)V
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/google/android/exoplayer2/source/hls/i$a;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Lcom/google/android/exoplayer2/source/hls/i$a;

    .line 3
    invoke-virtual {p1}, Lc/a/a/a/j2/t0/c;->h()[B

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/hls/i;->l:[B

    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/i;->j:Lcom/google/android/exoplayer2/source/hls/h;

    iget-object v1, p1, Lc/a/a/a/j2/t0/b;->b:Lcom/google/android/exoplayer2/upstream/p;

    iget-object v1, v1, Lcom/google/android/exoplayer2/upstream/p;->a:Landroid/net/Uri;

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/source/hls/i$a;->j()[B

    move-result-object p1

    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    invoke-virtual {v0, v1, p1}, Lcom/google/android/exoplayer2/source/hls/h;->b(Landroid/net/Uri;[B)[B

    :cond_0
    return-void
.end method

.method public o(Landroid/net/Uri;J)Z
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/i;->e:[Landroid/net/Uri;

    array-length v3, v2

    const/4 v4, -0x1

    if-ge v1, v3, :cond_1

    .line 2
    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :goto_1
    const/4 v2, 0x1

    if-ne v1, v4, :cond_2

    return v2

    .line 3
    :cond_2
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/hls/i;->p:Lc/a/a/a/l2/h;

    invoke-interface {v3, v1}, Lc/a/a/a/l2/k;->s(I)I

    move-result v1

    if-ne v1, v4, :cond_3

    return v2

    .line 4
    :cond_3
    iget-boolean v3, p0, Lcom/google/android/exoplayer2/source/hls/i;->r:Z

    iget-object v4, p0, Lcom/google/android/exoplayer2/source/hls/i;->n:Landroid/net/Uri;

    invoke-virtual {p1, v4}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p1, v3

    iput-boolean p1, p0, Lcom/google/android/exoplayer2/source/hls/i;->r:Z

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p2, v3

    if-eqz p1, :cond_4

    .line 5
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/i;->p:Lc/a/a/a/l2/h;

    .line 6
    invoke-interface {p1, v1, p2, p3}, Lc/a/a/a/l2/h;->a(IJ)Z

    move-result p1

    if-eqz p1, :cond_5

    :cond_4
    const/4 v0, 0x1

    :cond_5
    return v0
.end method

.method public p()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/google/android/exoplayer2/source/hls/i;->m:Ljava/io/IOException;

    return-void
.end method

.method public r(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/source/hls/i;->k:Z

    return-void
.end method

.method public s(Lc/a/a/a/l2/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/i;->p:Lc/a/a/a/l2/h;

    return-void
.end method

.method public t(JLc/a/a/a/j2/t0/b;Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lc/a/a/a/j2/t0/b;",
            "Ljava/util/List<",
            "+",
            "Lc/a/a/a/j2/t0/d;",
            ">;)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/i;->m:Ljava/io/IOException;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/i;->p:Lc/a/a/a/l2/h;

    invoke-interface {v0, p1, p2, p3, p4}, Lc/a/a/a/l2/h;->b(JLc/a/a/a/j2/t0/b;Ljava/util/List;)Z

    move-result p1

    return p1
.end method
