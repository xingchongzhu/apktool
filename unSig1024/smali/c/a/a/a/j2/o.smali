.class public abstract Lc/a/a/a/j2/o;
.super Lc/a/a/a/j2/k;
.source "CompositeMediaSource.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/j2/o$a;,
        Lc/a/a/a/j2/o$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lc/a/a/a/j2/k;"
    }
.end annotation


# instance fields
.field private final g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "TT;",
            "Lc/a/a/a/j2/o$b;",
            ">;"
        }
    .end annotation
.end field

.field private h:Landroid/os/Handler;

.field private i:Lcom/google/android/exoplayer2/upstream/e0;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a/a/a/j2/k;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lc/a/a/a/j2/o;->g:Ljava/util/HashMap;

    return-void
.end method

.method private synthetic C(Ljava/lang/Object;Lc/a/a/a/j2/d0;Lc/a/a/a/x1;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lc/a/a/a/j2/o;->E(Ljava/lang/Object;Lc/a/a/a/j2/d0;Lc/a/a/a/x1;)V

    return-void
.end method


# virtual methods
.method protected A(Ljava/lang/Object;J)J
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;J)J"
        }
    .end annotation

    return-wide p2
.end method

.method protected B(Ljava/lang/Object;I)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)I"
        }
    .end annotation

    return p2
.end method

.method public synthetic D(Ljava/lang/Object;Lc/a/a/a/j2/d0;Lc/a/a/a/x1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lc/a/a/a/j2/o;->C(Ljava/lang/Object;Lc/a/a/a/j2/d0;Lc/a/a/a/x1;)V

    return-void
.end method

.method protected abstract E(Ljava/lang/Object;Lc/a/a/a/j2/d0;Lc/a/a/a/x1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lc/a/a/a/j2/d0;",
            "Lc/a/a/a/x1;",
            ")V"
        }
    .end annotation
.end method

.method protected final F(Ljava/lang/Object;Lc/a/a/a/j2/d0;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lc/a/a/a/j2/d0;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/o;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lc/a/a/a/m2/f;->a(Z)V

    .line 2
    new-instance v0, Lc/a/a/a/j2/a;

    invoke-direct {v0, p0, p1}, Lc/a/a/a/j2/a;-><init>(Lc/a/a/a/j2/o;Ljava/lang/Object;)V

    .line 3
    new-instance v1, Lc/a/a/a/j2/o$a;

    invoke-direct {v1, p0, p1}, Lc/a/a/a/j2/o$a;-><init>(Lc/a/a/a/j2/o;Ljava/lang/Object;)V

    .line 4
    iget-object v2, p0, Lc/a/a/a/j2/o;->g:Ljava/util/HashMap;

    new-instance v3, Lc/a/a/a/j2/o$b;

    invoke-direct {v3, p2, v0, v1}, Lc/a/a/a/j2/o$b;-><init>(Lc/a/a/a/j2/d0;Lc/a/a/a/j2/d0$b;Lc/a/a/a/j2/e0;)V

    invoke-virtual {v2, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object p1, p0, Lc/a/a/a/j2/o;->h:Landroid/os/Handler;

    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    invoke-interface {p2, p1, v1}, Lc/a/a/a/j2/d0;->l(Landroid/os/Handler;Lc/a/a/a/j2/e0;)V

    .line 6
    iget-object p1, p0, Lc/a/a/a/j2/o;->h:Landroid/os/Handler;

    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    invoke-interface {p2, p1, v1}, Lc/a/a/a/j2/d0;->b(Landroid/os/Handler;Lc/a/a/a/e2/w;)V

    .line 7
    iget-object p1, p0, Lc/a/a/a/j2/o;->i:Lcom/google/android/exoplayer2/upstream/e0;

    invoke-interface {p2, v0, p1}, Lc/a/a/a/j2/d0;->h(Lc/a/a/a/j2/d0$b;Lcom/google/android/exoplayer2/upstream/e0;)V

    .line 8
    invoke-virtual {p0}, Lc/a/a/a/j2/k;->v()Z

    move-result p1

    if-nez p1, :cond_0

    .line 9
    invoke-interface {p2, v0}, Lc/a/a/a/j2/d0;->n(Lc/a/a/a/j2/d0$b;)V

    :cond_0
    return-void
.end method

.method protected t()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/o;->g:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/j2/o$b;

    .line 2
    iget-object v2, v1, Lc/a/a/a/j2/o$b;->a:Lc/a/a/a/j2/d0;

    iget-object v1, v1, Lc/a/a/a/j2/o$b;->b:Lc/a/a/a/j2/d0$b;

    invoke-interface {v2, v1}, Lc/a/a/a/j2/d0;->n(Lc/a/a/a/j2/d0$b;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected u()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/o;->g:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/j2/o$b;

    .line 2
    iget-object v2, v1, Lc/a/a/a/j2/o$b;->a:Lc/a/a/a/j2/d0;

    iget-object v1, v1, Lc/a/a/a/j2/o$b;->b:Lc/a/a/a/j2/d0$b;

    invoke-interface {v2, v1}, Lc/a/a/a/j2/d0;->i(Lc/a/a/a/j2/d0$b;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected w(Lcom/google/android/exoplayer2/upstream/e0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/j2/o;->i:Lcom/google/android/exoplayer2/upstream/e0;

    .line 2
    invoke-static {}, Lc/a/a/a/m2/m0;->v()Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/j2/o;->h:Landroid/os/Handler;

    return-void
.end method

.method protected y()V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/o;->g:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/j2/o$b;

    .line 2
    iget-object v2, v1, Lc/a/a/a/j2/o$b;->a:Lc/a/a/a/j2/d0;

    iget-object v3, v1, Lc/a/a/a/j2/o$b;->b:Lc/a/a/a/j2/d0$b;

    invoke-interface {v2, v3}, Lc/a/a/a/j2/d0;->j(Lc/a/a/a/j2/d0$b;)V

    .line 3
    iget-object v2, v1, Lc/a/a/a/j2/o$b;->a:Lc/a/a/a/j2/d0;

    iget-object v1, v1, Lc/a/a/a/j2/o$b;->c:Lc/a/a/a/j2/e0;

    invoke-interface {v2, v1}, Lc/a/a/a/j2/d0;->m(Lc/a/a/a/j2/e0;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lc/a/a/a/j2/o;->g:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method protected abstract z(Ljava/lang/Object;Lc/a/a/a/j2/d0$a;)Lc/a/a/a/j2/d0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lc/a/a/a/j2/d0$a;",
            ")",
            "Lc/a/a/a/j2/d0$a;"
        }
    .end annotation
.end method
