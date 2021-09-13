.class public final Lcom/tv91/r/t;
.super Ljava/lang/Object;
.source "LayoutHighlightBinding.java"

# interfaces
.implements Lb/r/a;


# instance fields
.field private final a:Landroid/widget/ScrollView;

.field public final b:Landroid/widget/LinearLayout;

.field public final c:Landroid/widget/GridLayout;

.field public final d:Landroid/widget/LinearLayout;

.field public final e:Landroid/widget/ViewFlipper;

.field public final f:Landroid/widget/ScrollView;

.field public final g:Landroidx/recyclerview/widget/RecyclerView;

.field public final h:Landroidx/recyclerview/widget/RecyclerView;

.field public final i:Landroidx/recyclerview/widget/RecyclerView;

.field public final j:Landroid/widget/TextView;

.field public final k:Landroid/widget/TextView;

.field public final l:Landroid/widget/TextView;

.field public final m:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/GridLayout;Landroid/widget/LinearLayout;Landroid/widget/ViewFlipper;Landroid/widget/ScrollView;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/tv91/r/t;->a:Landroid/widget/ScrollView;

    .line 3
    iput-object p2, p0, Lcom/tv91/r/t;->b:Landroid/widget/LinearLayout;

    .line 4
    iput-object p3, p0, Lcom/tv91/r/t;->c:Landroid/widget/GridLayout;

    .line 5
    iput-object p4, p0, Lcom/tv91/r/t;->d:Landroid/widget/LinearLayout;

    .line 6
    iput-object p5, p0, Lcom/tv91/r/t;->e:Landroid/widget/ViewFlipper;

    .line 7
    iput-object p6, p0, Lcom/tv91/r/t;->f:Landroid/widget/ScrollView;

    .line 8
    iput-object p7, p0, Lcom/tv91/r/t;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    iput-object p8, p0, Lcom/tv91/r/t;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    iput-object p9, p0, Lcom/tv91/r/t;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 11
    iput-object p10, p0, Lcom/tv91/r/t;->j:Landroid/widget/TextView;

    .line 12
    iput-object p11, p0, Lcom/tv91/r/t;->k:Landroid/widget/TextView;

    .line 13
    iput-object p12, p0, Lcom/tv91/r/t;->l:Landroid/widget/TextView;

    .line 14
    iput-object p13, p0, Lcom/tv91/r/t;->m:Landroid/widget/TextView;

    return-void
.end method

.method public static b(Landroid/view/View;)Lcom/tv91/r/t;
    .locals 17

    move-object/from16 v0, p0

    const v1, 0x7f0a0097

    .line 1
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroid/widget/LinearLayout;

    if-eqz v5, :cond_0

    const v1, 0x7f0a0099

    .line 2
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroid/widget/GridLayout;

    if-eqz v6, :cond_0

    const v1, 0x7f0a009a

    .line 3
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Landroid/widget/LinearLayout;

    if-eqz v7, :cond_0

    const v1, 0x7f0a0113

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroid/widget/ViewFlipper;

    if-eqz v8, :cond_0

    .line 5
    move-object v9, v0

    check-cast v9, Landroid/widget/ScrollView;

    const v1, 0x7f0a020a

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v10, :cond_0

    const v1, 0x7f0a020b

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v11, :cond_0

    const v1, 0x7f0a020c

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v12, :cond_0

    const v1, 0x7f0a02d4

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Landroid/widget/TextView;

    if-eqz v13, :cond_0

    const v1, 0x7f0a02d5

    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroid/widget/TextView;

    if-eqz v14, :cond_0

    const v1, 0x7f0a02d6

    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Landroid/widget/TextView;

    if-eqz v15, :cond_0

    const v1, 0x7f0a02d7

    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Landroid/widget/TextView;

    if-eqz v16, :cond_0

    .line 13
    new-instance v0, Lcom/tv91/r/t;

    move-object v3, v0

    move-object v4, v9

    invoke-direct/range {v3 .. v16}, Lcom/tv91/r/t;-><init>(Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/GridLayout;Landroid/widget/LinearLayout;Landroid/widget/ViewFlipper;Landroid/widget/ScrollView;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    return-object v0

    .line 14
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    .line 15
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Missing required view with ID: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public bridge synthetic a()Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tv91/r/t;->c()Landroid/widget/ScrollView;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroid/widget/ScrollView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/r/t;->a:Landroid/widget/ScrollView;

    return-object v0
.end method
