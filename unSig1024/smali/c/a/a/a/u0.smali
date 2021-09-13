.class public final Lc/a/a/a/u0;
.super Ljava/lang/Object;
.source "Format.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/u0$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc/a/a/a/u0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final A:I

.field public final B:I

.field public final C:I

.field public final D:I

.field public final G:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lc/a/a/a/e2/c0;",
            ">;"
        }
    .end annotation
.end field

.field private H:I

.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:Ljava/lang/String;

.field public final j:Lc/a/a/a/h2/a;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;

.field public final m:I

.field public final n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation
.end field

.field public final o:Lc/a/a/a/e2/t;

.field public final p:J

.field public final q:I

.field public final r:I

.field public final s:F

.field public final t:I

.field public final u:F

.field public final v:[B

.field public final w:I

.field public final x:Lc/a/a/a/n2/k;

.field public final y:I

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc/a/a/a/u0$a;

    invoke-direct {v0}, Lc/a/a/a/u0$a;-><init>()V

    sput-object v0, Lc/a/a/a/u0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/u0;->a:Ljava/lang/String;

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/u0;->b:Ljava/lang/String;

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/u0;->c:Ljava/lang/String;

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/a/u0;->d:I

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/a/u0;->e:I

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/a/u0;->f:I

    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lc/a/a/a/u0;->g:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    move v0, v1

    .line 44
    :cond_0
    iput v0, p0, Lc/a/a/a/u0;->h:I

    .line 45
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/u0;->i:Ljava/lang/String;

    .line 46
    const-class v0, Lc/a/a/a/h2/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lc/a/a/a/h2/a;

    iput-object v0, p0, Lc/a/a/a/u0;->j:Lc/a/a/a/h2/a;

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/u0;->k:Ljava/lang/String;

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/u0;->l:Ljava/lang/String;

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/a/u0;->m:I

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 51
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lc/a/a/a/u0;->n:Ljava/util/List;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 52
    iget-object v2, p0, Lc/a/a/a/u0;->n:Ljava/util/List;

    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v3

    invoke-static {v3}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 53
    :cond_1
    const-class v0, Lc/a/a/a/e2/t;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lc/a/a/a/e2/t;

    iput-object v0, p0, Lc/a/a/a/u0;->o:Lc/a/a/a/e2/t;

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v1

    iput-wide v1, p0, Lc/a/a/a/u0;->p:J

    .line 55
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lc/a/a/a/u0;->q:I

    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lc/a/a/a/u0;->r:I

    .line 57
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v1

    iput v1, p0, Lc/a/a/a/u0;->s:F

    .line 58
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lc/a/a/a/u0;->t:I

    .line 59
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v1

    iput v1, p0, Lc/a/a/a/u0;->u:F

    .line 60
    invoke-static {p1}, Lc/a/a/a/m2/m0;->z0(Landroid/os/Parcel;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 61
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v1

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    iput-object v1, p0, Lc/a/a/a/u0;->v:[B

    .line 62
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lc/a/a/a/u0;->w:I

    .line 63
    const-class v1, Lc/a/a/a/n2/k;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lc/a/a/a/n2/k;

    iput-object v1, p0, Lc/a/a/a/u0;->x:Lc/a/a/a/n2/k;

    .line 64
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lc/a/a/a/u0;->y:I

    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lc/a/a/a/u0;->z:I

    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lc/a/a/a/u0;->A:I

    .line 67
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lc/a/a/a/u0;->B:I

    .line 68
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lc/a/a/a/u0;->C:I

    .line 69
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lc/a/a/a/u0;->D:I

    if-eqz v0, :cond_3

    .line 70
    const-class v2, Lc/a/a/a/e2/l0;

    :cond_3
    iput-object v2, p0, Lc/a/a/a/u0;->G:Ljava/lang/Class;

    return-void
.end method

.method private constructor <init>(Lc/a/a/a/u0$b;)V
    .locals 5

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lc/a/a/a/u0$b;->a(Lc/a/a/a/u0$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/u0;->a:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lc/a/a/a/u0$b;->l(Lc/a/a/a/u0$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/u0;->b:Ljava/lang/String;

    .line 5
    invoke-static {p1}, Lc/a/a/a/u0$b;->w(Lc/a/a/a/u0$b;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc/a/a/a/m2/m0;->s0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/u0;->c:Ljava/lang/String;

    .line 6
    invoke-static {p1}, Lc/a/a/a/u0$b;->y(Lc/a/a/a/u0$b;)I

    move-result v0

    iput v0, p0, Lc/a/a/a/u0;->d:I

    .line 7
    invoke-static {p1}, Lc/a/a/a/u0$b;->z(Lc/a/a/a/u0$b;)I

    move-result v0

    iput v0, p0, Lc/a/a/a/u0;->e:I

    .line 8
    invoke-static {p1}, Lc/a/a/a/u0$b;->A(Lc/a/a/a/u0$b;)I

    move-result v0

    iput v0, p0, Lc/a/a/a/u0;->f:I

    .line 9
    invoke-static {p1}, Lc/a/a/a/u0$b;->B(Lc/a/a/a/u0$b;)I

    move-result v1

    iput v1, p0, Lc/a/a/a/u0;->g:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    move v0, v1

    .line 10
    :cond_0
    iput v0, p0, Lc/a/a/a/u0;->h:I

    .line 11
    invoke-static {p1}, Lc/a/a/a/u0$b;->C(Lc/a/a/a/u0$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/u0;->i:Ljava/lang/String;

    .line 12
    invoke-static {p1}, Lc/a/a/a/u0$b;->D(Lc/a/a/a/u0$b;)Lc/a/a/a/h2/a;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/u0;->j:Lc/a/a/a/h2/a;

    .line 13
    invoke-static {p1}, Lc/a/a/a/u0$b;->b(Lc/a/a/a/u0$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/u0;->k:Ljava/lang/String;

    .line 14
    invoke-static {p1}, Lc/a/a/a/u0$b;->c(Lc/a/a/a/u0$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/u0;->l:Ljava/lang/String;

    .line 15
    invoke-static {p1}, Lc/a/a/a/u0$b;->d(Lc/a/a/a/u0$b;)I

    move-result v0

    iput v0, p0, Lc/a/a/a/u0;->m:I

    .line 16
    invoke-static {p1}, Lc/a/a/a/u0$b;->e(Lc/a/a/a/u0$b;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lc/a/a/a/u0$b;->e(Lc/a/a/a/u0$b;)Ljava/util/List;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lc/a/a/a/u0;->n:Ljava/util/List;

    .line 17
    invoke-static {p1}, Lc/a/a/a/u0$b;->f(Lc/a/a/a/u0$b;)Lc/a/a/a/e2/t;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/u0;->o:Lc/a/a/a/e2/t;

    .line 18
    invoke-static {p1}, Lc/a/a/a/u0$b;->g(Lc/a/a/a/u0$b;)J

    move-result-wide v3

    iput-wide v3, p0, Lc/a/a/a/u0;->p:J

    .line 19
    invoke-static {p1}, Lc/a/a/a/u0$b;->h(Lc/a/a/a/u0$b;)I

    move-result v1

    iput v1, p0, Lc/a/a/a/u0;->q:I

    .line 20
    invoke-static {p1}, Lc/a/a/a/u0$b;->i(Lc/a/a/a/u0$b;)I

    move-result v1

    iput v1, p0, Lc/a/a/a/u0;->r:I

    .line 21
    invoke-static {p1}, Lc/a/a/a/u0$b;->j(Lc/a/a/a/u0$b;)F

    move-result v1

    iput v1, p0, Lc/a/a/a/u0;->s:F

    .line 22
    invoke-static {p1}, Lc/a/a/a/u0$b;->k(Lc/a/a/a/u0$b;)I

    move-result v1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_2

    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lc/a/a/a/u0$b;->k(Lc/a/a/a/u0$b;)I

    move-result v1

    :goto_1
    iput v1, p0, Lc/a/a/a/u0;->t:I

    .line 23
    invoke-static {p1}, Lc/a/a/a/u0$b;->m(Lc/a/a/a/u0$b;)F

    move-result v1

    const/high16 v4, -0x40800000    # -1.0f

    cmpl-float v1, v1, v4

    if-nez v1, :cond_3

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lc/a/a/a/u0$b;->m(Lc/a/a/a/u0$b;)F

    move-result v1

    :goto_2
    iput v1, p0, Lc/a/a/a/u0;->u:F

    .line 24
    invoke-static {p1}, Lc/a/a/a/u0$b;->n(Lc/a/a/a/u0$b;)[B

    move-result-object v1

    iput-object v1, p0, Lc/a/a/a/u0;->v:[B

    .line 25
    invoke-static {p1}, Lc/a/a/a/u0$b;->o(Lc/a/a/a/u0$b;)I

    move-result v1

    iput v1, p0, Lc/a/a/a/u0;->w:I

    .line 26
    invoke-static {p1}, Lc/a/a/a/u0$b;->p(Lc/a/a/a/u0$b;)Lc/a/a/a/n2/k;

    move-result-object v1

    iput-object v1, p0, Lc/a/a/a/u0;->x:Lc/a/a/a/n2/k;

    .line 27
    invoke-static {p1}, Lc/a/a/a/u0$b;->q(Lc/a/a/a/u0$b;)I

    move-result v1

    iput v1, p0, Lc/a/a/a/u0;->y:I

    .line 28
    invoke-static {p1}, Lc/a/a/a/u0$b;->r(Lc/a/a/a/u0$b;)I

    move-result v1

    iput v1, p0, Lc/a/a/a/u0;->z:I

    .line 29
    invoke-static {p1}, Lc/a/a/a/u0$b;->s(Lc/a/a/a/u0$b;)I

    move-result v1

    iput v1, p0, Lc/a/a/a/u0;->A:I

    .line 30
    invoke-static {p1}, Lc/a/a/a/u0$b;->t(Lc/a/a/a/u0$b;)I

    move-result v1

    if-ne v1, v2, :cond_4

    const/4 v1, 0x0

    goto :goto_3

    :cond_4
    invoke-static {p1}, Lc/a/a/a/u0$b;->t(Lc/a/a/a/u0$b;)I

    move-result v1

    :goto_3
    iput v1, p0, Lc/a/a/a/u0;->B:I

    .line 31
    invoke-static {p1}, Lc/a/a/a/u0$b;->u(Lc/a/a/a/u0$b;)I

    move-result v1

    if-ne v1, v2, :cond_5

    goto :goto_4

    :cond_5
    invoke-static {p1}, Lc/a/a/a/u0$b;->u(Lc/a/a/a/u0$b;)I

    move-result v3

    :goto_4
    iput v3, p0, Lc/a/a/a/u0;->C:I

    .line 32
    invoke-static {p1}, Lc/a/a/a/u0$b;->v(Lc/a/a/a/u0$b;)I

    move-result v1

    iput v1, p0, Lc/a/a/a/u0;->D:I

    .line 33
    invoke-static {p1}, Lc/a/a/a/u0$b;->x(Lc/a/a/a/u0$b;)Ljava/lang/Class;

    move-result-object v1

    if-nez v1, :cond_6

    if-eqz v0, :cond_6

    .line 34
    const-class p1, Lc/a/a/a/e2/l0;

    iput-object p1, p0, Lc/a/a/a/u0;->G:Ljava/lang/Class;

    goto :goto_5

    .line 35
    :cond_6
    invoke-static {p1}, Lc/a/a/a/u0$b;->x(Lc/a/a/a/u0$b;)Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/u0;->G:Ljava/lang/Class;

    :goto_5
    return-void
.end method

.method synthetic constructor <init>(Lc/a/a/a/u0$b;Lc/a/a/a/u0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lc/a/a/a/u0;-><init>(Lc/a/a/a/u0$b;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_4

    .line 1
    const-class v2, Lc/a/a/a/u0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_1

    .line 2
    :cond_1
    check-cast p1, Lc/a/a/a/u0;

    .line 3
    iget v2, p0, Lc/a/a/a/u0;->H:I

    if-eqz v2, :cond_2

    iget v3, p1, Lc/a/a/a/u0;->H:I

    if-eqz v3, :cond_2

    if-eq v2, v3, :cond_2

    return v1

    .line 4
    :cond_2
    iget v2, p0, Lc/a/a/a/u0;->d:I

    iget v3, p1, Lc/a/a/a/u0;->d:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lc/a/a/a/u0;->e:I

    iget v3, p1, Lc/a/a/a/u0;->e:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lc/a/a/a/u0;->f:I

    iget v3, p1, Lc/a/a/a/u0;->f:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lc/a/a/a/u0;->g:I

    iget v3, p1, Lc/a/a/a/u0;->g:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lc/a/a/a/u0;->m:I

    iget v3, p1, Lc/a/a/a/u0;->m:I

    if-ne v2, v3, :cond_3

    iget-wide v2, p0, Lc/a/a/a/u0;->p:J

    iget-wide v4, p1, Lc/a/a/a/u0;->p:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_3

    iget v2, p0, Lc/a/a/a/u0;->q:I

    iget v3, p1, Lc/a/a/a/u0;->q:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lc/a/a/a/u0;->r:I

    iget v3, p1, Lc/a/a/a/u0;->r:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lc/a/a/a/u0;->t:I

    iget v3, p1, Lc/a/a/a/u0;->t:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lc/a/a/a/u0;->w:I

    iget v3, p1, Lc/a/a/a/u0;->w:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lc/a/a/a/u0;->y:I

    iget v3, p1, Lc/a/a/a/u0;->y:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lc/a/a/a/u0;->z:I

    iget v3, p1, Lc/a/a/a/u0;->z:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lc/a/a/a/u0;->A:I

    iget v3, p1, Lc/a/a/a/u0;->A:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lc/a/a/a/u0;->B:I

    iget v3, p1, Lc/a/a/a/u0;->B:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lc/a/a/a/u0;->C:I

    iget v3, p1, Lc/a/a/a/u0;->C:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lc/a/a/a/u0;->D:I

    iget v3, p1, Lc/a/a/a/u0;->D:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lc/a/a/a/u0;->s:F

    iget v3, p1, Lc/a/a/a/u0;->s:F

    .line 5
    invoke-static {v2, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v2

    if-nez v2, :cond_3

    iget v2, p0, Lc/a/a/a/u0;->u:F

    iget v3, p1, Lc/a/a/a/u0;->u:F

    .line 6
    invoke-static {v2, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, Lc/a/a/a/u0;->G:Ljava/lang/Class;

    iget-object v3, p1, Lc/a/a/a/u0;->G:Ljava/lang/Class;

    .line 7
    invoke-static {v2, v3}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lc/a/a/a/u0;->a:Ljava/lang/String;

    iget-object v3, p1, Lc/a/a/a/u0;->a:Ljava/lang/String;

    .line 8
    invoke-static {v2, v3}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lc/a/a/a/u0;->b:Ljava/lang/String;

    iget-object v3, p1, Lc/a/a/a/u0;->b:Ljava/lang/String;

    .line 9
    invoke-static {v2, v3}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lc/a/a/a/u0;->i:Ljava/lang/String;

    iget-object v3, p1, Lc/a/a/a/u0;->i:Ljava/lang/String;

    .line 10
    invoke-static {v2, v3}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lc/a/a/a/u0;->k:Ljava/lang/String;

    iget-object v3, p1, Lc/a/a/a/u0;->k:Ljava/lang/String;

    .line 11
    invoke-static {v2, v3}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lc/a/a/a/u0;->l:Ljava/lang/String;

    iget-object v3, p1, Lc/a/a/a/u0;->l:Ljava/lang/String;

    .line 12
    invoke-static {v2, v3}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lc/a/a/a/u0;->c:Ljava/lang/String;

    iget-object v3, p1, Lc/a/a/a/u0;->c:Ljava/lang/String;

    .line 13
    invoke-static {v2, v3}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lc/a/a/a/u0;->v:[B

    iget-object v3, p1, Lc/a/a/a/u0;->v:[B

    .line 14
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lc/a/a/a/u0;->j:Lc/a/a/a/h2/a;

    iget-object v3, p1, Lc/a/a/a/u0;->j:Lc/a/a/a/h2/a;

    .line 15
    invoke-static {v2, v3}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lc/a/a/a/u0;->x:Lc/a/a/a/n2/k;

    iget-object v3, p1, Lc/a/a/a/u0;->x:Lc/a/a/a/n2/k;

    .line 16
    invoke-static {v2, v3}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lc/a/a/a/u0;->o:Lc/a/a/a/e2/t;

    iget-object v3, p1, Lc/a/a/a/u0;->o:Lc/a/a/a/e2/t;

    .line 17
    invoke-static {v2, v3}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 18
    invoke-virtual {p0, p1}, Lc/a/a/a/u0;->o(Lc/a/a/a/u0;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_4
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 5

    .line 1
    iget v0, p0, Lc/a/a/a/u0;->H:I

    if-nez v0, :cond_8

    const/16 v0, 0x20f

    .line 2
    iget-object v1, p0, Lc/a/a/a/u0;->a:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 3
    iget-object v1, p0, Lc/a/a/a/u0;->b:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 4
    iget-object v1, p0, Lc/a/a/a/u0;->c:Ljava/lang/String;

    if-nez v1, :cond_2

    const/4 v1, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 5
    iget v1, p0, Lc/a/a/a/u0;->d:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 6
    iget v1, p0, Lc/a/a/a/u0;->e:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 7
    iget v1, p0, Lc/a/a/a/u0;->f:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 8
    iget v1, p0, Lc/a/a/a/u0;->g:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 9
    iget-object v1, p0, Lc/a/a/a/u0;->i:Ljava/lang/String;

    if-nez v1, :cond_3

    const/4 v1, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 10
    iget-object v1, p0, Lc/a/a/a/u0;->j:Lc/a/a/a/h2/a;

    if-nez v1, :cond_4

    const/4 v1, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lc/a/a/a/h2/a;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 11
    iget-object v1, p0, Lc/a/a/a/u0;->k:Ljava/lang/String;

    if-nez v1, :cond_5

    const/4 v1, 0x0

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 12
    iget-object v1, p0, Lc/a/a/a/u0;->l:Ljava/lang/String;

    if-nez v1, :cond_6

    const/4 v1, 0x0

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 13
    iget v1, p0, Lc/a/a/a/u0;->m:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 14
    iget-wide v3, p0, Lc/a/a/a/u0;->p:J

    long-to-int v1, v3

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 15
    iget v1, p0, Lc/a/a/a/u0;->q:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 16
    iget v1, p0, Lc/a/a/a/u0;->r:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 17
    iget v1, p0, Lc/a/a/a/u0;->s:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 18
    iget v1, p0, Lc/a/a/a/u0;->t:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 19
    iget v1, p0, Lc/a/a/a/u0;->u:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 20
    iget v1, p0, Lc/a/a/a/u0;->w:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 21
    iget v1, p0, Lc/a/a/a/u0;->y:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 22
    iget v1, p0, Lc/a/a/a/u0;->z:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 23
    iget v1, p0, Lc/a/a/a/u0;->A:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 24
    iget v1, p0, Lc/a/a/a/u0;->B:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 25
    iget v1, p0, Lc/a/a/a/u0;->C:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 26
    iget v1, p0, Lc/a/a/a/u0;->D:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 27
    iget-object v1, p0, Lc/a/a/a/u0;->G:Ljava/lang/Class;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    .line 28
    iput v0, p0, Lc/a/a/a/u0;->H:I

    .line 29
    :cond_8
    iget v0, p0, Lc/a/a/a/u0;->H:I

    return v0
.end method

.method public l()Lc/a/a/a/u0$b;
    .locals 2

    .line 1
    new-instance v0, Lc/a/a/a/u0$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lc/a/a/a/u0$b;-><init>(Lc/a/a/a/u0;Lc/a/a/a/u0$a;)V

    return-object v0
.end method

.method public m(Ljava/lang/Class;)Lc/a/a/a/u0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lc/a/a/a/e2/c0;",
            ">;)",
            "Lc/a/a/a/u0;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/u0;->l()Lc/a/a/a/u0$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/a/a/a/u0$b;->O(Ljava/lang/Class;)Lc/a/a/a/u0$b;

    move-result-object p1

    invoke-virtual {p1}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object p1

    return-object p1
.end method

.method public n()I
    .locals 3

    .line 1
    iget v0, p0, Lc/a/a/a/u0;->q:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget v2, p0, Lc/a/a/a/u0;->r:I

    if-ne v2, v1, :cond_0

    goto :goto_0

    :cond_0
    mul-int v1, v0, v2

    :cond_1
    :goto_0
    return v1
.end method

.method public o(Lc/a/a/a/u0;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/u0;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p1, Lc/a/a/a/u0;->n:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lc/a/a/a/u0;->n:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 3
    iget-object v1, p0, Lc/a/a/a/u0;->n:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    iget-object v3, p1, Lc/a/a/a/u0;->n:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_1

    return v2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public p(Lc/a/a/a/u0;)Lc/a/a/a/u0;
    .locals 11

    if-ne p0, p1, :cond_0

    return-object p0

    .line 1
    :cond_0
    iget-object v0, p0, Lc/a/a/a/u0;->l:Ljava/lang/String;

    invoke-static {v0}, Lc/a/a/a/m2/w;->k(Ljava/lang/String;)I

    move-result v0

    .line 2
    iget-object v1, p1, Lc/a/a/a/u0;->a:Ljava/lang/String;

    .line 3
    iget-object v2, p1, Lc/a/a/a/u0;->b:Ljava/lang/String;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lc/a/a/a/u0;->b:Ljava/lang/String;

    .line 4
    :goto_0
    iget-object v3, p0, Lc/a/a/a/u0;->c:Ljava/lang/String;

    const/4 v4, 0x3

    const/4 v5, 0x1

    if-eq v0, v4, :cond_2

    if-ne v0, v5, :cond_3

    .line 5
    :cond_2
    iget-object v4, p1, Lc/a/a/a/u0;->c:Ljava/lang/String;

    if-eqz v4, :cond_3

    move-object v3, v4

    .line 6
    :cond_3
    iget v4, p0, Lc/a/a/a/u0;->f:I

    const/4 v6, -0x1

    if-ne v4, v6, :cond_4

    iget v4, p1, Lc/a/a/a/u0;->f:I

    .line 7
    :cond_4
    iget v7, p0, Lc/a/a/a/u0;->g:I

    if-ne v7, v6, :cond_5

    iget v7, p1, Lc/a/a/a/u0;->g:I

    .line 8
    :cond_5
    iget-object v6, p0, Lc/a/a/a/u0;->i:Ljava/lang/String;

    if-nez v6, :cond_6

    .line 9
    iget-object v8, p1, Lc/a/a/a/u0;->i:Ljava/lang/String;

    invoke-static {v8, v0}, Lc/a/a/a/m2/m0;->G(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v8

    .line 10
    invoke-static {v8}, Lc/a/a/a/m2/m0;->F0(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    array-length v9, v9

    if-ne v9, v5, :cond_6

    move-object v6, v8

    .line 11
    :cond_6
    iget-object v5, p0, Lc/a/a/a/u0;->j:Lc/a/a/a/h2/a;

    if-nez v5, :cond_7

    .line 12
    iget-object v5, p1, Lc/a/a/a/u0;->j:Lc/a/a/a/h2/a;

    goto :goto_1

    .line 13
    :cond_7
    iget-object v8, p1, Lc/a/a/a/u0;->j:Lc/a/a/a/h2/a;

    invoke-virtual {v5, v8}, Lc/a/a/a/h2/a;->m(Lc/a/a/a/h2/a;)Lc/a/a/a/h2/a;

    move-result-object v5

    .line 14
    :goto_1
    iget v8, p0, Lc/a/a/a/u0;->s:F

    const/high16 v9, -0x40800000    # -1.0f

    cmpl-float v9, v8, v9

    if-nez v9, :cond_8

    const/4 v9, 0x2

    if-ne v0, v9, :cond_8

    .line 15
    iget v8, p1, Lc/a/a/a/u0;->s:F

    .line 16
    :cond_8
    iget v0, p0, Lc/a/a/a/u0;->d:I

    iget v9, p1, Lc/a/a/a/u0;->d:I

    or-int/2addr v0, v9

    .line 17
    iget v9, p0, Lc/a/a/a/u0;->e:I

    iget v10, p1, Lc/a/a/a/u0;->e:I

    or-int/2addr v9, v10

    .line 18
    iget-object p1, p1, Lc/a/a/a/u0;->o:Lc/a/a/a/e2/t;

    iget-object v10, p0, Lc/a/a/a/u0;->o:Lc/a/a/a/e2/t;

    .line 19
    invoke-static {p1, v10}, Lc/a/a/a/e2/t;->o(Lc/a/a/a/e2/t;Lc/a/a/a/e2/t;)Lc/a/a/a/e2/t;

    move-result-object p1

    .line 20
    invoke-virtual {p0}, Lc/a/a/a/u0;->l()Lc/a/a/a/u0$b;

    move-result-object v10

    .line 21
    invoke-virtual {v10, v1}, Lc/a/a/a/u0$b;->S(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v1

    .line 22
    invoke-virtual {v1, v2}, Lc/a/a/a/u0$b;->U(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v1

    .line 23
    invoke-virtual {v1, v3}, Lc/a/a/a/u0$b;->V(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v1

    .line 24
    invoke-virtual {v1, v0}, Lc/a/a/a/u0$b;->g0(I)Lc/a/a/a/u0$b;

    move-result-object v0

    .line 25
    invoke-virtual {v0, v9}, Lc/a/a/a/u0$b;->c0(I)Lc/a/a/a/u0$b;

    move-result-object v0

    .line 26
    invoke-virtual {v0, v4}, Lc/a/a/a/u0$b;->G(I)Lc/a/a/a/u0$b;

    move-result-object v0

    .line 27
    invoke-virtual {v0, v7}, Lc/a/a/a/u0$b;->Z(I)Lc/a/a/a/u0$b;

    move-result-object v0

    .line 28
    invoke-virtual {v0, v6}, Lc/a/a/a/u0$b;->I(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v0

    .line 29
    invoke-virtual {v0, v5}, Lc/a/a/a/u0$b;->X(Lc/a/a/a/h2/a;)Lc/a/a/a/u0$b;

    move-result-object v0

    .line 30
    invoke-virtual {v0, p1}, Lc/a/a/a/u0$b;->L(Lc/a/a/a/e2/t;)Lc/a/a/a/u0$b;

    move-result-object p1

    .line 31
    invoke-virtual {p1, v8}, Lc/a/a/a/u0$b;->P(F)Lc/a/a/a/u0$b;

    move-result-object p1

    .line 32
    invoke-virtual {p1}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Format("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc/a/a/a/u0;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lc/a/a/a/u0;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lc/a/a/a/u0;->k:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lc/a/a/a/u0;->l:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lc/a/a/a/u0;->i:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lc/a/a/a/u0;->h:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lc/a/a/a/u0;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", ["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lc/a/a/a/u0;->q:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lc/a/a/a/u0;->r:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lc/a/a/a/u0;->s:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, "], ["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lc/a/a/a/u0;->y:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lc/a/a/a/u0;->z:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "])"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/u0;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/u0;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lc/a/a/a/u0;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 4
    iget v0, p0, Lc/a/a/a/u0;->d:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 5
    iget v0, p0, Lc/a/a/a/u0;->e:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 6
    iget v0, p0, Lc/a/a/a/u0;->f:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 7
    iget v0, p0, Lc/a/a/a/u0;->g:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 8
    iget-object v0, p0, Lc/a/a/a/u0;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lc/a/a/a/u0;->j:Lc/a/a/a/h2/a;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 10
    iget-object v0, p0, Lc/a/a/a/u0;->k:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lc/a/a/a/u0;->l:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 12
    iget v0, p0, Lc/a/a/a/u0;->m:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 13
    iget-object v0, p0, Lc/a/a/a/u0;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 14
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 15
    iget-object v3, p0, Lc/a/a/a/u0;->n:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeByteArray([B)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Lc/a/a/a/u0;->o:Lc/a/a/a/e2/t;

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 17
    iget-wide v2, p0, Lc/a/a/a/u0;->p:J

    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    .line 18
    iget v0, p0, Lc/a/a/a/u0;->q:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 19
    iget v0, p0, Lc/a/a/a/u0;->r:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 20
    iget v0, p0, Lc/a/a/a/u0;->s:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 21
    iget v0, p0, Lc/a/a/a/u0;->t:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 22
    iget v0, p0, Lc/a/a/a/u0;->u:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 23
    iget-object v0, p0, Lc/a/a/a/u0;->v:[B

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    invoke-static {p1, v1}, Lc/a/a/a/m2/m0;->N0(Landroid/os/Parcel;Z)V

    .line 24
    iget-object v0, p0, Lc/a/a/a/u0;->v:[B

    if-eqz v0, :cond_2

    .line 25
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 26
    :cond_2
    iget v0, p0, Lc/a/a/a/u0;->w:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 27
    iget-object v0, p0, Lc/a/a/a/u0;->x:Lc/a/a/a/n2/k;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 28
    iget p2, p0, Lc/a/a/a/u0;->y:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 29
    iget p2, p0, Lc/a/a/a/u0;->z:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 30
    iget p2, p0, Lc/a/a/a/u0;->A:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 31
    iget p2, p0, Lc/a/a/a/u0;->B:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 32
    iget p2, p0, Lc/a/a/a/u0;->C:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 33
    iget p2, p0, Lc/a/a/a/u0;->D:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
