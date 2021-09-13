.class Lcom/tv91/features/shared/ViewSupplier$1;
.super Ljava/lang/Object;
.source "ViewSupplier.java"

# interfaces
.implements Landroidx/lifecycle/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tv91/features/shared/ViewSupplier;->h(Landroidx/fragment/app/Fragment;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final a:Landroidx/lifecycle/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/o<",
            "Landroidx/lifecycle/i;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic b:Landroidx/fragment/app/Fragment;

.field final synthetic c:Lcom/tv91/features/shared/ViewSupplier;


# direct methods
.method constructor <init>(Lcom/tv91/features/shared/ViewSupplier;Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/features/shared/ViewSupplier$1;->c:Lcom/tv91/features/shared/ViewSupplier;

    iput-object p2, p0, Lcom/tv91/features/shared/ViewSupplier$1;->b:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Lcom/tv91/features/shared/d;

    invoke-direct {p1, p0}, Lcom/tv91/features/shared/d;-><init>(Lcom/tv91/features/shared/ViewSupplier$1;)V

    iput-object p1, p0, Lcom/tv91/features/shared/ViewSupplier$1;->a:Landroidx/lifecycle/o;

    return-void
.end method

.method private synthetic f(Landroidx/lifecycle/i;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    invoke-interface {p1}, Landroidx/lifecycle/i;->b()Landroidx/lifecycle/f;

    move-result-object p1

    new-instance v0, Lcom/tv91/features/shared/ViewSupplier$ViewObserver;

    iget-object v1, p0, Lcom/tv91/features/shared/ViewSupplier$1;->c:Lcom/tv91/features/shared/ViewSupplier;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/tv91/features/shared/ViewSupplier$ViewObserver;-><init>(Lcom/tv91/features/shared/ViewSupplier;Lcom/tv91/features/shared/ViewSupplier$1;)V

    invoke-virtual {p1, v0}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/h;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroidx/lifecycle/i;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tv91/features/shared/ViewSupplier$1;->b:Landroidx/fragment/app/Fragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->n0()Landroidx/lifecycle/LiveData;

    move-result-object p1

    iget-object v0, p0, Lcom/tv91/features/shared/ViewSupplier$1;->a:Landroidx/lifecycle/o;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/LiveData;->i(Landroidx/lifecycle/o;)V

    return-void
.end method

.method public b(Landroidx/lifecycle/i;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tv91/features/shared/ViewSupplier$1;->b:Landroidx/fragment/app/Fragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->n0()Landroidx/lifecycle/LiveData;

    move-result-object p1

    iget-object v0, p0, Lcom/tv91/features/shared/ViewSupplier$1;->a:Landroidx/lifecycle/o;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/LiveData;->f(Landroidx/lifecycle/o;)V

    return-void
.end method

.method public synthetic d(Landroidx/lifecycle/i;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/b;->d(Landroidx/lifecycle/c;Landroidx/lifecycle/i;)V

    return-void
.end method

.method public synthetic e(Landroidx/lifecycle/i;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/b;->e(Landroidx/lifecycle/c;Landroidx/lifecycle/i;)V

    return-void
.end method

.method public synthetic g(Landroidx/lifecycle/i;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/features/shared/ViewSupplier$1;->f(Landroidx/lifecycle/i;)V

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
