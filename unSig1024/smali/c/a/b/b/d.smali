.class abstract Lc/a/b/b/d;
.super Lc/a/b/b/f;
.source "AbstractMapBasedMultimap.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/b/b/d$e;,
        Lc/a/b/b/d$h;,
        Lc/a/b/b/d$b;,
        Lc/a/b/b/d$c;,
        Lc/a/b/b/d$f;,
        Lc/a/b/b/d$i;,
        Lc/a/b/b/d$d;,
        Lc/a/b/b/d$g;,
        Lc/a/b/b/d$k;,
        Lc/a/b/b/d$j;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lc/a/b/b/f<",
        "TK;TV;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field private transient d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;"
        }
    .end annotation
.end field

.field private transient e:I


# direct methods
.method protected constructor <init>(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lc/a/b/b/f;-><init>()V

    .line 2
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    invoke-static {v0}, Lc/a/b/a/g;->d(Z)V

    .line 3
    iput-object p1, p0, Lc/a/b/b/d;->d:Ljava/util/Map;

    return-void
.end method

.method static synthetic h(Lc/a/b/b/d;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/b/b/d;->d:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic i(Ljava/util/Collection;)Ljava/util/Iterator;
    .locals 0

    .line 1
    invoke-static {p0}, Lc/a/b/b/d;->s(Ljava/util/Collection;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method static synthetic j(Lc/a/b/b/d;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/b/b/d;->e:I

    return p0
.end method

.method static synthetic k(Lc/a/b/b/d;I)I
    .locals 0

    .line 1
    iput p1, p0, Lc/a/b/b/d;->e:I

    return p1
.end method

.method static synthetic l(Lc/a/b/b/d;)I
    .locals 2

    .line 1
    iget v0, p0, Lc/a/b/b/d;->e:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lc/a/b/b/d;->e:I

    return v0
.end method

.method static synthetic m(Lc/a/b/b/d;)I
    .locals 2

    .line 1
    iget v0, p0, Lc/a/b/b/d;->e:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lc/a/b/b/d;->e:I

    return v0
.end method

.method static synthetic n(Lc/a/b/b/d;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lc/a/b/b/d;->t(Ljava/lang/Object;)V

    return-void
.end method

.method private static s(Ljava/util/Collection;)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "TE;>;)",
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation

    .line 1
    instance-of v0, p0, Ljava/util/List;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/util/List;

    .line 2
    invoke-interface {p0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object p0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private t(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/b/b/d;->d:Ljava/util/Map;

    invoke-static {v0, p1}, Lc/a/b/b/b0;->h(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    .line 3
    invoke-interface {p1}, Ljava/util/Collection;->clear()V

    .line 4
    iget p1, p0, Lc/a/b/b/d;->e:I

    sub-int/2addr p1, v0

    iput p1, p0, Lc/a/b/b/d;->e:I

    :cond_0
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/b/b/d;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    .line 2
    invoke-interface {v1}, Ljava/util/Collection;->clear()V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/a/b/b/d;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lc/a/b/b/d;->e:I

    return-void
.end method

.method e()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lc/a/b/b/f$a;

    invoke-direct {v0, p0}, Lc/a/b/b/f$a;-><init>(Lc/a/b/b/f;)V

    return-object v0
.end method

.method g()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TV;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lc/a/b/b/d$a;

    invoke-direct {v0, p0}, Lc/a/b/b/d$a;-><init>(Lc/a/b/b/d;)V

    return-object v0
.end method

.method abstract o()Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation
.end method

.method p(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lc/a/b/b/d;->o()Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/b/d;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x1

    if-nez v0, :cond_1

    .line 2
    invoke-virtual {p0, p1}, Lc/a/b/b/d;->p(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    .line 3
    invoke-interface {v0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 4
    iget p2, p0, Lc/a/b/b/d;->e:I

    add-int/2addr p2, v1

    iput p2, p0, Lc/a/b/b/d;->e:I

    .line 5
    iget-object p2, p0, Lc/a/b/b/d;->d:Ljava/util/Map;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v1

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "New Collection violated the Collection spec"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    .line 7
    :cond_1
    invoke-interface {v0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 8
    iget p1, p0, Lc/a/b/b/d;->e:I

    add-int/2addr p1, v1

    iput p1, p0, Lc/a/b/b/d;->e:I

    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method final q()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/b/d;->d:Ljava/util/Map;

    instance-of v1, v0, Ljava/util/NavigableMap;

    if-eqz v1, :cond_0

    .line 2
    new-instance v0, Lc/a/b/b/d$e;

    iget-object v1, p0, Lc/a/b/b/d;->d:Ljava/util/Map;

    check-cast v1, Ljava/util/NavigableMap;

    invoke-direct {v0, p0, v1}, Lc/a/b/b/d$e;-><init>(Lc/a/b/b/d;Ljava/util/NavigableMap;)V

    return-object v0

    .line 3
    :cond_0
    instance-of v0, v0, Ljava/util/SortedMap;

    if-eqz v0, :cond_1

    .line 4
    new-instance v0, Lc/a/b/b/d$h;

    iget-object v1, p0, Lc/a/b/b/d;->d:Ljava/util/Map;

    check-cast v1, Ljava/util/SortedMap;

    invoke-direct {v0, p0, v1}, Lc/a/b/b/d$h;-><init>(Lc/a/b/b/d;Ljava/util/SortedMap;)V

    return-object v0

    .line 5
    :cond_1
    new-instance v0, Lc/a/b/b/d$b;

    iget-object v1, p0, Lc/a/b/b/d;->d:Ljava/util/Map;

    invoke-direct {v0, p0, v1}, Lc/a/b/b/d$b;-><init>(Lc/a/b/b/d;Ljava/util/Map;)V

    return-object v0
.end method

.method final r()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/b/d;->d:Ljava/util/Map;

    instance-of v1, v0, Ljava/util/NavigableMap;

    if-eqz v1, :cond_0

    .line 2
    new-instance v0, Lc/a/b/b/d$f;

    iget-object v1, p0, Lc/a/b/b/d;->d:Ljava/util/Map;

    check-cast v1, Ljava/util/NavigableMap;

    invoke-direct {v0, p0, v1}, Lc/a/b/b/d$f;-><init>(Lc/a/b/b/d;Ljava/util/NavigableMap;)V

    return-object v0

    .line 3
    :cond_0
    instance-of v0, v0, Ljava/util/SortedMap;

    if-eqz v0, :cond_1

    .line 4
    new-instance v0, Lc/a/b/b/d$i;

    iget-object v1, p0, Lc/a/b/b/d;->d:Ljava/util/Map;

    check-cast v1, Ljava/util/SortedMap;

    invoke-direct {v0, p0, v1}, Lc/a/b/b/d$i;-><init>(Lc/a/b/b/d;Ljava/util/SortedMap;)V

    return-object v0

    .line 5
    :cond_1
    new-instance v0, Lc/a/b/b/d$d;

    iget-object v1, p0, Lc/a/b/b/d;->d:Ljava/util/Map;

    invoke-direct {v0, p0, v1}, Lc/a/b/b/d$d;-><init>(Lc/a/b/b/d;Ljava/util/Map;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/b/b/d;->e:I

    return v0
.end method

.method abstract u(Ljava/util/Collection;)Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "TE;>;)",
            "Ljava/util/Collection<",
            "TE;>;"
        }
    .end annotation
.end method

.method abstract v(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/Collection<",
            "TV;>;)",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation
.end method

.method public values()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    .line 1
    invoke-super {p0}, Lc/a/b/b/f;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method final w(Ljava/lang/Object;Ljava/util/List;Lc/a/b/b/d$j;)Ljava/util/List;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .param p3    # Lc/a/b/b/d$j;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/List<",
            "TV;>;",
            "Lc/a/b/b/d<",
            "TK;TV;>.j;)",
            "Ljava/util/List<",
            "TV;>;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Ljava/util/RandomAccess;

    if-eqz v0, :cond_0

    new-instance v0, Lc/a/b/b/d$g;

    invoke-direct {v0, p0, p1, p2, p3}, Lc/a/b/b/d$g;-><init>(Lc/a/b/b/d;Ljava/lang/Object;Ljava/util/List;Lc/a/b/b/d$j;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lc/a/b/b/d$k;

    invoke-direct {v0, p0, p1, p2, p3}, Lc/a/b/b/d$k;-><init>(Lc/a/b/b/d;Ljava/lang/Object;Ljava/util/List;Lc/a/b/b/d$j;)V

    :goto_0
    return-object v0
.end method
