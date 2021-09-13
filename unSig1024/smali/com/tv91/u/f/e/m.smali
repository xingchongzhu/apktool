.class public final synthetic Lcom/tv91/u/f/e/m;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/tv91/u/f/e/r;

.field public final synthetic b:Lb/g/j/a;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/f/e/r;Lb/g/j/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/f/e/m;->a:Lcom/tv91/u/f/e/r;

    iput-object p2, p0, Lcom/tv91/u/f/e/m;->b:Lb/g/j/a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/f/e/m;->a:Lcom/tv91/u/f/e/r;

    iget-object v1, p0, Lcom/tv91/u/f/e/m;->b:Lb/g/j/a;

    invoke-virtual {v0, v1, p1}, Lcom/tv91/u/f/e/r;->s2(Lb/g/j/a;Landroid/view/View;)V

    return-void
.end method
