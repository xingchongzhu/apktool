.class public Lcom/google/android/exoplayer2/source/hls/v/g$e;
.super Ljava/lang/Object;
.source "HlsMediaPlaylist.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/source/hls/v/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/google/android/exoplayer2/source/hls/v/g$d;

.field public final c:J

.field public final d:I

.field public final e:J

.field public final f:Lc/a/a/a/e2/t;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:J

.field public final j:J

.field public final k:Z


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/google/android/exoplayer2/source/hls/v/g$d;JIJLc/a/a/a/e2/t;Ljava/lang/String;Ljava/lang/String;JJZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/v/g$e;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/v/g$e;->b:Lcom/google/android/exoplayer2/source/hls/v/g$d;

    .line 5
    iput-wide p3, p0, Lcom/google/android/exoplayer2/source/hls/v/g$e;->c:J

    .line 6
    iput p5, p0, Lcom/google/android/exoplayer2/source/hls/v/g$e;->d:I

    .line 7
    iput-wide p6, p0, Lcom/google/android/exoplayer2/source/hls/v/g$e;->e:J

    .line 8
    iput-object p8, p0, Lcom/google/android/exoplayer2/source/hls/v/g$e;->f:Lc/a/a/a/e2/t;

    .line 9
    iput-object p9, p0, Lcom/google/android/exoplayer2/source/hls/v/g$e;->g:Ljava/lang/String;

    .line 10
    iput-object p10, p0, Lcom/google/android/exoplayer2/source/hls/v/g$e;->h:Ljava/lang/String;

    .line 11
    iput-wide p11, p0, Lcom/google/android/exoplayer2/source/hls/v/g$e;->i:J

    .line 12
    iput-wide p13, p0, Lcom/google/android/exoplayer2/source/hls/v/g$e;->j:J

    .line 13
    iput-boolean p15, p0, Lcom/google/android/exoplayer2/source/hls/v/g$e;->k:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lcom/google/android/exoplayer2/source/hls/v/g$d;JIJLc/a/a/a/e2/t;Ljava/lang/String;Ljava/lang/String;JJZLcom/google/android/exoplayer2/source/hls/v/g$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p15}, Lcom/google/android/exoplayer2/source/hls/v/g$e;-><init>(Ljava/lang/String;Lcom/google/android/exoplayer2/source/hls/v/g$d;JIJLc/a/a/a/e2/t;Ljava/lang/String;Ljava/lang/String;JJZ)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Long;)I
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/v/g$e;->e:J

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    .line 2
    :cond_0
    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/v/g$e;->e:J

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-gez p1, :cond_1

    const/4 p1, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/source/hls/v/g$e;->a(Ljava/lang/Long;)I

    move-result p1

    return p1
.end method
