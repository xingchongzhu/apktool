.class final Lc/a/a/a/j2/j0$a;
.super Ljava/lang/Object;
.source "SampleDataQueue.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/j2/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public final a:J

.field public final b:J

.field public c:Z

.field public d:Lcom/google/android/exoplayer2/upstream/d;

.field public e:Lc/a/a/a/j2/j0$a;


# direct methods
.method public constructor <init>(JI)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lc/a/a/a/j2/j0$a;->a:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    .line 3
    iput-wide p1, p0, Lc/a/a/a/j2/j0$a;->b:J

    return-void
.end method


# virtual methods
.method public a()Lc/a/a/a/j2/j0$a;
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lc/a/a/a/j2/j0$a;->d:Lcom/google/android/exoplayer2/upstream/d;

    .line 2
    iget-object v1, p0, Lc/a/a/a/j2/j0$a;->e:Lc/a/a/a/j2/j0$a;

    .line 3
    iput-object v0, p0, Lc/a/a/a/j2/j0$a;->e:Lc/a/a/a/j2/j0$a;

    return-object v1
.end method

.method public b(Lcom/google/android/exoplayer2/upstream/d;Lc/a/a/a/j2/j0$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/j2/j0$a;->d:Lcom/google/android/exoplayer2/upstream/d;

    .line 2
    iput-object p2, p0, Lc/a/a/a/j2/j0$a;->e:Lc/a/a/a/j2/j0$a;

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lc/a/a/a/j2/j0$a;->c:Z

    return-void
.end method

.method public c(J)I
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/j2/j0$a;->a:J

    sub-long/2addr p1, v0

    long-to-int p2, p1

    iget-object p1, p0, Lc/a/a/a/j2/j0$a;->d:Lcom/google/android/exoplayer2/upstream/d;

    iget p1, p1, Lcom/google/android/exoplayer2/upstream/d;->b:I

    add-int/2addr p2, p1

    return p2
.end method
