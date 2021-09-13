.class public final synthetic Lcom/tv91/u/h/j/g;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/g/j/a;


# instance fields
.field public final synthetic a:Lcom/tv91/u/h/j/r;

.field public final synthetic b:Lcom/tv91/s/c;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/h/j/r;Lcom/tv91/s/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/h/j/g;->a:Lcom/tv91/u/h/j/r;

    iput-object p2, p0, Lcom/tv91/u/h/j/g;->b:Lcom/tv91/s/c;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/h/j/g;->a:Lcom/tv91/u/h/j/r;

    iget-object v1, p0, Lcom/tv91/u/h/j/g;->b:Lcom/tv91/s/c;

    check-cast p1, Lcom/tv91/s/c;

    invoke-virtual {v0, v1, p1}, Lcom/tv91/u/h/j/r;->s2(Lcom/tv91/s/c;Lcom/tv91/s/c;)V

    return-void
.end method
