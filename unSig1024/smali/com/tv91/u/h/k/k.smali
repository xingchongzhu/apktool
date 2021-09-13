.class public final synthetic Lcom/tv91/u/h/k/k;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/h/k/r;

.field public final synthetic b:Lcom/tv91/model/Movie;

.field public final synthetic c:Lcom/tv91/model/PurchasePackage;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/h/k/r;Lcom/tv91/model/Movie;Lcom/tv91/model/PurchasePackage;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/h/k/k;->a:Lcom/tv91/u/h/k/r;

    iput-object p2, p0, Lcom/tv91/u/h/k/k;->b:Lcom/tv91/model/Movie;

    iput-object p3, p0, Lcom/tv91/u/h/k/k;->c:Lcom/tv91/model/PurchasePackage;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/tv91/u/h/k/k;->a:Lcom/tv91/u/h/k/r;

    iget-object v1, p0, Lcom/tv91/u/h/k/k;->b:Lcom/tv91/model/Movie;

    iget-object v2, p0, Lcom/tv91/u/h/k/k;->c:Lcom/tv91/model/PurchasePackage;

    invoke-virtual {v0, v1, v2}, Lcom/tv91/u/h/k/r;->r(Lcom/tv91/model/Movie;Lcom/tv91/model/PurchasePackage;)V

    return-void
.end method
