.class public final Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;
.super Ljava/lang/Object;
.source "HlsMediaSource.java"

# interfaces
.implements Lc/a/a/a/j2/f0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation


# instance fields
.field private final a:Lcom/google/android/exoplayer2/source/hls/j;

.field private b:Lcom/google/android/exoplayer2/source/hls/k;

.field private c:Lcom/google/android/exoplayer2/source/hls/v/j;

.field private d:Lcom/google/android/exoplayer2/source/hls/v/k$a;

.field private e:Lc/a/a/a/j2/q;

.field private f:Lc/a/a/a/e2/z;

.field private g:Lcom/google/android/exoplayer2/upstream/a0;

.field private h:Z

.field private i:I

.field private j:Z

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/a/i2/c;",
            ">;"
        }
    .end annotation
.end field

.field private l:Ljava/lang/Object;

.field private m:J


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/source/hls/j;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/exoplayer2/source/hls/j;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->a:Lcom/google/android/exoplayer2/source/hls/j;

    .line 4
    new-instance p1, Lc/a/a/a/e2/s;

    invoke-direct {p1}, Lc/a/a/a/e2/s;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->f:Lc/a/a/a/e2/z;

    .line 5
    new-instance p1, Lcom/google/android/exoplayer2/source/hls/v/c;

    invoke-direct {p1}, Lcom/google/android/exoplayer2/source/hls/v/c;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->c:Lcom/google/android/exoplayer2/source/hls/v/j;

    .line 6
    sget-object p1, Lcom/google/android/exoplayer2/source/hls/v/d;->a:Lcom/google/android/exoplayer2/source/hls/v/k$a;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->d:Lcom/google/android/exoplayer2/source/hls/v/k$a;

    .line 7
    sget-object p1, Lcom/google/android/exoplayer2/source/hls/k;->a:Lcom/google/android/exoplayer2/source/hls/k;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->b:Lcom/google/android/exoplayer2/source/hls/k;

    .line 8
    new-instance p1, Lcom/google/android/exoplayer2/upstream/v;

    invoke-direct {p1}, Lcom/google/android/exoplayer2/upstream/v;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->g:Lcom/google/android/exoplayer2/upstream/a0;

    .line 9
    new-instance p1, Lc/a/a/a/j2/r;

    invoke-direct {p1}, Lc/a/a/a/j2/r;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->e:Lc/a/a/a/j2/q;

    const/4 p1, 0x1

    .line 10
    iput p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->i:I

    .line 11
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->k:Ljava/util/List;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    iput-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->m:J

    return-void
.end method

