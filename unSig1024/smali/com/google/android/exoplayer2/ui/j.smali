.class public Lcom/google/android/exoplayer2/ui/j;
.super Landroid/widget/FrameLayout;
.source "PlayerControlView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/ui/j$b;,
        Lcom/google/android/exoplayer2/ui/j$c;,
        Lcom/google/android/exoplayer2/ui/j$d;
    }
.end annotation


# instance fields
.field private final A:Landroid/graphics/drawable/Drawable;

.field private final B:Landroid/graphics/drawable/Drawable;

.field private final C:F

.field private final D:F

.field private final G:Ljava/lang/String;

.field private final H:Ljava/lang/String;

.field private I:Lc/a/a/a/l1;

.field private J:Lc/a/a/a/j0;

.field private K:Lcom/google/android/exoplayer2/ui/j$c;

.field private L:Lc/a/a/a/j1;

.field private M:Z

.field private N:Z

.field private O:Z

.field private P:Z

.field private Q:I

.field private R:I

.field private S:I

.field private T:Z

.field private U:Z

.field private V:Z

.field private W:Z

.field private final a:Lcom/google/android/exoplayer2/ui/j$b;

.field private a0:Z

.field private final b:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/google/android/exoplayer2/ui/j$d;",
            ">;"
        }
    .end annotation
.end field

.field private b0:J

.field private final c:Landroid/view/View;

