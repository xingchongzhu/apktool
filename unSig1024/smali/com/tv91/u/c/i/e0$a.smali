.class Lcom/tv91/u/c/i/e0$a;
.super Lcom/tv91/features/shared/h/b;
.source "MoviesView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/c/i/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/b<",
        "Lcom/tv91/model/Movie;",
        "Lcom/tv91/u/c/i/e0$b;",
        ">;"
    }
.end annotation


# instance fields
.field private final e:Lcom/tv91/u/c/i/e0$e;


# direct methods
.method constructor <init>(Lcom/tv91/u/c/i/e0$e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/features/shared/h/b;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/tv91/u/c/i/e0$a;->e:Lcom/tv91/u/c/i/e0$e;

    return-void
.end method


# virtual methods
.method protected bridge synthetic A(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/tv91/u/c/i/e0$a;->L(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lcom/tv91/u/c/i/e0$b;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic G(Landroidx/recyclerview/widget/RecyclerView$d0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/tv91/u/c/i/e0$b;

    check-cast p2, Lcom/tv91/model/Movie;

    invoke-virtual {p0, p1, p2}, Lcom/tv91/u/c/i/e0$a;->M(Lcom/tv91/u/c/i/e0$b;Lcom/tv91/model/Movie;)V

    return-void
.end method

.method protected L(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lcom/tv91/u/c/i/e0$b;
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/u/c/i/e0$b;

    const/4 v1, 0x0

    invoke-virtual {p1, p3, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/tv91/u/c/i/e0$b;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method protected M(Lcom/tv91/u/c/i/e0$b;Lcom/tv91/model/Movie;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/c/i/e0$a;->e:Lcom/tv91/u/c/i/e0$e;

    sget-object v1, Lcom/tv91/u/c/i/e0$e;->a:Lcom/tv91/u/c/i/e0$e;

    if-ne v0, v1, :cond_0

    .line 2
    invoke-virtual {p1, p2}, Lcom/tv91/u/c/i/e0$b;->M(Lcom/tv91/model/Movie;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1, p2}, Lcom/tv91/u/c/i/e0$b;->N(Lcom/tv91/model/Movie;)V

    :goto_0
    return-void
.end method

.method public e(I)I
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tv91/u/c/i/e0$a;->e:Lcom/tv91/u/c/i/e0$e;

    sget-object v0, Lcom/tv91/u/c/i/e0$e;->a:Lcom/tv91/u/c/i/e0$e;

    if-ne p1, v0, :cond_0

    const p1, 0x7f0d0026

    goto :goto_0

    :cond_0
    const p1, 0x7f0d0023

    :goto_0
    return p1
.end method
