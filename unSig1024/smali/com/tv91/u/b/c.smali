.class public final synthetic Lcom/tv91/u/b/c;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/tv91/u/b/p0$b;

.field public final synthetic b:Lb/g/j/i;

.field public final synthetic c:Landroid/view/View$OnClickListener;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/b/p0$b;Lb/g/j/i;Landroid/view/View$OnClickListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/b/c;->a:Lcom/tv91/u/b/p0$b;

    iput-object p2, p0, Lcom/tv91/u/b/c;->b:Lb/g/j/i;

    iput-object p3, p0, Lcom/tv91/u/b/c;->c:Landroid/view/View$OnClickListener;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/tv91/u/b/c;->a:Lcom/tv91/u/b/p0$b;

    iget-object v1, p0, Lcom/tv91/u/b/c;->b:Lb/g/j/i;

    iget-object v2, p0, Lcom/tv91/u/b/c;->c:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1, v2, p1}, Lcom/tv91/u/b/p0$b;->a0(Lb/g/j/i;Landroid/view/View$OnClickListener;Landroid/view/View;)V

    return-void
.end method
