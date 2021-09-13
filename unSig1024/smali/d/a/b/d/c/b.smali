.class public final Ld/a/b/d/c/b;
.super Ljava/lang/Object;
.source "ApplicationContextModule_ProvideContextFactory.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public static a(Ld/a/b/d/c/a;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ld/a/b/d/c/a;->a()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Ld/b/c;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    return-object p0
.end method
