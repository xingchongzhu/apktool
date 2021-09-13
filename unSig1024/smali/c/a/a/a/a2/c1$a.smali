.class final Lc/a/a/a/a2/c1$a;
.super Ljava/lang/Object;
.source "AnalyticsCollector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/a2/c1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lc/a/a/a/x1$b;

.field private b:Lc/a/b/b/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/b/r<",
            "Lc/a/a/a/j2/d0$a;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lc/a/b/b/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/b/t<",
            "Lc/a/a/a/j2/d0$a;",
            "Lc/a/a/a/x1;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lc/a/a/a/j2/d0$a;

.field private e:Lc/a/a/a/j2/d0$a;

.field private f:Lc/a/a/a/j2/d0$a;


# direct methods
.method public constructor <init>(Lc/a/a/a/x1$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/a2/c1$a;->a:Lc/a/a/a/x1$b;

    .line 3
    invoke-static {}, Lc/a/b/b/r;->p()Lc/a/b/b/r;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/a2/c1$a;->b:Lc/a/b/b/r;

    .line 4
    invoke-static {}, Lc/a/b/b/t;->j()Lc/a/b/b/t;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/a2/c1$a;->c:Lc/a/b/b/t;

    return-void
.end method

.method static synthetic a(Lc/a/a/a/a2/c1$a;)Lc/a/b/b/r;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/a2/c1$a;->b:Lc/a/b/b/r;

    return-object p0
.end method

.method private b(Lc/a/b/b/t$a;Lc/a/a/a/j2/d0$a;Lc/a/a/a/x1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/b/b/t$a<",
            "Lc/a/a/a/j2/d0$a;",
            "Lc/a/a/a/x1;",
            ">;",
            "Lc/a/a/a/j2/d0$a;",
            "Lc/a/a/a/x1;",
            ")V"
        }
    .end annotation

    if-nez p2, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p2, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    invoke-virtual {p3, v0}, Lc/a/a/a/x1;->b(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 2
    invoke-virtual {p1, p2, p3}, Lc/a/b/b/t$a;->c(Ljava/lang/Object;Ljava/lang/Object;)Lc/a/b/b/t$a;

    goto :goto_0

    .line 3
    :cond_1
    iget-object p3, p0, Lc/a/a/a/a2/c1$a;->c:Lc/a/b/b/t;

    invoke-virtual {p3, p2}, Lc/a/b/b/t;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lc/a/a/a/x1;

    if-eqz p3, :cond_2

    .line 4
    invoke-virtual {p1, p2, p3}, Lc/a/b/b/t$a;->c(Ljava/lang/Object;Ljava/lang/Object;)Lc/a/b/b/t$a;

    :cond_2
    :goto_0
    return-void
.end method

.method private static c(Lc/a/a/a/l1;Lc/a/b/b/r;Lc/a/a/a/j2/d0$a;Lc/a/a/a/x1$b;)Lc/a/a/a/j2/d0$a;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/l1;",
            "Lc/a/b/b/r<",
            "Lc/a/a/a/j2/d0$a;",
            ">;",
            "Lc/a/a/a/j2/d0$a;",
            "Lc/a/a/a/x1$b;",
            ")",
            "Lc/a/a/a/j2/d0$a;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lc/a/a/a/l1;->M()Lc/a/a/a/x1;

    move-result-object v0

    .line 2
    invoke-interface {p0}, Lc/a/a/a/l1;->u()I

    move-result v1

    .line 3
    invoke-virtual {v0}, Lc/a/a/a/x1;->q()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lc/a/a/a/x1;->m(I)Ljava/lang/Object;

    move-result-object v2

    .line 4
    :goto_0
    invoke-interface {p0}, Lc/a/a/a/l1;->h()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v0}, Lc/a/a/a/x1;->q()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    .line 5
    :cond_1
    invoke-virtual {v0, v1, p3}, Lc/a/a/a/x1;->f(ILc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object v0

    .line 6
    invoke-interface {p0}, Lc/a/a/a/l1;->W()J

    move-result-wide v4

    invoke-static {v4, v5}, Lc/a/a/a/i0;->c(J)J

    move-result-wide v4

    invoke-virtual {p3}, Lc/a/a/a/x1$b;->l()J

    move-result-wide v6

    sub-long/2addr v4, v6

    .line 7
    invoke-virtual {v0, v4, v5}, Lc/a/a/a/x1$b;->d(J)I

    move-result p3

    goto :goto_2

    :cond_2
    :goto_1
    const/4 p3, -0x1

    :goto_2
    const/4 v0, 0x0

    .line 8
    :goto_3
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 9
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/j2/d0$a;

    .line 10
    invoke-interface {p0}, Lc/a/a/a/l1;->h()Z

    move-result v6

    .line 11
    invoke-interface {p0}, Lc/a/a/a/l1;->z()I

    move-result v7

    .line 12
    invoke-interface {p0}, Lc/a/a/a/l1;->D()I

    move-result v8

    move-object v4, v1

    move-object v5, v2

    move v9, p3

    .line 13
    invoke-static/range {v4 .. v9}, Lc/a/a/a/a2/c1$a;->i(Lc/a/a/a/j2/d0$a;Ljava/lang/Object;ZIII)Z

    move-result v4

    if-eqz v4, :cond_3

    return-object v1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 14
    :cond_4
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    if-eqz p2, :cond_5

    .line 15
    invoke-interface {p0}, Lc/a/a/a/l1;->h()Z

    move-result v6

    .line 16
    invoke-interface {p0}, Lc/a/a/a/l1;->z()I

    move-result v7

    .line 17
    invoke-interface {p0}, Lc/a/a/a/l1;->D()I

    move-result v8

    move-object v4, p2

    move-object v5, v2

    move v9, p3

    .line 18
    invoke-static/range {v4 .. v9}, Lc/a/a/a/a2/c1$a;->i(Lc/a/a/a/j2/d0$a;Ljava/lang/Object;ZIII)Z

    move-result p0

    if-eqz p0, :cond_5

    return-object p2

    :cond_5
    return-object v3
.end method

.method private static i(Lc/a/a/a/j2/d0$a;Ljava/lang/Object;ZIII)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    if-eqz p2, :cond_1

    .line 2
    iget p1, p0, Lc/a/a/a/j2/b0;->b:I

    if-ne p1, p3, :cond_1

    iget p1, p0, Lc/a/a/a/j2/b0;->c:I

    if-eq p1, p4, :cond_2

    :cond_1
    if-nez p2, :cond_3

    iget p1, p0, Lc/a/a/a/j2/b0;->b:I

    const/4 p2, -0x1

    if-ne p1, p2, :cond_3

    iget p0, p0, Lc/a/a/a/j2/b0;->e:I

    if-ne p0, p5, :cond_3

    :cond_2
    const/4 v0, 0x1

    :cond_3
    return v0
.end method

.method private m(Lc/a/a/a/x1;)V
    .locals 3

    .line 1
    invoke-static {}, Lc/a/b/b/t;->a()Lc/a/b/b/t$a;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lc/a/a/a/a2/c1$a;->b:Lc/a/b/b/r;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    iget-object v1, p0, Lc/a/a/a/a2/c1$a;->e:Lc/a/a/a/j2/d0$a;

    invoke-direct {p0, v0, v1, p1}, Lc/a/a/a/a2/c1$a;->b(Lc/a/b/b/t$a;Lc/a/a/a/j2/d0$a;Lc/a/a/a/x1;)V

    .line 4
    iget-object v1, p0, Lc/a/a/a/a2/c1$a;->f:Lc/a/a/a/j2/d0$a;

    iget-object v2, p0, Lc/a/a/a/a2/c1$a;->e:Lc/a/a/a/j2/d0$a;

    invoke-static {v1, v2}, Lc/a/b/a/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 5
    iget-object v1, p0, Lc/a/a/a/a2/c1$a;->f:Lc/a/a/a/j2/d0$a;

    invoke-direct {p0, v0, v1, p1}, Lc/a/a/a/a2/c1$a;->b(Lc/a/b/b/t$a;Lc/a/a/a/j2/d0$a;Lc/a/a/a/x1;)V

    .line 6
    :cond_0
    iget-object v1, p0, Lc/a/a/a/a2/c1$a;->d:Lc/a/a/a/j2/d0$a;

    iget-object v2, p0, Lc/a/a/a/a2/c1$a;->e:Lc/a/a/a/j2/d0$a;

    invoke-static {v1, v2}, Lc/a/b/a/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lc/a/a/a/a2/c1$a;->d:Lc/a/a/a/j2/d0$a;

    iget-object v2, p0, Lc/a/a/a/a2/c1$a;->f:Lc/a/a/a/j2/d0$a;

    .line 7
    invoke-static {v1, v2}, Lc/a/b/a/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 8
    iget-object v1, p0, Lc/a/a/a/a2/c1$a;->d:Lc/a/a/a/j2/d0$a;

    invoke-direct {p0, v0, v1, p1}, Lc/a/a/a/a2/c1$a;->b(Lc/a/b/b/t$a;Lc/a/a/a/j2/d0$a;Lc/a/a/a/x1;)V

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 9
    :goto_0
    iget-object v2, p0, Lc/a/a/a/a2/c1$a;->b:Lc/a/b/b/r;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 10
    iget-object v2, p0, Lc/a/a/a/a2/c1$a;->b:Lc/a/b/b/r;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/a/a/a/j2/d0$a;

    invoke-direct {p0, v0, v2, p1}, Lc/a/a/a/a2/c1$a;->b(Lc/a/b/b/t$a;Lc/a/a/a/j2/d0$a;Lc/a/a/a/x1;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 11
    :cond_2
    iget-object v1, p0, Lc/a/a/a/a2/c1$a;->b:Lc/a/b/b/r;

    iget-object v2, p0, Lc/a/a/a/a2/c1$a;->d:Lc/a/a/a/j2/d0$a;

    invoke-virtual {v1, v2}, Lc/a/b/b/r;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 12
    iget-object v1, p0, Lc/a/a/a/a2/c1$a;->d:Lc/a/a/a/j2/d0$a;

    invoke-direct {p0, v0, v1, p1}, Lc/a/a/a/a2/c1$a;->b(Lc/a/b/b/t$a;Lc/a/a/a/j2/d0$a;Lc/a/a/a/x1;)V

    .line 13
    :cond_3
    :goto_1
    invoke-virtual {v0}, Lc/a/b/b/t$a;->a()Lc/a/b/b/t;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/a2/c1$a;->c:Lc/a/b/b/t;

    return-void
.end method


# virtual methods
.method public d()Lc/a/a/a/j2/d0$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/a2/c1$a;->d:Lc/a/a/a/j2/d0$a;

    return-object v0
.end method

.method public e()Lc/a/a/a/j2/d0$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/a2/c1$a;->b:Lc/a/b/b/r;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lc/a/a/a/a2/c1$a;->b:Lc/a/b/b/r;

    invoke-static {v0}, Lc/a/b/b/w;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/j2/d0$a;

    :goto_0
    return-object v0
.end method

.method public f(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/x1;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/a2/c1$a;->c:Lc/a/b/b/t;

    invoke-virtual {v0, p1}, Lc/a/b/b/t;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/x1;

    return-object p1
.end method

.method public g()Lc/a/a/a/j2/d0$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/a2/c1$a;->e:Lc/a/a/a/j2/d0$a;

    return-object v0
.end method

.method public h()Lc/a/a/a/j2/d0$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/a2/c1$a;->f:Lc/a/a/a/j2/d0$a;

    return-object v0
.end method

.method public j(Lc/a/a/a/l1;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/a2/c1$a;->b:Lc/a/b/b/r;

    iget-object v1, p0, Lc/a/a/a/a2/c1$a;->e:Lc/a/a/a/j2/d0$a;

    iget-object v2, p0, Lc/a/a/a/a2/c1$a;->a:Lc/a/a/a/x1$b;

    .line 2
    invoke-static {p1, v0, v1, v2}, Lc/a/a/a/a2/c1$a;->c(Lc/a/a/a/l1;Lc/a/b/b/r;Lc/a/a/a/j2/d0$a;Lc/a/a/a/x1$b;)Lc/a/a/a/j2/d0$a;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/a2/c1$a;->d:Lc/a/a/a/j2/d0$a;

    return-void
.end method

.method public k(Ljava/util/List;Lc/a/a/a/j2/d0$a;Lc/a/a/a/l1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/a/a/a/j2/d0$a;",
            ">;",
            "Lc/a/a/a/j2/d0$a;",
            "Lc/a/a/a/l1;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lc/a/b/b/r;->m(Ljava/util/Collection;)Lc/a/b/b/r;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/a2/c1$a;->b:Lc/a/b/b/r;

    .line 2
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 3
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/j2/d0$a;

    iput-object p1, p0, Lc/a/a/a/a2/c1$a;->e:Lc/a/a/a/j2/d0$a;

    .line 4
    invoke-static {p2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/j2/d0$a;

    iput-object p1, p0, Lc/a/a/a/a2/c1$a;->f:Lc/a/a/a/j2/d0$a;

    .line 5
    :cond_0
    iget-object p1, p0, Lc/a/a/a/a2/c1$a;->d:Lc/a/a/a/j2/d0$a;

    if-nez p1, :cond_1

    .line 6
    iget-object p1, p0, Lc/a/a/a/a2/c1$a;->b:Lc/a/b/b/r;

    iget-object p2, p0, Lc/a/a/a/a2/c1$a;->e:Lc/a/a/a/j2/d0$a;

    iget-object v0, p0, Lc/a/a/a/a2/c1$a;->a:Lc/a/a/a/x1$b;

    .line 7
    invoke-static {p3, p1, p2, v0}, Lc/a/a/a/a2/c1$a;->c(Lc/a/a/a/l1;Lc/a/b/b/r;Lc/a/a/a/j2/d0$a;Lc/a/a/a/x1$b;)Lc/a/a/a/j2/d0$a;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/a2/c1$a;->d:Lc/a/a/a/j2/d0$a;

    .line 8
    :cond_1
    invoke-interface {p3}, Lc/a/a/a/l1;->M()Lc/a/a/a/x1;

    move-result-object p1

    invoke-direct {p0, p1}, Lc/a/a/a/a2/c1$a;->m(Lc/a/a/a/x1;)V

    return-void
.end method

.method public l(Lc/a/a/a/l1;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/a2/c1$a;->b:Lc/a/b/b/r;

    iget-object v1, p0, Lc/a/a/a/a2/c1$a;->e:Lc/a/a/a/j2/d0$a;

    iget-object v2, p0, Lc/a/a/a/a2/c1$a;->a:Lc/a/a/a/x1$b;

    .line 2
    invoke-static {p1, v0, v1, v2}, Lc/a/a/a/a2/c1$a;->c(Lc/a/a/a/l1;Lc/a/b/b/r;Lc/a/a/a/j2/d0$a;Lc/a/a/a/x1$b;)Lc/a/a/a/j2/d0$a;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/a2/c1$a;->d:Lc/a/a/a/j2/d0$a;

    .line 3
    invoke-interface {p1}, Lc/a/a/a/l1;->M()Lc/a/a/a/x1;

    move-result-object p1

    invoke-direct {p0, p1}, Lc/a/a/a/a2/c1$a;->m(Lc/a/a/a/x1;)V

    return-void
.end method
