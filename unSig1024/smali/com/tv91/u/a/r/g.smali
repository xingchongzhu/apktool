.class public final synthetic Lcom/tv91/u/a/r/g;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/a/r/l;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/a/r/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/a/r/g;->a:Lcom/tv91/u/a/r/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/tv91/u/a/r/g;->a:Lcom/tv91/u/a/r/l;

    invoke-virtual {v0}, Lcom/tv91/u/a/r/l;->r()V

    return-void
.end method
