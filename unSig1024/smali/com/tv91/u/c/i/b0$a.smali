.class public final Lcom/tv91/u/c/i/b0$a;
.super Lcom/tv91/x/c;
.source "MoviesByChannelFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/c/i/b0;
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
            "Lcom/tv91/u/c/i/b0$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/c/i/b0$a$a;

    invoke-direct {v0}, Lcom/tv91/u/c/i/b0$a$a;-><init>()V

    sput-object v0, Lcom/tv91/u/c/i/b0$a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/tv91/x/c;-><init>(Landroid/os/Parcel;)V

    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/tv91/u/c/i/b0$a;->b:I

    return-void
.end method

.method public constructor <init>(Lcom/tv91/model/Channel;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/tv91/model/b;->value:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/tv91/x/c;-><init>(Ljava/lang/String;)V

    .line 2
    iget p1, p1, Lcom/tv91/model/b;->key:I

    iput p1, p0, Lcom/tv91/u/c/i/b0$a;->b:I

    return-void
.end method


# virtual methods
.method protected n()Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/c/i/b0;

    invoke-direct {v0}, Lcom/tv91/u/c/i/b0;-><init>()V

    return-object v0
.end method

.method public o(Landroidx/fragment/app/x;Z)V
    .locals 1

    if-eqz p2, :cond_0

    const p2, 0x7f01001c

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/x;->r(II)Landroidx/fragment/app/x;

    :cond_0
    return-void
.end method

.method public p(Landroidx/fragment/app/x;Z)V
    .locals 1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    const v0, 0x7f01001f

    .line 1
    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/x;->r(II)Landroidx/fragment/app/x;

    :cond_0
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/tv91/x/c;->writeToParcel(Landroid/os/Parcel;I)V

    .line 2
    iget p2, p0, Lcom/tv91/u/c/i/b0$a;->b:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
