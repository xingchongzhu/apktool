.class final Lc/a/a/b/n/a$b$a;
.super Ljava/lang/Object;
.source "BadgeDrawable.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/b/n/a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lc/a/a/b/n/a$b;",
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
.method public a(Landroid/os/Parcel;)Lc/a/a/b/n/a$b;
    .locals 1

    .line 1
    new-instance v0, Lc/a/a/b/n/a$b;

    invoke-direct {v0, p1}, Lc/a/a/b/n/a$b;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public b(I)[Lc/a/a/b/n/a$b;
    .locals 0

    .line 1
    new-array p1, p1, [Lc/a/a/b/n/a$b;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc/a/a/b/n/a$b$a;->a(Landroid/os/Parcel;)Lc/a/a/b/n/a$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc/a/a/b/n/a$b$a;->b(I)[Lc/a/a/b/n/a$b;

    move-result-object p1

    return-object p1
.end method
