.class public final Lcom/efs/sdk/base/a/e/d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/efs/sdk/base/a/e/d$a;
    }
.end annotation


# instance fields
.field public a:I

.field public b:Lcom/efs/sdk/base/a/e/c;

.field private c:Lcom/efs/sdk/base/a/e/c;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/concurrent/atomic/AtomicInteger;

.field private f:Lcom/efs/sdk/base/a/b/f;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    sget-object v0, Lcom/efs/sdk/base/a/h/a/a;->a:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    const/4 v0, 0x5

    .line 3
    iput v0, p0, Lcom/efs/sdk/base/a/e/d;->a:I

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/efs/sdk/base/a/e/d;->d:Ljava/util/List;

    .line 5
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/efs/sdk/base/a/e/d;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 6
    new-instance v0, Lcom/efs/sdk/base/a/e/a;

    invoke-direct {v0}, Lcom/efs/sdk/base/a/e/a;-><init>()V

    iput-object v0, p0, Lcom/efs/sdk/base/a/e/d;->b:Lcom/efs/sdk/base/a/e/c;

    .line 7
    new-instance v0, Lcom/efs/sdk/base/a/i/e;

    invoke-direct {v0}, Lcom/efs/sdk/base/a/i/e;-><init>()V

    iput-object v0, p0, Lcom/efs/sdk/base/a/e/d;->c:Lcom/efs/sdk/base/a/e/c;

    .line 8
    new-instance v0, Lcom/efs/sdk/base/a/b/h;

    invoke-direct {v0}, Lcom/efs/sdk/base/a/b/h;-><init>()V

    iput-object v0, p0, Lcom/efs/sdk/base/a/e/d;->f:Lcom/efs/sdk/base/a/b/f;

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/efs/sdk/base/a/e/d;-><init>()V

    return-void
.end method