.field private c0:[J

.field private final d:Landroid/view/View;

.field private d0:[Z

.field private final e:Landroid/view/View;

.field private e0:[J

.field private final f:Landroid/view/View;

.field private f0:[Z

.field private final g:Landroid/view/View;

.field private g0:J

.field private final h:Landroid/view/View;

.field private final i:Landroid/widget/ImageView;

.field private final j:Landroid/widget/ImageView;

.field private final k:Landroid/view/View;

.field private final l:Landroid/widget/TextView;

.field private final m:Landroid/widget/TextView;

.field private final n:Lcom/google/android/exoplayer2/ui/u;

.field private final o:Ljava/lang/StringBuilder;

.field private final p:Ljava/util/Formatter;

.field private final q:Lc/a/a/a/x1$b;

.field private final r:Lc/a/a/a/x1$c;

.field private final s:Ljava/lang/Runnable;

.field private final t:Ljava/lang/Runnable;

.field private final u:Landroid/graphics/drawable/Drawable;

.field private final v:Landroid/graphics/drawable/Drawable;

.field private final w:Landroid/graphics/drawable/Drawable;

.field private final x:Ljava/lang/String;

.field private final y:Ljava/lang/String;

.field private final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "goog.exo.ui"

    .line 1
    invoke-static {v0}, Lc/a/a/a/s0;->a(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;)V
    .locals 9

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    sget p2, Lcom/google/android/exoplayer2/ui/o;->b:I

    const/16 p3, 0x1388

    .line 3
    iput p3, p0, Lcom/google/android/exoplayer2/ui/j;->Q:I

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/google/android/exoplayer2/ui/j;->S:I

    const/16 v1, 0xc8

    .line 5
    iput v1, p0, Lcom/google/android/exoplayer2/ui/j;->R:I

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    iput-wide v1, p0, Lcom/google/android/exoplayer2/ui/j;->b0:J

    const/4 v1, 0x1

    .line 7
    iput-boolean v1, p0, Lcom/google/android/exoplayer2/ui/j;->T:Z

    .line 8
    iput-boolean v1, p0, Lcom/google/android/exoplayer2/ui/j;->U:Z

    .line 9
    iput-boolean v1, p0, Lcom/google/android/exoplayer2/ui/j;->V:Z

    .line 10
    iput-boolean v1, p0, Lcom/google/android/exoplayer2/ui/j;->W:Z

    .line 11
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/ui/j;->a0:Z

    const/16 v1, 0x3a98

    if-eqz p4, :cond_0

    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    sget-object v3, Lcom/google/android/exoplayer2/ui/q;->w:[I

    .line 13
    invoke-virtual {v2, p4, v3, v0, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 14
    :try_start_0
    sget v3, Lcom/google/android/exoplayer2/ui/q;->A:I

    invoke-virtual {v2, v3, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    .line 15
    sget v3, Lcom/google/android/exoplayer2/ui/q;->y:I

    .line 16
    invoke-virtual {v2, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    .line 17
    sget v3, Lcom/google/android/exoplayer2/ui/q;->G:I

    iget v4, p0, Lcom/google/android/exoplayer2/ui/j;->Q:I

    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, p0, Lcom/google/android/exoplayer2/ui/j;->Q:I

    .line 18
    sget v3, Lcom/google/android/exoplayer2/ui/q;->x:I

    .line 19
    invoke-virtual {v2, v3, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    .line 20
    iget v3, p0, Lcom/google/android/exoplayer2/ui/j;->S:I

    invoke-static {v2, v3}, Lcom/google/android/exoplayer2/ui/j;->E(Landroid/content/res/TypedArray;I)I

    move-result v3

    iput v3, p0, Lcom/google/android/exoplayer2/ui/j;->S:I

    .line 21
    sget v3, Lcom/google/android/exoplayer2/ui/q;->E:I

    iget-boolean v4, p0, Lcom/google/android/exoplayer2/ui/j;->T:Z

    .line 22
    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, p0, Lcom/google/android/exoplayer2/ui/j;->T:Z

    .line 23
    sget v3, Lcom/google/android/exoplayer2/ui/q;->B:I

    iget-boolean v4, p0, Lcom/google/android/exoplayer2/ui/j;->U:Z

    .line 24
    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, p0, Lcom/google/android/exoplayer2/ui/j;->U:Z

    .line 25
    sget v3, Lcom/google/android/exoplayer2/ui/q;->D:I

    iget-boolean v4, p0, Lcom/google/android/exoplayer2/ui/j;->V:Z

    .line 26
    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, p0, Lcom/google/android/exoplayer2/ui/j;->V:Z

    .line 27
    sget v3, Lcom/google/android/exoplayer2/ui/q;->C:I

    iget-boolean v4, p0, Lcom/google/android/exoplayer2/ui/j;->W:Z

    .line 28
    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, p0, Lcom/google/android/exoplayer2/ui/j;->W:Z

    .line 29
    sget v3, Lcom/google/android/exoplayer2/ui/q;->F:I

    iget-boolean v4, p0, Lcom/google/android/exoplayer2/ui/j;->a0:Z

    .line 30
    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, p0, Lcom/google/android/exoplayer2/ui/j;->a0:Z

    .line 31
    sget v3, Lcom/google/android/exoplayer2/ui/q;->H:I

    iget v4, p0, Lcom/google/android/exoplayer2/ui/j;->R:I

    .line 32
    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    .line 33
    invoke-virtual {p0, v3}, Lcom/google/android/exoplayer2/ui/j;->setTimeBarMinUpdateInterval(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 35
    throw p1

    .line 36
    :cond_0
    :goto_0
    new-instance v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v2, p0, Lcom/google/android/exoplayer2/ui/j;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 37
    new-instance v2, Lc/a/a/a/x1$b;

    invoke-direct {v2}, Lc/a/a/a/x1$b;-><init>()V

    iput-object v2, p0, Lcom/google/android/exoplayer2/ui/j;->q:Lc/a/a/a/x1$b;

    .line 38
    new-instance v2, Lc/a/a/a/x1$c;

    invoke-direct {v2}, Lc/a/a/a/x1$c;-><init>()V

    iput-object v2, p0, Lcom/google/android/exoplayer2/ui/j;->r:Lc/a/a/a/x1$c;

    .line 39
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v2, p0, Lcom/google/android/exoplayer2/ui/j;->o:Ljava/lang/StringBuilder;

    .line 40
    new-instance v3, Ljava/util/Formatter;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    invoke-direct {v3, v2, v4}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    iput-object v3, p0, Lcom/google/android/exoplayer2/ui/j;->p:Ljava/util/Formatter;

    new-array v2, v0, [J

    .line 41
    iput-object v2, p0, Lcom/google/android/exoplayer2/ui/j;->c0:[J

    new-array v2, v0, [Z

    .line 42
    iput-object v2, p0, Lcom/google/android/exoplayer2/ui/j;->d0:[Z

    new-array v2, v0, [J

    .line 43
    iput-object v2, p0, Lcom/google/android/exoplayer2/ui/j;->e0:[J

    new-array v2, v0, [Z

    .line 44
    iput-object v2, p0, Lcom/google/android/exoplayer2/ui/j;->f0:[Z

    .line 45
    new-instance v2, Lcom/google/android/exoplayer2/ui/j$b;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/google/android/exoplayer2/ui/j$b;-><init>(Lcom/google/android/exoplayer2/ui/j;Lcom/google/android/exoplayer2/ui/j$a;)V

    iput-object v2, p0, Lcom/google/android/exoplayer2/ui/j;->a:Lcom/google/android/exoplayer2/ui/j$b;

    .line 46
    new-instance v4, Lc/a/a/a/k0;

    int-to-long v5, v1

    int-to-long v7, p3

    invoke-direct {v4, v5, v6, v7, v8}, Lc/a/a/a/k0;-><init>(JJ)V

    iput-object v4, p0, Lcom/google/android/exoplayer2/ui/j;->J:Lc/a/a/a/j0;

    .line 47
    new-instance p3, Lcom/google/android/exoplayer2/ui/d;

    invoke-direct {p3, p0}, Lcom/google/android/exoplayer2/ui/d;-><init>(Lcom/google/android/exoplayer2/ui/j;)V

    iput-object p3, p0, Lcom/google/android/exoplayer2/ui/j;->s:Ljava/lang/Runnable;

    .line 48
    new-instance p3, Lcom/google/android/exoplayer2/ui/a;

    invoke-direct {p3, p0}, Lcom/google/android/exoplayer2/ui/a;-><init>(Lcom/google/android/exoplayer2/ui/j;)V

    iput-object p3, p0, Lcom/google/android/exoplayer2/ui/j;->t:Ljava/lang/Runnable;

    .line 49
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p3

    invoke-virtual {p3, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const/high16 p2, 0x40000

    .line 50
    invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->setDescendantFocusability(I)V

    .line 51
    sget p2, Lcom/google/android/exoplayer2/ui/m;->p:I

    invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/google/android/exoplayer2/ui/u;

    .line 52
    sget v1, Lcom/google/android/exoplayer2/ui/m;->q:I

    invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz p3, :cond_1

    .line 53
    iput-object p3, p0, Lcom/google/android/exoplayer2/ui/j;->n:Lcom/google/android/exoplayer2/ui/u;

    goto :goto_1

    :cond_1
    if-eqz v1, :cond_2

    .line 54
    new-instance p3, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;

    invoke-direct {p3, p1, v3, v0, p4}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;)V

    .line 55
    invoke-virtual {p3, p2}, Landroid/view/View;->setId(I)V

    .line 56
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    invoke-virtual {p3, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 57
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    check-cast p2, Landroid/view/ViewGroup;

    .line 58
    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p4

    .line 59
    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 60
    invoke-virtual {p2, p3, p4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 61
    iput-object p3, p0, Lcom/google/android/exoplayer2/ui/j;->n:Lcom/google/android/exoplayer2/ui/u;

    goto :goto_1

    .line 62
    :cond_2
    iput-object v3, p0, Lcom/google/android/exoplayer2/ui/j;->n:Lcom/google/android/exoplayer2/ui/u;

    .line 63
    :goto_1
    sget p2, Lcom/google/android/exoplayer2/ui/m;->g:I

    invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/j;->l:Landroid/widget/TextView;

    .line 64
    sget p2, Lcom/google/android/exoplayer2/ui/m;->n:I

    invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/j;->m:Landroid/widget/TextView;

    .line 65
    iget-object p2, p0, Lcom/google/android/exoplayer2/ui/j;->n:Lcom/google/android/exoplayer2/ui/u;

    if-eqz p2, :cond_3

    .line 66
    invoke-interface {p2, v2}, Lcom/google/android/exoplayer2/ui/u;->b(Lcom/google/android/exoplayer2/ui/u$a;)V

    .line 67
    :cond_3
    sget p2, Lcom/google/android/exoplayer2/ui/m;->m:I

    invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/j;->e:Landroid/view/View;

    if-eqz p2, :cond_4

    .line 68
    invoke-virtual {p2, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    :cond_4
    sget p2, Lcom/google/android/exoplayer2/ui/m;->l:I

    invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/j;->f:Landroid/view/View;

    if-eqz p2, :cond_5

    .line 70
    invoke-virtual {p2, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    :cond_5
    sget p2, Lcom/google/android/exoplayer2/ui/m;->o:I

    invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/j;->c:Landroid/view/View;

    if-eqz p2, :cond_6

    .line 72
    invoke-virtual {p2, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 73
    :cond_6
    sget p2, Lcom/google/android/exoplayer2/ui/m;->j:I

    invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/j;->d:Landroid/view/View;

    if-eqz p2, :cond_7

    .line 74
    invoke-virtual {p2, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 75
    :cond_7
    sget p2, Lcom/google/android/exoplayer2/ui/m;->s:I

    invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/j;->h:Landroid/view/View;

    if-eqz p2, :cond_8

    .line 76
    invoke-virtual {p2, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 77
    :cond_8
    sget p2, Lcom/google/android/exoplayer2/ui/m;->i:I

    invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/j;->g:Landroid/view/View;

    if-eqz p2, :cond_9

    .line 78
    invoke-virtual {p2, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 79
    :cond_9
    sget p2, Lcom/google/android/exoplayer2/ui/m;->r:I

    invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/j;->i:Landroid/widget/ImageView;

    if-eqz p2, :cond_a

    .line 80
    invoke-virtual {p2, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 81
    :cond_a
    sget p2, Lcom/google/android/exoplayer2/ui/m;->t:I

    invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/j;->j:Landroid/widget/ImageView;

    if-eqz p2, :cond_b

    .line 82
    invoke-virtual {p2, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    :cond_b
    sget p2, Lcom/google/android/exoplayer2/ui/m;->w:I

    invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/j;->k:Landroid/view/View;

    .line 84
    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/ui/j;->setShowVrButton(Z)V

    .line 85
    invoke-direct {p0, v0, v0, p2}, Lcom/google/android/exoplayer2/ui/j;->R(ZZLandroid/view/View;)V

    .line 86
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 87
    sget p2, Lcom/google/android/exoplayer2/ui/n;->b:I

    .line 88
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p2

    int-to-float p2, p2

    const/high16 p3, 0x42c80000    # 100.0f

    div-float/2addr p2, p3

    iput p2, p0, Lcom/google/android/exoplayer2/ui/j;->C:F

    .line 89
    sget p2, Lcom/google/android/exoplayer2/ui/n;->a:I

    .line 90
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p2, p3

    iput p2, p0, Lcom/google/android/exoplayer2/ui/j;->D:F

    .line 91
    sget p2, Lcom/google/android/exoplayer2/ui/l;->b:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/j;->u:Landroid/graphics/drawable/Drawable;

    .line 92
    sget p2, Lcom/google/android/exoplayer2/ui/l;->c:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/j;->v:Landroid/graphics/drawable/Drawable;

    .line 93
    sget p2, Lcom/google/android/exoplayer2/ui/l;->a:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/j;->w:Landroid/graphics/drawable/Drawable;

    .line 94
    sget p2, Lcom/google/android/exoplayer2/ui/l;->e:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/j;->A:Landroid/graphics/drawable/Drawable;

    .line 95
    sget p2, Lcom/google/android/exoplayer2/ui/l;->d:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/j;->B:Landroid/graphics/drawable/Drawable;

    .line 96
    sget p2, Lcom/google/android/exoplayer2/ui/p;->c:I

    .line 97
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/j;->x:Ljava/lang/String;

    .line 98
    sget p2, Lcom/google/android/exoplayer2/ui/p;->d:I

    .line 99
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/j;->y:Ljava/lang/String;

    .line 100
    sget p2, Lcom/google/android/exoplayer2/ui/p;->b:I

    .line 101
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/j;->z:Ljava/lang/String;

    .line 102
    sget p2, Lcom/google/android/exoplayer2/ui/p;->g:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/j;->G:Ljava/lang/String;

    .line 103
    sget p2, Lcom/google/android/exoplayer2/ui/p;->f:I

    .line 104
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/j;->H:Ljava/lang/String;

    return-void
.end method

.method private B(Lc/a/a/a/l1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->J:Lc/a/a/a/j0;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lc/a/a/a/j0;->j(Lc/a/a/a/l1;Z)Z

    return-void
.end method

.method private C(Lc/a/a/a/l1;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Lc/a/a/a/l1;->q()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 2
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->L:Lc/a/a/a/j1;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lc/a/a/a/j1;->a()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->J:Lc/a/a/a/j0;

    invoke-interface {v0, p1}, Lc/a/a/a/j0;->d(Lc/a/a/a/l1;)Z

    goto :goto_0

    :cond_1
    const/4 v2, 0x4

    if-ne v0, v2, :cond_2

    .line 5
    invoke-interface {p1}, Lc/a/a/a/l1;->R()I

    move-result v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {p0, p1, v0, v2, v3}, Lcom/google/android/exoplayer2/ui/j;->M(Lc/a/a/a/l1;IJ)Z

    .line 6
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->J:Lc/a/a/a/j0;

    invoke-interface {v0, p1, v1}, Lc/a/a/a/j0;->j(Lc/a/a/a/l1;Z)Z

    return-void
.end method

.method private D(Lc/a/a/a/l1;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Lc/a/a/a/l1;->q()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    .line 2
    invoke-interface {p1}, Lc/a/a/a/l1;->n()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/ui/j;->B(Lc/a/a/a/l1;)V

    goto :goto_1

    .line 4
    :cond_1
    :goto_0
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/ui/j;->C(Lc/a/a/a/l1;)V

    :goto_1
    return-void
.end method

.method private static E(Landroid/content/res/TypedArray;I)I
    .locals 1

    .line 1
    sget v0, Lcom/google/android/exoplayer2/ui/q;->z:I

    invoke-virtual {p0, v0, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p0

    return p0
.end method

.method private G()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->t:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 2
    iget v0, p0, Lcom/google/android/exoplayer2/ui/j;->Q:I

    if-lez v0, :cond_0

    .line 3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget v2, p0, Lcom/google/android/exoplayer2/ui/j;->Q:I

    int-to-long v3, v2

    add-long/2addr v0, v3

    iput-wide v0, p0, Lcom/google/android/exoplayer2/ui/j;->b0:J

    .line 4
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/j;->M:Z

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->t:Ljava/lang/Runnable;

    int-to-long v1, v2

    invoke-virtual {p0, v0, v1, v2}, Landroid/widget/FrameLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    iput-wide v0, p0, Lcom/google/android/exoplayer2/ui/j;->b0:J

    :cond_1
    :goto_0
    return-void
.end method

.method private static H(I)Z
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    const/16 v0, 0x5a

    if-eq p0, v0, :cond_1

    const/16 v0, 0x59

    if-eq p0, v0, :cond_1

    const/16 v0, 0x55

    if-eq p0, v0, :cond_1

    const/16 v0, 0x4f

    if-eq p0, v0, :cond_1

    const/16 v0, 0x7e

    if-eq p0, v0, :cond_1

    const/16 v0, 0x7f

    if-eq p0, v0, :cond_1

    const/16 v0, 0x57

    if-eq p0, v0, :cond_1

    const/16 v0, 0x58

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static synthetic J(Lcom/google/android/exoplayer2/ui/j;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->U()V

    return-void
.end method

.method private L()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->O()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j;->e:Landroid/view/View;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->f:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    :cond_1
    :goto_0
    return-void
.end method

.method private M(Lc/a/a/a/l1;IJ)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->J:Lc/a/a/a/j0;

    invoke-interface {v0, p1, p2, p3, p4}, Lc/a/a/a/j0;->k(Lc/a/a/a/l1;IJ)Z

    move-result p1

    return p1
.end method

.method private N(Lc/a/a/a/l1;J)V
    .locals 6

    .line 1
    invoke-interface {p1}, Lc/a/a/a/l1;->M()Lc/a/a/a/x1;

    move-result-object v0

    .line 2
    iget-boolean v1, p0, Lcom/google/android/exoplayer2/ui/j;->O:Z

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lc/a/a/a/x1;->q()Z

    move-result v1

    if-nez v1, :cond_2

    .line 3
    invoke-virtual {v0}, Lc/a/a/a/x1;->p()I

    move-result v1

    const/4 v2, 0x0

    .line 4
    :goto_0
    iget-object v3, p0, Lcom/google/android/exoplayer2/ui/j;->r:Lc/a/a/a/x1$c;

    invoke-virtual {v0, v2, v3}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    move-result-object v3

    invoke-virtual {v3}, Lc/a/a/a/x1$c;->d()J

    move-result-wide v3

    cmp-long v5, p2, v3

    if-gez v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v1, -0x1

    if-ne v2, v5, :cond_1

    move-wide p2, v3

    goto :goto_1

    :cond_1
    sub-long/2addr p2, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 5
    :cond_2
    invoke-interface {p1}, Lc/a/a/a/l1;->R()I

    move-result v2

    .line 6
    :goto_1
    invoke-direct {p0, p1, v2, p2, p3}, Lcom/google/android/exoplayer2/ui/j;->M(Lc/a/a/a/l1;IJ)Z

    move-result p1

    if-nez p1, :cond_3

    .line 7
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->U()V

    :cond_3
    return-void
.end method

.method private O()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->I:Lc/a/a/a/l1;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lc/a/a/a/l1;->q()I

    move-result v0

    const/4 v2, 0x4

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->I:Lc/a/a/a/l1;

    .line 3
    invoke-interface {v0}, Lc/a/a/a/l1;->q()I

    move-result v0

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->I:Lc/a/a/a/l1;

    .line 4
    invoke-interface {v0}, Lc/a/a/a/l1;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private Q()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->T()V

    .line 2
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->S()V

    .line 3
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->V()V

    .line 4
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->W()V

    .line 5
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->X()V

    return-void
.end method

.method private R(ZZLandroid/view/View;)V
    .locals 0

    if-nez p3, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p3, p2}, Landroid/view/View;->setEnabled(Z)V

    if-eqz p2, :cond_1

    .line 2
    iget p2, p0, Lcom/google/android/exoplayer2/ui/j;->C:F

    goto :goto_0

    :cond_1
    iget p2, p0, Lcom/google/android/exoplayer2/ui/j;->D:F

    :goto_0
    invoke-virtual {p3, p2}, Landroid/view/View;->setAlpha(F)V

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    const/16 p1, 0x8

    .line 3
    :goto_1
    invoke-virtual {p3, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private S()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/j;->I()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/j;->M:Z

    if-nez v0, :cond_0

    goto/16 :goto_5

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->I:Lc/a/a/a/l1;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    .line 3
    invoke-interface {v0}, Lc/a/a/a/l1;->M()Lc/a/a/a/x1;

    move-result-object v2

    .line 4
    invoke-virtual {v2}, Lc/a/a/a/x1;->q()Z

    move-result v3

    if-nez v3, :cond_8

    invoke-interface {v0}, Lc/a/a/a/l1;->h()Z

    move-result v3

    if-nez v3, :cond_8

    .line 5
    invoke-interface {v0}, Lc/a/a/a/l1;->R()I

    move-result v3

    iget-object v4, p0, Lcom/google/android/exoplayer2/ui/j;->r:Lc/a/a/a/x1$c;

    invoke-virtual {v2, v3, v4}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    .line 6
    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/j;->r:Lc/a/a/a/x1$c;

    iget-boolean v3, v2, Lc/a/a/a/x1$c;->j:Z

    const/4 v4, 0x1

    if-nez v3, :cond_2

    .line 7
    invoke-virtual {v2}, Lc/a/a/a/x1$c;->f()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Lc/a/a/a/l1;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v2, 0x1

    :goto_1
    if-eqz v3, :cond_3

    .line 8
    iget-object v5, p0, Lcom/google/android/exoplayer2/ui/j;->J:Lc/a/a/a/j0;

    invoke-interface {v5}, Lc/a/a/a/j0;->f()Z

    move-result v5

    if-eqz v5, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    :goto_2
    if-eqz v3, :cond_4

    .line 9
    iget-object v6, p0, Lcom/google/android/exoplayer2/ui/j;->J:Lc/a/a/a/j0;

    invoke-interface {v6}, Lc/a/a/a/j0;->i()Z

    move-result v6

    if-eqz v6, :cond_4

    const/4 v6, 0x1

    goto :goto_3

    :cond_4
    const/4 v6, 0x0

    .line 10
    :goto_3
    iget-object v7, p0, Lcom/google/android/exoplayer2/ui/j;->r:Lc/a/a/a/x1$c;

    invoke-virtual {v7}, Lc/a/a/a/x1$c;->f()Z

    move-result v7

    if-eqz v7, :cond_5

    iget-object v7, p0, Lcom/google/android/exoplayer2/ui/j;->r:Lc/a/a/a/x1$c;

    iget-boolean v7, v7, Lc/a/a/a/x1$c;->k:Z

    if-nez v7, :cond_6

    :cond_5
    invoke-interface {v0}, Lc/a/a/a/l1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    const/4 v1, 0x1

    :cond_7
    move v0, v1

    move v1, v2

    goto :goto_4

    :cond_8
    const/4 v0, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 11
    :goto_4
    iget-boolean v2, p0, Lcom/google/android/exoplayer2/ui/j;->V:Z

    iget-object v4, p0, Lcom/google/android/exoplayer2/ui/j;->c:Landroid/view/View;

    invoke-direct {p0, v2, v1, v4}, Lcom/google/android/exoplayer2/ui/j;->R(ZZLandroid/view/View;)V

    .line 12
    iget-boolean v1, p0, Lcom/google/android/exoplayer2/ui/j;->T:Z

    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/j;->h:Landroid/view/View;

    invoke-direct {p0, v1, v5, v2}, Lcom/google/android/exoplayer2/ui/j;->R(ZZLandroid/view/View;)V

    .line 13
    iget-boolean v1, p0, Lcom/google/android/exoplayer2/ui/j;->U:Z

    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/j;->g:Landroid/view/View;

    invoke-direct {p0, v1, v6, v2}, Lcom/google/android/exoplayer2/ui/j;->R(ZZLandroid/view/View;)V

    .line 14
    iget-boolean v1, p0, Lcom/google/android/exoplayer2/ui/j;->W:Z

    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/j;->d:Landroid/view/View;

    invoke-direct {p0, v1, v0, v2}, Lcom/google/android/exoplayer2/ui/j;->R(ZZLandroid/view/View;)V

    .line 15
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->n:Lcom/google/android/exoplayer2/ui/u;

    if-eqz v0, :cond_9

    .line 16
    invoke-interface {v0, v3}, Lcom/google/android/exoplayer2/ui/u;->setEnabled(Z)V

    :cond_9
    :goto_5
    return-void
.end method

.method private T()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/j;->I()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/j;->M:Z

    if-nez v0, :cond_0

    goto :goto_4

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->O()Z

    move-result v0

    .line 3
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j;->e:Landroid/view/View;

    const/16 v2, 0x8

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_3

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v1}, Landroid/view/View;->isFocused()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v1, v4

    .line 5
    iget-object v5, p0, Lcom/google/android/exoplayer2/ui/j;->e:Landroid/view/View;

    if-eqz v0, :cond_2

    const/16 v6, 0x8

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    :goto_1
    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    .line 6
    :goto_2
    iget-object v5, p0, Lcom/google/android/exoplayer2/ui/j;->f:Landroid/view/View;

    if-eqz v5, :cond_6

    if-nez v0, :cond_4

    .line 7
    invoke-virtual {v5}, Landroid/view/View;->isFocused()Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_3

    :cond_4
    const/4 v3, 0x0

    :goto_3
    or-int/2addr v1, v3

    .line 8
    iget-object v3, p0, Lcom/google/android/exoplayer2/ui/j;->f:Landroid/view/View;

    if-eqz v0, :cond_5

    const/4 v2, 0x0

    :cond_5
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_6
    if-eqz v1, :cond_7

    .line 9
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->L()V

    :cond_7
    :goto_4
    return-void
.end method

.method private U()V
    .locals 13

    .line 1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/j;->I()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/j;->M:Z

    if-nez v0, :cond_0

    goto/16 :goto_3

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->I:Lc/a/a/a/l1;

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_1

    .line 3
    iget-wide v1, p0, Lcom/google/android/exoplayer2/ui/j;->g0:J

    invoke-interface {v0}, Lc/a/a/a/l1;->i()J

    move-result-wide v3

    add-long/2addr v1, v3

    .line 4
    iget-wide v3, p0, Lcom/google/android/exoplayer2/ui/j;->g0:J

    invoke-interface {v0}, Lc/a/a/a/l1;->Q()J

    move-result-wide v5

    add-long/2addr v3, v5

    goto :goto_0

    :cond_1
    move-wide v3, v1

    .line 5
    :goto_0
    iget-object v5, p0, Lcom/google/android/exoplayer2/ui/j;->m:Landroid/widget/TextView;

    if-eqz v5, :cond_2

    iget-boolean v6, p0, Lcom/google/android/exoplayer2/ui/j;->P:Z

    if-nez v6, :cond_2

    .line 6
    iget-object v6, p0, Lcom/google/android/exoplayer2/ui/j;->o:Ljava/lang/StringBuilder;

    iget-object v7, p0, Lcom/google/android/exoplayer2/ui/j;->p:Ljava/util/Formatter;

    invoke-static {v6, v7, v1, v2}, Lc/a/a/a/m2/m0;->a0(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    :cond_2
    iget-object v5, p0, Lcom/google/android/exoplayer2/ui/j;->n:Lcom/google/android/exoplayer2/ui/u;

    if-eqz v5, :cond_3

    .line 8
    invoke-interface {v5, v1, v2}, Lcom/google/android/exoplayer2/ui/u;->setPosition(J)V

    .line 9
    iget-object v5, p0, Lcom/google/android/exoplayer2/ui/j;->n:Lcom/google/android/exoplayer2/ui/u;

    invoke-interface {v5, v3, v4}, Lcom/google/android/exoplayer2/ui/u;->setBufferedPosition(J)V

    .line 10
    :cond_3
    iget-object v5, p0, Lcom/google/android/exoplayer2/ui/j;->K:Lcom/google/android/exoplayer2/ui/j$c;

    if-eqz v5, :cond_4

    .line 11
    invoke-interface {v5, v1, v2, v3, v4}, Lcom/google/android/exoplayer2/ui/j$c;->a(JJ)V

    .line 12
    :cond_4
    iget-object v3, p0, Lcom/google/android/exoplayer2/ui/j;->s:Ljava/lang/Runnable;

    invoke-virtual {p0, v3}, Landroid/widget/FrameLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v3, 0x1

    if-nez v0, :cond_5

    const/4 v4, 0x1

    goto :goto_1

    .line 13
    :cond_5
    invoke-interface {v0}, Lc/a/a/a/l1;->q()I

    move-result v4

    :goto_1
    const-wide/16 v5, 0x3e8

    if-eqz v0, :cond_8

    .line 14
    invoke-interface {v0}, Lc/a/a/a/l1;->t()Z

    move-result v7

    if-eqz v7, :cond_8

    .line 15
    iget-object v3, p0, Lcom/google/android/exoplayer2/ui/j;->n:Lcom/google/android/exoplayer2/ui/u;

    if-eqz v3, :cond_6

    invoke-interface {v3}, Lcom/google/android/exoplayer2/ui/u;->getPreferredUpdateDelay()J

    move-result-wide v3

    goto :goto_2

    :cond_6
    move-wide v3, v5

    .line 16
    :goto_2
    rem-long/2addr v1, v5

    sub-long v1, v5, v1

    .line 17
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    .line 18
    invoke-interface {v0}, Lc/a/a/a/l1;->c()Lc/a/a/a/i1;

    move-result-object v0

    iget v0, v0, Lc/a/a/a/i1;->b:F

    const/4 v3, 0x0

    cmpl-float v3, v0, v3

    if-lez v3, :cond_7

    long-to-float v1, v1

    div-float/2addr v1, v0

    float-to-long v5, v1

    :cond_7
    move-wide v7, v5

    .line 19
    iget v0, p0, Lcom/google/android/exoplayer2/ui/j;->R:I

    int-to-long v9, v0

    const-wide/16 v11, 0x3e8

    invoke-static/range {v7 .. v12}, Lc/a/a/a/m2/m0;->q(JJJ)J

    move-result-wide v0

    .line 20
    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/j;->s:Ljava/lang/Runnable;

    invoke-virtual {p0, v2, v0, v1}, Landroid/widget/FrameLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_3

    :cond_8
    const/4 v0, 0x4

    if-eq v4, v0, :cond_9

    if-eq v4, v3, :cond_9

    .line 21
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->s:Ljava/lang/Runnable;

    invoke-virtual {p0, v0, v5, v6}, Landroid/widget/FrameLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_9
    :goto_3
    return-void
.end method

.method private V()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/j;->I()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/j;->M:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->i:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget v1, p0, Lcom/google/android/exoplayer2/ui/j;->S:I

    const/4 v2, 0x0

    if-nez v1, :cond_1

    .line 3
    invoke-direct {p0, v2, v2, v0}, Lcom/google/android/exoplayer2/ui/j;->R(ZZLandroid/view/View;)V

    return-void

    .line 4
    :cond_1
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j;->I:Lc/a/a/a/l1;

    const/4 v3, 0x1

    if-nez v1, :cond_2

    .line 5
    invoke-direct {p0, v3, v2, v0}, Lcom/google/android/exoplayer2/ui/j;->R(ZZLandroid/view/View;)V

    .line 6
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->i:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j;->u:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 7
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->i:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    .line 8
    :cond_2
    invoke-direct {p0, v3, v3, v0}, Lcom/google/android/exoplayer2/ui/j;->R(ZZLandroid/view/View;)V

    .line 9
    invoke-interface {v1}, Lc/a/a/a/l1;->K()I

    move-result v0

    if-eqz v0, :cond_5

    if-eq v0, v3, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    goto :goto_0

    .line 10
    :cond_3
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->i:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j;->w:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 11
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->i:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 12
    :cond_4
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->i:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j;->v:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 13
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->i:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 14
    :cond_5
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->i:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j;->u:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 15
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->i:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 16
    :goto_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->i:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_6
    :goto_1
    return-void
.end method

.method private W()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/j;->I()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/j;->M:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->j:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    goto :goto_2

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j;->I:Lc/a/a/a/l1;

    .line 3
    iget-boolean v2, p0, Lcom/google/android/exoplayer2/ui/j;->a0:Z

    const/4 v3, 0x0

    if-nez v2, :cond_1

    .line 4
    invoke-direct {p0, v3, v3, v0}, Lcom/google/android/exoplayer2/ui/j;->R(ZZLandroid/view/View;)V

    goto :goto_2

    :cond_1
    const/4 v2, 0x1

    if-nez v1, :cond_2

    .line 5
    invoke-direct {p0, v2, v3, v0}, Lcom/google/android/exoplayer2/ui/j;->R(ZZLandroid/view/View;)V

    .line 6
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->j:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j;->B:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 7
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->j:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j;->H:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 8
    :cond_2
    invoke-direct {p0, v2, v2, v0}, Lcom/google/android/exoplayer2/ui/j;->R(ZZLandroid/view/View;)V

    .line 9
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->j:Landroid/widget/ImageView;

    .line 10
    invoke-interface {v1}, Lc/a/a/a/l1;->O()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/j;->A:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    :cond_3
    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/j;->B:Landroid/graphics/drawable/Drawable;

    .line 11
    :goto_0
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 12
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->j:Landroid/widget/ImageView;

    .line 13
    invoke-interface {v1}, Lc/a/a/a/l1;->O()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 14
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j;->G:Ljava/lang/String;

    goto :goto_1

    .line 15
    :cond_4
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j;->H:Ljava/lang/String;

    .line 16
    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_5
    :goto_2
    return-void
.end method

.method private X()V
    .locals 22

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lcom/google/android/exoplayer2/ui/j;->I:Lc/a/a/a/l1;

    if-nez v1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-boolean v2, v0, Lcom/google/android/exoplayer2/ui/j;->N:Z

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    .line 3
    invoke-interface {v1}, Lc/a/a/a/l1;->M()Lc/a/a/a/x1;

    move-result-object v2

    iget-object v5, v0, Lcom/google/android/exoplayer2/ui/j;->r:Lc/a/a/a/x1$c;

    invoke-static {v2, v5}, Lcom/google/android/exoplayer2/ui/j;->z(Lc/a/a/a/x1;Lc/a/a/a/x1$c;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, v0, Lcom/google/android/exoplayer2/ui/j;->O:Z

    const-wide/16 v5, 0x0

    .line 4
    iput-wide v5, v0, Lcom/google/android/exoplayer2/ui/j;->g0:J

    .line 5
    invoke-interface {v1}, Lc/a/a/a/l1;->M()Lc/a/a/a/x1;

    move-result-object v2

    .line 6
    invoke-virtual {v2}, Lc/a/a/a/x1;->q()Z

    move-result v7

    if-nez v7, :cond_e

    .line 7
    invoke-interface {v1}, Lc/a/a/a/l1;->R()I

    move-result v1

    .line 8
    iget-boolean v7, v0, Lcom/google/android/exoplayer2/ui/j;->O:Z

    if-eqz v7, :cond_2

    const/4 v8, 0x0

    goto :goto_1

    :cond_2
    move v8, v1

    :goto_1
    if-eqz v7, :cond_3

    .line 9
    invoke-virtual {v2}, Lc/a/a/a/x1;->p()I

    move-result v7

    sub-int/2addr v7, v4

    goto :goto_2

    :cond_3
    move v7, v1

    :goto_2
    move-wide v9, v5

    const/4 v11, 0x0

    :goto_3
    if-gt v8, v7, :cond_d

    if-ne v8, v1, :cond_4

    .line 10
    invoke-static {v9, v10}, Lc/a/a/a/i0;->d(J)J

    move-result-wide v12

    iput-wide v12, v0, Lcom/google/android/exoplayer2/ui/j;->g0:J

    .line 11
    :cond_4
    iget-object v12, v0, Lcom/google/android/exoplayer2/ui/j;->r:Lc/a/a/a/x1$c;

    invoke-virtual {v2, v8, v12}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    .line 12
    iget-object v12, v0, Lcom/google/android/exoplayer2/ui/j;->r:Lc/a/a/a/x1$c;

    iget-wide v13, v12, Lc/a/a/a/x1$c;->r:J

    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v17, v13, v15

    if-nez v17, :cond_5

    .line 13
    iget-boolean v1, v0, Lcom/google/android/exoplayer2/ui/j;->O:Z

    xor-int/2addr v1, v4

    invoke-static {v1}, Lc/a/a/a/m2/f;->f(Z)V

    goto/16 :goto_8

    .line 14
    :cond_5
    iget v12, v12, Lc/a/a/a/x1$c;->o:I

    :goto_4
    iget-object v13, v0, Lcom/google/android/exoplayer2/ui/j;->r:Lc/a/a/a/x1$c;

    iget v14, v13, Lc/a/a/a/x1$c;->p:I

    if-gt v12, v14, :cond_c

    .line 15
    iget-object v13, v0, Lcom/google/android/exoplayer2/ui/j;->q:Lc/a/a/a/x1$b;

    invoke-virtual {v2, v12, v13}, Lc/a/a/a/x1;->f(ILc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    .line 16
    iget-object v13, v0, Lcom/google/android/exoplayer2/ui/j;->q:Lc/a/a/a/x1$b;

    invoke-virtual {v13}, Lc/a/a/a/x1$b;->c()I

    move-result v13

    const/4 v14, 0x0

    :goto_5
    if-ge v14, v13, :cond_b

    .line 17
    iget-object v4, v0, Lcom/google/android/exoplayer2/ui/j;->q:Lc/a/a/a/x1$b;

    invoke-virtual {v4, v14}, Lc/a/a/a/x1$b;->f(I)J

    move-result-wide v18

    const-wide/high16 v20, -0x8000000000000000L

    cmp-long v4, v18, v20

    if-nez v4, :cond_7

    .line 18
    iget-object v4, v0, Lcom/google/android/exoplayer2/ui/j;->q:Lc/a/a/a/x1$b;

    iget-wide v3, v4, Lc/a/a/a/x1$b;->d:J

    cmp-long v18, v3, v15

    if-nez v18, :cond_6

    goto :goto_7

    :cond_6
    move-wide/from16 v18, v3

    .line 19
    :cond_7
    iget-object v3, v0, Lcom/google/android/exoplayer2/ui/j;->q:Lc/a/a/a/x1$b;

    invoke-virtual {v3}, Lc/a/a/a/x1$b;->l()J

    move-result-wide v3

    add-long v18, v18, v3

    cmp-long v3, v18, v5

    if-ltz v3, :cond_a

    .line 20
    iget-object v3, v0, Lcom/google/android/exoplayer2/ui/j;->c0:[J

    array-length v4, v3

    if-ne v11, v4, :cond_9

    .line 21
    array-length v4, v3

    if-nez v4, :cond_8

    const/4 v4, 0x1

    goto :goto_6

    :cond_8
    array-length v4, v3

    mul-int/lit8 v4, v4, 0x2

    .line 22
    :goto_6
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v3

    iput-object v3, v0, Lcom/google/android/exoplayer2/ui/j;->c0:[J

    .line 23
    iget-object v3, v0, Lcom/google/android/exoplayer2/ui/j;->d0:[Z

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object v3

    iput-object v3, v0, Lcom/google/android/exoplayer2/ui/j;->d0:[Z

    .line 24
    :cond_9
    iget-object v3, v0, Lcom/google/android/exoplayer2/ui/j;->c0:[J

    add-long v18, v9, v18

    invoke-static/range {v18 .. v19}, Lc/a/a/a/i0;->d(J)J

    move-result-wide v18

    aput-wide v18, v3, v11

    .line 25
    iget-object v3, v0, Lcom/google/android/exoplayer2/ui/j;->d0:[Z

    iget-object v4, v0, Lcom/google/android/exoplayer2/ui/j;->q:Lc/a/a/a/x1$b;

    invoke-virtual {v4, v14}, Lc/a/a/a/x1$b;->m(I)Z

    move-result v4

    aput-boolean v4, v3, v11

    add-int/lit8 v11, v11, 0x1

    :cond_a
    :goto_7
    add-int/lit8 v14, v14, 0x1

    const/4 v4, 0x1

    goto :goto_5

    :cond_b
    add-int/lit8 v12, v12, 0x1

    const/4 v4, 0x1

    goto :goto_4

    .line 26
    :cond_c
    iget-wide v3, v13, Lc/a/a/a/x1$c;->r:J

    add-long/2addr v9, v3

    add-int/lit8 v8, v8, 0x1

    const/4 v4, 0x1

    goto/16 :goto_3

    :cond_d
    :goto_8
    move-wide v5, v9

    goto :goto_9

    :cond_e
    const/4 v11, 0x0

    .line 27
    :goto_9
    invoke-static {v5, v6}, Lc/a/a/a/i0;->d(J)J

    move-result-wide v1

    .line 28
    iget-object v3, v0, Lcom/google/android/exoplayer2/ui/j;->l:Landroid/widget/TextView;

    if-eqz v3, :cond_f

    .line 29
    iget-object v4, v0, Lcom/google/android/exoplayer2/ui/j;->o:Ljava/lang/StringBuilder;

    iget-object v5, v0, Lcom/google/android/exoplayer2/ui/j;->p:Ljava/util/Formatter;

    invoke-static {v4, v5, v1, v2}, Lc/a/a/a/m2/m0;->a0(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    :cond_f
    iget-object v3, v0, Lcom/google/android/exoplayer2/ui/j;->n:Lcom/google/android/exoplayer2/ui/u;

    if-eqz v3, :cond_11

    .line 31
    invoke-interface {v3, v1, v2}, Lcom/google/android/exoplayer2/ui/u;->setDuration(J)V

    .line 32
    iget-object v1, v0, Lcom/google/android/exoplayer2/ui/j;->e0:[J

    array-length v1, v1

    add-int v2, v11, v1

    .line 33
    iget-object v3, v0, Lcom/google/android/exoplayer2/ui/j;->c0:[J

    array-length v4, v3

    if-le v2, v4, :cond_10

    .line 34
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v3

    iput-object v3, v0, Lcom/google/android/exoplayer2/ui/j;->c0:[J

    .line 35
    iget-object v3, v0, Lcom/google/android/exoplayer2/ui/j;->d0:[Z

    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object v3

    iput-object v3, v0, Lcom/google/android/exoplayer2/ui/j;->d0:[Z

    .line 36
    :cond_10
    iget-object v3, v0, Lcom/google/android/exoplayer2/ui/j;->e0:[J

    iget-object v4, v0, Lcom/google/android/exoplayer2/ui/j;->c0:[J

    const/4 v5, 0x0

    invoke-static {v3, v5, v4, v11, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 37
    iget-object v3, v0, Lcom/google/android/exoplayer2/ui/j;->f0:[Z

    iget-object v4, v0, Lcom/google/android/exoplayer2/ui/j;->d0:[Z

    invoke-static {v3, v5, v4, v11, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 38
    iget-object v1, v0, Lcom/google/android/exoplayer2/ui/j;->n:Lcom/google/android/exoplayer2/ui/u;

    iget-object v3, v0, Lcom/google/android/exoplayer2/ui/j;->c0:[J

    iget-object v4, v0, Lcom/google/android/exoplayer2/ui/j;->d0:[Z

    invoke-interface {v1, v3, v4, v2}, Lcom/google/android/exoplayer2/ui/u;->a([J[ZI)V

    .line 39
    :cond_11
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/ui/j;->U()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/exoplayer2/ui/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->W()V

    return-void
.end method

.method static synthetic b(Lcom/google/android/exoplayer2/ui/j;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/ui/j;->P:Z

    return p1
.end method

.method static synthetic c(Lcom/google/android/exoplayer2/ui/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->S()V

    return-void
.end method

.method static synthetic d(Lcom/google/android/exoplayer2/ui/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->X()V

    return-void
.end method

.method static synthetic e(Lcom/google/android/exoplayer2/ui/j;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/exoplayer2/ui/j;->d:Landroid/view/View;

    return-object p0
.end method

.method static synthetic f(Lcom/google/android/exoplayer2/ui/j;)Lc/a/a/a/j0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/exoplayer2/ui/j;->J:Lc/a/a/a/j0;

    return-object p0
.end method

.method static synthetic g(Lcom/google/android/exoplayer2/ui/j;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/exoplayer2/ui/j;->c:Landroid/view/View;

    return-object p0
.end method

.method static synthetic h(Lcom/google/android/exoplayer2/ui/j;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/exoplayer2/ui/j;->g:Landroid/view/View;

    return-object p0
.end method

.method static synthetic i(Lcom/google/android/exoplayer2/ui/j;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/exoplayer2/ui/j;->h:Landroid/view/View;

    return-object p0
.end method

.method static synthetic j(Lcom/google/android/exoplayer2/ui/j;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/exoplayer2/ui/j;->e:Landroid/view/View;

    return-object p0
.end method

.method static synthetic k(Lcom/google/android/exoplayer2/ui/j;Lc/a/a/a/l1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/ui/j;->C(Lc/a/a/a/l1;)V

    return-void
.end method

.method static synthetic l(Lcom/google/android/exoplayer2/ui/j;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/exoplayer2/ui/j;->m:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic m(Lcom/google/android/exoplayer2/ui/j;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/exoplayer2/ui/j;->f:Landroid/view/View;

    return-object p0
.end method

.method static synthetic n(Lcom/google/android/exoplayer2/ui/j;Lc/a/a/a/l1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/ui/j;->B(Lc/a/a/a/l1;)V

    return-void
.end method

.method static synthetic o(Lcom/google/android/exoplayer2/ui/j;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/exoplayer2/ui/j;->i:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic p(Lcom/google/android/exoplayer2/ui/j;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/exoplayer2/ui/j;->S:I

    return p0
.end method

.method static synthetic q(Lcom/google/android/exoplayer2/ui/j;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/exoplayer2/ui/j;->j:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic r(Lcom/google/android/exoplayer2/ui/j;)Ljava/lang/StringBuilder;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/exoplayer2/ui/j;->o:Ljava/lang/StringBuilder;

    return-object p0
.end method

.method static synthetic s(Lcom/google/android/exoplayer2/ui/j;)Ljava/util/Formatter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/exoplayer2/ui/j;->p:Ljava/util/Formatter;

    return-object p0
.end method

.method static synthetic t(Lcom/google/android/exoplayer2/ui/j;)Lc/a/a/a/l1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/exoplayer2/ui/j;->I:Lc/a/a/a/l1;

    return-object p0
.end method

.method static synthetic u(Lcom/google/android/exoplayer2/ui/j;Lc/a/a/a/l1;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/exoplayer2/ui/j;->N(Lc/a/a/a/l1;J)V

    return-void
.end method

.method static synthetic v(Lcom/google/android/exoplayer2/ui/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->T()V

    return-void
.end method

.method static synthetic w(Lcom/google/android/exoplayer2/ui/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->U()V

    return-void
.end method

.method static synthetic x(Lcom/google/android/exoplayer2/ui/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->V()V

    return-void
.end method

.method private static z(Lc/a/a/a/x1;Lc/a/a/a/x1$c;)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/x1;->p()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x64

    if-le v0, v2, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {p0}, Lc/a/a/a/x1;->p()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 3
    invoke-virtual {p0, v2, p1}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    move-result-object v3

    iget-wide v3, v3, Lc/a/a/a/x1$c;->r:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v7, v3, v5

    if-nez v7, :cond_1

    return v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public A(Landroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j;->I:Lc/a/a/a/l1;

    if-eqz v1, :cond_9

    .line 3
    invoke-static {v0}, Lcom/google/android/exoplayer2/ui/j;->H(I)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v2

    if-nez v2, :cond_8

    const/16 v2, 0x5a

    if-ne v0, v2, :cond_1

    .line 5
    invoke-interface {v1}, Lc/a/a/a/l1;->q()I

    move-result p1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_8

    .line 6
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j;->J:Lc/a/a/a/j0;

    invoke-interface {p1, v1}, Lc/a/a/a/j0;->c(Lc/a/a/a/l1;)Z

    goto :goto_0

    :cond_1
    const/16 v2, 0x59

    if-ne v0, v2, :cond_2

    .line 7
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j;->J:Lc/a/a/a/j0;

    invoke-interface {p1, v1}, Lc/a/a/a/j0;->h(Lc/a/a/a/l1;)Z

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result p1

    if-nez p1, :cond_8

    const/16 p1, 0x4f

    if-eq v0, p1, :cond_7

    const/16 p1, 0x55

    if-eq v0, p1, :cond_7

    const/16 p1, 0x57

    if-eq v0, p1, :cond_6

    const/16 p1, 0x58

    if-eq v0, p1, :cond_5

    const/16 p1, 0x7e

    if-eq v0, p1, :cond_4

    const/16 p1, 0x7f

    if-eq v0, p1, :cond_3

    goto :goto_0

    .line 9
    :cond_3
    invoke-direct {p0, v1}, Lcom/google/android/exoplayer2/ui/j;->B(Lc/a/a/a/l1;)V

    goto :goto_0

    .line 10
    :cond_4
    invoke-direct {p0, v1}, Lcom/google/android/exoplayer2/ui/j;->C(Lc/a/a/a/l1;)V

    goto :goto_0

    .line 11
    :cond_5
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j;->J:Lc/a/a/a/j0;

    invoke-interface {p1, v1}, Lc/a/a/a/j0;->e(Lc/a/a/a/l1;)Z

    goto :goto_0

    .line 12
    :cond_6
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j;->J:Lc/a/a/a/j0;

    invoke-interface {p1, v1}, Lc/a/a/a/j0;->g(Lc/a/a/a/l1;)Z

    goto :goto_0

    .line 13
    :cond_7
    invoke-direct {p0, v1}, Lcom/google/android/exoplayer2/ui/j;->D(Lc/a/a/a/l1;)V

    :cond_8
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_9
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public F()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/j;->I()Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x8

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/exoplayer2/ui/j$d;

    .line 4
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v2

    invoke-interface {v1, v2}, Lcom/google/android/exoplayer2/ui/j$d;->a(I)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->s:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 6
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->t:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    iput-wide v0, p0, Lcom/google/android/exoplayer2/ui/j;->b0:J

    :cond_1
    return-void
.end method

.method public I()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public K(Lcom/google/android/exoplayer2/ui/j$d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public P()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/j;->I()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/exoplayer2/ui/j$d;

    .line 4
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v2

    invoke-interface {v1, v2}, Lcom/google/android/exoplayer2/ui/j$d;->a(I)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->Q()V

    .line 6
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->L()V

    .line 7
    :cond_1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->G()V

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/ui/j;->A(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->t:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 4
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->G()V

    .line 5
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public getPlayer()Lc/a/a/a/l1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->I:Lc/a/a/a/l1;

    return-object v0
.end method

.method public getRepeatToggleModes()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/exoplayer2/ui/j;->S:I

    return v0
.end method

.method public getShowShuffleButton()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/j;->a0:Z

    return v0
.end method

.method public getShowTimeoutMs()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/exoplayer2/ui/j;->Q:I

    return v0
.end method

.method public getShowVrButton()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->k:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onAttachedToWindow()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/ui/j;->M:Z

    .line 3
    iget-wide v0, p0, Lcom/google/android/exoplayer2/ui/j;->b0:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 4
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    .line 5
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/j;->F()V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/j;->t:Ljava/lang/Runnable;

    invoke-virtual {p0, v2, v0, v1}, Landroid/widget/FrameLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/j;->I()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->G()V

    .line 9
    :cond_2
    :goto_0
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->Q()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/ui/j;->M:Z

    .line 3
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->s:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->t:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setControlDispatcher(Lc/a/a/a/j0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->J:Lc/a/a/a/j0;

    if-eq v0, p1, :cond_0

    .line 2
    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/j;->J:Lc/a/a/a/j0;

    .line 3
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->S()V

    :cond_0
    return-void
.end method

.method public setFastForwardIncrementMs(I)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->J:Lc/a/a/a/j0;

    instance-of v1, v0, Lc/a/a/a/k0;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Lc/a/a/a/k0;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lc/a/a/a/k0;->m(J)V

    .line 3
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->S()V

    :cond_0
    return-void
.end method

.method public setPlaybackPreparer(Lc/a/a/a/j1;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/j;->L:Lc/a/a/a/j1;

    return-void
.end method

.method public setPlayer(Lc/a/a/a/l1;)V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    if-eqz p1, :cond_2

    .line 2
    invoke-interface {p1}, Lc/a/a/a/l1;->N()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 3
    :cond_2
    :goto_1
    invoke-static {v2}, Lc/a/a/a/m2/f;->a(Z)V

    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->I:Lc/a/a/a/l1;

    if-ne v0, p1, :cond_3

    return-void

    :cond_3
    if-eqz v0, :cond_4

    .line 5
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j;->a:Lcom/google/android/exoplayer2/ui/j$b;

    invoke-interface {v0, v1}, Lc/a/a/a/l1;->P(Lc/a/a/a/l1$a;)V

    .line 6
    :cond_4
    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/j;->I:Lc/a/a/a/l1;

    if-eqz p1, :cond_5

    .line 7
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->a:Lcom/google/android/exoplayer2/ui/j$b;

    invoke-interface {p1, v0}, Lc/a/a/a/l1;->C(Lc/a/a/a/l1$a;)V

    .line 8
    :cond_5
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->Q()V

    return-void
.end method

.method public setProgressUpdateListener(Lcom/google/android/exoplayer2/ui/j$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/j;->K:Lcom/google/android/exoplayer2/ui/j$c;

    return-void
.end method

.method public setRepeatToggleModes(I)V
    .locals 3

    .line 1
    iput p1, p0, Lcom/google/android/exoplayer2/ui/j;->S:I

    .line 2
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->I:Lc/a/a/a/l1;

    if-eqz v0, :cond_2

    .line 3
    invoke-interface {v0}, Lc/a/a/a/l1;->K()I

    move-result v0

    if-nez p1, :cond_0

    if-eqz v0, :cond_0

    .line 4
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j;->J:Lc/a/a/a/j0;

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->I:Lc/a/a/a/l1;

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lc/a/a/a/j0;->a(Lc/a/a/a/l1;I)Z

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ne p1, v2, :cond_1

    if-ne v0, v1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j;->J:Lc/a/a/a/j0;

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->I:Lc/a/a/a/l1;

    invoke-interface {p1, v0, v2}, Lc/a/a/a/j0;->a(Lc/a/a/a/l1;I)Z

    goto :goto_0

    :cond_1
    if-ne p1, v1, :cond_2

    if-ne v0, v2, :cond_2

    .line 6
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/j;->J:Lc/a/a/a/j0;

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->I:Lc/a/a/a/l1;

    invoke-interface {p1, v0, v1}, Lc/a/a/a/j0;->a(Lc/a/a/a/l1;I)Z

    .line 7
    :cond_2
    :goto_0
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->V()V

    return-void
.end method

.method public setRewindIncrementMs(I)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->J:Lc/a/a/a/j0;

    instance-of v1, v0, Lc/a/a/a/k0;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Lc/a/a/a/k0;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lc/a/a/a/k0;->n(J)V

    .line 3
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->S()V

    :cond_0
    return-void
.end method

.method public setShowFastForwardButton(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/ui/j;->U:Z

    .line 2
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->S()V

    return-void
.end method

.method public setShowMultiWindowTimeBar(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/ui/j;->N:Z

    .line 2
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->X()V

    return-void
.end method

.method public setShowNextButton(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/ui/j;->W:Z

    .line 2
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->S()V

    return-void
.end method

.method public setShowPreviousButton(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/ui/j;->V:Z

    .line 2
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->S()V

    return-void
.end method

.method public setShowRewindButton(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/ui/j;->T:Z

    .line 2
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->S()V

    return-void
.end method

.method public setShowShuffleButton(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/ui/j;->a0:Z

    .line 2
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->W()V

    return-void
.end method

.method public setShowTimeoutMs(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/exoplayer2/ui/j;->Q:I

    .line 2
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/j;->I()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/j;->G()V

    :cond_0
    return-void
.end method

.method public setShowVrButton(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->k:Landroid/view/View;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    .line 2
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public setTimeBarMinUpdateInterval(I)V
    .locals 2

    const/16 v0, 0x10

    const/16 v1, 0x3e8

    .line 1
    invoke-static {p1, v0, v1}, Lc/a/a/a/m2/m0;->p(III)I

    move-result p1

    iput p1, p0, Lcom/google/android/exoplayer2/ui/j;->R:I

    return-void
.end method

.method public setVrButtonListener(Landroid/view/View$OnClickListener;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->k:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/j;->getShowVrButton()Z

    move-result v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/j;->k:Landroid/view/View;

    invoke-direct {p0, v0, p1, v1}, Lcom/google/android/exoplayer2/ui/j;->R(ZZLandroid/view/View;)V

    :cond_1
    return-void
.end method

.method public y(Lcom/google/android/exoplayer2/ui/j$d;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/j;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
