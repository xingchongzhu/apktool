.class public final synthetic Lcom/tv91/u/a/p/o;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/g/j/a;


# instance fields
.field public final synthetic a:Lcom/tv91/u/a/p/v;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/a/p/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/a/p/o;->a:Lcom/tv91/u/a/p/v;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/tv91/u/a/p/o;->a:Lcom/tv91/u/a/p/v;

    check-cast p1, Lcom/tv91/model/User;

    invoke-virtual {v0, p1}, Lcom/tv91/u/a/p/v;->D2(Lcom/tv91/model/User;)V

    return-void
.end method
