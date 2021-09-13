.class Lc/a/a/b/z/d$a;
.super Landroidx/core/content/c/f$a;
.source "TextAppearance.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/a/a/b/z/d;->h(Landroid/content/Context;Lc/a/a/b/z/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc/a/a/b/z/f;

.field final synthetic b:Lc/a/a/b/z/d;


# direct methods
.method constructor <init>(Lc/a/a/b/z/d;Lc/a/a/b/z/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/b/z/d$a;->b:Lc/a/a/b/z/d;

    iput-object p2, p0, Lc/a/a/b/z/d$a;->a:Lc/a/a/b/z/f;

    invoke-direct {p0}, Landroidx/core/content/c/f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public d(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/b/z/d$a;->b:Lc/a/a/b/z/d;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lc/a/a/b/z/d;->c(Lc/a/a/b/z/d;Z)Z

    .line 2
    iget-object v0, p0, Lc/a/a/b/z/d$a;->a:Lc/a/a/b/z/f;

    invoke-virtual {v0, p1}, Lc/a/a/b/z/f;->a(I)V

    return-void
.end method

.method public e(Landroid/graphics/Typeface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/b/z/d$a;->b:Lc/a/a/b/z/d;

    iget v1, v0, Lc/a/a/b/z/d;->f:I

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-static {v0, p1}, Lc/a/a/b/z/d;->b(Lc/a/a/b/z/d;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 2
    iget-object p1, p0, Lc/a/a/b/z/d$a;->b:Lc/a/a/b/z/d;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lc/a/a/b/z/d;->c(Lc/a/a/b/z/d;Z)Z

    .line 3
    iget-object p1, p0, Lc/a/a/b/z/d$a;->a:Lc/a/a/b/z/f;

    iget-object v0, p0, Lc/a/a/b/z/d$a;->b:Lc/a/a/b/z/d;

    invoke-static {v0}, Lc/a/a/b/z/d;->a(Lc/a/a/b/z/d;)Landroid/graphics/Typeface;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lc/a/a/b/z/f;->b(Landroid/graphics/Typeface;Z)V

    return-void
.end method
