.class Lcom/tv91/z/h/a$a;
.super Ljava/lang/Object;
.source "WebDownloadApi.java"

# interfaces
.implements Le/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tv91/z/h/a;->f(Lcom/tv91/model/a;Lb/g/j/a;Lb/g/j/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/g/j/a;

.field final synthetic b:Lcom/tv91/model/a;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:J

.field final synthetic e:Ljava/io/File;

.field final synthetic f:J

.field final synthetic g:Lb/g/j/a;

.field final synthetic h:Lcom/tv91/z/h/a;


# direct methods
.method constructor <init>(Lcom/tv91/z/h/a;Lb/g/j/a;Lcom/tv91/model/a;Ljava/lang/String;JLjava/io/File;JLb/g/j/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/z/h/a$a;->h:Lcom/tv91/z/h/a;

    iput-object p2, p0, Lcom/tv91/z/h/a$a;->a:Lb/g/j/a;

    iput-object p3, p0, Lcom/tv91/z/h/a$a;->b:Lcom/tv91/model/a;

    iput-object p4, p0, Lcom/tv91/z/h/a$a;->c:Ljava/lang/String;

    iput-wide p5, p0, Lcom/tv91/z/h/a$a;->d:J

    iput-object p7, p0, Lcom/tv91/z/h/a$a;->e:Ljava/io/File;

    iput-wide p8, p0, Lcom/tv91/z/h/a$a;->f:J

    iput-object p10, p0, Lcom/tv91/z/h/a$a;->g:Lb/g/j/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/e;Le/b0;)V
    .locals 9

    .line 1
    invoke-virtual {p2}, Le/b0;->I()Z

    move-result v0

    if-nez v0, :cond_3

    .line 2
    invoke-virtual {p2}, Le/b0;->D()I

    move-result p1

    const/16 v0, 0x258

    if-lt p1, v0, :cond_2

    if-ne p1, v0, :cond_0

    const-string p1, "600"

    goto :goto_0

    :cond_0
    const/16 p2, 0x29a

    if-ne p1, p2, :cond_1

    const-string p1, "666"

    goto :goto_0

    :cond_1
    const-string p1, "601"

    .line 3
    :goto_0
    iget-object p2, p0, Lcom/tv91/z/h/a$a;->a:Lb/g/j/a;

    new-instance v0, Lcom/tv91/s/b;

    iget-object v1, p0, Lcom/tv91/z/h/a$a;->b:Lcom/tv91/model/a;

    invoke-direct {v0, p1, v1}, Lcom/tv91/s/b;-><init>(Ljava/lang/String;Lcom/tv91/model/a;)V

    invoke-interface {p2, v0}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    goto :goto_1

    .line 4
    :cond_2
    iget-object p1, p0, Lcom/tv91/z/h/a$a;->a:Lb/g/j/a;

    new-instance v0, Lcom/tv91/s/g;

    invoke-virtual {p2}, Le/b0;->D()I

    move-result v1

    invoke-virtual {p2}, Le/b0;->J()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, v1, p2}, Lcom/tv91/s/g;-><init>(ILjava/lang/String;)V

    invoke-interface {p1, v0}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    :goto_1
    return-void

    .line 5
    :cond_3
    invoke-virtual {p2}, Le/b0;->B()Le/c0;

    move-result-object p2

    if-nez p2, :cond_4

    .line 6
    iget-object p1, p0, Lcom/tv91/z/h/a$a;->a:Lb/g/j/a;

    new-instance p2, Ljava/io/IOException;

    const-string v0, "response body is null"

    invoke-direct {p2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void

    .line 7
    :cond_4
    new-instance v0, Lcom/tv91/z/h/a$b;

    iget-object v1, p0, Lcom/tv91/z/h/a$a;->h:Lcom/tv91/z/h/a;

    iget-object v2, p0, Lcom/tv91/z/h/a$a;->c:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/tv91/z/h/a;->h(Lcom/tv91/z/h/a;Ljava/lang/String;)Lcom/tv91/z/c$a;

    move-result-object v1

    iget-wide v2, p0, Lcom/tv91/z/h/a$a;->d:J

    invoke-direct {v0, v1, v2, v3}, Lcom/tv91/z/h/a$b;-><init>(Lcom/tv91/z/c$a;J)V

    const-wide/16 v1, 0x7d0

    .line 8
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lcom/tv91/z/h/a$b;->b(JLjava/util/concurrent/TimeUnit;)V

    .line 9
    iget-wide v1, p0, Lcom/tv91/z/h/a$a;->d:J

    .line 10
    :try_start_0
    invoke-virtual {p2}, Le/c0;->H()Lf/e;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    :try_start_1
    iget-object v3, p0, Lcom/tv91/z/h/a$a;->e:Ljava/io/File;

    invoke-static {v3}, Lf/l;->a(Ljava/io/File;)Lf/r;

    move-result-object v3

    invoke-static {v3}, Lf/l;->b(Lf/r;)Lf/d;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 12
    :cond_5
    :try_start_2
    invoke-interface {v3}, Lf/d;->c()Lf/c;

    move-result-object v4

    const-wide/16 v5, 0x2000

    invoke-interface {p2, v4, v5, v6}, Lf/s;->t(Lf/c;J)J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v8, v4, v6

    if-eqz v8, :cond_6

    .line 13
    invoke-interface {v3}, Lf/d;->h()Lf/d;

    add-long/2addr v1, v4

    .line 14
    invoke-virtual {v0, v1, v2}, Lcom/tv91/z/h/a$b;->c(J)V

    .line 15
    iget-wide v4, p0, Lcom/tv91/z/h/a$a;->f:J

    cmp-long v6, v1, v4

    if-lez v6, :cond_5

    .line 16
    invoke-virtual {v0}, Lcom/tv91/z/h/a$b;->a()V

    .line 17
    iget-object v1, p0, Lcom/tv91/z/h/a$a;->a:Lb/g/j/a;

    new-instance v2, Lcom/tv91/s/b;

    const-string v4, "Download-Corrupt"

    iget-object v5, p0, Lcom/tv91/z/h/a$a;->b:Lcom/tv91/model/a;

    invoke-direct {v2, v4, v5}, Lcom/tv91/s/b;-><init>(Ljava/lang/String;Lcom/tv91/model/a;)V

    invoke-interface {v1, v2}, Lb/g/j/a;->a(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 18
    :try_start_3
    invoke-interface {v3}, Lf/r;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :try_start_4
    invoke-interface {p2}, Lf/s;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-void

    .line 19
    :cond_6
    :try_start_5
    invoke-virtual {v0}, Lcom/tv91/z/h/a$b;->a()V

    .line 20
    iget-object v1, p0, Lcom/tv91/z/h/a$a;->g:Lb/g/j/a;

    iget-object v2, p0, Lcom/tv91/z/h/a$a;->e:Ljava/io/File;

    invoke-interface {v1, v2}, Lb/g/j/a;->a(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 21
    :try_start_6
    invoke-interface {v3}, Lf/r;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :try_start_7
    invoke-interface {p2}, Lf/s;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    goto :goto_4

    :catchall_0
    move-exception v1

    .line 22
    :try_start_8
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :catchall_1
    move-exception v2

    if-eqz v3, :cond_7

    .line 23
    :try_start_9
    invoke-interface {v3}, Lf/r;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v3

    :try_start_a
    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_7
    :goto_2
    throw v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :catchall_3
    move-exception v1

    .line 24
    :try_start_b
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    :catchall_4
    move-exception v2

    if-eqz p2, :cond_8

    .line 25
    :try_start_c
    invoke-interface {p2}, Lf/s;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    goto :goto_3

    :catchall_5
    move-exception p2

    :try_start_d
    invoke-virtual {v1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_8
    :goto_3
    throw v2
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0

    :catch_0
    move-exception p2

    .line 26
    invoke-virtual {v0}, Lcom/tv91/z/h/a$b;->a()V

    .line 27
    invoke-interface {p1}, Le/e;->V()Z

    move-result p1

    if-nez p1, :cond_9

    .line 28
    iget-object p1, p0, Lcom/tv91/z/h/a$a;->a:Lb/g/j/a;

    invoke-interface {p1, p2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    :cond_9
    :goto_4
    return-void
.end method

.method public b(Le/e;Ljava/io/IOException;)V
    .locals 0

    .line 1
    invoke-interface {p1}, Le/e;->V()Z

    move-result p1

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/tv91/z/h/a$a;->a:Lb/g/j/a;

    invoke-interface {p1, p2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
