.class final Lc/a/a/a/f0;
.super Ljava/lang/Object;
.source "AudioFocusManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/f0$a;,
        Lc/a/a/a/f0$b;
    }
.end annotation


# instance fields
.field private final a:Landroid/media/AudioManager;

.field private final b:Lc/a/a/a/f0$a;

.field private c:Lc/a/a/a/f0$b;

.field private d:Lc/a/a/a/b2/n;

.field private e:I

.field private f:I

.field private g:F

.field private h:Landroid/media/AudioFocusRequest;

.field private i:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lc/a/a/a/f0$b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    iput v0, p0, Lc/a/a/a/f0;->g:F

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "audio"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    .line 4
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    iput-object p1, p0, Lc/a/a/a/f0;->a:Landroid/media/AudioManager;

    .line 5
    iput-object p3, p0, Lc/a/a/a/f0;->c:Lc/a/a/a/f0$b;

    .line 6
    new-instance p1, Lc/a/a/a/f0$a;

    invoke-direct {p1, p0, p2}, Lc/a/a/a/f0$a;-><init>(Lc/a/a/a/f0;Landroid/os/Handler;)V

    iput-object p1, p0, Lc/a/a/a/f0;->b:Lc/a/a/a/f0$a;

    const/4 p1, 0x0

    .line 7
    iput p1, p0, Lc/a/a/a/f0;->e:I

    return-void
.end method

.method private a()V
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/f0;->e:I

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    .line 3
    invoke-direct {p0}, Lc/a/a/a/f0;->c()V

    goto :goto_0

    .line 4
    :cond_1
    invoke-direct {p0}, Lc/a/a/a/f0;->b()V

    :goto_0
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, v0}, Lc/a/a/a/f0;->n(I)V

    return-void
.end method

.method private b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/f0;->a:Landroid/media/AudioManager;

    iget-object v1, p0, Lc/a/a/a/f0;->b:Lc/a/a/a/f0$a;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    return-void
.end method

.method private c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/f0;->h:Landroid/media/AudioFocusRequest;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lc/a/a/a/f0;->a:Landroid/media/AudioManager;

    invoke-virtual {v1, v0}, Landroid/media/AudioManager;->abandonAudioFocusRequest(Landroid/media/AudioFocusRequest;)I

    :cond_0
    return-void
.end method

