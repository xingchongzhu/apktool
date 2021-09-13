.class public final synthetic Lcom/tv91/features/movie/play/a;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/tv91/features/movie/play/MoviePlayActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/features/movie/play/MoviePlayActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/features/movie/play/a;->a:Lcom/tv91/features/movie/play/MoviePlayActivity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/tv91/features/movie/play/a;->a:Lcom/tv91/features/movie/play/MoviePlayActivity;

    invoke-virtual {v0, p1}, Lcom/tv91/features/movie/play/MoviePlayActivity;->X(Landroid/view/View;)V

    return-void
.end method
