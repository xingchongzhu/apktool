.class public final synthetic Lcom/tv91/u/e/i/g;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/e/i/p;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/e/i/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/e/i/g;->a:Lcom/tv91/u/e/i/p;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/tv91/u/e/i/g;->a:Lcom/tv91/u/e/i/p;

    invoke-virtual {v0}, Lcom/tv91/u/e/i/p;->G2()V

    return-void
.end method
