.class public final synthetic Lcom/tv91/u/h/k/b;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/h/k/m;

.field public final synthetic b:Lcom/tv91/model/PaymentMethod;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/h/k/m;Lcom/tv91/model/PaymentMethod;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/h/k/b;->a:Lcom/tv91/u/h/k/m;

    iput-object p2, p0, Lcom/tv91/u/h/k/b;->b:Lcom/tv91/model/PaymentMethod;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/h/k/b;->a:Lcom/tv91/u/h/k/m;

    iget-object v1, p0, Lcom/tv91/u/h/k/b;->b:Lcom/tv91/model/PaymentMethod;

    invoke-virtual {v0, v1}, Lcom/tv91/u/h/k/m;->r(Lcom/tv91/model/PaymentMethod;)V

    return-void
.end method
