.class public final Lc/a/a/a/j2/o0;
.super Lc/a/a/a/x1;
.source "SinglePeriodTimeline.java"


# static fields
.field private static final b:Ljava/lang/Object;

.field private static final c:Lc/a/a/a/z0;


# instance fields
.field private final d:J

.field private final e:J

.field private final f:J

.field private final g:J

.field private final h:J

.field private final i:J

.field private final j:J

.field private final k:Z

.field private final l:Z

.field private final m:Ljava/lang/Object;

.field private final n:Lc/a/a/a/z0;

.field private final o:Lc/a/a/a/z0$f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lc/a/a/a/j2/o0;->b:Ljava/lang/Object;

    .line 2
    new-instance v0, Lc/a/a/a/z0$c;

    invoke-direct {v0}, Lc/a/a/a/z0$c;-><init>()V

    const-string v1, "SinglePeriodTimeline"

    .line 3
    invoke-virtual {v0, v1}, Lc/a/a/a/z0$c;->d(Ljava/lang/String;)Lc/a/a/a/z0$c;

    move-result-object v0

    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Lc/a/a/a/z0$c;->g(Landroid/net/Uri;)Lc/a/a/a/z0$c;

    move-result-object v0

    invoke-virtual {v0}, Lc/a/a/a/z0$c;->a()Lc/a/a/a/z0;

    move-result-object v0

    sput-object v0, Lc/a/a/a/j2/o0;->c:Lc/a/a/a/z0;

    return-void
.end method

.method public constructor <init>(JJJJJJJZZLjava/lang/Object;Lc/a/a/a/z0;Lc/a/a/a/z0$f;)V
    .locals 3

    move-object v0, p0

    .line 4
    invoke-direct {p0}, Lc/a/a/a/x1;-><init>()V

    move-wide v1, p1

    .line 5
    iput-wide v1, v0, Lc/a/a/a/j2/o0;->d:J

    move-wide v1, p3

    .line 6
    iput-wide v1, v0, Lc/a/a/a/j2/o0;->e:J

    move-wide v1, p5

    .line 7
    iput-wide v1, v0, Lc/a/a/a/j2/o0;->f:J

    move-wide v1, p7

    .line 8
    iput-wide v1, v0, Lc/a/a/a/j2/o0;->g:J

    move-wide v1, p9

    .line 9
    iput-wide v1, v0, Lc/a/a/a/j2/o0;->h:J

    move-wide v1, p11

    .line 10
    iput-wide v1, v0, Lc/a/a/a/j2/o0;->i:J

    move-wide/from16 v1, p13

    .line 11
    iput-wide v1, v0, Lc/a/a/a/j2/o0;->j:J

    move/from16 v1, p15

    .line 12
    iput-boolean v1, v0, Lc/a/a/a/j2/o0;->k:Z

    move/from16 v1, p16

    .line 13
    iput-boolean v1, v0, Lc/a/a/a/j2/o0;->l:Z

    move-object/from16 v1, p17

    .line 14
    iput-object v1, v0, Lc/a/a/a/j2/o0;->m:Ljava/lang/Object;

    .line 15
    invoke-static/range {p18 .. p18}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/z0;

    iput-object v1, v0, Lc/a/a/a/j2/o0;->n:Lc/a/a/a/z0;

    move-object/from16 v1, p19

    .line 16
    iput-object v1, v0, Lc/a/a/a/j2/o0;->o:Lc/a/a/a/z0$f;

    return-void
.end method

.method public constructor <init>(JJJJZZZLjava/lang/Object;Lc/a/a/a/z0;)V
    .locals 20

    move-object/from16 v15, p13

    if-eqz p11, :cond_0

    .line 2
    iget-object v0, v15, Lc/a/a/a/z0;->c:Lc/a/a/a/z0$f;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object/from16 v19, v0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    move-object/from16 v0, p0

    move-wide/from16 v7, p1

    move-wide/from16 v9, p3

    move-wide/from16 v11, p5

    move-wide/from16 v13, p7

    move/from16 v15, p9

    move/from16 v16, p10

    move-object/from16 v17, p12

    move-object/from16 v18, p13

    .line 3
    invoke-direct/range {v0 .. v19}, Lc/a/a/a/j2/o0;-><init>(JJJJJJJZZLjava/lang/Object;Lc/a/a/a/z0;Lc/a/a/a/z0$f;)V

    return-void
