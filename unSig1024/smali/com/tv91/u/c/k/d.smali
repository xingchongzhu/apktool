.class public final synthetic Lcom/tv91/u/c/k/d;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/c/k/p;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/c/k/p;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/c/k/d;->a:Lcom/tv91/u/c/k/p;

    iput p2, p0, Lcom/tv91/u/c/k/d;->b:I

    iput p3, p0, Lcom/tv91/u/c/k/d;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/tv91/u/c/k/d;->a:Lcom/tv91/u/c/k/p;

    iget v1, p0, Lcom/tv91/u/c/k/d;->b:I

    iget v2, p0, Lcom/tv91/u/c/k/d;->c:I

    invoke-virtual {v0, v1, v2}, Lcom/tv91/u/c/k/p;->r(II)V

    return-void
.end method
