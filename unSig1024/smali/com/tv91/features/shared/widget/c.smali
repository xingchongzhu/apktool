.class public final synthetic Lcom/tv91/features/shared/widget/c;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic a:Lcom/tv91/features/shared/widget/e$a;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/features/shared/widget/e$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/features/shared/widget/c;->a:Lcom/tv91/features/shared/widget/e$a;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, Lcom/tv91/features/shared/widget/c;->a:Lcom/tv91/features/shared/widget/e$a;

    invoke-virtual {v0, p1}, Lcom/tv91/features/shared/widget/e$a;->g(Landroid/content/DialogInterface;)V

    return-void
.end method
