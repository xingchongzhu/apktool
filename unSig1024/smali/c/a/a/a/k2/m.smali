.class public final Lc/a/a/a/k2/m;
.super Lc/a/a/a/h0;
.source "TextRenderer.java"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field private A:J

.field private final m:Landroid/os/Handler;

.field private final n:Lc/a/a/a/k2/l;

.field private final o:Lc/a/a/a/k2/i;

.field private final p:Lc/a/a/a/v0;

.field private q:Z

.field private r:Z

.field private s:Z

.field private t:I

.field private u:Lc/a/a/a/u0;

.field private v:Lc/a/a/a/k2/g;

.field private w:Lc/a/a/a/k2/j;

.field private x:Lc/a/a/a/k2/k;

.field private y:Lc/a/a/a/k2/k;

.field private z:I


# direct methods
.method public constructor <init>(Lc/a/a/a/k2/l;Landroid/os/Looper;)V
    .locals 1

    .line 1
    sget-object v0, Lc/a/a/a/k2/i;->a:Lc/a/a/a/k2/i;

    invoke-direct {p0, p1, p2, v0}, Lc/a/a/a/k2/m;-><init>(Lc/a/a/a/k2/l;Landroid/os/Looper;Lc/a/a/a/k2/i;)V

    return-void
.end method

