.class final Lcom/tv91/k$c;
.super Lcom/tv91/g;
.source "DaggerApp_HiltComponents_SingletonC.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/k$c$b;,
        Lcom/tv91/k$c$a;
    }
.end annotation


# instance fields
.field private volatile a:Ljava/lang/Object;

.field final synthetic b:Lcom/tv91/k;


# direct methods
.method private constructor <init>(Lcom/tv91/k;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tv91/k$c;->b:Lcom/tv91/k;

    invoke-direct {p0}, Lcom/tv91/g;-><init>()V

    .line 3
    new-instance p1, Ld/b/b;

    invoke-direct {p1}, Ld/b/b;-><init>()V

    iput-object p1, p0, Lcom/tv91/k$c;->a:Ljava/lang/Object;

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/k;Lcom/tv91/k$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/k$c;-><init>(Lcom/tv91/k;)V

    return-void
.end method

.method private c()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/k$c;->a:Ljava/lang/Object;

    .line 2
    instance-of v1, v0, Ld/b/b;

    if-eqz v1, :cond_1

    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/tv91/k$c;->a:Ljava/lang/Object;

    .line 5
    instance-of v2, v1, Ld/b/b;

    if-eqz v2, :cond_0

    .line 6
    invoke-static {}, Ldagger/hilt/android/internal/managers/c;->a()Ldagger/hilt/android/internal/managers/b$e;

    move-result-object v1

    .line 7
    iget-object v2, p0, Lcom/tv91/k$c;->a:Ljava/lang/Object;

    invoke-static {v2, v1}, Ld/b/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/tv91/k$c;->a:Ljava/lang/Object;

    .line 8
    :cond_0
    monitor-exit v0

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    return-object v0
.end method


# virtual methods
.method public a()Ld/a/b/d/b/a;
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/k$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/tv91/k$c$a;-><init>(Lcom/tv91/k$c;Lcom/tv91/k$a;)V

    return-object v0
.end method

.method public b()Ld/a/b/a;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tv91/k$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld/a/b/a;

    return-object v0
.end method
