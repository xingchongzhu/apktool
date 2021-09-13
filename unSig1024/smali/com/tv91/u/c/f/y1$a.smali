.class public final Lcom/tv91/u/c/f/y1$a;
.super Lcom/tv91/x/c;
.source "MovieFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/c/f/y1;
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
            "Lcom/tv91/u/c/f/y1$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:I

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/c/f/y1$a$a;

    invoke-direct {v0}, Lcom/tv91/u/c/f/y1$a$a;-><init>()V

    sput-object v0, Lcom/tv91/u/c/f/y1$a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u5f71\u7247\u8a73\u7d30\u8cc7\u6599\u9801\u9762 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/tv91/x/c;-><init>(Ljava/lang/String;)V

    .line 2
    iput p1, p0, Lcom/tv91/u/c/f/y1$a;->b:I

    .line 3
    iput p2, p0, Lcom/tv91/u/c/f/y1$a;->c:I

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 4
    invoke-direct {p0, p1}, Lcom/tv91/x/c;-><init>(Landroid/os/Parcel;)V

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/tv91/u/c/f/y1$a;->b:I

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/tv91/u/c/f/y1$a;->c:I

    return-void
.end method


# virtual methods
.method protected n()Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/c/f/y1;

    invoke-direct {v0}, Lcom/tv91/u/c/f/y1;-><init>()V

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
    const p2, 0x7f010020

    .line 2
    invoke-virtual {p1, v0, p2}, Landroidx/fragment/app/x;->r(II)Landroidx/fragment/app/x;

    :goto_0
    return-void
.end method

.method public p(Landroidx/fragment/app/x;Z)V
    .locals 1

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    const p2, 0x7f01001d

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
    iget p2, p0, Lcom/tv91/u/c/f/y1$a;->b:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3
    iget p2, p0, Lcom/tv91/u/c/f/y1$a;->c:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
