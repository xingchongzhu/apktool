.class public final Lcom/tv91/u/c/i/z$a;
.super Lcom/tv91/x/c;
.source "MoviesByActorFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/c/i/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/tv91/u/c/i/z$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:I

.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/c/i/z$a$a;

    invoke-direct {v0}, Lcom/tv91/u/c/i/z$a$a;-><init>()V

    sput-object v0, Lcom/tv91/u/c/i/z$a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    const-string v0, "\u5973\u512a\u5f71\u7247\u6e05\u55ae\u9801\u9762"

    .line 2
    invoke-direct {p0, v0}, Lcom/tv91/x/c;-><init>(Ljava/lang/String;)V

    .line 3
    iput p1, p0, Lcom/tv91/u/c/i/z$a;->b:I

    .line 4
    iput-object p2, p0, Lcom/tv91/u/c/i/z$a;->c:Ljava/lang/String;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 5
    invoke-direct {p0, p1}, Lcom/tv91/x/c;-><init>(Landroid/os/Parcel;)V

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/tv91/u/c/i/z$a;->b:I

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/c/i/z$a;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/tv91/model/Actor;)V
    .locals 1

    .line 1
    iget v0, p1, Lcom/tv91/model/Actor;->id:I

    iget-object p1, p1, Lcom/tv91/model/Actor;->name:Ljava/lang/String;

    invoke-direct {p0, v0, p1}, Lcom/tv91/u/c/i/z$a;-><init>(ILjava/lang/String;)V

    return-void
.end method

.method static synthetic r(Lcom/tv91/u/c/i/z$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tv91/u/c/i/z$a;->b:I

    return p0
.end method

.method static synthetic s(Lcom/tv91/u/c/i/z$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/u/c/i/z$a;->c:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method protected n()Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/c/i/z;

    invoke-direct {v0}, Lcom/tv91/u/c/i/z;-><init>()V

    return-object v0
.end method

.method public o(Landroidx/fragment/app/x;Z)V
    .locals 1

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    const p2, 0x7f01001c

    .line 1
    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/x;->r(II)Landroidx/fragment/app/x;

    goto :goto_0

    :cond_0
    const p2, 0x7f010021

    .line 2
    invoke-virtual {p1, v0, p2}, Landroidx/fragment/app/x;->r(II)Landroidx/fragment/app/x;

    :goto_0
    return-void
.end method

.method public p(Landroidx/fragment/app/x;Z)V
    .locals 1

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    const p2, 0x7f01001e

    .line 1
    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/x;->r(II)Landroidx/fragment/app/x;

    goto :goto_0

    :cond_0
    const p2, 0x7f01001f

    .line 2
    invoke-virtual {p1, v0, p2}, Landroidx/fragment/app/x;->r(II)Landroidx/fragment/app/x;

    :goto_0
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/tv91/x/c;->writeToParcel(Landroid/os/Parcel;I)V

    .line 2
    iget p2, p0, Lcom/tv91/u/c/i/z$a;->b:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3
    iget-object p2, p0, Lcom/tv91/u/c/i/z$a;->c:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
