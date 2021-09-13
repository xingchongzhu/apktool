.class public final Lcom/tv91/u/g/f0/k;
.super Lcom/tv91/q/b/d;
.source "GetUrlUseCase.java"


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

.field private k:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Lcom/tv91/model/Url;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Lcom/tv91/q/b/e;


# direct methods
.method public constructor <init>(Lcom/tv91/t/b;Lcom/tv91/z/b;Lcom/tv91/y/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/q/b/d;-><init>(Lcom/tv91/t/b;)V

    .line 2
    invoke-static {}, Lcom/tv91/q/b/d;->b()Lb/g/j/a;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/g/f0/k;->k:Lb/g/j/a;

    .line 3
    new-instance p1, Lcom/tv91/u/g/f0/e;

    invoke-direct {p1, p0}, Lcom/tv91/u/g/f0/e;-><init>(Lcom/tv91/u/g/f0/k;)V

    iput-object p1, p0, Lcom/tv91/u/g/f0/k;->l:Lcom/tv91/q/b/e;

    .line 4
    iput-object p2, p0, Lcom/tv91/u/g/f0/k;->i:Lcom/tv91/z/b;

    .line 5
    iput-object p3, p0, Lcom/tv91/u/g/f0/k;->j:Lcom/tv91/y/e;

    return-void
.end method

.method private o(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method

.method private synthetic r(Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lcom/tv91/q/b/f$c;

    invoke-direct {v0}, Lcom/tv91/q/b/f$c;-><init>()V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->i(Lcom/tv91/q/b/f;)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/tv91/u/g/f0/k;->q(Ljava/lang/String;)Lcom/tv91/model/Url;

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

.method private synthetic t(Lcom/tv91/q/b/f;)V
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
    iget-object v0, p0, Lcom/tv91/u/g/f0/k;->k:Lb/g/j/a;

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
.method public p(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/g/f0/k;->l:Lcom/tv91/q/b/e;

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    .line 2
    new-instance v0, Lcom/tv91/u/g/f0/f;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/g/f0/f;-><init>(Lcom/tv91/u/g/f0/k;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->j(Ljava/lang/Runnable;)V

    return-void
.end method

.method public q(Ljava/lang/String;)Lcom/tv91/model/Url;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/g/f0/k;->i:Lcom/tv91/z/b;

    invoke-interface {v0, p1}, Lcom/tv91/z/b;->X(Ljava/lang/String;)Lcom/tv91/model/Url;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 2
    iget-object v0, p1, Lcom/tv91/model/Url;->apiUrl:Ljava/lang/String;

    invoke-static {v0}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p1, Lcom/tv91/model/Url;->webUrl:Ljava/lang/String;

    invoke-static {v0}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    new-instance v0, Lcom/tv91/model/Url;

    iget-object v1, p1, Lcom/tv91/model/Url;->apiUrl:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/tv91/u/g/f0/k;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    iget-object v1, p1, Lcom/tv91/model/Url;->webUrl:Ljava/lang/String;

    .line 4
    invoke-direct {p0, v1}, Lcom/tv91/u/g/f0/k;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    iget-object v1, p1, Lcom/tv91/model/Url;->novelUrl:Ljava/lang/String;

    .line 5
    invoke-static {v1}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    iget-object v1, p1, Lcom/tv91/model/Url;->novelUrl:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/tv91/u/g/f0/k;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    :goto_0
    move-object v4, v1

    iget-object v1, p1, Lcom/tv91/model/Url;->apiUrl2:Ljava/lang/String;

    .line 6
    invoke-direct {p0, v1}, Lcom/tv91/u/g/f0/k;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object p1, p1, Lcom/tv91/model/Url;->reportUrl:Ljava/lang/String;

    .line 7
    invoke-direct {p0, p1}, Lcom/tv91/u/g/f0/k;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/tv91/model/Url;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lcom/tv91/u/g/f0/k;->j:Lcom/tv91/y/e;

    iget-object v1, v0, Lcom/tv91/model/Url;->webUrl:Ljava/lang/String;

    invoke-interface {p1, v1}, Lcom/tv91/y/e;->b(Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Lcom/tv91/u/g/f0/k;->j:Lcom/tv91/y/e;

    iget-object v1, v0, Lcom/tv91/model/Url;->novelUrl:Ljava/lang/String;

    invoke-interface {p1, v1}, Lcom/tv91/y/e;->a(Ljava/lang/String;)V

    return-object v0

    .line 10
    :cond_1
    new-instance p1, Lcom/tv91/s/f;

    const-string v0, "url or url.apiUrl or url.webUrl is empty"

    invoke-direct {p1, v0}, Lcom/tv91/s/f;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic s(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/g/f0/k;->r(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic u(Lcom/tv91/q/b/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/g/f0/k;->t(Lcom/tv91/q/b/f;)V

    return-void
.end method

.method public v(Lb/g/j/a;)Lcom/tv91/u/g/f0/k;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/s/c;",
            ">;)",
            "Lcom/tv91/u/g/f0/k;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/q/b/d;->e:Lb/g/j/a;

    return-object p0
.end method

.method public w(Ljava/lang/Runnable;)Lcom/tv91/u/g/f0/k;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/q/b/d;->d:Ljava/lang/Runnable;

    return-object p0
.end method

.method public x(Lb/g/j/a;)Lcom/tv91/u/g/f0/k;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/Url;",
            ">;)",
            "Lcom/tv91/u/g/f0/k;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/u/g/f0/k;->k:Lb/g/j/a;

    return-object p0
.end method
