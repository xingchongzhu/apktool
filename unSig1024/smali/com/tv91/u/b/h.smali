.class public final synthetic Lcom/tv91/u/b/h;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/g/j/i;


# instance fields
.field public final synthetic a:Lcom/tv91/u/b/p0;

.field public final synthetic b:Lcom/tv91/u/b/p0$b;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/b/p0;Lcom/tv91/u/b/p0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/b/h;->a:Lcom/tv91/u/b/p0;

    iput-object p2, p0, Lcom/tv91/u/b/h;->b:Lcom/tv91/u/b/p0$b;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/b/h;->a:Lcom/tv91/u/b/p0;

    iget-object v1, p0, Lcom/tv91/u/b/h;->b:Lcom/tv91/u/b/p0$b;

    invoke-virtual {v0, v1}, Lcom/tv91/u/b/p0;->Q(Lcom/tv91/u/b/p0$b;)Lcom/tv91/model/a;

    move-result-object v0

    return-object v0
.end method
