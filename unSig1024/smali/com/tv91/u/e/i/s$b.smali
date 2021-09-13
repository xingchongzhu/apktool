.class Lcom/tv91/u/e/i/s$b;
.super Lcom/tv91/features/shared/h/b;
.source "ReportView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/e/i/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/b<",
        "Lcom/tv91/u/e/h/a;",
        "Lcom/tv91/u/e/i/s$c;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/u/e/h/a;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/h/b;-><init>(Ljava/util/List;)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/List;Lcom/tv91/u/e/i/s$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/e/i/s$b;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic A(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/tv91/u/e/i/s$b;->L(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lcom/tv91/u/e/i/s$c;

    move-result-object p1

    return-object p1
.end method

.method protected L(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lcom/tv91/u/e/i/s$c;
    .locals 1

    .line 1
    new-instance p3, Lcom/tv91/u/e/i/s$c;

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lcom/tv91/r/n;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/tv91/r/n;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/tv91/u/e/i/s$c;-><init>(Lcom/tv91/r/n;)V

    return-object p3
.end method
