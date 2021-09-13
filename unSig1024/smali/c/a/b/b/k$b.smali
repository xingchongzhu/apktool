.class Lc/a/b/b/k$b;
.super Lc/a/b/b/k$e;
.source "CompactHashMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/a/b/b/k;->j()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/a/b/b/k<",
        "TK;TV;>.e<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lc/a/b/b/k;


# direct methods
.method constructor <init>(Lc/a/b/b/k;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lc/a/b/b/k$b;->e:Lc/a/b/b/k;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lc/a/b/b/k$e;-><init>(Lc/a/b/b/k;Lc/a/b/b/k$a;)V

    return-void
.end method


# virtual methods
.method bridge synthetic b(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc/a/b/b/k$b;->c(I)Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method c(I)Ljava/util/Map$Entry;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lc/a/b/b/k$g;

    iget-object v1, p0, Lc/a/b/b/k$b;->e:Lc/a/b/b/k;

    invoke-direct {v0, v1, p1}, Lc/a/b/b/k$g;-><init>(Lc/a/b/b/k;I)V

    return-object v0
.end method
