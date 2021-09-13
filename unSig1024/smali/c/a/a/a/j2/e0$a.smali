.class public Lc/a/a/a/j2/e0$a;
.super Ljava/lang/Object;
.source "MediaSourceEventListener.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/j2/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/j2/e0$a$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Lc/a/a/a/j2/d0$a;

.field private final c:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lc/a/a/a/j2/e0$a$a;",
            ">;"
        }
    .end annotation
.end field

.field private final d:J


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lc/a/a/a/j2/e0$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILc/a/a/a/j2/d0$a;J)V

    return-void
.end method

.method private constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILc/a/a/a/j2/d0$a;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lc/a/a/a/j2/e0$a$a;",
            ">;I",
            "Lc/a/a/a/j2/d0$a;",
            "J)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lc/a/a/a/j2/e0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    iput p2, p0, Lc/a/a/a/j2/e0$a;->a:I

    .line 5
    iput-object p3, p0, Lc/a/a/a/j2/e0$a;->b:Lc/a/a/a/j2/d0$a;

    .line 6
    iput-wide p4, p0, Lc/a/a/a/j2/e0$a;->d:J

    return-void
.end method

.method private b(J)J
    .locals 3

    .line 1
    invoke-static {p1, p2}, Lc/a/a/a/i0;->d(J)J

    move-result-wide p1

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-wide v0, p0, Lc/a/a/a/j2/e0$a;->d:J

    add-long/2addr v0, p1

    :goto_0
    return-wide v0
.end method

.method private synthetic e(Lc/a/a/a/j2/e0;Lc/a/a/a/j2/z;)V
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/j2/e0$a;->a:I

    iget-object v1, p0, Lc/a/a/a/j2/e0$a;->b:Lc/a/a/a/j2/d0$a;

    invoke-interface {p1, v0, v1, p2}, Lc/a/a/a/j2/e0;->s(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/z;)V

    return-void
.end method

