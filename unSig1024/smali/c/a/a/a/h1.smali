.class final Lc/a/a/a/h1;
.super Ljava/lang/Object;
.source "PlaybackInfo.java"


# static fields
.field private static final a:Lc/a/a/a/j2/d0$a;


# instance fields
.field public final b:Lc/a/a/a/x1;

.field public final c:Lc/a/a/a/j2/d0$a;

.field public final d:J

.field public final e:I

.field public final f:Lc/a/a/a/p0;

.field public final g:Z

.field public final h:Lc/a/a/a/j2/q0;

.field public final i:Lc/a/a/a/l2/o;

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/a/h2/a;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Lc/a/a/a/j2/d0$a;

.field public final l:Z

.field public final m:I

.field public final n:Lc/a/a/a/i1;

.field public final o:Z

.field public final p:Z

.field public volatile q:J

.field public volatile r:J

.field public volatile s:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lc/a/a/a/j2/d0$a;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, v1}, Lc/a/a/a/j2/d0$a;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lc/a/a/a/h1;->a:Lc/a/a/a/j2/d0$a;

    return-void
.end method

.method public constructor <init>(Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;JILc/a/a/a/p0;ZLc/a/a/a/j2/q0;Lc/a/a/a/l2/o;Ljava/util/List;Lc/a/a/a/j2/d0$a;ZILc/a/a/a/i1;JJJZZ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/x1;",
            "Lc/a/a/a/j2/d0$a;",
            "JI",
            "Lc/a/a/a/p0;",
            "Z",
            "Lc/a/a/a/j2/q0;",
            "Lc/a/a/a/l2/o;",
            "Ljava/util/List<",
            "Lc/a/a/a/h2/a;",
            ">;",
            "Lc/a/a/a/j2/d0$a;",
            "ZI",
            "Lc/a/a/a/i1;",
            "JJJZZ)V"
        }
    .end annotation

    move-object v0, p0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 2
    iput-object v1, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    move-object v1, p2

    .line 3
    iput-object v1, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    move-wide v1, p3

    .line 4
    iput-wide v1, v0, Lc/a/a/a/h1;->d:J

    move v1, p5

    .line 5
    iput v1, v0, Lc/a/a/a/h1;->e:I

    move-object v1, p6

    .line 6
    iput-object v1, v0, Lc/a/a/a/h1;->f:Lc/a/a/a/p0;

    move v1, p7

    .line 7
    iput-boolean v1, v0, Lc/a/a/a/h1;->g:Z

    move-object v1, p8

    .line 8
    iput-object v1, v0, Lc/a/a/a/h1;->h:Lc/a/a/a/j2/q0;

    move-object v1, p9

    .line 9
    iput-object v1, v0, Lc/a/a/a/h1;->i:Lc/a/a/a/l2/o;

    move-object v1, p10

    .line 10
    iput-object v1, v0, Lc/a/a/a/h1;->j:Ljava/util/List;

    move-object v1, p11

    .line 11
    iput-object v1, v0, Lc/a/a/a/h1;->k:Lc/a/a/a/j2/d0$a;

    move v1, p12

    .line 12
    iput-boolean v1, v0, Lc/a/a/a/h1;->l:Z

    move/from16 v1, p13

    .line 13
    iput v1, v0, Lc/a/a/a/h1;->m:I

    move-object/from16 v1, p14

    .line 14
    iput-object v1, v0, Lc/a/a/a/h1;->n:Lc/a/a/a/i1;

    move-wide/from16 v1, p15

    .line 15
    iput-wide v1, v0, Lc/a/a/a/h1;->q:J

    move-wide/from16 v1, p17

    .line 16
    iput-wide v1, v0, Lc/a/a/a/h1;->r:J

    move-wide/from16 v1, p19

    .line 17
    iput-wide v1, v0, Lc/a/a/a/h1;->s:J

    move/from16 v1, p21

    .line 18
    iput-boolean v1, v0, Lc/a/a/a/h1;->o:Z

    move/from16 v1, p22

    .line 19
    iput-boolean v1, v0, Lc/a/a/a/h1;->p:Z

    return-void
.end method

