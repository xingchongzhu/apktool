.class public final synthetic Lcom/tv91/y/g;
.super Ljava/lang/Object;
.source "UserRepository.java"


# direct methods
.method public static a(Lcom/tv91/y/h;)V
    .locals 1
    .param p0, "_this"    # Lcom/tv91/y/h;

    const/4 v0, 0x0

    .line 1
    invoke-interface {p0, v0}, Lcom/tv91/y/h;->j(Ljava/lang/String;)V

    return-void
.end method

.method public static b(Lcom/tv91/y/h;)V
    .locals 1
    .param p0, "_this"    # Lcom/tv91/y/h;

    const/4 v0, 0x0

    .line 1
    invoke-interface {p0, v0}, Lcom/tv91/y/h;->h(Lcom/tv91/model/User;)V

    return-void
.end method

.method public static c(Lcom/tv91/y/h;)Ljava/lang/String;
    .locals 2
    .param p0, "_this"    # Lcom/tv91/y/h;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/tv91/s/a;
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lcom/tv91/y/h;->e()Lcom/tv91/model/User;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, v0, Lcom/tv91/model/User;->id:Ljava/lang/String;

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Lcom/tv91/s/a;

    const-string v1, "NotLogin"

    invoke-direct {v0, v1}, Lcom/tv91/s/a;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static d(Lcom/tv91/y/h;)Ljava/lang/String;
    .locals 2
    .param p0, "_this"    # Lcom/tv91/y/h;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/tv91/s/a;
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lcom/tv91/y/h;->e()Lcom/tv91/model/User;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, v0, Lcom/tv91/model/User;->token:Ljava/lang/String;

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Lcom/tv91/s/a;

    const-string v1, "NotLogin"

    invoke-direct {v0, v1}, Lcom/tv91/s/a;-><init>(Ljava/lang/String;)V

    throw v0
.end method