.method static synthetic d(Lc/a/a/a/f0;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lc/a/a/a/f0;->h(I)V

    return-void
.end method

.method private static e(Lc/a/a/a/b2/n;)I
    .locals 6

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 1
    :cond_0
    iget v1, p0, Lc/a/a/a/b2/n;->d:I

    const/4 v2, 0x3

    const-string v3, "AudioFocusManager"

    const/4 v4, 0x2

    const/4 v5, 0x1

    packed-switch v1, :pswitch_data_0

    .line 2
    :pswitch_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unidentified audio usage: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Lc/a/a/a/b2/n;->d:I

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    return v0

    .line 3
    :pswitch_1
    sget p0, Lc/a/a/a/m2/m0;->a:I

    const/16 v0, 0x13

    if-lt p0, v0, :cond_1

    const/4 p0, 0x4

    return p0

    :cond_1
    return v4

    .line 4
    :pswitch_2
    iget p0, p0, Lc/a/a/a/b2/n;->b:I

    if-ne p0, v5, :cond_2

    return v4

    :cond_2
    :pswitch_3
    return v2

    :pswitch_4
    return v0

    :pswitch_5
    return v4

    :pswitch_6
    return v5

    :pswitch_7
    const-string p0, "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."

    .line 5
    invoke-static {v3, p0}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    return v5

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_5
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_6
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private f(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/f0;->c:Lc/a/a/a/f0$b;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lc/a/a/a/f0$b;->k(I)V

    :cond_0
    return-void
.end method

.method private h(I)V
    .locals 2

    const/4 v0, -0x3

    const/4 v1, -0x2

    if-eq p1, v0, :cond_2

    if-eq p1, v1, :cond_2

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown focus change type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "AudioFocusManager"

    invoke-static {v0, p1}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 2
    :cond_0
    invoke-direct {p0, v0}, Lc/a/a/a/f0;->n(I)V

    .line 3
    invoke-direct {p0, v0}, Lc/a/a/a/f0;->f(I)V

    return-void

    .line 4
    :cond_1
    invoke-direct {p0, v0}, Lc/a/a/a/f0;->f(I)V

    .line 5
    invoke-direct {p0}, Lc/a/a/a/f0;->a()V

    return-void

    :cond_2
    if-eq p1, v1, :cond_4

    .line 6
    invoke-direct {p0}, Lc/a/a/a/f0;->q()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x3

    .line 7
    invoke-direct {p0, p1}, Lc/a/a/a/f0;->n(I)V

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lc/a/a/a/f0;->f(I)V

    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1}, Lc/a/a/a/f0;->n(I)V

    :goto_1
    return-void
.end method

.method private j()I
    .locals 3

    .line 1
    iget v0, p0, Lc/a/a/a/f0;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    .line 2
    :cond_0
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v2, 0x1a

    if-lt v0, v2, :cond_1

    invoke-direct {p0}, Lc/a/a/a/f0;->l()I

    move-result v0

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lc/a/a/a/f0;->k()I

    move-result v0

    :goto_0
    if-ne v0, v1, :cond_2

    .line 3
    invoke-direct {p0, v1}, Lc/a/a/a/f0;->n(I)V

    return v1

    :cond_2
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lc/a/a/a/f0;->n(I)V

    const/4 v0, -0x1

    return v0
.end method

.method private k()I
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/f0;->a:Landroid/media/AudioManager;

    iget-object v1, p0, Lc/a/a/a/f0;->b:Lc/a/a/a/f0$a;

    iget-object v2, p0, Lc/a/a/a/f0;->d:Lc/a/a/a/b2/n;

    .line 2
    invoke-static {v2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/a/a/a/b2/n;

    iget v2, v2, Lc/a/a/a/b2/n;->d:I

    invoke-static {v2}, Lc/a/a/a/m2/m0;->Z(I)I

    move-result v2

    iget v3, p0, Lc/a/a/a/f0;->f:I

    .line 3
    invoke-virtual {v0, v1, v2, v3}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    move-result v0

    return v0
.end method

.method private l()I
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/f0;->h:Landroid/media/AudioFocusRequest;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lc/a/a/a/f0;->i:Z

    if-eqz v1, :cond_2

    :cond_0
    if-nez v0, :cond_1

    .line 2
    new-instance v0, Landroid/media/AudioFocusRequest$Builder;

    iget v1, p0, Lc/a/a/a/f0;->f:I

    invoke-direct {v0, v1}, Landroid/media/AudioFocusRequest$Builder;-><init>(I)V

    goto :goto_0

    .line 3
    :cond_1
    new-instance v0, Landroid/media/AudioFocusRequest$Builder;

    iget-object v1, p0, Lc/a/a/a/f0;->h:Landroid/media/AudioFocusRequest;

    invoke-direct {v0, v1}, Landroid/media/AudioFocusRequest$Builder;-><init>(Landroid/media/AudioFocusRequest;)V

    .line 4
    :goto_0
    invoke-direct {p0}, Lc/a/a/a/f0;->q()Z

    move-result v1

    .line 5
    iget-object v2, p0, Lc/a/a/a/f0;->d:Lc/a/a/a/b2/n;

    .line 6
    invoke-static {v2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/a/a/a/b2/n;

    invoke-virtual {v2}, Lc/a/a/a/b2/n;->a()Landroid/media/AudioAttributes;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/media/AudioFocusRequest$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v0

    .line 7
    invoke-virtual {v0, v1}, Landroid/media/AudioFocusRequest$Builder;->setWillPauseWhenDucked(Z)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v0

    iget-object v1, p0, Lc/a/a/a/f0;->b:Lc/a/a/a/f0$a;

    .line 8
    invoke-virtual {v0, v1}, Landroid/media/AudioFocusRequest$Builder;->setOnAudioFocusChangeListener(Landroid/media/AudioManager$OnAudioFocusChangeListener;)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/media/AudioFocusRequest$Builder;->build()Landroid/media/AudioFocusRequest;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/f0;->h:Landroid/media/AudioFocusRequest;

    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lc/a/a/a/f0;->i:Z

    .line 11
    :cond_2
    iget-object v0, p0, Lc/a/a/a/f0;->a:Landroid/media/AudioManager;

    iget-object v1, p0, Lc/a/a/a/f0;->h:Landroid/media/AudioFocusRequest;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioFocusRequest;)I

    move-result v0

    return v0
.end method

.method private n(I)V
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/f0;->e:I

    if-ne v0, p1, :cond_0

    return-void

    .line 2
    :cond_0
    iput p1, p0, Lc/a/a/a/f0;->e:I

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    const p1, 0x3e4ccccd    # 0.2f

    goto :goto_0

    :cond_1
    const/high16 p1, 0x3f800000    # 1.0f

    .line 3
    :goto_0
    iget v0, p0, Lc/a/a/a/f0;->g:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_2

    return-void

    .line 4
    :cond_2
    iput p1, p0, Lc/a/a/a/f0;->g:F

    .line 5
    iget-object v0, p0, Lc/a/a/a/f0;->c:Lc/a/a/a/f0$b;

    if-eqz v0, :cond_3

    .line 6
    invoke-interface {v0, p1}, Lc/a/a/a/f0$b;->E(F)V

    :cond_3
    return-void
.end method

.method private o(I)Z
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    .line 1
    iget p1, p0, Lc/a/a/a/f0;->f:I

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return v0
.end method

.method private q()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/f0;->d:Lc/a/a/a/b2/n;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget v0, v0, Lc/a/a/a/b2/n;->b:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method


# virtual methods
.method public g()F
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/f0;->g:F

    return v0
.end method

.method public i()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lc/a/a/a/f0;->c:Lc/a/a/a/f0$b;

    .line 2
    invoke-direct {p0}, Lc/a/a/a/f0;->a()V

    return-void
.end method

.method public m(Lc/a/a/a/b2/n;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/f0;->d:Lc/a/a/a/b2/n;

    invoke-static {v0, p1}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2
    iput-object p1, p0, Lc/a/a/a/f0;->d:Lc/a/a/a/b2/n;

    .line 3
    invoke-static {p1}, Lc/a/a/a/f0;->e(Lc/a/a/a/b2/n;)I

    move-result p1

    iput p1, p0, Lc/a/a/a/f0;->f:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    const-string p1, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."

    .line 4
    invoke-static {v0, p1}, Lc/a/a/a/m2/f;->b(ZLjava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public p(ZI)I
    .locals 1

    .line 1
    invoke-direct {p0, p2}, Lc/a/a/a/f0;->o(I)Z

    move-result p2

    const/4 v0, -0x1

    if-eqz p2, :cond_1

    .line 2
    invoke-direct {p0}, Lc/a/a/a/f0;->a()V

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0

    :cond_1
    if-eqz p1, :cond_2

    .line 3
    invoke-direct {p0}, Lc/a/a/a/f0;->j()I

    move-result v0

    :cond_2
    return v0
.end method
