.class public final Lcom/tv91/features/shared/ViewSupplier;
.super Ljava/lang/Object;
.source "ViewSupplier.java"

# interfaces
.implements Lb/g/j/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/features/shared/ViewSupplier$ViewObserver;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V::",
        "Lcom/tv91/q/a/f;",
        ">",
        "Ljava/lang/Object;",
        "Lb/g/j/i<",
        "TV;>;"
    }
.end annotation


# instance fields
.field private final a:Landroidx/fragment/app/Fragment;

.field private final b:Lb/b/a/c/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/b/a/c/a<",
            "Landroid/view/View;",
            "TV;>;"
        }
    .end annotation
.end field

.field private c:Lcom/tv91/q/a/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field private d:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/Fragment;",
            "Lb/b/a/c/a<",
            "Landroid/view/View;",
            "TV;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/tv91/features/shared/ViewSupplier;->d:Landroid/os/Bundle;

    .line 3
    iput-object p1, p0, Lcom/tv91/features/shared/ViewSupplier;->a:Landroidx/fragment/app/Fragment;

    .line 4
    iput-object p2, p0, Lcom/tv91/features/shared/ViewSupplier;->b:Lb/b/a/c/a;

    .line 5
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/ViewSupplier;->h(Landroidx/fragment/app/Fragment;)V

    return-void
.end method

.method static synthetic b(Lcom/tv91/features/shared/ViewSupplier;)Landroidx/fragment/app/Fragment;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/features/shared/ViewSupplier;->a:Landroidx/fragment/app/Fragment;

    return-object p0
.end method

.method static synthetic c(Lcom/tv91/features/shared/ViewSupplier;)Landroid/os/Bundle;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/features/shared/ViewSupplier;->d:Landroid/os/Bundle;

    return-object p0
.end method

.method static synthetic d(Lcom/tv91/features/shared/ViewSupplier;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/features/shared/ViewSupplier;->d:Landroid/os/Bundle;

    return-object p1
.end method

.method static synthetic e(Lcom/tv91/features/shared/ViewSupplier;)Lcom/tv91/q/a/f;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/features/shared/ViewSupplier;->c:Lcom/tv91/q/a/f;

    return-object p0
.end method

.method static synthetic f(Lcom/tv91/features/shared/ViewSupplier;Lcom/tv91/q/a/f;)Lcom/tv91/q/a/f;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/features/shared/ViewSupplier;->c:Lcom/tv91/q/a/f;

    return-object p1
.end method

.method private h(Landroidx/fragment/app/Fragment;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->d()Landroidx/savedstate/SavedStateRegistry;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/shared/e;

    invoke-direct {v1, p0}, Lcom/tv91/features/shared/e;-><init>(Lcom/tv91/features/shared/ViewSupplier;)V

    const-string v2, "key-view-state"

    invoke-virtual {v0, v2, v1}, Landroidx/savedstate/SavedStateRegistry;->d(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$b;)V

    .line 2
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->b()Landroidx/lifecycle/f;

    move-result-object v0

    new-instance v1, Lcom/tv91/features/shared/ViewSupplier$1;

    invoke-direct {v1, p0, p1}, Lcom/tv91/features/shared/ViewSupplier$1;-><init>(Lcom/tv91/features/shared/ViewSupplier;Landroidx/fragment/app/Fragment;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/h;)V

    return-void
.end method

.method private synthetic i()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/ViewSupplier;->d:Landroid/os/Bundle;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    return-object v0
.end method

.method public g()Lcom/tv91/q/a/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/ViewSupplier;->c:Lcom/tv91/q/a/f;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/tv91/features/shared/ViewSupplier;->a:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->m0()Landroidx/lifecycle/i;

    move-result-object v0

    invoke-interface {v0}, Landroidx/lifecycle/i;->b()Landroidx/lifecycle/f;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Landroidx/lifecycle/f;->b()Landroidx/lifecycle/f$c;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/f$c;->b:Landroidx/lifecycle/f$c;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/f$c;->a(Landroidx/lifecycle/f$c;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/tv91/features/shared/ViewSupplier;->b:Lb/b/a/c/a;

    iget-object v1, p0, Lcom/tv91/features/shared/ViewSupplier;->a:Landroidx/fragment/app/Fragment;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->P1()Landroid/view/View;

    move-result-object v1

    invoke-interface {v0, v1}, Lb/b/a/c/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tv91/q/a/f;

    iput-object v0, p0, Lcom/tv91/features/shared/ViewSupplier;->c:Lcom/tv91/q/a/f;

    goto :goto_0

    .line 5
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot get view when Fragment view are destroyed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 6
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tv91/features/shared/ViewSupplier;->c:Lcom/tv91/q/a/f;

    return-object v0
.end method

.method public synthetic j()Landroid/os/Bundle;
    .locals 1

    invoke-direct {p0}, Lcom/tv91/features/shared/ViewSupplier;->i()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
