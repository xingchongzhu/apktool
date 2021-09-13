.class public final Lcom/tv91/features/shared/i/e;
.super Ljava/lang/Object;
.source "Clicks.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/features/shared/i/e$b;
    }
.end annotation


# direct methods
.method public static a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;
    .locals 4

    .line 1
    new-instance v0, Lcom/tv91/features/shared/i/e$b;

    const-wide/16 v1, 0x1f4

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, p0, v3}, Lcom/tv91/features/shared/i/e$b;-><init>(JLandroid/view/View$OnClickListener;Lcom/tv91/features/shared/i/e$a;)V

    return-object v0
.end method
