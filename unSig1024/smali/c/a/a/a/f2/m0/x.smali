.class public final Lc/a/a/a/f2/m0/x;
.super Ljava/lang/Object;
.source "PassthroughSectionPayloadReader.java"

# interfaces
.implements Lc/a/a/a/f2/m0/c0;


# instance fields
.field private a:Lc/a/a/a/u0;

.field private b:Lc/a/a/a/m2/j0;

.field private c:Lc/a/a/a/f2/b0;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lc/a/a/a/u0$b;

    invoke-direct {v0}, Lc/a/a/a/u0$b;-><init>()V

    invoke-virtual {v0, p1}, Lc/a/a/a/u0$b;->e0(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object p1

    invoke-virtual {p1}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/f2/m0/x;->a:Lc/a/a/a/u0;

    return-void
.end method

.method private a()V
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "timestampAdjuster",
            "output"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/m0/x;->b:Lc/a/a/a/m2/j0;

    invoke-static {v0}, Lc/a/a/a/m2/f;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/m0/x;->c:Lc/a/a/a/f2/b0;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b(Lc/a/a/a/m2/j0;Lc/a/a/a/f2/l;Lc/a/a/a/f2/m0/i0$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/f2/m0/x;->b:Lc/a/a/a/m2/j0;

    .line 2
    invoke-virtual {p3}, Lc/a/a/a/f2/m0/i0$d;->a()V

    .line 3
    invoke-virtual {p3}, Lc/a/a/a/f2/m0/i0$d;->c()I

    move-result p1

    const/4 p3, 0x5

    invoke-interface {p2, p1, p3}, Lc/a/a/a/f2/l;->q(II)Lc/a/a/a/f2/b0;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/f2/m0/x;->c:Lc/a/a/a/f2/b0;

    .line 4
    iget-object p2, p0, Lc/a/a/a/f2/m0/x;->a:Lc/a/a/a/u0;

    invoke-interface {p1, p2}, Lc/a/a/a/f2/b0;->d(Lc/a/a/a/u0;)V

    return-void
.end method

.method public c(Lc/a/a/a/m2/a0;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Lc/a/a/a/f2/m0/x;->a()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/m0/x;->b:Lc/a/a/a/m2/j0;

    invoke-virtual {v0}, Lc/a/a/a/m2/j0;->e()J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v2, p0, Lc/a/a/a/f2/m0/x;->a:Lc/a/a/a/u0;

    iget-wide v3, v2, Lc/a/a/a/u0;->p:J

    cmp-long v5, v0, v3

    if-eqz v5, :cond_1

    .line 4
    invoke-virtual {v2}, Lc/a/a/a/u0;->l()Lc/a/a/a/u0$b;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lc/a/a/a/u0$b;->i0(J)Lc/a/a/a/u0$b;

    move-result-object v0

    invoke-virtual {v0}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/f2/m0/x;->a:Lc/a/a/a/u0;

    .line 5
    iget-object v1, p0, Lc/a/a/a/f2/m0/x;->c:Lc/a/a/a/f2/b0;

    invoke-interface {v1, v0}, Lc/a/a/a/f2/b0;->d(Lc/a/a/a/u0;)V

    .line 6
    :cond_1
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->a()I

    move-result v6

    .line 7
    iget-object v0, p0, Lc/a/a/a/f2/m0/x;->c:Lc/a/a/a/f2/b0;

    invoke-interface {v0, p1, v6}, Lc/a/a/a/f2/b0;->a(Lc/a/a/a/m2/a0;I)V

    .line 8
    iget-object v2, p0, Lc/a/a/a/f2/m0/x;->c:Lc/a/a/a/f2/b0;

    iget-object p1, p0, Lc/a/a/a/f2/m0/x;->b:Lc/a/a/a/m2/j0;

    .line 9
    invoke-virtual {p1}, Lc/a/a/a/m2/j0;->d()J

    move-result-wide v3

    const/4 v5, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 10
    invoke-interface/range {v2 .. v8}, Lc/a/a/a/f2/b0;->c(JIIILc/a/a/a/f2/b0$a;)V

    return-void
.end method
