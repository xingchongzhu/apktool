.class Lc/a/a/a/g2/m$a;
.super Landroid/os/Handler;
.source "AsynchronousMediaCodecBufferEnqueuer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/a/a/a/g2/m;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc/a/a/a/g2/m;


# direct methods
.method constructor <init>(Lc/a/a/a/g2/m;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/g2/m$a;->a:Lc/a/a/a/g2/m;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/g2/m$a;->a:Lc/a/a/a/g2/m;

    invoke-static {v0, p1}, Lc/a/a/a/g2/m;->a(Lc/a/a/a/g2/m;Landroid/os/Message;)V

    return-void
.end method
