.class Lcom/tv91/l$a;
.super Ljava/lang/Object;
.source "Hilt_App.java"

# interfaces
.implements Ldagger/hilt/android/internal/managers/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tv91/l;


# direct methods
.method constructor <init>(Lcom/tv91/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/l$a;->a:Lcom/tv91/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lcom/tv91/k;->r()Lcom/tv91/k$d;

    move-result-object v0

    new-instance v1, Ld/a/b/d/c/a;

    iget-object v2, p0, Lcom/tv91/l$a;->a:Lcom/tv91/l;

    invoke-direct {v1, v2}, Ld/a/b/d/c/a;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/k$d;->a(Ld/a/b/d/c/a;)Lcom/tv91/k$d;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/tv91/k$d;->b()Lcom/tv91/i;

    move-result-object v0

    return-object v0
.end method
