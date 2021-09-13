.class public final Lcom/tv91/u/e/i/o;
.super Lcom/tv91/x/f;
.source "PromotionReportFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/e/i/o$a;
    }
.end annotation


# instance fields
.field private final d0:Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tv91/features/shared/ViewSupplier<",
            "Lcom/tv91/u/e/c;",
            ">;"
        }
    .end annotation
.end field

.field private e0:Lcom/tv91/x/h;

.field private f0:Lcom/tv91/u/e/h/b;


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f0d004d

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/x/f;-><init>(I)V

    .line 2
    new-instance v0, Lcom/tv91/features/shared/ViewSupplier;

    sget-object v1, Lcom/tv91/u/e/i/b;->a:Lcom/tv91/u/e/i/b;

    invoke-direct {v0, p0, v1}, Lcom/tv91/features/shared/ViewSupplier;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;)V

    iput-object v0, p0, Lcom/tv91/u/e/i/o;->d0:Lcom/tv91/features/shared/ViewSupplier;

    return-void
.end method

.method static synthetic m2(Landroid/view/View;)Lcom/tv91/u/e/c;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/e/i/s;

    invoke-static {p0}, Lcom/tv91/r/s;->b(Landroid/view/View;)Lcom/tv91/r/s;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/tv91/u/e/i/s;-><init>(Lcom/tv91/r/s;)V

    return-object v0
.end method

.method private synthetic n2()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/i/o;->e0:Lcom/tv91/x/h;

    new-instance v1, Lcom/tv91/u/e/k/o$a;

    iget-object v2, p0, Lcom/tv91/u/e/i/o;->f0:Lcom/tv91/u/e/h/b;

    iget v2, v2, Lcom/tv91/u/e/h/b;->a:I

    invoke-direct {v1, v2}, Lcom/tv91/u/e/k/o$a;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    return-void
.end method


# virtual methods
.method public J0(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->J0(Landroid/os/Bundle;)V

    .line 2
    invoke-static {p0}, Lcom/tv91/x/h;->b(Landroidx/fragment/app/Fragment;)Lcom/tv91/x/h;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/e/i/o;->e0:Lcom/tv91/x/h;

    .line 3
    invoke-virtual {p0}, Lcom/tv91/x/f;->l2()Lcom/tv91/x/c;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/e/i/o$a;

    iget-object p1, p1, Lcom/tv91/u/e/i/o$a;->b:Lcom/tv91/u/e/h/b;

    iput-object p1, p0, Lcom/tv91/u/e/i/o;->f0:Lcom/tv91/u/e/h/b;

    return-void
.end method

.method public g1()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->g1()V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/e/i/o;->d0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/c;

    new-instance v1, Lcom/tv91/u/e/i/c;

    invoke-direct {v1, p0}, Lcom/tv91/u/e/i/c;-><init>(Lcom/tv91/u/e/i/o;)V

    .line 3
    invoke-interface {v0, v1}, Lcom/tv91/u/e/c;->Q1(Ljava/lang/Runnable;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/e/i/o;->d0:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/e/c;

    iget-object v1, p0, Lcom/tv91/u/e/i/o;->f0:Lcom/tv91/u/e/h/b;

    invoke-interface {v0, v1}, Lcom/tv91/u/e/c;->w1(Lcom/tv91/u/e/h/b;)V

    return-void
.end method

.method public synthetic o2()V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/e/i/o;->n2()V

    return-void
.end method
