.class public final Lc/a/a/a/j2/x;
.super Ljava/lang/Object;
.source "MaskingMediaPeriod.java"

# interfaces
.implements Lc/a/a/a/j2/a0;
.implements Lc/a/a/a/j2/a0$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/j2/x$a;
    }
.end annotation


# instance fields
.field public final a:Lc/a/a/a/j2/d0$a;

.field private final b:J

.field private final c:Lcom/google/android/exoplayer2/upstream/e;

.field private d:Lc/a/a/a/j2/d0;

.field private e:Lc/a/a/a/j2/a0;

.field private f:Lc/a/a/a/j2/a0$a;

.field private g:Lc/a/a/a/j2/x$a;

.field private h:Z

.field private i:J


# direct methods
.method public constructor <init>(Lc/a/a/a/j2/d0$a;Lcom/google/android/exoplayer2/upstream/e;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/j2/x;->a:Lc/a/a/a/j2/d0$a;

    .line 3
    iput-object p2, p0, Lc/a/a/a/j2/x;->c:Lcom/google/android/exoplayer2/upstream/e;

    .line 4
    iput-wide p3, p0, Lc/a/a/a/j2/x;->b:J

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    iput-wide p1, p0, Lc/a/a/a/j2/x;->i:J

    return-void
.end method

.method private r(J)J
    .locals 5

    .line 1
    iget-wide v0, p0, Lc/a/a/a/j2/x;->i:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    move-wide p1, v0

    :cond_0
    return-wide p1
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/x;->e:Lc/a/a/a/j2/a0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc/a/a/a/j2/a0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()J
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/x;->e:Lc/a/a/a/j2/a0;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/j2/a0;

    invoke-interface {v0}, Lc/a/a/a/j2/a0;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public c()J
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/x;->e:Lc/a/a/a/j2/a0;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/j2/a0;

    invoke-interface {v0}, Lc/a/a/a/j2/a0;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public d(J)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/x;->e:Lc/a/a/a/j2/a0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lc/a/a/a/j2/a0;->d(J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public e(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/x;->e:Lc/a/a/a/j2/a0;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/j2/a0;

    invoke-interface {v0, p1, p2}, Lc/a/a/a/j2/a0;->e(J)V

    return-void
.end method

.method public g(JLc/a/a/a/u1;)J
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/x;->e:Lc/a/a/a/j2/a0;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/j2/a0;

    invoke-interface {v0, p1, p2, p3}, Lc/a/a/a/j2/a0;->g(JLc/a/a/a/u1;)J

    move-result-wide p1

    return-wide p1
.end method

.method public h(Lc/a/a/a/j2/d0$a;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lc/a/a/a/j2/x;->b:J

    invoke-direct {p0, v0, v1}, Lc/a/a/a/j2/x;->r(J)J

    move-result-wide v0

    .line 2
    iget-object v2, p0, Lc/a/a/a/j2/x;->d:Lc/a/a/a/j2/d0;

    invoke-static {v2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/a/a/a/j2/d0;

    iget-object v3, p0, Lc/a/a/a/j2/x;->c:Lcom/google/android/exoplayer2/upstream/e;

    invoke-interface {v2, p1, v3, v0, v1}, Lc/a/a/a/j2/d0;->d(Lc/a/a/a/j2/d0$a;Lcom/google/android/exoplayer2/upstream/e;J)Lc/a/a/a/j2/a0;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/j2/x;->e:Lc/a/a/a/j2/a0;

    .line 3
    iget-object v2, p0, Lc/a/a/a/j2/x;->f:Lc/a/a/a/j2/a0$a;

    if-eqz v2, :cond_0

    .line 4
    invoke-interface {p1, p0, v0, v1}, Lc/a/a/a/j2/a0;->l(Lc/a/a/a/j2/a0$a;J)V

    :cond_0
    return-void
.end method

.method public i()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/j2/x;->i:J

    return-wide v0
.end method

.method public k()J
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/x;->e:Lc/a/a/a/j2/a0;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/j2/a0;

    invoke-interface {v0}, Lc/a/a/a/j2/a0;->k()J

    move-result-wide v0

    return-wide v0
.end method

.method public l(Lc/a/a/a/j2/a0$a;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/j2/x;->f:Lc/a/a/a/j2/a0$a;

    .line 2
    iget-object p1, p0, Lc/a/a/a/j2/x;->e:Lc/a/a/a/j2/a0;

    if-eqz p1, :cond_0

    .line 3
    iget-wide p2, p0, Lc/a/a/a/j2/x;->b:J

    .line 4
    invoke-direct {p0, p2, p3}, Lc/a/a/a/j2/x;->r(J)J

    move-result-wide p2

    .line 5
    invoke-interface {p1, p0, p2, p3}, Lc/a/a/a/j2/a0;->l(Lc/a/a/a/j2/a0$a;J)V

    :cond_0
    return-void
.end method

.method public m(Lc/a/a/a/j2/a0;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/a/a/a/j2/x;->f:Lc/a/a/a/j2/a0$a;

    invoke-static {p1}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/j2/a0$a;

    invoke-interface {p1, p0}, Lc/a/a/a/j2/a0$a;->m(Lc/a/a/a/j2/a0;)V

    .line 2
    iget-object p1, p0, Lc/a/a/a/j2/x;->g:Lc/a/a/a/j2/x$a;

    if-eqz p1, :cond_0

    .line 3
    iget-object v0, p0, Lc/a/a/a/j2/x;->a:Lc/a/a/a/j2/d0$a;

    invoke-interface {p1, v0}, Lc/a/a/a/j2/x$a;->b(Lc/a/a/a/j2/d0$a;)V

    :cond_0
    return-void
.end method

.method public n([Lc/a/a/a/l2/h;[Z[Lc/a/a/a/j2/l0;[ZJ)J
    .locals 15

    move-object v0, p0

    .line 1
    iget-wide v1, v0, Lc/a/a/a/j2/x;->i:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    iget-wide v5, v0, Lc/a/a/a/j2/x;->b:J

    cmp-long v7, p5, v5

    if-nez v7, :cond_0

    .line 2
    iput-wide v3, v0, Lc/a/a/a/j2/x;->i:J

    move-wide v13, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v13, p5

    .line 3
    :goto_0
    iget-object v1, v0, Lc/a/a/a/j2/x;->e:Lc/a/a/a/j2/a0;

    invoke-static {v1}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lc/a/a/a/j2/a0;

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    .line 4
    invoke-interface/range {v8 .. v14}, Lc/a/a/a/j2/a0;->n([Lc/a/a/a/l2/h;[Z[Lc/a/a/a/j2/l0;[ZJ)J

    move-result-wide v1

    return-wide v1
.end method

.method public o()Lc/a/a/a/j2/q0;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/x;->e:Lc/a/a/a/j2/a0;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/j2/a0;

    invoke-interface {v0}, Lc/a/a/a/j2/a0;->o()Lc/a/a/a/j2/q0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p(Lc/a/a/a/j2/m0;)V
    .locals 0

    .line 1
    check-cast p1, Lc/a/a/a/j2/a0;

    invoke-virtual {p0, p1}, Lc/a/a/a/j2/x;->v(Lc/a/a/a/j2/a0;)V

    return-void
.end method

.method public q()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/j2/x;->b:J

    return-wide v0
.end method

.method public s()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lc/a/a/a/j2/x;->e:Lc/a/a/a/j2/a0;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lc/a/a/a/j2/a0;->s()V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/a/a/a/j2/x;->d:Lc/a/a/a/j2/d0;

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0}, Lc/a/a/a/j2/d0;->c()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
    iget-object v1, p0, Lc/a/a/a/j2/x;->g:Lc/a/a/a/j2/x$a;

    if-eqz v1, :cond_2

    .line 6
    iget-boolean v2, p0, Lc/a/a/a/j2/x;->h:Z

    if-nez v2, :cond_1

    const/4 v2, 0x1

    .line 7
    iput-boolean v2, p0, Lc/a/a/a/j2/x;->h:Z

    .line 8
    iget-object v2, p0, Lc/a/a/a/j2/x;->a:Lc/a/a/a/j2/d0$a;

    invoke-interface {v1, v2, v0}, Lc/a/a/a/j2/x$a;->a(Lc/a/a/a/j2/d0$a;Ljava/io/IOException;)V

    :cond_1
    :goto_0
    return-void

    .line 9
    :cond_2
    throw v0
.end method

.method public t(JZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/x;->e:Lc/a/a/a/j2/a0;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/j2/a0;

    invoke-interface {v0, p1, p2, p3}, Lc/a/a/a/j2/a0;->t(JZ)V

    return-void
.end method

.method public u(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/x;->e:Lc/a/a/a/j2/a0;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/j2/a0;

    invoke-interface {v0, p1, p2}, Lc/a/a/a/j2/a0;->u(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public v(Lc/a/a/a/j2/a0;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lc/a/a/a/j2/x;->f:Lc/a/a/a/j2/a0$a;

    invoke-static {p1}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/j2/a0$a;

    invoke-interface {p1, p0}, Lc/a/a/a/j2/m0$a;->p(Lc/a/a/a/j2/m0;)V

    return-void
.end method

.method public w(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lc/a/a/a/j2/x;->i:J

    return-void
.end method

.method public x()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/x;->e:Lc/a/a/a/j2/a0;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/a/a/a/j2/x;->d:Lc/a/a/a/j2/d0;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/j2/d0;

    iget-object v1, p0, Lc/a/a/a/j2/x;->e:Lc/a/a/a/j2/a0;

    invoke-interface {v0, v1}, Lc/a/a/a/j2/d0;->f(Lc/a/a/a/j2/a0;)V

    :cond_0
    return-void
.end method

.method public y(Lc/a/a/a/j2/d0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/x;->d:Lc/a/a/a/j2/d0;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    iput-object p1, p0, Lc/a/a/a/j2/x;->d:Lc/a/a/a/j2/d0;

    return-void
.end method
