.class public final Lcom/google/android/exoplayer2/upstream/y$e;
.super Lcom/google/android/exoplayer2/upstream/y$c;
.source "HttpDataSource.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/upstream/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public final c:I

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/Map;
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

.field public final f:[B


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/util/Map;Lcom/google/android/exoplayer2/upstream/p;[B)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lcom/google/android/exoplayer2/upstream/p;",
            "[B)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Response code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v0, p4, v1}, Lcom/google/android/exoplayer2/upstream/y$c;-><init>(Ljava/lang/String;Lcom/google/android/exoplayer2/upstream/p;I)V

    .line 2
    iput p1, p0, Lcom/google/android/exoplayer2/upstream/y$e;->c:I

    .line 3
    iput-object p2, p0, Lcom/google/android/exoplayer2/upstream/y$e;->d:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/google/android/exoplayer2/upstream/y$e;->e:Ljava/util/Map;

    .line 5
    iput-object p5, p0, Lcom/google/android/exoplayer2/upstream/y$e;->f:[B

    return-void
.end method
