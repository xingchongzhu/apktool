.class public final synthetic Lcom/tv91/u/a/n/e;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/g/j/a;


# instance fields
.field public final synthetic a:Lcom/tv91/u/a/n/o;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/a/n/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/a/n/e;->a:Lcom/tv91/u/a/n/o;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/tv91/u/a/n/e;->a:Lcom/tv91/u/a/n/o;

    check-cast p1, Lcom/tv91/model/Category;

    invoke-virtual {v0, p1}, Lcom/tv91/u/a/n/o;->L2(Lcom/tv91/model/Category;)V

    return-void
.end method
