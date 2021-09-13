.class public final Lcom/tv91/y/i/c;
.super Ljava/lang/Object;
.source "FavoriteMovieProvider.java"

# interfaces
.implements Landroid/provider/BaseColumns;


# static fields
.field private static final a:[Ljava/lang/String;


# instance fields
.field private final b:Lcom/tv91/y/i/a;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const-string v0, "_id"

    const-string v1, "user_id"

    const-string v2, "movie_id"

    const-string v3, "movie_name"

    const-string v4, "movie_description"

    const-string v5, "movie_create_date"

    const-string v6, "movie_image"

    const-string v7, "movie_favorite"

    .line 1
    filled-new-array/range {v0 .. v7}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tv91/y/i/c;->a:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/tv91/y/i/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/tv91/y/i/c;->b:Lcom/tv91/y/i/a;

    return-void
.end method

.method private a(Landroid/database/Cursor;)Lcom/tv91/model/Movie;
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/model/Movie$Builder;

    invoke-direct {v0}, Lcom/tv91/model/Movie$Builder;-><init>()V

    const-string v1, "movie_id"

    .line 2
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/tv91/model/Movie$Builder;->id(I)Lcom/tv91/model/Movie$Builder;

    move-result-object v0

    const-string v1, "movie_name"

    .line 3
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tv91/model/Movie$Builder;->name(Ljava/lang/String;)Lcom/tv91/model/Movie$Builder;

    move-result-object v0

    const-string v1, "movie_description"

    .line 4
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tv91/model/Movie$Builder;->description(Ljava/lang/String;)Lcom/tv91/model/Movie$Builder;

    move-result-object v0

    const-string v1, "movie_create_date"

    .line 5
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tv91/model/Movie$Builder;->createTime(Ljava/lang/String;)Lcom/tv91/model/Movie$Builder;

    move-result-object v0

    const-string v1, "movie_image"

    .line 6
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tv91/model/Movie$Builder;->image(Ljava/lang/String;)Lcom/tv91/model/Movie$Builder;

    move-result-object v0

    const-string v1, "movie_favorite"

    .line 7
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lcom/tv91/model/Movie$Builder;->favorite(Z)Lcom/tv91/model/Movie$Builder;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lcom/tv91/model/Movie$Builder;->build()Lcom/tv91/model/Movie;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public b(Ljava/lang/String;I)Lcom/tv91/model/Movie;
    .locals 11

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "query favorite movie by user id and movie id"

    .line 1
    invoke-static {v2, v1}, Lh/a/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v1, p0, Lcom/tv91/y/i/c;->b:Lcom/tv91/y/i/a;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    .line 3
    sget-object v4, Lcom/tv91/y/i/c;->a:[Ljava/lang/String;

    const/4 v1, 0x2

    new-array v6, v1, [Ljava/lang/String;

    aput-object p1, v6, v0

    .line 4
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v6, p2

    const-string v3, "FavoriteMovie"

    const-string v5, "user_id = ? AND movie_id = ?"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 5
    invoke-virtual/range {v2 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    .line 6
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 7
    invoke-direct {p0, p1}, Lcom/tv91/y/i/c;->a(Landroid/database/Cursor;)Lcom/tv91/model/Movie;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 8
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-object p2
.end method
