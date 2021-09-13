.class final Lc/a/a/a/f2/l0/f;
.super Ljava/lang/Object;
.source "OggPageHeader.java"


# instance fields
.field public a:I

.field public b:I

.field public c:J

.field public d:J

.field public e:J

.field public f:J

.field public g:I

.field public h:I

.field public i:I

.field public final j:[I

.field private final k:Lc/a/a/a/m2/a0;


# direct methods
.method constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xff

    new-array v1, v0, [I

    .line 2
    iput-object v1, p0, Lc/a/a/a/f2/l0/f;->j:[I

    .line 3
    new-instance v1, Lc/a/a/a/m2/a0;

    invoke-direct {v1, v0}, Lc/a/a/a/m2/a0;-><init>(I)V

    iput-object v1, p0, Lc/a/a/a/f2/l0/f;->k:Lc/a/a/a/m2/a0;

    return-void
.end method

.method private static a(Lc/a/a/a/f2/k;[BIIZ)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-interface {p0, p1, p2, p3, p4}, Lc/a/a/a/f2/k;->m([BIIZ)Z

    move-result p0
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    if-eqz p4, :cond_0

    const/4 p0, 0x0

    return p0

    .line 2
    :cond_0
    throw p0
.end method


# virtual methods
.method public b(Lc/a/a/a/f2/k;Z)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/f2/l0/f;->c()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/l0/f;->k:Lc/a/a/a/m2/a0;

    const/16 v1, 0x1b

    invoke-virtual {v0, v1}, Lc/a/a/a/m2/a0;->L(I)V

    .line 3
    iget-object v0, p0, Lc/a/a/a/f2/l0/f;->k:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1, p2}, Lc/a/a/a/f2/l0/f;->a(Lc/a/a/a/f2/k;[BIIZ)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lc/a/a/a/f2/l0/f;->k:Lc/a/a/a/m2/a0;

    .line 4
    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->F()J

    move-result-wide v0

    const-wide/32 v3, 0x4f676753

    cmp-long v5, v0, v3

    if-eqz v5, :cond_0

    goto :goto_1

    .line 5
    :cond_0
    iget-object v0, p0, Lc/a/a/a/f2/l0/f;->k:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->D()I

    move-result v0

    iput v0, p0, Lc/a/a/a/f2/l0/f;->a:I

    if-eqz v0, :cond_2

    if-eqz p2, :cond_1

    return v2

    .line 6
    :cond_1
    new-instance p1, Lc/a/a/a/g1;

    const-string p2, "unsupported bit stream revision"

    invoke-direct {p1, p2}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_2
    iget-object p2, p0, Lc/a/a/a/f2/l0/f;->k:Lc/a/a/a/m2/a0;

    invoke-virtual {p2}, Lc/a/a/a/m2/a0;->D()I

    move-result p2

    iput p2, p0, Lc/a/a/a/f2/l0/f;->b:I

    .line 8
    iget-object p2, p0, Lc/a/a/a/f2/l0/f;->k:Lc/a/a/a/m2/a0;

    invoke-virtual {p2}, Lc/a/a/a/m2/a0;->r()J

    move-result-wide v0

    iput-wide v0, p0, Lc/a/a/a/f2/l0/f;->c:J

    .line 9
    iget-object p2, p0, Lc/a/a/a/f2/l0/f;->k:Lc/a/a/a/m2/a0;

    invoke-virtual {p2}, Lc/a/a/a/m2/a0;->t()J

    move-result-wide v0

    iput-wide v0, p0, Lc/a/a/a/f2/l0/f;->d:J

    .line 10
    iget-object p2, p0, Lc/a/a/a/f2/l0/f;->k:Lc/a/a/a/m2/a0;

    invoke-virtual {p2}, Lc/a/a/a/m2/a0;->t()J

    move-result-wide v0

    iput-wide v0, p0, Lc/a/a/a/f2/l0/f;->e:J

    .line 11
    iget-object p2, p0, Lc/a/a/a/f2/l0/f;->k:Lc/a/a/a/m2/a0;

    invoke-virtual {p2}, Lc/a/a/a/m2/a0;->t()J

    move-result-wide v0

    iput-wide v0, p0, Lc/a/a/a/f2/l0/f;->f:J

    .line 12
    iget-object p2, p0, Lc/a/a/a/f2/l0/f;->k:Lc/a/a/a/m2/a0;

    invoke-virtual {p2}, Lc/a/a/a/m2/a0;->D()I

    move-result p2

    iput p2, p0, Lc/a/a/a/f2/l0/f;->g:I

    add-int/lit8 v0, p2, 0x1b

    .line 13
    iput v0, p0, Lc/a/a/a/f2/l0/f;->h:I

    .line 14
    iget-object v0, p0, Lc/a/a/a/f2/l0/f;->k:Lc/a/a/a/m2/a0;

    invoke-virtual {v0, p2}, Lc/a/a/a/m2/a0;->L(I)V

    .line 15
    iget-object p2, p0, Lc/a/a/a/f2/l0/f;->k:Lc/a/a/a/m2/a0;

    invoke-virtual {p2}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object p2

    iget v0, p0, Lc/a/a/a/f2/l0/f;->g:I

    invoke-interface {p1, p2, v2, v0}, Lc/a/a/a/f2/k;->o([BII)V

    .line 16
    :goto_0
    iget p1, p0, Lc/a/a/a/f2/l0/f;->g:I

    if-ge v2, p1, :cond_3

    .line 17
    iget-object p1, p0, Lc/a/a/a/f2/l0/f;->j:[I

    iget-object p2, p0, Lc/a/a/a/f2/l0/f;->k:Lc/a/a/a/m2/a0;

    invoke-virtual {p2}, Lc/a/a/a/m2/a0;->D()I

    move-result p2

    aput p2, p1, v2

    .line 18
    iget p1, p0, Lc/a/a/a/f2/l0/f;->i:I

    iget-object p2, p0, Lc/a/a/a/f2/l0/f;->j:[I

    aget p2, p2, v2

    add-int/2addr p1, p2

    iput p1, p0, Lc/a/a/a/f2/l0/f;->i:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_1
    return v2
.end method

.method public c()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lc/a/a/a/f2/l0/f;->a:I

    .line 2
    iput v0, p0, Lc/a/a/a/f2/l0/f;->b:I

    const-wide/16 v1, 0x0

    .line 3
    iput-wide v1, p0, Lc/a/a/a/f2/l0/f;->c:J

    .line 4
    iput-wide v1, p0, Lc/a/a/a/f2/l0/f;->d:J

    .line 5
    iput-wide v1, p0, Lc/a/a/a/f2/l0/f;->e:J

    .line 6
    iput-wide v1, p0, Lc/a/a/a/f2/l0/f;->f:J

    .line 7
    iput v0, p0, Lc/a/a/a/f2/l0/f;->g:I

    .line 8
    iput v0, p0, Lc/a/a/a/f2/l0/f;->h:I

    .line 9
    iput v0, p0, Lc/a/a/a/f2/l0/f;->i:I

    return-void
.end method

.method public d(Lc/a/a/a/f2/k;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v0, -0x1

    .line 1
    invoke-virtual {p0, p1, v0, v1}, Lc/a/a/a/f2/l0/f;->e(Lc/a/a/a/f2/k;J)Z

    move-result p1

    return p1
.end method

.method public e(Lc/a/a/a/f2/k;J)Z
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v0

    invoke-interface {p1}, Lc/a/a/a/f2/k;->n()J

    move-result-wide v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    cmp-long v6, v0, v2

    if-nez v6, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lc/a/a/a/m2/f;->a(Z)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/l0/f;->k:Lc/a/a/a/m2/a0;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lc/a/a/a/m2/a0;->L(I)V

    :goto_1
    const-wide/16 v2, -0x1

    cmp-long v0, p2, v2

    if-eqz v0, :cond_1

    .line 3
    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v6

    const-wide/16 v8, 0x4

    add-long/2addr v6, v8

    cmp-long v0, v6, p2

    if-gez v0, :cond_3

    :cond_1
    iget-object v0, p0, Lc/a/a/a/f2/l0/f;->k:Lc/a/a/a/m2/a0;

    .line 4
    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    invoke-static {p1, v0, v4, v1, v5}, Lc/a/a/a/f2/l0/f;->a(Lc/a/a/a/f2/k;[BIIZ)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 5
    iget-object v0, p0, Lc/a/a/a/f2/l0/f;->k:Lc/a/a/a/m2/a0;

    invoke-virtual {v0, v4}, Lc/a/a/a/m2/a0;->P(I)V

    .line 6
    iget-object v0, p0, Lc/a/a/a/f2/l0/f;->k:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->F()J

    move-result-wide v2

    const-wide/32 v6, 0x4f676753

    cmp-long v0, v2, v6

    if-nez v0, :cond_2

    .line 7
    invoke-interface {p1}, Lc/a/a/a/f2/k;->h()V

    return v5

    .line 8
    :cond_2
    invoke-interface {p1, v5}, Lc/a/a/a/f2/k;->i(I)V

    goto :goto_1

    :cond_3
    :goto_2
    cmp-long v0, p2, v2

    if-eqz v0, :cond_4

    .line 9
    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v0

    cmp-long v6, v0, p2

    if-gez v6, :cond_5

    .line 10
    :cond_4
    invoke-interface {p1, v5}, Lc/a/a/a/f2/k;->c(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    goto :goto_2

    :cond_5
    return v4
.end method
