.class final Lcom/google/android/exoplayer2/source/hls/q;
.super Ljava/lang/Object;
.source "HlsSampleStreamWrapper.java"

# interfaces
.implements Lcom/google/android/exoplayer2/upstream/b0$b;
.implements Lcom/google/android/exoplayer2/upstream/b0$f;
.implements Lc/a/a/a/j2/m0;
.implements Lc/a/a/a/f2/l;
.implements Lc/a/a/a/j2/k0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/hls/q$c;,
        Lcom/google/android/exoplayer2/source/hls/q$d;,
        Lcom/google/android/exoplayer2/source/hls/q$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/exoplayer2/upstream/b0$b<",
        "Lc/a/a/a/j2/t0/b;",
        ">;",
        "Lcom/google/android/exoplayer2/upstream/b0$f;",
        "Lc/a/a/a/j2/m0;",
        "Lc/a/a/a/f2/l;",
        "Lc/a/a/a/j2/k0$b;"
    }
.end annotation


# static fields
.field private static final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private A:I

.field private B:I

.field private C:Z

.field private D:Z

.field private G:I

.field private H:Lc/a/a/a/u0;

.field private I:Lc/a/a/a/u0;

.field private J:Z

.field private K:Lc/a/a/a/j2/q0;

.field private L:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lc/a/a/a/j2/p0;",
            ">;"
        }
    .end annotation
.end field