.method public static k(Lc/a/a/a/l2/o;)Lc/a/a/a/h1;
    .locals 24

    move-object/from16 v9, p0

    .line 1
    new-instance v23, Lc/a/a/a/h1;

    move-object/from16 v0, v23

    sget-object v1, Lc/a/a/a/x1;->a:Lc/a/a/a/x1;

    sget-object v2, Lc/a/a/a/h1;->a:Lc/a/a/a/j2/d0$a;

    move-object v11, v2

    sget-object v8, Lc/a/a/a/j2/q0;->a:Lc/a/a/a/j2/q0;

    .line 2
    invoke-static {}, Lc/a/b/b/r;->p()Lc/a/b/b/r;

    move-result-object v10

    sget-object v14, Lc/a/a/a/i1;->a:Lc/a/a/a/i1;

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v0 .. v22}, Lc/a/a/a/h1;-><init>(Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;JILc/a/a/a/p0;ZLc/a/a/a/j2/q0;Lc/a/a/a/l2/o;Ljava/util/List;Lc/a/a/a/j2/d0$a;ZILc/a/a/a/i1;JJJZZ)V

    return-object v23
.end method

.method public static l()Lc/a/a/a/j2/d0$a;
    .locals 1

    .line 1
    sget-object v0, Lc/a/a/a/h1;->a:Lc/a/a/a/j2/d0$a;

    return-object v0
.end method


# virtual methods
.method public a(Z)Lc/a/a/a/h1;
    .locals 26

    move-object/from16 v0, p0

    move/from16 v8, p1

    .line 1
    new-instance v24, Lc/a/a/a/h1;

    move-object/from16 v1, v24

    iget-object v2, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v3, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-wide v4, v0, Lc/a/a/a/h1;->d:J

    iget v6, v0, Lc/a/a/a/h1;->e:I

    iget-object v7, v0, Lc/a/a/a/h1;->f:Lc/a/a/a/p0;

    iget-object v9, v0, Lc/a/a/a/h1;->h:Lc/a/a/a/j2/q0;

    iget-object v10, v0, Lc/a/a/a/h1;->i:Lc/a/a/a/l2/o;

    iget-object v11, v0, Lc/a/a/a/h1;->j:Ljava/util/List;

    iget-object v12, v0, Lc/a/a/a/h1;->k:Lc/a/a/a/j2/d0$a;

    iget-boolean v13, v0, Lc/a/a/a/h1;->l:Z

    iget v14, v0, Lc/a/a/a/h1;->m:I

    iget-object v15, v0, Lc/a/a/a/h1;->n:Lc/a/a/a/i1;

    move-object/from16 p1, v1

    move-object/from16 v25, v2

    iget-wide v1, v0, Lc/a/a/a/h1;->q:J

    move-wide/from16 v16, v1

    iget-wide v1, v0, Lc/a/a/a/h1;->r:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lc/a/a/a/h1;->s:J

    move-wide/from16 v20, v1

    iget-boolean v1, v0, Lc/a/a/a/h1;->o:Z

    move/from16 v22, v1

    iget-boolean v1, v0, Lc/a/a/a/h1;->p:Z

    move/from16 v23, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v25

    invoke-direct/range {v1 .. v23}, Lc/a/a/a/h1;-><init>(Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;JILc/a/a/a/p0;ZLc/a/a/a/j2/q0;Lc/a/a/a/l2/o;Ljava/util/List;Lc/a/a/a/j2/d0$a;ZILc/a/a/a/i1;JJJZZ)V

    return-object v24
.end method

.method public b(Lc/a/a/a/j2/d0$a;)Lc/a/a/a/h1;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v12, p1

    .line 1
    new-instance v24, Lc/a/a/a/h1;

    move-object/from16 v1, v24

    iget-object v2, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v3, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-wide v4, v0, Lc/a/a/a/h1;->d:J

    iget v6, v0, Lc/a/a/a/h1;->e:I

    iget-object v7, v0, Lc/a/a/a/h1;->f:Lc/a/a/a/p0;

    iget-boolean v8, v0, Lc/a/a/a/h1;->g:Z

    iget-object v9, v0, Lc/a/a/a/h1;->h:Lc/a/a/a/j2/q0;

    iget-object v10, v0, Lc/a/a/a/h1;->i:Lc/a/a/a/l2/o;

    iget-object v11, v0, Lc/a/a/a/h1;->j:Ljava/util/List;

    iget-boolean v13, v0, Lc/a/a/a/h1;->l:Z

    iget v14, v0, Lc/a/a/a/h1;->m:I

    iget-object v15, v0, Lc/a/a/a/h1;->n:Lc/a/a/a/i1;

    move-object/from16 p1, v1

    move-object/from16 v25, v2

    iget-wide v1, v0, Lc/a/a/a/h1;->q:J

    move-wide/from16 v16, v1

    iget-wide v1, v0, Lc/a/a/a/h1;->r:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lc/a/a/a/h1;->s:J

    move-wide/from16 v20, v1

    iget-boolean v1, v0, Lc/a/a/a/h1;->o:Z

    move/from16 v22, v1

    iget-boolean v1, v0, Lc/a/a/a/h1;->p:Z

    move/from16 v23, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v25

    invoke-direct/range {v1 .. v23}, Lc/a/a/a/h1;-><init>(Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;JILc/a/a/a/p0;ZLc/a/a/a/j2/q0;Lc/a/a/a/l2/o;Ljava/util/List;Lc/a/a/a/j2/d0$a;ZILc/a/a/a/i1;JJJZZ)V

    return-object v24
