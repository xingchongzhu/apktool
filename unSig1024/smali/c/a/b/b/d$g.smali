.class Lc/a/b/b/d$g;
.super Lc/a/b/b/d$k;
.source "AbstractMapBasedMultimap.java"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/b/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/a/b/b/d<",
        "TK;TV;>.k;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# instance fields
.field final synthetic g:Lc/a/b/b/d;


# direct methods
.method constructor <init>(Lc/a/b/b/d;Ljava/lang/Object;Ljava/util/List;Lc/a/b/b/d$j;)V
    .locals 0
    .param p1    # Lc/a/b/b/d;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/List<",
            "TV;>;",
            "Lc/a/b/b/d<",
            "TK;TV;>.j;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lc/a/b/b/d$g;->g:Lc/a/b/b/d;

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lc/a/b/b/d$k;-><init>(Lc/a/b/b/d;Ljava/lang/Object;Ljava/util/List;Lc/a/b/b/d$j;)V

    return-void
.end method
