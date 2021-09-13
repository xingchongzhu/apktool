.class public final Lcom/tv91/r/w;
.super Ljava/lang/Object;
.source "LayoutToolbarBottomBinding.java"

# interfaces
.implements Lb/r/a;


# instance fields
.field private final a:Landroid/view/View;

.field public final b:Lcom/tv91/features/shared/widget/DrawableTextView;

.field public final c:Lcom/tv91/features/shared/widget/DrawableTextView;

.field public final d:Lcom/tv91/features/shared/widget/DrawableTextView;

.field public final e:Lcom/tv91/features/shared/widget/DrawableTextView;

.field public final f:Lcom/tv91/features/shared/widget/DrawableTextView;


# direct methods
.method private constructor <init>(Landroid/view/View;Lcom/tv91/features/shared/widget/DrawableTextView;Lcom/tv91/features/shared/widget/DrawableTextView;Lcom/tv91/features/shared/widget/DrawableTextView;Lcom/tv91/features/shared/widget/DrawableTextView;Lcom/tv91/features/shared/widget/DrawableTextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/tv91/r/w;->a:Landroid/view/View;

    .line 3
    iput-object p2, p0, Lcom/tv91/r/w;->b:Lcom/tv91/features/shared/widget/DrawableTextView;

    .line 4
    iput-object p3, p0, Lcom/tv91/r/w;->c:Lcom/tv91/features/shared/widget/DrawableTextView;

    .line 5
    iput-object p4, p0, Lcom/tv91/r/w;->d:Lcom/tv91/features/shared/widget/DrawableTextView;

    .line 6
    iput-object p5, p0, Lcom/tv91/r/w;->e:Lcom/tv91/features/shared/widget/DrawableTextView;

    .line 7
    iput-object p6, p0, Lcom/tv91/r/w;->f:Lcom/tv91/features/shared/widget/DrawableTextView;

    return-void
.end method

.method public static b(Landroid/view/View;)Lcom/tv91/r/w;
    .locals 9

    const v0, 0x7f0a005f

    .line 1
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/tv91/features/shared/widget/DrawableTextView;

    if-eqz v4, :cond_0

    const v0, 0x7f0a0060

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/tv91/features/shared/widget/DrawableTextView;

    if-eqz v5, :cond_0

    const v0, 0x7f0a0061

    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/tv91/features/shared/widget/DrawableTextView;

    if-eqz v6, :cond_0

    const v0, 0x7f0a0062

    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/tv91/features/shared/widget/DrawableTextView;

    if-eqz v7, :cond_0

    const v0, 0x7f0a0063

    .line 5
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lcom/tv91/features/shared/widget/DrawableTextView;

    if-eqz v8, :cond_0

    .line 6
    new-instance v0, Lcom/tv91/r/w;

    move-object v2, v0

    move-object v3, p0

    invoke-direct/range {v2 .. v8}, Lcom/tv91/r/w;-><init>(Landroid/view/View;Lcom/tv91/features/shared/widget/DrawableTextView;Lcom/tv91/features/shared/widget/DrawableTextView;Lcom/tv91/features/shared/widget/DrawableTextView;Lcom/tv91/features/shared/widget/DrawableTextView;Lcom/tv91/features/shared/widget/DrawableTextView;)V

    return-object v0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    .line 8
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/r/w;->a:Landroid/view/View;

    return-object v0
.end method
