.class final Lc/a/b/a/b$d;
.super Lc/a/b/a/b$c;
.source "CharMatcher.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# static fields
.field static final b:Lc/a/b/a/b$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc/a/b/a/b$d;

    invoke-direct {v0}, Lc/a/b/a/b$d;-><init>()V

    sput-object v0, Lc/a/b/a/b$d;->b:Lc/a/b/a/b$d;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const-string v0, "CharMatcher.none()"

    .line 1
    invoke-direct {p0, v0}, Lc/a/b/a/b$c;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/CharSequence;I)I
    .locals 0

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    .line 2
    invoke-static {p2, p1}, Lc/a/b/a/g;->k(II)I

    const/4 p1, -0x1

    return p1
.end method

.method public e(C)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
