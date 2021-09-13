.class public abstract Lcom/tv91/features/shared/h/d;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source "ViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ITEM:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/recyclerview/widget/RecyclerView$d0;"
    }
.end annotation


# static fields
.field private static final t:Landroid/graphics/drawable/Drawable;


# instance fields
.field protected final u:Landroid/content/Context;

.field protected final v:Lcom/tv91/z/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    sput-object v0, Lcom/tv91/features/shared/h/d;->t:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/features/shared/h/d;->u:Landroid/content/Context;

    .line 4
    invoke-static {p1}, Lcom/tv91/z/d;->e(Landroid/content/Context;)Lcom/tv91/z/f;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/features/shared/h/d;->v:Lcom/tv91/z/f;

    return-void
.end method

.method public constructor <init>(Lb/r/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VB::",
            "Lb/r/a;",
            ">(TVB;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lb/r/a;->a()Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/tv91/features/shared/h/d;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method protected M(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TITEM;)V"
        }
    .end annotation

    return-void
.end method

.method protected N(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/h/d;->u:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    int-to-float p1, p1

    const/4 v1, 0x1

    .line 2
    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    float-to-int p1, p1

    return p1
.end method

.method protected O(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/h/d;->u:Landroid/content/Context;

    invoke-static {v0, p1}, Landroidx/core/content/a;->b(Landroid/content/Context;I)I

    move-result p1

    return p1
.end method

.method protected P(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/h/d;->u:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p1

    return p1
.end method

.method protected Q(I)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/h/d;->u:Landroid/content/Context;

    invoke-static {v0, p1}, Landroidx/core/content/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-nez p1, :cond_0

    .line 2
    sget-object p1, Lcom/tv91/features/shared/h/d;->t:Landroid/graphics/drawable/Drawable;

    :cond_0
    return-object p1
.end method

.method protected varargs R(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/h/d;->u:Landroid/content/Context;

    invoke-virtual {v0, p1, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected S(II)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/drawable/PaintDrawable;

    invoke-virtual {p0, p1}, Lcom/tv91/features/shared/h/d;->O(I)I

    move-result p1

    invoke-direct {v0, p1}, Landroid/graphics/drawable/PaintDrawable;-><init>(I)V

    int-to-float p1, p2

    .line 2
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/PaintDrawable;->setCornerRadius(F)V

    return-object v0
.end method
