.class public final Lcom/google/android/exoplayer2/upstream/u$b;
.super Ljava/lang/Object;
.source "DefaultHttpDataSource.java"

# interfaces
.implements Lcom/google/android/exoplayer2/upstream/y$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/upstream/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/google/android/exoplayer2/upstream/y$f;

.field private b:Lcom/google/android/exoplayer2/upstream/e0;

.field private c:Lc/a/b/a/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/a/h<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/lang/String;

.field private e:I

.field private f:I

.field private g:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/google/android/exoplayer2/upstream/y$f;

    invoke-direct {v0}, Lcom/google/android/exoplayer2/upstream/y$f;-><init>()V

    iput-object v0, p0, Lcom/google/android/exoplayer2/upstream/u$b;->a:Lcom/google/android/exoplayer2/upstream/y$f;

    const/16 v0, 0x1f40

    .line 3
    iput v0, p0, Lcom/google/android/exoplayer2/upstream/u$b;->e:I

    .line 4
    iput v0, p0, Lcom/google/android/exoplayer2/upstream/u$b;->f:I

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lcom/google/android/exoplayer2/upstream/m;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/upstream/u$b;->b()Lcom/google/android/exoplayer2/upstream/u;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lcom/google/android/exoplayer2/upstream/y;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/upstream/u$b;->b()Lcom/google/android/exoplayer2/upstream/u;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/google/android/exoplayer2/upstream/u;
    .locals 9

    .line 1
    new-instance v8, Lcom/google/android/exoplayer2/upstream/u;

    iget-object v1, p0, Lcom/google/android/exoplayer2/upstream/u$b;->d:Ljava/lang/String;

    iget v2, p0, Lcom/google/android/exoplayer2/upstream/u$b;->e:I

    iget v3, p0, Lcom/google/android/exoplayer2/upstream/u$b;->f:I

    iget-boolean v4, p0, Lcom/google/android/exoplayer2/upstream/u$b;->g:Z

    iget-object v5, p0, Lcom/google/android/exoplayer2/upstream/u$b;->a:Lcom/google/android/exoplayer2/upstream/y$f;

    iget-object v6, p0, Lcom/google/android/exoplayer2/upstream/u$b;->c:Lc/a/b/a/h;

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/google/android/exoplayer2/upstream/u;-><init>(Ljava/lang/String;IIZLcom/google/android/exoplayer2/upstream/y$f;Lc/a/b/a/h;Lcom/google/android/exoplayer2/upstream/u$a;)V

    .line 2
    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/u$b;->b:Lcom/google/android/exoplayer2/upstream/e0;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v8, v0}, Lcom/google/android/exoplayer2/upstream/h;->k(Lcom/google/android/exoplayer2/upstream/e0;)V

    :cond_0
    return-object v8
.end method

.method public c(Ljava/lang/String;)Lcom/google/android/exoplayer2/upstream/u$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/exoplayer2/upstream/u$b;->d:Ljava/lang/String;

    return-object p0
.end method
