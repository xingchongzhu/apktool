.class Lb/e/b/k/m/o$a;
.super Ljava/lang/Object;
.source "WidgetGroup.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/e/b/k/m/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lb/e/b/k/e;",
            ">;"
        }
    .end annotation
.end field

.field b:I

.field c:I

.field d:I

.field e:I

.field f:I

.field g:I

.field final synthetic h:Lb/e/b/k/m/o;


# direct methods
.method public constructor <init>(Lb/e/b/k/m/o;Lb/e/b/k/e;Lb/e/b/d;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb/e/b/k/m/o$a;->h:Lb/e/b/k/m/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lb/e/b/k/m/o$a;->a:Ljava/lang/ref/WeakReference;

    .line 3
    iget-object p1, p2, Lb/e/b/k/e;->I:Lb/e/b/k/d;

    invoke-virtual {p3, p1}, Lb/e/b/d;->x(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lb/e/b/k/m/o$a;->b:I

    .line 4
    iget-object p1, p2, Lb/e/b/k/e;->J:Lb/e/b/k/d;

    invoke-virtual {p3, p1}, Lb/e/b/d;->x(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lb/e/b/k/m/o$a;->c:I

    .line 5
    iget-object p1, p2, Lb/e/b/k/e;->K:Lb/e/b/k/d;

    invoke-virtual {p3, p1}, Lb/e/b/d;->x(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lb/e/b/k/m/o$a;->d:I

    .line 6
    iget-object p1, p2, Lb/e/b/k/e;->L:Lb/e/b/k/d;

    invoke-virtual {p3, p1}, Lb/e/b/d;->x(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lb/e/b/k/m/o$a;->e:I

    .line 7
    iget-object p1, p2, Lb/e/b/k/e;->M:Lb/e/b/k/d;

    invoke-virtual {p3, p1}, Lb/e/b/d;->x(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lb/e/b/k/m/o$a;->f:I

    .line 8
    iput p4, p0, Lb/e/b/k/m/o$a;->g:I

    return-void
.end method
