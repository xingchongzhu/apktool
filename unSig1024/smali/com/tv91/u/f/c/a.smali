.class public final synthetic Lcom/tv91/u/f/c/a;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/f/c/p;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/f/c/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/f/c/a;->a:Lcom/tv91/u/f/c/p;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/tv91/u/f/c/a;->a:Lcom/tv91/u/f/c/p;

    invoke-virtual {v0}, Lcom/tv91/u/f/c/p;->n2()V

    return-void
.end method
