.class public Lc/a/a/b/r/b;
.super Landroid/widget/FrameLayout;
.source "CircularRevealFrameLayout.java"

# interfaces
.implements Lc/a/a/b/r/d;


# instance fields
.field private final a:Lc/a/a/b/r/c;


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    throw v0
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    throw v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingSuperCall"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/b/r/b;->a:Lc/a/a/b/r/c;

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->draw(Landroid/graphics/Canvas;)V

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 3
    throw p1
.end method

.method public getCircularRevealOverlayDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    const/4 v0, 0x0

    .line 1
    throw v0
.end method

.method public getCircularRevealScrimColor()I
    .locals 1

    const/4 v0, 0x0

    .line 1
    throw v0
.end method

.method public getRevealInfo()Lc/a/a/b/r/d$e;
    .locals 1

    const/4 v0, 0x0

    .line 1
    throw v0
.end method

.method public isOpaque()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/b/r/b;->a:Lc/a/a/b/r/c;

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0}, Landroid/widget/FrameLayout;->isOpaque()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    .line 3
    throw v0
.end method

.method public setCircularRevealOverlayDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    throw p1
.end method

.method public setCircularRevealScrimColor(I)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    throw p1
.end method

.method public setRevealInfo(Lc/a/a/b/r/d$e;)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    throw p1
.end method