.field private M:[I

.field private N:I

.field private O:Z

.field private P:[Z

.field private Q:[Z

.field private R:J

.field private S:J

.field private T:Z

.field private U:Z

.field private V:Z

.field private W:Z

.field private X:J

.field private Y:Lc/a/a/a/e2/t;

.field private Z:Lcom/google/android/exoplayer2/source/hls/m;

.field private final b:I

.field private final c:Lcom/google/android/exoplayer2/source/hls/q$b;

.field private final d:Lcom/google/android/exoplayer2/source/hls/i;

.field private final e:Lcom/google/android/exoplayer2/upstream/e;

.field private final f:Lc/a/a/a/u0;

.field private final g:Lc/a/a/a/e2/y;

.field private final h:Lc/a/a/a/e2/w$a;

.field private final i:Lcom/google/android/exoplayer2/upstream/a0;

.field private final j:Lcom/google/android/exoplayer2/upstream/b0;

.field private final k:Lc/a/a/a/j2/e0$a;

.field private final l:I

.field private final m:Lcom/google/android/exoplayer2/source/hls/i$b;

.field private final n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/android/exoplayer2/source/hls/m;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/source/hls/m;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Ljava/lang/Runnable;

.field private final q:Ljava/lang/Runnable;

.field private final r:Landroid/os/Handler;

.field private final s:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/android/exoplayer2/source/hls/p;",
            ">;"
        }
    .end annotation
.end field

.field private final t:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc/a/a/a/e2/t;",
            ">;"
        }
    .end annotation
.end field

.field private u:Lc/a/a/a/j2/t0/b;

.field private v:[Lcom/google/android/exoplayer2/source/hls/q$d;

.field private w:[I

.field private x:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private y:Landroid/util/SparseIntArray;

.field private z:Lc/a/a/a/f2/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Integer;

    const/4 v2, 0x1

    .line 2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 3
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/google/android/exoplayer2/source/hls/q;->a:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(ILcom/google/android/exoplayer2/source/hls/q$b;Lcom/google/android/exoplayer2/source/hls/i;Ljava/util/Map;Lcom/google/android/exoplayer2/upstream/e;JLc/a/a/a/u0;Lc/a/a/a/e2/y;Lc/a/a/a/e2/w$a;Lcom/google/android/exoplayer2/upstream/a0;Lc/a/a/a/j2/e0$a;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/android/exoplayer2/source/hls/q$b;",
            "Lcom/google/android/exoplayer2/source/hls/i;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc/a/a/a/e2/t;",
            ">;",
            "Lcom/google/android/exoplayer2/upstream/e;",
            "J",
            "Lc/a/a/a/u0;",
            "Lc/a/a/a/e2/y;",
            "Lc/a/a/a/e2/w$a;",
            "Lcom/google/android/exoplayer2/upstream/a0;",
            "Lc/a/a/a/j2/e0$a;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->b:I

    .line 3
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/q;->c:Lcom/google/android/exoplayer2/source/hls/q$b;

    .line 4
    iput-object p3, p0, Lcom/google/android/exoplayer2/source/hls/q;->d:Lcom/google/android/exoplayer2/source/hls/i;

    .line 5
    iput-object p4, p0, Lcom/google/android/exoplayer2/source/hls/q;->t:Ljava/util/Map;

    .line 6
    iput-object p5, p0, Lcom/google/android/exoplayer2/source/hls/q;->e:Lcom/google/android/exoplayer2/upstream/e;

    .line 7
    iput-object p8, p0, Lcom/google/android/exoplayer2/source/hls/q;->f:Lc/a/a/a/u0;

    .line 8
    iput-object p9, p0, Lcom/google/android/exoplayer2/source/hls/q;->g:Lc/a/a/a/e2/y;

    .line 9
    iput-object p10, p0, Lcom/google/android/exoplayer2/source/hls/q;->h:Lc/a/a/a/e2/w$a;

    .line 10
    iput-object p11, p0, Lcom/google/android/exoplayer2/source/hls/q;->i:Lcom/google/android/exoplayer2/upstream/a0;

    .line 11
    iput-object p12, p0, Lcom/google/android/exoplayer2/source/hls/q;->k:Lc/a/a/a/j2/e0$a;

    .line 12
    iput p13, p0, Lcom/google/android/exoplayer2/source/hls/q;->l:I

    .line 13
    new-instance p1, Lcom/google/android/exoplayer2/upstream/b0;

    const-string p2, "Loader:HlsSampleStreamWrapper"

    invoke-direct {p1, p2}, Lcom/google/android/exoplayer2/upstream/b0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->j:Lcom/google/android/exoplayer2/upstream/b0;

    .line 14
    new-instance p1, Lcom/google/android/exoplayer2/source/hls/i$b;

    invoke-direct {p1}, Lcom/google/android/exoplayer2/source/hls/i$b;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->m:Lcom/google/android/exoplayer2/source/hls/i$b;

    const/4 p1, 0x0

    new-array p2, p1, [I

    .line 15
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/q;->w:[I

    .line 16
    new-instance p2, Ljava/util/HashSet;

    sget-object p3, Lcom/google/android/exoplayer2/source/hls/q;->a:Ljava/util/Set;

    invoke-interface {p3}, Ljava/util/Set;->size()I

    move-result p4

    invoke-direct {p2, p4}, Ljava/util/HashSet;-><init>(I)V

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/q;->x:Ljava/util/Set;

    .line 17
    new-instance p2, Landroid/util/SparseIntArray;

    invoke-interface {p3}, Ljava/util/Set;->size()I

    move-result p3

    invoke-direct {p2, p3}, Landroid/util/SparseIntArray;-><init>(I)V

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/q;->y:Landroid/util/SparseIntArray;

    new-array p2, p1, [Lcom/google/android/exoplayer2/source/hls/q$d;

    .line 18
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    new-array p2, p1, [Z

    .line 19
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/q;->Q:[Z

    new-array p1, p1, [Z

    .line 20
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->P:[Z

    .line 21
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    .line 22
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->o:Ljava/util/List;

    .line 23
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->s:Ljava/util/ArrayList;

    .line 24
    new-instance p1, Lcom/google/android/exoplayer2/source/hls/b;

    invoke-direct {p1, p0}, Lcom/google/android/exoplayer2/source/hls/b;-><init>(Lcom/google/android/exoplayer2/source/hls/q;)V

    .line 25
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->p:Ljava/lang/Runnable;

    .line 26
    new-instance p1, Lcom/google/android/exoplayer2/source/hls/a;

    invoke-direct {p1, p0}, Lcom/google/android/exoplayer2/source/hls/a;-><init>(Lcom/google/android/exoplayer2/source/hls/q;)V

    .line 27
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->q:Ljava/lang/Runnable;

    .line 28
    invoke-static {}, Lc/a/a/a/m2/m0;->v()Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->r:Landroid/os/Handler;

    .line 29
    iput-wide p6, p0, Lcom/google/android/exoplayer2/source/hls/q;->R:J

    .line 30
    iput-wide p6, p0, Lcom/google/android/exoplayer2/source/hls/q;->S:J

    return-void
.end method

.method private static A(II)Lc/a/a/a/f2/i;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unmapped track with id "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " of type "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "HlsSampleStreamWrapper"

    invoke-static {p1, p0}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    new-instance p0, Lc/a/a/a/f2/i;

    invoke-direct {p0}, Lc/a/a/a/f2/i;-><init>()V

    return-object p0
.end method

.method private B(II)Lc/a/a/a/j2/k0;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    array-length v0, v0

    const/4 v1, 0x1

    if-eq p2, v1, :cond_1

    const/4 v2, 0x2

    if-ne p2, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 2
    :cond_1
    :goto_0
    new-instance v9, Lcom/google/android/exoplayer2/source/hls/q$d;

    iget-object v3, p0, Lcom/google/android/exoplayer2/source/hls/q;->e:Lcom/google/android/exoplayer2/upstream/e;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->r:Landroid/os/Handler;

    .line 3
    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/exoplayer2/source/hls/q;->g:Lc/a/a/a/e2/y;

    iget-object v6, p0, Lcom/google/android/exoplayer2/source/hls/q;->h:Lc/a/a/a/e2/w$a;

    iget-object v7, p0, Lcom/google/android/exoplayer2/source/hls/q;->t:Ljava/util/Map;

    const/4 v8, 0x0

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Lcom/google/android/exoplayer2/source/hls/q$d;-><init>(Lcom/google/android/exoplayer2/upstream/e;Landroid/os/Looper;Lc/a/a/a/e2/y;Lc/a/a/a/e2/w$a;Ljava/util/Map;Lcom/google/android/exoplayer2/source/hls/q$a;)V

    .line 4
    iget-wide v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->R:J

    invoke-virtual {v9, v2, v3}, Lc/a/a/a/j2/k0;->T(J)V

    if-eqz v1, :cond_2

    .line 5
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->Y:Lc/a/a/a/e2/t;

    invoke-virtual {v9, v2}, Lcom/google/android/exoplayer2/source/hls/q$d;->a0(Lc/a/a/a/e2/t;)V

    .line 6
    :cond_2
    iget-wide v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->X:J

    invoke-virtual {v9, v2, v3}, Lc/a/a/a/j2/k0;->S(J)V

    .line 7
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->Z:Lcom/google/android/exoplayer2/source/hls/m;

    if-eqz v2, :cond_3

    .line 8
    invoke-virtual {v9, v2}, Lcom/google/android/exoplayer2/source/hls/q$d;->b0(Lcom/google/android/exoplayer2/source/hls/m;)V

    .line 9
    :cond_3
    invoke-virtual {v9, p0}, Lc/a/a/a/j2/k0;->V(Lc/a/a/a/j2/k0$b;)V

    .line 10
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->w:[I

    add-int/lit8 v3, v0, 0x1

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->w:[I

    .line 11
    aput p1, v2, v0

    .line 12
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    invoke-static {p1, v9}, Lc/a/a/a/m2/m0;->t0([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/google/android/exoplayer2/source/hls/q$d;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    .line 13
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->Q:[Z

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->Q:[Z

    .line 14
    aput-boolean v1, p1, v0

    .line 15
    iget-boolean v1, p0, Lcom/google/android/exoplayer2/source/hls/q;->O:Z

    aget-boolean p1, p1, v0

    or-int/2addr p1, v1

    iput-boolean p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->O:Z

    .line 16
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->x:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 17
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->y:Landroid/util/SparseIntArray;

    invoke-virtual {p1, p2, v0}, Landroid/util/SparseIntArray;->append(II)V

    .line 18
    invoke-static {p2}, Lcom/google/android/exoplayer2/source/hls/q;->K(I)I

    move-result p1

    iget v1, p0, Lcom/google/android/exoplayer2/source/hls/q;->A:I

    invoke-static {v1}, Lcom/google/android/exoplayer2/source/hls/q;->K(I)I

    move-result v1

    if-le p1, v1, :cond_4

    .line 19
    iput v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->B:I

    .line 20
    iput p2, p0, Lcom/google/android/exoplayer2/source/hls/q;->A:I

    .line 21
    :cond_4
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->P:[Z

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->P:[Z

    return-object v9
.end method

.method private C([Lc/a/a/a/j2/p0;)Lc/a/a/a/j2/q0;
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 2
    aget-object v2, p1, v1

    .line 3
    iget v3, v2, Lc/a/a/a/j2/p0;->a:I

    new-array v3, v3, [Lc/a/a/a/u0;

    const/4 v4, 0x0

    .line 4
    :goto_1
    iget v5, v2, Lc/a/a/a/j2/p0;->a:I

    if-ge v4, v5, :cond_0

    .line 5
    invoke-virtual {v2, v4}, Lc/a/a/a/j2/p0;->l(I)Lc/a/a/a/u0;

    move-result-object v5

    .line 6
    iget-object v6, p0, Lcom/google/android/exoplayer2/source/hls/q;->g:Lc/a/a/a/e2/y;

    .line 7
    invoke-interface {v6, v5}, Lc/a/a/a/e2/y;->c(Lc/a/a/a/u0;)Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v5, v6}, Lc/a/a/a/u0;->m(Ljava/lang/Class;)Lc/a/a/a/u0;

    move-result-object v5

    aput-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 8
    :cond_0
    new-instance v2, Lc/a/a/a/j2/p0;

    invoke-direct {v2, v3}, Lc/a/a/a/j2/p0;-><init>([Lc/a/a/a/u0;)V

    aput-object v2, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9
    :cond_1
    new-instance v0, Lc/a/a/a/j2/q0;

    invoke-direct {v0, p1}, Lc/a/a/a/j2/q0;-><init>([Lc/a/a/a/j2/p0;)V

    return-object v0
.end method

.method private static D(Lc/a/a/a/u0;Lc/a/a/a/u0;Z)Lc/a/a/a/u0;
    .locals 5

    if-nez p0, :cond_0

    return-object p1

    .line 1
    :cond_0
    iget-object v0, p1, Lc/a/a/a/u0;->l:Ljava/lang/String;

    invoke-static {v0}, Lc/a/a/a/m2/w;->k(Ljava/lang/String;)I

    move-result v0

    .line 2
    iget-object v1, p0, Lc/a/a/a/u0;->i:Ljava/lang/String;

    invoke-static {v1, v0}, Lc/a/a/a/m2/m0;->F(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 3
    iget-object v1, p0, Lc/a/a/a/u0;->i:Ljava/lang/String;

    invoke-static {v1, v0}, Lc/a/a/a/m2/m0;->G(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-static {v0}, Lc/a/a/a/m2/w;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, p0, Lc/a/a/a/u0;->i:Ljava/lang/String;

    iget-object v1, p1, Lc/a/a/a/u0;->l:Ljava/lang/String;

    .line 6
    invoke-static {v0, v1}, Lc/a/a/a/m2/w;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 7
    iget-object v1, p1, Lc/a/a/a/u0;->l:Ljava/lang/String;

    .line 8
    :goto_0
    invoke-virtual {p1}, Lc/a/a/a/u0;->l()Lc/a/a/a/u0$b;

    move-result-object v2

    iget-object v3, p0, Lc/a/a/a/u0;->a:Ljava/lang/String;

    .line 9
    invoke-virtual {v2, v3}, Lc/a/a/a/u0$b;->S(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v2

    iget-object v3, p0, Lc/a/a/a/u0;->b:Ljava/lang/String;

    .line 10
    invoke-virtual {v2, v3}, Lc/a/a/a/u0$b;->U(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v2

    iget-object v3, p0, Lc/a/a/a/u0;->c:Ljava/lang/String;

    .line 11
    invoke-virtual {v2, v3}, Lc/a/a/a/u0$b;->V(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v2

    iget v3, p0, Lc/a/a/a/u0;->d:I

    .line 12
    invoke-virtual {v2, v3}, Lc/a/a/a/u0$b;->g0(I)Lc/a/a/a/u0$b;

    move-result-object v2

    iget v3, p0, Lc/a/a/a/u0;->e:I

    .line 13
    invoke-virtual {v2, v3}, Lc/a/a/a/u0$b;->c0(I)Lc/a/a/a/u0$b;

    move-result-object v2

    const/4 v3, -0x1

    if-eqz p2, :cond_2

    .line 14
    iget v4, p0, Lc/a/a/a/u0;->f:I

    goto :goto_1

    :cond_2
    const/4 v4, -0x1

    :goto_1
    invoke-virtual {v2, v4}, Lc/a/a/a/u0$b;->G(I)Lc/a/a/a/u0$b;

    move-result-object v2

    if-eqz p2, :cond_3

    .line 15
    iget p2, p0, Lc/a/a/a/u0;->g:I

    goto :goto_2

    :cond_3
    const/4 p2, -0x1

    :goto_2
    invoke-virtual {v2, p2}, Lc/a/a/a/u0$b;->Z(I)Lc/a/a/a/u0$b;

    move-result-object p2

    .line 16
    invoke-virtual {p2, v0}, Lc/a/a/a/u0$b;->I(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object p2

    iget v0, p0, Lc/a/a/a/u0;->q:I

    .line 17
    invoke-virtual {p2, v0}, Lc/a/a/a/u0$b;->j0(I)Lc/a/a/a/u0$b;

    move-result-object p2

    iget v0, p0, Lc/a/a/a/u0;->r:I

    .line 18
    invoke-virtual {p2, v0}, Lc/a/a/a/u0$b;->Q(I)Lc/a/a/a/u0$b;

    move-result-object p2

    if-eqz v1, :cond_4

    .line 19
    invoke-virtual {p2, v1}, Lc/a/a/a/u0$b;->e0(Ljava/lang/String;)Lc/a/a/a/u0$b;

    .line 20
    :cond_4
    iget v0, p0, Lc/a/a/a/u0;->y:I

    if-eq v0, v3, :cond_5

    .line 21
    invoke-virtual {p2, v0}, Lc/a/a/a/u0$b;->H(I)Lc/a/a/a/u0$b;

    .line 22
    :cond_5
    iget-object p0, p0, Lc/a/a/a/u0;->j:Lc/a/a/a/h2/a;

    if-eqz p0, :cond_7

    .line 23
    iget-object p1, p1, Lc/a/a/a/u0;->j:Lc/a/a/a/h2/a;

    if-eqz p1, :cond_6

    .line 24
    invoke-virtual {p1, p0}, Lc/a/a/a/h2/a;->m(Lc/a/a/a/h2/a;)Lc/a/a/a/h2/a;

    move-result-object p0

    .line 25
    :cond_6
    invoke-virtual {p2, p0}, Lc/a/a/a/u0$b;->X(Lc/a/a/a/h2/a;)Lc/a/a/a/u0$b;

    .line 26
    :cond_7
    invoke-virtual {p2}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object p0

    return-object p0
.end method

.method private E(I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->j:Lcom/google/android/exoplayer2/upstream/b0;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/upstream/b0;->i()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    :goto_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, -0x1

    if-ge p1, v0, :cond_1

    .line 3
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/source/hls/q;->y(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    :goto_1
    if-ne p1, v1, :cond_2

    return-void

    .line 4
    :cond_2
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->I()Lcom/google/android/exoplayer2/source/hls/m;

    move-result-object v0

    iget-wide v5, v0, Lc/a/a/a/j2/t0/b;->h:J

    .line 5
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/source/hls/q;->F(I)Lcom/google/android/exoplayer2/source/hls/m;

    move-result-object p1

    .line 6
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 7
    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->R:J

    iput-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->S:J

    goto :goto_2

    .line 8
    :cond_3
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-static {v0}, Lc/a/b/b/w;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/source/hls/m;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/source/hls/m;->n()V

    :goto_2
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->V:Z

    .line 10
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/q;->k:Lc/a/a/a/j2/e0$a;

    iget v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->A:I

    iget-wide v3, p1, Lc/a/a/a/j2/t0/b;->g:J

    invoke-virtual/range {v1 .. v6}, Lc/a/a/a/j2/e0$a;->D(IJJ)V

    return-void
.end method

.method private F(I)Lcom/google/android/exoplayer2/source/hls/m;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/source/hls/m;

    .line 2
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v1, p1, v2}, Lc/a/a/a/m2/m0;->A0(Ljava/util/List;II)V

    const/4 p1, 0x0

    .line 3
    :goto_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    array-length v1, v1

    if-ge p1, v1, :cond_0

    .line 4
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/source/hls/m;->l(I)I

    move-result v1

    .line 5
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    aget-object v2, v2, p1

    invoke-virtual {v2, v1}, Lc/a/a/a/j2/k0;->q(I)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private G(Lcom/google/android/exoplayer2/source/hls/m;)Z
    .locals 4

    .line 1
    iget p1, p1, Lcom/google/android/exoplayer2/source/hls/m;->l:I

    .line 2
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 3
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/hls/q;->P:[Z

    aget-boolean v3, v3, v2

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Lc/a/a/a/j2/k0;->J()I

    move-result v3

    if-ne v3, p1, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private static H(Lc/a/a/a/u0;Lc/a/a/a/u0;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lc/a/a/a/u0;->l:Ljava/lang/String;

    .line 2
    iget-object v1, p1, Lc/a/a/a/u0;->l:Ljava/lang/String;

    .line 3
    invoke-static {v0}, Lc/a/a/a/m2/w;->k(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x3

    if-eq v2, v5, :cond_1

    .line 4
    invoke-static {v1}, Lc/a/a/a/m2/w;->k(Ljava/lang/String;)I

    move-result p0

    if-ne v2, p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    return v3

    .line 5
    :cond_1
    invoke-static {v0, v1}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v4

    :cond_2
    const-string v1, "application/cea-608"

    .line 6
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "application/cea-708"

    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    return v3

    .line 8
    :cond_4
    :goto_1
    iget p0, p0, Lc/a/a/a/u0;->D:I

    iget p1, p1, Lc/a/a/a/u0;->D:I

    if-ne p0, p1, :cond_5

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    :goto_2
    return v3
.end method

.method private I()Lcom/google/android/exoplayer2/source/hls/m;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/source/hls/m;

    return-object v0
.end method

.method private J(II)Lc/a/a/a/f2/b0;
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/exoplayer2/source/hls/q;->a:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lc/a/a/a/m2/f;->a(Z)V

    .line 2
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->y:Landroid/util/SparseIntArray;

    const/4 v1, -0x1

    invoke-virtual {v0, p2, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result v0

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/q;->x:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/q;->w:[I

    aput p1, v1, v0

    .line 5
    :cond_1
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/q;->w:[I

    aget v1, v1, v0

    if-ne v1, p1, :cond_2

    .line 6
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    aget-object p1, p1, v0

    goto :goto_0

    .line 7
    :cond_2
    invoke-static {p1, p2}, Lcom/google/android/exoplayer2/source/hls/q;->A(II)Lc/a/a/a/f2/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private static K(I)I
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p0, v1, :cond_2

    const/4 v2, 0x3

    if-eq p0, v0, :cond_1

    if-eq p0, v2, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    return v1

    :cond_1
    return v2

    :cond_2
    return v0
.end method

.method private L(Lcom/google/android/exoplayer2/source/hls/m;)V
    .locals 6

    .line 1
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->Z:Lcom/google/android/exoplayer2/source/hls/m;

    .line 2
    iget-object v0, p1, Lc/a/a/a/j2/t0/b;->d:Lc/a/a/a/u0;

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->H:Lc/a/a/a/u0;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 3
    iput-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->S:J

    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5
    invoke-static {}, Lc/a/b/b/r;->k()Lc/a/b/b/r$a;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v5, v1, v4

    .line 7
    invoke-virtual {v5}, Lc/a/a/a/j2/k0;->A()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Lc/a/b/b/r$a;->d(Ljava/lang/Object;)Lc/a/b/b/r$a;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lc/a/b/b/r$a;->e()Lc/a/b/b/r;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Lcom/google/android/exoplayer2/source/hls/m;->m(Lcom/google/android/exoplayer2/source/hls/q;Lc/a/b/b/r;)V

    .line 9
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    array-length v1, v0

    :goto_1
    if-ge v3, v1, :cond_2

    aget-object v2, v0, v3

    .line 10
    invoke-virtual {v2, p1}, Lcom/google/android/exoplayer2/source/hls/q$d;->b0(Lcom/google/android/exoplayer2/source/hls/m;)V

    .line 11
    iget-boolean v4, p1, Lcom/google/android/exoplayer2/source/hls/m;->o:Z

    if-eqz v4, :cond_1

    .line 12
    invoke-virtual {v2}, Lc/a/a/a/j2/k0;->Y()V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method private static M(Lc/a/a/a/j2/t0/b;)Z
    .locals 0

    .line 1
    instance-of p0, p0, Lcom/google/android/exoplayer2/source/hls/m;

    return p0
.end method

.method private N()Z
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->S:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static synthetic P(Lcom/google/android/exoplayer2/source/hls/q;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->b0()V

    return-void
.end method

.method public static synthetic Q(Lcom/google/android/exoplayer2/source/hls/q;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->S()V

    return-void
.end method

.method private R()V
    .locals 6
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "trackGroupToSampleQueueIndex"
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "trackGroups"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->K:Lc/a/a/a/j2/q0;

    iget v0, v0, Lc/a/a/a/j2/q0;->b:I

    .line 2
    new-array v1, v0, [I

    iput-object v1, p0, Lcom/google/android/exoplayer2/source/hls/q;->M:[I

    const/4 v2, -0x1

    .line 3
    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([II)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    const/4 v3, 0x0

    .line 4
    :goto_1
    iget-object v4, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    array-length v5, v4

    if-ge v3, v5, :cond_1

    .line 5
    aget-object v4, v4, v3

    .line 6
    invoke-virtual {v4}, Lc/a/a/a/j2/k0;->z()Lc/a/a/a/u0;

    move-result-object v4

    invoke-static {v4}, Lc/a/a/a/m2/f;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc/a/a/a/u0;

    .line 7
    iget-object v5, p0, Lcom/google/android/exoplayer2/source/hls/q;->K:Lc/a/a/a/j2/q0;

    invoke-virtual {v5, v2}, Lc/a/a/a/j2/q0;->l(I)Lc/a/a/a/j2/p0;

    move-result-object v5

    invoke-virtual {v5, v1}, Lc/a/a/a/j2/p0;->l(I)Lc/a/a/a/u0;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/android/exoplayer2/source/hls/q;->H(Lc/a/a/a/u0;Lc/a/a/a/u0;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 8
    iget-object v4, p0, Lcom/google/android/exoplayer2/source/hls/q;->M:[I

    aput v3, v4, v2

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/exoplayer2/source/hls/p;

    .line 10
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/source/hls/p;->d()V

    goto :goto_3

    :cond_3
    return-void
.end method

.method private S()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->J:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->M:[I

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->C:Z

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    .line 3
    invoke-virtual {v3}, Lc/a/a/a/j2/k0;->z()Lc/a/a/a/u0;

    move-result-object v3

    if-nez v3, :cond_1

    return-void

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 4
    :cond_2
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->K:Lc/a/a/a/j2/q0;

    if-eqz v0, :cond_3

    .line 5
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->R()V

    goto :goto_1

    .line 6
    :cond_3
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->x()V

    .line 7
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->k0()V

    .line 8
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->c:Lcom/google/android/exoplayer2/source/hls/q$b;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/source/hls/q$b;->f()V

    :cond_4
    :goto_1
    return-void
.end method

.method private b0()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->C:Z

    .line 2
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->S()V

    return-void
.end method

.method private f0()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    .line 2
    iget-boolean v5, p0, Lcom/google/android/exoplayer2/source/hls/q;->T:Z

    invoke-virtual {v4, v5}, Lc/a/a/a/j2/k0;->P(Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 3
    :cond_0
    iput-boolean v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->T:Z

    return-void
.end method

.method private g0(J)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 2
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    aget-object v3, v3, v2

    .line 3
    invoke-virtual {v3, p1, p2, v1}, Lc/a/a/a/j2/k0;->R(JZ)Z

    move-result v3

    if-nez v3, :cond_1

    .line 4
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/hls/q;->Q:[Z

    aget-boolean v3, v3, v2

    if-nez v3, :cond_0

    iget-boolean v3, p0, Lcom/google/android/exoplayer2/source/hls/q;->O:Z

    if-nez v3, :cond_1

    :cond_0
    return v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method private k0()V
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "trackGroups",
            "optionalTrackGroups"
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->D:Z

    return-void
.end method

.method private p0([Lc/a/a/a/j2/l0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 2
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    if-eqz v2, :cond_0

    .line 3
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/hls/q;->s:Ljava/util/ArrayList;

    check-cast v2, Lcom/google/android/exoplayer2/source/hls/p;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private v()V
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "trackGroups",
            "optionalTrackGroups"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->D:Z

    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->K:Lc/a/a/a/j2/q0;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->L:Ljava/util/Set;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private x()V
    .locals 14
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "trackGroups",
            "optionalTrackGroups",
            "trackGroupToSampleQueueIndex"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    array-length v0, v0

    const/4 v1, 0x7

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    const/4 v6, -0x1

    :goto_0
    const/4 v7, 0x2

    const/4 v8, 0x1

    if-ge v4, v0, :cond_5

    .line 2
    iget-object v9, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    aget-object v9, v9, v4

    .line 3
    invoke-virtual {v9}, Lc/a/a/a/j2/k0;->z()Lc/a/a/a/u0;

    move-result-object v9

    invoke-static {v9}, Lc/a/a/a/m2/f;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lc/a/a/a/u0;

    iget-object v9, v9, Lc/a/a/a/u0;->l:Ljava/lang/String;

    .line 4
    invoke-static {v9}, Lc/a/a/a/m2/w;->q(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_1

    .line 5
    :cond_0
    invoke-static {v9}, Lc/a/a/a/m2/w;->o(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x1

    goto :goto_1

    .line 6
    :cond_1
    invoke-static {v9}, Lc/a/a/a/m2/w;->p(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/4 v7, 0x3

    goto :goto_1

    :cond_2
    const/4 v7, 0x7

    .line 7
    :goto_1
    invoke-static {v7}, Lcom/google/android/exoplayer2/source/hls/q;->K(I)I

    move-result v8

    invoke-static {v5}, Lcom/google/android/exoplayer2/source/hls/q;->K(I)I

    move-result v9

    if-le v8, v9, :cond_3

    move v6, v4

    move v5, v7

    goto :goto_2

    :cond_3
    if-ne v7, v5, :cond_4

    if-eq v6, v2, :cond_4

    const/4 v6, -0x1

    :cond_4
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 8
    :cond_5
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/q;->d:Lcom/google/android/exoplayer2/source/hls/i;

    invoke-virtual {v1}, Lcom/google/android/exoplayer2/source/hls/i;->i()Lc/a/a/a/j2/p0;

    move-result-object v1

    .line 9
    iget v4, v1, Lc/a/a/a/j2/p0;->a:I

    .line 10
    iput v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->N:I

    .line 11
    new-array v2, v0, [I

    iput-object v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->M:[I

    const/4 v2, 0x0

    :goto_3
    if-ge v2, v0, :cond_6

    .line 12
    iget-object v9, p0, Lcom/google/android/exoplayer2/source/hls/q;->M:[I

    aput v2, v9, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 13
    :cond_6
    new-array v2, v0, [Lc/a/a/a/j2/p0;

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v0, :cond_b

    .line 14
    iget-object v10, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    aget-object v10, v10, v9

    invoke-virtual {v10}, Lc/a/a/a/j2/k0;->z()Lc/a/a/a/u0;

    move-result-object v10

    invoke-static {v10}, Lc/a/a/a/m2/f;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lc/a/a/a/u0;

    if-ne v9, v6, :cond_9

    .line 15
    new-array v11, v4, [Lc/a/a/a/u0;

    if-ne v4, v8, :cond_7

    .line 16
    invoke-virtual {v1, v3}, Lc/a/a/a/j2/p0;->l(I)Lc/a/a/a/u0;

    move-result-object v12

    invoke-virtual {v10, v12}, Lc/a/a/a/u0;->p(Lc/a/a/a/u0;)Lc/a/a/a/u0;

    move-result-object v10

    aput-object v10, v11, v3

    goto :goto_6

    :cond_7
    const/4 v12, 0x0

    :goto_5
    if-ge v12, v4, :cond_8

    .line 17
    invoke-virtual {v1, v12}, Lc/a/a/a/j2/p0;->l(I)Lc/a/a/a/u0;

    move-result-object v13

    invoke-static {v13, v10, v8}, Lcom/google/android/exoplayer2/source/hls/q;->D(Lc/a/a/a/u0;Lc/a/a/a/u0;Z)Lc/a/a/a/u0;

    move-result-object v13

    aput-object v13, v11, v12

    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    .line 18
    :cond_8
    :goto_6
    new-instance v10, Lc/a/a/a/j2/p0;

    invoke-direct {v10, v11}, Lc/a/a/a/j2/p0;-><init>([Lc/a/a/a/u0;)V

    aput-object v10, v2, v9

    .line 19
    iput v9, p0, Lcom/google/android/exoplayer2/source/hls/q;->N:I

    goto :goto_8

    :cond_9
    if-ne v5, v7, :cond_a

    .line 20
    iget-object v11, v10, Lc/a/a/a/u0;->l:Ljava/lang/String;

    invoke-static {v11}, Lc/a/a/a/m2/w;->o(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_a

    .line 21
    iget-object v11, p0, Lcom/google/android/exoplayer2/source/hls/q;->f:Lc/a/a/a/u0;

    goto :goto_7

    :cond_a
    const/4 v11, 0x0

    .line 22
    :goto_7
    new-instance v12, Lc/a/a/a/j2/p0;

    new-array v13, v8, [Lc/a/a/a/u0;

    invoke-static {v11, v10, v3}, Lcom/google/android/exoplayer2/source/hls/q;->D(Lc/a/a/a/u0;Lc/a/a/a/u0;Z)Lc/a/a/a/u0;

    move-result-object v10

    aput-object v10, v13, v3

    invoke-direct {v12, v13}, Lc/a/a/a/j2/p0;-><init>([Lc/a/a/a/u0;)V

    aput-object v12, v2, v9

    :goto_8
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    .line 23
    :cond_b
    invoke-direct {p0, v2}, Lcom/google/android/exoplayer2/source/hls/q;->C([Lc/a/a/a/j2/p0;)Lc/a/a/a/j2/q0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->K:Lc/a/a/a/j2/q0;

    .line 24
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->L:Ljava/util/Set;

    if-nez v0, :cond_c

    const/4 v3, 0x1

    :cond_c
    invoke-static {v3}, Lc/a/a/a/m2/f;->f(Z)V

    .line 25
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->L:Ljava/util/Set;

    return-void
.end method

.method private y(I)Z
    .locals 4

    move v0, p1

    .line 1
    :goto_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_1

    .line 2
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/exoplayer2/source/hls/m;

    iget-boolean v1, v1, Lcom/google/android/exoplayer2/source/hls/m;->o:Z

    if-eqz v1, :cond_0

    return v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/exoplayer2/source/hls/m;

    const/4 v0, 0x0

    .line 4
    :goto_1
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    array-length v1, v1

    if-ge v0, v1, :cond_3

    .line 5
    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/source/hls/m;->l(I)I

    move-result v1

    .line 6
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    aget-object v3, v3, v0

    invoke-virtual {v3}, Lc/a/a/a/j2/k0;->w()I

    move-result v3

    if-le v3, v1, :cond_2

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public O(I)Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->N()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    aget-object p1, v0, p1

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->V:Z

    invoke-virtual {p1, v0}, Lc/a/a/a/j2/k0;->E(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public T()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->j:Lcom/google/android/exoplayer2/upstream/b0;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/upstream/b0;->j()V

    .line 2
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->d:Lcom/google/android/exoplayer2/source/hls/i;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/source/hls/i;->m()V

    return-void
.end method

.method public U(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/source/hls/q;->T()V

    .line 2
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lc/a/a/a/j2/k0;->G()V

    return-void
.end method

.method public V(Lc/a/a/a/j2/t0/b;JJZ)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    .line 1
    iput-object v2, v0, Lcom/google/android/exoplayer2/source/hls/q;->u:Lc/a/a/a/j2/t0/b;

    .line 2
    new-instance v2, Lc/a/a/a/j2/w;

    iget-wide v4, v1, Lc/a/a/a/j2/t0/b;->a:J

    iget-object v6, v1, Lc/a/a/a/j2/t0/b;->b:Lcom/google/android/exoplayer2/upstream/p;

    .line 3
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/j2/t0/b;->f()Landroid/net/Uri;

    move-result-object v7

    .line 4
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/j2/t0/b;->e()Ljava/util/Map;

    move-result-object v8

    .line 5
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/j2/t0/b;->b()J

    move-result-wide v13

    move-object v3, v2

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lc/a/a/a/j2/w;-><init>(JLcom/google/android/exoplayer2/upstream/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 6
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/hls/q;->i:Lcom/google/android/exoplayer2/upstream/a0;

    iget-wide v4, v1, Lc/a/a/a/j2/t0/b;->a:J

    invoke-interface {v3, v4, v5}, Lcom/google/android/exoplayer2/upstream/a0;->a(J)V

    .line 7
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/hls/q;->k:Lc/a/a/a/j2/e0$a;

    iget v5, v1, Lc/a/a/a/j2/t0/b;->c:I

    iget v6, v0, Lcom/google/android/exoplayer2/source/hls/q;->b:I

    iget-object v7, v1, Lc/a/a/a/j2/t0/b;->d:Lc/a/a/a/u0;

    iget v8, v1, Lc/a/a/a/j2/t0/b;->e:I

    iget-object v9, v1, Lc/a/a/a/j2/t0/b;->f:Ljava/lang/Object;

    iget-wide v10, v1, Lc/a/a/a/j2/t0/b;->g:J

    iget-wide v12, v1, Lc/a/a/a/j2/t0/b;->h:J

    move-object v4, v2

    invoke-virtual/range {v3 .. v13}, Lc/a/a/a/j2/e0$a;->r(Lc/a/a/a/j2/w;IILc/a/a/a/u0;ILjava/lang/Object;JJ)V

    if-nez p6, :cond_2

    .line 8
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->N()Z

    move-result v1

    if-nez v1, :cond_0

    iget v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->G:I

    if-nez v1, :cond_1

    .line 9
    :cond_0
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->f0()V

    .line 10
    :cond_1
    iget v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->G:I

    if-lez v1, :cond_2

    .line 11
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->c:Lcom/google/android/exoplayer2/source/hls/q$b;

    invoke-interface {v1, p0}, Lc/a/a/a/j2/m0$a;->p(Lc/a/a/a/j2/m0;)V

    :cond_2
    return-void
.end method

.method public W(Lc/a/a/a/j2/t0/b;JJ)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    .line 1
    iput-object v2, v0, Lcom/google/android/exoplayer2/source/hls/q;->u:Lc/a/a/a/j2/t0/b;

    .line 2
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/q;->d:Lcom/google/android/exoplayer2/source/hls/i;

    invoke-virtual {v2, v1}, Lcom/google/android/exoplayer2/source/hls/i;->n(Lc/a/a/a/j2/t0/b;)V

    .line 3
    new-instance v2, Lc/a/a/a/j2/w;

    iget-wide v4, v1, Lc/a/a/a/j2/t0/b;->a:J

    iget-object v6, v1, Lc/a/a/a/j2/t0/b;->b:Lcom/google/android/exoplayer2/upstream/p;

    .line 4
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/j2/t0/b;->f()Landroid/net/Uri;

    move-result-object v7

    .line 5
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/j2/t0/b;->e()Ljava/util/Map;

    move-result-object v8

    .line 6
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/j2/t0/b;->b()J

    move-result-wide v13

    move-object v3, v2

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lc/a/a/a/j2/w;-><init>(JLcom/google/android/exoplayer2/upstream/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 7
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/hls/q;->i:Lcom/google/android/exoplayer2/upstream/a0;

    iget-wide v4, v1, Lc/a/a/a/j2/t0/b;->a:J

    invoke-interface {v3, v4, v5}, Lcom/google/android/exoplayer2/upstream/a0;->a(J)V

    .line 8
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/hls/q;->k:Lc/a/a/a/j2/e0$a;

    iget v5, v1, Lc/a/a/a/j2/t0/b;->c:I

    iget v6, v0, Lcom/google/android/exoplayer2/source/hls/q;->b:I

    iget-object v7, v1, Lc/a/a/a/j2/t0/b;->d:Lc/a/a/a/u0;

    iget v8, v1, Lc/a/a/a/j2/t0/b;->e:I

    iget-object v9, v1, Lc/a/a/a/j2/t0/b;->f:Ljava/lang/Object;

    iget-wide v10, v1, Lc/a/a/a/j2/t0/b;->g:J

    iget-wide v12, v1, Lc/a/a/a/j2/t0/b;->h:J

    move-object v4, v2

    invoke-virtual/range {v3 .. v13}, Lc/a/a/a/j2/e0$a;->u(Lc/a/a/a/j2/w;IILc/a/a/a/u0;ILjava/lang/Object;JJ)V

    .line 9
    iget-boolean v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->D:Z

    if-nez v1, :cond_0

    .line 10
    iget-wide v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->R:J

    invoke-virtual {p0, v1, v2}, Lcom/google/android/exoplayer2/source/hls/q;->d(J)Z

    goto :goto_0

    .line 11
    :cond_0
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->c:Lcom/google/android/exoplayer2/source/hls/q$b;

    invoke-interface {v1, p0}, Lc/a/a/a/j2/m0$a;->p(Lc/a/a/a/j2/m0;)V

    :goto_0
    return-void
.end method

.method public X(Lc/a/a/a/j2/t0/b;JJLjava/io/IOException;I)Lcom/google/android/exoplayer2/upstream/b0$c;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v13, p6

    .line 1
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/source/hls/q;->M(Lc/a/a/a/j2/t0/b;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 2
    move-object v3, v1

    check-cast v3, Lcom/google/android/exoplayer2/source/hls/m;

    .line 3
    invoke-virtual {v3}, Lcom/google/android/exoplayer2/source/hls/m;->q()Z

    move-result v3

    if-nez v3, :cond_1

    instance-of v3, v13, Lcom/google/android/exoplayer2/upstream/y$e;

    if-eqz v3, :cond_1

    .line 4
    move-object v3, v13

    check-cast v3, Lcom/google/android/exoplayer2/upstream/y$e;

    iget v3, v3, Lcom/google/android/exoplayer2/upstream/y$e;->c:I

    const/16 v4, 0x19a

    if-eq v3, v4, :cond_0

    const/16 v4, 0x194

    if-ne v3, v4, :cond_1

    .line 5
    :cond_0
    sget-object v1, Lcom/google/android/exoplayer2/upstream/b0;->a:Lcom/google/android/exoplayer2/upstream/b0$c;

    return-object v1

    .line 6
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/j2/t0/b;->b()J

    move-result-wide v3

    .line 7
    new-instance v5, Lc/a/a/a/j2/w;

    iget-wide v6, v1, Lc/a/a/a/j2/t0/b;->a:J

    iget-object v8, v1, Lc/a/a/a/j2/t0/b;->b:Lcom/google/android/exoplayer2/upstream/p;

    .line 8
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/j2/t0/b;->f()Landroid/net/Uri;

    move-result-object v18

    .line 9
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/j2/t0/b;->e()Ljava/util/Map;

    move-result-object v19

    move-object v14, v5

    move-wide v15, v6

    move-object/from16 v17, v8

    move-wide/from16 v20, p2

    move-wide/from16 v22, p4

    move-wide/from16 v24, v3

    invoke-direct/range {v14 .. v25}, Lc/a/a/a/j2/w;-><init>(JLcom/google/android/exoplayer2/upstream/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 10
    new-instance v6, Lc/a/a/a/j2/z;

    iget v7, v1, Lc/a/a/a/j2/t0/b;->c:I

    iget v8, v0, Lcom/google/android/exoplayer2/source/hls/q;->b:I

    iget-object v9, v1, Lc/a/a/a/j2/t0/b;->d:Lc/a/a/a/u0;

    iget v10, v1, Lc/a/a/a/j2/t0/b;->e:I

    iget-object v11, v1, Lc/a/a/a/j2/t0/b;->f:Ljava/lang/Object;

    iget-wide v14, v1, Lc/a/a/a/j2/t0/b;->g:J

    .line 11
    invoke-static {v14, v15}, Lc/a/a/a/i0;->d(J)J

    move-result-wide v26

    iget-wide v14, v1, Lc/a/a/a/j2/t0/b;->h:J

    .line 12
    invoke-static {v14, v15}, Lc/a/a/a/i0;->d(J)J

    move-result-wide v28

    move-object/from16 v20, v6

    move/from16 v21, v7

    move/from16 v22, v8

    move-object/from16 v23, v9

    move/from16 v24, v10

    move-object/from16 v25, v11

    invoke-direct/range {v20 .. v29}, Lc/a/a/a/j2/z;-><init>(IILc/a/a/a/u0;ILjava/lang/Object;JJ)V

    .line 13
    new-instance v7, Lcom/google/android/exoplayer2/upstream/a0$a;

    move/from16 v8, p7

    invoke-direct {v7, v5, v6, v13, v8}, Lcom/google/android/exoplayer2/upstream/a0$a;-><init>(Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Ljava/io/IOException;I)V

    .line 14
    iget-object v6, v0, Lcom/google/android/exoplayer2/source/hls/q;->i:Lcom/google/android/exoplayer2/upstream/a0;

    invoke-interface {v6, v7}, Lcom/google/android/exoplayer2/upstream/a0;->c(Lcom/google/android/exoplayer2/upstream/a0$a;)J

    move-result-wide v8

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v6, 0x0

    cmp-long v12, v8, v10

    if-eqz v12, :cond_2

    .line 15
    iget-object v12, v0, Lcom/google/android/exoplayer2/source/hls/q;->d:Lcom/google/android/exoplayer2/source/hls/i;

    invoke-virtual {v12, v1, v8, v9}, Lcom/google/android/exoplayer2/source/hls/i;->l(Lc/a/a/a/j2/t0/b;J)Z

    move-result v8

    move v15, v8

    goto :goto_0

    :cond_2
    const/4 v15, 0x0

    :goto_0
    const/4 v8, 0x1

    if-eqz v15, :cond_6

    if-eqz v2, :cond_5

    const-wide/16 v9, 0x0

    cmp-long v2, v3, v9

    if-nez v2, :cond_5

    .line 16
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v8

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/exoplayer2/source/hls/m;

    if-ne v2, v1, :cond_3

    const/4 v6, 0x1

    .line 17
    :cond_3
    invoke-static {v6}, Lc/a/a/a/m2/f;->f(Z)V

    .line 18
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 19
    iget-wide v2, v0, Lcom/google/android/exoplayer2/source/hls/q;->R:J

    iput-wide v2, v0, Lcom/google/android/exoplayer2/source/hls/q;->S:J

    goto :goto_1

    .line 20
    :cond_4
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-static {v2}, Lc/a/b/b/w;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/exoplayer2/source/hls/m;

    invoke-virtual {v2}, Lcom/google/android/exoplayer2/source/hls/m;->n()V

    .line 21
    :cond_5
    :goto_1
    sget-object v2, Lcom/google/android/exoplayer2/upstream/b0;->c:Lcom/google/android/exoplayer2/upstream/b0$c;

    :goto_2
    move-object/from16 v16, v2

    goto :goto_3

    .line 22
    :cond_6
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/q;->i:Lcom/google/android/exoplayer2/upstream/a0;

    invoke-interface {v2, v7}, Lcom/google/android/exoplayer2/upstream/a0;->b(Lcom/google/android/exoplayer2/upstream/a0$a;)J

    move-result-wide v2

    cmp-long v4, v2, v10

    if-eqz v4, :cond_7

    .line 23
    invoke-static {v6, v2, v3}, Lcom/google/android/exoplayer2/upstream/b0;->g(ZJ)Lcom/google/android/exoplayer2/upstream/b0$c;

    move-result-object v2

    goto :goto_2

    .line 24
    :cond_7
    sget-object v2, Lcom/google/android/exoplayer2/upstream/b0;->d:Lcom/google/android/exoplayer2/upstream/b0$c;

    goto :goto_2

    .line 25
    :goto_3
    invoke-virtual/range {v16 .. v16}, Lcom/google/android/exoplayer2/upstream/b0$c;->c()Z

    move-result v2

    xor-int/lit8 v17, v2, 0x1

    .line 26
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/q;->k:Lc/a/a/a/j2/e0$a;

    iget v4, v1, Lc/a/a/a/j2/t0/b;->c:I

    iget v6, v0, Lcom/google/android/exoplayer2/source/hls/q;->b:I

    iget-object v7, v1, Lc/a/a/a/j2/t0/b;->d:Lc/a/a/a/u0;

    iget v8, v1, Lc/a/a/a/j2/t0/b;->e:I

    iget-object v9, v1, Lc/a/a/a/j2/t0/b;->f:Ljava/lang/Object;

    iget-wide v10, v1, Lc/a/a/a/j2/t0/b;->g:J

    iget-wide v12, v1, Lc/a/a/a/j2/t0/b;->h:J

    move-object v3, v5

    move v5, v6

    move-object v6, v7

    move v7, v8

    move-object v8, v9

    move-wide v9, v10

    move-wide v11, v12

    move-object/from16 v13, p6

    move/from16 v14, v17

    invoke-virtual/range {v2 .. v14}, Lc/a/a/a/j2/e0$a;->w(Lc/a/a/a/j2/w;IILc/a/a/a/u0;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    if-eqz v17, :cond_8

    const/4 v2, 0x0

    .line 27
    iput-object v2, v0, Lcom/google/android/exoplayer2/source/hls/q;->u:Lc/a/a/a/j2/t0/b;

    .line 28
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/q;->i:Lcom/google/android/exoplayer2/upstream/a0;

    iget-wide v3, v1, Lc/a/a/a/j2/t0/b;->a:J

    invoke-interface {v2, v3, v4}, Lcom/google/android/exoplayer2/upstream/a0;->a(J)V

    :cond_8
    if-eqz v15, :cond_a

    .line 29
    iget-boolean v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->D:Z

    if-nez v1, :cond_9

    .line 30
    iget-wide v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->R:J

    invoke-virtual {v0, v1, v2}, Lcom/google/android/exoplayer2/source/hls/q;->d(J)Z

    goto :goto_4

    .line 31
    :cond_9
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->c:Lcom/google/android/exoplayer2/source/hls/q$b;

    invoke-interface {v1, v0}, Lc/a/a/a/j2/m0$a;->p(Lc/a/a/a/j2/m0;)V

    :cond_a
    :goto_4
    return-object v16
.end method

.method public Y()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->x:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public Z(Landroid/net/Uri;J)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->d:Lcom/google/android/exoplayer2/source/hls/i;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/exoplayer2/source/hls/i;->o(Landroid/net/Uri;J)Z

    move-result p1

    return p1
.end method

.method public a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->j:Lcom/google/android/exoplayer2/upstream/b0;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/upstream/b0;->i()Z

    move-result v0

    return v0
.end method

.method public a0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-static {v0}, Lc/a/b/b/w;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/source/hls/m;

    .line 3
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/q;->d:Lcom/google/android/exoplayer2/source/hls/i;

    invoke-virtual {v1, v0}, Lcom/google/android/exoplayer2/source/hls/i;->b(Lcom/google/android/exoplayer2/source/hls/m;)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/source/hls/m;->v()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    if-ne v1, v0, :cond_2

    .line 5
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->V:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->j:Lcom/google/android/exoplayer2/upstream/b0;

    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/upstream/b0;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->j:Lcom/google/android/exoplayer2/upstream/b0;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/upstream/b0;->e()V

    :cond_2
    :goto_0
    return-void
.end method

.method public b()J
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->N()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->S:J

    return-wide v0

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->V:Z

    if-eqz v0, :cond_1

    const-wide/high16 v0, -0x8000000000000000L

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->I()Lcom/google/android/exoplayer2/source/hls/m;

    move-result-object v0

    iget-wide v0, v0, Lc/a/a/a/j2/t0/b;->h:J

    :goto_0
    return-wide v0
.end method

.method public c()J
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->V:Z

    if-eqz v0, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->N()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->S:J

    return-wide v0

    .line 4
    :cond_1
    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->R:J

    .line 5
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->I()Lcom/google/android/exoplayer2/source/hls/m;

    move-result-object v2

    .line 6
    invoke-virtual {v2}, Lcom/google/android/exoplayer2/source/hls/m;->p()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    .line 7
    :cond_2
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_3

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x2

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/exoplayer2/source/hls/m;

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_4

    .line 8
    iget-wide v2, v2, Lc/a/a/a/j2/t0/b;->h:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    .line 9
    :cond_4
    iget-boolean v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->C:Z

    if-eqz v2, :cond_5

    .line 10
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_5

    aget-object v5, v2, v4

    .line 11
    invoke-virtual {v5}, Lc/a/a/a/j2/k0;->t()J

    move-result-wide v5

    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    return-wide v0
.end method

.method public varargs c0([Lc/a/a/a/j2/p0;I[I)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/source/hls/q;->C([Lc/a/a/a/j2/p0;)Lc/a/a/a/j2/q0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->K:Lc/a/a/a/j2/q0;

    .line 2
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->L:Ljava/util/Set;

    .line 3
    array-length p1, p3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    aget v1, p3, v0

    .line 4
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->L:Ljava/util/Set;

    iget-object v3, p0, Lcom/google/android/exoplayer2/source/hls/q;->K:Lc/a/a/a/j2/q0;

    invoke-virtual {v3, v1}, Lc/a/a/a/j2/q0;->l(I)Lc/a/a/a/j2/p0;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 5
    :cond_0
    iput p2, p0, Lcom/google/android/exoplayer2/source/hls/q;->N:I

    .line 6
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->r:Landroid/os/Handler;

    iget-object p2, p0, Lcom/google/android/exoplayer2/source/hls/q;->c:Lcom/google/android/exoplayer2/source/hls/q$b;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p3, Lcom/google/android/exoplayer2/source/hls/c;

    invoke-direct {p3, p2}, Lcom/google/android/exoplayer2/source/hls/c;-><init>(Lcom/google/android/exoplayer2/source/hls/q$b;)V

    invoke-virtual {p1, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 7
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->k0()V

    return-void
.end method

.method public d(J)Z
    .locals 23

    move-object/from16 v0, p0

    .line 1
    iget-boolean v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->V:Z

    const/4 v2, 0x0

    if-nez v1, :cond_a

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->j:Lcom/google/android/exoplayer2/upstream/b0;

    invoke-virtual {v1}, Lcom/google/android/exoplayer2/upstream/b0;->i()Z

    move-result v1

    if-nez v1, :cond_a

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->j:Lcom/google/android/exoplayer2/upstream/b0;

    invoke-virtual {v1}, Lcom/google/android/exoplayer2/upstream/b0;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_4

    .line 2
    :cond_0
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/source/hls/q;->N()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    .line 4
    iget-wide v3, v0, Lcom/google/android/exoplayer2/source/hls/q;->S:J

    .line 5
    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_3

    aget-object v8, v5, v7

    .line 6
    iget-wide v9, v0, Lcom/google/android/exoplayer2/source/hls/q;->S:J

    invoke-virtual {v8, v9, v10}, Lc/a/a/a/j2/k0;->T(J)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 7
    :cond_1
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->o:Ljava/util/List;

    .line 8
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/source/hls/q;->I()Lcom/google/android/exoplayer2/source/hls/m;

    move-result-object v3

    .line 9
    invoke-virtual {v3}, Lcom/google/android/exoplayer2/source/hls/m;->p()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 10
    iget-wide v3, v3, Lc/a/a/a/j2/t0/b;->h:J

    goto :goto_1

    .line 11
    :cond_2
    iget-wide v4, v0, Lcom/google/android/exoplayer2/source/hls/q;->R:J

    iget-wide v6, v3, Lc/a/a/a/j2/t0/b;->g:J

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    :cond_3
    :goto_1
    move-object v10, v1

    move-wide v8, v3

    .line 12
    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/q;->d:Lcom/google/android/exoplayer2/source/hls/i;

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->D:Z

    const/4 v3, 0x1

    if-nez v1, :cond_5

    .line 13
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v11, 0x0

    goto :goto_3

    :cond_5
    :goto_2
    const/4 v11, 0x1

    :goto_3
    iget-object v12, v0, Lcom/google/android/exoplayer2/source/hls/q;->m:Lcom/google/android/exoplayer2/source/hls/i$b;

    move-wide/from16 v6, p1

    .line 14
    invoke-virtual/range {v5 .. v12}, Lcom/google/android/exoplayer2/source/hls/i;->d(JJLjava/util/List;ZLcom/google/android/exoplayer2/source/hls/i$b;)V

    .line 15
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->m:Lcom/google/android/exoplayer2/source/hls/i$b;

    iget-boolean v4, v1, Lcom/google/android/exoplayer2/source/hls/i$b;->b:Z

    .line 16
    iget-object v5, v1, Lcom/google/android/exoplayer2/source/hls/i$b;->a:Lc/a/a/a/j2/t0/b;

    .line 17
    iget-object v6, v1, Lcom/google/android/exoplayer2/source/hls/i$b;->c:Landroid/net/Uri;

    .line 18
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/source/hls/i$b;->a()V

    if-eqz v4, :cond_6

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    iput-wide v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->S:J

    .line 20
    iput-boolean v3, v0, Lcom/google/android/exoplayer2/source/hls/q;->V:Z

    return v3

    :cond_6
    if-nez v5, :cond_8

    if-eqz v6, :cond_7

    .line 21
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->c:Lcom/google/android/exoplayer2/source/hls/q$b;

    invoke-interface {v1, v6}, Lcom/google/android/exoplayer2/source/hls/q$b;->j(Landroid/net/Uri;)V

    :cond_7
    return v2

    .line 22
    :cond_8
    invoke-static {v5}, Lcom/google/android/exoplayer2/source/hls/q;->M(Lc/a/a/a/j2/t0/b;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 23
    move-object v1, v5

    check-cast v1, Lcom/google/android/exoplayer2/source/hls/m;

    invoke-direct {v0, v1}, Lcom/google/android/exoplayer2/source/hls/q;->L(Lcom/google/android/exoplayer2/source/hls/m;)V

    .line 24
    :cond_9
    iput-object v5, v0, Lcom/google/android/exoplayer2/source/hls/q;->u:Lc/a/a/a/j2/t0/b;

    .line 25
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->j:Lcom/google/android/exoplayer2/upstream/b0;

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/q;->i:Lcom/google/android/exoplayer2/upstream/a0;

    iget v4, v5, Lc/a/a/a/j2/t0/b;->c:I

    .line 26
    invoke-interface {v2, v4}, Lcom/google/android/exoplayer2/upstream/a0;->d(I)I

    move-result v2

    .line 27
    invoke-virtual {v1, v5, v0, v2}, Lcom/google/android/exoplayer2/upstream/b0;->n(Lcom/google/android/exoplayer2/upstream/b0$e;Lcom/google/android/exoplayer2/upstream/b0$b;I)J

    move-result-wide v10

    .line 28
    iget-object v12, v0, Lcom/google/android/exoplayer2/source/hls/q;->k:Lc/a/a/a/j2/e0$a;

    new-instance v13, Lc/a/a/a/j2/w;

    iget-wide v7, v5, Lc/a/a/a/j2/t0/b;->a:J

    iget-object v9, v5, Lc/a/a/a/j2/t0/b;->b:Lcom/google/android/exoplayer2/upstream/p;

    move-object v6, v13

    invoke-direct/range {v6 .. v11}, Lc/a/a/a/j2/w;-><init>(JLcom/google/android/exoplayer2/upstream/p;J)V

    iget v14, v5, Lc/a/a/a/j2/t0/b;->c:I

    iget v15, v0, Lcom/google/android/exoplayer2/source/hls/q;->b:I

    iget-object v1, v5, Lc/a/a/a/j2/t0/b;->d:Lc/a/a/a/u0;

    iget v2, v5, Lc/a/a/a/j2/t0/b;->e:I

    iget-object v4, v5, Lc/a/a/a/j2/t0/b;->f:Ljava/lang/Object;

    iget-wide v6, v5, Lc/a/a/a/j2/t0/b;->g:J

    iget-wide v8, v5, Lc/a/a/a/j2/t0/b;->h:J

    move-object/from16 v16, v1

    move/from16 v17, v2

    move-object/from16 v18, v4

    move-wide/from16 v19, v6

    move-wide/from16 v21, v8

    invoke-virtual/range {v12 .. v22}, Lc/a/a/a/j2/e0$a;->A(Lc/a/a/a/j2/w;IILc/a/a/a/u0;ILjava/lang/Object;JJ)V

    return v3

    :cond_a
    :goto_4
    return v2
.end method

.method public d0(ILc/a/a/a/v0;Lc/a/a/a/c2/f;Z)I
    .locals 11

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->N()Z

    move-result v0

    const/4 v1, -0x3

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    .line 3
    :goto_0
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_1

    iget-object v3, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    .line 4
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/exoplayer2/source/hls/m;

    invoke-direct {p0, v3}, Lcom/google/android/exoplayer2/source/hls/q;->G(Lcom/google/android/exoplayer2/source/hls/m;)Z

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 5
    :cond_1
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-static {v3, v2, v0}, Lc/a/a/a/m2/m0;->A0(Ljava/util/List;II)V

    .line 6
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/source/hls/m;

    .line 7
    iget-object v10, v0, Lc/a/a/a/j2/t0/b;->d:Lc/a/a/a/u0;

    .line 8
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/hls/q;->I:Lc/a/a/a/u0;

    invoke-virtual {v10, v3}, Lc/a/a/a/u0;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 9
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/hls/q;->k:Lc/a/a/a/j2/e0$a;

    iget v4, p0, Lcom/google/android/exoplayer2/source/hls/q;->b:I

    iget v6, v0, Lc/a/a/a/j2/t0/b;->e:I

    iget-object v7, v0, Lc/a/a/a/j2/t0/b;->f:Ljava/lang/Object;

    iget-wide v8, v0, Lc/a/a/a/j2/t0/b;->g:J

    move-object v5, v10

    invoke-virtual/range {v3 .. v9}, Lc/a/a/a/j2/e0$a;->c(ILc/a/a/a/u0;ILjava/lang/Object;J)V

    .line 10
    :cond_2
    iput-object v10, p0, Lcom/google/android/exoplayer2/source/hls/q;->I:Lc/a/a/a/u0;

    .line 11
    :cond_3
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/source/hls/m;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/source/hls/m;->q()Z

    move-result v0

    if-nez v0, :cond_4

    return v1

    .line 12
    :cond_4
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    aget-object v0, v0, p1

    iget-boolean v1, p0, Lcom/google/android/exoplayer2/source/hls/q;->V:Z

    .line 13
    invoke-virtual {v0, p2, p3, p4, v1}, Lc/a/a/a/j2/k0;->L(Lc/a/a/a/v0;Lc/a/a/a/c2/f;ZZ)I

    move-result p3

    const/4 p4, -0x5

    if-ne p3, p4, :cond_8

    .line 14
    iget-object p4, p2, Lc/a/a/a/v0;->b:Lc/a/a/a/u0;

    invoke-static {p4}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lc/a/a/a/u0;

    .line 15
    iget v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->B:I

    if-ne p1, v0, :cond_7

    .line 16
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lc/a/a/a/j2/k0;->J()I

    move-result p1

    .line 17
    :goto_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_5

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/source/hls/m;

    iget v0, v0, Lcom/google/android/exoplayer2/source/hls/m;->l:I

    if-eq v0, p1, :cond_5

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 18
    :cond_5
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v2, p1, :cond_6

    .line 19
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/exoplayer2/source/hls/m;

    iget-object p1, p1, Lc/a/a/a/j2/t0/b;->d:Lc/a/a/a/u0;

    goto :goto_2

    .line 20
    :cond_6
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->H:Lc/a/a/a/u0;

    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/u0;

    .line 21
    :goto_2
    invoke-virtual {p4, p1}, Lc/a/a/a/u0;->p(Lc/a/a/a/u0;)Lc/a/a/a/u0;

    move-result-object p4

    .line 22
    :cond_7
    iput-object p4, p2, Lc/a/a/a/v0;->b:Lc/a/a/a/u0;

    :cond_8
    return p3
.end method

.method public e(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->j:Lcom/google/android/exoplayer2/upstream/b0;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/upstream/b0;->h()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->N()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->j:Lcom/google/android/exoplayer2/upstream/b0;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/upstream/b0;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->u:Lc/a/a/a/j2/t0/b;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->d:Lcom/google/android/exoplayer2/source/hls/i;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/q;->u:Lc/a/a/a/j2/t0/b;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->o:Ljava/util/List;

    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/google/android/exoplayer2/source/hls/i;->t(JLc/a/a/a/j2/t0/b;Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->j:Lcom/google/android/exoplayer2/upstream/b0;

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/upstream/b0;->e()V

    :cond_1
    return-void

    .line 6
    :cond_2
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    if-lez v0, :cond_3

    .line 7
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/q;->d:Lcom/google/android/exoplayer2/source/hls/i;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->o:Ljava/util/List;

    add-int/lit8 v3, v0, -0x1

    .line 8
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/exoplayer2/source/hls/m;

    invoke-virtual {v1, v2}, Lcom/google/android/exoplayer2/source/hls/i;->b(Lcom/google/android/exoplayer2/source/hls/m;)I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 9
    :cond_3
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/q;->o:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 10
    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/source/hls/q;->E(I)V

    .line 11
    :cond_4
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->d:Lcom/google/android/exoplayer2/source/hls/i;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/q;->o:Ljava/util/List;

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/exoplayer2/source/hls/i;->g(JLjava/util/List;)I

    move-result p1

    .line 12
    iget-object p2, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge p1, p2, :cond_5

    .line 13
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/source/hls/q;->E(I)V

    :cond_5
    :goto_1
    return-void
.end method

.method public e0()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->D:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 3
    invoke-virtual {v3}, Lc/a/a/a/j2/k0;->K()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->j:Lcom/google/android/exoplayer2/upstream/b0;

    invoke-virtual {v0, p0}, Lcom/google/android/exoplayer2/upstream/b0;->m(Lcom/google/android/exoplayer2/upstream/b0$f;)V

    .line 5
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->r:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->J:Z

    .line 7
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public f(Lc/a/a/a/f2/y;)V
    .locals 0

    return-void
.end method

.method public h()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->W:Z

    .line 2
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->r:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/q;->q:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public h0(JZ)Z
    .locals 3

    .line 1
    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->R:J

    .line 2
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->N()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 3
    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->S:J

    return v1

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->C:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    if-nez p3, :cond_1

    invoke-direct {p0, p1, p2}, Lcom/google/android/exoplayer2/source/hls/q;->g0(J)Z

    move-result p3

    if-eqz p3, :cond_1

    return v2

    .line 5
    :cond_1
    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->S:J

    .line 6
    iput-boolean v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->V:Z

    .line 7
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 8
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->j:Lcom/google/android/exoplayer2/upstream/b0;

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/upstream/b0;->i()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 9
    iget-boolean p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->C:Z

    if-eqz p1, :cond_2

    .line 10
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    array-length p2, p1

    :goto_0
    if-ge v2, p2, :cond_2

    aget-object p3, p1, v2

    .line 11
    invoke-virtual {p3}, Lc/a/a/a/j2/k0;->o()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 12
    :cond_2
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->j:Lcom/google/android/exoplayer2/upstream/b0;

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/upstream/b0;->e()V

    goto :goto_1

    .line 13
    :cond_3
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->j:Lcom/google/android/exoplayer2/upstream/b0;

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/upstream/b0;->f()V

    .line 14
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->f0()V

    :goto_1
    return v1
.end method

.method public i()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 2
    invoke-virtual {v3}, Lc/a/a/a/j2/k0;->M()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public i0([Lc/a/a/a/l2/h;[Z[Lc/a/a/a/j2/l0;[ZJZ)Z
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-wide/from16 v12, p5

    .line 1
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/source/hls/q;->v()V

    .line 2
    iget v3, v0, Lcom/google/android/exoplayer2/source/hls/q;->G:I

    const/4 v14, 0x0

    const/4 v4, 0x0

    .line 3
    :goto_0
    array-length v5, v1

    const/4 v6, 0x0

    const/4 v15, 0x1

    if-ge v4, v5, :cond_2

    .line 4
    aget-object v5, v2, v4

    check-cast v5, Lcom/google/android/exoplayer2/source/hls/p;

    if-eqz v5, :cond_1

    .line 5
    aget-object v7, v1, v4

    if-eqz v7, :cond_0

    aget-boolean v7, p2, v4

    if-nez v7, :cond_1

    .line 6
    :cond_0
    iget v7, v0, Lcom/google/android/exoplayer2/source/hls/q;->G:I

    sub-int/2addr v7, v15

    iput v7, v0, Lcom/google/android/exoplayer2/source/hls/q;->G:I

    .line 7
    invoke-virtual {v5}, Lcom/google/android/exoplayer2/source/hls/p;->g()V

    .line 8
    aput-object v6, v2, v4

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-nez p7, :cond_5

    .line 9
    iget-boolean v4, v0, Lcom/google/android/exoplayer2/source/hls/q;->U:Z

    if-eqz v4, :cond_3

    if-nez v3, :cond_4

    goto :goto_1

    :cond_3
    iget-wide v3, v0, Lcom/google/android/exoplayer2/source/hls/q;->R:J

    cmp-long v5, v12, v3

    if-eqz v5, :cond_4

    goto :goto_1

    :cond_4
    const/4 v3, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v3, 0x1

    .line 10
    :goto_2
    iget-object v4, v0, Lcom/google/android/exoplayer2/source/hls/q;->d:Lcom/google/android/exoplayer2/source/hls/i;

    invoke-virtual {v4}, Lcom/google/android/exoplayer2/source/hls/i;->j()Lc/a/a/a/l2/h;

    move-result-object v4

    move/from16 v16, v3

    move-object v11, v4

    const/4 v3, 0x0

    .line 11
    :goto_3
    array-length v5, v1

    if-ge v3, v5, :cond_a

    .line 12
    aget-object v5, v1, v3

    if-nez v5, :cond_6

    goto :goto_5

    .line 13
    :cond_6
    iget-object v7, v0, Lcom/google/android/exoplayer2/source/hls/q;->K:Lc/a/a/a/j2/q0;

    invoke-interface {v5}, Lc/a/a/a/l2/k;->k()Lc/a/a/a/j2/p0;

    move-result-object v8

    invoke-virtual {v7, v8}, Lc/a/a/a/j2/q0;->m(Lc/a/a/a/j2/p0;)I

    move-result v7

    .line 14
    iget v8, v0, Lcom/google/android/exoplayer2/source/hls/q;->N:I

    if-ne v7, v8, :cond_7

    .line 15
    iget-object v8, v0, Lcom/google/android/exoplayer2/source/hls/q;->d:Lcom/google/android/exoplayer2/source/hls/i;

    invoke-virtual {v8, v5}, Lcom/google/android/exoplayer2/source/hls/i;->s(Lc/a/a/a/l2/h;)V

    move-object v11, v5

    .line 16
    :cond_7
    aget-object v5, v2, v3

    if-nez v5, :cond_9

    .line 17
    iget v5, v0, Lcom/google/android/exoplayer2/source/hls/q;->G:I

    add-int/2addr v5, v15

    iput v5, v0, Lcom/google/android/exoplayer2/source/hls/q;->G:I

    .line 18
    new-instance v5, Lcom/google/android/exoplayer2/source/hls/p;

    invoke-direct {v5, v0, v7}, Lcom/google/android/exoplayer2/source/hls/p;-><init>(Lcom/google/android/exoplayer2/source/hls/q;I)V

    aput-object v5, v2, v3

    .line 19
    aput-boolean v15, p4, v3

    .line 20
    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/q;->M:[I

    if-eqz v5, :cond_9

    .line 21
    aget-object v5, v2, v3

    check-cast v5, Lcom/google/android/exoplayer2/source/hls/p;

    invoke-virtual {v5}, Lcom/google/android/exoplayer2/source/hls/p;->d()V

    if-nez v16, :cond_9

    .line 22
    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    iget-object v8, v0, Lcom/google/android/exoplayer2/source/hls/q;->M:[I

    aget v7, v8, v7

    aget-object v5, v5, v7

    .line 23
    invoke-virtual {v5, v12, v13, v15}, Lc/a/a/a/j2/k0;->R(JZ)Z

    move-result v7

    if-nez v7, :cond_8

    .line 24
    invoke-virtual {v5}, Lc/a/a/a/j2/k0;->w()I

    move-result v5

    if-eqz v5, :cond_8

    const/4 v5, 0x1

    goto :goto_4

    :cond_8
    const/4 v5, 0x0

    :goto_4
    move/from16 v16, v5

    :cond_9
    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 25
    :cond_a
    iget v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->G:I

    if-nez v1, :cond_d

    .line 26
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->d:Lcom/google/android/exoplayer2/source/hls/i;

    invoke-virtual {v1}, Lcom/google/android/exoplayer2/source/hls/i;->p()V

    .line 27
    iput-object v6, v0, Lcom/google/android/exoplayer2/source/hls/q;->I:Lc/a/a/a/u0;

    .line 28
    iput-boolean v15, v0, Lcom/google/android/exoplayer2/source/hls/q;->T:Z

    .line 29
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 30
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->j:Lcom/google/android/exoplayer2/upstream/b0;

    invoke-virtual {v1}, Lcom/google/android/exoplayer2/upstream/b0;->i()Z

    move-result v1

    if-eqz v1, :cond_c

    .line 31
    iget-boolean v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->C:Z

    if-eqz v1, :cond_b

    .line 32
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    array-length v3, v1

    :goto_6
    if-ge v14, v3, :cond_b

    aget-object v4, v1, v14

    .line 33
    invoke-virtual {v4}, Lc/a/a/a/j2/k0;->o()V

    add-int/lit8 v14, v14, 0x1

    goto :goto_6

    .line 34
    :cond_b
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->j:Lcom/google/android/exoplayer2/upstream/b0;

    invoke-virtual {v1}, Lcom/google/android/exoplayer2/upstream/b0;->e()V

    goto/16 :goto_b

    .line 35
    :cond_c
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/source/hls/q;->f0()V

    goto/16 :goto_b

    .line 36
    :cond_d
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_11

    .line 37
    invoke-static {v11, v4}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    .line 38
    iget-boolean v1, v0, Lcom/google/android/exoplayer2/source/hls/q;->U:Z

    if-nez v1, :cond_10

    const-wide/16 v3, 0x0

    cmp-long v1, v12, v3

    if-gez v1, :cond_e

    neg-long v3, v12

    :cond_e
    move-wide v6, v3

    .line 39
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/source/hls/q;->I()Lcom/google/android/exoplayer2/source/hls/m;

    move-result-object v1

    .line 40
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/hls/q;->d:Lcom/google/android/exoplayer2/source/hls/i;

    .line 41
    invoke-virtual {v3, v1, v12, v13}, Lcom/google/android/exoplayer2/source/hls/i;->a(Lcom/google/android/exoplayer2/source/hls/m;J)[Lc/a/a/a/j2/t0/e;

    move-result-object v17

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 42
    iget-object v10, v0, Lcom/google/android/exoplayer2/source/hls/q;->o:Ljava/util/List;

    move-object v3, v11

    move-wide/from16 v4, p5

    move-object/from16 v18, v11

    move-object/from16 v11, v17

    invoke-interface/range {v3 .. v11}, Lc/a/a/a/l2/h;->i(JJJLjava/util/List;[Lc/a/a/a/j2/t0/e;)V

    .line 43
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/hls/q;->d:Lcom/google/android/exoplayer2/source/hls/i;

    invoke-virtual {v3}, Lcom/google/android/exoplayer2/source/hls/i;->i()Lc/a/a/a/j2/p0;

    move-result-object v3

    iget-object v1, v1, Lc/a/a/a/j2/t0/b;->d:Lc/a/a/a/u0;

    invoke-virtual {v3, v1}, Lc/a/a/a/j2/p0;->m(Lc/a/a/a/u0;)I

    move-result v1

    .line 44
    invoke-interface/range {v18 .. v18}, Lc/a/a/a/l2/h;->j()I

    move-result v3

    if-eq v3, v1, :cond_f

    goto :goto_7

    :cond_f
    const/4 v1, 0x0

    goto :goto_8

    :cond_10
    :goto_7
    const/4 v1, 0x1

    :goto_8
    if-eqz v1, :cond_11

    .line 45
    iput-boolean v15, v0, Lcom/google/android/exoplayer2/source/hls/q;->T:Z

    const/4 v1, 0x1

    const/16 v16, 0x1

    goto :goto_9

    :cond_11
    move/from16 v1, p7

    :goto_9
    if-eqz v16, :cond_13

    .line 46
    invoke-virtual {v0, v12, v13, v1}, Lcom/google/android/exoplayer2/source/hls/q;->h0(JZ)Z

    .line 47
    :goto_a
    array-length v1, v2

    if-ge v14, v1, :cond_13

    .line 48
    aget-object v1, v2, v14

    if-eqz v1, :cond_12

    .line 49
    aput-boolean v15, p4, v14

    :cond_12
    add-int/lit8 v14, v14, 0x1

    goto :goto_a

    .line 50
    :cond_13
    :goto_b
    invoke-direct {v0, v2}, Lcom/google/android/exoplayer2/source/hls/q;->p0([Lc/a/a/a/j2/l0;)V

    .line 51
    iput-boolean v15, v0, Lcom/google/android/exoplayer2/source/hls/q;->U:Z

    return v16
.end method

.method public bridge synthetic j(Lcom/google/android/exoplayer2/upstream/b0$e;JJZ)V
    .locals 0

    .line 1
    check-cast p1, Lc/a/a/a/j2/t0/b;

    invoke-virtual/range {p0 .. p6}, Lcom/google/android/exoplayer2/source/hls/q;->V(Lc/a/a/a/j2/t0/b;JJZ)V

    return-void
.end method

.method public j0(Lc/a/a/a/e2/t;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->Y:Lc/a/a/a/e2/t;

    invoke-static {v0, p1}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->Y:Lc/a/a/a/e2/t;

    const/4 v0, 0x0

    .line 3
    :goto_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    .line 4
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->Q:[Z

    aget-boolean v2, v2, v0

    if-eqz v2, :cond_0

    .line 5
    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Lcom/google/android/exoplayer2/source/hls/q$d;->a0(Lc/a/a/a/e2/t;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public l0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->d:Lcom/google/android/exoplayer2/source/hls/i;

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/source/hls/i;->r(Z)V

    return-void
.end method

.method public m(Lc/a/a/a/u0;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->r:Landroid/os/Handler;

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->p:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public m0(J)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->X:J

    cmp-long v2, v0, p1

    if-eqz v2, :cond_0

    .line 2
    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->X:J

    .line 3
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 4
    invoke-virtual {v3, p1, p2}, Lc/a/a/a/j2/k0;->S(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public n0(IJ)I
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->N()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    aget-object v0, v0, p1

    .line 3
    iget-boolean v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->V:Z

    invoke-virtual {v0, p2, p3, v2}, Lc/a/a/a/j2/k0;->y(JZ)I

    move-result p2

    .line 4
    invoke-virtual {v0}, Lc/a/a/a/j2/k0;->w()I

    move-result p3

    .line 5
    :goto_0
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 6
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/exoplayer2/source/hls/m;

    .line 7
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/hls/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/exoplayer2/source/hls/m;

    invoke-virtual {v3, p1}, Lcom/google/android/exoplayer2/source/hls/m;->l(I)I

    move-result v3

    add-int v4, p3, p2

    if-gt v4, v3, :cond_1

    goto :goto_1

    .line 8
    :cond_1
    invoke-virtual {v2}, Lcom/google/android/exoplayer2/source/hls/m;->q()Z

    move-result v2

    if-nez v2, :cond_2

    sub-int p2, v3, p3

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9
    :cond_3
    :goto_1
    invoke-virtual {v0, p2}, Lc/a/a/a/j2/k0;->W(I)V

    return p2
.end method

.method public o()Lc/a/a/a/j2/q0;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->v()V

    .line 2
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->K:Lc/a/a/a/j2/q0;

    return-object v0
.end method

.method public o0(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->v()V

    .line 2
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->M:[I

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->M:[I

    aget p1, v0, p1

    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->P:[Z

    aget-boolean v0, v0, p1

    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 5
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->P:[Z

    const/4 v1, 0x0

    aput-boolean v1, v0, p1

    return-void
.end method

.method public bridge synthetic p(Lcom/google/android/exoplayer2/upstream/b0$e;JJLjava/io/IOException;I)Lcom/google/android/exoplayer2/upstream/b0$c;
    .locals 0

    .line 1
    check-cast p1, Lc/a/a/a/j2/t0/b;

    invoke-virtual/range {p0 .. p7}, Lcom/google/android/exoplayer2/source/hls/q;->X(Lc/a/a/a/j2/t0/b;JJLjava/io/IOException;I)Lcom/google/android/exoplayer2/upstream/b0$c;

    move-result-object p1

    return-object p1
.end method

.method public q(II)Lc/a/a/a/f2/b0;
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/exoplayer2/source/hls/q;->a:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/google/android/exoplayer2/source/hls/q;->J(II)Lc/a/a/a/f2/b0;

    move-result-object v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 3
    :goto_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    array-length v2, v1

    if-ge v0, v2, :cond_2

    .line 4
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->w:[I

    aget v2, v2, v0

    if-ne v2, p1, :cond_1

    .line 5
    aget-object v0, v1, v0

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_4

    .line 6
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->W:Z

    if-eqz v0, :cond_3

    .line 7
    invoke-static {p1, p2}, Lcom/google/android/exoplayer2/source/hls/q;->A(II)Lc/a/a/a/f2/i;

    move-result-object p1

    return-object p1

    .line 8
    :cond_3
    invoke-direct {p0, p1, p2}, Lcom/google/android/exoplayer2/source/hls/q;->B(II)Lc/a/a/a/j2/k0;

    move-result-object v0

    :cond_4
    const/4 p1, 0x5

    if-ne p2, p1, :cond_6

    .line 9
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->z:Lc/a/a/a/f2/b0;

    if-nez p1, :cond_5

    .line 10
    new-instance p1, Lcom/google/android/exoplayer2/source/hls/q$c;

    iget p2, p0, Lcom/google/android/exoplayer2/source/hls/q;->l:I

    invoke-direct {p1, v0, p2}, Lcom/google/android/exoplayer2/source/hls/q$c;-><init>(Lc/a/a/a/f2/b0;I)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->z:Lc/a/a/a/f2/b0;

    .line 11
    :cond_5
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->z:Lc/a/a/a/f2/b0;

    return-object p1

    :cond_6
    return-object v0
.end method

.method public bridge synthetic r(Lcom/google/android/exoplayer2/upstream/b0$e;JJ)V
    .locals 0

    .line 1
    check-cast p1, Lc/a/a/a/j2/t0/b;

    invoke-virtual/range {p0 .. p5}, Lcom/google/android/exoplayer2/source/hls/q;->W(Lc/a/a/a/j2/t0/b;JJ)V

    return-void
.end method

.method public s()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/source/hls/q;->T()V

    .line 2
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->V:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->D:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Lc/a/a/a/g1;

    const-string v1, "Loading finished before preparation is complete."

    invoke-direct {v0, v1}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public t(JZ)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->C:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->N()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 3
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->v:[Lcom/google/android/exoplayer2/source/hls/q$d;

    aget-object v2, v2, v1

    iget-object v3, p0, Lcom/google/android/exoplayer2/source/hls/q;->P:[Z

    aget-boolean v3, v3, v1

    invoke-virtual {v2, p1, p2, p3, v3}, Lc/a/a/a/j2/k0;->n(JZZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public w(I)I
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/hls/q;->v()V

    .line 2
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->M:[I

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->M:[I

    aget v0, v0, p1

    const/4 v1, -0x2

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->L:Ljava/util/Set;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/q;->K:Lc/a/a/a/j2/q0;

    invoke-virtual {v2, p1}, Lc/a/a/a/j2/q0;->l(I)Lc/a/a/a/j2/p0;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, -0x3

    :cond_0
    return v1

    .line 5
    :cond_1
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/q;->P:[Z

    aget-boolean v2, p1, v0

    if-eqz v2, :cond_2

    return v1

    :cond_2
    const/4 v1, 0x1

    .line 6
    aput-boolean v1, p1, v0

    return v0
.end method

.method public z()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->D:Z

    if-nez v0, :cond_0

    .line 2
    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/q;->R:J

    invoke-virtual {p0, v0, v1}, Lcom/google/android/exoplayer2/source/hls/q;->d(J)Z

    :cond_0
    return-void
.end method
