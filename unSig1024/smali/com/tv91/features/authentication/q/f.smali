.class public final synthetic Lcom/tv91/features/authentication/q/f;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/features/authentication/q/y;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/features/authentication/q/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/features/authentication/q/f;->a:Lcom/tv91/features/authentication/q/y;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/tv91/features/authentication/q/f;->a:Lcom/tv91/features/authentication/q/y;

    invoke-virtual {v0}, Lcom/tv91/features/authentication/q/y;->r()V

    return-void
.end method
