.class public final synthetic Lcom/tv91/features/authentication/n/e0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/features/authentication/n/l0;

.field public final synthetic b:Lb/g/j/a;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/features/authentication/n/l0;Lb/g/j/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/features/authentication/n/e0;->a:Lcom/tv91/features/authentication/n/l0;

    iput-object p2, p0, Lcom/tv91/features/authentication/n/e0;->b:Lb/g/j/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/tv91/features/authentication/n/e0;->a:Lcom/tv91/features/authentication/n/l0;

    iget-object v1, p0, Lcom/tv91/features/authentication/n/e0;->b:Lb/g/j/a;

    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/n/l0;->u2(Lb/g/j/a;)V

    return-void
.end method
