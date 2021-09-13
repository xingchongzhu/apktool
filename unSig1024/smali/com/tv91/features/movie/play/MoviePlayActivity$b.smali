.class final Lcom/tv91/features/movie/play/MoviePlayActivity$b;
.super Ljava/lang/Object;
.source "MoviePlayActivity.java"

# interfaces
.implements Lcom/google/android/exoplayer2/source/hls/v/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/features/movie/play/MoviePlayActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/features/movie/play/MoviePlayActivity$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/tv91/features/movie/play/MoviePlayActivity$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/exoplayer2/source/hls/v/f;Lcom/google/android/exoplayer2/source/hls/v/g;)Lcom/google/android/exoplayer2/upstream/c0$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/source/hls/v/f;",
            "Lcom/google/android/exoplayer2/source/hls/v/g;",
            ")",
            "Lcom/google/android/exoplayer2/upstream/c0$a<",
            "Lcom/google/android/exoplayer2/source/hls/v/h;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lc/a/a/a/i2/b;

    new-instance v1, Lcom/tv91/features/movie/play/b;

    invoke-direct {v1, p1, p2}, Lcom/tv91/features/movie/play/b;-><init>(Lcom/google/android/exoplayer2/source/hls/v/f;Lcom/google/android/exoplayer2/source/hls/v/g;)V

    .line 2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lc/a/a/a/i2/b;-><init>(Lcom/google/android/exoplayer2/upstream/c0$a;Ljava/util/List;)V

    return-object v0
.end method

.method public b()Lcom/google/android/exoplayer2/upstream/c0$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/exoplayer2/upstream/c0$a<",
            "Lcom/google/android/exoplayer2/source/hls/v/h;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lc/a/a/a/i2/b;

    new-instance v1, Lcom/tv91/features/movie/play/b;

    invoke-direct {v1}, Lcom/tv91/features/movie/play/b;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lc/a/a/a/i2/b;-><init>(Lcom/google/android/exoplayer2/upstream/c0$a;Ljava/util/List;)V

    return-object v0
.end method