.method private synthetic g(Lc/a/a/a/j2/e0;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/j2/e0$a;->a:I

    iget-object v1, p0, Lc/a/a/a/j2/e0$a;->b:Lc/a/a/a/j2/d0$a;

    invoke-interface {p1, v0, v1, p2, p3}, Lc/a/a/a/j2/e0;->t(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    return-void
.end method

.method private synthetic i(Lc/a/a/a/j2/e0;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/j2/e0$a;->a:I

    iget-object v1, p0, Lc/a/a/a/j2/e0$a;->b:Lc/a/a/a/j2/d0$a;

    invoke-interface {p1, v0, v1, p2, p3}, Lc/a/a/a/j2/e0;->I(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    return-void
.end method

.method private synthetic k(Lc/a/a/a/j2/e0;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Ljava/io/IOException;Z)V
    .locals 7

    .line 1
    iget v1, p0, Lc/a/a/a/j2/e0$a;->a:I

    iget-object v2, p0, Lc/a/a/a/j2/e0$a;->b:Lc/a/a/a/j2/d0$a;

    move-object v0, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-interface/range {v0 .. v6}, Lc/a/a/a/j2/e0;->V(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Ljava/io/IOException;Z)V

    return-void
.end method

.method private synthetic m(Lc/a/a/a/j2/e0;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/j2/e0$a;->a:I

    iget-object v1, p0, Lc/a/a/a/j2/e0$a;->b:Lc/a/a/a/j2/d0$a;

    invoke-interface {p1, v0, v1, p2, p3}, Lc/a/a/a/j2/e0;->F(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    return-void
.end method

.method private synthetic o(Lc/a/a/a/j2/e0;Lc/a/a/a/j2/d0$a;Lc/a/a/a/j2/z;)V
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/j2/e0$a;->a:I

    invoke-interface {p1, v0, p2, p3}, Lc/a/a/a/j2/e0;->v(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/z;)V

    return-void
.end method


# virtual methods
.method public A(Lc/a/a/a/j2/w;IILc/a/a/a/u0;ILjava/lang/Object;JJ)V
    .locals 12

    move-object v0, p0

    .line 1
    new-instance v11, Lc/a/a/a/j2/z;

    move-wide/from16 v1, p7

    .line 2
    invoke-direct {p0, v1, v2}, Lc/a/a/a/j2/e0$a;->b(J)J

    move-result-wide v7

    move-wide/from16 v1, p9

    .line 3
    invoke-direct {p0, v1, v2}, Lc/a/a/a/j2/e0$a;->b(J)J

    move-result-wide v9

    move-object v1, v11

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v10}, Lc/a/a/a/j2/z;-><init>(IILc/a/a/a/u0;ILjava/lang/Object;JJ)V

    move-object v1, p1

    .line 4
    invoke-virtual {p0, p1, v11}, Lc/a/a/a/j2/e0$a;->B(Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    return-void
.end method

.method public B(Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/e0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/j2/e0$a$a;

    .line 2
    iget-object v2, v1, Lc/a/a/a/j2/e0$a$a;->b:Lc/a/a/a/j2/e0;

    .line 3
    iget-object v1, v1, Lc/a/a/a/j2/e0$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lc/a/a/a/j2/f;

    invoke-direct {v3, p0, v2, p1, p2}, Lc/a/a/a/j2/f;-><init>(Lc/a/a/a/j2/e0$a;Lc/a/a/a/j2/e0;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    invoke-static {v1, v3}, Lc/a/a/a/m2/m0;->y0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public C(Lc/a/a/a/j2/e0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/e0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/j2/e0$a$a;

    .line 2
    iget-object v2, v1, Lc/a/a/a/j2/e0$a$a;->b:Lc/a/a/a/j2/e0;

    if-ne v2, p1, :cond_0

    .line 3
    iget-object v2, p0, Lc/a/a/a/j2/e0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public D(IJJ)V
    .locals 12

    move-object v0, p0

    .line 1
    new-instance v11, Lc/a/a/a/j2/z;

    move-wide v1, p2

    .line 2
    invoke-direct {p0, p2, p3}, Lc/a/a/a/j2/e0$a;->b(J)J

    move-result-wide v7

    move-wide/from16 v1, p4

    .line 3
    invoke-direct {p0, v1, v2}, Lc/a/a/a/j2/e0$a;->b(J)J

    move-result-wide v9

    const/4 v2, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v1, v11

    move v3, p1

    invoke-direct/range {v1 .. v10}, Lc/a/a/a/j2/z;-><init>(IILc/a/a/a/u0;ILjava/lang/Object;JJ)V

    .line 4
    invoke-virtual {p0, v11}, Lc/a/a/a/j2/e0$a;->E(Lc/a/a/a/j2/z;)V

    return-void
.end method

.method public E(Lc/a/a/a/j2/z;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/e0$a;->b:Lc/a/a/a/j2/d0$a;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/j2/d0$a;

    .line 2
    iget-object v1, p0, Lc/a/a/a/j2/e0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/a/a/a/j2/e0$a$a;

    .line 3
    iget-object v3, v2, Lc/a/a/a/j2/e0$a$a;->b:Lc/a/a/a/j2/e0;

    .line 4
    iget-object v2, v2, Lc/a/a/a/j2/e0$a$a;->a:Landroid/os/Handler;

    new-instance v4, Lc/a/a/a/j2/b;

    invoke-direct {v4, p0, v3, v0, p1}, Lc/a/a/a/j2/b;-><init>(Lc/a/a/a/j2/e0$a;Lc/a/a/a/j2/e0;Lc/a/a/a/j2/d0$a;Lc/a/a/a/j2/z;)V

    invoke-static {v2, v4}, Lc/a/a/a/m2/m0;->y0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public F(ILc/a/a/a/j2/d0$a;J)Lc/a/a/a/j2/e0$a;
    .locals 7

    .line 1
    new-instance v6, Lc/a/a/a/j2/e0$a;

    iget-object v1, p0, Lc/a/a/a/j2/e0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    move-object v0, v6

    move v2, p1

    move-object v3, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Lc/a/a/a/j2/e0$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILc/a/a/a/j2/d0$a;J)V

    return-object v6
.end method

.method public a(Landroid/os/Handler;Lc/a/a/a/j2/e0;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {p2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v0, p0, Lc/a/a/a/j2/e0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Lc/a/a/a/j2/e0$a$a;

    invoke-direct {v1, p1, p2}, Lc/a/a/a/j2/e0$a$a;-><init>(Landroid/os/Handler;Lc/a/a/a/j2/e0;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public c(ILc/a/a/a/u0;ILjava/lang/Object;J)V
    .locals 12

    move-object v0, p0

    .line 1
    new-instance v11, Lc/a/a/a/j2/z;

    move-wide/from16 v1, p5

    .line 2
    invoke-direct {p0, v1, v2}, Lc/a/a/a/j2/e0$a;->b(J)J

    move-result-wide v7

    const/4 v2, 0x1

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v1, v11

    move v3, p1

    move-object v4, p2

    move v5, p3

    move-object/from16 v6, p4

    invoke-direct/range {v1 .. v10}, Lc/a/a/a/j2/z;-><init>(IILc/a/a/a/u0;ILjava/lang/Object;JJ)V

    .line 3
    invoke-virtual {p0, v11}, Lc/a/a/a/j2/e0$a;->d(Lc/a/a/a/j2/z;)V

    return-void
.end method

.method public d(Lc/a/a/a/j2/z;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/e0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/j2/e0$a$a;

    .line 2
    iget-object v2, v1, Lc/a/a/a/j2/e0$a$a;->b:Lc/a/a/a/j2/e0;

    .line 3
    iget-object v1, v1, Lc/a/a/a/j2/e0$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lc/a/a/a/j2/e;

    invoke-direct {v3, p0, v2, p1}, Lc/a/a/a/j2/e;-><init>(Lc/a/a/a/j2/e0$a;Lc/a/a/a/j2/e0;Lc/a/a/a/j2/z;)V

    invoke-static {v1, v3}, Lc/a/a/a/m2/m0;->y0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public synthetic f(Lc/a/a/a/j2/e0;Lc/a/a/a/j2/z;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lc/a/a/a/j2/e0$a;->e(Lc/a/a/a/j2/e0;Lc/a/a/a/j2/z;)V

    return-void
.end method

.method public synthetic h(Lc/a/a/a/j2/e0;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lc/a/a/a/j2/e0$a;->g(Lc/a/a/a/j2/e0;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    return-void
.end method

.method public synthetic j(Lc/a/a/a/j2/e0;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lc/a/a/a/j2/e0$a;->i(Lc/a/a/a/j2/e0;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    return-void
.end method

.method public synthetic l(Lc/a/a/a/j2/e0;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lc/a/a/a/j2/e0$a;->k(Lc/a/a/a/j2/e0;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Ljava/io/IOException;Z)V

    return-void
.end method

.method public synthetic n(Lc/a/a/a/j2/e0;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lc/a/a/a/j2/e0$a;->m(Lc/a/a/a/j2/e0;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    return-void
.end method

.method public synthetic p(Lc/a/a/a/j2/e0;Lc/a/a/a/j2/d0$a;Lc/a/a/a/j2/z;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lc/a/a/a/j2/e0$a;->o(Lc/a/a/a/j2/e0;Lc/a/a/a/j2/d0$a;Lc/a/a/a/j2/z;)V

    return-void
.end method

.method public q(Lc/a/a/a/j2/w;I)V
    .locals 11

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    .line 1
    invoke-virtual/range {v0 .. v10}, Lc/a/a/a/j2/e0$a;->r(Lc/a/a/a/j2/w;IILc/a/a/a/u0;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public r(Lc/a/a/a/j2/w;IILc/a/a/a/u0;ILjava/lang/Object;JJ)V
    .locals 12

    move-object v0, p0

    .line 1
    new-instance v11, Lc/a/a/a/j2/z;

    move-wide/from16 v1, p7

    .line 2
    invoke-direct {p0, v1, v2}, Lc/a/a/a/j2/e0$a;->b(J)J

    move-result-wide v7

    move-wide/from16 v1, p9

    .line 3
    invoke-direct {p0, v1, v2}, Lc/a/a/a/j2/e0$a;->b(J)J

    move-result-wide v9

    move-object v1, v11

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v10}, Lc/a/a/a/j2/z;-><init>(IILc/a/a/a/u0;ILjava/lang/Object;JJ)V

    move-object v1, p1

    .line 4
    invoke-virtual {p0, p1, v11}, Lc/a/a/a/j2/e0$a;->s(Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    return-void
.end method

.method public s(Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/e0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/j2/e0$a$a;

    .line 2
    iget-object v2, v1, Lc/a/a/a/j2/e0$a$a;->b:Lc/a/a/a/j2/e0;

    .line 3
    iget-object v1, v1, Lc/a/a/a/j2/e0$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lc/a/a/a/j2/g;

    invoke-direct {v3, p0, v2, p1, p2}, Lc/a/a/a/j2/g;-><init>(Lc/a/a/a/j2/e0$a;Lc/a/a/a/j2/e0;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    invoke-static {v1, v3}, Lc/a/a/a/m2/m0;->y0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public t(Lc/a/a/a/j2/w;I)V
    .locals 11

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    .line 1
    invoke-virtual/range {v0 .. v10}, Lc/a/a/a/j2/e0$a;->u(Lc/a/a/a/j2/w;IILc/a/a/a/u0;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public u(Lc/a/a/a/j2/w;IILc/a/a/a/u0;ILjava/lang/Object;JJ)V
    .locals 12

    move-object v0, p0

    .line 1
    new-instance v11, Lc/a/a/a/j2/z;

    move-wide/from16 v1, p7

    .line 2
    invoke-direct {p0, v1, v2}, Lc/a/a/a/j2/e0$a;->b(J)J

    move-result-wide v7

    move-wide/from16 v1, p9

    .line 3
    invoke-direct {p0, v1, v2}, Lc/a/a/a/j2/e0$a;->b(J)J

    move-result-wide v9

    move-object v1, v11

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v10}, Lc/a/a/a/j2/z;-><init>(IILc/a/a/a/u0;ILjava/lang/Object;JJ)V

    move-object v1, p1

    .line 4
    invoke-virtual {p0, p1, v11}, Lc/a/a/a/j2/e0$a;->v(Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    return-void
.end method

.method public v(Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/e0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/j2/e0$a$a;

    .line 2
    iget-object v2, v1, Lc/a/a/a/j2/e0$a$a;->b:Lc/a/a/a/j2/e0;

    .line 3
    iget-object v1, v1, Lc/a/a/a/j2/e0$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lc/a/a/a/j2/d;

    invoke-direct {v3, p0, v2, p1, p2}, Lc/a/a/a/j2/d;-><init>(Lc/a/a/a/j2/e0$a;Lc/a/a/a/j2/e0;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    invoke-static {v1, v3}, Lc/a/a/a/m2/m0;->y0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public w(Lc/a/a/a/j2/w;IILc/a/a/a/u0;ILjava/lang/Object;JJLjava/io/IOException;Z)V
    .locals 12

    move-object v0, p0

    .line 1
    new-instance v11, Lc/a/a/a/j2/z;

    move-wide/from16 v1, p7

    .line 2
    invoke-direct {p0, v1, v2}, Lc/a/a/a/j2/e0$a;->b(J)J

    move-result-wide v7

    move-wide/from16 v1, p9

    .line 3
    invoke-direct {p0, v1, v2}, Lc/a/a/a/j2/e0$a;->b(J)J

    move-result-wide v9

    move-object v1, v11

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v10}, Lc/a/a/a/j2/z;-><init>(IILc/a/a/a/u0;ILjava/lang/Object;JJ)V

    move-object v1, p1

    move-object/from16 v2, p11

    move/from16 v3, p12

    .line 4
    invoke-virtual {p0, p1, v11, v2, v3}, Lc/a/a/a/j2/e0$a;->y(Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Ljava/io/IOException;Z)V

    return-void
.end method

.method public x(Lc/a/a/a/j2/w;ILjava/io/IOException;Z)V
    .locals 13

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object/from16 v11, p3

    move/from16 v12, p4

    .line 1
    invoke-virtual/range {v0 .. v12}, Lc/a/a/a/j2/e0$a;->w(Lc/a/a/a/j2/w;IILc/a/a/a/u0;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    return-void
.end method

.method public y(Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Ljava/io/IOException;Z)V
    .locals 10

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/e0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/j2/e0$a$a;

    .line 2
    iget-object v4, v1, Lc/a/a/a/j2/e0$a$a;->b:Lc/a/a/a/j2/e0;

    .line 3
    iget-object v1, v1, Lc/a/a/a/j2/e0$a$a;->a:Landroid/os/Handler;

    new-instance v9, Lc/a/a/a/j2/c;

    move-object v2, v9

    move-object v3, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move v8, p4

    invoke-direct/range {v2 .. v8}, Lc/a/a/a/j2/c;-><init>(Lc/a/a/a/j2/e0$a;Lc/a/a/a/j2/e0;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Ljava/io/IOException;Z)V

    invoke-static {v1, v9}, Lc/a/a/a/m2/m0;->y0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public z(Lc/a/a/a/j2/w;I)V
    .locals 11

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    .line 1
    invoke-virtual/range {v0 .. v10}, Lc/a/a/a/j2/e0$a;->A(Lc/a/a/a/j2/w;IILc/a/a/a/u0;ILjava/lang/Object;JJ)V

    return-void
.end method
