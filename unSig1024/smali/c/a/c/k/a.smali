.class public final Lc/a/c/k/a;
.super Ljava/lang/Object;
.source "DataMatrixWriter.java"

# interfaces
.implements Lc/a/c/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static b(Lc/a/c/n/c/b;II)Lc/a/c/j/b;
    .locals 10

    .line 1
    invoke-virtual {p0}, Lc/a/c/n/c/b;->e()I

    move-result v0

    .line 2
    invoke-virtual {p0}, Lc/a/c/n/c/b;->d()I

    move-result v1

    .line 3
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 4
    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 5
    div-int v4, v2, v0

    div-int v5, v3, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    mul-int v5, v0, v4

    sub-int/2addr v2, v5

    .line 6
    div-int/lit8 v2, v2, 0x2

    mul-int v5, v1, v4

    sub-int/2addr v3, v5

    .line 7
    div-int/lit8 v3, v3, 0x2

    const/4 v5, 0x0

    if-lt p2, v1, :cond_1

    if-ge p1, v0, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    new-instance v6, Lc/a/c/j/b;

    invoke-direct {v6, p1, p2}, Lc/a/c/j/b;-><init>(II)V

    goto :goto_1

    .line 9
    :cond_1
    :goto_0
    new-instance v6, Lc/a/c/j/b;

    invoke-direct {v6, v0, v1}, Lc/a/c/j/b;-><init>(II)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 10
    :goto_1
    invoke-virtual {v6}, Lc/a/c/j/b;->b()V

    const/4 p1, 0x0

    :goto_2
    if-ge p1, v1, :cond_4

    move v7, v2

    const/4 p2, 0x0

    :goto_3
    if-ge p2, v0, :cond_3

    .line 11
    invoke-virtual {p0, p2, p1}, Lc/a/c/n/c/b;->b(II)B

    move-result v8

    const/4 v9, 0x1

    if-ne v8, v9, :cond_2

    .line 12
    invoke-virtual {v6, v7, v3, v4, v4}, Lc/a/c/j/b;->h(IIII)V

    :cond_2
    add-int/lit8 p2, p2, 0x1

    add-int/2addr v7, v4

    goto :goto_3

    :cond_3
    add-int/lit8 p1, p1, 0x1

    add-int/2addr v3, v4

    goto :goto_2

    :cond_4
    return-object v6
.end method

