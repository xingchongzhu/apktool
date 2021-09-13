.class public final Lc/a/a/a/f2/e0/b;
.super Ljava/lang/Object;
.source "AmrExtractor.java"

# interfaces
.implements Lc/a/a/a/f2/j;


# static fields
.field public static final a:Lc/a/a/a/f2/o;

.field private static final b:[I

.field private static final c:[I

.field private static final d:[B

.field private static final e:[B

.field private static final f:I


# instance fields
.field private final g:[B

.field private final h:I

.field private i:Z

.field private j:J

.field private k:I

.field private l:I

.field private m:Z

.field private n:J

.field private o:I

.field private p:I

.field private q:J

.field private r:Lc/a/a/a/f2/l;

.field private s:Lc/a/a/a/f2/b0;

.field private t:Lc/a/a/a/f2/y;

.field private u:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lc/a/a/a/f2/e0/a;->b:Lc/a/a/a/f2/e0/a;

    sput-object v0, Lc/a/a/a/f2/e0/b;->a:Lc/a/a/a/f2/o;

    const/16 v0, 0x10

    new-array v1, v0, [I

    .line 2
    fill-array-data v1, :array_0

    sput-object v1, Lc/a/a/a/f2/e0/b;->b:[I

    new-array v0, v0, [I

    .line 3
    fill-array-data v0, :array_1

    sput-object v0, Lc/a/a/a/f2/e0/b;->c:[I

    const-string v1, "#!AMR\n"

    .line 4
    invoke-static {v1}, Lc/a/a/a/m2/m0;->g0(Ljava/lang/String;)[B

    move-result-object v1

    sput-object v1, Lc/a/a/a/f2/e0/b;->d:[B

    const-string v1, "#!AMR-WB\n"

    .line 5
    invoke-static {v1}, Lc/a/a/a/m2/m0;->g0(Ljava/lang/String;)[B

    move-result-object v1

    sput-object v1, Lc/a/a/a/f2/e0/b;->e:[B

    const/16 v1, 0x8

    .line 6
    aget v0, v0, v1

    sput v0, Lc/a/a/a/f2/e0/b;->f:I

    return-void

    nop

    :array_0
    .array-data 4
        0xd
        0xe
        0x10
        0x12
        0x14
        0x15
        0x1b
        0x20
        0x6
        0x7
        0x6
        0x6
        0x1
        0x1
        0x1
        0x1
    .end array-data

    :array_1
    .array-data 4
        0x12
        0x18
        0x21
        0x25
        0x29
        0x2f
        0x33
        0x3b
        0x3d
        0x6
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lc/a/a/a/f2/e0/b;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lc/a/a/a/f2/e0/b;->h:I

    const/4 p1, 0x1

    new-array p1, p1, [B

    .line 4
    iput-object p1, p0, Lc/a/a/a/f2/e0/b;->g:[B

    const/4 p1, -0x1

    .line 5
    iput p1, p0, Lc/a/a/a/f2/e0/b;->o:I

    return-void
.end method

.method private d()V
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "extractorOutput",
            "trackOutput"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/e0/b;->s:Lc/a/a/a/f2/b0;

    invoke-static {v0}, Lc/a/a/a/m2/f;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/e0/b;->r:Lc/a/a/a/f2/l;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static f(IJ)I
    .locals 4

    mul-int/lit8 p0, p0, 0x8

    int-to-long v0, p0

    const-wide/32 v2, 0xf4240

    mul-long v0, v0, v2

    .line 1
    div-long/2addr v0, p1

    long-to-int p0, v0

    return p0
.end method

.method private g(J)Lc/a/a/a/f2/y;
    .locals 10

    .line 1
    iget v0, p0, Lc/a/a/a/f2/e0/b;->o:I

    const-wide/16 v1, 0x4e20

    invoke-static {v0, v1, v2}, Lc/a/a/a/f2/e0/b;->f(IJ)I

    move-result v8

    .line 2
    new-instance v0, Lc/a/a/a/f2/f;

    iget-wide v6, p0, Lc/a/a/a/f2/e0/b;->n:J

    iget v9, p0, Lc/a/a/a/f2/e0/b;->o:I

    move-object v3, v0

    move-wide v4, p1

    invoke-direct/range {v3 .. v9}, Lc/a/a/a/f2/f;-><init>(JJII)V

    return-object v0
.end method

.method private h(I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lc/a/a/a/f2/e0/b;->k(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    new-instance v0, Lc/a/a/a/g1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Illegal AMR "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    iget-boolean v2, p0, Lc/a/a/a/f2/e0/b;->i:Z

    if-eqz v2, :cond_0

    const-string v2, "WB"

    goto :goto_0

    :cond_0
    const-string v2, "NB"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " frame type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4
    :cond_1
    iget-boolean v0, p0, Lc/a/a/a/f2/e0/b;->i:Z

    if-eqz v0, :cond_2

    sget-object v0, Lc/a/a/a/f2/e0/b;->c:[I

    aget p1, v0, p1

    goto :goto_1

    :cond_2
    sget-object v0, Lc/a/a/a/f2/e0/b;->b:[I

    aget p1, v0, p1

    :goto_1
    return p1
.end method

.method private j(I)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/f2/e0/b;->i:Z

    if-nez v0, :cond_1

    const/16 v0, 0xc

    if-lt p1, v0, :cond_0

    const/16 v0, 0xe

    if-le p1, v0, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private k(I)Z
    .locals 1

    if-ltz p1, :cond_1

    const/16 v0, 0xf

    if-gt p1, v0, :cond_1

    .line 1
    invoke-direct {p0, p1}, Lc/a/a/a/f2/e0/b;->l(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lc/a/a/a/f2/e0/b;->j(I)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private l(I)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/f2/e0/b;->i:Z

    if-eqz v0, :cond_1

    const/16 v0, 0xa

    if-lt p1, v0, :cond_0

    const/16 v0, 0xd

    if-le p1, v0, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method static synthetic m()[Lc/a/a/a/f2/j;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lc/a/a/a/f2/j;

    .line 1
    new-instance v1, Lc/a/a/a/f2/e0/b;

    invoke-direct {v1}, Lc/a/a/a/f2/e0/b;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method private n()V
    .locals 5
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "trackOutput"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/f2/e0/b;->u:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lc/a/a/a/f2/e0/b;->u:Z

    .line 3
    iget-boolean v1, p0, Lc/a/a/a/f2/e0/b;->i:Z

    if-eqz v1, :cond_0

    const-string v2, "audio/amr-wb"

    goto :goto_0

    :cond_0
    const-string v2, "audio/3gpp"

    :goto_0
    if-eqz v1, :cond_1

    const/16 v1, 0x3e80

    goto :goto_1

    :cond_1
    const/16 v1, 0x1f40

    .line 4
    :goto_1
    iget-object v3, p0, Lc/a/a/a/f2/e0/b;->s:Lc/a/a/a/f2/b0;

    new-instance v4, Lc/a/a/a/u0$b;

    invoke-direct {v4}, Lc/a/a/a/u0$b;-><init>()V

    .line 5
    invoke-virtual {v4, v2}, Lc/a/a/a/u0$b;->e0(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v2

    sget v4, Lc/a/a/a/f2/e0/b;->f:I

    .line 6
    invoke-virtual {v2, v4}, Lc/a/a/a/u0$b;->W(I)Lc/a/a/a/u0$b;

    move-result-object v2

    .line 7
    invoke-virtual {v2, v0}, Lc/a/a/a/u0$b;->H(I)Lc/a/a/a/u0$b;

    move-result-object v0

    .line 8
    invoke-virtual {v0, v1}, Lc/a/a/a/u0$b;->f0(I)Lc/a/a/a/u0$b;

    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object v0

    .line 10
    invoke-interface {v3, v0}, Lc/a/a/a/f2/b0;->d(Lc/a/a/a/u0;)V

    :cond_2
    return-void
.end method

.method private o(JI)V
    .locals 4
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "extractorOutput"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/f2/e0/b;->m:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget v0, p0, Lc/a/a/a/f2/e0/b;->h:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_3

    const-wide/16 v2, -0x1

    cmp-long v0, p1, v2

    if-eqz v0, :cond_3

    iget v0, p0, Lc/a/a/a/f2/e0/b;->o:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    iget v3, p0, Lc/a/a/a/f2/e0/b;->k:I

    if-eq v0, v3, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    iget v0, p0, Lc/a/a/a/f2/e0/b;->p:I

    const/16 v3, 0x14

    if-ge v0, v3, :cond_2

    if-ne p3, v2, :cond_4

    .line 4
    :cond_2
    invoke-direct {p0, p1, p2}, Lc/a/a/a/f2/e0/b;->g(J)Lc/a/a/a/f2/y;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/f2/e0/b;->t:Lc/a/a/a/f2/y;

    .line 5
    iget-object p2, p0, Lc/a/a/a/f2/e0/b;->r:Lc/a/a/a/f2/l;

    invoke-interface {p2, p1}, Lc/a/a/a/f2/l;->f(Lc/a/a/a/f2/y;)V

    .line 6
    iput-boolean v1, p0, Lc/a/a/a/f2/e0/b;->m:Z

    goto :goto_1

    .line 7
    :cond_3
    :goto_0
    new-instance p1, Lc/a/a/a/f2/y$b;

    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {p1, p2, p3}, Lc/a/a/a/f2/y$b;-><init>(J)V

    iput-object p1, p0, Lc/a/a/a/f2/e0/b;->t:Lc/a/a/a/f2/y;

    .line 8
    iget-object p2, p0, Lc/a/a/a/f2/e0/b;->r:Lc/a/a/a/f2/l;

    invoke-interface {p2, p1}, Lc/a/a/a/f2/l;->f(Lc/a/a/a/f2/y;)V

    .line 9
    iput-boolean v1, p0, Lc/a/a/a/f2/e0/b;->m:Z

    :cond_4
    :goto_1
    return-void
.end method

.method private static p(Lc/a/a/a/f2/k;[B)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lc/a/a/a/f2/k;->h()V

    .line 2
    array-length v0, p1

    new-array v0, v0, [B

    .line 3
    array-length v1, p1

    const/4 v2, 0x0

    invoke-interface {p0, v0, v2, v1}, Lc/a/a/a/f2/k;->o([BII)V

    .line 4
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    return p0
.end method

.method private q(Lc/a/a/a/f2/k;)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lc/a/a/a/f2/k;->h()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/e0/b;->g:[B

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {p1, v0, v1, v2}, Lc/a/a/a/f2/k;->o([BII)V

    .line 3
    iget-object p1, p0, Lc/a/a/a/f2/e0/b;->g:[B

    aget-byte p1, p1, v1

    and-int/lit16 v0, p1, 0x83

    if-gtz v0, :cond_0

    shr-int/lit8 p1, p1, 0x3

    and-int/lit8 p1, p1, 0xf

    .line 4
    invoke-direct {p0, p1}, Lc/a/a/a/f2/e0/b;->h(I)I

    move-result p1

    return p1

    .line 5
    :cond_0
    new-instance v0, Lc/a/a/a/g1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid padding bits for frame header "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private r(Lc/a/a/a/f2/k;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lc/a/a/a/f2/e0/b;->d:[B

    invoke-static {p1, v0}, Lc/a/a/a/f2/e0/b;->p(Lc/a/a/a/f2/k;[B)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    .line 2
    iput-boolean v2, p0, Lc/a/a/a/f2/e0/b;->i:Z

    .line 3
    array-length v0, v0

    invoke-interface {p1, v0}, Lc/a/a/a/f2/k;->i(I)V

    return v3

    .line 4
    :cond_0
    sget-object v0, Lc/a/a/a/f2/e0/b;->e:[B

    invoke-static {p1, v0}, Lc/a/a/a/f2/e0/b;->p(Lc/a/a/a/f2/k;[B)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    iput-boolean v3, p0, Lc/a/a/a/f2/e0/b;->i:Z

    .line 6
    array-length v0, v0

    invoke-interface {p1, v0}, Lc/a/a/a/f2/k;->i(I)V

    return v3

    :cond_1
    return v2
.end method

.method private s(Lc/a/a/a/f2/k;)I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "trackOutput"
        }
    .end annotation

    .line 1
    iget v0, p0, Lc/a/a/a/f2/e0/b;->l:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-nez v0, :cond_1

    .line 2
    :try_start_0
    invoke-direct {p0, p1}, Lc/a/a/a/f2/e0/b;->q(Lc/a/a/a/f2/k;)I

    move-result v0

    iput v0, p0, Lc/a/a/a/f2/e0/b;->k:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    iput v0, p0, Lc/a/a/a/f2/e0/b;->l:I

    .line 4
    iget v0, p0, Lc/a/a/a/f2/e0/b;->o:I

    if-ne v0, v2, :cond_0

    .line 5
    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v3

    iput-wide v3, p0, Lc/a/a/a/f2/e0/b;->n:J

    .line 6
    iget v0, p0, Lc/a/a/a/f2/e0/b;->k:I

    iput v0, p0, Lc/a/a/a/f2/e0/b;->o:I

    .line 7
    :cond_0
    iget v0, p0, Lc/a/a/a/f2/e0/b;->o:I

    iget v3, p0, Lc/a/a/a/f2/e0/b;->k:I

    if-ne v0, v3, :cond_1

    .line 8
    iget v0, p0, Lc/a/a/a/f2/e0/b;->p:I

    add-int/2addr v0, v1

    iput v0, p0, Lc/a/a/a/f2/e0/b;->p:I

    goto :goto_0

    :catch_0
    return v2

    .line 9
    :cond_1
    :goto_0
    iget-object v0, p0, Lc/a/a/a/f2/e0/b;->s:Lc/a/a/a/f2/b0;

    iget v3, p0, Lc/a/a/a/f2/e0/b;->l:I

    .line 10
    invoke-interface {v0, p1, v3, v1}, Lc/a/a/a/f2/b0;->f(Lcom/google/android/exoplayer2/upstream/j;IZ)I

    move-result p1

    if-ne p1, v2, :cond_2

    return v2

    .line 11
    :cond_2
    iget v0, p0, Lc/a/a/a/f2/e0/b;->l:I

    sub-int/2addr v0, p1

    iput v0, p0, Lc/a/a/a/f2/e0/b;->l:I

    const/4 p1, 0x0

    if-lez v0, :cond_3

    return p1

    .line 12
    :cond_3
    iget-object v1, p0, Lc/a/a/a/f2/e0/b;->s:Lc/a/a/a/f2/b0;

    iget-wide v2, p0, Lc/a/a/a/f2/e0/b;->q:J

    iget-wide v4, p0, Lc/a/a/a/f2/e0/b;->j:J

    add-long/2addr v2, v4

    const/4 v4, 0x1

    iget v5, p0, Lc/a/a/a/f2/e0/b;->k:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-interface/range {v1 .. v7}, Lc/a/a/a/f2/b0;->c(JIIILc/a/a/a/f2/b0$a;)V

    .line 13
    iget-wide v0, p0, Lc/a/a/a/f2/e0/b;->j:J

    const-wide/16 v2, 0x4e20

    add-long/2addr v0, v2

    iput-wide v0, p0, Lc/a/a/a/f2/e0/b;->j:J

    return p1
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(Lc/a/a/a/f2/l;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lc/a/a/a/f2/e0/b;->r:Lc/a/a/a/f2/l;

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 2
    invoke-interface {p1, v0, v1}, Lc/a/a/a/f2/l;->q(II)Lc/a/a/a/f2/b0;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/f2/e0/b;->s:Lc/a/a/a/f2/b0;

    .line 3
    invoke-interface {p1}, Lc/a/a/a/f2/l;->h()V

    return-void
.end method

.method public c(JJ)V
    .locals 2

    const-wide/16 p3, 0x0

    .line 1
    iput-wide p3, p0, Lc/a/a/a/f2/e0/b;->j:J

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lc/a/a/a/f2/e0/b;->k:I

    .line 3
    iput v0, p0, Lc/a/a/a/f2/e0/b;->l:I

    cmp-long v0, p1, p3

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lc/a/a/a/f2/e0/b;->t:Lc/a/a/a/f2/y;

    instance-of v1, v0, Lc/a/a/a/f2/f;

    if-eqz v1, :cond_0

    .line 5
    check-cast v0, Lc/a/a/a/f2/f;

    invoke-virtual {v0, p1, p2}, Lc/a/a/a/f2/f;->b(J)J

    move-result-wide p1

    iput-wide p1, p0, Lc/a/a/a/f2/e0/b;->q:J

    goto :goto_0

    .line 6
    :cond_0
    iput-wide p3, p0, Lc/a/a/a/f2/e0/b;->q:J

    :goto_0
    return-void
.end method

.method public e(Lc/a/a/a/f2/k;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lc/a/a/a/f2/e0/b;->r(Lc/a/a/a/f2/k;)Z

    move-result p1

    return p1
.end method

.method public i(Lc/a/a/a/f2/k;Lc/a/a/a/f2/x;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lc/a/a/a/f2/e0/b;->d()V

    .line 2
    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-nez p2, :cond_1

    .line 3
    invoke-direct {p0, p1}, Lc/a/a/a/f2/e0/b;->r(Lc/a/a/a/f2/k;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, Lc/a/a/a/g1;

    const-string p2, "Could not find AMR header."

    invoke-direct {p1, p2}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :cond_1
    :goto_0
    invoke-direct {p0}, Lc/a/a/a/f2/e0/b;->n()V

    .line 6
    invoke-direct {p0, p1}, Lc/a/a/a/f2/e0/b;->s(Lc/a/a/a/f2/k;)I

    move-result p2

    .line 7
    invoke-interface {p1}, Lc/a/a/a/f2/k;->a()J

    move-result-wide v0

    invoke-direct {p0, v0, v1, p2}, Lc/a/a/a/f2/e0/b;->o(JI)V

    return p2
.end method
