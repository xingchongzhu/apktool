.class public final Lc/a/a/a/f2/m0/k;
.super Ljava/lang/Object;
.source "AdtsReader.java"

# interfaces
.implements Lc/a/a/a/f2/m0/o;


# static fields
.field private static final a:[B


# instance fields
.field private final b:Z

.field private final c:Lc/a/a/a/m2/z;

.field private final d:Lc/a/a/a/m2/a0;

.field private final e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Lc/a/a/a/f2/b0;

.field private h:Lc/a/a/a/f2/b0;

.field private i:I

.field private j:I

.field private k:I

.field private l:Z

.field private m:Z

.field private n:I

.field private o:I

.field private p:I

.field private q:Z

.field private r:J

.field private s:I

.field private t:J

.field private u:Lc/a/a/a/f2/b0;

.field private v:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [B

    .line 1
    fill-array-data v0, :array_0

    sput-object v0, Lc/a/a/a/f2/m0/k;->a:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x49t
        0x44t
        0x33t
    .end array-data
.end method

.method public constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lc/a/a/a/f2/m0/k;-><init>(ZLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lc/a/a/a/m2/z;

    const/4 v1, 0x7

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lc/a/a/a/m2/z;-><init>([B)V

    iput-object v0, p0, Lc/a/a/a/f2/m0/k;->c:Lc/a/a/a/m2/z;

    .line 4
    new-instance v0, Lc/a/a/a/m2/a0;

    sget-object v1, Lc/a/a/a/f2/m0/k;->a:[B

    const/16 v2, 0xa

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lc/a/a/a/m2/a0;-><init>([B)V

    iput-object v0, p0, Lc/a/a/a/f2/m0/k;->d:Lc/a/a/a/m2/a0;

    .line 5
    invoke-direct {p0}, Lc/a/a/a/f2/m0/k;->s()V

    const/4 v0, -0x1

    .line 6
    iput v0, p0, Lc/a/a/a/f2/m0/k;->n:I

    .line 7
    iput v0, p0, Lc/a/a/a/f2/m0/k;->o:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    iput-wide v0, p0, Lc/a/a/a/f2/m0/k;->r:J

    .line 9
    iput-boolean p1, p0, Lc/a/a/a/f2/m0/k;->b:Z

    .line 10
    iput-object p2, p0, Lc/a/a/a/f2/m0/k;->e:Ljava/lang/String;

    return-void
.end method

.method private b()V
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "output",
            "currentOutput",
            "id3Output"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/m0/k;->g:Lc/a/a/a/f2/b0;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/m0/k;->u:Lc/a/a/a/f2/b0;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v0, p0, Lc/a/a/a/f2/m0/k;->h:Lc/a/a/a/f2/b0;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private g(Lc/a/a/a/m2/a0;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->a()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lc/a/a/a/f2/m0/k;->c:Lc/a/a/a/m2/z;

    iget-object v0, v0, Lc/a/a/a/m2/z;->a:[B

    const/4 v1, 0x0

    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v2

    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->e()I

    move-result p1

    aget-byte p1, v2, p1

    aput-byte p1, v0, v1

    .line 3
    iget-object p1, p0, Lc/a/a/a/f2/m0/k;->c:Lc/a/a/a/m2/z;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lc/a/a/a/m2/z;->p(I)V

    .line 4
    iget-object p1, p0, Lc/a/a/a/f2/m0/k;->c:Lc/a/a/a/m2/z;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lc/a/a/a/m2/z;->h(I)I

    move-result p1

    .line 5
    iget v0, p0, Lc/a/a/a/f2/m0/k;->o:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    if-eq p1, v0, :cond_1

    .line 6
    invoke-direct {p0}, Lc/a/a/a/f2/m0/k;->q()V

    return-void

    .line 7
    :cond_1
    iget-boolean v0, p0, Lc/a/a/a/f2/m0/k;->m:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lc/a/a/a/f2/m0/k;->m:Z

    .line 9
    iget v0, p0, Lc/a/a/a/f2/m0/k;->p:I

    iput v0, p0, Lc/a/a/a/f2/m0/k;->n:I

    .line 10
    iput p1, p0, Lc/a/a/a/f2/m0/k;->o:I

    .line 11
    :cond_2
    invoke-direct {p0}, Lc/a/a/a/f2/m0/k;->t()V

    return-void
.end method

.method private h(Lc/a/a/a/m2/a0;I)Z
    .locals 8

    add-int/lit8 v0, p2, 0x1

    .line 1
    invoke-virtual {p1, v0}, Lc/a/a/a/m2/a0;->P(I)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/m0/k;->c:Lc/a/a/a/m2/z;

    iget-object v0, v0, Lc/a/a/a/m2/z;->a:[B

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Lc/a/a/a/f2/m0/k;->w(Lc/a/a/a/m2/a0;[BI)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return v2

    .line 3
    :cond_0
    iget-object v0, p0, Lc/a/a/a/f2/m0/k;->c:Lc/a/a/a/m2/z;

    const/4 v3, 0x4

    invoke-virtual {v0, v3}, Lc/a/a/a/m2/z;->p(I)V

    .line 4
    iget-object v0, p0, Lc/a/a/a/f2/m0/k;->c:Lc/a/a/a/m2/z;

    invoke-virtual {v0, v1}, Lc/a/a/a/m2/z;->h(I)I

    move-result v0

    .line 5
    iget v4, p0, Lc/a/a/a/f2/m0/k;->n:I

    const/4 v5, -0x1

    if-eq v4, v5, :cond_1

    if-eq v0, v4, :cond_1

    return v2

    .line 6
    :cond_1
    iget v4, p0, Lc/a/a/a/f2/m0/k;->o:I

    const/4 v6, 0x2

    if-eq v4, v5, :cond_4

    .line 7
    iget-object v4, p0, Lc/a/a/a/f2/m0/k;->c:Lc/a/a/a/m2/z;

    iget-object v4, v4, Lc/a/a/a/m2/z;->a:[B

    invoke-direct {p0, p1, v4, v1}, Lc/a/a/a/f2/m0/k;->w(Lc/a/a/a/m2/a0;[BI)Z

    move-result v4

    if-nez v4, :cond_2

    return v1

    .line 8
    :cond_2
    iget-object v4, p0, Lc/a/a/a/f2/m0/k;->c:Lc/a/a/a/m2/z;

    invoke-virtual {v4, v6}, Lc/a/a/a/m2/z;->p(I)V

    .line 9
    iget-object v4, p0, Lc/a/a/a/f2/m0/k;->c:Lc/a/a/a/m2/z;

    invoke-virtual {v4, v3}, Lc/a/a/a/m2/z;->h(I)I

    move-result v4

    .line 10
    iget v7, p0, Lc/a/a/a/f2/m0/k;->o:I

    if-eq v4, v7, :cond_3

    return v2

    :cond_3
    add-int/lit8 v4, p2, 0x2

    .line 11
    invoke-virtual {p1, v4}, Lc/a/a/a/m2/a0;->P(I)V

    .line 12
    :cond_4
    iget-object v4, p0, Lc/a/a/a/f2/m0/k;->c:Lc/a/a/a/m2/z;

    iget-object v4, v4, Lc/a/a/a/m2/z;->a:[B

    invoke-direct {p0, p1, v4, v3}, Lc/a/a/a/f2/m0/k;->w(Lc/a/a/a/m2/a0;[BI)Z

    move-result v3

    if-nez v3, :cond_5

    return v1

    .line 13
    :cond_5
    iget-object v3, p0, Lc/a/a/a/f2/m0/k;->c:Lc/a/a/a/m2/z;

    const/16 v4, 0xe

    invoke-virtual {v3, v4}, Lc/a/a/a/m2/z;->p(I)V

    .line 14
    iget-object v3, p0, Lc/a/a/a/f2/m0/k;->c:Lc/a/a/a/m2/z;

    const/16 v4, 0xd

    invoke-virtual {v3, v4}, Lc/a/a/a/m2/z;->h(I)I

    move-result v3

    const/4 v4, 0x7

    if-ge v3, v4, :cond_6

    return v2

    .line 15
    :cond_6
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v4

    .line 16
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->f()I

    move-result p1

    add-int/2addr p2, v3

    if-lt p2, p1, :cond_7

    return v1

    .line 17
    :cond_7
    aget-byte v3, v4, p2

    if-ne v3, v5, :cond_a

    add-int/2addr p2, v1

    if-ne p2, p1, :cond_8

    return v1

    .line 18
    :cond_8
    aget-byte p1, v4, p2

    invoke-direct {p0, v5, p1}, Lc/a/a/a/f2/m0/k;->l(BB)Z

    move-result p1

    if-eqz p1, :cond_9

    aget-byte p1, v4, p2

    and-int/lit8 p1, p1, 0x8

    shr-int/lit8 p1, p1, 0x3

    if-ne p1, v0, :cond_9

    goto :goto_0

    :cond_9
    const/4 v1, 0x0

    :goto_0
    return v1

    .line 19
    :cond_a
    aget-byte v0, v4, p2

    const/16 v3, 0x49

    if-eq v0, v3, :cond_b

    return v2

    :cond_b
    add-int/lit8 v0, p2, 0x1

    if-ne v0, p1, :cond_c

    return v1

    .line 20
    :cond_c
    aget-byte v0, v4, v0

    const/16 v3, 0x44

    if-eq v0, v3, :cond_d

    return v2

    :cond_d
    add-int/2addr p2, v6

    if-ne p2, p1, :cond_e

    return v1

    .line 21
    :cond_e
    aget-byte p1, v4, p2

    const/16 p2, 0x33

    if-ne p1, p2, :cond_f

    goto :goto_1

    :cond_f
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method private i(Lc/a/a/a/m2/a0;[BI)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->a()I

    move-result v0

    iget v1, p0, Lc/a/a/a/f2/m0/k;->j:I

    sub-int v1, p3, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 2
    iget v1, p0, Lc/a/a/a/f2/m0/k;->j:I

    invoke-virtual {p1, p2, v1, v0}, Lc/a/a/a/m2/a0;->j([BII)V

    .line 3
    iget p1, p0, Lc/a/a/a/f2/m0/k;->j:I

    add-int/2addr p1, v0

    iput p1, p0, Lc/a/a/a/f2/m0/k;->j:I

    if-ne p1, p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private j(Lc/a/a/a/m2/a0;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->e()I

    move-result v1

    .line 3
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->f()I

    move-result v2

    :goto_0
    if-ge v1, v2, :cond_9

    add-int/lit8 v3, v1, 0x1

    .line 4
    aget-byte v1, v0, v1

    and-int/lit16 v1, v1, 0xff

    .line 5
    iget v4, p0, Lc/a/a/a/f2/m0/k;->k:I

    const/16 v5, 0x200

    if-ne v4, v5, :cond_3

    int-to-byte v4, v1

    const/4 v6, -0x1

    invoke-direct {p0, v6, v4}, Lc/a/a/a/f2/m0/k;->l(BB)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 6
    iget-boolean v4, p0, Lc/a/a/a/f2/m0/k;->m:Z

    if-nez v4, :cond_0

    add-int/lit8 v4, v3, -0x2

    .line 7
    invoke-direct {p0, p1, v4}, Lc/a/a/a/f2/m0/k;->h(Lc/a/a/a/m2/a0;I)Z

    move-result v4

    if-eqz v4, :cond_3

    :cond_0
    and-int/lit8 v0, v1, 0x8

    shr-int/lit8 v0, v0, 0x3

    .line 8
    iput v0, p0, Lc/a/a/a/f2/m0/k;->p:I

    const/4 v0, 0x1

    and-int/2addr v1, v0

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 9
    :goto_1
    iput-boolean v0, p0, Lc/a/a/a/f2/m0/k;->l:Z

    .line 10
    iget-boolean v0, p0, Lc/a/a/a/f2/m0/k;->m:Z

    if-nez v0, :cond_2

    .line 11
    invoke-direct {p0}, Lc/a/a/a/f2/m0/k;->r()V

    goto :goto_2

    .line 12
    :cond_2
    invoke-direct {p0}, Lc/a/a/a/f2/m0/k;->t()V

    .line 13
    :goto_2
    invoke-virtual {p1, v3}, Lc/a/a/a/m2/a0;->P(I)V

    return-void

    .line 14
    :cond_3
    iget v4, p0, Lc/a/a/a/f2/m0/k;->k:I

    or-int/2addr v1, v4

    const/16 v6, 0x149

    if-eq v1, v6, :cond_7

    const/16 v6, 0x1ff

    if-eq v1, v6, :cond_6

    const/16 v5, 0x344

    if-eq v1, v5, :cond_5

    const/16 v5, 0x433

    if-eq v1, v5, :cond_4

    const/16 v1, 0x100

    if-eq v4, v1, :cond_8

    .line 15
    iput v1, p0, Lc/a/a/a/f2/m0/k;->k:I

    add-int/lit8 v3, v3, -0x1

    goto :goto_3

    .line 16
    :cond_4
    invoke-direct {p0}, Lc/a/a/a/f2/m0/k;->u()V

    .line 17
    invoke-virtual {p1, v3}, Lc/a/a/a/m2/a0;->P(I)V

    return-void

    :cond_5
    const/16 v1, 0x400

    .line 18
    iput v1, p0, Lc/a/a/a/f2/m0/k;->k:I

    goto :goto_3

    .line 19
    :cond_6
    iput v5, p0, Lc/a/a/a/f2/m0/k;->k:I

    goto :goto_3

    :cond_7
    const/16 v1, 0x300

    .line 20
    iput v1, p0, Lc/a/a/a/f2/m0/k;->k:I

    :cond_8
    :goto_3
    move v1, v3

    goto :goto_0

    .line 21
    :cond_9
    invoke-virtual {p1, v1}, Lc/a/a/a/m2/a0;->P(I)V

    return-void
.end method

.method private l(BB)Z
    .locals 0

    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 p1, p1, 0x8

    and-int/lit16 p2, p2, 0xff

    or-int/2addr p1, p2

    .line 1
    invoke-static {p1}, Lc/a/a/a/f2/m0/k;->m(I)Z

    move-result p1

    return p1
.end method

.method public static m(I)Z
    .locals 1

    const v0, 0xfff6

    and-int/2addr p0, v0

    const v0, 0xfff0

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private n()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "output"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/m0/k;->c:Lc/a/a/a/m2/z;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lc/a/a/a/m2/z;->p(I)V

    .line 2
    iget-boolean v0, p0, Lc/a/a/a/f2/m0/k;->q:Z

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Lc/a/a/a/f2/m0/k;->c:Lc/a/a/a/m2/z;

    invoke-virtual {v0, v2}, Lc/a/a/a/m2/z;->h(I)I

    move-result v0

    const/4 v3, 0x1

    add-int/2addr v0, v3

    if-eq v0, v2, :cond_0

    .line 4
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Detected audio object type: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", but assuming AAC LC."

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "AdtsReader"

    invoke-static {v4, v0}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 5
    :cond_0
    iget-object v4, p0, Lc/a/a/a/f2/m0/k;->c:Lc/a/a/a/m2/z;

    invoke-virtual {v4, v1}, Lc/a/a/a/m2/z;->r(I)V

    .line 6
    iget-object v4, p0, Lc/a/a/a/f2/m0/k;->c:Lc/a/a/a/m2/z;

    const/4 v5, 0x3

    invoke-virtual {v4, v5}, Lc/a/a/a/m2/z;->h(I)I

    move-result v4

    .line 7
    iget v5, p0, Lc/a/a/a/f2/m0/k;->o:I

    .line 8
    invoke-static {v0, v5, v4}, Lc/a/a/a/b2/k;->a(III)[B

    move-result-object v0

    .line 9
    invoke-static {v0}, Lc/a/a/a/b2/k;->f([B)Lc/a/a/a/b2/k$b;

    move-result-object v4

    .line 10
    new-instance v5, Lc/a/a/a/u0$b;

    invoke-direct {v5}, Lc/a/a/a/u0$b;-><init>()V

    iget-object v6, p0, Lc/a/a/a/f2/m0/k;->f:Ljava/lang/String;

    .line 11
    invoke-virtual {v5, v6}, Lc/a/a/a/u0$b;->S(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v5

    const-string v6, "audio/mp4a-latm"

    .line 12
    invoke-virtual {v5, v6}, Lc/a/a/a/u0$b;->e0(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v5

    iget-object v6, v4, Lc/a/a/a/b2/k$b;->c:Ljava/lang/String;

    .line 13
    invoke-virtual {v5, v6}, Lc/a/a/a/u0$b;->I(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v5

    iget v6, v4, Lc/a/a/a/b2/k$b;->b:I

    .line 14
    invoke-virtual {v5, v6}, Lc/a/a/a/u0$b;->H(I)Lc/a/a/a/u0$b;

    move-result-object v5

    iget v4, v4, Lc/a/a/a/b2/k$b;->a:I

    .line 15
    invoke-virtual {v5, v4}, Lc/a/a/a/u0$b;->f0(I)Lc/a/a/a/u0$b;

    move-result-object v4

    .line 16
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lc/a/a/a/u0$b;->T(Ljava/util/List;)Lc/a/a/a/u0$b;

    move-result-object v0

    iget-object v4, p0, Lc/a/a/a/f2/m0/k;->e:Ljava/lang/String;

    .line 17
    invoke-virtual {v0, v4}, Lc/a/a/a/u0$b;->V(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object v0

    const-wide/32 v4, 0x3d090000

    .line 19
    iget v6, v0, Lc/a/a/a/u0;->z:I

    int-to-long v6, v6

    div-long/2addr v4, v6

    iput-wide v4, p0, Lc/a/a/a/f2/m0/k;->r:J

    .line 20
    iget-object v4, p0, Lc/a/a/a/f2/m0/k;->g:Lc/a/a/a/f2/b0;

    invoke-interface {v4, v0}, Lc/a/a/a/f2/b0;->d(Lc/a/a/a/u0;)V

    .line 21
    iput-boolean v3, p0, Lc/a/a/a/f2/m0/k;->q:Z

    goto :goto_0

    .line 22
    :cond_1
    iget-object v0, p0, Lc/a/a/a/f2/m0/k;->c:Lc/a/a/a/m2/z;

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Lc/a/a/a/m2/z;->r(I)V

    .line 23
    :goto_0
    iget-object v0, p0, Lc/a/a/a/f2/m0/k;->c:Lc/a/a/a/m2/z;

    const/4 v3, 0x4

    invoke-virtual {v0, v3}, Lc/a/a/a/m2/z;->r(I)V

    .line 24
    iget-object v0, p0, Lc/a/a/a/f2/m0/k;->c:Lc/a/a/a/m2/z;

    const/16 v3, 0xd

    invoke-virtual {v0, v3}, Lc/a/a/a/m2/z;->h(I)I

    move-result v0

    sub-int/2addr v0, v2

    sub-int/2addr v0, v1

    .line 25
    iget-boolean v1, p0, Lc/a/a/a/f2/m0/k;->l:Z

    if-eqz v1, :cond_2

    add-int/lit8 v0, v0, -0x2

    :cond_2
    move v6, v0

    .line 26
    iget-object v2, p0, Lc/a/a/a/f2/m0/k;->g:Lc/a/a/a/f2/b0;

    iget-wide v3, p0, Lc/a/a/a/f2/m0/k;->r:J

    const/4 v5, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lc/a/a/a/f2/m0/k;->v(Lc/a/a/a/f2/b0;JII)V

    return-void
.end method

.method private o()V
    .locals 9
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "id3Output"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/m0/k;->h:Lc/a/a/a/f2/b0;

    iget-object v1, p0, Lc/a/a/a/f2/m0/k;->d:Lc/a/a/a/m2/a0;

    const/16 v2, 0xa

    invoke-interface {v0, v1, v2}, Lc/a/a/a/f2/b0;->a(Lc/a/a/a/m2/a0;I)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/m0/k;->d:Lc/a/a/a/m2/a0;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lc/a/a/a/m2/a0;->P(I)V

    .line 3
    iget-object v4, p0, Lc/a/a/a/f2/m0/k;->h:Lc/a/a/a/f2/b0;

    iget-object v0, p0, Lc/a/a/a/f2/m0/k;->d:Lc/a/a/a/m2/a0;

    .line 4
    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->C()I

    move-result v0

    add-int/lit8 v8, v0, 0xa

    const-wide/16 v5, 0x0

    const/16 v7, 0xa

    move-object v3, p0

    .line 5
    invoke-direct/range {v3 .. v8}, Lc/a/a/a/f2/m0/k;->v(Lc/a/a/a/f2/b0;JII)V

    return-void
.end method

.method private p(Lc/a/a/a/m2/a0;)V
    .locals 7
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "currentOutput"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->a()I

    move-result v0

    iget v1, p0, Lc/a/a/a/f2/m0/k;->s:I

    iget v2, p0, Lc/a/a/a/f2/m0/k;->j:I

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 2
    iget-object v1, p0, Lc/a/a/a/f2/m0/k;->u:Lc/a/a/a/f2/b0;

    invoke-interface {v1, p1, v0}, Lc/a/a/a/f2/b0;->a(Lc/a/a/a/m2/a0;I)V

    .line 3
    iget p1, p0, Lc/a/a/a/f2/m0/k;->j:I

    add-int/2addr p1, v0

    iput p1, p0, Lc/a/a/a/f2/m0/k;->j:I

    .line 4
    iget v4, p0, Lc/a/a/a/f2/m0/k;->s:I

    if-ne p1, v4, :cond_0

    .line 5
    iget-object v0, p0, Lc/a/a/a/f2/m0/k;->u:Lc/a/a/a/f2/b0;

    iget-wide v1, p0, Lc/a/a/a/f2/m0/k;->t:J

    const/4 v3, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-interface/range {v0 .. v6}, Lc/a/a/a/f2/b0;->c(JIIILc/a/a/a/f2/b0$a;)V

    .line 6
    iget-wide v0, p0, Lc/a/a/a/f2/m0/k;->t:J

    iget-wide v2, p0, Lc/a/a/a/f2/m0/k;->v:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lc/a/a/a/f2/m0/k;->t:J

    .line 7
    invoke-direct {p0}, Lc/a/a/a/f2/m0/k;->s()V

    :cond_0
    return-void
.end method

.method private q()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/f2/m0/k;->m:Z

    .line 2
    invoke-direct {p0}, Lc/a/a/a/f2/m0/k;->s()V

    return-void
.end method

.method private r()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput v0, p0, Lc/a/a/a/f2/m0/k;->i:I

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lc/a/a/a/f2/m0/k;->j:I

    return-void
.end method

.method private s()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lc/a/a/a/f2/m0/k;->i:I

    .line 2
    iput v0, p0, Lc/a/a/a/f2/m0/k;->j:I

    const/16 v0, 0x100

    .line 3
    iput v0, p0, Lc/a/a/a/f2/m0/k;->k:I

    return-void
.end method

.method private t()V
    .locals 1

    const/4 v0, 0x3

    .line 1
    iput v0, p0, Lc/a/a/a/f2/m0/k;->i:I

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lc/a/a/a/f2/m0/k;->j:I

    return-void
.end method

.method private u()V
    .locals 2

    const/4 v0, 0x2

    .line 1
    iput v0, p0, Lc/a/a/a/f2/m0/k;->i:I

    .line 2
    sget-object v0, Lc/a/a/a/f2/m0/k;->a:[B

    array-length v0, v0

    iput v0, p0, Lc/a/a/a/f2/m0/k;->j:I

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lc/a/a/a/f2/m0/k;->s:I

    .line 4
    iget-object v1, p0, Lc/a/a/a/f2/m0/k;->d:Lc/a/a/a/m2/a0;

    invoke-virtual {v1, v0}, Lc/a/a/a/m2/a0;->P(I)V

    return-void
.end method

.method private v(Lc/a/a/a/f2/b0;JII)V
    .locals 1

    const/4 v0, 0x4

    .line 1
    iput v0, p0, Lc/a/a/a/f2/m0/k;->i:I

    .line 2
    iput p4, p0, Lc/a/a/a/f2/m0/k;->j:I

    .line 3
    iput-object p1, p0, Lc/a/a/a/f2/m0/k;->u:Lc/a/a/a/f2/b0;

    .line 4
    iput-wide p2, p0, Lc/a/a/a/f2/m0/k;->v:J

    .line 5
    iput p5, p0, Lc/a/a/a/f2/m0/k;->s:I

    return-void
.end method

.method private w(Lc/a/a/a/m2/a0;[BI)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ge v0, p3, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {p1, p2, v1, p3}, Lc/a/a/a/m2/a0;->j([BII)V

    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/a/a/a/f2/m0/k;->q()V

    return-void
.end method

.method public c(Lc/a/a/a/m2/a0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lc/a/a/a/f2/m0/k;->b()V

    .line 2
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->a()I

    move-result v0

    if-lez v0, :cond_7

    .line 3
    iget v0, p0, Lc/a/a/a/f2/m0/k;->i:I

    if-eqz v0, :cond_6

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 4
    invoke-direct {p0, p1}, Lc/a/a/a/f2/m0/k;->p(Lc/a/a/a/m2/a0;)V

    goto :goto_0

    .line 5
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 6
    :cond_2
    iget-boolean v0, p0, Lc/a/a/a/f2/m0/k;->l:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x7

    goto :goto_1

    :cond_3
    const/4 v0, 0x5

    .line 7
    :goto_1
    iget-object v1, p0, Lc/a/a/a/f2/m0/k;->c:Lc/a/a/a/m2/z;

    iget-object v1, v1, Lc/a/a/a/m2/z;->a:[B

    invoke-direct {p0, p1, v1, v0}, Lc/a/a/a/f2/m0/k;->i(Lc/a/a/a/m2/a0;[BI)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    invoke-direct {p0}, Lc/a/a/a/f2/m0/k;->n()V

    goto :goto_0

    .line 9
    :cond_4
    iget-object v0, p0, Lc/a/a/a/f2/m0/k;->d:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    const/16 v1, 0xa

    invoke-direct {p0, p1, v0, v1}, Lc/a/a/a/f2/m0/k;->i(Lc/a/a/a/m2/a0;[BI)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10
    invoke-direct {p0}, Lc/a/a/a/f2/m0/k;->o()V

    goto :goto_0

    .line 11
    :cond_5
    invoke-direct {p0, p1}, Lc/a/a/a/f2/m0/k;->g(Lc/a/a/a/m2/a0;)V

    goto :goto_0

    .line 12
    :cond_6
    invoke-direct {p0, p1}, Lc/a/a/a/f2/m0/k;->j(Lc/a/a/a/m2/a0;)V

    goto :goto_0

    :cond_7
    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e(JI)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lc/a/a/a/f2/m0/k;->t:J

    return-void
.end method

.method public f(Lc/a/a/a/f2/l;Lc/a/a/a/f2/m0/i0$d;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lc/a/a/a/f2/m0/i0$d;->a()V

    .line 2
    invoke-virtual {p2}, Lc/a/a/a/f2/m0/i0$d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/f2/m0/k;->f:Ljava/lang/String;

    .line 3
    invoke-virtual {p2}, Lc/a/a/a/f2/m0/i0$d;->c()I

    move-result v0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lc/a/a/a/f2/l;->q(II)Lc/a/a/a/f2/b0;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/f2/m0/k;->g:Lc/a/a/a/f2/b0;

    .line 4
    iput-object v0, p0, Lc/a/a/a/f2/m0/k;->u:Lc/a/a/a/f2/b0;

    .line 5
    iget-boolean v0, p0, Lc/a/a/a/f2/m0/k;->b:Z

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {p2}, Lc/a/a/a/f2/m0/i0$d;->a()V

    .line 7
    invoke-virtual {p2}, Lc/a/a/a/f2/m0/i0$d;->c()I

    move-result v0

    const/4 v1, 0x5

    invoke-interface {p1, v0, v1}, Lc/a/a/a/f2/l;->q(II)Lc/a/a/a/f2/b0;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/f2/m0/k;->h:Lc/a/a/a/f2/b0;

    .line 8
    new-instance v0, Lc/a/a/a/u0$b;

    invoke-direct {v0}, Lc/a/a/a/u0$b;-><init>()V

    .line 9
    invoke-virtual {p2}, Lc/a/a/a/f2/m0/i0$d;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lc/a/a/a/u0$b;->S(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object p2

    const-string v0, "application/id3"

    .line 10
    invoke-virtual {p2, v0}, Lc/a/a/a/u0$b;->e0(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object p2

    .line 11
    invoke-virtual {p2}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object p2

    .line 12
    invoke-interface {p1, p2}, Lc/a/a/a/f2/b0;->d(Lc/a/a/a/u0;)V

    goto :goto_0

    .line 13
    :cond_0
    new-instance p1, Lc/a/a/a/f2/i;

    invoke-direct {p1}, Lc/a/a/a/f2/i;-><init>()V

    iput-object p1, p0, Lc/a/a/a/f2/m0/k;->h:Lc/a/a/a/f2/b0;

    :goto_0
    return-void
.end method

.method public k()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/f2/m0/k;->r:J

    return-wide v0
.end method
