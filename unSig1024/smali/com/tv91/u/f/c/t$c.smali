.class Lcom/tv91/u/f/c/t$c;
.super Lcom/tv91/features/shared/h/d;
.source "FeedbackView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/f/c/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/d<",
        "Lcom/tv91/model/Feedback;",
        ">;"
    }
.end annotation


# instance fields
.field private final w:Lcom/tv91/r/d;


# direct methods
.method private constructor <init>(Lcom/tv91/r/d;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/h/d;-><init>(Lb/r/a;)V

    .line 3
    iput-object p1, p0, Lcom/tv91/u/f/c/t$c;->w:Lcom/tv91/r/d;

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/r/d;Lcom/tv91/u/f/c/t$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/f/c/t$c;-><init>(Lcom/tv91/r/d;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic M(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/tv91/model/Feedback;

    invoke-virtual {p0, p1}, Lcom/tv91/u/f/c/t$c;->T(Lcom/tv91/model/Feedback;)V

    return-void
.end method

.method protected T(Lcom/tv91/model/Feedback;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lcom/tv91/model/Feedback;->content:Ljava/lang/String;

    const-string v1, ":\n"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_1

    .line 2
    iget-object v1, p1, Lcom/tv91/model/Feedback;->content:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\n"

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, ""

    .line 4
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/tv91/u/f/c/t$c;->w:Lcom/tv91/r/d;

    iget-object v1, v1, Lcom/tv91/r/d;->d:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/tv91/u/f/c/t$c;->w:Lcom/tv91/r/d;

    iget-object v0, v0, Lcom/tv91/r/d;->d:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/tv91/model/Feedback;->content:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    :goto_0
    iget-object v0, p0, Lcom/tv91/u/f/c/t$c;->w:Lcom/tv91/r/d;

    iget-object v0, v0, Lcom/tv91/r/d;->e:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/tv91/model/Feedback;->date:Ljava/util/Date;

    const-string v2, "yyyy/MM/dd"

    invoke-static {v1, v2}, Lcom/tv91/utils/a;->b(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object v0, p0, Lcom/tv91/u/f/c/t$c;->w:Lcom/tv91/r/d;

    iget-object v0, v0, Lcom/tv91/r/d;->b:Landroid/widget/CheckBox;

    iget-object p1, p1, Lcom/tv91/model/Feedback;->replyContent:Ljava/lang/String;

    invoke-static {p1}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Landroid/widget/CheckBox;->setChecked(Z)V

    return-void
.end method
