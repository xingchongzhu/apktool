.class public final synthetic Lcom/tv91/u/h/h/a;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/g/j/a;


# instance fields
.field public final synthetic a:Lb/g/j/a;


# direct methods
.method public synthetic constructor <init>(Lb/g/j/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/h/h/a;->a:Lb/g/j/a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/tv91/u/h/h/a;->a:Lb/g/j/a;

    check-cast p1, Lcom/tv91/model/PurchaseHistory;

    invoke-interface {v0, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method
