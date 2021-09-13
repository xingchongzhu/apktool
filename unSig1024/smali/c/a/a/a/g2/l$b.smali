.class public final Lc/a/a/a/g2/l$b;
.super Ljava/lang/Object;
.source "AsynchronousMediaCodecAdapter.java"

# interfaces
.implements Lc/a/a/a/g2/q$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/g2/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final b:Lc/a/b/a/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/a/k<",
            "Landroid/os/HandlerThread;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lc/a/b/a/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/a/k<",
            "Landroid/os/HandlerThread;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Z

.field private final e:Z


# direct methods
.method public constructor <init>(IZZ)V
    .locals 2

    .line 1
    new-instance v0, Lc/a/a/a/g2/a;

    invoke-direct {v0, p1}, Lc/a/a/a/g2/a;-><init>(I)V

    new-instance v1, Lc/a/a/a/g2/b;

    invoke-direct {v1, p1}, Lc/a/a/a/g2/b;-><init>(I)V

    invoke-direct {p0, v0, v1, p2, p3}, Lc/a/a/a/g2/l$b;-><init>(Lc/a/b/a/k;Lc/a/b/a/k;ZZ)V

    return-void
.end method

.method constructor <init>(Lc/a/b/a/k;Lc/a/b/a/k;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/b/a/k<",
            "Landroid/os/HandlerThread;",
            ">;",
            "Lc/a/b/a/k<",
            "Landroid/os/HandlerThread;",
            ">;ZZ)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lc/a/a/a/g2/l$b;->b:Lc/a/b/a/k;

    .line 4
    iput-object p2, p0, Lc/a/a/a/g2/l$b;->c:Lc/a/b/a/k;

    .line 5
    iput-boolean p3, p0, Lc/a/a/a/g2/l$b;->d:Z

    .line 6
    iput-boolean p4, p0, Lc/a/a/a/g2/l$b;->e:Z

    return-void
.end method

.method static synthetic c(I)Landroid/os/HandlerThread;
    .locals 1

    .line 1
    new-instance v0, Landroid/os/HandlerThread;

    invoke-static {p0}, Lc/a/a/a/g2/l;->q(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static synthetic d(I)Landroid/os/HandlerThread;
    .locals 1

    .line 1
    new-instance v0, Landroid/os/HandlerThread;

    invoke-static {p0}, Lc/a/a/a/g2/l;->p(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Landroid/media/MediaCodec;)Lc/a/a/a/g2/q;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc/a/a/a/g2/l$b;->b(Landroid/media/MediaCodec;)Lc/a/a/a/g2/l;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/media/MediaCodec;)Lc/a/a/a/g2/l;
    .locals 8

    .line 1
    new-instance v7, Lc/a/a/a/g2/l;

    iget-object v0, p0, Lc/a/a/a/g2/l$b;->b:Lc/a/b/a/k;

    .line 2
    invoke-interface {v0}, Lc/a/b/a/k;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/os/HandlerThread;

    iget-object v0, p0, Lc/a/a/a/g2/l$b;->c:Lc/a/b/a/k;

    .line 3
    invoke-interface {v0}, Lc/a/b/a/k;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/os/HandlerThread;

    iget-boolean v4, p0, Lc/a/a/a/g2/l$b;->d:Z

    iget-boolean v5, p0, Lc/a/a/a/g2/l$b;->e:Z

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lc/a/a/a/g2/l;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Landroid/os/HandlerThread;ZZLc/a/a/a/g2/l$a;)V

    return-object v7
.end method
