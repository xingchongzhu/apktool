.class public final synthetic Lcom/tv91/u/a/o/h;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/tv91/u/a/o/o;

.field public final synthetic b:Lcom/tv91/model/ExternalSource;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/a/o/o;Lcom/tv91/model/ExternalSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/a/o/h;->a:Lcom/tv91/u/a/o/o;

    iput-object p2, p0, Lcom/tv91/u/a/o/h;->b:Lcom/tv91/model/ExternalSource;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/a/o/h;->a:Lcom/tv91/u/a/o/o;

    iget-object v1, p0, Lcom/tv91/u/a/o/h;->b:Lcom/tv91/model/ExternalSource;

    invoke-virtual {v0, v1, p1}, Lcom/tv91/u/a/o/o;->z2(Lcom/tv91/model/ExternalSource;Landroid/view/View;)V

    return-void
.end method
