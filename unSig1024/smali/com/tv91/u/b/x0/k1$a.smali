.class Lcom/tv91/u/b/x0/k1$a;
.super Ljava/lang/Object;
.source "LoadDownloadRecordUseCase.java"

# interfaces
.implements Lcom/tv91/u/b/x0/k1$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tv91/u/b/x0/k1;->E(Ljava/lang/Runnable;)Lcom/tv91/u/b/x0/k1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:Lcom/tv91/u/b/x0/k1;


# direct methods
.method constructor <init>(Lcom/tv91/u/b/x0/k1;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/b/x0/k1$a;->b:Lcom/tv91/u/b/x0/k1;

    iput-object p2, p0, Lcom/tv91/u/b/x0/k1$a;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lcom/tv91/s/c;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/u/b/x0/l1;->a(Lcom/tv91/u/b/x0/k1$e;Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic b(Lcom/tv91/model/a;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/u/b/x0/l1;->d(Lcom/tv91/u/b/x0/k1$e;Lcom/tv91/model/a;)V

    return-void
.end method

.method public synthetic c()V
    .locals 0

    invoke-static {p0}, Lcom/tv91/u/b/x0/l1;->b(Lcom/tv91/u/b/x0/k1$e;)V

    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/x0/k1$a;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
