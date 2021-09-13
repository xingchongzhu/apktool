.class public final Lc/a/a/a/f2/s;
.super Ljava/lang/Object;
.source "FlacStreamMetadata.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/f2/s$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:J

.field public final k:Lc/a/a/a/f2/s$a;

.field private final l:Lc/a/a/a/h2/a;


# direct methods
.method private constructor <init>(IIIIIIIJLc/a/a/a/f2/s$a;Lc/a/a/a/h2/a;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput p1, p0, Lc/a/a/a/f2/s;->a:I

    .line 18
    iput p2, p0, Lc/a/a/a/f2/s;->b:I

    .line 19
    iput p3, p0, Lc/a/a/a/f2/s;->c:I

    .line 20
    iput p4, p0, Lc/a/a/a/f2/s;->d:I

    .line 21
    iput p5, p0, Lc/a/a/a/f2/s;->e:I

    .line 22
    invoke-static {p5}, Lc/a/a/a/f2/s;->k(I)I

    move-result p1

    iput p1, p0, Lc/a/a/a/f2/s;->f:I

    .line 23
    iput p6, p0, Lc/a/a/a/f2/s;->g:I

    .line 24
    iput p7, p0, Lc/a/a/a/f2/s;->h:I

    .line 25
    invoke-static {p7}, Lc/a/a/a/f2/s;->f(I)I

    move-result p1

    iput p1, p0, Lc/a/a/a/f2/s;->i:I

    .line 26
    iput-wide p8, p0, Lc/a/a/a/f2/s;->j:J

    .line 27
    iput-object p10, p0, Lc/a/a/a/f2/s;->k:Lc/a/a/a/f2/s$a;

    .line 28
    iput-object p11, p0, Lc/a/a/a/f2/s;->l:Lc/a/a/a/h2/a;

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lc/a/a/a/m2/z;

    invoke-direct {v0, p1}, Lc/a/a/a/m2/z;-><init>([B)V

    mul-int/lit8 p2, p2, 0x8

    .line 3
    invoke-virtual {v0, p2}, Lc/a/a/a/m2/z;->p(I)V

    const/16 p1, 0x10

    .line 4
    invoke-virtual {v0, p1}, Lc/a/a/a/m2/z;->h(I)I

    move-result p2

    iput p2, p0, Lc/a/a/a/f2/s;->a:I

    .line 5
    invoke-virtual {v0, p1}, Lc/a/a/a/m2/z;->h(I)I

    move-result p1

    iput p1, p0, Lc/a/a/a/f2/s;->b:I

    const/16 p1, 0x18

    .line 6
    invoke-virtual {v0, p1}, Lc/a/a/a/m2/z;->h(I)I

    move-result p2

    iput p2, p0, Lc/a/a/a/f2/s;->c:I

    .line 7
    invoke-virtual {v0, p1}, Lc/a/a/a/m2/z;->h(I)I

    move-result p1

    iput p1, p0, Lc/a/a/a/f2/s;->d:I

    const/16 p1, 0x14

    .line 8
    invoke-virtual {v0, p1}, Lc/a/a/a/m2/z;->h(I)I

    move-result p1

    iput p1, p0, Lc/a/a/a/f2/s;->e:I

    .line 9
    invoke-static {p1}, Lc/a/a/a/f2/s;->k(I)I

    move-result p1

    iput p1, p0, Lc/a/a/a/f2/s;->f:I

    const/4 p1, 0x3

    .line 10
    invoke-virtual {v0, p1}, Lc/a/a/a/m2/z;->h(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lc/a/a/a/f2/s;->g:I

    const/4 p1, 0x5

    .line 11
    invoke-virtual {v0, p1}, Lc/a/a/a/m2/z;->h(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lc/a/a/a/f2/s;->h:I

    .line 12
    invoke-static {p1}, Lc/a/a/a/f2/s;->f(I)I

    move-result p1

    iput p1, p0, Lc/a/a/a/f2/s;->i:I

    const/16 p1, 0x24

    .line 13
    invoke-virtual {v0, p1}, Lc/a/a/a/m2/z;->j(I)J

    move-result-wide p1

    iput-wide p1, p0, Lc/a/a/a/f2/s;->j:J

    const/4 p1, 0x0

    .line 14
    iput-object p1, p0, Lc/a/a/a/f2/s;->k:Lc/a/a/a/f2/s$a;

    .line 15
    iput-object p1, p0, Lc/a/a/a/f2/s;->l:Lc/a/a/a/h2/a;

    return-void
.end method

.method private static a(Ljava/util/List;Ljava/util/List;)Lc/a/a/a/h2/a;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lc/a/a/a/h2/k/a;",
            ">;)",
            "Lc/a/a/a/h2/a;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 3
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_2

    .line 4
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "="

    .line 5
    invoke-static {v4, v5}, Lc/a/a/a/m2/m0;->E0(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 6
    array-length v6, v5

    const/4 v7, 0x2

    if-eq v6, v7, :cond_1

    .line 7
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Failed to parse Vorbis comment: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "FlacStreamMetadata"

    invoke-static {v5, v4}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 8
    :cond_1
    new-instance v4, Lc/a/a/a/h2/k/b;

    aget-object v6, v5, v2

    const/4 v7, 0x1

    aget-object v5, v5, v7

    invoke-direct {v4, v6, v5}, Lc/a/a/a/h2/k/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 10
    :cond_2
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_2

    :cond_3
    new-instance v1, Lc/a/a/a/h2/a;

    invoke-direct {v1, v0}, Lc/a/a/a/h2/a;-><init>(Ljava/util/List;)V

    :goto_2
    return-object v1
.end method

.method private static f(I)I
    .locals 1

    const/16 v0, 0x8

    if-eq p0, v0, :cond_4

    const/16 v0, 0xc

    if-eq p0, v0, :cond_3

    const/16 v0, 0x10

    if-eq p0, v0, :cond_2

    const/16 v0, 0x14

    if-eq p0, v0, :cond_1

    const/16 v0, 0x18

    if-eq p0, v0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    const/4 p0, 0x6

    return p0

    :cond_1
    const/4 p0, 0x5

    return p0

    :cond_2
    const/4 p0, 0x4

    return p0

    :cond_3
    const/4 p0, 0x2

    return p0

    :cond_4
    const/4 p0, 0x1

    return p0
.end method

.method private static k(I)I
    .locals 0

    sparse-switch p0, :sswitch_data_0

    const/4 p0, -0x1

    return p0

    :sswitch_0
    const/4 p0, 0x3

    return p0

    :sswitch_1
    const/4 p0, 0x2

    return p0

    :sswitch_2
    const/16 p0, 0xb

    return p0

    :sswitch_3
    const/4 p0, 0x1

    return p0

    :sswitch_4
    const/16 p0, 0xa

    return p0

    :sswitch_5
    const/16 p0, 0x9

    return p0

    :sswitch_6
    const/16 p0, 0x8

    return p0

    :sswitch_7
    const/4 p0, 0x7

    return p0

    :sswitch_8
    const/4 p0, 0x6

    return p0

    :sswitch_9
    const/4 p0, 0x5

    return p0

    :sswitch_a
    const/4 p0, 0x4

    return p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1f40 -> :sswitch_a
        0x3e80 -> :sswitch_9
        0x5622 -> :sswitch_8
        0x5dc0 -> :sswitch_7
        0x7d00 -> :sswitch_6
        0xac44 -> :sswitch_5
        0xbb80 -> :sswitch_4
        0x15888 -> :sswitch_3
        0x17700 -> :sswitch_2
        0x2b110 -> :sswitch_1
        0x2ee00 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public b(Ljava/util/List;)Lc/a/a/a/f2/s;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/a/a/a/h2/k/a;",
            ">;)",
            "Lc/a/a/a/f2/s;"
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Lc/a/a/a/f2/s;->a(Ljava/util/List;Ljava/util/List;)Lc/a/a/a/h2/a;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p1}, Lc/a/a/a/f2/s;->i(Lc/a/a/a/h2/a;)Lc/a/a/a/h2/a;

    move-result-object v11

    .line 3
    new-instance p1, Lc/a/a/a/f2/s;

    iget v1, p0, Lc/a/a/a/f2/s;->a:I

    iget v2, p0, Lc/a/a/a/f2/s;->b:I

    iget v3, p0, Lc/a/a/a/f2/s;->c:I

    iget v4, p0, Lc/a/a/a/f2/s;->d:I

    iget v5, p0, Lc/a/a/a/f2/s;->e:I

    iget v6, p0, Lc/a/a/a/f2/s;->g:I

    iget v7, p0, Lc/a/a/a/f2/s;->h:I

    iget-wide v8, p0, Lc/a/a/a/f2/s;->j:J

    iget-object v10, p0, Lc/a/a/a/f2/s;->k:Lc/a/a/a/f2/s$a;

    move-object v0, p1

    invoke-direct/range {v0 .. v11}, Lc/a/a/a/f2/s;-><init>(IIIIIIIJLc/a/a/a/f2/s$a;Lc/a/a/a/h2/a;)V

    return-object p1
.end method

.method public c(Lc/a/a/a/f2/s$a;)Lc/a/a/a/f2/s;
    .locals 13

    .line 1
    new-instance v12, Lc/a/a/a/f2/s;

    iget v1, p0, Lc/a/a/a/f2/s;->a:I

    iget v2, p0, Lc/a/a/a/f2/s;->b:I

    iget v3, p0, Lc/a/a/a/f2/s;->c:I

    iget v4, p0, Lc/a/a/a/f2/s;->d:I

    iget v5, p0, Lc/a/a/a/f2/s;->e:I

    iget v6, p0, Lc/a/a/a/f2/s;->g:I

    iget v7, p0, Lc/a/a/a/f2/s;->h:I

    iget-wide v8, p0, Lc/a/a/a/f2/s;->j:J

    iget-object v11, p0, Lc/a/a/a/f2/s;->l:Lc/a/a/a/h2/a;

    move-object v0, v12

    move-object v10, p1

    invoke-direct/range {v0 .. v11}, Lc/a/a/a/f2/s;-><init>(IIIIIIIJLc/a/a/a/f2/s$a;Lc/a/a/a/h2/a;)V

    return-object v12
.end method

.method public d(Ljava/util/List;)Lc/a/a/a/f2/s;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lc/a/a/a/f2/s;"
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Lc/a/a/a/f2/s;->a(Ljava/util/List;Ljava/util/List;)Lc/a/a/a/h2/a;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p1}, Lc/a/a/a/f2/s;->i(Lc/a/a/a/h2/a;)Lc/a/a/a/h2/a;

    move-result-object v11

    .line 3
    new-instance p1, Lc/a/a/a/f2/s;

    iget v1, p0, Lc/a/a/a/f2/s;->a:I

    iget v2, p0, Lc/a/a/a/f2/s;->b:I

    iget v3, p0, Lc/a/a/a/f2/s;->c:I

    iget v4, p0, Lc/a/a/a/f2/s;->d:I

    iget v5, p0, Lc/a/a/a/f2/s;->e:I

    iget v6, p0, Lc/a/a/a/f2/s;->g:I

    iget v7, p0, Lc/a/a/a/f2/s;->h:I

    iget-wide v8, p0, Lc/a/a/a/f2/s;->j:J

    iget-object v10, p0, Lc/a/a/a/f2/s;->k:Lc/a/a/a/f2/s$a;

    move-object v0, p1

    invoke-direct/range {v0 .. v11}, Lc/a/a/a/f2/s;-><init>(IIIIIIIJLc/a/a/a/f2/s$a;Lc/a/a/a/h2/a;)V

    return-object p1
.end method

.method public e()J
    .locals 4

    .line 1
    iget v0, p0, Lc/a/a/a/f2/s;->d:I

    if-lez v0, :cond_0

    int-to-long v0, v0

    .line 2
    iget v2, p0, Lc/a/a/a/f2/s;->c:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    const-wide/16 v2, 0x2

    div-long/2addr v0, v2

    const-wide/16 v2, 0x1

    :goto_0
    add-long/2addr v0, v2

    goto :goto_2

    .line 3
    :cond_0
    iget v0, p0, Lc/a/a/a/f2/s;->a:I

    iget v1, p0, Lc/a/a/a/f2/s;->b:I

    if-ne v0, v1, :cond_1

    if-lez v0, :cond_1

    int-to-long v0, v0

    goto :goto_1

    :cond_1
    const-wide/16 v0, 0x1000

    .line 4
    :goto_1
    iget v2, p0, Lc/a/a/a/f2/s;->g:I

    int-to-long v2, v2

    mul-long v0, v0, v2

    iget v2, p0, Lc/a/a/a/f2/s;->h:I

    int-to-long v2, v2

    mul-long v0, v0, v2

    const-wide/16 v2, 0x8

    div-long/2addr v0, v2

    const-wide/16 v2, 0x40

    goto :goto_0

    :goto_2
    return-wide v0
.end method

.method public g()J
    .locals 5

    .line 1
    iget-wide v0, p0, Lc/a/a/a/f2/s;->j:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_0

    :cond_0
    const-wide/32 v2, 0xf4240

    mul-long v0, v0, v2

    iget v2, p0, Lc/a/a/a/f2/s;->e:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    :goto_0
    return-wide v0
.end method

.method public h([BLc/a/a/a/h2/a;)Lc/a/a/a/u0;
    .locals 3

    const/4 v0, 0x4

    const/16 v1, -0x80

    .line 1
    aput-byte v1, p1, v0

    .line 2
    iget v0, p0, Lc/a/a/a/f2/s;->d:I

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    .line 3
    :goto_0
    invoke-virtual {p0, p2}, Lc/a/a/a/f2/s;->i(Lc/a/a/a/h2/a;)Lc/a/a/a/h2/a;

    move-result-object p2

    .line 4
    new-instance v1, Lc/a/a/a/u0$b;

    invoke-direct {v1}, Lc/a/a/a/u0$b;-><init>()V

    const-string v2, "audio/flac"

    .line 5
    invoke-virtual {v1, v2}, Lc/a/a/a/u0$b;->e0(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v1

    .line 6
    invoke-virtual {v1, v0}, Lc/a/a/a/u0$b;->W(I)Lc/a/a/a/u0$b;

    move-result-object v0

    iget v1, p0, Lc/a/a/a/f2/s;->g:I

    .line 7
    invoke-virtual {v0, v1}, Lc/a/a/a/u0$b;->H(I)Lc/a/a/a/u0$b;

    move-result-object v0

    iget v1, p0, Lc/a/a/a/f2/s;->e:I

    .line 8
    invoke-virtual {v0, v1}, Lc/a/a/a/u0$b;->f0(I)Lc/a/a/a/u0$b;

    move-result-object v0

    .line 9
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lc/a/a/a/u0$b;->T(Ljava/util/List;)Lc/a/a/a/u0$b;

    move-result-object p1

    .line 10
    invoke-virtual {p1, p2}, Lc/a/a/a/u0$b;->X(Lc/a/a/a/h2/a;)Lc/a/a/a/u0$b;

    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object p1

    return-object p1
.end method

.method public i(Lc/a/a/a/h2/a;)Lc/a/a/a/h2/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/s;->l:Lc/a/a/a/h2/a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lc/a/a/a/h2/a;->m(Lc/a/a/a/h2/a;)Lc/a/a/a/h2/a;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public j(J)J
    .locals 8

    .line 1
    iget v0, p0, Lc/a/a/a/f2/s;->e:I

    int-to-long v0, v0

    mul-long p1, p1, v0

    const-wide/32 v0, 0xf4240

    div-long v2, p1, v0

    .line 2
    iget-wide p1, p0, Lc/a/a/a/f2/s;->j:J

    const-wide/16 v0, 0x1

    sub-long v6, p1, v0

    const-wide/16 v4, 0x0

    invoke-static/range {v2 .. v7}, Lc/a/a/a/m2/m0;->q(JJJ)J

    move-result-wide p1

    return-wide p1
.end method
