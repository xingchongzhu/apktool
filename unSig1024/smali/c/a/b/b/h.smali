.class final Lc/a/b/b/h;
.super Lc/a/b/b/j0;
.source "ByFunctionOrdering.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<F:",
        "Ljava/lang/Object;",
        "T:",
        "Ljava/lang/Object;",
        ">",
        "Lc/a/b/b/j0<",
        "TF;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field final a:Lc/a/b/a/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/a/e<",
            "TF;+TT;>;"
        }
    .end annotation
.end field

.field final b:Lc/a/b/b/j0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/b/j0<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lc/a/b/a/e;Lc/a/b/b/j0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/b/a/e<",
            "TF;+TT;>;",
            "Lc/a/b/b/j0<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lc/a/b/b/j0;-><init>()V

    .line 2
    invoke-static {p1}, Lc/a/b/a/g;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/b/a/e;

    iput-object p1, p0, Lc/a/b/b/h;->a:Lc/a/b/a/e;

    .line 3
    invoke-static {p2}, Lc/a/b/a/g;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/b/b/j0;

    iput-object p1, p0, Lc/a/b/b/h;->b:Lc/a/b/b/j0;

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;TF;)I"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/b/h;->b:Lc/a/b/b/j0;

    iget-object v1, p0, Lc/a/b/b/h;->a:Lc/a/b/a/e;

    invoke-interface {v1, p1}, Lc/a/b/a/e;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v1, p0, Lc/a/b/b/h;->a:Lc/a/b/a/e;

    invoke-interface {v1, p2}, Lc/a/b/a/e;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lc/a/b/b/j0;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lc/a/b/b/h;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 2
    check-cast p1, Lc/a/b/b/h;

    .line 3
    iget-object v1, p0, Lc/a/b/b/h;->a:Lc/a/b/a/e;

    iget-object v3, p1, Lc/a/b/b/h;->a:Lc/a/b/a/e;

    invoke-interface {v1, v3}, Lc/a/b/a/e;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lc/a/b/b/h;->b:Lc/a/b/b/j0;

    iget-object p1, p1, Lc/a/b/b/h;->b:Lc/a/b/b/j0;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    iget-object v1, p0, Lc/a/b/b/h;->a:Lc/a/b/a/e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lc/a/b/b/h;->b:Lc/a/b/b/j0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lc/a/b/a/f;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lc/a/b/b/h;->b:Lc/a/b/b/j0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".onResultOf("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc/a/b/b/h;->a:Lc/a/b/a/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
