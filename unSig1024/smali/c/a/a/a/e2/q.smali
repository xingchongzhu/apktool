.class Lc/a/a/a/e2/q;
.super Ljava/lang/Object;
.source "DefaultDrmSession.java"

# interfaces
.implements Lc/a/a/a/e2/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/e2/q$d;,
        Lc/a/a/a/e2/q$c;,
        Lc/a/a/a/e2/q$e;,
        Lc/a/a/a/e2/q$b;,
        Lc/a/a/a/e2/q$a;,
        Lc/a/a/a/e2/q$f;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/a/e2/t$b;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lc/a/a/a/e2/d0;

.field private final c:Lc/a/a/a/e2/q$a;

.field private final d:Lc/a/a/a/e2/q$b;

.field private final e:I

.field private final f:Z

.field private final g:Z

.field private final h:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lc/a/a/a/m2/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/a/a/m2/l<",
            "Lc/a/a/a/e2/w$a;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Lcom/google/android/exoplayer2/upstream/a0;

.field final k:Lc/a/a/a/e2/i0;

.field final l:Ljava/util/UUID;

.field final m:Lc/a/a/a/e2/q$e;

.field private n:I

.field private o:I

.field private p:Landroid/os/HandlerThread;

.field private q:Lc/a/a/a/e2/q$c;

.field private r:Lc/a/a/a/e2/c0;

.field private s:Lc/a/a/a/e2/v$a;

