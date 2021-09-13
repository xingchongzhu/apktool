.class Lc/a/a/a/f2/h0/d$a;
.super Ljava/lang/Object;
.source "StartOffsetExtractorOutput.java"

# interfaces
.implements Lc/a/a/a/f2/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/a/a/a/f2/h0/d;->f(Lc/a/a/a/f2/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc/a/a/a/f2/y;

.field final synthetic b:Lc/a/a/a/f2/h0/d;


# direct methods
.method constructor <init>(Lc/a/a/a/f2/h0/d;Lc/a/a/a/f2/y;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/f2/h0/d$a;->b:Lc/a/a/a/f2/h0/d;

    iput-object p2, p0, Lc/a/a/a/f2/h0/d$a;->a:Lc/a/a/a/f2/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public f()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/h0/d$a;->a:Lc/a/a/a/f2/y;

    invoke-interface {v0}, Lc/a/a/a/f2/y;->f()Z

    move-result v0

    return v0
.end method

.method public h(J)Lc/a/a/a/f2/y$a;
    .locals 8

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/h0/d$a;->a:Lc/a/a/a/f2/y;

    invoke-interface {v0, p1, p2}, Lc/a/a/a/f2/y;->h(J)Lc/a/a/a/f2/y$a;

    move-result-object p1

    .line 2
    new-instance p2, Lc/a/a/a/f2/y$a;

    new-instance v0, Lc/a/a/a/f2/z;

    iget-object v1, p1, Lc/a/a/a/f2/y$a;->a:Lc/a/a/a/f2/z;

    iget-wide v2, v1, Lc/a/a/a/f2/z;->b:J

    iget-wide v4, v1, Lc/a/a/a/f2/z;->c:J

    iget-object v1, p0, Lc/a/a/a/f2/h0/d$a;->b:Lc/a/a/a/f2/h0/d;

    .line 3
    invoke-static {v1}, Lc/a/a/a/f2/h0/d;->a(Lc/a/a/a/f2/h0/d;)J

    move-result-wide v6

    add-long/2addr v4, v6

    invoke-direct {v0, v2, v3, v4, v5}, Lc/a/a/a/f2/z;-><init>(JJ)V

    new-instance v1, Lc/a/a/a/f2/z;

    iget-object p1, p1, Lc/a/a/a/f2/y$a;->b:Lc/a/a/a/f2/z;

    iget-wide v2, p1, Lc/a/a/a/f2/z;->b:J

    iget-wide v4, p1, Lc/a/a/a/f2/z;->c:J

    iget-object p1, p0, Lc/a/a/a/f2/h0/d$a;->b:Lc/a/a/a/f2/h0/d;

    .line 4
    invoke-static {p1}, Lc/a/a/a/f2/h0/d;->a(Lc/a/a/a/f2/h0/d;)J

    move-result-wide v6

    add-long/2addr v4, v6

    invoke-direct {v1, v2, v3, v4, v5}, Lc/a/a/a/f2/z;-><init>(JJ)V

    invoke-direct {p2, v0, v1}, Lc/a/a/a/f2/y$a;-><init>(Lc/a/a/a/f2/z;Lc/a/a/a/f2/z;)V

    return-object p2
.end method

.method public j()J
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/h0/d$a;->a:Lc/a/a/a/f2/y;

    invoke-interface {v0}, Lc/a/a/a/f2/y;->j()J

    move-result-wide v0

    return-wide v0
.end method
