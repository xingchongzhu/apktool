.class Le/f0/i/g$d;
.super Le/f0/b;
.source "Http2Connection.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/f0/i/g;->W(ILjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Ljava/util/List;

.field final synthetic d:Le/f0/i/g;


# direct methods
.method varargs constructor <init>(Le/f0/i/g;Ljava/lang/String;[Ljava/lang/Object;ILjava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f0/i/g$d;->d:Le/f0/i/g;

    iput p4, p0, Le/f0/i/g$d;->b:I

    iput-object p5, p0, Le/f0/i/g$d;->c:Ljava/util/List;

    invoke-direct {p0, p2, p3}, Le/f0/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 3

    .line 1
    iget-object v0, p0, Le/f0/i/g$d;->d:Le/f0/i/g;

    iget-object v0, v0, Le/f0/i/g;->k:Le/f0/i/l;

    iget v1, p0, Le/f0/i/g$d;->b:I

    iget-object v2, p0, Le/f0/i/g$d;->c:Ljava/util/List;

    invoke-interface {v0, v1, v2}, Le/f0/i/l;->a(ILjava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    iget-object v0, p0, Le/f0/i/g$d;->d:Le/f0/i/g;

    iget-object v0, v0, Le/f0/i/g;->x:Le/f0/i/j;

    iget v1, p0, Le/f0/i/g$d;->b:I

    sget-object v2, Le/f0/i/b;->f:Le/f0/i/b;

    invoke-virtual {v0, v1, v2}, Le/f0/i/j;->L(ILe/f0/i/b;)V

    .line 3
    iget-object v0, p0, Le/f0/i/g$d;->d:Le/f0/i/g;

    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    :try_start_1
    iget-object v1, p0, Le/f0/i/g$d;->d:Le/f0/i/g;

    iget-object v1, v1, Le/f0/i/g;->z:Ljava/util/Set;

    iget v2, p0, Le/f0/i/g$d;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 5
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_0
    :goto_0
    return-void
.end method
