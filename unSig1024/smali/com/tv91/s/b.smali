.class public final Lcom/tv91/s/b;
.super Ljava/io/IOException;
.source "DownloadException.java"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/tv91/model/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/tv91/model/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/tv91/s/b;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/tv91/s/b;->b:Lcom/tv91/model/a;

    return-void
.end method


# virtual methods
.method public getLocalizedMessage()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    iget-object v1, p0, Lcom/tv91/s/b;->a:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/tv91/s/b;->b:Lcom/tv91/model/a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "Download failed: \nCode: %s\nRecord: %s"

    invoke-static {v1, v0}, Lcom/tv91/utils/g;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
