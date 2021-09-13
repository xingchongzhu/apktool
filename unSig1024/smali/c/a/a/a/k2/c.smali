.class public final Lc/a/a/a/k2/c;
.super Ljava/lang/Object;
.source "Cue.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/k2/c$b;
    }
.end annotation


# static fields
.field public static final a:Lc/a/a/a/k2/c;


# instance fields
.field public final b:Ljava/lang/CharSequence;

.field public final c:Landroid/text/Layout$Alignment;

.field public final d:Landroid/graphics/Bitmap;

.field public final e:F

.field public final f:I

.field public final g:I

.field public final h:F

.field public final i:I

.field public final j:F

.field public final k:F

.field public final l:Z

.field public final m:I

.field public final n:I

.field public final o:F

.field public final p:I

.field public final q:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lc/a/a/a/k2/c$b;

    invoke-direct {v0}, Lc/a/a/a/k2/c$b;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Lc/a/a/a/k2/c$b;->n(Ljava/lang/CharSequence;)Lc/a/a/a/k2/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lc/a/a/a/k2/c$b;->a()Lc/a/a/a/k2/c;

    move-result-object v0

    sput-object v0, Lc/a/a/a/k2/c;->a:Lc/a/a/a/k2/c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V
    .locals 4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez v1, :cond_0

    .line 3
    invoke-static {p3}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    if-nez v2, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 4
    :goto_0
    invoke-static {v3}, Lc/a/a/a/m2/f;->a(Z)V

    .line 5
    :goto_1
    iput-object v1, v0, Lc/a/a/a/k2/c;->b:Ljava/lang/CharSequence;

    move-object v1, p2

    .line 6
    iput-object v1, v0, Lc/a/a/a/k2/c;->c:Landroid/text/Layout$Alignment;

    .line 7
    iput-object v2, v0, Lc/a/a/a/k2/c;->d:Landroid/graphics/Bitmap;

    move v1, p4

    .line 8
    iput v1, v0, Lc/a/a/a/k2/c;->e:F

    move v1, p5

    .line 9
    iput v1, v0, Lc/a/a/a/k2/c;->f:I

    move v1, p6

    .line 10
    iput v1, v0, Lc/a/a/a/k2/c;->g:I

    move v1, p7

    .line 11
    iput v1, v0, Lc/a/a/a/k2/c;->h:F

    move v1, p8

    .line 12
    iput v1, v0, Lc/a/a/a/k2/c;->i:I

    move v1, p11

    .line 13
    iput v1, v0, Lc/a/a/a/k2/c;->j:F

    move/from16 v1, p12

    .line 14
    iput v1, v0, Lc/a/a/a/k2/c;->k:F

    move/from16 v1, p13

    .line 15
    iput-boolean v1, v0, Lc/a/a/a/k2/c;->l:Z

    move/from16 v1, p14

    .line 16
    iput v1, v0, Lc/a/a/a/k2/c;->m:I

    move v1, p9

    .line 17
    iput v1, v0, Lc/a/a/a/k2/c;->n:I

    move v1, p10

    .line 18
    iput v1, v0, Lc/a/a/a/k2/c;->o:F

    move/from16 v1, p15

    .line 19
    iput v1, v0, Lc/a/a/a/k2/c;->p:I

    move/from16 v1, p16

    .line 20
    iput v1, v0, Lc/a/a/a/k2/c;->q:F

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIFLc/a/a/a/k2/c$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p16}, Lc/a/a/a/k2/c;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    return-void
.end method


# virtual methods
.method public a()Lc/a/a/a/k2/c$b;
    .locals 2

    .line 1
    new-instance v0, Lc/a/a/a/k2/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lc/a/a/a/k2/c$b;-><init>(Lc/a/a/a/k2/c;Lc/a/a/a/k2/c$a;)V

    return-object v0
.end method
