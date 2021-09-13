.class public final synthetic Lcom/tv91/u/b/x0/b;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/b/x0/f1;

.field public final synthetic b:Lcom/tv91/model/Movie;

.field public final synthetic c:Lcom/tv91/model/DownloadInfo;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/b/x0/f1;Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/b/x0/b;->a:Lcom/tv91/u/b/x0/f1;

    iput-object p2, p0, Lcom/tv91/u/b/x0/b;->b:Lcom/tv91/model/Movie;

    iput-object p3, p0, Lcom/tv91/u/b/x0/b;->c:Lcom/tv91/model/DownloadInfo;

    iput-object p4, p0, Lcom/tv91/u/b/x0/b;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/tv91/u/b/x0/b;->a:Lcom/tv91/u/b/x0/f1;

    iget-object v1, p0, Lcom/tv91/u/b/x0/b;->b:Lcom/tv91/model/Movie;

    iget-object v2, p0, Lcom/tv91/u/b/x0/b;->c:Lcom/tv91/model/DownloadInfo;

    iget-object v3, p0, Lcom/tv91/u/b/x0/b;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/tv91/u/b/x0/f1;->s(Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;Ljava/lang/String;)V

    return-void
.end method
