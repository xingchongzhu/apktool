.class public final Lcom/tv91/u/f/d/a;
.super Ljava/lang/Object;
.source "FeedbackModel.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/tv91/u/f/d/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/util/Date;

.field public d:Ljava/lang/String;

.field public e:Ljava/util/Date;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/f/d/a$a;

    invoke-direct {v0}, Lcom/tv91/u/f/d/a$a;-><init>()V

    sput-object v0, Lcom/tv91/u/f/d/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/u/f/d/a;->a:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/u/f/d/a;->b:Ljava/lang/String;

    .line 11
    invoke-static {p1}, Lcom/tv91/utils/e;->b(Landroid/os/Parcel;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/u/f/d/a;->c:Ljava/util/Date;

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/u/f/d/a;->d:Ljava/lang/String;

    .line 13
    invoke-static {p1}, Lcom/tv91/utils/e;->b(Landroid/os/Parcel;)Ljava/util/Date;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/f/d/a;->e:Ljava/util/Date;

    return-void
.end method

.method public constructor <init>(Lcom/tv91/model/Feedback;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iget-object v0, p1, Lcom/tv91/model/Feedback;->id:Ljava/lang/String;

    iput-object v0, p0, Lcom/tv91/u/f/d/a;->a:Ljava/lang/String;

    .line 4
    iget-object v0, p1, Lcom/tv91/model/Feedback;->content:Ljava/lang/String;

    iput-object v0, p0, Lcom/tv91/u/f/d/a;->b:Ljava/lang/String;

    .line 5
    iget-object v0, p1, Lcom/tv91/model/Feedback;->date:Ljava/util/Date;

    iput-object v0, p0, Lcom/tv91/u/f/d/a;->c:Ljava/util/Date;

    .line 6
    iget-object v0, p1, Lcom/tv91/model/Feedback;->replyContent:Ljava/lang/String;

    iput-object v0, p0, Lcom/tv91/u/f/d/a;->d:Ljava/lang/String;

    .line 7
    iget-object p1, p1, Lcom/tv91/model/Feedback;->replyDate:Ljava/util/Date;

    iput-object p1, p0, Lcom/tv91/u/f/d/a;->e:Ljava/util/Date;

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
    iget-object p2, p0, Lcom/tv91/u/f/d/a;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 2
    iget-object p2, p0, Lcom/tv91/u/f/d/a;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 3
    iget-object p2, p0, Lcom/tv91/u/f/d/a;->c:Ljava/util/Date;

    invoke-static {p1, p2}, Lcom/tv91/utils/e;->d(Landroid/os/Parcel;Ljava/util/Date;)V

    .line 4
    iget-object p2, p0, Lcom/tv91/u/f/d/a;->d:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 5
    iget-object p2, p0, Lcom/tv91/u/f/d/a;->e:Ljava/util/Date;

    invoke-static {p1, p2}, Lcom/tv91/utils/e;->d(Landroid/os/Parcel;Ljava/util/Date;)V

    return-void
.end method
