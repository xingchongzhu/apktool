.class public final Lcom/google/android/exoplayer2/source/hls/v/d;
.super Ljava/lang/Object;
.source "DefaultHlsPlaylistTracker.java"

# interfaces
.implements Lcom/google/android/exoplayer2/source/hls/v/k;
.implements Lcom/google/android/exoplayer2/upstream/b0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/hls/v/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/exoplayer2/source/hls/v/k;",
        "Lcom/google/android/exoplayer2/upstream/b0$b<",
        "Lcom/google/android/exoplayer2/upstream/c0<",
        "Lcom/google/android/exoplayer2/source/hls/v/h;",
        ">;>;"
    }
.end annotation


# static fields
.field public static final a:Lcom/google/android/exoplayer2/source/hls/v/k$a;


# instance fields
.field private final b:Lcom/google/android/exoplayer2/source/hls/j;

.field private final c:Lcom/google/android/exoplayer2/source/hls/v/j;

.field private final d:Lcom/google/android/exoplayer2/upstream/a0;

.field private final e:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/net/Uri;",
            "Lcom/google/android/exoplayer2/source/hls/v/d$a;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/source/hls/v/k$b;",
            ">;"
        }
    .end annotation
.end field

.field private final g:D

.field private h:Lc/a/a/a/j2/e0$a;

.field private i:Lcom/google/android/exoplayer2/upstream/b0;

.field private j:Landroid/os/Handler;

.field private k:Lcom/google/android/exoplayer2/source/hls/v/k$e;

.field private l:Lcom/google/android/exoplayer2/source/hls/v/f;

.field private m:Landroid/net/Uri;

.field private n:Lcom/google/android/exoplayer2/source/hls/v/g;

.field private o:Z

.field private p:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/exoplayer2/source/hls/v/b;->a:Lcom/google/android/exoplayer2/source/hls/v/b;

    sput-object v0, Lcom/google/android/exoplayer2/source/hls/v/d;->a:Lcom/google/android/exoplayer2/source/hls/v/k$a;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/exoplayer2/source/hls/j;Lcom/google/android/exoplayer2/upstream/a0;Lcom/google/android/exoplayer2/source/hls/v/j;)V
    .locals 6

    const-wide/high16 v4, 0x400c000000000000L    # 3.5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 1
    invoke-direct/range {v0 .. v5}, Lcom/google/android/exoplayer2/source/hls/v/d;-><init>(Lcom/google/android/exoplayer2/source/hls/j;Lcom/google/android/exoplayer2/upstream/a0;Lcom/google/android/exoplayer2/source/hls/v/j;D)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/exoplayer2/source/hls/j;Lcom/google/android/exoplayer2/upstream/a0;Lcom/google/android/exoplayer2/source/hls/v/j;D)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->b:Lcom/google/android/exoplayer2/source/hls/j;

    .line 4
    iput-object p3, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->c:Lcom/google/android/exoplayer2/source/hls/v/j;

    .line 5
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->d:Lcom/google/android/exoplayer2/upstream/a0;

    .line 6
    iput-wide p4, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->g:D

    .line 7
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->f:Ljava/util/List;

    .line 8
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->e:Ljava/util/HashMap;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->p:J

    return-void
.end method

