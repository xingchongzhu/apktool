.class Lcom/tv91/u/a/n/r$a;
.super Ljava/lang/Object;
.source "CategoryView.java"

# interfaces
.implements Landroid/widget/SearchView$OnQueryTextListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tv91/u/a/n/r;->h0(Lb/g/j/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/g/j/a;

.field final synthetic b:Lcom/tv91/u/a/n/r;


# direct methods
.method constructor <init>(Lcom/tv91/u/a/n/r;Lb/g/j/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/u/a/n/r$a;->b:Lcom/tv91/u/a/n/r;

    iput-object p2, p0, Lcom/tv91/u/a/n/r$a;->a:Lb/g/j/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/n/r$a;->a:Lb/g/j/a;

    invoke-interface {v0, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
