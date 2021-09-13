.class public final Lc/a/a/a/f2/h0/a;
.super Ljava/lang/Object;
.source "JpegExtractor.java"

# interfaces
.implements Lc/a/a/a/f2/j;


# instance fields
.field private final a:Lc/a/a/a/m2/a0;

.field private b:Lc/a/a/a/f2/l;

.field private c:I

.field private d:I

.field private e:I

.field private f:J

.field private g:Lc/a/a/a/h2/n/c;

.field private h:Lc/a/a/a/f2/k;

.field private i:Lc/a/a/a/f2/h0/c;

.field private j:Lc/a/a/a/f2/k0/k;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lc/a/a/a/m2/a0;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lc/a/a/a/m2/a0;-><init>(I)V

    iput-object v0, p0, Lc/a/a/a/f2/h0/a;->a:Lc/a/a/a/m2/a0;

    const-wide/16 v0, -0x1

    .line 3
    iput-wide v0, p0, Lc/a/a/a/f2/h0/a;->f:J

    return-void
.end method

.method private d(Lc/a/a/a/f2/k;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/h0/a;->a:Lc/a/a/a/m2/a0;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lc/a/a/a/m2/a0;->L(I)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/h0/a;->a:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lc/a/a/a/f2/k;->o([BII)V

    .line 3
    iget-object v0, p0, Lc/a/a/a/f2/h0/a;->a:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->J()I

    move-result v0

    sub-int/2addr v0, v1

    .line 4
    invoke-interface {p1, v0}, Lc/a/a/a/f2/k;->p(I)V

    return-void
.end method

.method private f()V
    .locals 4

    const/4 v0, 0x0

    new-array v0, v0, [Lc/a/a/a/h2/a$b;

    .line 1
    invoke-direct {p0, v0}, Lc/a/a/a/f2/h0/a;->h([Lc/a/a/a/h2/a$b;)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/h0/a;->b:Lc/a/a/a/f2/l;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/f2/l;

    invoke-interface {v0}, Lc/a/a/a/f2/l;->h()V

    .line 3
    iget-object v0, p0, Lc/a/a/a/f2/h0/a;->b:Lc/a/a/a/f2/l;

    new-instance v1, Lc/a/a/a/f2/y$b;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v1, v2, v3}, Lc/a/a/a/f2/y$b;-><init>(J)V

    invoke-interface {v0, v1}, Lc/a/a/a/f2/l;->f(Lc/a/a/a/f2/y;)V

    const/4 v0, 0x6

    .line 4
    iput v0, p0, Lc/a/a/a/f2/h0/a;->c:I

    return-void
.end method

.method private static g(Ljava/lang/String;J)Lc/a/a/a/h2/n/c;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    const-wide/16 v1, -0x1

    cmp-long v3, p1, v1

    if-nez v3, :cond_0

    return-object v0

    .line 1
    :cond_0
    invoke-static {p0}, Lc/a/a/a/f2/h0/e;->a(Ljava/lang/String;)Lc/a/a/a/f2/h0/b;

    move-result-object p0

    if-nez p0, :cond_1

    return-object v0

    .line 2
    :cond_1
    invoke-virtual {p0, p1, p2}, Lc/a/a/a/f2/h0/b;->a(J)Lc/a/a/a/h2/n/c;

    move-result-object p0

    return-object p0
.end method

.method private varargs h([Lc/a/a/a/h2/a$b;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/h0/a;->b:Lc/a/a/a/f2/l;

    .line 2
    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/f2/l;

    const/16 v1, 0x400

    const/4 v2, 0x4

    invoke-interface {v0, v1, v2}, Lc/a/a/a/f2/l;->q(II)Lc/a/a/a/f2/b0;

    move-result-object v0

    .line 3
    new-instance v1, Lc/a/a/a/u0$b;

    invoke-direct {v1}, Lc/a/a/a/u0$b;-><init>()V

    new-instance v2, Lc/a/a/a/h2/a;

    invoke-direct {v2, p1}, Lc/a/a/a/h2/a;-><init>([Lc/a/a/a/h2/a$b;)V

    .line 4
    invoke-virtual {v1, v2}, Lc/a/a/a/u0$b;->X(Lc/a/a/a/h2/a;)Lc/a/a/a/u0$b;

    move-result-object p1

    invoke-virtual {p1}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object p1

    .line 5
    invoke-interface {v0, p1}, Lc/a/a/a/f2/b0;->d(Lc/a/a/a/u0;)V

    return-void
.end method

.method private j(Lc/a/a/a/f2/k;)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/h0/a;->a:Lc/a/a/a/m2/a0;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lc/a/a/a/m2/a0;->L(I)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/h0/a;->a:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lc/a/a/a/f2/k;->o([BII)V

    .line 3
    iget-object p1, p0, Lc/a/a/a/f2/h0/a;->a:Lc/a/a/a/m2/a0;

    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->J()I

    move-result p1

    return p1
.end method

.method private k(Lc/a/a/a/f2/k;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/h0/a;->a:Lc/a/a/a/m2/a0;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lc/a/a/a/m2/a0;->L(I)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/h0/a;->a:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lc/a/a/a/f2/k;->readFully([BII)V

    .line 3
    iget-object p1, p0, Lc/a/a/a/f2/h0/a;->a:Lc/a/a/a/m2/a0;

    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->J()I

    move-result p1

    iput p1, p0, Lc/a/a/a/f2/h0/a;->d:I

    const v0, 0xffda

    if-ne p1, v0, :cond_1

    .line 4
    iget-wide v0, p0, Lc/a/a/a/f2/h0/a;->f:J

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    .line 5
    iput p1, p0, Lc/a/a/a/f2/h0/a;->c:I

    goto :goto_0

    .line 6
    :cond_0
    invoke-direct {p0}, Lc/a/a/a/f2/h0/a;->f()V

    goto :goto_0

    :cond_1
    const v0, 0xffd0

    if-lt p1, v0, :cond_2

    const v0, 0xffd9

    if-le p1, v0, :cond_3

    :cond_2
    const v0, 0xff01

    if-eq p1, v0, :cond_3

    const/4 p1, 0x1

    .line 7
    iput p1, p0, Lc/a/a/a/f2/h0/a;->c:I

    :cond_3
    :goto_0
    return-void
.end method

.method private l(Lc/a/a/a/f2/k;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lc/a/a/a/f2/h0/a;->d:I

    const/4 v1, 0x0

    const v2, 0xffe1

    if-ne v0, v2, :cond_0

    .line 2
    new-instance v0, Lc/a/a/a/m2/a0;

    iget v2, p0, Lc/a/a/a/f2/h0/a;->e:I

    invoke-direct {v0, v2}, Lc/a/a/a/m2/a0;-><init>(I)V

    .line 3
    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v2

    iget v3, p0, Lc/a/a/a/f2/h0/a;->e:I

    invoke-interface {p1, v2, v1, v3}, Lc/a/a/a/f2/k;->readFully([BII)V

    .line 4
    iget-object v2, p0, Lc/a/a/a/f2/h0/a;->g:Lc/a/a/a/h2/n/c;

    if-nez v2, :cond_1

    .line 5
    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->x()Ljava/lang/String;

    move-result-object v2

    const-string v3, "http://ns.adobe.com/xap/1.0/"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 6
    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->x()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 7
    invoke-interface {p1}, Lc/a/a/a/f2/k;->a()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lc/a/a/a/f2/h0/a;->g(Ljava/lang/String;J)Lc/a/a/a/h2/n/c;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/f2/h0/a;->g:Lc/a/a/a/h2/n/c;

    if-eqz p1, :cond_1

    .line 8
    iget-wide v2, p1, Lc/a/a/a/h2/n/c;->d:J

    iput-wide v2, p0, Lc/a/a/a/f2/h0/a;->f:J

    goto :goto_0

    .line 9
    :cond_0
    iget v0, p0, Lc/a/a/a/f2/h0/a;->e:I

    invoke-interface {p1, v0}, Lc/a/a/a/f2/k;->i(I)V

    .line 10
    :cond_1
    :goto_0
    iput v1, p0, Lc/a/a/a/f2/h0/a;->c:I

    return-void
.end method

.method private m(Lc/a/a/a/f2/k;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/h0/a;->a:Lc/a/a/a/m2/a0;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lc/a/a/a/m2/a0;->L(I)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/h0/a;->a:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lc/a/a/a/f2/k;->readFully([BII)V

    .line 3
    iget-object p1, p0, Lc/a/a/a/f2/h0/a;->a:Lc/a/a/a/m2/a0;

    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->J()I

    move-result p1

    sub-int/2addr p1, v1

    iput p1, p0, Lc/a/a/a/f2/h0/a;->e:I

    .line 4
    iput v1, p0, Lc/a/a/a/f2/h0/a;->c:I

    return-void
.end method

.method private n(Lc/a/a/a/f2/k;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/h0/a;->a:Lc/a/a/a/m2/a0;

    .line 2
    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 3
    invoke-interface {p1, v0, v1, v2, v2}, Lc/a/a/a/f2/k;->m([BIIZ)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    invoke-direct {p0}, Lc/a/a/a/f2/h0/a;->f()V

    goto :goto_0

    .line 5
    :cond_0
    invoke-interface {p1}, Lc/a/a/a/f2/k;->h()V

    .line 6
    iget-object v0, p0, Lc/a/a/a/f2/h0/a;->j:Lc/a/a/a/f2/k0/k;

    if-nez v0, :cond_1

    .line 7
    new-instance v0, Lc/a/a/a/f2/k0/k;

    invoke-direct {v0}, Lc/a/a/a/f2/k0/k;-><init>()V

    iput-object v0, p0, Lc/a/a/a/f2/h0/a;->j:Lc/a/a/a/f2/k0/k;

    .line 8
    :cond_1
    new-instance v0, Lc/a/a/a/f2/h0/c;

    iget-wide v1, p0, Lc/a/a/a/f2/h0/a;->f:J

    invoke-direct {v0, p1, v1, v2}, Lc/a/a/a/f2/h0/c;-><init>(Lc/a/a/a/f2/k;J)V

    iput-object v0, p0, Lc/a/a/a/f2/h0/a;->i:Lc/a/a/a/f2/h0/c;

    .line 9
    iget-object p1, p0, Lc/a/a/a/f2/h0/a;->j:Lc/a/a/a/f2/k0/k;

    invoke-virtual {p1, v0}, Lc/a/a/a/f2/k0/k;->e(Lc/a/a/a/f2/k;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 10
    iget-object p1, p0, Lc/a/a/a/f2/h0/a;->j:Lc/a/a/a/f2/k0/k;

    new-instance v0, Lc/a/a/a/f2/h0/d;

    iget-wide v1, p0, Lc/a/a/a/f2/h0/a;->f:J

    iget-object v3, p0, Lc/a/a/a/f2/h0/a;->b:Lc/a/a/a/f2/l;

    .line 11
    invoke-static {v3}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/a/a/a/f2/l;

    invoke-direct {v0, v1, v2, v3}, Lc/a/a/a/f2/h0/d;-><init>(JLc/a/a/a/f2/l;)V

    .line 12
    invoke-virtual {p1, v0}, Lc/a/a/a/f2/k0/k;->b(Lc/a/a/a/f2/l;)V

    .line 13
    invoke-direct {p0}, Lc/a/a/a/f2/h0/a;->o()V

    goto :goto_0

    .line 14
    :cond_2
    invoke-direct {p0}, Lc/a/a/a/f2/h0/a;->f()V

    :goto_0
    return-void
.end method

.method private o()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lc/a/a/a/h2/a$b;

    .line 1
    iget-object v1, p0, Lc/a/a/a/f2/h0/a;->g:Lc/a/a/a/h2/n/c;

    invoke-static {v1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/h2/a$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-direct {p0, v0}, Lc/a/a/a/f2/h0/a;->h([Lc/a/a/a/h2/a$b;)V

    const/4 v0, 0x5

    .line 2
    iput v0, p0, Lc/a/a/a/f2/h0/a;->c:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/h0/a;->j:Lc/a/a/a/f2/k0/k;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lc/a/a/a/f2/k0/k;->a()V

    :cond_0
    return-void
.end method

.method public b(Lc/a/a/a/f2/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/f2/h0/a;->b:Lc/a/a/a/f2/l;

    return-void
.end method

.method public c(JJ)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    const/4 p1, 0x0

    .line 1
    iput p1, p0, Lc/a/a/a/f2/h0/a;->c:I

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lc/a/a/a/f2/h0/a;->j:Lc/a/a/a/f2/k0/k;

    goto :goto_0

    .line 3
    :cond_0
    iget v0, p0, Lc/a/a/a/f2/h0/a;->c:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    .line 4
    iget-object v0, p0, Lc/a/a/a/f2/h0/a;->j:Lc/a/a/a/f2/k0/k;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/f2/k0/k;

    invoke-virtual {v0, p1, p2, p3, p4}, Lc/a/a/a/f2/k0/k;->c(JJ)V

    :cond_1
    :goto_0
    return-void
.end method

.method public e(Lc/a/a/a/f2/k;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lc/a/a/a/f2/h0/a;->j(Lc/a/a/a/f2/k;)I

    move-result v0

    const/4 v1, 0x0

    const v2, 0xffd8

    if-eq v0, v2, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lc/a/a/a/f2/h0/a;->j(Lc/a/a/a/f2/k;)I

    move-result v0

    iput v0, p0, Lc/a/a/a/f2/h0/a;->d:I

    const v2, 0xffe0

    if-ne v0, v2, :cond_1

    .line 3
    invoke-direct {p0, p1}, Lc/a/a/a/f2/h0/a;->d(Lc/a/a/a/f2/k;)V

    .line 4
    invoke-direct {p0, p1}, Lc/a/a/a/f2/h0/a;->j(Lc/a/a/a/f2/k;)I

    move-result v0

    iput v0, p0, Lc/a/a/a/f2/h0/a;->d:I

    .line 5
    :cond_1
    iget v0, p0, Lc/a/a/a/f2/h0/a;->d:I

    const v2, 0xffe1

    if-eq v0, v2, :cond_2

    return v1

    :cond_2
    const/4 v0, 0x2

    .line 6
    invoke-interface {p1, v0}, Lc/a/a/a/f2/k;->p(I)V

    .line 7
    iget-object v0, p0, Lc/a/a/a/f2/h0/a;->a:Lc/a/a/a/m2/a0;

    const/4 v2, 0x6

    invoke-virtual {v0, v2}, Lc/a/a/a/m2/a0;->L(I)V

    .line 8
    iget-object v0, p0, Lc/a/a/a/f2/h0/a;->a:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    invoke-interface {p1, v0, v1, v2}, Lc/a/a/a/f2/k;->o([BII)V

    .line 9
    iget-object p1, p0, Lc/a/a/a/f2/h0/a;->a:Lc/a/a/a/m2/a0;

    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->F()J

    move-result-wide v2

    const-wide/32 v4, 0x45786966    # 5.758429993E-315

    cmp-long p1, v2, v4

    if-nez p1, :cond_3

    iget-object p1, p0, Lc/a/a/a/f2/h0/a;->a:Lc/a/a/a/m2/a0;

    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->J()I

    move-result p1

    if-nez p1, :cond_3

    const/4 v1, 0x1

    :cond_3
    return v1
.end method

.method public i(Lc/a/a/a/f2/k;Lc/a/a/a/f2/x;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lc/a/a/a/f2/h0/a;->c:I

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    const/4 v2, 0x1

    if-eq v0, v2, :cond_8

    const/4 v3, 0x2

    if-eq v0, v3, :cond_7

    const/4 v3, 0x4

    if-eq v0, v3, :cond_5

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 p1, 0x6

    if-ne v0, p1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 3
    :cond_1
    iget-object v0, p0, Lc/a/a/a/f2/h0/a;->i:Lc/a/a/a/f2/h0/c;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lc/a/a/a/f2/h0/a;->h:Lc/a/a/a/f2/k;

    if-eq p1, v0, :cond_3

    .line 4
    :cond_2
    iput-object p1, p0, Lc/a/a/a/f2/h0/a;->h:Lc/a/a/a/f2/k;

    .line 5
    new-instance v0, Lc/a/a/a/f2/h0/c;

    iget-wide v3, p0, Lc/a/a/a/f2/h0/a;->f:J

    invoke-direct {v0, p1, v3, v4}, Lc/a/a/a/f2/h0/c;-><init>(Lc/a/a/a/f2/k;J)V

    iput-object v0, p0, Lc/a/a/a/f2/h0/a;->i:Lc/a/a/a/f2/h0/c;

    .line 6
    :cond_3
    iget-object p1, p0, Lc/a/a/a/f2/h0/a;->j:Lc/a/a/a/f2/k0/k;

    .line 7
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/f2/k0/k;

    iget-object v0, p0, Lc/a/a/a/f2/h0/a;->i:Lc/a/a/a/f2/h0/c;

    invoke-virtual {p1, v0, p2}, Lc/a/a/a/f2/k0/k;->i(Lc/a/a/a/f2/k;Lc/a/a/a/f2/x;)I

    move-result p1

    if-ne p1, v2, :cond_4

    .line 8
    iget-wide v0, p2, Lc/a/a/a/f2/x;->a:J

    iget-wide v2, p0, Lc/a/a/a/f2/h0/a;->f:J

    add-long/2addr v0, v2

    iput-wide v0, p2, Lc/a/a/a/f2/x;->a:J

    :cond_4
    return p1

    .line 9
    :cond_5
    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v3

    iget-wide v5, p0, Lc/a/a/a/f2/h0/a;->f:J

    cmp-long v0, v3, v5

    if-eqz v0, :cond_6

    .line 10
    iput-wide v5, p2, Lc/a/a/a/f2/x;->a:J

    return v2

    .line 11
    :cond_6
    invoke-direct {p0, p1}, Lc/a/a/a/f2/h0/a;->n(Lc/a/a/a/f2/k;)V

    return v1

    .line 12
    :cond_7
    invoke-direct {p0, p1}, Lc/a/a/a/f2/h0/a;->l(Lc/a/a/a/f2/k;)V

    return v1

    .line 13
    :cond_8
    invoke-direct {p0, p1}, Lc/a/a/a/f2/h0/a;->m(Lc/a/a/a/f2/k;)V

    return v1

    .line 14
    :cond_9
    invoke-direct {p0, p1}, Lc/a/a/a/f2/h0/a;->k(Lc/a/a/a/f2/k;)V

    return v1
.end method
