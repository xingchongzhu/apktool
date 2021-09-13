.class public final synthetic Lcom/tv91/z/d;
.super Ljava/lang/Object;
.source "ImageLoader.java"


# direct methods
.method public static a(Lcom/tv91/z/f;I)Lcom/tv91/z/f;
    .locals 1
    .param p0, "_this"    # Lcom/tv91/z/f;

    .line 1
    invoke-interface {p0}, Lcom/tv91/z/f;->a()Lcom/tv91/z/f$c;

    move-result-object v0

    iput p1, v0, Lcom/tv91/z/f$c;->h:I

    return-object p0
.end method

.method public static b(Lcom/tv91/z/f;Ljava/lang/String;)Lcom/tv91/z/f;
    .locals 1
    .param p0, "_this"    # Lcom/tv91/z/f;

    .line 1
    invoke-interface {p0}, Lcom/tv91/z/f;->a()Lcom/tv91/z/f$c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/tv91/z/f$c;->c(Ljava/lang/String;)V

    return-object p0
.end method

.method public static c(Lcom/tv91/z/f;I)Lcom/tv91/z/f;
    .locals 1
    .param p0, "_this"    # Lcom/tv91/z/f;

    .line 1
    invoke-interface {p0}, Lcom/tv91/z/f;->a()Lcom/tv91/z/f$c;

    move-result-object v0

    iput p1, v0, Lcom/tv91/z/f$c;->g:I

    return-object p0
.end method

.method public static d(Lcom/tv91/z/f;II)Lcom/tv91/z/f;
    .locals 1
    .param p0, "_this"    # Lcom/tv91/z/f;

    .line 1
    invoke-interface {p0}, Lcom/tv91/z/f;->a()Lcom/tv91/z/f$c;

    move-result-object v0

    iput p1, v0, Lcom/tv91/z/f$c;->c:I

    .line 2
    invoke-interface {p0}, Lcom/tv91/z/f;->a()Lcom/tv91/z/f$c;

    move-result-object p1

    iput p2, p1, Lcom/tv91/z/f$c;->d:I

    return-object p0
.end method

.method public static e(Landroid/content/Context;)Lcom/tv91/z/f;
    .locals 1

    .line 1
    const-class v0, Lcom/tv91/z/f$b;

    invoke-static {p0, v0}, Ld/a/b/b;->a(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/tv91/z/f$b;

    invoke-interface {p0}, Lcom/tv91/z/f$b;->d()Lcom/tv91/z/f;

    move-result-object p0

    return-object p0
.end method
