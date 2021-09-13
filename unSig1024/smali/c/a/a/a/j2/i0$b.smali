.class public final Lc/a/a/a/j2/i0$b;
.super Ljava/lang/Object;
.source "ProgressiveMediaSource.java"

# interfaces
.implements Lc/a/a/a/j2/f0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/j2/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/google/android/exoplayer2/upstream/m$a;

.field private b:Lc/a/a/a/f2/o;

.field private c:Lc/a/a/a/e2/z;

.field private d:Lcom/google/android/exoplayer2/upstream/a0;

.field private e:I

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/upstream/m$a;)V
    .locals 1

    .line 1
    new-instance v0, Lc/a/a/a/f2/h;

    invoke-direct {v0}, Lc/a/a/a/f2/h;-><init>()V

    invoke-direct {p0, p1, v0}, Lc/a/a/a/j2/i0$b;-><init>(Lcom/google/android/exoplayer2/upstream/m$a;Lc/a/a/a/f2/o;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/exoplayer2/upstream/m$a;Lc/a/a/a/f2/o;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lc/a/a/a/j2/i0$b;->a:Lcom/google/android/exoplayer2/upstream/m$a;

    .line 4
    iput-object p2, p0, Lc/a/a/a/j2/i0$b;->b:Lc/a/a/a/f2/o;

    .line 5
    new-instance p1, Lc/a/a/a/e2/s;

    invoke-direct {p1}, Lc/a/a/a/e2/s;-><init>()V

    iput-object p1, p0, Lc/a/a/a/j2/i0$b;->c:Lc/a/a/a/e2/z;

    .line 6
    new-instance p1, Lcom/google/android/exoplayer2/upstream/v;

    invoke-direct {p1}, Lcom/google/android/exoplayer2/upstream/v;-><init>()V

    iput-object p1, p0, Lc/a/a/a/j2/i0$b;->d:Lcom/google/android/exoplayer2/upstream/a0;

    const/high16 p1, 0x100000

    .line 7
    iput p1, p0, Lc/a/a/a/j2/i0$b;->e:I

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/a/z0;)Lc/a/a/a/j2/i0;
    .locals 7

    .line 1
    iget-object v0, p1, Lc/a/a/a/z0;->b:Lc/a/a/a/z0$g;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p1, Lc/a/a/a/z0;->b:Lc/a/a/a/z0$g;

    iget-object v1, v0, Lc/a/a/a/z0$g;->h:Ljava/lang/Object;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    iget-object v1, p0, Lc/a/a/a/j2/i0$b;->g:Ljava/lang/Object;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 3
    :goto_0
    iget-object v0, v0, Lc/a/a/a/z0$g;->f:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lc/a/a/a/j2/i0$b;->f:Ljava/lang/String;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v1, :cond_2

    if-eqz v2, :cond_2

    .line 4
    invoke-virtual {p1}, Lc/a/a/a/z0;->a()Lc/a/a/a/z0$c;

    move-result-object p1

    iget-object v0, p0, Lc/a/a/a/j2/i0$b;->g:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lc/a/a/a/z0$c;->f(Ljava/lang/Object;)Lc/a/a/a/z0$c;

    move-result-object p1

    iget-object v0, p0, Lc/a/a/a/j2/i0$b;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lc/a/a/a/z0$c;->b(Ljava/lang/String;)Lc/a/a/a/z0$c;

    move-result-object p1

    invoke-virtual {p1}, Lc/a/a/a/z0$c;->a()Lc/a/a/a/z0;

    move-result-object p1

    goto :goto_2

    :cond_2
    if-eqz v1, :cond_3

    .line 5
    invoke-virtual {p1}, Lc/a/a/a/z0;->a()Lc/a/a/a/z0$c;

    move-result-object p1

    iget-object v0, p0, Lc/a/a/a/j2/i0$b;->g:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lc/a/a/a/z0$c;->f(Ljava/lang/Object;)Lc/a/a/a/z0$c;

    move-result-object p1

    invoke-virtual {p1}, Lc/a/a/a/z0$c;->a()Lc/a/a/a/z0;

    move-result-object p1

    goto :goto_2

    :cond_3
    if-eqz v2, :cond_4

    .line 6
    invoke-virtual {p1}, Lc/a/a/a/z0;->a()Lc/a/a/a/z0$c;

    move-result-object p1

    iget-object v0, p0, Lc/a/a/a/j2/i0$b;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lc/a/a/a/z0$c;->b(Ljava/lang/String;)Lc/a/a/a/z0$c;

    move-result-object p1

    invoke-virtual {p1}, Lc/a/a/a/z0$c;->a()Lc/a/a/a/z0;

    move-result-object p1

    :cond_4
    :goto_2
    move-object v1, p1

    .line 7
    new-instance p1, Lc/a/a/a/j2/i0;

    iget-object v2, p0, Lc/a/a/a/j2/i0$b;->a:Lcom/google/android/exoplayer2/upstream/m$a;

    iget-object v3, p0, Lc/a/a/a/j2/i0$b;->b:Lc/a/a/a/f2/o;

    iget-object v0, p0, Lc/a/a/a/j2/i0$b;->c:Lc/a/a/a/e2/z;

    .line 8
    invoke-interface {v0, v1}, Lc/a/a/a/e2/z;->a(Lc/a/a/a/z0;)Lc/a/a/a/e2/y;

    move-result-object v4

    iget-object v5, p0, Lc/a/a/a/j2/i0$b;->d:Lcom/google/android/exoplayer2/upstream/a0;

    iget v6, p0, Lc/a/a/a/j2/i0$b;->e:I

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, Lc/a/a/a/j2/i0;-><init>(Lc/a/a/a/z0;Lcom/google/android/exoplayer2/upstream/m$a;Lc/a/a/a/f2/o;Lc/a/a/a/e2/y;Lcom/google/android/exoplayer2/upstream/a0;I)V

    return-object p1
.end method
