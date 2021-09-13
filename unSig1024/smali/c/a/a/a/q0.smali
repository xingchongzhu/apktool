.class final Lc/a/a/a/q0;
.super Lc/a/a/a/g0;
.source "ExoPlayerImpl.java"

# interfaces
.implements Lc/a/a/a/l1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/q0$a;
    }
.end annotation


# instance fields
.field private A:I

.field private B:I

.field private C:J

.field final b:Lc/a/a/a/l2/o;

.field private final c:[Lc/a/a/a/p1;

.field private final d:Lc/a/a/a/l2/n;

.field private final e:Lc/a/a/a/m2/q;

.field private final f:Lc/a/a/a/r0$f;

.field private final g:Lc/a/a/a/r0;

.field private final h:Lc/a/a/a/m2/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/a/a/m2/s<",
            "Lc/a/a/a/l1$a;",
            "Lc/a/a/a/l1$b;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lc/a/a/a/x1$b;

.field private final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/a/q0$a;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Z

.field private final l:Lc/a/a/a/j2/f0;

.field private final m:Lc/a/a/a/a2/c1;

.field private final n:Landroid/os/Looper;

.field private final o:Lcom/google/android/exoplayer2/upstream/g;

.field private final p:Lc/a/a/a/m2/g;

.field private q:I

.field private r:Z

.field private s:I

.field private t:Z

.field private u:I

.field private v:I

.field private w:Lc/a/a/a/u1;

.field private x:Lc/a/a/a/j2/n0;

.field private y:Z

.field private z:Lc/a/a/a/h1;


# direct methods
.method public constructor <init>([Lc/a/a/a/p1;Lc/a/a/a/l2/n;Lc/a/a/a/j2/f0;Lc/a/a/a/y0;Lcom/google/android/exoplayer2/upstream/g;Lc/a/a/a/a2/c1;ZLc/a/a/a/u1;Lc/a/a/a/x0;JZLc/a/a/a/m2/g;Landroid/os/Looper;Lc/a/a/a/l1;)V
    .locals 18
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v6, p5

    move-object/from16 v9, p6

    move-object/from16 v15, p13

    move-object/from16 v14, p14

    .line 1
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/g0;-><init>()V

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Init "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-static/range {p0 .. p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " ["

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "ExoPlayerLib/2.13.3"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "] ["

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lc/a/a/a/m2/m0;->e:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "]"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "ExoPlayerImpl"

    .line 4
    invoke-static {v3, v1}, Lc/a/a/a/m2/t;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    array-length v1, v2

    const/4 v3, 0x0

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lc/a/a/a/m2/f;->f(Z)V

    .line 6
    invoke-static/range {p1 .. p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lc/a/a/a/p1;

    iput-object v1, v0, Lc/a/a/a/q0;->c:[Lc/a/a/a/p1;

    .line 7
    invoke-static/range {p2 .. p2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/l2/n;

    iput-object v1, v0, Lc/a/a/a/q0;->d:Lc/a/a/a/l2/n;

    move-object/from16 v1, p3

    .line 8
    iput-object v1, v0, Lc/a/a/a/q0;->l:Lc/a/a/a/j2/f0;

    .line 9
    iput-object v6, v0, Lc/a/a/a/q0;->o:Lcom/google/android/exoplayer2/upstream/g;

    .line 10
    iput-object v9, v0, Lc/a/a/a/q0;->m:Lc/a/a/a/a2/c1;

    move/from16 v1, p7

    .line 11
    iput-boolean v1, v0, Lc/a/a/a/q0;->k:Z

    move-object/from16 v10, p8

    .line 12
    iput-object v10, v0, Lc/a/a/a/q0;->w:Lc/a/a/a/u1;

    move/from16 v12, p12

    .line 13
    iput-boolean v12, v0, Lc/a/a/a/q0;->y:Z

    .line 14
    iput-object v14, v0, Lc/a/a/a/q0;->n:Landroid/os/Looper;

    .line 15
    iput-object v15, v0, Lc/a/a/a/q0;->p:Lc/a/a/a/m2/g;

    .line 16
    iput v3, v0, Lc/a/a/a/q0;->q:I

    if-eqz p15, :cond_1

    move-object/from16 v1, p15

    goto :goto_1

    :cond_1
    move-object v1, v0

    .line 17
    :goto_1
    new-instance v4, Lc/a/a/a/m2/s;

    sget-object v5, Lc/a/a/a/b0;->a:Lc/a/a/a/b0;

    new-instance v7, Lc/a/a/a/l;

    invoke-direct {v7, v1}, Lc/a/a/a/l;-><init>(Lc/a/a/a/l1;)V

    invoke-direct {v4, v14, v15, v5, v7}, Lc/a/a/a/m2/s;-><init>(Landroid/os/Looper;Lc/a/a/a/m2/g;Lc/a/b/a/k;Lc/a/a/a/m2/s$b;)V

    iput-object v4, v0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    .line 18
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v0, Lc/a/a/a/q0;->j:Ljava/util/List;

    .line 19
    new-instance v4, Lc/a/a/a/j2/n0$a;

    invoke-direct {v4, v3}, Lc/a/a/a/j2/n0$a;-><init>(I)V

    iput-object v4, v0, Lc/a/a/a/q0;->x:Lc/a/a/a/j2/n0;

    .line 20
    new-instance v4, Lc/a/a/a/l2/o;

    array-length v3, v2

    new-array v3, v3, [Lc/a/a/a/s1;

    array-length v5, v2

    new-array v5, v5, [Lc/a/a/a/l2/h;

    const/4 v7, 0x0

    invoke-direct {v4, v3, v5, v7}, Lc/a/a/a/l2/o;-><init>([Lc/a/a/a/s1;[Lc/a/a/a/l2/h;Ljava/lang/Object;)V

    iput-object v4, v0, Lc/a/a/a/q0;->b:Lc/a/a/a/l2/o;

    .line 21
    new-instance v3, Lc/a/a/a/x1$b;

    invoke-direct {v3}, Lc/a/a/a/x1$b;-><init>()V

    iput-object v3, v0, Lc/a/a/a/q0;->i:Lc/a/a/a/x1$b;

    const/4 v3, -0x1

    .line 22
    iput v3, v0, Lc/a/a/a/q0;->A:I

    .line 23
    invoke-interface {v15, v14, v7}, Lc/a/a/a/m2/g;->b(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lc/a/a/a/m2/q;

    move-result-object v3

    iput-object v3, v0, Lc/a/a/a/q0;->e:Lc/a/a/a/m2/q;

    .line 24
    new-instance v13, Lc/a/a/a/o;

    invoke-direct {v13, v0}, Lc/a/a/a/o;-><init>(Lc/a/a/a/q0;)V

    iput-object v13, v0, Lc/a/a/a/q0;->f:Lc/a/a/a/r0$f;

    .line 25
    invoke-static {v4}, Lc/a/a/a/h1;->k(Lc/a/a/a/l2/o;)Lc/a/a/a/h1;

    move-result-object v3

    iput-object v3, v0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    if-eqz v9, :cond_2

    .line 26
    invoke-virtual {v9, v1, v14}, Lc/a/a/a/a2/c1;->p1(Lc/a/a/a/l1;Landroid/os/Looper;)V

    .line 27
    invoke-virtual {v0, v9}, Lc/a/a/a/q0;->C(Lc/a/a/a/l1$a;)V

    .line 28
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1, v14}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-interface {v6, v1, v9}, Lcom/google/android/exoplayer2/upstream/g;->g(Landroid/os/Handler;Lcom/google/android/exoplayer2/upstream/g$a;)V

    .line 29
    :cond_2
    new-instance v11, Lc/a/a/a/r0;

    move-object v1, v11

    iget v7, v0, Lc/a/a/a/q0;->q:I

    iget-boolean v8, v0, Lc/a/a/a/q0;->r:Z

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p8

    move-object v0, v11

    move-object/from16 v11, p9

    move-object/from16 v17, v13

    move-wide/from16 v12, p10

    move/from16 v14, p12

    move-object/from16 v15, p14

    move-object/from16 v16, p13

    invoke-direct/range {v1 .. v17}, Lc/a/a/a/r0;-><init>([Lc/a/a/a/p1;Lc/a/a/a/l2/n;Lc/a/a/a/l2/o;Lc/a/a/a/y0;Lcom/google/android/exoplayer2/upstream/g;IZLc/a/a/a/a2/c1;Lc/a/a/a/u1;Lc/a/a/a/x0;JZLandroid/os/Looper;Lc/a/a/a/m2/g;Lc/a/a/a/r0$f;)V

    move-object v1, v0

    move-object/from16 v0, p0

    iput-object v1, v0, Lc/a/a/a/q0;->g:Lc/a/a/a/r0;

    return-void
.end method

.method static synthetic A0(Lc/a/a/a/h1;Lc/a/a/a/l1$a;)V
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/h1;->m:I

    invoke-interface {p1, p0}, Lc/a/a/a/l1$a;->f(I)V

    return-void
.end method

.method static synthetic B0(Lc/a/a/a/h1;Lc/a/a/a/l1$a;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lc/a/a/a/q0;->l0(Lc/a/a/a/h1;)Z

    move-result p0

    invoke-interface {p1, p0}, Lc/a/a/a/l1$a;->Z(Z)V

    return-void
.end method

.method static synthetic C0(Lc/a/a/a/h1;Lc/a/a/a/l1$a;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/h1;->n:Lc/a/a/a/i1;

    invoke-interface {p1, p0}, Lc/a/a/a/l1$a;->e(Lc/a/a/a/i1;)V

    return-void
.end method

.method static synthetic D0(Lc/a/a/a/h1;Lc/a/a/a/l1$a;)V
    .locals 0

    .line 1
    iget-boolean p0, p0, Lc/a/a/a/h1;->o:Z

    invoke-interface {p1, p0}, Lc/a/a/a/l1$a;->S(Z)V

    return-void
.end method

.method static synthetic E0(Lc/a/a/a/h1;Lc/a/a/a/l1$a;)V
    .locals 0

    .line 1
    iget-boolean p0, p0, Lc/a/a/a/h1;->p:Z

    invoke-interface {p1, p0}, Lc/a/a/a/l1$a;->W(Z)V

    return-void
.end method

.method static synthetic F0(Lc/a/a/a/h1;ILc/a/a/a/l1$a;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    invoke-interface {p2, p0, p1}, Lc/a/a/a/l1$a;->D(Lc/a/a/a/x1;I)V

    return-void
.end method

.method static synthetic G0(ILc/a/a/a/l1$a;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lc/a/a/a/l1$a;->j(I)V

    return-void
.end method

.method static synthetic H0(Lc/a/a/a/z0;ILc/a/a/a/l1$a;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/l1$a;->x(Lc/a/a/a/z0;I)V

    return-void
.end method

.method static synthetic I0(Lc/a/a/a/h1;Lc/a/a/a/l1$a;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/h1;->f:Lc/a/a/a/p0;

    invoke-interface {p1, p0}, Lc/a/a/a/l1$a;->r(Lc/a/a/a/p0;)V

    return-void
.end method

.method private J0(Lc/a/a/a/h1;Lc/a/a/a/x1;Landroid/util/Pair;)Lc/a/a/a/h1;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/h1;",
            "Lc/a/a/a/x1;",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;)",
            "Lc/a/a/a/h1;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    .line 1
    invoke-virtual/range {p2 .. p2}, Lc/a/a/a/x1;->q()Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_1

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    :goto_1
    invoke-static {v3}, Lc/a/a/a/m2/f;->a(Z)V

    move-object/from16 v3, p1

    .line 2
    iget-object v5, v3, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    .line 3
    invoke-virtual/range {p1 .. p2}, Lc/a/a/a/h1;->j(Lc/a/a/a/x1;)Lc/a/a/a/h1;

    move-result-object v6

    .line 4
    invoke-virtual/range {p2 .. p2}, Lc/a/a/a/x1;->q()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 5
    invoke-static {}, Lc/a/a/a/h1;->l()Lc/a/a/a/j2/d0$a;

    move-result-object v1

    .line 6
    iget-wide v2, v0, Lc/a/a/a/q0;->C:J

    .line 7
    invoke-static {v2, v3}, Lc/a/a/a/i0;->c(J)J

    move-result-wide v8

    iget-wide v2, v0, Lc/a/a/a/q0;->C:J

    .line 8
    invoke-static {v2, v3}, Lc/a/a/a/i0;->c(J)J

    move-result-wide v10

    const-wide/16 v12, 0x0

    sget-object v14, Lc/a/a/a/j2/q0;->a:Lc/a/a/a/j2/q0;

    iget-object v15, v0, Lc/a/a/a/q0;->b:Lc/a/a/a/l2/o;

    .line 9
    invoke-static {}, Lc/a/b/b/r;->p()Lc/a/b/b/r;

    move-result-object v16

    move-object v7, v1

    .line 10
    invoke-virtual/range {v6 .. v16}, Lc/a/a/a/h1;->c(Lc/a/a/a/j2/d0$a;JJJLc/a/a/a/j2/q0;Lc/a/a/a/l2/o;Ljava/util/List;)Lc/a/a/a/h1;

    move-result-object v2

    .line 11
    invoke-virtual {v2, v1}, Lc/a/a/a/h1;->b(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/h1;

    move-result-object v1

    .line 12
    iget-wide v2, v1, Lc/a/a/a/h1;->s:J

    iput-wide v2, v1, Lc/a/a/a/h1;->q:J

    return-object v1

    .line 13
    :cond_2
    iget-object v3, v6, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-object v3, v3, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    .line 14
    invoke-static/range {p3 .. p3}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/util/Pair;

    iget-object v7, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    xor-int/2addr v7, v4

    if-eqz v7, :cond_3

    .line 15
    new-instance v8, Lc/a/a/a/j2/d0$a;

    iget-object v9, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-direct {v8, v9}, Lc/a/a/a/j2/d0$a;-><init>(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v8, v6, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    :goto_2
    move-object v15, v8

    .line 16
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    .line 17
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/q0;->i()J

    move-result-wide v8

    invoke-static {v8, v9}, Lc/a/a/a/i0;->c(J)J

    move-result-wide v8

    .line 18
    invoke-virtual {v5}, Lc/a/a/a/x1;->q()Z

    move-result v2

    if-nez v2, :cond_4

    .line 19
    iget-object v2, v0, Lc/a/a/a/q0;->i:Lc/a/a/a/x1$b;

    .line 20
    invoke-virtual {v5, v3, v2}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object v2

    invoke-virtual {v2}, Lc/a/a/a/x1$b;->l()J

    move-result-wide v2

    sub-long/2addr v8, v2

    :cond_4
    if-nez v7, :cond_a

    cmp-long v2, v12, v8

    if-gez v2, :cond_5

    goto/16 :goto_4

    :cond_5
    cmp-long v2, v12, v8

    if-nez v2, :cond_8

    .line 21
    iget-object v2, v6, Lc/a/a/a/h1;->k:Lc/a/a/a/j2/d0$a;

    iget-object v2, v2, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    .line 22
    invoke-virtual {v1, v2}, Lc/a/a/a/x1;->b(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_6

    .line 23
    iget-object v3, v0, Lc/a/a/a/q0;->i:Lc/a/a/a/x1$b;

    .line 24
    invoke-virtual {v1, v2, v3}, Lc/a/a/a/x1;->f(ILc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object v2

    iget v2, v2, Lc/a/a/a/x1$b;->c:I

    iget-object v3, v15, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    iget-object v4, v0, Lc/a/a/a/q0;->i:Lc/a/a/a/x1$b;

    .line 25
    invoke-virtual {v1, v3, v4}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object v3

    iget v3, v3, Lc/a/a/a/x1$b;->c:I

    if-eq v2, v3, :cond_e

    .line 26
    :cond_6
    iget-object v2, v15, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    iget-object v3, v0, Lc/a/a/a/q0;->i:Lc/a/a/a/x1$b;

    invoke-virtual {v1, v2, v3}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    .line 27
    invoke-virtual {v15}, Lc/a/a/a/j2/b0;->b()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 28
    iget-object v1, v0, Lc/a/a/a/q0;->i:Lc/a/a/a/x1$b;

    iget v2, v15, Lc/a/a/a/j2/b0;->b:I

    iget v3, v15, Lc/a/a/a/j2/b0;->c:I

    invoke-virtual {v1, v2, v3}, Lc/a/a/a/x1$b;->b(II)J

    move-result-wide v1

    goto :goto_3

    .line 29
    :cond_7
    iget-object v1, v0, Lc/a/a/a/q0;->i:Lc/a/a/a/x1$b;

    iget-wide v1, v1, Lc/a/a/a/x1$b;->d:J

    .line 30
    :goto_3
    iget-wide v8, v6, Lc/a/a/a/h1;->s:J

    iget-wide v10, v6, Lc/a/a/a/h1;->s:J

    iget-wide v3, v6, Lc/a/a/a/h1;->s:J

    sub-long v12, v1, v3

    iget-object v14, v6, Lc/a/a/a/h1;->h:Lc/a/a/a/j2/q0;

    iget-object v3, v6, Lc/a/a/a/h1;->i:Lc/a/a/a/l2/o;

    iget-object v4, v6, Lc/a/a/a/h1;->j:Ljava/util/List;

    move-object v7, v15

    move-object v5, v15

    move-object v15, v3

    move-object/from16 v16, v4

    .line 31
    invoke-virtual/range {v6 .. v16}, Lc/a/a/a/h1;->c(Lc/a/a/a/j2/d0$a;JJJLc/a/a/a/j2/q0;Lc/a/a/a/l2/o;Ljava/util/List;)Lc/a/a/a/h1;

    move-result-object v3

    .line 32
    invoke-virtual {v3, v5}, Lc/a/a/a/h1;->b(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/h1;

    move-result-object v6

    .line 33
    iput-wide v1, v6, Lc/a/a/a/h1;->q:J

    goto/16 :goto_8

    :cond_8
    move-object v5, v15

    .line 34
    invoke-virtual {v5}, Lc/a/a/a/j2/b0;->b()Z

    move-result v1

    xor-int/2addr v1, v4

    invoke-static {v1}, Lc/a/a/a/m2/f;->f(Z)V

    const-wide/16 v1, 0x0

    .line 35
    iget-wide v3, v6, Lc/a/a/a/h1;->r:J

    sub-long v8, v12, v8

    sub-long/2addr v3, v8

    .line 36
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    .line 37
    iget-wide v3, v6, Lc/a/a/a/h1;->q:J

    .line 38
    iget-object v7, v6, Lc/a/a/a/h1;->k:Lc/a/a/a/j2/d0$a;

    iget-object v8, v6, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    invoke-virtual {v7, v8}, Lc/a/a/a/j2/b0;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    add-long v3, v12, v1

    .line 39
    :cond_9
    iget-object v14, v6, Lc/a/a/a/h1;->h:Lc/a/a/a/j2/q0;

    iget-object v15, v6, Lc/a/a/a/h1;->i:Lc/a/a/a/l2/o;

    iget-object v10, v6, Lc/a/a/a/h1;->j:Ljava/util/List;

    move-object v7, v5

    move-wide v8, v12

    move-object v5, v10

    move-wide v10, v12

    move-wide v12, v1

    move-object/from16 v16, v5

    .line 40
    invoke-virtual/range {v6 .. v16}, Lc/a/a/a/h1;->c(Lc/a/a/a/j2/d0$a;JJJLc/a/a/a/j2/q0;Lc/a/a/a/l2/o;Ljava/util/List;)Lc/a/a/a/h1;

    move-result-object v6

    .line 41
    iput-wide v3, v6, Lc/a/a/a/h1;->q:J

    goto :goto_8

    :cond_a
    :goto_4
    move-object v5, v15

    .line 42
    invoke-virtual {v5}, Lc/a/a/a/j2/b0;->b()Z

    move-result v1

    xor-int/2addr v1, v4

    invoke-static {v1}, Lc/a/a/a/m2/f;->f(Z)V

    const-wide/16 v1, 0x0

    if-eqz v7, :cond_b

    .line 43
    sget-object v3, Lc/a/a/a/j2/q0;->a:Lc/a/a/a/j2/q0;

    goto :goto_5

    :cond_b
    iget-object v3, v6, Lc/a/a/a/h1;->h:Lc/a/a/a/j2/q0;

    :goto_5
    move-object v14, v3

    if-eqz v7, :cond_c

    .line 44
    iget-object v3, v0, Lc/a/a/a/q0;->b:Lc/a/a/a/l2/o;

    goto :goto_6

    :cond_c
    iget-object v3, v6, Lc/a/a/a/h1;->i:Lc/a/a/a/l2/o;

    :goto_6
    move-object v15, v3

    if-eqz v7, :cond_d

    .line 45
    invoke-static {}, Lc/a/b/b/r;->p()Lc/a/b/b/r;

    move-result-object v3

    goto :goto_7

    :cond_d
    iget-object v3, v6, Lc/a/a/a/h1;->j:Ljava/util/List;

    :goto_7
    move-object/from16 v16, v3

    move-object v7, v5

    move-wide v8, v12

    move-wide v10, v12

    move-wide v3, v12

    move-wide v12, v1

    .line 46
    invoke-virtual/range {v6 .. v16}, Lc/a/a/a/h1;->c(Lc/a/a/a/j2/d0$a;JJJLc/a/a/a/j2/q0;Lc/a/a/a/l2/o;Ljava/util/List;)Lc/a/a/a/h1;

    move-result-object v1

    .line 47
    invoke-virtual {v1, v5}, Lc/a/a/a/h1;->b(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/h1;

    move-result-object v6

    .line 48
    iput-wide v3, v6, Lc/a/a/a/h1;->q:J

    :cond_e
    :goto_8
    return-object v6
.end method

.method private K0(Lc/a/a/a/j2/d0$a;J)J
    .locals 2

    .line 1
    invoke-static {p2, p3}, Lc/a/a/a/i0;->d(J)J

    move-result-wide p2

    .line 2
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v0, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object p1, p1, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    iget-object v1, p0, Lc/a/a/a/q0;->i:Lc/a/a/a/x1$b;

    invoke-virtual {v0, p1, v1}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    .line 3
    iget-object p1, p0, Lc/a/a/a/q0;->i:Lc/a/a/a/x1$b;

    invoke-virtual {p1}, Lc/a/a/a/x1$b;->k()J

    move-result-wide v0

    add-long/2addr p2, v0

    return-wide p2
.end method

.method private M0(II)Lc/a/a/a/h1;
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ltz p1, :cond_0

    if-lt p2, p1, :cond_0

    .line 1
    iget-object v2, p0, Lc/a/a/a/q0;->j:Ljava/util/List;

    .line 2
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-gt p2, v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 3
    :goto_0
    invoke-static {v2}, Lc/a/a/a/m2/f;->a(Z)V

    .line 4
    invoke-virtual {p0}, Lc/a/a/a/q0;->R()I

    move-result v2

    .line 5
    invoke-virtual {p0}, Lc/a/a/a/q0;->M()Lc/a/a/a/x1;

    move-result-object v3

    .line 6
    iget-object v4, p0, Lc/a/a/a/q0;->j:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    .line 7
    iget v5, p0, Lc/a/a/a/q0;->s:I

    add-int/2addr v5, v1

    iput v5, p0, Lc/a/a/a/q0;->s:I

    .line 8
    invoke-direct {p0, p1, p2}, Lc/a/a/a/q0;->N0(II)V

    .line 9
    invoke-direct {p0}, Lc/a/a/a/q0;->d0()Lc/a/a/a/x1;

    move-result-object v5

    .line 10
    iget-object v6, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    .line 11
    invoke-direct {p0, v3, v5}, Lc/a/a/a/q0;->i0(Lc/a/a/a/x1;Lc/a/a/a/x1;)Landroid/util/Pair;

    move-result-object v3

    .line 12
    invoke-direct {p0, v6, v5, v3}, Lc/a/a/a/q0;->J0(Lc/a/a/a/h1;Lc/a/a/a/x1;Landroid/util/Pair;)Lc/a/a/a/h1;

    move-result-object v3

    .line 13
    iget v5, v3, Lc/a/a/a/h1;->e:I

    const/4 v6, 0x4

    if-eq v5, v1, :cond_1

    if-eq v5, v6, :cond_1

    if-ge p1, p2, :cond_1

    if-ne p2, v4, :cond_1

    iget-object v4, v3, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    .line 14
    invoke-virtual {v4}, Lc/a/a/a/x1;->p()I

    move-result v4

    if-lt v2, v4, :cond_1

    const/4 v0, 0x1

    :cond_1
    if-eqz v0, :cond_2

    .line 15
    invoke-virtual {v3, v6}, Lc/a/a/a/h1;->h(I)Lc/a/a/a/h1;

    move-result-object v3

    .line 16
    :cond_2
    iget-object v0, p0, Lc/a/a/a/q0;->g:Lc/a/a/a/r0;

    iget-object v1, p0, Lc/a/a/a/q0;->x:Lc/a/a/a/j2/n0;

    invoke-virtual {v0, p1, p2, v1}, Lc/a/a/a/r0;->i0(IILc/a/a/a/j2/n0;)V

    return-object v3
.end method

.method private N0(II)V
    .locals 2

    add-int/lit8 v0, p2, -0x1

    :goto_0
    if-lt v0, p1, :cond_0

    .line 1
    iget-object v1, p0, Lc/a/a/a/q0;->j:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lc/a/a/a/q0;->x:Lc/a/a/a/j2/n0;

    invoke-interface {v0, p1, p2}, Lc/a/a/a/j2/n0;->b(II)Lc/a/a/a/j2/n0;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/q0;->x:Lc/a/a/a/j2/n0;

    return-void
.end method

.method private Q0(Ljava/util/List;IJZ)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/a/a/a/j2/d0;",
            ">;IJZ)V"
        }
    .end annotation

    move-object v7, p0

    move/from16 v0, p2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/q0;->h0()I

    move-result v1

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/q0;->W()J

    move-result-wide v2

    .line 3
    iget v4, v7, Lc/a/a/a/q0;->s:I

    const/4 v5, 0x1

    add-int/2addr v4, v5

    iput v4, v7, Lc/a/a/a/q0;->s:I

    .line 4
    iget-object v4, v7, Lc/a/a/a/q0;->j:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    const/4 v6, 0x0

    if-nez v4, :cond_0

    .line 5
    iget-object v4, v7, Lc/a/a/a/q0;->j:Ljava/util/List;

    .line 6
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    .line 7
    invoke-direct {p0, v6, v4}, Lc/a/a/a/q0;->N0(II)V

    :cond_0
    move-object v4, p1

    .line 8
    invoke-direct {p0, v6, p1}, Lc/a/a/a/q0;->c0(ILjava/util/List;)Ljava/util/List;

    move-result-object v9

    .line 9
    invoke-direct {p0}, Lc/a/a/a/q0;->d0()Lc/a/a/a/x1;

    move-result-object v4

    .line 10
    invoke-virtual {v4}, Lc/a/a/a/x1;->q()Z

    move-result v6

    if-nez v6, :cond_2

    invoke-virtual {v4}, Lc/a/a/a/x1;->p()I

    move-result v6

    if-ge v0, v6, :cond_1

    goto :goto_0

    .line 11
    :cond_1
    new-instance v1, Lc/a/a/a/w0;

    move-wide/from16 v10, p3

    invoke-direct {v1, v4, v0, v10, v11}, Lc/a/a/a/w0;-><init>(Lc/a/a/a/x1;IJ)V

    throw v1

    :cond_2
    :goto_0
    move-wide/from16 v10, p3

    const/4 v6, -0x1

    if-eqz p5, :cond_3

    .line 12
    iget-boolean v0, v7, Lc/a/a/a/q0;->r:Z

    invoke-virtual {v4, v0}, Lc/a/a/a/x1;->a(Z)I

    move-result v0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    move-wide v10, v1

    goto :goto_1

    :cond_3
    if-ne v0, v6, :cond_4

    move v0, v1

    move-wide v10, v2

    .line 13
    :cond_4
    :goto_1
    iget-object v1, v7, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    .line 14
    invoke-direct {p0, v4, v0, v10, v11}, Lc/a/a/a/q0;->j0(Lc/a/a/a/x1;IJ)Landroid/util/Pair;

    move-result-object v2

    .line 15
    invoke-direct {p0, v1, v4, v2}, Lc/a/a/a/q0;->J0(Lc/a/a/a/h1;Lc/a/a/a/x1;Landroid/util/Pair;)Lc/a/a/a/h1;

    move-result-object v1

    .line 16
    iget v2, v1, Lc/a/a/a/h1;->e:I

    if-eq v0, v6, :cond_7

    if-eq v2, v5, :cond_7

    .line 17
    invoke-virtual {v4}, Lc/a/a/a/x1;->q()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {v4}, Lc/a/a/a/x1;->p()I

    move-result v2

    if-lt v0, v2, :cond_5

    goto :goto_2

    :cond_5
    const/4 v2, 0x2

    goto :goto_3

    :cond_6
    :goto_2
    const/4 v2, 0x4

    .line 18
    :cond_7
    :goto_3
    invoke-virtual {v1, v2}, Lc/a/a/a/h1;->h(I)Lc/a/a/a/h1;

    move-result-object v1

    .line 19
    iget-object v8, v7, Lc/a/a/a/q0;->g:Lc/a/a/a/r0;

    .line 20
    invoke-static {v10, v11}, Lc/a/a/a/i0;->c(J)J

    move-result-wide v11

    iget-object v13, v7, Lc/a/a/a/q0;->x:Lc/a/a/a/j2/n0;

    move v10, v0

    .line 21
    invoke-virtual/range {v8 .. v13}, Lc/a/a/a/r0;->H0(Ljava/util/List;IJLc/a/a/a/j2/n0;)V

    const/4 v2, 0x0

    const/4 v3, 0x4

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v0, p0

    .line 22
    invoke-direct/range {v0 .. v6}, Lc/a/a/a/q0;->T0(Lc/a/a/a/h1;ZIIIZ)V

    return-void
.end method

.method private T0(Lc/a/a/a/h1;ZIIIZ)V
    .locals 8

    .line 1
    iget-object v6, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    .line 2
    iput-object p1, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    .line 3
    iget-object v0, v6, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v1, p1, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    .line 4
    invoke-virtual {v0, v1}, Lc/a/a/a/x1;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v7, 0x1

    xor-int/lit8 v5, v0, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    move v3, p2

    move v4, p3

    .line 5
    invoke-direct/range {v0 .. v5}, Lc/a/a/a/q0;->f0(Lc/a/a/a/h1;Lc/a/a/a/h1;ZIZ)Landroid/util/Pair;

    move-result-object v0

    .line 6
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 7
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 8
    iget-object v2, v6, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v3, p1, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    invoke-virtual {v2, v3}, Lc/a/a/a/x1;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 9
    iget-object v2, p0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    const/4 v3, 0x0

    new-instance v4, Lc/a/a/a/c;

    invoke-direct {v4, p1, p4}, Lc/a/a/a/c;-><init>(Lc/a/a/a/h1;I)V

    invoke-virtual {v2, v3, v4}, Lc/a/a/a/m2/s;->h(ILc/a/a/a/m2/s$a;)V

    :cond_0
    if-eqz p2, :cond_1

    .line 10
    iget-object p2, p0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    const/16 p4, 0xc

    new-instance v2, Lc/a/a/a/d;

    invoke-direct {v2, p3}, Lc/a/a/a/d;-><init>(I)V

    invoke-virtual {p2, p4, v2}, Lc/a/a/a/m2/s;->h(ILc/a/a/a/m2/s$a;)V

    :cond_1
    if-eqz v1, :cond_3

    .line 11
    iget-object p2, p1, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    invoke-virtual {p2}, Lc/a/a/a/x1;->q()Z

    move-result p2

    if-nez p2, :cond_2

    .line 12
    iget-object p2, p1, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object p3, p1, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-object p3, p3, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    iget-object p4, p0, Lc/a/a/a/q0;->i:Lc/a/a/a/x1$b;

    .line 13
    invoke-virtual {p2, p3, p4}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object p2

    iget p2, p2, Lc/a/a/a/x1$b;->c:I

    .line 14
    iget-object p3, p1, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object p4, p0, Lc/a/a/a/g0;->a:Lc/a/a/a/x1$c;

    invoke-virtual {p3, p2, p4}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    move-result-object p2

    iget-object p2, p2, Lc/a/a/a/x1$c;->e:Lc/a/a/a/z0;

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    .line 15
    :goto_0
    iget-object p3, p0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    new-instance p4, Lc/a/a/a/r;

    invoke-direct {p4, p2, v0}, Lc/a/a/a/r;-><init>(Lc/a/a/a/z0;I)V

    invoke-virtual {p3, v7, p4}, Lc/a/a/a/m2/s;->h(ILc/a/a/a/m2/s$a;)V

    .line 16
    :cond_3
    iget-object p2, v6, Lc/a/a/a/h1;->f:Lc/a/a/a/p0;

    iget-object p3, p1, Lc/a/a/a/h1;->f:Lc/a/a/a/p0;

    if-eq p2, p3, :cond_4

    if-eqz p3, :cond_4

    .line 17
    iget-object p2, p0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    const/16 p3, 0xb

    new-instance p4, Lc/a/a/a/n;

    invoke-direct {p4, p1}, Lc/a/a/a/n;-><init>(Lc/a/a/a/h1;)V

    invoke-virtual {p2, p3, p4}, Lc/a/a/a/m2/s;->h(ILc/a/a/a/m2/s$a;)V

    .line 18
    :cond_4
    iget-object p2, v6, Lc/a/a/a/h1;->i:Lc/a/a/a/l2/o;

    iget-object p3, p1, Lc/a/a/a/h1;->i:Lc/a/a/a/l2/o;

    if-eq p2, p3, :cond_5

    .line 19
    iget-object p2, p0, Lc/a/a/a/q0;->d:Lc/a/a/a/l2/n;

    iget-object p3, p3, Lc/a/a/a/l2/o;->d:Ljava/lang/Object;

    invoke-virtual {p2, p3}, Lc/a/a/a/l2/n;->c(Ljava/lang/Object;)V

    .line 20
    new-instance p2, Lc/a/a/a/l2/l;

    iget-object p3, p1, Lc/a/a/a/h1;->i:Lc/a/a/a/l2/o;

    iget-object p3, p3, Lc/a/a/a/l2/o;->c:[Lc/a/a/a/l2/h;

    invoke-direct {p2, p3}, Lc/a/a/a/l2/l;-><init>([Lc/a/a/a/l2/k;)V

    .line 21
    iget-object p3, p0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    const/4 p4, 0x2

    new-instance v0, Lc/a/a/a/m;

    invoke-direct {v0, p1, p2}, Lc/a/a/a/m;-><init>(Lc/a/a/a/h1;Lc/a/a/a/l2/l;)V

    invoke-virtual {p3, p4, v0}, Lc/a/a/a/m2/s;->h(ILc/a/a/a/m2/s$a;)V

    .line 22
    :cond_5
    iget-object p2, v6, Lc/a/a/a/h1;->j:Ljava/util/List;

    iget-object p3, p1, Lc/a/a/a/h1;->j:Ljava/util/List;

    invoke-interface {p2, p3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    .line 23
    iget-object p2, p0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    const/4 p3, 0x3

    new-instance p4, Lc/a/a/a/j;

    invoke-direct {p4, p1}, Lc/a/a/a/j;-><init>(Lc/a/a/a/h1;)V

    invoke-virtual {p2, p3, p4}, Lc/a/a/a/m2/s;->h(ILc/a/a/a/m2/s$a;)V

    .line 24
    :cond_6
    iget-boolean p2, v6, Lc/a/a/a/h1;->g:Z

    iget-boolean p3, p1, Lc/a/a/a/h1;->g:Z

    if-eq p2, p3, :cond_7

    .line 25
    iget-object p2, p0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    const/4 p3, 0x4

    new-instance p4, Lc/a/a/a/f;

    invoke-direct {p4, p1}, Lc/a/a/a/f;-><init>(Lc/a/a/a/h1;)V

    invoke-virtual {p2, p3, p4}, Lc/a/a/a/m2/s;->h(ILc/a/a/a/m2/s$a;)V

    .line 26
    :cond_7
    iget p2, v6, Lc/a/a/a/h1;->e:I

    iget p3, p1, Lc/a/a/a/h1;->e:I

    const/4 p4, -0x1

    if-ne p2, p3, :cond_8

    iget-boolean p2, v6, Lc/a/a/a/h1;->l:Z

    iget-boolean p3, p1, Lc/a/a/a/h1;->l:Z

    if-eq p2, p3, :cond_9

    .line 27
    :cond_8
    iget-object p2, p0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    new-instance p3, Lc/a/a/a/p;

    invoke-direct {p3, p1}, Lc/a/a/a/p;-><init>(Lc/a/a/a/h1;)V

    invoke-virtual {p2, p4, p3}, Lc/a/a/a/m2/s;->h(ILc/a/a/a/m2/s$a;)V

    .line 28
    :cond_9
    iget p2, v6, Lc/a/a/a/h1;->e:I

    iget p3, p1, Lc/a/a/a/h1;->e:I

    if-eq p2, p3, :cond_a

    .line 29
    iget-object p2, p0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    const/4 p3, 0x5

    new-instance v0, Lc/a/a/a/k;

    invoke-direct {v0, p1}, Lc/a/a/a/k;-><init>(Lc/a/a/a/h1;)V

    invoke-virtual {p2, p3, v0}, Lc/a/a/a/m2/s;->h(ILc/a/a/a/m2/s$a;)V

    .line 30
    :cond_a
    iget-boolean p2, v6, Lc/a/a/a/h1;->l:Z

    iget-boolean p3, p1, Lc/a/a/a/h1;->l:Z

    if-eq p2, p3, :cond_b

    .line 31
    iget-object p2, p0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    const/4 p3, 0x6

    new-instance v0, Lc/a/a/a/v;

    invoke-direct {v0, p1, p5}, Lc/a/a/a/v;-><init>(Lc/a/a/a/h1;I)V

    invoke-virtual {p2, p3, v0}, Lc/a/a/a/m2/s;->h(ILc/a/a/a/m2/s$a;)V

    .line 32
    :cond_b
    iget p2, v6, Lc/a/a/a/h1;->m:I

    iget p3, p1, Lc/a/a/a/h1;->m:I

    if-eq p2, p3, :cond_c

    .line 33
    iget-object p2, p0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    const/4 p3, 0x7

    new-instance p5, Lc/a/a/a/s;

    invoke-direct {p5, p1}, Lc/a/a/a/s;-><init>(Lc/a/a/a/h1;)V

    invoke-virtual {p2, p3, p5}, Lc/a/a/a/m2/s;->h(ILc/a/a/a/m2/s$a;)V

    .line 34
    :cond_c
    invoke-static {v6}, Lc/a/a/a/q0;->l0(Lc/a/a/a/h1;)Z

    move-result p2

    invoke-static {p1}, Lc/a/a/a/q0;->l0(Lc/a/a/a/h1;)Z

    move-result p3

    if-eq p2, p3, :cond_d

    .line 35
    iget-object p2, p0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    const/16 p3, 0x8

    new-instance p5, Lc/a/a/a/i;

    invoke-direct {p5, p1}, Lc/a/a/a/i;-><init>(Lc/a/a/a/h1;)V

    invoke-virtual {p2, p3, p5}, Lc/a/a/a/m2/s;->h(ILc/a/a/a/m2/s$a;)V

    .line 36
    :cond_d
    iget-object p2, v6, Lc/a/a/a/h1;->n:Lc/a/a/a/i1;

    iget-object p3, p1, Lc/a/a/a/h1;->n:Lc/a/a/a/i1;

    invoke-virtual {p2, p3}, Lc/a/a/a/i1;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_e

    .line 37
    iget-object p2, p0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    const/16 p3, 0xd

    new-instance p5, Lc/a/a/a/w;

    invoke-direct {p5, p1}, Lc/a/a/a/w;-><init>(Lc/a/a/a/h1;)V

    invoke-virtual {p2, p3, p5}, Lc/a/a/a/m2/s;->h(ILc/a/a/a/m2/s$a;)V

    :cond_e
    if-eqz p6, :cond_f

    .line 38
    iget-object p2, p0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    sget-object p3, Lc/a/a/a/a;->a:Lc/a/a/a/a;

    invoke-virtual {p2, p4, p3}, Lc/a/a/a/m2/s;->h(ILc/a/a/a/m2/s$a;)V

    .line 39
    :cond_f
    iget-boolean p2, v6, Lc/a/a/a/h1;->o:Z

    iget-boolean p3, p1, Lc/a/a/a/h1;->o:Z

    if-eq p2, p3, :cond_10

    .line 40
    iget-object p2, p0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    new-instance p3, Lc/a/a/a/g;

    invoke-direct {p3, p1}, Lc/a/a/a/g;-><init>(Lc/a/a/a/h1;)V

    invoke-virtual {p2, p4, p3}, Lc/a/a/a/m2/s;->h(ILc/a/a/a/m2/s$a;)V

    .line 41
    :cond_10
    iget-boolean p2, v6, Lc/a/a/a/h1;->p:Z

    iget-boolean p3, p1, Lc/a/a/a/h1;->p:Z

    if-eq p2, p3, :cond_11

    .line 42
    iget-object p2, p0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    new-instance p3, Lc/a/a/a/u;

    invoke-direct {p3, p1}, Lc/a/a/a/u;-><init>(Lc/a/a/a/h1;)V

    invoke-virtual {p2, p4, p3}, Lc/a/a/a/m2/s;->h(ILc/a/a/a/m2/s$a;)V

    .line 43
    :cond_11
    iget-object p1, p0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    invoke-virtual {p1}, Lc/a/a/a/m2/s;->c()V

    return-void
.end method

.method private c0(ILjava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lc/a/a/a/j2/d0;",
            ">;)",
            "Ljava/util/List<",
            "Lc/a/a/a/f1$c;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 2
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 3
    new-instance v2, Lc/a/a/a/f1$c;

    .line 4
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/a/a/a/j2/d0;

    iget-boolean v4, p0, Lc/a/a/a/q0;->k:Z

    invoke-direct {v2, v3, v4}, Lc/a/a/a/f1$c;-><init>(Lc/a/a/a/j2/d0;Z)V

    .line 5
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    iget-object v3, p0, Lc/a/a/a/q0;->j:Ljava/util/List;

    add-int v4, v1, p1

    new-instance v5, Lc/a/a/a/q0$a;

    iget-object v6, v2, Lc/a/a/a/f1$c;->b:Ljava/lang/Object;

    iget-object v2, v2, Lc/a/a/a/f1$c;->a:Lc/a/a/a/j2/y;

    .line 7
    invoke-virtual {v2}, Lc/a/a/a/j2/y;->K()Lc/a/a/a/x1;

    move-result-object v2

    invoke-direct {v5, v6, v2}, Lc/a/a/a/q0$a;-><init>(Ljava/lang/Object;Lc/a/a/a/x1;)V

    .line 8
    invoke-interface {v3, v4, v5}, Ljava/util/List;->add(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9
    :cond_0
    iget-object p2, p0, Lc/a/a/a/q0;->x:Lc/a/a/a/j2/n0;

    .line 10
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    .line 11
    invoke-interface {p2, p1, v1}, Lc/a/a/a/j2/n0;->d(II)Lc/a/a/a/j2/n0;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/q0;->x:Lc/a/a/a/j2/n0;

    return-object v0
.end method

.method private d0()Lc/a/a/a/x1;
    .locals 3

    .line 1
    new-instance v0, Lc/a/a/a/n1;

    iget-object v1, p0, Lc/a/a/a/q0;->j:Ljava/util/List;

    iget-object v2, p0, Lc/a/a/a/q0;->x:Lc/a/a/a/j2/n0;

    invoke-direct {v0, v1, v2}, Lc/a/a/a/n1;-><init>(Ljava/util/Collection;Lc/a/a/a/j2/n0;)V

    return-object v0
.end method

.method private f0(Lc/a/a/a/h1;Lc/a/a/a/h1;ZIZ)Landroid/util/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/h1;",
            "Lc/a/a/a/h1;",
            "ZIZ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p2, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    .line 2
    iget-object v1, p1, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    .line 3
    invoke-virtual {v1}, Lc/a/a/a/x1;->q()Z

    move-result v2

    const/4 v3, -0x1

    .line 4
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v2, :cond_0

    .line 5
    invoke-virtual {v0}, Lc/a/a/a/x1;->q()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 6
    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p1, p2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    .line 7
    :cond_0
    invoke-virtual {v1}, Lc/a/a/a/x1;->q()Z

    move-result v2

    invoke-virtual {v0}, Lc/a/a/a/x1;->q()Z

    move-result v4

    const/4 v5, 0x3

    if-eq v2, v4, :cond_1

    .line 8
    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    .line 9
    :cond_1
    iget-object p2, p2, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-object p2, p2, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    iget-object v2, p0, Lc/a/a/a/q0;->i:Lc/a/a/a/x1$b;

    .line 10
    invoke-virtual {v0, p2, v2}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object p2

    iget p2, p2, Lc/a/a/a/x1$b;->c:I

    .line 11
    iget-object v2, p0, Lc/a/a/a/g0;->a:Lc/a/a/a/x1$c;

    invoke-virtual {v0, p2, v2}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    move-result-object p2

    iget-object p2, p2, Lc/a/a/a/x1$c;->c:Ljava/lang/Object;

    .line 12
    iget-object v0, p1, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-object v0, v0, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    iget-object v2, p0, Lc/a/a/a/q0;->i:Lc/a/a/a/x1$b;

    .line 13
    invoke-virtual {v1, v0, v2}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object v0

    iget v0, v0, Lc/a/a/a/x1$b;->c:I

    .line 14
    iget-object v2, p0, Lc/a/a/a/g0;->a:Lc/a/a/a/x1$c;

    invoke-virtual {v1, v0, v2}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    move-result-object v0

    iget-object v0, v0, Lc/a/a/a/x1$c;->c:Ljava/lang/Object;

    .line 15
    iget-object v2, p0, Lc/a/a/a/g0;->a:Lc/a/a/a/x1$c;

    iget v2, v2, Lc/a/a/a/x1$c;->o:I

    .line 16
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    const/4 p1, 0x1

    if-eqz p3, :cond_2

    if-nez p4, :cond_2

    const/4 v5, 0x1

    goto :goto_0

    :cond_2
    if-eqz p3, :cond_3

    if-ne p4, p1, :cond_3

    const/4 v5, 0x2

    goto :goto_0

    :cond_3
    if-eqz p5, :cond_4

    .line 17
    :goto_0
    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    .line 18
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_5
    if-eqz p3, :cond_6

    if-nez p4, :cond_6

    .line 19
    iget-object p1, p1, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-object p1, p1, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    .line 20
    invoke-virtual {v1, p1}, Lc/a/a/a/x1;->b(Ljava/lang/Object;)I

    move-result p1

    if-ne p1, v2, :cond_6

    .line 21
    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 p3, 0x0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    .line 22
    :cond_6
    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p1, p2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method private h0()I
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v0, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    invoke-virtual {v0}, Lc/a/a/a/x1;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget v0, p0, Lc/a/a/a/q0;->A:I

    return v0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v1, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v0, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-object v0, v0, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    iget-object v2, p0, Lc/a/a/a/q0;->i:Lc/a/a/a/x1$b;

    invoke-virtual {v1, v0, v2}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object v0

    iget v0, v0, Lc/a/a/a/x1$b;->c:I

    return v0
.end method

.method private i0(Lc/a/a/a/x1;Lc/a/a/a/x1;)Landroid/util/Pair;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/x1;",
            "Lc/a/a/a/x1;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/q0;->i()J

    move-result-wide v0

    .line 2
    invoke-virtual {p1}, Lc/a/a/a/x1;->q()Z

    move-result v2

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v5, -0x1

    if-nez v2, :cond_3

    invoke-virtual {p2}, Lc/a/a/a/x1;->q()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lc/a/a/a/q0;->R()I

    move-result v9

    .line 4
    iget-object v7, p0, Lc/a/a/a/g0;->a:Lc/a/a/a/x1$c;

    iget-object v8, p0, Lc/a/a/a/q0;->i:Lc/a/a/a/x1$b;

    .line 5
    invoke-static {v0, v1}, Lc/a/a/a/i0;->c(J)J

    move-result-wide v10

    move-object v6, p1

    .line 6
    invoke-virtual/range {v6 .. v11}, Lc/a/a/a/x1;->j(Lc/a/a/a/x1$c;Lc/a/a/a/x1$b;IJ)Landroid/util/Pair;

    move-result-object v0

    .line 7
    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    iget-object v10, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 8
    invoke-virtual {p2, v10}, Lc/a/a/a/x1;->b(Ljava/lang/Object;)I

    move-result v1

    if-eq v1, v5, :cond_1

    return-object v0

    .line 9
    :cond_1
    iget-object v6, p0, Lc/a/a/a/g0;->a:Lc/a/a/a/x1$c;

    iget-object v7, p0, Lc/a/a/a/q0;->i:Lc/a/a/a/x1$b;

    iget v8, p0, Lc/a/a/a/q0;->q:I

    iget-boolean v9, p0, Lc/a/a/a/q0;->r:Z

    move-object v11, p1

    move-object v12, p2

    .line 10
    invoke-static/range {v6 .. v12}, Lc/a/a/a/r0;->t0(Lc/a/a/a/x1$c;Lc/a/a/a/x1$b;IZLjava/lang/Object;Lc/a/a/a/x1;Lc/a/a/a/x1;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 11
    iget-object v0, p0, Lc/a/a/a/q0;->i:Lc/a/a/a/x1$b;

    invoke-virtual {p2, p1, v0}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    .line 12
    iget-object p1, p0, Lc/a/a/a/q0;->i:Lc/a/a/a/x1$b;

    iget p1, p1, Lc/a/a/a/x1$b;->c:I

    iget-object v0, p0, Lc/a/a/a/g0;->a:Lc/a/a/a/x1$c;

    .line 13
    invoke-virtual {p2, p1, v0}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    move-result-object v0

    invoke-virtual {v0}, Lc/a/a/a/x1$c;->b()J

    move-result-wide v0

    .line 14
    invoke-direct {p0, p2, p1, v0, v1}, Lc/a/a/a/q0;->j0(Lc/a/a/a/x1;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    .line 15
    :cond_2
    invoke-direct {p0, p2, v5, v3, v4}, Lc/a/a/a/q0;->j0(Lc/a/a/a/x1;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    .line 16
    :cond_3
    :goto_0
    invoke-virtual {p1}, Lc/a/a/a/x1;->q()Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p2}, Lc/a/a/a/x1;->q()Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x1

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_5

    goto :goto_2

    .line 17
    :cond_5
    invoke-direct {p0}, Lc/a/a/a/q0;->h0()I

    move-result v5

    :goto_2
    if-eqz p1, :cond_6

    move-wide v0, v3

    .line 18
    :cond_6
    invoke-direct {p0, p2, v5, v0, v1}, Lc/a/a/a/q0;->j0(Lc/a/a/a/x1;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method private j0(Lc/a/a/a/x1;IJ)Landroid/util/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/x1;",
            "IJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/x1;->q()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iput p2, p0, Lc/a/a/a/q0;->A:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p3, p1

    if-nez v0, :cond_0

    const-wide/16 p3, 0x0

    .line 3
    :cond_0
    iput-wide p3, p0, Lc/a/a/a/q0;->C:J

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lc/a/a/a/q0;->B:I

    const/4 p1, 0x0

    return-object p1

    :cond_1
    const/4 v0, -0x1

    if-eq p2, v0, :cond_2

    .line 5
    invoke-virtual {p1}, Lc/a/a/a/x1;->p()I

    move-result v0

    if-lt p2, v0, :cond_3

    .line 6
    :cond_2
    iget-boolean p2, p0, Lc/a/a/a/q0;->r:Z

    invoke-virtual {p1, p2}, Lc/a/a/a/x1;->a(Z)I

    move-result p2

    .line 7
    iget-object p3, p0, Lc/a/a/a/g0;->a:Lc/a/a/a/x1$c;

    invoke-virtual {p1, p2, p3}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    move-result-object p3

    invoke-virtual {p3}, Lc/a/a/a/x1$c;->b()J

    move-result-wide p3

    :cond_3
    move v3, p2

    .line 8
    iget-object v1, p0, Lc/a/a/a/g0;->a:Lc/a/a/a/x1$c;

    iget-object v2, p0, Lc/a/a/a/q0;->i:Lc/a/a/a/x1$b;

    invoke-static {p3, p4}, Lc/a/a/a/i0;->c(J)J

    move-result-wide v4

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lc/a/a/a/x1;->j(Lc/a/a/a/x1$c;Lc/a/a/a/x1$b;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method private k0(Lc/a/a/a/r0$e;)V
    .locals 11

    .line 1
    iget v0, p0, Lc/a/a/a/q0;->s:I

    iget v1, p1, Lc/a/a/a/r0$e;->c:I

    sub-int/2addr v0, v1

    iput v0, p0, Lc/a/a/a/q0;->s:I

    .line 2
    iget-boolean v1, p1, Lc/a/a/a/r0$e;->d:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 3
    iput-boolean v2, p0, Lc/a/a/a/q0;->t:Z

    .line 4
    iget v1, p1, Lc/a/a/a/r0$e;->e:I

    iput v1, p0, Lc/a/a/a/q0;->u:I

    .line 5
    :cond_0
    iget-boolean v1, p1, Lc/a/a/a/r0$e;->f:Z

    if-eqz v1, :cond_1

    .line 6
    iget v1, p1, Lc/a/a/a/r0$e;->g:I

    iput v1, p0, Lc/a/a/a/q0;->v:I

    :cond_1
    if-nez v0, :cond_5

    .line 7
    iget-object v0, p1, Lc/a/a/a/r0$e;->b:Lc/a/a/a/h1;

    iget-object v0, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    .line 8
    iget-object v1, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v1, v1, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    invoke-virtual {v1}, Lc/a/a/a/x1;->q()Z

    move-result v1

    const/4 v3, 0x0

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lc/a/a/a/x1;->q()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    .line 9
    iput v1, p0, Lc/a/a/a/q0;->A:I

    const-wide/16 v4, 0x0

    .line 10
    iput-wide v4, p0, Lc/a/a/a/q0;->C:J

    .line 11
    iput v3, p0, Lc/a/a/a/q0;->B:I

    .line 12
    :cond_2
    invoke-virtual {v0}, Lc/a/a/a/x1;->q()Z

    move-result v1

    if-nez v1, :cond_4

    .line 13
    check-cast v0, Lc/a/a/a/n1;

    invoke-virtual {v0}, Lc/a/a/a/n1;->E()Ljava/util/List;

    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    iget-object v4, p0, Lc/a/a/a/q0;->j:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ne v1, v4, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Lc/a/a/a/m2/f;->f(Z)V

    const/4 v1, 0x0

    .line 15
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 16
    iget-object v2, p0, Lc/a/a/a/q0;->j:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/a/a/a/q0$a;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc/a/a/a/x1;

    invoke-static {v2, v4}, Lc/a/a/a/q0$a;->c(Lc/a/a/a/q0$a;Lc/a/a/a/x1;)Lc/a/a/a/x1;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 17
    :cond_4
    iget-boolean v6, p0, Lc/a/a/a/q0;->t:Z

    .line 18
    iput-boolean v3, p0, Lc/a/a/a/q0;->t:Z

    .line 19
    iget-object v5, p1, Lc/a/a/a/r0$e;->b:Lc/a/a/a/h1;

    iget v7, p0, Lc/a/a/a/q0;->u:I

    const/4 v8, 0x1

    iget v9, p0, Lc/a/a/a/q0;->v:I

    const/4 v10, 0x0

    move-object v4, p0

    invoke-direct/range {v4 .. v10}, Lc/a/a/a/q0;->T0(Lc/a/a/a/h1;ZIIIZ)V

    :cond_5
    return-void
.end method

.method private static l0(Lc/a/a/a/h1;)Z
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/h1;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lc/a/a/a/h1;->l:Z

    if-eqz v0, :cond_0

    iget p0, p0, Lc/a/a/a/h1;->m:I

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static synthetic m0(Lc/a/a/a/l1;Lc/a/a/a/l1$a;Lc/a/a/a/l1$b;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0, p2}, Lc/a/a/a/l1$a;->R(Lc/a/a/a/l1;Lc/a/a/a/l1$b;)V

    return-void
.end method

.method private synthetic n0(Lc/a/a/a/r0$e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lc/a/a/a/q0;->k0(Lc/a/a/a/r0$e;)V

    return-void
.end method

.method private synthetic p0(Lc/a/a/a/r0$e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->e:Lc/a/a/a/m2/q;

    new-instance v1, Lc/a/a/a/t;

    invoke-direct {v1, p0, p1}, Lc/a/a/a/t;-><init>(Lc/a/a/a/q0;Lc/a/a/a/r0$e;)V

    invoke-interface {v0, v1}, Lc/a/a/a/m2/q;->i(Ljava/lang/Runnable;)Z

    return-void
.end method

.method static synthetic r0(Lc/a/a/a/l1$a;)V
    .locals 2

    .line 1
    new-instance v0, Lc/a/a/a/t0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lc/a/a/a/t0;-><init>(I)V

    .line 2
    invoke-static {v0}, Lc/a/a/a/p0;->b(Ljava/lang/Exception;)Lc/a/a/a/p0;

    move-result-object v0

    .line 3
    invoke-interface {p0, v0}, Lc/a/a/a/l1$a;->r(Lc/a/a/a/p0;)V

    return-void
.end method

.method static synthetic s0(ILc/a/a/a/l1$a;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lc/a/a/a/l1$a;->c(I)V

    return-void
.end method

.method static synthetic t0(ZLc/a/a/a/l1$a;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lc/a/a/a/l1$a;->P(Z)V

    return-void
.end method

.method static synthetic u0(Lc/a/a/a/h1;Lc/a/a/a/l2/l;Lc/a/a/a/l1$a;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/h1;->h:Lc/a/a/a/j2/q0;

    invoke-interface {p2, p0, p1}, Lc/a/a/a/l1$a;->L(Lc/a/a/a/j2/q0;Lc/a/a/a/l2/l;)V

    return-void
.end method

.method static synthetic v0(Lc/a/a/a/h1;Lc/a/a/a/l1$a;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/h1;->j:Ljava/util/List;

    invoke-interface {p1, p0}, Lc/a/a/a/l1$a;->o(Ljava/util/List;)V

    return-void
.end method

.method static synthetic w0(Lc/a/a/a/h1;Lc/a/a/a/l1$a;)V
    .locals 0

    .line 1
    iget-boolean p0, p0, Lc/a/a/a/h1;->g:Z

    invoke-interface {p1, p0}, Lc/a/a/a/l1$a;->u(Z)V

    return-void
.end method

.method static synthetic x0(Lc/a/a/a/h1;Lc/a/a/a/l1$a;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/h1;->l:Z

    iget p0, p0, Lc/a/a/a/h1;->e:I

    invoke-interface {p1, v0, p0}, Lc/a/a/a/l1$a;->g(ZI)V

    return-void
.end method

.method static synthetic y0(Lc/a/a/a/h1;Lc/a/a/a/l1$a;)V
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/h1;->e:I

    invoke-interface {p1, p0}, Lc/a/a/a/l1$a;->G(I)V

    return-void
.end method

.method static synthetic z0(Lc/a/a/a/h1;ILc/a/a/a/l1$a;)V
    .locals 0

    .line 1
    iget-boolean p0, p0, Lc/a/a/a/h1;->l:Z

    invoke-interface {p2, p0, p1}, Lc/a/a/a/l1$a;->H(ZI)V

    return-void
.end method


# virtual methods
.method public A(I)V
    .locals 3

    .line 1
    iget v0, p0, Lc/a/a/a/q0;->q:I

    if-eq v0, p1, :cond_0

    .line 2
    iput p1, p0, Lc/a/a/a/q0;->q:I

    .line 3
    iget-object v0, p0, Lc/a/a/a/q0;->g:Lc/a/a/a/r0;

    invoke-virtual {v0, p1}, Lc/a/a/a/r0;->N0(I)V

    .line 4
    iget-object v0, p0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    const/16 v1, 0x9

    new-instance v2, Lc/a/a/a/e;

    invoke-direct {v2, p1}, Lc/a/a/a/e;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Lc/a/a/a/m2/s;->k(ILc/a/a/a/m2/s$a;)V

    :cond_0
    return-void
.end method

.method public C(Lc/a/a/a/l1$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    invoke-virtual {v0, p1}, Lc/a/a/a/m2/s;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public D()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/q0;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v0, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget v0, v0, Lc/a/a/a/j2/b0;->c:I

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public H()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget v0, v0, Lc/a/a/a/h1;->m:I

    return v0
.end method

.method public I()Lc/a/a/a/j2/q0;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v0, v0, Lc/a/a/a/h1;->h:Lc/a/a/a/j2/q0;

    return-object v0
.end method

.method public K()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/q0;->q:I

    return v0
.end method

.method public L()J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/q0;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v1, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    .line 3
    iget-object v0, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v2, v1, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    iget-object v3, p0, Lc/a/a/a/q0;->i:Lc/a/a/a/x1$b;

    invoke-virtual {v0, v2, v3}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    .line 4
    iget-object v0, p0, Lc/a/a/a/q0;->i:Lc/a/a/a/x1$b;

    iget v2, v1, Lc/a/a/a/j2/b0;->b:I

    iget v1, v1, Lc/a/a/a/j2/b0;->c:I

    invoke-virtual {v0, v2, v1}, Lc/a/a/a/x1$b;->b(II)J

    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Lc/a/a/a/i0;->d(J)J

    move-result-wide v0

    return-wide v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lc/a/a/a/g0;->Z()J

    move-result-wide v0

    return-wide v0
.end method

.method public L0()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Release "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "ExoPlayerLib/2.13.3"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lc/a/a/a/m2/m0;->e:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-static {}, Lc/a/a/a/s0;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExoPlayerImpl"

    .line 4
    invoke-static {v1, v0}, Lc/a/a/a/m2/t;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lc/a/a/a/q0;->g:Lc/a/a/a/r0;

    invoke-virtual {v0}, Lc/a/a/a/r0;->f0()Z

    move-result v0

    if-nez v0, :cond_0

    .line 6
    iget-object v0, p0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    const/16 v1, 0xb

    sget-object v2, Lc/a/a/a/q;->a:Lc/a/a/a/q;

    invoke-virtual {v0, v1, v2}, Lc/a/a/a/m2/s;->k(ILc/a/a/a/m2/s$a;)V

    .line 7
    :cond_0
    iget-object v0, p0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    invoke-virtual {v0}, Lc/a/a/a/m2/s;->i()V

    .line 8
    iget-object v0, p0, Lc/a/a/a/q0;->e:Lc/a/a/a/m2/q;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lc/a/a/a/m2/q;->h(Ljava/lang/Object;)V

    .line 9
    iget-object v0, p0, Lc/a/a/a/q0;->m:Lc/a/a/a/a2/c1;

    if-eqz v0, :cond_1

    .line 10
    iget-object v1, p0, Lc/a/a/a/q0;->o:Lcom/google/android/exoplayer2/upstream/g;

    invoke-interface {v1, v0}, Lcom/google/android/exoplayer2/upstream/g;->b(Lcom/google/android/exoplayer2/upstream/g$a;)V

    .line 11
    :cond_1
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lc/a/a/a/h1;->h(I)Lc/a/a/a/h1;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    .line 12
    iget-object v1, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    invoke-virtual {v0, v1}, Lc/a/a/a/h1;->b(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/h1;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    .line 13
    iget-wide v1, v0, Lc/a/a/a/h1;->s:J

    iput-wide v1, v0, Lc/a/a/a/h1;->q:J

    .line 14
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lc/a/a/a/h1;->r:J

    return-void
.end method

.method public M()Lc/a/a/a/x1;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v0, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    return-object v0
.end method

.method public N()Landroid/os/Looper;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->n:Landroid/os/Looper;

    return-object v0
.end method

.method public O()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/q0;->r:Z

    return v0
.end method

.method public O0(Lc/a/a/a/j2/d0;Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lc/a/a/a/q0;->P0(Ljava/util/List;Z)V

    return-void
.end method

.method public P(Lc/a/a/a/l1$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    invoke-virtual {v0, p1}, Lc/a/a/a/m2/s;->j(Ljava/lang/Object;)V

    return-void
.end method

.method public P0(Ljava/util/List;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/a/a/a/j2/d0;",
            ">;Z)V"
        }
    .end annotation

    const/4 v2, -0x1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v5, p2

    .line 1
    invoke-direct/range {v0 .. v5}, Lc/a/a/a/q0;->Q0(Ljava/util/List;IJZ)V

    return-void
.end method

.method public Q()J
    .locals 6

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v0, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    invoke-virtual {v0}, Lc/a/a/a/x1;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-wide v0, p0, Lc/a/a/a/q0;->C:J

    return-wide v0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v1, v0, Lc/a/a/a/h1;->k:Lc/a/a/a/j2/d0$a;

    iget-wide v1, v1, Lc/a/a/a/j2/b0;->d:J

    iget-object v3, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-wide v3, v3, Lc/a/a/a/j2/b0;->d:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    .line 4
    iget-object v0, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    invoke-virtual {p0}, Lc/a/a/a/q0;->R()I

    move-result v1

    iget-object v2, p0, Lc/a/a/a/g0;->a:Lc/a/a/a/x1$c;

    invoke-virtual {v0, v1, v2}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    move-result-object v0

    invoke-virtual {v0}, Lc/a/a/a/x1$c;->d()J

    move-result-wide v0

    return-wide v0

    .line 5
    :cond_1
    iget-wide v0, v0, Lc/a/a/a/h1;->q:J

    .line 6
    iget-object v2, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v2, v2, Lc/a/a/a/h1;->k:Lc/a/a/a/j2/d0$a;

    invoke-virtual {v2}, Lc/a/a/a/j2/b0;->b()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 7
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v1, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v0, v0, Lc/a/a/a/h1;->k:Lc/a/a/a/j2/d0$a;

    iget-object v0, v0, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    iget-object v2, p0, Lc/a/a/a/q0;->i:Lc/a/a/a/x1$b;

    .line 8
    invoke-virtual {v1, v0, v2}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object v0

    .line 9
    iget-object v1, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v1, v1, Lc/a/a/a/h1;->k:Lc/a/a/a/j2/d0$a;

    iget v1, v1, Lc/a/a/a/j2/b0;->b:I

    .line 10
    invoke-virtual {v0, v1}, Lc/a/a/a/x1$b;->f(I)J

    move-result-wide v1

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long v5, v1, v3

    if-nez v5, :cond_2

    .line 11
    iget-wide v0, v0, Lc/a/a/a/x1$b;->d:J

    goto :goto_0

    :cond_2
    move-wide v0, v1

    .line 12
    :cond_3
    :goto_0
    iget-object v2, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v2, v2, Lc/a/a/a/h1;->k:Lc/a/a/a/j2/d0$a;

    invoke-direct {p0, v2, v0, v1}, Lc/a/a/a/q0;->K0(Lc/a/a/a/j2/d0$a;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public R()I
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/q0;->h0()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return v0
.end method

.method public R0(ZII)V
    .locals 9

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-boolean v1, v0, Lc/a/a/a/h1;->l:Z

    if-ne v1, p1, :cond_0

    iget v1, v0, Lc/a/a/a/h1;->m:I

    if-ne v1, p2, :cond_0

    return-void

    .line 2
    :cond_0
    iget v1, p0, Lc/a/a/a/q0;->s:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lc/a/a/a/q0;->s:I

    .line 3
    invoke-virtual {v0, p1, p2}, Lc/a/a/a/h1;->e(ZI)Lc/a/a/a/h1;

    move-result-object v3

    .line 4
    iget-object v0, p0, Lc/a/a/a/q0;->g:Lc/a/a/a/r0;

    invoke-virtual {v0, p1, p2}, Lc/a/a/a/r0;->K0(ZI)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    move v7, p3

    .line 5
    invoke-direct/range {v2 .. v8}, Lc/a/a/a/q0;->T0(Lc/a/a/a/h1;ZIIIZ)V

    return-void
.end method

.method public S0(ZLc/a/a/a/p0;)V
    .locals 8

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->j:Ljava/util/List;

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 3
    invoke-direct {p0, p1, v0}, Lc/a/a/a/q0;->M0(II)Lc/a/a/a/h1;

    move-result-object p1

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Lc/a/a/a/h1;->f(Lc/a/a/a/p0;)Lc/a/a/a/h1;

    move-result-object p1

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v0, p1, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    invoke-virtual {p1, v0}, Lc/a/a/a/h1;->b(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/h1;

    move-result-object p1

    .line 6
    iget-wide v0, p1, Lc/a/a/a/h1;->s:J

    iput-wide v0, p1, Lc/a/a/a/h1;->q:J

    const-wide/16 v0, 0x0

    .line 7
    iput-wide v0, p1, Lc/a/a/a/h1;->r:J

    :goto_0
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p1, v0}, Lc/a/a/a/h1;->h(I)Lc/a/a/a/h1;

    move-result-object p1

    if-eqz p2, :cond_1

    .line 9
    invoke-virtual {p1, p2}, Lc/a/a/a/h1;->f(Lc/a/a/a/p0;)Lc/a/a/a/h1;

    move-result-object p1

    :cond_1
    move-object v2, p1

    .line 10
    iget p1, p0, Lc/a/a/a/q0;->s:I

    add-int/2addr p1, v0

    iput p1, p0, Lc/a/a/a/q0;->s:I

    .line 11
    iget-object p1, p0, Lc/a/a/a/q0;->g:Lc/a/a/a/r0;

    invoke-virtual {p1}, Lc/a/a/a/r0;->b1()V

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v1, p0

    .line 12
    invoke-direct/range {v1 .. v7}, Lc/a/a/a/q0;->T0(Lc/a/a/a/h1;ZIIIZ)V

    return-void
.end method

.method public T()Lc/a/a/a/l2/l;
    .locals 2

    .line 1
    new-instance v0, Lc/a/a/a/l2/l;

    iget-object v1, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v1, v1, Lc/a/a/a/h1;->i:Lc/a/a/a/l2/o;

    iget-object v1, v1, Lc/a/a/a/l2/o;->c:[Lc/a/a/a/l2/h;

    invoke-direct {v0, v1}, Lc/a/a/a/l2/l;-><init>([Lc/a/a/a/l2/k;)V

    return-object v0
.end method

.method public U(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->c:[Lc/a/a/a/p1;

    aget-object p1, v0, p1

    invoke-interface {p1}, Lc/a/a/a/p1;->g()I

    move-result p1

    return p1
.end method

.method public W()J
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v0, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    invoke-virtual {v0}, Lc/a/a/a/x1;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-wide v0, p0, Lc/a/a/a/q0;->C:J

    return-wide v0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v0, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    invoke-virtual {v0}, Lc/a/a/a/j2/b0;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-wide v0, v0, Lc/a/a/a/h1;->s:J

    invoke-static {v0, v1}, Lc/a/a/a/i0;->d(J)J

    move-result-wide v0

    return-wide v0

    .line 5
    :cond_1
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v1, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-wide v2, v0, Lc/a/a/a/h1;->s:J

    invoke-direct {p0, v1, v2, v3}, Lc/a/a/a/q0;->K0(Lc/a/a/a/j2/d0$a;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public Y()Lc/a/a/a/l1$c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public c()Lc/a/a/a/i1;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v0, v0, Lc/a/a/a/h1;->n:Lc/a/a/a/i1;

    return-object v0
.end method

.method public d()V
    .locals 10

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget v1, v0, Lc/a/a/a/h1;->e:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Lc/a/a/a/h1;->f(Lc/a/a/a/p0;)Lc/a/a/a/h1;

    move-result-object v0

    .line 3
    iget-object v1, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    invoke-virtual {v1}, Lc/a/a/a/x1;->q()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    .line 4
    :goto_0
    invoke-virtual {v0, v1}, Lc/a/a/a/h1;->h(I)Lc/a/a/a/h1;

    move-result-object v4

    .line 5
    iget v0, p0, Lc/a/a/a/q0;->s:I

    add-int/2addr v0, v2

    iput v0, p0, Lc/a/a/a/q0;->s:I

    .line 6
    iget-object v0, p0, Lc/a/a/a/q0;->g:Lc/a/a/a/r0;

    invoke-virtual {v0}, Lc/a/a/a/r0;->d0()V

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x0

    move-object v3, p0

    .line 7
    invoke-direct/range {v3 .. v9}, Lc/a/a/a/q0;->T0(Lc/a/a/a/h1;ZIIIZ)V

    return-void
.end method

.method public e()Lc/a/a/a/p0;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v0, v0, Lc/a/a/a/h1;->f:Lc/a/a/a/p0;

    return-object v0
.end method

.method public e0(Lc/a/a/a/m1$b;)Lc/a/a/a/m1;
    .locals 8

    .line 1
    new-instance v7, Lc/a/a/a/m1;

    iget-object v1, p0, Lc/a/a/a/q0;->g:Lc/a/a/a/r0;

    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v3, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/q0;->R()I

    move-result v4

    iget-object v5, p0, Lc/a/a/a/q0;->p:Lc/a/a/a/m2/g;

    iget-object v0, p0, Lc/a/a/a/q0;->g:Lc/a/a/a/r0;

    .line 3
    invoke-virtual {v0}, Lc/a/a/a/r0;->x()Landroid/os/Looper;

    move-result-object v6

    move-object v0, v7

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lc/a/a/a/m1;-><init>(Lc/a/a/a/m1$a;Lc/a/a/a/m1$b;Lc/a/a/a/x1;ILc/a/a/a/m2/g;Landroid/os/Looper;)V

    return-object v7
.end method

.method public f(Z)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-virtual {p0, p1, v0, v1}, Lc/a/a/a/q0;->R0(ZII)V

    return-void
.end method

.method public g()Lc/a/a/a/l1$d;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public g0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-boolean v0, v0, Lc/a/a/a/h1;->p:Z

    return v0
.end method

.method public h()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v0, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    invoke-virtual {v0}, Lc/a/a/a/j2/b0;->b()Z

    move-result v0

    return v0
.end method

.method public i()J
    .locals 6

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/q0;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v1, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v0, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-object v0, v0, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    iget-object v2, p0, Lc/a/a/a/q0;->i:Lc/a/a/a/x1$b;

    invoke-virtual {v1, v0, v2}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    .line 3
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-wide v1, v0, Lc/a/a/a/h1;->d:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    .line 4
    iget-object v0, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    invoke-virtual {p0}, Lc/a/a/a/q0;->R()I

    move-result v1

    iget-object v2, p0, Lc/a/a/a/g0;->a:Lc/a/a/a/x1$c;

    invoke-virtual {v0, v1, v2}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    move-result-object v0

    invoke-virtual {v0}, Lc/a/a/a/x1$c;->b()J

    move-result-wide v0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lc/a/a/a/q0;->i:Lc/a/a/a/x1$b;

    invoke-virtual {v0}, Lc/a/a/a/x1$b;->k()J

    move-result-wide v0

    iget-object v2, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-wide v2, v2, Lc/a/a/a/h1;->d:J

    invoke-static {v2, v3}, Lc/a/a/a/i0;->d(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    :goto_0
    return-wide v0

    .line 6
    :cond_1
    invoke-virtual {p0}, Lc/a/a/a/q0;->W()J

    move-result-wide v0

    return-wide v0
.end method

.method public j()J
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-wide v0, v0, Lc/a/a/a/h1;->r:J

    invoke-static {v0, v1}, Lc/a/a/a/i0;->d(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public k(IJ)V
    .locals 10

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v0, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    if-ltz p1, :cond_3

    .line 2
    invoke-virtual {v0}, Lc/a/a/a/x1;->q()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lc/a/a/a/x1;->p()I

    move-result v1

    if-ge p1, v1, :cond_3

    .line 3
    :cond_0
    iget v1, p0, Lc/a/a/a/q0;->s:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Lc/a/a/a/q0;->s:I

    .line 4
    invoke-virtual {p0}, Lc/a/a/a/q0;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string p1, "ExoPlayerImpl"

    const-string p2, "seekTo ignored because an ad is playing"

    .line 5
    invoke-static {p1, p2}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    new-instance p1, Lc/a/a/a/r0$e;

    iget-object p2, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    invoke-direct {p1, p2}, Lc/a/a/a/r0$e;-><init>(Lc/a/a/a/h1;)V

    .line 7
    invoke-virtual {p1, v2}, Lc/a/a/a/r0$e;->b(I)V

    .line 8
    iget-object p2, p0, Lc/a/a/a/q0;->f:Lc/a/a/a/r0$f;

    invoke-interface {p2, p1}, Lc/a/a/a/r0$f;->a(Lc/a/a/a/r0$e;)V

    return-void

    .line 9
    :cond_1
    invoke-virtual {p0}, Lc/a/a/a/q0;->q()I

    move-result v1

    if-ne v1, v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x2

    .line 10
    :goto_0
    iget-object v1, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    invoke-virtual {v1, v2}, Lc/a/a/a/h1;->h(I)Lc/a/a/a/h1;

    move-result-object v1

    .line 11
    invoke-direct {p0, v0, p1, p2, p3}, Lc/a/a/a/q0;->j0(Lc/a/a/a/x1;IJ)Landroid/util/Pair;

    move-result-object v2

    .line 12
    invoke-direct {p0, v1, v0, v2}, Lc/a/a/a/q0;->J0(Lc/a/a/a/h1;Lc/a/a/a/x1;Landroid/util/Pair;)Lc/a/a/a/h1;

    move-result-object v4

    .line 13
    iget-object v1, p0, Lc/a/a/a/q0;->g:Lc/a/a/a/r0;

    invoke-static {p2, p3}, Lc/a/a/a/i0;->c(J)J

    move-result-wide p2

    invoke-virtual {v1, v0, p1, p2, p3}, Lc/a/a/a/r0;->v0(Lc/a/a/a/x1;IJ)V

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x1

    move-object v3, p0

    .line 14
    invoke-direct/range {v3 .. v9}, Lc/a/a/a/q0;->T0(Lc/a/a/a/h1;ZIIIZ)V

    return-void

    .line 15
    :cond_3
    new-instance v1, Lc/a/a/a/w0;

    invoke-direct {v1, v0, p1, p2, p3}, Lc/a/a/a/w0;-><init>(Lc/a/a/a/x1;IJ)V

    throw v1
.end method

.method public n()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-boolean v0, v0, Lc/a/a/a/h1;->l:Z

    return v0
.end method

.method public synthetic o0(Lc/a/a/a/r0$e;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/a/a/a/q0;->n0(Lc/a/a/a/r0$e;)V

    return-void
.end method

.method public p(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/q0;->r:Z

    if-eq v0, p1, :cond_0

    .line 2
    iput-boolean p1, p0, Lc/a/a/a/q0;->r:Z

    .line 3
    iget-object v0, p0, Lc/a/a/a/q0;->g:Lc/a/a/a/r0;

    invoke-virtual {v0, p1}, Lc/a/a/a/r0;->Q0(Z)V

    .line 4
    iget-object v0, p0, Lc/a/a/a/q0;->h:Lc/a/a/a/m2/s;

    const/16 v1, 0xa

    new-instance v2, Lc/a/a/a/h;

    invoke-direct {v2, p1}, Lc/a/a/a/h;-><init>(Z)V

    invoke-virtual {v0, v1, v2}, Lc/a/a/a/m2/s;->k(ILc/a/a/a/m2/s$a;)V

    :cond_0
    return-void
.end method

.method public q()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget v0, v0, Lc/a/a/a/h1;->e:I

    return v0
.end method

.method public synthetic q0(Lc/a/a/a/r0$e;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/a/a/a/q0;->p0(Lc/a/a/a/r0$e;)V

    return-void
.end method

.method public r()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lc/a/a/a/h2/a;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v0, v0, Lc/a/a/a/h1;->j:Ljava/util/List;

    return-object v0
.end method

.method public u()I
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v0, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    invoke-virtual {v0}, Lc/a/a/a/x1;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget v0, p0, Lc/a/a/a/q0;->B:I

    return v0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v1, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v0, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-object v0, v0, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Lc/a/a/a/x1;->b(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public z()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/q0;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/a/a/a/q0;->z:Lc/a/a/a/h1;

    iget-object v0, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget v0, v0, Lc/a/a/a/j2/b0;->b:I

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method
