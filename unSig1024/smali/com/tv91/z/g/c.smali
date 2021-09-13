.class public final Lcom/tv91/z/g/c;
.super Ljava/lang/Object;
.source "RetryInterceptor.java"

# interfaces
.implements Le/u;


# instance fields
.field private a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/tv91/z/g/c;->a:I

    return-void
.end method

.method private b(Le/u$a;)Le/b0;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1}, Le/u$a;->b()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    .line 2
    :goto_0
    iget v2, p0, Lcom/tv91/z/g/c;->a:I

    const/4 v3, 0x0

    const-string v4, "Retry(%d) request as no server response for %d seconds"

    const/4 v5, 0x1

    const/4 v6, 0x2

    if-ge v2, v6, :cond_0

    .line 3
    :try_start_0
    invoke-interface {p1}, Le/u$a;->S()Le/z;

    move-result-object v2

    invoke-interface {p1, v2}, Le/u$a;->d(Le/z;)Le/b0;

    move-result-object p1
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 4
    :catch_0
    iget v2, p0, Lcom/tv91/z/g/c;->a:I

    add-int/2addr v2, v5

    iput v2, p0, Lcom/tv91/z/g/c;->a:I

    new-array v6, v6, [Ljava/lang/Object;

    .line 5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v6, v3

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v6, v5

    invoke-static {v4, v6}, Lh/a/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-array v6, v6, [Ljava/lang/Object;

    .line 6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v6, v3

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v6, v5

    invoke-static {v4, v6}, Lh/a/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    invoke-interface {p1}, Le/u$a;->S()Le/z;

    move-result-object v0

    invoke-interface {p1, v0}, Le/u$a;->d(Le/z;)Le/b0;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(Le/u$a;)Le/b0;
    .locals 2
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

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 3
    invoke-direct {p0, p1}, Lcom/tv91/z/g/c;->b(Le/u$a;)Le/b0;

    move-result-object p1

    return-object p1

    .line 4
    :cond_1
    invoke-interface {p1, v0}, Le/u$a;->d(Le/z;)Le/b0;

    move-result-object p1

    return-object p1
.end method
