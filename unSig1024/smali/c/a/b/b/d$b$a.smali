.class Lc/a/b/b/d$b$a;
.super Lc/a/b/b/b0$c;
.source "AbstractMapBasedMultimap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/b/d$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/a/b/b/b0$c<",
        "TK;",
        "Ljava/util/Collection<",
        "TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lc/a/b/b/d$b;


# direct methods
.method constructor <init>(Lc/a/b/b/d$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/b/b/d$b$a;->a:Lc/a/b/b/d$b;

    invoke-direct {p0}, Lc/a/b/b/b0$c;-><init>()V

    return-void
.end method


# virtual methods
.method b()Ljava/util/Map;
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
    iget-object v0, p0, Lc/a/b/b/d$b$a;->a:Lc/a/b/b/d$b;

    return-object v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/b/b/d$b$a;->a:Lc/a/b/b/d$b;

    iget-object v0, v0, Lc/a/b/b/d$b;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0, p1}, Lc/a/b/b/j;->b(Ljava/util/Collection;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lc/a/b/b/d$b$b;

    iget-object v1, p0, Lc/a/b/b/d$b$a;->a:Lc/a/b/b/d$b;

    invoke-direct {v0, v1}, Lc/a/b/b/d$b$b;-><init>(Lc/a/b/b/d$b;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lc/a/b/b/d$b$a;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 3
    iget-object v0, p0, Lc/a/b/b/d$b$a;->a:Lc/a/b/b/d$b;

    iget-object v0, v0, Lc/a/b/b/d$b;->d:Lc/a/b/b/d;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lc/a/b/b/d;->n(Lc/a/b/b/d;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method
