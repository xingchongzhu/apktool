.class public final synthetic Lcom/google/android/exoplayer2/upstream/b;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/exoplayer2/upstream/r$c;

.field public final synthetic b:Lcom/google/android/exoplayer2/upstream/r;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/exoplayer2/upstream/r$c;Lcom/google/android/exoplayer2/upstream/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/upstream/b;->a:Lcom/google/android/exoplayer2/upstream/r$c;

    iput-object p2, p0, Lcom/google/android/exoplayer2/upstream/b;->b:Lcom/google/android/exoplayer2/upstream/r;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/b;->a:Lcom/google/android/exoplayer2/upstream/r$c;

    iget-object v1, p0, Lcom/google/android/exoplayer2/upstream/b;->b:Lcom/google/android/exoplayer2/upstream/r;

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/upstream/r$c;->c(Lcom/google/android/exoplayer2/upstream/r;)V

    return-void
.end method