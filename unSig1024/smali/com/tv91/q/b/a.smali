.class public final synthetic Lcom/tv91/q/b/a;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/q/b/d;

.field public final synthetic b:Lcom/tv91/q/b/f;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/q/b/d;Lcom/tv91/q/b/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/q/b/a;->a:Lcom/tv91/q/b/d;

    iput-object p2, p0, Lcom/tv91/q/b/a;->b:Lcom/tv91/q/b/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/tv91/q/b/a;->a:Lcom/tv91/q/b/d;

    iget-object v1, p0, Lcom/tv91/q/b/a;->b:Lcom/tv91/q/b/f;

    invoke-virtual {v0, v1}, Lcom/tv91/q/b/d;->f(Lcom/tv91/q/b/f;)V

    return-void
.end method