.method public constructor <init>(Lc/a/a/a/k2/l;Landroid/os/Looper;Lc/a/a/a/k2/i;)V
    .locals 1

    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0}, Lc/a/a/a/h0;-><init>(I)V

    .line 3
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/k2/l;

    iput-object p1, p0, Lc/a/a/a/k2/m;->n:Lc/a/a/a/k2/l;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p2, p0}, Lc/a/a/a/m2/m0;->u(Landroid/os/Looper;Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lc/a/a/a/k2/m;->m:Landroid/os/Handler;

    .line 5
    iput-object p3, p0, Lc/a/a/a/k2/m;->o:Lc/a/a/a/k2/i;

    .line 6
    new-instance p1, Lc/a/a/a/v0;

    invoke-direct {p1}, Lc/a/a/a/v0;-><init>()V

    iput-object p1, p0, Lc/a/a/a/k2/m;->p:Lc/a/a/a/v0;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    iput-wide p1, p0, Lc/a/a/a/k2/m;->A:J

    return-void
.end method

.method private O()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lc/a/a/a/k2/m;->X(Ljava/util/List;)V

    return-void
.end method

.method private P()J
    .locals 4

    .line 1
    iget v0, p0, Lc/a/a/a/k2/m;->z:I

    const-wide v1, 0x7fffffffffffffffL

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    return-wide v1

    .line 2
    :cond_0
    iget-object v0, p0, Lc/a/a/a/k2/m;->x:Lc/a/a/a/k2/k;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget v0, p0, Lc/a/a/a/k2/m;->z:I

    iget-object v3, p0, Lc/a/a/a/k2/m;->x:Lc/a/a/a/k2/k;

    invoke-virtual {v3}, Lc/a/a/a/k2/k;->d()I

    move-result v3

    if-lt v0, v3, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lc/a/a/a/k2/m;->x:Lc/a/a/a/k2/k;

    iget v1, p0, Lc/a/a/a/k2/m;->z:I

    invoke-virtual {v0, v1}, Lc/a/a/a/k2/k;->b(I)J

    move-result-wide v1

    :goto_0
    return-wide v1
.end method

.method private Q(Lc/a/a/a/k2/h;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Subtitle decoding failed. streamFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc/a/a/a/k2/m;->u:Lc/a/a/a/u0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TextRenderer"

    invoke-static {v1, v0, p1}, Lc/a/a/a/m2/t;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2
    invoke-direct {p0}, Lc/a/a/a/k2/m;->O()V

    .line 3
    invoke-direct {p0}, Lc/a/a/a/k2/m;->V()V

    return-void
.end method

.method private R()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/k2/m;->s:Z

    .line 2
    iget-object v0, p0, Lc/a/a/a/k2/m;->o:Lc/a/a/a/k2/i;

    iget-object v1, p0, Lc/a/a/a/k2/m;->u:Lc/a/a/a/u0;

    invoke-static {v1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/u0;

    invoke-interface {v0, v1}, Lc/a/a/a/k2/i;->b(Lc/a/a/a/u0;)Lc/a/a/a/k2/g;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/k2/m;->v:Lc/a/a/a/k2/g;

    return-void
.end method

.method private S(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/a/a/a/k2/c;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/m;->n:Lc/a/a/a/k2/l;

    invoke-interface {v0, p1}, Lc/a/a/a/k2/l;->t(Ljava/util/List;)V

    return-void
.end method

.method private T()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lc/a/a/a/k2/m;->w:Lc/a/a/a/k2/j;

    const/4 v1, -0x1

    .line 2
    iput v1, p0, Lc/a/a/a/k2/m;->z:I

    .line 3
    iget-object v1, p0, Lc/a/a/a/k2/m;->x:Lc/a/a/a/k2/k;

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v1}, Lc/a/a/a/c2/h;->n()V

    .line 5
    iput-object v0, p0, Lc/a/a/a/k2/m;->x:Lc/a/a/a/k2/k;

    .line 6
    :cond_0
    iget-object v1, p0, Lc/a/a/a/k2/m;->y:Lc/a/a/a/k2/k;

    if-eqz v1, :cond_1

    .line 7
    invoke-virtual {v1}, Lc/a/a/a/c2/h;->n()V

    .line 8
    iput-object v0, p0, Lc/a/a/a/k2/m;->y:Lc/a/a/a/k2/k;

    :cond_1
    return-void
.end method

.method private U()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/k2/m;->T()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/k2/m;->v:Lc/a/a/a/k2/g;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/k2/g;

    invoke-interface {v0}, Lc/a/a/a/c2/c;->a()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lc/a/a/a/k2/m;->v:Lc/a/a/a/k2/g;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lc/a/a/a/k2/m;->t:I

    return-void
.end method

.method private V()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/a/a/a/k2/m;->U()V

    .line 2
    invoke-direct {p0}, Lc/a/a/a/k2/m;->R()V

    return-void
.end method

.method private X(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/a/a/a/k2/c;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/m;->m:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Lc/a/a/a/k2/m;->S(Ljava/util/List;)V

    :goto_0
    return-void
.end method


# virtual methods
.method protected F()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lc/a/a/a/k2/m;->u:Lc/a/a/a/u0;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    iput-wide v0, p0, Lc/a/a/a/k2/m;->A:J

    .line 3
    invoke-direct {p0}, Lc/a/a/a/k2/m;->O()V

    .line 4
    invoke-direct {p0}, Lc/a/a/a/k2/m;->U()V

    return-void
.end method

.method protected H(JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/a/a/a/k2/m;->O()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lc/a/a/a/k2/m;->q:Z

    .line 3
    iput-boolean p1, p0, Lc/a/a/a/k2/m;->r:Z

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    iput-wide p1, p0, Lc/a/a/a/k2/m;->A:J

    .line 5
    iget p1, p0, Lc/a/a/a/k2/m;->t:I

    if-eqz p1, :cond_0

    .line 6
    invoke-direct {p0}, Lc/a/a/a/k2/m;->V()V

    goto :goto_0

    .line 7
    :cond_0
    invoke-direct {p0}, Lc/a/a/a/k2/m;->T()V

    .line 8
    iget-object p1, p0, Lc/a/a/a/k2/m;->v:Lc/a/a/a/k2/g;

    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/k2/g;

    invoke-interface {p1}, Lc/a/a/a/c2/c;->flush()V

    :goto_0
    return-void
.end method

.method protected L([Lc/a/a/a/u0;JJ)V
    .locals 0

    const/4 p2, 0x0

    .line 1
    aget-object p1, p1, p2

    iput-object p1, p0, Lc/a/a/a/k2/m;->u:Lc/a/a/a/u0;

    .line 2
    iget-object p1, p0, Lc/a/a/a/k2/m;->v:Lc/a/a/a/k2/g;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 3
    iput p1, p0, Lc/a/a/a/k2/m;->t:I

    goto :goto_0

    .line 4
    :cond_0
    invoke-direct {p0}, Lc/a/a/a/k2/m;->R()V

    :goto_0
    return-void
.end method

.method public W(J)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/h0;->t()Z

    move-result v0

    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    iput-wide p1, p0, Lc/a/a/a/k2/m;->A:J

    return-void
.end method

.method public a(Lc/a/a/a/u0;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/m;->o:Lc/a/a/a/k2/i;

    invoke-interface {v0, p1}, Lc/a/a/a/k2/i;->a(Lc/a/a/a/u0;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object p1, p1, Lc/a/a/a/u0;->G:Ljava/lang/Class;

    if-nez p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    .line 3
    :goto_0
    invoke-static {p1}, Lc/a/a/a/q1;->a(I)I

    move-result p1

    return p1

    .line 4
    :cond_1
    iget-object p1, p1, Lc/a/a/a/u0;->l:Ljava/lang/String;

    invoke-static {p1}, Lc/a/a/a/m2/w;->p(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    .line 5
    invoke-static {p1}, Lc/a/a/a/q1;->a(I)I

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x0

    .line 6
    invoke-static {p1}, Lc/a/a/a/q1;->a(I)I

    move-result p1

    return p1
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/k2/m;->r:Z

    return v0
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "TextRenderer"

    return-object v0
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 1

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_0

    .line 2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-direct {p0, p1}, Lc/a/a/a/k2/m;->S(Ljava/util/List;)V

    const/4 p1, 0x1

    return p1

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public l(JJ)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/h0;->t()Z

    move-result p3

    const/4 p4, 0x1

    if-eqz p3, :cond_0

    iget-wide v0, p0, Lc/a/a/a/k2/m;->A:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, v0, v2

    if-eqz p3, :cond_0

    cmp-long p3, p1, v0

    if-ltz p3, :cond_0

    .line 2
    invoke-direct {p0}, Lc/a/a/a/k2/m;->T()V

    .line 3
    iput-boolean p4, p0, Lc/a/a/a/k2/m;->r:Z

    .line 4
    :cond_0
    iget-boolean p3, p0, Lc/a/a/a/k2/m;->r:Z

    if-eqz p3, :cond_1

    return-void

    .line 5
    :cond_1
    iget-object p3, p0, Lc/a/a/a/k2/m;->y:Lc/a/a/a/k2/k;

    if-nez p3, :cond_2

    .line 6
    iget-object p3, p0, Lc/a/a/a/k2/m;->v:Lc/a/a/a/k2/g;

    invoke-static {p3}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lc/a/a/a/k2/g;

    invoke-interface {p3, p1, p2}, Lc/a/a/a/k2/g;->b(J)V

    .line 7
    :try_start_0
    iget-object p3, p0, Lc/a/a/a/k2/m;->v:Lc/a/a/a/k2/g;

    invoke-static {p3}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lc/a/a/a/k2/g;

    invoke-interface {p3}, Lc/a/a/a/c2/c;->d()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lc/a/a/a/k2/k;

    iput-object p3, p0, Lc/a/a/a/k2/m;->y:Lc/a/a/a/k2/k;
    :try_end_0
    .catch Lc/a/a/a/k2/h; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 8
    invoke-direct {p0, p1}, Lc/a/a/a/k2/m;->Q(Lc/a/a/a/k2/h;)V

    return-void

    .line 9
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lc/a/a/a/h0;->getState()I

    move-result p3

    const/4 v0, 0x2

    if-eq p3, v0, :cond_3

    return-void

    .line 10
    :cond_3
    iget-object p3, p0, Lc/a/a/a/k2/m;->x:Lc/a/a/a/k2/k;

    const/4 v1, 0x0

    if-eqz p3, :cond_4

    .line 11
    invoke-direct {p0}, Lc/a/a/a/k2/m;->P()J

    move-result-wide v2

    const/4 p3, 0x0

    :goto_1
    cmp-long v4, v2, p1

    if-gtz v4, :cond_5

    .line 12
    iget p3, p0, Lc/a/a/a/k2/m;->z:I

    add-int/2addr p3, p4

    iput p3, p0, Lc/a/a/a/k2/m;->z:I

    .line 13
    invoke-direct {p0}, Lc/a/a/a/k2/m;->P()J

    move-result-wide v2

    const/4 p3, 0x1

    goto :goto_1

    :cond_4
    const/4 p3, 0x0

    .line 14
    :cond_5
    iget-object v2, p0, Lc/a/a/a/k2/m;->y:Lc/a/a/a/k2/k;

    const/4 v3, 0x0

    if-eqz v2, :cond_9

    .line 15
    invoke-virtual {v2}, Lc/a/a/a/c2/a;->k()Z

    move-result v4

    if-eqz v4, :cond_7

    if-nez p3, :cond_9

    .line 16
    invoke-direct {p0}, Lc/a/a/a/k2/m;->P()J

    move-result-wide v4

    const-wide v6, 0x7fffffffffffffffL

    cmp-long v2, v4, v6

    if-nez v2, :cond_9

    .line 17
    iget v2, p0, Lc/a/a/a/k2/m;->t:I

    if-ne v2, v0, :cond_6

    .line 18
    invoke-direct {p0}, Lc/a/a/a/k2/m;->V()V

    goto :goto_2

    .line 19
    :cond_6
    invoke-direct {p0}, Lc/a/a/a/k2/m;->T()V

    .line 20
    iput-boolean p4, p0, Lc/a/a/a/k2/m;->r:Z

    goto :goto_2

    .line 21
    :cond_7
    iget-wide v4, v2, Lc/a/a/a/c2/h;->b:J

    cmp-long v6, v4, p1

    if-gtz v6, :cond_9

    .line 22
    iget-object p3, p0, Lc/a/a/a/k2/m;->x:Lc/a/a/a/k2/k;

    if-eqz p3, :cond_8

    .line 23
    invoke-virtual {p3}, Lc/a/a/a/c2/h;->n()V

    .line 24
    :cond_8
    invoke-virtual {v2, p1, p2}, Lc/a/a/a/k2/k;->a(J)I

    move-result p3

    iput p3, p0, Lc/a/a/a/k2/m;->z:I

    .line 25
    iput-object v2, p0, Lc/a/a/a/k2/m;->x:Lc/a/a/a/k2/k;

    .line 26
    iput-object v3, p0, Lc/a/a/a/k2/m;->y:Lc/a/a/a/k2/k;

    const/4 p3, 0x1

    :cond_9
    :goto_2
    if-eqz p3, :cond_a

    .line 27
    iget-object p3, p0, Lc/a/a/a/k2/m;->x:Lc/a/a/a/k2/k;

    invoke-static {p3}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    iget-object p3, p0, Lc/a/a/a/k2/m;->x:Lc/a/a/a/k2/k;

    invoke-virtual {p3, p1, p2}, Lc/a/a/a/k2/k;->c(J)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lc/a/a/a/k2/m;->X(Ljava/util/List;)V

    .line 29
    :cond_a
    iget p1, p0, Lc/a/a/a/k2/m;->t:I

    if-ne p1, v0, :cond_b

    return-void

    .line 30
    :cond_b
    :goto_3
    :try_start_1
    iget-boolean p1, p0, Lc/a/a/a/k2/m;->q:Z

    if-nez p1, :cond_13

    .line 31
    iget-object p1, p0, Lc/a/a/a/k2/m;->w:Lc/a/a/a/k2/j;

    if-nez p1, :cond_d

    .line 32
    iget-object p1, p0, Lc/a/a/a/k2/m;->v:Lc/a/a/a/k2/g;

    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/k2/g;

    invoke-interface {p1}, Lc/a/a/a/c2/c;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/k2/j;

    if-nez p1, :cond_c

    return-void

    .line 33
    :cond_c
    iput-object p1, p0, Lc/a/a/a/k2/m;->w:Lc/a/a/a/k2/j;

    .line 34
    :cond_d
    iget p2, p0, Lc/a/a/a/k2/m;->t:I

    if-ne p2, p4, :cond_e

    const/4 p2, 0x4

    .line 35
    invoke-virtual {p1, p2}, Lc/a/a/a/c2/a;->m(I)V

    .line 36
    iget-object p2, p0, Lc/a/a/a/k2/m;->v:Lc/a/a/a/k2/g;

    invoke-static {p2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc/a/a/a/k2/g;

    invoke-interface {p2, p1}, Lc/a/a/a/c2/c;->c(Ljava/lang/Object;)V

    .line 37
    iput-object v3, p0, Lc/a/a/a/k2/m;->w:Lc/a/a/a/k2/j;

    .line 38
    iput v0, p0, Lc/a/a/a/k2/m;->t:I

    return-void

    .line 39
    :cond_e
    iget-object p2, p0, Lc/a/a/a/k2/m;->p:Lc/a/a/a/v0;

    invoke-virtual {p0, p2, p1, v1}, Lc/a/a/a/h0;->M(Lc/a/a/a/v0;Lc/a/a/a/c2/f;Z)I

    move-result p2

    const/4 p3, -0x4

    if-ne p2, p3, :cond_12

    .line 40
    invoke-virtual {p1}, Lc/a/a/a/c2/a;->k()Z

    move-result p2

    if-eqz p2, :cond_f

    .line 41
    iput-boolean p4, p0, Lc/a/a/a/k2/m;->q:Z

    .line 42
    iput-boolean v1, p0, Lc/a/a/a/k2/m;->s:Z

    goto :goto_5

    .line 43
    :cond_f
    iget-object p2, p0, Lc/a/a/a/k2/m;->p:Lc/a/a/a/v0;

    iget-object p2, p2, Lc/a/a/a/v0;->b:Lc/a/a/a/u0;

    if-nez p2, :cond_10

    return-void

    .line 44
    :cond_10
    iget-wide p2, p2, Lc/a/a/a/u0;->p:J

    iput-wide p2, p1, Lc/a/a/a/k2/j;->i:J

    .line 45
    invoke-virtual {p1}, Lc/a/a/a/c2/f;->p()V

    .line 46
    iget-boolean p2, p0, Lc/a/a/a/k2/m;->s:Z

    invoke-virtual {p1}, Lc/a/a/a/c2/a;->l()Z

    move-result p3

    if-nez p3, :cond_11

    const/4 p3, 0x1

    goto :goto_4

    :cond_11
    const/4 p3, 0x0

    :goto_4
    and-int/2addr p2, p3

    iput-boolean p2, p0, Lc/a/a/a/k2/m;->s:Z

    .line 47
    :goto_5
    iget-boolean p2, p0, Lc/a/a/a/k2/m;->s:Z

    if-nez p2, :cond_b

    .line 48
    iget-object p2, p0, Lc/a/a/a/k2/m;->v:Lc/a/a/a/k2/g;

    invoke-static {p2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc/a/a/a/k2/g;

    invoke-interface {p2, p1}, Lc/a/a/a/c2/c;->c(Ljava/lang/Object;)V

    .line 49
    iput-object v3, p0, Lc/a/a/a/k2/m;->w:Lc/a/a/a/k2/j;
    :try_end_1
    .catch Lc/a/a/a/k2/h; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :cond_12
    const/4 p1, -0x3

    if-ne p2, p1, :cond_b

    return-void

    :catch_1
    move-exception p1

    .line 50
    invoke-direct {p0, p1}, Lc/a/a/a/k2/m;->Q(Lc/a/a/a/k2/h;)V

    :cond_13
    return-void
.end method
