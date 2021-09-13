.class public final Lc/a/a/a/f2/j0/f;
.super Ljava/lang/Object;
.source "Mp3Extractor.java"

# interfaces
.implements Lc/a/a/a/f2/j;


# static fields
.field public static final a:Lc/a/a/a/f2/o;

.field private static final b:Lc/a/a/a/h2/m/h$a;


# instance fields
.field private final c:I

.field private final d:J

.field private final e:Lc/a/a/a/m2/a0;

.field private final f:Lc/a/a/a/b2/c0$a;

.field private final g:Lc/a/a/a/f2/u;

.field private final h:Lc/a/a/a/f2/v;

.field private final i:Lc/a/a/a/f2/b0;

.field private j:Lc/a/a/a/f2/l;

.field private k:Lc/a/a/a/f2/b0;

.field private l:Lc/a/a/a/f2/b0;

.field private m:I

.field private n:Lc/a/a/a/h2/a;

.field private o:J

.field private p:J

.field private q:J

.field private r:I

.field private s:Lc/a/a/a/f2/j0/g;

.field private t:Z

.field private u:Z

.field private v:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lc/a/a/a/f2/j0/a;->b:Lc/a/a/a/f2/j0/a;

    sput-object v0, Lc/a/a/a/f2/j0/f;->a:Lc/a/a/a/f2/o;

    .line 2
    sget-object v0, Lc/a/a/a/f2/j0/b;->a:Lc/a/a/a/f2/j0/b;

    sput-object v0, Lc/a/a/a/f2/j0/f;->b:Lc/a/a/a/h2/m/h$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lc/a/a/a/f2/j0/f;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    invoke-direct {p0, p1, v0, v1}, Lc/a/a/a/f2/j0/f;-><init>(IJ)V

    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p1, p0, Lc/a/a/a/f2/j0/f;->c:I

    .line 5
    iput-wide p2, p0, Lc/a/a/a/f2/j0/f;->d:J

    .line 6
    new-instance p1, Lc/a/a/a/m2/a0;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Lc/a/a/a/m2/a0;-><init>(I)V

    iput-object p1, p0, Lc/a/a/a/f2/j0/f;->e:Lc/a/a/a/m2/a0;

    .line 7
    new-instance p1, Lc/a/a/a/b2/c0$a;

    invoke-direct {p1}, Lc/a/a/a/b2/c0$a;-><init>()V

    iput-object p1, p0, Lc/a/a/a/f2/j0/f;->f:Lc/a/a/a/b2/c0$a;

    .line 8
    new-instance p1, Lc/a/a/a/f2/u;

    invoke-direct {p1}, Lc/a/a/a/f2/u;-><init>()V

    iput-object p1, p0, Lc/a/a/a/f2/j0/f;->g:Lc/a/a/a/f2/u;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    iput-wide p1, p0, Lc/a/a/a/f2/j0/f;->o:J

    .line 10
    new-instance p1, Lc/a/a/a/f2/v;

    invoke-direct {p1}, Lc/a/a/a/f2/v;-><init>()V

    iput-object p1, p0, Lc/a/a/a/f2/j0/f;->h:Lc/a/a/a/f2/v;

    .line 11
    new-instance p1, Lc/a/a/a/f2/i;

    invoke-direct {p1}, Lc/a/a/a/f2/i;-><init>()V

    iput-object p1, p0, Lc/a/a/a/f2/j0/f;->i:Lc/a/a/a/f2/b0;

    .line 12
    iput-object p1, p0, Lc/a/a/a/f2/j0/f;->l:Lc/a/a/a/f2/b0;

    return-void
.end method

