.class public final Lcom/tv91/r/z;
.super Ljava/lang/Object;
.source "ViewActorBinding.java"

# interfaces
.implements Lb/r/a;


# instance fields
.field private final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final b:Landroidx/constraintlayout/widget/Guideline;

.field public final c:Landroid/widget/LinearLayout;

.field public final d:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final e:Landroid/widget/ProgressBar;

.field public final f:Landroidx/recyclerview/widget/RecyclerView;

.field public final g:Lcom/tv91/r/y;

.field public final h:Landroidx/constraintlayout/widget/Guideline;


# direct methods
.method private constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/LinearLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ProgressBar;Landroidx/recyclerview/widget/RecyclerView;Lcom/tv91/r/y;Landroidx/constraintlayout/widget/Guideline;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/tv91/r/z;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 3
    iput-object p2, p0, Lcom/tv91/r/z;->b:Landroidx/constraintlayout/widget/Guideline;

    .line 4
    iput-object p3, p0, Lcom/tv91/r/z;->c:Landroid/widget/LinearLayout;

    .line 5
    iput-object p4, p0, Lcom/tv91/r/z;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    iput-object p5, p0, Lcom/tv91/r/z;->e:Landroid/widget/ProgressBar;

    .line 7
    iput-object p6, p0, Lcom/tv91/r/z;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    iput-object p7, p0, Lcom/tv91/r/z;->g:Lcom/tv91/r/y;

    .line 9
    iput-object p8, p0, Lcom/tv91/r/z;->h:Landroidx/constraintlayout/widget/Guideline;

    return-void
.end method

.method public static b(Landroid/view/View;)Lcom/tv91/r/z;
    .locals 11

    const v0, 0x7f0a005d

    .line 1
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v4, :cond_0

    const v0, 0x7f0a0064

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/LinearLayout;

    if-eqz v5, :cond_0

    .line 3
    move-object v6, p0

    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout;

    const v0, 0x7f0a01e8

    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/ProgressBar;

    if-eqz v7, :cond_0

    const v0, 0x7f0a0202

    .line 5
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v8, :cond_0

    const v0, 0x7f0a02fc

    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 7
    invoke-static {v1}, Lcom/tv91/r/y;->b(Landroid/view/View;)Lcom/tv91/r/y;

    move-result-object v9

    const v0, 0x7f0a0306

    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v10, :cond_0

    .line 9
    new-instance p0, Lcom/tv91/r/z;

    move-object v2, p0

    move-object v3, v6

    invoke-direct/range {v2 .. v10}, Lcom/tv91/r/z;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/LinearLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ProgressBar;Landroidx/recyclerview/widget/RecyclerView;Lcom/tv91/r/y;Landroidx/constraintlayout/widget/Guideline;)V

    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    .line 11
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public bridge synthetic a()Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tv91/r/z;->c()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/r/z;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method
