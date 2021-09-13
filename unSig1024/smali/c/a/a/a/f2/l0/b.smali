.class final Lc/a/a/a/f2/l0/b;
.super Ljava/lang/Object;
.source "DefaultOggSeeker.java"

# interfaces
.implements Lc/a/a/a/f2/l0/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/f2/l0/b$b;
    }
.end annotation


# instance fields
.field private final a:Lc/a/a/a/f2/l0/f;

.field private final b:J

.field private final c:J

.field private final d:Lc/a/a/a/f2/l0/i;

.field private e:I

.field private f:J

.field private g:J

.field private h:J

.field private i:J

.field private j:J

.field private k:J

.field private l:J


# direct methods
.method public constructor <init>(Lc/a/a/a/f2/l0/i;JJJJZ)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    cmp-long v3, p2, v1

    if-ltz v3, :cond_0

    cmp-long v1, p4, p2

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 2
    :goto_0
    invoke-static {v1}, Lc/a/a/a/m2/f;->a(Z)V

    .line 3
    iput-object p1, p0, Lc/a/a/a/f2/l0/b;->d:Lc/a/a/a/f2/l0/i;

    .line 4
    iput-wide p2, p0, Lc/a/a/a/f2/l0/b;->b:J

    .line 5
    iput-wide p4, p0, Lc/a/a/a/f2/l0/b;->c:J

    sub-long/2addr p4, p2

    cmp-long p1, p6, p4

    if-eqz p1, :cond_2

    if-eqz p10, :cond_1

    goto :goto_1

    .line 6
    :cond_1
    iput v0, p0, Lc/a/a/a/f2/l0/b;->e:I

    goto :goto_2

    .line 7
    :cond_2
    :goto_1
    iput-wide p8, p0, Lc/a/a/a/f2/l0/b;->f:J

    const/4 p1, 0x4

    .line 8
    iput p1, p0, Lc/a/a/a/f2/l0/b;->e:I

    .line 9
    :goto_2
    new-instance p1, Lc/a/a/a/f2/l0/f;

    invoke-direct {p1}, Lc/a/a/a/f2/l0/f;-><init>()V

    iput-object p1, p0, Lc/a/a/a/f2/l0/b;->a:Lc/a/a/a/f2/l0/f;

    return-void
.end method

.method static synthetic d(Lc/a/a/a/f2/l0/b;)Lc/a/a/a/f2/l0/i;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/f2/l0/b;->d:Lc/a/a/a/f2/l0/i;

    return-object p0
.end method

