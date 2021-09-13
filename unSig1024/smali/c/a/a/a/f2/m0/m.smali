.class public final Lc/a/a/a/f2/m0/m;
.super Ljava/lang/Object;
.source "DtsReader.java"

# interfaces
.implements Lc/a/a/a/f2/m0/o;


# instance fields
.field private final a:Lc/a/a/a/m2/a0;

.field private final b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Lc/a/a/a/f2/b0;

.field private e:I

.field private f:I

.field private g:I

.field private h:J

.field private i:Lc/a/a/a/u0;

.field private j:I

.field private k:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lc/a/a/a/m2/a0;

    const/16 v1, 0x12

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lc/a/a/a/m2/a0;-><init>([B)V

    iput-object v0, p0, Lc/a/a/a/f2/m0/m;->a:Lc/a/a/a/m2/a0;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lc/a/a/a/f2/m0/m;->e:I

    .line 4
    iput-object p1, p0, Lc/a/a/a/f2/m0/m;->b:Ljava/lang/String;

    return-void
.end method

.method private b(Lc/a/a/a/m2/a0;[BI)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->a()I

    move-result v0

    iget v1, p0, Lc/a/a/a/f2/m0/m;->f:I

    sub-int v1, p3, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 2
    iget v1, p0, Lc/a/a/a/f2/m0/m;->f:I

    invoke-virtual {p1, p2, v1, v0}, Lc/a/a/a/m2/a0;->j([BII)V

    .line 3
    iget p1, p0, Lc/a/a/a/f2/m0/m;->f:I

    add-int/2addr p1, v0

    iput p1, p0, Lc/a/a/a/f2/m0/m;->f:I

    if-ne p1, p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private g()V
    .locals 5
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "output"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/m0/m;->a:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    .line 2
    iget-object v1, p0, Lc/a/a/a/f2/m0/m;->i:Lc/a/a/a/u0;

    if-nez v1, :cond_0

    .line 3
    iget-object v1, p0, Lc/a/a/a/f2/m0/m;->c:Ljava/lang/String;

    iget-object v2, p0, Lc/a/a/a/f2/m0/m;->b:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lc/a/a/a/b2/z;->g([BLjava/lang/String;Ljava/lang/String;Lc/a/a/a/e2/t;)Lc/a/a/a/u0;

    move-result-object v1

    iput-object v1, p0, Lc/a/a/a/f2/m0/m;->i:Lc/a/a/a/u0;

    .line 4
    iget-object v2, p0, Lc/a/a/a/f2/m0/m;->d:Lc/a/a/a/f2/b0;

    invoke-interface {v2, v1}, Lc/a/a/a/f2/b0;->d(Lc/a/a/a/u0;)V

    .line 5
    :cond_0
    invoke-static {v0}, Lc/a/a/a/b2/z;->a([B)I

    move-result v1

    iput v1, p0, Lc/a/a/a/f2/m0/m;->j:I

    const-wide/32 v1, 0xf4240

    .line 6
    invoke-static {v0}, Lc/a/a/a/b2/z;->f([B)I

    move-result v0

    int-to-long v3, v0

    mul-long v3, v3, v1

    iget-object v0, p0, Lc/a/a/a/f2/m0/m;->i:Lc/a/a/a/u0;

    iget v0, v0, Lc/a/a/a/u0;->z:I

    int-to-long v0, v0

    div-long/2addr v3, v0

    long-to-int v0, v3

    int-to-long v0, v0

    iput-wide v0, p0, Lc/a/a/a/f2/m0/m;->h:J

    return-void
.end method

.method private h(Lc/a/a/a/m2/a0;)Z
    .locals 5

    .line 1
    :cond_0
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->a()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_1

    .line 2
    iget v0, p0, Lc/a/a/a/f2/m0/m;->g:I

    shl-int/lit8 v0, v0, 0x8

    iput v0, p0, Lc/a/a/a/f2/m0/m;->g:I

    .line 3
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->D()I

    move-result v2

    or-int/2addr v0, v2

    iput v0, p0, Lc/a/a/a/f2/m0/m;->g:I

    .line 4
    invoke-static {v0}, Lc/a/a/a/b2/z;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    iget-object p1, p0, Lc/a/a/a/f2/m0/m;->a:Lc/a/a/a/m2/a0;

    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object p1

    .line 6
    iget v0, p0, Lc/a/a/a/f2/m0/m;->g:I

    shr-int/lit8 v2, v0, 0x18

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, p1, v1

    shr-int/lit8 v2, v0, 0x10

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    const/4 v3, 0x1

    .line 7
    aput-byte v2, p1, v3

    const/4 v2, 0x2

    shr-int/lit8 v4, v0, 0x8

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    .line 8
    aput-byte v4, p1, v2

    const/4 v2, 0x3

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    .line 9
    aput-byte v0, p1, v2

    const/4 p1, 0x4

    .line 10
    iput p1, p0, Lc/a/a/a/f2/m0/m;->f:I

    .line 11
    iput v1, p0, Lc/a/a/a/f2/m0/m;->g:I

    return v3

    :cond_1
    return v1
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lc/a/a/a/f2/m0/m;->e:I

    .line 2
    iput v0, p0, Lc/a/a/a/f2/m0/m;->f:I

    .line 3
    iput v0, p0, Lc/a/a/a/f2/m0/m;->g:I

    return-void
.end method

.method public c(Lc/a/a/a/m2/a0;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/m0/m;->d:Lc/a/a/a/f2/b0;

    invoke-static {v0}, Lc/a/a/a/m2/f;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->a()I

    move-result v0

    if-lez v0, :cond_4

    .line 3
    iget v0, p0, Lc/a/a/a/f2/m0/m;->e:I

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v1, :cond_2

    if-ne v0, v3, :cond_1

    .line 4
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->a()I

    move-result v0

    iget v1, p0, Lc/a/a/a/f2/m0/m;->j:I

    iget v3, p0, Lc/a/a/a/f2/m0/m;->f:I

    sub-int/2addr v1, v3

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 5
    iget-object v1, p0, Lc/a/a/a/f2/m0/m;->d:Lc/a/a/a/f2/b0;

    invoke-interface {v1, p1, v0}, Lc/a/a/a/f2/b0;->a(Lc/a/a/a/m2/a0;I)V

    .line 6
    iget v1, p0, Lc/a/a/a/f2/m0/m;->f:I

    add-int/2addr v1, v0

    iput v1, p0, Lc/a/a/a/f2/m0/m;->f:I

    .line 7
    iget v7, p0, Lc/a/a/a/f2/m0/m;->j:I

    if-ne v1, v7, :cond_0

    .line 8
    iget-object v3, p0, Lc/a/a/a/f2/m0/m;->d:Lc/a/a/a/f2/b0;

    iget-wide v4, p0, Lc/a/a/a/f2/m0/m;->k:J

    const/4 v6, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-interface/range {v3 .. v9}, Lc/a/a/a/f2/b0;->c(JIIILc/a/a/a/f2/b0$a;)V

    .line 9
    iget-wide v0, p0, Lc/a/a/a/f2/m0/m;->k:J

    iget-wide v3, p0, Lc/a/a/a/f2/m0/m;->h:J

    add-long/2addr v0, v3

    iput-wide v0, p0, Lc/a/a/a/f2/m0/m;->k:J

    .line 10
    iput v2, p0, Lc/a/a/a/f2/m0/m;->e:I

    goto :goto_0

    .line 11
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 12
    :cond_2
    iget-object v0, p0, Lc/a/a/a/f2/m0/m;->a:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    const/16 v1, 0x12

    invoke-direct {p0, p1, v0, v1}, Lc/a/a/a/f2/m0/m;->b(Lc/a/a/a/m2/a0;[BI)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 13
    invoke-direct {p0}, Lc/a/a/a/f2/m0/m;->g()V

    .line 14
    iget-object v0, p0, Lc/a/a/a/f2/m0/m;->a:Lc/a/a/a/m2/a0;

    invoke-virtual {v0, v2}, Lc/a/a/a/m2/a0;->P(I)V

    .line 15
    iget-object v0, p0, Lc/a/a/a/f2/m0/m;->d:Lc/a/a/a/f2/b0;

    iget-object v2, p0, Lc/a/a/a/f2/m0/m;->a:Lc/a/a/a/m2/a0;

    invoke-interface {v0, v2, v1}, Lc/a/a/a/f2/b0;->a(Lc/a/a/a/m2/a0;I)V

    .line 16
    iput v3, p0, Lc/a/a/a/f2/m0/m;->e:I

    goto :goto_0

    .line 17
    :cond_3
    invoke-direct {p0, p1}, Lc/a/a/a/f2/m0/m;->h(Lc/a/a/a/m2/a0;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 18
    iput v1, p0, Lc/a/a/a/f2/m0/m;->e:I

    goto :goto_0

    :cond_4
    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e(JI)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lc/a/a/a/f2/m0/m;->k:J

    return-void
.end method

.method public f(Lc/a/a/a/f2/l;Lc/a/a/a/f2/m0/i0$d;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lc/a/a/a/f2/m0/i0$d;->a()V

    .line 2
    invoke-virtual {p2}, Lc/a/a/a/f2/m0/i0$d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/f2/m0/m;->c:Ljava/lang/String;

    .line 3
    invoke-virtual {p2}, Lc/a/a/a/f2/m0/i0$d;->c()I

    move-result p2

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lc/a/a/a/f2/l;->q(II)Lc/a/a/a/f2/b0;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/f2/m0/m;->d:Lc/a/a/a/f2/b0;

    return-void
.end method
