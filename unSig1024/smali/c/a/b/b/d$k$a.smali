.class Lc/a/b/b/d$k$a;
.super Lc/a/b/b/d$j$a;
.source "AbstractMapBasedMultimap.java"

# interfaces
.implements Ljava/util/ListIterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/b/d$k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/a/b/b/d<",
        "TK;TV;>.j.a;",
        "Ljava/util/ListIterator<",
        "TV;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lc/a/b/b/d$k;


# direct methods
.method constructor <init>(Lc/a/b/b/d$k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/b/b/d$k$a;->d:Lc/a/b/b/d$k;

    invoke-direct {p0, p1}, Lc/a/b/b/d$j$a;-><init>(Lc/a/b/b/d$j;)V

    return-void
.end method

.method public constructor <init>(Lc/a/b/b/d$k;I)V
    .locals 1

    .line 2
    iput-object p1, p0, Lc/a/b/b/d$k$a;->d:Lc/a/b/b/d$k;

    .line 3
    invoke-virtual {p1}, Lc/a/b/b/d$k;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lc/a/b/b/d$j$a;-><init>(Lc/a/b/b/d$j;Ljava/util/Iterator;)V

    return-void
.end method

.method private c()Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator<",
            "TV;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lc/a/b/b/d$j$a;->a()Ljava/util/Iterator;

    move-result-object v0

    check-cast v0, Ljava/util/ListIterator;

    return-object v0
.end method


# virtual methods
.method public add(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/b/d$k$a;->d:Lc/a/b/b/d$k;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    .line 2
    invoke-direct {p0}, Lc/a/b/b/d$k$a;->c()Ljava/util/ListIterator;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    .line 3
    iget-object p1, p0, Lc/a/b/b/d$k$a;->d:Lc/a/b/b/d$k;

    iget-object p1, p1, Lc/a/b/b/d$k;->f:Lc/a/b/b/d;

    invoke-static {p1}, Lc/a/b/b/d;->l(Lc/a/b/b/d;)I

    if-eqz v0, :cond_0

    .line 4
    iget-object p1, p0, Lc/a/b/b/d$k$a;->d:Lc/a/b/b/d$k;

    invoke-virtual {p1}, Lc/a/b/b/d$j;->b()V

    :cond_0
    return-void
.end method

.method public hasPrevious()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/b/b/d$k$a;->c()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    return v0
.end method

.method public nextIndex()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/b/b/d$k$a;->c()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    return v0
.end method

.method public previous()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lc/a/b/b/d$k$a;->c()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public previousIndex()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/b/b/d$k$a;->c()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    move-result v0

    return v0
.end method

.method public set(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lc/a/b/b/d$k$a;->c()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    return-void
.end method
