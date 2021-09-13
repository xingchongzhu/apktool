.class Lcom/tv91/u/b/v0$b;
.super Ljava/lang/Object;
.source "FileDownloadManager.java"

# interfaces
.implements Lcom/tv91/u/b/x0/m1$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/b/v0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/tv91/u/b/v0;


# direct methods
.method private constructor <init>(Lcom/tv91/u/b/v0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/b/v0$b;->a:Lcom/tv91/u/b/v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/u/b/v0;Lcom/tv91/u/b/v0$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tv91/u/b/v0$b;-><init>(Lcom/tv91/u/b/v0;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/tv91/s/c;)V
    .locals 0

    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/model/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tv91/model/a;

    .line 2
    iget-object v1, v0, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    sget-object v2, Lcom/tv91/model/a$a;->a:Lcom/tv91/model/a$a;

    if-eq v1, v2, :cond_1

    sget-object v2, Lcom/tv91/model/a$a;->c:Lcom/tv91/model/a$a;

    if-eq v1, v2, :cond_1

    sget-object v2, Lcom/tv91/model/a$a;->b:Lcom/tv91/model/a$a;

    if-eq v1, v2, :cond_1

    sget-object v2, Lcom/tv91/model/a$a;->h:Lcom/tv91/model/a$a;

    if-ne v1, v2, :cond_0

    .line 3
    :cond_1
    iget-object v1, v0, Lcom/tv91/model/a;->e:Ljava/lang/String;

    invoke-static {v1}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 4
    iget-object v1, v0, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-wide v1, v1, Lcom/tv91/model/Movie;->fileSize:J

    .line 5
    :try_start_0
    new-instance v3, Ljava/io/File;

    iget-object v0, v0, Lcom/tv91/model/a;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sub-long/2addr v1, v3

    .line 8
    :catch_0
    :cond_2
    iget-object v0, p0, Lcom/tv91/u/b/v0$b;->a:Lcom/tv91/u/b/v0;

    invoke-static {v0}, Lcom/tv91/u/b/v0;->c(Lcom/tv91/u/b/v0;)J

    move-result-wide v3

    sub-long/2addr v3, v1

    invoke-static {v0, v3, v4}, Lcom/tv91/u/b/v0;->d(Lcom/tv91/u/b/v0;J)J

    goto :goto_0

    :cond_3
    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/v0$b;->a:Lcom/tv91/u/b/v0;

    invoke-static {v0}, Lcom/tv91/u/b/v0;->b(Lcom/tv91/u/b/v0;)Lcom/tv91/u/b/x0/m1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tv91/q/b/d;->n(Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic d()V
    .locals 0

    invoke-static {p0}, Lcom/tv91/u/b/x0/n1;->c(Lcom/tv91/u/b/x0/m1$e;)V

    return-void
.end method
