.class final Lc/a/a/a/f2/m0/z$b;
.super Ljava/lang/Object;
.source "PsBinarySearchSeeker.java"

# interfaces
.implements Lc/a/a/a/f2/b$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/f2/m0/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Lc/a/a/a/m2/j0;

.field private final b:Lc/a/a/a/m2/a0;


# direct methods
.method private constructor <init>(Lc/a/a/a/m2/j0;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lc/a/a/a/f2/m0/z$b;->a:Lc/a/a/a/m2/j0;

    .line 4
    new-instance p1, Lc/a/a/a/m2/a0;

    invoke-direct {p1}, Lc/a/a/a/m2/a0;-><init>()V

    iput-object p1, p0, Lc/a/a/a/f2/m0/z$b;->b:Lc/a/a/a/m2/a0;

    return-void
.end method

.method synthetic constructor <init>(Lc/a/a/a/m2/j0;Lc/a/a/a/f2/m0/z$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lc/a/a/a/f2/m0/z$b;-><init>(Lc/a/a/a/m2/j0;)V

    return-void
.end method

.method private c(Lc/a/a/a/m2/a0;JJ)Lc/a/a/a/f2/b$e;
    .locals 9

    const/4 v0, -0x1

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    move-wide v4, v1

    const/4 v3, -0x1

    .line 1
    :goto_0
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->a()I

    move-result v6

    const/4 v7, 0x4

    if-lt v6, v7, :cond_5

    .line 2
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v6

    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->e()I

    move-result v8

    invoke-static {v6, v8}, Lc/a/a/a/f2/m0/z;->j([BI)I

    move-result v6

    const/16 v8, 0x1ba

    if-eq v6, v8, :cond_0

    const/4 v6, 0x1

    .line 3
    invoke-virtual {p1, v6}, Lc/a/a/a/m2/a0;->Q(I)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1, v7}, Lc/a/a/a/m2/a0;->Q(I)V

    .line 5
    invoke-static {p1}, Lc/a/a/a/f2/m0/a0;->l(Lc/a/a/a/m2/a0;)J

    move-result-wide v6

    cmp-long v0, v6, v1

    if-eqz v0, :cond_4

    .line 6
    iget-object v0, p0, Lc/a/a/a/f2/m0/z$b;->a:Lc/a/a/a/m2/j0;

    invoke-virtual {v0, v6, v7}, Lc/a/a/a/m2/j0;->b(J)J

    move-result-wide v6

    cmp-long v0, v6, p2

    if-lez v0, :cond_2

    cmp-long p1, v4, v1

    if-nez p1, :cond_1

    .line 7
    invoke-static {v6, v7, p4, p5}, Lc/a/a/a/f2/b$e;->d(JJ)Lc/a/a/a/f2/b$e;

    move-result-object p1

    return-object p1

    :cond_1
    int-to-long p1, v3

    add-long/2addr p4, p1

    .line 8
    invoke-static {p4, p5}, Lc/a/a/a/f2/b$e;->e(J)Lc/a/a/a/f2/b$e;

    move-result-object p1

    return-object p1

    :cond_2
    const-wide/32 v3, 0x186a0

    add-long/2addr v3, v6

    cmp-long v0, v3, p2

    if-lez v0, :cond_3

    .line 9
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->e()I

    move-result p1

    int-to-long p1, p1

    add-long/2addr p4, p1

    .line 10
    invoke-static {p4, p5}, Lc/a/a/a/f2/b$e;->e(J)Lc/a/a/a/f2/b$e;

    move-result-object p1

    return-object p1

    .line 11
    :cond_3
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->e()I

    move-result v0

    move v3, v0

    move-wide v4, v6

    .line 12
    :cond_4
    invoke-static {p1}, Lc/a/a/a/f2/m0/z$b;->d(Lc/a/a/a/m2/a0;)V

    .line 13
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->e()I

    move-result v0

    goto :goto_0

    :cond_5
    cmp-long p1, v4, v1

    if-eqz p1, :cond_6

    int-to-long p1, v0

    add-long/2addr p4, p1

    .line 14
    invoke-static {v4, v5, p4, p5}, Lc/a/a/a/f2/b$e;->f(JJ)Lc/a/a/a/f2/b$e;

    move-result-object p1

    return-object p1

    .line 15
    :cond_6
    sget-object p1, Lc/a/a/a/f2/b$e;->a:Lc/a/a/a/f2/b$e;

    return-object p1
.end method

.method private static d(Lc/a/a/a/m2/a0;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->f()I

    move-result v0

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->a()I

    move-result v1

    const/16 v2, 0xa

    if-ge v1, v2, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Lc/a/a/a/m2/a0;->P(I)V

    return-void

    :cond_0
    const/16 v1, 0x9

    .line 4
    invoke-virtual {p0, v1}, Lc/a/a/a/m2/a0;->Q(I)V

    .line 5
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->D()I

    move-result v1

    and-int/lit8 v1, v1, 0x7

    .line 6
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->a()I

    move-result v2

    if-ge v2, v1, :cond_1

    .line 7
    invoke-virtual {p0, v0}, Lc/a/a/a/m2/a0;->P(I)V

    return-void

    .line 8
    :cond_1
    invoke-virtual {p0, v1}, Lc/a/a/a/m2/a0;->Q(I)V

    .line 9
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->a()I

    move-result v1

    const/4 v2, 0x4

    if-ge v1, v2, :cond_2

    .line 10
    invoke-virtual {p0, v0}, Lc/a/a/a/m2/a0;->P(I)V

    return-void

    .line 11
    :cond_2
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v1

    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->e()I

    move-result v3

    invoke-static {v1, v3}, Lc/a/a/a/f2/m0/z;->j([BI)I

    move-result v1

    const/16 v3, 0x1bb

    if-ne v1, v3, :cond_4

    .line 12
    invoke-virtual {p0, v2}, Lc/a/a/a/m2/a0;->Q(I)V

    .line 13
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->J()I

    move-result v1

    .line 14
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->a()I

    move-result v3

    if-ge v3, v1, :cond_3

    .line 15
    invoke-virtual {p0, v0}, Lc/a/a/a/m2/a0;->P(I)V

    return-void

    .line 16
    :cond_3
    invoke-virtual {p0, v1}, Lc/a/a/a/m2/a0;->Q(I)V

    .line 17
    :cond_4
    :goto_0
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->a()I

    move-result v1

    if-lt v1, v2, :cond_8

    .line 18
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v1

    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->e()I

    move-result v3

    invoke-static {v1, v3}, Lc/a/a/a/f2/m0/z;->j([BI)I

    move-result v1

    const/16 v3, 0x1ba

    if-eq v1, v3, :cond_8

    const/16 v3, 0x1b9

    if-ne v1, v3, :cond_5

    goto :goto_1

    :cond_5
    ushr-int/lit8 v1, v1, 0x8

    const/4 v3, 0x1

    if-eq v1, v3, :cond_6

    goto :goto_1

    .line 19
    :cond_6
    invoke-virtual {p0, v2}, Lc/a/a/a/m2/a0;->Q(I)V

    .line 20
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->a()I

    move-result v1

    const/4 v3, 0x2

    if-ge v1, v3, :cond_7

    .line 21
    invoke-virtual {p0, v0}, Lc/a/a/a/m2/a0;->P(I)V

    return-void

    .line 22
    :cond_7
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->J()I

    move-result v1

    .line 23
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->f()I

    move-result v3

    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->e()I

    move-result v4

    add-int/2addr v4, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 24
    invoke-virtual {p0, v1}, Lc/a/a/a/m2/a0;->P(I)V

    goto :goto_0

    :cond_8
    :goto_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/m0/z$b;->b:Lc/a/a/a/m2/a0;

    sget-object v1, Lc/a/a/a/m2/m0;->f:[B

    invoke-virtual {v0, v1}, Lc/a/a/a/m2/a0;->M([B)V

    return-void
.end method

.method public b(Lc/a/a/a/f2/k;J)Lc/a/a/a/f2/b$e;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v4

    .line 2
    invoke-interface {p1}, Lc/a/a/a/f2/k;->a()J

    move-result-wide v0

    sub-long/2addr v0, v4

    const-wide/16 v2, 0x4e20

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    .line 3
    iget-object v0, p0, Lc/a/a/a/f2/m0/z$b;->b:Lc/a/a/a/m2/a0;

    invoke-virtual {v0, v1}, Lc/a/a/a/m2/a0;->L(I)V

    .line 4
    iget-object v0, p0, Lc/a/a/a/f2/m0/z$b;->b:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lc/a/a/a/f2/k;->o([BII)V

    .line 5
    iget-object v1, p0, Lc/a/a/a/f2/m0/z$b;->b:Lc/a/a/a/m2/a0;

    move-object v0, p0

    move-wide v2, p2

    invoke-direct/range {v0 .. v5}, Lc/a/a/a/f2/m0/z$b;->c(Lc/a/a/a/m2/a0;JJ)Lc/a/a/a/f2/b$e;

    move-result-object p1

    return-object p1
.end method