.end method

.method public c(Lc/a/a/a/j2/d0$a;JJJLc/a/a/a/j2/q0;Lc/a/a/a/l2/o;Ljava/util/List;)Lc/a/a/a/h1;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/j2/d0$a;",
            "JJJ",
            "Lc/a/a/a/j2/q0;",
            "Lc/a/a/a/l2/o;",
            "Ljava/util/List<",
            "Lc/a/a/a/h2/a;",
            ">;)",
            "Lc/a/a/a/h1;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move-wide/from16 v20, p2

    move-wide/from16 v4, p4

    move-wide/from16 v18, p6

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    .line 1
    new-instance v24, Lc/a/a/a/h1;

    move-object/from16 v1, v24

    iget-object v2, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget v6, v0, Lc/a/a/a/h1;->e:I

    iget-object v7, v0, Lc/a/a/a/h1;->f:Lc/a/a/a/p0;

    iget-boolean v8, v0, Lc/a/a/a/h1;->g:Z

    iget-object v12, v0, Lc/a/a/a/h1;->k:Lc/a/a/a/j2/d0$a;

    iget-boolean v13, v0, Lc/a/a/a/h1;->l:Z

    iget v14, v0, Lc/a/a/a/h1;->m:I

    iget-object v15, v0, Lc/a/a/a/h1;->n:Lc/a/a/a/i1;

    move-object/from16 p1, v1

    move-object/from16 p2, v2

    iget-wide v1, v0, Lc/a/a/a/h1;->q:J

    move-wide/from16 v16, v1

    iget-boolean v1, v0, Lc/a/a/a/h1;->o:Z

    move/from16 v22, v1

    iget-boolean v1, v0, Lc/a/a/a/h1;->p:Z

    move/from16 v23, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v1 .. v23}, Lc/a/a/a/h1;-><init>(Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;JILc/a/a/a/p0;ZLc/a/a/a/j2/q0;Lc/a/a/a/l2/o;Ljava/util/List;Lc/a/a/a/j2/d0$a;ZILc/a/a/a/i1;JJJZZ)V

    return-object v24
.end method

.method public d(Z)Lc/a/a/a/h1;
    .locals 26

    move-object/from16 v0, p0

    move/from16 v22, p1

    .line 1
    new-instance v24, Lc/a/a/a/h1;

    move-object/from16 v1, v24

    iget-object v2, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v3, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-wide v4, v0, Lc/a/a/a/h1;->d:J

    iget v6, v0, Lc/a/a/a/h1;->e:I

    iget-object v7, v0, Lc/a/a/a/h1;->f:Lc/a/a/a/p0;

    iget-boolean v8, v0, Lc/a/a/a/h1;->g:Z

    iget-object v9, v0, Lc/a/a/a/h1;->h:Lc/a/a/a/j2/q0;

    iget-object v10, v0, Lc/a/a/a/h1;->i:Lc/a/a/a/l2/o;

    iget-object v11, v0, Lc/a/a/a/h1;->j:Ljava/util/List;

    iget-object v12, v0, Lc/a/a/a/h1;->k:Lc/a/a/a/j2/d0$a;

    iget-boolean v13, v0, Lc/a/a/a/h1;->l:Z

    iget v14, v0, Lc/a/a/a/h1;->m:I

    iget-object v15, v0, Lc/a/a/a/h1;->n:Lc/a/a/a/i1;

    move-object/from16 p1, v1

    move-object/from16 v25, v2

    iget-wide v1, v0, Lc/a/a/a/h1;->q:J

    move-wide/from16 v16, v1

    iget-wide v1, v0, Lc/a/a/a/h1;->r:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lc/a/a/a/h1;->s:J

    move-wide/from16 v20, v1

    iget-boolean v1, v0, Lc/a/a/a/h1;->p:Z

    move/from16 v23, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v25

    invoke-direct/range {v1 .. v23}, Lc/a/a/a/h1;-><init>(Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;JILc/a/a/a/p0;ZLc/a/a/a/j2/q0;Lc/a/a/a/l2/o;Ljava/util/List;Lc/a/a/a/j2/d0$a;ZILc/a/a/a/i1;JJJZZ)V

    return-object v24
