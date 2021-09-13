.class final Ldagger/hilt/android/internal/managers/b;
.super Ljava/lang/Object;
.source "ActivityRetainedComponentManager.java"

# interfaces
.implements Ld/a/c/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldagger/hilt/android/internal/managers/b$e;,
        Ldagger/hilt/android/internal/managers/b$c;,
        Ldagger/hilt/android/internal/managers/b$d;,
        Ldagger/hilt/android/internal/managers/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld/a/c/b<",
        "Ld/a/b/c/b;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Landroidx/lifecycle/s;

.field private volatile b:Ld/a/b/c/b;

.field private final c:Ljava/lang/Object;


# direct methods
.method constructor <init>(Landroidx/activity/ComponentActivity;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ldagger/hilt/android/internal/managers/b;->c:Ljava/lang/Object;

    .line 3
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ldagger/hilt/android/internal/managers/b;->c(Landroidx/lifecycle/u;Landroid/content/Context;)Landroidx/lifecycle/s;

    move-result-object p1

    iput-object p1, p0, Ldagger/hilt/android/internal/managers/b;->a:Landroidx/lifecycle/s;

    return-void
.end method

.method private a()Ld/a/b/c/b;
    .locals 2

    .line 1
    iget-object v0, p0, Ldagger/hilt/android/internal/managers/b;->a:Landroidx/lifecycle/s;

    const-class v1, Ldagger/hilt/android/internal/managers/b$c;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/s;->a(Ljava/lang/Class;)Landroidx/lifecycle/r;

    move-result-object v0

    check-cast v0, Ldagger/hilt/android/internal/managers/b$c;

    invoke-virtual {v0}, Ldagger/hilt/android/internal/managers/b$c;->e()Ld/a/b/c/b;

    move-result-object v0

    return-object v0
.end method

.method private c(Landroidx/lifecycle/u;Landroid/content/Context;)Landroidx/lifecycle/s;
    .locals 2

    .line 1
    new-instance v0, Landroidx/lifecycle/s;

    new-instance v1, Ldagger/hilt/android/internal/managers/b$a;

    invoke-direct {v1, p0, p2}, Ldagger/hilt/android/internal/managers/b$a;-><init>(Ldagger/hilt/android/internal/managers/b;Landroid/content/Context;)V

    invoke-direct {v0, p1, v1}, Landroidx/lifecycle/s;-><init>(Landroidx/lifecycle/u;Landroidx/lifecycle/s$a;)V

    return-object v0
.end method


# virtual methods
.method public b()Ld/a/b/c/b;
    .locals 2

    .line 1
    iget-object v0, p0, Ldagger/hilt/android/internal/managers/b;->b:Ld/a/b/c/b;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Ldagger/hilt/android/internal/managers/b;->c:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Ldagger/hilt/android/internal/managers/b;->b:Ld/a/b/c/b;

    if-nez v1, :cond_0

    .line 4
    invoke-direct {p0}, Ldagger/hilt/android/internal/managers/b;->a()Ld/a/b/c/b;

    move-result-object v1

    iput-object v1, p0, Ldagger/hilt/android/internal/managers/b;->b:Ld/a/b/c/b;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    iget-object v0, p0, Ldagger/hilt/android/internal/managers/b;->b:Ld/a/b/c/b;

    return-object v0
.end method

.method public bridge synthetic g()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldagger/hilt/android/internal/managers/b;->b()Ld/a/b/c/b;

    move-result-object v0

    return-object v0
.end method
