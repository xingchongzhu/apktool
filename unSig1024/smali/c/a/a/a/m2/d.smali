.class public final synthetic Lc/a/a/a/m2/d;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic a:Lc/a/a/a/m2/d;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lc/a/a/a/m2/d;

    invoke-direct {v0}, Lc/a/a/a/m2/d;-><init>()V

    sput-object v0, Lc/a/a/a/m2/d;->a:Lc/a/a/a/m2/d;

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

    check-cast p1, Lc/a/a/a/m2/e0$b;

    check-cast p2, Lc/a/a/a/m2/e0$b;

    invoke-static {p1, p2}, Lc/a/a/a/m2/e0;->f(Lc/a/a/a/m2/e0$b;Lc/a/a/a/m2/e0$b;)I

    move-result p1

    return p1
.end method
