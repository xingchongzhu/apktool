.class public abstract Lcom/tv91/v/a;
.super Ljava/lang/Object;
.source "AppModule.java"


# direct methods
.method public static a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static b()Le/w;
    .locals 2

    .line 1
    new-instance v0, Le/w$b;

    invoke-direct {v0}, Le/w$b;-><init>()V

    .line 2
    new-instance v1, Lcom/tv91/z/g/c;

    invoke-direct {v1}, Lcom/tv91/z/g/c;-><init>()V

    invoke-virtual {v0, v1}, Le/w$b;->a(Le/u;)Le/w$b;

    move-result-object v0

    invoke-virtual {v0}, Le/w$b;->b()Le/w;

    move-result-object v0

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".Pref"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method
