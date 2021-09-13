.class public final synthetic Lcom/tv91/u/c/g/r;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/tv91/u/c/g/v$b;

.field public final synthetic b:Lcom/tv91/u/c/g/v$c;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/c/g/v$b;Lcom/tv91/u/c/g/v$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/c/g/r;->a:Lcom/tv91/u/c/g/v$b;

    iput-object p2, p0, Lcom/tv91/u/c/g/r;->b:Lcom/tv91/u/c/g/v$c;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/c/g/r;->a:Lcom/tv91/u/c/g/v$b;

    iget-object v1, p0, Lcom/tv91/u/c/g/r;->b:Lcom/tv91/u/c/g/v$c;

    invoke-virtual {v0, v1, p1}, Lcom/tv91/u/c/g/v$b;->P(Lcom/tv91/u/c/g/v$c;Landroid/view/View;)V

    return-void
.end method
