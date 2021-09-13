.class public final Lcom/tv91/u/g/f0/l;
.super Lcom/tv91/q/b/d;
.source "ReportServerDownUseCase.java"


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

.field private j:Ljava/lang/Runnable;

.field private final k:Lcom/tv91/q/b/e;


# direct methods
.method public constructor <init>(Lcom/tv91/t/b;Lcom/tv91/z/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/q/b/d;-><init>(Lcom/tv91/t/b;)V

    .line 2
    invoke-static {}, Lcom/tv91/q/b/d;->c()Ljava/lang/Runnable;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/g/f0/l;->j:Ljava/lang/Runnable;

    .line 3
    new-instance p1, Lcom/tv91/u/g/f0/g;

    invoke-direct {p1, p0}, Lcom/tv91/u/g/f0/g;-><init>(Lcom/tv91/u/g/f0/l;)V

    iput-object p1, p0, Lcom/tv91/u/g/f0/l;->k:Lcom/tv91/q/b/e;

    .line 4
    iput-object p2, p0, Lcom/tv91/u/g/f0/l;->i:Lcom/tv91/z/b;

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
    invoke-virtual {p0, p1, p2}, Lcom/tv91/u/g/f0/l;->p(Ljava/lang/String;Ljava/lang/String;)V

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
    iget-object p1, p0, Lcom/tv91/u/g/f0/l;->j:Ljava/lang/Runnable;

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
    iget-object v0, p0, Lcom/tv91/u/g/f0/l;->k:Lcom/tv91/q/b/e;

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    .line 2
    new-instance v0, Lcom/tv91/u/g/f0/h;

    invoke-direct {v0, p0, p1, p2}, Lcom/tv91/u/g/f0/h;-><init>(Lcom/tv91/u/g/f0/l;Ljava/lang/String;Ljava/lang/String;)V

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

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    .line 1
    invoke-static {}, Lcom/tv91/utils/h;->b()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x1

    aput-object p2, v0, v1

    .line 2
    invoke-static {}, Lcom/tv91/utils/h;->a()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x2

    aput-object p2, v0, v1

    .line 3
    invoke-static {}, Lcom/tv91/utils/h;->e()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x3

    aput-object p2, v0, v1

    const/4 p2, 0x4

    const-string v1, "3.3"

    aput-object v1, v0, p2

    const-string p2, "%s:%s:%s:%s:%s:failed"

    .line 4
    invoke-static {p2, v0}, Lcom/tv91/utils/g;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 5
    iget-object v0, p0, Lcom/tv91/u/g/f0/l;->i:Lcom/tv91/z/b;

    invoke-interface {v0, p1, p2}, Lcom/tv91/z/b;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic r(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/g/f0/l;->q(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic t(Lcom/tv91/q/b/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/g/f0/l;->s(Lcom/tv91/q/b/f;)V

    return-void
.end method
