.class Lcom/tv91/u/h/j/u$c;
.super Lcom/tv91/features/shared/h/b;
.source "PurchaseView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/h/j/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/b<",
        "Lcom/tv91/model/PurchasePackage;",
        "Lcom/tv91/u/h/j/u$d;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/features/shared/h/b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/u/h/j/u$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/tv91/u/h/j/u$c;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic A(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/tv91/u/h/j/u$c;->L(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lcom/tv91/u/h/j/u$d;

    move-result-object p1

    return-object p1
.end method

.method protected L(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lcom/tv91/u/h/j/u$d;
    .locals 1

    .line 1
    new-instance p3, Lcom/tv91/u/h/j/u$d;

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lcom/tv91/r/v;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/tv91/r/v;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/tv91/u/h/j/u$d;-><init>(Lcom/tv91/r/v;)V

    return-object p3
.end method
