.class final Lc/a/a/a/b2/y$h;
.super Ljava/lang/Object;
.source "DefaultAudioSink.java"

# interfaces
.implements Lc/a/a/a/b2/u$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/b2/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "h"
.end annotation


# instance fields
.field final synthetic a:Lc/a/a/a/b2/y;


# direct methods
.method private constructor <init>(Lc/a/a/a/b2/y;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/b2/y$h;->a:Lc/a/a/a/b2/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lc/a/a/a/b2/y;Lc/a/a/a/b2/y$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lc/a/a/a/b2/y$h;-><init>(Lc/a/a/a/b2/y;)V

    return-void
.end method


# virtual methods
.method public a(IJ)V
    .locals 10

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/y$h;->a:Lc/a/a/a/b2/y;

    invoke-static {v0}, Lc/a/a/a/b2/y;->z(Lc/a/a/a/b2/y;)Lc/a/a/a/b2/s$c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p0, Lc/a/a/a/b2/y$h;->a:Lc/a/a/a/b2/y;

    invoke-static {v2}, Lc/a/a/a/b2/y;->C(Lc/a/a/a/b2/y;)J

    move-result-wide v2

    sub-long v8, v0, v2

    .line 3
    iget-object v0, p0, Lc/a/a/a/b2/y$h;->a:Lc/a/a/a/b2/y;

    invoke-static {v0}, Lc/a/a/a/b2/y;->z(Lc/a/a/a/b2/y;)Lc/a/a/a/b2/s$c;

    move-result-object v4

    move v5, p1

    move-wide v6, p2

    invoke-interface/range {v4 .. v9}, Lc/a/a/a/b2/s$c;->f(IJJ)V

    :cond_0
    return-void
.end method

.method public b(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/y$h;->a:Lc/a/a/a/b2/y;

    invoke-static {v0}, Lc/a/a/a/b2/y;->z(Lc/a/a/a/b2/y;)Lc/a/a/a/b2/s$c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/a/a/a/b2/y$h;->a:Lc/a/a/a/b2/y;

    invoke-static {v0}, Lc/a/a/a/b2/y;->z(Lc/a/a/a/b2/y;)Lc/a/a/a/b2/s$c;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lc/a/a/a/b2/s$c;->b(J)V

    :cond_0
    return-void
.end method

.method public c(JJJJ)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Spurious audio timestamp (frame position mismatch): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5, p6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p7, p8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lc/a/a/a/b2/y$h;->a:Lc/a/a/a/b2/y;

    .line 2
    invoke-static {p2}, Lc/a/a/a/b2/y;->A(Lc/a/a/a/b2/y;)J

    move-result-wide p2

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lc/a/a/a/b2/y$h;->a:Lc/a/a/a/b2/y;

    .line 3
    invoke-static {p1}, Lc/a/a/a/b2/y;->B(Lc/a/a/a/b2/y;)J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 4
    sget-boolean p2, Lc/a/a/a/b2/y;->a:Z

    if-nez p2, :cond_0

    const-string p2, "DefaultAudioSink"

    .line 5
    invoke-static {p2, p1}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 6
    :cond_0
    new-instance p2, Lc/a/a/a/b2/y$e;

    const/4 p3, 0x0

    invoke-direct {p2, p1, p3}, Lc/a/a/a/b2/y$e;-><init>(Ljava/lang/String;Lc/a/a/a/b2/y$a;)V

    throw p2
.end method

.method public d(JJJJ)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Spurious audio timestamp (system clock mismatch): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5, p6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p7, p8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lc/a/a/a/b2/y$h;->a:Lc/a/a/a/b2/y;

    .line 2
    invoke-static {p2}, Lc/a/a/a/b2/y;->A(Lc/a/a/a/b2/y;)J

    move-result-wide p2

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lc/a/a/a/b2/y$h;->a:Lc/a/a/a/b2/y;

    .line 3
    invoke-static {p1}, Lc/a/a/a/b2/y;->B(Lc/a/a/a/b2/y;)J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 4
    sget-boolean p2, Lc/a/a/a/b2/y;->a:Z

    if-nez p2, :cond_0

    const-string p2, "DefaultAudioSink"

    .line 5
    invoke-static {p2, p1}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 6
    :cond_0
    new-instance p2, Lc/a/a/a/b2/y$e;

    const/4 p3, 0x0

    invoke-direct {p2, p1, p3}, Lc/a/a/a/b2/y$e;-><init>(Ljava/lang/String;Lc/a/a/a/b2/y$a;)V

    throw p2
.end method

.method public e(J)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Ignoring impossibly large audio latency: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "DefaultAudioSink"

    invoke-static {p2, p1}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
