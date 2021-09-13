.class public final Lc/a/a/a/h2/o/c;
.super Lc/a/a/a/h2/h;
.source "SpliceInfoDecoder.java"


# instance fields
.field private final a:Lc/a/a/a/m2/a0;

.field private final b:Lc/a/a/a/m2/z;

.field private c:Lc/a/a/a/m2/j0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/h2/h;-><init>()V

    .line 2
    new-instance v0, Lc/a/a/a/m2/a0;

    invoke-direct {v0}, Lc/a/a/a/m2/a0;-><init>()V

    iput-object v0, p0, Lc/a/a/a/h2/o/c;->a:Lc/a/a/a/m2/a0;

    .line 3
    new-instance v0, Lc/a/a/a/m2/z;

    invoke-direct {v0}, Lc/a/a/a/m2/z;-><init>()V

    iput-object v0, p0, Lc/a/a/a/h2/o/c;->b:Lc/a/a/a/m2/z;

    return-void
.end method


# virtual methods
.method protected b(Lc/a/a/a/h2/e;Ljava/nio/ByteBuffer;)Lc/a/a/a/h2/a;
    .locals 6

    .line 1
    iget-object v0, p0, Lc/a/a/a/h2/o/c;->c:Lc/a/a/a/m2/j0;

    if-eqz v0, :cond_0

    iget-wide v1, p1, Lc/a/a/a/h2/e;->i:J

    .line 2
    invoke-virtual {v0}, Lc/a/a/a/m2/j0;->e()J

    move-result-wide v3

    cmp-long v0, v1, v3

    if-eqz v0, :cond_1

    .line 3
    :cond_0
    new-instance v0, Lc/a/a/a/m2/j0;

    iget-wide v1, p1, Lc/a/a/a/c2/f;->e:J

    invoke-direct {v0, v1, v2}, Lc/a/a/a/m2/j0;-><init>(J)V

    iput-object v0, p0, Lc/a/a/a/h2/o/c;->c:Lc/a/a/a/m2/j0;

    .line 4
    iget-wide v1, p1, Lc/a/a/a/c2/f;->e:J

    iget-wide v3, p1, Lc/a/a/a/h2/e;->i:J

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lc/a/a/a/m2/j0;->a(J)J

    .line 5
    :cond_1
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    .line 6
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->limit()I

    move-result p2

    .line 7
    iget-object v0, p0, Lc/a/a/a/h2/o/c;->a:Lc/a/a/a/m2/a0;

    invoke-virtual {v0, p1, p2}, Lc/a/a/a/m2/a0;->N([BI)V

    .line 8
    iget-object v0, p0, Lc/a/a/a/h2/o/c;->b:Lc/a/a/a/m2/z;

    invoke-virtual {v0, p1, p2}, Lc/a/a/a/m2/z;->o([BI)V

    .line 9
    iget-object p1, p0, Lc/a/a/a/h2/o/c;->b:Lc/a/a/a/m2/z;

    const/16 p2, 0x27

    invoke-virtual {p1, p2}, Lc/a/a/a/m2/z;->r(I)V

    .line 10
    iget-object p1, p0, Lc/a/a/a/h2/o/c;->b:Lc/a/a/a/m2/z;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lc/a/a/a/m2/z;->h(I)I

    move-result p1

    int-to-long v0, p1

    const/16 p1, 0x20

    shl-long/2addr v0, p1

    .line 11
    iget-object v2, p0, Lc/a/a/a/h2/o/c;->b:Lc/a/a/a/m2/z;

    invoke-virtual {v2, p1}, Lc/a/a/a/m2/z;->h(I)I

    move-result p1

    int-to-long v2, p1

    or-long/2addr v0, v2

    .line 12
    iget-object p1, p0, Lc/a/a/a/h2/o/c;->b:Lc/a/a/a/m2/z;

    const/16 v2, 0x14

    invoke-virtual {p1, v2}, Lc/a/a/a/m2/z;->r(I)V

    .line 13
    iget-object p1, p0, Lc/a/a/a/h2/o/c;->b:Lc/a/a/a/m2/z;

    const/16 v2, 0xc

    invoke-virtual {p1, v2}, Lc/a/a/a/m2/z;->h(I)I

    move-result p1

    .line 14
    iget-object v2, p0, Lc/a/a/a/h2/o/c;->b:Lc/a/a/a/m2/z;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Lc/a/a/a/m2/z;->h(I)I

    move-result v2

    const/4 v3, 0x0

    .line 15
    iget-object v4, p0, Lc/a/a/a/h2/o/c;->a:Lc/a/a/a/m2/a0;

    const/16 v5, 0xe

    invoke-virtual {v4, v5}, Lc/a/a/a/m2/a0;->Q(I)V

    if-eqz v2, :cond_6

    const/16 v4, 0xff

    if-eq v2, v4, :cond_5

    const/4 p1, 0x4

    if-eq v2, p1, :cond_4

    const/4 p1, 0x5

    if-eq v2, p1, :cond_3

    const/4 p1, 0x6

    if-eq v2, p1, :cond_2

    goto :goto_0

    .line 16
    :cond_2
    iget-object p1, p0, Lc/a/a/a/h2/o/c;->a:Lc/a/a/a/m2/a0;

    iget-object v2, p0, Lc/a/a/a/h2/o/c;->c:Lc/a/a/a/m2/j0;

    invoke-static {p1, v0, v1, v2}, Lc/a/a/a/h2/o/g;->l(Lc/a/a/a/m2/a0;JLc/a/a/a/m2/j0;)Lc/a/a/a/h2/o/g;

    move-result-object v3

    goto :goto_0

    .line 17
    :cond_3
    iget-object p1, p0, Lc/a/a/a/h2/o/c;->a:Lc/a/a/a/m2/a0;

    iget-object v2, p0, Lc/a/a/a/h2/o/c;->c:Lc/a/a/a/m2/j0;

    invoke-static {p1, v0, v1, v2}, Lc/a/a/a/h2/o/d;->l(Lc/a/a/a/m2/a0;JLc/a/a/a/m2/j0;)Lc/a/a/a/h2/o/d;

    move-result-object v3

    goto :goto_0

    .line 18
    :cond_4
    iget-object p1, p0, Lc/a/a/a/h2/o/c;->a:Lc/a/a/a/m2/a0;

    invoke-static {p1}, Lc/a/a/a/h2/o/f;->l(Lc/a/a/a/m2/a0;)Lc/a/a/a/h2/o/f;

    move-result-object v3

    goto :goto_0

    .line 19
    :cond_5
    iget-object v2, p0, Lc/a/a/a/h2/o/c;->a:Lc/a/a/a/m2/a0;

    invoke-static {v2, p1, v0, v1}, Lc/a/a/a/h2/o/a;->l(Lc/a/a/a/m2/a0;IJ)Lc/a/a/a/h2/o/a;

    move-result-object v3

    goto :goto_0

    .line 20
    :cond_6
    new-instance v3, Lc/a/a/a/h2/o/e;

    invoke-direct {v3}, Lc/a/a/a/h2/o/e;-><init>()V

    :goto_0
    const/4 p1, 0x0

    if-nez v3, :cond_7

    .line 21
    new-instance p2, Lc/a/a/a/h2/a;

    new-array p1, p1, [Lc/a/a/a/h2/a$b;

    invoke-direct {p2, p1}, Lc/a/a/a/h2/a;-><init>([Lc/a/a/a/h2/a$b;)V

    goto :goto_1

    :cond_7
    new-instance v0, Lc/a/a/a/h2/a;

    new-array p2, p2, [Lc/a/a/a/h2/a$b;

    aput-object v3, p2, p1

    invoke-direct {v0, p2}, Lc/a/a/a/h2/a;-><init>([Lc/a/a/a/h2/a$b;)V

    move-object p2, v0

    :goto_1
    return-object p2
.end method
