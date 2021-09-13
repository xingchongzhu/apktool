.class final Lc/a/b/b/m0$b;
.super Lc/a/b/b/v;
.source "RegularImmutableMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/b/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        ">",
        "Lc/a/b/b/v<",
        "TK;>;"
    }
.end annotation


# instance fields
.field private final transient c:Lc/a/b/b/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/b/t<",
            "TK;*>;"
        }
    .end annotation
.end field

.field private final transient d:Lc/a/b/b/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/b/r<",
            "TK;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lc/a/b/b/t;Lc/a/b/b/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/b/b/t<",
            "TK;*>;",
            "Lc/a/b/b/r<",
            "TK;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lc/a/b/b/v;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/b/b/m0$b;->c:Lc/a/b/b/t;

    .line 3
    iput-object p2, p0, Lc/a/b/b/m0$b;->d:Lc/a/b/b/r;

    return-void
.end method


# virtual methods
.method public b()Lc/a/b/b/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc/a/b/b/r<",
            "TK;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/b/m0$b;->d:Lc/a/b/b/r;

    return-object v0
.end method

.method c([Ljava/lang/Object;I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/a/b/b/m0$b;->b()Lc/a/b/b/r;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lc/a/b/b/r;->c([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lc/a/b/b/m0$b;->c:Lc/a/b/b/t;

    invoke-virtual {v0, p1}, Lc/a/b/b/t;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method g()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public h()Lc/a/b/b/u0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc/a/b/b/u0<",
            "TK;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lc/a/b/b/m0$b;->b()Lc/a/b/b/r;

    move-result-object v0

    invoke-virtual {v0}, Lc/a/b/b/r;->h()Lc/a/b/b/u0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/a/b/b/m0$b;->h()Lc/a/b/b/u0;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/b/b/m0$b;->c:Lc/a/b/b/t;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method
