.class final Lc/a/a/a/n0;
.super Ljava/lang/Object;
.source "DefaultMediaClock.java"

# interfaces
.implements Lc/a/a/a/m2/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/n0$a;
    }
.end annotation


# instance fields
.field private final a:Lc/a/a/a/m2/f0;

.field private final b:Lc/a/a/a/n0$a;

.field private c:Lc/a/a/a/p1;

.field private d:Lc/a/a/a/m2/v;

.field private e:Z

.field private f:Z


# direct methods
.method public constructor <init>(Lc/a/a/a/n0$a;Lc/a/a/a/m2/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/n0;->b:Lc/a/a/a/n0$a;

    .line 3
    new-instance p1, Lc/a/a/a/m2/f0;

    invoke-direct {p1, p2}, Lc/a/a/a/m2/f0;-><init>(Lc/a/a/a/m2/g;)V

    iput-object p1, p0, Lc/a/a/a/n0;->a:Lc/a/a/a/m2/f0;

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lc/a/a/a/n0;->e:Z

    return-void
.end method

.method private e(Z)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/n0;->c:Lc/a/a/a/p1;

    if-eqz v0, :cond_1

    .line 2
    invoke-interface {v0}, Lc/a/a/a/p1;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lc/a/a/a/n0;->c:Lc/a/a/a/p1;

    .line 3
    invoke-interface {v0}, Lc/a/a/a/p1;->e()Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p1, :cond_1

    iget-object p1, p0, Lc/a/a/a/n0;->c:Lc/a/a/a/p1;

    .line 4
    invoke-interface {p1}, Lc/a/a/a/p1;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private j(Z)V
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Lc/a/a/a/n0;->e(Z)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lc/a/a/a/n0;->e:Z

    .line 3
    iget-boolean p1, p0, Lc/a/a/a/n0;->f:Z

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lc/a/a/a/n0;->a:Lc/a/a/a/m2/f0;

    invoke-virtual {p1}, Lc/a/a/a/m2/f0;->b()V

    :cond_0
    return-void

    .line 5
    :cond_1
    iget-object p1, p0, Lc/a/a/a/n0;->d:Lc/a/a/a/m2/v;

    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/m2/v;

    .line 6
    invoke-interface {p1}, Lc/a/a/a/m2/v;->w()J

    move-result-wide v0

    .line 7
    iget-boolean v2, p0, Lc/a/a/a/n0;->e:Z

    if-eqz v2, :cond_3

    .line 8
    iget-object v2, p0, Lc/a/a/a/n0;->a:Lc/a/a/a/m2/f0;

    invoke-virtual {v2}, Lc/a/a/a/m2/f0;->w()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-gez v4, :cond_2

    .line 9
    iget-object p1, p0, Lc/a/a/a/n0;->a:Lc/a/a/a/m2/f0;

    invoke-virtual {p1}, Lc/a/a/a/m2/f0;->d()V

    return-void

    :cond_2
    const/4 v2, 0x0

    .line 10
    iput-boolean v2, p0, Lc/a/a/a/n0;->e:Z

    .line 11
    iget-boolean v2, p0, Lc/a/a/a/n0;->f:Z

    if-eqz v2, :cond_3

    .line 12
    iget-object v2, p0, Lc/a/a/a/n0;->a:Lc/a/a/a/m2/f0;

    invoke-virtual {v2}, Lc/a/a/a/m2/f0;->b()V

    .line 13
    :cond_3
    iget-object v2, p0, Lc/a/a/a/n0;->a:Lc/a/a/a/m2/f0;

    invoke-virtual {v2, v0, v1}, Lc/a/a/a/m2/f0;->a(J)V

    .line 14
    invoke-interface {p1}, Lc/a/a/a/m2/v;->c()Lc/a/a/a/i1;

    move-result-object p1

    .line 15
    iget-object v0, p0, Lc/a/a/a/n0;->a:Lc/a/a/a/m2/f0;

    invoke-virtual {v0}, Lc/a/a/a/m2/f0;->c()Lc/a/a/a/i1;

    move-result-object v0

    invoke-virtual {p1, v0}, Lc/a/a/a/i1;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 16
    iget-object v0, p0, Lc/a/a/a/n0;->a:Lc/a/a/a/m2/f0;

    invoke-virtual {v0, p1}, Lc/a/a/a/m2/f0;->f(Lc/a/a/a/i1;)V

    .line 17
    iget-object v0, p0, Lc/a/a/a/n0;->b:Lc/a/a/a/n0$a;

    invoke-interface {v0, p1}, Lc/a/a/a/n0$a;->e(Lc/a/a/a/i1;)V

    :cond_4
    return-void
.end method


# virtual methods
.method public a(Lc/a/a/a/p1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/n0;->c:Lc/a/a/a/p1;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lc/a/a/a/n0;->d:Lc/a/a/a/m2/v;

    .line 3
    iput-object p1, p0, Lc/a/a/a/n0;->c:Lc/a/a/a/p1;

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lc/a/a/a/n0;->e:Z

    :cond_0
    return-void
.end method

.method public b(Lc/a/a/a/p1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/p0;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lc/a/a/a/p1;->u()Lc/a/a/a/m2/v;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v1, p0, Lc/a/a/a/n0;->d:Lc/a/a/a/m2/v;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    .line 3
    iput-object v0, p0, Lc/a/a/a/n0;->d:Lc/a/a/a/m2/v;

    .line 4
    iput-object p1, p0, Lc/a/a/a/n0;->c:Lc/a/a/a/p1;

    .line 5
    iget-object p1, p0, Lc/a/a/a/n0;->a:Lc/a/a/a/m2/f0;

    invoke-virtual {p1}, Lc/a/a/a/m2/f0;->c()Lc/a/a/a/i1;

    move-result-object p1

    invoke-interface {v0, p1}, Lc/a/a/a/m2/v;->f(Lc/a/a/a/i1;)V

    goto :goto_0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Multiple renderer media clocks enabled."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lc/a/a/a/p0;->e(Ljava/lang/RuntimeException;)Lc/a/a/a/p0;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public c()Lc/a/a/a/i1;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/n0;->d:Lc/a/a/a/m2/v;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lc/a/a/a/m2/v;->c()Lc/a/a/a/i1;

    move-result-object v0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/a/a/a/n0;->a:Lc/a/a/a/m2/f0;

    invoke-virtual {v0}, Lc/a/a/a/m2/f0;->c()Lc/a/a/a/i1;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public d(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/n0;->a:Lc/a/a/a/m2/f0;

    invoke-virtual {v0, p1, p2}, Lc/a/a/a/m2/f0;->a(J)V

    return-void
.end method

.method public f(Lc/a/a/a/i1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/n0;->d:Lc/a/a/a/m2/v;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lc/a/a/a/m2/v;->f(Lc/a/a/a/i1;)V

    .line 3
    iget-object p1, p0, Lc/a/a/a/n0;->d:Lc/a/a/a/m2/v;

    invoke-interface {p1}, Lc/a/a/a/m2/v;->c()Lc/a/a/a/i1;

    move-result-object p1

    .line 4
    :cond_0
    iget-object v0, p0, Lc/a/a/a/n0;->a:Lc/a/a/a/m2/f0;

    invoke-virtual {v0, p1}, Lc/a/a/a/m2/f0;->f(Lc/a/a/a/i1;)V

    return-void
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/n0;->f:Z

    .line 2
    iget-object v0, p0, Lc/a/a/a/n0;->a:Lc/a/a/a/m2/f0;

    invoke-virtual {v0}, Lc/a/a/a/m2/f0;->b()V

    return-void
.end method

.method public h()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/n0;->f:Z

    .line 2
    iget-object v0, p0, Lc/a/a/a/n0;->a:Lc/a/a/a/m2/f0;

    invoke-virtual {v0}, Lc/a/a/a/m2/f0;->d()V

    return-void
.end method

.method public i(Z)J
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lc/a/a/a/n0;->j(Z)V

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/n0;->w()J

    move-result-wide v0

    return-wide v0
.end method

.method public w()J
    .locals 2

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/n0;->e:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/a/a/a/n0;->a:Lc/a/a/a/m2/f0;

    invoke-virtual {v0}, Lc/a/a/a/m2/f0;->w()J

    move-result-wide v0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/a/a/a/n0;->d:Lc/a/a/a/m2/v;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/m2/v;

    invoke-interface {v0}, Lc/a/a/a/m2/v;->w()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method
