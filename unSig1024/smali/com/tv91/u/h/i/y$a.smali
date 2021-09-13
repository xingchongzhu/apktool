.class public final Lcom/tv91/u/h/i/y$a;
.super Lcom/tv91/x/c;
.source "PaymentFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/h/i/y;
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
            "Lcom/tv91/u/h/i/y$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/h/i/y$a$a;

    invoke-direct {v0}, Lcom/tv91/u/h/i/y$a$a;-><init>()V

    sput-object v0, Lcom/tv91/u/h/i/y$a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const/16 v1, 0x78

    invoke-direct {p0, v1, v0}, Lcom/tv91/u/h/i/y$a;-><init>(ILjava/util/concurrent/TimeUnit;)V

    return-void
.end method

.method public constructor <init>(ILjava/util/concurrent/TimeUnit;)V
    .locals 3

    const-string v0, "\u5132\u503c\u9ede\u6578\u9801\u9762"

    .line 2
    invoke-direct {p0, v0}, Lcom/tv91/x/c;-><init>(Ljava/lang/String;)V

    .line 3
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2, p2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide p1

    long-to-int p2, p1

    iput p2, p0, Lcom/tv91/u/h/i/y$a;->b:I

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/tv91/x/c;-><init>(Landroid/os/Parcel;)V

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/tv91/u/h/i/y$a;->b:I

    return-void
.end method

.method static synthetic r(Lcom/tv91/u/h/i/y$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tv91/u/h/i/y$a;->b:I

    return p0
.end method


# virtual methods
.method protected n()Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/h/i/y;

    invoke-direct {v0}, Lcom/tv91/u/h/i/y;-><init>()V

    return-object v0
.end method

.method public o(Landroidx/fragment/app/x;Z)V
    .locals 1

    const/4 p2, 0x0

    const v0, 0x7f010020

    .line 1
    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/x;->r(II)Landroidx/fragment/app/x;

    return-void
.end method

.method public p(Landroidx/fragment/app/x;Z)V
    .locals 1

    const p2, 0x7f01001d

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
    iget p2, p0, Lcom/tv91/u/h/i/y$a;->b:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
