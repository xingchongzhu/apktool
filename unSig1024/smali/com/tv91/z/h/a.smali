.class public final Lcom/tv91/z/h/a;
.super Ljava/lang/Object;
.source "WebDownloadApi.java"

# interfaces
.implements Lcom/tv91/z/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/z/h/a$b;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Le/w;

.field private final c:Ljava/lang/Object;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/tv91/z/c$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Le/w;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/tv91/z/h/a;->c:Ljava/lang/Object;

    .line 3
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/tv91/z/h/a;->d:Ljava/util/Map;

    .line 4
    iput-object p1, p0, Lcom/tv91/z/h/a;->a:Landroid/content/Context;

    .line 5
    iput-object p2, p0, Lcom/tv91/z/h/a;->b:Le/w;

    return-void
.end method

.method static synthetic h(Lcom/tv91/z/h/a;Ljava/lang/String;)Lcom/tv91/z/c$a;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/z/h/a;->j(Ljava/lang/String;)Lcom/tv91/z/c$a;

    move-result-object p0

    return-object p0
.end method

.method private i(Le/t;Lcom/tv91/model/User;)Le/t;
    .locals 2

    .line 1
    invoke-virtual {p1}, Le/t;->p()Le/t$a;

    move-result-object p1

    iget-object v0, p2, Lcom/tv91/model/User;->id:Ljava/lang/String;

    const-string v1, "MemberId"

    .line 2
    invoke-virtual {p1, v1, v0}, Le/t$a;->a(Ljava/lang/String;Ljava/lang/String;)Le/t$a;

    move-result-object p1

    iget-object p2, p2, Lcom/tv91/model/User;->token:Ljava/lang/String;

    const-string v0, "Token"

    .line 3
    invoke-virtual {p1, v0, p2}, Le/t$a;->a(Ljava/lang/String;Ljava/lang/String;)Le/t$a;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Le/t$a;->b()Le/t;

    move-result-object p1

    return-object p1
.end method

