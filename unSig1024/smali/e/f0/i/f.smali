.class public final Le/f0/i/f;
.super Ljava/lang/Object;
.source "Http2Codec.java"

# interfaces
.implements Le/f0/g/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/f0/i/f$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Le/u$a;

.field final d:Le/f0/f/g;

.field private final e:Le/f0/i/g;

.field private f:Le/f0/i/i;

.field private final g:Le/x;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const-string v0, "connection"

    const-string v1, "host"

    const-string v2, "keep-alive"

    const-string v3, "proxy-connection"

    const-string v4, "te"

    const-string v5, "transfer-encoding"

    const-string v6, "encoding"

    const-string v7, "upgrade"

    const-string v8, ":method"

    const-string v9, ":path"

    const-string v10, ":scheme"

    const-string v11, ":authority"

    .line 1
    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Le/f0/c;->t([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Le/f0/i/f;->a:Ljava/util/List;

    const-string v1, "connection"

    const-string v2, "host"

    const-string v3, "keep-alive"

    const-string v4, "proxy-connection"

    const-string v5, "te"

    const-string v6, "transfer-encoding"

    const-string v7, "encoding"

    const-string v8, "upgrade"

    .line 2
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Le/f0/c;->t([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Le/f0/i/f;->b:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Le/w;Le/u$a;Le/f0/f/g;Le/f0/i/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Le/f0/i/f;->c:Le/u$a;

    .line 3
    iput-object p3, p0, Le/f0/i/f;->d:Le/f0/f/g;

    .line 4
    iput-object p4, p0, Le/f0/i/f;->e:Le/f0/i/g;

    .line 5
    invoke-virtual {p1}, Le/w;->t()Ljava/util/List;

    move-result-object p1

    sget-object p2, Le/x;->e:Le/x;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    sget-object p2, Le/x;->d:Le/x;

    :goto_0
    iput-object p2, p0, Le/f0/i/f;->g:Le/x;

    return-void
.end method

.method public static g(Le/z;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/z;",
            ")",
            "Ljava/util/List<",
            "Le/f0/i/c;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/z;->d()Le/s;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Le/s;->g()I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 3
    new-instance v2, Le/f0/i/c;

    sget-object v3, Le/f0/i/c;->c:Lf/f;

    invoke-virtual {p0}, Le/z;->f()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Le/f0/i/c;-><init>(Lf/f;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    new-instance v2, Le/f0/i/c;

    sget-object v3, Le/f0/i/c;->d:Lf/f;

    invoke-virtual {p0}, Le/z;->i()Le/t;

    move-result-object v4

    invoke-static {v4}, Le/f0/g/i;->c(Le/t;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Le/f0/i/c;-><init>(Lf/f;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v2, "Host"

    .line 5
    invoke-virtual {p0, v2}, Le/z;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 6
    new-instance v3, Le/f0/i/c;

    sget-object v4, Le/f0/i/c;->f:Lf/f;

    invoke-direct {v3, v4, v2}, Le/f0/i/c;-><init>(Lf/f;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    :cond_0
    new-instance v2, Le/f0/i/c;

    sget-object v3, Le/f0/i/c;->e:Lf/f;

    invoke-virtual {p0}, Le/z;->i()Le/t;

    move-result-object p0

    invoke-virtual {p0}, Le/t;->D()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, v3, p0}, Le/f0/i/c;-><init>(Lf/f;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p0, 0x0

    .line 8
    invoke-virtual {v0}, Le/s;->g()I

    move-result v2

    :goto_0
    if-ge p0, v2, :cond_2

    .line 9
    invoke-virtual {v0, p0}, Le/s;->e(I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lf/f;->g(Ljava/lang/String;)Lf/f;

    move-result-object v3

    .line 10
    sget-object v4, Le/f0/i/f;->a:Ljava/util/List;

    invoke-virtual {v3}, Lf/f;->t()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 11
    new-instance v4, Le/f0/i/c;

    invoke-virtual {v0, p0}, Le/s;->h(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v3, v5}, Le/f0/i/c;-><init>(Lf/f;Ljava/lang/String;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public static h(Le/s;Le/x;)Le/b0$a;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Le/s$a;

    invoke-direct {v0}, Le/s$a;-><init>()V

    .line 2
    invoke-virtual {p0}, Le/s;->g()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    .line 3
    invoke-virtual {p0, v3}, Le/s;->e(I)Ljava/lang/String;

    move-result-object v4

    .line 4
    invoke-virtual {p0, v3}, Le/s;->h(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ":status"

    .line 5
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "HTTP/1.1 "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Le/f0/g/k;->a(Ljava/lang/String;)Le/f0/g/k;

    move-result-object v2

    goto :goto_1

    .line 7
    :cond_0
    sget-object v6, Le/f0/i/f;->b:Ljava/util/List;

    invoke-interface {v6, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 8
    sget-object v6, Le/f0/a;->a:Le/f0/a;

    invoke-virtual {v6, v0, v4, v5}, Le/f0/a;->b(Le/s$a;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_3

    .line 9
    new-instance p0, Le/b0$a;

    invoke-direct {p0}, Le/b0$a;-><init>()V

    .line 10
    invoke-virtual {p0, p1}, Le/b0$a;->n(Le/x;)Le/b0$a;

    move-result-object p0

    iget p1, v2, Le/f0/g/k;->b:I

    .line 11
    invoke-virtual {p0, p1}, Le/b0$a;->g(I)Le/b0$a;

    move-result-object p0

    iget-object p1, v2, Le/f0/g/k;->c:Ljava/lang/String;

    .line 12
    invoke-virtual {p0, p1}, Le/b0$a;->k(Ljava/lang/String;)Le/b0$a;

    move-result-object p0

    .line 13
    invoke-virtual {v0}, Le/s$a;->d()Le/s;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/b0$a;->j(Le/s;)Le/b0$a;

    move-result-object p0

    return-object p0

    .line 14
    :cond_3
    new-instance p0, Ljava/net/ProtocolException;

    const-string p1, "Expected \':status\' header not present"

    invoke-direct {p0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :goto_2
    throw p0

    :goto_3
    goto :goto_2
.end method


# virtual methods
.method public a()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f0/i/f;->f:Le/f0/i/i;

    invoke-virtual {v0}, Le/f0/i/i;->j()Lf/r;

    move-result-object v0

    invoke-interface {v0}, Lf/r;->close()V

    return-void
.end method

.method public b(Le/z;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f0/i/f;->f:Le/f0/i/i;

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p1}, Le/z;->a()Le/a0;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 3
    :goto_0
    invoke-static {p1}, Le/f0/i/f;->g(Le/z;)Ljava/util/List;

    move-result-object p1

    .line 4
    iget-object v1, p0, Le/f0/i/f;->e:Le/f0/i/g;

    invoke-virtual {v1, p1, v0}, Le/f0/i/g;->S(Ljava/util/List;Z)Le/f0/i/i;

    move-result-object p1

    iput-object p1, p0, Le/f0/i/f;->f:Le/f0/i/i;

    .line 5
    invoke-virtual {p1}, Le/f0/i/i;->n()Lf/t;

    move-result-object p1

    iget-object v0, p0, Le/f0/i/f;->c:Le/u$a;

    invoke-interface {v0}, Le/u$a;->b()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lf/t;->g(JLjava/util/concurrent/TimeUnit;)Lf/t;

    .line 6
    iget-object p1, p0, Le/f0/i/f;->f:Le/f0/i/i;

    invoke-virtual {p1}, Le/f0/i/i;->u()Lf/t;

    move-result-object p1

    iget-object v0, p0, Le/f0/i/f;->c:Le/u$a;

    invoke-interface {v0}, Le/u$a;->c()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1, v2}, Lf/t;->g(JLjava/util/concurrent/TimeUnit;)Lf/t;

    return-void
.end method

.method public c(Le/b0;)Le/c0;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f0/i/f;->d:Le/f0/f/g;

    iget-object v1, v0, Le/f0/f/g;->f:Le/p;

    iget-object v0, v0, Le/f0/f/g;->e:Le/e;

    invoke-virtual {v1, v0}, Le/p;->q(Le/e;)V

    const-string v0, "Content-Type"

    .line 2
    invoke-virtual {p1, v0}, Le/b0;->F(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {p1}, Le/f0/g/e;->b(Le/b0;)J

    move-result-wide v1

    .line 4
    new-instance p1, Le/f0/i/f$a;

    iget-object v3, p0, Le/f0/i/f;->f:Le/f0/i/i;

    invoke-virtual {v3}, Le/f0/i/i;->k()Lf/s;

    move-result-object v3

    invoke-direct {p1, p0, v3}, Le/f0/i/f$a;-><init>(Le/f0/i/f;Lf/s;)V

    .line 5
    new-instance v3, Le/f0/g/h;

    invoke-static {p1}, Lf/l;->c(Lf/s;)Lf/e;

    move-result-object p1

    invoke-direct {v3, v0, v1, v2, p1}, Le/f0/g/h;-><init>(Ljava/lang/String;JLf/e;)V

    return-object v3
.end method

.method public cancel()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/f0/i/f;->f:Le/f0/i/i;

    if-eqz v0, :cond_0

    sget-object v1, Le/f0/i/b;->f:Le/f0/i/b;

    invoke-virtual {v0, v1}, Le/f0/i/i;->h(Le/f0/i/b;)V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f0/i/f;->e:Le/f0/i/g;

    invoke-virtual {v0}, Le/f0/i/g;->flush()V

    return-void
.end method

.method public e(Le/z;J)Lf/r;
    .locals 0

    .line 1
    iget-object p1, p0, Le/f0/i/f;->f:Le/f0/i/i;

    invoke-virtual {p1}, Le/f0/i/i;->j()Lf/r;

    move-result-object p1

    return-object p1
.end method

.method public f(Z)Le/b0$a;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f0/i/f;->f:Le/f0/i/i;

    invoke-virtual {v0}, Le/f0/i/i;->s()Le/s;

    move-result-object v0

    .line 2
    iget-object v1, p0, Le/f0/i/f;->g:Le/x;

    invoke-static {v0, v1}, Le/f0/i/f;->h(Le/s;Le/x;)Le/b0$a;

    move-result-object v0

    if-eqz p1, :cond_0

    .line 3
    sget-object p1, Le/f0/a;->a:Le/f0/a;

    invoke-virtual {p1, v0}, Le/f0/a;->d(Le/b0$a;)I

    move-result p1

    const/16 v1, 0x64

    if-ne p1, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    return-object v0
.end method
