.class public Lc/a/a/a/b2/b0;
.super Lc/a/a/a/g2/t;
.source "MediaCodecAudioRenderer.java"

# interfaces
.implements Lc/a/a/a/m2/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/b2/b0$b;
    }
.end annotation


# instance fields
.field private final K0:Landroid/content/Context;

.field private final L0:Lc/a/a/a/b2/r$a;

.field private final M0:Lc/a/a/a/b2/s;

.field private N0:I

.field private O0:Z

.field private P0:Lc/a/a/a/u0;

.field private Q0:J

.field private R0:Z

.field private S0:Z

.field private T0:Z

.field private U0:Z

.field private V0:Lc/a/a/a/p1$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lc/a/a/a/g2/q$a;Lc/a/a/a/g2/u;ZLandroid/os/Handler;Lc/a/a/a/b2/r;Lc/a/a/a/b2/s;)V
    .locals 6

    const/4 v1, 0x1

    const v5, 0x472c4400    # 44100.0f

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    .line 2
    invoke-direct/range {v0 .. v5}, Lc/a/a/a/g2/t;-><init>(ILc/a/a/a/g2/q$a;Lc/a/a/a/g2/u;ZF)V

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/b2/b0;->K0:Landroid/content/Context;

    .line 4
    iput-object p7, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    .line 5
    new-instance p1, Lc/a/a/a/b2/r$a;

    invoke-direct {p1, p5, p6}, Lc/a/a/a/b2/r$a;-><init>(Landroid/os/Handler;Lc/a/a/a/b2/r;)V

    iput-object p1, p0, Lc/a/a/a/b2/b0;->L0:Lc/a/a/a/b2/r$a;

    .line 6
    new-instance p1, Lc/a/a/a/b2/b0$b;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lc/a/a/a/b2/b0$b;-><init>(Lc/a/a/a/b2/b0;Lc/a/a/a/b2/b0$a;)V

    invoke-interface {p7, p1}, Lc/a/a/a/b2/s;->o(Lc/a/a/a/b2/s$c;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lc/a/a/a/g2/u;ZLandroid/os/Handler;Lc/a/a/a/b2/r;Lc/a/a/a/b2/s;)V
    .locals 8

    .line 1
    sget-object v2, Lc/a/a/a/g2/q$a;->a:Lc/a/a/a/g2/q$a;

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lc/a/a/a/b2/b0;-><init>(Landroid/content/Context;Lc/a/a/a/g2/q$a;Lc/a/a/a/g2/u;ZLandroid/os/Handler;Lc/a/a/a/b2/r;Lc/a/a/a/b2/s;)V

    return-void
.end method

.method static synthetic o1(Lc/a/a/a/b2/b0;)Lc/a/a/a/b2/r$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/b2/b0;->L0:Lc/a/a/a/b2/r$a;

    return-object p0
.end method

.method static synthetic p1(Lc/a/a/a/b2/b0;)Lc/a/a/a/p1$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/b2/b0;->V0:Lc/a/a/a/p1$a;

    return-object p0
.end method

