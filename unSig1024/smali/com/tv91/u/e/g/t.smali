.class public final synthetic Lcom/tv91/u/e/g/t;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/tv91/u/e/g/a0;

.field public final synthetic b:Lb/g/j/a;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/e/g/a0;Lb/g/j/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/e/g/t;->a:Lcom/tv91/u/e/g/a0;

    iput-object p2, p0, Lcom/tv91/u/e/g/t;->b:Lb/g/j/a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/e/g/t;->a:Lcom/tv91/u/e/g/a0;

    iget-object v1, p0, Lcom/tv91/u/e/g/t;->b:Lb/g/j/a;

    invoke-virtual {v0, v1, p1}, Lcom/tv91/u/e/g/a0;->r2(Lb/g/j/a;Landroid/view/View;)V

    return-void
.end method
