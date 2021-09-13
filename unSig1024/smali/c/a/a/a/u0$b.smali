.class public final Lc/a/a/a/u0$b;
.super Ljava/lang/Object;
.source "Format.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lc/a/a/a/e2/c0;",
            ">;"
        }
    .end annotation
.end field

.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:Ljava/lang/String;

.field private i:Lc/a/a/a/h2/a;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:I

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation
.end field

.field private n:Lc/a/a/a/e2/t;

.field private o:J

.field private p:I

.field private q:I

.field private r:F

.field private s:I

.field private t:F

.field private u:[B

.field private v:I

.field private w:Lc/a/a/a/n2/k;

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lc/a/a/a/u0$b;->f:I

    .line 4
    iput v0, p0, Lc/a/a/a/u0$b;->g:I

    .line 5
    iput v0, p0, Lc/a/a/a/u0$b;->l:I

    const-wide v1, 0x7fffffffffffffffL

    .line 6
    iput-wide v1, p0, Lc/a/a/a/u0$b;->o:J

    .line 7
    iput v0, p0, Lc/a/a/a/u0$b;->p:I

    .line 8
    iput v0, p0, Lc/a/a/a/u0$b;->q:I

    const/high16 v1, -0x40800000    # -1.0f

    .line 9
    iput v1, p0, Lc/a/a/a/u0$b;->r:F

    const/high16 v1, 0x3f800000    # 1.0f

    .line 10
    iput v1, p0, Lc/a/a/a/u0$b;->t:F

    .line 11
    iput v0, p0, Lc/a/a/a/u0$b;->v:I

    .line 12
    iput v0, p0, Lc/a/a/a/u0$b;->x:I

    .line 13
    iput v0, p0, Lc/a/a/a/u0$b;->y:I

    .line 14
    iput v0, p0, Lc/a/a/a/u0$b;->z:I

    .line 15
    iput v0, p0, Lc/a/a/a/u0$b;->C:I

    return-void
.end method

.method private constructor <init>(Lc/a/a/a/u0;)V
    .locals 2

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iget-object v0, p1, Lc/a/a/a/u0;->a:Ljava/lang/String;

    iput-object v0, p0, Lc/a/a/a/u0$b;->a:Ljava/lang/String;

    .line 18
    iget-object v0, p1, Lc/a/a/a/u0;->b:Ljava/lang/String;

    iput-object v0, p0, Lc/a/a/a/u0$b;->b:Ljava/lang/String;

    .line 19
    iget-object v0, p1, Lc/a/a/a/u0;->c:Ljava/lang/String;

    iput-object v0, p0, Lc/a/a/a/u0$b;->c:Ljava/lang/String;

    .line 20
    iget v0, p1, Lc/a/a/a/u0;->d:I

    iput v0, p0, Lc/a/a/a/u0$b;->d:I

    .line 21
    iget v0, p1, Lc/a/a/a/u0;->e:I

    iput v0, p0, Lc/a/a/a/u0$b;->e:I

    .line 22
    iget v0, p1, Lc/a/a/a/u0;->f:I

    iput v0, p0, Lc/a/a/a/u0$b;->f:I

    .line 23
    iget v0, p1, Lc/a/a/a/u0;->g:I

    iput v0, p0, Lc/a/a/a/u0$b;->g:I

    .line 24
    iget-object v0, p1, Lc/a/a/a/u0;->i:Ljava/lang/String;

    iput-object v0, p0, Lc/a/a/a/u0$b;->h:Ljava/lang/String;

    .line 25
    iget-object v0, p1, Lc/a/a/a/u0;->j:Lc/a/a/a/h2/a;

    iput-object v0, p0, Lc/a/a/a/u0$b;->i:Lc/a/a/a/h2/a;

    .line 26
    iget-object v0, p1, Lc/a/a/a/u0;->k:Ljava/lang/String;

    iput-object v0, p0, Lc/a/a/a/u0$b;->j:Ljava/lang/String;

    .line 27
    iget-object v0, p1, Lc/a/a/a/u0;->l:Ljava/lang/String;

    iput-object v0, p0, Lc/a/a/a/u0$b;->k:Ljava/lang/String;

    .line 28
    iget v0, p1, Lc/a/a/a/u0;->m:I

    iput v0, p0, Lc/a/a/a/u0$b;->l:I

    .line 29
    iget-object v0, p1, Lc/a/a/a/u0;->n:Ljava/util/List;

    iput-object v0, p0, Lc/a/a/a/u0$b;->m:Ljava/util/List;

    .line 30
    iget-object v0, p1, Lc/a/a/a/u0;->o:Lc/a/a/a/e2/t;

    iput-object v0, p0, Lc/a/a/a/u0$b;->n:Lc/a/a/a/e2/t;

    .line 31
    iget-wide v0, p1, Lc/a/a/a/u0;->p:J

    iput-wide v0, p0, Lc/a/a/a/u0$b;->o:J

    .line 32
    iget v0, p1, Lc/a/a/a/u0;->q:I

    iput v0, p0, Lc/a/a/a/u0$b;->p:I

    .line 33
    iget v0, p1, Lc/a/a/a/u0;->r:I

    iput v0, p0, Lc/a/a/a/u0$b;->q:I

    .line 34
    iget v0, p1, Lc/a/a/a/u0;->s:F

    iput v0, p0, Lc/a/a/a/u0$b;->r:F

    .line 35
    iget v0, p1, Lc/a/a/a/u0;->t:I

    iput v0, p0, Lc/a/a/a/u0$b;->s:I

    .line 36
    iget v0, p1, Lc/a/a/a/u0;->u:F

    iput v0, p0, Lc/a/a/a/u0$b;->t:F

    .line 37
    iget-object v0, p1, Lc/a/a/a/u0;->v:[B

    iput-object v0, p0, Lc/a/a/a/u0$b;->u:[B

    .line 38
    iget v0, p1, Lc/a/a/a/u0;->w:I

    iput v0, p0, Lc/a/a/a/u0$b;->v:I

    .line 39
    iget-object v0, p1, Lc/a/a/a/u0;->x:Lc/a/a/a/n2/k;

    iput-object v0, p0, Lc/a/a/a/u0$b;->w:Lc/a/a/a/n2/k;

    .line 40
    iget v0, p1, Lc/a/a/a/u0;->y:I

    iput v0, p0, Lc/a/a/a/u0$b;->x:I

    .line 41
    iget v0, p1, Lc/a/a/a/u0;->z:I

    iput v0, p0, Lc/a/a/a/u0$b;->y:I

    .line 42
    iget v0, p1, Lc/a/a/a/u0;->A:I

    iput v0, p0, Lc/a/a/a/u0$b;->z:I

    .line 43
    iget v0, p1, Lc/a/a/a/u0;->B:I

    iput v0, p0, Lc/a/a/a/u0$b;->A:I

    .line 44
    iget v0, p1, Lc/a/a/a/u0;->C:I

    iput v0, p0, Lc/a/a/a/u0$b;->B:I

    .line 45
    iget v0, p1, Lc/a/a/a/u0;->D:I

    iput v0, p0, Lc/a/a/a/u0$b;->C:I

    .line 46
    iget-object p1, p1, Lc/a/a/a/u0;->G:Ljava/lang/Class;

    iput-object p1, p0, Lc/a/a/a/u0$b;->D:Ljava/lang/Class;

    return-void
.end method

.method synthetic constructor <init>(Lc/a/a/a/u0;Lc/a/a/a/u0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lc/a/a/a/u0$b;-><init>(Lc/a/a/a/u0;)V

    return-void
.end method

.method static synthetic A(Lc/a/a/a/u0$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/u0$b;->f:I

    return p0
.end method

.method static synthetic B(Lc/a/a/a/u0$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/u0$b;->g:I

    return p0
.end method

.method static synthetic C(Lc/a/a/a/u0$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/u0$b;->h:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic D(Lc/a/a/a/u0$b;)Lc/a/a/a/h2/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/u0$b;->i:Lc/a/a/a/h2/a;

    return-object p0
.end method

.method static synthetic a(Lc/a/a/a/u0$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/u0$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic b(Lc/a/a/a/u0$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/u0$b;->j:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Lc/a/a/a/u0$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/u0$b;->k:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic d(Lc/a/a/a/u0$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/u0$b;->l:I

    return p0
.end method

.method static synthetic e(Lc/a/a/a/u0$b;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/u0$b;->m:Ljava/util/List;

    return-object p0
.end method

.method static synthetic f(Lc/a/a/a/u0$b;)Lc/a/a/a/e2/t;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/u0$b;->n:Lc/a/a/a/e2/t;

    return-object p0
.end method

.method static synthetic g(Lc/a/a/a/u0$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/u0$b;->o:J

    return-wide v0
.end method

.method static synthetic h(Lc/a/a/a/u0$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/u0$b;->p:I

    return p0
.end method

.method static synthetic i(Lc/a/a/a/u0$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/u0$b;->q:I

    return p0
.end method

.method static synthetic j(Lc/a/a/a/u0$b;)F
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/u0$b;->r:F

    return p0
.end method

.method static synthetic k(Lc/a/a/a/u0$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/u0$b;->s:I

    return p0
.end method

.method static synthetic l(Lc/a/a/a/u0$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/u0$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic m(Lc/a/a/a/u0$b;)F
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/u0$b;->t:F

    return p0
.end method

.method static synthetic n(Lc/a/a/a/u0$b;)[B
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/u0$b;->u:[B

    return-object p0
.end method

.method static synthetic o(Lc/a/a/a/u0$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/u0$b;->v:I

    return p0
.end method

.method static synthetic p(Lc/a/a/a/u0$b;)Lc/a/a/a/n2/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/u0$b;->w:Lc/a/a/a/n2/k;

    return-object p0
.end method

.method static synthetic q(Lc/a/a/a/u0$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/u0$b;->x:I

    return p0
.end method

.method static synthetic r(Lc/a/a/a/u0$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/u0$b;->y:I

    return p0
.end method

.method static synthetic s(Lc/a/a/a/u0$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/u0$b;->z:I

    return p0
.end method

.method static synthetic t(Lc/a/a/a/u0$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/u0$b;->A:I

    return p0
.end method

.method static synthetic u(Lc/a/a/a/u0$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/u0$b;->B:I

    return p0
.end method

.method static synthetic v(Lc/a/a/a/u0$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/u0$b;->C:I

    return p0
.end method

.method static synthetic w(Lc/a/a/a/u0$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/u0$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic x(Lc/a/a/a/u0$b;)Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/u0$b;->D:Ljava/lang/Class;

    return-object p0
.end method

.method static synthetic y(Lc/a/a/a/u0$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/u0$b;->d:I

    return p0
.end method

.method static synthetic z(Lc/a/a/a/u0$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/u0$b;->e:I

    return p0
.end method


# virtual methods
.method public E()Lc/a/a/a/u0;
    .locals 2

    .line 1
    new-instance v0, Lc/a/a/a/u0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lc/a/a/a/u0;-><init>(Lc/a/a/a/u0$b;Lc/a/a/a/u0$a;)V

    return-object v0
.end method

.method public F(I)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/u0$b;->C:I

    return-object p0
.end method

.method public G(I)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/u0$b;->f:I

    return-object p0
.end method

.method public H(I)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/u0$b;->x:I

    return-object p0
.end method

.method public I(Ljava/lang/String;)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/u0$b;->h:Ljava/lang/String;

    return-object p0
.end method

.method public J(Lc/a/a/a/n2/k;)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/u0$b;->w:Lc/a/a/a/n2/k;

    return-object p0
.end method

.method public K(Ljava/lang/String;)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/u0$b;->j:Ljava/lang/String;

    return-object p0
.end method

.method public L(Lc/a/a/a/e2/t;)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/u0$b;->n:Lc/a/a/a/e2/t;

    return-object p0
.end method

.method public M(I)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/u0$b;->A:I

    return-object p0
.end method

.method public N(I)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/u0$b;->B:I

    return-object p0
.end method

.method public O(Ljava/lang/Class;)Lc/a/a/a/u0$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lc/a/a/a/e2/c0;",
            ">;)",
            "Lc/a/a/a/u0$b;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lc/a/a/a/u0$b;->D:Ljava/lang/Class;

    return-object p0
.end method

.method public P(F)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/u0$b;->r:F

    return-object p0
.end method

.method public Q(I)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/u0$b;->q:I

    return-object p0
.end method

.method public R(I)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/u0$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public S(Ljava/lang/String;)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/u0$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public T(Ljava/util/List;)Lc/a/a/a/u0$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[B>;)",
            "Lc/a/a/a/u0$b;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lc/a/a/a/u0$b;->m:Ljava/util/List;

    return-object p0
.end method

.method public U(Ljava/lang/String;)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/u0$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public V(Ljava/lang/String;)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/u0$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public W(I)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/u0$b;->l:I

    return-object p0
.end method

.method public X(Lc/a/a/a/h2/a;)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/u0$b;->i:Lc/a/a/a/h2/a;

    return-object p0
.end method

.method public Y(I)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/u0$b;->z:I

    return-object p0
.end method

.method public Z(I)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/u0$b;->g:I

    return-object p0
.end method

.method public a0(F)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/u0$b;->t:F

    return-object p0
.end method

.method public b0([B)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/u0$b;->u:[B

    return-object p0
.end method

.method public c0(I)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/u0$b;->e:I

    return-object p0
.end method

.method public d0(I)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/u0$b;->s:I

    return-object p0
.end method

.method public e0(Ljava/lang/String;)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/u0$b;->k:Ljava/lang/String;

    return-object p0
.end method

.method public f0(I)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/u0$b;->y:I

    return-object p0
.end method

.method public g0(I)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/u0$b;->d:I

    return-object p0
.end method

.method public h0(I)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/u0$b;->v:I

    return-object p0
.end method

.method public i0(J)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lc/a/a/a/u0$b;->o:J

    return-object p0
.end method

.method public j0(I)Lc/a/a/a/u0$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/u0$b;->p:I

    return-object p0
.end method
