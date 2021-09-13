.class public final synthetic Lcom/tv91/u/h/h/l;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/g/j/a;


# instance fields
.field public final synthetic a:Lcom/tv91/u/h/h/r;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/h/h/r;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/h/h/l;->a:Lcom/tv91/u/h/h/r;

    iput p2, p0, Lcom/tv91/u/h/h/l;->b:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/h/h/l;->a:Lcom/tv91/u/h/h/r;

    iget v1, p0, Lcom/tv91/u/h/h/l;->b:I

    check-cast p1, Lcom/tv91/model/Paging;

    invoke-virtual {v0, v1, p1}, Lcom/tv91/u/h/h/r;->G2(ILcom/tv91/model/Paging;)V

    return-void
.end method
