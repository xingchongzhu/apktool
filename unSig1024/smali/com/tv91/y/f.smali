.class public final Lcom/tv91/y/f;
.super Ljava/lang/Object;
.source "UserPreference.java"

# interfaces
.implements Lcom/tv91/y/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/y/f$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/SharedPreferences;

.field private b:Lcom/tv91/model/User;


# direct methods
.method public constructor <init>(Landroid/content/SharedPreferences;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/tv91/y/f;->a:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/y/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "pref_account"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()V
    .locals 0

    invoke-static {p0}, Lcom/tv91/y/g;->a(Lcom/tv91/y/h;)V

    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/y/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "pref_password"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public synthetic d()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/tv91/y/g;->c(Lcom/tv91/y/h;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()Lcom/tv91/model/User;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/y/f;->b:Lcom/tv91/model/User;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tv91/y/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "pref_user"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    :try_start_0
    const-class v1, Lcom/tv91/model/User;

    invoke-static {v0, v1}, Lcom/tv91/utils/Jsons;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/model/User;

    if-eqz v1, :cond_2

    .line 4
    iget-object v2, v1, Lcom/tv91/model/User;->id:Ljava/lang/String;

    invoke-static {v2}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, v1, Lcom/tv91/model/User;->token:Ljava/lang/String;

    invoke-static {v2}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1}, Ljava/io/IOException;-><init>()V

    throw v1

    .line 6
    :cond_2
    :goto_0
    iput-object v1, p0, Lcom/tv91/y/f;->b:Lcom/tv91/model/User;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 7
    :catch_0
    :try_start_1
    const-class v1, Lcom/tv91/y/f$a;

    invoke-static {v0, v1}, Lcom/tv91/utils/Jsons;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tv91/y/f$a;

    .line 8
    invoke-virtual {v0}, Lcom/tv91/y/f$a;->a()Lcom/tv91/model/User;

    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, Lcom/tv91/y/f;->h(Lcom/tv91/model/User;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :catch_1
    move-exception v0

    .line 10
    invoke-static {v0}, Lh/a/a;->c(Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lcom/tv91/y/f;->b:Lcom/tv91/model/User;

    return-object v0
.end method

.method public f(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "pref_account"

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/tv91/y/f;->a:Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tv91/y/f;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :goto_0
    return-void
.end method

.method public synthetic g()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/tv91/y/g;->d(Lcom/tv91/y/h;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h(Lcom/tv91/model/User;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/tv91/y/f;->b:Lcom/tv91/model/User;

    const-string v0, "pref_user"

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/tv91/y/f;->a:Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void

    .line 3
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/tv91/y/f;->a:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-static {p1}, Lcom/tv91/utils/Jsons;->e(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Lcom/fasterxml/jackson/core/JsonProcessingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/tv91/y/f;->b:Lcom/tv91/model/User;

    .line 5
    iget-object p1, p0, Lcom/tv91/y/f;->a:Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :goto_0
    return-void
.end method

.method public synthetic i()V
    .locals 0

    invoke-static {p0}, Lcom/tv91/y/g;->b(Lcom/tv91/y/h;)V

    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "pref_password"

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/tv91/y/f;->a:Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tv91/y/f;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :goto_0
    return-void
.end method
