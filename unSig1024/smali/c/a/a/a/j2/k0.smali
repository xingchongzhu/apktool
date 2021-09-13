.class public Lc/a/a/a/j2/k0;
.super Ljava/lang/Object;
.source "SampleQueue.java"

# interfaces
.implements Lc/a/a/a/f2/b0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/j2/k0$a;,
        Lc/a/a/a/j2/k0$b;
    }
.end annotation


# instance fields
.field private A:Z

.field private B:Lc/a/a/a/u0;

.field private C:Lc/a/a/a/u0;

.field private D:Lc/a/a/a/u0;

.field private E:I

.field private F:Z

.field private G:Z

.field private H:J

.field private I:Z

.field private final a:Lc/a/a/a/j2/j0;

.field private final b:Lc/a/a/a/j2/k0$a;

.field private final c:Lc/a/a/a/e2/y;

.field private final d:Lc/a/a/a/e2/w$a;

.field private final e:Landroid/os/Looper;

.field private f:Lc/a/a/a/j2/k0$b;

.field private g:Lc/a/a/a/u0;

.field private h:Lc/a/a/a/e2/v;

.field private i:I

.field private j:[I

.field private k:[J

.field private l:[I

.field private m:[I

.field private n:[J

.field private o:[Lc/a/a/a/f2/b0$a;

.field private p:[Lc/a/a/a/u0;

.field private q:I

.field private r:I

.field private s:I

.field private t:I

.field private u:J

.field private v:J

.field private w:J

.field private x:Z

.field private y:Z

.field private z:Z


# direct methods
.method protected constructor <init>(Lcom/google/android/exoplayer2/upstream/e;Landroid/os/Looper;Lc/a/a/a/e2/y;Lc/a/a/a/e2/w$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lc/a/a/a/j2/k0;->e:Landroid/os/Looper;

    .line 3
    iput-object p3, p0, Lc/a/a/a/j2/k0;->c:Lc/a/a/a/e2/y;

    .line 4
    iput-object p4, p0, Lc/a/a/a/j2/k0;->d:Lc/a/a/a/e2/w$a;

    .line 5
    new-instance p2, Lc/a/a/a/j2/j0;

    invoke-direct {p2, p1}, Lc/a/a/a/j2/j0;-><init>(Lcom/google/android/exoplayer2/upstream/e;)V

    iput-object p2, p0, Lc/a/a/a/j2/k0;->a:Lc/a/a/a/j2/j0;

    .line 6
    new-instance p1, Lc/a/a/a/j2/k0$a;

    invoke-direct {p1}, Lc/a/a/a/j2/k0$a;-><init>()V

    iput-object p1, p0, Lc/a/a/a/j2/k0;->b:Lc/a/a/a/j2/k0$a;

    const/16 p1, 0x3e8

    .line 7
    iput p1, p0, Lc/a/a/a/j2/k0;->i:I

    new-array p2, p1, [I

    .line 8
    iput-object p2, p0, Lc/a/a/a/j2/k0;->j:[I

    new-array p2, p1, [J

    .line 9
    iput-object p2, p0, Lc/a/a/a/j2/k0;->k:[J

    new-array p2, p1, [J

    .line 10
    iput-object p2, p0, Lc/a/a/a/j2/k0;->n:[J

    new-array p2, p1, [I

    .line 11
    iput-object p2, p0, Lc/a/a/a/j2/k0;->m:[I

    new-array p2, p1, [I

    .line 12
    iput-object p2, p0, Lc/a/a/a/j2/k0;->l:[I

    new-array p2, p1, [Lc/a/a/a/f2/b0$a;

    .line 13
    iput-object p2, p0, Lc/a/a/a/j2/k0;->o:[Lc/a/a/a/f2/b0$a;

    new-array p1, p1, [Lc/a/a/a/u0;

    .line 14
    iput-object p1, p0, Lc/a/a/a/j2/k0;->p:[Lc/a/a/a/u0;

    const-wide/high16 p1, -0x8000000000000000L

    .line 15
    iput-wide p1, p0, Lc/a/a/a/j2/k0;->u:J

    .line 16
    iput-wide p1, p0, Lc/a/a/a/j2/k0;->v:J

    .line 17
    iput-wide p1, p0, Lc/a/a/a/j2/k0;->w:J

    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lc/a/a/a/j2/k0;->z:Z

    .line 19
    iput-boolean p1, p0, Lc/a/a/a/j2/k0;->y:Z

    return-void
.end method

.method private B()Z
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/j2/k0;->t:I

    iget v1, p0, Lc/a/a/a/j2/k0;->q:I

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private F(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/k0;->h:Lc/a/a/a/e2/v;

    if-eqz v0, :cond_1

    .line 2
    invoke-interface {v0}, Lc/a/a/a/e2/v;->getState()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lc/a/a/a/j2/k0;->m:[I

    aget p1, v0, p1

    const/high16 v0, 0x40000000    # 2.0f

    and-int/2addr p1, v0

    if-nez p1, :cond_0

    iget-object p1, p0, Lc/a/a/a/j2/k0;->h:Lc/a/a/a/e2/v;

    .line 3
    invoke-interface {p1}, Lc/a/a/a/e2/v;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private H(Lc/a/a/a/u0;Lc/a/a/a/v0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/k0;->g:Lc/a/a/a/u0;

    if-nez v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    .line 2
    :cond_1
    iget-object v0, v0, Lc/a/a/a/u0;->o:Lc/a/a/a/e2/t;

    .line 3
    :goto_1
    iput-object p1, p0, Lc/a/a/a/j2/k0;->g:Lc/a/a/a/u0;

    .line 4
    iget-object v2, p1, Lc/a/a/a/u0;->o:Lc/a/a/a/e2/t;

    .line 5
    iget-object v3, p0, Lc/a/a/a/j2/k0;->c:Lc/a/a/a/e2/y;

    if-eqz v3, :cond_2

    .line 6
    invoke-interface {v3, p1}, Lc/a/a/a/e2/y;->c(Lc/a/a/a/u0;)Ljava/lang/Class;

    move-result-object v3

    .line 7
    invoke-virtual {p1, v3}, Lc/a/a/a/u0;->m(Ljava/lang/Class;)Lc/a/a/a/u0;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, p1

    .line 8
    :goto_2
    iput-object v3, p2, Lc/a/a/a/v0;->b:Lc/a/a/a/u0;

    .line 9
    iget-object v3, p0, Lc/a/a/a/j2/k0;->h:Lc/a/a/a/e2/v;

    iput-object v3, p2, Lc/a/a/a/v0;->a:Lc/a/a/a/e2/v;

    .line 10
    iget-object v3, p0, Lc/a/a/a/j2/k0;->c:Lc/a/a/a/e2/y;

    if-nez v3, :cond_3

    return-void

    :cond_3
    if-nez v1, :cond_4

    .line 11
    invoke-static {v0, v2}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    return-void

    .line 12
    :cond_4
    iget-object v0, p0, Lc/a/a/a/j2/k0;->h:Lc/a/a/a/e2/v;

    .line 13
    iget-object v1, p0, Lc/a/a/a/j2/k0;->c:Lc/a/a/a/e2/y;

    iget-object v2, p0, Lc/a/a/a/j2/k0;->e:Landroid/os/Looper;

    .line 14
    invoke-static {v2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Looper;

    iget-object v3, p0, Lc/a/a/a/j2/k0;->d:Lc/a/a/a/e2/w$a;

    .line 15
    invoke-interface {v1, v2, v3, p1}, Lc/a/a/a/e2/y;->b(Landroid/os/Looper;Lc/a/a/a/e2/w$a;Lc/a/a/a/u0;)Lc/a/a/a/e2/v;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/j2/k0;->h:Lc/a/a/a/e2/v;

    .line 16
    iput-object p1, p2, Lc/a/a/a/v0;->a:Lc/a/a/a/e2/v;

    if-eqz v0, :cond_5

    .line 17
    iget-object p1, p0, Lc/a/a/a/j2/k0;->d:Lc/a/a/a/e2/w$a;

    invoke-interface {v0, p1}, Lc/a/a/a/e2/v;->d(Lc/a/a/a/e2/w$a;)V

    :cond_5
    return-void
.end method

.method private declared-synchronized I(Lc/a/a/a/v0;Lc/a/a/a/c2/f;ZZLc/a/a/a/j2/k0$a;)I
    .locals 6

    monitor-enter p0

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iput-boolean v0, p2, Lc/a/a/a/c2/f;->d:Z

    .line 2
    invoke-direct {p0}, Lc/a/a/a/j2/k0;->B()Z

    move-result v0

    const/4 v1, -0x5

    const/4 v2, -0x3

    const/4 v3, -0x4

    if-nez v0, :cond_4

    if-nez p4, :cond_3

    .line 3
    iget-boolean p4, p0, Lc/a/a/a/j2/k0;->x:Z

    if-eqz p4, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object p2, p0, Lc/a/a/a/j2/k0;->C:Lc/a/a/a/u0;

    if-eqz p2, :cond_2

    if-nez p3, :cond_1

    iget-object p3, p0, Lc/a/a/a/j2/k0;->g:Lc/a/a/a/u0;

    if-eq p2, p3, :cond_2

    .line 5
    :cond_1
    invoke-static {p2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc/a/a/a/u0;

    invoke-direct {p0, p2, p1}, Lc/a/a/a/j2/k0;->H(Lc/a/a/a/u0;Lc/a/a/a/v0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    monitor-exit p0

    return v1

    .line 7
    :cond_2
    monitor-exit p0

    return v2

    :cond_3
    :goto_0
    const/4 p1, 0x4

    .line 8
    :try_start_1
    invoke-virtual {p2, p1}, Lc/a/a/a/c2/a;->m(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    monitor-exit p0

    return v3

    .line 10
    :cond_4
    :try_start_2
    iget p4, p0, Lc/a/a/a/j2/k0;->t:I

    invoke-direct {p0, p4}, Lc/a/a/a/j2/k0;->x(I)I

    move-result p4

    if-nez p3, :cond_8

    .line 11
    iget-object p3, p0, Lc/a/a/a/j2/k0;->p:[Lc/a/a/a/u0;

    aget-object p3, p3, p4

    iget-object v0, p0, Lc/a/a/a/j2/k0;->g:Lc/a/a/a/u0;

    if-eq p3, v0, :cond_5

    goto :goto_1

    .line 12
    :cond_5
    invoke-direct {p0, p4}, Lc/a/a/a/j2/k0;->F(I)Z

    move-result p1

    if-nez p1, :cond_6

    const/4 p1, 0x1

    .line 13
    iput-boolean p1, p2, Lc/a/a/a/c2/f;->d:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 14
    monitor-exit p0

    return v2

    .line 15
    :cond_6
    :try_start_3
    iget-object p1, p0, Lc/a/a/a/j2/k0;->m:[I

    aget p1, p1, p4

    invoke-virtual {p2, p1}, Lc/a/a/a/c2/a;->m(I)V

    .line 16
    iget-object p1, p0, Lc/a/a/a/j2/k0;->n:[J

    aget-wide v0, p1, p4

    iput-wide v0, p2, Lc/a/a/a/c2/f;->e:J

    .line 17
    iget-wide v4, p0, Lc/a/a/a/j2/k0;->u:J

    cmp-long p1, v0, v4

    if-gez p1, :cond_7

    const/high16 p1, -0x80000000

    .line 18
    invoke-virtual {p2, p1}, Lc/a/a/a/c2/a;->e(I)V

    .line 19
    :cond_7
    iget-object p1, p0, Lc/a/a/a/j2/k0;->l:[I

    aget p1, p1, p4

    iput p1, p5, Lc/a/a/a/j2/k0$a;->a:I

    .line 20
    iget-object p1, p0, Lc/a/a/a/j2/k0;->k:[J

    aget-wide p2, p1, p4

    iput-wide p2, p5, Lc/a/a/a/j2/k0$a;->b:J

    .line 21
    iget-object p1, p0, Lc/a/a/a/j2/k0;->o:[Lc/a/a/a/f2/b0$a;

    aget-object p1, p1, p4

    iput-object p1, p5, Lc/a/a/a/j2/k0$a;->c:Lc/a/a/a/f2/b0$a;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 22
    monitor-exit p0

    return v3

    .line 23
    :cond_8
    :goto_1
    :try_start_4
    iget-object p2, p0, Lc/a/a/a/j2/k0;->p:[Lc/a/a/a/u0;

    aget-object p2, p2, p4

    invoke-direct {p0, p2, p1}, Lc/a/a/a/j2/k0;->H(Lc/a/a/a/u0;Lc/a/a/a/v0;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 24
    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private N()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/k0;->h:Lc/a/a/a/e2/v;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lc/a/a/a/j2/k0;->d:Lc/a/a/a/e2/w$a;

    invoke-interface {v0, v1}, Lc/a/a/a/e2/v;->d(Lc/a/a/a/e2/w$a;)V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lc/a/a/a/j2/k0;->h:Lc/a/a/a/e2/v;

    .line 4
    iput-object v0, p0, Lc/a/a/a/j2/k0;->g:Lc/a/a/a/u0;

    :cond_0
    return-void
.end method

.method private declared-synchronized Q()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iput v0, p0, Lc/a/a/a/j2/k0;->t:I

    .line 2
    iget-object v0, p0, Lc/a/a/a/j2/k0;->a:Lc/a/a/a/j2/j0;

    invoke-virtual {v0}, Lc/a/a/a/j2/j0;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized U(Lc/a/a/a/u0;)Z
    .locals 2

    monitor-enter p0

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iput-boolean v0, p0, Lc/a/a/a/j2/k0;->z:Z

    .line 2
    iget-object v1, p0, Lc/a/a/a/j2/k0;->C:Lc/a/a/a/u0;

    invoke-static {p1, v1}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 3
    monitor-exit p0

    return v0

    .line 4
    :cond_0
    :try_start_1
    iget-object v1, p0, Lc/a/a/a/j2/k0;->D:Lc/a/a/a/u0;

    invoke-static {p1, v1}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    iget-object p1, p0, Lc/a/a/a/j2/k0;->D:Lc/a/a/a/u0;

    iput-object p1, p0, Lc/a/a/a/j2/k0;->C:Lc/a/a/a/u0;

    goto :goto_0

    .line 6
    :cond_1
    iput-object p1, p0, Lc/a/a/a/j2/k0;->C:Lc/a/a/a/u0;

    .line 7
    :goto_0
    iget-object p1, p0, Lc/a/a/a/j2/k0;->C:Lc/a/a/a/u0;

    iget-object v1, p1, Lc/a/a/a/u0;->l:Ljava/lang/String;

    iget-object p1, p1, Lc/a/a/a/u0;->i:Ljava/lang/String;

    .line 8
    invoke-static {v1, p1}, Lc/a/a/a/m2/w;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lc/a/a/a/j2/k0;->F:Z

    .line 9
    iput-boolean v0, p0, Lc/a/a/a/j2/k0;->G:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 p1, 0x1

    .line 10
    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized g(J)Z
    .locals 5

    monitor-enter p0

    .line 1
    :try_start_0
    iget v0, p0, Lc/a/a/a/j2/k0;->q:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    .line 2
    iget-wide v3, p0, Lc/a/a/a/j2/k0;->v:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v0, p1, v3

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit p0

    return v1

    .line 3
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Lc/a/a/a/j2/k0;->u()J

    move-result-wide v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v0, v3, p1

    if-ltz v0, :cond_2

    .line 4
    monitor-exit p0

    return v2

    .line 5
    :cond_2
    :try_start_2
    invoke-direct {p0, p1, p2}, Lc/a/a/a/j2/k0;->i(J)I

    move-result p1

    .line 6
    iget p2, p0, Lc/a/a/a/j2/k0;->r:I

    add-int/2addr p2, p1

    invoke-direct {p0, p2}, Lc/a/a/a/j2/k0;->p(I)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 7
    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized h(JIJILc/a/a/a/f2/b0$a;)V
    .locals 8

    monitor-enter p0

    .line 1
    :try_start_0
    iget v0, p0, Lc/a/a/a/j2/k0;->q:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_1

    sub-int/2addr v0, v1

    .line 2
    invoke-direct {p0, v0}, Lc/a/a/a/j2/k0;->x(I)I

    move-result v0

    .line 3
    iget-object v3, p0, Lc/a/a/a/j2/k0;->k:[J

    aget-wide v4, v3, v0

    iget-object v3, p0, Lc/a/a/a/j2/k0;->l:[I

    aget v0, v3, v0

    int-to-long v6, v0

    add-long/2addr v4, v6

    cmp-long v0, v4, p4

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lc/a/a/a/m2/f;->a(Z)V

    :cond_1
    const/high16 v0, 0x20000000

    and-int/2addr v0, p3

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 4
    :goto_1
    iput-boolean v0, p0, Lc/a/a/a/j2/k0;->x:Z

    .line 5
    iget-wide v3, p0, Lc/a/a/a/j2/k0;->w:J

    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    iput-wide v3, p0, Lc/a/a/a/j2/k0;->w:J

    .line 6
    iget v0, p0, Lc/a/a/a/j2/k0;->q:I

    invoke-direct {p0, v0}, Lc/a/a/a/j2/k0;->x(I)I

    move-result v0

    .line 7
    iget-object v3, p0, Lc/a/a/a/j2/k0;->n:[J

    aput-wide p1, v3, v0

    .line 8
    iget-object p1, p0, Lc/a/a/a/j2/k0;->k:[J

    aput-wide p4, p1, v0

    .line 9
    iget-object p2, p0, Lc/a/a/a/j2/k0;->l:[I

    aput p6, p2, v0

    .line 10
    iget-object p2, p0, Lc/a/a/a/j2/k0;->m:[I

    aput p3, p2, v0

    .line 11
    iget-object p2, p0, Lc/a/a/a/j2/k0;->o:[Lc/a/a/a/f2/b0$a;

    aput-object p7, p2, v0

    .line 12
    iget-object p2, p0, Lc/a/a/a/j2/k0;->p:[Lc/a/a/a/u0;

    iget-object p3, p0, Lc/a/a/a/j2/k0;->C:Lc/a/a/a/u0;

    aput-object p3, p2, v0

    .line 13
    iget-object p2, p0, Lc/a/a/a/j2/k0;->j:[I

    iget p4, p0, Lc/a/a/a/j2/k0;->E:I

    aput p4, p2, v0

    .line 14
    iput-object p3, p0, Lc/a/a/a/j2/k0;->D:Lc/a/a/a/u0;

    .line 15
    iget p2, p0, Lc/a/a/a/j2/k0;->q:I

    add-int/2addr p2, v1

    iput p2, p0, Lc/a/a/a/j2/k0;->q:I

    .line 16
    iget p3, p0, Lc/a/a/a/j2/k0;->i:I

    if-ne p2, p3, :cond_3

    add-int/lit16 p2, p3, 0x3e8

    .line 17
    new-array p4, p2, [I

    .line 18
    new-array p5, p2, [J

    .line 19
    new-array p6, p2, [J

    .line 20
    new-array p7, p2, [I

    .line 21
    new-array v0, p2, [I

    .line 22
    new-array v1, p2, [Lc/a/a/a/f2/b0$a;

    .line 23
    new-array v3, p2, [Lc/a/a/a/u0;

    .line 24
    iget v4, p0, Lc/a/a/a/j2/k0;->s:I

    sub-int/2addr p3, v4

    .line 25
    invoke-static {p1, v4, p5, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 26
    iget-object p1, p0, Lc/a/a/a/j2/k0;->n:[J

    iget v4, p0, Lc/a/a/a/j2/k0;->s:I

    invoke-static {p1, v4, p6, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 27
    iget-object p1, p0, Lc/a/a/a/j2/k0;->m:[I

    iget v4, p0, Lc/a/a/a/j2/k0;->s:I

    invoke-static {p1, v4, p7, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 28
    iget-object p1, p0, Lc/a/a/a/j2/k0;->l:[I

    iget v4, p0, Lc/a/a/a/j2/k0;->s:I

    invoke-static {p1, v4, v0, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 29
    iget-object p1, p0, Lc/a/a/a/j2/k0;->o:[Lc/a/a/a/f2/b0$a;

    iget v4, p0, Lc/a/a/a/j2/k0;->s:I

    invoke-static {p1, v4, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 30
    iget-object p1, p0, Lc/a/a/a/j2/k0;->p:[Lc/a/a/a/u0;

    iget v4, p0, Lc/a/a/a/j2/k0;->s:I

    invoke-static {p1, v4, v3, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 31
    iget-object p1, p0, Lc/a/a/a/j2/k0;->j:[I

    iget v4, p0, Lc/a/a/a/j2/k0;->s:I

    invoke-static {p1, v4, p4, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 32
    iget p1, p0, Lc/a/a/a/j2/k0;->s:I

    .line 33
    iget-object v4, p0, Lc/a/a/a/j2/k0;->k:[J

    invoke-static {v4, v2, p5, p3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 34
    iget-object v4, p0, Lc/a/a/a/j2/k0;->n:[J

    invoke-static {v4, v2, p6, p3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    iget-object v4, p0, Lc/a/a/a/j2/k0;->m:[I

    invoke-static {v4, v2, p7, p3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 36
    iget-object v4, p0, Lc/a/a/a/j2/k0;->l:[I

    invoke-static {v4, v2, v0, p3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 37
    iget-object v4, p0, Lc/a/a/a/j2/k0;->o:[Lc/a/a/a/f2/b0$a;

    invoke-static {v4, v2, v1, p3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 38
    iget-object v4, p0, Lc/a/a/a/j2/k0;->p:[Lc/a/a/a/u0;

    invoke-static {v4, v2, v3, p3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 39
    iget-object v4, p0, Lc/a/a/a/j2/k0;->j:[I

    invoke-static {v4, v2, p4, p3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 40
    iput-object p5, p0, Lc/a/a/a/j2/k0;->k:[J

    .line 41
    iput-object p6, p0, Lc/a/a/a/j2/k0;->n:[J

    .line 42
    iput-object p7, p0, Lc/a/a/a/j2/k0;->m:[I

    .line 43
    iput-object v0, p0, Lc/a/a/a/j2/k0;->l:[I

    .line 44
    iput-object v1, p0, Lc/a/a/a/j2/k0;->o:[Lc/a/a/a/f2/b0$a;

    .line 45
    iput-object v3, p0, Lc/a/a/a/j2/k0;->p:[Lc/a/a/a/u0;

    .line 46
    iput-object p4, p0, Lc/a/a/a/j2/k0;->j:[I

    .line 47
    iput v2, p0, Lc/a/a/a/j2/k0;->s:I

    .line 48
    iput p2, p0, Lc/a/a/a/j2/k0;->i:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    :cond_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private i(J)I
    .locals 5

    .line 1
    iget v0, p0, Lc/a/a/a/j2/k0;->q:I

    add-int/lit8 v1, v0, -0x1

    .line 2
    invoke-direct {p0, v1}, Lc/a/a/a/j2/k0;->x(I)I

    move-result v1

    .line 3
    :cond_0
    :goto_0
    iget v2, p0, Lc/a/a/a/j2/k0;->t:I

    if-le v0, v2, :cond_1

    iget-object v2, p0, Lc/a/a/a/j2/k0;->n:[J

    aget-wide v3, v2, v1

    cmp-long v2, v3, p1

    if-ltz v2, :cond_1

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    .line 4
    iget v1, p0, Lc/a/a/a/j2/k0;->i:I

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static j(Lcom/google/android/exoplayer2/upstream/e;Landroid/os/Looper;Lc/a/a/a/e2/y;Lc/a/a/a/e2/w$a;)Lc/a/a/a/j2/k0;
    .locals 1

    .line 1
    new-instance v0, Lc/a/a/a/j2/k0;

    .line 2
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Looper;

    .line 3
    invoke-static {p2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc/a/a/a/e2/y;

    .line 4
    invoke-static {p3}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lc/a/a/a/e2/w$a;

    invoke-direct {v0, p0, p1, p2, p3}, Lc/a/a/a/j2/k0;-><init>(Lcom/google/android/exoplayer2/upstream/e;Landroid/os/Looper;Lc/a/a/a/e2/y;Lc/a/a/a/e2/w$a;)V

    return-object v0
.end method

.method private declared-synchronized k(JZZ)J
    .locals 10

    monitor-enter p0

    .line 1
    :try_start_0
    iget v0, p0, Lc/a/a/a/j2/k0;->q:I

    const-wide/16 v1, -0x1

    if-eqz v0, :cond_3

    iget-object v3, p0, Lc/a/a/a/j2/k0;->n:[J

    iget v5, p0, Lc/a/a/a/j2/k0;->s:I

    aget-wide v6, v3, v5

    cmp-long v3, p1, v6

    if-gez v3, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p4, :cond_1

    .line 2
    iget p4, p0, Lc/a/a/a/j2/k0;->t:I

    if-eq p4, v0, :cond_1

    add-int/lit8 v0, p4, 0x1

    :cond_1
    move v6, v0

    move-object v4, p0

    move-wide v7, p1

    move v9, p3

    .line 3
    invoke-direct/range {v4 .. v9}, Lc/a/a/a/j2/k0;->r(IIJZ)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p2, -0x1

    if-ne p1, p2, :cond_2

    .line 4
    monitor-exit p0

    return-wide v1

    .line 5
    :cond_2
    :try_start_1
    invoke-direct {p0, p1}, Lc/a/a/a/j2/k0;->m(I)J

    move-result-wide p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-wide p1

    .line 6
    :cond_3
    :goto_0
    monitor-exit p0

    return-wide v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized l()J
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget v0, p0, Lc/a/a/a/j2/k0;->q:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const-wide/16 v0, -0x1

    .line 2
    monitor-exit p0

    return-wide v0

    .line 3
    :cond_0
    :try_start_1
    invoke-direct {p0, v0}, Lc/a/a/a/j2/k0;->m(I)J

    move-result-wide v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private m(I)J
    .locals 4

    .line 1
    iget-wide v0, p0, Lc/a/a/a/j2/k0;->v:J

    .line 2
    invoke-direct {p0, p1}, Lc/a/a/a/j2/k0;->v(I)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lc/a/a/a/j2/k0;->v:J

    .line 3
    iget v0, p0, Lc/a/a/a/j2/k0;->q:I

    sub-int/2addr v0, p1

    iput v0, p0, Lc/a/a/a/j2/k0;->q:I

    .line 4
    iget v1, p0, Lc/a/a/a/j2/k0;->r:I

    add-int/2addr v1, p1

    iput v1, p0, Lc/a/a/a/j2/k0;->r:I

    .line 5
    iget v1, p0, Lc/a/a/a/j2/k0;->s:I

    add-int/2addr v1, p1

    iput v1, p0, Lc/a/a/a/j2/k0;->s:I

    .line 6
    iget v2, p0, Lc/a/a/a/j2/k0;->i:I

    if-lt v1, v2, :cond_0

    sub-int/2addr v1, v2

    .line 7
    iput v1, p0, Lc/a/a/a/j2/k0;->s:I

    .line 8
    :cond_0
    iget v1, p0, Lc/a/a/a/j2/k0;->t:I

    sub-int/2addr v1, p1

    iput v1, p0, Lc/a/a/a/j2/k0;->t:I

    if-gez v1, :cond_1

    const/4 p1, 0x0

    .line 9
    iput p1, p0, Lc/a/a/a/j2/k0;->t:I

    :cond_1
    if-nez v0, :cond_3

    .line 10
    iget p1, p0, Lc/a/a/a/j2/k0;->s:I

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    move v2, p1

    :goto_0
    add-int/lit8 v2, v2, -0x1

    .line 11
    iget-object p1, p0, Lc/a/a/a/j2/k0;->k:[J

    aget-wide v0, p1, v2

    iget-object p1, p0, Lc/a/a/a/j2/k0;->l:[I

    aget p1, p1, v2

    int-to-long v2, p1

    add-long/2addr v0, v2

    return-wide v0

    .line 12
    :cond_3
    iget-object p1, p0, Lc/a/a/a/j2/k0;->k:[J

    iget v0, p0, Lc/a/a/a/j2/k0;->s:I

    aget-wide v0, p1, v0

    return-wide v0
.end method

.method private p(I)J
    .locals 7

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/j2/k0;->A()I

    move-result v0

    sub-int/2addr v0, p1

    const/4 p1, 0x0

    const/4 v1, 0x1

    if-ltz v0, :cond_0

    .line 2
    iget v2, p0, Lc/a/a/a/j2/k0;->q:I

    iget v3, p0, Lc/a/a/a/j2/k0;->t:I

    sub-int/2addr v2, v3

    if-gt v0, v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Lc/a/a/a/m2/f;->a(Z)V

    .line 3
    iget v2, p0, Lc/a/a/a/j2/k0;->q:I

    sub-int/2addr v2, v0

    iput v2, p0, Lc/a/a/a/j2/k0;->q:I

    .line 4
    iget-wide v3, p0, Lc/a/a/a/j2/k0;->v:J

    invoke-direct {p0, v2}, Lc/a/a/a/j2/k0;->v(I)J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iput-wide v2, p0, Lc/a/a/a/j2/k0;->w:J

    if-nez v0, :cond_1

    .line 5
    iget-boolean v0, p0, Lc/a/a/a/j2/k0;->x:Z

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    :cond_1
    iput-boolean p1, p0, Lc/a/a/a/j2/k0;->x:Z

    .line 6
    iget p1, p0, Lc/a/a/a/j2/k0;->q:I

    if-eqz p1, :cond_2

    sub-int/2addr p1, v1

    .line 7
    invoke-direct {p0, p1}, Lc/a/a/a/j2/k0;->x(I)I

    move-result p1

    .line 8
    iget-object v0, p0, Lc/a/a/a/j2/k0;->k:[J

    aget-wide v1, v0, p1

    iget-object v0, p0, Lc/a/a/a/j2/k0;->l:[I

    aget p1, v0, p1

    int-to-long v3, p1

    add-long/2addr v1, v3

    return-wide v1

    :cond_2
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method private r(IIJZ)I
    .locals 7

    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p2, :cond_4

    .line 1
    iget-object v3, p0, Lc/a/a/a/j2/k0;->n:[J

    aget-wide v4, v3, p1

    cmp-long v6, v4, p3

    if-gtz v6, :cond_4

    if-eqz p5, :cond_0

    .line 2
    iget-object v4, p0, Lc/a/a/a/j2/k0;->m:[I

    aget v4, v4, p1

    and-int/lit8 v4, v4, 0x1

    if-eqz v4, :cond_2

    .line 3
    :cond_0
    aget-wide v4, v3, p1

    cmp-long v1, v4, p3

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    move v1, v2

    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 4
    iget v3, p0, Lc/a/a/a/j2/k0;->i:I

    if-ne p1, v3, :cond_3

    const/4 p1, 0x0

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    return v1
.end method

.method private v(I)J
    .locals 7

    const-wide/high16 v0, -0x8000000000000000L

    if-nez p1, :cond_0

    return-wide v0

    :cond_0
    add-int/lit8 v2, p1, -0x1

    .line 1
    invoke-direct {p0, v2}, Lc/a/a/a/j2/k0;->x(I)I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p1, :cond_3

    .line 2
    iget-object v4, p0, Lc/a/a/a/j2/k0;->n:[J

    aget-wide v5, v4, v2

    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    .line 3
    iget-object v4, p0, Lc/a/a/a/j2/k0;->m:[I

    aget v4, v4, v2

    and-int/lit8 v4, v4, 0x1

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, -0x1

    const/4 v4, -0x1

    if-ne v2, v4, :cond_2

    .line 4
    iget v2, p0, Lc/a/a/a/j2/k0;->i:I

    add-int/lit8 v2, v2, -0x1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-wide v0
.end method

.method private x(I)I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/j2/k0;->s:I

    add-int/2addr v0, p1

    .line 2
    iget p1, p0, Lc/a/a/a/j2/k0;->i:I

    if-ge v0, p1, :cond_0

    goto :goto_0

    :cond_0
    sub-int/2addr v0, p1

    :goto_0
    return v0
.end method


# virtual methods
.method public final A()I
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/j2/k0;->r:I

    iget v1, p0, Lc/a/a/a/j2/k0;->q:I

    add-int/2addr v0, v1

    return v0
.end method

.method protected final C()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/j2/k0;->A:Z

    return-void
.end method

.method public final declared-synchronized D()Z
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lc/a/a/a/j2/k0;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized E(Z)Z
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-direct {p0}, Lc/a/a/a/j2/k0;->B()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    if-nez p1, :cond_1

    .line 2
    iget-boolean p1, p0, Lc/a/a/a/j2/k0;->x:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lc/a/a/a/j2/k0;->C:Lc/a/a/a/u0;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lc/a/a/a/j2/k0;->g:Lc/a/a/a/u0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    monitor-exit p0

    return v1

    .line 3
    :cond_2
    :try_start_1
    iget p1, p0, Lc/a/a/a/j2/k0;->t:I

    invoke-direct {p0, p1}, Lc/a/a/a/j2/k0;->x(I)I

    move-result p1

    .line 4
    iget-object v0, p0, Lc/a/a/a/j2/k0;->p:[Lc/a/a/a/u0;

    aget-object v0, v0, p1

    iget-object v2, p0, Lc/a/a/a/j2/k0;->g:Lc/a/a/a/u0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eq v0, v2, :cond_3

    .line 5
    monitor-exit p0

    return v1

    .line 6
    :cond_3
    :try_start_2
    invoke-direct {p0, p1}, Lc/a/a/a/j2/k0;->F(I)Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public G()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/k0;->h:Lc/a/a/a/e2/v;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lc/a/a/a/e2/v;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lc/a/a/a/j2/k0;->h:Lc/a/a/a/e2/v;

    invoke-interface {v0}, Lc/a/a/a/e2/v;->g()Lc/a/a/a/e2/v$a;

    move-result-object v0

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/e2/v$a;

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final declared-synchronized J()I
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget v0, p0, Lc/a/a/a/j2/k0;->t:I

    invoke-direct {p0, v0}, Lc/a/a/a/j2/k0;->x(I)I

    move-result v0

    .line 2
    invoke-direct {p0}, Lc/a/a/a/j2/k0;->B()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lc/a/a/a/j2/k0;->j:[I

    aget v0, v1, v0

    goto :goto_0

    :cond_0
    iget v0, p0, Lc/a/a/a/j2/k0;->E:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public K()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/j2/k0;->o()V

    .line 2
    invoke-direct {p0}, Lc/a/a/a/j2/k0;->N()V

    return-void
.end method

.method public L(Lc/a/a/a/v0;Lc/a/a/a/c2/f;ZZ)I
    .locals 6

    .line 1
    iget-object v5, p0, Lc/a/a/a/j2/k0;->b:Lc/a/a/a/j2/k0$a;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    .line 2
    invoke-direct/range {v0 .. v5}, Lc/a/a/a/j2/k0;->I(Lc/a/a/a/v0;Lc/a/a/a/c2/f;ZZLc/a/a/a/j2/k0$a;)I

    move-result p1

    const/4 p3, -0x4

    if-ne p1, p3, :cond_0

    .line 3
    invoke-virtual {p2}, Lc/a/a/a/c2/a;->k()Z

    move-result p3

    if-nez p3, :cond_0

    invoke-virtual {p2}, Lc/a/a/a/c2/f;->r()Z

    move-result p3

    if-nez p3, :cond_0

    .line 4
    iget-object p3, p0, Lc/a/a/a/j2/k0;->a:Lc/a/a/a/j2/j0;

    iget-object p4, p0, Lc/a/a/a/j2/k0;->b:Lc/a/a/a/j2/k0$a;

    invoke-virtual {p3, p2, p4}, Lc/a/a/a/j2/j0;->l(Lc/a/a/a/c2/f;Lc/a/a/a/j2/k0$a;)V

    .line 5
    iget p2, p0, Lc/a/a/a/j2/k0;->t:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lc/a/a/a/j2/k0;->t:I

    :cond_0
    return p1
.end method

.method public M()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lc/a/a/a/j2/k0;->P(Z)V

    .line 2
    invoke-direct {p0}, Lc/a/a/a/j2/k0;->N()V

    return-void
.end method

.method public final O()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lc/a/a/a/j2/k0;->P(Z)V

    return-void
.end method

.method public P(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/k0;->a:Lc/a/a/a/j2/j0;

    invoke-virtual {v0}, Lc/a/a/a/j2/j0;->m()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lc/a/a/a/j2/k0;->q:I

    .line 3
    iput v0, p0, Lc/a/a/a/j2/k0;->r:I

    .line 4
    iput v0, p0, Lc/a/a/a/j2/k0;->s:I

    .line 5
    iput v0, p0, Lc/a/a/a/j2/k0;->t:I

    const/4 v1, 0x1

    .line 6
    iput-boolean v1, p0, Lc/a/a/a/j2/k0;->y:Z

    const-wide/high16 v2, -0x8000000000000000L

    .line 7
    iput-wide v2, p0, Lc/a/a/a/j2/k0;->u:J

    .line 8
    iput-wide v2, p0, Lc/a/a/a/j2/k0;->v:J

    .line 9
    iput-wide v2, p0, Lc/a/a/a/j2/k0;->w:J

    .line 10
    iput-boolean v0, p0, Lc/a/a/a/j2/k0;->x:Z

    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lc/a/a/a/j2/k0;->D:Lc/a/a/a/u0;

    if-eqz p1, :cond_0

    .line 12
    iput-object v0, p0, Lc/a/a/a/j2/k0;->B:Lc/a/a/a/u0;

    .line 13
    iput-object v0, p0, Lc/a/a/a/j2/k0;->C:Lc/a/a/a/u0;

    .line 14
    iput-boolean v1, p0, Lc/a/a/a/j2/k0;->z:Z

    :cond_0
    return-void
.end method

.method public final declared-synchronized R(JZ)Z
    .locals 8

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-direct {p0}, Lc/a/a/a/j2/k0;->Q()V

    .line 2
    iget v0, p0, Lc/a/a/a/j2/k0;->t:I

    invoke-direct {p0, v0}, Lc/a/a/a/j2/k0;->x(I)I

    move-result v2

    .line 3
    invoke-direct {p0}, Lc/a/a/a/j2/k0;->B()Z

    move-result v0

    const/4 v7, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lc/a/a/a/j2/k0;->n:[J

    aget-wide v3, v0, v2

    cmp-long v0, p1, v3

    if-ltz v0, :cond_2

    iget-wide v0, p0, Lc/a/a/a/j2/k0;->w:J

    cmp-long v3, p1, v0

    if-lez v3, :cond_0

    if-nez p3, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget p3, p0, Lc/a/a/a/j2/k0;->q:I

    iget v0, p0, Lc/a/a/a/j2/k0;->t:I

    sub-int v3, p3, v0

    const/4 v6, 0x1

    move-object v1, p0

    move-wide v4, p1

    .line 5
    invoke-direct/range {v1 .. v6}, Lc/a/a/a/j2/k0;->r(IIJZ)I

    move-result p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, -0x1

    if-ne p3, v0, :cond_1

    .line 6
    monitor-exit p0

    return v7

    .line 7
    :cond_1
    :try_start_1
    iput-wide p1, p0, Lc/a/a/a/j2/k0;->u:J

    .line 8
    iget p1, p0, Lc/a/a/a/j2/k0;->t:I

    add-int/2addr p1, p3

    iput p1, p0, Lc/a/a/a/j2/k0;->t:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 p1, 0x1

    .line 9
    monitor-exit p0

    return p1

    .line 10
    :cond_2
    :goto_0
    monitor-exit p0

    return v7

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final S(J)V
    .locals 3

    .line 1
    iget-wide v0, p0, Lc/a/a/a/j2/k0;->H:J

    cmp-long v2, v0, p1

    if-eqz v2, :cond_0

    .line 2
    iput-wide p1, p0, Lc/a/a/a/j2/k0;->H:J

    .line 3
    invoke-virtual {p0}, Lc/a/a/a/j2/k0;->C()V

    :cond_0
    return-void
.end method

.method public final T(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lc/a/a/a/j2/k0;->u:J

    return-void
.end method

.method public final V(Lc/a/a/a/j2/k0$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/j2/k0;->f:Lc/a/a/a/j2/k0$b;

    return-void
.end method

.method public final declared-synchronized W(I)V
    .locals 2

    monitor-enter p0

    if-ltz p1, :cond_0

    .line 1
    :try_start_0
    iget v0, p0, Lc/a/a/a/j2/k0;->t:I

    add-int/2addr v0, p1

    iget v1, p0, Lc/a/a/a/j2/k0;->q:I

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lc/a/a/a/m2/f;->a(Z)V

    .line 2
    iget v0, p0, Lc/a/a/a/j2/k0;->t:I

    add-int/2addr v0, p1

    iput v0, p0, Lc/a/a/a/j2/k0;->t:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public final X(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/j2/k0;->E:I

    return-void
.end method

.method public final Y()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/j2/k0;->I:Z

    return-void
.end method

.method public synthetic a(Lc/a/a/a/m2/a0;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc/a/a/a/f2/a0;->b(Lc/a/a/a/f2/b0;Lc/a/a/a/m2/a0;I)V

    return-void
.end method

.method public final b(Lcom/google/android/exoplayer2/upstream/j;IZI)I
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object p4, p0, Lc/a/a/a/j2/k0;->a:Lc/a/a/a/j2/j0;

    invoke-virtual {p4, p1, p2, p3}, Lc/a/a/a/j2/j0;->o(Lcom/google/android/exoplayer2/upstream/j;IZ)I

    move-result p1

    return p1
.end method

.method public c(JIIILc/a/a/a/f2/b0$a;)V
    .locals 11

    move-object v8, p0

    .line 1
    iget-boolean v0, v8, Lc/a/a/a/j2/k0;->A:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, v8, Lc/a/a/a/j2/k0;->B:Lc/a/a/a/u0;

    invoke-static {v0}, Lc/a/a/a/m2/f;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/u0;

    invoke-virtual {p0, v0}, Lc/a/a/a/j2/k0;->d(Lc/a/a/a/u0;)V

    :cond_0
    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 3
    :goto_0
    iget-boolean v4, v8, Lc/a/a/a/j2/k0;->y:Z

    if-eqz v4, :cond_3

    if-nez v3, :cond_2

    return-void

    .line 4
    :cond_2
    iput-boolean v1, v8, Lc/a/a/a/j2/k0;->y:Z

    .line 5
    :cond_3
    iget-wide v4, v8, Lc/a/a/a/j2/k0;->H:J

    add-long/2addr v4, p1

    .line 6
    iget-boolean v6, v8, Lc/a/a/a/j2/k0;->F:Z

    if-eqz v6, :cond_6

    .line 7
    iget-wide v6, v8, Lc/a/a/a/j2/k0;->u:J

    cmp-long v9, v4, v6

    if-gez v9, :cond_4

    return-void

    :cond_4
    if-nez v0, :cond_6

    .line 8
    iget-boolean v0, v8, Lc/a/a/a/j2/k0;->G:Z

    if-nez v0, :cond_5

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Overriding unexpected non-sync sample for format: "

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v8, Lc/a/a/a/j2/k0;->C:Lc/a/a/a/u0;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v6, "SampleQueue"

    invoke-static {v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    iput-boolean v2, v8, Lc/a/a/a/j2/k0;->G:Z

    :cond_5
    or-int/lit8 v0, p3, 0x1

    move v6, v0

    goto :goto_1

    :cond_6
    move v6, p3

    .line 11
    :goto_1
    iget-boolean v0, v8, Lc/a/a/a/j2/k0;->I:Z

    if-eqz v0, :cond_9

    if-eqz v3, :cond_8

    .line 12
    invoke-direct {p0, v4, v5}, Lc/a/a/a/j2/k0;->g(J)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_2

    .line 13
    :cond_7
    iput-boolean v1, v8, Lc/a/a/a/j2/k0;->I:Z

    goto :goto_3

    :cond_8
    :goto_2
    return-void

    .line 14
    :cond_9
    :goto_3
    iget-object v0, v8, Lc/a/a/a/j2/k0;->a:Lc/a/a/a/j2/j0;

    invoke-virtual {v0}, Lc/a/a/a/j2/j0;->e()J

    move-result-wide v0

    move v7, p4

    int-to-long v2, v7

    sub-long/2addr v0, v2

    move/from16 v2, p5

    int-to-long v2, v2

    sub-long v9, v0, v2

    move-object v0, p0

    move-wide v1, v4

    move v3, v6

    move-wide v4, v9

    move v6, p4

    move-object/from16 v7, p6

    .line 15
    invoke-direct/range {v0 .. v7}, Lc/a/a/a/j2/k0;->h(JIJILc/a/a/a/f2/b0$a;)V

    return-void
.end method

.method public final d(Lc/a/a/a/u0;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lc/a/a/a/j2/k0;->s(Lc/a/a/a/u0;)Lc/a/a/a/u0;

    move-result-object v0

    const/4 v1, 0x0

    .line 2
    iput-boolean v1, p0, Lc/a/a/a/j2/k0;->A:Z

    .line 3
    iput-object p1, p0, Lc/a/a/a/j2/k0;->B:Lc/a/a/a/u0;

    .line 4
    invoke-direct {p0, v0}, Lc/a/a/a/j2/k0;->U(Lc/a/a/a/u0;)Z

    move-result p1

    .line 5
    iget-object v1, p0, Lc/a/a/a/j2/k0;->f:Lc/a/a/a/j2/k0$b;

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    .line 6
    invoke-interface {v1, v0}, Lc/a/a/a/j2/k0$b;->m(Lc/a/a/a/u0;)V

    :cond_0
    return-void
.end method

.method public final e(Lc/a/a/a/m2/a0;II)V
    .locals 0

    .line 1
    iget-object p3, p0, Lc/a/a/a/j2/k0;->a:Lc/a/a/a/j2/j0;

    invoke-virtual {p3, p1, p2}, Lc/a/a/a/j2/j0;->p(Lc/a/a/a/m2/a0;I)V

    return-void
.end method

.method public synthetic f(Lcom/google/android/exoplayer2/upstream/j;IZ)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lc/a/a/a/f2/a0;->a(Lc/a/a/a/f2/b0;Lcom/google/android/exoplayer2/upstream/j;IZ)I

    move-result p1

    return p1
.end method

.method public final n(JZZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/k0;->a:Lc/a/a/a/j2/j0;

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lc/a/a/a/j2/k0;->k(JZZ)J

    move-result-wide p1

    .line 3
    invoke-virtual {v0, p1, p2}, Lc/a/a/a/j2/j0;->b(J)V

    return-void
.end method

.method public final o()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/k0;->a:Lc/a/a/a/j2/j0;

    invoke-direct {p0}, Lc/a/a/a/j2/k0;->l()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lc/a/a/a/j2/j0;->b(J)V

    return-void
.end method

.method public final q(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/k0;->a:Lc/a/a/a/j2/j0;

    invoke-direct {p0, p1}, Lc/a/a/a/j2/k0;->p(I)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lc/a/a/a/j2/j0;->c(J)V

    return-void
.end method

.method protected s(Lc/a/a/a/u0;)Lc/a/a/a/u0;
    .locals 5

    .line 1
    iget-wide v0, p0, Lc/a/a/a/j2/k0;->H:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-wide v0, p1, Lc/a/a/a/u0;->p:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 2
    invoke-virtual {p1}, Lc/a/a/a/u0;->l()Lc/a/a/a/u0$b;

    move-result-object v0

    iget-wide v1, p1, Lc/a/a/a/u0;->p:J

    iget-wide v3, p0, Lc/a/a/a/j2/k0;->H:J

    add-long/2addr v1, v3

    .line 3
    invoke-virtual {v0, v1, v2}, Lc/a/a/a/u0$b;->i0(J)Lc/a/a/a/u0$b;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public final declared-synchronized t()J
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-wide v0, p0, Lc/a/a/a/j2/k0;->w:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized u()J
    .locals 4

    monitor-enter p0

    .line 1
    :try_start_0
    iget-wide v0, p0, Lc/a/a/a/j2/k0;->v:J

    iget v2, p0, Lc/a/a/a/j2/k0;->t:I

    invoke-direct {p0, v2}, Lc/a/a/a/j2/k0;->v(I)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final w()I
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/j2/k0;->r:I

    iget v1, p0, Lc/a/a/a/j2/k0;->t:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final declared-synchronized y(JZ)I
    .locals 8

    monitor-enter p0

    .line 1
    :try_start_0
    iget v0, p0, Lc/a/a/a/j2/k0;->t:I

    invoke-direct {p0, v0}, Lc/a/a/a/j2/k0;->x(I)I

    move-result v2

    .line 2
    invoke-direct {p0}, Lc/a/a/a/j2/k0;->B()Z

    move-result v0

    const/4 v7, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lc/a/a/a/j2/k0;->n:[J

    aget-wide v3, v0, v2

    cmp-long v0, p1, v3

    if-gez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-wide v0, p0, Lc/a/a/a/j2/k0;->w:J

    cmp-long v3, p1, v0

    if-lez v3, :cond_1

    if-eqz p3, :cond_1

    .line 4
    iget p1, p0, Lc/a/a/a/j2/k0;->q:I

    iget p2, p0, Lc/a/a/a/j2/k0;->t:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-int/2addr p1, p2

    monitor-exit p0

    return p1

    .line 5
    :cond_1
    :try_start_1
    iget p3, p0, Lc/a/a/a/j2/k0;->q:I

    iget v0, p0, Lc/a/a/a/j2/k0;->t:I

    sub-int v3, p3, v0

    const/4 v6, 0x1

    move-object v1, p0

    move-wide v4, p1

    .line 6
    invoke-direct/range {v1 .. v6}, Lc/a/a/a/j2/k0;->r(IIJZ)I

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 p2, -0x1

    if-ne p1, p2, :cond_2

    .line 7
    monitor-exit p0

    return v7

    .line 8
    :cond_2
    monitor-exit p0

    return p1

    .line 9
    :cond_3
    :goto_0
    monitor-exit p0

    return v7

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized z()Lc/a/a/a/u0;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lc/a/a/a/j2/k0;->z:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lc/a/a/a/j2/k0;->C:Lc/a/a/a/u0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
