.class final Lc/a/a/a/f2/m0/q$a;
.super Ljava/lang/Object;
.source "H263Reader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/f2/m0/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:[B


# instance fields
.field private b:Z

.field private c:I

.field public d:I

.field public e:I

.field public f:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [B

    .line 1
    fill-array-data v0, :array_0

    sput-object v0, Lc/a/a/a/f2/m0/q$a;->a:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
    .end array-data
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-array p1, p1, [B

    iput-object p1, p0, Lc/a/a/a/f2/m0/q$a;->f:[B

    return-void
.end method


# virtual methods
.method public a([BII)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/f2/m0/q$a;->b:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    sub-int/2addr p3, p2

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/m0/q$a;->f:[B

    array-length v1, v0

    iget v2, p0, Lc/a/a/a/f2/m0/q$a;->d:I

    add-int v3, v2, p3

    if-ge v1, v3, :cond_1

    add-int/2addr v2, p3

    mul-int/lit8 v2, v2, 0x2

    .line 3
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/f2/m0/q$a;->f:[B

    .line 4
    :cond_1
    iget-object v0, p0, Lc/a/a/a/f2/m0/q$a;->f:[B

    iget v1, p0, Lc/a/a/a/f2/m0/q$a;->d:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5
    iget p1, p0, Lc/a/a/a/f2/m0/q$a;->d:I

    add-int/2addr p1, p3

    iput p1, p0, Lc/a/a/a/f2/m0/q$a;->d:I

    return-void
.end method

.method public b(II)Z
    .locals 8

    .line 1
    iget v0, p0, Lc/a/a/a/f2/m0/q$a;->c:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_8

    const/16 v3, 0xb5

    const/4 v4, 0x2

    const-string v5, "Unexpected start code value"

    const-string v6, "H263Reader"

    if-eq v0, v2, :cond_6

    const/4 v7, 0x3

    if-eq v0, v4, :cond_4

    const/4 v4, 0x4

    if-eq v0, v7, :cond_2

    if-ne v0, v4, :cond_1

    const/16 v0, 0xb3

    if-eq p1, v0, :cond_0

    if-ne p1, v3, :cond_9

    .line 2
    :cond_0
    iget p1, p0, Lc/a/a/a/f2/m0/q$a;->d:I

    sub-int/2addr p1, p2

    iput p1, p0, Lc/a/a/a/f2/m0/q$a;->d:I

    .line 3
    iput-boolean v1, p0, Lc/a/a/a/f2/m0/q$a;->b:Z

    return v2

    .line 4
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    and-int/lit16 p1, p1, 0xf0

    const/16 p2, 0x20

    if-eq p1, p2, :cond_3

    .line 5
    invoke-static {v6, v5}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0}, Lc/a/a/a/f2/m0/q$a;->c()V

    goto :goto_0

    .line 7
    :cond_3
    iget p1, p0, Lc/a/a/a/f2/m0/q$a;->d:I

    iput p1, p0, Lc/a/a/a/f2/m0/q$a;->e:I

    .line 8
    iput v4, p0, Lc/a/a/a/f2/m0/q$a;->c:I

    goto :goto_0

    :cond_4
    const/16 p2, 0x1f

    if-le p1, p2, :cond_5

    .line 9
    invoke-static {v6, v5}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p0}, Lc/a/a/a/f2/m0/q$a;->c()V

    goto :goto_0

    .line 11
    :cond_5
    iput v7, p0, Lc/a/a/a/f2/m0/q$a;->c:I

    goto :goto_0

    :cond_6
    if-eq p1, v3, :cond_7

    .line 12
    invoke-static {v6, v5}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p0}, Lc/a/a/a/f2/m0/q$a;->c()V

    goto :goto_0

    .line 14
    :cond_7
    iput v4, p0, Lc/a/a/a/f2/m0/q$a;->c:I

    goto :goto_0

    :cond_8
    const/16 p2, 0xb0

    if-ne p1, p2, :cond_9

    .line 15
    iput v2, p0, Lc/a/a/a/f2/m0/q$a;->c:I

    .line 16
    iput-boolean v2, p0, Lc/a/a/a/f2/m0/q$a;->b:Z

    .line 17
    :cond_9
    :goto_0
    sget-object p1, Lc/a/a/a/f2/m0/q$a;->a:[B

    array-length p2, p1

    invoke-virtual {p0, p1, v1, p2}, Lc/a/a/a/f2/m0/q$a;->a([BII)V

    return v1
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/f2/m0/q$a;->b:Z

    .line 2
    iput v0, p0, Lc/a/a/a/f2/m0/q$a;->d:I

    .line 3
    iput v0, p0, Lc/a/a/a/f2/m0/q$a;->c:I

    return-void
.end method
