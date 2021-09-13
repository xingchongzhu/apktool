.class abstract Lc/a/b/b/k$e;
.super Ljava/lang/Object;
.source "CompactHashMap.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/b/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field a:I

.field b:I

.field c:I

.field final synthetic d:Lc/a/b/b/k;


# direct methods
.method private constructor <init>(Lc/a/b/b/k;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lc/a/b/b/k$e;->d:Lc/a/b/b/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget v0, p1, Lc/a/b/b/k;->f:I

    iput v0, p0, Lc/a/b/b/k$e;->a:I

    .line 3
    invoke-virtual {p1}, Lc/a/b/b/k;->k()I

    move-result p1

    iput p1, p0, Lc/a/b/b/k$e;->b:I

    const/4 p1, -0x1

    .line 4
    iput p1, p0, Lc/a/b/b/k$e;->c:I

    return-void
.end method

.method synthetic constructor <init>(Lc/a/b/b/k;Lc/a/b/b/k$a;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lc/a/b/b/k$e;-><init>(Lc/a/b/b/k;)V

    return-void
.end method

.method private a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/b/b/k$e;->d:Lc/a/b/b/k;

    iget v0, v0, Lc/a/b/b/k;->f:I

    iget v1, p0, Lc/a/b/b/k$e;->a:I

    if-ne v0, v1, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method


# virtual methods
.method abstract b(I)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation
.end method

.method public hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Lc/a/b/b/k$e;->b:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lc/a/b/b/k$e;->a()V

    .line 2
    invoke-virtual {p0}, Lc/a/b/b/k$e;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget v0, p0, Lc/a/b/b/k$e;->b:I

    iput v0, p0, Lc/a/b/b/k$e;->c:I

    .line 4
    invoke-virtual {p0, v0}, Lc/a/b/b/k$e;->b(I)Ljava/lang/Object;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lc/a/b/b/k$e;->d:Lc/a/b/b/k;

    iget v2, p0, Lc/a/b/b/k$e;->b:I

    invoke-virtual {v1, v2}, Lc/a/b/b/k;->n(I)I

    move-result v1

    iput v1, p0, Lc/a/b/b/k$e;->b:I

    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lc/a/b/b/k$e;->a()V

    .line 2
    iget v0, p0, Lc/a/b/b/k$e;->c:I

    const/4 v1, 0x1

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lc/a/b/b/i;->c(Z)V

    .line 3
    iget v0, p0, Lc/a/b/b/k$e;->a:I

    add-int/2addr v0, v1

    iput v0, p0, Lc/a/b/b/k$e;->a:I

    .line 4
    iget-object v0, p0, Lc/a/b/b/k$e;->d:Lc/a/b/b/k;

    iget v1, p0, Lc/a/b/b/k$e;->c:I

    invoke-static {v0, v1}, Lc/a/b/b/k;->a(Lc/a/b/b/k;I)Ljava/lang/Object;

    .line 5
    iget-object v0, p0, Lc/a/b/b/k$e;->d:Lc/a/b/b/k;

    iget v1, p0, Lc/a/b/b/k$e;->b:I

    iget v2, p0, Lc/a/b/b/k$e;->c:I

    invoke-virtual {v0, v1, v2}, Lc/a/b/b/k;->e(II)I

    move-result v0

    iput v0, p0, Lc/a/b/b/k$e;->b:I

    const/4 v0, -0x1

    .line 6
    iput v0, p0, Lc/a/b/b/k$e;->c:I

    return-void
.end method
