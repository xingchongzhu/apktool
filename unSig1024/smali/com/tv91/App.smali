.class public Lcom/tv91/App;
.super Lcom/tv91/l;
.source "App.java"


# instance fields
.field b:Lcom/tv91/z/b;

.field c:Lcom/tv91/y/e;

.field d:Lcom/tv91/u/b/v0;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "arg"

    .line 1
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/l;-><init>()V

    return-void
.end method

.method public static b(Landroid/content/Context;)Lcom/tv91/App;
    .locals 1

    .line 1
    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 2
    check-cast p0, Landroid/app/Activity;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p0

    check-cast p0, Lcom/tv91/App;

    return-object p0

    .line 3
    :cond_0
    instance-of v0, p0, Landroid/app/Service;

    if-eqz v0, :cond_1

    .line 4
    check-cast p0, Landroid/app/Service;

    invoke-virtual {p0}, Landroid/app/Service;->getApplication()Landroid/app/Application;

    move-result-object p0

    check-cast p0, Lcom/tv91/App;

    return-object p0

    .line 5
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    check-cast p0, Lcom/tv91/App;

    return-object p0
.end method

.method private f()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/tv91/App;->c:Lcom/tv91/y/e;

    invoke-interface {v0}, Lcom/tv91/y/e;->c()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_5

    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/high16 v2, 0x7f110000

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v1
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    :try_start_1
    invoke-static {v1}, Lf/l;->i(Ljava/io/InputStream;)Lf/s;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 4
    :try_start_2
    invoke-static {v2}, Lf/l;->c(Lf/s;)Lf/e;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 5
    :try_start_3
    invoke-interface {v3}, Lf/e;->r()Ljava/lang/String;

    move-result-object v4

    .line 6
    invoke-static {v4}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 7
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 8
    iget-object v5, p0, Lcom/tv91/App;->c:Lcom/tv91/y/e;

    invoke-interface {v5, v4}, Lcom/tv91/y/e;->d(I)V

    goto :goto_0

    .line 9
    :cond_0
    iget-object v4, p0, Lcom/tv91/App;->c:Lcom/tv91/y/e;

    invoke-interface {v4, v0}, Lcom/tv91/y/e;->d(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 10
    :goto_0
    :try_start_4
    invoke-interface {v3}, Lf/s;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-eqz v2, :cond_1

    :try_start_5
    invoke-interface {v2}, Lf/s;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    :cond_1
    if-eqz v1, :cond_5

    :try_start_6
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    goto :goto_4

    :catchall_0
    move-exception v4

    .line 11
    :try_start_7
    throw v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :catchall_1
    move-exception v5

    if-eqz v3, :cond_2

    .line 12
    :try_start_8
    invoke-interface {v3}, Lf/s;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v3

    :try_start_9
    invoke-virtual {v4, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    throw v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :catchall_3
    move-exception v3

    .line 13
    :try_start_a
    throw v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :catchall_4
    move-exception v4

    if-eqz v2, :cond_3

    .line 14
    :try_start_b
    invoke-interface {v2}, Lf/s;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    goto :goto_2

    :catchall_5
    move-exception v2

    :try_start_c
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_2
    throw v4
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    :catchall_6
    move-exception v2

    .line 15
    :try_start_d
    throw v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    :catchall_7
    move-exception v3

    if-eqz v1, :cond_4

    .line 16
    :try_start_e
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    goto :goto_3

    :catchall_8
    move-exception v1

    :try_start_f
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_3
    throw v3
    :try_end_f
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_f .. :try_end_f} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_f .. :try_end_f} :catch_0
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_0

    .line 17
    :catch_0
    iget-object v1, p0, Lcom/tv91/App;->c:Lcom/tv91/y/e;

    invoke-interface {v1, v0}, Lcom/tv91/y/e;->d(I)V

    :cond_5
    :goto_4
    return-void
.end method

.method static synthetic h(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lh/a/a;->g(Ljava/lang/Throwable;)V

    return-void
.end method

.method private native loadApiUrl()Ljava/lang/String;
.end method

.method private native loadBackupApiUrl()Ljava/lang/String;
.end method

.method private native loadDomainName()Ljava/lang/String;
.end method

.method private native loadUmengKey()Ljava/lang/String;
.end method


# virtual methods
.method protected attachBaseContext(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Application;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/App;->e:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/App;->f:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/App;->g:Ljava/lang/String;

    return-object v0
.end method

.method public onCreate()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/tv91/App;->loadApiUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tv91/utils/g;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lcom/tv91/utils/g;->f([B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/App;->e:Ljava/lang/String;

    .line 2
    invoke-direct {p0}, Lcom/tv91/App;->loadBackupApiUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tv91/utils/g;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lcom/tv91/utils/g;->f([B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/App;->f:Ljava/lang/String;

    .line 3
    invoke-direct {p0}, Lcom/tv91/App;->loadDomainName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tv91/utils/g;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lcom/tv91/utils/g;->f([B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/App;->g:Ljava/lang/String;

    .line 4
    invoke-super {p0}, Lcom/tv91/l;->onCreate()V

    .line 5
    new-instance v0, Lcom/tv91/w/a;

    invoke-direct {v0}, Lcom/tv91/w/a;-><init>()V

    invoke-static {v0}, Lh/a/a;->e(Lh/a/a$b;)V

    .line 6
    sget-object v0, Lcom/tv91/a;->a:Lcom/tv91/a;

    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 7
    invoke-direct {p0}, Lcom/tv91/App;->f()V

    const/4 v0, 0x0

    .line 8
    invoke-static {v0}, Lcom/umeng/commonsdk/UMConfigure;->setLogEnabled(Z)V

    const/4 v0, 0x1

    .line 9
    invoke-static {v0}, Lcom/umeng/commonsdk/UMConfigure;->setEncryptEnabled(Z)V

    .line 10
    invoke-direct {p0}, Lcom/tv91/App;->loadUmengKey()Ljava/lang/String;

    move-result-object v1

    const-string v2, "91WEB"

    const-string v3, ""

    invoke-static {p0, v1, v2, v0, v3}, Lcom/umeng/commonsdk/UMConfigure;->init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 11
    sget-object v0, Lcom/umeng/analytics/MobclickAgent$PageMode;->LEGACY_MANUAL:Lcom/umeng/analytics/MobclickAgent$PageMode;

    invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->setPageCollectionMode(Lcom/umeng/analytics/MobclickAgent$PageMode;)V

    .line 12
    iget-object v0, p0, Lcom/tv91/App;->d:Lcom/tv91/u/b/v0;

    invoke-virtual {v0, p0}, Lcom/tv91/u/b/v0;->h(Landroid/content/Context;)V

    return-void
.end method
