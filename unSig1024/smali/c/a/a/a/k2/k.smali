.class public abstract Lc/a/a/a/k2/k;
.super Lc/a/a/a/c2/h;
.source "SubtitleOutputBuffer.java"

# interfaces
.implements Lc/a/a/a/k2/f;


# instance fields
.field private d:Lc/a/a/a/k2/f;

.field private e:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/a/a/a/c2/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)I
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/k;->d:Lc/a/a/a/k2/f;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/k2/f;

    iget-wide v1, p0, Lc/a/a/a/k2/k;->e:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lc/a/a/a/k2/f;->a(J)I

    move-result p1

    return p1
.end method

.method public b(I)J
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/k;->d:Lc/a/a/a/k2/f;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/k2/f;

    invoke-interface {v0, p1}, Lc/a/a/a/k2/f;->b(I)J

    move-result-wide v0

    iget-wide v2, p0, Lc/a/a/a/k2/k;->e:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public c(J)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lc/a/a/a/k2/c;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/k;->d:Lc/a/a/a/k2/f;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/k2/f;

    iget-wide v1, p0, Lc/a/a/a/k2/k;->e:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lc/a/a/a/k2/f;->c(J)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public d()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/k;->d:Lc/a/a/a/k2/f;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/k2/f;

    invoke-interface {v0}, Lc/a/a/a/k2/f;->d()I

    move-result v0

    return v0
.end method

.method public f()V
    .locals 1

    .line 1
    invoke-super {p0}, Lc/a/a/a/c2/a;->f()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lc/a/a/a/k2/k;->d:Lc/a/a/a/k2/f;

    return-void
.end method

.method public o(JLc/a/a/a/k2/f;J)V
    .locals 2

    .line 1
    iput-wide p1, p0, Lc/a/a/a/c2/h;->b:J

    .line 2
    iput-object p3, p0, Lc/a/a/a/k2/k;->d:Lc/a/a/a/k2/f;

    const-wide v0, 0x7fffffffffffffffL

    cmp-long p3, p4, v0

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    move-wide p1, p4

    .line 3
    :goto_0
    iput-wide p1, p0, Lc/a/a/a/k2/k;->e:J

    return-void
.end method