.method private d()V
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "extractorOutput",
            "realTrackOutput"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/j0/f;->k:Lc/a/a/a/f2/b0;

    invoke-static {v0}, Lc/a/a/a/m2/f;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/j0/f;->j:Lc/a/a/a/f2/l;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private f(Lc/a/a/a/f2/k;)Lc/a/a/a/f2/j0/g;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lc/a/a/a/f2/j0/f;->q(Lc/a/a/a/f2/k;)Lc/a/a/a/f2/j0/g;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lc/a/a/a/f2/j0/f;->n:Lc/a/a/a/h2/a;

    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lc/a/a/a/f2/j0/f;->p(Lc/a/a/a/h2/a;J)Lc/a/a/a/f2/j0/e;

    move-result-object v1

    .line 3
    iget-boolean v2, p0, Lc/a/a/a/f2/j0/f;->t:Z

    if-eqz v2, :cond_0

    .line 4
    new-instance p1, Lc/a/a/a/f2/j0/g$a;

    invoke-direct {p1}, Lc/a/a/a/f2/j0/g$a;-><init>()V

    return-object p1

    :cond_0
    const/4 v2, 0x0

    .line 5
    iget v3, p0, Lc/a/a/a/f2/j0/f;->c:I

    and-int/lit8 v3, v3, 0x2

    if-eqz v3, :cond_3

    const-wide/16 v2, -0x1

    if-eqz v1, :cond_1

    .line 6
    invoke-interface {v1}, Lc/a/a/a/f2/y;->j()J

    move-result-wide v2

    .line 7
    invoke-interface {v1}, Lc/a/a/a/f2/j0/g;->d()J

    move-result-wide v0

    :goto_0
    move-wide v9, v0

    move-wide v5, v2

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_2

    .line 8
    invoke-interface {v0}, Lc/a/a/a/f2/y;->j()J

    move-result-wide v2

    .line 9
    invoke-interface {v0}, Lc/a/a/a/f2/j0/g;->d()J

    move-result-wide v0

    goto :goto_0

    .line 10
    :cond_2
    iget-object v0, p0, Lc/a/a/a/f2/j0/f;->n:Lc/a/a/a/h2/a;

    invoke-static {v0}, Lc/a/a/a/f2/j0/f;->k(Lc/a/a/a/h2/a;)J

    move-result-wide v0

    move-wide v5, v0

    move-wide v9, v2

    .line 11
    :goto_1
    new-instance v0, Lc/a/a/a/f2/j0/d;

    .line 12
    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v7

    move-object v4, v0

    invoke-direct/range {v4 .. v10}, Lc/a/a/a/f2/j0/d;-><init>(JJJ)V

    goto :goto_2

    :cond_3
    if-eqz v1, :cond_4

    move-object v0, v1

    goto :goto_2

    :cond_4
    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    move-object v0, v2

    :goto_2
    if-eqz v0, :cond_6

    .line 13
    invoke-interface {v0}, Lc/a/a/a/f2/y;->f()Z

    move-result v1

    if-nez v1, :cond_7

    iget v1, p0, Lc/a/a/a/f2/j0/f;->c:I

    and-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_7

    .line 14
    :cond_6
    invoke-direct {p0, p1}, Lc/a/a/a/f2/j0/f;->j(Lc/a/a/a/f2/k;)Lc/a/a/a/f2/j0/g;

    move-result-object v0

    :cond_7
    return-object v0
.end method

.method private g(J)J
    .locals 4

    .line 1
    iget-wide v0, p0, Lc/a/a/a/f2/j0/f;->o:J

    const-wide/32 v2, 0xf4240

    mul-long p1, p1, v2

    iget-object v2, p0, Lc/a/a/a/f2/j0/f;->f:Lc/a/a/a/b2/c0$a;

    iget v2, v2, Lc/a/a/a/b2/c0$a;->d:I

    int-to-long v2, v2

    div-long/2addr p1, v2

    add-long/2addr v0, p1

    return-wide v0
.end method

