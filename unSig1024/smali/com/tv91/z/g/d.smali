.class public final Lcom/tv91/z/g/d;
.super Ljava/lang/Object;
.source "WebApi.java"

# interfaces
.implements Lcom/tv91/z/b;


# instance fields
.field private final a:Le/w;

.field private final b:Ljava/lang/String;

.field private c:[Ljava/lang/String;

.field private d:Z

.field private e:I


# direct methods
.method public constructor <init>(Le/w;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/tv91/z/g/d;->a:Le/w;

    .line 3
    iput-object p2, p0, Lcom/tv91/z/g/d;->b:Ljava/lang/String;

    return-void
.end method

.method private static b0(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public synthetic A(Ljava/lang/String;Ljava/lang/String;)Lcom/tv91/model/User;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/tv91/z/a;->F(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;)Lcom/tv91/model/User;

    move-result-object p1

    return-object p1
.end method

.method public synthetic B(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/z/a;->V(Lcom/tv91/z/b;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic C()Ljava/util/List;
    .locals 1

    invoke-static {p0}, Lcom/tv91/z/a;->p(Lcom/tv91/z/b;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public synthetic D(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/tv91/z/a;->S(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic E(Ljava/lang/String;Ljava/lang/String;II)Lcom/tv91/model/Paging;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/tv91/z/a;->w(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;II)Lcom/tv91/model/Paging;

    move-result-object p1

    return-object p1
.end method

.method public synthetic F()Ljava/util/List;
    .locals 1

    invoke-static {p0}, Lcom/tv91/z/a;->h(Lcom/tv91/z/b;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public G(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    new-instance v0, Le/z$a;

    invoke-direct {v0}, Le/z$a;-><init>()V

    invoke-virtual {v0, p1}, Le/z$a;->k(Ljava/lang/String;)Le/z$a;

    move-result-object p1

    new-instance v0, Lcom/tv91/z/g/b;

    invoke-direct {v0}, Lcom/tv91/z/g/b;-><init>()V

    invoke-virtual {p1, v0}, Le/z$a;->j(Ljava/lang/Object;)Le/z$a;

    move-result-object p1

    invoke-virtual {p1}, Le/z$a;->c()Le/z$a;

    move-result-object p1

    invoke-virtual {p1}, Le/z$a;->b()Le/z;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/tv91/z/g/d;->a:Le/w;

    invoke-virtual {v0, p1}, Le/w;->q(Le/z;)Le/e;

    move-result-object p1

    invoke-interface {p1}, Le/e;->U()Le/b0;

    move-result-object p1

    .line 3
    :try_start_0
    invoke-virtual {p1}, Le/b0;->I()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p1}, Le/b0;->B()Le/c0;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Le/c0;->I()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    invoke-virtual {p1}, Le/b0;->close()V

    return-object v0

    .line 7
    :cond_0
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "response body is null"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8
    :cond_1
    new-instance v0, Lcom/tv91/s/g;

    invoke-virtual {p1}, Le/b0;->D()I

    move-result v1

    invoke-virtual {p1}, Le/b0;->J()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/tv91/s/g;-><init>(ILjava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    .line 9
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v1

    if-eqz p1, :cond_2

    .line 10
    :try_start_3
    invoke-virtual {p1}, Le/b0;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception p1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    throw v1
.end method

.method public synthetic H(Ljava/lang/String;Ljava/lang/String;)Lcom/tv91/model/User;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/tv91/z/a;->E(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;)Lcom/tv91/model/User;

    move-result-object p1

    return-object p1
.end method

.method public synthetic I(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/tv91/z/a;->J(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic J(Ljava/lang/String;Ljava/lang/String;)Lcom/tv91/model/User;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/tv91/z/a;->G(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;)Lcom/tv91/model/User;

    move-result-object p1

    return-object p1
.end method

.method public synthetic K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/tv91/z/a;->H(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic L(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/tv91/z/a;->D(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public synthetic M()Ljava/util/List;
    .locals 1

    invoke-static {p0}, Lcom/tv91/z/a;->t(Lcom/tv91/z/b;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public synthetic N(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static/range {p0 .. p10}, Lcom/tv91/z/a;->X(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public synthetic O(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/tv91/z/a;->K(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public synthetic P(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/tv91/z/a;->j(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public synthetic Q()Ljava/util/List;
    .locals 1

    invoke-static {p0}, Lcom/tv91/z/a;->e(Lcom/tv91/z/b;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public synthetic R(Ljava/lang/String;Ljava/lang/String;III)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/tv91/z/a;->M(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;III)V

    return-void
.end method

.method public synthetic S(Ljava/lang/String;)Lcom/tv91/z/b$b;
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/z/a;->I(Lcom/tv91/z/b;Ljava/lang/String;)Lcom/tv91/z/b$b;

    move-result-object p1

    return-object p1
.end method

.method public synthetic T(Ljava/lang/String;Ljava/lang/String;II)Lcom/tv91/model/Paging;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/tv91/z/a;->v(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;II)Lcom/tv91/model/Paging;

    move-result-object p1

    return-object p1
.end method

.method public synthetic U()Lcom/tv91/model/Highlight;
    .locals 1

    invoke-static {p0}, Lcom/tv91/z/a;->x(Lcom/tv91/z/b;)Lcom/tv91/model/Highlight;

    move-result-object v0

    return-object v0
.end method

.method public synthetic V(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/tv91/z/a;->R(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic W(Ljava/lang/String;Ljava/lang/String;I)Lcom/tv91/model/DownloadInfo;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/tv91/z/a;->f(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;I)Lcom/tv91/model/DownloadInfo;

    move-result-object p1

    return-object p1
.end method

.method public synthetic X(Ljava/lang/String;)Lcom/tv91/model/Url;
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/z/a;->q(Lcom/tv91/z/b;Ljava/lang/String;)Lcom/tv91/model/Url;

    move-result-object p1

    return-object p1
.end method

.method public synthetic Y(III[ILjava/lang/String;)Lcom/tv91/model/Paging;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/tv91/z/a;->B(Lcom/tv91/z/b;III[ILjava/lang/String;)Lcom/tv91/model/Paging;

    move-result-object p1

    return-object p1
.end method

.method public synthetic Z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/tv91/z/a;->T(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic a(Ljava/lang/String;Ljava/lang/String;II)Lcom/tv91/model/Paging;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/tv91/z/a;->i(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;II)Lcom/tv91/model/Paging;

    move-result-object p1

    return-object p1
.end method

.method public synthetic a0(Lcom/tv91/z/b$a;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/z/a;->W(Lcom/tv91/z/b;Lcom/tv91/z/b$a;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public synthetic b(IIII)Lcom/tv91/model/Paging;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/tv91/z/a;->A(Lcom/tv91/z/b;IIII)Lcom/tv91/model/Paging;

    move-result-object p1

    return-object p1
.end method

.method public synthetic c(Ljava/lang/String;Ljava/lang/Class;)Lcom/tv91/model/Paging;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/tv91/z/a;->L(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/Class;)Lcom/tv91/model/Paging;

    move-result-object p1

    return-object p1
.end method

.method public d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tv91/z/b$a;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 2
    iget-object p1, p1, Lcom/tv91/z/b$a;->p0:Ljava/lang/String;

    const-string v1, "Action"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p2, :cond_1

    .line 3
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1, p2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    goto :goto_1

    :cond_1
    :goto_0
    const-string p1, ""

    :goto_1
    const-string p2, "Message"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 4
    new-instance p1, Lcom/tv91/z/g/b;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/tv91/z/g/b;-><init>(Ljava/lang/String;)V

    .line 5
    new-instance p2, Le/q$a;

    invoke-direct {p2}, Le/q$a;-><init>()V

    iget-object v0, p1, Lcom/tv91/z/g/b;->a:Ljava/lang/String;

    .line 6
    invoke-static {v0}, Lcom/tv91/z/g/d;->b0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "data"

    invoke-virtual {p2, v1, v0}, Le/q$a;->a(Ljava/lang/String;Ljava/lang/String;)Le/q$a;

    move-result-object p2

    .line 7
    invoke-virtual {p2}, Le/q$a;->b()Le/q;

    move-result-object p2

    .line 8
    iget-object v0, p0, Lcom/tv91/z/g/d;->c:[Ljava/lang/String;

    if-eqz v0, :cond_2

    iget v1, p0, Lcom/tv91/z/g/d;->e:I

    aget-object v0, v0, v1

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/tv91/z/g/d;->b:Ljava/lang/String;

    .line 9
    :goto_2
    new-instance v1, Le/z$a;

    invoke-direct {v1}, Le/z$a;-><init>()V

    invoke-virtual {v1, v0}, Le/z$a;->k(Ljava/lang/String;)Le/z$a;

    move-result-object v0

    const-class v1, Lcom/tv91/z/g/b;

    invoke-virtual {v0, v1, p1}, Le/z$a;->i(Ljava/lang/Class;Ljava/lang/Object;)Le/z$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Le/z$a;->g(Le/a0;)Le/z$a;

    move-result-object p1

    invoke-virtual {p1}, Le/z$a;->b()Le/z;

    move-result-object p1

    .line 10
    iget-object p2, p0, Lcom/tv91/z/g/d;->a:Le/w;

    invoke-virtual {p2, p1}, Le/w;->q(Le/z;)Le/e;

    move-result-object p1

    invoke-interface {p1}, Le/e;->U()Le/b0;

    move-result-object p1

    .line 11
    :try_start_0
    invoke-virtual {p1}, Le/b0;->I()Z

    move-result p2

    if-eqz p2, :cond_6

    .line 12
    invoke-virtual {p1}, Le/b0;->B()Le/c0;

    move-result-object p2

    if-eqz p2, :cond_5

    .line 13
    iget-boolean v0, p0, Lcom/tv91/z/g/d;->d:Z

    if-eqz v0, :cond_4

    .line 14
    iget-object v0, p0, Lcom/tv91/z/g/d;->a:Le/w;

    invoke-virtual {v0}, Le/w;->n()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/u;

    .line 15
    instance-of v2, v1, Lcom/tv91/z/g/a;

    if-eqz v2, :cond_3

    .line 16
    check-cast v1, Lcom/tv91/z/g/a;

    invoke-virtual {v1}, Lcom/tv91/z/g/a;->b()J

    move-result-wide v0

    const-wide/16 v2, 0x2710

    cmp-long v4, v0, v2

    if-lez v4, :cond_4

    .line 17
    iget v0, p0, Lcom/tv91/z/g/d;->e:I

    xor-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/tv91/z/g/d;->e:I

    .line 18
    :cond_4
    invoke-virtual {p2}, Le/c0;->I()Ljava/lang/String;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    invoke-virtual {p1}, Le/b0;->close()V

    return-object p2

    .line 20
    :cond_5
    :try_start_1
    new-instance p2, Ljava/io/IOException;

    const-string v0, "response body is null"

    invoke-direct {p2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 21
    :cond_6
    new-instance p2, Lcom/tv91/s/g;

    invoke-virtual {p1}, Le/b0;->D()I

    move-result v0

    invoke-virtual {p1}, Le/b0;->J()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v0, v1}, Lcom/tv91/s/g;-><init>(ILjava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p2

    .line 22
    :try_start_2
    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    if-eqz p1, :cond_7

    .line 23
    :try_start_3
    invoke-virtual {p1}, Le/b0;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_7
    :goto_3
    goto :goto_5

    :goto_4
    throw v0

    :goto_5
    goto :goto_4
.end method

.method public synthetic e(Ljava/lang/String;Ljava/lang/String;I)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/tv91/z/a;->o(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public synthetic f(Ljava/lang/String;)Lcom/tv91/model/Version;
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/z/a;->r(Lcom/tv91/z/b;Ljava/lang/String;)Lcom/tv91/model/Version;

    move-result-object p1

    return-object p1
.end method

.method public synthetic g(I)Lcom/tv91/model/User;
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/z/a;->N(Lcom/tv91/z/b;I)Lcom/tv91/model/User;

    move-result-object p1

    return-object p1
.end method

.method public synthetic h(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/tv91/z/a;->P(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic i(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/tv91/z/a;->a(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic j(I)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/z/a;->m(Lcom/tv91/z/b;I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public synthetic k(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/tv91/z/a;->c(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V

    return-void
.end method

.method public synthetic l(Ljava/lang/String;Ljava/lang/String;I)Lcom/tv91/model/Promotion;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/tv91/z/a;->l(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;I)Lcom/tv91/model/Promotion;

    move-result-object p1

    return-object p1
.end method

.method public synthetic m(I)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/z/a;->C(Lcom/tv91/z/b;I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public synthetic n(Lcom/tv91/model/User;II)Lcom/tv91/model/Movie;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/tv91/z/a;->y(Lcom/tv91/z/b;Lcom/tv91/model/User;II)Lcom/tv91/model/Movie;

    move-result-object p1

    return-object p1
.end method

.method public synthetic o(Ljava/lang/String;Ljava/lang/String;III)Ljava/lang/String;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/tv91/z/a;->z(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;III)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public synthetic p(Ljava/lang/String;Ljava/lang/String;II)Lcom/tv91/model/Paging;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/tv91/z/a;->n(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;II)Lcom/tv91/model/Paging;

    move-result-object p1

    return-object p1
.end method

.method public synthetic q()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/tv91/z/a;->g(Lcom/tv91/z/b;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public synthetic r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/tv91/z/a;->k(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public synthetic s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/tv91/z/a;->b(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic t(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/z/a;->U(Lcom/tv91/z/b;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public synthetic u(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/tv91/z/a;->O(Lcom/tv91/z/b;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic v(II)Lcom/tv91/model/Paging;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/tv91/z/a;->s(Lcom/tv91/z/b;II)Lcom/tv91/model/Paging;

    move-result-object p1

    return-object p1
.end method

.method public synthetic w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/tv91/z/a;->Q(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic x()Ljava/util/List;
    .locals 1

    invoke-static {p0}, Lcom/tv91/z/a;->u(Lcom/tv91/z/b;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public synthetic y(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/tv91/z/a;->d(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public varargs z([Ljava/lang/String;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/tv91/z/g/d;->c:[Ljava/lang/String;

    .line 2
    array-length p1, p1

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/tv91/z/g/d;->d:Z

    return-void
.end method
