.class public abstract Lc/a/a/a/g2/t;
.super Lc/a/a/a/h0;
.source "MediaCodecRenderer.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/g2/t$a;
    }
.end annotation


# static fields
.field private static final m:[B


# instance fields
.field private final A:[J

.field private A0:Z

.field private B:Lc/a/a/a/u0;

.field private B0:Z

.field private C:Lc/a/a/a/u0;

.field private C0:Z

.field private D:Lc/a/a/a/e2/v;

.field private D0:Z

.field private E0:Z

.field private F0:Lc/a/a/a/p0;

.field private G:Lc/a/a/a/e2/v;

.field protected G0:Lc/a/a/a/c2/d;

.field private H:Landroid/media/MediaCrypto;

.field private H0:J

.field private I:Z

.field private I0:J

.field private J:J

.field private J0:I

.field private K:F

.field private L:F

.field private M:Lc/a/a/a/g2/q;

.field private N:Lc/a/a/a/u0;

.field private O:Landroid/media/MediaFormat;

.field private P:Z

.field private Q:F

.field private R:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lc/a/a/a/g2/s;",
            ">;"
        }
    .end annotation
.end field

.field private S:Lc/a/a/a/g2/t$a;

.field private T:Lc/a/a/a/g2/s;

.field private U:I

.field private V:Z

.field private W:Z

.field private X:Z

.field private Y:Z

.field private Z:Z

.field private a0:Z

.field private b0:Z

.field private c0:Z

.field private d0:Z

.field private e0:Z

.field private f0:Lc/a/a/a/g2/p;

.field private g0:J

.field private h0:I

.field private i0:I

.field private j0:Ljava/nio/ByteBuffer;

.field private k0:Z

.field private l0:Z

.field private m0:Z

.field private final n:Lc/a/a/a/g2/q$a;

.field private n0:Z

.field private final o:Lc/a/a/a/g2/u;

.field private o0:Z

.field private final p:Z

.field private p0:Z

.field private final q:F

.field private q0:I

.field private final r:Lc/a/a/a/c2/f;

.field private r0:I

.field private final s:Lc/a/a/a/c2/f;

.field private s0:I

.field private final t:Lc/a/a/a/c2/f;

.field private t0:Z

.field private final u:Lc/a/a/a/g2/o;

.field private u0:Z

.field private final v:Lc/a/a/a/m2/i0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/a/a/m2/i0<",
            "Lc/a/a/a/u0;",
            ">;"
        }
    .end annotation
.end field

.field private v0:Z

.field private final w:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private w0:J

.field private final x:Landroid/media/MediaCodec$BufferInfo;

.field private x0:J

