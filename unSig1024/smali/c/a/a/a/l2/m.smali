.class public Lc/a/a/a/l2/m;
.super Ljava/lang/Object;
.source "TrackSelectionParameters.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/l2/m$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc/a/a/a/l2/m;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:Lc/a/a/a/l2/m;

.field public static final b:Lc/a/a/a/l2/m;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field public final c:Lc/a/b/b/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/b/r<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final d:I

.field public final e:Lc/a/b/b/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/b/r<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final f:I

.field public final g:Z

.field public final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc/a/a/a/l2/m$b;

    invoke-direct {v0}, Lc/a/a/a/l2/m$b;-><init>()V

    invoke-virtual {v0}, Lc/a/a/a/l2/m$b;->a()Lc/a/a/a/l2/m;

    move-result-object v0

    sput-object v0, Lc/a/a/a/l2/m;->a:Lc/a/a/a/l2/m;

    .line 2
    sput-object v0, Lc/a/a/a/l2/m;->b:Lc/a/a/a/l2/m;

    .line 3
    new-instance v0, Lc/a/a/a/l2/m$a;

    invoke-direct {v0}, Lc/a/a/a/l2/m$a;-><init>()V

    sput-object v0, Lc/a/a/a/l2/m;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 10
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 11
    invoke-static {v0}, Lc/a/b/b/r;->m(Ljava/util/Collection;)Lc/a/b/b/r;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/l2/m;->c:Lc/a/b/b/r;

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/a/l2/m;->d:I

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 15
    invoke-static {v0}, Lc/a/b/b/r;->m(Ljava/util/Collection;)Lc/a/b/b/r;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/l2/m;->e:Lc/a/b/b/r;

    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/a/l2/m;->f:I

    .line 17
    invoke-static {p1}, Lc/a/a/a/m2/m0;->z0(Landroid/os/Parcel;)Z

    move-result v0

    iput-boolean v0, p0, Lc/a/a/a/l2/m;->g:Z

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lc/a/a/a/l2/m;->h:I

    return-void
.end method

.method constructor <init>(Lc/a/b/b/r;ILc/a/b/b/r;IZI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/b/b/r<",
            "Ljava/lang/String;",
            ">;I",
            "Lc/a/b/b/r<",
            "Ljava/lang/String;",
            ">;IZI)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/l2/m;->c:Lc/a/b/b/r;

    .line 3
    iput p2, p0, Lc/a/a/a/l2/m;->d:I

    .line 4
    iput-object p3, p0, Lc/a/a/a/l2/m;->e:Lc/a/b/b/r;

    .line 5
    iput p4, p0, Lc/a/a/a/l2/m;->f:I

    .line 6
    iput-boolean p5, p0, Lc/a/a/a/l2/m;->g:Z

    .line 7
    iput p6, p0, Lc/a/a/a/l2/m;->h:I

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
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 2
    :cond_1
    check-cast p1, Lc/a/a/a/l2/m;

    .line 3
    iget-object v2, p0, Lc/a/a/a/l2/m;->c:Lc/a/b/b/r;

    iget-object v3, p1, Lc/a/a/a/l2/m;->c:Lc/a/b/b/r;

    invoke-virtual {v2, v3}, Lc/a/b/b/r;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Lc/a/a/a/l2/m;->d:I

    iget v3, p1, Lc/a/a/a/l2/m;->d:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lc/a/a/a/l2/m;->e:Lc/a/b/b/r;

    iget-object v3, p1, Lc/a/a/a/l2/m;->e:Lc/a/b/b/r;

    .line 4
    invoke-virtual {v2, v3}, Lc/a/b/b/r;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Lc/a/a/a/l2/m;->f:I

    iget v3, p1, Lc/a/a/a/l2/m;->f:I

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lc/a/a/a/l2/m;->g:Z

    iget-boolean v3, p1, Lc/a/a/a/l2/m;->g:Z

    if-ne v2, v3, :cond_2

    iget v2, p0, Lc/a/a/a/l2/m;->h:I

    iget p1, p1, Lc/a/a/a/l2/m;->h:I

    if-ne v2, p1, :cond_2

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
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/l2/m;->c:Lc/a/b/b/r;

    invoke-virtual {v0}, Lc/a/b/b/r;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 2
    iget v2, p0, Lc/a/a/a/l2/m;->d:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 3
    iget-object v2, p0, Lc/a/a/a/l2/m;->e:Lc/a/b/b/r;

    invoke-virtual {v2}, Lc/a/b/b/r;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 4
    iget v2, p0, Lc/a/a/a/l2/m;->f:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 5
    iget-boolean v2, p0, Lc/a/a/a/l2/m;->g:Z

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 6
    iget v1, p0, Lc/a/a/a/l2/m;->h:I

    add-int/2addr v0, v1

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    iget-object p2, p0, Lc/a/a/a/l2/m;->c:Lc/a/b/b/r;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 2
    iget p2, p0, Lc/a/a/a/l2/m;->d:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3
    iget-object p2, p0, Lc/a/a/a/l2/m;->e:Lc/a/b/b/r;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 4
    iget p2, p0, Lc/a/a/a/l2/m;->f:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 5
    iget-boolean p2, p0, Lc/a/a/a/l2/m;->g:Z

    invoke-static {p1, p2}, Lc/a/a/a/m2/m0;->N0(Landroid/os/Parcel;Z)V

    .line 6
    iget p2, p0, Lc/a/a/a/l2/m;->h:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
