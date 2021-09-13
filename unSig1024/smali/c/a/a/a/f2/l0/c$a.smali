.class final Lc/a/a/a/f2/l0/c$a;
.super Ljava/lang/Object;
.source "FlacReader.java"

# interfaces
.implements Lc/a/a/a/f2/l0/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/f2/l0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private a:Lc/a/a/a/f2/s;

.field private b:Lc/a/a/a/f2/s$a;

.field private c:J

.field private d:J


# direct methods
.method public constructor <init>(Lc/a/a/a/f2/s;Lc/a/a/a/f2/s$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/f2/l0/c$a;->a:Lc/a/a/a/f2/s;

    .line 3
    iput-object p2, p0, Lc/a/a/a/f2/l0/c$a;->b:Lc/a/a/a/f2/s$a;

    const-wide/16 p1, -0x1

    .line 4
    iput-wide p1, p0, Lc/a/a/a/f2/l0/c$a;->c:J

    .line 5
    iput-wide p1, p0, Lc/a/a/a/f2/l0/c$a;->d:J

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/a/f2/k;)J
    .locals 6

    .line 1
    iget-wide v0, p0, Lc/a/a/a/f2/l0/c$a;->d:J

    const-wide/16 v2, -0x1

    const-wide/16 v4, 0x0

    cmp-long p1, v0, v4

    if-ltz p1, :cond_0

    const-wide/16 v4, 0x2

    add-long/2addr v0, v4

    neg-long v0, v0

    .line 2
    iput-wide v2, p0, Lc/a/a/a/f2/l0/c$a;->d:J

    return-wide v0

    :cond_0
    return-wide v2
.end method

.method public b()Lc/a/a/a/f2/y;
    .locals 5

    .line 1
    iget-wide v0, p0, Lc/a/a/a/f2/l0/c$a;->c:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    new-instance v0, Lc/a/a/a/f2/r;

    iget-object v1, p0, Lc/a/a/a/f2/l0/c$a;->a:Lc/a/a/a/f2/s;

    iget-wide v2, p0, Lc/a/a/a/f2/l0/c$a;->c:J

    invoke-direct {v0, v1, v2, v3}, Lc/a/a/a/f2/r;-><init>(Lc/a/a/a/f2/s;J)V

    return-object v0
.end method

.method public c(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/l0/c$a;->b:Lc/a/a/a/f2/s$a;

    iget-object v0, v0, Lc/a/a/a/f2/s$a;->a:[J

    const/4 v1, 0x1

    .line 2
    invoke-static {v0, p1, p2, v1, v1}, Lc/a/a/a/m2/m0;->h([JJZZ)I

    move-result p1

    .line 3
    aget-wide p1, v0, p1

    iput-wide p1, p0, Lc/a/a/a/f2/l0/c$a;->d:J

    return-void
.end method

.method public d(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lc/a/a/a/f2/l0/c$a;->c:J

    return-void
.end method
