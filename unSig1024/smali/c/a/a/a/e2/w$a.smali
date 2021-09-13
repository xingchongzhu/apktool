.class public Lc/a/a/a/e2/w$a;
.super Ljava/lang/Object;
.source "DrmSessionEventListener.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/e2/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/e2/w$a$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Lc/a/a/a/j2/d0$a;

.field private final c:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lc/a/a/a/e2/w$a$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lc/a/a/a/e2/w$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILc/a/a/a/j2/d0$a;)V

    return-void
.end method

.method private constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILc/a/a/a/j2/d0$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lc/a/a/a/e2/w$a$a;",
            ">;I",
            "Lc/a/a/a/j2/d0$a;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lc/a/a/a/e2/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    iput p2, p0, Lc/a/a/a/e2/w$a;->a:I

    .line 5
    iput-object p3, p0, Lc/a/a/a/e2/w$a;->b:Lc/a/a/a/j2/d0$a;

    return-void
.end method

.method private synthetic h(Lc/a/a/a/e2/w;)V
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/e2/w$a;->a:I

    iget-object v1, p0, Lc/a/a/a/e2/w$a;->b:Lc/a/a/a/j2/d0$a;

    invoke-interface {p1, v0, v1}, Lc/a/a/a/e2/w;->E(ILc/a/a/a/j2/d0$a;)V

    return-void
.end method

.method private synthetic j(Lc/a/a/a/e2/w;)V
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/e2/w$a;->a:I

    iget-object v1, p0, Lc/a/a/a/e2/w$a;->b:Lc/a/a/a/j2/d0$a;

    invoke-interface {p1, v0, v1}, Lc/a/a/a/e2/w;->k(ILc/a/a/a/j2/d0$a;)V

    return-void
.end method

.method private synthetic l(Lc/a/a/a/e2/w;)V
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/e2/w$a;->a:I

    iget-object v1, p0, Lc/a/a/a/e2/w$a;->b:Lc/a/a/a/j2/d0$a;

    invoke-interface {p1, v0, v1}, Lc/a/a/a/e2/w;->Y(ILc/a/a/a/j2/d0$a;)V

    return-void
.end method

.method private synthetic n(Lc/a/a/a/e2/w;)V
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/e2/w$a;->a:I

    iget-object v1, p0, Lc/a/a/a/e2/w$a;->b:Lc/a/a/a/j2/d0$a;

    invoke-interface {p1, v0, v1}, Lc/a/a/a/e2/w;->y(ILc/a/a/a/j2/d0$a;)V

    return-void
.end method

