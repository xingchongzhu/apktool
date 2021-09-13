.class public final Lc/a/a/a/f2/m0/u;
.super Ljava/lang/Object;
.source "LatmReader.java"

# interfaces
.implements Lc/a/a/a/f2/m0/o;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lc/a/a/a/m2/a0;

.field private final c:Lc/a/a/a/m2/z;

.field private d:Lc/a/a/a/f2/b0;

.field private e:Ljava/lang/String;

.field private f:Lc/a/a/a/u0;

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:J

.field private l:Z

.field private m:I

.field private n:I

.field private o:I

.field private p:Z

.field private q:J

.field private r:I

.field private s:J

.field private t:I

.field private u:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/f2/m0/u;->a:Ljava/lang/String;

    .line 3
    new-instance p1, Lc/a/a/a/m2/a0;

    const/16 v0, 0x400

    invoke-direct {p1, v0}, Lc/a/a/a/m2/a0;-><init>(I)V

    iput-object p1, p0, Lc/a/a/a/f2/m0/u;->b:Lc/a/a/a/m2/a0;

    .line 4
    new-instance v0, Lc/a/a/a/m2/z;

    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object p1

    invoke-direct {v0, p1}, Lc/a/a/a/m2/z;-><init>([B)V

    iput-object v0, p0, Lc/a/a/a/f2/m0/u;->c:Lc/a/a/a/m2/z;

    return-void
.end method

.method private static b(Lc/a/a/a/m2/z;)J
    .locals 2

    const/4 v0, 0x2

    .line 1
    invoke-virtual {p0, v0}, Lc/a/a/a/m2/z;->h(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v0, v0, 0x8

    .line 2
    invoke-virtual {p0, v0}, Lc/a/a/a/m2/z;->h(I)I

    move-result p0

    int-to-long v0, p0

    return-wide v0
.end method

.method private g(Lc/a/a/a/m2/z;)V
    .locals 2
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
    invoke-virtual {p1}, Lc/a/a/a/m2/z;->g()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lc/a/a/a/f2/m0/u;->l:Z

    .line 3
    invoke-direct {p0, p1}, Lc/a/a/a/f2/m0/u;->l(Lc/a/a/a/m2/z;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-boolean v0, p0, Lc/a/a/a/f2/m0/u;->l:Z

    if-nez v0, :cond_1

    return-void

    .line 5
    :cond_1
    :goto_0
    iget v0, p0, Lc/a/a/a/f2/m0/u;->m:I

    if-nez v0, :cond_4

    .line 6
    iget v0, p0, Lc/a/a/a/f2/m0/u;->n:I

    if-nez v0, :cond_3

    .line 7
    invoke-direct {p0, p1}, Lc/a/a/a/f2/m0/u;->j(Lc/a/a/a/m2/z;)I

    move-result v0

    .line 8
    invoke-direct {p0, p1, v0}, Lc/a/a/a/f2/m0/u;->k(Lc/a/a/a/m2/z;I)V

    .line 9
    iget-boolean v0, p0, Lc/a/a/a/f2/m0/u;->p:Z

    if-eqz v0, :cond_2

    .line 10
    iget-wide v0, p0, Lc/a/a/a/f2/m0/u;->q:J

    long-to-int v1, v0

    invoke-virtual {p1, v1}, Lc/a/a/a/m2/z;->r(I)V

    :cond_2
    return-void

    .line 11
    :cond_3
    new-instance p1, Lc/a/a/a/g1;

    invoke-direct {p1}, Lc/a/a/a/g1;-><init>()V

    throw p1

    .line 12
    :cond_4
    new-instance p1, Lc/a/a/a/g1;

    invoke-direct {p1}, Lc/a/a/a/g1;-><init>()V

    throw p1
.end method

.method private h(Lc/a/a/a/m2/z;)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/m2/z;->b()I

    move-result v0

    const/4 v1, 0x1

    .line 2
    invoke-static {p1, v1}, Lc/a/a/a/b2/k;->e(Lc/a/a/a/m2/z;Z)Lc/a/a/a/b2/k$b;

    move-result-object v1

    .line 3
    iget-object v2, v1, Lc/a/a/a/b2/k$b;->c:Ljava/lang/String;

    iput-object v2, p0, Lc/a/a/a/f2/m0/u;->u:Ljava/lang/String;

    .line 4
    iget v2, v1, Lc/a/a/a/b2/k$b;->a:I

    iput v2, p0, Lc/a/a/a/f2/m0/u;->r:I

    .line 5
    iget v1, v1, Lc/a/a/a/b2/k$b;->b:I

    iput v1, p0, Lc/a/a/a/f2/m0/u;->t:I

    .line 6
    invoke-virtual {p1}, Lc/a/a/a/m2/z;->b()I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method private i(Lc/a/a/a/m2/z;)V
    .locals 4

    const/4 v0, 0x3

    .line 1
    invoke-virtual {p1, v0}, Lc/a/a/a/m2/z;->h(I)I

    move-result v1

    iput v1, p0, Lc/a/a/a/f2/m0/u;->o:I

    if-eqz v1, :cond_4

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v3, 0x6

    if-eq v1, v0, :cond_2

    const/4 v0, 0x4

    if-eq v1, v0, :cond_2

    const/4 v0, 0x5

    if-eq v1, v0, :cond_2

    if-eq v1, v3, :cond_1

    const/4 v0, 0x7

    if-ne v1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 3
    :cond_1
    :goto_0
    invoke-virtual {p1, v2}, Lc/a/a/a/m2/z;->r(I)V

    goto :goto_1

    .line 4
    :cond_2
    invoke-virtual {p1, v3}, Lc/a/a/a/m2/z;->r(I)V

    goto :goto_1

    :cond_3
    const/16 v0, 0x9

    .line 5
    invoke-virtual {p1, v0}, Lc/a/a/a/m2/z;->r(I)V

    goto :goto_1

    :cond_4
    const/16 v0, 0x8

    .line 6
    invoke-virtual {p1, v0}, Lc/a/a/a/m2/z;->r(I)V

    :goto_1
    return-void
.end method

.method private j(Lc/a/a/a/m2/z;)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .line 1
    iget v0, p0, Lc/a/a/a/f2/m0/u;->o:I

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :cond_0
    const/16 v1, 0x8

    .line 2
    invoke-virtual {p1, v1}, Lc/a/a/a/m2/z;->h(I)I

    move-result v1

    add-int/2addr v0, v1

    const/16 v2, 0xff

    if-eq v1, v2, :cond_0

    return v0

    .line 3
    :cond_1
    new-instance p1, Lc/a/a/a/g1;

    invoke-direct {p1}, Lc/a/a/a/g1;-><init>()V

    goto :goto_1

    :goto_0
    throw p1

    :goto_1
    goto :goto_0
.end method

.method private k(Lc/a/a/a/m2/z;I)V
    .locals 8
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "output"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/m2/z;->e()I

    move-result v0

    and-int/lit8 v1, v0, 0x7

    if-nez v1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/f2/m0/u;->b:Lc/a/a/a/m2/a0;

    shr-int/lit8 v0, v0, 0x3

    invoke-virtual {p1, v0}, Lc/a/a/a/m2/a0;->P(I)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/a/a/a/f2/m0/u;->b:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    mul-int/lit8 v1, p2, 0x8

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Lc/a/a/a/m2/z;->i([BII)V

    .line 4
    iget-object p1, p0, Lc/a/a/a/f2/m0/u;->b:Lc/a/a/a/m2/a0;

    invoke-virtual {p1, v2}, Lc/a/a/a/m2/a0;->P(I)V

    .line 5
    :goto_0
    iget-object p1, p0, Lc/a/a/a/f2/m0/u;->d:Lc/a/a/a/f2/b0;

    iget-object v0, p0, Lc/a/a/a/f2/m0/u;->b:Lc/a/a/a/m2/a0;

    invoke-interface {p1, v0, p2}, Lc/a/a/a/f2/b0;->a(Lc/a/a/a/m2/a0;I)V

    .line 6
    iget-object v1, p0, Lc/a/a/a/f2/m0/u;->d:Lc/a/a/a/f2/b0;

    iget-wide v2, p0, Lc/a/a/a/f2/m0/u;->k:J

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v5, p2

    invoke-interface/range {v1 .. v7}, Lc/a/a/a/f2/b0;->c(JIIILc/a/a/a/f2/b0$a;)V

    .line 7
    iget-wide p1, p0, Lc/a/a/a/f2/m0/u;->k:J

    iget-wide v0, p0, Lc/a/a/a/f2/m0/u;->s:J

    add-long/2addr p1, v0

    iput-wide p1, p0, Lc/a/a/a/f2/m0/u;->k:J

    return-void
.end method

.method private l(Lc/a/a/a/m2/z;)V
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

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p1, v0}, Lc/a/a/a/m2/z;->h(I)I

    move-result v1

    const/4 v2, 0x0

    if-ne v1, v0, :cond_0

    .line 2
    invoke-virtual {p1, v0}, Lc/a/a/a/m2/z;->h(I)I

    move-result v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iput v3, p0, Lc/a/a/a/f2/m0/u;->m:I

    if-nez v3, :cond_9

    if-ne v1, v0, :cond_1

    .line 3
    invoke-static {p1}, Lc/a/a/a/f2/m0/u;->b(Lc/a/a/a/m2/z;)J

    .line 4
    :cond_1
    invoke-virtual {p1}, Lc/a/a/a/m2/z;->g()Z

    move-result v3

    if-eqz v3, :cond_8

    const/4 v3, 0x6

    .line 5
    invoke-virtual {p1, v3}, Lc/a/a/a/m2/z;->h(I)I

    move-result v3

    iput v3, p0, Lc/a/a/a/f2/m0/u;->n:I

    const/4 v3, 0x4

    .line 6
    invoke-virtual {p1, v3}, Lc/a/a/a/m2/z;->h(I)I

    move-result v3

    const/4 v4, 0x3

    .line 7
    invoke-virtual {p1, v4}, Lc/a/a/a/m2/z;->h(I)I

    move-result v4

    if-nez v3, :cond_7

    if-nez v4, :cond_7

    const/16 v3, 0x8

    if-nez v1, :cond_2

    .line 8
    invoke-virtual {p1}, Lc/a/a/a/m2/z;->e()I

    move-result v4

    .line 9
    invoke-direct {p0, p1}, Lc/a/a/a/f2/m0/u;->h(Lc/a/a/a/m2/z;)I

    move-result v5

    .line 10
    invoke-virtual {p1, v4}, Lc/a/a/a/m2/z;->p(I)V

    add-int/lit8 v4, v5, 0x7

    .line 11
    div-int/2addr v4, v3

    new-array v4, v4, [B

    .line 12
    invoke-virtual {p1, v4, v2, v5}, Lc/a/a/a/m2/z;->i([BII)V

    .line 13
    new-instance v2, Lc/a/a/a/u0$b;

    invoke-direct {v2}, Lc/a/a/a/u0$b;-><init>()V

    iget-object v5, p0, Lc/a/a/a/f2/m0/u;->e:Ljava/lang/String;

    .line 14
    invoke-virtual {v2, v5}, Lc/a/a/a/u0$b;->S(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v2

    const-string v5, "audio/mp4a-latm"

    .line 15
    invoke-virtual {v2, v5}, Lc/a/a/a/u0$b;->e0(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v2

    iget-object v5, p0, Lc/a/a/a/f2/m0/u;->u:Ljava/lang/String;

    .line 16
    invoke-virtual {v2, v5}, Lc/a/a/a/u0$b;->I(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v2

    iget v5, p0, Lc/a/a/a/f2/m0/u;->t:I

    .line 17
    invoke-virtual {v2, v5}, Lc/a/a/a/u0$b;->H(I)Lc/a/a/a/u0$b;

    move-result-object v2

    iget v5, p0, Lc/a/a/a/f2/m0/u;->r:I

    .line 18
    invoke-virtual {v2, v5}, Lc/a/a/a/u0$b;->f0(I)Lc/a/a/a/u0$b;

    move-result-object v2

    .line 19
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v2, v4}, Lc/a/a/a/u0$b;->T(Ljava/util/List;)Lc/a/a/a/u0$b;

    move-result-object v2

    iget-object v4, p0, Lc/a/a/a/f2/m0/u;->a:Ljava/lang/String;

    .line 20
    invoke-virtual {v2, v4}, Lc/a/a/a/u0$b;->V(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v2

    .line 21
    invoke-virtual {v2}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object v2

    .line 22
    iget-object v4, p0, Lc/a/a/a/f2/m0/u;->f:Lc/a/a/a/u0;

    invoke-virtual {v2, v4}, Lc/a/a/a/u0;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 23
    iput-object v2, p0, Lc/a/a/a/f2/m0/u;->f:Lc/a/a/a/u0;

    const-wide/32 v4, 0x3d090000

    .line 24
    iget v6, v2, Lc/a/a/a/u0;->z:I

    int-to-long v6, v6

    div-long/2addr v4, v6

    iput-wide v4, p0, Lc/a/a/a/f2/m0/u;->s:J

    .line 25
    iget-object v4, p0, Lc/a/a/a/f2/m0/u;->d:Lc/a/a/a/f2/b0;

    invoke-interface {v4, v2}, Lc/a/a/a/f2/b0;->d(Lc/a/a/a/u0;)V

    goto :goto_1

    .line 26
    :cond_2
    invoke-static {p1}, Lc/a/a/a/f2/m0/u;->b(Lc/a/a/a/m2/z;)J

    move-result-wide v4

    long-to-int v2, v4

    .line 27
    invoke-direct {p0, p1}, Lc/a/a/a/f2/m0/u;->h(Lc/a/a/a/m2/z;)I

    move-result v4

    sub-int/2addr v2, v4

    .line 28
    invoke-virtual {p1, v2}, Lc/a/a/a/m2/z;->r(I)V

    .line 29
    :cond_3
    :goto_1
    invoke-direct {p0, p1}, Lc/a/a/a/f2/m0/u;->i(Lc/a/a/a/m2/z;)V

    .line 30
    invoke-virtual {p1}, Lc/a/a/a/m2/z;->g()Z

    move-result v2

    iput-boolean v2, p0, Lc/a/a/a/f2/m0/u;->p:Z

    const-wide/16 v4, 0x0

    .line 31
    iput-wide v4, p0, Lc/a/a/a/f2/m0/u;->q:J

    if-eqz v2, :cond_5

    if-ne v1, v0, :cond_4

    .line 32
    invoke-static {p1}, Lc/a/a/a/f2/m0/u;->b(Lc/a/a/a/m2/z;)J

    move-result-wide v0

    iput-wide v0, p0, Lc/a/a/a/f2/m0/u;->q:J

    goto :goto_2

    .line 33
    :cond_4
    invoke-virtual {p1}, Lc/a/a/a/m2/z;->g()Z

    move-result v0

    .line 34
    iget-wide v1, p0, Lc/a/a/a/f2/m0/u;->q:J

    shl-long/2addr v1, v3

    invoke-virtual {p1, v3}, Lc/a/a/a/m2/z;->h(I)I

    move-result v4

    int-to-long v4, v4

    add-long/2addr v1, v4

    iput-wide v1, p0, Lc/a/a/a/f2/m0/u;->q:J

    if-nez v0, :cond_4

    .line 35
    :cond_5
    :goto_2
    invoke-virtual {p1}, Lc/a/a/a/m2/z;->g()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 36
    invoke-virtual {p1, v3}, Lc/a/a/a/m2/z;->r(I)V

    :cond_6
    return-void

    .line 37
    :cond_7
    new-instance p1, Lc/a/a/a/g1;

    invoke-direct {p1}, Lc/a/a/a/g1;-><init>()V

    throw p1

    .line 38
    :cond_8
    new-instance p1, Lc/a/a/a/g1;

    invoke-direct {p1}, Lc/a/a/a/g1;-><init>()V

    throw p1

    .line 39
    :cond_9
    new-instance p1, Lc/a/a/a/g1;

    invoke-direct {p1}, Lc/a/a/a/g1;-><init>()V

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method

.method private m(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/m0/u;->b:Lc/a/a/a/m2/a0;

    invoke-virtual {v0, p1}, Lc/a/a/a/m2/a0;->L(I)V

    .line 2
    iget-object p1, p0, Lc/a/a/a/f2/m0/u;->c:Lc/a/a/a/m2/z;

    iget-object v0, p0, Lc/a/a/a/f2/m0/u;->b:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Lc/a/a/a/m2/z;->n([B)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lc/a/a/a/f2/m0/u;->g:I

    .line 2
    iput-boolean v0, p0, Lc/a/a/a/f2/m0/u;->l:Z

    return-void
.end method

.method public c(Lc/a/a/a/m2/a0;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/m0/u;->d:Lc/a/a/a/f2/b0;

    invoke-static {v0}, Lc/a/a/a/m2/f;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->a()I

    move-result v0

    if-lez v0, :cond_7

    .line 3
    iget v0, p0, Lc/a/a/a/f2/m0/u;->g:I

    const/16 v1, 0x56

    const/4 v2, 0x1

    if-eqz v0, :cond_6

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eq v0, v2, :cond_4

    const/4 v1, 0x3

    if-eq v0, v3, :cond_2

    if-ne v0, v1, :cond_1

    .line 4
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->a()I

    move-result v0

    iget v1, p0, Lc/a/a/a/f2/m0/u;->i:I

    iget v2, p0, Lc/a/a/a/f2/m0/u;->h:I

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 5
    iget-object v1, p0, Lc/a/a/a/f2/m0/u;->c:Lc/a/a/a/m2/z;

    iget-object v1, v1, Lc/a/a/a/m2/z;->a:[B

    iget v2, p0, Lc/a/a/a/f2/m0/u;->h:I

    invoke-virtual {p1, v1, v2, v0}, Lc/a/a/a/m2/a0;->j([BII)V

    .line 6
    iget v1, p0, Lc/a/a/a/f2/m0/u;->h:I

    add-int/2addr v1, v0

    iput v1, p0, Lc/a/a/a/f2/m0/u;->h:I

    .line 7
    iget v0, p0, Lc/a/a/a/f2/m0/u;->i:I

    if-ne v1, v0, :cond_0

    .line 8
    iget-object v0, p0, Lc/a/a/a/f2/m0/u;->c:Lc/a/a/a/m2/z;

    invoke-virtual {v0, v4}, Lc/a/a/a/m2/z;->p(I)V

    .line 9
    iget-object v0, p0, Lc/a/a/a/f2/m0/u;->c:Lc/a/a/a/m2/z;

    invoke-direct {p0, v0}, Lc/a/a/a/f2/m0/u;->g(Lc/a/a/a/m2/z;)V

    .line 10
    iput v4, p0, Lc/a/a/a/f2/m0/u;->g:I

    goto :goto_0

    .line 11
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 12
    :cond_2
    iget v0, p0, Lc/a/a/a/f2/m0/u;->j:I

    and-int/lit16 v0, v0, -0xe1

    shl-int/lit8 v0, v0, 0x8

    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->D()I

    move-result v2

    or-int/2addr v0, v2

    iput v0, p0, Lc/a/a/a/f2/m0/u;->i:I

    .line 13
    iget-object v2, p0, Lc/a/a/a/f2/m0/u;->b:Lc/a/a/a/m2/a0;

    invoke-virtual {v2}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v2

    array-length v2, v2

    if-le v0, v2, :cond_3

    .line 14
    iget v0, p0, Lc/a/a/a/f2/m0/u;->i:I

    invoke-direct {p0, v0}, Lc/a/a/a/f2/m0/u;->m(I)V

    .line 15
    :cond_3
    iput v4, p0, Lc/a/a/a/f2/m0/u;->h:I

    .line 16
    iput v1, p0, Lc/a/a/a/f2/m0/u;->g:I

    goto :goto_0

    .line 17
    :cond_4
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->D()I

    move-result v0

    and-int/lit16 v2, v0, 0xe0

    const/16 v5, 0xe0

    if-ne v2, v5, :cond_5

    .line 18
    iput v0, p0, Lc/a/a/a/f2/m0/u;->j:I

    .line 19
    iput v3, p0, Lc/a/a/a/f2/m0/u;->g:I

    goto :goto_0

    :cond_5
    if-eq v0, v1, :cond_0

    .line 20
    iput v4, p0, Lc/a/a/a/f2/m0/u;->g:I

    goto :goto_0

    .line 21
    :cond_6
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->D()I

    move-result v0

    if-ne v0, v1, :cond_0

    .line 22
    iput v2, p0, Lc/a/a/a/f2/m0/u;->g:I

    goto/16 :goto_0

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
    iput-wide p1, p0, Lc/a/a/a/f2/m0/u;->k:J

    return-void
.end method

.method public f(Lc/a/a/a/f2/l;Lc/a/a/a/f2/m0/i0$d;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lc/a/a/a/f2/m0/i0$d;->a()V

    .line 2
    invoke-virtual {p2}, Lc/a/a/a/f2/m0/i0$d;->c()I

    move-result v0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lc/a/a/a/f2/l;->q(II)Lc/a/a/a/f2/b0;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/f2/m0/u;->d:Lc/a/a/a/f2/b0;

    .line 3
    invoke-virtual {p2}, Lc/a/a/a/f2/m0/i0$d;->b()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/f2/m0/u;->e:Ljava/lang/String;

    return-void
.end method
