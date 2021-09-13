.class public final Lc/a/a/a/v1$b;
.super Ljava/lang/Object;
.source "SimpleExoPlayer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/v1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lc/a/a/a/t1;

.field private c:Lc/a/a/a/m2/g;

.field private d:Lc/a/a/a/l2/n;

.field private e:Lc/a/a/a/j2/f0;

.field private f:Lc/a/a/a/y0;

.field private g:Lcom/google/android/exoplayer2/upstream/g;

.field private h:Lc/a/a/a/a2/c1;

.field private i:Landroid/os/Looper;

.field private j:Lc/a/a/a/m2/c0;

.field private k:Lc/a/a/a/b2/n;

.field private l:Z

.field private m:I

.field private n:Z

.field private o:Z

.field private p:I

.field private q:Z

.field private r:Lc/a/a/a/u1;

.field private s:Lc/a/a/a/x0;

.field private t:J

.field private u:J

.field private v:Z

.field private w:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    new-instance v0, Lc/a/a/a/o0;

    invoke-direct {v0, p1}, Lc/a/a/a/o0;-><init>(Landroid/content/Context;)V

    new-instance v1, Lc/a/a/a/f2/h;

    invoke-direct {v1}, Lc/a/a/a/f2/h;-><init>()V

    invoke-direct {p0, p1, v0, v1}, Lc/a/a/a/v1$b;-><init>(Landroid/content/Context;Lc/a/a/a/t1;Lc/a/a/a/f2/o;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lc/a/a/a/t1;Lc/a/a/a/f2/o;)V
    .locals 8

    .line 2
    new-instance v3, Lc/a/a/a/l2/f;

    invoke-direct {v3, p1}, Lc/a/a/a/l2/f;-><init>(Landroid/content/Context;)V

    new-instance v4, Lc/a/a/a/j2/s;

    invoke-direct {v4, p1, p3}, Lc/a/a/a/j2/s;-><init>(Landroid/content/Context;Lc/a/a/a/f2/o;)V

    new-instance v5, Lc/a/a/a/m0;

    invoke-direct {v5}, Lc/a/a/a/m0;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/google/android/exoplayer2/upstream/r;->l(Landroid/content/Context;)Lcom/google/android/exoplayer2/upstream/r;

    move-result-object v6

    new-instance v7, Lc/a/a/a/a2/c1;

    sget-object p3, Lc/a/a/a/m2/g;->a:Lc/a/a/a/m2/g;

    invoke-direct {v7, p3}, Lc/a/a/a/a2/c1;-><init>(Lc/a/a/a/m2/g;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 4
    invoke-direct/range {v0 .. v7}, Lc/a/a/a/v1$b;-><init>(Landroid/content/Context;Lc/a/a/a/t1;Lc/a/a/a/l2/n;Lc/a/a/a/j2/f0;Lc/a/a/a/y0;Lcom/google/android/exoplayer2/upstream/g;Lc/a/a/a/a2/c1;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lc/a/a/a/t1;Lc/a/a/a/l2/n;Lc/a/a/a/j2/f0;Lc/a/a/a/y0;Lcom/google/android/exoplayer2/upstream/g;Lc/a/a/a/a2/c1;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lc/a/a/a/v1$b;->a:Landroid/content/Context;

    .line 7
    iput-object p2, p0, Lc/a/a/a/v1$b;->b:Lc/a/a/a/t1;

    .line 8
    iput-object p3, p0, Lc/a/a/a/v1$b;->d:Lc/a/a/a/l2/n;

    .line 9
    iput-object p4, p0, Lc/a/a/a/v1$b;->e:Lc/a/a/a/j2/f0;

    .line 10
    iput-object p5, p0, Lc/a/a/a/v1$b;->f:Lc/a/a/a/y0;

    .line 11
    iput-object p6, p0, Lc/a/a/a/v1$b;->g:Lcom/google/android/exoplayer2/upstream/g;

    .line 12
    iput-object p7, p0, Lc/a/a/a/v1$b;->h:Lc/a/a/a/a2/c1;

    .line 13
    invoke-static {}, Lc/a/a/a/m2/m0;->L()Landroid/os/Looper;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/v1$b;->i:Landroid/os/Looper;

    .line 14
    sget-object p1, Lc/a/a/a/b2/n;->a:Lc/a/a/a/b2/n;

    iput-object p1, p0, Lc/a/a/a/v1$b;->k:Lc/a/a/a/b2/n;

    const/4 p1, 0x0

    .line 15
    iput p1, p0, Lc/a/a/a/v1$b;->m:I

    const/4 p1, 0x1

    .line 16
    iput p1, p0, Lc/a/a/a/v1$b;->p:I

    .line 17
    iput-boolean p1, p0, Lc/a/a/a/v1$b;->q:Z

    .line 18
    sget-object p1, Lc/a/a/a/u1;->e:Lc/a/a/a/u1;

    iput-object p1, p0, Lc/a/a/a/v1$b;->r:Lc/a/a/a/u1;

    .line 19
    new-instance p1, Lc/a/a/a/l0$b;

    invoke-direct {p1}, Lc/a/a/a/l0$b;-><init>()V

    invoke-virtual {p1}, Lc/a/a/a/l0$b;->a()Lc/a/a/a/l0;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/v1$b;->s:Lc/a/a/a/x0;

    .line 20
    sget-object p1, Lc/a/a/a/m2/g;->a:Lc/a/a/a/m2/g;

    iput-object p1, p0, Lc/a/a/a/v1$b;->c:Lc/a/a/a/m2/g;

    const-wide/16 p1, 0x1f4

    .line 21
    iput-wide p1, p0, Lc/a/a/a/v1$b;->t:J

    const-wide/16 p1, 0x7d0

    .line 22
    iput-wide p1, p0, Lc/a/a/a/v1$b;->u:J

    return-void
.end method

.method static synthetic a(Lc/a/a/a/v1$b;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/v1$b;->a:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic b(Lc/a/a/a/v1$b;)Lc/a/a/a/a2/c1;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/v1$b;->h:Lc/a/a/a/a2/c1;

    return-object p0
.end method

.method static synthetic c(Lc/a/a/a/v1$b;)Lc/a/a/a/l2/n;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/v1$b;->d:Lc/a/a/a/l2/n;

    return-object p0
.end method

.method static synthetic d(Lc/a/a/a/v1$b;)Lc/a/a/a/j2/f0;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/v1$b;->e:Lc/a/a/a/j2/f0;

    return-object p0
.end method

.method static synthetic e(Lc/a/a/a/v1$b;)Lc/a/a/a/y0;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/v1$b;->f:Lc/a/a/a/y0;

    return-object p0
.end method

.method static synthetic f(Lc/a/a/a/v1$b;)Lcom/google/android/exoplayer2/upstream/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/v1$b;->g:Lcom/google/android/exoplayer2/upstream/g;

    return-object p0
.end method

.method static synthetic g(Lc/a/a/a/v1$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lc/a/a/a/v1$b;->q:Z

    return p0
.end method

.method static synthetic h(Lc/a/a/a/v1$b;)Lc/a/a/a/u1;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/v1$b;->r:Lc/a/a/a/u1;

    return-object p0
.end method

.method static synthetic i(Lc/a/a/a/v1$b;)Lc/a/a/a/x0;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/v1$b;->s:Lc/a/a/a/x0;

    return-object p0
.end method

.method static synthetic j(Lc/a/a/a/v1$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/v1$b;->t:J

    return-wide v0
.end method

.method static synthetic k(Lc/a/a/a/v1$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lc/a/a/a/v1$b;->v:Z

    return p0
.end method

.method static synthetic l(Lc/a/a/a/v1$b;)Lc/a/a/a/m2/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/v1$b;->c:Lc/a/a/a/m2/g;

    return-object p0
.end method

.method static synthetic m(Lc/a/a/a/v1$b;)Lc/a/a/a/m2/c0;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/v1$b;->j:Lc/a/a/a/m2/c0;

    return-object p0
.end method

.method static synthetic n(Lc/a/a/a/v1$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lc/a/a/a/v1$b;->n:Z

    return p0
.end method

.method static synthetic o(Lc/a/a/a/v1$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lc/a/a/a/v1$b;->l:Z

    return p0
.end method

.method static synthetic p(Lc/a/a/a/v1$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/v1$b;->m:I

    return p0
.end method

.method static synthetic q(Lc/a/a/a/v1$b;)Lc/a/a/a/b2/n;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/v1$b;->k:Lc/a/a/a/b2/n;

    return-object p0
.end method

.method static synthetic r(Lc/a/a/a/v1$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/v1$b;->p:I

    return p0
.end method

.method static synthetic s(Lc/a/a/a/v1$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lc/a/a/a/v1$b;->o:Z

    return p0
.end method

.method static synthetic t(Lc/a/a/a/v1$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/v1$b;->u:J

    return-wide v0
.end method

.method static synthetic u(Lc/a/a/a/v1$b;)Landroid/os/Looper;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/v1$b;->i:Landroid/os/Looper;

    return-object p0
.end method

.method static synthetic v(Lc/a/a/a/v1$b;)Lc/a/a/a/t1;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/v1$b;->b:Lc/a/a/a/t1;

    return-object p0
.end method


# virtual methods
.method public w()Lc/a/a/a/v1;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/v1$b;->w:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    iput-boolean v1, p0, Lc/a/a/a/v1$b;->w:Z

    .line 3
    new-instance v0, Lc/a/a/a/v1;

    invoke-direct {v0, p0}, Lc/a/a/a/v1;-><init>(Lc/a/a/a/v1$b;)V

    return-object v0
.end method
