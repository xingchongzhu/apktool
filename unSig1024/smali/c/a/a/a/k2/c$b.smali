.class public final Lc/a/a/a/k2/c$b;
.super Ljava/lang/Object;
.source "Cue.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/k2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/CharSequence;

.field private b:Landroid/graphics/Bitmap;

.field private c:Landroid/text/Layout$Alignment;

.field private d:F

.field private e:I

.field private f:I

.field private g:F

.field private h:I

.field private i:I

.field private j:F

.field private k:F

.field private l:F

.field private m:Z

.field private n:I

.field private o:I

.field private p:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lc/a/a/a/k2/c$b;->a:Ljava/lang/CharSequence;

    .line 4
    iput-object v0, p0, Lc/a/a/a/k2/c$b;->b:Landroid/graphics/Bitmap;

    .line 5
    iput-object v0, p0, Lc/a/a/a/k2/c$b;->c:Landroid/text/Layout$Alignment;

    const v0, -0x800001

    .line 6
    iput v0, p0, Lc/a/a/a/k2/c$b;->d:F

    const/high16 v1, -0x80000000

    .line 7
    iput v1, p0, Lc/a/a/a/k2/c$b;->e:I

    .line 8
    iput v1, p0, Lc/a/a/a/k2/c$b;->f:I

    .line 9
    iput v0, p0, Lc/a/a/a/k2/c$b;->g:F

    .line 10
    iput v1, p0, Lc/a/a/a/k2/c$b;->h:I

    .line 11
    iput v1, p0, Lc/a/a/a/k2/c$b;->i:I

    .line 12
    iput v0, p0, Lc/a/a/a/k2/c$b;->j:F

    .line 13
    iput v0, p0, Lc/a/a/a/k2/c$b;->k:F

    .line 14
    iput v0, p0, Lc/a/a/a/k2/c$b;->l:F

    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lc/a/a/a/k2/c$b;->m:Z

    const/high16 v0, -0x1000000

    .line 16
    iput v0, p0, Lc/a/a/a/k2/c$b;->n:I

    .line 17
    iput v1, p0, Lc/a/a/a/k2/c$b;->o:I

    return-void
.end method

.method private constructor <init>(Lc/a/a/a/k2/c;)V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iget-object v0, p1, Lc/a/a/a/k2/c;->b:Ljava/lang/CharSequence;

    iput-object v0, p0, Lc/a/a/a/k2/c$b;->a:Ljava/lang/CharSequence;

    .line 20
    iget-object v0, p1, Lc/a/a/a/k2/c;->d:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lc/a/a/a/k2/c$b;->b:Landroid/graphics/Bitmap;

    .line 21
    iget-object v0, p1, Lc/a/a/a/k2/c;->c:Landroid/text/Layout$Alignment;

    iput-object v0, p0, Lc/a/a/a/k2/c$b;->c:Landroid/text/Layout$Alignment;

    .line 22
    iget v0, p1, Lc/a/a/a/k2/c;->e:F

    iput v0, p0, Lc/a/a/a/k2/c$b;->d:F

    .line 23
    iget v0, p1, Lc/a/a/a/k2/c;->f:I

    iput v0, p0, Lc/a/a/a/k2/c$b;->e:I

    .line 24
    iget v0, p1, Lc/a/a/a/k2/c;->g:I

    iput v0, p0, Lc/a/a/a/k2/c$b;->f:I

    .line 25
    iget v0, p1, Lc/a/a/a/k2/c;->h:F

    iput v0, p0, Lc/a/a/a/k2/c$b;->g:F

    .line 26
    iget v0, p1, Lc/a/a/a/k2/c;->i:I

    iput v0, p0, Lc/a/a/a/k2/c$b;->h:I

    .line 27
    iget v0, p1, Lc/a/a/a/k2/c;->n:I

    iput v0, p0, Lc/a/a/a/k2/c$b;->i:I

    .line 28
    iget v0, p1, Lc/a/a/a/k2/c;->o:F

    iput v0, p0, Lc/a/a/a/k2/c$b;->j:F

    .line 29
    iget v0, p1, Lc/a/a/a/k2/c;->j:F

    iput v0, p0, Lc/a/a/a/k2/c$b;->k:F

    .line 30
    iget v0, p1, Lc/a/a/a/k2/c;->k:F

    iput v0, p0, Lc/a/a/a/k2/c$b;->l:F

    .line 31
    iget-boolean v0, p1, Lc/a/a/a/k2/c;->l:Z

    iput-boolean v0, p0, Lc/a/a/a/k2/c$b;->m:Z

    .line 32
    iget v0, p1, Lc/a/a/a/k2/c;->m:I

    iput v0, p0, Lc/a/a/a/k2/c$b;->n:I

    .line 33
    iget v0, p1, Lc/a/a/a/k2/c;->p:I

    iput v0, p0, Lc/a/a/a/k2/c$b;->o:I

    .line 34
    iget p1, p1, Lc/a/a/a/k2/c;->q:F

    iput p1, p0, Lc/a/a/a/k2/c$b;->p:F

    return-void
