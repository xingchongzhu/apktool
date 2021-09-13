.class public final Lc/a/a/a/l2/f$f;
.super Ljava/lang/Object;
.source "DefaultTrackSelector.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/l2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1c
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lc/a/a/a/l2/f$f;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Z

.field private final b:Z

.field private final c:Z

.field private final d:Z

.field private final e:I

.field private final f:I

.field private final g:I

.field private final h:I

.field private final i:Z


# direct methods
.method public constructor <init>(Lc/a/a/a/u0;Lc/a/a/a/l2/f$c;ILjava/lang/String;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    invoke-static {p3, v0}, Lc/a/a/a/l2/f;->r(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lc/a/a/a/l2/f$f;->b:Z

    .line 3
    iget p3, p1, Lc/a/a/a/u0;->d:I

    iget v1, p2, Lc/a/a/a/l2/m;->h:I

    xor-int/lit8 v1, v1, -0x1

    and-int/2addr p3, v1

    and-int/lit8 v1, p3, 0x1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 4
    :goto_0
    iput-boolean v1, p0, Lc/a/a/a/l2/f$f;->c:Z

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p3, 0x1

    goto :goto_1

    :cond_1
    const/4 p3, 0x0

    .line 5
    :goto_1
    iput-boolean p3, p0, Lc/a/a/a/l2/f$f;->d:Z

    const p3, 0x7fffffff

    .line 6
    iget-object v1, p2, Lc/a/a/a/l2/m;->e:Lc/a/b/b/r;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, ""

    .line 7
    invoke-static {v1}, Lc/a/b/b/r;->q(Ljava/lang/Object;)Lc/a/b/b/r;

    move-result-object v1

    goto :goto_2

    .line 8
    :cond_2
    iget-object v1, p2, Lc/a/a/a/l2/m;->e:Lc/a/b/b/r;

    :goto_2
    const/4 v3, 0x0

    .line 9
    :goto_3
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v4

    if-ge v3, v4, :cond_4

    .line 10
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-boolean v5, p2, Lc/a/a/a/l2/m;->g:Z

    .line 11
    invoke-static {p1, v4, v5}, Lc/a/a/a/l2/f;->o(Lc/a/a/a/u0;Ljava/lang/String;Z)I

    move-result v4

    if-lez v4, :cond_3

    move p3, v3

    goto :goto_4

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_4
    const/4 v4, 0x0

    .line 12
    :goto_4
    iput p3, p0, Lc/a/a/a/l2/f$f;->e:I

    .line 13
    iput v4, p0, Lc/a/a/a/l2/f$f;->f:I

    .line 14
    iget p3, p1, Lc/a/a/a/u0;->e:I

    iget v1, p2, Lc/a/a/a/l2/m;->f:I

    and-int/2addr p3, v1

    .line 15
    invoke-static {p3}, Ljava/lang/Integer;->bitCount(I)I

    move-result p3

    iput p3, p0, Lc/a/a/a/l2/f$f;->g:I

    .line 16
    iget v1, p1, Lc/a/a/a/u0;->e:I

    and-int/lit16 v1, v1, 0x440

    if-eqz v1, :cond_5

    const/4 v1, 0x1

    goto :goto_5

    :cond_5
    const/4 v1, 0x0

    :goto_5
    iput-boolean v1, p0, Lc/a/a/a/l2/f$f;->i:Z

    .line 17
    invoke-static {p4}, Lc/a/a/a/l2/f;->x(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    const/4 v1, 0x1

    goto :goto_6

    :cond_6
    const/4 v1, 0x0

    .line 18
    :goto_6
    invoke-static {p1, p4, v1}, Lc/a/a/a/l2/f;->o(Lc/a/a/a/u0;Ljava/lang/String;Z)I

    move-result p1

    iput p1, p0, Lc/a/a/a/l2/f$f;->h:I

    if-gtz v4, :cond_8

    .line 19
    iget-object p2, p2, Lc/a/a/a/l2/m;->e:Lc/a/b/b/r;

    .line 20
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_7

    if-gtz p3, :cond_8

    :cond_7
    iget-boolean p2, p0, Lc/a/a/a/l2/f$f;->c:Z

    if-nez p2, :cond_8

    iget-boolean p2, p0, Lc/a/a/a/l2/f$f;->d:Z

    if-eqz p2, :cond_9

    if-lez p1, :cond_9

    :cond_8
    const/4 v0, 0x1

    :cond_9
    iput-boolean v0, p0, Lc/a/a/a/l2/f$f;->a:Z

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/a/l2/f$f;)I
    .locals 4

    .line 1
    invoke-static {}, Lc/a/b/b/m;->j()Lc/a/b/b/m;

    move-result-object v0

    iget-boolean v1, p0, Lc/a/a/a/l2/f$f;->b:Z

    iget-boolean v2, p1, Lc/a/a/a/l2/f$f;->b:Z

    .line 2
    invoke-virtual {v0, v1, v2}, Lc/a/b/b/m;->g(ZZ)Lc/a/b/b/m;

    move-result-object v0

    iget v1, p0, Lc/a/a/a/l2/f$f;->e:I

    .line 3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p1, Lc/a/a/a/l2/f$f;->e:I

    .line 4
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 5
    invoke-static {}, Lc/a/b/b/j0;->c()Lc/a/b/b/j0;

    move-result-object v3

    invoke-virtual {v3}, Lc/a/b/b/j0;->f()Lc/a/b/b/j0;

    move-result-object v3

    .line 6
    invoke-virtual {v0, v1, v2, v3}, Lc/a/b/b/m;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lc/a/b/b/m;

    move-result-object v0

    iget v1, p0, Lc/a/a/a/l2/f$f;->f:I

    iget v2, p1, Lc/a/a/a/l2/f$f;->f:I

    .line 7
    invoke-virtual {v0, v1, v2}, Lc/a/b/b/m;->d(II)Lc/a/b/b/m;

    move-result-object v0

    iget v1, p0, Lc/a/a/a/l2/f$f;->g:I

    iget v2, p1, Lc/a/a/a/l2/f$f;->g:I

    .line 8
    invoke-virtual {v0, v1, v2}, Lc/a/b/b/m;->d(II)Lc/a/b/b/m;

    move-result-object v0

    iget-boolean v1, p0, Lc/a/a/a/l2/f$f;->c:Z

    iget-boolean v2, p1, Lc/a/a/a/l2/f$f;->c:Z

    .line 9
    invoke-virtual {v0, v1, v2}, Lc/a/b/b/m;->g(ZZ)Lc/a/b/b/m;

    move-result-object v0

    iget-boolean v1, p0, Lc/a/a/a/l2/f$f;->d:Z

    .line 10
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v2, p1, Lc/a/a/a/l2/f$f;->d:Z

    .line 11
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .line 12
    iget v3, p0, Lc/a/a/a/l2/f$f;->f:I

    if-nez v3, :cond_0

    invoke-static {}, Lc/a/b/b/j0;->c()Lc/a/b/b/j0;

    move-result-object v3

    goto :goto_0

    :cond_0
    invoke-static {}, Lc/a/b/b/j0;->c()Lc/a/b/b/j0;

    move-result-object v3

    invoke-virtual {v3}, Lc/a/b/b/j0;->f()Lc/a/b/b/j0;

    move-result-object v3

    .line 13
    :goto_0
    invoke-virtual {v0, v1, v2, v3}, Lc/a/b/b/m;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lc/a/b/b/m;

    move-result-object v0

    iget v1, p0, Lc/a/a/a/l2/f$f;->h:I

    iget v2, p1, Lc/a/a/a/l2/f$f;->h:I

    .line 14
    invoke-virtual {v0, v1, v2}, Lc/a/b/b/m;->d(II)Lc/a/b/b/m;

    move-result-object v0

    .line 15
    iget v1, p0, Lc/a/a/a/l2/f$f;->g:I

    if-nez v1, :cond_1

    .line 16
    iget-boolean v1, p0, Lc/a/a/a/l2/f$f;->i:Z

    iget-boolean p1, p1, Lc/a/a/a/l2/f$f;->i:Z

    invoke-virtual {v0, v1, p1}, Lc/a/b/b/m;->h(ZZ)Lc/a/b/b/m;

    move-result-object v0

    .line 17
    :cond_1
    invoke-virtual {v0}, Lc/a/b/b/m;->i()I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lc/a/a/a/l2/f$f;

    invoke-virtual {p0, p1}, Lc/a/a/a/l2/f$f;->a(Lc/a/a/a/l2/f$f;)I

    move-result p1

    return p1
.end method
