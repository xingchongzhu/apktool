.class Lc/a/b/b/k$c;
.super Lc/a/b/b/k$e;
.source "CompactHashMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/a/b/b/k;->C()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/a/b/b/k<",
        "TK;TV;>.e<TV;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lc/a/b/b/k;


# direct methods
.method constructor <init>(Lc/a/b/b/k;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lc/a/b/b/k$c;->e:Lc/a/b/b/k;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lc/a/b/b/k$e;-><init>(Lc/a/b/b/k;Lc/a/b/b/k$a;)V

    return-void
.end method


# virtual methods
.method b(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/b/k$c;->e:Lc/a/b/b/k;

    iget-object v0, v0, Lc/a/b/b/k;->d:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method
