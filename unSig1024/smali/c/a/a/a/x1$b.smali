.class public final Lc/a/a/a/x1$b;
.super Ljava/lang/Object;
.source "Timeline.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/x1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:I

.field public d:J

.field private e:J

.field private f:Lc/a/a/a/j2/s0/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lc/a/a/a/j2/s0/a;->a:Lc/a/a/a/j2/s0/a;

    iput-object v0, p0, Lc/a/a/a/x1$b;->f:Lc/a/a/a/j2/s0/a;

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/x1$b;->f:Lc/a/a/a/j2/s0/a;

    iget-object v0, v0, Lc/a/a/a/j2/s0/a;->e:[Lc/a/a/a/j2/s0/a$a;

    aget-object p1, v0, p1

    iget p1, p1, Lc/a/a/a/j2/s0/a$a;->a:I

    return p1
.end method

.method public b(II)J
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/x1$b;->f:Lc/a/a/a/j2/s0/a;

    iget-object v0, v0, Lc/a/a/a/j2/s0/a;->e:[Lc/a/a/a/j2/s0/a$a;

    aget-object p1, v0, p1

    .line 2
    iget v0, p1, Lc/a/a/a/j2/s0/a$a;->a:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object p1, p1, Lc/a/a/a/j2/s0/a$a;->d:[J

    aget-wide v0, p1, p2

    goto :goto_0

    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    return-wide v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/x1$b;->f:Lc/a/a/a/j2/s0/a;

    iget v0, v0, Lc/a/a/a/j2/s0/a;->c:I

    return v0
.end method

.method public d(J)I
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/x1$b;->f:Lc/a/a/a/j2/s0/a;

    iget-wide v1, p0, Lc/a/a/a/x1$b;->d:J

    invoke-virtual {v0, p1, p2, v1, v2}, Lc/a/a/a/j2/s0/a;->a(JJ)I

    move-result p1

    return p1
.end method

.method public e(J)I
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/x1$b;->f:Lc/a/a/a/j2/s0/a;

    iget-wide v1, p0, Lc/a/a/a/x1$b;->d:J

    invoke-virtual {v0, p1, p2, v1, v2}, Lc/a/a/a/j2/s0/a;->b(JJ)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 1
    const-class v2, Lc/a/a/a/x1$b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    .line 2
    :cond_1
    check-cast p1, Lc/a/a/a/x1$b;

    .line 3
    iget-object v2, p0, Lc/a/a/a/x1$b;->a:Ljava/lang/Object;

    iget-object v3, p1, Lc/a/a/a/x1$b;->a:Ljava/lang/Object;

    invoke-static {v2, v3}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lc/a/a/a/x1$b;->b:Ljava/lang/Object;

    iget-object v3, p1, Lc/a/a/a/x1$b;->b:Ljava/lang/Object;

    .line 4
    invoke-static {v2, v3}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Lc/a/a/a/x1$b;->c:I

    iget v3, p1, Lc/a/a/a/x1$b;->c:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lc/a/a/a/x1$b;->d:J

    iget-wide v4, p1, Lc/a/a/a/x1$b;->d:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-wide v2, p0, Lc/a/a/a/x1$b;->e:J

    iget-wide v4, p1, Lc/a/a/a/x1$b;->e:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-object v2, p0, Lc/a/a/a/x1$b;->f:Lc/a/a/a/j2/s0/a;

    iget-object p1, p1, Lc/a/a/a/x1$b;->f:Lc/a/a/a/j2/s0/a;

    .line 5
    invoke-static {v2, p1}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public f(I)J
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/x1$b;->f:Lc/a/a/a/j2/s0/a;

    iget-object v0, v0, Lc/a/a/a/j2/s0/a;->d:[J

    aget-wide v1, v0, p1

    return-wide v1
.end method

.method public g()J
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/x1$b;->f:Lc/a/a/a/j2/s0/a;

    iget-wide v0, v0, Lc/a/a/a/j2/s0/a;->f:J

    return-wide v0
.end method

.method public h()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/x1$b;->d:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, Lc/a/a/a/x1$b;->a:Ljava/lang/Object;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0xd9

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    .line 2
    iget-object v0, p0, Lc/a/a/a/x1$b;->b:Ljava/lang/Object;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    .line 3
    iget v0, p0, Lc/a/a/a/x1$b;->c:I

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    .line 4
    iget-wide v0, p0, Lc/a/a/a/x1$b;->d:J

    const/16 v3, 0x20

    ushr-long v4, v0, v3

    xor-long/2addr v0, v4

    long-to-int v1, v0

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    .line 5
    iget-wide v0, p0, Lc/a/a/a/x1$b;->e:J

    ushr-long v3, v0, v3

    xor-long/2addr v0, v3

    long-to-int v1, v0

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    .line 6
    iget-object v0, p0, Lc/a/a/a/x1$b;->f:Lc/a/a/a/j2/s0/a;

    invoke-virtual {v0}, Lc/a/a/a/j2/s0/a;->hashCode()I

    move-result v0

    add-int/2addr v2, v0

    return v2
.end method

.method public i(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/x1$b;->f:Lc/a/a/a/j2/s0/a;

    iget-object v0, v0, Lc/a/a/a/j2/s0/a;->e:[Lc/a/a/a/j2/s0/a$a;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lc/a/a/a/j2/s0/a$a;->a()I

    move-result p1

    return p1
.end method

.method public j(II)I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/x1$b;->f:Lc/a/a/a/j2/s0/a;

    iget-object v0, v0, Lc/a/a/a/j2/s0/a;->e:[Lc/a/a/a/j2/s0/a$a;

    aget-object p1, v0, p1

    invoke-virtual {p1, p2}, Lc/a/a/a/j2/s0/a$a;->b(I)I

    move-result p1

    return p1
.end method

.method public k()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/x1$b;->e:J

    invoke-static {v0, v1}, Lc/a/a/a/i0;->d(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public l()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/x1$b;->e:J

    return-wide v0
.end method

.method public m(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/x1$b;->f:Lc/a/a/a/j2/s0/a;

    iget-object v0, v0, Lc/a/a/a/j2/s0/a;->e:[Lc/a/a/a/j2/s0/a$a;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lc/a/a/a/j2/s0/a$a;->c()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public n(Ljava/lang/Object;Ljava/lang/Object;IJJ)Lc/a/a/a/x1$b;
    .locals 9

    .line 1
    sget-object v8, Lc/a/a/a/j2/s0/a;->a:Lc/a/a/a/j2/s0/a;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-wide v4, p4

    move-wide v6, p6

    invoke-virtual/range {v0 .. v8}, Lc/a/a/a/x1$b;->o(Ljava/lang/Object;Ljava/lang/Object;IJJLc/a/a/a/j2/s0/a;)Lc/a/a/a/x1$b;

    move-result-object v0

    return-object v0
.end method

.method public o(Ljava/lang/Object;Ljava/lang/Object;IJJLc/a/a/a/j2/s0/a;)Lc/a/a/a/x1$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/x1$b;->a:Ljava/lang/Object;

    .line 2
    iput-object p2, p0, Lc/a/a/a/x1$b;->b:Ljava/lang/Object;

    .line 3
    iput p3, p0, Lc/a/a/a/x1$b;->c:I

    .line 4
    iput-wide p4, p0, Lc/a/a/a/x1$b;->d:J

    .line 5
    iput-wide p6, p0, Lc/a/a/a/x1$b;->e:J

    .line 6
    iput-object p8, p0, Lc/a/a/a/x1$b;->f:Lc/a/a/a/j2/s0/a;

    return-object p0
.end method
