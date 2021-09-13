.class public final synthetic Lcom/tv91/u/f/f/e;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/f/f/i;

.field public final synthetic b:Lcom/tv91/model/FeedbackType;

.field public final synthetic c:Ljava/lang/CharSequence;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/f/f/i;Lcom/tv91/model/FeedbackType;Ljava/lang/CharSequence;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/f/f/e;->a:Lcom/tv91/u/f/f/i;

    iput-object p2, p0, Lcom/tv91/u/f/f/e;->b:Lcom/tv91/model/FeedbackType;

    iput-object p3, p0, Lcom/tv91/u/f/f/e;->c:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/tv91/u/f/f/e;->a:Lcom/tv91/u/f/f/i;

    iget-object v1, p0, Lcom/tv91/u/f/f/e;->b:Lcom/tv91/model/FeedbackType;

    iget-object v2, p0, Lcom/tv91/u/f/f/e;->c:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Lcom/tv91/u/f/f/i;->r(Lcom/tv91/model/FeedbackType;Ljava/lang/CharSequence;)V

    return-void
.end method
