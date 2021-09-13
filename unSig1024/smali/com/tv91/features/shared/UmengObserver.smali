.class public final Lcom/tv91/features/shared/UmengObserver;
.super Ljava/lang/Object;
.source "UmengObserver.java"

# interfaces
.implements Landroidx/lifecycle/h;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/tv91/features/shared/UmengObserver;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onPause(Landroidx/lifecycle/i;)V
    .locals 1
    .annotation runtime Landroidx/lifecycle/p;
        value = .enum Landroidx/lifecycle/f$b;->ON_PAUSE:Landroidx/lifecycle/f$b;
    .end annotation

    .line 1
    instance-of v0, p1, Landroidx/activity/ComponentActivity;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Landroidx/activity/ComponentActivity;

    invoke-static {p1}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V

    goto :goto_0

    .line 3
    :cond_0
    instance-of p1, p1, Landroidx/fragment/app/Fragment;

    if-eqz p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/tv91/features/shared/UmengObserver;->a:Ljava/lang/String;

    invoke-static {p1}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onResume(Landroidx/lifecycle/i;)V
    .locals 3
    .annotation runtime Landroidx/lifecycle/p;
        value = .enum Landroidx/lifecycle/f$b;->ON_RESUME:Landroidx/lifecycle/f$b;
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    iget-object v1, p0, Lcom/tv91/features/shared/UmengObserver;->a:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "UMENG analysis for %s in %s"

    invoke-static {v1, v0}, Lh/a/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    instance-of v0, p1, Landroidx/activity/ComponentActivity;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Landroidx/activity/ComponentActivity;

    invoke-static {p1}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V

    goto :goto_0

    .line 4
    :cond_0
    instance-of p1, p1, Landroidx/fragment/app/Fragment;

    if-eqz p1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/tv91/features/shared/UmengObserver;->a:Ljava/lang/String;

    invoke-static {p1}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
