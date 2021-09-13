.class public final Lc/a/a/a/f2/n0/b;
.super Ljava/lang/Object;
.source "WavExtractor.java"

# interfaces
.implements Lc/a/a/a/f2/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/f2/n0/b$a;,
        Lc/a/a/a/f2/n0/b$c;,
        Lc/a/a/a/f2/n0/b$b;
    }
.end annotation


# static fields
.field public static final a:Lc/a/a/a/f2/o;


# instance fields
.field private b:Lc/a/a/a/f2/l;

.field private c:Lc/a/a/a/f2/b0;

.field private d:Lc/a/a/a/f2/n0/b$b;

.field private e:I

.field private f:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lc/a/a/a/f2/n0/a;->b:Lc/a/a/a/f2/n0/a;

    sput-object v0, Lc/a/a/a/f2/n0/b;->a:Lc/a/a/a/f2/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lc/a/a/a/f2/n0/b;->e:I

    const-wide/16 v0, -0x1

    .line 3
    iput-wide v0, p0, Lc/a/a/a/f2/n0/b;->f:J

    return-void
.end method

.method private d()V
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "extractorOutput",
            "trackOutput"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/n0/b;->c:Lc/a/a/a/f2/b0;

    invoke-static {v0}, Lc/a/a/a/m2/f;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lc/a/a/a/f2/n0/b;->b:Lc/a/a/a/f2/l;

    invoke-static {v0}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static synthetic f()[Lc/a/a/a/f2/j;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lc/a/a/a/f2/j;

    .line 1
    new-instance v1, Lc/a/a/a/f2/n0/b;

    invoke-direct {v1}, Lc/a/a/a/f2/n0/b;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(Lc/a/a/a/f2/l;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lc/a/a/a/f2/n0/b;->b:Lc/a/a/a/f2/l;

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 2
    invoke-interface {p1, v0, v1}, Lc/a/a/a/f2/l;->q(II)Lc/a/a/a/f2/b0;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/f2/n0/b;->c:Lc/a/a/a/f2/b0;

    .line 3
    invoke-interface {p1}, Lc/a/a/a/f2/l;->h()V

    return-void
.end method

.method public c(JJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lc/a/a/a/f2/n0/b;->d:Lc/a/a/a/f2/n0/b$b;

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1, p3, p4}, Lc/a/a/a/f2/n0/b$b;->b(J)V

    :cond_0
    return-void
.end method

.method public e(Lc/a/a/a/f2/k;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lc/a/a/a/f2/n0/d;->a(Lc/a/a/a/f2/k;)Lc/a/a/a/f2/n0/c;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public i(Lc/a/a/a/f2/k;Lc/a/a/a/f2/x;)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lc/a/a/a/f2/n0/b;->d()V

    .line 2
    iget-object p2, p0, Lc/a/a/a/f2/n0/b;->d:Lc/a/a/a/f2/n0/b$b;

    if-nez p2, :cond_5

    .line 3
    invoke-static {p1}, Lc/a/a/a/f2/n0/d;->a(Lc/a/a/a/f2/k;)Lc/a/a/a/f2/n0/c;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 4
    iget p2, v3, Lc/a/a/a/f2/n0/c;->a:I

    const/16 v0, 0x11

    if-ne p2, v0, :cond_0

    .line 5
    new-instance p2, Lc/a/a/a/f2/n0/b$a;

    iget-object v0, p0, Lc/a/a/a/f2/n0/b;->b:Lc/a/a/a/f2/l;

    iget-object v1, p0, Lc/a/a/a/f2/n0/b;->c:Lc/a/a/a/f2/b0;

    invoke-direct {p2, v0, v1, v3}, Lc/a/a/a/f2/n0/b$a;-><init>(Lc/a/a/a/f2/l;Lc/a/a/a/f2/b0;Lc/a/a/a/f2/n0/c;)V

    iput-object p2, p0, Lc/a/a/a/f2/n0/b;->d:Lc/a/a/a/f2/n0/b$b;

    goto :goto_0

    :cond_0
    const/4 v0, 0x6

    if-ne p2, v0, :cond_1

    .line 6
    new-instance p2, Lc/a/a/a/f2/n0/b$c;

    iget-object v1, p0, Lc/a/a/a/f2/n0/b;->b:Lc/a/a/a/f2/l;

    iget-object v2, p0, Lc/a/a/a/f2/n0/b;->c:Lc/a/a/a/f2/b0;

    const/4 v5, -0x1

    const-string v4, "audio/g711-alaw"

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lc/a/a/a/f2/n0/b$c;-><init>(Lc/a/a/a/f2/l;Lc/a/a/a/f2/b0;Lc/a/a/a/f2/n0/c;Ljava/lang/String;I)V

    iput-object p2, p0, Lc/a/a/a/f2/n0/b;->d:Lc/a/a/a/f2/n0/b$b;

    goto :goto_0

    :cond_1
    const/4 v0, 0x7

    if-ne p2, v0, :cond_2

    .line 7
    new-instance p2, Lc/a/a/a/f2/n0/b$c;

    iget-object v1, p0, Lc/a/a/a/f2/n0/b;->b:Lc/a/a/a/f2/l;

    iget-object v2, p0, Lc/a/a/a/f2/n0/b;->c:Lc/a/a/a/f2/b0;

    const/4 v5, -0x1

    const-string v4, "audio/g711-mlaw"

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lc/a/a/a/f2/n0/b$c;-><init>(Lc/a/a/a/f2/l;Lc/a/a/a/f2/b0;Lc/a/a/a/f2/n0/c;Ljava/lang/String;I)V

    iput-object p2, p0, Lc/a/a/a/f2/n0/b;->d:Lc/a/a/a/f2/n0/b$b;

    goto :goto_0

    .line 8
    :cond_2
    iget v0, v3, Lc/a/a/a/f2/n0/c;->f:I

    invoke-static {p2, v0}, Lc/a/a/a/b2/j0;->a(II)I

    move-result v5

    if-eqz v5, :cond_3

    .line 9
    new-instance p2, Lc/a/a/a/f2/n0/b$c;

    iget-object v1, p0, Lc/a/a/a/f2/n0/b;->b:Lc/a/a/a/f2/l;

    iget-object v2, p0, Lc/a/a/a/f2/n0/b;->c:Lc/a/a/a/f2/b0;

    const-string v4, "audio/raw"

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lc/a/a/a/f2/n0/b$c;-><init>(Lc/a/a/a/f2/l;Lc/a/a/a/f2/b0;Lc/a/a/a/f2/n0/c;Ljava/lang/String;I)V

    iput-object p2, p0, Lc/a/a/a/f2/n0/b;->d:Lc/a/a/a/f2/n0/b$b;

    goto :goto_0

    .line 10
    :cond_3
    new-instance p1, Lc/a/a/a/g1;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unsupported WAV format type: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v3, Lc/a/a/a/f2/n0/c;->a:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1

    .line 11
    :cond_4
    new-instance p1, Lc/a/a/a/g1;

    const-string p2, "Unsupported or unrecognized wav header."

    invoke-direct {p1, p2}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :cond_5
    :goto_0
    iget p2, p0, Lc/a/a/a/f2/n0/b;->e:I

    const/4 v0, -0x1

    if-ne p2, v0, :cond_6

    .line 13
    invoke-static {p1}, Lc/a/a/a/f2/n0/d;->b(Lc/a/a/a/f2/k;)Landroid/util/Pair;

    move-result-object p2

    .line 14
    iget-object v1, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->intValue()I

    move-result v1

    iput v1, p0, Lc/a/a/a/f2/n0/b;->e:I

    .line 15
    iget-object p2, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iput-wide v1, p0, Lc/a/a/a/f2/n0/b;->f:J

    .line 16
    iget-object p2, p0, Lc/a/a/a/f2/n0/b;->d:Lc/a/a/a/f2/n0/b$b;

    iget v3, p0, Lc/a/a/a/f2/n0/b;->e:I

    invoke-interface {p2, v3, v1, v2}, Lc/a/a/a/f2/n0/b$b;->a(IJ)V

    goto :goto_1

    .line 17
    :cond_6
    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long p2, v1, v3

    if-nez p2, :cond_7

    .line 18
    iget p2, p0, Lc/a/a/a/f2/n0/b;->e:I

    invoke-interface {p1, p2}, Lc/a/a/a/f2/k;->i(I)V

    .line 19
    :cond_7
    :goto_1
    iget-wide v1, p0, Lc/a/a/a/f2/n0/b;->f:J

    const-wide/16 v3, -0x1

    const/4 p2, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_8

    const/4 v1, 0x1

    goto :goto_2

    :cond_8
    const/4 v1, 0x0

    :goto_2
    invoke-static {v1}, Lc/a/a/a/m2/f;->f(Z)V

    .line 20
    iget-wide v1, p0, Lc/a/a/a/f2/n0/b;->f:J

    invoke-interface {p1}, Lc/a/a/a/f2/k;->q()J

    move-result-wide v3

    sub-long/2addr v1, v3

    .line 21
    iget-object v3, p0, Lc/a/a/a/f2/n0/b;->d:Lc/a/a/a/f2/n0/b$b;

    invoke-interface {v3, p1, v1, v2}, Lc/a/a/a/f2/n0/b$b;->c(Lc/a/a/a/f2/k;J)Z

    move-result p1

    if-eqz p1, :cond_9

    goto :goto_3

    :cond_9
    const/4 v0, 0x0

    :goto_3
    return v0
.end method
