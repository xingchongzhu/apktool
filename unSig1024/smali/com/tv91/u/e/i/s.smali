.class final Lcom/tv91/u/e/i/s;
.super Lcom/tv91/features/shared/f;
.source "ReportView.java"

# interfaces
.implements Lcom/tv91/u/e/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/e/i/s$c;,
        Lcom/tv91/u/e/i/s$b;
    }
.end annotation


# instance fields
.field private final e:Lcom/tv91/r/s;


# direct methods
.method constructor <init>(Lcom/tv91/r/s;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/f;-><init>(Lb/r/a;)V

    .line 2
    iput-object p1, p0, Lcom/tv91/u/e/i/s;->e:Lcom/tv91/r/s;

    return-void
.end method

.method static synthetic q2(Ljava/lang/Runnable;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method


# virtual methods
.method public Q1(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/i/s;->e:Lcom/tv91/r/s;

    iget-object v0, v0, Lcom/tv91/r/s;->b:Landroid/widget/Button;

    new-instance v1, Lcom/tv91/u/e/i/l;

    invoke-direct {v1, p1}, Lcom/tv91/u/e/i/l;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public h2(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tv91/u/e/i/s;->e:Lcom/tv91/r/s;

    iget-object p1, p1, Lcom/tv91/r/s;->b:Landroid/widget/Button;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public w1(Lcom/tv91/u/e/h/b;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/tv91/u/e/i/s;->e:Lcom/tv91/r/s;

    iget-object v0, v0, Lcom/tv91/r/s;->d:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lcom/tv91/u/e/i/s$b;

    iget-object v2, p1, Lcom/tv91/u/e/h/b;->g:Ljava/util/List;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/tv91/u/e/i/s$b;-><init>(Ljava/util/List;Lcom/tv91/u/e/i/s$a;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/e/i/s;->e:Lcom/tv91/r/s;

    iget-object v0, v0, Lcom/tv91/r/s;->e:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    iget v3, p1, Lcom/tv91/u/e/h/b;->e:I

    .line 3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const v3, 0x7f120190

    invoke-virtual {p0, v3, v2}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/e/i/s;->e:Lcom/tv91/r/s;

    iget-object v0, v0, Lcom/tv91/r/s;->b:Landroid/widget/Button;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p1, Lcom/tv91/u/e/h/b;->c:I

    .line 6
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    iget v3, p1, Lcom/tv91/u/e/h/b;->d:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v1

    const v3, 0x7f120191

    invoke-virtual {p0, v3, v2}, Lcom/tv91/features/shared/f;->o2(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 7
    invoke-virtual {v0, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-boolean p1, p1, Lcom/tv91/u/e/h/b;->f:Z

    if-eqz p1, :cond_0

    .line 9
    iget-object p1, p0, Lcom/tv91/u/e/i/s;->e:Lcom/tv91/r/s;

    iget-object p1, p1, Lcom/tv91/r/s;->b:Landroid/widget/Button;

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 10
    iget-object p1, p0, Lcom/tv91/u/e/i/s;->e:Lcom/tv91/r/s;

    iget-object p1, p1, Lcom/tv91/r/s;->b:Landroid/widget/Button;

    const v0, 0x7f06007a

    invoke-virtual {p0, v0}, Lcom/tv91/features/shared/f;->l2(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setTextColor(I)V

    .line 11
    iget-object p1, p0, Lcom/tv91/u/e/i/s;->e:Lcom/tv91/r/s;

    iget-object p1, p1, Lcom/tv91/r/s;->b:Landroid/widget/Button;

    const v0, 0x7f08005a

    .line 12
    invoke-virtual {p1, v0}, Landroid/widget/Button;->setBackgroundResource(I)V

    goto :goto_0

    .line 13
    :cond_0
    iget-object p1, p0, Lcom/tv91/u/e/i/s;->e:Lcom/tv91/r/s;

    iget-object p1, p1, Lcom/tv91/r/s;->b:Landroid/widget/Button;

    invoke-virtual {p1, v4}, Landroid/widget/Button;->setEnabled(Z)V

    .line 14
    iget-object p1, p0, Lcom/tv91/u/e/i/s;->e:Lcom/tv91/r/s;

    iget-object p1, p1, Lcom/tv91/r/s;->b:Landroid/widget/Button;

    const v0, 0x7f06007b

    .line 15
    invoke-virtual {p0, v0}, Lcom/tv91/features/shared/f;->l2(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setTextColor(I)V

    .line 16
    iget-object p1, p0, Lcom/tv91/u/e/i/s;->e:Lcom/tv91/r/s;

    iget-object p1, p1, Lcom/tv91/r/s;->b:Landroid/widget/Button;

    const v0, 0x7f08005b

    .line 17
    invoke-virtual {p1, v0}, Landroid/widget/Button;->setBackgroundResource(I)V

    :goto_0
    return-void
.end method
