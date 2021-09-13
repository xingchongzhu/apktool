.class public Lc/a/a/a/k0;
.super Ljava/lang/Object;
.source "DefaultControlDispatcher.java"

# interfaces
.implements Lc/a/a/a/j0;


# instance fields
.field private final a:Lc/a/a/a/x1$c;

.field private b:J

.field private c:J


# direct methods
.method public constructor <init>()V
    .locals 4

    const-wide/16 v0, 0x3a98

    const-wide/16 v2, 0x1388

    .line 1
    invoke-direct {p0, v0, v1, v2, v3}, Lc/a/a/a/k0;-><init>(JJ)V

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lc/a/a/a/k0;->c:J

    .line 4
    iput-wide p3, p0, Lc/a/a/a/k0;->b:J

    .line 5
    new-instance p1, Lc/a/a/a/x1$c;

    invoke-direct {p1}, Lc/a/a/a/x1$c;-><init>()V

    iput-object p1, p0, Lc/a/a/a/k0;->a:Lc/a/a/a/x1$c;

    return-void
.end method

.method private static l(Lc/a/a/a/l1;J)V
    .locals 5

    .line 1
    invoke-interface {p0}, Lc/a/a/a/l1;->W()J

    move-result-wide v0

    add-long/2addr v0, p1

    .line 2
    invoke-interface {p0}, Lc/a/a/a/l1;->L()J

    move-result-wide p1

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, p1, v2

    if-eqz v4, :cond_0

    .line 3
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    :cond_0
    const-wide/16 p1, 0x0

    .line 4
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    .line 5
    invoke-interface {p0}, Lc/a/a/a/l1;->R()I

    move-result v0

    invoke-interface {p0, v0, p1, p2}, Lc/a/a/a/l1;->k(IJ)V

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/a/l1;I)Z
    .locals 0

    .line 1
    invoke-interface {p1, p2}, Lc/a/a/a/l1;->A(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public b(Lc/a/a/a/l1;Z)Z
    .locals 0

    .line 1
    invoke-interface {p1, p2}, Lc/a/a/a/l1;->p(Z)V

    const/4 p1, 0x1

    return p1
.end method

.method public c(Lc/a/a/a/l1;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/k0;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lc/a/a/a/l1;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-wide v0, p0, Lc/a/a/a/k0;->c:J

    invoke-static {p1, v0, v1}, Lc/a/a/a/k0;->l(Lc/a/a/a/l1;J)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public d(Lc/a/a/a/l1;)Z
    .locals 0

    .line 1
    invoke-interface {p1}, Lc/a/a/a/l1;->d()V

    const/4 p1, 0x1

    return p1
.end method

.method public e(Lc/a/a/a/l1;)Z
    .locals 9

    .line 1
    invoke-interface {p1}, Lc/a/a/a/l1;->M()Lc/a/a/a/x1;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lc/a/a/a/x1;->q()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_4

    invoke-interface {p1}, Lc/a/a/a/l1;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    invoke-interface {p1}, Lc/a/a/a/l1;->R()I

    move-result v1

    .line 4
    iget-object v3, p0, Lc/a/a/a/k0;->a:Lc/a/a/a/x1$c;

    invoke-virtual {v0, v1, v3}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    .line 5
    invoke-interface {p1}, Lc/a/a/a/l1;->l()I

    move-result v0

    .line 6
    iget-object v3, p0, Lc/a/a/a/k0;->a:Lc/a/a/a/x1$c;

    invoke-virtual {v3}, Lc/a/a/a/x1$c;->f()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lc/a/a/a/k0;->a:Lc/a/a/a/x1$c;

    iget-boolean v3, v3, Lc/a/a/a/x1$c;->j:Z

    if-nez v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    const/4 v4, -0x1

    if-eq v0, v4, :cond_3

    .line 7
    invoke-interface {p1}, Lc/a/a/a/l1;->W()J

    move-result-wide v4

    const-wide/16 v6, 0xbb8

    cmp-long v8, v4, v6

    if-lez v8, :cond_2

    if-eqz v3, :cond_3

    :cond_2
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    invoke-interface {p1, v0, v3, v4}, Lc/a/a/a/l1;->k(IJ)V

    goto :goto_1

    :cond_3
    if-nez v3, :cond_4

    const-wide/16 v3, 0x0

    .line 9
    invoke-interface {p1, v1, v3, v4}, Lc/a/a/a/l1;->k(IJ)V

    :cond_4
    :goto_1
    return v2
.end method

.method public f()Z
    .locals 5

    .line 1
    iget-wide v0, p0, Lc/a/a/a/k0;->b:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public g(Lc/a/a/a/l1;)Z
    .locals 6

    .line 1
    invoke-interface {p1}, Lc/a/a/a/l1;->M()Lc/a/a/a/x1;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lc/a/a/a/x1;->q()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_2

    invoke-interface {p1}, Lc/a/a/a/l1;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1}, Lc/a/a/a/l1;->R()I

    move-result v1

    .line 4
    iget-object v3, p0, Lc/a/a/a/k0;->a:Lc/a/a/a/x1$c;

    invoke-virtual {v0, v1, v3}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    .line 5
    invoke-interface {p1}, Lc/a/a/a/l1;->B()I

    move-result v0

    const/4 v3, -0x1

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    if-eq v0, v3, :cond_1

    .line 6
    invoke-interface {p1, v0, v4, v5}, Lc/a/a/a/l1;->k(IJ)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object v0, p0, Lc/a/a/a/k0;->a:Lc/a/a/a/x1$c;

    invoke-virtual {v0}, Lc/a/a/a/x1$c;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lc/a/a/a/k0;->a:Lc/a/a/a/x1$c;

    iget-boolean v0, v0, Lc/a/a/a/x1$c;->k:Z

    if-eqz v0, :cond_2

    .line 8
    invoke-interface {p1, v1, v4, v5}, Lc/a/a/a/l1;->k(IJ)V

    :cond_2
    :goto_0
    return v2
.end method

.method public h(Lc/a/a/a/l1;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/k0;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lc/a/a/a/l1;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-wide v0, p0, Lc/a/a/a/k0;->b:J

    neg-long v0, v0

    invoke-static {p1, v0, v1}, Lc/a/a/a/k0;->l(Lc/a/a/a/l1;J)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public i()Z
    .locals 5

    .line 1
    iget-wide v0, p0, Lc/a/a/a/k0;->c:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j(Lc/a/a/a/l1;Z)Z
    .locals 0

    .line 1
    invoke-interface {p1, p2}, Lc/a/a/a/l1;->f(Z)V

    const/4 p1, 0x1

    return p1
.end method

.method public k(Lc/a/a/a/l1;IJ)Z
    .locals 0

    .line 1
    invoke-interface {p1, p2, p3, p4}, Lc/a/a/a/l1;->k(IJ)V

    const/4 p1, 0x1

    return p1
.end method

.method public m(J)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-wide p1, p0, Lc/a/a/a/k0;->c:J

    return-void
.end method

.method public n(J)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-wide p1, p0, Lc/a/a/a/k0;->b:J

    return-void
.end method
