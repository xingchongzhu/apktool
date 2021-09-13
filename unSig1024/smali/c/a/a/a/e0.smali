.class final Lc/a/a/a/e0;
.super Ljava/lang/Object;
.source "AudioBecomingNoisyManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/e0$a;,
        Lc/a/a/a/e0$b;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lc/a/a/a/e0$a;

.field private c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lc/a/a/a/e0$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/e0;->a:Landroid/content/Context;

    .line 3
    new-instance p1, Lc/a/a/a/e0$a;

    invoke-direct {p1, p0, p2, p3}, Lc/a/a/a/e0$a;-><init>(Lc/a/a/a/e0;Landroid/os/Handler;Lc/a/a/a/e0$b;)V

    iput-object p1, p0, Lc/a/a/a/e0;->b:Lc/a/a/a/e0$a;

    return-void
.end method

.method static synthetic a(Lc/a/a/a/e0;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lc/a/a/a/e0;->c:Z

    return p0
.end method


# virtual methods
.method public b(Z)V
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/e0;->c:Z

    if-nez v0, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/e0;->a:Landroid/content/Context;

    iget-object v0, p0, Lc/a/a/a/e0;->b:Lc/a/a/a/e0$a;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.media.AUDIO_BECOMING_NOISY"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lc/a/a/a/e0;->c:Z

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 4
    iget-boolean p1, p0, Lc/a/a/a/e0;->c:Z

    if-eqz p1, :cond_1

    .line 5
    iget-object p1, p0, Lc/a/a/a/e0;->a:Landroid/content/Context;

    iget-object v0, p0, Lc/a/a/a/e0;->b:Lc/a/a/a/e0$a;

    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lc/a/a/a/e0;->c:Z

    :cond_1
    :goto_0
    return-void
.end method
