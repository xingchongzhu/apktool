.class public final Lcom/google/android/exoplayer2/source/hls/e;
.super Ljava/lang/Object;
.source "BundledHlsMediaChunkExtractor.java"

# interfaces
.implements Lcom/google/android/exoplayer2/source/hls/n;


# static fields
.field private static final a:Lc/a/a/a/f2/x;


# instance fields
.field final b:Lc/a/a/a/f2/j;

.field private final c:Lc/a/a/a/u0;

.field private final d:Lc/a/a/a/m2/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc/a/a/a/f2/x;

    invoke-direct {v0}, Lc/a/a/a/f2/x;-><init>()V

    sput-object v0, Lcom/google/android/exoplayer2/source/hls/e;->a:Lc/a/a/a/f2/x;

    return-void
.end method

.method public constructor <init>(Lc/a/a/a/f2/j;Lc/a/a/a/u0;Lc/a/a/a/m2/j0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/e;->b:Lc/a/a/a/f2/j;

    .line 3
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/e;->c:Lc/a/a/a/u0;

    .line 4
    iput-object p3, p0, Lcom/google/android/exoplayer2/source/hls/e;->d:Lc/a/a/a/m2/j0;

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/a/f2/k;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/e;->b:Lc/a/a/a/f2/j;

    sget-object v1, Lcom/google/android/exoplayer2/source/hls/e;->a:Lc/a/a/a/f2/x;

    invoke-interface {v0, p1, v1}, Lc/a/a/a/f2/j;->i(Lc/a/a/a/f2/k;Lc/a/a/a/f2/x;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b(Lc/a/a/a/f2/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/e;->b:Lc/a/a/a/f2/j;

    invoke-interface {v0, p1}, Lc/a/a/a/f2/j;->b(Lc/a/a/a/f2/l;)V

    return-void
.end method

.method public c()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/e;->b:Lc/a/a/a/f2/j;

    instance-of v1, v0, Lc/a/a/a/f2/m0/j;

    if-nez v1, :cond_1

    instance-of v1, v0, Lc/a/a/a/f2/m0/f;

    if-nez v1, :cond_1

    instance-of v1, v0, Lc/a/a/a/f2/m0/h;

    if-nez v1, :cond_1

    instance-of v0, v0, Lc/a/a/a/f2/j0/f;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/e;->b:Lc/a/a/a/f2/j;

    const-wide/16 v1, 0x0

    invoke-interface {v0, v1, v2, v1, v2}, Lc/a/a/a/f2/j;->c(JJ)V

    return-void
.end method

.method public e()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/e;->b:Lc/a/a/a/f2/j;

    instance-of v1, v0, Lc/a/a/a/f2/m0/h0;

    if-nez v1, :cond_1

    instance-of v0, v0, Lc/a/a/a/f2/k0/i;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public f()Lcom/google/android/exoplayer2/source/hls/n;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/source/hls/e;->e()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/e;->b:Lc/a/a/a/f2/j;

    instance-of v1, v0, Lcom/google/android/exoplayer2/source/hls/u;

    if-eqz v1, :cond_0

    .line 3
    new-instance v0, Lcom/google/android/exoplayer2/source/hls/u;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/e;->c:Lc/a/a/a/u0;

    iget-object v1, v1, Lc/a/a/a/u0;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/e;->d:Lc/a/a/a/m2/j0;

    invoke-direct {v0, v1, v2}, Lcom/google/android/exoplayer2/source/hls/u;-><init>(Ljava/lang/String;Lc/a/a/a/m2/j0;)V

    goto :goto_0

    .line 4
    :cond_0
    instance-of v1, v0, Lc/a/a/a/f2/m0/j;

    if-eqz v1, :cond_1

    .line 5
    new-instance v0, Lc/a/a/a/f2/m0/j;

    invoke-direct {v0}, Lc/a/a/a/f2/m0/j;-><init>()V

    goto :goto_0

    .line 6
    :cond_1
    instance-of v1, v0, Lc/a/a/a/f2/m0/f;

    if-eqz v1, :cond_2

    .line 7
    new-instance v0, Lc/a/a/a/f2/m0/f;

    invoke-direct {v0}, Lc/a/a/a/f2/m0/f;-><init>()V

    goto :goto_0

    .line 8
    :cond_2
    instance-of v1, v0, Lc/a/a/a/f2/m0/h;

    if-eqz v1, :cond_3

    .line 9
    new-instance v0, Lc/a/a/a/f2/m0/h;

    invoke-direct {v0}, Lc/a/a/a/f2/m0/h;-><init>()V

    goto :goto_0

    .line 10
    :cond_3
    instance-of v0, v0, Lc/a/a/a/f2/j0/f;

    if-eqz v0, :cond_4

    .line 11
    new-instance v0, Lc/a/a/a/f2/j0/f;

    invoke-direct {v0}, Lc/a/a/a/f2/j0/f;-><init>()V

    .line 12
    :goto_0
    new-instance v1, Lcom/google/android/exoplayer2/source/hls/e;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/e;->c:Lc/a/a/a/u0;

    iget-object v3, p0, Lcom/google/android/exoplayer2/source/hls/e;->d:Lc/a/a/a/m2/j0;

    invoke-direct {v1, v0, v2, v3}, Lcom/google/android/exoplayer2/source/hls/e;-><init>(Lc/a/a/a/f2/j;Lc/a/a/a/u0;Lc/a/a/a/m2/j0;)V

    return-object v1

    .line 13
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected extractor type for recreation: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/e;->b:Lc/a/a/a/f2/j;

    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
