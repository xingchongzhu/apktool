.class public final synthetic Lcom/tv91/u/c/f/h;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/g/j/a;


# instance fields
.field public final synthetic a:Lcom/tv91/u/c/f/y1;

.field public final synthetic b:Lcom/tv91/model/Movie;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/c/f/y1;Lcom/tv91/model/Movie;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/c/f/h;->a:Lcom/tv91/u/c/f/y1;

    iput-object p2, p0, Lcom/tv91/u/c/f/h;->b:Lcom/tv91/model/Movie;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/c/f/h;->a:Lcom/tv91/u/c/f/y1;

    iget-object v1, p0, Lcom/tv91/u/c/f/h;->b:Lcom/tv91/model/Movie;

    check-cast p1, Lcom/tv91/model/DownloadInfo;

    invoke-virtual {v0, v1, p1}, Lcom/tv91/u/c/f/y1;->K2(Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;)V

    return-void
.end method
