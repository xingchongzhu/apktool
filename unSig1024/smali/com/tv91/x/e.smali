.class public abstract Lcom/tv91/x/e;
.super Landroidx/appcompat/app/c;
.source "KeyedActivity.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final M()Lcom/tv91/x/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<KEY:",
            "Lcom/tv91/x/a;",
            ">()TKEY;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "activity-key-extra"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/tv91/x/a;

    const-string v1, "The key provided as activity argument should never null!"

    .line 2
    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-object v0
.end method
