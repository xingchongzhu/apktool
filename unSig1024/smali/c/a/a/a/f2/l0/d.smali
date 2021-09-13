.class public Lc/a/a/a/f2/l0/d;
.super Ljava/lang/Object;
.source "OggExtractor.java"

# interfaces
.implements Lc/a/a/a/f2/j;


# static fields
.field public static final a:Lc/a/a/a/f2/o;


# instance fields
.field private b:Lc/a/a/a/f2/l;

.field private c:Lc/a/a/a/f2/l0/i;

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lc/a/a/a/f2/l0/a;->b:Lc/a/a/a/f2/l0/a;

    sput-object v0, Lc/a/a/a/f2/l0/d;->a:Lc/a/a/a/f2/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic d()[Lc/a/a/a/f2/j;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lc/a/a/a/f2/j;

    .line 1
    new-instance v1, Lc/a/a/a/f2/l0/d;

    invoke-direct {v1}, Lc/a/a/a/f2/l0/d;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method private static f(Lc/a/a/a/m2/a0;)Lc/a/a/a/m2/a0;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lc/a/a/a/m2/a0;->P(I)V

    return-object p0
.end method

.method private g(Lc/a/a/a/f2/k;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "streamReader"
        }
        result = true
    .end annotation

    .line 1
    new-instance v0, Lc/a/a/a/f2/l0/f;

    invoke-direct {v0}, Lc/a/a/a/f2/l0/f;-><init>()V

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, p1, v1}, Lc/a/a/a/f2/l0/f;->b(Lc/a/a/a/f2/k;Z)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    iget v2, v0, Lc/a/a/a/f2/l0/f;->b:I

    const/4 v4, 0x2

    and-int/2addr v2, v4

    if-eq v2, v4, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    iget v0, v0, Lc/a/a/a/f2/l0/f;->i:I

    const/16 v2, 0x8

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 4
    new-instance v2, Lc/a/a/a/m2/a0;

    invoke-direct {v2, v0}, Lc/a/a/a/m2/a0;-><init>(I)V

    .line 5
    invoke-virtual {v2}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v4

    invoke-interface {p1, v4, v3, v0}, Lc/a/a/a/f2/k;->o([BII)V

    .line 6
    invoke-static {v2}, Lc/a/a/a/f2/l0/d;->f(Lc/a/a/a/m2/a0;)Lc/a/a/a/m2/a0;

    move-result-object p1

    invoke-static {p1}, Lc/a/a/a/f2/l0/c;->p(Lc/a/a/a/m2/a0;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 7
    new-instance p1, Lc/a/a/a/f2/l0/c;

    invoke-direct {p1}, Lc/a/a/a/f2/l0/c;-><init>()V

    iput-object p1, p0, Lc/a/a/a/f2/l0/d;->c:Lc/a/a/a/f2/l0/i;

    goto :goto_0

    .line 8
    :cond_1
    invoke-static {v2}, Lc/a/a/a/f2/l0/d;->f(Lc/a/a/a/m2/a0;)Lc/a/a/a/m2/a0;

    move-result-object p1

    invoke-static {p1}, Lc/a/a/a/f2/l0/j;->r(Lc/a/a/a/m2/a0;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 9
    new-instance p1, Lc/a/a/a/f2/l0/j;

    invoke-direct {p1}, Lc/a/a/a/f2/l0/j;-><init>()V

    iput-object p1, p0, Lc/a/a/a/f2/l0/d;->c:Lc/a/a/a/f2/l0/i;

    goto :goto_0

    .line 10
    :cond_2
    invoke-static {v2}, Lc/a/a/a/f2/l0/d;->f(Lc/a/a/a/m2/a0;)Lc/a/a/a/m2/a0;

    move-result-object p1

    invoke-static {p1}, Lc/a/a/a/f2/l0/h;->o(Lc/a/a/a/m2/a0;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 11
    new-instance p1, Lc/a/a/a/f2/l0/h;

    invoke-direct {p1}, Lc/a/a/a/f2/l0/h;-><init>()V

    iput-object p1, p0, Lc/a/a/a/f2/l0/d;->c:Lc/a/a/a/f2/l0/i;

    :goto_0
    return v1

    :cond_3
    :goto_1
    return v3
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(Lc/a/a/a/f2/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/f2/l0/d;->b:Lc/a/a/a/f2/l;

    return-void
.end method

.method public c(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/l0/d;->c:Lc/a/a/a/f2/l0/i;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1, p2, p3, p4}, Lc/a/a/a/f2/l0/i;->m(JJ)V

    :cond_0
    return-void
.end method

.method public e(Lc/a/a/a/f2/k;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Lc/a/a/a/f2/l0/d;->g(Lc/a/a/a/f2/k;)Z

    move-result p1
    :try_end_0
    .catch Lc/a/a/a/g1; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method public i(Lc/a/a/a/f2/k;Lc/a/a/a/f2/x;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/l0/d;->b:Lc/a/a/a/f2/l;

    invoke-static {v0}, Lc/a/a/a/m2/f;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/l0/d;->c:Lc/a/a/a/f2/l0/i;

    if-nez v0, :cond_1

    .line 3
    invoke-direct {p0, p1}, Lc/a/a/a/f2/l0/d;->g(Lc/a/a/a/f2/k;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {p1}, Lc/a/a/a/f2/k;->h()V

    goto :goto_0

    .line 5
    :cond_0
    new-instance p1, Lc/a/a/a/g1;

    const-string p2, "Failed to determine bitstream type"

    invoke-direct {p1, p2}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1

    .line 6
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lc/a/a/a/f2/l0/d;->d:Z

    if-nez v0, :cond_2

    .line 7
    iget-object v0, p0, Lc/a/a/a/f2/l0/d;->b:Lc/a/a/a/f2/l;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lc/a/a/a/f2/l;->q(II)Lc/a/a/a/f2/b0;

    move-result-object v0

    .line 8
    iget-object v1, p0, Lc/a/a/a/f2/l0/d;->b:Lc/a/a/a/f2/l;

    invoke-interface {v1}, Lc/a/a/a/f2/l;->h()V

    .line 9
    iget-object v1, p0, Lc/a/a/a/f2/l0/d;->c:Lc/a/a/a/f2/l0/i;

    iget-object v3, p0, Lc/a/a/a/f2/l0/d;->b:Lc/a/a/a/f2/l;

    invoke-virtual {v1, v3, v0}, Lc/a/a/a/f2/l0/i;->d(Lc/a/a/a/f2/l;Lc/a/a/a/f2/b0;)V

    .line 10
    iput-boolean v2, p0, Lc/a/a/a/f2/l0/d;->d:Z

    .line 11
    :cond_2
    iget-object v0, p0, Lc/a/a/a/f2/l0/d;->c:Lc/a/a/a/f2/l0/i;

    invoke-virtual {v0, p1, p2}, Lc/a/a/a/f2/l0/i;->g(Lc/a/a/a/f2/k;Lc/a/a/a/f2/x;)I

    move-result p1

    return p1
.end method
