.class Lc/a/b/b/k;
.super Ljava/util/AbstractMap;
.source "CompactHashMap.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/b/b/k$h;,
        Lc/a/b/b/k$g;,
        Lc/a/b/b/k$d;,
        Lc/a/b/b/k$f;,
        Lc/a/b/b/k$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractMap<",
        "TK;TV;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field private transient a:[I
    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/MonotonicNonNullDecl;
    .end annotation
.end field

.field transient b:[J
    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/MonotonicNonNullDecl;
    .end annotation
.end field

.field transient c:[Ljava/lang/Object;
    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/MonotonicNonNullDecl;
    .end annotation
.end field

.field transient d:[Ljava/lang/Object;
    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/MonotonicNonNullDecl;
    .end annotation
.end field

.field transient e:F

.field transient f:I

.field private transient g:I

.field private transient h:I

.field private transient i:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/MonotonicNonNullDecl;
    .end annotation
.end field

.field private transient j:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/MonotonicNonNullDecl;
    .end annotation
.end field

.field private transient k:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/MonotonicNonNullDecl;
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    const/4 v0, 0x3

    const/high16 v1, 0x3f800000    # 1.0f

    .line 2
    invoke-virtual {p0, v0, v1}, Lc/a/b/b/k;->q(IF)V

    return-void
.end method

.method private A(I)V
    .locals 11

    .line 1
    iget-object v0, p0, Lc/a/b/b/k;->a:[I

    .line 2
    array-length v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    if-lt v0, v1, :cond_0

    const p1, 0x7fffffff

    .line 3
    iput p1, p0, Lc/a/b/b/k;->g:I

    return-void

    :cond_0
    int-to-float v0, p1

    .line 4
    iget v1, p0, Lc/a/b/b/k;->e:F

    mul-float v0, v0, v1

    float-to-int v0, v0

    add-int/lit8 v0, v0, 0x1

    .line 5
    invoke-static {p1}, Lc/a/b/b/k;->v(I)[I

    move-result-object p1

    .line 6
    iget-object v1, p0, Lc/a/b/b/k;->b:[J

    .line 7
    array-length v2, p1

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x0

    .line 8
    :goto_0
    iget v4, p0, Lc/a/b/b/k;->h:I

    if-ge v3, v4, :cond_1

    .line 9
    aget-wide v4, v1, v3

    .line 10
    invoke-static {v4, v5}, Lc/a/b/b/k;->l(J)I

    move-result v4

    and-int v5, v4, v2

    .line 11
    aget v6, p1, v5

    .line 12
    aput v3, p1, v5

    int-to-long v4, v4

    const/16 v7, 0x20

    shl-long/2addr v4, v7

    const-wide v7, 0xffffffffL

    int-to-long v9, v6

    and-long/2addr v7, v9

    or-long/2addr v4, v7

    .line 13
    aput-wide v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 14
    :cond_1
    iput v0, p0, Lc/a/b/b/k;->g:I

    .line 15
    iput-object p1, p0, Lc/a/b/b/k;->a:[I

    return-void
.end method

.method private static B(JI)J
    .locals 4

    const-wide v0, -0x100000000L

    and-long/2addr p0, v0

    int-to-long v0, p2

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    or-long/2addr p0, v0

    return-wide p0
.end method

.method static synthetic a(Lc/a/b/b/k;I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lc/a/b/b/k;->x(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lc/a/b/b/k;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/b/b/k;->h:I

    return p0
.end method

.method static synthetic c(Lc/a/b/b/k;Ljava/lang/Object;)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lc/a/b/b/k;->p(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static f()Lc/a/b/b/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lc/a/b/b/k<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lc/a/b/b/k;

    invoke-direct {v0}, Lc/a/b/b/k;-><init>()V

    return-object v0
.end method

.method private static l(J)I
    .locals 1

    const/16 v0, 0x20

    ushr-long/2addr p0, v0

    long-to-int p1, p0

    return p1
.end method

.method private static m(J)I
    .locals 0

    long-to-int p1, p0

    return p1
.end method

.method private o()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/b/b/k;->a:[I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method private p(Ljava/lang/Object;)I
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param

    .line 1
    invoke-static {p1}, Lc/a/b/b/o;->c(Ljava/lang/Object;)I

    move-result v0

    .line 2
    iget-object v1, p0, Lc/a/b/b/k;->a:[I

    invoke-direct {p0}, Lc/a/b/b/k;->o()I

    move-result v2

    and-int/2addr v2, v0

    aget v1, v1, v2

    :goto_0
    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    .line 3
    iget-object v2, p0, Lc/a/b/b/k;->b:[J

    aget-wide v3, v2, v1

    .line 4
    invoke-static {v3, v4}, Lc/a/b/b/k;->l(J)I

    move-result v2

    if-ne v2, v0, :cond_0

    iget-object v2, p0, Lc/a/b/b/k;->c:[Ljava/lang/Object;

    aget-object v2, v2, v1

    invoke-static {p1, v2}, Lc/a/b/a/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    .line 5
    :cond_0
    invoke-static {v3, v4}, Lc/a/b/b/k;->m(J)I

    move-result v1

    goto :goto_0

    :cond_1
    return v2
.end method

.method private static u(I)[J
    .locals 2

    .line 1
    new-array p0, p0, [J

    const-wide/16 v0, -0x1

    .line 2
    invoke-static {p0, v0, v1}, Ljava/util/Arrays;->fill([JJ)V

    return-object p0
.end method

.method private static v(I)[I
    .locals 1

    .line 1
    new-array p0, p0, [I

    const/4 v0, -0x1

    .line 2
    invoke-static {p0, v0}, Ljava/util/Arrays;->fill([II)V

    return-object p0
.end method

.method private w(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 9
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I)TV;"
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
    .end annotation

    .line 1
    invoke-direct {p0}, Lc/a/b/b/k;->o()I

    move-result v0

    and-int/2addr v0, p2

    .line 2
    iget-object v1, p0, Lc/a/b/b/k;->a:[I

    aget v1, v1, v0

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    return-object v2

    :cond_0
    const/4 v4, -0x1

    .line 3
    :goto_0
    iget-object v5, p0, Lc/a/b/b/k;->b:[J

    aget-wide v6, v5, v1

    invoke-static {v6, v7}, Lc/a/b/b/k;->l(J)I

    move-result v5

    if-ne v5, p2, :cond_2

    .line 4
    iget-object v5, p0, Lc/a/b/b/k;->c:[Ljava/lang/Object;

    aget-object v5, v5, v1

    invoke-static {p1, v5}, Lc/a/b/a/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 5
    iget-object p1, p0, Lc/a/b/b/k;->d:[Ljava/lang/Object;

    aget-object p1, p1, v1

    if-ne v4, v3, :cond_1

    .line 6
    iget-object p2, p0, Lc/a/b/b/k;->a:[I

    iget-object v2, p0, Lc/a/b/b/k;->b:[J

    aget-wide v3, v2, v1

    invoke-static {v3, v4}, Lc/a/b/b/k;->m(J)I

    move-result v2

    aput v2, p2, v0

    goto :goto_1

    .line 7
    :cond_1
    iget-object p2, p0, Lc/a/b/b/k;->b:[J

    aget-wide v2, p2, v4

    aget-wide v5, p2, v1

    invoke-static {v5, v6}, Lc/a/b/b/k;->m(J)I

    move-result v0

    invoke-static {v2, v3, v0}, Lc/a/b/b/k;->B(JI)J

    move-result-wide v2

    aput-wide v2, p2, v4

    .line 8
    :goto_1
    invoke-virtual {p0, v1}, Lc/a/b/b/k;->t(I)V

    .line 9
    iget p2, p0, Lc/a/b/b/k;->h:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p0, Lc/a/b/b/k;->h:I

    .line 10
    iget p2, p0, Lc/a/b/b/k;->f:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lc/a/b/b/k;->f:I

    return-object p1

    .line 11
    :cond_2
    iget-object v4, p0, Lc/a/b/b/k;->b:[J

    aget-wide v5, v4, v1

    invoke-static {v5, v6}, Lc/a/b/b/k;->m(J)I

    move-result v4

    if-ne v4, v3, :cond_3

    return-object v2

    :cond_3
    move v8, v4

    move v4, v1

    move v1, v8

    goto :goto_0
.end method

.method private x(I)Ljava/lang/Object;
    .locals 4
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/b/k;->c:[Ljava/lang/Object;

    aget-object v0, v0, p1

    iget-object v1, p0, Lc/a/b/b/k;->b:[J

    aget-wide v2, v1, p1

    invoke-static {v2, v3}, Lc/a/b/b/k;->l(J)I

    move-result p1

    invoke-direct {p0, v0, p1}, Lc/a/b/b/k;->w(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private z(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/b/b/k;->b:[J

    array-length v0, v0

    if-le p1, v0, :cond_1

    ushr-int/lit8 p1, v0, 0x1

    const/4 v1, 0x1

    .line 2
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/2addr p1, v0

    if-gez p1, :cond_0

    const p1, 0x7fffffff

    :cond_0
    if-eq p1, v0, :cond_1

    .line 3
    invoke-virtual {p0, p1}, Lc/a/b/b/k;->y(I)V

    :cond_1
    return-void
.end method


# virtual methods
.method C()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TV;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lc/a/b/b/k$c;

    invoke-direct {v0, p0}, Lc/a/b/b/k$c;-><init>(Lc/a/b/b/k;)V

    return-object v0
.end method

.method public clear()V
    .locals 5

    .line 1
    iget v0, p0, Lc/a/b/b/k;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lc/a/b/b/k;->f:I

    .line 2
    iget-object v0, p0, Lc/a/b/b/k;->c:[Ljava/lang/Object;

    iget v1, p0, Lc/a/b/b/k;->h:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v1, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 3
    iget-object v0, p0, Lc/a/b/b/k;->d:[Ljava/lang/Object;

    iget v1, p0, Lc/a/b/b/k;->h:I

    invoke-static {v0, v2, v1, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 4
    iget-object v0, p0, Lc/a/b/b/k;->a:[I

    const/4 v1, -0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 5
    iget-object v0, p0, Lc/a/b/b/k;->b:[J

    const-wide/16 v3, -0x1

    invoke-static {v0, v3, v4}, Ljava/util/Arrays;->fill([JJ)V

    .line 6
    iput v2, p0, Lc/a/b/b/k;->h:I

    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lc/a/b/b/k;->p(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    iget v2, p0, Lc/a/b/b/k;->h:I

    if-ge v1, v2, :cond_1

    .line 2
    iget-object v2, p0, Lc/a/b/b/k;->d:[Ljava/lang/Object;

    aget-object v2, v2, v1

    invoke-static {p1, v2}, Lc/a/b/a/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method d(I)V
    .locals 0

    return-void
.end method

.method e(II)I
    .locals 0

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public entrySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/b/k;->j:Ljava/util/Set;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lc/a/b/b/k;->g()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lc/a/b/b/k;->j:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method g()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lc/a/b/b/k$d;

    invoke-direct {v0, p0}, Lc/a/b/b/k$d;-><init>(Lc/a/b/b/k;)V

    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lc/a/b/b/k;->p(Ljava/lang/Object;)I

    move-result p1

    .line 2
    invoke-virtual {p0, p1}, Lc/a/b/b/k;->d(I)V

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/a/b/b/k;->d:[Ljava/lang/Object;

    aget-object p1, v0, p1

    :goto_0
    return-object p1
.end method

.method h()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lc/a/b/b/k$f;

    invoke-direct {v0, p0}, Lc/a/b/b/k$f;-><init>(Lc/a/b/b/k;)V

    return-object v0
.end method

.method i()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lc/a/b/b/k$h;

    invoke-direct {v0, p0}, Lc/a/b/b/k$h;-><init>(Lc/a/b/b/k;)V

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    iget v0, p0, Lc/a/b/b/k;->h:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method j()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lc/a/b/b/k$b;

    invoke-direct {v0, p0}, Lc/a/b/b/k$b;-><init>(Lc/a/b/b/k;)V

    return-object v0
.end method

.method k()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/a/b/b/k;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/b/k;->i:Ljava/util/Set;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lc/a/b/b/k;->h()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lc/a/b/b/k;->i:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method n(I)I
    .locals 1

    add-int/lit8 p1, p1, 0x1

    .line 1
    iget v0, p0, Lc/a/b/b/k;->h:I

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/b/k;->b:[J

    .line 2
    iget-object v1, p0, Lc/a/b/b/k;->c:[Ljava/lang/Object;

    .line 3
    iget-object v2, p0, Lc/a/b/b/k;->d:[Ljava/lang/Object;

    .line 4
    invoke-static {p1}, Lc/a/b/b/o;->c(Ljava/lang/Object;)I

    move-result v3

    .line 5
    invoke-direct {p0}, Lc/a/b/b/k;->o()I

    move-result v4

    and-int/2addr v4, v3

    .line 6
    iget v5, p0, Lc/a/b/b/k;->h:I

    .line 7
    iget-object v6, p0, Lc/a/b/b/k;->a:[I

    aget v7, v6, v4

    const/4 v8, -0x1

    if-ne v7, v8, :cond_0

    .line 8
    aput v5, v6, v4

    goto :goto_1

    .line 9
    :cond_0
    :goto_0
    aget-wide v9, v0, v7

    .line 10
    invoke-static {v9, v10}, Lc/a/b/b/k;->l(J)I

    move-result v4

    if-ne v4, v3, :cond_1

    aget-object v4, v1, v7

    invoke-static {p1, v4}, Lc/a/b/a/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 11
    aget-object p1, v2, v7

    .line 12
    aput-object p2, v2, v7

    .line 13
    invoke-virtual {p0, v7}, Lc/a/b/b/k;->d(I)V

    return-object p1

    .line 14
    :cond_1
    invoke-static {v9, v10}, Lc/a/b/b/k;->m(J)I

    move-result v4

    if-ne v4, v8, :cond_4

    .line 15
    invoke-static {v9, v10, v5}, Lc/a/b/b/k;->B(JI)J

    move-result-wide v1

    aput-wide v1, v0, v7

    :goto_1
    const v0, 0x7fffffff

    if-eq v5, v0, :cond_3

    add-int/lit8 v0, v5, 0x1

    .line 16
    invoke-direct {p0, v0}, Lc/a/b/b/k;->z(I)V

    .line 17
    invoke-virtual {p0, v5, p1, p2, v3}, Lc/a/b/b/k;->r(ILjava/lang/Object;Ljava/lang/Object;I)V

    .line 18
    iput v0, p0, Lc/a/b/b/k;->h:I

    .line 19
    iget p1, p0, Lc/a/b/b/k;->g:I

    if-lt v5, p1, :cond_2

    .line 20
    iget-object p1, p0, Lc/a/b/b/k;->a:[I

    array-length p1, p1

    mul-int/lit8 p1, p1, 0x2

    invoke-direct {p0, p1}, Lc/a/b/b/k;->A(I)V

    .line 21
    :cond_2
    iget p1, p0, Lc/a/b/b/k;->f:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lc/a/b/b/k;->f:I

    const/4 p1, 0x0

    return-object p1

    .line 22
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot contain more than Integer.MAX_VALUE elements!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    move v7, v4

    goto :goto_0
.end method

.method q(IF)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ltz p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v3, "Initial capacity must be non-negative"

    .line 1
    invoke-static {v2, v3}, Lc/a/b/a/g;->e(ZLjava/lang/Object;)V

    const/4 v2, 0x0

    cmpl-float v2, p2, v2

    if-lez v2, :cond_1

    const/4 v0, 0x1

    :cond_1
    const-string v2, "Illegal load factor"

    .line 2
    invoke-static {v0, v2}, Lc/a/b/a/g;->e(ZLjava/lang/Object;)V

    float-to-double v2, p2

    .line 3
    invoke-static {p1, v2, v3}, Lc/a/b/b/o;->a(ID)I

    move-result v0

    .line 4
    invoke-static {v0}, Lc/a/b/b/k;->v(I)[I

    move-result-object v2

    iput-object v2, p0, Lc/a/b/b/k;->a:[I

    .line 5
    iput p2, p0, Lc/a/b/b/k;->e:F

    .line 6
    new-array v2, p1, [Ljava/lang/Object;

    iput-object v2, p0, Lc/a/b/b/k;->c:[Ljava/lang/Object;

    .line 7
    new-array v2, p1, [Ljava/lang/Object;

    iput-object v2, p0, Lc/a/b/b/k;->d:[Ljava/lang/Object;

    .line 8
    invoke-static {p1}, Lc/a/b/b/k;->u(I)[J

    move-result-object p1

    iput-object p1, p0, Lc/a/b/b/k;->b:[J

    int-to-float p1, v0

    mul-float p1, p1, p2

    float-to-int p1, p1

    .line 9
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lc/a/b/b/k;->g:I

    return-void
.end method

.method r(ILjava/lang/Object;Ljava/lang/Object;I)V
    .locals 5
    .param p2    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITK;TV;I)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/b/k;->b:[J

    int-to-long v1, p4

    const/16 p4, 0x20

    shl-long/2addr v1, p4

    const-wide v3, 0xffffffffL

    or-long/2addr v1, v3

    aput-wide v1, v0, p1

    .line 2
    iget-object p4, p0, Lc/a/b/b/k;->c:[Ljava/lang/Object;

    aput-object p2, p4, p1

    .line 3
    iget-object p2, p0, Lc/a/b/b/k;->d:[Ljava/lang/Object;

    aput-object p3, p2, p1

    return-void
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
    .end annotation

    .line 1
    invoke-static {p1}, Lc/a/b/b/o;->c(Ljava/lang/Object;)I

    move-result v0

    invoke-direct {p0, p1, v0}, Lc/a/b/b/k;->w(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method s()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TK;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lc/a/b/b/k$a;

    invoke-direct {v0, p0}, Lc/a/b/b/k$a;-><init>(Lc/a/b/b/k;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/b/b/k;->h:I

    return v0
.end method

.method t(I)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lc/a/b/b/k;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const-wide/16 v1, -0x1

    const/4 v3, 0x0

    if-ge p1, v0, :cond_2

    .line 2
    iget-object v4, p0, Lc/a/b/b/k;->c:[Ljava/lang/Object;

    aget-object v5, v4, v0

    aput-object v5, v4, p1

    .line 3
    iget-object v5, p0, Lc/a/b/b/k;->d:[Ljava/lang/Object;

    aget-object v6, v5, v0

    aput-object v6, v5, p1

    .line 4
    aput-object v3, v4, v0

    .line 5
    aput-object v3, v5, v0

    .line 6
    iget-object v3, p0, Lc/a/b/b/k;->b:[J

    aget-wide v4, v3, v0

    .line 7
    aput-wide v4, v3, p1

    .line 8
    aput-wide v1, v3, v0

    .line 9
    invoke-static {v4, v5}, Lc/a/b/b/k;->l(J)I

    move-result v1

    invoke-direct {p0}, Lc/a/b/b/k;->o()I

    move-result v2

    and-int/2addr v1, v2

    .line 10
    iget-object v2, p0, Lc/a/b/b/k;->a:[I

    aget v3, v2, v1

    if-ne v3, v0, :cond_0

    .line 11
    aput p1, v2, v1

    goto :goto_1

    .line 12
    :cond_0
    :goto_0
    iget-object v1, p0, Lc/a/b/b/k;->b:[J

    aget-wide v4, v1, v3

    invoke-static {v4, v5}, Lc/a/b/b/k;->m(J)I

    move-result v1

    if-ne v1, v0, :cond_1

    .line 13
    iget-object v0, p0, Lc/a/b/b/k;->b:[J

    invoke-static {v4, v5, p1}, Lc/a/b/b/k;->B(JI)J

    move-result-wide v1

    aput-wide v1, v0, v3

    goto :goto_1

    :cond_1
    move v3, v1

    goto :goto_0

    .line 14
    :cond_2
    iget-object v0, p0, Lc/a/b/b/k;->c:[Ljava/lang/Object;

    aput-object v3, v0, p1

    .line 15
    iget-object v0, p0, Lc/a/b/b/k;->d:[Ljava/lang/Object;

    aput-object v3, v0, p1

    .line 16
    iget-object v0, p0, Lc/a/b/b/k;->b:[J

    aput-wide v1, v0, p1

    :goto_1
    return-void
.end method

.method public values()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/b/k;->k:Ljava/util/Collection;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lc/a/b/b/k;->i()Ljava/util/Collection;

    move-result-object v0

    iput-object v0, p0, Lc/a/b/b/k;->k:Ljava/util/Collection;

    :cond_0
    return-object v0
.end method

.method y(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/b/b/k;->c:[Ljava/lang/Object;

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lc/a/b/b/k;->c:[Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lc/a/b/b/k;->d:[Ljava/lang/Object;

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lc/a/b/b/k;->d:[Ljava/lang/Object;

    .line 3
    iget-object v0, p0, Lc/a/b/b/k;->b:[J

    .line 4
    array-length v1, v0

    .line 5
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    if-le p1, v1, :cond_0

    const-wide/16 v2, -0x1

    .line 6
    invoke-static {v0, v1, p1, v2, v3}, Ljava/util/Arrays;->fill([JIIJ)V

    .line 7
    :cond_0
    iput-object v0, p0, Lc/a/b/b/k;->b:[J

    return-void
.end method
