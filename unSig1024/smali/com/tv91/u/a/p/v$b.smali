.class public final Lcom/tv91/u/a/p/v$b;
.super Lcom/tv91/x/c;
.source "ProfileFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/a/p/v;
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
            "Lcom/tv91/u/a/p/v$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/a/p/v$b$a;

    invoke-direct {v0}, Lcom/tv91/u/a/p/v$b$a;-><init>()V

    sput-object v0, Lcom/tv91/u/a/p/v$b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const-string v0, "\u6211\u7684"

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/x/c;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tv91/x/c;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method protected n()Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/a/p/v;

    invoke-direct {v0}, Lcom/tv91/u/a/p/v;-><init>()V

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