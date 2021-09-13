.class public final Lcom/tv91/features/authentication/AuthActivity;
.super Lcom/tv91/features/authentication/f;
.source "AuthActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/features/authentication/AuthActivity$a;
    }
.end annotation


# instance fields
.field private u:Lcom/tv91/x/h;

.field private v:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/features/authentication/f;-><init>()V

    return-void
.end method

.method private R()I
    .locals 3

    .line 1
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    iget v1, p0, Lcom/tv91/features/authentication/AuthActivity;->v:I

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setId(I)V

    .line 3
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->setContentView(Landroid/view/View;)V

    .line 5
    iget v0, p0, Lcom/tv91/features/authentication/AuthActivity;->v:I

    return v0
.end method


# virtual methods
.method public finish()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    const v0, 0x7f01001c

    const v1, 0x7f010020

    .line 2
    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/authentication/AuthActivity;->u:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tv91/features/authentication/AuthActivity;->u:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->a()V

    .line 3
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/e;->onCreate(Landroid/os/Bundle;)V

    if-nez p1, :cond_0

    .line 2
    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result p1

    goto :goto_0

    :cond_0
    const-string v0, "key-container-id"

    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    :goto_0
    iput p1, p0, Lcom/tv91/features/authentication/AuthActivity;->v:I

    .line 4
    invoke-direct {p0}, Lcom/tv91/features/authentication/AuthActivity;->R()I

    move-result p1

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/tv91/x/c;

    const/4 v1, 0x0

    new-instance v2, Lcom/tv91/features/authentication/n/i0$a;

    invoke-direct {v2}, Lcom/tv91/features/authentication/n/i0$a;-><init>()V

    aput-object v2, v0, v1

    invoke-static {p0, p1, v0}, Lcom/tv91/x/h;->f(Landroidx/fragment/app/e;I[Lcom/tv91/x/c;)Lcom/tv91/x/h;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/features/authentication/AuthActivity;->u:Lcom/tv91/x/h;

    const p1, 0x7f01001d

    const v0, 0x7f01001f

    .line 5
    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    iget v0, p0, Lcom/tv91/features/authentication/AuthActivity;->v:I

    const-string v1, "key-container-id"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method