.method private j(Lc/a/a/a/f2/k;)Lc/a/a/a/f2/j0/g;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/j0/f;->e:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-interface {p1, v0, v1, v2}, Lc/a/a/a/f2/k;->o([BII)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/j0/f;->e:Lc/a/a/a/m2/a0;

    invoke-virtual {v0, v1}, Lc/a/a/a/m2/a0;->P(I)V

    .line 3
    iget-object v0, p0, Lc/a/a/a/f2/j0/f;->f:Lc/a/a/a/b2/c0$a;

    iget-object v1, p0, Lc/a/a/a/f2/j0/f;->e:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->n()I

    move-result v1

    invoke-virtual {v0, v1}, Lc/a/a/a/b2/c0$a;->a(I)Z

    .line 4
    new-instance v0, Lc/a/a/a/f2/j0/c;

    invoke-interface {p1}, Lc/a/a/a/f2/k;->a()J

    move-result-wide v3

    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v5

    iget-object v7, p0, Lc/a/a/a/f2/j0/f;->f:Lc/a/a/a/b2/c0$a;

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lc/a/a/a/f2/j0/c;-><init>(JJLc/a/a/a/b2/c0$a;)V

    return-object v0
.end method

.method private static k(Lc/a/a/a/h2/a;)J
    .locals 5

    if-eqz p0, :cond_1

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/h2/a;->o()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 2
    invoke-virtual {p0, v1}, Lc/a/a/a/h2/a;->n(I)Lc/a/a/a/h2/a$b;

    move-result-object v2

    .line 3
    instance-of v3, v2, Lc/a/a/a/h2/m/m;

    if-eqz v3, :cond_0

    check-cast v2, Lc/a/a/a/h2/m/m;

    iget-object v3, v2, Lc/a/a/a/h2/m/i;->a:Ljava/lang/String;

    const-string v4, "TLEN"

    .line 4
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 5
    iget-object p0, v2, Lc/a/a/a/h2/m/m;->c:Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lc/a/a/a/i0;->c(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method private static l(Lc/a/a/a/m2/a0;I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->f()I

    move-result v0

    add-int/lit8 v1, p1, 0x4

    if-lt v0, v1, :cond_1

    .line 2
    invoke-virtual {p0, p1}, Lc/a/a/a/m2/a0;->P(I)V

    .line 3
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->n()I

    move-result p1

    const v0, 0x58696e67

    if-eq p1, v0, :cond_0

    const v0, 0x496e666f

    if-ne p1, v0, :cond_1

    :cond_0
    return p1

    .line 4
    :cond_1
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->f()I

    move-result p1

    const/16 v0, 0x28

    if-lt p1, v0, :cond_2

    const/16 p1, 0x24

    .line 5
    invoke-virtual {p0, p1}, Lc/a/a/a/m2/a0;->P(I)V

    .line 6
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->n()I

    move-result p0

    const p1, 0x56425249

    if-ne p0, p1, :cond_2

    return p1

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private static m(IJ)Z
    .locals 4

    const v0, -0x1f400

    and-int/2addr p0, v0

    int-to-long v0, p0

    const-wide/32 v2, -0x1f400

    and-long/2addr p1, v2

    cmp-long p0, v0, p1

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static synthetic n()[Lc/a/a/a/f2/j;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lc/a/a/a/f2/j;

    .line 1
    new-instance v1, Lc/a/a/a/f2/j0/f;

    invoke-direct {v1}, Lc/a/a/a/f2/j0/f;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method static synthetic o(IIIII)Z
    .locals 3

    const/4 v0, 0x2

    const/16 v1, 0x4d

    const/16 v2, 0x43

    if-ne p1, v2, :cond_0

    const/16 v2, 0x4f

    if-ne p2, v2, :cond_0

    if-ne p3, v1, :cond_0

    if-eq p4, v1, :cond_1

    if-eq p0, v0, :cond_1

    :cond_0
    if-ne p1, v1, :cond_2

    const/16 p1, 0x4c

    if-ne p2, p1, :cond_2

    if-ne p3, p1, :cond_2

    const/16 p1, 0x54

    if-eq p4, p1, :cond_1

    if-ne p0, v0, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static p(Lc/a/a/a/h2/a;J)Lc/a/a/a/f2/j0/e;
    .locals 4

    if-eqz p0, :cond_1

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/h2/a;->o()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 2
    invoke-virtual {p0, v1}, Lc/a/a/a/h2/a;->n(I)Lc/a/a/a/h2/a$b;

    move-result-object v2

    .line 3
    instance-of v3, v2, Lc/a/a/a/h2/m/k;

    if-eqz v3, :cond_0

    .line 4
    check-cast v2, Lc/a/a/a/h2/m/k;

    invoke-static {p0}, Lc/a/a/a/f2/j0/f;->k(Lc/a/a/a/h2/a;)J

    move-result-wide v0

    invoke-static {p1, p2, v2, v0, v1}, Lc/a/a/a/f2/j0/e;->a(JLc/a/a/a/h2/m/k;J)Lc/a/a/a/f2/j0/e;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private q(Lc/a/a/a/f2/k;)Lc/a/a/a/f2/j0/g;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v5, Lc/a/a/a/m2/a0;

    iget-object v0, p0, Lc/a/a/a/f2/j0/f;->f:Lc/a/a/a/b2/c0$a;

    iget v0, v0, Lc/a/a/a/b2/c0$a;->c:I

    invoke-direct {v5, v0}, Lc/a/a/a/m2/a0;-><init>(I)V

    .line 2
    invoke-virtual {v5}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    iget-object v1, p0, Lc/a/a/a/f2/j0/f;->f:Lc/a/a/a/b2/c0$a;

    iget v1, v1, Lc/a/a/a/b2/c0$a;->c:I

    const/4 v6, 0x0

    invoke-interface {p1, v0, v6, v1}, Lc/a/a/a/f2/k;->o([BII)V

    .line 3
    iget-object v0, p0, Lc/a/a/a/f2/j0/f;->f:Lc/a/a/a/b2/c0$a;

    iget v1, v0, Lc/a/a/a/b2/c0$a;->a:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    const/16 v3, 0x15

    if-eqz v1, :cond_0

    .line 4
    iget v0, v0, Lc/a/a/a/b2/c0$a;->e:I

    if-eq v0, v2, :cond_1

    const/16 v3, 0x24

    const/16 v7, 0x24

    goto :goto_0

    .line 5
    :cond_0
    iget v0, v0, Lc/a/a/a/b2/c0$a;->e:I

    if-eq v0, v2, :cond_2

    :cond_1
    const/16 v7, 0x15

    goto :goto_0

    :cond_2
    const/16 v3, 0xd

    const/16 v7, 0xd

    .line 6
    :goto_0
    invoke-static {v5, v7}, Lc/a/a/a/f2/j0/f;->l(Lc/a/a/a/m2/a0;I)I

    move-result v8

    const v0, 0x58696e67

    const v9, 0x496e666f

    if-eq v8, v0, :cond_5

    if-ne v8, v9, :cond_3

    goto :goto_1

    :cond_3
    const v0, 0x56425249

    if-ne v8, v0, :cond_4

    .line 7
    invoke-interface {p1}, Lc/a/a/a/f2/k;->a()J

    move-result-wide v0

    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v2

    iget-object v4, p0, Lc/a/a/a/f2/j0/f;->f:Lc/a/a/a/b2/c0$a;

    invoke-static/range {v0 .. v5}, Lc/a/a/a/f2/j0/h;->a(JJLc/a/a/a/b2/c0$a;Lc/a/a/a/m2/a0;)Lc/a/a/a/f2/j0/h;

    move-result-object v0

    .line 8
    iget-object v1, p0, Lc/a/a/a/f2/j0/f;->f:Lc/a/a/a/b2/c0$a;

    iget v1, v1, Lc/a/a/a/b2/c0$a;->c:I

    invoke-interface {p1, v1}, Lc/a/a/a/f2/k;->i(I)V

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    .line 9
    invoke-interface {p1}, Lc/a/a/a/f2/k;->h()V

    goto :goto_2

    .line 10
    :cond_5
    :goto_1
    invoke-interface {p1}, Lc/a/a/a/f2/k;->a()J

    move-result-wide v0

    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v2

    iget-object v4, p0, Lc/a/a/a/f2/j0/f;->f:Lc/a/a/a/b2/c0$a;

    invoke-static/range {v0 .. v5}, Lc/a/a/a/f2/j0/i;->a(JJLc/a/a/a/b2/c0$a;Lc/a/a/a/m2/a0;)Lc/a/a/a/f2/j0/i;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 11
    iget-object v1, p0, Lc/a/a/a/f2/j0/f;->g:Lc/a/a/a/f2/u;

    invoke-virtual {v1}, Lc/a/a/a/f2/u;->a()Z

    move-result v1

    if-nez v1, :cond_6

    .line 12
    invoke-interface {p1}, Lc/a/a/a/f2/k;->h()V

    add-int/lit16 v7, v7, 0x8d

    .line 13
    invoke-interface {p1, v7}, Lc/a/a/a/f2/k;->p(I)V

    .line 14
    iget-object v1, p0, Lc/a/a/a/f2/j0/f;->e:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v1

    const/4 v2, 0x3

    invoke-interface {p1, v1, v6, v2}, Lc/a/a/a/f2/k;->o([BII)V

    .line 15
    iget-object v1, p0, Lc/a/a/a/f2/j0/f;->e:Lc/a/a/a/m2/a0;

    invoke-virtual {v1, v6}, Lc/a/a/a/m2/a0;->P(I)V

    .line 16
    iget-object v1, p0, Lc/a/a/a/f2/j0/f;->g:Lc/a/a/a/f2/u;

    iget-object v2, p0, Lc/a/a/a/f2/j0/f;->e:Lc/a/a/a/m2/a0;

    invoke-virtual {v2}, Lc/a/a/a/m2/a0;->G()I

    move-result v2

    invoke-virtual {v1, v2}, Lc/a/a/a/f2/u;->d(I)Z

    .line 17
    :cond_6
    iget-object v1, p0, Lc/a/a/a/f2/j0/f;->f:Lc/a/a/a/b2/c0$a;

    iget v1, v1, Lc/a/a/a/b2/c0$a;->c:I

    invoke-interface {p1, v1}, Lc/a/a/a/f2/k;->i(I)V

    if-eqz v0, :cond_7

    .line 18
    invoke-interface {v0}, Lc/a/a/a/f2/y;->f()Z

    move-result v1

    if-nez v1, :cond_7

    if-ne v8, v9, :cond_7

    .line 19
    invoke-direct {p0, p1}, Lc/a/a/a/f2/j0/f;->j(Lc/a/a/a/f2/k;)Lc/a/a/a/f2/j0/g;

    move-result-object p1

    return-object p1

    :cond_7
    :goto_2
    return-object v0
.end method

.method private r(Lc/a/a/a/f2/k;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/j0/f;->s:Lc/a/a/a/f2/j0/g;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lc/a/a/a/f2/j0/g;->d()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {p1}, Lc/a/a/a/f2/k;->n()J

    move-result-wide v4

    const-wide/16 v6, 0x4

    sub-long/2addr v2, v6

    cmp-long v0, v4, v2

    if-lez v0, :cond_0

    return v1

    .line 4
    :cond_0
    :try_start_0
    iget-object v0, p0, Lc/a/a/a/f2/j0/f;->e:Lc/a/a/a/m2/a0;

    .line 5
    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x4

    .line 6
    invoke-interface {p1, v0, v2, v3, v1}, Lc/a/a/a/f2/k;->m([BIIZ)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    xor-int/2addr p1, v1

    return p1

    :catch_0
    return v1
.end method

.method private s(Lc/a/a/a/f2/k;)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "extractorOutput",
            "realTrackOutput"
        }
    .end annotation

    .line 1
    iget v0, p0, Lc/a/a/a/f2/j0/f;->m:I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-direct {p0, p1, v0}, Lc/a/a/a/f2/j0/f;->u(Lc/a/a/a/f2/k;Z)Z
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, -0x1

    return p1

    .line 3
    :cond_0
    :goto_0
    iget-object v0, p0, Lc/a/a/a/f2/j0/f;->s:Lc/a/a/a/f2/j0/g;

    if-nez v0, :cond_2

    .line 4
    invoke-direct {p0, p1}, Lc/a/a/a/f2/j0/f;->f(Lc/a/a/a/f2/k;)Lc/a/a/a/f2/j0/g;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/f2/j0/f;->s:Lc/a/a/a/f2/j0/g;

    .line 5
    iget-object v1, p0, Lc/a/a/a/f2/j0/f;->j:Lc/a/a/a/f2/l;

    invoke-interface {v1, v0}, Lc/a/a/a/f2/l;->f(Lc/a/a/a/f2/y;)V

    .line 6
    iget-object v0, p0, Lc/a/a/a/f2/j0/f;->l:Lc/a/a/a/f2/b0;

    new-instance v1, Lc/a/a/a/u0$b;

    invoke-direct {v1}, Lc/a/a/a/u0$b;-><init>()V

    iget-object v2, p0, Lc/a/a/a/f2/j0/f;->f:Lc/a/a/a/b2/c0$a;

    iget-object v2, v2, Lc/a/a/a/b2/c0$a;->b:Ljava/lang/String;

    .line 7
    invoke-virtual {v1, v2}, Lc/a/a/a/u0$b;->e0(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v1

    const/16 v2, 0x1000

    .line 8
    invoke-virtual {v1, v2}, Lc/a/a/a/u0$b;->W(I)Lc/a/a/a/u0$b;

    move-result-object v1

    iget-object v2, p0, Lc/a/a/a/f2/j0/f;->f:Lc/a/a/a/b2/c0$a;

    iget v2, v2, Lc/a/a/a/b2/c0$a;->e:I

    .line 9
    invoke-virtual {v1, v2}, Lc/a/a/a/u0$b;->H(I)Lc/a/a/a/u0$b;

    move-result-object v1

    iget-object v2, p0, Lc/a/a/a/f2/j0/f;->f:Lc/a/a/a/b2/c0$a;

    iget v2, v2, Lc/a/a/a/b2/c0$a;->d:I

    .line 10
    invoke-virtual {v1, v2}, Lc/a/a/a/u0$b;->f0(I)Lc/a/a/a/u0$b;

    move-result-object v1

    iget-object v2, p0, Lc/a/a/a/f2/j0/f;->g:Lc/a/a/a/f2/u;

    iget v2, v2, Lc/a/a/a/f2/u;->b:I

    .line 11
    invoke-virtual {v1, v2}, Lc/a/a/a/u0$b;->M(I)Lc/a/a/a/u0$b;

    move-result-object v1

    iget-object v2, p0, Lc/a/a/a/f2/j0/f;->g:Lc/a/a/a/f2/u;

    iget v2, v2, Lc/a/a/a/f2/u;->c:I

    .line 12
    invoke-virtual {v1, v2}, Lc/a/a/a/u0$b;->N(I)Lc/a/a/a/u0$b;

    move-result-object v1

    .line 13
    iget v2, p0, Lc/a/a/a/f2/j0/f;->c:I

    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lc/a/a/a/f2/j0/f;->n:Lc/a/a/a/h2/a;

    :goto_1
    invoke-virtual {v1, v2}, Lc/a/a/a/u0$b;->X(Lc/a/a/a/h2/a;)Lc/a/a/a/u0$b;

    move-result-object v1

    .line 14
    invoke-virtual {v1}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object v1

    .line 15
    invoke-interface {v0, v1}, Lc/a/a/a/f2/b0;->d(Lc/a/a/a/u0;)V

    .line 16
    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v0

    iput-wide v0, p0, Lc/a/a/a/f2/j0/f;->q:J

    goto :goto_2

    .line 17
    :cond_2
    iget-wide v0, p0, Lc/a/a/a/f2/j0/f;->q:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_3

    .line 18
    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v0

    .line 19
    iget-wide v2, p0, Lc/a/a/a/f2/j0/f;->q:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_3

    sub-long/2addr v2, v0

    long-to-int v0, v2

    .line 20
    invoke-interface {p1, v0}, Lc/a/a/a/f2/k;->i(I)V

    .line 21
    :cond_3
    :goto_2
    invoke-direct {p0, p1}, Lc/a/a/a/f2/j0/f;->t(Lc/a/a/a/f2/k;)I

    move-result p1

    return p1
.end method

.method private t(Lc/a/a/a/f2/k;)I
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "realTrackOutput",
            "seeker"
        }
    .end annotation

    .line 1
    iget v0, p0, Lc/a/a/a/f2/j0/f;->r:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-nez v0, :cond_4

    .line 2
    invoke-interface {p1}, Lc/a/a/a/f2/k;->h()V

    .line 3
    invoke-direct {p0, p1}, Lc/a/a/a/f2/j0/f;->r(Lc/a/a/a/f2/k;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    .line 4
    :cond_0
    iget-object v0, p0, Lc/a/a/a/f2/j0/f;->e:Lc/a/a/a/m2/a0;

    invoke-virtual {v0, v3}, Lc/a/a/a/m2/a0;->P(I)V

    .line 5
    iget-object v0, p0, Lc/a/a/a/f2/j0/f;->e:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->n()I

    move-result v0

    .line 6
    iget v4, p0, Lc/a/a/a/f2/j0/f;->m:I

    int-to-long v4, v4

    invoke-static {v0, v4, v5}, Lc/a/a/a/f2/j0/f;->m(IJ)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 7
    invoke-static {v0}, Lc/a/a/a/b2/c0;->j(I)I

    move-result v4

    if-ne v4, v2, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    iget-object v4, p0, Lc/a/a/a/f2/j0/f;->f:Lc/a/a/a/b2/c0$a;

    invoke-virtual {v4, v0}, Lc/a/a/a/b2/c0$a;->a(I)Z

    .line 9
    iget-wide v4, p0, Lc/a/a/a/f2/j0/f;->o:J

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v4, v6

    if-nez v0, :cond_2

    .line 10
    iget-object v0, p0, Lc/a/a/a/f2/j0/f;->s:Lc/a/a/a/f2/j0/g;

    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v4

    invoke-interface {v0, v4, v5}, Lc/a/a/a/f2/j0/g;->g(J)J

    move-result-wide v4

    iput-wide v4, p0, Lc/a/a/a/f2/j0/f;->o:J

    .line 11
    iget-wide v4, p0, Lc/a/a/a/f2/j0/f;->d:J

    cmp-long v0, v4, v6

    if-eqz v0, :cond_2

    .line 12
    iget-object v0, p0, Lc/a/a/a/f2/j0/f;->s:Lc/a/a/a/f2/j0/g;

    const-wide/16 v4, 0x0

    invoke-interface {v0, v4, v5}, Lc/a/a/a/f2/j0/g;->g(J)J

    move-result-wide v4

    .line 13
    iget-wide v6, p0, Lc/a/a/a/f2/j0/f;->o:J

    iget-wide v8, p0, Lc/a/a/a/f2/j0/f;->d:J

    sub-long/2addr v8, v4

    add-long/2addr v6, v8

    iput-wide v6, p0, Lc/a/a/a/f2/j0/f;->o:J

    .line 14
    :cond_2
    iget-object v0, p0, Lc/a/a/a/f2/j0/f;->f:Lc/a/a/a/b2/c0$a;

    iget v4, v0, Lc/a/a/a/b2/c0$a;->c:I

    iput v4, p0, Lc/a/a/a/f2/j0/f;->r:I

    .line 15
    iget-object v4, p0, Lc/a/a/a/f2/j0/f;->s:Lc/a/a/a/f2/j0/g;

    instance-of v5, v4, Lc/a/a/a/f2/j0/d;

    if-eqz v5, :cond_4

    .line 16
    check-cast v4, Lc/a/a/a/f2/j0/d;

    .line 17
    iget-wide v5, p0, Lc/a/a/a/f2/j0/f;->p:J

    iget v0, v0, Lc/a/a/a/b2/c0$a;->g:I

    int-to-long v7, v0

    add-long/2addr v5, v7

    .line 18
    invoke-direct {p0, v5, v6}, Lc/a/a/a/f2/j0/f;->g(J)J

    move-result-wide v5

    .line 19
    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v7

    iget-object v0, p0, Lc/a/a/a/f2/j0/f;->f:Lc/a/a/a/b2/c0$a;

    iget v0, v0, Lc/a/a/a/b2/c0$a;->c:I

    int-to-long v9, v0

    add-long/2addr v7, v9

    .line 20
    invoke-virtual {v4, v5, v6, v7, v8}, Lc/a/a/a/f2/j0/d;->b(JJ)V

    .line 21
    iget-boolean v0, p0, Lc/a/a/a/f2/j0/f;->u:Z

    if-eqz v0, :cond_4

    iget-wide v5, p0, Lc/a/a/a/f2/j0/f;->v:J

    invoke-virtual {v4, v5, v6}, Lc/a/a/a/f2/j0/d;->a(J)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 22
    iput-boolean v3, p0, Lc/a/a/a/f2/j0/f;->u:Z

    .line 23
    iget-object v0, p0, Lc/a/a/a/f2/j0/f;->k:Lc/a/a/a/f2/b0;

    iput-object v0, p0, Lc/a/a/a/f2/j0/f;->l:Lc/a/a/a/f2/b0;

    goto :goto_1

    .line 24
    :cond_3
    :goto_0
    invoke-interface {p1, v1}, Lc/a/a/a/f2/k;->i(I)V

    .line 25
    iput v3, p0, Lc/a/a/a/f2/j0/f;->m:I

    return v3

    .line 26
    :cond_4
    :goto_1
    iget-object v0, p0, Lc/a/a/a/f2/j0/f;->l:Lc/a/a/a/f2/b0;

    iget v4, p0, Lc/a/a/a/f2/j0/f;->r:I

    invoke-interface {v0, p1, v4, v1}, Lc/a/a/a/f2/b0;->f(Lcom/google/android/exoplayer2/upstream/j;IZ)I

    move-result p1

    if-ne p1, v2, :cond_5

    return v2

    .line 27
    :cond_5
    iget v0, p0, Lc/a/a/a/f2/j0/f;->r:I

    sub-int/2addr v0, p1

    iput v0, p0, Lc/a/a/a/f2/j0/f;->r:I

    if-lez v0, :cond_6

    return v3

    .line 28
    :cond_6
    iget-object v4, p0, Lc/a/a/a/f2/j0/f;->l:Lc/a/a/a/f2/b0;

    iget-wide v0, p0, Lc/a/a/a/f2/j0/f;->p:J

    .line 29
    invoke-direct {p0, v0, v1}, Lc/a/a/a/f2/j0/f;->g(J)J

    move-result-wide v5

    const/4 v7, 0x1

    iget-object p1, p0, Lc/a/a/a/f2/j0/f;->f:Lc/a/a/a/b2/c0$a;

    iget v8, p1, Lc/a/a/a/b2/c0$a;->c:I

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 30
    invoke-interface/range {v4 .. v10}, Lc/a/a/a/f2/b0;->c(JIIILc/a/a/a/f2/b0$a;)V

    .line 31
    iget-wide v0, p0, Lc/a/a/a/f2/j0/f;->p:J

    iget-object p1, p0, Lc/a/a/a/f2/j0/f;->f:Lc/a/a/a/b2/c0$a;

    iget p1, p1, Lc/a/a/a/b2/c0$a;->g:I

    int-to-long v4, p1

    add-long/2addr v0, v4

    iput-wide v0, p0, Lc/a/a/a/f2/j0/f;->p:J

    .line 32
    iput v3, p0, Lc/a/a/a/f2/j0/f;->r:I

    return v3
.end method

.method private u(Lc/a/a/a/f2/k;Z)Z
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p2, :cond_0

    const v0, 0x8000

    goto :goto_0

    :cond_0
    const/high16 v0, 0x20000

    .line 1
    :goto_0
    invoke-interface {p1}, Lc/a/a/a/f2/k;->h()V

    .line 2
    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x1

    const/4 v7, 0x0

    cmp-long v8, v1, v3

    if-nez v8, :cond_5

    .line 3
    iget v1, p0, Lc/a/a/a/f2/j0/f;->c:I

    and-int/2addr v1, v5

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_2

    const/4 v1, 0x0

    goto :goto_2

    .line 4
    :cond_2
    sget-object v1, Lc/a/a/a/f2/j0/f;->b:Lc/a/a/a/h2/m/h$a;

    .line 5
    :goto_2
    iget-object v2, p0, Lc/a/a/a/f2/j0/f;->h:Lc/a/a/a/f2/v;

    invoke-virtual {v2, p1, v1}, Lc/a/a/a/f2/v;->a(Lc/a/a/a/f2/k;Lc/a/a/a/h2/m/h$a;)Lc/a/a/a/h2/a;

    move-result-object v1

    iput-object v1, p0, Lc/a/a/a/f2/j0/f;->n:Lc/a/a/a/h2/a;

    if-eqz v1, :cond_3

    .line 6
    iget-object v2, p0, Lc/a/a/a/f2/j0/f;->g:Lc/a/a/a/f2/u;

    invoke-virtual {v2, v1}, Lc/a/a/a/f2/u;->c(Lc/a/a/a/h2/a;)Z

    .line 7
    :cond_3
    invoke-interface {p1}, Lc/a/a/a/f2/k;->n()J

    move-result-wide v1

    long-to-int v2, v1

    if-nez p2, :cond_4

    .line 8
    invoke-interface {p1, v2}, Lc/a/a/a/f2/k;->i(I)V

    :cond_4
    const/4 v1, 0x0

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_3
    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 9
    :goto_4
    invoke-direct {p0, p1}, Lc/a/a/a/f2/j0/f;->r(Lc/a/a/a/f2/k;)Z

    move-result v8

    if-eqz v8, :cond_7

    if-lez v3, :cond_6

    goto :goto_6

    .line 10
    :cond_6
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    .line 11
    :cond_7
    iget-object v8, p0, Lc/a/a/a/f2/j0/f;->e:Lc/a/a/a/m2/a0;

    invoke-virtual {v8, v7}, Lc/a/a/a/m2/a0;->P(I)V

    .line 12
    iget-object v8, p0, Lc/a/a/a/f2/j0/f;->e:Lc/a/a/a/m2/a0;

    invoke-virtual {v8}, Lc/a/a/a/m2/a0;->n()I

    move-result v8

    if-eqz v1, :cond_8

    int-to-long v9, v1

    .line 13
    invoke-static {v8, v9, v10}, Lc/a/a/a/f2/j0/f;->m(IJ)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 14
    :cond_8
    invoke-static {v8}, Lc/a/a/a/b2/c0;->j(I)I

    move-result v9

    const/4 v10, -0x1

    if-ne v9, v10, :cond_d

    :cond_9
    add-int/lit8 v1, v4, 0x1

    if-ne v4, v0, :cond_b

    if-eqz p2, :cond_a

    return v7

    .line 15
    :cond_a
    new-instance p1, Lc/a/a/a/g1;

    const-string p2, "Searched too many bytes."

    invoke-direct {p1, p2}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    if-eqz p2, :cond_c

    .line 16
    invoke-interface {p1}, Lc/a/a/a/f2/k;->h()V

    add-int v3, v2, v1

    .line 17
    invoke-interface {p1, v3}, Lc/a/a/a/f2/k;->p(I)V

    goto :goto_5

    .line 18
    :cond_c
    invoke-interface {p1, v6}, Lc/a/a/a/f2/k;->i(I)V

    :goto_5
    move v4, v1

    const/4 v1, 0x0

    const/4 v3, 0x0

    goto :goto_4

    :cond_d
    add-int/lit8 v3, v3, 0x1

    if-ne v3, v6, :cond_e

    .line 19
    iget-object v1, p0, Lc/a/a/a/f2/j0/f;->f:Lc/a/a/a/b2/c0$a;

    invoke-virtual {v1, v8}, Lc/a/a/a/b2/c0$a;->a(I)Z

    move v1, v8

    goto :goto_8

    :cond_e
    if-ne v3, v5, :cond_10

    :goto_6
    if-eqz p2, :cond_f

    add-int/2addr v2, v4

    .line 20
    invoke-interface {p1, v2}, Lc/a/a/a/f2/k;->i(I)V

    goto :goto_7

    .line 21
    :cond_f
    invoke-interface {p1}, Lc/a/a/a/f2/k;->h()V

    .line 22
    :goto_7
    iput v1, p0, Lc/a/a/a/f2/j0/f;->m:I

    return v6

    :cond_10
    :goto_8
    add-int/lit8 v9, v9, -0x4

    .line 23
    invoke-interface {p1, v9}, Lc/a/a/a/f2/k;->p(I)V

    goto :goto_4
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(Lc/a/a/a/f2/l;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lc/a/a/a/f2/j0/f;->j:Lc/a/a/a/f2/l;

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 2
    invoke-interface {p1, v0, v1}, Lc/a/a/a/f2/l;->q(II)Lc/a/a/a/f2/b0;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/f2/j0/f;->k:Lc/a/a/a/f2/b0;

    .line 3
    iput-object p1, p0, Lc/a/a/a/f2/j0/f;->l:Lc/a/a/a/f2/b0;

    .line 4
    iget-object p1, p0, Lc/a/a/a/f2/j0/f;->j:Lc/a/a/a/f2/l;

    invoke-interface {p1}, Lc/a/a/a/f2/l;->h()V

    return-void
.end method

.method public c(JJ)V
    .locals 2

    const/4 p1, 0x0

    .line 1
    iput p1, p0, Lc/a/a/a/f2/j0/f;->m:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    iput-wide v0, p0, Lc/a/a/a/f2/j0/f;->o:J

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lc/a/a/a/f2/j0/f;->p:J

    .line 4
    iput p1, p0, Lc/a/a/a/f2/j0/f;->r:I

    .line 5
    iput-wide p3, p0, Lc/a/a/a/f2/j0/f;->v:J

    .line 6
    iget-object p1, p0, Lc/a/a/a/f2/j0/f;->s:Lc/a/a/a/f2/j0/g;

    instance-of p2, p1, Lc/a/a/a/f2/j0/d;

    if-eqz p2, :cond_0

    check-cast p1, Lc/a/a/a/f2/j0/d;

    invoke-virtual {p1, p3, p4}, Lc/a/a/a/f2/j0/d;->a(J)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lc/a/a/a/f2/j0/f;->u:Z

    .line 8
    iget-object p1, p0, Lc/a/a/a/f2/j0/f;->i:Lc/a/a/a/f2/b0;

    iput-object p1, p0, Lc/a/a/a/f2/j0/f;->l:Lc/a/a/a/f2/b0;

    :cond_0
    return-void
.end method

.method public e(Lc/a/a/a/f2/k;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, v0}, Lc/a/a/a/f2/j0/f;->u(Lc/a/a/a/f2/k;Z)Z

    move-result p1

    return p1
.end method

.method public h()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/f2/j0/f;->t:Z

    return-void
.end method

.method public i(Lc/a/a/a/f2/k;Lc/a/a/a/f2/x;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lc/a/a/a/f2/j0/f;->d()V

    .line 2
    invoke-direct {p0, p1}, Lc/a/a/a/f2/j0/f;->s(Lc/a/a/a/f2/k;)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    .line 3
    iget-object p2, p0, Lc/a/a/a/f2/j0/f;->s:Lc/a/a/a/f2/j0/g;

    instance-of p2, p2, Lc/a/a/a/f2/j0/d;

    if-eqz p2, :cond_0

    .line 4
    iget-wide v0, p0, Lc/a/a/a/f2/j0/f;->p:J

    invoke-direct {p0, v0, v1}, Lc/a/a/a/f2/j0/f;->g(J)J

    move-result-wide v0

    .line 5
    iget-object p2, p0, Lc/a/a/a/f2/j0/f;->s:Lc/a/a/a/f2/j0/g;

    invoke-interface {p2}, Lc/a/a/a/f2/y;->j()J

    move-result-wide v2

    cmp-long p2, v2, v0

    if-eqz p2, :cond_0

    .line 6
    iget-object p2, p0, Lc/a/a/a/f2/j0/f;->s:Lc/a/a/a/f2/j0/g;

    check-cast p2, Lc/a/a/a/f2/j0/d;

    invoke-virtual {p2, v0, v1}, Lc/a/a/a/f2/j0/d;->c(J)V

    .line 7
    iget-object p2, p0, Lc/a/a/a/f2/j0/f;->j:Lc/a/a/a/f2/l;

    iget-object v0, p0, Lc/a/a/a/f2/j0/f;->s:Lc/a/a/a/f2/j0/g;

    invoke-interface {p2, v0}, Lc/a/a/a/f2/l;->f(Lc/a/a/a/f2/y;)V

    :cond_0
    return p1
.end method
