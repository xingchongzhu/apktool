.class Lcom/tv91/u/f/c/t$b;
.super Lcom/tv91/features/shared/h/b;
.source "FeedbackView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/f/c/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/b<",
        "Lcom/tv91/model/Feedback;",
        "Lcom/tv91/u/f/c/t$c;",
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

.method synthetic constructor <init>(Lcom/tv91/u/f/c/t$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/tv91/u/f/c/t$b;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic A(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/tv91/u/f/c/t$b;->L(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lcom/tv91/u/f/c/t$c;

    move-result-object p1

    return-object p1
.end method

.method protected L(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lcom/tv91/u/f/c/t$c;
    .locals 1

    .line 1
    new-instance p3, Lcom/tv91/u/f/c/t$c;

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lcom/tv91/r/d;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/tv91/r/d;

    move-result-object p1

    const/4 p2, 0x0

    invoke-direct {p3, p1, p2}, Lcom/tv91/u/f/c/t$c;-><init>(Lcom/tv91/r/d;Lcom/tv91/u/f/c/t$a;)V

    return-object p3
.end method
