.class public abstract Lc/a/b/b/e0$d;
.super Ljava/lang/Object;
.source "MultimapBuilder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/b/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K0:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lc/a/b/b/e0$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc/a/b/b/e0$c<",
            "TK0;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 1
    invoke-virtual {p0, v0}, Lc/a/b/b/e0$d;->b(I)Lc/a/b/b/e0$c;

    move-result-object v0

    return-object v0
.end method

.method public b(I)Lc/a/b/b/e0$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lc/a/b/b/e0$c<",
            "TK0;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "expectedValuesPerKey"

    .line 1
    invoke-static {p1, v0}, Lc/a/b/b/i;->b(ILjava/lang/String;)I

    .line 2
    new-instance v0, Lc/a/b/b/e0$d$a;

    invoke-direct {v0, p0, p1}, Lc/a/b/b/e0$d$a;-><init>(Lc/a/b/b/e0$d;I)V

    return-object v0
.end method

.method abstract c()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:TK0;V:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava/util/Map<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;"
        }
    .end annotation
.end method
