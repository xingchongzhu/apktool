.class final Landroidx/lifecycle/SavedStateHandleController;
.super Ljava/lang/Object;
.source "SavedStateHandleController.java"

# interfaces
.implements Landroidx/lifecycle/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/SavedStateHandleController$a;
    }
.end annotation


# instance fields
.field private a:Z


# direct methods
.method static f(Landroidx/lifecycle/r;Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/f;)V
    .locals 1

    const-string v0, "androidx.lifecycle.savedstate.vm.tag"

    .line 1
    invoke-virtual {p0, v0}, Landroidx/lifecycle/r;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/SavedStateHandleController;

    if-eqz p0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/lifecycle/SavedStateHandleController;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/SavedStateHandleController;->g(Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/f;)V

    .line 4
    invoke-static {p1, p2}, Landroidx/lifecycle/SavedStateHandleController;->i(Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/f;)V

    :cond_0
    return-void
.end method

.method private static i(Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/f;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroidx/lifecycle/f;->b()Landroidx/lifecycle/f$c;

    move-result-object v0

    .line 2
    sget-object v1, Landroidx/lifecycle/f$c;->b:Landroidx/lifecycle/f$c;

    if-eq v0, v1, :cond_1

    sget-object v1, Landroidx/lifecycle/f$c;->d:Landroidx/lifecycle/f$c;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/f$c;->a(Landroidx/lifecycle/f$c;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Landroidx/lifecycle/SavedStateHandleController$1;

    invoke-direct {v0, p1, p0}, Landroidx/lifecycle/SavedStateHandleController$1;-><init>(Landroidx/lifecycle/f;Landroidx/savedstate/SavedStateRegistry;)V

    invoke-virtual {p1, v0}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/h;)V

    goto :goto_1

    .line 4
    :cond_1
    :goto_0
    const-class p1, Landroidx/lifecycle/SavedStateHandleController$a;

    invoke-virtual {p0, p1}, Landroidx/savedstate/SavedStateRegistry;->e(Ljava/lang/Class;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public c(Landroidx/lifecycle/i;Landroidx/lifecycle/f$b;)V
    .locals 1

    .line 1
    sget-object v0, Landroidx/lifecycle/f$b;->ON_DESTROY:Landroidx/lifecycle/f$b;

    if-ne p2, v0, :cond_0

    const/4 p2, 0x0

    .line 2
    iput-boolean p2, p0, Landroidx/lifecycle/SavedStateHandleController;->a:Z

    .line 3
    invoke-interface {p1}, Landroidx/lifecycle/i;->b()Landroidx/lifecycle/f;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/f;->c(Landroidx/lifecycle/h;)V

    :cond_0
    return-void
.end method

.method g(Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/f;)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Landroidx/lifecycle/SavedStateHandleController;->a:Z

    if-eqz p1, :cond_0

    .line 2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Already attached to lifecycleOwner"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Landroidx/lifecycle/SavedStateHandleController;->a:Z

    .line 4
    invoke-virtual {p2, p0}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/h;)V

    const/4 p1, 0x0

    .line 5
    throw p1
.end method

.method h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/lifecycle/SavedStateHandleController;->a:Z

    return v0
.end method
