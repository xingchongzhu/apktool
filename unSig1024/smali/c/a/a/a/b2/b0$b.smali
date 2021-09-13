.class final Lc/a/a/a/b2/b0$b;
.super Ljava/lang/Object;
.source "MediaCodecAudioRenderer.java"

# interfaces
.implements Lc/a/a/a/b2/s$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/b2/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lc/a/a/a/b2/b0;


# direct methods
.method private constructor <init>(Lc/a/a/a/b2/b0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/b2/b0$b;->a:Lc/a/a/a/b2/b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lc/a/a/a/b2/b0;Lc/a/a/a/b2/b0$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lc/a/a/a/b2/b0$b;-><init>(Lc/a/a/a/b2/b0;)V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/b0$b;->a:Lc/a/a/a/b2/b0;

    invoke-static {v0}, Lc/a/a/a/b2/b0;->o1(Lc/a/a/a/b2/b0;)Lc/a/a/a/b2/r$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/a/a/a/b2/r$a;->z(Z)V

    return-void
.end method

.method public b(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/b0$b;->a:Lc/a/a/a/b2/b0;

    invoke-static {v0}, Lc/a/a/a/b2/b0;->o1(Lc/a/a/a/b2/b0;)Lc/a/a/a/b2/r$a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lc/a/a/a/b2/r$a;->y(J)V

    return-void
.end method

.method public c(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/b0$b;->a:Lc/a/a/a/b2/b0;

    invoke-static {v0}, Lc/a/a/a/b2/b0;->p1(Lc/a/a/a/b2/b0;)Lc/a/a/a/p1$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/a/a/a/b2/b0$b;->a:Lc/a/a/a/b2/b0;

    invoke-static {v0}, Lc/a/a/a/b2/b0;->p1(Lc/a/a/a/b2/b0;)Lc/a/a/a/p1$a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lc/a/a/a/p1$a;->a(J)V

    :cond_0
    return-void
.end method

.method public d(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/b0$b;->a:Lc/a/a/a/b2/b0;

    invoke-static {v0}, Lc/a/a/a/b2/b0;->o1(Lc/a/a/a/b2/b0;)Lc/a/a/a/b2/r$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/a/a/a/b2/r$a;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/b0$b;->a:Lc/a/a/a/b2/b0;

    invoke-virtual {v0}, Lc/a/a/a/b2/b0;->v1()V

    return-void
.end method

.method public f(IJJ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/b0$b;->a:Lc/a/a/a/b2/b0;

    invoke-static {v0}, Lc/a/a/a/b2/b0;->o1(Lc/a/a/a/b2/b0;)Lc/a/a/a/b2/r$a;

    move-result-object v1

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Lc/a/a/a/b2/r$a;->A(IJJ)V

    return-void
.end method
