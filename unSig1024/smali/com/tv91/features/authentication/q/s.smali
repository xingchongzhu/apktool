.class public final synthetic Lcom/tv91/features/authentication/q/s;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/features/authentication/q/f0;

.field public final synthetic b:Lcom/tv91/features/authentication/q/f0$a;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/features/authentication/q/f0;Lcom/tv91/features/authentication/q/f0$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/features/authentication/q/s;->a:Lcom/tv91/features/authentication/q/f0;

    iput-object p2, p0, Lcom/tv91/features/authentication/q/s;->b:Lcom/tv91/features/authentication/q/f0$a;

    iput-object p3, p0, Lcom/tv91/features/authentication/q/s;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/tv91/features/authentication/q/s;->a:Lcom/tv91/features/authentication/q/f0;

    iget-object v1, p0, Lcom/tv91/features/authentication/q/s;->b:Lcom/tv91/features/authentication/q/f0$a;

    iget-object v2, p0, Lcom/tv91/features/authentication/q/s;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/tv91/features/authentication/q/f0;->r(Lcom/tv91/features/authentication/q/f0$a;Ljava/lang/String;)V

    return-void
.end method
