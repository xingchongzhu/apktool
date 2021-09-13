.class public Lc/a/a/a/e2/r;
.super Ljava/lang/Object;
.source "DefaultDrmSessionManager.java"

# interfaces
.implements Lc/a/a/a/e2/y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/e2/r$c;,
        Lc/a/a/a/e2/r$g;,
        Lc/a/a/a/e2/r$f;,
        Lc/a/a/a/e2/r$d;,
        Lc/a/a/a/e2/r$e;,
        Lc/a/a/a/e2/r$b;
    }
.end annotation


# instance fields
.field private final c:Ljava/util/UUID;

.field private final d:Lc/a/a/a/e2/d0$c;

.field private final e:Lc/a/a/a/e2/i0;

.field private final f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Z

.field private final h:[I

.field private final i:Z

.field private final j:Lc/a/a/a/e2/r$f;

.field private final k:Lcom/google/android/exoplayer2/upstream/a0;

.field private final l:Lc/a/a/a/e2/r$g;

.field private final m:J

.field private final n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/a/e2/q;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/a/e2/q;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lc/a/a/a/e2/q;",
            ">;"
        }
    .end annotation
.end field

.field private q:I

.field private r:Lc/a/a/a/e2/d0;

.field private s:Lc/a/a/a/e2/q;

.field private t:Lc/a/a/a/e2/q;

.field private u:Landroid/os/Looper;

.field private v:Landroid/os/Handler;

.field private w:I

