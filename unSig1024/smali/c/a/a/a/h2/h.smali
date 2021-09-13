.class public abstract Lc/a/a/a/h2/h;
.super Ljava/lang/Object;
.source "SimpleMetadataDecoder.java"

# interfaces
.implements Lc/a/a/a/h2/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lc/a/a/a/h2/e;)Lc/a/a/a/h2/a;
    .locals 2

    .line 1
    iget-object v0, p1, Lc/a/a/a/c2/f;->c:Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    .line 2
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 3
    :goto_0
    invoke-static {v1}, Lc/a/a/a/m2/f;->a(Z)V

    .line 4
    invoke-virtual {p1}, Lc/a/a/a/c2/a;->j()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1, v0}, Lc/a/a/a/h2/h;->b(Lc/a/a/a/h2/e;Ljava/nio/ByteBuffer;)Lc/a/a/a/h2/a;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method protected abstract b(Lc/a/a/a/h2/e;Ljava/nio/ByteBuffer;)Lc/a/a/a/h2/a;
.end method
