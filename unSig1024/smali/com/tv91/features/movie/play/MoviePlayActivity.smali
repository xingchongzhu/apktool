.class public final Lcom/tv91/features/movie/play/MoviePlayActivity;
.super Lcom/tv91/x/e;
.source "MoviePlayActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/features/movie/play/MoviePlayActivity$c;,
        Lcom/tv91/features/movie/play/MoviePlayActivity$b;,
        Lcom/tv91/features/movie/play/MoviePlayActivity$d;
    }
.end annotation


# instance fields
.field private r:Lcom/google/android/exoplayer2/ui/PlayerView;

.field private s:Landroid/net/Uri;

.field private t:Lc/a/a/a/v1;

.field private u:Lcom/tv91/features/movie/play/MoviePlayActivity$d;

.field private v:I

.field private w:J

.field private x:Lcom/google/android/exoplayer2/upstream/m$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/x/e;-><init>()V

    return-void
.end method

.method static synthetic N(Lcom/tv91/features/movie/play/MoviePlayActivity;)Lc/a/a/a/v1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->t:Lc/a/a/a/v1;

    return-object p0
.end method

.method static synthetic O(Lcom/tv91/features/movie/play/MoviePlayActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/features/movie/play/MoviePlayActivity;->Z()V

    return-void
.end method

.method static synthetic P(Lcom/tv91/features/movie/play/MoviePlayActivity;Lc/a/a/a/p0;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/movie/play/MoviePlayActivity;->V(Lc/a/a/a/p0;)Z

    move-result p0

    return p0
.end method

.method static synthetic Q(Lcom/tv91/features/movie/play/MoviePlayActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/features/movie/play/MoviePlayActivity;->T()V

    return-void
.end method

.method static synthetic R(Lcom/tv91/features/movie/play/MoviePlayActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/features/movie/play/MoviePlayActivity;->U()V

    return-void
.end method

.method private S(Landroid/net/Uri;)Lc/a/a/a/j2/d0;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->x:Lcom/google/android/exoplayer2/upstream/m$a;

    if-nez v0, :cond_0

    const-string v0, "91TVPlayer"

    .line 2
    invoke-static {p0, v0}, Lc/a/a/a/m2/m0;->f0(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    new-instance v1, Lcom/google/android/exoplayer2/upstream/t;

    invoke-direct {v1, p0, v0}, Lcom/google/android/exoplayer2/upstream/t;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->x:Lcom/google/android/exoplayer2/upstream/m$a;

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v2, "mp4"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    new-instance v0, Lc/a/a/a/j2/i0$b;

    iget-object v1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->x:Lcom/google/android/exoplayer2/upstream/m$a;

    invoke-direct {v0, v1}, Lc/a/a/a/j2/i0$b;-><init>(Lcom/google/android/exoplayer2/upstream/m$a;)V

    new-instance v1, Lc/a/a/a/z0$c;

    invoke-direct {v1}, Lc/a/a/a/z0$c;-><init>()V

    .line 7
    invoke-virtual {v1, p1}, Lc/a/a/a/z0$c;->g(Landroid/net/Uri;)Lc/a/a/a/z0$c;

    move-result-object p1

    invoke-virtual {p1}, Lc/a/a/a/z0$c;->a()Lc/a/a/a/z0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lc/a/a/a/j2/i0$b;->a(Lc/a/a/a/z0;)Lc/a/a/a/j2/i0;

    move-result-object p1

    return-object p1

    .line 8
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v2, "m3u8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 9
    new-instance v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;

    iget-object v1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->x:Lcom/google/android/exoplayer2/upstream/m$a;

    invoke-direct {v0, v1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/upstream/m$a;)V

    new-instance v1, Lcom/tv91/features/movie/play/MoviePlayActivity$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/tv91/features/movie/play/MoviePlayActivity$b;-><init>(Lcom/tv91/features/movie/play/MoviePlayActivity$a;)V

    .line 10
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->b(Lcom/google/android/exoplayer2/source/hls/v/j;)Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;

    move-result-object v0

    new-instance v1, Lc/a/a/a/z0$c;

    invoke-direct {v1}, Lc/a/a/a/z0$c;-><init>()V

    .line 11
    invoke-virtual {v1, p1}, Lc/a/a/a/z0$c;->g(Landroid/net/Uri;)Lc/a/a/a/z0$c;

    move-result-object p1

    invoke-virtual {p1}, Lc/a/a/a/z0$c;->a()Lc/a/a/a/z0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->a(Lc/a/a/a/z0;)Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;

    move-result-object p1

    return-object p1

    .line 12
    :cond_2
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v2, "content"

    invoke-static {v2, v1}, Lcom/tv91/utils/g;->b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 13
    new-instance v0, Lc/a/a/a/j2/i0$b;

    iget-object v1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->x:Lcom/google/android/exoplayer2/upstream/m$a;

    invoke-direct {v0, v1}, Lc/a/a/a/j2/i0$b;-><init>(Lcom/google/android/exoplayer2/upstream/m$a;)V

    new-instance v1, Lc/a/a/a/z0$c;

    invoke-direct {v1}, Lc/a/a/a/z0$c;-><init>()V

    .line 14
    invoke-virtual {v1, p1}, Lc/a/a/a/z0$c;->g(Landroid/net/Uri;)Lc/a/a/a/z0$c;

    move-result-object p1

    invoke-virtual {p1}, Lc/a/a/a/z0$c;->a()Lc/a/a/a/z0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lc/a/a/a/j2/i0$b;->a(Lc/a/a/a/z0;)Lc/a/a/a/j2/i0;

    move-result-object p1

    return-object p1

    .line 15
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private T()V
    .locals 2

    const/4 v0, -0x1

    .line 1
    iput v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->v:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    iput-wide v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->w:J

    return-void
.end method

.method private U()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->t:Lc/a/a/a/v1;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lc/a/a/a/v1$b;

    invoke-direct {v0, p0}, Lc/a/a/a/v1$b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lc/a/a/a/v1$b;->w()Lc/a/a/a/v1;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->t:Lc/a/a/a/v1;

    .line 3
    new-instance v1, Lcom/tv91/features/movie/play/MoviePlayActivity$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/tv91/features/movie/play/MoviePlayActivity$d;-><init>(Lcom/tv91/features/movie/play/MoviePlayActivity;Lcom/tv91/features/movie/play/MoviePlayActivity$a;)V

    iput-object v1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->u:Lcom/tv91/features/movie/play/MoviePlayActivity$d;

    invoke-virtual {v0, v1}, Lc/a/a/a/v1;->C(Lc/a/a/a/l1$a;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->r:Lcom/google/android/exoplayer2/ui/PlayerView;

    iget-object v1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->t:Lc/a/a/a/v1;

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/ui/PlayerView;->setPlayer(Lc/a/a/a/l1;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->s:Landroid/net/Uri;

    invoke-direct {p0, v0}, Lcom/tv91/features/movie/play/MoviePlayActivity;->S(Landroid/net/Uri;)Lc/a/a/a/j2/d0;

    move-result-object v0

    .line 6
    iget v1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->v:I

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 7
    iget-object v4, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->t:Lc/a/a/a/v1;

    iget-wide v5, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->w:J

    invoke-virtual {v4, v1, v5, v6}, Lc/a/a/a/v1;->k(IJ)V

    .line 8
    :cond_2
    iget-object v1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->t:Lc/a/a/a/v1;

    xor-int/2addr v2, v3

    invoke-virtual {v1, v0, v2}, Lc/a/a/a/v1;->P0(Lc/a/a/a/j2/d0;Z)V

    .line 9
    iget-object v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->t:Lc/a/a/a/v1;

    invoke-virtual {v0}, Lc/a/a/a/v1;->d()V

    .line 10
    iget-object v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->t:Lc/a/a/a/v1;

    invoke-virtual {v0}, Lc/a/a/a/g0;->b0()V

    return-void
.end method

.method private V(Lc/a/a/a/p0;)Z
    .locals 2

    .line 1
    iget v0, p1, Lc/a/a/a/p0;->a:I

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {p1}, Lc/a/a/a/p0;->g()Ljava/io/IOException;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_2

    .line 3
    instance-of v0, p1, Lc/a/a/a/j2/l;

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    .line 4
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    goto :goto_0

    :cond_2
    return v1
.end method

.method private synthetic W(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private Y()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->t:Lc/a/a/a/v1;

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/tv91/features/movie/play/MoviePlayActivity;->Z()V

    .line 3
    iget-object v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->t:Lc/a/a/a/v1;

    iget-object v1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->u:Lcom/tv91/features/movie/play/MoviePlayActivity$d;

    invoke-virtual {v0, v1}, Lc/a/a/a/v1;->P(Lc/a/a/a/l1$a;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->t:Lc/a/a/a/v1;

    invoke-virtual {v0}, Lc/a/a/a/v1;->L0()V

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->t:Lc/a/a/a/v1;

    .line 6
    iput-object v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->u:Lcom/tv91/features/movie/play/MoviePlayActivity$d;

    :cond_0
    return-void
.end method

.method private Z()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->t:Lc/a/a/a/v1;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Lc/a/a/a/v1;->R()I

    move-result v0

    iput v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->v:I

    .line 3
    iget-object v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->t:Lc/a/a/a/v1;

    invoke-virtual {v0}, Lc/a/a/a/g0;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    iget-object v2, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->t:Lc/a/a/a/v1;

    .line 4
    invoke-virtual {v2}, Lc/a/a/a/v1;->W()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    iput-wide v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->w:J

    :cond_1
    return-void
.end method


# virtual methods
.method public synthetic X(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/movie/play/MoviePlayActivity;->W(Landroid/view/View;)V

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->r:Lcom/google/android/exoplayer2/ui/PlayerView;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/ui/PlayerView;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->r:Lcom/google/android/exoplayer2/ui/PlayerView;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/ui/PlayerView;->w()V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->r:Lcom/google/android/exoplayer2/ui/PlayerView;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/ui/PlayerView;->G()V

    .line 4
    :goto_0
    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->r:Lcom/google/android/exoplayer2/ui/PlayerView;

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/ui/PlayerView;->u(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 p1, 0x1

    :goto_2
    return p1
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/e;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->b()Landroidx/lifecycle/f;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/shared/UmengObserver;

    const-string v2, "\u5f71\u7247\u64ad\u653e\u9801\u9762"

    invoke-direct {v1, v2}, Lcom/tv91/features/shared/UmengObserver;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/h;)V

    .line 3
    invoke-virtual {p0}, Lcom/tv91/x/e;->M()Lcom/tv91/x/a;

    move-result-object v0

    check-cast v0, Lcom/tv91/features/movie/play/MoviePlayActivity$c;

    invoke-static {v0}, Lcom/tv91/features/movie/play/MoviePlayActivity$c;->p(Lcom/tv91/features/movie/play/MoviePlayActivity$c;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->s:Landroid/net/Uri;

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    const-string v0, "key_uri"

    .line 4
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    iput-object p1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->s:Landroid/net/Uri;

    if-nez p1, :cond_0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 6
    :cond_0
    invoke-direct {p0}, Lcom/tv91/features/movie/play/MoviePlayActivity;->T()V

    const p1, 0x7f0d001c

    .line 7
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    const p1, 0x7f0a01de

    .line 8
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/exoplayer2/ui/PlayerView;

    iput-object p1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->r:Lcom/google/android/exoplayer2/ui/PlayerView;

    const/4 v0, 0x0

    .line 9
    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/ui/PlayerView;->setResizeMode(I)V

    .line 10
    iget-object p1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->r:Lcom/google/android/exoplayer2/ui/PlayerView;

    const/16 v1, 0xbb8

    invoke-virtual {p1, v1}, Lcom/google/android/exoplayer2/ui/PlayerView;->setControllerShowTimeoutMs(I)V

    .line 11
    iget-object p1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->r:Lcom/google/android/exoplayer2/ui/PlayerView;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lcom/google/android/exoplayer2/ui/PlayerView;->setControllerHideOnTouch(Z)V

    .line 12
    iget-object p1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->r:Lcom/google/android/exoplayer2/ui/PlayerView;

    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/ui/PlayerView;->setControllerAutoShow(Z)V

    .line 13
    iget-object p1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->r:Lcom/google/android/exoplayer2/ui/PlayerView;

    invoke-virtual {p1, v1}, Lcom/google/android/exoplayer2/ui/PlayerView;->setShowBuffering(I)V

    .line 14
    iget-object p1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->r:Lcom/google/android/exoplayer2/ui/PlayerView;

    new-instance v0, Lc/a/a/a/k0;

    const-wide/16 v1, 0x3a98

    invoke-direct {v0, v1, v2, v1, v2}, Lc/a/a/a/k0;-><init>(JJ)V

    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/ui/PlayerView;->setControlDispatcher(Lc/a/a/a/j0;)V

    return-void
.end method

.method protected onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/e;->onPause()V

    .line 2
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v1, 0x17

    if-gt v0, v1, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/tv91/features/movie/play/MoviePlayActivity;->Y()V

    :cond_0
    return-void
.end method

.method protected onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/e;->onResume()V

    .line 2
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v1, 0x17

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->t:Lc/a/a/a/v1;

    if-nez v0, :cond_1

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/tv91/features/movie/play/MoviePlayActivity;->U()V

    :cond_1
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity;->s:Landroid/net/Uri;

    if-eqz v0, :cond_0

    const-string v1, "key_uri"

    .line 3
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    return-void
.end method

.method protected onStart()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/appcompat/app/c;->onStart()V

    const v0, 0x7f0a00db

    .line 2
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/movie/play/a;

    invoke-direct {v1, p0}, Lcom/tv91/features/movie/play/a;-><init>(Lcom/tv91/features/movie/play/MoviePlayActivity;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v1, 0x17

    if-le v0, v1, :cond_0

    .line 4
    invoke-direct {p0}, Lcom/tv91/features/movie/play/MoviePlayActivity;->U()V

    :cond_0
    return-void
.end method

.method protected onStop()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/appcompat/app/c;->onStop()V

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 3
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v1, 0x17

    if-le v0, v1, :cond_0

    .line 4
    invoke-direct {p0}, Lcom/tv91/features/movie/play/MoviePlayActivity;->Y()V

    :cond_0
    return-void
.end method
