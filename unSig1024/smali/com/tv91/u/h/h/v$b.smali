.class Lcom/tv91/u/h/h/v$b;
.super Lcom/tv91/features/shared/h/b;
.source "PurchaseHistoryView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/h/h/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/b<",
        "Lcom/tv91/model/PurchaseHistory;",
        "Lcom/tv91/features/shared/h/d<",
        "Lcom/tv91/model/PurchaseHistory;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final e:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/features/shared/h/b;-><init>()V

    .line 2
    iput-boolean p1, p0, Lcom/tv91/u/h/h/v$b;->e:Z

    return-void
.end method


# virtual methods
.method protected bridge synthetic A(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/tv91/u/h/h/v$b;->L(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lcom/tv91/features/shared/h/d;

    move-result-object p1

    return-object p1
.end method

.method protected L(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lcom/tv91/features/shared/h/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/LayoutInflater;",
            "Landroid/view/ViewGroup;",
            "I)",
            "Lcom/tv91/features/shared/h/d<",
            "Lcom/tv91/model/PurchaseHistory;",
            ">;"
        }
    .end annotation

    .line 1
    iget-boolean p3, p0, Lcom/tv91/u/h/h/v$b;->e:Z

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p3, :cond_0

    .line 2
    new-instance p3, Lcom/tv91/u/h/h/v$c;

    invoke-static {p1, p2, v1}, Lcom/tv91/r/g;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/tv91/r/g;

    move-result-object p1

    invoke-direct {p3, p1, v0}, Lcom/tv91/u/h/h/v$c;-><init>(Lcom/tv91/r/g;Lcom/tv91/u/h/h/v$a;)V

    return-object p3

    .line 3
    :cond_0
    new-instance p3, Lcom/tv91/u/h/h/v$d;

    invoke-static {p1, p2, v1}, Lcom/tv91/r/o;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/tv91/r/o;

    move-result-object p1

    invoke-direct {p3, p1, v0}, Lcom/tv91/u/h/h/v$d;-><init>(Lcom/tv91/r/o;Lcom/tv91/u/h/h/v$a;)V

    return-object p3
.end method
