.class public final Lc/a/b/b/s$a;
.super Lc/a/b/b/u$b;
.source "ImmutableListMultimap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/b/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lc/a/b/b/u$b<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/a/b/b/u$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Iterable;)Lc/a/b/b/u$b;
    .locals 0
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lc/a/b/b/s$a;->f(Ljava/lang/Object;Ljava/lang/Iterable;)Lc/a/b/b/s$a;

    move-result-object p1

    return-object p1
.end method

.method public e()Lc/a/b/b/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc/a/b/b/s<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    invoke-super {p0}, Lc/a/b/b/u$b;->a()Lc/a/b/b/u;

    move-result-object v0

    check-cast v0, Lc/a/b/b/s;

    return-object v0
.end method

.method public f(Ljava/lang/Object;Ljava/lang/Iterable;)Lc/a/b/b/s$a;
    .locals 0
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/lang/Iterable<",
            "+TV;>;)",
            "Lc/a/b/b/s$a<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, Lc/a/b/b/u$b;->c(Ljava/lang/Object;Ljava/lang/Iterable;)Lc/a/b/b/u$b;

    return-object p0
.end method

.method public varargs g(Ljava/lang/Object;[Ljava/lang/Object;)Lc/a/b/b/s$a;
    .locals 0
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;[TV;)",
            "Lc/a/b/b/s$a<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, Lc/a/b/b/u$b;->d(Ljava/lang/Object;[Ljava/lang/Object;)Lc/a/b/b/u$b;

    return-object p0
.end method
