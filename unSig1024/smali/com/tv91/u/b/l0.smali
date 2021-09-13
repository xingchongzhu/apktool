.class public final synthetic Lcom/tv91/u/b/l0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/b/u0;

.field public final synthetic b:Lcom/tv91/model/a;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/b/u0;Lcom/tv91/model/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/b/l0;->a:Lcom/tv91/u/b/u0;

    iput-object p2, p0, Lcom/tv91/u/b/l0;->b:Lcom/tv91/model/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/b/l0;->a:Lcom/tv91/u/b/u0;

    iget-object v1, p0, Lcom/tv91/u/b/l0;->b:Lcom/tv91/model/a;

    invoke-virtual {v0, v1}, Lcom/tv91/u/b/u0;->x2(Lcom/tv91/model/a;)V

    return-void
.end method
