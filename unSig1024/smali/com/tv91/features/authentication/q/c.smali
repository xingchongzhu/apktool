.class public final synthetic Lcom/tv91/features/authentication/q/c;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/features/authentication/q/x;

.field public final synthetic b:Ljava/lang/CharSequence;

.field public final synthetic c:Ljava/lang/CharSequence;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/features/authentication/q/x;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/features/authentication/q/c;->a:Lcom/tv91/features/authentication/q/x;

    iput-object p2, p0, Lcom/tv91/features/authentication/q/c;->b:Ljava/lang/CharSequence;

    iput-object p3, p0, Lcom/tv91/features/authentication/q/c;->c:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/tv91/features/authentication/q/c;->a:Lcom/tv91/features/authentication/q/x;

    iget-object v1, p0, Lcom/tv91/features/authentication/q/c;->b:Ljava/lang/CharSequence;

    iget-object v2, p0, Lcom/tv91/features/authentication/q/c;->c:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Lcom/tv91/features/authentication/q/x;->r(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    return-void
.end method
