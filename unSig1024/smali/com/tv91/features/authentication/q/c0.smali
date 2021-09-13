.class public final Lcom/tv91/features/authentication/q/c0;
.super Lcom/tv91/q/b/d;
.source "RegisterUseCase.java"


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

.field private final j:Lcom/tv91/y/e;

.field private k:Ljava/lang/Runnable;

.field private final l:Lcom/tv91/q/b/e;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/tv91/t/b;Lcom/tv91/z/b;Lcom/tv91/y/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/q/b/d;-><init>(Lcom/tv91/t/b;)V

    .line 2
    invoke-static {}, Lcom/tv91/q/b/d;->c()Ljava/lang/Runnable;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/features/authentication/q/c0;->k:Ljava/lang/Runnable;

    .line 3
    new-instance p1, Lcom/tv91/features/authentication/q/m;

    invoke-direct {p1, p0}, Lcom/tv91/features/authentication/q/m;-><init>(Lcom/tv91/features/authentication/q/c0;)V

    iput-object p1, p0, Lcom/tv91/features/authentication/q/c0;->l:Lcom/tv91/q/b/e;

    .line 4
    iput-object p2, p0, Lcom/tv91/features/authentication/q/c0;->i:Lcom/tv91/z/b;

    .line 5
    iput-object p3, p0, Lcom/tv91/features/authentication/q/c0;->j:Lcom/tv91/y/e;

    return-void
.end method