.field private final y:[J

.field private y0:Z

.field private final z:[J

.field private z0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x26

    new-array v0, v0, [B

    .line 1
    fill-array-data v0, :array_0

    sput-object v0, Lc/a/a/a/g2/t;->m:[B

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x67t
        0x42t
        -0x40t
        0xbt
        -0x26t
        0x25t
        -0x70t
        0x0t
        0x0t
        0x1t
        0x68t
        -0x32t
        0xft
        0x13t
        0x20t
        0x0t
        0x0t
        0x1t
        0x65t
        -0x78t
        -0x7ct
        0xdt
        -0x32t
        0x71t
        0x18t
        -0x60t
        0x0t
        0x2ft
        -0x41t
        0x1ct
        0x31t
        -0x3dt
        0x27t
        0x5dt
        0x78t
    .end array-data
.end method

.method public constructor <init>(ILc/a/a/a/g2/q$a;Lc/a/a/a/g2/u;ZF)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lc/a/a/a/h0;-><init>(I)V

    .line 2
    iput-object p2, p0, Lc/a/a/a/g2/t;->n:Lc/a/a/a/g2/q$a;

    .line 3
    invoke-static {p3}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/g2/u;

    iput-object p1, p0, Lc/a/a/a/g2/t;->o:Lc/a/a/a/g2/u;

    .line 4
    iput-boolean p4, p0, Lc/a/a/a/g2/t;->p:Z

    .line 5
    iput p5, p0, Lc/a/a/a/g2/t;->q:F

    .line 6
    invoke-static {}, Lc/a/a/a/c2/f;->s()Lc/a/a/a/c2/f;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/g2/t;->r:Lc/a/a/a/c2/f;

    .line 7
    new-instance p1, Lc/a/a/a/c2/f;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lc/a/a/a/c2/f;-><init>(I)V

    iput-object p1, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    .line 8
    new-instance p1, Lc/a/a/a/c2/f;

    const/4 p3, 0x2

    invoke-direct {p1, p3}, Lc/a/a/a/c2/f;-><init>(I)V

    iput-object p1, p0, Lc/a/a/a/g2/t;->t:Lc/a/a/a/c2/f;

    .line 9
    new-instance p1, Lc/a/a/a/g2/o;

    invoke-direct {p1}, Lc/a/a/a/g2/o;-><init>()V

    iput-object p1, p0, Lc/a/a/a/g2/t;->u:Lc/a/a/a/g2/o;

    .line 10
    new-instance p3, Lc/a/a/a/m2/i0;

    invoke-direct {p3}, Lc/a/a/a/m2/i0;-><init>()V

    iput-object p3, p0, Lc/a/a/a/g2/t;->v:Lc/a/a/a/m2/i0;

    .line 11
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lc/a/a/a/g2/t;->w:Ljava/util/ArrayList;

    .line 12
    new-instance p3, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {p3}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iput-object p3, p0, Lc/a/a/a/g2/t;->x:Landroid/media/MediaCodec$BufferInfo;

    const/high16 p3, 0x3f800000    # 1.0f

    .line 13
    iput p3, p0, Lc/a/a/a/g2/t;->K:F

    .line 14
    iput p3, p0, Lc/a/a/a/g2/t;->L:F

    const-wide p3, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    iput-wide p3, p0, Lc/a/a/a/g2/t;->J:J

    const/16 p5, 0xa

    new-array v0, p5, [J

    .line 16
    iput-object v0, p0, Lc/a/a/a/g2/t;->y:[J

    new-array v0, p5, [J

    .line 17
    iput-object v0, p0, Lc/a/a/a/g2/t;->z:[J

    new-array p5, p5, [J

    .line 18
    iput-object p5, p0, Lc/a/a/a/g2/t;->A:[J

    .line 19
    iput-wide p3, p0, Lc/a/a/a/g2/t;->H0:J

    .line 20
    iput-wide p3, p0, Lc/a/a/a/g2/t;->I0:J

    .line 21
    invoke-virtual {p1, p2}, Lc/a/a/a/c2/f;->o(I)V

    .line 22
    iget-object p1, p1, Lc/a/a/a/c2/f;->c:Ljava/nio/ByteBuffer;

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 23
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->Z0()V

    return-void
.end method

.method private A0()Z
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/g2/t;->i0:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private B0(Lc/a/a/a/u0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/g2/t;->c0()V

    .line 2
    iget-object p1, p1, Lc/a/a/a/u0;->l:Ljava/lang/String;

    const-string v0, "audio/mp4a-latm"

    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    const-string v0, "audio/mpeg"

    .line 4
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "audio/opus"

    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 6
    iget-object p1, p0, Lc/a/a/a/g2/t;->u:Lc/a/a/a/g2/o;

    invoke-virtual {p1, v1}, Lc/a/a/a/g2/o;->A(I)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object p1, p0, Lc/a/a/a/g2/t;->u:Lc/a/a/a/g2/o;

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Lc/a/a/a/g2/o;->A(I)V

    .line 8
    :goto_0
    iput-boolean v1, p0, Lc/a/a/a/g2/t;->m0:Z

    return-void
.end method

.method private C0(Lc/a/a/a/g2/s;Landroid/media/MediaCrypto;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v7, p1, Lc/a/a/a/g2/s;->a:Ljava/lang/String;

    .line 2
    sget v1, Lc/a/a/a/m2/m0;->a:I

    const/high16 v2, -0x40800000    # -1.0f

    const/16 v3, 0x17

    if-ge v1, v3, :cond_0

    const/high16 v4, -0x40800000    # -1.0f

    goto :goto_0

    .line 3
    :cond_0
    iget v4, p0, Lc/a/a/a/g2/t;->L:F

    iget-object v5, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    invoke-virtual {p0}, Lc/a/a/a/h0;->D()[Lc/a/a/a/u0;

    move-result-object v6

    invoke-virtual {p0, v4, v5, v6}, Lc/a/a/a/g2/t;->t0(FLc/a/a/a/u0;[Lc/a/a/a/u0;)F

    move-result v4

    .line 4
    :goto_0
    iget v5, p0, Lc/a/a/a/g2/t;->q:F

    cmpg-float v5, v4, v5

    if-gtz v5, :cond_1

    const/high16 v8, -0x40800000    # -1.0f

    goto :goto_1

    :cond_1
    move v8, v4

    :goto_1
    const/4 v2, 0x0

    .line 5
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v9

    .line 6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "createCodec:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lc/a/a/a/m2/k0;->a(Ljava/lang/String;)V

    .line 7
    invoke-static {v7}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v4

    .line 8
    iget-boolean v5, p0, Lc/a/a/a/g2/t;->C0:Z

    if-eqz v5, :cond_2

    if-lt v1, v3, :cond_2

    .line 9
    new-instance v1, Lc/a/a/a/g2/l$b;

    .line 10
    invoke-virtual {p0}, Lc/a/a/a/h0;->g()I

    move-result v3

    iget-boolean v5, p0, Lc/a/a/a/g2/t;->D0:Z

    iget-boolean v6, p0, Lc/a/a/a/g2/t;->E0:Z

    invoke-direct {v1, v3, v5, v6}, Lc/a/a/a/g2/l$b;-><init>(IZZ)V

    .line 11
    invoke-virtual {v1, v4}, Lc/a/a/a/g2/l$b;->b(Landroid/media/MediaCodec;)Lc/a/a/a/g2/l;

    move-result-object v1

    goto :goto_2

    .line 12
    :cond_2
    iget-object v1, p0, Lc/a/a/a/g2/t;->n:Lc/a/a/a/g2/q$a;

    invoke-interface {v1, v4}, Lc/a/a/a/g2/q$a;->a(Landroid/media/MediaCodec;)Lc/a/a/a/g2/q;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :goto_2
    move-object v11, v1

    .line 13
    :try_start_1
    invoke-static {}, Lc/a/a/a/m2/k0;->c()V

    const-string v1, "configureCodec"

    .line 14
    invoke-static {v1}, Lc/a/a/a/m2/k0;->a(Ljava/lang/String;)V

    .line 15
    iget-object v4, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    move-object v1, p0

    move-object v2, p1

    move-object v3, v11

    move-object v5, p2

    move v6, v8

    invoke-virtual/range {v1 .. v6}, Lc/a/a/a/g2/t;->a0(Lc/a/a/a/g2/s;Lc/a/a/a/g2/q;Lc/a/a/a/u0;Landroid/media/MediaCrypto;F)V

    .line 16
    invoke-static {}, Lc/a/a/a/m2/k0;->c()V

    const-string v1, "startCodec"

    .line 17
    invoke-static {v1}, Lc/a/a/a/m2/k0;->a(Ljava/lang/String;)V

    .line 18
    invoke-interface {v11}, Lc/a/a/a/g2/q;->start()V

    .line 19
    invoke-static {}, Lc/a/a/a/m2/k0;->c()V

    .line 20
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 21
    iput-object v11, p0, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    .line 22
    iput-object p1, p0, Lc/a/a/a/g2/t;->T:Lc/a/a/a/g2/s;

    .line 23
    iput v8, p0, Lc/a/a/a/g2/t;->Q:F

    .line 24
    iget-object v1, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    iput-object v1, p0, Lc/a/a/a/g2/t;->N:Lc/a/a/a/u0;

    .line 25
    invoke-direct {p0, v7}, Lc/a/a/a/g2/t;->R(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lc/a/a/a/g2/t;->U:I

    .line 26
    iget-object v1, p0, Lc/a/a/a/g2/t;->N:Lc/a/a/a/u0;

    .line 27
    invoke-static {v7, v1}, Lc/a/a/a/g2/t;->S(Ljava/lang/String;Lc/a/a/a/u0;)Z

    move-result v1

    iput-boolean v1, p0, Lc/a/a/a/g2/t;->V:Z

    .line 28
    invoke-static {v7}, Lc/a/a/a/g2/t;->X(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lc/a/a/a/g2/t;->W:Z

    .line 29
    invoke-static {v7}, Lc/a/a/a/g2/t;->Z(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lc/a/a/a/g2/t;->X:Z

    .line 30
    invoke-static {v7}, Lc/a/a/a/g2/t;->U(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lc/a/a/a/g2/t;->Y:Z

    .line 31
    invoke-static {v7}, Lc/a/a/a/g2/t;->V(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lc/a/a/a/g2/t;->Z:Z

    .line 32
    invoke-static {v7}, Lc/a/a/a/g2/t;->T(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lc/a/a/a/g2/t;->a0:Z

    .line 33
    iget-object v1, p0, Lc/a/a/a/g2/t;->N:Lc/a/a/a/u0;

    .line 34
    invoke-static {v7, v1}, Lc/a/a/a/g2/t;->Y(Ljava/lang/String;Lc/a/a/a/u0;)Z

    move-result v1

    iput-boolean v1, p0, Lc/a/a/a/g2/t;->b0:Z

    .line 35
    invoke-static {p1}, Lc/a/a/a/g2/t;->W(Lc/a/a/a/g2/s;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_4

    invoke-virtual {p0}, Lc/a/a/a/g2/t;->s0()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    goto :goto_4

    :cond_4
    :goto_3
    const/4 v1, 0x1

    :goto_4
    iput-boolean v1, p0, Lc/a/a/a/g2/t;->e0:Z

    .line 36
    iget-object v0, p1, Lc/a/a/a/g2/s;->a:Ljava/lang/String;

    const-string v1, "c2.android.mp3.decoder"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 37
    new-instance v0, Lc/a/a/a/g2/p;

    invoke-direct {v0}, Lc/a/a/a/g2/p;-><init>()V

    iput-object v0, p0, Lc/a/a/a/g2/t;->f0:Lc/a/a/a/g2/p;

    .line 38
    :cond_5
    invoke-virtual {p0}, Lc/a/a/a/h0;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    .line 39
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const-wide/16 v5, 0x3e8

    add-long/2addr v0, v5

    iput-wide v0, p0, Lc/a/a/a/g2/t;->g0:J

    .line 40
    :cond_6
    iget-object v0, p0, Lc/a/a/a/g2/t;->G0:Lc/a/a/a/c2/d;

    iget v1, v0, Lc/a/a/a/c2/d;->a:I

    add-int/2addr v1, v2

    iput v1, v0, Lc/a/a/a/c2/d;->a:I

    sub-long v5, v3, v9

    move-object v1, p0

    move-object v2, v7

    .line 41
    invoke-virtual/range {v1 .. v6}, Lc/a/a/a/g2/t;->K0(Ljava/lang/String;JJ)V

    return-void

    :catch_0
    move-exception v0

    move-object v2, v11

    goto :goto_5

    :catch_1
    move-exception v0

    :goto_5
    if-eqz v2, :cond_7

    .line 42
    invoke-interface {v2}, Lc/a/a/a/g2/q;->a()V

    .line 43
    :cond_7
    throw v0
.end method

.method private D0(J)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/t;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 2
    iget-object v3, p0, Lc/a/a/a/g2/t;->w:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long v5, v3, p1

    if-nez v5, :cond_0

    .line 3
    iget-object p1, p0, Lc/a/a/a/g2/t;->w:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private static E0(Ljava/lang/IllegalStateException;)Z
    .locals 3

    .line 1
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/4 v1, 0x1

    const/16 v2, 0x15

    if-lt v0, v2, :cond_0

    invoke-static {p0}, Lc/a/a/a/g2/t;->F0(Ljava/lang/IllegalStateException;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {p0}, Ljava/lang/IllegalStateException;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p0

    .line 3
    array-length v0, p0

    const/4 v2, 0x0

    if-lez v0, :cond_1

    aget-object p0, p0, v2

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "android.media.MediaCodec"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private static F0(Ljava/lang/IllegalStateException;)Z
    .locals 0

    .line 1
    instance-of p0, p0, Landroid/media/MediaCodec$CodecException;

    return p0
.end method

.method private I0(Landroid/media/MediaCrypto;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g2/t$a;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/t;->R:Ljava/util/ArrayDeque;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    .line 2
    :try_start_0
    invoke-direct {p0, p2}, Lc/a/a/a/g2/t;->p0(Z)Ljava/util/List;

    move-result-object v0

    .line 3
    new-instance v2, Ljava/util/ArrayDeque;

    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v2, p0, Lc/a/a/a/g2/t;->R:Ljava/util/ArrayDeque;

    .line 4
    iget-boolean v3, p0, Lc/a/a/a/g2/t;->p:Z

    if-eqz v3, :cond_0

    .line 5
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 6
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 7
    iget-object v2, p0, Lc/a/a/a/g2/t;->R:Ljava/util/ArrayDeque;

    const/4 v3, 0x0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/g2/s;

    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 8
    :cond_1
    :goto_0
    iput-object v1, p0, Lc/a/a/a/g2/t;->S:Lc/a/a/a/g2/t$a;
    :try_end_0
    .catch Lc/a/a/a/g2/v$c; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 9
    new-instance v0, Lc/a/a/a/g2/t$a;

    iget-object v1, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    const v2, -0xc34e

    invoke-direct {v0, v1, p1, p2, v2}, Lc/a/a/a/g2/t$a;-><init>(Lc/a/a/a/u0;Ljava/lang/Throwable;ZI)V

    throw v0

    .line 10
    :cond_2
    :goto_1
    iget-object v0, p0, Lc/a/a/a/g2/t;->R:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 11
    :goto_2
    iget-object v0, p0, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    if-nez v0, :cond_6

    .line 12
    iget-object v0, p0, Lc/a/a/a/g2/t;->R:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/g2/s;

    .line 13
    invoke-virtual {p0, v0}, Lc/a/a/a/g2/t;->h1(Lc/a/a/a/g2/s;)Z

    move-result v2

    if-nez v2, :cond_3

    return-void

    .line 14
    :cond_3
    :try_start_1
    invoke-direct {p0, v0, p1}, Lc/a/a/a/g2/t;->C0(Lc/a/a/a/g2/s;Landroid/media/MediaCrypto;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v2

    .line 15
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to initialize decoder: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "MediaCodecRenderer"

    invoke-static {v4, v3, v2}, Lc/a/a/a/m2/t;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    iget-object v3, p0, Lc/a/a/a/g2/t;->R:Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 17
    new-instance v3, Lc/a/a/a/g2/t$a;

    iget-object v4, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    invoke-direct {v3, v4, v2, p2, v0}, Lc/a/a/a/g2/t$a;-><init>(Lc/a/a/a/u0;Ljava/lang/Throwable;ZLc/a/a/a/g2/s;)V

    .line 18
    iget-object v0, p0, Lc/a/a/a/g2/t;->S:Lc/a/a/a/g2/t$a;

    if-nez v0, :cond_4

    .line 19
    iput-object v3, p0, Lc/a/a/a/g2/t;->S:Lc/a/a/a/g2/t$a;

    goto :goto_3

    .line 20
    :cond_4
    iget-object v0, p0, Lc/a/a/a/g2/t;->S:Lc/a/a/a/g2/t$a;

    .line 21
    invoke-static {v0, v3}, Lc/a/a/a/g2/t$a;->a(Lc/a/a/a/g2/t$a;Lc/a/a/a/g2/t$a;)Lc/a/a/a/g2/t$a;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/g2/t;->S:Lc/a/a/a/g2/t$a;

    .line 22
    :goto_3
    iget-object v0, p0, Lc/a/a/a/g2/t;->R:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_2

    .line 23
    :cond_5
    iget-object p1, p0, Lc/a/a/a/g2/t;->S:Lc/a/a/a/g2/t$a;

    throw p1

    .line 24
    :cond_6
    iput-object v1, p0, Lc/a/a/a/g2/t;->R:Ljava/util/ArrayDeque;

    return-void

    .line 25
    :cond_7
    new-instance p1, Lc/a/a/a/g2/t$a;

    iget-object v0, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    const v2, -0xc34f

    invoke-direct {p1, v0, v1, p2, v2}, Lc/a/a/a/g2/t$a;-><init>(Lc/a/a/a/u0;Ljava/lang/Throwable;ZI)V

    goto :goto_5

    :goto_4
    throw p1

    :goto_5
    goto :goto_4
.end method

.method private J0(Lc/a/a/a/e2/e0;Lc/a/a/a/u0;)Z
    .locals 2

    .line 1
    iget-boolean v0, p1, Lc/a/a/a/e2/e0;->d:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    :try_start_0
    new-instance v0, Landroid/media/MediaCrypto;

    iget-object v1, p1, Lc/a/a/a/e2/e0;->b:Ljava/util/UUID;

    iget-object p1, p1, Lc/a/a/a/e2/e0;->c:[B

    invoke-direct {v0, v1, p1}, Landroid/media/MediaCrypto;-><init>(Ljava/util/UUID;[B)V
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    :try_start_1
    iget-object p1, p2, Lc/a/a/a/u0;->l:Ljava/lang/String;

    invoke-virtual {v0, p1}, Landroid/media/MediaCrypto;->requiresSecureDecoderComponent(Ljava/lang/String;)Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 4
    invoke-virtual {v0}, Landroid/media/MediaCrypto;->release()V

    return p1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/media/MediaCrypto;->release()V

    .line 5
    throw p1

    :catch_0
    const/4 p1, 0x1

    return p1
.end method

.method private O()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/g2/t;->y0:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/h0;->B()Lc/a/a/a/v0;

    move-result-object v0

    .line 3
    iget-object v2, p0, Lc/a/a/a/g2/t;->t:Lc/a/a/a/c2/f;

    invoke-virtual {v2}, Lc/a/a/a/c2/f;->f()V

    .line 4
    :cond_0
    iget-object v2, p0, Lc/a/a/a/g2/t;->t:Lc/a/a/a/c2/f;

    invoke-virtual {v2}, Lc/a/a/a/c2/f;->f()V

    .line 5
    iget-object v2, p0, Lc/a/a/a/g2/t;->t:Lc/a/a/a/c2/f;

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v2, v3}, Lc/a/a/a/h0;->M(Lc/a/a/a/v0;Lc/a/a/a/c2/f;Z)I

    move-result v2

    const/4 v4, -0x5

    if-eq v2, v4, :cond_5

    const/4 v4, -0x4

    if-eq v2, v4, :cond_2

    const/4 v0, -0x3

    if-ne v2, v0, :cond_1

    return-void

    .line 6
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 7
    :cond_2
    iget-object v2, p0, Lc/a/a/a/g2/t;->t:Lc/a/a/a/c2/f;

    invoke-virtual {v2}, Lc/a/a/a/c2/a;->k()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 8
    iput-boolean v1, p0, Lc/a/a/a/g2/t;->y0:Z

    return-void

    .line 9
    :cond_3
    iget-boolean v2, p0, Lc/a/a/a/g2/t;->A0:Z

    if-eqz v2, :cond_4

    .line 10
    iget-object v2, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    invoke-static {v2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/a/a/a/u0;

    iput-object v2, p0, Lc/a/a/a/g2/t;->C:Lc/a/a/a/u0;

    const/4 v4, 0x0

    .line 11
    invoke-virtual {p0, v2, v4}, Lc/a/a/a/g2/t;->N0(Lc/a/a/a/u0;Landroid/media/MediaFormat;)V

    .line 12
    iput-boolean v3, p0, Lc/a/a/a/g2/t;->A0:Z

    .line 13
    :cond_4
    iget-object v2, p0, Lc/a/a/a/g2/t;->t:Lc/a/a/a/c2/f;

    invoke-virtual {v2}, Lc/a/a/a/c2/f;->p()V

    .line 14
    iget-object v2, p0, Lc/a/a/a/g2/t;->u:Lc/a/a/a/g2/o;

    iget-object v3, p0, Lc/a/a/a/g2/t;->t:Lc/a/a/a/c2/f;

    invoke-virtual {v2, v3}, Lc/a/a/a/g2/o;->u(Lc/a/a/a/c2/f;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 15
    iput-boolean v1, p0, Lc/a/a/a/g2/t;->n0:Z

    return-void

    .line 16
    :cond_5
    invoke-virtual {p0, v0}, Lc/a/a/a/g2/t;->M0(Lc/a/a/a/v0;)Lc/a/a/a/c2/g;

    return-void
.end method

.method private P(JJ)Z
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    move-object/from16 v15, p0

    .line 1
    iget-boolean v0, v15, Lc/a/a/a/g2/t;->z0:Z

    const/4 v14, 0x1

    xor-int/2addr v0, v14

    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    iget-object v0, v15, Lc/a/a/a/g2/t;->u:Lc/a/a/a/g2/o;

    invoke-virtual {v0}, Lc/a/a/a/g2/o;->z()Z

    move-result v0

    const/4 v13, 0x0

    if-eqz v0, :cond_1

    const/4 v5, 0x0

    .line 3
    iget-object v0, v15, Lc/a/a/a/g2/t;->u:Lc/a/a/a/g2/o;

    iget-object v6, v0, Lc/a/a/a/c2/f;->c:Ljava/nio/ByteBuffer;

    iget v7, v15, Lc/a/a/a/g2/t;->i0:I

    const/4 v8, 0x0

    .line 4
    invoke-virtual {v0}, Lc/a/a/a/g2/o;->y()I

    move-result v9

    iget-object v0, v15, Lc/a/a/a/g2/t;->u:Lc/a/a/a/g2/o;

    .line 5
    invoke-virtual {v0}, Lc/a/a/a/g2/o;->w()J

    move-result-wide v10

    iget-object v0, v15, Lc/a/a/a/g2/t;->u:Lc/a/a/a/g2/o;

    .line 6
    invoke-virtual {v0}, Lc/a/a/a/c2/a;->j()Z

    move-result v12

    iget-object v0, v15, Lc/a/a/a/g2/t;->u:Lc/a/a/a/g2/o;

    .line 7
    invoke-virtual {v0}, Lc/a/a/a/c2/a;->k()Z

    move-result v16

    iget-object v3, v15, Lc/a/a/a/g2/t;->C:Lc/a/a/a/u0;

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v17, v3

    move-wide/from16 v3, p3

    move/from16 v13, v16

    move-object/from16 v14, v17

    .line 8
    invoke-virtual/range {v0 .. v14}, Lc/a/a/a/g2/t;->S0(JJLc/a/a/a/g2/q;Ljava/nio/ByteBuffer;IIIJZZLc/a/a/a/u0;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 9
    iget-object v0, v15, Lc/a/a/a/g2/t;->u:Lc/a/a/a/g2/o;

    invoke-virtual {v0}, Lc/a/a/a/g2/o;->x()J

    move-result-wide v0

    invoke-virtual {v15, v0, v1}, Lc/a/a/a/g2/t;->O0(J)V

    .line 10
    iget-object v0, v15, Lc/a/a/a/g2/t;->u:Lc/a/a/a/g2/o;

    invoke-virtual {v0}, Lc/a/a/a/g2/o;->f()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 11
    iget-boolean v1, v15, Lc/a/a/a/g2/t;->y0:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    .line 12
    iput-boolean v1, v15, Lc/a/a/a/g2/t;->z0:Z

    return v0

    :cond_2
    const/4 v1, 0x1

    .line 13
    iget-boolean v2, v15, Lc/a/a/a/g2/t;->n0:Z

    if-eqz v2, :cond_3

    .line 14
    iget-object v2, v15, Lc/a/a/a/g2/t;->u:Lc/a/a/a/g2/o;

    iget-object v3, v15, Lc/a/a/a/g2/t;->t:Lc/a/a/a/c2/f;

    invoke-virtual {v2, v3}, Lc/a/a/a/g2/o;->u(Lc/a/a/a/c2/f;)Z

    move-result v2

    invoke-static {v2}, Lc/a/a/a/m2/f;->f(Z)V

    .line 15
    iput-boolean v0, v15, Lc/a/a/a/g2/t;->n0:Z

    .line 16
    :cond_3
    iget-boolean v2, v15, Lc/a/a/a/g2/t;->o0:Z

    if-eqz v2, :cond_5

    .line 17
    iget-object v2, v15, Lc/a/a/a/g2/t;->u:Lc/a/a/a/g2/o;

    invoke-virtual {v2}, Lc/a/a/a/g2/o;->z()Z

    move-result v2

    if-eqz v2, :cond_4

    return v1

    .line 18
    :cond_4
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/g2/t;->c0()V

    .line 19
    iput-boolean v0, v15, Lc/a/a/a/g2/t;->o0:Z

    .line 20
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/g2/t;->H0()V

    .line 21
    iget-boolean v2, v15, Lc/a/a/a/g2/t;->m0:Z

    if-nez v2, :cond_5

    return v0

    .line 22
    :cond_5
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/g2/t;->O()V

    .line 23
    iget-object v2, v15, Lc/a/a/a/g2/t;->u:Lc/a/a/a/g2/o;

    invoke-virtual {v2}, Lc/a/a/a/g2/o;->z()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 24
    iget-object v2, v15, Lc/a/a/a/g2/t;->u:Lc/a/a/a/g2/o;

    invoke-virtual {v2}, Lc/a/a/a/c2/f;->p()V

    .line 25
    :cond_6
    iget-object v2, v15, Lc/a/a/a/g2/t;->u:Lc/a/a/a/g2/o;

    invoke-virtual {v2}, Lc/a/a/a/g2/o;->z()Z

    move-result v2

    if-nez v2, :cond_8

    iget-boolean v2, v15, Lc/a/a/a/g2/t;->y0:Z

    if-nez v2, :cond_8

    iget-boolean v2, v15, Lc/a/a/a/g2/t;->o0:Z

    if-eqz v2, :cond_7

    goto :goto_1

    :cond_7
    const/4 v14, 0x0

    goto :goto_2

    :cond_8
    :goto_1
    const/4 v14, 0x1

    :goto_2
    return v14
.end method

.method private R(Ljava/lang/String;)I
    .locals 3

    .line 1
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v1, 0x19

    if-gt v0, v1, :cond_1

    const-string v1, "OMX.Exynos.avc.dec.secure"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lc/a/a/a/m2/m0;->d:Ljava/lang/String;

    const-string v2, "SM-T585"

    .line 2
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "SM-A510"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "SM-A520"

    .line 3
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "SM-J700"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 p1, 0x2

    return p1

    :cond_1
    const/16 v1, 0x18

    if-ge v0, v1, :cond_4

    const-string v0, "OMX.Nvidia.h264.decode"

    .line 4
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "OMX.Nvidia.h264.decode.secure"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_2
    sget-object p1, Lc/a/a/a/m2/m0;->b:Ljava/lang/String;

    const-string v0, "flounder"

    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "flounder_lte"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "grouper"

    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "tilapia"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method private R0()V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget v0, p0, Lc/a/a/a/g2/t;->s0:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    .line 2
    iput-boolean v1, p0, Lc/a/a/a/g2/t;->z0:Z

    .line 3
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->X0()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-direct {p0}, Lc/a/a/a/g2/t;->V0()V

    goto :goto_0

    .line 5
    :cond_1
    invoke-direct {p0}, Lc/a/a/a/g2/t;->m0()V

    .line 6
    invoke-direct {p0}, Lc/a/a/a/g2/t;->m1()V

    goto :goto_0

    .line 7
    :cond_2
    invoke-direct {p0}, Lc/a/a/a/g2/t;->m0()V

    :goto_0
    return-void
.end method

.method private static S(Ljava/lang/String;Lc/a/a/a/u0;)Z
    .locals 2

    .line 1
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    iget-object p1, p1, Lc/a/a/a/u0;->n:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "OMX.MTK.VIDEO.DECODER.AVC"

    .line 2
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static T(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_1

    const-string v0, "OMX.SEC.mp3.dec"

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

    const-string v0, "baffin"

    .line 4
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "grand"

    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "fortuna"

    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "gprimelte"

    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "j2y18lte"

    .line 8
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ms01"

    .line 9
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

.method private T0()V
    .locals 4

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->v0:Z

    .line 2
    iget-object v1, p0, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    invoke-interface {v1}, Lc/a/a/a/g2/q;->h()Landroid/media/MediaFormat;

    move-result-object v1

    .line 3
    iget v2, p0, Lc/a/a/a/g2/t;->U:I

    if-eqz v2, :cond_0

    const-string v2, "width"

    .line 4
    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x20

    if-ne v2, v3, :cond_0

    const-string v2, "height"

    .line 5
    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    if-ne v2, v3, :cond_0

    .line 6
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->d0:Z

    return-void

    .line 7
    :cond_0
    iget-boolean v2, p0, Lc/a/a/a/g2/t;->b0:Z

    if-eqz v2, :cond_1

    const-string v2, "channel-count"

    .line 8
    invoke-virtual {v1, v2, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 9
    :cond_1
    iput-object v1, p0, Lc/a/a/a/g2/t;->O:Landroid/media/MediaFormat;

    .line 10
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->P:Z

    return-void
.end method

.method private static U(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v1, 0x17

    if-gt v0, v1, :cond_0

    const-string v1, "OMX.google.vorbis.decoder"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    const/16 v1, 0x13

    if-gt v0, v1, :cond_3

    sget-object v0, Lc/a/a/a/m2/m0;->b:Ljava/lang/String;

    const-string v1, "hb2000"

    .line 2
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "stvm8"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    const-string v0, "OMX.amlogic.avc.decoder.awesome"

    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "OMX.amlogic.avc.decoder.awesome.secure"

    .line 4
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    :cond_2
    const/4 p0, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private U0(Z)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/h0;->B()Lc/a/a/a/v0;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lc/a/a/a/g2/t;->r:Lc/a/a/a/c2/f;

    invoke-virtual {v1}, Lc/a/a/a/c2/f;->f()V

    .line 3
    iget-object v1, p0, Lc/a/a/a/g2/t;->r:Lc/a/a/a/c2/f;

    invoke-virtual {p0, v0, v1, p1}, Lc/a/a/a/h0;->M(Lc/a/a/a/v0;Lc/a/a/a/c2/f;Z)I

    move-result p1

    const/4 v1, 0x1

    const/4 v2, -0x5

    if-ne p1, v2, :cond_0

    .line 4
    invoke-virtual {p0, v0}, Lc/a/a/a/g2/t;->M0(Lc/a/a/a/v0;)Lc/a/a/a/c2/g;

    return v1

    :cond_0
    const/4 v0, -0x4

    if-ne p1, v0, :cond_1

    .line 5
    iget-object p1, p0, Lc/a/a/a/g2/t;->r:Lc/a/a/a/c2/f;

    invoke-virtual {p1}, Lc/a/a/a/c2/a;->k()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 6
    iput-boolean v1, p0, Lc/a/a/a/g2/t;->y0:Z

    .line 7
    invoke-direct {p0}, Lc/a/a/a/g2/t;->R0()V

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private static V(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v1, 0x15

    if-ne v0, v1, :cond_0

    const-string v0, "OMX.google.aac.decoder"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private V0()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->W0()V

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->H0()V

    return-void
.end method

.method private static W(Lc/a/a/a/g2/s;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/s;->a:Ljava/lang/String;

    .line 2
    sget v1, Lc/a/a/a/m2/m0;->a:I

    const/16 v2, 0x19

    if-gt v1, v2, :cond_0

    const-string v2, "OMX.rk.video_decoder.avc"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_0
    const/16 v2, 0x11

    if-gt v1, v2, :cond_1

    const-string v2, "OMX.allwinner.video.decoder.avc"

    .line 3
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_1
    const/16 v2, 0x1d

    if-gt v1, v2, :cond_2

    const-string v1, "OMX.broadcom.video_decoder.tunnel"

    .line 4
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "OMX.broadcom.video_decoder.tunnel.secure"

    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    sget-object v0, Lc/a/a/a/m2/m0;->c:Ljava/lang/String;

    const-string v1, "Amazon"

    .line 6
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lc/a/a/a/m2/m0;->d:Ljava/lang/String;

    const-string v1, "AFTS"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-boolean p0, p0, Lc/a/a/a/g2/s;->g:Z

    if-eqz p0, :cond_4

    :cond_3
    const/4 p0, 0x1

    goto :goto_0

    :cond_4
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static X(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_2

    if-ne v0, v1, :cond_0

    const-string v1, "OMX.SEC.avc.dec"

    .line 2
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "OMX.SEC.avc.dec.secure"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    const/16 v1, 0x13

    if-ne v0, v1, :cond_1

    sget-object v0, Lc/a/a/a/m2/m0;->d:Ljava/lang/String;

    const-string v1, "SM-G800"

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "OMX.Exynos.avc.dec"

    .line 4
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "OMX.Exynos.avc.dec.secure"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static Y(Ljava/lang/String;Lc/a/a/a/u0;)Z
    .locals 3

    .line 1
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/4 v1, 0x1

    const/16 v2, 0x12

    if-gt v0, v2, :cond_0

    iget p1, p1, Lc/a/a/a/u0;->y:I

    if-ne p1, v1, :cond_0

    const-string p1, "OMX.MTK.AUDIO.DECODER.MP3"

    .line 2
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private static Z(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v1, 0x1d

    if-ne v0, v1, :cond_0

    const-string v0, "c2.android.aac.decoder"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private a1()V
    .locals 2

    const/4 v0, -0x1

    .line 1
    iput v0, p0, Lc/a/a/a/g2/t;->h0:I

    .line 2
    iget-object v0, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    const/4 v1, 0x0

    iput-object v1, v0, Lc/a/a/a/c2/f;->c:Ljava/nio/ByteBuffer;

    return-void
.end method

.method private b1()V
    .locals 1

    const/4 v0, -0x1

    .line 1
    iput v0, p0, Lc/a/a/a/g2/t;->i0:I

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lc/a/a/a/g2/t;->j0:Ljava/nio/ByteBuffer;

    return-void
.end method

.method private c0()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->o0:Z

    .line 2
    iget-object v1, p0, Lc/a/a/a/g2/t;->u:Lc/a/a/a/g2/o;

    invoke-virtual {v1}, Lc/a/a/a/g2/o;->f()V

    .line 3
    iget-object v1, p0, Lc/a/a/a/g2/t;->t:Lc/a/a/a/c2/f;

    invoke-virtual {v1}, Lc/a/a/a/c2/f;->f()V

    .line 4
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->n0:Z

    .line 5
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->m0:Z

    return-void
.end method

.method private c1(Lc/a/a/a/e2/v;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/t;->D:Lc/a/a/a/e2/v;

    invoke-static {v0, p1}, Lc/a/a/a/e2/u;->a(Lc/a/a/a/e2/v;Lc/a/a/a/e2/v;)V

    .line 2
    iput-object p1, p0, Lc/a/a/a/g2/t;->D:Lc/a/a/a/e2/v;

    return-void
.end method

.method private d0()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/g2/t;->t0:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    .line 2
    iput v1, p0, Lc/a/a/a/g2/t;->r0:I

    .line 3
    iget-boolean v0, p0, Lc/a/a/a/g2/t;->W:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lc/a/a/a/g2/t;->Y:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iput v1, p0, Lc/a/a/a/g2/t;->s0:I

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x3

    .line 5
    iput v0, p0, Lc/a/a/a/g2/t;->s0:I

    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_1
    return v1
.end method

.method private e0()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/g2/t;->t0:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lc/a/a/a/g2/t;->r0:I

    const/4 v0, 0x3

    .line 3
    iput v0, p0, Lc/a/a/a/g2/t;->s0:I

    goto :goto_0

    .line 4
    :cond_0
    invoke-direct {p0}, Lc/a/a/a/g2/t;->V0()V

    :goto_0
    return-void
.end method

.method private f0()Z
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/g2/t;->t0:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    .line 2
    iput v1, p0, Lc/a/a/a/g2/t;->r0:I

    .line 3
    iget-boolean v0, p0, Lc/a/a/a/g2/t;->W:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lc/a/a/a/g2/t;->Y:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    .line 4
    iput v0, p0, Lc/a/a/a/g2/t;->s0:I

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x3

    .line 5
    iput v0, p0, Lc/a/a/a/g2/t;->s0:I

    const/4 v0, 0x0

    return v0

    .line 6
    :cond_2
    invoke-direct {p0}, Lc/a/a/a/g2/t;->m1()V

    :goto_1
    return v1
.end method

.method private f1(Lc/a/a/a/e2/v;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/t;->G:Lc/a/a/a/e2/v;

    invoke-static {v0, p1}, Lc/a/a/a/e2/u;->a(Lc/a/a/a/e2/v;Lc/a/a/a/e2/v;)V

    .line 2
    iput-object p1, p0, Lc/a/a/a/g2/t;->G:Lc/a/a/a/e2/v;

    return-void
.end method

.method private g0(JJ)Z
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    move-object/from16 v15, p0

    .line 1
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/g2/t;->A0()Z

    move-result v0

    const/16 v16, 0x1

    const/4 v14, 0x0

    if-nez v0, :cond_b

    .line 2
    iget-boolean v0, v15, Lc/a/a/a/g2/t;->Z:Z

    if-eqz v0, :cond_1

    iget-boolean v0, v15, Lc/a/a/a/g2/t;->u0:Z

    if-eqz v0, :cond_1

    .line 3
    :try_start_0
    iget-object v0, v15, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    iget-object v1, v15, Lc/a/a/a/g2/t;->x:Landroid/media/MediaCodec$BufferInfo;

    invoke-interface {v0, v1}, Lc/a/a/a/g2/q;->b(Landroid/media/MediaCodec$BufferInfo;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 4
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/g2/t;->R0()V

    .line 5
    iget-boolean v0, v15, Lc/a/a/a/g2/t;->z0:Z

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/g2/t;->W0()V

    :cond_0
    return v14

    .line 7
    :cond_1
    iget-object v0, v15, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    iget-object v1, v15, Lc/a/a/a/g2/t;->x:Landroid/media/MediaCodec$BufferInfo;

    invoke-interface {v0, v1}, Lc/a/a/a/g2/q;->b(Landroid/media/MediaCodec$BufferInfo;)I

    move-result v0

    :goto_0
    if-gez v0, :cond_5

    const/4 v1, -0x2

    if-ne v0, v1, :cond_2

    .line 8
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/g2/t;->T0()V

    return v16

    .line 9
    :cond_2
    iget-boolean v0, v15, Lc/a/a/a/g2/t;->e0:Z

    if-eqz v0, :cond_4

    iget-boolean v0, v15, Lc/a/a/a/g2/t;->y0:Z

    if-nez v0, :cond_3

    iget v0, v15, Lc/a/a/a/g2/t;->r0:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 10
    :cond_3
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/g2/t;->R0()V

    :cond_4
    return v14

    .line 11
    :cond_5
    iget-boolean v1, v15, Lc/a/a/a/g2/t;->d0:Z

    if-eqz v1, :cond_6

    .line 12
    iput-boolean v14, v15, Lc/a/a/a/g2/t;->d0:Z

    .line 13
    iget-object v1, v15, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    invoke-interface {v1, v0, v14}, Lc/a/a/a/g2/q;->e(IZ)V

    return v16

    .line 14
    :cond_6
    iget-object v1, v15, Lc/a/a/a/g2/t;->x:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-nez v2, :cond_7

    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_7

    .line 15
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/g2/t;->R0()V

    return v14

    .line 16
    :cond_7
    iput v0, v15, Lc/a/a/a/g2/t;->i0:I

    .line 17
    iget-object v1, v15, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    invoke-interface {v1, v0}, Lc/a/a/a/g2/q;->m(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v15, Lc/a/a/a/g2/t;->j0:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_8

    .line 18
    iget-object v1, v15, Lc/a/a/a/g2/t;->x:Landroid/media/MediaCodec$BufferInfo;

    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 19
    iget-object v0, v15, Lc/a/a/a/g2/t;->j0:Ljava/nio/ByteBuffer;

    iget-object v1, v15, Lc/a/a/a/g2/t;->x:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    add-int/2addr v2, v1

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 20
    :cond_8
    iget-boolean v0, v15, Lc/a/a/a/g2/t;->a0:Z

    if-eqz v0, :cond_9

    iget-object v0, v15, Lc/a/a/a/g2/t;->x:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v1, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_9

    iget v1, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_9

    iget-wide v1, v15, Lc/a/a/a/g2/t;->w0:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_9

    .line 21
    iput-wide v1, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 22
    :cond_9
    iget-object v0, v15, Lc/a/a/a/g2/t;->x:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v0, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-direct {v15, v0, v1}, Lc/a/a/a/g2/t;->D0(J)Z

    move-result v0

    iput-boolean v0, v15, Lc/a/a/a/g2/t;->k0:Z

    .line 23
    iget-wide v0, v15, Lc/a/a/a/g2/t;->x0:J

    iget-object v2, v15, Lc/a/a/a/g2/t;->x:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v2, v2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_a

    const/4 v0, 0x1

    goto :goto_1

    :cond_a
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, v15, Lc/a/a/a/g2/t;->l0:Z

    .line 24
    invoke-virtual {v15, v2, v3}, Lc/a/a/a/g2/t;->n1(J)V

    .line 25
    :cond_b
    iget-boolean v0, v15, Lc/a/a/a/g2/t;->Z:Z

    if-eqz v0, :cond_d

    iget-boolean v0, v15, Lc/a/a/a/g2/t;->u0:Z

    if-eqz v0, :cond_d

    .line 26
    :try_start_1
    iget-object v5, v15, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    iget-object v6, v15, Lc/a/a/a/g2/t;->j0:Ljava/nio/ByteBuffer;

    iget v7, v15, Lc/a/a/a/g2/t;->i0:I

    iget-object v0, v15, Lc/a/a/a/g2/t;->x:Landroid/media/MediaCodec$BufferInfo;

    iget v8, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    const/4 v9, 0x1

    iget-wide v10, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-boolean v12, v15, Lc/a/a/a/g2/t;->k0:Z

    iget-boolean v13, v15, Lc/a/a/a/g2/t;->l0:Z

    iget-object v3, v15, Lc/a/a/a/g2/t;->C:Lc/a/a/a/u0;
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_2

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v17, v3

    move-wide/from16 v3, p3

    const/16 v18, 0x0

    move-object/from16 v14, v17

    .line 27
    :try_start_2
    invoke-virtual/range {v0 .. v14}, Lc/a/a/a/g2/t;->S0(JJLc/a/a/a/g2/q;Ljava/nio/ByteBuffer;IIIJZZLc/a/a/a/u0;)Z

    move-result v0
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_3

    :catch_1
    nop

    goto :goto_2

    :catch_2
    const/16 v18, 0x0

    .line 28
    :goto_2
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/g2/t;->R0()V

    .line 29
    iget-boolean v0, v15, Lc/a/a/a/g2/t;->z0:Z

    if-eqz v0, :cond_c

    .line 30
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/g2/t;->W0()V

    :cond_c
    return v18

    :cond_d
    const/16 v18, 0x0

    .line 31
    iget-object v5, v15, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    iget-object v6, v15, Lc/a/a/a/g2/t;->j0:Ljava/nio/ByteBuffer;

    iget v7, v15, Lc/a/a/a/g2/t;->i0:I

    iget-object v0, v15, Lc/a/a/a/g2/t;->x:Landroid/media/MediaCodec$BufferInfo;

    iget v8, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    const/4 v9, 0x1

    iget-wide v10, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-boolean v12, v15, Lc/a/a/a/g2/t;->k0:Z

    iget-boolean v13, v15, Lc/a/a/a/g2/t;->l0:Z

    iget-object v14, v15, Lc/a/a/a/g2/t;->C:Lc/a/a/a/u0;

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    .line 32
    invoke-virtual/range {v0 .. v14}, Lc/a/a/a/g2/t;->S0(JJLc/a/a/a/g2/q;Ljava/nio/ByteBuffer;IIIJZZLc/a/a/a/u0;)Z

    move-result v0

    :goto_3
    if-eqz v0, :cond_10

    .line 33
    iget-object v0, v15, Lc/a/a/a/g2/t;->x:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v0, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v15, v0, v1}, Lc/a/a/a/g2/t;->O0(J)V

    .line 34
    iget-object v0, v15, Lc/a/a/a/g2/t;->x:Landroid/media/MediaCodec$BufferInfo;

    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_e

    const/4 v14, 0x1

    goto :goto_4

    :cond_e
    const/4 v14, 0x0

    .line 35
    :goto_4
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/g2/t;->b1()V

    if-nez v14, :cond_f

    return v16

    .line 36
    :cond_f
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/g2/t;->R0()V

    :cond_10
    return v18
.end method

.method private g1(J)Z
    .locals 5

    .line 1
    iget-wide v0, p0, Lc/a/a/a/g2/t;->J:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sub-long/2addr v0, p1

    iget-wide p1, p0, Lc/a/a/a/g2/t;->J:J

    cmp-long v2, v0, p1

    if-gez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private h0(Lc/a/a/a/g2/s;Lc/a/a/a/u0;Lc/a/a/a/e2/v;Lc/a/a/a/e2/v;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    const/4 v0, 0x0

    if-ne p3, p4, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-eqz p4, :cond_6

    if-nez p3, :cond_1

    goto :goto_0

    .line 1
    :cond_1
    sget v2, Lc/a/a/a/m2/m0;->a:I

    const/16 v3, 0x17

    if-ge v2, v3, :cond_2

    return v1

    .line 2
    :cond_2
    sget-object v2, Lc/a/a/a/i0;->e:Ljava/util/UUID;

    invoke-interface {p3}, Lc/a/a/a/e2/v;->e()Ljava/util/UUID;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_6

    .line 3
    invoke-interface {p4}, Lc/a/a/a/e2/v;->e()Ljava/util/UUID;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    goto :goto_0

    .line 4
    :cond_3
    invoke-direct {p0, p4}, Lc/a/a/a/g2/t;->w0(Lc/a/a/a/e2/v;)Lc/a/a/a/e2/e0;

    move-result-object p3

    if-nez p3, :cond_4

    return v1

    .line 5
    :cond_4
    iget-boolean p1, p1, Lc/a/a/a/g2/s;->g:Z

    if-nez p1, :cond_5

    invoke-direct {p0, p3, p2}, Lc/a/a/a/g2/t;->J0(Lc/a/a/a/e2/e0;Lc/a/a/a/u0;)Z

    move-result p1

    if-eqz p1, :cond_5

    return v1

    :cond_5
    return v0

    :cond_6
    :goto_0
    return v1
.end method

.method protected static k1(Lc/a/a/a/u0;)Z
    .locals 1

    .line 1
    iget-object p0, p0, Lc/a/a/a/u0;->G:Ljava/lang/Class;

    if-eqz p0, :cond_1

    const-class v0, Lc/a/a/a/e2/e0;

    .line 2
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private l0()Z
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    const/4 v1, 0x0

    if-eqz v0, :cond_1b

    iget v2, p0, Lc/a/a/a/g2/t;->r0:I

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1b

    iget-boolean v2, p0, Lc/a/a/a/g2/t;->y0:Z

    if-eqz v2, :cond_0

    goto/16 :goto_5

    .line 2
    :cond_0
    iget v2, p0, Lc/a/a/a/g2/t;->h0:I

    if-gez v2, :cond_2

    .line 3
    invoke-interface {v0}, Lc/a/a/a/g2/q;->o()I

    move-result v0

    iput v0, p0, Lc/a/a/a/g2/t;->h0:I

    if-gez v0, :cond_1

    return v1

    .line 4
    :cond_1
    iget-object v2, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    iget-object v4, p0, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    invoke-interface {v4, v0}, Lc/a/a/a/g2/q;->i(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v2, Lc/a/a/a/c2/f;->c:Ljava/nio/ByteBuffer;

    .line 5
    iget-object v0, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    invoke-virtual {v0}, Lc/a/a/a/c2/f;->f()V

    .line 6
    :cond_2
    iget v0, p0, Lc/a/a/a/g2/t;->r0:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_4

    .line 7
    iget-boolean v0, p0, Lc/a/a/a/g2/t;->e0:Z

    if-eqz v0, :cond_3

    goto :goto_0

    .line 8
    :cond_3
    iput-boolean v2, p0, Lc/a/a/a/g2/t;->u0:Z

    .line 9
    iget-object v4, p0, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    iget v5, p0, Lc/a/a/a/g2/t;->h0:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x4

    invoke-interface/range {v4 .. v10}, Lc/a/a/a/g2/q;->k(IIIJI)V

    .line 10
    invoke-direct {p0}, Lc/a/a/a/g2/t;->a1()V

    .line 11
    :goto_0
    iput v3, p0, Lc/a/a/a/g2/t;->r0:I

    return v1

    .line 12
    :cond_4
    iget-boolean v0, p0, Lc/a/a/a/g2/t;->c0:Z

    if-eqz v0, :cond_5

    .line 13
    iput-boolean v1, p0, Lc/a/a/a/g2/t;->c0:Z

    .line 14
    iget-object v0, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    iget-object v0, v0, Lc/a/a/a/c2/f;->c:Ljava/nio/ByteBuffer;

    sget-object v1, Lc/a/a/a/g2/t;->m:[B

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 15
    iget-object v3, p0, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    iget v4, p0, Lc/a/a/a/g2/t;->h0:I

    const/4 v5, 0x0

    array-length v6, v1

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    invoke-interface/range {v3 .. v9}, Lc/a/a/a/g2/q;->k(IIIJI)V

    .line 16
    invoke-direct {p0}, Lc/a/a/a/g2/t;->a1()V

    .line 17
    iput-boolean v2, p0, Lc/a/a/a/g2/t;->t0:Z

    return v2

    .line 18
    :cond_5
    iget v0, p0, Lc/a/a/a/g2/t;->q0:I

    if-ne v0, v2, :cond_7

    const/4 v0, 0x0

    .line 19
    :goto_1
    iget-object v4, p0, Lc/a/a/a/g2/t;->N:Lc/a/a/a/u0;

    iget-object v4, v4, Lc/a/a/a/u0;->n:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v0, v4, :cond_6

    .line 20
    iget-object v4, p0, Lc/a/a/a/g2/t;->N:Lc/a/a/a/u0;

    iget-object v4, v4, Lc/a/a/a/u0;->n:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [B

    .line 21
    iget-object v5, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    iget-object v5, v5, Lc/a/a/a/c2/f;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 22
    :cond_6
    iput v3, p0, Lc/a/a/a/g2/t;->q0:I

    .line 23
    :cond_7
    iget-object v0, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    iget-object v0, v0, Lc/a/a/a/c2/f;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    .line 24
    invoke-virtual {p0}, Lc/a/a/a/h0;->B()Lc/a/a/a/v0;

    move-result-object v4

    .line 25
    iget-object v5, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    invoke-virtual {p0, v4, v5, v1}, Lc/a/a/a/h0;->M(Lc/a/a/a/v0;Lc/a/a/a/c2/f;Z)I

    move-result v5

    .line 26
    invoke-virtual {p0}, Lc/a/a/a/h0;->i()Z

    move-result v6

    if-eqz v6, :cond_8

    .line 27
    iget-wide v6, p0, Lc/a/a/a/g2/t;->w0:J

    iput-wide v6, p0, Lc/a/a/a/g2/t;->x0:J

    :cond_8
    const/4 v6, -0x3

    if-ne v5, v6, :cond_9

    return v1

    :cond_9
    const/4 v6, -0x5

    if-ne v5, v6, :cond_b

    .line 28
    iget v0, p0, Lc/a/a/a/g2/t;->q0:I

    if-ne v0, v3, :cond_a

    .line 29
    iget-object v0, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    invoke-virtual {v0}, Lc/a/a/a/c2/f;->f()V

    .line 30
    iput v2, p0, Lc/a/a/a/g2/t;->q0:I

    .line 31
    :cond_a
    invoke-virtual {p0, v4}, Lc/a/a/a/g2/t;->M0(Lc/a/a/a/v0;)Lc/a/a/a/c2/g;

    return v2

    .line 32
    :cond_b
    iget-object v4, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    invoke-virtual {v4}, Lc/a/a/a/c2/a;->k()Z

    move-result v4

    if-eqz v4, :cond_f

    .line 33
    iget v0, p0, Lc/a/a/a/g2/t;->q0:I

    if-ne v0, v3, :cond_c

    .line 34
    iget-object v0, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    invoke-virtual {v0}, Lc/a/a/a/c2/f;->f()V

    .line 35
    iput v2, p0, Lc/a/a/a/g2/t;->q0:I

    .line 36
    :cond_c
    iput-boolean v2, p0, Lc/a/a/a/g2/t;->y0:Z

    .line 37
    iget-boolean v0, p0, Lc/a/a/a/g2/t;->t0:Z

    if-nez v0, :cond_d

    .line 38
    invoke-direct {p0}, Lc/a/a/a/g2/t;->R0()V

    return v1

    .line 39
    :cond_d
    :try_start_0
    iget-boolean v0, p0, Lc/a/a/a/g2/t;->e0:Z

    if-eqz v0, :cond_e

    goto :goto_2

    .line 40
    :cond_e
    iput-boolean v2, p0, Lc/a/a/a/g2/t;->u0:Z

    .line 41
    iget-object v3, p0, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    iget v4, p0, Lc/a/a/a/g2/t;->h0:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x4

    invoke-interface/range {v3 .. v9}, Lc/a/a/a/g2/q;->k(IIIJI)V

    .line 42
    invoke-direct {p0}, Lc/a/a/a/g2/t;->a1()V
    :try_end_0
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    return v1

    :catch_0
    move-exception v0

    .line 43
    iget-object v1, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    invoke-virtual {p0, v0, v1}, Lc/a/a/a/h0;->y(Ljava/lang/Throwable;Lc/a/a/a/u0;)Lc/a/a/a/p0;

    move-result-object v0

    throw v0

    .line 44
    :cond_f
    iget-boolean v4, p0, Lc/a/a/a/g2/t;->t0:Z

    if-nez v4, :cond_11

    iget-object v4, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    invoke-virtual {v4}, Lc/a/a/a/c2/a;->l()Z

    move-result v4

    if-nez v4, :cond_11

    .line 45
    iget-object v0, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    invoke-virtual {v0}, Lc/a/a/a/c2/f;->f()V

    .line 46
    iget v0, p0, Lc/a/a/a/g2/t;->q0:I

    if-ne v0, v3, :cond_10

    .line 47
    iput v2, p0, Lc/a/a/a/g2/t;->q0:I

    :cond_10
    return v2

    .line 48
    :cond_11
    iget-object v3, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    invoke-virtual {v3}, Lc/a/a/a/c2/f;->q()Z

    move-result v3

    if-eqz v3, :cond_12

    .line 49
    iget-object v4, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    iget-object v4, v4, Lc/a/a/a/c2/f;->b:Lc/a/a/a/c2/b;

    invoke-virtual {v4, v0}, Lc/a/a/a/c2/b;->b(I)V

    .line 50
    :cond_12
    iget-boolean v0, p0, Lc/a/a/a/g2/t;->V:Z

    if-eqz v0, :cond_14

    if-nez v3, :cond_14

    .line 51
    iget-object v0, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    iget-object v0, v0, Lc/a/a/a/c2/f;->c:Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lc/a/a/a/m2/y;->b(Ljava/nio/ByteBuffer;)V

    .line 52
    iget-object v0, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    iget-object v0, v0, Lc/a/a/a/c2/f;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    if-nez v0, :cond_13

    return v2

    .line 53
    :cond_13
    iput-boolean v1, p0, Lc/a/a/a/g2/t;->V:Z

    .line 54
    :cond_14
    iget-object v0, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    iget-wide v4, v0, Lc/a/a/a/c2/f;->e:J

    .line 55
    iget-object v6, p0, Lc/a/a/a/g2/t;->f0:Lc/a/a/a/g2/p;

    if-eqz v6, :cond_15

    .line 56
    iget-object v4, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    .line 57
    invoke-virtual {v6, v4, v0}, Lc/a/a/a/g2/p;->c(Lc/a/a/a/u0;Lc/a/a/a/c2/f;)J

    move-result-wide v4

    :cond_15
    move-wide v10, v4

    .line 58
    iget-object v0, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    invoke-virtual {v0}, Lc/a/a/a/c2/a;->j()Z

    move-result v0

    if-eqz v0, :cond_16

    .line 59
    iget-object v0, p0, Lc/a/a/a/g2/t;->w:Ljava/util/ArrayList;

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    :cond_16
    iget-boolean v0, p0, Lc/a/a/a/g2/t;->A0:Z

    if-eqz v0, :cond_17

    .line 61
    iget-object v0, p0, Lc/a/a/a/g2/t;->v:Lc/a/a/a/m2/i0;

    iget-object v4, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    invoke-virtual {v0, v10, v11, v4}, Lc/a/a/a/m2/i0;->a(JLjava/lang/Object;)V

    .line 62
    iput-boolean v1, p0, Lc/a/a/a/g2/t;->A0:Z

    .line 63
    :cond_17
    iget-object v0, p0, Lc/a/a/a/g2/t;->f0:Lc/a/a/a/g2/p;

    if-eqz v0, :cond_18

    .line 64
    iget-wide v4, p0, Lc/a/a/a/g2/t;->w0:J

    iget-object v0, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    iget-wide v6, v0, Lc/a/a/a/c2/f;->e:J

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iput-wide v4, p0, Lc/a/a/a/g2/t;->w0:J

    goto :goto_3

    .line 65
    :cond_18
    iget-wide v4, p0, Lc/a/a/a/g2/t;->w0:J

    invoke-static {v4, v5, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iput-wide v4, p0, Lc/a/a/a/g2/t;->w0:J

    .line 66
    :goto_3
    iget-object v0, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    invoke-virtual {v0}, Lc/a/a/a/c2/f;->p()V

    .line 67
    iget-object v0, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    invoke-virtual {v0}, Lc/a/a/a/c2/a;->i()Z

    move-result v0

    if-eqz v0, :cond_19

    .line 68
    iget-object v0, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    invoke-virtual {p0, v0}, Lc/a/a/a/g2/t;->z0(Lc/a/a/a/c2/f;)V

    .line 69
    :cond_19
    iget-object v0, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    invoke-virtual {p0, v0}, Lc/a/a/a/g2/t;->Q0(Lc/a/a/a/c2/f;)V

    if-eqz v3, :cond_1a

    .line 70
    :try_start_1
    iget-object v6, p0, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    iget v7, p0, Lc/a/a/a/g2/t;->h0:I

    const/4 v8, 0x0

    iget-object v0, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    iget-object v9, v0, Lc/a/a/a/c2/f;->b:Lc/a/a/a/c2/b;

    const/4 v12, 0x0

    invoke-interface/range {v6 .. v12}, Lc/a/a/a/g2/q;->f(IILc/a/a/a/c2/b;JI)V

    goto :goto_4

    .line 71
    :cond_1a
    iget-object v6, p0, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    iget v7, p0, Lc/a/a/a/g2/t;->h0:I

    const/4 v8, 0x0

    iget-object v0, p0, Lc/a/a/a/g2/t;->s:Lc/a/a/a/c2/f;

    iget-object v0, v0, Lc/a/a/a/c2/f;->c:Ljava/nio/ByteBuffer;

    .line 72
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v9

    const/4 v12, 0x0

    .line 73
    invoke-interface/range {v6 .. v12}, Lc/a/a/a/g2/q;->k(IIIJI)V
    :try_end_1
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_1 .. :try_end_1} :catch_1

    .line 74
    :goto_4
    invoke-direct {p0}, Lc/a/a/a/g2/t;->a1()V

    .line 75
    iput-boolean v2, p0, Lc/a/a/a/g2/t;->t0:Z

    .line 76
    iput v1, p0, Lc/a/a/a/g2/t;->q0:I

    .line 77
    iget-object v0, p0, Lc/a/a/a/g2/t;->G0:Lc/a/a/a/c2/d;

    iget v1, v0, Lc/a/a/a/c2/d;->c:I

    add-int/2addr v1, v2

    iput v1, v0, Lc/a/a/a/c2/d;->c:I

    return v2

    :catch_1
    move-exception v0

    .line 78
    iget-object v1, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    invoke-virtual {p0, v0, v1}, Lc/a/a/a/h0;->y(Ljava/lang/Throwable;Lc/a/a/a/u0;)Lc/a/a/a/p0;

    move-result-object v0

    throw v0

    :cond_1b
    :goto_5
    return v1
.end method

.method private l1(Lc/a/a/a/u0;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/4 v1, 0x1

    const/16 v2, 0x17

    if-ge v0, v2, :cond_0

    return v1

    .line 2
    :cond_0
    iget v0, p0, Lc/a/a/a/g2/t;->L:F

    .line 3
    invoke-virtual {p0}, Lc/a/a/a/h0;->D()[Lc/a/a/a/u0;

    move-result-object v2

    invoke-virtual {p0, v0, p1, v2}, Lc/a/a/a/g2/t;->t0(FLc/a/a/a/u0;[Lc/a/a/a/u0;)F

    move-result p1

    .line 4
    iget v0, p0, Lc/a/a/a/g2/t;->Q:F

    cmpl-float v2, v0, p1

    if-nez v2, :cond_1

    return v1

    :cond_1
    const/high16 v2, -0x40800000    # -1.0f

    cmpl-float v3, p1, v2

    if-nez v3, :cond_2

    .line 5
    invoke-direct {p0}, Lc/a/a/a/g2/t;->e0()V

    const/4 p1, 0x0

    return p1

    :cond_2
    cmpl-float v0, v0, v2

    if-nez v0, :cond_4

    .line 6
    iget v0, p0, Lc/a/a/a/g2/t;->q:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_3

    goto :goto_0

    :cond_3
    return v1

    .line 7
    :cond_4
    :goto_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v2, "operating-rate"

    .line 8
    invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 9
    iget-object v2, p0, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    invoke-interface {v2, v0}, Lc/a/a/a/g2/q;->l(Landroid/os/Bundle;)V

    .line 10
    iput p1, p0, Lc/a/a/a/g2/t;->Q:F

    return v1
.end method

.method private m0()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    invoke-interface {v0}, Lc/a/a/a/g2/q;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->Y0()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lc/a/a/a/g2/t;->Y0()V

    .line 3
    throw v0
.end method

.method private m1()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lc/a/a/a/g2/t;->H:Landroid/media/MediaCrypto;

    iget-object v1, p0, Lc/a/a/a/g2/t;->G:Lc/a/a/a/e2/v;

    invoke-direct {p0, v1}, Lc/a/a/a/g2/t;->w0(Lc/a/a/a/e2/v;)Lc/a/a/a/e2/e0;

    move-result-object v1

    iget-object v1, v1, Lc/a/a/a/e2/e0;->c:[B

    invoke-virtual {v0, v1}, Landroid/media/MediaCrypto;->setMediaDrmSession([B)V
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    iget-object v0, p0, Lc/a/a/a/g2/t;->G:Lc/a/a/a/e2/v;

    invoke-direct {p0, v0}, Lc/a/a/a/g2/t;->c1(Lc/a/a/a/e2/v;)V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lc/a/a/a/g2/t;->r0:I

    .line 4
    iput v0, p0, Lc/a/a/a/g2/t;->s0:I

    return-void

    :catch_0
    move-exception v0

    .line 5
    iget-object v1, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    invoke-virtual {p0, v0, v1}, Lc/a/a/a/h0;->y(Ljava/lang/Throwable;Lc/a/a/a/u0;)Lc/a/a/a/p0;

    move-result-object v0

    throw v0
.end method

.method private p0(Z)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
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
    iget-object v0, p0, Lc/a/a/a/g2/t;->o:Lc/a/a/a/g2/u;

    iget-object v1, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    .line 2
    invoke-virtual {p0, v0, v1, p1}, Lc/a/a/a/g2/t;->v0(Lc/a/a/a/g2/u;Lc/a/a/a/u0;Z)Ljava/util/List;

    move-result-object v0

    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lc/a/a/a/g2/t;->o:Lc/a/a/a/g2/u;

    iget-object v0, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    const/4 v1, 0x0

    .line 5
    invoke-virtual {p0, p1, v0, v1}, Lc/a/a/a/g2/t;->v0(Lc/a/a/a/g2/u;Lc/a/a/a/u0;Z)Ljava/util/List;

    move-result-object v0

    .line 6
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    .line 7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Drm session requires secure decoder for "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    iget-object v1, v1, Lc/a/a/a/u0;->l:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", but no secure decoder available. Trying to proceed with "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "MediaCodecRenderer"

    invoke-static {v1, p1}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method private w0(Lc/a/a/a/e2/v;)Lc/a/a/a/e2/e0;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lc/a/a/a/e2/v;->f()Lc/a/a/a/e2/c0;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 2
    instance-of v0, p1, Lc/a/a/a/e2/e0;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expecting FrameworkMediaCrypto but found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    invoke-virtual {p0, v0, p1}, Lc/a/a/a/h0;->y(Ljava/lang/Throwable;Lc/a/a/a/u0;)Lc/a/a/a/p0;

    move-result-object p1

    throw p1

    .line 4
    :cond_1
    :goto_0
    check-cast p1, Lc/a/a/a/e2/e0;

    return-object p1
.end method


# virtual methods
.method protected F()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    iput-wide v0, p0, Lc/a/a/a/g2/t;->H0:J

    .line 3
    iput-wide v0, p0, Lc/a/a/a/g2/t;->I0:J

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lc/a/a/a/g2/t;->J0:I

    .line 5
    iget-object v0, p0, Lc/a/a/a/g2/t;->G:Lc/a/a/a/e2/v;

    if-nez v0, :cond_1

    iget-object v0, p0, Lc/a/a/a/g2/t;->D:Lc/a/a/a/e2/v;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->o0()Z

    goto :goto_1

    .line 7
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->I()V

    :goto_1
    return-void
.end method

.method protected G(ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    new-instance p1, Lc/a/a/a/c2/d;

    invoke-direct {p1}, Lc/a/a/a/c2/d;-><init>()V

    iput-object p1, p0, Lc/a/a/a/g2/t;->G0:Lc/a/a/a/c2/d;

    return-void
.end method

.method protected G0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected H(JZ)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    const/4 p1, 0x0

    .line 1
    iput-boolean p1, p0, Lc/a/a/a/g2/t;->y0:Z

    .line 2
    iput-boolean p1, p0, Lc/a/a/a/g2/t;->z0:Z

    .line 3
    iput-boolean p1, p0, Lc/a/a/a/g2/t;->B0:Z

    .line 4
    iget-boolean p2, p0, Lc/a/a/a/g2/t;->m0:Z

    if-eqz p2, :cond_0

    .line 5
    iget-object p2, p0, Lc/a/a/a/g2/t;->u:Lc/a/a/a/g2/o;

    invoke-virtual {p2}, Lc/a/a/a/g2/o;->f()V

    .line 6
    iget-object p2, p0, Lc/a/a/a/g2/t;->t:Lc/a/a/a/c2/f;

    invoke-virtual {p2}, Lc/a/a/a/c2/f;->f()V

    .line 7
    iput-boolean p1, p0, Lc/a/a/a/g2/t;->n0:Z

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->n0()Z

    .line 9
    :goto_0
    iget-object p2, p0, Lc/a/a/a/g2/t;->v:Lc/a/a/a/m2/i0;

    invoke-virtual {p2}, Lc/a/a/a/m2/i0;->l()I

    move-result p2

    const/4 p3, 0x1

    if-lez p2, :cond_1

    .line 10
    iput-boolean p3, p0, Lc/a/a/a/g2/t;->A0:Z

    .line 11
    :cond_1
    iget-object p2, p0, Lc/a/a/a/g2/t;->v:Lc/a/a/a/m2/i0;

    invoke-virtual {p2}, Lc/a/a/a/m2/i0;->c()V

    .line 12
    iget p2, p0, Lc/a/a/a/g2/t;->J0:I

    if-eqz p2, :cond_2

    .line 13
    iget-object v0, p0, Lc/a/a/a/g2/t;->z:[J

    add-int/lit8 v1, p2, -0x1

    aget-wide v1, v0, v1

    iput-wide v1, p0, Lc/a/a/a/g2/t;->I0:J

    .line 14
    iget-object v0, p0, Lc/a/a/a/g2/t;->y:[J

    sub-int/2addr p2, p3

    aget-wide p2, v0, p2

    iput-wide p2, p0, Lc/a/a/a/g2/t;->H0:J

    .line 15
    iput p1, p0, Lc/a/a/a/g2/t;->J0:I

    :cond_2
    return-void
.end method

.method protected final H0()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    if-nez v0, :cond_8

    iget-boolean v0, p0, Lc/a/a/a/g2/t;->m0:Z

    if-nez v0, :cond_8

    iget-object v0, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 2
    :cond_0
    iget-object v1, p0, Lc/a/a/a/g2/t;->G:Lc/a/a/a/e2/v;

    if-nez v1, :cond_1

    invoke-virtual {p0, v0}, Lc/a/a/a/g2/t;->i1(Lc/a/a/a/u0;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    invoke-direct {p0, v0}, Lc/a/a/a/g2/t;->B0(Lc/a/a/a/u0;)V

    return-void

    .line 4
    :cond_1
    iget-object v0, p0, Lc/a/a/a/g2/t;->G:Lc/a/a/a/e2/v;

    invoke-direct {p0, v0}, Lc/a/a/a/g2/t;->c1(Lc/a/a/a/e2/v;)V

    .line 5
    iget-object v0, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    iget-object v0, v0, Lc/a/a/a/u0;->l:Ljava/lang/String;

    .line 6
    iget-object v1, p0, Lc/a/a/a/g2/t;->D:Lc/a/a/a/e2/v;

    if-eqz v1, :cond_7

    .line 7
    iget-object v2, p0, Lc/a/a/a/g2/t;->H:Landroid/media/MediaCrypto;

    const/4 v3, 0x1

    if-nez v2, :cond_5

    .line 8
    invoke-direct {p0, v1}, Lc/a/a/a/g2/t;->w0(Lc/a/a/a/e2/v;)Lc/a/a/a/e2/e0;

    move-result-object v1

    if-nez v1, :cond_3

    .line 9
    iget-object v0, p0, Lc/a/a/a/g2/t;->D:Lc/a/a/a/e2/v;

    invoke-interface {v0}, Lc/a/a/a/e2/v;->g()Lc/a/a/a/e2/v$a;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    return-void

    .line 10
    :cond_3
    :try_start_0
    new-instance v2, Landroid/media/MediaCrypto;

    iget-object v4, v1, Lc/a/a/a/e2/e0;->b:Ljava/util/UUID;

    iget-object v5, v1, Lc/a/a/a/e2/e0;->c:[B

    invoke-direct {v2, v4, v5}, Landroid/media/MediaCrypto;-><init>(Ljava/util/UUID;[B)V

    iput-object v2, p0, Lc/a/a/a/g2/t;->H:Landroid/media/MediaCrypto;
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    iget-boolean v1, v1, Lc/a/a/a/e2/e0;->d:Z

    if-nez v1, :cond_4

    .line 12
    invoke-virtual {v2, v0}, Landroid/media/MediaCrypto;->requiresSecureDecoderComponent(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->I:Z

    goto :goto_1

    :catch_0
    move-exception v0

    .line 13
    iget-object v1, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    invoke-virtual {p0, v0, v1}, Lc/a/a/a/h0;->y(Ljava/lang/Throwable;Lc/a/a/a/u0;)Lc/a/a/a/p0;

    move-result-object v0

    throw v0

    .line 14
    :cond_5
    :goto_1
    sget-boolean v0, Lc/a/a/a/e2/e0;->a:Z

    if-eqz v0, :cond_7

    .line 15
    iget-object v0, p0, Lc/a/a/a/g2/t;->D:Lc/a/a/a/e2/v;

    invoke-interface {v0}, Lc/a/a/a/e2/v;->getState()I

    move-result v0

    if-eq v0, v3, :cond_6

    const/4 v1, 0x4

    if-eq v0, v1, :cond_7

    return-void

    .line 16
    :cond_6
    iget-object v0, p0, Lc/a/a/a/g2/t;->D:Lc/a/a/a/e2/v;

    invoke-interface {v0}, Lc/a/a/a/e2/v;->g()Lc/a/a/a/e2/v$a;

    move-result-object v0

    iget-object v1, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    invoke-virtual {p0, v0, v1}, Lc/a/a/a/h0;->y(Ljava/lang/Throwable;Lc/a/a/a/u0;)Lc/a/a/a/p0;

    move-result-object v0

    throw v0

    .line 17
    :cond_7
    :try_start_1
    iget-object v0, p0, Lc/a/a/a/g2/t;->H:Landroid/media/MediaCrypto;

    iget-boolean v1, p0, Lc/a/a/a/g2/t;->I:Z

    invoke-direct {p0, v0, v1}, Lc/a/a/a/g2/t;->I0(Landroid/media/MediaCrypto;Z)V
    :try_end_1
    .catch Lc/a/a/a/g2/t$a; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception v0

    .line 18
    iget-object v1, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    invoke-virtual {p0, v0, v1}, Lc/a/a/a/h0;->y(Ljava/lang/Throwable;Lc/a/a/a/u0;)Lc/a/a/a/p0;

    move-result-object v0

    throw v0

    :cond_8
    :goto_2
    return-void
.end method

.method protected I()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-direct {p0}, Lc/a/a/a/g2/t;->c0()V

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->W0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    invoke-direct {p0, v0}, Lc/a/a/a/g2/t;->f1(Lc/a/a/a/e2/v;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-direct {p0, v0}, Lc/a/a/a/g2/t;->f1(Lc/a/a/a/e2/v;)V

    .line 4
    throw v1
.end method

.method protected J()V
    .locals 0

    return-void
.end method

.method protected K()V
    .locals 0

    return-void
.end method

.method protected abstract K0(Ljava/lang/String;JJ)V
.end method

.method protected L([Lc/a/a/a/u0;JJ)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lc/a/a/a/g2/t;->I0:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const/4 p1, 0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    .line 2
    iget-wide v0, p0, Lc/a/a/a/g2/t;->H0:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lc/a/a/a/m2/f;->f(Z)V

    .line 3
    iput-wide p2, p0, Lc/a/a/a/g2/t;->H0:J

    .line 4
    iput-wide p4, p0, Lc/a/a/a/g2/t;->I0:J

    goto :goto_2

    .line 5
    :cond_1
    iget v0, p0, Lc/a/a/a/g2/t;->J0:I

    iget-object v1, p0, Lc/a/a/a/g2/t;->z:[J

    array-length v1, v1

    if-ne v0, v1, :cond_2

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Too many stream changes, so dropping offset: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc/a/a/a/g2/t;->z:[J

    iget v2, p0, Lc/a/a/a/g2/t;->J0:I

    sub-int/2addr v2, p1

    aget-wide v2, v1, v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MediaCodecRenderer"

    invoke-static {v1, v0}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    add-int/2addr v0, p1

    .line 7
    iput v0, p0, Lc/a/a/a/g2/t;->J0:I

    .line 8
    :goto_1
    iget-object v0, p0, Lc/a/a/a/g2/t;->y:[J

    iget v1, p0, Lc/a/a/a/g2/t;->J0:I

    add-int/lit8 v2, v1, -0x1

    aput-wide p2, v0, v2

    .line 9
    iget-object p2, p0, Lc/a/a/a/g2/t;->z:[J

    add-int/lit8 p3, v1, -0x1

    aput-wide p4, p2, p3

    .line 10
    iget-object p2, p0, Lc/a/a/a/g2/t;->A:[J

    sub-int/2addr v1, p1

    iget-wide p3, p0, Lc/a/a/a/g2/t;->w0:J

    aput-wide p3, p2, v1

    :goto_2
    return-void
.end method

.method protected abstract L0(Ljava/lang/String;)V
.end method

.method protected M0(Lc/a/a/a/v0;)Lc/a/a/a/c2/g;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->A0:Z

    .line 2
    iget-object v1, p1, Lc/a/a/a/v0;->b:Lc/a/a/a/u0;

    invoke-static {v1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lc/a/a/a/u0;

    .line 3
    iget-object v1, v5, Lc/a/a/a/u0;->l:Ljava/lang/String;

    if-eqz v1, :cond_14

    .line 4
    iget-object p1, p1, Lc/a/a/a/v0;->a:Lc/a/a/a/e2/v;

    invoke-direct {p0, p1}, Lc/a/a/a/g2/t;->f1(Lc/a/a/a/e2/v;)V

    .line 5
    iput-object v5, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    .line 6
    iget-boolean p1, p0, Lc/a/a/a/g2/t;->m0:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 7
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->o0:Z

    return-object v1

    .line 8
    :cond_0
    iget-object p1, p0, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    if-nez p1, :cond_2

    .line 9
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->G0()Z

    move-result p1

    if-nez p1, :cond_1

    .line 10
    iput-object v1, p0, Lc/a/a/a/g2/t;->R:Ljava/util/ArrayDeque;

    .line 11
    :cond_1
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->H0()V

    return-object v1

    .line 12
    :cond_2
    iget-object v1, p0, Lc/a/a/a/g2/t;->T:Lc/a/a/a/g2/s;

    .line 13
    iget-object v4, p0, Lc/a/a/a/g2/t;->N:Lc/a/a/a/u0;

    .line 14
    iget-object v2, p0, Lc/a/a/a/g2/t;->D:Lc/a/a/a/e2/v;

    iget-object v3, p0, Lc/a/a/a/g2/t;->G:Lc/a/a/a/e2/v;

    invoke-direct {p0, v1, v5, v2, v3}, Lc/a/a/a/g2/t;->h0(Lc/a/a/a/g2/s;Lc/a/a/a/u0;Lc/a/a/a/e2/v;Lc/a/a/a/e2/v;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 15
    invoke-direct {p0}, Lc/a/a/a/g2/t;->e0()V

    .line 16
    new-instance p1, Lc/a/a/a/c2/g;

    iget-object v3, v1, Lc/a/a/a/g2/s;->a:Ljava/lang/String;

    const/4 v6, 0x0

    const/16 v7, 0x80

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Lc/a/a/a/c2/g;-><init>(Ljava/lang/String;Lc/a/a/a/u0;Lc/a/a/a/u0;II)V

    return-object p1

    .line 17
    :cond_3
    iget-object v2, p0, Lc/a/a/a/g2/t;->G:Lc/a/a/a/e2/v;

    iget-object v3, p0, Lc/a/a/a/g2/t;->D:Lc/a/a/a/e2/v;

    const/4 v6, 0x0

    if-eq v2, v3, :cond_4

    const/4 v2, 0x1

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_6

    .line 18
    sget v3, Lc/a/a/a/m2/m0;->a:I

    const/16 v7, 0x17

    if-lt v3, v7, :cond_5

    goto :goto_1

    :cond_5
    const/4 v3, 0x0

    goto :goto_2

    :cond_6
    :goto_1
    const/4 v3, 0x1

    :goto_2
    invoke-static {v3}, Lc/a/a/a/m2/f;->f(Z)V

    .line 19
    invoke-virtual {p0, v1, v4, v5}, Lc/a/a/a/g2/t;->Q(Lc/a/a/a/g2/s;Lc/a/a/a/u0;Lc/a/a/a/u0;)Lc/a/a/a/c2/g;

    move-result-object v3

    .line 20
    iget v7, v3, Lc/a/a/a/c2/g;->d:I

    const/4 v8, 0x3

    const/16 v9, 0x10

    const/4 v10, 0x2

    if-eqz v7, :cond_10

    if-eq v7, v0, :cond_d

    if-eq v7, v10, :cond_9

    if-ne v7, v8, :cond_8

    .line 21
    invoke-direct {p0, v5}, Lc/a/a/a/g2/t;->l1(Lc/a/a/a/u0;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_4

    .line 22
    :cond_7
    iput-object v5, p0, Lc/a/a/a/g2/t;->N:Lc/a/a/a/u0;

    if-eqz v2, :cond_11

    .line 23
    invoke-direct {p0}, Lc/a/a/a/g2/t;->f0()Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_5

    .line 24
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 25
    :cond_9
    invoke-direct {p0, v5}, Lc/a/a/a/g2/t;->l1(Lc/a/a/a/u0;)Z

    move-result v7

    if-nez v7, :cond_a

    goto :goto_4

    .line 26
    :cond_a
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->p0:Z

    .line 27
    iput v0, p0, Lc/a/a/a/g2/t;->q0:I

    .line 28
    iget v7, p0, Lc/a/a/a/g2/t;->U:I

    if-eq v7, v10, :cond_c

    if-ne v7, v0, :cond_b

    iget v7, v5, Lc/a/a/a/u0;->q:I

    iget v9, v4, Lc/a/a/a/u0;->q:I

    if-ne v7, v9, :cond_b

    iget v7, v5, Lc/a/a/a/u0;->r:I

    iget v9, v4, Lc/a/a/a/u0;->r:I

    if-ne v7, v9, :cond_b

    goto :goto_3

    :cond_b
    const/4 v0, 0x0

    :cond_c
    :goto_3
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->c0:Z

    .line 29
    iput-object v5, p0, Lc/a/a/a/g2/t;->N:Lc/a/a/a/u0;

    if-eqz v2, :cond_11

    .line 30
    invoke-direct {p0}, Lc/a/a/a/g2/t;->f0()Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_5

    .line 31
    :cond_d
    invoke-direct {p0, v5}, Lc/a/a/a/g2/t;->l1(Lc/a/a/a/u0;)Z

    move-result v0

    if-nez v0, :cond_e

    :goto_4
    const/16 v7, 0x10

    goto :goto_6

    .line 32
    :cond_e
    iput-object v5, p0, Lc/a/a/a/g2/t;->N:Lc/a/a/a/u0;

    if-eqz v2, :cond_f

    .line 33
    invoke-direct {p0}, Lc/a/a/a/g2/t;->f0()Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_5

    .line 34
    :cond_f
    invoke-direct {p0}, Lc/a/a/a/g2/t;->d0()Z

    move-result v0

    if-nez v0, :cond_11

    :goto_5
    const/4 v7, 0x2

    goto :goto_6

    .line 35
    :cond_10
    invoke-direct {p0}, Lc/a/a/a/g2/t;->e0()V

    :cond_11
    const/4 v7, 0x0

    .line 36
    :goto_6
    iget v0, v3, Lc/a/a/a/c2/g;->d:I

    if-eqz v0, :cond_13

    iget-object v0, p0, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    if-ne v0, p1, :cond_12

    iget p1, p0, Lc/a/a/a/g2/t;->s0:I

    if-ne p1, v8, :cond_13

    .line 37
    :cond_12
    new-instance p1, Lc/a/a/a/c2/g;

    iget-object v3, v1, Lc/a/a/a/g2/s;->a:Ljava/lang/String;

    const/4 v6, 0x0

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Lc/a/a/a/c2/g;-><init>(Ljava/lang/String;Lc/a/a/a/u0;Lc/a/a/a/u0;II)V

    return-object p1

    :cond_13
    return-object v3

    .line 38
    :cond_14
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    invoke-virtual {p0, p1, v5}, Lc/a/a/a/h0;->y(Ljava/lang/Throwable;Lc/a/a/a/u0;)Lc/a/a/a/p0;

    move-result-object p1

    throw p1
.end method

.method protected abstract N0(Lc/a/a/a/u0;Landroid/media/MediaFormat;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation
.end method

.method protected O0(J)V
    .locals 6

    .line 1
    :goto_0
    iget v0, p0, Lc/a/a/a/g2/t;->J0:I

    if-eqz v0, :cond_0

    iget-object v1, p0, Lc/a/a/a/g2/t;->A:[J

    const/4 v2, 0x0

    aget-wide v3, v1, v2

    cmp-long v1, p1, v3

    if-ltz v1, :cond_0

    .line 2
    iget-object v1, p0, Lc/a/a/a/g2/t;->y:[J

    aget-wide v3, v1, v2

    iput-wide v3, p0, Lc/a/a/a/g2/t;->H0:J

    .line 3
    iget-object v3, p0, Lc/a/a/a/g2/t;->z:[J

    aget-wide v4, v3, v2

    iput-wide v4, p0, Lc/a/a/a/g2/t;->I0:J

    add-int/lit8 v0, v0, -0x1

    .line 4
    iput v0, p0, Lc/a/a/a/g2/t;->J0:I

    const/4 v3, 0x1

    .line 5
    invoke-static {v1, v3, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 6
    iget-object v0, p0, Lc/a/a/a/g2/t;->z:[J

    iget v1, p0, Lc/a/a/a/g2/t;->J0:I

    invoke-static {v0, v3, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 7
    iget-object v0, p0, Lc/a/a/a/g2/t;->A:[J

    iget v1, p0, Lc/a/a/a/g2/t;->J0:I

    invoke-static {v0, v3, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->P0()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected P0()V
    .locals 0

    return-void
.end method

.method protected abstract Q(Lc/a/a/a/g2/s;Lc/a/a/a/u0;Lc/a/a/a/u0;)Lc/a/a/a/c2/g;
.end method

.method protected abstract Q0(Lc/a/a/a/c2/f;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation
.end method

.method protected abstract S0(JJLc/a/a/a/g2/q;Ljava/nio/ByteBuffer;IIIJZZLc/a/a/a/u0;)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation
.end method

.method protected W0()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget-object v1, p0, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    if-eqz v1, :cond_0

    .line 2
    invoke-interface {v1}, Lc/a/a/a/g2/q;->a()V

    .line 3
    iget-object v1, p0, Lc/a/a/a/g2/t;->G0:Lc/a/a/a/c2/d;

    iget v2, v1, Lc/a/a/a/c2/d;->b:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lc/a/a/a/c2/d;->b:I

    .line 4
    iget-object v1, p0, Lc/a/a/a/g2/t;->T:Lc/a/a/a/g2/s;

    iget-object v1, v1, Lc/a/a/a/g2/s;->a:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lc/a/a/a/g2/t;->L0(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :cond_0
    iput-object v0, p0, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    .line 6
    :try_start_1
    iget-object v1, p0, Lc/a/a/a/g2/t;->H:Landroid/media/MediaCrypto;

    if-eqz v1, :cond_1

    .line 7
    invoke-virtual {v1}, Landroid/media/MediaCrypto;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    :cond_1
    iput-object v0, p0, Lc/a/a/a/g2/t;->H:Landroid/media/MediaCrypto;

    .line 9
    invoke-direct {p0, v0}, Lc/a/a/a/g2/t;->c1(Lc/a/a/a/e2/v;)V

    .line 10
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->Z0()V

    return-void

    :catchall_0
    move-exception v1

    .line 11
    iput-object v0, p0, Lc/a/a/a/g2/t;->H:Landroid/media/MediaCrypto;

    .line 12
    invoke-direct {p0, v0}, Lc/a/a/a/g2/t;->c1(Lc/a/a/a/e2/v;)V

    .line 13
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->Z0()V

    .line 14
    throw v1

    :catchall_1
    move-exception v1

    .line 15
    iput-object v0, p0, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    .line 16
    :try_start_2
    iget-object v2, p0, Lc/a/a/a/g2/t;->H:Landroid/media/MediaCrypto;

    if-eqz v2, :cond_2

    .line 17
    invoke-virtual {v2}, Landroid/media/MediaCrypto;->release()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 18
    :cond_2
    iput-object v0, p0, Lc/a/a/a/g2/t;->H:Landroid/media/MediaCrypto;

    .line 19
    invoke-direct {p0, v0}, Lc/a/a/a/g2/t;->c1(Lc/a/a/a/e2/v;)V

    .line 20
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->Z0()V

    .line 21
    throw v1

    :catchall_2
    move-exception v1

    .line 22
    iput-object v0, p0, Lc/a/a/a/g2/t;->H:Landroid/media/MediaCrypto;

    .line 23
    invoke-direct {p0, v0}, Lc/a/a/a/g2/t;->c1(Lc/a/a/a/e2/v;)V

    .line 24
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->Z0()V

    .line 25
    throw v1
.end method

.method protected X0()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    return-void
.end method

.method protected Y0()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lc/a/a/a/g2/t;->a1()V

    .line 2
    invoke-direct {p0}, Lc/a/a/a/g2/t;->b1()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 3
    iput-wide v0, p0, Lc/a/a/a/g2/t;->g0:J

    const/4 v2, 0x0

    .line 4
    iput-boolean v2, p0, Lc/a/a/a/g2/t;->u0:Z

    .line 5
    iput-boolean v2, p0, Lc/a/a/a/g2/t;->t0:Z

    .line 6
    iput-boolean v2, p0, Lc/a/a/a/g2/t;->c0:Z

    .line 7
    iput-boolean v2, p0, Lc/a/a/a/g2/t;->d0:Z

    .line 8
    iput-boolean v2, p0, Lc/a/a/a/g2/t;->k0:Z

    .line 9
    iput-boolean v2, p0, Lc/a/a/a/g2/t;->l0:Z

    .line 10
    iget-object v3, p0, Lc/a/a/a/g2/t;->w:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 11
    iput-wide v0, p0, Lc/a/a/a/g2/t;->w0:J

    .line 12
    iput-wide v0, p0, Lc/a/a/a/g2/t;->x0:J

    .line 13
    iget-object v0, p0, Lc/a/a/a/g2/t;->f0:Lc/a/a/a/g2/p;

    if-eqz v0, :cond_0

    .line 14
    invoke-virtual {v0}, Lc/a/a/a/g2/p;->b()V

    .line 15
    :cond_0
    iput v2, p0, Lc/a/a/a/g2/t;->r0:I

    .line 16
    iput v2, p0, Lc/a/a/a/g2/t;->s0:I

    .line 17
    iget-boolean v0, p0, Lc/a/a/a/g2/t;->p0:Z

    iput v0, p0, Lc/a/a/a/g2/t;->q0:I

    return-void
.end method

.method protected Z0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->Y0()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lc/a/a/a/g2/t;->F0:Lc/a/a/a/p0;

    .line 3
    iput-object v0, p0, Lc/a/a/a/g2/t;->f0:Lc/a/a/a/g2/p;

    .line 4
    iput-object v0, p0, Lc/a/a/a/g2/t;->R:Ljava/util/ArrayDeque;

    .line 5
    iput-object v0, p0, Lc/a/a/a/g2/t;->T:Lc/a/a/a/g2/s;

    .line 6
    iput-object v0, p0, Lc/a/a/a/g2/t;->N:Lc/a/a/a/u0;

    .line 7
    iput-object v0, p0, Lc/a/a/a/g2/t;->O:Landroid/media/MediaFormat;

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->P:Z

    .line 9
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->v0:Z

    const/high16 v1, -0x40800000    # -1.0f

    .line 10
    iput v1, p0, Lc/a/a/a/g2/t;->Q:F

    .line 11
    iput v0, p0, Lc/a/a/a/g2/t;->U:I

    .line 12
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->V:Z

    .line 13
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->W:Z

    .line 14
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->X:Z

    .line 15
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->Y:Z

    .line 16
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->Z:Z

    .line 17
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->a0:Z

    .line 18
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->b0:Z

    .line 19
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->e0:Z

    .line 20
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->p0:Z

    .line 21
    iput v0, p0, Lc/a/a/a/g2/t;->q0:I

    .line 22
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->I:Z

    return-void
.end method

.method public final a(Lc/a/a/a/u0;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lc/a/a/a/g2/t;->o:Lc/a/a/a/g2/u;

    invoke-virtual {p0, v0, p1}, Lc/a/a/a/g2/t;->j1(Lc/a/a/a/g2/u;Lc/a/a/a/u0;)I

    move-result p1
    :try_end_0
    .catch Lc/a/a/a/g2/v$c; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception v0

    .line 2
    invoke-virtual {p0, v0, p1}, Lc/a/a/a/h0;->y(Ljava/lang/Throwable;Lc/a/a/a/u0;)Lc/a/a/a/p0;

    move-result-object p1

    throw p1
.end method

.method protected abstract a0(Lc/a/a/a/g2/s;Lc/a/a/a/g2/q;Lc/a/a/a/u0;Landroid/media/MediaCrypto;F)V
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/g2/t;->z0:Z

    return v0
.end method

.method protected b0(Ljava/lang/Throwable;Lc/a/a/a/g2/s;)Lc/a/a/a/g2/r;
    .locals 1

    .line 1
    new-instance v0, Lc/a/a/a/g2/r;

    invoke-direct {v0, p1, p2}, Lc/a/a/a/g2/r;-><init>(Ljava/lang/Throwable;Lc/a/a/a/g2/s;)V

    return-object v0
.end method

.method protected final d1()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/g2/t;->B0:Z

    return-void
.end method

.method public e()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/h0;->E()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-direct {p0}, Lc/a/a/a/g2/t;->A0()Z

    move-result v0

    if-nez v0, :cond_0

    iget-wide v0, p0, Lc/a/a/a/g2/t;->g0:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lc/a/a/a/g2/t;->g0:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected final e1(Lc/a/a/a/p0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/g2/t;->F0:Lc/a/a/a/p0;

    return-void
.end method

.method protected h1(Lc/a/a/a/g2/s;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public i0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lc/a/a/a/g2/t;->C0:Z

    return-void
.end method

.method protected i1(Lc/a/a/a/u0;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public j0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lc/a/a/a/g2/t;->D0:Z

    return-void
.end method

.method protected abstract j1(Lc/a/a/a/g2/u;Lc/a/a/a/u0;)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g2/v$c;
        }
    .end annotation
.end method

.method public final k()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public k0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lc/a/a/a/g2/t;->E0:Z

    return-void
.end method

.method public l(JJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/g2/t;->B0:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iput-boolean v1, p0, Lc/a/a/a/g2/t;->B0:Z

    .line 3
    invoke-direct {p0}, Lc/a/a/a/g2/t;->R0()V

    .line 4
    :cond_0
    iget-object v0, p0, Lc/a/a/a/g2/t;->F0:Lc/a/a/a/p0;

    if-nez v0, :cond_9

    .line 5
    :try_start_0
    iget-boolean v0, p0, Lc/a/a/a/g2/t;->z0:Z

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->X0()V

    return-void

    .line 7
    :cond_1
    iget-object v0, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    if-nez v0, :cond_2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lc/a/a/a/g2/t;->U0(Z)Z

    move-result v0

    if-nez v0, :cond_2

    return-void

    .line 8
    :cond_2
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->H0()V

    .line 9
    iget-boolean v0, p0, Lc/a/a/a/g2/t;->m0:Z

    if-eqz v0, :cond_4

    const-string v0, "bypassRender"

    .line 10
    invoke-static {v0}, Lc/a/a/a/m2/k0;->a(Ljava/lang/String;)V

    .line 11
    :goto_0
    invoke-direct {p0, p1, p2, p3, p4}, Lc/a/a/a/g2/t;->P(JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    .line 12
    :cond_3
    invoke-static {}, Lc/a/a/a/m2/k0;->c()V

    goto :goto_3

    .line 13
    :cond_4
    iget-object v0, p0, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    if-eqz v0, :cond_7

    .line 14
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const-string v2, "drainAndFeed"

    .line 15
    invoke-static {v2}, Lc/a/a/a/m2/k0;->a(Ljava/lang/String;)V

    .line 16
    :goto_1
    invoke-direct {p0, p1, p2, p3, p4}, Lc/a/a/a/g2/t;->g0(JJ)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 17
    invoke-direct {p0, v0, v1}, Lc/a/a/a/g2/t;->g1(J)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_1

    .line 18
    :cond_5
    :goto_2
    invoke-direct {p0}, Lc/a/a/a/g2/t;->l0()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-direct {p0, v0, v1}, Lc/a/a/a/g2/t;->g1(J)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_2

    .line 19
    :cond_6
    invoke-static {}, Lc/a/a/a/m2/k0;->c()V

    goto :goto_3

    .line 20
    :cond_7
    iget-object p3, p0, Lc/a/a/a/g2/t;->G0:Lc/a/a/a/c2/d;

    iget p4, p3, Lc/a/a/a/c2/d;->d:I

    invoke-virtual {p0, p1, p2}, Lc/a/a/a/h0;->N(J)I

    move-result p1

    add-int/2addr p4, p1

    iput p4, p3, Lc/a/a/a/c2/d;->d:I

    .line 21
    invoke-direct {p0, v1}, Lc/a/a/a/g2/t;->U0(Z)Z

    .line 22
    :goto_3
    iget-object p1, p0, Lc/a/a/a/g2/t;->G0:Lc/a/a/a/c2/d;

    invoke-virtual {p1}, Lc/a/a/a/c2/d;->c()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 23
    invoke-static {p1}, Lc/a/a/a/g2/t;->E0(Ljava/lang/IllegalStateException;)Z

    move-result p2

    if-eqz p2, :cond_8

    .line 24
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->r0()Lc/a/a/a/g2/s;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lc/a/a/a/g2/t;->b0(Ljava/lang/Throwable;Lc/a/a/a/g2/s;)Lc/a/a/a/g2/r;

    move-result-object p1

    iget-object p2, p0, Lc/a/a/a/g2/t;->B:Lc/a/a/a/u0;

    invoke-virtual {p0, p1, p2}, Lc/a/a/a/h0;->y(Ljava/lang/Throwable;Lc/a/a/a/u0;)Lc/a/a/a/p0;

    move-result-object p1

    throw p1

    .line 25
    :cond_8
    throw p1

    :cond_9
    const/4 p1, 0x0

    .line 26
    iput-object p1, p0, Lc/a/a/a/g2/t;->F0:Lc/a/a/a/p0;

    .line 27
    goto :goto_5

    :goto_4
    throw v0

    :goto_5
    goto :goto_4
.end method

.method protected final n0()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->o0()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->H0()V

    :cond_0
    return v0
.end method

.method protected final n1(J)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/t;->v:Lc/a/a/a/m2/i0;

    invoke-virtual {v0, p1, p2}, Lc/a/a/a/m2/i0;->j(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/u0;

    if-nez p1, :cond_0

    .line 2
    iget-boolean p2, p0, Lc/a/a/a/g2/t;->P:Z

    if-eqz p2, :cond_0

    .line 3
    iget-object p1, p0, Lc/a/a/a/g2/t;->v:Lc/a/a/a/m2/i0;

    invoke-virtual {p1}, Lc/a/a/a/m2/i0;->i()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/u0;

    :cond_0
    const/4 p2, 0x0

    if-eqz p1, :cond_1

    .line 4
    iput-object p1, p0, Lc/a/a/a/g2/t;->C:Lc/a/a/a/u0;

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    .line 5
    iget-boolean p1, p0, Lc/a/a/a/g2/t;->P:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lc/a/a/a/g2/t;->C:Lc/a/a/a/u0;

    if-eqz p1, :cond_3

    .line 6
    :cond_2
    iget-object p1, p0, Lc/a/a/a/g2/t;->C:Lc/a/a/a/u0;

    iget-object v0, p0, Lc/a/a/a/g2/t;->O:Landroid/media/MediaFormat;

    invoke-virtual {p0, p1, v0}, Lc/a/a/a/g2/t;->N0(Lc/a/a/a/u0;Landroid/media/MediaFormat;)V

    .line 7
    iput-boolean p2, p0, Lc/a/a/a/g2/t;->P:Z

    :cond_3
    return-void
.end method

.method protected o0()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget v0, p0, Lc/a/a/a/g2/t;->s0:I

    const/4 v2, 0x3

    if-eq v0, v2, :cond_3

    iget-boolean v0, p0, Lc/a/a/a/g2/t;->W:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lc/a/a/a/g2/t;->X:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lc/a/a/a/g2/t;->v0:Z

    if-eqz v0, :cond_3

    :cond_1
    iget-boolean v0, p0, Lc/a/a/a/g2/t;->Y:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lc/a/a/a/g2/t;->u0:Z

    if-eqz v0, :cond_2

    goto :goto_0

    .line 3
    :cond_2
    invoke-direct {p0}, Lc/a/a/a/g2/t;->m0()V

    return v1

    .line 4
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lc/a/a/a/g2/t;->W0()V

    const/4 v0, 0x1

    return v0
.end method

.method protected final q0()Lc/a/a/a/g2/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    return-object v0
.end method

.method protected final r0()Lc/a/a/a/g2/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/t;->T:Lc/a/a/a/g2/s;

    return-object v0
.end method

.method protected s0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected abstract t0(FLc/a/a/a/u0;[Lc/a/a/a/u0;)F
.end method

.method protected final u0()Landroid/media/MediaFormat;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/t;->O:Landroid/media/MediaFormat;

    return-object v0
.end method

.method protected abstract v0(Lc/a/a/a/g2/u;Lc/a/a/a/u0;Z)Ljava/util/List;
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
.end method

.method public x(FF)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iput p1, p0, Lc/a/a/a/g2/t;->K:F

    .line 2
    iput p2, p0, Lc/a/a/a/g2/t;->L:F

    .line 3
    iget-object p1, p0, Lc/a/a/a/g2/t;->M:Lc/a/a/a/g2/q;

    if-eqz p1, :cond_0

    iget p1, p0, Lc/a/a/a/g2/t;->s0:I

    const/4 p2, 0x3

    if-eq p1, p2, :cond_0

    .line 4
    invoke-virtual {p0}, Lc/a/a/a/h0;->getState()I

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    iget-object p1, p0, Lc/a/a/a/g2/t;->N:Lc/a/a/a/u0;

    invoke-direct {p0, p1}, Lc/a/a/a/g2/t;->l1(Lc/a/a/a/u0;)Z

    :cond_0
    return-void
.end method

.method protected final x0()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/g2/t;->I0:J

    return-wide v0
.end method

.method protected y0()F
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/g2/t;->K:F

    return v0
.end method

.method protected z0(Lc/a/a/a/c2/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    return-void
.end method
