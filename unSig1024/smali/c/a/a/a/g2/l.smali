.class final Lc/a/a/a/g2/l;
.super Ljava/lang/Object;
.source "AsynchronousMediaCodecAdapter.java"

# interfaces
.implements Lc/a/a/a/g2/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/g2/l$b;
    }
.end annotation


# instance fields
.field private final a:Landroid/media/MediaCodec;

.field private final b:Lc/a/a/a/g2/n;

.field private final c:Lc/a/a/a/g2/m;

.field private final d:Z

.field private e:Z

.field private f:I


# direct methods
.method private constructor <init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Landroid/os/HandlerThread;ZZ)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lc/a/a/a/g2/l;->a:Landroid/media/MediaCodec;

    .line 4
    new-instance v0, Lc/a/a/a/g2/n;

    invoke-direct {v0, p2}, Lc/a/a/a/g2/n;-><init>(Landroid/os/HandlerThread;)V

    iput-object v0, p0, Lc/a/a/a/g2/l;->b:Lc/a/a/a/g2/n;

    .line 5
    new-instance p2, Lc/a/a/a/g2/m;

    invoke-direct {p2, p1, p3, p4}, Lc/a/a/a/g2/m;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Z)V

    iput-object p2, p0, Lc/a/a/a/g2/l;->c:Lc/a/a/a/g2/m;

    .line 6
    iput-boolean p5, p0, Lc/a/a/a/g2/l;->d:Z

    const/4 p1, 0x0

    .line 7
    iput p1, p0, Lc/a/a/a/g2/l;->f:I

    return-void
.end method

.method synthetic constructor <init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Landroid/os/HandlerThread;ZZLc/a/a/a/g2/l$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lc/a/a/a/g2/l;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Landroid/os/HandlerThread;ZZ)V

    return-void
.end method

