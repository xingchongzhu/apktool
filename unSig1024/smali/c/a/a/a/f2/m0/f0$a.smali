.class final Lc/a/a/a/f2/m0/f0$a;
.super Ljava/lang/Object;
.source "TsBinarySearchSeeker.java"

# interfaces
.implements Lc/a/a/a/f2/b$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/f2/m0/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lc/a/a/a/m2/j0;

.field private final b:Lc/a/a/a/m2/a0;

.field private final c:I

.field private final d:I


# direct methods
.method public constructor <init>(ILc/a/a/a/m2/j0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lc/a/a/a/f2/m0/f0$a;->c:I

    .line 3
    iput-object p2, p0, Lc/a/a/a/f2/m0/f0$a;->a:Lc/a/a/a/m2/j0;

    .line 4
    iput p3, p0, Lc/a/a/a/f2/m0/f0$a;->d:I

    .line 5
    new-instance p1, Lc/a/a/a/m2/a0;

    invoke-direct {p1}, Lc/a/a/a/m2/a0;-><init>()V

    iput-object p1, p0, Lc/a/a/a/f2/m0/f0$a;->b:Lc/a/a/a/m2/a0;

    return-void
.end method

.method private c(Lc/a/a/a/m2/a0;JJ)Lc/a/a/a/f2/b$e;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v2, p4

    .line 1
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/m2/a0;->f()I

    move-result v4

    const-wide/16 v5, -0x1

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    move-wide v9, v5

    move-wide v11, v7

    .line 2
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/m2/a0;->a()I

    move-result v13

    const/16 v14, 0xbc

    if-lt v13, v14, :cond_5

    .line 3
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/m2/a0;->e()I

    move-result v14

    invoke-static {v13, v14, v4}, Lc/a/a/a/f2/m0/j0;->a([BII)I

    move-result v13

    add-int/lit16 v14, v13, 0xbc

    if-le v14, v4, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    iget v5, v0, Lc/a/a/a/f2/m0/f0$a;->c:I

    invoke-static {v1, v13, v5}, Lc/a/a/a/f2/m0/j0;->b(Lc/a/a/a/m2/a0;II)J

    move-result-wide v5

    cmp-long v15, v5, v7

    if-eqz v15, :cond_4

    .line 5
    iget-object v15, v0, Lc/a/a/a/f2/m0/f0$a;->a:Lc/a/a/a/m2/j0;

    invoke-virtual {v15, v5, v6}, Lc/a/a/a/m2/j0;->b(J)J

    move-result-wide v5

    cmp-long v15, v5, p2

    if-lez v15, :cond_2

    cmp-long v1, v11, v7

    if-nez v1, :cond_1

    .line 6
    invoke-static {v5, v6, v2, v3}, Lc/a/a/a/f2/b$e;->d(JJ)Lc/a/a/a/f2/b$e;

    move-result-object v1

    return-object v1

    :cond_1
    add-long/2addr v2, v9

    .line 7
    invoke-static {v2, v3}, Lc/a/a/a/f2/b$e;->e(J)Lc/a/a/a/f2/b$e;

    move-result-object v1

    return-object v1

    :cond_2
    const-wide/32 v9, 0x186a0

    add-long/2addr v9, v5

    cmp-long v11, v9, p2

    if-lez v11, :cond_3

    int-to-long v4, v13

    add-long/2addr v2, v4

    .line 8
    invoke-static {v2, v3}, Lc/a/a/a/f2/b$e;->e(J)Lc/a/a/a/f2/b$e;

    move-result-object v1

    return-object v1

    :cond_3
    int-to-long v9, v13

    move-wide v11, v5

    .line 9
    :cond_4
    invoke-virtual {v1, v14}, Lc/a/a/a/m2/a0;->P(I)V

    int-to-long v5, v14

    goto :goto_0

    :cond_5
    :goto_1
    cmp-long v1, v11, v7

    if-eqz v1, :cond_6

    add-long/2addr v2, v5

    .line 10
    invoke-static {v11, v12, v2, v3}, Lc/a/a/a/f2/b$e;->f(JJ)Lc/a/a/a/f2/b$e;

    move-result-object v1

    return-object v1

    .line 11
    :cond_6
    sget-object v1, Lc/a/a/a/f2/b$e;->a:Lc/a/a/a/f2/b$e;

    return-object v1
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/m0/f0$a;->b:Lc/a/a/a/m2/a0;

    sget-object v1, Lc/a/a/a/m2/m0;->f:[B

    invoke-virtual {v0, v1}, Lc/a/a/a/m2/a0;->M([B)V

    return-void
.end method

.method public b(Lc/a/a/a/f2/k;J)Lc/a/a/a/f2/b$e;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v4

    .line 2
    iget v0, p0, Lc/a/a/a/f2/m0/f0$a;->d:I

    int-to-long v0, v0

    invoke-interface {p1}, Lc/a/a/a/f2/k;->a()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    .line 3
    iget-object v0, p0, Lc/a/a/a/f2/m0/f0$a;->b:Lc/a/a/a/m2/a0;

    invoke-virtual {v0, v1}, Lc/a/a/a/m2/a0;->L(I)V

    .line 4
    iget-object v0, p0, Lc/a/a/a/f2/m0/f0$a;->b:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lc/a/a/a/f2/k;->o([BII)V

    .line 5
    iget-object v1, p0, Lc/a/a/a/f2/m0/f0$a;->b:Lc/a/a/a/m2/a0;

    move-object v0, p0

    move-wide v2, p2

    invoke-direct/range {v0 .. v5}, Lc/a/a/a/f2/m0/f0$a;->c(Lc/a/a/a/m2/a0;JJ)Lc/a/a/a/f2/b$e;

    move-result-object p1

    return-object p1
.end method
