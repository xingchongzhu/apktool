.class final Le/f0/i/h;
.super Ljava/lang/Object;
.source "Http2Reader.java"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/f0/i/h$b;,
        Le/f0/i/h$a;
    }
.end annotation


# static fields
.field static final a:Ljava/util/logging/Logger;


# instance fields
.field private final b:Lf/e;

.field private final c:Le/f0/i/h$a;

.field private final d:Z

.field final e:Le/f0/i/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Le/f0/i/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Le/f0/i/h;->a:Ljava/util/logging/Logger;

    return-void
.end method

.method constructor <init>(Lf/e;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f0/i/h;->b:Lf/e;

    .line 3
    iput-boolean p2, p0, Le/f0/i/h;->d:Z

    .line 4
    new-instance p2, Le/f0/i/h$a;

    invoke-direct {p2, p1}, Le/f0/i/h$a;-><init>(Lf/e;)V

    iput-object p2, p0, Le/f0/i/h;->c:Le/f0/i/h$a;

    .line 5
    new-instance p1, Le/f0/i/d$a;

    const/16 v0, 0x1000

    invoke-direct {p1, v0, p2}, Le/f0/i/d$a;-><init>(ILf/s;)V

    iput-object p1, p0, Le/f0/i/h;->e:Le/f0/i/d$a;

    return-void
.end method

.method static B(IBS)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    and-int/lit8 p1, p1, 0x8

    if-eqz p1, :cond_0

    add-int/lit8 p0, p0, -0x1

    :cond_0
    if-gt p2, p0, :cond_1

    sub-int/2addr p0, p2

    int-to-short p0, p0

    return p0

    :cond_1
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    .line 1
    invoke-static {p2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p2

    aput-object p2, p1, v0

    const/4 p2, 0x1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, p1, p2

    const-string p0, "PROTOCOL_ERROR padding %s > remaining length %s"

    invoke-static {p0, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p0

    throw p0
.end method

.method private E(Le/f0/i/h$b;IBI)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p4, :cond_4

    and-int/lit8 v1, p3, 0x1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v3, p3, 0x20

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_3

    and-int/lit8 v2, p3, 0x8

    if-eqz v2, :cond_2

    .line 1
    iget-object v0, p0, Le/f0/i/h;->b:Lf/e;

    invoke-interface {v0}, Lf/e;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    int-to-short v0, v0

    .line 2
    :cond_2
    invoke-static {p2, p3, v0}, Le/f0/i/h;->B(IBS)I

    move-result p2

    .line 3
    iget-object p3, p0, Le/f0/i/h;->b:Lf/e;

    invoke-interface {p1, v1, p4, p3, p2}, Le/f0/i/h$b;->c(ZILf/e;I)V

    .line 4
    iget-object p1, p0, Le/f0/i/h;->b:Lf/e;

    int-to-long p2, v0

    invoke-interface {p1, p2, p3}, Lf/e;->a(J)V

    return-void

    :cond_3
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"

    .line 5
    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_4
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "PROTOCOL_ERROR: TYPE_DATA streamId == 0"

    .line 6
    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method

.method private F(Le/f0/i/h$b;IBI)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p3, 0x1

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-lt p2, v0, :cond_3

    if-nez p4, :cond_2

    .line 1
    iget-object p4, p0, Le/f0/i/h;->b:Lf/e;

    invoke-interface {p4}, Lf/e;->readInt()I

    move-result p4

    .line 2
    iget-object v2, p0, Le/f0/i/h;->b:Lf/e;

    invoke-interface {v2}, Lf/e;->readInt()I

    move-result v2

    sub-int/2addr p2, v0

    .line 3
    invoke-static {v2}, Le/f0/i/b;->a(I)Le/f0/i/b;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    sget-object p3, Lf/f;->b:Lf/f;

    if-lez p2, :cond_0

    .line 5
    iget-object p3, p0, Le/f0/i/h;->b:Lf/e;

    int-to-long v1, p2

    invoke-interface {p3, v1, v2}, Lf/e;->b(J)Lf/f;

    move-result-object p3

    .line 6
    :cond_0
    invoke-interface {p1, p4, v0, p3}, Le/f0/i/h$b;->j(ILe/f0/i/b;Lf/f;)V

    return-void

    :cond_1
    new-array p1, p3, [Ljava/lang/Object;

    .line 7
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v1

    const-string p2, "TYPE_GOAWAY unexpected error code: %d"

    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_2
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "TYPE_GOAWAY streamId != 0"

    .line 8
    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    .line 9
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v1

    const-string p2, "TYPE_GOAWAY length < 8: %s"

    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method

.method private G(ISBI)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ISBI)",
            "Ljava/util/List<",
            "Le/f0/i/c;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f0/i/h;->c:Le/f0/i/h$a;

    iput p1, v0, Le/f0/i/h$a;->e:I

    iput p1, v0, Le/f0/i/h$a;->b:I

    .line 2
    iput-short p2, v0, Le/f0/i/h$a;->f:S

    .line 3
    iput-byte p3, v0, Le/f0/i/h$a;->c:B

    .line 4
    iput p4, v0, Le/f0/i/h$a;->d:I

    .line 5
    iget-object p1, p0, Le/f0/i/h;->e:Le/f0/i/d$a;

    invoke-virtual {p1}, Le/f0/i/d$a;->k()V

    .line 6
    iget-object p1, p0, Le/f0/i/h;->e:Le/f0/i/d$a;

    invoke-virtual {p1}, Le/f0/i/d$a;->e()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private H(Le/f0/i/h$b;IBI)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p4, :cond_3

    and-int/lit8 v1, p3, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p3, 0x8

    if-eqz v2, :cond_1

    .line 1
    iget-object v0, p0, Le/f0/i/h;->b:Lf/e;

    invoke-interface {v0}, Lf/e;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    int-to-short v0, v0

    :cond_1
    and-int/lit8 v2, p3, 0x20

    if-eqz v2, :cond_2

    .line 2
    invoke-direct {p0, p1, p4}, Le/f0/i/h;->K(Le/f0/i/h$b;I)V

    add-int/lit8 p2, p2, -0x5

    .line 3
    :cond_2
    invoke-static {p2, p3, v0}, Le/f0/i/h;->B(IBS)I

    move-result p2

    .line 4
    invoke-direct {p0, p2, v0, p3, p4}, Le/f0/i/h;->G(ISBI)Ljava/util/List;

    move-result-object p2

    const/4 p3, -0x1

    .line 5
    invoke-interface {p1, v1, p4, p3, p2}, Le/f0/i/h$b;->g(ZIILjava/util/List;)V

    return-void

    :cond_3
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"

    .line 6
    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method

.method static I(Lf/e;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lf/e;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x10

    .line 2
    invoke-interface {p0}, Lf/e;->readByte()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    .line 3
    invoke-interface {p0}, Lf/e;->readByte()B

    move-result p0

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0
.end method

.method private J(Le/f0/i/h$b;IBI)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/16 v2, 0x8

    if-ne p2, v2, :cond_2

    if-nez p4, :cond_1

    .line 1
    iget-object p2, p0, Le/f0/i/h;->b:Lf/e;

    invoke-interface {p2}, Lf/e;->readInt()I

    move-result p2

    .line 2
    iget-object p4, p0, Le/f0/i/h;->b:Lf/e;

    invoke-interface {p4}, Lf/e;->readInt()I

    move-result p4

    and-int/2addr p3, v1

    if-eqz p3, :cond_0

    const/4 v0, 0x1

    .line 3
    :cond_0
    invoke-interface {p1, v0, p2, p4}, Le/f0/i/h$b;->d(ZII)V

    return-void

    :cond_1
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "TYPE_PING streamId != 0"

    .line 4
    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_2
    new-array p1, v1, [Ljava/lang/Object;

    .line 5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v0

    const-string p2, "TYPE_PING length != 8: %s"

    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method

.method private K(Le/f0/i/h$b;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f0/i/h;->b:Lf/e;

    invoke-interface {v0}, Lf/e;->readInt()I

    move-result v0

    const/high16 v1, -0x80000000

    and-int/2addr v1, v0

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const v3, 0x7fffffff

    and-int/2addr v0, v3

    .line 2
    iget-object v3, p0, Le/f0/i/h;->b:Lf/e;

    invoke-interface {v3}, Lf/e;->readByte()B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v3, v2

    .line 3
    invoke-interface {p1, p2, v0, v3, v1}, Le/f0/i/h$b;->e(IIIZ)V

    return-void
.end method

.method private L(Le/f0/i/h$b;IBI)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p3, 0x0

    const/4 v0, 0x5

    if-ne p2, v0, :cond_1

    if-eqz p4, :cond_0

    .line 1
    invoke-direct {p0, p1, p4}, Le/f0/i/h;->K(Le/f0/i/h$b;I)V

    return-void

    :cond_0
    new-array p1, p3, [Ljava/lang/Object;

    const-string p2, "TYPE_PRIORITY streamId == 0"

    .line 2
    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_1
    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/Object;

    .line 3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, p3

    const-string p2, "TYPE_PRIORITY length: %d != 5"

    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method

.method private M(Le/f0/i/h$b;IBI)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p4, :cond_1

    and-int/lit8 v1, p3, 0x8

    if-eqz v1, :cond_0

    .line 1
    iget-object v0, p0, Le/f0/i/h;->b:Lf/e;

    invoke-interface {v0}, Lf/e;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    int-to-short v0, v0

    .line 2
    :cond_0
    iget-object v1, p0, Le/f0/i/h;->b:Lf/e;

    invoke-interface {v1}, Lf/e;->readInt()I

    move-result v1

    const v2, 0x7fffffff

    and-int/2addr v1, v2

    add-int/lit8 p2, p2, -0x4

    .line 3
    invoke-static {p2, p3, v0}, Le/f0/i/h;->B(IBS)I

    move-result p2

    .line 4
    invoke-direct {p0, p2, v0, p3, p4}, Le/f0/i/h;->G(ISBI)Ljava/util/List;

    move-result-object p2

    .line 5
    invoke-interface {p1, p4, v1, p2}, Le/f0/i/h$b;->i(IILjava/util/List;)V

    return-void

    :cond_1
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"

    .line 6
    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method

.method private N(Le/f0/i/h$b;IBI)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x4

    if-ne p2, v1, :cond_2

    if-eqz p4, :cond_1

    .line 1
    iget-object p2, p0, Le/f0/i/h;->b:Lf/e;

    invoke-interface {p2}, Lf/e;->readInt()I

    move-result p2

    .line 2
    invoke-static {p2}, Le/f0/i/b;->a(I)Le/f0/i/b;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    invoke-interface {p1, p4, v1}, Le/f0/i/h$b;->f(ILe/f0/i/b;)V

    return-void

    :cond_0
    new-array p1, p3, [Ljava/lang/Object;

    .line 4
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v0

    const-string p2, "TYPE_RST_STREAM unexpected error code: %d"

    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_1
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "TYPE_RST_STREAM streamId == 0"

    .line 5
    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_2
    new-array p1, p3, [Ljava/lang/Object;

    .line 6
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v0

    const-string p2, "TYPE_RST_STREAM length: %d != 4"

    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method

.method private O(Le/f0/i/h$b;IBI)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p4, :cond_c

    const/4 p4, 0x1

    and-int/2addr p3, p4

    if-eqz p3, :cond_1

    if-nez p2, :cond_0

    .line 1
    invoke-interface {p1}, Le/f0/i/h$b;->a()V

    return-void

    :cond_0
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "FRAME_SIZE_ERROR ack frame should be empty!"

    .line 2
    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 3
    :cond_1
    rem-int/lit8 p3, p2, 0x6

    if-nez p3, :cond_b

    .line 4
    new-instance p3, Le/f0/i/m;

    invoke-direct {p3}, Le/f0/i/m;-><init>()V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_a

    .line 5
    iget-object v2, p0, Le/f0/i/h;->b:Lf/e;

    invoke-interface {v2}, Lf/e;->readShort()S

    move-result v2

    const v3, 0xffff

    and-int/2addr v2, v3

    .line 6
    iget-object v3, p0, Le/f0/i/h;->b:Lf/e;

    invoke-interface {v3}, Lf/e;->readInt()I

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-eq v2, v4, :cond_7

    const/4 v4, 0x3

    if-eq v2, v4, :cond_6

    if-eq v2, v5, :cond_4

    const/4 v4, 0x5

    if-eq v2, v4, :cond_2

    goto :goto_1

    :cond_2
    const/16 v4, 0x4000

    if-lt v3, v4, :cond_3

    const v4, 0xffffff

    if-gt v3, v4, :cond_3

    goto :goto_1

    :cond_3
    new-array p1, p4, [Ljava/lang/Object;

    .line 7
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v0

    const-string p2, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"

    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_4
    const/4 v2, 0x7

    if-ltz v3, :cond_5

    goto :goto_1

    :cond_5
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"

    .line 8
    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_6
    const/4 v2, 0x4

    goto :goto_1

    :cond_7
    if-eqz v3, :cond_9

    if-ne v3, p4, :cond_8

    goto :goto_1

    :cond_8
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"

    .line 9
    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 10
    :cond_9
    :goto_1
    invoke-virtual {p3, v2, v3}, Le/f0/i/m;->i(II)Le/f0/i/m;

    add-int/lit8 v1, v1, 0x6

    goto :goto_0

    .line 11
    :cond_a
    invoke-interface {p1, v0, p3}, Le/f0/i/h$b;->b(ZLe/f0/i/m;)V

    return-void

    :cond_b
    new-array p1, p4, [Ljava/lang/Object;

    .line 12
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v0

    const-string p2, "TYPE_SETTINGS length %% 6 != 0: %s"

    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_c
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "TYPE_SETTINGS streamId != 0"

    .line 13
    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method private P(Le/f0/i/h$b;IBI)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p3, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x4

    if-ne p2, v1, :cond_1

    .line 1
    iget-object p2, p0, Le/f0/i/h;->b:Lf/e;

    invoke-interface {p2}, Lf/e;->readInt()I

    move-result p2

    int-to-long v1, p2

    const-wide/32 v3, 0x7fffffff

    and-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long p2, v1, v3

    if-eqz p2, :cond_0

    .line 2
    invoke-interface {p1, p4, v1, v2}, Le/f0/i/h$b;->h(IJ)V

    return-void

    :cond_0
    new-array p1, v0, [Ljava/lang/Object;

    .line 3
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    aput-object p2, p1, p3

    const-string p2, "windowSizeIncrement was 0"

    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_1
    new-array p1, v0, [Ljava/lang/Object;

    .line 4
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, p3

    const-string p2, "TYPE_WINDOW_UPDATE length !=4: %s"

    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method


# virtual methods
.method public C(ZLe/f0/i/h$b;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget-object v1, p0, Le/f0/i/h;->b:Lf/e;

    const-wide/16 v2, 0x9

    invoke-interface {v1, v2, v3}, Lf/e;->v(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    iget-object v1, p0, Le/f0/i/h;->b:Lf/e;

    invoke-static {v1}, Le/f0/i/h;->I(Lf/e;)I

    move-result v1

    const/4 v2, 0x1

    if-ltz v1, :cond_3

    const/16 v3, 0x4000

    if-gt v1, v3, :cond_3

    .line 3
    iget-object v3, p0, Le/f0/i/h;->b:Lf/e;

    invoke-interface {v3}, Lf/e;->readByte()B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    if-eqz p1, :cond_1

    const/4 p1, 0x4

    if-ne v3, p1, :cond_0

    goto :goto_0

    :cond_0
    new-array p1, v2, [Ljava/lang/Object;

    .line 4
    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p2

    aput-object p2, p1, v0

    const-string p2, "Expected a SETTINGS frame but was %s"

    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 5
    :cond_1
    :goto_0
    iget-object p1, p0, Le/f0/i/h;->b:Lf/e;

    invoke-interface {p1}, Lf/e;->readByte()B

    move-result p1

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    .line 6
    iget-object v0, p0, Le/f0/i/h;->b:Lf/e;

    invoke-interface {v0}, Lf/e;->readInt()I

    move-result v0

    const v4, 0x7fffffff

    and-int/2addr v0, v4

    .line 7
    sget-object v4, Le/f0/i/h;->a:Ljava/util/logging/Logger;

    sget-object v5, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v4, v5}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-static {v2, v0, v1, v3, p1}, Le/f0/i/e;->b(ZIIBB)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_2
    packed-switch v3, :pswitch_data_0

    .line 8
    iget-object p1, p0, Le/f0/i/h;->b:Lf/e;

    int-to-long v0, v1

    invoke-interface {p1, v0, v1}, Lf/e;->a(J)V

    goto :goto_1

    .line 9
    :pswitch_0
    invoke-direct {p0, p2, v1, p1, v0}, Le/f0/i/h;->P(Le/f0/i/h$b;IBI)V

    goto :goto_1

    .line 10
    :pswitch_1
    invoke-direct {p0, p2, v1, p1, v0}, Le/f0/i/h;->F(Le/f0/i/h$b;IBI)V

    goto :goto_1

    .line 11
    :pswitch_2
    invoke-direct {p0, p2, v1, p1, v0}, Le/f0/i/h;->J(Le/f0/i/h$b;IBI)V

    goto :goto_1

    .line 12
    :pswitch_3
    invoke-direct {p0, p2, v1, p1, v0}, Le/f0/i/h;->M(Le/f0/i/h$b;IBI)V

    goto :goto_1

    .line 13
    :pswitch_4
    invoke-direct {p0, p2, v1, p1, v0}, Le/f0/i/h;->O(Le/f0/i/h$b;IBI)V

    goto :goto_1

    .line 14
    :pswitch_5
    invoke-direct {p0, p2, v1, p1, v0}, Le/f0/i/h;->N(Le/f0/i/h$b;IBI)V

    goto :goto_1

    .line 15
    :pswitch_6
    invoke-direct {p0, p2, v1, p1, v0}, Le/f0/i/h;->L(Le/f0/i/h$b;IBI)V

    goto :goto_1

    .line 16
    :pswitch_7
    invoke-direct {p0, p2, v1, p1, v0}, Le/f0/i/h;->H(Le/f0/i/h$b;IBI)V

    goto :goto_1

    .line 17
    :pswitch_8
    invoke-direct {p0, p2, v1, p1, v0}, Le/f0/i/h;->E(Le/f0/i/h$b;IBI)V

    :goto_1
    return v2

    :cond_3
    new-array p1, v2, [Ljava/lang/Object;

    .line 18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v0

    const-string p2, "FRAME_SIZE_ERROR: %s"

    invoke-static {p2, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :catch_0
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public D(Le/f0/i/h$b;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Le/f0/i/h;->d:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p0, v2, p1}, Le/f0/i/h;->C(ZLe/f0/i/h$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-array p1, v1, [Ljava/lang/Object;

    const-string v0, "Required SETTINGS preface not received"

    .line 3
    invoke-static {v0, p1}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 4
    :cond_1
    iget-object p1, p0, Le/f0/i/h;->b:Lf/e;

    sget-object v0, Le/f0/i/e;->a:Lf/f;

    invoke-virtual {v0}, Lf/f;->o()I

    move-result v3

    int-to-long v3, v3

    invoke-interface {p1, v3, v4}, Lf/e;->b(J)Lf/f;

    move-result-object p1

    .line 5
    sget-object v3, Le/f0/i/h;->a:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v3, v4}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v4

    if-eqz v4, :cond_2

    new-array v4, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lf/f;->i()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v1

    const-string v5, "<< CONNECTION %s"

    invoke-static {v5, v4}, Le/f0/c;->q(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 6
    :cond_2
    invoke-virtual {v0, p1}, Lf/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_0
    return-void

    :cond_3
    new-array v0, v2, [Ljava/lang/Object;

    .line 7
    invoke-virtual {p1}, Lf/f;->t()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "Expected a connection header but was %s"

    invoke-static {p1, v0}, Le/f0/i/e;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f0/i/h;->b:Lf/e;

    invoke-interface {v0}, Lf/s;->close()V

    return-void
.end method
