.class public final Lc/a/a/a/n2/a0/b;
.super Lc/a/a/a/h0;
.source "CameraMotionRenderer.java"


# instance fields
.field private final m:Lc/a/a/a/c2/f;

.field private final n:Lc/a/a/a/m2/a0;

.field private o:J

.field private p:Lc/a/a/a/n2/a0/a;

.field private q:J


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x6

    .line 1
    invoke-direct {p0, v0}, Lc/a/a/a/h0;-><init>(I)V

    .line 2
    new-instance v0, Lc/a/a/a/c2/f;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lc/a/a/a/c2/f;-><init>(I)V

    iput-object v0, p0, Lc/a/a/a/n2/a0/b;->m:Lc/a/a/a/c2/f;

    .line 3
    new-instance v0, Lc/a/a/a/m2/a0;

    invoke-direct {v0}, Lc/a/a/a/m2/a0;-><init>()V

    iput-object v0, p0, Lc/a/a/a/n2/a0/b;->n:Lc/a/a/a/m2/a0;

    return-void
.end method

.method private O(Ljava/nio/ByteBuffer;)[F
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    iget-object v0, p0, Lc/a/a/a/n2/a0/b;->n:Lc/a/a/a/m2/a0;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lc/a/a/a/m2/a0;->N([BI)V

    .line 3
    iget-object v0, p0, Lc/a/a/a/n2/a0/b;->n:Lc/a/a/a/m2/a0;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result p1

    add-int/lit8 p1, p1, 0x4

    invoke-virtual {v0, p1}, Lc/a/a/a/m2/a0;->P(I)V

    const/4 p1, 0x3

    new-array v0, p1, [F

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_1

    .line 4
    iget-object v2, p0, Lc/a/a/a/n2/a0/b;->n:Lc/a/a/a/m2/a0;

    invoke-virtual {v2}, Lc/a/a/a/m2/a0;->q()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private P()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/n2/a0/b;->p:Lc/a/a/a/n2/a0/a;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lc/a/a/a/n2/a0/a;->b()V

    :cond_0
    return-void
.end method


# virtual methods
.method protected F()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/a/a/a/n2/a0/b;->P()V

    return-void
.end method

.method protected H(JZ)V
    .locals 0

    const-wide/high16 p1, -0x8000000000000000L

    .line 1
    iput-wide p1, p0, Lc/a/a/a/n2/a0/b;->q:J

    .line 2
    invoke-direct {p0}, Lc/a/a/a/n2/a0/b;->P()V

    return-void
.end method

.method protected L([Lc/a/a/a/u0;JJ)V
    .locals 0

    .line 1
    iput-wide p4, p0, Lc/a/a/a/n2/a0/b;->o:J

    return-void
.end method

.method public a(Lc/a/a/a/u0;)I
    .locals 1

    .line 1
    iget-object p1, p1, Lc/a/a/a/u0;->l:Ljava/lang/String;

    const-string v0, "application/x-camera-motion"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    .line 2
    invoke-static {p1}, Lc/a/a/a/q1;->a(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 3
    invoke-static {p1}, Lc/a/a/a/q1;->a(I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public b()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/h0;->i()Z

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "CameraMotionRenderer"

    return-object v0
.end method

.method public l(JJ)V
    .locals 4

    .line 1
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lc/a/a/a/h0;->i()Z

    move-result p3

    if-nez p3, :cond_4

    iget-wide p3, p0, Lc/a/a/a/n2/a0/b;->q:J

    const-wide/32 v0, 0x186a0

    add-long/2addr v0, p1

    cmp-long v2, p3, v0

    if-gez v2, :cond_4

    .line 2
    iget-object p3, p0, Lc/a/a/a/n2/a0/b;->m:Lc/a/a/a/c2/f;

    invoke-virtual {p3}, Lc/a/a/a/c2/f;->f()V

    .line 3
    invoke-virtual {p0}, Lc/a/a/a/h0;->B()Lc/a/a/a/v0;

    move-result-object p3

    .line 4
    iget-object p4, p0, Lc/a/a/a/n2/a0/b;->m:Lc/a/a/a/c2/f;

    const/4 v0, 0x0

    invoke-virtual {p0, p3, p4, v0}, Lc/a/a/a/h0;->M(Lc/a/a/a/v0;Lc/a/a/a/c2/f;Z)I

    move-result p3

    const/4 p4, -0x4

    if-ne p3, p4, :cond_4

    .line 5
    iget-object p3, p0, Lc/a/a/a/n2/a0/b;->m:Lc/a/a/a/c2/f;

    invoke-virtual {p3}, Lc/a/a/a/c2/a;->k()Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_1

    .line 6
    :cond_1
    iget-object p3, p0, Lc/a/a/a/n2/a0/b;->m:Lc/a/a/a/c2/f;

    iget-wide v0, p3, Lc/a/a/a/c2/f;->e:J

    iput-wide v0, p0, Lc/a/a/a/n2/a0/b;->q:J

    .line 7
    iget-object p4, p0, Lc/a/a/a/n2/a0/b;->p:Lc/a/a/a/n2/a0/a;

    if-eqz p4, :cond_0

    invoke-virtual {p3}, Lc/a/a/a/c2/a;->j()Z

    move-result p3

    if-eqz p3, :cond_2

    goto :goto_0

    .line 8
    :cond_2
    iget-object p3, p0, Lc/a/a/a/n2/a0/b;->m:Lc/a/a/a/c2/f;

    invoke-virtual {p3}, Lc/a/a/a/c2/f;->p()V

    .line 9
    iget-object p3, p0, Lc/a/a/a/n2/a0/b;->m:Lc/a/a/a/c2/f;

    iget-object p3, p3, Lc/a/a/a/c2/f;->c:Ljava/nio/ByteBuffer;

    invoke-static {p3}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/nio/ByteBuffer;

    invoke-direct {p0, p3}, Lc/a/a/a/n2/a0/b;->O(Ljava/nio/ByteBuffer;)[F

    move-result-object p3

    if-nez p3, :cond_3

    goto :goto_0

    .line 10
    :cond_3
    iget-object p4, p0, Lc/a/a/a/n2/a0/b;->p:Lc/a/a/a/n2/a0/a;

    invoke-static {p4}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lc/a/a/a/n2/a0/a;

    iget-wide v0, p0, Lc/a/a/a/n2/a0/b;->q:J

    iget-wide v2, p0, Lc/a/a/a/n2/a0/b;->o:J

    sub-long/2addr v0, v2

    invoke-interface {p4, v0, v1, p3}, Lc/a/a/a/n2/a0/a;->a(J[F)V

    goto :goto_0

    :cond_4
    :goto_1
    return-void
.end method

.method public m(ILjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    const/4 v0, 0x7

    if-ne p1, v0, :cond_0

    .line 1
    check-cast p2, Lc/a/a/a/n2/a0/a;

    iput-object p2, p0, Lc/a/a/a/n2/a0/b;->p:Lc/a/a/a/n2/a0/a;

    goto :goto_0

    .line 2
    :cond_0
    invoke-super {p0, p1, p2}, Lc/a/a/a/h0;->m(ILjava/lang/Object;)V

    :goto_0
    return-void
.end method
