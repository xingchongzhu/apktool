.class public final Lc/a/b/b/r$a;
.super Lc/a/b/b/p$a;
.source "ImmutableList.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/b/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lc/a/b/b/p$a<",
        "TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    .line 1
    invoke-direct {p0, v0}, Lc/a/b/b/r$a;-><init>(I)V

    return-void
.end method

.method constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lc/a/b/b/p$a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;)Lc/a/b/b/r$a;
    .locals 0
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lc/a/b/b/r$a<",
            "TE;>;"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Lc/a/b/b/p$a;->b(Ljava/lang/Object;)Lc/a/b/b/p$a;

    return-object p0
.end method

.method public e()Lc/a/b/b/r;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc/a/b/b/r<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lc/a/b/b/p$a;->c:Z

    .line 2
    iget-object v0, p0, Lc/a/b/b/p$a;->a:[Ljava/lang/Object;

    iget v1, p0, Lc/a/b/b/p$a;->b:I

    invoke-static {v0, v1}, Lc/a/b/b/r;->j([Ljava/lang/Object;I)Lc/a/b/b/r;

    move-result-object v0

    return-object v0
.end method
