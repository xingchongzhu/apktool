.class public final Lc/a/a/a/k2/v/f;
.super Ljava/lang/Object;
.source "WebvttCssStyle.java"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:I

.field private g:Z

.field private h:I

.field private i:Z

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:F

.field private p:I

.field private q:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 2
    iput-object v0, p0, Lc/a/a/a/k2/v/f;->a:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lc/a/a/a/k2/v/f;->b:Ljava/lang/String;

    .line 4
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v1

    iput-object v1, p0, Lc/a/a/a/k2/v/f;->c:Ljava/util/Set;

    .line 5
    iput-object v0, p0, Lc/a/a/a/k2/v/f;->d:Ljava/lang/String;

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lc/a/a/a/k2/v/f;->e:Ljava/lang/String;

    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lc/a/a/a/k2/v/f;->g:Z

    .line 8
    iput-boolean v0, p0, Lc/a/a/a/k2/v/f;->i:Z

    const/4 v1, -0x1

    .line 9
    iput v1, p0, Lc/a/a/a/k2/v/f;->j:I

    .line 10
    iput v1, p0, Lc/a/a/a/k2/v/f;->k:I

    .line 11
    iput v1, p0, Lc/a/a/a/k2/v/f;->l:I

    .line 12
    iput v1, p0, Lc/a/a/a/k2/v/f;->m:I

    .line 13
    iput v1, p0, Lc/a/a/a/k2/v/f;->n:I

    .line 14
    iput v1, p0, Lc/a/a/a/k2/v/f;->p:I

    .line 15
    iput-boolean v0, p0, Lc/a/a/a/k2/v/f;->q:Z

    return-void
.end method

.method private static z(ILjava/lang/String;Ljava/lang/String;I)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, -0x1

    if-ne p0, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    add-int v0, p0, p3

    :cond_1
    return v0

    :cond_2
    :goto_0
    return p0
.end method


# virtual methods
.method public a()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/k2/v/f;->i:Z

    if-eqz v0, :cond_0

    .line 2
    iget v0, p0, Lc/a/a/a/k2/v/f;->h:I

    return v0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Background color not defined."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/k2/v/f;->q:Z

    return v0
.end method

.method public c()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/k2/v/f;->g:Z

    if-eqz v0, :cond_0

    .line 2
    iget v0, p0, Lc/a/a/a/k2/v/f;->f:I

    return v0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Font color not defined"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/v/f;->e:Ljava/lang/String;

    return-object v0
.end method

.method public e()F
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/k2/v/f;->o:F

    return v0
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/k2/v/f;->n:I

    return v0
.end method

.method public g()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/k2/v/f;->p:I

    return v0
.end method

.method public h(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")I"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/v/f;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/a/a/a/k2/v/f;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/a/a/a/k2/v/f;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/a/a/a/k2/v/f;->d:Ljava/lang/String;

    .line 2
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    return p1

    .line 4
    :cond_0
    iget-object v0, p0, Lc/a/a/a/k2/v/f;->a:Ljava/lang/String;

    const/high16 v1, 0x40000000    # 2.0f

    const/4 v2, 0x0

    invoke-static {v2, v0, p1, v1}, Lc/a/a/a/k2/v/f;->z(ILjava/lang/String;Ljava/lang/String;I)I

    move-result p1

    .line 5
    iget-object v0, p0, Lc/a/a/a/k2/v/f;->b:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-static {p1, v0, p2, v1}, Lc/a/a/a/k2/v/f;->z(ILjava/lang/String;Ljava/lang/String;I)I

    move-result p1

    .line 6
    iget-object p2, p0, Lc/a/a/a/k2/v/f;->d:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {p1, p2, p4, v0}, Lc/a/a/a/k2/v/f;->z(ILjava/lang/String;Ljava/lang/String;I)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_2

    .line 7
    iget-object p2, p0, Lc/a/a/a/k2/v/f;->c:Ljava/util/Set;

    invoke-interface {p3, p2}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    iget-object p2, p0, Lc/a/a/a/k2/v/f;->c:Ljava/util/Set;

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result p2

    mul-int/lit8 p2, p2, 0x4

    add-int/2addr p1, p2

    return p1

    :cond_2
    :goto_0
    return v2
.end method

.method public i()I
    .locals 4

    .line 1
    iget v0, p0, Lc/a/a/a/k2/v/f;->l:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v2, p0, Lc/a/a/a/k2/v/f;->m:I

    if-ne v2, v1, :cond_0

    return v1

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v3, p0, Lc/a/a/a/k2/v/f;->m:I

    if-ne v3, v2, :cond_2

    const/4 v1, 0x2

    :cond_2
    or-int/2addr v0, v1

    return v0
.end method

.method public j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/k2/v/f;->i:Z

    return v0
.end method

.method public k()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/k2/v/f;->g:Z

    return v0
.end method

.method public l()Z
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/k2/v/f;->j:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public m()Z
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/k2/v/f;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public n(I)Lc/a/a/a/k2/v/f;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/v/f;->h:I

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lc/a/a/a/k2/v/f;->i:Z

    return-object p0
.end method

.method public o(Z)Lc/a/a/a/k2/v/f;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/v/f;->l:I

    return-object p0
.end method

.method public p(Z)Lc/a/a/a/k2/v/f;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lc/a/a/a/k2/v/f;->q:Z

    return-object p0
.end method

.method public q(I)Lc/a/a/a/k2/v/f;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/v/f;->f:I

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lc/a/a/a/k2/v/f;->g:Z

    return-object p0
.end method

.method public r(Ljava/lang/String;)Lc/a/a/a/k2/v/f;
    .locals 0

    .line 1
    invoke-static {p1}, Lc/a/a/a/m2/m0;->J0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/k2/v/f;->e:Ljava/lang/String;

    return-object p0
.end method

.method public s(Z)Lc/a/a/a/k2/v/f;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/v/f;->m:I

    return-object p0
.end method

.method public t(I)Lc/a/a/a/k2/v/f;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/v/f;->p:I

    return-object p0
.end method

.method public u([Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashSet;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lc/a/a/a/k2/v/f;->c:Ljava/util/Set;

    return-void
.end method

.method public v(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/k2/v/f;->a:Ljava/lang/String;

    return-void
.end method

.method public w(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/k2/v/f;->b:Ljava/lang/String;

    return-void
.end method

.method public x(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/k2/v/f;->d:Ljava/lang/String;

    return-void
.end method

.method public y(Z)Lc/a/a/a/k2/v/f;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/v/f;->k:I

    return-object p0
.end method
