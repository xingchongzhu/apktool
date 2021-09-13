.class public Lc/a/a/a/a2/c1;
.super Ljava/lang/Object;
.source "AnalyticsCollector.java"

# interfaces
.implements Lc/a/a/a/l1$a;
.implements Lc/a/a/a/b2/r;
.implements Lc/a/a/a/n2/z;
.implements Lc/a/a/a/j2/e0;
.implements Lcom/google/android/exoplayer2/upstream/g$a;
.implements Lc/a/a/a/e2/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/a2/c1$a;
    }
.end annotation


# instance fields
.field private final a:Lc/a/a/a/m2/g;

.field private final b:Lc/a/a/a/x1$b;

.field private final c:Lc/a/a/a/x1$c;

.field private final d:Lc/a/a/a/a2/c1$a;

.field private final e:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lc/a/a/a/a2/d1$a;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lc/a/a/a/m2/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/a/a/m2/s<",
            "Lc/a/a/a/a2/d1;",
            "Lc/a/a/a/a2/d1$b;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lc/a/a/a/l1;

.field private h:Z


# direct methods
.method public constructor <init>(Lc/a/a/a/m2/g;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/m2/g;

    iput-object v0, p0, Lc/a/a/a/a2/c1;->a:Lc/a/a/a/m2/g;

    .line 3
    new-instance v0, Lc/a/a/a/m2/s;

    .line 4
    invoke-static {}, Lc/a/a/a/m2/m0;->L()Landroid/os/Looper;

    move-result-object v1

    sget-object v2, Lc/a/a/a/a2/a;->a:Lc/a/a/a/a2/a;

    sget-object v3, Lc/a/a/a/a2/l;->a:Lc/a/a/a/a2/l;

    invoke-direct {v0, v1, p1, v2, v3}, Lc/a/a/a/m2/s;-><init>(Landroid/os/Looper;Lc/a/a/a/m2/g;Lc/a/b/a/k;Lc/a/a/a/m2/s$b;)V

    iput-object v0, p0, Lc/a/a/a/a2/c1;->f:Lc/a/a/a/m2/s;

    .line 5
    new-instance p1, Lc/a/a/a/x1$b;

    invoke-direct {p1}, Lc/a/a/a/x1$b;-><init>()V

    iput-object p1, p0, Lc/a/a/a/a2/c1;->b:Lc/a/a/a/x1$b;

    .line 6
    new-instance v0, Lc/a/a/a/x1$c;

    invoke-direct {v0}, Lc/a/a/a/x1$c;-><init>()V

    iput-object v0, p0, Lc/a/a/a/a2/c1;->c:Lc/a/a/a/x1$c;

    .line 7
    new-instance v0, Lc/a/a/a/a2/c1$a;

    invoke-direct {v0, p1}, Lc/a/a/a/a2/c1$a;-><init>(Lc/a/a/a/x1$b;)V

    iput-object v0, p0, Lc/a/a/a/a2/c1;->d:Lc/a/a/a/a2/c1$a;

    .line 8
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lc/a/a/a/a2/c1;->e:Landroid/util/SparseArray;

    return-void
.end method

.method static synthetic A0(Lc/a/a/a/a2/d1$a;ZLc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->V(Lc/a/a/a/a2/d1$a;Z)V

    return-void
.end method

.method static synthetic B0(Lc/a/a/a/a2/d1$a;ZLc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->e(Lc/a/a/a/a2/d1$a;Z)V

    return-void
.end method

.method static synthetic C0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p3, p0, p1, p2}, Lc/a/a/a/a2/d1;->Z(Lc/a/a/a/a2/d1$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    return-void
.end method

.method static synthetic D0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p3, p0, p1, p2}, Lc/a/a/a/a2/d1;->g(Lc/a/a/a/a2/d1$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    return-void
.end method

.method static synthetic E0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Ljava/io/IOException;ZLc/a/a/a/a2/d1;)V
    .locals 6

    move-object v0, p5

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    .line 1
    invoke-interface/range {v0 .. v5}, Lc/a/a/a/a2/d1;->I(Lc/a/a/a/a2/d1$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Ljava/io/IOException;Z)V

    return-void
.end method

.method static synthetic F0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p3, p0, p1, p2}, Lc/a/a/a/a2/d1;->q(Lc/a/a/a/a2/d1$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    return-void
.end method

.method static synthetic G0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/z0;ILc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p3, p0, p1, p2}, Lc/a/a/a/a2/d1;->D(Lc/a/a/a/a2/d1$a;Lc/a/a/a/z0;I)V

    return-void
.end method

.method static synthetic H0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/h2/a;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->N(Lc/a/a/a/a2/d1$a;Lc/a/a/a/h2/a;)V

    return-void
.end method

.method static synthetic I0(Lc/a/a/a/a2/d1$a;ZILc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p3, p0, p1, p2}, Lc/a/a/a/a2/d1;->r(Lc/a/a/a/a2/d1$a;ZI)V

    return-void
.end method

.method static synthetic J0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/i1;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->B(Lc/a/a/a/a2/d1$a;Lc/a/a/a/i1;)V

    return-void
.end method

.method static synthetic K0(Lc/a/a/a/a2/d1$a;ILc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->W(Lc/a/a/a/a2/d1$a;I)V

    return-void
.end method

.method static synthetic L0(Lc/a/a/a/a2/d1$a;ILc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->z(Lc/a/a/a/a2/d1$a;I)V

    return-void
.end method

.method static synthetic M0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/p0;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->d0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/p0;)V

    return-void
.end method

.method static synthetic N0(Lc/a/a/a/a2/d1$a;ZILc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p3, p0, p1, p2}, Lc/a/a/a/a2/d1;->T(Lc/a/a/a/a2/d1$a;ZI)V

    return-void
.end method

.method static synthetic O0(Lc/a/a/a/a2/d1$a;ILc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->u(Lc/a/a/a/a2/d1$a;I)V

    return-void
.end method

.method static synthetic P0(Lc/a/a/a/a2/d1$a;Landroid/view/Surface;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->F(Lc/a/a/a/a2/d1$a;Landroid/view/Surface;)V

    return-void
.end method

.method static synthetic Q0(Lc/a/a/a/a2/d1$a;ILc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->O(Lc/a/a/a/a2/d1$a;I)V

    return-void
.end method

.method static synthetic R0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lc/a/a/a/a2/d1;->p(Lc/a/a/a/a2/d1$a;)V

    return-void
.end method

.method static synthetic S0(Lc/a/a/a/a2/d1$a;ZLc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->c(Lc/a/a/a/a2/d1$a;Z)V

    return-void
.end method

.method static synthetic T0(Lc/a/a/a/a2/d1$a;ZLc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->k(Lc/a/a/a/a2/d1$a;Z)V

    return-void
.end method

.method static synthetic U0(Lc/a/a/a/a2/d1$a;Ljava/util/List;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->S(Lc/a/a/a/a2/d1$a;Ljava/util/List;)V

    return-void
.end method

.method static synthetic V0(Lc/a/a/a/a2/d1$a;IILc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p3, p0, p1, p2}, Lc/a/a/a/a2/d1;->b(Lc/a/a/a/a2/d1$a;II)V

    return-void
.end method

.method static synthetic W0(Lc/a/a/a/a2/d1$a;ILc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->x(Lc/a/a/a/a2/d1$a;I)V

    return-void
.end method

.method static synthetic X0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/j2/q0;Lc/a/a/a/l2/l;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p3, p0, p1, p2}, Lc/a/a/a/a2/d1;->a0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/j2/q0;Lc/a/a/a/l2/l;)V

    return-void
.end method

.method static synthetic Y0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/j2/z;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->h(Lc/a/a/a/a2/d1$a;Lc/a/a/a/j2/z;)V

    return-void
.end method

.method static synthetic Z0(Lc/a/a/a/a2/d1$a;Ljava/lang/String;JLc/a/a/a/a2/d1;)V
    .locals 6

    .line 1
    invoke-interface {p4, p0, p1, p2, p3}, Lc/a/a/a/a2/d1;->A(Lc/a/a/a/a2/d1$a;Ljava/lang/String;J)V

    const/4 v2, 0x2

    move-object v0, p4

    move-object v1, p0

    move-object v3, p1

    move-wide v4, p2

    .line 2
    invoke-interface/range {v0 .. v5}, Lc/a/a/a/a2/d1;->t(Lc/a/a/a/a2/d1$a;ILjava/lang/String;J)V

    return-void
.end method

.method static synthetic a1(Lc/a/a/a/a2/d1$a;Ljava/lang/String;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->l(Lc/a/a/a/a2/d1$a;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b1(Lc/a/a/a/a2/d1$a;Lc/a/a/a/c2/d;Lc/a/a/a/a2/d1;)V
    .locals 1

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->Y(Lc/a/a/a/a2/d1$a;Lc/a/a/a/c2/d;)V

    const/4 v0, 0x2

    .line 2
    invoke-interface {p2, p0, v0, p1}, Lc/a/a/a/a2/d1;->P(Lc/a/a/a/a2/d1$a;ILc/a/a/a/c2/d;)V

    return-void
.end method

.method private c0(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/a2/c1;->g:Lc/a/a/a/l1;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object v1, v0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v1, p0, Lc/a/a/a/a2/c1;->d:Lc/a/a/a/a2/c1$a;

    invoke-virtual {v1, p1}, Lc/a/a/a/a2/c1$a;->f(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/x1;

    move-result-object v1

    :goto_0
    if-eqz p1, :cond_2

    if-nez v1, :cond_1

    goto :goto_1

    .line 3
    :cond_1
    iget-object v0, p1, Lc/a/a/a/j2/b0;->a:Ljava/lang/Object;

    iget-object v2, p0, Lc/a/a/a/a2/c1;->b:Lc/a/a/a/x1$b;

    invoke-virtual {v1, v0, v2}, Lc/a/a/a/x1;->h(Ljava/lang/Object;Lc/a/a/a/x1$b;)Lc/a/a/a/x1$b;

    move-result-object v0

    iget v0, v0, Lc/a/a/a/x1$b;->c:I

    .line 4
    invoke-virtual {p0, v1, v0, p1}, Lc/a/a/a/a2/c1;->b0(Lc/a/a/a/x1;ILc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;

    move-result-object p1

    return-object p1

    .line 5
    :cond_2
    :goto_1
    iget-object p1, p0, Lc/a/a/a/a2/c1;->g:Lc/a/a/a/l1;

    invoke-interface {p1}, Lc/a/a/a/l1;->R()I

    move-result p1

    .line 6
    iget-object v1, p0, Lc/a/a/a/a2/c1;->g:Lc/a/a/a/l1;

    invoke-interface {v1}, Lc/a/a/a/l1;->M()Lc/a/a/a/x1;

    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lc/a/a/a/x1;->p()I

    move-result v2

    if-ge p1, v2, :cond_3

    const/4 v2, 0x1

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_4

    goto :goto_3

    .line 8
    :cond_4
    sget-object v1, Lc/a/a/a/x1;->a:Lc/a/a/a/x1;

    .line 9
    :goto_3
    invoke-virtual {p0, v1, p1, v0}, Lc/a/a/a/a2/c1;->b0(Lc/a/a/a/x1;ILc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;

    move-result-object p1

    return-object p1
.end method

.method static synthetic c1(Lc/a/a/a/a2/d1$a;Lc/a/a/a/c2/d;Lc/a/a/a/a2/d1;)V
    .locals 1

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->L(Lc/a/a/a/a2/d1$a;Lc/a/a/a/c2/d;)V

    const/4 v0, 0x2

    .line 2
    invoke-interface {p2, p0, v0, p1}, Lc/a/a/a/a2/d1;->J(Lc/a/a/a/a2/d1$a;ILc/a/a/a/c2/d;)V

    return-void
.end method

.method private d0()Lc/a/a/a/a2/d1$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/a2/c1;->d:Lc/a/a/a/a2/c1$a;

    invoke-virtual {v0}, Lc/a/a/a/a2/c1$a;->e()Lc/a/a/a/j2/d0$a;

    move-result-object v0

    invoke-direct {p0, v0}, Lc/a/a/a/a2/c1;->c0(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d1(Lc/a/a/a/a2/d1$a;JILc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p4, p0, p1, p2, p3}, Lc/a/a/a/a2/d1;->n(Lc/a/a/a/a2/d1$a;JI)V

    return-void
.end method

.method private e0(ILc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/a2/c1;->g:Lc/a/a/a/l1;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_2

    .line 2
    iget-object v2, p0, Lc/a/a/a/a2/c1;->d:Lc/a/a/a/a2/c1$a;

    .line 3
    invoke-virtual {v2, p2}, Lc/a/a/a/a2/c1$a;->f(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/x1;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 4
    invoke-direct {p0, p2}, Lc/a/a/a/a2/c1;->c0(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;

    move-result-object p1

    goto :goto_1

    .line 5
    :cond_1
    sget-object v0, Lc/a/a/a/x1;->a:Lc/a/a/a/x1;

    invoke-virtual {p0, v0, p1, p2}, Lc/a/a/a/a2/c1;->b0(Lc/a/a/a/x1;ILc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;

    move-result-object p1

    :goto_1
    return-object p1

    .line 6
    :cond_2
    iget-object p2, p0, Lc/a/a/a/a2/c1;->g:Lc/a/a/a/l1;

    invoke-interface {p2}, Lc/a/a/a/l1;->M()Lc/a/a/a/x1;

    move-result-object p2

    .line 7
    invoke-virtual {p2}, Lc/a/a/a/x1;->p()I

    move-result v2

    if-ge p1, v2, :cond_3

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_4

    goto :goto_3

    .line 8
    :cond_4
    sget-object p2, Lc/a/a/a/x1;->a:Lc/a/a/a/x1;

    :goto_3
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, p2, p1, v0}, Lc/a/a/a/a2/c1;->b0(Lc/a/a/a/x1;ILc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;

    move-result-object p1

    return-object p1
.end method

.method static synthetic e1(Lc/a/a/a/a2/d1$a;Lc/a/a/a/u0;Lc/a/a/a/c2/g;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p3, p0, p1, p2}, Lc/a/a/a/a2/d1;->s(Lc/a/a/a/a2/d1$a;Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V

    const/4 p2, 0x2

    .line 2
    invoke-interface {p3, p0, p2, p1}, Lc/a/a/a/a2/d1;->m(Lc/a/a/a/a2/d1$a;ILc/a/a/a/u0;)V

    return-void
.end method

.method private f0()Lc/a/a/a/a2/d1$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/a2/c1;->d:Lc/a/a/a/a2/c1$a;

    invoke-virtual {v0}, Lc/a/a/a/a2/c1$a;->g()Lc/a/a/a/j2/d0$a;

    move-result-object v0

    invoke-direct {p0, v0}, Lc/a/a/a/a2/c1;->c0(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;

    move-result-object v0

    return-object v0
.end method

.method static synthetic f1(Lc/a/a/a/a2/d1$a;IIIFLc/a/a/a/a2/d1;)V
    .locals 6

    move-object v0, p5

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    .line 1
    invoke-interface/range {v0 .. v5}, Lc/a/a/a/a2/d1;->d(Lc/a/a/a/a2/d1$a;IIIF)V

    return-void
.end method

.method private g0()Lc/a/a/a/a2/d1$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/a2/c1;->d:Lc/a/a/a/a2/c1$a;

    invoke-virtual {v0}, Lc/a/a/a/a2/c1$a;->h()Lc/a/a/a/j2/d0$a;

    move-result-object v0

    invoke-direct {p0, v0}, Lc/a/a/a/a2/c1;->c0(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;

    move-result-object v0

    return-object v0
.end method

.method static synthetic g1(Lc/a/a/a/a2/d1$a;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lc/a/a/a/a2/d1;->Q(Lc/a/a/a/a2/d1$a;)V

    return-void
.end method

.method static synthetic h0(Lc/a/a/a/a2/d1;Lc/a/a/a/a2/d1$b;)V
    .locals 0

    return-void
.end method

.method private synthetic h1(Lc/a/a/a/l1;Lc/a/a/a/a2/d1;Lc/a/a/a/a2/d1$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/a2/c1;->e:Landroid/util/SparseArray;

    invoke-virtual {p3, v0}, Lc/a/a/a/a2/d1$b;->f(Landroid/util/SparseArray;)V

    .line 2
    invoke-interface {p2, p1, p3}, Lc/a/a/a/a2/d1;->R(Lc/a/a/a/l1;Lc/a/a/a/a2/d1$b;)V

    return-void
.end method

.method static synthetic i0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lc/a/a/a/a2/d1;->C(Lc/a/a/a/a2/d1$a;)V

    return-void
.end method

.method static synthetic j0(Lc/a/a/a/a2/d1$a;Ljava/lang/String;JLc/a/a/a/a2/d1;)V
    .locals 6

    .line 1
    invoke-interface {p4, p0, p1, p2, p3}, Lc/a/a/a/a2/d1;->M(Lc/a/a/a/a2/d1$a;Ljava/lang/String;J)V

    const/4 v2, 0x1

    move-object v0, p4

    move-object v1, p0

    move-object v3, p1

    move-wide v4, p2

    .line 2
    invoke-interface/range {v0 .. v5}, Lc/a/a/a/a2/d1;->t(Lc/a/a/a/a2/d1$a;ILjava/lang/String;J)V

    return-void
.end method

.method static synthetic k0(Lc/a/a/a/a2/d1$a;Ljava/lang/String;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->o(Lc/a/a/a/a2/d1$a;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic l0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/c2/d;Lc/a/a/a/a2/d1;)V
    .locals 1

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->G(Lc/a/a/a/a2/d1$a;Lc/a/a/a/c2/d;)V

    const/4 v0, 0x1

    .line 2
    invoke-interface {p2, p0, v0, p1}, Lc/a/a/a/a2/d1;->P(Lc/a/a/a/a2/d1$a;ILc/a/a/a/c2/d;)V

    return-void
.end method

.method static synthetic m0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/c2/d;Lc/a/a/a/a2/d1;)V
    .locals 1

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->H(Lc/a/a/a/a2/d1$a;Lc/a/a/a/c2/d;)V

    const/4 v0, 0x1

    .line 2
    invoke-interface {p2, p0, v0, p1}, Lc/a/a/a/a2/d1;->J(Lc/a/a/a/a2/d1$a;ILc/a/a/a/c2/d;)V

    return-void
.end method

.method static synthetic n0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/u0;Lc/a/a/a/c2/g;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p3, p0, p1, p2}, Lc/a/a/a/a2/d1;->K(Lc/a/a/a/a2/d1$a;Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V

    const/4 p2, 0x1

    .line 2
    invoke-interface {p3, p0, p2, p1}, Lc/a/a/a/a2/d1;->m(Lc/a/a/a/a2/d1$a;ILc/a/a/a/u0;)V

    return-void
.end method

.method static synthetic o0(Lc/a/a/a/a2/d1$a;JLc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p3, p0, p1, p2}, Lc/a/a/a/a2/d1;->b0(Lc/a/a/a/a2/d1$a;J)V

    return-void
.end method

.method static synthetic p0(Lc/a/a/a/a2/d1$a;Ljava/lang/Exception;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->j(Lc/a/a/a/a2/d1$a;Ljava/lang/Exception;)V

    return-void
.end method

.method static synthetic q0(Lc/a/a/a/a2/d1$a;IJJLc/a/a/a/a2/d1;)V
    .locals 7

    move-object v0, p6

    move-object v1, p0

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    .line 1
    invoke-interface/range {v0 .. v6}, Lc/a/a/a/a2/d1;->E(Lc/a/a/a/a2/d1$a;IJJ)V

    return-void
.end method

.method static synthetic r0(Lc/a/a/a/a2/d1$a;IJJLc/a/a/a/a2/d1;)V
    .locals 7

    move-object v0, p6

    move-object v1, p0

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    .line 1
    invoke-interface/range {v0 .. v6}, Lc/a/a/a/a2/d1;->a(Lc/a/a/a/a2/d1$a;IJJ)V

    return-void
.end method

.method static synthetic s0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/j2/z;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->f(Lc/a/a/a/a2/d1$a;Lc/a/a/a/j2/z;)V

    return-void
.end method

.method static synthetic t0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lc/a/a/a/a2/d1;->X(Lc/a/a/a/a2/d1$a;)V

    return-void
.end method

.method static synthetic u0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lc/a/a/a/a2/d1;->c0(Lc/a/a/a/a2/d1$a;)V

    return-void
.end method

.method static synthetic v0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lc/a/a/a/a2/d1;->y(Lc/a/a/a/a2/d1$a;)V

    return-void
.end method

.method static synthetic w0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lc/a/a/a/a2/d1;->U(Lc/a/a/a/a2/d1$a;)V

    return-void
.end method

.method static synthetic x0(Lc/a/a/a/a2/d1$a;Ljava/lang/Exception;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lc/a/a/a/a2/d1;->v(Lc/a/a/a/a2/d1$a;Ljava/lang/Exception;)V

    return-void
.end method

.method static synthetic y0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lc/a/a/a/a2/d1;->w(Lc/a/a/a/a2/d1$a;)V

    return-void
.end method

.method static synthetic z0(Lc/a/a/a/a2/d1$a;IJLc/a/a/a/a2/d1;)V
    .locals 0

    .line 1
    invoke-interface {p4, p0, p1, p2, p3}, Lc/a/a/a/a2/d1;->i(Lc/a/a/a/a2/d1$a;IJ)V

    return-void
.end method


# virtual methods
.method public final A(Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/a2/c1;->g0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/m0;

    invoke-direct {v1, v0, p1, p2}, Lc/a/a/a/a2/m0;-><init>(Lc/a/a/a/a2/d1$a;Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V

    const/16 p1, 0x3fe

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final B(J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/a2/c1;->g0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/y0;

    invoke-direct {v1, v0, p1, p2}, Lc/a/a/a/a2/y0;-><init>(Lc/a/a/a/a2/d1$a;J)V

    const/16 p1, 0x3f3

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final C(ILc/a/a/a/j2/d0$a;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/a2/c1;->e0(ILc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;

    move-result-object p1

    .line 2
    new-instance p2, Lc/a/a/a/a2/s;

    invoke-direct {p2, p1, p3}, Lc/a/a/a/a2/s;-><init>(Lc/a/a/a/a2/d1$a;Ljava/lang/Exception;)V

    const/16 p3, 0x408

    invoke-virtual {p0, p1, p3, p2}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final D(Lc/a/a/a/x1;I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/a/a/a/a2/c1;->d:Lc/a/a/a/a2/c1$a;

    iget-object v0, p0, Lc/a/a/a/a2/c1;->g:Lc/a/a/a/l1;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/l1;

    invoke-virtual {p1, v0}, Lc/a/a/a/a2/c1$a;->l(Lc/a/a/a/l1;)V

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/a2/c1;->a0()Lc/a/a/a/a2/d1$a;

    move-result-object p1

    .line 3
    new-instance v0, Lc/a/a/a/a2/u;

    invoke-direct {v0, p1, p2}, Lc/a/a/a/a2/u;-><init>(Lc/a/a/a/a2/d1$a;I)V

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final E(ILc/a/a/a/j2/d0$a;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/a2/c1;->e0(ILc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;

    move-result-object p1

    .line 2
    new-instance p2, Lc/a/a/a/a2/y;

    invoke-direct {p2, p1}, Lc/a/a/a/a2/y;-><init>(Lc/a/a/a/a2/d1$a;)V

    const/16 v0, 0x407

    invoke-virtual {p0, p1, v0, p2}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final F(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/a2/c1;->e0(ILc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;

    move-result-object p1

    .line 2
    new-instance p2, Lc/a/a/a/a2/o0;

    invoke-direct {p2, p1, p3, p4}, Lc/a/a/a/a2/o0;-><init>(Lc/a/a/a/a2/d1$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    const/16 p3, 0x3e8

    invoke-virtual {p0, p1, p3, p2}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final G(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/a2/c1;->a0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/b0;

    invoke-direct {v1, v0, p1}, Lc/a/a/a/a2/b0;-><init>(Lc/a/a/a/a2/d1$a;I)V

    const/4 p1, 0x5

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final H(ZI)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/a2/c1;->a0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/t0;

    invoke-direct {v1, v0, p1, p2}, Lc/a/a/a/a2/t0;-><init>(Lc/a/a/a/a2/d1$a;ZI)V

    const/4 p1, 0x6

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final I(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/a2/c1;->e0(ILc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;

    move-result-object p1

    .line 2
    new-instance p2, Lc/a/a/a/a2/w;

    invoke-direct {p2, p1, p3, p4}, Lc/a/a/a/a2/w;-><init>(Lc/a/a/a/a2/d1$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    const/16 p3, 0x3e9

    invoke-virtual {p0, p1, p3, p2}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final J(Landroid/view/Surface;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/a2/c1;->g0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/u0;

    invoke-direct {v1, v0, p1}, Lc/a/a/a/a2/u0;-><init>(Lc/a/a/a/a2/d1$a;Landroid/view/Surface;)V

    const/16 p1, 0x403

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final K(IJJ)V
    .locals 9

    .line 1
    invoke-direct {p0}, Lc/a/a/a/a2/c1;->d0()Lc/a/a/a/a2/d1$a;

    move-result-object v7

    .line 2
    new-instance v8, Lc/a/a/a/a2/k;

    move-object v0, v8

    move-object v1, v7

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-direct/range {v0 .. v6}, Lc/a/a/a/a2/k;-><init>(Lc/a/a/a/a2/d1$a;IJJ)V

    const/16 p1, 0x3ee

    invoke-virtual {p0, v7, p1, v8}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final L(Lc/a/a/a/j2/q0;Lc/a/a/a/l2/l;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/a2/c1;->a0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/h;

    invoke-direct {v1, v0, p1, p2}, Lc/a/a/a/a2/h;-><init>(Lc/a/a/a/a2/d1$a;Lc/a/a/a/j2/q0;Lc/a/a/a/l2/l;)V

    const/4 p1, 0x2

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final M(Lc/a/a/a/c2/d;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/a2/c1;->f0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/i;

    invoke-direct {v1, v0, p1}, Lc/a/a/a/a2/i;-><init>(Lc/a/a/a/a2/d1$a;Lc/a/a/a/c2/d;)V

    const/16 p1, 0x401

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final N(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/a2/c1;->g0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/f;

    invoke-direct {v1, v0, p1}, Lc/a/a/a/a2/f;-><init>(Lc/a/a/a/a2/d1$a;Ljava/lang/String;)V

    const/16 p1, 0x3f5

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final O(Ljava/lang/String;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/a/a/a/a2/c1;->g0()Lc/a/a/a/a2/d1$a;

    move-result-object p2

    .line 2
    new-instance p3, Lc/a/a/a/a2/v0;

    invoke-direct {p3, p2, p1, p4, p5}, Lc/a/a/a/a2/v0;-><init>(Lc/a/a/a/a2/d1$a;Ljava/lang/String;J)V

    const/16 p1, 0x3f1

    invoke-virtual {p0, p2, p1, p3}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final P(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/a2/c1;->a0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/v;

    invoke-direct {v1, v0, p1}, Lc/a/a/a/a2/v;-><init>(Lc/a/a/a/a2/d1$a;Z)V

    const/16 p1, 0xa

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final Q(ILc/a/a/a/j2/d0$a;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/a2/c1;->e0(ILc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;

    move-result-object p1

    .line 2
    new-instance p2, Lc/a/a/a/a2/l0;

    invoke-direct {p2, p1}, Lc/a/a/a/a2/l0;-><init>(Lc/a/a/a/a2/d1$a;)V

    const/16 v0, 0x40b

    invoke-virtual {p0, p1, v0, p2}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public synthetic R(Lc/a/a/a/l1;Lc/a/a/a/l1$b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc/a/a/a/k1;->a(Lc/a/a/a/l1$a;Lc/a/a/a/l1;Lc/a/a/a/l1$b;)V

    return-void
.end method

.method public synthetic S(Z)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->b(Lc/a/a/a/l1$a;Z)V

    return-void
.end method

.method public final T(IJJ)V
    .locals 9

    .line 1
    invoke-direct {p0}, Lc/a/a/a/a2/c1;->g0()Lc/a/a/a/a2/d1$a;

    move-result-object v7

    .line 2
    new-instance v8, Lc/a/a/a/a2/z0;

    move-object v0, v8

    move-object v1, v7

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-direct/range {v0 .. v6}, Lc/a/a/a/a2/z0;-><init>(Lc/a/a/a/a2/d1$a;IJJ)V

    const/16 p1, 0x3f4

    invoke-virtual {p0, v7, p1, v8}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final U(IJ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/a2/c1;->f0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/z;

    invoke-direct {v1, v0, p1, p2, p3}, Lc/a/a/a/a2/z;-><init>(Lc/a/a/a/a2/d1$a;IJ)V

    const/16 p1, 0x3ff

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final V(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Ljava/io/IOException;Z)V
    .locals 6

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/a2/c1;->e0(ILc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;

    move-result-object p1

    .line 2
    new-instance p2, Lc/a/a/a/a2/f0;

    move-object v0, p2

    move-object v1, p1

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move v5, p6

    invoke-direct/range {v0 .. v5}, Lc/a/a/a/a2/f0;-><init>(Lc/a/a/a/a2/d1$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Ljava/io/IOException;Z)V

    const/16 p3, 0x3eb

    invoke-virtual {p0, p1, p3, p2}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public synthetic W(Z)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->c(Lc/a/a/a/l1$a;Z)V

    return-void
.end method

.method public final X(JI)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/a2/c1;->f0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/p0;

    invoke-direct {v1, v0, p1, p2, p3}, Lc/a/a/a/a2/p0;-><init>(Lc/a/a/a/a2/d1$a;JI)V

    const/16 p1, 0x402

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final Y(ILc/a/a/a/j2/d0$a;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/a2/c1;->e0(ILc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;

    move-result-object p1

    .line 2
    new-instance p2, Lc/a/a/a/a2/p;

    invoke-direct {p2, p1}, Lc/a/a/a/a2/p;-><init>(Lc/a/a/a/a2/d1$a;)V

    const/16 v0, 0x409

    invoke-virtual {p0, p1, v0, p2}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public Z(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/a2/c1;->a0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/x0;

    invoke-direct {v1, v0, p1}, Lc/a/a/a/a2/x0;-><init>(Lc/a/a/a/a2/d1$a;Z)V

    const/16 p1, 0x8

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final a(Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/a2/c1;->g0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/g0;

    invoke-direct {v1, v0, p1}, Lc/a/a/a/a2/g0;-><init>(Lc/a/a/a/a2/d1$a;Z)V

    const/16 p1, 0x3f9

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method protected final a0()Lc/a/a/a/a2/d1$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/a2/c1;->d:Lc/a/a/a/a2/c1$a;

    invoke-virtual {v0}, Lc/a/a/a/a2/c1$a;->d()Lc/a/a/a/j2/d0$a;

    move-result-object v0

    invoke-direct {p0, v0}, Lc/a/a/a/a2/c1;->c0(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;

    move-result-object v0

    return-object v0
.end method

.method public final b(IIIF)V
    .locals 8

    .line 1
    invoke-direct {p0}, Lc/a/a/a/a2/c1;->g0()Lc/a/a/a/a2/d1$a;

    move-result-object v6

    .line 2
    new-instance v7, Lc/a/a/a/a2/j;

    move-object v0, v7

    move-object v1, v6

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lc/a/a/a/a2/j;-><init>(Lc/a/a/a/a2/d1$a;IIIF)V

    const/16 p1, 0x404

    invoke-virtual {p0, v6, p1, v7}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method protected final b0(Lc/a/a/a/x1;ILc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;
    .locals 17
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "player"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    move/from16 v5, p2

    .line 1
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/x1;->q()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object/from16 v6, p3

    .line 2
    :goto_0
    iget-object v1, v0, Lc/a/a/a/a2/c1;->a:Lc/a/a/a/m2/g;

    invoke-interface {v1}, Lc/a/a/a/m2/g;->c()J

    move-result-wide v2

    .line 3
    iget-object v1, v0, Lc/a/a/a/a2/c1;->g:Lc/a/a/a/l1;

    .line 4
    invoke-interface {v1}, Lc/a/a/a/l1;->M()Lc/a/a/a/x1;

    move-result-object v1

    invoke-virtual {v4, v1}, Lc/a/a/a/x1;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v1, :cond_1

    iget-object v1, v0, Lc/a/a/a/a2/c1;->g:Lc/a/a/a/l1;

    .line 5
    invoke-interface {v1}, Lc/a/a/a/l1;->R()I

    move-result v1

    if-ne v5, v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    const-wide/16 v9, 0x0

    if-eqz v6, :cond_3

    .line 6
    invoke-virtual {v6}, Lc/a/a/a/j2/b0;->b()Z

    move-result v11

    if-eqz v11, :cond_3

    if-eqz v1, :cond_2

    .line 7
    iget-object v1, v0, Lc/a/a/a/a2/c1;->g:Lc/a/a/a/l1;

    .line 8
    invoke-interface {v1}, Lc/a/a/a/l1;->z()I

    move-result v1

    iget v11, v6, Lc/a/a/a/j2/b0;->b:I

    if-ne v1, v11, :cond_2

    iget-object v1, v0, Lc/a/a/a/a2/c1;->g:Lc/a/a/a/l1;

    .line 9
    invoke-interface {v1}, Lc/a/a/a/l1;->D()I

    move-result v1

    iget v11, v6, Lc/a/a/a/j2/b0;->c:I

    if-ne v1, v11, :cond_2

    goto :goto_2

    :cond_2
    const/4 v7, 0x0

    :goto_2
    if-eqz v7, :cond_6

    .line 10
    iget-object v1, v0, Lc/a/a/a/a2/c1;->g:Lc/a/a/a/l1;

    invoke-interface {v1}, Lc/a/a/a/l1;->W()J

    move-result-wide v9

    goto :goto_3

    :cond_3
    if-eqz v1, :cond_4

    .line 11
    iget-object v1, v0, Lc/a/a/a/a2/c1;->g:Lc/a/a/a/l1;

    invoke-interface {v1}, Lc/a/a/a/l1;->i()J

    move-result-wide v7

    goto :goto_4

    .line 12
    :cond_4
    invoke-virtual/range {p1 .. p1}, Lc/a/a/a/x1;->q()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_3

    :cond_5
    iget-object v1, v0, Lc/a/a/a/a2/c1;->c:Lc/a/a/a/x1$c;

    invoke-virtual {v4, v5, v1}, Lc/a/a/a/x1;->n(ILc/a/a/a/x1$c;)Lc/a/a/a/x1$c;

    move-result-object v1

    invoke-virtual {v1}, Lc/a/a/a/x1$c;->b()J

    move-result-wide v9

    :cond_6
    :goto_3
    move-wide v7, v9

    .line 13
    :goto_4
    iget-object v1, v0, Lc/a/a/a/a2/c1;->d:Lc/a/a/a/a2/c1$a;

    invoke-virtual {v1}, Lc/a/a/a/a2/c1$a;->d()Lc/a/a/a/j2/d0$a;

    move-result-object v11

    .line 14
    new-instance v16, Lc/a/a/a/a2/d1$a;

    iget-object v1, v0, Lc/a/a/a/a2/c1;->g:Lc/a/a/a/l1;

    .line 15
    invoke-interface {v1}, Lc/a/a/a/l1;->M()Lc/a/a/a/x1;

    move-result-object v9

    iget-object v1, v0, Lc/a/a/a/a2/c1;->g:Lc/a/a/a/l1;

    .line 16
    invoke-interface {v1}, Lc/a/a/a/l1;->R()I

    move-result v10

    iget-object v1, v0, Lc/a/a/a/a2/c1;->g:Lc/a/a/a/l1;

    .line 17
    invoke-interface {v1}, Lc/a/a/a/l1;->W()J

    move-result-wide v12

    iget-object v1, v0, Lc/a/a/a/a2/c1;->g:Lc/a/a/a/l1;

    .line 18
    invoke-interface {v1}, Lc/a/a/a/l1;->j()J

    move-result-wide v14

    move-object/from16 v1, v16

    move-object/from16 v4, p1

    move/from16 v5, p2

    invoke-direct/range {v1 .. v15}, Lc/a/a/a/a2/d1$a;-><init>(JLc/a/a/a/x1;ILc/a/a/a/j2/d0$a;JLc/a/a/a/x1;ILc/a/a/a/j2/d0$a;JJ)V

    return-object v16
.end method

.method public final c(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/a2/c1;->a0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/q0;

    invoke-direct {v1, v0, p1}, Lc/a/a/a/a2/q0;-><init>(Lc/a/a/a/a2/d1$a;I)V

    const/16 p1, 0x9

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final d(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/a2/c1;->g0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/g;

    invoke-direct {v1, v0, p1}, Lc/a/a/a/a2/g;-><init>(Lc/a/a/a/a2/d1$a;Ljava/lang/Exception;)V

    const/16 p1, 0x3fa

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final e(Lc/a/a/a/i1;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/a2/c1;->a0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/c0;

    invoke-direct {v1, v0, p1}, Lc/a/a/a/a2/c0;-><init>(Lc/a/a/a/a2/d1$a;Lc/a/a/a/i1;)V

    const/16 p1, 0xd

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final f(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/a2/c1;->a0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/c;

    invoke-direct {v1, v0, p1}, Lc/a/a/a/a2/c;-><init>(Lc/a/a/a/a2/d1$a;I)V

    const/4 p1, 0x7

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final g(ZI)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/a2/c1;->a0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/s0;

    invoke-direct {v1, v0, p1, p2}, Lc/a/a/a/a2/s0;-><init>(Lc/a/a/a/a2/d1$a;ZI)V

    const/4 p1, -0x1

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final h(Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/a2/c1;->g0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/n0;

    invoke-direct {v1, v0, p1, p2}, Lc/a/a/a/a2/n0;-><init>(Lc/a/a/a/a2/d1$a;Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V

    const/16 p1, 0x3f2

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public synthetic i(Z)V
    .locals 0

    invoke-static {p0, p1}, Lc/a/a/a/k1;->f(Lc/a/a/a/l1$a;Z)V

    return-void
.end method

.method public synthetic i1(Lc/a/a/a/l1;Lc/a/a/a/a2/d1;Lc/a/a/a/a2/d1$b;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lc/a/a/a/a2/c1;->h1(Lc/a/a/a/l1;Lc/a/a/a/a2/d1;Lc/a/a/a/a2/d1$b;)V

    return-void
.end method

.method public final j(I)V
    .locals 3

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/a2/c1;->h:Z

    .line 2
    :cond_0
    iget-object v0, p0, Lc/a/a/a/a2/c1;->d:Lc/a/a/a/a2/c1$a;

    iget-object v1, p0, Lc/a/a/a/a2/c1;->g:Lc/a/a/a/l1;

    invoke-static {v1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/l1;

    invoke-virtual {v0, v1}, Lc/a/a/a/a2/c1$a;->j(Lc/a/a/a/l1;)V

    .line 3
    invoke-virtual {p0}, Lc/a/a/a/a2/c1;->a0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    const/16 v1, 0xc

    .line 4
    new-instance v2, Lc/a/a/a/a2/r0;

    invoke-direct {v2, v0, p1}, Lc/a/a/a/a2/r0;-><init>(Lc/a/a/a/a2/d1$a;I)V

    invoke-virtual {p0, v0, v1, v2}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final j1()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/a2/c1;->h:Z

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/a2/c1;->a0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    const/4 v1, 0x1

    .line 3
    iput-boolean v1, p0, Lc/a/a/a/a2/c1;->h:Z

    const/4 v1, -0x1

    .line 4
    new-instance v2, Lc/a/a/a/a2/w0;

    invoke-direct {v2, v0}, Lc/a/a/a/a2/w0;-><init>(Lc/a/a/a/a2/d1$a;)V

    invoke-virtual {p0, v0, v1, v2}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    :cond_0
    return-void
.end method

.method public final k(ILc/a/a/a/j2/d0$a;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/a2/c1;->e0(ILc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;

    move-result-object p1

    .line 2
    new-instance p2, Lc/a/a/a/a2/e0;

    invoke-direct {p2, p1}, Lc/a/a/a/a2/e0;-><init>(Lc/a/a/a/a2/d1$a;)V

    const/16 v0, 0x40a

    invoke-virtual {p0, p1, v0, p2}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final k1(Lc/a/a/a/h2/a;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/a2/c1;->a0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/d;

    invoke-direct {v1, v0, p1}, Lc/a/a/a/a2/d;-><init>(Lc/a/a/a/a2/d1$a;Lc/a/a/a/h2/a;)V

    const/16 p1, 0x3ef

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final l(Lc/a/a/a/c2/d;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/a2/c1;->f0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/t;

    invoke-direct {v1, v0, p1}, Lc/a/a/a/a2/t;-><init>(Lc/a/a/a/a2/d1$a;Lc/a/a/a/c2/d;)V

    const/16 p1, 0x3f6

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public l1(II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/a2/c1;->g0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/n;

    invoke-direct {v1, v0, p1, p2}, Lc/a/a/a/a2/n;-><init>(Lc/a/a/a/a2/d1$a;II)V

    const/16 p1, 0x405

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final m(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/a2/c1;->g0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/h0;

    invoke-direct {v1, v0, p1}, Lc/a/a/a/a2/h0;-><init>(Lc/a/a/a/a2/d1$a;Ljava/lang/String;)V

    const/16 p1, 0x400

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public m1()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/a2/c1;->a0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lc/a/a/a/a2/c1;->e:Landroid/util/SparseArray;

    const/16 v2, 0x40c

    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 3
    iget-object v1, p0, Lc/a/a/a/a2/c1;->f:Lc/a/a/a/m2/s;

    new-instance v3, Lc/a/a/a/a2/x;

    invoke-direct {v3, v0}, Lc/a/a/a/a2/x;-><init>(Lc/a/a/a/a2/d1$a;)V

    invoke-virtual {v1, v2, v3}, Lc/a/a/a/m2/s;->g(ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final n(Lc/a/a/a/c2/d;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/a2/c1;->g0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/r;

    invoke-direct {v1, v0, p1}, Lc/a/a/a/a2/r;-><init>(Lc/a/a/a/a2/d1$a;Lc/a/a/a/c2/d;)V

    const/16 p1, 0x3f0

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final n1()V
    .locals 0

    return-void
.end method

.method public final o(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/a/a/a/h2/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/a2/c1;->a0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/d0;

    invoke-direct {v1, v0, p1}, Lc/a/a/a/a2/d0;-><init>(Lc/a/a/a/a2/d1$a;Ljava/util/List;)V

    const/4 p1, 0x3

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method protected final o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/a2/d1$a;",
            "I",
            "Lc/a/a/a/m2/s$a<",
            "Lc/a/a/a/a2/d1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/a2/c1;->e:Landroid/util/SparseArray;

    invoke-virtual {v0, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 2
    iget-object p1, p0, Lc/a/a/a/a2/c1;->f:Lc/a/a/a/m2/s;

    invoke-virtual {p1, p2, p3}, Lc/a/a/a/m2/s;->k(ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final p(Ljava/lang/String;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/a/a/a/a2/c1;->g0()Lc/a/a/a/a2/d1$a;

    move-result-object p2

    .line 2
    new-instance p3, Lc/a/a/a/a2/m;

    invoke-direct {p3, p2, p1, p4, p5}, Lc/a/a/a/a2/m;-><init>(Lc/a/a/a/a2/d1$a;Ljava/lang/String;J)V

    const/16 p1, 0x3fd

    invoke-virtual {p0, p2, p1, p3}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public p1(Lc/a/a/a/l1;Landroid/os/Looper;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/a2/c1;->g:Lc/a/a/a/l1;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lc/a/a/a/a2/c1;->d:Lc/a/a/a/a2/c1$a;

    .line 2
    invoke-static {v0}, Lc/a/a/a/a2/c1$a;->a(Lc/a/a/a/a2/c1$a;)Lc/a/b/b/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 3
    :goto_1
    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 4
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/l1;

    iput-object v0, p0, Lc/a/a/a/a2/c1;->g:Lc/a/a/a/l1;

    .line 5
    iget-object v0, p0, Lc/a/a/a/a2/c1;->f:Lc/a/a/a/m2/s;

    new-instance v1, Lc/a/a/a/a2/b1;

    invoke-direct {v1, p0, p1}, Lc/a/a/a/a2/b1;-><init>(Lc/a/a/a/a2/c1;Lc/a/a/a/l1;)V

    .line 6
    invoke-virtual {v0, p2, v1}, Lc/a/a/a/m2/s;->b(Landroid/os/Looper;Lc/a/a/a/m2/s$b;)Lc/a/a/a/m2/s;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/a2/c1;->f:Lc/a/a/a/m2/s;

    return-void
.end method

.method public synthetic q(Lc/a/a/a/x1;Ljava/lang/Object;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lc/a/a/a/k1;->t(Lc/a/a/a/l1$a;Lc/a/a/a/x1;Ljava/lang/Object;I)V

    return-void
.end method

.method public final q1(Ljava/util/List;Lc/a/a/a/j2/d0$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/a/a/a/j2/d0$a;",
            ">;",
            "Lc/a/a/a/j2/d0$a;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/a2/c1;->d:Lc/a/a/a/a2/c1$a;

    iget-object v1, p0, Lc/a/a/a/a2/c1;->g:Lc/a/a/a/l1;

    invoke-static {v1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/l1;

    invoke-virtual {v0, p1, p2, v1}, Lc/a/a/a/a2/c1$a;->k(Ljava/util/List;Lc/a/a/a/j2/d0$a;Lc/a/a/a/l1;)V

    return-void
.end method

.method public final r(Lc/a/a/a/p0;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lc/a/a/a/p0;->g:Lc/a/a/a/j2/b0;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lc/a/a/a/j2/d0$a;

    invoke-direct {v1, v0}, Lc/a/a/a/j2/d0$a;-><init>(Lc/a/a/a/j2/b0;)V

    invoke-direct {p0, v1}, Lc/a/a/a/a2/c1;->c0(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;

    move-result-object v0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lc/a/a/a/a2/c1;->a0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    :goto_0
    const/16 v1, 0xb

    .line 4
    new-instance v2, Lc/a/a/a/a2/q;

    invoke-direct {v2, v0, p1}, Lc/a/a/a/a2/q;-><init>(Lc/a/a/a/a2/d1$a;Lc/a/a/a/p0;)V

    invoke-virtual {p0, v0, v1, v2}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final s(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/z;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/a2/c1;->e0(ILc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;

    move-result-object p1

    .line 2
    new-instance p2, Lc/a/a/a/a2/e;

    invoke-direct {p2, p1, p3}, Lc/a/a/a/a2/e;-><init>(Lc/a/a/a/a2/d1$a;Lc/a/a/a/j2/z;)V

    const/16 p3, 0x3ec

    invoke-virtual {p0, p1, p3, p2}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final t(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/a2/c1;->e0(ILc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;

    move-result-object p1

    .line 2
    new-instance p2, Lc/a/a/a/a2/j0;

    invoke-direct {p2, p1, p3, p4}, Lc/a/a/a/a2/j0;-><init>(Lc/a/a/a/a2/d1$a;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    const/16 p3, 0x3ea

    invoke-virtual {p0, p1, p3, p2}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final u(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/a2/c1;->a0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/b;

    invoke-direct {v1, v0, p1}, Lc/a/a/a/a2/b;-><init>(Lc/a/a/a/a2/d1$a;Z)V

    const/4 p1, 0x4

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final v(ILc/a/a/a/j2/d0$a;Lc/a/a/a/j2/z;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/a2/c1;->e0(ILc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;

    move-result-object p1

    .line 2
    new-instance p2, Lc/a/a/a/a2/i0;

    invoke-direct {p2, p1, p3}, Lc/a/a/a/a2/i0;-><init>(Lc/a/a/a/a2/d1$a;Lc/a/a/a/j2/z;)V

    const/16 p3, 0x3ed

    invoke-virtual {p0, p1, p3, p2}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final w()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/a2/c1;->a0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/k0;

    invoke-direct {v1, v0}, Lc/a/a/a/a2/k0;-><init>(Lc/a/a/a/a2/d1$a;)V

    const/4 v2, -0x1

    invoke-virtual {p0, v0, v2, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final x(Lc/a/a/a/z0;I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/a2/c1;->a0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/o;

    invoke-direct {v1, v0, p1, p2}, Lc/a/a/a/a2/o;-><init>(Lc/a/a/a/a2/d1$a;Lc/a/a/a/z0;I)V

    const/4 p1, 0x1

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final y(ILc/a/a/a/j2/d0$a;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/a2/c1;->e0(ILc/a/a/a/j2/d0$a;)Lc/a/a/a/a2/d1$a;

    move-result-object p1

    .line 2
    new-instance p2, Lc/a/a/a/a2/a0;

    invoke-direct {p2, p1}, Lc/a/a/a/a2/a0;-><init>(Lc/a/a/a/a2/d1$a;)V

    const/16 v0, 0x406

    invoke-virtual {p0, p1, v0, p2}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method

.method public final z(Lc/a/a/a/c2/d;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/a/a/a/a2/c1;->g0()Lc/a/a/a/a2/d1$a;

    move-result-object v0

    .line 2
    new-instance v1, Lc/a/a/a/a2/a1;

    invoke-direct {v1, v0, p1}, Lc/a/a/a/a2/a1;-><init>(Lc/a/a/a/a2/d1$a;Lc/a/a/a/c2/d;)V

    const/16 p1, 0x3fc

    invoke-virtual {p0, v0, p1, v1}, Lc/a/a/a/a2/c1;->o1(Lc/a/a/a/a2/d1$a;ILc/a/a/a/m2/s$a;)V

    return-void
.end method
