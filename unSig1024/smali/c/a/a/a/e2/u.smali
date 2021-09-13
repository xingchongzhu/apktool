.class public final synthetic Lc/a/a/a/e2/u;
.super Ljava/lang/Object;
.source "DrmSession.java"


# direct methods
.method public static a(Lc/a/a/a/e2/v;Lc/a/a/a/e2/v;)V
    .locals 1

    if-ne p0, p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 1
    invoke-interface {p1, v0}, Lc/a/a/a/e2/v;->b(Lc/a/a/a/e2/w$a;)V

    :cond_1
    if-eqz p0, :cond_2

    .line 2
    invoke-interface {p0, v0}, Lc/a/a/a/e2/v;->d(Lc/a/a/a/e2/w$a;)V

    :cond_2
    return-void
.end method
