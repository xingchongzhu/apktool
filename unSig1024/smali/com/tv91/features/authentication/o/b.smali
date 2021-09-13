.class public final synthetic Lcom/tv91/features/authentication/o/b;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/features/authentication/o/n;

.field public final synthetic b:Lcom/tv91/features/authentication/i;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/features/authentication/o/n;Lcom/tv91/features/authentication/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/features/authentication/o/b;->a:Lcom/tv91/features/authentication/o/n;

    iput-object p2, p0, Lcom/tv91/features/authentication/o/b;->b:Lcom/tv91/features/authentication/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/tv91/features/authentication/o/b;->a:Lcom/tv91/features/authentication/o/n;

    iget-object v1, p0, Lcom/tv91/features/authentication/o/b;->b:Lcom/tv91/features/authentication/i;

    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/o/n;->D2(Lcom/tv91/features/authentication/i;)V

    return-void
.end method
