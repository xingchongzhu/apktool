.class public Lcom/google/android/exoplayer2/upstream/u;
.super Lcom/google/android/exoplayer2/upstream/h;
.source "DefaultHttpDataSource.java"

# interfaces
.implements Lcom/google/android/exoplayer2/upstream/y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/upstream/u$b;
    }
.end annotation


# static fields
.field private static final f:Ljava/util/regex/Pattern;


# instance fields
.field private final g:Z

.field private final h:I

.field private final i:I

.field private final j:Ljava/lang/String;

.field private final k:Lcom/google/android/exoplayer2/upstream/y$f;

.field private final l:Lcom/google/android/exoplayer2/upstream/y$f;

.field private m:Lc/a/b/a/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/a/h<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private n:Lcom/google/android/exoplayer2/upstream/p;

.field private o:Ljava/net/HttpURLConnection;

.field private p:Ljava/io/InputStream;

.field private q:[B

.field private r:Z

.field private s:I

.field private t:J

.field private u:J

.field private v:J

.field private w:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "^bytes (\\d+)-(\\d+)/(\\d+)$"

    .line 1
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/exoplayer2/upstream/u;->f:Ljava/util/regex/Pattern;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIZLcom/google/android/exoplayer2/upstream/y$f;Lc/a/b/a/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "IIZ",
            "Lcom/google/android/exoplayer2/upstream/y$f;",
            "Lc/a/b/a/h<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/upstream/h;-><init>(Z)V

    .line 3
    iput-object p1, p0, Lcom/google/android/exoplayer2/upstream/u;->j:Ljava/lang/String;

    .line 4
    iput p2, p0, Lcom/google/android/exoplayer2/upstream/u;->h:I

    .line 5
    iput p3, p0, Lcom/google/android/exoplayer2/upstream/u;->i:I

    .line 6
    iput-boolean p4, p0, Lcom/google/android/exoplayer2/upstream/u;->g:Z

    .line 7
    iput-object p5, p0, Lcom/google/android/exoplayer2/upstream/u;->k:Lcom/google/android/exoplayer2/upstream/y$f;

    .line 8
    iput-object p6, p0, Lcom/google/android/exoplayer2/upstream/u;->m:Lc/a/b/a/h;

    .line 9
    new-instance p1, Lcom/google/android/exoplayer2/upstream/y$f;

    invoke-direct {p1}, Lcom/google/android/exoplayer2/upstream/y$f;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/upstream/u;->l:Lcom/google/android/exoplayer2/upstream/y$f;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;IIZLcom/google/android/exoplayer2/upstream/y$f;Lc/a/b/a/h;Lcom/google/android/exoplayer2/upstream/u$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lcom/google/android/exoplayer2/upstream/u;-><init>(Ljava/lang/String;IIZLcom/google/android/exoplayer2/upstream/y$f;Lc/a/b/a/h;)V

    return-void
.end method

.method private A(Lcom/google/android/exoplayer2/upstream/p;)Ljava/net/HttpURLConnection;
    .locals 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p1

    .line 1
    new-instance v1, Ljava/net/URL;

    iget-object v2, v0, Lcom/google/android/exoplayer2/upstream/p;->a:Landroid/net/Uri;

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 2
    iget v2, v0, Lcom/google/android/exoplayer2/upstream/p;->c:I

    .line 3
    iget-object v3, v0, Lcom/google/android/exoplayer2/upstream/p;->d:[B

    .line 4
    iget-wide v14, v0, Lcom/google/android/exoplayer2/upstream/p;->g:J

    .line 5
    iget-wide v12, v0, Lcom/google/android/exoplayer2/upstream/p;->h:J

    const/4 v10, 0x1

    .line 6
    invoke-virtual {v0, v10}, Lcom/google/android/exoplayer2/upstream/p;->d(I)Z

    move-result v16

    move-object/from16 v11, p0

    .line 7
    iget-boolean v4, v11, Lcom/google/android/exoplayer2/upstream/u;->g:Z

    if-nez v4, :cond_0

    const/4 v9, 0x1

    .line 8
    iget-object v10, v0, Lcom/google/android/exoplayer2/upstream/p;->e:Ljava/util/Map;

    move-object/from16 v0, p0

    move-wide v4, v14

    move-wide v6, v12

    move/from16 v8, v16

    invoke-direct/range {v0 .. v10}, Lcom/google/android/exoplayer2/upstream/u;->B(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    add-int/lit8 v8, v4, 0x1

    const/16 v5, 0x14

    if-gt v4, v5, :cond_6

    const/16 v17, 0x0

    .line 9
    iget-object v9, v0, Lcom/google/android/exoplayer2/upstream/p;->e:Ljava/util/Map;

    move-object/from16 v4, p0

    move-object v5, v1

    move v6, v2

    move-object v7, v3

    move v0, v8

    move-object/from16 v18, v9

    move-wide v8, v14

    move-object/from16 v19, v3

    const/4 v3, 0x1

    move-wide v10, v12

    move-wide/from16 v20, v12

    move/from16 v12, v16

    move/from16 v13, v17

    move-wide/from16 v22, v14

    move-object/from16 v14, v18

    .line 10
    invoke-direct/range {v4 .. v14}, Lcom/google/android/exoplayer2/upstream/u;->B(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;

    move-result-object v4

    .line 11
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v5

    const-string v6, "Location"

    .line 12
    invoke-virtual {v4, v6}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0x12f

    const/16 v8, 0x12e

    const/16 v9, 0x12d

    const/16 v10, 0x12c

    if-eq v2, v3, :cond_1

    const/4 v11, 0x3

    if-ne v2, v11, :cond_2

    :cond_1
    if-eq v5, v10, :cond_5

    if-eq v5, v9, :cond_5

    if-eq v5, v8, :cond_5

    if-eq v5, v7, :cond_5

    const/16 v11, 0x133

    if-eq v5, v11, :cond_5

    const/16 v11, 0x134

    if-ne v5, v11, :cond_2

    goto :goto_1

    :cond_2
    const/4 v11, 0x2

    if-ne v2, v11, :cond_4

    if-eq v5, v10, :cond_3

    if-eq v5, v9, :cond_3

    if-eq v5, v8, :cond_3

    if-ne v5, v7, :cond_4

    .line 13
    :cond_3
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    const/4 v2, 0x0

    .line 14
    invoke-static {v1, v6}, Lcom/google/android/exoplayer2/upstream/u;->y(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    move-result-object v1

    move-object/from16 v19, v2

    const/4 v2, 0x1

    goto :goto_2

    :cond_4
    return-object v4

    .line 15
    :cond_5
    :goto_1
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 16
    invoke-static {v1, v6}, Lcom/google/android/exoplayer2/upstream/u;->y(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    move-result-object v1

    :goto_2
    move-object/from16 v11, p0

    move v4, v0

    move-object/from16 v3, v19

    move-wide/from16 v12, v20

    move-wide/from16 v14, v22

    const/4 v10, 0x1

    move-object/from16 v0, p1

    goto :goto_0

    :cond_6
    move v0, v8

    .line 17
    new-instance v1, Ljava/net/NoRouteToHostException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Too many redirects: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/NoRouteToHostException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :goto_3
    throw v1

    :goto_4
    goto :goto_3
.end method

.method private B(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URL;",
            "I[BJJZZ",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/net/HttpURLConnection;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/upstream/u;->D(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object p1

    .line 2
    iget v0, p0, Lcom/google/android/exoplayer2/upstream/u;->h:I

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 3
    iget v0, p0, Lcom/google/android/exoplayer2/upstream/u;->i:I

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 5
    iget-object v1, p0, Lcom/google/android/exoplayer2/upstream/u;->k:Lcom/google/android/exoplayer2/upstream/y$f;

    if-eqz v1, :cond_0

    .line 6
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/upstream/y$f;->a()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 7
    :cond_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/upstream/u;->l:Lcom/google/android/exoplayer2/upstream/y$f;

    invoke-virtual {v1}, Lcom/google/android/exoplayer2/upstream/y$f;->a()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 8
    invoke-interface {v0, p10}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 9
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p10

    invoke-interface {p10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p10

    :goto_0
    invoke-interface {p10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 10
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    const-wide/16 v2, -0x1

    cmp-long p10, p4, v0

    if-nez p10, :cond_2

    cmp-long p10, p6, v2

    if-eqz p10, :cond_4

    .line 11
    :cond_2
    new-instance p10, Ljava/lang/StringBuilder;

    invoke-direct {p10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "bytes="

    invoke-virtual {p10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p10, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "-"

    invoke-virtual {p10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p10

    cmp-long v0, p6, v2

    if-eqz v0, :cond_3

    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-long/2addr p4, p6

    const-wide/16 p6, 0x1

    sub-long/2addr p4, p6

    invoke-virtual {v0, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p10

    :cond_3
    const-string p4, "Range"

    .line 13
    invoke-virtual {p1, p4, p10}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    :cond_4
    iget-object p4, p0, Lcom/google/android/exoplayer2/upstream/u;->j:Ljava/lang/String;

    if-eqz p4, :cond_5

    const-string p5, "User-Agent"

    .line 15
    invoke-virtual {p1, p5, p4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    if-eqz p8, :cond_6

    const-string p4, "gzip"

    goto :goto_1

    :cond_6
    const-string p4, "identity"

    :goto_1
    const-string p5, "Accept-Encoding"

    .line 16
    invoke-virtual {p1, p5, p4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    invoke-virtual {p1, p9}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    if-eqz p3, :cond_7

    const/4 p4, 0x1

    goto :goto_2

    :cond_7
    const/4 p4, 0x0

    .line 18
    :goto_2
    invoke-virtual {p1, p4}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 19
    invoke-static {p2}, Lcom/google/android/exoplayer2/upstream/p;->c(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    if-eqz p3, :cond_8

    .line 20
    array-length p2, p3

    invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 21
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->connect()V

    .line 22
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p2

    .line 23
    invoke-virtual {p2, p3}, Ljava/io/OutputStream;->write([B)V

    .line 24
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V

    goto :goto_3

    .line 25
    :cond_8
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->connect()V

    :goto_3
    return-object p1
.end method

.method private static C(Ljava/net/HttpURLConnection;J)V
    .locals 3

    if-eqz p0, :cond_4

    .line 1
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_4

    const/16 v1, 0x14

    if-le v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p0

    const-wide/16 v0, -0x1

    cmp-long v2, p1, v0

    if-nez v2, :cond_1

    .line 3
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_2

    return-void

    :cond_1
    const-wide/16 v0, 0x800

    cmp-long v2, p1, v0

    if-gtz v2, :cond_2

    return-void

    .line 4
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"

    .line 5
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    const-string p2, "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"

    .line 6
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 7
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p1

    .line 8
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    const-string p2, "unexpectedEndOfInput"

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Class;

    invoke-virtual {p1, p2, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    const/4 p2, 0x1

    .line 9
    invoke-virtual {p1, p2}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    new-array p2, v0, [Ljava/lang/Object;

    .line 10
    invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_4
    :goto_0
    return-void
.end method

.method private E([BII)I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1
    :cond_0
    iget-wide v0, p0, Lcom/google/android/exoplayer2/upstream/u;->u:J

    const-wide/16 v2, -0x1

    const/4 v4, -0x1

    cmp-long v5, v0, v2

    if-eqz v5, :cond_2

    .line 2
    iget-wide v5, p0, Lcom/google/android/exoplayer2/upstream/u;->w:J

    sub-long/2addr v0, v5

    const-wide/16 v5, 0x0

    cmp-long v7, v0, v5

    if-nez v7, :cond_1

    return v4

    :cond_1
    int-to-long v5, p3

    .line 3
    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p3, v0

    .line 4
    :cond_2
    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/u;->p:Ljava/io/InputStream;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    if-ne p1, v4, :cond_4

    .line 5
    iget-wide p1, p0, Lcom/google/android/exoplayer2/upstream/u;->u:J

    cmp-long p3, p1, v2

    if-nez p3, :cond_3

    return v4

    .line 6
    :cond_3
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    .line 7
    :cond_4
    iget-wide p2, p0, Lcom/google/android/exoplayer2/upstream/u;->w:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Lcom/google/android/exoplayer2/upstream/u;->w:J

    .line 8
    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/upstream/h;->r(I)V

    return p1
.end method

.method private F()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lcom/google/android/exoplayer2/upstream/u;->v:J

    iget-wide v2, p0, Lcom/google/android/exoplayer2/upstream/u;->t:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/u;->q:[B

    if-nez v0, :cond_1

    const/16 v0, 0x1000

    new-array v0, v0, [B

    .line 3
    iput-object v0, p0, Lcom/google/android/exoplayer2/upstream/u;->q:[B

    .line 4
    :cond_1
    :goto_0
    iget-wide v0, p0, Lcom/google/android/exoplayer2/upstream/u;->v:J

    iget-wide v2, p0, Lcom/google/android/exoplayer2/upstream/u;->t:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_4

    sub-long/2addr v2, v0

    .line 5
    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/u;->q:[B

    array-length v0, v0

    int-to-long v0, v0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    .line 6
    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/u;->p:Ljava/io/InputStream;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/InputStream;

    iget-object v2, p0, Lcom/google/android/exoplayer2/upstream/u;->q:[B

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    .line 7
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v1

    if-nez v1, :cond_3

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 8
    iget-wide v1, p0, Lcom/google/android/exoplayer2/upstream/u;->v:J

    int-to-long v3, v0

    add-long/2addr v1, v3

    iput-wide v1, p0, Lcom/google/android/exoplayer2/upstream/u;->v:J

    .line 9
    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/upstream/h;->r(I)V

    goto :goto_0

    .line 10
    :cond_2
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    .line 11
    :cond_3
    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0

    :cond_4
    return-void
.end method

.method private w()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/u;->o:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "DefaultHttpDataSource"

    const-string v2, "Unexpected error while disconnecting"

    .line 3
    invoke-static {v1, v2, v0}, Lc/a/a/a/m2/t;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/google/android/exoplayer2/upstream/u;->o:Ljava/net/HttpURLConnection;

    :cond_0
    return-void
.end method

.method private static x(Ljava/net/HttpURLConnection;)J
    .locals 10

    const-string v0, "Content-Length"

    .line 1
    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const-string v2, "]"

    const-string v3, "DefaultHttpDataSource"

    if-nez v1, :cond_0

    .line 3
    :try_start_0
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 4
    :catch_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unexpected Content-Length ["

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lc/a/a/a/m2/t;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const-wide/16 v4, -0x1

    :goto_0
    const-string v1, "Content-Range"

    .line 5
    invoke-virtual {p0, v1}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 6
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 7
    sget-object v1, Lcom/google/android/exoplayer2/upstream/u;->f:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 8
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v6

    if-eqz v6, :cond_2

    const/4 v6, 0x2

    .line 9
    :try_start_1
    invoke-virtual {v1, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    const/4 v8, 0x1

    .line 10
    invoke-virtual {v1, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v8

    sub-long/2addr v6, v8

    const-wide/16 v8, 0x1

    add-long/2addr v6, v8

    const-wide/16 v8, 0x0

    cmp-long v1, v4, v8

    if-gez v1, :cond_1

    move-wide v4, v6

    goto :goto_1

    :cond_1
    cmp-long v1, v4, v6

    if-eqz v1, :cond_2

    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Inconsistent headers ["

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "] ["

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    move-wide v4, v0

    goto :goto_1

    .line 13
    :catch_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected Content-Range ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Lc/a/a/a/m2/t;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-wide v4
.end method

.method private static y(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 1
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0, p1}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object p0

    const-string p1, "https"

    .line 3
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "http"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported protocol redirect: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-object v0

    .line 5
    :cond_2
    new-instance p0, Ljava/net/ProtocolException;

    const-string p1, "Null location redirect"

    invoke-direct {p0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static z(Ljava/net/HttpURLConnection;)Z
    .locals 1

    const-string v0, "Content-Encoding"

    .line 1
    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "gzip"

    .line 2
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method D(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    check-cast p1, Ljava/net/HttpURLConnection;

    return-object p1
.end method

.method public b([BII)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/upstream/y$c;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/google/android/exoplayer2/upstream/u;->F()V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/exoplayer2/upstream/u;->E([BII)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 3
    new-instance p2, Lcom/google/android/exoplayer2/upstream/y$c;

    iget-object p3, p0, Lcom/google/android/exoplayer2/upstream/u;->n:Lcom/google/android/exoplayer2/upstream/p;

    .line 4
    invoke-static {p3}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/android/exoplayer2/upstream/p;

    const/4 v0, 0x2

    invoke-direct {p2, p1, p3, v0}, Lcom/google/android/exoplayer2/upstream/y$c;-><init>(Ljava/io/IOException;Lcom/google/android/exoplayer2/upstream/p;I)V

    throw p2
.end method

.method public close()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/upstream/y$c;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :try_start_0
    iget-object v2, p0, Lcom/google/android/exoplayer2/upstream/u;->p:Ljava/io/InputStream;

    if-eqz v2, :cond_0

    .line 2
    iget-object v3, p0, Lcom/google/android/exoplayer2/upstream/u;->o:Ljava/net/HttpURLConnection;

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/upstream/u;->v()J

    move-result-wide v4

    invoke-static {v3, v4, v5}, Lcom/google/android/exoplayer2/upstream/u;->C(Ljava/net/HttpURLConnection;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    :try_start_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 4
    :try_start_2
    new-instance v3, Lcom/google/android/exoplayer2/upstream/y$c;

    iget-object v4, p0, Lcom/google/android/exoplayer2/upstream/u;->n:Lcom/google/android/exoplayer2/upstream/p;

    .line 5
    invoke-static {v4}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/exoplayer2/upstream/p;

    const/4 v5, 0x3

    invoke-direct {v3, v2, v4, v5}, Lcom/google/android/exoplayer2/upstream/y$c;-><init>(Ljava/io/IOException;Lcom/google/android/exoplayer2/upstream/p;I)V

    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 6
    :cond_0
    :goto_0
    iput-object v1, p0, Lcom/google/android/exoplayer2/upstream/u;->p:Ljava/io/InputStream;

    .line 7
    invoke-direct {p0}, Lcom/google/android/exoplayer2/upstream/u;->w()V

    .line 8
    iget-boolean v1, p0, Lcom/google/android/exoplayer2/upstream/u;->r:Z

    if-eqz v1, :cond_1

    .line 9
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/upstream/u;->r:Z

    .line 10
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/upstream/h;->s()V

    :cond_1
    return-void

    :catchall_0
    move-exception v2

    .line 11
    iput-object v1, p0, Lcom/google/android/exoplayer2/upstream/u;->p:Ljava/io/InputStream;

    .line 12
    invoke-direct {p0}, Lcom/google/android/exoplayer2/upstream/u;->w()V

    .line 13
    iget-boolean v1, p0, Lcom/google/android/exoplayer2/upstream/u;->r:Z

    if-eqz v1, :cond_2

    .line 14
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/upstream/u;->r:Z

    .line 15
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/upstream/h;->s()V

    .line 16
    :cond_2
    throw v2
.end method

.method public e(Lcom/google/android/exoplayer2/upstream/p;)J
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/upstream/y$c;
        }
    .end annotation

    const-string v0, "Unable to connect"

    .line 1
    iput-object p1, p0, Lcom/google/android/exoplayer2/upstream/u;->n:Lcom/google/android/exoplayer2/upstream/p;

    const-wide/16 v1, 0x0

    .line 2
    iput-wide v1, p0, Lcom/google/android/exoplayer2/upstream/u;->w:J

    .line 3
    iput-wide v1, p0, Lcom/google/android/exoplayer2/upstream/u;->v:J

    .line 4
    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/upstream/h;->t(Lcom/google/android/exoplayer2/upstream/p;)V

    const/4 v3, 0x1

    .line 5
    :try_start_0
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/upstream/u;->A(Lcom/google/android/exoplayer2/upstream/p;)Ljava/net/HttpURLConnection;

    move-result-object v4

    iput-object v4, p0, Lcom/google/android/exoplayer2/upstream/u;->o:Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3

    .line 6
    :try_start_1
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v5

    iput v5, p0, Lcom/google/android/exoplayer2/upstream/u;->s:I

    .line 7
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v8
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 8
    iget v0, p0, Lcom/google/android/exoplayer2/upstream/u;->s:I

    const/16 v5, 0xc8

    if-lt v0, v5, :cond_8

    const/16 v6, 0x12b

    if-le v0, v6, :cond_0

    goto :goto_2

    .line 9
    :cond_0
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getContentType()Ljava/lang/String;

    move-result-object v0

    .line 10
    iget-object v6, p0, Lcom/google/android/exoplayer2/upstream/u;->m:Lc/a/b/a/h;

    if-eqz v6, :cond_2

    invoke-interface {v6, v0}, Lc/a/b/a/h;->apply(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_0

    .line 11
    :cond_1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/upstream/u;->w()V

    .line 12
    new-instance v1, Lcom/google/android/exoplayer2/upstream/y$d;

    invoke-direct {v1, v0, p1}, Lcom/google/android/exoplayer2/upstream/y$d;-><init>(Ljava/lang/String;Lcom/google/android/exoplayer2/upstream/p;)V

    throw v1

    .line 13
    :cond_2
    :goto_0
    iget v0, p0, Lcom/google/android/exoplayer2/upstream/u;->s:I

    if-ne v0, v5, :cond_3

    iget-wide v5, p1, Lcom/google/android/exoplayer2/upstream/p;->g:J

    cmp-long v0, v5, v1

    if-eqz v0, :cond_3

    move-wide v1, v5

    :cond_3
    iput-wide v1, p0, Lcom/google/android/exoplayer2/upstream/u;->t:J

    .line 14
    invoke-static {v4}, Lcom/google/android/exoplayer2/upstream/u;->z(Ljava/net/HttpURLConnection;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 15
    iget-wide v1, p1, Lcom/google/android/exoplayer2/upstream/p;->h:J

    const-wide/16 v5, -0x1

    cmp-long v7, v1, v5

    if-eqz v7, :cond_4

    .line 16
    iput-wide v1, p0, Lcom/google/android/exoplayer2/upstream/u;->u:J

    goto :goto_1

    .line 17
    :cond_4
    invoke-static {v4}, Lcom/google/android/exoplayer2/upstream/u;->x(Ljava/net/HttpURLConnection;)J

    move-result-wide v1

    cmp-long v7, v1, v5

    if-eqz v7, :cond_5

    .line 18
    iget-wide v5, p0, Lcom/google/android/exoplayer2/upstream/u;->t:J

    sub-long v5, v1, v5

    .line 19
    :cond_5
    iput-wide v5, p0, Lcom/google/android/exoplayer2/upstream/u;->u:J

    goto :goto_1

    .line 20
    :cond_6
    iget-wide v1, p1, Lcom/google/android/exoplayer2/upstream/p;->h:J

    iput-wide v1, p0, Lcom/google/android/exoplayer2/upstream/u;->u:J

    .line 21
    :goto_1
    :try_start_2
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/exoplayer2/upstream/u;->p:Ljava/io/InputStream;

    if-eqz v0, :cond_7

    .line 22
    new-instance v0, Ljava/util/zip/GZIPInputStream;

    iget-object v1, p0, Lcom/google/android/exoplayer2/upstream/u;->p:Ljava/io/InputStream;

    invoke-direct {v0, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Lcom/google/android/exoplayer2/upstream/u;->p:Ljava/io/InputStream;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 23
    :cond_7
    iput-boolean v3, p0, Lcom/google/android/exoplayer2/upstream/u;->r:Z

    .line 24
    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/upstream/h;->u(Lcom/google/android/exoplayer2/upstream/p;)V

    .line 25
    iget-wide v0, p0, Lcom/google/android/exoplayer2/upstream/u;->u:J

    return-wide v0

    :catch_0
    move-exception v0

    .line 26
    invoke-direct {p0}, Lcom/google/android/exoplayer2/upstream/u;->w()V

    .line 27
    new-instance v1, Lcom/google/android/exoplayer2/upstream/y$c;

    invoke-direct {v1, v0, p1, v3}, Lcom/google/android/exoplayer2/upstream/y$c;-><init>(Ljava/io/IOException;Lcom/google/android/exoplayer2/upstream/p;I)V

    throw v1

    .line 28
    :cond_8
    :goto_2
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v9

    .line 29
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 30
    :try_start_3
    invoke-static {v0}, Lc/a/a/a/m2/m0;->H0(Ljava/io/InputStream;)[B

    move-result-object v0

    goto :goto_3

    :cond_9
    sget-object v0, Lc/a/a/a/m2/m0;->f:[B
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :goto_3
    move-object v11, v0

    goto :goto_4

    .line 31
    :catch_1
    sget-object v0, Lc/a/a/a/m2/m0;->f:[B

    goto :goto_3

    .line 32
    :goto_4
    invoke-direct {p0}, Lcom/google/android/exoplayer2/upstream/u;->w()V

    .line 33
    new-instance v0, Lcom/google/android/exoplayer2/upstream/y$e;

    iget v7, p0, Lcom/google/android/exoplayer2/upstream/u;->s:I

    move-object v6, v0

    move-object v10, p1

    invoke-direct/range {v6 .. v11}, Lcom/google/android/exoplayer2/upstream/y$e;-><init>(ILjava/lang/String;Ljava/util/Map;Lcom/google/android/exoplayer2/upstream/p;[B)V

    .line 34
    iget p1, p0, Lcom/google/android/exoplayer2/upstream/u;->s:I

    const/16 v1, 0x1a0

    if-ne p1, v1, :cond_a

    .line 35
    new-instance p1, Lcom/google/android/exoplayer2/upstream/n;

    const/4 v1, 0x0

    invoke-direct {p1, v1}, Lcom/google/android/exoplayer2/upstream/n;-><init>(I)V

    invoke-virtual {v0, p1}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 36
    :cond_a
    throw v0

    :catch_2
    move-exception v1

    .line 37
    invoke-direct {p0}, Lcom/google/android/exoplayer2/upstream/u;->w()V

    .line 38
    new-instance v2, Lcom/google/android/exoplayer2/upstream/y$c;

    invoke-direct {v2, v0, v1, p1, v3}, Lcom/google/android/exoplayer2/upstream/y$c;-><init>(Ljava/lang/String;Ljava/io/IOException;Lcom/google/android/exoplayer2/upstream/p;I)V

    throw v2

    :catch_3
    move-exception v1

    .line 39
    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_b

    .line 40
    invoke-static {v2}, Lc/a/a/a/m2/m0;->J0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "cleartext http traffic.*not permitted.*"

    invoke-virtual {v2, v4}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 41
    new-instance v0, Lcom/google/android/exoplayer2/upstream/y$a;

    invoke-direct {v0, v1, p1}, Lcom/google/android/exoplayer2/upstream/y$a;-><init>(Ljava/io/IOException;Lcom/google/android/exoplayer2/upstream/p;)V

    throw v0

    .line 42
    :cond_b
    new-instance v2, Lcom/google/android/exoplayer2/upstream/y$c;

    invoke-direct {v2, v0, v1, p1, v3}, Lcom/google/android/exoplayer2/upstream/y$c;-><init>(Ljava/lang/String;Ljava/io/IOException;Lcom/google/android/exoplayer2/upstream/p;I)V

    goto :goto_6

    :goto_5
    throw v2

    :goto_6
    goto :goto_5
.end method

.method public g()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/u;->o:Ljava/net/HttpURLConnection;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public l()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/u;->o:Ljava/net/HttpURLConnection;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method protected final v()J
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/google/android/exoplayer2/upstream/u;->u:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lcom/google/android/exoplayer2/upstream/u;->w:J

    sub-long/2addr v0, v2

    :goto_0
    return-wide v0
.end method
