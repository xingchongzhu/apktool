.class public final Lc/a/a/a/j2/y;
.super Lc/a/a/a/j2/o;
.source "MaskingMediaSource.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/j2/y$b;,
        Lc/a/a/a/j2/y$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/a/a/a/j2/o<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private final j:Lc/a/a/a/j2/d0;

.field private final k:Z

.field private final l:Lc/a/a/a/x1$c;

.field private final m:Lc/a/a/a/x1$b;

.field private n:Lc/a/a/a/j2/y$a;

.field private o:Lc/a/a/a/j2/x;

.field private p:Z

.field private q:Z

.field private r:Z


# direct methods
.method public constructor <init>(Lc/a/a/a/j2/d0;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/j2/o;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/j2/y;->j:Lc/a/a/a/j2/d0;

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-interface {p1}, Lc/a/a/a/j2/d0;->e()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Lc/a/a/a/j2/y;->k:Z

    .line 4
    new-instance p2, Lc/a/a/a/x1$c;

    invoke-direct {p2}, Lc/a/a/a/x1$c;-><init>()V

    iput-object p2, p0, Lc/a/a/a/j2/y;->l:Lc/a/a/a/x1$c;

    .line 5
    new-instance p2, Lc/a/a/a/x1$b;

    invoke-direct {p2}, Lc/a/a/a/x1$b;-><init>()V

    iput-object p2, p0, Lc/a/a/a/j2/y;->m:Lc/a/a/a/x1$b;

    .line 6
    invoke-interface {p1}, Lc/a/a/a/j2/d0;->g()Lc/a/a/a/x1;

    move-result-object p2

    if-eqz p2, :cond_1

    const/4 p1, 0x0

    .line 7
    invoke-static {p2, p1, p1}, Lc/a/a/a/j2/y$a;->v(Lc/a/a/a/x1;Ljava/lang/Object;Ljava/lang/Object;)Lc/a/a/a/j2/y$a;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/j2/y;->n:Lc/a/a/a/j2/y$a;

    .line 8
    iput-boolean v0, p0, Lc/a/a/a/j2/y;->r:Z

    goto :goto_1

    .line 9
    :cond_1
    invoke-interface {p1}, Lc/a/a/a/j2/d0;->a()Lc/a/a/a/z0;

    move-result-object p1

    invoke-static {p1}, Lc/a/a/a/j2/y$a;->u(Lc/a/a/a/z0;)Lc/a/a/a/j2/y$a;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/j2/y;->n:Lc/a/a/a/j2/y$a;

    :goto_1
    return-void
.end method

.method private H(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/y;->n:Lc/a/a/a/j2/y$a;

    .line 2
    invoke-static {v0}, Lc/a/a/a/j2/y$a;->s(Lc/a/a/a/j2/y$a;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/a/a/a/j2/y;->n:Lc/a/a/a/j2/y$a;

    .line 3
    invoke-static {v0}, Lc/a/a/a/j2/y$a;->s(Lc/a/a/a/j2/y$a;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    sget-object p1, Lc/a/a/a/j2/y$a;->c:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method private I(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/y;->n:Lc/a/a/a/j2/y$a;

    .line 2
    invoke-static {v0}, Lc/a/a/a/j2/y$a;->s(Lc/a/a/a/j2/y$a;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lc/a/a/a/j2/y$a;->c:Ljava/lang/Object;

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object p1, p0, Lc/a/a/a/j2/y;->n:Lc/a/a/a/j2/y$a;

    invoke-static {p1}, Lc/a/a/a/j2/y$a;->s(Lc/a/a/a/j2/y$a;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private M(J)V
    .locals 6
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "unpreparedMaskingMediaPeriod"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/y;->o:Lc/a/a/a/j2/x;

    .line 2
    iget-object v1, p0, Lc/a/a/a/j2/y;->n:Lc/a/a/a/j2/y$a;

    iget-object v2, v0, Lc/a/a/a/j2/x;->a:Lc/a/a/a/j2/d0$a;

    iget-object v2, v2, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lc/a/a/a/j2/y$a;->b(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v2, p0, Lc/a/a/a/j2/y;->n:Lc/a/a/a/j2/y$a;

    iget-object v3, p0, Lc/a/a/a/j2/y;->m:Lc/a/a/a/x1$b;

    invoke-virtual {v2, v1, v3}, Lc/a/a/a/x1;->f(ILc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object v1

    iget-wide v1, v1, Lc/a/a/a/x1$b;->d:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    cmp-long v3, p1, v1

    if-ltz v3, :cond_1

    const-wide/16 p1, 0x0

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    .line 4
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    .line 5
    :cond_1
    invoke-virtual {v0, p1, p2}, Lc/a/a/a/j2/x;->w(J)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic E(Ljava/lang/Object;Lc/a/a/a/j2/d0;Lc/a/a/a/x1;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2, p3}, Lc/a/a/a/j2/y;->L(Ljava/lang/Void;Lc/a/a/a/j2/d0;Lc/a/a/a/x1;)V

    return-void
.end method

.method public G(Lc/a/a/a/j2/d0$a;Lcom/google/android/exoplayer2/upstream/e;J)Lc/a/a/a/j2/x;
    .locals 1

    .line 1
    new-instance v0, Lc/a/a/a/j2/x;

    invoke-direct {v0, p1, p2, p3, p4}, Lc/a/a/a/j2/x;-><init>(Lc/a/a/a/j2/d0$a;Lcom/google/android/exoplayer2/upstream/e;J)V

    .line 2
    iget-object p2, p0, Lc/a/a/a/j2/y;->j:Lc/a/a/a/j2/d0;

    invoke-virtual {v0, p2}, Lc/a/a/a/j2/x;->y(Lc/a/a/a/j2/d0;)V

    .line 3
    iget-boolean p2, p0, Lc/a/a/a/j2/y;->q:Z

    if-eqz p2, :cond_0

    .line 4
    iget-object p2, p1, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lc/a/a/a/j2/y;->I(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lc/a/a/a/j2/d0$a;->c(Ljava/lang/Object;)Lc/a/a/a/j2/d0$a;

    move-result-object p1

    .line 5
    invoke-virtual {v0, p1}, Lc/a/a/a/j2/x;->h(Lc/a/a/a/j2/d0$a;)V

    goto :goto_0

    .line 6
    :cond_0
    iput-object v0, p0, Lc/a/a/a/j2/y;->o:Lc/a/a/a/j2/x;

    .line 7
    iget-boolean p1, p0, Lc/a/a/a/j2/y;->p:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lc/a/a/a/j2/y;->p:Z

    const/4 p1, 0x0

    .line 9
    iget-object p2, p0, Lc/a/a/a/j2/y;->j:Lc/a/a/a/j2/d0;

    invoke-virtual {p0, p1, p2}, Lc/a/a/a/j2/o;->F(Ljava/lang/Object;Lc/a/a/a/j2/d0;)V

    :cond_1
    :goto_0
    return-object v0
.end method

.method protected J(Ljava/lang/Void;Lc/a/a/a/j2/d0$a;)Lc/a/a/a/j2/d0$a;
    .locals 0

    .line 1
    iget-object p1, p2, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    invoke-direct {p0, p1}, Lc/a/a/a/j2/y;->H(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, Lc/a/a/a/j2/d0$a;->c(Ljava/lang/Object;)Lc/a/a/a/j2/d0$a;

    move-result-object p1

    return-object p1
.end method

.method public K()Lc/a/a/a/x1;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/y;->n:Lc/a/a/a/j2/y$a;

    return-object v0
.end method

.method protected L(Ljava/lang/Void;Lc/a/a/a/j2/d0;Lc/a/a/a/x1;)V
    .locals 12

    .line 1
    iget-boolean p1, p0, Lc/a/a/a/j2/y;->q:Z

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/j2/y;->n:Lc/a/a/a/j2/y$a;

    invoke-virtual {p1, p3}, Lc/a/a/a/j2/y$a;->t(Lc/a/a/a/x1;)Lc/a/a/a/j2/y$a;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/j2/y;->n:Lc/a/a/a/j2/y$a;

    .line 3
    iget-object p1, p0, Lc/a/a/a/j2/y;->o:Lc/a/a/a/j2/x;

    if-eqz p1, :cond_5

    .line 4
    invoke-virtual {p1}, Lc/a/a/a/j2/x;->i()J

    move-result-wide p1

    .line 5
    invoke-direct {p0, p1, p2}, Lc/a/a/a/j2/y;->M(J)V

    goto/16 :goto_3

    .line 6
    :cond_0
    invoke-virtual {p3}, Lc/a/a/a/x1;->q()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 7
    iget-boolean p1, p0, Lc/a/a/a/j2/y;->r:Z

    if-eqz p1, :cond_1

    .line 8
    iget-object p1, p0, Lc/a/a/a/j2/y;->n:Lc/a/a/a/j2/y$a;

    invoke-virtual {p1, p3}, Lc/a/a/a/j2/y$a;->t(Lc/a/a/a/x1;)Lc/a/a/a/j2/y$a;

    move-result-object p1

    goto :goto_0

    .line 9
    :cond_1
    sget-object p1, Lc/a/a/a/x1$c;->a:Ljava/lang/Object;

    sget-object p2, Lc/a/a/a/j2/y$a;->c:Ljava/lang/Object;

    invoke-static {p3, p1, p2}, Lc/a/a/a/j2/y$a;->v(Lc/a/a/a/x1;Ljava/lang/Object;Ljava/lang/Object;)Lc/a/a/a/j2/y$a;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lc/a/a/a/j2/y;->n:Lc/a/a/a/j2/y$a;

    goto/16 :goto_3

    .line 10
    :cond_2
    iget-object p1, p0, Lc/a/a/a/j2/y;->l:Lc/a/a/a/x1$c;

    const/4 p2, 0x0

    invoke-virtual {p3, p2, p1}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    .line 11
    iget-object p1, p0, Lc/a/a/a/j2/y;->l:Lc/a/a/a/x1$c;

    invoke-virtual {p1}, Lc/a/a/a/x1$c;->c()J

    move-result-wide v0

    .line 12
    iget-object p1, p0, Lc/a/a/a/j2/y;->l:Lc/a/a/a/x1$c;

    iget-object p1, p1, Lc/a/a/a/x1$c;->c:Ljava/lang/Object;

    .line 13
    iget-object v2, p0, Lc/a/a/a/j2/y;->o:Lc/a/a/a/j2/x;

    if-eqz v2, :cond_3

    .line 14
    invoke-virtual {v2}, Lc/a/a/a/j2/x;->q()J

    move-result-wide v2

    .line 15
    iget-object v4, p0, Lc/a/a/a/j2/y;->n:Lc/a/a/a/j2/y$a;

    iget-object v5, p0, Lc/a/a/a/j2/y;->o:Lc/a/a/a/j2/x;

    iget-object v5, v5, Lc/a/a/a/j2/x;->a:Lc/a/a/a/j2/d0$a;

    iget-object v5, v5, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    iget-object v6, p0, Lc/a/a/a/j2/y;->m:Lc/a/a/a/x1$b;

    invoke-virtual {v4, v5, v6}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    .line 16
    iget-object v4, p0, Lc/a/a/a/j2/y;->m:Lc/a/a/a/x1$b;

    invoke-virtual {v4}, Lc/a/a/a/x1$b;->l()J

    move-result-wide v4

    add-long/2addr v4, v2

    .line 17
    iget-object v2, p0, Lc/a/a/a/j2/y;->n:Lc/a/a/a/j2/y$a;

    iget-object v3, p0, Lc/a/a/a/j2/y;->l:Lc/a/a/a/x1$c;

    .line 18
    invoke-virtual {v2, p2, v3}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    move-result-object p2

    invoke-virtual {p2}, Lc/a/a/a/x1$c;->c()J

    move-result-wide v2

    cmp-long p2, v4, v2

    if-eqz p2, :cond_3

    move-wide v10, v4

    goto :goto_1

    :cond_3
    move-wide v10, v0

    .line 19
    :goto_1
    iget-object v7, p0, Lc/a/a/a/j2/y;->l:Lc/a/a/a/x1$c;

    iget-object v8, p0, Lc/a/a/a/j2/y;->m:Lc/a/a/a/x1$b;

    const/4 v9, 0x0

    move-object v6, p3

    .line 20
    invoke-virtual/range {v6 .. v11}, Lc/a/a/a/x1;->j(Lc/a/a/a/x1$c;Lc/a/a/a/x1$b;IJ)Landroid/util/Pair;

    move-result-object p2

    .line 21
    iget-object v0, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 22
    iget-object p2, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    .line 23
    iget-boolean p2, p0, Lc/a/a/a/j2/y;->r:Z

    if-eqz p2, :cond_4

    .line 24
    iget-object p1, p0, Lc/a/a/a/j2/y;->n:Lc/a/a/a/j2/y$a;

    invoke-virtual {p1, p3}, Lc/a/a/a/j2/y$a;->t(Lc/a/a/a/x1;)Lc/a/a/a/j2/y$a;

    move-result-object p1

    goto :goto_2

    .line 25
    :cond_4
    invoke-static {p3, p1, v0}, Lc/a/a/a/j2/y$a;->v(Lc/a/a/a/x1;Ljava/lang/Object;Ljava/lang/Object;)Lc/a/a/a/j2/y$a;

    move-result-object p1

    :goto_2
    iput-object p1, p0, Lc/a/a/a/j2/y;->n:Lc/a/a/a/j2/y$a;

    .line 26
    iget-object p1, p0, Lc/a/a/a/j2/y;->o:Lc/a/a/a/j2/x;

    if-eqz p1, :cond_5

    .line 27
    invoke-direct {p0, v1, v2}, Lc/a/a/a/j2/y;->M(J)V

    .line 28
    iget-object p1, p1, Lc/a/a/a/j2/x;->a:Lc/a/a/a/j2/d0$a;

    iget-object p2, p1, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    .line 29
    invoke-direct {p0, p2}, Lc/a/a/a/j2/y;->I(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lc/a/a/a/j2/d0$a;->c(Ljava/lang/Object;)Lc/a/a/a/j2/d0$a;

    move-result-object p1

    goto :goto_4

    :cond_5
    :goto_3
    const/4 p1, 0x0

    :goto_4
    const/4 p2, 0x1

    .line 30
    iput-boolean p2, p0, Lc/a/a/a/j2/y;->r:Z

    .line 31
    iput-boolean p2, p0, Lc/a/a/a/j2/y;->q:Z

    .line 32
    iget-object p2, p0, Lc/a/a/a/j2/y;->n:Lc/a/a/a/j2/y$a;

    invoke-virtual {p0, p2}, Lc/a/a/a/j2/k;->x(Lc/a/a/a/x1;)V

    if-eqz p1, :cond_6

    .line 33
    iget-object p2, p0, Lc/a/a/a/j2/y;->o:Lc/a/a/a/j2/x;

    invoke-static {p2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc/a/a/a/j2/x;

    .line 34
    invoke-virtual {p2, p1}, Lc/a/a/a/j2/x;->h(Lc/a/a/a/j2/d0$a;)V

    :cond_6
    return-void
.end method

.method public a()Lc/a/a/a/z0;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/y;->j:Lc/a/a/a/j2/d0;

    invoke-interface {v0}, Lc/a/a/a/j2/d0;->a()Lc/a/a/a/z0;

    move-result-object v0

    return-object v0
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public bridge synthetic d(Lc/a/a/a/j2/d0$a;Lcom/google/android/exoplayer2/upstream/e;J)Lc/a/a/a/j2/a0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lc/a/a/a/j2/y;->G(Lc/a/a/a/j2/d0$a;Lcom/google/android/exoplayer2/upstream/e;J)Lc/a/a/a/j2/x;

    move-result-object p1

    return-object p1
.end method

.method public f(Lc/a/a/a/j2/a0;)V
    .locals 1

    .line 1
    move-object v0, p1

    check-cast v0, Lc/a/a/a/j2/x;

    invoke-virtual {v0}, Lc/a/a/a/j2/x;->x()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/j2/y;->o:Lc/a/a/a/j2/x;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lc/a/a/a/j2/y;->o:Lc/a/a/a/j2/x;

    :cond_0
    return-void
.end method

.method public w(Lcom/google/android/exoplayer2/upstream/e0;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lc/a/a/a/j2/o;->w(Lcom/google/android/exoplayer2/upstream/e0;)V

    .line 2
    iget-boolean p1, p0, Lc/a/a/a/j2/y;->k:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lc/a/a/a/j2/y;->p:Z

    const/4 p1, 0x0

    .line 4
    iget-object v0, p0, Lc/a/a/a/j2/y;->j:Lc/a/a/a/j2/d0;

    invoke-virtual {p0, p1, v0}, Lc/a/a/a/j2/o;->F(Ljava/lang/Object;Lc/a/a/a/j2/d0;)V

    :cond_0
    return-void
.end method

.method public y()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/j2/y;->q:Z

    .line 2
    iput-boolean v0, p0, Lc/a/a/a/j2/y;->p:Z

    .line 3
    invoke-super {p0}, Lc/a/a/a/j2/o;->y()V

    return-void
.end method

.method protected bridge synthetic z(Ljava/lang/Object;Lc/a/a/a/j2/d0$a;)Lc/a/a/a/j2/d0$a;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2}, Lc/a/a/a/j2/y;->J(Ljava/lang/Void;Lc/a/a/a/j2/d0$a;)Lc/a/a/a/j2/d0$a;

    move-result-object p1

    return-object p1
.end method
