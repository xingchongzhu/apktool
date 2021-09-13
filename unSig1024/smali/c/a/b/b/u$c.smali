.class final Lc/a/b/b/u$c;
.super Lc/a/b/b/p;
.source "ImmutableMultimap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/b/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lc/a/b/b/p<",
        "TV;>;"
    }
.end annotation


# instance fields
.field private final transient b:Lc/a/b/b/u;
    .annotation build Lcom/google/j2objc/annotations/Weak;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/b/u<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lc/a/b/b/u;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/b/b/u<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lc/a/b/b/p;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/b/b/u$c;->b:Lc/a/b/b/u;

    return-void
.end method


# virtual methods
.method c([Ljava/lang/Object;I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/b/b/u$c;->b:Lc/a/b/b/u;

    iget-object v0, v0, Lc/a/b/b/u;->d:Lc/a/b/b/t;

    invoke-virtual {v0}, Lc/a/b/b/t;->k()Lc/a/b/b/p;

    move-result-object v0

    invoke-virtual {v0}, Lc/a/b/b/p;->h()Lc/a/b/b/u0;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/b/b/p;

    .line 2
    invoke-virtual {v1, p1, p2}, Lc/a/b/b/p;->c([Ljava/lang/Object;I)I

    move-result p2

    goto :goto_0

    :cond_0
    return p2
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lc/a/b/b/u$c;->b:Lc/a/b/b/u;

    invoke-virtual {v0, p1}, Lc/a/b/b/u;->b(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public h()Lc/a/b/b/u0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc/a/b/b/u0<",
            "TV;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/b/u$c;->b:Lc/a/b/b/u;

    invoke-virtual {v0}, Lc/a/b/b/u;->j()Lc/a/b/b/u0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/a/b/b/u$c;->h()Lc/a/b/b/u0;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/b/b/u$c;->b:Lc/a/b/b/u;

    invoke-virtual {v0}, Lc/a/b/b/u;->size()I

    move-result v0

    return v0
.end method
