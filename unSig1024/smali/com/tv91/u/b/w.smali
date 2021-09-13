.class public final synthetic Lcom/tv91/u/b/w;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/g/j/a;


# instance fields
.field public final synthetic a:Lcom/tv91/u/b/q0;

.field public final synthetic b:Lcom/tv91/u/b/t0;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/b/q0;Lcom/tv91/u/b/t0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/b/w;->a:Lcom/tv91/u/b/q0;

    iput-object p2, p0, Lcom/tv91/u/b/w;->b:Lcom/tv91/u/b/t0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/b/w;->a:Lcom/tv91/u/b/q0;

    iget-object v1, p0, Lcom/tv91/u/b/w;->b:Lcom/tv91/u/b/t0;

    check-cast p1, Lcom/tv91/s/c;

    invoke-virtual {v0, v1, p1}, Lcom/tv91/u/b/q0;->W2(Lcom/tv91/u/b/t0;Lcom/tv91/s/c;)V

    return-void
.end method
