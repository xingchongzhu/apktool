.class public final Lcom/google/android/exoplayer2/source/hls/v/g;
.super Lcom/google/android/exoplayer2/source/hls/v/h;
.source "HlsMediaPlaylist.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/hls/v/g$c;,
        Lcom/google/android/exoplayer2/source/hls/v/g$e;,
        Lcom/google/android/exoplayer2/source/hls/v/g$b;,
        Lcom/google/android/exoplayer2/source/hls/v/g$d;,
        Lcom/google/android/exoplayer2/source/hls/v/g$f;
    }
.end annotation


# instance fields
.field public final d:I

.field public final e:J

.field public final f:J

.field public final g:Z

.field public final h:I

.field public final i:J

.field public final j:I

.field public final k:J

.field public final l:J

.field public final m:Z

.field public final n:Z

.field public final o:Lc/a/a/a/e2/t;

.field public final p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/source/hls/v/g$d;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/source/hls/v/g$b;",
            ">;"
        }
    .end annotation
.end field

.field public final r:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/net/Uri;",
            "Lcom/google/android/exoplayer2/source/hls/v/g$c;",
            ">;"
        }
    .end annotation
.end field

.field public final s:J

.field public final t:Lcom/google/android/exoplayer2/source/hls/v/g$f;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/util/List;JJZIJIJJZZZLc/a/a/a/e2/t;Ljava/util/List;Ljava/util/List;Lcom/google/android/exoplayer2/source/hls/v/g$f;Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;JJZIJIJJZZZ",
            "Lc/a/a/a/e2/t;",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/source/hls/v/g$d;",
            ">;",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/source/hls/v/g$b;",
            ">;",
            "Lcom/google/android/exoplayer2/source/hls/v/g$f;",
            "Ljava/util/Map<",
            "Landroid/net/Uri;",
            "Lcom/google/android/exoplayer2/source/hls/v/g$c;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move/from16 v3, p17

    .line 1
    invoke-direct {p0, p2, p3, v3}, Lcom/google/android/exoplayer2/source/hls/v/h;-><init>(Ljava/lang/String;Ljava/util/List;Z)V

    move v1, p1

    .line 2
    iput v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->d:I

    move-wide v1, p6

    .line 3
    iput-wide v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->f:J

    move/from16 v1, p8

    .line 4
    iput-boolean v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->g:Z

    move/from16 v1, p9

    .line 5
    iput v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->h:I

    move-wide/from16 v1, p10

    .line 6
    iput-wide v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->i:J

    move/from16 v1, p12

    .line 7
    iput v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->j:I

    move-wide/from16 v1, p13

    .line 8
    iput-wide v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->k:J

    move-wide/from16 v1, p15

    .line 9
    iput-wide v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->l:J

    move/from16 v1, p18

    .line 10
    iput-boolean v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->m:Z

    move/from16 v1, p19

    .line 11
    iput-boolean v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->n:Z

    move-object/from16 v1, p20

    .line 12
    iput-object v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->o:Lc/a/a/a/e2/t;

    .line 13
    invoke-static/range {p21 .. p21}, Lc/a/b/b/r;->m(Ljava/util/Collection;)Lc/a/b/b/r;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    .line 14
    invoke-static/range {p22 .. p22}, Lc/a/b/b/r;->m(Ljava/util/Collection;)Lc/a/b/b/r;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->q:Ljava/util/List;

    .line 15
    invoke-static/range {p24 .. p24}, Lc/a/b/b/t;->c(Ljava/util/Map;)Lc/a/b/b/t;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->r:Ljava/util/Map;

    .line 16
    invoke-interface/range {p22 .. p22}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const-wide/16 v2, 0x0

    if-nez v1, :cond_0

    .line 17
    invoke-static/range {p22 .. p22}, Lc/a/b/b/w;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/exoplayer2/source/hls/v/g$b;

    .line 18
    iget-wide v4, v1, Lcom/google/android/exoplayer2/source/hls/v/g$e;->e:J

    iget-wide v6, v1, Lcom/google/android/exoplayer2/source/hls/v/g$e;->c:J

    add-long/2addr v4, v6

    iput-wide v4, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->s:J

    goto :goto_0

    .line 19
    :cond_0
    invoke-interface/range {p21 .. p21}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 20
    invoke-static/range {p21 .. p21}, Lc/a/b/b/w;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/exoplayer2/source/hls/v/g$d;

    .line 21
    iget-wide v4, v1, Lcom/google/android/exoplayer2/source/hls/v/g$e;->e:J

    iget-wide v6, v1, Lcom/google/android/exoplayer2/source/hls/v/g$e;->c:J

    add-long/2addr v4, v6

    iput-wide v4, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->s:J

    goto :goto_0

    .line 22
    :cond_1
    iput-wide v2, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->s:J

    :goto_0
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, p4, v4

    if-nez v1, :cond_2

    move-wide v1, v4

    goto :goto_1

    :cond_2
    cmp-long v1, p4, v2

    if-ltz v1, :cond_3

    move-wide v1, p4

    goto :goto_1

    .line 23
    :cond_3
    iget-wide v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->s:J

    add-long/2addr v1, p4

    :goto_1
    iput-wide v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->e:J

    move-object/from16 v1, p23

    .line 24
    iput-object v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->t:Lcom/google/android/exoplayer2/source/hls/v/g$f;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/util/List;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/source/hls/v/g;->b(Ljava/util/List;)Lcom/google/android/exoplayer2/source/hls/v/g;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/util/List;)Lcom/google/android/exoplayer2/source/hls/v/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/a/a/a/i2/c;",
            ">;)",
            "Lcom/google/android/exoplayer2/source/hls/v/g;"
        }
    .end annotation

    return-object p0
