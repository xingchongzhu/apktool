.class public final Lc/a/a/a/b2/h0;
.super Ljava/lang/Object;
.source "SonicAudioProcessor.java"

# interfaces
.implements Lc/a/a/a/b2/q;


# instance fields
.field private b:I

.field private c:F

.field private d:F

.field private e:Lc/a/a/a/b2/q$a;

.field private f:Lc/a/a/a/b2/q$a;

.field private g:Lc/a/a/a/b2/q$a;

.field private h:Lc/a/a/a/b2/q$a;

.field private i:Z

.field private j:Lc/a/a/a/b2/g0;

.field private k:Ljava/nio/ByteBuffer;

.field private l:Ljava/nio/ShortBuffer;

.field private m:Ljava/nio/ByteBuffer;

.field private n:J

.field private o:J

.field private p:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    iput v0, p0, Lc/a/a/a/b2/h0;->c:F

    .line 3
    iput v0, p0, Lc/a/a/a/b2/h0;->d:F

    .line 4
    sget-object v0, Lc/a/a/a/b2/q$a;->a:Lc/a/a/a/b2/q$a;

    iput-object v0, p0, Lc/a/a/a/b2/h0;->e:Lc/a/a/a/b2/q$a;

    .line 5
    iput-object v0, p0, Lc/a/a/a/b2/h0;->f:Lc/a/a/a/b2/q$a;

    .line 6
    iput-object v0, p0, Lc/a/a/a/b2/h0;->g:Lc/a/a/a/b2/q$a;

    .line 7
    iput-object v0, p0, Lc/a/a/a/b2/h0;->h:Lc/a/a/a/b2/q$a;

    .line 8
    sget-object v0, Lc/a/a/a/b2/q;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lc/a/a/a/b2/h0;->k:Ljava/nio/ByteBuffer;

    .line 9
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v1

    iput-object v1, p0, Lc/a/a/a/b2/h0;->l:Ljava/nio/ShortBuffer;

    .line 10
    iput-object v0, p0, Lc/a/a/a/b2/h0;->m:Ljava/nio/ByteBuffer;

    const/4 v0, -0x1

    .line 11
    iput v0, p0, Lc/a/a/a/b2/h0;->b:I

    return-void
.end method


# virtual methods
.method public a()Ljava/nio/ByteBuffer;
    .locals 6

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/h0;->j:Lc/a/a/a/b2/g0;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Lc/a/a/a/b2/g0;->k()I

    move-result v1

    if-lez v1, :cond_1

    .line 3
    iget-object v2, p0, Lc/a/a/a/b2/h0;->k:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v2

    if-ge v2, v1, :cond_0

    .line 4
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, p0, Lc/a/a/a/b2/h0;->k:Ljava/nio/ByteBuffer;

    .line 5
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v2

    iput-object v2, p0, Lc/a/a/a/b2/h0;->l:Ljava/nio/ShortBuffer;

    goto :goto_0

    .line 6
    :cond_0
    iget-object v2, p0, Lc/a/a/a/b2/h0;->k:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 7
    iget-object v2, p0, Lc/a/a/a/b2/h0;->l:Ljava/nio/ShortBuffer;

    invoke-virtual {v2}, Ljava/nio/ShortBuffer;->clear()Ljava/nio/Buffer;

    .line 8
    :goto_0
    iget-object v2, p0, Lc/a/a/a/b2/h0;->l:Ljava/nio/ShortBuffer;

    invoke-virtual {v0, v2}, Lc/a/a/a/b2/g0;->j(Ljava/nio/ShortBuffer;)V

    .line 9
    iget-wide v2, p0, Lc/a/a/a/b2/h0;->o:J

    int-to-long v4, v1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lc/a/a/a/b2/h0;->o:J

    .line 10
    iget-object v0, p0, Lc/a/a/a/b2/h0;->k:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 11
    iget-object v0, p0, Lc/a/a/a/b2/h0;->k:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lc/a/a/a/b2/h0;->m:Ljava/nio/ByteBuffer;

    .line 12
    :cond_1
    iget-object v0, p0, Lc/a/a/a/b2/h0;->m:Ljava/nio/ByteBuffer;

    .line 13
    sget-object v1, Lc/a/a/a/b2/q;->a:Ljava/nio/ByteBuffer;

    iput-object v1, p0, Lc/a/a/a/b2/h0;->m:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/b2/h0;->p:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lc/a/a/a/b2/h0;->j:Lc/a/a/a/b2/g0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc/a/a/a/b2/g0;->k()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/h0;->j:Lc/a/a/a/b2/g0;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lc/a/a/a/b2/g0;->s()V

    :cond_0
    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lc/a/a/a/b2/h0;->p:Z

    return-void
.end method

