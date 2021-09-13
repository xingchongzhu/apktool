.class Lc/a/b/b/u$a;
.super Lc/a/b/b/u0;
.source "ImmutableMultimap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/a/b/b/u;->j()Lc/a/b/b/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/a/b/b/u0<",
        "TV;>;"
    }
.end annotation


# instance fields
.field a:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "+",
            "Lc/a/b/b/p<",
            "TV;>;>;"
        }
    .end annotation
.end field

.field b:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "TV;>;"
        }
    .end annotation
.end field

.field final synthetic c:Lc/a/b/b/u;


# direct methods
.method constructor <init>(Lc/a/b/b/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/b/b/u$a;->c:Lc/a/b/b/u;

    invoke-direct {p0}, Lc/a/b/b/u0;-><init>()V

    .line 2
    iget-object p1, p1, Lc/a/b/b/u;->d:Lc/a/b/b/t;

    invoke-virtual {p1}, Lc/a/b/b/t;->k()Lc/a/b/b/p;

    move-result-object p1

    invoke-virtual {p1}, Lc/a/b/b/p;->h()Lc/a/b/b/u0;

    move-result-object p1

    iput-object p1, p0, Lc/a/b/b/u$a;->a:Ljava/util/Iterator;

    .line 3
    invoke-static {}, Lc/a/b/b/x;->d()Lc/a/b/b/u0;

    move-result-object p1

    iput-object p1, p0, Lc/a/b/b/u$a;->b:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/b/b/u$a;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lc/a/b/b/u$a;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/b/u$a;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/a/b/b/u$a;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/b/b/p;

    invoke-virtual {v0}, Lc/a/b/b/p;->h()Lc/a/b/b/u0;

    move-result-object v0

    iput-object v0, p0, Lc/a/b/b/u$a;->b:Ljava/util/Iterator;

    .line 3
    :cond_0
    iget-object v0, p0, Lc/a/b/b/u$a;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
