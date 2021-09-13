.class final Lc/a/a/a/f2/g0/f;
.super Lc/a/a/a/f2/g0/e;
.source "VideoTagPayloadReader.java"


# instance fields
.field private final b:Lc/a/a/a/m2/a0;

.field private final c:Lc/a/a/a/m2/a0;

.field private d:I

.field private e:Z

.field private f:Z

.field private g:I


# direct methods
.method public constructor <init>(Lc/a/a/a/f2/b0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lc/a/a/a/f2/g0/e;-><init>(Lc/a/a/a/f2/b0;)V

    .line 2
    new-instance p1, Lc/a/a/a/m2/a0;

    sget-object v0, Lc/a/a/a/m2/y;->a:[B

    invoke-direct {p1, v0}, Lc/a/a/a/m2/a0;-><init>([B)V

    iput-object p1, p0, Lc/a/a/a/f2/g0/f;->b:Lc/a/a/a/m2/a0;

    .line 3
    new-instance p1, Lc/a/a/a/m2/a0;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Lc/a/a/a/m2/a0;-><init>(I)V

    iput-object p1, p0, Lc/a/a/a/f2/g0/f;->c:Lc/a/a/a/m2/a0;

    return-void
.end method


# virtual methods
.method protected b(Lc/a/a/a/m2/a0;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/f2/g0/e$a;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->D()I

    move-result p1

    shr-int/lit8 v0, p1, 0x4

    and-int/lit8 v0, v0, 0xf

    and-int/lit8 p1, p1, 0xf

    const/4 v1, 0x7

    if-ne p1, v1, :cond_1

    .line 2
    iput v0, p0, Lc/a/a/a/f2/g0/f;->g:I

    const/4 p1, 0x5

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    .line 3
    :cond_1
    new-instance v0, Lc/a/a/a/f2/g0/e$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Video format not supported: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lc/a/a/a/f2/g0/e$a;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected c(Lc/a/a/a/m2/a0;J)Z
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->D()I

    move-result v0

    .line 2
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->o()I

    move-result v1

    int-to-long v1, v1

    const-wide/16 v3, 0x3e8

    mul-long v1, v1, v3

    add-long v4, p2, v1

    const/4 p2, 0x1

    const/4 p3, 0x0

    if-nez v0, :cond_0

    .line 3
    iget-boolean v1, p0, Lc/a/a/a/f2/g0/f;->e:Z

    if-nez v1, :cond_0

    .line 4
    new-instance v0, Lc/a/a/a/m2/a0;

    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->a()I

    move-result v1

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lc/a/a/a/m2/a0;-><init>([B)V

    .line 5
    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v1

    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->a()I

    move-result v2

    invoke-virtual {p1, v1, p3, v2}, Lc/a/a/a/m2/a0;->j([BII)V

    .line 6
    invoke-static {v0}, Lc/a/a/a/n2/j;->b(Lc/a/a/a/m2/a0;)Lc/a/a/a/n2/j;

    move-result-object p1

    .line 7
    iget v0, p1, Lc/a/a/a/n2/j;->b:I

    iput v0, p0, Lc/a/a/a/f2/g0/f;->d:I

    .line 8
    new-instance v0, Lc/a/a/a/u0$b;

    invoke-direct {v0}, Lc/a/a/a/u0$b;-><init>()V

    const-string v1, "video/avc"

    .line 9
    invoke-virtual {v0, v1}, Lc/a/a/a/u0$b;->e0(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v0

    iget-object v1, p1, Lc/a/a/a/n2/j;->f:Ljava/lang/String;

    .line 10
    invoke-virtual {v0, v1}, Lc/a/a/a/u0$b;->I(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v0

    iget v1, p1, Lc/a/a/a/n2/j;->c:I

    .line 11
    invoke-virtual {v0, v1}, Lc/a/a/a/u0$b;->j0(I)Lc/a/a/a/u0$b;

    move-result-object v0

    iget v1, p1, Lc/a/a/a/n2/j;->d:I

    .line 12
    invoke-virtual {v0, v1}, Lc/a/a/a/u0$b;->Q(I)Lc/a/a/a/u0$b;

    move-result-object v0

    iget v1, p1, Lc/a/a/a/n2/j;->e:F

    .line 13
    invoke-virtual {v0, v1}, Lc/a/a/a/u0$b;->a0(F)Lc/a/a/a/u0$b;

    move-result-object v0

    iget-object p1, p1, Lc/a/a/a/n2/j;->a:Ljava/util/List;

    .line 14
    invoke-virtual {v0, p1}, Lc/a/a/a/u0$b;->T(Ljava/util/List;)Lc/a/a/a/u0$b;

    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object p1

    .line 16
    iget-object v0, p0, Lc/a/a/a/f2/g0/e;->a:Lc/a/a/a/f2/b0;

    invoke-interface {v0, p1}, Lc/a/a/a/f2/b0;->d(Lc/a/a/a/u0;)V

    .line 17
    iput-boolean p2, p0, Lc/a/a/a/f2/g0/f;->e:Z

    return p3

    :cond_0
    if-ne v0, p2, :cond_4

    .line 18
    iget-boolean v0, p0, Lc/a/a/a/f2/g0/f;->e:Z

    if-eqz v0, :cond_4

    .line 19
    iget v0, p0, Lc/a/a/a/f2/g0/f;->g:I

    if-ne v0, p2, :cond_1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    .line 20
    :goto_0
    iget-boolean v0, p0, Lc/a/a/a/f2/g0/f;->f:Z

    if-nez v0, :cond_2

    if-nez v6, :cond_2

    return p3

    .line 21
    :cond_2
    iget-object v0, p0, Lc/a/a/a/f2/g0/f;->c:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    .line 22
    aput-byte p3, v0, p3

    .line 23
    aput-byte p3, v0, p2

    const/4 v1, 0x2

    .line 24
    aput-byte p3, v0, v1

    .line 25
    iget v0, p0, Lc/a/a/a/f2/g0/f;->d:I

    const/4 v1, 0x4

    rsub-int/lit8 v0, v0, 0x4

    const/4 v7, 0x0

    .line 26
    :goto_1
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->a()I

    move-result v2

    if-lez v2, :cond_3

    .line 27
    iget-object v2, p0, Lc/a/a/a/f2/g0/f;->c:Lc/a/a/a/m2/a0;

    invoke-virtual {v2}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v2

    iget v3, p0, Lc/a/a/a/f2/g0/f;->d:I

    invoke-virtual {p1, v2, v0, v3}, Lc/a/a/a/m2/a0;->j([BII)V

    .line 28
    iget-object v2, p0, Lc/a/a/a/f2/g0/f;->c:Lc/a/a/a/m2/a0;

    invoke-virtual {v2, p3}, Lc/a/a/a/m2/a0;->P(I)V

    .line 29
    iget-object v2, p0, Lc/a/a/a/f2/g0/f;->c:Lc/a/a/a/m2/a0;

    invoke-virtual {v2}, Lc/a/a/a/m2/a0;->H()I

    move-result v2

    .line 30
    iget-object v3, p0, Lc/a/a/a/f2/g0/f;->b:Lc/a/a/a/m2/a0;

    invoke-virtual {v3, p3}, Lc/a/a/a/m2/a0;->P(I)V

    .line 31
    iget-object v3, p0, Lc/a/a/a/f2/g0/e;->a:Lc/a/a/a/f2/b0;

    iget-object v8, p0, Lc/a/a/a/f2/g0/f;->b:Lc/a/a/a/m2/a0;

    invoke-interface {v3, v8, v1}, Lc/a/a/a/f2/b0;->a(Lc/a/a/a/m2/a0;I)V

    add-int/lit8 v7, v7, 0x4

    .line 32
    iget-object v3, p0, Lc/a/a/a/f2/g0/e;->a:Lc/a/a/a/f2/b0;

    invoke-interface {v3, p1, v2}, Lc/a/a/a/f2/b0;->a(Lc/a/a/a/m2/a0;I)V

    add-int/2addr v7, v2

    goto :goto_1

    .line 33
    :cond_3
    iget-object v3, p0, Lc/a/a/a/f2/g0/e;->a:Lc/a/a/a/f2/b0;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-interface/range {v3 .. v9}, Lc/a/a/a/f2/b0;->c(JIIILc/a/a/a/f2/b0$a;)V

    .line 34
    iput-boolean p2, p0, Lc/a/a/a/f2/g0/f;->f:Z

    return p2

    :cond_4
    return p3
.end method
