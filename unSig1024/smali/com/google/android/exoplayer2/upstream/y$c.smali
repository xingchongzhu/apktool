.class public Lcom/google/android/exoplayer2/upstream/y$c;
.super Ljava/io/IOException;
.source "HttpDataSource.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/upstream/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:I

.field public final b:Lcom/google/android/exoplayer2/upstream/p;


# direct methods
.method public constructor <init>(Ljava/io/IOException;Lcom/google/android/exoplayer2/upstream/p;I)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 5
    iput-object p2, p0, Lcom/google/android/exoplayer2/upstream/y$c;->b:Lcom/google/android/exoplayer2/upstream/p;

    .line 6
    iput p3, p0, Lcom/google/android/exoplayer2/upstream/y$c;->a:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/google/android/exoplayer2/upstream/p;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 2
    iput-object p2, p0, Lcom/google/android/exoplayer2/upstream/y$c;->b:Lcom/google/android/exoplayer2/upstream/p;

    .line 3
    iput p3, p0, Lcom/google/android/exoplayer2/upstream/y$c;->a:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/io/IOException;Lcom/google/android/exoplayer2/upstream/p;I)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 8
    iput-object p3, p0, Lcom/google/android/exoplayer2/upstream/y$c;->b:Lcom/google/android/exoplayer2/upstream/p;

    .line 9
    iput p4, p0, Lcom/google/android/exoplayer2/upstream/y$c;->a:I

    return-void
.end method
