.class public abstract Lc/a/a/a/j2/k;
.super Ljava/lang/Object;
.source "BaseMediaSource.java"

# interfaces
.implements Lc/a/a/a/j2/d0;


# instance fields
.field private final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/a/a/a/j2/d0$b;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lc/a/a/a/j2/d0$b;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lc/a/a/a/j2/e0$a;

.field private final d:Lc/a/a/a/e2/w$a;

.field private e:Landroid/os/Looper;

.field private f:Lc/a/a/a/x1;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lc/a/a/a/j2/k;->a:Ljava/util/ArrayList;

    .line 3
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    iput-object v0, p0, Lc/a/a/a/j2/k;->b:Ljava/util/HashSet;

    .line 4
    new-instance v0, Lc/a/a/a/j2/e0$a;

    invoke-direct {v0}, Lc/a/a/a/j2/e0$a;-><init>()V

    iput-object v0, p0, Lc/a/a/a/j2/k;->c:Lc/a/a/a/j2/e0$a;

    .line 5
    new-instance v0, Lc/a/a/a/e2/w$a;

    invoke-direct {v0}, Lc/a/a/a/e2/w$a;-><init>()V

    iput-object v0, p0, Lc/a/a/a/j2/k;->d:Lc/a/a/a/e2/w$a;

    return-void
.end method


