.class public final Le/f0/f/c;
.super Le/f0/i/g$j;
.source "RealConnection.java"

# interfaces
.implements Le/i;


# instance fields
.field private final b:Le/j;

.field private final c:Le/d0;

.field private d:Ljava/net/Socket;

.field private e:Ljava/net/Socket;

.field private f:Le/r;

.field private g:Le/x;

.field private h:Le/f0/i/g;

.field private i:Lf/e;

.field private j:Lf/d;

.field public k:Z

.field public l:I

.field public m:I

.field public final n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/Reference<",
            "Le/f0/f/g;",
            ">;>;"
        }
    .end annotation
.end field

.field public o:J


# direct methods
.method public constructor <init>(Le/j;Le/d0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Le/f0/i/g$j;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Le/f0/f/c;->m:I

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/f0/f/c;->n:Ljava/util/List;

    const-wide v0, 0x7fffffffffffffffL

    .line 4
    iput-wide v0, p0, Le/f0/f/c;->o:J

    .line 5
    iput-object p1, p0, Le/f0/f/c;->b:Le/j;

    .line 6
    iput-object p2, p0, Le/f0/f/c;->c:Le/d0;

    return-void
.end method

.method private e(IILe/e;Le/p;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v0}, Le/d0;->b()Ljava/net/Proxy;

    move-result-object v0

    .line 2
    iget-object v1, p0, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v1}, Le/d0;->a()Le/a;

    move-result-object v1

    .line 3
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    sget-object v3, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v2, v3, :cond_1

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v2, v3, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    new-instance v1, Ljava/net/Socket;

    invoke-direct {v1, v0}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    goto :goto_1

    .line 5
    :cond_1
    :goto_0
    invoke-virtual {v1}, Le/a;->j()Ljavax/net/SocketFactory;

    move-result-object v1

    invoke-virtual {v1}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v1

    .line 6
    :goto_1
    iput-object v1, p0, Le/f0/f/c;->d:Ljava/net/Socket;

    .line 7
    iget-object v1, p0, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v1}, Le/d0;->d()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {p4, p3, v1, v0}, Le/p;->f(Le/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V

    .line 8
    iget-object p3, p0, Le/f0/f/c;->d:Ljava/net/Socket;

    invoke-virtual {p3, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 9
    :try_start_0
    invoke-static {}, Le/f0/j/g;->l()Le/f0/j/g;

    move-result-object p2

    iget-object p3, p0, Le/f0/f/c;->d:Ljava/net/Socket;

    iget-object p4, p0, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {p4}, Le/d0;->d()Ljava/net/InetSocketAddress;

    move-result-object p4

    invoke-virtual {p2, p3, p4, p1}, Le/f0/j/g;->h(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    .line 10
    :try_start_1
    iget-object p1, p0, Le/f0/f/c;->d:Ljava/net/Socket;

    invoke-static {p1}, Lf/l;->k(Ljava/net/Socket;)Lf/s;

    move-result-object p1

    invoke-static {p1}, Lf/l;->c(Lf/s;)Lf/e;

    move-result-object p1

    iput-object p1, p0, Le/f0/f/c;->i:Lf/e;

    .line 11
    iget-object p1, p0, Le/f0/f/c;->d:Ljava/net/Socket;

    invoke-static {p1}, Lf/l;->h(Ljava/net/Socket;)Lf/r;

    move-result-object p1

    invoke-static {p1}, Lf/l;->b(Lf/r;)Lf/d;

    move-result-object p1

    iput-object p1, p0, Le/f0/f/c;->j:Lf/d;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/NullPointerException;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string p3, "throw with null exception"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    :goto_2
    return-void

    .line 13
    :cond_2
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 14
    new-instance p2, Ljava/net/ConnectException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Failed to connect to "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, p0, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {p4}, Le/d0;->d()Ljava/net/InetSocketAddress;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    .line 15
    invoke-virtual {p2, p1}, Ljava/net/ConnectException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 16
    throw p2
.end method

.method private f(Le/f0/f/b;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v0}, Le/d0;->a()Le/a;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Le/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    const/4 v2, 0x0

    .line 3
    :try_start_0
    iget-object v3, p0, Le/f0/f/c;->d:Ljava/net/Socket;

    .line 4
    invoke-virtual {v0}, Le/a;->l()Le/t;

    move-result-object v4

    invoke-virtual {v4}, Le/t;->m()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Le/a;->l()Le/t;

    move-result-object v5

    invoke-virtual {v5}, Le/t;->y()I

    move-result v5

    const/4 v6, 0x1

    .line 5
    invoke-virtual {v1, v3, v4, v5, v6}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v1

    check-cast v1, Ljavax/net/ssl/SSLSocket;
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    :try_start_1
    invoke-virtual {p1, v1}, Le/f0/f/b;->a(Ljavax/net/ssl/SSLSocket;)Le/k;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Le/k;->f()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 8
    invoke-static {}, Le/f0/j/g;->l()Le/f0/j/g;

    move-result-object v3

    .line 9
    invoke-virtual {v0}, Le/a;->l()Le/t;

    move-result-object v4

    invoke-virtual {v4}, Le/t;->m()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Le/a;->f()Ljava/util/List;

    move-result-object v5

    .line 10
    invoke-virtual {v3, v1, v4, v5}, Le/f0/j/g;->g(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    .line 11
    :cond_0
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 12
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v3

    .line 13
    invoke-static {v3}, Le/r;->b(Ljavax/net/ssl/SSLSession;)Le/r;

    move-result-object v4

    .line 14
    invoke-virtual {v0}, Le/a;->e()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v5

    invoke-virtual {v0}, Le/a;->l()Le/t;

    move-result-object v6

    invoke-virtual {v6}, Le/t;->m()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6, v3}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 15
    invoke-virtual {v4}, Le/r;->c()Ljava/util/List;

    move-result-object p1

    .line 16
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2
    :try_end_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v3, "Hostname "

    if-nez v2, :cond_1

    const/4 v2, 0x0

    .line 17
    :try_start_2
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/security/cert/X509Certificate;

    .line 18
    new-instance v2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    invoke-virtual {v0}, Le/a;->l()Le/t;

    move-result-object v0

    invoke-virtual {v0}, Le/t;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not verified:\n    certificate: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    invoke-static {p1}, Le/g;->c(Ljava/security/cert/Certificate;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n    DN: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n    subjectAltNames: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    invoke-static {p1}, Le/f0/l/d;->a(Ljava/security/cert/X509Certificate;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 23
    :cond_1
    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    invoke-virtual {v0}, Le/a;->l()Le/t;

    move-result-object v0

    invoke-virtual {v0}, Le/t;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not verified (no certificates)"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 25
    :cond_2
    invoke-virtual {v0}, Le/a;->a()Le/g;

    move-result-object v3

    invoke-virtual {v0}, Le/a;->l()Le/t;

    move-result-object v0

    invoke-virtual {v0}, Le/t;->m()Ljava/lang/String;

    move-result-object v0

    .line 26
    invoke-virtual {v4}, Le/r;->c()Ljava/util/List;

    move-result-object v5

    .line 27
    invoke-virtual {v3, v0, v5}, Le/g;->a(Ljava/lang/String;Ljava/util/List;)V

    .line 28
    invoke-virtual {p1}, Le/k;->f()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 29
    invoke-static {}, Le/f0/j/g;->l()Le/f0/j/g;

    move-result-object p1

    invoke-virtual {p1, v1}, Le/f0/j/g;->n(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object v2

    .line 30
    :cond_3
    iput-object v1, p0, Le/f0/f/c;->e:Ljava/net/Socket;

    .line 31
    invoke-static {v1}, Lf/l;->k(Ljava/net/Socket;)Lf/s;

    move-result-object p1

    invoke-static {p1}, Lf/l;->c(Lf/s;)Lf/e;

    move-result-object p1

    iput-object p1, p0, Le/f0/f/c;->i:Lf/e;

    .line 32
    iget-object p1, p0, Le/f0/f/c;->e:Ljava/net/Socket;

    invoke-static {p1}, Lf/l;->h(Ljava/net/Socket;)Lf/r;

    move-result-object p1

    invoke-static {p1}, Lf/l;->b(Lf/r;)Lf/d;

    move-result-object p1

    iput-object p1, p0, Le/f0/f/c;->j:Lf/d;

    .line 33
    iput-object v4, p0, Le/f0/f/c;->f:Le/r;

    if-eqz v2, :cond_4

    .line 34
    invoke-static {v2}, Le/x;->a(Ljava/lang/String;)Le/x;

    move-result-object p1

    goto :goto_0

    .line 35
    :cond_4
    sget-object p1, Le/x;->b:Le/x;

    :goto_0
    iput-object p1, p0, Le/f0/f/c;->g:Le/x;
    :try_end_2
    .catch Ljava/lang/AssertionError; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 36
    invoke-static {}, Le/f0/j/g;->l()Le/f0/j/g;

    move-result-object p1

    invoke-virtual {p1, v1}, Le/f0/j/g;->a(Ljavax/net/ssl/SSLSocket;)V

    return-void

    :catchall_0
    move-exception p1

    move-object v2, v1

    goto :goto_2

    :catch_0
    move-exception p1

    move-object v2, v1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    .line 37
    :goto_1
    :try_start_3
    invoke-static {p1}, Le/f0/c;->z(Ljava/lang/AssertionError;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 38
    :cond_5
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    if-eqz v2, :cond_6

    .line 39
    invoke-static {}, Le/f0/j/g;->l()Le/f0/j/g;

    move-result-object v0

    invoke-virtual {v0, v2}, Le/f0/j/g;->a(Ljavax/net/ssl/SSLSocket;)V

    .line 40
    :cond_6
    invoke-static {v2}, Le/f0/c;->g(Ljava/net/Socket;)V

    throw p1
.end method

.method private g(IIILe/e;Le/p;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Le/f0/f/c;->i()Le/z;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Le/z;->i()Le/t;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x15

    if-ge v2, v3, :cond_1

    .line 3
    invoke-direct {p0, p1, p2, p4, p5}, Le/f0/f/c;->e(IILe/e;Le/p;)V

    .line 4
    invoke-direct {p0, p2, p3, v0, v1}, Le/f0/f/c;->h(IILe/z;Le/t;)Le/z;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 5
    :cond_0
    iget-object v3, p0, Le/f0/f/c;->d:Ljava/net/Socket;

    invoke-static {v3}, Le/f0/c;->g(Ljava/net/Socket;)V

    const/4 v3, 0x0

    .line 6
    iput-object v3, p0, Le/f0/f/c;->d:Ljava/net/Socket;

    .line 7
    iput-object v3, p0, Le/f0/f/c;->j:Lf/d;

    .line 8
    iput-object v3, p0, Le/f0/f/c;->i:Lf/e;

    .line 9
    iget-object v4, p0, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v4}, Le/d0;->d()Ljava/net/InetSocketAddress;

    move-result-object v4

    iget-object v5, p0, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v5}, Le/d0;->b()Ljava/net/Proxy;

    move-result-object v5

    invoke-virtual {p5, p4, v4, v5, v3}, Le/p;->d(Le/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Le/x;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method private h(IILe/z;Le/t;)Le/z;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CONNECT "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-static {p4, v1}, Le/f0/c;->r(Le/t;Z)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " HTTP/1.1"

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    .line 2
    :goto_0
    new-instance v0, Le/f0/h/a;

    iget-object v1, p0, Le/f0/f/c;->i:Lf/e;

    iget-object v2, p0, Le/f0/f/c;->j:Lf/d;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v1, v2}, Le/f0/h/a;-><init>(Le/w;Le/f0/f/g;Lf/e;Lf/d;)V

    .line 3
    iget-object v1, p0, Le/f0/f/c;->i:Lf/e;

    invoke-interface {v1}, Lf/s;->d()Lf/t;

    move-result-object v1

    int-to-long v4, p1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v4, v5, v2}, Lf/t;->g(JLjava/util/concurrent/TimeUnit;)Lf/t;

    .line 4
    iget-object v1, p0, Le/f0/f/c;->j:Lf/d;

    invoke-interface {v1}, Lf/r;->d()Lf/t;

    move-result-object v1

    int-to-long v4, p2

    invoke-virtual {v1, v4, v5, v2}, Lf/t;->g(JLjava/util/concurrent/TimeUnit;)Lf/t;

    .line 5
    invoke-virtual {p3}, Le/z;->d()Le/s;

    move-result-object v1

    invoke-virtual {v0, v1, p4}, Le/f0/h/a;->o(Le/s;Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0}, Le/f0/h/a;->a()V

    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Le/f0/h/a;->f(Z)Le/b0$a;

    move-result-object v1

    .line 8
    invoke-virtual {v1, p3}, Le/b0$a;->p(Le/z;)Le/b0$a;

    move-result-object p3

    .line 9
    invoke-virtual {p3}, Le/b0$a;->c()Le/b0;

    move-result-object p3

    .line 10
    invoke-static {p3}, Le/f0/g/e;->b(Le/b0;)J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v1, v4, v6

    if-nez v1, :cond_0

    const-wide/16 v4, 0x0

    .line 11
    :cond_0
    invoke-virtual {v0, v4, v5}, Le/f0/h/a;->k(J)Lf/s;

    move-result-object v0

    const v1, 0x7fffffff

    .line 12
    invoke-static {v0, v1, v2}, Le/f0/c;->C(Lf/s;ILjava/util/concurrent/TimeUnit;)Z

    .line 13
    invoke-interface {v0}, Lf/s;->close()V

    .line 14
    invoke-virtual {p3}, Le/b0;->D()I

    move-result v0

    const/16 v1, 0xc8

    if-eq v0, v1, :cond_4

    const/16 v1, 0x197

    if-ne v0, v1, :cond_3

    .line 15
    iget-object v0, p0, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v0}, Le/d0;->a()Le/a;

    move-result-object v0

    invoke-virtual {v0}, Le/a;->h()Le/b;

    move-result-object v0

    iget-object v1, p0, Le/f0/f/c;->c:Le/d0;

    invoke-interface {v0, v1, p3}, Le/b;->a(Le/d0;Le/b0;)Le/z;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "Connection"

    .line 16
    invoke-virtual {p3, v1}, Le/b0;->F(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const-string v1, "close"

    invoke-virtual {v1, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_1

    return-object v0

    :cond_1
    move-object p3, v0

    goto :goto_0

    .line 17
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Failed to authenticate with proxy"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_3
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Unexpected response code for CONNECT: "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    invoke-virtual {p3}, Le/b0;->D()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 20
    :cond_4
    iget-object p1, p0, Le/f0/f/c;->i:Lf/e;

    invoke-interface {p1}, Lf/e;->c()Lf/c;

    move-result-object p1

    invoke-virtual {p1}, Lf/c;->m()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Le/f0/f/c;->j:Lf/d;

    invoke-interface {p1}, Lf/d;->c()Lf/c;

    move-result-object p1

    invoke-virtual {p1}, Lf/c;->m()Z

    move-result p1

    if-eqz p1, :cond_5

    return-object v3

    .line 21
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "TLS tunnel buffered too many bytes!"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method private i()Le/z;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Le/z$a;

    invoke-direct {v0}, Le/z$a;-><init>()V

    iget-object v1, p0, Le/f0/f/c;->c:Le/d0;

    .line 2
    invoke-virtual {v1}, Le/d0;->a()Le/a;

    move-result-object v1

    invoke-virtual {v1}, Le/a;->l()Le/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/z$a;->l(Le/t;)Le/z$a;

    move-result-object v0

    const-string v1, "CONNECT"

    const/4 v2, 0x0

    .line 3
    invoke-virtual {v0, v1, v2}, Le/z$a;->f(Ljava/lang/String;Le/a0;)Le/z$a;

    move-result-object v0

    iget-object v1, p0, Le/f0/f/c;->c:Le/d0;

    .line 4
    invoke-virtual {v1}, Le/d0;->a()Le/a;

    move-result-object v1

    invoke-virtual {v1}, Le/a;->l()Le/t;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Le/f0/c;->r(Le/t;Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Host"

    invoke-virtual {v0, v2, v1}, Le/z$a;->d(Ljava/lang/String;Ljava/lang/String;)Le/z$a;

    move-result-object v0

    const-string v1, "Proxy-Connection"

    const-string v2, "Keep-Alive"

    .line 5
    invoke-virtual {v0, v1, v2}, Le/z$a;->d(Ljava/lang/String;Ljava/lang/String;)Le/z$a;

    move-result-object v0

    .line 6
    invoke-static {}, Le/f0/d;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "User-Agent"

    invoke-virtual {v0, v2, v1}, Le/z$a;->d(Ljava/lang/String;Ljava/lang/String;)Le/z$a;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Le/z$a;->b()Le/z;

    move-result-object v0

    .line 8
    new-instance v1, Le/b0$a;

    invoke-direct {v1}, Le/b0$a;-><init>()V

    .line 9
    invoke-virtual {v1, v0}, Le/b0$a;->p(Le/z;)Le/b0$a;

    move-result-object v1

    sget-object v2, Le/x;->b:Le/x;

    .line 10
    invoke-virtual {v1, v2}, Le/b0$a;->n(Le/x;)Le/b0$a;

    move-result-object v1

    const/16 v2, 0x197

    .line 11
    invoke-virtual {v1, v2}, Le/b0$a;->g(I)Le/b0$a;

    move-result-object v1

    const-string v2, "Preemptive Authenticate"

    .line 12
    invoke-virtual {v1, v2}, Le/b0$a;->k(Ljava/lang/String;)Le/b0$a;

    move-result-object v1

    sget-object v2, Le/f0/c;->c:Le/c0;

    .line 13
    invoke-virtual {v1, v2}, Le/b0$a;->b(Le/c0;)Le/b0$a;

    move-result-object v1

    const-wide/16 v2, -0x1

    .line 14
    invoke-virtual {v1, v2, v3}, Le/b0$a;->q(J)Le/b0$a;

    move-result-object v1

    .line 15
    invoke-virtual {v1, v2, v3}, Le/b0$a;->o(J)Le/b0$a;

    move-result-object v1

    const-string v2, "Proxy-Authenticate"

    const-string v3, "OkHttp-Preemptive"

    .line 16
    invoke-virtual {v1, v2, v3}, Le/b0$a;->i(Ljava/lang/String;Ljava/lang/String;)Le/b0$a;

    move-result-object v1

    .line 17
    invoke-virtual {v1}, Le/b0$a;->c()Le/b0;

    move-result-object v1

    .line 18
    iget-object v2, p0, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v2}, Le/d0;->a()Le/a;

    move-result-object v2

    invoke-virtual {v2}, Le/a;->h()Le/b;

    move-result-object v2

    iget-object v3, p0, Le/f0/f/c;->c:Le/d0;

    .line 19
    invoke-interface {v2, v3, v1}, Le/b;->a(Le/d0;Le/b0;)Le/z;

    move-result-object v1

    if-eqz v1, :cond_0

    move-object v0, v1

    :cond_0
    return-object v0
.end method

.method private j(Le/f0/f/b;ILe/e;Le/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v0}, Le/d0;->a()Le/a;

    move-result-object v0

    invoke-virtual {v0}, Le/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    if-nez v0, :cond_1

    .line 2
    iget-object p1, p0, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {p1}, Le/d0;->a()Le/a;

    move-result-object p1

    invoke-virtual {p1}, Le/a;->f()Ljava/util/List;

    move-result-object p1

    sget-object p3, Le/x;->e:Le/x;

    invoke-interface {p1, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Le/f0/f/c;->d:Ljava/net/Socket;

    iput-object p1, p0, Le/f0/f/c;->e:Ljava/net/Socket;

    .line 4
    iput-object p3, p0, Le/f0/f/c;->g:Le/x;

    .line 5
    invoke-direct {p0, p2}, Le/f0/f/c;->r(I)V

    return-void

    .line 6
    :cond_0
    iget-object p1, p0, Le/f0/f/c;->d:Ljava/net/Socket;

    iput-object p1, p0, Le/f0/f/c;->e:Ljava/net/Socket;

    .line 7
    sget-object p1, Le/x;->b:Le/x;

    iput-object p1, p0, Le/f0/f/c;->g:Le/x;

    return-void

    .line 8
    :cond_1
    invoke-virtual {p4, p3}, Le/p;->u(Le/e;)V

    .line 9
    invoke-direct {p0, p1}, Le/f0/f/c;->f(Le/f0/f/b;)V

    .line 10
    iget-object p1, p0, Le/f0/f/c;->f:Le/r;

    invoke-virtual {p4, p3, p1}, Le/p;->t(Le/e;Le/r;)V

    .line 11
    iget-object p1, p0, Le/f0/f/c;->g:Le/x;

    sget-object p3, Le/x;->d:Le/x;

    if-ne p1, p3, :cond_2

    .line 12
    invoke-direct {p0, p2}, Le/f0/f/c;->r(I)V

    :cond_2
    return-void
.end method

.method private r(I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f0/f/c;->e:Ljava/net/Socket;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 2
    new-instance v0, Le/f0/i/g$h;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Le/f0/i/g$h;-><init>(Z)V

    iget-object v1, p0, Le/f0/f/c;->e:Ljava/net/Socket;

    iget-object v2, p0, Le/f0/f/c;->c:Le/d0;

    .line 3
    invoke-virtual {v2}, Le/d0;->a()Le/a;

    move-result-object v2

    invoke-virtual {v2}, Le/a;->l()Le/t;

    move-result-object v2

    invoke-virtual {v2}, Le/t;->m()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Le/f0/f/c;->i:Lf/e;

    iget-object v4, p0, Le/f0/f/c;->j:Lf/d;

    invoke-virtual {v0, v1, v2, v3, v4}, Le/f0/i/g$h;->d(Ljava/net/Socket;Ljava/lang/String;Lf/e;Lf/d;)Le/f0/i/g$h;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p0}, Le/f0/i/g$h;->b(Le/f0/i/g$j;)Le/f0/i/g$h;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Le/f0/i/g$h;->c(I)Le/f0/i/g$h;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Le/f0/i/g$h;->a()Le/f0/i/g;

    move-result-object p1

    iput-object p1, p0, Le/f0/f/c;->h:Le/f0/i/g;

    .line 7
    invoke-virtual {p1}, Le/f0/i/g;->c0()V

    return-void
.end method


# virtual methods
.method public a(Le/f0/i/g;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f0/f/c;->b:Le/j;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Le/f0/i/g;->Q()I

    move-result p1

    iput p1, p0, Le/f0/f/c;->m:I

    .line 3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b(Le/f0/i/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Le/f0/i/b;->e:Le/f0/i/b;

    invoke-virtual {p1, v0}, Le/f0/i/i;->f(Le/f0/i/b;)V

    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f0/f/c;->d:Ljava/net/Socket;

    invoke-static {v0}, Le/f0/c;->g(Ljava/net/Socket;)V

    return-void
.end method

.method public d(IIIIZLe/e;Le/p;)V
    .locals 16

    move-object/from16 v7, p0

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    .line 1
    iget-object v0, v7, Le/f0/f/c;->g:Le/x;

    if-nez v0, :cond_b

    .line 2
    iget-object v0, v7, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v0}, Le/d0;->a()Le/a;

    move-result-object v0

    invoke-virtual {v0}, Le/a;->b()Ljava/util/List;

    move-result-object v0

    .line 3
    new-instance v10, Le/f0/f/b;

    invoke-direct {v10, v0}, Le/f0/f/b;-><init>(Ljava/util/List;)V

    .line 4
    iget-object v1, v7, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v1}, Le/d0;->a()Le/a;

    move-result-object v1

    invoke-virtual {v1}, Le/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    if-nez v1, :cond_2

    .line 5
    sget-object v1, Le/k;->f:Le/k;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, v7, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v0}, Le/d0;->a()Le/a;

    move-result-object v0

    invoke-virtual {v0}, Le/a;->l()Le/t;

    move-result-object v0

    invoke-virtual {v0}, Le/t;->m()Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-static {}, Le/f0/j/g;->l()Le/f0/j/g;

    move-result-object v1

    invoke-virtual {v1, v0}, Le/f0/j/g;->q(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    new-instance v1, Le/f0/f/e;

    new-instance v2, Ljava/net/UnknownServiceException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CLEARTEXT communication to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not permitted by network security policy"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Le/f0/f/e;-><init>(Ljava/io/IOException;)V

    throw v1

    .line 9
    :cond_1
    new-instance v0, Le/f0/f/e;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "CLEARTEXT communication not enabled for client"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Le/f0/f/e;-><init>(Ljava/io/IOException;)V

    throw v0

    .line 10
    :cond_2
    iget-object v0, v7, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v0}, Le/d0;->a()Le/a;

    move-result-object v0

    invoke-virtual {v0}, Le/a;->f()Ljava/util/List;

    move-result-object v0

    sget-object v1, Le/x;->e:Le/x;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    :goto_0
    const/4 v11, 0x0

    move-object v12, v11

    .line 11
    :goto_1
    :try_start_0
    iget-object v0, v7, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v0}, Le/d0;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    .line 12
    invoke-direct/range {v1 .. v6}, Le/f0/f/c;->g(IIILe/e;Le/p;)V

    .line 13
    iget-object v0, v7, Le/f0/f/c;->d:Ljava/net/Socket;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    move/from16 v13, p1

    move/from16 v14, p2

    goto :goto_2

    :cond_4
    move/from16 v13, p1

    move/from16 v14, p2

    .line 14
    :try_start_1
    invoke-direct {v7, v13, v14, v8, v9}, Le/f0/f/c;->e(IILe/e;Le/p;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_2
    move/from16 v15, p4

    .line 15
    :try_start_2
    invoke-direct {v7, v10, v15, v8, v9}, Le/f0/f/c;->j(Le/f0/f/b;ILe/e;Le/p;)V

    .line 16
    iget-object v0, v7, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v0}, Le/d0;->d()Ljava/net/InetSocketAddress;

    move-result-object v0

    iget-object v1, v7, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v1}, Le/d0;->b()Ljava/net/Proxy;

    move-result-object v1

    iget-object v2, v7, Le/f0/f/c;->g:Le/x;

    invoke-virtual {v9, v8, v0, v1, v2}, Le/p;->d(Le/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Le/x;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 17
    :goto_3
    iget-object v0, v7, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v0}, Le/d0;->c()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, v7, Le/f0/f/c;->d:Ljava/net/Socket;

    if-eqz v0, :cond_5

    goto :goto_4

    .line 18
    :cond_5
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Too many tunnel connections attempted: 21"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 19
    new-instance v1, Le/f0/f/e;

    invoke-direct {v1, v0}, Le/f0/f/e;-><init>(Ljava/io/IOException;)V

    throw v1

    .line 20
    :cond_6
    :goto_4
    iget-object v0, v7, Le/f0/f/c;->h:Le/f0/i/g;

    if-eqz v0, :cond_7

    .line 21
    iget-object v1, v7, Le/f0/f/c;->b:Le/j;

    monitor-enter v1

    .line 22
    :try_start_3
    iget-object v0, v7, Le/f0/f/c;->h:Le/f0/i/g;

    invoke-virtual {v0}, Le/f0/i/g;->Q()I

    move-result v0

    iput v0, v7, Le/f0/f/c;->m:I

    .line 23
    monitor-exit v1

    goto :goto_5

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :cond_7
    :goto_5
    return-void

    :catch_0
    move-exception v0

    goto :goto_7

    :catch_1
    move-exception v0

    goto :goto_6

    :catch_2
    move-exception v0

    move/from16 v13, p1

    move/from16 v14, p2

    :goto_6
    move/from16 v15, p4

    .line 24
    :goto_7
    iget-object v1, v7, Le/f0/f/c;->e:Ljava/net/Socket;

    invoke-static {v1}, Le/f0/c;->g(Ljava/net/Socket;)V

    .line 25
    iget-object v1, v7, Le/f0/f/c;->d:Ljava/net/Socket;

    invoke-static {v1}, Le/f0/c;->g(Ljava/net/Socket;)V

    .line 26
    iput-object v11, v7, Le/f0/f/c;->e:Ljava/net/Socket;

    .line 27
    iput-object v11, v7, Le/f0/f/c;->d:Ljava/net/Socket;

    .line 28
    iput-object v11, v7, Le/f0/f/c;->i:Lf/e;

    .line 29
    iput-object v11, v7, Le/f0/f/c;->j:Lf/d;

    .line 30
    iput-object v11, v7, Le/f0/f/c;->f:Le/r;

    .line 31
    iput-object v11, v7, Le/f0/f/c;->g:Le/x;

    .line 32
    iput-object v11, v7, Le/f0/f/c;->h:Le/f0/i/g;

    .line 33
    iget-object v1, v7, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v1}, Le/d0;->d()Ljava/net/InetSocketAddress;

    move-result-object v3

    iget-object v1, v7, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v1}, Le/d0;->b()Ljava/net/Proxy;

    move-result-object v4

    const/4 v5, 0x0

    move-object/from16 v1, p7

    move-object/from16 v2, p6

    move-object v6, v0

    invoke-virtual/range {v1 .. v6}, Le/p;->e(Le/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Le/x;Ljava/io/IOException;)V

    if-nez v12, :cond_8

    .line 34
    new-instance v12, Le/f0/f/e;

    invoke-direct {v12, v0}, Le/f0/f/e;-><init>(Ljava/io/IOException;)V

    goto :goto_8

    .line 35
    :cond_8
    invoke-virtual {v12, v0}, Le/f0/f/e;->a(Ljava/io/IOException;)V

    :goto_8
    if-eqz p5, :cond_9

    .line 36
    invoke-virtual {v10, v0}, Le/f0/f/b;->b(Ljava/io/IOException;)Z

    move-result v0

    if-eqz v0, :cond_9

    goto/16 :goto_1

    .line 37
    :cond_9
    throw v12

    .line 38
    :cond_a
    new-instance v0, Le/f0/f/e;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Le/f0/f/e;-><init>(Ljava/io/IOException;)V

    throw v0

    .line 39
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "already connected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_a

    :goto_9
    throw v0

    :goto_a
    goto :goto_9
.end method

.method public k()Le/r;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f0/f/c;->f:Le/r;

    return-object v0
.end method

.method public l(Le/a;Le/d0;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Le/f0/f/c;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Le/f0/f/c;->m:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_a

    iget-boolean v0, p0, Le/f0/f/c;->k:Z

    if-eqz v0, :cond_0

    goto/16 :goto_0

    .line 2
    :cond_0
    sget-object v0, Le/f0/a;->a:Le/f0/a;

    iget-object v1, p0, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v1}, Le/d0;->a()Le/a;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Le/f0/a;->g(Le/a;Le/a;)Z

    move-result v0

    if-nez v0, :cond_1

    return v2

    .line 3
    :cond_1
    invoke-virtual {p1}, Le/a;->l()Le/t;

    move-result-object v0

    invoke-virtual {v0}, Le/t;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Le/f0/f/c;->p()Le/d0;

    move-result-object v1

    invoke-virtual {v1}, Le/d0;->a()Le/a;

    move-result-object v1

    invoke-virtual {v1}, Le/a;->l()Le/t;

    move-result-object v1

    invoke-virtual {v1}, Le/t;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    return v1

    .line 4
    :cond_2
    iget-object v0, p0, Le/f0/f/c;->h:Le/f0/i/g;

    if-nez v0, :cond_3

    return v2

    :cond_3
    if-nez p2, :cond_4

    return v2

    .line 5
    :cond_4
    invoke-virtual {p2}, Le/d0;->b()Ljava/net/Proxy;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v3, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v3, :cond_5

    return v2

    .line 6
    :cond_5
    iget-object v0, p0, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v0}, Le/d0;->b()Ljava/net/Proxy;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v3, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v3, :cond_6

    return v2

    .line 7
    :cond_6
    iget-object v0, p0, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v0}, Le/d0;->d()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-virtual {p2}, Le/d0;->d()Ljava/net/InetSocketAddress;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/net/InetSocketAddress;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    return v2

    .line 8
    :cond_7
    invoke-virtual {p2}, Le/d0;->a()Le/a;

    move-result-object p2

    invoke-virtual {p2}, Le/a;->e()Ljavax/net/ssl/HostnameVerifier;

    move-result-object p2

    sget-object v0, Le/f0/l/d;->a:Le/f0/l/d;

    if-eq p2, v0, :cond_8

    return v2

    .line 9
    :cond_8
    invoke-virtual {p1}, Le/a;->l()Le/t;

    move-result-object p2

    invoke-virtual {p0, p2}, Le/f0/f/c;->s(Le/t;)Z

    move-result p2

    if-nez p2, :cond_9

    return v2

    .line 10
    :cond_9
    :try_start_0
    invoke-virtual {p1}, Le/a;->a()Le/g;

    move-result-object p2

    invoke-virtual {p1}, Le/a;->l()Le/t;

    move-result-object p1

    invoke-virtual {p1}, Le/t;->m()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Le/f0/f/c;->k()Le/r;

    move-result-object v0

    invoke-virtual {v0}, Le/r;->c()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Le/g;->a(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    :cond_a
    :goto_0
    return v2
.end method

.method public m(Z)Z
    .locals 4

    .line 1
    iget-object v0, p0, Le/f0/f/c;->e:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    iget-object v0, p0, Le/f0/f/c;->e:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Le/f0/f/c;->e:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Le/f0/f/c;->h:Le/f0/i/g;

    if-eqz v0, :cond_1

    .line 3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Le/f0/i/g;->P(J)Z

    move-result p1

    return p1

    :cond_1
    const/4 v0, 0x1

    if-eqz p1, :cond_3

    .line 4
    :try_start_0
    iget-object p1, p0, Le/f0/f/c;->e:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->getSoTimeout()I

    move-result p1
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    :try_start_1
    iget-object v2, p0, Le/f0/f/c;->e:Ljava/net/Socket;

    invoke-virtual {v2, v0}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 6
    iget-object v2, p0, Le/f0/f/c;->i:Lf/e;

    invoke-interface {v2}, Lf/e;->m()Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_2

    .line 7
    :try_start_2
    iget-object v2, p0, Le/f0/f/c;->e:Ljava/net/Socket;

    invoke-virtual {v2, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    return v1

    :cond_2
    iget-object v2, p0, Le/f0/f/c;->e:Ljava/net/Socket;

    invoke-virtual {v2, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    return v0

    :catchall_0
    move-exception v2

    iget-object v3, p0, Le/f0/f/c;->e:Ljava/net/Socket;

    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    throw v2
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    return v1

    :catch_1
    :cond_3
    return v0

    :cond_4
    :goto_0
    return v1
.end method

.method public n()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/f0/f/c;->h:Le/f0/i/g;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public o(Le/w;Le/u$a;Le/f0/f/g;)Le/f0/g/c;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/SocketException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f0/f/c;->h:Le/f0/i/g;

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Le/f0/i/f;

    iget-object v1, p0, Le/f0/f/c;->h:Le/f0/i/g;

    invoke-direct {v0, p1, p2, p3, v1}, Le/f0/i/f;-><init>(Le/w;Le/u$a;Le/f0/f/g;Le/f0/i/g;)V

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Le/f0/f/c;->e:Ljava/net/Socket;

    invoke-interface {p2}, Le/u$a;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 4
    iget-object v0, p0, Le/f0/f/c;->i:Lf/e;

    invoke-interface {v0}, Lf/s;->d()Lf/t;

    move-result-object v0

    invoke-interface {p2}, Le/u$a;->b()I

    move-result v1

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lf/t;->g(JLjava/util/concurrent/TimeUnit;)Lf/t;

    .line 5
    iget-object v0, p0, Le/f0/f/c;->j:Lf/d;

    invoke-interface {v0}, Lf/r;->d()Lf/t;

    move-result-object v0

    invoke-interface {p2}, Le/u$a;->c()I

    move-result p2

    int-to-long v1, p2

    invoke-virtual {v0, v1, v2, v3}, Lf/t;->g(JLjava/util/concurrent/TimeUnit;)Lf/t;

    .line 6
    new-instance p2, Le/f0/h/a;

    iget-object v0, p0, Le/f0/f/c;->i:Lf/e;

    iget-object v1, p0, Le/f0/f/c;->j:Lf/d;

    invoke-direct {p2, p1, p3, v0, v1}, Le/f0/h/a;-><init>(Le/w;Le/f0/f/g;Lf/e;Lf/d;)V

    return-object p2
.end method

.method public p()Le/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f0/f/c;->c:Le/d0;

    return-object v0
.end method

.method public q()Ljava/net/Socket;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f0/f/c;->e:Ljava/net/Socket;

    return-object v0
.end method

.method public s(Le/t;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Le/t;->y()I

    move-result v0

    iget-object v1, p0, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v1}, Le/d0;->a()Le/a;

    move-result-object v1

    invoke-virtual {v1}, Le/a;->l()Le/t;

    move-result-object v1

    invoke-virtual {v1}, Le/t;->y()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    .line 2
    :cond_0
    invoke-virtual {p1}, Le/t;->m()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v1}, Le/d0;->a()Le/a;

    move-result-object v1

    invoke-virtual {v1}, Le/a;->l()Le/t;

    move-result-object v1

    invoke-virtual {v1}, Le/t;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    .line 3
    iget-object v0, p0, Le/f0/f/c;->f:Le/r;

    if-eqz v0, :cond_1

    sget-object v0, Le/f0/l/d;->a:Le/f0/l/d;

    .line 4
    invoke-virtual {p1}, Le/t;->m()Ljava/lang/String;

    move-result-object p1

    iget-object v3, p0, Le/f0/f/c;->f:Le/r;

    invoke-virtual {v3}, Le/r;->c()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/cert/X509Certificate;

    .line 5
    invoke-virtual {v0, p1, v3}, Le/f0/l/d;->c(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v2, 0x1

    :cond_1
    return v2

    :cond_2
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Connection{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f0/f/c;->c:Le/d0;

    .line 2
    invoke-virtual {v1}, Le/d0;->a()Le/a;

    move-result-object v1

    invoke-virtual {v1}, Le/a;->l()Le/t;

    move-result-object v1

    invoke-virtual {v1}, Le/t;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f0/f/c;->c:Le/d0;

    invoke-virtual {v1}, Le/d0;->a()Le/a;

    move-result-object v1

    invoke-virtual {v1}, Le/a;->l()Le/t;

    move-result-object v1

    invoke-virtual {v1}, Le/t;->y()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", proxy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f0/f/c;->c:Le/d0;

    .line 3
    invoke-virtual {v1}, Le/d0;->b()Ljava/net/Proxy;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " hostAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f0/f/c;->c:Le/d0;

    .line 4
    invoke-virtual {v1}, Le/d0;->d()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " cipherSuite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    iget-object v1, p0, Le/f0/f/c;->f:Le/r;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Le/r;->a()Le/h;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "none"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f0/f/c;->g:Le/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
