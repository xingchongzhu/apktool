.class public final synthetic Lcom/tv91/u/c/k/l;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/c/k/t;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Lcom/tv91/u/c/k/t$a;

.field public final synthetic e:[I

.field public final synthetic f:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/c/k/t;IILcom/tv91/u/c/k/t$a;[ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/c/k/l;->a:Lcom/tv91/u/c/k/t;

    iput p2, p0, Lcom/tv91/u/c/k/l;->b:I

    iput p3, p0, Lcom/tv91/u/c/k/l;->c:I

    iput-object p4, p0, Lcom/tv91/u/c/k/l;->d:Lcom/tv91/u/c/k/t$a;

    iput-object p5, p0, Lcom/tv91/u/c/k/l;->e:[I

    iput-object p6, p0, Lcom/tv91/u/c/k/l;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/tv91/u/c/k/l;->a:Lcom/tv91/u/c/k/t;

    iget v1, p0, Lcom/tv91/u/c/k/l;->b:I

    iget v2, p0, Lcom/tv91/u/c/k/l;->c:I

    iget-object v3, p0, Lcom/tv91/u/c/k/l;->d:Lcom/tv91/u/c/k/t$a;

    iget-object v4, p0, Lcom/tv91/u/c/k/l;->e:[I

    iget-object v5, p0, Lcom/tv91/u/c/k/l;->f:Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Lcom/tv91/u/c/k/t;->v(IILcom/tv91/u/c/k/t$a;[ILjava/lang/String;)V

    return-void
.end method
