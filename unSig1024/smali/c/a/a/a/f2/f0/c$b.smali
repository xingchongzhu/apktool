.class final Lc/a/a/a/f2/f0/c$b;
.super Ljava/lang/Object;
.source "FlacBinarySearchSeeker.java"

# interfaces
.implements Lc/a/a/a/f2/b$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/f2/f0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Lc/a/a/a/f2/s;

.field private final b:I

.field private final c:Lc/a/a/a/f2/p$a;


# direct methods
.method private constructor <init>(Lc/a/a/a/f2/s;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lc/a/a/a/f2/f0/c$b;->a:Lc/a/a/a/f2/s;

    .line 4
    iput p2, p0, Lc/a/a/a/f2/f0/c$b;->b:I

    .line 5
    new-instance p1, Lc/a/a/a/f2/p$a;

    invoke-direct {p1}, Lc/a/a/a/f2/p$a;-><init>()V

    iput-object p1, p0, Lc/a/a/a/f2/f0/c$b;->c:Lc/a/a/a/f2/p$a;

    return-void
.end method

.method synthetic constructor <init>(Lc/a/a/a/f2/s;ILc/a/a/a/f2/f0/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/f2/f0/c$b;-><init>(Lc/a/a/a/f2/s;I)V

    return-void
.end method

.method private c(Lc/a/a/a/f2/k;)J
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :goto_0
    invoke-interface {p1}, Lc/a/a/a/f2/k;->n()J

    move-result-wide v0

    invoke-interface {p1}, Lc/a/a/a/f2/k;->a()J

    move-result-wide v2

    const-wide/16 v4, 0x6

    sub-long/2addr v2, v4

    cmp-long v6, v0, v2

    if-gez v6, :cond_0

    iget-object v0, p0, Lc/a/a/a/f2/f0/c$b;->a:Lc/a/a/a/f2/s;

    iget v1, p0, Lc/a/a/a/f2/f0/c$b;->b:I

    iget-object v2, p0, Lc/a/a/a/f2/f0/c$b;->c:Lc/a/a/a/f2/p$a;

    .line 2
    invoke-static {p1, v0, v1, v2}, Lc/a/a/a/f2/p;->h(Lc/a/a/a/f2/k;Lc/a/a/a/f2/s;ILc/a/a/a/f2/p$a;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 3
    invoke-interface {p1, v0}, Lc/a/a/a/f2/k;->p(I)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {p1}, Lc/a/a/a/f2/k;->n()J

    move-result-wide v0

    invoke-interface {p1}, Lc/a/a/a/f2/k;->a()J

    move-result-wide v2

    sub-long/2addr v2, v4

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    .line 5
    invoke-interface {p1}, Lc/a/a/a/f2/k;->a()J

    move-result-wide v0

    invoke-interface {p1}, Lc/a/a/a/f2/k;->n()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v1, v0

    invoke-interface {p1, v1}, Lc/a/a/a/f2/k;->p(I)V

    .line 6
    iget-object p1, p0, Lc/a/a/a/f2/f0/c$b;->a:Lc/a/a/a/f2/s;

    iget-wide v0, p1, Lc/a/a/a/f2/s;->j:J

    return-wide v0

    .line 7
    :cond_1
    iget-object p1, p0, Lc/a/a/a/f2/f0/c$b;->c:Lc/a/a/a/f2/p$a;

    iget-wide v0, p1, Lc/a/a/a/f2/p$a;->a:J

    return-wide v0
.end method


# virtual methods
.method public synthetic a()V
    .locals 0

    invoke-static {p0}, Lc/a/a/a/f2/c;->a(Lc/a/a/a/f2/b$f;)V

    return-void
.end method

.method public b(Lc/a/a/a/f2/k;J)Lc/a/a/a/f2/b$e;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v0

    .line 2
    invoke-direct {p0, p1}, Lc/a/a/a/f2/f0/c$b;->c(Lc/a/a/a/f2/k;)J

    move-result-wide v2

    .line 3
    invoke-interface {p1}, Lc/a/a/a/f2/k;->n()J

    move-result-wide v4

    .line 4
    iget-object v6, p0, Lc/a/a/a/f2/f0/c$b;->a:Lc/a/a/a/f2/s;

    iget v6, v6, Lc/a/a/a/f2/s;->c:I

    const/4 v7, 0x6

    .line 5
    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 6
    invoke-interface {p1, v6}, Lc/a/a/a/f2/k;->p(I)V

    .line 7
    invoke-direct {p0, p1}, Lc/a/a/a/f2/f0/c$b;->c(Lc/a/a/a/f2/k;)J

    move-result-wide v6

    .line 8
    invoke-interface {p1}, Lc/a/a/a/f2/k;->n()J

    move-result-wide v8

    cmp-long p1, v2, p2

    if-gtz p1, :cond_0

    cmp-long p1, v6, p2

    if-lez p1, :cond_0

    .line 9
    invoke-static {v4, v5}, Lc/a/a/a/f2/b$e;->e(J)Lc/a/a/a/f2/b$e;

    move-result-object p1

    return-object p1

    :cond_0
    cmp-long p1, v6, p2

    if-gtz p1, :cond_1

    .line 10
    invoke-static {v6, v7, v8, v9}, Lc/a/a/a/f2/b$e;->f(JJ)Lc/a/a/a/f2/b$e;

    move-result-object p1

    return-object p1

    .line 11
    :cond_1
    invoke-static {v2, v3, v0, v1}, Lc/a/a/a/f2/b$e;->d(JJ)Lc/a/a/a/f2/b$e;

    move-result-object p1

    return-object p1
.end method
