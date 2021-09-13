.class public final Lc/a/a/a/j2/i0;
.super Lc/a/a/a/j2/k;
.source "ProgressiveMediaSource.java"

# interfaces
.implements Lc/a/a/a/j2/h0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/j2/i0$b;
    }
.end annotation


# instance fields
.field private final g:Lc/a/a/a/z0;

.field private final h:Lc/a/a/a/z0$g;

.field private final i:Lcom/google/android/exoplayer2/upstream/m$a;

.field private final j:Lc/a/a/a/f2/o;

.field private final k:Lc/a/a/a/e2/y;

.field private final l:Lcom/google/android/exoplayer2/upstream/a0;

.field private final m:I

.field private n:Z

.field private o:J

.field private p:Z

.field private q:Z

.field private r:Lcom/google/android/exoplayer2/upstream/e0;


# direct methods
.method constructor <init>(Lc/a/a/a/z0;Lcom/google/android/exoplayer2/upstream/m$a;Lc/a/a/a/f2/o;Lc/a/a/a/e2/y;Lcom/google/android/exoplayer2/upstream/a0;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/j2/k;-><init>()V

    .line 2
    iget-object v0, p1, Lc/a/a/a/z0;->b:Lc/a/a/a/z0$g;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/z0$g;

    iput-object v0, p0, Lc/a/a/a/j2/i0;->h:Lc/a/a/a/z0$g;

    .line 3
    iput-object p1, p0, Lc/a/a/a/j2/i0;->g:Lc/a/a/a/z0;

    .line 4
    iput-object p2, p0, Lc/a/a/a/j2/i0;->i:Lcom/google/android/exoplayer2/upstream/m$a;

    .line 5
    iput-object p3, p0, Lc/a/a/a/j2/i0;->j:Lc/a/a/a/f2/o;

    .line 6
    iput-object p4, p0, Lc/a/a/a/j2/i0;->k:Lc/a/a/a/e2/y;

    .line 7
    iput-object p5, p0, Lc/a/a/a/j2/i0;->l:Lcom/google/android/exoplayer2/upstream/a0;

    .line 8
    iput p6, p0, Lc/a/a/a/j2/i0;->m:I

    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lc/a/a/a/j2/i0;->n:Z

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    iput-wide p1, p0, Lc/a/a/a/j2/i0;->o:J

    return-void
.end method

.method private z()V
    .locals 9

    .line 1
    new-instance v8, Lc/a/a/a/j2/o0;

    iget-wide v1, p0, Lc/a/a/a/j2/i0;->o:J

    iget-boolean v3, p0, Lc/a/a/a/j2/i0;->p:Z

    iget-boolean v5, p0, Lc/a/a/a/j2/i0;->q:Z

    iget-object v7, p0, Lc/a/a/a/j2/i0;->g:Lc/a/a/a/z0;

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lc/a/a/a/j2/o0;-><init>(JZZZLjava/lang/Object;Lc/a/a/a/z0;)V

    .line 2
    iget-boolean v0, p0, Lc/a/a/a/j2/i0;->n:Z

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Lc/a/a/a/j2/i0$a;

    invoke-direct {v0, p0, v8}, Lc/a/a/a/j2/i0$a;-><init>(Lc/a/a/a/j2/i0;Lc/a/a/a/x1;)V

    move-object v8, v0

    .line 4
    :cond_0
    invoke-virtual {p0, v8}, Lc/a/a/a/j2/k;->x(Lc/a/a/a/x1;)V

    return-void
.end method


# virtual methods
.method public a()Lc/a/a/a/z0;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/i0;->g:Lc/a/a/a/z0;

    return-object v0
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public d(Lc/a/a/a/j2/d0$a;Lcom/google/android/exoplayer2/upstream/e;J)Lc/a/a/a/j2/a0;
    .locals 14

    move-object v12, p0

    .line 1
    iget-object v0, v12, Lc/a/a/a/j2/i0;->i:Lcom/google/android/exoplayer2/upstream/m$a;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/upstream/m$a;->a()Lcom/google/android/exoplayer2/upstream/m;

    move-result-object v2

    .line 2
    iget-object v0, v12, Lc/a/a/a/j2/i0;->r:Lcom/google/android/exoplayer2/upstream/e0;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v2, v0}, Lcom/google/android/exoplayer2/upstream/m;->k(Lcom/google/android/exoplayer2/upstream/e0;)V

    .line 4
    :cond_0
    new-instance v13, Lc/a/a/a/j2/h0;

    iget-object v0, v12, Lc/a/a/a/j2/i0;->h:Lc/a/a/a/z0$g;

    iget-object v1, v0, Lc/a/a/a/z0$g;->a:Landroid/net/Uri;

    iget-object v3, v12, Lc/a/a/a/j2/i0;->j:Lc/a/a/a/f2/o;

    iget-object v4, v12, Lc/a/a/a/j2/i0;->k:Lc/a/a/a/e2/y;

    .line 5
    invoke-virtual {p0, p1}, Lc/a/a/a/j2/k;->q(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/e2/w$a;

    move-result-object v5

    iget-object v6, v12, Lc/a/a/a/j2/i0;->l:Lcom/google/android/exoplayer2/upstream/a0;

    .line 6
    invoke-virtual {p0, p1}, Lc/a/a/a/j2/k;->s(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/j2/e0$a;

    move-result-object v7

    iget-object v0, v12, Lc/a/a/a/j2/i0;->h:Lc/a/a/a/z0$g;

    iget-object v10, v0, Lc/a/a/a/z0$g;->f:Ljava/lang/String;

    iget v11, v12, Lc/a/a/a/j2/i0;->m:I

    move-object v0, v13

    move-object v8, p0

    move-object/from16 v9, p2

    invoke-direct/range {v0 .. v11}, Lc/a/a/a/j2/h0;-><init>(Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/m;Lc/a/a/a/f2/o;Lc/a/a/a/e2/y;Lc/a/a/a/e2/w$a;Lcom/google/android/exoplayer2/upstream/a0;Lc/a/a/a/j2/e0$a;Lc/a/a/a/j2/h0$b;Lcom/google/android/exoplayer2/upstream/e;Ljava/lang/String;I)V

    return-object v13
.end method

.method public f(Lc/a/a/a/j2/a0;)V
    .locals 0

    .line 1
    check-cast p1, Lc/a/a/a/j2/h0;

    invoke-virtual {p1}, Lc/a/a/a/j2/h0;->c0()V

    return-void
.end method

.method public o(JZZ)V
    .locals 3

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    .line 1
    iget-wide p1, p0, Lc/a/a/a/j2/i0;->o:J

    .line 2
    :cond_0
    iget-boolean v0, p0, Lc/a/a/a/j2/i0;->n:Z

    if-nez v0, :cond_1

    iget-wide v0, p0, Lc/a/a/a/j2/i0;->o:J

    cmp-long v2, v0, p1

    if-nez v2, :cond_1

    iget-boolean v0, p0, Lc/a/a/a/j2/i0;->p:Z

    if-ne v0, p3, :cond_1

    iget-boolean v0, p0, Lc/a/a/a/j2/i0;->q:Z

    if-ne v0, p4, :cond_1

    return-void

    .line 3
    :cond_1
    iput-wide p1, p0, Lc/a/a/a/j2/i0;->o:J

    .line 4
    iput-boolean p3, p0, Lc/a/a/a/j2/i0;->p:Z

    .line 5
    iput-boolean p4, p0, Lc/a/a/a/j2/i0;->q:Z

    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lc/a/a/a/j2/i0;->n:Z

    .line 7
    invoke-direct {p0}, Lc/a/a/a/j2/i0;->z()V

    return-void
.end method

.method protected w(Lcom/google/android/exoplayer2/upstream/e0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/j2/i0;->r:Lcom/google/android/exoplayer2/upstream/e0;

    .line 2
    iget-object p1, p0, Lc/a/a/a/j2/i0;->k:Lc/a/a/a/e2/y;

    invoke-interface {p1}, Lc/a/a/a/e2/y;->d()V

    .line 3
    invoke-direct {p0}, Lc/a/a/a/j2/i0;->z()V

    return-void
.end method

.method protected y()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/i0;->k:Lc/a/a/a/e2/y;

    invoke-interface {v0}, Lc/a/a/a/e2/y;->a()V

    return-void
.end method
