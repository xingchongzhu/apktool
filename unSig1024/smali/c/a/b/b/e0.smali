.class public abstract Lc/a/b/b/e0;
.super Ljava/lang/Object;
.source "MultimapBuilder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/b/b/e0$c;,
        Lc/a/b/b/e0$d;,
        Lc/a/b/b/e0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K0:",
        "Ljava/lang/Object;",
        "V0:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lc/a/b/b/d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/a/b/b/e0;-><init>()V

    return-void
.end method

.method public static a()Lc/a/b/b/e0$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc/a/b/b/e0$d<",
            "Ljava/lang/Comparable;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lc/a/b/b/j0;->c()Lc/a/b/b/j0;

    move-result-object v0

    invoke-static {v0}, Lc/a/b/b/e0;->b(Ljava/util/Comparator;)Lc/a/b/b/e0$d;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/util/Comparator;)Lc/a/b/b/e0$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K0:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "TK0;>;)",
            "Lc/a/b/b/e0$d<",
            "TK0;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lc/a/b/a/g;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lc/a/b/b/e0$a;

    invoke-direct {v0, p0}, Lc/a/b/b/e0$a;-><init>(Ljava/util/Comparator;)V

    return-object v0
.end method
