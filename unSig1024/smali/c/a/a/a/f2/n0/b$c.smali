.class final Lc/a/a/a/f2/n0/b$c;
.super Ljava/lang/Object;
.source "WavExtractor.java"

# interfaces
.implements Lc/a/a/a/f2/n0/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/f2/n0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final a:Lc/a/a/a/f2/l;

.field private final b:Lc/a/a/a/f2/b0;

.field private final c:Lc/a/a/a/f2/n0/c;

.field private final d:Lc/a/a/a/u0;

.field private final e:I

.field private f:J

.field private g:I

.field private h:J


# direct methods
.method public constructor <init>(Lc/a/a/a/f2/l;Lc/a/a/a/f2/b0;Lc/a/a/a/f2/n0/c;Ljava/lang/String;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/f2/n0/b$c;->a:Lc/a/a/a/f2/l;

    .line 3
    iput-object p2, p0, Lc/a/a/a/f2/n0/b$c;->b:Lc/a/a/a/f2/b0;

    .line 4
    iput-object p3, p0, Lc/a/a/a/f2/n0/b$c;->c:Lc/a/a/a/f2/n0/c;

    .line 5
    iget p1, p3, Lc/a/a/a/f2/n0/c;->b:I

    iget p2, p3, Lc/a/a/a/f2/n0/c;->f:I

    mul-int p1, p1, p2

    div-int/lit8 p1, p1, 0x8

    .line 6
    iget p2, p3, Lc/a/a/a/f2/n0/c;->e:I

    if-ne p2, p1, :cond_0

    .line 7
    iget p2, p3, Lc/a/a/a/f2/n0/c;->c:I

    mul-int v0, p2, p1

    mul-int/lit8 v0, v0, 0x8

    mul-int p2, p2, p1

    .line 8
    div-int/lit8 p2, p2, 0xa

    .line 9
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lc/a/a/a/f2/n0/b$c;->e:I

    .line 10
    new-instance p2, Lc/a/a/a/u0$b;

    invoke-direct {p2}, Lc/a/a/a/u0$b;-><init>()V

    .line 11
    invoke-virtual {p2, p4}, Lc/a/a/a/u0$b;->e0(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object p2

    .line 12
    invoke-virtual {p2, v0}, Lc/a/a/a/u0$b;->G(I)Lc/a/a/a/u0$b;

    move-result-object p2

    .line 13
    invoke-virtual {p2, v0}, Lc/a/a/a/u0$b;->Z(I)Lc/a/a/a/u0$b;

    move-result-object p2

    .line 14
    invoke-virtual {p2, p1}, Lc/a/a/a/u0$b;->W(I)Lc/a/a/a/u0$b;

    move-result-object p1

    iget p2, p3, Lc/a/a/a/f2/n0/c;->b:I

    .line 15
    invoke-virtual {p1, p2}, Lc/a/a/a/u0$b;->H(I)Lc/a/a/a/u0$b;

    move-result-object p1

    iget p2, p3, Lc/a/a/a/f2/n0/c;->c:I

    .line 16
    invoke-virtual {p1, p2}, Lc/a/a/a/u0$b;->f0(I)Lc/a/a/a/u0$b;

    move-result-object p1

    .line 17
    invoke-virtual {p1, p5}, Lc/a/a/a/u0$b;->Y(I)Lc/a/a/a/u0$b;

    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/f2/n0/b$c;->d:Lc/a/a/a/u0;

    return-void

    .line 19
    :cond_0
    new-instance p2, Lc/a/a/a/g1;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "Expected block size: "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "; got: "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p3, Lc/a/a/a/f2/n0/c;->e:I

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public a(IJ)V
    .locals 9

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/n0/b$c;->a:Lc/a/a/a/f2/l;

    new-instance v8, Lc/a/a/a/f2/n0/e;

    iget-object v2, p0, Lc/a/a/a/f2/n0/b$c;->c:Lc/a/a/a/f2/n0/c;

    int-to-long v4, p1

    const/4 v3, 0x1

    move-object v1, v8

    move-wide v6, p2

    invoke-direct/range {v1 .. v7}, Lc/a/a/a/f2/n0/e;-><init>(Lc/a/a/a/f2/n0/c;IJJ)V

    invoke-interface {v0, v8}, Lc/a/a/a/f2/l;->f(Lc/a/a/a/f2/y;)V

    .line 2
    iget-object p1, p0, Lc/a/a/a/f2/n0/b$c;->b:Lc/a/a/a/f2/b0;

    iget-object p2, p0, Lc/a/a/a/f2/n0/b$c;->d:Lc/a/a/a/u0;

    invoke-interface {p1, p2}, Lc/a/a/a/f2/b0;->d(Lc/a/a/a/u0;)V

    return-void
.end method

.method public b(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lc/a/a/a/f2/n0/b$c;->f:J

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lc/a/a/a/f2/n0/b$c;->g:I

    const-wide/16 p1, 0x0

    .line 3
    iput-wide p1, p0, Lc/a/a/a/f2/n0/b$c;->h:J

    return-void
.end method

.method public c(Lc/a/a/a/f2/k;J)Z
    .locals 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    :goto_0
    const/4 v3, 0x1

    const-wide/16 v4, 0x0

    cmp-long v6, v1, v4

    if-lez v6, :cond_1

    .line 1
    iget v6, v0, Lc/a/a/a/f2/n0/b$c;->g:I

    iget v7, v0, Lc/a/a/a/f2/n0/b$c;->e:I

    if-ge v6, v7, :cond_1

    sub-int/2addr v7, v6

    int-to-long v6, v7

    .line 2
    invoke-static {v6, v7, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    long-to-int v7, v6

    .line 3
    iget-object v6, v0, Lc/a/a/a/f2/n0/b$c;->b:Lc/a/a/a/f2/b0;

    move-object/from16 v8, p1

    invoke-interface {v6, v8, v7, v3}, Lc/a/a/a/f2/b0;->f(Lcom/google/android/exoplayer2/upstream/j;IZ)I

    move-result v3

    const/4 v6, -0x1

    if-ne v3, v6, :cond_0

    move-wide v1, v4

    goto :goto_0

    .line 4
    :cond_0
    iget v4, v0, Lc/a/a/a/f2/n0/b$c;->g:I

    add-int/2addr v4, v3

    iput v4, v0, Lc/a/a/a/f2/n0/b$c;->g:I

    int-to-long v3, v3

    sub-long/2addr v1, v3

    goto :goto_0

    .line 5
    :cond_1
    iget-object v6, v0, Lc/a/a/a/f2/n0/b$c;->c:Lc/a/a/a/f2/n0/c;

    iget v7, v6, Lc/a/a/a/f2/n0/c;->e:I

    .line 6
    iget v8, v0, Lc/a/a/a/f2/n0/b$c;->g:I

    div-int/2addr v8, v7

    if-lez v8, :cond_2

    .line 7
    iget-wide v9, v0, Lc/a/a/a/f2/n0/b$c;->f:J

    iget-wide v11, v0, Lc/a/a/a/f2/n0/b$c;->h:J

    const-wide/32 v13, 0xf4240

    iget v6, v6, Lc/a/a/a/f2/n0/c;->c:I

    int-to-long v3, v6

    move-wide v15, v3

    .line 8
    invoke-static/range {v11 .. v16}, Lc/a/a/a/m2/m0;->B0(JJJ)J

    move-result-wide v3

    add-long v18, v9, v3

    mul-int v21, v8, v7

    .line 9
    iget v3, v0, Lc/a/a/a/f2/n0/b$c;->g:I

    sub-int v3, v3, v21

    .line 10
    iget-object v4, v0, Lc/a/a/a/f2/n0/b$c;->b:Lc/a/a/a/f2/b0;

    const/16 v20, 0x1

    const/16 v23, 0x0

    move-object/from16 v17, v4

    move/from16 v22, v3

    invoke-interface/range {v17 .. v23}, Lc/a/a/a/f2/b0;->c(JIIILc/a/a/a/f2/b0$a;)V

    .line 11
    iget-wide v4, v0, Lc/a/a/a/f2/n0/b$c;->h:J

    int-to-long v6, v8

    add-long/2addr v4, v6

    iput-wide v4, v0, Lc/a/a/a/f2/n0/b$c;->h:J

    .line 12
    iput v3, v0, Lc/a/a/a/f2/n0/b$c;->g:I

    const-wide/16 v3, 0x0

    goto :goto_1

    :cond_2
    move-wide v3, v4

    :goto_1
    cmp-long v5, v1, v3

    if-gtz v5, :cond_3

    const/4 v3, 0x1

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    :goto_2
    return v3
.end method
