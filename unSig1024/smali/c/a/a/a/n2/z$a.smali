.class public final Lc/a/a/a/n2/z$a;
.super Ljava/lang/Object;
.source "VideoRendererEventListener.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/n2/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/os/Handler;

.field private final b:Lc/a/a/a/n2/z;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lc/a/a/a/n2/z;)V
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
    iput-object p1, p0, Lc/a/a/a/n2/z$a;->a:Landroid/os/Handler;

    .line 3
    iput-object p2, p0, Lc/a/a/a/n2/z$a;->b:Lc/a/a/a/n2/z;

    return-void
.end method

.method private synthetic g(Ljava/lang/String;JJ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lc/a/a/a/n2/z$a;->b:Lc/a/a/a/n2/z;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lc/a/a/a/n2/z;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    .line 2
    invoke-interface/range {v1 .. v6}, Lc/a/a/a/n2/z;->p(Ljava/lang/String;JJ)V

    return-void
.end method

.method private synthetic i(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/n2/z$a;->b:Lc/a/a/a/n2/z;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/n2/z;

    invoke-interface {v0, p1}, Lc/a/a/a/n2/z;->m(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic k(Lc/a/a/a/c2/d;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/c2/d;->c()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/n2/z$a;->b:Lc/a/a/a/n2/z;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/n2/z;

    invoke-interface {v0, p1}, Lc/a/a/a/n2/z;->M(Lc/a/a/a/c2/d;)V

    return-void
.end method

.method private synthetic m(IJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/n2/z$a;->b:Lc/a/a/a/n2/z;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/n2/z;

    invoke-interface {v0, p1, p2, p3}, Lc/a/a/a/n2/z;->U(IJ)V

    return-void
.end method

.method private synthetic o(Lc/a/a/a/c2/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/n2/z$a;->b:Lc/a/a/a/n2/z;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/n2/z;

    invoke-interface {v0, p1}, Lc/a/a/a/n2/z;->z(Lc/a/a/a/c2/d;)V

    return-void
.end method

.method private synthetic q(Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/n2/z$a;->b:Lc/a/a/a/n2/z;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/n2/z;

    invoke-interface {v0, p1, p2}, Lc/a/a/a/n2/z;->A(Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V

    return-void
.end method

.method private synthetic s(Landroid/view/Surface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/n2/z$a;->b:Lc/a/a/a/n2/z;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/n2/z;

    invoke-interface {v0, p1}, Lc/a/a/a/n2/z;->J(Landroid/view/Surface;)V

    return-void
.end method

.method private synthetic u(JI)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/n2/z$a;->b:Lc/a/a/a/n2/z;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/n2/z;

    .line 2
    invoke-interface {v0, p1, p2, p3}, Lc/a/a/a/n2/z;->X(JI)V

    return-void
.end method

.method private synthetic w(IIIF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/n2/z$a;->b:Lc/a/a/a/n2/z;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/n2/z;

    .line 2
    invoke-interface {v0, p1, p2, p3, p4}, Lc/a/a/a/n2/z;->b(IIIF)V

    return-void
.end method


# virtual methods
.method public A(IIIF)V
    .locals 8

    .line 1
    iget-object v0, p0, Lc/a/a/a/n2/z$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 2
    new-instance v7, Lc/a/a/a/n2/h;

    move-object v1, v7

    move-object v2, p0

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    invoke-direct/range {v1 .. v6}, Lc/a/a/a/n2/h;-><init>(Lc/a/a/a/n2/z$a;IIIF)V

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;JJ)V
    .locals 9

    .line 1
    iget-object v0, p0, Lc/a/a/a/n2/z$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 2
    new-instance v8, Lc/a/a/a/n2/f;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lc/a/a/a/n2/f;-><init>(Lc/a/a/a/n2/z$a;Ljava/lang/String;JJ)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/n2/z$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lc/a/a/a/n2/b;

    invoke-direct {v1, p0, p1}, Lc/a/a/a/n2/b;-><init>(Lc/a/a/a/n2/z$a;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public c(Lc/a/a/a/c2/d;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/c2/d;->c()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/n2/z$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 3
    new-instance v1, Lc/a/a/a/n2/a;

    invoke-direct {v1, p0, p1}, Lc/a/a/a/n2/a;-><init>(Lc/a/a/a/n2/z$a;Lc/a/a/a/c2/d;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public d(IJ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/n2/z$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lc/a/a/a/n2/e;

    invoke-direct {v1, p0, p1, p2, p3}, Lc/a/a/a/n2/e;-><init>(Lc/a/a/a/n2/z$a;IJ)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public e(Lc/a/a/a/c2/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/n2/z$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lc/a/a/a/n2/c;

    invoke-direct {v1, p0, p1}, Lc/a/a/a/n2/c;-><init>(Lc/a/a/a/n2/z$a;Lc/a/a/a/c2/d;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public f(Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/n2/z$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lc/a/a/a/n2/g;

    invoke-direct {v1, p0, p1, p2}, Lc/a/a/a/n2/g;-><init>(Lc/a/a/a/n2/z$a;Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public synthetic h(Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lc/a/a/a/n2/z$a;->g(Ljava/lang/String;JJ)V

    return-void
.end method

.method public synthetic j(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/a/a/a/n2/z$a;->i(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic l(Lc/a/a/a/c2/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/a/a/a/n2/z$a;->k(Lc/a/a/a/c2/d;)V

    return-void
.end method

.method public synthetic n(IJ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lc/a/a/a/n2/z$a;->m(IJ)V

    return-void
.end method

.method public synthetic p(Lc/a/a/a/c2/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/a/a/a/n2/z$a;->o(Lc/a/a/a/c2/d;)V

    return-void
.end method

.method public synthetic r(Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lc/a/a/a/n2/z$a;->q(Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V

    return-void
.end method

.method public synthetic t(Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/a/a/a/n2/z$a;->s(Landroid/view/Surface;)V

    return-void
.end method

.method public synthetic v(JI)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lc/a/a/a/n2/z$a;->u(JI)V

    return-void
.end method

.method public synthetic x(IIIF)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lc/a/a/a/n2/z$a;->w(IIIF)V

    return-void
.end method

.method public y(Landroid/view/Surface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/n2/z$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lc/a/a/a/n2/d;

    invoke-direct {v1, p0, p1}, Lc/a/a/a/n2/d;-><init>(Lc/a/a/a/n2/z$a;Landroid/view/Surface;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public z(JI)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/n2/z$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lc/a/a/a/n2/i;

    invoke-direct {v1, p0, p1, p2, p3}, Lc/a/a/a/n2/i;-><init>(Lc/a/a/a/n2/z$a;JI)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