.method private static c(Lc/a/c/k/b/e;Lc/a/c/k/b/k;II)Lc/a/c/j/b;
    .locals 11

    .line 1
    invoke-virtual {p1}, Lc/a/c/k/b/k;->h()I

    move-result v0

    .line 2
    invoke-virtual {p1}, Lc/a/c/k/b/k;->g()I

    move-result v1

    .line 3
    new-instance v2, Lc/a/c/n/c/b;

    invoke-virtual {p1}, Lc/a/c/k/b/k;->j()I

    move-result v3

    invoke-virtual {p1}, Lc/a/c/k/b/k;->i()I

    move-result v4

    invoke-direct {v2, v3, v4}, Lc/a/c/n/c/b;-><init>(II)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v1, :cond_9

    .line 4
    iget v6, p1, Lc/a/c/k/b/k;->g:I

    rem-int v6, v4, v6

    const/4 v7, 0x1

    if-nez v6, :cond_2

    const/4 v6, 0x0

    const/4 v8, 0x0

    .line 5
    :goto_1
    invoke-virtual {p1}, Lc/a/c/k/b/k;->j()I

    move-result v9

    if-ge v6, v9, :cond_1

    .line 6
    rem-int/lit8 v9, v6, 0x2

    if-nez v9, :cond_0

    const/4 v9, 0x1

    goto :goto_2

    :cond_0
    const/4 v9, 0x0

    :goto_2
    invoke-virtual {v2, v8, v5, v9}, Lc/a/c/n/c/b;->g(IIZ)V

    add-int/2addr v8, v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v5, 0x1

    :cond_2
    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_3
    if-ge v6, v0, :cond_6

    .line 7
    iget v9, p1, Lc/a/c/k/b/k;->f:I

    rem-int v9, v6, v9

    if-nez v9, :cond_3

    .line 8
    invoke-virtual {v2, v8, v5, v7}, Lc/a/c/n/c/b;->g(IIZ)V

    add-int/lit8 v8, v8, 0x1

    .line 9
    :cond_3
    invoke-virtual {p0, v6, v4}, Lc/a/c/k/b/e;->e(II)Z

    move-result v9

    invoke-virtual {v2, v8, v5, v9}, Lc/a/c/n/c/b;->g(IIZ)V

    add-int/2addr v8, v7

    .line 10
    iget v9, p1, Lc/a/c/k/b/k;->f:I

    rem-int v10, v6, v9

    sub-int/2addr v9, v7

    if-ne v10, v9, :cond_5

    .line 11
    rem-int/lit8 v9, v4, 0x2

    if-nez v9, :cond_4

    const/4 v9, 0x1

    goto :goto_4

    :cond_4
    const/4 v9, 0x0

    :goto_4
    invoke-virtual {v2, v8, v5, v9}, Lc/a/c/n/c/b;->g(IIZ)V

    add-int/lit8 v8, v8, 0x1

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_6
    add-int/lit8 v5, v5, 0x1

    .line 12
    iget v6, p1, Lc/a/c/k/b/k;->g:I

    rem-int v8, v4, v6

    sub-int/2addr v6, v7

    if-ne v8, v6, :cond_8

    const/4 v6, 0x0

    const/4 v8, 0x0

    .line 13
    :goto_5
    invoke-virtual {p1}, Lc/a/c/k/b/k;->j()I

    move-result v9

    if-ge v6, v9, :cond_7

    .line 14
    invoke-virtual {v2, v8, v5, v7}, Lc/a/c/n/c/b;->g(IIZ)V

    add-int/2addr v8, v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_7
    add-int/lit8 v5, v5, 0x1

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 15
    :cond_9
    invoke-static {v2, p2, p3}, Lc/a/c/k/a;->b(Lc/a/c/n/c/b;II)Lc/a/c/j/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Lc/a/c/a;IILjava/util/Map;)Lc/a/c/j/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lc/a/c/a;",
            "II",
            "Ljava/util/Map<",
            "Lc/a/c/c;",
            "*>;)",
            "Lc/a/c/j/b;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 2
    sget-object v0, Lc/a/c/a;->f:Lc/a/c/a;

    if-ne p2, v0, :cond_5

    if-ltz p3, :cond_4

    if-ltz p4, :cond_4

    .line 3
    sget-object p2, Lc/a/c/k/b/l;->a:Lc/a/c/k/b/l;

    const/4 v0, 0x0

    if-eqz p5, :cond_3

    .line 4
    sget-object v1, Lc/a/c/c;->c:Lc/a/c/c;

    invoke-interface {p5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/c/k/b/l;

    if-eqz v1, :cond_0

    move-object p2, v1

    .line 5
    :cond_0
    sget-object v1, Lc/a/c/c;->d:Lc/a/c/c;

    invoke-interface {p5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/c/b;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v0

    .line 6
    :goto_0
    sget-object v2, Lc/a/c/c;->e:Lc/a/c/c;

    invoke-interface {p5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lc/a/c/b;

    if-eqz p5, :cond_2

    goto :goto_1

    :cond_2
    move-object p5, v0

    :goto_1
    move-object v0, v1

    goto :goto_2

    :cond_3
    move-object p5, v0

    .line 7
    :goto_2
    invoke-static {p1, p2, v0, p5}, Lc/a/c/k/b/j;->b(Ljava/lang/String;Lc/a/c/k/b/l;Lc/a/c/b;Lc/a/c/b;)Ljava/lang/String;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    invoke-static {v1, p2, v0, p5, v2}, Lc/a/c/k/b/k;->l(ILc/a/c/k/b/l;Lc/a/c/b;Lc/a/c/b;Z)Lc/a/c/k/b/k;

    move-result-object p2

    .line 9
    invoke-static {p1, p2}, Lc/a/c/k/b/i;->c(Ljava/lang/String;Lc/a/c/k/b/k;)Ljava/lang/String;

    move-result-object p1

    .line 10
    new-instance p5, Lc/a/c/k/b/e;

    invoke-virtual {p2}, Lc/a/c/k/b/k;->h()I

    move-result v0

    invoke-virtual {p2}, Lc/a/c/k/b/k;->g()I

    move-result v1

    invoke-direct {p5, p1, v0, v1}, Lc/a/c/k/b/e;-><init>(Ljava/lang/CharSequence;II)V

    .line 11
    invoke-virtual {p5}, Lc/a/c/k/b/e;->h()V

    .line 12
    invoke-static {p5, p2, p3, p4}, Lc/a/c/k/a;->c(Lc/a/c/k/b/e;Lc/a/c/k/b/k;II)Lc/a/c/j/b;

    move-result-object p1

    return-object p1

    .line 13
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p5, "Requested dimensions can\'t be negative: "

    invoke-direct {p2, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p3, 0x78

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 14
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "Can only encode DATA_MATRIX, but got "

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 15
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Found empty contents"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
