.class Lc/a/a/a/k2/v/h$b;
.super Ljava/lang/Object;
.source "WebvttCueParser.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/k2/v/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field private static final a:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lc/a/a/a/k2/v/h$b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lc/a/a/a/k2/v/h$c;

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lc/a/a/a/k2/v/a;->a:Lc/a/a/a/k2/v/a;

    sput-object v0, Lc/a/a/a/k2/v/h$b;->a:Ljava/util/Comparator;

    return-void
.end method

.method private constructor <init>(Lc/a/a/a/k2/v/h$c;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lc/a/a/a/k2/v/h$b;->b:Lc/a/a/a/k2/v/h$c;

    .line 4
    iput p2, p0, Lc/a/a/a/k2/v/h$b;->c:I

    return-void
.end method

.method synthetic constructor <init>(Lc/a/a/a/k2/v/h$c;ILc/a/a/a/k2/v/h$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/a/a/a/k2/v/h$b;-><init>(Lc/a/a/a/k2/v/h$c;I)V

    return-void
.end method

.method static synthetic a()Ljava/util/Comparator;
    .locals 1

    .line 1
    sget-object v0, Lc/a/a/a/k2/v/h$b;->a:Ljava/util/Comparator;

    return-object v0
.end method

.method static synthetic b(Lc/a/a/a/k2/v/h$b;)Lc/a/a/a/k2/v/h$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/k2/v/h$b;->b:Lc/a/a/a/k2/v/h$c;

    return-object p0
.end method

.method static synthetic c(Lc/a/a/a/k2/v/h$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/k2/v/h$b;->c:I

    return p0
.end method

.method static synthetic d(Lc/a/a/a/k2/v/h$b;Lc/a/a/a/k2/v/h$b;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/k2/v/h$b;->b:Lc/a/a/a/k2/v/h$c;

    iget p0, p0, Lc/a/a/a/k2/v/h$c;->b:I

    iget-object p1, p1, Lc/a/a/a/k2/v/h$b;->b:Lc/a/a/a/k2/v/h$c;

    iget p1, p1, Lc/a/a/a/k2/v/h$c;->b:I

    invoke-static {p0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p0

    return p0
.end method
