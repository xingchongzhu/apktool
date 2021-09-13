.class public abstract Lc/a/b/b/j0;
.super Ljava/lang/Object;
.source "Ordering.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "TT;>;"
    }
.end annotation


# direct methods
.method protected constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/Comparator;)Lc/a/b/b/j0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "TT;>;)",
            "Lc/a/b/b/j0<",
            "TT;>;"
        }
    .end annotation

    .line 1
    instance-of v0, p0, Lc/a/b/b/j0;

    if-eqz v0, :cond_0

    check-cast p0, Lc/a/b/b/j0;

    goto :goto_0

    :cond_0
    new-instance v0, Lc/a/b/b/l;

    invoke-direct {v0, p0}, Lc/a/b/b/l;-><init>(Ljava/util/Comparator;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static c()Lc/a/b/b/j0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Ljava/lang/Comparable;",
            ">()",
            "Lc/a/b/b/j0<",
            "TC;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lc/a/b/b/h0;->a:Lc/a/b/b/h0;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/Iterable;)Lc/a/b/b/r;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:TT;>(",
            "Ljava/lang/Iterable<",
            "TE;>;)",
            "Lc/a/b/b/r<",
            "TE;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lc/a/b/b/r;->t(Ljava/util/Comparator;Ljava/lang/Iterable;)Lc/a/b/b/r;

    move-result-object p1

    return-object p1
.end method

.method public abstract compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation
.end method

.method d()Lc/a/b/b/j0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T2:TT;>()",
            "Lc/a/b/b/j0<",
            "Ljava/util/Map$Entry<",
            "TT2;*>;>;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lc/a/b/b/b0;->d()Lc/a/b/a/e;

    move-result-object v0

    invoke-virtual {p0, v0}, Lc/a/b/b/j0;->e(Lc/a/b/a/e;)Lc/a/b/b/j0;

    move-result-object v0

    return-object v0
.end method

.method public e(Lc/a/b/a/e;)Lc/a/b/b/j0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<F:",
            "Ljava/lang/Object;",
            ">(",
            "Lc/a/b/a/e<",
            "TF;+TT;>;)",
            "Lc/a/b/b/j0<",
            "TF;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lc/a/b/b/h;

    invoke-direct {v0, p1, p0}, Lc/a/b/b/h;-><init>(Lc/a/b/a/e;Lc/a/b/b/j0;)V

    return-object v0
.end method

.method public f()Lc/a/b/b/j0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:TT;>()",
            "Lc/a/b/b/j0<",
            "TS;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lc/a/b/b/p0;

    invoke-direct {v0, p0}, Lc/a/b/b/p0;-><init>(Lc/a/b/b/j0;)V

    return-object v0
.end method
