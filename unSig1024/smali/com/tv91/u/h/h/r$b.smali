.class public final Lcom/tv91/u/h/h/r$b;
.super Lcom/tv91/x/c;
.source "HistoryFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/h/h/r;
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
            "Lcom/tv91/u/h/h/r$b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Lcom/tv91/u/h/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/h/h/r$b$a;

    invoke-direct {v0}, Lcom/tv91/u/h/h/r$b$a;-><init>()V

    sput-object v0, Lcom/tv91/u/h/h/r$b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/tv91/x/c;-><init>(Landroid/os/Parcel;)V

    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tv91/u/h/c;->valueOf(Ljava/lang/String;)Lcom/tv91/u/h/c;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/h/h/r$b;->b:Lcom/tv91/u/h/c;

    return-void
.end method

.method public constructor <init>(Lcom/tv91/u/h/c;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/tv91/u/h/h/r$b;->r(Lcom/tv91/u/h/c;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/tv91/x/c;-><init>(Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/u/h/h/r$b;->b:Lcom/tv91/u/h/c;

    return-void
.end method

.method private static r(Lcom/tv91/u/h/c;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/tv91/u/h/h/r$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    .line 2
    const-class p0, Lcom/tv91/u/h/h/r;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "\u5132\u503c\u7d00\u9304\u9801\u9762"

    return-object p0

    :cond_1
    const-string p0, "\u8cfc\u8cb7\u5176\u4ed6\u5f71\u7247\u8a18\u9304\u9801\u9762"

    return-object p0

    :cond_2
    const-string p0, "\u8cfc\u8cb7\u5f71\u7247\u8a18\u9304\u9801\u9762"

    return-object p0
.end method


# virtual methods
.method protected n()Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/h/h/r;

    invoke-direct {v0}, Lcom/tv91/u/h/h/r;-><init>()V

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
    iget-object p2, p0, Lcom/tv91/u/h/h/r$b;->b:Lcom/tv91/u/h/c;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
