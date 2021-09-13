.class public final Lcom/tv91/u/b/v0;
.super Ljava/lang/Object;
.source "FileDownloadManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/b/v0$b;,
        Lcom/tv91/u/b/v0$c;
    }
.end annotation


# instance fields
.field private final a:Lcom/tv91/u/b/x0/m1;

.field private final b:Lcom/tv91/u/b/x0/f1;

.field private final c:Lcom/tv91/u/b/x0/v1;

.field private final d:Lcom/tv91/u/b/x0/r1;

.field private final e:Lcom/tv91/u/b/x0/t1;

.field private final f:Lcom/tv91/u/b/x0/w1;

.field private g:Z

.field private h:J


# direct methods
.method public constructor <init>(Lcom/tv91/u/b/x0/m1;Lcom/tv91/u/b/x0/f1;Lcom/tv91/u/b/x0/v1;Lcom/tv91/u/b/x0/r1;Lcom/tv91/u/b/x0/t1;Lcom/tv91/u/b/x0/w1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 2
    iput-wide v0, p0, Lcom/tv91/u/b/v0;->h:J

    .line 3
    iput-object p1, p0, Lcom/tv91/u/b/v0;->a:Lcom/tv91/u/b/x0/m1;

    .line 4
    iput-object p2, p0, Lcom/tv91/u/b/v0;->b:Lcom/tv91/u/b/x0/f1;

    .line 5
    iput-object p3, p0, Lcom/tv91/u/b/v0;->c:Lcom/tv91/u/b/x0/v1;

    .line 6
    iput-object p4, p0, Lcom/tv91/u/b/v0;->d:Lcom/tv91/u/b/x0/r1;

    .line 7
    iput-object p5, p0, Lcom/tv91/u/b/v0;->e:Lcom/tv91/u/b/x0/t1;

    .line 8
    iput-object p6, p0, Lcom/tv91/u/b/v0;->f:Lcom/tv91/u/b/x0/w1;

    .line 9
    new-instance p2, Lcom/tv91/u/b/v0$b;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lcom/tv91/u/b/v0$b;-><init>(Lcom/tv91/u/b/v0;Lcom/tv91/u/b/v0$a;)V

    invoke-virtual {p1, p2}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic a(Lcom/tv91/u/b/v0;)Lcom/tv91/u/b/x0/t1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/u/b/v0;->e:Lcom/tv91/u/b/x0/t1;

    return-object p0
.end method

.method static synthetic b(Lcom/tv91/u/b/v0;)Lcom/tv91/u/b/x0/m1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/u/b/v0;->a:Lcom/tv91/u/b/x0/m1;

    return-object p0
.end method

.method static synthetic c(Lcom/tv91/u/b/v0;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tv91/u/b/v0;->h:J

    return-wide v0
.end method

.method static synthetic d(Lcom/tv91/u/b/v0;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/tv91/u/b/v0;->h:J

    return-wide p1
.end method


# virtual methods
.method public e(Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/v0;->b:Lcom/tv91/u/b/x0/f1;

    invoke-virtual {v0, p1, p2, p3}, Lcom/tv91/u/b/x0/f1;->o(Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;Ljava/lang/String;)V

    return-void
.end method

.method public f(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tv91/u/b/v0;->h:J

    sub-long/2addr v0, p1

    iput-wide v0, p0, Lcom/tv91/u/b/v0;->h:J

    return-void
.end method

.method public g(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tv91/u/b/v0;->h:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/tv91/u/b/v0;->h:J

    return-void
.end method

.method public h(Landroid/content/Context;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/tv91/u/b/v0;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/tv91/u/b/v0;->g:Z

    .line 3
    new-instance v0, Landroid/os/StatFs;

    invoke-static {p1}, Lcom/tv91/utils/c;->d(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBytes()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tv91/u/b/v0;->h:J

    .line 4
    iget-object p1, p0, Lcom/tv91/u/b/v0;->a:Lcom/tv91/u/b/x0/m1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/tv91/u/b/x0/m1;->o(Lcom/tv91/model/a$a;)V

    return-void
.end method

.method public i(J)Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/tv91/u/b/v0;->h:J

    const-wide/32 v2, 0xc800000

    sub-long/2addr v0, v2

    cmp-long v2, v0, p1

    if-lez v2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public j(Lcom/tv91/model/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/v0;->d:Lcom/tv91/u/b/x0/r1;

    invoke-virtual {v0, p1}, Lcom/tv91/u/b/x0/r1;->o(Lcom/tv91/model/a;)V

    return-void
.end method

.method public k(Lcom/tv91/model/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/v0;->e:Lcom/tv91/u/b/x0/t1;

    invoke-virtual {v0, p1}, Lcom/tv91/u/b/x0/t1;->o(Lcom/tv91/model/a;)V

    return-void
.end method

.method public l(Lcom/tv91/model/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/v0;->e:Lcom/tv91/u/b/x0/t1;

    new-instance v1, Lcom/tv91/u/b/v0$a;

    invoke-direct {v1, p0}, Lcom/tv91/u/b/v0$a;-><init>(Lcom/tv91/u/b/v0;)V

    invoke-virtual {v0, v1}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/b/v0;->e:Lcom/tv91/u/b/x0/t1;

    invoke-virtual {v0, p1}, Lcom/tv91/u/b/x0/t1;->o(Lcom/tv91/model/a;)V

    return-void
.end method

.method public m(Lcom/tv91/model/a;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/tv91/model/a;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p1, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    sget-object v1, Lcom/tv91/model/a$a;->a:Lcom/tv91/model/a$a;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tv91/u/b/v0;->c:Lcom/tv91/u/b/x0/v1;

    invoke-virtual {v0, p1}, Lcom/tv91/u/b/x0/v1;->q(Lcom/tv91/model/a;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public n(Lcom/tv91/u/b/v0$c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/v0;->b:Lcom/tv91/u/b/x0/f1;

    invoke-virtual {v0, p1}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/b/v0;->c:Lcom/tv91/u/b/x0/v1;

    invoke-virtual {v0, p1}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/b/v0;->d:Lcom/tv91/u/b/x0/r1;

    invoke-virtual {v0, p1}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/b/v0;->e:Lcom/tv91/u/b/x0/t1;

    invoke-virtual {v0, p1}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    return-void
.end method

.method public o(Lcom/tv91/u/b/v0$c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/v0;->b:Lcom/tv91/u/b/x0/f1;

    invoke-virtual {v0, p1}, Lcom/tv91/q/b/d;->n(Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/b/v0;->c:Lcom/tv91/u/b/x0/v1;

    invoke-virtual {v0, p1}, Lcom/tv91/q/b/d;->n(Ljava/lang/Object;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/b/v0;->d:Lcom/tv91/u/b/x0/r1;

    invoke-virtual {v0, p1}, Lcom/tv91/q/b/d;->n(Ljava/lang/Object;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/b/v0;->e:Lcom/tv91/u/b/x0/t1;

    invoke-virtual {v0, p1}, Lcom/tv91/q/b/d;->n(Ljava/lang/Object;)V

    return-void
.end method

.method public p(Lcom/tv91/model/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/v0;->f:Lcom/tv91/u/b/x0/w1;

    invoke-virtual {v0, p1}, Lcom/tv91/u/b/x0/w1;->o(Lcom/tv91/model/a;)V

    return-void
.end method
