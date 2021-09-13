.class public Lc/a/b/b/s;
.super Lc/a/b/b/u;
.source "ImmutableListMultimap.java"

# interfaces
.implements Lc/a/b/b/y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/b/b/s$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lc/a/b/b/u<",
        "TK;TV;>;",
        "Lc/a/b/b/y<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Lc/a/b/b/t;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/b/b/t<",
            "TK;",
            "Lc/a/b/b/r<",
            "TV;>;>;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/b/b/u;-><init>(Lc/a/b/b/t;I)V

    return-void
.end method

.method public static l()Lc/a/b/b/s$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lc/a/b/b/s$a<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lc/a/b/b/s$a;

    invoke-direct {v0}, Lc/a/b/b/s$a;-><init>()V

    return-object v0
.end method

.method static m(Ljava/util/Collection;Ljava/util/Comparator;)Lc/a/b/b/s;
    .locals 5
    .param p1    # Ljava/util/Comparator;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/util/Map$Entry<",
            "+TK;+",
            "Ljava/util/Collection<",
            "+TV;>;>;>;",
            "Ljava/util/Comparator<",
            "-TV;>;)",
            "Lc/a/b/b/s<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lc/a/b/b/s;->o()Lc/a/b/b/s;

    move-result-object p0

    return-object p0

    .line 3
    :cond_0
    new-instance v0, Lc/a/b/b/t$a;

    .line 4
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Lc/a/b/b/t$a;-><init>(I)V

    const/4 v1, 0x0

    .line 5
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 6
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    .line 7
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    if-nez p1, :cond_2

    .line 8
    invoke-static {v2}, Lc/a/b/b/r;->m(Ljava/util/Collection;)Lc/a/b/b/r;

    move-result-object v2

    goto :goto_1

    .line 9
    :cond_2
    invoke-static {p1, v2}, Lc/a/b/b/r;->t(Ljava/util/Comparator;Ljava/lang/Iterable;)Lc/a/b/b/r;

    move-result-object v2

    .line 10
    :goto_1
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    .line 11
    invoke-virtual {v0, v3, v2}, Lc/a/b/b/t$a;->c(Ljava/lang/Object;Ljava/lang/Object;)Lc/a/b/b/t$a;

    .line 12
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    .line 13
    :cond_3
    new-instance p0, Lc/a/b/b/s;

    invoke-virtual {v0}, Lc/a/b/b/t$a;->a()Lc/a/b/b/t;

    move-result-object p1

    invoke-direct {p0, p1, v1}, Lc/a/b/b/s;-><init>(Lc/a/b/b/t;I)V

    return-object p0
.end method

.method public static o()Lc/a/b/b/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lc/a/b/b/s<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lc/a/b/b/n;->f:Lc/a/b/b/n;

    return-object v0
.end method


# virtual methods
.method public n(Ljava/lang/Object;)Lc/a/b/b/r;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Lc/a/b/b/r<",
            "TV;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/b/u;->d:Lc/a/b/b/t;

    invoke-virtual {v0, p1}, Lc/a/b/b/t;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/b/b/r;

    if-nez p1, :cond_0

    .line 2
    invoke-static {}, Lc/a/b/b/r;->p()Lc/a/b/b/r;

    move-result-object p1

    :cond_0
    return-object p1
.end method