.end method

.method public constructor <init>(JZZZLjava/lang/Object;Lc/a/a/a/z0;)V
    .locals 14

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p1

    move/from16 v9, p3

    move/from16 v10, p4

    move/from16 v11, p5

    move-object/from16 v12, p6

    move-object/from16 v13, p7

    .line 1
    invoke-direct/range {v0 .. v13}, Lc/a/a/a/j2/o0;-><init>(JJJJZZZLjava/lang/Object;Lc/a/a/a/z0;)V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;)I
    .locals 1

    .line 1
    sget-object v0, Lc/a/a/a/j2/o0;->b:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public g(ILc/a/a/a/x1$b;Z)Lc/a/a/a/x1$b;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-static {p1, v0, v1}, Lc/a/a/a/m2/f;->c(III)I

    if-eqz p3, :cond_0

    .line 2
    sget-object p1, Lc/a/a/a/j2/o0;->b:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move-object v2, p1

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 3
    iget-wide v4, p0, Lc/a/a/a/j2/o0;->g:J

    iget-wide v6, p0, Lc/a/a/a/j2/o0;->i:J

    neg-long v6, v6

    move-object v0, p2

    invoke-virtual/range {v0 .. v7}, Lc/a/a/a/x1$b;->n(Ljava/lang/Object;Ljava/lang/Object;IJJ)Lc/a/a/a/x1$b;

    move-result-object p1

    return-object p1
.end method

.method public i()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public m(I)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-static {p1, v0, v1}, Lc/a/a/a/m2/f;->c(III)I

    .line 2
    sget-object p1, Lc/a/a/a/j2/o0;->b:Ljava/lang/Object;

    return-object p1
.end method

.method public o(ILc/a/a/a/x1$c;J)Lc/a/a/a/x1$c;
    .locals 24

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    move/from16 v3, p1

    .line 1
    invoke-static {v3, v1, v2}, Lc/a/a/a/m2/f;->c(III)I

    .line 2
    iget-wide v1, v0, Lc/a/a/a/j2/o0;->j:J

    .line 3
    iget-boolean v14, v0, Lc/a/a/a/j2/o0;->l:Z

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v14, :cond_1

    const-wide/16 v5, 0x0

    cmp-long v7, p3, v5

    if-eqz v7, :cond_1

    .line 4
    iget-wide v5, v0, Lc/a/a/a/j2/o0;->h:J

    cmp-long v7, v5, v3

    if-nez v7, :cond_0

    :goto_0
    move-wide/from16 v16, v3

    goto :goto_1

    :cond_0
    add-long v1, v1, p3

    cmp-long v7, v1, v5

    if-lez v7, :cond_1

    goto :goto_0

    :cond_1
    move-wide/from16 v16, v1

    .line 5
    :goto_1
    sget-object v4, Lc/a/a/a/x1$c;->a:Ljava/lang/Object;

    iget-object v5, v0, Lc/a/a/a/j2/o0;->n:Lc/a/a/a/z0;

    iget-object v6, v0, Lc/a/a/a/j2/o0;->m:Ljava/lang/Object;

    iget-wide v7, v0, Lc/a/a/a/j2/o0;->d:J

    iget-wide v9, v0, Lc/a/a/a/j2/o0;->e:J

    iget-wide v11, v0, Lc/a/a/a/j2/o0;->f:J

    iget-boolean v13, v0, Lc/a/a/a/j2/o0;->k:Z

    iget-object v15, v0, Lc/a/a/a/j2/o0;->o:Lc/a/a/a/z0$f;

    iget-wide v1, v0, Lc/a/a/a/j2/o0;->h:J

    move-wide/from16 v18, v1

    const/16 v20, 0x0

    const/16 v21, 0x0

    iget-wide v1, v0, Lc/a/a/a/j2/o0;->i:J

    move-wide/from16 v22, v1

    move-object/from16 v3, p2

    invoke-virtual/range {v3 .. v23}, Lc/a/a/a/x1$c;->g(Ljava/lang/Object;Lc/a/a/a/z0;Ljava/lang/Object;JJJZZLc/a/a/a/z0$f;JJIIJ)Lc/a/a/a/x1$c;

    move-result-object v1

    return-object v1
.end method

.method public p()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
