.class public final Lc/a/a/a/h2/j/b;
.super Lc/a/a/a/h2/h;
.source "EventMessageDecoder.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/a/a/a/h2/h;-><init>()V

    return-void
.end method


# virtual methods
.method protected b(Lc/a/a/a/h2/e;Ljava/nio/ByteBuffer;)Lc/a/a/a/h2/a;
    .locals 3

    .line 1
    new-instance p1, Lc/a/a/a/h2/a;

    const/4 v0, 0x1

    new-array v0, v0, [Lc/a/a/a/h2/a$b;

    new-instance v1, Lc/a/a/a/m2/a0;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->limit()I

    move-result p2

    invoke-direct {v1, v2, p2}, Lc/a/a/a/m2/a0;-><init>([BI)V

    invoke-virtual {p0, v1}, Lc/a/a/a/h2/j/b;->c(Lc/a/a/a/m2/a0;)Lc/a/a/a/h2/j/a;

    move-result-object p2

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-direct {p1, v0}, Lc/a/a/a/h2/a;-><init>([Lc/a/a/a/h2/a$b;)V

    return-object p1
.end method

.method public c(Lc/a/a/a/m2/a0;)Lc/a/a/a/h2/j/a;
    .locals 9

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->x()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 2
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->x()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 3
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->F()J

    move-result-wide v4

    .line 4
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->F()J

    move-result-wide v6

    .line 5
    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->e()I

    move-result v1

    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->f()I

    move-result p1

    invoke-static {v0, v1, p1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v8

    .line 6
    new-instance p1, Lc/a/a/a/h2/j/a;

    move-object v1, p1

    invoke-direct/range {v1 .. v8}, Lc/a/a/a/h2/j/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    return-object p1
.end method
