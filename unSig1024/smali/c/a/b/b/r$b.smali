.class Lc/a/b/b/r$b;
.super Lc/a/b/b/a;
.source "ImmutableList.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/b/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lc/a/b/b/a<",
        "TE;>;"
    }
.end annotation


# instance fields
.field private final c:Lc/a/b/b/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/b/r<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lc/a/b/b/r;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/b/b/r<",
            "TE;>;I)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Lc/a/b/b/a;-><init>(II)V

    .line 2
    iput-object p1, p0, Lc/a/b/b/r$b;->c:Lc/a/b/b/r;

    return-void
.end method


# virtual methods
.method protected a(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/b/r$b;->c:Lc/a/b/b/r;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
