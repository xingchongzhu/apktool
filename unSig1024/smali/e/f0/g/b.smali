.class public final Le/f0/g/b;
.super Ljava/lang/Object;
.source "CallServerInterceptor.java"

# interfaces
.implements Le/u;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/f0/g/b$a;
    }
.end annotation


# instance fields
.field private final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Le/f0/g/b;->a:Z

    return-void
.end method


# virtual methods
.method public a(Le/u$a;)Le/b0;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Le/f0/g/g;

    .line 2
    invoke-virtual {p1}, Le/f0/g/g;->h()Le/f0/g/c;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Le/f0/g/g;->j()Le/f0/f/g;

    move-result-object v1

    .line 4
    invoke-virtual {p1}, Le/f0/g/g;->f()Le/i;

    move-result-object v2

    check-cast v2, Le/f0/f/c;

    .line 5
    invoke-virtual {p1}, Le/f0/g/g;->S()Le/z;

    move-result-object v3

    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 7
    invoke-virtual {p1}, Le/f0/g/g;->g()Le/p;

    move-result-object v6

    invoke-virtual {p1}, Le/f0/g/g;->e()Le/e;

    move-result-object v7

    invoke-virtual {v6, v7}, Le/p;->o(Le/e;)V

    .line 8
    invoke-interface {v0, v3}, Le/f0/g/c;->b(Le/z;)V

    .line 9
    invoke-virtual {p1}, Le/f0/g/g;->g()Le/p;

    move-result-object v6

    invoke-virtual {p1}, Le/f0/g/g;->e()Le/e;

    move-result-object v7

    invoke-virtual {v6, v7, v3}, Le/p;->n(Le/e;Le/z;)V

    .line 10
    invoke-virtual {v3}, Le/z;->f()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Le/f0/g/f;->b(Ljava/lang/String;)Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_2

    invoke-virtual {v3}, Le/z;->a()Le/a0;

    move-result-object v6

    if-eqz v6, :cond_2

    const-string v6, "Expect"

    .line 11
    invoke-virtual {v3, v6}, Le/z;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v8, "100-continue"

    invoke-virtual {v8, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 12
    invoke-interface {v0}, Le/f0/g/c;->d()V

    .line 13
    invoke-virtual {p1}, Le/f0/g/g;->g()Le/p;

    move-result-object v6

    invoke-virtual {p1}, Le/f0/g/g;->e()Le/e;

    move-result-object v7

    invoke-virtual {v6, v7}, Le/p;->s(Le/e;)V

    const/4 v6, 0x1

    .line 14
    invoke-interface {v0, v6}, Le/f0/g/c;->f(Z)Le/b0$a;

    move-result-object v7

    :cond_0
    if-nez v7, :cond_1

    .line 15
    invoke-virtual {p1}, Le/f0/g/g;->g()Le/p;

    move-result-object v2

    invoke-virtual {p1}, Le/f0/g/g;->e()Le/e;

    move-result-object v6

    invoke-virtual {v2, v6}, Le/p;->m(Le/e;)V

    .line 16
    invoke-virtual {v3}, Le/z;->a()Le/a0;

    move-result-object v2

    invoke-virtual {v2}, Le/a0;->a()J

    move-result-wide v8

    .line 17
    new-instance v2, Le/f0/g/b$a;

    .line 18
    invoke-interface {v0, v3, v8, v9}, Le/f0/g/c;->e(Le/z;J)Lf/r;

    move-result-object v6

    invoke-direct {v2, v6}, Le/f0/g/b$a;-><init>(Lf/r;)V

    .line 19
    invoke-static {v2}, Lf/l;->b(Lf/r;)Lf/d;

    move-result-object v6

    .line 20
    invoke-virtual {v3}, Le/z;->a()Le/a0;

    move-result-object v8

    invoke-virtual {v8, v6}, Le/a0;->e(Lf/d;)V

    .line 21
    invoke-interface {v6}, Lf/r;->close()V

    .line 22
    invoke-virtual {p1}, Le/f0/g/g;->g()Le/p;

    move-result-object v6

    .line 23
    invoke-virtual {p1}, Le/f0/g/g;->e()Le/e;

    move-result-object v8

    iget-wide v9, v2, Le/f0/g/b$a;->b:J

    invoke-virtual {v6, v8, v9, v10}, Le/p;->l(Le/e;J)V

    goto :goto_0

    .line 24
    :cond_1
    invoke-virtual {v2}, Le/f0/f/c;->n()Z

    move-result v2

    if-nez v2, :cond_2

    .line 25
    invoke-virtual {v1}, Le/f0/f/g;->j()V

    .line 26
    :cond_2
    :goto_0
    invoke-interface {v0}, Le/f0/g/c;->a()V

    const/4 v2, 0x0

    if-nez v7, :cond_3

    .line 27
    invoke-virtual {p1}, Le/f0/g/g;->g()Le/p;

    move-result-object v6

    invoke-virtual {p1}, Le/f0/g/g;->e()Le/e;

    move-result-object v7

    invoke-virtual {v6, v7}, Le/p;->s(Le/e;)V

    .line 28
    invoke-interface {v0, v2}, Le/f0/g/c;->f(Z)Le/b0$a;

    move-result-object v7

    .line 29
    :cond_3
    invoke-virtual {v7, v3}, Le/b0$a;->p(Le/z;)Le/b0$a;

    move-result-object v6

    .line 30
    invoke-virtual {v1}, Le/f0/f/g;->d()Le/f0/f/c;

    move-result-object v7

    invoke-virtual {v7}, Le/f0/f/c;->k()Le/r;

    move-result-object v7

    invoke-virtual {v6, v7}, Le/b0$a;->h(Le/r;)Le/b0$a;

    move-result-object v6

    .line 31
    invoke-virtual {v6, v4, v5}, Le/b0$a;->q(J)Le/b0$a;

    move-result-object v6

    .line 32
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Le/b0$a;->o(J)Le/b0$a;

    move-result-object v6

    .line 33
    invoke-virtual {v6}, Le/b0$a;->c()Le/b0;

    move-result-object v6

    .line 34
    invoke-virtual {v6}, Le/b0;->D()I

    move-result v7

    const/16 v8, 0x64

    if-ne v7, v8, :cond_4

    .line 35
    invoke-interface {v0, v2}, Le/f0/g/c;->f(Z)Le/b0$a;

    move-result-object v2

    .line 36
    invoke-virtual {v2, v3}, Le/b0$a;->p(Le/z;)Le/b0$a;

    move-result-object v2

    .line 37
    invoke-virtual {v1}, Le/f0/f/g;->d()Le/f0/f/c;

    move-result-object v3

    invoke-virtual {v3}, Le/f0/f/c;->k()Le/r;

    move-result-object v3

    invoke-virtual {v2, v3}, Le/b0$a;->h(Le/r;)Le/b0$a;

    move-result-object v2

    .line 38
    invoke-virtual {v2, v4, v5}, Le/b0$a;->q(J)Le/b0$a;

    move-result-object v2

    .line 39
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Le/b0$a;->o(J)Le/b0$a;

    move-result-object v2

    .line 40
    invoke-virtual {v2}, Le/b0$a;->c()Le/b0;

    move-result-object v6

    .line 41
    invoke-virtual {v6}, Le/b0;->D()I

    move-result v7

    .line 42
    :cond_4
    invoke-virtual {p1}, Le/f0/g/g;->g()Le/p;

    move-result-object v2

    .line 43
    invoke-virtual {p1}, Le/f0/g/g;->e()Le/e;

    move-result-object p1

    invoke-virtual {v2, p1, v6}, Le/p;->r(Le/e;Le/b0;)V

    .line 44
    iget-boolean p1, p0, Le/f0/g/b;->a:Z

    if-eqz p1, :cond_5

    const/16 p1, 0x65

    if-ne v7, p1, :cond_5

    .line 45
    invoke-virtual {v6}, Le/b0;->K()Le/b0$a;

    move-result-object p1

    sget-object v0, Le/f0/c;->c:Le/c0;

    .line 46
    invoke-virtual {p1, v0}, Le/b0$a;->b(Le/c0;)Le/b0$a;

    move-result-object p1

    .line 47
    invoke-virtual {p1}, Le/b0$a;->c()Le/b0;

    move-result-object p1

    goto :goto_1

    .line 48
    :cond_5
    invoke-virtual {v6}, Le/b0;->K()Le/b0$a;

    move-result-object p1

    .line 49
    invoke-interface {v0, v6}, Le/f0/g/c;->c(Le/b0;)Le/c0;

    move-result-object v0

    invoke-virtual {p1, v0}, Le/b0$a;->b(Le/c0;)Le/b0$a;

    move-result-object p1

    .line 50
    invoke-virtual {p1}, Le/b0$a;->c()Le/b0;

    move-result-object p1

    .line 51
    :goto_1
    invoke-virtual {p1}, Le/b0;->N()Le/z;

    move-result-object v0

    const-string v2, "Connection"

    invoke-virtual {v0, v2}, Le/z;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "close"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 52
    invoke-virtual {p1, v2}, Le/b0;->F(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 53
    :cond_6
    invoke-virtual {v1}, Le/f0/f/g;->j()V

    :cond_7
    const/16 v0, 0xcc

    if-eq v7, v0, :cond_8

    const/16 v0, 0xcd

    if-ne v7, v0, :cond_9

    .line 54
    :cond_8
    invoke-virtual {p1}, Le/b0;->B()Le/c0;

    move-result-object v0

    invoke-virtual {v0}, Le/c0;->C()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_a

    :cond_9
    return-object p1

    .line 55
    :cond_a
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HTTP "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " had non-zero Content-Length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    invoke-virtual {p1}, Le/b0;->B()Le/c0;

    move-result-object p1

    invoke-virtual {p1}, Le/c0;->C()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
