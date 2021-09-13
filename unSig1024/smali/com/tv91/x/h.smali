.class public final Lcom/tv91/x/h;
.super Ljava/lang/Object;
.source "Navigator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/x/h$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Lcom/tv91/x/c;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Landroidx/fragment/app/e;

.field private final c:Landroidx/fragment/app/n;

.field private final d:I


# direct methods
.method public constructor <init>(Landroidx/fragment/app/e;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/tv91/x/h;->a:Ljava/util/Deque;

    .line 3
    iput-object p1, p0, Lcom/tv91/x/h;->b:Landroidx/fragment/app/e;

    .line 4
    invoke-virtual {p1}, Landroidx/fragment/app/e;->t()Landroidx/fragment/app/n;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/x/h;->c:Landroidx/fragment/app/n;

    .line 5
    iput p2, p0, Lcom/tv91/x/h;->d:I

    return-void
.end method

.method public static b(Landroidx/fragment/app/Fragment;)Lcom/tv91/x/h;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Landroidx/fragment/app/Fragment;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->M1()Landroidx/fragment/app/e;

    move-result-object p0

    .line 2
    invoke-static {p0}, Lcom/tv91/x/i;->c(Landroid/content/Context;)Lcom/tv91/x/i;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tv91/x/i;->a(Landroidx/fragment/app/e;)Lcom/tv91/x/h;

    move-result-object p0

    return-object p0
.end method

.method public static varargs f(Landroidx/fragment/app/e;I[Lcom/tv91/x/c;)Lcom/tv91/x/h;
    .locals 1

    const-string v0, "activity can\'t be null."

    .line 1
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    invoke-static {p0}, Lcom/tv91/x/i;->c(Landroid/content/Context;)Lcom/tv91/x/i;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/tv91/x/i;->b(Landroidx/fragment/app/e;I)Lcom/tv91/x/h;

    move-result-object p0

    .line 3
    array-length p1, p2

    if-lez p1, :cond_0

    .line 4
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tv91/x/h;->i(Ljava/util/List;)V

    :cond_0
    return-object p0
.end method

.method private g(Lcom/tv91/x/h$b;Lcom/tv91/x/c;Lcom/tv91/x/c;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/tv91/x/h;->c:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->m()Landroidx/fragment/app/x;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/x;->m()Landroidx/fragment/app/x;

    move-result-object v0

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz p2, :cond_4

    .line 2
    sget-object v4, Lcom/tv91/x/h$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    const/4 v5, 0x0

    if-eq v4, v3, :cond_2

    if-eq v4, v2, :cond_1

    if-eq v4, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p2, v0, v5}, Lcom/tv91/x/c;->q(Landroidx/fragment/app/x;Z)V

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p2, v0, v5}, Lcom/tv91/x/c;->o(Landroidx/fragment/app/x;Z)V

    goto :goto_0

    .line 5
    :cond_2
    invoke-virtual {p2, v0, v5}, Lcom/tv91/x/c;->p(Landroidx/fragment/app/x;Z)V

    .line 6
    :goto_0
    iget-object v4, p0, Lcom/tv91/x/h;->c:Landroidx/fragment/app/n;

    invoke-virtual {p2}, Lcom/tv91/x/c;->m()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroidx/fragment/app/n;->i0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 7
    iget-object v5, p0, Lcom/tv91/x/h;->a:Ljava/util/Deque;

    invoke-interface {v5, p2}, Ljava/util/Deque;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 8
    invoke-virtual {v0, v4}, Landroidx/fragment/app/x;->o(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/x;

    goto :goto_1

    .line 9
    :cond_3
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->s0()Z

    move-result p2

    if-nez p2, :cond_4

    .line 10
    invoke-virtual {v0, v4}, Landroidx/fragment/app/x;->l(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/x;

    .line 11
    :cond_4
    :goto_1
    iget-object p2, p0, Lcom/tv91/x/h;->c:Landroidx/fragment/app/n;

    invoke-virtual {p3}, Lcom/tv91/x/c;->m()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v4}, Landroidx/fragment/app/n;->i0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p2

    .line 12
    sget-object v4, Lcom/tv91/x/h$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v4, p1

    if-eq p1, v3, :cond_7

    if-eq p1, v2, :cond_6

    if-eq p1, v1, :cond_5

    goto :goto_2

    .line 13
    :cond_5
    invoke-virtual {p3, v0, v3}, Lcom/tv91/x/c;->q(Landroidx/fragment/app/x;Z)V

    goto :goto_2

    .line 14
    :cond_6
    invoke-virtual {p3, v0, v3}, Lcom/tv91/x/c;->o(Landroidx/fragment/app/x;Z)V

    goto :goto_2

    .line 15
    :cond_7
    invoke-virtual {p3, v0, v3}, Lcom/tv91/x/c;->p(Landroidx/fragment/app/x;Z)V

    :goto_2
    if-nez p2, :cond_8

    .line 16
    invoke-virtual {p3}, Lcom/tv91/x/c;->l()Landroidx/fragment/app/Fragment;

    move-result-object p1

    .line 17
    iget p2, p0, Lcom/tv91/x/h;->d:I

    invoke-virtual {p3}, Lcom/tv91/x/c;->m()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p2, p1, p3}, Landroidx/fragment/app/x;->c(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/x;

    goto :goto_3

    .line 18
    :cond_8
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->y0()Z

    move-result p1

    if-eqz p1, :cond_9

    .line 19
    iget p1, p0, Lcom/tv91/x/h;->d:I

    invoke-virtual {p3}, Lcom/tv91/x/c;->l()Landroidx/fragment/app/Fragment;

    move-result-object p2

    invoke-virtual {p3}, Lcom/tv91/x/c;->m()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Landroidx/fragment/app/x;->q(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/x;

    goto :goto_3

    .line 20
    :cond_9
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->s0()Z

    move-result p1

    if-eqz p1, :cond_a

    .line 21
    invoke-virtual {v0, p2}, Landroidx/fragment/app/x;->g(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/x;

    .line 22
    :cond_a
    :goto_3
    invoke-virtual {v0}, Landroidx/fragment/app/x;->i()I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/x/h;->b:Landroidx/fragment/app/e;

    invoke-static {v0}, Lcom/tv91/x/i;->c(Landroid/content/Context;)Lcom/tv91/x/i;

    move-result-object v0

    iget-object v1, p0, Lcom/tv91/x/h;->b:Landroidx/fragment/app/e;

    invoke-virtual {v0, v1}, Lcom/tv91/x/i;->d(Landroidx/fragment/app/e;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/x/h;->a:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->clear()V

    .line 3
    iget-object v0, p0, Lcom/tv91/x/h;->b:Landroidx/fragment/app/e;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public c()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tv91/x/c;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedList;

    iget-object v1, p0, Lcom/tv91/x/h;->a:Ljava/util/Deque;

    invoke-direct {v0, v1}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public d()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tv91/x/h;->a:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/tv91/x/h;->a:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    sget-object v0, Lcom/tv91/x/h$b;->b:Lcom/tv91/x/h$b;

    iget-object v2, p0, Lcom/tv91/x/h;->a:Ljava/util/Deque;

    invoke-interface {v2}, Ljava/util/Deque;->pop()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tv91/x/c;

    iget-object v3, p0, Lcom/tv91/x/h;->a:Ljava/util/Deque;

    invoke-interface {v3}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tv91/x/c;

    invoke-direct {p0, v0, v2, v3}, Lcom/tv91/x/h;->g(Lcom/tv91/x/h$b;Lcom/tv91/x/c;Lcom/tv91/x/c;)V

    return v1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public e(Lcom/tv91/x/g;)V
    .locals 3

    .line 1
    instance-of v0, p1, Lcom/tv91/x/a;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Lcom/tv91/x/a;

    .line 3
    iget-object v0, p0, Lcom/tv91/x/h;->b:Landroidx/fragment/app/e;

    invoke-virtual {p1, v0}, Lcom/tv91/x/a;->l(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v1

    iget-object v2, p0, Lcom/tv91/x/h;->b:Landroidx/fragment/app/e;

    invoke-virtual {p1, v2}, Lcom/tv91/x/a;->m(Landroid/app/Activity;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lcom/tv91/x/c;

    if-eqz v0, :cond_1

    .line 5
    check-cast p1, Lcom/tv91/x/c;

    .line 6
    sget-object v0, Lcom/tv91/x/h$b;->a:Lcom/tv91/x/h$b;

    iget-object v1, p0, Lcom/tv91/x/h;->a:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/x/c;

    invoke-direct {p0, v0, v1, p1}, Lcom/tv91/x/h;->g(Lcom/tv91/x/h$b;Lcom/tv91/x/c;Lcom/tv91/x/c;)V

    .line 7
    iget-object v0, p0, Lcom/tv91/x/h;->a:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public h(Lcom/tv91/x/g;)V
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/tv91/x/c;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Lcom/tv91/x/c;

    .line 3
    sget-object v0, Lcom/tv91/x/h$b;->c:Lcom/tv91/x/h$b;

    iget-object v1, p0, Lcom/tv91/x/h;->a:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->pop()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/x/c;

    invoke-direct {p0, v0, v1, p1}, Lcom/tv91/x/h;->g(Lcom/tv91/x/h$b;Lcom/tv91/x/c;Lcom/tv91/x/c;)V

    .line 4
    iget-object v0, p0, Lcom/tv91/x/h;->a:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "only FragmentKey can perform replace top action"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public i(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/x/c;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/x/h;->a:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->clear()V

    .line 2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tv91/x/c;

    .line 3
    iget-object v1, p0, Lcom/tv91/x/h;->a:Ljava/util/Deque;

    invoke-interface {v1, v0}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/tv91/x/h;->a:Ljava/util/Deque;

    invoke-interface {p1}, Ljava/util/Deque;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    .line 5
    sget-object p1, Lcom/tv91/x/h$b;->c:Lcom/tv91/x/h$b;

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/tv91/x/h;->a:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/x/c;

    invoke-direct {p0, p1, v0, v1}, Lcom/tv91/x/h;->g(Lcom/tv91/x/h$b;Lcom/tv91/x/c;Lcom/tv91/x/c;)V

    :cond_1
    return-void
.end method
