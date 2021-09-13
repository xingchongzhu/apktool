.class public Lcom/tv91/u/e/i/o$a;
.super Lcom/tv91/x/c;
.source "PromotionReportFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/e/i/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/tv91/u/e/i/o$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Lcom/tv91/u/e/h/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/e/i/o$a$a;

    invoke-direct {v0}, Lcom/tv91/u/e/i/o$a$a;-><init>()V

    sput-object v0, Lcom/tv91/u/e/i/o$a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lcom/tv91/x/c;-><init>(Landroid/os/Parcel;)V

    .line 4
    const-class v0, Lcom/tv91/u/e/h/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/e/h/b;

    iput-object p1, p0, Lcom/tv91/u/e/i/o$a;->b:Lcom/tv91/u/e/h/b;

    return-void
.end method

.method public constructor <init>(Lcom/tv91/model/PromotionReport;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/tv91/model/PromotionReport;->name:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/tv91/x/c;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/tv91/u/e/h/b;

    invoke-direct {v0, p1}, Lcom/tv91/u/e/h/b;-><init>(Lcom/tv91/model/PromotionReport;)V

    iput-object v0, p0, Lcom/tv91/u/e/i/o$a;->b:Lcom/tv91/u/e/h/b;

    return-void
.end method


# virtual methods
.method protected n()Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/e/i/o;

    invoke-direct {v0}, Lcom/tv91/u/e/i/o;-><init>()V

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Lcom/tv91/x/c;->writeToParcel(Landroid/os/Parcel;I)V

    .line 2
    iget-object p2, p0, Lcom/tv91/u/e/i/o$a;->b:Lcom/tv91/u/e/h/b;

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
