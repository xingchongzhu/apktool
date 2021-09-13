.class public final synthetic Lcom/google/android/exoplayer2/source/hls/v/a;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/exoplayer2/source/hls/v/d$a;

.field public final synthetic b:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/exoplayer2/source/hls/v/d$a;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/v/a;->a:Lcom/google/android/exoplayer2/source/hls/v/d$a;

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/v/a;->b:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/a;->a:Lcom/google/android/exoplayer2/source/hls/v/d$a;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/v/a;->b:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/source/hls/v/d$a;->k(Landroid/net/Uri;)V

    return-void
.end method
