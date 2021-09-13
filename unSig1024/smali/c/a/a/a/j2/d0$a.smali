.class public final Lc/a/a/a/j2/d0$a;
.super Lc/a/a/a/j2/b0;
.source "MediaSource.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/j2/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(Lc/a/a/a/j2/b0;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lc/a/a/a/j2/b0;-><init>(Lc/a/a/a/j2/b0;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lc/a/a/a/j2/b0;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;IIJ)V
    .locals 0

    .line 3
    invoke-direct/range {p0 .. p5}, Lc/a/a/a/j2/b0;-><init>(Ljava/lang/Object;IIJ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;JI)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lc/a/a/a/j2/b0;-><init>(Ljava/lang/Object;JI)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)Lc/a/a/a/j2/d0$a;
    .locals 1

    .line 1
    new-instance v0, Lc/a/a/a/j2/d0$a;

    invoke-super {p0, p1}, Lc/a/a/a/j2/b0;->a(Ljava/lang/Object;)Lc/a/a/a/j2/b0;

    move-result-object p1

    invoke-direct {v0, p1}, Lc/a/a/a/j2/d0$a;-><init>(Lc/a/a/a/j2/b0;)V

    return-object v0
.end method
