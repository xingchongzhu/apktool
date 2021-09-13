.class public abstract Lc/a/a/a/k2/d;
.super Lc/a/a/a/c2/i;
.source "SimpleSubtitleDecoder.java"

# interfaces
.implements Lc/a/a/a/k2/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/a/a/a/c2/i<",
        "Lc/a/a/a/k2/j;",
        "Lc/a/a/a/k2/k;",
        "Lc/a/a/a/k2/h;",
        ">;",
        "Lc/a/a/a/k2/g;"
    }
.end annotation


# instance fields
.field private final n:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x2

    new-array v1, v0, [Lc/a/a/a/k2/j;

    new-array v0, v0, [Lc/a/a/a/k2/k;

    .line 1
    invoke-direct {p0, v1, v0}, Lc/a/a/a/c2/i;-><init>([Lc/a/a/a/c2/f;[Lc/a/a/a/c2/h;)V

    .line 2
    iput-object p1, p0, Lc/a/a/a/k2/d;->n:Ljava/lang/String;

    const/16 p1, 0x400

    .line 3
    invoke-virtual {p0, p1}, Lc/a/a/a/c2/i;->v(I)V

    return-void
.end method

.method public static synthetic B(Lc/a/a/a/k2/d;Lc/a/a/a/c2/h;)V
    .locals 0

    invoke-virtual {p0, p1}, Lc/a/a/a/c2/i;->s(Lc/a/a/a/c2/h;)V

    return-void
.end method


# virtual methods
.method protected final A(Lc/a/a/a/k2/j;Lc/a/a/a/k2/k;Z)Lc/a/a/a/k2/h;
    .locals 8

    .line 1
    :try_start_0
    iget-object v0, p1, Lc/a/a/a/c2/f;->c:Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    .line 2
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    invoke-virtual {p0, v1, v0, p3}, Lc/a/a/a/k2/d;->z([BIZ)Lc/a/a/a/k2/f;

    move-result-object v5

    .line 3
    iget-wide v3, p1, Lc/a/a/a/c2/f;->e:J

    iget-wide v6, p1, Lc/a/a/a/k2/j;->i:J

    move-object v2, p2

    invoke-virtual/range {v2 .. v7}, Lc/a/a/a/k2/k;->o(JLc/a/a/a/k2/f;J)V

    const/high16 p1, -0x80000000

    .line 4
    invoke-virtual {p2, p1}, Lc/a/a/a/c2/a;->g(I)V
    :try_end_0
    .catch Lc/a/a/a/k2/h; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception p1

    return-object p1
.end method

.method public b(J)V
    .locals 0

    return-void
.end method

.method protected bridge synthetic h()Lc/a/a/a/c2/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/k2/d;->w()Lc/a/a/a/k2/j;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic i()Lc/a/a/a/c2/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/k2/d;->x()Lc/a/a/a/k2/k;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic j(Ljava/lang/Throwable;)Lc/a/a/a/c2/e;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc/a/a/a/k2/d;->y(Ljava/lang/Throwable;)Lc/a/a/a/k2/h;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic k(Lc/a/a/a/c2/f;Lc/a/a/a/c2/h;Z)Lc/a/a/a/c2/e;
    .locals 0

    .line 1
    check-cast p1, Lc/a/a/a/k2/j;

    check-cast p2, Lc/a/a/a/k2/k;

    invoke-virtual {p0, p1, p2, p3}, Lc/a/a/a/k2/d;->A(Lc/a/a/a/k2/j;Lc/a/a/a/k2/k;Z)Lc/a/a/a/k2/h;

    move-result-object p1

    return-object p1
.end method

.method protected final w()Lc/a/a/a/k2/j;
    .locals 1

    .line 1
    new-instance v0, Lc/a/a/a/k2/j;

    invoke-direct {v0}, Lc/a/a/a/k2/j;-><init>()V

    return-object v0
.end method

.method protected final x()Lc/a/a/a/k2/k;
    .locals 2

    .line 1
    new-instance v0, Lc/a/a/a/k2/e;

    new-instance v1, Lc/a/a/a/k2/a;

    invoke-direct {v1, p0}, Lc/a/a/a/k2/a;-><init>(Lc/a/a/a/k2/d;)V

    invoke-direct {v0, v1}, Lc/a/a/a/k2/e;-><init>(Lc/a/a/a/c2/h$a;)V

    return-object v0
.end method

.method protected final y(Ljava/lang/Throwable;)Lc/a/a/a/k2/h;
    .locals 2

    .line 1
    new-instance v0, Lc/a/a/a/k2/h;

    const-string v1, "Unexpected decode error"

    invoke-direct {v0, v1, p1}, Lc/a/a/a/k2/h;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method protected abstract z([BIZ)Lc/a/a/a/k2/f;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/k2/h;
        }
    .end annotation
.end method
