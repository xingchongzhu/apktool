.class Lcom/tv91/z/h/a$b;
.super Ljava/lang/Object;
.source "WebDownloadApi.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/z/h/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/ScheduledExecutorService;

.field private final b:Lcom/tv91/z/c$a;

.field private c:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private d:J


# direct methods
.method public constructor <init>(Lcom/tv91/z/c$a;J)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/z/h/a$b;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 3
    iput-object p1, p0, Lcom/tv91/z/h/a$b;->b:Lcom/tv91/z/c$a;

    .line 4
    iput-wide p2, p0, Lcom/tv91/z/h/a$b;->d:J

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/z/h/a$b;->c:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    return-void
.end method

.method public b(JLjava/util/concurrent/TimeUnit;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/tv91/z/h/a$b;->a:Ljava/util/concurrent/ScheduledExecutorService;

    const-wide/16 v2, 0x0

    move-object v1, p0

    move-wide v4, p1

    move-object v6, p3

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/z/h/a$b;->c:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method public c(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/tv91/z/h/a$b;->d:J

    return-void
.end method

.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/z/h/a$b;->b:Lcom/tv91/z/c$a;

    if-eqz v0, :cond_0

    .line 2
    iget-wide v1, p0, Lcom/tv91/z/h/a$b;->d:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/tv91/z/c$a;->a(Ljava/lang/Number;)V

    :cond_0
    return-void
.end method
