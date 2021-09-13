.class public final Lcom/tv91/features/authentication/q/e0;
.super Lcom/tv91/q/b/d;
.source "SendForgetPasswordEmailUseCase.java"


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

.field private j:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Lcom/tv91/q/b/e;


# direct methods
.method public constructor <init>(Lcom/tv91/t/b;Lcom/tv91/z/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/q/b/d;-><init>(Lcom/tv91/t/b;)V

    .line 2
    invoke-static {}, Lcom/tv91/q/b/d;->b()Lb/g/j/a;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/features/authentication/q/e0;->j:Lb/g/j/a;

    .line 3
    new-instance p1, Lcom/tv91/features/authentication/q/r;

    invoke-direct {p1, p0}, Lcom/tv91/features/authentication/q/r;-><init>(Lcom/tv91/features/authentication/q/e0;)V

    iput-object p1, p0, Lcom/tv91/features/authentication/q/e0;->k:Lcom/tv91/q/b/e;

    .line 4
    iput-object p2, p0, Lcom/tv91/features/authentication/q/e0;->i:Lcom/tv91/z/b;

    return-void
.end method

.method private synthetic q(Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lcom/tv91/q/b/f$c;

    invoke-direct {v0}, Lcom/tv91/q/b/f$c;-><init>()V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/tv91/features/authentication/q/e0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3
    new-instance v0, Lcom/tv91/q/b/f$d;

    invoke-direct {v0, p1}, Lcom/tv91/q/b/f$d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    new-instance p1, Lcom/tv91/q/b/f$b;

    invoke-direct {p1}, Lcom/tv91/q/b/f$b;-><init>()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 5
    :try_start_1
    new-instance v0, Lcom/tv91/q/b/f$a;

    new-instance v1, Lcom/tv91/s/c;

    invoke-direct {v1, p1}, Lcom/tv91/s/c;-><init>(Ljava/lang/Exception;)V

    invoke-direct {v0, v1}, Lcom/tv91/q/b/f$a;-><init>(Lcom/tv91/s/c;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    new-instance p1, Lcom/tv91/q/b/f$b;

    invoke-direct {p1}, Lcom/tv91/q/b/f$b;-><init>()V

    :goto_0
    invoke-virtual {p0, p1}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    return-void

    :goto_1
    new-instance v0, Lcom/tv91/q/b/f$b;

    invoke-direct {v0}, Lcom/tv91/q/b/f$b;-><init>()V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    .line 7
    throw p1
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
    iget-object v0, p0, Lcom/tv91/features/authentication/q/e0;->j:Lb/g/j/a;

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
.method public o(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/q/e0;->k:Lcom/tv91/q/b/e;

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    .line 2
    new-instance v0, Lcom/tv91/features/authentication/q/q;

    invoke-direct {v0, p0, p1}, Lcom/tv91/features/authentication/q/q;-><init>(Lcom/tv91/features/authentication/q/e0;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->j(Ljava/lang/Runnable;)V

    return-void
.end method

.method public p(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    invoke-static {p1}, Lcom/tv91/utils/g;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/q/e0;->i:Lcom/tv91/z/b;

    invoke-interface {v0, p1}, Lcom/tv91/z/b;->t(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    new-instance p1, Lcom/tv91/s/e;

    sget-object v0, Lcom/tv91/s/d;->n:Lcom/tv91/s/d;

    invoke-direct {p1, v0}, Lcom/tv91/s/e;-><init>(Lcom/tv91/s/d;)V

    throw p1

    .line 5
    :cond_1
    new-instance p1, Lcom/tv91/s/e;

    sget-object v0, Lcom/tv91/s/d;->m:Lcom/tv91/s/d;

    invoke-direct {p1, v0}, Lcom/tv91/s/e;-><init>(Lcom/tv91/s/d;)V

    throw p1
.end method

.method public synthetic r(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/q/e0;->q(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic t(Lcom/tv91/q/b/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/q/e0;->s(Lcom/tv91/q/b/f;)V

    return-void
.end method

.method public u(Lb/g/j/a;)Lcom/tv91/features/authentication/q/e0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/s/c;",
            ">;)",
            "Lcom/tv91/features/authentication/q/e0;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/q/b/d;->e:Lb/g/j/a;

    return-object p0
.end method

.method public v(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/e0;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/q/b/d;->c:Ljava/lang/Runnable;

    return-object p0
.end method

.method public w(Lb/g/j/a;)Lcom/tv91/features/authentication/q/e0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/tv91/features/authentication/q/e0;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/features/authentication/q/e0;->j:Lb/g/j/a;

    return-object p0
.end method
