.class public final Lc/a/a/a/x1$c;
.super Ljava/lang/Object;
.source "Timeline.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/x1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:Ljava/lang/Object;

.field private static final b:Lc/a/a/a/z0;


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public e:Lc/a/a/a/z0;

.field public f:Ljava/lang/Object;

.field public g:J

.field public h:J

.field public i:J

.field public j:Z

.field public k:Z

.field public l:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public m:Lc/a/a/a/z0$f;

.field public n:Z

.field public o:I

.field public p:I

.field public q:J

.field public r:J

.field public s:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lc/a/a/a/x1$c;->a:Ljava/lang/Object;

    .line 2
    new-instance v0, Lc/a/a/a/z0$c;

    invoke-direct {v0}, Lc/a/a/a/z0$c;-><init>()V

    const-string v1, "com.google.android.exoplayer2.Timeline"

    .line 3
    invoke-virtual {v0, v1}, Lc/a/a/a/z0$c;->d(Ljava/lang/String;)Lc/a/a/a/z0$c;

    move-result-object v0

    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 4
    invoke-virtual {v0, v1}, Lc/a/a/a/z0$c;->g(Landroid/net/Uri;)Lc/a/a/a/z0$c;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lc/a/a/a/z0$c;->a()Lc/a/a/a/z0;

    move-result-object v0

    sput-object v0, Lc/a/a/a/x1$c;->b:Lc/a/a/a/z0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lc/a/a/a/x1$c;->a:Ljava/lang/Object;

    iput-object v0, p0, Lc/a/a/a/x1$c;->c:Ljava/lang/Object;

    .line 3
    sget-object v0, Lc/a/a/a/x1$c;->b:Lc/a/a/a/z0;

    iput-object v0, p0, Lc/a/a/a/x1$c;->e:Lc/a/a/a/z0;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/x1$c;->i:J

    invoke-static {v0, v1}, Lc/a/a/a/m2/m0;->U(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public b()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/x1$c;->q:J

    invoke-static {v0, v1}, Lc/a/a/a/i0;->d(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/x1$c;->q:J

    return-wide v0
.end method

.method public d()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/x1$c;->r:J

    invoke-static {v0, v1}, Lc/a/a/a/i0;->d(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public e()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/x1$c;->s:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 1
    const-class v2, Lc/a/a/a/x1$c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_1

    .line 2
    :cond_1
    check-cast p1, Lc/a/a/a/x1$c;

    .line 3
    iget-object v2, p0, Lc/a/a/a/x1$c;->c:Ljava/lang/Object;

    iget-object v3, p1, Lc/a/a/a/x1$c;->c:Ljava/lang/Object;

    invoke-static {v2, v3}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lc/a/a/a/x1$c;->e:Lc/a/a/a/z0;

    iget-object v3, p1, Lc/a/a/a/x1$c;->e:Lc/a/a/a/z0;

    .line 4
    invoke-static {v2, v3}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lc/a/a/a/x1$c;->f:Ljava/lang/Object;

    iget-object v3, p1, Lc/a/a/a/x1$c;->f:Ljava/lang/Object;

    .line 5
    invoke-static {v2, v3}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lc/a/a/a/x1$c;->m:Lc/a/a/a/z0$f;

    iget-object v3, p1, Lc/a/a/a/x1$c;->m:Lc/a/a/a/z0$f;

    .line 6
    invoke-static {v2, v3}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-wide v2, p0, Lc/a/a/a/x1$c;->g:J

    iget-wide v4, p1, Lc/a/a/a/x1$c;->g:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-wide v2, p0, Lc/a/a/a/x1$c;->h:J

    iget-wide v4, p1, Lc/a/a/a/x1$c;->h:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-wide v2, p0, Lc/a/a/a/x1$c;->i:J

    iget-wide v4, p1, Lc/a/a/a/x1$c;->i:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-boolean v2, p0, Lc/a/a/a/x1$c;->j:Z

    iget-boolean v3, p1, Lc/a/a/a/x1$c;->j:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lc/a/a/a/x1$c;->k:Z

    iget-boolean v3, p1, Lc/a/a/a/x1$c;->k:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lc/a/a/a/x1$c;->n:Z

    iget-boolean v3, p1, Lc/a/a/a/x1$c;->n:Z

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lc/a/a/a/x1$c;->q:J

    iget-wide v4, p1, Lc/a/a/a/x1$c;->q:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-wide v2, p0, Lc/a/a/a/x1$c;->r:J

    iget-wide v4, p1, Lc/a/a/a/x1$c;->r:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget v2, p0, Lc/a/a/a/x1$c;->o:I

    iget v3, p1, Lc/a/a/a/x1$c;->o:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lc/a/a/a/x1$c;->p:I

    iget v3, p1, Lc/a/a/a/x1$c;->p:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lc/a/a/a/x1$c;->s:J

    iget-wide v4, p1, Lc/a/a/a/x1$c;->s:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public f()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/x1$c;->l:Z

    iget-object v1, p0, Lc/a/a/a/x1$c;->m:Lc/a/a/a/z0$f;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/x1$c;->m:Lc/a/a/a/z0$f;

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    return v2
.end method

.method public g(Ljava/lang/Object;Lc/a/a/a/z0;Ljava/lang/Object;JJJZZLc/a/a/a/z0$f;JJIIJ)Lc/a/a/a/x1$c;
    .locals 5

    move-object v0, p0

    move-object v1, p2

    move-object/from16 v2, p12

    move-object v3, p1

    .line 1
    iput-object v3, v0, Lc/a/a/a/x1$c;->c:Ljava/lang/Object;

    if-eqz v1, :cond_0

    move-object v3, v1

    goto :goto_0

    .line 2
    :cond_0
    sget-object v3, Lc/a/a/a/x1$c;->b:Lc/a/a/a/z0;

    :goto_0
    iput-object v3, v0, Lc/a/a/a/x1$c;->e:Lc/a/a/a/z0;

    if-eqz v1, :cond_1

    .line 3
    iget-object v1, v1, Lc/a/a/a/z0;->b:Lc/a/a/a/z0$g;

    if-eqz v1, :cond_1

    .line 4
    iget-object v1, v1, Lc/a/a/a/z0$g;->h:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 5
    :goto_1
    iput-object v1, v0, Lc/a/a/a/x1$c;->d:Ljava/lang/Object;

    move-object v1, p3

    .line 6
    iput-object v1, v0, Lc/a/a/a/x1$c;->f:Ljava/lang/Object;

    move-wide v3, p4

    .line 7
    iput-wide v3, v0, Lc/a/a/a/x1$c;->g:J

    move-wide v3, p6

    .line 8
    iput-wide v3, v0, Lc/a/a/a/x1$c;->h:J

    move-wide v3, p8

    .line 9
    iput-wide v3, v0, Lc/a/a/a/x1$c;->i:J

    move v1, p10

    .line 10
    iput-boolean v1, v0, Lc/a/a/a/x1$c;->j:Z

    move/from16 v1, p11

    .line 11
    iput-boolean v1, v0, Lc/a/a/a/x1$c;->k:Z

    const/4 v1, 0x0

    if-eqz v2, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    .line 12
    :goto_2
    iput-boolean v3, v0, Lc/a/a/a/x1$c;->l:Z

    .line 13
    iput-object v2, v0, Lc/a/a/a/x1$c;->m:Lc/a/a/a/z0$f;

    move-wide/from16 v2, p13

    .line 14
    iput-wide v2, v0, Lc/a/a/a/x1$c;->q:J

    move-wide/from16 v2, p15

    .line 15
    iput-wide v2, v0, Lc/a/a/a/x1$c;->r:J

    move/from16 v2, p17

    .line 16
    iput v2, v0, Lc/a/a/a/x1$c;->o:I

    move/from16 v2, p18

    .line 17
    iput v2, v0, Lc/a/a/a/x1$c;->p:I

    move-wide/from16 v2, p19

    .line 18
    iput-wide v2, v0, Lc/a/a/a/x1$c;->s:J

    .line 19
    iput-boolean v1, v0, Lc/a/a/a/x1$c;->n:Z

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, Lc/a/a/a/x1$c;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0xd9

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 2
    iget-object v0, p0, Lc/a/a/a/x1$c;->e:Lc/a/a/a/z0;

    invoke-virtual {v0}, Lc/a/a/a/z0;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 3
    iget-object v0, p0, Lc/a/a/a/x1$c;->f:Ljava/lang/Object;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 4
    iget-object v0, p0, Lc/a/a/a/x1$c;->m:Lc/a/a/a/z0$f;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lc/a/a/a/z0$f;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    .line 5
    iget-wide v2, p0, Lc/a/a/a/x1$c;->g:J

    const/16 v0, 0x20

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v3, v2

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    .line 6
    iget-wide v2, p0, Lc/a/a/a/x1$c;->h:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v3, v2

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    .line 7
    iget-wide v2, p0, Lc/a/a/a/x1$c;->i:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v3, v2

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    .line 8
    iget-boolean v2, p0, Lc/a/a/a/x1$c;->j:Z

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    .line 9
    iget-boolean v2, p0, Lc/a/a/a/x1$c;->k:Z

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    .line 10
    iget-boolean v2, p0, Lc/a/a/a/x1$c;->n:Z

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    .line 11
    iget-wide v2, p0, Lc/a/a/a/x1$c;->q:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v3, v2

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    .line 12
    iget-wide v2, p0, Lc/a/a/a/x1$c;->r:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v3, v2

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    .line 13
    iget v2, p0, Lc/a/a/a/x1$c;->o:I

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    .line 14
    iget v2, p0, Lc/a/a/a/x1$c;->p:I

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    .line 15
    iget-wide v2, p0, Lc/a/a/a/x1$c;->s:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v0, v2

    add-int/2addr v1, v0

    return v1
.end method