.method private A(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 2
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/Uri;

    .line 3
    new-instance v3, Lcom/google/android/exoplayer2/source/hls/v/d$a;

    invoke-direct {v3, p0, v2}, Lcom/google/android/exoplayer2/source/hls/v/d$a;-><init>(Lcom/google/android/exoplayer2/source/hls/v/d;Landroid/net/Uri;)V

    .line 4
    iget-object v4, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->e:Ljava/util/HashMap;

    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static B(Lcom/google/android/exoplayer2/source/hls/v/g;Lcom/google/android/exoplayer2/source/hls/v/g;)Lcom/google/android/exoplayer2/source/hls/v/g$d;
    .locals 4

    .line 1
    iget-wide v0, p1, Lcom/google/android/exoplayer2/source/hls/v/g;->i:J

    iget-wide v2, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->i:J

    sub-long/2addr v0, v2

    long-to-int p1, v0

    .line 2
    iget-object p0, p0, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/exoplayer2/source/hls/v/g$d;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private C(Lcom/google/android/exoplayer2/source/hls/v/g;Lcom/google/android/exoplayer2/source/hls/v/g;)Lcom/google/android/exoplayer2/source/hls/v/g;
    .locals 2

    .line 1
    invoke-virtual {p2, p1}, Lcom/google/android/exoplayer2/source/hls/v/g;->f(Lcom/google/android/exoplayer2/source/hls/v/g;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    iget-boolean p2, p2, Lcom/google/android/exoplayer2/source/hls/v/g;->m:Z

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/source/hls/v/g;->d()Lcom/google/android/exoplayer2/source/hls/v/g;

    move-result-object p1

    :cond_0
    return-object p1

    .line 4
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/google/android/exoplayer2/source/hls/v/d;->E(Lcom/google/android/exoplayer2/source/hls/v/g;Lcom/google/android/exoplayer2/source/hls/v/g;)J

    move-result-wide v0

    .line 5
    invoke-direct {p0, p1, p2}, Lcom/google/android/exoplayer2/source/hls/v/d;->D(Lcom/google/android/exoplayer2/source/hls/v/g;Lcom/google/android/exoplayer2/source/hls/v/g;)I

    move-result p1

    .line 6
    invoke-virtual {p2, v0, v1, p1}, Lcom/google/android/exoplayer2/source/hls/v/g;->c(JI)Lcom/google/android/exoplayer2/source/hls/v/g;

    move-result-object p1

    return-object p1
.end method

.method private D(Lcom/google/android/exoplayer2/source/hls/v/g;Lcom/google/android/exoplayer2/source/hls/v/g;)I
    .locals 3

    .line 1
    iget-boolean v0, p2, Lcom/google/android/exoplayer2/source/hls/v/g;->g:Z

    if-eqz v0, :cond_0

    .line 2
    iget p1, p2, Lcom/google/android/exoplayer2/source/hls/v/g;->h:I

    return p1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->n:Lcom/google/android/exoplayer2/source/hls/v/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 4
    iget v0, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->h:I

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez p1, :cond_2

    return v0

    .line 5
    :cond_2
    invoke-static {p1, p2}, Lcom/google/android/exoplayer2/source/hls/v/d;->B(Lcom/google/android/exoplayer2/source/hls/v/g;Lcom/google/android/exoplayer2/source/hls/v/g;)Lcom/google/android/exoplayer2/source/hls/v/g$d;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 6
    iget p1, p1, Lcom/google/android/exoplayer2/source/hls/v/g;->h:I

    iget v0, v2, Lcom/google/android/exoplayer2/source/hls/v/g$e;->d:I

    add-int/2addr p1, v0

    iget-object p2, p2, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    .line 7
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/exoplayer2/source/hls/v/g$d;

    iget p2, p2, Lcom/google/android/exoplayer2/source/hls/v/g$e;->d:I

    sub-int/2addr p1, p2

    return p1

    :cond_3
    return v0
.end method

.method private E(Lcom/google/android/exoplayer2/source/hls/v/g;Lcom/google/android/exoplayer2/source/hls/v/g;)J
    .locals 8

    .line 1
    iget-boolean v0, p2, Lcom/google/android/exoplayer2/source/hls/v/g;->n:Z

    if-eqz v0, :cond_0

    .line 2
    iget-wide p1, p2, Lcom/google/android/exoplayer2/source/hls/v/g;->f:J

    return-wide p1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->n:Lcom/google/android/exoplayer2/source/hls/v/g;

    if-eqz v0, :cond_1

    iget-wide v0, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->f:J

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    :goto_0
    if-nez p1, :cond_2

    return-wide v0

    .line 4
    :cond_2
    iget-object v2, p1, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    .line 5
    invoke-static {p1, p2}, Lcom/google/android/exoplayer2/source/hls/v/d;->B(Lcom/google/android/exoplayer2/source/hls/v/g;Lcom/google/android/exoplayer2/source/hls/v/g;)Lcom/google/android/exoplayer2/source/hls/v/g$d;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 6
    iget-wide p1, p1, Lcom/google/android/exoplayer2/source/hls/v/g;->f:J

    iget-wide v0, v3, Lcom/google/android/exoplayer2/source/hls/v/g$e;->e:J

    add-long/2addr p1, v0

    return-wide p1

    :cond_3
    int-to-long v2, v2

    .line 7
    iget-wide v4, p2, Lcom/google/android/exoplayer2/source/hls/v/g;->i:J

    iget-wide v6, p1, Lcom/google/android/exoplayer2/source/hls/v/g;->i:J

    sub-long/2addr v4, v6

    cmp-long p2, v2, v4

    if-nez p2, :cond_4

    .line 8
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/source/hls/v/g;->e()J

    move-result-wide p1

    return-wide p1

    :cond_4
    return-wide v0
.end method

.method private F(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->n:Lcom/google/android/exoplayer2/source/hls/v/g;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->t:Lcom/google/android/exoplayer2/source/hls/v/g$f;

    iget-boolean v1, v1, Lcom/google/android/exoplayer2/source/hls/v/g$f;->e:Z

    if-eqz v1, :cond_1

    .line 2
    iget-object v0, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->r:Ljava/util/Map;

    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/source/hls/v/g$c;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p1

    .line 5
    iget-wide v1, v0, Lcom/google/android/exoplayer2/source/hls/v/g$c;->b:J

    .line 6
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "_HLS_msn"

    .line 7
    invoke-virtual {p1, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 8
    iget v0, v0, Lcom/google/android/exoplayer2/source/hls/v/g$c;->c:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 9
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "_HLS_part"

    .line 10
    invoke-virtual {p1, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method private G(Landroid/net/Uri;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->l:Lcom/google/android/exoplayer2/source/hls/v/f;

    iget-object v0, v0, Lcom/google/android/exoplayer2/source/hls/v/f;->f:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 2
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 3
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/exoplayer2/source/hls/v/f$b;

    iget-object v3, v3, Lcom/google/android/exoplayer2/source/hls/v/f$b;->a:Landroid/net/Uri;

    invoke-virtual {p1, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private H()Z
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->l:Lcom/google/android/exoplayer2/source/hls/v/f;

    iget-object v0, v0, Lcom/google/android/exoplayer2/source/hls/v/f;->f:Ljava/util/List;

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v1, :cond_1

    .line 4
    iget-object v6, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->e:Ljava/util/HashMap;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/exoplayer2/source/hls/v/f$b;

    iget-object v7, v7, Lcom/google/android/exoplayer2/source/hls/v/f$b;->a:Landroid/net/Uri;

    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/exoplayer2/source/hls/v/d$a;

    invoke-static {v6}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/exoplayer2/source/hls/v/d$a;

    .line 5
    invoke-static {v6}, Lcom/google/android/exoplayer2/source/hls/v/d$a;->b(Lcom/google/android/exoplayer2/source/hls/v/d$a;)J

    move-result-wide v7

    cmp-long v9, v2, v7

    if-lez v9, :cond_0

    .line 6
    invoke-static {v6}, Lcom/google/android/exoplayer2/source/hls/v/d$a;->c(Lcom/google/android/exoplayer2/source/hls/v/d$a;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->m:Landroid/net/Uri;

    .line 7
    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/source/hls/v/d;->F(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v6, v0}, Lcom/google/android/exoplayer2/source/hls/v/d$a;->d(Lcom/google/android/exoplayer2/source/hls/v/d$a;Landroid/net/Uri;)V

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    return v4
.end method

.method private I(Landroid/net/Uri;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->m:Landroid/net/Uri;

    invoke-virtual {p1, v0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/source/hls/v/d;->G(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->n:Lcom/google/android/exoplayer2/source/hls/v/g;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Lcom/google/android/exoplayer2/source/hls/v/g;->m:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->m:Landroid/net/Uri;

    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->e:Ljava/util/HashMap;

    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/source/hls/v/d$a;

    .line 6
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/source/hls/v/d;->F(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/android/exoplayer2/source/hls/v/d$a;->d(Lcom/google/android/exoplayer2/source/hls/v/d$a;Landroid/net/Uri;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private J(Landroid/net/Uri;J)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 2
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->f:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/exoplayer2/source/hls/v/k$b;

    invoke-interface {v3, p1, p2, p3}, Lcom/google/android/exoplayer2/source/hls/v/k$b;->i(Landroid/net/Uri;J)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    or-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v2
.end method

.method private N(Landroid/net/Uri;Lcom/google/android/exoplayer2/source/hls/v/g;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->m:Landroid/net/Uri;

    invoke-virtual {p1, v0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->n:Lcom/google/android/exoplayer2/source/hls/v/g;

    if-nez p1, :cond_0

    .line 3
    iget-boolean p1, p2, Lcom/google/android/exoplayer2/source/hls/v/g;->m:Z

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->o:Z

    .line 4
    iget-wide v0, p2, Lcom/google/android/exoplayer2/source/hls/v/g;->f:J

    iput-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->p:J

    .line 5
    :cond_0
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->n:Lcom/google/android/exoplayer2/source/hls/v/g;

    .line 6
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->k:Lcom/google/android/exoplayer2/source/hls/v/k$e;

    invoke-interface {p1, p2}, Lcom/google/android/exoplayer2/source/hls/v/k$e;->k(Lcom/google/android/exoplayer2/source/hls/v/g;)V

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->f:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_2

    .line 8
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->f:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/source/hls/v/k$b;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/source/hls/v/k$b;->h()V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method static synthetic m(Lcom/google/android/exoplayer2/source/hls/v/d;)Lcom/google/android/exoplayer2/source/hls/v/j;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->c:Lcom/google/android/exoplayer2/source/hls/v/j;

    return-object p0
.end method

.method static synthetic n(Lcom/google/android/exoplayer2/source/hls/v/d;Lcom/google/android/exoplayer2/source/hls/v/g;Lcom/google/android/exoplayer2/source/hls/v/g;)Lcom/google/android/exoplayer2/source/hls/v/g;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/android/exoplayer2/source/hls/v/d;->C(Lcom/google/android/exoplayer2/source/hls/v/g;Lcom/google/android/exoplayer2/source/hls/v/g;)Lcom/google/android/exoplayer2/source/hls/v/g;

    move-result-object p0

    return-object p0
.end method

.method static synthetic o(Lcom/google/android/exoplayer2/source/hls/v/d;Landroid/net/Uri;Lcom/google/android/exoplayer2/source/hls/v/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/android/exoplayer2/source/hls/v/d;->N(Landroid/net/Uri;Lcom/google/android/exoplayer2/source/hls/v/g;)V

    return-void
.end method

.method static synthetic q(Lcom/google/android/exoplayer2/source/hls/v/d;)D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->g:D

    return-wide v0
.end method

.method static synthetic s(Lcom/google/android/exoplayer2/source/hls/v/d;)Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->m:Landroid/net/Uri;

    return-object p0
.end method

.method static synthetic t(Lcom/google/android/exoplayer2/source/hls/v/d;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/v/d;->H()Z

    move-result p0

    return p0
.end method

.method static synthetic u(Lcom/google/android/exoplayer2/source/hls/v/d;)Lcom/google/android/exoplayer2/source/hls/j;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->b:Lcom/google/android/exoplayer2/source/hls/j;

    return-object p0
.end method

.method static synthetic v(Lcom/google/android/exoplayer2/source/hls/v/d;)Lc/a/a/a/j2/e0$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->h:Lc/a/a/a/j2/e0$a;

    return-object p0
.end method

.method static synthetic w(Lcom/google/android/exoplayer2/source/hls/v/d;)Lcom/google/android/exoplayer2/upstream/a0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->d:Lcom/google/android/exoplayer2/upstream/a0;

    return-object p0
.end method

.method static synthetic x(Lcom/google/android/exoplayer2/source/hls/v/d;Landroid/net/Uri;J)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/exoplayer2/source/hls/v/d;->J(Landroid/net/Uri;J)Z

    move-result p0

    return p0
.end method

.method static synthetic y(Lcom/google/android/exoplayer2/source/hls/v/d;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->j:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic z(Lcom/google/android/exoplayer2/source/hls/v/d;)Lcom/google/android/exoplayer2/source/hls/v/f;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->l:Lcom/google/android/exoplayer2/source/hls/v/f;

    return-object p0
.end method


# virtual methods
.method public K(Lcom/google/android/exoplayer2/upstream/c0;JJZ)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/upstream/c0<",
            "Lcom/google/android/exoplayer2/source/hls/v/h;",
            ">;JJZ)V"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p1

    .line 1
    new-instance v14, Lc/a/a/a/j2/w;

    iget-wide v3, v1, Lcom/google/android/exoplayer2/upstream/c0;->a:J

    iget-object v5, v1, Lcom/google/android/exoplayer2/upstream/c0;->b:Lcom/google/android/exoplayer2/upstream/p;

    .line 2
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/c0;->f()Landroid/net/Uri;

    move-result-object v6

    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/c0;->d()Ljava/util/Map;

    move-result-object v7

    .line 4
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/c0;->b()J

    move-result-wide v12

    move-object v2, v14

    move-wide/from16 v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v2 .. v13}, Lc/a/a/a/j2/w;-><init>(JLcom/google/android/exoplayer2/upstream/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 5
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/v/d;->d:Lcom/google/android/exoplayer2/upstream/a0;

    iget-wide v3, v1, Lcom/google/android/exoplayer2/upstream/c0;->a:J

    invoke-interface {v2, v3, v4}, Lcom/google/android/exoplayer2/upstream/a0;->a(J)V

    .line 6
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/v/d;->h:Lc/a/a/a/j2/e0$a;

    const/4 v2, 0x4

    invoke-virtual {v1, v14, v2}, Lc/a/a/a/j2/e0$a;->q(Lc/a/a/a/j2/w;I)V

    return-void
.end method

.method public L(Lcom/google/android/exoplayer2/upstream/c0;JJ)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/upstream/c0<",
            "Lcom/google/android/exoplayer2/source/hls/v/h;",
            ">;JJ)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/c0;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/exoplayer2/source/hls/v/h;

    .line 2
    instance-of v3, v2, Lcom/google/android/exoplayer2/source/hls/v/g;

    if-eqz v3, :cond_0

    .line 3
    iget-object v4, v2, Lcom/google/android/exoplayer2/source/hls/v/h;->a:Ljava/lang/String;

    invoke-static {v4}, Lcom/google/android/exoplayer2/source/hls/v/f;->e(Ljava/lang/String;)Lcom/google/android/exoplayer2/source/hls/v/f;

    move-result-object v4

    goto :goto_0

    .line 4
    :cond_0
    move-object v4, v2

    check-cast v4, Lcom/google/android/exoplayer2/source/hls/v/f;

    .line 5
    :goto_0
    iput-object v4, v0, Lcom/google/android/exoplayer2/source/hls/v/d;->l:Lcom/google/android/exoplayer2/source/hls/v/f;

    .line 6
    iget-object v5, v4, Lcom/google/android/exoplayer2/source/hls/v/f;->f:Ljava/util/List;

    const/4 v6, 0x0

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/exoplayer2/source/hls/v/f$b;

    iget-object v5, v5, Lcom/google/android/exoplayer2/source/hls/v/f$b;->a:Landroid/net/Uri;

    iput-object v5, v0, Lcom/google/android/exoplayer2/source/hls/v/d;->m:Landroid/net/Uri;

    .line 7
    iget-object v4, v4, Lcom/google/android/exoplayer2/source/hls/v/f;->e:Ljava/util/List;

    invoke-direct {v0, v4}, Lcom/google/android/exoplayer2/source/hls/v/d;->A(Ljava/util/List;)V

    .line 8
    new-instance v4, Lc/a/a/a/j2/w;

    iget-wide v6, v1, Lcom/google/android/exoplayer2/upstream/c0;->a:J

    iget-object v8, v1, Lcom/google/android/exoplayer2/upstream/c0;->b:Lcom/google/android/exoplayer2/upstream/p;

    .line 9
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/c0;->f()Landroid/net/Uri;

    move-result-object v9

    .line 10
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/c0;->d()Ljava/util/Map;

    move-result-object v10

    .line 11
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/c0;->b()J

    move-result-wide v15

    move-object v5, v4

    move-wide/from16 v11, p2

    move-wide/from16 v13, p4

    invoke-direct/range {v5 .. v16}, Lc/a/a/a/j2/w;-><init>(JLcom/google/android/exoplayer2/upstream/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 12
    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/v/d;->e:Ljava/util/HashMap;

    iget-object v6, v0, Lcom/google/android/exoplayer2/source/hls/v/d;->m:Landroid/net/Uri;

    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/exoplayer2/source/hls/v/d$a;

    if-eqz v3, :cond_1

    .line 13
    check-cast v2, Lcom/google/android/exoplayer2/source/hls/v/g;

    invoke-static {v5, v2, v4}, Lcom/google/android/exoplayer2/source/hls/v/d$a;->a(Lcom/google/android/exoplayer2/source/hls/v/d$a;Lcom/google/android/exoplayer2/source/hls/v/g;Lc/a/a/a/j2/w;)V

    goto :goto_1

    .line 14
    :cond_1
    invoke-virtual {v5}, Lcom/google/android/exoplayer2/source/hls/v/d$a;->l()V

    .line 15
    :goto_1
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/v/d;->d:Lcom/google/android/exoplayer2/upstream/a0;

    iget-wide v5, v1, Lcom/google/android/exoplayer2/upstream/c0;->a:J

    invoke-interface {v2, v5, v6}, Lcom/google/android/exoplayer2/upstream/a0;->a(J)V

    .line 16
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/v/d;->h:Lc/a/a/a/j2/e0$a;

    const/4 v2, 0x4

    invoke-virtual {v1, v4, v2}, Lc/a/a/a/j2/e0$a;->t(Lc/a/a/a/j2/w;I)V

    return-void
.end method

.method public M(Lcom/google/android/exoplayer2/upstream/c0;JJLjava/io/IOException;I)Lcom/google/android/exoplayer2/upstream/b0$c;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/upstream/c0<",
            "Lcom/google/android/exoplayer2/source/hls/v/h;",
            ">;JJ",
            "Ljava/io/IOException;",
            "I)",
            "Lcom/google/android/exoplayer2/upstream/b0$c;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p6

    .line 1
    new-instance v15, Lc/a/a/a/j2/w;

    iget-wide v4, v1, Lcom/google/android/exoplayer2/upstream/c0;->a:J

    iget-object v6, v1, Lcom/google/android/exoplayer2/upstream/c0;->b:Lcom/google/android/exoplayer2/upstream/p;

    .line 2
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/c0;->f()Landroid/net/Uri;

    move-result-object v7

    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/c0;->d()Ljava/util/Map;

    move-result-object v8

    .line 4
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/c0;->b()J

    move-result-wide v13

    move-object v3, v15

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lc/a/a/a/j2/w;-><init>(JLcom/google/android/exoplayer2/upstream/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 5
    new-instance v3, Lc/a/a/a/j2/z;

    iget v4, v1, Lcom/google/android/exoplayer2/upstream/c0;->c:I

    invoke-direct {v3, v4}, Lc/a/a/a/j2/z;-><init>(I)V

    .line 6
    iget-object v4, v0, Lcom/google/android/exoplayer2/source/hls/v/d;->d:Lcom/google/android/exoplayer2/upstream/a0;

    new-instance v5, Lcom/google/android/exoplayer2/upstream/a0$a;

    move/from16 v6, p7

    invoke-direct {v5, v15, v3, v2, v6}, Lcom/google/android/exoplayer2/upstream/a0$a;-><init>(Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Ljava/io/IOException;I)V

    .line 7
    invoke-interface {v4, v5}, Lcom/google/android/exoplayer2/upstream/a0;->b(Lcom/google/android/exoplayer2/upstream/a0$a;)J

    move-result-wide v3

    const/4 v5, 0x0

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v8, v3, v6

    if-nez v8, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 8
    :goto_0
    iget-object v7, v0, Lcom/google/android/exoplayer2/source/hls/v/d;->h:Lc/a/a/a/j2/e0$a;

    iget v8, v1, Lcom/google/android/exoplayer2/upstream/c0;->c:I

    invoke-virtual {v7, v15, v8, v2, v6}, Lc/a/a/a/j2/e0$a;->x(Lc/a/a/a/j2/w;ILjava/io/IOException;Z)V

    if-eqz v6, :cond_1

    .line 9
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/v/d;->d:Lcom/google/android/exoplayer2/upstream/a0;

    iget-wide v7, v1, Lcom/google/android/exoplayer2/upstream/c0;->a:J

    invoke-interface {v2, v7, v8}, Lcom/google/android/exoplayer2/upstream/a0;->a(J)V

    :cond_1
    if-eqz v6, :cond_2

    .line 10
    sget-object v1, Lcom/google/android/exoplayer2/upstream/b0;->d:Lcom/google/android/exoplayer2/upstream/b0$c;

    goto :goto_1

    .line 11
    :cond_2
    invoke-static {v5, v3, v4}, Lcom/google/android/exoplayer2/upstream/b0;->g(ZJ)Lcom/google/android/exoplayer2/upstream/b0$c;

    move-result-object v1

    :goto_1
    return-object v1
.end method

.method public a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->o:Z

    return v0
.end method

.method public b()Lcom/google/android/exoplayer2/source/hls/v/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->l:Lcom/google/android/exoplayer2/source/hls/v/f;

    return-object v0
.end method

.method public c(Landroid/net/Uri;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/exoplayer2/source/hls/v/d$a;

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/source/hls/v/d$a;->h()Z

    move-result p1

    return p1
.end method

.method public d(Landroid/net/Uri;Lc/a/a/a/j2/e0$a;Lcom/google/android/exoplayer2/source/hls/v/k$e;)V
    .locals 7

    .line 1
    invoke-static {}, Lc/a/a/a/m2/m0;->v()Landroid/os/Handler;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->j:Landroid/os/Handler;

    .line 2
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->h:Lc/a/a/a/j2/e0$a;

    .line 3
    iput-object p3, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->k:Lcom/google/android/exoplayer2/source/hls/v/k$e;

    .line 4
    new-instance p3, Lcom/google/android/exoplayer2/upstream/c0;

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->b:Lcom/google/android/exoplayer2/source/hls/j;

    const/4 v1, 0x4

    .line 5
    invoke-interface {v0, v1}, Lcom/google/android/exoplayer2/source/hls/j;->a(I)Lcom/google/android/exoplayer2/upstream/m;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->c:Lcom/google/android/exoplayer2/source/hls/v/j;

    .line 6
    invoke-interface {v2}, Lcom/google/android/exoplayer2/source/hls/v/j;->b()Lcom/google/android/exoplayer2/upstream/c0$a;

    move-result-object v2

    invoke-direct {p3, v0, p1, v1, v2}, Lcom/google/android/exoplayer2/upstream/c0;-><init>(Lcom/google/android/exoplayer2/upstream/m;Landroid/net/Uri;ILcom/google/android/exoplayer2/upstream/c0$a;)V

    .line 7
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->i:Lcom/google/android/exoplayer2/upstream/b0;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lc/a/a/a/m2/f;->f(Z)V

    .line 8
    new-instance p1, Lcom/google/android/exoplayer2/upstream/b0;

    const-string v0, "DefaultHlsPlaylistTracker:MasterPlaylist"

    invoke-direct {p1, v0}, Lcom/google/android/exoplayer2/upstream/b0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->i:Lcom/google/android/exoplayer2/upstream/b0;

    .line 9
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->d:Lcom/google/android/exoplayer2/upstream/a0;

    iget v1, p3, Lcom/google/android/exoplayer2/upstream/c0;->c:I

    .line 10
    invoke-interface {v0, v1}, Lcom/google/android/exoplayer2/upstream/a0;->d(I)I

    move-result v0

    .line 11
    invoke-virtual {p1, p3, p0, v0}, Lcom/google/android/exoplayer2/upstream/b0;->n(Lcom/google/android/exoplayer2/upstream/b0$e;Lcom/google/android/exoplayer2/upstream/b0$b;I)J

    move-result-wide v5

    .line 12
    new-instance p1, Lc/a/a/a/j2/w;

    iget-wide v2, p3, Lcom/google/android/exoplayer2/upstream/c0;->a:J

    iget-object v4, p3, Lcom/google/android/exoplayer2/upstream/c0;->b:Lcom/google/android/exoplayer2/upstream/p;

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lc/a/a/a/j2/w;-><init>(JLcom/google/android/exoplayer2/upstream/p;J)V

    iget p3, p3, Lcom/google/android/exoplayer2/upstream/c0;->c:I

    invoke-virtual {p2, p1, p3}, Lc/a/a/a/j2/e0$a;->z(Lc/a/a/a/j2/w;I)V

    return-void
.end method

.method public e()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->i:Lcom/google/android/exoplayer2/upstream/b0;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/upstream/b0;->j()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->m:Landroid/net/Uri;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/source/hls/v/d;->g(Landroid/net/Uri;)V

    :cond_1
    return-void
.end method

.method public f(Lcom/google/android/exoplayer2/source/hls/v/k$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public g(Landroid/net/Uri;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/exoplayer2/source/hls/v/d$a;

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/source/hls/v/d$a;->o()V

    return-void
.end method

.method public h(Landroid/net/Uri;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/exoplayer2/source/hls/v/d$a;

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/source/hls/v/d$a;->l()V

    return-void
.end method

.method public i(Lcom/google/android/exoplayer2/source/hls/v/k$b;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public bridge synthetic j(Lcom/google/android/exoplayer2/upstream/b0$e;JJZ)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/exoplayer2/upstream/c0;

    invoke-virtual/range {p0 .. p6}, Lcom/google/android/exoplayer2/source/hls/v/d;->K(Lcom/google/android/exoplayer2/upstream/c0;JJZ)V

    return-void
.end method

.method public k(Landroid/net/Uri;Z)Lcom/google/android/exoplayer2/source/hls/v/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/source/hls/v/d$a;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/source/hls/v/d$a;->g()Lcom/google/android/exoplayer2/source/hls/v/g;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/source/hls/v/d;->I(Landroid/net/Uri;)V

    :cond_0
    return-object v0
.end method

.method public l()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->p:J

    return-wide v0
.end method

.method public bridge synthetic p(Lcom/google/android/exoplayer2/upstream/b0$e;JJLjava/io/IOException;I)Lcom/google/android/exoplayer2/upstream/b0$c;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/exoplayer2/upstream/c0;

    invoke-virtual/range {p0 .. p7}, Lcom/google/android/exoplayer2/source/hls/v/d;->M(Lcom/google/android/exoplayer2/upstream/c0;JJLjava/io/IOException;I)Lcom/google/android/exoplayer2/upstream/b0$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic r(Lcom/google/android/exoplayer2/upstream/b0$e;JJ)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/exoplayer2/upstream/c0;

    invoke-virtual/range {p0 .. p5}, Lcom/google/android/exoplayer2/source/hls/v/d;->L(Lcom/google/android/exoplayer2/upstream/c0;JJ)V

    return-void
.end method

.method public stop()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->m:Landroid/net/Uri;

    .line 2
    iput-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->n:Lcom/google/android/exoplayer2/source/hls/v/g;

    .line 3
    iput-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->l:Lcom/google/android/exoplayer2/source/hls/v/f;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    iput-wide v1, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->p:J

    .line 5
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->i:Lcom/google/android/exoplayer2/upstream/b0;

    invoke-virtual {v1}, Lcom/google/android/exoplayer2/upstream/b0;->l()V

    .line 6
    iput-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->i:Lcom/google/android/exoplayer2/upstream/b0;

    .line 7
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->e:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/exoplayer2/source/hls/v/d$a;

    .line 8
    invoke-virtual {v2}, Lcom/google/android/exoplayer2/source/hls/v/d$a;->v()V

    goto :goto_0

    .line 9
    :cond_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->j:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 10
    iput-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->j:Landroid/os/Handler;

    .line 11
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/v/d;->e:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method
