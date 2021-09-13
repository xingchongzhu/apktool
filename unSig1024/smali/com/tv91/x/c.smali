.class public abstract Lcom/tv91/x/c;
.super Ljava/lang/Object;
.source "FragmentKey.java"

# interfaces
.implements Lcom/tv91/x/g;
.implements Landroid/os/Parcelable;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/x/c;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lcom/tv91/x/c;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final l()Landroidx/fragment/app/Fragment;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/tv91/x/c;->n()Landroidx/fragment/app/Fragment;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/os/Bundle;

    move-result-object v1

    if-nez v1, :cond_0

    .line 3
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 4
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->W1(Landroid/os/Bundle;)V

    :cond_0
    const-string v2, "fragment-key-tag"

    .line 5
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-object v0
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/x/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method protected abstract n()Landroidx/fragment/app/Fragment;
.end method

.method public o(Landroidx/fragment/app/x;Z)V
    .locals 0

    const/4 p2, 0x0

    .line 1
    invoke-virtual {p1, p2, p2, p2, p2}, Landroidx/fragment/app/x;->s(IIII)Landroidx/fragment/app/x;

    return-void
.end method

.method public p(Landroidx/fragment/app/x;Z)V
    .locals 0

    const/4 p2, 0x0

    .line 1
    invoke-virtual {p1, p2, p2, p2, p2}, Landroidx/fragment/app/x;->s(IIII)Landroidx/fragment/app/x;

    return-void
.end method

.method public q(Landroidx/fragment/app/x;Z)V
    .locals 0

    const/4 p2, 0x0

    .line 1
    invoke-virtual {p1, p2, p2, p2, p2}, Landroidx/fragment/app/x;->s(IIII)Landroidx/fragment/app/x;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/tv91/x/c;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
