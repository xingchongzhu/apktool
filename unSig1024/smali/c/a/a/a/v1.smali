.class public Lc/a/a/a/v1;
.super Lc/a/a/a/g0;
.source "SimpleExoPlayer.java"

# interfaces
.implements Lc/a/a/a/l1;
.implements Lc/a/a/a/l1$d;
.implements Lc/a/a/a/l1$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/v1$c;,
        Lc/a/a/a/v1$b;
    }
.end annotation


# instance fields
.field private A:I

.field private B:Lc/a/a/a/c2/d;

.field private C:Lc/a/a/a/c2/d;

.field private D:I

.field private E:Lc/a/a/a/b2/n;

.field private F:F

.field private G:Z

.field private H:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/a/k2/c;",
            ">;"
        }
    .end annotation
.end field

.field private I:Lc/a/a/a/n2/v;

.field private J:Lc/a/a/a/n2/a0/a;

.field private K:Z

.field private L:Z

.field private M:Lc/a/a/a/m2/c0;

.field private N:Z

.field private O:Z

.field private P:Lc/a/a/a/d2/a;

.field protected final b:[Lc/a/a/a/p1;

.field private final c:Landroid/content/Context;

.field private final d:Lc/a/a/a/q0;

.field private final e:Lc/a/a/a/v1$c;

.field private final f:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lc/a/a/a/n2/y;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lc/a/a/a/b2/p;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lc/a/a/a/k2/l;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lc/a/a/a/h2/f;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lc/a/a/a/d2/b;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Lc/a/a/a/a2/c1;

.field private final l:Lc/a/a/a/e0;

.field private final m:Lc/a/a/a/f0;

.field private final n:Lc/a/a/a/w1;

.field private final o:Lc/a/a/a/y1;

.field private final p:Lc/a/a/a/z1;

.field private final q:J

.field private r:Lc/a/a/a/u0;

.field private s:Lc/a/a/a/u0;

.field private t:Landroid/media/AudioTrack;

.field private u:Landroid/view/Surface;

.field private v:Z

.field private w:I

.field private x:Landroid/view/SurfaceHolder;

.field private y:Landroid/view/TextureView;

.field private z:I


# direct methods
.method protected constructor <init>(Lc/a/a/a/v1$b;)V
    .locals 25

    move-object/from16 v15, p0

    .line 1
    invoke-direct/range {p0 .. p0}, Lc/a/a/a/g0;-><init>()V

    .line 2
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->a(Lc/a/a/a/v1$b;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, v15, Lc/a/a/a/v1;->c:Landroid/content/Context;

    .line 3
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->b(Lc/a/a/a/v1$b;)Lc/a/a/a/a2/c1;

    move-result-object v6

    iput-object v6, v15, Lc/a/a/a/v1;->k:Lc/a/a/a/a2/c1;

    .line 4
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->m(Lc/a/a/a/v1$b;)Lc/a/a/a/m2/c0;

    move-result-object v1

    iput-object v1, v15, Lc/a/a/a/v1;->M:Lc/a/a/a/m2/c0;

    .line 5
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->q(Lc/a/a/a/v1$b;)Lc/a/a/a/b2/n;

    move-result-object v1

    iput-object v1, v15, Lc/a/a/a/v1;->E:Lc/a/a/a/b2/n;

    .line 6
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->r(Lc/a/a/a/v1$b;)I

    move-result v1

    iput v1, v15, Lc/a/a/a/v1;->w:I

    .line 7
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->s(Lc/a/a/a/v1$b;)Z

    move-result v1

    iput-boolean v1, v15, Lc/a/a/a/v1;->G:Z

    .line 8
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->t(Lc/a/a/a/v1$b;)J

    move-result-wide v1

    iput-wide v1, v15, Lc/a/a/a/v1;->q:J

    .line 9
    new-instance v14, Lc/a/a/a/v1$c;

    const/4 v13, 0x0

    invoke-direct {v14, v15, v13}, Lc/a/a/a/v1$c;-><init>(Lc/a/a/a/v1;Lc/a/a/a/v1$a;)V

    iput-object v14, v15, Lc/a/a/a/v1;->e:Lc/a/a/a/v1$c;

    .line 10
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v1, v15, Lc/a/a/a/v1;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 11
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v1, v15, Lc/a/a/a/v1;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 12
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v1, v15, Lc/a/a/a/v1;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 13
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v1, v15, Lc/a/a/a/v1;->i:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 14
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v1, v15, Lc/a/a/a/v1;->j:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 15
    new-instance v5, Landroid/os/Handler;

    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->u(Lc/a/a/a/v1$b;)Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v5, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 16
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->v(Lc/a/a/a/v1$b;)Lc/a/a/a/t1;

    move-result-object v7

    move-object v8, v5

    move-object v9, v14

    move-object v10, v14

    move-object v11, v14

    move-object v12, v14

    invoke-interface/range {v7 .. v12}, Lc/a/a/a/t1;->a(Landroid/os/Handler;Lc/a/a/a/n2/z;Lc/a/a/a/b2/r;Lc/a/a/a/k2/l;Lc/a/a/a/h2/f;)[Lc/a/a/a/p1;

    move-result-object v1

    iput-object v1, v15, Lc/a/a/a/v1;->b:[Lc/a/a/a/p1;

    const/high16 v2, 0x3f800000    # 1.0f

    .line 17
    iput v2, v15, Lc/a/a/a/v1;->F:F

    .line 18
    sget v2, Lc/a/a/a/m2/m0;->a:I

    const/4 v12, 0x0

    const/16 v3, 0x15

    if-ge v2, v3, :cond_0

    .line 19
    invoke-direct {v15, v12}, Lc/a/a/a/v1;->I0(I)I

    move-result v0

    iput v0, v15, Lc/a/a/a/v1;->D:I

    goto :goto_0

    .line 20
    :cond_0
    invoke-static {v0}, Lc/a/a/a/i0;->a(Landroid/content/Context;)I

    move-result v0

    iput v0, v15, Lc/a/a/a/v1;->D:I

    .line 21
    :goto_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, v15, Lc/a/a/a/v1;->H:Ljava/util/List;

    const/4 v10, 0x1

    .line 22
    iput-boolean v10, v15, Lc/a/a/a/v1;->K:Z

    .line 23
    new-instance v11, Lc/a/a/a/q0;

    .line 24
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->c(Lc/a/a/a/v1$b;)Lc/a/a/a/l2/n;

    move-result-object v2

    .line 25
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->d(Lc/a/a/a/v1$b;)Lc/a/a/a/j2/f0;

    move-result-object v3

    .line 26
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->e(Lc/a/a/a/v1$b;)Lc/a/a/a/y0;

    move-result-object v4

    .line 27
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->f(Lc/a/a/a/v1$b;)Lcom/google/android/exoplayer2/upstream/g;

    move-result-object v7

    .line 28
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->g(Lc/a/a/a/v1$b;)Z

    move-result v8

    .line 29
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->h(Lc/a/a/a/v1$b;)Lc/a/a/a/u1;

    move-result-object v9

    .line 30
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->i(Lc/a/a/a/v1$b;)Lc/a/a/a/x0;

    move-result-object v16

    .line 31
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->j(Lc/a/a/a/v1$b;)J

    move-result-wide v17

    .line 32
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->k(Lc/a/a/a/v1$b;)Z

    move-result v19

    .line 33
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->l(Lc/a/a/a/v1$b;)Lc/a/a/a/m2/g;

    move-result-object v20

    .line 34
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->u(Lc/a/a/a/v1$b;)Landroid/os/Looper;

    move-result-object v21

    move-object v0, v11

    move-object/from16 v22, v5

    move-object v5, v7

    move v7, v8

    move-object v8, v9

    move-object/from16 v9, v16

    move-object/from16 v23, v11

    move-wide/from16 v10, v17

    const/16 v16, 0x0

    move/from16 v12, v19

    move-object/from16 v17, v13

    move-object/from16 v13, v20

    move-object/from16 v24, v14

    move-object/from16 v14, v21

    move-object/from16 v15, p0

    invoke-direct/range {v0 .. v15}, Lc/a/a/a/q0;-><init>([Lc/a/a/a/p1;Lc/a/a/a/l2/n;Lc/a/a/a/j2/f0;Lc/a/a/a/y0;Lcom/google/android/exoplayer2/upstream/g;Lc/a/a/a/a2/c1;ZLc/a/a/a/u1;Lc/a/a/a/x0;JZLc/a/a/a/m2/g;Landroid/os/Looper;Lc/a/a/a/l1;)V

    move-object/from16 v0, p0

    move-object/from16 v1, v23

    iput-object v1, v0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    move-object/from16 v2, v24

    .line 35
    invoke-virtual {v1, v2}, Lc/a/a/a/q0;->C(Lc/a/a/a/l1$a;)V

    .line 36
    new-instance v1, Lc/a/a/a/e0;

    .line 37
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->a(Lc/a/a/a/v1$b;)Landroid/content/Context;

    move-result-object v3

    move-object/from16 v4, v22

    invoke-direct {v1, v3, v4, v2}, Lc/a/a/a/e0;-><init>(Landroid/content/Context;Landroid/os/Handler;Lc/a/a/a/e0$b;)V

    iput-object v1, v0, Lc/a/a/a/v1;->l:Lc/a/a/a/e0;

    .line 38
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->n(Lc/a/a/a/v1$b;)Z

    move-result v3

    invoke-virtual {v1, v3}, Lc/a/a/a/e0;->b(Z)V

    .line 39
    new-instance v1, Lc/a/a/a/f0;

    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->a(Lc/a/a/a/v1$b;)Landroid/content/Context;

    move-result-object v3

    invoke-direct {v1, v3, v4, v2}, Lc/a/a/a/f0;-><init>(Landroid/content/Context;Landroid/os/Handler;Lc/a/a/a/f0$b;)V

    iput-object v1, v0, Lc/a/a/a/v1;->m:Lc/a/a/a/f0;

    .line 40
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->o(Lc/a/a/a/v1$b;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v13, v0, Lc/a/a/a/v1;->E:Lc/a/a/a/b2/n;

    goto :goto_1

    :cond_1
    move-object/from16 v13, v17

    :goto_1
    invoke-virtual {v1, v13}, Lc/a/a/a/f0;->m(Lc/a/a/a/b2/n;)V

    .line 41
    new-instance v1, Lc/a/a/a/w1;

    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->a(Lc/a/a/a/v1$b;)Landroid/content/Context;

    move-result-object v3

    invoke-direct {v1, v3, v4, v2}, Lc/a/a/a/w1;-><init>(Landroid/content/Context;Landroid/os/Handler;Lc/a/a/a/w1$b;)V

    iput-object v1, v0, Lc/a/a/a/v1;->n:Lc/a/a/a/w1;

    .line 42
    iget-object v2, v0, Lc/a/a/a/v1;->E:Lc/a/a/a/b2/n;

    iget v2, v2, Lc/a/a/a/b2/n;->d:I

    invoke-static {v2}, Lc/a/a/a/m2/m0;->Z(I)I

    move-result v2

    invoke-virtual {v1, v2}, Lc/a/a/a/w1;->h(I)V

    .line 43
    new-instance v2, Lc/a/a/a/y1;

    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->a(Lc/a/a/a/v1$b;)Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Lc/a/a/a/y1;-><init>(Landroid/content/Context;)V

    iput-object v2, v0, Lc/a/a/a/v1;->o:Lc/a/a/a/y1;

    .line 44
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->p(Lc/a/a/a/v1$b;)I

    move-result v3

    if-eqz v3, :cond_2

    const/4 v12, 0x1

    goto :goto_2

    :cond_2
    const/4 v12, 0x0

    :goto_2
    invoke-virtual {v2, v12}, Lc/a/a/a/y1;->a(Z)V

    .line 45
    new-instance v2, Lc/a/a/a/z1;

    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->a(Lc/a/a/a/v1$b;)Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Lc/a/a/a/z1;-><init>(Landroid/content/Context;)V

    iput-object v2, v0, Lc/a/a/a/v1;->p:Lc/a/a/a/z1;

    .line 46
    invoke-static/range {p1 .. p1}, Lc/a/a/a/v1$b;->p(Lc/a/a/a/v1$b;)I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_3

    const/4 v12, 0x1

    goto :goto_3

    :cond_3
    const/4 v12, 0x0

    :goto_3
    invoke-virtual {v2, v12}, Lc/a/a/a/z1;->a(Z)V

    .line 47
    invoke-static {v1}, Lc/a/a/a/v1;->F0(Lc/a/a/a/w1;)Lc/a/a/a/d2/a;

    move-result-object v1

    iput-object v1, v0, Lc/a/a/a/v1;->P:Lc/a/a/a/d2/a;

    .line 48
    iget v1, v0, Lc/a/a/a/v1;->D:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x66

    const/4 v3, 0x1

    invoke-direct {v0, v3, v2, v1}, Lc/a/a/a/v1;->N0(IILjava/lang/Object;)V

    .line 49
    iget v1, v0, Lc/a/a/a/v1;->D:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v4, v2, v1}, Lc/a/a/a/v1;->N0(IILjava/lang/Object;)V

    const/4 v1, 0x3

    .line 50
    iget-object v2, v0, Lc/a/a/a/v1;->E:Lc/a/a/a/b2/n;

    invoke-direct {v0, v3, v1, v2}, Lc/a/a/a/v1;->N0(IILjava/lang/Object;)V

    const/4 v1, 0x4

    .line 51
    iget v2, v0, Lc/a/a/a/v1;->w:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v4, v1, v2}, Lc/a/a/a/v1;->N0(IILjava/lang/Object;)V

    const/16 v1, 0x65

    .line 52
    iget-boolean v2, v0, Lc/a/a/a/v1;->G:Z

    .line 53
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .line 54
    invoke-direct {v0, v3, v1, v2}, Lc/a/a/a/v1;->N0(IILjava/lang/Object;)V

    return-void
.end method

.method static synthetic A0(Lc/a/a/a/v1;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lc/a/a/a/v1;->N:Z

    return p0
.end method

.method static synthetic B0(Lc/a/a/a/v1;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lc/a/a/a/v1;->N:Z

    return p1
.end method

.method static synthetic C0(Lc/a/a/a/v1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->U0()V

    return-void
.end method

.method private static F0(Lc/a/a/a/w1;)Lc/a/a/a/d2/a;
    .locals 3

    .line 1
    new-instance v0, Lc/a/a/a/d2/a;

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/w1;->d()I

    move-result v1

    .line 3
    invoke-virtual {p0}, Lc/a/a/a/w1;->c()I

    move-result p0

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, p0}, Lc/a/a/a/d2/a;-><init>(III)V

    return-object v0
.end method

.method private static H0(ZI)I
    .locals 1

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    :cond_0
    return v0
.end method

.method private I0(I)I
    .locals 9

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1;->t:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v0

    if-eq v0, p1, :cond_0

    .line 3
    iget-object v0, p0, Lc/a/a/a/v1;->t:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lc/a/a/a/v1;->t:Landroid/media/AudioTrack;

    .line 5
    :cond_0
    iget-object v0, p0, Lc/a/a/a/v1;->t:Landroid/media/AudioTrack;

    if-nez v0, :cond_1

    const/16 v3, 0xfa0

    const/4 v4, 0x4

    const/4 v5, 0x2

    const/4 v6, 0x2

    .line 6
    new-instance v0, Landroid/media/AudioTrack;

    const/4 v2, 0x3

    const/4 v7, 0x0

    move-object v1, v0

    move v8, p1

    invoke-direct/range {v1 .. v8}, Landroid/media/AudioTrack;-><init>(IIIIIII)V

    iput-object v0, p0, Lc/a/a/a/v1;->t:Landroid/media/AudioTrack;

    .line 7
    :cond_1
    iget-object p1, p0, Lc/a/a/a/v1;->t:Landroid/media/AudioTrack;

    invoke-virtual {p1}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result p1

    return p1
.end method

.method private J0(II)V
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/v1;->z:I

    if-ne p1, v0, :cond_0

    iget v0, p0, Lc/a/a/a/v1;->A:I

    if-eq p2, v0, :cond_1

    .line 2
    :cond_0
    iput p1, p0, Lc/a/a/a/v1;->z:I

    .line 3
    iput p2, p0, Lc/a/a/a/v1;->A:I

    .line 4
    iget-object v0, p0, Lc/a/a/a/v1;->k:Lc/a/a/a/a2/c1;

    invoke-virtual {v0, p1, p2}, Lc/a/a/a/a2/c1;->l1(II)V

    .line 5
    iget-object v0, p0, Lc/a/a/a/v1;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/n2/y;

    .line 6
    invoke-interface {v1, p1, p2}, Lc/a/a/a/n2/y;->h(II)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private K0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1;->k:Lc/a/a/a/a2/c1;

    iget-boolean v1, p0, Lc/a/a/a/v1;->G:Z

    invoke-virtual {v0, v1}, Lc/a/a/a/a2/c1;->a(Z)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/b2/p;

    .line 3
    iget-boolean v2, p0, Lc/a/a/a/v1;->G:Z

    invoke-interface {v1, v2}, Lc/a/a/a/b2/p;->a(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private M0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1;->y:Landroid/view/TextureView;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    move-result-object v0

    iget-object v2, p0, Lc/a/a/a/v1;->e:Lc/a/a/a/v1$c;

    if-eq v0, v2, :cond_0

    const-string v0, "SimpleExoPlayer"

    const-string v2, "SurfaceTextureListener already unset or replaced."

    .line 3
    invoke-static {v0, v2}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lc/a/a/a/v1;->y:Landroid/view/TextureView;

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 5
    :goto_0
    iput-object v1, p0, Lc/a/a/a/v1;->y:Landroid/view/TextureView;

    .line 6
    :cond_1
    iget-object v0, p0, Lc/a/a/a/v1;->x:Landroid/view/SurfaceHolder;

    if-eqz v0, :cond_2

    .line 7
    iget-object v2, p0, Lc/a/a/a/v1;->e:Lc/a/a/a/v1$c;

    invoke-interface {v0, v2}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 8
    iput-object v1, p0, Lc/a/a/a/v1;->x:Landroid/view/SurfaceHolder;

    :cond_2
    return-void
.end method

.method private N0(IILjava/lang/Object;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1;->b:[Lc/a/a/a/p1;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 2
    invoke-interface {v3}, Lc/a/a/a/p1;->g()I

    move-result v4

    if-ne v4, p1, :cond_0

    .line 3
    iget-object v4, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v4, v3}, Lc/a/a/a/q0;->e0(Lc/a/a/a/m1$b;)Lc/a/a/a/m1;

    move-result-object v3

    invoke-virtual {v3, p2}, Lc/a/a/a/m1;->n(I)Lc/a/a/a/m1;

    move-result-object v3

    invoke-virtual {v3, p3}, Lc/a/a/a/m1;->m(Ljava/lang/Object;)Lc/a/a/a/m1;

    move-result-object v3

    invoke-virtual {v3}, Lc/a/a/a/m1;->l()Lc/a/a/a/m1;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private O0()V
    .locals 3

    .line 1
    iget v0, p0, Lc/a/a/a/v1;->F:F

    iget-object v1, p0, Lc/a/a/a/v1;->m:Lc/a/a/a/f0;

    invoke-virtual {v1}, Lc/a/a/a/f0;->g()F

    move-result v1

    mul-float v0, v0, v1

    .line 2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-direct {p0, v1, v2, v0}, Lc/a/a/a/v1;->N0(IILjava/lang/Object;)V

    return-void
.end method

.method private Q0(Lc/a/a/a/n2/u;)V
    .locals 2

    const/4 v0, 0x2

    const/16 v1, 0x8

    .line 1
    invoke-direct {p0, v0, v1, p1}, Lc/a/a/a/v1;->N0(IILjava/lang/Object;)V

    return-void
.end method

.method private S0(Landroid/view/Surface;Z)V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    iget-object v1, p0, Lc/a/a/a/v1;->b:[Lc/a/a/a/p1;

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v5, v1, v4

    .line 3
    invoke-interface {v5}, Lc/a/a/a/p1;->g()I

    move-result v6

    const/4 v7, 0x2

    if-ne v6, v7, :cond_0

    .line 4
    iget-object v6, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    .line 5
    invoke-virtual {v6, v5}, Lc/a/a/a/q0;->e0(Lc/a/a/a/m1$b;)Lc/a/a/a/m1;

    move-result-object v5

    const/4 v6, 0x1

    .line 6
    invoke-virtual {v5, v6}, Lc/a/a/a/m1;->n(I)Lc/a/a/a/m1;

    move-result-object v5

    .line 7
    invoke-virtual {v5, p1}, Lc/a/a/a/m1;->m(Ljava/lang/Object;)Lc/a/a/a/m1;

    move-result-object v5

    .line 8
    invoke-virtual {v5}, Lc/a/a/a/m1;->l()Lc/a/a/a/m1;

    move-result-object v5

    .line 9
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 10
    :cond_1
    iget-object v1, p0, Lc/a/a/a/v1;->u:Landroid/view/Surface;

    if-eqz v1, :cond_3

    if-eq v1, p1, :cond_3

    .line 11
    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/m1;

    .line 12
    iget-wide v4, p0, Lc/a/a/a/v1;->q:J

    invoke-virtual {v1, v4, v5}, Lc/a/a/a/m1;->a(J)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 13
    :catch_0
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    new-instance v1, Lc/a/a/a/t0;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lc/a/a/a/t0;-><init>(I)V

    .line 14
    invoke-static {v1}, Lc/a/a/a/p0;->b(Ljava/lang/Exception;)Lc/a/a/a/p0;

    move-result-object v1

    .line 15
    invoke-virtual {v0, v3, v1}, Lc/a/a/a/q0;->S0(ZLc/a/a/a/p0;)V

    goto :goto_2

    .line 16
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 17
    :cond_2
    :goto_2
    iget-boolean v0, p0, Lc/a/a/a/v1;->v:Z

    if-eqz v0, :cond_3

    .line 18
    iget-object v0, p0, Lc/a/a/a/v1;->u:Landroid/view/Surface;

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 19
    :cond_3
    iput-object p1, p0, Lc/a/a/a/v1;->u:Landroid/view/Surface;

    .line 20
    iput-boolean p2, p0, Lc/a/a/a/v1;->v:Z

    return-void
.end method

.method private T0(ZII)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    if-eq p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    if-eq p2, v1, :cond_1

    const/4 v0, 0x1

    .line 1
    :cond_1
    iget-object p2, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {p2, p1, v0, p3}, Lc/a/a/a/q0;->R0(ZII)V

    return-void
.end method

.method private U0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/v1;->q()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_3

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    const/4 v3, 0x3

    if-eq v0, v3, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 3
    :cond_1
    invoke-virtual {p0}, Lc/a/a/a/v1;->G0()Z

    move-result v0

    .line 4
    iget-object v3, p0, Lc/a/a/a/v1;->o:Lc/a/a/a/y1;

    invoke-virtual {p0}, Lc/a/a/a/v1;->n()Z

    move-result v4

    if-eqz v4, :cond_2

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v3, v1}, Lc/a/a/a/y1;->b(Z)V

    .line 5
    iget-object v0, p0, Lc/a/a/a/v1;->p:Lc/a/a/a/z1;

    invoke-virtual {p0}, Lc/a/a/a/v1;->n()Z

    move-result v1

    invoke-virtual {v0, v1}, Lc/a/a/a/z1;->b(Z)V

    goto :goto_2

    .line 6
    :cond_3
    :goto_1
    iget-object v0, p0, Lc/a/a/a/v1;->o:Lc/a/a/a/y1;

    invoke-virtual {v0, v2}, Lc/a/a/a/y1;->b(Z)V

    .line 7
    iget-object v0, p0, Lc/a/a/a/v1;->p:Lc/a/a/a/z1;

    invoke-virtual {v0, v2}, Lc/a/a/a/z1;->b(Z)V

    :goto_2
    return-void
.end method

.method private V0()V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {p0}, Lc/a/a/a/v1;->N()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 2
    iget-boolean v0, p0, Lc/a/a/a/v1;->K:Z

    const-string v1, "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread"

    if-nez v0, :cond_1

    .line 3
    iget-boolean v0, p0, Lc/a/a/a/v1;->L:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    :goto_0
    const-string v2, "SimpleExoPlayer"

    .line 4
    invoke-static {v2, v1, v0}, Lc/a/a/a/m2/t;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lc/a/a/a/v1;->L:Z

    goto :goto_1

    .line 6
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    return-void
.end method

.method static synthetic c0(Lc/a/a/a/v1;Lc/a/a/a/c2/d;)Lc/a/a/a/c2/d;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/v1;->B:Lc/a/a/a/c2/d;

    return-object p1
.end method

.method static synthetic d0(Lc/a/a/a/v1;)Lc/a/a/a/a2/c1;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/v1;->k:Lc/a/a/a/a2/c1;

    return-object p0
.end method

.method static synthetic e0(Lc/a/a/a/v1;Lc/a/a/a/u0;)Lc/a/a/a/u0;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/v1;->r:Lc/a/a/a/u0;

    return-object p1
.end method

.method static synthetic f0(Lc/a/a/a/v1;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/v1;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object p0
.end method

.method static synthetic g0(Lc/a/a/a/v1;)Landroid/view/Surface;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/v1;->u:Landroid/view/Surface;

    return-object p0
.end method

.method static synthetic h0(Lc/a/a/a/v1;Lc/a/a/a/c2/d;)Lc/a/a/a/c2/d;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/v1;->C:Lc/a/a/a/c2/d;

    return-object p1
.end method

.method static synthetic i0(Lc/a/a/a/v1;Lc/a/a/a/u0;)Lc/a/a/a/u0;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/v1;->s:Lc/a/a/a/u0;

    return-object p1
.end method

.method static synthetic j0(Lc/a/a/a/v1;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lc/a/a/a/v1;->G:Z

    return p0
.end method

.method static synthetic k0(Lc/a/a/a/v1;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lc/a/a/a/v1;->G:Z

    return p1
.end method

.method static synthetic l0(Lc/a/a/a/v1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->K0()V

    return-void
.end method

.method static synthetic m0(Lc/a/a/a/v1;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/v1;->H:Ljava/util/List;

    return-object p1
.end method

.method static synthetic n0(Lc/a/a/a/v1;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/v1;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object p0
.end method

.method static synthetic o0(Lc/a/a/a/v1;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/v1;->i:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object p0
.end method

.method static synthetic p0(Lc/a/a/a/v1;Landroid/view/Surface;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/v1;->S0(Landroid/view/Surface;Z)V

    return-void
.end method

.method static synthetic q0(Lc/a/a/a/v1;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/v1;->J0(II)V

    return-void
.end method

.method static synthetic r0(Lc/a/a/a/v1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->O0()V

    return-void
.end method

.method static synthetic s0(ZI)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lc/a/a/a/v1;->H0(ZI)I

    move-result p0

    return p0
.end method

.method static synthetic t0(Lc/a/a/a/v1;ZII)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lc/a/a/a/v1;->T0(ZII)V

    return-void
.end method

.method static synthetic u0(Lc/a/a/a/v1;)Lc/a/a/a/w1;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/v1;->n:Lc/a/a/a/w1;

    return-object p0
.end method

.method static synthetic v0(Lc/a/a/a/w1;)Lc/a/a/a/d2/a;
    .locals 0

    .line 1
    invoke-static {p0}, Lc/a/a/a/v1;->F0(Lc/a/a/a/w1;)Lc/a/a/a/d2/a;

    move-result-object p0

    return-object p0
.end method

.method static synthetic w0(Lc/a/a/a/v1;)Lc/a/a/a/d2/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/v1;->P:Lc/a/a/a/d2/a;

    return-object p0
.end method

.method static synthetic x0(Lc/a/a/a/v1;Lc/a/a/a/d2/a;)Lc/a/a/a/d2/a;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/v1;->P:Lc/a/a/a/d2/a;

    return-object p1
.end method

.method static synthetic y0(Lc/a/a/a/v1;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/v1;->j:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object p0
.end method

.method static synthetic z0(Lc/a/a/a/v1;)Lc/a/a/a/m2/c0;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/v1;->M:Lc/a/a/a/m2/c0;

    return-object p0
.end method


# virtual methods
.method public A(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0, p1}, Lc/a/a/a/q0;->A(I)V

    return-void
.end method

.method public C(Lc/a/a/a/l1$a;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0, p1}, Lc/a/a/a/q0;->C(Lc/a/a/a/l1$a;)V

    return-void
.end method

.method public D()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->D()I

    move-result v0

    return v0
.end method

.method public D0()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    invoke-direct {p0}, Lc/a/a/a/v1;->M0()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, v0, v1}, Lc/a/a/a/v1;->S0(Landroid/view/Surface;Z)V

    .line 4
    invoke-direct {p0, v1, v1}, Lc/a/a/a/v1;->J0(II)V

    return-void
.end method

.method public E(Landroid/view/SurfaceView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    instance-of v0, p1, Lc/a/a/a/n2/s;

    if-eqz v0, :cond_0

    .line 3
    move-object v0, p1

    check-cast v0, Lc/a/a/a/n2/s;

    .line 4
    invoke-virtual {v0}, Lc/a/a/a/n2/s;->getVideoDecoderOutputBufferRenderer()Lc/a/a/a/n2/u;

    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lc/a/a/a/v1;->D0()V

    .line 6
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/v1;->x:Landroid/view/SurfaceHolder;

    .line 7
    invoke-direct {p0, v0}, Lc/a/a/a/v1;->Q0(Lc/a/a/a/n2/u;)V

    goto :goto_1

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Lc/a/a/a/v1;->R0(Landroid/view/SurfaceHolder;)V

    :goto_1
    return-void
.end method

.method public E0(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->x:Landroid/view/SurfaceHolder;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Lc/a/a/a/v1;->R0(Landroid/view/SurfaceHolder;)V

    :cond_0
    return-void
.end method

.method public F(Landroid/view/SurfaceView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    instance-of v0, p1, Lc/a/a/a/n2/s;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    iget-object v0, p0, Lc/a/a/a/v1;->x:Landroid/view/SurfaceHolder;

    if-ne p1, v0, :cond_2

    .line 4
    invoke-direct {p0, v1}, Lc/a/a/a/v1;->Q0(Lc/a/a/a/n2/u;)V

    .line 5
    iput-object v1, p0, Lc/a/a/a/v1;->x:Landroid/view/SurfaceHolder;

    goto :goto_1

    :cond_0
    if-nez p1, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    :goto_0
    invoke-virtual {p0, v1}, Lc/a/a/a/v1;->E0(Landroid/view/SurfaceHolder;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public G(Lc/a/a/a/k2/l;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public G0()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->g0()Z

    move-result v0

    return v0
.end method

.method public H()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->H()I

    move-result v0

    return v0
.end method

.method public I()Lc/a/a/a/j2/q0;
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->I()Lc/a/a/a/j2/q0;

    move-result-object v0

    return-object v0
.end method

.method public J(Lc/a/a/a/k2/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public K()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->K()I

    move-result v0

    return v0
.end method

.method public L()J
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->L()J

    move-result-wide v0

    return-wide v0
.end method

.method public L0()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-ge v0, v2, :cond_0

    iget-object v0, p0, Lc/a/a/a/v1;->t:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    .line 4
    iput-object v1, p0, Lc/a/a/a/v1;->t:Landroid/media/AudioTrack;

    .line 5
    :cond_0
    iget-object v0, p0, Lc/a/a/a/v1;->l:Lc/a/a/a/e0;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lc/a/a/a/e0;->b(Z)V

    .line 6
    iget-object v0, p0, Lc/a/a/a/v1;->n:Lc/a/a/a/w1;

    invoke-virtual {v0}, Lc/a/a/a/w1;->g()V

    .line 7
    iget-object v0, p0, Lc/a/a/a/v1;->o:Lc/a/a/a/y1;

    invoke-virtual {v0, v2}, Lc/a/a/a/y1;->b(Z)V

    .line 8
    iget-object v0, p0, Lc/a/a/a/v1;->p:Lc/a/a/a/z1;

    invoke-virtual {v0, v2}, Lc/a/a/a/z1;->b(Z)V

    .line 9
    iget-object v0, p0, Lc/a/a/a/v1;->m:Lc/a/a/a/f0;

    invoke-virtual {v0}, Lc/a/a/a/f0;->i()V

    .line 10
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->L0()V

    .line 11
    iget-object v0, p0, Lc/a/a/a/v1;->k:Lc/a/a/a/a2/c1;

    invoke-virtual {v0}, Lc/a/a/a/a2/c1;->m1()V

    .line 12
    invoke-direct {p0}, Lc/a/a/a/v1;->M0()V

    .line 13
    iget-object v0, p0, Lc/a/a/a/v1;->u:Landroid/view/Surface;

    if-eqz v0, :cond_2

    .line 14
    iget-boolean v3, p0, Lc/a/a/a/v1;->v:Z

    if-eqz v3, :cond_1

    .line 15
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 16
    :cond_1
    iput-object v1, p0, Lc/a/a/a/v1;->u:Landroid/view/Surface;

    .line 17
    :cond_2
    iget-boolean v0, p0, Lc/a/a/a/v1;->N:Z

    if-eqz v0, :cond_3

    .line 18
    iget-object v0, p0, Lc/a/a/a/v1;->M:Lc/a/a/a/m2/c0;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/m2/c0;

    invoke-virtual {v0, v2}, Lc/a/a/a/m2/c0;->b(I)V

    .line 19
    iput-boolean v2, p0, Lc/a/a/a/v1;->N:Z

    .line 20
    :cond_3
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/v1;->H:Ljava/util/List;

    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Lc/a/a/a/v1;->O:Z

    return-void
.end method

.method public M()Lc/a/a/a/x1;
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->M()Lc/a/a/a/x1;

    move-result-object v0

    return-object v0
.end method

.method public N()Landroid/os/Looper;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->N()Landroid/os/Looper;

    move-result-object v0

    return-object v0
.end method

.method public O()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->O()Z

    move-result v0

    return v0
.end method

.method public P(Lc/a/a/a/l1$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0, p1}, Lc/a/a/a/q0;->P(Lc/a/a/a/l1$a;)V

    return-void
.end method

.method public P0(Lc/a/a/a/j2/d0;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->k:Lc/a/a/a/a2/c1;

    invoke-virtual {v0}, Lc/a/a/a/a2/c1;->n1()V

    .line 3
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0, p1, p2}, Lc/a/a/a/q0;->O0(Lc/a/a/a/j2/d0;Z)V

    return-void
.end method

.method public Q()J
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->Q()J

    move-result-wide v0

    return-wide v0
.end method

.method public R()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->R()I

    move-result v0

    return v0
.end method

.method public R0(Landroid/view/SurfaceHolder;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    invoke-direct {p0}, Lc/a/a/a/v1;->M0()V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 3
    invoke-direct {p0, v0}, Lc/a/a/a/v1;->Q0(Lc/a/a/a/n2/u;)V

    .line 4
    :cond_0
    iput-object p1, p0, Lc/a/a/a/v1;->x:Landroid/view/SurfaceHolder;

    const/4 v1, 0x0

    if-nez p1, :cond_1

    .line 5
    invoke-direct {p0, v0, v1}, Lc/a/a/a/v1;->S0(Landroid/view/Surface;Z)V

    .line 6
    invoke-direct {p0, v1, v1}, Lc/a/a/a/v1;->J0(II)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object v2, p0, Lc/a/a/a/v1;->e:Lc/a/a/a/v1$c;

    invoke-interface {p1, v2}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 8
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 9
    invoke-virtual {v2}, Landroid/view/Surface;->isValid()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 10
    invoke-direct {p0, v2, v1}, Lc/a/a/a/v1;->S0(Landroid/view/Surface;Z)V

    .line 11
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    move-result-object p1

    .line 12
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    invoke-direct {p0, v0, p1}, Lc/a/a/a/v1;->J0(II)V

    goto :goto_0

    .line 13
    :cond_2
    invoke-direct {p0, v0, v1}, Lc/a/a/a/v1;->S0(Landroid/view/Surface;Z)V

    .line 14
    invoke-direct {p0, v1, v1}, Lc/a/a/a/v1;->J0(II)V

    :goto_0
    return-void
.end method

.method public S(Landroid/view/TextureView;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    invoke-direct {p0}, Lc/a/a/a/v1;->M0()V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 3
    invoke-direct {p0, v0}, Lc/a/a/a/v1;->Q0(Lc/a/a/a/n2/u;)V

    .line 4
    :cond_0
    iput-object p1, p0, Lc/a/a/a/v1;->y:Landroid/view/TextureView;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p1, :cond_1

    .line 5
    invoke-direct {p0, v0, v1}, Lc/a/a/a/v1;->S0(Landroid/view/Surface;Z)V

    .line 6
    invoke-direct {p0, v2, v2}, Lc/a/a/a/v1;->J0(II)V

    goto :goto_1

    .line 7
    :cond_1
    invoke-virtual {p1}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    move-result-object v3

    if-eqz v3, :cond_2

    const-string v3, "SimpleExoPlayer"

    const-string v4, "Replacing existing SurfaceTextureListener."

    .line 8
    invoke-static {v3, v4}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    :cond_2
    iget-object v3, p0, Lc/a/a/a/v1;->e:Lc/a/a/a/v1$c;

    invoke-virtual {p1, v3}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 10
    invoke-virtual {p1}, Landroid/view/TextureView;->isAvailable()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v3

    goto :goto_0

    :cond_3
    move-object v3, v0

    :goto_0
    if-nez v3, :cond_4

    .line 11
    invoke-direct {p0, v0, v1}, Lc/a/a/a/v1;->S0(Landroid/view/Surface;Z)V

    .line 12
    invoke-direct {p0, v2, v2}, Lc/a/a/a/v1;->J0(II)V

    goto :goto_1

    .line 13
    :cond_4
    new-instance v0, Landroid/view/Surface;

    invoke-direct {v0, v3}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    invoke-direct {p0, v0, v1}, Lc/a/a/a/v1;->S0(Landroid/view/Surface;Z)V

    .line 14
    invoke-virtual {p1}, Landroid/view/TextureView;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/TextureView;->getHeight()I

    move-result p1

    invoke-direct {p0, v0, p1}, Lc/a/a/a/v1;->J0(II)V

    :goto_1
    return-void
.end method

.method public T()Lc/a/a/a/l2/l;
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->T()Lc/a/a/a/l2/l;

    move-result-object v0

    return-object v0
.end method

.method public U(I)I
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0, p1}, Lc/a/a/a/q0;->U(I)I

    move-result p1

    return p1
.end method

.method public V(Lc/a/a/a/n2/y;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public W()J
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->W()J

    move-result-wide v0

    return-wide v0
.end method

.method public X(Lc/a/a/a/n2/y;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public Y()Lc/a/a/a/l1$c;
    .locals 0

    return-object p0
.end method

.method public a(Landroid/view/Surface;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    invoke-direct {p0}, Lc/a/a/a/v1;->M0()V

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0}, Lc/a/a/a/v1;->Q0(Lc/a/a/a/n2/u;)V

    :cond_0
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Lc/a/a/a/v1;->S0(Landroid/view/Surface;Z)V

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    .line 5
    :goto_0
    invoke-direct {p0, v0, v0}, Lc/a/a/a/v1;->J0(II)V

    return-void
.end method

.method public b(Lc/a/a/a/n2/a0/a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/v1;->J:Lc/a/a/a/n2/a0/a;

    const/4 v0, 0x6

    const/4 v1, 0x7

    .line 3
    invoke-direct {p0, v0, v1, p1}, Lc/a/a/a/v1;->N0(IILjava/lang/Object;)V

    return-void
.end method

.method public c()Lc/a/a/a/i1;
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->c()Lc/a/a/a/i1;

    move-result-object v0

    return-object v0
.end method

.method public d()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/v1;->n()Z

    move-result v0

    .line 3
    iget-object v1, p0, Lc/a/a/a/v1;->m:Lc/a/a/a/f0;

    const/4 v2, 0x2

    invoke-virtual {v1, v0, v2}, Lc/a/a/a/f0;->p(ZI)I

    move-result v1

    .line 4
    invoke-static {v0, v1}, Lc/a/a/a/v1;->H0(ZI)I

    move-result v2

    .line 5
    invoke-direct {p0, v0, v1, v2}, Lc/a/a/a/v1;->T0(ZII)V

    .line 6
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->d()V

    return-void
.end method

.method public e()Lc/a/a/a/p0;
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->e()Lc/a/a/a/p0;

    move-result-object v0

    return-object v0
.end method

.method public f(Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->m:Lc/a/a/a/f0;

    invoke-virtual {p0}, Lc/a/a/a/v1;->q()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lc/a/a/a/f0;->p(ZI)I

    move-result v0

    .line 3
    invoke-static {p1, v0}, Lc/a/a/a/v1;->H0(ZI)I

    move-result v1

    .line 4
    invoke-direct {p0, p1, v0, v1}, Lc/a/a/a/v1;->T0(ZII)V

    return-void
.end method

.method public g()Lc/a/a/a/l1$d;
    .locals 0

    return-object p0
.end method

.method public h()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->h()Z

    move-result v0

    return v0
.end method

.method public i()J
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public j()J
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->j()J

    move-result-wide v0

    return-wide v0
.end method

.method public k(IJ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->k:Lc/a/a/a/a2/c1;

    invoke-virtual {v0}, Lc/a/a/a/a2/c1;->j1()V

    .line 3
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0, p1, p2, p3}, Lc/a/a/a/q0;->k(IJ)V

    return-void
.end method

.method public m(Lc/a/a/a/n2/v;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/v1;->I:Lc/a/a/a/n2/v;

    const/4 v0, 0x2

    const/4 v1, 0x6

    .line 3
    invoke-direct {p0, v0, v1, p1}, Lc/a/a/a/v1;->N0(IILjava/lang/Object;)V

    return-void
.end method

.method public n()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->n()Z

    move-result v0

    return v0
.end method

.method public o(Landroid/view/Surface;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->u:Landroid/view/Surface;

    if-ne p1, v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lc/a/a/a/v1;->D0()V

    :cond_0
    return-void
.end method

.method public p(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0, p1}, Lc/a/a/a/q0;->p(Z)V

    return-void
.end method

.method public q()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->q()I

    move-result v0

    return v0
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
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->r()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public s(Lc/a/a/a/n2/a0/a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->J:Lc/a/a/a/n2/a0/a;

    if-eq v0, p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x6

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, p1, v0, v1}, Lc/a/a/a/v1;->N0(IILjava/lang/Object;)V

    return-void
.end method

.method public u()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->u()I

    move-result v0

    return v0
.end method

.method public v()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lc/a/a/a/k2/c;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->H:Ljava/util/List;

    return-object v0
.end method

.method public x(Landroid/view/TextureView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->y:Landroid/view/TextureView;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Lc/a/a/a/v1;->S(Landroid/view/TextureView;)V

    :cond_0
    return-void
.end method

.method public y(Lc/a/a/a/n2/v;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->I:Lc/a/a/a/n2/v;

    if-eq v0, p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x2

    const/4 v0, 0x6

    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, p1, v0, v1}, Lc/a/a/a/v1;->N0(IILjava/lang/Object;)V

    return-void
.end method

.method public z()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/v1;->V0()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1;->d:Lc/a/a/a/q0;

    invoke-virtual {v0}, Lc/a/a/a/q0;->z()I

    move-result v0

    return v0
.end method
