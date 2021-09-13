.class final Lc/a/c/i/b/f;
.super Ljava/lang/Object;
.source "State.java"


# static fields
.field static final a:Lc/a/c/i/b/f;


# instance fields
.field private final b:I

.field private final c:Lc/a/c/i/b/g;

.field private final d:I

.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lc/a/c/i/b/f;

    sget-object v1, Lc/a/c/i/b/g;->a:Lc/a/c/i/b/g;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, Lc/a/c/i/b/f;-><init>(Lc/a/c/i/b/g;III)V

    sput-object v0, Lc/a/c/i/b/f;->a:Lc/a/c/i/b/f;

    return-void
.end method

.method private constructor <init>(Lc/a/c/i/b/g;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/c/i/b/f;->c:Lc/a/c/i/b/g;

    .line 3
    iput p2, p0, Lc/a/c/i/b/f;->b:I

    .line 4
    iput p3, p0, Lc/a/c/i/b/f;->d:I

    .line 5
    iput p4, p0, Lc/a/c/i/b/f;->e:I

    return-void
.end method

.method private static b(Lc/a/c/i/b/f;)I
    .locals 1

    .line 1
    iget p0, p0, Lc/a/c/i/b/f;->d:I

    const/16 v0, 0x3e

    if-le p0, v0, :cond_0

    const/16 p0, 0x15

    return p0

    :cond_0
    const/16 v0, 0x1f

    if-le p0, v0, :cond_1

    const/16 p0, 0x14

    return p0

    :cond_1
    if-lez p0, :cond_2

    const/16 p0, 0xa

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method a(I)Lc/a/c/i/b/f;
    .locals 6

    .line 1
    iget-object v0, p0, Lc/a/c/i/b/f;->c:Lc/a/c/i/b/g;

    .line 2
    iget v1, p0, Lc/a/c/i/b/f;->b:I

    .line 3
    iget v2, p0, Lc/a/c/i/b/f;->e:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    if-eq v1, v4, :cond_0

    const/4 v4, 0x2

    if-ne v1, v4, :cond_1

    .line 4
    :cond_0
    sget-object v4, Lc/a/c/i/b/d;->b:[[I

    aget-object v1, v4, v1

    aget v1, v1, v3

    const v4, 0xffff

    and-int/2addr v4, v1

    shr-int/lit8 v1, v1, 0x10

    .line 5
    invoke-virtual {v0, v4, v1}, Lc/a/c/i/b/g;->a(II)Lc/a/c/i/b/g;

    move-result-object v0

    add-int/2addr v2, v1

    const/4 v1, 0x0

    .line 6
    :cond_1
    iget v3, p0, Lc/a/c/i/b/f;->d:I

    if-eqz v3, :cond_4

    const/16 v4, 0x1f

    if-ne v3, v4, :cond_2

    goto :goto_0

    :cond_2
    const/16 v4, 0x3e

    if-ne v3, v4, :cond_3

    const/16 v4, 0x9

    goto :goto_1

    :cond_3
    const/16 v4, 0x8

    goto :goto_1

    :cond_4
    :goto_0
    const/16 v4, 0x12

    .line 7
    :goto_1
    new-instance v5, Lc/a/c/i/b/f;

    add-int/lit8 v3, v3, 0x1

    add-int/2addr v2, v4

    invoke-direct {v5, v0, v1, v3, v2}, Lc/a/c/i/b/f;-><init>(Lc/a/c/i/b/g;III)V

    .line 8
    iget v0, v5, Lc/a/c/i/b/f;->d:I

    const/16 v1, 0x81e

    if-ne v0, v1, :cond_5

    add-int/lit8 p1, p1, 0x1

    .line 9
    invoke-virtual {v5, p1}, Lc/a/c/i/b/f;->c(I)Lc/a/c/i/b/f;

    move-result-object v5

    :cond_5
    return-object v5
.end method

.method c(I)Lc/a/c/i/b/f;
    .locals 4

    .line 1
    iget v0, p0, Lc/a/c/i/b/f;->d:I

    if-nez v0, :cond_0

    return-object p0

    .line 2
    :cond_0
    iget-object v1, p0, Lc/a/c/i/b/f;->c:Lc/a/c/i/b/g;

    sub-int/2addr p1, v0

    .line 3
    invoke-virtual {v1, p1, v0}, Lc/a/c/i/b/g;->b(II)Lc/a/c/i/b/g;

    move-result-object p1

    .line 4
    new-instance v0, Lc/a/c/i/b/f;

    iget v1, p0, Lc/a/c/i/b/f;->b:I

    const/4 v2, 0x0

    iget v3, p0, Lc/a/c/i/b/f;->e:I

    invoke-direct {v0, p1, v1, v2, v3}, Lc/a/c/i/b/f;-><init>(Lc/a/c/i/b/g;III)V

    return-object v0
.end method

.method d()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/c/i/b/f;->d:I

    return v0
.end method

.method e()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/c/i/b/f;->e:I

    return v0
.end method

.method f()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/c/i/b/f;->b:I

    return v0
.end method

.method g(Lc/a/c/i/b/f;)Z
    .locals 3

    .line 1
    iget v0, p0, Lc/a/c/i/b/f;->e:I

    sget-object v1, Lc/a/c/i/b/d;->b:[[I

    iget v2, p0, Lc/a/c/i/b/f;->b:I

    aget-object v1, v1, v2

    iget v2, p1, Lc/a/c/i/b/f;->b:I

    aget v1, v1, v2

    shr-int/lit8 v1, v1, 0x10

    add-int/2addr v0, v1

    .line 2
    iget v1, p0, Lc/a/c/i/b/f;->d:I

    iget v2, p1, Lc/a/c/i/b/f;->d:I

    if-ge v1, v2, :cond_0

    .line 3
    invoke-static {p1}, Lc/a/c/i/b/f;->b(Lc/a/c/i/b/f;)I

    move-result v1

    invoke-static {p0}, Lc/a/c/i/b/f;->b(Lc/a/c/i/b/f;)I

    move-result v2

    sub-int/2addr v1, v2

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    if-le v1, v2, :cond_1

    if-lez v2, :cond_1

    add-int/lit8 v0, v0, 0xa

    .line 4
    :cond_1
    :goto_0
    iget p1, p1, Lc/a/c/i/b/f;->e:I

    if-gt v0, p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method h(II)Lc/a/c/i/b/f;
    .locals 4

    .line 1
    iget v0, p0, Lc/a/c/i/b/f;->e:I

    .line 2
    iget-object v1, p0, Lc/a/c/i/b/f;->c:Lc/a/c/i/b/g;

    .line 3
    iget v2, p0, Lc/a/c/i/b/f;->b:I

    if-eq p1, v2, :cond_0

    .line 4
    sget-object v3, Lc/a/c/i/b/d;->b:[[I

    aget-object v2, v3, v2

    aget v2, v2, p1

    const v3, 0xffff

    and-int/2addr v3, v2

    shr-int/lit8 v2, v2, 0x10

    .line 5
    invoke-virtual {v1, v3, v2}, Lc/a/c/i/b/g;->a(II)Lc/a/c/i/b/g;

    move-result-object v1

    add-int/2addr v0, v2

    :cond_0
    const/4 v2, 0x2

    if-ne p1, v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x5

    .line 6
    :goto_0
    invoke-virtual {v1, p2, v2}, Lc/a/c/i/b/g;->a(II)Lc/a/c/i/b/g;

    move-result-object p2

    .line 7
    new-instance v1, Lc/a/c/i/b/f;

    const/4 v3, 0x0

    add-int/2addr v0, v2

    invoke-direct {v1, p2, p1, v3, v0}, Lc/a/c/i/b/f;-><init>(Lc/a/c/i/b/g;III)V

    return-object v1
.end method

.method i(II)Lc/a/c/i/b/f;
    .locals 5

    .line 1
    iget-object v0, p0, Lc/a/c/i/b/f;->c:Lc/a/c/i/b/g;

    .line 2
    iget v1, p0, Lc/a/c/i/b/f;->b:I

    const/4 v2, 0x5

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x5

    .line 3
    :goto_0
    sget-object v4, Lc/a/c/i/b/d;->d:[[I

    aget-object v1, v4, v1

    aget p1, v1, p1

    invoke-virtual {v0, p1, v3}, Lc/a/c/i/b/g;->a(II)Lc/a/c/i/b/g;

    move-result-object p1

    .line 4
    invoke-virtual {p1, p2, v2}, Lc/a/c/i/b/g;->a(II)Lc/a/c/i/b/g;

    move-result-object p1

    .line 5
    new-instance p2, Lc/a/c/i/b/f;

    iget v0, p0, Lc/a/c/i/b/f;->b:I

    const/4 v1, 0x0

    iget v4, p0, Lc/a/c/i/b/f;->e:I

    add-int/2addr v4, v3

    add-int/2addr v4, v2

    invoke-direct {p2, p1, v0, v1, v4}, Lc/a/c/i/b/f;-><init>(Lc/a/c/i/b/g;III)V

    return-object p2
.end method

.method j([B)Lc/a/c/j/a;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 2
    array-length v1, p1

    invoke-virtual {p0, v1}, Lc/a/c/i/b/f;->c(I)Lc/a/c/i/b/f;

    move-result-object v1

    iget-object v1, v1, Lc/a/c/i/b/f;->c:Lc/a/c/i/b/g;

    :goto_0
    if-eqz v1, :cond_0

    .line 3
    invoke-interface {v0, v1}, Ljava/util/Deque;->addFirst(Ljava/lang/Object;)V

    .line 4
    invoke-virtual {v1}, Lc/a/c/i/b/g;->d()Lc/a/c/i/b/g;

    move-result-object v1

    goto :goto_0

    .line 5
    :cond_0
    new-instance v1, Lc/a/c/j/a;

    invoke-direct {v1}, Lc/a/c/j/a;-><init>()V

    .line 6
    invoke-interface {v0}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/a/c/i/b/g;

    .line 7
    invoke-virtual {v2, v1, p1}, Lc/a/c/i/b/g;->c(Lc/a/c/j/a;[B)V

    goto :goto_1

    :cond_1
    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    sget-object v1, Lc/a/c/i/b/d;->a:[Ljava/lang/String;

    iget v2, p0, Lc/a/c/i/b/f;->b:I

    aget-object v1, v1, v2

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Lc/a/c/i/b/f;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget v1, p0, Lc/a/c/i/b/f;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "%s bits=%d bytes=%d"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