.end method

.method public c(JI)Lcom/google/android/exoplayer2/source/hls/v/g;
    .locals 27

    move-object/from16 v0, p0

    move-wide/from16 v7, p1

    move/from16 v10, p3

    .line 1
    new-instance v26, Lcom/google/android/exoplayer2/source/hls/v/g;

    move-object/from16 v1, v26

    iget v2, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->d:I

    iget-object v3, v0, Lcom/google/android/exoplayer2/source/hls/v/h;->a:Ljava/lang/String;

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/hls/v/h;->b:Ljava/util/List;

    iget-wide v5, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->e:J

    iget-wide v11, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->i:J

    iget v13, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->j:I

    iget-wide v14, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->k:J

    move-object/from16 p1, v1

    move/from16 p2, v2

    iget-wide v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->l:J

    move-wide/from16 v16, v1

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/source/hls/v/h;->c:Z

    move/from16 v18, v1

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->m:Z

    move/from16 v19, v1

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->n:Z

    move/from16 v20, v1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->o:Lc/a/a/a/e2/t;

    move-object/from16 v21, v1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    move-object/from16 v22, v1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->q:Ljava/util/List;

    move-object/from16 v23, v1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->t:Lcom/google/android/exoplayer2/source/hls/v/g$f;

    move-object/from16 v24, v1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->r:Ljava/util/Map;

    move-object/from16 v25, v1

    const/4 v9, 0x1

    move-object/from16 v1, p1

    move/from16 v2, p2

    invoke-direct/range {v1 .. v25}, Lcom/google/android/exoplayer2/source/hls/v/g;-><init>(ILjava/lang/String;Ljava/util/List;JJZIJIJJZZZLc/a/a/a/e2/t;Ljava/util/List;Ljava/util/List;Lcom/google/android/exoplayer2/source/hls/v/g$f;Ljava/util/Map;)V

    return-object v26
.end method

.method public d()Lcom/google/android/exoplayer2/source/hls/v/g;
    .locals 29

    move-object/from16 v0, p0

    .line 1
    iget-boolean v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->m:Z

    if-eqz v1, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v1, Lcom/google/android/exoplayer2/source/hls/v/g;

    move-object v2, v1

    iget v3, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->d:I

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/hls/v/h;->a:Ljava/lang/String;

    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/v/h;->b:Ljava/util/List;

    iget-wide v6, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->e:J

    iget-wide v8, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->f:J

    iget-boolean v10, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->g:Z

    iget v11, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->h:I

    iget-wide v12, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->i:J

    iget v14, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->j:I

    move-object/from16 v27, v1

    move-object/from16 v28, v2

    iget-wide v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->k:J

    move-wide v15, v1

    iget-wide v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->l:J

    move-wide/from16 v17, v1

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/source/hls/v/h;->c:Z

    move/from16 v19, v1

    const/16 v20, 0x1

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->n:Z

    move/from16 v21, v1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->o:Lc/a/a/a/e2/t;

    move-object/from16 v22, v1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    move-object/from16 v23, v1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->q:Ljava/util/List;

    move-object/from16 v24, v1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->t:Lcom/google/android/exoplayer2/source/hls/v/g$f;

    move-object/from16 v25, v1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->r:Ljava/util/Map;

    move-object/from16 v26, v1

    move-object/from16 v2, v28

    invoke-direct/range {v2 .. v26}, Lcom/google/android/exoplayer2/source/hls/v/g;-><init>(ILjava/lang/String;Ljava/util/List;JJZIJIJJZZZLc/a/a/a/e2/t;Ljava/util/List;Ljava/util/List;Lcom/google/android/exoplayer2/source/hls/v/g$f;Ljava/util/Map;)V

    return-object v27
.end method

.method public e()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->f:J

    iget-wide v2, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->s:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public f(Lcom/google/android/exoplayer2/source/hls/v/g;)Z
    .locals 7

    const/4 v0, 0x1

    if-eqz p1, :cond_5

    .line 1
    iget-wide v1, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->i:J

    iget-wide v3, p1, Lcom/google/android/exoplayer2/source/hls/v/g;->i:J

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    cmp-long v6, v1, v3

    if-gez v6, :cond_1

    return v5

    .line 2
    :cond_1
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p1, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v1, v2

    if-eqz v1, :cond_3

    if-lez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 3
    :cond_3
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->q:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    .line 4
    iget-object v2, p1, Lcom/google/android/exoplayer2/source/hls/v/g;->q:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-gt v1, v2, :cond_5

    if-ne v1, v2, :cond_4

    .line 5
    iget-boolean v1, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->m:Z

    if-eqz v1, :cond_4

    iget-boolean p1, p1, Lcom/google/android/exoplayer2/source/hls/v/g;->m:Z

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :cond_5
    :goto_1
    return v0
.end method
