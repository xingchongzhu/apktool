.class Lc/a/a/a/e2/r$g;
.super Ljava/lang/Object;
.source "DefaultDrmSessionManager.java"

# interfaces
.implements Lc/a/a/a/e2/q$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/e2/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "g"
.end annotation


# instance fields
.field final synthetic a:Lc/a/a/a/e2/r;


# direct methods
.method private constructor <init>(Lc/a/a/a/e2/r;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/e2/r$g;->a:Lc/a/a/a/e2/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lc/a/a/a/e2/r;Lc/a/a/a/e2/r$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lc/a/a/a/e2/r$g;-><init>(Lc/a/a/a/e2/r;)V

    return-void
.end method

.method static synthetic c(Lc/a/a/a/e2/q;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lc/a/a/a/e2/q;->d(Lc/a/a/a/e2/w$a;)V

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/a/e2/q;I)V
    .locals 6

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v2, 0x1

    if-ne p2, v2, :cond_0

    .line 1
    iget-object v3, p0, Lc/a/a/a/e2/r$g;->a:Lc/a/a/a/e2/r;

    invoke-static {v3}, Lc/a/a/a/e2/r;->k(Lc/a/a/a/e2/r;)J

    move-result-wide v3

    cmp-long v5, v3, v0

    if-eqz v5, :cond_0

    .line 2
    iget-object p2, p0, Lc/a/a/a/e2/r$g;->a:Lc/a/a/a/e2/r;

    invoke-static {p2}, Lc/a/a/a/e2/r;->l(Lc/a/a/a/e2/r;)Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 3
    iget-object p2, p0, Lc/a/a/a/e2/r$g;->a:Lc/a/a/a/e2/r;

    invoke-static {p2}, Lc/a/a/a/e2/r;->m(Lc/a/a/a/e2/r;)Landroid/os/Handler;

    move-result-object p2

    invoke-static {p2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Handler;

    new-instance v0, Lc/a/a/a/e2/d;

    invoke-direct {v0, p1}, Lc/a/a/a/e2/d;-><init>(Lc/a/a/a/e2/q;)V

    .line 4
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iget-object v3, p0, Lc/a/a/a/e2/r$g;->a:Lc/a/a/a/e2/r;

    invoke-static {v3}, Lc/a/a/a/e2/r;->k(Lc/a/a/a/e2/r;)J

    move-result-wide v3

    add-long/2addr v1, v3

    .line 5
    invoke-virtual {p2, v0, p1, v1, v2}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    goto/16 :goto_0

    :cond_0
    if-nez p2, :cond_4

    .line 6
    iget-object p2, p0, Lc/a/a/a/e2/r$g;->a:Lc/a/a/a/e2/r;

    invoke-static {p2}, Lc/a/a/a/e2/r;->i(Lc/a/a/a/e2/r;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 7
    iget-object p2, p0, Lc/a/a/a/e2/r$g;->a:Lc/a/a/a/e2/r;

    invoke-static {p2}, Lc/a/a/a/e2/r;->e(Lc/a/a/a/e2/r;)Lc/a/a/a/e2/q;

    move-result-object p2

    const/4 v3, 0x0

    if-ne p2, p1, :cond_1

    .line 8
    iget-object p2, p0, Lc/a/a/a/e2/r$g;->a:Lc/a/a/a/e2/r;

    invoke-static {p2, v3}, Lc/a/a/a/e2/r;->f(Lc/a/a/a/e2/r;Lc/a/a/a/e2/q;)Lc/a/a/a/e2/q;

    .line 9
    :cond_1
    iget-object p2, p0, Lc/a/a/a/e2/r$g;->a:Lc/a/a/a/e2/r;

    invoke-static {p2}, Lc/a/a/a/e2/r;->g(Lc/a/a/a/e2/r;)Lc/a/a/a/e2/q;

    move-result-object p2

    if-ne p2, p1, :cond_2

    .line 10
    iget-object p2, p0, Lc/a/a/a/e2/r$g;->a:Lc/a/a/a/e2/r;

    invoke-static {p2, v3}, Lc/a/a/a/e2/r;->h(Lc/a/a/a/e2/r;Lc/a/a/a/e2/q;)Lc/a/a/a/e2/q;

    .line 11
    :cond_2
    iget-object p2, p0, Lc/a/a/a/e2/r$g;->a:Lc/a/a/a/e2/r;

    invoke-static {p2}, Lc/a/a/a/e2/r;->j(Lc/a/a/a/e2/r;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-le p2, v2, :cond_3

    iget-object p2, p0, Lc/a/a/a/e2/r$g;->a:Lc/a/a/a/e2/r;

    invoke-static {p2}, Lc/a/a/a/e2/r;->j(Lc/a/a/a/e2/r;)Ljava/util/List;

    move-result-object p2

    const/4 v3, 0x0

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, p1, :cond_3

    .line 12
    iget-object p2, p0, Lc/a/a/a/e2/r$g;->a:Lc/a/a/a/e2/r;

    invoke-static {p2}, Lc/a/a/a/e2/r;->j(Lc/a/a/a/e2/r;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc/a/a/a/e2/q;

    invoke-virtual {p2}, Lc/a/a/a/e2/q;->A()V

    .line 13
    :cond_3
    iget-object p2, p0, Lc/a/a/a/e2/r$g;->a:Lc/a/a/a/e2/r;

    invoke-static {p2}, Lc/a/a/a/e2/r;->j(Lc/a/a/a/e2/r;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 14
    iget-object p2, p0, Lc/a/a/a/e2/r$g;->a:Lc/a/a/a/e2/r;

    invoke-static {p2}, Lc/a/a/a/e2/r;->k(Lc/a/a/a/e2/r;)J

    move-result-wide v2

    cmp-long p2, v2, v0

    if-eqz p2, :cond_4

    .line 15
    iget-object p2, p0, Lc/a/a/a/e2/r$g;->a:Lc/a/a/a/e2/r;

    invoke-static {p2}, Lc/a/a/a/e2/r;->m(Lc/a/a/a/e2/r;)Landroid/os/Handler;

    move-result-object p2

    invoke-static {p2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 16
    iget-object p2, p0, Lc/a/a/a/e2/r$g;->a:Lc/a/a/a/e2/r;

    invoke-static {p2}, Lc/a/a/a/e2/r;->l(Lc/a/a/a/e2/r;)Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :cond_4
    :goto_0
    return-void
.end method

.method public b(Lc/a/a/a/e2/q;I)V
    .locals 4

    .line 1
    iget-object p2, p0, Lc/a/a/a/e2/r$g;->a:Lc/a/a/a/e2/r;

    invoke-static {p2}, Lc/a/a/a/e2/r;->k(Lc/a/a/a/e2/r;)J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v0, v2

    if-eqz p2, :cond_0

    .line 2
    iget-object p2, p0, Lc/a/a/a/e2/r$g;->a:Lc/a/a/a/e2/r;

    invoke-static {p2}, Lc/a/a/a/e2/r;->l(Lc/a/a/a/e2/r;)Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 3
    iget-object p2, p0, Lc/a/a/a/e2/r$g;->a:Lc/a/a/a/e2/r;

    invoke-static {p2}, Lc/a/a/a/e2/r;->m(Lc/a/a/a/e2/r;)Landroid/os/Handler;

    move-result-object p2

    invoke-static {p2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