.method public d()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/h0;->f:Lc/a/a/a/b2/q$a;

    iget v0, v0, Lc/a/a/a/b2/q$a;->b:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget v0, p0, Lc/a/a/a/b2/h0;->c:F

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v0, v1

    .line 2
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v2, 0x38d1b717    # 1.0E-4f

    cmpl-float v0, v0, v2

    if-gez v0, :cond_0

    iget v0, p0, Lc/a/a/a/b2/h0;->d:F

    sub-float/2addr v0, v1

    .line 3
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpl-float v0, v0, v2

    if-gez v0, :cond_0

    iget-object v0, p0, Lc/a/a/a/b2/h0;->f:Lc/a/a/a/b2/q$a;

    iget v0, v0, Lc/a/a/a/b2/q$a;->b:I

    iget-object v1, p0, Lc/a/a/a/b2/h0;->e:Lc/a/a/a/b2/q$a;

    iget v1, v1, Lc/a/a/a/b2/q$a;->b:I

    if-eq v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e(Ljava/nio/ByteBuffer;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lc/a/a/a/b2/h0;->j:Lc/a/a/a/b2/g0;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/b2/g0;

    .line 3
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v1

    .line 4
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    .line 5
    iget-wide v3, p0, Lc/a/a/a/b2/h0;->n:J

    int-to-long v5, v2

    add-long/2addr v3, v5

    iput-wide v3, p0, Lc/a/a/a/b2/h0;->n:J

    .line 6
    invoke-virtual {v0, v1}, Lc/a/a/a/b2/g0;->t(Ljava/nio/ShortBuffer;)V

    .line 7
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    add-int/2addr v0, v2

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method

.method public f(Lc/a/a/a/b2/q$a;)Lc/a/a/a/b2/q$a;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/b2/q$b;
        }
    .end annotation

    .line 1
    iget v0, p1, Lc/a/a/a/b2/q$a;->d:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 2
    iget v0, p0, Lc/a/a/a/b2/h0;->b:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    .line 3
    iget v0, p1, Lc/a/a/a/b2/q$a;->b:I

    .line 4
    :cond_0
    iput-object p1, p0, Lc/a/a/a/b2/h0;->e:Lc/a/a/a/b2/q$a;

    .line 5
    new-instance v2, Lc/a/a/a/b2/q$a;

    iget p1, p1, Lc/a/a/a/b2/q$a;->c:I

    invoke-direct {v2, v0, p1, v1}, Lc/a/a/a/b2/q$a;-><init>(III)V

    iput-object v2, p0, Lc/a/a/a/b2/h0;->f:Lc/a/a/a/b2/q$a;

    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lc/a/a/a/b2/h0;->i:Z

    return-object v2

    .line 7
    :cond_1
    new-instance v0, Lc/a/a/a/b2/q$b;

    invoke-direct {v0, p1}, Lc/a/a/a/b2/q$b;-><init>(Lc/a/a/a/b2/q$a;)V

    throw v0
.end method

.method public flush()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/b2/h0;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lc/a/a/a/b2/h0;->e:Lc/a/a/a/b2/q$a;

    iput-object v0, p0, Lc/a/a/a/b2/h0;->g:Lc/a/a/a/b2/q$a;

    .line 3
    iget-object v1, p0, Lc/a/a/a/b2/h0;->f:Lc/a/a/a/b2/q$a;

    iput-object v1, p0, Lc/a/a/a/b2/h0;->h:Lc/a/a/a/b2/q$a;

    .line 4
    iget-boolean v2, p0, Lc/a/a/a/b2/h0;->i:Z

    if-eqz v2, :cond_0

    .line 5
    new-instance v2, Lc/a/a/a/b2/g0;

    iget v4, v0, Lc/a/a/a/b2/q$a;->b:I

    iget v5, v0, Lc/a/a/a/b2/q$a;->c:I

    iget v6, p0, Lc/a/a/a/b2/h0;->c:F

    iget v7, p0, Lc/a/a/a/b2/h0;->d:F

    iget v8, v1, Lc/a/a/a/b2/q$a;->b:I

    move-object v3, v2

    invoke-direct/range {v3 .. v8}, Lc/a/a/a/b2/g0;-><init>(IIFFI)V

    iput-object v2, p0, Lc/a/a/a/b2/h0;->j:Lc/a/a/a/b2/g0;

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lc/a/a/a/b2/h0;->j:Lc/a/a/a/b2/g0;

    if-eqz v0, :cond_1

    .line 7
    invoke-virtual {v0}, Lc/a/a/a/b2/g0;->i()V

    .line 8
    :cond_1
    :goto_0
    sget-object v0, Lc/a/a/a/b2/q;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lc/a/a/a/b2/h0;->m:Ljava/nio/ByteBuffer;

    const-wide/16 v0, 0x0

    .line 9
    iput-wide v0, p0, Lc/a/a/a/b2/h0;->n:J

    .line 10
    iput-wide v0, p0, Lc/a/a/a/b2/h0;->o:J

    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lc/a/a/a/b2/h0;->p:Z

    return-void
