.class public final synthetic Lcom/tv91/u/b/x0/m;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/b/x0/i1;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/b/x0/i1;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/b/x0/m;->a:Lcom/tv91/u/b/x0/i1;

    iput-object p2, p0, Lcom/tv91/u/b/x0/m;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/b/x0/m;->a:Lcom/tv91/u/b/x0/i1;

    iget-object v1, p0, Lcom/tv91/u/b/x0/m;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/tv91/u/b/x0/i1;->v(Ljava/lang/String;)V

    return-void
.end method
