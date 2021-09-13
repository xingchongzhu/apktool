.class Lc/a/b/b/r$c;
.super Lc/a/b/b/r;
.source "ImmutableList.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/b/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/a/b/b/r<",
        "TE;>;"
    }
.end annotation


# instance fields
.field final transient c:I

.field final transient d:I

.field final synthetic e:Lc/a/b/b/r;


# direct methods
.method constructor <init>(Lc/a/b/b/r;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/b/b/r$c;->e:Lc/a/b/b/r;

    invoke-direct {p0}, Lc/a/b/b/r;-><init>()V

    .line 2
    iput p2, p0, Lc/a/b/b/r$c;->c:I

    .line 3
    iput p3, p0, Lc/a/b/b/r$c;->d:I

    return-void
.end method


# virtual methods
.method d()[Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/b/b/r$c;->e:Lc/a/b/b/r;

    invoke-virtual {v0}, Lc/a/b/b/p;->d()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method e()I
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/b/b/r$c;->e:Lc/a/b/b/r;

    invoke-virtual {v0}, Lc/a/b/b/p;->f()I

    move-result v0

    iget v1, p0, Lc/a/b/b/r$c;->c:I

    add-int/2addr v0, v1

    iget v1, p0, Lc/a/b/b/r$c;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method f()I
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/b/b/r$c;->e:Lc/a/b/b/r;

    invoke-virtual {v0}, Lc/a/b/b/p;->f()I

    move-result v0

    iget v1, p0, Lc/a/b/b/r$c;->c:I

    add-int/2addr v0, v1

    return v0
.end method

.method g()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 1
    iget v0, p0, Lc/a/b/b/r$c;->d:I

    invoke-static {p1, v0}, Lc/a/b/a/g;->g(II)I

    .line 2
    iget-object v0, p0, Lc/a/b/b/r$c;->e:Lc/a/b/b/r;

    iget v1, p0, Lc/a/b/b/r$c;->c:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-super {p0}, Lc/a/b/b/r;->h()Lc/a/b/b/u0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    .line 1
    invoke-super {p0}, Lc/a/b/b/r;->n()Lc/a/b/b/v0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lc/a/b/b/r;->o(I)Lc/a/b/b/v0;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/b/b/r$c;->d:I

    return v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lc/a/b/b/r$c;->u(II)Lc/a/b/b/r;

    move-result-object p1

    return-object p1
.end method

.method public u(II)Lc/a/b/b/r;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lc/a/b/b/r<",
            "TE;>;"
        }
    .end annotation

    .line 1
    iget v0, p0, Lc/a/b/b/r$c;->d:I

    invoke-static {p1, p2, v0}, Lc/a/b/a/g;->m(III)V

    .line 2
    iget-object v0, p0, Lc/a/b/b/r$c;->e:Lc/a/b/b/r;

    iget v1, p0, Lc/a/b/b/r$c;->c:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lc/a/b/b/r;->u(II)Lc/a/b/b/r;

    move-result-object p1

    return-object p1
.end method
