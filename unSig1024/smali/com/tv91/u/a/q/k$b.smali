.class Lcom/tv91/u/a/q/k$b;
.super Lcom/tv91/features/shared/h/b;
.source "PromotionView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/a/q/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/b<",
        "Lcom/tv91/model/Promotion;",
        "Lcom/tv91/u/a/q/k$c;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Lcom/tv91/features/shared/h/b;-><init>()V

    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$g;->v(Z)V

    :cond_0
    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/u/a/q/k$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/u/a/q/k$b;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic A(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/tv91/u/a/q/k$b;->L(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lcom/tv91/u/a/q/k$c;

    move-result-object p1

    return-object p1
.end method

.method protected L(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lcom/tv91/u/a/q/k$c;
    .locals 1

    .line 1
    new-instance p3, Lcom/tv91/u/a/q/k$c;

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lcom/tv91/r/m;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/tv91/r/m;

    move-result-object p1

    const/4 p2, 0x0

    invoke-direct {p3, p1, p2}, Lcom/tv91/u/a/q/k$c;-><init>(Lcom/tv91/r/m;Lcom/tv91/u/a/q/k$a;)V

    return-object p3
.end method
