.class abstract Lcom/tv91/u/h/h/q;
.super Lcom/tv91/x/f;
.source "Hilt_HistoryFragment.java"

# interfaces
.implements Ld/a/c/b;


# instance fields
.field private d0:Landroid/content/ContextWrapper;

.field private volatile e0:Ldagger/hilt/android/internal/managers/f;

.field private final f0:Ljava/lang/Object;

.field private g0:Z


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tv91/x/f;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/tv91/u/h/h/q;->f0:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/tv91/u/h/h/q;->g0:Z

    return-void
.end method

.method private o2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/h/q;->d0:Landroid/content/ContextWrapper;

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->I()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p0}, Ldagger/hilt/android/internal/managers/f;->b(Landroid/content/Context;Landroidx/fragment/app/Fragment;)Landroid/content/ContextWrapper;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/u/h/h/q;->d0:Landroid/content/ContextWrapper;

    .line 3
    invoke-virtual {p0}, Lcom/tv91/u/h/h/q;->p2()V

    :cond_0
    return-void
.end method


# virtual methods
.method public F0(Landroid/app/Activity;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->F0(Landroid/app/Activity;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/h/h/q;->d0:Landroid/content/ContextWrapper;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {v0}, Ldagger/hilt/android/internal/managers/f;->d(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    new-array v0, v1, [Ljava/lang/Object;

    const-string v1, "onAttach called multiple times with different Context! Hilt Fragments should not be retained."

    invoke-static {p1, v1, v0}, Ld/a/c/c;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 3
    invoke-direct {p0}, Lcom/tv91/u/h/h/q;->o2()V

    return-void
.end method

.method public G0(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->G0(Landroid/content/Context;)V

    .line 2
    invoke-direct {p0}, Lcom/tv91/u/h/h/q;->o2()V

    return-void
.end method

.method public I()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/h/q;->d0:Landroid/content/ContextWrapper;

    return-object v0
.end method

.method public S0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->S0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object p1

    .line 2
    invoke-static {p1, p0}, Ldagger/hilt/android/internal/managers/f;->c(Landroid/view/LayoutInflater;Landroidx/fragment/app/Fragment;)Landroid/content/ContextWrapper;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    return-object p1
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tv91/u/h/h/q;->m2()Ldagger/hilt/android/internal/managers/f;

    move-result-object v0

    invoke-virtual {v0}, Ldagger/hilt/android/internal/managers/f;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final m2()Ldagger/hilt/android/internal/managers/f;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/h/q;->e0:Ldagger/hilt/android/internal/managers/f;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/tv91/u/h/h/q;->f0:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/tv91/u/h/h/q;->e0:Ldagger/hilt/android/internal/managers/f;

    if-nez v1, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/tv91/u/h/h/q;->n2()Ldagger/hilt/android/internal/managers/f;

    move-result-object v1

    iput-object v1, p0, Lcom/tv91/u/h/h/q;->e0:Ldagger/hilt/android/internal/managers/f;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tv91/u/h/h/q;->e0:Ldagger/hilt/android/internal/managers/f;

    return-object v0
.end method

.method protected n2()Ldagger/hilt/android/internal/managers/f;
    .locals 1

    .line 1
    new-instance v0, Ldagger/hilt/android/internal/managers/f;

    invoke-direct {v0, p0}, Ldagger/hilt/android/internal/managers/f;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method protected p2()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/tv91/u/h/h/q;->g0:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/tv91/u/h/h/q;->g0:Z

    .line 3
    invoke-virtual {p0}, Lcom/tv91/u/h/h/q;->g()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/h/h/s;

    invoke-static {p0}, Ld/a/c/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/u/h/h/r;

    invoke-interface {v0, v1}, Lcom/tv91/u/h/h/s;->t(Lcom/tv91/u/h/h/r;)V

    :cond_0
    return-void
.end method
