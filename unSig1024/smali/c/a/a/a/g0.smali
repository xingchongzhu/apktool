.class public abstract Lc/a/a/a/g0;
.super Ljava/lang/Object;
.source "BasePlayer.java"

# interfaces
.implements Lc/a/a/a/l1;


# instance fields
.field protected final a:Lc/a/a/a/x1$c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lc/a/a/a/x1$c;

    invoke-direct {v0}, Lc/a/a/a/x1$c;-><init>()V

    iput-object v0, p0, Lc/a/a/a/g0;->a:Lc/a/a/a/x1$c;

    return-void
.end method

.method private a0()I
    .locals 2

    .line 1
    invoke-interface {p0}, Lc/a/a/a/l1;->K()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return v0
.end method


# virtual methods
.method public final B()I
    .locals 4

    .line 1
    invoke-interface {p0}, Lc/a/a/a/l1;->M()Lc/a/a/a/x1;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lc/a/a/a/x1;->q()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p0}, Lc/a/a/a/l1;->R()I

    move-result v1

    invoke-direct {p0}, Lc/a/a/a/g0;->a0()I

    move-result v2

    invoke-interface {p0}, Lc/a/a/a/l1;->O()Z

    move-result v3

    .line 4
    invoke-virtual {v0, v1, v2, v3}, Lc/a/a/a/x1;->e(IIZ)I

    move-result v0

    :goto_0
    return v0
.end method

.method public final Z()J
    .locals 3

    .line 1
    invoke-interface {p0}, Lc/a/a/a/l1;->M()Lc/a/a/a/x1;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lc/a/a/a/x1;->q()Z

    move-result v1

    if-eqz v1, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p0}, Lc/a/a/a/l1;->R()I

    move-result v1

    iget-object v2, p0, Lc/a/a/a/g0;->a:Lc/a/a/a/x1$c;

    invoke-virtual {v0, v1, v2}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    move-result-object v0

    invoke-virtual {v0}, Lc/a/a/a/x1$c;->d()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public final b0()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-interface {p0, v0}, Lc/a/a/a/l1;->f(Z)V

    return-void
.end method

.method public final hasNext()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/g0;->B()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final hasPrevious()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/g0;->l()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final l()I
    .locals 4

    .line 1
    invoke-interface {p0}, Lc/a/a/a/l1;->M()Lc/a/a/a/x1;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lc/a/a/a/x1;->q()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p0}, Lc/a/a/a/l1;->R()I

    move-result v1

    invoke-direct {p0}, Lc/a/a/a/g0;->a0()I

    move-result v2

    invoke-interface {p0}, Lc/a/a/a/l1;->O()Z

    move-result v3

    .line 4
    invoke-virtual {v0, v1, v2, v3}, Lc/a/a/a/x1;->l(IIZ)I

    move-result v0

    :goto_0
    return v0
.end method

.method public final t()Z
    .locals 2

    .line 1
    invoke-interface {p0}, Lc/a/a/a/l1;->q()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 2
    invoke-interface {p0}, Lc/a/a/a/l1;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {p0}, Lc/a/a/a/l1;->H()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final w()Z
    .locals 3

    .line 1
    invoke-interface {p0}, Lc/a/a/a/l1;->M()Lc/a/a/a/x1;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lc/a/a/a/x1;->q()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, Lc/a/a/a/l1;->R()I

    move-result v1

    iget-object v2, p0, Lc/a/a/a/g0;->a:Lc/a/a/a/x1$c;

    invoke-virtual {v0, v1, v2}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    move-result-object v0

    iget-boolean v0, v0, Lc/a/a/a/x1$c;->j:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
