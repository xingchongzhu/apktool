.class public final Lcom/tv91/features/authentication/q/w;
.super Lcom/tv91/q/b/d;
.source "LoadUserInfoUseCase.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/q/b/d<",
        "Lcom/tv91/q/b/e;",
        ">;"
    }
.end annotation


# instance fields
.field private final i:Lcom/tv91/z/b;

.field private final j:Lcom/tv91/y/h;

.field private k:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Lcom/tv91/model/User;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Lcom/tv91/q/b/e;


# direct methods
.method public constructor <init>(Lcom/tv91/t/b;Lcom/tv91/z/b;Lcom/tv91/y/h;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/q/b/d;-><init>(Lcom/tv91/t/b;)V

    .line 2
    invoke-static {}, Lcom/tv91/q/b/d;->b()Lb/g/j/a;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/features/authentication/q/w;->k:Lb/g/j/a;

    .line 3
    new-instance p1, Lcom/tv91/features/authentication/q/a;

    invoke-direct {p1, p0}, Lcom/tv91/features/authentication/q/a;-><init>(Lcom/tv91/features/authentication/q/w;)V

    iput-object p1, p0, Lcom/tv91/features/authentication/q/w;->l:Lcom/tv91/q/b/e;

    .line 4
    iput-object p2, p0, Lcom/tv91/features/authentication/q/w;->i:Lcom/tv91/z/b;

    .line 5
    iput-object p3, p0, Lcom/tv91/features/authentication/q/w;->j:Lcom/tv91/y/h;

    return-void
.end method

.method private synthetic q()V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lcom/tv91/q/b/f$c;

    invoke-direct {v0}, Lcom/tv91/q/b/f$c;-><init>()V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    .line 2
    invoke-virtual {p0}, Lcom/tv91/features/authentication/q/w;->p()Lcom/tv91/model/User;

    move-result-object v0

    .line 3
    new-instance v1, Lcom/tv91/q/b/f$d;

    invoke-direct {v1, v0}, Lcom/tv91/q/b/f$d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v1}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    new-instance v0, Lcom/tv91/q/b/f$b;

    invoke-direct {v0}, Lcom/tv91/q/b/f$b;-><init>()V

    :goto_0
    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 5
    :try_start_1
    new-instance v1, Lcom/tv91/s/c;

    invoke-direct {v1, v0}, Lcom/tv91/s/c;-><init>(Ljava/lang/Exception;)V

    .line 6
    invoke-virtual {v1}, Lcom/tv91/s/c;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    iget-object v0, p0, Lcom/tv91/features/authentication/q/w;->j:Lcom/tv91/y/h;

    invoke-interface {v0}, Lcom/tv91/y/h;->i()V

    .line 8
    :cond_0
    new-instance v0, Lcom/tv91/q/b/f$a;

    invoke-direct {v0, v1}, Lcom/tv91/q/b/f$a;-><init>(Lcom/tv91/s/c;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    new-instance v0, Lcom/tv91/q/b/f$b;

    invoke-direct {v0}, Lcom/tv91/q/b/f$b;-><init>()V

    goto :goto_0

    :goto_1
    return-void

    :goto_2
    new-instance v1, Lcom/tv91/q/b/f$b;

    invoke-direct {v1}, Lcom/tv91/q/b/f$b;-><init>()V

    invoke-virtual {p0, v1}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    .line 10
    goto :goto_4

    :goto_3
    throw v0

    :goto_4
    goto :goto_3
.end method

.method private synthetic s(Lcom/tv91/q/b/f;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/tv91/q/b/f$c;

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/tv91/q/b/d;->c:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 3
    :cond_0
    instance-of v0, p1, Lcom/tv91/q/b/f$b;

    if-eqz v0, :cond_1

    .line 4
    iget-object p1, p0, Lcom/tv91/q/b/d;->d:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 5
    :cond_1
    instance-of v0, p1, Lcom/tv91/q/b/f$d;

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/tv91/features/authentication/q/w;->k:Lb/g/j/a;

    check-cast p1, Lcom/tv91/q/b/f$d;

    iget-object p1, p1, Lcom/tv91/q/b/f$d;->a:Ljava/lang/Object;

    invoke-interface {v0, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 7
    :cond_2
    instance-of v0, p1, Lcom/tv91/q/b/f$a;

    if-eqz v0, :cond_3

    .line 8
    iget-object v0, p0, Lcom/tv91/q/b/d;->e:Lb/g/j/a;

    check-cast p1, Lcom/tv91/q/b/f$a;

    iget-object p1, p1, Lcom/tv91/q/b/f$a;->a:Lcom/tv91/s/c;

    invoke-interface {v0, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public o()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/q/w;->l:Lcom/tv91/q/b/e;

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    .line 2
    new-instance v0, Lcom/tv91/features/authentication/q/b;

    invoke-direct {v0, p0}, Lcom/tv91/features/authentication/q/b;-><init>(Lcom/tv91/features/authentication/q/w;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->j(Ljava/lang/Runnable;)V

    return-void
.end method

.method public p()Lcom/tv91/model/User;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/q/w;->i:Lcom/tv91/z/b;

    iget-object v1, p0, Lcom/tv91/features/authentication/q/w;->j:Lcom/tv91/y/h;

    invoke-interface {v1}, Lcom/tv91/y/h;->d()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/tv91/features/authentication/q/w;->j:Lcom/tv91/y/h;

    invoke-interface {v2}, Lcom/tv91/y/h;->g()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/tv91/z/b;->H(Ljava/lang/String;Ljava/lang/String;)Lcom/tv91/model/User;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/tv91/features/authentication/q/w;->j:Lcom/tv91/y/h;

    invoke-interface {v1}, Lcom/tv91/y/h;->e()Lcom/tv91/model/User;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tv91/model/User;->newBuilder()Lcom/tv91/model/User$Builder;

    move-result-object v1

    iget-object v2, v0, Lcom/tv91/model/User;->phone:Ljava/lang/String;

    .line 3
    invoke-virtual {v1, v2}, Lcom/tv91/model/User$Builder;->phone(Ljava/lang/String;)Lcom/tv91/model/User$Builder;

    move-result-object v1

    iget v2, v0, Lcom/tv91/model/User;->point:I

    .line 4
    invoke-virtual {v1, v2}, Lcom/tv91/model/User$Builder;->point(I)Lcom/tv91/model/User$Builder;

    move-result-object v1

    iget-boolean v2, v0, Lcom/tv91/model/User;->isVip:Z

    .line 5
    invoke-virtual {v1, v2}, Lcom/tv91/model/User$Builder;->isVip(Z)Lcom/tv91/model/User$Builder;

    move-result-object v1

    iget-object v2, v0, Lcom/tv91/model/User;->vipDate:Ljava/util/Date;

    .line 6
    invoke-virtual {v1, v2}, Lcom/tv91/model/User$Builder;->vipDate(Ljava/util/Date;)Lcom/tv91/model/User$Builder;

    move-result-object v1

    iget-boolean v2, v0, Lcom/tv91/model/User;->isQuick:Z

    .line 7
    invoke-virtual {v1, v2}, Lcom/tv91/model/User$Builder;->isQuick(Z)Lcom/tv91/model/User$Builder;

    move-result-object v1

    iget-boolean v2, v0, Lcom/tv91/model/User;->isCertified:Z

    .line 8
    invoke-virtual {v1, v2}, Lcom/tv91/model/User$Builder;->isCertified(Z)Lcom/tv91/model/User$Builder;

    move-result-object v1

    iget-boolean v2, v0, Lcom/tv91/model/User;->onlineServiceAvailable:Z

    .line 9
    invoke-virtual {v1, v2}, Lcom/tv91/model/User$Builder;->onlineServiceAvailable(Z)Lcom/tv91/model/User$Builder;

    move-result-object v1

    iget-object v0, v0, Lcom/tv91/model/User;->onlineServiceUrl:Ljava/lang/String;

    .line 10
    invoke-virtual {v1, v0}, Lcom/tv91/model/User$Builder;->onlineServiceUrl(Ljava/lang/String;)Lcom/tv91/model/User$Builder;

    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/tv91/model/User$Builder;->build()Lcom/tv91/model/User;

    move-result-object v0

    .line 12
    iget-object v1, p0, Lcom/tv91/features/authentication/q/w;->j:Lcom/tv91/y/h;

    invoke-interface {v1, v0}, Lcom/tv91/y/h;->h(Lcom/tv91/model/User;)V

    return-object v0
.end method

.method public synthetic r()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/features/authentication/q/w;->q()V

    return-void
.end method

.method public synthetic t(Lcom/tv91/q/b/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/q/w;->s(Lcom/tv91/q/b/f;)V

    return-void
.end method

.method public u(Lb/g/j/a;)Lcom/tv91/features/authentication/q/w;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/s/c;",
            ">;)",
            "Lcom/tv91/features/authentication/q/w;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/q/b/d;->e:Lb/g/j/a;

    return-object p0
.end method

.method public v(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/w;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/q/b/d;->d:Ljava/lang/Runnable;

    return-object p0
.end method

.method public w(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/w;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/q/b/d;->c:Ljava/lang/Runnable;

    return-object p0
.end method

.method public x(Lb/g/j/a;)Lcom/tv91/features/authentication/q/w;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/User;",
            ">;)",
            "Lcom/tv91/features/authentication/q/w;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/features/authentication/q/w;->k:Lb/g/j/a;

    return-object p0
.end method
