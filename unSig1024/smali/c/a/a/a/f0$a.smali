.class Lc/a/a/a/f0$a;
.super Ljava/lang/Object;
.source "AudioFocusManager.java"

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/os/Handler;

.field final synthetic b:Lc/a/a/a/f0;


# direct methods
.method public constructor <init>(Lc/a/a/a/f0;Landroid/os/Handler;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/f0$a;->b:Lc/a/a/a/f0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lc/a/a/a/f0$a;->a:Landroid/os/Handler;

    return-void
.end method

.method private synthetic a(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/f0$a;->b:Lc/a/a/a/f0;

    invoke-static {v0, p1}, Lc/a/a/a/f0;->d(Lc/a/a/a/f0;I)V

    return-void
.end method


# virtual methods
.method public synthetic b(I)V
    .locals 0

    invoke-direct {p0, p1}, Lc/a/a/a/f0$a;->a(I)V

    return-void
.end method

.method public onAudioFocusChange(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/f0$a;->a:Landroid/os/Handler;

    new-instance v1, Lc/a/a/a/b;

    invoke-direct {v1, p0, p1}, Lc/a/a/a/b;-><init>(Lc/a/a/a/f0$a;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
