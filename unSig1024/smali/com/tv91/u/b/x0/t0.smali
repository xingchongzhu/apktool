.class public final synthetic Lcom/tv91/u/b/x0/t0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/b/x0/v1;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/b/x0/v1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/b/x0/t0;->a:Lcom/tv91/u/b/x0/v1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/tv91/u/b/x0/t0;->a:Lcom/tv91/u/b/x0/v1;

    invoke-static {v0}, Lcom/tv91/u/b/x0/v1;->t(Lcom/tv91/u/b/x0/v1;)V

    return-void
.end method
