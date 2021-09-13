.class public final synthetic Lcom/tv91/u/h/j/c;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/g/j/a;


# instance fields
.field public final synthetic a:Lcom/tv91/u/h/j/r;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/h/j/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/h/j/c;->a:Lcom/tv91/u/h/j/r;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/tv91/u/h/j/c;->a:Lcom/tv91/u/h/j/r;

    check-cast p1, Ljava/util/List;

    invoke-virtual {v0, p1}, Lcom/tv91/u/h/j/r;->C2(Ljava/util/List;)V

    return-void
.end method
