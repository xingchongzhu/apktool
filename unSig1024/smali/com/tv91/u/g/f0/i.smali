.class public final Lcom/tv91/u/g/f0/i;
.super Lcom/tv91/q/b/d;
.source "CheckUpdateUseCase.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/g/f0/i$a;
    }
.end annotation

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
            "Lcom/tv91/model/Version;",
            ">;"
        }
    .end annotation
.end field

.field private k:Ljava/lang/Runnable;

.field private final l:Lcom/tv91/q/b/e;


# direct methods
.method public constructor <init>(Lcom/tv91/t/b;Lcom/tv91/z/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/q/b/d;-><init>(Lcom/tv91/t/b;)V

    .line 2
    invoke-static {}, Lcom/tv91/q/b/d;->b()Lb/g/j/a;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/g/f0/i;->j:Lb/g/j/a;

    .line 3
    invoke-static {}, Lcom/tv91/q/b/d;->c()Ljava/lang/Runnable;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/g/f0/i;->k:Ljava/lang/Runnable;

    .line 4
    new-instance p1, Lcom/tv91/u/g/f0/b;

    invoke-direct {p1, p0}, Lcom/tv91/u/g/f0/b;-><init>(Lcom/tv91/u/g/f0/i;)V

    iput-object p1, p0, Lcom/tv91/u/g/f0/i;->l:Lcom/tv91/q/b/e;

    .line 5
    iput-object p2, p0, Lcom/tv91/u/g/f0/i;->i:Lcom/tv91/z/b;

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
    invoke-virtual {p0, p1}, Lcom/tv91/u/g/f0/i;->p(Ljava/lang/String;)Lcom/tv91/model/Version;

    move-result-object p1

    .line 3
    iget-object v0, p1, Lcom/tv91/model/Version;->version:Ljava/lang/String;

    invoke-static {p2, v0}, Lcom/tv91/utils/g;->b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 4
    new-instance p1, Lcom/tv91/u/g/f0/i$a;

    invoke-direct {p1}, Lcom/tv91/u/g/f0/i$a;-><init>()V

    invoke-virtual {p0, p1}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    goto :goto_0

    .line 5
    :cond_0
    new-instance p2, Lcom/tv91/q/b/f$d;

    invoke-direct {p2, p1}, Lcom/tv91/q/b/f$d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    :goto_0
    new-instance p1, Lcom/tv91/q/b/f$b;

    invoke-direct {p1}, Lcom/tv91/q/b/f$b;-><init>()V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 7
    :try_start_1
    new-instance p2, Lcom/tv91/q/b/f$a;

    new-instance v0, Lcom/tv91/s/c;

    invoke-direct {v0, p1}, Lcom/tv91/s/c;-><init>(Ljava/lang/Exception;)V

    invoke-direct {p2, v0}, Lcom/tv91/q/b/f$a;-><init>(Lcom/tv91/s/c;)V

    invoke-virtual {p0, p2}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    new-instance p1, Lcom/tv91/q/b/f$b;

    invoke-direct {p1}, Lcom/tv91/q/b/f$b;-><init>()V

    :goto_1
    invoke-virtual {p0, p1}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    return-void

    :goto_2
    new-instance p2, Lcom/tv91/q/b/f$b;

    invoke-direct {p2}, Lcom/tv91/q/b/f$b;-><init>()V

    invoke-virtual {p0, p2}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    .line 9
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
    iget-object v0, p0, Lcom/tv91/u/g/f0/i;->j:Lb/g/j/a;

    check-cast p1, Lcom/tv91/q/b/f$d;

    iget-object p1, p1, Lcom/tv91/q/b/f$d;->a:Ljava/lang/Object;

    invoke-interface {v0, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 7
    :cond_2
    instance-of v0, p1, Lcom/tv91/u/g/f0/i$a;

    if-eqz v0, :cond_3

    .line 8
    iget-object p1, p0, Lcom/tv91/u/g/f0/i;->k:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 9
    :cond_3
    instance-of v0, p1, Lcom/tv91/q/b/f$a;

    if-eqz v0, :cond_4

    .line 10
    iget-object v0, p0, Lcom/tv91/q/b/d;->e:Lb/g/j/a;

    check-cast p1, Lcom/tv91/q/b/f$a;

    iget-object p1, p1, Lcom/tv91/q/b/f$a;->a:Lcom/tv91/s/c;

    invoke-interface {v0, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public o(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/g/f0/i;->l:Lcom/tv91/q/b/e;

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    .line 2
    new-instance v0, Lcom/tv91/u/g/f0/a;

    invoke-direct {v0, p0, p1, p2}, Lcom/tv91/u/g/f0/a;-><init>(Lcom/tv91/u/g/f0/i;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->j(Ljava/lang/Runnable;)V

    return-void
.end method

.method public p(Ljava/lang/String;)Lcom/tv91/model/Version;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/g/f0/i;->i:Lcom/tv91/z/b;

    invoke-interface {v0, p1}, Lcom/tv91/z/b;->f(Ljava/lang/String;)Lcom/tv91/model/Version;

    move-result-object p1

    return-object p1
.end method

.method public synthetic r(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/g/f0/i;->q(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic t(Lcom/tv91/q/b/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/g/f0/i;->s(Lcom/tv91/q/b/f;)V

    return-void
.end method

.method public u(Lb/g/j/a;)Lcom/tv91/u/g/f0/i;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/s/c;",
            ">;)",
            "Lcom/tv91/u/g/f0/i;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/q/b/d;->e:Lb/g/j/a;

    return-object p0
.end method

.method public v(Ljava/lang/Runnable;)Lcom/tv91/u/g/f0/i;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/q/b/d;->c:Ljava/lang/Runnable;

    return-object p0
.end method

.method public w(Ljava/lang/Runnable;)Lcom/tv91/u/g/f0/i;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/g/f0/i;->k:Ljava/lang/Runnable;

    return-object p0
.end method

.method public x(Lb/g/j/a;)Lcom/tv91/u/g/f0/i;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/Version;",
            ">;)",
            "Lcom/tv91/u/g/f0/i;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/u/g/f0/i;->j:Lb/g/j/a;

    return-object p0
.end method
