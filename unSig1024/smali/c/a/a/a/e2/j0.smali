.class public final Lc/a/a/a/e2/j0;
.super Ljava/io/IOException;
.source "MediaDrmCallbackException.java"


# instance fields
.field public final a:Lcom/google/android/exoplayer2/upstream/p;

.field public final b:Landroid/net/Uri;

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public final d:J


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/upstream/p;Landroid/net/Uri;Ljava/util/Map;JLjava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/upstream/p;",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;J",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p6}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 2
    iput-object p1, p0, Lc/a/a/a/e2/j0;->a:Lcom/google/android/exoplayer2/upstream/p;

    .line 3
    iput-object p2, p0, Lc/a/a/a/e2/j0;->b:Landroid/net/Uri;

    .line 4
    iput-object p3, p0, Lc/a/a/a/e2/j0;->c:Ljava/util/Map;

    .line 5
    iput-wide p4, p0, Lc/a/a/a/e2/j0;->d:J

    return-void
.end method
