.class public abstract Lcom/tv91/features/shared/f;
.super Ljava/lang/Object;
.source "BasicView.java"

# interfaces
.implements Lcom/tv91/q/a/f;


# static fields
.field private static final a:Landroid/graphics/drawable/Drawable;


# instance fields
.field protected final b:Landroid/content/Context;

.field protected final c:Lcom/tv91/z/f;

.field private final d:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    sput-object v0, Lcom/tv91/features/shared/f;->a:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/tv91/features/shared/f;->d:Landroid/view/View;

    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    .line 5
    invoke-static {p1}, Lcom/tv91/z/d;->e(Landroid/content/Context;)Lcom/tv91/z/f;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/features/shared/f;->c:Lcom/tv91/z/f;

    return-void
.end method

.method public constructor <init>(Lb/r/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VB::",
            "Lb/r/a;",
            ">(TVB;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lb/r/a;->a()Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/tv91/features/shared/f;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public synthetic J(Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/q/a/e;->a(Lcom/tv91/q/a/f;Landroid/os/Bundle;)V

    return-void
.end method

.method public synthetic g0(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/q/a/e;->c(Lcom/tv91/q/a/f;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic h2(Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/q/a/e;->b(Lcom/tv91/q/a/f;Landroid/os/Bundle;)V

    return-void
.end method

.method protected l2(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Landroidx/core/content/a;->b(Landroid/content/Context;I)I

    move-result p1

    return p1
.end method

.method protected m2(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p1

    return p1
.end method

.method protected n2(I)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Landroidx/core/content/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-nez p1, :cond_0

    .line 2
    sget-object p1, Lcom/tv91/features/shared/f;->a:Landroid/graphics/drawable/Drawable;

    :cond_0
    return-object p1
.end method

.method protected varargs o2(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    invoke-virtual {v0, p1, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected p2(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/features/shared/f;->b:Landroid/content/Context;

    const-class v1, Landroid/view/inputmethod/InputMethodManager;

    invoke-static {v0, v1}, Landroidx/core/content/a;->g(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object p1

    const/4 v1, 0x2

    invoke-virtual {v0, p1, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    :cond_0
    return-void
.end method
