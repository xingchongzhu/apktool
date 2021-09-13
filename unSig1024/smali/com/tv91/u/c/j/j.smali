.class public final synthetic Lcom/tv91/u/c/j/j;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:Lcom/tv91/u/c/j/q;

.field public final synthetic b:Lb/g/j/a;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/c/j/q;Lb/g/j/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/c/j/j;->a:Lcom/tv91/u/c/j/q;

    iput-object p2, p0, Lcom/tv91/u/c/j/j;->b:Lb/g/j/a;

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/c/j/j;->a:Lcom/tv91/u/c/j/q;

    iget-object v1, p0, Lcom/tv91/u/c/j/j;->b:Lb/g/j/a;

    invoke-virtual {v0, v1, p1, p2}, Lcom/tv91/u/c/j/q;->r2(Lb/g/j/a;Landroid/view/View;Z)V

    return-void
.end method
