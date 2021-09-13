.class Lc/a/a/b/c0/g$a;
.super Ljava/lang/Object;
.source "MaterialShapeDrawable.java"

# interfaces
.implements Lc/a/a/b/c0/l$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/a/a/b/c0/g;-><init>(Lc/a/a/b/c0/g$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc/a/a/b/c0/g;


# direct methods
.method constructor <init>(Lc/a/a/b/c0/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/b/c0/g$a;->a:Lc/a/a/b/c0/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/b/c0/m;Landroid/graphics/Matrix;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/b/c0/g$a;->a:Lc/a/a/b/c0/g;

    invoke-static {v0}, Lc/a/a/b/c0/g;->b(Lc/a/a/b/c0/g;)Ljava/util/BitSet;

    move-result-object v0

    add-int/lit8 v1, p3, 0x4

    invoke-virtual {p1}, Lc/a/a/b/c0/m;->e()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/util/BitSet;->set(IZ)V

    .line 2
    iget-object v0, p0, Lc/a/a/b/c0/g$a;->a:Lc/a/a/b/c0/g;

    invoke-static {v0}, Lc/a/a/b/c0/g;->d(Lc/a/a/b/c0/g;)[Lc/a/a/b/c0/m$g;

    move-result-object v0

    invoke-virtual {p1, p2}, Lc/a/a/b/c0/m;->f(Landroid/graphics/Matrix;)Lc/a/a/b/c0/m$g;

    move-result-object p1

    aput-object p1, v0, p3

    return-void
.end method

.method public b(Lc/a/a/b/c0/m;Landroid/graphics/Matrix;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/b/c0/g$a;->a:Lc/a/a/b/c0/g;

    invoke-static {v0}, Lc/a/a/b/c0/g;->b(Lc/a/a/b/c0/g;)Ljava/util/BitSet;

    move-result-object v0

    invoke-virtual {p1}, Lc/a/a/b/c0/m;->e()Z

    move-result v1

    invoke-virtual {v0, p3, v1}, Ljava/util/BitSet;->set(IZ)V

    .line 2
    iget-object v0, p0, Lc/a/a/b/c0/g$a;->a:Lc/a/a/b/c0/g;

    invoke-static {v0}, Lc/a/a/b/c0/g;->c(Lc/a/a/b/c0/g;)[Lc/a/a/b/c0/m$g;

    move-result-object v0

    invoke-virtual {p1, p2}, Lc/a/a/b/c0/m;->f(Landroid/graphics/Matrix;)Lc/a/a/b/c0/m$g;

    move-result-object p1

    aput-object p1, v0, p3

    return-void
.end method
