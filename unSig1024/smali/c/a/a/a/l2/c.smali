.class public final synthetic Lc/a/a/a/l2/c;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic a:Lc/a/a/a/l2/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lc/a/a/a/l2/c;

    invoke-direct {v0}, Lc/a/a/a/l2/c;-><init>()V

    sput-object v0, Lc/a/a/a/l2/c;->a:Lc/a/a/a/l2/c;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Integer;

    invoke-static {p1, p2}, Lc/a/a/a/l2/f;->u(Ljava/lang/Integer;Ljava/lang/Integer;)I

    move-result p1

    return p1
.end method
