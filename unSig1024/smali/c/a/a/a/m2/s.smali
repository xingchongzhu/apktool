.class public final Lc/a/a/a/m2/s;
.super Ljava/lang/Object;
.source "ListenerSet.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/m2/s$c;,
        Lc/a/a/a/m2/s$b;,
        Lc/a/a/a/m2/s$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "E:",
        "Lc/a/a/a/m2/x;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lc/a/a/a/m2/g;

.field private final b:Lc/a/a/a/m2/q;

.field private final c:Lc/a/b/a/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/a/k<",
            "TE;>;"
        }
    .end annotation
.end field

.field private final d:Lc/a/a/a/m2/s$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/a/a/m2/s$b<",
            "TT;TE;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lc/a/a/a/m2/s$c<",
            "TT;TE;>;>;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private h:Z


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lc/a/a/a/m2/g;Lc/a/b/a/k;Lc/a/a/a/m2/s$b;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Looper;",
            "Lc/a/a/a/m2/g;",
            "Lc/a/b/a/k<",
            "TE;>;",
            "Lc/a/a/a/m2/s$b<",
            "TT;TE;>;)V"
        }
    .end annotation

    .line 1
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lc/a/a/a/m2/s;-><init>(Ljava/util/concurrent/CopyOnWriteArraySet;Landroid/os/Looper;Lc/a/a/a/m2/g;Lc/a/b/a/k;Lc/a/a/a/m2/s$b;)V

    return-void
.end method