# virtual methods
.method public final b(Landroid/os/Handler;Lc/a/a/a/e2/w;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {p2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v0, p0, Lc/a/a/a/j2/k;->d:Lc/a/a/a/e2/w$a;

    invoke-virtual {v0, p1, p2}, Lc/a/a/a/e2/w$a;->a(Landroid/os/Handler;Lc/a/a/a/e2/w;)V

    return-void
.end method

.method public synthetic e()Z
    .locals 1

    invoke-static {p0}, Lc/a/a/a/j2/c0;->b(Lc/a/a/a/j2/d0;)Z

    move-result v0

    return v0
.end method

.method public synthetic g()Lc/a/a/a/x1;
    .locals 1

    invoke-static {p0}, Lc/a/a/a/j2/c0;->a(Lc/a/a/a/j2/d0;)Lc/a/a/a/x1;

    move-result-object v0

    return-object v0
.end method

.method public final h(Lc/a/a/a/j2/d0$b;Lcom/google/android/exoplayer2/upstream/e0;)V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lc/a/a/a/j2/k;->e:Landroid/os/Looper;

    if-eqz v1, :cond_1

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Lc/a/a/a/m2/f;->a(Z)V

    .line 3
    iget-object v1, p0, Lc/a/a/a/j2/k;->f:Lc/a/a/a/x1;

    .line 4
    iget-object v2, p0, Lc/a/a/a/j2/k;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object v2, p0, Lc/a/a/a/j2/k;->e:Landroid/os/Looper;

    if-nez v2, :cond_2

    .line 6
    iput-object v0, p0, Lc/a/a/a/j2/k;->e:Landroid/os/Looper;

    .line 7
    iget-object v0, p0, Lc/a/a/a/j2/k;->b:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 8
    invoke-virtual {p0, p2}, Lc/a/a/a/j2/k;->w(Lcom/google/android/exoplayer2/upstream/e0;)V

    goto :goto_2

    :cond_2
    if-eqz v1, :cond_3

    .line 9
    invoke-virtual {p0, p1}, Lc/a/a/a/j2/k;->i(Lc/a/a/a/j2/d0$b;)V

    .line 10
    invoke-interface {p1, p0, v1}, Lc/a/a/a/j2/d0$b;->a(Lc/a/a/a/j2/d0;Lc/a/a/a/x1;)V

    :cond_3
    :goto_2
    return-void
.end method

.method public final i(Lc/a/a/a/j2/d0$b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/k;->e:Landroid/os/Looper;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lc/a/a/a/j2/k;->b:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    .line 3
    iget-object v1, p0, Lc/a/a/a/j2/k;->b:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p0}, Lc/a/a/a/j2/k;->u()V

    :cond_0
    return-void
.end method

.method public final j(Lc/a/a/a/j2/d0$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/k;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 2
    iget-object v0, p0, Lc/a/a/a/j2/k;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lc/a/a/a/j2/k;->e:Landroid/os/Looper;

    .line 4
    iput-object p1, p0, Lc/a/a/a/j2/k;->f:Lc/a/a/a/x1;

    .line 5
    iget-object p1, p0, Lc/a/a/a/j2/k;->b:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->clear()V

    .line 6
    invoke-virtual {p0}, Lc/a/a/a/j2/k;->y()V

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0, p1}, Lc/a/a/a/j2/k;->n(Lc/a/a/a/j2/d0$b;)V

    :goto_0
    return-void
.end method

.method public final l(Landroid/os/Handler;Lc/a/a/a/j2/e0;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {p2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v0, p0, Lc/a/a/a/j2/k;->c:Lc/a/a/a/j2/e0$a;

    invoke-virtual {v0, p1, p2}, Lc/a/a/a/j2/e0$a;->a(Landroid/os/Handler;Lc/a/a/a/j2/e0;)V

    return-void
.end method

.method public final m(Lc/a/a/a/j2/e0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/k;->c:Lc/a/a/a/j2/e0$a;

    invoke-virtual {v0, p1}, Lc/a/a/a/j2/e0$a;->C(Lc/a/a/a/j2/e0;)V

    return-void
.end method

.method public final n(Lc/a/a/a/j2/d0$b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/k;->b:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .line 2
    iget-object v1, p0, Lc/a/a/a/j2/k;->b:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    if-eqz v0, :cond_0

    .line 3
    iget-object p1, p0, Lc/a/a/a/j2/k;->b:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p0}, Lc/a/a/a/j2/k;->t()V

    :cond_0
    return-void
.end method

.method protected final p(ILc/a/a/a/j2/d0$a;)Lc/a/a/a/e2/w$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/k;->d:Lc/a/a/a/e2/w$a;

    invoke-virtual {v0, p1, p2}, Lc/a/a/a/e2/w$a;->t(ILc/a/a/a/j2/d0$a;)Lc/a/a/a/e2/w$a;

    move-result-object p1

    return-object p1
.end method

.method protected final q(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/e2/w$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/k;->d:Lc/a/a/a/e2/w$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lc/a/a/a/e2/w$a;->t(ILc/a/a/a/j2/d0$a;)Lc/a/a/a/e2/w$a;

    move-result-object p1

    return-object p1
.end method

.method protected final r(ILc/a/a/a/j2/d0$a;J)Lc/a/a/a/j2/e0$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/k;->c:Lc/a/a/a/j2/e0$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Lc/a/a/a/j2/e0$a;->F(ILc/a/a/a/j2/d0$a;J)Lc/a/a/a/j2/e0$a;

    move-result-object p1

    return-object p1
.end method

.method protected final s(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/j2/e0$a;
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/k;->c:Lc/a/a/a/j2/e0$a;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, p1, v2, v3}, Lc/a/a/a/j2/e0$a;->F(ILc/a/a/a/j2/d0$a;J)Lc/a/a/a/j2/e0$a;

    move-result-object p1

    return-object p1
.end method

.method protected t()V
    .locals 0

    return-void
.end method

.method protected u()V
    .locals 0

    return-void
.end method

.method protected final v()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/k;->b:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method protected abstract w(Lcom/google/android/exoplayer2/upstream/e0;)V
.end method

.method protected final x(Lc/a/a/a/x1;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lc/a/a/a/j2/k;->f:Lc/a/a/a/x1;

    .line 2
    iget-object v0, p0, Lc/a/a/a/j2/k;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/j2/d0$b;

    .line 3
    invoke-interface {v1, p0, p1}, Lc/a/a/a/j2/d0$b;->a(Lc/a/a/a/j2/d0;Lc/a/a/a/x1;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected abstract y()V
.end method
