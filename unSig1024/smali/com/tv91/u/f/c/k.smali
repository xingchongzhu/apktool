.class public final synthetic Lcom/tv91/u/f/c/k;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/g/j/a;


# instance fields
.field public final synthetic a:Lcom/tv91/u/f/c/q;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/f/c/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/f/c/k;->a:Lcom/tv91/u/f/c/q;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/tv91/u/f/c/k;->a:Lcom/tv91/u/f/c/q;

    check-cast p1, Lcom/tv91/model/Feedback;

    invoke-virtual {v0, p1}, Lcom/tv91/u/f/c/q;->J2(Lcom/tv91/model/Feedback;)V

    return-void
.end method
