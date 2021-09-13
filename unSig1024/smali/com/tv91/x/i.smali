.class public final Lcom/tv91/x/i;
.super Ljava/lang/Object;
.source "NavigatorProvider.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/x/i$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/tv91/x/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/tv91/x/i;->a:Ljava/util/Map;

    return-void
.end method

.method public static c(Landroid/content/Context;)Lcom/tv91/x/i;
    .locals 1

    .line 1
    const-class v0, Lcom/tv91/x/i$a;

    invoke-static {p0, v0}, Ld/a/b/b;->a(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/tv91/x/i$a;

    invoke-interface {p0}, Lcom/tv91/x/i$a;->c()Lcom/tv91/x/i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Landroidx/fragment/app/e;)Lcom/tv91/x/h;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/tv91/x/i;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/x/h;

    const-string v0, "Navigator didn\'t init."

    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lcom/tv91/x/h;

    return-object p1
.end method

.method public b(Landroidx/fragment/app/e;I)Lcom/tv91/x/h;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/tv91/x/i;->a:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/x/h;

    if-nez v1, :cond_0

    .line 3
    new-instance v1, Lcom/tv91/x/h;

    invoke-direct {v1, p1, p2}, Lcom/tv91/x/h;-><init>(Landroidx/fragment/app/e;I)V

    .line 4
    iget-object p1, p0, Lcom/tv91/x/i;->a:Ljava/util/Map;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1
.end method

.method public d(Landroidx/fragment/app/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/x/i;->a:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
