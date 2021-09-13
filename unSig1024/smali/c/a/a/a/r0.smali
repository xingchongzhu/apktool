.class final Lc/a/a/a/r0;
.super Ljava/lang/Object;
.source "ExoPlayerImplInternal.java"

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Lc/a/a/a/j2/a0$a;
.implements Lc/a/a/a/l2/n$a;
.implements Lc/a/a/a/f1$d;
.implements Lc/a/a/a/n0$a;
.implements Lc/a/a/a/m1$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/r0$c;,
        Lc/a/a/a/r0$b;,
        Lc/a/a/a/r0$d;,
        Lc/a/a/a/r0$g;,
        Lc/a/a/a/r0$h;,
        Lc/a/a/a/r0$f;,
        Lc/a/a/a/r0$e;
    }
.end annotation


# instance fields
.field private A:Z

.field private B:Z

.field private C:Z

.field private D:I

.field private G:Z

.field private H:Z

.field private I:Z

.field private J:Z

.field private K:I

.field private L:Lc/a/a/a/r0$h;

.field private M:J

.field private N:I

.field private O:Z

.field private P:Lc/a/a/a/p0;

.field private Q:J

.field private final a:[Lc/a/a/a/p1;

.field private final b:[Lc/a/a/a/r1;

.field private final c:Lc/a/a/a/l2/n;

.field private final d:Lc/a/a/a/l2/o;

.field private final e:Lc/a/a/a/y0;

.field private final f:Lcom/google/android/exoplayer2/upstream/g;

.field private final g:Lc/a/a/a/m2/q;

.field private final h:Landroid/os/HandlerThread;

.field private final i:Landroid/os/Looper;

.field private final j:Lc/a/a/a/x1$c;

.field private final k:Lc/a/a/a/x1$b;

.field private final l:J

.field private final m:Z

.field private final n:Lc/a/a/a/n0;

.field private final o:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/a/a/a/r0$d;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Lc/a/a/a/m2/g;

.field private final q:Lc/a/a/a/r0$f;

.field private final r:Lc/a/a/a/d1;

.field private final s:Lc/a/a/a/f1;

.field private final t:Lc/a/a/a/x0;

.field private final u:J

.field private v:Lc/a/a/a/u1;

.field private w:Lc/a/a/a/h1;

.field private x:Lc/a/a/a/r0$e;

.field private y:Z

.field private z:Z


# direct methods
.method public constructor <init>([Lc/a/a/a/p1;Lc/a/a/a/l2/n;Lc/a/a/a/l2/o;Lc/a/a/a/y0;Lcom/google/android/exoplayer2/upstream/g;IZLc/a/a/a/a2/c1;Lc/a/a/a/u1;Lc/a/a/a/x0;JZLandroid/os/Looper;Lc/a/a/a/m2/g;Lc/a/a/a/r0$f;)V
    .locals 11

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v3, p5

    move-object/from16 v4, p8

    move-wide/from16 v5, p11

    move-object/from16 v7, p15

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v8, p16

    .line 2
    iput-object v8, v0, Lc/a/a/a/r0;->q:Lc/a/a/a/r0$f;

    .line 3
    iput-object v1, v0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    .line 4
    iput-object v2, v0, Lc/a/a/a/r0;->c:Lc/a/a/a/l2/n;

    move-object v8, p3

    .line 5
    iput-object v8, v0, Lc/a/a/a/r0;->d:Lc/a/a/a/l2/o;

    move-object v9, p4

    .line 6
    iput-object v9, v0, Lc/a/a/a/r0;->e:Lc/a/a/a/y0;

    .line 7
    iput-object v3, v0, Lc/a/a/a/r0;->f:Lcom/google/android/exoplayer2/upstream/g;

    move/from16 v10, p6

    .line 8
    iput v10, v0, Lc/a/a/a/r0;->D:I

    move/from16 v10, p7

    .line 9
    iput-boolean v10, v0, Lc/a/a/a/r0;->G:Z

    move-object/from16 v10, p9

    .line 10
    iput-object v10, v0, Lc/a/a/a/r0;->v:Lc/a/a/a/u1;

    move-object/from16 v10, p10

    .line 11
    iput-object v10, v0, Lc/a/a/a/r0;->t:Lc/a/a/a/x0;

    .line 12
    iput-wide v5, v0, Lc/a/a/a/r0;->u:J

    .line 13
    iput-wide v5, v0, Lc/a/a/a/r0;->Q:J

    move/from16 v5, p13

    .line 14
    iput-boolean v5, v0, Lc/a/a/a/r0;->z:Z

    .line 15
    iput-object v7, v0, Lc/a/a/a/r0;->p:Lc/a/a/a/m2/g;

    .line 16
    invoke-interface {p4}, Lc/a/a/a/y0;->n()J

    move-result-wide v5

    iput-wide v5, v0, Lc/a/a/a/r0;->l:J

    .line 17
    invoke-interface {p4}, Lc/a/a/a/y0;->h()Z

    move-result v5

    iput-boolean v5, v0, Lc/a/a/a/r0;->m:Z

    .line 18
    invoke-static {p3}, Lc/a/a/a/h1;->k(Lc/a/a/a/l2/o;)Lc/a/a/a/h1;

    move-result-object v5

    iput-object v5, v0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    .line 19
    new-instance v6, Lc/a/a/a/r0$e;

    invoke-direct {v6, v5}, Lc/a/a/a/r0$e;-><init>(Lc/a/a/a/h1;)V

    iput-object v6, v0, Lc/a/a/a/r0;->x:Lc/a/a/a/r0$e;

    .line 20
    array-length v5, v1

    new-array v5, v5, [Lc/a/a/a/r1;

    iput-object v5, v0, Lc/a/a/a/r0;->b:[Lc/a/a/a/r1;

    const/4 v5, 0x0

    .line 21
    :goto_0
    array-length v6, v1

    if-ge v5, v6, :cond_0

    .line 22
    aget-object v6, v1, v5

    invoke-interface {v6, v5}, Lc/a/a/a/p1;->h(I)V

    .line 23
    iget-object v6, v0, Lc/a/a/a/r0;->b:[Lc/a/a/a/r1;

    aget-object v8, v1, v5

    invoke-interface {v8}, Lc/a/a/a/p1;->v()Lc/a/a/a/r1;

    move-result-object v8

    aput-object v8, v6, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Lc/a/a/a/n0;

    invoke-direct {v1, p0, v7}, Lc/a/a/a/n0;-><init>(Lc/a/a/a/n0$a;Lc/a/a/a/m2/g;)V

    iput-object v1, v0, Lc/a/a/a/r0;->n:Lc/a/a/a/n0;

    .line 25
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lc/a/a/a/r0;->o:Ljava/util/ArrayList;

    .line 26
    new-instance v1, Lc/a/a/a/x1$c;

    invoke-direct {v1}, Lc/a/a/a/x1$c;-><init>()V

    iput-object v1, v0, Lc/a/a/a/r0;->j:Lc/a/a/a/x1$c;

    .line 27
    new-instance v1, Lc/a/a/a/x1$b;

    invoke-direct {v1}, Lc/a/a/a/x1$b;-><init>()V

    iput-object v1, v0, Lc/a/a/a/r0;->k:Lc/a/a/a/x1$b;

    .line 28
    invoke-virtual {p2, p0, v3}, Lc/a/a/a/l2/n;->b(Lc/a/a/a/l2/n$a;Lcom/google/android/exoplayer2/upstream/g;)V

    const/4 v1, 0x1

    .line 29
    iput-boolean v1, v0, Lc/a/a/a/r0;->O:Z

    .line 30
    new-instance v1, Landroid/os/Handler;

    move-object/from16 v2, p14

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 31
    new-instance v2, Lc/a/a/a/d1;

    invoke-direct {v2, v4, v1}, Lc/a/a/a/d1;-><init>(Lc/a/a/a/a2/c1;Landroid/os/Handler;)V

    iput-object v2, v0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    .line 32
    new-instance v2, Lc/a/a/a/f1;

    invoke-direct {v2, p0, v4, v1}, Lc/a/a/a/f1;-><init>(Lc/a/a/a/f1$d;Lc/a/a/a/a2/c1;Landroid/os/Handler;)V

    iput-object v2, v0, Lc/a/a/a/r0;->s:Lc/a/a/a/f1;

    .line 33
    new-instance v1, Landroid/os/HandlerThread;

    const/16 v2, -0x10

    const-string v3, "ExoPlayer:Playback"

    invoke-direct {v1, v3, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object v1, v0, Lc/a/a/a/r0;->h:Landroid/os/HandlerThread;

    .line 34
    invoke-virtual {v1}, Landroid/os/HandlerThread;->start()V

    .line 35
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    iput-object v1, v0, Lc/a/a/a/r0;->i:Landroid/os/Looper;

    .line 36
    invoke-interface {v7, v1, p0}, Lc/a/a/a/m2/g;->b(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lc/a/a/a/m2/q;

    move-result-object v1

    iput-object v1, v0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    return-void
.end method

.method private A(Lc/a/a/a/j2/a0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0, p1}, Lc/a/a/a/d1;->t(Lc/a/a/a/j2/a0;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object p1, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    iget-wide v0, p0, Lc/a/a/a/r0;->M:J

    invoke-virtual {p1, v0, v1}, Lc/a/a/a/d1;->x(J)V

    .line 3
    invoke-direct {p0}, Lc/a/a/a/r0;->P()V

    return-void
.end method

.method private A0(Lc/a/a/a/m1;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/m1;->e()J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lc/a/a/a/r0;->B0(Lc/a/a/a/m1;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v0, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    invoke-virtual {v0}, Lc/a/a/a/x1;->q()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lc/a/a/a/r0;->o:Ljava/util/ArrayList;

    new-instance v1, Lc/a/a/a/r0$d;

    invoke-direct {v1, p1}, Lc/a/a/a/r0$d;-><init>(Lc/a/a/a/m1;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 5
    :cond_1
    new-instance v0, Lc/a/a/a/r0$d;

    invoke-direct {v0, p1}, Lc/a/a/a/r0$d;-><init>(Lc/a/a/a/m1;)V

    .line 6
    iget-object v1, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v4, v1, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget v5, p0, Lc/a/a/a/r0;->D:I

    iget-boolean v6, p0, Lc/a/a/a/r0;->G:Z

    iget-object v7, p0, Lc/a/a/a/r0;->j:Lc/a/a/a/x1$c;

    iget-object v8, p0, Lc/a/a/a/r0;->k:Lc/a/a/a/x1$b;

    move-object v2, v0

    move-object v3, v4

    invoke-static/range {v2 .. v8}, Lc/a/a/a/r0;->p0(Lc/a/a/a/r0$d;Lc/a/a/a/x1;Lc/a/a/a/x1;IZLc/a/a/a/x1$c;Lc/a/a/a/x1$b;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 7
    iget-object p1, p0, Lc/a/a/a/r0;->o:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    iget-object p1, p0, Lc/a/a/a/r0;->o:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p1, v0}, Lc/a/a/a/m1;->k(Z)V

    :goto_0
    return-void
.end method

.method private B(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->i()Lc/a/a/a/b1;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    iget-object v1, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v1, v1, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-object v1, v1, Lc/a/a/a/c1;->a:Lc/a/a/a/j2/d0$a;

    .line 3
    :goto_0
    iget-object v2, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v2, v2, Lc/a/a/a/h1;->k:Lc/a/a/a/j2/d0$a;

    .line 4
    invoke-virtual {v2, v1}, Lc/a/a/a/j2/b0;->equals(Ljava/lang/Object;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_1

    .line 5
    iget-object v3, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    invoke-virtual {v3, v1}, Lc/a/a/a/h1;->b(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/h1;

    move-result-object v1

    iput-object v1, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    .line 6
    :cond_1
    iget-object v1, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    if-nez v0, :cond_2

    .line 7
    iget-wide v3, v1, Lc/a/a/a/h1;->s:J

    goto :goto_1

    .line 8
    :cond_2
    invoke-virtual {v0}, Lc/a/a/a/b1;->i()J

    move-result-wide v3

    :goto_1
    iput-wide v3, v1, Lc/a/a/a/h1;->q:J

    .line 9
    iget-object v1, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    invoke-direct {p0}, Lc/a/a/a/r0;->y()J

    move-result-wide v3

    iput-wide v3, v1, Lc/a/a/a/h1;->r:J

    if-nez v2, :cond_3

    if-eqz p1, :cond_4

    :cond_3
    if-eqz v0, :cond_4

    .line 10
    iget-boolean p1, v0, Lc/a/a/a/b1;->d:Z

    if-eqz p1, :cond_4

    .line 11
    invoke-virtual {v0}, Lc/a/a/a/b1;->n()Lc/a/a/a/j2/q0;

    move-result-object p1

    .line 12
    invoke-virtual {v0}, Lc/a/a/a/b1;->o()Lc/a/a/a/l2/o;

    move-result-object v0

    .line 13
    invoke-direct {p0, p1, v0}, Lc/a/a/a/r0;->g1(Lc/a/a/a/j2/q0;Lc/a/a/a/l2/o;)V

    :cond_4
    return-void
.end method

.method private B0(Lc/a/a/a/m1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/m1;->c()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Lc/a/a/a/r0;->i:Landroid/os/Looper;

    if-ne v0, v1, :cond_1

    .line 2
    invoke-direct {p0, p1}, Lc/a/a/a/r0;->h(Lc/a/a/a/m1;)V

    .line 3
    iget-object p1, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget p1, p1, Lc/a/a/a/h1;->e:I

    const/4 v0, 0x3

    const/4 v1, 0x2

    if-eq p1, v0, :cond_0

    if-ne p1, v1, :cond_2

    .line 4
    :cond_0
    iget-object p1, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    invoke-interface {p1, v1}, Lc/a/a/a/m2/q;->c(I)Z

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    const/16 v1, 0xf

    invoke-interface {v0, v1, p1}, Lc/a/a/a/m2/q;->g(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_2
    :goto_0
    return-void
.end method

.method private C(Lc/a/a/a/x1;)V
    .locals 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    move-object/from16 v8, p0

    move-object/from16 v7, p1

    .line 1
    iget-object v10, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v11, v8, Lc/a/a/a/r0;->L:Lc/a/a/a/r0$h;

    iget-object v12, v8, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    iget v13, v8, Lc/a/a/a/r0;->D:I

    iget-boolean v14, v8, Lc/a/a/a/r0;->G:Z

    iget-object v15, v8, Lc/a/a/a/r0;->j:Lc/a/a/a/x1$c;

    iget-object v0, v8, Lc/a/a/a/r0;->k:Lc/a/a/a/x1$b;

    move-object/from16 v9, p1

    move-object/from16 v16, v0

    .line 2
    invoke-static/range {v9 .. v16}, Lc/a/a/a/r0;->r0(Lc/a/a/a/x1;Lc/a/a/a/h1;Lc/a/a/a/r0$h;Lc/a/a/a/d1;IZLc/a/a/a/x1$c;Lc/a/a/a/x1$b;)Lc/a/a/a/r0$g;

    move-result-object v9

    .line 3
    iget-object v10, v9, Lc/a/a/a/r0$g;->a:Lc/a/a/a/j2/d0$a;

    .line 4
    iget-wide v11, v9, Lc/a/a/a/r0$g;->c:J

    .line 5
    iget-boolean v0, v9, Lc/a/a/a/r0$g;->d:Z

    .line 6
    iget-wide v13, v9, Lc/a/a/a/r0$g;->b:J

    .line 7
    iget-object v1, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v1, v1, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    .line 8
    invoke-virtual {v1, v10}, Lc/a/a/a/j2/b0;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v15, 0x0

    if-eqz v1, :cond_1

    iget-object v1, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-wide v3, v1, Lc/a/a/a/h1;->s:J

    cmp-long v1, v13, v3

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v16, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/16 v16, 0x1

    :goto_1
    const/4 v5, 0x0

    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    :try_start_0
    iget-boolean v1, v9, Lc/a/a/a/r0$g;->e:Z

    if-eqz v1, :cond_3

    .line 10
    iget-object v1, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget v1, v1, Lc/a/a/a/h1;->e:I

    if-eq v1, v2, :cond_2

    const/4 v1, 0x4

    .line 11
    invoke-direct {v8, v1}, Lc/a/a/a/r0;->T0(I)V

    .line 12
    :cond_2
    invoke-direct {v8, v15, v15, v15, v2}, Lc/a/a/a/r0;->l0(ZZZZ)V

    :cond_3
    if-nez v16, :cond_4

    .line 13
    iget-object v1, v8, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    iget-wide v3, v8, Lc/a/a/a/r0;->M:J

    .line 14
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/r0;->v()J

    move-result-wide v19
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object/from16 v2, p1

    move-wide/from16 v5, v19

    .line 15
    :try_start_1
    invoke-virtual/range {v1 .. v6}, Lc/a/a/a/d1;->E(Lc/a/a/a/x1;JJ)Z

    move-result v0

    if-nez v0, :cond_7

    .line 16
    invoke-direct {v8, v15}, Lc/a/a/a/r0;->w0(Z)V

    goto :goto_3

    .line 17
    :cond_4
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/x1;->q()Z

    move-result v1

    if-nez v1, :cond_7

    .line 18
    iget-object v1, v8, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v1}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v1

    :goto_2
    if-eqz v1, :cond_6

    .line 19
    iget-object v2, v1, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-object v2, v2, Lc/a/a/a/c1;->a:Lc/a/a/a/j2/d0$a;

    invoke-virtual {v2, v10}, Lc/a/a/a/j2/b0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 20
    iget-object v2, v8, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    iget-object v3, v1, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    invoke-virtual {v2, v7, v3}, Lc/a/a/a/d1;->p(Lc/a/a/a/x1;Lc/a/a/a/c1;)Lc/a/a/a/c1;

    move-result-object v2

    iput-object v2, v1, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    .line 21
    :cond_5
    invoke-virtual {v1}, Lc/a/a/a/b1;->j()Lc/a/a/a/b1;

    move-result-object v1

    goto :goto_2

    .line 22
    :cond_6
    invoke-direct {v8, v10, v13, v14, v0}, Lc/a/a/a/r0;->y0(Lc/a/a/a/j2/d0$a;JZ)J

    move-result-wide v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-wide v13, v0

    .line 23
    :cond_7
    :goto_3
    iget-object v0, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v4, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v5, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    .line 24
    iget-boolean v0, v9, Lc/a/a/a/r0$g;->f:Z

    if-eqz v0, :cond_8

    move-wide/from16 v17, v13

    :cond_8
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v10

    move-object v9, v7

    move-wide/from16 v6, v17

    .line 25
    invoke-direct/range {v1 .. v7}, Lc/a/a/a/r0;->f1(Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;J)V

    if-nez v16, :cond_9

    .line 26
    iget-object v0, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-wide v0, v0, Lc/a/a/a/h1;->d:J

    cmp-long v2, v11, v0

    if-eqz v2, :cond_a

    :cond_9
    move-object/from16 v1, p0

    move-object v2, v10

    move-wide v3, v13

    move-wide v5, v11

    .line 27
    invoke-direct/range {v1 .. v6}, Lc/a/a/a/r0;->G(Lc/a/a/a/j2/d0$a;JJ)Lc/a/a/a/h1;

    move-result-object v0

    iput-object v0, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    .line 28
    :cond_a
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/r0;->m0()V

    .line 29
    iget-object v0, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v0, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    invoke-direct {v8, v9, v0}, Lc/a/a/a/r0;->q0(Lc/a/a/a/x1;Lc/a/a/a/x1;)V

    .line 30
    iget-object v0, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    invoke-virtual {v0, v9}, Lc/a/a/a/h1;->j(Lc/a/a/a/x1;)Lc/a/a/a/h1;

    move-result-object v0

    iput-object v0, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    .line 31
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/x1;->q()Z

    move-result v0

    if-nez v0, :cond_b

    const/4 v6, 0x0

    .line 32
    iput-object v6, v8, Lc/a/a/a/r0;->L:Lc/a/a/a/r0$h;

    .line 33
    :cond_b
    invoke-direct {v8, v15}, Lc/a/a/a/r0;->B(Z)V

    return-void

    :catchall_0
    move-exception v0

    const/4 v6, 0x0

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v6, v5

    .line 34
    :goto_4
    iget-object v1, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v4, v1, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v5, v1, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    .line 35
    iget-boolean v1, v9, Lc/a/a/a/r0$g;->f:Z

    if-eqz v1, :cond_c

    move-wide/from16 v17, v13

    :cond_c
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v10

    move-object v15, v6

    move-object v9, v7

    move-wide/from16 v6, v17

    .line 36
    invoke-direct/range {v1 .. v7}, Lc/a/a/a/r0;->f1(Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;J)V

    if-nez v16, :cond_d

    .line 37
    iget-object v1, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-wide v1, v1, Lc/a/a/a/h1;->d:J

    cmp-long v3, v11, v1

    if-eqz v3, :cond_e

    :cond_d
    move-object/from16 v1, p0

    move-object v2, v10

    move-wide v3, v13

    move-wide v5, v11

    .line 38
    invoke-direct/range {v1 .. v6}, Lc/a/a/a/r0;->G(Lc/a/a/a/j2/d0$a;JJ)Lc/a/a/a/h1;

    move-result-object v1

    iput-object v1, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    .line 39
    :cond_e
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/r0;->m0()V

    .line 40
    iget-object v1, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v1, v1, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    invoke-direct {v8, v9, v1}, Lc/a/a/a/r0;->q0(Lc/a/a/a/x1;Lc/a/a/a/x1;)V

    .line 41
    iget-object v1, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    invoke-virtual {v1, v9}, Lc/a/a/a/h1;->j(Lc/a/a/a/x1;)Lc/a/a/a/h1;

    move-result-object v1

    iput-object v1, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    .line 42
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/x1;->q()Z

    move-result v1

    if-nez v1, :cond_f

    .line 43
    iput-object v15, v8, Lc/a/a/a/r0;->L:Lc/a/a/a/r0$h;

    :cond_f
    const/4 v1, 0x0

    .line 44
    invoke-direct {v8, v1}, Lc/a/a/a/r0;->B(Z)V

    .line 45
    goto :goto_6

    :goto_5
    throw v0

    :goto_6
    goto :goto_5
.end method

.method private C0(Lc/a/a/a/m1;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/m1;->c()Landroid/os/Looper;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v0, "TAG"

    const-string v1, "Trying to send message on a dead thread."

    .line 3
    invoke-static {v0, v1}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Lc/a/a/a/m1;->k(Z)V

    return-void

    .line 5
    :cond_0
    iget-object v1, p0, Lc/a/a/a/r0;->p:Lc/a/a/a/m2/g;

    const/4 v2, 0x0

    .line 6
    invoke-interface {v1, v0, v2}, Lc/a/a/a/m2/g;->b(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lc/a/a/a/m2/q;

    move-result-object v0

    new-instance v1, Lc/a/a/a/y;

    invoke-direct {v1, p0, p1}, Lc/a/a/a/y;-><init>(Lc/a/a/a/r0;Lc/a/a/a/m1;)V

    .line 7
    invoke-interface {v0, v1}, Lc/a/a/a/m2/q;->i(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private D(Lc/a/a/a/j2/a0;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0, p1}, Lc/a/a/a/d1;->t(Lc/a/a/a/j2/a0;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object p1, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {p1}, Lc/a/a/a/d1;->i()Lc/a/a/a/b1;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lc/a/a/a/r0;->n:Lc/a/a/a/n0;

    .line 4
    invoke-virtual {v0}, Lc/a/a/a/n0;->c()Lc/a/a/a/i1;

    move-result-object v0

    iget v0, v0, Lc/a/a/a/i1;->b:F

    iget-object v1, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v1, v1, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    .line 5
    invoke-virtual {p1, v0, v1}, Lc/a/a/a/b1;->p(FLc/a/a/a/x1;)V

    .line 6
    invoke-virtual {p1}, Lc/a/a/a/b1;->n()Lc/a/a/a/j2/q0;

    move-result-object v0

    invoke-virtual {p1}, Lc/a/a/a/b1;->o()Lc/a/a/a/l2/o;

    move-result-object v1

    .line 7
    invoke-direct {p0, v0, v1}, Lc/a/a/a/r0;->g1(Lc/a/a/a/j2/q0;Lc/a/a/a/l2/o;)V

    .line 8
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 9
    iget-object v0, p1, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-wide v0, v0, Lc/a/a/a/c1;->b:J

    invoke-direct {p0, v0, v1}, Lc/a/a/a/r0;->n0(J)V

    .line 10
    invoke-direct {p0}, Lc/a/a/a/r0;->n()V

    .line 11
    iget-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v2, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-object p1, p1, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-wide v3, p1, Lc/a/a/a/c1;->b:J

    iget-wide v5, v0, Lc/a/a/a/h1;->d:J

    move-object v1, p0

    .line 12
    invoke-direct/range {v1 .. v6}, Lc/a/a/a/r0;->G(Lc/a/a/a/j2/d0$a;JJ)Lc/a/a/a/h1;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    .line 13
    :cond_1
    invoke-direct {p0}, Lc/a/a/a/r0;->P()V

    return-void
.end method

.method private D0(J)V
    .locals 5

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 2
    invoke-interface {v3}, Lc/a/a/a/p1;->n()Lc/a/a/a/j2/l0;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 3
    invoke-direct {p0, v3, p1, p2}, Lc/a/a/a/r0;->E0(Lc/a/a/a/p1;J)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private E(Lc/a/a/a/i1;FZZ)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    if-eqz p3, :cond_1

    if-eqz p4, :cond_0

    .line 1
    iget-object p3, p0, Lc/a/a/a/r0;->x:Lc/a/a/a/r0$e;

    const/4 p4, 0x1

    invoke-virtual {p3, p4}, Lc/a/a/a/r0$e;->b(I)V

    .line 2
    :cond_0
    iget-object p3, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    invoke-virtual {p3, p1}, Lc/a/a/a/h1;->g(Lc/a/a/a/i1;)Lc/a/a/a/h1;

    move-result-object p3

    iput-object p3, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    .line 3
    :cond_1
    iget p3, p1, Lc/a/a/a/i1;->b:F

    invoke-direct {p0, p3}, Lc/a/a/a/r0;->j1(F)V

    .line 4
    iget-object p3, p0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    array-length p4, p3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p4, :cond_3

    aget-object v1, p3, v0

    if-eqz v1, :cond_2

    .line 5
    iget v2, p1, Lc/a/a/a/i1;->b:F

    invoke-interface {v1, p2, v2}, Lc/a/a/a/p1;->x(FF)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method private E0(Lc/a/a/a/p1;J)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lc/a/a/a/p1;->p()V

    .line 2
    instance-of v0, p1, Lc/a/a/a/k2/m;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lc/a/a/a/k2/m;

    invoke-virtual {p1, p2, p3}, Lc/a/a/a/k2/m;->W(J)V

    :cond_0
    return-void
.end method

.method private F(Lc/a/a/a/i1;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget v0, p1, Lc/a/a/a/i1;->b:F

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1, p2}, Lc/a/a/a/r0;->E(Lc/a/a/a/i1;FZZ)V

    return-void
.end method

.method private F0(ZLjava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/r0;->H:Z

    if-eq v0, p1, :cond_1

    .line 2
    iput-boolean p1, p0, Lc/a/a/a/r0;->H:Z

    if-nez p1, :cond_1

    .line 3
    iget-object p1, p0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    .line 4
    invoke-static {v2}, Lc/a/a/a/r0;->J(Lc/a/a/a/p1;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 5
    invoke-interface {v2}, Lc/a/a/a/p1;->reset()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    .line 6
    monitor-enter p0

    const/4 p1, 0x1

    .line 7
    :try_start_0
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 9
    monitor-exit p0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    :goto_1
    return-void
.end method

.method private G(Lc/a/a/a/j2/d0$a;JJ)Lc/a/a/a/h1;
    .locals 12

    move-object v0, p0

    move-object v2, p1

    move-wide/from16 v5, p4

    .line 1
    iget-boolean v1, v0, Lc/a/a/a/r0;->O:Z

    if-nez v1, :cond_1

    iget-object v1, v0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-wide v3, v1, Lc/a/a/a/h1;->s:J

    cmp-long v1, p2, v3

    if-nez v1, :cond_1

    iget-object v1, v0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v1, v1, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    .line 2
    invoke-virtual {p1, v1}, Lc/a/a/a/j2/b0;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    iput-boolean v1, v0, Lc/a/a/a/r0;->O:Z

    .line 3
    invoke-direct {p0}, Lc/a/a/a/r0;->m0()V

    .line 4
    iget-object v1, v0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v3, v1, Lc/a/a/a/h1;->h:Lc/a/a/a/j2/q0;

    .line 5
    iget-object v4, v1, Lc/a/a/a/h1;->i:Lc/a/a/a/l2/o;

    .line 6
    iget-object v1, v1, Lc/a/a/a/h1;->j:Ljava/util/List;

    .line 7
    iget-object v7, v0, Lc/a/a/a/r0;->s:Lc/a/a/a/f1;

    invoke-virtual {v7}, Lc/a/a/a/f1;->r()Z

    move-result v7

    if-eqz v7, :cond_5

    .line 8
    iget-object v1, v0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v1}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v1

    if-nez v1, :cond_2

    .line 9
    sget-object v3, Lc/a/a/a/j2/q0;->a:Lc/a/a/a/j2/q0;

    goto :goto_2

    .line 10
    :cond_2
    invoke-virtual {v1}, Lc/a/a/a/b1;->n()Lc/a/a/a/j2/q0;

    move-result-object v3

    :goto_2
    if-nez v1, :cond_3

    .line 11
    iget-object v4, v0, Lc/a/a/a/r0;->d:Lc/a/a/a/l2/o;

    goto :goto_3

    .line 12
    :cond_3
    invoke-virtual {v1}, Lc/a/a/a/b1;->o()Lc/a/a/a/l2/o;

    move-result-object v4

    .line 13
    :goto_3
    iget-object v7, v4, Lc/a/a/a/l2/o;->c:[Lc/a/a/a/l2/h;

    invoke-direct {p0, v7}, Lc/a/a/a/r0;->r([Lc/a/a/a/l2/h;)Lc/a/b/b/r;

    move-result-object v7

    if-eqz v1, :cond_4

    .line 14
    iget-object v8, v1, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-wide v9, v8, Lc/a/a/a/c1;->c:J

    cmp-long v11, v9, v5

    if-eqz v11, :cond_4

    .line 15
    invoke-virtual {v8, v5, v6}, Lc/a/a/a/c1;->a(J)Lc/a/a/a/c1;

    move-result-object v8

    iput-object v8, v1, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    :cond_4
    move-object v9, v3

    move-object v10, v4

    move-object v11, v7

    goto :goto_4

    .line 16
    :cond_5
    iget-object v7, v0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v7, v7, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    invoke-virtual {p1, v7}, Lc/a/a/a/j2/b0;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    .line 17
    sget-object v1, Lc/a/a/a/j2/q0;->a:Lc/a/a/a/j2/q0;

    .line 18
    iget-object v3, v0, Lc/a/a/a/r0;->d:Lc/a/a/a/l2/o;

    .line 19
    invoke-static {}, Lc/a/b/b/r;->p()Lc/a/b/b/r;

    move-result-object v4

    move-object v9, v1

    move-object v10, v3

    move-object v11, v4

    goto :goto_4

    :cond_6
    move-object v11, v1

    move-object v9, v3

    move-object v10, v4

    .line 20
    :goto_4
    iget-object v1, v0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    .line 21
    invoke-direct {p0}, Lc/a/a/a/r0;->y()J

    move-result-wide v7

    move-object v2, p1

    move-wide v3, p2

    move-wide/from16 v5, p4

    .line 22
    invoke-virtual/range {v1 .. v11}, Lc/a/a/a/h1;->c(Lc/a/a/a/j2/d0$a;JJJLc/a/a/a/j2/q0;Lc/a/a/a/l2/o;Ljava/util/List;)Lc/a/a/a/h1;

    move-result-object v1

    return-object v1
.end method

.method private G0(Lc/a/a/a/r0$b;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->x:Lc/a/a/a/r0$e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lc/a/a/a/r0$e;->b(I)V

    .line 2
    invoke-static {p1}, Lc/a/a/a/r0$b;->a(Lc/a/a/a/r0$b;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 3
    new-instance v0, Lc/a/a/a/r0$h;

    new-instance v1, Lc/a/a/a/n1;

    .line 4
    invoke-static {p1}, Lc/a/a/a/r0$b;->b(Lc/a/a/a/r0$b;)Ljava/util/List;

    move-result-object v2

    .line 5
    invoke-static {p1}, Lc/a/a/a/r0$b;->c(Lc/a/a/a/r0$b;)Lc/a/a/a/j2/n0;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lc/a/a/a/n1;-><init>(Ljava/util/Collection;Lc/a/a/a/j2/n0;)V

    .line 6
    invoke-static {p1}, Lc/a/a/a/r0$b;->a(Lc/a/a/a/r0$b;)I

    move-result v2

    .line 7
    invoke-static {p1}, Lc/a/a/a/r0$b;->d(Lc/a/a/a/r0$b;)J

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lc/a/a/a/r0$h;-><init>(Lc/a/a/a/x1;IJ)V

    iput-object v0, p0, Lc/a/a/a/r0;->L:Lc/a/a/a/r0$h;

    .line 8
    :cond_0
    iget-object v0, p0, Lc/a/a/a/r0;->s:Lc/a/a/a/f1;

    .line 9
    invoke-static {p1}, Lc/a/a/a/r0$b;->b(Lc/a/a/a/r0$b;)Ljava/util/List;

    move-result-object v1

    .line 10
    invoke-static {p1}, Lc/a/a/a/r0$b;->c(Lc/a/a/a/r0$b;)Lc/a/a/a/j2/n0;

    move-result-object p1

    .line 11
    invoke-virtual {v0, v1, p1}, Lc/a/a/a/f1;->C(Ljava/util/List;Lc/a/a/a/j2/n0;)Lc/a/a/a/x1;

    move-result-object p1

    .line 12
    invoke-direct {p0, p1}, Lc/a/a/a/r0;->C(Lc/a/a/a/x1;)V

    return-void
.end method

.method private H()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->o()Lc/a/a/a/b1;

    move-result-object v0

    .line 2
    iget-boolean v1, v0, Lc/a/a/a/b1;->d:Z

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    const/4 v1, 0x0

    .line 3
    :goto_0
    iget-object v3, p0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    array-length v4, v3

    if-ge v1, v4, :cond_3

    .line 4
    aget-object v3, v3, v1

    .line 5
    iget-object v4, v0, Lc/a/a/a/b1;->c:[Lc/a/a/a/j2/l0;

    aget-object v4, v4, v1

    .line 6
    invoke-interface {v3}, Lc/a/a/a/p1;->n()Lc/a/a/a/j2/l0;

    move-result-object v5

    if-ne v5, v4, :cond_2

    if-eqz v4, :cond_1

    .line 7
    invoke-interface {v3}, Lc/a/a/a/p1;->i()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v2

    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method private I()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->i()Lc/a/a/a/b1;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {v0}, Lc/a/a/a/b1;->k()J

    move-result-wide v2

    const-wide/high16 v4, -0x8000000000000000L

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private I0(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/r0;->J:Z

    if-ne p1, v0, :cond_0

    return-void

    .line 2
    :cond_0
    iput-boolean p1, p0, Lc/a/a/a/r0;->J:Z

    .line 3
    iget-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget v1, v0, Lc/a/a/a/h1;->e:I

    if-nez p1, :cond_2

    const/4 v2, 0x4

    if-eq v1, v2, :cond_2

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    iget-object p1, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    const/4 v0, 0x2

    invoke-interface {p1, v0}, Lc/a/a/a/m2/q;->c(I)Z

    goto :goto_1

    .line 5
    :cond_2
    :goto_0
    invoke-virtual {v0, p1}, Lc/a/a/a/h1;->d(Z)Lc/a/a/a/h1;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    :goto_1
    return-void
.end method

.method private static J(Lc/a/a/a/p1;)Z
    .locals 0

    .line 1
    invoke-interface {p0}, Lc/a/a/a/p1;->getState()I

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private J0(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Lc/a/a/a/r0;->z:Z

    .line 2
    invoke-direct {p0}, Lc/a/a/a/r0;->m0()V

    .line 3
    iget-boolean p1, p0, Lc/a/a/a/r0;->A:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {p1}, Lc/a/a/a/d1;->o()Lc/a/a/a/b1;

    move-result-object p1

    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v0

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lc/a/a/a/r0;->w0(Z)V

    const/4 p1, 0x0

    .line 5
    invoke-direct {p0, p1}, Lc/a/a/a/r0;->B(Z)V

    :cond_0
    return-void
.end method

.method private K()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v0

    .line 2
    iget-object v1, v0, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-wide v1, v1, Lc/a/a/a/c1;->e:J

    .line 3
    iget-boolean v0, v0, Lc/a/a/a/b1;->d:Z

    if-eqz v0, :cond_1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v1, v3

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-wide v3, v0, Lc/a/a/a/h1;->s:J

    cmp-long v0, v3, v1

    if-ltz v0, :cond_0

    .line 4
    invoke-direct {p0}, Lc/a/a/a/r0;->W0()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private synthetic L()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/r0;->y:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method private L0(ZIZI)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->x:Lc/a/a/a/r0$e;

    invoke-virtual {v0, p3}, Lc/a/a/a/r0$e;->b(I)V

    .line 2
    iget-object p3, p0, Lc/a/a/a/r0;->x:Lc/a/a/a/r0$e;

    invoke-virtual {p3, p4}, Lc/a/a/a/r0$e;->c(I)V

    .line 3
    iget-object p3, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    invoke-virtual {p3, p1, p2}, Lc/a/a/a/h1;->e(ZI)Lc/a/a/a/h1;

    move-result-object p2

    iput-object p2, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    const/4 p2, 0x0

    .line 4
    iput-boolean p2, p0, Lc/a/a/a/r0;->B:Z

    .line 5
    invoke-direct {p0, p1}, Lc/a/a/a/r0;->a0(Z)V

    .line 6
    invoke-direct {p0}, Lc/a/a/a/r0;->W0()Z

    move-result p1

    if-nez p1, :cond_0

    .line 7
    invoke-direct {p0}, Lc/a/a/a/r0;->d1()V

    .line 8
    invoke-direct {p0}, Lc/a/a/a/r0;->i1()V

    goto :goto_0

    .line 9
    :cond_0
    iget-object p1, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget p1, p1, Lc/a/a/a/h1;->e:I

    const/4 p2, 0x3

    const/4 p3, 0x2

    if-ne p1, p2, :cond_1

    .line 10
    invoke-direct {p0}, Lc/a/a/a/r0;->a1()V

    .line 11
    iget-object p1, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    invoke-interface {p1, p3}, Lc/a/a/a/m2/q;->c(I)Z

    goto :goto_0

    :cond_1
    if-ne p1, p3, :cond_2

    .line 12
    iget-object p1, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    invoke-interface {p1, p3}, Lc/a/a/a/m2/q;->c(I)Z

    :cond_2
    :goto_0
    return-void
.end method

.method private M0(Lc/a/a/a/i1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->n:Lc/a/a/a/n0;

    invoke-virtual {v0, p1}, Lc/a/a/a/n0;->f(Lc/a/a/a/i1;)V

    .line 2
    iget-object p1, p0, Lc/a/a/a/r0;->n:Lc/a/a/a/n0;

    invoke-virtual {p1}, Lc/a/a/a/n0;->c()Lc/a/a/a/i1;

    move-result-object p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lc/a/a/a/r0;->F(Lc/a/a/a/i1;Z)V

    return-void
.end method

.method private synthetic N(Lc/a/a/a/m1;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Lc/a/a/a/r0;->h(Lc/a/a/a/m1;)V
    :try_end_0
    .catch Lc/a/a/a/p0; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "ExoPlayerImplInternal"

    const-string v1, "Unexpected error delivering message on external thread."

    .line 2
    invoke-static {v0, v1, p1}, Lc/a/a/a/m2/t;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 3
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private O0(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iput p1, p0, Lc/a/a/a/r0;->D:I

    .line 2
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    iget-object v1, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v1, v1, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    invoke-virtual {v0, v1, p1}, Lc/a/a/a/d1;->F(Lc/a/a/a/x1;I)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 3
    invoke-direct {p0, p1}, Lc/a/a/a/r0;->w0(Z)V

    :cond_0
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lc/a/a/a/r0;->B(Z)V

    return-void
.end method

.method private P()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lc/a/a/a/r0;->V0()Z

    move-result v0

    iput-boolean v0, p0, Lc/a/a/a/r0;->C:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->i()Lc/a/a/a/b1;

    move-result-object v0

    iget-wide v1, p0, Lc/a/a/a/r0;->M:J

    invoke-virtual {v0, v1, v2}, Lc/a/a/a/b1;->d(J)V

    .line 3
    :cond_0
    invoke-direct {p0}, Lc/a/a/a/r0;->e1()V

    return-void
.end method

.method private P0(Lc/a/a/a/u1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/r0;->v:Lc/a/a/a/u1;

    return-void
.end method

.method private Q()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->x:Lc/a/a/a/r0$e;

    iget-object v1, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    invoke-virtual {v0, v1}, Lc/a/a/a/r0$e;->d(Lc/a/a/a/h1;)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/r0;->x:Lc/a/a/a/r0$e;

    invoke-static {v0}, Lc/a/a/a/r0$e;->a(Lc/a/a/a/r0$e;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lc/a/a/a/r0;->q:Lc/a/a/a/r0$f;

    iget-object v1, p0, Lc/a/a/a/r0;->x:Lc/a/a/a/r0$e;

    invoke-interface {v0, v1}, Lc/a/a/a/r0$f;->a(Lc/a/a/a/r0$e;)V

    .line 4
    new-instance v0, Lc/a/a/a/r0$e;

    iget-object v1, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    invoke-direct {v0, v1}, Lc/a/a/a/r0$e;-><init>(Lc/a/a/a/h1;)V

    iput-object v0, p0, Lc/a/a/a/r0;->x:Lc/a/a/a/r0$e;

    :cond_0
    return-void
.end method

.method private R(JJ)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/r0;->J:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lc/a/a/a/r0;->I:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lc/a/a/a/r0;->u0(JJ)V

    const/4 p1, 0x1

    return p1
.end method

.method private R0(Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Lc/a/a/a/r0;->G:Z

    .line 2
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    iget-object v1, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v1, v1, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    invoke-virtual {v0, v1, p1}, Lc/a/a/a/d1;->G(Lc/a/a/a/x1;Z)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 3
    invoke-direct {p0, p1}, Lc/a/a/a/r0;->w0(Z)V

    :cond_0
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lc/a/a/a/r0;->B(Z)V

    return-void
.end method

.method private S(JJ)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->o:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_e

    iget-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v0, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    invoke-virtual {v0}, Lc/a/a/a/j2/b0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_5

    .line 2
    :cond_0
    iget-boolean v0, p0, Lc/a/a/a/r0;->O:Z

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x1

    sub-long/2addr p1, v0

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lc/a/a/a/r0;->O:Z

    .line 4
    :cond_1
    iget-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v1, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v0, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-object v0, v0, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    .line 5
    invoke-virtual {v1, v0}, Lc/a/a/a/x1;->b(Ljava/lang/Object;)I

    move-result v0

    .line 6
    iget v1, p0, Lc/a/a/a/r0;->N:I

    iget-object v2, p0, Lc/a/a/a/r0;->o:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_2

    .line 7
    iget-object v3, p0, Lc/a/a/a/r0;->o:Ljava/util/ArrayList;

    add-int/lit8 v4, v1, -0x1

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/a/a/a/r0$d;

    goto :goto_0

    :cond_2
    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_4

    .line 8
    iget v4, v3, Lc/a/a/a/r0$d;->b:I

    if-gt v4, v0, :cond_3

    if-ne v4, v0, :cond_4

    iget-wide v3, v3, Lc/a/a/a/r0$d;->c:J

    cmp-long v5, v3, p1

    if-lez v5, :cond_4

    :cond_3
    add-int/lit8 v1, v1, -0x1

    if-lez v1, :cond_2

    .line 9
    iget-object v3, p0, Lc/a/a/a/r0;->o:Ljava/util/ArrayList;

    add-int/lit8 v4, v1, -0x1

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/a/a/a/r0$d;

    goto :goto_0

    .line 10
    :cond_4
    iget-object v3, p0, Lc/a/a/a/r0;->o:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_5

    .line 11
    iget-object v3, p0, Lc/a/a/a/r0;->o:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/a/a/a/r0$d;

    goto :goto_1

    :cond_5
    move-object v3, v2

    :goto_1
    if-eqz v3, :cond_7

    .line 12
    iget-object v4, v3, Lc/a/a/a/r0$d;->d:Ljava/lang/Object;

    if-eqz v4, :cond_7

    iget v4, v3, Lc/a/a/a/r0$d;->b:I

    if-lt v4, v0, :cond_6

    if-ne v4, v0, :cond_7

    iget-wide v4, v3, Lc/a/a/a/r0$d;->c:J

    cmp-long v6, v4, p1

    if-gtz v6, :cond_7

    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 13
    iget-object v3, p0, Lc/a/a/a/r0;->o:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_5

    .line 14
    iget-object v3, p0, Lc/a/a/a/r0;->o:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/a/a/a/r0$d;

    goto :goto_1

    :cond_7
    :goto_2
    if-eqz v3, :cond_d

    .line 15
    iget-object v4, v3, Lc/a/a/a/r0$d;->d:Ljava/lang/Object;

    if-eqz v4, :cond_d

    iget v4, v3, Lc/a/a/a/r0$d;->b:I

    if-ne v4, v0, :cond_d

    iget-wide v4, v3, Lc/a/a/a/r0$d;->c:J

    cmp-long v6, v4, p1

    if-lez v6, :cond_d

    cmp-long v6, v4, p3

    if-gtz v6, :cond_d

    .line 16
    :try_start_0
    iget-object v4, v3, Lc/a/a/a/r0$d;->a:Lc/a/a/a/m1;

    invoke-direct {p0, v4}, Lc/a/a/a/r0;->B0(Lc/a/a/a/m1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    iget-object v4, v3, Lc/a/a/a/r0$d;->a:Lc/a/a/a/m1;

    invoke-virtual {v4}, Lc/a/a/a/m1;->b()Z

    move-result v4

    if-nez v4, :cond_9

    iget-object v3, v3, Lc/a/a/a/r0$d;->a:Lc/a/a/a/m1;

    invoke-virtual {v3}, Lc/a/a/a/m1;->j()Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_3

    :cond_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 18
    :cond_9
    :goto_3
    iget-object v3, p0, Lc/a/a/a/r0;->o:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 19
    :goto_4
    iget-object v3, p0, Lc/a/a/a/r0;->o:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_a

    .line 20
    iget-object v3, p0, Lc/a/a/a/r0;->o:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/a/a/a/r0$d;

    goto :goto_2

    :cond_a
    move-object v3, v2

    goto :goto_2

    :catchall_0
    move-exception p1

    .line 21
    iget-object p2, v3, Lc/a/a/a/r0$d;->a:Lc/a/a/a/m1;

    invoke-virtual {p2}, Lc/a/a/a/m1;->b()Z

    move-result p2

    if-nez p2, :cond_b

    iget-object p2, v3, Lc/a/a/a/r0$d;->a:Lc/a/a/a/m1;

    invoke-virtual {p2}, Lc/a/a/a/m1;->j()Z

    move-result p2

    if-eqz p2, :cond_c

    .line 22
    :cond_b
    iget-object p2, p0, Lc/a/a/a/r0;->o:Ljava/util/ArrayList;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 23
    :cond_c
    throw p1

    .line 24
    :cond_d
    iput v1, p0, Lc/a/a/a/r0;->N:I

    :cond_e
    :goto_5
    return-void
.end method

.method private S0(Lc/a/a/a/j2/n0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->x:Lc/a/a/a/r0$e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lc/a/a/a/r0$e;->b(I)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/r0;->s:Lc/a/a/a/f1;

    invoke-virtual {v0, p1}, Lc/a/a/a/f1;->D(Lc/a/a/a/j2/n0;)Lc/a/a/a/x1;

    move-result-object p1

    .line 3
    invoke-direct {p0, p1}, Lc/a/a/a/r0;->C(Lc/a/a/a/x1;)V

    return-void
.end method

.method private T()V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    iget-wide v1, p0, Lc/a/a/a/r0;->M:J

    invoke-virtual {v0, v1, v2}, Lc/a/a/a/d1;->x(J)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->C()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    iget-wide v1, p0, Lc/a/a/a/r0;->M:J

    iget-object v3, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    invoke-virtual {v0, v1, v2, v3}, Lc/a/a/a/d1;->m(JLc/a/a/a/h1;)Lc/a/a/a/c1;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v4, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    iget-object v5, p0, Lc/a/a/a/r0;->b:[Lc/a/a/a/r1;

    iget-object v6, p0, Lc/a/a/a/r0;->c:Lc/a/a/a/l2/n;

    iget-object v1, p0, Lc/a/a/a/r0;->e:Lc/a/a/a/y0;

    .line 5
    invoke-interface {v1}, Lc/a/a/a/y0;->l()Lcom/google/android/exoplayer2/upstream/e;

    move-result-object v7

    iget-object v8, p0, Lc/a/a/a/r0;->s:Lc/a/a/a/f1;

    iget-object v10, p0, Lc/a/a/a/r0;->d:Lc/a/a/a/l2/o;

    move-object v9, v0

    .line 6
    invoke-virtual/range {v4 .. v10}, Lc/a/a/a/d1;->f([Lc/a/a/a/r1;Lc/a/a/a/l2/n;Lcom/google/android/exoplayer2/upstream/e;Lc/a/a/a/f1;Lc/a/a/a/c1;Lc/a/a/a/l2/o;)Lc/a/a/a/b1;

    move-result-object v1

    .line 7
    iget-object v2, v1, Lc/a/a/a/b1;->a:Lc/a/a/a/j2/a0;

    iget-wide v3, v0, Lc/a/a/a/c1;->b:J

    invoke-interface {v2, p0, v3, v4}, Lc/a/a/a/j2/a0;->l(Lc/a/a/a/j2/a0$a;J)V

    .line 8
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v0

    if-ne v0, v1, :cond_0

    .line 9
    invoke-virtual {v1}, Lc/a/a/a/b1;->m()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lc/a/a/a/r0;->n0(J)V

    :cond_0
    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, v0}, Lc/a/a/a/r0;->B(Z)V

    .line 11
    :cond_1
    iget-boolean v0, p0, Lc/a/a/a/r0;->C:Z

    if-eqz v0, :cond_2

    .line 12
    invoke-direct {p0}, Lc/a/a/a/r0;->I()Z

    move-result v0

    iput-boolean v0, p0, Lc/a/a/a/r0;->C:Z

    .line 13
    invoke-direct {p0}, Lc/a/a/a/r0;->e1()V

    goto :goto_0

    .line 14
    :cond_2
    invoke-direct {p0}, Lc/a/a/a/r0;->P()V

    :goto_0
    return-void
.end method

.method private T0(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget v1, v0, Lc/a/a/a/h1;->e:I

    if-eq v1, p1, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lc/a/a/a/h1;->h(I)Lc/a/a/a/h1;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    :cond_0
    return-void
.end method

.method private U()V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    invoke-direct {p0}, Lc/a/a/a/r0;->U0()Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz v1, :cond_0

    .line 2
    invoke-direct {p0}, Lc/a/a/a/r0;->Q()V

    .line 3
    :cond_0
    iget-object v1, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v1}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v1

    .line 4
    iget-object v2, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v2}, Lc/a/a/a/d1;->a()Lc/a/a/a/b1;

    move-result-object v2

    .line 5
    iget-object v3, v2, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-object v5, v3, Lc/a/a/a/c1;->a:Lc/a/a/a/j2/d0$a;

    iget-wide v6, v3, Lc/a/a/a/c1;->b:J

    iget-wide v8, v3, Lc/a/a/a/c1;->c:J

    move-object v4, p0

    .line 6
    invoke-direct/range {v4 .. v9}, Lc/a/a/a/r0;->G(Lc/a/a/a/j2/d0$a;JJ)Lc/a/a/a/h1;

    move-result-object v3

    iput-object v3, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    .line 7
    iget-object v3, v1, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-boolean v3, v3, Lc/a/a/a/c1;->f:Z

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    const/4 v3, 0x3

    .line 8
    :goto_1
    iget-object v4, p0, Lc/a/a/a/r0;->x:Lc/a/a/a/r0$e;

    invoke-virtual {v4, v3}, Lc/a/a/a/r0$e;->e(I)V

    .line 9
    iget-object v3, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v7, v3, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v2, v2, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-object v6, v2, Lc/a/a/a/c1;->a:Lc/a/a/a/j2/d0$a;

    iget-object v1, v1, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-object v8, v1, Lc/a/a/a/c1;->a:Lc/a/a/a/j2/d0$a;

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v4, p0

    move-object v5, v7

    invoke-direct/range {v4 .. v10}, Lc/a/a/a/r0;->f1(Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;J)V

    .line 10
    invoke-direct {p0}, Lc/a/a/a/r0;->m0()V

    .line 11
    invoke-direct {p0}, Lc/a/a/a/r0;->i1()V

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private U0()Z
    .locals 7

    .line 1
    invoke-direct {p0}, Lc/a/a/a/r0;->W0()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-boolean v0, p0, Lc/a/a/a/r0;->A:Z

    if-eqz v0, :cond_1

    return v1

    .line 3
    :cond_1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v0

    if-nez v0, :cond_2

    return v1

    .line 4
    :cond_2
    invoke-virtual {v0}, Lc/a/a/a/b1;->j()Lc/a/a/a/b1;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 5
    iget-wide v2, p0, Lc/a/a/a/r0;->M:J

    .line 6
    invoke-virtual {v0}, Lc/a/a/a/b1;->m()J

    move-result-wide v4

    cmp-long v6, v2, v4

    if-ltz v6, :cond_3

    iget-boolean v0, v0, Lc/a/a/a/b1;->g:Z

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    :cond_3
    return v1
.end method

.method private V()V
    .locals 10

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->o()Lc/a/a/a/b1;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lc/a/a/a/b1;->j()Lc/a/a/a/b1;

    move-result-object v1

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, 0x0

    if-eqz v1, :cond_9

    iget-boolean v1, p0, Lc/a/a/a/r0;->A:Z

    if-eqz v1, :cond_1

    goto/16 :goto_2

    .line 3
    :cond_1
    invoke-direct {p0}, Lc/a/a/a/r0;->H()Z

    move-result v1

    if-nez v1, :cond_2

    return-void

    .line 4
    :cond_2
    invoke-virtual {v0}, Lc/a/a/a/b1;->j()Lc/a/a/a/b1;

    move-result-object v1

    iget-boolean v1, v1, Lc/a/a/a/b1;->d:Z

    if-nez v1, :cond_3

    iget-wide v5, p0, Lc/a/a/a/r0;->M:J

    .line 5
    invoke-virtual {v0}, Lc/a/a/a/b1;->j()Lc/a/a/a/b1;

    move-result-object v1

    invoke-virtual {v1}, Lc/a/a/a/b1;->m()J

    move-result-wide v7

    cmp-long v1, v5, v7

    if-gez v1, :cond_3

    return-void

    .line 6
    :cond_3
    invoke-virtual {v0}, Lc/a/a/a/b1;->o()Lc/a/a/a/l2/o;

    move-result-object v0

    .line 7
    iget-object v1, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v1}, Lc/a/a/a/d1;->b()Lc/a/a/a/b1;

    move-result-object v1

    .line 8
    invoke-virtual {v1}, Lc/a/a/a/b1;->o()Lc/a/a/a/l2/o;

    move-result-object v5

    .line 9
    iget-boolean v6, v1, Lc/a/a/a/b1;->d:Z

    if-eqz v6, :cond_4

    iget-object v6, v1, Lc/a/a/a/b1;->a:Lc/a/a/a/j2/a0;

    .line 10
    invoke-interface {v6}, Lc/a/a/a/j2/a0;->k()J

    move-result-wide v6

    cmp-long v8, v6, v2

    if-eqz v8, :cond_4

    .line 11
    invoke-virtual {v1}, Lc/a/a/a/b1;->m()J

    move-result-wide v0

    .line 12
    invoke-direct {p0, v0, v1}, Lc/a/a/a/r0;->D0(J)V

    return-void

    :cond_4
    const/4 v2, 0x0

    .line 13
    :goto_0
    iget-object v3, p0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    array-length v3, v3

    if-ge v2, v3, :cond_8

    .line 14
    invoke-virtual {v0, v2}, Lc/a/a/a/l2/o;->c(I)Z

    move-result v3

    .line 15
    invoke-virtual {v5, v2}, Lc/a/a/a/l2/o;->c(I)Z

    move-result v6

    if-eqz v3, :cond_7

    .line 16
    iget-object v3, p0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    aget-object v3, v3, v2

    invoke-interface {v3}, Lc/a/a/a/p1;->t()Z

    move-result v3

    if-nez v3, :cond_7

    .line 17
    iget-object v3, p0, Lc/a/a/a/r0;->b:[Lc/a/a/a/r1;

    aget-object v3, v3, v2

    invoke-interface {v3}, Lc/a/a/a/r1;->g()I

    move-result v3

    const/4 v7, 0x7

    if-ne v3, v7, :cond_5

    const/4 v3, 0x1

    goto :goto_1

    :cond_5
    const/4 v3, 0x0

    .line 18
    :goto_1
    iget-object v7, v0, Lc/a/a/a/l2/o;->b:[Lc/a/a/a/s1;

    aget-object v7, v7, v2

    .line 19
    iget-object v8, v5, Lc/a/a/a/l2/o;->b:[Lc/a/a/a/s1;

    aget-object v8, v8, v2

    if-eqz v6, :cond_6

    .line 20
    invoke-virtual {v8, v7}, Lc/a/a/a/s1;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    if-eqz v3, :cond_7

    .line 21
    :cond_6
    iget-object v3, p0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    aget-object v3, v3, v2

    .line 22
    invoke-virtual {v1}, Lc/a/a/a/b1;->m()J

    move-result-wide v6

    .line 23
    invoke-direct {p0, v3, v6, v7}, Lc/a/a/a/r0;->E0(Lc/a/a/a/p1;J)V

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_8
    return-void

    .line 24
    :cond_9
    :goto_2
    iget-object v1, v0, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-boolean v1, v1, Lc/a/a/a/c1;->h:Z

    if-nez v1, :cond_a

    iget-boolean v1, p0, Lc/a/a/a/r0;->A:Z

    if-eqz v1, :cond_d

    .line 25
    :cond_a
    :goto_3
    iget-object v1, p0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    array-length v5, v1

    if-ge v4, v5, :cond_d

    .line 26
    aget-object v1, v1, v4

    .line 27
    iget-object v5, v0, Lc/a/a/a/b1;->c:[Lc/a/a/a/j2/l0;

    aget-object v5, v5, v4

    if-eqz v5, :cond_c

    .line 28
    invoke-interface {v1}, Lc/a/a/a/p1;->n()Lc/a/a/a/j2/l0;

    move-result-object v6

    if-ne v6, v5, :cond_c

    .line 29
    invoke-interface {v1}, Lc/a/a/a/p1;->i()Z

    move-result v5

    if-eqz v5, :cond_c

    .line 30
    iget-object v5, v0, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-wide v5, v5, Lc/a/a/a/c1;->e:J

    cmp-long v7, v5, v2

    if-eqz v7, :cond_b

    const-wide/high16 v7, -0x8000000000000000L

    cmp-long v9, v5, v7

    if-eqz v9, :cond_b

    .line 31
    invoke-virtual {v0}, Lc/a/a/a/b1;->l()J

    move-result-wide v5

    iget-object v7, v0, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-wide v7, v7, Lc/a/a/a/c1;->e:J

    add-long/2addr v5, v7

    goto :goto_4

    :cond_b
    move-wide v5, v2

    .line 32
    :goto_4
    invoke-direct {p0, v1, v5, v6}, Lc/a/a/a/r0;->E0(Lc/a/a/a/p1;J)V

    :cond_c
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_d
    return-void
.end method

.method private V0()Z
    .locals 9

    .line 1
    invoke-direct {p0}, Lc/a/a/a/r0;->I()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->i()Lc/a/a/a/b1;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lc/a/a/a/b1;->k()J

    move-result-wide v1

    invoke-direct {p0, v1, v2}, Lc/a/a/a/r0;->z(J)J

    move-result-wide v6

    .line 4
    iget-object v1, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v1}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 5
    iget-wide v1, p0, Lc/a/a/a/r0;->M:J

    invoke-virtual {v0, v1, v2}, Lc/a/a/a/b1;->y(J)J

    move-result-wide v0

    move-wide v4, v0

    goto :goto_0

    .line 6
    :cond_1
    iget-wide v1, p0, Lc/a/a/a/r0;->M:J

    .line 7
    invoke-virtual {v0, v1, v2}, Lc/a/a/a/b1;->y(J)J

    move-result-wide v1

    iget-object v0, v0, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-wide v3, v0, Lc/a/a/a/c1;->b:J

    sub-long/2addr v1, v3

    move-wide v4, v1

    .line 8
    :goto_0
    iget-object v3, p0, Lc/a/a/a/r0;->e:Lc/a/a/a/y0;

    iget-object v0, p0, Lc/a/a/a/r0;->n:Lc/a/a/a/n0;

    .line 9
    invoke-virtual {v0}, Lc/a/a/a/n0;->c()Lc/a/a/a/i1;

    move-result-object v0

    iget v8, v0, Lc/a/a/a/i1;->b:F

    .line 10
    invoke-interface/range {v3 .. v8}, Lc/a/a/a/y0;->k(JJF)Z

    move-result v0

    return v0
.end method

.method private W()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->o()Lc/a/a/a/b1;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v1, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    .line 3
    invoke-virtual {v1}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v1

    if-eq v1, v0, :cond_1

    iget-boolean v0, v0, Lc/a/a/a/b1;->g:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-direct {p0}, Lc/a/a/a/r0;->j0()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    invoke-direct {p0}, Lc/a/a/a/r0;->n()V

    :cond_1
    :goto_0
    return-void
.end method

.method private W0()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-boolean v1, v0, Lc/a/a/a/h1;->l:Z

    if-eqz v1, :cond_0

    iget v0, v0, Lc/a/a/a/h1;->m:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private X()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->s:Lc/a/a/a/f1;

    invoke-virtual {v0}, Lc/a/a/a/f1;->h()Lc/a/a/a/x1;

    move-result-object v0

    invoke-direct {p0, v0}, Lc/a/a/a/r0;->C(Lc/a/a/a/x1;)V

    return-void
.end method

.method private X0(Z)Z
    .locals 12

    .line 1
    iget v0, p0, Lc/a/a/a/r0;->K:I

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lc/a/a/a/r0;->K()Z

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    .line 3
    :cond_1
    iget-object p1, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-boolean v1, p1, Lc/a/a/a/h1;->g:Z

    const/4 v2, 0x1

    if-nez v1, :cond_2

    return v2

    .line 4
    :cond_2
    iget-object p1, p1, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v1, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v1}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v1

    iget-object v1, v1, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-object v1, v1, Lc/a/a/a/c1;->a:Lc/a/a/a/j2/d0$a;

    invoke-direct {p0, p1, v1}, Lc/a/a/a/r0;->Y0(Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 5
    iget-object p1, p0, Lc/a/a/a/r0;->t:Lc/a/a/a/x0;

    invoke-interface {p1}, Lc/a/a/a/x0;->e()J

    move-result-wide v3

    goto :goto_0

    :cond_3
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    move-wide v10, v3

    .line 6
    iget-object p1, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {p1}, Lc/a/a/a/d1;->i()Lc/a/a/a/b1;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lc/a/a/a/b1;->q()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p1, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-boolean v1, v1, Lc/a/a/a/c1;->h:Z

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    .line 8
    :goto_1
    iget-object v3, p1, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-object v3, v3, Lc/a/a/a/c1;->a:Lc/a/a/a/j2/d0$a;

    invoke-virtual {v3}, Lc/a/a/a/j2/b0;->b()Z

    move-result v3

    if-eqz v3, :cond_5

    iget-boolean p1, p1, Lc/a/a/a/b1;->d:Z

    if-nez p1, :cond_5

    const/4 p1, 0x1

    goto :goto_2

    :cond_5
    const/4 p1, 0x0

    :goto_2
    if-nez v1, :cond_6

    if-nez p1, :cond_6

    .line 9
    iget-object v5, p0, Lc/a/a/a/r0;->e:Lc/a/a/a/y0;

    .line 10
    invoke-direct {p0}, Lc/a/a/a/r0;->y()J

    move-result-wide v6

    iget-object p1, p0, Lc/a/a/a/r0;->n:Lc/a/a/a/n0;

    .line 11
    invoke-virtual {p1}, Lc/a/a/a/n0;->c()Lc/a/a/a/i1;

    move-result-object p1

    iget v8, p1, Lc/a/a/a/i1;->b:F

    iget-boolean v9, p0, Lc/a/a/a/r0;->B:Z

    .line 12
    invoke-interface/range {v5 .. v11}, Lc/a/a/a/y0;->j(JFZJ)Z

    move-result p1

    if-eqz p1, :cond_7

    :cond_6
    const/4 v0, 0x1

    :cond_7
    return v0
.end method

.method private Y(Lc/a/a/a/r0$c;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->x:Lc/a/a/a/r0$e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lc/a/a/a/r0$e;->b(I)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/r0;->s:Lc/a/a/a/f1;

    iget v1, p1, Lc/a/a/a/r0$c;->a:I

    iget v2, p1, Lc/a/a/a/r0$c;->b:I

    iget v3, p1, Lc/a/a/a/r0$c;->c:I

    iget-object p1, p1, Lc/a/a/a/r0$c;->d:Lc/a/a/a/j2/n0;

    .line 3
    invoke-virtual {v0, v1, v2, v3, p1}, Lc/a/a/a/f1;->v(IIILc/a/a/a/j2/n0;)Lc/a/a/a/x1;

    move-result-object p1

    .line 4
    invoke-direct {p0, p1}, Lc/a/a/a/r0;->C(Lc/a/a/a/x1;)V

    return-void
.end method

.method private Y0(Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;)Z
    .locals 4

    .line 1
    invoke-virtual {p2}, Lc/a/a/a/j2/b0;->b()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lc/a/a/a/x1;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p2, p2, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    iget-object v0, p0, Lc/a/a/a/r0;->k:Lc/a/a/a/x1$b;

    invoke-virtual {p1, p2, v0}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object p2

    iget p2, p2, Lc/a/a/a/x1$b;->c:I

    .line 3
    iget-object v0, p0, Lc/a/a/a/r0;->j:Lc/a/a/a/x1$c;

    invoke-virtual {p1, p2, v0}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    .line 4
    iget-object p1, p0, Lc/a/a/a/r0;->j:Lc/a/a/a/x1$c;

    invoke-virtual {p1}, Lc/a/a/a/x1$c;->f()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lc/a/a/a/r0;->j:Lc/a/a/a/x1$c;

    iget-boolean p2, p1, Lc/a/a/a/x1$c;->k:Z

    if-eqz p2, :cond_1

    iget-wide p1, p1, Lc/a/a/a/x1$c;->h:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p1, v2

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    :goto_0
    return v1
.end method

.method private Z()V
    .locals 5

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {v0}, Lc/a/a/a/b1;->o()Lc/a/a/a/l2/o;

    move-result-object v1

    iget-object v1, v1, Lc/a/a/a/l2/o;->c:[Lc/a/a/a/l2/h;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    if-eqz v4, :cond_0

    .line 3
    invoke-interface {v4}, Lc/a/a/a/l2/h;->q()V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 4
    :cond_1
    invoke-virtual {v0}, Lc/a/a/a/b1;->j()Lc/a/a/a/b1;

    move-result-object v0

    goto :goto_0

    :cond_2
    return-void
.end method

.method private static Z0(Lc/a/a/a/h1;Lc/a/a/a/x1$b;Lc/a/a/a/x1$c;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    .line 2
    iget-object p0, p0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    .line 3
    invoke-virtual {v0}, Lc/a/a/a/j2/b0;->b()Z

    move-result v1

    if-nez v1, :cond_1

    .line 4
    invoke-virtual {p0}, Lc/a/a/a/x1;->q()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, v0, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    .line 5
    invoke-virtual {p0, v0, p1}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object p1

    iget p1, p1, Lc/a/a/a/x1$b;->c:I

    .line 6
    invoke-virtual {p0, p1, p2}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    move-result-object p0

    iget-boolean p0, p0, Lc/a/a/a/x1$c;->n:Z

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private a0(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {v0}, Lc/a/a/a/b1;->o()Lc/a/a/a/l2/o;

    move-result-object v1

    iget-object v1, v1, Lc/a/a/a/l2/o;->c:[Lc/a/a/a/l2/h;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    if-eqz v4, :cond_0

    .line 3
    invoke-interface {v4, p1}, Lc/a/a/a/l2/h;->c(Z)V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 4
    :cond_1
    invoke-virtual {v0}, Lc/a/a/a/b1;->j()Lc/a/a/a/b1;

    move-result-object v0

    goto :goto_0

    :cond_2
    return-void
.end method

.method private a1()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/r0;->B:Z

    .line 2
    iget-object v1, p0, Lc/a/a/a/r0;->n:Lc/a/a/a/n0;

    invoke-virtual {v1}, Lc/a/a/a/n0;->g()V

    .line 3
    iget-object v1, p0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    array-length v2, v1

    :goto_0
    if-ge v0, v2, :cond_1

    aget-object v3, v1, v0

    .line 4
    invoke-static {v3}, Lc/a/a/a/r0;->J(Lc/a/a/a/p1;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 5
    invoke-interface {v3}, Lc/a/a/a/p1;->start()V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private b0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {v0}, Lc/a/a/a/b1;->o()Lc/a/a/a/l2/o;

    move-result-object v1

    iget-object v1, v1, Lc/a/a/a/l2/o;->c:[Lc/a/a/a/l2/h;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    if-eqz v4, :cond_0

    .line 3
    invoke-interface {v4}, Lc/a/a/a/l2/h;->r()V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 4
    :cond_1
    invoke-virtual {v0}, Lc/a/a/a/b1;->j()Lc/a/a/a/b1;

    move-result-object v0

    goto :goto_0

    :cond_2
    return-void
.end method

.method static synthetic c(Lc/a/a/a/r0;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lc/a/a/a/r0;->I:Z

    return p1
.end method

.method private c1(ZZ)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_1

    .line 1
    iget-boolean p1, p0, Lc/a/a/a/r0;->H:Z

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-direct {p0, p1, v0, v1, v0}, Lc/a/a/a/r0;->l0(ZZZZ)V

    .line 2
    iget-object p1, p0, Lc/a/a/a/r0;->x:Lc/a/a/a/r0$e;

    invoke-virtual {p1, p2}, Lc/a/a/a/r0$e;->b(I)V

    .line 3
    iget-object p1, p0, Lc/a/a/a/r0;->e:Lc/a/a/a/y0;

    invoke-interface {p1}, Lc/a/a/a/y0;->m()V

    .line 4
    invoke-direct {p0, v1}, Lc/a/a/a/r0;->T0(I)V

    return-void
.end method

.method private d(Lc/a/a/a/r0$b;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->x:Lc/a/a/a/r0$e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lc/a/a/a/r0$e;->b(I)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/r0;->s:Lc/a/a/a/f1;

    const/4 v1, -0x1

    if-ne p2, v1, :cond_0

    .line 3
    invoke-virtual {v0}, Lc/a/a/a/f1;->p()I

    move-result p2

    .line 4
    :cond_0
    invoke-static {p1}, Lc/a/a/a/r0$b;->b(Lc/a/a/a/r0$b;)Ljava/util/List;

    move-result-object v1

    .line 5
    invoke-static {p1}, Lc/a/a/a/r0$b;->c(Lc/a/a/a/r0$b;)Lc/a/a/a/j2/n0;

    move-result-object p1

    .line 6
    invoke-virtual {v0, p2, v1, p1}, Lc/a/a/a/f1;->e(ILjava/util/List;Lc/a/a/a/j2/n0;)Lc/a/a/a/x1;

    move-result-object p1

    .line 7
    invoke-direct {p0, p1}, Lc/a/a/a/r0;->C(Lc/a/a/a/x1;)V

    return-void
.end method

.method private d1()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->n:Lc/a/a/a/n0;

    invoke-virtual {v0}, Lc/a/a/a/n0;->h()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 3
    invoke-static {v3}, Lc/a/a/a/r0;->J(Lc/a/a/a/p1;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 4
    invoke-direct {p0, v3}, Lc/a/a/a/r0;->q(Lc/a/a/a/p1;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private e0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->x:Lc/a/a/a/r0$e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lc/a/a/a/r0$e;->b(I)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0, v0, v0, v1}, Lc/a/a/a/r0;->l0(ZZZZ)V

    .line 3
    iget-object v0, p0, Lc/a/a/a/r0;->e:Lc/a/a/a/y0;

    invoke-interface {v0}, Lc/a/a/a/y0;->f()V

    .line 4
    iget-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v0, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    invoke-virtual {v0}, Lc/a/a/a/x1;->q()Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    invoke-direct {p0, v0}, Lc/a/a/a/r0;->T0(I)V

    .line 5
    iget-object v0, p0, Lc/a/a/a/r0;->s:Lc/a/a/a/f1;

    iget-object v2, p0, Lc/a/a/a/r0;->f:Lcom/google/android/exoplayer2/upstream/g;

    invoke-interface {v2}, Lcom/google/android/exoplayer2/upstream/g;->a()Lcom/google/android/exoplayer2/upstream/e0;

    move-result-object v2

    invoke-virtual {v0, v2}, Lc/a/a/a/f1;->w(Lcom/google/android/exoplayer2/upstream/e0;)V

    .line 6
    iget-object v0, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    invoke-interface {v0, v1}, Lc/a/a/a/m2/q;->c(I)Z

    return-void
.end method

.method private e1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->i()Lc/a/a/a/b1;

    move-result-object v0

    .line 2
    iget-boolean v1, p0, Lc/a/a/a/r0;->C:Z

    if-nez v1, :cond_1

    if-eqz v0, :cond_0

    iget-object v0, v0, Lc/a/a/a/b1;->a:Lc/a/a/a/j2/a0;

    .line 3
    invoke-interface {v0}, Lc/a/a/a/j2/a0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 4
    :goto_1
    iget-object v1, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-boolean v2, v1, Lc/a/a/a/h1;->g:Z

    if-eq v0, v2, :cond_2

    .line 5
    invoke-virtual {v1, v0}, Lc/a/a/a/h1;->a(Z)Lc/a/a/a/h1;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    :cond_2
    return-void
.end method

.method private f1(Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;J)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/x1;->q()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-direct {p0, p1, p2}, Lc/a/a/a/r0;->Y0(Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p2, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    iget-object v1, p0, Lc/a/a/a/r0;->k:Lc/a/a/a/x1$b;

    invoke-virtual {p1, v0, v1}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object v0

    iget v0, v0, Lc/a/a/a/x1$b;->c:I

    .line 3
    iget-object v1, p0, Lc/a/a/a/r0;->j:Lc/a/a/a/x1$c;

    invoke-virtual {p1, v0, v1}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    .line 4
    iget-object v0, p0, Lc/a/a/a/r0;->t:Lc/a/a/a/x0;

    iget-object v1, p0, Lc/a/a/a/r0;->j:Lc/a/a/a/x1$c;

    iget-object v1, v1, Lc/a/a/a/x1$c;->m:Lc/a/a/a/z0$f;

    invoke-static {v1}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/z0$f;

    invoke-interface {v0, v1}, Lc/a/a/a/x0;->b(Lc/a/a/a/z0$f;)V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p5, v0

    if-eqz v2, :cond_1

    .line 5
    iget-object p3, p0, Lc/a/a/a/r0;->t:Lc/a/a/a/x0;

    iget-object p2, p2, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    .line 6
    invoke-direct {p0, p1, p2, p5, p6}, Lc/a/a/a/r0;->u(Lc/a/a/a/x1;Ljava/lang/Object;J)J

    move-result-wide p1

    .line 7
    invoke-interface {p3, p1, p2}, Lc/a/a/a/x0;->d(J)V

    goto :goto_0

    .line 8
    :cond_1
    iget-object p1, p0, Lc/a/a/a/r0;->j:Lc/a/a/a/x1$c;

    iget-object p1, p1, Lc/a/a/a/x1$c;->c:Ljava/lang/Object;

    const/4 p2, 0x0

    .line 9
    invoke-virtual {p3}, Lc/a/a/a/x1;->q()Z

    move-result p5

    if-nez p5, :cond_2

    .line 10
    iget-object p2, p4, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    iget-object p4, p0, Lc/a/a/a/r0;->k:Lc/a/a/a/x1$b;

    invoke-virtual {p3, p2, p4}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object p2

    iget p2, p2, Lc/a/a/a/x1$b;->c:I

    .line 11
    iget-object p4, p0, Lc/a/a/a/r0;->j:Lc/a/a/a/x1$c;

    invoke-virtual {p3, p2, p4}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    move-result-object p2

    iget-object p2, p2, Lc/a/a/a/x1$c;->c:Ljava/lang/Object;

    .line 12
    :cond_2
    invoke-static {p2, p1}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 13
    iget-object p1, p0, Lc/a/a/a/r0;->t:Lc/a/a/a/x0;

    invoke-interface {p1, v0, v1}, Lc/a/a/a/x0;->d(J)V

    :cond_3
    :goto_0
    return-void

    .line 14
    :cond_4
    :goto_1
    iget-object p1, p0, Lc/a/a/a/r0;->n:Lc/a/a/a/n0;

    invoke-virtual {p1}, Lc/a/a/a/n0;->c()Lc/a/a/a/i1;

    move-result-object p1

    iget p1, p1, Lc/a/a/a/i1;->b:F

    iget-object p2, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object p2, p2, Lc/a/a/a/h1;->n:Lc/a/a/a/i1;

    iget p3, p2, Lc/a/a/a/i1;->b:F

    cmpl-float p1, p1, p3

    if-eqz p1, :cond_5

    .line 15
    iget-object p1, p0, Lc/a/a/a/r0;->n:Lc/a/a/a/n0;

    invoke-virtual {p1, p2}, Lc/a/a/a/n0;->f(Lc/a/a/a/i1;)V

    :cond_5
    return-void
.end method

.method private g(Lc/a/a/a/p0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-boolean v0, p1, Lc/a/a/a/p0;->h:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget v0, p1, Lc/a/a/a/p0;->a:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lc/a/a/a/m2/f;->a(Z)V

    .line 2
    :try_start_0
    invoke-direct {p0, v1}, Lc/a/a/a/r0;->w0(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Exception;->addSuppressed(Ljava/lang/Throwable;)V

    .line 4
    throw p1
.end method

.method private g0()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, v0, v1, v0, v1}, Lc/a/a/a/r0;->l0(ZZZZ)V

    .line 2
    iget-object v1, p0, Lc/a/a/a/r0;->e:Lc/a/a/a/y0;

    invoke-interface {v1}, Lc/a/a/a/y0;->i()V

    .line 3
    invoke-direct {p0, v0}, Lc/a/a/a/r0;->T0(I)V

    .line 4
    iget-object v1, p0, Lc/a/a/a/r0;->h:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->quit()Z

    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iput-boolean v0, p0, Lc/a/a/a/r0;->y:Z

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 8
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private g1(Lc/a/a/a/j2/q0;Lc/a/a/a/l2/o;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->e:Lc/a/a/a/y0;

    iget-object v1, p0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    iget-object p2, p2, Lc/a/a/a/l2/o;->c:[Lc/a/a/a/l2/h;

    invoke-interface {v0, v1, p1, p2}, Lc/a/a/a/y0;->g([Lc/a/a/a/p1;Lc/a/a/a/j2/q0;[Lc/a/a/a/l2/h;)V

    return-void
.end method

.method private h(Lc/a/a/a/m1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/m1;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    :try_start_0
    invoke-virtual {p1}, Lc/a/a/a/m1;->f()Lc/a/a/a/m1$b;

    move-result-object v1

    invoke-virtual {p1}, Lc/a/a/a/m1;->h()I

    move-result v2

    invoke-virtual {p1}, Lc/a/a/a/m1;->d()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lc/a/a/a/m1$b;->m(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    invoke-virtual {p1, v0}, Lc/a/a/a/m1;->k(Z)V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {p1, v0}, Lc/a/a/a/m1;->k(Z)V

    .line 4
    throw v1
.end method

.method private h0(IILc/a/a/a/j2/n0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->x:Lc/a/a/a/r0$e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lc/a/a/a/r0$e;->b(I)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/r0;->s:Lc/a/a/a/f1;

    invoke-virtual {v0, p1, p2, p3}, Lc/a/a/a/f1;->A(IILc/a/a/a/j2/n0;)Lc/a/a/a/x1;

    move-result-object p1

    .line 3
    invoke-direct {p0, p1}, Lc/a/a/a/r0;->C(Lc/a/a/a/x1;)V

    return-void
.end method

.method private h1()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v0, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    invoke-virtual {v0}, Lc/a/a/a/x1;->q()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lc/a/a/a/r0;->s:Lc/a/a/a/f1;

    invoke-virtual {v0}, Lc/a/a/a/f1;->r()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-direct {p0}, Lc/a/a/a/r0;->T()V

    .line 3
    invoke-direct {p0}, Lc/a/a/a/r0;->V()V

    .line 4
    invoke-direct {p0}, Lc/a/a/a/r0;->W()V

    .line 5
    invoke-direct {p0}, Lc/a/a/a/r0;->U()V

    :cond_1
    :goto_0
    return-void
.end method

.method private i(Lc/a/a/a/p1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lc/a/a/a/r0;->J(Lc/a/a/a/p1;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lc/a/a/a/r0;->n:Lc/a/a/a/n0;

    invoke-virtual {v0, p1}, Lc/a/a/a/n0;->a(Lc/a/a/a/p1;)V

    .line 3
    invoke-direct {p0, p1}, Lc/a/a/a/r0;->q(Lc/a/a/a/p1;)V

    .line 4
    invoke-interface {p1}, Lc/a/a/a/p1;->d()V

    .line 5
    iget p1, p0, Lc/a/a/a/r0;->K:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lc/a/a/a/r0;->K:I

    return-void
.end method

.method private i1()V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-boolean v1, v0, Lc/a/a/a/b1;->d:Z

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v1, :cond_1

    .line 3
    iget-object v1, v0, Lc/a/a/a/b1;->a:Lc/a/a/a/j2/a0;

    invoke-interface {v1}, Lc/a/a/a/j2/a0;->k()J

    move-result-wide v4

    move-wide v8, v4

    goto :goto_0

    :cond_1
    move-wide v8, v2

    :goto_0
    const/4 v1, 0x0

    cmp-long v4, v8, v2

    if-eqz v4, :cond_2

    .line 4
    invoke-direct {p0, v8, v9}, Lc/a/a/a/r0;->n0(J)V

    .line 5
    iget-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-wide v2, v0, Lc/a/a/a/h1;->s:J

    cmp-long v0, v8, v2

    if-eqz v0, :cond_4

    .line 6
    iget-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v7, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-wide v10, v0, Lc/a/a/a/h1;->d:J

    move-object v6, p0

    .line 7
    invoke-direct/range {v6 .. v11}, Lc/a/a/a/r0;->G(Lc/a/a/a/j2/d0$a;JJ)Lc/a/a/a/h1;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    .line 8
    iget-object v0, p0, Lc/a/a/a/r0;->x:Lc/a/a/a/r0$e;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Lc/a/a/a/r0$e;->e(I)V

    goto :goto_2

    .line 9
    :cond_2
    iget-object v2, p0, Lc/a/a/a/r0;->n:Lc/a/a/a/n0;

    iget-object v3, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    .line 10
    invoke-virtual {v3}, Lc/a/a/a/d1;->o()Lc/a/a/a/b1;

    move-result-object v3

    if-eq v0, v3, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    .line 11
    :goto_1
    invoke-virtual {v2, v3}, Lc/a/a/a/n0;->i(Z)J

    move-result-wide v2

    iput-wide v2, p0, Lc/a/a/a/r0;->M:J

    .line 12
    invoke-virtual {v0, v2, v3}, Lc/a/a/a/b1;->y(J)J

    move-result-wide v2

    .line 13
    iget-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-wide v4, v0, Lc/a/a/a/h1;->s:J

    invoke-direct {p0, v4, v5, v2, v3}, Lc/a/a/a/r0;->S(JJ)V

    .line 14
    iget-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iput-wide v2, v0, Lc/a/a/a/h1;->s:J

    .line 15
    :cond_4
    :goto_2
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->i()Lc/a/a/a/b1;

    move-result-object v0

    .line 16
    iget-object v2, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    invoke-virtual {v0}, Lc/a/a/a/b1;->i()J

    move-result-wide v3

    iput-wide v3, v2, Lc/a/a/a/h1;->q:J

    .line 17
    iget-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    invoke-direct {p0}, Lc/a/a/a/r0;->y()J

    move-result-wide v2

    iput-wide v2, v0, Lc/a/a/a/h1;->r:J

    .line 18
    iget-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-boolean v2, v0, Lc/a/a/a/h1;->l:Z

    if-eqz v2, :cond_5

    iget v2, v0, Lc/a/a/a/h1;->e:I

    const/4 v3, 0x3

    if-ne v2, v3, :cond_5

    iget-object v2, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v0, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    .line 19
    invoke-direct {p0, v2, v0}, Lc/a/a/a/r0;->Y0(Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v0, v0, Lc/a/a/a/h1;->n:Lc/a/a/a/i1;

    iget v0, v0, Lc/a/a/a/i1;->b:F

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v2

    if-nez v0, :cond_5

    .line 20
    iget-object v0, p0, Lc/a/a/a/r0;->t:Lc/a/a/a/x0;

    .line 21
    invoke-direct {p0}, Lc/a/a/a/r0;->s()J

    move-result-wide v2

    invoke-direct {p0}, Lc/a/a/a/r0;->y()J

    move-result-wide v4

    .line 22
    invoke-interface {v0, v2, v3, v4, v5}, Lc/a/a/a/x0;->c(JJ)F

    move-result v0

    .line 23
    iget-object v2, p0, Lc/a/a/a/r0;->n:Lc/a/a/a/n0;

    invoke-virtual {v2}, Lc/a/a/a/n0;->c()Lc/a/a/a/i1;

    move-result-object v2

    iget v2, v2, Lc/a/a/a/i1;->b:F

    cmpl-float v2, v2, v0

    if-eqz v2, :cond_5

    .line 24
    iget-object v2, p0, Lc/a/a/a/r0;->n:Lc/a/a/a/n0;

    iget-object v3, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v3, v3, Lc/a/a/a/h1;->n:Lc/a/a/a/i1;

    invoke-virtual {v3, v0}, Lc/a/a/a/i1;->b(F)Lc/a/a/a/i1;

    move-result-object v0

    invoke-virtual {v2, v0}, Lc/a/a/a/n0;->f(Lc/a/a/a/i1;)V

    .line 25
    iget-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v0, v0, Lc/a/a/a/h1;->n:Lc/a/a/a/i1;

    iget-object v2, p0, Lc/a/a/a/r0;->n:Lc/a/a/a/n0;

    .line 26
    invoke-virtual {v2}, Lc/a/a/a/n0;->c()Lc/a/a/a/i1;

    move-result-object v2

    iget v2, v2, Lc/a/a/a/i1;->b:F

    .line 27
    invoke-direct {p0, v0, v2, v1, v1}, Lc/a/a/a/r0;->E(Lc/a/a/a/i1;FZZ)V

    :cond_5
    return-void
.end method

.method private j0()Z
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->o()Lc/a/a/a/b1;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lc/a/a/a/b1;->o()Lc/a/a/a/l2/o;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 3
    :goto_0
    iget-object v5, p0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    array-length v6, v5

    const/4 v7, 0x1

    if-ge v3, v6, :cond_5

    .line 4
    aget-object v8, v5, v3

    .line 5
    invoke-static {v8}, Lc/a/a/a/r0;->J(Lc/a/a/a/p1;)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_2

    .line 6
    :cond_0
    invoke-interface {v8}, Lc/a/a/a/p1;->n()Lc/a/a/a/j2/l0;

    move-result-object v5

    iget-object v6, v0, Lc/a/a/a/b1;->c:[Lc/a/a/a/j2/l0;

    aget-object v6, v6, v3

    if-eq v5, v6, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 7
    :goto_1
    invoke-virtual {v1, v3}, Lc/a/a/a/l2/o;->c(I)Z

    move-result v6

    if-eqz v6, :cond_2

    if-nez v5, :cond_2

    goto :goto_2

    .line 8
    :cond_2
    invoke-interface {v8}, Lc/a/a/a/p1;->t()Z

    move-result v5

    if-nez v5, :cond_3

    .line 9
    iget-object v5, v1, Lc/a/a/a/l2/o;->c:[Lc/a/a/a/l2/h;

    aget-object v5, v5, v3

    invoke-static {v5}, Lc/a/a/a/r0;->t(Lc/a/a/a/l2/h;)[Lc/a/a/a/u0;

    move-result-object v9

    .line 10
    iget-object v5, v0, Lc/a/a/a/b1;->c:[Lc/a/a/a/j2/l0;

    aget-object v10, v5, v3

    .line 11
    invoke-virtual {v0}, Lc/a/a/a/b1;->m()J

    move-result-wide v11

    .line 12
    invoke-virtual {v0}, Lc/a/a/a/b1;->l()J

    move-result-wide v13

    .line 13
    invoke-interface/range {v8 .. v14}, Lc/a/a/a/p1;->o([Lc/a/a/a/u0;Lc/a/a/a/j2/l0;JJ)V

    goto :goto_2

    .line 14
    :cond_3
    invoke-interface {v8}, Lc/a/a/a/p1;->b()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 15
    invoke-direct {p0, v8}, Lc/a/a/a/r0;->i(Lc/a/a/a/p1;)V

    goto :goto_2

    :cond_4
    const/4 v4, 0x1

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    xor-int/lit8 v0, v4, 0x1

    return v0
.end method

.method private j1(F)V
    .locals 5

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {v0}, Lc/a/a/a/b1;->o()Lc/a/a/a/l2/o;

    move-result-object v1

    iget-object v1, v1, Lc/a/a/a/l2/o;->c:[Lc/a/a/a/l2/h;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    if-eqz v4, :cond_0

    .line 3
    invoke-interface {v4, p1}, Lc/a/a/a/l2/h;->o(F)V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 4
    :cond_1
    invoke-virtual {v0}, Lc/a/a/a/b1;->j()Lc/a/a/a/b1;

    move-result-object v0

    goto :goto_0

    :cond_2
    return-void
.end method

.method private k()V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;,
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lc/a/a/a/r0;->p:Lc/a/a/a/m2/g;

    invoke-interface {v1}, Lc/a/a/a/m2/g;->a()J

    move-result-wide v1

    .line 2
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/r0;->h1()V

    .line 3
    iget-object v3, v0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget v3, v3, Lc/a/a/a/h1;->e:I

    const/4 v5, 0x1

    if-eq v3, v5, :cond_1f

    const/4 v6, 0x4

    if-ne v3, v6, :cond_0

    goto/16 :goto_e

    .line 4
    :cond_0
    iget-object v3, v0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v3}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v3

    const-wide/16 v7, 0xa

    if-nez v3, :cond_1

    .line 5
    invoke-direct {v0, v1, v2, v7, v8}, Lc/a/a/a/r0;->u0(JJ)V

    return-void

    :cond_1
    const-string v9, "doSomeWork"

    .line 6
    invoke-static {v9}, Lc/a/a/a/m2/k0;->a(Ljava/lang/String;)V

    .line 7
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/r0;->i1()V

    .line 8
    iget-boolean v9, v3, Lc/a/a/a/b1;->d:Z

    const-wide/16 v10, 0x3e8

    const/4 v12, 0x0

    if-eqz v9, :cond_a

    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v13

    mul-long v13, v13, v10

    .line 10
    iget-object v9, v3, Lc/a/a/a/b1;->a:Lc/a/a/a/j2/a0;

    iget-object v15, v0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-wide v10, v15, Lc/a/a/a/h1;->s:J

    iget-wide v7, v0, Lc/a/a/a/r0;->l:J

    sub-long/2addr v10, v7

    iget-boolean v7, v0, Lc/a/a/a/r0;->m:Z

    invoke-interface {v9, v10, v11, v7}, Lc/a/a/a/j2/a0;->t(JZ)V

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x1

    .line 11
    :goto_0
    iget-object v10, v0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    array-length v11, v10

    if-ge v7, v11, :cond_b

    .line 12
    aget-object v10, v10, v7

    .line 13
    invoke-static {v10}, Lc/a/a/a/r0;->J(Lc/a/a/a/p1;)Z

    move-result v11

    if-nez v11, :cond_2

    goto :goto_7

    .line 14
    :cond_2
    iget-wide v4, v0, Lc/a/a/a/r0;->M:J

    invoke-interface {v10, v4, v5, v13, v14}, Lc/a/a/a/p1;->l(JJ)V

    if-eqz v8, :cond_3

    .line 15
    invoke-interface {v10}, Lc/a/a/a/p1;->b()Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 v8, 0x1

    goto :goto_1

    :cond_3
    const/4 v8, 0x0

    .line 16
    :goto_1
    iget-object v4, v3, Lc/a/a/a/b1;->c:[Lc/a/a/a/j2/l0;

    aget-object v4, v4, v7

    invoke-interface {v10}, Lc/a/a/a/p1;->n()Lc/a/a/a/j2/l0;

    move-result-object v5

    if-eq v4, v5, :cond_4

    const/4 v4, 0x1

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    :goto_2
    if-nez v4, :cond_5

    .line 17
    invoke-interface {v10}, Lc/a/a/a/p1;->i()Z

    move-result v5

    if-eqz v5, :cond_5

    const/4 v5, 0x1

    goto :goto_3

    :cond_5
    const/4 v5, 0x0

    :goto_3
    if-nez v4, :cond_7

    if-nez v5, :cond_7

    .line 18
    invoke-interface {v10}, Lc/a/a/a/p1;->e()Z

    move-result v4

    if-nez v4, :cond_7

    invoke-interface {v10}, Lc/a/a/a/p1;->b()Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_4

    :cond_6
    const/4 v4, 0x0

    goto :goto_5

    :cond_7
    :goto_4
    const/4 v4, 0x1

    :goto_5
    if-eqz v9, :cond_8

    if-eqz v4, :cond_8

    const/4 v9, 0x1

    goto :goto_6

    :cond_8
    const/4 v9, 0x0

    :goto_6
    if-nez v4, :cond_9

    .line 19
    invoke-interface {v10}, Lc/a/a/a/p1;->q()V

    :cond_9
    :goto_7
    add-int/lit8 v7, v7, 0x1

    const/4 v5, 0x1

    goto :goto_0

    .line 20
    :cond_a
    iget-object v4, v3, Lc/a/a/a/b1;->a:Lc/a/a/a/j2/a0;

    invoke-interface {v4}, Lc/a/a/a/j2/a0;->s()V

    const/4 v8, 0x1

    const/4 v9, 0x1

    .line 21
    :cond_b
    iget-object v4, v3, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-wide v4, v4, Lc/a/a/a/c1;->e:J

    if-eqz v8, :cond_d

    .line 22
    iget-boolean v7, v3, Lc/a/a/a/b1;->d:Z

    if-eqz v7, :cond_d

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v10, v4, v7

    if-eqz v10, :cond_c

    iget-object v7, v0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-wide v7, v7, Lc/a/a/a/h1;->s:J

    cmp-long v10, v4, v7

    if-gtz v10, :cond_d

    :cond_c
    const/4 v4, 0x1

    goto :goto_8

    :cond_d
    const/4 v4, 0x0

    :goto_8
    if-eqz v4, :cond_e

    .line 23
    iget-boolean v5, v0, Lc/a/a/a/r0;->A:Z

    if-eqz v5, :cond_e

    .line 24
    iput-boolean v12, v0, Lc/a/a/a/r0;->A:Z

    .line 25
    iget-object v5, v0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget v5, v5, Lc/a/a/a/h1;->m:I

    const/4 v7, 0x5

    invoke-direct {v0, v12, v5, v12, v7}, Lc/a/a/a/r0;->L0(ZIZI)V

    :cond_e
    const/4 v5, 0x3

    if-eqz v4, :cond_f

    .line 26
    iget-object v4, v3, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-boolean v4, v4, Lc/a/a/a/c1;->h:Z

    if-eqz v4, :cond_f

    .line 27
    invoke-direct {v0, v6}, Lc/a/a/a/r0;->T0(I)V

    .line 28
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/r0;->d1()V

    goto :goto_9

    .line 29
    :cond_f
    iget-object v4, v0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget v4, v4, Lc/a/a/a/h1;->e:I

    const/4 v7, 0x2

    if-ne v4, v7, :cond_10

    .line 30
    invoke-direct {v0, v9}, Lc/a/a/a/r0;->X0(Z)Z

    move-result v4

    if-eqz v4, :cond_10

    .line 31
    invoke-direct {v0, v5}, Lc/a/a/a/r0;->T0(I)V

    const/4 v4, 0x0

    .line 32
    iput-object v4, v0, Lc/a/a/a/r0;->P:Lc/a/a/a/p0;

    .line 33
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/r0;->W0()Z

    move-result v4

    if-eqz v4, :cond_14

    .line 34
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/r0;->a1()V

    goto :goto_9

    .line 35
    :cond_10
    iget-object v4, v0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget v4, v4, Lc/a/a/a/h1;->e:I

    if-ne v4, v5, :cond_14

    iget v4, v0, Lc/a/a/a/r0;->K:I

    if-nez v4, :cond_11

    .line 36
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/r0;->K()Z

    move-result v4

    if-eqz v4, :cond_12

    goto :goto_9

    :cond_11
    if-nez v9, :cond_14

    .line 37
    :cond_12
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/r0;->W0()Z

    move-result v4

    iput-boolean v4, v0, Lc/a/a/a/r0;->B:Z

    const/4 v4, 0x2

    .line 38
    invoke-direct {v0, v4}, Lc/a/a/a/r0;->T0(I)V

    .line 39
    iget-boolean v4, v0, Lc/a/a/a/r0;->B:Z

    if-eqz v4, :cond_13

    .line 40
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/r0;->b0()V

    .line 41
    iget-object v4, v0, Lc/a/a/a/r0;->t:Lc/a/a/a/x0;

    invoke-interface {v4}, Lc/a/a/a/x0;->a()V

    .line 42
    :cond_13
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/r0;->d1()V

    .line 43
    :cond_14
    :goto_9
    iget-object v4, v0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget v4, v4, Lc/a/a/a/h1;->e:I

    const/4 v7, 0x2

    if-ne v4, v7, :cond_18

    const/4 v4, 0x0

    .line 44
    :goto_a
    iget-object v7, v0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    array-length v8, v7

    if-ge v4, v8, :cond_16

    .line 45
    aget-object v7, v7, v4

    invoke-static {v7}, Lc/a/a/a/r0;->J(Lc/a/a/a/p1;)Z

    move-result v7

    if-eqz v7, :cond_15

    iget-object v7, v0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    aget-object v7, v7, v4

    .line 46
    invoke-interface {v7}, Lc/a/a/a/p1;->n()Lc/a/a/a/j2/l0;

    move-result-object v7

    iget-object v8, v3, Lc/a/a/a/b1;->c:[Lc/a/a/a/j2/l0;

    aget-object v8, v8, v4

    if-ne v7, v8, :cond_15

    .line 47
    iget-object v7, v0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    aget-object v7, v7, v4

    invoke-interface {v7}, Lc/a/a/a/p1;->q()V

    :cond_15
    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    .line 48
    :cond_16
    iget-object v3, v0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-boolean v4, v3, Lc/a/a/a/h1;->g:Z

    if-nez v4, :cond_18

    iget-wide v3, v3, Lc/a/a/a/h1;->r:J

    const-wide/32 v7, 0x7a120

    cmp-long v9, v3, v7

    if-gez v9, :cond_18

    .line 49
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/r0;->I()Z

    move-result v3

    if-nez v3, :cond_17

    goto :goto_b

    .line 50
    :cond_17
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Playback stuck buffering and not loading"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 51
    :cond_18
    :goto_b
    iget-boolean v3, v0, Lc/a/a/a/r0;->J:Z

    iget-object v4, v0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-boolean v7, v4, Lc/a/a/a/h1;->o:Z

    if-eq v3, v7, :cond_19

    .line 52
    invoke-virtual {v4, v3}, Lc/a/a/a/h1;->d(Z)Lc/a/a/a/h1;

    move-result-object v3

    iput-object v3, v0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    .line 53
    :cond_19
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/r0;->W0()Z

    move-result v3

    if-eqz v3, :cond_1a

    iget-object v3, v0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget v3, v3, Lc/a/a/a/h1;->e:I

    if-eq v3, v5, :cond_1b

    :cond_1a
    iget-object v3, v0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget v3, v3, Lc/a/a/a/h1;->e:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1c

    :cond_1b
    const-wide/16 v3, 0xa

    .line 54
    invoke-direct {v0, v1, v2, v3, v4}, Lc/a/a/a/r0;->R(JJ)Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    goto :goto_d

    .line 55
    :cond_1c
    iget v4, v0, Lc/a/a/a/r0;->K:I

    if-eqz v4, :cond_1d

    if-eq v3, v6, :cond_1d

    const-wide/16 v3, 0x3e8

    .line 56
    invoke-direct {v0, v1, v2, v3, v4}, Lc/a/a/a/r0;->u0(JJ)V

    goto :goto_c

    .line 57
    :cond_1d
    iget-object v1, v0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    const/4 v2, 0x2

    invoke-interface {v1, v2}, Lc/a/a/a/m2/q;->f(I)V

    :goto_c
    const/4 v1, 0x0

    .line 58
    :goto_d
    iget-object v2, v0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-boolean v3, v2, Lc/a/a/a/h1;->p:Z

    if-eq v3, v1, :cond_1e

    .line 59
    invoke-virtual {v2, v1}, Lc/a/a/a/h1;->i(Z)Lc/a/a/a/h1;

    move-result-object v1

    iput-object v1, v0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    .line 60
    :cond_1e
    iput-boolean v12, v0, Lc/a/a/a/r0;->I:Z

    .line 61
    invoke-static {}, Lc/a/a/a/m2/k0;->c()V

    return-void

    .line 62
    :cond_1f
    :goto_e
    iget-object v1, v0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    const/4 v2, 0x2

    invoke-interface {v1, v2}, Lc/a/a/a/m2/q;->f(I)V

    return-void
.end method

.method private k0()V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    move-object/from16 v6, p0

    .line 1
    iget-object v0, v6, Lc/a/a/a/r0;->n:Lc/a/a/a/n0;

    invoke-virtual {v0}, Lc/a/a/a/n0;->c()Lc/a/a/a/i1;

    move-result-object v0

    iget v0, v0, Lc/a/a/a/i1;->b:F

    .line 2
    iget-object v1, v6, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v1}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v1

    .line 3
    iget-object v2, v6, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v2}, Lc/a/a/a/d1;->o()Lc/a/a/a/b1;

    move-result-object v2

    const/4 v7, 0x1

    const/4 v3, 0x1

    :goto_0
    if-eqz v1, :cond_a

    .line 4
    iget-boolean v4, v1, Lc/a/a/a/b1;->d:Z

    if-nez v4, :cond_0

    goto/16 :goto_4

    .line 5
    :cond_0
    iget-object v4, v6, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v4, v4, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    invoke-virtual {v1, v0, v4}, Lc/a/a/a/b1;->v(FLc/a/a/a/x1;)Lc/a/a/a/l2/o;

    move-result-object v9

    .line 6
    invoke-virtual {v1}, Lc/a/a/a/b1;->o()Lc/a/a/a/l2/o;

    move-result-object v4

    invoke-virtual {v9, v4}, Lc/a/a/a/l2/o;->a(Lc/a/a/a/l2/o;)Z

    move-result v4

    const/4 v14, 0x0

    if-nez v4, :cond_8

    const/4 v15, 0x4

    if-eqz v3, :cond_5

    .line 7
    iget-object v0, v6, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v4

    .line 8
    iget-object v0, v6, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0, v4}, Lc/a/a/a/d1;->y(Lc/a/a/a/b1;)Z

    move-result v12

    .line 9
    iget-object v0, v6, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    array-length v0, v0

    new-array v5, v0, [Z

    .line 10
    iget-object v0, v6, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-wide v10, v0, Lc/a/a/a/h1;->s:J

    move-object v8, v4

    move-object v13, v5

    .line 11
    invoke-virtual/range {v8 .. v13}, Lc/a/a/a/b1;->b(Lc/a/a/a/l2/o;JZ[Z)J

    move-result-wide v8

    .line 12
    iget-object v0, v6, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v1, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-wide v10, v0, Lc/a/a/a/h1;->d:J

    move-object/from16 v0, p0

    move-wide v2, v8

    move-object v12, v4

    move-wide v4, v10

    .line 13
    invoke-direct/range {v0 .. v5}, Lc/a/a/a/r0;->G(Lc/a/a/a/j2/d0$a;JJ)Lc/a/a/a/h1;

    move-result-object v0

    iput-object v0, v6, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    .line 14
    iget v1, v0, Lc/a/a/a/h1;->e:I

    if-eq v1, v15, :cond_1

    iget-wide v0, v0, Lc/a/a/a/h1;->s:J

    cmp-long v2, v8, v0

    if-eqz v2, :cond_1

    .line 15
    iget-object v0, v6, Lc/a/a/a/r0;->x:Lc/a/a/a/r0$e;

    invoke-virtual {v0, v15}, Lc/a/a/a/r0$e;->e(I)V

    .line 16
    invoke-direct {v6, v8, v9}, Lc/a/a/a/r0;->n0(J)V

    .line 17
    :cond_1
    iget-object v0, v6, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    array-length v0, v0

    new-array v0, v0, [Z

    .line 18
    :goto_1
    iget-object v1, v6, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    array-length v2, v1

    if-ge v14, v2, :cond_4

    .line 19
    aget-object v1, v1, v14

    .line 20
    invoke-static {v1}, Lc/a/a/a/r0;->J(Lc/a/a/a/p1;)Z

    move-result v2

    aput-boolean v2, v0, v14

    .line 21
    iget-object v2, v12, Lc/a/a/a/b1;->c:[Lc/a/a/a/j2/l0;

    aget-object v2, v2, v14

    .line 22
    aget-boolean v3, v0, v14

    if-eqz v3, :cond_3

    .line 23
    invoke-interface {v1}, Lc/a/a/a/p1;->n()Lc/a/a/a/j2/l0;

    move-result-object v3

    if-eq v2, v3, :cond_2

    .line 24
    invoke-direct {v6, v1}, Lc/a/a/a/r0;->i(Lc/a/a/a/p1;)V

    goto :goto_2

    .line 25
    :cond_2
    aget-boolean v2, v13, v14

    if-eqz v2, :cond_3

    .line 26
    iget-wide v2, v6, Lc/a/a/a/r0;->M:J

    invoke-interface {v1, v2, v3}, Lc/a/a/a/p1;->s(J)V

    :cond_3
    :goto_2
    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    .line 27
    :cond_4
    invoke-direct {v6, v0}, Lc/a/a/a/r0;->o([Z)V

    goto :goto_3

    .line 28
    :cond_5
    iget-object v0, v6, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0, v1}, Lc/a/a/a/d1;->y(Lc/a/a/a/b1;)Z

    .line 29
    iget-boolean v0, v1, Lc/a/a/a/b1;->d:Z

    if-eqz v0, :cond_6

    .line 30
    iget-object v0, v1, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-wide v2, v0, Lc/a/a/a/c1;->b:J

    iget-wide v4, v6, Lc/a/a/a/r0;->M:J

    .line 31
    invoke-virtual {v1, v4, v5}, Lc/a/a/a/b1;->y(J)J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    .line 32
    invoke-virtual {v1, v9, v2, v3, v14}, Lc/a/a/a/b1;->a(Lc/a/a/a/l2/o;JZ)J

    .line 33
    :cond_6
    :goto_3
    invoke-direct {v6, v7}, Lc/a/a/a/r0;->B(Z)V

    .line 34
    iget-object v0, v6, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget v0, v0, Lc/a/a/a/h1;->e:I

    if-eq v0, v15, :cond_7

    .line 35
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/r0;->P()V

    .line 36
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/r0;->i1()V

    .line 37
    iget-object v0, v6, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lc/a/a/a/m2/q;->c(I)Z

    :cond_7
    return-void

    :cond_8
    if-ne v1, v2, :cond_9

    const/4 v3, 0x0

    .line 38
    :cond_9
    invoke-virtual {v1}, Lc/a/a/a/b1;->j()Lc/a/a/a/b1;

    move-result-object v1

    goto/16 :goto_0

    :cond_a
    :goto_4
    return-void
.end method

.method private declared-synchronized k1(Lc/a/b/a/k;J)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/b/a/k<",
            "Ljava/lang/Boolean;",
            ">;J)V"
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lc/a/a/a/r0;->p:Lc/a/a/a/m2/g;

    invoke-interface {v0}, Lc/a/a/a/m2/g;->c()J

    move-result-wide v0

    add-long/2addr v0, p2

    const/4 v2, 0x0

    .line 2
    :goto_0
    invoke-interface {p1}, Lc/a/b/a/k;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_0

    const-wide/16 v3, 0x0

    cmp-long v5, p2, v3

    if-lez v5, :cond_0

    .line 3
    :try_start_1
    invoke-virtual {p0, p2, p3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    const/4 p2, 0x1

    const/4 v2, 0x1

    .line 4
    :goto_1
    :try_start_2
    iget-object p2, p0, Lc/a/a/a/r0;->p:Lc/a/a/a/m2/g;

    invoke-interface {p2}, Lc/a/a/a/m2/g;->c()J

    move-result-wide p2

    sub-long p2, v0, p2

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_1

    .line 5
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 6
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method private l(IZ)V
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    aget-object v1, v1, p1

    .line 2
    invoke-static {v1}, Lc/a/a/a/r0;->J(Lc/a/a/a/p1;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v2, v0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v2}, Lc/a/a/a/d1;->o()Lc/a/a/a/b1;

    move-result-object v2

    .line 4
    iget-object v3, v0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v3}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v2, v3, :cond_1

    const/4 v9, 0x1

    goto :goto_0

    :cond_1
    const/4 v9, 0x0

    .line 5
    :goto_0
    invoke-virtual {v2}, Lc/a/a/a/b1;->o()Lc/a/a/a/l2/o;

    move-result-object v3

    .line 6
    iget-object v6, v3, Lc/a/a/a/l2/o;->b:[Lc/a/a/a/s1;

    aget-object v6, v6, p1

    .line 7
    iget-object v3, v3, Lc/a/a/a/l2/o;->c:[Lc/a/a/a/l2/h;

    aget-object v3, v3, p1

    .line 8
    invoke-static {v3}, Lc/a/a/a/r0;->t(Lc/a/a/a/l2/h;)[Lc/a/a/a/u0;

    move-result-object v7

    .line 9
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/r0;->W0()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, v0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget v3, v3, Lc/a/a/a/h1;->e:I

    const/4 v8, 0x3

    if-ne v3, v8, :cond_2

    const/4 v14, 0x1

    goto :goto_1

    :cond_2
    const/4 v14, 0x0

    :goto_1
    if-nez p2, :cond_3

    if-eqz v14, :cond_3

    const/4 v8, 0x1

    goto :goto_2

    :cond_3
    const/4 v8, 0x0

    .line 10
    :goto_2
    iget v3, v0, Lc/a/a/a/r0;->K:I

    add-int/2addr v3, v5

    iput v3, v0, Lc/a/a/a/r0;->K:I

    .line 11
    iget-object v3, v2, Lc/a/a/a/b1;->c:[Lc/a/a/a/j2/l0;

    aget-object v5, v3, p1

    iget-wide v10, v0, Lc/a/a/a/r0;->M:J

    .line 12
    invoke-virtual {v2}, Lc/a/a/a/b1;->m()J

    move-result-wide v12

    .line 13
    invoke-virtual {v2}, Lc/a/a/a/b1;->l()J

    move-result-wide v15

    move-object v2, v1

    move-object v3, v6

    move-object v4, v7

    move-wide v6, v10

    move-wide v10, v12

    move-wide v12, v15

    .line 14
    invoke-interface/range {v2 .. v13}, Lc/a/a/a/p1;->j(Lc/a/a/a/s1;[Lc/a/a/a/u0;Lc/a/a/a/j2/l0;JZZJJ)V

    const/16 v2, 0x67

    .line 15
    new-instance v3, Lc/a/a/a/r0$a;

    invoke-direct {v3, v0}, Lc/a/a/a/r0$a;-><init>(Lc/a/a/a/r0;)V

    invoke-interface {v1, v2, v3}, Lc/a/a/a/m1$b;->m(ILjava/lang/Object;)V

    .line 16
    iget-object v2, v0, Lc/a/a/a/r0;->n:Lc/a/a/a/n0;

    invoke-virtual {v2, v1}, Lc/a/a/a/n0;->b(Lc/a/a/a/p1;)V

    if-eqz v14, :cond_4

    .line 17
    invoke-interface {v1}, Lc/a/a/a/p1;->start()V

    :cond_4
    return-void
.end method

.method private l0(ZZZZ)V
    .locals 32

    move-object/from16 v1, p0

    .line 1
    iget-object v0, v1, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    const/4 v2, 0x2

    invoke-interface {v0, v2}, Lc/a/a/a/m2/q;->f(I)V

    const/4 v2, 0x0

    .line 2
    iput-boolean v2, v1, Lc/a/a/a/r0;->B:Z

    .line 3
    iget-object v0, v1, Lc/a/a/a/r0;->n:Lc/a/a/a/n0;

    invoke-virtual {v0}, Lc/a/a/a/n0;->h()V

    const-wide/16 v3, 0x0

    .line 4
    iput-wide v3, v1, Lc/a/a/a/r0;->M:J

    .line 5
    iget-object v3, v1, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    const-string v6, "ExoPlayerImplInternal"

    if-ge v5, v4, :cond_0

    aget-object v0, v3, v5

    .line 6
    :try_start_0
    invoke-direct {v1, v0}, Lc/a/a/a/r0;->i(Lc/a/a/a/p1;)V
    :try_end_0
    .catch Lc/a/a/a/p0; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    :goto_1
    const-string v7, "Disable failed."

    .line 7
    invoke-static {v6, v7, v0}, Lc/a/a/a/m2/t;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 8
    iget-object v3, v1, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    array-length v4, v3

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v4, :cond_1

    aget-object v0, v3, v5

    .line 9
    :try_start_1
    invoke-interface {v0}, Lc/a/a/a/p1;->reset()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_4

    :catch_2
    move-exception v0

    move-object v7, v0

    const-string v0, "Reset failed."

    .line 10
    invoke-static {v6, v0, v7}, Lc/a/a/a/m2/t;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 11
    :cond_1
    iput v2, v1, Lc/a/a/a/r0;->K:I

    .line 12
    iget-object v0, v1, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v3, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    .line 13
    iget-wide v4, v0, Lc/a/a/a/h1;->s:J

    .line 14
    iget-object v0, v1, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v6, v1, Lc/a/a/a/r0;->k:Lc/a/a/a/x1$b;

    iget-object v7, v1, Lc/a/a/a/r0;->j:Lc/a/a/a/x1$c;

    invoke-static {v0, v6, v7}, Lc/a/a/a/r0;->Z0(Lc/a/a/a/h1;Lc/a/a/a/x1$b;Lc/a/a/a/x1$c;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 15
    iget-object v0, v1, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-wide v6, v0, Lc/a/a/a/h1;->d:J

    goto :goto_5

    .line 16
    :cond_2
    iget-object v0, v1, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-wide v6, v0, Lc/a/a/a/h1;->s:J

    :goto_5
    const/4 v0, 0x0

    if-eqz p2, :cond_4

    .line 17
    iput-object v0, v1, Lc/a/a/a/r0;->L:Lc/a/a/a/r0$h;

    .line 18
    iget-object v3, v1, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v3, v3, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    .line 19
    invoke-direct {v1, v3}, Lc/a/a/a/r0;->w(Lc/a/a/a/x1;)Landroid/util/Pair;

    move-result-object v3

    .line 20
    iget-object v4, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Lc/a/a/a/j2/d0$a;

    .line 21
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    iget-object v3, v1, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v3, v3, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    invoke-virtual {v4, v3}, Lc/a/a/a/j2/b0;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const/4 v3, 0x1

    move-object/from16 v20, v4

    move-wide/from16 v28, v5

    move-wide v12, v7

    goto :goto_7

    :cond_3
    move-object/from16 v20, v4

    move-wide/from16 v28, v5

    move-wide v12, v7

    goto :goto_6

    :cond_4
    move-object/from16 v20, v3

    move-wide/from16 v28, v4

    move-wide v12, v6

    :goto_6
    const/4 v3, 0x0

    .line 23
    :goto_7
    iget-object v4, v1, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v4}, Lc/a/a/a/d1;->e()V

    .line 24
    iput-boolean v2, v1, Lc/a/a/a/r0;->C:Z

    .line 25
    new-instance v2, Lc/a/a/a/h1;

    iget-object v4, v1, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v10, v4, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget v14, v4, Lc/a/a/a/h1;->e:I

    if-eqz p4, :cond_5

    move-object v15, v0

    goto :goto_8

    .line 26
    :cond_5
    iget-object v5, v4, Lc/a/a/a/h1;->f:Lc/a/a/a/p0;

    move-object v15, v5

    :goto_8
    const/16 v16, 0x0

    if-eqz v3, :cond_6

    .line 27
    sget-object v5, Lc/a/a/a/j2/q0;->a:Lc/a/a/a/j2/q0;

    goto :goto_9

    :cond_6
    iget-object v5, v4, Lc/a/a/a/h1;->h:Lc/a/a/a/j2/q0;

    :goto_9
    move-object/from16 v17, v5

    if-eqz v3, :cond_7

    .line 28
    iget-object v5, v1, Lc/a/a/a/r0;->d:Lc/a/a/a/l2/o;

    goto :goto_a

    :cond_7
    iget-object v5, v4, Lc/a/a/a/h1;->i:Lc/a/a/a/l2/o;

    :goto_a
    move-object/from16 v18, v5

    if-eqz v3, :cond_8

    .line 29
    invoke-static {}, Lc/a/b/b/r;->p()Lc/a/b/b/r;

    move-result-object v3

    goto :goto_b

    :cond_8
    iget-object v3, v4, Lc/a/a/a/h1;->j:Ljava/util/List;

    :goto_b
    move-object/from16 v19, v3

    iget-object v3, v1, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-boolean v4, v3, Lc/a/a/a/h1;->l:Z

    move/from16 v21, v4

    iget v4, v3, Lc/a/a/a/h1;->m:I

    move/from16 v22, v4

    iget-object v3, v3, Lc/a/a/a/h1;->n:Lc/a/a/a/i1;

    move-object/from16 v23, v3

    const-wide/16 v26, 0x0

    iget-boolean v3, v1, Lc/a/a/a/r0;->J:Z

    move/from16 v30, v3

    const/16 v31, 0x0

    move-object v9, v2

    move-object/from16 v11, v20

    move-wide/from16 v24, v28

    invoke-direct/range {v9 .. v31}, Lc/a/a/a/h1;-><init>(Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;JILc/a/a/a/p0;ZLc/a/a/a/j2/q0;Lc/a/a/a/l2/o;Ljava/util/List;Lc/a/a/a/j2/d0$a;ZILc/a/a/a/i1;JJJZZ)V

    iput-object v2, v1, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    if-eqz p3, :cond_9

    .line 30
    iget-object v2, v1, Lc/a/a/a/r0;->s:Lc/a/a/a/f1;

    invoke-virtual {v2}, Lc/a/a/a/f1;->y()V

    .line 31
    :cond_9
    iput-object v0, v1, Lc/a/a/a/r0;->P:Lc/a/a/a/p0;

    return-void
.end method

.method private m0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, v0, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-boolean v0, v0, Lc/a/a/a/c1;->g:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lc/a/a/a/r0;->z:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lc/a/a/a/r0;->A:Z

    return-void
.end method

.method private n()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    array-length v0, v0

    new-array v0, v0, [Z

    invoke-direct {p0, v0}, Lc/a/a/a/r0;->o([Z)V

    return-void
.end method

.method private n0(J)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v0, p1, p2}, Lc/a/a/a/b1;->z(J)J

    move-result-wide p1

    :goto_0
    iput-wide p1, p0, Lc/a/a/a/r0;->M:J

    .line 3
    iget-object v0, p0, Lc/a/a/a/r0;->n:Lc/a/a/a/n0;

    invoke-virtual {v0, p1, p2}, Lc/a/a/a/n0;->d(J)V

    .line 4
    iget-object p1, p0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    array-length p2, p1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p2, :cond_2

    aget-object v1, p1, v0

    .line 5
    invoke-static {v1}, Lc/a/a/a/r0;->J(Lc/a/a/a/p1;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 6
    iget-wide v2, p0, Lc/a/a/a/r0;->M:J

    invoke-interface {v1, v2, v3}, Lc/a/a/a/p1;->s(J)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 7
    :cond_2
    invoke-direct {p0}, Lc/a/a/a/r0;->Z()V

    return-void
.end method

.method private o([Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->o()Lc/a/a/a/b1;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lc/a/a/a/b1;->o()Lc/a/a/a/l2/o;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 3
    :goto_0
    iget-object v4, p0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    array-length v4, v4

    if-ge v3, v4, :cond_1

    .line 4
    invoke-virtual {v1, v3}, Lc/a/a/a/l2/o;->c(I)Z

    move-result v4

    if-nez v4, :cond_0

    .line 5
    iget-object v4, p0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    aget-object v4, v4, v3

    invoke-interface {v4}, Lc/a/a/a/p1;->reset()V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 6
    :cond_1
    :goto_1
    iget-object v3, p0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    array-length v3, v3

    if-ge v2, v3, :cond_3

    .line 7
    invoke-virtual {v1, v2}, Lc/a/a/a/l2/o;->c(I)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 8
    aget-boolean v3, p1, v2

    invoke-direct {p0, v2, v3}, Lc/a/a/a/r0;->l(IZ)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, v0, Lc/a/a/a/b1;->g:Z

    return-void
.end method

.method private static o0(Lc/a/a/a/x1;Lc/a/a/a/r0$d;Lc/a/a/a/x1$c;Lc/a/a/a/x1$b;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lc/a/a/a/r0$d;->d:Ljava/lang/Object;

    invoke-virtual {p0, v0, p3}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object v0

    iget v0, v0, Lc/a/a/a/x1$b;->c:I

    .line 2
    invoke-virtual {p0, v0, p2}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    move-result-object p2

    iget p2, p2, Lc/a/a/a/x1$c;->p:I

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, p2, p3, v0}, Lc/a/a/a/x1;->g(ILc/a/a/a/x1$b;Z)Lc/a/a/a/x1$b;

    move-result-object p0

    iget-object p0, p0, Lc/a/a/a/x1$b;->b:Ljava/lang/Object;

    .line 4
    iget-wide v0, p3, Lc/a/a/a/x1$b;->d:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, v0, v2

    if-eqz p3, :cond_0

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    goto :goto_0

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    .line 5
    :goto_0
    invoke-virtual {p1, p2, v0, v1, p0}, Lc/a/a/a/r0$d;->b(IJLjava/lang/Object;)V

    return-void
.end method

.method private static p0(Lc/a/a/a/r0$d;Lc/a/a/a/x1;Lc/a/a/a/x1;IZLc/a/a/a/x1$c;Lc/a/a/a/x1$b;)Z
    .locals 15

    move-object v0, p0

    move-object/from16 v8, p1

    move-object/from16 v1, p2

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    .line 1
    iget-object v2, v0, Lc/a/a/a/r0$d;->d:Ljava/lang/Object;

    const/4 v11, 0x0

    const/4 v12, 0x1

    const-wide/high16 v13, -0x8000000000000000L

    if-nez v2, :cond_3

    .line 2
    iget-object v1, v0, Lc/a/a/a/r0$d;->a:Lc/a/a/a/m1;

    invoke-virtual {v1}, Lc/a/a/a/m1;->e()J

    move-result-wide v1

    cmp-long v3, v1, v13

    if-nez v3, :cond_0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_0

    .line 3
    :cond_0
    iget-object v1, v0, Lc/a/a/a/r0$d;->a:Lc/a/a/a/m1;

    invoke-virtual {v1}, Lc/a/a/a/m1;->e()J

    move-result-wide v1

    invoke-static {v1, v2}, Lc/a/a/a/i0;->c(J)J

    move-result-wide v1

    .line 4
    :goto_0
    new-instance v3, Lc/a/a/a/r0$h;

    iget-object v4, v0, Lc/a/a/a/r0$d;->a:Lc/a/a/a/m1;

    .line 5
    invoke-virtual {v4}, Lc/a/a/a/m1;->g()Lc/a/a/a/x1;

    move-result-object v4

    iget-object v5, v0, Lc/a/a/a/r0$d;->a:Lc/a/a/a/m1;

    .line 6
    invoke-virtual {v5}, Lc/a/a/a/m1;->i()I

    move-result v5

    invoke-direct {v3, v4, v5, v1, v2}, Lc/a/a/a/r0$h;-><init>(Lc/a/a/a/x1;IJ)V

    const/4 v4, 0x0

    move-object/from16 v1, p1

    move-object v2, v3

    move v3, v4

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    .line 7
    invoke-static/range {v1 .. v7}, Lc/a/a/a/r0;->s0(Lc/a/a/a/x1;Lc/a/a/a/r0$h;ZIZLc/a/a/a/x1$c;Lc/a/a/a/x1$b;)Landroid/util/Pair;

    move-result-object v1

    if-nez v1, :cond_1

    return v11

    .line 8
    :cond_1
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 9
    invoke-virtual {v8, v2}, Lc/a/a/a/x1;->b(Ljava/lang/Object;)I

    move-result v2

    iget-object v3, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    .line 10
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 11
    invoke-virtual {p0, v2, v3, v4, v1}, Lc/a/a/a/r0$d;->b(IJLjava/lang/Object;)V

    .line 12
    iget-object v1, v0, Lc/a/a/a/r0$d;->a:Lc/a/a/a/m1;

    invoke-virtual {v1}, Lc/a/a/a/m1;->e()J

    move-result-wide v1

    cmp-long v3, v1, v13

    if-nez v3, :cond_2

    .line 13
    invoke-static {v8, p0, v9, v10}, Lc/a/a/a/r0;->o0(Lc/a/a/a/x1;Lc/a/a/a/r0$d;Lc/a/a/a/x1$c;Lc/a/a/a/x1$b;)V

    :cond_2
    return v12

    .line 14
    :cond_3
    invoke-virtual {v8, v2}, Lc/a/a/a/x1;->b(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_4

    return v11

    .line 15
    :cond_4
    iget-object v3, v0, Lc/a/a/a/r0$d;->a:Lc/a/a/a/m1;

    invoke-virtual {v3}, Lc/a/a/a/m1;->e()J

    move-result-wide v3

    cmp-long v5, v3, v13

    if-nez v5, :cond_5

    .line 16
    invoke-static {v8, p0, v9, v10}, Lc/a/a/a/r0;->o0(Lc/a/a/a/x1;Lc/a/a/a/r0$d;Lc/a/a/a/x1$c;Lc/a/a/a/x1$b;)V

    return v12

    .line 17
    :cond_5
    iput v2, v0, Lc/a/a/a/r0$d;->b:I

    .line 18
    iget-object v2, v0, Lc/a/a/a/r0$d;->d:Ljava/lang/Object;

    invoke-virtual {v1, v2, v10}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    .line 19
    iget v2, v10, Lc/a/a/a/x1$b;->c:I

    invoke-virtual {v1, v2, v9}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    move-result-object v1

    iget-boolean v1, v1, Lc/a/a/a/x1$c;->n:Z

    if-eqz v1, :cond_6

    .line 20
    iget-wide v1, v0, Lc/a/a/a/r0$d;->c:J

    .line 21
    invoke-virtual/range {p6 .. p6}, Lc/a/a/a/x1$b;->l()J

    move-result-wide v3

    add-long v5, v1, v3

    .line 22
    iget-object v1, v0, Lc/a/a/a/r0$d;->d:Ljava/lang/Object;

    .line 23
    invoke-virtual {v8, v1, v10}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object v1

    iget v4, v1, Lc/a/a/a/x1$b;->c:I

    move-object/from16 v1, p1

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    .line 24
    invoke-virtual/range {v1 .. v6}, Lc/a/a/a/x1;->j(Lc/a/a/a/x1$c;Lc/a/a/a/x1$b;IJ)Landroid/util/Pair;

    move-result-object v1

    .line 25
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 26
    invoke-virtual {v8, v2}, Lc/a/a/a/x1;->b(Ljava/lang/Object;)I

    move-result v2

    iget-object v3, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    .line 27
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 28
    invoke-virtual {p0, v2, v3, v4, v1}, Lc/a/a/a/r0$d;->b(IJLjava/lang/Object;)V

    :cond_6
    return v12
.end method

.method private q(Lc/a/a/a/p1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lc/a/a/a/p1;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 2
    invoke-interface {p1}, Lc/a/a/a/p1;->stop()V

    :cond_0
    return-void
.end method

.method private q0(Lc/a/a/a/x1;Lc/a/a/a/x1;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/x1;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lc/a/a/a/x1;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lc/a/a/a/r0;->o:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_2

    .line 3
    iget-object v1, p0, Lc/a/a/a/r0;->o:Ljava/util/ArrayList;

    .line 4
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lc/a/a/a/r0$d;

    iget v5, p0, Lc/a/a/a/r0;->D:I

    iget-boolean v6, p0, Lc/a/a/a/r0;->G:Z

    iget-object v7, p0, Lc/a/a/a/r0;->j:Lc/a/a/a/x1$c;

    iget-object v8, p0, Lc/a/a/a/r0;->k:Lc/a/a/a/x1$b;

    move-object v3, p1

    move-object v4, p2

    .line 5
    invoke-static/range {v2 .. v8}, Lc/a/a/a/r0;->p0(Lc/a/a/a/r0$d;Lc/a/a/a/x1;Lc/a/a/a/x1;IZLc/a/a/a/x1$c;Lc/a/a/a/x1$b;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 6
    iget-object v1, p0, Lc/a/a/a/r0;->o:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/r0$d;

    iget-object v1, v1, Lc/a/a/a/r0$d;->a:Lc/a/a/a/m1;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lc/a/a/a/m1;->k(Z)V

    .line 7
    iget-object v1, p0, Lc/a/a/a/r0;->o:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 8
    :cond_2
    iget-object p1, p0, Lc/a/a/a/r0;->o:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-void
.end method

.method private r([Lc/a/a/a/l2/h;)Lc/a/b/b/r;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lc/a/a/a/l2/h;",
            ")",
            "Lc/a/b/b/r<",
            "Lc/a/a/a/h2/a;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lc/a/b/b/r$a;

    invoke-direct {v0}, Lc/a/b/b/r$a;-><init>()V

    .line 2
    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v5, p1, v3

    if-eqz v5, :cond_1

    .line 3
    invoke-interface {v5, v2}, Lc/a/a/a/l2/k;->e(I)Lc/a/a/a/u0;

    move-result-object v5

    .line 4
    iget-object v5, v5, Lc/a/a/a/u0;->j:Lc/a/a/a/h2/a;

    if-nez v5, :cond_0

    .line 5
    new-instance v5, Lc/a/a/a/h2/a;

    new-array v6, v2, [Lc/a/a/a/h2/a$b;

    invoke-direct {v5, v6}, Lc/a/a/a/h2/a;-><init>([Lc/a/a/a/h2/a$b;)V

    invoke-virtual {v0, v5}, Lc/a/b/b/r$a;->d(Ljava/lang/Object;)Lc/a/b/b/r$a;

    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {v0, v5}, Lc/a/b/b/r$a;->d(Ljava/lang/Object;)Lc/a/b/b/r$a;

    const/4 v4, 0x1

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    if-eqz v4, :cond_3

    .line 7
    invoke-virtual {v0}, Lc/a/b/b/r$a;->e()Lc/a/b/b/r;

    move-result-object p1

    goto :goto_2

    :cond_3
    invoke-static {}, Lc/a/b/b/r;->p()Lc/a/b/b/r;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method private static r0(Lc/a/a/a/x1;Lc/a/a/a/h1;Lc/a/a/a/r0$h;Lc/a/a/a/d1;IZLc/a/a/a/x1$c;Lc/a/a/a/x1$b;)Lc/a/a/a/r0$g;
    .locals 21

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move/from16 v10, p5

    move-object/from16 v11, p7

    .line 1
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/x1;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lc/a/a/a/r0$g;

    .line 3
    invoke-static {}, Lc/a/a/a/h1;->l()Lc/a/a/a/j2/d0$a;

    move-result-object v2

    const-wide/16 v3, 0x0

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lc/a/a/a/r0$g;-><init>(Lc/a/a/a/j2/d0$a;JJZZZ)V

    return-object v0

    .line 4
    :cond_0
    iget-object v12, v8, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    .line 5
    iget-object v13, v12, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    move-object/from16 v14, p6

    .line 6
    invoke-static {v8, v11, v14}, Lc/a/a/a/r0;->Z0(Lc/a/a/a/h1;Lc/a/a/a/x1$b;Lc/a/a/a/x1$c;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    iget-wide v1, v8, Lc/a/a/a/h1;->d:J

    goto :goto_0

    .line 8
    :cond_1
    iget-wide v1, v8, Lc/a/a/a/h1;->s:J

    :goto_0
    move-wide v15, v1

    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v6, -0x1

    const/16 v19, 0x0

    const/16 v20, 0x1

    if-eqz v9, :cond_5

    const/4 v2, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v3, p4

    move/from16 v4, p5

    move-object/from16 v5, p6

    const/4 v14, -0x1

    move-object/from16 v6, p7

    .line 9
    invoke-static/range {v0 .. v6}, Lc/a/a/a/r0;->s0(Lc/a/a/a/x1;Lc/a/a/a/r0$h;ZIZLc/a/a/a/x1$c;Lc/a/a/a/x1$b;)Landroid/util/Pair;

    move-result-object v0

    if-nez v0, :cond_2

    .line 10
    invoke-virtual {v7, v10}, Lc/a/a/a/x1;->a(Z)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    goto :goto_3

    .line 11
    :cond_2
    iget-wide v1, v9, Lc/a/a/a/r0$h;->c:J

    cmp-long v3, v1, v17

    if-nez v3, :cond_3

    .line 12
    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 13
    invoke-virtual {v7, v0, v11}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object v0

    iget v6, v0, Lc/a/a/a/x1$b;->c:I

    const/4 v0, 0x0

    goto :goto_1

    .line 14
    :cond_3
    iget-object v13, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 15
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v15

    const/4 v0, 0x1

    const/4 v6, -0x1

    .line 16
    :goto_1
    iget v1, v8, Lc/a/a/a/h1;->e:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    :goto_2
    move v2, v1

    const/4 v3, 0x0

    move v1, v0

    move v0, v6

    :goto_3
    move v9, v1

    move v6, v2

    move v10, v3

    :goto_4
    move v3, v0

    goto/16 :goto_9

    :cond_5
    const/4 v14, -0x1

    .line 17
    iget-object v1, v8, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    invoke-virtual {v1}, Lc/a/a/a/x1;->q()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 18
    invoke-virtual {v7, v10}, Lc/a/a/a/x1;->a(Z)I

    move-result v0

    :goto_5
    move v3, v0

    :goto_6
    const/4 v6, 0x0

    const/4 v9, 0x0

    :goto_7
    const/4 v10, 0x0

    goto/16 :goto_9

    .line 19
    :cond_6
    invoke-virtual {v7, v13}, Lc/a/a/a/x1;->b(Ljava/lang/Object;)I

    move-result v1

    if-ne v1, v14, :cond_8

    .line 20
    iget-object v5, v8, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    move-object/from16 v0, p6

    move-object/from16 v1, p7

    move/from16 v2, p4

    move/from16 v3, p5

    move-object v4, v13

    move-object/from16 v6, p0

    .line 21
    invoke-static/range {v0 .. v6}, Lc/a/a/a/r0;->t0(Lc/a/a/a/x1$c;Lc/a/a/a/x1$b;IZLjava/lang/Object;Lc/a/a/a/x1;Lc/a/a/a/x1;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_7

    .line 22
    invoke-virtual {v7, v10}, Lc/a/a/a/x1;->a(Z)I

    move-result v0

    const/4 v3, 0x1

    goto :goto_8

    .line 23
    :cond_7
    invoke-virtual {v7, v0, v11}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object v0

    iget v0, v0, Lc/a/a/a/x1$b;->c:I

    const/4 v3, 0x0

    :goto_8
    move v10, v3

    const/4 v6, 0x0

    const/4 v9, 0x0

    goto :goto_4

    :cond_8
    if-eqz v0, :cond_a

    cmp-long v0, v15, v17

    if-nez v0, :cond_9

    .line 24
    invoke-virtual {v7, v13, v11}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object v0

    iget v0, v0, Lc/a/a/a/x1$b;->c:I

    goto :goto_5

    .line 25
    :cond_9
    iget-object v0, v8, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v1, v12, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, v11}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    .line 26
    invoke-virtual/range {p7 .. p7}, Lc/a/a/a/x1$b;->l()J

    move-result-wide v0

    add-long v4, v15, v0

    .line 27
    invoke-virtual {v7, v13, v11}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object v0

    iget v3, v0, Lc/a/a/a/x1$b;->c:I

    move-object/from16 v0, p0

    move-object/from16 v1, p6

    move-object/from16 v2, p7

    .line 28
    invoke-virtual/range {v0 .. v5}, Lc/a/a/a/x1;->j(Lc/a/a/a/x1$c;Lc/a/a/a/x1$b;IJ)Landroid/util/Pair;

    move-result-object v0

    .line 29
    iget-object v13, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 30
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v15

    const/4 v3, -0x1

    const/4 v6, 0x0

    const/4 v9, 0x1

    goto :goto_7

    :cond_a
    const/4 v3, -0x1

    goto :goto_6

    :goto_9
    if-eq v3, v14, :cond_b

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    move-object/from16 v0, p0

    move-object/from16 v1, p6

    move-object/from16 v2, p7

    .line 31
    invoke-virtual/range {v0 .. v5}, Lc/a/a/a/x1;->j(Lc/a/a/a/x1$c;Lc/a/a/a/x1$b;IJ)Landroid/util/Pair;

    move-result-object v0

    .line 32
    iget-object v13, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 33
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v15

    move-object/from16 v2, p3

    move-wide v0, v15

    move-wide/from16 v4, v17

    goto :goto_a

    :cond_b
    move-object/from16 v2, p3

    move-wide v0, v15

    move-wide v4, v0

    .line 34
    :goto_a
    invoke-virtual {v2, v7, v13, v0, v1}, Lc/a/a/a/d1;->z(Lc/a/a/a/x1;Ljava/lang/Object;J)Lc/a/a/a/j2/d0$a;

    move-result-object v2

    .line 35
    iget v3, v2, Lc/a/a/a/j2/b0;->e:I

    if-eq v3, v14, :cond_d

    iget v3, v12, Lc/a/a/a/j2/b0;->e:I

    if-eq v3, v14, :cond_c

    iget v14, v2, Lc/a/a/a/j2/b0;->b:I

    if-lt v14, v3, :cond_c

    goto :goto_b

    :cond_c
    const/4 v3, 0x0

    goto :goto_c

    :cond_d
    :goto_b
    const/4 v3, 0x1

    .line 36
    :goto_c
    iget-object v14, v12, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    .line 37
    invoke-virtual {v14, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_e

    .line 38
    invoke-virtual {v12}, Lc/a/a/a/j2/b0;->b()Z

    move-result v13

    if-nez v13, :cond_e

    .line 39
    invoke-virtual {v2}, Lc/a/a/a/j2/b0;->b()Z

    move-result v13

    if-nez v13, :cond_e

    if-eqz v3, :cond_e

    const/16 v19, 0x1

    :cond_e
    if-eqz v19, :cond_f

    move-object v2, v12

    .line 40
    :cond_f
    invoke-virtual {v2}, Lc/a/a/a/j2/b0;->b()Z

    move-result v3

    if-eqz v3, :cond_12

    .line 41
    invoke-virtual {v2, v12}, Lc/a/a/a/j2/b0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 42
    iget-wide v0, v8, Lc/a/a/a/h1;->s:J

    goto :goto_d

    .line 43
    :cond_10
    iget-object v0, v2, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    invoke-virtual {v7, v0, v11}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    .line 44
    iget v0, v2, Lc/a/a/a/j2/b0;->c:I

    iget v1, v2, Lc/a/a/a/j2/b0;->b:I

    invoke-virtual {v11, v1}, Lc/a/a/a/x1$b;->i(I)I

    move-result v1

    if-ne v0, v1, :cond_11

    .line 45
    invoke-virtual/range {p7 .. p7}, Lc/a/a/a/x1$b;->g()J

    move-result-wide v0

    goto :goto_d

    :cond_11
    const-wide/16 v0, 0x0

    :cond_12
    :goto_d
    move-wide v7, v0

    .line 46
    new-instance v11, Lc/a/a/a/r0$g;

    move-object v0, v11

    move-object v1, v2

    move-wide v2, v7

    move v7, v10

    move v8, v9

    invoke-direct/range {v0 .. v8}, Lc/a/a/a/r0$g;-><init>(Lc/a/a/a/j2/d0$a;JJZZZ)V

    return-object v11
.end method

.method private s()J
    .locals 5

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v1, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v2, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-object v2, v2, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    iget-wide v3, v0, Lc/a/a/a/h1;->s:J

    invoke-direct {p0, v1, v2, v3, v4}, Lc/a/a/a/r0;->u(Lc/a/a/a/x1;Ljava/lang/Object;J)J

    move-result-wide v0

    return-wide v0
.end method

.method private static s0(Lc/a/a/a/x1;Lc/a/a/a/r0$h;ZIZLc/a/a/a/x1$c;Lc/a/a/a/x1$b;)Landroid/util/Pair;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/x1;",
            "Lc/a/a/a/r0$h;",
            "ZIZ",
            "Lc/a/a/a/x1$c;",
            "Lc/a/a/a/x1$b;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    move-object v7, p0

    move-object v0, p1

    move-object/from16 v8, p6

    .line 1
    iget-object v1, v0, Lc/a/a/a/r0$h;->a:Lc/a/a/a/x1;

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/x1;->q()Z

    move-result v2

    const/4 v9, 0x0

    if-eqz v2, :cond_0

    return-object v9

    .line 3
    :cond_0
    invoke-virtual {v1}, Lc/a/a/a/x1;->q()Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v10, v7

    goto :goto_0

    :cond_1
    move-object v10, v1

    .line 4
    :goto_0
    :try_start_0
    iget v4, v0, Lc/a/a/a/r0$h;->b:I

    iget-wide v5, v0, Lc/a/a/a/r0$h;->c:J

    move-object v1, v10

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    .line 5
    invoke-virtual/range {v1 .. v6}, Lc/a/a/a/x1;->j(Lc/a/a/a/x1$c;Lc/a/a/a/x1$b;IJ)Landroid/util/Pair;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    invoke-virtual {p0, v10}, Lc/a/a/a/x1;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v1

    .line 7
    :cond_2
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lc/a/a/a/x1;->b(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_4

    .line 8
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v10, v2, v8}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    .line 9
    iget v2, v8, Lc/a/a/a/x1$b;->c:I

    move-object/from16 v11, p5

    invoke-virtual {v10, v2, v11}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    move-result-object v2

    iget-boolean v2, v2, Lc/a/a/a/x1$c;->n:Z

    if-eqz v2, :cond_3

    .line 10
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p0, v1, v8}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object v1

    iget v3, v1, Lc/a/a/a/x1$b;->c:I

    .line 11
    iget-wide v4, v0, Lc/a/a/a/r0$h;->c:J

    move-object v0, p0

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    .line 12
    invoke-virtual/range {v0 .. v5}, Lc/a/a/a/x1;->j(Lc/a/a/a/x1$c;Lc/a/a/a/x1$b;IJ)Landroid/util/Pair;

    move-result-object v1

    :cond_3
    return-object v1

    :cond_4
    move-object/from16 v11, p5

    if-eqz p2, :cond_5

    .line 13
    iget-object v4, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    move-object/from16 v0, p5

    move-object/from16 v1, p6

    move v2, p3

    move/from16 v3, p4

    move-object v5, v10

    move-object v6, p0

    .line 14
    invoke-static/range {v0 .. v6}, Lc/a/a/a/r0;->t0(Lc/a/a/a/x1$c;Lc/a/a/a/x1$b;IZLjava/lang/Object;Lc/a/a/a/x1;Lc/a/a/a/x1;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 15
    invoke-virtual {p0, v0, v8}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object v0

    iget v3, v0, Lc/a/a/a/x1$b;->c:I

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    .line 16
    invoke-virtual/range {v0 .. v5}, Lc/a/a/a/x1;->j(Lc/a/a/a/x1$c;Lc/a/a/a/x1$b;IJ)Landroid/util/Pair;

    move-result-object v0

    return-object v0

    :catch_0
    :cond_5
    return-object v9
.end method

.method private static t(Lc/a/a/a/l2/h;)[Lc/a/a/a/u0;
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 1
    invoke-interface {p0}, Lc/a/a/a/l2/k;->length()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 2
    :goto_0
    new-array v2, v1, [Lc/a/a/a/u0;

    :goto_1
    if-ge v0, v1, :cond_1

    .line 3
    invoke-interface {p0, v0}, Lc/a/a/a/l2/k;->e(I)Lc/a/a/a/u0;

    move-result-object v3

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-object v2
.end method

.method static t0(Lc/a/a/a/x1$c;Lc/a/a/a/x1$b;IZLjava/lang/Object;Lc/a/a/a/x1;Lc/a/a/a/x1;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-virtual {p5, p4}, Lc/a/a/a/x1;->b(Ljava/lang/Object;)I

    move-result p4

    .line 2
    invoke-virtual {p5}, Lc/a/a/a/x1;->i()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    move v4, p4

    const/4 p4, -0x1

    :goto_0
    if-ge v2, v0, :cond_1

    if-ne p4, v1, :cond_1

    move-object v3, p5

    move-object v5, p1

    move-object v6, p0

    move v7, p2

    move v8, p3

    .line 3
    invoke-virtual/range {v3 .. v8}, Lc/a/a/a/x1;->d(ILc/a/a/a/x1$b;Lc/a/a/a/x1$c;IZ)I

    move-result v4

    if-ne v4, v1, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p5, v4}, Lc/a/a/a/x1;->m(I)Ljava/lang/Object;

    move-result-object p4

    invoke-virtual {p6, p4}, Lc/a/a/a/x1;->b(Ljava/lang/Object;)I

    move-result p4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-ne p4, v1, :cond_2

    const/4 p0, 0x0

    goto :goto_2

    .line 5
    :cond_2
    invoke-virtual {p6, p4}, Lc/a/a/a/x1;->m(I)Ljava/lang/Object;

    move-result-object p0

    :goto_2
    return-object p0
.end method

.method private u(Lc/a/a/a/x1;Ljava/lang/Object;J)J
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->k:Lc/a/a/a/x1$b;

    invoke-virtual {p1, p2, v0}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object p2

    iget p2, p2, Lc/a/a/a/x1$b;->c:I

    .line 2
    iget-object v0, p0, Lc/a/a/a/r0;->j:Lc/a/a/a/x1$c;

    invoke-virtual {p1, p2, v0}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    .line 3
    iget-object p1, p0, Lc/a/a/a/r0;->j:Lc/a/a/a/x1$c;

    iget-wide v0, p1, Lc/a/a/a/x1$c;->h:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v0, v2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lc/a/a/a/x1$c;->f()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lc/a/a/a/r0;->j:Lc/a/a/a/x1$c;

    iget-boolean p2, p1, Lc/a/a/a/x1$c;->k:Z

    if-nez p2, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Lc/a/a/a/x1$c;->a()J

    move-result-wide p1

    iget-object v0, p0, Lc/a/a/a/r0;->j:Lc/a/a/a/x1$c;

    iget-wide v0, v0, Lc/a/a/a/x1$c;->h:J

    sub-long/2addr p1, v0

    invoke-static {p1, p2}, Lc/a/a/a/i0;->c(J)J

    move-result-wide p1

    iget-object v0, p0, Lc/a/a/a/r0;->k:Lc/a/a/a/x1$b;

    .line 5
    invoke-virtual {v0}, Lc/a/a/a/x1$b;->l()J

    move-result-wide v0

    add-long/2addr p3, v0

    sub-long/2addr p1, p3

    return-wide p1

    :cond_1
    :goto_0
    return-wide v2
.end method

.method private u0(JJ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lc/a/a/a/m2/q;->f(I)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    add-long/2addr p1, p3

    invoke-interface {v0, v1, p1, p2}, Lc/a/a/a/m2/q;->e(IJ)Z

    return-void
.end method

.method private v()J
    .locals 9

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->o()Lc/a/a/a/b1;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lc/a/a/a/b1;->l()J

    move-result-wide v1

    .line 3
    iget-boolean v3, v0, Lc/a/a/a/b1;->d:Z

    if-nez v3, :cond_1

    return-wide v1

    :cond_1
    const/4 v3, 0x0

    .line 4
    :goto_0
    iget-object v4, p0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    array-length v5, v4

    if-ge v3, v5, :cond_5

    .line 5
    aget-object v4, v4, v3

    invoke-static {v4}, Lc/a/a/a/r0;->J(Lc/a/a/a/p1;)Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object v4, p0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    aget-object v4, v4, v3

    .line 6
    invoke-interface {v4}, Lc/a/a/a/p1;->n()Lc/a/a/a/j2/l0;

    move-result-object v4

    iget-object v5, v0, Lc/a/a/a/b1;->c:[Lc/a/a/a/j2/l0;

    aget-object v5, v5, v3

    if-eq v4, v5, :cond_2

    goto :goto_1

    .line 7
    :cond_2
    iget-object v4, p0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    aget-object v4, v4, v3

    invoke-interface {v4}, Lc/a/a/a/p1;->r()J

    move-result-wide v4

    const-wide/high16 v6, -0x8000000000000000L

    cmp-long v8, v4, v6

    if-nez v8, :cond_3

    return-wide v6

    .line 8
    :cond_3
    invoke-static {v4, v5, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    :cond_4
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    return-wide v1
.end method

.method private w(Lc/a/a/a/x1;)Landroid/util/Pair;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/x1;",
            ")",
            "Landroid/util/Pair<",
            "Lc/a/a/a/j2/d0$a;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/x1;->q()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lc/a/a/a/h1;->l()Lc/a/a/a/j2/d0$a;

    move-result-object p1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    iget-boolean v0, p0, Lc/a/a/a/r0;->G:Z

    invoke-virtual {p1, v0}, Lc/a/a/a/x1;->a(Z)I

    move-result v6

    .line 4
    iget-object v4, p0, Lc/a/a/a/r0;->j:Lc/a/a/a/x1$c;

    iget-object v5, p0, Lc/a/a/a/r0;->k:Lc/a/a/a/x1$b;

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    move-object v3, p1

    .line 5
    invoke-virtual/range {v3 .. v8}, Lc/a/a/a/x1;->j(Lc/a/a/a/x1$c;Lc/a/a/a/x1$b;IJ)Landroid/util/Pair;

    move-result-object v0

    .line 6
    iget-object v3, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 7
    invoke-virtual {v3, p1, v4, v1, v2}, Lc/a/a/a/d1;->z(Lc/a/a/a/x1;Ljava/lang/Object;J)Lc/a/a/a/j2/d0$a;

    move-result-object v3

    .line 8
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    .line 9
    invoke-virtual {v3}, Lc/a/a/a/j2/b0;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 10
    iget-object v0, v3, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    iget-object v4, p0, Lc/a/a/a/r0;->k:Lc/a/a/a/x1$b;

    invoke-virtual {p1, v0, v4}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    .line 11
    iget p1, v3, Lc/a/a/a/j2/b0;->c:I

    iget-object v0, p0, Lc/a/a/a/r0;->k:Lc/a/a/a/x1$b;

    iget v4, v3, Lc/a/a/a/j2/b0;->b:I

    invoke-virtual {v0, v4}, Lc/a/a/a/x1$b;->i(I)I

    move-result v0

    if-ne p1, v0, :cond_1

    .line 12
    iget-object p1, p0, Lc/a/a/a/r0;->k:Lc/a/a/a/x1$b;

    invoke-virtual {p1}, Lc/a/a/a/x1$b;->g()J

    move-result-wide v1

    :cond_1
    move-wide v4, v1

    .line 13
    :cond_2
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method private w0(Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v0

    iget-object v0, v0, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-object v0, v0, Lc/a/a/a/c1;->a:Lc/a/a/a/j2/d0$a;

    .line 2
    iget-object v1, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-wide v3, v1, Lc/a/a/a/h1;->s:J

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, v0

    .line 3
    invoke-direct/range {v1 .. v6}, Lc/a/a/a/r0;->z0(Lc/a/a/a/j2/d0$a;JZZ)J

    move-result-wide v3

    .line 4
    iget-object v1, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-wide v1, v1, Lc/a/a/a/h1;->s:J

    cmp-long v5, v3, v1

    if-eqz v5, :cond_0

    .line 5
    iget-object v1, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-wide v5, v1, Lc/a/a/a/h1;->d:J

    move-object v1, p0

    move-object v2, v0

    .line 6
    invoke-direct/range {v1 .. v6}, Lc/a/a/a/r0;->G(Lc/a/a/a/j2/d0$a;JJ)Lc/a/a/a/h1;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    if-eqz p1, :cond_0

    .line 7
    iget-object p1, p0, Lc/a/a/a/r0;->x:Lc/a/a/a/r0$e;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lc/a/a/a/r0$e;->e(I)V

    :cond_0
    return-void
.end method

.method private x0(Lc/a/a/a/r0$h;)V
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    .line 1
    iget-object v1, v8, Lc/a/a/a/r0;->x:Lc/a/a/a/r0$e;

    const/4 v9, 0x1

    invoke-virtual {v1, v9}, Lc/a/a/a/r0$e;->b(I)V

    .line 2
    iget-object v1, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v1, v1, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget v4, v8, Lc/a/a/a/r0;->D:I

    iget-boolean v5, v8, Lc/a/a/a/r0;->G:Z

    iget-object v6, v8, Lc/a/a/a/r0;->j:Lc/a/a/a/x1$c;

    iget-object v7, v8, Lc/a/a/a/r0;->k:Lc/a/a/a/x1$b;

    const/4 v3, 0x1

    move-object/from16 v2, p1

    .line 3
    invoke-static/range {v1 .. v7}, Lc/a/a/a/r0;->s0(Lc/a/a/a/x1;Lc/a/a/a/r0$h;ZIZLc/a/a/a/x1$c;Lc/a/a/a/x1$b;)Landroid/util/Pair;

    move-result-object v1

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v6, 0x0

    if-nez v1, :cond_0

    .line 4
    iget-object v7, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v7, v7, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    .line 5
    invoke-direct {v8, v7}, Lc/a/a/a/r0;->w(Lc/a/a/a/x1;)Landroid/util/Pair;

    move-result-object v7

    .line 6
    iget-object v10, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Lc/a/a/a/j2/d0$a;

    .line 7
    iget-object v7, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    .line 8
    iget-object v7, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v7, v7, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    invoke-virtual {v7}, Lc/a/a/a/x1;->q()Z

    move-result v7

    xor-int/2addr v7, v9

    move-wide v13, v4

    goto :goto_3

    .line 9
    :cond_0
    iget-object v7, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 10
    iget-object v10, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Long;

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    .line 11
    iget-wide v13, v0, Lc/a/a/a/r0$h;->c:J

    cmp-long v10, v13, v4

    if-nez v10, :cond_1

    move-wide v13, v4

    goto :goto_0

    :cond_1
    move-wide v13, v11

    .line 12
    :goto_0
    iget-object v10, v8, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    iget-object v15, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v15, v15, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    .line 13
    invoke-virtual {v10, v15, v7, v11, v12}, Lc/a/a/a/d1;->z(Lc/a/a/a/x1;Ljava/lang/Object;J)Lc/a/a/a/j2/d0$a;

    move-result-object v7

    .line 14
    invoke-virtual {v7}, Lc/a/a/a/j2/b0;->b()Z

    move-result v10

    if-eqz v10, :cond_3

    .line 15
    iget-object v4, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v4, v4, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v5, v7, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    iget-object v10, v8, Lc/a/a/a/r0;->k:Lc/a/a/a/x1$b;

    invoke-virtual {v4, v5, v10}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    .line 16
    iget-object v4, v8, Lc/a/a/a/r0;->k:Lc/a/a/a/x1$b;

    iget v5, v7, Lc/a/a/a/j2/b0;->b:I

    invoke-virtual {v4, v5}, Lc/a/a/a/x1$b;->i(I)I

    move-result v4

    iget v5, v7, Lc/a/a/a/j2/b0;->c:I

    if-ne v4, v5, :cond_2

    .line 17
    iget-object v4, v8, Lc/a/a/a/r0;->k:Lc/a/a/a/x1$b;

    invoke-virtual {v4}, Lc/a/a/a/x1$b;->g()J

    move-result-wide v4

    move-wide v11, v4

    goto :goto_1

    :cond_2
    const-wide/16 v11, 0x0

    :goto_1
    move-object v10, v7

    const/4 v7, 0x1

    goto :goto_3

    .line 18
    :cond_3
    iget-wide v2, v0, Lc/a/a/a/r0$h;->c:J

    cmp-long v10, v2, v4

    if-nez v10, :cond_4

    const/4 v2, 0x1

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    :goto_2
    move-object v10, v7

    move v7, v2

    :goto_3
    const/4 v5, 0x2

    .line 19
    :try_start_0
    iget-object v2, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v2, v2, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    invoke-virtual {v2}, Lc/a/a/a/x1;->q()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-eqz v2, :cond_5

    .line 20
    :try_start_1
    iput-object v0, v8, Lc/a/a/a/r0;->L:Lc/a/a/a/r0$h;

    goto :goto_4

    :catchall_0
    move-exception v0

    move-wide v3, v11

    const/4 v15, 0x2

    goto/16 :goto_b

    :cond_5
    const/4 v0, 0x4

    if-nez v1, :cond_7

    .line 21
    iget-object v1, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget v1, v1, Lc/a/a/a/h1;->e:I

    if-eq v1, v9, :cond_6

    .line 22
    invoke-direct {v8, v0}, Lc/a/a/a/r0;->T0(I)V

    .line 23
    :cond_6
    invoke-direct {v8, v6, v9, v6, v9}, Lc/a/a/a/r0;->l0(ZZZZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_4
    move-wide v3, v11

    const/4 v15, 0x2

    goto/16 :goto_9

    .line 24
    :cond_7
    :try_start_2
    iget-object v1, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v1, v1, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    invoke-virtual {v10, v1}, Lc/a/a/a/j2/b0;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 25
    iget-object v1, v8, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v1}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-eqz v1, :cond_8

    .line 26
    :try_start_3
    iget-boolean v2, v1, Lc/a/a/a/b1;->d:Z

    if-eqz v2, :cond_8

    const-wide/16 v2, 0x0

    cmp-long v4, v11, v2

    if-eqz v4, :cond_8

    .line 27
    iget-object v1, v1, Lc/a/a/a/b1;->a:Lc/a/a/a/j2/a0;

    iget-object v2, v8, Lc/a/a/a/r0;->v:Lc/a/a/a/u1;

    .line 28
    invoke-interface {v1, v11, v12, v2}, Lc/a/a/a/j2/a0;->g(JLc/a/a/a/u1;)J

    move-result-wide v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_5

    :cond_8
    move-wide v1, v11

    .line 29
    :goto_5
    :try_start_4
    invoke-static {v1, v2}, Lc/a/a/a/i0;->d(J)J

    move-result-wide v3

    iget-object v15, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    move-wide/from16 v16, v1

    iget-wide v0, v15, Lc/a/a/a/h1;->s:J

    invoke-static {v0, v1}, Lc/a/a/a/i0;->d(J)J

    move-result-wide v0

    cmp-long v2, v3, v0

    if-nez v2, :cond_b

    iget-object v0, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget v1, v0, Lc/a/a/a/h1;->e:I

    if-eq v1, v5, :cond_9

    const/4 v2, 0x3

    if-ne v1, v2, :cond_b

    .line 30
    :cond_9
    iget-wide v3, v0, Lc/a/a/a/h1;->s:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    move-object/from16 v1, p0

    move-object v2, v10

    const/4 v15, 0x2

    move-wide v5, v13

    .line 31
    invoke-direct/range {v1 .. v6}, Lc/a/a/a/r0;->G(Lc/a/a/a/j2/d0$a;JJ)Lc/a/a/a/h1;

    move-result-object v0

    iput-object v0, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    if-eqz v7, :cond_a

    .line 32
    iget-object v0, v8, Lc/a/a/a/r0;->x:Lc/a/a/a/r0$e;

    invoke-virtual {v0, v15}, Lc/a/a/a/r0$e;->e(I)V

    :cond_a
    return-void

    :cond_b
    const/4 v15, 0x2

    move-wide/from16 v1, v16

    goto :goto_6

    :cond_c
    const/4 v15, 0x2

    move-wide v1, v11

    .line 33
    :goto_6
    :try_start_5
    iget-object v0, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget v0, v0, Lc/a/a/a/h1;->e:I

    const/4 v3, 0x4

    if-ne v0, v3, :cond_d

    const/4 v0, 0x1

    goto :goto_7

    :cond_d
    const/4 v0, 0x0

    .line 34
    :goto_7
    invoke-direct {v8, v10, v1, v2, v0}, Lc/a/a/a/r0;->y0(Lc/a/a/a/j2/d0$a;JZ)J

    move-result-wide v16
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    cmp-long v0, v11, v16

    if-eqz v0, :cond_e

    goto :goto_8

    :cond_e
    const/4 v9, 0x0

    :goto_8
    or-int/2addr v9, v7

    .line 35
    :try_start_6
    iget-object v0, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-object v4, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v5, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    move-object/from16 v1, p0

    move-object v2, v4

    move-object v3, v10

    move-wide v6, v13

    invoke-direct/range {v1 .. v7}, Lc/a/a/a/r0;->f1(Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;J)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    move v7, v9

    move-wide/from16 v3, v16

    :goto_9
    move-object/from16 v1, p0

    move-object v2, v10

    move-wide v5, v13

    .line 36
    invoke-direct/range {v1 .. v6}, Lc/a/a/a/r0;->G(Lc/a/a/a/j2/d0$a;JJ)Lc/a/a/a/h1;

    move-result-object v0

    iput-object v0, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    if-eqz v7, :cond_f

    .line 37
    iget-object v0, v8, Lc/a/a/a/r0;->x:Lc/a/a/a/r0$e;

    invoke-virtual {v0, v15}, Lc/a/a/a/r0$e;->e(I)V

    :cond_f
    return-void

    :catchall_1
    move-exception v0

    move v7, v9

    move-wide/from16 v3, v16

    goto :goto_b

    :catchall_2
    move-exception v0

    goto :goto_a

    :catchall_3
    move-exception v0

    const/4 v15, 0x2

    :goto_a
    move-wide v3, v11

    :goto_b
    move-object/from16 v1, p0

    move-object v2, v10

    move-wide v5, v13

    .line 38
    invoke-direct/range {v1 .. v6}, Lc/a/a/a/r0;->G(Lc/a/a/a/j2/d0$a;JJ)Lc/a/a/a/h1;

    move-result-object v1

    iput-object v1, v8, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    if-eqz v7, :cond_10

    .line 39
    iget-object v1, v8, Lc/a/a/a/r0;->x:Lc/a/a/a/r0$e;

    invoke-virtual {v1, v15}, Lc/a/a/a/r0$e;->e(I)V

    .line 40
    :cond_10
    throw v0
.end method

.method private y()J
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget-wide v0, v0, Lc/a/a/a/h1;->q:J

    invoke-direct {p0, v0, v1}, Lc/a/a/a/r0;->z(J)J

    move-result-wide v0

    return-wide v0
.end method

.method private y0(Lc/a/a/a/j2/d0$a;JZ)J
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    .line 2
    invoke-virtual {v0}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v0

    iget-object v1, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v1}, Lc/a/a/a/d1;->o()Lc/a/a/a/b1;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v5, 0x0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move v6, p4

    .line 3
    invoke-direct/range {v1 .. v6}, Lc/a/a/a/r0;->z0(Lc/a/a/a/j2/d0$a;JZZ)J

    move-result-wide p1

    return-wide p1
.end method

.method private z(J)J
    .locals 5

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v0}, Lc/a/a/a/d1;->i()Lc/a/a/a/b1;

    move-result-object v0

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    return-wide v1

    .line 2
    :cond_0
    iget-wide v3, p0, Lc/a/a/a/r0;->M:J

    .line 3
    invoke-virtual {v0, v3, v4}, Lc/a/a/a/b1;->y(J)J

    move-result-wide v3

    sub-long/2addr p1, v3

    .line 4
    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method private z0(Lc/a/a/a/j2/d0$a;JZZ)J
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lc/a/a/a/r0;->d1()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lc/a/a/a/r0;->B:Z

    const/4 v1, 0x2

    if-nez p5, :cond_0

    .line 3
    iget-object p5, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    iget p5, p5, Lc/a/a/a/h1;->e:I

    const/4 v2, 0x3

    if-ne p5, v2, :cond_1

    .line 4
    :cond_0
    invoke-direct {p0, v1}, Lc/a/a/a/r0;->T0(I)V

    .line 5
    :cond_1
    iget-object p5, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {p5}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object p5

    move-object v2, p5

    :goto_0
    if-eqz v2, :cond_3

    .line 6
    iget-object v3, v2, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-object v3, v3, Lc/a/a/a/c1;->a:Lc/a/a/a/j2/d0$a;

    invoke-virtual {p1, v3}, Lc/a/a/a/j2/b0;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    .line 7
    :cond_2
    invoke-virtual {v2}, Lc/a/a/a/b1;->j()Lc/a/a/a/b1;

    move-result-object v2

    goto :goto_0

    :cond_3
    :goto_1
    const-wide/16 v3, 0x0

    if-nez p4, :cond_4

    if-ne p5, v2, :cond_4

    if-eqz v2, :cond_7

    .line 8
    invoke-virtual {v2, p2, p3}, Lc/a/a/a/b1;->z(J)J

    move-result-wide p4

    cmp-long p1, p4, v3

    if-gez p1, :cond_7

    .line 9
    :cond_4
    iget-object p1, p0, Lc/a/a/a/r0;->a:[Lc/a/a/a/p1;

    array-length p4, p1

    const/4 p5, 0x0

    :goto_2
    if-ge p5, p4, :cond_5

    aget-object v5, p1, p5

    .line 10
    invoke-direct {p0, v5}, Lc/a/a/a/r0;->i(Lc/a/a/a/p1;)V

    add-int/lit8 p5, p5, 0x1

    goto :goto_2

    :cond_5
    if-eqz v2, :cond_7

    .line 11
    :goto_3
    iget-object p1, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {p1}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object p1

    if-eq p1, v2, :cond_6

    .line 12
    iget-object p1, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {p1}, Lc/a/a/a/d1;->a()Lc/a/a/a/b1;

    goto :goto_3

    .line 13
    :cond_6
    iget-object p1, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {p1, v2}, Lc/a/a/a/d1;->y(Lc/a/a/a/b1;)Z

    .line 14
    invoke-virtual {v2, v3, v4}, Lc/a/a/a/b1;->x(J)V

    .line 15
    invoke-direct {p0}, Lc/a/a/a/r0;->n()V

    :cond_7
    if-eqz v2, :cond_b

    .line 16
    iget-object p1, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {p1, v2}, Lc/a/a/a/d1;->y(Lc/a/a/a/b1;)Z

    .line 17
    iget-boolean p1, v2, Lc/a/a/a/b1;->d:Z

    if-nez p1, :cond_8

    .line 18
    iget-object p1, v2, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    .line 19
    invoke-virtual {p1, p2, p3}, Lc/a/a/a/c1;->b(J)Lc/a/a/a/c1;

    move-result-object p1

    iput-object p1, v2, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    goto :goto_4

    .line 20
    :cond_8
    iget-object p1, v2, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-wide p4, p1, Lc/a/a/a/c1;->e:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p4, v5

    if-eqz p1, :cond_9

    cmp-long p1, p2, p4

    if-ltz p1, :cond_9

    const-wide/16 p1, 0x1

    sub-long/2addr p4, p1

    .line 21
    invoke-static {v3, v4, p4, p5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    .line 22
    :cond_9
    iget-boolean p1, v2, Lc/a/a/a/b1;->e:Z

    if-eqz p1, :cond_a

    .line 23
    iget-object p1, v2, Lc/a/a/a/b1;->a:Lc/a/a/a/j2/a0;

    invoke-interface {p1, p2, p3}, Lc/a/a/a/j2/a0;->u(J)J

    move-result-wide p1

    .line 24
    iget-object p3, v2, Lc/a/a/a/b1;->a:Lc/a/a/a/j2/a0;

    iget-wide p4, p0, Lc/a/a/a/r0;->l:J

    sub-long p4, p1, p4

    iget-boolean v2, p0, Lc/a/a/a/r0;->m:Z

    invoke-interface {p3, p4, p5, v2}, Lc/a/a/a/j2/a0;->t(JZ)V

    move-wide p2, p1

    .line 25
    :cond_a
    :goto_4
    invoke-direct {p0, p2, p3}, Lc/a/a/a/r0;->n0(J)V

    .line 26
    invoke-direct {p0}, Lc/a/a/a/r0;->P()V

    goto :goto_5

    .line 27
    :cond_b
    iget-object p1, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {p1}, Lc/a/a/a/d1;->e()V

    .line 28
    invoke-direct {p0, p2, p3}, Lc/a/a/a/r0;->n0(J)V

    .line 29
    :goto_5
    invoke-direct {p0, v0}, Lc/a/a/a/r0;->B(Z)V

    .line 30
    iget-object p1, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    invoke-interface {p1, v1}, Lc/a/a/a/m2/q;->c(I)Z

    return-wide p2
.end method


# virtual methods
.method public H0(Ljava/util/List;IJLc/a/a/a/j2/n0;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/a/a/a/f1$c;",
            ">;IJ",
            "Lc/a/a/a/j2/n0;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    new-instance v8, Lc/a/a/a/r0$b;

    const/4 v7, 0x0

    move-object v1, v8

    move-object v2, p1

    move-object v3, p5

    move v4, p2

    move-wide v5, p3

    invoke-direct/range {v1 .. v7}, Lc/a/a/a/r0$b;-><init>(Ljava/util/List;Lc/a/a/a/j2/n0;IJLc/a/a/a/r0$a;)V

    const/16 p1, 0x11

    .line 2
    invoke-interface {v0, p1, v8}, Lc/a/a/a/m2/q;->g(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public K0(ZI)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    const/4 v1, 0x1

    .line 2
    invoke-interface {v0, v1, p1, p2}, Lc/a/a/a/m2/q;->b(III)Landroid/os/Message;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public synthetic M()Ljava/lang/Boolean;
    .locals 1

    invoke-direct {p0}, Lc/a/a/a/r0;->L()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public N0(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    const/16 v1, 0xb

    const/4 v2, 0x0

    invoke-interface {v0, v1, p1, v2}, Lc/a/a/a/m2/q;->b(III)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public synthetic O(Lc/a/a/a/m1;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/a/a/a/r0;->N(Lc/a/a/a/m1;)V

    return-void
.end method

.method public Q0(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    const/4 v1, 0x0

    const/16 v2, 0xc

    invoke-interface {v0, v2, p1, v1}, Lc/a/a/a/m2/q;->b(III)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public declared-synchronized a(Lc/a/a/a/m1;)V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lc/a/a/a/r0;->y:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lc/a/a/a/r0;->h:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    const/16 v1, 0xe

    invoke-interface {v0, v1, p1}, Lc/a/a/a/m2/q;->g(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit p0

    return-void

    :cond_1
    :goto_0
    :try_start_1
    const-string v0, "ExoPlayerImplInternal"

    const-string v1, "Ignoring messages sent after release."

    .line 4
    invoke-static {v0, v1}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, v0}, Lc/a/a/a/m1;->k(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    const/16 v1, 0x16

    invoke-interface {v0, v1}, Lc/a/a/a/m2/q;->c(I)Z

    return-void
.end method

.method public b1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    const/4 v1, 0x6

    invoke-interface {v0, v1}, Lc/a/a/a/m2/q;->j(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public c0(Lc/a/a/a/j2/a0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    const/16 v1, 0x9

    invoke-interface {v0, v1, p1}, Lc/a/a/a/m2/q;->g(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public d0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lc/a/a/a/m2/q;->j(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public e(Lc/a/a/a/i1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    const/16 v1, 0x10

    .line 2
    invoke-interface {v0, v1, p1}, Lc/a/a/a/m2/q;->g(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public declared-synchronized f0()Z
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lc/a/a/a/r0;->y:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lc/a/a/a/r0;->h:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    const/4 v1, 0x7

    invoke-interface {v0, v1}, Lc/a/a/a/m2/q;->c(I)Z

    .line 3
    new-instance v0, Lc/a/a/a/x;

    invoke-direct {v0, p0}, Lc/a/a/a/x;-><init>(Lc/a/a/a/r0;)V

    iget-wide v1, p0, Lc/a/a/a/r0;->u:J

    invoke-direct {p0, v0, v1, v2}, Lc/a/a/a/r0;->k1(Lc/a/b/a/k;J)V

    .line 4
    iget-boolean v0, p0, Lc/a/a/a/r0;->y:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 5
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 6

    const-string v0, "Playback error"

    const-string v1, "ExoPlayerImplInternal"

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 1
    :try_start_0
    iget v4, p1, Landroid/os/Message;->what:I

    packed-switch v4, :pswitch_data_0

    return v2

    .line 2
    :pswitch_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lc/a/a/a/p0;

    invoke-direct {p0, p1}, Lc/a/a/a/r0;->g(Lc/a/a/a/p0;)V

    goto/16 :goto_5

    .line 3
    :pswitch_1
    iget p1, p1, Landroid/os/Message;->arg1:I

    if-ne p1, v3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {p0, p1}, Lc/a/a/a/r0;->I0(Z)V

    goto/16 :goto_5

    .line 4
    :pswitch_2
    iget p1, p1, Landroid/os/Message;->arg1:I

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    invoke-direct {p0, p1}, Lc/a/a/a/r0;->J0(Z)V

    goto/16 :goto_5

    .line 5
    :pswitch_3
    invoke-direct {p0}, Lc/a/a/a/r0;->X()V

    goto/16 :goto_5

    .line 6
    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lc/a/a/a/j2/n0;

    invoke-direct {p0, p1}, Lc/a/a/a/r0;->S0(Lc/a/a/a/j2/n0;)V

    goto/16 :goto_5

    .line 7
    :pswitch_5
    iget v4, p1, Landroid/os/Message;->arg1:I

    iget v5, p1, Landroid/os/Message;->arg2:I

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lc/a/a/a/j2/n0;

    invoke-direct {p0, v4, v5, p1}, Lc/a/a/a/r0;->h0(IILc/a/a/a/j2/n0;)V

    goto/16 :goto_5

    .line 8
    :pswitch_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lc/a/a/a/r0$c;

    invoke-direct {p0, p1}, Lc/a/a/a/r0;->Y(Lc/a/a/a/r0$c;)V

    goto/16 :goto_5

    .line 9
    :pswitch_7
    iget-object v4, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v4, Lc/a/a/a/r0$b;

    iget p1, p1, Landroid/os/Message;->arg1:I

    invoke-direct {p0, v4, p1}, Lc/a/a/a/r0;->d(Lc/a/a/a/r0$b;I)V

    goto/16 :goto_5

    .line 10
    :pswitch_8
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lc/a/a/a/r0$b;

    invoke-direct {p0, p1}, Lc/a/a/a/r0;->G0(Lc/a/a/a/r0$b;)V

    goto/16 :goto_5

    .line 11
    :pswitch_9
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lc/a/a/a/i1;

    invoke-direct {p0, p1, v2}, Lc/a/a/a/r0;->F(Lc/a/a/a/i1;Z)V

    goto/16 :goto_5

    .line 12
    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lc/a/a/a/m1;

    invoke-direct {p0, p1}, Lc/a/a/a/r0;->C0(Lc/a/a/a/m1;)V

    goto/16 :goto_5

    .line 13
    :pswitch_b
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lc/a/a/a/m1;

    invoke-direct {p0, p1}, Lc/a/a/a/r0;->A0(Lc/a/a/a/m1;)V

    goto/16 :goto_5

    .line 14
    :pswitch_c
    iget v4, p1, Landroid/os/Message;->arg1:I

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p0, v4, p1}, Lc/a/a/a/r0;->F0(ZLjava/util/concurrent/atomic/AtomicBoolean;)V

    goto :goto_5

    .line 15
    :pswitch_d
    iget p1, p1, Landroid/os/Message;->arg1:I

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    goto :goto_3

    :cond_3
    const/4 p1, 0x0

    :goto_3
    invoke-direct {p0, p1}, Lc/a/a/a/r0;->R0(Z)V

    goto :goto_5

    .line 16
    :pswitch_e
    iget p1, p1, Landroid/os/Message;->arg1:I

    invoke-direct {p0, p1}, Lc/a/a/a/r0;->O0(I)V

    goto :goto_5

    .line 17
    :pswitch_f
    invoke-direct {p0}, Lc/a/a/a/r0;->k0()V

    goto :goto_5

    .line 18
    :pswitch_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lc/a/a/a/j2/a0;

    invoke-direct {p0, p1}, Lc/a/a/a/r0;->A(Lc/a/a/a/j2/a0;)V

    goto :goto_5

    .line 19
    :pswitch_11
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lc/a/a/a/j2/a0;

    invoke-direct {p0, p1}, Lc/a/a/a/r0;->D(Lc/a/a/a/j2/a0;)V

    goto :goto_5

    .line 20
    :pswitch_12
    invoke-direct {p0}, Lc/a/a/a/r0;->g0()V

    return v3

    .line 21
    :pswitch_13
    invoke-direct {p0, v2, v3}, Lc/a/a/a/r0;->c1(ZZ)V

    goto :goto_5

    .line 22
    :pswitch_14
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lc/a/a/a/u1;

    invoke-direct {p0, p1}, Lc/a/a/a/r0;->P0(Lc/a/a/a/u1;)V

    goto :goto_5

    .line 23
    :pswitch_15
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lc/a/a/a/i1;

    invoke-direct {p0, p1}, Lc/a/a/a/r0;->M0(Lc/a/a/a/i1;)V

    goto :goto_5

    .line 24
    :pswitch_16
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lc/a/a/a/r0$h;

    invoke-direct {p0, p1}, Lc/a/a/a/r0;->x0(Lc/a/a/a/r0$h;)V

    goto :goto_5

    .line 25
    :pswitch_17
    invoke-direct {p0}, Lc/a/a/a/r0;->k()V

    goto :goto_5

    .line 26
    :pswitch_18
    iget v4, p1, Landroid/os/Message;->arg1:I

    if-eqz v4, :cond_4

    const/4 v4, 0x1

    goto :goto_4

    :cond_4
    const/4 v4, 0x0

    :goto_4
    iget p1, p1, Landroid/os/Message;->arg2:I

    invoke-direct {p0, v4, p1, v3, v3}, Lc/a/a/a/r0;->L0(ZIZI)V

    goto :goto_5

    .line 27
    :pswitch_19
    invoke-direct {p0}, Lc/a/a/a/r0;->e0()V

    .line 28
    :goto_5
    invoke-direct {p0}, Lc/a/a/a/r0;->Q()V
    :try_end_0
    .catch Lc/a/a/a/p0; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_7

    :catch_0
    move-exception p1

    .line 29
    invoke-static {p1}, Lc/a/a/a/p0;->e(Ljava/lang/RuntimeException;)Lc/a/a/a/p0;

    move-result-object p1

    .line 30
    invoke-static {v1, v0, p1}, Lc/a/a/a/m2/t;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    invoke-direct {p0, v3, v2}, Lc/a/a/a/r0;->c1(ZZ)V

    .line 32
    iget-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    invoke-virtual {v0, p1}, Lc/a/a/a/h1;->f(Lc/a/a/a/p0;)Lc/a/a/a/h1;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    .line 33
    invoke-direct {p0}, Lc/a/a/a/r0;->Q()V

    goto/16 :goto_7

    :catch_1
    move-exception p1

    .line 34
    invoke-static {p1}, Lc/a/a/a/p0;->d(Ljava/io/IOException;)Lc/a/a/a/p0;

    move-result-object p1

    .line 35
    iget-object v4, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v4}, Lc/a/a/a/d1;->n()Lc/a/a/a/b1;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 36
    iget-object v4, v4, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-object v4, v4, Lc/a/a/a/c1;->a:Lc/a/a/a/j2/d0$a;

    invoke-virtual {p1, v4}, Lc/a/a/a/p0;->a(Lc/a/a/a/j2/b0;)Lc/a/a/a/p0;

    move-result-object p1

    .line 37
    :cond_5
    invoke-static {v1, v0, p1}, Lc/a/a/a/m2/t;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    invoke-direct {p0, v2, v2}, Lc/a/a/a/r0;->c1(ZZ)V

    .line 39
    iget-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    invoke-virtual {v0, p1}, Lc/a/a/a/h1;->f(Lc/a/a/a/p0;)Lc/a/a/a/h1;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    .line 40
    invoke-direct {p0}, Lc/a/a/a/r0;->Q()V

    goto :goto_7

    :catch_2
    move-exception p1

    .line 41
    iget v4, p1, Lc/a/a/a/p0;->a:I

    if-ne v4, v3, :cond_6

    .line 42
    iget-object v4, p0, Lc/a/a/a/r0;->r:Lc/a/a/a/d1;

    invoke-virtual {v4}, Lc/a/a/a/d1;->o()Lc/a/a/a/b1;

    move-result-object v4

    if-eqz v4, :cond_6

    .line 43
    iget-object v4, v4, Lc/a/a/a/b1;->f:Lc/a/a/a/c1;

    iget-object v4, v4, Lc/a/a/a/c1;->a:Lc/a/a/a/j2/d0$a;

    invoke-virtual {p1, v4}, Lc/a/a/a/p0;->a(Lc/a/a/a/j2/b0;)Lc/a/a/a/p0;

    move-result-object p1

    .line 44
    :cond_6
    iget-boolean v4, p1, Lc/a/a/a/p0;->h:Z

    if-eqz v4, :cond_7

    iget-object v4, p0, Lc/a/a/a/r0;->P:Lc/a/a/a/p0;

    if-nez v4, :cond_7

    const-string v0, "Recoverable playback error"

    .line 45
    invoke-static {v1, v0, p1}, Lc/a/a/a/m2/t;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    iput-object p1, p0, Lc/a/a/a/r0;->P:Lc/a/a/a/p0;

    .line 47
    iget-object v0, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    const/16 v1, 0x19

    invoke-interface {v0, v1, p1}, Lc/a/a/a/m2/q;->g(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 48
    invoke-virtual {p1}, Landroid/os/Message;->getTarget()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    goto :goto_6

    .line 49
    :cond_7
    iget-object v4, p0, Lc/a/a/a/r0;->P:Lc/a/a/a/p0;

    if-eqz v4, :cond_8

    .line 50
    invoke-virtual {p1, v4}, Ljava/lang/Exception;->addSuppressed(Ljava/lang/Throwable;)V

    const/4 v4, 0x0

    .line 51
    iput-object v4, p0, Lc/a/a/a/r0;->P:Lc/a/a/a/p0;

    .line 52
    :cond_8
    invoke-static {v1, v0, p1}, Lc/a/a/a/m2/t;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    invoke-direct {p0, v3, v2}, Lc/a/a/a/r0;->c1(ZZ)V

    .line 54
    iget-object v0, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    invoke-virtual {v0, p1}, Lc/a/a/a/h1;->f(Lc/a/a/a/p0;)Lc/a/a/a/h1;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/r0;->w:Lc/a/a/a/h1;

    .line 55
    :goto_6
    invoke-direct {p0}, Lc/a/a/a/r0;->Q()V

    :goto_7
    return v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public i0(IILc/a/a/a/j2/n0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    const/16 v1, 0x14

    .line 2
    invoke-interface {v0, v1, p1, p2, p3}, Lc/a/a/a/m2/q;->d(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public m(Lc/a/a/a/j2/a0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    const/16 v1, 0x8

    invoke-interface {v0, v1, p1}, Lc/a/a/a/m2/q;->g(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public bridge synthetic p(Lc/a/a/a/j2/m0;)V
    .locals 0

    .line 1
    check-cast p1, Lc/a/a/a/j2/a0;

    invoke-virtual {p0, p1}, Lc/a/a/a/r0;->c0(Lc/a/a/a/j2/a0;)V

    return-void
.end method

.method public v0(Lc/a/a/a/x1;IJ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->g:Lc/a/a/a/m2/q;

    new-instance v1, Lc/a/a/a/r0$h;

    invoke-direct {v1, p1, p2, p3, p4}, Lc/a/a/a/r0$h;-><init>(Lc/a/a/a/x1;IJ)V

    const/4 p1, 0x3

    .line 2
    invoke-interface {v0, p1, v1}, Lc/a/a/a/m2/q;->g(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public x()Landroid/os/Looper;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/r0;->i:Landroid/os/Looper;

    return-object v0
.end method
