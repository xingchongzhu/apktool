.class public final Lc/a/a/a/f2/m0/e0;
.super Ljava/lang/Object;
.source "SeiReader.java"


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/a/u0;",
            ">;"
        }
    .end annotation
.end field

.field private final b:[Lc/a/a/a/f2/b0;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/a/a/a/u0;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/f2/m0/e0;->a:Ljava/util/List;

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lc/a/a/a/f2/b0;

    iput-object p1, p0, Lc/a/a/a/f2/m0/e0;->b:[Lc/a/a/a/f2/b0;

    return-void
.end method


# virtual methods
.method public a(JLc/a/a/a/m2/a0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/m0/e0;->b:[Lc/a/a/a/f2/b0;

    invoke-static {p1, p2, p3, v0}, Lc/a/a/a/f2/d;->a(JLc/a/a/a/m2/a0;[Lc/a/a/a/f2/b0;)V

    return-void
.end method

.method public b(Lc/a/a/a/f2/l;Lc/a/a/a/f2/m0/i0$d;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    iget-object v2, p0, Lc/a/a/a/f2/m0/e0;->b:[Lc/a/a/a/f2/b0;

    array-length v2, v2

    if-ge v1, v2, :cond_3

    .line 2
    invoke-virtual {p2}, Lc/a/a/a/f2/m0/i0$d;->a()V

    .line 3
    invoke-virtual {p2}, Lc/a/a/a/f2/m0/i0$d;->c()I

    move-result v2

    const/4 v3, 0x3

    invoke-interface {p1, v2, v3}, Lc/a/a/a/f2/l;->q(II)Lc/a/a/a/f2/b0;

    move-result-object v2

    .line 4
    iget-object v3, p0, Lc/a/a/a/f2/m0/e0;->a:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/a/a/a/u0;

    .line 5
    iget-object v4, v3, Lc/a/a/a/u0;->l:Ljava/lang/String;

    const-string v5, "application/cea-608"

    .line 6
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    const-string v5, "application/cea-708"

    .line 7
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v5, 0x1

    :goto_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Invalid closed caption mime type provided: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 8
    invoke-static {v5, v6}, Lc/a/a/a/m2/f;->b(ZLjava/lang/Object;)V

    .line 9
    iget-object v5, v3, Lc/a/a/a/u0;->a:Ljava/lang/String;

    if-eqz v5, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {p2}, Lc/a/a/a/f2/m0/i0$d;->b()Ljava/lang/String;

    move-result-object v5

    .line 10
    :goto_3
    new-instance v6, Lc/a/a/a/u0$b;

    invoke-direct {v6}, Lc/a/a/a/u0$b;-><init>()V

    .line 11
    invoke-virtual {v6, v5}, Lc/a/a/a/u0$b;->S(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v5

    .line 12
    invoke-virtual {v5, v4}, Lc/a/a/a/u0$b;->e0(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v4

    iget v5, v3, Lc/a/a/a/u0;->d:I

    .line 13
    invoke-virtual {v4, v5}, Lc/a/a/a/u0$b;->g0(I)Lc/a/a/a/u0$b;

    move-result-object v4

    iget-object v5, v3, Lc/a/a/a/u0;->c:Ljava/lang/String;

    .line 14
    invoke-virtual {v4, v5}, Lc/a/a/a/u0$b;->V(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v4

    iget v5, v3, Lc/a/a/a/u0;->D:I

    .line 15
    invoke-virtual {v4, v5}, Lc/a/a/a/u0$b;->F(I)Lc/a/a/a/u0$b;

    move-result-object v4

    iget-object v3, v3, Lc/a/a/a/u0;->n:Ljava/util/List;

    .line 16
    invoke-virtual {v4, v3}, Lc/a/a/a/u0$b;->T(Ljava/util/List;)Lc/a/a/a/u0$b;

    move-result-object v3

    .line 17
    invoke-virtual {v3}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object v3

    .line 18
    invoke-interface {v2, v3}, Lc/a/a/a/f2/b0;->d(Lc/a/a/a/u0;)V

    .line 19
    iget-object v3, p0, Lc/a/a/a/f2/m0/e0;->b:[Lc/a/a/a/f2/b0;

    aput-object v2, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method
