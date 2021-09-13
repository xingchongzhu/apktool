.class Lc/a/b/b/l0;
.super Lc/a/b/b/r;
.source "RegularImmutableList.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lc/a/b/b/r<",
        "TE;>;"
    }
.end annotation


# static fields
.field static final c:Lc/a/b/b/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/b/r<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final transient d:[Ljava/lang/Object;

.field private final transient e:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lc/a/b/b/l0;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, Lc/a/b/b/l0;-><init>([Ljava/lang/Object;I)V

    sput-object v0, Lc/a/b/b/l0;->c:Lc/a/b/b/r;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/a/b/b/r;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/b/b/l0;->d:[Ljava/lang/Object;

    .line 3
    iput p2, p0, Lc/a/b/b/l0;->e:I

    return-void
.end method


# virtual methods
.method c([Ljava/lang/Object;I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/b/b/l0;->d:[Ljava/lang/Object;

    iget v1, p0, Lc/a/b/b/l0;->e:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2
    iget p1, p0, Lc/a/b/b/l0;->e:I

    add-int/2addr p2, p1

    return p2
.end method

.method d()[Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/b/b/l0;->d:[Ljava/lang/Object;

    return-object v0
.end method

.method e()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/b/b/l0;->e:I

    return v0
.end method

.method f()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method g()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 1
    iget v0, p0, Lc/a/b/b/l0;->e:I

    invoke-static {p1, v0}, Lc/a/b/a/g;->g(II)I

    .line 2
    iget-object v0, p0, Lc/a/b/b/l0;->d:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public size()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/b/b/l0;->e:I

    return v0
.end method
