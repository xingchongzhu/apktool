.class public final Lcom/tv91/r/r;
.super Ljava/lang/Object;
.source "DialogWebviewBinding.java"

# interfaces
.implements Lb/r/a;


# instance fields
.field private final a:Landroid/widget/LinearLayout;

.field public final b:Landroid/widget/Button;

.field public final c:Lcom/tv91/r/y;

.field public final d:Landroid/webkit/WebView;


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Landroid/widget/Button;Lcom/tv91/r/y;Landroid/webkit/WebView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/tv91/r/r;->a:Landroid/widget/LinearLayout;

    .line 3
    iput-object p2, p0, Lcom/tv91/r/r;->b:Landroid/widget/Button;

    .line 4
    iput-object p3, p0, Lcom/tv91/r/r;->c:Lcom/tv91/r/y;

    .line 5
    iput-object p4, p0, Lcom/tv91/r/r;->d:Landroid/webkit/WebView;

    return-void
.end method

.method public static b(Landroid/view/View;)Lcom/tv91/r/r;
    .locals 4

    const v0, 0x7f0a00b3

    .line 1
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    if-eqz v1, :cond_1

    const v0, 0x7f0a00b8

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 3
    invoke-static {v2}, Lcom/tv91/r/y;->b(Landroid/view/View;)Lcom/tv91/r/y;

    move-result-object v0

    const v2, 0x7f0a00b9

    .line 4
    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/webkit/WebView;

    if-eqz v3, :cond_0

    .line 5
    new-instance v2, Lcom/tv91/r/r;

    check-cast p0, Landroid/widget/LinearLayout;

    invoke-direct {v2, p0, v1, v0, v3}, Lcom/tv91/r/r;-><init>(Landroid/widget/LinearLayout;Landroid/widget/Button;Lcom/tv91/r/y;Landroid/webkit/WebView;)V

    return-object v2

    :cond_0
    const v0, 0x7f0a00b9

    .line 6
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    .line 7
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/tv91/r/r;
    .locals 2

    const v0, 0x7f0d0040

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3
    :cond_0
    invoke-static {p0}, Lcom/tv91/r/r;->b(Landroid/view/View;)Lcom/tv91/r/r;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a()Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tv91/r/r;->c()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroid/widget/LinearLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/r/r;->a:Landroid/widget/LinearLayout;

    return-object v0
.end method
