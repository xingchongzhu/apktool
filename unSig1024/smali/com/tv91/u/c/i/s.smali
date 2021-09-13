.class public final synthetic Lcom/tv91/u/c/i/s;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/b/a/c/a;


# instance fields
.field public final synthetic a:Lcom/tv91/u/c/i/c0;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/c/i/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/c/i/s;->a:Lcom/tv91/u/c/i/c0;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/tv91/u/c/i/s;->a:Lcom/tv91/u/c/i/c0;

    check-cast p1, Landroid/view/View;

    invoke-virtual {v0, p1}, Lcom/tv91/u/c/i/c0;->b3(Landroid/view/View;)Lcom/tv91/u/c/d$a;

    move-result-object p1

    return-object p1
.end method
