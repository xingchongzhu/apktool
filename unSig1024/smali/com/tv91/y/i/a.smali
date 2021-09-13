.class public final Lcom/tv91/y/i/a;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "DBHelper.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 2

    if-eqz p2, :cond_0

    const-string p2, "Test91TV.db"

    goto :goto_0

    :cond_0
    const-string p2, "91TV.db"

    :goto_0
    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 1
    invoke-direct {p0, p1, p2, v0, v1}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    const-string v0, "CREATE TABLE DownloadRecord (_id INTEGER PRIMARY KEY AUTOINCREMENT,user_id TEXT NOT NULL,movie_id INTEGER NOT NULL,movie_name TEXT,movie_channel INTEGER,movie_poster TEXT,movie_file_size INTEGER,download_id INTEGER,download_ver_id TEXT,download_url TEXT,download_expire_date INTEGER,file_path TEXT,download_status TEXT,UNIQUE (user_id, movie_id))"

    .line 1
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE FavoriteMovie (_id INTEGER PRIMARY KEY AUTOINCREMENT,user_id TEXT NOT NULL,movie_id INTEGER NOT NULL,movie_name TEXT,movie_description TEXT,movie_create_date TEXT,movie_image TEXT,movie_favorite INTEGER,UNIQUE (user_id, movie_id))"

    .line 2
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    if-eq p3, p2, :cond_0

    const/4 p3, 0x1

    if-ne p2, p3, :cond_0

    const-string p2, "ALTER TABLE DownloadRecord ADD COLUMN movie_channel INTEGER DEFAULT -2"

    .line 1
    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
