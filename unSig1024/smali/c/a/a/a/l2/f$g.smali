.class public final Lc/a/a/a/l2/f$g;
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
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lc/a/a/a/l2/f$g;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Z

.field private final b:Lc/a/a/a/l2/f$c;

.field private final c:Z

.field private final d:Z

.field private final e:I

.field private final f:I

.field private final g:I


# direct methods
.method public constructor <init>(Lc/a/a/a/u0;Lc/a/a/a/l2/f$c;IZ)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lc/a/a/a/l2/f$g;->b:Lc/a/a/a/l2/f$c;

    const/high16 v0, -0x40800000    # -1.0f

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-eqz p4, :cond_4

    .line 3
    iget v4, p1, Lc/a/a/a/u0;->q:I

    if-eq v4, v3, :cond_0

    iget v5, p2, Lc/a/a/a/l2/f$c;->j:I

    if-gt v4, v5, :cond_4

    :cond_0
    iget v4, p1, Lc/a/a/a/u0;->r:I

    if-eq v4, v3, :cond_1

    iget v5, p2, Lc/a/a/a/l2/f$c;->k:I

    if-gt v4, v5, :cond_4

    :cond_1
    iget v4, p1, Lc/a/a/a/u0;->s:F

    cmpl-float v5, v4, v0

    if-eqz v5, :cond_2

    iget v5, p2, Lc/a/a/a/l2/f$c;->l:I

    int-to-float v5, v5

    cmpg-float v4, v4, v5

    if-gtz v4, :cond_4

    :cond_2
    iget v4, p1, Lc/a/a/a/u0;->h:I

    if-eq v4, v3, :cond_3

    iget v5, p2, Lc/a/a/a/l2/f$c;->m:I

    if-gt v4, v5, :cond_4

    :cond_3
    const/4 v4, 0x1

    goto :goto_0

    :cond_4
    const/4 v4, 0x0

    :goto_0
    iput-boolean v4, p0, Lc/a/a/a/l2/f$g;->a:Z

    if-eqz p4, :cond_8

    .line 4
    iget p4, p1, Lc/a/a/a/u0;->q:I

    if-eq p4, v3, :cond_5

    iget v4, p2, Lc/a/a/a/l2/f$c;->n:I

    if-lt p4, v4, :cond_8

    :cond_5
    iget p4, p1, Lc/a/a/a/u0;->r:I

    if-eq p4, v3, :cond_6

    iget v4, p2, Lc/a/a/a/l2/f$c;->o:I

    if-lt p4, v4, :cond_8

    :cond_6
    iget p4, p1, Lc/a/a/a/u0;->s:F

    cmpl-float v0, p4, v0

    if-eqz v0, :cond_7

    iget v0, p2, Lc/a/a/a/l2/f$c;->p:I

    int-to-float v0, v0

    cmpl-float p4, p4, v0

    if-ltz p4, :cond_8

    :cond_7
    iget p4, p1, Lc/a/a/a/u0;->h:I

    if-eq p4, v3, :cond_9

    iget v0, p2, Lc/a/a/a/l2/f$c;->q:I

    if-lt p4, v0, :cond_8

    goto :goto_1

    :cond_8
    const/4 v1, 0x0

    :cond_9
    :goto_1
    iput-boolean v1, p0, Lc/a/a/a/l2/f$g;->c:Z

    .line 5
    invoke-static {p3, v2}, Lc/a/a/a/l2/f;->r(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lc/a/a/a/l2/f$g;->d:Z

    .line 6
    iget p3, p1, Lc/a/a/a/u0;->h:I

    iput p3, p0, Lc/a/a/a/l2/f$g;->e:I

    .line 7
    invoke-virtual {p1}, Lc/a/a/a/u0;->n()I

    move-result p3

    iput p3, p0, Lc/a/a/a/l2/f$g;->f:I

    const p3, 0x7fffffff

    .line 8
    :goto_2
    iget-object p4, p2, Lc/a/a/a/l2/f$c;->x:Lc/a/b/b/r;

    invoke-virtual {p4}, Ljava/util/AbstractCollection;->size()I

    move-result p4

    if-ge v2, p4, :cond_b

    .line 9
    iget-object p4, p1, Lc/a/a/a/u0;->l:Ljava/lang/String;

    if-eqz p4, :cond_a

    iget-object v0, p2, Lc/a/a/a/l2/f$c;->x:Lc/a/b/b/r;

    .line 10
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_a

    move p3, v2

    goto :goto_3

    :cond_a
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 11
    :cond_b
    :goto_3
    iput p3, p0, Lc/a/a/a/l2/f$g;->g:I

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/a/l2/f$g;)I
    .locals 5

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/l2/f$g;->a:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lc/a/a/a/l2/f$g;->d:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lc/a/a/a/l2/f;->i()Lc/a/b/b/j0;

    move-result-object v0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lc/a/a/a/l2/f;->i()Lc/a/b/b/j0;

    move-result-object v0

    invoke-virtual {v0}, Lc/a/b/b/j0;->f()Lc/a/b/b/j0;

    move-result-object v0

    .line 4
    :goto_0
    invoke-static {}, Lc/a/b/b/m;->j()Lc/a/b/b/m;

    move-result-object v1

    iget-boolean v2, p0, Lc/a/a/a/l2/f$g;->d:Z

    iget-boolean v3, p1, Lc/a/a/a/l2/f$g;->d:Z

    .line 5
    invoke-virtual {v1, v2, v3}, Lc/a/b/b/m;->g(ZZ)Lc/a/b/b/m;

    move-result-object v1

    iget-boolean v2, p0, Lc/a/a/a/l2/f$g;->a:Z

    iget-boolean v3, p1, Lc/a/a/a/l2/f$g;->a:Z

    .line 6
    invoke-virtual {v1, v2, v3}, Lc/a/b/b/m;->g(ZZ)Lc/a/b/b/m;

    move-result-object v1

    iget-boolean v2, p0, Lc/a/a/a/l2/f$g;->c:Z

    iget-boolean v3, p1, Lc/a/a/a/l2/f$g;->c:Z

    .line 7
    invoke-virtual {v1, v2, v3}, Lc/a/b/b/m;->g(ZZ)Lc/a/b/b/m;

    move-result-object v1

    iget v2, p0, Lc/a/a/a/l2/f$g;->g:I

    .line 8
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lc/a/a/a/l2/f$g;->g:I

    .line 9
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 10
    invoke-static {}, Lc/a/b/b/j0;->c()Lc/a/b/b/j0;

    move-result-object v4

    invoke-virtual {v4}, Lc/a/b/b/j0;->f()Lc/a/b/b/j0;

    move-result-object v4

    .line 11
    invoke-virtual {v1, v2, v3, v4}, Lc/a/b/b/m;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lc/a/b/b/m;

    move-result-object v1

    iget v2, p0, Lc/a/a/a/l2/f$g;->e:I

    .line 12
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lc/a/a/a/l2/f$g;->e:I

    .line 13
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 14
    iget-object v4, p0, Lc/a/a/a/l2/f$g;->b:Lc/a/a/a/l2/f$c;

    iget-boolean v4, v4, Lc/a/a/a/l2/f$c;->H:Z

    if-eqz v4, :cond_1

    invoke-static {}, Lc/a/a/a/l2/f;->i()Lc/a/b/b/j0;

    move-result-object v4

    invoke-virtual {v4}, Lc/a/b/b/j0;->f()Lc/a/b/b/j0;

    move-result-object v4

    goto :goto_1

    :cond_1
    invoke-static {}, Lc/a/a/a/l2/f;->j()Lc/a/b/b/j0;

    move-result-object v4

    .line 15
    :goto_1
    invoke-virtual {v1, v2, v3, v4}, Lc/a/b/b/m;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lc/a/b/b/m;

    move-result-object v1

    iget v2, p0, Lc/a/a/a/l2/f$g;->f:I

    .line 16
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lc/a/a/a/l2/f$g;->f:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lc/a/b/b/m;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lc/a/b/b/m;

    move-result-object v1

    iget v2, p0, Lc/a/a/a/l2/f$g;->e:I

    .line 17
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget p1, p1, Lc/a/a/a/l2/f$g;->e:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, v2, p1, v0}, Lc/a/b/b/m;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lc/a/b/b/m;

    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lc/a/b/b/m;->i()I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lc/a/a/a/l2/f$g;

    invoke-virtual {p0, p1}, Lc/a/a/a/l2/f$g;->a(Lc/a/a/a/l2/f$g;)I

    move-result p1

    return p1
.end method