.method static synthetic p(I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lc/a/a/a/g2/l;->s(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic q(I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lc/a/a/a/g2/l;->r(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static r(I)Ljava/lang/String;
    .locals 1

    const-string v0, "ExoPlayer:MediaCodecAsyncAdapter:"

    .line 1
    invoke-static {p0, v0}, Lc/a/a/a/g2/l;->t(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static s(I)Ljava/lang/String;
    .locals 1

    const-string v0, "ExoPlayer:MediaCodecQueueingThread:"

    .line 1
    invoke-static {p0, v0}, Lc/a/a/a/g2/l;->t(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static t(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x1

    if-ne p0, p1, :cond_0

    const-string p0, "Audio"

    .line 2
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    if-ne p0, p1, :cond_1

    const-string p0, "Video"

    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string p1, "Unknown("

    .line 4
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private synthetic u(Lc/a/a/a/g2/q$b;Landroid/media/MediaCodec;JJ)V
    .locals 6

    move-object v0, p1

    move-object v1, p0

    move-wide v2, p3

    move-wide v4, p5

    .line 1
    invoke-interface/range {v0 .. v5}, Lc/a/a/a/g2/q$b;->a(Lc/a/a/a/g2/q;JJ)V

    return-void
.end method

.method private w()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/g2/l;->d:Z

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    iget-object v0, p0, Lc/a/a/a/g2/l;->c:Lc/a/a/a/g2/m;

    invoke-virtual {v0}, Lc/a/a/a/g2/m;->t()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 4
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    const/4 v0, 0x1

    .line 1
    :try_start_0
    iget v1, p0, Lc/a/a/a/g2/l;->f:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    .line 2
    iget-object v1, p0, Lc/a/a/a/g2/l;->c:Lc/a/a/a/g2/m;

    invoke-virtual {v1}, Lc/a/a/a/g2/m;->r()V

    .line 3
    :cond_0
    iget v1, p0, Lc/a/a/a/g2/l;->f:I

    if-eq v1, v0, :cond_1

    if-ne v1, v2, :cond_2

    .line 4
    :cond_1
    iget-object v1, p0, Lc/a/a/a/g2/l;->b:Lc/a/a/a/g2/n;

    invoke-virtual {v1}, Lc/a/a/a/g2/n;->q()V

    :cond_2
    const/4 v1, 0x3

    .line 5
    iput v1, p0, Lc/a/a/a/g2/l;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    iget-boolean v1, p0, Lc/a/a/a/g2/l;->e:Z

    if-nez v1, :cond_3

    .line 7
    iget-object v1, p0, Lc/a/a/a/g2/l;->a:Landroid/media/MediaCodec;

    invoke-virtual {v1}, Landroid/media/MediaCodec;->release()V

    .line 8
    iput-boolean v0, p0, Lc/a/a/a/g2/l;->e:Z

    :cond_3
    return-void

    :catchall_0
    move-exception v1

    .line 9
    iget-boolean v2, p0, Lc/a/a/a/g2/l;->e:Z

    if-nez v2, :cond_4

    .line 10
    iget-object v2, p0, Lc/a/a/a/g2/l;->a:Landroid/media/MediaCodec;

    invoke-virtual {v2}, Landroid/media/MediaCodec;->release()V

    .line 11
    iput-boolean v0, p0, Lc/a/a/a/g2/l;->e:Z

    .line 12
    :cond_4
    throw v1
.end method

.method public b(Landroid/media/MediaCodec$BufferInfo;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/l;->b:Lc/a/a/a/g2/n;

    invoke-virtual {v0, p1}, Lc/a/a/a/g2/n;->c(Landroid/media/MediaCodec$BufferInfo;)I

    move-result p1

    return p1
.end method

.method public c(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/l;->b:Lc/a/a/a/g2/n;

    iget-object v1, p0, Lc/a/a/a/g2/l;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, v1}, Lc/a/a/a/g2/n;->g(Landroid/media/MediaCodec;)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/g2/l;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    const/4 p1, 0x1

    .line 3
    iput p1, p0, Lc/a/a/a/g2/l;->f:I

    return-void
.end method

.method public d(Lc/a/a/a/g2/q$b;Landroid/os/Handler;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/g2/l;->w()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/g2/l;->a:Landroid/media/MediaCodec;

    new-instance v1, Lc/a/a/a/g2/c;

    invoke-direct {v1, p0, p1}, Lc/a/a/a/g2/c;-><init>(Lc/a/a/a/g2/l;Lc/a/a/a/g2/q$b;)V

    invoke-virtual {v0, v1, p2}, Landroid/media/MediaCodec;->setOnFrameRenderedListener(Landroid/media/MediaCodec$OnFrameRenderedListener;Landroid/os/Handler;)V

    return-void
.end method

.method public e(IZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/l;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1, p2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    return-void
.end method

.method public f(IILc/a/a/a/c2/b;JI)V
    .locals 7

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/l;->c:Lc/a/a/a/g2/m;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-wide v4, p4

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lc/a/a/a/g2/m;->o(IILc/a/a/a/c2/b;JI)V

    return-void
.end method

.method public flush()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/l;->c:Lc/a/a/a/g2/m;

    invoke-virtual {v0}, Lc/a/a/a/g2/m;->i()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/g2/l;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->flush()V

    .line 3
    iget-object v0, p0, Lc/a/a/a/g2/l;->b:Lc/a/a/a/g2/n;

    iget-object v1, p0, Lc/a/a/a/g2/l;->a:Landroid/media/MediaCodec;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lc/a/a/a/g2/j;

    invoke-direct {v2, v1}, Lc/a/a/a/g2/j;-><init>(Landroid/media/MediaCodec;)V

    invoke-virtual {v0, v2}, Lc/a/a/a/g2/n;->d(Ljava/lang/Runnable;)V

    return-void
.end method

.method public g(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/g2/l;->w()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/g2/l;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setVideoScalingMode(I)V

    return-void
.end method

.method public h()Landroid/media/MediaFormat;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/l;->b:Lc/a/a/a/g2/n;

    invoke-virtual {v0}, Lc/a/a/a/g2/n;->f()Landroid/media/MediaFormat;

    move-result-object v0

    return-object v0
.end method

.method public i(I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/l;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method

.method public j(Landroid/view/Surface;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/g2/l;->w()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/g2/l;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setOutputSurface(Landroid/view/Surface;)V

    return-void
.end method

.method public k(IIIJI)V
    .locals 7

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/l;->c:Lc/a/a/a/g2/m;

    move v1, p1

    move v2, p2

    move v3, p3

    move-wide v4, p4

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lc/a/a/a/g2/m;->n(IIIJI)V

    return-void
.end method

.method public l(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/g2/l;->w()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/g2/l;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V

    return-void
.end method

.method public m(I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/l;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method

.method public n(IJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/l;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IJ)V

    return-void
.end method

.method public o()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/l;->b:Lc/a/a/a/g2/n;

    invoke-virtual {v0}, Lc/a/a/a/g2/n;->b()I

    move-result v0

    return v0
.end method

.method public start()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/l;->c:Lc/a/a/a/g2/m;

    invoke-virtual {v0}, Lc/a/a/a/g2/m;->s()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/g2/l;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->start()V

    const/4 v0, 0x2

    .line 3
    iput v0, p0, Lc/a/a/a/g2/l;->f:I

    return-void
.end method

.method public synthetic v(Lc/a/a/a/g2/q$b;Landroid/media/MediaCodec;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lc/a/a/a/g2/l;->u(Lc/a/a/a/g2/q$b;Landroid/media/MediaCodec;JJ)V

    return-void
.end method
