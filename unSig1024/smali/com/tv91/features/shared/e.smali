.class public final synthetic Lcom/tv91/features/shared/e;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroidx/savedstate/SavedStateRegistry$b;


# instance fields
.field public final synthetic a:Lcom/tv91/features/shared/ViewSupplier;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/features/shared/ViewSupplier;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/features/shared/e;->a:Lcom/tv91/features/shared/ViewSupplier;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/tv91/features/shared/e;->a:Lcom/tv91/features/shared/ViewSupplier;

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->j()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