.method public constructor <init>(Lcom/google/android/exoplayer2/upstream/m$a;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/exoplayer2/source/hls/f;

    invoke-direct {v0, p1}, Lcom/google/android/exoplayer2/source/hls/f;-><init>(Lcom/google/android/exoplayer2/upstream/m$a;)V

    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/source/hls/j;)V

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/a/z0;)Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    iget-object v2, v1, Lc/a/a/a/z0;->b:Lc/a/a/a/z0$g;

    invoke-static {v2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->c:Lcom/google/android/exoplayer2/source/hls/v/j;

    .line 3
    iget-object v3, v1, Lc/a/a/a/z0;->b:Lc/a/a/a/z0$g;

    iget-object v3, v3, Lc/a/a/a/z0$g;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->k:Ljava/util/List;

    goto :goto_0

    .line 5
    :cond_0
    iget-object v3, v1, Lc/a/a/a/z0;->b:Lc/a/a/a/z0$g;

    iget-object v3, v3, Lc/a/a/a/z0$g;->e:Ljava/util/List;

    .line 6
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    .line 7
    new-instance v4, Lcom/google/android/exoplayer2/source/hls/v/e;

    invoke-direct {v4, v2, v3}, Lcom/google/android/exoplayer2/source/hls/v/e;-><init>(Lcom/google/android/exoplayer2/source/hls/v/j;Ljava/util/List;)V

    move-object v2, v4

    .line 8
    :cond_1
    iget-object v4, v1, Lc/a/a/a/z0;->b:Lc/a/a/a/z0$g;

    iget-object v5, v4, Lc/a/a/a/z0$g;->h:Ljava/lang/Object;

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-nez v5, :cond_2

    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->l:Ljava/lang/Object;

    if-eqz v5, :cond_2

    const/4 v5, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    .line 9
    :goto_1
    iget-object v4, v4, Lc/a/a/a/z0$g;->e:Ljava/util/List;

    .line 10
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    const/4 v6, 0x0

    :goto_2
    if-eqz v5, :cond_4

    if-eqz v6, :cond_4

    .line 11
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/z0;->a()Lc/a/a/a/z0$c;

    move-result-object v1

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->l:Ljava/lang/Object;

    invoke-virtual {v1, v4}, Lc/a/a/a/z0$c;->f(Ljava/lang/Object;)Lc/a/a/a/z0$c;

    move-result-object v1

    invoke-virtual {v1, v3}, Lc/a/a/a/z0$c;->e(Ljava/util/List;)Lc/a/a/a/z0$c;

    move-result-object v1

    invoke-virtual {v1}, Lc/a/a/a/z0$c;->a()Lc/a/a/a/z0;

    move-result-object v1

    goto :goto_3

    :cond_4
    if-eqz v5, :cond_5

    .line 12
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/z0;->a()Lc/a/a/a/z0$c;

    move-result-object v1

    iget-object v3, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->l:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Lc/a/a/a/z0$c;->f(Ljava/lang/Object;)Lc/a/a/a/z0$c;

    move-result-object v1

    invoke-virtual {v1}, Lc/a/a/a/z0$c;->a()Lc/a/a/a/z0;

    move-result-object v1

    goto :goto_3

    :cond_5
    if-eqz v6, :cond_6

    .line 13
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/z0;->a()Lc/a/a/a/z0$c;

    move-result-object v1

    invoke-virtual {v1, v3}, Lc/a/a/a/z0$c;->e(Ljava/util/List;)Lc/a/a/a/z0$c;

    move-result-object v1

    invoke-virtual {v1}, Lc/a/a/a/z0$c;->a()Lc/a/a/a/z0;

    move-result-object v1

    :cond_6
    :goto_3
    move-object v4, v1

    .line 14
    new-instance v1, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;

    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->a:Lcom/google/android/exoplayer2/source/hls/j;

    iget-object v6, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->b:Lcom/google/android/exoplayer2/source/hls/k;

    iget-object v7, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->e:Lc/a/a/a/j2/q;

    iget-object v3, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->f:Lc/a/a/a/e2/z;

    .line 15
    invoke-interface {v3, v4}, Lc/a/a/a/e2/z;->a(Lc/a/a/a/z0;)Lc/a/a/a/e2/y;

    move-result-object v8

    iget-object v9, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->g:Lcom/google/android/exoplayer2/upstream/a0;

    iget-object v3, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->d:Lcom/google/android/exoplayer2/source/hls/v/k$a;

    iget-object v10, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->a:Lcom/google/android/exoplayer2/source/hls/j;

    .line 16
    invoke-interface {v3, v10, v9, v2}, Lcom/google/android/exoplayer2/source/hls/v/k$a;->a(Lcom/google/android/exoplayer2/source/hls/j;Lcom/google/android/exoplayer2/upstream/a0;Lcom/google/android/exoplayer2/source/hls/v/j;)Lcom/google/android/exoplayer2/source/hls/v/k;

    move-result-object v10

    iget-wide v11, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->m:J

    iget-boolean v13, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->h:Z

    iget v14, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->i:I

    iget-boolean v15, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->j:Z

    const/16 v16, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v16}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;-><init>(Lc/a/a/a/z0;Lcom/google/android/exoplayer2/source/hls/j;Lcom/google/android/exoplayer2/source/hls/k;Lc/a/a/a/j2/q;Lc/a/a/a/e2/y;Lcom/google/android/exoplayer2/upstream/a0;Lcom/google/android/exoplayer2/source/hls/v/k;JZIZLcom/google/android/exoplayer2/source/hls/HlsMediaSource$a;)V

    return-object v1
.end method

.method public b(Lcom/google/android/exoplayer2/source/hls/v/j;)Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    new-instance p1, Lcom/google/android/exoplayer2/source/hls/v/c;

    invoke-direct {p1}, Lcom/google/android/exoplayer2/source/hls/v/c;-><init>()V

    :goto_0
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->c:Lcom/google/android/exoplayer2/source/hls/v/j;

    return-object p0
.end method
