.class Lb/g/k/e0$i;
.super Lb/g/k/e0$h;
.source "WindowInsetsCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/g/k/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "i"
.end annotation


# direct methods
.method constructor <init>(Lb/g/k/e0;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lb/g/k/e0$h;-><init>(Lb/g/k/e0;Landroid/view/WindowInsets;)V

    return-void
.end method

.method constructor <init>(Lb/g/k/e0;Lb/g/k/e0$i;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lb/g/k/e0$h;-><init>(Lb/g/k/e0;Lb/g/k/e0$h;)V

    return-void
.end method


# virtual methods
.method a()Lb/g/k/e0;
    .locals 1

    .line 1
    iget-object v0, p0, Lb/g/k/e0$g;->i:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeDisplayCutout()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, Lb/g/k/e0;->s(Landroid/view/WindowInsets;)Lb/g/k/e0;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lb/g/k/e0$i;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 2
    :cond_1
    check-cast p1, Lb/g/k/e0$i;

    .line 3
    iget-object v1, p0, Lb/g/k/e0$g;->i:Landroid/view/WindowInsets;

    iget-object v3, p1, Lb/g/k/e0$g;->i:Landroid/view/WindowInsets;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lb/g/k/e0$g;->m:Lb/g/d/b;

    iget-object p1, p1, Lb/g/k/e0$g;->m:Lb/g/d/b;

    .line 4
    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method f()Lb/g/k/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lb/g/k/e0$g;->i:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getDisplayCutout()Landroid/view/DisplayCutout;

    move-result-object v0

    invoke-static {v0}, Lb/g/k/d;->a(Ljava/lang/Object;)Lb/g/k/d;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lb/g/k/e0$g;->i:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->hashCode()I

    move-result v0

    return v0
.end method