.end method

.method synthetic constructor <init>(Lc/a/a/a/k2/c;Lc/a/a/a/k2/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lc/a/a/a/k2/c$b;-><init>(Lc/a/a/a/k2/c;)V

    return-void
.end method


# virtual methods
.method public a()Lc/a/a/a/k2/c;
    .locals 21

    move-object/from16 v0, p0

    .line 1
    new-instance v19, Lc/a/a/a/k2/c;

    move-object/from16 v1, v19

    iget-object v2, v0, Lc/a/a/a/k2/c$b;->a:Ljava/lang/CharSequence;

    iget-object v3, v0, Lc/a/a/a/k2/c$b;->c:Landroid/text/Layout$Alignment;

    iget-object v4, v0, Lc/a/a/a/k2/c$b;->b:Landroid/graphics/Bitmap;

    iget v5, v0, Lc/a/a/a/k2/c$b;->d:F

    iget v6, v0, Lc/a/a/a/k2/c$b;->e:I

    iget v7, v0, Lc/a/a/a/k2/c$b;->f:I

    iget v8, v0, Lc/a/a/a/k2/c$b;->g:F

    iget v9, v0, Lc/a/a/a/k2/c$b;->h:I

    iget v10, v0, Lc/a/a/a/k2/c$b;->i:I

    iget v11, v0, Lc/a/a/a/k2/c$b;->j:F

    iget v12, v0, Lc/a/a/a/k2/c$b;->k:F

    iget v13, v0, Lc/a/a/a/k2/c$b;->l:F

    iget-boolean v14, v0, Lc/a/a/a/k2/c$b;->m:Z

    iget v15, v0, Lc/a/a/a/k2/c$b;->n:I

    move-object/from16 v20, v1

    iget v1, v0, Lc/a/a/a/k2/c$b;->o:I

    move/from16 v16, v1

    iget v1, v0, Lc/a/a/a/k2/c$b;->p:F

    move/from16 v17, v1

    const/16 v18, 0x0

    move-object/from16 v1, v20

    invoke-direct/range {v1 .. v18}, Lc/a/a/a/k2/c;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIFLc/a/a/a/k2/c$a;)V

    return-object v19
.end method

.method public b()Lc/a/a/a/k2/c$b;
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/k2/c$b;->m:Z

    return-object p0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/k2/c$b;->f:I

    return v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/k2/c$b;->h:I

    return v0
.end method

.method public e()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/c$b;->a:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public f(Landroid/graphics/Bitmap;)Lc/a/a/a/k2/c$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/k2/c$b;->b:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public g(F)Lc/a/a/a/k2/c$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/c$b;->l:F

    return-object p0
.end method

.method public h(FI)Lc/a/a/a/k2/c$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/c$b;->d:F

    .line 2
    iput p2, p0, Lc/a/a/a/k2/c$b;->e:I

    return-object p0
.end method

.method public i(I)Lc/a/a/a/k2/c$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/c$b;->f:I

    return-object p0
.end method

.method public j(F)Lc/a/a/a/k2/c$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/c$b;->g:F

    return-object p0
.end method

.method public k(I)Lc/a/a/a/k2/c$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/c$b;->h:I

    return-object p0
.end method

.method public l(F)Lc/a/a/a/k2/c$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/c$b;->p:F

    return-object p0
.end method

.method public m(F)Lc/a/a/a/k2/c$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/c$b;->k:F

    return-object p0
.end method

.method public n(Ljava/lang/CharSequence;)Lc/a/a/a/k2/c$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/k2/c$b;->a:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public o(Landroid/text/Layout$Alignment;)Lc/a/a/a/k2/c$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/k2/c$b;->c:Landroid/text/Layout$Alignment;

    return-object p0
.end method

.method public p(FI)Lc/a/a/a/k2/c$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/c$b;->j:F

    .line 2
    iput p2, p0, Lc/a/a/a/k2/c$b;->i:I

    return-object p0
.end method

.method public q(I)Lc/a/a/a/k2/c$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/c$b;->o:I

    return-object p0
.end method

.method public r(I)Lc/a/a/a/k2/c$b;
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/k2/c$b;->n:I

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lc/a/a/a/k2/c$b;->m:Z

    return-object p0
.end method
