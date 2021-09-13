.class final Lc/a/a/a/f2/m0/q$b;
.super Ljava/lang/Object;
.source "H263Reader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/f2/m0/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Lc/a/a/a/f2/b0;

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:I

.field private f:I

.field private g:J

.field private h:J


# direct methods
.method public constructor <init>(Lc/a/a/a/f2/b0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/f2/m0/q$b;->a:Lc/a/a/a/f2/b0;

    return-void
.end method


# virtual methods
.method public a([BII)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/f2/m0/q$b;->c:Z

    if-eqz v0, :cond_2

    add-int/lit8 v0, p2, 0x1

    .line 2
    iget v1, p0, Lc/a/a/a/f2/m0/q$b;->f:I

    sub-int/2addr v0, v1

    if-ge v0, p3, :cond_1

    .line 3
    aget-byte p1, p1, v0

    and-int/lit16 p1, p1, 0xc0

    shr-int/lit8 p1, p1, 0x6

    const/4 p2, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lc/a/a/a/f2/m0/q$b;->d:Z

    .line 4
    iput-boolean p2, p0, Lc/a/a/a/f2/m0/q$b;->c:Z

    goto :goto_1

    :cond_1
    sub-int/2addr p3, p2

    add-int/2addr v1, p3

    .line 5
    iput v1, p0, Lc/a/a/a/f2/m0/q$b;->f:I

    :cond_2
    :goto_1
    return-void
.end method

.method public b(JIZ)V
    .locals 9

    .line 1
    iget v0, p0, Lc/a/a/a/f2/m0/q$b;->e:I

    const/16 v1, 0xb6

    if-ne v0, v1, :cond_0

    if-eqz p4, :cond_0

    iget-boolean p4, p0, Lc/a/a/a/f2/m0/q$b;->b:Z

    if-eqz p4, :cond_0

    .line 2
    iget-wide v0, p0, Lc/a/a/a/f2/m0/q$b;->g:J

    sub-long v0, p1, v0

    long-to-int v6, v0

    .line 3
    iget-boolean v5, p0, Lc/a/a/a/f2/m0/q$b;->d:Z

    .line 4
    iget-object v2, p0, Lc/a/a/a/f2/m0/q$b;->a:Lc/a/a/a/f2/b0;

    iget-wide v3, p0, Lc/a/a/a/f2/m0/q$b;->h:J

    const/4 v8, 0x0

    move v7, p3

    invoke-interface/range {v2 .. v8}, Lc/a/a/a/f2/b0;->c(JIIILc/a/a/a/f2/b0$a;)V

    .line 5
    :cond_0
    iget p3, p0, Lc/a/a/a/f2/m0/q$b;->e:I

    const/16 p4, 0xb3

    if-eq p3, p4, :cond_1

    .line 6
    iput-wide p1, p0, Lc/a/a/a/f2/m0/q$b;->g:J

    :cond_1
    return-void
.end method

.method public c(IJ)V
    .locals 4

    .line 1
    iput p1, p0, Lc/a/a/a/f2/m0/q$b;->e:I

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lc/a/a/a/f2/m0/q$b;->d:Z

    const/4 v1, 0x1

    const/16 v2, 0xb6

    if-eq p1, v2, :cond_1

    const/16 v3, 0xb3

    if-ne p1, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    .line 3
    :goto_1
    iput-boolean v3, p0, Lc/a/a/a/f2/m0/q$b;->b:Z

    if-ne p1, v2, :cond_2

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    .line 4
    :goto_2
    iput-boolean v1, p0, Lc/a/a/a/f2/m0/q$b;->c:Z

    .line 5
    iput v0, p0, Lc/a/a/a/f2/m0/q$b;->f:I

    .line 6
    iput-wide p2, p0, Lc/a/a/a/f2/m0/q$b;->h:J

    return-void
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/f2/m0/q$b;->b:Z

    .line 2
    iput-boolean v0, p0, Lc/a/a/a/f2/m0/q$b;->c:Z

    .line 3
    iput-boolean v0, p0, Lc/a/a/a/f2/m0/q$b;->d:Z

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lc/a/a/a/f2/m0/q$b;->e:I

    return-void
.end method
