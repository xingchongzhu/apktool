.class public final Lc/a/a/a/h2/g;
.super Lc/a/a/a/h0;
.source "MetadataRenderer.java"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field private final m:Lc/a/a/a/h2/d;

.field private final n:Lc/a/a/a/h2/f;

.field private final o:Landroid/os/Handler;

.field private final p:Lc/a/a/a/h2/e;

.field private final q:[Lc/a/a/a/h2/a;

.field private final r:[J

.field private s:I

.field private t:I

.field private u:Lc/a/a/a/h2/c;

.field private v:Z

.field private w:Z

.field private x:J


# direct methods
.method public constructor <init>(Lc/a/a/a/h2/f;Landroid/os/Looper;)V
    .locals 1

    .line 1
    sget-object v0, Lc/a/a/a/h2/d;->a:Lc/a/a/a/h2/d;

    invoke-direct {p0, p1, p2, v0}, Lc/a/a/a/h2/g;-><init>(Lc/a/a/a/h2/f;Landroid/os/Looper;Lc/a/a/a/h2/d;)V

    return-void
.end method

.method public constructor <init>(Lc/a/a/a/h2/f;Landroid/os/Looper;Lc/a/a/a/h2/d;)V
    .locals 1

    const/4 v0, 0x5

    .line 2
    invoke-direct {p0, v0}, Lc/a/a/a/h0;-><init>(I)V

    .line 3
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/h2/f;

    iput-object p1, p0, Lc/a/a/a/h2/g;->n:Lc/a/a/a/h2/f;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p2, p0}, Lc/a/a/a/m2/m0;->u(Landroid/os/Looper;Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lc/a/a/a/h2/g;->o:Landroid/os/Handler;

    .line 5
    invoke-static {p3}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/h2/d;

    iput-object p1, p0, Lc/a/a/a/h2/g;->m:Lc/a/a/a/h2/d;

    .line 6
    new-instance p1, Lc/a/a/a/h2/e;

    invoke-direct {p1}, Lc/a/a/a/h2/e;-><init>()V

    iput-object p1, p0, Lc/a/a/a/h2/g;->p:Lc/a/a/a/h2/e;

    new-array p1, v0, [Lc/a/a/a/h2/a;

    .line 7
    iput-object p1, p0, Lc/a/a/a/h2/g;->q:[Lc/a/a/a/h2/a;

    new-array p1, v0, [J

    .line 8
    iput-object p1, p0, Lc/a/a/a/h2/g;->r:[J

    return-void
.end method

.method private O(Lc/a/a/a/h2/a;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/h2/a;",
            "Ljava/util/List<",
            "Lc/a/a/a/h2/a$b;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    :goto_0
    invoke-virtual {p1}, Lc/a/a/a/h2/a;->o()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 2
    invoke-virtual {p1, v0}, Lc/a/a/a/h2/a;->n(I)Lc/a/a/a/h2/a$b;

    move-result-object v1

    invoke-interface {v1}, Lc/a/a/a/h2/a$b;->f()Lc/a/a/a/u0;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v2, p0, Lc/a/a/a/h2/g;->m:Lc/a/a/a/h2/d;

    invoke-interface {v2, v1}, Lc/a/a/a/h2/d;->a(Lc/a/a/a/u0;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    iget-object v2, p0, Lc/a/a/a/h2/g;->m:Lc/a/a/a/h2/d;

    .line 5
    invoke-interface {v2, v1}, Lc/a/a/a/h2/d;->b(Lc/a/a/a/u0;)Lc/a/a/a/h2/c;

    move-result-object v1

    .line 6
    invoke-virtual {p1, v0}, Lc/a/a/a/h2/a;->n(I)Lc/a/a/a/h2/a$b;

    move-result-object v2

    invoke-interface {v2}, Lc/a/a/a/h2/a$b;->i()[B

    move-result-object v2

    invoke-static {v2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    .line 7
    iget-object v3, p0, Lc/a/a/a/h2/g;->p:Lc/a/a/a/h2/e;

    invoke-virtual {v3}, Lc/a/a/a/c2/f;->f()V

    .line 8
    iget-object v3, p0, Lc/a/a/a/h2/g;->p:Lc/a/a/a/h2/e;

    array-length v4, v2

    invoke-virtual {v3, v4}, Lc/a/a/a/c2/f;->o(I)V

    .line 9
    iget-object v3, p0, Lc/a/a/a/h2/g;->p:Lc/a/a/a/h2/e;

    iget-object v3, v3, Lc/a/a/a/c2/f;->c:Ljava/nio/ByteBuffer;

    invoke-static {v3}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 10
    iget-object v2, p0, Lc/a/a/a/h2/g;->p:Lc/a/a/a/h2/e;

    invoke-virtual {v2}, Lc/a/a/a/c2/f;->p()V

    .line 11
    iget-object v2, p0, Lc/a/a/a/h2/g;->p:Lc/a/a/a/h2/e;

    invoke-interface {v1, v2}, Lc/a/a/a/h2/c;->a(Lc/a/a/a/h2/e;)Lc/a/a/a/h2/a;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 12
    invoke-direct {p0, v1, p2}, Lc/a/a/a/h2/g;->O(Lc/a/a/a/h2/a;Ljava/util/List;)V

    goto :goto_1

    .line 13
    :cond_0
    invoke-virtual {p1, v0}, Lc/a/a/a/h2/a;->n(I)Lc/a/a/a/h2/a$b;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private P()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/h2/g;->q:[Lc/a/a/a/h2/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lc/a/a/a/h2/g;->s:I

    .line 3
    iput v0, p0, Lc/a/a/a/h2/g;->t:I

    return-void
.end method

.method private Q(Lc/a/a/a/h2/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/h2/g;->o:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Lc/a/a/a/h2/g;->R(Lc/a/a/a/h2/a;)V

    :goto_0
    return-void
.end method

.method private R(Lc/a/a/a/h2/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/h2/g;->n:Lc/a/a/a/h2/f;

    invoke-interface {v0, p1}, Lc/a/a/a/h2/f;->y(Lc/a/a/a/h2/a;)V

    return-void
.end method


# virtual methods
.method protected F()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/h2/g;->P()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lc/a/a/a/h2/g;->u:Lc/a/a/a/h2/c;

    return-void
.end method

.method protected H(JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/a/a/a/h2/g;->P()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lc/a/a/a/h2/g;->v:Z

    .line 3
    iput-boolean p1, p0, Lc/a/a/a/h2/g;->w:Z

    return-void
.end method

.method protected L([Lc/a/a/a/u0;JJ)V
    .locals 0

    .line 1
    iget-object p2, p0, Lc/a/a/a/h2/g;->m:Lc/a/a/a/h2/d;

    const/4 p3, 0x0

    aget-object p1, p1, p3

    invoke-interface {p2, p1}, Lc/a/a/a/h2/d;->b(Lc/a/a/a/u0;)Lc/a/a/a/h2/c;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/h2/g;->u:Lc/a/a/a/h2/c;

    return-void
.end method

.method public a(Lc/a/a/a/u0;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/h2/g;->m:Lc/a/a/a/h2/d;

    invoke-interface {v0, p1}, Lc/a/a/a/h2/d;->a(Lc/a/a/a/u0;)Z

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

    :cond_1
    const/4 p1, 0x0

    .line 4
    invoke-static {p1}, Lc/a/a/a/q1;->a(I)I

    move-result p1

    return p1
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/h2/g;->w:Z

    return v0
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "MetadataRenderer"

    return-object v0
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 1

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_0

    .line 2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lc/a/a/a/h2/a;

    invoke-direct {p0, p1}, Lc/a/a/a/h2/g;->R(Lc/a/a/a/h2/a;)V

    const/4 p1, 0x1

    return p1

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public l(JJ)V
    .locals 5

    .line 1
    iget-boolean p3, p0, Lc/a/a/a/h2/g;->v:Z

    const/4 p4, 0x5

    const/4 v0, 0x1

    if-nez p3, :cond_2

    iget p3, p0, Lc/a/a/a/h2/g;->t:I

    if-ge p3, p4, :cond_2

    .line 2
    iget-object p3, p0, Lc/a/a/a/h2/g;->p:Lc/a/a/a/h2/e;

    invoke-virtual {p3}, Lc/a/a/a/c2/f;->f()V

    .line 3
    invoke-virtual {p0}, Lc/a/a/a/h0;->B()Lc/a/a/a/v0;

    move-result-object p3

    .line 4
    iget-object v1, p0, Lc/a/a/a/h2/g;->p:Lc/a/a/a/h2/e;

    const/4 v2, 0x0

    invoke-virtual {p0, p3, v1, v2}, Lc/a/a/a/h0;->M(Lc/a/a/a/v0;Lc/a/a/a/c2/f;Z)I

    move-result v1

    const/4 v2, -0x4

    if-ne v1, v2, :cond_1

    .line 5
    iget-object p3, p0, Lc/a/a/a/h2/g;->p:Lc/a/a/a/h2/e;

    invoke-virtual {p3}, Lc/a/a/a/c2/a;->k()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 6
    iput-boolean v0, p0, Lc/a/a/a/h2/g;->v:Z

    goto :goto_0

    .line 7
    :cond_0
    iget-object p3, p0, Lc/a/a/a/h2/g;->p:Lc/a/a/a/h2/e;

    iget-wide v1, p0, Lc/a/a/a/h2/g;->x:J

    iput-wide v1, p3, Lc/a/a/a/h2/e;->i:J

    .line 8
    invoke-virtual {p3}, Lc/a/a/a/c2/f;->p()V

    .line 9
    iget-object p3, p0, Lc/a/a/a/h2/g;->u:Lc/a/a/a/h2/c;

    invoke-static {p3}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lc/a/a/a/h2/c;

    iget-object v1, p0, Lc/a/a/a/h2/g;->p:Lc/a/a/a/h2/e;

    invoke-interface {p3, v1}, Lc/a/a/a/h2/c;->a(Lc/a/a/a/h2/e;)Lc/a/a/a/h2/a;

    move-result-object p3

    if-eqz p3, :cond_2

    .line 10
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p3}, Lc/a/a/a/h2/a;->o()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    invoke-direct {p0, p3, v1}, Lc/a/a/a/h2/g;->O(Lc/a/a/a/h2/a;Ljava/util/List;)V

    .line 12
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_2

    .line 13
    new-instance p3, Lc/a/a/a/h2/a;

    invoke-direct {p3, v1}, Lc/a/a/a/h2/a;-><init>(Ljava/util/List;)V

    .line 14
    iget v1, p0, Lc/a/a/a/h2/g;->s:I

    iget v2, p0, Lc/a/a/a/h2/g;->t:I

    add-int/2addr v1, v2

    rem-int/2addr v1, p4

    .line 15
    iget-object v3, p0, Lc/a/a/a/h2/g;->q:[Lc/a/a/a/h2/a;

    aput-object p3, v3, v1

    .line 16
    iget-object p3, p0, Lc/a/a/a/h2/g;->r:[J

    iget-object v3, p0, Lc/a/a/a/h2/g;->p:Lc/a/a/a/h2/e;

    iget-wide v3, v3, Lc/a/a/a/c2/f;->e:J

    aput-wide v3, p3, v1

    add-int/2addr v2, v0

    .line 17
    iput v2, p0, Lc/a/a/a/h2/g;->t:I

    goto :goto_0

    :cond_1
    const/4 v2, -0x5

    if-ne v1, v2, :cond_2

    .line 18
    iget-object p3, p3, Lc/a/a/a/v0;->b:Lc/a/a/a/u0;

    invoke-static {p3}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lc/a/a/a/u0;

    iget-wide v1, p3, Lc/a/a/a/u0;->p:J

    iput-wide v1, p0, Lc/a/a/a/h2/g;->x:J

    .line 19
    :cond_2
    :goto_0
    iget p3, p0, Lc/a/a/a/h2/g;->t:I

    if-lez p3, :cond_3

    iget-object p3, p0, Lc/a/a/a/h2/g;->r:[J

    iget v1, p0, Lc/a/a/a/h2/g;->s:I

    aget-wide v2, p3, v1

    cmp-long p3, v2, p1

    if-gtz p3, :cond_3

    .line 20
    iget-object p1, p0, Lc/a/a/a/h2/g;->q:[Lc/a/a/a/h2/a;

    aget-object p1, p1, v1

    invoke-static {p1}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/h2/a;

    .line 21
    invoke-direct {p0, p1}, Lc/a/a/a/h2/g;->Q(Lc/a/a/a/h2/a;)V

    .line 22
    iget-object p1, p0, Lc/a/a/a/h2/g;->q:[Lc/a/a/a/h2/a;

    iget p2, p0, Lc/a/a/a/h2/g;->s:I

    const/4 p3, 0x0

    aput-object p3, p1, p2

    add-int/2addr p2, v0

    .line 23
    rem-int/2addr p2, p4

    iput p2, p0, Lc/a/a/a/h2/g;->s:I

    .line 24
    iget p1, p0, Lc/a/a/a/h2/g;->t:I

    sub-int/2addr p1, v0

    iput p1, p0, Lc/a/a/a/h2/g;->t:I

    .line 25
    :cond_3
    iget-boolean p1, p0, Lc/a/a/a/h2/g;->v:Z

    if-eqz p1, :cond_4

    iget p1, p0, Lc/a/a/a/h2/g;->t:I

    if-nez p1, :cond_4

    .line 26
    iput-boolean v0, p0, Lc/a/a/a/h2/g;->w:Z

    :cond_4
    return-void
.end method
