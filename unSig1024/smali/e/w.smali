.class public Le/w;
.super Ljava/lang/Object;
.source "OkHttpClient.java"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/w$b;
    }
.end annotation


# static fields
.field static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/x;",
            ">;"
        }
    .end annotation
.end field

.field static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/k;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final A:I

.field final B:I

.field final C:I

.field final D:I

.field final c:Le/n;

.field final d:Ljava/net/Proxy;

.field final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/x;",
            ">;"
        }
    .end annotation
.end field

.field final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/k;",
            ">;"
        }
    .end annotation
.end field

.field final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/u;",
            ">;"
        }
    .end annotation
.end field

.field final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/u;",
            ">;"
        }
    .end annotation
.end field

.field final i:Le/p$c;

.field final j:Ljava/net/ProxySelector;

.field final k:Le/m;

.field final l:Le/c;

.field final m:Le/f0/e/d;

.field final n:Ljavax/net/SocketFactory;

.field final o:Ljavax/net/ssl/SSLSocketFactory;

.field final p:Le/f0/l/c;

.field final q:Ljavax/net/ssl/HostnameVerifier;

.field final r:Le/g;

.field final s:Le/b;

.field final t:Le/b;

.field final u:Le/j;

.field final v:Le/o;

.field final w:Z

.field final x:Z

.field final y:Z

