.class public Lc/a/a/a/o0;
.super Ljava/lang/Object;
.source "DefaultRenderersFactory.java"

# interfaces
.implements Lc/a/a/a/t1;


# instance fields
.field private final a:Landroid/content/Context;

.field private b:I

.field private c:J

.field private d:Z

.field private e:Lc/a/a/a/g2/u;

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/o0;->a:Landroid/content/Context;

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lc/a/a/a/o0;->b:I

    const-wide/16 v0, 0x1388

    .line 4
    iput-wide v0, p0, Lc/a/a/a/o0;->c:J

    .line 5
    sget-object p1, Lc/a/a/a/g2/u;->a:Lc/a/a/a/g2/u;

    iput-object p1, p0, Lc/a/a/a/o0;->e:Lc/a/a/a/g2/u;

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Handler;Lc/a/a/a/n2/z;Lc/a/a/a/b2/r;Lc/a/a/a/k2/l;Lc/a/a/a/h2/f;)[Lc/a/a/a/p1;
    .locals 12

    move-object v10, p0

    .line 1
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 2
    iget-object v1, v10, Lc/a/a/a/o0;->a:Landroid/content/Context;

    iget v2, v10, Lc/a/a/a/o0;->b:I

    iget-object v3, v10, Lc/a/a/a/o0;->e:Lc/a/a/a/g2/u;

    iget-boolean v4, v10, Lc/a/a/a/o0;->d:Z

    iget-wide v7, v10, Lc/a/a/a/o0;->c:J

    move-object v0, p0

    move-object v5, p1

    move-object v6, p2

    move-object v9, v11

    invoke-virtual/range {v0 .. v9}, Lc/a/a/a/o0;->h(Landroid/content/Context;ILc/a/a/a/g2/u;ZLandroid/os/Handler;Lc/a/a/a/n2/z;JLjava/util/ArrayList;)V

    .line 3
    iget-object v0, v10, Lc/a/a/a/o0;->a:Landroid/content/Context;

    iget-boolean v1, v10, Lc/a/a/a/o0;->i:Z

    iget-boolean v2, v10, Lc/a/a/a/o0;->j:Z

    iget-boolean v3, v10, Lc/a/a/a/o0;->k:Z

    .line 4
    invoke-virtual {p0, v0, v1, v2, v3}, Lc/a/a/a/o0;->c(Landroid/content/Context;ZZZ)Lc/a/a/a/b2/s;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 5
    iget-object v1, v10, Lc/a/a/a/o0;->a:Landroid/content/Context;

    iget v2, v10, Lc/a/a/a/o0;->b:I

    iget-object v3, v10, Lc/a/a/a/o0;->e:Lc/a/a/a/g2/u;

    iget-boolean v4, v10, Lc/a/a/a/o0;->d:Z

    move-object v0, p0

    move-object v6, p1

    move-object v7, p3

    move-object v8, v11

    invoke-virtual/range {v0 .. v8}, Lc/a/a/a/o0;->b(Landroid/content/Context;ILc/a/a/a/g2/u;ZLc/a/a/a/b2/s;Landroid/os/Handler;Lc/a/a/a/b2/r;Ljava/util/ArrayList;)V

    .line 6
    :cond_0
    iget-object v1, v10, Lc/a/a/a/o0;->a:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v3

    iget v4, v10, Lc/a/a/a/o0;->b:I

    move-object v0, p0

    move-object/from16 v2, p4

    move-object v5, v11

    invoke-virtual/range {v0 .. v5}, Lc/a/a/a/o0;->g(Landroid/content/Context;Lc/a/a/a/k2/l;Landroid/os/Looper;ILjava/util/ArrayList;)V

    .line 7
    iget-object v1, v10, Lc/a/a/a/o0;->a:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v3

    iget v4, v10, Lc/a/a/a/o0;->b:I

    move-object/from16 v2, p5

    invoke-virtual/range {v0 .. v5}, Lc/a/a/a/o0;->e(Landroid/content/Context;Lc/a/a/a/h2/f;Landroid/os/Looper;ILjava/util/ArrayList;)V

    .line 8
    iget-object v0, v10, Lc/a/a/a/o0;->a:Landroid/content/Context;

    iget v1, v10, Lc/a/a/a/o0;->b:I

    invoke-virtual {p0, v0, v1, v11}, Lc/a/a/a/o0;->d(Landroid/content/Context;ILjava/util/ArrayList;)V

    .line 9
    iget-object v0, v10, Lc/a/a/a/o0;->a:Landroid/content/Context;

    iget v1, v10, Lc/a/a/a/o0;->b:I

    move-object v2, p1

    invoke-virtual {p0, v0, p1, v1, v11}, Lc/a/a/a/o0;->f(Landroid/content/Context;Landroid/os/Handler;ILjava/util/ArrayList;)V

    const/4 v0, 0x0

    new-array v0, v0, [Lc/a/a/a/p1;

    .line 10
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc/a/a/a/p1;

    return-object v0
.end method

.method protected b(Landroid/content/Context;ILc/a/a/a/g2/u;ZLc/a/a/a/b2/s;Landroid/os/Handler;Lc/a/a/a/b2/r;Ljava/util/ArrayList;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Lc/a/a/a/g2/u;",
            "Z",
            "Lc/a/a/a/b2/s;",
            "Landroid/os/Handler;",
            "Lc/a/a/a/b2/r;",
            "Ljava/util/ArrayList<",
            "Lc/a/a/a/p1;",
            ">;)V"
        }
    .end annotation

    move-object v1, p0

    move/from16 v0, p2

    move-object/from16 v9, p8

    const-string v10, "DefaultRenderersFactory"

    .line 1
    const-class v11, Lc/a/a/a/b2/s;

    const-class v12, Lc/a/a/a/b2/r;

    new-instance v13, Lc/a/a/a/b2/b0;

    move-object v2, v13

    move-object v3, p1

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p5

    invoke-direct/range {v2 .. v8}, Lc/a/a/a/b2/b0;-><init>(Landroid/content/Context;Lc/a/a/a/g2/u;ZLandroid/os/Handler;Lc/a/a/a/b2/r;Lc/a/a/a/b2/s;)V

    .line 2
    iget-boolean v2, v1, Lc/a/a/a/o0;->f:Z

    invoke-virtual {v13, v2}, Lc/a/a/a/g2/t;->i0(Z)V

    .line 3
    iget-boolean v2, v1, Lc/a/a/a/o0;->g:Z

    invoke-virtual {v13, v2}, Lc/a/a/a/g2/t;->j0(Z)V

    .line 4
    iget-boolean v2, v1, Lc/a/a/a/o0;->h:Z

    invoke-virtual {v13, v2}, Lc/a/a/a/g2/t;->k0(Z)V

    .line 5
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v0, :cond_0

    return-void

    .line 6
    :cond_0
    invoke-virtual/range {p8 .. p8}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    add-int/lit8 v2, v2, -0x1

    :cond_1
    const/4 v0, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x1

    :try_start_0
    const-string v6, "com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer"

    .line 7
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    new-array v7, v4, [Ljava/lang/Class;

    .line 8
    const-class v8, Landroid/os/Handler;

    aput-object v8, v7, v0

    aput-object v12, v7, v5

    aput-object v11, v7, v3

    .line 9
    invoke-virtual {v6, v7}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6

    new-array v7, v4, [Ljava/lang/Object;

    aput-object p6, v7, v0

    aput-object p7, v7, v5

    aput-object p5, v7, v3

    .line 10
    invoke-virtual {v6, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lc/a/a/a/p1;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    add-int/lit8 v7, v2, 0x1

    .line 11
    :try_start_1
    invoke-virtual {v9, v2, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const-string v2, "Loaded LibopusAudioRenderer."

    .line 12
    invoke-static {v10, v2}, Lc/a/a/a/m2/t;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_0
    move v2, v7

    goto :goto_0

    :catch_1
    move-exception v0

    .line 13
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Error instantiating Opus extension"

    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_2
    :goto_0
    move v7, v2

    :goto_1
    :try_start_2
    const-string v2, "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer"

    .line 14
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    new-array v6, v4, [Ljava/lang/Class;

    .line 15
    const-class v8, Landroid/os/Handler;

    aput-object v8, v6, v0

    aput-object v12, v6, v5

    aput-object v11, v6, v3

    .line 16
    invoke-virtual {v2, v6}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    new-array v6, v4, [Ljava/lang/Object;

    aput-object p6, v6, v0

    aput-object p7, v6, v5

    aput-object p5, v6, v3

    .line 17
    invoke-virtual {v2, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/a/a/a/p1;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    add-int/lit8 v6, v7, 0x1

    .line 18
    :try_start_3
    invoke-virtual {v9, v7, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const-string v2, "Loaded LibflacAudioRenderer."

    .line 19
    invoke-static {v10, v2}, Lc/a/a/a/m2/t;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    goto :goto_3

    :catch_3
    move v7, v6

    goto :goto_2

    :catch_4
    move-exception v0

    .line 20
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Error instantiating FLAC extension"

    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_5
    :goto_2
    move v6, v7

    :goto_3
    :try_start_4
    const-string v2, "com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer"

    .line 21
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    new-array v7, v4, [Ljava/lang/Class;

    .line 22
    const-class v8, Landroid/os/Handler;

    aput-object v8, v7, v0

    aput-object v12, v7, v5

    aput-object v11, v7, v3

    .line 23
    invoke-virtual {v2, v7}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p6, v4, v0

    aput-object p7, v4, v5

    aput-object p5, v4, v3

    .line 24
    invoke-virtual {v2, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/p1;

    .line 25
    invoke-virtual {v9, v6, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const-string v0, "Loaded FfmpegAudioRenderer."

    .line 26
    invoke-static {v10, v0}, Lc/a/a/a/m2/t;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_6

    goto :goto_4

    :catch_6
    move-exception v0

    .line 27
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Error instantiating FFmpeg extension"

    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_7
    :goto_4
    return-void
.end method

.method protected c(Landroid/content/Context;ZZZ)Lc/a/a/a/b2/s;
    .locals 7

    .line 1
    new-instance v6, Lc/a/a/a/b2/y;

    .line 2
    invoke-static {p1}, Lc/a/a/a/b2/o;->b(Landroid/content/Context;)Lc/a/a/a/b2/o;

    move-result-object v1

    new-instance v2, Lc/a/a/a/b2/y$d;

    const/4 p1, 0x0

    new-array p1, p1, [Lc/a/a/a/b2/q;

    invoke-direct {v2, p1}, Lc/a/a/a/b2/y$d;-><init>([Lc/a/a/a/b2/q;)V

    move-object v0, v6

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lc/a/a/a/b2/y;-><init>(Lc/a/a/a/b2/o;Lc/a/a/a/b2/y$b;ZZZ)V

    return-object v6
.end method

.method protected d(Landroid/content/Context;ILjava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/util/ArrayList<",
            "Lc/a/a/a/p1;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance p1, Lc/a/a/a/n2/a0/b;

    invoke-direct {p1}, Lc/a/a/a/n2/a0/b;-><init>()V

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected e(Landroid/content/Context;Lc/a/a/a/h2/f;Landroid/os/Looper;ILjava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lc/a/a/a/h2/f;",
            "Landroid/os/Looper;",
            "I",
            "Ljava/util/ArrayList<",
            "Lc/a/a/a/p1;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance p1, Lc/a/a/a/h2/g;

    invoke-direct {p1, p2, p3}, Lc/a/a/a/h2/g;-><init>(Lc/a/a/a/h2/f;Landroid/os/Looper;)V

    invoke-virtual {p5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected f(Landroid/content/Context;Landroid/os/Handler;ILjava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/os/Handler;",
            "I",
            "Ljava/util/ArrayList<",
            "Lc/a/a/a/p1;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method protected g(Landroid/content/Context;Lc/a/a/a/k2/l;Landroid/os/Looper;ILjava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lc/a/a/a/k2/l;",
            "Landroid/os/Looper;",
            "I",
            "Ljava/util/ArrayList<",
            "Lc/a/a/a/p1;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance p1, Lc/a/a/a/k2/m;

    invoke-direct {p1, p2, p3}, Lc/a/a/a/k2/m;-><init>(Lc/a/a/a/k2/l;Landroid/os/Looper;)V

    invoke-virtual {p5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected h(Landroid/content/Context;ILc/a/a/a/g2/u;ZLandroid/os/Handler;Lc/a/a/a/n2/z;JLjava/util/ArrayList;)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Lc/a/a/a/g2/u;",
            "Z",
            "Landroid/os/Handler;",
            "Lc/a/a/a/n2/z;",
            "J",
            "Ljava/util/ArrayList<",
            "Lc/a/a/a/p1;",
            ">;)V"
        }
    .end annotation

    move-object v1, p0

    move/from16 v0, p2

    move-object/from16 v11, p9

    const-string v12, "DefaultRenderersFactory"

    .line 1
    const-class v13, Lc/a/a/a/n2/z;

    new-instance v14, Lc/a/a/a/n2/q;

    const/16 v10, 0x32

    move-object v2, v14

    move-object/from16 v3, p1

    move-object/from16 v4, p3

    move-wide/from16 v5, p7

    move/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    invoke-direct/range {v2 .. v10}, Lc/a/a/a/n2/q;-><init>(Landroid/content/Context;Lc/a/a/a/g2/u;JZLandroid/os/Handler;Lc/a/a/a/n2/z;I)V

    .line 2
    iget-boolean v2, v1, Lc/a/a/a/o0;->f:Z

    invoke-virtual {v14, v2}, Lc/a/a/a/g2/t;->i0(Z)V

    .line 3
    iget-boolean v2, v1, Lc/a/a/a/o0;->g:Z

    invoke-virtual {v14, v2}, Lc/a/a/a/g2/t;->j0(Z)V

    .line 4
    iget-boolean v2, v1, Lc/a/a/a/o0;->h:Z

    invoke-virtual {v14, v2}, Lc/a/a/a/g2/t;->k0(Z)V

    .line 5
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v0, :cond_0

    return-void

    .line 6
    :cond_0
    invoke-virtual/range {p9 .. p9}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    add-int/lit8 v2, v2, -0x1

    :cond_1
    const/16 v0, 0x32

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x1

    :try_start_0
    const-string v8, "com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer"

    .line 7
    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    new-array v9, v6, [Ljava/lang/Class;

    .line 8
    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v10, v9, v5

    const-class v10, Landroid/os/Handler;

    aput-object v10, v9, v7

    aput-object v13, v9, v3

    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v10, v9, v4

    .line 9
    invoke-virtual {v8, v9}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v8

    new-array v9, v6, [Ljava/lang/Object;

    .line 10
    invoke-static/range {p7 .. p8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    aput-object v10, v9, v5

    aput-object p5, v9, v7

    aput-object p6, v9, v3

    .line 11
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v4

    .line 12
    invoke-virtual {v8, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lc/a/a/a/p1;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    add-int/lit8 v9, v2, 0x1

    .line 13
    :try_start_1
    invoke-virtual {v11, v2, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const-string v2, "Loaded LibvpxVideoRenderer."

    .line 14
    invoke-static {v12, v2}, Lc/a/a/a/m2/t;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_0
    move v2, v9

    goto :goto_0

    :catch_1
    move-exception v0

    .line 15
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Error instantiating VP9 extension"

    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_2
    :goto_0
    move v9, v2

    :goto_1
    :try_start_2
    const-string v2, "com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer"

    .line 16
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    new-array v8, v6, [Ljava/lang/Class;

    .line 17
    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v10, v8, v5

    const-class v10, Landroid/os/Handler;

    aput-object v10, v8, v7

    aput-object v13, v8, v3

    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v10, v8, v4

    .line 18
    invoke-virtual {v2, v8}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    new-array v6, v6, [Ljava/lang/Object;

    .line 19
    invoke-static/range {p7 .. p8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v6, v5

    aput-object p5, v6, v7

    aput-object p6, v6, v3

    .line 20
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v4

    .line 21
    invoke-virtual {v2, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/p1;

    .line 22
    invoke-virtual {v11, v9, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const-string v0, "Loaded Libgav1VideoRenderer."

    .line 23
    invoke-static {v12, v0}, Lc/a/a/a/m2/t;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_2

    :catch_3
    move-exception v0

    .line 24
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Error instantiating AV1 extension"

    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_4
    :goto_2
    return-void
.end method
