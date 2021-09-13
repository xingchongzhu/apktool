.class public final synthetic Lcom/tv91/u/a/b;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/tv91/u/a/e;

.field public final synthetic b:Lb/g/j/a;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/a/e;Lb/g/j/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/a/b;->a:Lcom/tv91/u/a/e;

    iput-object p2, p0, Lcom/tv91/u/a/b;->b:Lb/g/j/a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/a/b;->a:Lcom/tv91/u/a/e;

    iget-object v1, p0, Lcom/tv91/u/a/b;->b:Lb/g/j/a;

    invoke-virtual {v0, v1, p1}, Lcom/tv91/u/a/e;->s2(Lb/g/j/a;Landroid/view/View;)V

    return-void
.end method
