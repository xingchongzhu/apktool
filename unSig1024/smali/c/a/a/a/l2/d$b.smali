.class public Lc/a/a/a/l2/d$b;
.super Ljava/lang/Object;
.source "AdaptiveTrackSelection.java"

# interfaces
.implements Lc/a/a/a/l2/h$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/l2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:F

.field private final e:F

.field private final f:Lc/a/a/a/m2/g;


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    sget-object v6, Lc/a/a/a/m2/g;->a:Lc/a/a/a/m2/g;

    const/16 v1, 0x2710

    const/16 v2, 0x61a8

    const/16 v3, 0x61a8

    const v4, 0x3f333333    # 0.7f

    const/high16 v5, 0x3f400000    # 0.75f

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lc/a/a/a/l2/d$b;-><init>(IIIFFLc/a/a/a/m2/g;)V

    return-void
.end method

.method public constructor <init>(IIIFFLc/a/a/a/m2/g;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lc/a/a/a/l2/d$b;->a:I

    .line 4
    iput p2, p0, Lc/a/a/a/l2/d$b;->b:I

    .line 5
    iput p3, p0, Lc/a/a/a/l2/d$b;->c:I

    .line 6
    iput p4, p0, Lc/a/a/a/l2/d$b;->d:F

    .line 7
    iput p5, p0, Lc/a/a/a/l2/d$b;->e:F

    .line 8
    iput-object p6, p0, Lc/a/a/a/l2/d$b;->f:Lc/a/a/a/m2/g;

    return-void
.end method


# virtual methods
.method public final a([Lc/a/a/a/l2/h$a;Lcom/google/android/exoplayer2/upstream/g;Lc/a/a/a/j2/d0$a;Lc/a/a/a/x1;)[Lc/a/a/a/l2/h;
    .locals 7

    .line 1
    invoke-static {p1}, Lc/a/a/a/l2/d;->w([Lc/a/a/a/l2/h$a;)Lc/a/b/b/r;

    move-result-object p3

    .line 2
    array-length p4, p1

    new-array p4, p4, [Lc/a/a/a/l2/h;

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 3
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_3

    .line 4
    aget-object v2, p1, v1

    if-eqz v2, :cond_2

    .line 5
    iget-object v3, v2, Lc/a/a/a/l2/h$a;->b:[I

    array-length v4, v3

    if-nez v4, :cond_0

    goto :goto_2

    .line 6
    :cond_0
    array-length v4, v3

    const/4 v5, 0x1

    if-ne v4, v5, :cond_1

    .line 7
    new-instance v4, Lc/a/a/a/l2/i;

    iget-object v5, v2, Lc/a/a/a/l2/h$a;->a:Lc/a/a/a/j2/p0;

    aget v3, v3, v0

    iget v6, v2, Lc/a/a/a/l2/h$a;->c:I

    iget-object v2, v2, Lc/a/a/a/l2/h$a;->d:Ljava/lang/Object;

    invoke-direct {v4, v5, v3, v6, v2}, Lc/a/a/a/l2/i;-><init>(Lc/a/a/a/j2/p0;IILjava/lang/Object;)V

    goto :goto_1

    .line 8
    :cond_1
    iget-object v2, v2, Lc/a/a/a/l2/h$a;->a:Lc/a/a/a/j2/p0;

    .line 9
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc/a/b/b/r;

    .line 10
    invoke-virtual {p0, v2, p2, v3, v4}, Lc/a/a/a/l2/d$b;->b(Lc/a/a/a/j2/p0;Lcom/google/android/exoplayer2/upstream/g;[ILc/a/b/b/r;)Lc/a/a/a/l2/d;

    move-result-object v4

    :goto_1
    aput-object v4, p4, v1

    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-object p4
.end method

.method protected b(Lc/a/a/a/j2/p0;Lcom/google/android/exoplayer2/upstream/g;[ILc/a/b/b/r;)Lc/a/a/a/l2/d;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/j2/p0;",
            "Lcom/google/android/exoplayer2/upstream/g;",
            "[I",
            "Lc/a/b/b/r<",
            "Lc/a/a/a/l2/d$a;",
            ">;)",
            "Lc/a/a/a/l2/d;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 1
    new-instance v15, Lc/a/a/a/l2/d;

    iget v1, v0, Lc/a/a/a/l2/d$b;->a:I

    int-to-long v5, v1

    iget v1, v0, Lc/a/a/a/l2/d$b;->b:I

    int-to-long v7, v1

    iget v1, v0, Lc/a/a/a/l2/d$b;->c:I

    int-to-long v9, v1

    iget v11, v0, Lc/a/a/a/l2/d$b;->d:F

    iget v12, v0, Lc/a/a/a/l2/d$b;->e:F

    iget-object v14, v0, Lc/a/a/a/l2/d$b;->f:Lc/a/a/a/m2/g;

    move-object v1, v15

    move-object/from16 v2, p1

    move-object/from16 v3, p3

    move-object/from16 v4, p2

    move-object/from16 v13, p4

    invoke-direct/range {v1 .. v14}, Lc/a/a/a/l2/d;-><init>(Lc/a/a/a/j2/p0;[ILcom/google/android/exoplayer2/upstream/g;JJJFFLjava/util/List;Lc/a/a/a/m2/g;)V

    return-object v15
.end method
