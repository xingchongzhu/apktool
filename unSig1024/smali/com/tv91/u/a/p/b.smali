.class public final synthetic Lcom/tv91/u/a/p/b;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/tv91/u/a/p/u;

.field public final synthetic b:Lcom/tv91/u/a/j;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/a/p/u;Lcom/tv91/u/a/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/a/p/b;->a:Lcom/tv91/u/a/p/u;

    iput-object p2, p0, Lcom/tv91/u/a/p/b;->b:Lcom/tv91/u/a/j;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/a/p/b;->a:Lcom/tv91/u/a/p/u;

    iget-object v1, p0, Lcom/tv91/u/a/p/b;->b:Lcom/tv91/u/a/j;

    invoke-virtual {v0, v1, p1}, Lcom/tv91/u/a/p/u;->c(Lcom/tv91/u/a/j;Landroid/view/View;)V

    return-void
.end method
