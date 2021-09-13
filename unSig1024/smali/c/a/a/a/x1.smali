.class public abstract Lc/a/a/a/x1;
.super Ljava/lang/Object;
.source "Timeline.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/x1$b;,
        Lc/a/a/a/x1$c;
    }
.end annotation


# static fields
.field public static final a:Lc/a/a/a/x1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc/a/a/a/x1$a;

    invoke-direct {v0}, Lc/a/a/a/x1$a;-><init>()V

    sput-object v0, Lc/a/a/a/x1;->a:Lc/a/a/a/x1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/x1;->q()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public abstract b(Ljava/lang/Object;)I
.end method

.method public c(Z)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/x1;->q()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lc/a/a/a/x1;->p()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_0
    return p1
.end method

.method public final d(ILc/a/a/a/x1$b;Lc/a/a/a/x1$c;IZ)I
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Lc/a/a/a/x1;->f(ILc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object p2

    iget p2, p2, Lc/a/a/a/x1$b;->c:I

    .line 2
    invoke-virtual {p0, p2, p3}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    move-result-object v0

    iget v0, v0, Lc/a/a/a/x1$c;->p:I

    if-ne v0, p1, :cond_1

    .line 3
    invoke-virtual {p0, p2, p4, p5}, Lc/a/a/a/x1;->e(IIZ)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p2

    .line 4
    :cond_0
    invoke-virtual {p0, p1, p3}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    move-result-object p1

    iget p1, p1, Lc/a/a/a/x1$c;->o:I

    return p1

    :cond_1
    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public e(IIZ)I
    .locals 2

    const/4 v0, 0x1

    if-eqz p2, :cond_3

    if-eq p2, v0, :cond_2

    const/4 v1, 0x2

    if-ne p2, v1, :cond_1

    .line 1
    invoke-virtual {p0, p3}, Lc/a/a/a/x1;->c(Z)I

    move-result p2

    if-ne p1, p2, :cond_0

    .line 2
    invoke-virtual {p0, p3}, Lc/a/a/a/x1;->a(Z)I

    move-result p1

    goto :goto_0

    :cond_0
    add-int/2addr p1, v0

    :goto_0
    return p1

    .line 3
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    return p1

    .line 4
    :cond_3
    invoke-virtual {p0, p3}, Lc/a/a/a/x1;->c(Z)I

    move-result p2

    if-ne p1, p2, :cond_4

    const/4 p1, -0x1

    goto :goto_1

    :cond_4
    add-int/2addr p1, v0

    :goto_1
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 9

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lc/a/a/a/x1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 2
    :cond_1
    check-cast p1, Lc/a/a/a/x1;

    .line 3
    invoke-virtual {p1}, Lc/a/a/a/x1;->p()I

    move-result v1

    invoke-virtual {p0}, Lc/a/a/a/x1;->p()I

    move-result v3

    if-ne v1, v3, :cond_7

    invoke-virtual {p1}, Lc/a/a/a/x1;->i()I

    move-result v1

    invoke-virtual {p0}, Lc/a/a/a/x1;->i()I

    move-result v3

    if-eq v1, v3, :cond_2

    goto :goto_2

    .line 4
    :cond_2
    new-instance v1, Lc/a/a/a/x1$c;

    invoke-direct {v1}, Lc/a/a/a/x1$c;-><init>()V

    .line 5
    new-instance v3, Lc/a/a/a/x1$b;

    invoke-direct {v3}, Lc/a/a/a/x1$b;-><init>()V

    .line 6
    new-instance v4, Lc/a/a/a/x1$c;

    invoke-direct {v4}, Lc/a/a/a/x1$c;-><init>()V

    .line 7
    new-instance v5, Lc/a/a/a/x1$b;

    invoke-direct {v5}, Lc/a/a/a/x1$b;-><init>()V

    const/4 v6, 0x0

    .line 8
    :goto_0
    invoke-virtual {p0}, Lc/a/a/a/x1;->p()I

    move-result v7

    if-ge v6, v7, :cond_4

    .line 9
    invoke-virtual {p0, v6, v1}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    move-result-object v7

    invoke-virtual {p1, v6, v4}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    move-result-object v8

    invoke-virtual {v7, v8}, Lc/a/a/a/x1$c;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    return v2

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    .line 10
    :goto_1
    invoke-virtual {p0}, Lc/a/a/a/x1;->i()I

    move-result v4

    if-ge v1, v4, :cond_6

    .line 11
    invoke-virtual {p0, v1, v3, v0}, Lc/a/a/a/x1;->g(ILc/a/a/a/x1$b;Z)Lc/a/a/a/x1$b;

    move-result-object v4

    .line 12
    invoke-virtual {p1, v1, v5, v0}, Lc/a/a/a/x1;->g(ILc/a/a/a/x1$b;Z)Lc/a/a/a/x1$b;

    move-result-object v6

    invoke-virtual {v4, v6}, Lc/a/a/a/x1$b;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    return v2

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_6
    return v0

    :cond_7
    :goto_2
    return v2
.end method

.method public final f(ILc/a/a/a/x1$b;)Lc/a/a/a/x1$b;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lc/a/a/a/x1;->g(ILc/a/a/a/x1$b;Z)Lc/a/a/a/x1$b;

    move-result-object p1

    return-object p1
.end method

.method public abstract g(ILc/a/a/a/x1$b;Z)Lc/a/a/a/x1$b;
.end method

.method public h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lc/a/a/a/x1;->b(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Lc/a/a/a/x1;->g(ILc/a/a/a/x1$b;Z)Lc/a/a/a/x1$b;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 6

    .line 1
    new-instance v0, Lc/a/a/a/x1$c;

    invoke-direct {v0}, Lc/a/a/a/x1$c;-><init>()V

    .line 2
    new-instance v1, Lc/a/a/a/x1$b;

    invoke-direct {v1}, Lc/a/a/a/x1$b;-><init>()V

    .line 3
    invoke-virtual {p0}, Lc/a/a/a/x1;->p()I

    move-result v2

    const/16 v3, 0xd9

    add-int/2addr v3, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    .line 4
    :goto_0
    invoke-virtual {p0}, Lc/a/a/a/x1;->p()I

    move-result v5

    if-ge v4, v5, :cond_0

    mul-int/lit8 v3, v3, 0x1f

    .line 5
    invoke-virtual {p0, v4, v0}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    move-result-object v5

    invoke-virtual {v5}, Lc/a/a/a/x1$c;->hashCode()I

    move-result v5

    add-int/2addr v3, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    mul-int/lit8 v3, v3, 0x1f

    .line 6
    invoke-virtual {p0}, Lc/a/a/a/x1;->i()I

    move-result v0

    add-int/2addr v3, v0

    .line 7
    :goto_1
    invoke-virtual {p0}, Lc/a/a/a/x1;->i()I

    move-result v0

    if-ge v2, v0, :cond_1

    mul-int/lit8 v3, v3, 0x1f

    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, v2, v1, v0}, Lc/a/a/a/x1;->g(ILc/a/a/a/x1$b;Z)Lc/a/a/a/x1$b;

    move-result-object v0

    invoke-virtual {v0}, Lc/a/a/a/x1$b;->hashCode()I

    move-result v0

    add-int/2addr v3, v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return v3
.end method

.method public abstract i()I
.end method

.method public final j(Lc/a/a/a/x1$c;Lc/a/a/a/x1$b;IJ)Landroid/util/Pair;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/x1$c;",
            "Lc/a/a/a/x1$b;",
            "IJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    const-wide/16 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-wide v4, p4

    .line 1
    invoke-virtual/range {v0 .. v7}, Lc/a/a/a/x1;->k(Lc/a/a/a/x1$c;Lc/a/a/a/x1$b;IJJ)Landroid/util/Pair;

    move-result-object p1

    .line 2
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/util/Pair;

    return-object p1
.end method

.method public final k(Lc/a/a/a/x1$c;Lc/a/a/a/x1$b;IJJ)Landroid/util/Pair;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/x1$c;",
            "Lc/a/a/a/x1$b;",
            "IJJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/x1;->p()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p3, v1, v0}, Lc/a/a/a/m2/f;->c(III)I

    .line 2
    invoke-virtual {p0, p3, p1, p6, p7}, Lc/a/a/a/x1;->o(ILc/a/a/a/x1$c;J)Lc/a/a/a/x1$c;

    const-wide p6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, p4, p6

    if-nez p3, :cond_0

    .line 3
    invoke-virtual {p1}, Lc/a/a/a/x1$c;->c()J

    move-result-wide p4

    cmp-long p3, p4, p6

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 4
    :cond_0
    iget p3, p1, Lc/a/a/a/x1$c;->o:I

    .line 5
    invoke-virtual {p1}, Lc/a/a/a/x1$c;->e()J

    move-result-wide v0

    add-long/2addr v0, p4

    const/4 p4, 0x1

    .line 6
    invoke-virtual {p0, p3, p2, p4}, Lc/a/a/a/x1;->g(ILc/a/a/a/x1$b;Z)Lc/a/a/a/x1$b;

    move-result-object p5

    invoke-virtual {p5}, Lc/a/a/a/x1$b;->h()J

    move-result-wide v2

    :goto_0
    cmp-long p5, v2, p6

    if-eqz p5, :cond_1

    cmp-long p5, v0, v2

    if-ltz p5, :cond_1

    .line 7
    iget p5, p1, Lc/a/a/a/x1$c;->p:I

    if-ge p3, p5, :cond_1

    sub-long/2addr v0, v2

    add-int/lit8 p3, p3, 0x1

    .line 8
    invoke-virtual {p0, p3, p2, p4}, Lc/a/a/a/x1;->g(ILc/a/a/a/x1$b;Z)Lc/a/a/a/x1$b;

    move-result-object p5

    invoke-virtual {p5}, Lc/a/a/a/x1$b;->h()J

    move-result-wide v2

    goto :goto_0

    .line 9
    :cond_1
    iget-object p1, p2, Lc/a/a/a/x1$b;->b:Ljava/lang/Object;

    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public l(IIZ)I
    .locals 2

    const/4 v0, 0x1

    if-eqz p2, :cond_3

    if-eq p2, v0, :cond_2

    const/4 v1, 0x2

    if-ne p2, v1, :cond_1

    .line 1
    invoke-virtual {p0, p3}, Lc/a/a/a/x1;->a(Z)I

    move-result p2

    if-ne p1, p2, :cond_0

    .line 2
    invoke-virtual {p0, p3}, Lc/a/a/a/x1;->c(Z)I

    move-result p1

    goto :goto_0

    :cond_0
    sub-int/2addr p1, v0

    :goto_0
    return p1

    .line 3
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    return p1

    .line 4
    :cond_3
    invoke-virtual {p0, p3}, Lc/a/a/a/x1;->a(Z)I

    move-result p2

    if-ne p1, p2, :cond_4

    const/4 p1, -0x1

    goto :goto_1

    :cond_4
    sub-int/2addr p1, v0

    :goto_1
    return p1
.end method

.method public abstract m(I)Ljava/lang/Object;
.end method

.method public final n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;
    .locals 2

    const-wide/16 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0, v1}, Lc/a/a/a/x1;->o(ILc/a/a/a/x1$c;J)Lc/a/a/a/x1$c;

    move-result-object p1

    return-object p1
.end method

.method public abstract o(ILc/a/a/a/x1$c;J)Lc/a/a/a/x1$c;
.end method

.method public abstract p()I
.end method

.method public final q()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/x1;->p()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final r(ILc/a/a/a/x1$b;Lc/a/a/a/x1$c;IZ)Z
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lc/a/a/a/x1;->d(ILc/a/a/a/x1$b;Lc/a/a/a/x1$c;IZ)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
