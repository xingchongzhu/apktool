.class final Lc/a/a/b/r/a$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "CircularRevealCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/a/a/b/r/a;->b(Lc/a/a/b/r/d;)Landroid/animation/Animator$AnimatorListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc/a/a/b/r/d;


# direct methods
.method constructor <init>(Lc/a/a/b/r/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/b/r/a$a;->a:Lc/a/a/b/r/d;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lc/a/a/b/r/a$a;->a:Lc/a/a/b/r/d;

    invoke-interface {p1}, Lc/a/a/b/r/d;->a()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lc/a/a/b/r/a$a;->a:Lc/a/a/b/r/d;

    invoke-interface {p1}, Lc/a/a/b/r/d;->b()V

    return-void
.end method
