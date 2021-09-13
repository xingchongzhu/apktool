.class public final synthetic Lcom/tv91/u/f/e/i;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/f/e/o;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/f/e/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/f/e/i;->a:Lcom/tv91/u/f/e/o;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/tv91/u/f/e/i;->a:Lcom/tv91/u/f/e/o;

    invoke-virtual {v0}, Lcom/tv91/u/f/e/o;->M2()V

    return-void
.end method
