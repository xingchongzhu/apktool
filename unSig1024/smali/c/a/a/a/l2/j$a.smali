.class public final Lc/a/a/a/l2/j$a;
.super Ljava/lang/Object;
.source "MappingTrackSelector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/l2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:I

.field private final b:[Ljava/lang/String;

.field private final c:[I

.field private final d:[Lc/a/a/a/j2/q0;

.field private final e:[I

.field private final f:[[[I

.field private final g:Lc/a/a/a/j2/q0;


# direct methods
.method constructor <init>([Ljava/lang/String;[I[Lc/a/a/a/j2/q0;[I[[[ILc/a/a/a/j2/q0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/l2/j$a;->b:[Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lc/a/a/a/l2/j$a;->c:[I

    .line 4
    iput-object p3, p0, Lc/a/a/a/l2/j$a;->d:[Lc/a/a/a/j2/q0;

    .line 5
    iput-object p5, p0, Lc/a/a/a/l2/j$a;->f:[[[I

    .line 6
    iput-object p4, p0, Lc/a/a/a/l2/j$a;->e:[I

    .line 7
    iput-object p6, p0, Lc/a/a/a/l2/j$a;->g:Lc/a/a/a/j2/q0;

    .line 8
    array-length p1, p2

    iput p1, p0, Lc/a/a/a/l2/j$a;->a:I

    return-void
.end method


# virtual methods
.method public a(IIZ)I
    .locals 6

    .line 1
    iget-object v0, p0, Lc/a/a/a/l2/j$a;->d:[Lc/a/a/a/j2/q0;

    aget-object v0, v0, p1

    invoke-virtual {v0, p2}, Lc/a/a/a/j2/q0;->l(I)Lc/a/a/a/j2/p0;

    move-result-object v0

    iget v0, v0, Lc/a/a/a/j2/p0;->a:I

    .line 2
    new-array v1, v0, [I

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 3
    invoke-virtual {p0, p1, p2, v2}, Lc/a/a/a/l2/j$a;->f(III)I

    move-result v4

    const/4 v5, 0x4

    if-eq v4, v5, :cond_0

    if-eqz p3, :cond_1

    const/4 v5, 0x3

    if-ne v4, v5, :cond_1

    :cond_0
    add-int/lit8 v4, v3, 0x1

    .line 4
    aput v2, v1, v3

    move v3, v4

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 5
    :cond_2
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p3

    .line 6
    invoke-virtual {p0, p1, p2, p3}, Lc/a/a/a/l2/j$a;->b(II[I)I

    move-result p1

    return p1
.end method

.method public b(II[I)I
    .locals 7

    const/4 v0, 0x0

    const/16 v1, 0x10

    const/4 v2, 0x0

    move-object v4, v2

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/16 v3, 0x10

    .line 1
    :goto_0
    array-length v5, p3

    if-ge v0, v5, :cond_1

    .line 2
    aget v5, p3, v0

    .line 3
    iget-object v6, p0, Lc/a/a/a/l2/j$a;->d:[Lc/a/a/a/j2/q0;

    aget-object v6, v6, p1

    .line 4
    invoke-virtual {v6, p2}, Lc/a/a/a/j2/q0;->l(I)Lc/a/a/a/j2/p0;

    move-result-object v6

    invoke-virtual {v6, v5}, Lc/a/a/a/j2/p0;->l(I)Lc/a/a/a/u0;

    move-result-object v5

    iget-object v5, v5, Lc/a/a/a/u0;->l:Ljava/lang/String;

    add-int/lit8 v6, v2, 0x1

    if-nez v2, :cond_0

    move-object v4, v5

    goto :goto_1

    .line 5
    :cond_0
    invoke-static {v4, v5}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    or-int/2addr v1, v2

    .line 6
    :goto_1
    iget-object v2, p0, Lc/a/a/a/l2/j$a;->f:[[[I

    aget-object v2, v2, p1

    aget-object v2, v2, p2

    aget v2, v2, v0

    .line 7
    invoke-static {v2}, Lc/a/a/a/q1;->c(I)I

    move-result v2

    .line 8
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v3

    add-int/lit8 v0, v0, 0x1

    move v2, v6

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_2

    .line 9
    iget-object p2, p0, Lc/a/a/a/l2/j$a;->e:[I

    aget p1, p2, p1

    invoke-static {v3, p1}, Ljava/lang/Math;->min(II)I

    move-result v3

    :cond_2
    return v3
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/l2/j$a;->a:I

    return v0
.end method

.method public d(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/l2/j$a;->c:[I

    aget p1, v0, p1

    return p1
.end method

.method public e(I)Lc/a/a/a/j2/q0;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/l2/j$a;->d:[Lc/a/a/a/j2/q0;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public f(III)I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/l2/j$a;->f:[[[I

    aget-object p1, v0, p1

    aget-object p1, p1, p2

    aget p1, p1, p3

    invoke-static {p1}, Lc/a/a/a/q1;->d(I)I

    move-result p1

    return p1
.end method
