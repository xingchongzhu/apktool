.class final Lcom/tv91/u/h/i/b0;
.super Lcom/tv91/features/shared/h/b;
.source "PaymentMethodAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/h/i/b0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/b<",
        "Lcom/tv91/model/PaymentMethod;",
        "Lcom/tv91/u/h/i/b0$a;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/features/shared/h/b;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic A(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/tv91/u/h/i/b0;->L(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lcom/tv91/u/h/i/b0$a;

    move-result-object p1

    return-object p1
.end method

.method protected L(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lcom/tv91/u/h/i/b0$a;
    .locals 1

    .line 1
    new-instance p3, Lcom/tv91/u/h/i/b0$a;

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lcom/tv91/r/l;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/tv91/r/l;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/tv91/u/h/i/b0$a;-><init>(Lcom/tv91/r/l;)V

    return-object p3
.end method
