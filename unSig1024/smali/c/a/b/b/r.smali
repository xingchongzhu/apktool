.class public abstract Lc/a/b/b/r;
.super Lc/a/b/b/p;
.source "ImmutableList.java"

# interfaces
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/b/b/r$a;,
        Lc/a/b/b/r$c;,
        Lc/a/b/b/r$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lc/a/b/b/p<",
        "TE;>;",
        "Ljava/util/List<",
        "TE;>;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# static fields
.field private static final b:Lc/a/b/b/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/b/v0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lc/a/b/b/r$b;

    sget-object v1, Lc/a/b/b/l0;->c:Lc/a/b/b/r;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc/a/b/b/r$b;-><init>(Lc/a/b/b/r;I)V

    sput-object v0, Lc/a/b/b/r;->b:Lc/a/b/b/v0;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/a/b/b/p;-><init>()V

    return-void
.end method

.method static i([Ljava/lang/Object;)Lc/a/b/b/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            ")",
            "Lc/a/b/b/r<",
            "TE;>;"
        }
    .end annotation

    .line 1
    array-length v0, p0

    invoke-static {p0, v0}, Lc/a/b/b/r;->j([Ljava/lang/Object;I)Lc/a/b/b/r;

    move-result-object p0

    return-object p0
.end method

.method static j([Ljava/lang/Object;I)Lc/a/b/b/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            "I)",
            "Lc/a/b/b/r<",
            "TE;>;"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 1
    invoke-static {}, Lc/a/b/b/r;->p()Lc/a/b/b/r;

    move-result-object p0

    return-object p0

    .line 2
    :cond_0
    new-instance v0, Lc/a/b/b/l0;

    invoke-direct {v0, p0, p1}, Lc/a/b/b/l0;-><init>([Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static k()Lc/a/b/b/r$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lc/a/b/b/r$a<",
            "TE;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lc/a/b/b/r$a;

    invoke-direct {v0}, Lc/a/b/b/r$a;-><init>()V

    return-object v0
.end method

.method private static varargs l([Ljava/lang/Object;)Lc/a/b/b/r;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            ")",
            "Lc/a/b/b/r<",
            "TE;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lc/a/b/b/i0;->b([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lc/a/b/b/r;->i([Ljava/lang/Object;)Lc/a/b/b/r;

    move-result-object p0

    return-object p0
.end method

.method public static m(Ljava/util/Collection;)Lc/a/b/b/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+TE;>;)",
            "Lc/a/b/b/r<",
            "TE;>;"
        }
    .end annotation

    .line 1
    instance-of v0, p0, Lc/a/b/b/p;

    if-eqz v0, :cond_1

    .line 2
    check-cast p0, Lc/a/b/b/p;

    invoke-virtual {p0}, Lc/a/b/b/p;->b()Lc/a/b/b/r;

    move-result-object p0

    .line 3
    invoke-virtual {p0}, Lc/a/b/b/p;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc/a/b/b/p;->toArray()[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lc/a/b/b/r;->i([Ljava/lang/Object;)Lc/a/b/b/r;

    move-result-object p0

    :cond_0
    return-object p0

    .line 4
    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lc/a/b/b/r;->l([Ljava/lang/Object;)Lc/a/b/b/r;

    move-result-object p0

    return-object p0
.end method

.method public static p()Lc/a/b/b/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lc/a/b/b/r<",
            "TE;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lc/a/b/b/l0;->c:Lc/a/b/b/r;

    return-object v0
.end method

.method public static q(Ljava/lang/Object;)Lc/a/b/b/r;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;)",
            "Lc/a/b/b/r<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    .line 1
    invoke-static {v0}, Lc/a/b/b/r;->l([Ljava/lang/Object;)Lc/a/b/b/r;

    move-result-object p0

    return-object p0
.end method

.method public static r(Ljava/lang/Object;Ljava/lang/Object;)Lc/a/b/b/r;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;)",
            "Lc/a/b/b/r<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    .line 1
    invoke-static {v0}, Lc/a/b/b/r;->l([Ljava/lang/Object;)Lc/a/b/b/r;

    move-result-object p0

    return-object p0
.end method

.method public static s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lc/a/b/b/r;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;TE;TE;)",
            "Lc/a/b/b/r<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const/4 p0, 0x3

    aput-object p3, v0, p0

    const/4 p0, 0x4

    aput-object p4, v0, p0

    .line 1
    invoke-static {v0}, Lc/a/b/b/r;->l([Ljava/lang/Object;)Lc/a/b/b/r;

    move-result-object p0

    return-object p0
.end method

.method public static t(Ljava/util/Comparator;Ljava/lang/Iterable;)Lc/a/b/b/r;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TE;>;",
            "Ljava/lang/Iterable<",
            "+TE;>;)",
            "Lc/a/b/b/r<",
            "TE;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lc/a/b/a/g;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {p1}, Lc/a/b/b/w;->e(Ljava/lang/Iterable;)[Ljava/lang/Object;

    move-result-object p1

    .line 3
    invoke-static {p1}, Lc/a/b/b/i0;->b([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 4
    invoke-static {p1, p0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 5
    invoke-static {p1}, Lc/a/b/b/r;->i([Ljava/lang/Object;)Lc/a/b/b/r;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 0
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+TE;>;)Z"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final b()Lc/a/b/b/r;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc/a/b/b/r<",
            "TE;>;"
        }
    .end annotation

    return-object p0
.end method

.method c([Ljava/lang/Object;I)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    add-int v2, p2, v1

    .line 2
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, p1, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    add-int/2addr p2, v0

    return p2
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0, p1}, Lc/a/b/b/r;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param

    .line 1
    invoke-static {p0, p1}, Lc/a/b/b/z;->a(Ljava/util/List;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public h()Lc/a/b/b/u0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc/a/b/b/u0<",
            "TE;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lc/a/b/b/r;->n()Lc/a/b/b/v0;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    mul-int/lit8 v1, v1, 0x1f

    .line 2
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v1, v3

    xor-int/lit8 v1, v1, -0x1

    xor-int/lit8 v1, v1, -0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    .line 1
    :cond_0
    invoke-static {p0, p1}, Lc/a/b/b/z;->b(Ljava/util/List;Ljava/lang/Object;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/a/b/b/r;->h()Lc/a/b/b/u0;

    move-result-object v0

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    .line 1
    :cond_0
    invoke-static {p0, p1}, Lc/a/b/b/z;->d(Ljava/util/List;Ljava/lang/Object;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/a/b/b/r;->n()Lc/a/b/b/v0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lc/a/b/b/r;->o(I)Lc/a/b/b/v0;

    move-result-object p1

    return-object p1
.end method

.method public n()Lc/a/b/b/v0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc/a/b/b/v0<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lc/a/b/b/r;->o(I)Lc/a/b/b/v0;

    move-result-object v0

    return-object v0
.end method

.method public o(I)Lc/a/b/b/v0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lc/a/b/b/v0<",
            "TE;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-static {p1, v0}, Lc/a/b/a/g;->k(II)I

    .line 2
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    sget-object p1, Lc/a/b/b/r;->b:Lc/a/b/b/v0;

    return-object p1

    .line 4
    :cond_0
    new-instance v0, Lc/a/b/b/r$b;

    invoke-direct {v0, p0, p1}, Lc/a/b/b/r$b;-><init>(Lc/a/b/b/r;I)V

    return-object v0
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 0
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lc/a/b/b/r;->u(II)Lc/a/b/b/r;

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
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-static {p1, p2, v0}, Lc/a/b/a/g;->m(III)V

    sub-int v0, p2, p1

    .line 2
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    return-object p0

    :cond_0
    if-nez v0, :cond_1

    .line 3
    invoke-static {}, Lc/a/b/b/r;->p()Lc/a/b/b/r;

    move-result-object p1

    return-object p1

    .line 4
    :cond_1
    invoke-virtual {p0, p1, p2}, Lc/a/b/b/r;->v(II)Lc/a/b/b/r;

    move-result-object p1

    return-object p1
.end method

.method v(II)Lc/a/b/b/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lc/a/b/b/r<",
            "TE;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lc/a/b/b/r$c;

    sub-int/2addr p2, p1

    invoke-direct {v0, p0, p1, p2}, Lc/a/b/b/r$c;-><init>(Lc/a/b/b/r;II)V

    return-object v0
.end method
