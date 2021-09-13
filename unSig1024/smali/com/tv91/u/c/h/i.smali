.class public final synthetic Lcom/tv91/u/c/h/i;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/tv91/u/c/h/u$b;

.field public final synthetic b:Lcom/tv91/u/c/h/u$c;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/c/h/u$b;Lcom/tv91/u/c/h/u$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/c/h/i;->a:Lcom/tv91/u/c/h/u$b;

    iput-object p2, p0, Lcom/tv91/u/c/h/i;->b:Lcom/tv91/u/c/h/u$c;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/c/h/i;->a:Lcom/tv91/u/c/h/u$b;

    iget-object v1, p0, Lcom/tv91/u/c/h/i;->b:Lcom/tv91/u/c/h/u$c;

    invoke-virtual {v0, v1, p1}, Lcom/tv91/u/c/h/u$b;->N(Lcom/tv91/u/c/h/u$c;Landroid/view/View;)V

    return-void
.end method
