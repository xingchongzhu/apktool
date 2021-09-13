.class public final Lcom/tv91/MainActivity;
.super Lcom/tv91/m;
.source "MainActivity.java"

# interfaces
.implements Lcom/tv91/utils/f$b;


# instance fields
.field u:Lcom/tv91/y/e;

.field private v:Lcom/tv91/x/h;

.field private w:I

.field private final x:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/tv91/m;-><init>()V

    const-string v0, "android.permission.READ_PHONE_STATE"

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    const-string v2, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 2
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/MainActivity;->x:[Ljava/lang/String;

    return-void
.end method

.method private Q()I
    .locals 3

    .line 1
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    iget v1, p0, Lcom/tv91/MainActivity;->w:I

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setId(I)V

    .line 3
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->setContentView(Landroid/view/View;)V

    .line 5
    iget v0, p0, Lcom/tv91/MainActivity;->w:I

    return v0
.end method

.method private R(Lcom/tv91/x/h;)V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    invoke-virtual {p1}, Lcom/tv91/x/h;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "initNavigationHistory %s"

    invoke-static {v1, v0}, Lh/a/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    invoke-virtual {p1}, Lcom/tv91/x/h;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "key-navigation-history"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1, v0}, Lcom/tv91/x/h;->i(Ljava/util/List;)V

    goto :goto_1

    .line 6
    :cond_1
    :goto_0
    new-instance v0, Lcom/tv91/u/g/a0$a;

    invoke-direct {v0}, Lcom/tv91/u/g/a0$a;-><init>()V

    invoke-virtual {p1, v0}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public static synthetic S(Lcom/tv91/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/MainActivity;->U()V

    return-void
.end method

.method public static synthetic T(Lcom/tv91/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/MainActivity;->V()V

    return-void
.end method

.method private U()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/MainActivity;->v:Lcom/tv91/x/h;

    invoke-direct {p0, v0}, Lcom/tv91/MainActivity;->R(Lcom/tv91/x/h;)V

    return-void
.end method

.method private V()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/MainActivity;->x:[Ljava/lang/String;

    invoke-static {p0, p0, v0}, Lcom/tv91/utils/f;->b(Landroid/app/Activity;Lcom/tv91/utils/f$b;[Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public i(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission",
            "HardwareIds"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    .line 2
    new-instance p1, Lcom/tv91/features/shared/widget/e$a;

    invoke-direct {p1, p0}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const p2, 0x7f12016d

    .line 3
    invoke-virtual {p1, p2}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const p2, 0x7f12016b

    .line 4
    invoke-virtual {p1, p2}, Lcom/tv91/features/shared/widget/e$a;->m(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const p2, 0x104000a

    new-instance p3, Lcom/tv91/c;

    invoke-direct {p3, p0}, Lcom/tv91/c;-><init>(Lcom/tv91/MainActivity;)V

    .line 5
    invoke-virtual {p1, p2, p3}, Lcom/tv91/features/shared/widget/e$a;->w(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const/high16 p2, 0x1040000

    new-instance p3, Lcom/tv91/b;

    invoke-direct {p3, p0}, Lcom/tv91/b;-><init>(Lcom/tv91/MainActivity;)V

    .line 6
    invoke-virtual {p1, p2, p3}, Lcom/tv91/features/shared/widget/e$a;->p(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void

    :cond_0
    const-string p2, "android.permission.READ_PHONE_STATE"

    .line 8
    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 9
    iget-object p1, p0, Lcom/tv91/MainActivity;->u:Lcom/tv91/y/e;

    invoke-interface {p1}, Lcom/tv91/y/e;->g()Ljava/lang/String;

    move-result-object p1

    const-string p2, "000000000000000"

    invoke-static {p1, p2}, Lcom/tv91/utils/g;->b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 10
    const-class p1, Landroid/telephony/TelephonyManager;

    invoke-static {p0, p1}, Landroidx/core/content/a;->g(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/telephony/TelephonyManager;

    if-eqz p1, :cond_1

    .line 11
    :try_start_0
    iget-object p2, p0, Lcom/tv91/MainActivity;->u:Lcom/tv91/y/e;

    invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/tv91/y/e;->f(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    :catch_0
    :cond_1
    iget-object p1, p0, Lcom/tv91/MainActivity;->v:Lcom/tv91/x/h;

    invoke-direct {p0, p1}, Lcom/tv91/MainActivity;->R(Lcom/tv91/x/h;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/MainActivity;->v:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tv91/MainActivity;->v:Lcom/tv91/x/h;

    invoke-virtual {v0}, Lcom/tv91/x/h;->a()V

    .line 3
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

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
    iput p1, p0, Lcom/tv91/MainActivity;->w:I

    .line 4
    invoke-direct {p0}, Lcom/tv91/MainActivity;->Q()I

    move-result p1

    const/4 v0, 0x0

    new-array v1, v0, [Lcom/tv91/x/c;

    invoke-static {p0, p1, v1}, Lcom/tv91/x/h;->f(Landroidx/fragment/app/e;I[Lcom/tv91/x/c;)Lcom/tv91/x/h;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/MainActivity;->v:Lcom/tv91/x/h;

    .line 5
    invoke-static {p0}, Lcom/tv91/utils/h;->g(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/tv91/MainActivity;->x:[Ljava/lang/String;

    invoke-static {p0, p0, p1}, Lcom/tv91/utils/f;->b(Landroid/app/Activity;Lcom/tv91/utils/f$b;[Ljava/lang/String;)V

    goto :goto_1

    .line 7
    :cond_1
    new-instance p1, Lcom/tv91/features/shared/widget/e$a;

    invoke-direct {p1, p0}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f12005c

    .line 8
    invoke-virtual {p1, v1}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const v1, 0x7f120011

    .line 9
    invoke-virtual {p1, v1}, Lcom/tv91/features/shared/widget/e$a;->m(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    const v1, 0x7f12004f

    .line 10
    invoke-virtual {p1, v1}, Lcom/tv91/features/shared/widget/e$a;->v(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 11
    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/widget/e$a;->j(Z)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 12
    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/widget/e$a;->k(Z)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    new-instance v0, Lcom/tv91/d;

    invoke-direct {v0, p0}, Lcom/tv91/d;-><init>(Lcom/tv91/MainActivity;)V

    .line 13
    invoke-virtual {p1, v0}, Lcom/tv91/features/shared/widget/e$a;->t(Ljava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p1

    .line 14
    invoke-virtual {p1}, Lcom/tv91/features/shared/widget/e$a;->z()V

    :goto_1
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    iget v0, p0, Lcom/tv91/MainActivity;->w:I

    const-string v1, "key-container-id"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method
