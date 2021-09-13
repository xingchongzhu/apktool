.class Lb/g/k/e0$j;
.super Lb/g/k/e0$i;
.source "WindowInsetsCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/g/k/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "j"
.end annotation


# instance fields
.field private o:Lb/g/d/b;

.field private p:Lb/g/d/b;

.field private q:Lb/g/d/b;


# direct methods
.method constructor <init>(Lb/g/k/e0;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lb/g/k/e0$i;-><init>(Lb/g/k/e0;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lb/g/k/e0$j;->o:Lb/g/d/b;

    .line 3
    iput-object p1, p0, Lb/g/k/e0$j;->p:Lb/g/d/b;

    .line 4
    iput-object p1, p0, Lb/g/k/e0$j;->q:Lb/g/d/b;

    return-void
.end method

.method constructor <init>(Lb/g/k/e0;Lb/g/k/e0$j;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lb/g/k/e0$i;-><init>(Lb/g/k/e0;Lb/g/k/e0$i;)V

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lb/g/k/e0$j;->o:Lb/g/d/b;

    .line 7
    iput-object p1, p0, Lb/g/k/e0$j;->p:Lb/g/d/b;

    .line 8
    iput-object p1, p0, Lb/g/k/e0$j;->q:Lb/g/d/b;

    return-void
.end method


# virtual methods
.method g()Lb/g/d/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lb/g/k/e0$j;->p:Lb/g/d/b;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lb/g/k/e0$g;->i:Landroid/view/WindowInsets;

    .line 3
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getMandatorySystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lb/g/d/b;->d(Landroid/graphics/Insets;)Lb/g/d/b;

    move-result-object v0

    iput-object v0, p0, Lb/g/k/e0$j;->p:Lb/g/d/b;

    .line 4
    :cond_0
    iget-object v0, p0, Lb/g/k/e0$j;->p:Lb/g/d/b;

    return-object v0
.end method

.method j(IIII)Lb/g/k/e0;
    .locals 1

    .line 1
    iget-object v0, p0, Lb/g/k/e0$g;->i:Landroid/view/WindowInsets;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/view/WindowInsets;->inset(IIII)Landroid/view/WindowInsets;

    move-result-object p1

    invoke-static {p1}, Lb/g/k/e0;->s(Landroid/view/WindowInsets;)Lb/g/k/e0;

    move-result-object p1

    return-object p1
.end method

.method public p(Lb/g/d/b;)V
    .locals 0

    return-void
.end method