.end method

.method public e(ZI)Lc/a/a/a/h1;
    .locals 25

    move-object/from16 v0, p0

    move/from16 v13, p1

    move/from16 v14, p2

    .line 1
    new-instance v24, Lc/a/a/a/h1;

    move-object/from16 v1, v24

    iget-object v2, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v3, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-wide v4, v0, Lc/a/a/a/h1;->d:J

    iget v6, v0, Lc/a/a/a/h1;->e:I

    iget-object v7, v0, Lc/a/a/a/h1;->f:Lc/a/a/a/p0;

    iget-boolean v8, v0, Lc/a/a/a/h1;->g:Z

    iget-object v9, v0, Lc/a/a/a/h1;->h:Lc/a/a/a/j2/q0;

    iget-object v10, v0, Lc/a/a/a/h1;->i:Lc/a/a/a/l2/o;

    iget-object v11, v0, Lc/a/a/a/h1;->j:Ljava/util/List;

    iget-object v12, v0, Lc/a/a/a/h1;->k:Lc/a/a/a/j2/d0$a;

    iget-object v15, v0, Lc/a/a/a/h1;->n:Lc/a/a/a/i1;

    move-object/from16 p1, v1

    move-object/from16 p2, v2

    iget-wide v1, v0, Lc/a/a/a/h1;->q:J

    move-wide/from16 v16, v1

    iget-wide v1, v0, Lc/a/a/a/h1;->r:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lc/a/a/a/h1;->s:J

    move-wide/from16 v20, v1

    iget-boolean v1, v0, Lc/a/a/a/h1;->o:Z

    move/from16 v22, v1

    iget-boolean v1, v0, Lc/a/a/a/h1;->p:Z

    move/from16 v23, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v1 .. v23}, Lc/a/a/a/h1;-><init>(Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;JILc/a/a/a/p0;ZLc/a/a/a/j2/q0;Lc/a/a/a/l2/o;Ljava/util/List;Lc/a/a/a/j2/d0$a;ZILc/a/a/a/i1;JJJZZ)V

    return-object v24
.end method

.method public f(Lc/a/a/a/p0;)Lc/a/a/a/h1;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    .line 1
    new-instance v24, Lc/a/a/a/h1;

    move-object/from16 v1, v24

    iget-object v2, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v3, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-wide v4, v0, Lc/a/a/a/h1;->d:J

    iget v6, v0, Lc/a/a/a/h1;->e:I

    iget-boolean v8, v0, Lc/a/a/a/h1;->g:Z

    iget-object v9, v0, Lc/a/a/a/h1;->h:Lc/a/a/a/j2/q0;

    iget-object v10, v0, Lc/a/a/a/h1;->i:Lc/a/a/a/l2/o;

    iget-object v11, v0, Lc/a/a/a/h1;->j:Ljava/util/List;

    iget-object v12, v0, Lc/a/a/a/h1;->k:Lc/a/a/a/j2/d0$a;

    iget-boolean v13, v0, Lc/a/a/a/h1;->l:Z

    iget v14, v0, Lc/a/a/a/h1;->m:I

    iget-object v15, v0, Lc/a/a/a/h1;->n:Lc/a/a/a/i1;

    move-object/from16 p1, v1

    move-object/from16 v25, v2

    iget-wide v1, v0, Lc/a/a/a/h1;->q:J

    move-wide/from16 v16, v1

    iget-wide v1, v0, Lc/a/a/a/h1;->r:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lc/a/a/a/h1;->s:J

    move-wide/from16 v20, v1

    iget-boolean v1, v0, Lc/a/a/a/h1;->o:Z

    move/from16 v22, v1

    iget-boolean v1, v0, Lc/a/a/a/h1;->p:Z

    move/from16 v23, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v25

    invoke-direct/range {v1 .. v23}, Lc/a/a/a/h1;-><init>(Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;JILc/a/a/a/p0;ZLc/a/a/a/j2/q0;Lc/a/a/a/l2/o;Ljava/util/List;Lc/a/a/a/j2/d0$a;ZILc/a/a/a/i1;JJJZZ)V

    return-object v24
