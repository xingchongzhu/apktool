.class public final Lc/a/a/a/f2/d0;
.super Ljava/lang/Object;
.source "VorbisUtil.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/f2/d0$a;,
        Lc/a/a/a/f2/d0$c;,
        Lc/a/a/a/f2/d0$d;,
        Lc/a/a/a/f2/d0$b;
    }
.end annotation


# direct methods
.method public static a(I)I
    .locals 1

    const/4 v0, 0x0

    :goto_0
    if-lez p0, :cond_0

    add-int/lit8 v0, v0, 0x1

    ushr-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method private static b(JJ)J
    .locals 2

    long-to-double p0, p0

    long-to-double p2, p2

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 1
    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, p2

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Math;->floor(D)D

    move-result-wide p0

    double-to-long p0, p0

    return-wide p0
.end method

.method private static c(Lc/a/a/a/f2/c0;)Lc/a/a/a/f2/d0$a;
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    const/16 v0, 0x18

    .line 1
    invoke-virtual {p0, v0}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v1

    const v2, 0x564342

    if-ne v1, v2, :cond_a

    const/16 v1, 0x10

    .line 2
    invoke-virtual {p0, v1}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v3

    .line 3
    invoke-virtual {p0, v0}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v4

    .line 4
    new-array v5, v4, [J

    .line 5
    invoke-virtual {p0}, Lc/a/a/a/f2/c0;->c()Z

    move-result v7

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x5

    const/4 v8, 0x1

    if-nez v7, :cond_2

    .line 6
    invoke-virtual {p0}, Lc/a/a/a/f2/c0;->c()Z

    move-result v9

    :goto_0
    if-ge v2, v4, :cond_4

    if-eqz v9, :cond_1

    .line 7
    invoke-virtual {p0}, Lc/a/a/a/f2/c0;->c()Z

    move-result v10

    if-eqz v10, :cond_0

    .line 8
    invoke-virtual {p0, v6}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v10

    add-int/2addr v10, v8

    int-to-long v10, v10

    aput-wide v10, v5, v2

    goto :goto_1

    .line 9
    :cond_0
    aput-wide v0, v5, v2

    goto :goto_1

    .line 10
    :cond_1
    invoke-virtual {p0, v6}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v10

    add-int/2addr v10, v8

    int-to-long v10, v10

    aput-wide v10, v5, v2

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 11
    :cond_2
    invoke-virtual {p0, v6}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v6

    add-int/2addr v6, v8

    const/4 v9, 0x0

    :goto_2
    if-ge v9, v4, :cond_4

    sub-int v10, v4, v9

    .line 12
    invoke-static {v10}, Lc/a/a/a/f2/d0;->a(I)I

    move-result v10

    invoke-virtual {p0, v10}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v10

    const/4 v11, 0x0

    :goto_3
    if-ge v11, v10, :cond_3

    if-ge v9, v4, :cond_3

    int-to-long v12, v6

    .line 13
    aput-wide v12, v5, v9

    add-int/lit8 v9, v9, 0x1

    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_4
    const/4 v2, 0x4

    .line 14
    invoke-virtual {p0, v2}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v6

    const/4 v9, 0x2

    if-gt v6, v9, :cond_9

    if-eq v6, v8, :cond_5

    if-ne v6, v9, :cond_8

    :cond_5
    const/16 v9, 0x20

    .line 15
    invoke-virtual {p0, v9}, Lc/a/a/a/f2/c0;->e(I)V

    .line 16
    invoke-virtual {p0, v9}, Lc/a/a/a/f2/c0;->e(I)V

    .line 17
    invoke-virtual {p0, v2}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v2

    add-int/2addr v2, v8

    .line 18
    invoke-virtual {p0, v8}, Lc/a/a/a/f2/c0;->e(I)V

    if-ne v6, v8, :cond_6

    if-eqz v3, :cond_7

    int-to-long v0, v4

    int-to-long v8, v3

    .line 19
    invoke-static {v0, v1, v8, v9}, Lc/a/a/a/f2/d0;->b(JJ)J

    move-result-wide v0

    goto :goto_4

    :cond_6
    int-to-long v0, v4

    int-to-long v8, v3

    mul-long v0, v0, v8

    :cond_7
    :goto_4
    int-to-long v8, v2

    mul-long v0, v0, v8

    long-to-int v1, v0

    .line 20
    invoke-virtual {p0, v1}, Lc/a/a/a/f2/c0;->e(I)V

    .line 21
    :cond_8
    new-instance p0, Lc/a/a/a/f2/d0$a;

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Lc/a/a/a/f2/d0$a;-><init>(II[JIZ)V

    return-object p0

    .line 22
    :cond_9
    new-instance p0, Lc/a/a/a/g1;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "lookup type greater than 2 not decodable: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p0

    .line 23
    :cond_a
    new-instance v0, Lc/a/a/a/g1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "expected code book to start with [0x56, 0x43, 0x42] at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    invoke-virtual {p0}, Lc/a/a/a/f2/c0;->b()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    goto :goto_6

    :goto_5
    throw v0

    :goto_6
    goto :goto_5
.end method

.method private static d(Lc/a/a/a/f2/c0;)V
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    const/4 v0, 0x6

    .line 1
    invoke-virtual {p0, v0}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_9

    const/16 v5, 0x10

    .line 2
    invoke-virtual {p0, v5}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v6

    const/4 v7, 0x4

    const/16 v8, 0x8

    if-eqz v6, :cond_7

    if-ne v6, v2, :cond_6

    const/4 v5, 0x5

    .line 3
    invoke-virtual {p0, v5}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v5

    const/4 v6, -0x1

    .line 4
    new-array v9, v5, [I

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v5, :cond_1

    .line 5
    invoke-virtual {p0, v7}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v11

    aput v11, v9, v10

    .line 6
    aget v11, v9, v10

    if-le v11, v6, :cond_0

    .line 7
    aget v6, v9, v10

    :cond_0
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 8
    new-array v10, v6, [I

    const/4 v11, 0x0

    :goto_2
    const/4 v12, 0x2

    if-ge v11, v6, :cond_4

    const/4 v13, 0x3

    .line 9
    invoke-virtual {p0, v13}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v13

    add-int/2addr v13, v2

    aput v13, v10, v11

    .line 10
    invoke-virtual {p0, v12}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v12

    if-lez v12, :cond_2

    .line 11
    invoke-virtual {p0, v8}, Lc/a/a/a/f2/c0;->e(I)V

    :cond_2
    const/4 v13, 0x0

    :goto_3
    shl-int v14, v2, v12

    if-ge v13, v14, :cond_3

    .line 12
    invoke-virtual {p0, v8}, Lc/a/a/a/f2/c0;->e(I)V

    add-int/lit8 v13, v13, 0x1

    goto :goto_3

    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 13
    :cond_4
    invoke-virtual {p0, v12}, Lc/a/a/a/f2/c0;->e(I)V

    .line 14
    invoke-virtual {p0, v7}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    :goto_4
    if-ge v7, v5, :cond_8

    .line 15
    aget v12, v9, v7

    .line 16
    aget v12, v10, v12

    add-int/2addr v8, v12

    :goto_5
    if-ge v11, v8, :cond_5

    .line 17
    invoke-virtual {p0, v6}, Lc/a/a/a/f2/c0;->e(I)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_5

    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 18
    :cond_6
    new-instance p0, Lc/a/a/a/g1;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "floor type greater than 1 not decodable: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p0

    .line 19
    :cond_7
    invoke-virtual {p0, v8}, Lc/a/a/a/f2/c0;->e(I)V

    .line 20
    invoke-virtual {p0, v5}, Lc/a/a/a/f2/c0;->e(I)V

    .line 21
    invoke-virtual {p0, v5}, Lc/a/a/a/f2/c0;->e(I)V

    .line 22
    invoke-virtual {p0, v0}, Lc/a/a/a/f2/c0;->e(I)V

    .line 23
    invoke-virtual {p0, v8}, Lc/a/a/a/f2/c0;->e(I)V

    .line 24
    invoke-virtual {p0, v7}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v5

    add-int/2addr v5, v2

    const/4 v6, 0x0

    :goto_6
    if-ge v6, v5, :cond_8

    .line 25
    invoke-virtual {p0, v8}, Lc/a/a/a/f2/c0;->e(I)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_9
    return-void
.end method

.method private static e(ILc/a/a/a/f2/c0;)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    const/4 v0, 0x6

    .line 1
    invoke-virtual {p1, v0}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_6

    const/16 v4, 0x10

    .line 2
    invoke-virtual {p1, v4}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v4

    if-eqz v4, :cond_0

    .line 3
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "mapping type other than 0 not supported: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "VorbisUtil"

    invoke-static {v5, v4}, Lc/a/a/a/m2/t;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    .line 4
    :cond_0
    invoke-virtual {p1}, Lc/a/a/a/f2/c0;->c()Z

    move-result v4

    const/4 v5, 0x4

    if-eqz v4, :cond_1

    .line 5
    invoke-virtual {p1, v5}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v4

    add-int/2addr v4, v1

    goto :goto_1

    :cond_1
    const/4 v4, 0x1

    .line 6
    :goto_1
    invoke-virtual {p1}, Lc/a/a/a/f2/c0;->c()Z

    move-result v6

    const/16 v7, 0x8

    if-eqz v6, :cond_2

    .line 7
    invoke-virtual {p1, v7}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v6

    add-int/2addr v6, v1

    const/4 v8, 0x0

    :goto_2
    if-ge v8, v6, :cond_2

    add-int/lit8 v9, p0, -0x1

    .line 8
    invoke-static {v9}, Lc/a/a/a/f2/d0;->a(I)I

    move-result v10

    invoke-virtual {p1, v10}, Lc/a/a/a/f2/c0;->e(I)V

    .line 9
    invoke-static {v9}, Lc/a/a/a/f2/d0;->a(I)I

    move-result v9

    invoke-virtual {p1, v9}, Lc/a/a/a/f2/c0;->e(I)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_2
    const/4 v6, 0x2

    .line 10
    invoke-virtual {p1, v6}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v6

    if-nez v6, :cond_5

    if-le v4, v1, :cond_3

    const/4 v6, 0x0

    :goto_3
    if-ge v6, p0, :cond_3

    .line 11
    invoke-virtual {p1, v5}, Lc/a/a/a/f2/c0;->e(I)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    :goto_4
    if-ge v5, v4, :cond_4

    .line 12
    invoke-virtual {p1, v7}, Lc/a/a/a/f2/c0;->e(I)V

    .line 13
    invoke-virtual {p1, v7}, Lc/a/a/a/f2/c0;->e(I)V

    .line 14
    invoke-virtual {p1, v7}, Lc/a/a/a/f2/c0;->e(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 15
    :cond_5
    new-instance p0, Lc/a/a/a/g1;

    const-string p1, "to reserved bits must be zero after mapping coupling steps"

    invoke-direct {p0, p1}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    return-void
.end method

.method private static f(Lc/a/a/a/f2/c0;)[Lc/a/a/a/f2/d0$c;
    .locals 8

    const/4 v0, 0x6

    .line 1
    invoke-virtual {p0, v0}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 2
    new-array v1, v0, [Lc/a/a/a/f2/d0$c;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lc/a/a/a/f2/c0;->c()Z

    move-result v3

    const/16 v4, 0x10

    .line 4
    invoke-virtual {p0, v4}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v5

    .line 5
    invoke-virtual {p0, v4}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v4

    const/16 v6, 0x8

    .line 6
    invoke-virtual {p0, v6}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v6

    .line 7
    new-instance v7, Lc/a/a/a/f2/d0$c;

    invoke-direct {v7, v3, v5, v4, v6}, Lc/a/a/a/f2/d0$c;-><init>(ZIII)V

    aput-object v7, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private static g(Lc/a/a/a/f2/c0;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    const/4 v0, 0x6

    .line 1
    invoke-virtual {p0, v0}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_6

    const/16 v5, 0x10

    .line 2
    invoke-virtual {p0, v5}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v5

    const/4 v6, 0x2

    if-gt v5, v6, :cond_5

    const/16 v5, 0x18

    .line 3
    invoke-virtual {p0, v5}, Lc/a/a/a/f2/c0;->e(I)V

    .line 4
    invoke-virtual {p0, v5}, Lc/a/a/a/f2/c0;->e(I)V

    .line 5
    invoke-virtual {p0, v5}, Lc/a/a/a/f2/c0;->e(I)V

    .line 6
    invoke-virtual {p0, v0}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v5

    add-int/2addr v5, v2

    const/16 v6, 0x8

    .line 7
    invoke-virtual {p0, v6}, Lc/a/a/a/f2/c0;->e(I)V

    .line 8
    new-array v7, v5, [I

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v5, :cond_1

    const/4 v9, 0x3

    .line 9
    invoke-virtual {p0, v9}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v9

    .line 10
    invoke-virtual {p0}, Lc/a/a/a/f2/c0;->c()Z

    move-result v10

    if-eqz v10, :cond_0

    const/4 v10, 0x5

    .line 11
    invoke-virtual {p0, v10}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v10

    goto :goto_2

    :cond_0
    const/4 v10, 0x0

    :goto_2
    mul-int/lit8 v10, v10, 0x8

    add-int/2addr v10, v9

    .line 12
    aput v10, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    :goto_3
    if-ge v8, v5, :cond_4

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v6, :cond_3

    .line 13
    aget v10, v7, v8

    shl-int v11, v2, v9

    and-int/2addr v10, v11

    if-eqz v10, :cond_2

    .line 14
    invoke-virtual {p0, v6}, Lc/a/a/a/f2/c0;->e(I)V

    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 15
    :cond_5
    new-instance p0, Lc/a/a/a/g1;

    const-string v0, "residueType greater than 2 is not decodable"

    invoke-direct {p0, v0}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    return-void
.end method

.method public static h(Lc/a/a/a/m2/a0;)Lc/a/a/a/f2/d0$b;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-static {p0, v0, v0}, Lc/a/a/a/f2/d0;->i(Lc/a/a/a/m2/a0;ZZ)Lc/a/a/a/f2/d0$b;

    move-result-object p0

    return-object p0
.end method

.method public static i(Lc/a/a/a/m2/a0;ZZ)Lc/a/a/a/f2/d0$b;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    .line 1
    invoke-static {p1, p0, v0}, Lc/a/a/a/f2/d0;->l(ILc/a/a/a/m2/a0;Z)Z

    .line 2
    :cond_0
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->t()J

    move-result-wide v1

    long-to-int p1, v1

    const/16 v1, 0xb

    .line 3
    invoke-virtual {p0, p1}, Lc/a/a/a/m2/a0;->A(I)Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    .line 5
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->t()J

    move-result-wide v2

    long-to-int v4, v2

    .line 6
    new-array v4, v4, [Ljava/lang/String;

    add-int/lit8 v1, v1, 0x4

    :goto_0
    int-to-long v5, v0

    cmp-long v7, v5, v2

    if-gez v7, :cond_1

    .line 7
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->t()J

    move-result-wide v5

    long-to-int v6, v5

    add-int/lit8 v1, v1, 0x4

    .line 8
    invoke-virtual {p0, v6}, Lc/a/a/a/m2/a0;->A(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v0

    .line 9
    aget-object v5, v4, v0

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v1, v5

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_3

    .line 10
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->D()I

    move-result p0

    and-int/lit8 p0, p0, 0x1

    if-eqz p0, :cond_2

    goto :goto_1

    .line 11
    :cond_2
    new-instance p0, Lc/a/a/a/g1;

    const-string p1, "framing bit expected to be set"

    invoke-direct {p0, p1}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 12
    new-instance p0, Lc/a/a/a/f2/d0$b;

    invoke-direct {p0, p1, v4, v1}, Lc/a/a/a/f2/d0$b;-><init>(Ljava/lang/String;[Ljava/lang/String;I)V

    return-object p0
.end method

.method public static j(Lc/a/a/a/m2/a0;)Lc/a/a/a/f2/d0$d;
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    move-object/from16 v2, p0

    .line 1
    invoke-static {v0, v2, v1}, Lc/a/a/a/f2/d0;->l(ILc/a/a/a/m2/a0;Z)Z

    .line 2
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->u()I

    move-result v3

    .line 3
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->D()I

    move-result v4

    .line 4
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->u()I

    move-result v5

    .line 5
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->q()I

    move-result v6

    const/4 v7, -0x1

    if-gtz v6, :cond_0

    const/4 v6, -0x1

    .line 6
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->q()I

    move-result v8

    if-gtz v8, :cond_1

    const/4 v8, -0x1

    .line 7
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->q()I

    move-result v9

    if-gtz v9, :cond_2

    const/4 v9, -0x1

    .line 8
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->D()I

    move-result v7

    and-int/lit8 v10, v7, 0xf

    int-to-double v10, v10

    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    .line 9
    invoke-static {v12, v13, v10, v11}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v10

    double-to-int v10, v10

    and-int/lit16 v7, v7, 0xf0

    shr-int/lit8 v7, v7, 0x4

    int-to-double v14, v7

    .line 10
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v11

    double-to-int v11, v11

    .line 11
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->D()I

    move-result v7

    and-int/2addr v7, v0

    if-lez v7, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    .line 12
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->f()I

    move-result v2

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v12

    .line 13
    new-instance v1, Lc/a/a/a/f2/d0$d;

    move-object v2, v1

    move v7, v8

    move v8, v9

    move v9, v10

    move v10, v11

    move v11, v0

    invoke-direct/range {v2 .. v12}, Lc/a/a/a/f2/d0$d;-><init>(IIIIIIIIZ[B)V

    return-object v1
.end method

.method public static k(Lc/a/a/a/m2/a0;I)[Lc/a/a/a/f2/d0$c;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    const/4 v0, 0x5

    const/4 v1, 0x0

    .line 1
    invoke-static {v0, p0, v1}, Lc/a/a/a/f2/d0;->l(ILc/a/a/a/m2/a0;Z)Z

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->D()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 3
    new-instance v2, Lc/a/a/a/f2/c0;

    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v3

    invoke-direct {v2, v3}, Lc/a/a/a/f2/c0;-><init>([B)V

    .line 4
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->e()I

    move-result p0

    mul-int/lit8 p0, p0, 0x8

    invoke-virtual {v2, p0}, Lc/a/a/a/f2/c0;->e(I)V

    const/4 p0, 0x0

    :goto_0
    if-ge p0, v0, :cond_0

    .line 5
    invoke-static {v2}, Lc/a/a/a/f2/d0;->c(Lc/a/a/a/f2/c0;)Lc/a/a/a/f2/d0$a;

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x6

    .line 6
    invoke-virtual {v2, p0}, Lc/a/a/a/f2/c0;->d(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    :goto_1
    if-ge v1, p0, :cond_2

    const/16 v0, 0x10

    .line 7
    invoke-virtual {v2, v0}, Lc/a/a/a/f2/c0;->d(I)I

    move-result v0

    if-nez v0, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 8
    :cond_1
    new-instance p0, Lc/a/a/a/g1;

    const-string p1, "placeholder of time domain transforms not zeroed out"

    invoke-direct {p0, p1}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p0

    .line 9
    :cond_2
    invoke-static {v2}, Lc/a/a/a/f2/d0;->d(Lc/a/a/a/f2/c0;)V

    .line 10
    invoke-static {v2}, Lc/a/a/a/f2/d0;->g(Lc/a/a/a/f2/c0;)V

    .line 11
    invoke-static {p1, v2}, Lc/a/a/a/f2/d0;->e(ILc/a/a/a/f2/c0;)V

    .line 12
    invoke-static {v2}, Lc/a/a/a/f2/d0;->f(Lc/a/a/a/f2/c0;)[Lc/a/a/a/f2/d0$c;

    move-result-object p0

    .line 13
    invoke-virtual {v2}, Lc/a/a/a/f2/c0;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    return-object p0

    .line 14
    :cond_3
    new-instance p0, Lc/a/a/a/g1;

    const-string p1, "framing bit after modes not set as expected"

    invoke-direct {p0, p1}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :goto_2
    throw p0

    :goto_3
    goto :goto_2
.end method

.method public static l(ILc/a/a/a/m2/a0;Z)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->a()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x7

    if-ge v0, v2, :cond_1

    if-eqz p2, :cond_0

    return v1

    .line 2
    :cond_0
    new-instance p0, Lc/a/a/a/g1;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "too short header: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->a()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p0

    .line 3
    :cond_1
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->D()I

    move-result v0

    if-eq v0, p0, :cond_3

    if-eqz p2, :cond_2

    return v1

    .line 4
    :cond_2
    new-instance p1, Lc/a/a/a/g1;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "expected header type "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :cond_3
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->D()I

    move-result p0

    const/16 v0, 0x76

    if-ne p0, v0, :cond_5

    .line 6
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->D()I

    move-result p0

    const/16 v0, 0x6f

    if-ne p0, v0, :cond_5

    .line 7
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->D()I

    move-result p0

    const/16 v0, 0x72

    if-ne p0, v0, :cond_5

    .line 8
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->D()I

    move-result p0

    const/16 v0, 0x62

    if-ne p0, v0, :cond_5

    .line 9
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->D()I

    move-result p0

    const/16 v0, 0x69

    if-ne p0, v0, :cond_5

    .line 10
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->D()I

    move-result p0

    const/16 p1, 0x73

    if-eq p0, p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 p0, 0x1

    return p0

    :cond_5
    :goto_0
    if-eqz p2, :cond_6

    return v1

    .line 11
    :cond_6
    new-instance p0, Lc/a/a/a/g1;

    const-string p1, "expected characters \'vorbis\'"

    invoke-direct {p0, p1}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p0
.end method
