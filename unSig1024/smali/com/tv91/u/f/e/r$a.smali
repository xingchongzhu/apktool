.class Lcom/tv91/u/f/e/r$a;
.super Ljava/lang/Object;
.source "SendFeedbackView.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tv91/u/f/e/r;->n1(Lb/g/j/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/g/j/a;

.field final synthetic b:Lcom/tv91/u/f/e/r;


# direct methods
.method constructor <init>(Lcom/tv91/u/f/e/r;Lb/g/j/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/f/e/r$a;->b:Lcom/tv91/u/f/e/r;

    iput-object p2, p0, Lcom/tv91/u/f/e/r$a;->a:Lb/g/j/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/tv91/u/f/e/r$a;->a:Lb/g/j/a;

    iget-object p2, p0, Lcom/tv91/u/f/e/r$a;->b:Lcom/tv91/u/f/e/r;

    invoke-static {p2}, Lcom/tv91/u/f/e/r;->q2(Lcom/tv91/u/f/e/r;)Lcom/tv91/u/f/e/r$b;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method