.end method

.method public g(J)J
    .locals 15

    move-object v0, p0

    .line 1
    iget-wide v1, v0, Lc/a/a/a/b2/h0;->o:J

    const-wide/16 v3, 0x400

    cmp-long v5, v1, v3

    if-ltz v5, :cond_1

    .line 2
    iget-wide v1, v0, Lc/a/a/a/b2/h0;->n:J

    iget-object v3, v0, Lc/a/a/a/b2/h0;->j:Lc/a/a/a/b2/g0;

    invoke-static {v3}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/a/a/a/b2/g0;

    invoke-virtual {v3}, Lc/a/a/a/b2/g0;->l()I

    move-result v3

    int-to-long v3, v3

    sub-long v7, v1, v3

    .line 3
    iget-object v1, v0, Lc/a/a/a/b2/h0;->h:Lc/a/a/a/b2/q$a;

    iget v1, v1, Lc/a/a/a/b2/q$a;->b:I

    iget-object v2, v0, Lc/a/a/a/b2/h0;->g:Lc/a/a/a/b2/q$a;

    iget v2, v2, Lc/a/a/a/b2/q$a;->b:I

    if-ne v1, v2, :cond_0

    .line 4
    iget-wide v9, v0, Lc/a/a/a/b2/h0;->o:J

    move-wide/from16 v5, p1

    invoke-static/range {v5 .. v10}, Lc/a/a/a/m2/m0;->B0(JJJ)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    int-to-long v3, v1

    mul-long v11, v7, v3

    .line 5
    iget-wide v3, v0, Lc/a/a/a/b2/h0;->o:J

    int-to-long v1, v2

    mul-long v13, v3, v1

    move-wide/from16 v9, p1

    invoke-static/range {v9 .. v14}, Lc/a/a/a/m2/m0;->B0(JJJ)J

    move-result-wide v1

    :goto_0
    return-wide v1

    .line 6
    :cond_1
    iget v1, v0, Lc/a/a/a/b2/h0;->c:F

    float-to-double v1, v1

    move-wide/from16 v3, p1

    long-to-double v3, v3

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v1, v1, v3

    double-to-long v1, v1

    return-wide v1
.end method

.method public h(F)V
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/b2/h0;->d:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lc/a/a/a/b2/h0;->d:F

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lc/a/a/a/b2/h0;->i:Z

    :cond_0
    return-void
.end method

.method public i(F)V
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/b2/h0;->c:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lc/a/a/a/b2/h0;->c:F

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lc/a/a/a/b2/h0;->i:Z

    :cond_0
    return-void
.end method

.method public reset()V
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    .line 1
    iput v0, p0, Lc/a/a/a/b2/h0;->c:F

    .line 2
    iput v0, p0, Lc/a/a/a/b2/h0;->d:F

    .line 3
    sget-object v0, Lc/a/a/a/b2/q$a;->a:Lc/a/a/a/b2/q$a;

    iput-object v0, p0, Lc/a/a/a/b2/h0;->e:Lc/a/a/a/b2/q$a;

    .line 4
    iput-object v0, p0, Lc/a/a/a/b2/h0;->f:Lc/a/a/a/b2/q$a;

    .line 5
    iput-object v0, p0, Lc/a/a/a/b2/h0;->g:Lc/a/a/a/b2/q$a;

    .line 6
    iput-object v0, p0, Lc/a/a/a/b2/h0;->h:Lc/a/a/a/b2/q$a;

    .line 7
    sget-object v0, Lc/a/a/a/b2/q;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lc/a/a/a/b2/h0;->k:Ljava/nio/ByteBuffer;

    .line 8
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v1

    iput-object v1, p0, Lc/a/a/a/b2/h0;->l:Ljava/nio/ShortBuffer;

    .line 9
    iput-object v0, p0, Lc/a/a/a/b2/h0;->m:Ljava/nio/ByteBuffer;

    const/4 v0, -0x1

    .line 10
    iput v0, p0, Lc/a/a/a/b2/h0;->b:I

    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lc/a/a/a/b2/h0;->i:Z

    const/4 v1, 0x0

    .line 12
    iput-object v1, p0, Lc/a/a/a/b2/h0;->j:Lc/a/a/a/b2/g0;

    const-wide/16 v1, 0x0

    .line 13
    iput-wide v1, p0, Lc/a/a/a/b2/h0;->n:J

    .line 14
    iput-wide v1, p0, Lc/a/a/a/b2/h0;->o:J

    .line 15
    iput-boolean v0, p0, Lc/a/a/a/b2/h0;->p:Z

    return-void
.end method
