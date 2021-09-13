.class public final synthetic Lcom/tv91/u/h/j/a;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/h/j/r;

.field public final synthetic b:Lcom/tv91/model/PurchasePackage;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/h/j/r;Lcom/tv91/model/PurchasePackage;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/h/j/a;->a:Lcom/tv91/u/h/j/r;

    iput-object p2, p0, Lcom/tv91/u/h/j/a;->b:Lcom/tv91/model/PurchasePackage;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/h/j/a;->a:Lcom/tv91/u/h/j/r;

    iget-object v1, p0, Lcom/tv91/u/h/j/a;->b:Lcom/tv91/model/PurchasePackage;

    invoke-virtual {v0, v1}, Lcom/tv91/u/h/j/r;->H2(Lcom/tv91/model/PurchasePackage;)V

    return-void
.end method
