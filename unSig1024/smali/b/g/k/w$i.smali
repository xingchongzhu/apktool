.class Lb/g/k/w$i;
.super Ljava/lang/Object;
.source "ViewCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/g/k/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "i"
.end annotation


# direct methods
.method public static a(Landroid/view/View;)Lb/g/k/e0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 2
    :cond_0
    invoke-static {v0}, Lb/g/k/e0;->s(Landroid/view/WindowInsets;)Lb/g/k/e0;

    move-result-object v0

    .line 3
    invoke-virtual {v0, v0}, Lb/g/k/e0;->p(Lb/g/k/e0;)V

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {v0, p0}, Lb/g/k/e0;->d(Landroid/view/View;)V

    return-object v0
.end method
