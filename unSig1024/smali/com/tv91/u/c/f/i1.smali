.class public final synthetic Lcom/tv91/u/c/f/i1;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/g/j/a;


# instance fields
.field public final synthetic a:Lcom/tv91/u/c/f/y1;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/c/f/y1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/c/f/i1;->a:Lcom/tv91/u/c/f/y1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/tv91/u/c/f/i1;->a:Lcom/tv91/u/c/f/y1;

    check-cast p1, Lcom/tv91/model/Movie;

    invoke-static {v0, p1}, Lcom/tv91/u/c/f/y1;->E4(Lcom/tv91/u/c/f/y1;Lcom/tv91/model/Movie;)V

    return-void
.end method
