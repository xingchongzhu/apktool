.class public abstract Lcom/tv91/q/b/d;
.super Ljava/lang/Object;
.source "ObservableUseCase.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<OBSERVER:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Runnable;

.field private static final b:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field protected c:Ljava/lang/Runnable;

.field protected d:Ljava/lang/Runnable;

.field protected e:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Lcom/tv91/s/c;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/tv91/t/b;

.field private final g:Ljava/lang/Object;

.field private final h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "TOBSERVER;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/tv91/q/b/c;->a:Lcom/tv91/q/b/c;

    sput-object v0, Lcom/tv91/q/b/d;->a:Ljava/lang/Runnable;

    .line 2
    sget-object v0, Lcom/tv91/q/b/b;->a:Lcom/tv91/q/b/b;

    sput-object v0, Lcom/tv91/q/b/d;->b:Lb/g/j/a;

    return-void
.end method

.method protected constructor <init>(Lcom/tv91/t/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lcom/tv91/q/b/d;->c()Ljava/lang/Runnable;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/q/b/d;->c:Ljava/lang/Runnable;

    .line 3
    invoke-static {}, Lcom/tv91/q/b/d;->c()Ljava/lang/Runnable;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/q/b/d;->d:Ljava/lang/Runnable;

    .line 4
    invoke-static {}, Lcom/tv91/q/b/d;->b()Lb/g/j/a;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/q/b/d;->e:Lb/g/j/a;

    .line 5
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/tv91/q/b/d;->g:Ljava/lang/Object;

    .line 6
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/tv91/q/b/d;->h:Ljava/util/Set;

    .line 7
    iput-object p1, p0, Lcom/tv91/q/b/d;->f:Lcom/tv91/t/b;

    return-void
.end method

.method protected static b()Lb/g/j/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lb/g/j/a<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/q/b/d;->b:Lb/g/j/a;

    return-object v0
.end method

.method protected static c()Ljava/lang/Runnable;
    .locals 1

    .line 1
    sget-object v0, Lcom/tv91/q/b/d;->a:Ljava/lang/Runnable;

    return-object v0
.end method

.method private synthetic e(Lcom/tv91/q/b/f;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/tv91/q/b/d;->d()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 2
    instance-of v2, v1, Lcom/tv91/q/b/e;

    if-eqz v2, :cond_0

    .line 3
    check-cast v1, Lcom/tv91/q/b/e;

    invoke-interface {v1, p1}, Lcom/tv91/q/b/e;->a(Lcom/tv91/q/b/f;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method static synthetic g()V
    .locals 0

    return-void
.end method

.method static synthetic h(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/q/b/d;->g:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/tv91/q/b/d;->h:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public d()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TOBSERVER;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/q/b/d;->g:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/tv91/q/b/d;->h:Ljava/util/Set;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public synthetic f(Lcom/tv91/q/b/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/q/b/d;->e(Lcom/tv91/q/b/f;)V

    return-void
.end method

.method protected i(Lcom/tv91/q/b/f;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/q/b/d;->f:Lcom/tv91/t/b;

    invoke-interface {v0}, Lcom/tv91/t/b;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lcom/tv91/q/b/a;

    invoke-direct {v1, p0, p1}, Lcom/tv91/q/b/a;-><init>(Lcom/tv91/q/b/d;Lcom/tv91/q/b/f;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected j(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/q/b/d;->f:Lcom/tv91/t/b;

    invoke-interface {v0}, Lcom/tv91/t/b;->c()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected k(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/q/b/d;->f:Lcom/tv91/t/b;

    invoke-interface {v0}, Lcom/tv91/t/b;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected l(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/q/b/d;->f:Lcom/tv91/t/b;

    invoke-interface {v0}, Lcom/tv91/t/b;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public m(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TOBSERVER;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/tv91/q/b/d;->g:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/tv91/q/b/d;->h:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 3
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    :goto_0
    return-void
.end method

.method public n(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TOBSERVER;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/tv91/q/b/d;->g:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/tv91/q/b/d;->h:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 3
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    :goto_0
    return-void
.end method
