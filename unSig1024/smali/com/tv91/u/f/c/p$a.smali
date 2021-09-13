.class public final Lcom/tv91/u/f/c/p$a;
.super Lcom/tv91/x/c;
.source "FeedbackDetailFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/f/c/p;
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
            "Lcom/tv91/u/f/c/p$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/tv91/u/f/d/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/f/c/p$a$a;

    invoke-direct {v0}, Lcom/tv91/u/f/c/p$a$a;-><init>()V

    sput-object v0, Lcom/tv91/u/f/c/p$a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lcom/tv91/x/c;-><init>(Landroid/os/Parcel;)V

    .line 4
    const-class v0, Lcom/tv91/u/f/d/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/tv91/u/f/d/a;

    iput-object p1, p0, Lcom/tv91/u/f/c/p$a;->b:Lcom/tv91/u/f/d/a;

    return-void
.end method

.method public constructor <init>(Lcom/tv91/model/Feedback;)V
    .locals 1

    const-string v0, "\u5ba2\u670d\u56de\u8986\u9801\u9762"

    .line 1
    invoke-direct {p0, v0}, Lcom/tv91/x/c;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/tv91/u/f/d/a;

    invoke-direct {v0, p1}, Lcom/tv91/u/f/d/a;-><init>(Lcom/tv91/model/Feedback;)V

    iput-object v0, p0, Lcom/tv91/u/f/c/p$a;->b:Lcom/tv91/u/f/d/a;

    return-void
.end method

.method static synthetic r(Lcom/tv91/u/f/c/p$a;)Lcom/tv91/u/f/d/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/u/f/c/p$a;->b:Lcom/tv91/u/f/d/a;

    return-object p0
.end method


# virtual methods
.method protected n()Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/u/f/c/p;

    invoke-direct {v0}, Lcom/tv91/u/f/c/p;-><init>()V

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
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Lcom/tv91/x/c;->writeToParcel(Landroid/os/Parcel;I)V

    .line 2
    iget-object p2, p0, Lcom/tv91/u/f/c/p$a;->b:Lcom/tv91/u/f/d/a;

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
