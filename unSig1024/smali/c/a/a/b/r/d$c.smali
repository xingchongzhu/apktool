.class public Lc/a/a/b/r/d$c;
.super Landroid/util/Property;
.source "CircularRevealWidget.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/b/r/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/Property<",
        "Lc/a/a/b/r/d;",
        "Lc/a/a/b/r/d$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Lc/a/a/b/r/d;",
            "Lc/a/a/b/r/d$e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lc/a/a/b/r/d$c;

    const-string v1, "circularReveal"

    invoke-direct {v0, v1}, Lc/a/a/b/r/d$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lc/a/a/b/r/d$c;->a:Landroid/util/Property;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-class v0, Lc/a/a/b/r/d$e;

    invoke-direct {p0, v0, p1}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/b/r/d;)Lc/a/a/b/r/d$e;
    .locals 0

    .line 1
    invoke-interface {p1}, Lc/a/a/b/r/d;->getRevealInfo()Lc/a/a/b/r/d$e;

    move-result-object p1

    return-object p1
.end method

.method public b(Lc/a/a/b/r/d;Lc/a/a/b/r/d$e;)V
    .locals 0

    .line 1
    invoke-interface {p1, p2}, Lc/a/a/b/r/d;->setRevealInfo(Lc/a/a/b/r/d$e;)V

    return-void
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lc/a/a/b/r/d;

    invoke-virtual {p0, p1}, Lc/a/a/b/r/d$c;->a(Lc/a/a/b/r/d;)Lc/a/a/b/r/d$e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lc/a/a/b/r/d;

    check-cast p2, Lc/a/a/b/r/d$e;

    invoke-virtual {p0, p1, p2}, Lc/a/a/b/r/d$c;->b(Lc/a/a/b/r/d;Lc/a/a/b/r/d$e;)V

    return-void
.end method
