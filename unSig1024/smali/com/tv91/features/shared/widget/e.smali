.class public final Lcom/tv91/features/shared/widget/e;
.super Landroid/app/Dialog;
.source "CustomDialog.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/features/shared/widget/e$a;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    invoke-direct {v0, p0}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const p0, 0x7f12005c

    .line 2
    invoke-virtual {v0, p0}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p0

    .line 3
    invoke-virtual {p0, p1}, Lcom/tv91/features/shared/widget/e$a;->n(Ljava/lang/String;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p0

    const p1, 0x7f12004f

    .line 4
    invoke-virtual {p0, p1}, Lcom/tv91/features/shared/widget/e$a;->v(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/features/shared/widget/e$a;

    invoke-direct {v0, p0}, Lcom/tv91/features/shared/widget/e$a;-><init>(Landroid/content/Context;)V

    const p0, 0x7f12005c

    .line 2
    invoke-virtual {v0, p0}, Lcom/tv91/features/shared/widget/e$a;->x(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p0

    const v0, 0x7f120001

    .line 3
    invoke-virtual {p0, v0}, Lcom/tv91/features/shared/widget/e$a;->m(I)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p0

    const v0, 0x7f120054

    .line 4
    invoke-virtual {p0, v0, p1}, Lcom/tv91/features/shared/widget/e$a;->w(ILjava/lang/Runnable;)Lcom/tv91/features/shared/widget/e$a;

    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/tv91/features/shared/widget/e$a;->z()V

    return-void
.end method
