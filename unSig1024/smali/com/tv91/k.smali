.class public final Lcom/tv91/k;
.super Lcom/tv91/i;
.source "DaggerApp_HiltComponents_SingletonC.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/k$c;,
        Lcom/tv91/k$b;,
        Lcom/tv91/k$d;
    }
.end annotation


# instance fields
.field private final a:Ld/a/b/d/c/a;

.field private volatile b:Ljava/lang/Object;

.field private volatile c:Ljava/lang/Object;

.field private volatile d:Ljava/lang/Object;

.field private volatile e:Ljava/lang/Object;

.field private volatile f:Ljava/lang/Object;

.field private volatile g:Ljava/lang/Object;

.field private volatile h:Ljava/lang/Object;

.field private volatile i:Ljava/lang/Object;

.field private volatile j:Ljava/lang/Object;

.field private volatile k:Ljava/lang/Object;

.field private volatile l:Ljava/lang/Object;

.field private volatile m:Ljava/lang/Object;

.field private volatile n:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Ld/a/b/d/c/a;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lcom/tv91/i;-><init>()V

    .line 3
    new-instance v0, Ld/b/b;

    invoke-direct {v0}, Ld/b/b;-><init>()V

    iput-object v0, p0, Lcom/tv91/k;->b:Ljava/lang/Object;

    .line 4
    new-instance v0, Ld/b/b;

    invoke-direct {v0}, Ld/b/b;-><init>()V

    iput-object v0, p0, Lcom/tv91/k;->c:Ljava/lang/Object;

    .line 5
    new-instance v0, Ld/b/b;

    invoke-direct {v0}, Ld/b/b;-><init>()V

    iput-object v0, p0, Lcom/tv91/k;->d:Ljava/lang/Object;

    .line 6
    new-instance v0, Ld/b/b;

    invoke-direct {v0}, Ld/b/b;-><init>()V

    iput-object v0, p0, Lcom/tv91/k;->e:Ljava/lang/Object;

    .line 7
    new-instance v0, Ld/b/b;

    invoke-direct {v0}, Ld/b/b;-><init>()V

    iput-object v0, p0, Lcom/tv91/k;->f:Ljava/lang/Object;

    .line 8
    new-instance v0, Ld/b/b;

    invoke-direct {v0}, Ld/b/b;-><init>()V

    iput-object v0, p0, Lcom/tv91/k;->g:Ljava/lang/Object;

    .line 9
    new-instance v0, Ld/b/b;

    invoke-direct {v0}, Ld/b/b;-><init>()V

    iput-object v0, p0, Lcom/tv91/k;->h:Ljava/lang/Object;

    .line 10
    new-instance v0, Ld/b/b;

    invoke-direct {v0}, Ld/b/b;-><init>()V

    iput-object v0, p0, Lcom/tv91/k;->i:Ljava/lang/Object;

    .line 11
    new-instance v0, Ld/b/b;

    invoke-direct {v0}, Ld/b/b;-><init>()V

    iput-object v0, p0, Lcom/tv91/k;->j:Ljava/lang/Object;

    .line 12
    new-instance v0, Ld/b/b;

    invoke-direct {v0}, Ld/b/b;-><init>()V

    iput-object v0, p0, Lcom/tv91/k;->k:Ljava/lang/Object;

    .line 13
    new-instance v0, Ld/b/b;

    invoke-direct {v0}, Ld/b/b;-><init>()V

    iput-object v0, p0, Lcom/tv91/k;->l:Ljava/lang/Object;

    .line 14
    new-instance v0, Ld/b/b;

    invoke-direct {v0}, Ld/b/b;-><init>()V

    iput-object v0, p0, Lcom/tv91/k;->m:Ljava/lang/Object;

    .line 15
    new-instance v0, Ld/b/b;

    invoke-direct {v0}, Ld/b/b;-><init>()V

    iput-object v0, p0, Lcom/tv91/k;->n:Ljava/lang/Object;

    .line 16
    iput-object p1, p0, Lcom/tv91/k;->a:Ld/a/b/d/c/a;

    return-void
.end method