.method public static a()Lcom/efs/sdk/base/a/e/d;
    .locals 1

    .line 1
    invoke-static {}, Lcom/efs/sdk/base/a/e/d$a;->a()Lcom/efs/sdk/base/a/e/d;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method final a(Ljava/lang/Object;I)V
    .locals 2

    .line 2
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    const/4 v1, 0x1

    .line 3
    iput v1, v0, Landroid/os/Message;->what:I

    .line 4
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 5
    iput p2, v0, Landroid/os/Message;->arg1:I

    .line 6
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 12

    .line 1
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 2
    invoke-static {}, Lcom/efs/sdk/base/a/e/f$a;->a()Lcom/efs/sdk/base/a/e/f;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/efs/sdk/base/a/e/f;->a()Z

    move-result v0

    if-eqz v0, :cond_15

    .line 4
    iget v0, p1, Landroid/os/Message;->what:I

    const-string v1, "efs.send_log"

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v2, :cond_0

    goto/16 :goto_7

    .line 5
    :cond_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 6
    iget-object v2, p0, Lcom/efs/sdk/base/a/e/d;->d:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 7
    :cond_1
    iget p1, p1, Landroid/os/Message;->arg1:I

    if-eqz p1, :cond_2

    .line 8
    iget-object p1, p0, Lcom/efs/sdk/base/a/e/d;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 9
    :goto_0
    iget-object v0, p0, Lcom/efs/sdk/base/a/e/d;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_15

    const/4 v0, 0x5

    if-ge p1, v0, :cond_3

    .line 10
    invoke-virtual {p0, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void

    .line 11
    :cond_3
    iget-object p1, p0, Lcom/efs/sdk/base/a/e/d;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 12
    invoke-static {}, Lcom/efs/sdk/base/a/d/a;->a()Lcom/efs/sdk/base/a/c/a;

    move-result-object p1

    .line 13
    iget-wide v4, p1, Lcom/efs/sdk/base/a/c/a;->k:J

    .line 14
    invoke-virtual {p0, v3, v4, v5}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    const-string p1, "request error cnt gt 5, next request delay 10s"

    .line 15
    invoke-static {v1, p1}, Lcom/efs/sdk/base/a/h/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_7

    .line 16
    :cond_4
    invoke-static {}, Lcom/efs/sdk/base/a/c/c$a;->a()Lcom/efs/sdk/base/a/c/c;

    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/efs/sdk/base/a/c/c;->a()Ljava/lang/String;

    move-result-object p1

    const-string v0, "denied"

    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_14

    const-string v0, "disconnected"

    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto/16 :goto_6

    .line 20
    :cond_5
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    .line 21
    :try_start_0
    invoke-static {}, Lcom/efs/sdk/base/a/b/a$b;->a()Lcom/efs/sdk/base/a/b/a;

    move-result-object v0

    .line 22
    iget v1, p0, Lcom/efs/sdk/base/a/e/d;->a:I

    iget-object v4, p0, Lcom/efs/sdk/base/a/e/d;->f:Lcom/efs/sdk/base/a/b/f;

    .line 23
    invoke-virtual {v0}, Lcom/efs/sdk/base/a/b/a;->a()V

    .line 24
    invoke-virtual {v0}, Lcom/efs/sdk/base/a/b/a;->a()V

    .line 25
    invoke-static {}, Lcom/efs/sdk/base/a/d/a;->a()Lcom/efs/sdk/base/a/c/a;

    move-result-object v5

    iget-object v5, v5, Lcom/efs/sdk/base/a/c/a;->c:Landroid/content/Context;

    invoke-static {}, Lcom/efs/sdk/base/a/d/a;->a()Lcom/efs/sdk/base/a/c/a;

    move-result-object v6

    .line 26
    iget-object v6, v6, Lcom/efs/sdk/base/a/c/a;->a:Ljava/lang/String;

    .line 27
    invoke-static {v5, v6}, Lcom/efs/sdk/base/a/h/a;->f(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    .line 28
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_6

    .line 29
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    goto :goto_3

    .line 30
    :cond_6
    invoke-static {v5}, Lcom/efs/sdk/base/a/h/b;->d(Ljava/io/File;)Ljava/util/List;

    move-result-object v5

    .line 31
    iget-boolean v6, v0, Lcom/efs/sdk/base/a/b/a;->b:Z

    if-eqz v6, :cond_9

    .line 32
    invoke-static {}, Lcom/efs/sdk/base/a/i/f$a;->a()Lcom/efs/sdk/base/a/i/f;

    move-result-object v6

    .line 33
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    .line 34
    iget-object v8, v6, Lcom/efs/sdk/base/a/i/f;->b:Lcom/efs/sdk/base/a/d/a;

    if-eqz v8, :cond_8

    invoke-static {}, Lcom/efs/sdk/base/a/d/a;->a()Lcom/efs/sdk/base/a/c/a;

    move-result-object v8

    .line 35
    iget-boolean v8, v8, Lcom/efs/sdk/base/a/c/a;->d:Z

    if-nez v8, :cond_7

    goto :goto_1

    .line 36
    :cond_7
    new-instance v8, Lcom/efs/sdk/base/a/i/b;

    const-string v9, "efs_core"

    const-string v10, "log_lag"

    iget-object v11, v6, Lcom/efs/sdk/base/a/i/f;->a:Lcom/efs/sdk/base/a/i/c;

    iget-object v11, v11, Lcom/efs/sdk/base/a/i/c;->c:Ljava/lang/String;

    invoke-direct {v8, v9, v10, v11}, Lcom/efs/sdk/base/a/i/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "cnt"

    .line 37
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v8, v9, v7}, Lcom/efs/sdk/base/protocol/record/AbsRecordLog;->put(Ljava/lang/String;Ljava/lang/Object;)V

    .line 38
    iget-object v6, v6, Lcom/efs/sdk/base/a/i/f;->b:Lcom/efs/sdk/base/a/d/a;

    invoke-virtual {v6, v8}, Lcom/efs/sdk/base/a/d/a;->a(Lcom/efs/sdk/base/protocol/ILogProtocol;)V

    .line 39
    :cond_8
    :goto_1
    iput-boolean v3, v0, Lcom/efs/sdk/base/a/b/a;->b:Z

    .line 40
    :cond_9
    iget-object v6, v0, Lcom/efs/sdk/base/a/b/a;->d:Lcom/efs/sdk/base/a/b/a$a;

    invoke-static {v5, v6}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 41
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    sub-int/2addr v7, v2

    :goto_2
    if-ltz v7, :cond_c

    .line 43
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    if-ge v2, v1, :cond_c

    .line 44
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    .line 45
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v8

    if-eqz v8, :cond_b

    if-eqz v4, :cond_a

    .line 46
    invoke-interface {v4, v2}, Lcom/efs/sdk/base/a/b/f;->a(Ljava/io/File;)Z

    move-result v8

    if-nez v8, :cond_b

    .line 47
    :cond_a
    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_b
    add-int/lit8 v7, v7, -0x1

    goto :goto_2

    :cond_c
    move-object v2, v6

    .line 48
    :goto_3
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 49
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    .line 50
    invoke-virtual {v0, v2}, Lcom/efs/sdk/base/a/b/a;->a(Ljava/io/File;)Lcom/efs/sdk/base/a/f/b;

    move-result-object v5

    if-nez v5, :cond_d

    const-string v5, "efs.cache"

    .line 51
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "file upload error, name is "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    .line 52
    invoke-static {v5, v2, v6}, Lcom/efs/sdk/base/a/h/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    .line 53
    :cond_d
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :cond_e
    move-object p1, v4

    .line 54
    :catchall_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_f
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/efs/sdk/base/a/f/b;

    .line 55
    iget-object v1, v0, Lcom/efs/sdk/base/a/f/b;->a:Lcom/efs/sdk/base/a/f/a;

    iget-object v1, v1, Lcom/efs/sdk/base/a/f/a;->a:Ljava/lang/String;

    const-string v2, "wa"

    .line 56
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    .line 57
    invoke-static {}, Lcom/efs/sdk/base/a/e/b;->a()Lcom/efs/sdk/base/a/e/b;

    move-result-object v1

    .line 58
    iget-object v4, v0, Lcom/efs/sdk/base/a/f/b;->a:Lcom/efs/sdk/base/a/f/a;

    iget-object v4, v4, Lcom/efs/sdk/base/a/f/a;->a:Ljava/lang/String;

    .line 59
    invoke-virtual {v0}, Lcom/efs/sdk/base/a/f/b;->a()J

    move-result-wide v5

    invoke-virtual {v1, v4, v5, v6}, Lcom/efs/sdk/base/a/e/b;->a(Ljava/lang/String;J)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 60
    :cond_10
    iget-object v1, p0, Lcom/efs/sdk/base/a/e/d;->b:Lcom/efs/sdk/base/a/e/c;

    .line 61
    iget-object v4, v0, Lcom/efs/sdk/base/a/f/b;->a:Lcom/efs/sdk/base/a/f/a;

    iget-object v4, v4, Lcom/efs/sdk/base/a/f/a;->a:Ljava/lang/String;

    .line 62
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    .line 63
    iget-object v1, p0, Lcom/efs/sdk/base/a/e/d;->c:Lcom/efs/sdk/base/a/e/c;

    .line 64
    :cond_11
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    .line 65
    iget-object v4, p0, Lcom/efs/sdk/base/a/e/d;->d:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    new-instance v4, Lcom/efs/sdk/base/a/e/e;

    invoke-direct {v4, v0, v1, v2}, Lcom/efs/sdk/base/a/e/e;-><init>(Lcom/efs/sdk/base/a/f/b;Lcom/efs/sdk/base/a/e/c;Ljava/lang/String;)V

    .line 67
    invoke-static {v4}, Lcom/efs/sdk/base/a/h/a/d;->a(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    if-nez v0, :cond_f

    const/4 v0, -0x1

    .line 68
    invoke-virtual {p0, v2, v0}, Lcom/efs/sdk/base/a/e/d;->a(Ljava/lang/Object;I)V

    goto :goto_5

    .line 69
    :cond_12
    iget-object p1, p0, Lcom/efs/sdk/base/a/e/d;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-gtz p1, :cond_13

    .line 70
    invoke-static {}, Lcom/efs/sdk/base/a/d/a;->a()Lcom/efs/sdk/base/a/c/a;

    move-result-object p1

    .line 71
    iget-wide v0, p1, Lcom/efs/sdk/base/a/c/a;->l:J

    .line 72
    invoke-virtual {p0, v3, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_13
    return-void

    .line 73
    :cond_14
    :goto_6
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "log cann\'t be send because net status is "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 74
    invoke-static {v1, p1}, Lcom/efs/sdk/base/a/h/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    invoke-static {}, Lcom/efs/sdk/base/a/d/a;->a()Lcom/efs/sdk/base/a/c/a;

    move-result-object p1

    .line 76
    iget-wide v0, p1, Lcom/efs/sdk/base/a/c/a;->l:J

    .line 77
    invoke-virtual {p0, v3, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_15
    :goto_7
    return-void
.end method
