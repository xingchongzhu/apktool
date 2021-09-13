.class Lcom/tv91/u/c/f/b2$f;
.super Ljava/lang/Object;
.source "MovieView.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/c/f/b2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "f"
.end annotation


# instance fields
.field private final a:Ljava/lang/Runnable;

.field final synthetic b:Lcom/tv91/u/c/f/b2;


# direct methods
.method private constructor <init>(Lcom/tv91/u/c/f/b2;Ljava/lang/Runnable;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tv91/u/c/f/b2$f;->b:Lcom/tv91/u/c/f/b2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lcom/tv91/u/c/f/b2$f;->a:Ljava/lang/Runnable;

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/u/c/f/b2;Ljava/lang/Runnable;Lcom/tv91/u/c/f/b2$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tv91/u/c/f/b2$f;-><init>(Lcom/tv91/u/c/f/b2;Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public onScrollChanged()V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/tv91/u/c/f/b2$f;->b:Lcom/tv91/u/c/f/b2;

    invoke-static {v1}, Lcom/tv91/u/c/f/b2;->q2(Lcom/tv91/u/c/f/b2;)Lcom/tv91/r/k0;

    move-result-object v1

    iget-object v1, v1, Lcom/tv91/r/k0;->q:Landroid/widget/ScrollView;

    invoke-virtual {v1, v0}, Landroid/widget/ScrollView;->getHitRect(Landroid/graphics/Rect;)V

    .line 3
    iget-object v1, p0, Lcom/tv91/u/c/f/b2$f;->b:Lcom/tv91/u/c/f/b2;

    invoke-static {v1}, Lcom/tv91/u/c/f/b2;->q2(Lcom/tv91/u/c/f/b2;)Lcom/tv91/r/k0;

    move-result-object v1

    iget-object v1, v1, Lcom/tv91/r/k0;->B:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->getLocalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/tv91/u/c/f/b2$f;->b:Lcom/tv91/u/c/f/b2;

    invoke-static {v0}, Lcom/tv91/u/c/f/b2;->q2(Lcom/tv91/u/c/f/b2;)Lcom/tv91/r/k0;

    move-result-object v0

    iget-object v0, v0, Lcom/tv91/r/k0;->q:Landroid/widget/ScrollView;

    invoke-virtual {v0}, Landroid/widget/ScrollView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/c/f/b2$f;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method
