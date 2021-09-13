.class Lc/a/a/a/e2/r$c;
.super Ljava/lang/Object;
.source "DefaultDrmSessionManager.java"

# interfaces
.implements Lc/a/a/a/e2/d0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/e2/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lc/a/a/a/e2/r;


# direct methods
.method private constructor <init>(Lc/a/a/a/e2/r;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/e2/r$c;->a:Lc/a/a/a/e2/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lc/a/a/a/e2/r;Lc/a/a/a/e2/r$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lc/a/a/a/e2/r$c;-><init>(Lc/a/a/a/e2/r;)V

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/a/e2/d0;[BII[B)V
    .locals 0

    .line 1
    iget-object p1, p0, Lc/a/a/a/e2/r$c;->a:Lc/a/a/a/e2/r;

    iget-object p1, p1, Lc/a/a/a/e2/r;->y:Lc/a/a/a/e2/r$d;

    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/e2/r$d;

    invoke-virtual {p1, p3, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method
