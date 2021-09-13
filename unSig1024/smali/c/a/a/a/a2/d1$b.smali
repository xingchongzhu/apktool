.class public final Lc/a/a/a/a2/d1$b;
.super Lc/a/a/a/m2/x;
.source "AnalyticsListener.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/a2/d1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lc/a/a/a/a2/d1$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/m2/x;-><init>()V

    .line 2
    new-instance v0, Landroid/util/SparseArray;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V

    iput-object v0, p0, Lc/a/a/a/a2/d1$b;->b:Landroid/util/SparseArray;

    return-void
.end method


# virtual methods
.method public b(I)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lc/a/a/a/m2/x;->b(I)Z

    move-result p1

    return p1
.end method

.method public d(I)I
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lc/a/a/a/m2/x;->d(I)I

    move-result p1

    return p1
.end method

.method public f(Landroid/util/SparseArray;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Lc/a/a/a/a2/d1$a;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/a2/d1$b;->b:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, Lc/a/a/a/m2/x;->e()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Lc/a/a/a/a2/d1$b;->d(I)I

    move-result v1

    .line 4
    iget-object v2, p0, Lc/a/a/a/a2/d1$b;->b:Landroid/util/SparseArray;

    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/a/a/a/a2/d1$a;

    invoke-static {v3}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/a/a/a/a2/d1$a;

    invoke-virtual {v2, v1, v3}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
