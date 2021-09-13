.class public final synthetic Lcom/tv91/u/e/g/r;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/g/j/a;


# instance fields
.field public final synthetic a:Lcom/tv91/u/e/g/x;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/e/g/x;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/e/g/r;->a:Lcom/tv91/u/e/g/x;

    iput p2, p0, Lcom/tv91/u/e/g/r;->b:I

    iput p3, p0, Lcom/tv91/u/e/g/r;->c:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/tv91/u/e/g/r;->a:Lcom/tv91/u/e/g/x;

    iget v1, p0, Lcom/tv91/u/e/g/r;->b:I

    iget v2, p0, Lcom/tv91/u/e/g/r;->c:I

    check-cast p1, Lc/a/c/j/b;

    invoke-virtual {v0, v1, v2, p1}, Lcom/tv91/u/e/g/x;->v2(IILc/a/c/j/b;)V

    return-void
.end method
