.class final Lcom/google/android/exoplayer2/ui/w;
.super Landroid/widget/FrameLayout;
.source "WebViewSubtitleOutput.java"

# interfaces
.implements Lcom/google/android/exoplayer2/ui/SubtitleView$a;


# instance fields
.field private final a:Lcom/google/android/exoplayer2/ui/g;

.field private final b:Landroid/webkit/WebView;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/a/k2/c;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lc/a/a/a/k2/b;

.field private e:F

.field private f:I

.field private g:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/google/android/exoplayer2/ui/w;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/w;->c:Ljava/util/List;

    .line 4
    sget-object v0, Lc/a/a/a/k2/b;->a:Lc/a/a/a/k2/b;

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/w;->d:Lc/a/a/a/k2/b;

    const v0, 0x3d5a511a    # 0.0533f

    .line 5
    iput v0, p0, Lcom/google/android/exoplayer2/ui/w;->e:F

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lcom/google/android/exoplayer2/ui/w;->f:I

    const v1, 0x3da3d70a    # 0.08f

    .line 7
    iput v1, p0, Lcom/google/android/exoplayer2/ui/w;->g:F

    .line 8
    new-instance v1, Lcom/google/android/exoplayer2/ui/g;

    invoke-direct {v1, p1, p2}, Lcom/google/android/exoplayer2/ui/g;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v1, p0, Lcom/google/android/exoplayer2/ui/w;->a:Lcom/google/android/exoplayer2/ui/g;

    .line 9
    new-instance v2, Lcom/google/android/exoplayer2/ui/w$a;

    invoke-direct {v2, p0, p1, p2}, Lcom/google/android/exoplayer2/ui/w$a;-><init>(Lcom/google/android/exoplayer2/ui/w;Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v2, p0, Lcom/google/android/exoplayer2/ui/w;->b:Landroid/webkit/WebView;

    .line 10
    invoke-virtual {v2, v0}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 11
    invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 12
    invoke-virtual {p0, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method private static b(I)I
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/16 p0, -0x64

    return p0

    :cond_1
    const/16 p0, -0x32

    return p0
.end method

.method private static c(Landroid/text/Layout$Alignment;)Ljava/lang/String;
    .locals 2

    const-string v0, "center"

    if-nez p0, :cond_0

    return-object v0

    .line 1
    :cond_0
    sget-object v1, Lcom/google/android/exoplayer2/ui/w$b;->a:[I

    invoke-virtual {p0}, Landroid/text/Layout$Alignment;->ordinal()I

    move-result p0

    aget p0, v1, p0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_2

    const/4 v1, 0x2

    if-eq p0, v1, :cond_1

    return-object v0

    :cond_1
    const-string p0, "end"

    return-object p0

    :cond_2
    const-string p0, "start"

    return-object p0
.end method

.method private static d(Lc/a/a/a/k2/b;)Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lc/a/a/a/k2/b;->e:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x3

    if-eq v0, v3, :cond_1

    const/4 v3, 0x4

    if-eq v0, v3, :cond_0

    const-string p0, "unset"

    return-object p0

    :cond_0
    new-array v0, v2, [Ljava/lang/Object;

    .line 2
    iget p0, p0, Lc/a/a/a/k2/b;->f:I

    .line 3
    invoke-static {p0}, Lcom/google/android/exoplayer2/ui/i;->b(I)Ljava/lang/String;

    move-result-object p0

    aput-object p0, v0, v1

    const-string p0, "-0.05em -0.05em 0.15em %s"

    .line 4
    invoke-static {p0, v0}, Lc/a/a/a/m2/m0;->A(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    new-array v0, v2, [Ljava/lang/Object;

    .line 5
    iget p0, p0, Lc/a/a/a/k2/b;->f:I

    .line 6
    invoke-static {p0}, Lcom/google/android/exoplayer2/ui/i;->b(I)Ljava/lang/String;

    move-result-object p0

    aput-object p0, v0, v1

    const-string p0, "0.06em 0.08em 0.15em %s"

    .line 7
    invoke-static {p0, v0}, Lc/a/a/a/m2/m0;->A(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    new-array v0, v2, [Ljava/lang/Object;

    .line 8
    iget p0, p0, Lc/a/a/a/k2/b;->f:I

    invoke-static {p0}, Lcom/google/android/exoplayer2/ui/i;->b(I)Ljava/lang/String;

    move-result-object p0

    aput-object p0, v0, v1

    const-string p0, "0.1em 0.12em 0.15em %s"

    invoke-static {p0, v0}, Lc/a/a/a/m2/m0;->A(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    new-array v0, v2, [Ljava/lang/Object;

    .line 9
    iget p0, p0, Lc/a/a/a/k2/b;->f:I

    .line 10
    invoke-static {p0}, Lcom/google/android/exoplayer2/ui/i;->b(I)Ljava/lang/String;

    move-result-object p0

    aput-object p0, v0, v1

    const-string p0, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s"

    .line 11
    invoke-static {p0, v0}, Lc/a/a/a/m2/m0;->A(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private e(IF)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    .line 2
    invoke-static {p1, p2, v0, v1}, Lcom/google/android/exoplayer2/ui/t;->a(IFII)F

    move-result p1

    const p2, -0x800001

    cmpl-float p2, p1, p2

    if-nez p2, :cond_0

    const-string p1, "unset"

    return-object p1

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr p1, p2

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    .line 4
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    aput-object p1, p2, v0

    const-string p1, "%.2fpx"

    invoke-static {p1, p2}, Lc/a/a/a/m2/m0;->A(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private static f(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const-string p0, "horizontal-tb"

    return-object p0

    :cond_0
    const-string p0, "vertical-lr"

    return-object p0

    :cond_1
    const-string p0, "vertical-rl"

    return-object p0
.end method

.method private static h(Lc/a/a/a/k2/c;)Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lc/a/a/a/k2/c;->q:F

    const/4 v1, 0x0

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_2

    .line 2
    iget p0, p0, Lc/a/a/a/k2/c;->p:I

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq p0, v2, :cond_1

    if-ne p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string p0, "skewX"

    goto :goto_1

    :cond_1
    :goto_0
    const-string p0, "skewY"

    :goto_1
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    .line 3
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    aput-object p0, v2, v1

    const-string p0, "%s(%.2fdeg)"

    invoke-static {p0, v2}, Lc/a/a/a/m2/m0;->A(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const-string p0, ""

    return-object p0
.end method

.method private i()V
    .locals 25

    move-object/from16 v0, p0

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x4

    new-array v3, v2, [Ljava/lang/Object;

    .line 2
    iget-object v4, v0, Lcom/google/android/exoplayer2/ui/w;->d:Lc/a/a/a/k2/b;

    iget v4, v4, Lc/a/a/a/k2/b;->b:I

    .line 3
    invoke-static {v4}, Lcom/google/android/exoplayer2/ui/i;->b(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    iget v4, v0, Lcom/google/android/exoplayer2/ui/w;->f:I

    iget v6, v0, Lcom/google/android/exoplayer2/ui/w;->e:F

    .line 4
    invoke-direct {v0, v4, v6}, Lcom/google/android/exoplayer2/ui/w;->e(IF)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x1

    aput-object v4, v3, v6

    const v4, 0x3f99999a    # 1.2f

    .line 5
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    const/4 v8, 0x2

    aput-object v7, v3, v8

    iget-object v7, v0, Lcom/google/android/exoplayer2/ui/w;->d:Lc/a/a/a/k2/b;

    .line 6
    invoke-static {v7}, Lcom/google/android/exoplayer2/ui/w;->d(Lc/a/a/a/k2/b;)Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x3

    aput-object v7, v3, v9

    const-string v7, "<body><div style=\'-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2fem;text-shadow:%s;\'>"

    .line 7
    invoke-static {v7, v3}, Lc/a/a/a/m2/m0;->A(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 8
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    const-string v7, "default_bg"

    .line 10
    invoke-static {v7}, Lcom/google/android/exoplayer2/ui/i;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    new-array v11, v6, [Ljava/lang/Object;

    iget-object v12, v0, Lcom/google/android/exoplayer2/ui/w;->d:Lc/a/a/a/k2/b;

    iget v12, v12, Lc/a/a/a/k2/b;->c:I

    .line 11
    invoke-static {v12}, Lcom/google/android/exoplayer2/ui/i;->b(I)Ljava/lang/String;

    move-result-object v12

    aput-object v12, v11, v5

    const-string v12, "background-color:%s;"

    invoke-static {v12, v11}, Lc/a/a/a/m2/m0;->A(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 12
    invoke-interface {v3, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v10, 0x0

    .line 13
    :goto_0
    iget-object v11, v0, Lcom/google/android/exoplayer2/ui/w;->c:Ljava/util/List;

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v11

    if-ge v10, v11, :cond_11

    .line 14
    iget-object v11, v0, Lcom/google/android/exoplayer2/ui/w;->c:Ljava/util/List;

    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lc/a/a/a/k2/c;

    .line 15
    iget v12, v11, Lc/a/a/a/k2/c;->h:F

    const v13, -0x800001

    const/high16 v14, 0x42c80000    # 100.0f

    cmpl-float v15, v12, v13

    if-eqz v15, :cond_0

    mul-float v12, v12, v14

    goto :goto_1

    :cond_0
    const/high16 v12, 0x42480000    # 50.0f

    .line 16
    :goto_1
    iget v15, v11, Lc/a/a/a/k2/c;->i:I

    invoke-static {v15}, Lcom/google/android/exoplayer2/ui/w;->b(I)I

    move-result v15

    .line 17
    iget v2, v11, Lc/a/a/a/k2/c;->e:F

    const/high16 v16, 0x3f800000    # 1.0f

    const-string v9, "%.2f%%"

    cmpl-float v17, v2, v13

    if-eqz v17, :cond_4

    .line 18
    iget v8, v11, Lc/a/a/a/k2/c;->f:I

    if-eq v8, v6, :cond_2

    new-array v8, v6, [Ljava/lang/Object;

    mul-float v2, v2, v14

    .line 19
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v8, v5

    invoke-static {v9, v8}, Lc/a/a/a/m2/m0;->A(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 20
    iget v8, v11, Lc/a/a/a/k2/c;->p:I

    if-ne v8, v6, :cond_1

    .line 21
    iget v8, v11, Lc/a/a/a/k2/c;->g:I

    invoke-static {v8}, Lcom/google/android/exoplayer2/ui/w;->b(I)I

    move-result v8

    neg-int v8, v8

    goto :goto_2

    .line 22
    :cond_1
    iget v8, v11, Lc/a/a/a/k2/c;->g:I

    invoke-static {v8}, Lcom/google/android/exoplayer2/ui/w;->b(I)I

    move-result v8

    goto :goto_2

    :cond_2
    const/4 v8, 0x0

    const-string v13, "%.2fem"

    cmpl-float v8, v2, v8

    if-ltz v8, :cond_3

    new-array v8, v6, [Ljava/lang/Object;

    mul-float v2, v2, v4

    .line 23
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v8, v5

    invoke-static {v13, v8}, Lc/a/a/a/m2/m0;->A(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v8, 0x0

    goto :goto_2

    :cond_3
    new-array v8, v6, [Ljava/lang/Object;

    neg-float v2, v2

    sub-float v2, v2, v16

    mul-float v2, v2, v4

    .line 24
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v8, v5

    invoke-static {v13, v8}, Lc/a/a/a/m2/m0;->A(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v8, 0x0

    const/4 v13, 0x1

    goto :goto_3

    :cond_4
    new-array v2, v6, [Ljava/lang/Object;

    .line 25
    iget v8, v0, Lcom/google/android/exoplayer2/ui/w;->g:F

    sub-float v16, v16, v8

    mul-float v16, v16, v14

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    aput-object v8, v2, v5

    invoke-static {v9, v2}, Lc/a/a/a/m2/m0;->A(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/16 v8, -0x64

    :goto_2
    const/4 v13, 0x0

    .line 26
    :goto_3
    iget v4, v11, Lc/a/a/a/k2/c;->j:F

    const v18, -0x800001

    cmpl-float v18, v4, v18

    if-eqz v18, :cond_5

    new-array v5, v6, [Ljava/lang/Object;

    mul-float v4, v4, v14

    .line 27
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const/4 v14, 0x0

    aput-object v4, v5, v14

    invoke-static {v9, v5}, Lc/a/a/a/m2/m0;->A(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto :goto_4

    :cond_5
    const-string v4, "fit-content"

    .line 28
    :goto_4
    iget-object v5, v11, Lc/a/a/a/k2/c;->c:Landroid/text/Layout$Alignment;

    invoke-static {v5}, Lcom/google/android/exoplayer2/ui/w;->c(Landroid/text/Layout$Alignment;)Ljava/lang/String;

    move-result-object v5

    .line 29
    iget v9, v11, Lc/a/a/a/k2/c;->p:I

    invoke-static {v9}, Lcom/google/android/exoplayer2/ui/w;->f(I)Ljava/lang/String;

    move-result-object v9

    .line 30
    iget v14, v11, Lc/a/a/a/k2/c;->n:I

    iget v6, v11, Lc/a/a/a/k2/c;->o:F

    invoke-direct {v0, v14, v6}, Lcom/google/android/exoplayer2/ui/w;->e(IF)Ljava/lang/String;

    move-result-object v6

    .line 31
    iget-boolean v14, v11, Lc/a/a/a/k2/c;->l:Z

    if-eqz v14, :cond_6

    iget v14, v11, Lc/a/a/a/k2/c;->m:I

    goto :goto_5

    :cond_6
    iget-object v14, v0, Lcom/google/android/exoplayer2/ui/w;->d:Lc/a/a/a/k2/b;

    iget v14, v14, Lc/a/a/a/k2/b;->d:I

    :goto_5
    invoke-static {v14}, Lcom/google/android/exoplayer2/ui/i;->b(I)Ljava/lang/String;

    move-result-object v14

    move/from16 v19, v8

    .line 32
    iget v8, v11, Lc/a/a/a/k2/c;->p:I

    const-string v20, "right"

    const-string v21, "left"

    const-string v22, "top"

    move/from16 v23, v15

    const/4 v15, 0x1

    if-eq v8, v15, :cond_9

    const/4 v15, 0x2

    if-eq v8, v15, :cond_8

    if-eqz v13, :cond_7

    const-string v22, "bottom"

    :cond_7
    const/4 v13, 0x2

    goto :goto_7

    :cond_8
    if-eqz v13, :cond_a

    goto :goto_6

    :cond_9
    if-eqz v13, :cond_b

    :cond_a
    move-object/from16 v20, v21

    :cond_b
    :goto_6
    move-object/from16 v21, v22

    const/4 v13, 0x2

    move-object/from16 v22, v20

    :goto_7
    if-eq v8, v13, :cond_d

    const/4 v13, 0x1

    if-ne v8, v13, :cond_c

    goto :goto_8

    :cond_c
    const-string v8, "width"

    move/from16 v15, v23

    goto :goto_9

    :cond_d
    :goto_8
    const-string v8, "height"

    move/from16 v15, v19

    move/from16 v19, v23

    .line 33
    :goto_9
    iget-object v13, v11, Lc/a/a/a/k2/c;->b:Ljava/lang/CharSequence;

    .line 34
    invoke-virtual/range {p0 .. p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 35
    invoke-static {v13, v0}, Lcom/google/android/exoplayer2/ui/r;->a(Ljava/lang/CharSequence;F)Lcom/google/android/exoplayer2/ui/r$b;

    move-result-object v0

    .line 36
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_a
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_10

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v23, v13

    move-object/from16 v13, v20

    check-cast v13, Ljava/lang/String;

    .line 37
    invoke-interface {v3, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v20

    move/from16 v24, v10

    move-object/from16 v10, v20

    check-cast v10, Ljava/lang/String;

    invoke-interface {v3, v13, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    if-eqz v10, :cond_f

    .line 38
    invoke-interface {v3, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_e

    goto :goto_b

    :cond_e
    const/4 v10, 0x0

    goto :goto_c

    :cond_f
    :goto_b
    const/4 v10, 0x1

    .line 39
    :goto_c
    invoke-static {v10}, Lc/a/a/a/m2/f;->f(Z)V

    move-object/from16 v13, v23

    move/from16 v10, v24

    goto :goto_a

    :cond_10
    move/from16 v24, v10

    const/16 v10, 0xd

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v13, 0x0

    aput-object v21, v10, v13

    .line 40
    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    const/4 v13, 0x1

    aput-object v12, v10, v13

    const/4 v12, 0x2

    aput-object v22, v10, v12

    const/4 v13, 0x3

    aput-object v2, v10, v13

    const/4 v2, 0x4

    aput-object v8, v10, v2

    const/4 v8, 0x5

    aput-object v4, v10, v8

    const/4 v4, 0x6

    aput-object v5, v10, v4

    const/4 v4, 0x7

    aput-object v9, v10, v4

    const/16 v4, 0x8

    aput-object v6, v10, v4

    const/16 v4, 0x9

    aput-object v14, v10, v4

    const/16 v4, 0xa

    .line 41
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v10, v4

    const/16 v4, 0xb

    .line 42
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v10, v4

    const/16 v4, 0xc

    .line 43
    invoke-static {v11}, Lcom/google/android/exoplayer2/ui/w;->h(Lc/a/a/a/k2/c;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v10, v4

    const-string v4, "<div style=\'position:absolute;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;\'>"

    .line 44
    invoke-static {v4, v10}, Lc/a/a/a/m2/m0;->A(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 45
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v7, v5, v4

    const-string v4, "<span class=\'%s\'>"

    .line 46
    invoke-static {v4, v5}, Lc/a/a/a/m2/m0;->A(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lcom/google/android/exoplayer2/ui/r$b;->a:Ljava/lang/String;

    .line 47
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "</span>"

    .line 48
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "</div>"

    .line 49
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v10, v24, 0x1

    const v4, 0x3f99999a    # 1.2f

    const/4 v5, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x3

    move-object/from16 v0, p0

    const/4 v6, 0x1

    goto/16 :goto_0

    :cond_11
    const-string v0, "</div></body></html>"

    .line 50
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "<html><head><style>"

    .line 52
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 54
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "{"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "}"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_d

    :cond_12
    const-string v2, "</style></head>"

    .line 55
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, p0

    .line 57
    iget-object v2, v0, Lcom/google/android/exoplayer2/ui/w;->b:Landroid/webkit/WebView;

    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lc/a/b/a/c;->c:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    const/4 v3, 0x1

    invoke-static {v1, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    const-string v3, "text/html"

    const-string v4, "base64"

    .line 59
    invoke-virtual {v2, v1, v3, v4}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Lc/a/a/a/k2/b;FIF)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/a/a/a/k2/c;",
            ">;",
            "Lc/a/a/a/k2/b;",
            "FIF)V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/w;->d:Lc/a/a/a/k2/b;

    .line 2
    iput p3, p0, Lcom/google/android/exoplayer2/ui/w;->e:F

    .line 3
    iput p4, p0, Lcom/google/android/exoplayer2/ui/w;->f:I

    .line 4
    iput p5, p0, Lcom/google/android/exoplayer2/ui/w;->g:F

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    .line 7
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 8
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/a/a/a/k2/c;

    .line 9
    iget-object v4, v3, Lc/a/a/a/k2/c;->d:Landroid/graphics/Bitmap;

    if-eqz v4, :cond_0

    .line 10
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 11
    :cond_0
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 12
    :cond_1
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/w;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3

    .line 13
    :cond_2
    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/w;->c:Ljava/util/List;

    .line 14
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/w;->i()V

    .line 15
    :cond_3
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/w;->a:Lcom/google/android/exoplayer2/ui/g;

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/exoplayer2/ui/g;->a(Ljava/util/List;Lc/a/a/a/k2/b;FIF)V

    .line 16
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->invalidate()V

    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/w;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/w;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/w;->i()V

    :cond_0
    return-void
.end method
