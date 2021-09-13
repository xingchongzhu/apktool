.class public Lcom/tv91/features/movie/play/MoviePlayActivity$c;
.super Lcom/tv91/x/a;
.source "MoviePlayActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/features/movie/play/MoviePlayActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/tv91/features/movie/play/MoviePlayActivity$c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/features/movie/play/MoviePlayActivity$c$a;

    invoke-direct {v0}, Lcom/tv91/features/movie/play/MoviePlayActivity$c$a;-><init>()V

    sput-object v0, Lcom/tv91/features/movie/play/MoviePlayActivity$c;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/x/a;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity$c;->a:Landroid/net/Uri;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/tv91/x/a;-><init>(Landroid/os/Parcel;)V

    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity$c;->a:Landroid/net/Uri;

    return-void
.end method

.method static synthetic p(Lcom/tv91/features/movie/play/MoviePlayActivity$c;)Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/features/movie/play/MoviePlayActivity$c;->a:Landroid/net/Uri;

    return-object p0
.end method


# virtual methods
.method public n(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/tv91/features/movie/play/MoviePlayActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object p1, p0, Lcom/tv91/features/movie/play/MoviePlayActivity$c;->a:Landroid/net/Uri;

    const-string v1, "key_uri"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/tv91/x/a;->writeToParcel(Landroid/os/Parcel;I)V

    .line 2
    iget-object p2, p0, Lcom/tv91/features/movie/play/MoviePlayActivity$c;->a:Landroid/net/Uri;

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
