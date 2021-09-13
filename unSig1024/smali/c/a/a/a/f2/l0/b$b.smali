.class final Lc/a/a/a/f2/l0/b$b;
.super Ljava/lang/Object;
.source "DefaultOggSeeker.java"

# interfaces
.implements Lc/a/a/a/f2/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/f2/l0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lc/a/a/a/f2/l0/b;


# direct methods
.method private constructor <init>(Lc/a/a/a/f2/l0/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/f2/l0/b$b;->a:Lc/a/a/a/f2/l0/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lc/a/a/a/f2/l0/b;Lc/a/a/a/f2/l0/b$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lc/a/a/a/f2/l0/b$b;-><init>(Lc/a/a/a/f2/l0/b;)V

    return-void
.end method


# virtual methods
.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public h(J)Lc/a/a/a/f2/y$a;
    .locals 10

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/l0/b$b;->a:Lc/a/a/a/f2/l0/b;

    invoke-static {v0}, Lc/a/a/a/f2/l0/b;->d(Lc/a/a/a/f2/l0/b;)Lc/a/a/a/f2/l0/i;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lc/a/a/a/f2/l0/i;->c(J)J

    move-result-wide v0

    .line 2
    iget-object v2, p0, Lc/a/a/a/f2/l0/b$b;->a:Lc/a/a/a/f2/l0/b;

    .line 3
    invoke-static {v2}, Lc/a/a/a/f2/l0/b;->e(Lc/a/a/a/f2/l0/b;)J

    move-result-wide v2

    iget-object v4, p0, Lc/a/a/a/f2/l0/b$b;->a:Lc/a/a/a/f2/l0/b;

    .line 4
    invoke-static {v4}, Lc/a/a/a/f2/l0/b;->f(Lc/a/a/a/f2/l0/b;)J

    move-result-wide v4

    iget-object v6, p0, Lc/a/a/a/f2/l0/b$b;->a:Lc/a/a/a/f2/l0/b;

    invoke-static {v6}, Lc/a/a/a/f2/l0/b;->e(Lc/a/a/a/f2/l0/b;)J

    move-result-wide v6

    sub-long/2addr v4, v6

    mul-long v0, v0, v4

    iget-object v4, p0, Lc/a/a/a/f2/l0/b$b;->a:Lc/a/a/a/f2/l0/b;

    invoke-static {v4}, Lc/a/a/a/f2/l0/b;->g(Lc/a/a/a/f2/l0/b;)J

    move-result-wide v4

    div-long/2addr v0, v4

    add-long/2addr v2, v0

    const-wide/16 v0, 0x7530

    sub-long v4, v2, v0

    .line 5
    iget-object v0, p0, Lc/a/a/a/f2/l0/b$b;->a:Lc/a/a/a/f2/l0/b;

    .line 6
    invoke-static {v0}, Lc/a/a/a/f2/l0/b;->e(Lc/a/a/a/f2/l0/b;)J

    move-result-wide v6

    iget-object v0, p0, Lc/a/a/a/f2/l0/b$b;->a:Lc/a/a/a/f2/l0/b;

    invoke-static {v0}, Lc/a/a/a/f2/l0/b;->f(Lc/a/a/a/f2/l0/b;)J

    move-result-wide v0

    const-wide/16 v2, 0x1

    sub-long v8, v0, v2

    invoke-static/range {v4 .. v9}, Lc/a/a/a/m2/m0;->q(JJJ)J

    move-result-wide v0

    .line 7
    new-instance v2, Lc/a/a/a/f2/y$a;

    new-instance v3, Lc/a/a/a/f2/z;

    invoke-direct {v3, p1, p2, v0, v1}, Lc/a/a/a/f2/z;-><init>(JJ)V

    invoke-direct {v2, v3}, Lc/a/a/a/f2/y$a;-><init>(Lc/a/a/a/f2/z;)V

    return-object v2
.end method

.method public j()J
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/l0/b$b;->a:Lc/a/a/a/f2/l0/b;

    invoke-static {v0}, Lc/a/a/a/f2/l0/b;->d(Lc/a/a/a/f2/l0/b;)Lc/a/a/a/f2/l0/i;

    move-result-object v0

    iget-object v1, p0, Lc/a/a/a/f2/l0/b$b;->a:Lc/a/a/a/f2/l0/b;

    invoke-static {v1}, Lc/a/a/a/f2/l0/b;->g(Lc/a/a/a/f2/l0/b;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lc/a/a/a/f2/l0/i;->b(J)J

    move-result-wide v0

    return-wide v0
.end method