.method private o(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2
    invoke-static {p1}, Lcom/tv91/utils/g;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/tv91/features/authentication/q/c0;->m:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/tv91/utils/g;->b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/tv91/features/authentication/q/c0;->m:Ljava/lang/String;

    return-void

    .line 5
    :cond_0
    new-instance p1, Lcom/tv91/s/e;

    sget-object v0, Lcom/tv91/s/d;->i:Lcom/tv91/s/d;

    invoke-direct {p1, v0}, Lcom/tv91/s/e;-><init>(Lcom/tv91/s/d;)V

    throw p1

    .line 6
    :cond_1
    new-instance p1, Lcom/tv91/s/e;

    sget-object v0, Lcom/tv91/s/d;->b:Lcom/tv91/s/d;

    invoke-direct {p1, v0}, Lcom/tv91/s/e;-><init>(Lcom/tv91/s/d;)V

    throw p1

    .line 7
    :cond_2
    new-instance p1, Lcom/tv91/s/e;

    sget-object v0, Lcom/tv91/s/d;->a:Lcom/tv91/s/d;

    invoke-direct {p1, v0}, Lcom/tv91/s/e;-><init>(Lcom/tv91/s/d;)V

    throw p1
.end method

.method private p(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/q/c0;->n:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/tv91/utils/g;->b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/tv91/features/authentication/q/c0;->n:Ljava/lang/String;

    return-void

    .line 4
    :cond_0
    new-instance p1, Lcom/tv91/s/e;

    sget-object v0, Lcom/tv91/s/d;->k:Lcom/tv91/s/d;

    invoke-direct {p1, v0}, Lcom/tv91/s/e;-><init>(Lcom/tv91/s/d;)V

    throw p1

    .line 5
    :cond_1
    new-instance p1, Lcom/tv91/s/e;

    sget-object v0, Lcom/tv91/s/d;->j:Lcom/tv91/s/d;

    invoke-direct {p1, v0}, Lcom/tv91/s/e;-><init>(Lcom/tv91/s/d;)V

    throw p1
.end method

.method private q(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

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

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 4
    :cond_0
    new-instance p1, Lcom/tv91/s/e;

    sget-object p2, Lcom/tv91/s/d;->h:Lcom/tv91/s/d;

    invoke-direct {p1, p2}, Lcom/tv91/s/e;-><init>(Lcom/tv91/s/d;)V

    throw p1

    .line 5
    :cond_1
    new-instance p1, Lcom/tv91/s/e;

    sget-object p2, Lcom/tv91/s/d;->g:Lcom/tv91/s/d;

    invoke-direct {p1, p2}, Lcom/tv91/s/e;-><init>(Lcom/tv91/s/d;)V

    throw p1

    .line 6
    :cond_2
    new-instance p1, Lcom/tv91/s/e;

    sget-object p2, Lcom/tv91/s/d;->c:Lcom/tv91/s/d;

    invoke-direct {p1, p2}, Lcom/tv91/s/e;-><init>(Lcom/tv91/s/d;)V

    throw p1
.end method

.method private synthetic t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/tv91/q/b/f$c;

    invoke-direct {v0}, Lcom/tv91/q/b/f$c;-><init>()V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    .line 2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/tv91/features/authentication/q/c0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    new-instance p3, Lcom/tv91/q/b/f$d;

    invoke-direct {p3}, Lcom/tv91/q/b/f$d;-><init>()V

    invoke-virtual {p0, p3}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    new-instance p1, Lcom/tv91/q/b/f$b;

    invoke-direct {p1}, Lcom/tv91/q/b/f$b;-><init>()V

    :goto_0
    invoke-virtual {p0, p1}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p3

    .line 5
    :try_start_1
    new-instance p4, Lcom/tv91/s/c;

    invoke-direct {p4, p3}, Lcom/tv91/s/c;-><init>(Ljava/lang/Exception;)V

    const-string p3, "A000002"

    .line 6
    invoke-virtual {p4}, Lcom/tv91/s/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/tv91/utils/g;->b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 7
    iput-object p1, p0, Lcom/tv91/features/authentication/q/c0;->m:Ljava/lang/String;

    .line 8
    new-instance p1, Lcom/tv91/s/e;

    sget-object p2, Lcom/tv91/s/d;->i:Lcom/tv91/s/d;

    invoke-direct {p1, p2}, Lcom/tv91/s/e;-><init>(Lcom/tv91/s/d;)V

    .line 9
    new-instance p2, Lcom/tv91/q/b/f$a;

    new-instance p3, Lcom/tv91/s/c;

    invoke-direct {p3, p1}, Lcom/tv91/s/c;-><init>(Ljava/lang/Exception;)V

    invoke-direct {p2, p3}, Lcom/tv91/q/b/f$a;-><init>(Lcom/tv91/s/c;)V

    invoke-virtual {p0, p2}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    goto :goto_1

    :cond_0
    const-string p1, "A000003"

    .line 10
    invoke-virtual {p4}, Lcom/tv91/s/c;->a()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p3}, Lcom/tv91/utils/g;->b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 11
    iput-object p2, p0, Lcom/tv91/features/authentication/q/c0;->n:Ljava/lang/String;

    .line 12
    new-instance p1, Lcom/tv91/s/e;

    sget-object p2, Lcom/tv91/s/d;->k:Lcom/tv91/s/d;

    invoke-direct {p1, p2}, Lcom/tv91/s/e;-><init>(Lcom/tv91/s/d;)V

    .line 13
    new-instance p2, Lcom/tv91/q/b/f$a;

    new-instance p3, Lcom/tv91/s/c;

    invoke-direct {p3, p1}, Lcom/tv91/s/c;-><init>(Ljava/lang/Exception;)V

    invoke-direct {p2, p3}, Lcom/tv91/q/b/f$a;-><init>(Lcom/tv91/s/c;)V

    invoke-virtual {p0, p2}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    goto :goto_1

    .line 14
    :cond_1
    new-instance p1, Lcom/tv91/q/b/f$a;

    invoke-direct {p1, p4}, Lcom/tv91/q/b/f$a;-><init>(Lcom/tv91/s/c;)V

    invoke-virtual {p0, p1}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    :goto_1
    new-instance p1, Lcom/tv91/q/b/f$b;

    invoke-direct {p1}, Lcom/tv91/q/b/f$b;-><init>()V

    goto :goto_0

    :goto_2
    return-void

    :goto_3
    new-instance p2, Lcom/tv91/q/b/f$b;

    invoke-direct {p2}, Lcom/tv91/q/b/f$b;-><init>()V

    invoke-virtual {p0, p2}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    .line 16
    goto :goto_5

    :goto_4
    throw p1

    :goto_5
    goto :goto_4
.end method

.method private synthetic v(Lcom/tv91/q/b/f;)V
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
    iget-object p1, p0, Lcom/tv91/features/authentication/q/c0;->k:Ljava/lang/Runnable;

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
.method public r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/q/c0;->l:Lcom/tv91/q/b/e;

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    .line 2
    new-instance v0, Lcom/tv91/features/authentication/q/n;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/tv91/features/authentication/q/n;-><init>(Lcom/tv91/features/authentication/q/c0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->j(Ljava/lang/Runnable;)V

    return-void
.end method

.method public s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/q/c0;->o(Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p2}, Lcom/tv91/features/authentication/q/c0;->p(Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p3, p4}, Lcom/tv91/features/authentication/q/c0;->q(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/features/authentication/q/c0;->i:Lcom/tv91/z/b;

    iget-object p4, p0, Lcom/tv91/features/authentication/q/c0;->j:Lcom/tv91/y/e;

    invoke-interface {p4}, Lcom/tv91/y/e;->c()I

    move-result v1

    const/4 v2, 0x0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-interface/range {v0 .. v5}, Lcom/tv91/z/b;->u(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tv91/features/authentication/q/c0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic w(Lcom/tv91/q/b/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/authentication/q/c0;->v(Lcom/tv91/q/b/f;)V

    return-void
.end method

.method public x(Lb/g/j/a;)Lcom/tv91/features/authentication/q/c0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/s/c;",
            ">;)",
            "Lcom/tv91/features/authentication/q/c0;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/q/b/d;->e:Lb/g/j/a;

    return-object p0
.end method

.method public y(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/c0;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/q/b/d;->c:Ljava/lang/Runnable;

    return-object p0
.end method

.method public z(Ljava/lang/Runnable;)Lcom/tv91/features/authentication/q/c0;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/features/authentication/q/c0;->k:Ljava/lang/Runnable;

    return-object p0
.end method
