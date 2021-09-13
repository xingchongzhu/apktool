.class Le/w$a;
.super Le/f0/a;
.source "OkHttpClient.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/f0/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/s$a;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Le/s$a;->b(Ljava/lang/String;)Le/s$a;

    return-void
.end method

.method public b(Le/s$a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2, p3}, Le/s$a;->c(Ljava/lang/String;Ljava/lang/String;)Le/s$a;

    return-void
.end method

.method public c(Le/k;Ljavax/net/ssl/SSLSocket;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2, p3}, Le/k;->a(Ljavax/net/ssl/SSLSocket;Z)V

    return-void
.end method

.method public d(Le/b0$a;)I
    .locals 0

    .line 1
    iget p1, p1, Le/b0$a;->c:I

    return p1
.end method

.method public e(Le/j;Le/f0/f/c;)Z
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Le/j;->b(Le/f0/f/c;)Z

    move-result p1

    return p1
.end method

.method public f(Le/j;Le/a;Le/f0/f/g;)Ljava/net/Socket;
    .locals 0

    .line 1
    invoke-virtual {p1, p2, p3}, Le/j;->c(Le/a;Le/f0/f/g;)Ljava/net/Socket;

    move-result-object p1

    return-object p1
.end method

.method public g(Le/a;Le/a;)Z
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Le/a;->d(Le/a;)Z

    move-result p1

    return p1
.end method

.method public h(Le/j;Le/a;Le/f0/f/g;Le/d0;)Le/f0/f/c;
    .locals 0

    .line 1
    invoke-virtual {p1, p2, p3, p4}, Le/j;->d(Le/a;Le/f0/f/g;Le/d0;)Le/f0/f/c;

    move-result-object p1

    return-object p1
.end method

.method public i(Le/j;Le/f0/f/c;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Le/j;->f(Le/f0/f/c;)V

    return-void
.end method

.method public j(Le/j;)Le/f0/f/d;
    .locals 0

    .line 1
    iget-object p1, p1, Le/j;->f:Le/f0/f/d;

    return-object p1
.end method

.method public k(Le/e;Ljava/io/IOException;)Ljava/io/IOException;
    .locals 0

    .line 1
    check-cast p1, Le/y;

    invoke-virtual {p1, p2}, Le/y;->g(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method
