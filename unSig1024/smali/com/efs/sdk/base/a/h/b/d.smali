.class public final Lcom/efs/sdk/base/a/h/b/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcom/efs/sdk/base/a/h/b/b;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/efs/sdk/base/a/h/a/b<",
            "Lcom/efs/sdk/base/http/HttpResponse;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/efs/sdk/base/a/h/b/b;

    invoke-direct {v0}, Lcom/efs/sdk/base/a/h/b/b;-><init>()V

    iput-object v0, p0, Lcom/efs/sdk/base/a/h/b/d;->a:Lcom/efs/sdk/base/a/h/b/b;

    .line 3
    iput-object p1, v0, Lcom/efs/sdk/base/a/h/b/b;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lcom/efs/sdk/base/a/h/b/c;
    .locals 3

    .line 8
    new-instance v0, Lcom/efs/sdk/base/a/h/b/c;

    iget-object v1, p0, Lcom/efs/sdk/base/a/h/b/d;->a:Lcom/efs/sdk/base/a/h/b/b;

    invoke-direct {v0, v1}, Lcom/efs/sdk/base/a/h/b/c;-><init>(Lcom/efs/sdk/base/a/h/b/b;)V

    .line 9
    iget-object v1, p0, Lcom/efs/sdk/base/a/h/b/d;->b:Ljava/util/List;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 10
    iget-object v1, p0, Lcom/efs/sdk/base/a/h/b/d;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/efs/sdk/base/a/h/a/e;->a(Ljava/util/List;)V

    .line 11
    :cond_0
    invoke-static {}, Lcom/efs/sdk/base/http/HttpEnv;->getInstance()Lcom/efs/sdk/base/http/HttpEnv;

    move-result-object v1

    invoke-virtual {v1}, Lcom/efs/sdk/base/http/HttpEnv;->getHttpListenerList()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 12
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    .line 13
    invoke-virtual {v0, v1}, Lcom/efs/sdk/base/a/h/a/e;->a(Ljava/util/List;)V

    :cond_1
    return-object v0
.end method

.method public final a(Lcom/efs/sdk/base/http/AbsHttpListener;)Lcom/efs/sdk/base/a/h/b/d;
    .locals 2

    .line 5
    iget-object v0, p0, Lcom/efs/sdk/base/a/h/b/d;->b:Ljava/util/List;

    if-nez v0, :cond_0

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/efs/sdk/base/a/h/b/d;->b:Ljava/util/List;

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/efs/sdk/base/a/h/b/d;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Lcom/efs/sdk/base/a/h/b/d;
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/efs/sdk/base/a/h/b/d;->a:Lcom/efs/sdk/base/a/h/b/b;

    iget-object v1, v0, Lcom/efs/sdk/base/a/h/b/b;->f:Ljava/util/Map;

    if-nez v1, :cond_0

    .line 3
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    iput-object v1, v0, Lcom/efs/sdk/base/a/h/b/b;->f:Ljava/util/Map;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/efs/sdk/base/a/h/b/d;->a:Lcom/efs/sdk/base/a/h/b/b;

    iget-object v0, v0, Lcom/efs/sdk/base/a/h/b/b;->f:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final a(Ljava/util/Map;)Lcom/efs/sdk/base/a/h/b/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/efs/sdk/base/a/h/b/d;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/base/a/h/b/d;->a:Lcom/efs/sdk/base/a/h/b/b;

    iput-object p1, v0, Lcom/efs/sdk/base/a/h/b/b;->b:Ljava/util/Map;

    return-object p0
.end method
