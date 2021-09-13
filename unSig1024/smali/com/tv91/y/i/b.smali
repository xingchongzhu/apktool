.class public final Lcom/tv91/y/i/b;
.super Ljava/lang/Object;
.source "DownloadRecordProvider.java"

# interfaces
.implements Landroid/provider/BaseColumns;


# static fields
.field static final a:[Ljava/lang/String;


# instance fields
.field private final b:Lcom/tv91/y/i/a;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    const-string v0, "_id"

    const-string v1, "user_id"

    const-string v2, "movie_id"

    const-string v3, "movie_name"

    const-string v4, "movie_channel"

    const-string v5, "movie_poster"

    const-string v6, "movie_file_size"

    const-string v7, "file_path"

    const-string v8, "download_id"

    const-string v9, "download_ver_id"

    const-string v10, "download_url"

    const-string v11, "download_expire_date"

    const-string v12, "download_status"

    .line 1
    filled-new-array/range {v0 .. v12}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tv91/y/i/b;->a:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/tv91/y/i/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/tv91/y/i/b;->b:Lcom/tv91/y/i/a;

    return-void
.end method

.method private b(Landroid/database/Cursor;)Lcom/tv91/model/a;
    .locals 9

    .line 1
    new-instance v0, Lcom/tv91/model/User$Builder;

    invoke-direct {v0}, Lcom/tv91/model/User$Builder;-><init>()V

    const-string v1, "user_id"

    .line 2
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tv91/model/User$Builder;->id(Ljava/lang/String;)Lcom/tv91/model/User$Builder;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/tv91/model/User$Builder;->build()Lcom/tv91/model/User;

    move-result-object v4

    .line 4
    new-instance v0, Lcom/tv91/model/Movie$Builder;

    invoke-direct {v0}, Lcom/tv91/model/Movie$Builder;-><init>()V

    const-string v1, "movie_id"

    .line 5
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/tv91/model/Movie$Builder;->id(I)Lcom/tv91/model/Movie$Builder;

    move-result-object v0

    const-string v1, "movie_name"

    .line 6
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tv91/model/Movie$Builder;->name(Ljava/lang/String;)Lcom/tv91/model/Movie$Builder;

    move-result-object v0

    new-instance v1, Lcom/tv91/model/Channel;

    const-string v2, "movie_channel"

    .line 7
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    const-string v3, ""

    invoke-direct {v1, v2, v3}, Lcom/tv91/model/Channel;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/tv91/model/Movie$Builder;->channel(Lcom/tv91/model/Channel;)Lcom/tv91/model/Movie$Builder;

    move-result-object v0

    const-string v1, "movie_poster"

    .line 8
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tv91/model/Movie$Builder;->poster(Ljava/lang/String;)Lcom/tv91/model/Movie$Builder;

    move-result-object v0

    const-string v1, "movie_file_size"

    .line 9
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/tv91/model/Movie$Builder;->fileSize(J)Lcom/tv91/model/Movie$Builder;

    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/tv91/model/Movie$Builder;->build()Lcom/tv91/model/Movie;

    move-result-object v5

    .line 11
    new-instance v6, Lcom/tv91/model/DownloadInfo;

    const-string v0, "download_id"

    .line 12
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    const-string v1, "download_ver_id"

    .line 13
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "download_url"

    .line 14
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    const-string v7, "download_expire_date"

    .line 15
    invoke-interface {p1, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    invoke-interface {p1, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    invoke-direct {v3, v7, v8}, Ljava/util/Date;-><init>(J)V

    invoke-direct {v6, v0, v1, v2, v3}, Lcom/tv91/model/DownloadInfo;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/Date;)V

    .line 16
    new-instance v0, Lcom/tv91/model/a;

    const-string v1, "_id"

    .line 17
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    int-to-long v2, v1

    const-string v1, "file_path"

    .line 18
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string v1, "download_status"

    .line 19
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 20
    invoke-static {p1}, Lcom/tv91/model/a$a;->a(Ljava/lang/String;)Lcom/tv91/model/a$a;

    move-result-object v8

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lcom/tv91/model/a;-><init>(JLcom/tv91/model/User;Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;Ljava/lang/String;Lcom/tv91/model/a$a;)V

    return-object v0
.end method


# virtual methods
.method public a(Lcom/tv91/model/a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/SQLException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "insert or update download record"

    .line 1
    invoke-static {v2, v1}, Lh/a/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    new-instance v1, Landroid/content/ContentValues;

    sget-object v2, Lcom/tv91/y/i/b;->a:[Ljava/lang/String;

    array-length v2, v2

    invoke-direct {v1, v2}, Landroid/content/ContentValues;-><init>(I)V

    .line 3
    iget-object v2, p1, Lcom/tv91/model/a;->b:Lcom/tv91/model/User;

    iget-object v2, v2, Lcom/tv91/model/User;->id:Ljava/lang/String;

    const-string v3, "user_id"

    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v2, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget v2, v2, Lcom/tv91/model/Movie;->id:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "movie_id"

    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 5
    iget-object v2, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-object v2, v2, Lcom/tv91/model/Movie;->channel:Lcom/tv91/model/Channel;

    iget v2, v2, Lcom/tv91/model/b;->key:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "movie_channel"

    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 6
    iget-object v2, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-object v2, v2, Lcom/tv91/model/Movie;->name:Ljava/lang/String;

    const-string v3, "movie_name"

    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iget-object v2, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-object v2, v2, Lcom/tv91/model/Movie;->poster:Ljava/lang/String;

    const-string v3, "movie_poster"

    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-object v2, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-wide v2, v2, Lcom/tv91/model/Movie;->fileSize:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "movie_file_size"

    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 9
    iget-object v2, p1, Lcom/tv91/model/a;->d:Lcom/tv91/model/DownloadInfo;

    iget v2, v2, Lcom/tv91/model/DownloadInfo;->id:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "download_id"

    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 10
    iget-object v2, p1, Lcom/tv91/model/a;->d:Lcom/tv91/model/DownloadInfo;

    iget-object v2, v2, Lcom/tv91/model/DownloadInfo;->verifyId:Ljava/lang/String;

    const-string v3, "download_ver_id"

    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    iget-object v2, p1, Lcom/tv91/model/a;->d:Lcom/tv91/model/DownloadInfo;

    iget-object v2, v2, Lcom/tv91/model/DownloadInfo;->url:Ljava/lang/String;

    const-string v3, "download_url"

    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    iget-object v2, p1, Lcom/tv91/model/a;->d:Lcom/tv91/model/DownloadInfo;

    iget-object v2, v2, Lcom/tv91/model/DownloadInfo;->expireDate:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "download_expire_date"

    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 13
    iget-object v2, p1, Lcom/tv91/model/a;->e:Ljava/lang/String;

    const-string v3, "file_path"

    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    iget-object p1, p1, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    invoke-virtual {p1}, Lcom/tv91/model/a$a;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "download_status"

    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    iget-object p1, p0, Lcom/tv91/y/i/b;->b:Lcom/tv91/y/i/a;

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    .line 16
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    :try_start_0
    const-string v2, "DownloadRecord"

    const/4 v3, 0x0

    .line 17
    invoke-virtual {p1, v2, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->replaceOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    .line 18
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    :cond_0
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_1
    const-string v2, "insert or update download record failed"

    new-array v0, v0, [Ljava/lang/Object;

    .line 20
    invoke-static {v1, v2, v0}, Lh/a/a;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    :goto_0
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 23
    throw v0
.end method

.method public c(Ljava/lang/String;I)Lcom/tv91/model/a;
    .locals 15

    move-object v0, p0

    const/4 v1, 0x2

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    .line 1
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v2, v5

    const-string v4, "query download records by user with [user id: %s, movie id: %d]"

    invoke-static {v4, v2}, Lh/a/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v2, v0, Lcom/tv91/y/i/b;->b:Lcom/tv91/y/i/a;

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v6

    .line 3
    sget-object v8, Lcom/tv91/y/i/b;->a:[Ljava/lang/String;

    new-array v10, v1, [Ljava/lang/String;

    aput-object p1, v10, v3

    .line 4
    invoke-static/range {p2 .. p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v10, v5

    const-string v7, "DownloadRecord"

    const-string v9, "user_id = ? AND movie_id = ?"

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 5
    invoke-virtual/range {v6 .. v14}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 6
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 7
    invoke-direct {p0, v1}, Lcom/tv91/y/i/b;->b(Landroid/database/Cursor;)Lcom/tv91/model/a;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 8
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object v2
.end method

.method public d()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tv91/model/a;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "query all download records"

    .line 1
    invoke-static {v1, v0}, Lh/a/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/y/i/b;->b:Lcom/tv91/y/i/a;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    sget-object v3, Lcom/tv91/y/i/b;->a:[Ljava/lang/String;

    const-string v2, "DownloadRecord"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v1 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 5
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 6
    invoke-direct {p0, v1}, Lcom/tv91/y/i/b;->b(Landroid/database/Cursor;)Lcom/tv91/model/a;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 7
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object v0
.end method

.method public e(Ljava/lang/String;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/tv91/model/a;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string v3, "query download records by user with id: %s"

    .line 1
    invoke-static {v3, v1}, Lh/a/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v1, p0, Lcom/tv91/y/i/b;->b:Lcom/tv91/y/i/a;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    sget-object v5, Lcom/tv91/y/i/b;->a:[Ljava/lang/String;

    const/4 v4, 0x2

    new-array v7, v4, [Ljava/lang/String;

    aput-object p1, v7, v2

    sget-object p1, Lcom/tv91/model/a$a;->e:Lcom/tv91/model/a$a;

    .line 5
    invoke-virtual {p1}, Lcom/tv91/model/a$a;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v7, v0

    const-string v4, "DownloadRecord"

    const-string v6, "user_id = ? AND download_status != ?"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v10, "movie_id ASC"

    const/4 v11, 0x0

    .line 6
    invoke-virtual/range {v3 .. v11}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    .line 7
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    invoke-direct {p0, p1}, Lcom/tv91/y/i/b;->b(Landroid/database/Cursor;)Lcom/tv91/model/a;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 9
    :cond_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-object v1
.end method

.method public f(Lcom/tv91/model/a;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/SQLException;
        }
    .end annotation

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    .line 1
    iget-object v2, p1, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "update download record: %s"

    invoke-static {v2, v1}, Lh/a/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 3
    iget-object v2, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-object v2, v2, Lcom/tv91/model/Movie;->name:Ljava/lang/String;

    const-string v4, "movie_name"

    invoke-virtual {v1, v4, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v2, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-object v2, v2, Lcom/tv91/model/Movie;->channel:Lcom/tv91/model/Channel;

    iget v2, v2, Lcom/tv91/model/b;->key:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v4, "movie_channel"

    invoke-virtual {v1, v4, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 5
    iget-object v2, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-object v2, v2, Lcom/tv91/model/Movie;->poster:Ljava/lang/String;

    const-string v4, "movie_poster"

    invoke-virtual {v1, v4, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object v2, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-wide v4, v2, Lcom/tv91/model/Movie;->fileSize:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v4, "movie_file_size"

    invoke-virtual {v1, v4, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 7
    iget-object v2, p1, Lcom/tv91/model/a;->d:Lcom/tv91/model/DownloadInfo;

    iget v2, v2, Lcom/tv91/model/DownloadInfo;->id:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v4, "download_id"

    invoke-virtual {v1, v4, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 8
    iget-object v2, p1, Lcom/tv91/model/a;->d:Lcom/tv91/model/DownloadInfo;

    iget-object v2, v2, Lcom/tv91/model/DownloadInfo;->verifyId:Ljava/lang/String;

    const-string v4, "download_ver_id"

    invoke-virtual {v1, v4, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    iget-object v2, p1, Lcom/tv91/model/a;->d:Lcom/tv91/model/DownloadInfo;

    iget-object v2, v2, Lcom/tv91/model/DownloadInfo;->url:Ljava/lang/String;

    const-string v4, "download_url"

    invoke-virtual {v1, v4, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    iget-object v2, p1, Lcom/tv91/model/a;->d:Lcom/tv91/model/DownloadInfo;

    iget-object v2, v2, Lcom/tv91/model/DownloadInfo;->expireDate:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v4, "download_expire_date"

    invoke-virtual {v1, v4, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 11
    iget-object v2, p1, Lcom/tv91/model/a;->e:Ljava/lang/String;

    const-string v4, "file_path"

    invoke-virtual {v1, v4, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    iget-object v2, p1, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    invoke-virtual {v2}, Lcom/tv91/model/a$a;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "download_status"

    invoke-virtual {v1, v4, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    iget-object v2, p0, Lcom/tv91/y/i/b;->b:Lcom/tv91/y/i/a;

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    .line 14
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    :try_start_0
    const-string v4, "DownloadRecord"

    const-string v5, "user_id = ? AND movie_id = ?"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/String;

    .line 15
    iget-object v7, p1, Lcom/tv91/model/a;->b:Lcom/tv91/model/User;

    iget-object v7, v7, Lcom/tv91/model/User;->id:Ljava/lang/String;

    aput-object v7, v6, v3

    iget-object p1, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget p1, p1, Lcom/tv91/model/Movie;->id:I

    .line 16
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v6, v0

    .line 17
    invoke-virtual {v2, v4, v1, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1

    int-to-long v0, p1

    const-wide/16 v4, -0x1

    cmp-long p1, v0, v4

    if-eqz p1, :cond_0

    .line 18
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    :cond_0
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    const-string v0, "update download record failed"

    new-array v1, v3, [Ljava/lang/Object;

    .line 20
    invoke-static {p1, v0, v1}, Lh/a/a;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    :goto_0
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 23
    throw p1
.end method
