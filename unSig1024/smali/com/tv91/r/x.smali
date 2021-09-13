.class public final Lcom/tv91/r/x;
.super Ljava/lang/Object;
.source "LayoutToolbarImageTitleBinding.java"

# interfaces
.implements Lb/r/a;


# instance fields
.field private final a:Landroidx/appcompat/widget/Toolbar;

.field public final b:Landroid/widget/ImageView;


# direct methods
.method private constructor <init>(Landroidx/appcompat/widget/Toolbar;Landroid/widget/ImageView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/tv91/r/x;->a:Landroidx/appcompat/widget/Toolbar;

    .line 3
    iput-object p2, p0, Lcom/tv91/r/x;->b:Landroid/widget/ImageView;

    return-void
.end method

.method public static b(Landroid/view/View;)Lcom/tv91/r/x;
    .locals 2

    const v0, 0x7f0a014d

    .line 1
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    if-eqz v1, :cond_0

    .line 2
    new-instance v0, Lcom/tv91/r/x;

    check-cast p0, Landroidx/appcompat/widget/Toolbar;

    invoke-direct {v0, p0, v1}, Lcom/tv91/r/x;-><init>(Landroidx/appcompat/widget/Toolbar;Landroid/widget/ImageView;)V

    return-object v0

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    .line 4
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
    invoke-virtual {p0}, Lcom/tv91/r/x;->c()Landroidx/appcompat/widget/Toolbar;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroidx/appcompat/widget/Toolbar;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/r/x;->a:Landroidx/appcompat/widget/Toolbar;

    return-object v0
.end method
