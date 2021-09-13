.class public final Lcom/tv91/u/b/x0/o1;
.super Lcom/tv91/q/b/d;
.source "MoveDownloadUseCase.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/b/x0/o1$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/q/b/d<",
        "Lcom/tv91/u/b/x0/o1$e;",
        ">;"
    }
.end annotation


# instance fields
.field private final i:Lcom/tv91/z/c;

.field private final j:Lcom/tv91/y/c;


# direct methods
.method public constructor <init>(Lcom/tv91/t/b;Lcom/tv91/z/c;Lcom/tv91/y/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/q/b/d;-><init>(Lcom/tv91/t/b;)V

    .line 2
    iput-object p2, p0, Lcom/tv91/u/b/x0/o1;->i:Lcom/tv91/z/c;

    .line 3
    iput-object p3, p0, Lcom/tv91/u/b/x0/o1;->j:Lcom/tv91/y/c;

    return-void
.end method

.method private A()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/tv91/q/b/d;->d()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/u/b/x0/o1$e;

    .line 2
    invoke-interface {v1}, Lcom/tv91/u/b/x0/o1$e;->a()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private B(Lcom/tv91/model/a;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/tv91/q/b/d;->d()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/u/b/x0/o1$e;

    .line 2
    invoke-interface {v1, p1}, Lcom/tv91/u/b/x0/o1$e;->b(Lcom/tv91/model/a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic q(Lcom/tv91/u/b/x0/o1;)V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/b/x0/o1;->A()V

    return-void
.end method

.method private synthetic r(Lcom/tv91/model/a;Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/tv91/u/b/x0/b0;

    invoke-direct {v0, p0}, Lcom/tv91/u/b/x0/b0;-><init>(Lcom/tv91/u/b/x0/o1;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/tv91/u/b/x0/o1;->p(Lcom/tv91/model/a;Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)Lcom/tv91/model/a;

    move-result-object p1

    .line 3
    new-instance p2, Lcom/tv91/u/b/x0/c0;

    invoke-direct {p2, p0, p1}, Lcom/tv91/u/b/x0/c0;-><init>(Lcom/tv91/u/b/x0/o1;Lcom/tv91/model/a;)V

    invoke-virtual {p0, p2}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    new-instance p1, Lcom/tv91/u/b/x0/d0;

    invoke-direct {p1, p0}, Lcom/tv91/u/b/x0/d0;-><init>(Lcom/tv91/u/b/x0/o1;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 5
    :try_start_1
    new-instance p2, Lcom/tv91/u/b/x0/z;

    invoke-direct {p2, p0, p1}, Lcom/tv91/u/b/x0/z;-><init>(Lcom/tv91/u/b/x0/o1;Ljava/lang/Exception;)V

    invoke-virtual {p0, p2}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    new-instance p1, Lcom/tv91/u/b/x0/d0;

    invoke-direct {p1, p0}, Lcom/tv91/u/b/x0/d0;-><init>(Lcom/tv91/u/b/x0/o1;)V

    :goto_0
    invoke-virtual {p0, p1}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V

    return-void

    :goto_1
    new-instance p2, Lcom/tv91/u/b/x0/d0;

    invoke-direct {p2, p0}, Lcom/tv91/u/b/x0/d0;-><init>(Lcom/tv91/u/b/x0/o1;)V

    invoke-virtual {p0, p2}, Lcom/tv91/q/b/d;->l(Ljava/lang/Runnable;)V

    .line 7
    throw p1
.end method

.method private synthetic t(Lcom/tv91/model/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/o1;->B(Lcom/tv91/model/a;)V

    return-void
.end method

.method private synthetic v(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/s/c;

    invoke-direct {v0, p1}, Lcom/tv91/s/c;-><init>(Ljava/lang/Exception;)V

    invoke-direct {p0, v0}, Lcom/tv91/u/b/x0/o1;->y(Lcom/tv91/s/c;)V

    return-void
.end method

.method public static synthetic x(Lcom/tv91/u/b/x0/o1;)V
    .locals 0

    invoke-direct {p0}, Lcom/tv91/u/b/x0/o1;->z()V

    return-void
.end method

.method private y(Lcom/tv91/s/c;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/tv91/q/b/d;->d()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/u/b/x0/o1$e;

    .line 2
    invoke-interface {v1, p1}, Lcom/tv91/u/b/x0/o1$e;->d(Lcom/tv91/s/c;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/tv91/q/b/d;->d()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tv91/u/b/x0/o1$e;

    .line 2
    invoke-interface {v1}, Lcom/tv91/u/b/x0/o1$e;->c()V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/tv91/q/b/d;->a()V

    return-void
.end method


# virtual methods
.method public C(Lb/g/j/a;)Lcom/tv91/u/b/x0/o1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/s/c;",
            ">;)",
            "Lcom/tv91/u/b/x0/o1;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/o1$d;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/b/x0/o1$d;-><init>(Lcom/tv91/u/b/x0/o1;Lb/g/j/a;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    return-object p0
.end method

.method public D(Ljava/lang/Runnable;)Lcom/tv91/u/b/x0/o1;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/o1$b;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/b/x0/o1$b;-><init>(Lcom/tv91/u/b/x0/o1;Ljava/lang/Runnable;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    return-object p0
.end method

.method public E(Ljava/lang/Runnable;)Lcom/tv91/u/b/x0/o1;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/o1$a;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/b/x0/o1$a;-><init>(Lcom/tv91/u/b/x0/o1;Ljava/lang/Runnable;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    return-object p0
.end method

.method public F(Lb/g/j/a;)Lcom/tv91/u/b/x0/o1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/a;",
            ">;)",
            "Lcom/tv91/u/b/x0/o1;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/o1$c;

    invoke-direct {v0, p0, p1}, Lcom/tv91/u/b/x0/o1$c;-><init>(Lcom/tv91/u/b/x0/o1;Lb/g/j/a;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->m(Ljava/lang/Object;)V

    return-object p0
.end method

.method public o(Lcom/tv91/model/a;Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/a0;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/tv91/u/b/x0/a0;-><init>(Lcom/tv91/u/b/x0/o1;Lcom/tv91/model/a;Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/tv91/q/b/d;->j(Ljava/lang/Runnable;)V

    return-void
.end method

.method public p(Lcom/tv91/model/a;Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)Lcom/tv91/model/a;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/x0/o1;->i:Lcom/tv91/z/c;

    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-interface {v0, p1, v1, p3}, Lcom/tv91/z/c;->b(Lcom/tv91/model/a;Ljava/io/FileDescriptor;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V

    .line 3
    iget-object p2, p0, Lcom/tv91/u/b/x0/o1;->j:Lcom/tv91/y/c;

    invoke-interface {p2, p1, p3}, Lcom/tv91/y/c;->f(Lcom/tv91/model/a;Ljava/lang/String;)Lcom/tv91/model/a;

    move-result-object p1

    return-object p1
.end method

.method public synthetic s(Lcom/tv91/model/a;Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/tv91/u/b/x0/o1;->r(Lcom/tv91/model/a;Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic u(Lcom/tv91/model/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/o1;->t(Lcom/tv91/model/a;)V

    return-void
.end method

.method public synthetic w(Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/b/x0/o1;->v(Ljava/lang/Exception;)V

    return-void
.end method
