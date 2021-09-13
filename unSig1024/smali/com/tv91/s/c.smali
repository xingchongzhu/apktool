.class public final Lcom/tv91/s/c;
.super Ljava/lang/Object;
.source "ErrorBundle.java"


# instance fields
.field private final a:Ljava/lang/Exception;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/s/c;-><init>(Ljava/lang/Exception;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Exception;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/tv91/s/c;->a:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/s/c;->a:Ljava/lang/Exception;

    instance-of v1, v0, Lcom/tv91/s/a;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Lcom/tv91/s/a;

    iget-object v0, v0, Lcom/tv91/s/a;->a:Ljava/lang/String;

    return-object v0

    .line 3
    :cond_0
    instance-of v1, v0, Lcom/tv91/s/b;

    if-eqz v1, :cond_1

    .line 4
    check-cast v0, Lcom/tv91/s/b;

    iget-object v0, v0, Lcom/tv91/s/b;->a:Ljava/lang/String;

    return-object v0

    .line 5
    :cond_1
    instance-of v1, v0, Lcom/tv91/s/g;

    if-eqz v1, :cond_2

    .line 6
    check-cast v0, Lcom/tv91/s/g;

    iget v0, v0, Lcom/tv91/s/g;->a:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    const-string v0, "E_UNKNOWN"

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/s/c;->a:Ljava/lang/Exception;

    if-nez v0, :cond_0

    const-string v0, "Unknown error"

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public c()Ljava/lang/Exception;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/s/c;->a:Ljava/lang/Exception;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/s/c;->a:Ljava/lang/Exception;

    if-nez v0, :cond_0

    const-string v0, "Unknown error"

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public e()Lcom/tv91/s/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/s/c;->a:Ljava/lang/Exception;

    instance-of v1, v0, Lcom/tv91/s/e;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Lcom/tv91/s/e;

    iget-object v0, v0, Lcom/tv91/s/e;->a:Lcom/tv91/s/d;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public f()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/tv91/s/c;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NotLogin"

    .line 2
    invoke-static {v1, v0}, Lcom/tv91/utils/g;->b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "0000001"

    .line 3
    invoke-static {v1, v0}, Lcom/tv91/utils/g;->b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
