.class Lc/a/b/b/k$f;
.super Ljava/util/AbstractSet;
.source "CompactHashMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/b/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractSet<",
        "TK;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lc/a/b/b/k;


# direct methods
.method constructor <init>(Lc/a/b/b/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/b/b/k$f;->a:Lc/a/b/b/k;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/b/b/k$f;->a:Lc/a/b/b/k;

    invoke-virtual {v0}, Lc/a/b/b/k;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/b/b/k$f;->a:Lc/a/b/b/k;

    invoke-virtual {v0, p1}, Lc/a/b/b/k;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TK;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/b/k$f;->a:Lc/a/b/b/k;

    invoke-virtual {v0}, Lc/a/b/b/k;->s()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lc/a/b/b/k$f;->a:Lc/a/b/b/k;

    invoke-static {v0, p1}, Lc/a/b/b/k;->c(Lc/a/b/b/k;Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    iget-object v0, p0, Lc/a/b/b/k$f;->a:Lc/a/b/b/k;

    invoke-static {v0, p1}, Lc/a/b/b/k;->a(Lc/a/b/b/k;I)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/b/b/k$f;->a:Lc/a/b/b/k;

    invoke-static {v0}, Lc/a/b/b/k;->b(Lc/a/b/b/k;)I

    move-result v0

    return v0
.end method
