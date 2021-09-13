.class Lc/a/b/b/r0$a$a;
.super Lc/a/b/b/b;
.source "Sets.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/a/b/b/r0$a;->b()Lc/a/b/b/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/a/b/b/b<",
        "TE;>;"
    }
.end annotation


# instance fields
.field final c:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation
.end field

.field final synthetic d:Lc/a/b/b/r0$a;


# direct methods
.method constructor <init>(Lc/a/b/b/r0$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/b/b/r0$a$a;->d:Lc/a/b/b/r0$a;

    invoke-direct {p0}, Lc/a/b/b/b;-><init>()V

    .line 2
    iget-object p1, p1, Lc/a/b/b/r0$a;->a:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lc/a/b/b/r0$a$a;->c:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method protected a()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .line 1
    :cond_0
    iget-object v0, p0, Lc/a/b/b/r0$a$a;->c:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lc/a/b/b/r0$a$a;->c:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lc/a/b/b/r0$a$a;->d:Lc/a/b/b/r0$a;

    iget-object v1, v1, Lc/a/b/b/r0$a;->b:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 4
    :cond_1
    invoke-virtual {p0}, Lc/a/b/b/b;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
