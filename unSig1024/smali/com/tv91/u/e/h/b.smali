.class public final Lcom/tv91/u/e/h/b;
.super Ljava/lang/Object;
.source "PromotionReportModel.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/tv91/u/e/h/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:I

.field public d:I

.field public e:I

.field public f:Z

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tv91/u/e/h/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/e/h/b$a;

    invoke-direct {v0}, Lcom/tv91/u/e/h/b$a;-><init>()V

    sput-object v0, Lcom/tv91/u/e/h/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/tv91/u/e/h/b;->a:I

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/u/e/h/b;->b:Ljava/lang/String;

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/tv91/u/e/h/b;->c:I

    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/tv91/u/e/h/b;->d:I

    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/tv91/u/e/h/b;->e:I

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/tv91/u/e/h/b;->f:Z

    .line 18
    sget-object v0, Lcom/tv91/u/e/h/a;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/e/h/b;->g:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/tv91/model/PromotionReport;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget v0, p1, Lcom/tv91/model/PromotionReport;->type:I

    iput v0, p0, Lcom/tv91/u/e/h/b;->a:I

    .line 3
    iget-object v0, p1, Lcom/tv91/model/PromotionReport;->name:Ljava/lang/String;

    iput-object v0, p0, Lcom/tv91/u/e/h/b;->b:Ljava/lang/String;

    .line 4
    iget v0, p1, Lcom/tv91/model/PromotionReport;->current:I

    iput v0, p0, Lcom/tv91/u/e/h/b;->c:I

    .line 5
    iget v0, p1, Lcom/tv91/model/PromotionReport;->target:I

    iput v0, p0, Lcom/tv91/u/e/h/b;->d:I

    .line 6
    iget v0, p1, Lcom/tv91/model/PromotionReport;->bonus:I

    iput v0, p0, Lcom/tv91/u/e/h/b;->e:I

    .line 7
    invoke-virtual {p1}, Lcom/tv91/model/PromotionReport;->isExchangeable()Z

    move-result v0

    iput-boolean v0, p0, Lcom/tv91/u/e/h/b;->f:Z

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/tv91/u/e/h/b;->g:Ljava/util/List;

    .line 9
    iget-object p1, p1, Lcom/tv91/model/PromotionReport;->details:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tv91/model/PromotionDetail;

    .line 10
    iget-object v1, p0, Lcom/tv91/u/e/h/b;->g:Ljava/util/List;

    new-instance v2, Lcom/tv91/u/e/h/a;

    invoke-direct {v2, v0}, Lcom/tv91/u/e/h/a;-><init>(Lcom/tv91/model/PromotionDetail;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
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
    iget p2, p0, Lcom/tv91/u/e/h/b;->a:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 2
    iget-object p2, p0, Lcom/tv91/u/e/h/b;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 3
    iget p2, p0, Lcom/tv91/u/e/h/b;->c:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    iget p2, p0, Lcom/tv91/u/e/h/b;->d:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 5
    iget p2, p0, Lcom/tv91/u/e/h/b;->e:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 6
    iget-boolean p2, p0, Lcom/tv91/u/e/h/b;->f:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 7
    iget-object p2, p0, Lcom/tv91/u/e/h/b;->g:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    return-void
.end method
