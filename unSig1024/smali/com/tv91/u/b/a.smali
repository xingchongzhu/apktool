.class public final synthetic Lcom/tv91/u/b/a;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/tv91/u/b/p0;

.field public final synthetic b:Lcom/tv91/u/b/p0$b;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/b/p0;Lcom/tv91/u/b/p0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/b/a;->a:Lcom/tv91/u/b/p0;

    iput-object p2, p0, Lcom/tv91/u/b/a;->b:Lcom/tv91/u/b/p0$b;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/b/a;->a:Lcom/tv91/u/b/p0;

    iget-object v1, p0, Lcom/tv91/u/b/a;->b:Lcom/tv91/u/b/p0$b;

    invoke-virtual {v0, v1, p1}, Lcom/tv91/u/b/p0;->O(Lcom/tv91/u/b/p0$b;Landroid/view/View;)V

    return-void
.end method
