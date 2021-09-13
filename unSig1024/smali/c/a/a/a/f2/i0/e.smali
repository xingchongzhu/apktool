.class public Lc/a/a/a/f2/i0/e;
.super Ljava/lang/Object;
.source "MatroskaExtractor.java"

# interfaces
.implements Lc/a/a/a/f2/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/f2/i0/e$c;,
        Lc/a/a/a/f2/i0/e$d;,
        Lc/a/a/a/f2/i0/e$b;
    }
.end annotation


# static fields
.field public static final a:Lc/a/a/a/f2/o;

.field private static final b:[B

.field private static final c:[B

.field private static final d:[B

.field private static final e:Ljava/util/UUID;

.field private static final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private A:Lc/a/a/a/f2/i0/e$c;

.field private B:Z

.field private C:I

.field private D:J

.field private E:Z

.field private F:J

.field private G:J

.field private H:J

.field private I:Lc/a/a/a/m2/u;

.field private J:Lc/a/a/a/m2/u;

.field private K:Z

.field private L:Z

.field private M:I

.field private N:J

.field private O:J

.field private P:I

.field private Q:I

.field private R:[I

.field private S:I

.field private T:I

.field private U:I

.field private V:I

.field private W:Z

.field private X:I

.field private Y:I

.field private Z:I

.field private a0:Z

.field private b0:Z

.field private c0:Z

.field private d0:I

.field private e0:B

.field private f0:Z

.field private final g:Lc/a/a/a/f2/i0/d;

.field private g0:Lc/a/a/a/f2/l;

.field private final h:Lc/a/a/a/f2/i0/g;

.field private final i:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lc/a/a/a/f2/i0/e$c;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Z

.field private final k:Lc/a/a/a/m2/a0;

.field private final l:Lc/a/a/a/m2/a0;

.field private final m:Lc/a/a/a/m2/a0;

.field private final n:Lc/a/a/a/m2/a0;

.field private final o:Lc/a/a/a/m2/a0;

.field private final p:Lc/a/a/a/m2/a0;

.field private final q:Lc/a/a/a/m2/a0;

.field private final r:Lc/a/a/a/m2/a0;

.field private final s:Lc/a/a/a/m2/a0;

.field private final t:Lc/a/a/a/m2/a0;

.field private u:Ljava/nio/ByteBuffer;

.field private v:J

.field private w:J

.field private x:J

.field private y:J

.field private z:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, Lc/a/a/a/f2/i0/a;->b:Lc/a/a/a/f2/i0/a;

    sput-object v0, Lc/a/a/a/f2/i0/e;->a:Lc/a/a/a/f2/o;

    const/16 v0, 0x20

    new-array v1, v0, [B

    .line 2
    fill-array-data v1, :array_0

    sput-object v1, Lc/a/a/a/f2/i0/e;->b:[B

    const-string v1, "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text"

    .line 3
    invoke-static {v1}, Lc/a/a/a/m2/m0;->g0(Ljava/lang/String;)[B

    move-result-object v1

    sput-object v1, Lc/a/a/a/f2/i0/e;->c:[B

    new-array v0, v0, [B

    .line 4
    fill-array-data v0, :array_1

    sput-object v0, Lc/a/a/a/f2/i0/e;->d:[B

    .line 5
    new-instance v0, Ljava/util/UUID;

    const-wide v1, 0x100000000001000L

    const-wide v3, -0x7fffff55ffc7648fL    # -3.607411173533E-312

    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    sput-object v0, Lc/a/a/a/f2/i0/e;->e:Ljava/util/UUID;

    .line 6
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x0

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "htc_video_rotA-000"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x5a

    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "htc_video_rotA-090"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0xb4

    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "htc_video_rotA-180"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x10e

    .line 10
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "htc_video_rotA-270"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lc/a/a/a/f2/i0/e;->f:Ljava/util/Map;

    return-void

    :array_0
    .array-data 1
        0x31t
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data

    :array_1
    .array-data 1
        0x44t
        0x69t
        0x61t
        0x6ct
        0x6ft
        0x67t
        0x75t
        0x65t
        0x3at
        0x20t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lc/a/a/a/f2/i0/e;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 2
    new-instance v0, Lc/a/a/a/f2/i0/b;

    invoke-direct {v0}, Lc/a/a/a/f2/i0/b;-><init>()V

    invoke-direct {p0, v0, p1}, Lc/a/a/a/f2/i0/e;-><init>(Lc/a/a/a/f2/i0/d;I)V

    return-void
.end method

.method constructor <init>(Lc/a/a/a/f2/i0/d;I)V
    .locals 4

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 4
    iput-wide v0, p0, Lc/a/a/a/f2/i0/e;->w:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    iput-wide v2, p0, Lc/a/a/a/f2/i0/e;->x:J

    .line 6
    iput-wide v2, p0, Lc/a/a/a/f2/i0/e;->y:J

    .line 7
    iput-wide v2, p0, Lc/a/a/a/f2/i0/e;->z:J

    .line 8
    iput-wide v0, p0, Lc/a/a/a/f2/i0/e;->F:J

    .line 9
    iput-wide v0, p0, Lc/a/a/a/f2/i0/e;->G:J

    .line 10
    iput-wide v2, p0, Lc/a/a/a/f2/i0/e;->H:J

    .line 11
    iput-object p1, p0, Lc/a/a/a/f2/i0/e;->g:Lc/a/a/a/f2/i0/d;

    .line 12
    new-instance v0, Lc/a/a/a/f2/i0/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lc/a/a/a/f2/i0/e$b;-><init>(Lc/a/a/a/f2/i0/e;Lc/a/a/a/f2/i0/e$a;)V

    invoke-interface {p1, v0}, Lc/a/a/a/f2/i0/d;->b(Lc/a/a/a/f2/i0/c;)V

    const/4 p1, 0x1

    and-int/2addr p2, p1

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 13
    :goto_0
    iput-boolean p2, p0, Lc/a/a/a/f2/i0/e;->j:Z

    .line 14
    new-instance p2, Lc/a/a/a/f2/i0/g;

    invoke-direct {p2}, Lc/a/a/a/f2/i0/g;-><init>()V

    iput-object p2, p0, Lc/a/a/a/f2/i0/e;->h:Lc/a/a/a/f2/i0/g;

    .line 15
    new-instance p2, Landroid/util/SparseArray;

    invoke-direct {p2}, Landroid/util/SparseArray;-><init>()V

    iput-object p2, p0, Lc/a/a/a/f2/i0/e;->i:Landroid/util/SparseArray;

    .line 16
    new-instance p2, Lc/a/a/a/m2/a0;

    const/4 v0, 0x4

    invoke-direct {p2, v0}, Lc/a/a/a/m2/a0;-><init>(I)V

    iput-object p2, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    .line 17
    new-instance p2, Lc/a/a/a/m2/a0;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-direct {p2, v1}, Lc/a/a/a/m2/a0;-><init>([B)V

    iput-object p2, p0, Lc/a/a/a/f2/i0/e;->n:Lc/a/a/a/m2/a0;

    .line 18
    new-instance p2, Lc/a/a/a/m2/a0;

    invoke-direct {p2, v0}, Lc/a/a/a/m2/a0;-><init>(I)V

    iput-object p2, p0, Lc/a/a/a/f2/i0/e;->o:Lc/a/a/a/m2/a0;

    .line 19
    new-instance p2, Lc/a/a/a/m2/a0;

    sget-object v1, Lc/a/a/a/m2/y;->a:[B

    invoke-direct {p2, v1}, Lc/a/a/a/m2/a0;-><init>([B)V

    iput-object p2, p0, Lc/a/a/a/f2/i0/e;->k:Lc/a/a/a/m2/a0;

    .line 20
    new-instance p2, Lc/a/a/a/m2/a0;

    invoke-direct {p2, v0}, Lc/a/a/a/m2/a0;-><init>(I)V

    iput-object p2, p0, Lc/a/a/a/f2/i0/e;->l:Lc/a/a/a/m2/a0;

    .line 21
    new-instance p2, Lc/a/a/a/m2/a0;

    invoke-direct {p2}, Lc/a/a/a/m2/a0;-><init>()V

    iput-object p2, p0, Lc/a/a/a/f2/i0/e;->p:Lc/a/a/a/m2/a0;

    .line 22
    new-instance p2, Lc/a/a/a/m2/a0;

    invoke-direct {p2}, Lc/a/a/a/m2/a0;-><init>()V

    iput-object p2, p0, Lc/a/a/a/f2/i0/e;->q:Lc/a/a/a/m2/a0;

    .line 23
    new-instance p2, Lc/a/a/a/m2/a0;

    const/16 v0, 0x8

    invoke-direct {p2, v0}, Lc/a/a/a/m2/a0;-><init>(I)V

    iput-object p2, p0, Lc/a/a/a/f2/i0/e;->r:Lc/a/a/a/m2/a0;

    .line 24
    new-instance p2, Lc/a/a/a/m2/a0;

    invoke-direct {p2}, Lc/a/a/a/m2/a0;-><init>()V

    iput-object p2, p0, Lc/a/a/a/f2/i0/e;->s:Lc/a/a/a/m2/a0;

    .line 25
    new-instance p2, Lc/a/a/a/m2/a0;

    invoke-direct {p2}, Lc/a/a/a/m2/a0;-><init>()V

    iput-object p2, p0, Lc/a/a/a/f2/i0/e;->t:Lc/a/a/a/m2/a0;

    new-array p1, p1, [I

    .line 26
    iput-object p1, p0, Lc/a/a/a/f2/i0/e;->R:[I

    return-void
.end method

.method static synthetic A()[Lc/a/a/a/f2/j;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lc/a/a/a/f2/j;

    .line 1
    new-instance v1, Lc/a/a/a/f2/i0/e;

    invoke-direct {v1}, Lc/a/a/a/f2/i0/e;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method private B(Lc/a/a/a/f2/x;J)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/f2/i0/e;->E:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 2
    iput-wide p2, p0, Lc/a/a/a/f2/i0/e;->G:J

    .line 3
    iget-wide p2, p0, Lc/a/a/a/f2/i0/e;->F:J

    iput-wide p2, p1, Lc/a/a/a/f2/x;->a:J

    .line 4
    iput-boolean v2, p0, Lc/a/a/a/f2/i0/e;->E:Z

    return v1

    .line 5
    :cond_0
    iget-boolean p2, p0, Lc/a/a/a/f2/i0/e;->B:Z

    if-eqz p2, :cond_1

    iget-wide p2, p0, Lc/a/a/a/f2/i0/e;->G:J

    const-wide/16 v3, -0x1

    cmp-long v0, p2, v3

    if-eqz v0, :cond_1

    .line 6
    iput-wide p2, p1, Lc/a/a/a/f2/x;->a:J

    .line 7
    iput-wide v3, p0, Lc/a/a/a/f2/i0/e;->G:J

    return v1

    :cond_1
    return v2
.end method

.method private C(Lc/a/a/a/f2/k;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->f()I

    move-result v0

    if-lt v0, p2, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->b()I

    move-result v0

    if-ge v0, p2, :cond_1

    .line 3
    iget-object v0, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->b()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {v0, v1}, Lc/a/a/a/m2/a0;->c(I)V

    .line 4
    :cond_1
    iget-object v0, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->f()I

    move-result v1

    iget-object v2, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v2}, Lc/a/a/a/m2/a0;->f()I

    move-result v2

    sub-int v2, p2, v2

    invoke-interface {p1, v0, v1, v2}, Lc/a/a/a/f2/k;->readFully([BII)V

    .line 5
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {p1, p2}, Lc/a/a/a/m2/a0;->O(I)V

    return-void
.end method

.method private D()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lc/a/a/a/f2/i0/e;->X:I

    .line 2
    iput v0, p0, Lc/a/a/a/f2/i0/e;->Y:I

    .line 3
    iput v0, p0, Lc/a/a/a/f2/i0/e;->Z:I

    .line 4
    iput-boolean v0, p0, Lc/a/a/a/f2/i0/e;->a0:Z

    .line 5
    iput-boolean v0, p0, Lc/a/a/a/f2/i0/e;->b0:Z

    .line 6
    iput-boolean v0, p0, Lc/a/a/a/f2/i0/e;->c0:Z

    .line 7
    iput v0, p0, Lc/a/a/a/f2/i0/e;->d0:I

    .line 8
    iput-byte v0, p0, Lc/a/a/a/f2/i0/e;->e0:B

    .line 9
    iput-boolean v0, p0, Lc/a/a/a/f2/i0/e;->f0:Z

    .line 10
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->p:Lc/a/a/a/m2/a0;

    invoke-virtual {v1, v0}, Lc/a/a/a/m2/a0;->L(I)V

    return-void
.end method

.method private E(J)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .line 1
    iget-wide v2, p0, Lc/a/a/a/f2/i0/e;->x:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v2, v0

    if-eqz v4, :cond_0

    const-wide/16 v4, 0x3e8

    move-wide v0, p1

    .line 2
    invoke-static/range {v0 .. v5}, Lc/a/a/a/m2/m0;->B0(JJJ)J

    move-result-wide p1

    return-wide p1

    .line 3
    :cond_0
    new-instance p1, Lc/a/a/a/g1;

    const-string p2, "Can\'t scale timecode prior to timecodeScale being set."

    invoke-direct {p1, p2}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static F(Ljava/lang/String;J[B)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    const-string v0, "S_TEXT/ASS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "S_TEXT/UTF8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    .line 2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :cond_0
    const-wide/16 v0, 0x3e8

    const-string p0, "%02d:%02d:%02d,%03d"

    .line 3
    invoke-static {p1, p2, p0, v0, v1}, Lc/a/a/a/f2/i0/e;->s(JLjava/lang/String;J)[B

    move-result-object p0

    const/16 p1, 0x13

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x2710

    const-string p0, "%01d:%02d:%02d:%02d"

    .line 4
    invoke-static {p1, p2, p0, v0, v1}, Lc/a/a/a/f2/i0/e;->s(JLjava/lang/String;J)[B

    move-result-object p0

    const/16 p1, 0x15

    :goto_0
    const/4 p2, 0x0

    .line 5
    array-length v0, p0

    invoke-static {p0, p2, p3, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method private I(Lc/a/a/a/f2/k;Lc/a/a/a/f2/i0/e$c;I)I
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "#2.output"
        }
    .end annotation

    .line 1
    iget-object v0, p2, Lc/a/a/a/f2/i0/e$c;->b:Ljava/lang/String;

    const-string v1, "S_TEXT/UTF8"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object p2, Lc/a/a/a/f2/i0/e;->b:[B

    invoke-direct {p0, p1, p2, p3}, Lc/a/a/a/f2/i0/e;->J(Lc/a/a/a/f2/k;[BI)V

    .line 3
    invoke-direct {p0}, Lc/a/a/a/f2/i0/e;->q()I

    move-result p1

    return p1

    .line 4
    :cond_0
    iget-object v0, p2, Lc/a/a/a/f2/i0/e$c;->b:Ljava/lang/String;

    const-string v1, "S_TEXT/ASS"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    sget-object p2, Lc/a/a/a/f2/i0/e;->d:[B

    invoke-direct {p0, p1, p2, p3}, Lc/a/a/a/f2/i0/e;->J(Lc/a/a/a/f2/k;[BI)V

    .line 6
    invoke-direct {p0}, Lc/a/a/a/f2/i0/e;->q()I

    move-result p1

    return p1

    .line 7
    :cond_1
    iget-object v0, p2, Lc/a/a/a/f2/i0/e$c;->X:Lc/a/a/a/f2/b0;

    .line 8
    iget-boolean v1, p0, Lc/a/a/a/f2/i0/e;->a0:Z

    const/4 v2, 0x4

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v1, :cond_11

    .line 9
    iget-boolean v1, p2, Lc/a/a/a/f2/i0/e$c;->h:Z

    if-eqz v1, :cond_e

    .line 10
    iget v1, p0, Lc/a/a/a/f2/i0/e;->U:I

    const v6, -0x40000001    # -1.9999999f

    and-int/2addr v1, v6

    iput v1, p0, Lc/a/a/a/f2/i0/e;->U:I

    .line 11
    iget-boolean v1, p0, Lc/a/a/a/f2/i0/e;->b0:Z

    const/16 v6, 0x80

    if-nez v1, :cond_3

    .line 12
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v1

    invoke-interface {p1, v1, v5, v4}, Lc/a/a/a/f2/k;->readFully([BII)V

    .line 13
    iget v1, p0, Lc/a/a/a/f2/i0/e;->X:I

    add-int/2addr v1, v4

    iput v1, p0, Lc/a/a/a/f2/i0/e;->X:I

    .line 14
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v1

    aget-byte v1, v1, v5

    and-int/2addr v1, v6

    if-eq v1, v6, :cond_2

    .line 15
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v1

    aget-byte v1, v1, v5

    iput-byte v1, p0, Lc/a/a/a/f2/i0/e;->e0:B

    .line 16
    iput-boolean v4, p0, Lc/a/a/a/f2/i0/e;->b0:Z

    goto :goto_0

    .line 17
    :cond_2
    new-instance p1, Lc/a/a/a/g1;

    const-string p2, "Extension bit is set in signal byte"

    invoke-direct {p1, p2}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_3
    :goto_0
    iget-byte v1, p0, Lc/a/a/a/f2/i0/e;->e0:B

    and-int/lit8 v7, v1, 0x1

    if-ne v7, v4, :cond_4

    const/4 v7, 0x1

    goto :goto_1

    :cond_4
    const/4 v7, 0x0

    :goto_1
    if-eqz v7, :cond_f

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_5

    const/4 v1, 0x1

    goto :goto_2

    :cond_5
    const/4 v1, 0x0

    .line 19
    :goto_2
    iget v7, p0, Lc/a/a/a/f2/i0/e;->U:I

    const/high16 v8, 0x40000000    # 2.0f

    or-int/2addr v7, v8

    iput v7, p0, Lc/a/a/a/f2/i0/e;->U:I

    .line 20
    iget-boolean v7, p0, Lc/a/a/a/f2/i0/e;->f0:Z

    if-nez v7, :cond_7

    .line 21
    iget-object v7, p0, Lc/a/a/a/f2/i0/e;->r:Lc/a/a/a/m2/a0;

    invoke-virtual {v7}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v7

    const/16 v8, 0x8

    invoke-interface {p1, v7, v5, v8}, Lc/a/a/a/f2/k;->readFully([BII)V

    .line 22
    iget v7, p0, Lc/a/a/a/f2/i0/e;->X:I

    add-int/2addr v7, v8

    iput v7, p0, Lc/a/a/a/f2/i0/e;->X:I

    .line 23
    iput-boolean v4, p0, Lc/a/a/a/f2/i0/e;->f0:Z

    .line 24
    iget-object v7, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v7}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v7

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    const/4 v6, 0x0

    :goto_3
    or-int/2addr v6, v8

    int-to-byte v6, v6

    .line 25
    aput-byte v6, v7, v5

    .line 26
    iget-object v6, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v6, v5}, Lc/a/a/a/m2/a0;->P(I)V

    .line 27
    iget-object v6, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-interface {v0, v6, v4, v4}, Lc/a/a/a/f2/b0;->e(Lc/a/a/a/m2/a0;II)V

    .line 28
    iget v6, p0, Lc/a/a/a/f2/i0/e;->Y:I

    add-int/2addr v6, v4

    iput v6, p0, Lc/a/a/a/f2/i0/e;->Y:I

    .line 29
    iget-object v6, p0, Lc/a/a/a/f2/i0/e;->r:Lc/a/a/a/m2/a0;

    invoke-virtual {v6, v5}, Lc/a/a/a/m2/a0;->P(I)V

    .line 30
    iget-object v6, p0, Lc/a/a/a/f2/i0/e;->r:Lc/a/a/a/m2/a0;

    invoke-interface {v0, v6, v8, v4}, Lc/a/a/a/f2/b0;->e(Lc/a/a/a/m2/a0;II)V

    .line 31
    iget v6, p0, Lc/a/a/a/f2/i0/e;->Y:I

    add-int/2addr v6, v8

    iput v6, p0, Lc/a/a/a/f2/i0/e;->Y:I

    :cond_7
    if-eqz v1, :cond_f

    .line 32
    iget-boolean v1, p0, Lc/a/a/a/f2/i0/e;->c0:Z

    if-nez v1, :cond_8

    .line 33
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v1

    invoke-interface {p1, v1, v5, v4}, Lc/a/a/a/f2/k;->readFully([BII)V

    .line 34
    iget v1, p0, Lc/a/a/a/f2/i0/e;->X:I

    add-int/2addr v1, v4

    iput v1, p0, Lc/a/a/a/f2/i0/e;->X:I

    .line 35
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v1, v5}, Lc/a/a/a/m2/a0;->P(I)V

    .line 36
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->D()I

    move-result v1

    iput v1, p0, Lc/a/a/a/f2/i0/e;->d0:I

    .line 37
    iput-boolean v4, p0, Lc/a/a/a/f2/i0/e;->c0:Z

    .line 38
    :cond_8
    iget v1, p0, Lc/a/a/a/f2/i0/e;->d0:I

    mul-int/lit8 v1, v1, 0x4

    .line 39
    iget-object v6, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v6, v1}, Lc/a/a/a/m2/a0;->L(I)V

    .line 40
    iget-object v6, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v6}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v6

    invoke-interface {p1, v6, v5, v1}, Lc/a/a/a/f2/k;->readFully([BII)V

    .line 41
    iget v6, p0, Lc/a/a/a/f2/i0/e;->X:I

    add-int/2addr v6, v1

    iput v6, p0, Lc/a/a/a/f2/i0/e;->X:I

    .line 42
    iget v1, p0, Lc/a/a/a/f2/i0/e;->d0:I

    div-int/2addr v1, v3

    add-int/2addr v1, v4

    int-to-short v1, v1

    mul-int/lit8 v6, v1, 0x6

    add-int/2addr v6, v3

    .line 43
    iget-object v7, p0, Lc/a/a/a/f2/i0/e;->u:Ljava/nio/ByteBuffer;

    if-eqz v7, :cond_9

    .line 44
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v7

    if-ge v7, v6, :cond_a

    .line 45
    :cond_9
    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    iput-object v7, p0, Lc/a/a/a/f2/i0/e;->u:Ljava/nio/ByteBuffer;

    .line 46
    :cond_a
    iget-object v7, p0, Lc/a/a/a/f2/i0/e;->u:Ljava/nio/ByteBuffer;

    invoke-virtual {v7, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 47
    iget-object v7, p0, Lc/a/a/a/f2/i0/e;->u:Ljava/nio/ByteBuffer;

    invoke-virtual {v7, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    const/4 v1, 0x0

    const/4 v7, 0x0

    .line 48
    :goto_4
    iget v8, p0, Lc/a/a/a/f2/i0/e;->d0:I

    if-ge v1, v8, :cond_c

    .line 49
    iget-object v8, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v8}, Lc/a/a/a/m2/a0;->H()I

    move-result v8

    .line 50
    rem-int/lit8 v9, v1, 0x2

    if-nez v9, :cond_b

    .line 51
    iget-object v9, p0, Lc/a/a/a/f2/i0/e;->u:Ljava/nio/ByteBuffer;

    sub-int v7, v8, v7

    int-to-short v7, v7

    invoke-virtual {v9, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    goto :goto_5

    .line 52
    :cond_b
    iget-object v9, p0, Lc/a/a/a/f2/i0/e;->u:Ljava/nio/ByteBuffer;

    sub-int v7, v8, v7

    invoke-virtual {v9, v7}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    :goto_5
    add-int/lit8 v1, v1, 0x1

    move v7, v8

    goto :goto_4

    .line 53
    :cond_c
    iget v1, p0, Lc/a/a/a/f2/i0/e;->X:I

    sub-int v1, p3, v1

    sub-int/2addr v1, v7

    .line 54
    rem-int/2addr v8, v3

    if-ne v8, v4, :cond_d

    .line 55
    iget-object v7, p0, Lc/a/a/a/f2/i0/e;->u:Ljava/nio/ByteBuffer;

    invoke-virtual {v7, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    goto :goto_6

    .line 56
    :cond_d
    iget-object v7, p0, Lc/a/a/a/f2/i0/e;->u:Ljava/nio/ByteBuffer;

    int-to-short v1, v1

    invoke-virtual {v7, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 57
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->u:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 58
    :goto_6
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->s:Lc/a/a/a/m2/a0;

    iget-object v7, p0, Lc/a/a/a/f2/i0/e;->u:Ljava/nio/ByteBuffer;

    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v7

    invoke-virtual {v1, v7, v6}, Lc/a/a/a/m2/a0;->N([BI)V

    .line 59
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->s:Lc/a/a/a/m2/a0;

    invoke-interface {v0, v1, v6, v4}, Lc/a/a/a/f2/b0;->e(Lc/a/a/a/m2/a0;II)V

    .line 60
    iget v1, p0, Lc/a/a/a/f2/i0/e;->Y:I

    add-int/2addr v1, v6

    iput v1, p0, Lc/a/a/a/f2/i0/e;->Y:I

    goto :goto_7

    .line 61
    :cond_e
    iget-object v1, p2, Lc/a/a/a/f2/i0/e$c;->i:[B

    if-eqz v1, :cond_f

    .line 62
    iget-object v6, p0, Lc/a/a/a/f2/i0/e;->p:Lc/a/a/a/m2/a0;

    array-length v7, v1

    invoke-virtual {v6, v1, v7}, Lc/a/a/a/m2/a0;->N([BI)V

    .line 63
    :cond_f
    :goto_7
    iget v1, p2, Lc/a/a/a/f2/i0/e$c;->f:I

    if-lez v1, :cond_10

    .line 64
    iget v1, p0, Lc/a/a/a/f2/i0/e;->U:I

    const/high16 v6, 0x10000000

    or-int/2addr v1, v6

    iput v1, p0, Lc/a/a/a/f2/i0/e;->U:I

    .line 65
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->t:Lc/a/a/a/m2/a0;

    invoke-virtual {v1, v5}, Lc/a/a/a/m2/a0;->L(I)V

    .line 66
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v1, v2}, Lc/a/a/a/m2/a0;->L(I)V

    .line 67
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v1

    shr-int/lit8 v6, p3, 0x18

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    aput-byte v6, v1, v5

    .line 68
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v1

    shr-int/lit8 v6, p3, 0x10

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    aput-byte v6, v1, v4

    .line 69
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v1

    shr-int/lit8 v6, p3, 0x8

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    aput-byte v6, v1, v3

    .line 70
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v1

    const/4 v6, 0x3

    and-int/lit16 v7, p3, 0xff

    int-to-byte v7, v7

    aput-byte v7, v1, v6

    .line 71
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-interface {v0, v1, v2, v3}, Lc/a/a/a/f2/b0;->e(Lc/a/a/a/m2/a0;II)V

    .line 72
    iget v1, p0, Lc/a/a/a/f2/i0/e;->Y:I

    add-int/2addr v1, v2

    iput v1, p0, Lc/a/a/a/f2/i0/e;->Y:I

    .line 73
    :cond_10
    iput-boolean v4, p0, Lc/a/a/a/f2/i0/e;->a0:Z

    .line 74
    :cond_11
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->p:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->f()I

    move-result v1

    add-int/2addr p3, v1

    .line 75
    iget-object v1, p2, Lc/a/a/a/f2/i0/e$c;->b:Ljava/lang/String;

    const-string v6, "V_MPEG4/ISO/AVC"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    iget-object v1, p2, Lc/a/a/a/f2/i0/e$c;->b:Ljava/lang/String;

    const-string v6, "V_MPEGH/ISO/HEVC"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_a

    .line 76
    :cond_12
    iget-object v1, p2, Lc/a/a/a/f2/i0/e$c;->T:Lc/a/a/a/f2/i0/e$d;

    if-eqz v1, :cond_14

    .line 77
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->p:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->f()I

    move-result v1

    if-nez v1, :cond_13

    goto :goto_8

    :cond_13
    const/4 v4, 0x0

    :goto_8
    invoke-static {v4}, Lc/a/a/a/m2/f;->f(Z)V

    .line 78
    iget-object v1, p2, Lc/a/a/a/f2/i0/e$c;->T:Lc/a/a/a/f2/i0/e$d;

    invoke-virtual {v1, p1}, Lc/a/a/a/f2/i0/e$d;->d(Lc/a/a/a/f2/k;)V

    .line 79
    :cond_14
    :goto_9
    iget v1, p0, Lc/a/a/a/f2/i0/e;->X:I

    if-ge v1, p3, :cond_17

    sub-int v1, p3, v1

    .line 80
    invoke-direct {p0, p1, v0, v1}, Lc/a/a/a/f2/i0/e;->K(Lc/a/a/a/f2/k;Lc/a/a/a/f2/b0;I)I

    move-result v1

    .line 81
    iget v3, p0, Lc/a/a/a/f2/i0/e;->X:I

    add-int/2addr v3, v1

    iput v3, p0, Lc/a/a/a/f2/i0/e;->X:I

    .line 82
    iget v3, p0, Lc/a/a/a/f2/i0/e;->Y:I

    add-int/2addr v3, v1

    iput v3, p0, Lc/a/a/a/f2/i0/e;->Y:I

    goto :goto_9

    .line 83
    :cond_15
    :goto_a
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->l:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v1

    .line 84
    aput-byte v5, v1, v5

    .line 85
    aput-byte v5, v1, v4

    .line 86
    aput-byte v5, v1, v3

    .line 87
    iget v3, p2, Lc/a/a/a/f2/i0/e$c;->Y:I

    rsub-int/lit8 v4, v3, 0x4

    .line 88
    :goto_b
    iget v6, p0, Lc/a/a/a/f2/i0/e;->X:I

    if-ge v6, p3, :cond_17

    .line 89
    iget v6, p0, Lc/a/a/a/f2/i0/e;->Z:I

    if-nez v6, :cond_16

    .line 90
    invoke-direct {p0, p1, v1, v4, v3}, Lc/a/a/a/f2/i0/e;->L(Lc/a/a/a/f2/k;[BII)V

    .line 91
    iget v6, p0, Lc/a/a/a/f2/i0/e;->X:I

    add-int/2addr v6, v3

    iput v6, p0, Lc/a/a/a/f2/i0/e;->X:I

    .line 92
    iget-object v6, p0, Lc/a/a/a/f2/i0/e;->l:Lc/a/a/a/m2/a0;

    invoke-virtual {v6, v5}, Lc/a/a/a/m2/a0;->P(I)V

    .line 93
    iget-object v6, p0, Lc/a/a/a/f2/i0/e;->l:Lc/a/a/a/m2/a0;

    invoke-virtual {v6}, Lc/a/a/a/m2/a0;->H()I

    move-result v6

    iput v6, p0, Lc/a/a/a/f2/i0/e;->Z:I

    .line 94
    iget-object v6, p0, Lc/a/a/a/f2/i0/e;->k:Lc/a/a/a/m2/a0;

    invoke-virtual {v6, v5}, Lc/a/a/a/m2/a0;->P(I)V

    .line 95
    iget-object v6, p0, Lc/a/a/a/f2/i0/e;->k:Lc/a/a/a/m2/a0;

    invoke-interface {v0, v6, v2}, Lc/a/a/a/f2/b0;->a(Lc/a/a/a/m2/a0;I)V

    .line 96
    iget v6, p0, Lc/a/a/a/f2/i0/e;->Y:I

    add-int/2addr v6, v2

    iput v6, p0, Lc/a/a/a/f2/i0/e;->Y:I

    goto :goto_b

    .line 97
    :cond_16
    invoke-direct {p0, p1, v0, v6}, Lc/a/a/a/f2/i0/e;->K(Lc/a/a/a/f2/k;Lc/a/a/a/f2/b0;I)I

    move-result v6

    .line 98
    iget v7, p0, Lc/a/a/a/f2/i0/e;->X:I

    add-int/2addr v7, v6

    iput v7, p0, Lc/a/a/a/f2/i0/e;->X:I

    .line 99
    iget v7, p0, Lc/a/a/a/f2/i0/e;->Y:I

    add-int/2addr v7, v6

    iput v7, p0, Lc/a/a/a/f2/i0/e;->Y:I

    .line 100
    iget v7, p0, Lc/a/a/a/f2/i0/e;->Z:I

    sub-int/2addr v7, v6

    iput v7, p0, Lc/a/a/a/f2/i0/e;->Z:I

    goto :goto_b

    .line 101
    :cond_17
    iget-object p1, p2, Lc/a/a/a/f2/i0/e$c;->b:Ljava/lang/String;

    const-string p2, "A_VORBIS"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_18

    .line 102
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->n:Lc/a/a/a/m2/a0;

    invoke-virtual {p1, v5}, Lc/a/a/a/m2/a0;->P(I)V

    .line 103
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->n:Lc/a/a/a/m2/a0;

    invoke-interface {v0, p1, v2}, Lc/a/a/a/f2/b0;->a(Lc/a/a/a/m2/a0;I)V

    .line 104
    iget p1, p0, Lc/a/a/a/f2/i0/e;->Y:I

    add-int/2addr p1, v2

    iput p1, p0, Lc/a/a/a/f2/i0/e;->Y:I

    .line 105
    :cond_18
    invoke-direct {p0}, Lc/a/a/a/f2/i0/e;->q()I

    move-result p1

    return p1
.end method

.method private J(Lc/a/a/a/f2/k;[BI)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    array-length v0, p2

    add-int/2addr v0, p3

    .line 2
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->q:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->b()I

    move-result v1

    const/4 v2, 0x0

    if-ge v1, v0, :cond_0

    .line 3
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->q:Lc/a/a/a/m2/a0;

    add-int v3, v0, p3

    invoke-static {p2, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Lc/a/a/a/m2/a0;->M([B)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->q:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v1

    array-length v3, p2

    invoke-static {p2, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5
    :goto_0
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->q:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v1

    array-length p2, p2

    invoke-interface {p1, v1, p2, p3}, Lc/a/a/a/f2/k;->readFully([BII)V

    .line 6
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->q:Lc/a/a/a/m2/a0;

    invoke-virtual {p1, v2}, Lc/a/a/a/m2/a0;->P(I)V

    .line 7
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->q:Lc/a/a/a/m2/a0;

    invoke-virtual {p1, v0}, Lc/a/a/a/m2/a0;->O(I)V

    return-void
.end method

.method private K(Lc/a/a/a/f2/k;Lc/a/a/a/f2/b0;I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/i0/e;->p:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->a()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 3
    iget-object p3, p0, Lc/a/a/a/f2/i0/e;->p:Lc/a/a/a/m2/a0;

    invoke-interface {p2, p3, p1}, Lc/a/a/a/f2/b0;->a(Lc/a/a/a/m2/a0;I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    invoke-interface {p2, p1, p3, v0}, Lc/a/a/a/f2/b0;->f(Lcom/google/android/exoplayer2/upstream/j;IZ)I

    move-result p1

    :goto_0
    return p1
.end method

.method private L(Lc/a/a/a/f2/k;[BII)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/i0/e;->p:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->a()I

    move-result v0

    invoke-static {p4, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int v1, p3, v0

    sub-int/2addr p4, v0

    .line 2
    invoke-interface {p1, p2, v1, p4}, Lc/a/a/a/f2/k;->readFully([BII)V

    if-lez v0, :cond_0

    .line 3
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->p:Lc/a/a/a/m2/a0;

    invoke-virtual {p1, p2, p3, v0}, Lc/a/a/a/m2/a0;->j([BII)V

    :cond_0
    return-void
.end method

.method static synthetic d()[B
    .locals 1

    .line 1
    sget-object v0, Lc/a/a/a/f2/i0/e;->c:[B

    return-object v0
.end method

.method static synthetic f()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Lc/a/a/a/f2/i0/e;->f:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic g()Ljava/util/UUID;
    .locals 1

    .line 1
    sget-object v0, Lc/a/a/a/f2/i0/e;->e:Ljava/util/UUID;

    return-object v0
.end method

.method private h(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "cueTimesUs",
            "cueClusterPositions"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/i0/e;->I:Lc/a/a/a/m2/u;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/a/a/a/f2/i0/e;->J:Lc/a/a/a/m2/u;

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Lc/a/a/a/g1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Element "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " must be in a Cues"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private j(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "currentTrack"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Lc/a/a/a/g1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Element "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " must be in a TrackEntry"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private k()V
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "extractorOutput"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/i0/e;->g0:Lc/a/a/a/f2/l;

    invoke-static {v0}, Lc/a/a/a/m2/f;->h(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private m(Lc/a/a/a/m2/u;Lc/a/a/a/m2/u;)Lc/a/a/a/f2/y;
    .locals 11

    .line 1
    iget-wide v0, p0, Lc/a/a/a/f2/i0/e;->w:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_4

    iget-wide v0, p0, Lc/a/a/a/f2/i0/e;->z:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_4

    if-eqz p1, :cond_4

    .line 2
    invoke-virtual {p1}, Lc/a/a/a/m2/u;->c()I

    move-result v0

    if-eqz v0, :cond_4

    if-eqz p2, :cond_4

    .line 3
    invoke-virtual {p2}, Lc/a/a/a/m2/u;->c()I

    move-result v0

    invoke-virtual {p1}, Lc/a/a/a/m2/u;->c()I

    move-result v1

    if-eq v0, v1, :cond_0

    goto/16 :goto_2

    .line 4
    :cond_0
    invoke-virtual {p1}, Lc/a/a/a/m2/u;->c()I

    move-result v0

    .line 5
    new-array v1, v0, [I

    .line 6
    new-array v2, v0, [J

    .line 7
    new-array v3, v0, [J

    .line 8
    new-array v4, v0, [J

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v0, :cond_1

    .line 9
    invoke-virtual {p1, v6}, Lc/a/a/a/m2/u;->b(I)J

    move-result-wide v7

    aput-wide v7, v4, v6

    .line 10
    iget-wide v7, p0, Lc/a/a/a/f2/i0/e;->w:J

    invoke-virtual {p2, v6}, Lc/a/a/a/m2/u;->b(I)J

    move-result-wide v9

    add-long/2addr v7, v9

    aput-wide v7, v2, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    add-int/lit8 p1, v0, -0x1

    if-ge v5, p1, :cond_2

    add-int/lit8 p1, v5, 0x1

    .line 11
    aget-wide v6, v2, p1

    aget-wide v8, v2, v5

    sub-long/2addr v6, v8

    long-to-int p2, v6

    aput p2, v1, v5

    .line 12
    aget-wide v6, v4, p1

    aget-wide v8, v4, v5

    sub-long/2addr v6, v8

    aput-wide v6, v3, v5

    move v5, p1

    goto :goto_1

    .line 13
    :cond_2
    iget-wide v5, p0, Lc/a/a/a/f2/i0/e;->w:J

    iget-wide v7, p0, Lc/a/a/a/f2/i0/e;->v:J

    add-long/2addr v5, v7

    aget-wide v7, v2, p1

    sub-long/2addr v5, v7

    long-to-int p2, v5

    aput p2, v1, p1

    .line 14
    iget-wide v5, p0, Lc/a/a/a/f2/i0/e;->z:J

    aget-wide v7, v4, p1

    sub-long/2addr v5, v7

    aput-wide v5, v3, p1

    .line 15
    aget-wide v5, v3, p1

    const-wide/16 v7, 0x0

    cmp-long p2, v5, v7

    if-gtz p2, :cond_3

    .line 16
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Discarding last cue point with unexpected duration: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "MatroskaExtractor"

    invoke-static {v0, p2}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    .line 18
    invoke-static {v2, p1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v2

    .line 19
    invoke-static {v3, p1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v3

    .line 20
    invoke-static {v4, p1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v4

    .line 21
    :cond_3
    new-instance p1, Lc/a/a/a/f2/e;

    invoke-direct {p1, v1, v2, v3, v4}, Lc/a/a/a/f2/e;-><init>([I[J[J[J)V

    return-object p1

    .line 22
    :cond_4
    :goto_2
    new-instance p1, Lc/a/a/a/f2/y$b;

    iget-wide v0, p0, Lc/a/a/a/f2/i0/e;->z:J

    invoke-direct {p1, v0, v1}, Lc/a/a/a/f2/y$b;-><init>(J)V

    return-object p1
.end method

.method private n(Lc/a/a/a/f2/i0/e$c;JIII)V
    .locals 8
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "#1.output"
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lc/a/a/a/f2/i0/e$c;->T:Lc/a/a/a/f2/i0/e$d;

    const/4 v7, 0x1

    if-eqz v0, :cond_0

    move-object v1, p1

    move-wide v2, p2

    move v4, p4

    move v5, p5

    move v6, p6

    .line 2
    invoke-virtual/range {v0 .. v6}, Lc/a/a/a/f2/i0/e$d;->c(Lc/a/a/a/f2/i0/e$c;JIII)V

    goto/16 :goto_4

    .line 3
    :cond_0
    iget-object v0, p1, Lc/a/a/a/f2/i0/e$c;->b:Ljava/lang/String;

    const-string v1, "S_TEXT/UTF8"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p1, Lc/a/a/a/f2/i0/e$c;->b:Ljava/lang/String;

    const-string v1, "S_TEXT/ASS"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 4
    :cond_1
    iget v0, p0, Lc/a/a/a/f2/i0/e;->Q:I

    const-string v1, "MatroskaExtractor"

    if-le v0, v7, :cond_2

    const-string v0, "Skipping subtitle sample in laced block."

    .line 5
    invoke-static {v1, v0}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 6
    :cond_2
    iget-wide v2, p0, Lc/a/a/a/f2/i0/e;->O:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v2, v4

    if-nez v0, :cond_3

    const-string v0, "Skipping subtitle sample with no duration."

    .line 7
    invoke-static {v1, v0}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 8
    :cond_3
    iget-object v0, p1, Lc/a/a/a/f2/i0/e$c;->b:Ljava/lang/String;

    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->q:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v1

    invoke-static {v0, v2, v3, v1}, Lc/a/a/a/f2/i0/e;->F(Ljava/lang/String;J[B)V

    .line 9
    iget-object v0, p0, Lc/a/a/a/f2/i0/e;->q:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->e()I

    move-result v0

    :goto_0
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->q:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->f()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 10
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->q:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v1

    aget-byte v1, v1, v0

    if-nez v1, :cond_4

    .line 11
    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->q:Lc/a/a/a/m2/a0;

    invoke-virtual {v1, v0}, Lc/a/a/a/m2/a0;->O(I)V

    goto :goto_1

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 12
    :cond_5
    :goto_1
    iget-object v0, p1, Lc/a/a/a/f2/i0/e$c;->X:Lc/a/a/a/f2/b0;

    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->q:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->f()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lc/a/a/a/f2/b0;->a(Lc/a/a/a/m2/a0;I)V

    .line 13
    iget-object v0, p0, Lc/a/a/a/f2/i0/e;->q:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->f()I

    move-result v0

    add-int/2addr p5, v0

    :cond_6
    :goto_2
    const/high16 v0, 0x10000000

    and-int/2addr v0, p4

    if-eqz v0, :cond_8

    .line 14
    iget v0, p0, Lc/a/a/a/f2/i0/e;->Q:I

    if-le v0, v7, :cond_7

    const v0, -0x10000001

    and-int/2addr p4, v0

    goto :goto_3

    .line 15
    :cond_7
    iget-object v0, p0, Lc/a/a/a/f2/i0/e;->t:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->f()I

    move-result v0

    .line 16
    iget-object v1, p1, Lc/a/a/a/f2/i0/e$c;->X:Lc/a/a/a/f2/b0;

    iget-object v2, p0, Lc/a/a/a/f2/i0/e;->t:Lc/a/a/a/m2/a0;

    const/4 v3, 0x2

    invoke-interface {v1, v2, v0, v3}, Lc/a/a/a/f2/b0;->e(Lc/a/a/a/m2/a0;II)V

    add-int/2addr p5, v0

    :cond_8
    :goto_3
    move v3, p4

    move v4, p5

    .line 17
    iget-object v0, p1, Lc/a/a/a/f2/i0/e$c;->X:Lc/a/a/a/f2/b0;

    iget-object v6, p1, Lc/a/a/a/f2/i0/e$c;->j:Lc/a/a/a/f2/b0$a;

    move-wide v1, p2

    move v5, p6

    invoke-interface/range {v0 .. v6}, Lc/a/a/a/f2/b0;->c(JIIILc/a/a/a/f2/b0$a;)V

    .line 18
    :goto_4
    iput-boolean v7, p0, Lc/a/a/a/f2/i0/e;->L:Z

    return-void
.end method

.method private static p([II)[I
    .locals 1

    if-nez p0, :cond_0

    .line 1
    new-array p0, p1, [I

    return-object p0

    .line 2
    :cond_0
    array-length v0, p0

    if-lt v0, p1, :cond_1

    return-object p0

    .line 3
    :cond_1
    array-length p0, p0

    mul-int/lit8 p0, p0, 0x2

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    new-array p0, p0, [I

    return-object p0
.end method

.method private q()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/f2/i0/e;->Y:I

    .line 2
    invoke-direct {p0}, Lc/a/a/a/f2/i0/e;->D()V

    return v0
.end method

.method private static s(JLjava/lang/String;J)[B
    .locals 10

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, p0, v2

    if-eqz v4, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 1
    :goto_0
    invoke-static {v2}, Lc/a/a/a/m2/f;->a(Z)V

    const-wide v2, 0xd693a400L

    .line 2
    div-long v2, p0, v2

    long-to-int v3, v2

    mul-int/lit16 v2, v3, 0xe10

    int-to-long v4, v2

    const-wide/32 v6, 0xf4240

    mul-long v4, v4, v6

    sub-long/2addr p0, v4

    const-wide/32 v4, 0x3938700

    .line 3
    div-long v4, p0, v4

    long-to-int v2, v4

    mul-int/lit8 v4, v2, 0x3c

    int-to-long v4, v4

    mul-long v4, v4, v6

    sub-long/2addr p0, v4

    .line 4
    div-long v4, p0, v6

    long-to-int v5, v4

    int-to-long v8, v5

    mul-long v8, v8, v6

    sub-long/2addr p0, v8

    .line 5
    div-long/2addr p0, p3

    long-to-int p1, p0

    .line 6
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 p3, 0x4

    new-array p3, p3, [Ljava/lang/Object;

    .line 7
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    aput-object p4, p3, v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    aput-object p4, p3, v0

    const/4 p4, 0x2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p3, p4

    const/4 p4, 0x3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p3, p4

    invoke-static {p0, p2, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 8
    invoke-static {p0}, Lc/a/a/a/m2/m0;->g0(Ljava/lang/String;)[B

    move-result-object p0

    return-object p0
.end method

.method private t(I)Lc/a/a/a/f2/i0/e$c;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->j(I)V

    .line 2
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    return-object p1
.end method

.method private static y(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "A_OPUS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v3, 0x1f

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "A_FLAC"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v3, 0x1e

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "A_EAC3"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v3, 0x1d

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "V_MPEG2"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v3, 0x1c

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "S_TEXT/UTF8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v3, 0x1b

    goto/16 :goto_0

    :sswitch_5
    const-string v0, "V_MPEGH/ISO/HEVC"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v3, 0x1a

    goto/16 :goto_0

    :sswitch_6
    const-string v0, "S_TEXT/ASS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v3, 0x19

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "A_PCM/INT/LIT"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v3, 0x18

    goto/16 :goto_0

    :sswitch_8
    const-string v0, "A_PCM/INT/BIG"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v3, 0x17

    goto/16 :goto_0

    :sswitch_9
    const-string v0, "A_PCM/FLOAT/IEEE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v3, 0x16

    goto/16 :goto_0

    :sswitch_a
    const-string v0, "A_DTS/EXPRESS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v3, 0x15

    goto/16 :goto_0

    :sswitch_b
    const-string v0, "V_THEORA"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v3, 0x14

    goto/16 :goto_0

    :sswitch_c
    const-string v0, "S_HDMV/PGS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v3, 0x13

    goto/16 :goto_0

    :sswitch_d
    const-string v0, "V_VP9"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v3, 0x12

    goto/16 :goto_0

    :sswitch_e
    const-string v0, "V_VP8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v3, 0x11

    goto/16 :goto_0

    :sswitch_f
    const-string v0, "V_AV1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v3, 0x10

    goto/16 :goto_0

    :sswitch_10
    const-string v0, "A_DTS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v3, 0xf

    goto/16 :goto_0

    :sswitch_11
    const-string v0, "A_AC3"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v3, 0xe

    goto/16 :goto_0

    :sswitch_12
    const-string v0, "A_AAC"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v3, 0xd

    goto/16 :goto_0

    :sswitch_13
    const-string v0, "A_DTS/LOSSLESS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v3, 0xc

    goto/16 :goto_0

    :sswitch_14
    const-string v0, "S_VOBSUB"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v3, 0xb

    goto/16 :goto_0

    :sswitch_15
    const-string v0, "V_MPEG4/ISO/AVC"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v3, 0xa

    goto/16 :goto_0

    :sswitch_16
    const-string v0, "V_MPEG4/ISO/ASP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v3, 0x9

    goto/16 :goto_0

    :sswitch_17
    const-string v0, "S_DVBSUB"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_17

    goto/16 :goto_0

    :cond_17
    const/16 v3, 0x8

    goto/16 :goto_0

    :sswitch_18
    const-string v0, "V_MS/VFW/FOURCC"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_18

    goto :goto_0

    :cond_18
    const/4 v3, 0x7

    goto :goto_0

    :sswitch_19
    const-string v0, "A_MPEG/L3"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_19

    goto :goto_0

    :cond_19
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_1a
    const-string v0, "A_MPEG/L2"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1a

    goto :goto_0

    :cond_1a
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_1b
    const-string v0, "A_VORBIS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1b

    goto :goto_0

    :cond_1b
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_1c
    const-string v0, "A_TRUEHD"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1c

    goto :goto_0

    :cond_1c
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_1d
    const-string v0, "A_MS/ACM"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1d

    goto :goto_0

    :cond_1d
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_1e
    const-string v0, "V_MPEG4/ISO/SP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1e

    goto :goto_0

    :cond_1e
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_1f
    const-string v0, "V_MPEG4/ISO/AP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1f

    goto :goto_0

    :cond_1f
    const/4 v3, 0x0

    :goto_0
    packed-switch v3, :pswitch_data_0

    return v2

    :pswitch_0
    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ce7f5de -> :sswitch_1f
        -0x7ce7f3b0 -> :sswitch_1e
        -0x76567dc0 -> :sswitch_1d
        -0x6a615338 -> :sswitch_1c
        -0x672350af -> :sswitch_1b
        -0x585f4fce -> :sswitch_1a
        -0x585f4fcd -> :sswitch_19
        -0x51dc40b2 -> :sswitch_18
        -0x37a9c464 -> :sswitch_17
        -0x2016c535 -> :sswitch_16
        -0x2016c4e5 -> :sswitch_15
        -0x19552dbd -> :sswitch_14
        -0x1538b2ba -> :sswitch_13
        0x3c02325 -> :sswitch_12
        0x3c02353 -> :sswitch_11
        0x3c030c5 -> :sswitch_10
        0x4e81333 -> :sswitch_f
        0x4e86155 -> :sswitch_e
        0x4e86156 -> :sswitch_d
        0x5e8da3e -> :sswitch_c
        0x1a8350d6 -> :sswitch_b
        0x2056f406 -> :sswitch_a
        0x25e26ee2 -> :sswitch_9
        0x2b45174d -> :sswitch_8
        0x2b453ce4 -> :sswitch_7
        0x2c0618eb -> :sswitch_6
        0x32fdf009 -> :sswitch_5
        0x54c61e47 -> :sswitch_4
        0x6bd6c624 -> :sswitch_3
        0x7446132a -> :sswitch_2
        0x7446b0a6 -> :sswitch_1
        0x744ad97d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method protected G(IJJ)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lc/a/a/a/f2/i0/e;->k()V

    const/16 v0, 0xa0

    const/4 v1, 0x0

    if-eq p1, v0, :cond_b

    const/16 v0, 0xae

    if-eq p1, v0, :cond_a

    const/16 v0, 0xbb

    if-eq p1, v0, :cond_9

    const/16 v0, 0x4dbb

    const-wide/16 v1, -0x1

    if-eq p1, v0, :cond_8

    const/16 v0, 0x5035

    const/4 v3, 0x1

    if-eq p1, v0, :cond_7

    const/16 v0, 0x55d0

    if-eq p1, v0, :cond_6

    const v0, 0x18538067

    if-eq p1, v0, :cond_3

    const p2, 0x1c53bb6b

    if-eq p1, p2, :cond_2

    const p2, 0x1f43b675

    if-eq p1, p2, :cond_0

    goto/16 :goto_1

    .line 2
    :cond_0
    iget-boolean p1, p0, Lc/a/a/a/f2/i0/e;->B:Z

    if-nez p1, :cond_c

    .line 3
    iget-boolean p1, p0, Lc/a/a/a/f2/i0/e;->j:Z

    if-eqz p1, :cond_1

    iget-wide p1, p0, Lc/a/a/a/f2/i0/e;->F:J

    cmp-long p3, p1, v1

    if-eqz p3, :cond_1

    .line 4
    iput-boolean v3, p0, Lc/a/a/a/f2/i0/e;->E:Z

    goto :goto_1

    .line 5
    :cond_1
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->g0:Lc/a/a/a/f2/l;

    new-instance p2, Lc/a/a/a/f2/y$b;

    iget-wide p3, p0, Lc/a/a/a/f2/i0/e;->z:J

    invoke-direct {p2, p3, p4}, Lc/a/a/a/f2/y$b;-><init>(J)V

    invoke-interface {p1, p2}, Lc/a/a/a/f2/l;->f(Lc/a/a/a/f2/y;)V

    .line 6
    iput-boolean v3, p0, Lc/a/a/a/f2/i0/e;->B:Z

    goto :goto_1

    .line 7
    :cond_2
    new-instance p1, Lc/a/a/a/m2/u;

    invoke-direct {p1}, Lc/a/a/a/m2/u;-><init>()V

    iput-object p1, p0, Lc/a/a/a/f2/i0/e;->I:Lc/a/a/a/m2/u;

    .line 8
    new-instance p1, Lc/a/a/a/m2/u;

    invoke-direct {p1}, Lc/a/a/a/m2/u;-><init>()V

    iput-object p1, p0, Lc/a/a/a/f2/i0/e;->J:Lc/a/a/a/m2/u;

    goto :goto_1

    .line 9
    :cond_3
    iget-wide v3, p0, Lc/a/a/a/f2/i0/e;->w:J

    cmp-long p1, v3, v1

    if-eqz p1, :cond_5

    cmp-long p1, v3, p2

    if-nez p1, :cond_4

    goto :goto_0

    .line 10
    :cond_4
    new-instance p1, Lc/a/a/a/g1;

    const-string p2, "Multiple Segment elements not supported"

    invoke-direct {p1, p2}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1

    .line 11
    :cond_5
    :goto_0
    iput-wide p2, p0, Lc/a/a/a/f2/i0/e;->w:J

    .line 12
    iput-wide p4, p0, Lc/a/a/a/f2/i0/e;->v:J

    goto :goto_1

    .line 13
    :cond_6
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    iput-boolean v3, p1, Lc/a/a/a/f2/i0/e$c;->x:Z

    goto :goto_1

    .line 14
    :cond_7
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    iput-boolean v3, p1, Lc/a/a/a/f2/i0/e$c;->h:Z

    goto :goto_1

    :cond_8
    const/4 p1, -0x1

    .line 15
    iput p1, p0, Lc/a/a/a/f2/i0/e;->C:I

    .line 16
    iput-wide v1, p0, Lc/a/a/a/f2/i0/e;->D:J

    goto :goto_1

    .line 17
    :cond_9
    iput-boolean v1, p0, Lc/a/a/a/f2/i0/e;->K:Z

    goto :goto_1

    .line 18
    :cond_a
    new-instance p1, Lc/a/a/a/f2/i0/e$c;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lc/a/a/a/f2/i0/e$c;-><init>(Lc/a/a/a/f2/i0/e$a;)V

    iput-object p1, p0, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    goto :goto_1

    .line 19
    :cond_b
    iput-boolean v1, p0, Lc/a/a/a/f2/i0/e;->W:Z

    :cond_c
    :goto_1
    return-void
.end method

.method protected H(ILjava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    const/16 v0, 0x86

    if-eq p1, v0, :cond_4

    const/16 v0, 0x4282

    if-eq p1, v0, :cond_2

    const/16 v0, 0x536e

    if-eq p1, v0, :cond_1

    const v0, 0x22b59c

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    invoke-static {p1, p2}, Lc/a/a/a/f2/i0/e$c;->d(Lc/a/a/a/f2/i0/e$c;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    .line 2
    :cond_1
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    iput-object p2, p1, Lc/a/a/a/f2/i0/e$c;->a:Ljava/lang/String;

    goto :goto_0

    :cond_2
    const-string p1, "webm"

    .line 3
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, "matroska"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    .line 4
    :cond_3
    new-instance p1, Lc/a/a/a/g1;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DocType "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " not supported"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :cond_4
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    iput-object p2, p1, Lc/a/a/a/f2/i0/e$c;->b:Ljava/lang/String;

    :cond_5
    :goto_0
    return-void
.end method

.method public final a()V
    .locals 0

    return-void
.end method

.method public final b(Lc/a/a/a/f2/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/f2/i0/e;->g0:Lc/a/a/a/f2/l;

    return-void
.end method

.method public c(JJ)V
    .locals 0

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 1
    iput-wide p1, p0, Lc/a/a/a/f2/i0/e;->H:J

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lc/a/a/a/f2/i0/e;->M:I

    .line 3
    iget-object p2, p0, Lc/a/a/a/f2/i0/e;->g:Lc/a/a/a/f2/i0/d;

    invoke-interface {p2}, Lc/a/a/a/f2/i0/d;->reset()V

    .line 4
    iget-object p2, p0, Lc/a/a/a/f2/i0/e;->h:Lc/a/a/a/f2/i0/g;

    invoke-virtual {p2}, Lc/a/a/a/f2/i0/g;->e()V

    .line 5
    invoke-direct {p0}, Lc/a/a/a/f2/i0/e;->D()V

    .line 6
    :goto_0
    iget-object p2, p0, Lc/a/a/a/f2/i0/e;->i:Landroid/util/SparseArray;

    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    move-result p2

    if-ge p1, p2, :cond_0

    .line 7
    iget-object p2, p0, Lc/a/a/a/f2/i0/e;->i:Landroid/util/SparseArray;

    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc/a/a/a/f2/i0/e$c;

    invoke-virtual {p2}, Lc/a/a/a/f2/i0/e$c;->m()V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final e(Lc/a/a/a/f2/k;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lc/a/a/a/f2/i0/f;

    invoke-direct {v0}, Lc/a/a/a/f2/i0/f;-><init>()V

    invoke-virtual {v0, p1}, Lc/a/a/a/f2/i0/f;->b(Lc/a/a/a/f2/k;)Z

    move-result p1

    return p1
.end method

.method public final i(Lc/a/a/a/f2/k;Lc/a/a/a/f2/x;)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/f2/i0/e;->L:Z

    const/4 v1, 0x1

    const/4 v2, 0x1

    :cond_0
    if-eqz v2, :cond_1

    .line 2
    iget-boolean v3, p0, Lc/a/a/a/f2/i0/e;->L:Z

    if-nez v3, :cond_1

    .line 3
    iget-object v2, p0, Lc/a/a/a/f2/i0/e;->g:Lc/a/a/a/f2/i0/d;

    invoke-interface {v2, p1}, Lc/a/a/a/f2/i0/d;->a(Lc/a/a/a/f2/k;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v3

    invoke-direct {p0, p2, v3, v4}, Lc/a/a/a/f2/i0/e;->B(Lc/a/a/a/f2/x;J)Z

    move-result v3

    if-eqz v3, :cond_0

    return v1

    :cond_1
    if-nez v2, :cond_3

    .line 5
    :goto_0
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->i:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    .line 6
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->i:Landroid/util/SparseArray;

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/f2/i0/e$c;

    .line 7
    invoke-static {p1}, Lc/a/a/a/f2/i0/e$c;->a(Lc/a/a/a/f2/i0/e$c;)V

    .line 8
    invoke-virtual {p1}, Lc/a/a/a/f2/i0/e$c;->i()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    return p1

    :cond_3
    return v0
.end method

.method protected l(IILc/a/a/a/f2/k;)V
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v7, p0

    move/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v8, p3

    const/16 v2, 0xa1

    const/16 v3, 0xa3

    const/4 v4, 0x2

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v0, v2, :cond_8

    if-eq v0, v3, :cond_8

    const/16 v2, 0xa5

    if-eq v0, v2, :cond_6

    const/16 v2, 0x41ed

    if-eq v0, v2, :cond_5

    const/16 v2, 0x4255

    if-eq v0, v2, :cond_4

    const/16 v2, 0x47e2

    if-eq v0, v2, :cond_3

    const/16 v2, 0x53ab

    if-eq v0, v2, :cond_2

    const/16 v2, 0x63a2

    if-eq v0, v2, :cond_1

    const/16 v2, 0x7672

    if-ne v0, v2, :cond_0

    .line 1
    invoke-direct/range {p0 .. p1}, Lc/a/a/a/f2/i0/e;->j(I)V

    .line 2
    iget-object v0, v7, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    new-array v2, v1, [B

    iput-object v2, v0, Lc/a/a/a/f2/i0/e$c;->v:[B

    .line 3
    invoke-interface {v8, v2, v9, v1}, Lc/a/a/a/f2/k;->readFully([BII)V

    goto/16 :goto_c

    .line 4
    :cond_0
    new-instance v1, Lc/a/a/a/g1;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected id: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw v1

    .line 5
    :cond_1
    invoke-direct/range {p0 .. p1}, Lc/a/a/a/f2/i0/e;->j(I)V

    .line 6
    iget-object v0, v7, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    new-array v2, v1, [B

    iput-object v2, v0, Lc/a/a/a/f2/i0/e$c;->k:[B

    .line 7
    invoke-interface {v8, v2, v9, v1}, Lc/a/a/a/f2/k;->readFully([BII)V

    goto/16 :goto_c

    .line 8
    :cond_2
    iget-object v0, v7, Lc/a/a/a/f2/i0/e;->o:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    invoke-static {v0, v9}, Ljava/util/Arrays;->fill([BB)V

    .line 9
    iget-object v0, v7, Lc/a/a/a/f2/i0/e;->o:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v0

    rsub-int/lit8 v2, v1, 0x4

    invoke-interface {v8, v0, v2, v1}, Lc/a/a/a/f2/k;->readFully([BII)V

    .line 10
    iget-object v0, v7, Lc/a/a/a/f2/i0/e;->o:Lc/a/a/a/m2/a0;

    invoke-virtual {v0, v9}, Lc/a/a/a/m2/a0;->P(I)V

    .line 11
    iget-object v0, v7, Lc/a/a/a/f2/i0/e;->o:Lc/a/a/a/m2/a0;

    invoke-virtual {v0}, Lc/a/a/a/m2/a0;->F()J

    move-result-wide v0

    long-to-int v1, v0

    iput v1, v7, Lc/a/a/a/f2/i0/e;->C:I

    goto/16 :goto_c

    .line 12
    :cond_3
    new-array v2, v1, [B

    .line 13
    invoke-interface {v8, v2, v9, v1}, Lc/a/a/a/f2/k;->readFully([BII)V

    .line 14
    invoke-direct/range {p0 .. p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object v0

    new-instance v1, Lc/a/a/a/f2/b0$a;

    invoke-direct {v1, v10, v2, v9, v9}, Lc/a/a/a/f2/b0$a;-><init>(I[BII)V

    iput-object v1, v0, Lc/a/a/a/f2/i0/e$c;->j:Lc/a/a/a/f2/b0$a;

    goto/16 :goto_c

    .line 15
    :cond_4
    invoke-direct/range {p0 .. p1}, Lc/a/a/a/f2/i0/e;->j(I)V

    .line 16
    iget-object v0, v7, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    new-array v2, v1, [B

    iput-object v2, v0, Lc/a/a/a/f2/i0/e$c;->i:[B

    .line 17
    invoke-interface {v8, v2, v9, v1}, Lc/a/a/a/f2/k;->readFully([BII)V

    goto/16 :goto_c

    .line 18
    :cond_5
    invoke-direct/range {p0 .. p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object v0

    invoke-virtual {v7, v0, v8, v1}, Lc/a/a/a/f2/i0/e;->v(Lc/a/a/a/f2/i0/e$c;Lc/a/a/a/f2/k;I)V

    goto/16 :goto_c

    .line 19
    :cond_6
    iget v0, v7, Lc/a/a/a/f2/i0/e;->M:I

    if-eq v0, v4, :cond_7

    return-void

    .line 20
    :cond_7
    iget-object v0, v7, Lc/a/a/a/f2/i0/e;->i:Landroid/util/SparseArray;

    iget v2, v7, Lc/a/a/a/f2/i0/e;->S:I

    .line 21
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/f2/i0/e$c;

    iget v2, v7, Lc/a/a/a/f2/i0/e;->V:I

    .line 22
    invoke-virtual {v7, v0, v2, v8, v1}, Lc/a/a/a/f2/i0/e;->w(Lc/a/a/a/f2/i0/e$c;ILc/a/a/a/f2/k;I)V

    goto/16 :goto_c

    .line 23
    :cond_8
    iget v2, v7, Lc/a/a/a/f2/i0/e;->M:I

    const/16 v5, 0x8

    if-nez v2, :cond_9

    .line 24
    iget-object v2, v7, Lc/a/a/a/f2/i0/e;->h:Lc/a/a/a/f2/i0/g;

    invoke-virtual {v2, v8, v9, v10, v5}, Lc/a/a/a/f2/i0/g;->d(Lc/a/a/a/f2/k;ZZI)J

    move-result-wide v11

    long-to-int v2, v11

    iput v2, v7, Lc/a/a/a/f2/i0/e;->S:I

    .line 25
    iget-object v2, v7, Lc/a/a/a/f2/i0/e;->h:Lc/a/a/a/f2/i0/g;

    invoke-virtual {v2}, Lc/a/a/a/f2/i0/g;->b()I

    move-result v2

    iput v2, v7, Lc/a/a/a/f2/i0/e;->T:I

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 26
    iput-wide v11, v7, Lc/a/a/a/f2/i0/e;->O:J

    .line 27
    iput v10, v7, Lc/a/a/a/f2/i0/e;->M:I

    .line 28
    iget-object v2, v7, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v2, v9}, Lc/a/a/a/m2/a0;->L(I)V

    .line 29
    :cond_9
    iget-object v2, v7, Lc/a/a/a/f2/i0/e;->i:Landroid/util/SparseArray;

    iget v6, v7, Lc/a/a/a/f2/i0/e;->S:I

    invoke-virtual {v2, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Lc/a/a/a/f2/i0/e$c;

    if-nez v11, :cond_a

    .line 30
    iget v0, v7, Lc/a/a/a/f2/i0/e;->T:I

    sub-int v0, v1, v0

    invoke-interface {v8, v0}, Lc/a/a/a/f2/k;->i(I)V

    .line 31
    iput v9, v7, Lc/a/a/a/f2/i0/e;->M:I

    return-void

    .line 32
    :cond_a
    invoke-static {v11}, Lc/a/a/a/f2/i0/e$c;->a(Lc/a/a/a/f2/i0/e$c;)V

    .line 33
    iget v2, v7, Lc/a/a/a/f2/i0/e;->M:I

    if-ne v2, v10, :cond_1b

    const/4 v2, 0x3

    .line 34
    invoke-direct {v7, v8, v2}, Lc/a/a/a/f2/i0/e;->C(Lc/a/a/a/f2/k;I)V

    .line 35
    iget-object v6, v7, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v6}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v6

    aget-byte v6, v6, v4

    and-int/lit8 v6, v6, 0x6

    shr-int/2addr v6, v10

    const/16 v12, 0xff

    if-nez v6, :cond_b

    .line 36
    iput v10, v7, Lc/a/a/a/f2/i0/e;->Q:I

    .line 37
    iget-object v6, v7, Lc/a/a/a/f2/i0/e;->R:[I

    invoke-static {v6, v10}, Lc/a/a/a/f2/i0/e;->p([II)[I

    move-result-object v6

    iput-object v6, v7, Lc/a/a/a/f2/i0/e;->R:[I

    .line 38
    iget v13, v7, Lc/a/a/a/f2/i0/e;->T:I

    sub-int/2addr v1, v13

    sub-int/2addr v1, v2

    aput v1, v6, v9

    goto/16 :goto_6

    :cond_b
    const/4 v13, 0x4

    .line 39
    invoke-direct {v7, v8, v13}, Lc/a/a/a/f2/i0/e;->C(Lc/a/a/a/f2/k;I)V

    .line 40
    iget-object v14, v7, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v14}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v14

    aget-byte v14, v14, v2

    and-int/2addr v14, v12

    add-int/2addr v14, v10

    iput v14, v7, Lc/a/a/a/f2/i0/e;->Q:I

    .line 41
    iget-object v15, v7, Lc/a/a/a/f2/i0/e;->R:[I

    invoke-static {v15, v14}, Lc/a/a/a/f2/i0/e;->p([II)[I

    move-result-object v14

    iput-object v14, v7, Lc/a/a/a/f2/i0/e;->R:[I

    if-ne v6, v4, :cond_c

    .line 42
    iget v2, v7, Lc/a/a/a/f2/i0/e;->T:I

    sub-int/2addr v1, v2

    sub-int/2addr v1, v13

    iget v2, v7, Lc/a/a/a/f2/i0/e;->Q:I

    div-int/2addr v1, v2

    .line 43
    invoke-static {v14, v9, v2, v1}, Ljava/util/Arrays;->fill([IIII)V

    goto/16 :goto_6

    :cond_c
    if-ne v6, v10, :cond_f

    const/4 v2, 0x0

    const/4 v6, 0x0

    .line 44
    :goto_0
    iget v14, v7, Lc/a/a/a/f2/i0/e;->Q:I

    add-int/lit8 v15, v14, -0x1

    if-ge v2, v15, :cond_e

    .line 45
    iget-object v14, v7, Lc/a/a/a/f2/i0/e;->R:[I

    aput v9, v14, v2

    :cond_d
    add-int/2addr v13, v10

    .line 46
    invoke-direct {v7, v8, v13}, Lc/a/a/a/f2/i0/e;->C(Lc/a/a/a/f2/k;I)V

    .line 47
    iget-object v14, v7, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v14}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v14

    add-int/lit8 v15, v13, -0x1

    aget-byte v14, v14, v15

    and-int/2addr v14, v12

    .line 48
    iget-object v15, v7, Lc/a/a/a/f2/i0/e;->R:[I

    aget v16, v15, v2

    add-int v16, v16, v14

    aput v16, v15, v2

    if-eq v14, v12, :cond_d

    .line 49
    aget v14, v15, v2

    add-int/2addr v6, v14

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 50
    :cond_e
    iget-object v2, v7, Lc/a/a/a/f2/i0/e;->R:[I

    sub-int/2addr v14, v10

    iget v15, v7, Lc/a/a/a/f2/i0/e;->T:I

    sub-int/2addr v1, v15

    sub-int/2addr v1, v13

    sub-int/2addr v1, v6

    aput v1, v2, v14

    goto/16 :goto_6

    :cond_f
    if-ne v6, v2, :cond_1a

    const/4 v2, 0x0

    const/4 v6, 0x0

    .line 51
    :goto_1
    iget v14, v7, Lc/a/a/a/f2/i0/e;->Q:I

    add-int/lit8 v15, v14, -0x1

    if-ge v2, v15, :cond_17

    .line 52
    iget-object v14, v7, Lc/a/a/a/f2/i0/e;->R:[I

    aput v9, v14, v2

    add-int/lit8 v13, v13, 0x1

    .line 53
    invoke-direct {v7, v8, v13}, Lc/a/a/a/f2/i0/e;->C(Lc/a/a/a/f2/k;I)V

    .line 54
    iget-object v14, v7, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v14}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v14

    add-int/lit8 v15, v13, -0x1

    aget-byte v14, v14, v15

    if-eqz v14, :cond_16

    const-wide/16 v16, 0x0

    const/4 v14, 0x0

    :goto_2
    if-ge v14, v5, :cond_13

    rsub-int/lit8 v18, v14, 0x7

    shl-int v18, v10, v18

    .line 55
    iget-object v3, v7, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v3}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v3

    aget-byte v3, v3, v15

    and-int v3, v3, v18

    if-eqz v3, :cond_12

    add-int/2addr v13, v14

    .line 56
    invoke-direct {v7, v8, v13}, Lc/a/a/a/f2/i0/e;->C(Lc/a/a/a/f2/k;I)V

    .line 57
    iget-object v3, v7, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v3}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v3

    add-int/lit8 v16, v15, 0x1

    aget-byte v3, v3, v15

    and-int/2addr v3, v12

    xor-int/lit8 v15, v18, -0x1

    and-int/2addr v3, v15

    int-to-long v9, v3

    move/from16 v3, v16

    :goto_3
    move-wide/from16 v16, v9

    if-ge v3, v13, :cond_10

    shl-long v9, v16, v5

    .line 58
    iget-object v15, v7, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v15}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v15

    add-int/lit8 v16, v3, 0x1

    aget-byte v3, v15, v3

    and-int/2addr v3, v12

    move/from16 v19, v13

    int-to-long v12, v3

    or-long/2addr v9, v12

    move/from16 v3, v16

    move/from16 v13, v19

    const/16 v12, 0xff

    goto :goto_3

    :cond_10
    move/from16 v19, v13

    if-lez v2, :cond_11

    mul-int/lit8 v14, v14, 0x7

    add-int/lit8 v14, v14, 0x6

    const-wide/16 v9, 0x1

    shl-long v12, v9, v14

    sub-long/2addr v12, v9

    sub-long v16, v16, v12

    :cond_11
    move-wide/from16 v9, v16

    move/from16 v13, v19

    goto :goto_4

    :cond_12
    add-int/lit8 v14, v14, 0x1

    const/16 v3, 0xa3

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/16 v12, 0xff

    goto :goto_2

    :cond_13
    move-wide/from16 v9, v16

    :goto_4
    const-wide/32 v14, -0x80000000

    cmp-long v3, v9, v14

    if-ltz v3, :cond_15

    const-wide/32 v14, 0x7fffffff

    cmp-long v3, v9, v14

    if-gtz v3, :cond_15

    long-to-int v3, v9

    .line 59
    iget-object v9, v7, Lc/a/a/a/f2/i0/e;->R:[I

    if-nez v2, :cond_14

    goto :goto_5

    :cond_14
    add-int/lit8 v10, v2, -0x1

    .line 60
    aget v10, v9, v10

    add-int/2addr v3, v10

    :goto_5
    aput v3, v9, v2

    .line 61
    aget v3, v9, v2

    add-int/2addr v6, v3

    add-int/lit8 v2, v2, 0x1

    const/16 v3, 0xa3

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/16 v12, 0xff

    goto/16 :goto_1

    .line 62
    :cond_15
    new-instance v0, Lc/a/a/a/g1;

    const-string v1, "EBML lacing sample size out of range."

    invoke-direct {v0, v1}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw v0

    .line 63
    :cond_16
    new-instance v0, Lc/a/a/a/g1;

    const-string v1, "No valid varint length mask found"

    invoke-direct {v0, v1}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw v0

    .line 64
    :cond_17
    iget-object v2, v7, Lc/a/a/a/f2/i0/e;->R:[I

    const/4 v3, 0x1

    sub-int/2addr v14, v3

    iget v3, v7, Lc/a/a/a/f2/i0/e;->T:I

    sub-int/2addr v1, v3

    sub-int/2addr v1, v13

    sub-int/2addr v1, v6

    aput v1, v2, v14

    .line 65
    :goto_6
    iget-object v1, v7, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v1

    const/4 v2, 0x0

    aget-byte v1, v1, v2

    shl-int/2addr v1, v5

    iget-object v2, v7, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    invoke-virtual {v2}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v2

    const/4 v3, 0x1

    aget-byte v2, v2, v3

    const/16 v3, 0xff

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    .line 66
    iget-wide v2, v7, Lc/a/a/a/f2/i0/e;->H:J

    int-to-long v5, v1

    invoke-direct {v7, v5, v6}, Lc/a/a/a/f2/i0/e;->E(J)J

    move-result-wide v5

    add-long/2addr v2, v5

    iput-wide v2, v7, Lc/a/a/a/f2/i0/e;->N:J

    .line 67
    iget v1, v11, Lc/a/a/a/f2/i0/e$c;->d:I

    if-eq v1, v4, :cond_19

    const/16 v1, 0xa3

    if-ne v0, v1, :cond_18

    iget-object v1, v7, Lc/a/a/a/f2/i0/e;->m:Lc/a/a/a/m2/a0;

    .line 68
    invoke-virtual {v1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object v1

    aget-byte v1, v1, v4

    const/16 v2, 0x80

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_18

    goto :goto_7

    :cond_18
    const/4 v1, 0x0

    goto :goto_8

    :cond_19
    :goto_7
    const/4 v1, 0x1

    .line 69
    :goto_8
    iput v1, v7, Lc/a/a/a/f2/i0/e;->U:I

    .line 70
    iput v4, v7, Lc/a/a/a/f2/i0/e;->M:I

    const/4 v1, 0x0

    .line 71
    iput v1, v7, Lc/a/a/a/f2/i0/e;->P:I

    goto :goto_9

    .line 72
    :cond_1a
    new-instance v0, Lc/a/a/a/g1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected lacing value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1b
    :goto_9
    const/16 v1, 0xa3

    if-ne v0, v1, :cond_1d

    .line 73
    :goto_a
    iget v0, v7, Lc/a/a/a/f2/i0/e;->P:I

    iget v1, v7, Lc/a/a/a/f2/i0/e;->Q:I

    if-ge v0, v1, :cond_1c

    .line 74
    iget-object v1, v7, Lc/a/a/a/f2/i0/e;->R:[I

    aget v0, v1, v0

    invoke-direct {v7, v8, v11, v0}, Lc/a/a/a/f2/i0/e;->I(Lc/a/a/a/f2/k;Lc/a/a/a/f2/i0/e$c;I)I

    move-result v5

    .line 75
    iget-wide v0, v7, Lc/a/a/a/f2/i0/e;->N:J

    iget v2, v7, Lc/a/a/a/f2/i0/e;->P:I

    iget v3, v11, Lc/a/a/a/f2/i0/e$c;->e:I

    mul-int v2, v2, v3

    div-int/lit16 v2, v2, 0x3e8

    int-to-long v2, v2

    add-long/2addr v2, v0

    .line 76
    iget v4, v7, Lc/a/a/a/f2/i0/e;->U:I

    const/4 v6, 0x0

    move-object/from16 v0, p0

    move-object v1, v11

    invoke-direct/range {v0 .. v6}, Lc/a/a/a/f2/i0/e;->n(Lc/a/a/a/f2/i0/e$c;JIII)V

    .line 77
    iget v0, v7, Lc/a/a/a/f2/i0/e;->P:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, v7, Lc/a/a/a/f2/i0/e;->P:I

    goto :goto_a

    :cond_1c
    const/4 v0, 0x0

    .line 78
    iput v0, v7, Lc/a/a/a/f2/i0/e;->M:I

    goto :goto_c

    .line 79
    :cond_1d
    :goto_b
    iget v0, v7, Lc/a/a/a/f2/i0/e;->P:I

    iget v1, v7, Lc/a/a/a/f2/i0/e;->Q:I

    if-ge v0, v1, :cond_1e

    .line 80
    iget-object v1, v7, Lc/a/a/a/f2/i0/e;->R:[I

    aget v2, v1, v0

    .line 81
    invoke-direct {v7, v8, v11, v2}, Lc/a/a/a/f2/i0/e;->I(Lc/a/a/a/f2/k;Lc/a/a/a/f2/i0/e$c;I)I

    move-result v2

    aput v2, v1, v0

    .line 82
    iget v0, v7, Lc/a/a/a/f2/i0/e;->P:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, v7, Lc/a/a/a/f2/i0/e;->P:I

    goto :goto_b

    :cond_1e
    :goto_c
    return-void
.end method

.method protected o(I)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lc/a/a/a/f2/i0/e;->k()V

    const/16 v0, 0xa0

    const/4 v1, 0x0

    if-eq p1, v0, :cond_f

    const/16 v0, 0xae

    const/4 v2, 0x0

    if-eq p1, v0, :cond_c

    const/16 v0, 0x4dbb

    const v3, 0x1c53bb6b

    if-eq p1, v0, :cond_a

    const/16 v0, 0x6240

    const/4 v4, 0x1

    if-eq p1, v0, :cond_8

    const/16 v0, 0x6d80

    if-eq p1, v0, :cond_6

    const v0, 0x1549a966

    if-eq p1, v0, :cond_4

    const v0, 0x1654ae6b

    if-eq p1, v0, :cond_2

    if-eq p1, v3, :cond_0

    goto/16 :goto_2

    .line 2
    :cond_0
    iget-boolean p1, p0, Lc/a/a/a/f2/i0/e;->B:Z

    if-nez p1, :cond_1

    .line 3
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->g0:Lc/a/a/a/f2/l;

    iget-object v0, p0, Lc/a/a/a/f2/i0/e;->I:Lc/a/a/a/m2/u;

    iget-object v1, p0, Lc/a/a/a/f2/i0/e;->J:Lc/a/a/a/m2/u;

    invoke-direct {p0, v0, v1}, Lc/a/a/a/f2/i0/e;->m(Lc/a/a/a/m2/u;Lc/a/a/a/m2/u;)Lc/a/a/a/f2/y;

    move-result-object v0

    invoke-interface {p1, v0}, Lc/a/a/a/f2/l;->f(Lc/a/a/a/f2/y;)V

    .line 4
    iput-boolean v4, p0, Lc/a/a/a/f2/i0/e;->B:Z

    .line 5
    :cond_1
    iput-object v2, p0, Lc/a/a/a/f2/i0/e;->I:Lc/a/a/a/m2/u;

    .line 6
    iput-object v2, p0, Lc/a/a/a/f2/i0/e;->J:Lc/a/a/a/m2/u;

    goto/16 :goto_2

    .line 7
    :cond_2
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->i:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    if-eqz p1, :cond_3

    .line 8
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->g0:Lc/a/a/a/f2/l;

    invoke-interface {p1}, Lc/a/a/a/f2/l;->h()V

    goto/16 :goto_2

    .line 9
    :cond_3
    new-instance p1, Lc/a/a/a/g1;

    const-string v0, "No valid tracks were found"

    invoke-direct {p1, v0}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1

    .line 10
    :cond_4
    iget-wide v0, p0, Lc/a/a/a/f2/i0/e;->x:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v2

    if-nez p1, :cond_5

    const-wide/32 v0, 0xf4240

    .line 11
    iput-wide v0, p0, Lc/a/a/a/f2/i0/e;->x:J

    .line 12
    :cond_5
    iget-wide v0, p0, Lc/a/a/a/f2/i0/e;->y:J

    cmp-long p1, v0, v2

    if-eqz p1, :cond_14

    .line 13
    invoke-direct {p0, v0, v1}, Lc/a/a/a/f2/i0/e;->E(J)J

    move-result-wide v0

    iput-wide v0, p0, Lc/a/a/a/f2/i0/e;->z:J

    goto/16 :goto_2

    .line 14
    :cond_6
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->j(I)V

    .line 15
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    iget-boolean v0, p1, Lc/a/a/a/f2/i0/e$c;->h:Z

    if-eqz v0, :cond_14

    iget-object p1, p1, Lc/a/a/a/f2/i0/e$c;->i:[B

    if-nez p1, :cond_7

    goto/16 :goto_2

    .line 16
    :cond_7
    new-instance p1, Lc/a/a/a/g1;

    const-string v0, "Combining encryption and compression is not supported"

    invoke-direct {p1, v0}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1

    .line 17
    :cond_8
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->j(I)V

    .line 18
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    iget-boolean v0, p1, Lc/a/a/a/f2/i0/e$c;->h:Z

    if-eqz v0, :cond_14

    .line 19
    iget-object v0, p1, Lc/a/a/a/f2/i0/e$c;->j:Lc/a/a/a/f2/b0$a;

    if-eqz v0, :cond_9

    .line 20
    new-instance v0, Lc/a/a/a/e2/t;

    new-array v2, v4, [Lc/a/a/a/e2/t$b;

    new-instance v3, Lc/a/a/a/e2/t$b;

    sget-object v4, Lc/a/a/a/i0;->a:Ljava/util/UUID;

    iget-object v5, p0, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    iget-object v5, v5, Lc/a/a/a/f2/i0/e$c;->j:Lc/a/a/a/f2/b0$a;

    iget-object v5, v5, Lc/a/a/a/f2/b0$a;->b:[B

    const-string v6, "video/webm"

    invoke-direct {v3, v4, v6, v5}, Lc/a/a/a/e2/t$b;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    aput-object v3, v2, v1

    invoke-direct {v0, v2}, Lc/a/a/a/e2/t;-><init>([Lc/a/a/a/e2/t$b;)V

    iput-object v0, p1, Lc/a/a/a/f2/i0/e$c;->l:Lc/a/a/a/e2/t;

    goto/16 :goto_2

    .line 21
    :cond_9
    new-instance p1, Lc/a/a/a/g1;

    const-string v0, "Encrypted Track found but ContentEncKeyID was not found"

    invoke-direct {p1, v0}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1

    .line 22
    :cond_a
    iget p1, p0, Lc/a/a/a/f2/i0/e;->C:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_b

    iget-wide v0, p0, Lc/a/a/a/f2/i0/e;->D:J

    const-wide/16 v4, -0x1

    cmp-long v2, v0, v4

    if-eqz v2, :cond_b

    if-ne p1, v3, :cond_14

    .line 23
    iput-wide v0, p0, Lc/a/a/a/f2/i0/e;->F:J

    goto/16 :goto_2

    .line 24
    :cond_b
    new-instance p1, Lc/a/a/a/g1;

    const-string v0, "Mandatory element SeekID or SeekPosition not found"

    invoke-direct {p1, v0}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1

    .line 25
    :cond_c
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    invoke-static {p1}, Lc/a/a/a/m2/f;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/f2/i0/e$c;

    .line 26
    iget-object v0, p1, Lc/a/a/a/f2/i0/e$c;->b:Ljava/lang/String;

    if-eqz v0, :cond_e

    .line 27
    invoke-static {v0}, Lc/a/a/a/f2/i0/e;->y(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 28
    iget-object v0, p0, Lc/a/a/a/f2/i0/e;->g0:Lc/a/a/a/f2/l;

    iget v1, p1, Lc/a/a/a/f2/i0/e$c;->c:I

    invoke-virtual {p1, v0, v1}, Lc/a/a/a/f2/i0/e$c;->h(Lc/a/a/a/f2/l;I)V

    .line 29
    iget-object v0, p0, Lc/a/a/a/f2/i0/e;->i:Landroid/util/SparseArray;

    iget v1, p1, Lc/a/a/a/f2/i0/e$c;->c:I

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 30
    :cond_d
    iput-object v2, p0, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    goto :goto_2

    .line 31
    :cond_e
    new-instance p1, Lc/a/a/a/g1;

    const-string v0, "CodecId is missing in TrackEntry element"

    invoke-direct {p1, v0}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1

    .line 32
    :cond_f
    iget p1, p0, Lc/a/a/a/f2/i0/e;->M:I

    const/4 v0, 0x2

    if-eq p1, v0, :cond_10

    return-void

    :cond_10
    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 33
    :goto_0
    iget v2, p0, Lc/a/a/a/f2/i0/e;->Q:I

    if-ge p1, v2, :cond_11

    .line 34
    iget-object v2, p0, Lc/a/a/a/f2/i0/e;->R:[I

    aget v2, v2, p1

    add-int/2addr v0, v2

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 35
    :cond_11
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->i:Landroid/util/SparseArray;

    iget v2, p0, Lc/a/a/a/f2/i0/e;->S:I

    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/f2/i0/e$c;

    .line 36
    invoke-static {p1}, Lc/a/a/a/f2/i0/e$c;->a(Lc/a/a/a/f2/i0/e$c;)V

    const/4 v9, 0x0

    .line 37
    :goto_1
    iget v2, p0, Lc/a/a/a/f2/i0/e;->Q:I

    if-ge v9, v2, :cond_13

    .line 38
    iget-wide v2, p0, Lc/a/a/a/f2/i0/e;->N:J

    iget v4, p1, Lc/a/a/a/f2/i0/e$c;->e:I

    mul-int v4, v4, v9

    div-int/lit16 v4, v4, 0x3e8

    int-to-long v4, v4

    add-long/2addr v4, v2

    .line 39
    iget v2, p0, Lc/a/a/a/f2/i0/e;->U:I

    if-nez v9, :cond_12

    .line 40
    iget-boolean v3, p0, Lc/a/a/a/f2/i0/e;->W:Z

    if-nez v3, :cond_12

    or-int/lit8 v2, v2, 0x1

    :cond_12
    move v6, v2

    .line 41
    iget-object v2, p0, Lc/a/a/a/f2/i0/e;->R:[I

    aget v7, v2, v9

    sub-int/2addr v0, v7

    move-object v2, p0

    move-object v3, p1

    move v8, v0

    .line 42
    invoke-direct/range {v2 .. v8}, Lc/a/a/a/f2/i0/e;->n(Lc/a/a/a/f2/i0/e$c;JIII)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 43
    :cond_13
    iput v1, p0, Lc/a/a/a/f2/i0/e;->M:I

    :cond_14
    :goto_2
    return-void
.end method

.method protected r(ID)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    const/16 v0, 0xb5

    if-eq p1, v0, :cond_1

    const/16 v0, 0x4489

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    goto/16 :goto_0

    .line 1
    :pswitch_0
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Lc/a/a/a/f2/i0/e$c;->u:F

    goto/16 :goto_0

    .line 2
    :pswitch_1
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Lc/a/a/a/f2/i0/e$c;->t:F

    goto :goto_0

    .line 3
    :pswitch_2
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Lc/a/a/a/f2/i0/e$c;->s:F

    goto :goto_0

    .line 4
    :pswitch_3
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Lc/a/a/a/f2/i0/e$c;->M:F

    goto :goto_0

    .line 5
    :pswitch_4
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Lc/a/a/a/f2/i0/e$c;->L:F

    goto :goto_0

    .line 6
    :pswitch_5
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Lc/a/a/a/f2/i0/e$c;->K:F

    goto :goto_0

    .line 7
    :pswitch_6
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Lc/a/a/a/f2/i0/e$c;->J:F

    goto :goto_0

    .line 8
    :pswitch_7
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Lc/a/a/a/f2/i0/e$c;->I:F

    goto :goto_0

    .line 9
    :pswitch_8
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Lc/a/a/a/f2/i0/e$c;->H:F

    goto :goto_0

    .line 10
    :pswitch_9
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Lc/a/a/a/f2/i0/e$c;->G:F

    goto :goto_0

    .line 11
    :pswitch_a
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Lc/a/a/a/f2/i0/e$c;->F:F

    goto :goto_0

    .line 12
    :pswitch_b
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Lc/a/a/a/f2/i0/e$c;->E:F

    goto :goto_0

    .line 13
    :pswitch_c
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Lc/a/a/a/f2/i0/e$c;->D:F

    goto :goto_0

    :cond_0
    double-to-long p1, p2

    .line 14
    iput-wide p1, p0, Lc/a/a/a/f2/i0/e;->y:J

    goto :goto_0

    .line 15
    :cond_1
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    double-to-int p2, p2

    iput p2, p1, Lc/a/a/a/f2/i0/e$c;->Q:I

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x55d1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x7673
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected u(I)I
    .locals 0

    sparse-switch p1, :sswitch_data_0

    const/4 p1, 0x0

    return p1

    :sswitch_0
    const/4 p1, 0x5

    return p1

    :sswitch_1
    const/4 p1, 0x4

    return p1

    :sswitch_2
    const/4 p1, 0x1

    return p1

    :sswitch_3
    const/4 p1, 0x3

    return p1

    :sswitch_4
    const/4 p1, 0x2

    return p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x83 -> :sswitch_4
        0x86 -> :sswitch_3
        0x88 -> :sswitch_4
        0x9b -> :sswitch_4
        0x9f -> :sswitch_4
        0xa0 -> :sswitch_2
        0xa1 -> :sswitch_1
        0xa3 -> :sswitch_1
        0xa5 -> :sswitch_1
        0xa6 -> :sswitch_2
        0xae -> :sswitch_2
        0xb0 -> :sswitch_4
        0xb3 -> :sswitch_4
        0xb5 -> :sswitch_0
        0xb7 -> :sswitch_2
        0xba -> :sswitch_4
        0xbb -> :sswitch_2
        0xd7 -> :sswitch_4
        0xe0 -> :sswitch_2
        0xe1 -> :sswitch_2
        0xe7 -> :sswitch_4
        0xee -> :sswitch_4
        0xf1 -> :sswitch_4
        0xfb -> :sswitch_4
        0x41e4 -> :sswitch_2
        0x41e7 -> :sswitch_4
        0x41ed -> :sswitch_1
        0x4254 -> :sswitch_4
        0x4255 -> :sswitch_1
        0x4282 -> :sswitch_3
        0x4285 -> :sswitch_4
        0x42f7 -> :sswitch_4
        0x4489 -> :sswitch_0
        0x47e1 -> :sswitch_4
        0x47e2 -> :sswitch_1
        0x47e7 -> :sswitch_2
        0x47e8 -> :sswitch_4
        0x4dbb -> :sswitch_2
        0x5031 -> :sswitch_4
        0x5032 -> :sswitch_4
        0x5034 -> :sswitch_2
        0x5035 -> :sswitch_2
        0x536e -> :sswitch_3
        0x53ab -> :sswitch_1
        0x53ac -> :sswitch_4
        0x53b8 -> :sswitch_4
        0x54b0 -> :sswitch_4
        0x54b2 -> :sswitch_4
        0x54ba -> :sswitch_4
        0x55aa -> :sswitch_4
        0x55b0 -> :sswitch_2
        0x55b9 -> :sswitch_4
        0x55ba -> :sswitch_4
        0x55bb -> :sswitch_4
        0x55bc -> :sswitch_4
        0x55bd -> :sswitch_4
        0x55d0 -> :sswitch_2
        0x55d1 -> :sswitch_0
        0x55d2 -> :sswitch_0
        0x55d3 -> :sswitch_0
        0x55d4 -> :sswitch_0
        0x55d5 -> :sswitch_0
        0x55d6 -> :sswitch_0
        0x55d7 -> :sswitch_0
        0x55d8 -> :sswitch_0
        0x55d9 -> :sswitch_0
        0x55da -> :sswitch_0
        0x55ee -> :sswitch_4
        0x56aa -> :sswitch_4
        0x56bb -> :sswitch_4
        0x6240 -> :sswitch_2
        0x6264 -> :sswitch_4
        0x63a2 -> :sswitch_1
        0x6d80 -> :sswitch_2
        0x75a1 -> :sswitch_2
        0x7670 -> :sswitch_2
        0x7671 -> :sswitch_4
        0x7672 -> :sswitch_1
        0x7673 -> :sswitch_0
        0x7674 -> :sswitch_0
        0x7675 -> :sswitch_0
        0x22b59c -> :sswitch_3
        0x23e383 -> :sswitch_4
        0x2ad7b1 -> :sswitch_4
        0x114d9b74 -> :sswitch_2
        0x1549a966 -> :sswitch_2
        0x1654ae6b -> :sswitch_2
        0x18538067 -> :sswitch_2
        0x1a45dfa3 -> :sswitch_2
        0x1c53bb6b -> :sswitch_2
        0x1f43b675 -> :sswitch_2
    .end sparse-switch
.end method

.method protected v(Lc/a/a/a/f2/i0/e$c;Lc/a/a/a/f2/k;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lc/a/a/a/f2/i0/e$c;->b(Lc/a/a/a/f2/i0/e$c;)I

    move-result v0

    const v1, 0x64767643

    if-eq v0, v1, :cond_1

    .line 2
    invoke-static {p1}, Lc/a/a/a/f2/i0/e$c;->b(Lc/a/a/a/f2/i0/e$c;)I

    move-result v0

    const v1, 0x64766343

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p2, p3}, Lc/a/a/a/f2/k;->i(I)V

    goto :goto_1

    .line 4
    :cond_1
    :goto_0
    new-array v0, p3, [B

    iput-object v0, p1, Lc/a/a/a/f2/i0/e$c;->N:[B

    const/4 p1, 0x0

    .line 5
    invoke-interface {p2, v0, p1, p3}, Lc/a/a/a/f2/k;->readFully([BII)V

    :goto_1
    return-void
.end method

.method protected w(Lc/a/a/a/f2/i0/e$c;ILc/a/a/a/f2/k;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    .line 1
    iget-object p1, p1, Lc/a/a/a/f2/i0/e$c;->b:Ljava/lang/String;

    const-string p2, "V_VP9"

    .line 2
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->t:Lc/a/a/a/m2/a0;

    invoke-virtual {p1, p4}, Lc/a/a/a/m2/a0;->L(I)V

    .line 4
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->t:Lc/a/a/a/m2/a0;

    invoke-virtual {p1}, Lc/a/a/a/m2/a0;->d()[B

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p3, p1, p2, p4}, Lc/a/a/a/f2/k;->readFully([BII)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-interface {p3, p4}, Lc/a/a/a/f2/k;->i(I)V

    :goto_0
    return-void
.end method

.method protected x(IJ)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    const/16 v0, 0x5031

    const-string v1, " not supported"

    if-eq p1, v0, :cond_19

    const/16 v0, 0x5032

    const-wide/16 v2, 0x1

    if-eq p1, v0, :cond_17

    const/4 v0, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    sparse-switch p1, :sswitch_data_0

    const/4 v0, 0x7

    const/4 v1, 0x6

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 1
    :pswitch_0
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    long-to-int p3, p2

    iput p3, p1, Lc/a/a/a/f2/i0/e$c;->C:I

    goto/16 :goto_0

    .line 2
    :pswitch_1
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    long-to-int p3, p2

    iput p3, p1, Lc/a/a/a/f2/i0/e$c;->B:I

    goto/16 :goto_0

    .line 3
    :pswitch_2
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->j(I)V

    .line 4
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    iput-boolean v6, p1, Lc/a/a/a/f2/i0/e$c;->x:Z

    long-to-int p3, p2

    if-eq p3, v6, :cond_2

    const/16 p2, 0x9

    if-eq p3, p2, :cond_1

    const/4 p2, 0x4

    if-eq p3, p2, :cond_0

    const/4 p2, 0x5

    if-eq p3, p2, :cond_0

    if-eq p3, v1, :cond_0

    if-eq p3, v0, :cond_0

    goto/16 :goto_0

    .line 5
    :cond_0
    iput v5, p1, Lc/a/a/a/f2/i0/e$c;->y:I

    goto/16 :goto_0

    .line 6
    :cond_1
    iput v1, p1, Lc/a/a/a/f2/i0/e$c;->y:I

    goto/16 :goto_0

    .line 7
    :cond_2
    iput v6, p1, Lc/a/a/a/f2/i0/e$c;->y:I

    goto/16 :goto_0

    .line 8
    :pswitch_3
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->j(I)V

    long-to-int p1, p2

    if-eq p1, v6, :cond_5

    const/16 p2, 0x10

    if-eq p1, p2, :cond_4

    const/16 p2, 0x12

    if-eq p1, p2, :cond_3

    if-eq p1, v1, :cond_5

    if-eq p1, v0, :cond_5

    goto/16 :goto_0

    .line 9
    :cond_3
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    iput v0, p1, Lc/a/a/a/f2/i0/e$c;->z:I

    goto/16 :goto_0

    .line 10
    :cond_4
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    iput v1, p1, Lc/a/a/a/f2/i0/e$c;->z:I

    goto/16 :goto_0

    .line 11
    :cond_5
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    iput v4, p1, Lc/a/a/a/f2/i0/e$c;->z:I

    goto/16 :goto_0

    .line 12
    :pswitch_4
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->j(I)V

    long-to-int p1, p2

    if-eq p1, v6, :cond_7

    if-eq p1, v5, :cond_6

    goto/16 :goto_0

    .line 13
    :cond_6
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    iput v6, p1, Lc/a/a/a/f2/i0/e$c;->A:I

    goto/16 :goto_0

    .line 14
    :cond_7
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    iput v5, p1, Lc/a/a/a/f2/i0/e$c;->A:I

    goto/16 :goto_0

    .line 15
    :sswitch_0
    iput-wide p2, p0, Lc/a/a/a/f2/i0/e;->x:J

    goto/16 :goto_0

    .line 16
    :sswitch_1
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    long-to-int p3, p2

    iput p3, p1, Lc/a/a/a/f2/i0/e$c;->e:I

    goto/16 :goto_0

    .line 17
    :sswitch_2
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->j(I)V

    long-to-int p1, p2

    if-eqz p1, :cond_b

    if-eq p1, v6, :cond_a

    if-eq p1, v5, :cond_9

    if-eq p1, v4, :cond_8

    goto/16 :goto_0

    .line 18
    :cond_8
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    iput v4, p1, Lc/a/a/a/f2/i0/e$c;->r:I

    goto/16 :goto_0

    .line 19
    :cond_9
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    iput v5, p1, Lc/a/a/a/f2/i0/e$c;->r:I

    goto/16 :goto_0

    .line 20
    :cond_a
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    iput v6, p1, Lc/a/a/a/f2/i0/e$c;->r:I

    goto/16 :goto_0

    .line 21
    :cond_b
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    iput v0, p1, Lc/a/a/a/f2/i0/e$c;->r:I

    goto/16 :goto_0

    .line 22
    :sswitch_3
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    long-to-int p3, p2

    iput p3, p1, Lc/a/a/a/f2/i0/e$c;->P:I

    goto/16 :goto_0

    .line 23
    :sswitch_4
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    iput-wide p2, p1, Lc/a/a/a/f2/i0/e$c;->S:J

    goto/16 :goto_0

    .line 24
    :sswitch_5
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    iput-wide p2, p1, Lc/a/a/a/f2/i0/e$c;->R:J

    goto/16 :goto_0

    .line 25
    :sswitch_6
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    long-to-int p3, p2

    iput p3, p1, Lc/a/a/a/f2/i0/e$c;->f:I

    goto/16 :goto_0

    .line 26
    :sswitch_7
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    cmp-long v1, p2, v2

    if-nez v1, :cond_c

    const/4 v0, 0x1

    :cond_c
    iput-boolean v0, p1, Lc/a/a/a/f2/i0/e$c;->U:Z

    goto/16 :goto_0

    .line 27
    :sswitch_8
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    long-to-int p3, p2

    iput p3, p1, Lc/a/a/a/f2/i0/e$c;->p:I

    goto/16 :goto_0

    .line 28
    :sswitch_9
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    long-to-int p3, p2

    iput p3, p1, Lc/a/a/a/f2/i0/e$c;->q:I

    goto/16 :goto_0

    .line 29
    :sswitch_a
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    long-to-int p3, p2

    iput p3, p1, Lc/a/a/a/f2/i0/e$c;->o:I

    goto/16 :goto_0

    :sswitch_b
    long-to-int p3, p2

    .line 30
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->j(I)V

    if-eqz p3, :cond_10

    if-eq p3, v6, :cond_f

    if-eq p3, v4, :cond_e

    const/16 p1, 0xf

    if-eq p3, p1, :cond_d

    goto/16 :goto_0

    .line 31
    :cond_d
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    iput v4, p1, Lc/a/a/a/f2/i0/e$c;->w:I

    goto/16 :goto_0

    .line 32
    :cond_e
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    iput v6, p1, Lc/a/a/a/f2/i0/e$c;->w:I

    goto/16 :goto_0

    .line 33
    :cond_f
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    iput v5, p1, Lc/a/a/a/f2/i0/e$c;->w:I

    goto/16 :goto_0

    .line 34
    :cond_10
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->A:Lc/a/a/a/f2/i0/e$c;

    iput v0, p1, Lc/a/a/a/f2/i0/e$c;->w:I

    goto/16 :goto_0

    .line 35
    :sswitch_c
    iget-wide v0, p0, Lc/a/a/a/f2/i0/e;->w:J

    add-long/2addr p2, v0

    iput-wide p2, p0, Lc/a/a/a/f2/i0/e;->D:J

    goto/16 :goto_0

    :sswitch_d
    cmp-long p1, p2, v2

    if-nez p1, :cond_11

    goto/16 :goto_0

    .line 36
    :cond_11
    new-instance p1, Lc/a/a/a/g1;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AESSettingsCipherMode "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_e
    const-wide/16 v2, 0x5

    cmp-long p1, p2, v2

    if-nez p1, :cond_12

    goto/16 :goto_0

    .line 37
    :cond_12
    new-instance p1, Lc/a/a/a/g1;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ContentEncAlgo "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_f
    cmp-long p1, p2, v2

    if-nez p1, :cond_13

    goto/16 :goto_0

    .line 38
    :cond_13
    new-instance p1, Lc/a/a/a/g1;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "EBMLReadVersion "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_10
    cmp-long p1, p2, v2

    if-ltz p1, :cond_14

    const-wide/16 v2, 0x2

    cmp-long p1, p2, v2

    if-gtz p1, :cond_14

    goto/16 :goto_0

    .line 39
    :cond_14
    new-instance p1, Lc/a/a/a/g1;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DocTypeReadVersion "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_11
    const-wide/16 v2, 0x3

    cmp-long p1, p2, v2

    if-nez p1, :cond_15

    goto/16 :goto_0

    .line 40
    :cond_15
    new-instance p1, Lc/a/a/a/g1;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ContentCompAlgo "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1

    .line 41
    :sswitch_12
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    long-to-int p3, p2

    invoke-static {p1, p3}, Lc/a/a/a/f2/i0/e$c;->c(Lc/a/a/a/f2/i0/e$c;I)I

    goto/16 :goto_0

    .line 42
    :sswitch_13
    iput-boolean v6, p0, Lc/a/a/a/f2/i0/e;->W:Z

    goto/16 :goto_0

    .line 43
    :sswitch_14
    iget-boolean v0, p0, Lc/a/a/a/f2/i0/e;->K:Z

    if-nez v0, :cond_1a

    .line 44
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->h(I)V

    .line 45
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->J:Lc/a/a/a/m2/u;

    invoke-virtual {p1, p2, p3}, Lc/a/a/a/m2/u;->a(J)V

    .line 46
    iput-boolean v6, p0, Lc/a/a/a/f2/i0/e;->K:Z

    goto/16 :goto_0

    :sswitch_15
    long-to-int p1, p2

    .line 47
    iput p1, p0, Lc/a/a/a/f2/i0/e;->V:I

    goto/16 :goto_0

    .line 48
    :sswitch_16
    invoke-direct {p0, p2, p3}, Lc/a/a/a/f2/i0/e;->E(J)J

    move-result-wide p1

    iput-wide p1, p0, Lc/a/a/a/f2/i0/e;->H:J

    goto/16 :goto_0

    .line 49
    :sswitch_17
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    long-to-int p3, p2

    iput p3, p1, Lc/a/a/a/f2/i0/e$c;->c:I

    goto :goto_0

    .line 50
    :sswitch_18
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    long-to-int p3, p2

    iput p3, p1, Lc/a/a/a/f2/i0/e$c;->n:I

    goto :goto_0

    .line 51
    :sswitch_19
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->h(I)V

    .line 52
    iget-object p1, p0, Lc/a/a/a/f2/i0/e;->I:Lc/a/a/a/m2/u;

    invoke-direct {p0, p2, p3}, Lc/a/a/a/f2/i0/e;->E(J)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lc/a/a/a/m2/u;->a(J)V

    goto :goto_0

    .line 53
    :sswitch_1a
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    long-to-int p3, p2

    iput p3, p1, Lc/a/a/a/f2/i0/e$c;->m:I

    goto :goto_0

    .line 54
    :sswitch_1b
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    long-to-int p3, p2

    iput p3, p1, Lc/a/a/a/f2/i0/e$c;->O:I

    goto :goto_0

    .line 55
    :sswitch_1c
    invoke-direct {p0, p2, p3}, Lc/a/a/a/f2/i0/e;->E(J)J

    move-result-wide p1

    iput-wide p1, p0, Lc/a/a/a/f2/i0/e;->O:J

    goto :goto_0

    .line 56
    :sswitch_1d
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    cmp-long v1, p2, v2

    if-nez v1, :cond_16

    const/4 v0, 0x1

    :cond_16
    iput-boolean v0, p1, Lc/a/a/a/f2/i0/e$c;->V:Z

    goto :goto_0

    .line 57
    :sswitch_1e
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e;->t(I)Lc/a/a/a/f2/i0/e$c;

    move-result-object p1

    long-to-int p3, p2

    iput p3, p1, Lc/a/a/a/f2/i0/e$c;->d:I

    goto :goto_0

    :cond_17
    cmp-long p1, p2, v2

    if-nez p1, :cond_18

    goto :goto_0

    .line 58
    :cond_18
    new-instance p1, Lc/a/a/a/g1;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ContentEncodingScope "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_19
    const-wide/16 v2, 0x0

    cmp-long p1, p2, v2

    if-nez p1, :cond_1b

    :cond_1a
    :goto_0
    return-void

    .line 59
    :cond_1b
    new-instance p1, Lc/a/a/a/g1;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ContentEncodingOrder "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x83 -> :sswitch_1e
        0x88 -> :sswitch_1d
        0x9b -> :sswitch_1c
        0x9f -> :sswitch_1b
        0xb0 -> :sswitch_1a
        0xb3 -> :sswitch_19
        0xba -> :sswitch_18
        0xd7 -> :sswitch_17
        0xe7 -> :sswitch_16
        0xee -> :sswitch_15
        0xf1 -> :sswitch_14
        0xfb -> :sswitch_13
        0x41e7 -> :sswitch_12
        0x4254 -> :sswitch_11
        0x4285 -> :sswitch_10
        0x42f7 -> :sswitch_f
        0x47e1 -> :sswitch_e
        0x47e8 -> :sswitch_d
        0x53ac -> :sswitch_c
        0x53b8 -> :sswitch_b
        0x54b0 -> :sswitch_a
        0x54b2 -> :sswitch_9
        0x54ba -> :sswitch_8
        0x55aa -> :sswitch_7
        0x55ee -> :sswitch_6
        0x56aa -> :sswitch_5
        0x56bb -> :sswitch_4
        0x6264 -> :sswitch_3
        0x7671 -> :sswitch_2
        0x23e383 -> :sswitch_1
        0x2ad7b1 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x55b9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected z(I)Z
    .locals 1

    const v0, 0x1549a966

    if-eq p1, v0, :cond_1

    const v0, 0x1f43b675

    if-eq p1, v0, :cond_1

    const v0, 0x1c53bb6b

    if-eq p1, v0, :cond_1

    const v0, 0x1654ae6b

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
