.class public final Lc/a/a/a/h2/m/h;
.super Lc/a/a/a/h2/h;
.source "Id3Decoder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/h2/m/h$b;,
        Lc/a/a/a/h2/m/h$a;
    }
.end annotation


# static fields
.field public static final a:Lc/a/a/a/h2/m/h$a;


# instance fields
.field private final b:Lc/a/a/a/h2/m/h$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lc/a/a/a/h2/m/a;->a:Lc/a/a/a/h2/m/a;

    sput-object v0, Lc/a/a/a/h2/m/h;->a:Lc/a/a/a/h2/m/h$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lc/a/a/a/h2/m/h;-><init>(Lc/a/a/a/h2/m/h$a;)V

    return-void
.end method

.method public constructor <init>(Lc/a/a/a/h2/m/h$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lc/a/a/a/h2/h;-><init>()V

    .line 3
    iput-object p1, p0, Lc/a/a/a/h2/m/h;->b:Lc/a/a/a/h2/m/h$a;

    return-void
.end method

.method private static A(Lc/a/a/a/m2/a0;IIZ)Z
    .locals 18

    move-object/from16 v1, p0

    move/from16 v0, p1

    .line 1
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->e()I

    move-result v2

    .line 2
    :goto_0
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->a()I

    move-result v3

    const/4 v4, 0x1

    move/from16 v5, p2

    if-lt v3, v5, :cond_c

    const/4 v3, 0x3

    const/4 v6, 0x0

    if-lt v0, v3, :cond_0

    .line 3
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->n()I

    move-result v7

    .line 4
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->F()J

    move-result-wide v8

    .line 5
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->J()I

    move-result v10

    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->G()I

    move-result v7

    .line 7
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->G()I

    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long v8, v8

    const/4 v10, 0x0

    :goto_1
    const-wide/16 v11, 0x0

    if-nez v7, :cond_1

    cmp-long v7, v8, v11

    if-nez v7, :cond_1

    if-nez v10, :cond_1

    .line 8
    invoke-virtual {v1, v2}, Lc/a/a/a/m2/a0;->P(I)V

    return v4

    :cond_1
    const/4 v7, 0x4

    if-ne v0, v7, :cond_3

    if-nez p3, :cond_3

    const-wide/32 v13, 0x808080

    and-long/2addr v13, v8

    cmp-long v15, v13, v11

    if-eqz v15, :cond_2

    invoke-virtual {v1, v2}, Lc/a/a/a/m2/a0;->P(I)V

    return v6

    :cond_2
    const-wide/16 v11, 0xff

    and-long v13, v8, v11

    const/16 v15, 0x8

    shr-long v15, v8, v15

    and-long/2addr v15, v11

    const/16 v17, 0x7

    shl-long v15, v15, v17

    or-long/2addr v13, v15

    const/16 v15, 0x10

    shr-long v15, v8, v15

    and-long/2addr v15, v11

    const/16 v17, 0xe

    shl-long v15, v15, v17

    or-long/2addr v13, v15

    const/16 v15, 0x18

    shr-long/2addr v8, v15

    and-long/2addr v8, v11

    const/16 v11, 0x15

    shl-long/2addr v8, v11

    or-long/2addr v8, v13

    :cond_3
    if-ne v0, v7, :cond_6

    and-int/lit8 v3, v10, 0x40

    if-eqz v3, :cond_4

    const/4 v3, 0x1

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    :goto_2
    and-int/lit8 v7, v10, 0x1

    if-eqz v7, :cond_5

    goto :goto_5

    :cond_5
    :goto_3
    const/4 v4, 0x0

    goto :goto_5

    :cond_6
    if-ne v0, v3, :cond_8

    and-int/lit8 v3, v10, 0x20

    if-eqz v3, :cond_7

    const/4 v3, 0x1

    goto :goto_4

    :cond_7
    const/4 v3, 0x0

    :goto_4
    and-int/lit16 v7, v10, 0x80

    if-eqz v7, :cond_5

    goto :goto_5

    :cond_8
    const/4 v3, 0x0

    goto :goto_3

    :goto_5
    if-eqz v4, :cond_9

    add-int/lit8 v3, v3, 0x4

    :cond_9
    int-to-long v3, v3

    cmp-long v7, v8, v3

    if-gez v7, :cond_a

    invoke-virtual {v1, v2}, Lc/a/a/a/m2/a0;->P(I)V

    return v6

    .line 9
    :cond_a
    :try_start_1
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->a()I

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    int-to-long v3, v3

    cmp-long v7, v3, v8

    if-gez v7, :cond_b

    .line 10
    invoke-virtual {v1, v2}, Lc/a/a/a/m2/a0;->P(I)V

    return v6

    :cond_b
    long-to-int v3, v8

    .line 11
    :try_start_2
    invoke-virtual {v1, v3}, Lc/a/a/a/m2/a0;->Q(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0

    .line 12
    :cond_c
    invoke-virtual {v1, v2}, Lc/a/a/a/m2/a0;->P(I)V

    return v4

    :catchall_0
    move-exception v0

    invoke-virtual {v1, v2}, Lc/a/a/a/m2/a0;->P(I)V

    .line 13
    goto :goto_7

    :goto_6
    throw v0

    :goto_7
    goto :goto_6
.end method

.method private static c([BII)[B
    .locals 0

    if-gt p2, p1, :cond_0

    .line 1
    sget-object p0, Lc/a/a/a/m2/m0;->f:[B

    return-object p0

    .line 2
    :cond_0
    invoke-static {p0, p1, p2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p0

    return-object p0
.end method

.method private static e(Lc/a/a/a/m2/a0;II)Lc/a/a/a/h2/m/b;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->D()I

    move-result v0

    .line 2
    invoke-static {v0}, Lc/a/a/a/h2/m/h;->u(I)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 p1, p1, -0x1

    .line 3
    new-array v2, p1, [B

    const/4 v3, 0x0

    .line 4
    invoke-virtual {p0, v2, v3, p1}, Lc/a/a/a/m2/a0;->j([BII)V

    const-string p0, "image/"

    const-string v4, "ISO-8859-1"

    const/4 v5, 0x2

    if-ne p2, v5, :cond_1

    .line 5
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance p0, Ljava/lang/String;

    const/4 v6, 0x3

    invoke-direct {p0, v2, v3, v6, v4}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-static {p0}, Lc/a/a/a/m2/m0;->J0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p2, "image/jpg"

    .line 6
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p0, "image/jpeg"

    :cond_0
    const/4 p2, 0x2

    goto :goto_0

    .line 7
    :cond_1
    invoke-static {v2, v3}, Lc/a/a/a/h2/m/h;->x([BI)I

    move-result p2

    .line 8
    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v2, v3, p2, v4}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-static {v6}, Lc/a/a/a/m2/m0;->J0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x2f

    .line 9
    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    const/4 v6, -0x1

    if-ne v4, v6, :cond_2

    .line 10
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_2
    move-object p0, v3

    :goto_0
    add-int/lit8 v3, p2, 0x1

    .line 11
    aget-byte v3, v2, v3

    and-int/lit16 v3, v3, 0xff

    add-int/2addr p2, v5

    .line 12
    invoke-static {v2, p2, v0}, Lc/a/a/a/h2/m/h;->w([BII)I

    move-result v4

    .line 13
    new-instance v5, Ljava/lang/String;

    sub-int v6, v4, p2

    invoke-direct {v5, v2, p2, v6, v1}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 14
    invoke-static {v0}, Lc/a/a/a/h2/m/h;->t(I)I

    move-result p2

    add-int/2addr v4, p2

    .line 15
    invoke-static {v2, v4, p1}, Lc/a/a/a/h2/m/h;->c([BII)[B

    move-result-object p1

    .line 16
    new-instance p2, Lc/a/a/a/h2/m/b;

    invoke-direct {p2, p0, v5, v3, p1}, Lc/a/a/a/h2/m/b;-><init>(Ljava/lang/String;Ljava/lang/String;I[B)V

    return-object p2
.end method

.method private static f(Lc/a/a/a/m2/a0;ILjava/lang/String;)Lc/a/a/a/h2/m/c;
    .locals 2

    .line 1
    new-array v0, p1, [B

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, v1, p1}, Lc/a/a/a/m2/a0;->j([BII)V

    .line 3
    new-instance p0, Lc/a/a/a/h2/m/c;

    invoke-direct {p0, p2, v0}, Lc/a/a/a/h2/m/c;-><init>(Ljava/lang/String;[B)V

    return-object p0
.end method

.method private static g(Lc/a/a/a/m2/a0;IIZILc/a/a/a/h2/m/h$a;)Lc/a/a/a/h2/m/d;
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    move-object v0, p0

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->e()I

    move-result v1

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v2

    invoke-static {v2, v1}, Lc/a/a/a/h2/m/h;->x([BI)I

    move-result v2

    .line 3
    new-instance v4, Ljava/lang/String;

    .line 4
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v3

    sub-int v5, v2, v1

    const-string v6, "ISO-8859-1"

    invoke-direct {v4, v3, v1, v5, v6}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    .line 5
    invoke-virtual {p0, v2}, Lc/a/a/a/m2/a0;->P(I)V

    .line 6
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->n()I

    move-result v5

    .line 7
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->n()I

    move-result v6

    .line 8
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->F()J

    move-result-wide v2

    const-wide/16 v7, -0x1

    const-wide v9, 0xffffffffL

    cmp-long v11, v2, v9

    if-nez v11, :cond_0

    move-wide v11, v7

    goto :goto_0

    :cond_0
    move-wide v11, v2

    .line 9
    :goto_0
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->F()J

    move-result-wide v2

    cmp-long v13, v2, v9

    if-nez v13, :cond_1

    move-wide v9, v7

    goto :goto_1

    :cond_1
    move-wide v9, v2

    .line 10
    :goto_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    add-int v1, v1, p1

    .line 11
    :cond_2
    :goto_2
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->e()I

    move-result v3

    if-ge v3, v1, :cond_3

    move/from16 v3, p2

    move/from16 v7, p3

    move/from16 v8, p4

    move-object/from16 v13, p5

    .line 12
    invoke-static {v3, p0, v7, v8, v13}, Lc/a/a/a/h2/m/h;->j(ILc/a/a/a/m2/a0;ZILc/a/a/a/h2/m/h$a;)Lc/a/a/a/h2/m/i;

    move-result-object v14

    if-eqz v14, :cond_2

    .line 13
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    new-array v0, v0, [Lc/a/a/a/h2/m/i;

    .line 14
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc/a/a/a/h2/m/i;

    .line 15
    new-instance v1, Lc/a/a/a/h2/m/d;

    move-object v3, v1

    move-wide v7, v11

    move-object v11, v0

    invoke-direct/range {v3 .. v11}, Lc/a/a/a/h2/m/d;-><init>(Ljava/lang/String;IIJJ[Lc/a/a/a/h2/m/i;)V

    return-object v1
.end method

.method private static h(Lc/a/a/a/m2/a0;IIZILc/a/a/a/h2/m/h$a;)Lc/a/a/a/h2/m/e;
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    move-object/from16 v0, p0

    .line 1
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->e()I

    move-result v1

    .line 2
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v2

    invoke-static {v2, v1}, Lc/a/a/a/h2/m/h;->x([BI)I

    move-result v2

    .line 3
    new-instance v3, Ljava/lang/String;

    .line 4
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v4

    sub-int v5, v2, v1

    const-string v6, "ISO-8859-1"

    invoke-direct {v3, v4, v1, v5, v6}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    const/4 v4, 0x1

    add-int/2addr v2, v4

    .line 5
    invoke-virtual {v0, v2}, Lc/a/a/a/m2/a0;->P(I)V

    .line 6
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->D()I

    move-result v2

    and-int/lit8 v5, v2, 0x2

    const/4 v7, 0x0

    if-eqz v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    and-int/2addr v2, v4

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 7
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->D()I

    move-result v8

    .line 8
    new-array v9, v8, [Ljava/lang/String;

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v8, :cond_2

    .line 9
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->e()I

    move-result v11

    .line 10
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v12

    invoke-static {v12, v11}, Lc/a/a/a/h2/m/h;->x([BI)I

    move-result v12

    .line 11
    new-instance v13, Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v14

    sub-int v15, v12, v11

    invoke-direct {v13, v14, v11, v15, v6}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    aput-object v13, v9, v10

    add-int/2addr v12, v4

    .line 12
    invoke-virtual {v0, v12}, Lc/a/a/a/m2/a0;->P(I)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 13
    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    add-int v1, v1, p1

    .line 14
    :cond_3
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/m2/a0;->e()I

    move-result v6

    if-ge v6, v1, :cond_4

    move/from16 v6, p2

    move/from16 v8, p3

    move/from16 v10, p4

    move-object/from16 v11, p5

    .line 15
    invoke-static {v6, v0, v8, v10, v11}, Lc/a/a/a/h2/m/h;->j(ILc/a/a/a/m2/a0;ZILc/a/a/a/h2/m/h$a;)Lc/a/a/a/h2/m/i;

    move-result-object v12

    if-eqz v12, :cond_3

    .line 16
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    new-array v0, v7, [Lc/a/a/a/h2/m/i;

    .line 17
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc/a/a/a/h2/m/i;

    .line 18
    new-instance v1, Lc/a/a/a/h2/m/e;

    move-object/from16 p0, v1

    move-object/from16 p1, v3

    move/from16 p2, v5

    move/from16 p3, v2

    move-object/from16 p4, v9

    move-object/from16 p5, v0

    invoke-direct/range {p0 .. p5}, Lc/a/a/a/h2/m/e;-><init>(Ljava/lang/String;ZZ[Ljava/lang/String;[Lc/a/a/a/h2/m/i;)V

    return-object v1
.end method

.method private static i(Lc/a/a/a/m2/a0;I)Lc/a/a/a/h2/m/f;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    const/4 v0, 0x4

    if-ge p1, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 1
    :cond_0
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->D()I

    move-result v1

    .line 2
    invoke-static {v1}, Lc/a/a/a/h2/m/h;->u(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    new-array v4, v3, [B

    const/4 v5, 0x0

    .line 3
    invoke-virtual {p0, v4, v5, v3}, Lc/a/a/a/m2/a0;->j([BII)V

    .line 4
    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v4, v5, v3}, Ljava/lang/String;-><init>([BII)V

    sub-int/2addr p1, v0

    .line 5
    new-array v0, p1, [B

    .line 6
    invoke-virtual {p0, v0, v5, p1}, Lc/a/a/a/m2/a0;->j([BII)V

    .line 7
    invoke-static {v0, v5, v1}, Lc/a/a/a/h2/m/h;->w([BII)I

    move-result p0

    .line 8
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0, v5, p0, v2}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 9
    invoke-static {v1}, Lc/a/a/a/h2/m/h;->t(I)I

    move-result v3

    add-int/2addr p0, v3

    .line 10
    invoke-static {v0, p0, v1}, Lc/a/a/a/h2/m/h;->w([BII)I

    move-result v1

    .line 11
    invoke-static {v0, p0, v1, v2}, Lc/a/a/a/h2/m/h;->o([BIILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 12
    new-instance v0, Lc/a/a/a/h2/m/f;

    invoke-direct {v0, v6, p1, p0}, Lc/a/a/a/h2/m/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private static j(ILc/a/a/a/m2/a0;ZILc/a/a/a/h2/m/h$a;)Lc/a/a/a/h2/m/i;
    .locals 19

    move/from16 v0, p0

    move-object/from16 v7, p1

    .line 1
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/m2/a0;->D()I

    move-result v8

    .line 2
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/m2/a0;->D()I

    move-result v9

    .line 3
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/m2/a0;->D()I

    move-result v10

    const/4 v11, 0x3

    if-lt v0, v11, :cond_0

    .line 4
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/m2/a0;->D()I

    move-result v1

    move v13, v1

    goto :goto_0

    :cond_0
    const/4 v13, 0x0

    :goto_0
    const/4 v14, 0x4

    if-ne v0, v14, :cond_2

    .line 5
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/m2/a0;->H()I

    move-result v1

    if-nez p2, :cond_1

    and-int/lit16 v2, v1, 0xff

    shr-int/lit8 v3, v1, 0x8

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x7

    or-int/2addr v2, v3

    shr-int/lit8 v3, v1, 0x10

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0xe

    or-int/2addr v2, v3

    shr-int/lit8 v1, v1, 0x18

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x15

    or-int/2addr v1, v2

    :cond_1
    :goto_1
    move v15, v1

    goto :goto_2

    :cond_2
    if-ne v0, v11, :cond_3

    .line 6
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/m2/a0;->H()I

    move-result v1

    goto :goto_1

    .line 7
    :cond_3
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/m2/a0;->G()I

    move-result v1

    goto :goto_1

    :goto_2
    if-lt v0, v11, :cond_4

    .line 8
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/m2/a0;->J()I

    move-result v1

    move v6, v1

    goto :goto_3

    :cond_4
    const/4 v6, 0x0

    :goto_3
    const/16 v16, 0x0

    if-nez v8, :cond_5

    if-nez v9, :cond_5

    if-nez v10, :cond_5

    if-nez v13, :cond_5

    if-nez v15, :cond_5

    if-nez v6, :cond_5

    .line 9
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/m2/a0;->f()I

    move-result v0

    invoke-virtual {v7, v0}, Lc/a/a/a/m2/a0;->P(I)V

    return-object v16

    .line 10
    :cond_5
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/m2/a0;->e()I

    move-result v1

    add-int v5, v1, v15

    .line 11
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/m2/a0;->f()I

    move-result v1

    const-string v4, "Id3Decoder"

    if-le v5, v1, :cond_6

    const-string v0, "Frame size exceeds remaining tag data"

    .line 12
    invoke-static {v4, v0}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/m2/a0;->f()I

    move-result v0

    invoke-virtual {v7, v0}, Lc/a/a/a/m2/a0;->P(I)V

    return-object v16

    :cond_6
    if-eqz p4, :cond_7

    move-object/from16 v1, p4

    move/from16 v2, p0

    move v3, v8

    move-object v12, v4

    move v4, v9

    move v14, v5

    move v5, v10

    move/from16 v18, v6

    move v6, v13

    .line 14
    invoke-interface/range {v1 .. v6}, Lc/a/a/a/h2/m/h$a;->a(IIIII)Z

    move-result v1

    if-nez v1, :cond_8

    .line 15
    invoke-virtual {v7, v14}, Lc/a/a/a/m2/a0;->P(I)V

    return-object v16

    :cond_7
    move-object v12, v4

    move v14, v5

    move/from16 v18, v6

    :cond_8
    const/4 v1, 0x1

    if-ne v0, v11, :cond_c

    move/from16 v2, v18

    and-int/lit16 v3, v2, 0x80

    if-eqz v3, :cond_9

    const/4 v3, 0x1

    goto :goto_4

    :cond_9
    const/4 v3, 0x0

    :goto_4
    and-int/lit8 v4, v2, 0x40

    if-eqz v4, :cond_a

    const/4 v4, 0x1

    goto :goto_5

    :cond_a
    const/4 v4, 0x0

    :goto_5
    and-int/lit8 v2, v2, 0x20

    if-eqz v2, :cond_b

    const/4 v2, 0x1

    goto :goto_6

    :cond_b
    const/4 v2, 0x0

    :goto_6
    move/from16 v17, v3

    const/4 v6, 0x0

    goto :goto_c

    :cond_c
    move/from16 v2, v18

    const/4 v3, 0x4

    if-ne v0, v3, :cond_12

    and-int/lit8 v3, v2, 0x40

    if-eqz v3, :cond_d

    const/4 v3, 0x1

    goto :goto_7

    :cond_d
    const/4 v3, 0x0

    :goto_7
    and-int/lit8 v4, v2, 0x8

    if-eqz v4, :cond_e

    const/4 v4, 0x1

    goto :goto_8

    :cond_e
    const/4 v4, 0x0

    :goto_8
    and-int/lit8 v5, v2, 0x4

    if-eqz v5, :cond_f

    const/4 v5, 0x1

    goto :goto_9

    :cond_f
    const/4 v5, 0x0

    :goto_9
    and-int/lit8 v6, v2, 0x2

    if-eqz v6, :cond_10

    const/4 v6, 0x1

    goto :goto_a

    :cond_10
    const/4 v6, 0x0

    :goto_a
    and-int/2addr v2, v1

    if-eqz v2, :cond_11

    const/16 v17, 0x1

    goto :goto_b

    :cond_11
    const/16 v17, 0x0

    :goto_b
    move v2, v3

    move/from16 v3, v17

    move/from16 v17, v4

    move v4, v5

    goto :goto_c

    :cond_12
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/16 v17, 0x0

    :goto_c
    if-nez v17, :cond_28

    if-eqz v4, :cond_13

    goto/16 :goto_10

    :cond_13
    if-eqz v2, :cond_14

    add-int/lit8 v15, v15, -0x1

    .line 16
    invoke-virtual {v7, v1}, Lc/a/a/a/m2/a0;->Q(I)V

    :cond_14
    if-eqz v3, :cond_15

    add-int/lit8 v15, v15, -0x4

    const/4 v1, 0x4

    .line 17
    invoke-virtual {v7, v1}, Lc/a/a/a/m2/a0;->Q(I)V

    :cond_15
    if-eqz v6, :cond_16

    .line 18
    invoke-static {v7, v15}, Lc/a/a/a/h2/m/h;->z(Lc/a/a/a/m2/a0;I)I

    move-result v15

    :cond_16
    const/16 v1, 0x54

    const/4 v2, 0x2

    const/16 v3, 0x58

    if-ne v8, v1, :cond_18

    if-ne v9, v3, :cond_18

    if-ne v10, v3, :cond_18

    if-eq v0, v2, :cond_17

    if-ne v13, v3, :cond_18

    .line 19
    :cond_17
    :try_start_0
    invoke-static {v7, v15}, Lc/a/a/a/h2/m/h;->q(Lc/a/a/a/m2/a0;I)Lc/a/a/a/h2/m/m;

    move-result-object v1

    goto/16 :goto_e

    :cond_18
    if-ne v8, v1, :cond_19

    .line 20
    invoke-static {v0, v8, v9, v10, v13}, Lc/a/a/a/h2/m/h;->v(IIIII)Ljava/lang/String;

    move-result-object v1

    .line 21
    invoke-static {v7, v15, v1}, Lc/a/a/a/h2/m/h;->p(Lc/a/a/a/m2/a0;ILjava/lang/String;)Lc/a/a/a/h2/m/m;

    move-result-object v1

    goto/16 :goto_e

    :catchall_0
    move-exception v0

    goto/16 :goto_f

    :cond_19
    const/16 v4, 0x57

    if-ne v8, v4, :cond_1b

    if-ne v9, v3, :cond_1b

    if-ne v10, v3, :cond_1b

    if-eq v0, v2, :cond_1a

    if-ne v13, v3, :cond_1b

    .line 22
    :cond_1a
    invoke-static {v7, v15}, Lc/a/a/a/h2/m/h;->s(Lc/a/a/a/m2/a0;I)Lc/a/a/a/h2/m/n;

    move-result-object v1

    goto/16 :goto_e

    :cond_1b
    if-ne v8, v4, :cond_1c

    .line 23
    invoke-static {v0, v8, v9, v10, v13}, Lc/a/a/a/h2/m/h;->v(IIIII)Ljava/lang/String;

    move-result-object v1

    .line 24
    invoke-static {v7, v15, v1}, Lc/a/a/a/h2/m/h;->r(Lc/a/a/a/m2/a0;ILjava/lang/String;)Lc/a/a/a/h2/m/n;

    move-result-object v1

    goto/16 :goto_e

    :cond_1c
    const/16 v3, 0x49

    const/16 v4, 0x50

    if-ne v8, v4, :cond_1d

    const/16 v5, 0x52

    if-ne v9, v5, :cond_1d

    if-ne v10, v3, :cond_1d

    const/16 v5, 0x56

    if-ne v13, v5, :cond_1d

    .line 25
    invoke-static {v7, v15}, Lc/a/a/a/h2/m/h;->n(Lc/a/a/a/m2/a0;I)Lc/a/a/a/h2/m/l;

    move-result-object v1

    goto/16 :goto_e

    :cond_1d
    const/16 v5, 0x47

    const/16 v6, 0x4f

    if-ne v8, v5, :cond_1f

    const/16 v5, 0x45

    if-ne v9, v5, :cond_1f

    if-ne v10, v6, :cond_1f

    const/16 v5, 0x42

    if-eq v13, v5, :cond_1e

    if-ne v0, v2, :cond_1f

    .line 26
    :cond_1e
    invoke-static {v7, v15}, Lc/a/a/a/h2/m/h;->k(Lc/a/a/a/m2/a0;I)Lc/a/a/a/h2/m/g;

    move-result-object v1

    goto/16 :goto_e

    :cond_1f
    const/16 v5, 0x41

    const/16 v11, 0x43

    if-ne v0, v2, :cond_20

    if-ne v8, v4, :cond_21

    if-ne v9, v3, :cond_21

    if-ne v10, v11, :cond_21

    goto :goto_d

    :cond_20
    if-ne v8, v5, :cond_21

    if-ne v9, v4, :cond_21

    if-ne v10, v3, :cond_21

    if-ne v13, v11, :cond_21

    .line 27
    :goto_d
    invoke-static {v7, v15, v0}, Lc/a/a/a/h2/m/h;->e(Lc/a/a/a/m2/a0;II)Lc/a/a/a/h2/m/b;

    move-result-object v1

    goto/16 :goto_e

    :cond_21
    const/16 v3, 0x4d

    if-ne v8, v11, :cond_23

    if-ne v9, v6, :cond_23

    if-ne v10, v3, :cond_23

    if-eq v13, v3, :cond_22

    if-ne v0, v2, :cond_23

    .line 28
    :cond_22
    invoke-static {v7, v15}, Lc/a/a/a/h2/m/h;->i(Lc/a/a/a/m2/a0;I)Lc/a/a/a/h2/m/f;

    move-result-object v1

    goto :goto_e

    :cond_23
    if-ne v8, v11, :cond_24

    const/16 v2, 0x48

    if-ne v9, v2, :cond_24

    if-ne v10, v5, :cond_24

    if-ne v13, v4, :cond_24

    move-object/from16 v1, p1

    move v2, v15

    move/from16 v3, p0

    move/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p4

    .line 29
    invoke-static/range {v1 .. v6}, Lc/a/a/a/h2/m/h;->g(Lc/a/a/a/m2/a0;IIZILc/a/a/a/h2/m/h$a;)Lc/a/a/a/h2/m/d;

    move-result-object v1

    goto :goto_e

    :cond_24
    if-ne v8, v11, :cond_25

    if-ne v9, v1, :cond_25

    if-ne v10, v6, :cond_25

    if-ne v13, v11, :cond_25

    move-object/from16 v1, p1

    move v2, v15

    move/from16 v3, p0

    move/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p4

    .line 30
    invoke-static/range {v1 .. v6}, Lc/a/a/a/h2/m/h;->h(Lc/a/a/a/m2/a0;IIZILc/a/a/a/h2/m/h$a;)Lc/a/a/a/h2/m/e;

    move-result-object v1

    goto :goto_e

    :cond_25
    if-ne v8, v3, :cond_26

    const/16 v2, 0x4c

    if-ne v9, v2, :cond_26

    if-ne v10, v2, :cond_26

    if-ne v13, v1, :cond_26

    .line 31
    invoke-static {v7, v15}, Lc/a/a/a/h2/m/h;->m(Lc/a/a/a/m2/a0;I)Lc/a/a/a/h2/m/k;

    move-result-object v1

    goto :goto_e

    .line 32
    :cond_26
    invoke-static {v0, v8, v9, v10, v13}, Lc/a/a/a/h2/m/h;->v(IIIII)Ljava/lang/String;

    move-result-object v1

    .line 33
    invoke-static {v7, v15, v1}, Lc/a/a/a/h2/m/h;->f(Lc/a/a/a/m2/a0;ILjava/lang/String;)Lc/a/a/a/h2/m/c;

    move-result-object v1

    :goto_e
    if-nez v1, :cond_27

    .line 34
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to decode frame: id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    invoke-static {v0, v8, v9, v10, v13}, Lc/a/a/a/h2/m/h;->v(IIIII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", frameSize="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 36
    invoke-static {v12, v0}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    :cond_27
    invoke-virtual {v7, v14}, Lc/a/a/a/m2/a0;->P(I)V

    return-object v1

    :catch_0
    :try_start_1
    const-string v0, "Unsupported character encoding"

    .line 38
    invoke-static {v12, v0}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    invoke-virtual {v7, v14}, Lc/a/a/a/m2/a0;->P(I)V

    return-object v16

    :goto_f
    invoke-virtual {v7, v14}, Lc/a/a/a/m2/a0;->P(I)V

    .line 40
    throw v0

    :cond_28
    :goto_10
    const-string v0, "Skipping unsupported compressed or encrypted frame"

    .line 41
    invoke-static {v12, v0}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    invoke-virtual {v7, v14}, Lc/a/a/a/m2/a0;->P(I)V

    return-object v16
.end method

.method private static k(Lc/a/a/a/m2/a0;I)Lc/a/a/a/h2/m/g;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->D()I

    move-result v0

    .line 2
    invoke-static {v0}, Lc/a/a/a/h2/m/h;->u(I)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 p1, p1, -0x1

    .line 3
    new-array v2, p1, [B

    const/4 v3, 0x0

    .line 4
    invoke-virtual {p0, v2, v3, p1}, Lc/a/a/a/m2/a0;->j([BII)V

    .line 5
    invoke-static {v2, v3}, Lc/a/a/a/h2/m/h;->x([BI)I

    move-result p0

    .line 6
    new-instance v4, Ljava/lang/String;

    const-string v5, "ISO-8859-1"

    invoke-direct {v4, v2, v3, p0, v5}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    add-int/lit8 p0, p0, 0x1

    .line 7
    invoke-static {v2, p0, v0}, Lc/a/a/a/h2/m/h;->w([BII)I

    move-result v3

    .line 8
    invoke-static {v2, p0, v3, v1}, Lc/a/a/a/h2/m/h;->o([BIILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 9
    invoke-static {v0}, Lc/a/a/a/h2/m/h;->t(I)I

    move-result v5

    add-int/2addr v3, v5

    .line 10
    invoke-static {v2, v3, v0}, Lc/a/a/a/h2/m/h;->w([BII)I

    move-result v5

    .line 11
    invoke-static {v2, v3, v5, v1}, Lc/a/a/a/h2/m/h;->o([BIILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 12
    invoke-static {v0}, Lc/a/a/a/h2/m/h;->t(I)I

    move-result v0

    add-int/2addr v5, v0

    .line 13
    invoke-static {v2, v5, p1}, Lc/a/a/a/h2/m/h;->c([BII)[B

    move-result-object p1

    .line 14
    new-instance v0, Lc/a/a/a/h2/m/g;

    invoke-direct {v0, v4, p0, v1, p1}, Lc/a/a/a/h2/m/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V

    return-object v0
.end method

.method private static l(Lc/a/a/a/m2/a0;)Lc/a/a/a/h2/m/h$b;
    .locals 9

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->a()I

    move-result v0

    const/4 v1, 0x0

    const-string v2, "Id3Decoder"

    const/16 v3, 0xa

    if-ge v0, v3, :cond_0

    const-string p0, "Data too short to be an ID3 tag"

    .line 2
    invoke-static {v2, p0}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    .line 3
    :cond_0
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->G()I

    move-result v0

    const v3, 0x494433

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v0, v3, :cond_1

    .line 4
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected first three bytes of ID3 tag header: 0x"

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v3, v5, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v4

    const-string v0, "%06X"

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    .line 5
    :cond_1
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->D()I

    move-result v0

    .line 6
    invoke-virtual {p0, v5}, Lc/a/a/a/m2/a0;->Q(I)V

    .line 7
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->D()I

    move-result v3

    .line 8
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->C()I

    move-result v6

    const/4 v7, 0x2

    const/4 v8, 0x4

    if-ne v0, v7, :cond_3

    and-int/lit8 p0, v3, 0x40

    if-eqz p0, :cond_2

    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_9

    const-string p0, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"

    .line 9
    invoke-static {v2, p0}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_3
    const/4 v7, 0x3

    if-ne v0, v7, :cond_5

    and-int/lit8 v1, v3, 0x40

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_9

    .line 10
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->n()I

    move-result v1

    .line 11
    invoke-virtual {p0, v1}, Lc/a/a/a/m2/a0;->Q(I)V

    add-int/2addr v1, v8

    sub-int/2addr v6, v1

    goto :goto_4

    :cond_5
    if-ne v0, v8, :cond_b

    and-int/lit8 v1, v3, 0x40

    if-eqz v1, :cond_6

    const/4 v1, 0x1

    goto :goto_2

    :cond_6
    const/4 v1, 0x0

    :goto_2
    if-eqz v1, :cond_7

    .line 12
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->C()I

    move-result v1

    add-int/lit8 v2, v1, -0x4

    .line 13
    invoke-virtual {p0, v2}, Lc/a/a/a/m2/a0;->Q(I)V

    sub-int/2addr v6, v1

    :cond_7
    and-int/lit8 p0, v3, 0x10

    if-eqz p0, :cond_8

    const/4 p0, 0x1

    goto :goto_3

    :cond_8
    const/4 p0, 0x0

    :goto_3
    if-eqz p0, :cond_9

    add-int/lit8 v6, v6, -0xa

    :cond_9
    :goto_4
    if-ge v0, v8, :cond_a

    and-int/lit16 p0, v3, 0x80

    if-eqz p0, :cond_a

    const/4 v4, 0x1

    .line 14
    :cond_a
    new-instance p0, Lc/a/a/a/h2/m/h$b;

    invoke-direct {p0, v0, v4, v6}, Lc/a/a/a/h2/m/h$b;-><init>(IZI)V

    return-object p0

    .line 15
    :cond_b
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Skipped ID3 tag with unsupported majorVersion="

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method private static m(Lc/a/a/a/m2/a0;I)Lc/a/a/a/h2/m/k;
    .locals 10

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->J()I

    move-result v1

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->G()I

    move-result v2

    .line 3
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->G()I

    move-result v3

    .line 4
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->D()I

    move-result v0

    .line 5
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->D()I

    move-result v4

    .line 6
    new-instance v5, Lc/a/a/a/m2/z;

    invoke-direct {v5}, Lc/a/a/a/m2/z;-><init>()V

    .line 7
    invoke-virtual {v5, p0}, Lc/a/a/a/m2/z;->m(Lc/a/a/a/m2/a0;)V

    add-int/lit8 p1, p1, -0xa

    mul-int/lit8 p1, p1, 0x8

    add-int p0, v0, v4

    .line 8
    div-int/2addr p1, p0

    .line 9
    new-array p0, p1, [I

    .line 10
    new-array v6, p1, [I

    const/4 v7, 0x0

    :goto_0
    if-ge v7, p1, :cond_0

    .line 11
    invoke-virtual {v5, v0}, Lc/a/a/a/m2/z;->h(I)I

    move-result v8

    .line 12
    invoke-virtual {v5, v4}, Lc/a/a/a/m2/z;->h(I)I

    move-result v9

    .line 13
    aput v8, p0, v7

    .line 14
    aput v9, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 15
    :cond_0
    new-instance p1, Lc/a/a/a/h2/m/k;

    move-object v0, p1

    move-object v4, p0

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Lc/a/a/a/h2/m/k;-><init>(III[I[I)V

    return-object p1
.end method

.method private static n(Lc/a/a/a/m2/a0;I)Lc/a/a/a/h2/m/l;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 1
    new-array v0, p1, [B

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, v1, p1}, Lc/a/a/a/m2/a0;->j([BII)V

    .line 3
    invoke-static {v0, v1}, Lc/a/a/a/h2/m/h;->x([BI)I

    move-result p0

    .line 4
    new-instance v2, Ljava/lang/String;

    const-string v3, "ISO-8859-1"

    invoke-direct {v2, v0, v1, p0, v3}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    add-int/lit8 p0, p0, 0x1

    .line 5
    invoke-static {v0, p0, p1}, Lc/a/a/a/h2/m/h;->c([BII)[B

    move-result-object p0

    .line 6
    new-instance p1, Lc/a/a/a/h2/m/l;

    invoke-direct {p1, v2, p0}, Lc/a/a/a/h2/m/l;-><init>(Ljava/lang/String;[B)V

    return-object p1
.end method

.method private static o([BIILjava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    if-le p2, p1, :cond_1

    .line 1
    array-length v0, p0

    if-le p2, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/String;

    sub-int/2addr p2, p1

    invoke-direct {v0, p0, p1, p2, p3}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    return-object v0

    :cond_1
    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method private static p(Lc/a/a/a/m2/a0;ILjava/lang/String;)Lc/a/a/a/h2/m/m;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ge p1, v1, :cond_0

    return-object v0

    .line 1
    :cond_0
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->D()I

    move-result v2

    .line 2
    invoke-static {v2}, Lc/a/a/a/h2/m/h;->u(I)Ljava/lang/String;

    move-result-object v3

    sub-int/2addr p1, v1

    .line 3
    new-array v1, p1, [B

    const/4 v4, 0x0

    .line 4
    invoke-virtual {p0, v1, v4, p1}, Lc/a/a/a/m2/a0;->j([BII)V

    .line 5
    invoke-static {v1, v4, v2}, Lc/a/a/a/h2/m/h;->w([BII)I

    move-result p0

    .line 6
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v1, v4, p0, v3}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 7
    new-instance p0, Lc/a/a/a/h2/m/m;

    invoke-direct {p0, p2, v0, p1}, Lc/a/a/a/h2/m/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method private static q(Lc/a/a/a/m2/a0;I)Lc/a/a/a/h2/m/m;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    const/4 v0, 0x1

    if-ge p1, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 1
    :cond_0
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->D()I

    move-result v1

    .line 2
    invoke-static {v1}, Lc/a/a/a/h2/m/h;->u(I)Ljava/lang/String;

    move-result-object v2

    sub-int/2addr p1, v0

    .line 3
    new-array v0, p1, [B

    const/4 v3, 0x0

    .line 4
    invoke-virtual {p0, v0, v3, p1}, Lc/a/a/a/m2/a0;->j([BII)V

    .line 5
    invoke-static {v0, v3, v1}, Lc/a/a/a/h2/m/h;->w([BII)I

    move-result p0

    .line 6
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0, v3, p0, v2}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 7
    invoke-static {v1}, Lc/a/a/a/h2/m/h;->t(I)I

    move-result v3

    add-int/2addr p0, v3

    .line 8
    invoke-static {v0, p0, v1}, Lc/a/a/a/h2/m/h;->w([BII)I

    move-result v1

    .line 9
    invoke-static {v0, p0, v1, v2}, Lc/a/a/a/h2/m/h;->o([BIILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 10
    new-instance v0, Lc/a/a/a/h2/m/m;

    const-string v1, "TXXX"

    invoke-direct {v0, v1, p1, p0}, Lc/a/a/a/h2/m/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private static r(Lc/a/a/a/m2/a0;ILjava/lang/String;)Lc/a/a/a/h2/m/n;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 1
    new-array v0, p1, [B

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, v1, p1}, Lc/a/a/a/m2/a0;->j([BII)V

    .line 3
    invoke-static {v0, v1}, Lc/a/a/a/h2/m/h;->x([BI)I

    move-result p0

    .line 4
    new-instance p1, Ljava/lang/String;

    const-string v2, "ISO-8859-1"

    invoke-direct {p1, v0, v1, p0, v2}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 5
    new-instance p0, Lc/a/a/a/h2/m/n;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0, p1}, Lc/a/a/a/h2/m/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method private static s(Lc/a/a/a/m2/a0;I)Lc/a/a/a/h2/m/n;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    const/4 v0, 0x1

    if-ge p1, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 1
    :cond_0
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->D()I

    move-result v1

    .line 2
    invoke-static {v1}, Lc/a/a/a/h2/m/h;->u(I)Ljava/lang/String;

    move-result-object v2

    sub-int/2addr p1, v0

    .line 3
    new-array v0, p1, [B

    const/4 v3, 0x0

    .line 4
    invoke-virtual {p0, v0, v3, p1}, Lc/a/a/a/m2/a0;->j([BII)V

    .line 5
    invoke-static {v0, v3, v1}, Lc/a/a/a/h2/m/h;->w([BII)I

    move-result p0

    .line 6
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0, v3, p0, v2}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 7
    invoke-static {v1}, Lc/a/a/a/h2/m/h;->t(I)I

    move-result v1

    add-int/2addr p0, v1

    .line 8
    invoke-static {v0, p0}, Lc/a/a/a/h2/m/h;->x([BI)I

    move-result v1

    const-string v2, "ISO-8859-1"

    .line 9
    invoke-static {v0, p0, v1, v2}, Lc/a/a/a/h2/m/h;->o([BIILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 10
    new-instance v0, Lc/a/a/a/h2/m/n;

    const-string v1, "WXXX"

    invoke-direct {v0, v1, p1, p0}, Lc/a/a/a/h2/m/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private static t(I)I
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x2

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static u(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const-string p0, "ISO-8859-1"

    return-object p0

    :cond_0
    const-string p0, "UTF-8"

    return-object p0

    :cond_1
    const-string p0, "UTF-16BE"

    return-object p0

    :cond_2
    const-string p0, "UTF-16"

    return-object p0
.end method

.method private static v(IIIII)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-ne p0, v3, :cond_0

    .line 1
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array p4, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p4, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p4, v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p4, v3

    const-string p1, "%c%c%c"

    invoke-static {p0, p1, p4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 2
    :cond_0
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v0

    const-string p1, "%c%c%c%c"

    invoke-static {p0, p1, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static w([BII)I
    .locals 1

    .line 1
    invoke-static {p0, p1}, Lc/a/a/a/h2/m/h;->x([BI)I

    move-result p1

    if-eqz p2, :cond_3

    const/4 v0, 0x3

    if-ne p2, v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    :goto_0
    array-length p2, p0

    add-int/lit8 p2, p2, -0x1

    if-ge p1, p2, :cond_2

    .line 3
    rem-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    add-int/lit8 p2, p1, 0x1

    aget-byte p2, p0, p2

    if-nez p2, :cond_1

    return p1

    :cond_1
    add-int/lit8 p1, p1, 0x1

    .line 4
    invoke-static {p0, p1}, Lc/a/a/a/h2/m/h;->x([BI)I

    move-result p1

    goto :goto_0

    .line 5
    :cond_2
    array-length p0, p0

    return p0

    :cond_3
    :goto_1
    return p1
.end method

.method private static x([BI)I
    .locals 1

    .line 1
    :goto_0
    array-length v0, p0

    if-ge p1, v0, :cond_1

    .line 2
    aget-byte v0, p0, p1

    if-nez v0, :cond_0

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 3
    :cond_1
    array-length p0, p0

    return p0
.end method

.method static synthetic y(IIIII)Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method private static z(Lc/a/a/a/m2/a0;I)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->e()I

    move-result p0

    move v1, p0

    :goto_0
    add-int/lit8 v2, v1, 0x1

    add-int v3, p0, p1

    if-ge v2, v3, :cond_1

    .line 3
    aget-byte v3, v0, v1

    const/16 v4, 0xff

    and-int/2addr v3, v4

    if-ne v3, v4, :cond_0

    aget-byte v3, v0, v2

    if-nez v3, :cond_0

    sub-int v3, v1, p0

    add-int/lit8 v1, v1, 0x2

    sub-int v3, p1, v3

    add-int/lit8 v3, v3, -0x2

    .line 4
    invoke-static {v0, v1, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 p1, p1, -0x1

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    return p1
.end method


# virtual methods
.method protected b(Lc/a/a/a/h2/e;Ljava/nio/ByteBuffer;)Lc/a/a/a/h2/a;
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->limit()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lc/a/a/a/h2/m/h;->d([BI)Lc/a/a/a/h2/a;

    move-result-object p1

    return-object p1
.end method

.method public d([BI)Lc/a/a/a/h2/a;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    new-instance v1, Lc/a/a/a/m2/a0;

    invoke-direct {v1, p1, p2}, Lc/a/a/a/m2/a0;-><init>([BI)V

    .line 3
    invoke-static {v1}, Lc/a/a/a/h2/m/h;->l(Lc/a/a/a/m2/a0;)Lc/a/a/a/h2/m/h$b;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return-object p2

    .line 4
    :cond_0
    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->e()I

    move-result v2

    .line 5
    invoke-static {p1}, Lc/a/a/a/h2/m/h$b;->a(Lc/a/a/a/h2/m/h$b;)I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    const/4 v3, 0x6

    goto :goto_0

    :cond_1
    const/16 v3, 0xa

    .line 6
    :goto_0
    invoke-static {p1}, Lc/a/a/a/h2/m/h$b;->b(Lc/a/a/a/h2/m/h$b;)I

    move-result v4

    .line 7
    invoke-static {p1}, Lc/a/a/a/h2/m/h$b;->c(Lc/a/a/a/h2/m/h$b;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 8
    invoke-static {p1}, Lc/a/a/a/h2/m/h$b;->b(Lc/a/a/a/h2/m/h$b;)I

    move-result v4

    invoke-static {v1, v4}, Lc/a/a/a/h2/m/h;->z(Lc/a/a/a/m2/a0;I)I

    move-result v4

    :cond_2
    add-int/2addr v2, v4

    .line 9
    invoke-virtual {v1, v2}, Lc/a/a/a/m2/a0;->O(I)V

    .line 10
    invoke-static {p1}, Lc/a/a/a/h2/m/h$b;->a(Lc/a/a/a/h2/m/h$b;)I

    move-result v2

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lc/a/a/a/h2/m/h;->A(Lc/a/a/a/m2/a0;IIZ)Z

    move-result v2

    const/4 v5, 0x1

    if-nez v2, :cond_4

    .line 11
    invoke-static {p1}, Lc/a/a/a/h2/m/h$b;->a(Lc/a/a/a/h2/m/h$b;)I

    move-result v2

    const/4 v4, 0x4

    if-ne v2, v4, :cond_3

    invoke-static {v1, v4, v3, v5}, Lc/a/a/a/h2/m/h;->A(Lc/a/a/a/m2/a0;IIZ)Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v4, 0x1

    goto :goto_1

    .line 12
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to validate ID3 tag with majorVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lc/a/a/a/h2/m/h$b;->a(Lc/a/a/a/h2/m/h$b;)I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Id3Decoder"

    invoke-static {v0, p1}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    return-object p2

    .line 13
    :cond_4
    :goto_1
    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->a()I

    move-result p2

    if-lt p2, v3, :cond_5

    .line 14
    invoke-static {p1}, Lc/a/a/a/h2/m/h$b;->a(Lc/a/a/a/h2/m/h$b;)I

    move-result p2

    iget-object v2, p0, Lc/a/a/a/h2/m/h;->b:Lc/a/a/a/h2/m/h$a;

    .line 15
    invoke-static {p2, v1, v4, v3, v2}, Lc/a/a/a/h2/m/h;->j(ILc/a/a/a/m2/a0;ZILc/a/a/a/h2/m/h$a;)Lc/a/a/a/h2/m/i;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 16
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 17
    :cond_5
    new-instance p1, Lc/a/a/a/h2/a;

    invoke-direct {p1, v0}, Lc/a/a/a/h2/a;-><init>(Ljava/util/List;)V

    return-object p1
.end method
