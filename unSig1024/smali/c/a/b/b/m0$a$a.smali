.class Lc/a/b/b/m0$a$a;
.super Lc/a/b/b/r;
.source "RegularImmutableMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/a/b/b/m0$a;->m()Lc/a/b/b/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/a/b/b/r<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lc/a/b/b/m0$a;


# direct methods
.method constructor <init>(Lc/a/b/b/m0$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/b/b/m0$a$a;->c:Lc/a/b/b/m0$a;

    invoke-direct {p0}, Lc/a/b/b/r;-><init>()V

    return-void
.end method


# virtual methods
.method public g()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc/a/b/b/m0$a$a;->w(I)Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/b/b/m0$a$a;->c:Lc/a/b/b/m0$a;

    invoke-static {v0}, Lc/a/b/b/m0$a;->t(Lc/a/b/b/m0$a;)I

    move-result v0

    return v0
.end method

.method public w(I)Ljava/util/Map$Entry;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/b/m0$a$a;->c:Lc/a/b/b/m0$a;

    invoke-static {v0}, Lc/a/b/b/m0$a;->t(Lc/a/b/b/m0$a;)I

    move-result v0

    invoke-static {p1, v0}, Lc/a/b/a/g;->g(II)I

    .line 2
    iget-object v0, p0, Lc/a/b/b/m0$a$a;->c:Lc/a/b/b/m0$a;

    invoke-static {v0}, Lc/a/b/b/m0$a;->u(Lc/a/b/b/m0$a;)[Ljava/lang/Object;

    move-result-object v0

    mul-int/lit8 p1, p1, 0x2

    iget-object v1, p0, Lc/a/b/b/m0$a$a;->c:Lc/a/b/b/m0$a;

    invoke-static {v1}, Lc/a/b/b/m0$a;->v(Lc/a/b/b/m0$a;)I

    move-result v1

    add-int/2addr v1, p1

    aget-object v0, v0, v1

    .line 3
    iget-object v1, p0, Lc/a/b/b/m0$a$a;->c:Lc/a/b/b/m0$a;

    invoke-static {v1}, Lc/a/b/b/m0$a;->u(Lc/a/b/b/m0$a;)[Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lc/a/b/b/m0$a$a;->c:Lc/a/b/b/m0$a;

    invoke-static {v2}, Lc/a/b/b/m0$a;->v(Lc/a/b/b/m0$a;)I

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    add-int/2addr p1, v2

    aget-object p1, v1, p1

    .line 4
    new-instance v1, Ljava/util/AbstractMap$SimpleImmutableEntry;

    invoke-direct {v1, v0, p1}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method
