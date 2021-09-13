.class public final Lcom/tv91/features/authentication/q/x;
.super Lcom/tv91/q/b/d;
.source "LoginUseCase.java"


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

.field private final k:Lcom/tv91/y/e;

.field private l:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Lcom/tv91/model/User;",
            ">;"
        }
    .end annotation
.end field

.field private final m:Lcom/tv91/q/b/e;


# direct methods
.method public constructor <init>(Lcom/tv91/t/b;Lcom/tv91/z/b;Lcom/tv91/y/h;Lcom/tv91/y/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/q/b/d;-><init>(Lcom/tv91/t/b;)V

    .line 2
    invoke-static {}, Lcom/tv91/q/b/d;->b()Lb/g/j/a;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/features/authentication/q/x;->l:Lb/g/j/a;

    .line 3
    new-instance p1, Lcom/tv91/features/authentication/q/d;

    invoke-direct {p1, p0}, Lcom/tv91/features/authentication/q/d;-><init>(Lcom/tv91/features/authentication/q/x;)V

    iput-object p1, p0, Lcom/tv91/features/authentication/q/x;->m:Lcom/tv91/q/b/e;

    .line 4
    iput-object p2, p0, Lcom/tv91/features/authentication/q/x;->i:Lcom/tv91/z/b;

    .line 5
    iput-object p3, p0, Lcom/tv91/features/authentication/q/x;->j:Lcom/tv91/y/h;

    .line 6
    iput-object p4, p0, Lcom/tv91/features/authentication/q/x;->k:Lcom/tv91/y/e;

    return-void
.end method

.method private synthetic q(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/tv91/q/b/f$c;

    invoke-direct {v0}, Lcom/tv91/q/b/f$c;-><init>()V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/tv91/features/authentication/q/x;->p(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Lcom/tv91/model/User;

    move-result-object p1

    .line 3
    new-instance p2, Lcom/tv91/q/b/f$d;

    invoke-direct {p2, p1}, Lcom/tv91/q/b/f$d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V
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
    new-instance p2, Lcom/tv91/q/b/f$a;

    new-instance v0, Lcom/tv91/s/c;

    invoke-direct {v0, p1}, Lcom/tv91/s/c;-><init>(Ljava/lang/Exception;)V

    invoke-direct {p2, v0}, Lcom/tv91/q/b/f$a;-><init>(Lcom/tv91/s/c;)V

    invoke-virtual {p0, p2}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    new-instance p1, Lcom/tv91/q/b/f$b;

    invoke-direct {p1}, Lcom/tv91/q/b/f$b;-><init>()V

    :goto_0
    invoke-virtual {p0, p1}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    return-void

    :goto_1
    new-instance p2, Lcom/tv91/q/b/f$b;

    invoke-direct {p2}, Lcom/tv91/q/b/f$b;-><init>()V

    invoke-virtual {p0, p2}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

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
    iget-object v0, p0, Lcom/tv91/features/authentication/q/x;->l:Lb/g/j/a;

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
.method public o(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/q/x;->m:Lcom/tv91/q/b/e;

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    .line 2
    new-instance v0, Lcom/tv91/features/authentication/q/c;

    invoke-direct {v0, p0, p1, p2}, Lcom/tv91/features/authentication/q/c;-><init>(Lcom/tv91/features/authentication/q/x;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->j(Ljava/lang/Runnable;)V

    return-void
.end method

.method public p(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Lcom/tv91/model/User;
    .locals 3
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
    invoke-static {p2}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tv91/utils/g;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/tv91/features/authentication/q/x;->i:Lcom/tv91/z/b;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/tv91/z/b;->A(Ljava/lang/String;Ljava/lang/String;)Lcom/tv91/model/User;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/tv91/features/authentication/q/x;->j:Lcom/tv91/y/h;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/tv91/y/h;->f(Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lcom/tv91/features/authentication/q/x;->j:Lcom/tv91/y/h;

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/tv91/y/h;->j(Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lcom/tv91/features/authentication/q/x;->j:Lcom/tv91/y/h;

    invoke-interface {p1, v0}, Lcom/tv91/y/h;->h(Lcom/tv91/model/User;)V

    .line 8
    iget-object p1, p0, Lcom/tv91/features/authentication/q/x;->k:Lcom/tv91/y/e;

    iget p2, v0, Lcom/tv91/model/User;->sid:I

    invoke-interface {p1, p2}, Lcom/tv91/y/e;->d(I)V

    return-object v0

    .line 9
    :cond_0
    new-instance p1, Lcom/tv91/s/e;

    sget-object p2, Lcom/tv91/s/d;->b:Lcom/tv91/s/d;

    invoke-direct {p1, p2}, Lcom/tv91/s/e;-><init>(Lcom/tv91/s/d;)V

    throw p1

    .line 10
    :cond_1
    new-instance p1, Lcom/tv91/s/e;

    sget-object p2, Lcom/tv91/s/d;->c:Lcom/tv91/s/d;

    invoke-direct {p1, p2}, Lcom/tv91/s/e;-><init>(Lcom/tv91/s/d;)V

    throw p1

    .line 11
    :cond_2
    new-instance p1, Lcom/tv91/s/e;

    sget-object p2, Lcom/tv91/s/d;->a:Lcom/tv91/s/d;

    invoke-direct {p1, p2}, Lcom/tv91/s/e;-><init>(Lcom/tv91/s/d;)V

    throw p1
.end method

.method public synthetic r(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/features/authentication/q/x;->q(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public synthetic t(Lcom/tv91/q/b/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/q/x;->s(Lcom/tv91/q/b/f;)V

    return-void
.end method

.method public u(Lb/g/j/a;)Lcom/tv91/features/authentication/q/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/s/c;",
            ">;)",
            "Lcom/tv91/features/authentication/q/x;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/q/b/d;->e:Lb/g/j/a;

    return-object p0
.end method

.method public v(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/x;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/q/b/d;->c:Ljava/lang/Runnable;

    return-object p0
.end method

.method public w(Lb/g/j/a;)Lcom/tv91/features/authentication/q/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/User;",
            ">;)",
            "Lcom/tv91/features/authentication/q/x;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/features/authentication/q/x;->l:Lb/g/j/a;

    return-object p0
.end method
