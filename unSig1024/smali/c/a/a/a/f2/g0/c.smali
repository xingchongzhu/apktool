.class public final Lc/a/a/a/f2/g0/c;
.super Ljava/lang/Object;
.source "FlvExtractor.java"

# interfaces
.implements Lc/a/a/a/f2/j;


# static fields
.field public static final a:Lc/a/a/a/f2/o;


# instance fields
.field private final b:Lc/a/a/a/m2/a0;

.field private final c:Lc/a/a/a/m2/a0;

.field private final d:Lc/a/a/a/m2/a0;

.field private final e:Lc/a/a/a/m2/a0;

.field private final f:Lc/a/a/a/f2/g0/d;

.field private g:Lc/a/a/a/f2/l;

.field private h:I

.field private i:Z

.field private j:J

.field private k:I

.field private l:I

.field private m:I

.field private n:J

.field private o:Z

.field private p:Lc/a/a/a/f2/g0/b;

.field private q:Lc/a/a/a/f2/g0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lc/a/a/a/f2/g0/a;->b:Lc/a/a/a/f2/g0/a;

    sput-object v0, Lc/a/a/a/f2/g0/c;->a:Lc/a/a/a/f2/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lc/a/a/a/m2/a0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lc/a/a/a/m2/a0;-><init>(I)V

    iput-object v0, p0, Lc/a/a/a/f2/g0/c;->b:Lc/a/a/a/m2/a0;

    .line 3
    new-instance v0, Lc/a/a/a/m2/a0;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lc/a/a/a/m2/a0;-><init>(I)V

    iput-object v0, p0, Lc/a/a/a/f2/g0/c;->c:Lc/a/a/a/m2/a0;

    .line 4
    new-instance v0, Lc/a/a/a/m2/a0;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lc/a/a/a/m2/a0;-><init>(I)V

    iput-object v0, p0, Lc/a/a/a/f2/g0/c;->d:Lc/a/a/a/m2/a0;

    .line 5
    new-instance v0, Lc/a/a/a/m2/a0;

    invoke-direct {v0}, Lc/a/a/a/m2/a0;-><init>()V

    iput-object v0, p0, Lc/a/a/a/f2/g0/c;->e:Lc/a/a/a/m2/a0;

    .line 6
    new-instance v0, Lc/a/a/a/f2/g0/d;

    invoke-direct {v0}, Lc/a/a/a/f2/g0/d;-><init>()V

    iput-object v0, p0, Lc/a/a/a/f2/g0/c;->f:Lc/a/a/a/f2/g0/d;

    const/4 v0, 0x1

    .line 7
    iput v0, p0, Lc/a/a/a/f2/g0/c;->h:I

    return-void
.end method

.method private d()V
    .locals 4
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "extractorOutput"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/f2/g0/c;->o:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/g0/c;->g:Lc/a/a/a/f2/l;

    new-instance v1, Lc/a/a/a/f2/y$b;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v1, v2, v3}, Lc/a/a/a/f2/y$b;-><init>(J)V

    invoke-interface {v0, v1}, Lc/a/a/a/f2/l;->f(Lc/a/a/a/f2/y;)V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lc/a/a/a/f2/g0/c;->o:Z

    :cond_0
    return-void
.end method

.method private f()J
    .locals 5

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/f2/g0/c;->i:Z

    if-eqz v0, :cond_0

    .line 2
    iget-wide v0, p0, Lc/a/a/a/f2/g0/c;->j:J

    iget-wide v2, p0, Lc/a/a/a/f2/g0/c;->n:J

    add-long/2addr v0, v2

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/a/a/a/f2/g0/c;->f:Lc/a/a/a/f2/g0/d;

    invoke-virtual {v0}, Lc/a/a/a/f2/g0/d;->d()J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_1
    iget-wide v0, p0, Lc/a/a/a/f2/g0/c;->n:J

    :goto_0
    return-wide v0
.end method

