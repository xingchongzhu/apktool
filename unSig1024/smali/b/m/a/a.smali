.class public abstract Lb/m/a/a;
.super Ljava/lang/Object;
.source "LoaderManager.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroidx/lifecycle/i;)Lb/m/a/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroidx/lifecycle/i;",
            ":",
            "Landroidx/lifecycle/u;",
            ">(TT;)",
            "Lb/m/a/a;"
        }
    .end annotation

    .line 1
    new-instance v0, Lb/m/a/b;

    move-object v1, p0

    check-cast v1, Landroidx/lifecycle/u;

    invoke-interface {v1}, Landroidx/lifecycle/u;->p()Landroidx/lifecycle/t;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lb/m/a/b;-><init>(Landroidx/lifecycle/i;Landroidx/lifecycle/t;)V

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract c()V
.end method
