.class public final synthetic Lcom/tv91/u/h/i/s;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/g/j/a;


# instance fields
.field public final synthetic a:Lcom/tv91/u/h/i/c0;

.field public final synthetic b:Lb/g/j/a;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/h/i/c0;Lb/g/j/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/h/i/s;->a:Lcom/tv91/u/h/i/c0;

    iput-object p2, p0, Lcom/tv91/u/h/i/s;->b:Lb/g/j/a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/h/i/s;->a:Lcom/tv91/u/h/i/c0;

    iget-object v1, p0, Lcom/tv91/u/h/i/s;->b:Lb/g/j/a;

    check-cast p1, Lcom/tv91/model/PaymentMethod;

    invoke-virtual {v0, v1, p1}, Lcom/tv91/u/h/i/c0;->o(Lb/g/j/a;Lcom/tv91/model/PaymentMethod;)V

    return-void
.end method
