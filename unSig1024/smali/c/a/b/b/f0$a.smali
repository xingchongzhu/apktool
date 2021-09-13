.class Lc/a/b/b/f0$a;
.super Lc/a/b/b/c;
.source "Multimaps.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/b/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lc/a/b/b/c<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field transient f:Lc/a/b/a/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/a/k<",
            "+",
            "Ljava/util/List<",
            "TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/Map;Lc/a/b/a/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;",
            "Lc/a/b/a/k<",
            "+",
            "Ljava/util/List<",
            "TV;>;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lc/a/b/b/c;-><init>(Ljava/util/Map;)V

    .line 2
    invoke-static {p2}, Lc/a/b/a/g;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/b/a/k;

    iput-object p1, p0, Lc/a/b/b/f0$a;->f:Lc/a/b/a/k;

    return-void
.end method


# virtual methods
.method c()Ljava/util/Map;
    .locals 1
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
    invoke-virtual {p0}, Lc/a/b/b/d;->q()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method d()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lc/a/b/b/d;->r()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic o()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/a/b/b/f0$a;->x()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected x()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TV;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/b/f0$a;->f:Lc/a/b/a/k;

    invoke-interface {v0}, Lc/a/b/a/k;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method
