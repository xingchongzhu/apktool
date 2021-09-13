.class final Lcom/tv91/u/e/i/t;
.super Lcom/tv91/features/shared/f;
.source "StatementView.java"

# interfaces
.implements Lcom/tv91/u/e/d;


# instance fields
.field private final e:Landroidx/fragment/app/n;

.field private final f:Lcom/tv91/r/r0;

.field private final g:Lcom/tv91/features/shared/g;


# direct methods
.method constructor <init>(Landroidx/fragment/app/n;Lcom/tv91/r/r0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lcom/tv91/features/shared/f;-><init>(Lb/r/a;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/u/e/i/t;->e:Landroidx/fragment/app/n;

    .line 3
    iput-object p2, p0, Lcom/tv91/u/e/i/t;->f:Lcom/tv91/r/r0;

    .line 4
    new-instance p1, Lcom/tv91/features/shared/g;

    iget-object p2, p2, Lcom/tv91/r/r0;->g:Lcom/tv91/r/y;

    invoke-direct {p1, p2}, Lcom/tv91/features/shared/g;-><init>(Lcom/tv91/r/y;)V

    iput-object p1, p0, Lcom/tv91/u/e/i/t;->g:Lcom/tv91/features/shared/g;

    const p2, 0x7f120192

    .line 5
    invoke-virtual {p1, p2}, Lcom/tv91/features/shared/g;->p(I)V

    return-void
.end method


# virtual methods
.method public T0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/model/PromotionReport;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/i/t;->f:Lcom/tv91/r/r0;

    iget-object v0, v0, Lcom/tv91/r/r0;->c:Landroidx/viewpager/widget/ViewPager;

    new-instance v1, Lcom/tv91/u/e/i/n;

    iget-object v2, p0, Lcom/tv91/u/e/i/t;->e:Landroidx/fragment/app/n;

    invoke-direct {v1, v2, p1}, Lcom/tv91/u/e/i/n;-><init>(Landroidx/fragment/app/n;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/a;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/u/e/i/t;->f:Lcom/tv91/r/r0;

    iget-object v0, p1, Lcom/tv91/r/r0;->e:Lcom/google/android/material/tabs/TabLayout;

    iget-object p1, p1, Lcom/tv91/r/r0;->c:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, p1}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/i/t;->f:Lcom/tv91/r/r0;

    iget-object v0, v0, Lcom/tv91/r/r0;->d:Landroid/widget/ProgressBar;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method

.method public b(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/i/t;->g:Lcom/tv91/features/shared/g;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/g;->i(Ljava/lang/Runnable;)V

    return-void
.end method

.method public g0(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/widget/e;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public h2(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tv91/u/e/i/t;->g:Lcom/tv91/features/shared/g;

    invoke-virtual {p1}, Lcom/tv91/features/shared/g;->b()V

    return-void
.end method
