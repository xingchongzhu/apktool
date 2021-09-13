.class public final Lc/a/a/a/e2/s;
.super Ljava/lang/Object;
.source "DefaultDrmSessionManagerProvider.java"

# interfaces
.implements Lc/a/a/a/e2/z;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Lc/a/a/a/z0$e;

.field private c:Lc/a/a/a/e2/y;

.field private d:Lcom/google/android/exoplayer2/upstream/y$b;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lc/a/a/a/e2/s;->a:Ljava/lang/Object;

    return-void
.end method

.method private b(Lc/a/a/a/z0$e;)Lc/a/a/a/e2/y;
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/e2/s;->d:Lcom/google/android/exoplayer2/upstream/y$b;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Lcom/google/android/exoplayer2/upstream/u$b;

    invoke-direct {v0}, Lcom/google/android/exoplayer2/upstream/u$b;-><init>()V

    iget-object v1, p0, Lc/a/a/a/e2/s;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/upstream/u$b;->c(Ljava/lang/String;)Lcom/google/android/exoplayer2/upstream/u$b;

    move-result-object v0

    .line 3
    :goto_0
    new-instance v1, Lc/a/a/a/e2/g0;

    .line 4
    iget-object v2, p1, Lc/a/a/a/z0$e;->b:Landroid/net/Uri;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_1
    iget-boolean v3, p1, Lc/a/a/a/z0$e;->f:Z

    invoke-direct {v1, v2, v3, v0}, Lc/a/a/a/e2/g0;-><init>(Ljava/lang/String;ZLcom/google/android/exoplayer2/upstream/y$b;)V

    .line 5
    iget-object v0, p1, Lc/a/a/a/z0$e;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 6
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v3, v2}, Lc/a/a/a/e2/g0;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 7
    :cond_2
    new-instance v0, Lc/a/a/a/e2/r$b;

    invoke-direct {v0}, Lc/a/a/a/e2/r$b;-><init>()V

    iget-object v2, p1, Lc/a/a/a/z0$e;->a:Ljava/util/UUID;

    sget-object v3, Lc/a/a/a/e2/f0;->a:Lc/a/a/a/e2/d0$c;

    .line 8
    invoke-virtual {v0, v2, v3}, Lc/a/a/a/e2/r$b;->e(Ljava/util/UUID;Lc/a/a/a/e2/d0$c;)Lc/a/a/a/e2/r$b;

    move-result-object v0

    iget-boolean v2, p1, Lc/a/a/a/z0$e;->d:Z

    .line 9
    invoke-virtual {v0, v2}, Lc/a/a/a/e2/r$b;->b(Z)Lc/a/a/a/e2/r$b;

    move-result-object v0

    iget-boolean v2, p1, Lc/a/a/a/z0$e;->e:Z

    .line 10
    invoke-virtual {v0, v2}, Lc/a/a/a/e2/r$b;->c(Z)Lc/a/a/a/e2/r$b;

    move-result-object v0

    iget-object v2, p1, Lc/a/a/a/z0$e;->g:Ljava/util/List;

    .line 11
    invoke-static {v2}, Lc/a/b/c/c;->i(Ljava/util/Collection;)[I

    move-result-object v2

    invoke-virtual {v0, v2}, Lc/a/a/a/e2/r$b;->d([I)Lc/a/a/a/e2/r$b;

    move-result-object v0

    .line 12
    invoke-virtual {v0, v1}, Lc/a/a/a/e2/r$b;->a(Lc/a/a/a/e2/i0;)Lc/a/a/a/e2/r;

    move-result-object v0

    const/4 v1, 0x0

    .line 13
    invoke-virtual {p1}, Lc/a/a/a/z0$e;->a()[B

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lc/a/a/a/e2/r;->u(I[B)V

    return-object v0
.end method


# virtual methods
.method public a(Lc/a/a/a/z0;)Lc/a/a/a/e2/y;
    .locals 2

    .line 1
    iget-object v0, p1, Lc/a/a/a/z0;->b:Lc/a/a/a/z0$g;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object p1, p1, Lc/a/a/a/z0;->b:Lc/a/a/a/z0$g;

    iget-object p1, p1, Lc/a/a/a/z0$g;->c:Lc/a/a/a/z0$e;

    if-eqz p1, :cond_2

    .line 3
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v1, 0x12

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lc/a/a/a/e2/s;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 5
    :try_start_0
    iget-object v1, p0, Lc/a/a/a/e2/s;->b:Lc/a/a/a/z0$e;

    invoke-static {p1, v1}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 6
    iput-object p1, p0, Lc/a/a/a/e2/s;->b:Lc/a/a/a/z0$e;

    .line 7
    invoke-direct {p0, p1}, Lc/a/a/a/e2/s;->b(Lc/a/a/a/z0$e;)Lc/a/a/a/e2/y;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/e2/s;->c:Lc/a/a/a/e2/y;

    .line 8
    :cond_1
    iget-object p1, p0, Lc/a/a/a/e2/s;->c:Lc/a/a/a/e2/y;

    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/e2/y;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 10
    :cond_2
    :goto_0
    sget-object p1, Lc/a/a/a/e2/y;->a:Lc/a/a/a/e2/y;

    return-object p1
.end method
