.class final Ldagger/hilt/android/internal/managers/b$c;
.super Landroidx/lifecycle/r;
.source "ActivityRetainedComponentManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldagger/hilt/android/internal/managers/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field private final c:Ld/a/b/c/b;


# direct methods
.method constructor <init>(Ld/a/b/c/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/r;-><init>()V

    .line 2
    iput-object p1, p0, Ldagger/hilt/android/internal/managers/b$c;->c:Ld/a/b/c/b;

    return-void
.end method


# virtual methods
.method protected d()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/lifecycle/r;->d()V

    .line 2
    iget-object v0, p0, Ldagger/hilt/android/internal/managers/b$c;->c:Ld/a/b/c/b;

    const-class v1, Ldagger/hilt/android/internal/managers/b$d;

    .line 3
    invoke-static {v0, v1}, Ld/a/a;->a(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldagger/hilt/android/internal/managers/b$d;

    .line 4
    invoke-interface {v0}, Ldagger/hilt/android/internal/managers/b$d;->b()Ld/a/b/a;

    move-result-object v0

    .line 5
    check-cast v0, Ldagger/hilt/android/internal/managers/b$e;

    invoke-virtual {v0}, Ldagger/hilt/android/internal/managers/b$e;->a()V

    return-void
.end method

.method e()Ld/a/b/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Ldagger/hilt/android/internal/managers/b$c;->c:Ld/a/b/c/b;

    return-object v0
.end method
