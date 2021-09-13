.class Lcom/tv91/u/c/g/v$b;
.super Lcom/tv91/features/shared/h/b;
.source "FavoriteView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/c/g/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/b<",
        "Lcom/tv91/model/Movie;",
        "Lcom/tv91/u/c/g/v$c;",
        ">;"
    }
.end annotation


# instance fields
.field private e:Z

.field private f:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Lcom/tv91/model/Movie;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/features/shared/h/b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/u/c/g/v$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/tv91/u/c/g/v$b;-><init>()V

    return-void
.end method

.method static synthetic L(Lcom/tv91/u/c/g/v$b;Lb/g/j/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/c/g/v$b;->R(Lb/g/j/a;)V

    return-void
.end method

.method static synthetic M(Lcom/tv91/u/c/g/v$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/u/c/g/v$b;->S()V

    return-void
.end method

.method private synthetic O(Lcom/tv91/u/c/g/v$c;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/tv91/u/c/g/v$b;->f:Lb/g/j/a;

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->j()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/tv91/features/shared/h/b;->B(I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private R(Lb/g/j/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/model/Movie;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/u/c/g/v$b;->f:Lb/g/j/a;

    return-void
.end method

.method private S()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/tv91/u/c/g/v$b;->e:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lcom/tv91/u/c/g/v$b;->e:Z

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$g;->h()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic A(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/tv91/u/c/g/v$b;->N(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lcom/tv91/u/c/g/v$c;

    move-result-object p1

    return-object p1
.end method

.method protected N(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lcom/tv91/u/c/g/v$c;
    .locals 1

    .line 1
    new-instance p3, Lcom/tv91/u/c/g/v$c;

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lcom/tv91/r/h;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/tv91/r/h;

    move-result-object p1

    const/4 p2, 0x0

    invoke-direct {p3, p1, p2}, Lcom/tv91/u/c/g/v$c;-><init>(Lcom/tv91/r/h;Lcom/tv91/u/c/g/v$a;)V

    .line 2
    invoke-static {p3}, Lcom/tv91/u/c/g/v$c;->T(Lcom/tv91/u/c/g/v$c;)Lcom/tv91/r/h;

    move-result-object p1

    iget-object p1, p1, Lcom/tv91/r/h;->b:Landroid/widget/FrameLayout;

    new-instance p2, Lcom/tv91/u/c/g/r;

    invoke-direct {p2, p0, p3}, Lcom/tv91/u/c/g/r;-><init>(Lcom/tv91/u/c/g/v$b;Lcom/tv91/u/c/g/v$c;)V

    invoke-static {p2}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p3
.end method

.method public synthetic P(Lcom/tv91/u/c/g/v$c;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/c/g/v$b;->O(Lcom/tv91/u/c/g/v$c;Landroid/view/View;)V

    return-void
.end method

.method public Q(Lcom/tv91/u/c/g/v$c;I)V
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, Lcom/tv91/features/shared/h/b;->B(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/tv91/model/Movie;

    if-eqz p2, :cond_0

    .line 2
    iget-boolean v0, p0, Lcom/tv91/u/c/g/v$b;->e:Z

    invoke-static {p1, p2, v0}, Lcom/tv91/u/c/g/v$c;->U(Lcom/tv91/u/c/g/v$c;Lcom/tv91/model/Movie;Z)V

    :cond_0
    return-void
.end method

.method public bridge synthetic m(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/tv91/u/c/g/v$c;

    invoke-virtual {p0, p1, p2}, Lcom/tv91/u/c/g/v$b;->Q(Lcom/tv91/u/c/g/v$c;I)V

    return-void
.end method
