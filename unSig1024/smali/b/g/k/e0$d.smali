.class Lb/g/k/e0$d;
.super Lb/g/k/e0$f;
.source "WindowInsetsCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/g/k/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field final c:Landroid/view/WindowInsets$Builder;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lb/g/k/e0$f;-><init>()V

    .line 2
    new-instance v0, Landroid/view/WindowInsets$Builder;

    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    iput-object v0, p0, Lb/g/k/e0$d;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method constructor <init>(Lb/g/k/e0;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Lb/g/k/e0$f;-><init>()V

    .line 4
    invoke-virtual {p1}, Lb/g/k/e0;->r()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    new-instance v0, Landroid/view/WindowInsets$Builder;

    invoke-direct {v0, p1}, Landroid/view/WindowInsets$Builder;-><init>(Landroid/view/WindowInsets;)V

    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Landroid/view/WindowInsets$Builder;

    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    :goto_0
    iput-object v0, p0, Lb/g/k/e0$d;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method b()Lb/g/k/e0;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lb/g/k/e0$f;->a()V

    .line 2
    iget-object v0, p0, Lb/g/k/e0$d;->c:Landroid/view/WindowInsets$Builder;

    .line 3
    invoke-virtual {v0}, Landroid/view/WindowInsets$Builder;->build()Landroid/view/WindowInsets;

    move-result-object v0

    .line 4
    invoke-static {v0}, Lb/g/k/e0;->s(Landroid/view/WindowInsets;)Lb/g/k/e0;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lb/g/k/e0$f;->b:[Lb/g/d/b;

    invoke-virtual {v0, v1}, Lb/g/k/e0;->n([Lb/g/d/b;)V

    return-object v0
.end method

.method c(Lb/g/d/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb/g/k/e0$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lb/g/d/b;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setMandatorySystemGestureInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method d(Lb/g/d/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb/g/k/e0$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lb/g/d/b;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setStableInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method e(Lb/g/d/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb/g/k/e0$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lb/g/d/b;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setSystemGestureInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method f(Lb/g/d/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb/g/k/e0$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lb/g/d/b;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setSystemWindowInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method g(Lb/g/d/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb/g/k/e0$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lb/g/d/b;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setTappableElementInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method
