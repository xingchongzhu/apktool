.class public final synthetic Lcom/tv91/features/shared/h/a;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/tv91/features/shared/h/b;

.field public final synthetic b:Landroidx/recyclerview/widget/RecyclerView$d0;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/features/shared/h/b;Landroidx/recyclerview/widget/RecyclerView$d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/features/shared/h/a;->a:Lcom/tv91/features/shared/h/b;

    iput-object p2, p0, Lcom/tv91/features/shared/h/a;->b:Landroidx/recyclerview/widget/RecyclerView$d0;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/tv91/features/shared/h/a;->a:Lcom/tv91/features/shared/h/b;

    iget-object v1, p0, Lcom/tv91/features/shared/h/a;->b:Landroidx/recyclerview/widget/RecyclerView$d0;

    invoke-virtual {v0, v1, p1}, Lcom/tv91/features/shared/h/b;->F(Landroidx/recyclerview/widget/RecyclerView$d0;Landroid/view/View;)V

    return-void
.end method
