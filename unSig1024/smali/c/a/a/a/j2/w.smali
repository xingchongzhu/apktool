.class public final Lc/a/a/a/j2/w;
.super Ljava/lang/Object;
.source "LoadEventInfo.java"


# static fields
.field private static final a:Ljava/util/concurrent/atomic/AtomicLong;


# instance fields
.field public final b:J

.field public final c:Lcom/google/android/exoplayer2/upstream/p;

.field public final d:Landroid/net/Uri;

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

.field public final f:J

.field public final g:J

.field public final h:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    sput-object v0, Lc/a/a/a/j2/w;->a:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public constructor <init>(JLcom/google/android/exoplayer2/upstream/p;J)V
    .locals 12

    move-object v3, p3

    .line 1
    iget-object v4, v3, Lcom/google/android/exoplayer2/upstream/p;->a:Landroid/net/Uri;

    .line 2
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v5

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-wide/from16 v6, p4

    .line 3
    invoke-direct/range {v0 .. v11}, Lc/a/a/a/j2/w;-><init>(JLcom/google/android/exoplayer2/upstream/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    return-void
.end method

.method public constructor <init>(JLcom/google/android/exoplayer2/upstream/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/google/android/exoplayer2/upstream/p;",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;JJJ)V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-wide p1, p0, Lc/a/a/a/j2/w;->b:J

    .line 6
    iput-object p3, p0, Lc/a/a/a/j2/w;->c:Lcom/google/android/exoplayer2/upstream/p;

    .line 7
    iput-object p4, p0, Lc/a/a/a/j2/w;->d:Landroid/net/Uri;

    .line 8
    iput-object p5, p0, Lc/a/a/a/j2/w;->e:Ljava/util/Map;

    .line 9
    iput-wide p6, p0, Lc/a/a/a/j2/w;->f:J

    .line 10
    iput-wide p8, p0, Lc/a/a/a/j2/w;->g:J

    .line 11
    iput-wide p10, p0, Lc/a/a/a/j2/w;->h:J

    return-void
.end method

.method public static a()J
    .locals 2

    .line 1
    sget-object v0, Lc/a/a/a/j2/w;->a:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    return-wide v0
.end method
