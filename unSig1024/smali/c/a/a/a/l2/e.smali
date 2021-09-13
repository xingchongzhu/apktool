.class public abstract Lc/a/a/a/l2/e;
.super Ljava/lang/Object;
.source "BaseTrackSelection.java"

# interfaces
.implements Lc/a/a/a/l2/h;


# instance fields
.field protected final a:Lc/a/a/a/j2/p0;

.field protected final b:I

.field protected final c:[I

.field private final d:[Lc/a/a/a/u0;

.field private final e:[J

.field private f:I


# direct methods
.method public varargs constructor <init>(Lc/a/a/a/j2/p0;[I)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    array-length v0, p2

    const/4 v1, 0x0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 3
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/j2/p0;

    iput-object v0, p0, Lc/a/a/a/l2/e;->a:Lc/a/a/a/j2/p0;

    .line 4
    array-length v0, p2

    iput v0, p0, Lc/a/a/a/l2/e;->b:I

    .line 5
    new-array v0, v0, [Lc/a/a/a/u0;

    iput-object v0, p0, Lc/a/a/a/l2/e;->d:[Lc/a/a/a/u0;

    const/4 v0, 0x0

    .line 6
    :goto_1
    array-length v2, p2

    if-ge v0, v2, :cond_1

    .line 7
    iget-object v2, p0, Lc/a/a/a/l2/e;->d:[Lc/a/a/a/u0;

    aget v3, p2, v0

    invoke-virtual {p1, v3}, Lc/a/a/a/j2/p0;->l(I)Lc/a/a/a/u0;

    move-result-object v3

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 8
    :cond_1
    iget-object p2, p0, Lc/a/a/a/l2/e;->d:[Lc/a/a/a/u0;

    sget-object v0, Lc/a/a/a/l2/a;->a:Lc/a/a/a/l2/a;

    invoke-static {p2, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 9
    iget p2, p0, Lc/a/a/a/l2/e;->b:I

    new-array p2, p2, [I

    iput-object p2, p0, Lc/a/a/a/l2/e;->c:[I

    .line 10
    :goto_2
    iget p2, p0, Lc/a/a/a/l2/e;->b:I

    if-ge v1, p2, :cond_2

    .line 11
    iget-object p2, p0, Lc/a/a/a/l2/e;->c:[I

    iget-object v0, p0, Lc/a/a/a/l2/e;->d:[Lc/a/a/a/u0;

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Lc/a/a/a/j2/p0;->m(Lc/a/a/a/u0;)I

    move-result v0

    aput v0, p2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 12
    :cond_2
    new-array p1, p2, [J

    iput-object p1, p0, Lc/a/a/a/l2/e;->e:[J

    return-void
.end method

.method static synthetic v(Lc/a/a/a/u0;Lc/a/a/a/u0;)I
    .locals 0

    .line 1
    iget p1, p1, Lc/a/a/a/u0;->h:I

    iget p0, p0, Lc/a/a/a/u0;->h:I

    sub-int/2addr p1, p0

    return p1
.end method


# virtual methods
.method public final a(IJ)Z
    .locals 10

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 2
    invoke-virtual {p0, p1, v0, v1}, Lc/a/a/a/l2/e;->u(IJ)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 3
    :goto_0
    iget v5, p0, Lc/a/a/a/l2/e;->b:I

    const/4 v6, 0x1

    if-ge v4, v5, :cond_1

    if-nez v2, :cond_1

    if-eq v4, p1, :cond_0

    .line 4
    invoke-virtual {p0, v4, v0, v1}, Lc/a/a/a/l2/e;->u(IJ)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    if-nez v2, :cond_2

    return v3

    .line 5
    :cond_2
    iget-object v7, p0, Lc/a/a/a/l2/e;->e:[J

    aget-wide v8, v7, p1

    const-wide v4, 0x7fffffffffffffffL

    move-wide v2, p2

    .line 6
    invoke-static/range {v0 .. v5}, Lc/a/a/a/m2/m0;->a(JJJ)J

    move-result-wide p2

    .line 7
    invoke-static {v8, v9, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    aput-wide p2, v7, p1

    return v6
.end method

.method public synthetic b(JLc/a/a/a/j2/t0/b;Ljava/util/List;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lc/a/a/a/l2/g;->d(Lc/a/a/a/l2/h;JLc/a/a/a/j2/t0/b;Ljava/util/List;)Z

    move-result p1

    return p1
.end method

.method public synthetic c(Z)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/l2/g;->b(Lc/a/a/a/l2/h;Z)V

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public final e(I)Lc/a/a/a/u0;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/l2/e;->d:[Lc/a/a/a/u0;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 2
    :cond_1
    check-cast p1, Lc/a/a/a/l2/e;

    .line 3
    iget-object v2, p0, Lc/a/a/a/l2/e;->a:Lc/a/a/a/j2/p0;

    iget-object v3, p1, Lc/a/a/a/l2/e;->a:Lc/a/a/a/j2/p0;

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lc/a/a/a/l2/e;->c:[I

    iget-object p1, p1, Lc/a/a/a/l2/e;->c:[I

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public final g(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/l2/e;->c:[I

    aget p1, v0, p1

    return p1
.end method

.method public h(JLjava/util/List;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "+",
            "Lc/a/a/a/j2/t0/d;",
            ">;)I"
        }
    .end annotation

    .line 1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/l2/e;->f:I

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/a/a/a/l2/e;->a:Lc/a/a/a/j2/p0;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lc/a/a/a/l2/e;->c:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lc/a/a/a/l2/e;->f:I

    .line 3
    :cond_0
    iget v0, p0, Lc/a/a/a/l2/e;->f:I

    return v0
.end method

.method public final j()I
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/l2/e;->c:[I

    invoke-interface {p0}, Lc/a/a/a/l2/h;->n()I

    move-result v1

    aget v0, v0, v1

    return v0
.end method

.method public final k()Lc/a/a/a/j2/p0;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/l2/e;->a:Lc/a/a/a/j2/p0;

    return-object v0
.end method

.method public final l()Lc/a/a/a/u0;
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/l2/e;->d:[Lc/a/a/a/u0;

    invoke-interface {p0}, Lc/a/a/a/l2/h;->n()I

    move-result v1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final length()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/l2/e;->c:[I

    array-length v0, v0

    return v0
.end method

.method public o(F)V
    .locals 0

    return-void
.end method

.method public synthetic q()V
    .locals 0

    invoke-static {p0}, Lc/a/a/a/l2/g;->a(Lc/a/a/a/l2/h;)V

    return-void
.end method

.method public synthetic r()V
    .locals 0

    invoke-static {p0}, Lc/a/a/a/l2/g;->c(Lc/a/a/a/l2/h;)V

    return-void
.end method

.method public final s(I)I
    .locals 2

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget v1, p0, Lc/a/a/a/l2/e;->b:I

    if-ge v0, v1, :cond_1

    .line 2
    iget-object v1, p0, Lc/a/a/a/l2/e;->c:[I

    aget v1, v1, v0

    if-ne v1, p1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final t(Lc/a/a/a/u0;)I
    .locals 2

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget v1, p0, Lc/a/a/a/l2/e;->b:I

    if-ge v0, v1, :cond_1

    .line 2
    iget-object v1, p0, Lc/a/a/a/l2/e;->d:[Lc/a/a/a/u0;

    aget-object v1, v1, v0

    if-ne v1, p1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method protected final u(IJ)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/l2/e;->e:[J

    aget-wide v1, v0, p1

    cmp-long p1, v1, p2

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