.method private synthetic p(Lc/a/a/a/e2/w;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/e2/w$a;->a:I

    iget-object v1, p0, Lc/a/a/a/e2/w$a;->b:Lc/a/a/a/j2/d0$a;

    invoke-interface {p1, v0, v1, p2}, Lc/a/a/a/e2/w;->C(ILc/a/a/a/j2/d0$a;Ljava/lang/Exception;)V

    return-void
.end method

.method private synthetic r(Lc/a/a/a/e2/w;)V
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/e2/w$a;->a:I

    iget-object v1, p0, Lc/a/a/a/e2/w$a;->b:Lc/a/a/a/j2/d0$a;

    invoke-interface {p1, v0, v1}, Lc/a/a/a/e2/w;->Q(ILc/a/a/a/j2/d0$a;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Handler;Lc/a/a/a/e2/w;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {p2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v0, p0, Lc/a/a/a/e2/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Lc/a/a/a/e2/w$a$a;

    invoke-direct {v1, p1, p2}, Lc/a/a/a/e2/w$a$a;-><init>(Landroid/os/Handler;Lc/a/a/a/e2/w;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/e2/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/e2/w$a$a;

    .line 2
    iget-object v2, v1, Lc/a/a/a/e2/w$a$a;->b:Lc/a/a/a/e2/w;

    .line 3
    iget-object v1, v1, Lc/a/a/a/e2/w$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lc/a/a/a/e2/h;

    invoke-direct {v3, p0, v2}, Lc/a/a/a/e2/h;-><init>(Lc/a/a/a/e2/w$a;Lc/a/a/a/e2/w;)V

    invoke-static {v1, v3}, Lc/a/a/a/m2/m0;->y0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c()V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/e2/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/e2/w$a$a;

    .line 2
    iget-object v2, v1, Lc/a/a/a/e2/w$a$a;->b:Lc/a/a/a/e2/w;

    .line 3
    iget-object v1, v1, Lc/a/a/a/e2/w$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lc/a/a/a/e2/g;

    invoke-direct {v3, p0, v2}, Lc/a/a/a/e2/g;-><init>(Lc/a/a/a/e2/w$a;Lc/a/a/a/e2/w;)V

    invoke-static {v1, v3}, Lc/a/a/a/m2/m0;->y0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public d()V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/e2/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/e2/w$a$a;

    .line 2
    iget-object v2, v1, Lc/a/a/a/e2/w$a$a;->b:Lc/a/a/a/e2/w;

    .line 3
    iget-object v1, v1, Lc/a/a/a/e2/w$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lc/a/a/a/e2/i;

    invoke-direct {v3, p0, v2}, Lc/a/a/a/e2/i;-><init>(Lc/a/a/a/e2/w$a;Lc/a/a/a/e2/w;)V

    invoke-static {v1, v3}, Lc/a/a/a/m2/m0;->y0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e()V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/e2/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/e2/w$a$a;

    .line 2
    iget-object v2, v1, Lc/a/a/a/e2/w$a$a;->b:Lc/a/a/a/e2/w;

    .line 3
    iget-object v1, v1, Lc/a/a/a/e2/w$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lc/a/a/a/e2/e;

    invoke-direct {v3, p0, v2}, Lc/a/a/a/e2/e;-><init>(Lc/a/a/a/e2/w$a;Lc/a/a/a/e2/w;)V

    invoke-static {v1, v3}, Lc/a/a/a/m2/m0;->y0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public f(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/e2/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/e2/w$a$a;

    .line 2
    iget-object v2, v1, Lc/a/a/a/e2/w$a$a;->b:Lc/a/a/a/e2/w;

    .line 3
    iget-object v1, v1, Lc/a/a/a/e2/w$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lc/a/a/a/e2/j;

    invoke-direct {v3, p0, v2, p1}, Lc/a/a/a/e2/j;-><init>(Lc/a/a/a/e2/w$a;Lc/a/a/a/e2/w;Ljava/lang/Exception;)V

    invoke-static {v1, v3}, Lc/a/a/a/m2/m0;->y0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public g()V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/e2/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/e2/w$a$a;

    .line 2
    iget-object v2, v1, Lc/a/a/a/e2/w$a$a;->b:Lc/a/a/a/e2/w;

    .line 3
    iget-object v1, v1, Lc/a/a/a/e2/w$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lc/a/a/a/e2/f;

    invoke-direct {v3, p0, v2}, Lc/a/a/a/e2/f;-><init>(Lc/a/a/a/e2/w$a;Lc/a/a/a/e2/w;)V

    invoke-static {v1, v3}, Lc/a/a/a/m2/m0;->y0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public synthetic i(Lc/a/a/a/e2/w;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/a/a/a/e2/w$a;->h(Lc/a/a/a/e2/w;)V

    return-void
.end method

.method public synthetic k(Lc/a/a/a/e2/w;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/a/a/a/e2/w$a;->j(Lc/a/a/a/e2/w;)V

    return-void
.end method

.method public synthetic m(Lc/a/a/a/e2/w;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/a/a/a/e2/w$a;->l(Lc/a/a/a/e2/w;)V

    return-void
.end method

.method public synthetic o(Lc/a/a/a/e2/w;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/a/a/a/e2/w$a;->n(Lc/a/a/a/e2/w;)V

    return-void
.end method

.method public synthetic q(Lc/a/a/a/e2/w;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lc/a/a/a/e2/w$a;->p(Lc/a/a/a/e2/w;Ljava/lang/Exception;)V

    return-void
.end method

.method public synthetic s(Lc/a/a/a/e2/w;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/a/a/a/e2/w$a;->r(Lc/a/a/a/e2/w;)V

    return-void
.end method

.method public t(ILc/a/a/a/j2/d0$a;)Lc/a/a/a/e2/w$a;
    .locals 2

    .line 1
    new-instance v0, Lc/a/a/a/e2/w$a;

    iget-object v1, p0, Lc/a/a/a/e2/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0, v1, p1, p2}, Lc/a/a/a/e2/w$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILc/a/a/a/j2/d0$a;)V

    return-object v0
.end method
