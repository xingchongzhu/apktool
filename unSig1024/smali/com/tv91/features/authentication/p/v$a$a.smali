.class final Lcom/tv91/features/authentication/p/v$a$a;
.super Ljava/lang/Object;
.source "ForgetPasswordFragment.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/features/authentication/p/v$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/tv91/features/authentication/p/v$a;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/tv91/features/authentication/p/v$a;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/features/authentication/p/v$a;

    invoke-direct {v0, p1}, Lcom/tv91/features/authentication/p/v$a;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public b(I)[Lcom/tv91/features/authentication/p/v$a;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/tv91/features/authentication/p/v$a;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tv91/features/authentication/p/v$a$a;->a(Landroid/os/Parcel;)Lcom/tv91/features/authentication/p/v$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tv91/features/authentication/p/v$a$a;->b(I)[Lcom/tv91/features/authentication/p/v$a;

    move-result-object p1

    return-object p1
.end method
