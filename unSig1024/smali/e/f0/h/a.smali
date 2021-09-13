.class public final Le/f0/h/a;
.super Ljava/lang/Object;
.source "Http1Codec.java"

# interfaces
.implements Le/f0/g/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/f0/h/a$g;,
        Le/f0/h/a$d;,
        Le/f0/h/a$f;,
        Le/f0/h/a$b;,
        Le/f0/h/a$c;,
        Le/f0/h/a$e;
    }
.end annotation


# instance fields
.field final a:Le/w;

.field final b:Le/f0/f/g;

.field final c:Lf/e;

.field final d:Lf/d;

.field e:I

.field private f:J


# direct methods
.method public constructor <init>(Le/w;Le/f0/f/g;Lf/e;Lf/d;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Le/f0/h/a;->e:I

    const-wide/32 v0, 0x40000

    .line 3
    iput-wide v0, p0, Le/f0/h/a;->f:J

    .line 4
    iput-object p1, p0, Le/f0/h/a;->a:Le/w;

    .line 5
    iput-object p2, p0, Le/f0/h/a;->b:Le/f0/f/g;

    .line 6
    iput-object p3, p0, Le/f0/h/a;->c:Lf/e;

    .line 7
    iput-object p4, p0, Le/f0/h/a;->d:Lf/d;

    return-void
.end method

.method private m()Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f0/h/a;->c:Lf/e;

    iget-wide v1, p0, Le/f0/h/a;->f:J

    invoke-interface {v0, v1, v2}, Lf/e;->u(J)Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-wide v1, p0, Le/f0/h/a;->f:J

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    int-to-long v3, v3

    sub-long/2addr v1, v3

    iput-wide v1, p0, Le/f0/h/a;->f:J

    return-object v0
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
    iget-object v0, p0, Le/f0/h/a;->d:Lf/d;

    invoke-interface {v0}, Lf/d;->flush()V

    return-void
.end method

.method public b(Le/z;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f0/h/a;->b:Le/f0/f/g;

    .line 2
    invoke-virtual {v0}, Le/f0/f/g;->d()Le/f0/f/c;

    move-result-object v0

    invoke-virtual {v0}, Le/f0/f/c;->p()Le/d0;

    move-result-object v0

    invoke-virtual {v0}, Le/d0;->b()Ljava/net/Proxy;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    .line 3
    invoke-static {p1, v0}, Le/f0/g/i;->a(Le/z;Ljava/net/Proxy$Type;)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p1}, Le/z;->d()Le/s;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Le/f0/h/a;->o(Le/s;Ljava/lang/String;)V

    return-void
.end method

.method public c(Le/b0;)Le/c0;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f0/h/a;->b:Le/f0/f/g;

    iget-object v1, v0, Le/f0/f/g;->f:Le/p;

    iget-object v0, v0, Le/f0/f/g;->e:Le/e;

    invoke-virtual {v1, v0}, Le/p;->q(Le/e;)V

    const-string v0, "Content-Type"

    .line 2
    invoke-virtual {p1, v0}, Le/b0;->F(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {p1}, Le/f0/g/e;->c(Le/b0;)Z

    move-result v1

    if-nez v1, :cond_0

    const-wide/16 v1, 0x0

    .line 4
    invoke-virtual {p0, v1, v2}, Le/f0/h/a;->k(J)Lf/s;

    move-result-object p1

    .line 5
    new-instance v3, Le/f0/g/h;

    invoke-static {p1}, Lf/l;->c(Lf/s;)Lf/e;

    move-result-object p1

    invoke-direct {v3, v0, v1, v2, p1}, Le/f0/g/h;-><init>(Ljava/lang/String;JLf/e;)V

    return-object v3

    :cond_0
    const-string v1, "Transfer-Encoding"

    .line 6
    invoke-virtual {p1, v1}, Le/b0;->F(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "chunked"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    const-wide/16 v2, -0x1

    if-eqz v1, :cond_1

    .line 7
    invoke-virtual {p1}, Le/b0;->N()Le/z;

    move-result-object p1

    invoke-virtual {p1}, Le/z;->i()Le/t;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/f0/h/a;->i(Le/t;)Lf/s;

    move-result-object p1

    .line 8
    new-instance v1, Le/f0/g/h;

    invoke-static {p1}, Lf/l;->c(Lf/s;)Lf/e;

    move-result-object p1

    invoke-direct {v1, v0, v2, v3, p1}, Le/f0/g/h;-><init>(Ljava/lang/String;JLf/e;)V

    return-object v1

    .line 9
    :cond_1
    invoke-static {p1}, Le/f0/g/e;->b(Le/b0;)J

    move-result-wide v4

    cmp-long p1, v4, v2

    if-eqz p1, :cond_2

    .line 10
    invoke-virtual {p0, v4, v5}, Le/f0/h/a;->k(J)Lf/s;

    move-result-object p1

    .line 11
    new-instance v1, Le/f0/g/h;

    invoke-static {p1}, Lf/l;->c(Lf/s;)Lf/e;

    move-result-object p1

    invoke-direct {v1, v0, v4, v5, p1}, Le/f0/g/h;-><init>(Ljava/lang/String;JLf/e;)V

    return-object v1

    .line 12
    :cond_2
    new-instance p1, Le/f0/g/h;

    invoke-virtual {p0}, Le/f0/h/a;->l()Lf/s;

    move-result-object v1

    invoke-static {v1}, Lf/l;->c(Lf/s;)Lf/e;

    move-result-object v1

    invoke-direct {p1, v0, v2, v3, v1}, Le/f0/g/h;-><init>(Ljava/lang/String;JLf/e;)V

    return-object p1
.end method

.method public cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f0/h/a;->b:Le/f0/f/g;

    invoke-virtual {v0}, Le/f0/f/g;->d()Le/f0/f/c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Le/f0/f/c;->c()V

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
    iget-object v0, p0, Le/f0/h/a;->d:Lf/d;

    invoke-interface {v0}, Lf/d;->flush()V

    return-void
.end method

.method public e(Le/z;J)Lf/r;
    .locals 2

    const-string v0, "Transfer-Encoding"

    .line 1
    invoke-virtual {p1, v0}, Le/z;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "chunked"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Le/f0/h/a;->h()Lf/r;

    move-result-object p1

    return-object p1

    :cond_0
    const-wide/16 v0, -0x1

    cmp-long p1, p2, v0

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p0, p2, p3}, Le/f0/h/a;->j(J)Lf/r;

    move-result-object p1

    return-object p1

    .line 4
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot stream a request body without chunked encoding or a known content length!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(Z)Le/b0$a;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Le/f0/h/a;->e:I

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le/f0/h/a;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_1
    :goto_0
    :try_start_0
    invoke-direct {p0}, Le/f0/h/a;->m()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Le/f0/g/k;->a(Ljava/lang/String;)Le/f0/g/k;

    move-result-object v0

    .line 4
    new-instance v2, Le/b0$a;

    invoke-direct {v2}, Le/b0$a;-><init>()V

    iget-object v3, v0, Le/f0/g/k;->a:Le/x;

    .line 5
    invoke-virtual {v2, v3}, Le/b0$a;->n(Le/x;)Le/b0$a;

    move-result-object v2

    iget v3, v0, Le/f0/g/k;->b:I

    .line 6
    invoke-virtual {v2, v3}, Le/b0$a;->g(I)Le/b0$a;

    move-result-object v2

    iget-object v3, v0, Le/f0/g/k;->c:Ljava/lang/String;

    .line 7
    invoke-virtual {v2, v3}, Le/b0$a;->k(Ljava/lang/String;)Le/b0$a;

    move-result-object v2

    .line 8
    invoke-virtual {p0}, Le/f0/h/a;->n()Le/s;

    move-result-object v3

    invoke-virtual {v2, v3}, Le/b0$a;->j(Le/s;)Le/b0$a;

    move-result-object v2

    const/16 v3, 0x64

    if-eqz p1, :cond_2

    .line 9
    iget p1, v0, Le/f0/g/k;->b:I

    if-ne p1, v3, :cond_2

    const/4 p1, 0x0

    return-object p1

    .line 10
    :cond_2
    iget p1, v0, Le/f0/g/k;->b:I

    if-ne p1, v3, :cond_3

    .line 11
    iput v1, p0, Le/f0/h/a;->e:I

    return-object v2

    :cond_3
    const/4 p1, 0x4

    .line 12
    iput p1, p0, Le/f0/h/a;->e:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception p1

    .line 13
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unexpected end of stream on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le/f0/h/a;->b:Le/f0/f/g;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v0, p1}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 15
    throw v0
.end method

.method g(Lf/i;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lf/i;->i()Lf/t;

    move-result-object v0

    .line 2
    sget-object v1, Lf/t;->a:Lf/t;

    invoke-virtual {p1, v1}, Lf/i;->j(Lf/t;)Lf/i;

    .line 3
    invoke-virtual {v0}, Lf/t;->a()Lf/t;

    .line 4
    invoke-virtual {v0}, Lf/t;->b()Lf/t;

    return-void
.end method

.method public h()Lf/r;
    .locals 3

    .line 1
    iget v0, p0, Le/f0/h/a;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    .line 2
    iput v0, p0, Le/f0/h/a;->e:I

    .line 3
    new-instance v0, Le/f0/h/a$c;

    invoke-direct {v0, p0}, Le/f0/h/a$c;-><init>(Le/f0/h/a;)V

    return-object v0

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Le/f0/h/a;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public i(Le/t;)Lf/s;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Le/f0/h/a;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x5

    .line 2
    iput v0, p0, Le/f0/h/a;->e:I

    .line 3
    new-instance v0, Le/f0/h/a$d;

    invoke-direct {v0, p0, p1}, Le/f0/h/a$d;-><init>(Le/f0/h/a;Le/t;)V

    return-object v0

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le/f0/h/a;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public j(J)Lf/r;
    .locals 2

    .line 1
    iget v0, p0, Le/f0/h/a;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    .line 2
    iput v0, p0, Le/f0/h/a;->e:I

    .line 3
    new-instance v0, Le/f0/h/a$e;

    invoke-direct {v0, p0, p1, p2}, Le/f0/h/a$e;-><init>(Le/f0/h/a;J)V

    return-object v0

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "state: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Le/f0/h/a;->e:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public k(J)Lf/s;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Le/f0/h/a;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x5

    .line 2
    iput v0, p0, Le/f0/h/a;->e:I

    .line 3
    new-instance v0, Le/f0/h/a$f;

    invoke-direct {v0, p0, p1, p2}, Le/f0/h/a$f;-><init>(Le/f0/h/a;J)V

    return-object v0

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "state: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Le/f0/h/a;->e:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public l()Lf/s;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Le/f0/h/a;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 2
    iget-object v0, p0, Le/f0/h/a;->b:Le/f0/f/g;

    if-eqz v0, :cond_0

    const/4 v1, 0x5

    .line 3
    iput v1, p0, Le/f0/h/a;->e:I

    .line 4
    invoke-virtual {v0}, Le/f0/f/g;->j()V

    .line 5
    new-instance v0, Le/f0/h/a$g;

    invoke-direct {v0, p0}, Le/f0/h/a$g;-><init>(Le/f0/h/a;)V

    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "streamAllocation == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 7
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Le/f0/h/a;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public n()Le/s;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Le/s$a;

    invoke-direct {v0}, Le/s$a;-><init>()V

    .line 2
    :goto_0
    invoke-direct {p0}, Le/f0/h/a;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    sget-object v2, Le/f0/a;->a:Le/f0/a;

    invoke-virtual {v2, v0, v1}, Le/f0/a;->a(Le/s$a;Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0}, Le/s$a;->d()Le/s;

    move-result-object v0

    return-object v0
.end method

.method public o(Le/s;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Le/f0/h/a;->e:I

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Le/f0/h/a;->d:Lf/d;

    invoke-interface {v0, p2}, Lf/d;->w(Ljava/lang/String;)Lf/d;

    move-result-object p2

    const-string v0, "\r\n"

    invoke-interface {p2, v0}, Lf/d;->w(Ljava/lang/String;)Lf/d;

    const/4 p2, 0x0

    .line 3
    invoke-virtual {p1}, Le/s;->g()I

    move-result v1

    :goto_0
    if-ge p2, v1, :cond_0

    .line 4
    iget-object v2, p0, Le/f0/h/a;->d:Lf/d;

    invoke-virtual {p1, p2}, Le/s;->e(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lf/d;->w(Ljava/lang/String;)Lf/d;

    move-result-object v2

    const-string v3, ": "

    .line 5
    invoke-interface {v2, v3}, Lf/d;->w(Ljava/lang/String;)Lf/d;

    move-result-object v2

    .line 6
    invoke-virtual {p1, p2}, Le/s;->h(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lf/d;->w(Ljava/lang/String;)Lf/d;

    move-result-object v2

    .line 7
    invoke-interface {v2, v0}, Lf/d;->w(Ljava/lang/String;)Lf/d;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 8
    :cond_0
    iget-object p1, p0, Le/f0/h/a;->d:Lf/d;

    invoke-interface {p1, v0}, Lf/d;->w(Ljava/lang/String;)Lf/d;

    const/4 p1, 0x1

    .line 9
    iput p1, p0, Le/f0/h/a;->e:I

    return-void

    .line 10
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "state: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Le/f0/h/a;->e:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method
