.class Landroidx/fragment/app/f$c;
.super Landroid/animation/AnimatorListenerAdapter;
.source "FragmentAnim.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/f;->a(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/f$d;Landroidx/fragment/app/y$g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/ViewGroup;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Landroidx/fragment/app/Fragment;

.field final synthetic d:Landroidx/fragment/app/y$g;

.field final synthetic e:Lb/g/g/b;


# direct methods
.method constructor <init>(Landroid/view/ViewGroup;Landroid/view/View;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/y$g;Lb/g/g/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/f$c;->a:Landroid/view/ViewGroup;

    iput-object p2, p0, Landroidx/fragment/app/f$c;->b:Landroid/view/View;

    iput-object p3, p0, Landroidx/fragment/app/f$c;->c:Landroidx/fragment/app/Fragment;

    iput-object p4, p0, Landroidx/fragment/app/f$c;->d:Landroidx/fragment/app/y$g;

    iput-object p5, p0, Landroidx/fragment/app/f$c;->e:Lb/g/g/b;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget-object p1, p0, Landroidx/fragment/app/f$c;->a:Landroid/view/ViewGroup;

    iget-object v0, p0, Landroidx/fragment/app/f$c;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 2
    iget-object p1, p0, Landroidx/fragment/app/f$c;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->F()Landroid/animation/Animator;

    move-result-object p1

    .line 3
    iget-object v0, p0, Landroidx/fragment/app/f$c;->c:Landroidx/fragment/app/Fragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->V1(Landroid/animation/Animator;)V

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Landroidx/fragment/app/f$c;->a:Landroid/view/ViewGroup;

    iget-object v0, p0, Landroidx/fragment/app/f$c;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    if-gez p1, :cond_0

    .line 5
    iget-object p1, p0, Landroidx/fragment/app/f$c;->d:Landroidx/fragment/app/y$g;

    iget-object v0, p0, Landroidx/fragment/app/f$c;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, p0, Landroidx/fragment/app/f$c;->e:Lb/g/g/b;

    invoke-interface {p1, v0, v1}, Landroidx/fragment/app/y$g;->a(Landroidx/fragment/app/Fragment;Lb/g/g/b;)V

    :cond_0
    return-void
.end method