.method private j(Ljava/lang/String;)Lcom/tv91/z/c$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/z/h/a;->c:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/tv91/z/h/a;->d:Ljava/util/Map;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    .line 3
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/z/c$a;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private k(Le/t;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/z/h/a;->b:Le/w;

    invoke-virtual {v0}, Le/w;->h()Le/n;

    move-result-object v0

    invoke-virtual {v0}, Le/n;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/e;

    .line 2
    invoke-interface {v1}, Le/e;->S()Le/z;

    move-result-object v1

    invoke-virtual {v1}, Le/z;->i()Le/t;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/tv91/z/h/a;->m(Le/t;)Le/t;

    move-result-object v1

    .line 3
    invoke-virtual {v1, p1}, Le/t;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private l(Le/t;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/z/h/a;->b:Le/w;

    invoke-virtual {v0}, Le/w;->h()Le/n;

    move-result-object v0

    invoke-virtual {v0}, Le/n;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/e;

    .line 2
    invoke-interface {v1}, Le/e;->S()Le/z;

    move-result-object v1

    invoke-virtual {v1}, Le/z;->i()Le/t;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/tv91/z/h/a;->m(Le/t;)Le/t;

    move-result-object v1

    .line 3
    invoke-virtual {v1, p1}, Le/t;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private m(Le/t;)Le/t;
    .locals 1

    .line 1
    invoke-virtual {p1}, Le/t;->p()Le/t$a;

    move-result-object p1

    const-string v0, "MemberId"

    .line 2
    invoke-virtual {p1, v0}, Le/t$a;->r(Ljava/lang/String;)Le/t$a;

    move-result-object p1

    const-string v0, "Token"

    .line 3
    invoke-virtual {p1, v0}, Le/t$a;->r(Ljava/lang/String;)Le/t$a;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Le/t$a;->b()Le/t;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(Lcom/tv91/model/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/z/h/a;->c:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/tv91/z/h/a;->d:Ljava/util/Map;

    iget-object p1, p1, Lcom/tv91/model/a;->d:Lcom/tv91/model/DownloadInfo;

    iget-object p1, p1, Lcom/tv91/model/DownloadInfo;->url:Ljava/lang/String;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b(Lcom/tv91/model/a;Ljava/io/FileDescriptor;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    new-instance p3, Ljava/io/File;

    iget-object p1, p1, Lcom/tv91/model/a;->e:Ljava/lang/String;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p3}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    new-instance p1, Ljava/io/FileInputStream;

    invoke-direct {p1, p3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V

    invoke-static {p1, v0}, Lcom/tv91/utils/c;->a(Ljava/io/FileInputStream;Ljava/io/FileOutputStream;)V

    .line 4
    invoke-virtual {p3}, Ljava/io/File;->delete()Z

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Source file doesn\'t exist"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(Lcom/tv91/model/a;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/tv91/z/h/a;->b:Le/w;

    invoke-virtual {v0}, Le/w;->h()Le/n;

    move-result-object v0

    invoke-virtual {v0}, Le/n;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/e;

    .line 2
    iget-object v2, p1, Lcom/tv91/model/a;->d:Lcom/tv91/model/DownloadInfo;

    iget-object v2, v2, Lcom/tv91/model/DownloadInfo;->url:Ljava/lang/String;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Le/t;->r(Ljava/lang/String;)Le/t;

    move-result-object v2

    .line 3
    invoke-interface {v1}, Le/e;->S()Le/z;

    move-result-object v3

    invoke-virtual {v3}, Le/z;->i()Le/t;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/tv91/z/h/a;->m(Le/t;)Le/t;

    move-result-object v3

    .line 4
    invoke-virtual {v3, v2}, Le/t;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    invoke-interface {v1}, Le/e;->cancel()V

    .line 6
    :cond_1
    iget-object v0, p1, Lcom/tv91/model/a;->e:Ljava/lang/String;

    invoke-static {v0}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 7
    iget-object v0, p1, Lcom/tv91/model/a;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v2, "file"

    invoke-static {v2, v1}, Lcom/tv91/utils/g;->b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const-string v4, "Fail to delete file: %s"

    if-eqz v1, :cond_2

    .line 9
    new-instance v1, Ljava/io/File;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result v1

    if-nez v1, :cond_2

    new-array v1, v3, [Ljava/lang/Object;

    .line 11
    iget-object v5, p1, Lcom/tv91/model/a;->e:Ljava/lang/String;

    aput-object v5, v1, v2

    invoke-static {v4, v1}, Lh/a/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 12
    :cond_2
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v5, "content"

    invoke-static {v5, v1}, Lcom/tv91/utils/g;->b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 13
    iget-object v1, p0, Lcom/tv91/z/h/a;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const/4 v5, 0x0

    invoke-virtual {v1, v0, v5, v5}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    if-gtz v0, :cond_3

    new-array v0, v3, [Ljava/lang/Object;

    .line 14
    iget-object p1, p1, Lcom/tv91/model/a;->e:Ljava/lang/String;

    aput-object p1, v0, v2

    invoke-static {v4, v0}, Lh/a/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public d(Lcom/tv91/model/a;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tv91/z/h/a;->b:Le/w;

    invoke-virtual {v0}, Le/w;->h()Le/n;

    move-result-object v0

    invoke-virtual {v0}, Le/n;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/e;

    .line 2
    iget-object v2, p1, Lcom/tv91/model/a;->d:Lcom/tv91/model/DownloadInfo;

    iget-object v2, v2, Lcom/tv91/model/DownloadInfo;->url:Ljava/lang/String;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Le/t;->r(Ljava/lang/String;)Le/t;

    move-result-object v2

    .line 3
    invoke-interface {v1}, Le/e;->S()Le/z;

    move-result-object v3

    invoke-virtual {v3}, Le/z;->i()Le/t;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/tv91/z/h/a;->m(Le/t;)Le/t;

    move-result-object v3

    .line 4
    invoke-virtual {v3, v2}, Le/t;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    invoke-interface {v1}, Le/e;->cancel()V

    :cond_1
    return-void
.end method

.method public e(Lcom/tv91/model/a;Lcom/tv91/z/c$a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/z/h/a;->c:Ljava/lang/Object;

    monitor-enter v0

    if-eqz p2, :cond_0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/tv91/z/h/a;->d:Ljava/util/Map;

    iget-object p1, p1, Lcom/tv91/model/a;->d:Lcom/tv91/model/DownloadInfo;

    iget-object p1, p1, Lcom/tv91/model/DownloadInfo;->url:Ljava/lang/String;

    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public f(Lcom/tv91/model/a;Lb/g/j/a;Lb/g/j/a;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tv91/model/a;",
            "Lb/g/j/a<",
            "Ljava/io/File;",
            ">;",
            "Lb/g/j/a<",
            "Ljava/lang/Exception;",
            ">;)V"
        }
    .end annotation

    move-object v11, p0

    move-object v3, p1

    move-object/from16 v2, p3

    .line 1
    iget-object v0, v3, Lcom/tv91/model/a;->e:Ljava/lang/String;

    invoke-static {v0}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "file path is empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-interface {v2, v0}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, v3, Lcom/tv91/model/a;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 4
    new-instance v7, Ljava/io/File;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 5
    iget-object v0, v3, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-wide v8, v0, Lcom/tv91/model/Movie;->fileSize:J

    .line 6
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v7}, Ljava/io/File;->length()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    :goto_0
    move-wide v5, v0

    const-string v0, "Download-Corrupt"

    cmp-long v1, v5, v8

    if-lez v1, :cond_2

    .line 7
    new-instance v1, Lcom/tv91/s/b;

    invoke-direct {v1, v0, p1}, Lcom/tv91/s/b;-><init>(Ljava/lang/String;Lcom/tv91/model/a;)V

    invoke-interface {v2, v1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void

    :cond_2
    cmp-long v1, v5, v8

    if-nez v1, :cond_3

    move-object/from16 v10, p2

    .line 8
    invoke-interface {v10, v7}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void

    :cond_3
    move-object/from16 v10, p2

    .line 9
    iget-object v1, v3, Lcom/tv91/model/a;->d:Lcom/tv91/model/DownloadInfo;

    iget-object v1, v1, Lcom/tv91/model/DownloadInfo;->url:Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    .line 10
    invoke-static {v4}, Le/t;->l(Ljava/lang/String;)Le/t;

    move-result-object v1

    iget-object v12, v3, Lcom/tv91/model/a;->b:Lcom/tv91/model/User;

    invoke-direct {p0, v1, v12}, Lcom/tv91/z/h/a;->i(Le/t;Lcom/tv91/model/User;)Le/t;

    move-result-object v1

    .line 11
    invoke-direct {p0, v1}, Lcom/tv91/z/h/a;->l(Le/t;)Z

    move-result v12

    if-nez v12, :cond_5

    invoke-direct {p0, v1}, Lcom/tv91/z/h/a;->k(Le/t;)Z

    move-result v12

    if-eqz v12, :cond_4

    goto :goto_1

    .line 12
    :cond_4
    new-instance v0, Le/z$a;

    invoke-direct {v0}, Le/z$a;-><init>()V

    invoke-virtual {v0}, Le/z$a;->c()Le/z$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Le/z$a;->l(Le/t;)Le/z$a;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "bytes="

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v12, "-"

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v12, "Range"

    .line 13
    invoke-virtual {v0, v12, v1}, Le/z$a;->a(Ljava/lang/String;Ljava/lang/String;)Le/z$a;

    move-result-object v0

    .line 14
    invoke-virtual {v0}, Le/z$a;->b()Le/z;

    move-result-object v0

    .line 15
    iget-object v1, v11, Lcom/tv91/z/h/a;->b:Le/w;

    invoke-virtual {v1, v0}, Le/w;->q(Le/z;)Le/e;

    move-result-object v12

    new-instance v13, Lcom/tv91/z/h/a$a;

    move-object v0, v13

    move-object v1, p0

    move-object/from16 v2, p3

    move-object v3, p1

    move-object/from16 v10, p2

    invoke-direct/range {v0 .. v10}, Lcom/tv91/z/h/a$a;-><init>(Lcom/tv91/z/h/a;Lb/g/j/a;Lcom/tv91/model/a;Ljava/lang/String;JLjava/io/File;JLb/g/j/a;)V

    invoke-interface {v12, v13}, Le/e;->T(Le/f;)V

    return-void

    .line 16
    :cond_5
    :goto_1
    new-instance v1, Lcom/tv91/s/b;

    invoke-direct {v1, v0, p1}, Lcom/tv91/s/b;-><init>(Ljava/lang/String;Lcom/tv91/model/a;)V

    invoke-interface {v2, v1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public g(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Fail to delete file. No Access right?"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_1
    :goto_0
    new-instance v0, Le/z$a;

    invoke-direct {v0}, Le/z$a;-><init>()V

    invoke-virtual {v0, p1}, Le/z$a;->k(Ljava/lang/String;)Le/z$a;

    move-result-object p1

    invoke-virtual {p1}, Le/z$a;->c()Le/z$a;

    move-result-object p1

    invoke-virtual {p1}, Le/z$a;->b()Le/z;

    move-result-object p1

    .line 4
    iget-object v0, p0, Lcom/tv91/z/h/a;->b:Le/w;

    invoke-virtual {v0, p1}, Le/w;->q(Le/z;)Le/e;

    move-result-object p1

    invoke-interface {p1}, Le/e;->U()Le/b0;

    move-result-object p1

    .line 5
    :try_start_0
    invoke-virtual {p1}, Le/b0;->I()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 6
    invoke-virtual {p1}, Le/b0;->B()Le/c0;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 7
    invoke-virtual {v0}, Le/c0;->H()Lf/e;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 8
    :try_start_1
    invoke-static {p2}, Lf/l;->e(Ljava/io/File;)Lf/r;

    move-result-object v1

    invoke-static {v1}, Lf/l;->b(Lf/r;)Lf/d;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 9
    :goto_1
    :try_start_2
    invoke-interface {v1}, Lf/d;->c()Lf/c;

    move-result-object v2

    const-wide/16 v3, 0x2000

    invoke-interface {v0, v2, v3, v4}, Lf/s;->t(Lf/c;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v6, v2, v4

    if-eqz v6, :cond_2

    .line 10
    invoke-interface {v1}, Lf/d;->h()Lf/d;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 11
    :cond_2
    :try_start_3
    invoke-interface {v1}, Lf/r;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :try_start_4
    invoke-interface {v0}, Lf/s;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 12
    invoke-virtual {p1}, Le/b0;->close()V

    return-object p2

    :catchall_0
    move-exception p2

    .line 13
    :try_start_5
    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v2

    if-eqz v1, :cond_3

    .line 14
    :try_start_6
    invoke-interface {v1}, Lf/r;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v1

    :try_start_7
    invoke-virtual {p2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_2
    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catchall_3
    move-exception p2

    .line 15
    :try_start_8
    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :catchall_4
    move-exception v1

    if-eqz v0, :cond_4

    .line 16
    :try_start_9
    invoke-interface {v0}, Lf/s;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    goto :goto_3

    :catchall_5
    move-exception v0

    :try_start_a
    invoke-virtual {p2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_3
    throw v1

    .line 17
    :cond_5
    new-instance p2, Ljava/io/IOException;

    const-string v0, "response body is null"

    invoke-direct {p2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 18
    :cond_6
    new-instance p2, Lcom/tv91/s/g;

    invoke-virtual {p1}, Le/b0;->D()I

    move-result v0

    invoke-virtual {p1}, Le/b0;->J()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v0, v1}, Lcom/tv91/s/g;-><init>(ILjava/lang/String;)V

    throw p2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    :catchall_6
    move-exception p2

    .line 19
    :try_start_b
    throw p2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    :catchall_7
    move-exception v0

    if-eqz p1, :cond_7

    .line 20
    :try_start_c
    invoke-virtual {p1}, Le/b0;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    goto :goto_4

    :catchall_8
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_7
    :goto_4
    goto :goto_6

    :goto_5
    throw v0

    :goto_6
    goto :goto_5
.end method
