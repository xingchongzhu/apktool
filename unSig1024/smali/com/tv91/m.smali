.class abstract Lcom/tv91/m;
.super Landroidx/appcompat/app/c;
.source "Hilt_MainActivity.java"

# interfaces
.implements Ld/a/c/b;


# instance fields
.field private volatile r:Ldagger/hilt/android/internal/managers/a;

.field private final s:Ljava/lang/Object;

.field private t:Z


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/tv91/m;->s:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/tv91/m;->t:Z

    .line 4
    invoke-direct {p0}, Lcom/tv91/m;->M()V

    return-void
.end method

.method private M()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/m$a;

    invoke-direct {v0, p0}, Lcom/tv91/m$a;-><init>(Lcom/tv91/m;)V

    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->n(Landroidx/activity/d/b;)V

    return-void
.end method


# virtual methods
.method public final N()Ldagger/hilt/android/internal/managers/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/m;->r:Ldagger/hilt/android/internal/managers/a;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/tv91/m;->s:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/tv91/m;->r:Ldagger/hilt/android/internal/managers/a;

    if-nez v1, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/tv91/m;->O()Ldagger/hilt/android/internal/managers/a;

    move-result-object v1

    iput-object v1, p0, Lcom/tv91/m;->r:Ldagger/hilt/android/internal/managers/a;

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
    iget-object v0, p0, Lcom/tv91/m;->r:Ldagger/hilt/android/internal/managers/a;

    return-object v0
.end method

.method protected O()Ldagger/hilt/android/internal/managers/a;
    .locals 1

    .line 1
    new-instance v0, Ldagger/hilt/android/internal/managers/a;

    invoke-direct {v0, p0}, Ldagger/hilt/android/internal/managers/a;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method

.method protected P()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/tv91/m;->t:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/tv91/m;->t:Z

    .line 3
    invoke-virtual {p0}, Lcom/tv91/m;->g()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tv91/n;

    invoke-static {p0}, Ld/a/c/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/MainActivity;

    invoke-interface {v0, v1}, Lcom/tv91/n;->c(Lcom/tv91/MainActivity;)V

    :cond_0
    return-void
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tv91/m;->N()Ldagger/hilt/android/internal/managers/a;

    move-result-object v0

    invoke-virtual {v0}, Ldagger/hilt/android/internal/managers/a;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
