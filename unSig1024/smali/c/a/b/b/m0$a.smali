.class Lc/a/b/b/m0$a;
.super Lc/a/b/b/v;
.source "RegularImmutableMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/b/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lc/a/b/b/v<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field private final transient c:Lc/a/b/b/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/b/t<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private final transient d:[Ljava/lang/Object;

.field private final transient e:I

.field private final transient f:I


# direct methods
.method constructor <init>(Lc/a/b/b/t;[Ljava/lang/Object;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/b/b/t<",
            "TK;TV;>;[",
            "Ljava/lang/Object;",
            "II)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lc/a/b/b/v;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/b/b/m0$a;->c:Lc/a/b/b/t;

    .line 3
    iput-object p2, p0, Lc/a/b/b/m0$a;->d:[Ljava/lang/Object;

    .line 4
    iput p3, p0, Lc/a/b/b/m0$a;->e:I

    .line 5
    iput p4, p0, Lc/a/b/b/m0$a;->f:I

    return-void
.end method

.method static synthetic t(Lc/a/b/b/m0$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/b/b/m0$a;->f:I

    return p0
.end method

.method static synthetic u(Lc/a/b/b/m0$a;)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/b/b/m0$a;->d:[Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic v(Lc/a/b/b/m0$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/b/b/m0$a;->e:I

    return p0
.end method


# virtual methods
.method c([Ljava/lang/Object;I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/a/b/b/v;->b()Lc/a/b/b/r;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lc/a/b/b/r;->c([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Ljava/util/Map$Entry;

    .line 3
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    .line 4
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    iget-object v2, p0, Lc/a/b/b/m0$a;->c:Lc/a/b/b/t;

    invoke-virtual {v2, v0}, Lc/a/b/b/t;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
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
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lc/a/b/b/v;->b()Lc/a/b/b/r;

    move-result-object v0

    invoke-virtual {v0}, Lc/a/b/b/r;->h()Lc/a/b/b/u0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/a/b/b/m0$a;->h()Lc/a/b/b/u0;

    move-result-object v0

    return-object v0
.end method

.method m()Lc/a/b/b/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc/a/b/b/r<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lc/a/b/b/m0$a$a;

    invoke-direct {v0, p0}, Lc/a/b/b/m0$a$a;-><init>(Lc/a/b/b/m0$a;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/b/b/m0$a;->f:I

    return v0
.end method
