.class public final synthetic Lcom/tv91/features/authentication/q/n;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/features/authentication/q/c0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/features/authentication/q/c0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/features/authentication/q/n;->a:Lcom/tv91/features/authentication/q/c0;

    iput-object p2, p0, Lcom/tv91/features/authentication/q/n;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/tv91/features/authentication/q/n;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/tv91/features/authentication/q/n;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/tv91/features/authentication/q/n;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/tv91/features/authentication/q/n;->a:Lcom/tv91/features/authentication/q/c0;

    iget-object v1, p0, Lcom/tv91/features/authentication/q/n;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/tv91/features/authentication/q/n;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/tv91/features/authentication/q/n;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/tv91/features/authentication/q/n;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/tv91/features/authentication/q/c0;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
