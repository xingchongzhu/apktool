.class public final synthetic Lcom/tv91/u/c/k/n;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/c/k/u;

.field public final synthetic b:Lcom/tv91/model/Movie;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/c/k/u;Lcom/tv91/model/Movie;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/c/k/n;->a:Lcom/tv91/u/c/k/u;

    iput-object p2, p0, Lcom/tv91/u/c/k/n;->b:Lcom/tv91/model/Movie;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/c/k/n;->a:Lcom/tv91/u/c/k/u;

    iget-object v1, p0, Lcom/tv91/u/c/k/n;->b:Lcom/tv91/model/Movie;

    invoke-virtual {v0, v1}, Lcom/tv91/u/c/k/u;->r(Lcom/tv91/model/Movie;)V

    return-void
.end method