.method static synthetic g()[Lc/a/a/a/f2/j;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lc/a/a/a/f2/j;

    .line 1
    new-instance v1, Lc/a/a/a/f2/g0/c;

    invoke-direct {v1}, Lc/a/a/a/f2/g0/c;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method private h(Lc/a/a/a/f2/k;)Lc/a/a/a/m2/a0;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lc/a/a/a/f2/g0/c;->m:I

    iget-object v1, p0, Lc/a/a/a/f2/g0/c;->e:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->b()I

    move-result v1

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/g0/c;->e:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->b()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    iget v3, p0, Lc/a/a/a/f2/g0/c;->m:I

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    new-array v1, v1, [B

    invoke-virtual {v0, v1, v2}, Lc/a/a/a/m2/a0;->N([BI)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/a/a/a/f2/g0/c;->e:Lc/a/a/a/m2/a0;

    invoke-virtual {v0, v2}, Lc/a/a/a/m2/a0;->P(I)V

    .line 4
    :goto_0
    iget-object v0, p0, Lc/a/a/a/f2/g0/c;->e:Lc/a/a/a/m2/a0;

    iget v1, p0, Lc/a/a/a/f2/g0/c;->m:I

    invoke-virtual {v0, v1}, Lc/a/a/a/m2/a0;->O(I)V

    .line 5
    iget-object v0, p0, Lc/a/a/a/f2/g0/c;->e:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    iget v1, p0, Lc/a/a/a/f2/g0/c;->m:I

    invoke-interface {p1, v0, v2, v1}, Lc/a/a/a/f2/k;->readFully([BII)V

    .line 6
    iget-object p1, p0, Lc/a/a/a/f2/g0/c;->e:Lc/a/a/a/m2/a0;

    return-object p1
.end method

.method private j(Lc/a/a/a/f2/k;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "extractorOutput"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/g0/c;->c:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x9

    const/4 v3, 0x1

    invoke-interface {p1, v0, v1, v2, v3}, Lc/a/a/a/f2/k;->d([BIIZ)Z

    move-result p1

    if-nez p1, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object p1, p0, Lc/a/a/a/f2/g0/c;->c:Lc/a/a/a/m2/a0;

    invoke-virtual {p1, v1}, Lc/a/a/a/m2/a0;->P(I)V

    .line 3
    iget-object p1, p0, Lc/a/a/a/f2/g0/c;->c:Lc/a/a/a/m2/a0;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lc/a/a/a/m2/a0;->Q(I)V

    .line 4
    iget-object p1, p0, Lc/a/a/a/f2/g0/c;->c:Lc/a/a/a/m2/a0;

    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->D()I

    move-result p1

    and-int/lit8 v4, p1, 0x4

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    and-int/2addr p1, v3

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    if-eqz v4, :cond_3

    .line 5
    iget-object p1, p0, Lc/a/a/a/f2/g0/c;->p:Lc/a/a/a/f2/g0/b;

    if-nez p1, :cond_3

    .line 6
    new-instance p1, Lc/a/a/a/f2/g0/b;

    iget-object v4, p0, Lc/a/a/a/f2/g0/c;->g:Lc/a/a/a/f2/l;

    const/16 v5, 0x8

    .line 7
    invoke-interface {v4, v5, v3}, Lc/a/a/a/f2/l;->q(II)Lc/a/a/a/f2/b0;

    move-result-object v4

    invoke-direct {p1, v4}, Lc/a/a/a/f2/g0/b;-><init>(Lc/a/a/a/f2/b0;)V

    iput-object p1, p0, Lc/a/a/a/f2/g0/c;->p:Lc/a/a/a/f2/g0/b;

    :cond_3
    const/4 p1, 0x2

    if-eqz v1, :cond_4

    .line 8
    iget-object v1, p0, Lc/a/a/a/f2/g0/c;->q:Lc/a/a/a/f2/g0/f;

    if-nez v1, :cond_4

    .line 9
    new-instance v1, Lc/a/a/a/f2/g0/f;

    iget-object v4, p0, Lc/a/a/a/f2/g0/c;->g:Lc/a/a/a/f2/l;

    .line 10
    invoke-interface {v4, v2, p1}, Lc/a/a/a/f2/l;->q(II)Lc/a/a/a/f2/b0;

    move-result-object v4

    invoke-direct {v1, v4}, Lc/a/a/a/f2/g0/f;-><init>(Lc/a/a/a/f2/b0;)V

    iput-object v1, p0, Lc/a/a/a/f2/g0/c;->q:Lc/a/a/a/f2/g0/f;

    .line 11
    :cond_4
    iget-object v1, p0, Lc/a/a/a/f2/g0/c;->g:Lc/a/a/a/f2/l;

    invoke-interface {v1}, Lc/a/a/a/f2/l;->h()V

    .line 12
    iget-object v1, p0, Lc/a/a/a/f2/g0/c;->c:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->n()I

    move-result v1

    sub-int/2addr v1, v2

    add-int/2addr v1, v0

    iput v1, p0, Lc/a/a/a/f2/g0/c;->k:I

    .line 13
    iput p1, p0, Lc/a/a/a/f2/g0/c;->h:I

    return v3
.end method

.method private k(Lc/a/a/a/f2/k;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "extractorOutput"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lc/a/a/a/f2/g0/c;->f()J

    move-result-wide v0

    .line 2
    iget v2, p0, Lc/a/a/a/f2/g0/c;->l:I

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/16 v7, 0x8

    if-ne v2, v7, :cond_1

    iget-object v7, p0, Lc/a/a/a/f2/g0/c;->p:Lc/a/a/a/f2/g0/b;

    if-eqz v7, :cond_1

    .line 3
    invoke-direct {p0}, Lc/a/a/a/f2/g0/c;->d()V

    .line 4
    iget-object v2, p0, Lc/a/a/a/f2/g0/c;->p:Lc/a/a/a/f2/g0/b;

    invoke-direct {p0, p1}, Lc/a/a/a/f2/g0/c;->h(Lc/a/a/a/f2/k;)Lc/a/a/a/m2/a0;

    move-result-object p1

    invoke-virtual {v2, p1, v0, v1}, Lc/a/a/a/f2/g0/e;->a(Lc/a/a/a/m2/a0;J)Z

    move-result v5

    :cond_0
    :goto_0
    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/16 v7, 0x9

    if-ne v2, v7, :cond_2

    .line 5
    iget-object v7, p0, Lc/a/a/a/f2/g0/c;->q:Lc/a/a/a/f2/g0/f;

    if-eqz v7, :cond_2

    .line 6
    invoke-direct {p0}, Lc/a/a/a/f2/g0/c;->d()V

    .line 7
    iget-object v2, p0, Lc/a/a/a/f2/g0/c;->q:Lc/a/a/a/f2/g0/f;

    invoke-direct {p0, p1}, Lc/a/a/a/f2/g0/c;->h(Lc/a/a/a/f2/k;)Lc/a/a/a/m2/a0;

    move-result-object p1

    invoke-virtual {v2, p1, v0, v1}, Lc/a/a/a/f2/g0/e;->a(Lc/a/a/a/m2/a0;J)Z

    move-result v5

    goto :goto_0

    :cond_2
    const/16 v7, 0x12

    if-ne v2, v7, :cond_3

    .line 8
    iget-boolean v2, p0, Lc/a/a/a/f2/g0/c;->o:Z

    if-nez v2, :cond_3

    .line 9
    iget-object v2, p0, Lc/a/a/a/f2/g0/c;->f:Lc/a/a/a/f2/g0/d;

    invoke-direct {p0, p1}, Lc/a/a/a/f2/g0/c;->h(Lc/a/a/a/f2/k;)Lc/a/a/a/m2/a0;

    move-result-object p1

    invoke-virtual {v2, p1, v0, v1}, Lc/a/a/a/f2/g0/e;->a(Lc/a/a/a/m2/a0;J)Z

    move-result v5

    .line 10
    iget-object p1, p0, Lc/a/a/a/f2/g0/c;->f:Lc/a/a/a/f2/g0/d;

    invoke-virtual {p1}, Lc/a/a/a/f2/g0/d;->d()J

    move-result-wide v0

    cmp-long p1, v0, v3

    if-eqz p1, :cond_0

    .line 11
    iget-object p1, p0, Lc/a/a/a/f2/g0/c;->g:Lc/a/a/a/f2/l;

    new-instance v2, Lc/a/a/a/f2/w;

    iget-object v7, p0, Lc/a/a/a/f2/g0/c;->f:Lc/a/a/a/f2/g0/d;

    .line 12
    invoke-virtual {v7}, Lc/a/a/a/f2/g0/d;->e()[J

    move-result-object v7

    iget-object v8, p0, Lc/a/a/a/f2/g0/c;->f:Lc/a/a/a/f2/g0/d;

    .line 13
    invoke-virtual {v8}, Lc/a/a/a/f2/g0/d;->f()[J

    move-result-object v8

    invoke-direct {v2, v7, v8, v0, v1}, Lc/a/a/a/f2/w;-><init>([J[JJ)V

    .line 14
    invoke-interface {p1, v2}, Lc/a/a/a/f2/l;->f(Lc/a/a/a/f2/y;)V

    .line 15
    iput-boolean v6, p0, Lc/a/a/a/f2/g0/c;->o:Z

    goto :goto_0

    .line 16
    :cond_3
    iget v0, p0, Lc/a/a/a/f2/g0/c;->m:I

    invoke-interface {p1, v0}, Lc/a/a/a/f2/k;->i(I)V

    const/4 p1, 0x0

    .line 17
    :goto_1
    iget-boolean v0, p0, Lc/a/a/a/f2/g0/c;->i:Z

    if-nez v0, :cond_5

    if-eqz v5, :cond_5

    .line 18
    iput-boolean v6, p0, Lc/a/a/a/f2/g0/c;->i:Z

    .line 19
    iget-object v0, p0, Lc/a/a/a/f2/g0/c;->f:Lc/a/a/a/f2/g0/d;

    invoke-virtual {v0}, Lc/a/a/a/f2/g0/d;->d()J

    move-result-wide v0

    cmp-long v2, v0, v3

    if-nez v2, :cond_4

    iget-wide v0, p0, Lc/a/a/a/f2/g0/c;->n:J

    neg-long v0, v0

    goto :goto_2

    :cond_4
    const-wide/16 v0, 0x0

    :goto_2
    iput-wide v0, p0, Lc/a/a/a/f2/g0/c;->j:J

    :cond_5
    const/4 v0, 0x4

    .line 20
    iput v0, p0, Lc/a/a/a/f2/g0/c;->k:I

    const/4 v0, 0x2

    .line 21
    iput v0, p0, Lc/a/a/a/f2/g0/c;->h:I

    return p1
.end method

.method private l(Lc/a/a/a/f2/k;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/g0/c;->d:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xb

    const/4 v3, 0x1

    invoke-interface {p1, v0, v1, v2, v3}, Lc/a/a/a/f2/k;->d([BIIZ)Z

    move-result p1

    if-nez p1, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object p1, p0, Lc/a/a/a/f2/g0/c;->d:Lc/a/a/a/m2/a0;

    invoke-virtual {p1, v1}, Lc/a/a/a/m2/a0;->P(I)V

    .line 3
    iget-object p1, p0, Lc/a/a/a/f2/g0/c;->d:Lc/a/a/a/m2/a0;

    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->D()I

    move-result p1

    iput p1, p0, Lc/a/a/a/f2/g0/c;->l:I

    .line 4
    iget-object p1, p0, Lc/a/a/a/f2/g0/c;->d:Lc/a/a/a/m2/a0;

    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->G()I

    move-result p1

    iput p1, p0, Lc/a/a/a/f2/g0/c;->m:I

    .line 5
    iget-object p1, p0, Lc/a/a/a/f2/g0/c;->d:Lc/a/a/a/m2/a0;

    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->G()I

    move-result p1

    int-to-long v0, p1

    iput-wide v0, p0, Lc/a/a/a/f2/g0/c;->n:J

    .line 6
    iget-object p1, p0, Lc/a/a/a/f2/g0/c;->d:Lc/a/a/a/m2/a0;

    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->D()I

    move-result p1

    shl-int/lit8 p1, p1, 0x18

    int-to-long v0, p1

    iget-wide v4, p0, Lc/a/a/a/f2/g0/c;->n:J

    or-long/2addr v0, v4

    const-wide/16 v4, 0x3e8

    mul-long v0, v0, v4

    iput-wide v0, p0, Lc/a/a/a/f2/g0/c;->n:J

    .line 7
    iget-object p1, p0, Lc/a/a/a/f2/g0/c;->d:Lc/a/a/a/m2/a0;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lc/a/a/a/m2/a0;->Q(I)V

    const/4 p1, 0x4

    .line 8
    iput p1, p0, Lc/a/a/a/f2/g0/c;->h:I

    return v3
.end method

.method private m(Lc/a/a/a/f2/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lc/a/a/a/f2/g0/c;->k:I

    invoke-interface {p1, v0}, Lc/a/a/a/f2/k;->i(I)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lc/a/a/a/f2/g0/c;->k:I

    const/4 p1, 0x3

    .line 3
    iput p1, p0, Lc/a/a/a/f2/g0/c;->h:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(Lc/a/a/a/f2/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/f2/g0/c;->g:Lc/a/a/a/f2/l;

    return-void
.end method

.method public c(JJ)V
    .locals 2

    const/4 p3, 0x0

    const-wide/16 v0, 0x0

    cmp-long p4, p1, v0

    if-nez p4, :cond_0

    const/4 p1, 0x1

    .line 1
    iput p1, p0, Lc/a/a/a/f2/g0/c;->h:I

    .line 2
    iput-boolean p3, p0, Lc/a/a/a/f2/g0/c;->i:Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    .line 3
    iput p1, p0, Lc/a/a/a/f2/g0/c;->h:I

    .line 4
    :goto_0
    iput p3, p0, Lc/a/a/a/f2/g0/c;->k:I

    return-void
.end method

.method public e(Lc/a/a/a/f2/k;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/g0/c;->b:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-interface {p1, v0, v1, v2}, Lc/a/a/a/f2/k;->o([BII)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/g0/c;->b:Lc/a/a/a/m2/a0;

    invoke-virtual {v0, v1}, Lc/a/a/a/m2/a0;->P(I)V

    .line 3
    iget-object v0, p0, Lc/a/a/a/f2/g0/c;->b:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->G()I

    move-result v0

    const v2, 0x464c56

    if-eq v0, v2, :cond_0

    return v1

    .line 4
    :cond_0
    iget-object v0, p0, Lc/a/a/a/f2/g0/c;->b:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    const/4 v2, 0x2

    invoke-interface {p1, v0, v1, v2}, Lc/a/a/a/f2/k;->o([BII)V

    .line 5
    iget-object v0, p0, Lc/a/a/a/f2/g0/c;->b:Lc/a/a/a/m2/a0;

    invoke-virtual {v0, v1}, Lc/a/a/a/m2/a0;->P(I)V

    .line 6
    iget-object v0, p0, Lc/a/a/a/f2/g0/c;->b:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->J()I

    move-result v0

    and-int/lit16 v0, v0, 0xfa

    if-eqz v0, :cond_1

    return v1

    .line 7
    :cond_1
    iget-object v0, p0, Lc/a/a/a/f2/g0/c;->b:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    const/4 v2, 0x4

    invoke-interface {p1, v0, v1, v2}, Lc/a/a/a/f2/k;->o([BII)V

    .line 8
    iget-object v0, p0, Lc/a/a/a/f2/g0/c;->b:Lc/a/a/a/m2/a0;

    invoke-virtual {v0, v1}, Lc/a/a/a/m2/a0;->P(I)V

    .line 9
    iget-object v0, p0, Lc/a/a/a/f2/g0/c;->b:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->n()I

    move-result v0

    .line 10
    invoke-interface {p1}, Lc/a/a/a/f2/k;->h()V

    .line 11
    invoke-interface {p1, v0}, Lc/a/a/a/f2/k;->p(I)V

    .line 12
    iget-object v0, p0, Lc/a/a/a/f2/g0/c;->b:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    invoke-interface {p1, v0, v1, v2}, Lc/a/a/a/f2/k;->o([BII)V

    .line 13
    iget-object p1, p0, Lc/a/a/a/f2/g0/c;->b:Lc/a/a/a/m2/a0;

    invoke-virtual {p1, v1}, Lc/a/a/a/m2/a0;->P(I)V

    .line 14
    iget-object p1, p0, Lc/a/a/a/f2/g0/c;->b:Lc/a/a/a/m2/a0;

    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->n()I

    move-result p1

    if-nez p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public i(Lc/a/a/a/f2/k;Lc/a/a/a/f2/x;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object p2, p0, Lc/a/a/a/f2/g0/c;->g:Lc/a/a/a/f2/l;

    invoke-static {p2}, Lc/a/a/a/m2/f;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    :cond_0
    :goto_0
    iget p2, p0, Lc/a/a/a/f2/g0/c;->h:I

    const/4 v0, 0x1

    const/4 v1, -0x1

    if-eq p2, v0, :cond_4

    const/4 v0, 0x2

    if-eq p2, v0, :cond_3

    const/4 v0, 0x3

    if-eq p2, v0, :cond_2

    const/4 v0, 0x4

    if-ne p2, v0, :cond_1

    .line 3
    invoke-direct {p0, p1}, Lc/a/a/a/f2/g0/c;->k(Lc/a/a/a/f2/k;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 4
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 5
    :cond_2
    invoke-direct {p0, p1}, Lc/a/a/a/f2/g0/c;->l(Lc/a/a/a/f2/k;)Z

    move-result p2

    if-nez p2, :cond_0

    return v1

    .line 6
    :cond_3
    invoke-direct {p0, p1}, Lc/a/a/a/f2/g0/c;->m(Lc/a/a/a/f2/k;)V

    goto :goto_0

    .line 7
    :cond_4
    invoke-direct {p0, p1}, Lc/a/a/a/f2/g0/c;->j(Lc/a/a/a/f2/k;)Z

    move-result p2

    if-nez p2, :cond_0

    return v1
.end method
