.class final Lc/a/a/a/k2/t/g;
.super Ljava/lang/Object;
.source "TtmlStyle.java"


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:Z

.field private d:I

.field private e:Z

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:F

.field private l:Ljava/lang/String;

.field private m:I

.field private n:I

.field private o:Landroid/text/Layout$Alignment;

.field private p:I

.field private q:Lc/a/a/a/k2/t/b;

.field private r:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lc/a/a/a/k2/t/g;->f:I

    .line 3
    iput v0, p0, Lc/a/a/a/k2/t/g;->g:I

    .line 4
    iput v0, p0, Lc/a/a/a/k2/t/g;->h:I

    .line 5
    iput v0, p0, Lc/a/a/a/k2/t/g;->i:I

    .line 6
    iput v0, p0, Lc/a/a/a/k2/t/g;->j:I

    .line 7
    iput v0, p0, Lc/a/a/a/k2/t/g;->m:I

    .line 8
    iput v0, p0, Lc/a/a/a/k2/t/g;->n:I

    .line 9
    iput v0, p0, Lc/a/a/a/k2/t/g;->p:I

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 10
    iput v0, p0, Lc/a/a/a/k2/t/g;->r:F

    return-void
.end method

.method private q(Lc/a/a/a/k2/t/g;Z)Lc/a/a/a/k2/t/g;
    .locals 3

    if-eqz p1, :cond_d

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/k2/t/g;->c:Z

    if-nez v0, :cond_0

    iget-boolean v0, p1, Lc/a/a/a/k2/t/g;->c:Z

    if-eqz v0, :cond_0

    .line 2
    iget v0, p1, Lc/a/a/a/k2/t/g;->b:I

    invoke-virtual {p0, v0}, Lc/a/a/a/k2/t/g;->v(I)Lc/a/a/a/k2/t/g;

    .line 3
    :cond_0
    iget v0, p0, Lc/a/a/a/k2/t/g;->h:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 4
    iget v0, p1, Lc/a/a/a/k2/t/g;->h:I

    iput v0, p0, Lc/a/a/a/k2/t/g;->h:I

    .line 5
    :cond_1
    iget v0, p0, Lc/a/a/a/k2/t/g;->i:I

    if-ne v0, v1, :cond_2

    .line 6
    iget v0, p1, Lc/a/a/a/k2/t/g;->i:I

    iput v0, p0, Lc/a/a/a/k2/t/g;->i:I

    .line 7
    :cond_2
    iget-object v0, p0, Lc/a/a/a/k2/t/g;->a:Ljava/lang/String;

    if-nez v0, :cond_3

    iget-object v0, p1, Lc/a/a/a/k2/t/g;->a:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 8
    iput-object v0, p0, Lc/a/a/a/k2/t/g;->a:Ljava/lang/String;

    .line 9
    :cond_3
    iget v0, p0, Lc/a/a/a/k2/t/g;->f:I

    if-ne v0, v1, :cond_4

    .line 10
    iget v0, p1, Lc/a/a/a/k2/t/g;->f:I

    iput v0, p0, Lc/a/a/a/k2/t/g;->f:I

    .line 11
    :cond_4
    iget v0, p0, Lc/a/a/a/k2/t/g;->g:I

    if-ne v0, v1, :cond_5

    .line 12
    iget v0, p1, Lc/a/a/a/k2/t/g;->g:I

    iput v0, p0, Lc/a/a/a/k2/t/g;->g:I

    .line 13
    :cond_5
    iget v0, p0, Lc/a/a/a/k2/t/g;->n:I

    if-ne v0, v1, :cond_6

    .line 14
    iget v0, p1, Lc/a/a/a/k2/t/g;->n:I

    iput v0, p0, Lc/a/a/a/k2/t/g;->n:I

    .line 15
    :cond_6
    iget-object v0, p0, Lc/a/a/a/k2/t/g;->o:Landroid/text/Layout$Alignment;

    if-nez v0, :cond_7

    iget-object v0, p1, Lc/a/a/a/k2/t/g;->o:Landroid/text/Layout$Alignment;

    if-eqz v0, :cond_7

    .line 16
    iput-object v0, p0, Lc/a/a/a/k2/t/g;->o:Landroid/text/Layout$Alignment;

    .line 17
    :cond_7
    iget v0, p0, Lc/a/a/a/k2/t/g;->p:I

    if-ne v0, v1, :cond_8

    .line 18
    iget v0, p1, Lc/a/a/a/k2/t/g;->p:I

    iput v0, p0, Lc/a/a/a/k2/t/g;->p:I

    .line 19
    :cond_8
    iget v0, p0, Lc/a/a/a/k2/t/g;->j:I

    if-ne v0, v1, :cond_9

    .line 20
    iget v0, p1, Lc/a/a/a/k2/t/g;->j:I

    iput v0, p0, Lc/a/a/a/k2/t/g;->j:I

    .line 21
    iget v0, p1, Lc/a/a/a/k2/t/g;->k:F

    iput v0, p0, Lc/a/a/a/k2/t/g;->k:F

    .line 22
    :cond_9
    iget-object v0, p0, Lc/a/a/a/k2/t/g;->q:Lc/a/a/a/k2/t/b;

    if-nez v0, :cond_a

    .line 23
    iget-object v0, p1, Lc/a/a/a/k2/t/g;->q:Lc/a/a/a/k2/t/b;

    iput-object v0, p0, Lc/a/a/a/k2/t/g;->q:Lc/a/a/a/k2/t/b;

    .line 24
    :cond_a
    iget v0, p0, Lc/a/a/a/k2/t/g;->r:F

    const v2, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v0, v0, v2

    if-nez v0, :cond_b

    .line 25
    iget v0, p1, Lc/a/a/a/k2/t/g;->r:F

    iput v0, p0, Lc/a/a/a/k2/t/g;->r:F

    :cond_b
    if-eqz p2, :cond_c

    .line 26
    iget-boolean v0, p0, Lc/a/a/a/k2/t/g;->e:Z

    if-nez v0, :cond_c

    iget-boolean v0, p1, Lc/a/a/a/k2/t/g;->e:Z

    if-eqz v0, :cond_c

    .line 27
    iget v0, p1, Lc/a/a/a/k2/t/g;->d:I

    invoke-virtual {p0, v0}, Lc/a/a/a/k2/t/g;->t(I)Lc/a/a/a/k2/t/g;

    :cond_c
    if-eqz p2, :cond_d

    .line 28
    iget p2, p0, Lc/a/a/a/k2/t/g;->m:I

    if-ne p2, v1, :cond_d

    iget p1, p1, Lc/a/a/a/k2/t/g;->m:I

    if-eq p1, v1, :cond_d

    .line 29
    iput p1, p0, Lc/a/a/a/k2/t/g;->m:I

    :cond_d
    return-object p0
