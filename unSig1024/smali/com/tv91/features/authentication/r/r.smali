.class public final synthetic Lcom/tv91/features/authentication/r/r;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/features/authentication/r/z;

.field public final synthetic b:Lb/g/j/a;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/features/authentication/r/z;Lb/g/j/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/features/authentication/r/r;->a:Lcom/tv91/features/authentication/r/z;

    iput-object p2, p0, Lcom/tv91/features/authentication/r/r;->b:Lb/g/j/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/tv91/features/authentication/r/r;->a:Lcom/tv91/features/authentication/r/z;

    iget-object v1, p0, Lcom/tv91/features/authentication/r/r;->b:Lb/g/j/a;

    invoke-virtual {v0, v1}, Lcom/tv91/features/authentication/r/z;->v2(Lb/g/j/a;)V

    return-void
.end method
