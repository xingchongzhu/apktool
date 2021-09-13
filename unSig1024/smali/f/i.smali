.class public Lf/i;
.super Lf/t;
.source "ForwardingTimeout.java"


# instance fields
.field private e:Lf/t;


# direct methods
.method public constructor <init>(Lf/t;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lf/t;-><init>()V

    if-eqz p1, :cond_0

    .line 2
    iput-object p1, p0, Lf/i;->e:Lf/t;

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "delegate == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Lf/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lf/i;->e:Lf/t;

    invoke-virtual {v0}, Lf/t;->a()Lf/t;

    move-result-object v0

    return-object v0
.end method

.method public b()Lf/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lf/i;->e:Lf/t;

    invoke-virtual {v0}, Lf/t;->b()Lf/t;

    move-result-object v0

    return-object v0
.end method

.method public c()J
    .locals 2

    .line 1
    iget-object v0, p0, Lf/i;->e:Lf/t;

    invoke-virtual {v0}, Lf/t;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public d(J)Lf/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lf/i;->e:Lf/t;

    invoke-virtual {v0, p1, p2}, Lf/t;->d(J)Lf/t;

    move-result-object p1

    return-object p1
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lf/i;->e:Lf/t;

    invoke-virtual {v0}, Lf/t;->e()Z

    move-result v0

    return v0
.end method

.method public f()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lf/i;->e:Lf/t;

    invoke-virtual {v0}, Lf/t;->f()V

    return-void
.end method

.method public g(JLjava/util/concurrent/TimeUnit;)Lf/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lf/i;->e:Lf/t;

    invoke-virtual {v0, p1, p2, p3}, Lf/t;->g(JLjava/util/concurrent/TimeUnit;)Lf/t;

    move-result-object p1

    return-object p1
.end method

.method public final i()Lf/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lf/i;->e:Lf/t;

    return-object v0
.end method

.method public final j(Lf/t;)Lf/i;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Lf/i;->e:Lf/t;

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "delegate == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
