.class public interface abstract Lcom/google/android/exoplayer2/source/hls/k;
.super Ljava/lang/Object;
.source "HlsExtractorFactory.java"


# static fields
.field public static final a:Lcom/google/android/exoplayer2/source/hls/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/exoplayer2/source/hls/g;

    invoke-direct {v0}, Lcom/google/android/exoplayer2/source/hls/g;-><init>()V

    sput-object v0, Lcom/google/android/exoplayer2/source/hls/k;->a:Lcom/google/android/exoplayer2/source/hls/k;

    return-void
.end method


# virtual methods
.method public abstract a(Landroid/net/Uri;Lc/a/a/a/u0;Ljava/util/List;Lc/a/a/a/m2/j0;Ljava/util/Map;Lc/a/a/a/f2/k;)Lcom/google/android/exoplayer2/source/hls/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lc/a/a/a/u0;",
            "Ljava/util/List<",
            "Lc/a/a/a/u0;",
            ">;",
            "Lc/a/a/a/m2/j0;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lc/a/a/a/f2/k;",
            ")",
            "Lcom/google/android/exoplayer2/source/hls/n;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
