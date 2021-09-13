.class final Lc/a/a/a/k2/p/b;
.super Ljava/lang/Object;
.source "PgsSubtitle.java"

# interfaces
.implements Lc/a/a/a/k2/f;


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/a/k2/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/a/a/a/k2/c;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/k2/p/b;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(J)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method

.method public b(I)J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public c(J)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lc/a/a/a/k2/c;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lc/a/a/a/k2/p/b;->a:Ljava/util/List;

    return-object p1
.end method

.method public d()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
