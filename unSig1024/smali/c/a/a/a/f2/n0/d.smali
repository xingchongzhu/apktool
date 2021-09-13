.class final Lc/a/a/a/f2/n0/d;
.super Ljava/lang/Object;
.source "WavHeaderReader.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/f2/n0/d$a;
    }
.end annotation


# direct methods
.method public static a(Lc/a/a/a/f2/k;)Lc/a/a/a/f2/n0/c;
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lc/a/a/a/m2/a0;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lc/a/a/a/m2/a0;-><init>(I)V

    .line 3
    invoke-static {p0, v0}, Lc/a/a/a/f2/n0/d$a;->a(Lc/a/a/a/f2/k;Lc/a/a/a/m2/a0;)Lc/a/a/a/f2/n0/d$a;

    move-result-object v2

    .line 4
    iget v2, v2, Lc/a/a/a/f2/n0/d$a;->a:I

    const/4 v3, 0x0

    const v4, 0x52494646

    if-eq v2, v4, :cond_0

    return-object v3

    .line 5
    :cond_0
    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-interface {p0, v2, v5, v4}, Lc/a/a/a/f2/k;->o([BII)V

    .line 6
    invoke-virtual {v0, v5}, Lc/a/a/a/m2/a0;->P(I)V

    .line 7
    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->n()I

    move-result v2

    const v4, 0x57415645

    if-eq v2, v4, :cond_1

    .line 8
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unsupported RIFF format: "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "WavHeaderReader"

    invoke-static {v0, p0}, Lc/a/a/a/m2/t;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    .line 9
    :cond_1
    invoke-static {p0, v0}, Lc/a/a/a/f2/n0/d$a;->a(Lc/a/a/a/f2/k;Lc/a/a/a/m2/a0;)Lc/a/a/a/f2/n0/d$a;

    move-result-object v2

    .line 10
    :goto_0
    iget v3, v2, Lc/a/a/a/f2/n0/d$a;->a:I

    const v4, 0x666d7420

    if-eq v3, v4, :cond_2

    .line 11
    iget-wide v2, v2, Lc/a/a/a/f2/n0/d$a;->b:J

    long-to-int v3, v2

    invoke-interface {p0, v3}, Lc/a/a/a/f2/k;->p(I)V

    .line 12
    invoke-static {p0, v0}, Lc/a/a/a/f2/n0/d$a;->a(Lc/a/a/a/f2/k;Lc/a/a/a/m2/a0;)Lc/a/a/a/f2/n0/d$a;

    move-result-object v2

    goto :goto_0

    .line 13
    :cond_2
    iget-wide v3, v2, Lc/a/a/a/f2/n0/d$a;->b:J

    const-wide/16 v6, 0x10

    cmp-long v8, v3, v6

    if-ltz v8, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    invoke-static {v3}, Lc/a/a/a/m2/f;->f(Z)V

    .line 14
    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v3

    invoke-interface {p0, v3, v5, v1}, Lc/a/a/a/f2/k;->o([BII)V

    .line 15
    invoke-virtual {v0, v5}, Lc/a/a/a/m2/a0;->P(I)V

    .line 16
    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->v()I

    move-result v7

    .line 17
    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->v()I

    move-result v8

    .line 18
    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->u()I

    move-result v9

    .line 19
    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->u()I

    move-result v10

    .line 20
    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->v()I

    move-result v11

    .line 21
    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->v()I

    move-result v12

    .line 22
    iget-wide v2, v2, Lc/a/a/a/f2/n0/d$a;->b:J

    long-to-int v0, v2

    sub-int/2addr v0, v1

    if-lez v0, :cond_4

    .line 23
    new-array v1, v0, [B

    .line 24
    invoke-interface {p0, v1, v5, v0}, Lc/a/a/a/f2/k;->o([BII)V

    move-object v13, v1

    goto :goto_2

    .line 25
    :cond_4
    sget-object p0, Lc/a/a/a/m2/m0;->f:[B

    move-object v13, p0

    .line 26
    :goto_2
    new-instance p0, Lc/a/a/a/f2/n0/c;

    move-object v6, p0

    invoke-direct/range {v6 .. v13}, Lc/a/a/a/f2/n0/c;-><init>(IIIIII[B)V

    return-object p0
.end method

.method public static b(Lc/a/a/a/f2/k;)Landroid/util/Pair;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/f2/k;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-interface {p0}, Lc/a/a/a/f2/k;->h()V

    .line 3
    new-instance v0, Lc/a/a/a/m2/a0;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lc/a/a/a/m2/a0;-><init>(I)V

    .line 4
    invoke-static {p0, v0}, Lc/a/a/a/f2/n0/d$a;->a(Lc/a/a/a/f2/k;Lc/a/a/a/m2/a0;)Lc/a/a/a/f2/n0/d$a;

    move-result-object v2

    .line 5
    :goto_0
    iget v3, v2, Lc/a/a/a/f2/n0/d$a;->a:I

    const v4, 0x64617461

    const-string v5, "WavHeaderReader"

    if-eq v3, v4, :cond_3

    const v4, 0x52494646

    if-eq v3, v4, :cond_0

    const v6, 0x666d7420

    if-eq v3, v6, :cond_0

    .line 6
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Ignoring unknown WAV chunk: "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v2, Lc/a/a/a/f2/n0/d$a;->a:I

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const-wide/16 v5, 0x8

    .line 7
    iget-wide v7, v2, Lc/a/a/a/f2/n0/d$a;->b:J

    add-long/2addr v7, v5

    .line 8
    iget v3, v2, Lc/a/a/a/f2/n0/d$a;->a:I

    if-ne v3, v4, :cond_1

    const-wide/16 v7, 0xc

    :cond_1
    const-wide/32 v3, 0x7fffffff

    cmp-long v5, v7, v3

    if-gtz v5, :cond_2

    long-to-int v2, v7

    .line 9
    invoke-interface {p0, v2}, Lc/a/a/a/f2/k;->i(I)V

    .line 10
    invoke-static {p0, v0}, Lc/a/a/a/f2/n0/d$a;->a(Lc/a/a/a/f2/k;Lc/a/a/a/m2/a0;)Lc/a/a/a/f2/n0/d$a;

    move-result-object v2

    goto :goto_0

    .line 11
    :cond_2
    new-instance p0, Lc/a/a/a/g1;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Chunk is too large (~2GB+) to skip; id: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, v2, Lc/a/a/a/f2/n0/d$a;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p0

    .line 12
    :cond_3
    invoke-interface {p0, v1}, Lc/a/a/a/f2/k;->i(I)V

    .line 13
    invoke-interface {p0}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v0

    .line 14
    iget-wide v2, v2, Lc/a/a/a/f2/n0/d$a;->b:J

    add-long/2addr v2, v0

    .line 15
    invoke-interface {p0}, Lc/a/a/a/f2/k;->a()J

    move-result-wide v6

    const-wide/16 v8, -0x1

    cmp-long p0, v6, v8

    if-eqz p0, :cond_4

    cmp-long p0, v2, v6

    if-lez p0, :cond_4

    .line 16
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Data exceeds input length: "

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v5, p0}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    move-wide v2, v6

    .line 17
    :cond_4
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p0, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method
