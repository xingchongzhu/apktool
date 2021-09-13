.class final Lc/a/a/a/f1$a;
.super Ljava/lang/Object;
.source "MediaSourceList.java"

# interfaces
.implements Lc/a/a/a/j2/e0;
.implements Lc/a/a/a/e2/w;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Lc/a/a/a/f1$c;

.field private b:Lc/a/a/a/j2/e0$a;

.field private c:Lc/a/a/a/e2/w$a;

.field final synthetic d:Lc/a/a/a/f1;


# direct methods
.method public constructor <init>(Lc/a/a/a/f1;Lc/a/a/a/f1$c;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lc/a/a/a/f1$a;->d:Lc/a/a/a/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Lc/a/a/a/f1;->a(Lc/a/a/a/f1;)Lc/a/a/a/j2/e0$a;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/f1$a;->b:Lc/a/a/a/j2/e0$a;

    .line 3
    invoke-static {p1}, Lc/a/a/a/f1;->b(Lc/a/a/a/f1;)Lc/a/a/a/e2/w$a;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/f1$a;->c:Lc/a/a/a/e2/w$a;

    .line 4
    iput-object p2, p0, Lc/a/a/a/f1$a;->a:Lc/a/a/a/f1$c;

    return-void
.end method

.method private a(ILc/a/a/a/j2/d0$a;)Z
    .locals 3

    if-eqz p2, :cond_0

    .line 1
    iget-object v0, p0, Lc/a/a/a/f1$a;->a:Lc/a/a/a/f1$c;

    invoke-static {v0, p2}, Lc/a/a/a/f1;->c(Lc/a/a/a/f1$c;Lc/a/a/a/j2/d0$a;)Lc/a/a/a/j2/d0$a;

    move-result-object p2

    if-nez p2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p2, 0x0

    .line 2
    :cond_1
    iget-object v0, p0, Lc/a/a/a/f1$a;->a:Lc/a/a/a/f1$c;

    invoke-static {v0, p1}, Lc/a/a/a/f1;->d(Lc/a/a/a/f1$c;I)I

    move-result p1

    .line 3
    iget-object v0, p0, Lc/a/a/a/f1$a;->b:Lc/a/a/a/j2/e0$a;

    iget v1, v0, Lc/a/a/a/j2/e0$a;->a:I

    if-ne v1, p1, :cond_2

    iget-object v0, v0, Lc/a/a/a/j2/e0$a;->b:Lc/a/a/a/j2/d0$a;

    .line 4
    invoke-static {v0, p2}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 5
    :cond_2
    iget-object v0, p0, Lc/a/a/a/f1$a;->d:Lc/a/a/a/f1;

    .line 6
    invoke-static {v0}, Lc/a/a/a/f1;->a(Lc/a/a/a/f1;)Lc/a/a/a/j2/e0$a;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, p1, p2, v1, v2}, Lc/a/a/a/j2/e0$a;->F(ILc/a/a/a/j2/d0$a;J)Lc/a/a/a/j2/e0$a;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/f1$a;->b:Lc/a/a/a/j2/e0$a;

    .line 7
    :cond_3
    iget-object v0, p0, Lc/a/a/a/f1$a;->c:Lc/a/a/a/e2/w$a;

    iget v1, v0, Lc/a/a/a/e2/w$a;->a:I

    if-ne v1, p1, :cond_4

    iget-object v0, v0, Lc/a/a/a/e2/w$a;->b:Lc/a/a/a/j2/d0$a;

    .line 8
    invoke-static {v0, p2}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 9
    :cond_4
    iget-object v0, p0, Lc/a/a/a/f1$a;->d:Lc/a/a/a/f1;

    .line 10
    invoke-static {v0}, Lc/a/a/a/f1;->b(Lc/a/a/a/f1;)Lc/a/a/a/e2/w$a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lc/a/a/a/e2/w$a;->t(ILc/a/a/a/j2/d0$a;)Lc/a/a/a/e2/w$a;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/f1$a;->c:Lc/a/a/a/e2/w$a;

    :cond_5
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public C(ILc/a/a/a/j2/d0$a;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/f1$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/f1$a;->c:Lc/a/a/a/e2/w$a;

    invoke-virtual {p1, p3}, Lc/a/a/a/e2/w$a;->f(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public E(ILc/a/a/a/j2/d0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/f1$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/f1$a;->c:Lc/a/a/a/e2/w$a;

    invoke-virtual {p1}, Lc/a/a/a/e2/w$a;->b()V

    :cond_0
    return-void
.end method

.method public F(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/f1$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/f1$a;->b:Lc/a/a/a/j2/e0$a;

    invoke-virtual {p1, p3, p4}, Lc/a/a/a/j2/e0$a;->B(Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    :cond_0
    return-void
.end method

.method public I(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/f1$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/f1$a;->b:Lc/a/a/a/j2/e0$a;

    invoke-virtual {p1, p3, p4}, Lc/a/a/a/j2/e0$a;->v(Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    :cond_0
    return-void
.end method

.method public Q(ILc/a/a/a/j2/d0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/f1$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/f1$a;->c:Lc/a/a/a/e2/w$a;

    invoke-virtual {p1}, Lc/a/a/a/e2/w$a;->g()V

    :cond_0
    return-void
.end method

.method public V(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Ljava/io/IOException;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/f1$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/f1$a;->b:Lc/a/a/a/j2/e0$a;

    invoke-virtual {p1, p3, p4, p5, p6}, Lc/a/a/a/j2/e0$a;->y(Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Ljava/io/IOException;Z)V

    :cond_0
    return-void
.end method

.method public Y(ILc/a/a/a/j2/d0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/f1$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/f1$a;->c:Lc/a/a/a/e2/w$a;

    invoke-virtual {p1}, Lc/a/a/a/e2/w$a;->d()V

    :cond_0
    return-void
.end method

.method public k(ILc/a/a/a/j2/d0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/f1$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/f1$a;->c:Lc/a/a/a/e2/w$a;

    invoke-virtual {p1}, Lc/a/a/a/e2/w$a;->c()V

    :cond_0
    return-void
.end method

.method public s(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/z;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/f1$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/f1$a;->b:Lc/a/a/a/j2/e0$a;

    invoke-virtual {p1, p3}, Lc/a/a/a/j2/e0$a;->d(Lc/a/a/a/j2/z;)V

    :cond_0
    return-void
.end method

.method public t(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/f1$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/f1$a;->b:Lc/a/a/a/j2/e0$a;

    invoke-virtual {p1, p3, p4}, Lc/a/a/a/j2/e0$a;->s(Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    :cond_0
    return-void
.end method

.method public v(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/z;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/f1$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/f1$a;->b:Lc/a/a/a/j2/e0$a;

    invoke-virtual {p1, p3}, Lc/a/a/a/j2/e0$a;->E(Lc/a/a/a/j2/z;)V

    :cond_0
    return-void
.end method

.method public y(ILc/a/a/a/j2/d0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/f1$a;->a(ILc/a/a/a/j2/d0$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/f1$a;->c:Lc/a/a/a/e2/w$a;

    invoke-virtual {p1}, Lc/a/a/a/e2/w$a;->e()V

    :cond_0
    return-void
.end method
