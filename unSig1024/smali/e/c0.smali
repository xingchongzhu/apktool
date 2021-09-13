.class public abstract Le/c0;
.super Ljava/lang/Object;
.source "ResponseBody.java"

# interfaces
.implements Ljava/io/Closeable;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private B()Ljava/nio/charset/Charset;
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/c0;->D()Le/v;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v1, Le/f0/c;->j:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Le/v;->b(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Le/f0/c;->j:Ljava/nio/charset/Charset;

    :goto_0
    return-object v0
.end method

.method public static E(Le/v;JLf/e;)Le/c0;
    .locals 1

    const-string v0, "source == null"

    .line 1
    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    new-instance v0, Le/c0$a;

    invoke-direct {v0, p0, p1, p2, p3}, Le/c0$a;-><init>(Le/v;JLf/e;)V

    return-object v0
.end method

.method public static F(Le/v;Ljava/lang/String;)Le/c0;
    .locals 2

    .line 1
    sget-object v0, Le/f0/c;->j:Ljava/nio/charset/Charset;

    if-eqz p0, :cond_1

    .line 2
    invoke-virtual {p0}, Le/v;->a()Ljava/nio/charset/Charset;

    move-result-object v1

    if-nez v1, :cond_0

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "; charset=utf-8"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Le/v;->d(Ljava/lang/String;)Le/v;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 4
    :cond_1
    :goto_0
    new-instance v1, Lf/c;

    invoke-direct {v1}, Lf/c;-><init>()V

    invoke-virtual {v1, p1, v0}, Lf/c;->h0(Ljava/lang/String;Ljava/nio/charset/Charset;)Lf/c;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lf/c;->Q()J

    move-result-wide v0

    invoke-static {p0, v0, v1, p1}, Le/c0;->E(Le/v;JLf/e;)Le/c0;

    move-result-object p0

    return-object p0
.end method

.method public static G(Le/v;[B)Le/c0;
    .locals 3

    .line 1
    new-instance v0, Lf/c;

    invoke-direct {v0}, Lf/c;-><init>()V

    invoke-virtual {v0, p1}, Lf/c;->Z([B)Lf/c;

    move-result-object v0

    .line 2
    array-length p1, p1

    int-to-long v1, p1

    invoke-static {p0, v1, v2, v0}, Le/c0;->E(Le/v;JLf/e;)Le/c0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract C()J
.end method

.method public abstract D()Le/v;
.end method

.method public abstract H()Lf/e;
.end method

.method public final I()Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/c0;->H()Lf/e;

    move-result-object v0

    .line 2
    :try_start_0
    invoke-direct {p0}, Le/c0;->B()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-static {v0, v1}, Le/f0/c;->c(Lf/e;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v1

    .line 3
    invoke-interface {v0, v1}, Lf/e;->A(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    invoke-static {v0}, Le/f0/c;->f(Ljava/io/Closeable;)V

    return-object v1

    :catchall_0
    move-exception v1

    invoke-static {v0}, Le/f0/c;->f(Ljava/io/Closeable;)V

    throw v1
.end method

.method public close()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/c0;->H()Lf/e;

    move-result-object v0

    invoke-static {v0}, Le/f0/c;->f(Ljava/io/Closeable;)V

    return-void
.end method
