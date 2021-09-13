.class final Lc/a/a/a/k2/t/d;
.super Ljava/lang/Object;
.source "TtmlNode.java"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:J

.field public final e:J

.field public final f:Lc/a/a/a/k2/t/g;

.field private final g:[Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Lc/a/a/a/k2/t/d;

.field private final k:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/a/k2/t/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;JJLc/a/a/a/k2/t/g;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc/a/a/a/k2/t/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/k2/t/d;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lc/a/a/a/k2/t/d;->b:Ljava/lang/String;

    .line 4
    iput-object p10, p0, Lc/a/a/a/k2/t/d;->i:Ljava/lang/String;

    .line 5
    iput-object p7, p0, Lc/a/a/a/k2/t/d;->f:Lc/a/a/a/k2/t/g;

    .line 6
    iput-object p8, p0, Lc/a/a/a/k2/t/d;->g:[Ljava/lang/String;

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 7
    :goto_0
    iput-boolean p1, p0, Lc/a/a/a/k2/t/d;->c:Z

    .line 8
    iput-wide p3, p0, Lc/a/a/a/k2/t/d;->d:J

    .line 9
    iput-wide p5, p0, Lc/a/a/a/k2/t/d;->e:J

    .line 10
    invoke-static {p9}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lc/a/a/a/k2/t/d;->h:Ljava/lang/String;

    .line 11
    iput-object p11, p0, Lc/a/a/a/k2/t/d;->j:Lc/a/a/a/k2/t/d;

    .line 12
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lc/a/a/a/k2/t/d;->k:Ljava/util/HashMap;

    .line 13
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lc/a/a/a/k2/t/d;->l:Ljava/util/HashMap;

    return-void
.end method

.method private b(Ljava/util/Map;Lc/a/a/a/k2/c$b;III)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc/a/a/a/k2/t/g;",
            ">;",
            "Lc/a/a/a/k2/c$b;",
            "III)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/t/d;->f:Lc/a/a/a/k2/t/g;

    iget-object v1, p0, Lc/a/a/a/k2/t/d;->g:[Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lc/a/a/a/k2/t/f;->f(Lc/a/a/a/k2/t/g;[Ljava/lang/String;Ljava/util/Map;)Lc/a/a/a/k2/t/g;

    move-result-object v0

    .line 2
    invoke-virtual {p2}, Lc/a/a/a/k2/c$b;->e()Ljava/lang/CharSequence;

    move-result-object v1

    check-cast v1, Landroid/text/SpannableStringBuilder;

    if-nez v1, :cond_0

    .line 3
    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-direct {v1}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 4
    invoke-virtual {p2, v1}, Lc/a/a/a/k2/c$b;->n(Ljava/lang/CharSequence;)Lc/a/a/a/k2/c$b;

    :cond_0
    move-object v2, v1

    if-eqz v0, :cond_2

    .line 5
    iget-object v6, p0, Lc/a/a/a/k2/t/d;->j:Lc/a/a/a/k2/t/d;

    move v3, p3

    move v4, p4

    move-object v5, v0

    move-object v7, p1

    move v8, p5

    invoke-static/range {v2 .. v8}, Lc/a/a/a/k2/t/f;->a(Landroid/text/Spannable;IILc/a/a/a/k2/t/g;Lc/a/a/a/k2/t/d;Ljava/util/Map;I)V

    .line 6
    invoke-virtual {v0}, Lc/a/a/a/k2/t/g;->j()F

    move-result p1

    const p3, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float p1, p1, p3

    if-eqz p1, :cond_1

    iget-object p1, p0, Lc/a/a/a/k2/t/d;->a:Ljava/lang/String;

    const-string p3, "p"

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 7
    invoke-virtual {v0}, Lc/a/a/a/k2/t/g;->j()F

    move-result p1

    const/high16 p3, -0x3d4c0000    # -90.0f

    mul-float p1, p1, p3

    const/high16 p3, 0x42c80000    # 100.0f

    div-float/2addr p1, p3

    invoke-virtual {p2, p1}, Lc/a/a/a/k2/c$b;->l(F)Lc/a/a/a/k2/c$b;

    .line 8
    :cond_1
    invoke-virtual {v0}, Lc/a/a/a/k2/t/g;->l()Landroid/text/Layout$Alignment;

    move-result-object p1

    invoke-virtual {p2, p1}, Lc/a/a/a/k2/c$b;->o(Landroid/text/Layout$Alignment;)Lc/a/a/a/k2/c$b;

    :cond_2
    return-void
.end method

.method public static c(Ljava/lang/String;JJLc/a/a/a/k2/t/g;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc/a/a/a/k2/t/d;)Lc/a/a/a/k2/t/d;
    .locals 13

    .line 1
    new-instance v12, Lc/a/a/a/k2/t/d;

    const/4 v2, 0x0

    move-object v0, v12

    move-object v1, p0

    move-wide v3, p1

    move-wide/from16 v5, p3

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    invoke-direct/range {v0 .. v11}, Lc/a/a/a/k2/t/d;-><init>(Ljava/lang/String;Ljava/lang/String;JJLc/a/a/a/k2/t/g;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc/a/a/a/k2/t/d;)V

    return-object v12
.end method

.method public static d(Ljava/lang/String;)Lc/a/a/a/k2/t/d;
    .locals 13

    .line 1
    new-instance v12, Lc/a/a/a/k2/t/d;

    .line 2
    invoke-static {p0}, Lc/a/a/a/k2/t/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v1, 0x0

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v9, ""

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, Lc/a/a/a/k2/t/d;-><init>(Ljava/lang/String;Ljava/lang/String;JJLc/a/a/a/k2/t/g;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc/a/a/a/k2/t/d;)V

    return-object v12
.end method

.method private static e(Landroid/text/SpannableStringBuilder;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    const-class v1, Lc/a/a/a/k2/t/a;

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v1}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc/a/a/a/k2/t/a;

    .line 2
    array-length v1, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    .line 3
    invoke-virtual {p0, v4}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    move-result v5

    invoke-virtual {p0, v4}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    move-result v4

    const-string v6, ""

    invoke-virtual {p0, v5, v4, v6}, Landroid/text/SpannableStringBuilder;->replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    :goto_1
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    const/16 v3, 0x20

    if-ge v0, v1, :cond_3

    .line 5
    invoke-virtual {p0, v0}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v1

    if-ne v1, v3, :cond_2

    add-int/lit8 v1, v0, 0x1

    move v4, v1

    .line 6
    :goto_2
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v5

    if-ge v4, v5, :cond_1

    invoke-virtual {p0, v4}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v5

    if-ne v5, v3, :cond_1

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_1
    sub-int/2addr v4, v1

    if-lez v4, :cond_2

    add-int/2addr v4, v0

    .line 7
    invoke-virtual {p0, v0, v4}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 8
    :cond_3
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    const/4 v1, 0x1

    if-lez v0, :cond_4

    invoke-virtual {p0, v2}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v0

    if-ne v0, v3, :cond_4

    .line 9
    invoke-virtual {p0, v2, v1}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_4
    const/4 v0, 0x0

    .line 10
    :goto_3
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    sub-int/2addr v4, v1

    const/16 v5, 0xa

    if-ge v0, v4, :cond_6

    .line 11
    invoke-virtual {p0, v0}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v4

    if-ne v4, v5, :cond_5

    add-int/lit8 v4, v0, 0x1

    invoke-virtual {p0, v4}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v5

    if-ne v5, v3, :cond_5

    add-int/lit8 v5, v0, 0x2

    .line 12
    invoke-virtual {p0, v4, v5}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 13
    :cond_6
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_7

    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v0

    if-ne v0, v3, :cond_7

    .line 14
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    invoke-virtual {p0, v0, v4}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 15
    :cond_7
    :goto_4
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    sub-int/2addr v0, v1

    if-ge v2, v0, :cond_9

    .line 16
    invoke-virtual {p0, v2}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v0

    if-ne v0, v3, :cond_8

    add-int/lit8 v0, v2, 0x1

    invoke-virtual {p0, v0}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v4

    if-ne v4, v5, :cond_8

    .line 17
    invoke-virtual {p0, v2, v0}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 18
    :cond_9
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_a

    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v0

    if-ne v0, v5, :cond_a

    .line 19
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_a
    return-void
.end method

.method private i(Ljava/util/TreeSet;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/TreeSet<",
            "Ljava/lang/Long;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/t/d;->a:Ljava/lang/String;

    const-string v1, "p"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 2
    iget-object v1, p0, Lc/a/a/a/k2/t/d;->a:Ljava/lang/String;

    const-string v2, "div"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez p2, :cond_0

    if-nez v0, :cond_0

    if-eqz v1, :cond_2

    .line 3
    iget-object v1, p0, Lc/a/a/a/k2/t/d;->i:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 4
    :cond_0
    iget-wide v1, p0, Lc/a/a/a/k2/t/d;->d:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    .line 5
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 6
    :cond_1
    iget-wide v1, p0, Lc/a/a/a/k2/t/d;->e:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_2

    .line 7
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 8
    :cond_2
    iget-object v1, p0, Lc/a/a/a/k2/t/d;->m:Ljava/util/List;

    if-nez v1, :cond_3

    return-void

    :cond_3
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 9
    :goto_0
    iget-object v3, p0, Lc/a/a/a/k2/t/d;->m:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_6

    .line 10
    iget-object v3, p0, Lc/a/a/a/k2/t/d;->m:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/a/a/a/k2/t/d;

    if-nez p2, :cond_5

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    const/4 v4, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v4, 0x1

    :goto_2
    invoke-direct {v3, p1, v4}, Lc/a/a/a/k2/t/d;->i(Ljava/util/TreeSet;Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_6
    return-void
.end method

.method private static k(Ljava/lang/String;Ljava/util/Map;)Landroid/text/SpannableStringBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc/a/a/a/k2/c$b;",
            ">;)",
            "Landroid/text/SpannableStringBuilder;"
        }
    .end annotation

    .line 1
    invoke-interface {p1, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lc/a/a/a/k2/c$b;

    invoke-direct {v0}, Lc/a/a/a/k2/c$b;-><init>()V

    .line 3
    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-direct {v1}, Landroid/text/SpannableStringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Lc/a/a/a/k2/c$b;->n(Ljava/lang/CharSequence;)Lc/a/a/a/k2/c$b;

    .line 4
    invoke-interface {p1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    :cond_0
    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lc/a/a/a/k2/c$b;

    invoke-virtual {p0}, Lc/a/a/a/k2/c$b;->e()Ljava/lang/CharSequence;

    move-result-object p0

    invoke-static {p0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method private n(JLjava/lang/String;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/t/d;->h:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lc/a/a/a/k2/t/d;->h:Ljava/lang/String;

    .line 2
    :goto_0
    invoke-virtual {p0, p1, p2}, Lc/a/a/a/k2/t/d;->m(J)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lc/a/a/a/k2/t/d;->a:Ljava/lang/String;

    const-string v1, "div"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lc/a/a/a/k2/t/d;->i:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 3
    new-instance p1, Landroid/util/Pair;

    iget-object p2, p0, Lc/a/a/a/k2/t/d;->i:Ljava/lang/String;

    invoke-direct {p1, p3, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 4
    :goto_1
    invoke-virtual {p0}, Lc/a/a/a/k2/t/d;->g()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 5
    invoke-virtual {p0, v0}, Lc/a/a/a/k2/t/d;->f(I)Lc/a/a/a/k2/t/d;

    move-result-object v1

    invoke-direct {v1, p1, p2, p3, p4}, Lc/a/a/a/k2/t/d;->n(JLjava/lang/String;Ljava/util/List;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method private o(JLjava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc/a/a/a/k2/t/g;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc/a/a/a/k2/t/e;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc/a/a/a/k2/c$b;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v6, p0

    .line 1
    invoke-virtual/range {p0 .. p2}, Lc/a/a/a/k2/t/d;->m(J)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, v6, Lc/a/a/a/k2/t/d;->h:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object/from16 v14, p5

    goto :goto_0

    :cond_1
    iget-object v0, v6, Lc/a/a/a/k2/t/d;->h:Ljava/lang/String;

    move-object v14, v0

    .line 3
    :goto_0
    iget-object v0, v6, Lc/a/a/a/k2/t/d;->l:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 4
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 5
    iget-object v3, v6, Lc/a/a/a/k2/t/d;->k:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v1, v6, Lc/a/a/a/k2/t/d;->k:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move v3, v1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    .line 6
    :goto_2
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-eq v3, v4, :cond_3

    move-object/from16 v15, p6

    .line 7
    invoke-interface {v15, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/k2/c$b;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lc/a/a/a/k2/c$b;

    move-object/from16 v13, p4

    .line 8
    invoke-interface {v13, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/k2/t/e;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/k2/t/e;

    iget v5, v0, Lc/a/a/a/k2/t/e;->j:I

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    .line 9
    invoke-direct/range {v0 .. v5}, Lc/a/a/a/k2/t/d;->b(Ljava/util/Map;Lc/a/a/a/k2/c$b;III)V

    goto :goto_1

    :cond_3
    move-object/from16 v13, p4

    move-object/from16 v15, p6

    goto :goto_1

    :cond_4
    move-object/from16 v13, p4

    move-object/from16 v15, p6

    .line 10
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lc/a/a/a/k2/t/d;->g()I

    move-result v0

    if-ge v1, v0, :cond_5

    .line 11
    invoke-virtual {v6, v1}, Lc/a/a/a/k2/t/d;->f(I)Lc/a/a/a/k2/t/d;

    move-result-object v7

    move-wide/from16 v8, p1

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    move-object v12, v14

    move-object/from16 v13, p6

    .line 12
    invoke-direct/range {v7 .. v13}, Lc/a/a/a/k2/t/d;->o(JLjava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V

    add-int/lit8 v1, v1, 0x1

    move-object/from16 v13, p4

    goto :goto_3

    :cond_5
    return-void
.end method

.method private p(JZLjava/lang/String;Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZ",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc/a/a/a/k2/c$b;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/t/d;->k:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/k2/t/d;->l:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 3
    iget-object v0, p0, Lc/a/a/a/k2/t/d;->a:Ljava/lang/String;

    const-string v1, "metadata"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lc/a/a/a/k2/t/d;->h:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object p4, p0, Lc/a/a/a/k2/t/d;->h:Ljava/lang/String;

    .line 5
    :goto_0
    iget-boolean v0, p0, Lc/a/a/a/k2/t/d;->c:Z

    if-eqz v0, :cond_2

    if-eqz p3, :cond_2

    .line 6
    invoke-static {p4, p5}, Lc/a/a/a/k2/t/d;->k(Ljava/lang/String;Ljava/util/Map;)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    iget-object p2, p0, Lc/a/a/a/k2/t/d;->b:Ljava/lang/String;

    invoke-static {p2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    goto/16 :goto_6

    .line 7
    :cond_2
    iget-object v0, p0, Lc/a/a/a/k2/t/d;->a:Ljava/lang/String;

    const-string v1, "br"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    if-eqz p3, :cond_3

    .line 8
    invoke-static {p4, p5}, Lc/a/a/a/k2/t/d;->k(Ljava/lang/String;Ljava/util/Map;)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    const/16 p2, 0xa

    invoke-virtual {p1, p2}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    goto/16 :goto_6

    .line 9
    :cond_3
    invoke-virtual {p0, p1, p2}, Lc/a/a/a/k2/t/d;->m(J)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 10
    invoke-interface {p5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 11
    iget-object v2, p0, Lc/a/a/a/k2/t/d;->k:Ljava/util/HashMap;

    .line 12
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/k2/c$b;

    invoke-virtual {v1}, Lc/a/a/a/k2/c$b;->e()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 13
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 14
    :cond_4
    iget-object v0, p0, Lc/a/a/a/k2/t/d;->a:Ljava/lang/String;

    const-string v1, "p"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 15
    :goto_2
    invoke-virtual {p0}, Lc/a/a/a/k2/t/d;->g()I

    move-result v0

    if-ge v8, v0, :cond_7

    .line 16
    invoke-virtual {p0, v8}, Lc/a/a/a/k2/t/d;->f(I)Lc/a/a/a/k2/t/d;

    move-result-object v0

    if-nez p3, :cond_6

    if-eqz v6, :cond_5

    goto :goto_3

    :cond_5
    const/4 v3, 0x0

    goto :goto_4

    :cond_6
    :goto_3
    const/4 v1, 0x1

    const/4 v3, 0x1

    :goto_4
    move-wide v1, p1

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lc/a/a/a/k2/t/d;->p(JZLjava/lang/String;Ljava/util/Map;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_7
    if-eqz v6, :cond_8

    .line 17
    invoke-static {p4, p5}, Lc/a/a/a/k2/t/d;->k(Ljava/lang/String;Ljava/util/Map;)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    invoke-static {p1}, Lc/a/a/a/k2/t/f;->c(Landroid/text/SpannableStringBuilder;)V

    .line 18
    :cond_8
    invoke-interface {p5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    .line 19
    iget-object p3, p0, Lc/a/a/a/k2/t/d;->l:Ljava/util/HashMap;

    .line 20
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc/a/a/a/k2/c$b;

    invoke-virtual {p2}, Lc/a/a/a/k2/c$b;->e()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-static {p2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    .line 21
    invoke-virtual {p3, p4, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_9
    :goto_6
    return-void
.end method


# virtual methods
.method public a(Lc/a/a/a/k2/t/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/t/d;->m:Ljava/util/List;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/a/a/a/k2/t/d;->m:Ljava/util/List;

    .line 3
    :cond_0
    iget-object v0, p0, Lc/a/a/a/k2/t/d;->m:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public f(I)Lc/a/a/a/k2/t/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/t/d;->m:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/k2/t/d;

    return-object p1

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public g()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/t/d;->m:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    return v0
.end method

.method public h(JLjava/util/Map;Ljava/util/Map;Ljava/util/Map;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc/a/a/a/k2/t/g;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc/a/a/a/k2/t/e;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lc/a/a/a/k2/c;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    iget-object v1, p0, Lc/a/a/a/k2/t/d;->h:Ljava/lang/String;

    invoke-direct {p0, p1, p2, v1, v0}, Lc/a/a/a/k2/t/d;->n(JLjava/lang/String;Ljava/util/List;)V

    .line 3
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    .line 4
    iget-object v6, p0, Lc/a/a/a/k2/t/d;->h:Ljava/lang/String;

    const/4 v5, 0x0

    move-object v2, p0

    move-wide v3, p1

    move-object v7, v1

    invoke-direct/range {v2 .. v7}, Lc/a/a/a/k2/t/d;->p(JZLjava/lang/String;Ljava/util/Map;)V

    .line 5
    iget-object v7, p0, Lc/a/a/a/k2/t/d;->h:Ljava/lang/String;

    move-object v5, p3

    move-object v6, p4

    move-object v8, v1

    invoke-direct/range {v2 .. v8}, Lc/a/a/a/k2/t/d;->o(JLjava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V

    .line 6
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/util/Pair;

    .line 8
    iget-object v0, p3, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-interface {p5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 9
    invoke-static {v0, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    .line 10
    array-length v3, v0

    invoke-static {v0, v2, v3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 11
    iget-object p3, p3, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-interface {p4, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lc/a/a/a/k2/t/e;

    invoke-static {p3}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lc/a/a/a/k2/t/e;

    .line 12
    new-instance v3, Lc/a/a/a/k2/c$b;

    invoke-direct {v3}, Lc/a/a/a/k2/c$b;-><init>()V

    .line 13
    invoke-virtual {v3, v0}, Lc/a/a/a/k2/c$b;->f(Landroid/graphics/Bitmap;)Lc/a/a/a/k2/c$b;

    move-result-object v0

    iget v3, p3, Lc/a/a/a/k2/t/e;->b:F

    .line 14
    invoke-virtual {v0, v3}, Lc/a/a/a/k2/c$b;->j(F)Lc/a/a/a/k2/c$b;

    move-result-object v0

    .line 15
    invoke-virtual {v0, v2}, Lc/a/a/a/k2/c$b;->k(I)Lc/a/a/a/k2/c$b;

    move-result-object v0

    iget v3, p3, Lc/a/a/a/k2/t/e;->c:F

    .line 16
    invoke-virtual {v0, v3, v2}, Lc/a/a/a/k2/c$b;->h(FI)Lc/a/a/a/k2/c$b;

    move-result-object v0

    iget v2, p3, Lc/a/a/a/k2/t/e;->e:I

    .line 17
    invoke-virtual {v0, v2}, Lc/a/a/a/k2/c$b;->i(I)Lc/a/a/a/k2/c$b;

    move-result-object v0

    iget v2, p3, Lc/a/a/a/k2/t/e;->f:F

    .line 18
    invoke-virtual {v0, v2}, Lc/a/a/a/k2/c$b;->m(F)Lc/a/a/a/k2/c$b;

    move-result-object v0

    iget v2, p3, Lc/a/a/a/k2/t/e;->g:F

    .line 19
    invoke-virtual {v0, v2}, Lc/a/a/a/k2/c$b;->g(F)Lc/a/a/a/k2/c$b;

    move-result-object v0

    iget p3, p3, Lc/a/a/a/k2/t/e;->j:I

    .line 20
    invoke-virtual {v0, p3}, Lc/a/a/a/k2/c$b;->q(I)Lc/a/a/a/k2/c$b;

    move-result-object p3

    .line 21
    invoke-virtual {p3}, Lc/a/a/a/k2/c$b;->a()Lc/a/a/a/k2/c;

    move-result-object p3

    .line 22
    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {v1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    .line 24
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p5

    invoke-interface {p4, p5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lc/a/a/a/k2/t/e;

    invoke-static {p5}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lc/a/a/a/k2/t/e;

    .line 25
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lc/a/a/a/k2/c$b;

    .line 26
    invoke-virtual {p3}, Lc/a/a/a/k2/c$b;->e()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/SpannableStringBuilder;

    invoke-static {v0}, Lc/a/a/a/k2/t/d;->e(Landroid/text/SpannableStringBuilder;)V

    .line 27
    iget v0, p5, Lc/a/a/a/k2/t/e;->c:F

    iget v1, p5, Lc/a/a/a/k2/t/e;->d:I

    invoke-virtual {p3, v0, v1}, Lc/a/a/a/k2/c$b;->h(FI)Lc/a/a/a/k2/c$b;

    .line 28
    iget v0, p5, Lc/a/a/a/k2/t/e;->e:I

    invoke-virtual {p3, v0}, Lc/a/a/a/k2/c$b;->i(I)Lc/a/a/a/k2/c$b;

    .line 29
    iget v0, p5, Lc/a/a/a/k2/t/e;->b:F

    invoke-virtual {p3, v0}, Lc/a/a/a/k2/c$b;->j(F)Lc/a/a/a/k2/c$b;

    .line 30
    iget v0, p5, Lc/a/a/a/k2/t/e;->f:F

    invoke-virtual {p3, v0}, Lc/a/a/a/k2/c$b;->m(F)Lc/a/a/a/k2/c$b;

    .line 31
    iget v0, p5, Lc/a/a/a/k2/t/e;->i:F

    iget v1, p5, Lc/a/a/a/k2/t/e;->h:I

    invoke-virtual {p3, v0, v1}, Lc/a/a/a/k2/c$b;->p(FI)Lc/a/a/a/k2/c$b;

    .line 32
    iget p5, p5, Lc/a/a/a/k2/t/e;->j:I

    invoke-virtual {p3, p5}, Lc/a/a/a/k2/c$b;->q(I)Lc/a/a/a/k2/c$b;

    .line 33
    invoke-virtual {p3}, Lc/a/a/a/k2/c$b;->a()Lc/a/a/a/k2/c;

    move-result-object p3

    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object p1
.end method

.method public j()[J
    .locals 6

    .line 1
    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    const/4 v1, 0x0

    .line 2
    invoke-direct {p0, v0, v1}, Lc/a/a/a/k2/t/d;->i(Ljava/util/TreeSet;Z)V

    .line 3
    invoke-virtual {v0}, Ljava/util/TreeSet;->size()I

    move-result v2

    new-array v2, v2, [J

    .line 4
    invoke-virtual {v0}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    add-int/lit8 v5, v1, 0x1

    .line 5
    aput-wide v3, v2, v1

    move v1, v5

    goto :goto_0

    :cond_0
    return-object v2
.end method

.method public l()[Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/t/d;->g:[Ljava/lang/String;

    return-object v0
.end method

.method public m(J)Z
    .locals 7

    .line 1
    iget-wide v0, p0, Lc/a/a/a/k2/t/d;->d:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v4, p0, Lc/a/a/a/k2/t/d;->e:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_3

    :cond_0
    cmp-long v4, v0, p1

    if-gtz v4, :cond_1

    iget-wide v4, p0, Lc/a/a/a/k2/t/d;->e:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_3

    :cond_1
    cmp-long v4, v0, v2

    if-nez v4, :cond_2

    iget-wide v2, p0, Lc/a/a/a/k2/t/d;->e:J

    cmp-long v4, p1, v2

    if-ltz v4, :cond_3

    :cond_2
    cmp-long v2, v0, p1

    if-gtz v2, :cond_4

    iget-wide v0, p0, Lc/a/a/a/k2/t/d;->e:J

    cmp-long v2, p1, v0

    if-gez v2, :cond_4

    :cond_3
    const/4 p1, 0x1

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
