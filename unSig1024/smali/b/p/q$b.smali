.class Lb/p/q$b;
.super Lb/p/n;
.source "TransitionSet.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/p/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field a:Lb/p/q;


# direct methods
.method constructor <init>(Lb/p/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lb/p/n;-><init>()V

    .line 2
    iput-object p1, p0, Lb/p/q$b;->a:Lb/p/q;

    return-void
.end method


# virtual methods
.method public a(Lb/p/m;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lb/p/q$b;->a:Lb/p/q;

    iget-boolean v0, p1, Lb/p/q;->P:Z

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lb/p/m;->d0()V

    .line 3
    iget-object p1, p0, Lb/p/q$b;->a:Lb/p/q;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lb/p/q;->P:Z

    :cond_0
    return-void
.end method

.method public e(Lb/p/m;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lb/p/q$b;->a:Lb/p/q;

    iget v1, v0, Lb/p/q;->O:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lb/p/q;->O:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 2
    iput-boolean v1, v0, Lb/p/q;->P:Z

    .line 3
    invoke-virtual {v0}, Lb/p/m;->o()V

    .line 4
    :cond_0
    invoke-virtual {p1, p0}, Lb/p/m;->O(Lb/p/m$f;)Lb/p/m;

    return-void
.end method