.field final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x2

    new-array v1, v0, [Le/x;

    .line 1
    sget-object v2, Le/x;->d:Le/x;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Le/x;->b:Le/x;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-static {v1}, Le/f0/c;->t([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Le/w;->a:Ljava/util/List;

    new-array v0, v0, [Le/k;

    .line 2
    sget-object v1, Le/k;->d:Le/k;

    aput-object v1, v0, v3

    sget-object v1, Le/k;->f:Le/k;

    aput-object v1, v0, v4

    invoke-static {v0}, Le/f0/c;->t([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Le/w;->b:Ljava/util/List;

    .line 3
    new-instance v0, Le/w$a;

    invoke-direct {v0}, Le/w$a;-><init>()V

    sput-object v0, Le/f0/a;->a:Le/f0/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Le/w$b;

    invoke-direct {v0}, Le/w$b;-><init>()V

    invoke-direct {p0, v0}, Le/w;-><init>(Le/w$b;)V

    return-void
.end method

.method constructor <init>(Le/w$b;)V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iget-object v0, p1, Le/w$b;->a:Le/n;

    iput-object v0, p0, Le/w;->c:Le/n;

    .line 4
    iget-object v0, p1, Le/w$b;->b:Ljava/net/Proxy;

    iput-object v0, p0, Le/w;->d:Ljava/net/Proxy;

    .line 5
    iget-object v0, p1, Le/w$b;->c:Ljava/util/List;

    iput-object v0, p0, Le/w;->e:Ljava/util/List;

    .line 6
    iget-object v0, p1, Le/w$b;->d:Ljava/util/List;

    iput-object v0, p0, Le/w;->f:Ljava/util/List;

    .line 7
    iget-object v1, p1, Le/w$b;->e:Ljava/util/List;

    invoke-static {v1}, Le/f0/c;->s(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Le/w;->g:Ljava/util/List;

    .line 8
    iget-object v1, p1, Le/w$b;->f:Ljava/util/List;

    invoke-static {v1}, Le/f0/c;->s(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Le/w;->h:Ljava/util/List;

    .line 9
    iget-object v1, p1, Le/w$b;->g:Le/p$c;

    iput-object v1, p0, Le/w;->i:Le/p$c;

    .line 10
    iget-object v1, p1, Le/w$b;->h:Ljava/net/ProxySelector;

    iput-object v1, p0, Le/w;->j:Ljava/net/ProxySelector;

    .line 11
    iget-object v1, p1, Le/w$b;->i:Le/m;

    iput-object v1, p0, Le/w;->k:Le/m;

    .line 12
    iget-object v1, p1, Le/w$b;->j:Le/f0/e/d;

    iput-object v1, p0, Le/w;->m:Le/f0/e/d;

    .line 13
    iget-object v1, p1, Le/w$b;->k:Ljavax/net/SocketFactory;

    iput-object v1, p0, Le/w;->n:Ljavax/net/SocketFactory;

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/k;

    if-nez v2, :cond_1

    .line 15
    invoke-virtual {v3}, Le/k;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    .line 16
    :cond_2
    iget-object v0, p1, Le/w$b;->l:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v0, :cond_4

    if-nez v2, :cond_3

    goto :goto_1

    .line 17
    :cond_3
    invoke-static {}, Le/f0/c;->B()Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    .line 18
    invoke-static {v0}, Le/w;->r(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    iput-object v1, p0, Le/w;->o:Ljavax/net/ssl/SSLSocketFactory;

    .line 19
    invoke-static {v0}, Le/f0/l/c;->b(Ljavax/net/ssl/X509TrustManager;)Le/f0/l/c;

    move-result-object v0

    iput-object v0, p0, Le/w;->p:Le/f0/l/c;

    goto :goto_2

    .line 20
    :cond_4
    :goto_1
    iput-object v0, p0, Le/w;->o:Ljavax/net/ssl/SSLSocketFactory;

    .line 21
    iget-object v0, p1, Le/w$b;->m:Le/f0/l/c;

    iput-object v0, p0, Le/w;->p:Le/f0/l/c;

    .line 22
    :goto_2
    iget-object v0, p0, Le/w;->o:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_5

    .line 23
    invoke-static {}, Le/f0/j/g;->l()Le/f0/j/g;

    move-result-object v0

    iget-object v1, p0, Le/w;->o:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, v1}, Le/f0/j/g;->f(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 24
    :cond_5
    iget-object v0, p1, Le/w$b;->n:Ljavax/net/ssl/HostnameVerifier;

    iput-object v0, p0, Le/w;->q:Ljavax/net/ssl/HostnameVerifier;

    .line 25
    iget-object v0, p1, Le/w$b;->o:Le/g;

    iget-object v1, p0, Le/w;->p:Le/f0/l/c;

    invoke-virtual {v0, v1}, Le/g;->f(Le/f0/l/c;)Le/g;

    move-result-object v0

    iput-object v0, p0, Le/w;->r:Le/g;

    .line 26
    iget-object v0, p1, Le/w$b;->p:Le/b;

    iput-object v0, p0, Le/w;->s:Le/b;

    .line 27
    iget-object v0, p1, Le/w$b;->q:Le/b;

    iput-object v0, p0, Le/w;->t:Le/b;

    .line 28
    iget-object v0, p1, Le/w$b;->r:Le/j;

    iput-object v0, p0, Le/w;->u:Le/j;

    .line 29
    iget-object v0, p1, Le/w$b;->s:Le/o;

    iput-object v0, p0, Le/w;->v:Le/o;

    .line 30
    iget-boolean v0, p1, Le/w$b;->t:Z

    iput-boolean v0, p0, Le/w;->w:Z

    .line 31
    iget-boolean v0, p1, Le/w$b;->u:Z

    iput-boolean v0, p0, Le/w;->x:Z

    .line 32
    iget-boolean v0, p1, Le/w$b;->v:Z

    iput-boolean v0, p0, Le/w;->y:Z

    .line 33
    iget v0, p1, Le/w$b;->w:I

    iput v0, p0, Le/w;->z:I

    .line 34
    iget v0, p1, Le/w$b;->x:I

    iput v0, p0, Le/w;->A:I

    .line 35
    iget v0, p1, Le/w$b;->y:I

    iput v0, p0, Le/w;->B:I

    .line 36
    iget v0, p1, Le/w$b;->z:I

    iput v0, p0, Le/w;->C:I

    .line 37
    iget p1, p1, Le/w$b;->A:I

    iput p1, p0, Le/w;->D:I

    .line 38
    iget-object p1, p0, Le/w;->g:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 39
    iget-object p1, p0, Le/w;->h:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return-void

    .line 40
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Null network interceptor: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/w;->h:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 41
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Null interceptor: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/w;->g:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method

.method private static r(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Le/f0/j/g;->l()Le/f0/j/g;

    move-result-object v0

    invoke-virtual {v0}, Le/f0/j/g;->m()Ljavax/net/ssl/SSLContext;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljavax/net/ssl/TrustManager;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x0

    .line 2
    invoke-virtual {v0, p0, v1, p0}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 3
    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string v0, "No System TLS"

    .line 4
    invoke-static {v0, p0}, Le/f0/c;->b(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public A()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Le/w;->o:Ljavax/net/ssl/SSLSocketFactory;

    return-object v0
.end method

.method public B()I
    .locals 1

    .line 1
    iget v0, p0, Le/w;->C:I

    return v0
.end method

.method public a()Le/b;
    .locals 1

    .line 1
    iget-object v0, p0, Le/w;->t:Le/b;

    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Le/w;->z:I

    return v0
.end method

.method public c()Le/g;
    .locals 1

    .line 1
    iget-object v0, p0, Le/w;->r:Le/g;

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Le/w;->A:I

    return v0
.end method

.method public e()Le/j;
    .locals 1

    .line 1
    iget-object v0, p0, Le/w;->u:Le/j;

    return-object v0
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le/k;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/w;->f:Ljava/util/List;

    return-object v0
.end method

.method public g()Le/m;
    .locals 1

    .line 1
    iget-object v0, p0, Le/w;->k:Le/m;

    return-object v0
.end method

.method public h()Le/n;
    .locals 1

    .line 1
    iget-object v0, p0, Le/w;->c:Le/n;

    return-object v0
.end method

.method public i()Le/o;
    .locals 1

    .line 1
    iget-object v0, p0, Le/w;->v:Le/o;

    return-object v0
.end method

.method public j()Le/p$c;
    .locals 1

    .line 1
    iget-object v0, p0, Le/w;->i:Le/p$c;

    return-object v0
.end method

.method public k()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/w;->x:Z

    return v0
.end method

.method public l()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/w;->w:Z

    return v0
.end method

.method public m()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 1
    iget-object v0, p0, Le/w;->q:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method public n()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le/u;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/w;->g:Ljava/util/List;

    return-object v0
.end method

.method o()Le/f0/e/d;
    .locals 1

    .line 1
    iget-object v0, p0, Le/w;->l:Le/c;

    if-nez v0, :cond_0

    iget-object v0, p0, Le/w;->m:Le/f0/e/d;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    throw v0
.end method

.method public p()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le/u;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/w;->h:Ljava/util/List;

    return-object v0
.end method

.method public q(Le/z;)Le/e;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, p1, v0}, Le/y;->e(Le/w;Le/z;Z)Le/y;

    move-result-object p1

    return-object p1
.end method

.method public s()I
    .locals 1

    .line 1
    iget v0, p0, Le/w;->D:I

    return v0
.end method

.method public t()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le/x;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/w;->e:Ljava/util/List;

    return-object v0
.end method

.method public u()Ljava/net/Proxy;
    .locals 1

    .line 1
    iget-object v0, p0, Le/w;->d:Ljava/net/Proxy;

    return-object v0
.end method

.method public v()Le/b;
    .locals 1

    .line 1
    iget-object v0, p0, Le/w;->s:Le/b;

    return-object v0
.end method

.method public w()Ljava/net/ProxySelector;
    .locals 1

    .line 1
    iget-object v0, p0, Le/w;->j:Ljava/net/ProxySelector;

    return-object v0
.end method

.method public x()I
    .locals 1

    .line 1
    iget v0, p0, Le/w;->B:I

    return v0
.end method

.method public y()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/w;->y:Z

    return v0
.end method

.method public z()Ljavax/net/SocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Le/w;->n:Ljavax/net/SocketFactory;

    return-object v0
.end method
