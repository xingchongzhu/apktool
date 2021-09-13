.class public final synthetic Lcom/tv91/u/c/h/f;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/g/j/a;


# instance fields
.field public final synthetic a:Lcom/tv91/u/c/h/r;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/c/h/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/c/h/f;->a:Lcom/tv91/u/c/h/r;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/tv91/u/c/h/f;->a:Lcom/tv91/u/c/h/r;

    check-cast p1, Lcom/tv91/model/Highlight;

    invoke-static {v0, p1}, Lcom/tv91/u/c/h/r;->r2(Lcom/tv91/u/c/h/r;Lcom/tv91/model/Highlight;)V

    return-void
.end method
