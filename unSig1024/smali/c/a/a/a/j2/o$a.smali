.class final Lc/a/a/a/j2/o$a;
.super Ljava/lang/Object;
.source "CompositeMediaSource.java"

# interfaces
.implements Lc/a/a/a/j2/e0;
.implements Lc/a/a/a/e2/w;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/j2/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private b:Lc/a/a/a/j2/e0$a;

.field private c:Lc/a/a/a/e2/w$a;

.field final synthetic d:Lc/a/a/a/j2/o;


# direct methods
.method public constructor <init>(Lc/a/a/a/j2/o;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lc/a/a/a/j2/o$a;->d:Lc/a/a/a/j2/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Lc/a/a/a/j2/k;->s(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/j2/e0$a;

    move-result-object v1

    iput-object v1, p0, Lc/a/a/a/j2/o$a;->b:Lc/a/a/a/j2/e0$a;

    .line 3
    invoke-virtual {p1, v0}, Lc/a/a/a/j2/k;->q(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/e2/w$a;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/j2/o$a;->c:Lc/a/a/a/e2/w$a;

    .line 4
    iput-object p2, p0, Lc/a/a/a/j2/o$a;->a:Ljava/lang/Object;

    return-void
.end method

.method private a(ILc/a/a/a/j2/d0$a;)Z
    .locals 3

    if-eqz p2, :cond_0

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/o$a;->d:Lc/a/a/a/j2/o;

    iget-object v1, p0, Lc/a/a/a/j2/o$a;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, p2}, Lc/a/a/a/j2/o;->z(Ljava/lang/Object;Lc/a/a/a/j2/d0$a;)Lc/a/a/a/j2/d0$a;

    move-result-object p2

    if-nez p2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p2, 0x0

    .line 2
    :cond_1
    iget-object v0, p0, Lc/a/a/a/j2/o$a;->d:Lc/a/a/a/j2/o;

    iget-object v1, p0, Lc/a/a/a/j2/o$a;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Lc/a/a/a/j2/o;->B(Ljava/lang/Object;I)I

    move-result p1

    .line 3
    iget-object v0, p0, Lc/a/a/a/j2/o$a;->b:Lc/a/a/a/j2/e0$a;

    iget v1, v0, Lc/a/a/a/j2/e0$a;->a:I

    if-ne v1, p1, :cond_2

    iget-object v0, v0, Lc/a/a/a/j2/e0$a;->b:Lc/a/a/a/j2/d0$a;

    .line 4
    invoke-static {v0, p2}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 5
    :cond_2
    iget-object v0, p0, Lc/a/a/a/j2/o$a;->d:Lc/a/a/a/j2/o;

    const-wide/16 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, p2, v1, v2}, Lc/a/a/a/j2/k;->r(ILc/a/a/a/j2/d0$a;J)Lc/a/a/a/j2/e0$a;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/j2/o$a;->b:Lc/a/a/a/j2/e0$a;

    .line 7
    :cond_3
    iget-object v0, p0, Lc/a/a/a/j2/o$a;->c:Lc/a/a/a/e2/w$a;

    iget v1, v0, Lc/a/a/a/e2/w$a;->a:I

    if-ne v1, p1, :cond_4

    iget-object v0, v0, Lc/a/a/a/e2/w$a;->b:Lc/a/a/a/j2/d0$a;

    .line 8
    invoke-static {v0, p2}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 9
    :cond_4
    iget-object v0, p0, Lc/a/a/a/j2/o$a;->d:Lc/a/a/a/j2/o;

    invoke-virtual {v0, p1, p2}, Lc/a/a/a/j2/k;->p(ILc/a/a/a/j2/d0$a;)Lc/a/a/a/e2/w$a;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/j2/o$a;->c:Lc/a/a/a/e2/w$a;

    :cond_5
    const/4 p1, 0x1

    return p1
.end method

.method private b(Lc/a/a/a/j2/z;)Lc/a/a/a/j2/z;
    .locals 14

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/o$a;->d:Lc/a/a/a/j2/o;

    iget-object v1, p0, Lc/a/a/a/j2/o$a;->a:Ljava/lang/Object;

    iget-wide v2, p1, Lc/a/a/a/j2/z;->f:J

    invoke-virtual {v0, v1, v2, v3}, Lc/a/a/a/j2/o;->A(Ljava/lang/Object;J)J

    move-result-wide v10

    .line 2
    iget-object v0, p0, Lc/a/a/a/j2/o$a;->d:Lc/a/a/a/j2/o;

    iget-object v1, p0, Lc/a/a/a/j2/o$a;->a:Ljava/lang/Object;

    iget-wide v2, p1, Lc/a/a/a/j2/z;->g:J

    invoke-virtual {v0, v1, v2, v3}, Lc/a/a/a/j2/o;->A(Ljava/lang/Object;J)J

    move-result-wide v12

    .line 3
    iget-wide v0, p1, Lc/a/a/a/j2/z;->f:J

    cmp-long v2, v10, v0

    if-nez v2, :cond_0

    iget-wide v0, p1, Lc/a/a/a/j2/z;->g:J

    cmp-long v2, v12, v0

    if-nez v2, :cond_0

    return-object p1

    .line 4
    :cond_0
    new-instance v0, Lc/a/a/a/j2/z;

    iget v5, p1, Lc/a/a/a/j2/z;->a:I

    iget v6, p1, Lc/a/a/a/j2/z;->b:I

    iget-object v7, p1, Lc/a/a/a/j2/z;->c:Lc/a/a/a/u0;

    iget v8, p1, Lc/a/a/a/j2/z;->d:I

    iget-object v9, p1, Lc/a/a/a/j2/z;->e:Ljava/lang/Object;

    move-object v4, v0

    invoke-direct/range {v4 .. v13}, Lc/a/a/a/j2/z;-><init>(IILc/a/a/a/u0;ILjava/lang/Object;JJ)V

    return-object v0
.end method


# virtual methods
.method public C(ILc/a/a/a/j2/d0$a;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/j2/o$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/j2/o$a;->c:Lc/a/a/a/e2/w$a;

    invoke-virtual {p1, p3}, Lc/a/a/a/e2/w$a;->f(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public E(ILc/a/a/a/j2/d0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/j2/o$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/j2/o$a;->c:Lc/a/a/a/e2/w$a;

    invoke-virtual {p1}, Lc/a/a/a/e2/w$a;->b()V

    :cond_0
    return-void
.end method

.method public F(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/j2/o$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/j2/o$a;->b:Lc/a/a/a/j2/e0$a;

    .line 3
    invoke-direct {p0, p4}, Lc/a/a/a/j2/o$a;->b(Lc/a/a/a/j2/z;)Lc/a/a/a/j2/z;

    move-result-object p2

    .line 4
    invoke-virtual {p1, p3, p2}, Lc/a/a/a/j2/e0$a;->B(Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    :cond_0
    return-void
.end method

.method public I(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/j2/o$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/j2/o$a;->b:Lc/a/a/a/j2/e0$a;

    .line 3
    invoke-direct {p0, p4}, Lc/a/a/a/j2/o$a;->b(Lc/a/a/a/j2/z;)Lc/a/a/a/j2/z;

    move-result-object p2

    .line 4
    invoke-virtual {p1, p3, p2}, Lc/a/a/a/j2/e0$a;->v(Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    :cond_0
    return-void
.end method

.method public Q(ILc/a/a/a/j2/d0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/j2/o$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/j2/o$a;->c:Lc/a/a/a/e2/w$a;

    invoke-virtual {p1}, Lc/a/a/a/e2/w$a;->g()V

    :cond_0
    return-void
.end method

.method public V(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Ljava/io/IOException;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/j2/o$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/j2/o$a;->b:Lc/a/a/a/j2/e0$a;

    .line 3
    invoke-direct {p0, p4}, Lc/a/a/a/j2/o$a;->b(Lc/a/a/a/j2/z;)Lc/a/a/a/j2/z;

    move-result-object p2

    .line 4
    invoke-virtual {p1, p3, p2, p5, p6}, Lc/a/a/a/j2/e0$a;->y(Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Ljava/io/IOException;Z)V

    :cond_0
    return-void
.end method

.method public Y(ILc/a/a/a/j2/d0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/j2/o$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/j2/o$a;->c:Lc/a/a/a/e2/w$a;

    invoke-virtual {p1}, Lc/a/a/a/e2/w$a;->d()V

    :cond_0
    return-void
.end method

.method public k(ILc/a/a/a/j2/d0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/j2/o$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/j2/o$a;->c:Lc/a/a/a/e2/w$a;

    invoke-virtual {p1}, Lc/a/a/a/e2/w$a;->c()V

    :cond_0
    return-void
.end method

.method public s(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/z;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/j2/o$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/j2/o$a;->b:Lc/a/a/a/j2/e0$a;

    invoke-direct {p0, p3}, Lc/a/a/a/j2/o$a;->b(Lc/a/a/a/j2/z;)Lc/a/a/a/j2/z;

    move-result-object p2

    invoke-virtual {p1, p2}, Lc/a/a/a/j2/e0$a;->d(Lc/a/a/a/j2/z;)V

    :cond_0
    return-void
.end method

.method public t(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/j2/o$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/j2/o$a;->b:Lc/a/a/a/j2/e0$a;

    .line 3
    invoke-direct {p0, p4}, Lc/a/a/a/j2/o$a;->b(Lc/a/a/a/j2/z;)Lc/a/a/a/j2/z;

    move-result-object p2

    .line 4
    invoke-virtual {p1, p3, p2}, Lc/a/a/a/j2/e0$a;->s(Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    :cond_0
    return-void
.end method

.method public v(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/z;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/j2/o$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/j2/o$a;->b:Lc/a/a/a/j2/e0$a;

    invoke-direct {p0, p3}, Lc/a/a/a/j2/o$a;->b(Lc/a/a/a/j2/z;)Lc/a/a/a/j2/z;

    move-result-object p2

    invoke-virtual {p1, p2}, Lc/a/a/a/j2/e0$a;->E(Lc/a/a/a/j2/z;)V

    :cond_0
    return-void
.end method

.method public y(ILc/a/a/a/j2/d0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/j2/o$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/j2/o$a;->c:Lc/a/a/a/e2/w$a;

    invoke-virtual {p1}, Lc/a/a/a/e2/w$a;->e()V

    :cond_0
    return-void
.end method
