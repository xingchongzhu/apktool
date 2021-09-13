.class public final synthetic Lcom/tv91/u/g/h;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/g/j/a;


# instance fields
.field public final synthetic a:Lcom/tv91/u/g/a0;

.field public final synthetic b:Lcom/tv91/s/c;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/g/a0;Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/g/h;->a:Lcom/tv91/u/g/a0;

    iput-object p2, p0, Lcom/tv91/u/g/h;->b:Lcom/tv91/s/c;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/g/h;->a:Lcom/tv91/u/g/a0;

    iget-object v1, p0, Lcom/tv91/u/g/h;->b:Lcom/tv91/s/c;

    check-cast p1, Lcom/tv91/s/c;

    invoke-virtual {v0, v1, p1}, Lcom/tv91/u/g/a0;->W2(Lcom/tv91/s/c;Lcom/tv91/s/c;)V

    return-void
.end method
