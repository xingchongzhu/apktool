.class public abstract Lc/a/a/a/h0;
.super Ljava/lang/Object;
.source "BaseRenderer.java"

# interfaces
.implements Lc/a/a/a/p1;
.implements Lc/a/a/a/r1;


# instance fields
.field private final a:I

.field private final b:Lc/a/a/a/v0;

.field private c:Lc/a/a/a/s1;

.field private d:I

.field private e:I

.field private f:Lc/a/a/a/j2/l0;

.field private g:[Lc/a/a/a/u0;

.field private h:J

.field private i:J

.field private j:J

.field private k:Z

.field private l:Z


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lc/a/a/a/h0;->a:I

    .line 3
    new-instance p1, Lc/a/a/a/v0;

    invoke-direct {p1}, Lc/a/a/a/v0;-><init>()V

    iput-object p1, p0, Lc/a/a/a/h0;->b:Lc/a/a/a/v0;

    const-wide/high16 v0, -0x8000000000000000L

    .line 4
    iput-wide v0, p0, Lc/a/a/a/h0;->j:J

    return-void
.end method


# virtual methods
.method protected final A()Lc/a/a/a/s1;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/h0;->c:Lc/a/a/a/s1;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/s1;

    return-object v0
.end method

.method protected final B()Lc/a/a/a/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/h0;->b:Lc/a/a/a/v0;

    invoke-virtual {v0}, Lc/a/a/a/v0;->a()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/h0;->b:Lc/a/a/a/v0;

    return-object v0
.end method

.method protected final C()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/h0;->d:I

    return v0
.end method

.method protected final D()[Lc/a/a/a/u0;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/h0;->g:[Lc/a/a/a/u0;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc/a/a/a/u0;

    return-object v0
.end method

.method protected final E()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/h0;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lc/a/a/a/h0;->k:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lc/a/a/a/h0;->f:Lc/a/a/a/j2/l0;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/j2/l0;

    invoke-interface {v0}, Lc/a/a/a/j2/l0;->e()Z

    move-result v0

    :goto_0
    return v0
.end method

.method protected abstract F()V
.end method

.method protected G(ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    return-void
.end method

.method protected abstract H(JZ)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation
.end method

.method protected I()V
    .locals 0

    return-void
.end method

.method protected J()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    return-void
.end method

.method protected K()V
    .locals 0

    return-void
.end method

.method protected abstract L([Lc/a/a/a/u0;JJ)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation
.end method

.method protected final M(Lc/a/a/a/v0;Lc/a/a/a/c2/f;Z)I
    .locals 5

    .line 1
    iget-object v0, p0, Lc/a/a/a/h0;->f:Lc/a/a/a/j2/l0;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/j2/l0;

    invoke-interface {v0, p1, p2, p3}, Lc/a/a/a/j2/l0;->a(Lc/a/a/a/v0;Lc/a/a/a/c2/f;Z)I

    move-result p3

    const/4 v0, -0x4

    if-ne p3, v0, :cond_2

    .line 2
    invoke-virtual {p2}, Lc/a/a/a/c2/a;->k()Z

    move-result p1

    if-eqz p1, :cond_1

    const-wide/high16 p1, -0x8000000000000000L

    .line 3
    iput-wide p1, p0, Lc/a/a/a/h0;->j:J

    .line 4
    iget-boolean p1, p0, Lc/a/a/a/h0;->k:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, -0x3

    :goto_0
    return v0

    .line 5
    :cond_1
    iget-wide v0, p2, Lc/a/a/a/c2/f;->e:J

    iget-wide v2, p0, Lc/a/a/a/h0;->h:J

    add-long/2addr v0, v2

    iput-wide v0, p2, Lc/a/a/a/c2/f;->e:J

    .line 6
    iget-wide p1, p0, Lc/a/a/a/h0;->j:J

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Lc/a/a/a/h0;->j:J

    goto :goto_1

    :cond_2
    const/4 p2, -0x5

    if-ne p3, p2, :cond_3

    .line 7
    iget-object p2, p1, Lc/a/a/a/v0;->b:Lc/a/a/a/u0;

    invoke-static {p2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc/a/a/a/u0;

    .line 8
    iget-wide v0, p2, Lc/a/a/a/u0;->p:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v4, v0, v2

    if-eqz v4, :cond_3

    .line 9
    invoke-virtual {p2}, Lc/a/a/a/u0;->l()Lc/a/a/a/u0$b;

    move-result-object v0

    iget-wide v1, p2, Lc/a/a/a/u0;->p:J

    iget-wide v3, p0, Lc/a/a/a/h0;->h:J

    add-long/2addr v1, v3

    .line 10
    invoke-virtual {v0, v1, v2}, Lc/a/a/a/u0$b;->i0(J)Lc/a/a/a/u0$b;

    move-result-object p2

    .line 11
    invoke-virtual {p2}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object p2

    .line 12
    iput-object p2, p1, Lc/a/a/a/v0;->b:Lc/a/a/a/u0;

    :cond_3
    :goto_1
    return p3
.end method

.method protected N(J)I
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/h0;->f:Lc/a/a/a/j2/l0;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/j2/l0;

    iget-wide v1, p0, Lc/a/a/a/h0;->h:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lc/a/a/a/j2/l0;->c(J)I

    move-result p1

    return p1
.end method

.method public final d()V
    .locals 3

    .line 1
    iget v0, p0, Lc/a/a/a/h0;->e:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/h0;->b:Lc/a/a/a/v0;

    invoke-virtual {v0}, Lc/a/a/a/v0;->a()V

    .line 3
    iput v2, p0, Lc/a/a/a/h0;->e:I

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lc/a/a/a/h0;->f:Lc/a/a/a/j2/l0;

    .line 5
    iput-object v0, p0, Lc/a/a/a/h0;->g:[Lc/a/a/a/u0;

    .line 6
    iput-boolean v2, p0, Lc/a/a/a/h0;->k:Z

    .line 7
    invoke-virtual {p0}, Lc/a/a/a/h0;->F()V

    return-void
.end method

.method public final g()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/h0;->a:I

    return v0
.end method

.method public final getState()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/h0;->e:I

    return v0
.end method

.method public final h(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/h0;->d:I

    return-void
.end method

.method public final i()Z
    .locals 5

    .line 1
    iget-wide v0, p0, Lc/a/a/a/h0;->j:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final j(Lc/a/a/a/s1;[Lc/a/a/a/u0;Lc/a/a/a/j2/l0;JZZJJ)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    move-object v7, p0

    move-wide v8, p4

    move/from16 v10, p6

    .line 1
    iget v0, v7, Lc/a/a/a/h0;->e:I

    const/4 v1, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    move-object v0, p1

    .line 2
    iput-object v0, v7, Lc/a/a/a/h0;->c:Lc/a/a/a/s1;

    .line 3
    iput v1, v7, Lc/a/a/a/h0;->e:I

    .line 4
    iput-wide v8, v7, Lc/a/a/a/h0;->i:J

    move/from16 v0, p7

    .line 5
    invoke-virtual {p0, v10, v0}, Lc/a/a/a/h0;->G(ZZ)V

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-wide/from16 v3, p8

    move-wide/from16 v5, p10

    .line 6
    invoke-virtual/range {v0 .. v6}, Lc/a/a/a/h0;->o([Lc/a/a/a/u0;Lc/a/a/a/j2/l0;JJ)V

    .line 7
    invoke-virtual {p0, v8, v9, v10}, Lc/a/a/a/h0;->H(JZ)V

    return-void
.end method

.method public k()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method public m(ILjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    return-void
.end method

.method public final n()Lc/a/a/a/j2/l0;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/h0;->f:Lc/a/a/a/j2/l0;

    return-object v0
.end method

.method public final o([Lc/a/a/a/u0;Lc/a/a/a/j2/l0;JJ)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/h0;->k:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    iput-object p2, p0, Lc/a/a/a/h0;->f:Lc/a/a/a/j2/l0;

    .line 3
    iput-wide p5, p0, Lc/a/a/a/h0;->j:J

    .line 4
    iput-object p1, p0, Lc/a/a/a/h0;->g:[Lc/a/a/a/u0;

    .line 5
    iput-wide p5, p0, Lc/a/a/a/h0;->h:J

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p3

    move-wide v4, p5

    .line 6
    invoke-virtual/range {v0 .. v5}, Lc/a/a/a/h0;->L([Lc/a/a/a/u0;JJ)V

    return-void
.end method

.method public final p()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/h0;->k:Z

    return-void
.end method

.method public final q()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/h0;->f:Lc/a/a/a/j2/l0;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/j2/l0;

    invoke-interface {v0}, Lc/a/a/a/j2/l0;->b()V

    return-void
.end method

.method public final r()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/h0;->j:J

    return-wide v0
.end method

.method public final reset()V
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/h0;->e:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/h0;->b:Lc/a/a/a/v0;

    invoke-virtual {v0}, Lc/a/a/a/v0;->a()V

    .line 3
    invoke-virtual {p0}, Lc/a/a/a/h0;->I()V

    return-void
.end method

.method public final s(J)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/h0;->k:Z

    .line 2
    iput-wide p1, p0, Lc/a/a/a/h0;->i:J

    .line 3
    iput-wide p1, p0, Lc/a/a/a/h0;->j:J

    .line 4
    invoke-virtual {p0, p1, p2, v0}, Lc/a/a/a/h0;->H(JZ)V

    return-void
.end method

.method public final start()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget v0, p0, Lc/a/a/a/h0;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lc/a/a/a/m2/f;->f(Z)V

    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lc/a/a/a/h0;->e:I

    .line 3
    invoke-virtual {p0}, Lc/a/a/a/h0;->J()V

    return-void
.end method

.method public final stop()V
    .locals 3

    .line 1
    iget v0, p0, Lc/a/a/a/h0;->e:I

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    iput v1, p0, Lc/a/a/a/h0;->e:I

    .line 3
    invoke-virtual {p0}, Lc/a/a/a/h0;->K()V

    return-void
.end method

.method public final t()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/h0;->k:Z

    return v0
.end method

.method public u()Lc/a/a/a/m2/v;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final v()Lc/a/a/a/r1;
    .locals 0

    return-object p0
.end method

.method public synthetic x(FF)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc/a/a/a/o1;->a(Lc/a/a/a/p1;FF)V

    return-void
.end method

.method protected final y(Ljava/lang/Throwable;Lc/a/a/a/u0;)Lc/a/a/a/p0;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lc/a/a/a/h0;->z(Ljava/lang/Throwable;Lc/a/a/a/u0;Z)Lc/a/a/a/p0;

    move-result-object p1

    return-object p1
.end method

.method protected final z(Ljava/lang/Throwable;Lc/a/a/a/u0;Z)Lc/a/a/a/p0;
    .locals 8

    if-eqz p2, :cond_0

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/h0;->l:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lc/a/a/a/h0;->l:Z

    const/4 v0, 0x0

    .line 3
    :try_start_0
    invoke-interface {p0, p2}, Lc/a/a/a/r1;->a(Lc/a/a/a/u0;)I

    move-result v1

    invoke-static {v1}, Lc/a/a/a/q1;->d(I)I

    move-result v1
    :try_end_0
    .catch Lc/a/a/a/p0; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    iput-boolean v0, p0, Lc/a/a/a/h0;->l:Z

    move v6, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    iput-boolean v0, p0, Lc/a/a/a/h0;->l:Z

    .line 5
    throw p1

    .line 6
    :catch_0
    iput-boolean v0, p0, Lc/a/a/a/h0;->l:Z

    :cond_0
    const/4 v1, 0x4

    const/4 v6, 0x4

    .line 7
    :goto_0
    invoke-interface {p0}, Lc/a/a/a/p1;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lc/a/a/a/h0;->C()I

    move-result v4

    move-object v2, p1

    move-object v5, p2

    move v7, p3

    .line 8
    invoke-static/range {v2 .. v7}, Lc/a/a/a/p0;->c(Ljava/lang/Throwable;Ljava/lang/String;ILc/a/a/a/u0;IZ)Lc/a/a/a/p0;

    move-result-object p1

    return-object p1
.end method
