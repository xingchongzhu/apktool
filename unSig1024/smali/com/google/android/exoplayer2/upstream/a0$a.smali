.class public final Lcom/google/android/exoplayer2/upstream/a0$a;
.super Ljava/lang/Object;
.source "LoadErrorHandlingPolicy.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/upstream/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lc/a/a/a/j2/w;

.field public final b:Lc/a/a/a/j2/z;

.field public final c:Ljava/io/IOException;

.field public final d:I


# direct methods
.method public constructor <init>(Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Ljava/io/IOException;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/google/android/exoplayer2/upstream/a0$a;->a:Lc/a/a/a/j2/w;

    .line 3
    iput-object p2, p0, Lcom/google/android/exoplayer2/upstream/a0$a;->b:Lc/a/a/a/j2/z;

    .line 4
    iput-object p3, p0, Lcom/google/android/exoplayer2/upstream/a0$a;->c:Ljava/io/IOException;

    .line 5
    iput p4, p0, Lcom/google/android/exoplayer2/upstream/a0$a;->d:I

    return-void
.end method
