.class Lcom/tv91/u/h/j/u$a;
.super Landroidx/recyclerview/widget/RecyclerView$n;
.source "PurchaseView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tv91/u/h/j/u;->q2()Landroidx/recyclerview/widget/RecyclerView$n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/tv91/u/h/j/u;


# direct methods
.method constructor <init>(Lcom/tv91/u/h/j/u;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/h/j/u$a;->b:Lcom/tv91/u/h/j/u;

    iput p2, p0, Lcom/tv91/u/h/j/u$a;->a:I

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$n;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;)V
    .locals 0

    .line 1
    iget p2, p0, Lcom/tv91/u/h/j/u$a;->a:I

    invoke-virtual {p1, p2, p2, p2, p2}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method
