.class public final Lcom/tv91/u/e/h/a;
.super Ljava/lang/Object;
.source "PromotionDetailModel.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/tv91/u/e/h/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/util/Date;

.field public c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/e/h/a$a;

    invoke-direct {v0}, Lcom/tv91/u/e/h/a$a;-><init>()V

    sput-object v0, Lcom/tv91/u/e/h/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/u/e/h/a;->a:Ljava/lang/String;

    .line 7
    invoke-static {p1}, Lcom/tv91/utils/e;->b(Landroid/os/Parcel;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/u/e/h/a;->b:Ljava/util/Date;

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/tv91/u/e/h/a;->c:I

    return-void
.end method

.method public constructor <init>(Lcom/tv91/model/PromotionDetail;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, Lcom/tv91/model/PromotionDetail;->name:Ljava/lang/String;

    iput-object v0, p0, Lcom/tv91/u/e/h/a;->a:Ljava/lang/String;

    .line 3
    iget-object v0, p1, Lcom/tv91/model/PromotionDetail;->date:Ljava/util/Date;

    iput-object v0, p0, Lcom/tv91/u/e/h/a;->b:Ljava/util/Date;

    .line 4
    iget p1, p1, Lcom/tv91/model/PromotionDetail;->effect:I

    iput p1, p0, Lcom/tv91/u/e/h/a;->c:I

    return-void
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
    iget-object p2, p0, Lcom/tv91/u/e/h/a;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 2
    iget-object p2, p0, Lcom/tv91/u/e/h/a;->b:Ljava/util/Date;

    invoke-static {p1, p2}, Lcom/tv91/utils/e;->d(Landroid/os/Parcel;Ljava/util/Date;)V

    .line 3
    iget p2, p0, Lcom/tv91/u/e/h/a;->c:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
