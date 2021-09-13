.class public final Lcom/tv91/features/shared/h/c;
.super Ljava/lang/Object;
.source "Recyclers.java"


# direct methods
.method static synthetic a(Landroidx/recyclerview/widget/RecyclerView$o;Landroid/os/Parcelable;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/tv91/features/shared/h/c;->c(Landroidx/recyclerview/widget/RecyclerView$o;Landroid/os/Parcelable;)V

    return-void
.end method

.method private static b(Landroidx/recyclerview/widget/RecyclerView;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "key-scroll-position-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getId()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static c(Landroidx/recyclerview/widget/RecyclerView$o;Landroid/os/Parcelable;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->c1(Landroid/os/Parcelable;)V

    :cond_0
    return-void
.end method

.method public static d(Landroidx/recyclerview/widget/RecyclerView;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/tv91/features/shared/h/c;->b(Landroidx/recyclerview/widget/RecyclerView;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/tv91/features/shared/h/c;->e(Landroidx/recyclerview/widget/RecyclerView;Landroid/os/Bundle;Ljava/lang/String;)V

    return-void
.end method

.method public static e(Landroidx/recyclerview/widget/RecyclerView;Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object p0

    if-eqz v0, :cond_2

    if-nez p0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$g;->c()I

    move-result v1

    if-lez v1, :cond_1

    .line 4
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/tv91/features/shared/h/c;->c(Landroidx/recyclerview/widget/RecyclerView$o;Landroid/os/Parcelable;)V

    goto :goto_0

    .line 5
    :cond_1
    new-instance v1, Lcom/tv91/features/shared/h/c$a;

    invoke-direct {v1, v0, p0, p1, p2}, Lcom/tv91/features/shared/h/c$a;-><init>(Landroidx/recyclerview/widget/RecyclerView$g;Landroidx/recyclerview/widget/RecyclerView$o;Landroid/os/Bundle;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$g;->u(Landroidx/recyclerview/widget/RecyclerView$i;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static f(Landroidx/recyclerview/widget/RecyclerView;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/tv91/features/shared/h/c;->b(Landroidx/recyclerview/widget/RecyclerView;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/tv91/features/shared/h/c;->g(Landroidx/recyclerview/widget/RecyclerView;Landroid/os/Bundle;Ljava/lang/String;)V

    return-void
.end method

.method public static g(Landroidx/recyclerview/widget/RecyclerView;Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->d1()Landroid/os/Parcelable;

    move-result-object p0

    invoke-virtual {p1, p2, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    return-void
.end method
