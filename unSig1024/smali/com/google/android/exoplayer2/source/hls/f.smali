.class public final Lcom/google/android/exoplayer2/source/hls/f;
.super Ljava/lang/Object;
.source "DefaultHlsDataSourceFactory.java"

# interfaces
.implements Lcom/google/android/exoplayer2/source/hls/j;


# instance fields
.field private final a:Lcom/google/android/exoplayer2/upstream/m$a;


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/upstream/m$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/f;->a:Lcom/google/android/exoplayer2/upstream/m$a;

    return-void
.end method


# virtual methods
.method public a(I)Lcom/google/android/exoplayer2/upstream/m;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/f;->a:Lcom/google/android/exoplayer2/upstream/m$a;

    invoke-interface {p1}, Lcom/google/android/exoplayer2/upstream/m$a;->a()Lcom/google/android/exoplayer2/upstream/m;

    move-result-object p1

    return-object p1
.end method