.end method

.method public g(Lc/a/a/a/i1;)Lc/a/a/a/h1;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    .line 1
    new-instance v24, Lc/a/a/a/h1;

    move-object/from16 v1, v24

    iget-object v2, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v3, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-wide v4, v0, Lc/a/a/a/h1;->d:J

    iget v6, v0, Lc/a/a/a/h1;->e:I

    iget-object v7, v0, Lc/a/a/a/h1;->f:Lc/a/a/a/p0;

    iget-boolean v8, v0, Lc/a/a/a/h1;->g:Z

    iget-object v9, v0, Lc/a/a/a/h1;->h:Lc/a/a/a/j2/q0;

    iget-object v10, v0, Lc/a/a/a/h1;->i:Lc/a/a/a/l2/o;

    iget-object v11, v0, Lc/a/a/a/h1;->j:Ljava/util/List;

    iget-object v12, v0, Lc/a/a/a/h1;->k:Lc/a/a/a/j2/d0$a;

    iget-boolean v13, v0, Lc/a/a/a/h1;->l:Z

    iget v14, v0, Lc/a/a/a/h1;->m:I

    move-object/from16 p1, v1

    move-object/from16 v25, v2

    iget-wide v1, v0, Lc/a/a/a/h1;->q:J

    move-wide/from16 v16, v1

    iget-wide v1, v0, Lc/a/a/a/h1;->r:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lc/a/a/a/h1;->s:J

    move-wide/from16 v20, v1

    iget-boolean v1, v0, Lc/a/a/a/h1;->o:Z

    move/from16 v22, v1

    iget-boolean v1, v0, Lc/a/a/a/h1;->p:Z

    move/from16 v23, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v25

    invoke-direct/range {v1 .. v23}, Lc/a/a/a/h1;-><init>(Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;JILc/a/a/a/p0;ZLc/a/a/a/j2/q0;Lc/a/a/a/l2/o;Ljava/util/List;Lc/a/a/a/j2/d0$a;ZILc/a/a/a/i1;JJJZZ)V

    return-object v24
.end method

.method public h(I)Lc/a/a/a/h1;
    .locals 26

    move-object/from16 v0, p0

    move/from16 v6, p1

    .line 1
    new-instance v24, Lc/a/a/a/h1;

    move-object/from16 v1, v24

    iget-object v2, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v3, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-wide v4, v0, Lc/a/a/a/h1;->d:J

    iget-object v7, v0, Lc/a/a/a/h1;->f:Lc/a/a/a/p0;

    iget-boolean v8, v0, Lc/a/a/a/h1;->g:Z

    iget-object v9, v0, Lc/a/a/a/h1;->h:Lc/a/a/a/j2/q0;

    iget-object v10, v0, Lc/a/a/a/h1;->i:Lc/a/a/a/l2/o;

    iget-object v11, v0, Lc/a/a/a/h1;->j:Ljava/util/List;

    iget-object v12, v0, Lc/a/a/a/h1;->k:Lc/a/a/a/j2/d0$a;

    iget-boolean v13, v0, Lc/a/a/a/h1;->l:Z

    iget v14, v0, Lc/a/a/a/h1;->m:I

    iget-object v15, v0, Lc/a/a/a/h1;->n:Lc/a/a/a/i1;

    move-object/from16 p1, v1

    move-object/from16 v25, v2

    iget-wide v1, v0, Lc/a/a/a/h1;->q:J

    move-wide/from16 v16, v1

    iget-wide v1, v0, Lc/a/a/a/h1;->r:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lc/a/a/a/h1;->s:J

    move-wide/from16 v20, v1

    iget-boolean v1, v0, Lc/a/a/a/h1;->o:Z

    move/from16 v22, v1

    iget-boolean v1, v0, Lc/a/a/a/h1;->p:Z

    move/from16 v23, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v25

    invoke-direct/range {v1 .. v23}, Lc/a/a/a/h1;-><init>(Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;JILc/a/a/a/p0;ZLc/a/a/a/j2/q0;Lc/a/a/a/l2/o;Ljava/util/List;Lc/a/a/a/j2/d0$a;ZILc/a/a/a/i1;JJJZZ)V

    return-object v24
.end method

