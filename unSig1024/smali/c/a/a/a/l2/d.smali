.class public Lc/a/a/a/l2/d;
.super Lc/a/a/a/l2/e;
.source "AdaptiveTrackSelection.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/l2/d$a;,
        Lc/a/a/a/l2/d$b;
    }
.end annotation


# instance fields
.field private final g:Lcom/google/android/exoplayer2/upstream/g;

.field private final h:J

.field private final i:J

.field private final j:J

.field private final k:F

.field private final l:F

.field private final m:Lc/a/b/b/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/b/r<",
            "Lc/a/a/a/l2/d$a;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Lc/a/a/a/m2/g;

.field private o:F

.field private p:I

.field private q:I

.field private r:J

.field private s:Lc/a/a/a/j2/t0/d;


# direct methods
.method protected constructor <init>(Lc/a/a/a/j2/p0;[ILcom/google/android/exoplayer2/upstream/g;JJJFFLjava/util/List;Lc/a/a/a/m2/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/j2/p0;",
            "[I",
            "Lcom/google/android/exoplayer2/upstream/g;",
            "JJJFF",
            "Ljava/util/List<",
            "Lc/a/a/a/l2/d$a;",
            ">;",
            "Lc/a/a/a/m2/g;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/l2/e;-><init>(Lc/a/a/a/j2/p0;[I)V

    .line 2
    iput-object p3, p0, Lc/a/a/a/l2/d;->g:Lcom/google/android/exoplayer2/upstream/g;

    const-wide/16 p1, 0x3e8

    mul-long p4, p4, p1

    .line 3
    iput-wide p4, p0, Lc/a/a/a/l2/d;->h:J

    mul-long p6, p6, p1

    .line 4
    iput-wide p6, p0, Lc/a/a/a/l2/d;->i:J

    mul-long p8, p8, p1

    .line 5
    iput-wide p8, p0, Lc/a/a/a/l2/d;->j:J

    .line 6
    iput p10, p0, Lc/a/a/a/l2/d;->k:F

    .line 7
    iput p11, p0, Lc/a/a/a/l2/d;->l:F

    .line 8
    invoke-static {p12}, Lc/a/b/b/r;->m(Ljava/util/Collection;)Lc/a/b/b/r;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/l2/d;->m:Lc/a/b/b/r;

    .line 9
    iput-object p13, p0, Lc/a/a/a/l2/d;->n:Lc/a/a/a/m2/g;

    const/high16 p1, 0x3f800000    # 1.0f

    .line 10
    iput p1, p0, Lc/a/a/a/l2/d;->o:F

    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lc/a/a/a/l2/d;->q:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    iput-wide p1, p0, Lc/a/a/a/l2/d;->r:J

    return-void
.end method

.method private static A([Lc/a/a/a/l2/h$a;)Lc/a/b/b/r;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lc/a/a/a/l2/h$a;",
            ")",
            "Lc/a/b/b/r<",
            "Lc/a/b/b/r<",
            "Lc/a/a/a/l2/d$a;",
            ">;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 2
    :goto_0
    array-length v3, p0

    const-wide/16 v4, 0x0

    const/4 v6, 0x1

    if-ge v2, v3, :cond_1

    .line 3
    aget-object v3, p0, v2

    if-eqz v3, :cond_0

    aget-object v3, p0, v2

    iget-object v3, v3, Lc/a/a/a/l2/h$a;->b:[I

    array-length v3, v3

    if-le v3, v6, :cond_0

    .line 4
    invoke-static {}, Lc/a/b/b/r;->k()Lc/a/b/b/r$a;

    move-result-object v3

    .line 5
    new-instance v6, Lc/a/a/a/l2/d$a;

    invoke-direct {v6, v4, v5, v4, v5}, Lc/a/a/a/l2/d$a;-><init>(JJ)V

    invoke-virtual {v3, v6}, Lc/a/b/b/r$a;->d(Ljava/lang/Object;)Lc/a/b/b/r$a;

    .line 6
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    .line 7
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 8
    :cond_1
    invoke-static {p0}, Lc/a/a/a/l2/d;->D([Lc/a/a/a/l2/h$a;)[[J

    move-result-object v2

    .line 9
    array-length v3, v2

    new-array v3, v3, [I

    .line 10
    array-length v7, v2

    new-array v7, v7, [J

    const/4 v8, 0x0

    .line 11
    :goto_2
    array-length v9, v2

    if-ge v8, v9, :cond_3

    .line 12
    aget-object v9, v2, v8

    array-length v9, v9

    if-nez v9, :cond_2

    move-wide v10, v4

    goto :goto_3

    :cond_2
    aget-object v9, v2, v8

    aget-wide v10, v9, v1

    :goto_3
    aput-wide v10, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 13
    :cond_3
    invoke-static {v0, v7}, Lc/a/a/a/l2/d;->x(Ljava/util/List;[J)V

    .line 14
    invoke-static {v2}, Lc/a/a/a/l2/d;->E([[J)Lc/a/b/b/r;

    move-result-object v4

    const/4 v5, 0x0

    .line 15
    :goto_4
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    move-result v8

    if-ge v5, v8, :cond_4

    .line 16
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 17
    aget v9, v3, v8

    add-int/2addr v9, v6

    aput v9, v3, v8

    .line 18
    aget-object v10, v2, v8

    aget-wide v9, v10, v9

    aput-wide v9, v7, v8

    .line 19
    invoke-static {v0, v7}, Lc/a/a/a/l2/d;->x(Ljava/util/List;[J)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_4
    const/4 v2, 0x0

    .line 20
    :goto_5
    array-length v3, p0

    if-ge v2, v3, :cond_6

    .line 21
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 22
    aget-wide v3, v7, v2

    const-wide/16 v5, 0x2

    mul-long v3, v3, v5

    aput-wide v3, v7, v2

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    .line 23
    :cond_6
    invoke-static {v0, v7}, Lc/a/a/a/l2/d;->x(Ljava/util/List;[J)V

    .line 24
    invoke-static {}, Lc/a/b/b/r;->k()Lc/a/b/b/r$a;

    move-result-object p0

    .line 25
    :goto_6
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_8

    .line 26
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/a/b/b/r$a;

    if-nez v2, :cond_7

    .line 27
    invoke-static {}, Lc/a/b/b/r;->p()Lc/a/b/b/r;

    move-result-object v2

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lc/a/b/b/r$a;->e()Lc/a/b/b/r;

    move-result-object v2

    :goto_7
    invoke-virtual {p0, v2}, Lc/a/b/b/r$a;->d(Ljava/lang/Object;)Lc/a/b/b/r$a;

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    .line 28
    :cond_8
    invoke-virtual {p0}, Lc/a/b/b/r$a;->e()Lc/a/b/b/r;

    move-result-object p0

    return-object p0
.end method

.method private B()J
    .locals 8

    .line 1
    iget-object v0, p0, Lc/a/a/a/l2/d;->g:Lcom/google/android/exoplayer2/upstream/g;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/upstream/g;->c()J

    move-result-wide v0

    long-to-float v0, v0

    iget v1, p0, Lc/a/a/a/l2/d;->k:F

    mul-float v0, v0, v1

    float-to-long v0, v0

    .line 2
    iget-object v2, p0, Lc/a/a/a/l2/d;->m:Lc/a/b/b/r;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    return-wide v0

    :cond_0
    const/4 v2, 0x1

    const/4 v3, 0x1

    .line 3
    :goto_0
    iget-object v4, p0, Lc/a/a/a/l2/d;->m:Lc/a/b/b/r;

    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    move-result v4

    sub-int/2addr v4, v2

    if-ge v3, v4, :cond_1

    iget-object v4, p0, Lc/a/a/a/l2/d;->m:Lc/a/b/b/r;

    .line 4
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc/a/a/a/l2/d$a;

    iget-wide v4, v4, Lc/a/a/a/l2/d$a;->a:J

    cmp-long v6, v4, v0

    if-gez v6, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 5
    :cond_1
    iget-object v2, p0, Lc/a/a/a/l2/d;->m:Lc/a/b/b/r;

    add-int/lit8 v4, v3, -0x1

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/a/a/a/l2/d$a;

    .line 6
    iget-object v4, p0, Lc/a/a/a/l2/d;->m:Lc/a/b/b/r;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/a/a/a/l2/d$a;

    .line 7
    iget-wide v4, v2, Lc/a/a/a/l2/d$a;->a:J

    sub-long/2addr v0, v4

    long-to-float v0, v0

    iget-wide v6, v3, Lc/a/a/a/l2/d$a;->a:J

    sub-long/2addr v6, v4

    long-to-float v1, v6

    div-float/2addr v0, v1

    .line 8
    iget-wide v1, v2, Lc/a/a/a/l2/d$a;->b:J

    iget-wide v3, v3, Lc/a/a/a/l2/d$a;->b:J

    sub-long/2addr v3, v1

    long-to-float v3, v3

    mul-float v0, v0, v3

    float-to-long v3, v0

    add-long/2addr v1, v3

    return-wide v1
.end method

.method private static D([Lc/a/a/a/l2/h$a;)[[J
    .locals 9

    .line 1
    array-length v0, p0

    new-array v0, v0, [[J

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 2
    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_2

    .line 3
    aget-object v3, p0, v2

    if-nez v3, :cond_0

    new-array v3, v1, [J

    .line 4
    aput-object v3, v0, v2

    goto :goto_2

    .line 5
    :cond_0
    iget-object v4, v3, Lc/a/a/a/l2/h$a;->b:[I

    array-length v4, v4

    new-array v4, v4, [J

    aput-object v4, v0, v2

    const/4 v4, 0x0

    .line 6
    :goto_1
    iget-object v5, v3, Lc/a/a/a/l2/h$a;->b:[I

    array-length v6, v5

    if-ge v4, v6, :cond_1

    .line 7
    aget-object v6, v0, v2

    iget-object v7, v3, Lc/a/a/a/l2/h$a;->a:Lc/a/a/a/j2/p0;

    aget v5, v5, v4

    invoke-virtual {v7, v5}, Lc/a/a/a/j2/p0;->l(I)Lc/a/a/a/u0;

    move-result-object v5

    iget v5, v5, Lc/a/a/a/u0;->h:I

    int-to-long v7, v5

    aput-wide v7, v6, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 8
    :cond_1
    aget-object v3, v0, v2

    invoke-static {v3}, Ljava/util/Arrays;->sort([J)V

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private static E([[J)Lc/a/b/b/r;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([[J)",
            "Lc/a/b/b/r<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 1
    invoke-static {}, Lc/a/b/b/e0;->a()Lc/a/b/b/e0$d;

    move-result-object v1

    invoke-virtual {v1}, Lc/a/b/b/e0$d;->a()Lc/a/b/b/e0$c;

    move-result-object v1

    invoke-virtual {v1}, Lc/a/b/b/e0$c;->c()Lc/a/b/b/y;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 2
    :goto_0
    array-length v4, v0

    if-ge v3, v4, :cond_5

    .line 3
    aget-object v4, v0, v3

    array-length v4, v4

    const/4 v5, 0x1

    if-gt v4, v5, :cond_0

    goto :goto_5

    .line 4
    :cond_0
    aget-object v4, v0, v3

    array-length v4, v4

    new-array v5, v4, [D

    const/4 v6, 0x0

    .line 5
    :goto_1
    aget-object v7, v0, v3

    array-length v7, v7

    const-wide/16 v8, 0x0

    if-ge v6, v7, :cond_2

    .line 6
    aget-object v7, v0, v3

    aget-wide v10, v7, v6

    const-wide/16 v12, -0x1

    cmp-long v7, v10, v12

    if-nez v7, :cond_1

    goto :goto_2

    :cond_1
    aget-object v7, v0, v3

    aget-wide v8, v7, v6

    long-to-double v7, v8

    invoke-static {v7, v8}, Ljava/lang/Math;->log(D)D

    move-result-wide v8

    :goto_2
    aput-wide v8, v5, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, -0x1

    .line 7
    aget-wide v6, v5, v4

    aget-wide v10, v5, v2

    sub-double/2addr v6, v10

    const/4 v10, 0x0

    :goto_3
    if-ge v10, v4, :cond_4

    const-wide/high16 v11, 0x3fe0000000000000L    # 0.5

    .line 8
    aget-wide v13, v5, v10

    add-int/lit8 v10, v10, 0x1

    aget-wide v15, v5, v10

    add-double/2addr v13, v15

    mul-double v13, v13, v11

    cmpl-double v11, v6, v8

    if-nez v11, :cond_3

    const-wide/high16 v11, 0x3ff0000000000000L    # 1.0

    goto :goto_4

    .line 9
    :cond_3
    aget-wide v11, v5, v2

    sub-double/2addr v13, v11

    div-double v11, v13, v6

    .line 10
    :goto_4
    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v1, v11, v12}, Lc/a/b/b/c0;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 11
    :cond_5
    invoke-interface {v1}, Lc/a/b/b/c0;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lc/a/b/b/r;->m(Ljava/util/Collection;)Lc/a/b/b/r;

    move-result-object v0

    return-object v0
.end method

.method private F(J)J
    .locals 3

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-eqz v2, :cond_0

    .line 1
    iget-wide v0, p0, Lc/a/a/a/l2/d;->h:J

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    long-to-float p1, p1

    .line 2
    iget p2, p0, Lc/a/a/a/l2/d;->l:F

    mul-float p1, p1, p2

    float-to-long p1, p1

    goto :goto_1

    .line 3
    :cond_1
    iget-wide p1, p0, Lc/a/a/a/l2/d;->h:J

    :goto_1
    return-wide p1
.end method

.method static synthetic w([Lc/a/a/a/l2/h$a;)Lc/a/b/b/r;
    .locals 0

    .line 1
    invoke-static {p0}, Lc/a/a/a/l2/d;->A([Lc/a/a/a/l2/h$a;)Lc/a/b/b/r;

    move-result-object p0

    return-object p0
.end method

.method private static x(Ljava/util/List;[J)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/a/b/b/r$a<",
            "Lc/a/a/a/l2/d$a;",
            ">;>;[J)V"
        }
    .end annotation

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    .line 1
    :goto_0
    array-length v4, p1

    if-ge v3, v4, :cond_0

    .line 2
    aget-wide v4, p1, v3

    add-long/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 3
    :cond_0
    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_2

    .line 4
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/a/b/b/r$a;

    if-nez v3, :cond_1

    goto :goto_2

    .line 5
    :cond_1
    new-instance v4, Lc/a/a/a/l2/d$a;

    aget-wide v5, p1, v0

    invoke-direct {v4, v1, v2, v5, v6}, Lc/a/a/a/l2/d$a;-><init>(JJ)V

    invoke-virtual {v3, v4}, Lc/a/b/b/r$a;->d(Ljava/lang/Object;)Lc/a/b/b/r$a;

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method private z(J)I
    .locals 9

    .line 1
    invoke-direct {p0}, Lc/a/a/a/l2/d;->B()J

    move-result-wide v6

    const/4 v0, 0x0

    const/4 v8, 0x0

    .line 2
    :goto_0
    iget v1, p0, Lc/a/a/a/l2/e;->b:I

    if-ge v8, v1, :cond_3

    const-wide/high16 v1, -0x8000000000000000L

    cmp-long v3, p1, v1

    if-eqz v3, :cond_0

    .line 3
    invoke-virtual {p0, v8, p1, p2}, Lc/a/a/a/l2/e;->u(IJ)Z

    move-result v1

    if-nez v1, :cond_2

    .line 4
    :cond_0
    invoke-virtual {p0, v8}, Lc/a/a/a/l2/e;->e(I)Lc/a/a/a/u0;

    move-result-object v1

    .line 5
    iget v2, v1, Lc/a/a/a/u0;->h:I

    iget v3, p0, Lc/a/a/a/l2/d;->o:F

    move-object v0, p0

    move-wide v4, v6

    invoke-virtual/range {v0 .. v5}, Lc/a/a/a/l2/d;->y(Lc/a/a/a/u0;IFJ)Z

    move-result v0

    if-eqz v0, :cond_1

    return v8

    :cond_1
    move v0, v8

    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_3
    return v0
.end method


# virtual methods
.method protected C()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/l2/d;->j:J

    return-wide v0
.end method

.method protected G(JLjava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "+",
            "Lc/a/a/a/j2/t0/d;",
            ">;)Z"
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lc/a/a/a/l2/d;->r:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    sub-long/2addr p1, v0

    const-wide/16 v0, 0x3e8

    cmp-long v2, p1, v0

    if-gez v2, :cond_1

    .line 2
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {p3}, Lc/a/b/b/w;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/j2/t0/d;

    iget-object p2, p0, Lc/a/a/a/l2/d;->s:Lc/a/a/a/j2/t0/d;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lc/a/a/a/l2/d;->s:Lc/a/a/a/j2/t0/d;

    return-void
.end method

.method public f()V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 1
    iput-wide v0, p0, Lc/a/a/a/l2/d;->r:J

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lc/a/a/a/l2/d;->s:Lc/a/a/a/j2/t0/d;

    return-void
.end method

.method public h(JLjava/util/List;)I
    .locals 10
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
    iget-object v0, p0, Lc/a/a/a/l2/d;->n:Lc/a/a/a/m2/g;

    invoke-interface {v0}, Lc/a/a/a/m2/g;->c()J

    move-result-wide v0

    .line 2
    invoke-virtual {p0, v0, v1, p3}, Lc/a/a/a/l2/d;->G(JLjava/util/List;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 3
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    return p1

    .line 4
    :cond_0
    iput-wide v0, p0, Lc/a/a/a/l2/d;->r:J

    .line 5
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    invoke-static {p3}, Lc/a/b/b/w;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/a/a/a/j2/t0/d;

    :goto_0
    iput-object v2, p0, Lc/a/a/a/l2/d;->s:Lc/a/a/a/j2/t0/d;

    .line 6
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    return v3

    .line 7
    :cond_2
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v4, v2, -0x1

    .line 8
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc/a/a/a/j2/t0/d;

    .line 9
    iget-wide v4, v4, Lc/a/a/a/j2/t0/b;->g:J

    sub-long/2addr v4, p1

    iget v6, p0, Lc/a/a/a/l2/d;->o:F

    .line 10
    invoke-static {v4, v5, v6}, Lc/a/a/a/m2/m0;->Y(JF)J

    move-result-wide v4

    .line 11
    invoke-virtual {p0}, Lc/a/a/a/l2/d;->C()J

    move-result-wide v6

    cmp-long v8, v4, v6

    if-gez v8, :cond_3

    return v2

    .line 12
    :cond_3
    invoke-direct {p0, v0, v1}, Lc/a/a/a/l2/d;->z(J)I

    move-result v0

    .line 13
    invoke-virtual {p0, v0}, Lc/a/a/a/l2/e;->e(I)Lc/a/a/a/u0;

    move-result-object v0

    :goto_1
    if-ge v3, v2, :cond_5

    .line 14
    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/j2/t0/d;

    .line 15
    iget-object v4, v1, Lc/a/a/a/j2/t0/b;->d:Lc/a/a/a/u0;

    .line 16
    iget-wide v8, v1, Lc/a/a/a/j2/t0/b;->g:J

    sub-long/2addr v8, p1

    .line 17
    iget v1, p0, Lc/a/a/a/l2/d;->o:F

    .line 18
    invoke-static {v8, v9, v1}, Lc/a/a/a/m2/m0;->Y(JF)J

    move-result-wide v8

    cmp-long v1, v8, v6

    if-ltz v1, :cond_4

    .line 19
    iget v1, v4, Lc/a/a/a/u0;->h:I

    iget v5, v0, Lc/a/a/a/u0;->h:I

    if-ge v1, v5, :cond_4

    iget v1, v4, Lc/a/a/a/u0;->r:I

    const/4 v5, -0x1

    if-eq v1, v5, :cond_4

    const/16 v8, 0x2d0

    if-ge v1, v8, :cond_4

    iget v4, v4, Lc/a/a/a/u0;->q:I

    if-eq v4, v5, :cond_4

    const/16 v5, 0x500

    if-ge v4, v5, :cond_4

    iget v4, v0, Lc/a/a/a/u0;->r:I

    if-ge v1, v4, :cond_4

    return v3

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    return v2
.end method

.method public i(JJJLjava/util/List;[Lc/a/a/a/j2/t0/e;)V
    .locals 3
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
    iget-object p1, p0, Lc/a/a/a/l2/d;->n:Lc/a/a/a/m2/g;

    invoke-interface {p1}, Lc/a/a/a/m2/g;->c()J

    move-result-wide p1

    .line 2
    iget p8, p0, Lc/a/a/a/l2/d;->q:I

    if-nez p8, :cond_0

    const/4 p3, 0x1

    .line 3
    iput p3, p0, Lc/a/a/a/l2/d;->q:I

    .line 4
    invoke-direct {p0, p1, p2}, Lc/a/a/a/l2/d;->z(J)I

    move-result p1

    iput p1, p0, Lc/a/a/a/l2/d;->p:I

    return-void

    .line 5
    :cond_0
    iget v0, p0, Lc/a/a/a/l2/d;->p:I

    .line 6
    invoke-interface {p7}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, -0x1

    if-eqz v1, :cond_1

    const/4 v1, -0x1

    goto :goto_0

    :cond_1
    invoke-static {p7}, Lc/a/b/b/w;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/j2/t0/d;

    iget-object v1, v1, Lc/a/a/a/j2/t0/b;->d:Lc/a/a/a/u0;

    invoke-virtual {p0, v1}, Lc/a/a/a/l2/e;->t(Lc/a/a/a/u0;)I

    move-result v1

    :goto_0
    if-eq v1, v2, :cond_2

    .line 7
    invoke-static {p7}, Lc/a/b/b/w;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p7

    check-cast p7, Lc/a/a/a/j2/t0/d;

    iget p8, p7, Lc/a/a/a/j2/t0/b;->e:I

    move v0, v1

    .line 8
    :cond_2
    invoke-direct {p0, p1, p2}, Lc/a/a/a/l2/d;->z(J)I

    move-result p7

    .line 9
    invoke-virtual {p0, v0, p1, p2}, Lc/a/a/a/l2/e;->u(IJ)Z

    move-result p1

    if-nez p1, :cond_4

    .line 10
    invoke-virtual {p0, v0}, Lc/a/a/a/l2/e;->e(I)Lc/a/a/a/u0;

    move-result-object p1

    .line 11
    invoke-virtual {p0, p7}, Lc/a/a/a/l2/e;->e(I)Lc/a/a/a/u0;

    move-result-object p2

    .line 12
    iget v1, p2, Lc/a/a/a/u0;->h:I

    iget v2, p1, Lc/a/a/a/u0;->h:I

    if-le v1, v2, :cond_3

    .line 13
    invoke-direct {p0, p5, p6}, Lc/a/a/a/l2/d;->F(J)J

    move-result-wide p5

    cmp-long v1, p3, p5

    if-gez v1, :cond_3

    goto :goto_1

    .line 14
    :cond_3
    iget p2, p2, Lc/a/a/a/u0;->h:I

    iget p1, p1, Lc/a/a/a/u0;->h:I

    if-ge p2, p1, :cond_4

    iget-wide p1, p0, Lc/a/a/a/l2/d;->i:J

    cmp-long p5, p3, p1

    if-ltz p5, :cond_4

    :goto_1
    move p7, v0

    :cond_4
    if-ne p7, v0, :cond_5

    goto :goto_2

    :cond_5
    const/4 p8, 0x3

    .line 15
    :goto_2
    iput p8, p0, Lc/a/a/a/l2/d;->q:I

    .line 16
    iput p7, p0, Lc/a/a/a/l2/d;->p:I

    return-void
.end method

.method public m()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/l2/d;->q:I

    return v0
.end method

.method public n()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/l2/d;->p:I

    return v0
.end method

.method public o(F)V
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/l2/d;->o:F

    return-void
.end method

.method public p()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected y(Lc/a/a/a/u0;IFJ)Z
    .locals 0

    int-to-float p1, p2

    mul-float p1, p1, p3

    .line 1
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    int-to-long p1, p1

    cmp-long p3, p1, p4

    if-gtz p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
