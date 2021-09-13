.class public final Lcom/tv91/utils/c;
.super Ljava/lang/Object;
.source "Files.java"


# direct methods
.method public static a(Ljava/io/FileInputStream;Ljava/io/FileOutputStream;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v6

    .line 2
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v7

    .line 3
    invoke-virtual {v6}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v8

    const-wide/16 v0, 0x0

    move-wide v10, v0

    :goto_0
    cmp-long v0, v10, v8

    if-gez v0, :cond_1

    sub-long v0, v8, v10

    const-wide/32 v2, 0x2000000

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    move-wide v4, v2

    goto :goto_1

    :cond_0
    move-wide v4, v0

    :goto_1
    move-object v0, v7

    move-object v1, v6

    move-wide v2, v10

    .line 4
    invoke-virtual/range {v0 .. v5}, Ljava/nio/channels/FileChannel;->transferFrom(Ljava/nio/channels/ReadableByteChannel;JJ)J

    move-result-wide v0

    add-long/2addr v10, v0

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {p0}, Ljava/io/FileInputStream;->close()V

    .line 6
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V

    .line 7
    invoke-virtual {v6}, Ljava/nio/channels/FileChannel;->close()V

    .line 8
    invoke-virtual {v7}, Ljava/nio/channels/FileChannel;->close()V

    return-void
.end method

.method public static b(Landroid/content/Context;)Ljava/io/File;
    .locals 1

    .line 1
    sget-object v0, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/tv91/utils/c;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method private static c(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "cache"

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 3
    invoke-static {}, Lcom/tv91/utils/c;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_3

    if-eqz v0, :cond_2

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p0

    move-object v1, p0

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v1, v0

    .line 6
    :cond_3
    :goto_1
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_4

    .line 7
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_4
    return-object v1
.end method

.method public static d(Landroid/content/Context;)Ljava/io/File;
    .locals 1

    .line 1
    sget-object v0, Landroid/os/Environment;->DIRECTORY_MOVIES:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/tv91/utils/c;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method private static e()Z
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    invoke-static {}, Landroid/os/Environment;->isExternalStorageRemovable()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
