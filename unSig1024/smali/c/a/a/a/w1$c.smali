.class final Lc/a/a/a/w1$c;
.super Landroid/content/BroadcastReceiver;
.source "StreamVolumeManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/w1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lc/a/a/a/w1;


# direct methods
.method private constructor <init>(Lc/a/a/a/w1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/w1$c;->a:Lc/a/a/a/w1;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lc/a/a/a/w1;Lc/a/a/a/w1$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lc/a/a/a/w1$c;-><init>(Lc/a/a/a/w1;)V

    return-void
.end method

.method static synthetic a(Lc/a/a/a/w1;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lc/a/a/a/w1;->b(Lc/a/a/a/w1;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/a/a/a/w1$c;->a:Lc/a/a/a/w1;

    invoke-static {p1}, Lc/a/a/a/w1;->a(Lc/a/a/a/w1;)Landroid/os/Handler;

    move-result-object p1

    iget-object p2, p0, Lc/a/a/a/w1$c;->a:Lc/a/a/a/w1;

    new-instance v0, Lc/a/a/a/c0;

    invoke-direct {v0, p2}, Lc/a/a/a/c0;-><init>(Lc/a/a/a/w1;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
