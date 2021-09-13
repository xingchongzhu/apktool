.class public final synthetic Lcom/tv91/u/b/l;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/b/q0;

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/b/q0;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/b/l;->a:Lcom/tv91/u/b/q0;

    iput-object p2, p0, Lcom/tv91/u/b/l;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/b/l;->a:Lcom/tv91/u/b/q0;

    iget-object v1, p0, Lcom/tv91/u/b/l;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/tv91/u/b/q0;->R2(Ljava/util/List;)V

    return-void
.end method
