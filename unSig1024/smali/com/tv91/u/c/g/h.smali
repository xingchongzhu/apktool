.class public final synthetic Lcom/tv91/u/c/g/h;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/g/j/a;


# instance fields
.field public final synthetic a:Lcom/tv91/u/c/g/s;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/c/g/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/c/g/h;->a:Lcom/tv91/u/c/g/s;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/tv91/u/c/g/h;->a:Lcom/tv91/u/c/g/s;

    check-cast p1, Lcom/tv91/model/Movie;

    invoke-virtual {v0, p1}, Lcom/tv91/u/c/g/s;->N2(Lcom/tv91/model/Movie;)V

    return-void
.end method