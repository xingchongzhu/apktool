.class Lcom/tv91/features/shared/ViewSupplier$ViewObserver;
.super Ljava/lang/Object;
.source "ViewSupplier.java"

# interfaces
.implements Landroidx/lifecycle/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/features/shared/ViewSupplier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ViewObserver"
.end annotation


# instance fields
.field final synthetic a:Lcom/tv91/features/shared/ViewSupplier;


# direct methods
.method private constructor <init>(Lcom/tv91/features/shared/ViewSupplier;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/features/shared/ViewSupplier$ViewObserver;->a:Lcom/tv91/features/shared/ViewSupplier;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/features/shared/ViewSupplier;Lcom/tv91/features/shared/ViewSupplier$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/ViewSupplier$ViewObserver;-><init>(Lcom/tv91/features/shared/ViewSupplier;)V

    return-void
.end method


# virtual methods
.method public synthetic a(Landroidx/lifecycle/i;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/b;->a(Landroidx/lifecycle/c;Landroidx/lifecycle/i;)V

    return-void
.end method

.method public b(Landroidx/lifecycle/i;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tv91/features/shared/ViewSupplier$ViewObserver;->a:Lcom/tv91/features/shared/ViewSupplier;

    invoke-static {p1}, Lcom/tv91/features/shared/ViewSupplier;->b(Lcom/tv91/features/shared/ViewSupplier;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->d()Landroidx/savedstate/SavedStateRegistry;

    move-result-object p1

    const-string v0, "key-view-state"

    invoke-virtual {p1, v0}, Landroidx/savedstate/SavedStateRegistry;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tv91/features/shared/ViewSupplier$ViewObserver;->a:Lcom/tv91/features/shared/ViewSupplier;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/ViewSupplier;->d(Lcom/tv91/features/shared/ViewSupplier;Landroid/os/Bundle;)Landroid/os/Bundle;

    :cond_0
    return-void
.end method

.method public d(Landroidx/lifecycle/i;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tv91/features/shared/ViewSupplier$ViewObserver;->a:Lcom/tv91/features/shared/ViewSupplier;

    invoke-static {p1}, Lcom/tv91/features/shared/ViewSupplier;->e(Lcom/tv91/features/shared/ViewSupplier;)Lcom/tv91/q/a/f;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tv91/features/shared/ViewSupplier$ViewObserver;->a:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {p1}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/tv91/features/shared/ViewSupplier$ViewObserver;->a:Lcom/tv91/features/shared/ViewSupplier;

    invoke-static {p1}, Lcom/tv91/features/shared/ViewSupplier;->e(Lcom/tv91/features/shared/ViewSupplier;)Lcom/tv91/q/a/f;

    move-result-object p1

    .line 2
    :goto_0
    iget-object v0, p0, Lcom/tv91/features/shared/ViewSupplier$ViewObserver;->a:Lcom/tv91/features/shared/ViewSupplier;

    invoke-static {v0}, Lcom/tv91/features/shared/ViewSupplier;->c(Lcom/tv91/features/shared/ViewSupplier;)Landroid/os/Bundle;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/tv91/q/a/f;->J(Landroid/os/Bundle;)V

    return-void
.end method

.method public e(Landroidx/lifecycle/i;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tv91/features/shared/ViewSupplier$ViewObserver;->a:Lcom/tv91/features/shared/ViewSupplier;

    invoke-static {p1}, Lcom/tv91/features/shared/ViewSupplier;->e(Lcom/tv91/features/shared/ViewSupplier;)Lcom/tv91/q/a/f;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/tv91/features/shared/ViewSupplier$ViewObserver;->a:Lcom/tv91/features/shared/ViewSupplier;

    invoke-static {p1}, Lcom/tv91/features/shared/ViewSupplier;->e(Lcom/tv91/features/shared/ViewSupplier;)Lcom/tv91/q/a/f;

    move-result-object p1

    iget-object v0, p0, Lcom/tv91/features/shared/ViewSupplier$ViewObserver;->a:Lcom/tv91/features/shared/ViewSupplier;

    invoke-static {v0}, Lcom/tv91/features/shared/ViewSupplier;->c(Lcom/tv91/features/shared/ViewSupplier;)Landroid/os/Bundle;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/tv91/q/a/f;->h2(Landroid/os/Bundle;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/features/shared/ViewSupplier$ViewObserver;->a:Lcom/tv91/features/shared/ViewSupplier;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/tv91/features/shared/ViewSupplier;->f(Lcom/tv91/features/shared/ViewSupplier;Lcom/tv91/q/a/f;)Lcom/tv91/q/a/f;

    :cond_0
    return-void
.end method

.method public synthetic onPause(Landroidx/lifecycle/i;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/b;->b(Landroidx/lifecycle/c;Landroidx/lifecycle/i;)V

    return-void
.end method

.method public synthetic onResume(Landroidx/lifecycle/i;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/b;->c(Landroidx/lifecycle/c;Landroidx/lifecycle/i;)V

    return-void
.end method
