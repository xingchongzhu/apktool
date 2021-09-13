.class final Lc/a/a/a/v1$c;
.super Ljava/lang/Object;
.source "SimpleExoPlayer.java"

# interfaces
.implements Lc/a/a/a/n2/z;
.implements Lc/a/a/a/b2/r;
.implements Lc/a/a/a/k2/l;
.implements Lc/a/a/a/h2/f;
.implements Landroid/view/SurfaceHolder$Callback;
.implements Landroid/view/TextureView$SurfaceTextureListener;
.implements Lc/a/a/a/f0$b;
.implements Lc/a/a/a/e0$b;
.implements Lc/a/a/a/w1$b;
.implements Lc/a/a/a/l1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/v1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lc/a/a/a/v1;


# direct methods
.method private constructor <init>(Lc/a/a/a/v1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lc/a/a/a/v1;Lc/a/a/a/v1$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lc/a/a/a/v1$c;-><init>(Lc/a/a/a/v1;)V

    return-void
.end method


# virtual methods
.method public A(Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0, p1}, Lc/a/a/a/v1;->e0(Lc/a/a/a/v1;Lc/a/a/a/u0;)Lc/a/a/a/u0;

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->d0(Lc/a/a/a/v1;)Lc/a/a/a/a2/c1;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lc/a/a/a/a2/c1;->A(Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V

    return-void
.end method

.method public B(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->d0(Lc/a/a/a/v1;)Lc/a/a/a/a2/c1;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lc/a/a/a/a2/c1;->B(J)V

    return-void
.end method

.method public C()V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x3

    invoke-static {v0, v1, v2, v3}, Lc/a/a/a/v1;->t0(Lc/a/a/a/v1;ZII)V

    return-void
.end method

.method public synthetic D(Lc/a/a/a/x1;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc/a/a/a/k1;->s(Lc/a/a/a/l1$a;Lc/a/a/a/x1;I)V

    return-void
.end method

.method public E(F)V
    .locals 0

    .line 1
    iget-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {p1}, Lc/a/a/a/v1;->r0(Lc/a/a/a/v1;)V

    return-void
.end method

.method public G(I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {p1}, Lc/a/a/a/v1;->C0(Lc/a/a/a/v1;)V

    return-void
.end method

.method public H(ZI)V
    .locals 0

    .line 1
    iget-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {p1}, Lc/a/a/a/v1;->C0(Lc/a/a/a/v1;)V

    return-void
.end method

.method public J(Landroid/view/Surface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->d0(Lc/a/a/a/v1;)Lc/a/a/a/a2/c1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/a/a/a/a2/c1;->J(Landroid/view/Surface;)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->g0(Lc/a/a/a/v1;)Landroid/view/Surface;

    move-result-object v0

    if-ne v0, p1, :cond_0

    .line 3
    iget-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {p1}, Lc/a/a/a/v1;->f0(Lc/a/a/a/v1;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/n2/y;

    .line 4
    invoke-interface {v0}, Lc/a/a/a/n2/y;->d()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public synthetic L(Lc/a/a/a/j2/q0;Lc/a/a/a/l2/l;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc/a/a/a/k1;->u(Lc/a/a/a/l1$a;Lc/a/a/a/j2/q0;Lc/a/a/a/l2/l;)V

    return-void
.end method

.method public M(Lc/a/a/a/c2/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->d0(Lc/a/a/a/v1;)Lc/a/a/a/a2/c1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/a/a/a/a2/c1;->M(Lc/a/a/a/c2/d;)V

    .line 2
    iget-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lc/a/a/a/v1;->e0(Lc/a/a/a/v1;Lc/a/a/a/u0;)Lc/a/a/a/u0;

    .line 3
    iget-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {p1, v0}, Lc/a/a/a/v1;->c0(Lc/a/a/a/v1;Lc/a/a/a/c2/d;)Lc/a/a/a/c2/d;

    return-void
.end method

.method public N(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->d0(Lc/a/a/a/v1;)Lc/a/a/a/a2/c1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/a/a/a/a2/c1;->N(Ljava/lang/String;)V

    return-void
.end method

.method public O(Ljava/lang/String;JJ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->d0(Lc/a/a/a/v1;)Lc/a/a/a/a2/c1;

    move-result-object v1

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Lc/a/a/a/a2/c1;->O(Ljava/lang/String;JJ)V

    return-void
.end method

.method public synthetic P(Z)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->q(Lc/a/a/a/l1$a;Z)V

    return-void
.end method

.method public synthetic R(Lc/a/a/a/l1;Lc/a/a/a/l1$b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc/a/a/a/k1;->a(Lc/a/a/a/l1$a;Lc/a/a/a/l1;Lc/a/a/a/l1$b;)V

    return-void
.end method

.method public synthetic S(Z)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->b(Lc/a/a/a/l1$a;Z)V

    return-void
.end method

.method public T(IJJ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->d0(Lc/a/a/a/v1;)Lc/a/a/a/a2/c1;

    move-result-object v1

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Lc/a/a/a/a2/c1;->T(IJJ)V

    return-void
.end method

.method public U(IJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->d0(Lc/a/a/a/v1;)Lc/a/a/a/a2/c1;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lc/a/a/a/a2/c1;->U(IJ)V

    return-void
.end method

.method public W(Z)V
    .locals 0

    .line 1
    iget-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {p1}, Lc/a/a/a/v1;->C0(Lc/a/a/a/v1;)V

    return-void
.end method

.method public X(JI)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->d0(Lc/a/a/a/v1;)Lc/a/a/a/a2/c1;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lc/a/a/a/a2/c1;->X(JI)V

    return-void
.end method

.method public synthetic Z(Z)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->e(Lc/a/a/a/l1$a;Z)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->j0(Lc/a/a/a/v1;)Z

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0, p1}, Lc/a/a/a/v1;->k0(Lc/a/a/a/v1;Z)Z

    .line 3
    iget-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {p1}, Lc/a/a/a/v1;->l0(Lc/a/a/a/v1;)V

    return-void
.end method

.method public b(IIIF)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->d0(Lc/a/a/a/v1;)Lc/a/a/a/a2/c1;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lc/a/a/a/a2/c1;->b(IIIF)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->f0(Lc/a/a/a/v1;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/n2/y;

    .line 3
    invoke-interface {v1, p1, p2, p3, p4}, Lc/a/a/a/n2/y;->b(IIIF)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public synthetic c(I)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->o(Lc/a/a/a/l1$a;I)V

    return-void
.end method

.method public d(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->d0(Lc/a/a/a/v1;)Lc/a/a/a/a2/c1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/a/a/a/a2/c1;->d(Ljava/lang/Exception;)V

    return-void
.end method

.method public synthetic e(Lc/a/a/a/i1;)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->i(Lc/a/a/a/l1$a;Lc/a/a/a/i1;)V

    return-void
.end method

.method public synthetic f(I)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->k(Lc/a/a/a/l1$a;I)V

    return-void
.end method

.method public synthetic g(ZI)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc/a/a/a/k1;->m(Lc/a/a/a/l1$a;ZI)V

    return-void
.end method

.method public h(Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0, p1}, Lc/a/a/a/v1;->i0(Lc/a/a/a/v1;Lc/a/a/a/u0;)Lc/a/a/a/u0;

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->d0(Lc/a/a/a/v1;)Lc/a/a/a/a2/c1;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lc/a/a/a/a2/c1;->h(Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V

    return-void
.end method

.method public synthetic i(Z)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->f(Lc/a/a/a/l1$a;Z)V

    return-void
.end method

.method public synthetic j(I)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->n(Lc/a/a/a/l1$a;I)V

    return-void
.end method

.method public k(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-virtual {v0}, Lc/a/a/a/v1;->n()Z

    move-result v0

    .line 2
    iget-object v1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    .line 3
    invoke-static {v0, p1}, Lc/a/a/a/v1;->s0(ZI)I

    move-result v2

    .line 4
    invoke-static {v1, v0, p1, v2}, Lc/a/a/a/v1;->t0(Lc/a/a/a/v1;ZII)V

    return-void
.end method

.method public l(Lc/a/a/a/c2/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->d0(Lc/a/a/a/v1;)Lc/a/a/a/a2/c1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/a/a/a/a2/c1;->l(Lc/a/a/a/c2/d;)V

    .line 2
    iget-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lc/a/a/a/v1;->i0(Lc/a/a/a/v1;Lc/a/a/a/u0;)Lc/a/a/a/u0;

    .line 3
    iget-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {p1, v0}, Lc/a/a/a/v1;->h0(Lc/a/a/a/v1;Lc/a/a/a/c2/d;)Lc/a/a/a/c2/d;

    return-void
.end method

.method public m(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->d0(Lc/a/a/a/v1;)Lc/a/a/a/a2/c1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/a/a/a/a2/c1;->m(Ljava/lang/String;)V

    return-void
.end method

.method public n(Lc/a/a/a/c2/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0, p1}, Lc/a/a/a/v1;->h0(Lc/a/a/a/v1;Lc/a/a/a/c2/d;)Lc/a/a/a/c2/d;

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->d0(Lc/a/a/a/v1;)Lc/a/a/a/a2/c1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/a/a/a/a2/c1;->n(Lc/a/a/a/c2/d;)V

    return-void
.end method

.method public synthetic o(Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->r(Lc/a/a/a/l1$a;Ljava/util/List;)V

    return-void
.end method

.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    new-instance v1, Landroid/view/Surface;

    invoke-direct {v1, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    const/4 p1, 0x1

    invoke-static {v0, v1, p1}, Lc/a/a/a/v1;->p0(Lc/a/a/a/v1;Landroid/view/Surface;Z)V

    .line 2
    iget-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {p1, p2, p3}, Lc/a/a/a/v1;->q0(Lc/a/a/a/v1;II)V

    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 2

    .line 1
    iget-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lc/a/a/a/v1;->p0(Lc/a/a/a/v1;Landroid/view/Surface;Z)V

    .line 2
    iget-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0}, Lc/a/a/a/v1;->q0(Lc/a/a/a/v1;II)V

    return v1
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    .line 1
    iget-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {p1, p2, p3}, Lc/a/a/a/v1;->q0(Lc/a/a/a/v1;II)V

    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    return-void
.end method

.method public p(Ljava/lang/String;JJ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->d0(Lc/a/a/a/v1;)Lc/a/a/a/a2/c1;

    move-result-object v1

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Lc/a/a/a/a2/c1;->p(Ljava/lang/String;JJ)V

    return-void
.end method

.method public synthetic q(Lc/a/a/a/x1;Ljava/lang/Object;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lc/a/a/a/k1;->t(Lc/a/a/a/l1$a;Lc/a/a/a/x1;Ljava/lang/Object;I)V

    return-void
.end method

.method public synthetic r(Lc/a/a/a/p0;)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->l(Lc/a/a/a/l1$a;Lc/a/a/a/p0;)V

    return-void
.end method

.method public s(IZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->y0(Lc/a/a/a/v1;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/d2/b;

    .line 2
    invoke-interface {v1, p1, p2}, Lc/a/a/a/d2/b;->b(IZ)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    .line 1
    iget-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {p1, p3, p4}, Lc/a/a/a/v1;->q0(Lc/a/a/a/v1;II)V

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p1

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lc/a/a/a/v1;->p0(Lc/a/a/a/v1;Landroid/view/Surface;Z)V

    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lc/a/a/a/v1;->p0(Lc/a/a/a/v1;Landroid/view/Surface;Z)V

    .line 2
    iget-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {p1, v1, v1}, Lc/a/a/a/v1;->q0(Lc/a/a/a/v1;II)V

    return-void
.end method

.method public t(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/a/a/a/k2/c;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0, p1}, Lc/a/a/a/v1;->m0(Lc/a/a/a/v1;Ljava/util/List;)Ljava/util/List;

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->n0(Lc/a/a/a/v1;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/k2/l;

    .line 3
    invoke-interface {v1, p1}, Lc/a/a/a/k2/l;->t(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public u(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->z0(Lc/a/a/a/v1;)Lc/a/a/a/m2/c0;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 2
    iget-object v1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v1}, Lc/a/a/a/v1;->A0(Lc/a/a/a/v1;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    iget-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {p1}, Lc/a/a/a/v1;->z0(Lc/a/a/a/v1;)Lc/a/a/a/m2/c0;

    move-result-object p1

    invoke-virtual {p1, v0}, Lc/a/a/a/m2/c0;->a(I)V

    .line 4
    iget-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lc/a/a/a/v1;->B0(Lc/a/a/a/v1;Z)Z

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 5
    iget-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {p1}, Lc/a/a/a/v1;->A0(Lc/a/a/a/v1;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {p1}, Lc/a/a/a/v1;->z0(Lc/a/a/a/v1;)Lc/a/a/a/m2/c0;

    move-result-object p1

    invoke-virtual {p1, v0}, Lc/a/a/a/m2/c0;->b(I)V

    .line 7
    iget-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {p1, v0}, Lc/a/a/a/v1;->B0(Lc/a/a/a/v1;Z)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public v(I)V
    .locals 2

    .line 1
    iget-object p1, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {p1}, Lc/a/a/a/v1;->u0(Lc/a/a/a/v1;)Lc/a/a/a/w1;

    move-result-object p1

    invoke-static {p1}, Lc/a/a/a/v1;->v0(Lc/a/a/a/w1;)Lc/a/a/a/d2/a;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->w0(Lc/a/a/a/v1;)Lc/a/a/a/d2/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lc/a/a/a/d2/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0, p1}, Lc/a/a/a/v1;->x0(Lc/a/a/a/v1;Lc/a/a/a/d2/a;)Lc/a/a/a/d2/a;

    .line 4
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->y0(Lc/a/a/a/v1;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/d2/b;

    .line 5
    invoke-interface {v1, p1}, Lc/a/a/a/d2/b;->a(Lc/a/a/a/d2/a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public synthetic w()V
    .locals 0

    invoke-static {p0}, Lc/a/a/a/k1;->p(Lc/a/a/a/l1$a;)V

    return-void
.end method

.method public synthetic x(Lc/a/a/a/z0;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc/a/a/a/k1;->g(Lc/a/a/a/l1$a;Lc/a/a/a/z0;I)V

    return-void
.end method

.method public y(Lc/a/a/a/h2/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->d0(Lc/a/a/a/v1;)Lc/a/a/a/a2/c1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/a/a/a/a2/c1;->k1(Lc/a/a/a/h2/a;)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->o0(Lc/a/a/a/v1;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/h2/f;

    .line 3
    invoke-interface {v1, p1}, Lc/a/a/a/h2/f;->y(Lc/a/a/a/h2/a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public z(Lc/a/a/a/c2/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0, p1}, Lc/a/a/a/v1;->c0(Lc/a/a/a/v1;Lc/a/a/a/c2/d;)Lc/a/a/a/c2/d;

    .line 2
    iget-object v0, p0, Lc/a/a/a/v1$c;->a:Lc/a/a/a/v1;

    invoke-static {v0}, Lc/a/a/a/v1;->d0(Lc/a/a/a/v1;)Lc/a/a/a/a2/c1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/a/a/a/a2/c1;->z(Lc/a/a/a/c2/d;)V

    return-void
.end method