.method public i(Z)Lc/a/a/a/h1;
    .locals 26

    move-object/from16 v0, p0

    move/from16 v23, p1

    .line 1
    new-instance v24, Lc/a/a/a/h1;

    move-object/from16 v1, v24

    iget-object v2, v0, Lc/a/a/a/h1;->b:Lc/a/a/a/x1;

    iget-object v3, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-wide v4, v0, Lc/a/a/a/h1;->d:J

    iget v6, v0, Lc/a/a/a/h1;->e:I

    iget-object v7, v0, Lc/a/a/a/h1;->f:Lc/a/a/a/p0;

    iget-boolean v8, v0, Lc/a/a/a/h1;->g:Z

    iget-object v9, v0, Lc/a/a/a/h1;->h:Lc/a/a/a/j2/q0;

    iget-object v10, v0, Lc/a/a/a/h1;->i:Lc/a/a/a/l2/o;

    iget-object v11, v0, Lc/a/a/a/h1;->j:Ljava/util/List;

    iget-object v12, v0, Lc/a/a/a/h1;->k:Lc/a/a/a/j2/d0$a;

    iget-boolean v13, v0, Lc/a/a/a/h1;->l:Z

    iget v14, v0, Lc/a/a/a/h1;->m:I

    iget-object v15, v0, Lc/a/a/a/h1;->n:Lc/a/a/a/i1;

    move-object/from16 p1, v1

    move-object/from16 v25, v2

    iget-wide v1, v0, Lc/a/a/a/h1;->q:J

    move-wide/from16 v16, v1

    iget-wide v1, v0, Lc/a/a/a/h1;->r:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lc/a/a/a/h1;->s:J

    move-wide/from16 v20, v1

    iget-boolean v1, v0, Lc/a/a/a/h1;->o:Z

    move/from16 v22, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v25

    invoke-direct/range {v1 .. v23}, Lc/a/a/a/h1;-><init>(Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;JILc/a/a/a/p0;ZLc/a/a/a/j2/q0;Lc/a/a/a/l2/o;Ljava/util/List;Lc/a/a/a/j2/d0$a;ZILc/a/a/a/i1;JJJZZ)V

    return-object v24
.end method

.method public j(Lc/a/a/a/x1;)Lc/a/a/a/h1;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    .line 1
    new-instance v24, Lc/a/a/a/h1;

    move-object/from16 v1, v24

    iget-object v3, v0, Lc/a/a/a/h1;->c:Lc/a/a/a/j2/d0$a;

    iget-wide v4, v0, Lc/a/a/a/h1;->d:J

    iget v6, v0, Lc/a/a/a/h1;->e:I

    iget-object v7, v0, Lc/a/a/a/h1;->f:Lc/a/a/a/p0;

    iget-boolean v8, v0, Lc/a/a/a/h1;->g:Z

    iget-object v9, v0, Lc/a/a/a/h1;->h:Lc/a/a/a/j2/q0;

    iget-object v10, v0, Lc/a/a/a/h1;->i:Lc/a/a/a/l2/o;

    iget-object v11, v0, Lc/a/a/a/h1;->j:Ljava/util/List;

    iget-object v12, v0, Lc/a/a/a/h1;->k:Lc/a/a/a/j2/d0$a;

    iget-boolean v13, v0, Lc/a/a/a/h1;->l:Z

    iget v14, v0, Lc/a/a/a/h1;->m:I

    iget-object v15, v0, Lc/a/a/a/h1;->n:Lc/a/a/a/i1;

    move-object/from16 v25, v1

    iget-wide v1, v0, Lc/a/a/a/h1;->q:J

    move-wide/from16 v16, v1

    iget-wide v1, v0, Lc/a/a/a/h1;->r:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lc/a/a/a/h1;->s:J

    move-wide/from16 v20, v1

    iget-boolean v1, v0, Lc/a/a/a/h1;->o:Z

    move/from16 v22, v1

    iget-boolean v1, v0, Lc/a/a/a/h1;->p:Z

    move/from16 v23, v1

    move-object/from16 v2, p1

    move-object/from16 v1, v25

    invoke-direct/range {v1 .. v23}, Lc/a/a/a/h1;-><init>(Lc/a/a/a/x1;Lc/a/a/a/j2/d0$a;JILc/a/a/a/p0;ZLc/a/a/a/j2/q0;Lc/a/a/a/l2/o;Ljava/util/List;Lc/a/a/a/j2/d0$a;ZILc/a/a/a/i1;JJJZZ)V

    return-object v24
.end method
