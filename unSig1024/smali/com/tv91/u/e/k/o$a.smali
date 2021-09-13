.class public final Lcom/tv91/u/e/k/o$a;
.super Lcom/tv91/x/c;
.source "PromotionWithdrawFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/e/k/o;
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
            "Lcom/tv91/u/e/k/o$a;",
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
    new-instance v0, Lcom/tv91/u/e/k/o$a$a;

    invoke-direct {v0}, Lcom/tv91/u/e/k/o$a$a;-><init>()V

    sput-object v0, Lcom/tv91/u/e/k/o$a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const-string v0, "\u63d0\u9818\u9801\u9762"

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/x/c;-><init>(Ljava/lang/String;)V

    .line 2
    iput p1, p0, Lcom/tv91/u/e/k/o$a;->b:I

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/tv91/x/c;-><init>(Landroid/os/Parcel;)V

    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/tv91/u/e/k/o$a;->b:I

    return-void
.end method


# virtual methods
.method protected n()Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/e/k/o;

    invoke-direct {v0}, Lcom/tv91/u/e/k/o;-><init>()V

    return-object v0
.end method

.method public o(Landroidx/fragment/app/x;Z)V
    .locals 1

    const/4 p2, 0x0

    const v0, 0x7f010021

    .line 1
    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/x;->r(II)Landroidx/fragment/app/x;

    return-void
.end method

.method public p(Landroidx/fragment/app/x;Z)V
    .locals 1

    const p2, 0x7f01001e

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/x;->r(II)Landroidx/fragment/app/x;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/tv91/x/c;->writeToParcel(Landroid/os/Parcel;I)V

    .line 2
    iget p2, p0, Lcom/tv91/u/e/k/o$a;->b:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
