.class public final Lc/a/a/a/l2/f$c;
.super Lc/a/a/a/l2/m;
.source "DefaultTrackSelector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/l2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc/a/a/a/l2/f$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:Lc/a/a/a/l2/f$c;


# instance fields
.field public final A:Z

.field public final B:Z

.field public final C:Z

.field public final D:Z

.field public final G:Lc/a/b/b/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/b/r<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final H:Z

.field public final I:Z

.field public final J:Z

.field public final K:Z

.field public final L:Z

.field private final M:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/util/Map<",
            "Lc/a/a/a/j2/q0;",
            "Lc/a/a/a/l2/f$e;",
            ">;>;"
        }
    .end annotation
.end field

.field private final N:Landroid/util/SparseBooleanArray;

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:I

.field public final n:I

.field public final o:I

.field public final p:I

.field public final q:I

.field public final r:Z

.field public final s:Z

.field public final t:Z

.field public final u:I

.field public final v:I

.field public final w:Z

.field public final x:Lc/a/b/b/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/b/r<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final y:I

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc/a/a/a/l2/f$d;

    invoke-direct {v0}, Lc/a/a/a/l2/f$d;-><init>()V

    invoke-virtual {v0}, Lc/a/a/a/l2/f$d;->d()Lc/a/a/a/l2/f$c;

    move-result-object v0

    sput-object v0, Lc/a/a/a/l2/f$c;->i:Lc/a/a/a/l2/f$c;

    .line 2
    new-instance v0, Lc/a/a/a/l2/f$c$a;

    invoke-direct {v0}, Lc/a/a/a/l2/f$c$a;-><init>()V

    sput-object v0, Lc/a/a/a/l2/f$c;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IIIIIIIIZZZIIZLc/a/b/b/r;Lc/a/b/b/r;IIIZZZZLc/a/b/b/r;Lc/a/b/b/r;IZIZZZZZLandroid/util/SparseArray;Landroid/util/SparseBooleanArray;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIIIIIIZZZIIZ",
            "Lc/a/b/b/r<",
            "Ljava/lang/String;",
            ">;",
            "Lc/a/b/b/r<",
            "Ljava/lang/String;",
            ">;IIIZZZZ",
            "Lc/a/b/b/r<",
            "Ljava/lang/String;",
            ">;",
            "Lc/a/b/b/r<",
            "Ljava/lang/String;",
            ">;IZIZZZZZ",
            "Landroid/util/SparseArray<",
            "Ljava/util/Map<",
            "Lc/a/a/a/j2/q0;",
            "Lc/a/a/a/l2/f$e;",
            ">;>;",
            "Landroid/util/SparseBooleanArray;",
            ")V"
        }
    .end annotation

    move-object v7, p0

    move-object v0, p0

    move-object/from16 v1, p16

    move/from16 v2, p17

    move-object/from16 v3, p25

    move/from16 v4, p26

    move/from16 v5, p27

    move/from16 v6, p28

    .line 1
    invoke-direct/range {v0 .. v6}, Lc/a/a/a/l2/m;-><init>(Lc/a/b/b/r;ILc/a/b/b/r;IZI)V

    move v0, p1

    .line 2
    iput v0, v7, Lc/a/a/a/l2/f$c;->j:I

    move v0, p2

    .line 3
    iput v0, v7, Lc/a/a/a/l2/f$c;->k:I

    move v0, p3

    .line 4
    iput v0, v7, Lc/a/a/a/l2/f$c;->l:I

    move v0, p4

    .line 5
    iput v0, v7, Lc/a/a/a/l2/f$c;->m:I

    move v0, p5

    .line 6
    iput v0, v7, Lc/a/a/a/l2/f$c;->n:I

    move v0, p6

    .line 7
    iput v0, v7, Lc/a/a/a/l2/f$c;->o:I

    move v0, p7

    .line 8
    iput v0, v7, Lc/a/a/a/l2/f$c;->p:I

    move/from16 v0, p8

    .line 9
    iput v0, v7, Lc/a/a/a/l2/f$c;->q:I

    move/from16 v0, p9

    .line 10
    iput-boolean v0, v7, Lc/a/a/a/l2/f$c;->r:Z

    move/from16 v0, p10

    .line 11
    iput-boolean v0, v7, Lc/a/a/a/l2/f$c;->s:Z

    move/from16 v0, p11

    .line 12
    iput-boolean v0, v7, Lc/a/a/a/l2/f$c;->t:Z

    move/from16 v0, p12

    .line 13
    iput v0, v7, Lc/a/a/a/l2/f$c;->u:I

    move/from16 v0, p13

    .line 14
    iput v0, v7, Lc/a/a/a/l2/f$c;->v:I

    move/from16 v0, p14

    .line 15
    iput-boolean v0, v7, Lc/a/a/a/l2/f$c;->w:Z

    move-object/from16 v0, p15

    .line 16
    iput-object v0, v7, Lc/a/a/a/l2/f$c;->x:Lc/a/b/b/r;

    move/from16 v0, p18

    .line 17
    iput v0, v7, Lc/a/a/a/l2/f$c;->y:I

    move/from16 v0, p19

    .line 18
    iput v0, v7, Lc/a/a/a/l2/f$c;->z:I

    move/from16 v0, p20

    .line 19
    iput-boolean v0, v7, Lc/a/a/a/l2/f$c;->A:Z

    move/from16 v0, p21

    .line 20
    iput-boolean v0, v7, Lc/a/a/a/l2/f$c;->B:Z

    move/from16 v0, p22

    .line 21
    iput-boolean v0, v7, Lc/a/a/a/l2/f$c;->C:Z

    move/from16 v0, p23

    .line 22
    iput-boolean v0, v7, Lc/a/a/a/l2/f$c;->D:Z

    move-object/from16 v0, p24

    .line 23
    iput-object v0, v7, Lc/a/a/a/l2/f$c;->G:Lc/a/b/b/r;

    move/from16 v0, p29

    .line 24
    iput-boolean v0, v7, Lc/a/a/a/l2/f$c;->H:Z

    move/from16 v0, p30

    .line 25
    iput-boolean v0, v7, Lc/a/a/a/l2/f$c;->I:Z

    move/from16 v0, p31

    .line 26
    iput-boolean v0, v7, Lc/a/a/a/l2/f$c;->J:Z

    move/from16 v0, p32

    .line 27
    iput-boolean v0, v7, Lc/a/a/a/l2/f$c;->K:Z

    move/from16 v0, p33

    .line 28
    iput-boolean v0, v7, Lc/a/a/a/l2/f$c;->L:Z

    move-object/from16 v0, p34

    .line 29
    iput-object v0, v7, Lc/a/a/a/l2/f$c;->M:Landroid/util/SparseArray;

    move-object/from16 v0, p35

    .line 30
    iput-object v0, v7, Lc/a/a/a/l2/f$c;->N:Landroid/util/SparseBooleanArray;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 31
    invoke-direct {p0, p1}, Lc/a/a/a/l2/m;-><init>(Landroid/os/Parcel;)V

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/a/l2/f$c;->j:I

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/a/l2/f$c;->k:I

    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/a/l2/f$c;->l:I

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/a/l2/f$c;->m:I

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/a/l2/f$c;->n:I

    .line 37
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/a/l2/f$c;->o:I

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/a/l2/f$c;->p:I

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/a/l2/f$c;->q:I

    .line 40
    invoke-static {p1}, Lc/a/a/a/m2/m0;->z0(Landroid/os/Parcel;)Z

    move-result v0

    iput-boolean v0, p0, Lc/a/a/a/l2/f$c;->r:Z

    .line 41
    invoke-static {p1}, Lc/a/a/a/m2/m0;->z0(Landroid/os/Parcel;)Z

    move-result v0

    iput-boolean v0, p0, Lc/a/a/a/l2/f$c;->s:Z

    .line 42
    invoke-static {p1}, Lc/a/a/a/m2/m0;->z0(Landroid/os/Parcel;)Z

    move-result v0

    iput-boolean v0, p0, Lc/a/a/a/l2/f$c;->t:Z

    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/a/l2/f$c;->u:I

    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/a/l2/f$c;->v:I

    .line 45
    invoke-static {p1}, Lc/a/a/a/m2/m0;->z0(Landroid/os/Parcel;)Z

    move-result v0

    iput-boolean v0, p0, Lc/a/a/a/l2/f$c;->w:Z

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 47
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 48
    invoke-static {v0}, Lc/a/b/b/r;->m(Ljava/util/Collection;)Lc/a/b/b/r;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/l2/f$c;->x:Lc/a/b/b/r;

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/a/l2/f$c;->y:I

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/a/l2/f$c;->z:I

    .line 51
    invoke-static {p1}, Lc/a/a/a/m2/m0;->z0(Landroid/os/Parcel;)Z

    move-result v0

    iput-boolean v0, p0, Lc/a/a/a/l2/f$c;->A:Z

    .line 52
    invoke-static {p1}, Lc/a/a/a/m2/m0;->z0(Landroid/os/Parcel;)Z

    move-result v0

    iput-boolean v0, p0, Lc/a/a/a/l2/f$c;->B:Z

    .line 53
    invoke-static {p1}, Lc/a/a/a/m2/m0;->z0(Landroid/os/Parcel;)Z

    move-result v0

    iput-boolean v0, p0, Lc/a/a/a/l2/f$c;->C:Z

    .line 54
    invoke-static {p1}, Lc/a/a/a/m2/m0;->z0(Landroid/os/Parcel;)Z

    move-result v0

    iput-boolean v0, p0, Lc/a/a/a/l2/f$c;->D:Z

    .line 55
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 56
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 57
    invoke-static {v0}, Lc/a/b/b/r;->m(Ljava/util/Collection;)Lc/a/b/b/r;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/l2/f$c;->G:Lc/a/b/b/r;

    .line 58
    invoke-static {p1}, Lc/a/a/a/m2/m0;->z0(Landroid/os/Parcel;)Z

    move-result v0

    iput-boolean v0, p0, Lc/a/a/a/l2/f$c;->H:Z

    .line 59
    invoke-static {p1}, Lc/a/a/a/m2/m0;->z0(Landroid/os/Parcel;)Z

    move-result v0

    iput-boolean v0, p0, Lc/a/a/a/l2/f$c;->I:Z

    .line 60
    invoke-static {p1}, Lc/a/a/a/m2/m0;->z0(Landroid/os/Parcel;)Z

    move-result v0

    iput-boolean v0, p0, Lc/a/a/a/l2/f$c;->J:Z

    .line 61
    invoke-static {p1}, Lc/a/a/a/m2/m0;->z0(Landroid/os/Parcel;)Z

    move-result v0

    iput-boolean v0, p0, Lc/a/a/a/l2/f$c;->K:Z

    .line 62
    invoke-static {p1}, Lc/a/a/a/m2/m0;->z0(Landroid/os/Parcel;)Z

    move-result v0

    iput-boolean v0, p0, Lc/a/a/a/l2/f$c;->L:Z

    .line 63
    invoke-static {p1}, Lc/a/a/a/l2/f$c;->s(Landroid/os/Parcel;)Landroid/util/SparseArray;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/l2/f$c;->M:Landroid/util/SparseArray;

    .line 64
    invoke-virtual {p1}, Landroid/os/Parcel;->readSparseBooleanArray()Landroid/util/SparseBooleanArray;

    move-result-object p1

    invoke-static {p1}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/util/SparseBooleanArray;

    iput-object p1, p0, Lc/a/a/a/l2/f$c;->N:Landroid/util/SparseBooleanArray;

    return-void
