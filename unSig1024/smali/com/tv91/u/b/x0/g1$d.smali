.class Lcom/tv91/u/b/x0/g1$d;
.super Ljava/lang/Object;
.source "GetDownloadInfoUseCase.java"

# interfaces
.implements Lcom/tv91/u/b/x0/g1$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tv91/u/b/x0/g1;->C(Lb/g/j/a;)Lcom/tv91/u/b/x0/g1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/g/j/a;

.field final synthetic b:Lcom/tv91/u/b/x0/g1;


# direct methods
.method constructor <init>(Lcom/tv91/u/b/x0/g1;Lb/g/j/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/b/x0/g1$d;->b:Lcom/tv91/u/b/x0/g1;

    iput-object p2, p0, Lcom/tv91/u/b/x0/g1$d;->a:Lb/g/j/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/x0/g1$d;->a:Lb/g/j/a;

    invoke-interface {v0, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic b()V
    .locals 0

    invoke-static {p0}, Lcom/tv91/u/b/x0/h1;->b(Lcom/tv91/u/b/x0/g1$e;)V

    return-void
.end method

.method public synthetic c()V
    .locals 0

    invoke-static {p0}, Lcom/tv91/u/b/x0/h1;->c(Lcom/tv91/u/b/x0/g1$e;)V

    return-void
.end method

.method public synthetic d(Lcom/tv91/model/DownloadInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/u/b/x0/h1;->d(Lcom/tv91/u/b/x0/g1$e;Lcom/tv91/model/DownloadInfo;)V

    return-void
.end method