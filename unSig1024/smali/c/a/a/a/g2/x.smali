.class public final Lc/a/a/a/g2/x;
.super Ljava/lang/Object;
.source "SynchronousMediaCodecAdapter.java"

# interfaces
.implements Lc/a/a/a/g2/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/g2/x$b;
    }
.end annotation


# instance fields
.field private final a:Landroid/media/MediaCodec;

.field private b:[Ljava/nio/ByteBuffer;

.field private c:[Ljava/nio/ByteBuffer;


# direct methods
.method private constructor <init>(Landroid/media/MediaCodec;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lc/a/a/a/g2/x;->a:Landroid/media/MediaCodec;

    return-void
.end method

.method synthetic constructor <init>(Landroid/media/MediaCodec;Lc/a/a/a/g2/x$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lc/a/a/a/g2/x;-><init>(Landroid/media/MediaCodec;)V

    return-void
.end method

.method private synthetic p(Lc/a/a/a/g2/q$b;Landroid/media/MediaCodec;JJ)V
    .locals 6

    move-object v0, p1

    move-object v1, p0

    move-wide v2, p3

    move-wide v4, p5

    .line 1
    invoke-interface/range {v0 .. v5}, Lc/a/a/a/g2/q$b;->a(Lc/a/a/a/g2/q;JJ)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lc/a/a/a/g2/x;->b:[Ljava/nio/ByteBuffer;

    .line 2
    iput-object v0, p0, Lc/a/a/a/g2/x;->c:[Ljava/nio/ByteBuffer;

    .line 3
    iget-object v0, p0, Lc/a/a/a/g2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    return-void
.end method

.method public b(Landroid/media/MediaCodec$BufferInfo;)I
    .locals 4

    .line 1
    :cond_0
    iget-object v0, p0, Lc/a/a/a/g2/x;->a:Landroid/media/MediaCodec;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, p1, v1, v2}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result v0

    const/4 v1, -0x3

    if-ne v0, v1, :cond_1

    .line 2
    sget v2, Lc/a/a/a/m2/m0;->a:I

    const/16 v3, 0x15

    if-ge v2, v3, :cond_1

    .line 3
    iget-object v2, p0, Lc/a/a/a/g2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v2}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, p0, Lc/a/a/a/g2/x;->c:[Ljava/nio/ByteBuffer;

    :cond_1
    if-eq v0, v1, :cond_0

    return v0
.end method

.method public c(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    return-void
.end method

.method public d(Lc/a/a/a/g2/q$b;Landroid/os/Handler;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/x;->a:Landroid/media/MediaCodec;

    new-instance v1, Lc/a/a/a/g2/i;

    invoke-direct {v1, p0, p1}, Lc/a/a/a/g2/i;-><init>(Lc/a/a/a/g2/x;Lc/a/a/a/g2/q$b;)V

    invoke-virtual {v0, v1, p2}, Landroid/media/MediaCodec;->setOnFrameRenderedListener(Landroid/media/MediaCodec$OnFrameRenderedListener;Landroid/os/Handler;)V

    return-void
.end method

.method public e(IZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1, p2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    return-void
.end method

.method public f(IILc/a/a/a/c2/b;JI)V
    .locals 7

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/x;->a:Landroid/media/MediaCodec;

    .line 2
    invoke-virtual {p3}, Lc/a/a/a/c2/b;->a()Landroid/media/MediaCodec$CryptoInfo;

    move-result-object v3

    move v1, p1

    move v2, p2

    move-wide v4, p4

    move v6, p6

    .line 3
    invoke-virtual/range {v0 .. v6}, Landroid/media/MediaCodec;->queueSecureInputBuffer(IILandroid/media/MediaCodec$CryptoInfo;JI)V

    return-void
.end method

.method public flush()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->flush()V

    return-void
.end method

.method public g(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setVideoScalingMode(I)V

    return-void
.end method

.method public h()Landroid/media/MediaFormat;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object v0

    return-object v0
.end method

.method public i(I)Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lc/a/a/a/g2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    iget-object v0, p0, Lc/a/a/a/g2/x;->b:[Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/nio/ByteBuffer;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public j(Landroid/view/Surface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setOutputSurface(Landroid/view/Surface;)V

    return-void
.end method

.method public k(IIIJI)V
    .locals 7

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/x;->a:Landroid/media/MediaCodec;

    move v1, p1

    move v2, p2

    move v3, p3

    move-wide v4, p4

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    return-void
.end method

.method public l(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V

    return-void
.end method

.method public m(I)Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lc/a/a/a/g2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    iget-object v0, p0, Lc/a/a/a/g2/x;->c:[Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/nio/ByteBuffer;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public n(IJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IJ)V

    return-void
.end method

.method public o()I
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/x;->a:Landroid/media/MediaCodec;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    move-result v0

    return v0
.end method

.method public synthetic q(Lc/a/a/a/g2/q$b;Landroid/media/MediaCodec;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lc/a/a/a/g2/x;->p(Lc/a/a/a/g2/q$b;Landroid/media/MediaCodec;JJ)V

    return-void
.end method

.method public start()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->start()V

    .line 2
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lc/a/a/a/g2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getInputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/g2/x;->b:[Ljava/nio/ByteBuffer;

    .line 4
    iget-object v0, p0, Lc/a/a/a/g2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/g2/x;->c:[Ljava/nio/ByteBuffer;

    :cond_0
    return-void
.end method
