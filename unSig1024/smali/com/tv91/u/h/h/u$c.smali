.class Lcom/tv91/u/h/h/u$c;
.super Lcom/tv91/features/shared/h/d;
.source "PaymentHistoryView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/h/h/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/d<",
        "Lcom/tv91/model/PaymentHistory;",
        ">;"
    }
.end annotation


# instance fields
.field private final w:Lcom/tv91/r/k;


# direct methods
.method private constructor <init>(Lcom/tv91/r/k;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/h/d;-><init>(Lb/r/a;)V

    .line 3
    iput-object p1, p0, Lcom/tv91/u/h/h/u$c;->w:Lcom/tv91/r/k;

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/r/k;Lcom/tv91/u/h/h/u$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/h/h/u$c;-><init>(Lcom/tv91/r/k;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic M(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/tv91/model/PaymentHistory;

    invoke-virtual {p0, p1}, Lcom/tv91/u/h/h/u$c;->T(Lcom/tv91/model/PaymentHistory;)V

    return-void
.end method

.method protected T(Lcom/tv91/model/PaymentHistory;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/tv91/u/h/h/u$c;->w:Lcom/tv91/r/k;

    iget-object v0, v0, Lcom/tv91/r/k;->c:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/tv91/model/PaymentHistory;->method:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/h/h/u$c;->w:Lcom/tv91/r/k;

    iget-object v0, v0, Lcom/tv91/r/k;->e:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    iget-wide v3, p1, Lcom/tv91/model/PaymentHistory;->price:D

    .line 3
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const v3, 0x7f120157

    invoke-virtual {p0, v3, v2}, Lcom/tv91/features/shared/h/d;->R(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/h/h/u$c;->w:Lcom/tv91/r/k;

    iget-object v0, v0, Lcom/tv91/r/k;->d:Landroid/widget/TextView;

    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p1, Lcom/tv91/model/PaymentHistory;->point:I

    .line 6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v4

    const v2, 0x7f120155

    invoke-virtual {p0, v2, v1}, Lcom/tv91/features/shared/h/d;->R(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object v0, p0, Lcom/tv91/u/h/h/u$c;->w:Lcom/tv91/r/k;

    iget-object v0, v0, Lcom/tv91/r/k;->b:Landroid/widget/TextView;

    iget-object p1, p1, Lcom/tv91/model/PaymentHistory;->date:Ljava/lang/String;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