.method synthetic constructor <init>(Ld/a/b/d/c/a;Lcom/tv91/k$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/k;-><init>(Ld/a/b/d/c/a;)V

    return-void
.end method

.method private A()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/k;->a:Ld/a/b/d/c/a;

    invoke-static {v0}, Ld/a/b/d/c/b;->a(Ld/a/b/d/c/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/tv91/v/h;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private B()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/k;->a:Ld/a/b/d/c/a;

    invoke-static {v0}, Ld/a/b/d/c/b;->a(Ld/a/b/d/c/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/tv91/v/i;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private C()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/k;->a:Ld/a/b/d/c/a;

    invoke-static {v0}, Ld/a/b/d/c/b;->a(Ld/a/b/d/c/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/tv91/v/g;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private D()Le/w;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/k;->b:Ljava/lang/Object;

    .line 2
    instance-of v1, v0, Ld/b/b;

    if-eqz v1, :cond_1

    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/tv91/k;->b:Ljava/lang/Object;

    .line 5
    instance-of v2, v1, Ld/b/b;

    if-eqz v2, :cond_0

    .line 6
    invoke-static {}, Lcom/tv91/v/b;->a()Le/w;

    move-result-object v1

    .line 7
    iget-object v2, p0, Lcom/tv91/k;->b:Ljava/lang/Object;

    invoke-static {v2, v1}, Ld/b/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/tv91/k;->b:Ljava/lang/Object;

    .line 8
    :cond_0
    monitor-exit v0

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 9
    :cond_1
    :goto_0
    check-cast v0, Le/w;

    return-object v0
.end method

.method private E()Lcom/tv91/u/b/x0/r1;
    .locals 4

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/r1;

    invoke-direct {p0}, Lcom/tv91/k;->t()Lcom/tv91/t/a;

    move-result-object v1

    invoke-direct {p0}, Lcom/tv91/k;->M()Lcom/tv91/z/h/a;

    move-result-object v2

    invoke-direct {p0}, Lcom/tv91/k;->y()Lcom/tv91/y/a;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/tv91/u/b/x0/r1;-><init>(Lcom/tv91/t/b;Lcom/tv91/z/c;Lcom/tv91/y/c;)V

    return-object v0
.end method

.method private F()Lcom/tv91/u/b/x0/t1;
    .locals 4

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/t1;

    invoke-direct {p0}, Lcom/tv91/k;->t()Lcom/tv91/t/a;

    move-result-object v1

    invoke-direct {p0}, Lcom/tv91/k;->M()Lcom/tv91/z/h/a;

    move-result-object v2

    invoke-direct {p0}, Lcom/tv91/k;->y()Lcom/tv91/y/a;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/tv91/u/b/x0/t1;-><init>(Lcom/tv91/t/b;Lcom/tv91/z/c;Lcom/tv91/y/c;)V

    return-object v0
.end method

.method private G()Landroid/content/SharedPreferences;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/k;->d:Ljava/lang/Object;

    .line 2
    instance-of v1, v0, Ld/b/b;

    if-eqz v1, :cond_1

    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/tv91/k;->d:Ljava/lang/Object;

    .line 5
    instance-of v2, v1, Ld/b/b;

    if-eqz v2, :cond_0

    .line 6
    iget-object v1, p0, Lcom/tv91/k;->a:Ld/a/b/d/c/a;

    invoke-static {v1}, Ld/a/b/d/c/b;->a(Ld/a/b/d/c/a;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/tv91/v/c;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 7
    iget-object v2, p0, Lcom/tv91/k;->d:Ljava/lang/Object;

    invoke-static {v2, v1}, Ld/b/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/tv91/k;->d:Ljava/lang/Object;

    .line 8
    :cond_0
    monitor-exit v0

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 9
    :cond_1
    :goto_0
    check-cast v0, Landroid/content/SharedPreferences;

    return-object v0
.end method

.method private H()Lcom/tv91/u/b/x0/v1;
    .locals 7

    .line 1
    new-instance v6, Lcom/tv91/u/b/x0/v1;

    invoke-direct {p0}, Lcom/tv91/k;->t()Lcom/tv91/t/a;

    move-result-object v1

    invoke-direct {p0}, Lcom/tv91/k;->L()Lcom/tv91/z/g/d;

    move-result-object v2

    invoke-direct {p0}, Lcom/tv91/k;->M()Lcom/tv91/z/h/a;

    move-result-object v3

    invoke-direct {p0}, Lcom/tv91/k;->K()Lcom/tv91/y/f;

    move-result-object v4

    invoke-direct {p0}, Lcom/tv91/k;->y()Lcom/tv91/y/a;

    move-result-object v5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/tv91/u/b/x0/v1;-><init>(Lcom/tv91/t/b;Lcom/tv91/z/b;Lcom/tv91/z/c;Lcom/tv91/y/h;Lcom/tv91/y/c;)V

    return-object v6
.end method

.method private I()Lcom/tv91/y/d;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/k;->e:Ljava/lang/Object;

    .line 2
    instance-of v1, v0, Ld/b/b;

    if-eqz v1, :cond_1

    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/tv91/k;->e:Ljava/lang/Object;

    .line 5
    instance-of v2, v1, Ld/b/b;

    if-eqz v2, :cond_0

    .line 6
    new-instance v1, Lcom/tv91/y/d;

    invoke-direct {p0}, Lcom/tv91/k;->G()Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/tv91/y/d;-><init>(Landroid/content/SharedPreferences;)V

    .line 7
    iget-object v2, p0, Lcom/tv91/k;->e:Ljava/lang/Object;

    invoke-static {v2, v1}, Ld/b/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/tv91/k;->e:Ljava/lang/Object;

    .line 8
    :cond_0
    monitor-exit v0

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 9
    :cond_1
    :goto_0
    check-cast v0, Lcom/tv91/y/d;

    return-object v0
.end method

.method private J()Lcom/tv91/u/b/x0/w1;
    .locals 3

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/w1;

    invoke-direct {p0}, Lcom/tv91/k;->t()Lcom/tv91/t/a;

    move-result-object v1

    invoke-direct {p0}, Lcom/tv91/k;->y()Lcom/tv91/y/a;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/tv91/u/b/x0/w1;-><init>(Lcom/tv91/t/b;Lcom/tv91/y/c;)V

    return-object v0
.end method

.method private K()Lcom/tv91/y/f;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/k;->g:Ljava/lang/Object;

    .line 2
    instance-of v1, v0, Ld/b/b;

    if-eqz v1, :cond_1

    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/tv91/k;->g:Ljava/lang/Object;

    .line 5
    instance-of v2, v1, Ld/b/b;

    if-eqz v2, :cond_0

    .line 6
    new-instance v1, Lcom/tv91/y/f;

    invoke-direct {p0}, Lcom/tv91/k;->G()Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/tv91/y/f;-><init>(Landroid/content/SharedPreferences;)V

    .line 7
    iget-object v2, p0, Lcom/tv91/k;->g:Ljava/lang/Object;

    invoke-static {v2, v1}, Ld/b/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/tv91/k;->g:Ljava/lang/Object;

    .line 8
    :cond_0
    monitor-exit v0

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 9
    :cond_1
    :goto_0
    check-cast v0, Lcom/tv91/y/f;

    return-object v0
.end method

.method private L()Lcom/tv91/z/g/d;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tv91/k;->c:Ljava/lang/Object;

    .line 2
    instance-of v1, v0, Ld/b/b;

    if-eqz v1, :cond_1

    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/tv91/k;->c:Ljava/lang/Object;

    .line 5
    instance-of v2, v1, Ld/b/b;

    if-eqz v2, :cond_0

    .line 6
    new-instance v1, Lcom/tv91/z/g/d;

    invoke-direct {p0}, Lcom/tv91/k;->D()Le/w;

    move-result-object v2

    invoke-direct {p0}, Lcom/tv91/k;->A()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/tv91/z/g/d;-><init>(Le/w;Ljava/lang/String;)V

    .line 7
    iget-object v2, p0, Lcom/tv91/k;->c:Ljava/lang/Object;

    invoke-static {v2, v1}, Ld/b/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/tv91/k;->c:Ljava/lang/Object;

    .line 8
    :cond_0
    monitor-exit v0

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 9
    :cond_1
    :goto_0
    check-cast v0, Lcom/tv91/z/g/d;

    return-object v0
.end method

.method private M()Lcom/tv91/z/h/a;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tv91/k;->k:Ljava/lang/Object;

    .line 2
    instance-of v1, v0, Ld/b/b;

    if-eqz v1, :cond_1

    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/tv91/k;->k:Ljava/lang/Object;

    .line 5
    instance-of v2, v1, Ld/b/b;

    if-eqz v2, :cond_0

    .line 6
    new-instance v1, Lcom/tv91/z/h/a;

    iget-object v2, p0, Lcom/tv91/k;->a:Ld/a/b/d/c/a;

    invoke-static {v2}, Ld/a/b/d/c/b;->a(Ld/a/b/d/c/a;)Landroid/content/Context;

    move-result-object v2

    invoke-direct {p0}, Lcom/tv91/k;->D()Le/w;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/tv91/z/h/a;-><init>(Landroid/content/Context;Le/w;)V

    .line 7
    iget-object v2, p0, Lcom/tv91/k;->k:Ljava/lang/Object;

    invoke-static {v2, v1}, Ld/b/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/tv91/k;->k:Ljava/lang/Object;

    .line 8
    :cond_0
    monitor-exit v0

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 9
    :cond_1
    :goto_0
    check-cast v0, Lcom/tv91/z/h/a;

    return-object v0
.end method

.method static synthetic f(Lcom/tv91/k;)Lcom/tv91/y/d;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/k;->I()Lcom/tv91/y/d;

    move-result-object p0

    return-object p0
.end method

.method static synthetic g(Lcom/tv91/k;)Lcom/tv91/t/a;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/k;->t()Lcom/tv91/t/a;

    move-result-object p0

    return-object p0
.end method

.method static synthetic h(Lcom/tv91/k;)Lcom/tv91/z/g/d;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/k;->L()Lcom/tv91/z/g/d;

    move-result-object p0

    return-object p0
.end method

.method static synthetic i(Lcom/tv91/k;)Lcom/tv91/y/f;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/k;->K()Lcom/tv91/y/f;

    move-result-object p0

    return-object p0
.end method

.method static synthetic j(Lcom/tv91/k;)Lcom/tv91/z/h/a;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/k;->M()Lcom/tv91/z/h/a;

    move-result-object p0

    return-object p0
.end method

.method static synthetic k(Lcom/tv91/k;)Lcom/tv91/y/a;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/k;->y()Lcom/tv91/y/a;

    move-result-object p0

    return-object p0
.end method

.method static synthetic l(Lcom/tv91/k;)Lcom/tv91/u/b/v0;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/k;->u()Lcom/tv91/u/b/v0;

    move-result-object p0

    return-object p0
.end method

.method static synthetic m(Lcom/tv91/k;)Lcom/tv91/u/b/x0/m1;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/k;->x()Lcom/tv91/u/b/x0/m1;

    move-result-object p0

    return-object p0
.end method

.method static synthetic n(Lcom/tv91/k;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/k;->B()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic o(Lcom/tv91/k;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/k;->C()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic p(Lcom/tv91/k;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/k;->A()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private q()Lcom/tv91/u/b/x0/f1;
    .locals 4

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/f1;

    invoke-direct {p0}, Lcom/tv91/k;->t()Lcom/tv91/t/a;

    move-result-object v1

    invoke-direct {p0}, Lcom/tv91/k;->K()Lcom/tv91/y/f;

    move-result-object v2

    invoke-direct {p0}, Lcom/tv91/k;->y()Lcom/tv91/y/a;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/tv91/u/b/x0/f1;-><init>(Lcom/tv91/t/b;Lcom/tv91/y/h;Lcom/tv91/y/c;)V

    return-object v0
.end method

.method public static r()Lcom/tv91/k$d;
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/k$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/tv91/k$d;-><init>(Lcom/tv91/k$a;)V

    return-object v0
.end method

.method private s()Lcom/tv91/y/i/a;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tv91/k;->i:Ljava/lang/Object;

    .line 2
    instance-of v1, v0, Ld/b/b;

    if-eqz v1, :cond_1

    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/tv91/k;->i:Ljava/lang/Object;

    .line 5
    instance-of v2, v1, Ld/b/b;

    if-eqz v2, :cond_0

    .line 6
    new-instance v1, Lcom/tv91/y/i/a;

    iget-object v2, p0, Lcom/tv91/k;->a:Ld/a/b/d/c/a;

    invoke-static {v2}, Ld/a/b/d/c/b;->a(Ld/a/b/d/c/a;)Landroid/content/Context;

    move-result-object v2

    invoke-direct {p0}, Lcom/tv91/k;->z()Z

    move-result v3

    invoke-direct {v1, v2, v3}, Lcom/tv91/y/i/a;-><init>(Landroid/content/Context;Z)V

    .line 7
    iget-object v2, p0, Lcom/tv91/k;->i:Ljava/lang/Object;

    invoke-static {v2, v1}, Ld/b/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/tv91/k;->i:Ljava/lang/Object;

    .line 8
    :cond_0
    monitor-exit v0

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 9
    :cond_1
    :goto_0
    check-cast v0, Lcom/tv91/y/i/a;

    return-object v0
.end method

.method private t()Lcom/tv91/t/a;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/k;->f:Ljava/lang/Object;

    .line 2
    instance-of v1, v0, Ld/b/b;

    if-eqz v1, :cond_1

    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/tv91/k;->f:Ljava/lang/Object;

    .line 5
    instance-of v2, v1, Ld/b/b;

    if-eqz v2, :cond_0

    .line 6
    new-instance v1, Lcom/tv91/t/a;

    invoke-direct {v1}, Lcom/tv91/t/a;-><init>()V

    .line 7
    iget-object v2, p0, Lcom/tv91/k;->f:Ljava/lang/Object;

    invoke-static {v2, v1}, Ld/b/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/tv91/k;->f:Ljava/lang/Object;

    .line 8
    :cond_0
    monitor-exit v0

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 9
    :cond_1
    :goto_0
    check-cast v0, Lcom/tv91/t/a;

    return-object v0
.end method

.method private u()Lcom/tv91/u/b/v0;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/tv91/k;->l:Ljava/lang/Object;

    .line 2
    instance-of v1, v0, Ld/b/b;

    if-eqz v1, :cond_1

    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/tv91/k;->l:Ljava/lang/Object;

    .line 5
    instance-of v2, v1, Ld/b/b;

    if-eqz v2, :cond_0

    .line 6
    new-instance v1, Lcom/tv91/u/b/v0;

    invoke-direct {p0}, Lcom/tv91/k;->x()Lcom/tv91/u/b/x0/m1;

    move-result-object v4

    invoke-direct {p0}, Lcom/tv91/k;->q()Lcom/tv91/u/b/x0/f1;

    move-result-object v5

    invoke-direct {p0}, Lcom/tv91/k;->H()Lcom/tv91/u/b/x0/v1;

    move-result-object v6

    invoke-direct {p0}, Lcom/tv91/k;->E()Lcom/tv91/u/b/x0/r1;

    move-result-object v7

    invoke-direct {p0}, Lcom/tv91/k;->F()Lcom/tv91/u/b/x0/t1;

    move-result-object v8

    invoke-direct {p0}, Lcom/tv91/k;->J()Lcom/tv91/u/b/x0/w1;

    move-result-object v9

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, Lcom/tv91/u/b/v0;-><init>(Lcom/tv91/u/b/x0/m1;Lcom/tv91/u/b/x0/f1;Lcom/tv91/u/b/x0/v1;Lcom/tv91/u/b/x0/r1;Lcom/tv91/u/b/x0/t1;Lcom/tv91/u/b/x0/w1;)V

    .line 7
    iget-object v2, p0, Lcom/tv91/k;->l:Ljava/lang/Object;

    invoke-static {v2, v1}, Ld/b/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/tv91/k;->l:Ljava/lang/Object;

    .line 8
    :cond_0
    monitor-exit v0

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 9
    :cond_1
    :goto_0
    check-cast v0, Lcom/tv91/u/b/v0;

    return-object v0
.end method

.method private v()Lcom/tv91/z/i/a;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/k;->n:Ljava/lang/Object;

    .line 2
    instance-of v1, v0, Ld/b/b;

    if-eqz v1, :cond_1

    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/tv91/k;->n:Ljava/lang/Object;

    .line 5
    instance-of v2, v1, Ld/b/b;

    if-eqz v2, :cond_0

    .line 6
    new-instance v1, Lcom/tv91/z/i/a;

    iget-object v2, p0, Lcom/tv91/k;->a:Ld/a/b/d/c/a;

    invoke-static {v2}, Ld/a/b/d/c/b;->a(Ld/a/b/d/c/a;)Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/tv91/z/i/a;-><init>(Landroid/content/Context;)V

    .line 7
    iget-object v2, p0, Lcom/tv91/k;->n:Ljava/lang/Object;

    invoke-static {v2, v1}, Ld/b/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/tv91/k;->n:Ljava/lang/Object;

    .line 8
    :cond_0
    monitor-exit v0

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 9
    :cond_1
    :goto_0
    check-cast v0, Lcom/tv91/z/i/a;

    return-object v0
.end method

.method private w(Lcom/tv91/App;)Lcom/tv91/App;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tv91/k;->L()Lcom/tv91/z/g/d;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tv91/j;->a(Lcom/tv91/App;Lcom/tv91/z/b;)V

    .line 2
    invoke-direct {p0}, Lcom/tv91/k;->I()Lcom/tv91/y/d;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tv91/j;->c(Lcom/tv91/App;Lcom/tv91/y/e;)V

    .line 3
    invoke-direct {p0}, Lcom/tv91/k;->u()Lcom/tv91/u/b/v0;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tv91/j;->b(Lcom/tv91/App;Lcom/tv91/u/b/v0;)V

    return-object p1
.end method

.method private x()Lcom/tv91/u/b/x0/m1;
    .locals 4

    .line 1
    new-instance v0, Lcom/tv91/u/b/x0/m1;

    invoke-direct {p0}, Lcom/tv91/k;->t()Lcom/tv91/t/a;

    move-result-object v1

    invoke-direct {p0}, Lcom/tv91/k;->K()Lcom/tv91/y/f;

    move-result-object v2

    invoke-direct {p0}, Lcom/tv91/k;->y()Lcom/tv91/y/a;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/tv91/u/b/x0/m1;-><init>(Lcom/tv91/t/b;Lcom/tv91/y/h;Lcom/tv91/y/c;)V

    return-object v0
.end method

.method private y()Lcom/tv91/y/a;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/k;->j:Ljava/lang/Object;

    .line 2
    instance-of v1, v0, Ld/b/b;

    if-eqz v1, :cond_1

    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/tv91/k;->j:Ljava/lang/Object;

    .line 5
    instance-of v2, v1, Ld/b/b;

    if-eqz v2, :cond_0

    .line 6
    new-instance v1, Lcom/tv91/y/a;

    invoke-direct {p0}, Lcom/tv91/k;->s()Lcom/tv91/y/i/a;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/tv91/y/a;-><init>(Lcom/tv91/y/i/a;)V

    .line 7
    iget-object v2, p0, Lcom/tv91/k;->j:Ljava/lang/Object;

    invoke-static {v2, v1}, Ld/b/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/tv91/k;->j:Ljava/lang/Object;

    .line 8
    :cond_0
    monitor-exit v0

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 9
    :cond_1
    :goto_0
    check-cast v0, Lcom/tv91/y/a;

    return-object v0
.end method

.method private z()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/k;->h:Ljava/lang/Object;

    .line 2
    instance-of v1, v0, Ld/b/b;

    if-eqz v1, :cond_1

    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/tv91/k;->h:Ljava/lang/Object;

    .line 5
    instance-of v2, v1, Ld/b/b;

    if-eqz v2, :cond_0

    .line 6
    invoke-static {}, Lcom/tv91/v/a;->a()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 7
    iget-object v2, p0, Lcom/tv91/k;->h:Ljava/lang/Object;

    invoke-static {v2, v1}, Ld/b/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/tv91/k;->h:Ljava/lang/Object;

    .line 8
    :cond_0
    monitor-exit v0

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 9
    :cond_1
    :goto_0
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a()Landroid/view/animation/Animation;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/k;->a:Ld/a/b/d/c/a;

    invoke-static {v0}, Ld/a/b/d/c/b;->a(Ld/a/b/d/c/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/tv91/v/j;->a(Landroid/content/Context;)Landroid/view/animation/Animation;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/tv91/App;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/k;->w(Lcom/tv91/App;)Lcom/tv91/App;

    return-void
.end method

.method public c()Lcom/tv91/x/i;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/k;->m:Ljava/lang/Object;

    .line 2
    instance-of v1, v0, Ld/b/b;

    if-eqz v1, :cond_1

    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/tv91/k;->m:Ljava/lang/Object;

    .line 5
    instance-of v2, v1, Ld/b/b;

    if-eqz v2, :cond_0

    .line 6
    new-instance v1, Lcom/tv91/x/i;

    invoke-direct {v1}, Lcom/tv91/x/i;-><init>()V

    .line 7
    iget-object v2, p0, Lcom/tv91/k;->m:Ljava/lang/Object;

    invoke-static {v2, v1}, Ld/b/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/tv91/k;->m:Ljava/lang/Object;

    .line 8
    :cond_0
    monitor-exit v0

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 9
    :cond_1
    :goto_0
    check-cast v0, Lcom/tv91/x/i;

    return-object v0
.end method

.method public d()Lcom/tv91/z/f;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tv91/k;->v()Lcom/tv91/z/i/a;

    move-result-object v0

    return-object v0
.end method

.method public e()Ld/a/b/d/b/b;
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/k$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/tv91/k$b;-><init>(Lcom/tv91/k;Lcom/tv91/k$a;)V

    return-object v0
.end method
