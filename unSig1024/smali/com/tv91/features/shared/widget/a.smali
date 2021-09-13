.class public final synthetic Lcom/tv91/features/shared/widget/a;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/tv91/features/shared/widget/e$a;

.field public final synthetic b:Lcom/tv91/features/shared/widget/e;

.field public final synthetic c:Lcom/tv91/r/q;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/features/shared/widget/e$a;Lcom/tv91/features/shared/widget/e;Lcom/tv91/r/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/features/shared/widget/a;->a:Lcom/tv91/features/shared/widget/e$a;

    iput-object p2, p0, Lcom/tv91/features/shared/widget/a;->b:Lcom/tv91/features/shared/widget/e;

    iput-object p3, p0, Lcom/tv91/features/shared/widget/a;->c:Lcom/tv91/r/q;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/tv91/features/shared/widget/a;->a:Lcom/tv91/features/shared/widget/e$a;

    iget-object v1, p0, Lcom/tv91/features/shared/widget/a;->b:Lcom/tv91/features/shared/widget/e;

    iget-object v2, p0, Lcom/tv91/features/shared/widget/a;->c:Lcom/tv91/r/q;

    invoke-virtual {v0, v1, v2, p1}, Lcom/tv91/features/shared/widget/e$a;->c(Lcom/tv91/features/shared/widget/e;Lcom/tv91/r/q;Landroid/view/View;)V

    return-void
.end method