.method private static q1(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_1

    const-string v0, "OMX.SEC.aac.dec"

    .line 2
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lc/a/a/a/m2/m0;->c:Ljava/lang/String;

    const-string v0, "samsung"

    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lc/a/a/a/m2/m0;->b:Ljava/lang/String;

    const-string v0, "zeroflte"

    .line 4
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "herolte"

    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "heroqlte"

    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static r1()Z
    .locals 2

    .line 1
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v1, 0x17

    if-ne v0, v1, :cond_1

    sget-object v0, Lc/a/a/a/m2/m0;->d:Ljava/lang/String;

    const-string v1, "ZTE B2017G"

    .line 2
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "AXON 7 mini"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private s1(Lc/a/a/a/g2/s;Lc/a/a/a/u0;)I
    .locals 1

    .line 1
    iget-object p1, p1, Lc/a/a/a/g2/s;->a:Ljava/lang/String;

    const-string v0, "OMX.google.raw.decoder"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    sget p1, Lc/a/a/a/m2/m0;->a:I

    const/16 v0, 0x18

    if-ge p1, v0, :cond_1

    const/16 v0, 0x17

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lc/a/a/a/b2/b0;->K0:Landroid/content/Context;

    invoke-static {p1}, Lc/a/a/a/m2/m0;->m0(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    const/4 p1, -0x1

    return p1

    .line 3
    :cond_1
    iget p1, p2, Lc/a/a/a/u0;->m:I

    return p1
.end method

.method private w1()V
    .locals 5

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-virtual {p0}, Lc/a/a/a/b2/b0;->b()Z

    move-result v1

    invoke-interface {v0, v1}, Lc/a/a/a/b2/s;->m(Z)J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 2
    iget-boolean v2, p0, Lc/a/a/a/b2/b0;->S0:Z

    if-eqz v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-wide v2, p0, Lc/a/a/a/b2/b0;->Q0:J

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :goto_0
    iput-wide v0, p0, Lc/a/a/a/b2/b0;->Q0:J

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lc/a/a/a/b2/b0;->S0:Z

    :cond_1
    return-void
.end method


# virtual methods
.method protected F()V
    .locals 3

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/b2/b0;->T0:Z

    .line 2
    :try_start_0
    iget-object v0, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-interface {v0}, Lc/a/a/a/b2/s;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    :try_start_1
    invoke-super {p0}, Lc/a/a/a/g2/t;->F()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 4
    iget-object v0, p0, Lc/a/a/a/b2/b0;->L0:Lc/a/a/a/b2/r$a;

    iget-object v1, p0, Lc/a/a/a/g2/t;->G0:Lc/a/a/a/c2/d;

    invoke-virtual {v0, v1}, Lc/a/a/a/b2/r$a;->d(Lc/a/a/a/c2/d;)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lc/a/a/a/b2/b0;->L0:Lc/a/a/a/b2/r$a;

    iget-object v2, p0, Lc/a/a/a/g2/t;->G0:Lc/a/a/a/c2/d;

    invoke-virtual {v1, v2}, Lc/a/a/a/b2/r$a;->d(Lc/a/a/a/c2/d;)V

    .line 5
    throw v0

    :catchall_1
    move-exception v0

    .line 6
    :try_start_2
    invoke-super {p0}, Lc/a/a/a/g2/t;->F()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 7
    iget-object v1, p0, Lc/a/a/a/b2/b0;->L0:Lc/a/a/a/b2/r$a;

    iget-object v2, p0, Lc/a/a/a/g2/t;->G0:Lc/a/a/a/c2/d;

    invoke-virtual {v1, v2}, Lc/a/a/a/b2/r$a;->d(Lc/a/a/a/c2/d;)V

    .line 8
    throw v0

    :catchall_2
    move-exception v0

    .line 9
    iget-object v1, p0, Lc/a/a/a/b2/b0;->L0:Lc/a/a/a/b2/r$a;

    iget-object v2, p0, Lc/a/a/a/g2/t;->G0:Lc/a/a/a/c2/d;

    invoke-virtual {v1, v2}, Lc/a/a/a/b2/r$a;->d(Lc/a/a/a/c2/d;)V

    .line 10
    throw v0
.end method

.method protected G(ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, Lc/a/a/a/g2/t;->G(ZZ)V

    .line 2
    iget-object p1, p0, Lc/a/a/a/b2/b0;->L0:Lc/a/a/a/b2/r$a;

    iget-object p2, p0, Lc/a/a/a/g2/t;->G0:Lc/a/a/a/c2/d;

    invoke-virtual {p1, p2}, Lc/a/a/a/b2/r$a;->e(Lc/a/a/a/c2/d;)V

    .line 3
    invoke-virtual {p0}, Lc/a/a/a/h0;->A()Lc/a/a/a/s1;

    move-result-object p1

    iget-boolean p1, p1, Lc/a/a/a/s1;->b:Z

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-interface {p1}, Lc/a/a/a/b2/s;->g()V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-interface {p1}, Lc/a/a/a/b2/s;->n()V

    :goto_0
    return-void
.end method

.method protected H(JZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2, p3}, Lc/a/a/a/g2/t;->H(JZ)V

    .line 2
    iget-boolean p3, p0, Lc/a/a/a/b2/b0;->U0:Z

    if-eqz p3, :cond_0

    .line 3
    iget-object p3, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-interface {p3}, Lc/a/a/a/b2/s;->s()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p3, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-interface {p3}, Lc/a/a/a/b2/s;->flush()V

    .line 5
    :goto_0
    iput-wide p1, p0, Lc/a/a/a/b2/b0;->Q0:J

    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lc/a/a/a/b2/b0;->R0:Z

    .line 7
    iput-boolean p1, p0, Lc/a/a/a/b2/b0;->S0:Z

    return-void
.end method

.method protected I()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-super {p0}, Lc/a/a/a/g2/t;->I()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    iget-boolean v1, p0, Lc/a/a/a/b2/b0;->T0:Z

    if-eqz v1, :cond_0

    .line 3
    iput-boolean v0, p0, Lc/a/a/a/b2/b0;->T0:Z

    .line 4
    iget-object v0, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-interface {v0}, Lc/a/a/a/b2/s;->reset()V

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    .line 5
    iget-boolean v2, p0, Lc/a/a/a/b2/b0;->T0:Z

    if-eqz v2, :cond_1

    .line 6
    iput-boolean v0, p0, Lc/a/a/a/b2/b0;->T0:Z

    .line 7
    iget-object v0, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-interface {v0}, Lc/a/a/a/b2/s;->reset()V

    .line 8
    :cond_1
    throw v1
.end method

.method protected J()V
    .locals 1

    .line 1
    invoke-super {p0}, Lc/a/a/a/g2/t;->J()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-interface {v0}, Lc/a/a/a/b2/s;->k()V

    return-void
.end method

.method protected K()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/b2/b0;->w1()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-interface {v0}, Lc/a/a/a/b2/s;->d()V

    .line 3
    invoke-super {p0}, Lc/a/a/a/g2/t;->K()V

    return-void
.end method

.method protected K0(Ljava/lang/String;JJ)V
    .locals 6

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/b0;->L0:Lc/a/a/a/b2/r$a;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Lc/a/a/a/b2/r$a;->b(Ljava/lang/String;JJ)V

    return-void
.end method

.method protected L0(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/b0;->L0:Lc/a/a/a/b2/r$a;

    invoke-virtual {v0, p1}, Lc/a/a/a/b2/r$a;->c(Ljava/lang/String;)V

    return-void
.end method

.method protected M0(Lc/a/a/a/v0;)Lc/a/a/a/c2/g;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Lc/a/a/a/g2/t;->M0(Lc/a/a/a/v0;)Lc/a/a/a/c2/g;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lc/a/a/a/b2/b0;->L0:Lc/a/a/a/b2/r$a;

    iget-object p1, p1, Lc/a/a/a/v0;->b:Lc/a/a/a/u0;

    invoke-virtual {v1, p1, v0}, Lc/a/a/a/b2/r$a;->f(Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V

    return-object v0
.end method

.method protected N0(Lc/a/a/a/u0;Landroid/media/MediaFormat;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/b0;->P0:Lc/a/a/a/u0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move-object p1, v0

    goto/16 :goto_2

    .line 2
    :cond_0
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->q0()Lc/a/a/a/g2/q;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    .line 3
    :cond_1
    iget-object v0, p1, Lc/a/a/a/u0;->l:Ljava/lang/String;

    const-string v3, "audio/raw"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4
    iget v0, p1, Lc/a/a/a/u0;->A:I

    goto :goto_0

    .line 5
    :cond_2
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v4, 0x18

    if-lt v0, v4, :cond_3

    const-string v0, "pcm-encoding"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 6
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_3
    const-string v0, "v-bits-per-sample"

    .line 7
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 8
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lc/a/a/a/m2/m0;->V(I)I

    move-result v0

    goto :goto_0

    .line 9
    :cond_4
    iget-object v0, p1, Lc/a/a/a/u0;->l:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 10
    iget v0, p1, Lc/a/a/a/u0;->A:I

    goto :goto_0

    :cond_5
    const/4 v0, 0x2

    .line 11
    :goto_0
    new-instance v4, Lc/a/a/a/u0$b;

    invoke-direct {v4}, Lc/a/a/a/u0$b;-><init>()V

    .line 12
    invoke-virtual {v4, v3}, Lc/a/a/a/u0$b;->e0(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v3

    .line 13
    invoke-virtual {v3, v0}, Lc/a/a/a/u0$b;->Y(I)Lc/a/a/a/u0$b;

    move-result-object v0

    iget v3, p1, Lc/a/a/a/u0;->B:I

    .line 14
    invoke-virtual {v0, v3}, Lc/a/a/a/u0$b;->M(I)Lc/a/a/a/u0$b;

    move-result-object v0

    iget v3, p1, Lc/a/a/a/u0;->C:I

    .line 15
    invoke-virtual {v0, v3}, Lc/a/a/a/u0$b;->N(I)Lc/a/a/a/u0$b;

    move-result-object v0

    const-string v3, "channel-count"

    .line 16
    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v3}, Lc/a/a/a/u0$b;->H(I)Lc/a/a/a/u0$b;

    move-result-object v0

    const-string v3, "sample-rate"

    .line 17
    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {v0, p2}, Lc/a/a/a/u0$b;->f0(I)Lc/a/a/a/u0$b;

    move-result-object p2

    .line 18
    invoke-virtual {p2}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object p2

    .line 19
    iget-boolean v0, p0, Lc/a/a/a/b2/b0;->O0:Z

    if-eqz v0, :cond_6

    iget v0, p2, Lc/a/a/a/u0;->y:I

    const/4 v3, 0x6

    if-ne v0, v3, :cond_6

    iget v0, p1, Lc/a/a/a/u0;->y:I

    if-ge v0, v3, :cond_6

    .line 20
    new-array v2, v0, [I

    const/4 v0, 0x0

    .line 21
    :goto_1
    iget v3, p1, Lc/a/a/a/u0;->y:I

    if-ge v0, v3, :cond_6

    .line 22
    aput v0, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_6
    move-object p1, p2

    .line 23
    :goto_2
    :try_start_0
    iget-object p2, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-interface {p2, p1, v1, v2}, Lc/a/a/a/b2/s;->r(Lc/a/a/a/u0;I[I)V
    :try_end_0
    .catch Lc/a/a/a/b2/s$a; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 24
    iget-object p2, p1, Lc/a/a/a/b2/s$a;->a:Lc/a/a/a/u0;

    invoke-virtual {p0, p1, p2}, Lc/a/a/a/h0;->y(Ljava/lang/Throwable;Lc/a/a/a/u0;)Lc/a/a/a/p0;

    move-result-object p1

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method

.method protected P0()V
    .locals 1

    .line 1
    invoke-super {p0}, Lc/a/a/a/g2/t;->P0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-interface {v0}, Lc/a/a/a/b2/s;->v()V

    return-void
.end method

.method protected Q(Lc/a/a/a/g2/s;Lc/a/a/a/u0;Lc/a/a/a/u0;)Lc/a/a/a/c2/g;
    .locals 8

    .line 1
    invoke-virtual {p1, p2, p3}, Lc/a/a/a/g2/s;->e(Lc/a/a/a/u0;Lc/a/a/a/u0;)Lc/a/a/a/c2/g;

    move-result-object v0

    .line 2
    iget v1, v0, Lc/a/a/a/c2/g;->e:I

    .line 3
    invoke-direct {p0, p1, p3}, Lc/a/a/a/b2/b0;->s1(Lc/a/a/a/g2/s;Lc/a/a/a/u0;)I

    move-result v2

    iget v3, p0, Lc/a/a/a/b2/b0;->N0:I

    if-le v2, v3, :cond_0

    or-int/lit8 v1, v1, 0x40

    :cond_0
    move v7, v1

    .line 4
    new-instance v1, Lc/a/a/a/c2/g;

    iget-object v3, p1, Lc/a/a/a/g2/s;->a:Ljava/lang/String;

    if-eqz v7, :cond_1

    const/4 p1, 0x0

    const/4 v6, 0x0

    goto :goto_0

    .line 5
    :cond_1
    iget p1, v0, Lc/a/a/a/c2/g;->d:I

    move v6, p1

    :goto_0
    move-object v2, v1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v2 .. v7}, Lc/a/a/a/c2/g;-><init>(Ljava/lang/String;Lc/a/a/a/u0;Lc/a/a/a/u0;II)V

    return-object v1
.end method

.method protected Q0(Lc/a/a/a/c2/f;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/b2/b0;->R0:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lc/a/a/a/c2/a;->j()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    iget-wide v0, p1, Lc/a/a/a/c2/f;->e:J

    iget-wide v2, p0, Lc/a/a/a/b2/b0;->Q0:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v2, 0x7a120

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 3
    iget-wide v0, p1, Lc/a/a/a/c2/f;->e:J

    iput-wide v0, p0, Lc/a/a/a/b2/b0;->Q0:J

    :cond_0
    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lc/a/a/a/b2/b0;->R0:Z

    :cond_1
    return-void
.end method

.method protected S0(JJLc/a/a/a/g2/q;Ljava/nio/ByteBuffer;IIIJZZLc/a/a/a/u0;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    invoke-static {p6}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object p1, p0, Lc/a/a/a/b2/b0;->P0:Lc/a/a/a/u0;

    const/4 p2, 0x1

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    and-int/lit8 p1, p8, 0x2

    if-eqz p1, :cond_0

    .line 3
    invoke-static {p5}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/g2/q;

    invoke-interface {p1, p7, p3}, Lc/a/a/a/g2/q;->e(IZ)V

    return p2

    :cond_0
    if-eqz p12, :cond_2

    if-eqz p5, :cond_1

    .line 4
    invoke-interface {p5, p7, p3}, Lc/a/a/a/g2/q;->e(IZ)V

    .line 5
    :cond_1
    iget-object p1, p0, Lc/a/a/a/g2/t;->G0:Lc/a/a/a/c2/d;

    iget p3, p1, Lc/a/a/a/c2/d;->f:I

    add-int/2addr p3, p9

    iput p3, p1, Lc/a/a/a/c2/d;->f:I

    .line 6
    iget-object p1, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-interface {p1}, Lc/a/a/a/b2/s;->v()V

    return p2

    .line 7
    :cond_2
    :try_start_0
    iget-object p1, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-interface {p1, p6, p10, p11, p9}, Lc/a/a/a/b2/s;->l(Ljava/nio/ByteBuffer;JI)Z

    move-result p1
    :try_end_0
    .catch Lc/a/a/a/b2/s$b; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lc/a/a/a/b2/s$d; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_4

    if-eqz p5, :cond_3

    .line 8
    invoke-interface {p5, p7, p3}, Lc/a/a/a/g2/q;->e(IZ)V

    .line 9
    :cond_3
    iget-object p1, p0, Lc/a/a/a/g2/t;->G0:Lc/a/a/a/c2/d;

    iget p3, p1, Lc/a/a/a/c2/d;->e:I

    add-int/2addr p3, p9

    iput p3, p1, Lc/a/a/a/c2/d;->e:I

    return p2

    :cond_4
    return p3

    :catch_0
    move-exception p1

    .line 10
    iget-boolean p2, p1, Lc/a/a/a/b2/s$d;->b:Z

    invoke-virtual {p0, p1, p14, p2}, Lc/a/a/a/h0;->z(Ljava/lang/Throwable;Lc/a/a/a/u0;Z)Lc/a/a/a/p0;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 11
    iget-object p2, p1, Lc/a/a/a/b2/s$b;->c:Lc/a/a/a/u0;

    iget-boolean p3, p1, Lc/a/a/a/b2/s$b;->b:Z

    invoke-virtual {p0, p1, p2, p3}, Lc/a/a/a/h0;->z(Ljava/lang/Throwable;Lc/a/a/a/u0;Z)Lc/a/a/a/p0;

    move-result-object p1

    throw p1
.end method

.method protected X0()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-interface {v0}, Lc/a/a/a/b2/s;->h()V
    :try_end_0
    .catch Lc/a/a/a/b2/s$d; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 2
    iget-object v1, v0, Lc/a/a/a/b2/s$d;->c:Lc/a/a/a/u0;

    iget-boolean v2, v0, Lc/a/a/a/b2/s$d;->b:Z

    invoke-virtual {p0, v0, v1, v2}, Lc/a/a/a/h0;->z(Ljava/lang/Throwable;Lc/a/a/a/u0;Z)Lc/a/a/a/p0;

    move-result-object v0

    throw v0
.end method

.method protected a0(Lc/a/a/a/g2/s;Lc/a/a/a/g2/q;Lc/a/a/a/u0;Landroid/media/MediaCrypto;F)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/h0;->D()[Lc/a/a/a/u0;

    move-result-object v0

    invoke-virtual {p0, p1, p3, v0}, Lc/a/a/a/b2/b0;->t1(Lc/a/a/a/g2/s;Lc/a/a/a/u0;[Lc/a/a/a/u0;)I

    move-result v0

    iput v0, p0, Lc/a/a/a/b2/b0;->N0:I

    .line 2
    iget-object v0, p1, Lc/a/a/a/g2/s;->a:Ljava/lang/String;

    invoke-static {v0}, Lc/a/a/a/b2/b0;->q1(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lc/a/a/a/b2/b0;->O0:Z

    .line 3
    iget-object v0, p1, Lc/a/a/a/g2/s;->c:Ljava/lang/String;

    iget v1, p0, Lc/a/a/a/b2/b0;->N0:I

    .line 4
    invoke-virtual {p0, p3, v0, v1, p5}, Lc/a/a/a/b2/b0;->u1(Lc/a/a/a/u0;Ljava/lang/String;IF)Landroid/media/MediaFormat;

    move-result-object p5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 5
    invoke-interface {p2, p5, v0, p4, v1}, Lc/a/a/a/g2/q;->c(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 6
    iget-object p1, p1, Lc/a/a/a/g2/s;->b:Ljava/lang/String;

    const-string p2, "audio/raw"

    .line 7
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p3, Lc/a/a/a/u0;->l:Ljava/lang/String;

    .line 8
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move-object p3, v0

    .line 9
    :goto_0
    iput-object p3, p0, Lc/a/a/a/b2/b0;->P0:Lc/a/a/a/u0;

    return-void
.end method

.method public b()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lc/a/a/a/g2/t;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-interface {v0}, Lc/a/a/a/b2/s;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()Lc/a/a/a/i1;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-interface {v0}, Lc/a/a/a/b2/s;->c()Lc/a/a/a/i1;

    move-result-object v0

    return-object v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-interface {v0}, Lc/a/a/a/b2/s;->i()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0}, Lc/a/a/a/g2/t;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public f(Lc/a/a/a/i1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-interface {v0, p1}, Lc/a/a/a/b2/s;->f(Lc/a/a/a/i1;)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "MediaCodecAudioRenderer"

    return-object v0
.end method

.method protected i1(Lc/a/a/a/u0;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-interface {v0, p1}, Lc/a/a/a/b2/s;->a(Lc/a/a/a/u0;)Z

    move-result p1

    return p1
.end method

.method protected j1(Lc/a/a/a/g2/u;Lc/a/a/a/u0;)I
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g2/v$c;
        }
    .end annotation

    .line 1
    iget-object v0, p2, Lc/a/a/a/u0;->l:Ljava/lang/String;

    invoke-static {v0}, Lc/a/a/a/m2/w;->o(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 2
    invoke-static {v1}, Lc/a/a/a/q1;->a(I)I

    move-result p1

    return p1

    .line 3
    :cond_0
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v2, 0x15

    if-lt v0, v2, :cond_1

    const/16 v0, 0x20

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 4
    :goto_0
    iget-object v2, p2, Lc/a/a/a/u0;->G:Ljava/lang/Class;

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    .line 5
    :goto_1
    invoke-static {p2}, Lc/a/a/a/g2/t;->k1(Lc/a/a/a/u0;)Z

    move-result v4

    const/16 v5, 0x8

    const/4 v6, 0x4

    if-eqz v4, :cond_4

    .line 6
    iget-object v7, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    .line 7
    invoke-interface {v7, p2}, Lc/a/a/a/b2/s;->a(Lc/a/a/a/u0;)Z

    move-result v7

    if-eqz v7, :cond_4

    if-eqz v2, :cond_3

    .line 8
    invoke-static {}, Lc/a/a/a/g2/v;->q()Lc/a/a/a/g2/s;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 9
    :cond_3
    invoke-static {v6, v5, v0}, Lc/a/a/a/q1;->b(III)I

    move-result p1

    return p1

    .line 10
    :cond_4
    iget-object v2, p2, Lc/a/a/a/u0;->l:Ljava/lang/String;

    const-string v7, "audio/raw"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-interface {v2, p2}, Lc/a/a/a/b2/s;->a(Lc/a/a/a/u0;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 11
    invoke-static {v3}, Lc/a/a/a/q1;->a(I)I

    move-result p1

    return p1

    .line 12
    :cond_5
    iget-object v2, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    iget v7, p2, Lc/a/a/a/u0;->y:I

    iget v8, p2, Lc/a/a/a/u0;->z:I

    const/4 v9, 0x2

    .line 13
    invoke-static {v9, v7, v8}, Lc/a/a/a/m2/m0;->W(III)Lc/a/a/a/u0;

    move-result-object v7

    .line 14
    invoke-interface {v2, v7}, Lc/a/a/a/b2/s;->a(Lc/a/a/a/u0;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 15
    invoke-static {v3}, Lc/a/a/a/q1;->a(I)I

    move-result p1

    return p1

    .line 16
    :cond_6
    invoke-virtual {p0, p1, p2, v1}, Lc/a/a/a/b2/b0;->v0(Lc/a/a/a/g2/u;Lc/a/a/a/u0;Z)Ljava/util/List;

    move-result-object p1

    .line 17
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 18
    invoke-static {v3}, Lc/a/a/a/q1;->a(I)I

    move-result p1

    return p1

    :cond_7
    if-nez v4, :cond_8

    .line 19
    invoke-static {v9}, Lc/a/a/a/q1;->a(I)I

    move-result p1

    return p1

    .line 20
    :cond_8
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/g2/s;

    .line 21
    invoke-virtual {p1, p2}, Lc/a/a/a/g2/s;->m(Lc/a/a/a/u0;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 22
    invoke-virtual {p1, p2}, Lc/a/a/a/g2/s;->o(Lc/a/a/a/u0;)Z

    move-result p1

    if-eqz p1, :cond_9

    const/16 v5, 0x10

    :cond_9
    if-eqz v1, :cond_a

    goto :goto_2

    :cond_a
    const/4 v6, 0x3

    .line 23
    :goto_2
    invoke-static {v6, v5, v0}, Lc/a/a/a/q1;->b(III)I

    move-result p1

    return p1
.end method

.method public m(ILjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    .line 1
    invoke-super {p0, p1, p2}, Lc/a/a/a/h0;->m(ILjava/lang/Object;)V

    goto :goto_0

    .line 2
    :pswitch_0
    check-cast p2, Lc/a/a/a/p1$a;

    iput-object p2, p0, Lc/a/a/a/b2/b0;->V0:Lc/a/a/a/p1$a;

    goto :goto_0

    .line 3
    :pswitch_1
    iget-object p1, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, p2}, Lc/a/a/a/b2/s;->j(I)V

    goto :goto_0

    .line 4
    :pswitch_2
    iget-object p1, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {p1, p2}, Lc/a/a/a/b2/s;->t(Z)V

    goto :goto_0

    .line 5
    :cond_0
    check-cast p2, Lc/a/a/a/b2/v;

    .line 6
    iget-object p1, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-interface {p1, p2}, Lc/a/a/a/b2/s;->u(Lc/a/a/a/b2/v;)V

    goto :goto_0

    .line 7
    :cond_1
    check-cast p2, Lc/a/a/a/b2/n;

    .line 8
    iget-object p1, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-interface {p1, p2}, Lc/a/a/a/b2/s;->p(Lc/a/a/a/b2/n;)V

    goto :goto_0

    .line 9
    :cond_2
    iget-object p1, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-interface {p1, p2}, Lc/a/a/a/b2/s;->w(F)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x65
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected t0(FLc/a/a/a/u0;[Lc/a/a/a/u0;)F
    .locals 4

    .line 1
    array-length p2, p3

    const/4 v0, -0x1

    const/4 v1, 0x0

    const/4 v2, -0x1

    :goto_0
    if-ge v1, p2, :cond_1

    aget-object v3, p3, v1

    .line 2
    iget v3, v3, Lc/a/a/a/u0;->z:I

    if-eq v3, v0, :cond_0

    .line 3
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-ne v2, v0, :cond_2

    const/high16 p1, -0x40800000    # -1.0f

    goto :goto_1

    :cond_2
    int-to-float p2, v2

    mul-float p1, p1, p2

    :goto_1
    return p1
.end method

.method protected t1(Lc/a/a/a/g2/s;Lc/a/a/a/u0;[Lc/a/a/a/u0;)I
    .locals 5

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/b2/b0;->s1(Lc/a/a/a/g2/s;Lc/a/a/a/u0;)I

    move-result v0

    .line 2
    array-length v1, p3

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    return v0

    .line 3
    :cond_0
    array-length v1, p3

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p3, v2

    .line 4
    invoke-virtual {p1, p2, v3}, Lc/a/a/a/g2/s;->e(Lc/a/a/a/u0;Lc/a/a/a/u0;)Lc/a/a/a/c2/g;

    move-result-object v4

    iget v4, v4, Lc/a/a/a/c2/g;->d:I

    if-eqz v4, :cond_1

    .line 5
    invoke-direct {p0, p1, v3}, Lc/a/a/a/b2/b0;->s1(Lc/a/a/a/g2/s;Lc/a/a/a/u0;)I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public u()Lc/a/a/a/m2/v;
    .locals 0

    return-object p0
.end method

.method protected u1(Lc/a/a/a/u0;Ljava/lang/String;IF)Landroid/media/MediaFormat;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/media/MediaFormat;

    invoke-direct {v0}, Landroid/media/MediaFormat;-><init>()V

    const-string v1, "mime"

    .line 2
    invoke-virtual {v0, v1, p2}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget p2, p1, Lc/a/a/a/u0;->y:I

    const-string v1, "channel-count"

    invoke-virtual {v0, v1, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 4
    iget p2, p1, Lc/a/a/a/u0;->z:I

    const-string v1, "sample-rate"

    invoke-virtual {v0, v1, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 5
    iget-object p2, p1, Lc/a/a/a/u0;->n:Ljava/util/List;

    invoke-static {v0, p2}, Lc/a/a/a/g2/w;->e(Landroid/media/MediaFormat;Ljava/util/List;)V

    const-string p2, "max-input-size"

    .line 6
    invoke-static {v0, p2, p3}, Lc/a/a/a/g2/w;->d(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 7
    sget p2, Lc/a/a/a/m2/m0;->a:I

    const/16 p3, 0x17

    if-lt p2, p3, :cond_0

    const/4 p3, 0x0

    const-string v1, "priority"

    .line 8
    invoke-virtual {v0, v1, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const/high16 p3, -0x40800000    # -1.0f

    cmpl-float p3, p4, p3

    if-eqz p3, :cond_0

    .line 9
    invoke-static {}, Lc/a/a/a/b2/b0;->r1()Z

    move-result p3

    if-nez p3, :cond_0

    const-string p3, "operating-rate"

    .line 10
    invoke-virtual {v0, p3, p4}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    :cond_0
    const/16 p3, 0x1c

    if-gt p2, p3, :cond_1

    .line 11
    iget-object p3, p1, Lc/a/a/a/u0;->l:Ljava/lang/String;

    const-string p4, "audio/ac4"

    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 p3, 0x1

    const-string p4, "ac4-is-sync"

    .line 12
    invoke-virtual {v0, p4, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_1
    const/16 p3, 0x18

    if-lt p2, p3, :cond_2

    .line 13
    iget-object p2, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    iget p3, p1, Lc/a/a/a/u0;->y:I

    iget p1, p1, Lc/a/a/a/u0;->z:I

    const/4 p4, 0x4

    .line 14
    invoke-static {p4, p3, p1}, Lc/a/a/a/m2/m0;->W(III)Lc/a/a/a/u0;

    move-result-object p1

    .line 15
    invoke-interface {p2, p1}, Lc/a/a/a/b2/s;->q(Lc/a/a/a/u0;)I

    move-result p1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_2

    const-string p1, "pcm-encoding"

    .line 16
    invoke-virtual {v0, p1, p4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_2
    return-object v0
.end method

.method protected v0(Lc/a/a/a/g2/u;Lc/a/a/a/u0;Z)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/g2/u;",
            "Lc/a/a/a/u0;",
            "Z)",
            "Ljava/util/List<",
            "Lc/a/a/a/g2/s;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g2/v$c;
        }
    .end annotation

    .line 1
    iget-object v0, p2, Lc/a/a/a/u0;->l:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    iget-object v1, p0, Lc/a/a/a/b2/b0;->M0:Lc/a/a/a/b2/s;

    invoke-interface {v1, p2}, Lc/a/a/a/b2/s;->a(Lc/a/a/a/u0;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    invoke-static {}, Lc/a/a/a/g2/v;->q()Lc/a/a/a/g2/s;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 5
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v1, 0x0

    .line 6
    invoke-interface {p1, v0, p3, v1}, Lc/a/a/a/g2/u;->a(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v2

    .line 7
    invoke-static {v2, p2}, Lc/a/a/a/g2/v;->p(Ljava/util/List;Lc/a/a/a/u0;)Ljava/util/List;

    move-result-object p2

    const-string v2, "audio/eac3-joc"

    .line 8
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string p2, "audio/eac3"

    .line 10
    invoke-interface {p1, p2, p3, v1}, Lc/a/a/a/g2/u;->a(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p1

    .line 11
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move-object p2, v0

    .line 12
    :cond_2
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected v1()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/b2/b0;->S0:Z

    return-void
.end method

.method public w()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/h0;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 2
    invoke-direct {p0}, Lc/a/a/a/b2/b0;->w1()V

    .line 3
    :cond_0
    iget-wide v0, p0, Lc/a/a/a/b2/b0;->Q0:J

    return-wide v0
.end method