.end method

.method private static l(Landroid/util/SparseBooleanArray;Landroid/util/SparseBooleanArray;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/util/SparseBooleanArray;->size()I

    move-result v0

    .line 2
    invoke-virtual {p1}, Landroid/util/SparseBooleanArray;->size()I

    move-result v1

    const/4 v2, 0x0

    if-eq v1, v0, :cond_0

    return v2

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 3
    invoke-virtual {p0, v1}, Landroid/util/SparseBooleanArray;->keyAt(I)I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/util/SparseBooleanArray;->indexOfKey(I)I

    move-result v3

    if-gez v3, :cond_1

    return v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method private static m(Landroid/util/SparseArray;Landroid/util/SparseArray;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Ljava/util/Map<",
            "Lc/a/a/a/j2/q0;",
            "Lc/a/a/a/l2/f$e;",
            ">;>;",
            "Landroid/util/SparseArray<",
            "Ljava/util/Map<",
            "Lc/a/a/a/j2/q0;",
            "Lc/a/a/a/l2/f$e;",
            ">;>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    move-result v0

    .line 2
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v1

    const/4 v2, 0x0

    if-eq v1, v0, :cond_0

    return v2

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    .line 3
    invoke-virtual {p0, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v3

    if-ltz v3, :cond_2

    .line 4
    invoke-virtual {p0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    invoke-virtual {p1, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    .line 5
    invoke-static {v4, v3}, Lc/a/a/a/l2/f$c;->n(Ljava/util/Map;Ljava/util/Map;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v2

    :cond_3
    const/4 p0, 0x1

    return p0
.end method

.method private static n(Ljava/util/Map;Ljava/util/Map;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lc/a/a/a/j2/q0;",
            "Lc/a/a/a/l2/f$e;",
            ">;",
            "Ljava/util/Map<",
            "Lc/a/a/a/j2/q0;",
            "Lc/a/a/a/l2/f$e;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    .line 2
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    const/4 v2, 0x0

    if-eq v1, v0, :cond_0

    return v2

    .line 3
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 4
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/j2/q0;

    .line 5
    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_2
    return v2

    :cond_3
    const/4 p0, 0x1

    return p0
.end method

.method public static o(Landroid/content/Context;)Lc/a/a/a/l2/f$c;
    .locals 1

    .line 1
    new-instance v0, Lc/a/a/a/l2/f$d;

    invoke-direct {v0, p0}, Lc/a/a/a/l2/f$d;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lc/a/a/a/l2/f$d;->d()Lc/a/a/a/l2/f$c;

    move-result-object p0

    return-object p0
.end method

.method private static s(Landroid/os/Parcel;)Landroid/util/SparseArray;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            ")",
            "Landroid/util/SparseArray<",
            "Ljava/util/Map<",
            "Lc/a/a/a/j2/q0;",
            "Lc/a/a/a/l2/f$e;",
            ">;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 2
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1, v0}, Landroid/util/SparseArray;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_1

    .line 3
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    .line 4
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    .line 5
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6, v5}, Ljava/util/HashMap;-><init>(I)V

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v5, :cond_0

    .line 6
    const-class v8, Lc/a/a/a/j2/q0;

    .line 7
    invoke-virtual {v8}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v8

    invoke-virtual {p0, v8}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v8

    check-cast v8, Lc/a/a/a/j2/q0;

    invoke-static {v8}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lc/a/a/a/j2/q0;

    .line 8
    const-class v9, Lc/a/a/a/l2/f$e;

    invoke-virtual {v9}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v9

    invoke-virtual {p0, v9}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v9

    check-cast v9, Lc/a/a/a/l2/f$e;

    .line 9
    invoke-interface {v6, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 10
    :cond_0
    invoke-virtual {v1, v4, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method private static t(Landroid/os/Parcel;Landroid/util/SparseArray;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            "Landroid/util/SparseArray<",
            "Ljava/util/Map<",
            "Lc/a/a/a/j2/q0;",
            "Lc/a/a/a/l2/f$e;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    .line 2
    invoke-virtual {p0, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 3
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    .line 4
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    .line 5
    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v5

    .line 6
    invoke-virtual {p0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 7
    invoke-virtual {p0, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 8
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 9
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/os/Parcelable;

    invoke-virtual {p0, v5, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 10
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/Parcelable;

    invoke-virtual {p0, v4, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 1
    const-class v2, Lc/a/a/a/l2/f$c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_1

    .line 2
    :cond_1
    move-object v2, p1

    check-cast v2, Lc/a/a/a/l2/f$c;

    .line 3
    invoke-super {p0, p1}, Lc/a/a/a/l2/m;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget p1, p0, Lc/a/a/a/l2/f$c;->j:I

    iget v3, v2, Lc/a/a/a/l2/f$c;->j:I

    if-ne p1, v3, :cond_2

    iget p1, p0, Lc/a/a/a/l2/f$c;->k:I

    iget v3, v2, Lc/a/a/a/l2/f$c;->k:I

    if-ne p1, v3, :cond_2

    iget p1, p0, Lc/a/a/a/l2/f$c;->l:I

    iget v3, v2, Lc/a/a/a/l2/f$c;->l:I

    if-ne p1, v3, :cond_2

    iget p1, p0, Lc/a/a/a/l2/f$c;->m:I

    iget v3, v2, Lc/a/a/a/l2/f$c;->m:I

    if-ne p1, v3, :cond_2

    iget p1, p0, Lc/a/a/a/l2/f$c;->n:I

    iget v3, v2, Lc/a/a/a/l2/f$c;->n:I

    if-ne p1, v3, :cond_2

    iget p1, p0, Lc/a/a/a/l2/f$c;->o:I

    iget v3, v2, Lc/a/a/a/l2/f$c;->o:I

    if-ne p1, v3, :cond_2

    iget p1, p0, Lc/a/a/a/l2/f$c;->p:I

    iget v3, v2, Lc/a/a/a/l2/f$c;->p:I

    if-ne p1, v3, :cond_2

    iget p1, p0, Lc/a/a/a/l2/f$c;->q:I

    iget v3, v2, Lc/a/a/a/l2/f$c;->q:I

    if-ne p1, v3, :cond_2

    iget-boolean p1, p0, Lc/a/a/a/l2/f$c;->r:Z

    iget-boolean v3, v2, Lc/a/a/a/l2/f$c;->r:Z

    if-ne p1, v3, :cond_2

    iget-boolean p1, p0, Lc/a/a/a/l2/f$c;->s:Z

    iget-boolean v3, v2, Lc/a/a/a/l2/f$c;->s:Z

    if-ne p1, v3, :cond_2

    iget-boolean p1, p0, Lc/a/a/a/l2/f$c;->t:Z

    iget-boolean v3, v2, Lc/a/a/a/l2/f$c;->t:Z

    if-ne p1, v3, :cond_2

    iget-boolean p1, p0, Lc/a/a/a/l2/f$c;->w:Z

    iget-boolean v3, v2, Lc/a/a/a/l2/f$c;->w:Z

    if-ne p1, v3, :cond_2

    iget p1, p0, Lc/a/a/a/l2/f$c;->u:I

    iget v3, v2, Lc/a/a/a/l2/f$c;->u:I

    if-ne p1, v3, :cond_2

    iget p1, p0, Lc/a/a/a/l2/f$c;->v:I

    iget v3, v2, Lc/a/a/a/l2/f$c;->v:I

    if-ne p1, v3, :cond_2

    iget-object p1, p0, Lc/a/a/a/l2/f$c;->x:Lc/a/b/b/r;

    iget-object v3, v2, Lc/a/a/a/l2/f$c;->x:Lc/a/b/b/r;

    .line 4
    invoke-virtual {p1, v3}, Lc/a/b/b/r;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget p1, p0, Lc/a/a/a/l2/f$c;->y:I

    iget v3, v2, Lc/a/a/a/l2/f$c;->y:I

    if-ne p1, v3, :cond_2

    iget p1, p0, Lc/a/a/a/l2/f$c;->z:I

    iget v3, v2, Lc/a/a/a/l2/f$c;->z:I

    if-ne p1, v3, :cond_2

    iget-boolean p1, p0, Lc/a/a/a/l2/f$c;->A:Z

    iget-boolean v3, v2, Lc/a/a/a/l2/f$c;->A:Z

    if-ne p1, v3, :cond_2

    iget-boolean p1, p0, Lc/a/a/a/l2/f$c;->B:Z

    iget-boolean v3, v2, Lc/a/a/a/l2/f$c;->B:Z

    if-ne p1, v3, :cond_2

    iget-boolean p1, p0, Lc/a/a/a/l2/f$c;->C:Z

    iget-boolean v3, v2, Lc/a/a/a/l2/f$c;->C:Z

    if-ne p1, v3, :cond_2

    iget-boolean p1, p0, Lc/a/a/a/l2/f$c;->D:Z

    iget-boolean v3, v2, Lc/a/a/a/l2/f$c;->D:Z

    if-ne p1, v3, :cond_2

    iget-object p1, p0, Lc/a/a/a/l2/f$c;->G:Lc/a/b/b/r;

    iget-object v3, v2, Lc/a/a/a/l2/f$c;->G:Lc/a/b/b/r;

    .line 5
    invoke-virtual {p1, v3}, Lc/a/b/b/r;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lc/a/a/a/l2/f$c;->H:Z

    iget-boolean v3, v2, Lc/a/a/a/l2/f$c;->H:Z

    if-ne p1, v3, :cond_2

    iget-boolean p1, p0, Lc/a/a/a/l2/f$c;->I:Z

    iget-boolean v3, v2, Lc/a/a/a/l2/f$c;->I:Z

    if-ne p1, v3, :cond_2

    iget-boolean p1, p0, Lc/a/a/a/l2/f$c;->J:Z

    iget-boolean v3, v2, Lc/a/a/a/l2/f$c;->J:Z

    if-ne p1, v3, :cond_2

    iget-boolean p1, p0, Lc/a/a/a/l2/f$c;->K:Z

    iget-boolean v3, v2, Lc/a/a/a/l2/f$c;->K:Z

    if-ne p1, v3, :cond_2

    iget-boolean p1, p0, Lc/a/a/a/l2/f$c;->L:Z

    iget-boolean v3, v2, Lc/a/a/a/l2/f$c;->L:Z

    if-ne p1, v3, :cond_2

    iget-object p1, p0, Lc/a/a/a/l2/f$c;->N:Landroid/util/SparseBooleanArray;

    iget-object v3, v2, Lc/a/a/a/l2/f$c;->N:Landroid/util/SparseBooleanArray;

    .line 6
    invoke-static {p1, v3}, Lc/a/a/a/l2/f$c;->l(Landroid/util/SparseBooleanArray;Landroid/util/SparseBooleanArray;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lc/a/a/a/l2/f$c;->M:Landroid/util/SparseArray;

    iget-object v2, v2, Lc/a/a/a/l2/f$c;->M:Landroid/util/SparseArray;

    .line 7
    invoke-static {p1, v2}, Lc/a/a/a/l2/f$c;->m(Landroid/util/SparseArray;Landroid/util/SparseArray;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    .line 1
    invoke-super {p0}, Lc/a/a/a/l2/m;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 2
    iget v1, p0, Lc/a/a/a/l2/f$c;->j:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 3
    iget v1, p0, Lc/a/a/a/l2/f$c;->k:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 4
    iget v1, p0, Lc/a/a/a/l2/f$c;->l:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 5
    iget v1, p0, Lc/a/a/a/l2/f$c;->m:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 6
    iget v1, p0, Lc/a/a/a/l2/f$c;->n:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 7
    iget v1, p0, Lc/a/a/a/l2/f$c;->o:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 8
    iget v1, p0, Lc/a/a/a/l2/f$c;->p:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 9
    iget v1, p0, Lc/a/a/a/l2/f$c;->q:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 10
    iget-boolean v1, p0, Lc/a/a/a/l2/f$c;->r:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 11
    iget-boolean v1, p0, Lc/a/a/a/l2/f$c;->s:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 12
    iget-boolean v1, p0, Lc/a/a/a/l2/f$c;->t:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 13
    iget-boolean v1, p0, Lc/a/a/a/l2/f$c;->w:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 14
    iget v1, p0, Lc/a/a/a/l2/f$c;->u:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 15
    iget v1, p0, Lc/a/a/a/l2/f$c;->v:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 16
    iget-object v1, p0, Lc/a/a/a/l2/f$c;->x:Lc/a/b/b/r;

    invoke-virtual {v1}, Lc/a/b/b/r;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 17
    iget v1, p0, Lc/a/a/a/l2/f$c;->y:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 18
    iget v1, p0, Lc/a/a/a/l2/f$c;->z:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 19
    iget-boolean v1, p0, Lc/a/a/a/l2/f$c;->A:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 20
    iget-boolean v1, p0, Lc/a/a/a/l2/f$c;->B:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 21
    iget-boolean v1, p0, Lc/a/a/a/l2/f$c;->C:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 22
    iget-boolean v1, p0, Lc/a/a/a/l2/f$c;->D:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 23
    iget-object v1, p0, Lc/a/a/a/l2/f$c;->G:Lc/a/b/b/r;

    invoke-virtual {v1}, Lc/a/b/b/r;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 24
    iget-boolean v1, p0, Lc/a/a/a/l2/f$c;->H:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 25
    iget-boolean v1, p0, Lc/a/a/a/l2/f$c;->I:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 26
    iget-boolean v1, p0, Lc/a/a/a/l2/f$c;->J:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 27
    iget-boolean v1, p0, Lc/a/a/a/l2/f$c;->K:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 28
    iget-boolean v1, p0, Lc/a/a/a/l2/f$c;->L:Z

    add-int/2addr v0, v1

    return v0
.end method

.method public final p(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/l2/f$c;->N:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result p1

    return p1
.end method

.method public final q(ILc/a/a/a/j2/q0;)Lc/a/a/a/l2/f$e;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/l2/f$c;->M:Landroid/util/SparseArray;

    .line 2
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_0

    .line 3
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/l2/f$e;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final r(ILc/a/a/a/j2/q0;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/l2/f$c;->M:Landroid/util/SparseArray;

    .line 2
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_0

    .line 3
    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lc/a/a/a/l2/m;->writeToParcel(Landroid/os/Parcel;I)V

    .line 2
    iget p2, p0, Lc/a/a/a/l2/f$c;->j:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3
    iget p2, p0, Lc/a/a/a/l2/f$c;->k:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    iget p2, p0, Lc/a/a/a/l2/f$c;->l:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 5
    iget p2, p0, Lc/a/a/a/l2/f$c;->m:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 6
    iget p2, p0, Lc/a/a/a/l2/f$c;->n:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 7
    iget p2, p0, Lc/a/a/a/l2/f$c;->o:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 8
    iget p2, p0, Lc/a/a/a/l2/f$c;->p:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 9
    iget p2, p0, Lc/a/a/a/l2/f$c;->q:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 10
    iget-boolean p2, p0, Lc/a/a/a/l2/f$c;->r:Z

    invoke-static {p1, p2}, Lc/a/a/a/m2/m0;->N0(Landroid/os/Parcel;Z)V

    .line 11
    iget-boolean p2, p0, Lc/a/a/a/l2/f$c;->s:Z

    invoke-static {p1, p2}, Lc/a/a/a/m2/m0;->N0(Landroid/os/Parcel;Z)V

    .line 12
    iget-boolean p2, p0, Lc/a/a/a/l2/f$c;->t:Z

    invoke-static {p1, p2}, Lc/a/a/a/m2/m0;->N0(Landroid/os/Parcel;Z)V

    .line 13
    iget p2, p0, Lc/a/a/a/l2/f$c;->u:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 14
    iget p2, p0, Lc/a/a/a/l2/f$c;->v:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    iget-boolean p2, p0, Lc/a/a/a/l2/f$c;->w:Z

    invoke-static {p1, p2}, Lc/a/a/a/m2/m0;->N0(Landroid/os/Parcel;Z)V

    .line 16
    iget-object p2, p0, Lc/a/a/a/l2/f$c;->x:Lc/a/b/b/r;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 17
    iget p2, p0, Lc/a/a/a/l2/f$c;->y:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 18
    iget p2, p0, Lc/a/a/a/l2/f$c;->z:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 19
    iget-boolean p2, p0, Lc/a/a/a/l2/f$c;->A:Z

    invoke-static {p1, p2}, Lc/a/a/a/m2/m0;->N0(Landroid/os/Parcel;Z)V

    .line 20
    iget-boolean p2, p0, Lc/a/a/a/l2/f$c;->B:Z

    invoke-static {p1, p2}, Lc/a/a/a/m2/m0;->N0(Landroid/os/Parcel;Z)V

    .line 21
    iget-boolean p2, p0, Lc/a/a/a/l2/f$c;->C:Z

    invoke-static {p1, p2}, Lc/a/a/a/m2/m0;->N0(Landroid/os/Parcel;Z)V

    .line 22
    iget-boolean p2, p0, Lc/a/a/a/l2/f$c;->D:Z

    invoke-static {p1, p2}, Lc/a/a/a/m2/m0;->N0(Landroid/os/Parcel;Z)V

    .line 23
    iget-object p2, p0, Lc/a/a/a/l2/f$c;->G:Lc/a/b/b/r;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 24
    iget-boolean p2, p0, Lc/a/a/a/l2/f$c;->H:Z

    invoke-static {p1, p2}, Lc/a/a/a/m2/m0;->N0(Landroid/os/Parcel;Z)V

    .line 25
    iget-boolean p2, p0, Lc/a/a/a/l2/f$c;->I:Z

    invoke-static {p1, p2}, Lc/a/a/a/m2/m0;->N0(Landroid/os/Parcel;Z)V

    .line 26
    iget-boolean p2, p0, Lc/a/a/a/l2/f$c;->J:Z

    invoke-static {p1, p2}, Lc/a/a/a/m2/m0;->N0(Landroid/os/Parcel;Z)V

    .line 27
    iget-boolean p2, p0, Lc/a/a/a/l2/f$c;->K:Z

    invoke-static {p1, p2}, Lc/a/a/a/m2/m0;->N0(Landroid/os/Parcel;Z)V

    .line 28
    iget-boolean p2, p0, Lc/a/a/a/l2/f$c;->L:Z

    invoke-static {p1, p2}, Lc/a/a/a/m2/m0;->N0(Landroid/os/Parcel;Z)V

    .line 29
    iget-object p2, p0, Lc/a/a/a/l2/f$c;->M:Landroid/util/SparseArray;

    invoke-static {p1, p2}, Lc/a/a/a/l2/f$c;->t(Landroid/os/Parcel;Landroid/util/SparseArray;)V

    .line 30
    iget-object p2, p0, Lc/a/a/a/l2/f$c;->N:Landroid/util/SparseBooleanArray;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSparseBooleanArray(Landroid/util/SparseBooleanArray;)V

    return-void
.end method
