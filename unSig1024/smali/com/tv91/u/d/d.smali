.class public final Lcom/tv91/u/d/d;
.super Lcom/tv91/u/d/c;
.source "NewsFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/d/d$a;
    }
.end annotation


# instance fields
.field private A0:Ljava/lang/String;

.field private B0:Z

.field x0:Lcom/tv91/y/e;

.field y0:Ljava/lang/String;

.field private z0:Lcom/tv91/x/h;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/u/d/c;-><init>()V

    return-void
.end method

.method private E2()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/d/d;->x0:Lcom/tv91/y/e;

    invoke-interface {v0}, Lcom/tv91/y/e;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tv91/u/d/d;->y0:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/tv91/u/d/d;->x0:Lcom/tv91/y/e;

    invoke-interface {v0}, Lcom/tv91/y/e;->e()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method private F2()Lcom/tv91/u/d/d$a;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->N1()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "fragment-key-tag"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/d/d$a;

    return-object v0
.end method

.method private synthetic G2(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/d;->o2()V

    return-void
.end method

.method private synthetic I2(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tv91/u/d/d;->z0:Lcom/tv91/x/h;

    invoke-virtual {p1}, Lcom/tv91/x/h;->d()Z

    return-void
.end method


# virtual methods
.method public G0(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/tv91/u/d/c;->G0(Landroid/content/Context;)V

    .line 2
    invoke-static {p0}, Lcom/tv91/x/h;->b(Landroidx/fragment/app/Fragment;)Lcom/tv91/x/h;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/d/d;->z0:Lcom/tv91/x/h;

    return-void
.end method

.method public synthetic H2(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/d/d;->G2(Landroid/view/View;)V

    return-void
.end method

.method public J0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/d;->J0(Landroid/os/Bundle;)V

    .line 2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/tv91/u/d/d;->E2()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "news.html"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/d/d;->A0:Ljava/lang/String;

    .line 3
    invoke-direct {p0}, Lcom/tv91/u/d/d;->F2()Lcom/tv91/u/d/d$a;

    move-result-object p1

    invoke-static {p1}, Lcom/tv91/u/d/d$a;->r(Lcom/tv91/u/d/d$a;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/tv91/u/d/d;->B0:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p1}, Landroidx/fragment/app/d;->x2(Z)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroidx/lifecycle/f;

    move-result-object p1

    new-instance v0, Lcom/tv91/features/shared/UmengObserver;

    invoke-direct {p0}, Lcom/tv91/u/d/d;->F2()Lcom/tv91/u/d/d$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tv91/x/c;->m()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/tv91/features/shared/UmengObserver;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/h;)V

    const/4 p1, 0x1

    const v0, 0x7f130008

    .line 6
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/d;->y2(II)V

    :goto_0
    return-void
.end method

.method public synthetic J2(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/d/d;->I2(Landroid/view/View;)V

    return-void
.end method

.method public N0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const/4 p3, 0x0

    .line 1
    invoke-static {p1, p2, p3}, Lcom/tv91/r/r;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/tv91/r/r;

    move-result-object p1

    .line 2
    iget-object p2, p1, Lcom/tv91/r/r;->c:Lcom/tv91/r/y;

    .line 3
    iget-object v0, p1, Lcom/tv91/r/r;->d:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/tv91/u/d/d;->A0:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/tv91/features/shared/widget/f;->b(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 4
    iget-boolean v0, p0, Lcom/tv91/u/d/d;->B0:Z

    const v1, 0x7f120145

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {p2}, Lcom/tv91/r/y;->c()Landroidx/appcompat/widget/Toolbar;

    move-result-object p3

    invoke-virtual {p3, v1}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    .line 6
    invoke-virtual {p2}, Lcom/tv91/r/y;->c()Landroidx/appcompat/widget/Toolbar;

    move-result-object p2

    invoke-virtual {p1}, Lcom/tv91/r/r;->c()Landroid/widget/LinearLayout;

    move-result-object p3

    invoke-virtual {p3}, Landroid/widget/LinearLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/view/ViewGroup;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 7
    iget-object p2, p1, Lcom/tv91/r/r;->b:Landroid/widget/Button;

    new-instance p3, Lcom/tv91/u/d/a;

    invoke-direct {p3, p0}, Lcom/tv91/u/d/a;-><init>(Lcom/tv91/u/d/d;)V

    invoke-static {p3}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1}, Lcom/tv91/r/r;->c()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, p3, p3, p3, p3}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 9
    iget-object p3, p2, Lcom/tv91/r/y;->b:Landroid/widget/TextView;

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(I)V

    .line 10
    invoke-virtual {p2}, Lcom/tv91/r/y;->c()Landroidx/appcompat/widget/Toolbar;

    move-result-object p3

    const v0, 0x7f0800cc

    invoke-virtual {p3, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(I)V

    .line 11
    invoke-virtual {p2}, Lcom/tv91/r/y;->c()Landroidx/appcompat/widget/Toolbar;

    move-result-object p3

    const v0, 0x7f1201e8

    invoke-virtual {p3, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(I)V

    .line 12
    invoke-virtual {p2}, Lcom/tv91/r/y;->c()Landroidx/appcompat/widget/Toolbar;

    move-result-object p2

    new-instance p3, Lcom/tv91/u/d/b;

    invoke-direct {p3, p0}, Lcom/tv91/u/d/b;-><init>(Lcom/tv91/u/d/d;)V

    .line 13
    invoke-static {p3}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    iget-object p2, p1, Lcom/tv91/r/r;->b:Landroid/widget/Button;

    const/16 p3, 0x8

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setVisibility(I)V

    .line 15
    :goto_0
    invoke-virtual {p1}, Lcom/tv91/r/r;->c()Landroid/widget/LinearLayout;

    move-result-object p1

    return-object p1
.end method

.method public g1()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/d;->g1()V

    .line 2
    iget-boolean v0, p0, Lcom/tv91/u/d/d;->B0:Z

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/d;->q2()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    :cond_0
    return-void
.end method

.method public s2(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/d;->s2(Landroid/os/Bundle;)Landroid/app/Dialog;

    move-result-object p1

    .line 2
    iget-boolean v0, p0, Lcom/tv91/u/d/d;->B0:Z

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    :cond_0
    return-object p1
.end method
