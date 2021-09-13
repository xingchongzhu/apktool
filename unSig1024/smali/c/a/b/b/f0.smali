.class public final Lc/a/b/b/f0;
.super Ljava/lang/Object;
.source "Multimaps.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/b/b/f0$a;
    }
.end annotation


# direct methods
.method static a(Lc/a/b/b/c0;Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/b/b/c0<",
            "**>;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    .line 1
    :cond_0
    instance-of v0, p1, Lc/a/b/b/c0;

    if-eqz v0, :cond_1

    .line 2
    check-cast p1, Lc/a/b/b/c0;

    .line 3
    invoke-interface {p0}, Lc/a/b/b/c0;->a()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1}, Lc/a/b/b/c0;->a()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static b(Ljava/util/Map;Lc/a/b/a/k;)Lc/a/b/b/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;",
            "Lc/a/b/a/k<",
            "+",
            "Ljava/util/List<",
            "TV;>;>;)",
            "Lc/a/b/b/y<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lc/a/b/b/f0$a;

    invoke-direct {v0, p0, p1}, Lc/a/b/b/f0$a;-><init>(Ljava/util/Map;Lc/a/b/a/k;)V

    return-object v0
.end method
