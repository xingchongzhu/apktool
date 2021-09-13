.class public final Lc/a/a/a/l2/i;
.super Lc/a/a/a/l2/e;
.source "FixedTrackSelection.java"


# instance fields
.field private final g:I

.field private final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc/a/a/a/j2/p0;IILjava/lang/Object;)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput p2, v0, v1

    .line 1
    invoke-direct {p0, p1, v0}, Lc/a/a/a/l2/e;-><init>(Lc/a/a/a/j2/p0;[I)V

    .line 2
    iput p3, p0, Lc/a/a/a/l2/i;->g:I

    .line 3
    iput-object p4, p0, Lc/a/a/a/l2/i;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public i(JJJLjava/util/List;[Lc/a/a/a/j2/t0/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJJ",
            "Ljava/util/List<",
            "+",
            "Lc/a/a/a/j2/t0/d;",
            ">;[",
            "Lc/a/a/a/j2/t0/e;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public m()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/l2/i;->g:I

    return v0
.end method

.method public n()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public p()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/l2/i;->h:Ljava/lang/Object;

    return-object v0
.end method
