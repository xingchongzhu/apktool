.class abstract Lcom/tv91/l;
.super Landroid/app/Application;
.source "Hilt_App.java"

# interfaces
.implements Ld/a/c/b;


# instance fields
.field private final a:Ldagger/hilt/android/internal/managers/d;


# direct methods
.method constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 2
    new-instance v0, Ldagger/hilt/android/internal/managers/d;

    new-instance v1, Lcom/tv91/l$a;

    invoke-direct {v1, p0}, Lcom/tv91/l$a;-><init>(Lcom/tv91/l;)V

    invoke-direct {v0, v1}, Ldagger/hilt/android/internal/managers/d;-><init>(Ldagger/hilt/android/internal/managers/e;)V

    iput-object v0, p0, Lcom/tv91/l;->a:Ldagger/hilt/android/internal/managers/d;

    return-void
.end method


# virtual methods
.method public final a()Ldagger/hilt/android/internal/managers/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/l;->a:Ldagger/hilt/android/internal/managers/d;

    return-object v0
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tv91/l;->a()Ldagger/hilt/android/internal/managers/d;

    move-result-object v0

    invoke-virtual {v0}, Ldagger/hilt/android/internal/managers/d;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public onCreate()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/tv91/l;->g()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tv91/e;

    invoke-static {p0}, Ld/a/c/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/App;

    invoke-interface {v0, v1}, Lcom/tv91/e;->b(Lcom/tv91/App;)V

    .line 2
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    return-void
.end method
