.class public final Lc/a/a/a/f2/m0/p;
.super Ljava/lang/Object;
.source "H262Reader.java"

# interfaces
.implements Lc/a/a/a/f2/m0/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/f2/m0/p$a;
    }
.end annotation


# static fields
.field private static final a:[D


# instance fields
.field private b:Ljava/lang/String;

.field private c:Lc/a/a/a/f2/b0;

.field private final d:Lc/a/a/a/f2/m0/k0;

.field private final e:Lc/a/a/a/m2/a0;

.field private final f:Lc/a/a/a/f2/m0/w;

.field private final g:[Z

.field private final h:Lc/a/a/a/f2/m0/p$a;

.field private i:J

.field private j:Z

.field private k:Z

.field private l:J

.field private m:J

.field private n:J

.field private o:J

.field private p:Z

.field private q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    new-array v0, v0, [D

    .line 1
    fill-array-data v0, :array_0

    sput-object v0, Lc/a/a/a/f2/m0/p;->a:[D

    return-void

    :array_0
    .array-data 8
        0x4037f9dcb5112287L    # 23.976023976023978
        0x4038000000000000L    # 24.0
        0x4039000000000000L    # 25.0
        0x403df853e2556b28L    # 29.97002997002997
        0x403e000000000000L    # 30.0
        0x4049000000000000L    # 50.0
        0x404df853e2556b28L    # 59.94005994005994
        0x404e000000000000L    # 60.0
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lc/a/a/a/f2/m0/p;-><init>(Lc/a/a/a/f2/m0/k0;)V

    return-void
.end method

.method constructor <init>(Lc/a/a/a/f2/m0/k0;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lc/a/a/a/f2/m0/p;->d:Lc/a/a/a/f2/m0/k0;

    const/4 v0, 0x4

    new-array v0, v0, [Z

    .line 4
    iput-object v0, p0, Lc/a/a/a/f2/m0/p;->g:[Z

    .line 5
    new-instance v0, Lc/a/a/a/f2/m0/p$a;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Lc/a/a/a/f2/m0/p$a;-><init>(I)V

    iput-object v0, p0, Lc/a/a/a/f2/m0/p;->h:Lc/a/a/a/f2/m0/p$a;

    if-eqz p1, :cond_0

    .line 6
    new-instance p1, Lc/a/a/a/f2/m0/w;

    const/16 v0, 0xb2

    invoke-direct {p1, v0, v1}, Lc/a/a/a/f2/m0/w;-><init>(II)V

    iput-object p1, p0, Lc/a/a/a/f2/m0/p;->f:Lc/a/a/a/f2/m0/w;

    .line 7
    new-instance p1, Lc/a/a/a/m2/a0;

    invoke-direct {p1}, Lc/a/a/a/m2/a0;-><init>()V

    iput-object p1, p0, Lc/a/a/a/f2/m0/p;->e:Lc/a/a/a/m2/a0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lc/a/a/a/f2/m0/p;->f:Lc/a/a/a/f2/m0/w;

    .line 9
    iput-object p1, p0, Lc/a/a/a/f2/m0/p;->e:Lc/a/a/a/m2/a0;

    :goto_0
    return-void
.end method

.method private static b(Lc/a/a/a/f2/m0/p$a;Ljava/lang/String;)Landroid/util/Pair;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/f2/m0/p$a;",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Pair<",
            "Lc/a/a/a/u0;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/m0/p$a;->e:[B

    iget v1, p0, Lc/a/a/a/f2/m0/p$a;->c:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    const/4 v1, 0x4

    .line 2
    aget-byte v2, v0, v1

    and-int/lit16 v2, v2, 0xff

    const/4 v3, 0x5

    .line 3
    aget-byte v4, v0, v3

    and-int/lit16 v4, v4, 0xff

    const/4 v5, 0x6

    .line 4
    aget-byte v5, v0, v5

    and-int/lit16 v5, v5, 0xff

    shl-int/2addr v2, v1

    shr-int/lit8 v6, v4, 0x4

    or-int/2addr v2, v6

    and-int/lit8 v4, v4, 0xf

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v4, v5

    const/4 v5, 0x7

    .line 5
    aget-byte v6, v0, v5

    and-int/lit16 v6, v6, 0xf0

    shr-int/2addr v6, v1

    const/4 v7, 0x2

    if-eq v6, v7, :cond_2

    const/4 v7, 0x3

    if-eq v6, v7, :cond_1

    if-eq v6, v1, :cond_0

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_0
    mul-int/lit8 v1, v4, 0x79

    int-to-float v1, v1

    mul-int/lit8 v6, v2, 0x64

    goto :goto_0

    :cond_1
    mul-int/lit8 v1, v4, 0x10

    int-to-float v1, v1

    mul-int/lit8 v6, v2, 0x9

    goto :goto_0

    :cond_2
    mul-int/lit8 v1, v4, 0x4

    int-to-float v1, v1

    mul-int/lit8 v6, v2, 0x3

    :goto_0
    int-to-float v6, v6

    div-float/2addr v1, v6

    .line 6
    :goto_1
    new-instance v6, Lc/a/a/a/u0$b;

    invoke-direct {v6}, Lc/a/a/a/u0$b;-><init>()V

    .line 7
    invoke-virtual {v6, p1}, Lc/a/a/a/u0$b;->S(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object p1

    const-string v6, "video/mpeg2"

    .line 8
    invoke-virtual {p1, v6}, Lc/a/a/a/u0$b;->e0(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object p1

    .line 9
    invoke-virtual {p1, v2}, Lc/a/a/a/u0$b;->j0(I)Lc/a/a/a/u0$b;

    move-result-object p1

    .line 10
    invoke-virtual {p1, v4}, Lc/a/a/a/u0$b;->Q(I)Lc/a/a/a/u0$b;

    move-result-object p1

    .line 11
    invoke-virtual {p1, v1}, Lc/a/a/a/u0$b;->a0(F)Lc/a/a/a/u0$b;

    move-result-object p1

    .line 12
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1, v1}, Lc/a/a/a/u0$b;->T(Ljava/util/List;)Lc/a/a/a/u0$b;

    move-result-object p1

    .line 13
    invoke-virtual {p1}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object p1

    const-wide/16 v1, 0x0

    .line 14
    aget-byte v4, v0, v5

    and-int/lit8 v4, v4, 0xf

    add-int/lit8 v4, v4, -0x1

    if-ltz v4, :cond_4

    .line 15
    sget-object v5, Lc/a/a/a/f2/m0/p;->a:[D

    array-length v6, v5

    if-ge v4, v6, :cond_4

    .line 16
    aget-wide v1, v5, v4

    .line 17
    iget p0, p0, Lc/a/a/a/f2/m0/p$a;->d:I

    add-int/lit8 p0, p0, 0x9

    .line 18
    aget-byte v4, v0, p0

    and-int/lit8 v4, v4, 0x60

    shr-int/lit8 v3, v4, 0x5

    .line 19
    aget-byte p0, v0, p0

    and-int/lit8 p0, p0, 0x1f

    if-eq v3, p0, :cond_3

    int-to-double v3, v3

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 20
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v3, v5

    add-int/lit8 p0, p0, 0x1

    int-to-double v5, p0

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v3, v5

    mul-double v1, v1, v3

    :cond_3
    const-wide v3, 0x412e848000000000L    # 1000000.0

    div-double/2addr v3, v1

    double-to-long v1, v3

    .line 21
    :cond_4
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/m0/p;->g:[Z

    invoke-static {v0}, Lc/a/a/a/m2/y;->a([Z)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/m0/p;->h:Lc/a/a/a/f2/m0/p$a;

    invoke-virtual {v0}, Lc/a/a/a/f2/m0/p$a;->c()V

    .line 3
    iget-object v0, p0, Lc/a/a/a/f2/m0/p;->f:Lc/a/a/a/f2/m0/w;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lc/a/a/a/f2/m0/w;->d()V

    :cond_0
    const-wide/16 v0, 0x0

    .line 5
    iput-wide v0, p0, Lc/a/a/a/f2/m0/p;->i:J

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lc/a/a/a/f2/m0/p;->j:Z

    return-void
.end method

.method public c(Lc/a/a/a/m2/a0;)V
    .locals 19

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lc/a/a/a/f2/m0/p;->c:Lc/a/a/a/f2/b0;

    invoke-static {v1}, Lc/a/a/a/m2/f;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/m2/a0;->e()I

    move-result v1

    .line 3
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/m2/a0;->f()I

    move-result v2

    .line 4
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v3

    .line 5
    iget-wide v4, v0, Lc/a/a/a/f2/m0/p;->i:J

    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/m2/a0;->a()I

    move-result v6

    int-to-long v6, v6

    add-long/2addr v4, v6

    iput-wide v4, v0, Lc/a/a/a/f2/m0/p;->i:J

    .line 6
    iget-object v4, v0, Lc/a/a/a/f2/m0/p;->c:Lc/a/a/a/f2/b0;

    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/m2/a0;->a()I

    move-result v5

    move-object/from16 v6, p1

    invoke-interface {v4, v6, v5}, Lc/a/a/a/f2/b0;->a(Lc/a/a/a/m2/a0;I)V

    .line 7
    :goto_0
    iget-object v4, v0, Lc/a/a/a/f2/m0/p;->g:[Z

    invoke-static {v3, v1, v2, v4}, Lc/a/a/a/m2/y;->c([BII[Z)I

    move-result v4

    if-ne v4, v2, :cond_2

    .line 8
    iget-boolean v4, v0, Lc/a/a/a/f2/m0/p;->k:Z

    if-nez v4, :cond_0

    .line 9
    iget-object v4, v0, Lc/a/a/a/f2/m0/p;->h:Lc/a/a/a/f2/m0/p$a;

    invoke-virtual {v4, v3, v1, v2}, Lc/a/a/a/f2/m0/p$a;->a([BII)V

    .line 10
    :cond_0
    iget-object v4, v0, Lc/a/a/a/f2/m0/p;->f:Lc/a/a/a/f2/m0/w;

    if-eqz v4, :cond_1

    .line 11
    invoke-virtual {v4, v3, v1, v2}, Lc/a/a/a/f2/m0/w;->a([BII)V

    :cond_1
    return-void

    .line 12
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v5

    add-int/lit8 v7, v4, 0x3

    aget-byte v5, v5, v7

    and-int/lit16 v5, v5, 0xff

    sub-int v8, v4, v1

    .line 13
    iget-boolean v9, v0, Lc/a/a/a/f2/m0/p;->k:Z

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-nez v9, :cond_5

    if-lez v8, :cond_3

    .line 14
    iget-object v9, v0, Lc/a/a/a/f2/m0/p;->h:Lc/a/a/a/f2/m0/p$a;

    invoke-virtual {v9, v3, v1, v4}, Lc/a/a/a/f2/m0/p$a;->a([BII)V

    :cond_3
    if-gez v8, :cond_4

    neg-int v9, v8

    goto :goto_1

    :cond_4
    const/4 v9, 0x0

    .line 15
    :goto_1
    iget-object v12, v0, Lc/a/a/a/f2/m0/p;->h:Lc/a/a/a/f2/m0/p$a;

    invoke-virtual {v12, v5, v9}, Lc/a/a/a/f2/m0/p$a;->b(II)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 16
    iget-object v9, v0, Lc/a/a/a/f2/m0/p;->h:Lc/a/a/a/f2/m0/p$a;

    iget-object v12, v0, Lc/a/a/a/f2/m0/p;->b:Ljava/lang/String;

    invoke-static {v12}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-static {v9, v12}, Lc/a/a/a/f2/m0/p;->b(Lc/a/a/a/f2/m0/p$a;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v9

    .line 17
    iget-object v12, v0, Lc/a/a/a/f2/m0/p;->c:Lc/a/a/a/f2/b0;

    iget-object v13, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v13, Lc/a/a/a/u0;

    invoke-interface {v12, v13}, Lc/a/a/a/f2/b0;->d(Lc/a/a/a/u0;)V

    .line 18
    iget-object v9, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Long;

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    iput-wide v12, v0, Lc/a/a/a/f2/m0/p;->l:J

    .line 19
    iput-boolean v11, v0, Lc/a/a/a/f2/m0/p;->k:Z

    .line 20
    :cond_5
    iget-object v9, v0, Lc/a/a/a/f2/m0/p;->f:Lc/a/a/a/f2/m0/w;

    if-eqz v9, :cond_8

    if-lez v8, :cond_6

    .line 21
    invoke-virtual {v9, v3, v1, v4}, Lc/a/a/a/f2/m0/w;->a([BII)V

    const/4 v1, 0x0

    goto :goto_2

    :cond_6
    neg-int v1, v8

    .line 22
    :goto_2
    iget-object v8, v0, Lc/a/a/a/f2/m0/p;->f:Lc/a/a/a/f2/m0/w;

    invoke-virtual {v8, v1}, Lc/a/a/a/f2/m0/w;->b(I)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 23
    iget-object v1, v0, Lc/a/a/a/f2/m0/p;->f:Lc/a/a/a/f2/m0/w;

    iget-object v8, v1, Lc/a/a/a/f2/m0/w;->d:[B

    iget v1, v1, Lc/a/a/a/f2/m0/w;->e:I

    invoke-static {v8, v1}, Lc/a/a/a/m2/y;->k([BI)I

    move-result v1

    .line 24
    iget-object v8, v0, Lc/a/a/a/f2/m0/p;->e:Lc/a/a/a/m2/a0;

    invoke-static {v8}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lc/a/a/a/m2/a0;

    iget-object v9, v0, Lc/a/a/a/f2/m0/p;->f:Lc/a/a/a/f2/m0/w;

    iget-object v9, v9, Lc/a/a/a/f2/m0/w;->d:[B

    invoke-virtual {v8, v9, v1}, Lc/a/a/a/m2/a0;->N([BI)V

    .line 25
    iget-object v1, v0, Lc/a/a/a/f2/m0/p;->d:Lc/a/a/a/f2/m0/k0;

    invoke-static {v1}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/f2/m0/k0;

    iget-wide v8, v0, Lc/a/a/a/f2/m0/p;->o:J

    iget-object v12, v0, Lc/a/a/a/f2/m0/p;->e:Lc/a/a/a/m2/a0;

    invoke-virtual {v1, v8, v9, v12}, Lc/a/a/a/f2/m0/k0;->a(JLc/a/a/a/m2/a0;)V

    :cond_7
    const/16 v1, 0xb2

    if-ne v5, v1, :cond_8

    .line 26
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v1

    add-int/lit8 v8, v4, 0x2

    aget-byte v1, v1, v8

    if-ne v1, v11, :cond_8

    .line 27
    iget-object v1, v0, Lc/a/a/a/f2/m0/p;->f:Lc/a/a/a/f2/m0/w;

    invoke-virtual {v1, v5}, Lc/a/a/a/f2/m0/w;->e(I)V

    :cond_8
    if-eqz v5, :cond_a

    const/16 v1, 0xb3

    if-ne v5, v1, :cond_9

    goto :goto_3

    :cond_9
    const/16 v1, 0xb8

    if-ne v5, v1, :cond_11

    .line 28
    iput-boolean v11, v0, Lc/a/a/a/f2/m0/p;->p:Z

    goto :goto_5

    :cond_a
    :goto_3
    sub-int v1, v2, v4

    .line 29
    iget-boolean v4, v0, Lc/a/a/a/f2/m0/p;->j:Z

    if-eqz v4, :cond_b

    iget-boolean v4, v0, Lc/a/a/a/f2/m0/p;->q:Z

    if-eqz v4, :cond_b

    iget-boolean v4, v0, Lc/a/a/a/f2/m0/p;->k:Z

    if-eqz v4, :cond_b

    .line 30
    iget-boolean v15, v0, Lc/a/a/a/f2/m0/p;->p:Z

    .line 31
    iget-wide v8, v0, Lc/a/a/a/f2/m0/p;->i:J

    iget-wide v12, v0, Lc/a/a/a/f2/m0/p;->n:J

    sub-long/2addr v8, v12

    long-to-int v4, v8

    sub-int v16, v4, v1

    .line 32
    iget-object v12, v0, Lc/a/a/a/f2/m0/p;->c:Lc/a/a/a/f2/b0;

    iget-wide v13, v0, Lc/a/a/a/f2/m0/p;->o:J

    const/16 v18, 0x0

    move/from16 v17, v1

    invoke-interface/range {v12 .. v18}, Lc/a/a/a/f2/b0;->c(JIIILc/a/a/a/f2/b0$a;)V

    .line 33
    :cond_b
    iget-boolean v4, v0, Lc/a/a/a/f2/m0/p;->j:Z

    if-eqz v4, :cond_c

    iget-boolean v8, v0, Lc/a/a/a/f2/m0/p;->q:Z

    if-eqz v8, :cond_f

    .line 34
    :cond_c
    iget-wide v8, v0, Lc/a/a/a/f2/m0/p;->i:J

    int-to-long v12, v1

    sub-long/2addr v8, v12

    iput-wide v8, v0, Lc/a/a/a/f2/m0/p;->n:J

    .line 35
    iget-wide v8, v0, Lc/a/a/a/f2/m0/p;->m:J

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v8, v12

    if-eqz v1, :cond_d

    goto :goto_4

    :cond_d
    if-eqz v4, :cond_e

    .line 36
    iget-wide v8, v0, Lc/a/a/a/f2/m0/p;->o:J

    iget-wide v14, v0, Lc/a/a/a/f2/m0/p;->l:J

    add-long/2addr v8, v14

    goto :goto_4

    :cond_e
    const-wide/16 v8, 0x0

    :goto_4
    iput-wide v8, v0, Lc/a/a/a/f2/m0/p;->o:J

    .line 37
    iput-boolean v10, v0, Lc/a/a/a/f2/m0/p;->p:Z

    .line 38
    iput-wide v12, v0, Lc/a/a/a/f2/m0/p;->m:J

    .line 39
    iput-boolean v11, v0, Lc/a/a/a/f2/m0/p;->j:Z

    :cond_f
    if-nez v5, :cond_10

    const/4 v10, 0x1

    .line 40
    :cond_10
    iput-boolean v10, v0, Lc/a/a/a/f2/m0/p;->q:Z

    :cond_11
    :goto_5
    move v1, v7

    goto/16 :goto_0
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e(JI)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lc/a/a/a/f2/m0/p;->m:J

    return-void
.end method

.method public f(Lc/a/a/a/f2/l;Lc/a/a/a/f2/m0/i0$d;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lc/a/a/a/f2/m0/i0$d;->a()V

    .line 2
    invoke-virtual {p2}, Lc/a/a/a/f2/m0/i0$d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/f2/m0/p;->b:Ljava/lang/String;

    .line 3
    invoke-virtual {p2}, Lc/a/a/a/f2/m0/i0$d;->c()I

    move-result v0

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Lc/a/a/a/f2/l;->q(II)Lc/a/a/a/f2/b0;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/f2/m0/p;->c:Lc/a/a/a/f2/b0;

    .line 4
    iget-object v0, p0, Lc/a/a/a/f2/m0/p;->d:Lc/a/a/a/f2/m0/k0;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0, p1, p2}, Lc/a/a/a/f2/m0/k0;->b(Lc/a/a/a/f2/l;Lc/a/a/a/f2/m0/i0$d;)V

    :cond_0
    return-void
.end method
