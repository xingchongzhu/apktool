.class public final synthetic Lcom/tv91/u/h/i/r;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lb/g/j/a;

.field public final synthetic b:Lcom/tv91/model/PaymentMethod;


# direct methods
.method public synthetic constructor <init>(Lb/g/j/a;Lcom/tv91/model/PaymentMethod;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/h/i/r;->a:Lb/g/j/a;

    iput-object p2, p0, Lcom/tv91/u/h/i/r;->b:Lcom/tv91/model/PaymentMethod;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/h/i/r;->a:Lb/g/j/a;

    iget-object v1, p0, Lcom/tv91/u/h/i/r;->b:Lcom/tv91/model/PaymentMethod;

    invoke-static {v0, v1}, Lcom/tv91/u/h/i/c0;->m(Lb/g/j/a;Lcom/tv91/model/PaymentMethod;)V

    return-void
.end method
