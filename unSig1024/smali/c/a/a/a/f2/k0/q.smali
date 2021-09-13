.class final Lc/a/a/a/f2/k0/q;
.super Ljava/lang/Object;
.source "TrackFragment.java"


# instance fields
.field public a:Lc/a/a/a/f2/k0/g;

.field public b:J

.field public c:J

.field public d:J

.field public e:I

.field public f:I

.field public g:[J

.field public h:[I

.field public i:[I

.field public j:[I

.field public k:[J

.field public l:[Z

.field public m:Z

.field public n:[Z

.field public o:Lc/a/a/a/f2/k0/p;

.field public final p:Lc/a/a/a/m2/a0;

.field public q:Z

.field public r:J

.field public s:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v1, v0, [J

    .line 2
    iput-object v1, p0, Lc/a/a/a/f2/k0/q;->g:[J

    new-array v1, v0, [I

    .line 3
    iput-object v1, p0, Lc/a/a/a/f2/k0/q;->h:[I

    new-array v1, v0, [I

    .line 4
    iput-object v1, p0, Lc/a/a/a/f2/k0/q;->i:[I

    new-array v1, v0, [I

    .line 5
    iput-object v1, p0, Lc/a/a/a/f2/k0/q;->j:[I

    new-array v1, v0, [J

    .line 6
    iput-object v1, p0, Lc/a/a/a/f2/k0/q;->k:[J

    new-array v1, v0, [Z

    .line 7
    iput-object v1, p0, Lc/a/a/a/f2/k0/q;->l:[Z

    new-array v0, v0, [Z

    .line 8
    iput-object v0, p0, Lc/a/a/a/f2/k0/q;->n:[Z

    .line 9
    new-instance v0, Lc/a/a/a/m2/a0;

    invoke-direct {v0}, Lc/a/a/a/m2/a0;-><init>()V

    iput-object v0, p0, Lc/a/a/a/f2/k0/q;->p:Lc/a/a/a/m2/a0;

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/a/f2/k;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/k0/q;->p:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    iget-object v1, p0, Lc/a/a/a/f2/k0/q;->p:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->f()I

    move-result v1

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lc/a/a/a/f2/k;->readFully([BII)V

    .line 2
    iget-object p1, p0, Lc/a/a/a/f2/k0/q;->p:Lc/a/a/a/m2/a0;

    invoke-virtual {p1, v2}, Lc/a/a/a/m2/a0;->P(I)V

    .line 3
    iput-boolean v2, p0, Lc/a/a/a/f2/k0/q;->q:Z

    return-void
.end method

.method public b(Lc/a/a/a/m2/a0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/k0/q;->p:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    iget-object v1, p0, Lc/a/a/a/f2/k0/q;->p:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->f()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Lc/a/a/a/m2/a0;->j([BII)V

    .line 2
    iget-object p1, p0, Lc/a/a/a/f2/k0/q;->p:Lc/a/a/a/m2/a0;

    invoke-virtual {p1, v2}, Lc/a/a/a/m2/a0;->P(I)V

    .line 3
    iput-boolean v2, p0, Lc/a/a/a/f2/k0/q;->q:Z

    return-void
.end method

.method public c(I)J
    .locals 5

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/k0/q;->k:[J

    aget-wide v1, v0, p1

    iget-object v0, p0, Lc/a/a/a/f2/k0/q;->j:[I

    aget p1, v0, p1

    int-to-long v3, p1

    add-long/2addr v1, v3

    return-wide v1
.end method

.method public d(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/k0/q;->p:Lc/a/a/a/m2/a0;

    invoke-virtual {v0, p1}, Lc/a/a/a/m2/a0;->L(I)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lc/a/a/a/f2/k0/q;->m:Z

    .line 3
    iput-boolean p1, p0, Lc/a/a/a/f2/k0/q;->q:Z

    return-void
.end method

.method public e(II)V
    .locals 1

    .line 1
    iput p1, p0, Lc/a/a/a/f2/k0/q;->e:I

    .line 2
    iput p2, p0, Lc/a/a/a/f2/k0/q;->f:I

    .line 3
    iget-object v0, p0, Lc/a/a/a/f2/k0/q;->h:[I

    array-length v0, v0

    if-ge v0, p1, :cond_0

    .line 4
    new-array v0, p1, [J

    iput-object v0, p0, Lc/a/a/a/f2/k0/q;->g:[J

    .line 5
    new-array p1, p1, [I

    iput-object p1, p0, Lc/a/a/a/f2/k0/q;->h:[I

    .line 6
    :cond_0
    iget-object p1, p0, Lc/a/a/a/f2/k0/q;->i:[I

    array-length p1, p1

    if-ge p1, p2, :cond_1

    mul-int/lit8 p2, p2, 0x7d

    .line 7
    div-int/lit8 p2, p2, 0x64

    .line 8
    new-array p1, p2, [I

    iput-object p1, p0, Lc/a/a/a/f2/k0/q;->i:[I

    .line 9
    new-array p1, p2, [I

    iput-object p1, p0, Lc/a/a/a/f2/k0/q;->j:[I

    .line 10
    new-array p1, p2, [J

    iput-object p1, p0, Lc/a/a/a/f2/k0/q;->k:[J

    .line 11
    new-array p1, p2, [Z

    iput-object p1, p0, Lc/a/a/a/f2/k0/q;->l:[Z

    .line 12
    new-array p1, p2, [Z

    iput-object p1, p0, Lc/a/a/a/f2/k0/q;->n:[Z

    :cond_1
    return-void
.end method

.method public f()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lc/a/a/a/f2/k0/q;->e:I

    const-wide/16 v1, 0x0

    .line 2
    iput-wide v1, p0, Lc/a/a/a/f2/k0/q;->r:J

    .line 3
    iput-boolean v0, p0, Lc/a/a/a/f2/k0/q;->s:Z

    .line 4
    iput-boolean v0, p0, Lc/a/a/a/f2/k0/q;->m:Z

    .line 5
    iput-boolean v0, p0, Lc/a/a/a/f2/k0/q;->q:Z

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lc/a/a/a/f2/k0/q;->o:Lc/a/a/a/f2/k0/p;

    return-void
.end method

.method public g(I)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/f2/k0/q;->m:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/a/a/a/f2/k0/q;->n:[Z

    aget-boolean p1, v0, p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
