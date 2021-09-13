.class final Lcom/tv91/k$b;
.super Ljava/lang/Object;
.source "DaggerApp_HiltComponents_SingletonC.java"

# interfaces
.implements Ld/a/b/d/b/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/tv91/k;


# direct methods
.method private constructor <init>(Lcom/tv91/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/k$b;->a:Lcom/tv91/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/k;Lcom/tv91/k$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tv91/k$b;-><init>(Lcom/tv91/k;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ld/a/b/c/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tv91/k$b;->b()Lcom/tv91/g;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/tv91/g;
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/k$c;

    iget-object v1, p0, Lcom/tv91/k$b;->a:Lcom/tv91/k;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/tv91/k$c;-><init>(Lcom/tv91/k;Lcom/tv91/k$a;)V

    return-object v0
.end method