.field private t:[B

.field private u:[B

.field private v:Lc/a/a/a/e2/d0$a;

.field private w:Lc/a/a/a/e2/d0$d;


# direct methods
.method public constructor <init>(Ljava/util/UUID;Lc/a/a/a/e2/d0;Lc/a/a/a/e2/q$a;Lc/a/a/a/e2/q$b;Ljava/util/List;IZZ[BLjava/util/HashMap;Lc/a/a/a/e2/i0;Landroid/os/Looper;Lcom/google/android/exoplayer2/upstream/a0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            "Lc/a/a/a/e2/d0;",
            "Lc/a/a/a/e2/q$a;",
            "Lc/a/a/a/e2/q$b;",
            "Ljava/util/List<",
            "Lc/a/a/a/e2/t$b;",
            ">;IZZ[B",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lc/a/a/a/e2/i0;",
            "Landroid/os/Looper;",
            "Lcom/google/android/exoplayer2/upstream/a0;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    if-eq p6, v0, :cond_0

    const/4 v0, 0x3

    if-ne p6, v0, :cond_1

    .line 2
    :cond_0
    invoke-static {p9}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    :cond_1
    iput-object p1, p0, Lc/a/a/a/e2/q;->l:Ljava/util/UUID;

    .line 4
    iput-object p3, p0, Lc/a/a/a/e2/q;->c:Lc/a/a/a/e2/q$a;

    .line 5
    iput-object p4, p0, Lc/a/a/a/e2/q;->d:Lc/a/a/a/e2/q$b;

    .line 6
    iput-object p2, p0, Lc/a/a/a/e2/q;->b:Lc/a/a/a/e2/d0;

    .line 7
    iput p6, p0, Lc/a/a/a/e2/q;->e:I

    .line 8
    iput-boolean p7, p0, Lc/a/a/a/e2/q;->f:Z

    .line 9
    iput-boolean p8, p0, Lc/a/a/a/e2/q;->g:Z

    if-eqz p9, :cond_2

    .line 10
    iput-object p9, p0, Lc/a/a/a/e2/q;->u:[B

    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lc/a/a/a/e2/q;->a:Ljava/util/List;

    goto :goto_0

    .line 12
    :cond_2
    invoke-static {p5}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/e2/q;->a:Ljava/util/List;

    .line 13
    :goto_0
    iput-object p10, p0, Lc/a/a/a/e2/q;->h:Ljava/util/HashMap;

    .line 14
    iput-object p11, p0, Lc/a/a/a/e2/q;->k:Lc/a/a/a/e2/i0;

    .line 15
    new-instance p1, Lc/a/a/a/m2/l;

    invoke-direct {p1}, Lc/a/a/a/m2/l;-><init>()V

    iput-object p1, p0, Lc/a/a/a/e2/q;->i:Lc/a/a/a/m2/l;

    .line 16
    iput-object p13, p0, Lc/a/a/a/e2/q;->j:Lcom/google/android/exoplayer2/upstream/a0;

    const/4 p1, 0x2

    .line 17
    iput p1, p0, Lc/a/a/a/e2/q;->n:I

    .line 18
    new-instance p1, Lc/a/a/a/e2/q$e;

    invoke-direct {p1, p0, p12}, Lc/a/a/a/e2/q$e;-><init>(Lc/a/a/a/e2/q;Landroid/os/Looper;)V

    iput-object p1, p0, Lc/a/a/a/e2/q;->m:Lc/a/a/a/e2/q$e;

    return-void
.end method

.method private B()Z
    .locals 3
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "sessionId",
            "offlineLicenseKeySetId"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lc/a/a/a/e2/q;->b:Lc/a/a/a/e2/d0;

    iget-object v1, p0, Lc/a/a/a/e2/q;->t:[B

    iget-object v2, p0, Lc/a/a/a/e2/q;->u:[B

    invoke-interface {v0, v1, v2}, Lc/a/a/a/e2/d0;->c([B[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v0

    const-string v1, "DefaultDrmSession"

    const-string v2, "Error trying to restore keys."

    .line 2
    invoke-static {v1, v2, v0}, Lc/a/a/a/m2/t;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 3
    invoke-direct {p0, v0}, Lc/a/a/a/e2/q;->q(Ljava/lang/Exception;)V

    const/4 v0, 0x0

    return v0
.end method

.method static synthetic h(Lc/a/a/a/e2/q;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/e2/q;->x(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic i(Lc/a/a/a/e2/q;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/e2/q;->r(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic j(Lc/a/a/a/e2/q;)Lcom/google/android/exoplayer2/upstream/a0;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/e2/q;->j:Lcom/google/android/exoplayer2/upstream/a0;

    return-object p0
.end method

.method private k(Lc/a/a/a/m2/k;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/m2/k<",
            "Lc/a/a/a/e2/w$a;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/e2/q;->i:Lc/a/a/a/m2/l;

    invoke-virtual {v0}, Lc/a/a/a/m2/l;->a()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/e2/w$a;

    .line 2
    invoke-interface {p1, v1}, Lc/a/a/a/m2/k;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private l(Z)V
    .locals 8
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "sessionId"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/e2/q;->g:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lc/a/a/a/e2/q;->t:[B

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 3
    iget v1, p0, Lc/a/a/a/e2/q;->e:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eqz v1, :cond_4

    if-eq v1, v2, :cond_4

    if-eq v1, v3, :cond_2

    const/4 v0, 0x3

    if-eq v1, v0, :cond_1

    goto/16 :goto_0

    .line 4
    :cond_1
    iget-object v1, p0, Lc/a/a/a/e2/q;->u:[B

    invoke-static {v1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object v1, p0, Lc/a/a/a/e2/q;->t:[B

    invoke-static {v1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-direct {p0}, Lc/a/a/a/e2/q;->B()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 7
    iget-object v1, p0, Lc/a/a/a/e2/q;->u:[B

    invoke-direct {p0, v1, v0, p1}, Lc/a/a/a/e2/q;->z([BIZ)V

    goto :goto_0

    .line 8
    :cond_2
    iget-object v1, p0, Lc/a/a/a/e2/q;->u:[B

    if-eqz v1, :cond_3

    invoke-direct {p0}, Lc/a/a/a/e2/q;->B()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 9
    :cond_3
    invoke-direct {p0, v0, v3, p1}, Lc/a/a/a/e2/q;->z([BIZ)V

    goto :goto_0

    .line 10
    :cond_4
    iget-object v1, p0, Lc/a/a/a/e2/q;->u:[B

    if-nez v1, :cond_5

    .line 11
    invoke-direct {p0, v0, v2, p1}, Lc/a/a/a/e2/q;->z([BIZ)V

    goto :goto_0

    .line 12
    :cond_5
    iget v1, p0, Lc/a/a/a/e2/q;->n:I

    const/4 v2, 0x4

    if-eq v1, v2, :cond_6

    invoke-direct {p0}, Lc/a/a/a/e2/q;->B()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 13
    :cond_6
    invoke-direct {p0}, Lc/a/a/a/e2/q;->m()J

    move-result-wide v4

    .line 14
    iget v1, p0, Lc/a/a/a/e2/q;->e:I

    if-nez v1, :cond_7

    const-wide/16 v6, 0x3c

    cmp-long v1, v4, v6

    if-gtz v1, :cond_7

    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Offline license has expired or will expire soon. Remaining seconds: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "DefaultDrmSession"

    invoke-static {v2, v1}, Lc/a/a/a/m2/t;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0, v0, v3, p1}, Lc/a/a/a/e2/q;->z([BIZ)V

    goto :goto_0

    :cond_7
    const-wide/16 v0, 0x0

    cmp-long p1, v4, v0

    if-gtz p1, :cond_8

    .line 17
    new-instance p1, Lc/a/a/a/e2/h0;

    invoke-direct {p1}, Lc/a/a/a/e2/h0;-><init>()V

    invoke-direct {p0, p1}, Lc/a/a/a/e2/q;->q(Ljava/lang/Exception;)V

    goto :goto_0

    .line 18
    :cond_8
    iput v2, p0, Lc/a/a/a/e2/q;->n:I

    .line 19
    sget-object p1, Lc/a/a/a/e2/o;->a:Lc/a/a/a/e2/o;

    invoke-direct {p0, p1}, Lc/a/a/a/e2/q;->k(Lc/a/a/a/m2/k;)V

    :cond_9
    :goto_0
    return-void
.end method

.method private m()J
    .locals 5

    .line 1
    sget-object v0, Lc/a/a/a/i0;->d:Ljava/util/UUID;

    iget-object v1, p0, Lc/a/a/a/e2/q;->l:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide v0, 0x7fffffffffffffffL

    return-wide v0

    .line 2
    :cond_0
    invoke-static {p0}, Lc/a/a/a/e2/m0;->b(Lc/a/a/a/e2/v;)Landroid/util/Pair;

    move-result-object v0

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    .line 3
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method private o()Z
    .locals 2
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "sessionId"
        }
        result = true
    .end annotation

    .line 1
    iget v0, p0, Lc/a/a/a/e2/q;->n:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method static synthetic p(Ljava/lang/Exception;Lc/a/a/a/e2/w$a;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Lc/a/a/a/e2/w$a;->f(Ljava/lang/Exception;)V

    return-void
.end method

.method private q(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    new-instance v0, Lc/a/a/a/e2/v$a;

    invoke-direct {v0, p1}, Lc/a/a/a/e2/v$a;-><init>(Ljava/lang/Throwable;)V

    iput-object v0, p0, Lc/a/a/a/e2/q;->s:Lc/a/a/a/e2/v$a;

    .line 2
    new-instance v0, Lc/a/a/a/e2/c;

    invoke-direct {v0, p1}, Lc/a/a/a/e2/c;-><init>(Ljava/lang/Exception;)V

    invoke-direct {p0, v0}, Lc/a/a/a/e2/q;->k(Lc/a/a/a/m2/k;)V

    .line 3
    iget p1, p0, Lc/a/a/a/e2/q;->n:I

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    .line 4
    iput p1, p0, Lc/a/a/a/e2/q;->n:I

    :cond_0
    return-void
.end method

.method private r(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/e2/q;->v:Lc/a/a/a/e2/d0$a;

    if-ne p1, v0, :cond_5

    invoke-direct {p0}, Lc/a/a/a/e2/q;->o()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lc/a/a/a/e2/q;->v:Lc/a/a/a/e2/d0$a;

    .line 3
    instance-of p1, p2, Ljava/lang/Exception;

    if-eqz p1, :cond_1

    .line 4
    check-cast p2, Ljava/lang/Exception;

    invoke-direct {p0, p2}, Lc/a/a/a/e2/q;->s(Ljava/lang/Exception;)V

    return-void

    .line 5
    :cond_1
    :try_start_0
    check-cast p2, [B

    .line 6
    iget p1, p0, Lc/a/a/a/e2/q;->e:I

    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    .line 7
    iget-object p1, p0, Lc/a/a/a/e2/q;->b:Lc/a/a/a/e2/d0;

    iget-object v0, p0, Lc/a/a/a/e2/q;->u:[B

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-interface {p1, v0, p2}, Lc/a/a/a/e2/d0;->g([B[B)[B

    .line 8
    sget-object p1, Lc/a/a/a/e2/b;->a:Lc/a/a/a/e2/b;

    invoke-direct {p0, p1}, Lc/a/a/a/e2/q;->k(Lc/a/a/a/m2/k;)V

    goto :goto_0

    .line 9
    :cond_2
    iget-object p1, p0, Lc/a/a/a/e2/q;->b:Lc/a/a/a/e2/d0;

    iget-object v0, p0, Lc/a/a/a/e2/q;->t:[B

    invoke-interface {p1, v0, p2}, Lc/a/a/a/e2/d0;->g([B[B)[B

    move-result-object p1

    .line 10
    iget p2, p0, Lc/a/a/a/e2/q;->e:I

    const/4 v0, 0x2

    if-eq p2, v0, :cond_3

    if-nez p2, :cond_4

    iget-object p2, p0, Lc/a/a/a/e2/q;->u:[B

    if-eqz p2, :cond_4

    :cond_3
    if-eqz p1, :cond_4

    array-length p2, p1

    if-eqz p2, :cond_4

    .line 11
    iput-object p1, p0, Lc/a/a/a/e2/q;->u:[B

    :cond_4
    const/4 p1, 0x4

    .line 12
    iput p1, p0, Lc/a/a/a/e2/q;->n:I

    .line 13
    sget-object p1, Lc/a/a/a/e2/n;->a:Lc/a/a/a/e2/n;

    invoke-direct {p0, p1}, Lc/a/a/a/e2/q;->k(Lc/a/a/a/m2/k;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 14
    invoke-direct {p0, p1}, Lc/a/a/a/e2/q;->s(Ljava/lang/Exception;)V

    :cond_5
    :goto_0
    return-void
.end method

.method private s(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/media/NotProvisionedException;

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lc/a/a/a/e2/q;->c:Lc/a/a/a/e2/q$a;

    invoke-interface {p1, p0}, Lc/a/a/a/e2/q$a;->a(Lc/a/a/a/e2/q;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Lc/a/a/a/e2/q;->q(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private t()V
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/e2/q;->e:I

    if-nez v0, :cond_0

    iget v0, p0, Lc/a/a/a/e2/q;->n:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lc/a/a/a/e2/q;->t:[B

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0}, Lc/a/a/a/e2/q;->l(Z)V

    :cond_0
    return-void
.end method

.method private x(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/e2/q;->w:Lc/a/a/a/e2/d0$d;

    if-ne p1, v0, :cond_2

    iget p1, p0, Lc/a/a/a/e2/q;->n:I

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    invoke-direct {p0}, Lc/a/a/a/e2/q;->o()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lc/a/a/a/e2/q;->w:Lc/a/a/a/e2/d0$d;

    .line 3
    instance-of p1, p2, Ljava/lang/Exception;

    if-eqz p1, :cond_1

    .line 4
    iget-object p1, p0, Lc/a/a/a/e2/q;->c:Lc/a/a/a/e2/q$a;

    check-cast p2, Ljava/lang/Exception;

    invoke-interface {p1, p2}, Lc/a/a/a/e2/q$a;->b(Ljava/lang/Exception;)V

    return-void

    .line 5
    :cond_1
    :try_start_0
    iget-object p1, p0, Lc/a/a/a/e2/q;->b:Lc/a/a/a/e2/d0;

    check-cast p2, [B

    invoke-interface {p1, p2}, Lc/a/a/a/e2/d0;->j([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    iget-object p1, p0, Lc/a/a/a/e2/q;->c:Lc/a/a/a/e2/q$a;

    invoke-interface {p1}, Lc/a/a/a/e2/q$a;->c()V

    return-void

    :catch_0
    move-exception p1

    .line 7
    iget-object p2, p0, Lc/a/a/a/e2/q;->c:Lc/a/a/a/e2/q$a;

    invoke-interface {p2, p1}, Lc/a/a/a/e2/q$a;->b(Ljava/lang/Exception;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private y(Z)Z
    .locals 3
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "sessionId"
        }
        result = true
    .end annotation

    .line 1
    invoke-direct {p0}, Lc/a/a/a/e2/q;->o()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    :try_start_0
    iget-object v0, p0, Lc/a/a/a/e2/q;->b:Lc/a/a/a/e2/d0;

    invoke-interface {v0}, Lc/a/a/a/e2/d0;->l()[B

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/e2/q;->t:[B

    .line 3
    iget-object v2, p0, Lc/a/a/a/e2/q;->b:Lc/a/a/a/e2/d0;

    invoke-interface {v2, v0}, Lc/a/a/a/e2/d0;->h([B)Lc/a/a/a/e2/c0;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/e2/q;->r:Lc/a/a/a/e2/c0;

    .line 4
    sget-object v0, Lc/a/a/a/e2/k;->a:Lc/a/a/a/e2/k;

    invoke-direct {p0, v0}, Lc/a/a/a/e2/q;->k(Lc/a/a/a/m2/k;)V

    const/4 v0, 0x3

    .line 5
    iput v0, p0, Lc/a/a/a/e2/q;->n:I

    .line 6
    iget-object v0, p0, Lc/a/a/a/e2/q;->t:[B

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Landroid/media/NotProvisionedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception p1

    .line 7
    invoke-direct {p0, p1}, Lc/a/a/a/e2/q;->q(Ljava/lang/Exception;)V

    goto :goto_0

    :catch_1
    move-exception v0

    if-eqz p1, :cond_1

    .line 8
    iget-object p1, p0, Lc/a/a/a/e2/q;->c:Lc/a/a/a/e2/q$a;

    invoke-interface {p1, p0}, Lc/a/a/a/e2/q$a;->a(Lc/a/a/a/e2/q;)V

    goto :goto_0

    .line 9
    :cond_1
    invoke-direct {p0, v0}, Lc/a/a/a/e2/q;->q(Ljava/lang/Exception;)V

    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method private z([BIZ)V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lc/a/a/a/e2/q;->b:Lc/a/a/a/e2/d0;

    iget-object v1, p0, Lc/a/a/a/e2/q;->a:Ljava/util/List;

    iget-object v2, p0, Lc/a/a/a/e2/q;->h:Ljava/util/HashMap;

    invoke-interface {v0, p1, v1, p2, v2}, Lc/a/a/a/e2/d0;->k([BLjava/util/List;ILjava/util/HashMap;)Lc/a/a/a/e2/d0$a;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/e2/q;->v:Lc/a/a/a/e2/d0$a;

    .line 2
    iget-object p1, p0, Lc/a/a/a/e2/q;->q:Lc/a/a/a/e2/q$c;

    invoke-static {p1}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/e2/q$c;

    const/4 p2, 0x1

    iget-object v0, p0, Lc/a/a/a/e2/q;->v:Lc/a/a/a/e2/d0$a;

    .line 3
    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, p2, v0, p3}, Lc/a/a/a/e2/q$c;->b(ILjava/lang/Object;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-direct {p0, p1}, Lc/a/a/a/e2/q;->s(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public A()V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/e2/q;->b:Lc/a/a/a/e2/d0;

    invoke-interface {v0}, Lc/a/a/a/e2/d0;->i()Lc/a/a/a/e2/d0$d;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/e2/q;->w:Lc/a/a/a/e2/d0$d;

    .line 2
    iget-object v0, p0, Lc/a/a/a/e2/q;->q:Lc/a/a/a/e2/q$c;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/e2/q$c;

    iget-object v1, p0, Lc/a/a/a/e2/q;->w:Lc/a/a/a/e2/d0$d;

    .line 3
    invoke-static {v1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 4
    invoke-virtual {v0, v2, v1, v3}, Lc/a/a/a/e2/q$c;->b(ILjava/lang/Object;Z)V

    return-void
.end method

.method public a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/e2/q;->f:Z

    return v0
.end method

.method public b(Lc/a/a/a/e2/w$a;)V
    .locals 3

    .line 1
    iget v0, p0, Lc/a/a/a/e2/q;->o:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    if-eqz p1, :cond_1

    .line 2
    iget-object v0, p0, Lc/a/a/a/e2/q;->i:Lc/a/a/a/m2/l;

    invoke-virtual {v0, p1}, Lc/a/a/a/m2/l;->b(Ljava/lang/Object;)V

    .line 3
    :cond_1
    iget v0, p0, Lc/a/a/a/e2/q;->o:I

    add-int/2addr v0, v2

    iput v0, p0, Lc/a/a/a/e2/q;->o:I

    if-ne v0, v2, :cond_3

    .line 4
    iget p1, p0, Lc/a/a/a/e2/q;->n:I

    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    const/4 v1, 0x1

    :cond_2
    invoke-static {v1}, Lc/a/a/a/m2/f;->f(Z)V

    .line 5
    new-instance p1, Landroid/os/HandlerThread;

    const-string v0, "ExoPlayer:DrmRequestHandler"

    invoke-direct {p1, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lc/a/a/a/e2/q;->p:Landroid/os/HandlerThread;

    .line 6
    invoke-virtual {p1}, Landroid/os/HandlerThread;->start()V

    .line 7
    new-instance p1, Lc/a/a/a/e2/q$c;

    iget-object v0, p0, Lc/a/a/a/e2/q;->p:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Lc/a/a/a/e2/q$c;-><init>(Lc/a/a/a/e2/q;Landroid/os/Looper;)V

    iput-object p1, p0, Lc/a/a/a/e2/q;->q:Lc/a/a/a/e2/q$c;

    .line 8
    invoke-direct {p0, v2}, Lc/a/a/a/e2/q;->y(Z)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 9
    invoke-direct {p0, v2}, Lc/a/a/a/e2/q;->l(Z)V

    goto :goto_1

    :cond_3
    if-eqz p1, :cond_4

    .line 10
    invoke-direct {p0}, Lc/a/a/a/e2/q;->o()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 11
    invoke-virtual {p1}, Lc/a/a/a/e2/w$a;->e()V

    .line 12
    :cond_4
    :goto_1
    iget-object p1, p0, Lc/a/a/a/e2/q;->d:Lc/a/a/a/e2/q$b;

    iget v0, p0, Lc/a/a/a/e2/q;->o:I

    invoke-interface {p1, p0, v0}, Lc/a/a/a/e2/q$b;->b(Lc/a/a/a/e2/q;I)V

    return-void
.end method

.method public c()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/e2/q;->t:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lc/a/a/a/e2/q;->b:Lc/a/a/a/e2/d0;

    invoke-interface {v1, v0}, Lc/a/a/a/e2/d0;->d([B)Ljava/util/Map;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public d(Lc/a/a/a/e2/w$a;)V
    .locals 3

    .line 1
    iget v0, p0, Lc/a/a/a/e2/q;->o:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    iget v0, p0, Lc/a/a/a/e2/q;->o:I

    sub-int/2addr v0, v1

    iput v0, p0, Lc/a/a/a/e2/q;->o:I

    if-nez v0, :cond_2

    .line 3
    iput v2, p0, Lc/a/a/a/e2/q;->n:I

    .line 4
    iget-object v0, p0, Lc/a/a/a/e2/q;->m:Lc/a/a/a/e2/q$e;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/e2/q$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 5
    iget-object v0, p0, Lc/a/a/a/e2/q;->q:Lc/a/a/a/e2/q$c;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/e2/q$c;

    invoke-virtual {v0}, Lc/a/a/a/e2/q$c;->c()V

    .line 6
    iput-object v1, p0, Lc/a/a/a/e2/q;->q:Lc/a/a/a/e2/q$c;

    .line 7
    iget-object v0, p0, Lc/a/a/a/e2/q;->p:Landroid/os/HandlerThread;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 8
    iput-object v1, p0, Lc/a/a/a/e2/q;->p:Landroid/os/HandlerThread;

    .line 9
    iput-object v1, p0, Lc/a/a/a/e2/q;->r:Lc/a/a/a/e2/c0;

    .line 10
    iput-object v1, p0, Lc/a/a/a/e2/q;->s:Lc/a/a/a/e2/v$a;

    .line 11
    iput-object v1, p0, Lc/a/a/a/e2/q;->v:Lc/a/a/a/e2/d0$a;

    .line 12
    iput-object v1, p0, Lc/a/a/a/e2/q;->w:Lc/a/a/a/e2/d0$d;

    .line 13
    iget-object v0, p0, Lc/a/a/a/e2/q;->t:[B

    if-eqz v0, :cond_1

    .line 14
    iget-object v2, p0, Lc/a/a/a/e2/q;->b:Lc/a/a/a/e2/d0;

    invoke-interface {v2, v0}, Lc/a/a/a/e2/d0;->e([B)V

    .line 15
    iput-object v1, p0, Lc/a/a/a/e2/q;->t:[B

    .line 16
    :cond_1
    sget-object v0, Lc/a/a/a/e2/a;->a:Lc/a/a/a/e2/a;

    invoke-direct {p0, v0}, Lc/a/a/a/e2/q;->k(Lc/a/a/a/m2/k;)V

    :cond_2
    if-eqz p1, :cond_4

    .line 17
    invoke-direct {p0}, Lc/a/a/a/e2/q;->o()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 18
    invoke-virtual {p1}, Lc/a/a/a/e2/w$a;->g()V

    .line 19
    :cond_3
    iget-object v0, p0, Lc/a/a/a/e2/q;->i:Lc/a/a/a/m2/l;

    invoke-virtual {v0, p1}, Lc/a/a/a/m2/l;->c(Ljava/lang/Object;)V

    .line 20
    :cond_4
    iget-object p1, p0, Lc/a/a/a/e2/q;->d:Lc/a/a/a/e2/q$b;

    iget v0, p0, Lc/a/a/a/e2/q;->o:I

    invoke-interface {p1, p0, v0}, Lc/a/a/a/e2/q$b;->a(Lc/a/a/a/e2/q;I)V

    return-void
.end method

.method public final e()Ljava/util/UUID;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/e2/q;->l:Ljava/util/UUID;

    return-object v0
.end method

.method public final f()Lc/a/a/a/e2/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/e2/q;->r:Lc/a/a/a/e2/c0;

    return-object v0
.end method

.method public final g()Lc/a/a/a/e2/v$a;
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/e2/q;->n:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lc/a/a/a/e2/q;->s:Lc/a/a/a/e2/v$a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getState()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/e2/q;->n:I

    return v0
.end method

.method public n([B)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/e2/q;->t:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1
.end method

.method public u(I)V
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-direct {p0}, Lc/a/a/a/e2/q;->t()V

    :goto_0
    return-void
.end method

.method public v()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lc/a/a/a/e2/q;->y(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lc/a/a/a/e2/q;->l(Z)V

    :cond_0
    return-void
.end method

.method public w(Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lc/a/a/a/e2/q;->q(Ljava/lang/Exception;)V

    return-void
.end method
