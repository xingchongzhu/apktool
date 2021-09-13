.class abstract Lc/a/a/a/f2/g0/e;
.super Ljava/lang/Object;
.source "TagPayloadReader.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/f2/g0/e$a;
    }
.end annotation


# instance fields
.field protected final a:Lc/a/a/a/f2/b0;


# direct methods
.method protected constructor <init>(Lc/a/a/a/f2/b0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/f2/g0/e;->a:Lc/a/a/a/f2/b0;

    return-void
.end method


# virtual methods
.method public final a(Lc/a/a/a/m2/a0;J)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lc/a/a/a/f2/g0/e;->b(Lc/a/a/a/m2/a0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Lc/a/a/a/f2/g0/e;->c(Lc/a/a/a/m2/a0;J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected abstract b(Lc/a/a/a/m2/a0;)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation
.end method

.method protected abstract c(Lc/a/a/a/m2/a0;J)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation
.end method
