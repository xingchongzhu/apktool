.class Lcom/tv91/u/e/i/n;
.super Landroidx/fragment/app/v;
.source "PromotionPageAdapter.java"


# instance fields
.field private final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tv91/model/PromotionReport;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/fragment/app/n;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/n;",
            "Ljava/util/List<",
            "Lcom/tv91/model/PromotionReport;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, v0}, Landroidx/fragment/app/v;-><init>(Landroidx/fragment/app/n;I)V

    .line 2
    iput-object p2, p0, Lcom/tv91/u/e/i/n;->j:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/i/n;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public e(I)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/i/n;->j:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/model/PromotionReport;

    iget-object p1, p1, Lcom/tv91/model/PromotionReport;->name:Ljava/lang/String;

    return-object p1
.end method

.method public p(I)Landroidx/fragment/app/Fragment;
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/u/e/i/o$a;

    iget-object v1, p0, Lcom/tv91/u/e/i/n;->j:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/model/PromotionReport;

    invoke-direct {v0, p1}, Lcom/tv91/u/e/i/o$a;-><init>(Lcom/tv91/model/PromotionReport;)V

    invoke-virtual {v0}, Lcom/tv91/x/c;->l()Landroidx/fragment/app/Fragment;

    move-result-object p1

    return-object p1
.end method