.method private constructor <init>(Ljava/util/concurrent/CopyOnWriteArraySet;Landroid/os/Looper;Lc/a/a/a/m2/g;Lc/a/b/a/k;Lc/a/a/a/m2/s$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lc/a/a/a/m2/s$c<",
            "TT;TE;>;>;",
            "Landroid/os/Looper;",
            "Lc/a/a/a/m2/g;",
            "Lc/a/b/a/k<",
            "TE;>;",
            "Lc/a/a/a/m2/s$b<",
            "TT;TE;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p3, p0, Lc/a/a/a/m2/s;->a:Lc/a/a/a/m2/g;

    .line 4
    iput-object p1, p0, Lc/a/a/a/m2/s;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    iput-object p4, p0, Lc/a/a/a/m2/s;->c:Lc/a/b/a/k;

    .line 6
    iput-object p5, p0, Lc/a/a/a/m2/s;->d:Lc/a/a/a/m2/s$b;

    .line 7
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lc/a/a/a/m2/s;->f:Ljava/util/ArrayDeque;

    .line 8
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lc/a/a/a/m2/s;->g:Ljava/util/ArrayDeque;

    .line 9
    new-instance p1, Lc/a/a/a/m2/b;

    invoke-direct {p1, p0}, Lc/a/a/a/m2/b;-><init>(Lc/a/a/a/m2/s;)V

    invoke-interface {p3, p2, p1}, Lc/a/a/a/m2/g;->b(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lc/a/a/a/m2/q;

    move-result-object p1

    .line 10
    iput-object p1, p0, Lc/a/a/a/m2/s;->b:Lc/a/a/a/m2/q;

    return-void
.end method

.method private d(Landroid/os/Message;)Z
    .locals 4

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-nez v0, :cond_1

    .line 2
    iget-object p1, p0, Lc/a/a/a/m2/s;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/m2/s$c;

    .line 3
    iget-object v2, p0, Lc/a/a/a/m2/s;->c:Lc/a/b/a/k;

    iget-object v3, p0, Lc/a/a/a/m2/s;->d:Lc/a/a/a/m2/s$b;

    invoke-virtual {v0, v2, v3}, Lc/a/a/a/m2/s$c;->b(Lc/a/b/a/k;Lc/a/a/a/m2/s$b;)V

    .line 4
    iget-object v0, p0, Lc/a/a/a/m2/s;->b:Lc/a/a/a/m2/q;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Lc/a/a/a/m2/q;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_1
    if-ne v0, v1, :cond_2

    .line 5
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lc/a/a/a/m2/s$a;

    .line 7
    invoke-virtual {p0, v0, p1}, Lc/a/a/a/m2/s;->k(ILc/a/a/a/m2/s$a;)V

    .line 8
    invoke-virtual {p0}, Lc/a/a/a/m2/s;->i()V

    :cond_2
    :goto_0
    return v1
.end method

.method public static synthetic e(Lc/a/a/a/m2/s;Landroid/os/Message;)Z
    .locals 0

    invoke-direct {p0, p1}, Lc/a/a/a/m2/s;->d(Landroid/os/Message;)Z

    move-result p0

    return p0
.end method

.method static synthetic f(Ljava/util/concurrent/CopyOnWriteArraySet;ILc/a/a/a/m2/s$a;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/m2/s$c;

    .line 2
    invoke-virtual {v0, p1, p2}, Lc/a/a/a/m2/s$c;->a(ILc/a/a/a/m2/s$a;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/m2/s;->h:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v0, p0, Lc/a/a/a/m2/s;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v1, Lc/a/a/a/m2/s$c;

    iget-object v2, p0, Lc/a/a/a/m2/s;->c:Lc/a/b/a/k;

    invoke-direct {v1, p1, v2}, Lc/a/a/a/m2/s$c;-><init>(Ljava/lang/Object;Lc/a/b/a/k;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(Landroid/os/Looper;Lc/a/a/a/m2/s$b;)Lc/a/a/a/m2/s;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Looper;",
            "Lc/a/a/a/m2/s$b<",
            "TT;TE;>;)",
            "Lc/a/a/a/m2/s<",
            "TT;TE;>;"
        }
    .end annotation

    .line 1
    new-instance v6, Lc/a/a/a/m2/s;

    iget-object v1, p0, Lc/a/a/a/m2/s;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    iget-object v3, p0, Lc/a/a/a/m2/s;->a:Lc/a/a/a/m2/g;

    iget-object v4, p0, Lc/a/a/a/m2/s;->c:Lc/a/b/a/k;

    move-object v0, v6

    move-object v2, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lc/a/a/a/m2/s;-><init>(Ljava/util/concurrent/CopyOnWriteArraySet;Landroid/os/Looper;Lc/a/a/a/m2/g;Lc/a/b/a/k;Lc/a/a/a/m2/s$b;)V

    return-object v6
.end method

.method public c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/m2/s;->g:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lc/a/a/a/m2/s;->b:Lc/a/a/a/m2/q;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lc/a/a/a/m2/q;->a(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Lc/a/a/a/m2/s;->b:Lc/a/a/a/m2/q;

    invoke-interface {v0, v1}, Lc/a/a/a/m2/q;->j(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 4
    :cond_1
    iget-object v0, p0, Lc/a/a/a/m2/s;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .line 5
    iget-object v1, p0, Lc/a/a/a/m2/s;->f:Ljava/util/ArrayDeque;

    iget-object v2, p0, Lc/a/a/a/m2/s;->g:Ljava/util/ArrayDeque;

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->addAll(Ljava/util/Collection;)Z

    .line 6
    iget-object v1, p0, Lc/a/a/a/m2/s;->g:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    if-eqz v0, :cond_2

    return-void

    .line 7
    :cond_2
    :goto_0
    iget-object v0, p0, Lc/a/a/a/m2/s;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 8
    iget-object v0, p0, Lc/a/a/a/m2/s;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 9
    iget-object v0, p0, Lc/a/a/a/m2/s;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    goto :goto_0

    :cond_3
    return-void
.end method

.method public g(ILc/a/a/a/m2/s$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lc/a/a/a/m2/s$a<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/m2/s;->b:Lc/a/a/a/m2/q;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, p1, v2, p2}, Lc/a/a/a/m2/q;->d(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public h(ILc/a/a/a/m2/s$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lc/a/a/a/m2/s$a<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    iget-object v1, p0, Lc/a/a/a/m2/s;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>(Ljava/util/Collection;)V

    .line 2
    iget-object v1, p0, Lc/a/a/a/m2/s;->g:Ljava/util/ArrayDeque;

    new-instance v2, Lc/a/a/a/m2/a;

    invoke-direct {v2, v0, p1, p2}, Lc/a/a/a/m2/a;-><init>(Ljava/util/concurrent/CopyOnWriteArraySet;ILc/a/a/a/m2/s$a;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public i()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/m2/s;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/m2/s$c;

    .line 2
    iget-object v2, p0, Lc/a/a/a/m2/s;->d:Lc/a/a/a/m2/s$b;

    invoke-virtual {v1, v2}, Lc/a/a/a/m2/s$c;->c(Lc/a/a/a/m2/s$b;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/a/a/a/m2/s;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lc/a/a/a/m2/s;->h:Z

    return-void
.end method

.method public j(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/m2/s;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/m2/s$c;

    .line 2
    iget-object v2, v1, Lc/a/a/a/m2/s$c;->a:Ljava/lang/Object;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    iget-object v2, p0, Lc/a/a/a/m2/s;->d:Lc/a/a/a/m2/s$b;

    invoke-virtual {v1, v2}, Lc/a/a/a/m2/s$c;->c(Lc/a/a/a/m2/s$b;)V

    .line 4
    iget-object v2, p0, Lc/a/a/a/m2/s;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public k(ILc/a/a/a/m2/s$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lc/a/a/a/m2/s$a<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lc/a/a/a/m2/s;->h(ILc/a/a/a/m2/s$a;)V

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/m2/s;->c()V

    return-void
.end method
