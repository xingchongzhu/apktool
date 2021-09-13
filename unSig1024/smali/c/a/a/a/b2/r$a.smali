.class public final Lc/a/a/a/b2/r$a;
.super Ljava/lang/Object;
.source "AudioRendererEventListener.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/b2/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/os/Handler;

.field private final b:Lc/a/a/a/b2/r;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lc/a/a/a/b2/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    .line 2
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lc/a/a/a/b2/r$a;->a:Landroid/os/Handler;

    .line 3
    iput-object p2, p0, Lc/a/a/a/b2/r$a;->b:Lc/a/a/a/b2/r;

    return-void
.end method

.method private synthetic g(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/r$a;->b:Lc/a/a/a/b2/r;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/b2/r;

    invoke-interface {v0, p1}, Lc/a/a/a/b2/r;->d(Ljava/lang/Exception;)V

    return-void
.end method

.method private synthetic i(Ljava/lang/String;JJ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/r$a;->b:Lc/a/a/a/b2/r;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lc/a/a/a/b2/r;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    .line 2
    invoke-interface/range {v1 .. v6}, Lc/a/a/a/b2/r;->O(Ljava/lang/String;JJ)V

    return-void
.end method

.method private synthetic k(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/r$a;->b:Lc/a/a/a/b2/r;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/b2/r;

    invoke-interface {v0, p1}, Lc/a/a/a/b2/r;->N(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic m(Lc/a/a/a/c2/d;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/c2/d;->c()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/b2/r$a;->b:Lc/a/a/a/b2/r;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/b2/r;

    invoke-interface {v0, p1}, Lc/a/a/a/b2/r;->l(Lc/a/a/a/c2/d;)V

    return-void
.end method

.method private synthetic o(Lc/a/a/a/c2/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/r$a;->b:Lc/a/a/a/b2/r;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/b2/r;

    invoke-interface {v0, p1}, Lc/a/a/a/b2/r;->n(Lc/a/a/a/c2/d;)V

    return-void
.end method

.method private synthetic q(Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/r$a;->b:Lc/a/a/a/b2/r;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/b2/r;

    invoke-interface {v0, p1, p2}, Lc/a/a/a/b2/r;->h(Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V

    return-void
.end method

.method private synthetic s(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/r$a;->b:Lc/a/a/a/b2/r;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/b2/r;

    invoke-interface {v0, p1, p2}, Lc/a/a/a/b2/r;->B(J)V

    return-void
.end method

.method private synthetic u(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/r$a;->b:Lc/a/a/a/b2/r;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/b2/r;

    invoke-interface {v0, p1}, Lc/a/a/a/b2/r;->a(Z)V

    return-void
.end method

.method private synthetic w(IJJ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/r$a;->b:Lc/a/a/a/b2/r;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lc/a/a/a/b2/r;

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    .line 2
    invoke-interface/range {v1 .. v6}, Lc/a/a/a/b2/r;->T(IJJ)V

    return-void
.end method


# virtual methods
.method public A(IJJ)V
    .locals 9

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/r$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 2
    new-instance v8, Lc/a/a/a/b2/h;

    move-object v1, v8

    move-object v2, p0

    move v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lc/a/a/a/b2/h;-><init>(Lc/a/a/a/b2/r$a;IJJ)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/r$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lc/a/a/a/b2/c;

    invoke-direct {v1, p0, p1}, Lc/a/a/a/b2/c;-><init>(Lc/a/a/a/b2/r$a;Ljava/lang/Exception;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;JJ)V
    .locals 9

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/r$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 2
    new-instance v8, Lc/a/a/a/b2/e;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lc/a/a/a/b2/e;-><init>(Lc/a/a/a/b2/r$a;Ljava/lang/String;JJ)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/r$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lc/a/a/a/b2/f;

    invoke-direct {v1, p0, p1}, Lc/a/a/a/b2/f;-><init>(Lc/a/a/a/b2/r$a;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public d(Lc/a/a/a/c2/d;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/c2/d;->c()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/b2/r$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 3
    new-instance v1, Lc/a/a/a/b2/b;

    invoke-direct {v1, p0, p1}, Lc/a/a/a/b2/b;-><init>(Lc/a/a/a/b2/r$a;Lc/a/a/a/c2/d;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public e(Lc/a/a/a/c2/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/r$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lc/a/a/a/b2/i;

    invoke-direct {v1, p0, p1}, Lc/a/a/a/b2/i;-><init>(Lc/a/a/a/b2/r$a;Lc/a/a/a/c2/d;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public f(Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/r$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lc/a/a/a/b2/d;

    invoke-direct {v1, p0, p1, p2}, Lc/a/a/a/b2/d;-><init>(Lc/a/a/a/b2/r$a;Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public synthetic h(Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/a/a/a/b2/r$a;->g(Ljava/lang/Exception;)V

    return-void
.end method

.method public synthetic j(Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lc/a/a/a/b2/r$a;->i(Ljava/lang/String;JJ)V

    return-void
.end method

.method public synthetic l(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/a/a/a/b2/r$a;->k(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic n(Lc/a/a/a/c2/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/a/a/a/b2/r$a;->m(Lc/a/a/a/c2/d;)V

    return-void
.end method

.method public synthetic p(Lc/a/a/a/c2/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/a/a/a/b2/r$a;->o(Lc/a/a/a/c2/d;)V

    return-void
.end method

.method public synthetic r(Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lc/a/a/a/b2/r$a;->q(Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V

    return-void
.end method

.method public synthetic t(J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lc/a/a/a/b2/r$a;->s(J)V

    return-void
.end method

.method public synthetic v(Z)V
    .locals 0

    invoke-direct {p0, p1}, Lc/a/a/a/b2/r$a;->u(Z)V

    return-void
.end method

.method public synthetic x(IJJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lc/a/a/a/b2/r$a;->w(IJJ)V

    return-void
.end method

.method public y(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/r$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lc/a/a/a/b2/g;

    invoke-direct {v1, p0, p1, p2}, Lc/a/a/a/b2/g;-><init>(Lc/a/a/a/b2/r$a;J)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public z(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/b2/r$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lc/a/a/a/b2/a;

    invoke-direct {v1, p0, p1}, Lc/a/a/a/b2/a;-><init>(Lc/a/a/a/b2/r$a;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
