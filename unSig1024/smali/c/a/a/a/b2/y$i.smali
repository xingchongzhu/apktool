.class final Lc/a/a/a/b2/y$i;
.super Ljava/lang/Object;
.source "DefaultAudioSink.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/b2/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "i"
.end annotation


# instance fields
.field private final a:Landroid/os/Handler;

.field private final b:Landroid/media/AudioTrack$StreamEventCallback;

.field final synthetic c:Lc/a/a/a/b2/y;


# direct methods
.method public constructor <init>(Lc/a/a/a/b2/y;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lc/a/a/a/b2/y$i;->c:Lc/a/a/a/b2/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lc/a/a/a/b2/y$i;->a:Landroid/os/Handler;

    .line 3
    new-instance v0, Lc/a/a/a/b2/y$i$a;

    invoke-direct {v0, p0, p1}, Lc/a/a/a/b2/y$i$a;-><init>(Lc/a/a/a/b2/y$i;Lc/a/a/a/b2/y;)V

    iput-object v0, p0, Lc/a/a/a/b2/y$i;->b:Landroid/media/AudioTrack$StreamEventCallback;

    return-void
.end method


# virtual methods
.method public a(Landroid/media/AudioTrack;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/y$i;->a:Landroid/os/Handler;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lc/a/a/a/b2/j;

    invoke-direct {v1, v0}, Lc/a/a/a/b2/j;-><init>(Landroid/os/Handler;)V

    iget-object v0, p0, Lc/a/a/a/b2/y$i;->b:Landroid/media/AudioTrack$StreamEventCallback;

    invoke-virtual {p1, v1, v0}, Landroid/media/AudioTrack;->registerStreamEventCallback(Ljava/util/concurrent/Executor;Landroid/media/AudioTrack$StreamEventCallback;)V

    return-void
.end method

.method public b(Landroid/media/AudioTrack;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/y$i;->b:Landroid/media/AudioTrack$StreamEventCallback;

    invoke-virtual {p1, v0}, Landroid/media/AudioTrack;->unregisterStreamEventCallback(Landroid/media/AudioTrack$StreamEventCallback;)V

    .line 2
    iget-object p1, p0, Lc/a/a/a/b2/y$i;->a:Landroid/os/Handler;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method
