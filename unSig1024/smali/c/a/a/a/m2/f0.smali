.class public final Lc/a/a/a/m2/f0;
.super Ljava/lang/Object;
.source "StandaloneMediaClock.java"

# interfaces
.implements Lc/a/a/a/m2/v;


# instance fields
.field private final a:Lc/a/a/a/m2/g;

.field private b:Z

.field private c:J

.field private d:J

.field private e:Lc/a/a/a/i1;


# direct methods
.method public constructor <init>(Lc/a/a/a/m2/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/m2/f0;->a:Lc/a/a/a/m2/g;

    .line 3
    sget-object p1, Lc/a/a/a/i1;->a:Lc/a/a/a/i1;

    iput-object p1, p0, Lc/a/a/a/m2/f0;->e:Lc/a/a/a/i1;

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lc/a/a/a/m2/f0;->c:J

    .line 2
    iget-boolean p1, p0, Lc/a/a/a/m2/f0;->b:Z

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lc/a/a/a/m2/f0;->a:Lc/a/a/a/m2/g;

    invoke-interface {p1}, Lc/a/a/a/m2/g;->c()J

    move-result-wide p1

    iput-wide p1, p0, Lc/a/a/a/m2/f0;->d:J

    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/m2/f0;->b:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/a/a/a/m2/f0;->a:Lc/a/a/a/m2/g;

    invoke-interface {v0}, Lc/a/a/a/m2/g;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lc/a/a/a/m2/f0;->d:J

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lc/a/a/a/m2/f0;->b:Z

    :cond_0
    return-void
.end method

.method public c()Lc/a/a/a/i1;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/m2/f0;->e:Lc/a/a/a/i1;

    return-object v0
.end method

.method public d()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/m2/f0;->b:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/m2/f0;->w()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lc/a/a/a/m2/f0;->a(J)V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lc/a/a/a/m2/f0;->b:Z

    :cond_0
    return-void
.end method

.method public f(Lc/a/a/a/i1;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/m2/f0;->b:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/m2/f0;->w()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lc/a/a/a/m2/f0;->a(J)V

    .line 3
    :cond_0
    iput-object p1, p0, Lc/a/a/a/m2/f0;->e:Lc/a/a/a/i1;

    return-void
.end method

.method public w()J
    .locals 7

    .line 1
    iget-wide v0, p0, Lc/a/a/a/m2/f0;->c:J

    .line 2
    iget-boolean v2, p0, Lc/a/a/a/m2/f0;->b:Z

    if-eqz v2, :cond_1

    .line 3
    iget-object v2, p0, Lc/a/a/a/m2/f0;->a:Lc/a/a/a/m2/g;

    invoke-interface {v2}, Lc/a/a/a/m2/g;->c()J

    move-result-wide v2

    iget-wide v4, p0, Lc/a/a/a/m2/f0;->d:J

    sub-long/2addr v2, v4

    .line 4
    iget-object v4, p0, Lc/a/a/a/m2/f0;->e:Lc/a/a/a/i1;

    iget v5, v4, Lc/a/a/a/i1;->b:F

    const/high16 v6, 0x3f800000    # 1.0f

    cmpl-float v5, v5, v6

    if-nez v5, :cond_0

    .line 5
    invoke-static {v2, v3}, Lc/a/a/a/i0;->c(J)J

    move-result-wide v2

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v4, v2, v3}, Lc/a/a/a/i1;->a(J)J

    move-result-wide v2

    :goto_0
    add-long/2addr v0, v2

    :cond_1
    return-wide v0
.end method