.field private x:[B

.field volatile y:Lc/a/a/a/e2/r$d;


# direct methods
.method private constructor <init>(Ljava/util/UUID;Lc/a/a/a/e2/d0$c;Lc/a/a/a/e2/i0;Ljava/util/HashMap;Z[IZLcom/google/android/exoplayer2/upstream/a0;J)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            "Lc/a/a/a/e2/d0$c;",
            "Lc/a/a/a/e2/i0;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z[IZ",
            "Lcom/google/android/exoplayer2/upstream/a0;",
            "J)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    sget-object v0, Lc/a/a/a/i0;->b:Ljava/util/UUID;

    invoke-virtual {v0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Use C.CLEARKEY_UUID instead"

    invoke-static {v0, v1}, Lc/a/a/a/m2/f;->b(ZLjava/lang/Object;)V

    .line 5
    iput-object p1, p0, Lc/a/a/a/e2/r;->c:Ljava/util/UUID;

    .line 6
    iput-object p2, p0, Lc/a/a/a/e2/r;->d:Lc/a/a/a/e2/d0$c;

    .line 7
    iput-object p3, p0, Lc/a/a/a/e2/r;->e:Lc/a/a/a/e2/i0;

    .line 8
    iput-object p4, p0, Lc/a/a/a/e2/r;->f:Ljava/util/HashMap;

    .line 9
    iput-boolean p5, p0, Lc/a/a/a/e2/r;->g:Z

    .line 10
    iput-object p6, p0, Lc/a/a/a/e2/r;->h:[I

    .line 11
    iput-boolean p7, p0, Lc/a/a/a/e2/r;->i:Z

    .line 12
    iput-object p8, p0, Lc/a/a/a/e2/r;->k:Lcom/google/android/exoplayer2/upstream/a0;

    .line 13
    new-instance p1, Lc/a/a/a/e2/r$f;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lc/a/a/a/e2/r$f;-><init>(Lc/a/a/a/e2/r;Lc/a/a/a/e2/r$a;)V

    iput-object p1, p0, Lc/a/a/a/e2/r;->j:Lc/a/a/a/e2/r$f;

    .line 14
    new-instance p1, Lc/a/a/a/e2/r$g;

    invoke-direct {p1, p0, p2}, Lc/a/a/a/e2/r$g;-><init>(Lc/a/a/a/e2/r;Lc/a/a/a/e2/r$a;)V

    iput-object p1, p0, Lc/a/a/a/e2/r;->l:Lc/a/a/a/e2/r$g;

    const/4 p1, 0x0

    .line 15
    iput p1, p0, Lc/a/a/a/e2/r;->w:I

    .line 16
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lc/a/a/a/e2/r;->n:Ljava/util/List;

    .line 17
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lc/a/a/a/e2/r;->o:Ljava/util/List;

    .line 18
    invoke-static {}, Lc/a/b/b/r0;->f()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/e2/r;->p:Ljava/util/Set;

    .line 19
    iput-wide p9, p0, Lc/a/a/a/e2/r;->m:J

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/UUID;Lc/a/a/a/e2/d0$c;Lc/a/a/a/e2/i0;Ljava/util/HashMap;Z[IZLcom/google/android/exoplayer2/upstream/a0;JLc/a/a/a/e2/r$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p10}, Lc/a/a/a/e2/r;-><init>(Ljava/util/UUID;Lc/a/a/a/e2/d0$c;Lc/a/a/a/e2/i0;Ljava/util/HashMap;Z[IZLcom/google/android/exoplayer2/upstream/a0;J)V

    return-void
.end method

.method static synthetic e(Lc/a/a/a/e2/r;)Lc/a/a/a/e2/q;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/e2/r;->s:Lc/a/a/a/e2/q;

    return-object p0
.end method

.method static synthetic f(Lc/a/a/a/e2/r;Lc/a/a/a/e2/q;)Lc/a/a/a/e2/q;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/e2/r;->s:Lc/a/a/a/e2/q;

    return-object p1
.end method

.method static synthetic g(Lc/a/a/a/e2/r;)Lc/a/a/a/e2/q;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/e2/r;->t:Lc/a/a/a/e2/q;

    return-object p0
.end method

.method static synthetic h(Lc/a/a/a/e2/r;Lc/a/a/a/e2/q;)Lc/a/a/a/e2/q;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/e2/r;->t:Lc/a/a/a/e2/q;

    return-object p1
.end method

.method static synthetic i(Lc/a/a/a/e2/r;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/e2/r;->n:Ljava/util/List;

    return-object p0
.end method

.method static synthetic j(Lc/a/a/a/e2/r;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/e2/r;->o:Ljava/util/List;

    return-object p0
.end method

.method static synthetic k(Lc/a/a/a/e2/r;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/e2/r;->m:J

    return-wide v0
.end method

.method static synthetic l(Lc/a/a/a/e2/r;)Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/e2/r;->p:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic m(Lc/a/a/a/e2/r;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/e2/r;->v:Landroid/os/Handler;

    return-object p0
.end method

.method private n(Lc/a/a/a/e2/t;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/e2/r;->x:[B

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object v0, p0, Lc/a/a/a/e2/r;->c:Ljava/util/UUID;

    invoke-static {p1, v0, v1}, Lc/a/a/a/e2/r;->q(Lc/a/a/a/e2/t;Ljava/util/UUID;Z)Ljava/util/List;

    move-result-object v0

    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 4
    iget v0, p1, Lc/a/a/a/e2/t;->d:I

    if-ne v0, v1, :cond_1

    invoke-virtual {p1, v2}, Lc/a/a/a/e2/t;->p(I)Lc/a/a/a/e2/t$b;

    move-result-object v0

    sget-object v3, Lc/a/a/a/i0;->b:Ljava/util/UUID;

    invoke-virtual {v0, v3}, Lc/a/a/a/e2/t$b;->n(Ljava/util/UUID;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DrmInitData only contains common PSSH SchemeData. Assuming support for: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lc/a/a/a/e2/r;->c:Ljava/util/UUID;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "DefaultDrmSessionMgr"

    invoke-static {v3, v0}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    return v2

    .line 6
    :cond_2
    :goto_0
    iget-object p1, p1, Lc/a/a/a/e2/t;->c:Ljava/lang/String;

    if-eqz p1, :cond_8

    const-string v0, "cenc"

    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    const-string v0, "cbcs"

    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 9
    sget p1, Lc/a/a/a/m2/m0;->a:I

    const/16 v0, 0x19

    if-lt p1, v0, :cond_4

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_1
    return v1

    :cond_5
    const-string v0, "cbc1"

    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, "cens"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_2

    :cond_6
    return v1

    :cond_7
    :goto_2
    return v2

    :cond_8
    :goto_3
    return v1
.end method

.method private o(Ljava/util/List;ZLc/a/a/a/e2/w$a;)Lc/a/a/a/e2/q;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/a/a/a/e2/t$b;",
            ">;Z",
            "Lc/a/a/a/e2/w$a;",
            ")",
            "Lc/a/a/a/e2/q;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lc/a/a/a/e2/r;->r:Lc/a/a/a/e2/d0;

    invoke-static {v1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-boolean v1, v0, Lc/a/a/a/e2/r;->i:Z

    or-int v9, v1, p2

    .line 3
    new-instance v1, Lc/a/a/a/e2/q;

    iget-object v3, v0, Lc/a/a/a/e2/r;->c:Ljava/util/UUID;

    iget-object v4, v0, Lc/a/a/a/e2/r;->r:Lc/a/a/a/e2/d0;

    iget-object v5, v0, Lc/a/a/a/e2/r;->j:Lc/a/a/a/e2/r$f;

    iget-object v6, v0, Lc/a/a/a/e2/r;->l:Lc/a/a/a/e2/r$g;

    iget v8, v0, Lc/a/a/a/e2/r;->w:I

    iget-object v11, v0, Lc/a/a/a/e2/r;->x:[B

    iget-object v12, v0, Lc/a/a/a/e2/r;->f:Ljava/util/HashMap;

    iget-object v13, v0, Lc/a/a/a/e2/r;->e:Lc/a/a/a/e2/i0;

    iget-object v2, v0, Lc/a/a/a/e2/r;->u:Landroid/os/Looper;

    .line 4
    invoke-static {v2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroid/os/Looper;

    iget-object v15, v0, Lc/a/a/a/e2/r;->k:Lcom/google/android/exoplayer2/upstream/a0;

    move-object v2, v1

    move-object/from16 v7, p1

    move/from16 v10, p2

    invoke-direct/range {v2 .. v15}, Lc/a/a/a/e2/q;-><init>(Ljava/util/UUID;Lc/a/a/a/e2/d0;Lc/a/a/a/e2/q$a;Lc/a/a/a/e2/q$b;Ljava/util/List;IZZ[BLjava/util/HashMap;Lc/a/a/a/e2/i0;Landroid/os/Looper;Lcom/google/android/exoplayer2/upstream/a0;)V

    move-object/from16 v2, p3

    .line 5
    invoke-virtual {v1, v2}, Lc/a/a/a/e2/q;->b(Lc/a/a/a/e2/w$a;)V

    .line 6
    iget-wide v2, v0, Lc/a/a/a/e2/r;->m:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v4

    if-eqz v6, :cond_0

    const/4 v2, 0x0

    .line 7
    invoke-virtual {v1, v2}, Lc/a/a/a/e2/q;->b(Lc/a/a/a/e2/w$a;)V

    :cond_0
    return-object v1
.end method

.method private p(Ljava/util/List;ZLc/a/a/a/e2/w$a;)Lc/a/a/a/e2/q;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/a/a/a/e2/t$b;",
            ">;Z",
            "Lc/a/a/a/e2/w$a;",
            ")",
            "Lc/a/a/a/e2/q;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lc/a/a/a/e2/r;->o(Ljava/util/List;ZLc/a/a/a/e2/w$a;)Lc/a/a/a/e2/q;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lc/a/a/a/e2/q;->getState()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_3

    sget v1, Lc/a/a/a/m2/m0;->a:I

    const/16 v2, 0x13

    if-lt v1, v2, :cond_0

    .line 3
    invoke-virtual {v0}, Lc/a/a/a/e2/q;->g()Lc/a/a/a/e2/v$a;

    move-result-object v1

    invoke-static {v1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/e2/v$a;

    invoke-virtual {v1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Landroid/media/ResourceBusyException;

    if-eqz v1, :cond_3

    .line 4
    :cond_0
    iget-object v1, p0, Lc/a/a/a/e2/r;->p:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    .line 5
    iget-object v1, p0, Lc/a/a/a/e2/r;->p:Ljava/util/Set;

    .line 6
    invoke-static {v1}, Lc/a/b/b/v;->k(Ljava/util/Collection;)Lc/a/b/b/v;

    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lc/a/b/b/p;->h()Lc/a/b/b/u0;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/a/a/a/e2/v;

    .line 8
    invoke-interface {v2, v3}, Lc/a/a/a/e2/v;->d(Lc/a/a/a/e2/w$a;)V

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {v0, p3}, Lc/a/a/a/e2/q;->d(Lc/a/a/a/e2/w$a;)V

    .line 10
    iget-wide v1, p0, Lc/a/a/a/e2/r;->m:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v1, v4

    if-eqz v6, :cond_2

    .line 11
    invoke-virtual {v0, v3}, Lc/a/a/a/e2/q;->d(Lc/a/a/a/e2/w$a;)V

    .line 12
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lc/a/a/a/e2/r;->o(Ljava/util/List;ZLc/a/a/a/e2/w$a;)Lc/a/a/a/e2/q;

    move-result-object v0

    :cond_3
    return-object v0
.end method

.method private static q(Lc/a/a/a/e2/t;Ljava/util/UUID;Z)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/e2/t;",
            "Ljava/util/UUID;",
            "Z)",
            "Ljava/util/List<",
            "Lc/a/a/a/e2/t$b;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    iget v1, p0, Lc/a/a/a/e2/t;->d:I

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 2
    :goto_0
    iget v3, p0, Lc/a/a/a/e2/t;->d:I

    if-ge v2, v3, :cond_4

    .line 3
    invoke-virtual {p0, v2}, Lc/a/a/a/e2/t;->p(I)Lc/a/a/a/e2/t$b;

    move-result-object v3

    .line 4
    invoke-virtual {v3, p1}, Lc/a/a/a/e2/t$b;->n(Ljava/util/UUID;)Z

    move-result v4

    if-nez v4, :cond_1

    sget-object v4, Lc/a/a/a/i0;->c:Ljava/util/UUID;

    .line 5
    invoke-virtual {v4, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v4, Lc/a/a/a/i0;->b:Ljava/util/UUID;

    invoke-virtual {v3, v4}, Lc/a/a/a/e2/t$b;->n(Ljava/util/UUID;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v4, 0x1

    :goto_2
    if-eqz v4, :cond_3

    .line 6
    iget-object v4, v3, Lc/a/a/a/e2/t$b;->e:[B

    if-nez v4, :cond_2

    if-eqz p2, :cond_3

    .line 7
    :cond_2
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return-object v0
.end method

.method private r(Landroid/os/Looper;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/e2/r;->u:Landroid/os/Looper;

    if-nez v0, :cond_0

    .line 2
    iput-object p1, p0, Lc/a/a/a/e2/r;->u:Landroid/os/Looper;

    .line 3
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lc/a/a/a/e2/r;->v:Landroid/os/Handler;

    goto :goto_1

    :cond_0
    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 4
    :goto_0
    invoke-static {p1}, Lc/a/a/a/m2/f;->f(Z)V

    :goto_1
    return-void
.end method

.method private s(I)Lc/a/a/a/e2/v;
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/e2/r;->r:Lc/a/a/a/e2/d0;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/e2/d0;

    .line 2
    const-class v1, Lc/a/a/a/e2/e0;

    .line 3
    invoke-interface {v0}, Lc/a/a/a/e2/d0;->b()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    sget-boolean v1, Lc/a/a/a/e2/e0;->a:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v3, 0x0

    if-nez v1, :cond_3

    .line 4
    iget-object v1, p0, Lc/a/a/a/e2/r;->h:[I

    .line 5
    invoke-static {v1, p1}, Lc/a/a/a/m2/m0;->o0([II)I

    move-result p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    const-class p1, Lc/a/a/a/e2/l0;

    .line 6
    invoke-interface {v0}, Lc/a/a/a/e2/d0;->b()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_2

    .line 7
    :cond_1
    iget-object p1, p0, Lc/a/a/a/e2/r;->s:Lc/a/a/a/e2/q;

    if-nez p1, :cond_2

    .line 8
    invoke-static {}, Lc/a/b/b/r;->p()Lc/a/b/b/r;

    move-result-object p1

    .line 9
    invoke-direct {p0, p1, v2, v3}, Lc/a/a/a/e2/r;->p(Ljava/util/List;ZLc/a/a/a/e2/w$a;)Lc/a/a/a/e2/q;

    move-result-object p1

    .line 10
    iget-object v0, p0, Lc/a/a/a/e2/r;->n:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    iput-object p1, p0, Lc/a/a/a/e2/r;->s:Lc/a/a/a/e2/q;

    goto :goto_1

    .line 12
    :cond_2
    invoke-virtual {p1, v3}, Lc/a/a/a/e2/q;->b(Lc/a/a/a/e2/w$a;)V

    .line 13
    :goto_1
    iget-object p1, p0, Lc/a/a/a/e2/r;->s:Lc/a/a/a/e2/q;

    return-object p1

    :cond_3
    :goto_2
    return-object v3
.end method

.method private t(Landroid/os/Looper;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/e2/r;->y:Lc/a/a/a/e2/r$d;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lc/a/a/a/e2/r$d;

    invoke-direct {v0, p0, p1}, Lc/a/a/a/e2/r$d;-><init>(Lc/a/a/a/e2/r;Landroid/os/Looper;)V

    iput-object v0, p0, Lc/a/a/a/e2/r;->y:Lc/a/a/a/e2/r$d;

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget v0, p0, Lc/a/a/a/e2/r;->q:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lc/a/a/a/e2/r;->q:I

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-wide v0, p0, Lc/a/a/a/e2/r;->m:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, 0x0

    cmp-long v5, v0, v2

    if-eqz v5, :cond_1

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lc/a/a/a/e2/r;->n:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v1, 0x0

    .line 4
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 5
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/a/a/a/e2/q;

    invoke-virtual {v2, v4}, Lc/a/a/a/e2/q;->d(Lc/a/a/a/e2/w$a;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lc/a/a/a/e2/r;->r:Lc/a/a/a/e2/d0;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/e2/d0;

    invoke-interface {v0}, Lc/a/a/a/e2/d0;->a()V

    .line 7
    iput-object v4, p0, Lc/a/a/a/e2/r;->r:Lc/a/a/a/e2/d0;

    return-void
.end method

.method public b(Landroid/os/Looper;Lc/a/a/a/e2/w$a;Lc/a/a/a/u0;)Lc/a/a/a/e2/v;
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lc/a/a/a/e2/r;->r(Landroid/os/Looper;)V

    .line 2
    invoke-direct {p0, p1}, Lc/a/a/a/e2/r;->t(Landroid/os/Looper;)V

    .line 3
    iget-object p1, p3, Lc/a/a/a/u0;->o:Lc/a/a/a/e2/t;

    if-nez p1, :cond_0

    .line 4
    iget-object p1, p3, Lc/a/a/a/u0;->l:Ljava/lang/String;

    invoke-static {p1}, Lc/a/a/a/m2/w;->k(Ljava/lang/String;)I

    move-result p1

    invoke-direct {p0, p1}, Lc/a/a/a/e2/r;->s(I)Lc/a/a/a/e2/v;

    move-result-object p1

    return-object p1

    .line 5
    :cond_0
    iget-object p3, p0, Lc/a/a/a/e2/r;->x:[B

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-nez p3, :cond_2

    .line 6
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/e2/t;

    iget-object p3, p0, Lc/a/a/a/e2/r;->c:Ljava/util/UUID;

    invoke-static {p1, p3, v0}, Lc/a/a/a/e2/r;->q(Lc/a/a/a/e2/t;Ljava/util/UUID;Z)Ljava/util/List;

    move-result-object p1

    .line 7
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_3

    .line 8
    new-instance p1, Lc/a/a/a/e2/r$e;

    iget-object p3, p0, Lc/a/a/a/e2/r;->c:Ljava/util/UUID;

    invoke-direct {p1, p3, v1}, Lc/a/a/a/e2/r$e;-><init>(Ljava/util/UUID;Lc/a/a/a/e2/r$a;)V

    if-eqz p2, :cond_1

    .line 9
    invoke-virtual {p2, p1}, Lc/a/a/a/e2/w$a;->f(Ljava/lang/Exception;)V

    .line 10
    :cond_1
    new-instance p2, Lc/a/a/a/e2/b0;

    new-instance p3, Lc/a/a/a/e2/v$a;

    invoke-direct {p3, p1}, Lc/a/a/a/e2/v$a;-><init>(Ljava/lang/Throwable;)V

    invoke-direct {p2, p3}, Lc/a/a/a/e2/b0;-><init>(Lc/a/a/a/e2/v$a;)V

    return-object p2

    :cond_2
    move-object p1, v1

    .line 11
    :cond_3
    iget-boolean p3, p0, Lc/a/a/a/e2/r;->g:Z

    if-nez p3, :cond_4

    .line 12
    iget-object v1, p0, Lc/a/a/a/e2/r;->t:Lc/a/a/a/e2/q;

    goto :goto_0

    .line 13
    :cond_4
    iget-object p3, p0, Lc/a/a/a/e2/r;->n:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_5
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/a/a/a/e2/q;

    .line 14
    iget-object v3, v2, Lc/a/a/a/e2/q;->a:Ljava/util/List;

    invoke-static {v3, p1}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    move-object v1, v2

    :cond_6
    :goto_0
    if-nez v1, :cond_8

    .line 15
    invoke-direct {p0, p1, v0, p2}, Lc/a/a/a/e2/r;->p(Ljava/util/List;ZLc/a/a/a/e2/w$a;)Lc/a/a/a/e2/q;

    move-result-object v1

    .line 16
    iget-boolean p1, p0, Lc/a/a/a/e2/r;->g:Z

    if-nez p1, :cond_7

    .line 17
    iput-object v1, p0, Lc/a/a/a/e2/r;->t:Lc/a/a/a/e2/q;

    .line 18
    :cond_7
    iget-object p1, p0, Lc/a/a/a/e2/r;->n:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 19
    :cond_8
    invoke-virtual {v1, p2}, Lc/a/a/a/e2/q;->b(Lc/a/a/a/e2/w$a;)V

    :goto_1
    return-object v1
.end method

.method public c(Lc/a/a/a/u0;)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/u0;",
            ")",
            "Ljava/lang/Class<",
            "+",
            "Lc/a/a/a/e2/c0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/e2/r;->r:Lc/a/a/a/e2/d0;

    .line 2
    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/e2/d0;

    invoke-interface {v0}, Lc/a/a/a/e2/d0;->b()Ljava/lang/Class;

    move-result-object v0

    .line 3
    iget-object v1, p1, Lc/a/a/a/u0;->o:Lc/a/a/a/e2/t;

    if-nez v1, :cond_1

    .line 4
    iget-object p1, p1, Lc/a/a/a/u0;->l:Ljava/lang/String;

    invoke-static {p1}, Lc/a/a/a/m2/w;->k(Ljava/lang/String;)I

    move-result p1

    .line 5
    iget-object v1, p0, Lc/a/a/a/e2/r;->h:[I

    invoke-static {v1, p1}, Lc/a/a/a/m2/m0;->o0([II)I

    move-result p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 6
    :cond_1
    invoke-direct {p0, v1}, Lc/a/a/a/e2/r;->n(Lc/a/a/a/e2/t;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    .line 7
    :cond_2
    const-class v0, Lc/a/a/a/e2/l0;

    :goto_1
    return-object v0
.end method

.method public final d()V
    .locals 3

    .line 1
    iget v0, p0, Lc/a/a/a/e2/r;->q:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lc/a/a/a/e2/r;->q:I

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lc/a/a/a/e2/r;->r:Lc/a/a/a/e2/d0;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 3
    iget-object v0, p0, Lc/a/a/a/e2/r;->d:Lc/a/a/a/e2/d0$c;

    iget-object v1, p0, Lc/a/a/a/e2/r;->c:Ljava/util/UUID;

    invoke-interface {v0, v1}, Lc/a/a/a/e2/d0$c;->a(Ljava/util/UUID;)Lc/a/a/a/e2/d0;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/e2/r;->r:Lc/a/a/a/e2/d0;

    .line 4
    new-instance v1, Lc/a/a/a/e2/r$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lc/a/a/a/e2/r$c;-><init>(Lc/a/a/a/e2/r;Lc/a/a/a/e2/r$a;)V

    invoke-interface {v0, v1}, Lc/a/a/a/e2/d0;->f(Lc/a/a/a/e2/d0$b;)V

    return-void
.end method

.method public u(I[B)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/e2/r;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    .line 2
    :cond_0
    invoke-static {p2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    :cond_1
    iput p1, p0, Lc/a/a/a/e2/r;->w:I

    .line 4
    iput-object p2, p0, Lc/a/a/a/e2/r;->x:[B

    return-void
.end method
