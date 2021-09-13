.class public abstract Lc/a/a/a/l2/n;
.super Ljava/lang/Object;
.source "TrackSelector.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/l2/n$a;
    }
.end annotation


# instance fields
.field private a:Lc/a/a/a/l2/n$a;

.field private b:Lcom/google/android/exoplayer2/upstream/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a()Lcom/google/android/exoplayer2/upstream/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/l2/n;->b:Lcom/google/android/exoplayer2/upstream/g;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/upstream/g;

    return-object v0
.end method

.method public final b(Lc/a/a/a/l2/n$a;Lcom/google/android/exoplayer2/upstream/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/l2/n;->a:Lc/a/a/a/l2/n$a;

    .line 2
    iput-object p2, p0, Lc/a/a/a/l2/n;->b:Lcom/google/android/exoplayer2/upstream/g;

    return-void
.end method

.method public abstract c(Ljava/lang/Object;)V
.end method

.method public abstract d([Lc/a/a/a/r1;Lc/a/a/a/j2/q0;Lc/a/a/a/j2/d0$a;Lc/a/a/a/x1;)Lc/a/a/a/l2/o;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation
.end method
