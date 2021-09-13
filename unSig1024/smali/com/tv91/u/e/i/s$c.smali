.class Lcom/tv91/u/e/i/s$c;
.super Lcom/tv91/features/shared/h/d;
.source "ReportView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/e/i/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/d<",
        "Lcom/tv91/u/e/h/a;",
        ">;"
    }
.end annotation


# instance fields
.field private final w:Lcom/tv91/r/n;


# direct methods
.method constructor <init>(Lcom/tv91/r/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/h/d;-><init>(Lb/r/a;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/u/e/i/s$c;->w:Lcom/tv91/r/n;

    return-void
.end method


# virtual methods
.method protected bridge synthetic M(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/tv91/u/e/h/a;

    invoke-virtual {p0, p1}, Lcom/tv91/u/e/i/s$c;->T(Lcom/tv91/u/e/h/a;)V

    return-void
.end method

.method protected T(Lcom/tv91/u/e/h/a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/i/s$c;->w:Lcom/tv91/r/n;

    iget-object v0, v0, Lcom/tv91/r/n;->b:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/tv91/u/e/h/a;->b:Ljava/util/Date;

    const-string v2, "yyyy/MM/dd"

    invoke-static {v1, v2}, Lcom/tv91/utils/a;->b(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/e/i/s$c;->w:Lcom/tv91/r/n;

    iget-object v0, v0, Lcom/tv91/r/n;->d:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/tv91/u/e/h/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/e/i/s$c;->w:Lcom/tv91/r/n;

    iget-object v0, v0, Lcom/tv91/r/n;->c:Landroid/widget/TextView;

    iget p1, p1, Lcom/tv91/u/e/h/a;->c:I

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
