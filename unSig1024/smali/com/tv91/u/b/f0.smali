.class public final synthetic Lcom/tv91/u/b/f0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/b/q0;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/b/q0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/b/f0;->a:Lcom/tv91/u/b/q0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/tv91/u/b/f0;->a:Lcom/tv91/u/b/q0;

    invoke-virtual {v0}, Lcom/tv91/u/b/q0;->D2()V

    return-void
.end method
