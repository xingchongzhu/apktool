.class public final Lc/a/a/a/l2/f$b;
.super Ljava/lang/Object;
.source "DefaultTrackSelector.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/l2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1c
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lc/a/a/a/l2/f$b;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Z

.field private final b:Z


# direct methods
.method public constructor <init>(Lc/a/a/a/u0;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget p1, p1, Lc/a/a/a/u0;->d:I

    const/4 v0, 0x1

    and-int/2addr p1, v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lc/a/a/a/l2/f$b;->a:Z

    .line 3
    invoke-static {p2, v1}, Lc/a/a/a/l2/f;->r(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lc/a/a/a/l2/f$b;->b:Z

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/a/l2/f$b;)I
    .locals 3

    .line 1
    invoke-static {}, Lc/a/b/b/m;->j()Lc/a/b/b/m;

    move-result-object v0

    iget-boolean v1, p0, Lc/a/a/a/l2/f$b;->b:Z

    iget-boolean v2, p1, Lc/a/a/a/l2/f$b;->b:Z

    .line 2
    invoke-virtual {v0, v1, v2}, Lc/a/b/b/m;->g(ZZ)Lc/a/b/b/m;

    move-result-object v0

    iget-boolean v1, p0, Lc/a/a/a/l2/f$b;->a:Z

    iget-boolean p1, p1, Lc/a/a/a/l2/f$b;->a:Z

    .line 3
    invoke-virtual {v0, v1, p1}, Lc/a/b/b/m;->g(ZZ)Lc/a/b/b/m;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Lc/a/b/b/m;->i()I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lc/a/a/a/l2/f$b;

    invoke-virtual {p0, p1}, Lc/a/a/a/l2/f$b;->a(Lc/a/a/a/l2/f$b;)I

    move-result p1

    return p1
.end method
