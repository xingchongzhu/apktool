.class public final synthetic Lcom/tv91/u/e/g/j;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/g/j/a;


# instance fields
.field public final synthetic a:Lcom/tv91/u/e/g/x;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/e/g/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/e/g/j;->a:Lcom/tv91/u/e/g/x;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/tv91/u/e/g/j;->a:Lcom/tv91/u/e/g/x;

    check-cast p1, Lcom/tv91/model/Promotion;

    invoke-virtual {v0, p1}, Lcom/tv91/u/e/g/x;->F2(Lcom/tv91/model/Promotion;)V

    return-void
.end method
