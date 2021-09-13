.class final Lc/a/a/a/k2/t/f;
.super Ljava/lang/Object;
.source "TtmlRenderUtil.java"


# direct methods
.method public static a(Landroid/text/Spannable;IILc/a/a/a/k2/t/g;Lc/a/a/a/k2/t/d;Ljava/util/Map;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/text/Spannable;",
            "II",
            "Lc/a/a/a/k2/t/g;",
            "Lc/a/a/a/k2/t/d;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc/a/a/a/k2/t/g;",
            ">;I)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p3}, Lc/a/a/a/k2/t/g;->k()I

    move-result v0

    const/4 v1, -0x1

    const/16 v2, 0x21

    if-eq v0, v1, :cond_0

    .line 2
    new-instance v0, Landroid/text/style/StyleSpan;

    invoke-virtual {p3}, Lc/a/a/a/k2/t/g;->k()I

    move-result v3

    invoke-direct {v0, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-interface {p0, v0, p1, p2, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 3
    :cond_0
    invoke-virtual {p3}, Lc/a/a/a/k2/t/g;->r()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    new-instance v0, Landroid/text/style/StrikethroughSpan;

    invoke-direct {v0}, Landroid/text/style/StrikethroughSpan;-><init>()V

    invoke-interface {p0, v0, p1, p2, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 5
    :cond_1
    invoke-virtual {p3}, Lc/a/a/a/k2/t/g;->s()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    new-instance v0, Landroid/text/style/UnderlineSpan;

    invoke-direct {v0}, Landroid/text/style/UnderlineSpan;-><init>()V

    invoke-interface {p0, v0, p1, p2, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 7
    :cond_2
    invoke-virtual {p3}, Lc/a/a/a/k2/t/g;->p()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 8
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    .line 9
    invoke-virtual {p3}, Lc/a/a/a/k2/t/g;->c()I

    move-result v3

    invoke-direct {v0, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 10
    invoke-static {p0, v0, p1, p2, v2}, Lc/a/a/a/k2/q/c;->a(Landroid/text/Spannable;Ljava/lang/Object;III)V

    .line 11
    :cond_3
    invoke-virtual {p3}, Lc/a/a/a/k2/t/g;->o()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 12
    new-instance v0, Landroid/text/style/BackgroundColorSpan;

    .line 13
    invoke-virtual {p3}, Lc/a/a/a/k2/t/g;->b()I

    move-result v3

    invoke-direct {v0, v3}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 14
    invoke-static {p0, v0, p1, p2, v2}, Lc/a/a/a/k2/q/c;->a(Landroid/text/Spannable;Ljava/lang/Object;III)V

    .line 15
    :cond_4
    invoke-virtual {p3}, Lc/a/a/a/k2/t/g;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 16
    new-instance v0, Landroid/text/style/TypefaceSpan;

    .line 17
    invoke-virtual {p3}, Lc/a/a/a/k2/t/g;->d()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 18
    invoke-static {p0, v0, p1, p2, v2}, Lc/a/a/a/k2/q/c;->a(Landroid/text/Spannable;Ljava/lang/Object;III)V

    .line 19
    :cond_5
    invoke-virtual {p3}, Lc/a/a/a/k2/t/g;->n()Lc/a/a/a/k2/t/b;

    move-result-object v0

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v0, :cond_a

    .line 20
    invoke-virtual {p3}, Lc/a/a/a/k2/t/g;->n()Lc/a/a/a/k2/t/b;

    move-result-object v0

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/k2/t/b;

    .line 21
    iget v6, v0, Lc/a/a/a/k2/t/b;->f:I

    if-ne v6, v1, :cond_8

    if-eq p6, v4, :cond_7

    if-ne p6, v5, :cond_6

    goto :goto_0

    :cond_6
    const/4 v6, 0x1

    goto :goto_1

    :cond_7
    :goto_0
    const/4 v6, 0x3

    :goto_1
    const/4 p6, 0x1

    goto :goto_2

    .line 22
    :cond_8
    iget p6, v0, Lc/a/a/a/k2/t/b;->g:I

    .line 23
    :goto_2
    iget v0, v0, Lc/a/a/a/k2/t/b;->h:I

    const/4 v7, -0x2

    if-ne v0, v7, :cond_9

    const/4 v0, 0x1

    .line 24
    :cond_9
    new-instance v7, Lc/a/a/a/k2/q/d;

    invoke-direct {v7, v6, p6, v0}, Lc/a/a/a/k2/q/d;-><init>(III)V

    invoke-static {p0, v7, p1, p2, v2}, Lc/a/a/a/k2/q/c;->a(Landroid/text/Spannable;Ljava/lang/Object;III)V

    .line 25
    :cond_a
    invoke-virtual {p3}, Lc/a/a/a/k2/t/g;->i()I

    move-result p6

    if-eq p6, v4, :cond_c

    if-eq p6, v3, :cond_b

    const/4 p4, 0x4

    if-eq p6, p4, :cond_b

    goto :goto_3

    .line 26
    :cond_b
    new-instance p4, Lc/a/a/a/k2/t/a;

    invoke-direct {p4}, Lc/a/a/a/k2/t/a;-><init>()V

    invoke-interface {p0, p4, p1, p2, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_3

    .line 27
    :cond_c
    invoke-static {p4, p5}, Lc/a/a/a/k2/t/f;->d(Lc/a/a/a/k2/t/d;Ljava/util/Map;)Lc/a/a/a/k2/t/d;

    move-result-object p4

    if-nez p4, :cond_d

    goto :goto_3

    .line 28
    :cond_d
    invoke-static {p4, p5}, Lc/a/a/a/k2/t/f;->e(Lc/a/a/a/k2/t/d;Ljava/util/Map;)Lc/a/a/a/k2/t/d;

    move-result-object p5

    if-nez p5, :cond_e

    goto :goto_3

    .line 29
    :cond_e
    invoke-virtual {p5}, Lc/a/a/a/k2/t/d;->g()I

    move-result p6

    if-ne p6, v5, :cond_10

    const/4 p6, 0x0

    invoke-virtual {p5, p6}, Lc/a/a/a/k2/t/d;->f(I)Lc/a/a/a/k2/t/d;

    move-result-object v0

    iget-object v0, v0, Lc/a/a/a/k2/t/d;->b:Ljava/lang/String;

    if-eqz v0, :cond_10

    .line 30
    invoke-virtual {p5, p6}, Lc/a/a/a/k2/t/d;->f(I)Lc/a/a/a/k2/t/d;

    move-result-object p5

    iget-object p5, p5, Lc/a/a/a/k2/t/d;->b:Ljava/lang/String;

    invoke-static {p5}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/String;

    .line 31
    iget-object p4, p4, Lc/a/a/a/k2/t/d;->f:Lc/a/a/a/k2/t/g;

    if-eqz p4, :cond_f

    .line 32
    invoke-virtual {p4}, Lc/a/a/a/k2/t/g;->h()I

    move-result v1

    .line 33
    :cond_f
    new-instance p4, Lc/a/a/a/k2/q/b;

    invoke-direct {p4, p5, v1}, Lc/a/a/a/k2/q/b;-><init>(Ljava/lang/String;I)V

    invoke-interface {p0, p4, p1, p2, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_3

    :cond_10
    const-string p4, "TtmlRenderUtil"

    const-string p5, "Skipping rubyText node without exactly one text child."

    .line 34
    invoke-static {p4, p5}, Lc/a/a/a/m2/t;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    :goto_3
    invoke-virtual {p3}, Lc/a/a/a/k2/t/g;->m()Z

    move-result p4

    if-eqz p4, :cond_11

    .line 36
    new-instance p4, Lc/a/a/a/k2/q/a;

    invoke-direct {p4}, Lc/a/a/a/k2/q/a;-><init>()V

    invoke-static {p0, p4, p1, p2, v2}, Lc/a/a/a/k2/q/c;->a(Landroid/text/Spannable;Ljava/lang/Object;III)V

    .line 37
    :cond_11
    invoke-virtual {p3}, Lc/a/a/a/k2/t/g;->f()I

    move-result p4

    if-eq p4, v5, :cond_14

    if-eq p4, v4, :cond_13

    if-eq p4, v3, :cond_12

    goto :goto_4

    .line 38
    :cond_12
    new-instance p4, Landroid/text/style/RelativeSizeSpan;

    .line 39
    invoke-virtual {p3}, Lc/a/a/a/k2/t/g;->e()F

    move-result p3

    const/high16 p5, 0x42c80000    # 100.0f

    div-float/2addr p3, p5

    invoke-direct {p4, p3}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 40
    invoke-static {p0, p4, p1, p2, v2}, Lc/a/a/a/k2/q/c;->a(Landroid/text/Spannable;Ljava/lang/Object;III)V

    goto :goto_4

    .line 41
    :cond_13
    new-instance p4, Landroid/text/style/RelativeSizeSpan;

    .line 42
    invoke-virtual {p3}, Lc/a/a/a/k2/t/g;->e()F

    move-result p3

    invoke-direct {p4, p3}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 43
    invoke-static {p0, p4, p1, p2, v2}, Lc/a/a/a/k2/q/c;->a(Landroid/text/Spannable;Ljava/lang/Object;III)V

    goto :goto_4

    .line 44
    :cond_14
    new-instance p4, Landroid/text/style/AbsoluteSizeSpan;

    .line 45
    invoke-virtual {p3}, Lc/a/a/a/k2/t/g;->e()F

    move-result p3

    float-to-int p3, p3

    invoke-direct {p4, p3, v5}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 46
    invoke-static {p0, p4, p1, p2, v2}, Lc/a/a/a/k2/q/c;->a(Landroid/text/Spannable;Ljava/lang/Object;III)V

    :goto_4
    return-void
.end method

.method static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "\r\n"

    const-string v1, "\n"

    .line 1
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, " *\n *"

    .line 2
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, " "

    .line 3
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "[ \t\\x0B\u000c\r]+"

    .line 4
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static c(Landroid/text/SpannableStringBuilder;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    .line 2
    invoke-virtual {p0, v0}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v1

    const/16 v2, 0x20

    if-ne v1, v2, :cond_0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    if-ltz v0, :cond_1

    .line 3
    invoke-virtual {p0, v0}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_1

    .line 4
    invoke-virtual {p0, v1}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    :cond_1
    return-void
.end method

.method private static d(Lc/a/a/a/k2/t/d;Ljava/util/Map;)Lc/a/a/a/k2/t/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/k2/t/d;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc/a/a/a/k2/t/g;",
            ">;)",
            "Lc/a/a/a/k2/t/d;"
        }
    .end annotation

    :goto_0
    if-eqz p0, :cond_1

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/t/d;->f:Lc/a/a/a/k2/t/g;

    invoke-virtual {p0}, Lc/a/a/a/k2/t/d;->l()[Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lc/a/a/a/k2/t/f;->f(Lc/a/a/a/k2/t/g;[Ljava/lang/String;Ljava/util/Map;)Lc/a/a/a/k2/t/g;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lc/a/a/a/k2/t/g;->i()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-object p0

    .line 3
    :cond_0
    iget-object p0, p0, Lc/a/a/a/k2/t/d;->j:Lc/a/a/a/k2/t/d;

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static e(Lc/a/a/a/k2/t/d;Ljava/util/Map;)Lc/a/a/a/k2/t/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/k2/t/d;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc/a/a/a/k2/t/g;",
            ">;)",
            "Lc/a/a/a/k2/t/d;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 2
    invoke-interface {v0, p0}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    .line 3
    :cond_0
    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_2

    .line 4
    invoke-interface {v0}, Ljava/util/Deque;->pop()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lc/a/a/a/k2/t/d;

    .line 5
    iget-object v1, p0, Lc/a/a/a/k2/t/d;->f:Lc/a/a/a/k2/t/g;

    invoke-virtual {p0}, Lc/a/a/a/k2/t/d;->l()[Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, p1}, Lc/a/a/a/k2/t/f;->f(Lc/a/a/a/k2/t/g;[Ljava/lang/String;Ljava/util/Map;)Lc/a/a/a/k2/t/g;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {v1}, Lc/a/a/a/k2/t/g;->i()I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    return-object p0

    .line 7
    :cond_1
    invoke-virtual {p0}, Lc/a/a/a/k2/t/d;->g()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_0

    .line 8
    invoke-virtual {p0, v1}, Lc/a/a/a/k2/t/d;->f(I)Lc/a/a/a/k2/t/d;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static f(Lc/a/a/a/k2/t/g;[Ljava/lang/String;Ljava/util/Map;)Lc/a/a/a/k2/t/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/k2/t/g;",
            "[",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc/a/a/a/k2/t/g;",
            ">;)",
            "Lc/a/a/a/k2/t/g;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p0, :cond_3

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 1
    :cond_0
    array-length v2, p1

    if-ne v2, v1, :cond_1

    .line 2
    aget-object p0, p1, v0

    invoke-interface {p2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lc/a/a/a/k2/t/g;

    return-object p0

    .line 3
    :cond_1
    array-length v2, p1

    if-le v2, v1, :cond_5

    .line 4
    new-instance p0, Lc/a/a/a/k2/t/g;

    invoke-direct {p0}, Lc/a/a/a/k2/t/g;-><init>()V

    .line 5
    array-length v1, p1

    :goto_0
    if-ge v0, v1, :cond_2

    aget-object v2, p1, v0

    .line 6
    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/a/a/a/k2/t/g;

    invoke-virtual {p0, v2}, Lc/a/a/a/k2/t/g;->a(Lc/a/a/a/k2/t/g;)Lc/a/a/a/k2/t/g;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-object p0

    :cond_3
    if-eqz p1, :cond_4

    .line 7
    array-length v2, p1

    if-ne v2, v1, :cond_4

    .line 8
    aget-object p1, p1, v0

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/k2/t/g;

    invoke-virtual {p0, p1}, Lc/a/a/a/k2/t/g;->a(Lc/a/a/a/k2/t/g;)Lc/a/a/a/k2/t/g;

    move-result-object p0

    return-object p0

    :cond_4
    if-eqz p1, :cond_5

    .line 9
    array-length v2, p1

    if-le v2, v1, :cond_5

    .line 10
    array-length v1, p1

    :goto_1
    if-ge v0, v1, :cond_5

    aget-object v2, p1, v0

    .line 11
    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/a/a/a/k2/t/g;

    invoke-virtual {p0, v2}, Lc/a/a/a/k2/t/g;->a(Lc/a/a/a/k2/t/g;)Lc/a/a/a/k2/t/g;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    return-object p0
.end method
