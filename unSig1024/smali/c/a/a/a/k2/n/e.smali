.class abstract Lc/a/a/a/k2/n/e;
.super Ljava/lang/Object;
.source "CeaDecoder.java"

# interfaces
.implements Lc/a/a/a/k2/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/k2/n/e$c;,
        Lc/a/a/a/k2/n/e$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lc/a/a/a/k2/n/e$b;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lc/a/a/a/k2/k;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/PriorityQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/PriorityQueue<",
            "Lc/a/a/a/k2/n/e$b;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lc/a/a/a/k2/n/e$b;

.field private e:J

.field private f:J


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lc/a/a/a/k2/n/e;->a:Ljava/util/ArrayDeque;

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0xa

    if-ge v1, v2, :cond_0

    .line 3
    iget-object v2, p0, Lc/a/a/a/k2/n/e;->a:Ljava/util/ArrayDeque;

    new-instance v3, Lc/a/a/a/k2/n/e$b;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lc/a/a/a/k2/n/e$b;-><init>(Lc/a/a/a/k2/n/e$a;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 4
    :cond_0
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v1, p0, Lc/a/a/a/k2/n/e;->b:Ljava/util/ArrayDeque;

    :goto_1
    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 5
    iget-object v1, p0, Lc/a/a/a/k2/n/e;->b:Ljava/util/ArrayDeque;

    new-instance v2, Lc/a/a/a/k2/n/e$c;

    new-instance v3, Lc/a/a/a/k2/n/b;

    invoke-direct {v3, p0}, Lc/a/a/a/k2/n/b;-><init>(Lc/a/a/a/k2/n/e;)V

    invoke-direct {v2, v3}, Lc/a/a/a/k2/n/e$c;-><init>(Lc/a/a/a/c2/h$a;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 6
    :cond_1
    new-instance v0, Ljava/util/PriorityQueue;

    invoke-direct {v0}, Ljava/util/PriorityQueue;-><init>()V

    iput-object v0, p0, Lc/a/a/a/k2/n/e;->c:Ljava/util/PriorityQueue;

    return-void
.end method

.method private n(Lc/a/a/a/k2/n/e$b;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/c2/f;->f()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/k2/n/e;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lc/a/a/a/k2/n/e;->e:J

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/c2/e;
        }
    .end annotation

    .line 1
    check-cast p1, Lc/a/a/a/k2/j;

    invoke-virtual {p0, p1}, Lc/a/a/a/k2/n/e;->m(Lc/a/a/a/k2/j;)V

    return-void
.end method

.method public bridge synthetic d()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/c2/e;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/k2/n/e;->i()Lc/a/a/a/k2/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/c2/e;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/k2/n/e;->h()Lc/a/a/a/k2/j;

    move-result-object v0

    return-object v0
.end method

.method protected abstract f()Lc/a/a/a/k2/f;
.end method

.method public flush()V
    .locals 2

    const-wide/16 v0, 0x0

    .line 1
    iput-wide v0, p0, Lc/a/a/a/k2/n/e;->f:J

    .line 2
    iput-wide v0, p0, Lc/a/a/a/k2/n/e;->e:J

    .line 3
    :goto_0
    iget-object v0, p0, Lc/a/a/a/k2/n/e;->c:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lc/a/a/a/k2/n/e;->c:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/k2/n/e$b;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/k2/n/e$b;

    invoke-direct {p0, v0}, Lc/a/a/a/k2/n/e;->n(Lc/a/a/a/k2/n/e$b;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lc/a/a/a/k2/n/e;->d:Lc/a/a/a/k2/n/e$b;

    if-eqz v0, :cond_1

    .line 6
    invoke-direct {p0, v0}, Lc/a/a/a/k2/n/e;->n(Lc/a/a/a/k2/n/e$b;)V

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lc/a/a/a/k2/n/e;->d:Lc/a/a/a/k2/n/e$b;

    :cond_1
    return-void
.end method

.method protected abstract g(Lc/a/a/a/k2/j;)V
.end method

.method public h()Lc/a/a/a/k2/j;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/k2/h;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/n/e;->d:Lc/a/a/a/k2/n/e$b;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/k2/n/e;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 3
    :cond_1
    iget-object v0, p0, Lc/a/a/a/k2/n/e;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/k2/n/e$b;

    iput-object v0, p0, Lc/a/a/a/k2/n/e;->d:Lc/a/a/a/k2/n/e$b;

    return-object v0
.end method

.method public i()Lc/a/a/a/k2/k;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/k2/h;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/n/e;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    :goto_0
    iget-object v0, p0, Lc/a/a/a/k2/n/e;->c:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lc/a/a/a/k2/n/e;->c:Ljava/util/PriorityQueue;

    .line 3
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/k2/n/e$b;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/k2/n/e$b;

    iget-wide v2, v0, Lc/a/a/a/c2/f;->e:J

    iget-wide v4, p0, Lc/a/a/a/k2/n/e;->e:J

    cmp-long v0, v2, v4

    if-gtz v0, :cond_3

    .line 4
    iget-object v0, p0, Lc/a/a/a/k2/n/e;->c:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/k2/n/e$b;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/k2/n/e$b;

    .line 5
    invoke-virtual {v0}, Lc/a/a/a/c2/a;->k()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 6
    iget-object v1, p0, Lc/a/a/a/k2/n/e;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/k2/k;

    invoke-static {v1}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/k2/k;

    const/4 v2, 0x4

    .line 7
    invoke-virtual {v1, v2}, Lc/a/a/a/c2/a;->e(I)V

    .line 8
    invoke-direct {p0, v0}, Lc/a/a/a/k2/n/e;->n(Lc/a/a/a/k2/n/e$b;)V

    return-object v1

    .line 9
    :cond_1
    invoke-virtual {p0, v0}, Lc/a/a/a/k2/n/e;->g(Lc/a/a/a/k2/j;)V

    .line 10
    invoke-virtual {p0}, Lc/a/a/a/k2/n/e;->l()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 11
    invoke-virtual {p0}, Lc/a/a/a/k2/n/e;->f()Lc/a/a/a/k2/f;

    move-result-object v6

    .line 12
    iget-object v1, p0, Lc/a/a/a/k2/n/e;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/k2/k;

    invoke-static {v1}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/k2/k;

    .line 13
    iget-wide v4, v0, Lc/a/a/a/c2/f;->e:J

    const-wide v7, 0x7fffffffffffffffL

    move-object v3, v1

    invoke-virtual/range {v3 .. v8}, Lc/a/a/a/k2/k;->o(JLc/a/a/a/k2/f;J)V

    .line 14
    invoke-direct {p0, v0}, Lc/a/a/a/k2/n/e;->n(Lc/a/a/a/k2/n/e$b;)V

    return-object v1

    .line 15
    :cond_2
    invoke-direct {p0, v0}, Lc/a/a/a/k2/n/e;->n(Lc/a/a/a/k2/n/e$b;)V

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method protected final j()Lc/a/a/a/k2/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/n/e;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/k2/k;

    return-object v0
.end method

.method protected final k()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/k2/n/e;->e:J

    return-wide v0
.end method

.method protected abstract l()Z
.end method

.method public m(Lc/a/a/a/k2/j;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/k2/h;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/n/e;->d:Lc/a/a/a/k2/n/e$b;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lc/a/a/a/m2/f;->a(Z)V

    .line 2
    check-cast p1, Lc/a/a/a/k2/n/e$b;

    .line 3
    invoke-virtual {p1}, Lc/a/a/a/c2/a;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-direct {p0, p1}, Lc/a/a/a/k2/n/e;->n(Lc/a/a/a/k2/n/e$b;)V

    goto :goto_1

    .line 5
    :cond_1
    iget-wide v0, p0, Lc/a/a/a/k2/n/e;->f:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lc/a/a/a/k2/n/e;->f:J

    invoke-static {p1, v0, v1}, Lc/a/a/a/k2/n/e$b;->u(Lc/a/a/a/k2/n/e$b;J)J

    .line 6
    iget-object v0, p0, Lc/a/a/a/k2/n/e;->c:Ljava/util/PriorityQueue;

    invoke-virtual {v0, p1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    :goto_1
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lc/a/a/a/k2/n/e;->d:Lc/a/a/a/k2/n/e$b;

    return-void
.end method

.method protected o(Lc/a/a/a/k2/k;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lc/a/a/a/k2/k;->f()V

    .line 2
    iget-object v0, p0, Lc/a/a/a/k2/n/e;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void
.end method
