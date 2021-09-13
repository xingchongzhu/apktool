.class public final synthetic Lcom/tv91/u/a/o/i;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/a/o/o;

.field public final synthetic b:Lcom/tv91/model/ExternalSource;

.field public final synthetic c:Landroid/widget/ImageView;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/a/o/o;Lcom/tv91/model/ExternalSource;Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/a/o/i;->a:Lcom/tv91/u/a/o/o;

    iput-object p2, p0, Lcom/tv91/u/a/o/i;->b:Lcom/tv91/model/ExternalSource;

    iput-object p3, p0, Lcom/tv91/u/a/o/i;->c:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/tv91/u/a/o/i;->a:Lcom/tv91/u/a/o/o;

    iget-object v1, p0, Lcom/tv91/u/a/o/i;->b:Lcom/tv91/model/ExternalSource;

    iget-object v2, p0, Lcom/tv91/u/a/o/i;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v1, v2}, Lcom/tv91/u/a/o/o;->B2(Lcom/tv91/model/ExternalSource;Landroid/widget/ImageView;)V

    return-void
.end method
