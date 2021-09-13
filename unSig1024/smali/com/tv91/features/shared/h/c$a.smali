.class final Lcom/tv91/features/shared/h/c$a;
.super Landroidx/recyclerview/widget/RecyclerView$i;
.source "Recyclers.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tv91/features/shared/h/c;->e(Landroidx/recyclerview/widget/RecyclerView;Landroid/os/Bundle;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/recyclerview/widget/RecyclerView$g;

.field final synthetic b:Landroidx/recyclerview/widget/RecyclerView$o;

.field final synthetic c:Landroid/os/Bundle;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroidx/recyclerview/widget/RecyclerView$g;Landroidx/recyclerview/widget/RecyclerView$o;Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/features/shared/h/c$a;->a:Landroidx/recyclerview/widget/RecyclerView$g;

    iput-object p2, p0, Lcom/tv91/features/shared/h/c$a;->b:Landroidx/recyclerview/widget/RecyclerView$o;

    iput-object p3, p0, Lcom/tv91/features/shared/h/c$a;->c:Landroid/os/Bundle;

    iput-object p4, p0, Lcom/tv91/features/shared/h/c$a;->d:Ljava/lang/String;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$i;-><init>()V

    return-void
.end method

.method private f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/h/c$a;->a:Landroidx/recyclerview/widget/RecyclerView$g;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$g;->w(Landroidx/recyclerview/widget/RecyclerView$i;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/features/shared/h/c$a;->b:Landroidx/recyclerview/widget/RecyclerView$o;

    iget-object v1, p0, Lcom/tv91/features/shared/h/c$a;->c:Landroid/os/Bundle;

    iget-object v2, p0, Lcom/tv91/features/shared/h/c$a;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tv91/features/shared/h/c;->a(Landroidx/recyclerview/widget/RecyclerView$o;Landroid/os/Parcelable;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/features/shared/h/c$a;->f()V

    return-void
.end method

.method public d(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/features/shared/h/c$a;->f()V

    return-void
.end method
