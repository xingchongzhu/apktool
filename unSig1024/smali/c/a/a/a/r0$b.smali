.class final Lc/a/a/a/r0$b;
.super Ljava/lang/Object;
.source "ExoPlayerImplInternal.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/r0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/a/f1$c;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lc/a/a/a/j2/n0;

.field private final c:I

.field private final d:J


# direct methods
.method private constructor <init>(Ljava/util/List;Lc/a/a/a/j2/n0;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/a/a/a/f1$c;",
            ">;",
            "Lc/a/a/a/j2/n0;",
            "IJ)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lc/a/a/a/r0$b;->a:Ljava/util/List;

    .line 4
    iput-object p2, p0, Lc/a/a/a/r0$b;->b:Lc/a/a/a/j2/n0;

    .line 5
    iput p3, p0, Lc/a/a/a/r0$b;->c:I

    .line 6
    iput-wide p4, p0, Lc/a/a/a/r0$b;->d:J

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/List;Lc/a/a/a/j2/n0;IJLc/a/a/a/r0$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lc/a/a/a/r0$b;-><init>(Ljava/util/List;Lc/a/a/a/j2/n0;IJ)V

    return-void
.end method

.method static synthetic a(Lc/a/a/a/r0$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/r0$b;->c:I

    return p0
.end method

.method static synthetic b(Lc/a/a/a/r0$b;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/r0$b;->a:Ljava/util/List;

    return-object p0
.end method

.method static synthetic c(Lc/a/a/a/r0$b;)Lc/a/a/a/j2/n0;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/r0$b;->b:Lc/a/a/a/j2/n0;

    return-object p0
.end method

.method static synthetic d(Lc/a/a/a/r0$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/r0$b;->d:J

    return-wide v0
.end method
