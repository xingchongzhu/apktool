.class final Lc/a/a/a/f2/j0/c;
.super Lc/a/a/a/f2/f;
.source "ConstantBitrateSeeker.java"

# interfaces
.implements Lc/a/a/a/f2/j0/g;


# direct methods
.method public constructor <init>(JJLc/a/a/a/b2/c0$a;)V
    .locals 7

    .line 1
    iget v5, p5, Lc/a/a/a/b2/c0$a;->f:I

    iget v6, p5, Lc/a/a/a/b2/c0$a;->c:I

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    invoke-direct/range {v0 .. v6}, Lc/a/a/a/f2/f;-><init>(JJII)V

    return-void
.end method


# virtual methods
.method public d()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public g(J)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lc/a/a/a/f2/f;->b(J)J

    move-result-wide p1

    return-wide p1
.end method
