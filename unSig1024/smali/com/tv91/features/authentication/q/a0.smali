.class public final Lcom/tv91/features/authentication/q/a0;
.super Lcom/tv91/q/b/d;
.source "ModifyPasswordUseCase.java"


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

.field private k:Ljava/lang/Runnable;

.field private final l:Lcom/tv91/q/b/e;


# direct methods
.method public constructor <init>(Lcom/tv91/t/b;Lcom/tv91/z/b;Lcom/tv91/y/h;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/q/b/d;-><init>(Lcom/tv91/t/b;)V

    .line 2
    invoke-static {}, Lcom/tv91/q/b/d;->c()Ljava/lang/Runnable;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/features/authentication/q/a0;->k:Ljava/lang/Runnable;

    .line 3
    new-instance p1, Lcom/tv91/features/authentication/q/j;

    invoke-direct {p1, p0}, Lcom/tv91/features/authentication/q/j;-><init>(Lcom/tv91/features/authentication/q/a0;)V

    iput-object p1, p0, Lcom/tv91/features/authentication/q/a0;->l:Lcom/tv91/q/b/e;

    .line 4
    iput-object p2, p0, Lcom/tv91/features/authentication/q/a0;->i:Lcom/tv91/z/b;

    .line 5
    iput-object p3, p0, Lcom/tv91/features/authentication/q/a0;->j:Lcom/tv91/y/h;

    return-void
.end method

.method private synthetic q(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/tv91/q/b/f$c;

    invoke-direct {v0}, Lcom/tv91/q/b/f$c;-><init>()V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/tv91/features/authentication/q/a0;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    new-instance p1, Lcom/tv91/q/b/f$d;

    invoke-direct {p1}, Lcom/tv91/q/b/f$d;-><init>()V

    invoke-virtual {p0, p1}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    new-instance p1, Lcom/tv91/q/b/f$b;

    invoke-direct {p1}, Lcom/tv91/q/b/f$b;-><init>()V

    :goto_0
    invoke-virtual {p0, p1}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 5
    :try_start_1
    new-instance p2, Lcom/tv91/s/c;

    invoke-direct {p2, p1}, Lcom/tv91/s/c;-><init>(Ljava/lang/Exception;)V

    .line 6
    invoke-virtual {p2}, Lcom/tv91/s/c;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 7
    iget-object p1, p0, Lcom/tv91/features/authentication/q/a0;->j:Lcom/tv91/y/h;

    invoke-interface {p1}, Lcom/tv91/y/h;->i()V

    .line 8
    :cond_0
    new-instance p1, Lcom/tv91/q/b/f$a;

    invoke-direct {p1, p2}, Lcom/tv91/q/b/f$a;-><init>(Lcom/tv91/s/c;)V

    invoke-virtual {p0, p1}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    new-instance p1, Lcom/tv91/q/b/f$b;

    invoke-direct {p1}, Lcom/tv91/q/b/f$b;-><init>()V

    goto :goto_0

    :goto_1
    return-void

    :goto_2
    new-instance p2, Lcom/tv91/q/b/f$b;

    invoke-direct {p2}, Lcom/tv91/q/b/f$b;-><init>()V

    invoke-virtual {p0, p2}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    .line 10
    goto :goto_4

    :goto_3
    throw p1

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
    iget-object p1, p0, Lcom/tv91/features/authentication/q/a0;->k:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

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
.method public o(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/q/a0;->l:Lcom/tv91/q/b/e;

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    .line 2
    new-instance v0, Lcom/tv91/features/authentication/q/i;

    invoke-direct {v0, p0, p1, p2}, Lcom/tv91/features/authentication/q/i;-><init>(Lcom/tv91/features/authentication/q/a0;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->j(Ljava/lang/Runnable;)V

    return-void
.end method

.method public p(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    if-lt v0, v1, :cond_1

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/g;->b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 4
    iget-object p2, p0, Lcom/tv91/features/authentication/q/a0;->i:Lcom/tv91/z/b;

    iget-object v0, p0, Lcom/tv91/features/authentication/q/a0;->j:Lcom/tv91/y/h;

    invoke-interface {v0}, Lcom/tv91/y/h;->d()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/tv91/features/authentication/q/a0;->j:Lcom/tv91/y/h;

    invoke-interface {v1}, Lcom/tv91/y/h;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1, p1}, Lcom/tv91/z/b;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lcom/tv91/features/authentication/q/a0;->j:Lcom/tv91/y/h;

    invoke-interface {p1}, Lcom/tv91/y/h;->b()V

    return-void

    .line 6
    :cond_0
    new-instance p1, Lcom/tv91/s/e;

    sget-object p2, Lcom/tv91/s/d;->h:Lcom/tv91/s/d;

    invoke-direct {p1, p2}, Lcom/tv91/s/e;-><init>(Lcom/tv91/s/d;)V

    throw p1

    .line 7
    :cond_1
    new-instance p1, Lcom/tv91/s/e;

    sget-object p2, Lcom/tv91/s/d;->g:Lcom/tv91/s/d;

    invoke-direct {p1, p2}, Lcom/tv91/s/e;-><init>(Lcom/tv91/s/d;)V

    throw p1

    .line 8
    :cond_2
    new-instance p1, Lcom/tv91/s/e;

    sget-object p2, Lcom/tv91/s/d;->d:Lcom/tv91/s/d;

    invoke-direct {p1, p2}, Lcom/tv91/s/e;-><init>(Lcom/tv91/s/d;)V

    throw p1
.end method

.method public synthetic r(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/features/authentication/q/a0;->q(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic t(Lcom/tv91/q/b/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/q/a0;->s(Lcom/tv91/q/b/f;)V

    return-void
.end method

.method public u(Lb/g/j/a;)Lcom/tv91/features/authentication/q/a0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/s/c;",
            ">;)",
            "Lcom/tv91/features/authentication/q/a0;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/q/b/d;->e:Lb/g/j/a;

    return-object p0
.end method

.method public v(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/a0;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/features/authentication/q/a0;->k:Ljava/lang/Runnable;

    return-object p0
.end method
