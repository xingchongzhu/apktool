.class public final Lc/a/a/b/n/a$b;
.super Ljava/lang/Object;
.source "BadgeDrawable.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/b/n/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc/a/a/b/n/a$b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:Ljava/lang/CharSequence;

.field private g:I

.field private h:I

.field private i:I

.field private j:Z

.field private k:I

.field private l:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc/a/a/b/n/a$b$a;

    invoke-direct {v0}, Lc/a/a/b/n/a$b$a;-><init>()V

    sput-object v0, Lc/a/a/b/n/a$b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xff

    .line 2
    iput v0, p0, Lc/a/a/b/n/a$b;->c:I

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lc/a/a/b/n/a$b;->d:I

    .line 4
    new-instance v0, Lc/a/a/b/z/d;

    sget v1, Lc/a/a/b/k;->c:I

    invoke-direct {v0, p1, v1}, Lc/a/a/b/z/d;-><init>(Landroid/content/Context;I)V

    .line 5
    iget-object v0, v0, Lc/a/a/b/z/d;->a:Landroid/content/res/ColorStateList;

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v0

    iput v0, p0, Lc/a/a/b/n/a$b;->b:I

    .line 6
    sget v0, Lc/a/a/b/j;->i:I

    .line 7
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/b/n/a$b;->f:Ljava/lang/CharSequence;

    .line 8
    sget p1, Lc/a/a/b/i;->a:I

    iput p1, p0, Lc/a/a/b/n/a$b;->g:I

    .line 9
    sget p1, Lc/a/a/b/j;->k:I

    iput p1, p0, Lc/a/a/b/n/a$b;->h:I

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lc/a/a/b/n/a$b;->j:Z

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xff

    .line 12
    iput v0, p0, Lc/a/a/b/n/a$b;->c:I

    const/4 v0, -0x1

    .line 13
    iput v0, p0, Lc/a/a/b/n/a$b;->d:I

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/b/n/a$b;->a:I

    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/b/n/a$b;->b:I

    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/b/n/a$b;->c:I

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/b/n/a$b;->d:I

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/b/n/a$b;->e:I

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/b/n/a$b;->f:Ljava/lang/CharSequence;

    .line 20
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/b/n/a$b;->g:I

    .line 21
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/b/n/a$b;->i:I

    .line 22
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/b/n/a$b;->k:I

    .line 23
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/a/a/b/n/a$b;->l:I

    .line 24
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lc/a/a/b/n/a$b;->j:Z

    return-void
.end method

.method static synthetic A(Lc/a/a/b/n/a$b;I)I
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/b/n/a$b;->c:I

    return p1
.end method

.method static synthetic B(Lc/a/a/b/n/a$b;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/b/n/a$b;->f:Ljava/lang/CharSequence;

    return-object p0
.end method

.method static synthetic l(Lc/a/a/b/n/a$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/b/n/a$b;->e:I

    return p0
.end method

.method static synthetic m(Lc/a/a/b/n/a$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/b/n/a$b;->g:I

    return p0
.end method

.method static synthetic n(Lc/a/a/b/n/a$b;I)I
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/b/n/a$b;->e:I

    return p1
.end method

.method static synthetic o(Lc/a/a/b/n/a$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/b/n/a$b;->h:I

    return p0
.end method

.method static synthetic p(Lc/a/a/b/n/a$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/b/n/a$b;->d:I

    return p0
.end method

.method static synthetic q(Lc/a/a/b/n/a$b;I)I
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/b/n/a$b;->d:I

    return p1
.end method

.method static synthetic r(Lc/a/a/b/n/a$b;I)I
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/b/n/a$b;->a:I

    return p1
.end method

.method static synthetic s(Lc/a/a/b/n/a$b;I)I
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/b/n/a$b;->b:I

    return p1
.end method

.method static synthetic t(Lc/a/a/b/n/a$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/b/n/a$b;->i:I

    return p0
.end method

.method static synthetic u(Lc/a/a/b/n/a$b;I)I
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/b/n/a$b;->i:I

    return p1
.end method

.method static synthetic v(Lc/a/a/b/n/a$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/b/n/a$b;->k:I

    return p0
.end method

.method static synthetic w(Lc/a/a/b/n/a$b;I)I
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/b/n/a$b;->k:I

    return p1
.end method

.method static synthetic x(Lc/a/a/b/n/a$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/b/n/a$b;->l:I

    return p0
.end method

.method static synthetic y(Lc/a/a/b/n/a$b;I)I
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/b/n/a$b;->l:I

    return p1
.end method

.method static synthetic z(Lc/a/a/b/n/a$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/b/n/a$b;->c:I

    return p0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    iget p2, p0, Lc/a/a/b/n/a$b;->a:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 2
    iget p2, p0, Lc/a/a/b/n/a$b;->b:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3
    iget p2, p0, Lc/a/a/b/n/a$b;->c:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    iget p2, p0, Lc/a/a/b/n/a$b;->d:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 5
    iget p2, p0, Lc/a/a/b/n/a$b;->e:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 6
    iget-object p2, p0, Lc/a/a/b/n/a$b;->f:Ljava/lang/CharSequence;

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 7
    iget p2, p0, Lc/a/a/b/n/a$b;->g:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 8
    iget p2, p0, Lc/a/a/b/n/a$b;->i:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 9
    iget p2, p0, Lc/a/a/b/n/a$b;->k:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 10
    iget p2, p0, Lc/a/a/b/n/a$b;->l:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 11
    iget-boolean p2, p0, Lc/a/a/b/n/a$b;->j:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
