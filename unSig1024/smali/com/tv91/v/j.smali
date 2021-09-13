.class public final Lcom/tv91/v/j;
.super Ljava/lang/Object;
.source "ResourceModule_ProvideShakeAnimationFactory.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;)Landroid/view/animation/Animation;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/tv91/v/f;->d(Landroid/content/Context;)Landroid/view/animation/Animation;

    move-result-object p0

    invoke-static {p0}, Ld/b/c;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/animation/Animation;

    return-object p0
.end method
