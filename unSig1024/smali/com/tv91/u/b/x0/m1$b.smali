.class Lcom/tv91/u/b/x0/m1$b;
.super Ljava/lang/Object;
.source "LoadDownloadRecordsUseCase.java"

# interfaces
.implements Lcom/tv91/u/b/x0/m1$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tv91/u/b/x0/m1;->D(Ljava/lang/Runnable;)Lcom/tv91/u/b/x0/m1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:Lcom/tv91/u/b/x0/m1;


# direct methods
.method constructor <init>(Lcom/tv91/u/b/x0/m1;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/b/x0/m1$b;->b:Lcom/tv91/u/b/x0/m1;

    iput-object p2, p0, Lcom/tv91/u/b/x0/m1$b;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lcom/tv91/s/c;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/u/b/x0/n1;->a(Lcom/tv91/u/b/x0/m1$e;Lcom/tv91/s/c;)V

    return-void
.end method

.method public synthetic b(Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/u/b/x0/n1;->d(Lcom/tv91/u/b/x0/m1$e;Ljava/util/List;)V

    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/x0/m1$b;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public synthetic d()V
    .locals 0

    invoke-static {p0}, Lcom/tv91/u/b/x0/n1;->c(Lcom/tv91/u/b/x0/m1$e;)V

    return-void
.end method
