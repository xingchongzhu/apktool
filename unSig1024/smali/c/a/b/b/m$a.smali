.class final Lc/a/b/b/m$a;
.super Lc/a/b/b/m;
.source "ComparisonChain.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/b/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lc/a/b/b/m;-><init>(Lc/a/b/b/m$a;)V

    return-void
.end method


# virtual methods
.method public d(II)Lc/a/b/b/m;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lc/a/b/c/c;->d(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lc/a/b/b/m$a;->k(I)Lc/a/b/b/m;

    move-result-object p1

    return-object p1
.end method

.method public e(JJ)Lc/a/b/b/m;
    .locals 0

    .line 1
    invoke-static {p1, p2, p3, p4}, Lc/a/b/c/d;->a(JJ)I

    move-result p1

    invoke-virtual {p0, p1}, Lc/a/b/b/m$a;->k(I)Lc/a/b/b/m;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lc/a/b/b/m;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;",
            "Ljava/util/Comparator<",
            "TT;>;)",
            "Lc/a/b/b/m;"
        }
    .end annotation

    .line 1
    invoke-interface {p3, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {p0, p1}, Lc/a/b/b/m$a;->k(I)Lc/a/b/b/m;

    move-result-object p1

    return-object p1
.end method

.method public g(ZZ)Lc/a/b/b/m;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lc/a/b/c/a;->a(ZZ)I

    move-result p1

    invoke-virtual {p0, p1}, Lc/a/b/b/m$a;->k(I)Lc/a/b/b/m;

    move-result-object p1

    return-object p1
.end method

.method public h(ZZ)Lc/a/b/b/m;
    .locals 0

    .line 1
    invoke-static {p2, p1}, Lc/a/b/c/a;->a(ZZ)I

    move-result p1

    invoke-virtual {p0, p1}, Lc/a/b/b/m$a;->k(I)Lc/a/b/b/m;

    move-result-object p1

    return-object p1
.end method

.method public i()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method k(I)Lc/a/b/b/m;
    .locals 0

    if-gez p1, :cond_0

    .line 1
    invoke-static {}, Lc/a/b/b/m;->a()Lc/a/b/b/m;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-lez p1, :cond_1

    invoke-static {}, Lc/a/b/b/m;->b()Lc/a/b/b/m;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {}, Lc/a/b/b/m;->c()Lc/a/b/b/m;

    move-result-object p1

    :goto_0
    return-object p1
.end method
