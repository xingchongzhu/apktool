.class public final synthetic Lcom/tv91/u/e/j/a;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/e/j/k;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/e/j/k;Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/e/j/a;->a:Lcom/tv91/u/e/j/k;

    iput-object p2, p0, Lcom/tv91/u/e/j/a;->b:Ljava/lang/String;

    iput p3, p0, Lcom/tv91/u/e/j/a;->c:I

    iput p4, p0, Lcom/tv91/u/e/j/a;->d:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/tv91/u/e/j/a;->a:Lcom/tv91/u/e/j/k;

    iget-object v1, p0, Lcom/tv91/u/e/j/a;->b:Ljava/lang/String;

    iget v2, p0, Lcom/tv91/u/e/j/a;->c:I

    iget v3, p0, Lcom/tv91/u/e/j/a;->d:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/tv91/u/e/j/k;->r(Ljava/lang/String;II)V

    return-void
.end method
