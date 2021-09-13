.class public final synthetic Lcom/tv91/u/c/h/m;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/c/h/u;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/c/h/u;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/c/h/m;->a:Lcom/tv91/u/c/h/u;

    iput p2, p0, Lcom/tv91/u/c/h/m;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/c/h/m;->a:Lcom/tv91/u/c/h/u;

    iget v1, p0, Lcom/tv91/u/c/h/m;->b:I

    invoke-virtual {v0, v1}, Lcom/tv91/u/c/h/u;->s2(I)V

    return-void
.end method
