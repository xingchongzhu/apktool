.class Lc/a/a/a/e2/y$a;
.super Ljava/lang/Object;
.source "DrmSessionManager.java"

# interfaces
.implements Lc/a/a/a/e2/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/e2/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a()V
    .locals 0

    invoke-static {p0}, Lc/a/a/a/e2/x;->b(Lc/a/a/a/e2/y;)V

    return-void
.end method

.method public b(Landroid/os/Looper;Lc/a/a/a/e2/w$a;Lc/a/a/a/u0;)Lc/a/a/a/e2/v;
    .locals 1

    .line 1
    iget-object p1, p3, Lc/a/a/a/u0;->o:Lc/a/a/a/e2/t;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    new-instance p1, Lc/a/a/a/e2/b0;

    new-instance p2, Lc/a/a/a/e2/v$a;

    new-instance p3, Lc/a/a/a/e2/k0;

    const/4 v0, 0x1

    invoke-direct {p3, v0}, Lc/a/a/a/e2/k0;-><init>(I)V

    invoke-direct {p2, p3}, Lc/a/a/a/e2/v$a;-><init>(Ljava/lang/Throwable;)V

    invoke-direct {p1, p2}, Lc/a/a/a/e2/b0;-><init>(Lc/a/a/a/e2/v$a;)V

    return-object p1
.end method

.method public c(Lc/a/a/a/u0;)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/u0;",
            ")",
            "Ljava/lang/Class<",
            "Lc/a/a/a/e2/l0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p1, p1, Lc/a/a/a/u0;->o:Lc/a/a/a/e2/t;

    if-eqz p1, :cond_0

    const-class p1, Lc/a/a/a/e2/l0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public synthetic d()V
    .locals 0

    invoke-static {p0}, Lc/a/a/a/e2/x;->a(Lc/a/a/a/e2/y;)V

    return-void
.end method
