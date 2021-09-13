.class public abstract Lcom/tv91/x/f;
.super Landroidx/fragment/app/Fragment;
.source "KeyedFragment.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Landroidx/fragment/app/Fragment;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final l2()Lcom/tv91/x/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<KEY:",
            "Lcom/tv91/x/c;",
            ">()TKEY;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->N1()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "fragment-key-tag"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/tv91/x/c;

    const-string v1, "The key provided as fragment argument should not be null!"

    .line 2
    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-object v0
.end method
