.class Lb/g/k/e0$h;
.super Lb/g/k/e0$g;
.source "WindowInsetsCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/g/k/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "h"
.end annotation


# instance fields
.field private n:Lb/g/d/b;


# direct methods
.method constructor <init>(Lb/g/k/e0;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lb/g/k/e0$g;-><init>(Lb/g/k/e0;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lb/g/k/e0$h;->n:Lb/g/d/b;

    return-void
.end method

.method constructor <init>(Lb/g/k/e0;Lb/g/k/e0$h;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lb/g/k/e0$g;-><init>(Lb/g/k/e0;Lb/g/k/e0$g;)V

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lb/g/k/e0$h;->n:Lb/g/d/b;

    .line 5
    iget-object p1, p2, Lb/g/k/e0$h;->n:Lb/g/d/b;

    iput-object p1, p0, Lb/g/k/e0$h;->n:Lb/g/d/b;

    return-void
.end method


# virtual methods
.method b()Lb/g/k/e0;
    .locals 1

    .line 1
    iget-object v0, p0, Lb/g/k/e0$g;->i:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeStableInsets()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, Lb/g/k/e0;->s(Landroid/view/WindowInsets;)Lb/g/k/e0;

    move-result-object v0

    return-object v0
.end method

.method c()Lb/g/k/e0;
    .locals 1

    .line 1
    iget-object v0, p0, Lb/g/k/e0$g;->i:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, Lb/g/k/e0;->s(Landroid/view/WindowInsets;)Lb/g/k/e0;

    move-result-object v0

    return-object v0
.end method

.method final h()Lb/g/d/b;
    .locals 4

    .line 1
    iget-object v0, p0, Lb/g/k/e0$h;->n:Lb/g/d/b;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lb/g/k/e0$g;->i:Landroid/view/WindowInsets;

    .line 3
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetLeft()I

    move-result v0

    iget-object v1, p0, Lb/g/k/e0$g;->i:Landroid/view/WindowInsets;

    .line 4
    invoke-virtual {v1}, Landroid/view/WindowInsets;->getStableInsetTop()I

    move-result v1

    iget-object v2, p0, Lb/g/k/e0$g;->i:Landroid/view/WindowInsets;

    .line 5
    invoke-virtual {v2}, Landroid/view/WindowInsets;->getStableInsetRight()I

    move-result v2

    iget-object v3, p0, Lb/g/k/e0$g;->i:Landroid/view/WindowInsets;

    .line 6
    invoke-virtual {v3}, Landroid/view/WindowInsets;->getStableInsetBottom()I

    move-result v3

    .line 7
    invoke-static {v0, v1, v2, v3}, Lb/g/d/b;->b(IIII)Lb/g/d/b;

    move-result-object v0

    iput-object v0, p0, Lb/g/k/e0$h;->n:Lb/g/d/b;

    .line 8
    :cond_0
    iget-object v0, p0, Lb/g/k/e0$h;->n:Lb/g/d/b;

    return-object v0
.end method

.method k()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lb/g/k/e0$g;->i:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->isConsumed()Z

    move-result v0

    return v0
.end method

.method public p(Lb/g/d/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb/g/k/e0$h;->n:Lb/g/d/b;

    return-void
.end method
