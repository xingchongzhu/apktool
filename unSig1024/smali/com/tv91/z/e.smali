.class public final synthetic Lcom/tv91/z/e;
.super Ljava/lang/Object;
.source "ImageLoader.java"


# direct methods
.method public static a(Lcom/tv91/z/f$a;Ljava/lang/String;Lcom/tv91/s/c;)V
    .locals 2
    .param p0, "_this"    # Lcom/tv91/z/f$a;

    .line 1
    invoke-virtual {p2}, Lcom/tv91/s/c;->c()Ljava/lang/Exception;

    move-result-object p2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "download image failed %s"

    invoke-static {p2, p1, v0}, Lh/a/a;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
