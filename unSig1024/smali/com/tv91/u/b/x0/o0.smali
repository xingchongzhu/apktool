.class public final synthetic Lcom/tv91/u/b/x0/o0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/b/x0/v1;

.field public final synthetic b:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/b/x0/v1;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/b/x0/o0;->a:Lcom/tv91/u/b/x0/v1;

    iput-object p2, p0, Lcom/tv91/u/b/x0/o0;->b:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/b/x0/o0;->a:Lcom/tv91/u/b/x0/v1;

    iget-object v1, p0, Lcom/tv91/u/b/x0/o0;->b:Ljava/lang/Exception;

    invoke-virtual {v0, v1}, Lcom/tv91/u/b/x0/v1;->y(Ljava/lang/Exception;)V

    return-void
.end method
