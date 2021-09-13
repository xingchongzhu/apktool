.class public final synthetic Lcom/tv91/u/f/f/d;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/f/f/h;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/f/f/h;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/f/f/d;->a:Lcom/tv91/u/f/f/h;

    iput p2, p0, Lcom/tv91/u/f/f/d;->b:I

    iput p3, p0, Lcom/tv91/u/f/f/d;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/tv91/u/f/f/d;->a:Lcom/tv91/u/f/f/h;

    iget v1, p0, Lcom/tv91/u/f/f/d;->b:I

    iget v2, p0, Lcom/tv91/u/f/f/d;->c:I

    invoke-virtual {v0, v1, v2}, Lcom/tv91/u/f/f/h;->r(II)V

    return-void
.end method
