.class public final synthetic Lcom/tv91/u/c/k/f;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/c/k/q;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/c/k/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/c/k/f;->a:Lcom/tv91/u/c/k/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/tv91/u/c/k/f;->a:Lcom/tv91/u/c/k/q;

    invoke-virtual {v0}, Lcom/tv91/u/c/k/q;->r()V

    return-void
.end method
