.class public final synthetic Lcom/tv91/u/b/d;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lb/g/j/i;

.field public final synthetic b:Landroid/view/View$OnClickListener;


# direct methods
.method public synthetic constructor <init>(Lb/g/j/i;Landroid/view/View$OnClickListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/b/d;->a:Lb/g/j/i;

    iput-object p2, p0, Lcom/tv91/u/b/d;->b:Landroid/view/View$OnClickListener;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/b/d;->a:Lb/g/j/i;

    iget-object v1, p0, Lcom/tv91/u/b/d;->b:Landroid/view/View$OnClickListener;

    invoke-static {v0, v1, p1}, Lcom/tv91/u/b/p0$b;->b0(Lb/g/j/i;Landroid/view/View$OnClickListener;Landroid/view/View;)V

    return-void
.end method