.method static synthetic e(Lc/a/a/a/f2/l0/b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/f2/l0/b;->b:J

    return-wide v0
.end method

.method static synthetic f(Lc/a/a/a/f2/l0/b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/f2/l0/b;->c:J

    return-wide v0
.end method

.method static synthetic g(Lc/a/a/a/f2/l0/b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/f2/l0/b;->f:J

    return-wide v0
.end method

.method private i(Lc/a/a/a/f2/k;)J
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lc/a/a/a/f2/l0/b;->i:J

    iget-wide v2, p0, Lc/a/a/a/f2/l0/b;->j:J

    const-wide/16 v4, -0x1

    cmp-long v6, v0, v2

    if-nez v6, :cond_0

    return-wide v4

    .line 2
    :cond_0
    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v0

    .line 3
    iget-object v2, p0, Lc/a/a/a/f2/l0/b;->a:Lc/a/a/a/f2/l0/f;

    iget-wide v6, p0, Lc/a/a/a/f2/l0/b;->j:J

    invoke-virtual {v2, p1, v6, v7}, Lc/a/a/a/f2/l0/f;->e(Lc/a/a/a/f2/k;J)Z

    move-result v2

    if-nez v2, :cond_2

    .line 4
    iget-wide v2, p0, Lc/a/a/a/f2/l0/b;->i:J

    cmp-long p1, v2, v0

    if-eqz p1, :cond_1

    return-wide v2

    .line 5
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "No ogg page can be found."

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 6
    :cond_2
    iget-object v2, p0, Lc/a/a/a/f2/l0/b;->a:Lc/a/a/a/f2/l0/f;

    const/4 v3, 0x0

    invoke-virtual {v2, p1, v3}, Lc/a/a/a/f2/l0/f;->b(Lc/a/a/a/f2/k;Z)Z

    .line 7
    invoke-interface {p1}, Lc/a/a/a/f2/k;->h()V

    .line 8
    iget-wide v2, p0, Lc/a/a/a/f2/l0/b;->h:J

    iget-object v6, p0, Lc/a/a/a/f2/l0/b;->a:Lc/a/a/a/f2/l0/f;

    iget-wide v7, v6, Lc/a/a/a/f2/l0/f;->c:J

    sub-long/2addr v2, v7

    .line 9
    iget v9, v6, Lc/a/a/a/f2/l0/f;->h:I

    iget v6, v6, Lc/a/a/a/f2/l0/f;->i:I

    add-int/2addr v9, v6

    const-wide/16 v10, 0x0

    cmp-long v6, v10, v2

    if-gtz v6, :cond_3

    const-wide/32 v12, 0x11940

    cmp-long v6, v2, v12

    if-gez v6, :cond_3

    return-wide v4

    :cond_3
    cmp-long v4, v2, v10

    if-gez v4, :cond_4

    .line 10
    iput-wide v0, p0, Lc/a/a/a/f2/l0/b;->j:J

    .line 11
    iput-wide v7, p0, Lc/a/a/a/f2/l0/b;->l:J

    goto :goto_0

    .line 12
    :cond_4
    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v0

    int-to-long v4, v9

    add-long/2addr v0, v4

    iput-wide v0, p0, Lc/a/a/a/f2/l0/b;->i:J

    .line 13
    iget-object v0, p0, Lc/a/a/a/f2/l0/b;->a:Lc/a/a/a/f2/l0/f;

    iget-wide v0, v0, Lc/a/a/a/f2/l0/f;->c:J

    iput-wide v0, p0, Lc/a/a/a/f2/l0/b;->k:J

    .line 14
    :goto_0
    iget-wide v0, p0, Lc/a/a/a/f2/l0/b;->j:J

    iget-wide v4, p0, Lc/a/a/a/f2/l0/b;->i:J

    sub-long/2addr v0, v4

    const-wide/32 v6, 0x186a0

    cmp-long v8, v0, v6

    if-gez v8, :cond_5

    .line 15
    iput-wide v4, p0, Lc/a/a/a/f2/l0/b;->j:J

    return-wide v4

    :cond_5
    int-to-long v0, v9

    const-wide/16 v4, 0x1

    cmp-long v6, v2, v10

    if-gtz v6, :cond_6

    const-wide/16 v6, 0x2

    goto :goto_1

    :cond_6
    move-wide v6, v4

    :goto_1
    mul-long v0, v0, v6

    .line 16
    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v6

    sub-long/2addr v6, v0

    iget-wide v0, p0, Lc/a/a/a/f2/l0/b;->j:J

    iget-wide v10, p0, Lc/a/a/a/f2/l0/b;->i:J

    sub-long v8, v0, v10

    mul-long v2, v2, v8

    iget-wide v8, p0, Lc/a/a/a/f2/l0/b;->l:J

    iget-wide v12, p0, Lc/a/a/a/f2/l0/b;->k:J

    sub-long/2addr v8, v12

    div-long/2addr v2, v8

    add-long v8, v6, v2

    sub-long v12, v0, v4

    .line 17
    invoke-static/range {v8 .. v13}, Lc/a/a/a/m2/m0;->q(JJJ)J

    move-result-wide v0

    return-wide v0
.end method

.method private k(Lc/a/a/a/f2/k;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :goto_0
    iget-object v0, p0, Lc/a/a/a/f2/l0/b;->a:Lc/a/a/a/f2/l0/f;

    invoke-virtual {v0, p1}, Lc/a/a/a/f2/l0/f;->d(Lc/a/a/a/f2/k;)Z

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/l0/b;->a:Lc/a/a/a/f2/l0/f;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lc/a/a/a/f2/l0/f;->b(Lc/a/a/a/f2/k;Z)Z

    .line 3
    iget-object v0, p0, Lc/a/a/a/f2/l0/b;->a:Lc/a/a/a/f2/l0/f;

    iget-wide v1, v0, Lc/a/a/a/f2/l0/f;->c:J

    iget-wide v3, p0, Lc/a/a/a/f2/l0/b;->h:J

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    .line 4
    invoke-interface {p1}, Lc/a/a/a/f2/k;->h()V

    return-void

    .line 5
    :cond_0
    iget v1, v0, Lc/a/a/a/f2/l0/f;->h:I

    iget v0, v0, Lc/a/a/a/f2/l0/f;->i:I

    add-int/2addr v1, v0

    invoke-interface {p1, v1}, Lc/a/a/a/f2/k;->i(I)V

    .line 6
    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v0

    iput-wide v0, p0, Lc/a/a/a/f2/l0/b;->i:J

    .line 7
    iget-object v0, p0, Lc/a/a/a/f2/l0/b;->a:Lc/a/a/a/f2/l0/f;

    iget-wide v0, v0, Lc/a/a/a/f2/l0/f;->c:J

    iput-wide v0, p0, Lc/a/a/a/f2/l0/b;->k:J

    goto :goto_0
.end method


# virtual methods
.method public a(Lc/a/a/a/f2/k;)J
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lc/a/a/a/f2/l0/b;->e:I

    const/4 v1, 0x1

    const/4 v2, 0x4

    if-eqz v0, :cond_4

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    const-wide/16 v3, -0x1

    const/4 v5, 0x3

    if-eq v0, v1, :cond_1

    if-eq v0, v5, :cond_3

    if-ne v0, v2, :cond_0

    return-wide v3

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 3
    :cond_1
    invoke-direct {p0, p1}, Lc/a/a/a/f2/l0/b;->i(Lc/a/a/a/f2/k;)J

    move-result-wide v0

    cmp-long v6, v0, v3

    if-eqz v6, :cond_2

    return-wide v0

    .line 4
    :cond_2
    iput v5, p0, Lc/a/a/a/f2/l0/b;->e:I

    .line 5
    :cond_3
    invoke-direct {p0, p1}, Lc/a/a/a/f2/l0/b;->k(Lc/a/a/a/f2/k;)V

    .line 6
    iput v2, p0, Lc/a/a/a/f2/l0/b;->e:I

    .line 7
    iget-wide v0, p0, Lc/a/a/a/f2/l0/b;->k:J

    const-wide/16 v2, 0x2

    add-long/2addr v0, v2

    neg-long v0, v0

    return-wide v0

    .line 8
    :cond_4
    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v3

    iput-wide v3, p0, Lc/a/a/a/f2/l0/b;->g:J

    .line 9
    iput v1, p0, Lc/a/a/a/f2/l0/b;->e:I

    .line 10
    iget-wide v0, p0, Lc/a/a/a/f2/l0/b;->c:J

    const-wide/32 v5, 0xff1b

    sub-long/2addr v0, v5

    cmp-long v5, v0, v3

    if-lez v5, :cond_5

    return-wide v0

    .line 11
    :cond_5
    invoke-virtual {p0, p1}, Lc/a/a/a/f2/l0/b;->j(Lc/a/a/a/f2/k;)J

    move-result-wide v0

    iput-wide v0, p0, Lc/a/a/a/f2/l0/b;->f:J

    .line 12
    iput v2, p0, Lc/a/a/a/f2/l0/b;->e:I

    .line 13
    iget-wide v0, p0, Lc/a/a/a/f2/l0/b;->g:J

    return-wide v0
.end method

.method public bridge synthetic b()Lc/a/a/a/f2/y;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/f2/l0/b;->h()Lc/a/a/a/f2/l0/b$b;

    move-result-object v0

    return-object v0
.end method

.method public c(J)V
    .locals 10

    .line 1
    iget-wide v0, p0, Lc/a/a/a/f2/l0/b;->f:J

    const-wide/16 v2, 0x1

    sub-long v8, v0, v2

    const-wide/16 v6, 0x0

    move-wide v4, p1

    invoke-static/range {v4 .. v9}, Lc/a/a/a/m2/m0;->q(JJJ)J

    move-result-wide p1

    iput-wide p1, p0, Lc/a/a/a/f2/l0/b;->h:J

    const/4 p1, 0x2

    .line 2
    iput p1, p0, Lc/a/a/a/f2/l0/b;->e:I

    .line 3
    iget-wide p1, p0, Lc/a/a/a/f2/l0/b;->b:J

    iput-wide p1, p0, Lc/a/a/a/f2/l0/b;->i:J

    .line 4
    iget-wide p1, p0, Lc/a/a/a/f2/l0/b;->c:J

    iput-wide p1, p0, Lc/a/a/a/f2/l0/b;->j:J

    const-wide/16 p1, 0x0

    .line 5
    iput-wide p1, p0, Lc/a/a/a/f2/l0/b;->k:J

    .line 6
    iget-wide p1, p0, Lc/a/a/a/f2/l0/b;->f:J

    iput-wide p1, p0, Lc/a/a/a/f2/l0/b;->l:J

    return-void
.end method

.method public h()Lc/a/a/a/f2/l0/b$b;
    .locals 6

    .line 1
    iget-wide v0, p0, Lc/a/a/a/f2/l0/b;->f:J

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-eqz v5, :cond_0

    new-instance v0, Lc/a/a/a/f2/l0/b$b;

    invoke-direct {v0, p0, v2}, Lc/a/a/a/f2/l0/b$b;-><init>(Lc/a/a/a/f2/l0/b;Lc/a/a/a/f2/l0/b$a;)V

    move-object v2, v0

    :cond_0
    return-object v2
.end method

.method j(Lc/a/a/a/f2/k;)J
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/l0/b;->a:Lc/a/a/a/f2/l0/f;

    invoke-virtual {v0}, Lc/a/a/a/f2/l0/f;->c()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/l0/b;->a:Lc/a/a/a/f2/l0/f;

    invoke-virtual {v0, p1}, Lc/a/a/a/f2/l0/f;->d(Lc/a/a/a/f2/k;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3
    :cond_0
    iget-object v0, p0, Lc/a/a/a/f2/l0/b;->a:Lc/a/a/a/f2/l0/f;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lc/a/a/a/f2/l0/f;->b(Lc/a/a/a/f2/k;Z)Z

    .line 4
    iget-object v0, p0, Lc/a/a/a/f2/l0/b;->a:Lc/a/a/a/f2/l0/f;

    iget v1, v0, Lc/a/a/a/f2/l0/f;->h:I

    iget v0, v0, Lc/a/a/a/f2/l0/f;->i:I

    add-int/2addr v1, v0

    invoke-interface {p1, v1}, Lc/a/a/a/f2/k;->i(I)V

    .line 5
    iget-object v0, p0, Lc/a/a/a/f2/l0/b;->a:Lc/a/a/a/f2/l0/f;

    iget v1, v0, Lc/a/a/a/f2/l0/f;->b:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-eq v1, v2, :cond_1

    .line 6
    invoke-virtual {v0, p1}, Lc/a/a/a/f2/l0/f;->d(Lc/a/a/a/f2/k;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v0

    iget-wide v2, p0, Lc/a/a/a/f2/l0/b;->c:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    .line 8
    :cond_1
    iget-object p1, p0, Lc/a/a/a/f2/l0/b;->a:Lc/a/a/a/f2/l0/f;

    iget-wide v0, p1, Lc/a/a/a/f2/l0/f;->c:J

    return-wide v0

    .line 9
    :cond_2
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    goto :goto_1

    :goto_0
    throw p1

    :goto_1
    goto :goto_0
.end method
