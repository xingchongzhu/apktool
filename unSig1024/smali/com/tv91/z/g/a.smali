.class public final Lcom/tv91/z/g/a;
.super Ljava/lang/Object;
.source "LogInterceptor.java"

# interfaces
.implements Le/u;


# instance fields
.field private a:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lcom/tv91/z/g/a;->a:J

    return-void
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    :try_start_0
    const-string v0, "{"

    .line 1
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string v0, "["

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->toString(I)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 5
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x5dc

    if-le v0, v1, :cond_3

    const-string v0, "Code"

    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x3e8

    const/4 v2, 0x0

    if-lez v0, :cond_2

    .line 7
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "...\n"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, -0x5

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 8
    :cond_2
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :cond_3
    :goto_1
    return-object p1
.end method


# virtual methods
.method public a(Le/u$a;)Le/b0;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Le/u$a;->S()Le/z;

    move-result-object v0

    .line 2
    const-class v1, Lcom/tv91/z/g/b;

    invoke-virtual {v0, v1}, Le/z;->h(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/z/g/b;

    if-nez v1, :cond_0

    .line 3
    invoke-interface {p1, v0}, Le/u$a;->d(Le/z;)Le/b0;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    .line 5
    invoke-interface {p1, v0}, Le/u$a;->d(Le/z;)Le/b0;

    move-result-object p1

    .line 6
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sub-long/2addr v4, v2

    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/tv91/z/g/a;->a:J

    .line 7
    invoke-virtual {p1}, Le/b0;->B()Le/c0;

    move-result-object v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eqz v0, :cond_2

    .line 8
    invoke-virtual {v0}, Le/c0;->D()Le/v;

    move-result-object v5

    .line 9
    invoke-virtual {v0}, Le/c0;->I()Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Object;

    .line 10
    iget-wide v7, p0, Lcom/tv91/z/g/a;->a:J

    .line 11
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    aput-object v7, v6, v3

    iget-object v1, v1, Lcom/tv91/z/g/b;->a:Ljava/lang/String;

    .line 12
    invoke-direct {p0, v1}, Lcom/tv91/z/g/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v6, v2

    .line 13
    invoke-virtual {p1}, Le/b0;->I()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0, v0}, Lcom/tv91/z/g/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    aput-object v1, v6, v4

    const-string v1, "Http Report\nExecute time: %d ms\nRequest:\n%s\nResponse:\n%s"

    .line 14
    invoke-static {v1, v6}, Lh/a/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    invoke-virtual {p1}, Le/b0;->K()Le/b0$a;

    move-result-object p1

    invoke-static {v5, v0}, Le/c0;->F(Le/v;Ljava/lang/String;)Le/c0;

    move-result-object v0

    invoke-virtual {p1, v0}, Le/b0$a;->b(Le/c0;)Le/b0$a;

    move-result-object p1

    invoke-virtual {p1}, Le/b0$a;->c()Le/b0;

    move-result-object p1

    return-object p1

    :cond_2
    new-array v0, v4, [Ljava/lang/Object;

    .line 16
    iget-wide v4, p0, Lcom/tv91/z/g/a;->a:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v0, v3

    iget-object v1, v1, Lcom/tv91/z/g/b;->a:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/tv91/z/g/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v2

    const-string v1, "Http Report\nExecute time: %d ms\nRequest:\n%s"

    invoke-static {v1, v0}, Lh/a/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p1
.end method

.method public b()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tv91/z/g/a;->a:J

    return-wide v0
.end method
