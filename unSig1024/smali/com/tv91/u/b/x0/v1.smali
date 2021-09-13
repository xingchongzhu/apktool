.class public final Lcom/tv91/u/b/x0/v1;
.super Lcom/tv91/q/b/d;
.source "StartDownloadUseCase.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/b/x0/v1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/q/b/d<",
        "Lcom/tv91/u/b/x0/v1$a;",
        ">;"
    }
.end annotation


# instance fields
.field private final i:Lcom/tv91/z/b;

.field private final j:Lcom/tv91/z/c;

.field private final k:Lcom/tv91/y/h;

.field private final l:Lcom/tv91/y/c;


# direct methods
.method public constructor <init>(Lcom/tv91/t/b;Lcom/tv91/z/b;Lcom/tv91/z/c;Lcom/tv91/y/h;Lcom/tv91/y/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/q/b/d;-><init>(Lcom/tv91/t/b;)V

    .line 2
    iput-object p2, p0, Lcom/tv91/u/b/x0/v1;->i:Lcom/tv91/z/b;

    .line 3
    iput-object p3, p0, Lcom/tv91/u/b/x0/v1;->j:Lcom/tv91/z/c;

    .line 4
    iput-object p4, p0, Lcom/tv91/u/b/x0/v1;->k:Lcom/tv91/y/h;

    .line 5
    iput-object p5, p0, Lcom/tv91/u/b/x0/v1;->l:Lcom/tv91/y/c;

    return-void
.end method

.method private synthetic B(Lcom/tv91/model/a;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/tv91/u/b/x0/t0;

    invoke-direct {v0, p0}, Lcom/tv91/u/b/x0/t0;-><init>(Lcom/tv91/u/b/x0/v1;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/tv91/u/b/x0/v1;->r(Lcom/tv91/model/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    new-instance p1, Lcom/tv91/u/b/x0/w0;

    invoke-direct {p1, p0}, Lcom/tv91/u/b/x0/w0;-><init>(Lcom/tv91/u/b/x0/v1;)V

    :goto_0
    invoke-virtual {p0, p1}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 4
    :try_start_1
    new-instance v0, Lcom/tv91/s/c;

    invoke-direct {v0, p1}, Lcom/tv91/s/c;-><init>(Ljava/lang/Exception;)V

    .line 5
    invoke-virtual {v0}, Lcom/tv91/s/c;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 6
    iget-object p1, p0, Lcom/tv91/u/b/x0/v1;->k:Lcom/tv91/y/h;

    invoke-interface {p1}, Lcom/tv91/y/h;->i()V

    .line 7
    :cond_0
    new-instance p1, Lcom/tv91/u/b/x0/r0;

    invoke-direct {p1, p0, v0}, Lcom/tv91/u/b/x0/r0;-><init>(Lcom/tv91/u/b/x0/v1;Lcom/tv91/s/c;)V

    invoke-virtual {p0, p1}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    new-instance p1, Lcom/tv91/u/b/x0/w0;

    invoke-direct {p1, p0}, Lcom/tv91/u/b/x0/w0;-><init>(Lcom/tv91/u/b/x0/v1;)V

    goto :goto_0

    :goto_1
    return-void

    :goto_2
    new-instance v0, Lcom/tv91/u/b/x0/w0;

    invoke-direct {v0, p0}, Lcom/tv91/u/b/x0/w0;-><init>(Lcom/tv91/u/b/x0/v1;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V

    .line 9
    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method

.method private synthetic D(Lcom/tv91/model/a;Ljava/lang/Number;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/x0;

    invoke-direct {v0, p0, p1, p2}, Lcom/tv91/u/b/x0/x0;-><init>(Lcom/tv91/u/b/x0/v1;Lcom/tv91/model/a;Ljava/lang/Number;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic F(Lcom/tv91/model/a;Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tv91/u/b/x0/v1;->o(Lcom/tv91/model/a;Ljava/io/File;)V

    return-void
.end method

.method private synthetic H(Lcom/tv91/s/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/v1;->L(Lcom/tv91/s/c;)V

    return-void
.end method

.method private synthetic J(Lcom/tv91/model/a;Ljava/lang/Number;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tv91/u/b/x0/v1;->N(Lcom/tv91/model/a;Ljava/lang/Number;)V

    return-void
.end method

.method private L(Lcom/tv91/s/c;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/tv91/q/b/d;->d()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/u/b/x0/v1$a;

    .line 2
    invoke-interface {v1, p1}, Lcom/tv91/u/b/x0/v1$a;->a(Lcom/tv91/s/c;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private M()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/tv91/q/b/d;->d()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/u/b/x0/v1$a;

    .line 2
    invoke-interface {v1}, Lcom/tv91/u/b/x0/v1$a;->s()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private N(Lcom/tv91/model/a;Ljava/lang/Number;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/tv91/q/b/d;->d()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/u/b/x0/v1$a;

    .line 2
    invoke-interface {v1, p1, p2}, Lcom/tv91/u/b/x0/v1$a;->k(Lcom/tv91/model/a;Ljava/lang/Number;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private O()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/tv91/q/b/d;->d()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/u/b/x0/v1$a;

    .line 2
    invoke-interface {v1}, Lcom/tv91/u/b/x0/v1$a;->l()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private P(Lcom/tv91/model/a;Ljava/io/File;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/tv91/q/b/d;->d()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/u/b/x0/v1$a;

    .line 2
    invoke-interface {v1, p1, p2}, Lcom/tv91/u/b/x0/v1$a;->u(Lcom/tv91/model/a;Ljava/io/File;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private o(Lcom/tv91/model/a;Ljava/io/File;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/x0/v1;->j:Lcom/tv91/z/c;

    invoke-interface {v0, p1}, Lcom/tv91/z/c;->a(Lcom/tv91/model/a;)V

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tv91/u/b/x0/v1;->k:Lcom/tv91/y/h;

    invoke-interface {v0}, Lcom/tv91/y/h;->d()Ljava/lang/String;

    move-result-object v2

    .line 3
    iget-object v0, p0, Lcom/tv91/u/b/x0/v1;->k:Lcom/tv91/y/h;

    invoke-interface {v0}, Lcom/tv91/y/h;->g()Ljava/lang/String;

    move-result-object v3

    .line 4
    iget-object v1, p0, Lcom/tv91/u/b/x0/v1;->i:Lcom/tv91/z/b;

    iget-object v0, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget v4, v0, Lcom/tv91/model/Movie;->id:I

    iget-object v0, p1, Lcom/tv91/model/a;->d:Lcom/tv91/model/DownloadInfo;

    iget v5, v0, Lcom/tv91/model/DownloadInfo;->id:I

    iget-object v6, v0, Lcom/tv91/model/DownloadInfo;->verifyId:Ljava/lang/String;

    invoke-interface/range {v1 .. v6}, Lcom/tv91/z/b;->k(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/b/x0/v1;->l:Lcom/tv91/y/c;

    invoke-interface {v0, p1}, Lcom/tv91/y/c;->j(Lcom/tv91/model/a;)Lcom/tv91/model/a;

    move-result-object p1

    .line 6
    new-instance v0, Lcom/tv91/u/b/x0/s0;

    invoke-direct {v0, p0, p1, p2}, Lcom/tv91/u/b/x0/s0;-><init>(Lcom/tv91/u/b/x0/v1;Lcom/tv91/model/a;Ljava/io/File;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 7
    new-instance p2, Lcom/tv91/u/b/x0/o0;

    invoke-direct {p2, p0, p1}, Lcom/tv91/u/b/x0/o0;-><init>(Lcom/tv91/u/b/x0/v1;Ljava/lang/Exception;)V

    invoke-virtual {p0, p2}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method private p(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/y0;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/b/x0/y0;-><init>(Lcom/tv91/u/b/x0/v1;Ljava/lang/Exception;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic s(Lcom/tv91/u/b/x0/v1;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/v1;->p(Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic t(Lcom/tv91/u/b/x0/v1;)V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/b/x0/v1;->O()V

    return-void
.end method

.method public static synthetic u(Lcom/tv91/u/b/x0/v1;)V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/b/x0/v1;->M()V

    return-void
.end method

.method private synthetic v(Lcom/tv91/model/a;Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tv91/u/b/x0/v1;->P(Lcom/tv91/model/a;Ljava/io/File;)V

    return-void
.end method

.method private synthetic x(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/s/c;

    invoke-direct {v0, p1}, Lcom/tv91/s/c;-><init>(Ljava/lang/Exception;)V

    invoke-direct {p0, v0}, Lcom/tv91/u/b/x0/v1;->L(Lcom/tv91/s/c;)V

    return-void
.end method

.method private synthetic z(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/s/c;

    invoke-direct {v0, p1}, Lcom/tv91/s/c;-><init>(Ljava/lang/Exception;)V

    invoke-direct {p0, v0}, Lcom/tv91/u/b/x0/v1;->L(Lcom/tv91/s/c;)V

    return-void
.end method


# virtual methods
.method public synthetic A(Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/v1;->z(Ljava/lang/Exception;)V

    return-void
.end method

.method public synthetic C(Lcom/tv91/model/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/v1;->B(Lcom/tv91/model/a;)V

    return-void
.end method

.method public synthetic E(Lcom/tv91/model/a;Ljava/lang/Number;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/b/x0/v1;->D(Lcom/tv91/model/a;Ljava/lang/Number;)V

    return-void
.end method

.method public synthetic G(Lcom/tv91/model/a;Ljava/io/File;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/b/x0/v1;->F(Lcom/tv91/model/a;Ljava/io/File;)V

    return-void
.end method

.method public synthetic I(Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/v1;->H(Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic K(Lcom/tv91/model/a;Ljava/lang/Number;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/b/x0/v1;->J(Lcom/tv91/model/a;Ljava/lang/Number;)V

    return-void
.end method

.method public q(Lcom/tv91/model/a;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/v0;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/b/x0/v0;-><init>(Lcom/tv91/u/b/x0/v1;Lcom/tv91/model/a;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->k(Ljava/lang/Runnable;)V

    return-void
.end method

.method public r(Lcom/tv91/model/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iget-object v1, p1, Lcom/tv91/model/a;->d:Lcom/tv91/model/DownloadInfo;

    iget-object v1, v1, Lcom/tv91/model/DownloadInfo;->expireDate:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tv91/u/b/x0/v1;->l:Lcom/tv91/y/c;

    invoke-interface {v0, p1}, Lcom/tv91/y/c;->c(Lcom/tv91/model/a;)Lcom/tv91/model/a;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lcom/tv91/u/b/x0/v1;->j:Lcom/tv91/z/c;

    new-instance v1, Lcom/tv91/u/b/x0/p0;

    invoke-direct {v1, p0, p1}, Lcom/tv91/u/b/x0/p0;-><init>(Lcom/tv91/u/b/x0/v1;Lcom/tv91/model/a;)V

    invoke-interface {v0, p1, v1}, Lcom/tv91/z/c;->e(Lcom/tv91/model/a;Lcom/tv91/z/c$a;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/b/x0/v1;->j:Lcom/tv91/z/c;

    new-instance v1, Lcom/tv91/u/b/x0/u0;

    invoke-direct {v1, p0, p1}, Lcom/tv91/u/b/x0/u0;-><init>(Lcom/tv91/u/b/x0/v1;Lcom/tv91/model/a;)V

    new-instance v2, Lcom/tv91/u/b/x0/q0;

    invoke-direct {v2, p0}, Lcom/tv91/u/b/x0/q0;-><init>(Lcom/tv91/u/b/x0/v1;)V

    invoke-interface {v0, p1, v1, v2}, Lcom/tv91/z/c;->f(Lcom/tv91/model/a;Lb/g/j/a;Lb/g/j/a;)V

    return-void

    .line 5
    :cond_0
    sget-object v0, Lcom/tv91/model/a$a;->h:Lcom/tv91/model/a$a;

    invoke-virtual {p1, v0}, Lcom/tv91/model/a;->b(Lcom/tv91/model/a$a;)Lcom/tv91/model/a;

    move-result-object p1

    .line 6
    iget-object v0, p0, Lcom/tv91/u/b/x0/v1;->l:Lcom/tv91/y/c;

    invoke-interface {v0, p1}, Lcom/tv91/y/c;->h(Lcom/tv91/model/a;)V

    .line 7
    new-instance p1, Lcom/tv91/s/a;

    const-string v0, "Download-Expired"

    invoke-direct {p1, v0}, Lcom/tv91/s/a;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic w(Lcom/tv91/model/a;Ljava/io/File;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/b/x0/v1;->v(Lcom/tv91/model/a;Ljava/io/File;)V

    return-void
.end method

.method public synthetic y(Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/v1;->x(Ljava/lang/Exception;)V

    return-void
.end method