.end method


# virtual methods
.method public A(Z)Lc/a/a/a/k2/t/g;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/t/g;->i:I

    return-object p0
.end method

.method public B(Z)Lc/a/a/a/k2/t/g;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/t/g;->f:I

    return-object p0
.end method

.method public C(I)Lc/a/a/a/k2/t/g;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/t/g;->n:I

    return-object p0
.end method

.method public D(I)Lc/a/a/a/k2/t/g;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/t/g;->m:I

    return-object p0
.end method

.method public E(F)Lc/a/a/a/k2/t/g;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/t/g;->r:F

    return-object p0
.end method

.method public F(Landroid/text/Layout$Alignment;)Lc/a/a/a/k2/t/g;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/k2/t/g;->o:Landroid/text/Layout$Alignment;

    return-object p0
.end method

.method public G(Z)Lc/a/a/a/k2/t/g;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/t/g;->p:I

    return-object p0
.end method

.method public H(Lc/a/a/a/k2/t/b;)Lc/a/a/a/k2/t/g;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/k2/t/g;->q:Lc/a/a/a/k2/t/b;

    return-object p0
.end method

.method public I(Z)Lc/a/a/a/k2/t/g;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/t/g;->g:I

    return-object p0
.end method

.method public a(Lc/a/a/a/k2/t/g;)Lc/a/a/a/k2/t/g;
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, v0}, Lc/a/a/a/k2/t/g;->q(Lc/a/a/a/k2/t/g;Z)Lc/a/a/a/k2/t/g;

    move-result-object p1

    return-object p1
.end method

.method public b()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/k2/t/g;->e:Z

    if-eqz v0, :cond_0

    .line 2
    iget v0, p0, Lc/a/a/a/k2/t/g;->d:I

    return v0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Background color has not been defined."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/k2/t/g;->c:Z

    if-eqz v0, :cond_0

    .line 2
    iget v0, p0, Lc/a/a/a/k2/t/g;->b:I

    return v0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Font color has not been defined."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/t/g;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e()F
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/k2/t/g;->k:F

    return v0
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/k2/t/g;->j:I

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/t/g;->l:Ljava/lang/String;

    return-object v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/k2/t/g;->n:I

    return v0
.end method

.method public i()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/k2/t/g;->m:I

    return v0
.end method

.method public j()F
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/k2/t/g;->r:F

    return v0
.end method

.method public k()I
    .locals 4

    .line 1
    iget v0, p0, Lc/a/a/a/k2/t/g;->h:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v2, p0, Lc/a/a/a/k2/t/g;->i:I

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
    iget v3, p0, Lc/a/a/a/k2/t/g;->i:I

    if-ne v3, v2, :cond_2

    const/4 v1, 0x2

    :cond_2
    or-int/2addr v0, v1

    return v0
.end method

.method public l()Landroid/text/Layout$Alignment;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/t/g;->o:Landroid/text/Layout$Alignment;

    return-object v0
.end method

.method public m()Z
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/k2/t/g;->p:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public n()Lc/a/a/a/k2/t/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/t/g;->q:Lc/a/a/a/k2/t/b;

    return-object v0
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/k2/t/g;->e:Z

    return v0
.end method

.method public p()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/k2/t/g;->c:Z

    return v0
.end method

.method public r()Z
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/k2/t/g;->f:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public s()Z
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/k2/t/g;->g:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public t(I)Lc/a/a/a/k2/t/g;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/t/g;->d:I

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lc/a/a/a/k2/t/g;->e:Z

    return-object p0
.end method

.method public u(Z)Lc/a/a/a/k2/t/g;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/t/g;->h:I

    return-object p0
.end method

.method public v(I)Lc/a/a/a/k2/t/g;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/t/g;->b:I

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lc/a/a/a/k2/t/g;->c:Z

    return-object p0
.end method

.method public w(Ljava/lang/String;)Lc/a/a/a/k2/t/g;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/k2/t/g;->a:Ljava/lang/String;

    return-object p0
.end method

.method public x(F)Lc/a/a/a/k2/t/g;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/t/g;->k:F

    return-object p0
.end method

.method public y(I)Lc/a/a/a/k2/t/g;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/t/g;->j:I

    return-object p0
.end method

.method public z(Ljava/lang/String;)Lc/a/a/a/k2/t/g;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/k2/t/g;->l:Ljava/lang/String;

    return-object p0
.end method
