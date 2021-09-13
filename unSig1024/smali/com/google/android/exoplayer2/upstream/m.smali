.class public interface abstract Lcom/google/android/exoplayer2/upstream/m;
.super Ljava/lang/Object;
.source "DataSource.java"

# interfaces
.implements Lcom/google/android/exoplayer2/upstream/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/upstream/m$a;
    }
.end annotation


# virtual methods
.method public abstract close()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract e(Lcom/google/android/exoplayer2/upstream/p;)J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract g()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract k(Lcom/google/android/exoplayer2/upstream/e0;)V
.end method

.method public abstract l()Landroid/net/Uri;
.end method
